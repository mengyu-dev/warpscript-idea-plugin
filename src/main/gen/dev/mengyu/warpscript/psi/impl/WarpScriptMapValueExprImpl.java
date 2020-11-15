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
  @Nullable
  public WarpScriptOneValueExpr getOneValueExpr() {
    return findChildByClass(WarpScriptOneValueExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptTypedExpr getTypedExpr() {
    return findChildByClass(WarpScriptTypedExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptVariableRefExpr getVariableRefExpr() {
    return findChildByClass(WarpScriptVariableRefExpr.class);
  }

}
