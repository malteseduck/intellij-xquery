/*
 * Copyright 2013 Grzegorz Ligas <ligasgr@gmail.com> and other contributors (see the CONTRIBUTORS file).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.xquery.reference.variable;

import com.intellij.psi.PsiElement;
import org.intellij.xquery.Assertions;
import org.intellij.xquery.BaseFunctionalTestCase;
import org.intellij.xquery.psi.XQueryFunctionDecl;
import org.intellij.xquery.psi.XQueryLetBinding;
import org.intellij.xquery.psi.XQueryParam;
import org.intellij.xquery.psi.XQueryVarDecl;
import org.intellij.xquery.psi.XQueryVarRef;

import static com.intellij.psi.util.PsiTreeUtil.getParentOfType;
import static org.intellij.xquery.reference.ReferenceUtil.getTargetOfReferenceAtCaret;

/**
 * User: ligasgr
 * Date: 28/06/13
 * Time: 13:25
 */
public class XQueryVariableReferenceTest extends BaseFunctionalTestCase {

    @Override
    protected String getTestDataPath() {
        return "src/testFunctional/testData/org/intellij/xquery/reference/variable";
    }

    public void testVariableRenameInTheSameFile() {
        myFixture.configureByFiles("VariableRenameInTheSameFile.xq");
        myFixture.renameElementAtCaret("renamed");
        myFixture.checkResultByFile("VariableRenameInTheSameFile.xq", "VariableRenameInTheSameFileAfter.xq", false);
    }

    public void testVariableReferenceOfGlobalVariable() {
        myFixture.configureByFiles("VariableReferenceInTheSameFile_Global.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        Assertions.assertChildOf(resolvedReference, XQueryVarDecl.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarRef.class);
    }

    public void testVariableReferenceOfFunctionArgument() {
        myFixture.configureByFiles("VariableReferenceInTheSameFile_FunctionArgument.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        Assertions.assertChildOf(resolvedReference, XQueryFunctionDecl.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarRef.class);
    }

    public void testVariableReferenceOfFlworExpressionReference() {
        myFixture.configureByFiles("VariableReferenceInTheSameFile_Flwor.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        Assertions.assertChildOf(resolvedReference, XQueryLetBinding.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarRef.class);
    }

    public void testVariableReferenceScopeOfGlobalVariableFromQueryBody() {
        myFixture.configureByFiles("VariableReferenceScopes_Global.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        Assertions.assertChildOf(resolvedReference, XQueryVarDecl.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryLetBinding.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryParam.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarRef.class);
    }

    public void testVariableReferenceScopeOfGlobalVariableFromAnotherGlobalVariable() {
        myFixture.configureByFiles("VariableReferenceScopes_GlobalVar.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        Assertions.assertChildOf(resolvedReference, XQueryVarDecl.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryLetBinding.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryParam.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarRef.class);
    }

    public void testVariableReferenceScopeOfFunctionArgument() {
        myFixture.configureByFiles("VariableReferenceScopes_Function.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        Assertions.assertChildOf(resolvedReference, XQueryParam.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarDecl.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryLetBinding.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarRef.class);
    }

    public void testVariableReferenceScopeOfLocalVariableReference() {
        myFixture.configureByFiles("VariableReferenceScopes_Local.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        Assertions.assertChildOf(resolvedReference, XQueryLetBinding.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryParam.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarDecl.class);
        Assertions.assertNotChildOf(resolvedReference, XQueryVarRef.class);
    }

    public void testVariableReferenceFromAnotherFile() {
        myFixture.configureByFiles("VariableReferenceFromAnotherFile.xq", "VariableReferencedFile.xq");
        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        Assertions.assertChildOf(resolvedReference, XQueryVarDecl.class);
        XQueryVarDecl varDecl = getParentOfType(resolvedReference, XQueryVarDecl.class);
        assertEquals("VariableReferencedFile.xq", varDecl.getContainingFile().getName());
    }

    public void testVariableReferenceToNotExistingVariable() {
        myFixture.configureByFiles("VariableReferenceToNotExistingVariable.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        assertNull(resolvedReference);
    }

    public void testVariableReferenceToDuplicatedVariable() {
        myFixture.configureByFiles("VariableReferenceToDuplicatedVariable.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        assertNull(resolvedReference);
    }

    public void testVariableReferenceToVariableDuplicatedInImport() {
        myFixture.configureByFiles("VariableReferenceToVariableDuplicatedInImport.xq", "VariableReferencedFile.xq");

        PsiElement resolvedReference = getTargetOfReferenceAtCaret(myFixture, XQueryVarRef.class);

        assertNull(resolvedReference);
    }
}