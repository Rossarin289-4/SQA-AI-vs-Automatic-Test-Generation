package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.graph.GraphReachability;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnreachableCodeEliminationTest {
    @Test
    public void testProcessWithNullRoot() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        try {
            pass.process(null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertTrue(pass.cfgStack.isEmpty());
        }
    }

    @Test
    public void testProcessEmptyScript() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node script = new Node(Token.SCRIPT);
        try {
            pass.process(null, script);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertTrue(pass.cfgStack.isEmpty());
        }
    }

    @Test
    public void testProcessScriptContainingExpression() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node script = new Node(Token.SCRIPT);
        Node statement = new Node(Token.EXPR_RESULT, Node.newString("x"));
        script.addChildToBack(statement);
        try {
            pass.process(null, script);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertSame(statement, script.getFirstChild());
        }
    }

    @Test
    public void testVisitRootLeavesItAlone() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node root = new Node(Token.SCRIPT);
        pass.visit(null, root, null);
        assertEquals(Token.SCRIPT, root.getType());
    }

    @Test
    public void testVisitFunctionLeavesItAlone() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node parent = new Node(Token.SCRIPT);
        Node function = new Node(Token.FUNCTION);
        parent.addChildToBack(function);
        pass.visit(null, function, parent);
        assertSame(function, parent.getFirstChild());
    }

    @Test
    public void testVisitScriptLeavesItAlone() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node parent = new Node(Token.BLOCK);
        Node script = new Node(Token.SCRIPT);
        parent.addChildToBack(script);
        pass.visit(null, script, parent);
        assertSame(script, parent.getFirstChild());
    }

    @Test
    public void testVisitNodeOutsideGraphLeavesItAlone() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node parent = new Node(Token.BLOCK);
        Node expression = new Node(Token.EXPR_RESULT, Node.newString("x"));
        parent.addChildToBack(expression);
        pass.curCfg = new ControlFlowGraph<Node>(new Node(Token.EMPTY), true, true);
        pass.visit(null, expression, parent);
        assertSame(expression, parent.getFirstChild());
    }

    @Test
    public void testEnterAndExitScopeRestoreCurrentGraph() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        assertNull(pass.curCfg);
        assertTrue(pass.cfgStack.isEmpty());
        Node script = new Node(Token.SCRIPT);
        try {
            pass.process(null, script);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertTrue(pass.cfgStack.isEmpty());
        }
    }

    @Test
    public void testNoOpRemovalDisabledPreservesScriptExpression() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node script = new Node(Token.SCRIPT);
        Node expression = new Node(Token.EXPR_RESULT, Node.newString("x"));
        script.addChildToBack(expression);
        try {
            pass.process(null, script);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertSame(expression, script.getFirstChild());
        }
    }

    @Test
    public void testNoOpRemovalEnabledPreservesReachableScriptExpression() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), true);
        Node script = new Node(Token.SCRIPT);
        Node expression = new Node(Token.EXPR_RESULT, Node.newString("x"));
        script.addChildToBack(expression);
        try {
            pass.process(null, script);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertSame(expression, script.getFirstChild());
        }
    }

    @Test
    public void testProcessMaintainsSiblingOrder() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT, Node.newString("a"));
        Node second = new Node(Token.EXPR_RESULT, Node.newString("b"));
        script.addChildToBack(first);
        script.addChildToBack(second);
        try {
            pass.process(null, script);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertSame(first, script.getFirstChild());
            assertSame(second, first.getNext());
            assertNull(second.getNext());
        }
    }

    @Test
    public void testProcessWithExternsDoesNotChangeExternTree() throws Exception {
        UnreachableCodeElimination pass =
                new UnreachableCodeElimination(new Compiler(), false);
        Node externs = new Node(Token.SCRIPT);
        Node externStatement = new Node(Token.EXPR_RESULT, Node.newString("e"));
        externs.addChildToBack(externStatement);
        Node script = new Node(Token.SCRIPT);
        try {
            pass.process(externs, script);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertSame(externStatement, externs.getFirstChild());
        }
    }
}
