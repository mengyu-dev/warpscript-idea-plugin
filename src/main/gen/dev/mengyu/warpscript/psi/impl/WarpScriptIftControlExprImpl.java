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

public class WarpScriptIftControlExprImpl extends ASTWrapperPsiElement implements WarpScriptIftControlExpr {

  public WarpScriptIftControlExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitIftControlExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WarpScriptMacroExpr> getMacroExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptMacroExpr.class);
  }

  @Override
  @NotNull
  public List<WarpScriptMacroRefExpr> getMacroRefExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WarpScriptMacroRefExpr.class);
  }

}
