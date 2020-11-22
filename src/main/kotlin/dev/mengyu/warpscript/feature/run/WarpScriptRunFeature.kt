package dev.mengyu.warpscript.feature.run

import com.intellij.execution.ExecutionException
import com.intellij.execution.Executor
import com.intellij.execution.actions.ConfigurationContext
import com.intellij.execution.actions.LazyRunConfigurationProducer
import com.intellij.execution.configurations.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.icons.AllIcons
import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.ComponentWithBrowseButton
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.util.Ref
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement
import dev.mengyu.warpscript.WarpScriptFileType
import javax.swing.Icon
import javax.swing.JComponent
import javax.swing.JPanel


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

    companion object {
        private const val FACTORY_NAME = "WarpScript configuration factory"
    }
}

class WarpScriptRunConfiguration constructor(project: Project, factory: ConfigurationFactory, name: String) :
    RunConfigurationBase<Any>(project, factory, name) {

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
        return WarpScriptSettingsEditor()
    }

    @Throws(RuntimeConfigurationException::class)
    override fun checkConfiguration() {
    }

    @Throws(ExecutionException::class)
    override fun getState(executor: Executor, executionEnvironment: ExecutionEnvironment): RunProfileState {
        return WarpScriptRunState(executionEnvironment)
    }
}

class WarpScriptSettingsEditor : SettingsEditor<WarpScriptRunConfiguration>() {
    private lateinit var myPanel: JPanel
    private lateinit var myMainClass: LabeledComponent<ComponentWithBrowseButton<*>>
    override fun resetEditorFrom(demoRunConfiguration: WarpScriptRunConfiguration) {}

    @Throws(ConfigurationException::class)
    override fun applyEditorTo(demoRunConfiguration: WarpScriptRunConfiguration) {
    }

    override fun createEditor(): JComponent {
        return myPanel
    }

    private fun createUIComponents() {
        myMainClass = LabeledComponent<ComponentWithBrowseButton<*>>()
        myMainClass.component = TextFieldWithBrowseButton()
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
        return true
    }

    private fun getWarpScripFileFromContext(context: ConfigurationContext): VirtualFile? {
        return context.psiLocation?.containingFile?.originalFile?.virtualFile?.takeIf { it.extension == WarpScriptFileType.defaultExtension }
    }

}