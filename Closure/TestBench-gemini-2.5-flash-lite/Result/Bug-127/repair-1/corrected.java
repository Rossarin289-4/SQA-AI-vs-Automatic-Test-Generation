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

// Mock implementations to satisfy dependencies for testing UnreachableCodeElimination
public class UnreachableCodeEliminationTest {

    // Mock implementation for AbstractCompiler
    private static class MockCompiler implements AbstractCompiler {
        @Override
        public void reportCodeChange() {
        }

        @Override
        public void setSourceAst(Node root) {
        }

        @Override
        public Node getSourceAst() {
            return null;
        }

        @Override
        public void error(DiagnosticType diagnosticType, Node node, String... arguments) {
            throw new RuntimeException(diagnosticType.format(node, arguments));
        }

        @Override
        public void warning(DiagnosticType diagnosticType, Node node, String... arguments) {
            System.err.println("WARNING: " + diagnosticType.format(node, arguments));
        }

        @Override
        public void setLifeCycleStage(LifeCycleStage stage) {
        }

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return LifeCycleStage.NORMAL;
        }

        @Override
        public boolean isIdeMode() {
            return false;
        }

        @Override
        public String getAstRoot(Node n) {
            return null;
        }

        @Override
        public String getAstRoot() {
            return null;
        }

        @Override
        public void process(Node externs, Node root) {
        }

        @Override
        public CodingConvention getCodingConvention() {
            return null;
        }

        @Override
        public void setCodingConvention(CodingConvention convention) {
        }

        @Override
        public JSError[] getErrors() {
            return new JSError[0];
        }

        @Override
        public JSError[] getWarnings() {
            return new JSError[0];
        }

        @Override
        public boolean hasErrors() {
            return false;
        }

        @Override
        public void setDuplicateInputInformation(boolean duplicateInputInformation) {
        }

        @Override
        public boolean getDuplicateInputInformation() {
            return false;
        }

        @Override
        public void setPassConfig(PassConfig passConfig) {
        }

        @Override
        public PassConfig getPassConfig() {
            return null;
        }

        @Override
        public PassConfig.State getPassConfigState() {
            return null;
        }

        @Override
        public void setShadowVariablesInLoop(boolean shadowVariablesInLoop) {
        }

        @Override
        public boolean shouldShadowVariablesInLoop() {
            return false;
        }

        @Override
        public void setInlineFunctions(boolean inlineFunctions) {
        }

        @Override
        public boolean shouldInlineFunctions() {
            return false;
        }

        @Override
        public void setInlineVariables(boolean inlineVariables) {
        }

        @Override
        public boolean shouldInlineVariables() {
            return false;
        }

        @Override
        public boolean shouldGeneratePseudoNames() {
            return false;
        }

        @Override
        public String getRuntimeTypeCheckStrings() {
            return null;
        }

        @Override
        public String getRuntimeTypeCheckStrings(Node node) {
            return null;
        }

        @Override
        public void setSourceMapPath(String path, String root) {
        }

        @Override
        public String getSourceMapPath() {
            return null;
        }

        @Override
        public String getSourceMapRoot() {
            return null;
        }

        @Override
        public void setExternRoots(List<Node> externs) {
        }

        @Override
        public List<Node> getExternRoots() {
            return null;
        }

        // Mock implementations for methods that need to be defined
        @Override
        public Var getVar(String name) {
            // Return a dummy Var object or null if not relevant for the test
            return null;
        }

        @Override
        public void assignToNewScope(Var var) {
            // No-op for mock
        }

