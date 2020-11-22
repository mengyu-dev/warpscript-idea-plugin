package dev.mengyu.warpscript.feature.run

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.process.ProcessOutputType
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import dev.mengyu.warpscript.psi.WarpScriptTypes
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException
import java.io.OutputStream


class WarpScriptRunState(
    environment: ExecutionEnvironment,
    private val warpScriptRunConfiguration: WarpScriptRunConfiguration
) : CommandLineState(
    environment
) {

    override fun startProcess(): ProcessHandler {
        val vf =
            VirtualFileManager.getInstance().findFileByUrl("file://${warpScriptRunConfiguration.getScriptPath()}")!!
        val psiFile = PsiManager.getInstance(environment.project).findFile(vf)!!
        val extraParameters = findParametersInComments(psiFile)
        return WarpScriptProcessHandler(
            extraParameters.endpoint.takeIf { it.isNotBlank() } ?: warpScriptRunConfiguration.getEndpoint(),
            String(vf.contentsToByteArray()),
            warpScriptRunConfiguration.logResponseHeadersOnError
        )
    }

    private fun findParametersInComments(psiFile: PsiFile): ExtraParameters {
        val it = psiFile.viewProvider.allFiles.iterator()
        val parameters = mutableMapOf<String, String>()

        while (it.hasNext()) {
            val root = it.next() as PsiFile
            root.accept(object : PsiRecursiveElementWalkingVisitor() {
                override fun visitComment(comment: PsiComment) {
                    if (comment.tokenType == WarpScriptTypes.LCOMMENT) {
                        ExtraParameters.extraParamsPattern.matchEntire(comment.text)?.run {
                            parameters[this.groupValues[1]] = this.groupValues[2]
                        }
                    }
                }
            })
        }
        return ExtraParameters(parameters)
    }
}

data class ExtraParameters(val endpoint: String) {
    constructor(parameters: Map<String, String>) : this(parameters.getOrDefault("endpoint", ""))

    companion object {
        val extraParamsPattern = Regex("//\\s*@(\\w*)\\s*(.*)$")
    }
}

class WarpScriptProcessHandler(url: String, script: String, logHeadersOnError: Boolean) : ProcessHandler() {
    var destroyed: Boolean = false
    var detached: Boolean = false

    var call: Call = WarpScriptClient.run(url, script, object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            if (!destroyed and !detached) {
                notifyProcessTerminated(0)
            }
        }

        override fun onResponse(call: Call, response: Response) {
            if (!destroyed and !detached) {
                if (response.code == 200) {
                    notifyTextAvailable(response.body!!.string().prettyJsonPrint(), ProcessOutputType.STDOUT)
                } else {
                    if (logHeadersOnError) {
                        notifyTextAvailable("Response Headers : ${response.headers}", ProcessOutputType.STDERR)
                    }
                    notifyTextAvailable("Http code : ${response.code}, ${response.message}", ProcessOutputType.STDERR)
                }
                notifyProcessTerminated(0)
            }
        }
    }).apply {
        startNotify()
    }

    override fun destroyProcessImpl() {
        this.call.cancel()
        notifyProcessTerminated(0)
    }

    override fun detachProcessImpl() {
        this.call.cancel()
        notifyProcessTerminated(0)
    }

    override fun detachIsDefault(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getProcessInput(): OutputStream? = null

}

private val gson: Gson = GsonBuilder().setPrettyPrinting().create()

fun String.prettyJsonPrint(): String {
    val jsonElement = JsonParser.parseString(this)
    return gson.toJson(jsonElement)
}

object WarpScriptClient {
    val client = OkHttpClient()

    fun run(url: String, script: String, responseCallback: Callback): Call {
        val body = script.toRequestBody("text/plain; charset=UTF-8".toMediaType())
        val request = Request.Builder()
            .url(url)
            .post(body)
            .build()

        return client.newCall(request).apply { this.enqueue(responseCallback) }
    }
}