package dev.mengyu.warpscript

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.lang.Language
import com.intellij.lexer.FlexAdapter
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.FileViewProvider
import javax.swing.Icon


object WarpScriptLanguage : Language("Warpscript") {

}

object WarpScriptFileType : LanguageFileType(WarpScriptLanguage){
    override fun getName() = "Warp Script File"

    override fun getDescription()= "Warp Script File"

    override fun getDefaultExtension()= "mc2"

    override fun getIcon()  = iconFile

    @JvmField
    val iconFile : Icon =  IconLoader.getIcon("/icons/warp10_icon.png")
}


class WarpScriptLexerAdapter : FlexAdapter(_WarpScriptLexer(null))


class WarpScriptFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, WarpScriptLanguage) {

    override fun getFileType(): FileType {
        return WarpScriptFileType
    }

    override fun toString(): String {
        return "Warp Script File"
    }
}