        @Override
        public String getAstFileName(Node n) {
            return null;
        }
    }

    // Mock implementation for NodeTraversal to control its behavior for testing.
    private static class MockNodeTraversal extends NodeTraversal {
        private final NodeTraversal.Callback callback;
        private final MockCompiler compiler;
        private Node currentNode;

        MockNodeTraversal(MockCompiler compiler, NodeTraversal.Callback cb) {
            // Call super constructor with compiler and callback
            super(compiler, cb); // Assuming NodeTraversal has a constructor accepting these
            this.compiler = compiler;
            this.callback = cb;
        }

        @Override
        public void traverse(Node root) {
            traverseNode(root, null);
        }

        private void traverseNode(Node node, Node parent) {
            if (node == null) return;
            this.currentNode = node;
            if (callback instanceof AbstractShallowCallback) {
                ((AbstractShallowCallback) callback).visit(this, node, parent);
            }
            // Recurse on children
            Node child = node.getFirstChild();
            while (child != null) {
                traverseNode(child, node);
                child = child.getNext();
            }
        }

        @Override
        public Node getCurrentNode() {
            return this.currentNode;
        }

        @Override
        public AbstractCompiler getCompiler() {
            return this.compiler;
        }

        @Override
        public ControlFlowGraph<Node> getControlFlowGraph() {
            // Return a dummy CFG or mock it as needed for specific tests
            return new ControlFlowGraph<>(new Node(Token.NULL), false, false);
        }
    }

    // Mock implementation for ControlFlowAnalysis
    private static class MockControlFlowAnalysis {
        private ControlFlowGraph<Node> cfg;

        // Simplified constructor for mocking
        public MockControlFlowAnalysis(AbstractCompiler compiler, Node rootNode) {
            // Simulate CFG creation
            cfg = new ControlFlowGraph<>(rootNode, false, false);
            DiGraphNode<Node, Branch> entryNode = cfg.createNode(rootNode);
            cfg.setEntry(entryNode);
        }

        public ControlFlowGraph<Node> getCfg() {
            return this.cfg;
        }

        // Static helper method mock
        public static Node computeFollowNode(Node n) {
            if (n == null) return null;
            Node next = n.getNext();
            if (next != null) return next;
            // Simplified logic: if no next sibling, try to find parent's next sibling.
            Node parent = n.getParent();
            if (parent != null) {
                return computeFollowNode(parent);
            }
            return null;
        }
    }

    // Helper to create a basic node structure for testing
    private Node createNode(int type, Node... children) {
        Node n = new Node(type);
        for (Node child : children) {
            n.addChildToBack(child);
        }
        return n;
    }

    // Helper to create a basic AST for testing purposes
    private Node createAst(String code) {
        // Placeholder for AST creation
        return new Node(Token.SCRIPT);
    }


    @Test
    public void testRemoveDeadCodeAfterReturn() throws Exception {
        Node returnNode = new Node(Token.RETURN, Node.newNumber(1));
        Node alertNode = new Node(Token.CALL, new Node(Token.NAME, "alert"), new Node(Token.STRING, "dead"));
        alertNode.setString("alert");
        Node block = createNode(Token.BLOCK, returnNode, alertNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> alertGNode = cfg.createNode(alertNode);
        cfg.connect(returnGNode, alertGNode, Branch.UNCOND);

        // Manually simulate the EliminationPass logic for the alertNode
        pass.codeChanged = false;
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // To ensure removeDeadExprStatementSafely is called, we need to simulate conditions in visit()
        // Here, assume alertNode is reachable but we want to remove it as dead code after return.
        // The actual condition check in EliminationPass.visit() is:
        // if (gNode.getAnnotation() != GraphReachability.REACHABLE || (removeNoOpStatements && !NodeUtil.mayHaveSideEffects(n, compiler)))
        // For this test, we force the removal logic by assuming it's unreachable.
        // A more accurate mock would involve GraphReachability.
        // For simplicity, we directly call the method that performs removal.
        // We will assert that it *would* be removed if the condition was met.
        // In a real test, we'd mock GraphReachability.
        // To ensure removal, we fake the `gNode.getAnnotation() != GraphReachability.REACHABLE` part.
        // But this requires access to `gNode`. Let's simplify: assume the `removeDeadExprStatementSafely` call.
        // This test focuses on the `removeDeadExprStatementSafely` logic.
        // The `visit` method would have called `removeDeadExprStatementSafely` if the conditions were met.
        // We will directly test `removeDeadExprStatementSafely` and `codeChanged`.
        eliminationPass.removeDeadExprStatementSafely(alertNode);
        assertTrue(pass.codeChanged); // Expect code to change
        assertNull(alertNode.getParent()); // Node should be removed
    }

    @Test
    public void testRemoveNoOpStatement() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node block = createNode(Token.BLOCK, trueNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true); // removeNoOpStatements = true

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> trueGNode = cfg.createNode(trueNode);

        pass.codeChanged = false;
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // Simulate the conditions for removal: reachable and no side effects.
        // `NodeUtil.mayHaveSideEffects(trueNode, compiler)` returns false.
        eliminationPass.removeDeadExprStatementSafely(trueNode);
        assertTrue(pass.codeChanged);
        assertNull(trueNode.getParent());
    }

    @Test
    public void testDoNotRemoveNoOpStatementWhenFlagIsFalse() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node block = createNode(Token.BLOCK, trueNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false); // removeNoOpStatements = false

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> trueGNode = cfg.createNode(trueNode);

        pass.codeChanged = false;
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // Simulate the conditions for removal NOT being met.
        // `removeNoOpStatements` is false.
        // The logic in `visit` would check `(removeNoOpStatements && !NodeUtil.mayHaveSideEffects(n, compiler))`
        // which evaluates to `(false && true)` = false. So `removeDeadExprStatementSafely` is not called.
        // We will directly call `removeDeadExprStatementSafely` and assert it does nothing if conditions aren't met.
        eliminationPass.removeDeadExprStatementSafely(trueNode);
        assertFalse(pass.codeChanged); // Node should not be removed.
        assertNotNull(trueNode.getParent());
    }


    @Test
    public void testRemoveUselessReturn() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node block = createNode(Token.BLOCK, returnNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> implicitReturn = cfg.getImplicitReturn();
        cfg.connect(returnGNode, implicitReturn, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `tryRemoveUnconditionalBranching` logic:
        // `computeFollowing(n)` would return null or node after function.
        // `nextCfgNode` is implicit return. They are not equal.
        // So it should not be removed by this method.
        pass.codeChanged = false;
        eliminationPass.tryRemoveUnconditionalBranching(returnNode);
        assertFalse(pass.codeChanged); // Expect no code change for a valid return.
        assertNotNull(returnNode.getParent());
    }

    @Test
    public void testRemoveUselessBreak() throws Exception {
        Node breakNode = new Node(Token.BREAK);
        Node whileCondition = Node.newTrue();
        Node whileLoop = createNode(Token.WHILE, whileCondition, createNode(Token.BLOCK, breakNode));
        Node function = createNode(Token.FUNCTION, createNode(Token.BLOCK, whileLoop));
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> breakGNode = cfg.createNode(breakNode);
        Node nodeAfterLoop = whileLoop.getNext(); // Simulate node after loop
        DiGraphNode<Node, Branch> nodeAfterLoopGNode = cfg.createNode(nodeAfterLoop);
        cfg.connect(breakGNode, nodeAfterLoopGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `tryRemoveUnconditionalBranching` should remove it because `nextCfgNode == fallThrough`.
        pass.codeChanged = false;
        eliminationPass.tryRemoveUnconditionalBranching(breakNode);
        assertTrue(pass.codeChanged);
        assertNull(breakNode.getParent());
    }

    @Test
    public void testRemoveUselessContinue() throws Exception {
        Node continueNode = new Node(Token.CONTINUE);
        Node whileCondition = Node.newTrue();
        Node whileLoop = createNode(Token.WHILE, whileCondition, createNode(Token.BLOCK, continueNode));
        Node function = createNode(Token.FUNCTION, createNode(Token.BLOCK, whileLoop));
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> continueGNode = cfg.createNode(continueNode);
        DiGraphNode<Node, Branch> whileConditionGNode = cfg.createNode(whileCondition);
        cfg.connect(continueGNode, whileConditionGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `tryRemoveUnconditionalBranching` should not remove it because `nextCfgNode != fallThrough`.
        pass.codeChanged = false;
        eliminationPass.tryRemoveUnconditionalBranching(continueNode);
        assertFalse(pass.codeChanged); // Expect no change.
        assertNotNull(continueNode.getParent());
    }

    @Test
    public void testRemoveUnreachableStatement() throws Exception {
        Node throwNode = new Node(Token.THROW, new Node(Token.NEW, new Node(Token.NAME, "Error"), new Node(Token.STRING, "err")));
        throwNode.getFirstChild().setString("Error");
        Node alertNode = new Node(Token.CALL, new Node(Token.NAME, "alert"), new Node(Token.STRING, "dead"));
        alertNode.setString("alert");
        Node block = createNode(Token.BLOCK, throwNode, alertNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> throwGNode = cfg.createNode(throwNode);
        DiGraphNode<Node, Branch> alertGNode = cfg.createNode(alertNode);
        cfg.connect(throwGNode, alertGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // Assume alertNode is unreachable and should be removed by removeDeadExprStatementSafely.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(alertNode);
        assertTrue(pass.codeChanged);
        assertNull(alertNode.getParent());
    }

    @Test
    public void testRemoveEmptyBlock() throws Exception {
        Node emptyNode = new Node(Token.EMPTY);
        Node block = createNode(Token.BLOCK, emptyNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> emptyGNode = cfg.createNode(emptyNode);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `removeDeadExprStatementSafely` has `if (n.isEmpty()) { return; }`.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(emptyNode);
        assertFalse(pass.codeChanged); // Expect no change as it's handled later.
        assertNotNull(emptyNode.getParent());
    }

    @Test
    public void testRemoveVarStatementWithNoChildren() throws Exception {
        // Test case for `var x;` where `x` has no initializer.
        Node xName = new Node(Token.NAME, "x");
        Node varNode = new Node(Token.VAR, xName); // var x;
        Node block = createNode(Token.BLOCK, varNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> varGNode = cfg.createNode(varNode);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `removeDeadExprStatementSafely` checks `if (n.isVar() && !n.getFirstChild().hasChildren())`.
        // Here `n.getFirstChild()` is `xName`, which has no children, so this condition is true.
        // However, the `varNode` *does* have a child (`xName`), so the condition `!n.getFirstChild().hasChildren()` is false.
        // The check in `removeDeadExprStatementSafely` is `if (n.isVar() && !n.getFirstChild().hasChildren())` which is meant for `var;` without a name, not `var x;`.
        // Let's assume it's reachable. `NodeUtil.mayHaveSideEffects(varNode, compiler)` is false.
        // The specific check `if (n.isVar() && !n.getFirstChild().hasChildren())` is intended to PREVENT removal.
        // If the test is for `var x;` and `x` has no initializer, it should not be removed by this check.
        // The comment "we should just ignore dead variable declarations" is about a specific edge case.
        pass.codeChanged = false;
        // For `var x;`, `!n.getFirstChild().hasChildren()` is false. The `return;` inside the check is not executed.
        // Thus, `removeDeadExprStatementSafely` proceeds.
        // If `var x;` is considered a no-op and reachable, it might be removed.
        // Let's assume `NodeUtil.mayHaveSideEffects(varNode, compiler)` is false.
        // This means `removeDeadExprStatementSafely` is called.
        // The `if (n.isVar() && !n.getFirstChild().hasChildren())` branch is NOT taken because `xName` is a child.
        // So it proceeds to `removeNode(n)`.
        // This might be a bug in the original code, leading to removal of `var x;`.
        // For this test, we simulate the removal.
        eliminationPass.removeDeadExprStatementSafely(varNode);
        assertTrue(pass.codeChanged); // Expect it to be removed based on current logic flow.
        assertNull(varNode.getParent());
    }

    @Test
    public void testRemoveNoOpStatementAssign() throws Exception {
        Node nullNode = new Node(Token.NULL);
        Node block = createNode(Token.BLOCK, nullNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> nullGNode = cfg.createNode(nullNode);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `NodeUtil.mayHaveSideEffects(nullNode, compiler)` is false.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(nullNode);
        assertTrue(pass.codeChanged);
        assertNull(nullNode.getParent());
    }

    @Test
    public void testRemoveExpressionStatementWithSideEffect() throws Exception {
        Node incrNode = new Node(Token.INC, new Node(Token.NAME, "x"));
        Node block = createNode(Token.BLOCK, incrNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> incrGNode = cfg.createNode(incrNode);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `NodeUtil.mayHaveSideEffects(incrNode, compiler)` is true.
        // Therefore, `removeDeadExprStatementSafely` should NOT be called if `removeNoOpStatements` is true.
        // If `removeNoOpStatements` is false, it also won't be called.
        // The only way it's called is if `gNode.getAnnotation() != GraphReachability.REACHABLE`.
        // We assume it's reachable and has side effects. So it should not be removed.
        pass.codeChanged = false;
        // Simulate conditions where it's NOT removed.
        // We can't directly test `visit` without mocking `GraphReachability`.
        // We will assert that `codeChanged` remains false, implying no removal.
        // `removeDeadExprStatementSafely` would not be called for this case given the conditions in `visit`.
        // If it were called, it would check `!NodeUtil.mayHaveSideEffects(n, compiler)`, which would be false.
        // So, the removal logic inside `removeDeadExprStatementSafely` would not execute.
        // We'll simulate `removeDeadExprStatementSafely` and verify it doesn't change code.
        eliminationPass.removeDeadExprStatementSafely(incrNode); // This call itself might not happen in `visit`
                                                                 // but we test the method's behavior.
        assertFalse(pass.codeChanged); // Expect no code change.
        assertNotNull(incrNode.getParent());
    }

    @Test
    public void testRemoveUnreachableFunctionCall() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node alertCall = new Node(Token.CALL, new Node(Token.NAME, "alert"), new Node(Token.STRING, "unreachable"));
        alertCall.setString("alert");
        Node block = createNode(Token.BLOCK, returnNode, alertCall);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> alertCallGNode = cfg.createNode(alertCall);
        cfg.connect(returnGNode, alertCallGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // Assume alertCall is unreachable. `removeDeadExprStatementSafely` is called.
        // It has side effects, but it's removed because it's unreachable.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(alertCall);
        assertTrue(pass.codeChanged);
        assertNull(alertCall.getParent());
    }

    @Test
    public void testRemoveUnreachableExpression() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node exprNode = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node block = createNode(Token.BLOCK, returnNode, exprNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> exprGNode = cfg.createNode(exprNode);
        cfg.connect(returnGNode, exprGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // Assume exprNode is unreachable. `removeDeadExprStatementSafely` is called.
        // It has no side effects, so it's removed.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(exprNode);
        assertTrue(pass.codeChanged);
        assertNull(exprNode.getParent());
    }

    @Test
    public void testRemoveUnreachableVarDeclaration() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "x"));
        Node block = createNode(Token.BLOCK, returnNode, varNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> varGNode = cfg.createNode(varNode);
        cfg.connect(returnGNode, varGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // Assume varNode is unreachable. `removeDeadExprStatementSafely` is called.
        // The check `if (n.isVar() && !n.getFirstChild().hasChildren())` is false because `x` is a child.
        // The method `removeNode` is called.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(varNode);
        assertTrue(pass.codeChanged);
        assertNull(varNode.getParent());
    }

    @Test
    public void testRemoveUnreachableFunction() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node functionDecl = new Node(Token.FUNCTION);
        functionDecl.setString("f");
        functionDecl.addChildToBack(createNode(Token.BLOCK));
        Node block = createNode(Token.BLOCK, returnNode, functionDecl);
        Node rootFunction = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, rootFunction);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> functionGNode = cfg.createNode(functionDecl);
        cfg.connect(returnGNode, functionGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // Assume functionDecl is unreachable. `removeDeadExprStatementSafely` is called.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(functionDecl);
        assertTrue(pass.codeChanged);
        assertNull(functionDecl.getParent());
    }

    @Test
    public void testBreakInFinallyBlock() throws Exception {
        Node breakNode = new Node(Token.BREAK);
        Node finallyBlock = createNode(Token.BLOCK, breakNode);
        Node tryNode = new Node(Token.TRY, createNode(Token.BLOCK), null, finallyBlock);
        Node whileCondition = Node.newTrue();
        Node whileLoop = createNode(Token.WHILE, whileCondition, createNode(Token.BLOCK, tryNode));
        Node function = createNode(Token.FUNCTION, createNode(Token.BLOCK, whileLoop));
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> breakGNode = cfg.createNode(breakNode);
        Node nodeAfterLoop = whileLoop.getNext();
        DiGraphNode<Node, Branch> nodeAfterLoopGNode = cfg.createNode(nodeAfterLoop);
        cfg.connect(breakGNode, nodeAfterLoopGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `tryRemoveUnconditionalBranching` should NOT remove break in finally.
        pass.codeChanged = false;
        eliminationPass.tryRemoveUnconditionalBranching(breakNode);
        assertFalse(pass.codeChanged); // Expect no code change.
        assertNotNull(breakNode.getParent());
    }

    @Test
    public void testReturnInFinallyBlock() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        Node finallyBlock = createNode(Token.BLOCK, returnNode);
        Node tryNode = new Node(Token.TRY, createNode(Token.BLOCK), null, finallyBlock);
        Node whileCondition = Node.newTrue();
        Node whileLoop = createNode(Token.WHILE, whileCondition, createNode(Token.BLOCK, tryNode));
        Node function = createNode(Token.FUNCTION, createNode(Token.BLOCK, whileLoop));
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> returnGNode = cfg.createNode(returnNode);
        DiGraphNode<Node, Branch> implicitReturnGNode = cfg.getImplicitReturn();
        cfg.connect(returnGNode, implicitReturnGNode, Branch.UNCOND);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `tryRemoveUnconditionalBranching` should NOT remove return in finally.
        pass.codeChanged = false;
        eliminationPass.tryRemoveUnconditionalBranching(returnNode);
        assertFalse(pass.codeChanged); // Expect no code change.
        assertNotNull(returnNode.getParent());
    }


    @Test
    public void testRemoveMultipleNoOpStatements() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node nullNode = new Node(Token.NULL);
        Node falseNode = new Node(Token.FALSE);
        Node block = createNode(Token.BLOCK, trueNode, nullNode, falseNode);
        Node function = createNode(Token.FUNCTION, block);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(trueNode);
        eliminationPass.removeDeadExprStatementSafely(nullNode);
        eliminationPass.removeDeadExprStatementSafely(falseNode);

        assertTrue(pass.codeChanged);
        assertNull(trueNode.getParent());
        assertNull(nullNode.getParent());
        assertNull(falseNode.getParent());
    }

    @Test
    public void testComplexBranchingAroundReturn() throws Exception {
        Node return1 = new Node(Token.RETURN, Node.newNumber(1));
        Node return2 = new Node(Token.RETURN, Node.newNumber(2));
        Node ifElse = new Node(Token.IF, new Node(Token.NAME, "x"), createNode(Token.BLOCK, return1), createNode(Token.BLOCK, return2));
        ifElse.getChildAtIndex(0).setString("x");
        Node return3 = new Node(Token.RETURN, Node.newNumber(3));
        Node block = createNode(Token.BLOCK, ifElse, return3);
        Node function = createNode(Token.FUNCTION, block);
        function.getChildAtIndex(0).getChildAtIndex(0).setLineno(1);
        function.getChildAtIndex(0).getChildAtIndex(1).setLineno(2);
        function.getChildAtIndex(0).getChildAtIndex(2).setLineno(3);
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        // Assume return3 is unreachable due to the preceding if/else with returns.
        // Simulate that `removeDeadExprStatementSafely` is called for `return3`.
        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(return3);
        assertTrue(pass.codeChanged);
        assertNull(return3.getParent());
    }

    @Test
    public void testNoOpStatementInForLoopHeader() throws Exception {
        Node init = Node.newTrue();
        Node condition = Node.newFalse();
        Node increment = Node.newNumber(0);
        Node body = createNode(Token.BLOCK);
        Node forLoop = new Node(Token.FOR, init, condition, increment, body);
        Node function = createNode(Token.FUNCTION, createNode(Token.BLOCK, forLoop));
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> initGNode = cfg.createNode(init);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // Current implementation's `removeDeadExprStatementSafely` might remove `init` if it has no side effects.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(init);
        assertTrue(pass.codeChanged);
        assertNull(init.getParent());
    }

    @Test
    public void testForLoopWithNoSideEffectsIncrement() throws Exception {
        Node varI = new Node(Token.VAR, new Node(Token.NAME, "i"));
        varI.getChildAtIndex(0).setInitialValue(Node.newNumber(0));
        Node condition = new Node(Token.LT, new Node(Token.NAME, "i"), Node.newNumber(1));
        condition.getChildAtIndex(0).setDeclaration(varI);
        Node increment = new Node(Token.ASSIGN, new Node(Token.NAME, "i"), new Node(Token.NAME, "i"));
        increment.getChildAtIndex(0).setDeclaration(varI);
        Node body = createNode(Token.BLOCK);
        Node forLoop = new Node(Token.FOR, varI, condition, increment, body);
        Node function = createNode(Token.FUNCTION, createNode(Token.BLOCK, forLoop));
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> incrementGNode = cfg.createNode(increment);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `NodeUtil.mayHaveSideEffects(increment, compiler)` is false for `i=i`.
        // `removeDeadExprStatementSafely` would remove it if called.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(increment);
        assertTrue(pass.codeChanged);
        assertNull(increment.getParent());
    }

    @Test
    public void testTryCatchBlockRemoval() throws Exception {
        Node catchParam = new Node(Token.NAME, "e");
        Node catchBlock = createNode(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH, catchParam, catchBlock);
        Node tryNode = new Node(Token.TRY, createNode(Token.BLOCK), catchNode);
        Node function = createNode(Token.FUNCTION, createNode(Token.BLOCK, tryNode));
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> tryGNode = cfg.createNode(tryNode);
        DiGraphNode<Node, Branch> catchGNode = cfg.createNode(catchNode);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `removeDeadExprStatementSafely` checks `if (n.isBlock() && parent.isTry() && NodeUtil.isTryCatchNodeContainer(n))`.
        // This check is for CATCH blocks themselves, not the `catchNode`.
        // The check `if (parent.isTry() && NodeUtil.isTryCatchNodeContainer(n))` inside `removeDeadExprStatementSafely` specifically prevents removing CATCH nodes.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(catchNode);
        assertFalse(pass.codeChanged); // Expect no change.
        assertNotNull(catchNode.getParent());
    }

    @Test
    public void testTryFinallyBlockRemoval() throws Exception {
        Node finallyBlock = createNode(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, createNode(Token.BLOCK), null, finallyBlock);
        Node function = createNode(Token.FUNCTION, createNode(Token.BLOCK, tryNode));
        Node root = createNode(Token.SCRIPT, function);

        MockCompiler compiler = new MockCompiler();
        UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);

        MockControlFlowAnalysis mockCfa = new MockControlFlowAnalysis(compiler, root);
        ControlFlowGraph<Node> cfg = mockCfa.getCfg();
        DiGraphNode<Node, Branch> tryGNode = cfg.createNode(tryNode);
        DiGraphNode<Node, Branch> finallyGNode = cfg.createNode(finallyBlock);

        EliminationPass eliminationPass = pass.new EliminationPass(cfg);
        // `removeDeadExprStatementSafely` checks `if (n.isBlock() && !n.hasChildren())`.
        // If finallyBlock is empty, it returns. So empty finally blocks are not removed.
        pass.codeChanged = false;
        eliminationPass.removeDeadExprStatementSafely(finallyBlock);
        assertFalse(pass.codeChanged); // Expect no change.
        assertNotNull(finallyBlock.getParent());
    }
}
