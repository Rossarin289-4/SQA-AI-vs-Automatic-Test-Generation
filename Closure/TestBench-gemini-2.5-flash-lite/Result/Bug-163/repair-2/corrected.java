package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.Property;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol;
import com.google.javascript.rhino.IR;
import java.io.Serializable;
import java.util.Iterator;
import java.util.logging.Logger;
import java.io.IOException;

// Mock CodingConvention - Minimal implementation to satisfy the compiler
class MockCodingConvention implements CodingConvention {
    @Override public String extractPackageName(Node node) { return null; }
    @Override public String extractClassName(Node node) { return null; }
    @Override public String extractInterfaceName(Node node) { return null; }
    @Override public boolean isAbstractMethod(Node node) { return false; }
    @Override public String getAbstractMethodName(Node node) { return null; }
    @Override public String getPropertySignature(Node node) { return null; }
    @Override public String getPropertyConvention(String name) { return null; }
    @Override public String getExportedNamespace(Node node) { return null; }
    @Override public String getGlobalObject(Node node) { return null; }
    @Override public boolean isGlobalAccessible(String name) { return false; }
    @Override public boolean isExported(String name) { return false; }
    @Override public void declare(NodeTraversal t, Var var, Node value) {}
    @Override public String getCtorName(Node node) { return null; }
    @Override public String getGlobalObject(String name) { return null; }
    @Override public String getQualifiedName(Node node) { return null; }
    @Override public String getSource (Node node) { return null; }
    @Override public String[] getImportNamespace(Node node) { return null; }
    @Override public boolean isInterface(Node node) { return false; }
    @Override public boolean isInnerClass(Node node) { return false; }
    @Override public boolean isPrivate(Node node) { return false; }
    @Override public boolean isConstructor(Node node) { return false; }
    @Override public String getThisName(Node node) { return null; }
    @Override public String getVarSignature(Node node) { return null; }
    @Override public String getArgSignature(Node node) { return null; }
    @Override public String getPrototypeClassName(Node node) { return null; }
    @Override public String getPrototypePropertyName(Node node) { return null; }
    @Override public String getSetterKey(Node node) { return null; }
    @Override public String getGetterKey(Node node) { return null; }
    @Override public String getCallSignature(Node node) { return null; }
    @Override public String getSuperclassName(Node node) { return null; }
    @Override public void validateDeclaration(Node node) {}
    @Override public void declare(NodeTraversal t, Var var) {}
    // Methods added for newer CodingConvention interface versions to compile
    @Override public String[] getAssertionFunctions() { return null; }
    @Override public String getCallParameterMap(Node node) { return null; }
    @Override public String getObjectDestructuringShorthand(Node node) { return null; }
    @Override public String getArrayDestructuringShorthand(Node node) { return null; }
    @Override public String getObjectLiteralKey(Node node) { return null; }
    @Override public String getTemplatizedTypeSuffix(Node node) { return null; }
    @Override public String getTypedArrayInstantiation(Node node) { return null; }
    @Override public String getOptionalParameterKey(Node node) { return null; }
    @Override public String getRestParameterKey(Node node) { return null; }
    @Override public String getPropertyOf(Node node) { return null; }
    @Override public String getPropVar(Node node) { return null; }
    @Override public String getFunctionConstructorName(Node node) { return null; }
    @Override public String getEnumKey(Node node) { return null; }
    @Override public boolean isExported(Node node) { return false; }
    @Override public boolean isPrivate(Node node, String parenName) { return false; }
    @Override public boolean isEquivalentParameter(Node node, Node node2) { return false; }
    @Override public boolean isPropertyOfObject(Node node) { return false; }
    @Override public boolean isRequiredFunction(Node node) { return false; }
    @Override public boolean isAnnotatedFunction(Node node) { return false; }
    @Override public boolean isMethodDeclaration(Node node) { return false; }
    @Override public boolean isStaticMethod(Node node) { return false; }
    @Override public boolean isConstructorOrInterfaceMethod(Node node) { return false; }
    @Override public boolean isInterfaceMethod(Node node) { return false; }
    @Override public boolean isPrototypeMethod(Node node) { return false; }
    @Override public boolean isPrototypeProperty(Node node) { return false; }
    @Override public boolean isThisClass(Node node) { return false; }
    @Override public boolean isThisSuper(Node node) { return false; }
    @Override public boolean isClassOrInterfaceMember(Node node) { return false; }
    @Override public boolean isDerivedClass(Node node) { return false; }
    @Override public boolean isConstructorParent(Node node) { return false; }
    @Override public boolean isInterfaceBaseType(Node node) { return false; }
    @Override public boolean isFieldDeclaration(Node node) { return false; }
    @Override public boolean isStatic(Node node) { return false; }
    @Override public boolean isAmbientGoog(Node node) { return false; }
    @Override public boolean isGoogScopedPropertyReference(Node node) { return false; }
    @Override public boolean isImplicitlyCallable(Node node) { return false; }
    @Override public boolean isCallToFunctionConstructor(Node node) { return false; }
    @Override public boolean isCallToFunctionExpression(Node node) { return false; }
    @Override public boolean isFunctionExpression(Node node) { return false; }
    @Override public boolean isAnonymousFunction(Node node) { return false; }
    @Override public boolean isConstructor(Node node, String name) { return false; }
    @Override public boolean isMethod(Node node) { return false; }
    @Override public boolean isGetter(Node node) { return false; }
    @Override public boolean isSetter(Node node) { return false; }
    @Override public boolean isGetterOrSetter(Node node) { return false; }
    @Override public boolean isPrototype(Node node) { return false; }
    @Override public boolean isPrototype(String name) { return false; }
    @Override public boolean isPrivate(Node node, String name, String parenName) { return false; }
    @Override public boolean isOptionalParam(Node node) { return false; }
    @Override public boolean isRestParam(Node node) { return false; }
    @Override public boolean isVarArgsFn(Node node) { return false; }
    @Override public boolean isInterface(Node node, String name) { return false; }
    @Override public boolean isArrayLike(Node node) { return false; }
    @Override public boolean isArray(Node node) { return false; }
    @Override public boolean isString(Node node) { return false; }
    @Override public boolean isBoolean(Node node) { return false; }
    @Override public boolean isNumber(Node node) { return false; }
    @Override public boolean isNull(Node node) { return false; }
    @Override public boolean isUndefined(Node node) { return false; }
    @Override public boolean isThis(Node node) { return false; }
    @Override public boolean isAssign(Node node) { return false; }
    @Override public boolean isQualifiedName(Node node) { return false; }
    @Override public boolean isOptionalParam(String name) { return false; }
    @Override public boolean isRestParam(String name) { return false; }
    @Override public boolean isVarArgsParam(String name) { return false; }
    @Override public boolean isBlock(Node node) { return false; }
    @Override public boolean isEmptyBlock(Node node) { return false; }
    @Override public boolean isExpression(Node node) { return false; }
    @Override public boolean isLabeledStatement(Node node) { return false; }
    @Override public boolean isBreak(Node node) { return false; }
    @Override public boolean isContinue(Node node) { return false; }
    @Override public boolean isReturn(Node node) { return false; }
    @Override public boolean isThrow(Node node) { return false; }
    @Override public boolean isCase(Node node) { return false; }
    @Override public boolean isDefault(Node node) { return false; }
    @Override public boolean isSwitch(Node node) { return false; }
    @Override public boolean isIf(Node node) { return false; }
    @Override public boolean isFor(Node node) { return false; }
    @Override public boolean isForIn(Node node) { return false; }
    @Override public boolean isDo(Node node) { return false; }
    @Override public boolean isWhile(Node node) { return false; }
    @Override public boolean isTry(Node node) { return false; }
    @Override public boolean isCatch(Node node) { return false; }
    @Override public boolean isFinally(Node node) { return false; }
    @Override public boolean isHook(Node node) { return false; }
    @Override public boolean isComma(Node node) { return false; }
    @Override public boolean isAssign(Node node, String name) { return false; }
    @Override public boolean isCallToName(Node node, String name) { return false; }
    @Override public boolean isCallToProperty(Node node, String name) { return false; }
    @Override public boolean isCallToProperty(Node node, String name, String object) { return false; }
    @Override public boolean isCallToConstructor(Node node, String name) { return false; }
    @Override public boolean isCallToConstructor(Node node, String name, String object) { return false; }
    @Override public boolean isCallToEnum(Node node, String name, String object) { return false; }
    @Override public boolean isPrototypeOrConstructorCall(Node node) { return false; }
    @Override public boolean isPrivate(Node node, Node paren) { return false; }
    @Override public boolean isPrototypeMethod(Node node, String name) { return false; }
    @Override public boolean isPrototypeOrConstructor(Node node) { return false; }
    @Override public boolean isOptionalParam(Node node, String name) { return false; }
    @Override public boolean isVarArgsFn(Node node, String name) { return false; }
    @Override public boolean isOptionalParam(String name, Node node) { return false; }
    @Override public boolean isRestParam(String name) { return false; }
    @Override public boolean isVarArgsParam(String name) { return false; }
    @Override public boolean isRestParam(Node node, String name) { return false; }
    @Override public boolean isVarArgsParam(Node node, String name) { return false; }
    @Override public boolean isVar(Node node) { return false; }
    @Override public boolean isOptionalParam(String name, Node node, String parenName) { return false; }
    @Override public boolean isRestParam(String name, Node node, Node paren) { return false; }
    @Override public boolean isVarArgsParam(String name, Node node, Node paren) { return false; }
    @Override public boolean isOptionalParam(String name, Node node, Node paren, String parenName) { return false; }
    @Override public boolean isRestParam(String name, Node node, Node paren, String parenName) { return false; }
    @Override public boolean isVarArgsParam(String name, Node node, Node paren, String parenName) { return false; }
    @Override public boolean isVarArgsFn(Node node, String name, Node paren, String parenName) { return false; }
    @Override public boolean isOptionalParam(String name, Node node, Node paren, String parenName, boolean hasAnnotations) { return false; }
    @Override public boolean isRestParam(String name, Node node, Node paren, String parenName, boolean hasAnnotations) { return false; }
    @Override public boolean isVarArgsParam(String name, Node node, Node paren, String parenName, boolean hasAnnotations) { return false; }
    @Override public boolean isVarArgsFn(Node node, String name, Node paren, String parenName, boolean hasAnnotations) { return false; }
    @Override public boolean isOptionalParam(String name, Node node, Node paren, String parenName, boolean hasAnnotations, boolean isFromClosure) { return false; }
    @Override public boolean isRestParam(String name, Node node, Node paren, String parenName, boolean hasAnnotations, boolean isFromClosure) { return false; }
    @Override public boolean isVarArgsParam(String name, Node node, Node paren, String parenName, boolean hasAnnotations, boolean isFromClosure) { return false; }
    @Override public boolean isVarArgsFn(Node node, String name, Node paren, String parenName, boolean hasAnnotations, boolean isFromClosure) { return false; }
}

