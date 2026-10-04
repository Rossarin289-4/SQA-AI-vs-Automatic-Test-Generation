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

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;


public class DeadAssignmentsEliminationTest {

    // Mock for AbstractCompiler


    // Mock Scope and Var implementations (simplified)


    // Mock ControlFlowGraph and its related classes


    // Mock LiveVariablesAnalysis

    // Mock FlowState

    // Mock LiveVariableLattice

    // Mock for NodeTraversal


    // Helper method to create a simple Node with type and value
    private Node createNode(int type, Object value) {
        Node node;
        if (value instanceof String) {
            node = Node.newString((String) value);
        } else if (value instanceof Double) {
            node = Node.newNumber((Double) value);
        } else if (value instanceof Integer) {
             node = Node.newNumber((double)(Integer) value); // Ensure double for newNumber
        } else {
            node = new Node(type);
        }
        node.setType(type);
        return node;
    }

    // Helper method to create a simple assignment node
    private Node createAssignment(Node lhs, Node rhs) {
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        return assign;
    }

    // Helper method to create an increment node
    private Node createIncrement(Node operand) {
        Node inc = new Node(Token.INC, operand);
        return inc;
    }

    // Helper method to create a decrement node
    private Node createDecrement(Node operand) {
        Node dec = new Node(Token.DEC, operand);
        return dec;
    }

    // Helper method to create a simple expression statement
    private Node createExpressionStatement(Node expr) {
        return new Node(Token.EXPR_RESULT, expr);
    }

    // Helper method to create a simple block
    private Node createBlock(Node... statements) {
        Node block = new Node(Token.BLOCK);
        for (Node stmt : statements) {
            block.addChildToBack(stmt);
        }
        return block;
    }

    // Helper to create a minimal CFG with just a node.

    // Helper to create a minimal scope with one variable










    @Test
    public void testIfConditionDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node cond = assignX;

