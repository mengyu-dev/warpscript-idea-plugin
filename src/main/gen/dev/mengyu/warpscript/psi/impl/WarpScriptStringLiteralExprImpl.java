// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import dev.mengyu.psi.WarpScriptStringLiteralExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static dev.mengyu.warpscript.psi.WarpScriptTypes.MSTRING;
import static dev.mengyu.warpscript.psi.WarpScriptTypes.STRING;

public class WarpScriptStringLiteralExprImpl extends ASTWrapperPsiElement implements WarpScriptStringLiteralExpr {

  public WarpScriptStringLiteralExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitStringLiteralExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getMstring() {
    return findChildByType(MSTRING);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
