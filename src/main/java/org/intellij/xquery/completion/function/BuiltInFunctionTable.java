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

package org.intellij.xquery.completion.function;

import com.intellij.util.containers.MultiMap;
import org.intellij.xquery.reference.namespace.XQueryPredeclaredNamespace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 * User: ligasgr
 * Date: 08/12/13
 * Time: 00:23
 */
public class BuiltInFunctionTable {
    private static final MultiMap<String, BuiltInFunctionSignature> fnMap = new MultiMap<String,
            BuiltInFunctionSignature>() {
        @Override
        protected Collection<BuiltInFunctionSignature> createCollection() {
            return new TreeSet<BuiltInFunctionSignature>();
        }
    };

    static {
        fnMap.putValue(ns("fn"), bif("fn", "QName", 2, "$paramURI as xs:string?, $paramQName as xs:string", "xs:QName"));
        fnMap.putValue(ns("fn"), bif("fn", "abs", 1, "$arg as numeric?", "numeric?"));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-date-to-timezone", 1, "$arg as xs:date?", "xs:date?"));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-date-to-timezone", 2, "$arg as xs:date?, $timezone as xs:dayTimeDuration?", "xs:date?"));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-dateTime-to-timezone", 1, "$arg as xs:dateTime?", "xs:dateTime?"));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-dateTime-to-timezone", 2, "$arg as xs:dateTime?, $timezone as xs:dayTimeDuration?", "xs:dateTime?"));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-time-to-timezone", 1, "$arg as xs:time?", "xs:time?"));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-time-to-timezone", 2, "$arg as xs:time?, $timezone as xs:dayTimeDuration?", "xs:time?"));
        fnMap.putValue(ns("fn"), bif("fn", "analyze-string", 2, "$input as xs:string?, $pattern as xs:string", "element(fn:analyze-string-result)"));
        fnMap.putValue(ns("fn"), bif("fn", "analyze-string", 3, "$input as xs:string?, $pattern as xs:string, $flags as xs:string", "element(fn:analyze-string-result)"));
        fnMap.putValue(ns("fn"), bif("fn", "available-environment-variables", 0, "", "xs:string*"));
        fnMap.putValue(ns("fn"), bif("fn", "avg", 1, "$arg as xs:anyAtomicType*", "xs:anyAtomicType?"));
        fnMap.putValue(ns("fn"), bif("fn", "base-uri", 0, "", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "base-uri", 1, "$arg as node()?", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "boolean", 1, "$arg as item()*", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "ceiling", 1, "$arg as numeric?", "numeric?"));
        fnMap.putValue(ns("fn"), bif("fn", "codepoint-equal", 2, "$comparand1 as xs:string?, $comparand2 as xs:string?", "xs:boolean?"));
        fnMap.putValue(ns("fn"), bif("fn", "codepoints-to-string", 1, "$arg as xs:integer*", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "collection", 0, "", "node()*"));
        fnMap.putValue(ns("fn"), bif("fn", "collection", 1, "$arg as xs:string?", "node()*"));
        fnMap.putValue(ns("fn"), bif("fn", "compare", 2, "$comparand1 as xs:string?, $comparand2 as xs:string?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "compare", 3, "$comparand1 as xs:string?, $comparand2 as xs:string?, $collation as xs:string", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 2, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 3, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?, $arg3 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 4, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?, $arg3 as xs:anyAtomicType?, $arg4 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 5, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?, $arg3 as xs:anyAtomicType?, $arg4 as xs:anyAtomicType?, $arg5 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 6, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?, $arg3 as xs:anyAtomicType?, $arg4 as xs:anyAtomicType?, $arg5 as xs:anyAtomicType?, $arg6 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 7, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?, $arg3 as xs:anyAtomicType?, $arg4 as xs:anyAtomicType?, $arg5 as xs:anyAtomicType?, $arg6 as xs:anyAtomicType?, $arg7 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 8, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?, $arg3 as xs:anyAtomicType?, $arg4 as xs:anyAtomicType?, $arg5 as xs:anyAtomicType?, $arg6 as xs:anyAtomicType?, $arg7 as xs:anyAtomicType?, $arg8 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 9, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?, $arg3 as xs:anyAtomicType?, $arg4 as xs:anyAtomicType?, $arg5 as xs:anyAtomicType?, $arg6 as xs:anyAtomicType?, $arg7 as xs:anyAtomicType?, $arg8 as xs:anyAtomicType?, $arg9 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 10, "$arg1 as xs:anyAtomicType?, $arg2 as xs:anyAtomicType?, $arg3 as xs:anyAtomicType?, $arg4 as xs:anyAtomicType?, $arg5 as xs:anyAtomicType?, $arg6 as xs:anyAtomicType?, $arg7 as xs:anyAtomicType?, $arg8 as xs:anyAtomicType?, $arg9 as xs:anyAtomicType?, $arg10 as xs:anyAtomicType?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "contains", 2, "$arg1 as xs:string?, $arg2 as xs:string?", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "contains", 3, "$arg1 as xs:string?, $arg2 as xs:string?, $collation as xs:string", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "count", 1, "$arg as item()*", "xs:integer"));
        fnMap.putValue(ns("fn"), bif("fn", "current-date", 0, "", "xs:date"));
        fnMap.putValue(ns("fn"), bif("fn", "current-dateTime", 0, "", "xs:dateTimeStamp"));
        fnMap.putValue(ns("fn"), bif("fn", "current-time", 0, "", "xs:time"));
        fnMap.putValue(ns("fn"), bif("fn", "data", 0, "", "xs:anyAtomicType*"));
        fnMap.putValue(ns("fn"), bif("fn", "data", 1, "$arg as item()*", "xs:anyAtomicType*"));
        fnMap.putValue(ns("fn"), bif("fn", "dateTime", 2, "$arg1 as xs:date?, $arg2 as xs:time?", "xs:dateTime?"));
        fnMap.putValue(ns("fn"), bif("fn", "day-from-date", 1, "$arg as xs:date?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "day-from-dateTime", 1, "$arg as xs:dateTime?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "days-from-duration", 1, "$arg as xs:duration?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "deep-equal", 2, "$parameter1 as item()*, $parameter2 as item()*", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "deep-equal", 3, "$parameter1 as item()*, $parameter2 as item()*, $collation as xs:string", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "default-collation", 0, "", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "distinct-values", 1, "$arg as xs:anyAtomicType*", "xs:anyAtomicType*"));
        fnMap.putValue(ns("fn"), bif("fn", "distinct-values", 2, "$arg as xs:anyAtomicType*, $collation as xs:string", "xs:anyAtomicType*"));
        fnMap.putValue(ns("fn"), bif("fn", "doc", 1, "$uri as xs:string?", "document-node()?"));
        fnMap.putValue(ns("fn"), bif("fn", "doc-available", 1, "$uri as xs:string?", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "document-uri", 0, "", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "document-uri", 1, "$arg as node()?", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "element-with-id", 1, "$arg as xs:string*", "element()*"));
        fnMap.putValue(ns("fn"), bif("fn", "element-with-id", 2, "$arg as xs:string*, $node as node()", "element()*"));
        fnMap.putValue(ns("fn"), bif("fn", "empty", 1, "$arg as item()*", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "encode-for-uri", 1, "$uri-part as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "ends-with", 2, "$arg1 as xs:string?, $arg2 as xs:string?", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "ends-with", 3, "$arg1 as xs:string?, $arg2 as xs:string?, $collation as xs:string", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "environment-variable", 1, "$name as xs:string", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "error", 0, "", "none"));
        fnMap.putValue(ns("fn"), bif("fn", "error", 1, "$code as xs:QName", "none"));
        fnMap.putValue(ns("fn"), bif("fn", "error", 2, "$code as xs:QName?, $description as xs:string", "none"));
        fnMap.putValue(ns("fn"), bif("fn", "error", 3, "$code as xs:QName?, $description as xs:string, $error-object as item()*", "none"));
        fnMap.putValue(ns("fn"), bif("fn", "escape-html-uri", 1, "$uri as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "exactly-one", 1, "$arg as item()*", "item()"));
        fnMap.putValue(ns("fn"), bif("fn", "exists", 1, "$arg as item()*", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "false", 0, "", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "filter", 2, "$seq as item()*, $f as function(item()) as xs:boolean", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "floor", 1, "$arg as numeric?", "numeric?"));
        fnMap.putValue(ns("fn"), bif("fn", "fold-left", 3, "$seq as item()*, $zero as item()*, $f as function(item()*, item()) as item()*", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "fold-right", 3, "$seq as item()*, $zero as item()*, $f as function(item()*, item()) as item()*", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "for-each", 2, "$seq as item()*, $f as function(item()) as item()*", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "for-each-pair", 3, "$seq1 as item()*, $seq2 as item()*, $f as function(item(), item()) as item()*", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "format-date", 2, "$value as xs:date?, $picture as xs:string", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "format-date", 5, "$value as xs:date?, $picture as xs:string, $language as xs:string?, $calendar as xs:string?, $place as xs:string?", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "format-dateTime", 2, "$value as xs:dateTime?, $picture as xs:string", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "format-dateTime", 5, "$value as xs:dateTime?, $picture as xs:string, $language as xs:string?, $calendar as xs:string?, $place as xs:string?", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "format-integer", 2, "$value as xs:integer?, $picture as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "format-integer", 3, "$value as xs:integer?, $picture as xs:string, $lang as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "format-number", 2, "$value as numeric?, $picture as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "format-number", 3, "$value as numeric?, $picture as xs:string, $decimal-format-name as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "format-time", 2, "$value as xs:time?, $picture as xs:string", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "format-time", 5, "$value as xs:time?, $picture as xs:string, $language as xs:string?, $calendar as xs:string?, $place as xs:string?", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "function-arity", 1, "$func as function(*)", "xs:integer"));
        fnMap.putValue(ns("fn"), bif("fn", "function-lookup", 2, "$name as xs:QName, $arity as xs:integer", "function(*)?"));
        fnMap.putValue(ns("fn"), bif("fn", "function-name", 1, "$func as function(*)", "xs:QName?"));
        fnMap.putValue(ns("fn"), bif("fn", "generate-id", 0, "", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "generate-id", 1, "$arg as node()?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "has-children", 0, "", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "has-children", 1, "$node as node()?", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "head", 1, "$arg as item()*", "item()?"));
        fnMap.putValue(ns("fn"), bif("fn", "hours-from-dateTime", 1, "$arg as xs:dateTime?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "hours-from-duration", 1, "$arg as xs:duration?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "hours-from-time", 1, "$arg as xs:time?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "id", 1, "$arg as xs:string*", "element()*"));
        fnMap.putValue(ns("fn"), bif("fn", "id", 2, "$arg as xs:string*, $node as node()", "element()*"));
        fnMap.putValue(ns("fn"), bif("fn", "idref", 1, "$arg as xs:string*", "node()*"));
        fnMap.putValue(ns("fn"), bif("fn", "idref", 2, "$arg as xs:string*, $node as node()", "node()*"));
        fnMap.putValue(ns("fn"), bif("fn", "implicit-timezone", 0, "", "xs:dayTimeDuration"));
        fnMap.putValue(ns("fn"), bif("fn", "in-scope-prefixes", 1, "$element as element()", "xs:string*"));
        fnMap.putValue(ns("fn"), bif("fn", "index-of", 2, "$seq as xs:anyAtomicType*, $search as xs:anyAtomicType", "xs:integer*"));
        fnMap.putValue(ns("fn"), bif("fn", "index-of", 3, "$seq as xs:anyAtomicType*, $search as xs:anyAtomicType, $collation as xs:string", "xs:integer*"));
        fnMap.putValue(ns("fn"), bif("fn", "innermost", 1, "$nodes as node()*", "node()*"));
        fnMap.putValue(ns("fn"), bif("fn", "insert-before", 3, "$target as item()*, $position as xs:integer, $inserts as item()*", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "iri-to-uri", 1, "$iri as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "lang", 1, "$testlang as xs:string?", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "lang", 2, "$testlang as xs:string?, $node as node()", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "last", 0, "", "xs:integer"));
        fnMap.putValue(ns("fn"), bif("fn", "local-name", 0, "", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "local-name", 1, "$arg as node()?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "local-name-from-QName", 1, "$arg as xs:QName?", "xs:NCName?"));
        fnMap.putValue(ns("fn"), bif("fn", "lower-case", 1, "$arg as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "matches", 2, "$input as xs:string?, $pattern as xs:string", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "matches", 3, "$input as xs:string?, $pattern as xs:string, $flags as xs:string", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "max", 1, "$arg as xs:anyAtomicType*", "xs:anyAtomicType?"));
        fnMap.putValue(ns("fn"), bif("fn", "max", 2, "$arg as xs:anyAtomicType*, $collation as xs:string", "xs:anyAtomicType?"));
        fnMap.putValue(ns("fn"), bif("fn", "min", 1, "$arg as xs:anyAtomicType*", "xs:anyAtomicType?"));
        fnMap.putValue(ns("fn"), bif("fn", "min", 2, "$arg as xs:anyAtomicType*, $collation as xs:string", "xs:anyAtomicType?"));
        fnMap.putValue(ns("fn"), bif("fn", "minutes-from-dateTime", 1, "$arg as xs:dateTime?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "minutes-from-duration", 1, "$arg as xs:duration?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "minutes-from-time", 1, "$arg as xs:time?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "month-from-date", 1, "$arg as xs:date?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "month-from-dateTime", 1, "$arg as xs:dateTime?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "months-from-duration", 1, "$arg as xs:duration?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "name", 0, "", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "name", 1, "$arg as node()?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "namespace-uri", 0, "", "xs:anyURI"));
        fnMap.putValue(ns("fn"), bif("fn", "namespace-uri", 1, "$arg as node()?", "xs:anyURI"));
        fnMap.putValue(ns("fn"), bif("fn", "namespace-uri-for-prefix", 2, "$prefix as xs:string?, $element as element()", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "namespace-uri-from-QName", 1, "$arg as xs:QName?", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "nilled", 0, "", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "nilled", 1, "$arg as node()?", "xs:boolean?"));
        fnMap.putValue(ns("fn"), bif("fn", "node-name", 0, "", "xs:QName?"));
        fnMap.putValue(ns("fn"), bif("fn", "node-name", 1, "$arg as node()?", "xs:QName?"));
        fnMap.putValue(ns("fn"), bif("fn", "normalize-space", 0, "", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "normalize-space", 1, "$arg as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "normalize-unicode", 1, "$arg as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "normalize-unicode", 2, "$arg as xs:string?, $normalizationForm as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "not", 1, "$arg as item()*", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "number", 0, "", "xs:double"));
        fnMap.putValue(ns("fn"), bif("fn", "number", 1, "$arg as xs:anyAtomicType?", "xs:double"));
        fnMap.putValue(ns("fn"), bif("fn", "one-or-more", 1, "$arg as item()*", "item()+"));
        fnMap.putValue(ns("fn"), bif("fn", "outermost", 1, "$nodes as node()*", "node()*"));
        fnMap.putValue(ns("fn"), bif("fn", "parse-xml", 1, "$arg as xs:string?", "document-node(element(*))?"));
        fnMap.putValue(ns("fn"), bif("fn", "parse-xml-fragment", 1, "$arg as xs:string?", "document-node()?"));
        fnMap.putValue(ns("fn"), bif("fn", "path", 0, "", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "path", 1, "$arg as node()?", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "position", 0, "", "xs:integer"));
        fnMap.putValue(ns("fn"), bif("fn", "prefix-from-QName", 1, "$arg as xs:QName?", "xs:NCName?"));
        fnMap.putValue(ns("fn"), bif("fn", "remove", 2, "$target as item()*, $position as xs:integer", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "replace", 3, "$input as xs:string?, $pattern as xs:string, $replacement as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "replace", 4, "$input as xs:string?, $pattern as xs:string, $replacement as xs:string, $flags as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "resolve-QName", 2, "$qname as xs:string?, $element as element()", "xs:QName?"));
        fnMap.putValue(ns("fn"), bif("fn", "resolve-uri", 1, "$relative as xs:string?", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "resolve-uri", 2, "$relative as xs:string?, $base as xs:string", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "reverse", 1, "$arg as item()*", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "root", 0, "", "node()"));
        fnMap.putValue(ns("fn"), bif("fn", "root", 1, "$arg as node()?", "node()?"));
        fnMap.putValue(ns("fn"), bif("fn", "round", 1, "$arg as numeric?", "numeric?"));
        fnMap.putValue(ns("fn"), bif("fn", "round", 2, "$arg as numeric?, $precision as xs:integer", "numeric?"));
        fnMap.putValue(ns("fn"), bif("fn", "round-half-to-even", 1, "$arg as numeric?", "numeric?"));
        fnMap.putValue(ns("fn"), bif("fn", "round-half-to-even", 2, "$arg as numeric?, $precision as xs:integer", "numeric?"));
        fnMap.putValue(ns("fn"), bif("fn", "seconds-from-dateTime", 1, "$arg as xs:dateTime?", "xs:decimal?"));
        fnMap.putValue(ns("fn"), bif("fn", "seconds-from-duration", 1, "$arg as xs:duration?", "xs:decimal?"));
        fnMap.putValue(ns("fn"), bif("fn", "seconds-from-time", 1, "$arg as xs:time?", "xs:decimal?"));
        fnMap.putValue(ns("fn"), bif("fn", "serialize", 1, "$arg as item()*", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "serialize", 2, "$arg as item()*, $params as element(output:serialization-parameters)?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "starts-with", 2, "$arg1 as xs:string?, $arg2 as xs:string?", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "starts-with", 3, "$arg1 as xs:string?, $arg2 as xs:string?, $collation as xs:string", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "static-base-uri", 0, "", "xs:anyURI?"));
        fnMap.putValue(ns("fn"), bif("fn", "string", 0, "", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "string", 1, "$arg as item()?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "string-join", 1, "$arg1 as xs:string*", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "string-join", 2, "$arg1 as xs:string*, $arg2 as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "string-length", 0, "", "xs:integer"));
        fnMap.putValue(ns("fn"), bif("fn", "string-length", 1, "$arg as xs:string?", "xs:integer"));
        fnMap.putValue(ns("fn"), bif("fn", "string-to-codepoints", 1, "$arg as xs:string?", "xs:integer*"));
        fnMap.putValue(ns("fn"), bif("fn", "subsequence", 2, "$sourceSeq as item()*, $startingLoc as xs:double", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "subsequence", 3, "$sourceSeq as item()*, $startingLoc as xs:double, $length as xs:double", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "substring", 2, "$sourceString as xs:string?, $start as xs:double", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "substring", 3, "$sourceString as xs:string?, $start as xs:double, $length as xs:double", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "substring-after", 2, "$arg1 as xs:string?, $arg2 as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "substring-after", 3, "$arg1 as xs:string?, $arg2 as xs:string?, $collation as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "substring-before", 2, "$arg1 as xs:string?, $arg2 as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "substring-before", 3, "$arg1 as xs:string?, $arg2 as xs:string?, $collation as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "sum", 1, "$arg as xs:anyAtomicType*", "xs:anyAtomicType"));
        fnMap.putValue(ns("fn"), bif("fn", "sum", 2, "$arg as xs:anyAtomicType*, $zero as xs:anyAtomicType?", "xs:anyAtomicType?"));
        fnMap.putValue(ns("fn"), bif("fn", "tail", 1, "$arg as item()*", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "timezone-from-date", 1, "$arg as xs:date?", "xs:dayTimeDuration?"));
        fnMap.putValue(ns("fn"), bif("fn", "timezone-from-dateTime", 1, "$arg as xs:dateTime?", "xs:dayTimeDuration?"));
        fnMap.putValue(ns("fn"), bif("fn", "timezone-from-time", 1, "$arg as xs:time?", "xs:dayTimeDuration?"));
        fnMap.putValue(ns("fn"), bif("fn", "tokenize", 2, "$input as xs:string?, $pattern as xs:string", "xs:string*"));
        fnMap.putValue(ns("fn"), bif("fn", "tokenize", 3, "$input as xs:string?, $pattern as xs:string, $flags as xs:string", "xs:string*"));
        fnMap.putValue(ns("fn"), bif("fn", "trace", 2, "$value as item()*, $label as xs:string", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "translate", 3, "$arg as xs:string?, $mapString as xs:string, $transString as xs:string", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "true", 0, "", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "unordered", 1, "$sourceSeq as item()*", "item()*"));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text", 1, "$href as xs:string?", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text", 2, "$href as xs:string?, $encoding as xs:string", "xs:string?"));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text-available", 1, "$href as xs:string?", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text-available", 2, "$href as xs:string?, $encoding as xs:string", "xs:boolean"));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text-lines", 1, "$href as xs:string?", "xs:string*"));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text-lines", 2, "$href as xs:string?, $encoding as xs:string", "xs:string*"));
        fnMap.putValue(ns("fn"), bif("fn", "upper-case", 1, "$arg as xs:string?", "xs:string"));
        fnMap.putValue(ns("fn"), bif("fn", "uri-collection", 0, "", "xs:anyURI*"));
        fnMap.putValue(ns("fn"), bif("fn", "uri-collection", 1, "$arg as xs:string?", "xs:anyURI*"));
        fnMap.putValue(ns("fn"), bif("fn", "year-from-date", 1, "$arg as xs:date?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "year-from-dateTime", 1, "$arg as xs:dateTime?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "years-from-duration", 1, "$arg as xs:duration?", "xs:integer?"));
        fnMap.putValue(ns("fn"), bif("fn", "zero-or-one", 1, "$arg as item()*", "item()?"));
        fnMap.putValue(ns("math"), bif("math", "acos", 1, "$arg as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "asin", 1, "$arg as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "atan", 1, "$arg as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "atan2", 2, "$y as xs:double, $x as xs:double", "xs:double"));
        fnMap.putValue(ns("math"), bif("math", "cos", 1, "$ as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "exp", 1, "$arg as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "exp10", 1, "$arg as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "log", 1, "$arg as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "log10", 1, "$arg as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "pi", 0, "", "xs:double"));
        fnMap.putValue(ns("math"), bif("math", "pow", 2, "$x as xs:double?, $y as numeric", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "sin", 1, "$ as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "sqrt", 1, "$arg as xs:double?", "xs:double?"));
        fnMap.putValue(ns("math"), bif("math", "tan", 1, "$ as xs:double?", "xs:double?"));
    }

    private static String ns(String prefix) {
        return XQueryPredeclaredNamespace.getNamespaceForPrefix(prefix);
    }

    private static BuiltInFunctionSignature bif(String prefix, String name, int arity, String arguments, 
                                                String returnType) {
        return new BuiltInFunctionSignature(ns(prefix), name, arity, arguments, returnType);
    }

    public static Collection<BuiltInFunctionSignature> getFunctionsSignatures(String namespace) {
        return fnMap.get(namespace);
    }

    public static Collection<BuiltInFunctionSignature> getFunctionsSignatures(String namespace, String name) {
        final List<BuiltInFunctionSignature> signatures = new ArrayList<BuiltInFunctionSignature>();
        for (BuiltInFunctionSignature signature : fnMap.get(namespace)) {
            if (name.equals(signature.getName())) {
                signatures.add(signature);
            }
        }
        return signatures;
    }
}
