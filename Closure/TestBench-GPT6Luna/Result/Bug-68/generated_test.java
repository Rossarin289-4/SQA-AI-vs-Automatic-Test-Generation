package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptRuntime;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class JsDocInfoParserTest {
    @Test
    public void testSimpleName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget");
        assertEquals(Token.STRING, result.getType());
        assertEquals("Widget", result.getString());
    }

    @Test
    public void testNullTypeName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("null");
        assertEquals(Token.STRING, result.getType());
        assertEquals("null", result.getString());
    }

    @Test
    public void testUndefinedTypeName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("undefined");
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testStarType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("*");
        assertEquals(Token.STAR, result.getType());
    }

    @Test
    public void testUnknownType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("?Widget");
        assertEquals(Token.QMARK, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testNullableName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("?Widget");
        assertEquals(Token.QMARK, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testNonNullableName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("!Widget");
        assertEquals(Token.BANG, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testPostfixNullableName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget?");
        assertEquals(Token.QMARK, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testPostfixNonNullableName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget!");
        assertEquals(Token.BANG, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testArrayType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("[Widget]");
        assertEquals(Token.LB, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testArrayWithTwoElements() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("[Widget,Other]");
        assertEquals(Token.LB, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
        assertEquals("Other", result.getLastChild().getString());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testEmptyArrayTypeReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("[]"));
    }

    @Test
    public void testUnionType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("(Widget|Other)");
        assertEquals(Token.PIPE, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
        assertEquals("Other", result.getLastChild().getString());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testTopLevelUnion() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget|Other");
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testTopLevelDoublePipeUnion() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget||Other");
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testEmptyRecordReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("{}"));
    }

    @Test
    public void testRecordWithOneTypedField() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("{name:Widget}");
        assertEquals(Token.LC, result.getType());
        Node fields = result.getFirstChild();
        assertEquals(Token.LB, fields.getType());
        Node field = fields.getFirstChild();
        assertEquals(Token.COLON, field.getType());
        assertEquals("name", field.getFirstChild().getString());
        assertEquals("Widget", field.getLastChild().getString());
    }

    @Test
    public void testRecordWithUntypedField() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("{name}");
        assertEquals(Token.LC, result.getType());
        assertEquals("name", result.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testFunctionWithNoParametersAndVoidResult() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("function():void");
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(Token.VOID, result.getFirstChild().getType());
    }

    @Test
    public void testFunctionWithOneParameterAndResult() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("function(Widget):Other");
        assertEquals(Token.FUNCTION, result.getType());
        Node params = result.getFirstChild();
        assertEquals(Token.LP, params.getType());
        assertEquals("Widget", params.getFirstChild().getString());
        assertEquals("Other", result.getLastChild().getString());
    }

    @Test
    public void testFunctionWithoutExplicitResult() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("function()");
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(Token.EMPTY, result.getFirstChild().getType());
    }

    @Test
    public void testGenericType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("List.<Widget>");
        assertEquals(Token.STRING, result.getType());
        assertEquals("List", result.getString());
        assertTrue(result.hasChildren());
        assertEquals("Widget", result.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testMalformedArrayReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("[Widget"));
    }

    @Test
    public void testMalformedGenericReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("List.<Widget"));
    }

    @Test
    public void testMalformedFunctionReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("function(Widget"));
    }

    @Test
    public void testEmptyInputReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString(""));
    }
}
