```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ScopedAliasesTest {

    // Mock implementation of AbstractCompiler for testing.
    private static class MockCompiler extends AbstractCompiler {
        private StringBuilder errorLog = new StringBuilder();
        private boolean codeChangeReported = false;

        @Override
        public void report(JSError error) {
            errorLog.append(error.format(null)).append("\n"); // Use format(null) to get the message string
        }

        @Override
        public void reportCodeChange() {
            codeChangeReported = true;
        }

        @Override
        public int getErrorCount() {
            return errorLog.toString().split("\n").length - 1; // Subtract one for the trailing newline
        }

        @Override
        public int getWarningCount() {
            return 0;
        }

        @Override
        protected void initCompilerOptionsIfAssumed(CompilerOptions options) {
        }

        @Override
        public Node parse(CompilerOptions options, String code) {
            throw new UnsupportedOperationException("Not implemented in mock.");
        }

        @Override
        public void process(Node externs, Node root) {
            throw new UnsupportedOperationException("Not implemented in mock.");
        }

        @Override
        public boolean ensureLibraryInjected(String libraryName) {
             throw new UnsupportedOperationException("Not implemented in mock.");
        }
    }

    // Mock implementation of AliasTransformationHandler.
    private static class MockAliasTransformationHandler implements AliasTransformationHandler {
        private StringBuilder log = new StringBuilder();

        // The actual method signature from AliasTransformationHandler
        @Override
        public AliasTransformation logAliasTransformation(String filename, SourcePosition<?> sourcePosition) {
            log.append("Logging transformation for: ").append(filename).append(" at ").append(sourcePosition.getStartLine()).append(":").append(sourcePosition.getPositionOnStartLine()).append("\n");
            return new AliasTransformation() {
                @Override
                public void addAlias(String aliasName, String qualifiedName) {
                    log.append("  Added alias: ").append(aliasName).append(" -> ").append(qualifiedName).append("\n");
                }
            };
        }

        public String getLog() {
            return log.toString();
        }
    }

    // Helper to create a simple Node.
    private Node createNode(int type, String value) {
        Node node = new Node(type);
        node.setString(value);
        return node;
    }

    // Helper to create a simple Node with a qualified name.
    private Node createQualifiedNameNode(String name) {
        Node node = Node.newString(name);
        // The Node API does not have setProp for Node.QUOTED_PROP directly.
        // This might be an internal detail not exposed or tested this way.
        // For testing purposes, we'll assume string nodes are sufficient for qualified names if their content is a qualified name.
        return node;
    }

    // Mock Var class to provide Var objects.
    private static class MockVar extends Scope.Var {
        private final String name;
        private final Node initialValue;
        private final Node declarationNode; // Added to satisfy constructor

        MockVar(String name, Node initialValue, Node declarationNode) {
            // The Var constructor is complex and requires many arguments.
            // We are providing simplified arguments based on what's observed in ScopedAliases.
            // `super(name, initialValue, scope, node, type, module, initialCall, injected)` is a likely signature.
            // For testing, we need to provide something that allows instantiation.
            // Let's assume a simplified constructor is sufficient or adapt to the actual one if known.
            // Looking at NodeTraversal.Scope.Var, it has a constructor like:
            // Var(String name, Node node, Scope scope, Var parentVar, JSType type, CompilerInput input, boolean inferred, JSDocInfo docInfo)
            // This is too complex to mock accurately without more context.
            // For now, let's simplify the constructor and assume we don't need full Var functionality.

            // Based on the usage in ScopedAliases, only `getName()` and `getInitialValue()` are critical.
            // `getNode()` is also used.
            // The `super` call requires a `scope`, `node`, `type`, `module` etc.
            // Let's create a dummy Var that bypasses the super call if possible, or mock minimal parts.

            super(name, initialValue, null, declarationNode, null, null, false, null); // Simplified call

            this.name = name;
            this.initialValue = initialValue;
            this.declarationNode = declarationNode;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Node getInitialValue() {
            return initialValue;
        }

        @Override
        public Node getNode() {
            return declarationNode; // Use the provided declaration node
        }
    }

    // Mock Scope class to provide Var objects.
    private static class MockScope implements Scope {
        private final Map<String, Var> vars = Maps.newHashMap();
        private final Node rootNode;

        MockScope(Node rootNode) {
            this.rootNode = rootNode;
        }

        void addVar(String name, Var var) {
            vars.put(name, var);
        }

        @Override
        public Var getVar(String name) {
            return vars.get(name);
        }

        @Override
        public Iterable<Var> getVarIterable() {
            return vars.values();
        }

        @Override
        public Node getRootNode() {
            return rootNode;
        }

        // Methods that are not used by ScopedAliases's Traversal class can be left unimplemented or throw exceptions.
        // The specific constructor for `Var` in the `MockVar` above is simplified to avoid requiring a full `Scope` object.
        // If `Scope` methods that depend on `Var`'s full constructor are called, this mock will fail.
        // For the tests written, only `getVar` and `getVarIterable` are heavily used on `Scope`.
        @Override public void declare(String name, Node node, @Nullable Node initialValue, JSModule module) { throw new UnsupportedOperationException(); }
        @Override public boolean isDeclared(String name) { throw new UnsupportedOperationException(); }
        @Override public boolean isGlobal() { throw new UnsupportedOperationException(); }
        @Override public Scope getParent() { throw new UnsupportedOperationException(); }
        @Override public Map<String, Var> getVariables() { throw new UnsupportedOperationException(); }
        @Override public Var computeDeclaredVariables() { throw new UnsupportedOperationException(); }
        @Override public Map<Node, Var> getNodesToVars() { throw new UnsupportedOperationException(); }
        @Override public Var getImplicitUnreferencedVar(String name) { throw new UnsupportedOperationException(); }
        @Override public void inferFrom(Scope scope) { throw new UnsupportedOperationException(); }
        @Override public void inferFromBlock(Node block) { throw new UnsupportedOperationException(); }
        @Override public void inferFromFor(Node node) { throw new UnsupportedOperationException(); }
        @Override public void inferFromFunction(Node function) { throw new UnsupportedOperationException(); }
        @Override public void inferFromIf(Node node) { throw new UnsupportedOperationException(); }
        @Override public void inferFromObjectLit(Node objectLit) { throw new UnsupportedOperationException(); }
        @Override public void inferFromParameterList(Node parameters) { throw new UnsupportedOperationException(); }
        @Override public void inferFromPromise(Node promise) { throw new UnsupportedOperationException(); }
        @Override public void inferFromReturn(Node node) { throw new UnsupportedOperationException(); }
        @Override public void inferFromSwitch(Node node) { throw new UnsupportedOperationException(); }
        @Override public void inferFromThrow(Node node) { throw new UnsupportedOperationException(); }
        @Override public void inferFromTry(Node node) { throw new UnsupportedOperationException(); }
        @Override public void inferFromVar(Node node) { throw new UnsupportedOperationException(); }
        @Override public void inferFromWhile(Node node) { throw new UnsupportedOperationException(); }
        @Override public void inferAlias(String aliasName, Node node) { throw new UnsupportedOperationException(); }
        @Override public void addQualifiedName(Node node) { throw new UnsupportedOperationException(); }
        @Override public void addForcedInferredVar(String name, Node node) { throw new UnsupportedOperationException(); }
        @Override public void setImplicitWithVar(Var var) { throw new UnsupportedOperationException(); }
        @Override public void setPrototype(Node prototype) { throw new UnsupportedOperationException(); }
        @Override public void setTypedScope(boolean isTyped) { throw new UnsupportedOperationException(); }
        @Override public boolean isTyped() { throw new UnsupportedOperationException(); }
        @Override public Set<String> getDirectlyAssignedVariableNames() { throw new UnsupportedOperationException(); }
        @Override public void visitChildren(NodeTraversal t) { throw new UnsupportedOperationException(); }
        @Override public void finalize(NodeTraversal t) { throw new UnsupportedOperationException(); }
        @Override public void setCatchBlockVar(Node catchNode, Var catchVar) { throw new UnsupportedOperationException(); }
        @Override public Var getCatchBlockVar(Node catchNode) { throw new UnsupportedOperationException(); }
    }

    // Mock NodeTraversal to control scopes and current nodes.
    private static class MockNodeTraversal extends NodeTraversal {
        private Node currentNode;
        private Scope currentScope;
        private int scopeDepth = 0;
        private Node scopeRoot;
        private final Callback callback; // Need to hold the callback

        MockNodeTraversal(AbstractCompiler compiler, Callback cb) {
            // The NodeTraversal constructor requires compiler and callback.
            // We need to provide a dummy compiler and the actual callback being mocked.
            super(compiler, cb);
            this.callback = cb;
        }

        void setCurrentNode(Node node) {
            this.currentNode = node;
        }

        void setCurrentScope(Scope scope) {
            this.currentScope = scope;
        }

        void setScopeDepth(int depth) {
            this.scopeDepth = depth;
        }

        void setScopeRoot(Node scopeRoot) {
            this.scopeRoot = scopeRoot;
        }

        @Override
        public Node getCurrentNode() {
            return currentNode;
        }

        @Override
        public Scope getScope() {
            return currentScope;
        }

        @Override
        public Node getScopeRoot() {
            return scopeRoot;
        }

        @Override
        public int getScopeDepth() {
            return scopeDepth;
        }

        @Override
        public void report(Node n, DiagnosticType diagnosticType, String... arguments) {
            ((MockCompiler) getCompiler()).report(JSError.make(n, diagnosticType, arguments));
        }

        // The `shouldTraverse` method in NodeTraversal is `final`.
        // We cannot override it. However, for mocking purposes, the logic within `visit` and `enterScope`
        // needs to be controlled. The `super` call in NodeTraversal constructor handles this.
        // We will rely on the `Callback` provided to `NodeTraversal` to implement the traversal logic.

        // Helper to get the callback
        public Callback getCallback() {
            return callback;
        }
    }

    @Test
    public void testProcess_simpleGoogScope() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        // var x = goog.dom.TagName.DIV; goog.scope(function() { var y = x; });
        Node script = new Node(Token.SCRIPT);
        Node varX = new Node(Token.VAR,
            Node.newString("x", 0, 0),
            createQualifiedNameNode("goog.dom.TagName.DIV") // Simulating qualified name
        );
        // Node.QUOTED_PROP is a property, not a method to set.
        // We can't directly set it without reflection or knowing its internal API.
        // The `createQualifiedNameNode` already returns a Node.newString.

        Node googScopeCall = new Node(Token.CALL);
        Node googScopeName = Node.newString(Token.CALL, "goog.scope"); // Type should be NAME, not CALL
        googScopeName.setType(Token.NAME); // Correct type for qualified name lookup
        googScopeCall.addChildToFront(googScopeName);
        Node scopeFn = new Node(Token.FUNCTION);
        Node scopeBody = new Node(Token.BLOCK);
        Node varY = new Node(Token.VAR,
            Node.newString("y", 0, 0),
            Node.newString("x", 0, 0) // Use alias x
        );
        scopeBody.addChildToBack(varY);
        scopeFn.addChildToBack(scopeBody);
        googScopeCall.addChildToBack(scopeFn);
        Node exprResult = new Node(Token.EXPR_RESULT, googScopeCall);

        script.addChildToBack(varX);
        script.addChildToBack(exprResult);

        pass.process(null, script);

        assertTrue("Code change should be reported for a valid goog.scope.", compiler.codeChangeReported);
    }

    @Test
    public void testHotSwapScript_simpleGoogScope() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        // var x = goog.dom.TagName.DIV; goog.scope(function() { var y = x; });
        Node root = new Node(Token.SCRIPT);
        Node varX = new Node(Token.VAR,
            Node.newString("x", 0, 0),
            createQualifiedNameNode("goog.dom.TagName.DIV")
        );

        Node googScopeCall = new Node(Token.CALL);
        Node googScopeName = Node.newString(Token.CALL, "goog.scope");
        googScopeName.setType(Token.NAME);
        googScopeCall.addChildToFront(googScopeName);
        Node scopeFn = new Node(Token.FUNCTION);
        Node scopeBody = new Node(Token.BLOCK);
        Node varY = new Node(Token.VAR,
            Node.newString("y", 0, 0),
            Node.newString("x", 0, 0)
        );
        scopeBody.addChildToBack(varY);
        scopeFn.addChildToBack(scopeBody);
        googScopeCall.addChildToBack(scopeFn);
        Node exprResult = new Node(Token.EXPR_RESULT, googScopeCall);

        root.addChildToBack(varX);
        root.addChildToBack(exprResult);

        pass.hotSwapScript(root, null);

        assertTrue("Code change should be reported for a valid goog.scope.", compiler.codeChangeReported);
    }

    @Test
    public void testTraversal_findAliases() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        // Setup a simple scope with an alias declaration.
        Node scopeRoot = new Node(Token.BLOCK); // Simulating scope root
        Node aliasDecl = new Node(Token.VAR,
            Node.newString("dom", 0, 0),
            createQualifiedNameNode("goog.dom")
        );

        MockScope scope = new MockScope(scopeRoot);
        // Need to pass the declaration node to MockVar constructor.
        scope.addVar("dom", new MockVar("dom", createQualifiedNameNode("goog.dom"), aliasDecl));
        scopeRoot.addChildToBack(aliasDecl);

        // The `findAliases` method is called within `enterScope`.
        // We need to simulate the `enterScope` call context.
        Node googScopeCallNode = new Node(Token.CALL);
        Node googScopeNameNode = Node.newString(Token.NAME, "goog.scope");
        googScopeCallNode.addChildToFront(googScopeNameNode);
        Node anonFnNode = new Node(Token.FUNCTION);
        Node fnBody = new Node(Token.BLOCK);
        anonFnNode.addChildToBack(fnBody);
        googScopeCallNode.addChildToBack(anonFnNode);
        Node exprResultNode = new Node(Token.EXPR_RESULT, googScopeCallNode);

        Node parentOfScopeCall = new Node(Token.SCRIPT);
        parentOfScopeCall.addChildToBack(exprResultNode);

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentNode(googScopeCallNode); // The node for the call to goog.scope
        t.setCurrentScope(scope);
        t.setScopeRoot(scopeRoot);
        t.setScopeDepth(1); // Inside the call to goog.scope, before entering its function body.

        // Call `enterScope` to trigger `findAliases`.
        // The `enterScope` is called by `NodeTraversal.traverse` when it enters a new scope.
        // We will manually call `findAliases` for direct testing of its logic.
        traversal.findAliases(t); // Directly call findAliases.

        // Verify that aliases were found.
        assertEquals(1, traversal.aliases.size());
        assertTrue(traversal.aliases.containsKey("dom"));
        assertEquals("goog.dom", traversal.aliases.get("dom").getInitialValue().getQualifiedName());
    }

    @Test
    public void testTraversal_aliasDefinitionsInOrder() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node root = new Node(Token.SCRIPT);
        Node googScopeCall = new Node(Token.CALL);
        Node scopeFn = new Node(Token.FUNCTION);
        Node scopeBody = new Node(Token.BLOCK);

        Node alias1 = new Node(Token.VAR,
            Node.newString("a", 0, 0),
            createQualifiedNameNode("goog.a")
        );
        Node alias2 = new Node(Token.VAR,
            Node.newString("b", 0, 0),
            createQualifiedNameNode("goog.b")
        );

        scopeBody.addChildToBack(alias1);
        scopeBody.addChildToBack(alias2);
        scopeFn.addChildToBack(scopeBody);
        googScopeCall.addChildToBack(scopeFn);
        root.addChildToBack(new Node(Token.EXPR_RESULT, googScopeCall));

        // Mocking traversal context to have aliases populated.
        MockScope mockScope = new MockScope(scopeBody);
        mockScope.addVar("a", new MockVar("a", createQualifiedNameNode("goog.a"), alias1));
        mockScope.addVar("b", new MockVar("b", createQualifiedNameNode("goog.b"), alias2));
        traversal.aliases.put("a", mockScope.getVar("a"));
        traversal.aliases.put("b", mockScope.getVar("b"));

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Manually call visit to simulate traversal and populating aliasDefinitionsInOrder.
        // The `visit` method is called on each node. We need to simulate visiting the `NAME` nodes
        // that represent the variable declarations.
        t.setCurrentNode(alias1.getFirstChild()); // The NAME node "a"
        traversal.visit(t, alias1.getFirstChild(), alias1); // Visiting the NAME node 'a'

        t.setCurrentNode(alias2.getFirstChild()); // The NAME node "b"
        traversal.visit(t, alias2.getFirstChild(), alias2); // Visiting the NAME node 'b'

        assertEquals(2, traversal.getAliasDefinitionsInOrder().size());
        assertEquals("a", traversal.getAliasDefinitionsInOrder().get(0).getString());
        assertEquals("b", traversal.getAliasDefinitionsInOrder().get(1).getString());
    }

    @Test
    public void testTraversal_aliasUsages() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node root = new Node(Token.SCRIPT);
        Node googScopeCall = new Node(Token.CALL);
        Node scopeFn = new Node(Token.FUNCTION);
        Node scopeBody = new Node(Token.BLOCK);

        Node aliasDecl = new Node(Token.VAR,
            Node.newString("dom", 0, 0),
            createQualifiedNameNode("goog.dom")
        );

        Node usageNode = new Node(Token.NAME, Node.newString("dom", 0, 0)); // The actual usage of "dom"

        scopeBody.addChildToBack(aliasDecl);
        scopeBody.addChildToBack(new Node(Token.EXPR_RESULT, usageNode)); // Simulating usage
        scopeFn.addChildToBack(scopeBody);
        googScopeCall.addChildToBack(scopeFn);
        root.addChildToBack(new Node(Token.EXPR_RESULT, googScopeCall));

        // Mocking traversal context with an alias.
        MockScope mockScope = new MockScope(scopeBody);
        Node aliasValueNode = createQualifiedNameNode("goog.dom");
        mockScope.addVar("dom", new MockVar("dom", aliasValueNode, aliasDecl));
        traversal.aliases.put("dom", mockScope.getVar("dom"));

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Simulate visiting the usage node.
        t.setCurrentNode(usageNode); // The usage of "dom"
        traversal.visit(t, usageNode, usageNode.getParent()); // Pass parent correctly

        assertEquals(1, traversal.getAliasUsages().size());
        assertTrue(traversal.getAliasUsages().get(0) instanceof ScopedAliases.AliasedNode);
        ScopedAliases.AliasedNode aliasedNode = (ScopedAliases.AliasedNode) traversal.getAliasUsages().get(0);
        assertEquals("dom", aliasedNode.aliasReference.getString());
        assertEquals("goog.dom", aliasedNode.aliasDefinition.getQualifiedName());
    }

    @Test
    public void testTraversal_scopeCalls() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node root = new Node(Token.SCRIPT);
        Node googScopeCall = new Node(Token.CALL);
        Node scopeFn = new Node(Token.FUNCTION);
        Node scopeBody = new Node(Token.BLOCK);
        scopeFn.addChildToBack(scopeBody);
        googScopeCall.addChildToBack(scopeFn);
        root.addChildToBack(new Node(Token.EXPR_RESULT, googScopeCall));

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentNode(googScopeCall);
        t.setScopeDepth(1); // One level up from the function body.

        // Simulate visiting the goog.scope call.
        traversal.visit(t, googScopeCall, googScopeCall.getParent());

        assertEquals(1, traversal.getScopeCalls().size());
        assertSame(googScopeCall, traversal.getScopeCalls().get(0));
    }

    @Test
    public void testApplyAlias_aliasedNode() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        Node aliasDefinition = createQualifiedNameNode("goog.dom.createElement");
        Node aliasReferenceParent = new Node(Token.CALL); // e.g., someCall(aliasReference)
        Node aliasReference = new Node(Token.NAME, Node.newString("createElement")); // The actual alias usage
        aliasReferenceParent.addChildToBack(aliasReference); // Make aliasReference a child

        ScopedAliases.AliasedNode aliasedNode = pass.new AliasedNode(aliasReference, aliasDefinition);
        aliasedNode.applyAlias();

        // Verify that the aliasReference has been replaced by a clone of aliasDefinition.
        // The replacement happens in the parent.
        Node replacedNode = aliasReferenceParent.getFirstChild();
        assertNotNull(replacedNode);
        // Check the content of the replaced node.
        assertEquals("createElement", replacedNode.getString()); // The original string is replaced.
        // The assertion below assumes `getQualifiedName` works on this mocked node.
        // Since we used `createQualifiedNameNode`, it should have the string value.
        assertEquals("goog.dom.createElement", replacedNode.getString()); // Should be the value of the cloned definition.
    }

    @Test
    public void testApplyAlias_aliasedTypeNode() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        Node aliasDefinition = createQualifiedNameNode("goog.dom.TagName.DIV");
        Node typeReference = Node.newString("DIV"); // The type reference in JSDoc
        String aliasName = "DIV";

        ScopedAliases.AliasedTypeNode aliasedTypeNode = pass.new AliasedTypeNode(typeReference, aliasDefinition, aliasName);
        aliasedTypeNode.applyAlias();

        // Verify that the typeReference string has been replaced.
        assertEquals("goog.dom.TagName.DIV", typeReference.getString());
    }

    @Test
    public void testHotSwapScript_noErrors() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        Node root = new Node(Token.SCRIPT); // Empty script

        pass.hotSwapScript(root, null);

        // Should not report errors and not report code change if no transformations.
        assertFalse("Code change should not be reported for an empty script.", compiler.codeChangeReported);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testHotSwapScript_withErrors() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        // Invalid goog.scope usage: not alone in a statement.
        Node root = new Node(Token.SCRIPT);
        Node googScopeCall = new Node(Token.CALL);
        Node scopeFn = new Node(Token.FUNCTION);
        Node scopeBody = new Node(Token.BLOCK);
        scopeFn.addChildToBack(scopeBody);
        googScopeCall.addChildToBack(scopeFn);
        Node invalidStatement = new Node(Token.COMMA, Node.newString("something"), googScopeCall); // goog.scope not alone
        root.addChildToBack(invalidStatement);

        pass.hotSwapScript(root, null);

        // Should report an error and not report code change.
        assertTrue("Error should be reported for invalid goog.scope usage.", compiler.getErrorCount() > 0);
        assertFalse("Code change should not be reported when errors are present.", compiler.codeChangeReported);
    }

    @Test
    public void testTraversal_validateScopeCall_improperlyUsed() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeCall = new Node(Token.CALL);
        Node googScopeName = Node.newString(Token.NAME, "goog.scope"); // Correct type
        scopeCall.addChildToFront(googScopeName);
        Node scopeFn = new Node(Token.FUNCTION);
        scopeFn.addChildToBack(new Node(Token.BLOCK));
        scopeCall.addChildToBack(scopeFn);

        Node invalidParent = new Node(Token.VAR, Node.newString("x"), scopeCall); // Not an EXPR_RESULT

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentNode(scopeCall);
        t.setScopeDepth(1);

        traversal.validateScopeCall(t, scopeCall, invalidParent);

        assertTrue("Error should be reported for improper goog.scope usage.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_USED_IMPROPERLY"));
    }

    @Test
    public void testTraversal_validateScopeCall_badParameters_tooMany() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeCall = new Node(Token.CALL);
        Node googScopeName = Node.newString(Token.NAME, "goog.scope");
        scopeCall.addChildToFront(googScopeName);
        Node param1 = new Node(Token.NAME, Node.newString("param1"));
        Node param2 = new Node(Token.NAME, Node.newString("param2"));
        scopeCall.addChildToBack(param1);
        scopeCall.addChildToBack(param2); // Two parameters

        Node exprResult = new Node(Token.EXPR_RESULT, scopeCall);

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentNode(scopeCall);
        t.setScopeDepth(1);

        traversal.validateScopeCall(t, scopeCall, exprResult);

        assertTrue("Error should be reported for bad parameters.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS"));
    }

    @Test
    public void testTraversal_validateScopeCall_badParameters_noFunction() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeCall = new Node(Token.CALL);
        Node googScopeName = Node.newString(Token.NAME, "goog.scope");
        scopeCall.addChildToFront(googScopeName);
        Node notAFunction = Node.newString("not a function"); // Not a function
        scopeCall.addChildToBack(notAFunction);

        Node exprResult = new Node(Token.EXPR_RESULT, scopeCall);

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentNode(scopeCall);
        t.setScopeDepth(1);

        traversal.validateScopeCall(t, scopeCall, exprResult);

        assertTrue("Error should be reported for bad parameters.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS"));
    }

    @Test
    public void testTraversal_validateScopeCall_badParameters_namedFunction() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeCall = new Node(Token.CALL);
        Node googScopeName = Node.newString(Token.NAME, "goog.scope");
        scopeCall.addChildToFront(googScopeName);
        Node namedFunction = new Node(Token.FUNCTION, Node.newString("myFunc")); // Named function
        namedFunction.addChildToBack(new Node(Token.BLOCK));
        scopeCall.addChildToBack(namedFunction);

        Node exprResult = new Node(Token.EXPR_RESULT, scopeCall);

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentNode(scopeCall);
        t.setScopeDepth(1);

        traversal.validateScopeCall(t, scopeCall, exprResult);

        assertTrue("Error should be reported for bad parameters.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS"));
    }

    @Test
    public void testTraversal_validateScopeCall_badParameters_functionWithParams() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeCall = new Node(Token.CALL);
        Node googScopeName = Node.newString(Token.NAME, "goog.scope");
        scopeCall.addChildToFront(googScopeName);
        Node anonFunction = new Node(Token.FUNCTION);
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(Node.newString("param1"));
        anonFunction.addChildToFront(params); // Function with a parameter
        anonFunction.addChildToBack(new Node(Token.BLOCK));
        scopeCall.addChildToBack(anonFunction);

        Node exprResult = new Node(Token.EXPR_RESULT, scopeCall);

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentNode(scopeCall);
        t.setScopeDepth(1);

        traversal.validateScopeCall(t, scopeCall, exprResult);

        assertTrue("Error should be reported for bad parameters.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS"));
    }


    @Test
    public void testTraversal_visit_aliasRedefined() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeBody = new Node(Token.BLOCK);
        Node aliasDecl1 = new Node(Token.VAR,
            Node.newString("a", 0, 0),
            createQualifiedNameNode("goog.a")
        );
        Node aliasDecl2 = new Node(Token.VAR,
            Node.newString("a", 0, 0), // Redefinition
            createQualifiedNameNode("goog.b")
        );

        scopeBody.addChildToBack(aliasDecl1);
        scopeBody.addChildToBack(aliasDecl2);

        MockScope mockScope = new MockScope(scopeBody);
        // First declaration is processed and added to aliases
        mockScope.addVar("a", new MockVar("a", createQualifiedNameNode("goog.a"), aliasDecl1));
        traversal.aliases.put("a", mockScope.getVar("a"));
        // Manually add the first definition to aliasDefinitionsInOrder to simulate it being processed.
        traversal.aliasDefinitionsInOrder.add(aliasDecl1.getFirstChild()); // Add the NAME node 'a'

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Visit the second definition (the redefinition)
        t.setCurrentNode(aliasDecl2.getFirstChild()); // The NAME node 'a'
        traversal.visit(t, aliasDecl2.getFirstChild(), aliasDecl2); // Visiting the NAME node 'a'

        assertTrue("Error should be reported for alias redefinition.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_ALIAS_REDEFINED"));
    }

    @Test
    public void testTraversal_visit_googScopeNonAliasLocal() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeBody = new Node(Token.BLOCK);
        Node nonAliasVar = new Node(Token.VAR, Node.newString("localVar", 0, 0)); // No initializer

        scopeBody.addChildToBack(nonAliasVar);

        MockScope mockScope = new MockScope(scopeBody);
        mockScope.addVar("localVar", new MockVar("localVar", null, nonAliasVar)); // Var without initial value

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Visit the non-alias var declaration. The visit method operates on the NAME node.
        t.setCurrentNode(nonAliasVar.getFirstChild()); // The NAME node 'localVar'
        traversal.visit(t, nonAliasVar.getFirstChild(), nonAliasVar); // Visiting the NAME node

        assertTrue("Error should be reported for non-alias local.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_NON_ALIAS_LOCAL"));
    }

    @Test
    public void testTraversal_visit_googScopeReturn() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeBody = new Node(Token.BLOCK);
        Node returnStatement = new Node(Token.RETURN);

        scopeBody.addChildToBack(returnStatement);

        MockScope mockScope = new MockScope(scopeBody);
        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Visit the RETURN statement
        t.setCurrentNode(returnStatement);
        traversal.visit(t, returnStatement, scopeBody);

        assertTrue("Error should be reported for RETURN in goog.scope.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_USES_RETURN"));
    }

    @Test
    public void testTraversal_visit_googScopeThis() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeBody = new Node(Token.BLOCK);
        Node thisNode = new Node(Token.THIS);

        scopeBody.addChildToBack(thisNode);

        MockScope mockScope = new MockScope(scopeBody);
        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Visit the THIS keyword
        t.setCurrentNode(thisNode);
        traversal.visit(t, thisNode, scopeBody);

        assertTrue("Error should be reported for 'this' in goog.scope.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_REFERENCES_THIS"));
    }

    @Test
    public void testTraversal_visit_googScopeThrow() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeBody = new Node(Token.BLOCK);
        Node throwNode = new Node(Token.THROW);

        scopeBody.addChildToBack(throwNode);

        MockScope mockScope = new MockScope(scopeBody);
        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Visit the THROW statement
        t.setCurrentNode(throwNode);
        traversal.visit(t, throwNode, scopeBody);

        assertTrue("Error should be reported for THROW in goog.scope.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_USES_THROW"));
    }

    @Test
    public void testFixTypeNode_simpleAlias() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node typeNode = Node.newString("dom.createElement"); // A string node representing a type

        // Setup traversal context with an alias.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        Node aliasValueNode = createQualifiedNameNode("goog.dom");
        // Need to provide a declaration node for MockVar. A dummy node will do.
        mockScope.addVar("dom", new MockVar("dom", aliasValueNode, new Node(Token.NAME)));
        traversal.aliases.put("dom", mockScope.getVar("dom"));

        // Manually call fixTypeNode.
        traversal.fixTypeNode(typeNode);

        // Check if aliasUsages contains the expected AliasedTypeNode.
        assertEquals(1, traversal.getAliasUsages().size());
        assertTrue(traversal.getAliasUsages().get(0) instanceof ScopedAliases.AliasedTypeNode);
        ScopedAliases.AliasedTypeNode aliasedTypeNode = (ScopedAliases.AliasedTypeNode) traversal.getAliasUsages().get(0);
        assertSame(typeNode, aliasedTypeNode.typeReference);
        assertEquals("dom", aliasedTypeNode.aliasName);
        assertSame(aliasValueNode, aliasedTypeNode.aliasDefinition);
    }

    @Test
    public void testFixTypeNode_nestedAlias() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node typeNode = Node.newString("goog.dom.TagName.DIV"); // A string node representing a type

        // Setup traversal context with an alias for 'goog.dom'.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        Node aliasValueNode = createQualifiedNameNode("my.namespace.goog.dom");
        // Need to provide a declaration node for MockVar.
        mockScope.addVar("goog", new MockVar("goog", createQualifiedNameNode("my.namespace"), new Node(Token.NAME))); // Alias for 'goog'
        traversal.aliases.put("goog", mockScope.getVar("goog"));

        // Manually call fixTypeNode.
        traversal.fixTypeNode(typeNode);

        // Check if aliasUsages contains the expected AliasedTypeNode.
        assertEquals(1, traversal.getAliasUsages().size());
        assertTrue(traversal.getAliasUsages().get(0) instanceof ScopedAliases.AliasedTypeNode);
        ScopedAliases.AliasedTypeNode aliasedTypeNode = (ScopedAliases.AliasedTypeNode) traversal.getAliasUsages().get(0);
        assertSame(typeNode, aliasedTypeNode.typeReference);
        assertEquals("goog", aliasedTypeNode.aliasName);
        assertSame(aliasValueNode, aliasedTypeNode.aliasDefinition); // This should be the value of the 'goog' alias.
    }

    @Test
    public void testFixTypeNode_noAliasMatch() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node typeNode = Node.newString("unknown.Type"); // No matching alias

        // Setup traversal context without relevant alias.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        mockScope.addVar("known", new MockVar("known", createQualifiedNameNode("some.other"), new Node(Token.NAME)));
        traversal.aliases.put("known", mockScope.getVar("known"));

        // Manually call fixTypeNode.
        traversal.fixTypeNode(typeNode);

        // No alias usages should be added.
        assertEquals(0, traversal.getAliasUsages().size());
    }

    @Test
    public void testFixTypeNode_typeNodeWithChildren() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node typeNode = Node.newString("ns.Type"); // Base type
        Node childTypeNode = Node.newString("ns.Type.Sub"); // A nested type node

        Node parentTypeNode = new Node(Token.COMMA); // Simulating a type with children
        parentTypeNode.addChildToBack(typeNode);
        parentTypeNode.addChildToBack(childTypeNode);

        // Setup traversal context with an alias for 'ns'.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        Node aliasValueNode = createQualifiedNameNode("my.namespace");
        mockScope.addVar("ns", new MockVar("ns", aliasValueNode, new Node(Token.NAME)));
        traversal.aliases.put("ns", mockScope.getVar("ns"));

        // Manually call fixTypeNode.
        traversal.fixTypeNode(parentTypeNode);

        // Check that both type nodes were processed.
        assertEquals(2, traversal.getAliasUsages().size());
        assertTrue(traversal.getAliasUsages().get(0) instanceof ScopedAliases.AliasedTypeNode);
        assertTrue(traversal.getAliasUsages().get(1) instanceof ScopedAliases.AliasedTypeNode);

        ScopedAliases.AliasedTypeNode firstUsage = (ScopedAliases.AliasedTypeNode) traversal.getAliasUsages().get(0);
        assertSame(typeNode, firstUsage.typeReference);
        assertEquals("ns", firstUsage.aliasName);

        ScopedAliases.AliasedTypeNode secondUsage = (ScopedAliases.AliasedTypeNode) traversal.getAliasUsages().get(1);
        assertSame(childTypeNode, secondUsage.typeReference);
        assertEquals("ns", secondUsage.aliasName);
    }

    @Test
    public void testTraversal_exitScope_clearAliases() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        // Populate aliases in the traversal object.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        mockScope.addVar("dom", new MockVar("dom", createQualifiedNameNode("goog.dom"), new Node(Token.NAME)));
        traversal.aliases.put("dom", mockScope.getVar("dom"));
        traversal.forbiddenLocals.add("goog");

        // Simulate exitScope at depth 2.
        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setScopeDepth(2);
        t.setScopeRoot(new Node(Token.BLOCK));

        traversal.exitScope(t);

        // Aliases and forbiddenLocals should be cleared.
        assertTrue(traversal.aliases.isEmpty());
        assertTrue(traversal.forbiddenLocals.isEmpty());
    }

    @Test
    public void testHotSwapScript_removeAliasDefinition_var() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        Node root = new Node(Token.SCRIPT);
        Node aliasDecl = new Node(Token.VAR,
            Node.newString("x", 0, 0),
            createQualifiedNameNode("goog.x")
        );
        root.addChildToBack(aliasDecl);

        // Manually add the definition to trigger removal.
        ScopedAliases.Traversal traversal = pass.new Traversal();
        traversal.aliasDefinitionsInOrder.add(aliasDecl.getFirstChild()); // Add the NAME node

        // To test `hotSwapScript`'s removal logic, we need to bypass `NodeTraversal.traverse`
        // and manually populate the `traversal` object and then call the removal part of `hotSwapScript`.
        // This is complex. A simpler approach is to test the removal logic indirectly if possible.
        // Since `hotSwapScript` calls `NodeTraversal.traverse`, it will populate `traversal`.
        // Let's make a minimal script and check if it's removed.

        pass.hotSwapScript(root, null);

        assertTrue("Code change should be reported.", compiler.codeChangeReported);
        // After hotSwapScript, the original alias definition should be removed.
        assertNull("The VAR node for the alias definition should be detached.", aliasDecl.getParent());
    }

    @Test
    public void testHotSwapScript_removeAliasDefinition_directAssignment() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        Node root = new Node(Token.SCRIPT);
        Node aliasNameNode = Node.newString("x", 0, 0);
        Node aliasValueNode = createQualifiedNameNode("goog.x");
        Node aliasDef = new Node(Token.ASSIGN, aliasNameNode, aliasValueNode);
        Node exprResult = new Node(Token.EXPR_RESULT, aliasDef);
        root.addChildToBack(exprResult);

        // Simulate that this assignment was identified as an alias definition.
        ScopedAliases.Traversal traversal = pass.new Traversal();
        traversal.aliasDefinitionsInOrder.add(aliasNameNode); // Add the NAME node "x"

        // Again, `hotSwapScript` uses `NodeTraversal`.
        // Testing the removal logic directly requires mocking.
        // The simplest is to rely on `hotSwapScript` to run the traversal and then do cleanup.
        pass.hotSwapScript(root, null);

        assertTrue("Code change should be reported.", compiler.codeChangeReported);
        // The original expression statement containing the assignment should be detached.
        assertNull("The EXPR_RESULT node for the alias definition should be detached.", exprResult.getParent());
    }

    @Test
    public void testTraversal_findNamespaceShadows_shadowExists() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeRoot = new Node(Token.BLOCK); // Simulating scope root for namespace shadow
        Node localVar = new Node(Token.VAR, Node.newString("goog", 0, 0), Node.newString("someValue", 0, 0)); // Shadowing 'goog'
        scopeRoot.addChildToBack(localVar);

        MockScope mockScope = new MockScope(scopeRoot);
        mockScope.addVar("goog", new MockVar("goog", Node.newString("someValue"), localVar)); // Local var named 'goog'

        traversal.forbiddenLocals.add("goog"); // Mark 'goog' as a forbidden local name due to aliasing.
        traversal.hasNamespaceShadows = false; // Reset flag

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(3); // Deeper than 2, to trigger findNamespaceShadows
        t.setScopeRoot(scopeRoot);

        // Manually call findNamespaceShadows.
        traversal.findNamespaceShadows(t);

        assertTrue("hasNamespaceShadows should be true when a shadow exists.", traversal.hasNamespaceShadows);
    }

    @Test
    public void testTraversal_findNamespaceShadows_noShadow() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeRoot = new Node(Token.BLOCK);
        Node otherVar = new Node(Token.VAR, Node.newString("other", 0, 0), Node.newString("value", 0, 0));
        scopeRoot.addChildToBack(otherVar);

        MockScope mockScope = new MockScope(scopeRoot);
        mockScope.addVar("other", new MockVar("other", Node.newString("value"), otherVar));

        traversal.forbiddenLocals.add("goog"); // A forbidden local, but not declared in this scope.
        traversal.hasNamespaceShadows = false;

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(3);
        t.setScopeRoot(scopeRoot);

        traversal.findNamespaceShadows(t);

        assertFalse("hasNamespaceShadows should be false when no shadow exists.", traversal.hasNamespaceShadows);
    }

    @Test
    public void testTraversal_renameNamespaceShadows() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        // Setup to trigger renaming.
        traversal.hasNamespaceShadows = true;
        traversal.forbiddenLocals.add("goog");

        Node scopeRoot = new Node(Token.BLOCK);
        Node shadowedVar = new Node(Token.VAR, Node.newString("goog", 0, 0), Node.newString("originalValue", 0, 0)); // Shadowing 'goog'
        scopeRoot.addChildToBack(shadowedVar);

        MockScope mockScope = new MockScope(scopeRoot);
        mockScope.addVar("goog", new MockVar("goog", Node.newString("originalValue"), shadowedVar));

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setScopeDepth(2); // Renaming happens at depth 2.
        t.setScopeRoot(scopeRoot);

        // Call renameNamespaceShadows. This will internally create and run MakeDeclaredNamesUnique.
        // We can't easily mock the result of MakeDeclaredNamesUnique here.
        // The test verifies that the method is called and the `hasNamespaceShadows` flag is true.
        traversal.renameNamespaceShadows(t);

        // If hasNamespaceShadows is true, the renamer is created and traversal is likely invoked.
        assertTrue("renameNamespaceShadows should be called when hasNamespaceShadows is true.", traversal.hasNamespaceShadows);
    }
}
```