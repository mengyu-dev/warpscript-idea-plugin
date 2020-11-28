// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import dev.mengyu.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WarpScriptMacroValueExprImpl extends ASTWrapperPsiElement implements WarpScriptMacroValueExpr {

  public WarpScriptMacroValueExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitMacroValueExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WarpScriptBoolLiteralExpr> getBoolLiteralExprList() {
      return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptBoolLiteralExpr.class);
  }

    @Override
    @NotNull
    public List<WarpScriptCollectionValueExpr> getCollectionValueExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptCollectionValueExpr.class);
    }

    @Override
    @NotNull
    public List<WarpScriptControlExpr> getControlExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptControlExpr.class);
    }

    @Override
    @NotNull
    public List<WarpScriptDoubleLiteralExpr> getDoubleLiteralExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptDoubleLiteralExpr.class);
    }

    @Override
    @NotNull
    public List<WarpScriptLongLiteralExpr> getLongLiteralExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptLongLiteralExpr.class);
    }

    @Override
    @NotNull
    public List<WarpScriptMacroCallExpr> getMacroCallExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptMacroCallExpr.class);
    }

    @Override
    @NotNull
    public List<WarpScriptMacroValueExpr> getMacroValueExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptMacroValueExpr.class);
    }

    @Override
    @NotNull
    public List<WarpScriptNullLiteralExpr> getNullLiteralExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptNullLiteralExpr.class);
    }

    @Override
    @NotNull
    public List<WarpScriptStringLiteralExpr> getStringLiteralExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptStringLiteralExpr.class);
    }

    @Override
    @NotNull
    public List<WarpScriptVariableValueExpr> getVariableValueExprList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptVariableValueExpr.class);
  }

}
