package dev.mengyu.warpscript.psi

import com.intellij.lexer.FlexAdapter
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import dev.mengyu.warpscript.grammar._WarpScriptLexer
import dev.mengyu.warpscript.psi.impl.WarpScriptPsiImplUtil

class WarpScriptLexerAdapter : FlexAdapter(_WarpScriptLexer(null)) {
    private var lastTokenType: IElementType? = null
    private var currentTokenType: IElementType? = null

    override fun getTokenType(): IElementType? {
        lastTokenType = currentTokenType
        currentTokenType = super.getTokenType()
        return inspectType(currentTokenType)
    }

    private fun inspectType(et: IElementType?): IElementType? {
        if (et == WarpScriptTypes.ID) {
            if (isNativeFunction()) {
                return WarpScriptTypes.NATIVE_FUNC
            }
            return when (lastTokenType) {
                TokenType.WHITE_SPACE -> WarpScriptTypes.EXT_FUNC
                WarpScriptTypes.VAR_PREFIX -> WarpScriptTypes.VAR_ID
                WarpScriptTypes.MACRO_PREFIX -> WarpScriptTypes.MACRO_ID
                else -> et
            }
        }
        return et
    }

    private fun isNativeFunction(): Boolean {
        val token = bufferSequence.subSequence(tokenStart, tokenEnd).toString()
        return WarpScriptPsiImplUtil.isNative(token)
    }
}