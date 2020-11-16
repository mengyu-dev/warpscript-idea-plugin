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

public class WarpScriptValueExprImpl extends ASTWrapperPsiElement implements WarpScriptValueExpr {

  public WarpScriptValueExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WarpScriptVisitor visitor) {
    visitor.visitValueExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WarpScriptVisitor) accept((WarpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WarpScriptBasicValueExpr getBasicValueExpr() {
    return findChildByClass(WarpScriptBasicValueExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptCollectionValueExpr getCollectionValueExpr() {
    return findChildByClass(WarpScriptCollectionValueExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptMacroValueExpr getMacroValueExpr() {
    return findChildByClass(WarpScriptMacroValueExpr.class);
  }

  @Override
  @Nullable
  public WarpScriptVariableValueExpr getVariableValueExpr() {
    return findChildByClass(WarpScriptVariableValueExpr.class);
  }

}
