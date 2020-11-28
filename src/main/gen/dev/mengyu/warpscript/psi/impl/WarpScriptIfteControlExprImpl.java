// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import dev.mengyu.psi.WarpScriptIfteControlExpr;
import dev.mengyu.psi.WarpScriptMacroCallExpr;
import dev.mengyu.psi.WarpScriptMacroValueExpr;
import dev.mengyu.psi.WarpScriptVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WarpScriptIfteControlExprImpl extends ASTWrapperPsiElement implements WarpScriptIfteControlExpr {

  public WarpScriptIfteControlExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitIfteControlExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WarpScriptMacroCallExpr> getMacroCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptMacroCallExpr.class);
  }

  @Override
  @NotNull
  public List<WarpScriptMacroValueExpr> getMacroValueExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptMacroValueExpr.class);
  }

}
