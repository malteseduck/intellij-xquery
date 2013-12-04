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

package org.intellij.xquery.unit.runner.rt.binding;

import org.intellij.xquery.runner.rt.binding.DocumentBinder;
import org.intellij.xquery.runner.rt.binding.TextBinder;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.namespace.QName;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQItemType;
import javax.xml.xquery.XQPreparedExpression;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * User: ligasgr
 * Date: 05/11/13
 * Time: 15:44
 */
public class TextBinderTest {

    private static final String VALUE = "value";
    private static final String TYPE = "type";
    private XQPreparedExpression expression;
    private XQConnection connection;
    private TextBinder binder;
    private final QName qName = new QName("local");
    private XQItemType xqItemType;

    @Before
    public void setUp() throws XQException {
        expression = mock(XQPreparedExpression.class);
        connection = mock(XQConnection.class);
        binder = new TextBinder();
        xqItemType = mock(XQItemType.class);
        given(connection.createTextType()).willReturn(xqItemType);
    }

    @Test
    public void shouldCreateDocumentTypeUsingConnection() throws Exception {
        binder.bind(expression, connection, qName, VALUE, TYPE);

        verify(connection).createTextType();
    }

    @Test
    public void shouldBindNode() throws Exception {
        binder.bind(expression, connection, qName, VALUE, TYPE);

        verify(expression).bindNode(eq(qName), isA(Node.class), eq(xqItemType));
    }
}
