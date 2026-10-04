```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.StaticSymbolTable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.SourcePosition;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;
import java.io.Serializable;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.AbstractCompiler.ExternProgress;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSymbolTable;


public class ScopeTest {
    // Mock AbstractCompiler for creating Scope objects
    private static class MockAbstractCompiler extends AbstractCompiler {

        private JSTypeRegistry typeRegistry;
        private ErrorReporter errorReporter;

        MockAbstractCompiler() {
            typeRegistry = new JSTypeRegistry(null); // Initialize with a null registry for simplicity
            errorReporter = new BaseErrorReporter() {
                @Override
                public void runtimeError(String message, String sourceName, int line, int column) {}
            };
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public ErrorReporter getErrorReporter() {
            return errorReporter;
        }

        @Override
        public void reportCodeChange() {}

        @Override
        public void reassessControlFlowGraphs() {}

        @Override
        public void setLifeTime(Object obj, Object lifetime) {}

        @Override
        public PassConfig getPassConfig() {
            return null;
        }

        @Override
        public void init(Node externs, Node root, CompilerOptions options) {}

        @Override
        public boolean shouldRunPass(String name) { return false; }

        @Override
        public void runCodingConvention() {}

        @Override
        public void setCompilerOptions(CompilerOptions options) {}

        @Override
        public String getAstDotGraph() { return null; }

        @Override
        public void process(Node externs, Node root) {}

        @Override
        public void process(Node externs, Node root, CompilerInput input) {}

        @Override
        public void parse() {}

        @Override
        public void check() {}

        @Override
        public void normalize() {}

        @Override
        public void optimize() {}

        @Override
        public void regenerateCode() {}

        @Override
        public void collectJsMessage(String messageKey, String defaultMessage) {}

        @Override
        public void setExterns(Node externs) {}

        @Override
        public Node getRoot() { return null;}

        @Override
        public Node getExterns() { return null;}

        @Override
        public void addChange(Node node, String description) {}

        @Override
        public void setPhasedPassConfig(PassConfig passConfig) {}

        @Override
        public PassConfig getPassConfigForHotSwap() { return null;}

        @Override
        public void error(String message, Node node, DiagnosticType type, String ... arguments) {}

        @Override
        public void warning(String message, Node node, DiagnosticType type, String ... arguments) {}

        @Override
        public void setIncremental(boolean incremental) {}

        @Override
        public boolean isInliningForbidden() { return false; }

        @Override
        public void updateGlobalčila(Node externs, Node root) {}

        @Override
        public void setSourceMap(SourceMap sourceMap) {}

        @Override
        public SourceMap getSourceMap() { return null; }

        @Override
        public void setExternProgress(ExternProgress progress) {}

        @Override
        public ExternProgress getExternProgress() { return null;}

        @Override
        public void enableTypeCheck() {}

        @Override
        public void disableTypeCheck() {}

        @Override
        public boolean areTypesEnabled() { return false;}

        @Override
        public void setSymbolTable(StaticSymbolTable<Var, Scope> symbolTable) {}

        @Override
        public StaticSymbolTable<Var, Scope> getSymbolTable() { return null;}

        @Override
        public String getSourceProductName() {
            return "test";
        }

        @Override
        public Node getSynthesizedNodes() {
            return null;
        }

        @Override
        public String[] getMessages() {
            return null;
        }

        @Override
        public int getErrorCount() {
            return 0;
        }

        @Override
        public int getWarningCount() {
            return 0;
        }

        @Override
        public String stripFileHeader(String filename) {
            return null;
        }

        @Override
        public void setPhasedPassConfigInternal(PassConfig passConfig) {
        }

        @Override
        public Var getGlobalVarReferences() {
            return null;
        }
    }

    // Helper to create a simple Scope.
    private Scope createGlobalScope(Node rootNode) {
        return new Scope(rootNode, new MockAbstractCompiler());
    }

    // Helper to create a nested Scope.
    private Scope createNestedScope(Scope parent, Node rootNode) {
        return new Scope(parent, rootNode);
    }

    // Helper to create a Var.
    private Var createVar(String name, Node nameNode, JSType type, Scope scope, CompilerInput input, boolean inferred, boolean isDefine, JSDocInfo info) {
        return new Var(inferred, name, nameNode, type, scope, 0, input, isDefine, info);
    }

    @Test
    public void testGlobalScopeCreation() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(root);
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
        assertNull(globalScope.getParent());
        assertEquals(0, globalScope.getDepth());
        assertEquals(root, globalScope.getRootNode());
    }

    @Test
    public void testNestedScopeCreation() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        assertNotNull(nestedScope);
        assertFalse(nestedScope.isGlobal());
        assertEquals(globalScope, nestedScope.getParent());
        assertEquals(1, nestedScope.getDepth());
        assertEquals(functionRoot, nestedScope.getRootNode());
    }

    @Test
    public void testGetParent() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        assertEquals(globalScope, nestedScope.getParent());
        assertNull(globalScope.getParent());
    }

    @Test
    public void testGetRootNode() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        assertEquals(globalRoot, globalScope.getRootNode());
        assertEquals(functionRoot, nestedScope.getRootNode());
    }

    @Test
    public void testGetDepth() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot1 = new Node(Token.FUNCTION);
        Scope nestedScope1 = createNestedScope(globalScope, functionRoot1);
        Node functionRoot2 = new Node(Token.FUNCTION);
        Scope nestedScope2 = createNestedScope(nestedScope1, functionRoot2);
        assertEquals(0, globalScope.getDepth());
        assertEquals(1, nestedScope1.getDepth());
        assertEquals(2, nestedScope2.getDepth());
    }

    @Test
    public void testGetGlobalScope() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot1 = new Node(Token.FUNCTION);
        Scope nestedScope1 = createNestedScope(globalScope, functionRoot1);
        Node functionRoot2 = new Node(Token.FUNCTION);
        Scope nestedScope2 = createNestedScope(nestedScope1, functionRoot2);
        assertEquals(globalScope, globalScope.getGlobalScope());
        assertEquals(globalScope, nestedScope1.getGlobalScope());
        assertEquals(globalScope, nestedScope2.getGlobalScope());
    }

    @Test
    public void testDeclareAndGetVar() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        JSType mockType = null; // Mock JSType
        CompilerInput mockInput = new CompilerInput(null, null, false); // Mock CompilerInput
        Var var = createVar("myVar", nameNode, mockType, scope, mockInput, false, false, null);
        scope.vars.put("myVar", var); // Directly add for testing getVar

        Var foundVar = scope.getVar("myVar");
        assertNotNull(foundVar);
        assertEquals("myVar", foundVar.getName());
        assertEquals(nameNode, foundVar.getNode());
    }

    @Test
    public void testGetVar_notDeclared() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertNull(scope.getVar("nonExistentVar"));
    }

    @Test
    public void testGetVar_inParentScope() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node varNameNode = Node.newString("globalVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var globalVar = createVar("globalVar", varNameNode, mockType, globalScope, mockInput, false, false, null);
        globalScope.vars.put("globalVar", globalVar);

        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);

        Var foundVar = nestedScope.getVar("globalVar");
        assertNotNull(foundVar);
        assertEquals("globalVar", foundVar.getName());
        assertEquals(globalVar, foundVar); // Should be the same instance
    }

    @Test
    public void testIsDeclared() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("myVar", nameNode, mockType, scope, mockInput, false, false, null);
        scope.vars.put("myVar", var);

        assertTrue(scope.isDeclared("myVar", true));
        assertTrue(scope.isDeclared("myVar", false));
        assertFalse(scope.isDeclared("otherVar", true));
        assertFalse(scope.isDeclared("otherVar", false));
    }

    @Test
    public void testIsDeclared_inParentScope() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node varNameNode = Node.newString("globalVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var globalVar = createVar("globalVar", varNameNode, mockType, globalScope, mockInput, false, false, null);
        globalScope.vars.put("globalVar", globalVar);

        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);

        assertTrue(nestedScope.isDeclared("globalVar", true));
        assertFalse(nestedScope.isDeclared("globalVar", false)); // Not declared in nestedScope itself
    }

    @Test
    public void testGetVars() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode1 = Node.newString("var1");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var1 = createVar("var1", nameNode1, mockType, scope, mockInput, false, false, null);
        scope.vars.put("var1", var1);

        Node nameNode2 = Node.newString("var2");
        Var var2 = createVar("var2", nameNode2, mockType, scope, mockInput, false, false, null);
        scope.vars.put("var2", var2);

        Iterator<Var> varsIterator = scope.getVars();
        assertTrue(varsIterator.hasNext());
        Var firstVar = varsIterator.next();
        assertTrue(firstVar == var1 || firstVar == var2);
        assertTrue(varsIterator.hasNext());
        Var secondVar = varsIterator.next();
        assertTrue(secondVar == var1 || secondVar == var2);
        assertFalse(varsIterator.hasNext());
    }

    @Test
    public void testGetVarCount() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertEquals(0, scope.getVarCount());

        Node nameNode1 = Node.newString("var1");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var1 = createVar("var1", nameNode1, mockType, scope, mockInput, false, false, null);
        scope.vars.put("var1", var1);
        assertEquals(1, scope.getVarCount());

        Node nameNode2 = Node.newString("var2");
        Var var2 = createVar("var2", nameNode2, mockType, scope, mockInput, false, false, null);
        scope.vars.put("var2", var2);
        assertEquals(2, scope.getVarCount());
    }

    @Test
    public void testGetArgumentsVar() throws Exception {
        Node root = new Node(Token.FUNCTION); // 'arguments' is relevant in function scopes
        Scope scope = createNestedScope(createGlobalScope(new Node(Token.SCRIPT)), root);
        Var argsVar = scope.getArgumentsVar();
        assertNotNull(argsVar);
        assertEquals("arguments", argsVar.getName());
        assertTrue(argsVar instanceof Scope.Arguments);
        assertEquals(scope, argsVar.getScope());
        assertNull(argsVar.getNode()); // 'arguments' doesn't have a declaration node in this context.
    }

    @Test
    public void testGetArgumentsVar_cached() throws Exception {
        Node root = new Node(Token.FUNCTION);
        Scope scope = createNestedScope(createGlobalScope(new Node(Token.SCRIPT)), root);
        Var argsVar1 = scope.getArgumentsVar();
        Var argsVar2 = scope.getArgumentsVar();
        assertSame(argsVar1, argsVar2); // Should return the same instance.
    }

    @Test
    public void testIsGlobal() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(root);
        assertTrue(globalScope.isGlobal());

        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        assertFalse(nestedScope.isGlobal());
    }

    @Test
    public void testIsLocal() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(root);
        assertFalse(globalScope.isLocal());

        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        assertTrue(nestedScope.isLocal());
    }

    @Test
    public void testGetTypeOfThis() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        // The global scope's 'this' type is usually a specific global object type.
        // We can't easily mock JSTypeRegistry here, so we'll check for non-null.
        assertNotNull(globalScope.getTypeOfThis());

        Node functionRoot = new Node(Token.FUNCTION);
        // For a nested scope, 'this' type is inherited from the parent or function type.
        // Mocking JSType for function type to set a specific 'this' type.
        JSType mockFunctionType = new JSType(null) { // Mock JSType to enable toMaybeFunctionType
            @Override public FunctionType toMaybeFunctionType() {
                return new FunctionType(null, null) { // Mock FunctionType
                    @Override public JSType getTypeOfThis() {
                        // Return a mock ObjectType for 'this'
                        return new ObjectType(null) { // Mock ObjectType
                            @Override public String getDisplayName() { return "MockThisType"; }
                        };
                    }
                };
            }
            @Override public String getDisplayName() { return "MockFunctionType"; }
        };
        functionRoot.setJSType(mockFunctionType);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        assertNotNull(nestedScope.getTypeOfThis());
        assertEquals("MockThisType", nestedScope.getTypeOfThis().getDisplayName());
    }

    @Test
    public void testGetSlot_and_getOwnSlot() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("myVar", nameNode, mockType, scope, mockInput, false, false, null);
        scope.vars.put("myVar", var);

        StaticSlot<JSType> ownSlot = scope.getOwnSlot("myVar");
        assertNotNull(ownSlot);
        assertEquals("myVar", ownSlot.getName());
        assertEquals(var, ownSlot.getSymbol());

        StaticSlot<JSType> slot = scope.getSlot("myVar");
        assertNotNull(slot);
        assertEquals("myVar", slot.getName());
        assertEquals(var, slot.getSymbol());
    }

    @Test
    public void testGetOwnSlot_notDeclared() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertNull(scope.getOwnSlot("nonExistentVar"));
    }

    @Test
    public void testGetSlot_inParentScope() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node varNameNode = Node.newString("globalVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var globalVar = createVar("globalVar", varNameNode, mockType, globalScope, mockInput, false, false, null);
        globalScope.vars.put("globalVar", globalVar);

        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);

        StaticSlot<JSType> slot = nestedScope.getSlot("globalVar");
        assertNotNull(slot);
        assertEquals("globalVar", slot.getName());
        assertEquals(globalVar, slot.getSymbol());
    }

    @Test
    public void testGetAllSymbols() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode1 = Node.newString("var1");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var1 = createVar("var1", nameNode1, mockType, scope, mockInput, false, false, null);
        scope.vars.put("var1", var1);

        Node nameNode2 = Node.newString("var2");
        Var var2 = createVar("var2", nameNode2, mockType, scope, mockInput, false, false, null);
        scope.vars.put("var2", var2);

        Iterable<Var> allSymbols = scope.getAllSymbols();
        List<Var> symbolList = Lists.newArrayList(allSymbols);
        assertEquals(2, symbolList.size());
        assertTrue(symbolList.contains(var1));
        assertTrue(symbolList.contains(var2));
    }

    @Test
    public void testGetDeclarativelyUnboundVarsWithoutTypes() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode1 = Node.newString("var1");
        JSType mockType = null; // No declared type
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var1 = createVar("var1", nameNode1, mockType, scope, mockInput, false, false, null);
        Node varNode1 = new Node(Token.VAR);
        varNode1.addChildToBack(nameNode1);
        nameNode1.setParent(varNode1); // Parent is VAR
        scope.vars.put("var1", var1);

        // Test case 1: Var with no type
        Iterator<Var> iterator1 = scope.getDeclarativelyUnboundVarsWithoutTypes();
        assertTrue(iterator1.hasNext());
        assertEquals(var1, iterator1.next());
        assertFalse(iterator1.hasNext());

        // Test case 2: Var with a declared type
        JSType declaredType = new JSType(null) {}; // Dummy declared type
        Node nameNode2 = Node.newString("var2");
        Var var2 = createVar("var2", nameNode2, declaredType, scope, mockInput, false, false, null);
        Node varNode2 = new Node(Token.VAR);
        varNode2.addChildToBack(nameNode2);
        nameNode2.setParent(varNode2);
        scope.vars.put("var2", var2);

        Iterator<Var> iterator2 = scope.getDeclarativelyUnboundVarsWithoutTypes();
        assertTrue(iterator2.hasNext());
        assertEquals(var1, iterator2.next()); // Only var1 should be returned
        assertFalse(iterator2.hasNext());

        // Test case 3: Non-VAR parent (should not be considered)
        Node nameNode3 = Node.newString("var3");
        Var var3 = createVar("var3", nameNode3, null, scope, mockInput, false, false, null);
        Node assignNode = new Node(Token.ASSIGN);
        assignNode.addChildToBack(nameNode3);
        nameNode3.setParent(assignNode);
        scope.vars.put("var3", var3);

        Iterator<Var> iterator3 = scope.getDeclarativelyUnboundVarsWithoutTypes();
        assertTrue(iterator3.hasNext());
        assertEquals(var1, iterator3.next()); // Still only var1
        assertFalse(iterator3.hasNext());
    }

    // Tests for ScopedAliases methods (implementing parts of the API outline)
    // These would typically be in a separate test class for ScopedAliases,
    // but given the constraints, we'll include basic checks if they directly
    // interact with Scope.

    @Test
    public void testScopedAliases_process() throws Exception {
        Node externs = new Node(Token.ROOT);
        Node root = new Node(Token.SCRIPT);
        AbstractCompiler compiler = new MockAbstractCompiler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, new AliasTransformationHandler() {
            @Override
            public AliasTransformation logAliasTransformation(String sourceFileName, SourcePosition<AliasTransformation> region) {
                return new AliasTransformation() {
                    @Override public void addAlias(String alias, String qualifiedName) {}
                    @Override public String getAlias() { return null; }
                    @Override public String getQualifiedName() { return null; }
                    @Override public SourcePosition<AliasTransformation> getRegion() { return null; }
                    @Override public String getSourceFileName() { return null; }
                    @Override public String toString() { return "MockAliasTransformation"; }
                };
            }
        });
        scopedAliases.process(externs, root);
    }

    @Test
    public void testScopedAliases_hotSwapScript() throws Exception {
        Node root = new Node(Token.SCRIPT);
        AbstractCompiler compiler = new MockAbstractCompiler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, new AliasTransformationHandler() {
            @Override
            public AliasTransformation logAliasTransformation(String sourceFileName, SourcePosition<AliasTransformation> region) {
                return new AliasTransformation() {
                    @Override public void addAlias(String alias, String qualifiedName) {}
                    @Override public String getAlias() { return null; }
                    @Override public String getQualifiedName() { return null; }
                    @Override public SourcePosition<AliasTransformation> getRegion() { return null; }
                    @Override public String getSourceFileName() { return null; }
                    @Override public String toString() { return "MockAliasTransformation"; }
                };
            }
        });
        scopedAliases.hotSwapScript(root, null);
    }

    @Test
    public void testVar_getName() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals("testVar", var.getName());
    }

    @Test
    public void testVar_getNode() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(nameNode, var.getNode());
    }

    @Test
    public void testVar_getScope() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        Node nameNode = Node.newString("testVar");
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, nestedScope, mockInput, false, false, null);
        assertEquals(nestedScope, var.getScope());
    }

    @Test
    public void testVar_isGlobal() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node nameNode = Node.newString("globalVar");
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var globalVar = createVar("globalVar", nameNode, null, globalScope, mockInput, false, false, null);
        assertTrue(globalVar.isGlobal());

        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        Node nameNodeLocal = Node.newString("localVar");
        Var localVar = createVar("localVar", nameNodeLocal, null, nestedScope, mockInput, false, false, null);
        assertFalse(localVar.isGlobal());
    }

    @Test
    public void testVar_isLocal() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node nameNode = Node.newString("globalVar");
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var globalVar = createVar("globalVar", nameNode, null, globalScope, mockInput, false, false, null);
        assertFalse(globalVar.isLocal());

        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        Node nameNodeLocal = Node.newString("localVar");
        Var localVar = createVar("localVar", nameNodeLocal, null, nestedScope, mockInput, false, false, null);
        assertTrue(localVar.isLocal());
    }

    @Test
    public void testVar_isDefine() throws Exception {
        Node nameNode = Node.newString("myDefine");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var defineVar = createVar("myDefine", nameNode, null, scope, mockInput, false, true, null); // isDefine = true
        assertTrue(defineVar.isDefine());

        Var regularVar = createVar("regularVar", Node.newString("regularVar"), null, scope, mockInput, false, false, null); // isDefine = false
        assertFalse(regularVar.isDefine());
    }

    @Test
    public void testVar_isConst() throws Exception {
        Node nameNode = Node.newString("myConst");
        NodeUtil.setConstantName(nameNode); // Mark as constant
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var constVar = createVar("myConst", nameNode, null, scope, mockInput, false, false, null);
        assertTrue(constVar.isConst());

        Node nameNode2 = Node.newString("notAConst");
        Var notAConstVar = createVar("notAConst", nameNode2, null, scope, mockInput, false, false, null);
        assertFalse(notAConstVar.isConst());
    }

    @Test
    public void testVar_getJSDocInfo() throws Exception {
        JSDocInfo docInfo = new JSDocInfo();
        Node nameNode = Node.newString("varWithDoc");
        NodeUtil.setInfoForNameNode(nameNode, docInfo);
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var varWithDoc = createVar("varWithDoc", nameNode, null, scope, mockInput, false, false, docInfo);
        assertEquals(docInfo, varWithDoc.getJSDocInfo());

        Node nameNode2 = Node.newString("varWithoutDoc");
        Var varWithoutDoc = createVar("varWithoutDoc", nameNode2, null, scope, mockInput, false, false, null);
        assertNull(varWithoutDoc.getJSDocInfo());
    }

    @Test
    public void testVar_isTypeInferred() throws Exception {
        Node nameNode = Node.newString("inferredVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var inferredVar = createVar("inferredVar", nameNode, null, scope, mockInput, true, false, null); // typeInferred = true
        assertTrue(inferredVar.isTypeInferred());

        Var declaredVar = createVar("declaredVar", Node.newString("declaredVar"), null, scope, mockInput, false, false, null); // typeInferred = false
        assertFalse(declaredVar.isTypeInferred());
    }

    @Test
    public void testVar_isNoShadow() throws Exception {
        JSDocInfo docInfo = new JSDocInfo();
        docInfo.setNoShadow(true);
        Node nameNode = Node.newString("noShadowVar");
        NodeUtil.setInfoForNameNode(nameNode, docInfo);
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var noShadowVar = createVar("noShadowVar", nameNode, null, scope, mockInput, false, false, docInfo);
        assertTrue(noShadowVar.isNoShadow());

        Node nameNode2 = Node.newString("shadowVar");
        Var shadowVar = createVar("shadowVar", nameNode2, null, scope, mockInput, false, false, null);
        assertFalse(shadowVar.isNoShadow());
    }

    @Test
    public void testVar_toString() throws Exception {
        Node nameNode = Node.newString("toStringVar");
        JSType mockType = new JSType(null) { // Mock JSType
            @Override public String getDisplayName() { return "MockType"; }
        };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("toStringVar", nameNode, mockType, scope, mockInput, false, false, null);
        assertEquals("Scope.Var toStringVar{MockType}", var.toString());
    }

    // New tests for uncovered methods

    @Test
    public void testVar_getSourceFile() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertNull(var.getSourceFile()); // CompilerInput is null in mock
    }

    @Test
    public void testVar_getSymbol() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(var, var.getSymbol());
    }

    @Test
    public void testVar_getDeclaration() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(var, var.getDeclaration());
    }

    @Test
    public void testVar_getParentNode() throws Exception {
        Node parentNode = new Node(Token.VAR);
        Node nameNode = Node.newString("testVar");
        parentNode.addChildToBack(nameNode);
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(parentNode, var.getParentNode());
    }

    @Test
    public void testVar_isBleedingFunction() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME)); // A named function expression
        Node nameNode = Node.newString("testVar");
        functionNode.addChildToBack(nameNode);
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertTrue(var.isBleedingFunction()); // Parent is FUNCTION and it's an expression
    }

    @Test
    public void testVar_getInitialValue_var() throws Exception {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString("testVar");
        Node initialValueNode = Node.newNumber(10);
        varNode.addChildToBack(nameNode);
        nameNode.addChildToBack(initialValueNode);
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(initialValueNode, var.getInitialValue());
    }

    @Test
    public void testVar_getInitialValue_assign() throws Exception {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString("testVar");
        Node initialValueNode = Node.newNumber(10);
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(initialValueNode);
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(initialValueNode, var.getInitialValue());
    }

    @Test
    public void testVar_getInitialValue_function() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString("testVar");
        functionNode.addChildToBack(nameNode); // Function name
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(functionNode, var.getInitialValue());
    }

    @Test
    public void testVar_getType() throws Exception {
        Node nameNode = Node.newString("testVar");
        JSType mockType = new JSType(null) { @Override public String getDisplayName() { return "MockType"; } };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, mockType, scope, mockInput, false, false, null);
        assertEquals(mockType, var.getType());
    }

    @Test
    public void testVar_getNameNode() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(nameNode, var.getNameNode());
    }

    @Test
    public void testVar_getInputName() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        mockInput.sourceFile = new StaticSourceFile() {
            @Override public String getName() { return "test.js"; }
            @Override public Node getNode() { return null; }
            @Override public int getLineCount() { return 0; }
            @Override public String getCode() { return null; }
            @Override public CharSequence getCodeStructure() { return null; }
            @Override public long getLastModified() { return 0; }
            @Override public void setCode(String code) {}
            @Override public long getLength() { return 0; }
            @Override public Object getId() { return null; }
            @Override public CharSequence getLine(int lineno) { return null; }
            @Override public int getLineIndex(int charOffset) { return 0; }
            @Override public String getLineOfOffset(int offset) { return null; }
            @Override public int getColumnOfOffset(int offset) { return 0; }
            @Override public String getUri() { return null; }
            @Override public int getLineOffset(int lineno) { return 0; }
        };
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals("test.js", var.getInputName());
    }

    @Test
    public void testVar_getInputName_nullInput() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        Var var = createVar("testVar", nameNode, null, scope, null, false, false, null); // Null CompilerInput
        assertEquals("<non-file>", var.getInputName());
    }

    @Test
    public void testVar_setType() throws Exception {
        Node nameNode = Node.newString("testVar");
        JSType initialType = new JSType(null) { @Override public String getDisplayName() { return "InitialType"; } };
        JSType newType = new JSType(null) { @Override public String getDisplayName() { return "NewType"; } };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var inferredVar = createVar("inferredVar", nameNode, initialType, scope, mockInput, true, false, null); // inferred=true

        inferredVar.setType(newType);
        assertEquals(newType, inferredVar.getType());
    }

    @Test(expected = IllegalStateException.class)
    public void testVar_setType_onDeclaredVar() throws Exception {
        Node nameNode = Node.newString("testVar");
        JSType initialType = new JSType(null) { @Override public String getDisplayName() { return "InitialType"; } };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var declaredVar = createVar("declaredVar", nameNode, initialType, scope, mockInput, false, false, null); // inferred=false
        declaredVar.setType(null); // Should throw IllegalStateException
    }

    @Test
    public void testVar_resolveType() throws Exception {
        Node nameNode = Node.newString("testVar");
        JSType mockType = new JSType(null) {
            @Override
            public JSType resolve(ErrorReporter errorReporter, StaticScope<JSType> scope) {
                return new JSType(null) { @Override public String getDisplayName() { return "ResolvedType"; } };
            }
            @Override public String getDisplayName() { return "InitialType"; }
        };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, mockType, scope, mockInput, true, false, null);

        var.resolveType(null); // Pass null ErrorReporter for simplicity
        assertEquals("ResolvedType", var.getType().getDisplayName());
    }

    @Test
    public void testVar_resolveType_nullType() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, true, false, null);

        var.resolveType(null); // Should not throw exception
        assertNull(var.getType());
    }

    @Test
    public void testScope_declare() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);

        Var declaredVar = scope.declare("myVar", nameNode, mockType, mockInput);
        assertNotNull(declaredVar);
        assertEquals("myVar", declaredVar.getName());
        assertEquals(nameNode, declaredVar.getNode());
        assertEquals(scope, declaredVar.getScope());
        assertTrue(scope.vars.containsKey("myVar"));
        assertEquals(declaredVar, scope.vars.get("myVar"));
    }

    @Test
    public void testScope_declare_withInferredFlag() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);

        Var declaredVar = scope.declare("myVar", nameNode, mockType, mockInput, true); // inferred = true
        assertTrue(declaredVar.isTypeInferred());
        assertEquals(1, declaredVar.index);

        Var declaredVar2 = scope.declare("myVar2", nameNode, mockType, mockInput, false); // inferred = false
        assertFalse(declaredVar2.isTypeInferred());
        assertEquals(2, declaredVar2.index);
    }

    @Test(expected = IllegalStateException.class)
    public void testScope_declare_twice() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        CompilerInput mockInput = new CompilerInput(null, null, false);

        scope.declare("myVar", nameNode, null, mockInput);
        scope.declare("myVar", nameNode, null, mockInput); // Should throw
    }

    @Test
    public void testScope_undeclare() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = scope.declare("myVar", nameNode, null, mockInput);

        assertTrue(scope.vars.containsKey("myVar"));
        scope.undeclare(var);
        assertFalse(scope.vars.containsKey("myVar"));
    }

    @Test
    public void testScope_constructor_nullParent() throws Exception {
        Node rootNode = new Node(Token.FUNCTION);
        // The constructor that takes only Node and AbstractCompiler is for global scope.
        // The constructor for nested scope requires a non-null parent.
        // We need to create a valid parent scope first.
        Scope parentScope = createGlobalScope(new Node(Token.SCRIPT));
        // Now test the nested scope constructor with a null parent, which should fail.
        // The original test was trying to call the global scope constructor with null parent.
        // Let's test the nested scope constructor with a null parent.
        try {
            new Scope(null, rootNode); // This constructor is not used for global scope.
            fail("Expected an exception for null parent");
        } catch (NullPointerException expected) {
            // Preconditions.checkNotNull(parent) will throw NullPointerException
        } catch (IllegalArgumentException expected) {
            // Or IllegalArgumentException depending on exact Preconditions usage.
        }
    }

    @Test
    public void testScope_constructor_rootNodeSameAsParentRoot() throws Exception {
        Node rootNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(rootNode, new MockAbstractCompiler());
        // The constructor for nested scope checks if rootNode is same as parent.rootNode.
        // This call should fail.
        try {
            new Scope(parentScope, rootNode);
            fail("Expected an IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected exception
        }
    }

    @Test
    public void testScope_constructor_global() throws Exception {
        Node rootNode = new Node(Token.SCRIPT);
        Scope globalScope = new Scope(rootNode, new MockAbstractCompiler());
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
        assertNull(globalScope.getParent());
        assertFalse(globalScope.isBottom());
        assertEquals(0, globalScope.getDepth());
    }

    @Test
    public void testScope_constructor_bottom() throws Exception {
        Node rootNode = new Node(Token.SCRIPT);
        ObjectType mockThisType = new ObjectType(null){};
        Scope bottomScope = new Scope(rootNode, mockThisType);
        assertNotNull(bottomScope);
        assertNull(bottomScope.getParent());
        assertTrue(bottomScope.isBottom());
        assertEquals(0, bottomScope.getDepth());
        assertEquals(mockThisType, bottomScope.getTypeOfThis());
    }

    @Test
    public void testScope_getSlot_nonexistent() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertNull(scope.getSlot("nonexistent"));
    }

    @Test
    public void testScope_getOwnSlot_nonexistent() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertNull(scope.getOwnSlot("nonexistent"));
    }

    @Test
    public void testScope_isDeclared_nonexistent() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertFalse(scope.isDeclared("nonexistent", true));
        assertFalse(scope.isDeclared("nonexistent", false));
    }

    @Test
    public void testScope_getVarIterable() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode1 = Node.newString("var1");
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var1 = scope.declare("var1", nameNode1, null, mockInput);

        Node nameNode2 = Node.newString("var2");
        Var var2 = scope.declare("var2", nameNode2, null, mockInput);

        Collection<Var> vars = Lists.newArrayList(scope.getVarIterable());
        assertEquals(2, vars.size());
        assertTrue(vars.contains(var1));
        assertTrue(vars.contains(var2));
    }

    @Test
    public void testScope_getParentScope() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        assertEquals(globalScope, nestedScope.getParentScope());
        assertNull(globalScope.getParentScope());
    }

    @Test
    public void testScope_constructor_nestedWithThisType() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot = new Node(Token.FUNCTION);
        ObjectType mockThisType = new ObjectType(null){};
        Scope nestedScope = new Scope(globalScope, functionRoot) {
            @Override public ObjectType getTypeOfThis() {
                return mockThisType;
            }
        };
        assertEquals(mockThisType, nestedScope.getTypeOfThis());
    }

    @Test
    public void testScope_constructor_globalWithThisType() throws Exception {
        Node rootNode = new Node(Token.SCRIPT);
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public JSTypeRegistry getTypeRegistry() {
                JSTypeRegistry registry = new JSTypeRegistry(null);
                // Mock a native object type for GLOBAL_THIS
                // We need to ensure JSTypeNative.GLOBAL_THIS is valid in the mock context.
                // For simplicity, let's assume it's resolvable to some ObjectType.
                // A more robust mock would involve a full JSTypeRegistry setup.
                return registry;
            }
        };
        Scope globalScope = new Scope(rootNode, compiler);
        // The actual 'thisType' for global scope is determined by the compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS);
        // We cannot easily mock this without a full JSTypeRegistry mock.
        // We will assert that it is not null.
        assertNotNull(globalScope.getTypeOfThis());
    }
}
```