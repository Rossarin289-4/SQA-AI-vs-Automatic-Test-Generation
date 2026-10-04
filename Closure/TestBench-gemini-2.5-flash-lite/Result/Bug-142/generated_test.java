package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.jscomp.graph.GraphColoring;
import com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.LinkedUndirectedGraph;
import com.google.javascript.jscomp.graph.UndiGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.ScriptRuntime;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter; // Added import for ErrorReporter

public class CoalesceVariableNamesTest {

    // Mock AbstractCompiler for testing

    // Mock Scope.Var for testing

    // Mock Scope for testing

    // Mock NodeTraversal for testing
    
    // Mock DiGraph for testing



    
    






    





    

    
    @Test
    public void testCombinedLiveRangeCheckerVisit() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        MockVar varA = new MockVar("a", null, 0);
        MockVar varB = new MockVar("b", null, 1);

        CoalesceVariableNames.LiveRangeChecker lrChecker1 = new CoalesceVariableNames.LiveRangeChecker(varA, varB);
        CoalesceVariableNames.LiveRangeChecker lrChecker2 = new CoalesceVariableNames.LiveRangeChecker(varB, varA);

        CoalesceVariableNames.CombinedLiveRangeChecker combinedChecker = 
            new CoalesceVariableNames.CombinedLiveRangeChecker(lrChecker1, lrChecker2);

