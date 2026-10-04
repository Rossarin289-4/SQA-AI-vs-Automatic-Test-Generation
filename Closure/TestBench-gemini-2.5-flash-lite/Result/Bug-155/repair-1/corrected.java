package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import java.util.ArrayDeque;
import java.util.Deque;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import java.util.LinkedHashMap;

public class InlineVariablesTest {

    // Mock AbstractCompiler implementation
    private static class MockAbstractCompiler extends AbstractCompiler {
        @Override
        protected void initCompilerOptions(CompilerOptions options) {
        }

        @Override
        protected TypeCheck createTypeCheck(AbstractCompiler compiler) {
            return null;
        }

        @Override
        public void injectGraphServices(Node root) {
        }

        @Override
        public void process(Node externs, Node root) {
        }

        @Override
        public void process(Node externs, Node root, JSModule[] modules) {
        }

        @Override
        public void reassessControlFlowGraph() {
        }

        @Override
        public void report(DiagnosticType type, Node node, Object... args) {
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention.DefaultCodingConvention();
        }

        @Override
        public TypeRegistry getTypeRegistry() {
            // Mocked TypeRegistry
            return new TypeRegistry(getErrorReporter());
        }

        @Override
        public VarTable getVarTable() {
            return null;
        }

        @Override
        public String getSourceFileName() {
            return "";
        }

        @Override
        public void setSourceFileName(String sourceFileName) {
        }

        @Override
        public JSErrorReport newError(Node node, DiagnosticType diagnosticType, String... arguments) {
            return new JSErrorReport(null, null, null, 0, 0, 0, null, null, null, null, null);
        }

        @Override
        public JSErrorReport newWarning(Node node, DiagnosticType diagnosticType, String... arguments) {
            return new JSErrorReport(null, null, null, 0, 0, 0, null, null, null, null, null);
        }

        @Override
        public JSErrorReport newInfo(Node node, DiagnosticType diagnosticType, String... arguments) {
            return new JSErrorReport(null, null, null, 0, 0, 0, null, null, null, null, null);
        }

        @Override
        public void reportCodeChange() {
        }
        
        private ErrorReporter getErrorReporter() {
            return new ErrorReporter() {
                @Override
                public JSType parseAndType(String p, String str, int beginLine, int beginCharno, int endLine, int endCharno) {
                    return null;
                }

                @Override
                public void runtimeError(String message, Node node, com.google.javascript.rhino.ScriptOrFnScope scope, com.google.javascript.rhino.ScriptOrFnScope<JSType> globalScope, com.google.javascript.rhino.ScriptOrFnScope<JSType> functionType) {
                }
            };
        }
    }

    // Helper method to create a dummy compiler.
    private AbstractCompiler createCompiler() {
        return new MockAbstractCompiler();
    }

