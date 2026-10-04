package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.jscomp.graph.GraphColoring;
import com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.LinkedUndirectedGraph;
import com.google.javascript.jscomp.graph.UndiGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.ScriptRuntime;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.HashSet;
import java.util.Map;

public class CoalesceVariableNamesTest {
    @Test
    public void testParseSimpleTypeName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget");
        assertNotNull(result);
        assertEquals("Widget", result.getString());
    }

    @Test
    public void testParseNullType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("null");
        assertNotNull(result);
        assertEquals("null", result.getString());
    }

    @Test
    public void testParseUndefinedType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("undefined");
        assertNotNull(result);
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testParseWildcardType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("*");
        assertNotNull(result);
        assertEquals(Token.STAR, result.getType());
    }

    @Test
    public void testParseNonNullType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("!Widget");
        assertNotNull(result);
        assertEquals(Token.BANG, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testParseNullableType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("?Widget");
        assertNotNull(result);
        assertEquals(Token.QMARK, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testParsePostfixNullableType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget?");
        assertNotNull(result);
        assertEquals(Token.QMARK, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testParsePostfixNonNullType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget!");
        assertNotNull(result);
        assertEquals(Token.BANG, result.getType());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testParseBracketedType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("{Widget}");
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
    }

    @Test
    public void testParseUnionType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("(Widget|string)");
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals("Widget", result.getFirstChild().getString());
        assertEquals("string", result.getLastChild().getString());
    }

    @Test
    public void testParseTopLevelUnion() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Widget|number");
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testParseArrayType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("[Widget]");
        assertNotNull(result);
        assertEquals(Token.LB, result.getType());
        assertEquals(1, result.getChildCount());
        assertEquals("Widget", result.getFirstChild().getString());
    }

    @Test
    public void testParseArrayWithTwoTypes() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("[Widget,number]");
        assertNotNull(result);
        assertEquals(Token.LB, result.getType());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testParseFunctionType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("function(number):string");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testParseFunctionVoidReturn() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("function():void");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(Token.VOID, result.getLastChild().getType());
    }

    @Test
    public void testParseGenericTypeApplication() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Box.<Widget>");
        assertNotNull(result);
        assertEquals("Box", result.getString());
        assertEquals(1, result.getChildCount());
    }

    @Test
    public void testParseUnknownTextReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("?"));
    }

    @Test
    public void testParseEmptyTypeReturnsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString(""));
    }

    @Test
    public void testParsePostfixNullTypeName() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("null?");
        assertEquals(Token.QMARK, result.getType());
        assertEquals("null", result.getFirstChild().getString());
    }

    @Test
    public void testParseEmptyUnionIsNull() throws Exception {
        assertNull(JsDocInfoParser.parseTypeString("()"));
    }

    @Test
    public void testParseArrayVarargsType() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("[...Widget]");
        assertEquals(Token.LB, result.getType());
        assertEquals(Token.ELLIPSIS, result.getFirstChild().getType());
        assertEquals("Widget", result.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testParseRecordWithField() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("{field:number}");
        assertEquals(Token.LC, result.getType());
        assertEquals(Token.LB, result.getFirstChild().getType());
        assertEquals(1, result.getFirstChild().getChildCount());
    }

    @Test
    public void testParseTypeNameWithGenericArgument() throws Exception {
        Node result = JsDocInfoParser.parseTypeString("Box.<number>");
        assertEquals("Box", result.getString());
        assertEquals(Token.BLOCK, result.getFirstChild().getType());
        assertEquals(1, result.getFirstChild().getChildCount());
    }
}
