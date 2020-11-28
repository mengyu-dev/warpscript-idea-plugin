package dev.mengyu.warpscript.feature

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import dev.mengyu.psi.WarpScriptMacroValueExpr
import dev.mengyu.warpscript.WarpScriptFile
import dev.mengyu.warpscript.psi.WarpScriptTypes
import dev.mengyu.warpscript.psi.WarpScriptUtil


class WarpScriptCompletionContributor : CompletionContributor() {

    init {
        extend(
            CompletionType.BASIC, PlatformPatterns.psiElement(WarpScriptTypes.VAR_ID),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    WarpScriptUtil.findDeclarations(parameters.originalFile as WarpScriptFile)
                        .mapNotNull { it.string?.text?.removePrefix("'")?.removeSuffix("'") }
                        .map { LookupElementBuilder.create(it) }
                        .forEach { resultSet.addElement(it) }
                }
            }
        )

        extend(CompletionType.BASIC, PlatformPatterns.psiElement(WarpScriptTypes.MACRO_ID),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    WarpScriptUtil.findDeclarations(
                        parameters.originalFile as WarpScriptFile,
                        WarpScriptMacroValueExpr::class
                    )
                        .mapNotNull { it.string?.text?.removePrefix("'")?.removeSuffix("'") }
                        .map { LookupElementBuilder.create(it) }
                        .forEach { resultSet.addElement(it) }
                }
            }
        )
    }
}