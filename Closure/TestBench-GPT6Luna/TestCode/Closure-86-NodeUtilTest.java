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
        Node child = Node.newNumber(3);
        Node expr = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertSame(child, expr.getFirstChild());
    }

    @Test
    public void testNewExprCopiesChildSourcePosition() throws Exception {
        Node child = Node.newNumber(3, 7, 4);
        Node expr = NodeUtil.newExpr(child);
        assertEquals(7, expr.getLineno());
        assertEquals(4, expr.getCharno());
    }

    @Test
    public void testNewFunctionNodeStructure() throws Exception {
        Node param = Node.newString(Token.NAME, "p");
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("f", Arrays.asList(param), body, 2, 5);
        assertEquals(Token.FUNCTION, fn.getType());
        assertEquals("f", fn.getFirstChild().getString());
        assertEquals(Token.LP, fn.getFirstChild().getNext().getType());
        assertSame(param, fn.getFirstChild().getNext().getFirstChild());
        assertSame(body, fn.getLastChild());
    }

    @Test
    public void testNewFunctionNodeEmptyParameters() throws Exception {
        Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(),
                new Node(Token.BLOCK), 0, 0);
        assertFalse(fn.getFirstChild().getNext().hasChildren());
    }

    @Test
    public void testNewFunctionNodePosition() throws Exception {
        Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(),
                new Node(Token.BLOCK), 8, 6);
        assertEquals(8, fn.getLineno());
        assertEquals(6, fn.getCharno());
    }

    @Test
    public void testNewQualifiedNameSingleName() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "foo", 0, 0);
        assertEquals(Token.NAME, name.getType());
        assertEquals("foo", name.getString());
    }

    @Test
    public void testNewQualifiedNameTwoParts() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "foo.bar", 0, 0);
        assertEquals(Token.GETPROP, name.getType());
        assertEquals("foo.bar", name.getQualifiedName());
    }

    @Test
    public void testNewQualifiedNameMultipleParts() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "foo.bar.baz", 0, 0);
        assertEquals("foo.bar.baz", name.getQualifiedName());
        assertEquals(Token.GETPROP, name.getFirstChild().getType());
    }

    @Test
    public void testGetVarsDeclaredInBranchFindsDirectDeclaration() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node declaration = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        root.addChildToBack(declaration);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertSame(declaration.getFirstChild(), vars.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranchDeduplicatesNames() throws Exception {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "x")));
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "x")));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertEquals("x", vars.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchExcludesNestedFunctionScope() throws Exception {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "outer")));
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, "f"));
        fn.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "inner")));
        fn.addChildToBack(body);
        root.addChildToBack(fn);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertEquals("outer", vars.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchEmptyTree() throws Exception {
        assertTrue(NodeUtil.getVarsDeclaredInBranch(new Node(Token.BLOCK)).isEmpty());
    }

    @Test
    public void testNewQualifiedNameKeepsFirstAndLastComponents() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode(null, "a.b.c", 0, 0);
        assertEquals("a", name.getFirstChild().getFirstChild().getString());
        assertEquals("c", name.getLastChild().getString());
    }
}
