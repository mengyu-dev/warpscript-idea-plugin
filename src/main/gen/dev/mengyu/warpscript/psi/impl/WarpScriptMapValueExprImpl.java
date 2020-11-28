// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dev.mengyu.psi.WarpScriptMapValueExpr;
import dev.mengyu.psi.WarpScriptSingleValueExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;

public class WarpScriptMapValueExprImpl extends ASTWrapperPsiElement implements WarpScriptMapValueExpr {

  public WarpScriptMapValueExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitMapValueExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WarpScriptSingleValueExpr getSingleValueExpr() {
    return findNotNullChildByClass(WarpScriptSingleValueExpr.class);
  }

}