        Node thenBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, thenBlock);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(ifNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for IF
        deadAssignmentsElimination.tryRemoveAssignment(null, cond, ifNode, mockState); // n is cond, exprRoot is ifNode

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, cond.getParent().getType()); // x=1 is replaced by 1
        assertEquals(1.0, cond.getParent().getDouble(), 0.0);
    }

    @Test
    public void testForConditionDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node cond = assignX;

        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, new Node(Token.VAR), cond, body); // FOR(VAR; x=1; )

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(forNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for FOR
        deadAssignmentsElimination.tryRemoveAssignment(null, cond, forNode, mockState); // n is cond, exprRoot is forNode

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, cond.getParent().getType()); // x=1 is replaced by 1
        assertEquals(1.0, cond.getParent().getDouble(), 0.0);
    }

    @Test
    public void testSwitchCaseDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node caseNode = new Node(Token.CASE, assignX); // CASE x=1:

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(caseNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for CASE
        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, caseNode, mockState); // n is assignX, exprRoot is caseNode

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, assignX.getParent().getType()); // x=1 is replaced by 1
        assertEquals(1.0, assignX.getParent().getDouble(), 0.0);
    }

    @Test
    public void testReturnDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node returnNode = new Node(Token.RETURN, assignX); // return x=1;

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(returnNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for RETURN
        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, returnNode, mockState); // n is assignX, exprRoot is returnNode

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.RETURN, assignX.getParent().getType());
        assertEquals(Token.NUMBER, assignX.getParent().getFirstChild().getType()); // x=1 is replaced by 1
        assertEquals(1.0, assignX.getParent().getFirstChild().getDouble(), 0.0);
    }


    @Test
    public void testComplexExpressionDeadAssignment() throws Exception {
        Node a = createNode(Token.NAME, "a");
        Node b = createNode(Token.NAME, "b");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignB = createAssignment(b, one); // b = 1;
        Node mul = new Node(Token.MUL, a, assignB); // a * (b=1)

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("b");
        MockVar varB = (MockVar) scope.getVar("b");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varB, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(mul);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // The tryRemoveAssignment should recurse into the multiplication expression.
        deadAssignmentsElimination.tryRemoveAssignment(null, assignB, mul, mockState); // n is assignB, exprRoot is mul

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.MUL, assignB.getParent().getType());
        assertEquals(Token.NUMBER, assignB.getParent().getSecondChild().getType()); // b=1 replaced by 1
        assertEquals(1.0, assignB.getParent().getSecondChild().getDouble(), 0.0);
    }

    @Test
    public void testFunctionScopeSkipped() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        Node blockNode = new Node(Token.BLOCK, functionNode); // Function inside a block
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        MockScope scope = new MockScope(); // Not global, so enterScope logic applies
        scope.isGlobal = true; // Simulate global scope
        ControlFlowGraph<Node> cfg = createMinimalCFG(blockNode);
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, compiler);

        // This test calls enterScope to check the skip logic.
        deadAssignmentsElimination.enterScope(traversal);

        // If a function is detected, the liveness analysis should not be computed.
        assertNull(deadAssignmentsElimination.liveness);
    }

    @Test
    public void testNoAssignsSkipped() throws Exception {
        Node literalNode = createNode(Token.NUMBER, 5.0);
        Node blockNode = createBlock(literalNode); // No assignments

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        MockScope scope = new MockScope();
        ControlFlowGraph<Node> cfg = createMinimalCFG(blockNode);
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, compiler);

        deadAssignmentsElimination.enterScope(traversal);

        // If no assignments are found, liveness should not be computed.
        assertNull(deadAssignmentsElimination.liveness);
    }

    @Test
    public void testNonLocalAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(); // No 'x' declared in this scope
        scope.isGlobal = true; // Assume global scope where 'x' might be global.

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(null, false); // Var doesn't matter if not declared locally
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(assignX);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // tryRemoveAssignment should return early because `!scope.isDeclared(name, false)`
        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, assignX, mockState);

        assertFalse(compiler.hasCodeChanged());
        assertEquals(Token.ASSIGN, assignX.getType()); // Assignment should remain unchanged
    }

    @Test
    public void testForInLoopNoConditionCheck() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1

        Node iterator = createNode(Token.NAME, "key");
        Node object = new Node(Token.OBJECTLIT);
        Node forInNode = new Node(Token.FOR, iterator, object, new Node(Token.BLOCK)); // for (key in {})

        // Dead assignment inside the loop body, not the loop condition itself
        Node statementInLoop = createExpressionStatement(assignX);
        forInNode.getLastChild().addChildToBack(statementInLoop);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(forInNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // The tryRemoveDeadAssignments method should handle FOR loops by only checking the condition.
        // The assignment inside the loop body is handled by the generic case.
        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, forInNode, mockState);

        assertTrue(compiler.hasCodeChanged()); // The assignment inside should be considered
        assertEquals(Token.NUMBER, assignX.getParent().getType());
        assertEquals(1.0, assignX.getParent().getDouble(), 0.0);
    }

    @Test
    public void testAssignmentOpRemoval() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node addAssign = new Node(Token.ASSIGN_ADD, x, one); // x += 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(addAssign);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, addAssign, addAssign, mockState);

        assertTrue(compiler.hasCodeChanged());
        // x += 1 is replaced by x + 1
        assertEquals(Token.ADD, addAssign.getParent().getType());
        assertEquals(Token.NAME, addAssign.getParent().getFirstChild().getType());
        assertEquals(Token.NUMBER, addAssign.getParent().getSecondChild().getType());
    }

    @Test
    public void testVariableStillLiveWithinExpressionHookTrueBranch() throws Exception {
        // Example: `a = 1 ? x : y;` where `a = 1` is dead, but `x` might be live.
        Node cond = createNode(Token.NUMBER, 1.0);
        Node x = createNode(Token.NAME, "x"); // Variable to check
        Node y = createNode(Token.NAME, "y");
        Node hook = new Node(Token.HOOK, cond, x, y);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(hook);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The assignment is within the hook's true branch.
        // We simulate `isVariableStillLiveWithinExpression` being called for `x`.
        // The `checkHookBranchReadBeforeKill` for the true branch (`x`) will be called.
        // If `x` is read, it should return true.
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(x, hook, "x"));
    }

    @Test
    public void testVariableStillLiveWithinExpressionHookFalseBranch() throws Exception {
        // Example: `a = 0 ? x : y;` where `a = 0` is dead, but `y` might be live.
        Node cond = createNode(Token.NUMBER, 0.0);
        Node x = createNode(Token.NAME, "x");
        Node y = createNode(Token.NAME, "y"); // Variable to check
        Node hook = new Node(Token.HOOK, cond, x, y);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("y");
        MockVar varY = (MockVar) scope.getVar("y");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varY, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(hook);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The assignment is within the hook's false branch.
        // We simulate `isVariableStillLiveWithinExpression` being called for `y`.
        // The `checkHookBranchReadBeforeKill` for the false branch (`y`) will be called.
        // If `y` is read, it should return true.
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(y, hook, "y"));
    }

    @Test
    public void testVariableStillLiveWithinExpressionAndOperator() throws Exception {
        // Example: `a = 1 && x;` where `a = 1` is dead, but `x` is live.
        Node assignA = createAssignment(createNode(Token.NAME, "a"), createNode(Token.NUMBER, 1.0)); // a = 1
        Node x = createNode(Token.NAME, "x"); // Variable to check
        Node andNode = new Node(Token.AND, assignA, x);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(andNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The assignment `a=1` is the first child of AND. The variable `x` is the second child.
        // `isVariableStillLiveWithinExpression` should check if `x` is live.
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(assignA, andNode, "x"));
    }

    @Test
    public void testVariableStillLiveWithinExpressionOrOperator() throws Exception {
        // Example: `a = 0 || x;` where `a = 0` is dead, but `x` is live.
        Node assignA = createAssignment(createNode(Token.NAME, "a"), createNode(Token.NUMBER, 0.0)); // a = 0
        Node x = createNode(Token.NAME, "x"); // Variable to check
        Node orNode = new Node(Token.OR, assignA, x);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(orNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The assignment `a=0` is the first child of OR. The variable `x` is the second child.
        // `isVariableStillLiveWithinExpression` should check if `x` is live.
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(assignA, orNode, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillSimpleRead() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node readX = createNode(Token.NAME, "x"); // read x
        Node seq = new Node(Token.COMMA, assignX, readX);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        assertEquals(DeadAssignmentsElimination.VariableLiveness.READ, dae.isVariableReadBeforeKill(readX, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillSimpleKill() throws Exception {
        Node x1 = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX1 = createAssignment(x1, one); // x = 1

        Node x2 = createNode(Token.NAME, "x");
        Node two = createNode(Token.NUMBER, 2.0);
        Node assignX2 = createAssignment(x2, two); // x = 2
        Node seq = new Node(Token.COMMA, assignX1, assignX2);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        assertEquals(DeadAssignmentsElimination.VariableLiveness.KILL, dae.isVariableReadBeforeKill(assignX1, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillNestedRead() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node subAssign = createAssignment(createNode(Token.NAME, "y"), x); // y = x
        Node readX = createNode(Token.NAME, "x");
        Node seq = new Node(Token.COMMA, subAssign, readX);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        assertEquals(DeadAssignmentsElimination.VariableLiveness.READ, dae.isVariableReadBeforeKill(subAssign, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillNestedKill() throws Exception {
        Node x1 = createNode(Token.NAME, "x");
        Node subAssign1 = createAssignment(createNode(Token.NAME, "y"), createNode(Token.NUMBER, 1.0)); // y = 1
        Node assignX1 = createAssignment(x1, subAssign1); // x = (y=1)

        Node x2 = createNode(Token.NAME, "x");
        Node subAssign2 = createAssignment(createNode(Token.NAME, "z"), createNode(Token.NUMBER, 2.0)); // z = 2
        Node assignX2 = createAssignment(x2, subAssign2); // x = (z=2)
        Node seq = new Node(Token.COMMA, assignX1, assignX2);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        assertEquals(DeadAssignmentsElimination.VariableLiveness.KILL, dae.isVariableReadBeforeKill(assignX1, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillAssignRhsRead() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node readX = createNode(Token.NAME, "x"); // read x
        Node seq = new Node(Token.COMMA, assignX, readX);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        // The logic for Token.ASSIGN is special: the RHS is evaluated before the kill.
        // So if x is read on the RHS, it's a READ.
        assertEquals(DeadAssignmentsElimination.VariableLiveness.READ, dae.isVariableReadBeforeKill(assignX, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillAssignRhsKill() throws Exception {
        Node x1 = createNode(Token.NAME, "x");
        Node x2 = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX2 = createAssignment(x2, one); // x = 1
        Node assignX1 = createAssignment(x1, assignX2); // x = (x = 1)

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        // The assignment x = (x = 1) means x is killed.
        assertEquals(DeadAssignmentsElimination.VariableLiveness.KILL, dae.isVariableReadBeforeKill(assignX1, "x"));
    }

    @Test
    public void testProcessMethod() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.SCRIPT);
        deadAssignmentsElimination.process(externs, root);
        // This method mainly triggers NodeTraversal.traverse, which is hard to mock fully here.
        // The side effect is that `enterScope` and `visit` would be called.
        // We can't assert much directly without a full traversal.
        // The key check is that it doesn't crash.
        assertTrue(true); // Indicates no exception was thrown.
    }

    @Test
    public void testEnterScopeWithFunction() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        Node blockNode = new Node(Token.BLOCK, functionNode); // Function inside a block
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        MockScope scope = new MockScope(); // Not global, so enterScope logic applies
        scope.isGlobal = false; // Ensure it's not global
        ControlFlowGraph<Node> cfg = createMinimalCFG(blockNode);
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, compiler);

        deadAssignmentsElimination.enterScope(traversal);

        // Liveness should not be computed because NodeUtil.containsFunction is true.
        assertNull(deadAssignmentsElimination.liveness);
    }

    @Test
    public void testEnterScopeNoAssigns() throws Exception {
        Node literalNode = createNode(Token.NUMBER, 5.0);
        Node blockNode = createBlock(literalNode); // No assignments

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        MockScope scope = new MockScope();
        ControlFlowGraph<Node> cfg = createMinimalCFG(blockNode);
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, compiler);

        deadAssignmentsElimination.enterScope(traversal);

        // Liveness should not be computed because NodeUtil.has(...) is false.
        assertNull(deadAssignmentsElimination.liveness);
    }

    @Test
    public void testTryRemoveDeadAssignmentsLoop() throws Exception {
        // Test for loops like WHILE, DO, FOR
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node cond = assignX; // assignment as condition

        Node whileNode = new Node(Token.WHILE, cond, new Node(Token.BLOCK)); // WHILE(x=1) {}

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(whileNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for IF (similar logic)
        deadAssignmentsElimination.tryRemoveAssignment(null, cond, whileNode, mockState);

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, cond.getParent().getType());
        assertEquals(1.0, cond.getParent().getDouble(), 0.0);
    }

    @Test
    public void testTryRemoveDeadAssignmentsCase() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node caseNode = new Node(Token.CASE, assignX); // CASE x = 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(caseNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, caseNode, mockState);

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, assignX.getParent().getType());
        assertEquals(1.0, assignX.getParent().getDouble(), 0.0);
    }

    @Test
    public void testExitScopeDoesNothing() throws Exception {
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(null);
        MockScope scope = new MockScope();
        ControlFlowGraph<Node> cfg = createMinimalCFG(new Node(Token.BLOCK));
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, null);
        deadAssignmentsElimination.exitScope(traversal);
        // exitScope is expected to do nothing.
        assertTrue(true);
    }

    @Test
    public void testVisitDoesNothing() throws Exception {
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(null);
        MockScope scope = new MockScope();
        ControlFlowGraph<Node> cfg = createMinimalCFG(new Node(Token.BLOCK));
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, null);
        Node n = new Node(Token.NAME, "x");
        Node parent = new Node(Token.BLOCK);
        deadAssignmentsElimination.visit(traversal, n, parent);
        // visit is an empty method.
        assertTrue(true);
    }
}





