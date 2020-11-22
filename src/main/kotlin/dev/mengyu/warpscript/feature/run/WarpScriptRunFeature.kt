package dev.mengyu.warpscript.feature.run

import com.intellij.execution.ExecutionException
import com.intellij.execution.Executor
import com.intellij.execution.actions.ConfigurationContext
import com.intellij.execution.actions.LazyRunConfigurationProducer
import com.intellij.execution.configurations.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.icons.AllIcons
import com.intellij.openapi.components.BaseState
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Ref
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement
import dev.mengyu.warpscript.WarpScriptFileType
import javax.swing.Icon


class WarpScriptRunConfigurationType : ConfigurationType {
    override fun getDisplayName() = "WarpScript"

    override fun getConfigurationTypeDescription() = "WarpScript Run Configuration Type"
    override fun getIcon(): Icon {
        return AllIcons.General.Information
    }

    override fun getId() = "WarpScript_RUN_CONFIGURATION"

    override fun getConfigurationFactories(): Array<ConfigurationFactory> {
        return arrayOf(WarpScriptConfigurationFactory(this))
    }

}

class WarpScriptConfigurationFactory constructor(type: ConfigurationType) : ConfigurationFactory(type) {

    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return WarpScriptRunConfiguration(project, this, "WarpScript")
    }

    override fun getName(): String {
        return FACTORY_NAME
    }

    override fun getOptionsClass(): Class<out BaseState> {
        return WarpScriptRunConfigurationOptions::class.java
    }

    override fun getId() = "WarpScript Configuration Factory"

    companion object {
        private const val FACTORY_NAME = "WarpScript configuration factory"
    }
}

class WarpScriptRunConfiguration constructor(project: Project, factory: ConfigurationFactory, name: String) :
    RunConfigurationBase<WarpScriptRunConfigurationOptions>(project, factory, name) {

    var logResponseHeadersOnError: Boolean = true

    override fun getOptions(): WarpScriptRunConfigurationOptions {
        return super.getOptions() as WarpScriptRunConfigurationOptions
    }

    fun getScriptPath() = options.getScriptPath()

    fun setScriptPath(scriptPath: String) {
        options.setScriptPath(scriptPath)
    }

    fun getEndpoint() = options.getEndpoint()

    fun setEndpoint(endpoint: String) {
        options.setEndpoint(endpoint)
    }

    fun getHttpHeadersLog() = options.getHttpHeadersLog()

    fun setHttpHeadersLog(log: Boolean) {
        options.setHttpHeadersLog(log)
    }

    fun getCompressor() = options.getCompressor()

    fun setCompressor(compress: Boolean) {
        options.setCompressor(compress)
    }


    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
        return WarpScriptSettingsEditor()
    }

    @Throws(RuntimeConfigurationException::class)
    override fun checkConfiguration() {
    }

    @Throws(ExecutionException::class)
    override fun getState(executor: Executor, executionEnvironment: ExecutionEnvironment): RunProfileState {
        return WarpScriptRunState(executionEnvironment, this)
    }
}


class WarpScriptRunConfigurationProducer : LazyRunConfigurationProducer<WarpScriptRunConfiguration>() {

    override fun getConfigurationFactory(): ConfigurationFactory {
        return WarpScriptConfigurationFactory(WarpScriptRunConfigurationType())
    }

    override fun isConfigurationFromContext(
        configuration: WarpScriptRunConfiguration,
        context: ConfigurationContext
    ) = getWarpScripFileFromContext(context) != null

    override fun setupConfigurationFromContext(
        configuration: WarpScriptRunConfiguration,
        context: ConfigurationContext,
        sourceElement: Ref<PsiElement>
    ): Boolean {
        val file = getWarpScripFileFromContext(context) ?: return false
        configuration.name = file.name
        configuration.setScriptPath(file.path)
        return true
    }

}

fun getWarpScripFileFromContext(context: ConfigurationContext): VirtualFile? {
    return context.psiLocation?.containingFile?.originalFile?.virtualFile?.takeIf { it.extension == WarpScriptFileType.defaultExtension }
}