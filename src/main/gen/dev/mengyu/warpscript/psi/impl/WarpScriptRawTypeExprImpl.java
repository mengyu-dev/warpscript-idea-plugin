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

public class WarpScriptRawTypeExprImpl extends ASTWrapperPsiElement implements WarpScriptRawTypeExpr {

  public WarpScriptRawTypeExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitRawTypeExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WarpScriptListExpr getListExpr() {
    return findChildByClass(WarpScriptListExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptLiteralExpr getLiteralExpr() {
    return findChildByClass(WarpScriptLiteralExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptMacroExpr getMacroExpr() {
    return findChildByClass(WarpScriptMacroExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptMapExpr getMapExpr() {
    return findChildByClass(WarpScriptMapExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptSetExpr getSetExpr() {
    return findChildByClass(WarpScriptSetExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptVariableRefExpr getVariableRefExpr() {
    return findChildByClass(WarpScriptVariableRefExpr.class);
  }

}
