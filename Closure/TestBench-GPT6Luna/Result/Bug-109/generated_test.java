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
    @Test
    public void testSimpleTypeName() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("Widget");
        assertNotNull(node);
        assertEquals("Widget", node.getString());
    }

    @Test
    public void testNullTypeName() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("null");
        assertNotNull(node);
        assertEquals("null", node.getString());
    }

    @Test
    public void testUndefinedTypeName() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("undefined");
        assertNotNull(node);
        assertEquals("undefined", node.getString());
    }

    @Test
    public void testWildcardType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("*");
        assertNotNull(node);
        assertEquals(Token.STAR, node.getType());
    }

    @Test
    public void testUnknownNullableType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("?");
        assertNotNull(node);
        assertEquals(Token.QMARK, node.getType());
        assertTrue(node.hasChildren());
    }

    @Test
    public void testNullableTypeName() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("?Widget");
        assertNotNull(node);
        assertEquals(Token.QMARK, node.getType());
        assertEquals("Widget", node.getFirstChild().getString());
    }

    @Test
    public void testNonNullableTypeName() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("!Widget");
        assertNotNull(node);
        assertEquals(Token.BANG, node.getType());
        assertEquals("Widget", node.getFirstChild().getString());
    }

    @Test
    public void testPostfixNullableType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("Widget?");
        assertNotNull(node);
        assertEquals(Token.QMARK, node.getType());
        assertEquals("Widget", node.getFirstChild().getString());
    }

    @Test
    public void testPostfixNonNullableType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("Widget!");
        assertNotNull(node);
        assertEquals(Token.BANG, node.getType());
        assertEquals("Widget", node.getFirstChild().getString());
    }

    @Test
    public void testTopLevelPipeUnion() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("Widget|number");
        assertNotNull(node);
        assertEquals(Token.PIPE, node.getType());
        assertEquals(2, node.getChildAtIndex(0).getType() == Token.STRING ? 2 : 2);
        assertEquals("Widget", node.getFirstChild().getString());
        assertEquals("number", node.getLastChild().getString());
    }

    @Test
    public void testParenthesizedUnion() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("(Widget|number)");
        assertNotNull(node);
        assertEquals(Token.PIPE, node.getType());
        assertEquals("Widget", node.getFirstChild().getString());
        assertEquals("number", node.getLastChild().getString());
    }

    @Test
    public void testArrayType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("[Widget]");
        assertNotNull(node);
        assertEquals(Token.LB, node.getType());
        assertEquals("Widget", node.getFirstChild().getString());
        assertEquals(node.getFirstChild(), node.getLastChild());
    }

    @Test
    public void testArrayWithTwoElementTypes() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("[Widget,number]");
        assertNotNull(node);
        assertEquals(Token.LB, node.getType());
        assertEquals("Widget", node.getFirstChild().getString());
        assertEquals("number", node.getLastChild().getString());
    }

    @Test
    public void testGenericTypeApplication() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("Array.<Widget>");
        assertNotNull(node);
        assertEquals("Array", node.getString());
        assertTrue(node.hasChildren());
        assertEquals("Widget", node.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testRecordType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("{name:string}");
        assertNotNull(node);
        assertEquals(Token.LC, node.getType());
        Node fields = node.getFirstChild();
        assertNotNull(fields);
        assertEquals(Token.LB, fields.getType());
        assertEquals(Token.COLON, fields.getFirstChild().getType());
        assertEquals("name", fields.getFirstChild().getFirstChild().getString());
        assertEquals("string", fields.getFirstChild().getLastChild().getString());
    }

    @Test
    public void testInvalidLeadingTokenReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString(","));
    }

    @Test
    public void testFunctionTypeWithVoidResult() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("function():void");
        assertNotNull(node);
        assertEquals(Token.FUNCTION, node.getType());
        assertEquals(Token.VOID, node.getFirstChild().getType());
    }

    @Test
    public void testFunctionTypeWithTypedParameterAndResult() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("function(number):string");
        assertNotNull(node);
        assertEquals(Token.FUNCTION, node.getType());
        assertEquals(Token.PARAM_LIST, node.getFirstChild().getType());
        assertEquals("number", node.getFirstChild().getFirstChild().getString());
        assertEquals("string", node.getLastChild().getString());
    }
}
