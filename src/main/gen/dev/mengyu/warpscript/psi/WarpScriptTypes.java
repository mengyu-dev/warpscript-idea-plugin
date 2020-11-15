// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dev.mengyu.warpscript.psi.impl.*;

public interface WarpScriptTypes {

  IElementType BOOL_LITERAL_EXPR = new WarpScriptElementType("BOOL_LITERAL_EXPR");
  IElementType CONTROL_EXPR = new WarpScriptElementType("CONTROL_EXPR");
  IElementType FUNC_REF_EXPR = new WarpScriptElementType("FUNC_REF_EXPR");
  IElementType ID_EXPR = new WarpScriptElementType("ID_EXPR");
  IElementType IFTE_CONTROL_EXPR = new WarpScriptElementType("IFTE_CONTROL_EXPR");
  IElementType IFT_CONTROL_EXPR = new WarpScriptElementType("IFT_CONTROL_EXPR");
  IElementType LIST_EXPR = new WarpScriptElementType("LIST_EXPR");
  IElementType LITERAL_DOUBLE = new WarpScriptElementType("LITERAL_DOUBLE");
  IElementType LITERAL_EXPR = new WarpScriptElementType("LITERAL_EXPR");
  IElementType LITERAL_LONG = new WarpScriptElementType("LITERAL_LONG");
  IElementType MACRO_EXPR = new WarpScriptElementType("MACRO_EXPR");
  IElementType MACRO_REF_EXPR = new WarpScriptElementType("MACRO_REF_EXPR");
  IElementType MAP_ENTRY_EXPR = new WarpScriptElementType("MAP_ENTRY_EXPR");
  IElementType MAP_EXPR = new WarpScriptElementType("MAP_EXPR");
  IElementType MAP_KEY_EXPR = new WarpScriptElementType("MAP_KEY_EXPR");
  IElementType MAP_VALUE_EXPR = new WarpScriptElementType("MAP_VALUE_EXPR");
  IElementType ONE_VALUE_EXPR = new WarpScriptElementType("ONE_VALUE_EXPR");
  IElementType PROC_EXPR = new WarpScriptElementType("PROC_EXPR");
  IElementType REF_EXPR = new WarpScriptElementType("REF_EXPR");
  IElementType SET_EXPR = new WarpScriptElementType("SET_EXPR");
  IElementType STRING_LITERAL_EXPR = new WarpScriptElementType("STRING_LITERAL_EXPR");
  IElementType TYPED_EXPR = new WarpScriptElementType("TYPED_EXPR");
  IElementType VARIABLE_REF_EXPR = new WarpScriptElementType("VARIABLE_REF_EXPR");

  IElementType BIT = new WarpScriptTokenType("0b[01]+");
  IElementType COMMENT = new WarpScriptTokenType("comment");
  IElementType DOUBLE = new WarpScriptTokenType("double");
  IElementType F = new WarpScriptTokenType("F");
  IElementType FALSE = new WarpScriptTokenType("false");
  IElementType HEX = new WarpScriptTokenType("hex");
  IElementType ID = new WarpScriptTokenType("id");
  IElementType IFT = new WarpScriptTokenType("IFT");
  IElementType IFTE = new WarpScriptTokenType("IFTE");
  IElementType LBLOCK = new WarpScriptTokenType("<%");
  IElementType LBRACE = new WarpScriptTokenType("{");
  IElementType LBRACK = new WarpScriptTokenType("[");
  IElementType LONG = new WarpScriptTokenType("long");
  IElementType LPAREN = new WarpScriptTokenType("(");
  IElementType MACRO_PREFIX = new WarpScriptTokenType("@");
  IElementType MULSTRING = new WarpScriptTokenType("mulstring");
  IElementType NULL = new WarpScriptTokenType("NULL");
  IElementType RBLOCK = new WarpScriptTokenType("%>");
  IElementType RBRACE = new WarpScriptTokenType("}");
  IElementType RBRACK = new WarpScriptTokenType("]");
  IElementType RPAREN = new WarpScriptTokenType(")");
  IElementType SDOULE = new WarpScriptTokenType("sdoule");
  IElementType STRING = new WarpScriptTokenType("string");
  IElementType T = new WarpScriptTokenType("T");
  IElementType TRUE = new WarpScriptTokenType("true");
  IElementType VAR_PREFIX = new WarpScriptTokenType("VAR_PREFIX");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BOOL_LITERAL_EXPR) {
        return new WarpScriptBoolLiteralExprImpl(node);
      }
      else if (type == CONTROL_EXPR) {
        return new WarpScriptControlExprImpl(node);
      }
      else if (type == FUNC_REF_EXPR) {
        return new WarpScriptFuncRefExprImpl(node);
      }
      else if (type == ID_EXPR) {
        return new WarpScriptIdExprImpl(node);
      }
      else if (type == IFTE_CONTROL_EXPR) {
        return new WarpScriptIfteControlExprImpl(node);
      }
      else if (type == IFT_CONTROL_EXPR) {
        return new WarpScriptIftControlExprImpl(node);
      }
      else if (type == LIST_EXPR) {
        return new WarpScriptListExprImpl(node);
      }
      else if (type == LITERAL_DOUBLE) {
        return new WarpScriptLiteralDoubleImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new WarpScriptLiteralExprImpl(node);
      }
      else if (type == LITERAL_LONG) {
        return new WarpScriptLiteralLongImpl(node);
      }
      else if (type == MACRO_EXPR) {
        return new WarpScriptMacroExprImpl(node);
      }
      else if (type == MACRO_REF_EXPR) {
        return new WarpScriptMacroRefExprImpl(node);
      }
      else if (type == MAP_ENTRY_EXPR) {
        return new WarpScriptMapEntryExprImpl(node);
      }
      else if (type == MAP_EXPR) {
        return new WarpScriptMapExprImpl(node);
      }
      else if (type == MAP_KEY_EXPR) {
        return new WarpScriptMapKeyExprImpl(node);
      }
      else if (type == MAP_VALUE_EXPR) {
        return new WarpScriptMapValueExprImpl(node);
      }
      else if (type == ONE_VALUE_EXPR) {
        return new WarpScriptOneValueExprImpl(node);
      }
      else if (type == PROC_EXPR) {
        return new WarpScriptProcExprImpl(node);
      }
      else if (type == REF_EXPR) {
        return new WarpScriptRefExprImpl(node);
      }
      else if (type == SET_EXPR) {
        return new WarpScriptSetExprImpl(node);
      }
      else if (type == STRING_LITERAL_EXPR) {
        return new WarpScriptStringLiteralExprImpl(node);
      }
      else if (type == TYPED_EXPR) {
        return new WarpScriptTypedExprImpl(node);
      }
      else if (type == VARIABLE_REF_EXPR) {
        return new WarpScriptVariableRefExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
