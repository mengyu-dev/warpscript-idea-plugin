package dev.mengyu.warpscript.feature.run

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.process.ProcessOutputType
import com.intellij.execution.runners.ExecutionEnvironment
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException
import java.io.OutputStream


class WarpScriptRunState(environment: ExecutionEnvironment) : CommandLineState(environment) {

    override fun startProcess(): ProcessHandler {

        return WarpScriptProcessHandler("http://localhost:8080/api/v0/exec", "AA")
    }

}

class WarpScriptProcessHandler(url: String, script: String) : ProcessHandler() {
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
                if (response.code == 200) notifyTextAvailable(response.body!!.string(), ProcessOutputType.STDOUT)
                else notifyTextAvailable("Http code : ${response.code}, ${response.message}", ProcessOutputType.STDERR)
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