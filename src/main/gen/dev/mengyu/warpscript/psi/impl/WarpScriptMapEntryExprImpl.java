// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dev.mengyu.psi.WarpScriptMapEntryExpr;
import dev.mengyu.psi.WarpScriptMapKeyExpr;
import dev.mengyu.psi.WarpScriptMapValueExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;

public class WarpScriptMapEntryExprImpl extends ASTWrapperPsiElement implements WarpScriptMapEntryExpr {

  public WarpScriptMapEntryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitMapEntryExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WarpScriptMapKeyExpr getMapKeyExpr() {
    return findNotNullChildByClass(WarpScriptMapKeyExpr.class);
  }

  @Override
  @NotNull
  public WarpScriptMapValueExpr getMapValueExpr() {
    return findNotNullChildByClass(WarpScriptMapValueExpr.class);
  }

}