// Mock Compiler - Minimal implementation for testing
class MockCompiler implements AbstractCompiler {
    private CodingConvention codingConvention = new MockCodingConvention();
    private JSModuleGraph moduleGraph = null;
    private Node syntheticCodeRoot = IR.script();

    @Override
    public Node getNodeForCodeInsertion(JSModule module) {
        return syntheticCodeRoot;
    }

    @Override
    public void report(JSError error) {
        // No-op for tests
    }

    @Override
    public void reportCodeChange() {
        // No-op for tests
    }

    @Override
    public JSModuleGraph getModuleGraph() {
        return moduleGraph;
    }

    public void setModuleGraph(JSModuleGraph moduleGraph) {
        this.moduleGraph = moduleGraph;
    }

    @Override
    public CodingConvention getCodingConvention() {
        return codingConvention;
    }

    @Override
    public void setErrorManager(ErrorManager errorManager) {} // No-op

    @Override
    public boolean isIdeMode() { return false; }

    @Override
    public Node parseSyntheticCode(String code) {
        // Basic parsing for STUB_DECLARATIONS
        if (code.contains("JSCompiler_stubMap")) {
            return IR.script(
                IR.var(IR.name("JSCompiler_stubMap"), IR.arraylit()),
                IR.function(IR.name("JSCompiler_stubMethod"), IR.paramList(IR.name("JSCompiler_stubMethod_id")), IR.block(IR.returnNode(IR.call(IR.getprop(IR.name("JSCompiler_stubMap"), IR.name("JSCompiler_stubMethod_id")))))),
                IR.function(IR.name("JSCompiler_unstubMethod"), IR.paramList(IR.name("JSCompiler_unstubMethod_id"), IR.name("JSCompiler_unstubMethod_body")), IR.block(IR.exprResult(IR.assign(IR.getprop(IR.name("JSCompiler_stubMap"), IR.name("JSCompiler_unstubMethod_id")), IR.name("JSCompiler_unstubMethod_body")))))
            );
        }
        return IR.script();
    }
    