        // Mock NodeTraversal and Node
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, new MockScope(false, new Node(Token.SCRIPT)));
        Node nameNode = Node.newString("a");
        Node parentNode = new Node(Token.ASSIGN, nameNode, Node.newNumber(1));

        // Mock the visit call
        combinedChecker.visit(traversal, nameNode, parentNode);

        // Check if the internal LiveRangeCheckers were visited
        assertTrue(lrChecker1.defFound || lrChecker2.defFound); // depends on exact logic in LiveRangeChecker.isAssignTo
    }

    @Test
    public void testCombinedCfgNodeLiveRangeCheckerVisit() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        MockVar varA = new MockVar("a", null, 0);
        MockVar varB = new MockVar("b", null, 1);

        CoalesceVariableNames.LiveRangeChecker lrChecker1 = new CoalesceVariableNames.LiveRangeChecker(varA, varB);
        CoalesceVariableNames.LiveRangeChecker lrChecker2 = new CoalesceVariableNames.LiveRangeChecker(varB, varA);
        
        ArrayList<CoalesceVariableNames.CombinedLiveRangeChecker> callbacks = new ArrayList<>();
        callbacks.add(new CoalesceVariableNames.CombinedLiveRangeChecker(lrChecker1, lrChecker2));
        
        CoalesceVariableNames.CombinedCfgNodeLiveRangeChecker combinedChecker = 
            new CoalesceVariableNames.CombinedCfgNodeLiveRangeChecker(callbacks);

        // Mock NodeTraversal and Node
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, new MockScope(false, new Node(Token.SCRIPT)));
        Node nameNode = Node.newString("a");
        Node parentNode = new Node(Token.ASSIGN, nameNode, Node.newNumber(1));

        // Mock the visit call
        combinedChecker.visit(traversal, nameNode, parentNode);

        // Check if the internal CombinedLiveRangeChecker was visited and its visit method was called
        assertTrue(lrChecker1.defFound || lrChecker2.defFound);
    }
    
    @Test
    public void testLiveRangeCheckerIsAssignTo() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockVar varA = new MockVar("a", null, 0);

        // Test assignment
        Node nameNodeAssign = Node.newString("a");
        Node assignNode = new Node(Token.ASSIGN, nameNodeAssign, Node.newNumber(1));
        assertTrue(CoalesceVariableNames.LiveRangeChecker.isAssignTo(varA, nameNodeAssign, assignNode));

        // Test var declaration with value
        Node nameNodeVar = Node.newString("a");
        Node varDeclNode = new Node(Token.VAR, nameNodeVar, Node.newNumber(1));
        assertTrue(CoalesceVariableNames.LiveRangeChecker.isAssignTo(varA, nameNodeVar, varDeclNode));

        // Test function parameter
        Node nameNodeParam = Node.newString("a");
        Node funcNode = new Node(Token.FUNCTION, new Node(Token.BLOCK), nameNodeParam); // Mock parameter
        assertTrue(CoalesceVariableNames.LiveRangeChecker.isAssignTo(varA, nameNodeParam, funcNode));

        // Test no assignment
        Node nameNodeRead = Node.newString("a");
        Node readNode = new Node(Token.NAME, nameNodeRead);
        assertFalse(CoalesceVariableNames.LiveRangeChecker.isAssignTo(varA, nameNodeRead, readNode));
    }

    @Test
    public void testLiveRangeCheckerIsReadFrom() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockVar varA = new MockVar("a", null, 0);

        Node nameNodeRead = Node.newString("a");
        Node parentNode = new Node(Token.ADD, nameNodeRead, Node.newNumber(1));
        assertTrue(CoalesceVariableNames.LiveRangeChecker.isReadFrom(varA, nameNodeRead));

        // Test with LHS assignment - should not be read
        Node nameNodeLHS = Node.newString("a");
        Node assignNode = new Node(Token.ASSIGN, nameNodeLHS, Node.newNumber(1));
        assertFalse(CoalesceVariableNames.LiveRangeChecker.isReadFrom(varA, nameNodeLHS));

        // Test with different name
        Node differentNameNode = Node.newString("b");
        assertFalse(CoalesceVariableNames.LiveRangeChecker.isReadFrom(varA, differentNameNode));
    }

    @Test
    public void testLiveRangeCheckerShouldVisit() {
        assertTrue(CoalesceVariableNames.LiveRangeChecker.shouldVisit(Node.newString("a")));
        assertTrue(CoalesceVariableNames.LiveRangeChecker.shouldVisit(new Node(Token.ASSIGN, Node.newString("a"), Node.newNumber(1))));
        assertFalse(CoalesceVariableNames.LiveRangeChecker.shouldVisit(new Node(Token.NUMBER, 1.0)));
    }

    @Test
    public void testCoalesceVariableNamesWithSimpleCase() throws Exception {
        // Minimal setup for testing the process method
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        String source = "function f() { var a = 1; var b = 2; return a + b; }";
        Node root = compiler.parse(source);
        
        // Manually set up a Scope and Var for a simple case
        Node funcNode = root.getFirstChild();
        Node blockNode = funcNode.getChildAtIndex(1);
        Node varANode = blockNode.getFirstChild();
        Node varBNode = varANode.getNext();
        
        MockVar varA = new MockVar("a", varANode, 0);
        MockVar varB = new MockVar("b", varBNode, 1);
        
        MockScope scope = new MockScope(false, funcNode);
        scope.addVar(varA);
        scope.addVar(varB);
        
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        
        // Need to populate colorings manually for this test to work
        UndiGraph<Var, Void> interferenceGraph = new LinkedUndirectedGraph<Var, Void>();
        interferenceGraph.createNode(varA);
        interferenceGraph.createNode(varB);
        interferenceGraph.connectIfNotFound(varA, null, varB); // Assume they can be coalesced

        GraphColoring<Var, Void> coloring = new GreedyGraphColoring<>(interferenceGraph, coloringTieBreaker);
        coloring.color();
        
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        cvn.colorings.push(coloring);
        
        cvn.process(null, root); // externs can be null
        
        // Verify that 'b' has been replaced by 'a'
        Node returnNode = blockNode.getLastChild();
        Node addNode = returnNode.getFirstChild();
        assertEquals("a", addNode.getFirstChild().getString());
        assertEquals("a", addNode.getLastChild().getString());
        assertTrue(compiler.codeChanged);
        
        cvn.colorings.pop(); // Clean up
    }
    
    @Test
    public void testCoalesceVariableNamesWithPseudoNames() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        String source = "function f() { var a = 1; var b = 2; return a + b; }";
        Node root = compiler.parse(source);
        
        Node funcNode = root.getFirstChild();
        Node blockNode = funcNode.getChildAtIndex(1);
        Node varANode = blockNode.getFirstChild();
        Node varBNode = varANode.getNext();
        
        MockVar varA = new MockVar("a", varANode, 0);
        MockVar varB = new MockVar("b", varBNode, 1);
        
        MockScope scope = new MockScope(false, funcNode);
        scope.addVar(varA);
        scope.addVar(varB);
        
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        
        UndiGraph<Var, Void> interferenceGraph = new LinkedUndirectedGraph<Var, Void>();
        interferenceGraph.createNode(varA);
        interferenceGraph.createNode(varB);
        interferenceGraph.connectIfNotFound(varA, null, varB);

        GraphColoring<Var, Void> coloring = new GreedyGraphColoring<>(interferenceGraph, coloringTieBreaker);
        coloring.color();
        
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, true); // Use pseudo names
        cvn.colorings.push(coloring);
        
        cvn.process(null, root);
        
        // Verify that 'a' and 'b' are renamed to 'a_b'
        Node returnNode = blockNode.getLastChild();
        Node addNode = returnNode.getFirstChild();
        assertEquals("a_b", addNode.getFirstChild().getString());
        assertEquals("a_b", addNode.getLastChild().getString());
        assertTrue(compiler.codeChanged);
        
        cvn.colorings.pop();
    }

    @Test
    public void testCoalesceVariableNamesWithExportedVar() throws Exception {
        // This test aims to check if exported variables are handled correctly, 
        // though the current implementation skips global scope processing in enterScope.
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        String source = "var x = 1; function f() { var y = 2; }";
        Node root = compiler.parse(source);

        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        cvn.process(null, root);

        // Expect no code change as global scope processing is a no-op
        assertFalse(compiler.codeChanged);
    }
    
    // Helper method to create a minimal CFG and Var for testing
}





