package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.NodeTraversal.FunctionCallback;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.jscomp.graph.GraphReachability;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Set;
import java.util.Comparator;
import java.io.IOException;
import java.util.function.Predicate;
import java.util.ArrayList;

public class UnreachableCodeEliminationTest {

    // Mock AbstractCompiler implementation

    // Mock ControlFlowAnalysis to provide a basic CFG

    // Helper to create a basic node structure for testing
    private Node createNode(int type, Node... children) {
        Node n = new Node(type);
        for (Node child : children) {
            n.addChildToBack(child);
        }
        return n;
    }
    
    private Node createBlock(Node... children) {
        return createNode(Token.BLOCK, children);
    }

    private Node createFunction(Node... children) {
        return createNode(Token.FUNCTION, children);
    }

    private Node createScript(Node... children) {
        return createNode(Token.SCRIPT, children);
    }

    // Helper to set up the UnreachableCodeElimination pass with necessary mocks
    
    // Helper to populate CFG with basic connectivity, assuming all nodes are reachable.
    // This is a simplified simulation. In a real scenario, CFG construction is complex.













    @Test
    public void testRemoveUnreachableExpression() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node exprNode = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node block = createBlock(returnNode, exprNode);
        Node function = createFunction(block);
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        // Simulate that returnNode makes exprNode unreachable
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> exprGNode = cfg.createNode(exprNode);
        cfg.connect(returnGNode, exprGNode, Branch.UNCOND);
        
        // Mark exprNode as unreachable
        DiGraphNode<Node, Branch> exprGNodeForReachability = cfg.getDirectedGraphNode(exprNode);
        if (exprGNodeForReachability != null) {
            exprGNodeForReachability.setAnnotation(GraphReachability.UNREACHABLE);
        }

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        eliminationPass.visit(null, exprNode, block);
        
