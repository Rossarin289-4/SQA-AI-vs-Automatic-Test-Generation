package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.MustBeReachingVariableDef.Definition;
import com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.io.IOException; // Not directly used, but kept from original imports if necessary for potential future expansions.
import java.util.Comparator; // Added for ControlFlowGraph, assuming it might be needed internally by FlowSensitiveInlineVariables.

// A minimal stub for AbstractCompiler to allow instantiation.
class StubCompiler implements AbstractCompiler {

}


public class FlowSensitiveInlineVariablesTest {


    // Helper to create a basic AST for testing.
    private Node createScript(String code) {
        // For testing, we manually construct nodes or use simple string parsing.
        // This is a simplification. A real compiler would parse this.
        // We will construct AST nodes manually for each test.
        // The `createScript` helper is not used in the tests below as manual construction is preferred.
        return null; // Placeholder, not used by tests below.
    }

    // Helper method to construct a simple function and its body for tests.
    private Node createFunction(String name, Node params, Node body) {
        Node fn = new Node(Token.FUNCTION, Node.newString(name), params, body);
        // Need to ensure function has a name node if it's a declaration, or is anonymous.
        // For simplicity here, assuming `name` is handled correctly by `Node.newString(name)`.
        return fn;
    }

    // Helper to create a simple block with statements.
    private Node createBlock(Node... statements) {
        Node block = new Node(Token.BLOCK);
        for (Node stmt : statements) {
            if (stmt != null) { // Ensure null statements are not added.
                block.addChildToBack(stmt);
            }
        }
        return block;
    }






















    @Test
    public void testNoInlineIfDefinitionIsNewObject() throws Exception {
        // var x = new MyClass(); return x;
        Node varDecl = Node.newVar(Node.newName("x"), new Node(Token.NEW, new Node(Token.CALL, Node.newName("MyClass"))));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because it's a new object.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineIfDefinitionIsNewSimpleLiteral() throws Exception {
        // var x = new String('hello'); return x;
        Node stringConstructorCall = Node.newCall(Node.newName("String"), Node.newString("hello"));
        Node varDecl = Node.newVar(Node.newName("x"), new Node(Token.NEW, stringConstructorCall));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // The 'new String("hello")' is a literal string, should be inlined.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isString() && returnedNode.getString().equals("hello"));
    }

