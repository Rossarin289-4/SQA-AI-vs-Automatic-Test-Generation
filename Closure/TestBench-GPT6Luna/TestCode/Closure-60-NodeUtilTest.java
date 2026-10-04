package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class NodeUtilTest {
    @Test
    public void testNearestFunctionNameUsesFunctionName() throws Exception {
        Node fn = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "named"),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        Node script = new Node(Token.SCRIPT, fn);
        assertEquals("named", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testNearestFunctionNameUsesObjectStringKey() throws Exception {
        Node fn = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, ""),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        Node key = Node.newString(Token.STRING, "entry");
        Node object = new Node(Token.OBJECTLIT, key);
        key.addChildToBack(fn);
        assertEquals("entry", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testNearestFunctionNameForAnonymousUnkeyedFunction() throws Exception {
        Node fn = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, ""),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        Node parent = new Node(Token.BLOCK, fn);
        assertNull(NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testNewExprWrapsChildAndRetainsIt() throws Exception {
        Node child = Node.newNumber(7);
        Node expr = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertSame(child, expr.getFirstChild());
    }

    @Test
    public void testPredicateHelperMatchesType() throws Exception {
        NodeUtil.MatchNodeType predicate = new NodeUtil.MatchNodeType(Token.NUMBER);
        assertTrue(predicate.apply(Node.newNumber(3)));
        assertFalse(predicate.apply(Node.newString("x")));
    }

    @Test
    public void testNewFunctionNodeSetsNameParametersAndBody() throws Exception {
        Node param = Node.newString(Token.NAME, "arg");
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("run", Arrays.asList(param), body, 1, 2);
        assertEquals(Token.FUNCTION, fn.getType());
        assertEquals("run", fn.getFirstChild().getString());
        assertSame(param, NodeUtil.getFunctionParameters(fn).getFirstChild());
        assertSame(body, fn.getLastChild());
    }

    @Test
    public void testNewQualifiedNameNodeBuildsQualifiedPath() throws Exception {
        CodingConvention convention = new ClosureCodingConvention();
        Node qName = NodeUtil.newQualifiedNameNode(convention, "root.child.leaf", 0, 0);
        assertEquals(Token.GETPROP, qName.getType());
        assertEquals("root.child.leaf", qName.getQualifiedName());
        assertEquals("root", NodeUtil.getRootOfQualifiedName(qName).getString());
    }

    @Test
    public void testNewQualifiedNameNodeWithoutDotIsName() throws Exception {
        CodingConvention convention = new ClosureCodingConvention();
        Node qName = NodeUtil.newQualifiedNameNode(convention, "root", 0, 0);
        assertEquals(Token.NAME, qName.getType());
        assertEquals("root", qName.getQualifiedName());
        assertSame(qName, NodeUtil.getRootOfQualifiedName(qName));
    }

    @Test
    public void testVarsDeclaredInBranchCollectsDistinctNames() throws Exception {
        Node branch = new Node(Token.BLOCK,
                NodeUtil.newVarNode("a", null),
                NodeUtil.newVarNode("b", null),
                NodeUtil.newVarNode("a", null));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(2, vars.size());
        assertEquals("a", vars.iterator().next().getString());
    }

    @Test
    public void testVarsDeclaredInBranchDoesNotDescendIntoFunction() throws Exception {
        Node nestedVar = NodeUtil.newVarNode("inner", null);
        Node fn = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK, nestedVar));
        Node branch = new Node(Token.BLOCK, NodeUtil.newVarNode("outer", null), fn);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(1, vars.size());
        assertEquals("outer", vars.iterator().next().getString());
    }

    @Test
    public void testGetFunctionParametersReturnsParameterList() throws Exception {
        Node first = Node.newString(Token.NAME, "first");
        Node second = Node.newString(Token.NAME, "second");
        Node fn = NodeUtil.newFunctionNode("f", Arrays.asList(first, second),
                new Node(Token.BLOCK), 0, 0);
        Node params = NodeUtil.getFunctionParameters(fn);
        assertSame(first, params.getFirstChild());
        assertSame(second, first.getNext());
    }

    @Test
    public void testGetFunctionJSDocInfoReturnsNullWhenAbsent() throws Exception {
        Node fn = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        Node script = new Node(Token.SCRIPT, fn);
        assertNull(NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testGetSourceNameReturnsNullWhenAbsent() throws Exception {
        Node root = new Node(Token.SCRIPT, Node.newNumber(1));
        assertNull(NodeUtil.getSourceName(root.getFirstChild()));
    }
}
