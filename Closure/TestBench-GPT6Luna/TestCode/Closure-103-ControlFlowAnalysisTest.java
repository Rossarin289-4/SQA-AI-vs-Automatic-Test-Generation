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
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUnionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.jscomp.graph.StandardUnionFind;
import com.google.javascript.jscomp.graph.UnionFind;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.Collection;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;

public class ControlFlowAnalysisTest {
    @Test
    public void testBreakStructureLoopAndSwitch() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.WHILE), false));
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.SWITCH), false));
    }

    @Test
    public void testBreakStructureLabeledBlock() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), true));
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), false));
    }

    @Test
    public void testBreakStructureRejectsOrdinaryStatement() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.EXPR_RESULT), true));
    }

    @Test
    public void testContinueStructureLoopTypes() throws Exception {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.FOR)));
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.DO)));
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testContinueStructureRejectsSwitchAndBlock() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.SWITCH)));
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.BLOCK)));
    }

    @Test
    public void testBreakStructureIfRequiresLabel() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), true));
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), false));
    }

    @Test
    public void testBreakStructureTryRequiresLabel() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), true));
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), false));
    }

    @Test
    public void testBreakStructureDoLoop() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.DO), false));
    }

    @Test
    public void testBreakStructureForLoop() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.FOR), false));
    }

    @Test
    public void testBreakStructureWhileLoop() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.WHILE), false));
    }

    @Test
    public void testBreakStructureSwitch() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.SWITCH), false));
    }

    @Test
    public void testContinueForLoop() throws Exception {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.FOR)));
    }

    @Test
    public void testContinueDoLoop() throws Exception {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.DO)));
    }

    @Test
    public void testContinueWhileLoop() throws Exception {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testContinueIfRejected() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.IF)));
    }

    @Test
    public void testContinueSwitchRejected() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.SWITCH)));
    }

    @Test
    public void testBreakOrdinaryReturnRejected() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.RETURN), false));
    }

    @Test
    public void testBreakLabelledExpressionRejected() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.EXPR_RESULT), true));
    }

    @Test
    public void testBreakLabelledFunctionRejected() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.FUNCTION), true));
    }

    @Test
    public void testContinueRejectsTry() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.TRY)));
    }

    @Test
    public void testContinueRejectsLabel() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.LABEL)));
    }

    @Test
    public void testBreakRejectsContinueStructureOnly() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.CONTINUE), false));
    }

    @Test
    public void testBreakBlockLabelBoundary() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), true));
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), false));
    }

    @Test
    public void testContinueRejectsIfEvenWhenLabelCouldApply() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.IF)));
    }

    @Test
    public void testBreakAcceptsLoopWithoutLabel() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.FOR), false));
    }

    @Test
    public void testBreakAcceptsDoWithoutLabel() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.DO), false));
    }

    @Test
    public void testBreakRejectsFunctionWithoutLabel() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.FUNCTION), false));
    }

    @Test
    public void testContinueRejectsBreakNode() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.BREAK)));
    }

    @Test
    public void testContinueRejectsTryNode() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.TRY)));
    }

    @Test
    public void testBreakSwitchIsBreakable() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.SWITCH), false));
    }

    @Test
    public void testBreakIfOnlyWithLabel() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), true));
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), false));
    }

    @Test
    public void testContinueLoopKindsAreBreakTargetsToo() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.WHILE), false));
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.DO), false));
    }

    @Test
    public void testBreakRejectsScript() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.SCRIPT), true));
    }

    @Test
    public void testContinueRejectsScript() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.SCRIPT)));
    }

    @Test
    public void testBreakTryAcceptedOnlyWithLabel() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), true));
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), false));
    }

    @Test
    public void testContinueAcceptsWhile() throws Exception {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testBreakRejectsWithNode() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.WITH), false));
    }

    @Test
    public void testContinueRejectsWithNode() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.WITH)));
    }

    @Test
    public void testBreakAcceptsLabeledTryStructure() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), true));
    }

    @Test
    public void testBreakRejectsUnlabeledTryStructure() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), false));
    }

    @Test
    public void testContinueRejectsDefaultNode() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.DEFAULT)));
    }

    @Test
    public void testBreakRejectsDefaultNode() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.DEFAULT), true));
    }

    @Test
    public void testBreakAcceptsSwitchNode() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.SWITCH), false));
    }

    @Test
    public void testContinueRejectsSwitchNodeAgain() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.SWITCH)));
    }

    @Test
    public void testBreakBlockRequiresLabeledContext() throws Exception {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), true));
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), false));
    }

    @Test
    public void testContinueDoIsSupported() throws Exception {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.DO)));
    }

    @Test
    public void testBreakRejectsCatchNode() throws Exception {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.CATCH), true));
    }

    @Test
    public void testContinueRejectsCatchNode() throws Exception {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.CATCH)));
    }
}
