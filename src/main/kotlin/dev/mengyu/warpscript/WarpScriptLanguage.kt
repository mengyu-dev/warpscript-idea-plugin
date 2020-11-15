package dev.mengyu.warpscript

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.lang.Language
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.FileViewProvider
import com.intellij.psi.tree.IElementType
import dev.mengyu.warpscript.psi.WarpScriptTypes
import javax.swing.Icon

import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.*
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.TokenType
import com.sun.jna.platform.win32.WinNT


object WarpScriptLanguage : Language("Warpscript") {

}

object WarpScriptFileType : LanguageFileType(WarpScriptLanguage) {
    override fun getName() = "Warp Script File"

    override fun getDescription() = "Warp Script File"

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

class WarpScriptSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return WarpScriptLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return if (tokenType == WarpScriptTypes.ID) {
            IDENTIFIER_KEYS
        } else if (tokenType == WarpScriptTypes.VARIABLE_REF_EXPR) {
            VARIABLE_KEYS
        } else if (tokenType == WarpScriptTypes.COMMENT) {
            COMMENT_KEYS
        } else if (tokenType == WarpScriptTypes.STRING) {
            STRING_KEYS
        } else if (tokenType == TokenType.BAD_CHARACTER) {
            BAD_CHAR_KEYS
        } else {
            EMPTY_KEYS
        }

    }

    companion object {
        val IDENTIFIER: TextAttributesKey =
            createTextAttributesKey("WS_FUN_ID", DefaultLanguageHighlighterColors.IDENTIFIER)

        val VARIABLE: TextAttributesKey =
            createTextAttributesKey("WS_VARIALE", DefaultLanguageHighlighterColors.LOCAL_VARIABLE)

        val NUMBER: TextAttributesKey =
            createTextAttributesKey("WS_FUN_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val STRING: TextAttributesKey =
            createTextAttributesKey("WS_FUN_STRING", DefaultLanguageHighlighterColors.STRING)
        val BOOL: TextAttributesKey = createTextAttributesKey("WS_FUN_BOOL", DefaultLanguageHighlighterColors.CONSTANT)
        val NATIVE_FUNCTION: TextAttributesKey =
            createTextAttributesKey("WS_NATIVE_FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_CALL)
        val MACRO: TextAttributesKey = createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT: TextAttributesKey =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER: TextAttributesKey =
            createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)

        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        private val VARIABLE_KEYS = arrayOf(VARIABLE)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val STRING_KEYS = arrayOf(STRING)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}

class WarpScriptHighlighterFactory : SyntaxHighlighterFactory() {

    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?) = WarpScriptSyntaxHighlighter()
}