        assertTrue(pass.codeChanged);
        assertNull(exprNode.getParent());
    }

    @Test
    public void testRemoveUnreachableVarDeclaration() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "x"));
        Node block = createBlock(returnNode, varNode);
        Node function = createFunction(block);
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        // Simulate that returnNode makes varNode unreachable
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> varGNode = cfg.createNode(varNode);
        cfg.connect(returnGNode, varGNode, Branch.UNCOND);
        
        // Mark varNode as unreachable
        DiGraphNode<Node, Branch> varGNodeForReachability = cfg.getDirectedGraphNode(varNode);
        if (varGNodeForReachability != null) {
            varGNodeForReachability.setAnnotation(GraphReachability.UNREACHABLE);
        }

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        eliminationPass.visit(null, varNode, block);
        
        assertTrue(pass.codeChanged);
        assertNull(varNode.getParent());
    }

    @Test
    public void testRemoveUnreachableFunction() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node functionDecl = new Node(Token.FUNCTION);
        functionDecl.setString("f");
        functionDecl.addChildToBack(createBlock()); // Empty function body
        Node block = createBlock(returnNode, functionDecl);
        Node rootFunction = createFunction(block);
        Node root = createScript(rootFunction);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        // Simulate that returnNode makes functionDecl unreachable
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> functionGNode = cfg.createNode(functionDecl);
        cfg.connect(returnGNode, functionGNode, Branch.UNCOND);
        
        // Mark functionDecl as unreachable
        DiGraphNode<Node, Branch> functionGNodeForReachability = cfg.getDirectedGraphNode(functionDecl);
        if (functionGNodeForReachability != null) {
            functionGNodeForReachability.setAnnotation(GraphReachability.UNREACHABLE);
        }

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        eliminationPass.visit(null, functionDecl, block);
        
        assertTrue(pass.codeChanged);
        assertNull(functionDecl.getParent());
    }

    @Test
    public void testBreakInFinallyBlock() throws Exception {
        Node breakNode = new Node(Token.BREAK);
        Node finallyBlock = createBlock(breakNode);
        Node tryNode = new Node(Token.TRY, createBlock(), null, finallyBlock); // No catch, finally block exists
        Node whileLoop = createNode(Token.WHILE, Node.newTrue(), createBlock(tryNode));
        Node function = createFunction(createBlock(whileLoop));
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        // Simulate that breakNode is in a finally block.
        // `inFinally` should return true.
        DiGraphNode<Node, Branch> breakGNode = cfg.createNode(breakNode);
        Node nodeAfterLoop = whileLoop.getNext(); 
        DiGraphNode<Node, Branch> nodeAfterLoopGNode = cfg.createNode(nodeAfterLoop);
        cfg.connect(breakGNode, nodeAfterLoopGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        eliminationPass.visit(null, breakNode, finallyBlock);
        
        assertFalse(pass.codeChanged); // Should not be removed due to being in finally.
        assertNotNull(breakNode.getParent());
    }

    @Test
    public void testReturnInFinallyBlock() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node finallyBlock = createBlock(returnNode);
        Node tryNode = new Node(Token.TRY, createBlock(), null, finallyBlock); // No catch, finally block exists
        Node whileLoop = createNode(Token.WHILE, Node.newTrue(), createBlock(tryNode));
        Node function = createFunction(createBlock(whileLoop));
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        // Simulate that returnNode is in a finally block.
        // `inFinally` should return true.
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> implicitReturnGNode = cfg.getImplicitReturn(); // This might not be accurate in a simple mock
        // We need to ensure that the `computeFollowing` in `tryRemoveUnconditionalBranching` for a return node
        // does not lead to removal if it's in a finally block.
        // The `inFinally` check should prevent this.
        
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        eliminationPass.visit(null, returnNode, finallyBlock);

        assertFalse(pass.codeChanged); // Should not be removed due to being in finally.
        assertNotNull(returnNode.getParent());
    }

    @Test
    public void testRemoveMultipleNoOpStatements() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node nullNode = new Node(Token.NULL);
        Node falseNode = new Node(Token.FALSE);
        Node block = createBlock(trueNode, nullNode, falseNode);
        Node function = createFunction(block);
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        eliminationPass.visit(null, trueNode, block);
        eliminationPass.visit(null, nullNode, block);
        eliminationPass.visit(null, falseNode, block);

        assertTrue(pass.codeChanged);
        assertNull(trueNode.getParent());
        assertNull(nullNode.getParent());
        assertNull(falseNode.getParent());
    }

    @Test
    public void testComplexBranchingAroundReturn() throws Exception {
        Node return1 = new Node(Token.RETURN, Node.newNumber(1));
        Node return2 = new Node(Token.RETURN, Node.newNumber(2));
        Node ifElse = new Node(Token.IF, new Node(Token.NAME, "x"), createBlock(return1), createBlock(return2));
        ifElse.getChildAtIndex(0).setString("x"); // 'x' condition
        Node return3 = new Node(Token.RETURN, Node.newNumber(3));
        Node block = createBlock(ifElse, return3);
        Node function = createFunction(block);
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        // Simulate that return3 is unreachable due to the preceding if/else with returns.
        DiGraphNode<Node, Branch> ifNode = cfg.createNode(ifElse);
        DiGraphNode<Node, Branch> return3GNode = cfg.createNode(return3);
        // This connection needs to be more sophisticated to mark return3 as unreachable.
        // For simplicity, we'll directly mark it as unreachable in the CFG.
        DiGraphNode<Node, Branch> return3GNodeForReachability = cfg.getDirectedGraphNode(return3);
        if (return3GNodeForReachability != null) {
            return3GNodeForReachability.setAnnotation(GraphReachability.UNREACHABLE);
        }

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        eliminationPass.visit(null, return3, block);
        
        assertTrue(pass.codeChanged);
        assertNull(return3.getParent());
    }

    @Test
    public void testNoOpStatementInForLoopHeader() throws Exception {
        Node init = Node.newNumber(0); // For loop initialization, e.g., `i = 0;`
        Node condition = new Node(Token.LT, new Node(Token.NAME, "i"), Node.newNumber(10)); // `i < 10`
        condition.getChildAtIndex(0).setString("i");
        Node increment = new Node(Token.ASSIGN, new Node(Token.NAME, "i"), new Node(Token.NAME, "i")); // `i = i`
        increment.getChildAtIndex(0).setString("i");
        increment.getChildAtIndex(1).setString("i");
        Node body = createBlock();
        Node forLoop = new Node(Token.FOR, init, condition, increment, body);
        Node function = createFunction(createBlock(forLoop));
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // The `visit` method calls `removeDeadExprStatementSafely`.
        // `NodeUtil.mayHaveSideEffects(init, compiler)` for `Node.newNumber(0)` is false.
        // Thus, it's removed.
        eliminationPass.visit(null, init, forLoop);
        assertTrue(pass.codeChanged);
        assertNull(init.getParent());
    }

    @Test
    public void testForLoopWithNoSideEffectsIncrement() throws Exception {
        Node varI = new Node(Token.VAR, new Node(Token.NAME, "i"));
        varI.getChildAtIndex(0).setInitialValue(Node.newNumber(0));
        Node condition = new Node(Token.LT, new Node(Token.NAME, "i"), Node.newNumber(10));
        condition.getChildAtIndex(0).setString("i");
        Node increment = new Node(Token.ASSIGN, new Node(Token.NAME, "i"), new Node(Token.NAME, "i"));
        increment.getChildAtIndex(0).setString("i");
        increment.getChildAtIndex(1).setString("i");
        Node body = createBlock();
        Node forLoop = new Node(Token.FOR, varI, condition, increment, body);
        Node function = createFunction(createBlock(forLoop));
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `NodeUtil.mayHaveSideEffects(increment, compiler)` is false for `i=i`.
        // The `visit` method will call `removeDeadExprStatementSafely`.
        eliminationPass.visit(null, increment, forLoop);
        assertTrue(pass.codeChanged);
        assertNull(increment.getParent());
    }

    @Test
    public void testTryCatchBlockRemoval() throws Exception {
        Node catchParam = new Node(Token.NAME, "e");
        Node catchBlock = createBlock();
        Node catchNode = new Node(Token.CATCH, catchParam, catchBlock);
        Node tryNode = new Node(Token.TRY, createBlock(), catchNode); // No finally
        Node function = createFunction(createBlock(tryNode));
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `removeDeadExprStatementSafely` has a check: `if (parent.isTry() && NodeUtil.isTryCatchNodeContainer(n))`
        // For `catchNode` (which is not a block), this condition is false.
        // It might proceed to remove it if it has no side effects and is reachable.
        // However, `catchNode` has side effects (defining `e`), so it should not be removed.
        // Let's ensure it's not removed.
        eliminationPass.visit(null, catchNode, tryNode);
        assertFalse(pass.codeChanged); // Should not be removed.
        assertNotNull(catchNode.getParent());
    }

    @Test
    public void testTryFinallyBlockRemoval() throws Exception {
        Node finallyBlock = createBlock(); // An empty finally block
        Node tryNode = new Node(Token.TRY, createBlock(), null, finallyBlock); // No catch
        Node function = createFunction(createBlock(tryNode));
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `removeDeadExprStatementSafely` checks `if (n.isBlock() && !n.hasChildren())`.
        // For `finallyBlock`, it's a block and has no children, so it returns.
        // Thus, empty finally blocks are not removed by this check.
        eliminationPass.visit(null, finallyBlock, tryNode);
        assertFalse(pass.codeChanged); // Expect no change.
        assertNotNull(finallyBlock.getParent());
    }
    
    @Test
    public void testRemoveExpressionStatementThatIsJustAStringLiteral() throws Exception {
        Node stringLiteral = new Node(Token.STRING, "hello");
        Node block = createBlock(stringLiteral);
        Node function = createFunction(block);
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // A string literal expression has no side effects.
        // `removeDeadExprStatementSafely` should remove it.
        eliminationPass.visit(null, stringLiteral, block);

        assertTrue(pass.codeChanged);
        assertNull(stringLiteral.getParent());
    }

    @Test
    public void testReturnStatementWithoutChildren() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node block = createBlock(returnNode);
        Node function = createFunction(block);
        Node root = createScript(function);

        UnreachableCodeElimination pass = setupPass(root, true);
        ControlFlowGraph<Node> cfg = pass.cfg;
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> implicitReturn = cfg.getImplicitReturn();
        cfg.connect(returnGNode, implicitReturn, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `tryRemoveUnconditionalBranching` is called.
        // `n.hasChildren()` is false.
        // `computeFollowing(n)` would be the implicit return.
        // `nextCfgNode` is the implicit return. They match.
        // However, it should not be removed if it's not *useless*.
        // The condition `!inFinally(n.getParent(), n)` is true.
        // The actual logic `gNode.getAnnotation() != GraphReachability.REACHABLE` will be false.
        // And `tryRemoveUnconditionalBranching` requires `outEdges.size() == 1`.
        // For a simple return, this is true.
        // The key is if `nextCfgNode == fallThrough`.
        // `computeFollowing` for return returns the node after the function.
        // `nextCfgNode` is the target of the branch in CFG, which is the implicit return.
        // These two are generally not the same. The original code's `computeFollowing` is designed to handle this.
        // For a simple `return;`, the `computeFollowing` would return `null` or the node *after* the function.
        // `nextCfgNode` would be the implicit return node. So they are not equal.
        // Thus, `removeNode` should not be called.
        eliminationPass.visit(null, returnNode, block);
        assertFalse(pass.codeChanged);
        assertNotNull(returnNode.getParent());
    }
}





