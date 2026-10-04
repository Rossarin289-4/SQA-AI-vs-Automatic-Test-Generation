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
import java.util.function.Supplier; // Correct import for Supplier

// Mock classes and interfaces that are used by CheckSideEffects and its dependencies.
// These are minimal implementations to allow compilation and basic testing.

// Mock AbstractCompiler to provide necessary methods for CheckSideEffects.
abstract class AbstractCompilerStub extends AbstractCompiler {
    protected final List<JSError> errors = Lists.newArrayList();
    protected final StringBuilder codeChangeLog = new StringBuilder();
    protected Node root;
    protected CompilerInput synthesizedExternsInput;
    protected List<Node> problemNodes = Lists.newArrayList();

    public AbstractCompilerStub(Node root) {
        this.root = root;
        // Initialize synthesizedExternsInput with a dummy SourceFile
        SourceFile dummyExterns = SourceFile.builder().setName("externs").build();
        this.synthesizedExternsInput = new CompilerInput(dummyExterns);
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
        return new DefaultCodingConvention(); // Use DefaultCodingConvention
    }

    @Override
    public CompilerInput getSynthesizedExternsInput() {
        return synthesizedExternsInput;
    }

    // Abstract methods that must be implemented by concrete subclasses or provided.
    @Override public abstract JSTypeRegistry getTypeRegistry();
    @Override public abstract TypeValidator getTypeValidator();
    @Override public abstract ReverseAbstractInterpreter getReverseAbstractInterpreter();
    @Override public abstract void process(CompilerPass pass);
    @Override public abstract Node parseSyntheticCode(String code);
    @Override public abstract String toSource(Node node);
    @Override public abstract ErrorReporter getDefaultErrorReporter();
    @Override public abstract boolean hasHaltingErrors();
    @Override public abstract JSModuleGraph getModuleGraph();
    @Override public abstract CompilerInput getInput(InputId inputId);
    @Override public abstract SourceFile getSourceFileByName(String sourceName);
    @Override public abstract CompilerInput newExternInput(String name);
    @Override public abstract ScopeCreator getTypedScopeCreator();
    @Override public abstract Scope getTopScope();
    @Override public abstract void throwInternalError(String msg, Exception cause);
    @Override public abstract void addToDebugLog(String message);
    @Override public abstract void setCssRenamingMap(CssRenamingMap map);
    @Override public abstract CssRenamingMap getCssRenamingMap();
    @Override public abstract Node parseSyntheticCode(String filename, String code);
    @Override public abstract Node parseTestCode(String code);
    @Override public abstract ErrorManager getErrorManager();
    @Override public abstract void setLifeCycleStage(LifeCycleStage stage);
    @Override public abstract boolean areNodesEqualForInlining(Node n1, Node n2);
    @Override public abstract void setHasRegExpGlobalReferences(boolean references);
    @Override public abstract boolean hasRegExpGlobalReferences();
    @Override public abstract CheckLevel getErrorLevel(JSError error);
    @Override public abstract LifeCycleStage getLifeCycleStage();
    @Override public abstract Supplier<String> getUniqueNameIdSupplier();
    @Override public abstract void addChangeHandler(CodeChangeHandler handler);
    @Override public abstract void removeChangeHandler(CodeChangeHandler handler);
    @Override public abstract boolean isIdeMode();
    @Override public abstract boolean acceptEcmaScript5();
    @Override public abstract boolean acceptConstKeyword();
    @Override public abstract Config getParserConfig();
    @Override public abstract boolean isTypeCheckingEnabled();
    @Override public abstract void prepareAst(Node root);
    @Override public abstract void ensureLibraryInjected(String name); // Added this required method
}

// Mock JSTypeRegistry
class MockJSTypeRegistry extends JSTypeRegistry {
    public MockJSTypeRegistry() {
        super(null); // Pass null for the error reporter as it's not used in this mock context
    }
}

// Mock TypeValidator
class MockTypeValidator extends TypeValidator {
    public MockTypeValidator(AbstractCompiler compiler) {
        super(compiler);
    }
}

