package dev.mengyu.warpscript.feature.run

import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.psi.PsiElement

class WarpScriptRunLineMarkerContributor : RunLineMarkerContributor() {

    override fun getInfo(element: PsiElement): Info? {
        return when (element) {
            // the docs say to only run a line marker for a leaf

            else -> null
        }
    }
}