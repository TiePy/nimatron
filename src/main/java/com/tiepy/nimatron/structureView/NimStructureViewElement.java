/*
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

package com.tiepy.nimatron.structureView;

import com.google.common.collect.Lists;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.structureView.impl.common.PsiTreeElementBase;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.tiepy.nimatron.NimFile;
import com.tiepy.nimatron.psi.impl.NimProcStmtImpl;
import com.tiepy.nimatron.psi.impl.NimStmtImpl;
import com.tiepy.nimatron.psi.impl.NimStmtsImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

public class NimStructureViewElement extends PsiTreeElementBase<PsiElement> {

    final PsiElement childrenBase;
    private final PsiElement element;

    public NimStructureViewElement(PsiElement childrenBase, PsiElement psiElement) {
        super(psiElement);
        this.element = psiElement;
        this.childrenBase = childrenBase;
    }

    @NotNull
    @Override
    public Collection<StructureViewTreeElement> getChildrenBase() {
        final List<StructureViewTreeElement> children = Lists.newArrayList();

        if (childrenBase instanceof NimFile) {
            for (PsiElement expectedStmtsElement : childrenBase.getChildren()) {
                if (expectedStmtsElement instanceof NimStmtsImpl) {
                    for (PsiElement expectedStmtElement : expectedStmtsElement.getChildren()) {
                        if (expectedStmtElement instanceof NimStmtImpl) {
                            for (PsiElement child : expectedStmtElement.getChildren()) {
                                PsiElement nodeChildrenBase = child;
                                PsiElement nodeElement = child;

                                if (child instanceof NimProcStmtImpl) {
                                    children.add(new NimStructureViewElement(nodeChildrenBase, nodeElement));
                                }
                            }
                        }
                    }
                }
            }
        }

        return children;
    }

    @Nullable
    @Override
    public String getPresentableText() {

        if (element instanceof PsiNameIdentifierOwner) {
            final PsiElement nameIdentifier = ((PsiNameIdentifierOwner) element).getNameIdentifier();
            if (nameIdentifier != null) {
                return nameIdentifier.getText();
            }
        }

        // return element.getText();
        return element.getClass().getName();
    }
}
