package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.TokenStream;
import com.google.protobuf.CodedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.ParallelCompilerPass.Result;
import com.google.javascript.rhino.Token;
import java.util.Set;
import java.util.Collection;

public class AbstractCommandLineRunnerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper to create a minimal compiler instance for testing RemoveConstantExpressions
    private static class MockCompiler extends AbstractCompiler {
        @Override
        public void process(CompilerPass pass) {
            // For testing, we directly invoke the pass's process method.
            // This mock doesn't need to simulate the full compiler pipeline.
        }

        @Override
        public Node parse(CompilerOptions options) {
            return null; // Not used by RemoveConstantExpressions
        }

        @Override
        public Result compile(SourceFile externs[], SourceFile inputs[], CompilerOptions options) {
            return null; // Not used by RemoveConstantExpressions
        }

        @Override
        public Result compile(SourceFile externs[], JSModule modules[], CompilerOptions options) {
            return null; // Not used by RemoveConstantExpressions
        }

        @Override
        public Node getRoot() {
            return null; // Not used by RemoveConstantExpressions
        }

        @Override
        public SourceMap getSourceMap() {
            return null; // Not used by RemoveConstantExpressions
        }

        @Override
        public void reportCodeChange() {
            // Called by AstChangeProxy.registerListener. A no-op is fine for this mock.
        }

        @Override
        public void setExterns(SourceFile[] externs) {
            // Not used by RemoveConstantExpressions
        }

        @Override
        public void setPassConfig(PassConfig passConfig) {
            // Not used by RemoveConstantExpressions
        }

        @Override
        public PassConfig getPassConfig() {
            return null; // Not used by RemoveConstantExpressions
        }

        @Override
        public void setCodingConvention(CodingConvention convention) {
            // Not used by RemoveConstantExpressions
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new DefaultCodingConvention(); // Default if needed
        }

        @Override
        public String toSource() {
            return ""; // Not used by RemoveConstantExpressions
        }

        @Override
        public String toSource(JSModule module) {
            return ""; // Not used by RemoveConstantExpressions
        }

        @Override
        public void init(SourceFile externs[], SourceFile inputs[], CompilerOptions options) {
            // Not used by RemoveConstantExpressions
        }

        @Override
        public void init(SourceFile externs[], JSModule[] modules, CompilerOptions options) {
            // Not used by RemoveConstantExpressions
        }

        @Override
        public void setOptimizations(CompilerOptions.OptimizationLevel level) {
            // Not used by RemoveConstantExpressions
        }

        @Override
        public void setDiagnosticGroups(DiagnosticGroups diagnosticGroups) {
            // Not used by RemoveConstantExpressions
        }

        @Override
        public void prepareAst(Node root) {
            // Not used by RemoveConstantExpressions
        }

        // Implement abstract methods from AbstractCompiler
        @Override
        protected void finalizeTraversal() { /* no-op */ }

        @Override
        protected int getErrorCount() { return 0; }

        @Override
        protected int getWarningCount() { return 0; }

        @Override
        public void logChanged(String message) { /* no-op */ }

        @Override
        public boolean shouldRunPass(String name) { return true; }

        @Override
        public boolean areNodesEqualForInlining(Node node1, Node node2) { return false; }

        @Override
        public void setLoggingLevel(Level level) { /* no-op */ }
        
        // Added missing abstract method from AbstractCompiler, which was causing the compilation error
        @Override
        public void setUnnormalized(boolean unnormalized) {
            // No-op for mock
        }
    }

    @Test
    public void testProcess_simpleExpression() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node exprResult = new Node(Token.EXPR_RESULT, Node.newNumber(1));
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertTrue(root.getChildCount() == 0);
    }

    @Test
    public void testProcess_expressionWithSideEffect() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node callNode = new Node(Token.CALL, Node.newString("foo"));
        Node exprResult = new Node(Token.EXPR_RESULT, callNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_expressionWithSideEffectAndConstant() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "1 + foo()" where foo is a function call
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node addNode = new Node(Token.ADD, Node.newNumber(1), callFoo);
        Node exprResult = new Node(Token.EXPR_RESULT, addNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_multipleExpressions() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node exprResult1 = new Node(Token.EXPR_RESULT, Node.newNumber(1));
        Node exprResult2 = new Node(Token.EXPR_RESULT, Node.newString("bar")); // Simulate a function call
        Node exprResult3 = new Node(Token.EXPR_RESULT, Node.newNumber(2));
        root.addChildToBack(exprResult1);
        root.addChildToBack(exprResult2);
        root.addChildToBack(exprResult3);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("bar", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_expressionWithNew() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        Node exprResult = new Node(Token.EXPR_RESULT, newNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.NEW, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_nestedExpressionsWithSideEffects() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "1 + foo() + bar()"
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node callBar = new Node(Token.CALL, Node.newString("bar"));
        Node add1 = new Node(Token.ADD, Node.newNumber(1), callFoo);
        Node add2 = new Node(Token.ADD, add1, callBar);
        Node exprResult = new Node(Token.EXPR_RESULT, add2);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(2, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());

        Node secondChild = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, secondChild.getType());
        assertEquals(Token.CALL, secondChild.getFirstChild().getType());
        assertEquals("bar", secondChild.getFirstChild().getString());
    }

    @Test
    public void testProcess_nestedExpressionsConstantAtEnd() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "foo() + 1"
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node addNode = new Node(Token.ADD, callFoo, Node.newNumber(1));
        Node exprResult = new Node(Token.EXPR_RESULT, addNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_expressionStatementWithOnlyConstant() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node numberNode = Node.newNumber(10);
        Node exprResult = new Node(Token.EXPR_RESULT, numberNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertTrue(root.getChildCount() == 0);
    }

    @Test
    public void testProcess_complexExpressionWithSideEffectsAndConstants() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "1 + foo() + 2 + bar() + 3"
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node callBar = new Node(Token.CALL, Node.newString("bar"));

        Node add1 = new Node(Token.ADD, Node.newNumber(1), callFoo);
        Node add2 = new Node(Token.ADD, add1, Node.newNumber(2));
        Node add3 = new Node(Token.ADD, add2, callBar);
        Node add4 = new Node(Token.ADD, add3, Node.newNumber(3));

        Node exprResult = new Node(Token.EXPR_RESULT, add4);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(2, root.getChildCount());

        Node firstExpr = root.getFirstChild();
        assertEquals(Token.EXPR_RESULT, firstExpr.getType());
        assertEquals(Token.CALL, firstExpr.getFirstChild().getType());
        assertEquals("foo", firstExpr.getFirstChild().getString());

        Node secondExpr = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, secondExpr.getType());
        assertEquals(Token.CALL, secondExpr.getFirstChild().getType());
        assertEquals("bar", secondExpr.getFirstChild().getString());
    }

    @Test
    public void testProcess_noExpressionStatements() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, Node.newString("x")), Node.newNumber(1));
        root.addChildToBack(varNode);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.VAR, root.getFirstChild().getType());
    }

    @Test
    public void testProcess_functionCallAsExpressionStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node callNode = new Node(Token.CALL, Node.newString("myFunc"));
        Node exprResult = new Node(Token.EXPR_RESULT, callNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_newExpressionAsExpressionStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node newNode = new Node(Token.NEW, Node.newString("MyClass"));
        Node exprResult = new Node(Token.EXPR_RESULT, newNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.NEW, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_assignmentAsExpressionStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node assignNode = new Node(Token.ASSIGN, Node.newString("x"), Node.newNumber(1));
        Node exprResult = new Node(Token.EXPR_RESULT, assignNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.ASSIGN, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_deleteExpressionAsExpressionStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node deleteNode = new Node(Token.DELPROP, Node.newString("x"));
        Node exprResult = new Node(Token.EXPR_RESULT, deleteNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.DELPROP, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_voidExpressionAsExpressionStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "void 1"
        Node voidNode = new Node(Token.VOID, Node.newNumber(1));
        Node exprResult = new Node(Token.EXPR_RESULT, voidNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        // 'void' applied to a constant expression results in the expression being removed.
        assertTrue(root.getChildCount() == 0);
    }

    @Test
    public void testProcess_throwExpressionAsExpressionStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "throw new Error()"
        Node errorConstructor = new Node(Token.NEW, Node.newString("Error"));
        Node throwNode = new Node(Token.THROW, errorConstructor);
        Node exprResult = new Node(Token.EXPR_RESULT, throwNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.THROW, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_callWithConstantArguments() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "myFunc(1, 'a')"
        Node arg1 = Node.newNumber(1);
        Node arg2 = Node.newString("a");
        Node callNode = new Node(Token.CALL, Node.newString("myFunc"), arg1, arg2);
        Node exprResult = new Node(Token.EXPR_RESULT, callNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        // The CALL node itself has side effects and should remain.
        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("myFunc", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_addConstantToCall() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "1 + foo()"
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node addNode = new Node(Token.ADD, Node.newNumber(1), callFoo);
        Node exprResult = new Node(Token.EXPR_RESULT, addNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_constantAddToCall() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "foo() + 1"
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node addNode = new Node(Token.ADD, callFoo, Node.newNumber(1));
        Node exprResult = new Node(Token.EXPR_RESULT, addNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_expressionWithMultipleConstantsAndCall() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "1 + 2 + foo() + 3"
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node add1 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node add2 = new Node(Token.ADD, add1, callFoo);
        Node add3 = new Node(Token.ADD, add2, Node.newNumber(3));
        Node exprResult = new Node(Token.EXPR_RESULT, add3);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_preIncrementAsExpressionStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node incNode = new Node(Token.INC, Node.newString("x"));
        Node exprResult = new Node(Token.EXPR_RESULT, incNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.INC, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_postIncrementAsExpressionStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node incNode = new Node(Token.INC, Node.newString("x"));
        incNode.putBooleanProp(Node.POST_FLAG, true); // Mark as post-increment
        Node exprResult = new Node(Token.EXPR_RESULT, incNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.INC, root.getFirstChild().getFirstChild().getType());
        assertTrue(root.getFirstChild().getFirstChild().getBooleanProp(Node.POST_FLAG));
    }

    @Test
    public void testProcess_emptyStatement() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node emptyNode = new Node(Token.EMPTY);
        Node exprResult = new Node(Token.EXPR_RESULT, emptyNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.EMPTY, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_logicalAndWithSideEffect() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "foo() && 1"
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node andNode = new Node(Token.AND, callFoo, Node.newNumber(1));
        Node exprResult = new Node(Token.EXPR_RESULT, andNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_logicalOrWithSideEffect() throws Exception {
        Node root = new Node(Token.BLOCK);
        // Simulate "foo() || 1"
        Node callFoo = new Node(Token.CALL, Node.newString("foo"));
        Node orNode = new Node(Token.OR, callFoo, Node.newNumber(1));
        Node exprResult = new Node(Token.EXPR_RESULT, orNode);
        root.addChildToBack(exprResult);

        Compiler compiler = new MockCompiler();
        RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
        pass.process(null, root);

        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
    }
}