// Mock ReverseAbstractInterpreter
class MockReverseAbstractInterpreter extends ReverseAbstractInterpreter {
    @Override
    public JSTypeWithCondition get<bos>(Node node, JSTypeRegistry typeRegistry) {
        return null; // Not used in this test context
    }
}

// Mock ErrorReporter
class MockErrorReporter implements ErrorReporter {
    @Override
    public void warning(String message, String sourceName, int line, int charPosition) {
        // Do nothing
    }

    @Override
    public void error(String message, String sourceName, int line, int charPosition) {
        // Do nothing
    }

    @Override
    public void fatalError(String message, String sourceName, int line, int charPosition) {
        // Do nothing
    }
}

// Mock BasicErrorReporter (if BasicErrorReporter was intended to be a concrete class)
// Assuming BasicErrorReporter is meant to be a concrete class that implements ErrorReporter.
class BasicErrorReporterStub extends MockErrorReporter {
    // Add any specific behavior if needed, otherwise inherits from MockErrorReporter
}

// Mock BasicErrorManager
class BasicErrorManagerStub extends BasicErrorManager {
    // Minimal implementation
    @Override
    public void report(JSError error) {
        // Do nothing
    }
}

// Mock Config
class MockConfig extends Config {
    public MockConfig() {
        super(null, null, false, false, false); // Minimal constructor
    }
}

// Concrete implementation of AbstractCompilerStub
class CompilerStub extends AbstractCompilerStub {

    public CompilerStub(Node root) {
        super(root);
    }

    @Override
    public JSTypeRegistry getTypeRegistry() {
        return new MockJSTypeRegistry();
    }

    @Override
    public TypeValidator getTypeValidator() {
        return new MockTypeValidator(this);
    }

    @Override
    public ReverseAbstractInterpreter getReverseAbstractInterpreter() {
        return new MockReverseAbstractInterpreter();
    }

    @Override
    public void process(CompilerPass pass) {
        pass.process(null, root);
    }

    @Override
    public Node parseSyntheticCode(String code) {
        return IR.string(code); // Dummy node
    }

    @Override
    public String toSource(Node node) {
        return "dummy source"; // Dummy
    }

    @Override
    public ErrorReporter getDefaultErrorReporter() {
        return new BasicErrorReporterStub();
    }

    @Override
    public boolean hasHaltingErrors() {
        return false; // Dummy
    }

    @Override
    public JSModuleGraph getModuleGraph() {
        // Create a simple JSModuleGraph
        return new JSModuleGraph(Lists.newArrayList());
    }

    @Override public CompilerInput getInput(InputId inputId) { return null; }
    @Override public SourceFile getSourceFileByName(String sourceName) { return null; }
    @Override public CompilerInput newExternInput(String name) { return null; }
    @Override public ScopeCreator getTypedScopeCreator() { return null; }
    @Override public Scope getTopScope() { return null; }
    @Override public void throwInternalError(String msg, Exception cause) { throw new RuntimeException(msg, cause); }
    @Override public void addToDebugLog(String message) { }
    @Override public void setCssRenamingMap(CssRenamingMap map) { }
    @Override public CssRenamingMap getCssRenamingMap() { return null; }
    @Override public Node parseSyntheticCode(String filename, String code) { return IR.string(code); }
    @Override public Node parseTestCode(String code) { return IR.string(code); }
    @Override public ErrorManager getErrorManager() { return new BasicErrorManagerStub(); }
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
    @Override public Config getParserConfig() { return new MockConfig(); } // Use MockConfig
    @Override public boolean isTypeCheckingEnabled() { return false; }
    @Override public void prepareAst(Node root) { }
    @Override public void ensureLibraryInjected(String name) { } // Implement the required method

    // Add a method to access problemNodes for testing
    public List<Node> getProblemNodes() {
        return problemNodes;
    }
}

public class CheckSideEffectsTest {

    private static final CheckLevel LEVEL = CheckLevel.WARNING;
    private static final boolean PROTECT_SIDE_EFFECT_FREE_CODE = true;
    private static final boolean DO_NOT_PROTECT_SIDE_EFFECT_FREE_CODE = false;

