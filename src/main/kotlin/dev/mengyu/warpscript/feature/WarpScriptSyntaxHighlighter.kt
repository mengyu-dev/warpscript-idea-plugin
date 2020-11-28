package dev.mengyu.warpscript.feature

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import dev.mengyu.warpscript.psi.WarpScriptLexerAdapter
import dev.mengyu.warpscript.psi.WarpScriptTypes

class WarpScriptSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return WarpScriptLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            WarpScriptTypes.NATIVE_FUNC -> NATIVE_CALL

            WarpScriptTypes.EXT_FUNC -> pack(
                DefaultLanguageHighlighterColors.FUNCTION_CALL,
                DefaultLanguageHighlighterColors.CLASS_REFERENCE
            )

            WarpScriptTypes.MACRO_ID -> pack(
                DefaultLanguageHighlighterColors.FUNCTION_CALL,
                DefaultLanguageHighlighterColors.CLASS_REFERENCE
            )

            WarpScriptTypes.VARIABLE_VALUE_EXPR -> pack(
                DefaultLanguageHighlighterColors.GLOBAL_VARIABLE
            )

            WarpScriptTypes.STRING, WarpScriptTypes.MSTRING -> pack(DefaultLanguageHighlighterColors.STRING)

            WarpScriptTypes.LONG,
            WarpScriptTypes.HEX,
            WarpScriptTypes.BIT,
            WarpScriptTypes.DOUBLE,
            WarpScriptTypes.SDOUBLE -> NUMBER

            WarpScriptTypes.T, WarpScriptTypes.F, WarpScriptTypes.TRUE, WarpScriptTypes.FALSE -> BOOL
            WarpScriptTypes.NULL -> NULL

            WarpScriptTypes.LCOMMENT -> pack(DefaultLanguageHighlighterColors.LINE_COMMENT)
            WarpScriptTypes.BCOMMENT -> pack(DefaultLanguageHighlighterColors.BLOCK_COMMENT)

            TokenType.BAD_CHARACTER -> pack(HighlighterColors.BAD_CHARACTER)
            else -> arrayOf()
        }
    }

    companion object {
        val BOOL = arrayOf(createTextAttributesKey("WS_BOOL", DefaultLanguageHighlighterColors.CONSTANT))
        val NULL = arrayOf(createTextAttributesKey("WS_NULL", DefaultLanguageHighlighterColors.CONSTANT))
        val NUMBER = arrayOf(createTextAttributesKey("WS_NUMBER", DefaultLanguageHighlighterColors.NUMBER))
        val NATIVE_CALL = arrayOf(
            createTextAttributesKey("WS_CALL", DefaultLanguageHighlighterColors.FUNCTION_CALL),
            createTextAttributesKey("WS_NATIVE_FUNCTION", DefaultLanguageHighlighterColors.KEYWORD)
        )
    }
}

class WarpScriptHighlighterFactory : SyntaxHighlighterFactory() {

    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?) = WarpScriptSyntaxHighlighter()
}