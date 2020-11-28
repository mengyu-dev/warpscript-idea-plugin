// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dev.mengyu.psi.WarpScriptDoubleLiteralExpr;
import dev.mengyu.psi.WarpScriptLongLiteralExpr;
import dev.mengyu.psi.WarpScriptMacroCallExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WarpScriptMacroCallExprImpl extends ASTWrapperPsiElement implements WarpScriptMacroCallExpr {

  public WarpScriptMacroCallExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitMacroCallExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WarpScriptDoubleLiteralExpr getDoubleLiteralExpr() {
    return findChildByClass(WarpScriptDoubleLiteralExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptLongLiteralExpr getLongLiteralExpr() {
    return findChildByClass(WarpScriptLongLiteralExpr.class);
  }

}