    @Test
    public void testNoInlineIfVariableIsParameter() throws Exception {
        // function foo(x) { return x; }
        Node functionBody = createBlock(new Node(Token.RETURN, Node.newName("x")));
        Node functionDecl = createFunction("foo", Node.newParamList(Node.newName("x")), functionBody);
        Node root = createBlock(functionDecl);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // Parameters should not be inlined.
        Node returnedNode = root.getFirstChild().getLastChild().getChildAtIndex(0); // Return x
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineVariableDefinedWithGetProp() throws Exception {
        // var obj = {a: 1}; var x = obj.a; return x;
        Node objDecl = Node.newVar(Node.newName("obj"), Node.newObjectLit("a", Node.newNumber(1)));
        Node xDecl = Node.newVar(Node.newName("x"), Node.newGetProp(Node.newName("obj"), Node.newString("a")));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(objDecl, xDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with 'obj.a'. Since obj.a is a constant 1, it should be inlined to 1.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testInlineVariableDefinedWithGetElem() throws Exception {
        // var arr = [1]; var x = arr[0]; return x;
        Node arrDecl = Node.newVar(Node.newName("arr"), Node.newArray(Node.newNumber(1)));
        Node xDecl = Node.newVar(Node.newName("x"), Node.newArray(Node.newName("arr"), Node.newNumber(0))); // arr[0]
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(arrDecl, xDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with 'arr[0]'. Since arr[0] is a constant 1, it should be inlined to 1.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testNoInlineIfVariableIsUsedInCatchBlock() throws Exception {
        // try {} catch(e) { var x = e; return x; }
        Node catchBody = createBlock(Node.newVar(Node.newName("x"), Node.newName("e")), new Node(Token.RETURN, Node.newName("x")));
        Node catchClause = new Node(Token.CATCH, Node.newName("e"), catchBody);
        Node tryBlock = new Node(Token.BLOCK);
        Node tryStatement = new Node(Token.TRY, tryBlock, catchClause);
        Node root = createBlock(tryStatement);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because 'e' is from a catch block.
        Node returnedNode = root.getFirstChild().getChildAtIndex(1).getChildAtIndex(1).getChildAtIndex(0); // Return x
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineIfVariableAssignedAndReadInSameBasicBlock() throws Exception {
        // var x = 1; return x; (Simplified to a single block, testing if inlining works in a simple sequence)
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNumber(1));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testNoInlineIfDefinitionRightHandSideIsComplexExpression() throws Exception {
        // var x = (function() { return 1; })(); return x;
        Node functionBody = createBlock(new Node(Token.RETURN, Node.newNumber(1)));
        Node functionExpr = new Node(Token.FUNCTION, null, new Node(Token.PARAM_LIST), functionBody);
        Node IIFE = new Node(Token.CALL, functionExpr);
        Node varDecl = Node.newVar(Node.newName("x"), IIFE);
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // Not inlined due to complex RHS (IIFE).
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineIfDefinitionRightHandSideIsSimpleLiteralFunction() throws Exception {
        // var x = function(){}; return x;
        Node functionDecl = new Node(Token.FUNCTION, null, new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Node varDecl = Node.newVar(Node.newName("x"), functionDecl);
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // Simple function declaration is generally not inlined as a value.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testNoInlineIfDefinitionRightHandSideHasSideEffects() throws Exception {
        // var x; x = (function() { console.log('side effect'); return 5; })(); return x;
        Node functionBody = createBlock(
            Node.newCall(Node.newGetProp(Node.newName("console"), Node.newString("log")), Node.newString("side effect")),
            new Node(Token.RETURN, Node.newNumber(5))
        );
        Node functionExpr = new Node(Token.FUNCTION, null, new Node(Token.PARAM_LIST), functionBody);
        Node IIFE = new Node(Token.CALL, functionExpr);
        Node varDecl = Node.newVar(Node.newName("x")); // var x;
        Node assignment = Node.newExpr(Node.newAssign(Node.newName("x"), IIFE)); // x = IIFE;
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, assignment, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // Not inlined due to side effects in the RHS.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineIfDefinitionHasNoSideEffectsAndIsUsedOnce() throws Exception {
        // var x = 1 + 2; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newAdd(Node.newNumber(1), Node.newNumber(2)));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with '1 + 2'.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isAdd());
        assertTrue(returnedNode.getFirstChild().isNumber() && returnedNode.getFirstChild().getDouble() == 1.0);
        assertTrue(returnedNode.getLastChild().isNumber() && returnedNode.getLastChild().getDouble() == 2.0);
    }

    @Test
    public void testNoInlineIfVariableIsExported() throws Exception {
        // var exportedVar = 1; return exportedVar;
        Node varDecl = Node.newVar(Node.newName("exportedVar"), Node.newNumber(1));
        Node returnStmt = new Node(Token.RETURN, Node.newName("exportedVar"));
        Node root = createBlock(varDecl, returnStmt);

        // Mock the compiler to report 'exportedVar' as exported.
        AbstractCompiler exportingCompiler = new StubCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new GoogleCodingConvention() {
                    @Override
                    public boolean isExported(String name) {
                        return "exportedVar".equals(name);
                    }
                };
            }
        };
        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(exportingCompiler);
        inlinePass.process(null, root);

        // 'exportedVar' should not be inlined because it's exported.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("exportedVar"));
    }

    @Test
    public void testInlineIfVariableAssignedAndReadInSameStatement() throws Exception {
        // var x; return x = 1;
        Node varDecl = Node.newVar(Node.newName("x"));
        Node assignment = Node.newAssign(Node.newName("x"), Node.newNumber(1));
        Node returnStmt = new Node(Token.RETURN, assignment);
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // The assignment 'x = 1' itself should remain, and the returned value is the result of the assignment, which is 1.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isAssign());
        assertTrue(returnedNode.getFirstChild().isName() && returnedNode.getFirstChild().getString().equals("x"));
        assertTrue(returnedNode.getLastChild().isNumber() && returnedNode.getLastChild().getDouble() == 1.0);
    }

    @Test
    public void testNoInlineIfRightOfDefinitionHasSideEffects() throws Exception {
        // var x; x = sideEffect() + 1; return x;
        Node varDecl = Node.newVar(Node.newName("x"));
        Node assignment = Node.newExpr(Node.newAssign(Node.newName("x"), Node.newAdd(Node.newCall(Node.newName("sideEffect")), Node.newNumber(1))));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, assignment, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because the RHS has a side effect.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testNoInlineIfLeftOfUseHasSideEffects() throws Exception {
        // var x = 1; modify() + x; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNumber(1));
        Node expression = Node.newAdd(Node.newCall(Node.newName("modify")), Node.newName("x"));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, expression, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because there's a side effect on the left of its use.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineIfDefinitionIsSimpleSubtraction() throws Exception {
        // var x = 5 - 2; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newSub(Node.newNumber(5), Node.newNumber(2)));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isSub());
        assertTrue(returnedNode.getFirstChild().isNumber() && returnedNode.getFirstChild().getDouble() == 5.0);
        assertTrue(returnedNode.getLastChild().isNumber() && returnedNode.getLastChild().getDouble() == 2.0);
    }

    @Test
    public void testNoInlineIfVariableAssignedInConditional() throws Exception {
        // var x = 0; if (true) { x = 1; } return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNumber(0));
        Node ifBlock = createBlock(Node.newAssign(Node.newName("x"), Node.newNumber(1)));
        Node ifStatement = new Node(Token.IF, Node.newTrue(), ifBlock);
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, ifStatement, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because it's assigned in a conditional branch.
        Node returnedNode = root.getLastChild().getChildAtIndex(0);
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    // Test for enterScope: checks basic setup and candidate gathering.
    // This test needs to simulate a scope and CFG which is complex.
    // We will test if the core fields of FlowSensitiveInlineVariables are initialized.
    @Test
    public void testEnterScope_InitializesDataStructures() throws Exception {
        // Create a simple function to trigger enterScope.
        Node functionBody = createBlock(Node.newVar(Node.newName("x"), Node.newNumber(1)), new Node(Token.RETURN, Node.newName("x")));
        Node functionDecl = createFunction("testFunc", new Node(Token.PARAM_LIST), functionBody);
        Node root = createBlock(functionDecl);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        // Calling process will internally trigger traversals that call enterScope for functions.
        inlinePass.process(null, root);

        // Check if the fields are initialized (this is an indirect check on enterScope's setup)
        assertNotNull(inlinePass.cfg); // Note: cfg might be null if not processed. Test assumes it is initialized if process runs.
        assertNotNull(inlinePass.reachingDef);
        assertNotNull(inlinePass.reachingUses);
        assertNotNull(inlinePass.candidates);
    }

    // Test for process: ensures the main processing method runs without crashing.
    @Test
    public void testProcess_RunsWithoutCrashing() throws Exception {
        // Create a minimal valid JS structure.
        Node root = createBlock(Node.newVar(Node.newName("y"), Node.newNumber(1)));
        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);
        assertTrue(true); // If it completes without exception, it's a pass.
    }

    // Test for visit: ensures the visit method is called and doesn't crash.
    @Test
    public void testVisit_IsCalledAndDoesNotCrash() throws Exception {
        // A simple script.
        Node root = createBlock(Node.newVar(Node.newName("z"), Node.newNumber(2)));
        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        // The `process` method calls `traverse` which eventually calls `visit`.
        inlinePass.process(null, root);
        assertTrue(true); // If it completes without exception, it's a pass.
    }
}





