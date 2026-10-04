```java
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


    private void assertCFGSize(ControlFlowGraph<Node> cfg, int size) {
        // The getDirectedGraphNodes() method returns a Collection, which has a size().
        // Fixed: cfg.getDirectedGraphNodes() returns a Collection, use size() on that.
        assertEquals(size, cfg.getDirectedGraphNodes().size());
    }

    private void assertEdgeCount(ControlFlowGraph<Node> cfg, int count) {
        int edgeCount = 0;
        // Fixed: DiGraphNode's getOutDegree is not directly accessible, use cfg.getOutDegree.
        for (DiGraph.DiGraphNode<Node, Branch> node : cfg.getDirectedGraphNodes()) {
            edgeCount += cfg.getOutDegree(node);
        }
        assertEquals(count, edgeCount);
    }

    @Test
    public void testSimpleBlock() throws Exception {
        String code = "{ var a = 1; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Block, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Block, Block -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testEmptyBlock() throws Exception {
        String code = "{}";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Block, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Block, Block -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testBlockWithReturn() throws Exception {
        String code = "{ return; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Block, Return
        assertCFGSize(cfg, 3);
        // Script -> Block, Block -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testIfWithoutElse() throws Exception {
        String code = "if (true) { a = 1; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, IF, Block, Return (implicit)
        assertCFGSize(cfg, 4);
        // Script -> IF(true), IF(true) -> Block, IF(true) -> Return (else branch), Block -> Return
        assertEdgeCount(cfg, 4);
    }

    @Test
    public void testIfWithElse() throws Exception {
        String code = "if (true) { a = 1; } else { b = 2; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, IF, ThenBlock, ElseBlock, Return (implicit)
        assertCFGSize(cfg, 5);
        // Script -> IF(true), IF(true) -> ThenBlock, IF(true) -> ElseBlock, ThenBlock -> Return, ElseBlock -> Return
        assertEdgeCount(cfg, 5);
    }

    @Test
    public void testWhileLoop() throws Exception {
        String code = "while(true) { a = 1; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, WHILE, Block, Return (implicit)
        assertCFGSize(cfg, 4);
        // Script -> WHILE(true), WHILE(true) -> Block, WHILE(true) -> Return (false branch), Block -> WHILE (iteration)
        assertEdgeCount(cfg, 4);
    }

    @Test
    public void testDoLoop() throws Exception {
        String code = "do { a = 1; } while(true);";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, DO, Block, Return (implicit)
        assertCFGSize(cfg, 4);
        // Script -> DO, DO -> Block, DO -> Return (false branch), Block -> DO (iteration)
        assertEdgeCount(cfg, 4);
    }

    @Test
    public void testForLoop() throws Exception {
        String code = "for(var i=0; i<10; i++) { a = 1; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, FOR_INIT, FOR_COND, FOR_BODY, FOR_ITER, Return (implicit)
        assertCFGSize(cfg, 6);
        // Script -> FOR_INIT, FOR_INIT -> FOR_COND, FOR_COND(true) -> FOR_BODY, FOR_COND(false) -> Return, FOR_BODY -> FOR_ITER, FOR_ITER -> FOR_COND
        assertEdgeCount(cfg, 6);
    }

    @Test
    public void testForInLoop() throws Exception {
        String code = "for(var x in obj) { a = 1; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, FOR_IN_COLLECTION, FOR_IN_ITER, FOR_BODY, Return (implicit)
        assertCFGSize(cfg, 5);
        // Script -> FOR_IN_COLLECTION, FOR_IN_COLLECTION -> FOR_IN_ITER, FOR_IN_ITER(true) -> FOR_BODY, FOR_IN_ITER(false) -> Return, FOR_BODY -> FOR_IN_ITER
        assertEdgeCount(cfg, 5);
    }

    @Test
    public void testSwitchStatement() throws Exception {
        String code = "switch(x) { case 1: a=1; break; default: b=2; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, SWITCH, CASE(1), CASE_BODY(1), BREAK, DEFAULT, DEFAULT_BODY, Return (implicit)
        assertCFGSize(cfg, 8);
        // Script -> SWITCH, SWITCH -> CASE(1), CASE(1) -> CASE_BODY(1), CASE_BODY(1) -> BREAK, BREAK -> Return, SWITCH -> DEFAULT, DEFAULT -> DEFAULT_BODY, DEFAULT_BODY -> Return
        assertEdgeCount(cfg, 8);
    }

    @Test
    public void testTryCatchFinally() throws Exception {
        String code = "try { a=1; } catch(e) { b=2; } finally { c=3; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, TRY, TRY_BLOCK, CATCH, CATCH_BLOCK, FINALLY, FINALLY_BLOCK, Return (implicit)
        assertCFGSize(cfg, 8);
        // Script -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> CATCH, TRY_BLOCK -> FINALLY, CATCH -> CATCH_BLOCK, CATCH_BLOCK -> FINALLY, FINALLY -> FINALLY_BLOCK, FINALLY_BLOCK -> Return
        assertEdgeCount(cfg, 9);
    }

    @Test
    public void testTryFinally() throws Exception {
        String code = "try { a=1; } finally { c=3; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, TRY, TRY_BLOCK, FINALLY, FINALLY_BLOCK, Return (implicit)
        assertCFGSize(cfg, 6);
        // Script -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> FINALLY, FINALLY -> FINALLY_BLOCK, FINALLY_BLOCK -> Return
        assertEdgeCount(cfg, 5);
    }

    @Test
    public void testThrowStatement() throws Exception {
        String code = "throw 'error';";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Throw, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Throw, Throw -> Return (implicit return after throw)
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testBreakStatement() throws Exception {
        String code = "while(true) { break; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, WHILE, Block, Break, Return (implicit)
        assertCFGSize(cfg, 5);
        // Script -> WHILE, WHILE -> Block, Block -> Break, Break -> Return, WHILE -> Return (false condition)
        assertEdgeCount(cfg, 5);
    }

    @Test
    public void testContinueStatement() throws Exception {
        String code = "while(true) { continue; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, WHILE, Block, Continue, Return (implicit)
        assertCFGSize(cfg, 5);
        // Script -> WHILE, WHILE -> Block, Block -> Continue, Continue -> WHILE, WHILE -> Return (false condition)
        assertEdgeCount(cfg, 5);
    }

    @Test
    public void testFunctionDeclaration() throws Exception {
        String code = "function foo() {}";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Function, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Function, Function -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testFunctionCall() throws Exception {
        String code = "foo();";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, ExprResult(Call), Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> ExprResult(Call), ExprResult(Call) -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testExpressionStatement() throws Exception {
        String code = "a = 1;";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, ExprResult(Assign), Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> ExprResult(Assign), ExprResult(Assign) -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testNestedIf() throws Exception {
        String code = "if (true) { if (false) { a=1; } }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Outer IF, Inner IF, Inner Block, Return (implicit)
        assertCFGSize(cfg, 5);
        // Script -> Outer IF, Outer IF(true) -> Inner IF, Outer IF(false) -> Return, Inner IF(false) -> Return, Inner IF(true) -> Inner Block, Inner Block -> Return
        assertEdgeCount(cfg, 6);
    }

    @Test
    public void testLabeledStatementBreak() throws Exception {
        String code = "loop: while(true) { break loop; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Label, WHILE, Block, Break, Return (implicit)
        assertCFGSize(cfg, 6);
        // Script -> Label, Label -> WHILE, WHILE -> Block, Block -> Break, Break -> Return, WHILE -> Return (false condition)
        assertEdgeCount(cfg, 6);
    }

    @Test
    public void testLabeledStatementContinue() throws Exception {
        String code = "loop: while(true) { continue loop; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Label, WHILE, Block, Continue, Return (implicit)
        assertCFGSize(cfg, 6);
        // Script -> Label, Label -> WHILE, WHILE -> Block, Block -> Continue, Continue -> WHILE, WHILE -> Return (false condition)
        assertEdgeCount(cfg, 6);
    }

    @Test
    public void testWithStatement() throws Exception {
        String code = "with(obj) { a=1; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, WITH, Block, Return (implicit)
        assertCFGSize(cfg, 4);
        // Script -> WITH, WITH -> Block, Block -> Return
        assertEdgeCount(cfg, 3);
    }

    @Test
    public void testCatchBlockOnly() throws Exception {
        String code = "try {} catch(e) {}";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, TRY, TRY_BLOCK(empty), CATCH, CATCH_BLOCK(empty), Return (implicit)
        assertCFGSize(cfg, 6);
        // Script -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> CATCH, CATCH -> CATCH_BLOCK, CATCH_BLOCK -> Return
        assertEdgeCount(cfg, 5);
    }

    @Test
    public void testCatchAndFinally() throws Exception {
        String code = "try {} catch(e) {} finally { c=3; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, TRY, TRY_BLOCK(empty), CATCH, CATCH_BLOCK(empty), FINALLY, FINALLY_BLOCK, Return (implicit)
        assertCFGSize(cfg, 8);
        // Script -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> CATCH, TRY_BLOCK -> FINALLY, CATCH -> CATCH_BLOCK, CATCH_BLOCK -> FINALLY, FINALLY -> FINALLY_BLOCK, FINALLY_BLOCK -> Return
        assertEdgeCount(cfg, 8);
    }

    @Test
    public void testExceptionMayThrow() throws Exception {
        Node fooNode = new Node(Token.NAME, 0, 0);
        fooNode.setString("foo");
        Node callNode = new Node(Token.CALL, fooNode, 0, 0);
        assertTrue(ControlFlowAnalysis.mayThrowException(callNode));
    }

    @Test
    public void testExceptionMayNotThrow() throws Exception {
        Node node = Node.newNumber(10); // This is a valid static method
        assertFalse(ControlFlowAnalysis.mayThrowException(node));
    }

    @Test
    public void testComparator() throws Exception {
        String code = "{ var a = 1; if (a > 0) { a = 2; } else { a = 3; } }";
        AbstractCompiler compiler = new Compiler();
        Node root = compiler.parseSyntheticCode(code);
        ControlFlowAnalysis analysis = new ControlFlowAnalysis(compiler, true, true);
        analysis.process(null, root);
        ControlFlowGraph<Node> cfg = analysis.getCfg();

        DiGraph.DiGraphNode<Node, Branch> entry = cfg.getEntry();
        DiGraph.DiGraphNode<Node, Branch> scriptNode = null;
        DiGraph.DiGraphNode<Node, Branch> blockNode = null;
        DiGraph.DiGraphNode<Node, Branch> ifNode = null;
        DiGraph.DiGraphNode<Node, Branch> thenNode = null;
        DiGraph.DiGraphNode<Node, Branch> elseNode = null;
        DiGraph.DiGraphNode<Node, Branch> returnNode = null;

        for (DiGraph.DiGraphNode<Node, Branch> node : cfg.getDirectedGraphNodes()) {
            Node value = node.getValue();
            if (value.isScript()) scriptNode = node;
            if (value.isBlock()) blockNode = node;
            if (value.isIf()) ifNode = node;

            // Use findNodeByCondition for finding specific assignment nodes
            if (value.getType() == Token.ASSIGN) {
                if (value.getFirstChild().getString().equals("a")) {
                    if (value.getLastChild().getDouble() == 2.0) { // Use getDouble for numbers
                        thenNode = node;
                    } else if (value.getLastChild().getDouble() == 3.0) {
                        elseNode = node;
                    }
                }
            }
            if (value.isReturn()) returnNode = node;
        }

        Comparator<DiGraph.DiGraphNode<Node, Branch>> comparator = cfg.getOptionalNodeComparator(true);

        // Check basic ordering based on AST position
        assertTrue(comparator.compare(scriptNode, blockNode) < 0);
        assertTrue(comparator.compare(blockNode, ifNode) < 0);
        // The 'then' assignment node should come before the 'else' assignment node in AST order
        assertTrue(comparator.compare(ifNode, thenNode) < 0);
        assertTrue(comparator.compare(thenNode, elseNode) < 0); // Ensure 'then' is before 'else'
        assertTrue(comparator.compare(thenNode, returnNode) < 0);
        assertTrue(comparator.compare(elseNode, returnNode) < 0);
    }

    @Test
    public void testEmptyCatchBlockWithFinally() throws Exception {
        String code = "try { foo(); } catch (e) {} finally { bar(); }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, TRY, TRY_BLOCK, CATCH, CATCH_BLOCK, FINALLY, FINALLY_BLOCK, Return (implicit)
        assertCFGSize(cfg, 8);
        // Script -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> CATCH, TRY_BLOCK -> FINALLY, CATCH -> CATCH_BLOCK, CATCH_BLOCK -> FINALLY, FINALLY -> FINALLY_BLOCK, FINALLY_BLOCK -> Return
        assertEdgeCount(cfg, 9); // Added edge from CATCH_BLOCK to FINALLY
    }

    @Test
    public void testReturnInTryWithFinally() throws Exception {
        String code = "try { return 1; } finally { foo(); }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, TRY, TRY_BLOCK, Return_in_TRY, FINALLY, FINALLY_BLOCK, Return_after_FINALLY (implicit)
        assertCFGSize(cfg, 7);
        // Script -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> Return_in_TRY, Return_in_TRY -> FINALLY, FINALLY -> FINALLY_BLOCK, FINALLY_BLOCK -> Return_after_FINALLY
        assertEdgeCount(cfg, 6);
    }

    @Test
    public void testBreakInTryWithFinally() throws Exception {
        String code = "while(true) { try { break; } finally { foo(); } }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, WHILE, TRY, TRY_BLOCK, Break, FINALLY, FINALLY_BLOCK, Return (implicit)
        assertCFGSize(cfg, 8);
        // Script -> WHILE, WHILE -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> Break, Break -> FINALLY, FINALLY -> FINALLY_BLOCK, FINALLY_BLOCK -> WHILE (loop back), WHILE -> Return (loop exit)
        assertEdgeCount(cfg, 8);
    }

    @Test
    public void testContinueInTryWithFinally() throws Exception {
        String code = "while(true) { try { continue; } finally { foo(); } }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, WHILE, TRY, TRY_BLOCK, Continue, FINALLY, FINALLY_BLOCK, Return (implicit)
        assertCFGSize(cfg, 8);
        // Script -> WHILE, WHILE -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> Continue, Continue -> FINALLY, FINALLY -> FINALLY_BLOCK, FINALLY_BLOCK -> WHILE (loop back), WHILE -> Return (loop exit)
        assertEdgeCount(cfg, 8);
    }

    @Test
    public void testExceptionInCatchWithFinally() throws Exception {
        String code = "try { throw 'err'; } catch(e) { throw 'err2'; } finally { foo(); }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, TRY, TRY_BLOCK, Throw1, CATCH, Catch_Throw, FINALLY, FINALLY_BLOCK, Return (implicit)
        assertCFGSize(cfg, 9);
        // Script -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> Throw1, Throw1 -> CATCH, CATCH -> Catch_Throw, Catch_Throw -> FINALLY, FINALLY -> FINALLY_BLOCK, FINALLY_BLOCK -> Return
        assertEdgeCount(cfg, 8);
    }

    @Test
    public void testExceptionHandlerNonCatchable() throws Exception {
        // This test assumes a potential exception from foo() that is not caught by the catch block.
        // The CFG should still reflect the structure.
        String code = "try { foo(); } catch(e) {}";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, TRY, TRY_BLOCK, CATCH, CATCH_BLOCK(empty), Return (implicit)
        assertCFGSize(cfg, 6);
        // Script -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> CATCH, CATCH -> CATCH_BLOCK, CATCH_BLOCK -> Return
        assertEdgeCount(cfg, 5);
    }

    @Test
    public void testFunctionWithReturn() throws Exception {
        String code = "function f() { return 5; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Function, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Function, Function -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testNestedFunction() throws Exception {
        String code = "function f() { function g() { return 1; } return 2; }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Outer Function, Inner Function, Inner Return, Outer Return (implicit)
        assertCFGSize(cfg, 5);
        // Script -> Outer Function, Outer Function -> Inner Function, Inner Function -> Inner Return, Inner Return -> Outer Function (return from g), Outer Function -> Outer Return
        assertEdgeCount(cfg, 5);
    }

    @Test
    public void testFunctionWithTryCatchFinally() throws Exception {
        String code = "function f() { try { return 1; } catch(e) { return 2; } finally { return 3; }}";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Function, TRY, TRY_BLOCK, Return_Try, CATCH, Catch_Return, FINALLY, FINALLY_Return, Return_after_finally (implicit)
        assertCFGSize(cfg, 10);
        // Script -> Function, Function -> TRY, TRY -> TRY_BLOCK, TRY_BLOCK -> Return_Try, Return_Try -> FINALLY, CATCH -> Catch_Return, Catch_Return -> FINALLY, FINALLY -> FINALLY_Return, FINALLY_Return -> Return_after_finally
        assertEdgeCount(cfg, 9); // FINALLY has an explicit return, so it's the exit from the function.
    }

    @Test
    public void testMaxIntValue() throws Exception {
        String code = "var x = 2147483647;"; // Max int value
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Assign, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Assign, Assign -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testMinIntValue() throws Exception {
        String code = "var x = -2147483648;"; // Min int value
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Assign, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Assign, Assign -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testLargeDoubleValue() throws Exception {
        String code = "var x = 1.7976931348623157E308;"; // Max double value
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Assign, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Assign, Assign -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testSmallDoubleValue() throws Exception {
        String code = "var x = 5E-324;"; // Min positive double value
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Assign, Return (implicit)
        assertCFGSize(cfg, 3);
        // Script -> Assign, Assign -> Return
        assertEdgeCount(cfg, 2);
    }

    @Test
    public void testBreakInNestedTryFinally() throws Exception {
        String code = "try { try { break; } finally { foo(); } } catch(e) {}";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Outer TRY, Inner TRY, Inner Block, Break, Inner FINALLY, Inner FINALLY Block, Outer CATCH, Outer CATCH Block, Return (implicit)
        assertCFGSize(cfg, 10);
        // Script -> Outer TRY, Outer TRY -> Inner TRY, Inner TRY -> Inner Block, Inner Block -> Break, Break -> Inner FINALLY, Inner FINALLY -> Inner FINALLY Block, Inner FINALLY Block -> Outer CATCH, Outer CATCH -> Outer CATCH Block, Outer CATCH Block -> Return
        assertEdgeCount(cfg, 9);
    }

    @Test
    public void testContinueInNestedLoops() throws Exception {
        String code = "outer: for(;;) { inner: for(;;) { continue outer; } }";
        ControlFlowAnalysis analysis = createAnalysis(code);
        ControlFlowGraph<Node> cfg = analysis.getCfg();
        // Script, Outer FOR, Outer Cond, Outer Body, Inner FOR, Inner Cond, Inner Body, Continue, Return (implicit)
        assertCFGSize(cfg, 9);
        // Script -> Outer FOR, Outer FOR -> Outer Cond, Outer Cond(true) -> Outer Body, Outer Cond(false) -> Return, Outer Body -> Inner FOR, Inner FOR -> Inner Cond, Inner Cond(true) -> Inner Body, Inner Body -> Continue, Continue -> Outer FOR
        assertEdgeCount(cfg, 9);
    }
}
```