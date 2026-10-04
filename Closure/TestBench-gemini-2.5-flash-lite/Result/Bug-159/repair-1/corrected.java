package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InlineFunctionsTest {

    private static class MockCompiler implements AbstractCompiler {
        private CodingConvention convention = new GoogleCodingConvention();
        private LifeCycleStage stage = LifeCycleStage.NORMALIZED;
        private String debugLog = "";
        private VariableMap variableMap = null;
        private VariableMap functionMap = null;
        private VariableMap constructorMap = null;
        private VariableMap objectPropertyMap = null;

        @Override
        public void report(DiagnosticType diagnosticType, Node node, String... arguments) {
        }

        @Override
        public void report(Node node, DiagnosticType diagnosticType, String... arguments) {
        }

        @Override
        public JSError makeError(Node node, CheckLevel checkLevel, DiagnosticType diagnosticType, String... arguments) {
            return new JSError(node, checkLevel, diagnosticType, arguments);
        }

        @Override
        public JSError makeError(Node node, DiagnosticType diagnosticType, String... arguments) {
            return new JSError(node, CheckLevel.ERROR, diagnosticType, arguments);
        }

        @Override
        public boolean isNormalized() {
            return stage.isNormalized();
        }

        @Override
        public String getAstDotGraph(Node n) {
            return "";
        }

        @Override
        public void addTypeRoots(Set<Node> nodes) {
        }

        @Override
        public void removeGlobalVarEnsuringUniqueId(String varName) {
        }

        @Override
        public Set<Node> getNodesInFunction(Node fn) {
            return Collections.emptySet();
        }

        @Override
        public Set<Node> getNodesDefinedByVar(Node var) {
            return Collections.emptySet();
        }

        @Override
        public boolean isInlineCostIncreased(Node expr, boolean enableInlining, Set<String> constants) {
            return false;
        }

        @Override
        public boolean isInlineable(Node fn) {
            return true;
        }

        @Override
        public void addChange(String descriptiveName, Change.Type type, String filename, int line, int offset, int length) {
        }

        @Override
        public void addChange(String descriptiveName, Change.Type type, String filename, int line, int offset, int length, String content) {
        }

        @Override
        public void reportCodeChange() {
            debugLog += "Code changed. ";
        }

        @Override
        public void addToDebugLog(String message) {
            debugLog += message + ". ";
        }

        @Override
        public String getDebugLog() {
            return debugLog;
        }

        @Override
        public String getUniqueNameIdSupplier() {
            return "uniqueName";
        }

        @Override
        public String getSourceReportPath(Node n) {
            return "source.js";
        }

        @Override
        public String getSourcePath(Node n) {
            return "source.js";
        }

        @Override
        public CodingConvention getCodingConvention() {
            return convention;
        }

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return stage;
        }

        @Override
        public void setLifeCycleStage(LifeCycleStage stage) {
            this.stage = stage;
        }

        @Override
        public void ensureLibraryInjected(String libName) {
        }

        @Override
        public String getPropertyRenamingMap(RenamingPolicy policy, JSType type) {
            return null;
        }

        @Override
        public VariableMap getVariableMap() {
            return variableMap;
        }

        public void setVariableMap(VariableMap variableMap) {
            this.variableMap = variableMap;
        }

        @Override
        public VariableMap getFunctionMap() {
            return functionMap;
        }

        public void setFunctionMap(VariableMap functionMap) {
            this.functionMap = functionMap;
        }

        @Override
        public VariableMap getConstructorMap() {
            return constructorMap;
        }

        public void setConstructorMap(VariableMap constructorMap) {
            this.constructorMap = constructorMap;
        }

        @Override
        public VariableMap getObjectPropertyMap() {
            return objectPropertyMap;
        }

        public void setObjectPropertyMap(VariableMap objectPropertyMap) {
            this.objectPropertyMap = objectPropertyMap;
        }

        @Override
        public String getSourceMapContent() {
            return null;
        }

        @Override
        public void setSourceMapConfig(SourceMap.Config config) {
        }

        @Override
        public boolean shouldReport(DiagnosticType diagnosticType) {
            return true;
        }

        @Override
        public boolean isInliningEnabled() {
            return true;
        }
    }

    private static class MockFunctionInjector extends FunctionInjector {
        MockFunctionInjector() {
            super(new MockCompiler(), () -> "safeName", true);
        }

        @Override
        public CanInlineResult canInlineReferenceToFunction(NodeTraversal t, Node callNode, Node fnNode, Set<String> needAliases, InliningMode mode, boolean referencesThis, boolean containsFunctions) {
            return CanInlineResult.YES;
        }

        @Override
        public Node inline(NodeTraversal t, Node callNode, String fnName, Node fnNode, InliningMode mode) {
            ((MockCompiler) compiler).reportCodeChange();
            return callNode;
        }

        @Override
        public boolean isDirectCallNodeReplacementPossible(Node fnNode) {
            return true;
        }

        @Override
        public boolean inliningLowersCost(JSModule fnModule, Node fnNode, Collection<? extends Reference> refs, Set<String> namesToAlias, boolean isRemovable, boolean referencesThis) {
            return true;
        }
    }

    private AbstractCompiler compiler = new MockCompiler();
    private Supplier<String> safeNameIdSupplier = () -> "uniqueId";
    private FunctionInjector injector = new MockFunctionInjector();

    // Test case for processing an empty script.
    @Test
    public void testProcessEmptyScript() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test case for a simple named function that can be inlined directly.
    @Test
    public void testInlineDirectlyNamedFunction() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("Inlined function: myFn. Code changed. ", compiler.getDebugLog());
    }

    // Test case for a function expression that can be inlined directly.
    @Test
    public void testInlineDirectlyFunctionExpression() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnExpr = new Node(Token.FUNCTION, new Node(Token.NAME, "anonFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(10))));
        Node call = new Node(Token.CALL, fnExpr);
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("Inlined function: 0. Code changed. ", compiler.getDebugLog());
    }

    // Test case for a function that cannot be inlined directly but can be inlined as a block.
    @Test
    public void testInlineAsBlock() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2))))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("Inlined function: myFn. Code changed. ", compiler.getDebugLog());
    }

    // Test case for a function with multiple calls.
    @Test
    public void testInlineMultipleCalls() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(10)))));
        root.addChildToBack(fnVar);
        Node call1 = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        Node call2 = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call1));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call2));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("Inlined function: myFn. Code changed. Inlined function: myFn. Code changed. ", compiler.getDebugLog());
    }

    // Test case for a function with no calls.
    @Test
    public void testFunctionWithNoCalls() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test case for a function that is recursive.
    @Test
    public void testRecursiveFunction() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.CALL, new Node(Token.NAME, "myFn"))))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test case for a function containing another function.
    @Test
    public void testFunctionWithInnerFunction() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node innerFn = new Node(Token.FUNCTION, new Node(Token.NAME, "innerFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1))));
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, innerFn)));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test case for a function that is exported.
    @Test
    public void testExportedFunction() throws Exception {
        MockCompiler mockCompiler = new MockCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new GoogleCodingConvention() {
                    @Override
                    public boolean isExported(String name) {
                        return true;
                    }
                };
            }
        };
        InlineFunctions inlineFunctions = new InlineFunctions(mockCompiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for function inlining disabled.
    @Test
    public void testFunctionInliningDisabled() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, false, false, false);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for block function inlining disabled.
    @Test
    public void testBlockFunctionInliningDisabled() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, false);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2))))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test case for a function with a reference to 'this'.
    @Test
    public void testFunctionReferencesThis() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.THIS))))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertTrue(compiler.getDebugLog().contains("Code changed."));
    }

    // Test case for a function with parameters that need aliasing.
    @Test
    public void testFunctionWithAliasedParameters() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST, new Node(Token.NAME, "a")), new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.ASSIGN, new Node(Token.NAME, "a"), Node.newNumber(10))))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"), Node.newNumber(5));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertTrue(compiler.getDebugLog().contains("Code changed."));
    }

    // Test for Function.prototype.call
    @Test
    public void testFunctionCallCall() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnExpr = new Node(Token.FUNCTION, null, new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(10))));
        Node call = new Node(Token.CALL, new Node(Token.GETPROP, fnExpr, Node.newString("call")), Node.THIS, Node.newNumber(1));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("Inlined function: 0. Code changed. ", compiler.getDebugLog());
    }

    // Test for a function name being used in a way that prevents inlining (e.g., assignment).
    @Test
    public void testFunctionNameAssignment() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node assignment = new Node(Token.ASSIGN, new Node(Token.NAME, "myFn"), Node.newNumber(10));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assignment));
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for a function name used as a variable.
    @Test
    public void testFunctionNameAsVariable() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "otherVar"), new Node(Token.NAME, "myFn"));
        root.addChildToBack(varDecl);

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for a function with multiple definitions.
    @Test
    public void testMultipleFunctionDefinitions() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar1 = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        Node fnVar2 = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(10)))));
        root.addChildToBack(fnVar1);
        root.addChildToBack(fnVar2);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for a function with a reserved name.
    @Test
    public void testReservedFunctionName() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "eval"), new Node(Token.FUNCTION, new Node(Token.NAME, "eval"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "eval"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test case where function inlining increases cost.
    @Test
    public void testInliningIncreasesCost() throws Exception {
        MockFunctionInjector mockInjector = new MockFunctionInjector() {
            @Override
            public boolean inliningLowersCost(JSModule fnModule, Node fnNode, Collection<? extends Reference> refs, Set<String> namesToAlias, boolean isRemovable, boolean referencesThis) {
                return false;
            }
        };
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        inlineFunctions.injector = mockInjector;

        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for decomposition of expressions.
    @Test
    public void testDecomposeExpression() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);

        MockFunctionInjector mockInjector = new MockFunctionInjector() {
            @Override
            public CanInlineResult canInlineReferenceToFunction(NodeTraversal t, Node callNode, Node fnNode, Set<String> needAliases, InliningMode mode, boolean referencesThis, boolean containsFunctions) {
                if (callNode.getParent() != null && callNode.getParent().getType() == Token.EXPR_RESULT) {
                    return CanInlineResult.AFTER_DECOMPOSITION;
                }
                return CanInlineResult.YES;
            }
        };
        inlineFunctions.injector = mockInjector;

        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        Node assignment = new Node(Token.ASSIGN, new Node(Token.NAME, "result"), call);
        root.addChildToBack(new Node(Token.EXPR_RESULT, assignment));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertTrue(compiler.getDebugLog().contains("Code changed."));
    }

    // Test for a complex function structure that should not be inlined.
    @Test
    public void testComplexFunctionNotInlineable() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node innerFn = new Node(Token.FUNCTION, new Node(Token.NAME, "innerFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1))));
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "x"), Node.newNumber(5));
        Node return1 = new Node(Token.RETURN, Node.newNumber(10));
        Node fnBody = new Node(Token.BLOCK, varDecl, innerFn, return1);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), fnBody));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for a function definition that is not immediately used.
    @Test
    public void testUnusedFunctionDefinition() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for a function definition that is used as a parameter.
    @Test
    public void testFunctionUsedAsParameter() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);

        Node otherFnParam = new Node(Token.NAME, "myFn");
        Node otherFn = new Node(Token.FUNCTION, new Node(Token.NAME, "otherFn"), new Node(Token.PARAM_LIST, otherFnParam), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(10))));
        root.addChildToBack(otherFn);

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertEquals("", compiler.getDebugLog());
    }

    // Test for a function with a return value that's a complex expression.
    @Test
    public void testFunctionComplexReturn() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "x"), Node.newNumber(5));
        Node returnExpr = new Node(Token.ADD, varDecl.getFirstChild().getNext(), Node.newNumber(2));
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, varDecl, new Node(Token.RETURN, returnExpr))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertTrue(compiler.getDebugLog().contains("Code changed."));
    }

    // Test for a function that uses 'arguments' object.
    @Test
    public void testFunctionWithArguments() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NAME, "arguments")))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertTrue(compiler.getDebugLog().contains("Code changed."));
    }

    // Test for function with object literal in return.
    @Test
    public void testFunctionObjectLiteralReturn() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT, new Node(Token.STRING_KEY, "a", Node.newNumber(1)), new Node(Token.STRING_KEY, "b", Node.newNumber(2)));
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, objLit))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertTrue(compiler.getDebugLog().contains("Code changed."));
    }

    // Test for function with array literal in return.
    @Test
    public void testFunctionArrayLiteralReturn() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, arrayLit))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        assertTrue(compiler.getDebugLog().contains("Code changed."));
    }

    // Test to check if `enableSpecialization` is called and state is set.
    @Test
    public void testEnableSpecialization() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        SpecializeModule.SpecializationState mockState = new SpecializeModule.SpecializationState(compiler, null);
        inlineFunctions.enableSpecialization(mockState);
        assertNotNull(inlineFunctions.specializationState);
        assertEquals(mockState, inlineFunctions.specializationState);
    }

    // Test that the `findCandidatesReferences` visitor correctly identifies references.
    @Test
    public void testFindCandidatesReferences() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        NodeTraversal.traverse(compiler, root, new InlineFunctions.FindCandidateFunctions());
        NodeTraversal.traverse(compiler, root, new InlineFunctions.FindCandidatesReferences(inlineFunctions.fns, inlineFunctions.anonFns));

        FunctionState fs = inlineFunctions.fns.get("myFn");
        assertNotNull(fs);
        assertTrue(fs.hasReferences());
        assertEquals(1, fs.getReferences().size());
        assertEquals(call, fs.getReference(call).callNode);
    }

    // Test that `trimCanidatesNotMeetingMinimumRequirements` works.
    @Test
    public void testTrimCandidatesNotMeetingMinimumRequirements() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);
        FunctionState fs = inlineFunctions.fns.get("myFn");
        fs.setInline(false);

        inlineFunctions.trimCanidatesNotMeetingMinimumRequirements();

        assertFalse(inlineFunctions.fns.containsKey("myFn"));
    }

    // Test that `trimCanidatesUsingOnCost` works.
    @Test
    public void testTrimCandidatesUsingOnCost() throws Exception {
        MockFunctionInjector mockInjector = new MockFunctionInjector() {
            @Override
            public boolean inliningLowersCost(JSModule fnModule, Node fnNode, Collection<? extends Reference> refs, Set<String> namesToAlias, boolean isRemovable, boolean referencesThis) {
                return false;
            }
        };
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        inlineFunctions.injector = mockInjector;

        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);

        inlineFunctions.trimCanidatesUsingOnCost();

        assertFalse(inlineFunctions.fns.containsKey("myFn"));
    }

    // Test for `resolveInlineConflicts`.
    @Test
    public void testResolveInlineConflicts() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);

        Node fnB_Body = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(10)));
        Node fnB_Var = new Node(Token.VAR, new Node(Token.NAME, "fnB"), new Node(Token.FUNCTION, new Node(Token.NAME, "fnB"), new Node(Token.PARAM_LIST), fnB_Body));
        root.addChildToBack(fnB_Var);

        Node callB = new Node(Token.CALL, new Node(Token.NAME, "fnB"));
        Node fnA_Body = new Node(Token.BLOCK, new Node(Token.RETURN, callB));
        Node fnA_Var = new Node(Token.VAR, new Node(Token.NAME, "fnA"), new Node(Token.FUNCTION, new Node(Token.NAME, "fnA"), new Node(Token.PARAM_LIST), fnA_Body));
        root.addChildToBack(fnA_Var);

        Node callA = new Node(Token.CALL, new Node(Token.NAME, "fnA"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, callA));

        inlineFunctions.process(new Node(Token.SCRIPT), root);

        FunctionState fsA = inlineFunctions.fns.get("fnA");
        FunctionState fsB = inlineFunctions.fns.get("fnB");

        assertNotNull(fsA);
        assertNotNull(fsB);

        assertTrue(fsA.canInline());
        assertTrue(fsB.canInline());
        assertFalse(fsB.canRemove());
    }

    // Test for `decomposeExpressions`.
    @Test
    public void testDecomposeExpressions() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);

        MockFunctionInjector mockInjector = new MockFunctionInjector() {
            @Override
            public CanInlineResult canInlineReferenceToFunction(NodeTraversal t, Node callNode, Node fnNode, Set<String> needAliases, InliningMode mode, boolean referencesThis, boolean containsFunctions) {
                if (callNode.getParent() != null && callNode.getParent().getType() == Token.EXPR_RESULT) {
                    return CanInlineResult.AFTER_DECOMPOSITION;
                }
                return CanInlineResult.YES;
            }
        };
        inlineFunctions.injector = mockInjector;

        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        Node assignment = new Node(Token.ASSIGN, new Node(Token.NAME, "result"), call);
        root.addChildToBack(new Node(Token.EXPR_RESULT, assignment));

        inlineFunctions.process(new Node(Token.SCRIPT), root);

        assertTrue(compiler.getDebugLog().contains("Code changed."));
    }

    // Test for `removeInlinedFunctions`.
    @Test
    public void testRemoveInlinedFunctions() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);

        FunctionState fs = inlineFunctions.fns.get("myFn");
        assertNotNull(fs);
        assertTrue(fs.canRemove());

        inlineFunctions.removeInlinedFunctions();

        assertTrue(compiler.getDebugLog().contains("Removed function: myFn. Code changed. "));
    }

    // Test for `verifyAllReferencesInlined`.
    @Test(expected = IllegalStateException.class)
    public void testVerifyAllReferencesInlined_missedReference() throws Exception {
        InlineFunctions inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        Node root = new Node(Token.SCRIPT);
        Node fnVar = new Node(Token.VAR, new Node(Token.NAME, "myFn"), new Node(Token.FUNCTION, new Node(Token.NAME, "myFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)))));
        root.addChildToBack(fnVar);
        Node call = new Node(Token.CALL, new Node(Token.NAME, "myFn"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        inlineFunctions.process(new Node(Token.SCRIPT), root);

        FunctionState fs = inlineFunctions.fns.get("myFn");
        assertNotNull(fs);
        Reference ref = fs.getReference(call);
        ref.inlined = false;

        inlineFunctions.verifyAllReferencesInlined(fs);
    }

    // Test for FunctionState.getFn() and setFn()
    @Test
    public void testFunctionStateGetSetFn() throws Exception {
        FunctionState fs = new FunctionState();
        Node fnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "testFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Function mockFn = new InlineFunctions.NamedFunction(fnNode);
        fs.setFn(mockFn);
        assertEquals(mockFn, fs.getFn());
    }

    // Test for FunctionState.getSafeFnNode() and setSafeFnNode()
    @Test
    public void testFunctionStateGetSetSafeFnNode() throws Exception {
        FunctionState fs = new FunctionState();
        Node originalFnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "originalFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Node safeFnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "safeFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        fs.setFn(new InlineFunctions.NamedFunction(originalFnNode));
        fs.setSafeFnNode(safeFnNode);
        assertEquals(safeFnNode, fs.getSafeFnNode());

        FunctionState fs2 = new FunctionState();
        fs2.setFn(new InlineFunctions.NamedFunction(originalFnNode));
        assertEquals(originalFnNode, fs2.getSafeFnNode());
    }

    // Test for FunctionState.canInline() and setInline()
    @Test
    public void testFunctionStateCanInline() throws Exception {
        FunctionState fs = new FunctionState();
        assertTrue(fs.canInline());
        fs.setInline(false);
        assertFalse(fs.canInline());
    }

    // Test for FunctionState.canRemove() and setRemove()
    @Test
    public void testFunctionStateCanRemove() throws Exception {
        FunctionState fs = new FunctionState();
        assertTrue(fs.canRemove());
        fs.setRemove(false);
        assertFalse(fs.canRemove());
    }

    // Test for FunctionState.canInlineDirectly() and inlineDirectly()
    @Test
    public void testFunctionStateInlineDirectly() throws Exception {
        FunctionState fs = new FunctionState();
        assertFalse(fs.canInlineDirectly());
        fs.inlineDirectly(true);
        assertTrue(fs.canInlineDirectly());
    }

    // Test for FunctionState.hasReferences() and addReference()
    @Test
    public void testFunctionStateHasReferences() throws Exception {
        FunctionState fs = new FunctionState();
        assertFalse(fs.hasReferences());
        Node callNode = new Node(Token.CALL);
        fs.addReference(new InlineFunctions.Reference(callNode, null, InliningMode.DIRECT));
        assertTrue(fs.hasReferences());
    }

    // Test for FunctionState.getReference()
    @Test
    public void testFunctionStateGetReference() throws Exception {
        FunctionState fs = new FunctionState();
        Node callNode1 = new Node(Token.CALL);
        Node callNode2 = new Node(Token.CALL);
        fs.addReference(new InlineFunctions.Reference(callNode1, null, InliningMode.DIRECT));
        fs.addReference(new InlineFunctions.Reference(callNode2, null, InliningMode.DIRECT));

        assertNotNull(fs.getReference(callNode1));
        assertNotNull(fs.getReference(callNode2));
        assertNull(fs.getReference(new Node(Token.CALL)));
    }

    // Test for FunctionState.getNamesToAlias() and setNamesToAlias()
    @Test
    public void testFunctionStateNamesToAlias() throws Exception {
        FunctionState fs = new FunctionState();
        Set<String> names = Sets.newHashSet("a", "b");
        fs.setNamesToAlias(names);
        assertEquals(names, fs.getNamesToAlias());
        assertTrue(fs.getNamesToAlias().contains("a"));
        assertFalse(fs.getNamesToAlias().contains("c"));
    }

    // Test for FunctionState.getModule() and setModule()
    @Test
    public void testFunctionStateModule() throws Exception {
        FunctionState fs = new FunctionState();
        JSModule module = new JSModule("module1");
        fs.setModule(module);
        assertEquals(module, fs.getModule());
    }

    // Test for FunctionState.hasExistingFunctionDefinition()
    @Test
    public void testFunctionStateHasExistingFunctionDefinition() throws Exception {
        FunctionState fs = new FunctionState();
        assertFalse(fs.hasExistingFunctionDefinition());
        Node fnNode = new Node(Token.FUNCTION);
        fs.setFn(new InlineFunctions.NamedFunction(fnNode));
        assertTrue(fs.hasExistingFunctionDefinition());
    }

    // Test for FunctionState.setReferencesThis() and getReferencesThis()
    @Test
    public void testFunctionStateReferencesThis() throws Exception {
        FunctionState fs = new FunctionState();
        assertFalse(fs.getReferencesThis());
        fs.setReferencesThis(true);
        assertTrue(fs.getReferencesThis());
    }

    // Test for FunctionState.setHasInnerFunctions() and hasInnerFunctions()
    @Test
    public void testFunctionStateHasInnerFunctions() throws Exception {
        FunctionState fs = new FunctionState();
        assertFalse(fs.hasInnerFunctions());
        fs.setHasInnerFunctions(true);
        assertTrue(fs.hasInnerFunctions());
    }

    // Test for FunctionState.hasBlockInliningReferences()
    @Test
    public void testFunctionStateHasBlockInliningReferences() throws Exception {
        FunctionState fs = new FunctionState();
        assertFalse(fs.hasBlockInliningReferences());
        Node callNode = new Node(Token.CALL);
        fs.addReference(new InlineFunctions.Reference(callNode, null, InliningMode.BLOCK));
        assertTrue(fs.hasBlockInliningReferences());
    }

    // Test for FunctionState.removeBlockInliningReferences()
    @Test
    public void testFunctionStateRemoveBlockInliningReferences() throws Exception {
        FunctionState fs = new FunctionState();
        Node callNode1 = new Node(Token.CALL);
        Node callNode2 = new Node(Token.CALL);
        fs.addReference(new InlineFunctions.Reference(callNode1, null, InliningMode.BLOCK));
        fs.addReference(new InlineFunctions.Reference(callNode2, null, InliningMode.DIRECT));
        assertTrue(fs.hasBlockInliningReferences());
        fs.removeBlockInliningReferences();
        assertFalse(fs.hasBlockInliningReferences());
        assertTrue(fs.hasReferences());
    }
}
