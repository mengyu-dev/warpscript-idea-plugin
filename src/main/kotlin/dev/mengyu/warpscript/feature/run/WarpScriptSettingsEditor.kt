package dev.mengyu.warpscript.feature.run

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.ComponentWithBrowseButton
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.openapi.ui.TextComponentAccessor
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import javax.swing.JCheckBox
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JTextField

class WarpScriptSettingsEditor : SettingsEditor<WarpScriptRunConfiguration>() {
    private lateinit var myPanel: JPanel
    private lateinit var scriptPath: LabeledComponent<TextFieldWithBrowseButton>
    private lateinit var endpoint: LabeledComponent<JTextField>
    private lateinit var httpHeaders: JCheckBox
    private lateinit var compressor: JCheckBox
    override fun resetEditorFrom(configuration: WarpScriptRunConfiguration) {
        scriptPath.component.text = configuration.getScriptPath() ?: ""
        endpoint.component.text = configuration.getScriptPath() ?: WarpScriptRunConfigurationOptions.endpoint
        httpHeaders.isSelected = false
        compressor.isSelected = false
    }

    @Throws(ConfigurationException::class)
    override fun applyEditorTo(configuration: WarpScriptRunConfiguration) {
        configuration.setScriptPath(scriptPath.component.text)
        configuration.setEndpoint(endpoint.component.text)
        configuration.setCompressor(compressor.isSelected)
        configuration.setHttpHeadersLog(httpHeaders.isSelected)
    }

    override fun createEditor(): JComponent {
        val fcd = FileChooserDescriptorFactory.createSingleFileDescriptor()
        fcd.isShowFileSystemRoots = true
        fcd.title = "Choose WarpScript file"
        fcd.description = "dmd.run.config.selectworkingdir.description"
        fcd.isHideIgnored = false

        scriptPath.component.addActionListener(
            ComponentWithBrowseButton.BrowseFolderActionListener(
                fcd.title, fcd.description,
                scriptPath.component, null, fcd, TextComponentAccessor.TEXT_FIELD_WHOLE_TEXT
            )
        )

        return myPanel
    }

    private fun createUIComponents() {
        scriptPath = LabeledComponent<TextFieldWithBrowseButton>()
        scriptPath.component = TextFieldWithBrowseButton()

        endpoint = LabeledComponent<JTextField>()
        endpoint.component = JTextField()
    }
}