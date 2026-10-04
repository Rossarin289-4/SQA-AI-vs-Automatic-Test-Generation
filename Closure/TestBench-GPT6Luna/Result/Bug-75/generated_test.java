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
    public void testGetVarsDeclaredInBranchSkipsFunctionScope() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node outerVar = new Node(Token.VAR, Node.newString(Token.NAME, "outer"));
        Node innerFunction = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK, new Node(Token.VAR, Node.newString(Token.NAME, "inner"))));
        root.addChildToBack(outerVar);
        root.addChildToBack(innerFunction);

        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertSame(outerVar.getFirstChild(), vars.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranchDeduplicatesByName() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node first = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        Node second = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        root.addChildToBack(first);
        root.addChildToBack(second);

        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertSame(first.getFirstChild(), vars.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranchPreservesFirstDeclarationOrder() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node a = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node b = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        Node c = new Node(Token.VAR, Node.newString(Token.NAME, "c"));
        root.addChildToBack(a);
        root.addChildToBack(b);
        root.addChildToBack(c);

        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(Arrays.asList(a.getFirstChild(), b.getFirstChild(), c.getFirstChild()),
                Arrays.asList(vars.toArray(new Node[0])));
    }

    @Test
    public void testGetVarsDeclaredInBranchIncludesRootDeclaration() throws Exception {
        Node root = new Node(Token.VAR, Node.newString(Token.NAME, "rootName"));

        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertSame(root.getFirstChild(), vars.iterator().next());
    }

    @Test
    public void testNewExprCreatesExpressionAroundChild() throws Exception {
        Node child = Node.newNumber(3);
        Node expr = NodeUtil.newExpr(child);

        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertSame(child, expr.getFirstChild());
    }

    @Test
    public void testNewExprCopiesSourcePosition() throws Exception {
        Node child = new Node(Token.NUMBER, 7, 4);
        Node expr = NodeUtil.newExpr(child);

        assertEquals(7, expr.getLineno());
        assertEquals(4, expr.getCharno());
    }

    @Test
    public void testNewFunctionNodeBuildsFunctionAndParameters() throws Exception {
        Node param1 = Node.newString(Token.NAME, "a");
        Node param2 = Node.newString(Token.NAME, "b");
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("f", Arrays.asList(param1, param2), body, 2, 5);

        assertEquals(Token.FUNCTION, fn.getType());
        assertEquals("f", fn.getFirstChild().getString());
        assertSame(param1, fn.getFirstChild().getNext().getFirstChild());
        assertSame(param2, param1.getNext());
        assertSame(body, fn.getLastChild());
    }

    @Test
    public void testNewFunctionNodeAcceptsEmptyNameAndParameters() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), body, 0, 0);

        assertEquals("", fn.getFirstChild().getString());
        assertEquals(0, fn.getFirstChild().getNext().getChildCount());
        assertSame(body, fn.getLastChild());
    }

    @Test
    public void testNewFunctionNodeUsesRequestedSourcePosition() throws Exception {
        Node fn = NodeUtil.newFunctionNode("g", Collections.<Node>emptyList(),
                new Node(Token.BLOCK), 11, 9);

        assertEquals(11, fn.getLineno());
        assertEquals(9, fn.getCharno());
        assertEquals(11, fn.getFirstChild().getLineno());
        assertEquals(9, fn.getFirstChild().getCharno());
    }

    @Test
    public void testNewQualifiedNameNodeSingleName() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "alpha", 3, 2);

        assertEquals(Token.NAME, name.getType());
        assertEquals("alpha", name.getString());
    }

    @Test
    public void testNewQualifiedNameNodeBuildsDottedName() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "a.b.c", 4, 6);

        assertEquals("a.b.c", name.getQualifiedName());
        assertEquals(Token.GETPROP, name.getType());
        assertEquals("b.c", name.getLastChild().getQualifiedName());
    }

    @Test
    public void testNewQualifiedNameNodeRetainsSourcePosition() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "a.b", 8, 1);

        assertEquals(8, name.getLineno());
        assertEquals(1, name.getCharno());
        assertEquals(8, name.getLastChild().getLineno());
    }

    @Test
    public void testNewQualifiedNameNodeEmptyNameIsNameNode() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "", 0, 0);

        assertEquals(Token.NAME, name.getType());
        assertEquals("", name.getString());
    }
}