    // These methods are part of AbstractCompiler but not directly called by the code under test in this context.
    // Providing minimal implementations for compilation.
    @Override public ControlFlowGraph<Node> computeCFG(Node root) { throw new UnsupportedOperationException("Not implemented"); }
    @Override public PassConfig getPassConfig() { throw new UnsupportedOperationException("Not implemented"); }
    @Override public void setPassConfig(PassConfig config) {}
    @Override public VarScopeCreator getDefaultVarScopeCreator() { throw new UnsupportedOperationException("Not implemented"); }
    @Override public JSErrorReporter getErrorReporter() { throw new UnsupportedOperationException("Not implemented"); }
    @Override public Injector getInjector() { throw new UnsupportedOperationException("Not implemented"); }
    @Override public void setFixedPoint(boolean fixedPoint) {}
    @Override public boolean isFixedPoint() { return false;}
    @Override public VarMap getVarMap() { throw new UnsupportedOperationException("Not implemented"); }
    @Override public VariableMap getVariableMap() { throw new UnsupportedOperationException("Not implemented"); }
    @Override public StringMap getStringMap() { throw new UnsupportedOperationException("Not implemented"); }
    @Override public CodingConvention.AssertionFunctionSpec getAssertionFunctionSpec(Node callNode) { return null;}
    @Override public String getRuntimeTypeString(Node node) { return null;}
    @Override public String getRuntimeTypeString(Node node, String unknownKey) { return null;}
    @Override public Set<String> getExportedNames(JSModule module) { return ImmutableSet.of(); }
    @Override public String getAstDotGraph(Node n) { return null; }
    @Override public String getDefines() { return null; }
    @Override public String getSourceMapPath(String filename) { return null;}
    @Override public void setSourceMapPath(String filename, String sourceMapPath) {}
    @Override public String getFileName() { return null;}
    @Override public void setFileName(String fileName) {}
    @Override public String getFileOverview() { return null;}
    @Override public void setFileOverview(String fileOverview) {}
    @Override public SourceExcerptProvider getSourceExcerptProvider() { return null;}
    @Override public void setSourceExcerptProvider(SourceExcerptProvider sourceExcerptProvider) {}
    @Override public boolean isTypeCheckScope(NodeTraversal traversal) { return false; }
    @Override public Scope getTopScope() { return null; }
    @Override public void setTopScope(Scope topScope) {}
    @Override public boolean shouldReport(DiagnosticType diagnosticType) { return false; }
    @Override public void regress() {}
    @Override public void setExternVerificationMode(ExternVerificationMode mode) {}
    @Override public externs.SourceAst getExternAst() { return null;}
    @Override public void setExternAst(externs.SourceAst ast) {}
    @Override public externs.SourceAst getSourceAst() { return null;}
    @Override public void setSourceAst(externs.SourceAst ast) {}
    @Override public void setProgress(CodingProgress progress) {}
    @Override public CodingProgress getProgress() { return CodingProgress.COMPILING; }
    @Override public VarMap getInjects() { throw new UnsupportedOperationException("Not implemented"); }
    @Override public void setInjects(VarMap injects) {}
    @Override public boolean canGenerateSources() { return false; }
    @Override public void setCanGenerateSources(boolean canGenerateSources) {}
    @Override public String getSourceMapFormat() { return null; }
    @Override public void setSourceMapFormat(String format) {}
    @Override public SourceMap generateSourceMap(SourceFile sourceFile) { return null;}
    @Override public void setSourceMapGenerator(SourceMap generator) {}
    @Override public SourceMap getSourceMapGenerator() { return null;}
    @Override public boolean shouldGenerateSourceMap() { return false;}
    @Override public Node getRoot() { return null; }
    @Override public void setRoot(Node root) {}
    @Override public void setErrorManager(com.google.javascript.jscomp.ErrorManager errorManager) {}
    @Override public void validate() {}
    @Override public void setIdeMode(boolean ideMode) {}
    @Override public String getAstNodeString(Node n) { return null;}
    @Override public void setAstNodeString(String s) {}
    @Override public void enableRuntimeTypeCheck(Node root) {}
    @Override public void injectSourceMap(Node root) {}
    @Override public void setSymbolTable(SymbolTable symbolTable) {}
    @Override public SymbolTable getSymbolTable() { return null; }
    @Override public Node getExternsRoot() { return null; }
    @Override public void setExternsRoot(Node externsRoot) {}
}

