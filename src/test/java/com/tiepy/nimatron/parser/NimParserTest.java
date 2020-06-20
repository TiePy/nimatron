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

package com.tiepy.nimatron.parser;

import com.intellij.testFramework.ParsingTestCase;

public class NimParserTest extends ParsingTestCase {
    public NimParserTest() {
        super("", "nim", new NimParserDefinition());
    }

    public void testBlockCommentCommand() {
        doTest(true, true);
    }

    public void testEchoBracketed() {
        doTest(true, true);
    }

    public void testEchoDollarFoo() {
        doTest(true, true);
    }

    public void testEchoMultiArgsNoBrackets() {
        doTest(true, true);
    }

    public void testEchoSpace() {
        doTest(true, true);
    }

    public void testEmpty() {
        doTest(true, true);
    }

    public void testIfElifElse() {
        doTest(true, true);
    }

    public void testIfElifElseMultiArgsNoBrackets() {
        doTest(true, true);
    }

    public void testIfElifElseWithoutIndent() {
        doTest(true, true);
    }

    public void testIfIndent() {
        doTest(true, true);
    }

    public void testIfIndentElseSameLine() {
        doTest(true, true);
    }

    public void testIfIndentNewLineElseSameLine() {
        doTest(true, true);
    }

    public void testIfSameLine() {
        doTest(true, true);
    }

    public void testNestedIfs() {
        doTest(true, true);
    }

    public void testNestedIfsDoubleDed() {
        doTest(true, true);
    }

    /**
     * @return path to test data file directory relative to root of this module.
     */
    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}
