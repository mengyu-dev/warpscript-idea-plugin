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

public class WarpScriptOneValueExprImpl extends ASTWrapperPsiElement implements WarpScriptOneValueExpr {

  public WarpScriptOneValueExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitOneValueExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WarpScriptExtensionCallExpr getExtensionCallExpr() {
    return findChildByClass(WarpScriptExtensionCallExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptMacroCallExpr getMacroCallExpr() {
    return findChildByClass(WarpScriptMacroCallExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptNativeFuncCallExpr getNativeFuncCallExpr() {
    return findChildByClass(WarpScriptNativeFuncCallExpr.class);
  }

  @Override
  @NotNull
  public WarpScriptProcExpr getProcExpr() {
    return findNotNullChildByClass(WarpScriptProcExpr.class);
  }

}
