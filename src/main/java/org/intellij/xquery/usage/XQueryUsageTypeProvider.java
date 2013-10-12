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

package org.intellij.xquery.usage;

import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.usages.impl.rules.UsageType;
import com.intellij.usages.impl.rules.UsageTypeProvider;
import org.intellij.xquery.psi.XQueryFunctionName;
import org.intellij.xquery.psi.XQueryLiteral;
import org.intellij.xquery.psi.XQueryVarName;
import org.intellij.xquery.psi.XQueryVarRef;
import org.jetbrains.annotations.Nullable;

/**
 * User: ligasgr
 * Date: 08/07/13
 * Time: 14:18
 */
public class XQueryUsageTypeProvider implements UsageTypeProvider {
    @Nullable
    @Override
    public UsageType getUsageType(PsiElement element) {
        if (element == null) return null;

        if (element.getParent() instanceof XQueryLiteral) {
            return UsageType.LITERAL_USAGE;
        }
        if (element instanceof XQueryVarName && PsiTreeUtil.getParentOfType(element, XQueryVarRef.class, false) != null) {
            return UsageType.READ;
        }
        return null;
    }
}
