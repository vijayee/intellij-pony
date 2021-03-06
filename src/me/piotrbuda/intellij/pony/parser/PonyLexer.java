/* The following code was generated by JFlex 1.4.3 on 7/6/16 10:16 AM */

package me.piotrbuda.intellij.pony.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.*;
import com.intellij.psi.TokenType;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/6/16 10:16 AM from the specification file
 * <tt>/Volumes/Devel/intellij-pony/src/me/piotrbuda/intellij/pony/parser/pony.flex</tt>
 */
public class PonyLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int MLSTRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\7\1\3\1\1\1\0\1\3\1\2\16\7\4\0\1\3\1\36"+
    "\1\41\1\0\1\7\1\31\1\50\1\7\1\52\1\55\1\31\1\31"+
    "\1\61\1\31\1\5\1\32\12\4\1\54\1\60\1\33\1\35\1\34"+
    "\1\44\1\43\32\7\1\53\1\0\1\56\1\0\1\6\1\0\1\20"+
    "\1\37\1\21\1\27\1\13\1\17\1\40\1\47\1\14\1\51\1\46"+
    "\1\24\1\22\1\15\1\26\1\12\1\7\1\16\1\25\1\10\1\42"+
    "\1\23\1\45\1\30\1\11\1\7\1\0\1\57\2\0\41\7\2\0"+
    "\4\7\4\0\1\7\2\0\1\7\7\0\1\7\4\0\1\7\5\0"+
    "\27\7\1\0\37\7\1\0\u01ca\7\4\0\14\7\16\0\5\7\7\0"+
    "\1\7\1\0\1\7\21\0\160\7\5\7\1\0\2\7\2\0\4\7"+
    "\10\0\1\7\1\0\3\7\1\0\1\7\1\0\24\7\1\0\123\7"+
    "\1\0\213\7\1\0\5\7\2\0\236\7\11\0\46\7\2\0\1\7"+
    "\7\0\47\7\7\0\1\7\1\0\55\7\1\0\1\7\1\0\2\7"+
    "\1\0\2\7\1\0\1\7\10\0\33\7\5\0\3\7\15\0\5\7"+
    "\6\0\1\7\4\0\13\7\5\0\53\7\25\7\12\4\4\0\2\7"+
    "\1\7\143\7\1\0\1\7\10\7\1\0\6\7\2\7\2\7\1\0"+
    "\4\7\2\7\12\4\3\7\2\0\1\7\17\0\1\7\1\7\1\7"+
    "\36\7\33\7\2\0\131\7\13\7\1\7\16\0\12\4\41\7\11\7"+
    "\2\7\4\0\1\7\5\0\26\7\4\7\1\7\11\7\1\7\3\7"+
    "\1\7\5\7\22\0\31\7\3\7\104\0\1\7\1\0\13\7\67\0"+
    "\33\7\1\0\4\7\66\7\3\7\1\7\22\7\1\7\7\7\12\7"+
    "\2\7\2\0\12\4\1\0\7\7\1\0\7\7\1\0\3\7\1\0"+
    "\10\7\2\0\2\7\2\0\26\7\1\0\7\7\1\0\1\7\3\0"+
    "\4\7\2\0\1\7\1\7\7\7\2\0\2\7\2\0\3\7\1\7"+
    "\10\0\1\7\4\0\2\7\1\0\3\7\2\7\2\0\12\4\4\7"+
    "\7\0\1\7\5\0\3\7\1\0\6\7\4\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\2\7\1\0\2\7\1\0\2\7\2\0\1\7"+
    "\1\0\5\7\4\0\2\7\2\0\3\7\3\0\1\7\7\0\4\7"+
    "\1\0\1\7\7\0\12\4\2\7\3\7\1\7\13\0\3\7\1\0"+
    "\11\7\1\0\3\7\1\0\26\7\1\0\7\7\1\0\2\7\1\0"+
    "\5\7\2\0\1\7\1\7\10\7\1\0\3\7\1\0\3\7\2\0"+
    "\1\7\17\0\2\7\2\7\2\0\12\4\1\0\1\7\17\0\3\7"+
    "\1\0\10\7\2\0\2\7\2\0\26\7\1\0\7\7\1\0\2\7"+
    "\1\0\5\7\2\0\1\7\1\7\7\7\2\0\2\7\2\0\3\7"+
    "\10\0\2\7\4\0\2\7\1\0\3\7\2\7\2\0\12\4\1\0"+
    "\1\7\20\0\1\7\1\7\1\0\6\7\3\0\3\7\1\0\4\7"+
    "\3\0\2\7\1\0\1\7\1\0\2\7\3\0\2\7\3\0\3\7"+
    "\3\0\14\7\4\0\5\7\3\0\3\7\1\0\4\7\2\0\1\7"+
    "\6\0\1\7\16\0\12\4\11\0\1\7\7\0\3\7\1\0\10\7"+
    "\1\0\3\7\1\0\27\7\1\0\12\7\1\0\5\7\3\0\1\7"+
    "\7\7\1\0\3\7\1\0\4\7\7\0\2\7\1\0\2\7\6\0"+
    "\2\7\2\7\2\0\12\4\22\0\2\7\1\0\10\7\1\0\3\7"+
    "\1\0\27\7\1\0\12\7\1\0\5\7\2\0\1\7\1\7\7\7"+
    "\1\0\3\7\1\0\4\7\7\0\2\7\7\0\1\7\1\0\2\7"+
    "\2\7\2\0\12\4\1\0\2\7\17\0\2\7\1\0\10\7\1\0"+
    "\3\7\1\0\51\7\2\0\1\7\7\7\1\0\3\7\1\0\4\7"+
    "\1\7\10\0\1\7\10\0\2\7\2\7\2\0\12\4\12\0\6\7"+
    "\2\0\2\7\1\0\22\7\3\0\30\7\1\0\11\7\1\0\1\7"+
    "\2\0\7\7\3\0\1\7\4\0\6\7\1\0\1\7\1\0\10\7"+
    "\22\0\2\7\15\0\60\7\1\7\2\7\7\7\4\0\10\7\10\7"+
    "\1\0\12\4\47\0\2\7\1\0\1\7\2\0\2\7\1\0\1\7"+
    "\2\0\1\7\6\0\4\7\1\0\7\7\1\0\3\7\1\0\1\7"+
    "\1\0\1\7\2\0\2\7\1\0\4\7\1\7\2\7\6\7\1\0"+
    "\2\7\1\7\2\0\5\7\1\0\1\7\1\0\6\7\2\0\12\4"+
    "\2\0\4\7\40\0\1\7\27\0\2\7\6\0\12\4\13\0\1\7"+
    "\1\0\1\7\1\0\1\7\4\0\2\7\10\7\1\0\44\7\4\0"+
    "\24\7\1\0\2\7\5\7\13\7\1\0\44\7\11\0\1\7\71\0"+
    "\53\7\24\7\1\7\12\4\6\0\6\7\4\7\4\7\3\7\1\7"+
    "\3\7\2\7\7\7\3\7\4\7\15\7\14\7\1\7\1\7\12\4"+
    "\4\7\2\0\46\7\1\0\1\7\5\0\1\7\2\0\53\7\1\0"+
    "\u014d\7\1\0\4\7\2\0\7\7\1\0\1\7\1\0\4\7\2\0"+
    "\51\7\1\0\4\7\2\0\41\7\1\0\4\7\2\0\7\7\1\0"+
    "\1\7\1\0\4\7\2\0\17\7\1\0\71\7\1\0\4\7\2\0"+
    "\103\7\2\0\3\7\40\0\20\7\20\0\125\7\14\0\u026c\7\2\0"+
    "\21\7\1\0\32\7\5\0\113\7\3\0\3\7\17\0\15\7\1\0"+
    "\4\7\3\7\13\0\22\7\3\7\13\0\22\7\2\7\14\0\15\7"+
    "\1\0\3\7\1\0\2\7\14\0\64\7\40\7\3\0\1\7\3\0"+
    "\2\7\1\7\2\0\12\4\41\0\3\7\2\0\12\4\6\0\130\7"+
    "\10\0\51\7\1\7\1\7\5\0\106\7\12\0\35\7\3\0\14\7"+
    "\4\0\14\7\12\0\12\4\36\7\2\0\5\7\13\0\54\7\4\0"+
    "\21\7\7\7\2\7\6\0\12\4\46\0\27\7\5\7\4\0\65\7"+
    "\12\7\1\0\35\7\2\0\1\7\12\4\6\0\12\4\15\0\1\7"+
    "\130\0\5\7\57\7\21\7\7\7\4\0\12\4\21\0\11\7\14\0"+
    "\3\7\36\7\15\7\2\7\12\4\54\7\16\7\14\0\44\7\24\7"+
    "\10\0\12\4\3\0\3\7\12\4\44\7\122\0\3\7\1\0\25\7"+
    "\4\7\1\7\4\7\3\7\2\7\11\0\300\7\47\7\25\0\4\7"+
    "\u0116\7\2\0\6\7\2\0\46\7\2\0\6\7\2\0\10\7\1\0"+
    "\1\7\1\0\1\7\1\0\1\7\1\0\37\7\2\0\65\7\1\0"+
    "\7\7\1\0\1\7\3\0\3\7\1\0\7\7\3\0\4\7\2\0"+
    "\6\7\4\0\15\7\5\0\3\7\1\0\7\7\16\0\5\7\32\0"+
    "\5\7\20\0\2\7\23\0\1\7\13\0\5\7\5\0\6\7\1\0"+
    "\1\7\15\0\1\7\20\0\15\7\3\0\33\7\25\0\15\7\4\0"+
    "\1\7\3\0\14\7\21\0\1\7\4\0\1\7\2\0\12\7\1\0"+
    "\1\7\3\0\5\7\6\0\1\7\1\0\1\7\1\0\1\7\1\0"+
    "\4\7\1\0\13\7\2\0\4\7\5\0\5\7\4\0\1\7\21\0"+
    "\51\7\u0a77\0\57\7\1\0\57\7\1\0\205\7\6\0\4\7\3\7"+
    "\2\7\14\0\46\7\1\0\1\7\5\0\1\7\2\0\70\7\7\0"+
    "\1\7\17\0\1\7\27\7\11\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\40\7\57\0\1\7\u01d5\0\3\7\31\0\11\7\6\7\1\0"+
    "\5\7\2\0\5\7\4\0\126\7\2\0\2\7\2\0\3\7\1\0"+
    "\132\7\1\0\4\7\5\0\51\7\3\0\136\7\21\0\33\7\65\0"+
    "\20\7\u0200\0\u19b6\7\112\0\u51cd\7\63\0\u048d\7\103\0\56\7\2\0"+
    "\u010d\7\3\0\20\7\12\4\2\7\24\0\57\7\1\7\4\0\12\7"+
    "\1\0\31\7\7\0\1\7\120\7\2\7\45\0\11\7\2\0\147\7"+
    "\2\0\4\7\1\0\4\7\14\0\13\7\115\0\12\7\1\7\3\7"+
    "\1\7\4\7\1\7\27\7\5\7\20\0\1\7\7\0\64\7\14\0"+
    "\2\7\62\7\21\7\13\0\12\4\6\0\22\7\6\7\3\0\1\7"+
    "\4\0\12\4\34\7\10\7\2\0\27\7\15\7\14\0\35\7\3\0"+
    "\4\7\57\7\16\7\16\0\1\7\12\4\46\0\51\7\16\7\11\0"+
    "\3\7\1\7\10\7\2\7\2\0\12\4\6\0\27\7\3\0\1\7"+
    "\1\7\4\0\60\7\1\7\1\7\3\7\2\7\2\7\5\7\2\7"+
    "\1\7\1\7\1\7\30\0\3\7\2\0\13\7\5\7\2\0\3\7"+
    "\2\7\12\0\6\7\2\0\6\7\2\0\6\7\11\0\7\7\1\0"+
    "\7\7\221\0\43\7\10\7\1\0\2\7\2\0\12\4\6\0\u2ba4\7"+
    "\14\0\27\7\4\0\61\7\u2104\0\u016e\7\2\0\152\7\46\0\7\7"+
    "\14\0\5\7\5\0\1\7\1\7\12\7\1\0\15\7\1\0\5\7"+
    "\1\0\1\7\1\0\2\7\1\0\2\7\1\0\154\7\41\0\u016b\7"+
    "\22\0\100\7\2\0\66\7\50\0\15\7\3\0\20\7\20\0\7\7"+
    "\14\0\2\7\30\0\3\7\31\0\1\7\6\0\5\7\1\0\207\7"+
    "\2\0\1\7\4\0\1\7\13\0\12\4\7\0\32\7\4\0\1\7"+
    "\1\0\32\7\13\0\131\7\3\0\6\7\2\0\6\7\2\0\6\7"+
    "\2\0\3\7\3\0\2\7\3\0\2\7\22\0\3\7\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\5\1\6\20\1\4\7"+
    "\1\10\1\3\1\1\1\3\1\1\1\11\1\12\1\1"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\2\1\24\1\1\1\25\10\1\1\26\1\27"+
    "\1\30\10\1\1\31\6\1\1\30\1\1\1\32\1\1"+
    "\1\0\1\33\1\34\2\1\1\0\1\35\4\1\1\0"+
    "\1\1\1\36\1\37\3\1\1\40\5\1\1\41\3\1"+
    "\1\42\5\1\1\43\1\44\2\1\2\45\1\1\1\35"+
    "\1\46\1\1\1\47\3\1\1\50\1\51\1\1\1\52"+
    "\2\1\1\53\17\1\1\54\3\1\1\55\11\1\1\56"+
    "\2\1\1\57\1\60\1\61\1\62\1\1\1\63\2\1"+
    "\1\64\1\65\4\1\1\66\1\67\3\1\1\70\1\1"+
    "\1\71\2\1\1\72\3\1\1\73\10\1\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[202];
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
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\144\0\u044c"+
    "\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa\0\144"+
    "\0\144\0\u05dc\0\144\0\144\0\144\0\144\0\144\0\144"+
    "\0\144\0\144\0\144\0\u060e\0\u0640\0\310\0\372\0\u0672"+
    "\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802"+
    "\0\u012c\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960"+
    "\0\u0992\0\u09c4\0\u012c\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe"+
    "\0\u0af0\0\u012c\0\u0b22\0\u012c\0\u0b54\0\u0b86\0\144\0\u012c"+
    "\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16"+
    "\0\u0d48\0\u0d7a\0\u012c\0\u012c\0\u0dac\0\u0dde\0\u0e10\0\u012c"+
    "\0\u0e42\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\u012c\0\u0f3c\0\u0f6e"+
    "\0\u0fa0\0\u012c\0\u0fd2\0\u1004\0\u1036\0\u1068\0\u109a\0\u012c"+
    "\0\u012c\0\u10cc\0\u10fe\0\144\0\u0b86\0\u1130\0\u0c1c\0\u0c1c"+
    "\0\u1162\0\u012c\0\u1194\0\u11c6\0\u11f8\0\144\0\u012c\0\u122a"+
    "\0\u012c\0\u125c\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1356\0\u1388"+
    "\0\u13ba\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518"+
    "\0\u154a\0\u157c\0\u15ae\0\u012c\0\u15e0\0\u1612\0\u1644\0\u012c"+
    "\0\u1676\0\u16a8\0\u16da\0\u170c\0\u173e\0\u1770\0\u17a2\0\u17d4"+
    "\0\u1806\0\u012c\0\u1838\0\u186a\0\u012c\0\u012c\0\u012c\0\u012c"+
    "\0\u189c\0\u012c\0\u18ce\0\u1900\0\u012c\0\u012c\0\u1932\0\u1964"+
    "\0\u1996\0\u19c8\0\u012c\0\u012c\0\u19fa\0\u1a2c\0\u1a5e\0\u012c"+
    "\0\u1a90\0\u012c\0\u1ac2\0\u1af4\0\u012c\0\u1b26\0\u1b58\0\u1b8a"+
    "\0\u012c\0\u1bbc\0\u1bee\0\u1c20\0\u1c52\0\u1c84\0\u1cb6\0\u1ce8"+
    "\0\u1d1a\0\u012c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[202];
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
    "\1\3\3\4\1\5\1\6\2\7\1\10\1\7\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\7\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\7\1\36\1\37"+
    "\1\40\1\41\1\42\2\7\1\43\1\7\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\41\54\1\55"+
    "\20\54\63\0\3\4\62\0\1\56\1\57\23\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\57\61\0\1\7\1\0\23\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\3\7\1\60\4\7\1\61\1\7\1\62\10\7\6\0"+
    "\2\7\1\0\1\7\2\0\2\7\1\63\1\0\1\7"+
    "\14\0\1\7\1\0\10\7\1\64\12\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\7\7\1\65\1\66\5\7\1\67\4\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\7\7\1\70\1\7\1\71\5\7\1\72"+
    "\1\7\1\73\1\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\5\7\1\74"+
    "\12\7\1\75\2\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\5\7\1\76"+
    "\15\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\20\7\1\77\2\7\6\0"+
    "\2\7\1\0\1\100\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\7\7\1\101\3\7\1\102\3\7\1\103"+
    "\3\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\16\7\1\104\1\7\1\105"+
    "\2\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\12\7\1\106\10\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\12\7\1\107\10\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\5\7\1\110\4\7\1\111\10\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\10\7\1\112\12\7\6\0\1\113\1\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\20\7"+
    "\1\114\2\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\20\7\1\115\2\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\42\0\1\116\62\0\1\27\1\0\1\27\60\0\2\27"+
    "\60\0\1\117\1\27\61\0\1\27\30\0\1\7\1\0"+
    "\5\7\1\120\2\7\1\121\7\7\1\122\2\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\10\0"+
    "\1\123\1\0\37\123\1\124\20\123\4\0\1\7\1\0"+
    "\7\7\1\125\7\7\1\126\3\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\6\7\1\127\14\7\6\0\2\7\1\0\1\7\2\0"+
    "\2\7\1\130\1\0\1\7\10\0\41\54\1\0\20\54"+
    "\41\0\1\131\24\0\1\7\1\0\4\7\1\132\16\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\3\7\1\133\3\7\1\134\2\7"+
    "\1\135\10\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\23\7\6\0\1\7"+
    "\1\134\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\5\7\1\136\15\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\6\7\1\137\14\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\21\7\1\140"+
    "\1\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\10\7\1\141\12\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\17\7\1\142\3\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\2\7\1\143\20\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\7\7\1\144"+
    "\10\7\1\134\2\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\5\7\1\145"+
    "\15\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\23\7\6\0\2\7\1\0"+
    "\1\7\2\0\1\120\2\7\1\0\1\7\14\0\1\7"+
    "\1\0\2\7\1\146\20\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\2\7"+
    "\1\147\1\7\1\150\4\7\1\134\1\7\1\151\7\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\10\7\1\152\12\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\7\7\1\120\13\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\21\7"+
    "\1\112\1\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\2\7\1\153\20\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\12\7\1\154\10\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\7\7\1\155\4\7\1\156\6\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\2\7\1\157\20\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\10\7"+
    "\1\160\5\7\1\134\4\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\2\7"+
    "\1\161\20\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\14\7\1\162\6\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\23\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\163\14\0\1\7\1\0\10\7"+
    "\1\112\12\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\10\0\1\116\1\164\1\165\57\116\4\0"+
    "\1\7\1\0\5\7\1\166\15\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\22\7\1\134\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\10\0\1\123\1\0\37\123\1\167\21\123"+
    "\1\0\37\123\1\170\20\123\4\0\1\7\1\0\2\7"+
    "\1\171\20\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\5\7\1\172\15\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\2\7\1\173\20\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\5\7\1\174\1\175\14\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\51\0\1\176\24\0"+
    "\1\7\1\0\5\7\1\177\15\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\6\7\1\200\14\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\7\7\1\201"+
    "\13\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\14\7\1\202\6\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\20\7\1\203\2\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\5\7\1\204\15\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\5\7\1\205"+
    "\15\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\2\7\1\112\20\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\7\7\1\206\13\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\23\7\6\0\2\7\1\0\1\207\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\5\7\1\210\15\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\20\7\1\211\2\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\20\7\1\212\2\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\17\7\1\213"+
    "\3\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\2\7\1\214\14\7\1\215"+
    "\3\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\4\7\1\216\16\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\13\7\1\217\7\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\23\7\6\0\1\220\1\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\5\7\1\221\15\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\12\7\1\222\10\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\6\7\1\223\14\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\23\7"+
    "\6\0\2\7\1\0\1\7\2\0\2\7\1\224\1\0"+
    "\1\7\14\0\1\7\1\0\10\7\1\225\12\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\16\7\1\226\4\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\2\7\1\177\20\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\6\7\1\227"+
    "\14\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\10\7\1\230\12\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\6\7\1\231\14\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\10\7\1\232\12\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\2\7\1\233"+
    "\20\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\10\7\1\234\12\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\12\7\1\235\10\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\15\7\1\236\5\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\10\7\1\177"+
    "\12\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\17\7\1\177\3\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\6\7\1\237\14\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\23\7\6\0\2\7\1\0\1\240\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\6\7\1\241\14\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\23\7\6\0\2\7\1\0\1\7\2\0"+
    "\2\7\1\242\1\0\1\7\14\0\1\7\1\0\21\7"+
    "\1\243\1\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\13\7\1\244\7\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\23\7\6\0\2\7\1\0\1\7"+
    "\2\0\1\7\1\245\1\7\1\0\1\7\14\0\1\7"+
    "\1\0\16\7\1\246\4\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\5\7"+
    "\1\247\15\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\5\7\1\250\15\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\2\7\1\251\20\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\11\7\1\252\11\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\11\7"+
    "\1\253\11\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\6\7\1\254\14\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\7\7\1\255\13\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\2\7\1\256\20\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\5\7"+
    "\1\257\15\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\7\7\1\260\13\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\14\7\1\261\6\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\16\7\1\262\4\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\12\7"+
    "\1\263\10\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\2\7\1\264\20\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\6\7\1\265\14\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\12\7\1\266\10\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\2\7"+
    "\1\267\20\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\10\7\1\270\12\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\23\7\6\0\2\7\1\0\1\271"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\5\7"+
    "\1\272\15\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\5\7\1\273\15\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\15\7\1\132\5\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\13\7\1\132\7\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\3\7"+
    "\1\274\17\7\6\0\2\7\1\0\1\7\2\0\3\7"+
    "\1\0\1\7\14\0\1\7\1\0\5\7\1\275\15\7"+
    "\6\0\2\7\1\0\1\7\2\0\3\7\1\0\1\7"+
    "\14\0\1\7\1\0\10\7\1\276\12\7\6\0\2\7"+
    "\1\0\1\7\2\0\3\7\1\0\1\7\14\0\1\7"+
    "\1\0\20\7\1\277\2\7\6\0\2\7\1\0\1\7"+
    "\2\0\3\7\1\0\1\7\14\0\1\7\1\0\1\300"+
    "\22\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\11\7\1\301\11\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\6\7\1\302\14\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\7\7\1\303\13\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\2\7\1\304"+
    "\20\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\10\7\1\305\12\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\6\7\1\306\14\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\14\0\1\7\1\0"+
    "\7\7\1\307\13\7\6\0\2\7\1\0\1\7\2\0"+
    "\3\7\1\0\1\7\14\0\1\7\1\0\17\7\1\310"+
    "\3\7\6\0\2\7\1\0\1\7\2\0\3\7\1\0"+
    "\1\7\14\0\1\7\1\0\6\7\1\311\14\7\6\0"+
    "\2\7\1\0\1\7\2\0\3\7\1\0\1\7\14\0"+
    "\1\7\1\0\13\7\1\312\7\7\6\0\2\7\1\0"+
    "\1\7\2\0\3\7\1\0\1\7\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7500];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\1\1\11\23\1\1\11\10\1\2\11\1\1\11\11"+
    "\42\1\1\0\1\11\3\1\1\0\5\1\1\0\32\1"+
    "\1\11\11\1\1\11\114\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[202];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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
  public PonyLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public PonyLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2258) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
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
   * Returns the character at position <tt>pos</tt> from the
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        return;

    }
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 27: 
          { return BEGIN_RAWSEQ;
          }
        case 61: break;
        case 26: 
          { return PONY_DO;
          }
        case 62: break;
        case 50: 
          { return PONY_WHILE;
          }
        case 63: break;
        case 53: 
          { return PONY_REPEAT;
          }
        case 64: break;
        case 10: 
          { return PONY_QUESTION;
          }
        case 65: break;
        case 25: 
          { return PONY_AS;
          }
        case 66: break;
        case 17: 
          { return PONY_UNION;
          }
        case 67: break;
        case 45: 
          { return PONY_ERROR;
          }
        case 68: break;
        case 47: 
          { return PONY_BREAK;
          }
        case 69: break;
        case 20: 
          { throw new Error("Illegal character <"+yytext()+">");
          }
        case 70: break;
        case 60: 
          { return PONY_COMPILER;
          }
        case 71: break;
        case 16: 
          { return RSQUARE;
          }
        case 72: break;
        case 57: 
          { return PONY_CONSUME;
          }
        case 73: break;
        case 33: 
          { return PONY_NOT;
          }
        case 74: break;
        case 44: 
          { return PONY_WITH;
          }
        case 75: break;
        case 8: 
          { return PONY_EQUALS;
          }
        case 76: break;
        case 6: 
          { return DOT;
          }
        case 77: break;
        case 59: 
          { return PONY_IDENTITYOF;
          }
        case 78: break;
        case 46: 
          { return PONY_MATCH;
          }
        case 79: break;
        case 12: 
          { return LPAREN_NEW;
          }
        case 80: break;
        case 18: 
          { return PONY_SEMICOLON;
          }
        case 81: break;
        case 23: 
          { return PONY_IF;
          }
        case 82: break;
        case 13: 
          { return LSQUARE_NEW;
          }
        case 83: break;
        case 54: 
          { return PONY_LAMBDA;
          }
        case 84: break;
        case 42: 
          { return PONY_THEN;
          }
        case 85: break;
        case 51: 
          { return PONY_ELSEIF;
          }
        case 86: break;
        case 58: 
          { return PONY_CONTINUE;
          }
        case 87: break;
        case 41: 
          { return PONY_CLASS_DEF;
          }
        case 88: break;
        case 43: 
          { return PONY_ELSE;
          }
        case 89: break;
        case 14: 
          { return BEGIN_TYPE;
          }
        case 90: break;
        case 5: 
          { return INT;
          }
        case 91: break;
        case 52: 
          { return PONY_RETURN;
          }
        case 92: break;
        case 39: 
          { return PONY_USE;
          }
        case 93: break;
        case 36: 
          { return PONY_LET;
          }
        case 94: break;
        case 37: 
          { return LINE_COMMENT;
          }
        case 95: break;
        case 34: 
          { return PONY_FOR;
          }
        case 96: break;
        case 1: 
          { return ID;
          }
        case 97: break;
        case 21: 
          { return FLOAT;
          }
        case 98: break;
        case 49: 
          { return PONY_WHERE;
          }
        case 99: break;
        case 30: 
          { return PONY_TRY;
          }
        case 100: break;
        case 38: 
          { yybegin(MLSTRING); return ML_STRING;
          }
        case 101: break;
        case 24: 
          { return BINOP;
          }
        case 102: break;
        case 19: 
          { return PONY_COLON;
          }
        case 103: break;
        case 7: 
          { return PONY_OPERATOR;
          }
        case 104: break;
        case 9: 
          { return PONY_AT;
          }
        case 105: break;
        case 22: 
          { return PONY_IN;
          }
        case 106: break;
        case 29: 
          { return STRING;
          }
        case 107: break;
        case 35: 
          { return PONY_VAR;
          }
        case 108: break;
        case 28: 
          { return PONY_METHOD;
          }
        case 109: break;
        case 4: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 110: break;
        case 11: 
          { return PONY_AMPERSAND;
          }
        case 111: break;
        case 15: 
          { return RPAREN;
          }
        case 112: break;
        case 31: 
          { return CAP;
          }
        case 113: break;
        case 32: 
          { return PONY_END;
          }
        case 114: break;
        case 56: 
          { return PONY_RECOVER;
          }
        case 115: break;
        case 40: 
          { yybegin(YYINITIAL); return ML_STRING;
          }
        case 116: break;
        case 2: 
          { return ML_STRING_CONTENT;
          }
        case 117: break;
        case 55: 
          { return PONY_OBJECT;
          }
        case 118: break;
        case 3: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 119: break;
        case 48: 
          { return PONY_UNTIL;
          }
        case 120: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
