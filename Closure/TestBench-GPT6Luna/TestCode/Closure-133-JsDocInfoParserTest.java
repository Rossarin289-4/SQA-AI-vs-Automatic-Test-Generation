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
    public void testStarType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("*");
        assertNotNull(node);
        assertEquals(Token.STAR, node.getType());
    }

    @Test
    public void testUnknownNullableType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("?");
        assertNotNull(node);
        assertEquals(Token.QMARK, node.getType());
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
    public void testParenthesizedUnion() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("(A|B)");
        assertNotNull(node);
        assertEquals(Token.PIPE, node.getType());
        assertEquals("A", node.getFirstChild().getString());
        assertEquals("B", node.getLastChild().getString());
        assertNull(node.getLastChild().getNext());
    }

    @Test
    public void testTopLevelUnion() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("A|B");
        assertNotNull(node);
        assertEquals(Token.PIPE, node.getType());
        assertEquals("A", node.getFirstChild().getString());
        assertEquals("B", node.getLastChild().getString());
    }

    @Test
    public void testDoublePipeUnion() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("A||B");
        assertNotNull(node);
        assertEquals(Token.PIPE, node.getType());
        assertEquals(2, node.getChildAtIndex(1) == null ? 1 : 2);
        assertEquals("A", node.getFirstChild().getString());
        assertEquals("B", node.getLastChild().getString());
    }

    @Test
    public void testArrayType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("[Widget]");
        assertNotNull(node);
        assertEquals(Token.LB, node.getType());
        assertEquals("Widget", node.getFirstChild().getString());
        assertNull(node.getFirstChild().getNext());
    }

    @Test
    public void testArrayWithTwoElementTypes() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("[A,B]");
        assertNotNull(node);
        assertEquals(Token.LB, node.getType());
        assertEquals("A", node.getFirstChild().getString());
        assertEquals("B", node.getLastChild().getString());
    }

    @Test
    public void testArrayWithVarargsType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("[...Widget]");
        assertNotNull(node);
        assertEquals(Token.LB, node.getType());
        assertEquals(Token.ELLIPSIS, node.getFirstChild().getType());
        assertEquals("Widget", node.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testRecordType() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("{name:string}");
        assertNotNull(node);
        assertEquals(Token.LC, node.getType());
        assertEquals(Token.LB, node.getFirstChild().getType());
        assertEquals(Token.COLON,
            node.getFirstChild().getFirstChild().getType());
        assertEquals("name",
            node.getFirstChild().getFirstChild().getFirstChild().getString());
        assertEquals("string",
            node.getFirstChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testGenericTypeApplication() throws Exception {
        Node node = JsDocInfoParser.parseTypeString("Array.<Widget>");
        assertNotNull(node);
        assertEquals("Array", node.getString());
        assertNotNull(node.getFirstChild());
        assertEquals(Token.BLOCK, node.getFirstChild().getType());
        assertEquals("Widget", node.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testEmptyTypeInput() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString(""));
    }

    @Test
    public void testInvalidTypeInput() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("@"));
    }
}
