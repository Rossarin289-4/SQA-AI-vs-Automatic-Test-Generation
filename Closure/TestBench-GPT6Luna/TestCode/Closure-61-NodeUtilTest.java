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
    public void testNewExprWrapsChild() throws Exception {
        Node child = Node.newNumber(2);
        Node result = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertSame(child, result.getFirstChild());
    }

    @Test
    public void testNewFunctionNodeStoresParametersAndBody() throws Exception {
        Node param = Node.newString(Token.NAME, "p");
        Node body = new Node(Token.BLOCK);
        Node function = NodeUtil.newFunctionNode("f", Arrays.asList(param), body, 1, 2);
        assertEquals(Token.FUNCTION, function.getType());
        assertEquals("f", function.getFirstChild().getString());
        assertSame(param, NodeUtil.getFunctionParameters(function).getFirstChild());
        assertSame(body, function.getLastChild());
    }

    @Test
    public void testFunctionParametersEmpty() throws Exception {
        Node function = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(),
                new Node(Token.BLOCK), 0, 0);
        assertEquals(Token.LP, NodeUtil.getFunctionParameters(function).getType());
        assertNull(NodeUtil.getFunctionParameters(function).getFirstChild());
    }

    @Test
    public void testRootOfSimpleQualifiedName() throws Exception {
        Node name = Node.newString(Token.NAME, "root");
        Node qualified = new Node(Token.GETPROP, name, Node.newString(Token.STRING, "field"));
        assertSame(name, NodeUtil.getRootOfQualifiedName(qualified));
    }

    @Test
    public void testRootOfNestedQualifiedName() throws Exception {
        Node root = Node.newString(Token.NAME, "a");
        Node first = new Node(Token.GETPROP, root, Node.newString(Token.STRING, "b"));
        Node qualified = new Node(Token.GETPROP, first, Node.newString(Token.STRING, "c"));
        assertSame(root, NodeUtil.getRootOfQualifiedName(qualified));
    }

    @Test
    public void testQualifiedNameConstructionSingleName() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "plain", 3, 4);
        assertEquals(Token.NAME, name.getType());
        assertEquals("plain", name.getString());
    }

    @Test
    public void testQualifiedNameConstructionProperties() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "base.part", 3, 4);
        assertEquals(Token.GETPROP, name.getType());
        assertEquals("base.part", name.getQualifiedName());
        assertEquals("base", NodeUtil.getRootOfQualifiedName(name).getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchCollectsDeclarations() throws Exception {
        Node varA = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node varB = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        Node root = new Node(Token.BLOCK, varA, varB);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(2, vars.size());
        assertEquals("a", vars.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchExcludesNestedFunction() throws Exception {
        Node nestedVar = new Node(Token.VAR, Node.newString(Token.NAME, "inner"));
        Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(),
                new Node(Token.BLOCK, nestedVar), 0, 0);
        Node outerVar = new Node(Token.VAR, Node.newString(Token.NAME, "outer"));
        Node root = new Node(Token.BLOCK, outerVar, fn);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertEquals("outer", vars.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchKeepsFirstDuplicate() throws Exception {
        Node first = Node.newString(Token.NAME, "same");
        Node second = Node.newString(Token.NAME, "same");
        Node root = new Node(Token.BLOCK, new Node(Token.VAR, first),
                new Node(Token.VAR, second));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertSame(first, vars.iterator().next());
    }

    @Test
    public void testGetSourceNameOnNode() throws Exception {
        Node node = new Node(Token.NAME);
        node.putProp(Node.SOURCENAME_PROP, "source.js");
        assertEquals("source.js", NodeUtil.getSourceName(node));
    }

    @Test
    public void testGetSourceNameFallsBackToAncestor() throws Exception {
        Node parent = new Node(Token.BLOCK);
        parent.putProp(Node.SOURCENAME_PROP, "parent.js");
        Node child = Node.newNumber(1);
        parent.addChildToBack(child);
        assertEquals("parent.js", NodeUtil.getSourceName(child));
    }

    @Test
    public void testGetSourceNameMissingIsNull() throws Exception {
        assertNull(NodeUtil.getSourceName(new Node(Token.NAME)));
    }

    @Test
    public void testGetFunctionJSDocInfoUsesFunctionInfo() throws Exception {
        Node function = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(),
                new Node(Token.BLOCK), 0, 0);
        Node script = new Node(Token.SCRIPT, function);
        assertNull(NodeUtil.getFunctionJSDocInfo(function));
    }

    @Test
    public void testPredicateApplyMatchesNodeType() throws Exception {
        NodeUtil.MatchNodeType predicate = new NodeUtil.MatchNodeType(Token.NUMBER);
        assertTrue(predicate.apply(Node.newNumber(1)));
        assertFalse(predicate.apply(Node.newString(Token.STRING, "x")));
    }

    @Test
    public void testGetNearestFunctionNameUsesDeclaredName() throws Exception {
        Node function = NodeUtil.newFunctionNode("named", Collections.<Node>emptyList(),
                new Node(Token.BLOCK), 0, 0);
        Node script = new Node(Token.SCRIPT, function);
        assertEquals("named", NodeUtil.getNearestFunctionName(function));
    }

    @Test
    public void testGetNearestFunctionNameUsesAssignedVariableName() throws Exception {
        Node function = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(),
                new Node(Token.BLOCK), 0, 0);
        Node name = Node.newString(Token.NAME, "assigned");
        name.addChildToBack(function);
        assertEquals("assigned", NodeUtil.getNearestFunctionName(function));
    }
}