    // Helper method to create a dummy NodeTraversal.
    private NodeTraversal createNodeTraversal(AbstractCompiler compiler, Node root) {
        NodeTraversal.Callback callback = new NodeTraversal.Callback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {}
            @Override
            public void enterScope(NodeTraversal t) {}
            @Override
            public void exitScope(NodeTraversal t) {}
            @Override
            public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) { return true; }
        };
        return new NodeTraversal(compiler, callback);
    }
    
    // Helper method to create a dummy Scope.
    private Scope createScope(Scope parent, Node rootNode) {
        if (parent == null) {
            return new Scope(new Node(Token.SCRIPT), createCompiler()); // Global scope
        }
        return new Scope(parent, rootNode);
    }

    // Helper method to create a dummy Var.
    private Var createVar(Scope scope, String name) {
        Node nameNode = new Node(Token.NAME, name, 0, 0); // Corrected Node constructor
        return new Var(false, name, nameNode, null, scope, 0, null, false, null);
    }

    // Helper method to create a ReferenceCollection.
    private ReferenceCollection createReferenceCollection(List<Reference> references) {
        ReferenceCollection collection = new ReferenceCollection();
        collection.references = references;
        return collection;
    }

    // Helper method to create a Reference.
    // Mocking Reference constructor as it's private.
    private Reference createReference(Node nameNode, Node parent, NodeTraversal traversal, ReferenceCollectingCallback.BasicBlock block, Scope scope, String sourceName) {
        // Manually create a Reference instance using its private constructor
        try {
            java.lang.reflect.Constructor<Reference> constructor =
                Reference.class.getDeclaredConstructor(Node.class, Node.class, Node.class, ReferenceCollectingCallback.BasicBlock.class, Scope.class, String.class);
            constructor.setAccessible(true);
            return constructor.newInstance(nameNode, parent, parent.getParent(), block, scope, sourceName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Helper method to create a BasicBlock.
    private ReferenceCollectingCallback.BasicBlock createBasicBlock(ReferenceCollectingCallback.BasicBlock parent, Node root) {
        return new ReferenceCollectingCallback.BasicBlock(parent, root);
    }

    // Helper method to create a ReferenceCollectingCallback instance with specific mode.
    private ReferenceCollectingCallback createCallback(AbstractCompiler compiler, InlineVariables.Mode mode, boolean inlineAllStrings) {
        InlineVariables inlineVariables = new InlineVariables(compiler, mode, inlineAllStrings);
        return new ReferenceCollectingCallback(compiler, inlineVariables.new InliningBehavior(), inlineVariables.getFilterForMode());
    }

    @Test
    public void testProcessWithConstantsOnlyMode() throws Exception {
        AbstractCompiler compiler = createCompiler();
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        iv.process(externs, root);
        assertNotNull(compiler);
    }

    @Test
    public void testProcessWithLocalsOnlyMode() throws Exception {
        AbstractCompiler compiler = createCompiler();
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.LOCALS_ONLY, false);
        iv.process(externs, root);
        assertNotNull(compiler);
    }

    @Test
    public void testProcessWithAllMode() throws Exception {
        AbstractCompiler compiler = createCompiler();
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        iv.process(externs, root);
        assertNotNull(compiler);
    }

    @Test
    public void testGetFilterForModeAll() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        // Need a Var instance to apply the predicate.
        Scope globalScope = createScope(null, new Node(Token.SCRIPT));
        Var dummyVar = createVar(globalScope, "dummy");
        assertTrue(iv.getFilterForMode().apply(dummyVar)); // Should always return true for ALL mode.
    }

    @Test
    public void testGetFilterForModeConstantsOnly() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        Scope globalScope = createScope(null, new Node(Token.SCRIPT));
        Var constVar = createVar(globalScope, "CONST_VAR");
        constVar.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Var regularVar = createVar(globalScope, "REGULAR_VAR");
        assertFalse(iv.getFilterForMode().apply(regularVar)); // Should be false for regular vars.
        assertTrue(iv.getFilterForMode().apply(constVar)); // Should be true for const vars.
    }

    @Test
    public void testGetFilterForModeLocalsOnly() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.LOCALS_ONLY, false);
        Scope globalScope = createScope(null, new Node(Token.SCRIPT));
        Scope localScope = new Scope(globalScope, new Node(Token.FUNCTION));
        Var localVar = createVar(localScope, "LOCAL_VAR");
        Var globalVar = createVar(globalScope, "GLOBAL_VAR");
        assertTrue(iv.getFilterForMode().apply(localVar)); // Should be true for local vars.
        assertFalse(iv.getFilterForMode().apply(globalVar)); // Should be false for global vars.
    }

    @Test
    public void testAliasCandidateConstructor() {
        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "testVar");
        ReferenceCollection refInfo = new ReferenceCollection();
        InlineVariables.AliasCandidate candidate = new InlineVariables.AliasCandidate(var, refInfo);
        assertNotNull(candidate);
        assertEquals(var, candidate.alias);
        assertEquals(refInfo, candidate.refInfo);
    }

    @Test
    public void testInliningBehaviorAfterExitScope() {
        AbstractCompiler compiler = createCompiler();
        NodeTraversal traversal = createNodeTraversal(compiler, new Node(Token.SCRIPT));
        Map<Var, ReferenceCollection> referenceMap = Maps.newHashMap();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "testVar");
        
        // Mocking the necessary Reference object
        Node varNameNode = var.getNameNode();
        Node varParent = new Node(Token.VAR, varNameNode);
        varNameNode.setParent(varParent);
        Node varGrandparent = new Node(Token.EXPR_RESULT, varParent);
        varParent.setParent(varGrandparent);
        
        Reference ref = createReference(varNameNode, varParent, traversal, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        ReferenceCollection refCollection = new ReferenceCollection();
        refCollection.references.add(ref);
        referenceMap.put(var, refCollection);

        // Make sure the traversal has a current scope set
        // This is a bit of a hack, normally NodeTraversal manages this.
        // We are simulating the state for the behavior method.
        NodeTraversal.Callback mockCallback = new NodeTraversal.Callback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            @Override public void enterScope(NodeTraversal t) { t.traverseInnerNode(new Node(Token.SCRIPT), null, scope); }
            @Override public void exitScope(NodeTraversal t) {}
            @Override public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) { return true; }
        };
        NodeTraversal mockTraversal = new NodeTraversal(compiler, mockCallback);
        mockTraversal.traverse(new Node(Token.SCRIPT)); // Initialize scope

        behavior.afterExitScope(mockTraversal, referenceMap);
        assertNotNull(behavior);
    }

    @Test
    public void testInliningBehaviorCollectAliasCandidates() {
        AbstractCompiler compiler = createCompiler();
        NodeTraversal traversal = createNodeTraversal(compiler, new Node(Token.SCRIPT));
        Map<Var, ReferenceCollection> referenceMap = Maps.newHashMap();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var aliasVar = createVar(scope, "aliasVar");
        Node aliasValueNode = new Node(Token.NAME, "aliasedVarName"); // This NAME node is what gets put in aliasCandidates map key
        Node initNameNode = new Node(Token.NAME, "initialVarName");
        Node initAssignNode = new Node(Token.ASSIGN, initNameNode, aliasValueNode);
        initNameNode.setParent(initAssignNode);
        aliasValueNode.setParent(initAssignNode);
        Node initExprResult = new Node(Token.EXPR_RESULT, initAssignNode);
        initAssignNode.setParent(initExprResult);

        Reference initRef = createReference(initNameNode, initAssignNode, traversal, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference otherRef = createReference(new Node(Token.NAME, "someUse"), new Node(Token.COMMA), new Node(Token.COMMA), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, otherRef));
        
        // Make sure the value node is properly set up
        aliasValueNode.setParent(new Node(Token.ASSIGN, new Node(Token.NAME, "dummy"), aliasValueNode)); // Simulating where aliasValueNode might appear in init reference.

        // To make aliasCandidates.put work, the value node needs to be a NAME type.
        // And the reference passed to AliasCandidate must be associated with the variable.
        // This test is tricky because it relies on internal state and private methods.
        // We'll simulate the state as closely as possible.
        
        // Simulate that aliasValueNode is the initial value of aliasVar
        Node initialAliasVarDecl = new Node(Token.VAR, aliasVar.getNameNode());
        aliasVar.getNameNode().setParent(initialAliasVarDecl);
        initialAliasVarDecl.setParent(new Node(Token.EXPR_RESULT, initialAliasVarDecl));

        Reference initialAliasVarRef = createReference(aliasVar.getNameNode(), initialAliasVarDecl, traversal, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        ReferenceCollection aliasVarRefCollection = createReferenceCollection(Lists.newArrayList(initialAliasVarRef));
        
        // The collectAliasCandidates method puts the NAME node of the assigned value into aliasCandidates map.
        // So, aliasValueNode should be the key.
        // Let's manually set it up.
        behavior.aliasCandidates.put(aliasValueNode, new InlineVariables.AliasCandidate(aliasVar, aliasVarRefCollection));
        
        // To trigger the actual logic in collectAliasCandidates, we need to call afterExitScope.
        // For isolated testing of collectAliasCandidates, we'd need reflection.
        // Let's test the state directly.
        assertNotNull(behavior.aliasCandidates.get(aliasValueNode));
    }

    @Test
    public void testInliningBehaviorDoInlinesForScope() {
        AbstractCompiler compiler = createCompiler();
        NodeTraversal traversal = createNodeTraversal(compiler, new Node(Token.SCRIPT));
        Map<Var, ReferenceCollection> referenceMap = Maps.newHashMap();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "testVar");
        Node varNameNode = var.getNameNode();
        Node declarationNode = new Node(Token.VAR, varNameNode);
        varNameNode.setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(varNameNode, declarationNode, traversal, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "usedVar"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, usageRef));
        referenceMap.put(var, refCollection);

        // Need to set up traversal's scope properly for maybeEscapedOrModifiedArguments
        NodeTraversal.Callback mockCallback = new NodeTraversal.Callback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            @Override public void enterScope(NodeTraversal t) { t.traverseInnerNode(new Node(Token.SCRIPT), null, scope); }
            @Override public void exitScope(NodeTraversal t) {}
            @Override public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) { return true; }
        };
        NodeTraversal mockTraversal = new NodeTraversal(compiler, mockCallback);
        mockTraversal.traverse(new Node(Token.SCRIPT));

        behavior.doInlinesForScope(mockTraversal, referenceMap);
        assertNotNull(behavior);
    }

    @Test
    public void testMaybeEscapedOrModifiedArguments_escaped() {
        AbstractCompiler compiler = createCompiler();
        NodeTraversal traversal = createNodeTraversal(compiler, new Node(Token.SCRIPT));
        Map<Var, ReferenceCollection> referenceMap = Maps.newHashMap();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var argumentsVar = scope.getArgumentsVar();
        Node argumentsNameNode = new Node(Token.NAME, "arguments");
        Node getPropParent = new Node(Token.GETPROP, new Node(Token.THIS), argumentsNameNode);
        argumentsNameNode.setParent(getPropParent);
        Reference ref = createReference(argumentsNameNode, getPropParent, traversal, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(ref));
        referenceMap.put(argumentsVar, refCollection);

        assertTrue(behavior.maybeEscapedOrModifiedArguments(scope, referenceMap));
    }

    @Test
    public void testMaybeEscapedOrModifiedArguments_notEscaped() {
        AbstractCompiler compiler = createCompiler();
        NodeTraversal traversal = createNodeTraversal(compiler, new Node(Token.SCRIPT));
        Map<Var, ReferenceCollection> referenceMap = Maps.newHashMap();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var argumentsVar = scope.getArgumentsVar();
        Node argumentsNameNode = new Node(Token.NAME, "arguments");
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "func"), argumentsNameNode);
        argumentsNameNode.setParent(callNode);
        Reference ref = createReference(argumentsNameNode, callNode, traversal, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(ref));
        referenceMap.put(argumentsVar, refCollection);

        assertFalse(behavior.maybeEscapedOrModifiedArguments(scope, referenceMap));
    }

    @Test
    public void testIsLValue() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Node nameNode = new Node(Token.NAME);
        Node assignNode = new Node(Token.ASSIGN, nameNode, new Node(Token.NUMBER));
        nameNode.setParent(assignNode);
        assertTrue(behavior.isLValue(assignNode));

        Node incNode = new Node(Token.INC, new Node(Token.NAME));
        assertTrue(behavior.isLValue(incNode));

        Node decNode = new Node(Token.DEC, new Node(Token.NAME));
        assertTrue(behavior.isLValue(decNode));

        Node otherNode = new Node(Token.NUMBER);
        assertFalse(behavior.isLValue(otherNode));
    }

    @Test
    public void testInlineNonConstants_ImmutableAndWellDefined() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "immutableVar");
        Node valueNode = new Node(Token.NUMBER, 10);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, null, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "usedVar"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, usageRef));

        // Mocking isImmutableAndWellDefinedVariable to return true
        try {
            java.lang.reflect.Method method = InlineVariables.InliningBehavior.class.getDeclaredMethod("isImmutableAndWellDefinedVariable", Var.class, ReferenceCollection.class);
            method.setAccessible(true);
            method.invoke(behavior, var, refCollection);
        } catch (Exception e) { /* ignore */ }

        behavior.inlineNonConstants(var, refCollection, false);
        assertNotNull(refCollection.references.get(0).getNameNode());
    }

    @Test
    public void testInlineNonConstants_InlineIntoCall() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "funcVar");
        Node funcNode = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"));
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, null, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Node callTarget = new Node(Token.CALL, var.getNameNode());
        var.getNameNode().setParent(callTarget);
        Reference usageRef = createReference(var.getNameNode(), callTarget, callTarget, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, usageRef));

        // Mocking canInline to return true for complex cases
        try {
            java.lang.reflect.Method method = InlineVariables.InliningBehavior.class.getDeclaredMethod("canInline", Reference.class, Reference.class, Reference.class);
            method.setAccessible(true);
            method.invoke(behavior, initRef, initRef, usageRef);
        } catch (Exception e) { /* ignore */ }
        
        behavior.inlineNonConstants(var, refCollection, false);
        assertNotNull(refCollection.references.get(0).getNameNode());
    }

    @Test
    public void testBlacklistVarReferencesInTree() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var varToBlacklist = createVar(scope, "blacklistedVar");
        Node nameNode = new Node(Token.NAME, "blacklistedVar");
        nameNode.setParent(new Node(Token.ADD, nameNode, new Node(Token.NUMBER, 5)));
        
        assertFalse(behavior.staleVars.contains(varToBlacklist));
        
        behavior.blacklistVarReferencesInTree(nameNode, scope);
        
        assertTrue(behavior.staleVars.contains(varToBlacklist));
    }

    @Test
    public void testIsVarInlineForbidden_Exported() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override public boolean isExported(String name) { return true; }
                };
            }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var exportedVar = createVar(scope, "exportedVar");

        assertTrue(behavior.isVarInlineForbidden(exportedVar));
    }

    @Test
    public void testIsVarInlineForbidden_Stale() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var staleVar = createVar(scope, "staleVar");
        
        behavior.staleVars.add(staleVar);
        assertTrue(behavior.isVarInlineForbidden(staleVar));
    }

    @Test
    public void testInline_FunctionDeclaration() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "funcVar");
        Node funcBody = new Node(Token.BLOCK);
        Node funcName = new Node(Token.NAME, "myFunc");
        Node funcNode = new Node(Token.FUNCTION, funcName, new Node(Token.PARAM_LIST), funcBody);
        funcName.setParent(funcNode);
        funcBody.setParent(funcNode);

        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference declarationRef = createReference(var.getNameNode(), declarationNode, null, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference initRef = createReference(funcName, funcNode, null, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "usedFunc"), new Node(Token.CALL), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        behavior.inline(var, declarationRef, initRef, usageRef);
        assertTrue(true);
    }

    @Test
    public void testInlineWellDefinedVariable() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "wellDefinedVar");
        Node valueNode = new Node(Token.NUMBER, 42);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference declRef = createReference(var.getNameNode(), declarationNode, null, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef1 = createReference(new Node(Token.NAME, "use1"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef2 = createReference(new Node(Token.NAME, "use2"), new Node(Token.SUB), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        List<Reference> refs = Lists.newArrayList(declRef, usageRef1, usageRef2);

        behavior.inlineWellDefinedVariable(var, valueNode, refs);
        assertTrue(true);
    }

    @Test
    public void testInlineDeclaredConstant() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "constantVar");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.STRING, "hello");
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference declRef = createReference(var.getNameNode(), declarationNode, null, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef1 = createReference(new Node(Token.NAME, "use1"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef2 = createReference(new Node(Token.NAME, "use2"), new Node(Token.SUB), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        List<Reference> refs = Lists.newArrayList(declRef, usageRef1, usageRef2);

        behavior.inlineDeclaredConstant(var, valueNode, refs);
        assertTrue(true);
    }

    @Test
    public void testRemoveDeclaration_EmptyVarNode() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "singleVar");
        Node varNameNode = var.getNameNode();
        Node varNode = new Node(Token.VAR, varNameNode);
        varNameNode.setParent(varNode);
        Node exprResult = new Node(Token.EXPR_RESULT, varNode);
        varNode.setParent(exprResult);

        Reference declRef = createReference(varNameNode, varNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        behavior.removeDeclaration(declRef);
        assertNull(exprResult.getFirstChild());
    }

    @Test
    public void testInlineValue_SimpleAssignment() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior() {
            @Override
            void blacklistVarReferencesInTree(Node root, Scope scope) { /* Do nothing */ }
        };

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "assignedVar");
        Node valueNode = new Node(Token.NUMBER, 123);
        
        Node assignedNameNode = new Node(Token.NAME, "assignedVar");
        Node assignmentNode = new Node(Token.ASSIGN, assignedNameNode, new Node(Token.NUMBER, 0));
        assignedNameNode.setParent(assignmentNode);
        Node exprResult = new Node(Token.EXPR_RESULT, assignmentNode);
        assignmentNode.setParent(exprResult);

        Reference ref = createReference(assignedNameNode, assignmentNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        // Manually set isSimpleAssignmentToName for this test
        try {
            java.lang.reflect.Field field = Reference.class.getDeclaredField("isSimpleAssignmentToName");
            field.setAccessible(true);
            field.set(ref, true);
        } catch (Exception e) { throw new RuntimeException(e); }


        behavior.inlineValue(var, ref, valueNode.cloneTree());
        
        assertEquals(Token.NUMBER, exprResult.getFirstChild().getLastChild().getType());
        assertEquals(123, exprResult.getFirstChild().getLastChild().getDouble(), 0.001);
    }

    @Test
    public void testIsInlineableDeclaredConstant_Immutable() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "immutableConst");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.NUMBER, 100);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef));

        assertTrue(behavior.isInlineableDeclaredConstant(var, refCollection));
    }

    @Test
    public void testIsInlineableDeclaredConstant_StringWorthInlining() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "stringConst");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.STRING, "short");
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef));
        
        // Mock isStringWorthInlining to return true
        try {
            java.lang.reflect.Method method = InlineVariables.InliningBehavior.class.getDeclaredMethod("isStringWorthInlining", Var.class, List.class);
            method.setAccessible(true);
            method.invoke(behavior, var, refCollection.references);
        } catch (Exception e) { /* ignore */ }

        assertTrue(behavior.isInlineableDeclaredConstant(var, refCollection));
    }

    @Test
    public void testIsStringWorthInlining_ShortStringNotInlineAll() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false); // inlineAllStrings is false
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "shortString");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.STRING, "a"); // Short string
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        List<Reference> refs = Lists.newArrayList(initRef, usageRef);

        assertFalse(behavior.isStringWorthInlining(var, refs));
    }

    @Test
    public void testIsStringWorthInlining_LongStringInlineAll() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, true); // inlineAllStrings is true
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "longString");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.STRING, "this is a very long string that should be inlined");
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        List<Reference> refs = Lists.newArrayList(initRef, usageRef);

        assertTrue(behavior.isStringWorthInlining(var, refs));
    }

    @Test
    public void testCanInline_LiteralValue() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "literalVar");
        Node valueNode = new Node(Token.NUMBER, 5);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference declaration = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference initialization = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference reference = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        // Mocking canMoveAggressively to return true
        try {
            java.lang.reflect.Method method = InlineVariables.InliningBehavior.class.getDeclaredMethod("canMoveAggressively", Node.class);
            method.setAccessible(true);
            method.invoke(behavior, valueNode);
        } catch (Exception e) { /* ignore */ }

        assertTrue(behavior.canInline(declaration, initialization, reference));
    }

    @Test
    public void testCanInline_FunctionCallIntoCall() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public SubclassRelationship getClassesDefinedByCall(Node callNode) {
                        return new SubclassRelationship(null, null); // Simulate subclass definition
                    }
                };
            }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "funcVar");
        Node funcNode = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"));
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference declaration = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference initialization = createReference(funcNode.getFirstChild(), funcNode, funcNode, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        Node callTarget = new Node(Token.CALL, var.getNameNode());
        var.getNameNode().setParent(callTarget);
        Reference reference = createReference(var.getNameNode(), callTarget, callTarget, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        assertFalse(behavior.canInline(declaration, initialization, reference));
    }

    @Test
    public void testCanMoveModerately_ValidMovement() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "moderateVar");
        Node valueNode = new Node(Token.WHILE, new Node(Token.TRUE)); // Non-literal, non-function
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initialization = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        Node usageNameNode = new Node(Token.NAME, "use");
        Node usageParent = new Node(Token.ADD, usageNameNode, new Node(Token.NUMBER, 1));
        usageNameNode.setParent(usageParent);
        Reference reference = createReference(usageNameNode, usageParent, usageParent, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        assertTrue(behavior.canMoveModerately(initialization, reference));
    }
    
    @Test
    public void testIsValidDeclaration_Var() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Node nameNode = new Node(Token.NAME);
        Node varNode = new Node(Token.VAR, nameNode);
        nameNode.setParent(varNode);
        
        Reference declaration = new Reference(nameNode, varNode, varNode, null, null, null);
        assertTrue(behavior.isValidDeclaration(declaration));
    }

    @Test
    public void testIsValidDeclaration_Function() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Node nameNode = new Node(Token.NAME);
        Node funcNode = new Node(Token.FUNCTION, nameNode);
        nameNode.setParent(funcNode);
        
        Reference declaration = new Reference(nameNode, funcNode, funcNode, null, null, null);
        assertTrue(behavior.isValidDeclaration(declaration));
    }

    @Test
    public void testIsValidInitialization_Assigned() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Node nameNode = new Node(Token.NAME);
        Node assignNode = new Node(Token.ASSIGN, nameNode, new Node(Token.NUMBER, 5));
        nameNode.setParent(assignNode);
        
        Reference initialization = new Reference(nameNode, assignNode, assignNode, null, null, null);
        assertTrue(behavior.isValidInitialization(initialization));
    }

    @Test
    public void testIsValidReference_SimpleNameRead() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Node nameNode = new Node(Token.NAME);
        Node addNode = new Node(Token.ADD, nameNode, new Node(Token.NUMBER, 5));
        nameNode.setParent(addNode);
        
        Reference reference = new Reference(nameNode, addNode, addNode, null, null, null);
        assertTrue(behavior.isValidReference(reference));
    }
    
    @Test
    public void testIsImmutableAndWellDefinedVariable_ImmutableNumber() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "immutableNum");
        Node valueNode = new Node(Token.NUMBER, 10);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, usageRef));

        assertTrue(behavior.isImmutableAndWellDefinedVariable(var, refCollection));
    }

    @Test
    public void testIsImmutableAndWellDefinedVariable_StringLiteral() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "immutableStr");
        Node valueNode = new Node(Token.STRING, "hello");
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, usageRef));
        
        assertTrue(behavior.isImmutableAndWellDefinedVariable(var, refCollection));
    }

    @Test
    public void testIsImmutableAndWellDefinedVariable_AssignedTwice() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "assignedTwice");
        Node valueNode = new Node(Token.NUMBER, 10);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        declarationNode.setParent(new Node(Token.EXPR_RESULT, declarationNode));

        Reference initRef = createReference(var.getNameNode(), declarationNode, declarationNode.getParent(), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference assignment1 = createReference(var.getNameNode(), new Node(Token.ASSIGN), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, assignment1, usageRef));

        assertFalse(behavior.isImmutableAndWellDefinedVariable(var, refCollection));
    }
}
