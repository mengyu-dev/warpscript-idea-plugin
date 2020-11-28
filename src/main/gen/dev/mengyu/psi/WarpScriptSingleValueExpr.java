// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface WarpScriptSingleValueExpr extends PsiElement {

    @NotNull
    List<WarpScriptBoolLiteralExpr> getBoolLiteralExprList();

    @NotNull
    List<WarpScriptCollectionValueExpr> getCollectionValueExprList();

    @NotNull
    List<WarpScriptControlExpr> getControlExprList();

    @NotNull
    List<WarpScriptDoubleLiteralExpr> getDoubleLiteralExprList();

    @NotNull
    List<WarpScriptLongLiteralExpr> getLongLiteralExprList();

    @NotNull
    List<WarpScriptMacroCallExpr> getMacroCallExprList();

    @NotNull
    List<WarpScriptMacroValueExpr> getMacroValueExprList();

    @NotNull
    List<WarpScriptNullLiteralExpr> getNullLiteralExprList();

    @NotNull
    List<WarpScriptStringLiteralExpr> getStringLiteralExprList();

    @NotNull
    List<WarpScriptVariableValueExpr> getVariableValueExprList();

}
