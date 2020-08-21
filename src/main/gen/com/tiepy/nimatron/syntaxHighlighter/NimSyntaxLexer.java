/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

/*
 * This file is based on example provided by the IntelliJ Platform SDK DevGuide.
 * Copyright 2000-2020 JetBrains s.r.o. and other contributors.
 * Use of original example source code is governed by the Apache 2.0 license.
 *
 * Copyright 2020 TiePy Ltd. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file is part of Nimatron, a Nim plug-in for IDEA platform IDEs.
 *
 * Nimatron is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.  TiePy Ltd designates this
 * particular file as subject to the "Classpath" exception as provided
 * by TiePy Ltd in the LICENSE file that accompanied this code.
 *
 * Nimatron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Nimatron.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Please contact TiePy Ltd, 19 Lyall Way, Laurencekirk, AB30 1FU, UK
 * or visit www.tiepy.com if you need additional information or have any
 * questions.
 */

package com.tiepy.nimatron.syntaxHighlighter;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import java.util.Stack;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>NimSyntax.flex</tt>
 */
class NimSyntaxLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int LINE_COMMENT = 2;
  public static final int BLOCK_COMMENT = 4;
  public static final int BLOCK_DOC_COMMENT = 6;
  public static final int DISCARD_COMMENT = 8;
  public static final int STRING_LITERAL = 10;
  public static final int TRIPLE_STRING_LITERAL = 12;
  public static final int RAW_STRING_LITERAL = 14;
  public static final int GENERALIZED_STRING_LITERAL = 16;
  public static final int GENERALIZED_TRIPLE_STRING_LITERAL = 18;
  public static final int CHARACTER_LITERAL = 20;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     7,  7,  6,  6,  8, 8
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1672 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\76\2\1\3\277\2");

  /* The ZZ_CMAP_A table has 512 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\33\1\31\1\100\1\101\1\32\22\0\1\76\1\2\1\77\1\26\3\2\1\43\1\61\1\63"+
    "\1\2\1\1\1\65\1\1\1\16\1\2\1\37\1\36\1\50\1\47\1\51\1\35\1\46\1\35\1\45\1"+
    "\23\1\3\1\64\5\2\1\34\1\42\1\34\1\57\1\55\1\56\2\24\1\44\13\24\1\53\2\24\1"+
    "\40\2\24\1\27\1\103\1\30\1\2\1\25\1\66\1\7\1\41\1\67\1\11\1\54\1\15\1\74\1"+
    "\21\1\12\1\73\1\70\1\22\1\20\1\10\1\4\1\71\1\24\1\5\1\14\1\13\1\52\1\17\1"+
    "\75\1\6\1\72\1\24\1\60\1\2\1\62\1\2\1\0\5\24\1\102\172\24\250\0\2\100\126"+
    "\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\11\0\1\1\1\2\12\3\1\2\4\3\1\4\1\5"+
    "\2\6\2\1\1\4\1\3\1\7\2\3\1\6\2\10"+
    "\1\11\1\12\1\13\4\3\1\14\1\15\2\16\6\15"+
    "\1\17\2\20\1\21\3\17\1\21\1\17\1\2\2\3"+
    "\1\22\2\3\1\23\3\3\1\2\2\3\1\24\2\3"+
    "\1\2\1\3\1\2\17\3\1\4\1\0\1\4\2\0"+
    "\1\4\2\0\1\25\3\0\14\3\4\0\1\3\1\0"+
    "\2\3\1\2\1\4\23\3\3\0\1\4\1\0\1\4"+
    "\1\26\3\4\12\3\1\27\1\3\1\30\16\3\1\0"+
    "\25\3\1\24\1\3\3\0\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[218];
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
    "\0\0\0\104\0\210\0\314\0\u0110\0\u0154\0\u0198\0\u01dc"+
    "\0\u0220\0\u0264\0\u02a8\0\u02ec\0\u0330\0\u0374\0\u03b8\0\u03fc"+
    "\0\u0440\0\u0484\0\u04c8\0\u050c\0\u0550\0\u0594\0\u05d8\0\u061c"+
    "\0\u0660\0\u06a4\0\u06e8\0\u072c\0\u0770\0\u0264\0\u07b4\0\u07f8"+
    "\0\u083c\0\u0880\0\u0264\0\u08c4\0\u0908\0\u094c\0\u094c\0\u0264"+
    "\0\u0264\0\u0264\0\u0264\0\u0990\0\u09d4\0\u0a18\0\u0a5c\0\u0aa0"+
    "\0\u0264\0\u0264\0\u0ae4\0\u0b28\0\u0b6c\0\u0bb0\0\u0bf4\0\u0c38"+
    "\0\u0c7c\0\u0264\0\u0264\0\u0cc0\0\u0264\0\u0d04\0\u0d48\0\u0d8c"+
    "\0\u0dd0\0\u0e14\0\u0660\0\u0e58\0\u0e9c\0\u0ee0\0\u0f24\0\u0f68"+
    "\0\u0ee0\0\u0fac\0\u0ff0\0\u1034\0\u1078\0\u10bc\0\u1100\0\u0660"+
    "\0\u1144\0\u1188\0\u11cc\0\u1210\0\u1254\0\u1298\0\u12dc\0\u1320"+
    "\0\u1364\0\u13a8\0\u13ec\0\u1430\0\u1474\0\u14b8\0\u14fc\0\u1540"+
    "\0\u1584\0\u15c8\0\u160c\0\u1650\0\u0264\0\u1694\0\u16d8\0\u171c"+
    "\0\u1760\0\u1694\0\u17a4\0\u17e8\0\u0264\0\u182c\0\u1870\0\u18b4"+
    "\0\u18f8\0\u193c\0\u1980\0\u19c4\0\u1a08\0\u1a4c\0\u1a90\0\u1ad4"+
    "\0\u1b18\0\u1b5c\0\u1ba0\0\u1be4\0\u1c28\0\u0b6c\0\u1c6c\0\u1cb0"+
    "\0\u1cf4\0\u1d38\0\u1d7c\0\u1dc0\0\u1e04\0\u0660\0\u1e48\0\u1e8c"+
    "\0\u1ed0\0\u1f14\0\u1f58\0\u1f9c\0\u1fe0\0\u2024\0\u2068\0\u20ac"+
    "\0\u20f0\0\u2134\0\u1078\0\u2178\0\u21bc\0\u2200\0\u2244\0\u2288"+
    "\0\u22cc\0\u2310\0\u2354\0\u2398\0\u23dc\0\u2420\0\u2464\0\u0264"+
    "\0\u24a8\0\u24ec\0\u2530\0\u2574\0\u25b8\0\u25fc\0\u2640\0\u2684"+
    "\0\u26c8\0\u270c\0\u2750\0\u2794\0\u27d8\0\u0264\0\u281c\0\u0264"+
    "\0\u2860\0\u28a4\0\u28e8\0\u292c\0\u2970\0\u29b4\0\u29f8\0\u2a3c"+
    "\0\u2a80\0\u2ac4\0\u2b08\0\u2b4c\0\u2b90\0\u2bd4\0\u2c18\0\u2c5c"+
    "\0\u2ca0\0\u2ce4\0\u2d28\0\u2d6c\0\u2db0\0\u2df4\0\u2e38\0\u2e7c"+
    "\0\u2ec0\0\u2f04\0\u2f48\0\u2f8c\0\u2fd0\0\u3014\0\u3058\0\u309c"+
    "\0\u30e0\0\u3124\0\u3168\0\u31ac\0\u31f0\0\u3234\0\u3278\0\u32bc"+
    "\0\u3300\0\u0264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[218];
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
    "\1\12\3\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\31\1\12\1\34\1\35\1\36\1\12"+
    "\1\37\1\40\1\31\2\33\1\41\1\31\1\42\1\31"+
    "\1\43\1\31\5\33\1\44\1\31\1\45\3\31\1\46"+
    "\1\47\1\36\1\50\1\51\1\52\1\53\1\54\1\31"+
    "\1\55\1\56\2\31\1\57\1\40\1\60\1\0\1\40"+
    "\1\31\1\13\31\61\1\62\1\63\45\61\3\0\27\61"+
    "\1\64\1\61\1\65\1\61\1\66\45\61\3\0\27\61"+
    "\1\67\1\61\1\70\1\61\1\66\45\61\3\0\33\61"+
    "\1\66\44\61\1\71\3\0\1\61\31\72\1\73\1\74"+
    "\44\72\1\75\3\0\1\76\32\72\1\77\44\72\1\100"+
    "\3\0\32\72\1\73\1\74\44\72\1\101\3\0\32\72"+
    "\1\73\1\74\10\72\1\75\34\72\3\0\1\102\105\0"+
    "\3\13\12\0\1\13\64\0\1\13\4\0\1\31\1\103"+
    "\7\31\1\103\1\0\7\31\6\0\5\31\1\104\1\31"+
    "\1\0\6\31\1\105\5\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\3\31\1\107\6\31\1\0\7\31"+
    "\6\0\7\31\1\0\10\31\1\110\3\31\7\0\7\31"+
    "\1\0\1\111\2\0\1\31\5\0\1\112\11\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\4\31\1\113\1\114\2\31"+
    "\1\115\1\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\1\116"+
    "\5\31\1\117\3\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\1\120\5\31\1\121\3\31\1\0\7\31\6\0\7\31"+
    "\1\0\10\31\1\122\3\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\4\31\1\123\2\31\1\124\1\125"+
    "\1\120\1\0\1\31\1\126\5\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\1\31\1\127\10\31\1\0\7\31\6\0\7\31\1\0"+
    "\6\31\1\130\1\31\1\131\3\31\7\0\3\31\1\132"+
    "\3\31\1\0\1\106\2\0\1\31\5\0\7\31\1\133"+
    "\2\31\1\0\2\31\1\134\4\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\1\135\1\136\1\31\1\137\2\31\1\140\3\31\1\0"+
    "\7\31\6\0\7\31\1\0\6\31\1\141\5\31\7\0"+
    "\7\31\1\0\1\106\2\0\1\31\2\0\3\13\12\0"+
    "\1\13\11\0\1\36\31\0\2\36\17\0\1\13\4\0"+
    "\3\31\1\135\6\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\1\113\2\31\1\142\2\31\1\143\3\31\1\0\7\31"+
    "\6\0\7\31\1\0\10\31\1\144\3\31\7\0\7\31"+
    "\1\0\1\106\2\0\1\31\5\0\12\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\12\31\1\0\7\31\6\0\7\31"+
    "\1\0\10\31\1\105\3\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\12\0\1\145\1\146\2\0\1\147\1\150"+
    "\4\0\1\33\1\0\1\33\7\0\3\33\3\0\1\151"+
    "\1\146\5\33\2\152\2\153\1\147\1\145\52\0\1\154"+
    "\1\155\57\0\1\36\12\0\1\36\116\0\1\12\105\0"+
    "\1\40\42\0\1\40\2\0\1\40\6\0\1\156\1\0"+
    "\1\157\2\0\1\145\1\146\2\0\1\147\1\150\4\0"+
    "\1\33\1\0\1\33\7\0\3\33\1\157\2\160\1\151"+
    "\1\146\5\33\2\152\2\153\1\147\1\145\30\0\1\31"+
    "\1\161\4\31\1\162\3\31\1\0\3\31\1\163\3\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\10\31\1\164\1\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\2\31\1\165\1\31\1\166\5\31"+
    "\1\0\3\31\1\167\3\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\17\0\1\36"+
    "\71\0\1\170\2\31\1\171\6\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\1\31\1\172\5\31\1\135\2\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\6\31\1\173\3\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\12\31\1\0\2\31\1\174"+
    "\4\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\100\0\1\175\35\0\1\62\101\0"+
    "\1\155\102\0\1\62\106\0\1\61\100\0\1\154\103\0"+
    "\1\176\154\0\1\177\35\0\1\73\151\0\1\72\3\0"+
    "\1\72\31\0\1\72\151\0\1\200\103\0\1\72\47\0"+
    "\1\72\37\0\1\72\4\0\12\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\4\31\1\201\2\31\1\0"+
    "\1\106\2\0\1\31\5\0\7\31\1\120\2\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\100\0\1\202\10\0\6\31\1\203"+
    "\3\31\1\0\7\31\6\0\7\31\1\0\14\31\7\0"+
    "\7\31\1\0\1\106\2\0\1\31\5\0\7\31\1\204"+
    "\1\31\1\120\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\1\31"+
    "\1\103\10\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\5\31"+
    "\1\103\4\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\5\31"+
    "\1\135\4\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\12\31"+
    "\1\0\1\31\1\120\5\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\7\31"+
    "\1\205\2\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\12\31"+
    "\1\0\3\31\1\206\3\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\10\31"+
    "\1\207\1\31\1\0\1\103\6\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\11\31\1\210\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\7\31"+
    "\1\211\2\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\1\212\6\31\1\0\1\106\2\0\1\31\5\0"+
    "\12\31\1\0\7\31\6\0\7\31\1\0\10\31\1\213"+
    "\3\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\4\31\1\214\5\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\12\31\1\0\7\31\6\0\7\31\1\0\14\31\7\0"+
    "\2\31\1\215\4\31\1\0\1\106\2\0\1\31\5\0"+
    "\12\31\1\0\7\31\6\0\7\31\1\0\6\31\1\216"+
    "\5\31\7\0\3\31\1\120\3\31\1\0\1\106\2\0"+
    "\1\31\5\0\12\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\2\31\1\217\4\31\1\0\1\106\2\0"+
    "\1\31\5\0\12\31\1\0\1\31\1\220\5\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\12\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\2\31\1\221\4\31\1\0\1\106\2\0"+
    "\1\31\5\0\3\31\1\222\6\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\1\31\1\103\10\31\1\0\3\31\1\103"+
    "\3\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\1\31\1\120\10\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\1\223\11\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\12\31\1\0\3\31\1\224\3\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\4\31\1\225\5\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\4\31\1\226\5\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\12\31\1\0\7\31\6\0\7\31"+
    "\1\0\14\31\7\0\1\227\6\31\1\0\1\106\2\0"+
    "\1\31\5\0\2\31\1\230\7\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\7\31\1\231\2\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\37\0\1\232\6\0\1\145\1\233\1\234\102\0"+
    "\1\233\1\234\57\0\1\235\11\0\3\235\5\0\5\235"+
    "\43\0\1\145\1\146\2\0\1\147\26\0\1\146\5\0"+
    "\2\152\2\0\1\147\1\145\25\0\1\236\21\0\1\237"+
    "\11\0\3\237\5\0\5\237\61\0\1\240\111\0\3\241"+
    "\6\0\4\241\41\0\1\242\1\0\1\242\3\0\1\242"+
    "\5\0\1\242\10\0\4\242\1\0\2\242\2\0\5\242"+
    "\2\0\4\242\7\0\1\242\52\0\2\243\50\0\12\31"+
    "\1\0\7\31\6\0\7\31\1\0\10\31\1\244\3\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\4\31"+
    "\1\245\5\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\1\246"+
    "\11\31\1\0\7\31\6\0\7\31\1\0\14\31\7\0"+
    "\7\31\1\0\1\106\2\0\1\31\5\0\6\31\1\247"+
    "\3\31\1\0\7\31\6\0\7\31\1\0\14\31\7\0"+
    "\7\31\1\0\1\106\2\0\1\31\5\0\12\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\1\250\1\31"+
    "\1\215\4\31\1\0\1\106\2\0\1\31\5\0\5\31"+
    "\1\120\4\31\1\0\7\31\6\0\7\31\1\0\6\31"+
    "\1\223\5\31\7\0\7\31\1\0\1\106\2\0\1\31"+
    "\5\0\6\31\1\251\1\31\1\221\1\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\4\31\1\252\5\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\10\31\1\253\1\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\1\226\11\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\12\31\1\0\7\31\6\0\7\31\1\0"+
    "\10\31\1\254\3\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\6\31\1\217\3\31\1\0\7\31\6\0"+
    "\7\31\1\0\10\31\1\255\3\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\100\0\1\256\103\0\1\62\103\0"+
    "\1\75\10\0\12\31\1\0\7\31\6\0\7\31\1\0"+
    "\10\31\1\257\3\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\100\0\1\260\10\0\10\31\1\221\1\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\12\31\1\0\7\31\6\0"+
    "\7\31\1\0\6\31\1\261\5\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\6\31\1\262\3\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\7\31\1\263\2\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\1\264\6\31"+
    "\1\0\1\106\2\0\1\31\5\0\12\31\1\0\7\31"+
    "\6\0\7\31\1\0\10\31\1\135\3\31\7\0\7\31"+
    "\1\0\1\106\2\0\1\31\5\0\12\31\1\0\7\31"+
    "\6\0\7\31\1\0\10\31\1\265\3\31\7\0\7\31"+
    "\1\0\1\106\2\0\1\31\5\0\12\31\1\0\3\31"+
    "\1\266\3\31\6\0\7\31\1\0\14\31\7\0\7\31"+
    "\1\0\1\106\2\0\1\31\5\0\1\31\1\267\10\31"+
    "\1\0\7\31\6\0\7\31\1\0\14\31\7\0\7\31"+
    "\1\0\1\106\2\0\1\31\5\0\1\270\11\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\1\271\11\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\12\31\1\0\7\31\6\0\7\31"+
    "\1\0\10\31\1\206\3\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\12\31\1\0\3\31\1\221\3\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\12\31\1\0\7\31\6\0\7\31"+
    "\1\0\14\31\7\0\2\31\1\272\4\31\1\0\1\106"+
    "\2\0\1\31\5\0\12\31\1\0\7\31\6\0\7\31"+
    "\1\0\10\31\1\120\3\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\7\31\1\273\2\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\10\31\1\216\1\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\3\31\1\274\6\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\12\31\1\0\7\31\6\0\7\31"+
    "\1\0\14\31\7\0\1\120\6\31\1\0\1\106\2\0"+
    "\1\31\5\0\1\31\1\275\10\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\6\31\1\255\3\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\12\31\1\0\2\31\1\276\4\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\47\0\1\145\106\0\1\145\102\0\1\145\44\0"+
    "\1\145\3\0\1\147\5\0\1\235\1\0\1\235\7\0"+
    "\3\235\3\0\1\277\1\0\5\235\2\0\2\153\1\147"+
    "\1\145\47\0\1\237\11\0\3\237\5\0\5\237\43\0"+
    "\1\145\3\0\1\147\5\0\1\237\1\0\1\237\7\0"+
    "\3\237\3\0\1\277\1\0\5\237\4\0\1\147\1\145"+
    "\35\0\1\145\1\146\2\0\1\147\7\0\1\241\7\0"+
    "\3\241\3\0\1\151\1\146\1\0\4\241\2\152\2\0"+
    "\1\147\1\145\33\0\1\242\1\0\1\242\1\146\2\0"+
    "\1\242\5\0\1\242\1\0\1\242\6\0\4\242\1\0"+
    "\2\242\1\151\1\146\5\242\2\152\4\242\7\0\1\242"+
    "\25\0\1\145\1\146\2\0\1\147\7\0\1\243\10\0"+
    "\2\243\3\0\1\151\1\146\5\0\2\152\2\0\1\147"+
    "\1\145\30\0\3\31\1\300\6\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\5\31\1\120\4\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\5\0\12\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\1\300\6\31\1\0\1\106\2\0\1\31"+
    "\5\0\4\31\1\301\5\31\1\0\7\31\6\0\7\31"+
    "\1\0\14\31\7\0\7\31\1\0\1\106\2\0\1\31"+
    "\5\0\12\31\1\0\7\31\6\0\7\31\1\0\10\31"+
    "\1\302\3\31\7\0\7\31\1\0\1\106\2\0\1\31"+
    "\5\0\11\31\1\120\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\7\31\1\303\1\105\1\31\1\0\1\304\6\31\6\0"+
    "\7\31\1\0\14\31\7\0\1\250\6\31\1\0\1\106"+
    "\2\0\1\31\5\0\7\31\1\120\2\31\1\0\7\31"+
    "\6\0\7\31\1\0\10\31\1\120\3\31\7\0\7\31"+
    "\1\0\1\106\2\0\1\31\5\0\12\31\1\0\3\31"+
    "\1\245\3\31\6\0\7\31\1\0\14\31\7\0\7\31"+
    "\1\0\1\106\2\0\1\31\5\0\4\31\1\120\5\31"+
    "\1\0\7\31\6\0\7\31\1\0\14\31\7\0\7\31"+
    "\1\0\1\106\2\0\1\31\5\0\12\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\1\105\6\31\1\0"+
    "\1\106\2\0\1\31\5\0\1\31\1\255\10\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\4\31\1\103\5\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\6\31\1\305\3\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\3\31\1\306\6\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\1\31\1\307\10\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\12\31\1\0\7\31\6\0"+
    "\7\31\1\0\6\31\1\310\5\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\3\31\1\311\6\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\7\31\1\103\2\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\1\31\1\105\10\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\12\31\1\0\3\31\1\312"+
    "\3\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\6\31\1\226\3\31\1\0"+
    "\7\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\12\31\1\0\3\31\1\313"+
    "\3\31\6\0\7\31\1\0\14\31\7\0\7\31\1\0"+
    "\1\106\2\0\1\31\5\0\1\120\11\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\7\31\1\0\1\106"+
    "\2\0\1\31\5\0\1\245\11\31\1\0\7\31\6\0"+
    "\7\31\1\0\14\31\7\0\7\31\1\0\1\106\2\0"+
    "\1\31\12\0\1\145\3\0\1\147\40\0\1\147\1\145"+
    "\30\0\12\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\1\31\1\120\5\31\1\0\1\106\2\0\1\31"+
    "\5\0\12\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\5\31\1\120\1\31\1\0\1\106\2\0\1\31"+
    "\5\0\12\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\2\31\1\105\4\31\1\0\1\106\2\0\1\31"+
    "\5\0\6\31\1\314\3\31\1\0\7\31\6\0\7\31"+
    "\1\0\14\31\7\0\7\31\1\0\1\106\2\0\1\31"+
    "\5\0\12\31\1\0\7\31\6\0\7\31\1\0\10\31"+
    "\1\315\3\31\7\0\7\31\1\0\1\106\2\0\1\31"+
    "\5\0\4\31\1\257\5\31\1\0\7\31\6\0\7\31"+
    "\1\0\14\31\7\0\7\31\1\0\1\106\2\0\1\31"+
    "\5\0\1\31\1\316\10\31\1\0\7\31\6\0\7\31"+
    "\1\0\14\31\7\0\7\31\1\0\1\106\2\0\1\31"+
    "\5\0\11\31\1\317\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\5\31\1\221\4\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\7\31\1\320\2\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\3\31\1\321\6\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\12\31\1\0\3\31\1\322\3\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\4\31\1\323\5\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\1\31\1\324\10\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\5\31\1\325\4\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\3\31\1\326\6\31\1\0\7\31\6\0\7\31\1\0"+
    "\14\31\7\0\7\31\1\0\1\106\2\0\1\31\5\0"+
    "\1\135\11\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\7\31"+
    "\1\221\2\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\12\31"+
    "\1\0\7\31\6\0\7\31\1\0\14\31\7\0\3\31"+
    "\1\120\3\31\1\0\1\106\2\0\1\31\5\0\12\31"+
    "\1\0\7\31\6\0\7\31\1\0\6\31\1\221\5\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\7\31"+
    "\1\210\2\31\1\0\7\31\6\0\7\31\1\0\14\31"+
    "\7\0\7\31\1\0\1\106\2\0\1\31\5\0\12\31"+
    "\1\0\7\31\6\0\7\31\1\0\14\31\7\0\7\31"+
    "\1\327\1\106\2\0\1\31\5\0\12\31\1\0\7\31"+
    "\6\0\7\31\1\0\14\31\7\0\1\221\6\31\1\0"+
    "\1\106\2\0\1\31\100\0\1\330\103\0\1\331\103\0"+
    "\1\332\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13124];
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
    "\11\0\1\11\23\1\1\11\4\1\1\11\4\1\4\11"+
    "\5\1\2\11\7\1\2\11\1\1\1\11\47\1\1\11"+
    "\1\0\1\1\2\0\1\1\2\0\1\11\3\0\14\1"+
    "\4\0\1\1\1\0\27\1\3\0\1\1\1\0\1\1"+
    "\1\11\15\1\1\11\1\1\1\11\16\1\1\0\27\1"+
    "\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[218];
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

// -----------------------------------------------------------------------------
// State stack
// -----------------------------------------------------------------------------

private final Stack<Integer> stateStack = new Stack<Integer>();

/**
 * Pushes new state onto stack and sets parser to begin new state.
 * @param newState New parser state.
 * @return New stack size.
 */
