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

public class WarpScriptMapEntryExprImpl extends ASTWrapperPsiElement implements WarpScriptMapEntryExpr {

  public WarpScriptMapEntryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitMapEntryExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WarpScriptMapKeyExpr getMapKeyExpr() {
    return findNotNullChildByClass(WarpScriptMapKeyExpr.class);
  }

  @Override
  @NotNull
  public WarpScriptMapValueExpr getMapValueExpr() {
    return findNotNullChildByClass(WarpScriptMapValueExpr.class);
  }

}
