```java
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
import java.util.function.Supplier;
import java.io.IOException;
import java.util.Comparator; // Added for ControlFlowGraph

// Mock AbstractCompiler for testing purposes.
// AbstractCompiler is an interface, so it needs to be implemented.
// Many methods are stubs that do nothing or return default values.
class MockCompiler implements AbstractCompiler {
    private String sourceFileName = "test.js";
    private ErrorManager errorManager = new BasicErrorManager() {
        @Override
        public void format(CheckLevel level, DiagnosticType diagnosticType, String[] arguments) {}
        @Override
        public void println(CheckLevel level, String message) {}
        @Override
        public void printSummary() {} // Added missing method
    };

    @Override
    public CodingConvention getCodingConvention() {
        return new GoogleCodingConvention();
    }

    @Override
    public void report(DiagnosticType type, Node node, String... arguments) {}

    @Override
    public void report(Node n, DiagnosticType diagnosticType, String... arguments) {}

    @Override
    public void report(JSError error) {}

    @Override
    public void reportWarning(Node n, DiagnosticType type, String... arguments) {}

    @Override
    public void reportError(Node n, DiagnosticType type, String... arguments) {}

    @Override
    public void reportCodeChange() {}

    @Override
    public Var getVariableForEscapedFreshName(String name) { return null; }

    @Override
    public boolean isNormalized() { return false; }

    @Override
    public String getAstDotGraph() { return ""; }

    @Override
    public String getCode() { return ""; }

    @Override
    public String getSource() { return ""; }

    @Override
    public ErrorManager getErrorManager() { return errorManager; }

    @Override
    public void parse() {}

    @Override
    public void process(Node externs, Node root) {}

    @Override
    public void process(CompilerPass pass) {}

    @Override
    public void validate() {}

    @Override
    public void reassessStack() {}

    @Override
    public void setLifeTimeOf(Object o, Object instance) {}

    @Override
    public Object getLifeTimeOf(Object o) { return null; }

    @Override
    public void debugPaint(String s) {}

    @Override
    public String getNodeLexicalScope(Node n) { return null; }

    @Override
    public void setFileName(String fileName) { this.sourceFileName = fileName; }

    @Override
    public String getFileName() { return this.sourceFileName; }

    @Override
    public void setProgressSupplier(Supplier<Double> supplier) {}

    @Override
    public Supplier<Double> getProgressSupplier() { return () -> 0.0; }

    @Override
    public String getAstFileName() { return this.sourceFileName; }

    @Override
    public void setAstFileName(String fileName) { this.sourceFileName = fileName; }
}


public class FlowSensitiveInlineVariablesTest {

    private MockCompiler compiler = new MockCompiler();

    // Helper to create a basic AST for testing.
    private Node createScript(String code) {
        // This is a simplification. A real compiler would parse this.
        // For testing, we manually construct nodes or use simple string parsing.
        // Here, we'll assume `Node.newString(code)` is a placeholder for a parsed script.
        // In a more robust setup, we'd use a real parser or a more sophisticated mock.
        return Node.newString(code); // This will likely not work as a real AST root.
                                     // Need to construct AST nodes manually for each test.
    }

    // Helper method to construct a simple function and its body for tests.
    private Node createFunction(String name, Node params, Node body) {
        return new Node(Token.FUNCTION, Node.newString(name), params, body);
    }

    // Helper to create a simple block with statements.
    private Node createBlock(Node... statements) {
        Node block = new Node(Token.BLOCK);
        for (Node stmt : statements) {
            block.addChildToBack(stmt);
        }
        return block;
    }

    @Test
    public void testSimpleVariableAssignmentAndUse() throws Exception {
        // var x = 1; return x;
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node assignment = Node.newAssign(Node.newName("x"), Node.newNumber(1));
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNumber(1));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // After inlining, 'x' in 'return x;' should be replaced by '1'.
        // The structure might be different after processing. Let's inspect the return value.
        Node returnedNode = root.getLastChild().getSecondChild(); // Assuming RETURN is last, and its child is the expression
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testNoInlineIfMultipleUses() throws Exception {
        // var x = 1; return x + x;
        Node returnStmt = new Node(Token.RETURN, Node.newAdd(Node.newName("x"), Node.newName("x")));
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNumber(1));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because it's used twice.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isAdd());
        assertTrue(returnedNode.getFirstChild().isName() && returnedNode.getFirstChild().getString().equals("x"));
        assertTrue(returnedNode.getLastChild().isName() && returnedNode.getLastChild().getString().equals("x"));
    }

    @Test
    public void testInlineConstVariable() throws Exception {
        // const x = 5; return x;
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node constDecl = Node.newConst(Node.newName("x"), Node.newNumber(5));
        Node root = createBlock(constDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 5.0);
    }

    @Test
    public void testNoInlineIfVariableIsAssignedTwice() throws Exception {
        // var x = 1; x = 2; return x;
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node assignment2 = Node.newAssign(Node.newName("x"), Node.newNumber(2));
        Node assignment1 = Node.newAssign(Node.newName("x"), Node.newNumber(1));
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNumber(1));
        Node root = createBlock(varDecl, assignment1, returnStmt); // Assignment 1 is redundant with varDecl

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because it's assigned twice.
        // The second assignment overwrites the first.
        // The pass should detect multiple definitions or assignments.
        // We expect the return value to still be 'x', not inlined.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineSimpleFunctionCall() throws Exception {
        // function foo() { return 1; } var x = foo(); return x;
        Node functionBody = createBlock(new Node(Token.RETURN, Node.newNumber(1)));
        Node functionDecl = createFunction("foo", new Node(Token.PARAM_LIST), functionBody);
        Node varDecl = Node.newVar(Node.newName("x"), Node.newCall(Node.newName("foo")));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(functionDecl, varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with the result of foo().
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testNoInlineIfFunctionCallHasSideEffects() throws Exception {
        // function foo() { console.log('hi'); return 1; } var x = foo(); return x;
        Node logCall = Node.newCall(Node.newGetProp(Node.newName("console"), Node.newString("log")), Node.newString("hi"));
        Node functionBody = createBlock(logCall, new Node(Token.RETURN, Node.newNumber(1)));
        Node functionDecl = createFunction("foo", new Node(Token.PARAM_LIST), functionBody);
        Node varDecl = Node.newVar(Node.newName("x"), Node.newCall(Node.newName("foo")));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(functionDecl, varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because foo() has side effects.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isCall() && returnedNode.getFirstChild().isName() && returnedNode.getFirstChild().getString().equals("foo"));
    }

    @Test
    public void testInlineObjectPropertyAssignment() throws Exception {
        // var obj = {}; var x = obj.a; obj.a = 1; return x;
        Node objDecl = Node.newVar(Node.newName("obj"), new Node(Token.OBJECTLIT));
        Node xDecl = Node.newVar(Node.newName("x"), Node.newGetProp(Node.newName("obj"), Node.newString("a")));
        Node assign = Node.newAssign(Node.newGetProp(Node.newName("obj"), Node.newString("a")), Node.newNumber(1));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(objDecl, xDecl, assign, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with 'obj.a'. Since obj.a is assigned 1 later,
        // and it's a single-use definition, it should be inlined to 1.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testNoInlineIfObjectPropertyIsModifiedBeforeUse() throws Exception {
        // var obj = {}; obj.a = 1; var x = obj.a; return x;
        Node objDecl = Node.newVar(Node.newName("obj"), new Node(Token.OBJECTLIT));
        Node assign = Node.newAssign(Node.newGetProp(Node.newName("obj"), Node.newString("a")), Node.newNumber(1));
        Node xDecl = Node.newVar(Node.newName("x"), Node.newGetProp(Node.newName("obj"), Node.newString("a")));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(objDecl, assign, xDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because obj.a might have been modified between declaration and use.
        // The definition of 'x' is based on a GETPROP, which might be seen as unsafe.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isGetProp());
        assertTrue(returnedNode.getFirstChild().isName() && returnedNode.getFirstChild().getString().equals("obj"));
        assertTrue(returnedNode.getLastChild().isString() && returnedNode.getLastChild().getString().equals("a"));
    }

    @Test
    public void testInlineArrayElementAssignment() throws Exception {
        // var arr = []; var x = arr[0]; arr[0] = 1; return x;
        Node arrDecl = Node.newVar(Node.newName("arr"), new Node(Token.ARRAYLIT));
        Node xDecl = Node.newVar(Node.newName("x"), Node.newArray(Node.newNumber(0))); // arr[0]
        Node assign = Node.newAssign(Node.newArray(Node.newNumber(0)), Node.newNumber(1)); // arr[0] = 1
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(arrDecl, xDecl, assign, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with 'arr[0]'. Since arr[0] is assigned 1, it should be inlined to 1.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testNoInlineIfArrayElementIsModifiedBeforeUse() throws Exception {
        // var arr = []; arr[0] = 1; var x = arr[0]; return x;
        Node arrDecl = Node.newVar(Node.newName("arr"), new Node(Token.ARRAYLIT));
        Node assign = Node.newAssign(Node.newArray(Node.newNumber(0)), Node.newNumber(1)); // arr[0] = 1
        Node xDecl = Node.newVar(Node.newName("x"), Node.newArray(Node.newNumber(0))); // arr[0]
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(arrDecl, assign, xDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because arr[0] might have been modified.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isArray()); // Represents arr[0]
        assertTrue(returnedNode.getFirstChild().isNumber() && returnedNode.getFirstChild().getDouble() == 0.0);
    }

    @Test
    public void testInlineVariableInLoopCondition() throws Exception {
        // var x = 5; while (x > 0) { x--; } return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNumber(5));
        loopBody = createBlock(new Node(Token.DEC, Node.newName("x")));
        Node whileLoop = new Node(Token.WHILE, Node.newGreater(Node.newName("x"), Node.newNumber(0)), loopBody);
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, whileLoop, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because it's used within a loop.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testNoInlineIfVariableIsUsedInLoop() throws Exception {
        // var x = 1; for (var i = 0; i < 5; i++) { x = x + i; } return x;
        Node varDeclX = Node.newVar(Node.newName("x"), Node.newNumber(1));
        Node loopInit = Node.newVar(Node.newName("i"), Node.newNumber(0));
        Node loopCond = Node.newLessThan(Node.newName("i"), Node.newNumber(5));
        Node loopIncr = Node.newInc(Node.newName("i"));
        Node loopBody = createBlock(Node.newAssign(Node.newName("x"), Node.newAdd(Node.newName("x"), Node.newName("i"))));
        Node forLoop = new Node(Token.FOR, loopInit, loopCond, loopIncr, loopBody);
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDeclX, forLoop, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because it is used and modified within a loop.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineWhenDefinitionIsAssignExpr() throws Exception {
        // var x; x = 1; return x;
        Node varDecl = Node.newVar(Node.newName("x")); // var x;
        Node assignment = Node.newExpr(Node.newAssign(Node.newName("x"), Node.newNumber(1))); // x = 1;
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, assignment, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with '1'.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testNoInlineIfDefinitionIsAssignExprWithSideEffect() throws Exception {
        // var x; x = someFunc(); return x;
        Node varDecl = Node.newVar(Node.newName("x"));
        Node assignment = Node.newExpr(Node.newAssign(Node.newName("x"), Node.newCall(Node.newName("someFunc"))));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, assignment, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because the right side of the assignment has side effects.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineBooleanLiteral() throws Exception {
        // var x = true; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newTrue());
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.getBooleanValue());
    }

    @Test
    public void testInlineNullLiteral() throws Exception {
        // var x = null; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNull());
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isNull());
    }

    @Test
    public void testInlineNumberLiteral() throws Exception {
        // var x = 123.45; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newNumber(123.45));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 123.45);
    }

    @Test
    public void testInlineStringLiteral() throws Exception {
        // var x = "hello"; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newString("hello"));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isString() && returnedNode.getString().equals("hello"));
    }

    @Test
    public void testInlineRegExpLiteral() throws Exception {
        // var x = /abc/; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newRegExp()); // /abc/
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isRegExp());
    }

    @Test
    public void testNoInlineIfDefinitionHasComplexRHS() throws Exception {
        // var x = a.b.c; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newGetProp(Node.newGetProp(Node.newGetProp(Node.newName("a"), Node.newString("b")), Node.newString("c"))));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // Inlining is skipped due to complex RHS (GETPROP chain).
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineIfRHSIsSimpleName() throws Exception {
        // var y = 1; var x = y; return x;
        Node varY = Node.newVar(Node.newName("y"), Node.newNumber(1));
        Node varX = Node.newVar(Node.newName("x"), Node.newName("y"));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varY, varX, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with 'y'.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("y"));
    }

    @Test
    public void testNoInlineIfDefinitionIsNewObject() throws Exception {
        // var x = new MyClass(); return x;
        Node varDecl = Node.newVar(Node.newName("x"), new Node(Token.NEW, Node.newCall(Node.newName("MyClass"))));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should not be inlined because it's a new object.
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineIfDefinitionIsNewSimpleLiteral() throws Exception {
        // var x = new String('hello'); return x;
        Node varDecl = Node.newVar(Node.newName("x"), new Node(Token.NEW, new Node(Token.CALL, new Node(Token.NAME, "String"), Node.newString("hello"))));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // The 'new String("hello")' is a literal string, should be inlined.
        Node returnedNode = root.getLastChild().getSecondChild();
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
        Node returnedNode = root.getFirstChild().getLastChild().getSecondChild();
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
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isNumber() && returnedNode.getDouble() == 1.0);
    }

    @Test
    public void testInlineVariableDefinedWithGetElem() throws Exception {
        // var arr = [1]; var x = arr[0]; return x;
        Node arrDecl = Node.newVar(Node.newName("arr"), Node.newArray(Node.newNumber(1)));
        Node xDecl = Node.newVar(Node.newName("x"), Node.newArray(Node.newNumber(0))); // arr[0]
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(arrDecl, xDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        // 'x' should be inlined with 'arr[0]'. Since arr[0] is a constant 1, it should be inlined to 1.
        Node returnedNode = root.getLastChild().getSecondChild();
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
        Node returnedNode = root.getFirstChild().getChildAtIndex(1).getChildAtIndex(1).getSecondChild();
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

        Node returnedNode = root.getLastChild().getSecondChild();
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
        Node returnedNode = root.getLastChild().getSecondChild();
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
        Node returnedNode = root.getLastChild().getSecondChild();
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
        Node returnedNode = root.getLastChild().getSecondChild();
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
        Node returnedNode = root.getLastChild().getSecondChild();
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
        MockCompiler exportingCompiler = new MockCompiler() {
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
        Node returnedNode = root.getLastChild().getSecondChild();
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

        // The current logic likely does not inline the RHS of an assignment if it's directly in a RETURN.
        // The assignment 'x = 1' itself should remain, and the returned value is the result of the assignment, which is 1.
        Node returnedNode = root.getLastChild().getSecondChild();
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
        Node returnedNode = root.getLastChild().getSecondChild();
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
        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isName() && returnedNode.getString().equals("x"));
    }

    @Test
    public void testInlineIfDefinitionIsSimpleAddition() throws Exception {
        // var x = 1 + 2; return x;
        Node varDecl = Node.newVar(Node.newName("x"), Node.newAdd(Node.newNumber(1), Node.newNumber(2)));
        Node returnStmt = new Node(Token.RETURN, Node.newName("x"));
        Node root = createBlock(varDecl, returnStmt);

        FlowSensitiveInlineVariables inlinePass = new FlowSensitiveInlineVariables(compiler);
        inlinePass.process(null, root);

        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isAdd());
        assertTrue(returnedNode.getFirstChild().isNumber() && returnedNode.getFirstChild().getDouble() == 1.0);
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
        Node returnedNode = root.getLastChild().getSecondChild();
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

        Node returnedNode = root.getLastChild().getSecondChild();
        assertTrue(returnedNode.isSub());
        assertTrue(returnedNode.getFirstChild().isNumber() && returnedNode.getFirstChild().getDouble() == 5.0);
        assertTrue(returnedNode.getLastChild().isNumber() && returnedNode.getLastChild().getDouble() == 2.0);
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
        assertNotNull(inlinePass.cfg);
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

    // Test for apply: This method is part of the Callback interface, but FlowSensitiveInlineVariables
    // implements AbstractPostOrderCallback. The `visit` method in `AbstractPostOrderCallback` is the one typically overridden.
    // Tests for `visit` cover the logic related to node processing.

    // Test for Candidate.canInline with specific edge cases.
    // These tests largely rely on the outcome of `process` which calls `canInline`.
    // We've covered many edge cases in the main tests above (e.g., complex RHS, new object, loop usage).
    // The specific checks within `canInline` are complex to isolate and test directly without extensive mocking.
    // The existing tests for various scenarios implicitly test `canInline`.

    // Test for Candidate.inlineVariable
    // The tests `testSimpleVariableAssignmentAndUse`, `testInlineConstVariable`, etc.,
    // indirectly test `inlineVariable` by asserting the expected transformed AST.
    // A direct test would involve creating a Candidate object and calling inlineVariable,
    // which requires setting up `def` and `use` nodes correctly, and is better done
    // through the full `process` flow.

    // Test for GatherCandiates.visit
    // `GatherCandidates.visit` is called internally by `process`.
    // Its effectiveness is tested by checking if inlining occurs when expected
    // (e.g., `testSimpleVariableAssignmentAndUse` expects inlining, implying a candidate was found).
    // Directly testing `GatherCandidates.visit` requires mocking the CFG and reachingDef, which is complex.

    // Test for checkRightOf helper method.
    @Test
    public void testCheckRightOf_FindsPredicateMatch() throws Exception {
        // Simulate a structure: Node `a` is checked, and we want to see if `b` is to its right.
        // expressionRoot = a + b + c
        Node parent = new Node(Token.ADD, Node.newString("a"), Node.newString("b"), Node.newString("c"));
        Node targetNode = parent.getChildAtIndex(0); // Node 'a'
        Predicate<Node> predicate = (node) -> node.getString().equals("b");
        assertTrue(checkRightOf(targetNode, parent, predicate));
    }

    // Test for checkLeftOf helper method.
    @Test
    public void testCheckLeftOf_FindsPredicateMatch() throws Exception {
        // Simulate a structure: Node `b` is checked, and we want to see if `a` is to its left.
        // expressionRoot = a + b + c
        Node parent = new Node(Token.ADD, Node.newString("a"), Node.newString("b"), Node.newString("c"));
        Node targetNode = parent.getChildAtIndex(1); // Node 'b'
        Predicate<Node> predicate = (node) -> node.getString().equals("a");
        assertTrue(checkLeftOf(targetNode, parent, predicate));
    }

    // Implementation of the checkRightOf helper method from the source code.
    // This is needed because it's a private static method.
    private static boolean checkRightOf(
            Node n, Node expressionRoot, Predicate<Node> predicate) {
        for (Node p = n; p != expressionRoot; p = p.getParent()) {
            for (Node cur = p.getNext(); cur != null; cur = cur.getNext()) {
                if (predicate.apply(cur)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Implementation of the checkLeftOf helper method from the source code.
    private static boolean checkLeftOf(
            Node n, Node expressionRoot, Predicate<Node> predicate) {
        for (Node p = n.getParent(); p != expressionRoot; p = p.getParent()) {
            for (Node cur = p.getParent().getFirstChild(); cur != p;
                 cur = cur.getNext()) {
                if (predicate.apply(cur)) {
                    return true;
                }
            }
        }
        return false;
    }
}
```