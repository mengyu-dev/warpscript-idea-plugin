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

public class WarpScriptLiteralExprImpl extends ASTWrapperPsiElement implements WarpScriptLiteralExpr {

  public WarpScriptLiteralExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitLiteralExpr(this);
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
  public WarpScriptLiteralDouble getLiteralDouble() {
    return findChildByClass(WarpScriptLiteralDouble.class);
  }

  @Override
  @Nullable
  public WarpScriptLiteralLong getLiteralLong() {
    return findChildByClass(WarpScriptLiteralLong.class);
  }

  @Override
  @Nullable
  public WarpScriptStringLiteralExpr getStringLiteralExpr() {
    return findChildByClass(WarpScriptStringLiteralExpr.class);
  }

}
