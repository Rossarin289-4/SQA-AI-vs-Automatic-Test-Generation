```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.function.Supplier;
import org.junit.Ignore;

public class CheckSideEffectsTest {

    // Dummy AbstractCompiler for testing purposes.
    // Most methods are stubbed or return dummy values as they are not critical
    // for testing CheckSideEffects' logic in this context.
    private static class CompilerStub extends AbstractCompiler {
        private final List<JSError> errors = Lists.newArrayList();
        private final StringBuilder codeChangeLog = new StringBuilder();
        private final JSModuleGraph moduleGraph = new JSModuleGraph(Lists.newArrayList());
        private final CodingConvention codingConvention = new DefaultCodingConvention();
        private Node root;
        private CompilerInput synthesizedExternsInput;
        private List<Node> problemNodes = Lists.newArrayList(); // Added to access problemNodes

        CompilerStub(Node root) {
            this.root = root;
            this.synthesizedExternsInput = new CompilerInput(new SourceFile.Builder().setName("externs").build());
        }

        @Override
        public void report(JSError error) {
            errors.add(error);
        }

        @Override
        public void reportCodeChange() {
            codeChangeLog.append("code change ");
        }

        @Override
        public List<CompilerInput> getInputsInOrder() {
            return Lists.newArrayList(synthesizedExternsInput);
        }

        @Override
        public Node getNodeForCodeInsertion(JSModule module) {
            return root; // Not relevant for this test.
        }

        @Override
        public Node getRoot() {
            return root;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return codingConvention;
        }

        @Override
        public CompilerInput getSynthesizedExternsInput() {
            return synthesizedExternsInput;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            // Mock JSTypeRegistry with a simple constructor if needed,
            // or provide a dummy implementation if it's not used deeply.
            // For this test, we might not need a fully functional one.
            // Let's assume a simple one is sufficient or we mock it if needed.
            // As it's not directly used by CheckSideEffects logic tested,
            // we can return a minimal mock or null if the method is not called.
            // If it needs to be instantiated, a mock would be better.
            // For now, let's return a dummy object if it's required by AbstractCompiler.
            return new JSTypeRegistry(null); // Using a simple constructor
        }

        @Override
        public TypeValidator getTypeValidator() {
            // The TypeValidator might need the compiler instance.
            return new TypeValidator(this);
        }

        @Override
        public ReverseAbstractInterpreter getReverseAbstractInterpreter() {
            // This is likely not needed for CheckSideEffects.
            return null;
        }

        @Override
        public void process(CompilerPass pass) {
            pass.process(null, root);
        }

        @Override
        public Node parseSyntheticCode(String code) {
            // For testing, we can return a simple node or throw if not expected.
            return IR.string(code); // Dummy node
        }

        @Override
        public String toSource(Node node) {
            return "dummy source"; // Dummy
        }

        @Override
        public ErrorReporter getDefaultErrorReporter() {
            // A basic error reporter might be sufficient.
            return new BasicErrorReporter();
        }

        @Override
        public boolean hasHaltingErrors() {
            return false; // Dummy
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return moduleGraph;
        }

        // Abstract methods from AbstractCompiler that are not implemented here.
        // Some are marked with @Override but cannot be implemented without more context.
        // If they are not used by the code under test, we can leave them abstract or throw.
        // For the purpose of compilation, we need to provide implementations or make CompilerStub abstract.
        // Since the tests don't rely on these, we'll provide minimal implementations that don't break compilation.

        @Override public CompilerInput getInput(InputId inputId) { return null; }
        @Override public SourceFile getSourceFileByName(String sourceName) { return null; }
        @Override public CompilerInput newExternInput(String name) { return null; }
        @Override public ScopeCreator getTypedScopeCreator() { return null; }
        @Override public Scope getTopScope() { return null; }
        @Override public void throwInternalError(String msg, Exception cause) { throw new RuntimeException(msg, cause); }
        @Override public void addToDebugLog(String message) { }
        @Override public void setCssRenamingMap(CssRenamingMap map) { }
        @Override public CssRenamingMap getCssRenamingMap() { return null; }
        @Override public Node parseSyntheticCode(String filename, String code) { return IR.string(code); } // Dummy
        @Override public Node parseTestCode(String code) { return IR.string(code); } // Dummy
        @Override public ErrorManager getErrorManager() { return new BasicErrorManager(); } // Dummy
        @Override public void setLifeCycleStage(LifeCycleStage stage) { }
        @Override public boolean areNodesEqualForInlining(Node n1, Node n2) { return false; }
        @Override public void setHasRegExpGlobalReferences(boolean references) { }
        @Override public boolean hasRegExpGlobalReferences() { return false; }
        @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
        @Override public LifeCycleStage getLifeCycleStage() { return LifeCycleStage.NORMALIZED; }
        @Override public Supplier<String> getUniqueNameIdSupplier() { return () -> "dummy"; }
        @Override public void addChangeHandler(CodeChangeHandler handler) { }
        @Override public void removeChangeHandler(CodeChangeHandler handler) { }
        @Override public boolean isIdeMode() { return false; }
        @Override public boolean acceptEcmaScript5() { return true; }
        @Override public boolean acceptConstKeyword() { return true; }
        @Override public Config getParserConfig() { return new Config(null, null, false, false, false); }
        @Override public boolean isTypeCheckingEnabled() { return false; }
        @Override public void prepareAst(Node root) { }

        // Add a method to access problemNodes for testing
        public List<Node> getProblemNodes() {
            return problemNodes;
        }
        
        // Override visit to capture problemNodes
        @Override
        public void visit(NodeTraversal t, Node n, Node parent) {
            // This is a simplified version for the stub.
            // The actual logic is in CheckSideEffects.visit
        }
    }

    private static final CheckLevel LEVEL = CheckLevel.WARNING;
    private static final boolean PROTECT_SIDE_EFFECT_FREE_CODE = true;
    private static final boolean DO_NOT_PROTECT_SIDE_EFFECT_FREE_CODE = false;

    // Helper to create a CheckSideEffects instance and run it
    private CheckSideEffects createAndRunChecker(Node root, boolean protect) {
        CompilerStub compiler = new CompilerStub(root);
        CheckSideEffects checker = new CheckSideEffects(compiler, LEVEL, protect);
        NodeTraversal.traverse(compiler, root, checker);
        return checker;
    }
    
    // Helper to create a CheckSideEffects instance and run process()
    private CheckSideEffects createAndRunCheckerProcess(Node root, boolean protect) {
        CompilerStub compiler = new CompilerStub(root);
        CheckSideEffects checker = new CheckSideEffects(compiler, LEVEL, protect);
        checker.process(null, root); // process calls protectSideEffects if enabled
        return checker;
    }

    @Test
    public void testUselessCodeErrorStringLiteral() throws Exception {
        Node root = IR.script(IR.exprResult(IR.string("this is a string")));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(1, compiler.errors.size());
        assertTrue(compiler.errors.get(0).getMessage().contains("Is there a missing '+' on the previous line?"));
    }

    @Test
    public void testUselessCodeErrorSimpleOperator() throws Exception {
        Node root = IR.script(IR.exprResult(IR.add(IR.number(1), IR.number(2))));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(1, compiler.errors.size());
        assertTrue(compiler.errors.get(0).getMessage().contains("The result of the 'add' operator is not being used."));
    }

    @Test
    public void testUselessCodeErrorNoSideEffects() throws Exception {
        Node root = IR.script(IR.exprResult(IR.newNode(Token.VOID))); // VOID is a token, not a node constructor
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(1, compiler.errors.size());
        assertTrue(compiler.errors.get(0).getMessage().contains("This code lacks side-effects. Is there a bug?"));
    }

    @Test
    public void testUselessCodeWithSideEffects() throws Exception {
        Node root = IR.script(IR.exprResult(IR.call(IR.name("alert"), IR.string("hello"))));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testEmptyStatementIgnored() throws Exception {
        Node root = IR.script(IR.exprResult(IR.empty()));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testCommaStatementIgnored() throws Exception {
        Node root = IR.script(IR.exprResult(IR.comma(IR.number(1), IR.number(2))));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testBlockStatementIgnored() throws Exception {
        Node root = IR.script(IR.block(IR.exprResult(IR.string("hello"))));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testExprResultStatementIgnored() throws Exception {
        Node root = IR.script(IR.exprResult(IR.exprResult(IR.string("hello"))));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testQualifiedNameWithJSDocIgnored() throws Exception {
        Node qualifiedName = IR.name("some.qualified.name");
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.recordDescription("A description");
        qualifiedName.setJSDocInfo(builder.build(qualifiedName));

        Node root = IR.script(IR.exprResult(qualifiedName));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testProtectSideEffectsWithFunctionCall() throws Exception {
        Node callNode = IR.call(IR.name("console.log"), IR.string("test"));
        Node root = IR.script(IR.exprResult(callNode));
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        assertEquals(1, compiler.errors.size());
        assertEquals("code change ", compiler.codeChangeLog.toString()); 

        // Verify that the original call node was replaced by a PROTECTOR_FN call
        Node replacement = root.getFirstChild().getFirstChild(); // The replaced node
        assertEquals(Token.CALL, replacement.getType());
        assertEquals(CheckSideEffects.PROTECTOR_FN, replacement.getFirstChild().getString()); // Use static field
        assertTrue(replacement.getBooleanProp(Node.FREE_CALL));
        assertEquals(callNode, replacement.getLastChild()); // The original call is now a child
    }

    @Test
    public void testProtectSideEffectsWithStringLiteral() throws Exception {
        Node stringNode = IR.string("a string literal");
        Node root = IR.script(IR.exprResult(stringNode));
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        assertEquals(1, compiler.errors.size());
        assertEquals("code change ", compiler.codeChangeLog.toString()); 

        Node replacement = root.getFirstChild().getFirstChild(); // The replaced node
        assertEquals(Token.CALL, replacement.getType());
        assertEquals(CheckSideEffects.PROTECTOR_FN, replacement.getFirstChild().getString()); // Use static field
        assertTrue(replacement.getBooleanProp(Node.FREE_CALL));
        assertEquals(stringNode, replacement.getLastChild()); // The original string is now a child
    }

    @Test
    public void testProtectSideEffectsWithSimpleOperator() throws Exception {
        Node addNode = IR.add(IR.number(1), IR.number(2));
        Node root = IR.script(IR.exprResult(addNode));
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        assertEquals(1, compiler.errors.size());
        assertEquals("code change ", compiler.codeChangeLog.toString()); 

        Node replacement = root.getFirstChild().getFirstChild(); // The replaced node
        assertEquals(Token.CALL, replacement.getType());
        assertEquals(CheckSideEffects.PROTECTOR_FN, replacement.getFirstChild().getString()); // Use static field
        assertTrue(replacement.getBooleanProp(Node.FREE_CALL));
        assertEquals(addNode, replacement.getLastChild()); // The original add is now a child
    }

    @Test
    public void testNoProtectionWhenDisabled() throws Exception {
        Node root = IR.script(IR.exprResult(IR.string("a string literal")));
        CompilerStub compiler = createAndRunCheckerProcess(root, DO_NOT_PROTECT_SIDE_EFFECT_FREE_CODE);
        
        assertEquals(1, compiler.errors.size());
        assertEquals("", compiler.codeChangeLog.toString()); 

        // The original string node should remain.
        assertEquals(Token.STRING, root.getFirstChild().getFirstChild().getType());
        assertEquals("a string literal", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testHotSwapScript() throws Exception {
        Node root = IR.script(IR.exprResult(IR.string("test hot swap")));
        CompilerStub compiler = new CompilerStub(root);
        CheckSideEffects checker = new CheckSideEffects(compiler, LEVEL, PROTECT_SIDE_EFFECT_FREE_CODE);
        checker.hotSwapScript(root, root); // Call hotSwapScript
        
        assertEquals(1, compiler.errors.size());
        assertTrue(compiler.errors.get(0).getMessage().contains("Is there a missing '+' on the previous line?"));
    }

    @Test
    public void testVisitStatementWithSideEffects() throws Exception {
        Node assign = IR.assign(IR.name("x"), IR.number(1));
        Node root = IR.script(assign); // Assign is a statement
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(0, compiler.errors.size()); // No error as it's a statement with side effects
    }

    @Test
    public void testVisitStatementWithoutSideEffects() throws Exception {
        Node root = IR.script(IR.exprResult(IR.string("just a string")));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(1, compiler.errors.size());
    }

    @Test
    public void testProtectSideEffectsWhenStatementHasNoSideEffects() throws Exception {
        Node stringNode = IR.string("a string literal");
        Node root = IR.script(IR.exprResult(stringNode));
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        // Verify problemNodes were captured by the checker
        assertTrue(!compiler.getProblemNodes().isEmpty()); // Check using the added getter
        
        Node replacement = root.getFirstChild().getFirstChild();
        assertEquals(Token.CALL, replacement.getType());
        assertEquals(CheckSideEffects.PROTECTOR_FN, replacement.getFirstChild().getString());
    }

    @Test
    public void testAddExternCreatesVar() throws Exception {
        Node root = IR.script();
        CompilerStub compiler = new CompilerStub(root);
        CheckSideEffects checker = new CheckSideEffects(compiler, LEVEL, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        // Need to access private method addExtern. This might require making it package-private or using reflection.
        // For testing purposes, we can make it package-private or protected, or test indirectly.
        // Let's assume for this corrected version we can call it directly.
        // If not, we'd need to rethink the test setup.
        // If it's private, we can't call it directly. We must rely on process() calling it.
        // Let's call process() which internally calls addExtern if needed.
        
        // First, create a problem node to trigger addExtern in process().
        Node problemNode = IR.string("a problem");
        root.addChildToBack(IR.exprResult(problemNode));
        
        compiler.problemNodes.add(problemNode); // Manually add to simulate finding a problem
        
        checker.protectSideEffects(); // This should call addExtern

        // The synthesized externs input should now have a var declaration for PROTECTOR_FN
        Node externsRoot = compiler.getSynthesizedSynthesizedExternsInput().getAstRoot(compiler); // Accessing through stub
        assertNotNull(externsRoot);
        Node firstChild = externsRoot.getFirstChild();
        assertNotNull(firstChild);
        assertEquals(Token.VAR, firstChild.getType());
        assertEquals(CheckSideEffects.PROTECTOR_FN, firstChild.getFirstChild().getString());
        assertNotNull(firstChild.getJSDocInfo());
        assertTrue(firstChild.getJSDocInfo().hasNoAlias());
    }

    @Test
    public void testProtectSideEffectsDoesNotAddExternIfNoProblems() throws Exception {
        Node root = IR.script(IR.exprResult(IR.call(IR.name("alert")))); // Valid call, no side effect issue
        CompilerStub compiler = new CompilerStub(root);
        CheckSideEffects checker = new CheckSideEffects(compiler, LEVEL, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        // Call process, which calls protectSideEffects if there are problem nodes.
        // Since there are no problem nodes, addExtern should not be called.
        checker.process(null, root); 

        assertEquals(0, compiler.errors.size());
        assertEquals(0, compiler.getProblemNodes().size()); // Accessing via getter
        // Ensure no extern is added if there are no problems
        Node externsRoot = compiler.getSynthesizedSynthesizedExternsInput().getAstRoot(compiler); // Accessing through stub
        assertEquals(0, externsRoot.getChildCount());
    }

    @Test
    public void testIsExpressionResultUsedString() {
        Node strNode = IR.string("hello");
        // NodeUtil.isExpressionResultUsed is a static method, no need for compiler instance
        assertTrue(NodeUtil.isExpressionResultUsed(strNode));
    }

    @Test
    public void testIsExpressionResultUsedCall() {
        Node callNode = IR.call(IR.name("foo"));
        assertTrue(NodeUtil.isExpressionResultUsed(callNode));
    }

    @Test
    public void testIsExpressionResultUsedVariableDeclaration() {
        Node varNode = IR.var(IR.name("x"), IR.number(1));
        assertFalse(NodeUtil.isExpressionResultUsed(varNode));
    }

    @Test
    public void testIsSimpleOperatorTypeAdd() {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    }

    @Test
    public void testIsSimpleOperatorTypeAssign() {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    }

    @Test
    public void testMayHaveSideEffectsCall() {
        Node callNode = IR.call(IR.name("alert"));
        CompilerStub compiler = new CompilerStub(null); // CompilerStub used here for NodeUtil
        assertTrue(NodeUtil.mayHaveSideEffects(callNode, compiler));
    }

    @Test
    public void testMayHaveSideEffectsString() {
        Node stringNode = IR.string("hello");
        CompilerStub compiler = new CompilerStub(null);
        assertFalse(NodeUtil.mayHaveSideEffects(stringNode, compiler));
    }

    @Test
    public void testMayHaveSideEffectsAdd() {
        Node addNode = IR.add(IR.number(1), IR.number(2));
        CompilerStub compiler = new CompilerStub(null);
        assertFalse(NodeUtil.mayHaveSideEffects(addNode, compiler));
    }

    @Test
    public void testMayHaveSideEffectsNew() {
        Node newNode = IR.newNode(Token.NEW);
        CompilerStub compiler = new CompilerStub(null);
        assertTrue(NodeUtil.mayHaveSideEffects(newNode, compiler));
    }

    @Test
    public void testMayHaveSideEffectsAssignment() {
        Node assignNode = IR.assign(IR.name("x"), IR.number(1));
        CompilerStub compiler = new CompilerStub(null);
        assertTrue(NodeUtil.mayHaveSideEffects(assignNode, compiler));
    }

    @Test
    public void testMayHaveSideEffectsFunctionDeclaration() {
        Node fn = IR.function(IR.name("foo"), IR.paramList(), IR.block());
        CompilerStub compiler = new CompilerStub(null);
        assertFalse(NodeUtil.mayHaveSideEffects(fn, compiler));
    }
    
    @Test
    public void testVisit_noParent() throws Exception {
        Node root = IR.string("test"); // A node without a parent in the traversal context
        CompilerStub compiler = new CompilerStub(root);
        CheckSideEffects checker = new CheckSideEffects(compiler, LEVEL, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        // NodeTraversal.traverse expects a compiler and a callback.
        // To test visit with parent=null, we need to simulate that.
        // The visit method itself has a `if (parent == null) return;` guard.
        // So, if we pass root directly to traverse, its parent will be null.
        NodeTraversal.traverse(compiler, root, checker);
        assertEquals(0, compiler.errors.size()); // Should not report anything.
    }

    @Test
    public void testVisit_emptyNode() throws Exception {
        Node root = IR.script(IR.empty()); // An empty node
        CompilerStub compiler = new CompilerStub(root);
        CheckSideEffects checker = new CheckSideEffects(compiler, LEVEL, PROTECT_SIDE_EFFECT_FREE_CODE);
        NodeTraversal.traverse(compiler, root, checker);
        assertEquals(0, compiler.errors.size()); // Should be ignored.
    }

    @Test
    public void testVisit_commaNode() throws Exception {
        Node root = IR.script(IR.exprResult(IR.comma(IR.number(1), IR.number(2)))); // A comma node
        CompilerStub compiler = new CompilerStub(root);
        CheckSideEffects checker = new CheckSideEffects(compiler, LEVEL, PROTECT_SIDE_EFFECT_FREE_CODE);
        NodeTraversal.traverse(compiler, root, checker);
        assertEquals(0, compiler.errors.size()); // Should be ignored.
    }
    
    @Test
    public void testProcess_protectsSideEffectFreeCode() throws Exception {
        Node sideEffectFreeNode = IR.string("useless");
        Node root = IR.script(IR.exprResult(sideEffectFreeNode));
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        assertEquals(1, compiler.errors.size()); // Should report useless code
        assertEquals("code change ", compiler.codeChangeLog.toString()); // Should report code change
        
        // Check if the node was replaced by the protector function call
        Node replacement = root.getFirstChild().getFirstChild();
        assertEquals(Token.CALL, replacement.getType());
        assertEquals(CheckSideEffects.PROTECTOR_FN, replacement.getFirstChild().getString());
        assertEquals(sideEffectFreeNode, replacement.getLastChild()); // Original node is now a child
    }

    @Test
    public void testProcess_doesNotProtectIfDisabled() throws Exception {
        Node sideEffectFreeNode = IR.string("useless");
        Node root = IR.script(IR.exprResult(sideEffectFreeNode));
        CompilerStub compiler = createAndRunCheckerProcess(root, DO_NOT_PROTECT_SIDE_EFFECT_FREE_CODE);
        
        assertEquals(1, compiler.errors.size()); // Should still report useless code
        assertEquals("", compiler.codeChangeLog.toString()); // Should NOT report code change
        
        // Check that the node was NOT replaced
        Node originalNode = root.getFirstChild().getFirstChild();
        assertEquals(Token.STRING, originalNode.getType());
        assertEquals("useless", originalNode.getString());
    }

    // Test for StripProtection inner class if it were testable directly.
    // Since it's an inner class and not directly exposed for testing here,
    // we focus on the main class logic.

    // Test case for a statement that is not an expression result, but is also not side-effect free.
    // For example, a variable declaration that is not used.
    @Test
    public void testUselessVarDeclaration() throws Exception {
        Node varDecl = IR.var(IR.name("unusedVar"), IR.number(10));
        Node root = IR.script(varDecl); // A var declaration is a statement
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        
        // Variable declarations themselves do not have side effects that the checker flags
        // unless the expression assigned has no side effects and is not used.
        // Here, IR.number(10) is side-effect free and not used.
        assertEquals(1, compiler.errors.size());
        assertTrue(compiler.errors.get(0).getMessage().contains("This code lacks side-effects. Is there a bug?"));
    }
    
    // Test case for a simple assignment that is not used.
    // This is a bit tricky as assignments usually have side effects.
    // The checker's logic for `isResultUsed` might be relevant here.
    @Test
    public void testUnusedAssignment() throws Exception {
        Node assignment = IR.assign(IR.name("x"), IR.number(5));
        Node root = IR.script(assignment); // assignment is an expression, can be a statement.
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        
        // An assignment usually has side effects, so it shouldn't be flagged unless it's not used
        // and its result is specifically checked.
        // NodeUtil.isExpressionResultUsed(assignment) should be true for an assignment.
        // Let's check the behavior of NodeUtil.isExpressionResultUsed on an assignment.
        // If it's considered "used", then no error should be reported.
        // If it's not used and has no side effects (which an assignment typically has), then it might be flagged.
        // Let's assume NodeUtil.isExpressionResultUsed correctly identifies assignments as used.
        assertFalse(NodeUtil.isExpressionResultUsed(assignment)); // This would mean it's not used.
        
        // The current logic in CheckSideEffects:
        // `!isResultUsed && (isSimpleOp || !NodeUtil.mayHaveSideEffects(n, ...))`
        // If `assignment` is not `isResultUsed` AND `!NodeUtil.mayHaveSideEffects(assignment, ...)`, it's flagged.
        // NodeUtil.mayHaveSideEffects(assignment, compiler) should be true for assignment.
        // So, it should NOT be flagged.
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testExpressionStatement_sideEffectFree_NotProtected() throws Exception {
        Node statement = IR.string("just a string"); // Side-effect free expression statement
        Node root = IR.script(statement);
        CompilerStub compiler = createAndRunChecker(root, DO_NOT_PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        assertEquals(1, compiler.errors.size()); // Should report useless code
        assertEquals(0, compiler.codeChangeLog.toString().length()); // No protection means no code change
    }
    
    @Test
    public void testExpressionStatement_sideEffectFree_Protected() throws Exception {
        Node statement = IR.string("just a string"); // Side-effect free expression statement
        Node root = IR.script(statement);
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE);
        
        assertEquals(1, compiler.errors.size()); // Should report useless code
        assertEquals("code change ", compiler.codeChangeLog.toString()); // Protection implies code change
        
        // Verify replacement
        Node replacement = root.getFirstChild().getFirstChild();
        assertEquals(Token.CALL, replacement.getType());
        assertEquals(CheckSideEffects.PROTECTOR_FN, replacement.getFirstChild().getString());
    }
    
    @Test
    public void testVoidOperator_withSideEffectFunctionCall() throws Exception {
        Node sideEffectCall = IR.call(IR.name("doSomething"));
        Node voidExpr = IR.voidNode(sideEffectCall); // The void operator itself has no side effects
        Node root = IR.script(IR.exprResult(voidExpr));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        
        // The void operator evaluates its operand but discards the result.
        // If the operand has side effects, it's not useless code.
        // NodeUtil.mayHaveSideEffects(voidExpr, compiler) should consider the operand.
        // The checker should NOT flag this.
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testVoidOperator_withoutSideEffect() throws Exception {
        Node sideEffectFreeExpr = IR.number(123);
        Node voidExpr = IR.voidNode(sideEffectFreeExpr);
        Node root = IR.script(IR.exprResult(voidExpr));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;
        
        // The void operator with a side-effect-free operand results in useless code.
        assertEquals(1, compiler.errors.size());
        assertTrue(compiler.errors.get(0).getMessage().contains("This code lacks side-effects. Is there a bug?"));
    }
}
```