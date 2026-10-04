package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ControlFlowAnalysisTest {
    @Test
    public void testMayThrowForCall() throws Exception {
        assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.CALL)));
    }

    @Test
    public void testMayThrowForPropertyAccess() throws Exception {
        assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.GETPROP)));
    }

    @Test
    public void testMayThrowForAssignment() throws Exception {
        assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.ASSIGN)));
    }

    @Test
    public void testMayNotThrowForName() throws Exception {
        assertFalse(ControlFlowAnalysis.mayThrowException(Node.newString(Token.NAME, "x")));
    }

    @Test
    public void testMayThrowPropagatesFromChild() throws Exception {
        Node expression = new Node(Token.ADD, Node.newString(Token.NAME, "x"),
                new Node(Token.CALL));
        assertTrue(ControlFlowAnalysis.mayThrowException(expression));
    }

    @Test
    public void testMayNotInspectFunctionBody() throws Exception {
        Node function = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "f"),
                new Node(Token.PARAM_LIST),
                new Node(Token.BLOCK, new Node(Token.THROW, Node.newNumber(1))));
        assertFalse(ControlFlowAnalysis.mayThrowException(function));
    }

    @Test
    public void testBreakStructureMatchesUnlabeledLoop() throws Exception {
        Node loop = new Node(Token.WHILE);
        assertTrue(ControlFlowAnalysis.isBreakTarget(loop, null));
    }

    @Test
    public void testBreakStructureMatchesSwitch() throws Exception {
        Node sw = new Node(Token.SWITCH);
        assertTrue(ControlFlowAnalysis.isBreakTarget(sw, null));
    }

    @Test
    public void testUnlabeledBreakDoesNotTargetBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertFalse(ControlFlowAnalysis.isBreakTarget(block, null));
    }

    @Test
    public void testLabeledBreakMayTargetBlock() throws Exception {
        Node label = new Node(Token.LABEL,
                Node.newString(Token.LABEL_NAME, "outer"), new Node(Token.BLOCK));
        assertTrue(ControlFlowAnalysis.isBreakTarget(label.getLastChild(), "outer"));
    }

    @Test
    public void testLabeledBreakRequiresMatchingLabel() throws Exception {
        Node label = new Node(Token.LABEL,
                Node.newString(Token.LABEL_NAME, "outer"), new Node(Token.BLOCK));
        assertFalse(ControlFlowAnalysis.isBreakTarget(label.getLastChild(), "inner"));
    }

    @Test
    public void testNestedLabelFindsMatchingOuterLabel() throws Exception {
        Node inner = new Node(Token.LABEL,
                Node.newString(Token.LABEL_NAME, "inner"), new Node(Token.BLOCK));
        Node outer = new Node(Token.LABEL,
                Node.newString(Token.LABEL_NAME, "outer"), inner);
        assertTrue(ControlFlowAnalysis.isBreakTarget(inner.getLastChild(), "outer"));
    }

    @Test
    public void testNestedCallIsThrowing() throws Exception {
        Node expression = new Node(Token.ARRAYLIT,
                new Node(Token.ADD, Node.newNumber(1), new Node(Token.NEW)));
        assertTrue(ControlFlowAnalysis.mayThrowException(expression));
    }

    @Test
    public void testLiteralTreeDoesNotThrow() throws Exception {
        Node expression = new Node(Token.ADD, Node.newNumber(1), Node.newString(Token.STRING, "a"));
        assertFalse(ControlFlowAnalysis.mayThrowException(expression));
    }

    @Test
    public void testMayThrowForIncrement() throws Exception {
        assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.INC)));
    }

    @Test
    public void testMayThrowForInstanceof() throws Exception {
        assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.INSTANCEOF)));
    }

    @Test
    public void testComparePrioritiesFromProcessedRoot() throws Exception {
        fail("A compiler instance cannot be constructed from the supplied declarations.");
    }

    @Test
    public void testProcessSimpleScript() throws Exception {
        fail("An AbstractCompiler instance cannot be constructed from the supplied declarations.");
    }

    @Test
    public void testShouldTraverseFunctionSetting() throws Exception {
        fail("NodeTraversal construction requires an AbstractCompiler instance.");
    }

    @Test
    public void testVisitIfNode() throws Exception {
        fail("The private CFG state needed by visit cannot be initialized from the visible API.");
    }

    @Test
    public void testForwardComparatorOrdersAstNodes() throws Exception {
        fail("Comparator positions are populated only by process, which requires an unavailable compiler instance.");
    }

    @Test
    public void testReverseComparatorOrdersAstNodes() throws Exception {
        fail("Comparator positions are populated only by process, which requires an unavailable compiler instance.");
    }

    @Test
    public void testProcessEmptyScript() throws Exception {
        fail("An AbstractCompiler instance cannot be constructed from the supplied declarations.");
    }

    @Test
    public void testShouldTraverseTryNode() throws Exception {
        fail("A NodeTraversal instance cannot be constructed without an AbstractCompiler instance.");
    }
}
