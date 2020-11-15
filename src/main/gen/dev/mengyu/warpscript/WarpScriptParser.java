// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static dev.mengyu.warpscript.psi.WarpScriptTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WarpScriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // TRUE | FALSE | T | F
  public static boolean bool_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL_LITERAL_EXPR, "<bool literal expr>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, T);
    if (!r) r = consumeToken(b, F);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ift_control_expr | ifte_control_expr
  public static boolean control_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_EXPR, "<control expr>");
    r = ift_control_expr(b, l + 1);
    if (!r) r = ifte_control_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean func_ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_ref_expr")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, FUNC_REF_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // [ macro_expr | macro_ref_expr ] [ macro_expr | macro_ref_expr ] IFT
  public static boolean ift_control_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IFT_CONTROL_EXPR, "<ift control expr>");
    r = ift_control_expr_0(b, l + 1);
    r = r && ift_control_expr_1(b, l + 1);
    r = r && consumeToken(b, IFT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ macro_expr | macro_ref_expr ]
  private static boolean ift_control_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr_0")) return false;
    ift_control_expr_0_0(b, l + 1);
    return true;
  }

  // macro_expr | macro_ref_expr
  private static boolean ift_control_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr_0_0")) return false;
    boolean r;
    r = macro_expr(b, l + 1);
    if (!r) r = macro_ref_expr(b, l + 1);
    return r;
  }

  // [ macro_expr | macro_ref_expr ]
  private static boolean ift_control_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr_1")) return false;
    ift_control_expr_1_0(b, l + 1);
    return true;
  }

  // macro_expr | macro_ref_expr
  private static boolean ift_control_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr_1_0")) return false;
    boolean r;
    r = macro_expr(b, l + 1);
    if (!r) r = macro_ref_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ([  macro_expr | macro_ref_expr ])? [ macro_expr | macro_ref_expr ] [ macro_expr | macro_ref_expr ] IFTE
  public static boolean ifte_control_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IFTE_CONTROL_EXPR, "<ifte control expr>");
    r = ifte_control_expr_0(b, l + 1);
    r = r && ifte_control_expr_1(b, l + 1);
    r = r && ifte_control_expr_2(b, l + 1);
    r = r && consumeToken(b, IFTE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ([  macro_expr | macro_ref_expr ])?
  private static boolean ifte_control_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_0")) return false;
    ifte_control_expr_0_0(b, l + 1);
    return true;
  }

  // [  macro_expr | macro_ref_expr ]
  private static boolean ifte_control_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_0_0")) return false;
    ifte_control_expr_0_0_0(b, l + 1);
    return true;
  }

  // macro_expr | macro_ref_expr
  private static boolean ifte_control_expr_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_0_0_0")) return false;
    boolean r;
    r = macro_expr(b, l + 1);
    if (!r) r = macro_ref_expr(b, l + 1);
    return r;
  }

  // [ macro_expr | macro_ref_expr ]
  private static boolean ifte_control_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_1")) return false;
    ifte_control_expr_1_0(b, l + 1);
    return true;
  }

  // macro_expr | macro_ref_expr
  private static boolean ifte_control_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_1_0")) return false;
    boolean r;
    r = macro_expr(b, l + 1);
    if (!r) r = macro_ref_expr(b, l + 1);
    return r;
  }

  // [ macro_expr | macro_ref_expr ]
  private static boolean ifte_control_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_2")) return false;
    ifte_control_expr_2_0(b, l + 1);
    return true;
  }

  // macro_expr | macro_ref_expr
  private static boolean ifte_control_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_2_0")) return false;
    boolean r;
    r = macro_expr(b, l + 1);
    if (!r) r = macro_ref_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LBRACK one_value_expr  RBRACK
  public static boolean list_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPR, null);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, one_value_expr(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // double | sdoule
  public static boolean literal_double(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_double")) return false;
    if (!nextTokenIs(b, "<literal double>", DOUBLE, SDOULE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_DOUBLE, "<literal double>");
    r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, SDOULE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal_long | literal_double | string_literal_expr | bool_literal_expr | NULL
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = literal_long(b, l + 1);
    if (!r) r = literal_double(b, l + 1);
    if (!r) r = string_literal_expr(b, l + 1);
    if (!r) r = bool_literal_expr(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // long | hex | bit
  public static boolean literal_long(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_long")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_LONG, "<literal long>");
    r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, HEX);
    if (!r) r = consumeToken(b, BIT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBLOCK proc_expr? RBLOCK
  public static boolean macro_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expr")) return false;
    if (!nextTokenIs(b, LBLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBLOCK);
    r = r && macro_expr_1(b, l + 1);
    r = r && consumeToken(b, RBLOCK);
    exit_section_(b, m, MACRO_EXPR, r);
    return r;
  }

  // proc_expr?
  private static boolean macro_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expr_1")) return false;
    proc_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MACRO_PREFIX ( literal_long | literal_double | id )
  public static boolean macro_ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_ref_expr")) return false;
    if (!nextTokenIs(b, MACRO_PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MACRO_PREFIX);
    r = r && macro_ref_expr_1(b, l + 1);
    exit_section_(b, m, MACRO_REF_EXPR, r);
    return r;
  }

  // literal_long | literal_double | id
  private static boolean macro_ref_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_ref_expr_1")) return false;
    boolean r;
    r = literal_long(b, l + 1);
    if (!r) r = literal_double(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  /* ********************************************************** */
  // map_key_expr map_value_expr
  public static boolean map_entry_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_entry_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_ENTRY_EXPR, "<map entry expr>");
    r = map_key_expr(b, l + 1);
    r = r && map_value_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE map_entry_expr*  RBRACE
  public static boolean map_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAP_EXPR, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, map_expr_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // map_entry_expr*
  private static boolean map_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!map_entry_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_expr_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // string | long  | double | NULL
  public static boolean map_key_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_key_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_KEY_EXPR, "<map key expr>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variable_ref_expr | typed_expr | one_value_expr
  public static boolean map_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_VALUE_EXPR, "<map value expr>");
    r = variable_ref_expr(b, l + 1);
    if (!r) r = typed_expr(b, l + 1);
    if (!r) r = one_value_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // proc_expr [ macro_ref_expr | func_ref_expr ]
  public static boolean one_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ONE_VALUE_EXPR, "<one value expr>");
    r = proc_expr(b, l + 1);
    r = r && one_value_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ macro_ref_expr | func_ref_expr ]
  private static boolean one_value_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_value_expr_1")) return false;
    one_value_expr_1_0(b, l + 1);
    return true;
  }

  // macro_ref_expr | func_ref_expr
  private static boolean one_value_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_value_expr_1_0")) return false;
    boolean r;
    r = macro_ref_expr(b, l + 1);
    if (!r) r = func_ref_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ( control_expr | ref_expr | typed_expr )*
  public static boolean proc_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proc_expr")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROC_EXPR, "<proc expr>");
    while (true) {
      int c = current_position_(b);
      if (!proc_expr_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "proc_expr", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // control_expr | ref_expr | typed_expr
  private static boolean proc_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proc_expr_0")) return false;
    boolean r;
    r = control_expr(b, l + 1);
    if (!r) r = ref_expr(b, l + 1);
    if (!r) r = typed_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // macro_ref_expr | variable_ref_expr | func_ref_expr
  public static boolean ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REF_EXPR, "<ref expr>");
    r = macro_ref_expr(b, l + 1);
    if (!r) r = variable_ref_expr(b, l + 1);
    if (!r) r = func_ref_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> proc_expr
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && proc_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN one_value_expr  RPAREN
  public static boolean set_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_expr")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SET_EXPR, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, one_value_expr(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // string | mulstring
  public static boolean string_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_expr")) return false;
    if (!nextTokenIs(b, "<string literal expr>", MULSTRING, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL_EXPR, "<string literal expr>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, MULSTRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // macro_expr |  list_expr | set_expr | map_expr | literal_expr
  public static boolean typed_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typed_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPED_EXPR, "<typed expr>");
    r = macro_expr(b, l + 1);
    if (!r) r = list_expr(b, l + 1);
    if (!r) r = set_expr(b, l + 1);
    if (!r) r = map_expr(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VAR_PREFIX ( literal_long | literal_double | id )
  public static boolean variable_ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_ref_expr")) return false;
    if (!nextTokenIs(b, VAR_PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR_PREFIX);
    r = r && variable_ref_expr_1(b, l + 1);
    exit_section_(b, m, VARIABLE_REF_EXPR, r);
    return r;
  }

  // literal_long | literal_double | id
  private static boolean variable_ref_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_ref_expr_1")) return false;
    boolean r;
    r = literal_long(b, l + 1);
    if (!r) r = literal_double(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

}
