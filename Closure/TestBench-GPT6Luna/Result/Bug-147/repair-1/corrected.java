package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.common.io.CharStreams;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import javax.annotation.Nullable;

public class CheckGlobalThisTest {
    @Test
    public void testThisInPropertyAccessIsReported() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        Node get = new Node(Token.GETPROP, new Node(Token.THIS), Node.newString("x"));
        assertTrue(callback.shouldTraverse(traversal, get, null));
        callback.visit(traversal, get.getFirstChild(), get);
        assertEquals(1, compiler.getWarnings().length);
    }

    @Test
    public void testBareThisIsNotReported() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        Node bare = new Node(Token.THIS);
        callback.visit(traversal, bare, null);
        assertEquals(0, compiler.getWarnings().length);
    }

    @Test
    public void testFunctionInBlockCanBeTraversed() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK, function);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertTrue(callback.shouldTraverse(traversal, function, parent));
    }

    @Test
    public void testFunctionInCallIsNotTraversed() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.CALL, function);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertFalse(callback.shouldTraverse(traversal, function, parent));
    }

    @Test
    public void testAssignmentLhsIsTraversed() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node lhs = new Node(Token.NAME, Node.newString("x"));
        Node assignment = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertTrue(callback.shouldTraverse(traversal, lhs, assignment));
    }

    @Test
    public void testAssignmentRhsIsTraversed() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node lhs = new Node(Token.NAME, Node.newString("x"));
        Node rhs = Node.newNumber(1);
        Node assignment = new Node(Token.ASSIGN, lhs, rhs);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertTrue(callback.shouldTraverse(traversal, rhs, assignment));
    }

    @Test
    public void testAssignmentToPrototypePropertyPrunesRightSide() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node prototype = new Node(Token.GETPROP,
                new Node(Token.NAME, Node.newString("A")), Node.newString("prototype"));
        Node lhs = new Node(Token.GETPROP, prototype, Node.newString("m"));
        Node rhs = Node.newNumber(1);
        Node assignment = new Node(Token.ASSIGN, lhs, rhs);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertFalse(callback.shouldTraverse(traversal, rhs, assignment));
    }

    @Test
    public void testOverrideFunctionIsTraversableWithoutAnnotation() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK, function);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertTrue(callback.shouldTraverse(traversal, function, parent));
    }

    @Test
    public void testConstructorFunctionIsTraversableWithoutAnnotation() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK, function);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertTrue(callback.shouldTraverse(traversal, function, parent));
    }

    @Test
    public void testInterfaceFunctionIsTraversableWithoutAnnotation() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK, function);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertTrue(callback.shouldTraverse(traversal, function, parent));
    }

    @Test
    public void testFunctionWithThisTypeIsTraversableWithoutAnnotation() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK, function);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        assertTrue(callback.shouldTraverse(traversal, function, parent));
    }

    @Test
    public void testVisitClearsAssignmentLhsTracking() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        Node lhs = new Node(Token.NAME, Node.newString("x"));
        Node assignment = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        callback.shouldTraverse(traversal, lhs, assignment);
        callback.visit(traversal, lhs, assignment);
        callback.visit(traversal, new Node(Token.THIS), null);
        assertEquals(0, compiler.getWarnings().length);
    }

    @Test
    public void testVisitReportsThisWithinTrackedAssignmentLhs() throws Exception {
        Compiler compiler = new Compiler();
        CheckGlobalThis callback =
                new CheckGlobalThis(compiler, CheckLevel.WARNING);
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        Node thisNode = new Node(Token.THIS);
        Node lhs = new Node(Token.GETPROP, thisNode, Node.newString("x"));
        Node assignment = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        callback.shouldTraverse(traversal, lhs, assignment);
        callback.visit(traversal, thisNode, lhs);
        assertEquals(1, compiler.getWarnings().length);
    }
}
