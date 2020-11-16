// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.mengyu.warpscript.psi.WarpScriptTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.mengyu.psi.*;

public class WarpScriptBasicValueExprImpl extends ASTWrapperPsiElement implements WarpScriptBasicValueExpr {

  public WarpScriptBasicValueExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitBasicValueExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WarpScriptBoolLiteralExpr getBoolLiteralExpr() {
    return findChildByClass(WarpScriptBoolLiteralExpr.class);
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
  @Nullable
  public WarpScriptNullLiteralExpr getNullLiteralExpr() {
    return findChildByClass(WarpScriptNullLiteralExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptStringLiteralExpr getStringLiteralExpr() {
    return findChildByClass(WarpScriptStringLiteralExpr.class);
  }

}