// Mock JSModuleGraph - Minimal implementation for testing
class MockJSModuleGraph extends JSModuleGraph {
    private List<JSModule> modules = Lists.newArrayList();

    MockJSModuleGraph() {
        super(Lists.newArrayList()); // Initialize superclass with empty list
    }

    public void addModuleAndDependency(JSModule module, JSModule dependency) {
        modules.add(module);
        if (dependency != null) {
            module.addDependency(dependency);
        }
        // Re-initialize superclass with updated modules to make its methods work.
        // This is a simplified approach for testing. A real graph implementation would be more complex.
        super.modules = this.modules; // Assuming 'modules' is accessible or using a setter/re-init
    }
    
    @Override
    public JSModule getDeepestCommonDependencyInclusive(JSModule m1, JSModule m2) {
        if (m1 == null || m2 == null) return null;
        if (m1.equals(m2)) return m1;

        // A simplified dependency check:
        // If m1 is a dependency of m2 (or vice-versa), that's the common ancestor.
        // Otherwise, if they are in the same module list, the first one added is often the root.
        Set<JSModule> deps1 = new LinkedHashSet<>();
        deps1.add(m1);
        deps1.addAll(getAllDependencies(m1));
        
        Set<JSModule> deps2 = new LinkedHashSet<>();
        deps2.add(m2);
        deps2.addAll(getAllDependencies(m2));

        for (JSModule mod : modules) {
            if (deps1.contains(mod) && deps2.contains(mod)) {
                // Find the deepest one
                JSModule deepest = null;
                for (JSModule commonMod : deps1) {
                    if (deps2.contains(commonMod)) {
                        if (deepest == null || dependsOn(deepest, commonMod)) {
                            deepest = commonMod;
                        }
                    }
                }
                return deepest;
            }
        }
        return null;
    }

    private Set<JSModule> getAllDependencies(JSModule module) {
        Set<JSModule> allDeps = new HashSet<>();
        Deque<JSModule> queue = new ArrayDeque<>(module.getDependencies());
        while (!queue.isEmpty()) {
            JSModule current = queue.poll();
            if (allDeps.add(current)) {
                queue.addAll(current.getDependencies());
            }
        }
        return allDeps;
    }

    @Override
    public boolean dependsOn(JSModule m1, JSModule m2) {
        if (m1 == null || m2 == null) return false;
        if (m1.equals(m2)) return false;
        
        Set<JSModule> allDeps = getAllDependencies(m1);
        return allDeps.contains(m2);
    }
    
    @Override
    public Collection<JSModule> getAllModules() {
        return modules;
    }
    
    @Override
    public int getModuleCount() {
        return modules.size();
    }
    
    @Override
    public JSModule getRootModule() {
        return modules.isEmpty() ? null : modules.get(0);
    }
}

// Mock IdGenerator
class MockIdGenerator extends CrossModuleMethodMotion.IdGenerator {
    private int currentId = 0;
    @Override
    public int newId() {
        return currentId++;
    }
    @Override
    public boolean hasGeneratedAnyIds() {
        return currentId > 0;
    }
}

public class AnalyzePrototypePropertiesTest {
    // Mock compiler and module graph for testing
    private static AbstractCompiler compiler = new MockCompiler();
    private static JSModule module1 = new JSModule("module1");
    private static JSModule module2 = new JSModule("module2");
    private static MockJSModuleGraph moduleGraph = new MockJSModuleGraph();
    private static MockIdGenerator idGenerator = new MockIdGenerator();

    // Helper to create a Node for a property assignment.
    private Node createPropAssign(String objName, String propName, Node value) {
        Node prop = IR.string(propName);
        Node getProp = IR.getprop(IR.name(objName), prop);
        Node assign = IR.assign(getProp, value);
        return IR.exprResult(assign);
    }

    // Helper to create a Node for a function declaration.
    private Node createFunctionNode(String name, Node... bodyStmts) {
        Node body = IR.block(bodyStmts);
        Node fn = IR.function(IR.name(name), IR.paramList(), body);
        return fn;
    }

    // Helper to create a Node for a var declaration.
    private Node createVarNode(String name, Node value) {
        return IR.var(IR.name(name), value);
    }

    @Test
    public void testImplicitlyUsedProperties() throws Exception {
        Node externs = IR.script();
        Node root = IR.script();
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(externs, root);

        // Check if "length", "toString", "valueOf" are added as extern references.
        NameInfo lengthInfo = pass.propertyNameInfo.get("length");
        assertNotNull(lengthInfo);
        assertTrue(lengthInfo.isReferenced());

        NameInfo toStringInfo = pass.propertyNameInfo.get("toString");
        assertNotNull(toStringInfo);
        assertTrue(toStringInfo.isReferenced());

        NameInfo valueOfInfo = pass.propertyNameInfo.get("valueOf");
        assertNotNull(valueOfInfo);
        assertTrue(valueOfInfo.isReferenced());
    }

    @Test
    public void testGlobalReference() throws Exception {
        Node externs = IR.script();
        Node root = IR.script(IR.exprResult(IR.name("globalVar"))); // Access globalVar
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(externs, root);

        NameInfo globalVarInfo = pass.varNameInfo.get("globalVar");
        assertNotNull(globalVarInfo);
        assertTrue(globalVarInfo.isReferenced());
    }

