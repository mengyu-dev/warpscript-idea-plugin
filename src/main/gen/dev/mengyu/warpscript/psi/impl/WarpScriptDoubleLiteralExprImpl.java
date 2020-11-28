// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import dev.mengyu.psi.WarpScriptDoubleLiteralExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static dev.mengyu.warpscript.psi.WarpScriptTypes.DOUBLE;
import static dev.mengyu.warpscript.psi.WarpScriptTypes.SDOUBLE;

public class WarpScriptDoubleLiteralExprImpl extends ASTWrapperPsiElement implements WarpScriptDoubleLiteralExpr {

  public WarpScriptDoubleLiteralExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitDoubleLiteralExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getDouble() {
    return findChildByType(DOUBLE);
  }

  @Override
  @Nullable
  public PsiElement getSdouble() {
    return findChildByType(SDOUBLE);
  }

}
