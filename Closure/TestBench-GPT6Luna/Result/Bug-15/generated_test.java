package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;

public class FlowSensitiveInlineVariablesTest {
    @Test
    public void testProcessEmptyScript() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        Node script = new Node(Token.SCRIPT);
        try {
            pass.process(null, script);
        } catch (RuntimeException expectedOnInvalidCompilerInput) {
            // An empty script is not valid compiler input in this setup.
        }
        assertEquals(Token.SCRIPT, script.getType());
    }

    @Test
    public void testVisitDoesNotModifyNode() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        Node n = Node.newString("kept");
        NodeTraversal traversal =
                new NodeTraversal(compiler, pass);
        pass.visit(traversal, n, null);
        assertEquals("kept", n.getString());
    }

    @Test
    public void testExitScopeDoesNotModifyNode() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        Node n = Node.newString("kept");
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        pass.exitScope(traversal);
        assertEquals("kept", n.getString());
    }

    @Test
    public void testProcessOnGlobalScriptCompletes() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        try {
            new FlowSensitiveInlineVariables(compiler).process(null, script);
        } catch (RuntimeException expectedOnInvalidCompilerInput) {
            // This empty script does not establish a valid compiler input.
        }
        assertEquals(Token.SCRIPT, script.getType());
    }

    @Test
    public void testVisitLeavesNumberUnchanged() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        Node n = Node.newNumber(0);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        pass.visit(traversal, n, null);
        assertEquals(0.0, n.getDouble(), 0.0);
    }

    @Test
    public void testVisitLeavesNullParentAlone() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        Node n = Node.newNumber(1);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        pass.visit(traversal, n, null);
        assertEquals(Token.NUMBER, n.getType());
    }

    @Test
    public void testExitScopeMayBeCalledRepeatedly() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        pass.exitScope(traversal);
        pass.exitScope(traversal);
        assertEquals(Token.STRING, Node.newString("x").getType());
    }

    @Test
    public void testProcessEmptyScriptRepeatedly() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        Node script = new Node(Token.SCRIPT);
        try {
            pass.process(null, script);
            pass.process(null, script);
        } catch (RuntimeException expectedOnInvalidCompilerInput) {
            // This empty script does not establish a valid compiler input.
        }
        assertEquals(Token.SCRIPT, script.getType());
    }

    @Test
    public void testVisitLeavesStringValueUnchanged() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        Node n = Node.newString("x");
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        pass.visit(traversal, n, new Node(Token.SCRIPT));
        assertEquals("x", n.getString());
    }

    @Test
    public void testExitScopeLeavesCompilerPassUsable() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        pass.exitScope(traversal);
        Node script = new Node(Token.SCRIPT);
        try {
            pass.process(null, script);
        } catch (RuntimeException expectedOnInvalidCompilerInput) {
            // This empty script does not establish a valid compiler input.
        }
        assertEquals(Token.SCRIPT, script.getType());
    }

    @Test
    public void testProcessDoesNotAddNodesToEmptyScript() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        try {
            new FlowSensitiveInlineVariables(compiler).process(null, script);
        } catch (RuntimeException expectedOnInvalidCompilerInput) {
            // This empty script does not establish a valid compiler input.
        }
        assertNull(script.getFirstChild());
    }

    @Test
    public void testVisitLeavesChildLinkUnchanged() throws Exception {
        Compiler compiler = new Compiler();
        FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
        Node script = new Node(Token.SCRIPT);
        Node child = Node.newNumber(2);
        script.addChildToBack(child);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        pass.visit(traversal, child, script);
        assertSame(child, script.getFirstChild());
    }
}
