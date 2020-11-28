package dev.mengyu.warpscript.feature.style

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.codeStyle.CodeStyleSettings
import dev.mengyu.warpscript.WarpScriptLanguage
import dev.mengyu.warpscript.psi.WarpScriptParserDefinition
import dev.mengyu.warpscript.psi.WarpScriptTypes


class WarpScriptFormattingModelBuilder : FormattingModelBuilder {

    override fun createModel(element: PsiElement, settings: CodeStyleSettings): FormattingModel {
        return FormattingModelProvider
            .createFormattingModelForPsiFile(
                element.containingFile,
                WarpScriptBlock(
                    element.node,
                    Wrap.createWrap(WrapType.NONE, false),
                    Alignment.createAlignment(),
                    createSpaceBuilder(settings)
                ),
                settings
            )
    }

    override fun getRangeAffectingIndent(file: PsiFile?, offset: Int, elementAtOffset: ASTNode): TextRange? {
        return null
    }
}

private fun createSpaceBuilder(settings: CodeStyleSettings): SpacingBuilder {
    return SpacingBuilder(settings, WarpScriptLanguage)
        .after(WarpScriptParserDefinition.leftPairTokens()).spaces(1)
        .before(WarpScriptParserDefinition.rightPairTokens()).spaces(1)
        .after(WarpScriptTypes.LBLOCK).lineBreakInCode()
        .before(WarpScriptTypes.RBLOCK).lineBreakInCode()
}
