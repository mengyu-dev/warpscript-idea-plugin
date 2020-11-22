package dev.mengyu.warpscript.feature.run

import com.intellij.execution.configurations.RunConfigurationOptions

open class WarpScriptRunConfigurationOptions : RunConfigurationOptions() {
    private val warpScriptPath = string("").provideDelegate(this, "warpScriptPath")
    private val warp10Endpoint = string(endpoint).provideDelegate(this, "endpoint")
    private val httpHeaders = property(false).provideDelegate(this, "headers")
    private val compressor = property(false).provideDelegate(this, "compressor")

    fun getScriptPath() = warpScriptPath.getValue(this)

    fun setScriptPath(scriptPath: String) {
        warpScriptPath.setValue(this, scriptPath)
    }

    fun getEndpoint() = warp10Endpoint.getValue(this)!!

    fun setEndpoint(endpoint: String) {
        warp10Endpoint.setValue(this, endpoint)
    }

    fun getHttpHeadersLog() = httpHeaders.getValue(this)

    fun setHttpHeadersLog(log: Boolean) {
        httpHeaders.setValue(this, log)
    }

    fun getCompressor() = compressor.getValue(this)

    fun setCompressor(compress: Boolean) {
        compressor.setValue(this, compress)
    }

    companion object {
        const val endpoint = "http://localhost:8080/api/v0/exec"
    }
}