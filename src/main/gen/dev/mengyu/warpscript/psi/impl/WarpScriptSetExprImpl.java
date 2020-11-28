// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import dev.mengyu.psi.WarpScriptSetExpr;
import dev.mengyu.psi.WarpScriptSingleValueExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WarpScriptSetExprImpl extends ASTWrapperPsiElement implements WarpScriptSetExpr {

  public WarpScriptSetExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitSetExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WarpScriptSingleValueExpr> getSingleValueExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptSingleValueExpr.class);
  }

}
