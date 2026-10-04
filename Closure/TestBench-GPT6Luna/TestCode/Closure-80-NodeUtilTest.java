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
        Node child = Node.newNumber(3);
        Node expression = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, expression.getType());
        assertSame(child, expression.getFirstChild());
    }

    @Test
    public void testNewFunctionNodeCreatesNamedFunction() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node parameter = Node.newString(Token.NAME, "arg");
        Node function = NodeUtil.newFunctionNode(
                "f", Arrays.asList(parameter), body, 2, 4);
        assertEquals(Token.FUNCTION, function.getType());
        assertEquals("f", function.getFirstChild().getString());
        assertSame(parameter, function.getFirstChild().getNext()
                .getFirstChild());
        assertSame(body, function.getLastChild());
    }

    @Test
    public void testNewFunctionNodeAcceptsEmptyParameters() throws Exception {
        Node function = NodeUtil.newFunctionNode(
                "f", Collections.<Node>emptyList(), new Node(Token.BLOCK), 0, 0);
        assertEquals(Token.LP, function.getFirstChild().getNext().getType());
        assertNull(function.getFirstChild().getNext().getFirstChild());
    }

    @Test
    public void testNewFunctionNodePreservesLocation() throws Exception {
        Node function = NodeUtil.newFunctionNode(
                "f", Collections.<Node>emptyList(), new Node(Token.BLOCK), 7, 9);
        assertEquals(7, function.getLineno());
        assertEquals(9, function.getCharno());
        assertEquals(7, function.getFirstChild().getLineno());
        assertEquals(9, function.getFirstChild().getCharno());
    }

    @Test
    public void testQualifiedNameWithoutDotIsName() throws Exception {
        Node result = NodeUtil.newQualifiedNameNode(null, "item", 1, 2);
        assertEquals(Token.NAME, result.getType());
        assertEquals("item", result.getString());
    }

    @Test
    public void testQualifiedNameWithSeveralParts() throws Exception {
        Node result = NodeUtil.newQualifiedNameNode(null, "a.b.c", 1, 2);
        assertEquals(Token.GETPROP, result.getType());
        assertEquals("a.b.c", result.getQualifiedName());
        assertEquals(Token.GETPROP, result.getFirstChild().getType());
    }

    @Test
    public void testGetVarsDeclaredInBranchCollectsDeclarations() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR, Node.newString(Token.NAME, "first"));
        root.addChildToBack(var);
        Collection<Node> declarations = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, declarations.size());
        assertSame(var.getFirstChild(), declarations.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranchKeepsFirstDuplicate() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node firstName = Node.newString(Token.NAME, "same");
        root.addChildToBack(new Node(Token.VAR, firstName));
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "same")));
        Collection<Node> declarations = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, declarations.size());
        assertSame(firstName, declarations.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranchDoesNotEnterFunction() throws Exception {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "outer")));
        Node function = new Node(Token.FUNCTION);
        function.addChildToBack(Node.newString(Token.NAME, "fn"));
        function.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "inner")));
        function.addChildToBack(body);
        root.addChildToBack(function);
        Collection<Node> declarations = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, declarations.size());
        assertEquals("outer", declarations.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchEmptyTree() throws Exception {
        Collection<Node> declarations =
                NodeUtil.getVarsDeclaredInBranch(new Node(Token.BLOCK));
        assertEquals(0, declarations.size());
    }

    @Test
    public void testGetVarsDeclaredInBranchReturnsNamesInTraversalOrder() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node first = Node.newString(Token.NAME, "a");
        Node second = Node.newString(Token.NAME, "b");
        root.addChildToBack(new Node(Token.VAR, first));
        root.addChildToBack(new Node(Token.VAR, second));
        List<Node> declarations = Arrays.asList(
                NodeUtil.getVarsDeclaredInBranch(root).toArray(new Node[0]));
        assertSame(first, declarations.get(0));
        assertSame(second, declarations.get(1));
    }

    @Test
    public void testVarCollectorIgnoresNonDeclarationName() throws Exception {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(Node.newString(Token.NAME, "reference"));
        assertEquals(0, NodeUtil.getVarsDeclaredInBranch(root).size());
    }

    @Test
    public void testVarCollectorIncludesDeclarationAtRoot() throws Exception {
        Node name = Node.newString(Token.NAME, "rootName");
        Node root = new Node(Token.VAR, name);
        Collection<Node> declarations = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, declarations.size());
        assertSame(name, declarations.iterator().next());
    }

    @Test
    public void testVarCollectorIncludesMultipleDistinctDeclarations() throws Exception {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "x")));
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "y")));
        assertEquals(2, NodeUtil.getVarsDeclaredInBranch(root).size());
    }
}
