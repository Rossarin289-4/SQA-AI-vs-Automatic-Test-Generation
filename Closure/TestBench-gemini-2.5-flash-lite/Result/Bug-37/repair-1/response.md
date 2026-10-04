```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Token.CommentType;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.CatchClause;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ConditionalExpression;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.DoLoop;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.ForInLoop;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.IfStatement;
import com.google.javascript.rhino.head.ast.InfixExpression;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.Label;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.ast.TryStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;
import com.google.javascript.rhino.head.ast.WhileLoop;
import com.google.javascript.rhino.head.ast.WithStatement;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.Map;
import java.util.function.Supplier;
import com.google.javascript.rhino.head.tools.த்.SimpleErrorReporter; // Added import
import com.google.javascript.rhino.Node.SideEffectFlags; // Added import
import com.google.javascript.rhino.Node.InputId; // Added import
import com.google.javascript.jscomp.parsing.Config; // Added import
import com.google.javascript.jscomp.Scope.Var; // Added import
import com.google.javascript.jscomp.ReferenceCollection; // Added import
import com.google.javascript.rhino.jstype.JSType; // Added import
import com.google.javascript.rhino.jstype.StaticScope; // Added import
import com.google.javascript.jscomp.Scope; // Added import
import com.google.javascript.jscomp.CodingConvention; // Added import
import com.google.javascript.jscomp.DefaultCodingConvention; // Added import
import com.google.javascript.jscomp.LineAndColumn; // Added import
import com.google.javascript.jscomp.TernaryValue; // Added import
import com.google.javascript.jscomp.LineAndColumn; // Already imported
import com.google.javascript.rhino.jstype.JSTypeRegistry; // Added import

public class NodeTraversalTest {
    private static final String SOURCE_CODE = "var x = 1;";

    private MockCompiler compiler;

    private static class MockCompiler extends AbstractCompiler {
        Node root;
        private Node lastReportedNode;
        private DiagnosticType lastReportedType;
        private String[] lastReportedArgs;
        // ErrorManager is an interface, BasicErrorManager is an implementation.
        // Need to use an implementation or mock it. Using a concrete implementation from Rhino.
        private ErrorReporter errorReporter = new SimpleErrorReporter(); // Use SimpleErrorReporter
        private ErrorManager errorManager = new BasicErrorManager() { // Implement BasicErrorManager
            @Override
            public void report(CheckLevel level, JSError error) {
                lastReportedNode = error.getNode();
                lastReportedType = error.getType();
                lastReportedArgs = error.format(LineAndColumn.fromFile(null, null, 0)).arguments;
            }
            @Override protected void printSummary() {}
        };

        @Override
        public ErrorManager getErrorManager() {
            return errorManager;
        }

        @Override
        public void report(JSError error) {
            // The actual reporting happens in errorManager.report()
            // This method is often called by other methods in AbstractCompiler
            // and might be a fallback or for internal use.
            errorManager.report(CheckLevel.ERROR, error);
        }

        @Override
        public Node parseSyntheticCode(String code) {
            return IR.script(); // Simplified for testing
        }

        @Override
        public Node parseSyntheticCode(String filename, String code) {
            return IR.script(); // Simplified for testing
        }

        @Override
        public Node parseTestCode(String code) {
            AstRoot astRoot = new AstRoot();
            astRoot.addChildToBack(new Block()); // Simulate a minimal AST
            Config config = new Config(LanguageMode.ECMASCRIPT5, null, false);
            return IRFactory.transformTree(astRoot, null, code, config, getDefaultErrorReporter());
        }

        @Override
        public String toSource(Node root) {
            return "mocked source";
        }

        @Override
        public ErrorReporter getDefaultErrorReporter() {
            return new SimpleErrorReporter();
        }

        @Override
        public ReverseAbstractInterpreter getReverseAbstractInterpreter() {
            return null;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return null; // Mocked
        }

        @Override
        public Scope getTopScope() {
            return null; // Mocked
        }

        @Override
        public CompilerInput getInput(InputId inputId) {
            return null; // Mocked
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return null; // Mocked
        }

        @Override
        public List<CompilerInput> getInputsInOrder() {
            return null; // Mocked
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new DefaultCodingConvention(); // Use DefaultCodingConvention
        }

        @Override
        public void throwInternalError(String msg, Exception cause) {
            throw new RuntimeException(msg, cause);
        }

        @Override
        public void reportCodeChange() {}

        @Override
        public void addToDebugLog(String message) {}

        @Override
        public void setCssRenamingMap(CssRenamingMap map) {}

        @Override
        public CssRenamingMap getCssRenamingMap() {
            return null;
        }

        @Override
        public Node getNodeForCodeInsertion(JSModule module) {
            return null;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return null;
        }

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return LifeCycleStage.NORMAL;
        }

        @Override
        public Supplier<String> getUniqueNameIdSupplier() {
            return null; // Mocked
        }

        @Override
        public boolean hasHaltingErrors() {
            return false;
        }

        @Override
        public void addChangeHandler(CodeChangeHandler handler) {}

        @Override
        public void removeChangeHandler(CodeChangeHandler handler) {}

        @Override
        public boolean isIdeMode() {
            return false;
        }

        @Override
        public boolean acceptEcmaScript5() {
            return true;
        }

        @Override
        public boolean acceptConstKeyword() {
            return true;
        }

        @Override
        public Config getParserConfig() {
            return new Config(LanguageMode.ECMASCRIPT5, null, false);
        }

        @Override
        public boolean isTypeCheckingEnabled() {
            return false;
        }

        @Override
        public void prepareAst(Node root) {}

        @Override
        public void setLifeCycleStage(LifeCycleStage stage) {}

        @Override
        public boolean areNodesEqualForInlining(Node n1, Node n2) {
            return false;
        }

        @Override
        public void setHasRegExpGlobalReferences(boolean references) {}

        @Override
        public boolean hasRegExpGlobalReferences() {
            return false;
        }

        @Override
        public CheckLevel getErrorLevel(JSError error) {
            return CheckLevel.ERROR;
        }

        @Override
        public void process(CompilerPass pass) {}

        @Override
        public Node getRoot() {
            return root;
        }

        @Override
        public void updateGlobalVarReferences(Map<Var, ReferenceCollection> refMapPatch, Node collectionRoot) {}

        @Override
        public CompilerInput newExternInput(String name) {
            return null;
        }

        @Override
        public String getSourceLine(String sourceName, int lineNumber) {
            return null; // Simplified for testing
        }

        // Added override for setProgress
        @Override
        public void setProgress(double progress) {}
    }

    private static class MockCallback implements NodeTraversal.Callback {
        Node lastVisitedNode = null;
        Node lastParentNode = null;
        boolean shouldTraverseResult = true;

        @Override
        public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
            return shouldTraverseResult;
        }

        @Override
        public void visit(NodeTraversal t, Node n, Node parent) {
            lastVisitedNode = n;
            lastParentNode = parent;
        }
    }

    private static class MockScopedCallback extends MockCallback implements NodeTraversal.ScopedCallback {
        boolean enterScopeCalled = false;
        boolean exitScopeCalled = false;

        @Override
        public void enterScope(NodeTraversal t) {
            enterScopeCalled = true;
        }

        @Override
        public void exitScope(NodeTraversal t) {
            exitScopeCalled = true;
        }
    }

    @Test
    public void testTraverse_simpleScript() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        root.addChildToBack(IR.block());
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertNotNull(t.getCurrentNode());
        assertEquals(root, t.getCurrentNode());
        assertEquals(root, cb.lastVisitedNode);
        assertNull(cb.lastParentNode);
    }

    @Test
    public void testTraverseBranch_basic() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        Node block = IR.block();
        root.addChildToBack(block);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverseBranch(root, null);

        assertEquals(root, cb.lastVisitedNode);
        assertNull(cb.lastParentNode);

        cb = new MockCallback();
        t = new NodeTraversal(compiler, cb);
        t.traverseBranch(block, root);
        assertEquals(block, cb.lastVisitedNode);
        assertEquals(root, cb.lastParentNode);
    }

    @Test
    public void testTraverseBranch_shouldTraverseReturnsFalse() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        Node child = IR.number(1);
        root.addChildToBack(child);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        cb.shouldTraverseResult = false;
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverseBranch(root, null);

        assertEquals(root, cb.lastVisitedNode); // root is always visited
        assertNull(cb.lastParentNode);
        assertNull(child.getType()); // child should not have been visited
    }

    @Test
    public void testTraverse_functionDeclaration() throws Exception {
        compiler = new MockCompiler();
        Node fn = IR.function("foo", IR.paramList(), IR.block());
        Node root = IR.script(fn);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        // The traversal order is generally: function name, params, body
        // Let's check the last visited node for simplicity.
        assertEquals(fn.getLastChild(), cb.lastVisitedNode); // The body block should be the last visited
    }

    @Test
    public void testTraverse_functionExpression() throws Exception {
        compiler = new MockCompiler();
        Node fnExpr = IR.function(null, IR.paramList(), IR.block());
        Node root = IR.script(IR.exprResult(fnExpr));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        // Similar to function declaration, check the last visited node.
        assertEquals(fnExpr.getLastChild(), cb.lastVisitedNode);
    }

    @Test
    public void testPushPopScope_basic() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        MockScopedCallback cb = new MockScopedCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);

        t.traverse(root);

        assertTrue(cb.enterScopeCalled);
        assertTrue(cb.exitScopeCalled);
        assertEquals(1, t.getScopeDepth()); // Global scope remains
    }

    @Test
    public void testGetScope_emptyTraversal() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        // No traverse call, so scope should be null or initial global scope.
        // The current implementation initializes a scope upon traverse start.
        // Let's test after traverse.
        t.traverse(root);
        assertNotNull(t.getScope());
        assertTrue(t.getScope().isGlobal());
    }

    @Test
    public void testGetScope_afterEnteringFunction() throws Exception {
        compiler = new MockCompiler();
        Node fn = IR.function("bar", IR.paramList(), IR.block());
        Node root = IR.script(fn);
        compiler.root = root;

        MockScopedCallback cb = new MockScopedCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        // After traversing a function, the scope should be the global one again.
        assertTrue(t.getScope().isGlobal());
    }

    @Test
    public void testGetControlFlowGraph_lazilyCreated() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        // The first call to getControlFlowGraph should create it.
        ControlFlowGraph<Node> cfg1 = t.getControlFlowGraph();
        assertNotNull(cfg1);

        // Subsequent calls should return the same instance.
        ControlFlowGraph<Node> cfg2 = t.getControlFlowGraph();
        assertSame(cfg1, cfg2);
    }

    @Test
    public void testGetScopeRoot_global() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        assertEquals(root, t.getScopeRoot());
    }

    @Test
    public void testGetScopeRoot_inFunction() throws Exception {
        compiler = new MockCompiler();
        Node fn = IR.function("baz", IR.paramList(), IR.block());
        Node root = IR.script(fn);
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        // The scope root for a function node should be the function node itself.
        assertEquals(fn, t.getScopeRoot());
    }

    @Test
    public void testHasScope_trueAfterTraverse() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);
        assertTrue(t.hasScope());
    }

    @Test
    public void testReport_basic() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        Node errorNode = IR.name("errorVar");
        root.addChildToBack(errorNode);
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        t.report(errorNode, NodeTraversal.NODE_TRAVERSAL_ERROR, "test error message");

        assertNotNull(compiler.lastReportedNode);
        assertEquals(errorNode, compiler.lastReportedNode);
        assertEquals(NodeTraversal.NODE_TRAVERSAL_ERROR, compiler.lastReportedType);
        assertArrayEquals(new String[]{"test error message"}, compiler.lastReportedArgs);
    }

    @Test
    public void testMakeError_basic() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        Node errorNode = IR.name("makeErrorVar");
        root.addChildToBack(errorNode);
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        JSError error = t.makeError(errorNode, NodeTraversal.NODE_TRAVERSAL_ERROR, "make error message");

        assertNotNull(error);
        assertEquals(errorNode, error.getNode());
        assertEquals(NodeTraversal.NODE_TRAVERSAL_ERROR, error.getType());
        assertArrayEquals(new String[]{"make error message"}, error.format(LineAndColumn.fromFile(null, null, 0)).arguments);
    }

    @Test
    public void testTraverseRoots_singleRoot() throws Exception {
        compiler = new MockCompiler();
        Node root1 = IR.block();
        Node root2 = IR.block(); // Not used in this test
        compiler.root = IR.script(root1); // Need a parent script node

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverseRoots(root1);

        assertEquals(root1, cb.lastVisitedNode);
        assertNull(cb.lastParentNode);
    }

    @Test
    public void testTraverseRoots_multipleRoots() throws Exception {
        compiler = new MockCompiler();
        Node root1 = IR.block();
        Node root2 = IR.block();
        Node scriptRoot = IR.script(root1, root2);
        compiler.root = scriptRoot;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverseRoots(Lists.newArrayList(root1, root2));

        // The last visited node should be from the last root processed.
        assertEquals(root2, cb.lastVisitedNode);
    }

    @Test
    public void testTraverseRoots_emptyList() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverseRoots(Lists.newArrayList());

        // No traversal should occur, so lastVisitedNode should be null.
        assertNull(cb.lastVisitedNode);
    }

    @Test
    public void testCurrentNode_updatedDuringTraversal() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        Node child1 = IR.block();
        Node child2 = IR.name("test");
        root.addChildToBack(child1);
        child1.addChildToBack(child2);
        compiler.root = root;

        List<Node> visitedNodes = new LinkedList<>();
        NodeTraversal.Callback cb = new NodeTraversal.AbstractCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
                visitedNodes.add(n);
                assertEquals(n, t.getCurrentNode());
            }
        };

        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(3, visitedNodes.size()); // root, child1, child2
        assertEquals(root, visitedNodes.get(0));
        assertEquals(child1, visitedNodes.get(1));
        assertEquals(child2, visitedNodes.get(2));
    }

    @Test
    public void testGetEnclosingFunction_noFunction() throws Exception {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        assertNull(t.getEnclosingFunction());
    }

    @Test
    public void testGetEnclosingFunction_nestedFunctions() throws Exception {
        compiler = new MockCompiler();
        Node innerFn = IR.function("inner", IR.paramList(), IR.block());
        Node outerFn = IR.function("outer", IR.paramList(), IR.block(innerFn));
        Node root = IR.script(outerFn);
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        // Test by manually setting up a state.
        t.pushScope(innerFn);
        assertEquals(outerFn, t.getEnclosingFunction());
        t.popScope();

        t.pushScope(outerFn);
        assertEquals(outerFn, t.getEnclosingFunction());
        t.popScope();

        t.pushScope(root); // Simulate global scope
        assertNull(t.getEnclosingFunction());
        t.popScope();
    }

    @Test
    public void testSourceName() {
        compiler = new MockCompiler();
        Node root = IR.script();
        root.setInputId(new InputId("test.js"));
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        assertEquals("", t.getSourceName());
    }

    @Test
    public void testGetLineNumber_zeroWhenUnknown() {
        compiler = new MockCompiler();
        Node root = IR.script(); // No line number
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        assertEquals(0, t.getLineNumber());
    }

    @Test
    public void testGetLineNumber_positiveWhenKnown() {
        compiler = new MockCompiler();
        Node root = IR.script();
        Node numberNode = IR.number(123);
        numberNode.setLineno(10);
        root.addChildToBack(numberNode);
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        t.traverseBranch(numberNode, root);
        assertEquals(10, t.getLineNumber());
    }

    @Test
    public void testgetInput_nullWhenNoInputId() {
        compiler = new MockCompiler();
        Node root = IR.script(); // No InputId set
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        assertNull(t.getInput());
    }

    @Test
    public void testGetModule_nullWhenNoInput() {
        compiler = new MockCompiler();
        Node root = IR.script();
        root.setInputId(new InputId("test.js")); // Set InputId but mock getInput returns null
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        assertNull(t.getModule());
    }

    @Test
    public void testTraverseWithScope_globalScope() {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        Scope globalScope = new Scope(root, compiler); // Create a mock global scope
        // Assuming isGlobal is a protected or public field in Scope for testing purposes.
        // If not, this test might fail or need adjustment.
        // For this test, we'll rely on the behavior of pushScope/popScope.

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);

        // Mocking ScopeCreator to return a non-null scope is complex.
        // Focus on the fact that traverseWithScope is called and context is set.
        t.traverseWithScope(root, globalScope);

        assertEquals(globalScope, t.getScope());
        assertEquals(1, t.getScopeDepth());
        assertTrue(t.inGlobalScope());
    }

    @Test
    public void testTraverseAtScope_functionScope() {
        compiler = new MockCompiler();
        Node fn = IR.function("func", IR.paramList(), IR.block());
        compiler.root = IR.script(fn);

        MockScopedCallback cb = new MockScopedCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);

        // Passing a scope object to traverseAtScope.
        // This relies on the Scope constructor and compiler being available.
        t.traverseAtScope(new Scope(fn, compiler));

        assertTrue(cb.enterScopeCalled);
        assertTrue(cb.exitScopeCalled);
    }

    @Test
    public void testTraverseInnerNode_withRefinedScope() {
        compiler = new MockCompiler();
        Node parent = IR.function("parentFn", IR.paramList(), IR.block());
        Node child = IR.name("childVar");
        parent.addChildToBack(child);
        compiler.root = IR.script(parent);

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);

        Scope globalScope = new Scope(compiler.getRoot(), compiler);
        t.pushScope(globalScope);

        Scope refinedScope = new Scope(child, compiler);

        t.traverseInnerNode(child, parent, refinedScope);

        assertEquals(child, cb.lastVisitedNode);
        assertEquals(parent, cb.lastParentNode);

        // After traverseInnerNode, the scope should revert to the one before pushScope.
        assertEquals(globalScope, t.getScope());
        t.popScope(); // Clean up the pushed globalScope
    }

    @Test
    public void testTraverseInnerNode_withoutRefinedScope() {
        compiler = new MockCompiler();
        Node parent = IR.function("parentFn", IR.paramList(), IR.block());
        Node child = IR.name("childVar");
        parent.addChildToBack(child);
        compiler.root = IR.script(parent);

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);

        Scope globalScope = new Scope(compiler.getRoot(), compiler);
        t.pushScope(globalScope);

        t.traverseInnerNode(child, parent, null);

        assertEquals(child, cb.lastVisitedNode);
        assertEquals(parent, cb.lastParentNode);

        assertEquals(globalScope, t.getScope());
        t.popScope(); // Clean up the pushed globalScope
    }

    @Test
    public void testGetCompiler() {
        compiler = new MockCompiler();
        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        assertEquals(compiler, t.getCompiler());
        // Test the cast to Compiler
        assertEquals(compiler.getCompiler(), t.getCompiler());
    }

    @Test
    public void testInGlobalScope_trueForRoot() {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        assertTrue(t.inGlobalScope());
    }

    @Test
    public void testInGlobalScope_falseInsideFunction() {
        compiler = new MockCompiler();
        Node fn = IR.function("f", IR.paramList(), IR.block());
        Node root = IR.script(fn);
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        t.traverseBranch(fn, root); // Traverse into the function node

        assertFalse(t.inGlobalScope());
    }

    @Test
    public void testGetScopeDepth_global() {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        assertEquals(1, t.getScopeDepth()); // Global scope
    }

    @Test
    public void testGetScopeDepth_insideFunction() {
        compiler = new MockCompiler();
        Node fn = IR.function("f", IR.paramList(), IR.block());
        Node root = IR.script(fn);
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        t.traverseBranch(fn, root);

        assertEquals(2, t.getScopeDepth());
    }

    @Test
    public void testFormatNodePosition_basic() {
        compiler = new MockCompiler();
        Node n = IR.string("hello");
        n.setLineno(5);
        n.setCharno(10);
        compiler.root = IR.script(n);

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.sourceName = "test.js";
        t.curNode = n;

        try {
            throw new RuntimeException("simulated error");
        } catch (RuntimeException e) {
            t.throwUnexpectedException(e);
        }

        assertNotNull(compiler.lastReportedArgs);
        assertTrue(compiler.lastReportedArgs.length > 0);
        String msg = compiler.lastReportedArgs[0];
        assertTrue(msg.contains("test.js:5:10"));
        assertTrue(msg.contains("[source unknown]"));
    }

    @Test
    public void testTraverse_functionWithLabel() throws Exception {
        compiler = new MockCompiler();
        Node labelName = IR.labelName("myLabel"); // Use IR.labelName
        Node breakStmt = IR.breakStatement(labelName); // Break to labelName
        Node block = IR.block(breakStmt);
        Node fn = IR.function("f", IR.paramList(), block);
        Node root = IR.script(fn);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(breakStmt, cb.lastVisitedNode);
    }

    @Test
    public void testGetControlFlowGraph_nonNullForFunction() throws Exception {
        compiler = new MockCompiler();
        Node fn = IR.function("f", IR.paramList(), IR.block());
        Node root = IR.script(fn);
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.traverse(root);

        t.pushScope(fn);
        ControlFlowGraph<Node> cfg = t.getControlFlowGraph();
        assertNotNull(cfg);
        t.popScope();
    }

    @Test
    public void testFormatNodeContext_withNode() {
        compiler = new MockCompiler();
        Node node = IR.number(1);
        node.setLineno(10);
        node.setCharno(20);
        compiler.root = IR.script(node);

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.sourceName = "test.js";
        t.curNode = node;

        String context = t.formatNodeContext("Current Node", t.curNode);

        assertTrue(context.contains("Current Node(NUMBER 1.0)"));
        assertTrue(context.contains("test.js:10:20"));
        assertTrue(context.contains("[source unknown]"));
    }

    @Test
    public void testFormatNodeContext_withNullNode() {
        compiler = new MockCompiler();
        Node root = IR.script();
        compiler.root = root;

        NodeTraversal t = new NodeTraversal(compiler, new MockCallback());
        t.sourceName = "test.js";
        t.curNode = null;

        String context = t.formatNodeContext("Current Node", t.curNode);

        assertTrue(context.contains("Current Node: NULL"));
        assertFalse(context.contains("test.js"));
    }

    @Test
    public void testTraverse_forLoop() {
        compiler = new MockCompiler();
        Node init = IR.var("i", IR.number(0));
        Node cond = IR.lt(IR.name("i"), IR.number(10));
        Node inc = IR.inc(IR.name("i"));
        Node body = IR.block();
        Node forLoop = IR.forLoop(init, cond, inc, body);
        Node root = IR.script(forLoop);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(body, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_whileLoop() {
        compiler = new MockCompiler();
        Node cond = IR.trueNode();
        Node body = IR.block();
        Node whileLoop = IR.whileLoop(cond, body);
        Node root = IR.script(whileLoop);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(body, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_doLoop() {
        compiler = new MockCompiler();
        Node cond = IR.trueNode();
        Node body = IR.block();
        Node doLoop = IR.doLoop(body, cond);
        Node root = IR.script(doLoop);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(cond, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_ifStatement() {
        compiler = new MockCompiler();
        Node cond = IR.trueNode();
        Node thenBranch = IR.block();
        Node elseBranch = IR.block();
        Node ifStmt = IR.ifStatement(cond, thenBranch, elseBranch);
        Node root = IR.script(ifStmt);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(elseBranch, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_switchStatement() {
        compiler = new MockCompiler();
        Node case1 = IR.caseStatement(IR.number(1), IR.block(IR.returnNode(IR.number(1))));
        Node case2 = IR.caseStatement(IR.number(2), IR.block(IR.returnNode(IR.number(2))));
        Node switchStmt = IR.switchStatement(IR.name("switchVar"), case1, case2);
        Node root = IR.script(switchStmt);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(case2.getLastChild(), cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_tryStatement() {
        compiler = new MockCompiler();
        Node tryBlock = IR.block(IR.returnNode(IR.number(1)));
        Node catchBlock = IR.block(IR.returnNode(IR.number(2)));
        Node finallyBlock = IR.block(IR.returnNode(IR.number(3)));
        Node tryStmt = IR.tryStatement(tryBlock, IR.catchClause(IR.name("e"), catchBlock), finallyBlock);
        Node root = IR.script(tryStmt);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(finallyBlock, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_unaryExpression() {
        compiler = new MockCompiler();
        Node expr = IR.inc(IR.name("x")); // ++x
        Node root = IR.script(IR.exprResult(expr));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(expr, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_binaryExpression() {
        compiler = new MockCompiler();
        Node expr = IR.add(IR.number(1), IR.number(2)); // 1 + 2
        Node root = IR.script(IR.exprResult(expr));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(expr, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_functionCall() {
        compiler = new MockCompiler();
        Node fnName = IR.name("foo");
        Node arg = IR.number(1);
        Node call = IR.call(fnName, arg);
        Node root = IR.script(IR.exprResult(call));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(call, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_newExpression() {
        compiler = new MockCompiler();
        Node ctor = IR.name("MyClass");
        Node arg = IR.number(1);
        Node newNode = IR.newNode(ctor, arg);
        Node root = IR.script(IR.exprResult(newNode));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(newNode, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_propertyGet() {
        compiler = new MockCompiler();
        Node obj = IR.name("obj");
        Node prop = IR.string("prop");
        Node getProp = IR.prop(obj, prop);
        Node root = IR.script(IR.exprResult(getProp));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(getProp, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_elementGet() {
        compiler = new MockCompiler();
        Node obj = IR.name("arr");
        Node index = IR.number(0);
        Node elemGet = IR.elem(obj, index);
        Node root = IR.script(IR.exprResult(elemGet));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(elemGet, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_objectLiteral() {
        compiler = new MockCompiler();
        Node key = IR.string("key");
        Node value = IR.number(1);
        Node prop = IR.objectProperty(key, value);
        Node objLit = IR.objectLit(prop);
        Node root = IR.script(IR.exprResult(objLit));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(objLit, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_arrayLiteral() {
        compiler = new MockCompiler();
        Node elem = IR.number(1);
        Node arrLit = IR.arrayLit(elem);
        Node root = IR.script(IR.exprResult(arrLit));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(arrLit, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_regExpLiteral() {
        compiler = new MockCompiler();
        Node regExp = IR.regexp("a.b", "g");
        Node root = IR.script(IR.exprResult(regExp));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(regExp, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_keywordLiteral() {
        compiler = new MockCompiler();
        Node trueLit = IR.trueNode();
        Node root = IR.script(IR.exprResult(trueLit));
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(trueLit, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_throwStatement() {
        compiler = new MockCompiler();
        Node expr = IR.string("error");
        Node throwStmt = IR.throwStatement(expr);
        Node root = IR.script(throwStmt);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(throwStmt, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_returnStatement() {
        compiler = new MockCompiler();
        Node expr = IR.number(10);
        Node returnStmt = IR.returnNode(expr);
        Node root = IR.script(returnStmt);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(returnStmt, cb.lastVisitedNode);
    }

    @Test
    public void testTraverse_breakStatement() {
        compiler = new MockCompiler();
        Node loopBody = IR.block(IR.breakNode()); // Break without label
        Node loop = IR.whileLoop(IR.trueNode(), loopBody);
        Node root = IR.script(loop);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(loopBody, cb.lastVisitedNode); // Last visited node inside the loop body
    }

    @Test
    public void testTraverse_continueStatement() {
        compiler = new MockCompiler();
        Node loopBody = IR.block(IR.continueNode()); // Continue without label
        Node loop = IR.whileLoop(IR.trueNode(), loopBody);
        Node root = IR.script(loop);
        compiler.root = root;

        MockCallback cb = new MockCallback();
        NodeTraversal t = new NodeTraversal(compiler, cb);
        t.traverse(root);

        assertEquals(loopBody, cb.lastVisitedNode); // Last visited node inside the loop body
    }
}
```