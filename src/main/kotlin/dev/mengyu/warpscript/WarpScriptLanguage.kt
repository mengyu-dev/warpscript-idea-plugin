package dev.mengyu.warpscript

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.lang.Language
import com.intellij.lexer.FlexAdapter
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.FileViewProvider
import com.intellij.psi.TokenType.WHITE_SPACE
import com.intellij.psi.tree.IElementType
import dev.mengyu.warpscript.grammar._WarpScriptLexer
import dev.mengyu.warpscript.psi.WarpScriptTypes
import dev.mengyu.warpscript.psi.impl.WarpScriptPsiImplUtil
import javax.swing.Icon

object WarpScriptLanguage : Language("Warpscript")

object WarpScriptFileType : LanguageFileType(WarpScriptLanguage) {

    override fun getName() = "Warp Script File"

    override fun getDescription() = "Warp Script File"

    override fun getDefaultExtension() = "mc2"

    override fun getIcon() = iconFile

    @JvmField
    val iconFile: Icon = IconLoader.getIcon("/icons/warpscript_icon.png")
}

class WarpScriptFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, WarpScriptLanguage) {

    override fun getFileType() = WarpScriptFileType

    override fun toString() = "Warp Script File"
}