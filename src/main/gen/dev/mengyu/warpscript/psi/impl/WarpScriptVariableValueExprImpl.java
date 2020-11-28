// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import dev.mengyu.psi.WarpScriptDoubleLiteralExpr;
import dev.mengyu.psi.WarpScriptLongLiteralExpr;
import dev.mengyu.psi.WarpScriptVariableValueExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static dev.mengyu.warpscript.psi.WarpScriptTypes.VAR_PREFIX;

public class WarpScriptVariableValueExprImpl extends ASTWrapperPsiElement implements WarpScriptVariableValueExpr {

  public WarpScriptVariableValueExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitVariableValueExpr(this);
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

  @Override
  @NotNull
  public PsiElement getVarPrefix() {
    return findNotNullChildByType(VAR_PREFIX);
  }

}
