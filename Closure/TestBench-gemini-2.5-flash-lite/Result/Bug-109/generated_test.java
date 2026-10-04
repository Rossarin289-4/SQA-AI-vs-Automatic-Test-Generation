package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsDocInfoParserTest {

    private static final String SOURCE_NAME = "test.js";



    private Config createConfig() {
        return new Config(
            Sets.<String>newHashSet(),
            Sets.<String>newHashSet(),
            false,
            LanguageMode.ECMASCRIPT3,
            true);
    }

    private Config createConfigWithAnnotation(String annotationName) {
        Set<String> annotations = Sets.newHashSet(annotationName);
        return new Config(
            annotations,
            Sets.<String>newHashSet(),
            false,
            LanguageMode.ECMASCRIPT3,
            true);
    }

    private Node parseAndExpectNotNull(String typeString) {
        Node typeNode = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull("Parsing '" + typeString + "' should not return null", typeNode);
        return typeNode;
    }

    private void assertTypeString(String typeString, String expected) {
        Node typeNode = parseAndExpectNotNull(typeString);
        assertEquals(expected, typeNode.toString());
    }

    @Test
    public void testParseTypeStringInline() throws Exception {
        assertTypeString("string", "string");
    }

    @Test
    public void testParseTypeStringInlineWithBraces() throws Exception {
        assertTypeString("{string}", "{string}");
    }

    @Test
    public void testParseTypeStringInlineArray() throws Exception {
        assertTypeString("Array<number>", "Array.<number>");
    }

    @Test
    public void testParseTypeStringInlineObject() throws Exception {
        assertTypeString("{a: number}", "{a:number}");
    }

    @Test
    public void testParseTypeStringInlineUnion() throws Exception {
        assertTypeString("string|number", "string|number");
    }

    @Test
    public void testParseTypeStringInlineNullable() throws Exception {
        assertTypeString("?string", "?string");
    }

    @Test
    public void testParseTypeStringInlineOptional() throws Exception {
        assertTypeString("string=", "string=");
    }

    @Test
    public void testParseTypeStringInlineRest() throws Exception {
        assertTypeString("...number", "...number");
    }

    @Test
    public void testParseTypeStringInlineFunction() throws Exception {
        assertTypeString("function(string): number", "function(string):number");
    }

    @Test
    public void testParseTypeStringInlineEmpty() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("");
        assertNull(typeNode);
    }

    @Test
    public void testParseTypeStringInlineUnknown() throws Exception {
        assertTypeString("?", "?");
    }

    @Test
    public void testParseTypeStringInlineAny() throws Exception {
        assertTypeString("*", "*");
    }

    @Test
    public void testParseTypeStringInlineQualifiedName() throws Exception {
        assertTypeString("Namespace.Type", "Namespace.Type");
    }

    @Test
    public void testParseTypeStringInlineQualifiedNameWithGenerics() throws Exception {
        assertTypeString("Namespace.Type.<string>", "Namespace.Type.<string>");
    }

    @Test
    public void testParseTypeStringInlineFunctionWithThisContext() throws Exception {
        assertTypeString("function(this:Object, string): number", "function(this:Object,string):number");
    }

    @Test
    public void testParseTypeStringInlineFunctionWithNewContext() throws Exception {
        assertTypeString("function(new:Object, string): number", "function(new:Object,string):number");
    }

    @Test
    public void testParseTypeStringInlineParamOptionalWithBrackets() throws Exception {
        assertTypeString("[string=]", "string=");
    }

    @Test
    public void testParseTypeStringInlineParamRest() throws Exception {
        assertTypeString("[...string]", "...string");
    }

    @Test
    public void testParseTypeStringInlineRecordWithMultipleFields() throws Exception {
        assertTypeString("{field1: string, field2: number}", "{field1:string,field2:number}");
    }

    @Test
    public void testParseTypeStringInlineUnionWithCommas() throws Exception {
        assertTypeString("string,number", "string|number"); // Comma is treated as pipe
    }

    @Test
    public void testParseTypeStringInlineArrayWithMultipleElements() throws Exception {
        assertTypeString("[string, number]", "[string,number]");
    }

    @Test
    public void testParseTypeStringInlineArrayWithRest() throws Exception {
        assertTypeString("[...string]", "...string");
    }

    @Test
    public void testParseTypeStringInlineArrayWithEllipsisAndType() throws Exception {
        assertTypeString("[..., string]", "[...,string]");
    }

    @Test
    public void testParseTypeStringInlineFunctionWithMultipleParams() throws Exception {
        assertTypeString("function(string, number, boolean): string", "function(string,number,boolean):string");
    }

    @Test
    public void testParseTypeStringInlineFunctionWithOptionalParam() throws Exception {
        assertTypeString("function(string=, number): string", "function(string=,number):string");
    }

    @Test
    public void testParseTypeStringInlineFunctionWithRestParam() throws Exception {
        assertTypeString("function(string, ...number): string", "function(string,...number):string");
    }
}
