package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class DeadAssignmentsEliminationTest {
    @Test
    public void testConstructsWithNullCompiler() throws Exception {
        assertNotNull(new DeadAssignmentsElimination(null));
    }

    @Test
    public void testAssignmentNodeType() throws Exception {
        Node n = new Node(Token.ASSIGN);
        assertEquals(Token.ASSIGN, n.getType());
    }

    @Test
    public void testCompoundAssignmentNodeType() throws Exception {
        Node n = new Node(Token.ASSIGN_ADD);
        assertEquals(Token.ASSIGN_ADD, n.getType());
    }

    @Test
    public void testIncrementNodeType() throws Exception {
        Node n = new Node(Token.INC);
        assertEquals(Token.INC, n.getType());
    }

    @Test
    public void testDecrementNodeType() throws Exception {
        Node n = new Node(Token.DEC);
        assertEquals(Token.DEC, n.getType());
    }

    @Test
    public void testVarNodeType() throws Exception {
        Node n = new Node(Token.VAR);
        assertEquals(Token.VAR, n.getType());
    }

    @Test
    public void testEmptyNodeHasNoChildren() throws Exception {
        Node n = new Node(Token.EMPTY);
        assertFalse(n.hasChildren());
    }

    @Test
    public void testAssignmentHasTwoChildren() throws Exception {
        Node n = new Node(Token.ASSIGN,
                Node.newString(Token.NAME, "x"), Node.newNumber(1));
        assertEquals(2, childCount(n));
    }

    @Test
    public void testAssignmentFirstChildIsName() throws Exception {
        Node name = Node.newString(Token.NAME, "x");
        Node n = new Node(Token.ASSIGN, name, Node.newNumber(1));
        assertSame(name, n.getFirstChild());
    }

    @Test
    public void testAssignmentLastChildIsValue() throws Exception {
        Node value = Node.newNumber(1);
        Node n = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), value);
        assertSame(value, n.getLastChild());
    }

    @Test
    public void testAssignmentChildOrder() throws Exception {
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = Node.newNumber(2);
        Node n = new Node(Token.ASSIGN, lhs, rhs);
        assertSame(rhs, lhs.getNext());
    }

    @Test
    public void testRemoveChildLeavesOneChild() throws Exception {
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = Node.newNumber(3);
        Node n = new Node(Token.ASSIGN, lhs, rhs);
        n.removeChild(rhs);
        assertEquals(1, childCount(n));
    }

    @Test
    public void testReplaceChildUpdatesFirstChild() throws Exception {
        Node oldChild = Node.newString(Token.NAME, "x");
        Node replacement = Node.newString(Token.NAME, "y");
        Node n = new Node(Token.BLOCK, oldChild);
        n.replaceChild(oldChild, replacement);
        assertSame(replacement, n.getFirstChild());
    }

    @Test
    public void testAddChildToBackUpdatesLastChild() throws Exception {
        Node n = new Node(Token.BLOCK);
        Node child = new Node(Token.EMPTY);
        n.addChildToBack(child);
        assertSame(child, n.getLastChild());
    }

    @Test
    public void testNumberValueAtZero() throws Exception {
        assertEquals(0.0, Node.newNumber(0).getDouble(), 0.0);
    }

    @Test
    public void testNumberValueAtOne() throws Exception {
        assertEquals(1.0, Node.newNumber(1).getDouble(), 0.0);
    }

    @Test
    public void testNameStringValue() throws Exception {
        assertEquals("x", Node.newString(Token.NAME, "x").getString());
    }

    @Test
    public void testCallChildCount() throws Exception {
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
        assertEquals(1, childCount(call));
    }

    @Test
    public void testPropertyAccessChildCount() throws Exception {
        Node getProp = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "obj"), Node.newString("p"));
        assertEquals(2, childCount(getProp));
    }

    @Test
    public void testReturnCanContainExpression() throws Exception {
        Node value = Node.newNumber(4);
        Node ret = new Node(Token.RETURN, value);
        assertSame(value, ret.getFirstChild());
    }

    @Test
    public void testCommaHasTwoChildren() throws Exception {
        Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
        assertEquals(2, childCount(comma));
    }

    @Test
    public void testVoidNodeContainsChild() throws Exception {
        Node value = Node.newNumber(0);
        Node voidNode = new Node(Token.VOID, value);
        assertSame(value, voidNode.getFirstChild());
    }

    @Test
    public void testBlockInitiallyEmpty() throws Exception {
        assertFalse(new Node(Token.BLOCK).hasChildren());
    }

    @Test
    public void testTwoChildrenAfterAppend() throws Exception {
        Node n = new Node(Token.BLOCK);
        n.addChildToBack(new Node(Token.EMPTY));
        n.addChildToBack(new Node(Token.EMPTY));
        assertEquals(2, childCount(n));
    }

    private int childCount(Node n) {
        int count = 0;
        for (Node child = n.getFirstChild(); child != null; child = child.getNext()) {
            count++;
        }
        return count;
    }
}
