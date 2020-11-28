// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dev.mengyu.psi.WarpScriptControlExpr;
import dev.mengyu.psi.WarpScriptIftControlExpr;
import dev.mengyu.psi.WarpScriptIfteControlExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WarpScriptControlExprImpl extends ASTWrapperPsiElement implements WarpScriptControlExpr {

  public WarpScriptControlExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitControlExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WarpScriptIftControlExpr getIftControlExpr() {
    return findChildByClass(WarpScriptIftControlExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptIfteControlExpr getIfteControlExpr() {
    return findChildByClass(WarpScriptIfteControlExpr.class);
  }

}
