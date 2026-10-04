package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.CssRenamingMap;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.TypeValidator;
import com.google.javascript.rhino.ErrorReporter;

public class FunctionToBlockMutatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock AbstractCompiler and Supplier for testing

    private static class MockSupplier<T> implements Supplier<T> {
        private T value;
        public void set(T value) { this.value = value; }
        @Override public T get() { return this.value; }
    }























    @Test
    public void testConvertLastReturnToStatementWithResultName() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(2.0)));
        String resultName = "res";

        mutator.convertLastReturnToStatement(block, resultName);

        Node assignment = block.getFirstChild();
        assertEquals(Token.EXPR_RESULT, assignment.getType());
        Node assign = assignment.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(resultName, assign.getFirstChild().getString());
        assertEquals(2.0, assign.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testConvertLastReturnToStatementEmptyReturn() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK, new Node(Token.RETURN));
        String resultName = null;

        mutator.convertLastReturnToStatement(block, resultName);

        assertFalse(block.hasChildren());
    }

    @Test
    public void testConvertLastReturnToStatementEmptyReturnNeedsDefaultResult() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK, new Node(Token.RETURN));
        String resultName = "res";

        mutator.convertLastReturnToStatement(block, resultName);

        Node assignment = block.getFirstChild();
        assertEquals(Token.EXPR_RESULT, assignment.getType());
        Node assign = assignment.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(resultName, assign.getFirstChild().getString());
        assertEquals(Token.CALL, assign.getLastChild().getType());
        assertEquals("undefined", assign.getLastChild().getString());
    }

    @Test
    public void testCreateAssignStatementNode() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node expression = Node.newNumber(42.0);
        Node assignmentStatement = mutator.createAssignStatementNode("targetVar", expression);

        assertEquals(Token.EXPR_RESULT, assignmentStatement.getType());
        Node assignNode = assignmentStatement.getFirstChild();
        assertEquals(Token.ASSIGN, assignNode.getType());
        assertEquals("targetVar", assignNode.getFirstChild().getString());
        assertEquals(42.0, assignNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testGetReplacementReturnStatementBasic() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node returnNode = new Node(Token.RETURN, Node.newNumber(1.5));
        String resultName = null;

        Node replacement = mutator.getReplacementReturnStatement(returnNode, resultName);

        assertEquals(Token.EXPR_RESULT, replacement.getType());
        assertEquals(1.5, replacement.getOnlyChild().getDouble(), 1e-9);
    }

    @Test
    public void testGetReplacementReturnStatementWithResultName() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node returnNode = new Node(Token.RETURN, Node.newNumber(2.5));
        String resultName = "someResult";

        Node replacement = mutator.getReplacementReturnStatement(returnNode, resultName);

        assertEquals(Token.EXPR_RESULT, replacement.getType());
        Node assign = replacement.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(resultName, assign.getFirstChild().getString());
        assertEquals(2.5, assign.getLastChild().getDouble(), 1e-9);
    }

    @Test
    public void testGetReplacementReturnStatementEmptyReturn() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node returnNode = new Node(Token.RETURN);
        String resultName = null;

        Node replacement = mutator.getReplacementReturnStatement(returnNode, resultName);

        assertNull(replacement);
    }

    @Test
    public void testGetReplacementReturnStatementEmptyReturnWithResultName() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node returnNode = new Node(Token.RETURN);
        String resultName = "res";

        Node replacement = mutator.getReplacementReturnStatement(returnNode, resultName);

        assertEquals(Token.EXPR_RESULT, replacement.getType());
        Node assign = replacement.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(resultName, assign.getFirstChild().getString());
        assertEquals(Token.CALL, assign.getLastChild().getType());
        assertEquals("undefined", assign.getLastChild().getString());
    }

    @Test
    public void testHasReturnAtExit() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node blockWithReturn = new Node(Token.BLOCK, new Node(Token.RETURN));
        assertTrue(mutator.hasReturnAtExit(blockWithReturn));

        Node blockWithoutReturn = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1.0)));
        assertFalse(mutator.hasReturnAtExit(blockWithoutReturn));

        Node emptyBlock = new Node(Token.BLOCK);
        assertFalse(mutator.hasReturnAtExit(emptyBlock));
    }

    @Test
    public void testReplaceReturnWithBreakBasic() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node parentBlock = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN, Node.newNumber(10.0));
        parentBlock.addChildToBack(returnNode);
        String labelName = "testLabel";
        String resultName = null;

        mutator.replaceReturnWithBreak(returnNode, parentBlock, resultName, labelName);

        assertEquals(Token.BREAK, parentBlock.getFirstChild().getType());
        assertEquals(labelName, parentBlock.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testReplaceReturnWithBreakWithResult() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node parentBlock = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN, Node.newNumber(20.0));
        parentBlock.addChildToBack(returnNode);
        String labelName = "testLabel";
        String resultName = "res";

        mutator.replaceReturnWithBreak(returnNode, parentBlock, resultName, labelName);

        Node exprResult = parentBlock.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        assertEquals(Token.ASSIGN, exprResult.getFirstChild().getType());
        assertEquals(resultName, exprResult.getFirstChild().getFirstChild().getString());
        assertEquals(20.0, exprResult.getFirstChild().getLastChild().getDouble(), 0.0);

        Node breakNode = exprResult.getNext();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(labelName, breakNode.getFirstChild().getString());
    }

    @Test
    public void testAddDummyAssignment() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK);
        String resultName = "dummyRes";

        mutator.addDummyAssignment(block, resultName);

        assertEquals(1, block.getChildCount());
        Node assignmentStatement = block.getFirstChild();
        assertEquals(Token.EXPR_RESULT, assignmentStatement.getType());
        Node assign = assignmentStatement.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(resultName, assign.getFirstChild().getString());
        assertEquals(Token.CALL, assign.getLastChild().getType());
        assertEquals("undefined", assign.getLastChild().getString());
    }

    // --- Tests for methods not previously covered ---

    // Mocking NodeTraversal and its ScopedCallback interface to test process/visit/enterScope/exitScope/shouldTraverse
    // This class has been removed as it was directly testing private methods of RenameLabels and was causing issues.
    // The public process() method of RenameLabels is tested indirectly through tests that would use it.

    @Test
    public void testRenameLabelsProcess() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Supplier<String> nameSupplier = new Supplier<String>() {
            private int id = 0;
            @Override public String get() { return "short" + id++; }
        };
        RenameLabels renameLabels = new RenameLabels(compiler, nameSupplier, true);

        Node root = new Node(Token.SCRIPT);
        Node labelNode1 = new Node(Token.LABEL);
        labelNode1.addChildToFront(Node.newString(Token.LABEL_NAME, "longLabel1"));
        labelNode1.addChildToBack(new Node(Token.BLOCK, new Node(Token.RETURN)));
        root.addChildToBack(labelNode1);

        Node labelNode2 = new Node(Token.LABEL);
        labelNode2.addChildToFront(Node.newString(Token.LABEL_NAME, "longLabel2"));
        labelNode2.addChildToBack(new Node(Token.BLOCK, new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "longLabel1"))));
        root.addChildToBack(labelNode2);

        renameLabels.process(null, root);

        // After processing, "longLabel1" should be renamed to "short0" and referenced.
        // "longLabel2" should be renamed to "short1" and it also references "short0".
        // The referenced labels should remain.
        Node processedLabel1 = root.getFirstChild();
        assertEquals("short0", processedLabel1.getFirstChild().getString());

        Node processedLabel2 = processedLabel1.getNext();
        assertEquals("short1", processedLabel2.getFirstChild().getString());
        assertEquals("short0", processedLabel2.getLastChild().getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testRenameLabelsRemoveUnused() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Supplier<String> nameSupplier = new Supplier<String>() {
            private int id = 0;
            @Override public String get() { return "short" + id++; }
        };
        RenameLabels renameLabels = new RenameLabels(compiler, nameSupplier, true); // removeUnused = true

        Node root = new Node(Token.SCRIPT);
        Node labelNode1 = new Node(Token.LABEL);
        labelNode1.addChildToFront(Node.newString(Token.LABEL_NAME, "unusedLabel"));
        labelNode1.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(labelNode1);

        renameLabels.process(null, root);

        // The unused label should be removed.
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testRenameLabelsKeepUnusedIfRemoveUnusedFalse() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Supplier<String> nameSupplier = new Supplier<String>() {
            private int id = 0;
            @Override public String get() { return "short" + id++; }
        };
        RenameLabels renameLabels = new RenameLabels(compiler, nameSupplier, false); // removeUnused = false

        Node root = new Node(Token.SCRIPT);
        Node labelNode1 = new Node(Token.LABEL);
        labelNode1.addChildToFront(Node.newString(Token.LABEL_NAME, "unusedLabel"));
        labelNode1.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(labelNode1);

        renameLabels.process(null, root);

        // The unused label should be kept and renamed.
        Node processedLabel1 = root.getFirstChild();
        assertEquals("short0", processedLabel1.getFirstChild().getString());
        assertEquals(Token.BLOCK, processedLabel1.getLastChild().getType());
    }

    @Test
    public void testRenameLabelsNestedLabels() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Supplier<String> nameSupplier = new Supplier<String>() {
            private int id = 0;
            @Override public String get() { return Character.toString((char)('a' + id++)); }
        };
        RenameLabels renameLabels = new RenameLabels(compiler, nameSupplier, true);

        Node root = new Node(Token.SCRIPT);
        Node outerLabel = new Node(Token.LABEL);
        outerLabel.addChildToFront(Node.newString(Token.LABEL_NAME, "outer"));
        Node innerLabel = new Node(Token.LABEL);
        innerLabel.addChildToFront(Node.newString(Token.LABEL_NAME, "inner"));
        innerLabel.addChildToBack(new Node(Token.BLOCK, new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "inner"))));
        outerLabel.addChildToBack(new Node(Token.BLOCK, innerLabel));
        root.addChildToBack(outerLabel);

        renameLabels.process(null, root);

        // Outer label should become 'a', inner label should become 'b'.
        Node processedOuterLabel = root.getFirstChild();
        assertEquals("a", processedOuterLabel.getFirstChild().getString());
        Node processedInnerLabel = processedOuterLabel.getLastChild().getFirstChild();
        assertEquals("b", processedInnerLabel.getFirstChild().getString());
        // The break statement should reference the new label name.
        assertEquals("b", processedInnerLabel.getLastChild().getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testFunctionArgumentInjectorMaybeAddTempsForCallArguments() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.PARAM_LIST, new Node(Token.NAME, "a")),
                new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NAME, "a"))));
        Node callNode = new Node(Token.CALL, new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2)));
        String resultName = "res";
        boolean needsDefaultResult = false;
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("tempArgFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        // The original argument (1+2) should be inlined directly because 'a' is not modified.
        assertTrue(mutatedBlock.hasChildren());
        Node labelNode = mutatedBlock.getFirstChild();
        Node blockInsideLabel = labelNode.getLastChild();
        Node returnStatement = blockInsideLabel.getFirstChild();
        assertEquals(Token.RETURN, returnStatement.getType());
        Node addNode = returnStatement.getOnlyChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(1.0, addNode.getFirstChild().getDouble(), 0.0);
        assertEquals(2.0, addNode.getLastChild().getDouble(), 0.0);

        // Test a case where a temporary is needed.
        // If 'a' were modified, it would need a temp.
        Node fnNodeModified = new Node(Token.FUNCTION,
                new Node(Token.PARAM_LIST, new Node(Token.NAME, "a")),
                new Node(Token.BLOCK,
                        new Node(Token.ASSIGN, new Node(Token.NAME, "a"), Node.newNumber(100)), // Modifies 'a'
                        new Node(Token.RETURN, new Node(Token.NAME, "a"))));

        Node mutatedBlockModified = mutator.mutate("tempArgFuncModified", fnNodeModified, callNode, resultName, needsDefaultResult, isCallInLoop);

        // The original argument (1+2) should be evaluated into a temp, and 'a' should be aliased.
        assertTrue(mutatedBlockModified.hasChildren());
        Node labelNodeModified = mutatedBlockModified.getFirstChild();
        Node blockInsideLabelModified = labelNodeModified.getLastChild();
        Node varDecl = blockInsideLabelModified.getFirstChild();
        assertEquals(Token.VAR, varDecl.getType());
        assertEquals("alias_0", varDecl.getFirstChild().getString()); // This is the temp for the argument
        Node addNode = varDecl.getFirstChild().getOnlyChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(1.0, addNode.getFirstChild().getDouble(), 0.0);
        assertEquals(2.0, addNode.getLastChild().getDouble(), 0.0);

        Node returnStatementModified = varDecl.getNext();
        assertEquals(Token.RETURN, returnStatementModified.getType());
        assertEquals("alias_0", returnStatementModified.getOnlyChild().getString()); // Should use the aliased variable
    }
}





