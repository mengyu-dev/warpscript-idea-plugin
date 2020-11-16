// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dev.mengyu.warpscript.psi.impl.*;

public interface WarpScriptTypes {

  IElementType BASIC_VALUE_EXPR = new WarpScriptElementType("BASIC_VALUE_EXPR");
  IElementType BOOL_LITERAL_EXPR = new WarpScriptElementType("BOOL_LITERAL_EXPR");
  IElementType CALL_EXPR = new WarpScriptElementType("CALL_EXPR");
  IElementType COLLECTION_VALUE_EXPR = new WarpScriptElementType("COLLECTION_VALUE_EXPR");
  IElementType CONTROL_EXPR = new WarpScriptElementType("CONTROL_EXPR");
  IElementType DOUBLE_LITERAL_EXPR = new WarpScriptElementType("DOUBLE_LITERAL_EXPR");
  IElementType EXPR = new WarpScriptElementType("EXPR");
  IElementType EXTENSION_FUNC_CALL_EXPR = new WarpScriptElementType("EXTENSION_FUNC_CALL_EXPR");
  IElementType FUNC_CALL_EXPR = new WarpScriptElementType("FUNC_CALL_EXPR");
  IElementType IFTE_CONTROL_EXPR = new WarpScriptElementType("IFTE_CONTROL_EXPR");
  IElementType IFT_CONTROL_EXPR = new WarpScriptElementType("IFT_CONTROL_EXPR");
  IElementType LIST_EXPR = new WarpScriptElementType("LIST_EXPR");
  IElementType LONG_LITERAL_EXPR = new WarpScriptElementType("LONG_LITERAL_EXPR");
  IElementType MACRO_CALL_EXPR = new WarpScriptElementType("MACRO_CALL_EXPR");
  IElementType MACRO_VALUE_EXPR = new WarpScriptElementType("MACRO_VALUE_EXPR");
  IElementType MAP_ENTRY_EXPR = new WarpScriptElementType("MAP_ENTRY_EXPR");
  IElementType MAP_EXPR = new WarpScriptElementType("MAP_EXPR");
  IElementType MAP_KEY_EXPR = new WarpScriptElementType("MAP_KEY_EXPR");
  IElementType MAP_VALUE_EXPR = new WarpScriptElementType("MAP_VALUE_EXPR");
  IElementType NATIVE_FUNC_CALL_EXPR = new WarpScriptElementType("NATIVE_FUNC_CALL_EXPR");
  IElementType NULL_LITERAL_EXPR = new WarpScriptElementType("NULL_LITERAL_EXPR");
  IElementType SET_EXPR = new WarpScriptElementType("SET_EXPR");
  IElementType SINGLE_VALUE_EXPR = new WarpScriptElementType("SINGLE_VALUE_EXPR");
  IElementType STRING_LITERAL_EXPR = new WarpScriptElementType("STRING_LITERAL_EXPR");
  IElementType VALUE_EXPR = new WarpScriptElementType("VALUE_EXPR");
  IElementType VARIABLE_VALUE_EXPR = new WarpScriptElementType("VARIABLE_VALUE_EXPR");

  IElementType BCOMMENT = new WarpScriptTokenType("BCOMMENT");
  IElementType BIT = new WarpScriptTokenType("0b[01]+");
  IElementType DOUBLE = new WarpScriptTokenType("DOUBLE");
  IElementType EXT_FUNC = new WarpScriptTokenType("EXT_FUNC");
  IElementType F = new WarpScriptTokenType("F");
  IElementType FALSE = new WarpScriptTokenType("false");
  IElementType HEX = new WarpScriptTokenType("HEX");
  IElementType ID = new WarpScriptTokenType("ID");
  IElementType IFT = new WarpScriptTokenType("IFT");
  IElementType IFTE = new WarpScriptTokenType("IFTE");
  IElementType LBLOCK = new WarpScriptTokenType("<%");
  IElementType LBRACE = new WarpScriptTokenType("{");
  IElementType LBRACK = new WarpScriptTokenType("[");
  IElementType LCOMMENT = new WarpScriptTokenType("LCOMMENT");
  IElementType LONG = new WarpScriptTokenType("LONG");
  IElementType LPAREN = new WarpScriptTokenType("(");
  IElementType MACRO_ID = new WarpScriptTokenType("MACRO_ID");
  IElementType MACRO_PREFIX = new WarpScriptTokenType("@");
  IElementType MSTRING = new WarpScriptTokenType("MSTRING");
  IElementType NATIVE_FUNC = new WarpScriptTokenType("NATIVE_FUNC");
  IElementType NULL = new WarpScriptTokenType("NULL");
  IElementType RBLOCK = new WarpScriptTokenType("%>");
  IElementType RBRACE = new WarpScriptTokenType("}");
  IElementType RBRACK = new WarpScriptTokenType("]");
  IElementType RPAREN = new WarpScriptTokenType(")");
  IElementType SDOUBLE = new WarpScriptTokenType("SDOUBLE");
  IElementType STRING = new WarpScriptTokenType("STRING");
  IElementType T = new WarpScriptTokenType("T");
  IElementType TRUE = new WarpScriptTokenType("true");
  IElementType VAR_ID = new WarpScriptTokenType("VAR_ID");
  IElementType VAR_PREFIX = new WarpScriptTokenType("VAR_PREFIX");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BASIC_VALUE_EXPR) {
        return new WarpScriptBasicValueExprImpl(node);
      }
      else if (type == BOOL_LITERAL_EXPR) {
        return new WarpScriptBoolLiteralExprImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new WarpScriptCallExprImpl(node);
      }
      else if (type == COLLECTION_VALUE_EXPR) {
        return new WarpScriptCollectionValueExprImpl(node);
      }
      else if (type == CONTROL_EXPR) {
        return new WarpScriptControlExprImpl(node);
      }
      else if (type == DOUBLE_LITERAL_EXPR) {
        return new WarpScriptDoubleLiteralExprImpl(node);
      }
      else if (type == EXPR) {
        return new WarpScriptExprImpl(node);
      }
      else if (type == EXTENSION_FUNC_CALL_EXPR) {
        return new WarpScriptExtensionFuncCallExprImpl(node);
      }
      else if (type == FUNC_CALL_EXPR) {
        return new WarpScriptFuncCallExprImpl(node);
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
      else if (type == LONG_LITERAL_EXPR) {
        return new WarpScriptLongLiteralExprImpl(node);
      }
      else if (type == MACRO_CALL_EXPR) {
        return new WarpScriptMacroCallExprImpl(node);
      }
      else if (type == MACRO_VALUE_EXPR) {
        return new WarpScriptMacroValueExprImpl(node);
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
      else if (type == NATIVE_FUNC_CALL_EXPR) {
        return new WarpScriptNativeFuncCallExprImpl(node);
      }
      else if (type == NULL_LITERAL_EXPR) {
        return new WarpScriptNullLiteralExprImpl(node);
      }
      else if (type == SET_EXPR) {
        return new WarpScriptSetExprImpl(node);
      }
      else if (type == SINGLE_VALUE_EXPR) {
        return new WarpScriptSingleValueExprImpl(node);
      }
      else if (type == STRING_LITERAL_EXPR) {
        return new WarpScriptStringLiteralExprImpl(node);
      }
      else if (type == VALUE_EXPR) {
        return new WarpScriptValueExprImpl(node);
      }
      else if (type == VARIABLE_VALUE_EXPR) {
        return new WarpScriptVariableValueExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
