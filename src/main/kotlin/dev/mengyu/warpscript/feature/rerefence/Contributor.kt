package dev.mengyu.warpscript.feature.rerefence

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiNameIdentifierOwner

interface WarpScriptNamedElement : PsiNameIdentifierOwner

abstract class WarpScriptNamedElementImpl(node : ASTNode) : ASTWrapperPsiElement(node), WarpScriptNamedElement

object WarpScriptElementfactory{

}