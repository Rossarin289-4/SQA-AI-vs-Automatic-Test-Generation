package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.graph.DiGraph;
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
import java.util.Set; // Added import for Set

public class ControlFlowAnalysisTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    private ControlFlowAnalysis createAnalysis(String code) {
        AbstractCompiler compiler = new Compiler();
        Node root = compiler.parseSyntheticCode(code);
        // Edge annotations should be true for more complete CFG.
        ControlFlowAnalysis analysis = new ControlFlowAnalysis(compiler, true, true);
        analysis.process(null, root);
        return analysis;
    }

    // Helper to find a specific node by token type. This is a simplified version
    // as getBestInvoiceForToken is not available. We'll traverse and find.
    private Node findNode(Node root, int token) {
        return findNodeRecursive(root, token);
    }

    private Node findNodeRecursive(Node node, int token) {
        if (node == null) {
            return null;
        }
        if (node.getType() == token) {
            return node;
        }
        for (Node child = node.getFirstChild(); child != null; child = child.getNext()) {
            Node found = findNodeRecursive(child, token);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

    // Helper to find a specific node by type and a condition (e.g., assignment to 'a')
    private Node findNodeByCondition(Node root, int token, java.util.function.Predicate<Node> condition) {
        return findNodeByConditionRecursive(root, token, condition);
    }

    private Node findNodeByConditionRecursive(Node node, int token, java.util.function.Predicate<Node> condition) {
        if (node == null) {
            return null;
        }
        if (node.getType() == token && condition.test(node)) {
            return node;
        }
        for (Node child = node.getFirstChild(); child != null; child = child.getNext()) {
            Node found = findNodeByConditionRecursive(child, token, condition);
            if (found != null) {
                return found;
            }
        }
        return null;
    }


    @Test
    public void testExceptionMayThrow() throws Exception {
        // A CALL node for a NAME should throw.
        Node nameNode = Node.newString("foo"); // Use newString for name literals
        Node callNode = new Node(Token.CALL, nameNode, 0, 0);
        assertTrue(ControlFlowAnalysis.mayThrowException(callNode));
    }

    @Test
    public void testExceptionMayNotThrow() throws Exception {
        Node node = Node.newNumber(10); // This is a valid static method
        assertFalse(ControlFlowAnalysis.mayThrowException(node));
    }

    @Test
    public void testComparator() throws Exception {
        // Ensure the code snippet is valid and produces the expected AST structure.
        String code = "{ var a = 1; if (a > 0) { a = 2; } else { a = 3; } }";
        AbstractCompiler compiler = new Compiler();
        Node root = compiler.parseSyntheticCode(code);
        ControlFlowAnalysis analysis = new ControlFlowAnalysis(compiler, true, true);
        analysis.process(null, root);
        ControlFlowGraph<Node> cfg = analysis.getCfg();

        // Get specific nodes. Need to be careful about how nodes are identified.
        // The Script node is the root of the AST.
        DiGraph.DiGraphNode<Node, Branch> scriptNode = cfg.getEntry(); // CFG entry is the script node

        DiGraph.DiGraphNode<Node, Branch> blockNode = null;
        DiGraph.DiGraphNode<Node, Branch> ifNode = null;
        DiGraph.DiGraphNode<Node, Branch> thenAssignmentNode = null;
        DiGraph.DiGraphNode<Node, Branch> elseAssignmentNode = null;
        DiGraph.DiGraphNode<Node, Branch> returnNode = null;

        // Traverse CFG nodes to find specific statement nodes.
        // The order of nodes in the CFG is determined by the AST traversal.
        for (DiGraph.DiGraphNode<Node, Branch> node : cfg.getDirectedGraphNodes()) {
            Node value = node.getValue();
            if (value.isBlock()) blockNode = node;
            if (value.isIf()) ifNode = node;

            // Find assignment nodes based on their children.
            if (value.getType() == Token.ASSIGN) {
                if (value.getFirstChild().getString().equals("a")) { // Check for assignment to 'a'
                    if (value.getLastChild().getDouble() == 2.0) { // Assignment to 2
                        thenAssignmentNode = node;
                    } else if (value.getLastChild().getDouble() == 3.0) { // Assignment to 3
                        elseAssignmentNode = node;
                    }
                }
            }
            if (value.isReturn()) returnNode = node; // Find the return node
        }

        // Ensure all expected nodes were found.
        assertNotNull("Script node not found", scriptNode);
        assertNotNull("Block node not found", blockNode);
        assertNotNull("If node not found", ifNode);
        assertNotNull("Then assignment node not found", thenAssignmentNode);
        assertNotNull("Else assignment node not found", elseAssignmentNode);
        assertNotNull("Return node not found", returnNode);

        Comparator<DiGraph.DiGraphNode<Node, Branch>> comparator = cfg.getOptionalNodeComparator(true);

        // Check basic ordering based on AST position.
        // The AST order for this code is: SCRIPT -> BLOCK -> IF -> ASSIGN(a=2) -> ASSIGN(a=3) -> RETURN
        assertTrue("SCRIPT should come before BLOCK", comparator.compare(scriptNode, blockNode) < 0);
        assertTrue("BLOCK should come before IF", comparator.compare(blockNode, ifNode) < 0);
        assertTrue("IF should come before THEN ASSIGN", comparator.compare(ifNode, thenAssignmentNode) < 0);
        assertTrue("THEN ASSIGN should come before ELSE ASSIGN", comparator.compare(thenAssignmentNode, elseAssignmentNode) < 0);
        assertTrue("THEN ASSIGN should come before RETURN", comparator.compare(thenAssignmentNode, returnNode) < 0);
        assertTrue("ELSE ASSIGN should come before RETURN", comparator.compare(elseAssignmentNode, returnNode) < 0);
    }

}
