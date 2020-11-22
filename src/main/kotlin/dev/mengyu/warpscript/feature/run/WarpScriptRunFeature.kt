package dev.mengyu.warpscript.feature.run

import com.intellij.execution.ExecutionException
import com.intellij.execution.Executor
import com.intellij.execution.actions.ConfigurationContext
import com.intellij.execution.actions.LazyRunConfigurationProducer
import com.intellij.execution.configurations.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.icons.AllIcons
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

    override fun getId() = "WarpScript Configuration Factory"

    companion object {
        private const val FACTORY_NAME = "WarpScript configuration factory"
    }
}

class WarpScriptRunConfiguration constructor(project: Project, factory: ConfigurationFactory, name: String) :
    LocatableConfigurationBase<Any>(project, factory, name) {
    var scriptPath: String? = null
    var endpoint: String = "http://localhost:8080/api/v0/exec"
    var httpHeaders: Boolean = false
    var bigRequestCompressed: Boolean = false

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
    private val warpScriptRunConfigurationType = WarpScriptRunConfigurationType()

    override fun getConfigurationFactory(): ConfigurationFactory {
        return warpScriptRunConfigurationType.configurationFactories[0]
    }

    override fun isConfigurationFromContext(
        configuration: WarpScriptRunConfiguration,
        context: ConfigurationContext
    ): Boolean {
        val wsFile = getWarpScripFileFromContext(context)
        return wsFile != null && configuration.name == wsFile.nameWithoutExtension
    }

    override fun setupConfigurationFromContext(
        configuration: WarpScriptRunConfiguration,
        context: ConfigurationContext,
        sourceElement: Ref<PsiElement>
    ): Boolean {
        val file = getWarpScripFileFromContext(context) ?: return false
        configuration.name = file.nameWithoutExtension
        configuration.scriptPath = file.path
        return true
    }

}

fun getWarpScripFileFromContext(context: ConfigurationContext): VirtualFile? {
    return context.psiLocation?.containingFile?.originalFile?.virtualFile?.takeIf { it.extension == WarpScriptFileType.defaultExtension }
}