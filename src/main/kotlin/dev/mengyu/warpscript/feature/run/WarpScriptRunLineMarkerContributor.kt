package dev.mengyu.warpscript.feature.run

import com.intellij.execution.lineMarker.ExecutorAction
import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import dev.mengyu.psi.WarpScriptExpr

class WarpScriptRunLineMarkerContributor : RunLineMarkerContributor() {

    override fun getInfo(element: PsiElement): Info? {
        return when (element) {
            // the docs say to only run a line marker for a leaf
            is WarpScriptExpr -> {

                Info(
                    AllIcons.RunConfigurations.TestState.Run,
                    { "Run Script" },
                    *ExecutorAction.getActions(1)
                )
            }
            else -> null
        }
    }
}