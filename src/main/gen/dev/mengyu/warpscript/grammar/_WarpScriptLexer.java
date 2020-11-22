/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package dev.mengyu.warpscript.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dev.mengyu.warpscript.psi.WarpScriptTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_WarpScriptLexer.flex</tt>
 */
public class _WarpScriptLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 15152 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\1\21\1\22\3\21\1\23\1\24\1\25\1\21\14\26\1\27\50\26\1\30\2\26\1\31\1\32"+
    "\1\33\1\34\25\26\1\35\20\21\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1"+
    "\47\1\50\1\21\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\21\1\26\1\60\1\61\5\21"+
    "\2\26\1\62\7\21\1\26\1\63\20\21\1\26\1\64\1\21\1\65\13\26\1\66\1\26\1\67\22"+
    "\21\1\70\5\21\1\71\13\21\1\72\1\73\4\21\1\74\3\21\1\75\2\21\1\76\1\77\7\21"+
    "\123\26\1\100\7\26\1\101\1\102\12\26\1\103\24\21\1\26\1\104\u0702\21");

  /* The ZZ_CMAP_Y table has 4416 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\2\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\3"+
    "\0\1\17\1\20\1\21\1\20\2\22\1\23\3\22\1\23\71\22\1\24\1\22\1\25\1\0\1\26\1"+
    "\27\12\0\1\21\5\0\1\30\1\31\1\32\1\33\2\22\1\34\11\22\1\35\21\22\1\25\1\36"+
    "\24\22\1\37\3\22\1\23\1\40\1\37\4\22\5\0\1\22\1\35\1\41\1\0\3\22\2\42\3\0"+
    "\1\22\1\42\7\22\1\37\1\22\1\24\14\22\1\43\1\26\1\37\1\44\1\22\1\45\2\0\6\22"+
    "\1\0\1\46\14\22\1\25\1\0\5\22\1\42\1\47\1\20\3\22\1\36\1\22\1\26\2\0\3\22"+
    "\1\50\10\0\2\22\1\30\1\51\2\0\1\52\1\22\1\53\1\25\11\22\1\43\1\22\1\30\1\44"+
    "\1\22\1\54\1\22\1\37\1\22\1\43\1\45\1\55\2\22\1\56\1\57\1\60\1\45\1\61\1\62"+
    "\1\63\1\54\1\22\1\25\1\0\1\64\1\65\1\55\2\22\1\56\1\66\1\24\1\65\1\67\1\40"+
    "\1\70\1\71\1\22\1\51\1\0\1\64\1\35\1\34\2\22\1\56\1\72\1\60\1\35\1\73\1\50"+
    "\1\0\1\54\1\22\1\0\1\40\1\64\1\45\1\55\2\22\1\56\1\72\1\60\1\45\1\67\1\71"+
    "\1\63\1\54\1\22\1\40\1\0\1\74\1\75\1\76\1\77\1\100\1\75\1\22\1\24\1\75\1\101"+
    "\1\102\1\0\1\71\1\22\2\0\1\43\1\30\1\56\2\22\1\56\1\22\1\60\1\30\1\101\1\103"+
    "\1\42\1\54\1\22\2\0\1\43\1\30\1\56\2\22\1\56\1\43\1\60\1\30\1\101\1\103\1"+
    "\32\1\54\1\22\1\104\1\0\1\64\1\30\1\56\4\22\1\105\1\30\1\106\1\52\1\62\1\54"+
    "\1\22\1\0\1\36\1\74\1\22\1\23\1\36\2\22\1\34\1\107\1\23\1\62\1\110\1\22\1"+
    "\71\1\22\1\111\1\0\1\37\6\22\1\42\1\23\1\21\1\22\1\25\4\0\1\112\1\113\1\52"+
    "\1\37\1\114\1\74\1\22\1\115\1\110\1\21\1\22\1\116\4\0\1\50\3\0\1\22\1\25\2"+
    "\0\1\22\1\37\3\22\1\26\1\37\1\22\1\25\2\22\1\37\3\22\1\26\10\0\6\22\1\23\1"+
    "\55\1\22\1\25\2\22\1\105\1\117\2\22\1\23\1\32\1\22\1\120\4\22\1\35\1\21\5"+
    "\22\1\121\51\22\1\76\1\23\1\76\5\22\1\76\4\22\1\76\1\23\1\76\1\22\1\23\7\22"+
    "\1\76\10\22\1\65\4\0\2\22\2\0\12\22\2\51\1\37\114\22\1\45\2\22\1\122\2\22"+
    "\1\42\11\22\1\75\1\22\1\50\1\22\1\30\1\123\1\0\2\22\1\123\1\0\2\22\1\123\1"+
    "\0\1\22\1\30\1\124\1\0\6\22\1\54\2\22\1\50\1\62\1\125\1\22\1\25\4\0\1\22\1"+
    "\25\13\22\1\0\5\22\1\42\10\22\1\51\1\0\3\22\1\23\1\22\1\123\1\22\1\50\1\71"+
    "\4\22\1\51\1\26\1\0\5\22\1\123\3\22\1\25\1\22\1\25\4\0\3\22\1\123\7\22\1\23"+
    "\1\37\1\22\1\26\1\0\1\22\1\25\1\22\1\25\1\62\13\0\6\22\1\43\1\22\1\43\1\123"+
    "\1\22\1\25\4\0\5\22\1\116\6\22\1\35\1\22\1\25\1\0\6\22\1\51\1\0\1\22\1\60"+
    "\5\22\1\51\1\22\1\50\13\0\1\126\1\127\1\0\30\22\4\0\1\62\1\22\1\26\1\0\42"+
    "\22\2\51\4\22\2\51\1\22\1\130\3\22\1\51\6\22\1\30\1\110\1\131\1\26\1\54\1"+
    "\123\1\22\1\26\1\131\1\26\1\132\1\133\1\0\1\50\1\0\1\134\5\0\1\135\2\0\1\40"+
    "\1\62\2\0\1\22\1\26\14\0\1\136\1\36\1\107\1\137\1\27\1\140\1\22\1\116\1\46"+
    "\1\141\2\0\5\22\1\50\144\0\1\71\6\22\1\25\42\0\5\22\1\23\5\22\1\23\20\22\1"+
    "\26\1\142\1\111\1\0\4\22\1\35\1\21\7\22\1\62\2\0\2\22\1\23\1\0\10\23\4\22"+
    "\5\0\1\62\72\0\1\143\3\0\1\37\1\25\1\137\1\26\1\37\11\22\1\23\1\46\1\37\12"+
    "\22\1\121\1\46\4\22\1\51\1\37\12\22\1\23\2\0\3\22\1\42\6\0\170\22\1\51\11"+
    "\0\72\22\1\51\5\0\21\22\1\26\10\0\5\22\1\51\41\22\1\26\3\22\1\123\2\0\5\22"+
    "\1\23\1\52\1\144\16\22\4\0\1\62\1\22\1\36\14\22\1\55\3\22\1\23\1\22\7\0\1"+
    "\62\1\22\1\145\1\121\3\22\3\0\6\22\1\123\1\0\10\22\1\107\1\0\1\22\1\25\2\0"+
    "\1\36\1\146\5\22\1\42\4\22\1\42\1\0\3\22\1\26\6\22\1\121\1\22\1\0\1\62\1\22"+
    "\1\25\1\30\2\22\1\23\6\22\1\23\1\0\1\22\1\51\1\22\1\25\2\22\1\23\1\147\7\22"+
    "\1\23\1\150\2\0\1\151\2\22\1\152\1\0\3\153\1\0\2\23\5\22\1\121\1\51\1\0\17"+
    "\22\1\42\1\22\1\25\64\22\1\123\1\0\2\22\1\23\1\53\5\22\1\123\40\0\55\22\1"+
    "\51\15\22\1\25\4\0\1\23\1\0\1\53\1\46\1\22\1\56\1\23\1\110\1\154\15\22\1\25"+
    "\3\0\1\53\54\22\1\51\2\0\10\22\1\36\6\22\5\0\1\22\1\123\16\0\1\30\20\22\1"+
    "\26\2\0\1\22\1\25\1\37\2\22\1\42\1\37\2\22\1\42\1\71\12\22\1\23\3\36\1\155"+
    "\4\0\1\22\1\43\2\22\1\23\2\22\1\156\1\22\1\51\1\22\1\51\4\0\17\22\1\42\10"+
    "\0\6\22\1\26\41\0\3\22\1\26\6\22\1\50\5\0\4\22\2\0\3\22\1\42\5\22\1\42\3\22"+
    "\1\51\4\22\1\123\1\22\1\137\5\0\23\22\1\51\1\22\1\25\4\22\1\123\4\22\1\123"+
    "\5\22\1\0\6\22\1\123\23\0\46\22\1\23\1\0\2\22\1\51\1\0\1\22\23\0\1\51\1\56"+
    "\4\22\1\35\1\157\2\22\1\51\1\0\2\22\1\23\1\0\3\22\1\23\10\0\2\22\1\160\1\0"+
    "\2\22\1\51\1\0\3\22\1\25\10\0\7\22\1\71\10\0\1\127\1\52\1\43\1\37\2\22\1\123"+
    "\5\0\3\22\1\26\3\22\1\26\4\0\1\22\1\37\2\22\1\26\3\0\6\22\1\51\1\0\2\22\1"+
    "\51\1\0\2\22\1\42\1\0\2\22\1\25\15\0\11\22\1\50\6\0\6\22\1\42\1\0\6\22\1\42"+
    "\41\0\10\22\1\51\3\0\1\71\1\22\2\0\1\36\6\22\1\50\2\0\3\22\1\50\1\22\1\25"+
    "\6\22\1\75\1\22\2\0\4\22\1\161\1\0\10\22\1\162\1\0\1\22\1\163\4\0\2\22\1\34"+
    "\3\22\1\45\1\32\10\0\1\23\1\140\1\22\1\35\1\22\1\50\7\22\1\50\1\22\1\25\1"+
    "\43\1\45\1\55\2\22\1\56\1\72\1\60\1\45\1\67\1\102\1\46\1\123\23\0\10\22\1"+
    "\145\1\42\1\22\1\25\4\0\10\22\1\164\1\0\1\22\1\25\24\0\6\22\1\51\1\23\3\0"+
    "\1\51\4\0\7\22\1\23\1\165\1\0\1\22\1\25\4\0\6\22\1\51\1\0\1\22\1\25\6\0\3"+
    "\22\1\60\1\22\1\42\1\22\1\25\54\0\11\22\1\25\1\0\1\62\70\0\7\22\1\50\40\0"+
    "\1\22\1\56\4\22\2\23\1\50\1\0\1\22\1\25\2\0\1\36\3\22\1\36\2\22\1\37\1\23"+
    "\51\0\63\22\1\25\14\0\15\22\1\23\2\0\30\22\1\123\27\0\5\22\1\23\72\0\10\22"+
    "\1\23\67\0\7\22\1\50\3\22\1\23\1\22\1\25\14\0\3\22\1\51\2\0\6\22\1\23\1\0"+
    "\1\123\1\0\1\22\1\25\1\53\2\22\1\46\2\22\56\0\10\22\1\26\1\0\5\22\1\23\2\0"+
    "\1\53\1\22\10\0\1\50\3\0\75\22\1\26\2\0\36\22\1\42\41\0\1\25\77\0\15\22\1"+
    "\42\1\22\1\26\1\22\1\50\1\22\1\141\54\0\12\22\1\30\10\22\1\30\1\166\1\126"+
    "\1\22\1\167\1\43\7\22\1\35\1\105\2\30\3\22\1\170\1\110\1\36\1\56\51\22\1\51"+
    "\3\22\1\56\2\22\1\121\3\22\1\121\2\22\1\30\3\22\1\30\2\22\1\23\3\22\1\23\3"+
    "\22\1\56\3\22\1\56\2\22\1\121\1\54\6\22\1\23\2\22\1\55\1\154\1\42\72\0\30"+
    "\22\1\26\7\0\10\22\1\144\1\0\1\22\1\25\24\0\1\43\3\22\1\112\1\37\1\121\1\171"+
    "\1\136\1\172\1\112\1\130\1\112\2\121\1\70\1\22\1\34\1\22\1\123\1\64\1\34\1"+
    "\22\1\123\116\0\3\22\1\25\3\22\1\25\3\22\1\25\16\0\32\22\1\23\5\0\106\22\1"+
    "\26\1\0\33\22\1\51\120\22\1\25\53\0\3\22\1\51\74\0");

  /* The ZZ_CMAP_A table has 984 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\3\1\2\0\1\3\1\4\1\21\1\7\1\5\1\33\1\24\1\17\1\31\1\32\1\10\1"+
    "\55\1\24\1\11\1\15\1\6\1\13\1\54\10\12\2\24\1\22\1\24\1\23\1\24\1\34\4\24"+
    "\1\16\1\45\2\24\1\52\2\24\1\37\1\24\1\35\5\24\1\40\1\36\5\24\1\27\1\20\1\30"+
    "\2\24\1\0\1\47\1\53\2\24\1\44\1\46\5\24\1\50\5\24\1\42\1\51\1\41\1\43\2\24"+
    "\1\14\2\24\1\25\1\24\1\26\1\24\6\0\1\1\2\0\1\3\11\0\1\24\12\0\1\24\2\0\17"+
    "\24\1\0\2\24\4\0\4\24\6\0\5\24\7\0\1\24\1\0\1\24\1\0\5\24\1\0\2\24\2\0\4\24"+
    "\1\0\1\24\6\0\1\24\1\0\3\24\1\0\1\24\1\0\4\24\1\0\13\24\1\0\1\24\2\0\6\24"+
    "\1\0\7\24\1\0\1\24\7\0\2\24\1\0\2\24\1\0\4\24\5\0\4\24\1\0\4\24\4\0\10\24"+
    "\2\0\1\24\5\0\3\24\4\0\2\24\2\0\1\24\7\0\6\24\6\0\4\24\3\0\11\24\2\0\3\24"+
    "\2\0\6\24\1\0\7\24\1\0\1\24\3\0\4\24\3\0\4\24\2\0\2\24\1\0\1\24\10\0\1\24"+
    "\4\0\2\24\1\0\1\24\1\0\3\24\1\0\6\24\4\0\2\24\1\0\2\24\1\0\2\24\1\0\1\24\2"+
    "\0\2\24\4\0\4\24\1\0\1\24\7\0\3\24\1\0\2\24\1\0\5\24\1\0\2\24\5\0\2\24\1\0"+
    "\6\24\3\0\3\24\1\0\4\24\3\0\2\24\1\0\1\24\1\0\2\24\3\0\2\24\3\0\1\24\1\0\3"+
    "\24\3\0\1\24\6\0\1\24\5\0\2\24\2\0\2\24\5\0\3\24\2\0\4\24\1\0\3\24\1\0\1\24"+
    "\1\0\4\24\1\0\1\24\2\0\5\24\1\0\1\24\3\0\2\24\5\0\2\24\1\0\1\24\2\0\2\24\1"+
    "\0\1\24\2\0\1\24\3\0\3\24\1\0\1\24\1\0\3\24\1\0\3\24\2\0\2\24\2\0\5\24\5\0"+
    "\4\24\2\0\2\24\2\0\3\24\1\0\4\24\1\3\13\24\4\0\1\24\1\0\2\24\10\0\1\24\4\0"+
    "\4\24\1\0\6\24\1\0\2\24\2\0\1\24\1\0\1\24\1\0\1\24\1\0\1\24\2\0\3\24\1\0\2"+
    "\24\13\3\5\0\2\1\5\0\1\3\7\0\1\3\2\0\1\24\4\0\1\24\1\0\5\24\2\0\1\24\1\0\4"+
    "\24\1\0\3\24\4\0\1\24\4\0\4\24\1\0\1\3\4\0\7\24\3\0\3\24\1\0\3\24\1\0\1\24"+
    "\3\0\1\24\1\0\1\24\4\0\1\24\3\0\3\24\1\0\1\24\10\0\3\24\4\0\4\24\3\0\6\24"+
    "\1\0\2\24\1\0\2\24\1\0\2\24\2\0\3\24\3\0\3\24\1\0\2\24\1\0\2\24\3\0\1\24\2"+
    "\0\4\24\1\0\2\24\2\0\3\24\3\0\1\24\2\0\4\24\3\0\3\24\1\0\1\24\3\0\2\24\2\0"+
    "\2\24\1\0\2\24\3\0\1\24\5\0\1\24\2\0\2\24\1\0\2\24\1\0\1\24\1\0\5\24\1\0\4"+
    "\24\2\0\1\24\1\0\1\24\5\0\1\24\1\0\1\24\1\0\3\24");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\1\4\1\1\1\5\2\1"+
    "\2\6\2\2\1\1\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\1\1\15\1\1\1\16\1\1\1\17\3\1"+
    "\1\20\2\1\1\0\1\21\4\0\1\22\1\23\4\1"+
    "\1\0\1\1\1\24\1\25\1\1\2\0\3\1\1\26"+
    "\1\0\1\27\1\24\1\1\1\30\1\31\1\32\1\1"+
    "\1\33\1\27\1\1\1\34\1\1\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[69];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\56\0\270\0\346\0\u0114"+
    "\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0114\0\u0114"+
    "\0\u0114\0\u0114\0\u0114\0\u0114\0\u0256\0\56\0\u0284\0\u0114"+
    "\0\u02b2\0\u0114\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6"+
    "\0\u01cc\0\56\0\u03f4\0\u01fa\0\u0422\0\u0450\0\u0114\0\u0114"+
    "\0\u047e\0\u04ac\0\u04da\0\u0508\0\u0536\0\u0564\0\u0592\0\u0398"+
    "\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702"+
    "\0\u033c\0\u0730\0\u075e\0\56\0\u0114\0\u0114\0\u078c\0\u0114"+
    "\0\u0536\0\u07ba\0\u0114\0\u07e8\0\u0114";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[69];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\3\10\1\14\1\10\1\15\1\16\2\10"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\2\10\1\30\1\31\3\10\1\32\1\33\3\10"+
    "\1\34\1\10\1\12\1\11\57\0\3\3\56\0\1\10"+
    "\1\5\1\10\1\0\7\10\1\0\1\10\1\0\12\10"+
    "\1\0\21\10\4\0\1\10\1\0\1\7\1\0\1\35"+
    "\6\10\1\0\1\10\1\0\12\10\1\0\21\10\1\7"+
    "\2\0\53\7\4\0\1\10\1\0\1\10\1\0\7\10"+
    "\1\0\1\10\1\0\12\10\1\0\21\10\4\0\1\10"+
    "\1\0\1\10\1\0\2\10\2\12\3\10\1\0\1\10"+
    "\1\0\12\10\1\0\17\10\1\12\1\10\4\0\1\10"+
    "\1\0\1\10\1\0\2\10\2\12\1\10\1\36\1\10"+
    "\1\0\1\10\1\0\12\10\1\0\17\10\1\12\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\2\10\2\12\1\37"+
    "\1\36\1\10\1\0\1\10\1\0\12\10\1\0\16\10"+
    "\1\40\1\12\1\10\17\41\1\42\1\43\35\41\20\44"+
    "\1\45\1\42\34\44\4\0\1\10\1\0\1\10\1\0"+
    "\7\10\1\46\1\10\1\0\11\10\1\47\1\0\21\10"+
    "\4\0\1\10\1\0\1\10\1\0\7\10\1\0\1\10"+
    "\1\0\1\10\1\50\10\10\1\0\21\10\4\0\1\10"+
    "\1\0\1\10\1\0\7\10\1\0\1\10\1\0\12\10"+
    "\1\0\1\10\1\51\17\10\4\0\1\10\1\0\1\10"+
    "\1\0\7\10\1\0\1\10\1\0\12\10\1\0\5\10"+
    "\1\52\13\10\4\0\1\10\1\0\1\10\1\0\7\10"+
    "\1\0\1\10\1\0\12\10\1\0\12\10\1\53\6\10"+
    "\4\0\1\10\1\0\1\10\1\0\7\10\1\0\1\10"+
    "\1\0\12\10\1\0\10\10\1\54\10\10\1\55\1\0"+
    "\2\55\1\35\1\55\1\35\1\55\1\56\6\35\1\55"+
    "\1\35\1\55\12\35\1\55\21\35\4\0\1\10\1\0"+
    "\1\10\1\0\2\10\2\36\2\10\1\57\1\0\1\10"+
    "\1\0\12\10\1\0\7\10\1\57\7\10\1\36\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\2\10\2\60\3\10"+
    "\1\0\1\10\1\0\12\10\1\0\17\10\1\60\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\7\10\1\0\1\10"+
    "\1\0\5\10\1\61\4\10\1\0\21\10\1\41\2\0"+
    "\53\41\1\44\2\0\53\44\17\46\1\62\1\63\1\46"+
    "\2\0\32\46\4\0\1\10\1\0\1\10\1\0\7\10"+
    "\1\0\1\10\1\0\12\10\1\0\2\10\1\64\16\10"+
    "\4\0\1\10\1\0\1\10\1\0\7\10\1\0\1\10"+
    "\1\0\12\10\1\0\6\10\1\65\12\10\4\0\1\10"+
    "\1\0\1\10\1\0\7\10\1\0\1\10\1\0\12\10"+
    "\1\0\13\10\1\66\5\10\4\0\1\10\1\0\1\10"+
    "\1\0\7\10\1\0\1\10\1\0\12\10\1\0\3\10"+
    "\1\67\15\10\1\55\1\0\6\55\1\70\46\55\1\0"+
    "\2\55\1\35\1\55\1\71\1\55\1\56\6\35\1\55"+
    "\1\35\1\55\12\35\1\55\21\35\4\0\1\10\1\0"+
    "\1\10\1\0\1\10\3\72\3\10\1\0\1\10\1\0"+
    "\12\10\1\0\17\10\2\72\4\0\1\10\1\0\1\10"+
    "\1\0\3\10\1\73\3\10\1\0\1\10\1\0\12\10"+
    "\1\0\21\10\23\0\1\74\32\0\1\46\2\0\53\46"+
    "\4\0\1\10\1\0\1\10\1\0\7\10\1\0\1\10"+
    "\1\0\12\10\1\0\2\10\1\75\16\10\4\0\1\10"+
    "\1\0\1\10\1\0\7\10\1\0\1\10\1\0\12\10"+
    "\1\0\7\10\1\76\11\10\4\0\1\10\1\0\1\10"+
    "\1\0\7\10\1\0\1\10\1\0\12\10\1\0\14\10"+
    "\1\77\4\10\4\0\1\10\1\0\1\10\1\0\6\10"+
    "\1\100\1\0\1\10\1\0\12\10\1\0\21\10\1\55"+
    "\1\0\4\55\1\101\1\55\1\70\45\55\4\0\1\10"+
    "\1\0\1\10\1\0\2\10\2\72\3\10\1\0\1\10"+
    "\1\0\12\10\1\0\17\10\1\72\1\10\4\0\1\10"+
    "\1\0\1\10\1\0\7\10\1\0\1\10\1\0\12\10"+
    "\1\0\17\10\1\102\1\10\4\0\1\10\1\0\1\10"+
    "\1\0\7\10\1\0\1\10\1\0\12\10\1\0\7\10"+
    "\1\103\11\10\4\0\1\10\1\0\1\10\1\0\7\10"+
    "\1\0\1\10\1\0\6\10\1\104\3\10\1\0\21\10"+
    "\4\0\1\10\1\0\1\10\1\0\7\10\1\0\1\10"+
    "\1\0\12\10\1\0\20\10\1\105";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2070];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\2\1\1\11\20\1\1\11\12\1\1\0"+
    "\1\11\4\0\6\1\1\0\4\1\2\0\4\1\1\0"+
    "\3\1\1\11\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[69];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _WarpScriptLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _WarpScriptLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ID;
            } 
            // fall through
          case 30: break;
          case 2: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 31: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 32: break;
          case 4: 
            { return VAR_PREFIX;
            } 
            // fall through
          case 33: break;
          case 5: 
            { return LCOMMENT;
            } 
            // fall through
          case 34: break;
          case 6: 
            { return LONG;
            } 
            // fall through
          case 35: break;
          case 7: 
            { return LBRACE;
            } 
            // fall through
          case 36: break;
          case 8: 
            { return RBRACE;
            } 
            // fall through
          case 37: break;
          case 9: 
            { return LBRACK;
            } 
            // fall through
          case 38: break;
          case 10: 
            { return RBRACK;
            } 
            // fall through
          case 39: break;
          case 11: 
            { return LPAREN;
            } 
            // fall through
          case 40: break;
          case 12: 
            { return RPAREN;
            } 
            // fall through
          case 41: break;
          case 13: 
            { return MACRO_PREFIX;
            } 
            // fall through
          case 42: break;
          case 14: 
            { return T;
            } 
            // fall through
          case 43: break;
          case 15: 
            { return F;
            } 
            // fall through
          case 44: break;
          case 16: 
            { return DOUBLE;
            } 
            // fall through
          case 45: break;
          case 17: 
            { return STRING;
            } 
            // fall through
          case 46: break;
          case 18: 
            { return LBLOCK;
            } 
            // fall through
          case 47: break;
          case 19: 
            { return RBLOCK;
            } 
            // fall through
          case 48: break;
          case 20: 
            { return SDOUBLE;
            } 
            // fall through
          case 49: break;
          case 21: 
            { return HEX;
            } 
            // fall through
          case 50: break;
          case 22: 
            { return IFT;
            } 
            // fall through
          case 51: break;
          case 23: 
            { return BCOMMENT;
            } 
            // fall through
          case 52: break;
          case 24: 
            { return MSTRING;
            } 
            // fall through
          case 53: break;
          case 25: 
            { return NULL;
            } 
            // fall through
          case 54: break;
          case 26: 
            { return TRUE;
            } 
            // fall through
          case 55: break;
          case 27: 
            { return IFTE;
            } 
            // fall through
          case 56: break;
          case 28: 
            { return FALSE;
            } 
            // fall through
          case 57: break;
          case 29: 
            { return BIT;
            } 
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}