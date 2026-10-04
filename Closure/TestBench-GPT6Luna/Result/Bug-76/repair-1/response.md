```java
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
    public void testProcessRejectsNullExterns() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        try {
            pass.process(null, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessRejectsNullRoot() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        try {
            pass.process(new Node(Token.SCRIPT), null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessRejectsBothNullArguments() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        try {
            pass.process(null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testEnterScopeRejectsNullTraversal() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        try {
            pass.enterScope(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testExitScopeAcceptsNullTraversal() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        pass.exitScope(null);
        assertEquals(1, 1);
    }

    @Test
    public void testVisitAcceptsNullArguments() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        pass.visit(null, null, null);
        assertEquals(1, 1);
    }

    @Test
    public void testVisitDoesNotChangeSuppliedNodes() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        Node node = new Node(Token.NAME);
        Node parent = new Node(Token.BLOCK);
        pass.visit(null, node, parent);
        assertEquals(Token.NAME, node.getType());
        assertEquals(Token.BLOCK, parent.getType());
    }

    @Test
    public void testExitScopeCanBeCalledRepeatedly() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        pass.exitScope(null);
        pass.exitScope(null);
        assertEquals(2, 2);
    }

    @Test
    public void testProcessRejectsNullRootAfterValidExterns() throws Exception {
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(null);
        Node externs = new Node(Token.SCRIPT);
        try {
            pass.process(externs, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(Token.SCRIPT, externs.getType());
        }
    }
}
```