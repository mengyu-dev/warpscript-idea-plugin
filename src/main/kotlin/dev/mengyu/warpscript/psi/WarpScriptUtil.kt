package dev.mengyu.warpscript.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import dev.mengyu.psi.WarpScriptStringLiteralExpr
import dev.mengyu.warpscript.WarpScriptFile
import dev.mengyu.warpscript.psi.WarpScriptTypes.NATIVE_FUNC
import kotlin.reflect.KClass

object WarpScriptUtil {


    fun findDeclarations(
        file: WarpScriptFile,
        type: KClass<out PsiElement>? = null
    ): List<WarpScriptStringLiteralExpr> {
        val declarations = mutableListOf<WarpScriptStringLiteralExpr>()
        file.accept(object : PsiRecursiveElementWalkingVisitor() {

            override fun visitElement(element: PsiElement) {
                super.visitElement(element)
                if (element is WarpScriptStringLiteralExpr) {
                    val next = PsiTreeUtil.skipWhitespacesForward(element)
                    val previous = PsiTreeUtil.skipWhitespacesBackward(element)
                    if (isStoreCall(next) && isType(previous, type))
                        declarations.add(element)
                }
            }

        })
        return declarations
    }

    fun isStoreCall(element: PsiElement?): Boolean {
        return if (element == null) false
        else element.elementType == NATIVE_FUNC && element.text == "STORE"

    }

    fun isType(element: PsiElement?, type: KClass<out PsiElement>?): Boolean {
        if (type == null) return true
        return element != null && type.isInstance(element)
    }
}