private int pushState(int newState) {
    stateStack.push(yystate());
    yybegin(newState);
    return stateStack.size();
}

/**
 * Pops previous state from stack.
 * @return Previous state.
 */
private int popState() {
    yybegin(stateStack.pop());
    return stateStack.size();
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  NimSyntaxLexer(java.io.Reader in) {
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
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
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 26: break;
          case 2: 
            { return NimSyntaxTypes.OPR;
            } 
            // fall through
          case 27: break;
          case 3: 
            { return NimSyntaxTypes.IDENT;
            } 
            // fall through
          case 28: break;
          case 4: 
            { return NimSyntaxTypes.NUM_LIT;
            } 
            // fall through
          case 29: break;
          case 5: 
            { pushState(LINE_COMMENT); return NimSyntaxTypes.COMMENT;
            } 
            // fall through
          case 30: break;
          case 6: 
            { return NimSyntaxTypes.BRACKET;
            } 
            // fall through
          case 31: break;
          case 7: 
            { pushState(CHARACTER_LITERAL); return NimSyntaxTypes.STR_LIT;
            } 
            // fall through
          case 32: break;
          case 8: 
            { return NimSyntaxTypes.PARENTHESIS;
            } 
            // fall through
          case 33: break;
          case 9: 
            { return NimSyntaxTypes.C_SEMICOLON;
            } 
            // fall through
          case 34: break;
          case 10: 
            { return NimSyntaxTypes.C_COMMA;
            } 
            // fall through
          case 35: break;
          case 11: 
            { return NimSyntaxTypes.C_GRAVE_ACCENT;
            } 
            // fall through
          case 36: break;
          case 12: 
            { pushState(STRING_LITERAL); return NimSyntaxTypes.STR_LIT;
            } 
            // fall through
          case 37: break;
          case 13: 
            { return NimSyntaxTypes.COMMENT;
            } 
            // fall through
          case 38: break;
          case 14: 
            { popState(); return NimSyntaxTypes.COMMENT;
            } 
            // fall through
          case 39: break;
          case 15: 
            { return NimSyntaxTypes.STR_LIT;
            } 
            // fall through
          case 40: break;
          case 16: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 41: break;
          case 17: 
            { popState(); return NimSyntaxTypes.STR_LIT;
            } 
            // fall through
          case 42: break;
          case 18: 
            { pushState(GENERALIZED_STRING_LITERAL); return NimSyntaxTypes.STR_LIT;
            } 
            // fall through
          case 43: break;
          case 19: 
            { pushState(RAW_STRING_LITERAL); return NimSyntaxTypes.STR_LIT;
            } 
            // fall through
          case 44: break;
          case 20: 
            { return NimSyntaxTypes.KEYW;
            } 
            // fall through
          case 45: break;
          case 21: 
            { pushState(BLOCK_COMMENT); return NimSyntaxTypes.COMMENT;
            } 
            // fall through
          case 46: break;
          case 22: 
            { pushState(BLOCK_DOC_COMMENT); return NimSyntaxTypes.COMMENT;
            } 
            // fall through
          case 47: break;
          case 23: 
            { pushState(TRIPLE_STRING_LITERAL); return NimSyntaxTypes.STR_LIT;
            } 
            // fall through
          case 48: break;
          case 24: 
            { pushState(GENERALIZED_TRIPLE_STRING_LITERAL); return NimSyntaxTypes.STR_LIT;
            } 
            // fall through
          case 49: break;
          case 25: 
            { pushState(DISCARD_COMMENT); return NimSyntaxTypes.COMMENT;
            } 
            // fall through
          case 50: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