    @Test
    public void testPropertyNameInfoCreation() throws Exception {
        Node root = IR.script(
            createPropAssign("Foo", "bar", IR.string("value"))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertEquals("bar", barInfo.name);
    }

    @Test
    public void testVarNameInfoCreation() throws Exception {
        Node root = IR.script(
            createVarNode("myVar", IR.string("value"))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo myVarInfo = pass.varNameInfo.get("myVar");
        assertNotNull(myVarInfo);
        assertEquals("myVar", myVarInfo.name);
    }

    @Test
    public void testSymbolUseDirectAssignment() throws Exception {
        Node root = IR.script(
            createPropAssign("Foo", "bar", IR.string("value"))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
    }

    @Test
    public void testSymbolUseInObjectLit() throws Exception {
        Node root = IR.script(
            IR.var(IR.name("obj"), IR.objectlit(
                IR.string("prop1"), IR.string("val1"),
                IR.string("prop2"), IR.string("val2")
            ))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo prop1Info = pass.propertyNameInfo.get("prop1");
        assertNotNull(prop1Info);
        assertTrue(prop1Info.isReferenced());

        NameInfo prop2Info = pass.propertyNameInfo.get("prop2");
        assertNotNull(prop2Info);
        assertTrue(prop2Info.isReferenced());
    }

    @Test
    public void testSymbolUseInName() throws Exception {
        Node root = IR.script(
            createVarNode("foo", IR.name("bar"))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.varNameInfo.get("bar"); // Assuming 'bar' is a var
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
    }

    @Test
    public void testPrototypeReference() throws Exception {
        Node root = IR.script(
            IR.assign(
                IR.getprop(IR.name("Foo"), IR.string("prototype")),
                IR.objectlit(IR.string("bar"), IR.string("value"))
            )
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
    }

    @Test
    public void testPrototypeAssignmentToFunction() throws Exception {
        Node functionBody = IR.block(IR.returnNode(IR.string("hello")));
        Node function = IR.function(IR.name("myFunc"), IR.paramList(), functionBody);
        Node root = IR.script(
            createPropAssign("Foo", "bar", function)
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
        assertEquals(1, barInfo.getDeclarations().size());
        assertTrue(barInfo.getDeclarations().peek() instanceof AnalyzePrototypeProperties.AssignmentProperty);
    }

    @Test
    public void testGlobalFunctionDeclaration() throws Exception {
        Node functionBody = IR.block(IR.returnNode(IR.string("global")));
        Node function = IR.function(IR.name("globalFunc"), IR.paramList(), functionBody);
        Node root = IR.script(createVarNode("globalFunc", function));

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo globalFuncInfo = pass.varNameInfo.get("globalFunc");
        assertNotNull(globalFuncInfo);
        assertTrue(globalFuncInfo.isReferenced());
        assertEquals(1, globalFuncInfo.getDeclarations().size());
        assertTrue(globalFuncInfo.getDeclarations().peek() instanceof AnalyzePrototypeProperties.GlobalFunction);
    }

    @Test
    public void testAnonymousFunctionWithNoName() throws Exception {
        Node root = IR.script(
            createVarNode("foo", IR.function(null, IR.paramList(), IR.block()))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        // Check if anonymousNode was created and added to symbolGraph.
        // Accessing package-private field directly for test verification.
        assertNotNull(pass.symbolGraph.getNode(pass.anonymousNode));
    }

    @Test
    public void testGetPropOnPrototype() throws Exception {
        Node root = IR.script(
            IR.assign(
                IR.getprop(IR.getprop(IR.name("Foo"), IR.string("prototype")), IR.string("bar")),
                IR.string("value")
            )
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
    }

    @Test
    public void testGlobalFunctionInGlobalScope() throws Exception {
        Node functionBody = IR.block(IR.returnNode(IR.string("global")));
        Node function = IR.function(IR.name("globalFunc"), IR.paramList(), functionBody);
        Node root = IR.script(function); // Function declaration at top level

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo globalFuncInfo = pass.varNameInfo.get("globalFunc");
        assertNotNull(globalFuncInfo);
        assertTrue(globalFuncInfo.isReferenced());
        assertEquals(1, globalFuncInfo.getDeclarations().size());
    }

    @Test
    public void testGetPropOnProtoChain() throws Exception {
        Node root = IR.script(
            createPropAssign("Foo", "bar",
                IR.call(IR.getprop(IR.name("Foo"), IR.string("prototype")))
            )
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
    }

    @Test
    public void testLiteralPropertyInObjectLit() throws Exception {
        Node map = IR.objectlit(
            IR.string("key1"), IR.string("value1"),
            IR.string("key2"), IR.number(123)
        );
        Node assign = IR.assign(
            IR.getprop(IR.name("Foo"), IR.string("prototype")),
            map
        );
        Node root = IR.script(assign);

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo key1Info = pass.propertyNameInfo.get("key1");
        assertNotNull(key1Info);
        assertTrue(key1Info.isReferenced());
        assertEquals(1, key1Info.getDeclarations().size());
        assertTrue(key1Info.getDeclarations().peek() instanceof AnalyzePrototypeProperties.LiteralProperty);

        NameInfo key2Info = pass.propertyNameInfo.get("key2");
        assertNotNull(key2Info);
        assertTrue(key2Info.isReferenced());
        assertEquals(1, key2Info.getDeclarations().size());
        assertTrue(key2Info.getDeclarations().peek() instanceof AnalyzePrototypeProperties.LiteralProperty);
    }

    @Test
    public void testPrototypePropertyAccessedViaGetProp() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.getprop(IR.name("Foo"), IR.string("bar"))
            )
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
    }

    @Test
    public void testGlobalFunctionAccessedViaName() throws Exception {
        Node functionBody = IR.block(IR.returnNode(IR.string("global")));
        Node function = IR.function(IR.name("globalFunc"), IR.paramList(), functionBody);
        Node root = IR.script(
            createVarNode("caller", IR.call(IR.name("globalFunc")))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo globalFuncInfo = pass.varNameInfo.get("globalFunc");
        assertNotNull(globalFuncInfo);
        assertTrue(globalFuncInfo.isReferenced());
    }

    @Test
    public void testImplicitlyUsedPropertiesInExterns() throws Exception {
        Node externs = IR.script(
            IR.exprResult(IR.getprop(IR.name("Object"), IR.string("toString")))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(externs, IR.script());

        NameInfo toStringInfo = pass.propertyNameInfo.get("toString");
        assertNotNull(toStringInfo);
        assertTrue(toStringInfo.isReferenced()); // Should be marked as referenced from externs
    }

    @Test
    public void testNonFunctionPrototypeAssignment() throws Exception {
        Node root = IR.script(
            createPropAssign("Foo", "bar", IR.string("just a string"))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
        assertEquals(1, barInfo.getDeclarations().size());
        assertTrue(barInfo.getDeclarations().peek() instanceof AnalyzePrototypeProperties.AssignmentProperty);
    }

    @Test
    public void testComplexPrototypeChains() throws Exception {
        Node protoAssign = IR.assign(
            IR.getprop(IR.name("Bar"), IR.string("prototype")),
            IR.objectlit(IR.string("baz"), IR.string("value"))
        );
        Node classDef = IR.var(IR.name("Foo"), IR.function(IR.name("Foo"), IR.paramList(), IR.block()));
        Node propAssign = createPropAssign("Foo", "bar", IR.name("Bar")); // Foo.bar = Bar
        Node root = IR.script(classDef, protoAssign, propAssign);

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo bazInfo = pass.propertyNameInfo.get("baz");
        assertNotNull(bazInfo);
        assertTrue(bazInfo.isReferenced());

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        assertTrue(barInfo.isReferenced());
    }

    @Test
    public void testPropagateReferencesWithModules() throws Exception {
        MockJSModuleGraph moduleGraphWithModules = new MockJSModuleGraph();
        moduleGraphWithModules.addModuleAndDependency(module1, null);
        moduleGraphWithModules.addModuleAndDependency(module2, module1);

        ((MockCompiler) compiler).setModuleGraph(moduleGraphWithModules); // Set module graph on compiler

        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, moduleGraphWithModules, false, false);

        // Module 1: Foo.prototype.bar = function() {};
        Node fn1 = IR.function(null, IR.paramList(), IR.block());
        Node assign1 = IR.assign(
            IR.getprop(IR.getprop(IR.name("Foo"), IR.string("prototype")), IR.string("bar")),
            fn1);
        assign1.putBooleanProp(Node.FREE_CALL, true); // Simulate a call that might affect scope
        
        // Manually add declaration and mark reference for testing propagation
        NameInfo barInfo = pass.getNameInfoForName("bar", SymbolType.PROPERTY);
        pass.symbolGraph.createNode(barInfo);
        AnalyzePrototypeProperties.AssignmentProperty declaration = new AnalyzePrototypeProperties.AssignmentProperty(assign1, null, module1);
        barInfo.getDeclarations().add(declaration);
        
        // Simulate a reference in module 2
        barInfo.markReference(module2);
        // Manually connect to global node to simulate a reference originating from global scope
        pass.symbolGraph.connect(pass.globalNode, module2, barInfo);


        FixedPointGraphTraversal<NameInfo, JSModule> t =
            FixedPointGraphTraversal.newTraversal(new AnalyzePrototypeProperties.PropagateReferences());
        t.computeFixedPoint(pass.symbolGraph, Sets.newHashSet(pass.externNode, pass.globalNode));

        // The deepest common module should be module1, as module2 depends on module1
        assertEquals(module1, barInfo.getDeepestCommonModuleRef());
    }

    @Test
    public void testReadClosureVariables() throws Exception {
        Node outerVar = IR.name("outerVar");
        Node innerFnBody = IR.block(IR.returnNode(outerVar));
        Node innerFn = IR.function(null, IR.paramList(), innerFnBody);
        Node root = IR.script(
            IR.var(IR.name("outerVar"), IR.string("value")),
            IR.exprResult(innerFn)
        );

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo outerVarInfo = pass.varNameInfo.get("outerVar");
        assertNotNull(outerVarInfo);
        assertTrue(outerVarInfo.readsClosureVariables());
    }

    @Test
    public void testGlobalFunctionExported() throws Exception {
        // Mock CodingConvention to mark 'globalFunc' as exported.
        MockCodingConvention exportingConvention = new MockCodingConvention() {
            @Override
            public boolean isExported(String name) {
                return "globalFunc".equals(name);
            }
        };
        ((MockCompiler) compiler).codingConvention = exportingConvention; // Update compiler's convention

        Node functionBody = IR.block(IR.returnNode(IR.string("global")));
        Node function = IR.function(IR.name("globalFunc"), IR.paramList(), functionBody);
        Node root = IR.script(function);

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo globalFuncInfo = pass.varNameInfo.get("globalFunc");
        assertNotNull(globalFuncInfo);
        assertTrue(globalFuncInfo.isReferenced()); // Should be marked as referenced due to export.
    }

    @Test
    public void testAnchorUnusedVars() throws Exception {
        // Mock compiler that anchors unused vars
        MockCompiler anchoringCompiler = new MockCompiler();
        
        Node unusedVar = IR.var(IR.name("unusedVar"), IR.string("value"));
        Node root = IR.script(unusedVar);

        // Pass true for anchorUnusedVars
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(anchoringCompiler, null, false, true);
        pass.process(IR.script(), root);

        NameInfo unusedVarInfo = pass.varNameInfo.get("unusedVar");
        assertNotNull(unusedVarInfo);
        assertTrue(unusedVarInfo.isReferenced()); // Should be marked as referenced due to anchorUnusedVars.
    }

    @Test
    public void testAssignmentPropertyRemoval() throws Exception {
        Node functionNode = IR.function(null, IR.paramList(), IR.block());
        Node assignNode = IR.assign(
            IR.getprop(IR.getprop(IR.name("Foo"), IR.string("prototype")), IR.string("bar")),
            functionNode
        );
        Node exprAssign = IR.exprResult(assignNode);
        Node root = IR.script(exprAssign);

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        AnalyzePrototypeProperties.Property prop = barInfo.getDeclarations().peek();
        assertNotNull(prop);
        assertTrue(prop instanceof AnalyzePrototypeProperties.AssignmentProperty);
        assertEquals(functionNode, prop.getValue());
        
        // The prop.remove() should remove the functionNode from the assignNode's children.
        prop.remove();
        assertEquals(0, assignNode.getChildCount()); // After removing the value, the assignment node should have no children
    }

    @Test
    public void testLiteralPropertyRemoval() throws Exception {
        Node valueNode = IR.string("value");
        Node keyNode = IR.string("baz");
        Node mapNode = IR.objectlit(keyNode, valueNode);
        Node assignNode = IR.assign(IR.getprop(IR.name("Foo"), IR.string("prototype")), mapNode);
        Node root = IR.script(assignNode);

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo bazInfo = pass.propertyNameInfo.get("baz");
        AnalyzePrototypeProperties.Property prop = bazInfo.getDeclarations().peek();
        assertNotNull(prop);
        assertTrue(prop instanceof AnalyzePrototypeProperties.LiteralProperty);

        assertEquals(valueNode, prop.getValue());
        assertEquals(IR.getprop(IR.name("Foo"), IR.string("prototype")), prop.getPrototype());
        
        prop.remove();
        // The key node should be removed from the mapNode.
        assertNull(mapNode.getFirstChild()); // The key node should be removed from the object literal
    }

    @Test
    public void testGlobalFunctionRemoval() throws Exception {
        Node functionNode = IR.function(IR.name("globalFunc"), IR.paramList(), IR.block());
        Node varNode = IR.var(IR.name("globalFunc"), functionNode);
        Node root = IR.script(varNode);

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo globalFuncInfo = pass.varNameInfo.get("globalFunc");
        AnalyzePrototypeProperties.Symbol sym = globalFuncInfo.getDeclarations().peek();
        assertNotNull(sym);
        assertTrue(sym instanceof AnalyzePrototypeProperties.GlobalFunction);
        
        sym.remove();
        // The varNode should have its child (the function node) removed.
        assertNull(varNode.getFirstChild());
    }

    @Test
    public void testNameInfoEquality() throws Exception {
        NameInfo info1 = new NameInfo("testName");
        NameInfo info2 = new NameInfo("testName");
        NameInfo info3 = new NameInfo("otherName");

        assertEquals(info1, info2);
        assertNotEquals(info1, info3);
        assertEquals(info1.hashCode(), info2.hashCode());
        assertNotEquals(info1.hashCode(), info3.hashCode());
    }

    @Test
    public void testNameInfoMarkReference() throws Exception {
        NameInfo info = new NameInfo("testName");
        assertFalse(info.isReferenced());
        
        info.markReference(null); // reference without module
        assertTrue(info.isReferenced());
    }

    @Test
    public void testNameInfoDeepestCommonModuleRef() throws Exception {
        MockJSModuleGraph multiModuleGraph = new MockJSModuleGraph();
        JSModule m1 = new JSModule("m1");
        JSModule m2 = new JSModule("m2");
        JSModule m3 = new JSModule("m3");
        multiModuleGraph.addModuleAndDependency(m1, null);
        multiModuleGraph.addModuleAndDependency(m2, m1);
        multiModuleGraph.addModuleAndDependency(m3, m2);

        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, multiModuleGraph, false, false);
        
        NameInfo info = new NameInfo("testName");
        
        info.markReference(m1);
        assertEquals(m1, info.getDeepestCommonModuleRef());

        info.markReference(m2);
        assertEquals(m1, info.getDeepestCommonModuleRef()); // Deepest common of m1 and m2 is m1

        info.markReference(m3);
        assertEquals(m1, info.getDeepestCommonModuleRef()); // Deepest common of m1, m2, m3 is m1
    }

    @Test
    public void testGetAllNameInfo() throws Exception {
        Node root = IR.script(
            createPropAssign("Foo", "bar", IR.string("value")),
            createVarNode("myVar", IR.string("value"))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        Collection<NameInfo> allNameInfo = pass.getAllNameInfo();
        assertNotNull(allNameInfo);
        assertEquals(2, allNameInfo.size()); // "bar" and "myVar"
        
        Set<String> names = Sets.newHashSet();
        for (NameInfo ni : allNameInfo) {
            names.add(ni.name);
        }
        assertTrue(names.contains("bar"));
        assertTrue(names.contains("myVar"));
    }

    @Test
    public void testTraverseEdge() throws Exception {
        MockJSModuleGraph multiModuleGraph = new MockJSModuleGraph();
        JSModule m1 = new JSModule("m1");
        JSModule m2 = new JSModule("m2");
        multiModuleGraph.addModuleAndDependency(m1, null);
        multiModuleGraph.addModuleAndDependency(m2, m1);

        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, multiModuleGraph, false, false);
        
        NameInfo startNode = new NameInfo("start");
        NameInfo endNode = new NameInfo("end");
        pass.symbolGraph.createNode(startNode);
        pass.symbolGraph.createNode(endNode);
        pass.symbolGraph.connect(startNode, m1, endNode); // Connect start to end in module m1

        AnalyzePrototypeProperties.PropagateReferences edgeCallback = new AnalyzePrototypeProperties.PropagateReferences();
        
        // Simulate startNode being referenced in module m1
        startNode.markReference(m1);
        
        // Call traverseEdge to propagate reference from m1 to m2 (edge is m2 module)
        // The edge parameter represents the module of the edge.
        boolean changed = edgeCallback.traverseEdge(startNode, m1, endNode);
        
        assertTrue(changed);
        assertTrue(endNode.isReferenced());
        assertEquals(m1, endNode.getDeepestCommonModuleRef()); // Reference should be marked with module m1
    }

    @Test
    public void testGetRootVar() throws Exception {
        Node functionNode = IR.function(IR.name("globalFunc"), IR.paramList(), IR.block());
        Node varNode = IR.var(IR.name("globalFunc"), functionNode);
        Node root = IR.script(varNode);

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo globalFuncInfo = pass.varNameInfo.get("globalFunc");
        AnalyzePrototypeProperties.Symbol sym = globalFuncInfo.getDeclarations().peek();
        assertNotNull(sym);
        assertTrue(sym instanceof AnalyzePrototypeProperties.GlobalFunction);

        Var rootVar = ((AnalyzePrototypeProperties.GlobalFunction) sym).getRootVar();
        assertNotNull(rootVar);
        assertEquals("globalFunc", rootVar.getName());
    }

    @Test
    public void testGetModule() throws Exception {
        Node functionNode = IR.function(null, IR.paramList(), IR.block());
        Node assignNode = IR.assign(
            IR.getprop(IR.getprop(IR.name("Foo"), IR.string("prototype")), IR.string("bar")),
            functionNode
        );
        Node root = IR.script(IR.exprResult(assignNode));

        JSModule moduleA = new JSModule("moduleA");
        JSModuleGraph singleModuleGraph = new JSModuleGraph(Lists.newArrayList(moduleA));
        ((MockCompiler) compiler).setModuleGraph(singleModuleGraph);

        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, singleModuleGraph, false, false);
        
        // We need to simulate the traversal to trigger visit() and thus the declaration processing.
        NodeTraversal.traverse(compiler, root, new NodeTraversal.ScopedCallback() {
            @Override
            public void enterScope(NodeTraversal t) {}
            @Override
            public void exitScope(NodeTraversal t) {}
            @Override
            public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
                // Process the function node declaration
                if (n.isFunction() && parent.isExprResult() && parent.getFirstChild() == assignNode) {
                    pass.visit(t, n, parent);
                }
            }
        });

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        AnalyzePrototypeProperties.Property prop = barInfo.getDeclarations().peek();
        assertNotNull(prop);
        assertEquals(moduleA, prop.getModule());
    }
    
    @Test
    public void testGetFunctionNode() throws Exception {
        Node functionBody = IR.block(IR.returnNode(IR.string("hello")));
        Node function = IR.function(IR.name("myFunc"), IR.paramList(), functionBody);
        Node root = IR.script(
            createPropAssign("Foo", "bar", function)
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        AnalyzePrototypeProperties.Property prop = barInfo.getDeclarations().peek();
        assertNotNull(prop);
        assertTrue(prop instanceof AnalyzePrototypeProperties.AssignmentProperty);
        
        // The AssignmentProperty class has getValue() which returns the Node representing the function.
        Node functionNodeFromProp = prop.getValue();
        assertNotNull(functionNodeFromProp);
        assertEquals(function, functionNodeFromProp);
    }
    
    @Test
    public void testImplicitlyUsedPropertiesAreMarked() throws Exception {
        Node externs = IR.script();
        Node root = IR.script();
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(externs, root);

        // Check that implicitly used properties are marked as referenced, even if no explicit usage.
        // This is because they are connected from externNode in the constructor.
        NameInfo lengthInfo = pass.propertyNameInfo.get("length");
        assertNotNull(lengthInfo);
        assertTrue(lengthInfo.isReferenced());
    }
    
    @Test
    public void testSymbolGraphConnection() throws Exception {
        Node root = IR.script(
            createPropAssign("Foo", "bar", IR.string("value"))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        
        NameInfo lengthInfo = pass.propertyNameInfo.get("length");
        assertTrue(pass.symbolGraph.hasNode(pass.externNode));
        assertTrue(pass.symbolGraph.hasNode(lengthInfo));
        // The connect method used for externNode initialization when moduleGraph is null.
        assertTrue(pass.symbolGraph.hasEdge(pass.externNode, null, lengthInfo));
    }

    @Test
    public void testNameInfo_ReadsClosureVariables() throws Exception {
        Node outerVar = IR.name("outerVar");
        Node innerFnBody = IR.block(IR.returnNode(outerVar));
        Node innerFn = IR.function(null, IR.paramList(), innerFnBody);
        Node root = IR.script(
            IR.var(IR.name("outerVar"), IR.string("value")),
            IR.exprResult(innerFn)
        );

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo outerVarInfo = pass.varNameInfo.get("outerVar");
        assertNotNull(outerVarInfo);
        assertTrue(outerVarInfo.readsClosureVariables());
    }

    @Test
    public void testProcessExternProperties() throws Exception {
        Node externs = IR.script(
            IR.exprResult(IR.getprop(IR.name("Object"), IR.string("toString")))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(externs, IR.script());

        NameInfo toStringInfo = pass.propertyNameInfo.get("toString");
        assertNotNull(toStringInfo);
        assertTrue(toStringInfo.isReferenced()); 
        
        // The connection is made with firstModule from the constructor when moduleGraph is not null.
        // If moduleGraph is null, it should connect to null module.
        assertTrue(pass.symbolGraph.hasEdge(pass.externNode, null, toStringInfo));
    }
}
