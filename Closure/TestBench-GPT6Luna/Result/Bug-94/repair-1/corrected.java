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
        Node child = Node.newNumber(1);
        Node expr = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertSame(child, expr.getFirstChild());
    }

    @Test
    public void testNewFunctionNodeBasicStructure() throws Exception {
        Node param = Node.newString(Token.NAME, "p");
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("f", Arrays.asList(param), body, 2, 3);
        assertEquals(Token.FUNCTION, fn.getType());
        assertEquals("f", fn.getFirstChild().getString());
        assertSame(param, fn.getFirstChild().getNext().getFirstChild());
        assertSame(body, fn.getLastChild());
    }

    @Test
    public void testNewFunctionNodeEmptyParameters() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), body, 0, 0);
        assertEquals(Token.LP, fn.getFirstChild().getNext().getType());
        assertEquals(0, fn.getFirstChild().getNext().getChildCount());
        assertSame(body, fn.getLastChild());
    }

    @Test
    public void testNewQualifiedNameSinglePart() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode("alpha", 1, 2);
        assertEquals(Token.NAME, name.getType());
        assertEquals("alpha", name.getString());
    }

    @Test
    public void testNewQualifiedNameTwoParts() throws Exception {
        Node qualified = NodeUtil.newQualifiedNameNode("alpha.beta", 1, 2);
        assertEquals(Token.GETPROP, qualified.getType());
        assertEquals("alpha.beta", qualified.getQualifiedName());
    }

    @Test
    public void testNewQualifiedNameThreeParts() throws Exception {
        Node qualified = NodeUtil.newQualifiedNameNode("a.b.c", 1, 2);
        assertEquals("a.b.c", qualified.getQualifiedName());
        assertEquals("b.c", qualified.getLastChild().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchFindsVariable() throws Exception {
        Node name = Node.newString(Token.NAME, "x");
        Node root = new Node(Token.BLOCK, new Node(Token.VAR, name));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertSame(name, vars.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranchDeduplicatesNames() throws Exception {
        Node first = Node.newString(Token.NAME, "x");
        Node second = Node.newString(Token.NAME, "x");
        Node root = new Node(Token.BLOCK,
            new Node(Token.VAR, first), new Node(Token.VAR, second));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertSame(first, vars.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranchExcludesFunctionScope() throws Exception {
        Node outerName = Node.newString(Token.NAME, "outer");
        Node innerName = Node.newString(Token.NAME, "inner");
        Node fn = new Node(Token.FUNCTION,
            Node.newString(Token.NAME, "f"),
            new Node(Token.LP),
            new Node(Token.BLOCK, new Node(Token.VAR, innerName)));
        Node root = new Node(Token.BLOCK, new Node(Token.VAR, outerName), fn);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertSame(outerName, vars.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranchEmpty() throws Exception {
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(new Node(Token.BLOCK));
        assertEquals(0, vars.size());
    }

    @Test
    public void testGetVarsDeclaredInBranchDoesNotCountPlainName() throws Exception {
        Node root = new Node(Token.BLOCK, Node.newString(Token.NAME, "x"));
        assertEquals(0, NodeUtil.getVarsDeclaredInBranch(root).size());
    }

    @Test
    public void testMatchNodeTypeRejectsOtherType() throws Exception {
        NodeUtil.MatchNodeType matcher = new NodeUtil.MatchNodeType(Token.NAME);
        assertFalse(matcher.apply(Node.newNumber(1)));
    }

    @Test
    public void testMatchNodeTypeMatchesTargetType() throws Exception {
        NodeUtil.MatchNodeType matcher = new NodeUtil.MatchNodeType(Token.BLOCK);
        assertTrue(matcher.apply(new Node(Token.BLOCK)));
    }

    @Test
    public void testMatchNodeTypeRejectsNearbyType() throws Exception {
        NodeUtil.MatchNodeType matcher = new NodeUtil.MatchNodeType(Token.BLOCK);
        assertFalse(matcher.apply(new Node(Token.SCRIPT)));
    }
}
