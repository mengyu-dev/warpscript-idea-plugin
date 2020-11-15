package dev.mengyu.warpscript;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dev.mengyu.warpscript.psi.WarpScriptTypes.*;

%%

%{
  public _WarpScriptLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _WarpScriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

VAR_PREFIX=\!?\$
SPACE=[ \t\n\x0B\f\r]+
COMMENT=("/"\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+"/")|("//".*)|(#.*)
LONG=[\-\+]?[0-9]+
HEX=0x[0-9]+
DOUBLE=[\-\+]?[0-9]+\.[0-9]*
SDOULE=[\-\+]?[0-9]+\.[0-9]*[eE][\-\+]?[0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
MULSTRING=<'([^<'>\\]|\\.)*'>
ID=[\p{Alnum}!\\\%&()*+,\-./:;<=>?\[\\\]\^_‘{|}~]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "{"                { return LBRACE; }
  "}"                { return RBRACE; }
  "["                { return LBRACK; }
  "]"                { return RBRACK; }
  "("                { return LPAREN; }
  ")"                { return RPAREN; }
  "<%"               { return LBLOCK; }
  "%>"               { return RBLOCK; }
  "@"                { return MACRO_PREFIX; }
  "NULL"             { return NULL; }
  "T"                { return T; }
  "true"             { return TRUE; }
  "F"                { return F; }
  "false"            { return FALSE; }
  "IFT"              { return IFT; }
  "IFTE"             { return IFTE; }
  "0b[01]+"          { return BIT; }

  {VAR_PREFIX}       { return VAR_PREFIX; }
  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {LONG}             { return LONG; }
  {HEX}              { return HEX; }
  {DOUBLE}           { return DOUBLE; }
  {SDOULE}           { return SDOULE; }
  {STRING}           { return STRING; }
  {MULSTRING}        { return MULSTRING; }
  {ID}               { return ID; }

}

[^] { return BAD_CHARACTER; }
