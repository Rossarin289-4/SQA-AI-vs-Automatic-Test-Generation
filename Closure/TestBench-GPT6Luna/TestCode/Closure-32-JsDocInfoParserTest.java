package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
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
import com.google.javascript.rhino.ScriptRuntime;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsDocInfoParserTest {
    @Test
    public void testSimpleName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget");
        assertNotNull(result);
        assertEquals("Widget", result.getString());
        assertEquals(Token.STRING, result.getType());
    }

    @Test
    public void testNullTypeName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("null");
        assertNotNull(result);
        assertEquals("null", result.getString());
    }

    @Test
    public void testUndefinedTypeName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("undefined");
        assertNotNull(result);
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testWildcard() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("*");
        assertNotNull(result);
        assertEquals(Token.STAR, result.getType());
    }

    @Test
    public void testNullablePrefix() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("?Widget");
        assertNotNull(result);
        assertEquals(Token.QMARK, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testNonNullablePrefix() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("!Widget");
        assertNotNull(result);
        assertEquals(Token.BANG, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testNullableSuffix() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget?");
        assertNotNull(result);
        assertEquals(Token.QMARK, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testNonNullableSuffix() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget!");
        assertNotNull(result);
        assertEquals(Token.BANG, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testUnknownTypeQuestionMark() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("?");
        assertNull(result);
    }

    @Test
    public void testUnionParentheses() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("(Widget|string)");
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildAtIndex(0).getNext() == null ? 1 : 2);
        assertEquals("Widget", result.getFirstChild().getString());
        assertEquals("string", result.getLastChild().getString());
    }

    @Test
    public void testTopLevelUnion() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget|number");
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
        assertEquals("number", result.getLastChild().getString());
    }

    @Test
    public void testEmptyArrayType() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("[]"));
    }

    @Test
    public void testArrayTypeWithElement() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("[Widget]");
        assertNotNull(result);
        assertEquals(Token.LB, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
        assertNull(result.getFirstChild().getNext());
    }

    @Test
    public void testArrayTypeWithTwoElements() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("[Widget,number]");
        assertNotNull(result);
        assertEquals(Token.LB, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
        assertEquals("number", result.getLastChild().getString());
    }

    @Test
    public void testBracedTypeExpression() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("{Widget}"));
    }

    @Test
    public void testGenericTypeExpression() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Array.<Widget>");
        assertNotNull(result);
        assertEquals("Array", result.getString());
        assertEquals("Widget", result.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testFunctionTypeWithoutParameters() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("function()");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(Token.EMPTY, result.getFirstChild().getType());
    }

    @Test
    public void testFunctionTypeWithVoidResult() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("function():void");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(Token.VOID, result.getFirstChild().getType());
    }

    @Test
    public void testFunctionTypeWithParameterAndResult() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("function(Widget):number");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        Node params = result.getFirstChild();
        assertEquals(Token.PARAM_LIST, params.getType());
        assertEquals("Widget", params.getFirstChild().getString());
        assertEquals("number", params.getNext().getString());
    }

    @Test
    public void testRecordFieldType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("{name:string}");
        assertNotNull(result);
        assertEquals(Token.LC, result.getType());
        assertEquals(Token.LB, result.getFirstChild().getType());
        Node field = result.getFirstChild().getFirstChild();
        assertEquals(Token.COLON, field.getType());
        assertEquals("name", field.getFirstChild().getString());
        assertEquals("string", field.getFirstChild().getNext().getString());
    }

    @Test
    public void testInvalidTypeReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString(""));
    }

    @Test
    public void testUnclosedArrayReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("[Widget"));
    }

    @Test
    public void testUnclosedGenericReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("Array.<Widget"));
    }
}