    // Helper to create a CheckSideEffects instance and run it through NodeTraversal.traverse
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
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

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
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

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
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

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
        CompilerStub compiler = createAndRunCheckerProcess(root, DO_NOT_PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

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
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

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

        // Need to trigger protectSideEffects() which in turn calls addExtern().
        // To do this, we need to add a problem node to the compiler.
        Node problemNode = IR.string("a problem");
        root.addChildToBack(IR.exprResult(problemNode));
        compiler.problemNodes.add(problemNode); // Manually add to simulate finding a problem

        checker.protectSideEffects(); // This should call addExtern

        // The synthesized externs input should now have a var declaration for PROTECTOR_FN
        Node externsRoot = compiler.getSynthesizedExternsInput().getAstRoot(compiler); // Accessing through stub
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
        Node externsRoot = compiler.getSynthesizedExternsInput().getAstRoot(compiler); // Accessing through stub
        assertEquals(0, externsRoot.getChildCount());
    }

    // Tests for NodeUtil static methods are included for completeness, as they are used by CheckSideEffects
    @Test
    public void testIsExpressionResultUsedString() {
        Node strNode = IR.string("hello");
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
        CompilerStub compiler = new CompilerStub(null);
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
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

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
        CompilerStub compiler = createAndRunCheckerProcess(root, DO_NOT_PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

        assertEquals(1, compiler.errors.size()); // Should still report useless code
        assertEquals("", compiler.codeChangeLog.toString()); // Should NOT report code change

        // Check that the node was NOT replaced
        Node originalNode = root.getFirstChild().getFirstChild();
        assertEquals(Token.STRING, originalNode.getType());
        assertEquals("useless", originalNode.getString());
    }

    // Test case for a statement that is not an expression result, but is also not side-effect free.
    @Test
    public void testUselessVarDeclaration() throws Exception {
        Node varDecl = IR.var(IR.name("unusedVar"), IR.number(10));
        Node root = IR.script(varDecl); // A var declaration is a statement
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

        // The value assigned to the var (IR.number(10)) is side-effect free and not used.
        assertEquals(1, compiler.errors.size());
        assertTrue(compiler.errors.get(0).getMessage().contains("This code lacks side-effects. Is there a bug?"));
    }

    @Test
    public void testUnusedAssignment() throws Exception {
        Node assignment = IR.assign(IR.name("x"), IR.number(5));
        Node root = IR.script(assignment); // assignment is an expression, can be a statement.
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

        // NodeUtil.isExpressionResultUsed(assignment) should be true for an assignment node.
        // The condition in visit is `!isResultUsed && ...`. Since `isResultUsed` is true,
        // the condition `!isResultUsed` is false, and no error should be reported.
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
        CompilerStub compiler = createAndRunCheckerProcess(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

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
        // If the operand has side effects (like a function call), NodeUtil.mayHaveSideEffects(voidExpr, compiler)
        // should return true because of the operand. Thus, the condition `!NodeUtil.mayHaveSideEffects(n, ...)`
        // will be false, and no error should be reported.
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testVoidOperator_withoutSideEffect() throws Exception {
        Node sideEffectFreeExpr = IR.number(123);
        Node voidExpr = IR.voidNode(sideEffectFreeExpr);
        Node root = IR.script(IR.exprResult(voidExpr));
        CompilerStub compiler = createAndRunChecker(root, PROTECT_SIDE_EFFECT_FREE_CODE).compiler;

        // The void operator with a side-effect-free operand results in useless code.
        // `!isResultUsed` is true, `isSimpleOp` is false, and `!NodeUtil.mayHaveSideEffects(voidExpr, compiler)` is true.
        // Thus, the condition `!isResultUsed && (isSimpleOp || !NodeUtil.mayHaveSideEffects(n, ...))` is true.
        assertEquals(1, compiler.errors.size());
        assertTrue(compiler.errors.get(0).getMessage().contains("This code lacks side-effects. Is there a bug?"));
    }
}
