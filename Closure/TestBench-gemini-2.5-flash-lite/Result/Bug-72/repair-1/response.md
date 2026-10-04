```java
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
import com.google.javascript.jscomp.JSTypeRegistry;
import com.google.javascript.jscomp.LifeCycleStage;
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
    private static class MockAbstractCompiler extends AbstractCompiler {
        @Override public void report(JSError error) {}
        @Override public void reportCodeChange() {}
        @Override public CodingConvention getCodingConvention() { return new CodingConvention() {
            @Override public String extractClassNameIfSynthetic(Node node) { return null; }
            @Override public boolean isAbstractMethodThatShouldNotBeAliased(Node callNode) { return false; }
            @Override public boolean isPrivate(Node node) { return false; }
            @Override public boolean isEquivalentMethodName(String name, String value) { return false; }
            @Override public String getExportedName(Node node) { return null; }
            @Override public boolean isValidDefineSignature(Node n) { return false; }
            @Override public boolean isGetter(Node node) { return false; }
            @Override public boolean isSetter(Node node) { return false; }
            @Override public String getPropertyReferenceName(Node propertyName) { return null; }
            @Override public String getGlobalObjectKey(String key) { return null; }
            @Override public void apply(Node node) {}
            @Override public String getSingletonGetterName(Node node) { return null; }
            @Override public String getAbstractMethodName(Node node) { return null; }
            @Override public String getInterfaceName(Node node) { return null; }
            @Override public boolean isSuperClassOf(Node node, Node node2) { return false; }
            @Override public String getCtorName(Node node) { return null; }
            @Override public boolean isConstructor(Node node) { return false; }
            @Override public boolean isInstanceof(Node node, Node node2) { return false; }
            @Override public boolean isPrototypeAlias(Node node) { return false; }
            @Override public boolean isPrivateMethod(Node node) { return false; }
            @Override public boolean isReservedClassKey(String s) { return false; }
            @Override public boolean isCallToPreferedCtor(Node callNode) { return false; }
            @Override public boolean isFunctionDeclaration(Node n) { return false; }
            @Override public String getFunctionBindingName(Node n) { return null; }
            @Override public String getExportedHookName(Node n) { return null; }
            @Override public String getExportedNamespace(Node n) { return null; }
            @Override public String getExportedVariableFormat(String name) { return null; }
            @Override public String getDelegateNormalizedName(Node n) { return null; }
            @Override public String getSourceFileName(Node n) { return null; }
            @Override public boolean isPropertyOfObject(Node node, String propertyName) { return false; }
            @Override public String getAssetPath(Node node) { return null; }
            @Override public boolean isConstant(Node node) { return false; }
            @Override public boolean isConstantName(Node node) { return false; }
            @Override public String getPropertyObservableName(Node node) { return null; }
            @Override public String getPropertyObservableName(String propertyName) { return null; }
            @Override public String getAmbiguousName(Node node) { return null; }
            @Override public boolean isConstructorParameter(Node node) { return false; }
            @Override public String getInjectableName(String name) { return name; }
            @Override public boolean canBeExtended(Node node) { return false; }
            @Override public boolean isMethod(Node node) { return false; }
            @Override public boolean isPrototypeProperty(Node node) { return false; }
            @Override public String getVariableFormat(String name) { return null; }
            @Override public boolean isGlobalFunction(Node n) { return false; }
            @Override public boolean isGlobalMethod(Node n) { return false; }
            @Override public boolean isGlobalObject(Node n) { return false; }
            @Override public boolean isPrototypeMethod(Node n) { return false; }
            @Override public boolean isFunctionBindable(Node n) { return false; }
            @Override public String getClassName(Node node) { return null; }
            @Override public boolean isImplicitGlobal(Node node) { return false; }
            @Override public boolean isVariableDeclaration(Node n) { return false; }
            @Override public boolean isAnonymousFunction(Node node) { return false; }
            @Override public String normalizeThisAssignment(Node assignment, Node value) { return null; }
            @Override public String getClassesKey(Node node) { return null; }
            @Override public String getPropertyKey(Node node) { return null; }
            @Override public String getThisDefineKey(Node node) { return null; }
            @Override public String getArrayElementDeclaredClass(Node node) { return null; }
            @Override public String getArrayElementClassName(Node node) { return null; }
            @Override public boolean isPropertyOfObjectLiteral(Node node) { return false; }
            @Override public boolean isPropertyOfObjectLiteral(String propertyName) { return false; }
            @Override public boolean isClassDeclaration(Node node) { return false; }
            @Override public boolean isPrototypeProperty(String propertyName) { return false; }
            @Override public boolean isPropertyAssignedToInstance(Node node) { return false; }
            @Override public boolean isConstructorParameter(String name) { return false; }
            @Override public boolean isPrototypeProperty(Node owner, String propertyName) { return false; }
            @Override public boolean isClassMethod(Node node) { return false; }
            @Override public boolean isPrototypeOrConstructorCall(Node node) { return false; }
            @Override public boolean isConstructorOrMethodCall(Node node) { return false; }
            @Override public boolean isPrototypeMethod(String methodName) { return false; }
            @Override public String getRuntimeType(Node node) { return null; }
            @Override public boolean isConstructorOrMethod(String name) { return false; }
            @Override public String getPropertyObservableName(Node propertyOwner, String propertyName) { return null; }
            @Override public boolean isFunctionPrototype(Node n) { return false; }
            @Override public boolean isPrototypeProperty(Node owner, Node property) { return false; }
            @Override public String getFunctionPrototypeName(Node n) { return null; }
            @Override public String getQualifiedName(Node node) { return null; }
            @Override public String getNormalizedStatementName(Node node) { return null; }
            @Override public String getNormalizedStatementName(String name) { return null; }
            @Override public String getPropertyFromObjectKey(Node node) { return null; }
            @Override public String getClassNameFromVar(Node node) { return null; }
            @Override public boolean isConstantClassName(Node node) { return false; }
            @Override public String getAliasName(String name) { return null; }
            @Override public String getSyntheticClassName(Node node) { return null; }
            @Override public String getSyntheticClassName(String name) { return null; }
            @Override public String getAssetSchema(Node node) { return null; }
            @Override public boolean isAnonymousFunction(String name) { return false; }
            @Override public String getFunctionBindingName(String name) { return null; }
            @Override public boolean isCallToPreferedCtor(String functionName) { return false; }
            @Override public boolean isPropertyOfObjectLiteral(Node owner, String propertyName) { return false; }
            @Override public boolean isExported(Node node) { return false; }
            @Override public boolean isFunctionBinding(Node node) { return false; }
            @Override public String getExportedName(String name) { return null; }
            @Override public boolean isPrivate(String name) { return false; }
            @Override public String getDelegateNormalizedName(String name) { return null; }
            @Override public String getAssetPath(String name) { return null; }
            @Override public String getAliasName(Node node) { return null; }
            @Override public String getPrototypeOrConstructorName(Node node) { return null; }
            @Override public String getPrototypeOrConstructorName(String name) { return null; }
            @Override public boolean isFunctionDeclaration(String name) { return false; }
            @Override public String getExportedHookName(String name) { return null; }
            @Override public String getExportedNamespace(String name) { return null; }
            @Override public String getVariableFormat(Node node) { return null; }
            @Override public String getRuntimeType(String name) { return null; }
            @Override public String getThisDefineKey(String name) { return null; }
            @Override public String getArrayElementDeclaredClass(String name) { return null; }
            @Override public String getArrayElementClassName(String name) { return null; }
            @Override public boolean isPropertyOfObject(String ownerName, String propertyName) { return false; }
            @Override public String getPropertyReferenceName(String propertyName) { return null; }
            @Override public String getGlobalObjectKey(Node node) { return null; }
            @Override public String getSingletonGetterName(String name) { return null; }
            @Override public String getAbstractMethodName(String name) { return null; }
            @Override public String getInterfaceName(String name) { return null; }
            @Override public boolean isSuperClassOf(String name, String name2) { return false; }
            @Override public String getCtorName(String name) { return null; }
            @Override public boolean isConstructor(String name) { return false; }
            @Override public boolean isInstanceof(String name, String name2) { return false; }
            @Override public boolean isPrototypeAlias(String name) { return false; }
            @Override public boolean isPrivateMethod(String name) { return false; }
            @Override public boolean isReservedClassKey(Node node) { return false; }
            @Override public boolean isConstructorParameter(Node node, String name) { return false; }
            @Override public boolean isFunctionPrototype(String name) { return false; }
            @Override public boolean isAnonymousFunction(Node node) { return false; }
            @Override public String getAliasName(String name) { return null; }
            @Override public String getSyntheticClassName(String name) { return null; }
            @Override public String getAssetSchema(String name) { return null; }
            @Override public String getQualifiedName(String name) { return null; }
            @Override public String getNormalizedStatementName(Node node) { return null; }
            @Override public String getPropertyFromObjectKey(String name) { return null; }
            @Override public String getClassNameFromVar(String name) { return null; }
            @Override public boolean isConstantClassName(String name) { return false; }
            @Override public boolean isClassDeclaration(String name) { return false; }
            @Override public boolean isPrototypeProperty(String owner, String property) { return false; }
            @Override public boolean isClassMethod(String name) { return false; }
            @Override public boolean isPrototypeOrConstructorCall(String name) { return false; }
            @Override public boolean isPrototypeMethod(String owner, String method) { return false; }
            @Override public String getPropertyObservableName(String ownerName, String propertyName) { return null; }
            @Override public boolean isFunctionBindable(String name) { return false; }
            @Override public String getClassName(String name) { return null; }
            @Override public boolean isImplicitGlobal(String name) { return false; }
            @Override public boolean isVariableDeclaration(String name) { return false; }
            @Override public boolean isFunctionBinding(String name) { return false; }
            @Override public boolean isPropertyAssignedToInstance(String name) { return false; }
            @Override public String getFunctionPrototypeName(String name) { return null; }
            @Override public String getPropertyKey(String name) { return null; }
            @Override public String getThisDefineKey(Node node) { return null; }
            @Override public String getArrayElementDeclaredClass(Node node) { return null; }
            @Override public String getArrayElementClassName(Node node) { return null; }
            @Override public String getAliasName(Node node) { return null; }
            @Override public String getSyntheticClassName(Node node) { return null; }
            @Override public String getAssetPath(Node node) { return null; }
            @Override public String getPrototypeOrConstructorName(Node node) { return null; }
            @Override public String getExportedHookName(Node node) { return null; }
            @Override public String getExportedNamespace(Node node) { return null; }
            @Override public String getVariableFormat(Node node) { return null; }
            @Override public String getRuntimeType(Node node) { return null; }
            @Override public String getPropertyObservableName(Node propertyOwner, Node property) { return null; }
            @Override public String getFunctionPrototypeName(Node node) { return null; }
            @Override public String getQualifiedName(Node node) { return null; }
            @Override public String getNormalizedStatementName(Node node) { return null; }
            @Override public String getPropertyFromObjectKey(Node node) { return null; }
            @Override public String getClassNameFromVar(Node node) { return null; }
            @Override public boolean isConstantClassName(Node node) { return false; }
            @Override public String getPropertyReferenceName(Node node) { return null; }
            @Override public String getGlobalObjectKey(Node node) { return null; }
            @Override public String getSingletonGetterName(Node node) { return null; }
            @Override public String getAbstractMethodName(Node node) { return null; }
            @Override public String getInterfaceName(Node node) { return null; }
            @Override public boolean isSuperClassOf(Node node, Node node2) { return false; }
            @Override public String getCtorName(Node node) { return null; }
            @Override public boolean isConstructor(Node node) { return false; }
            @Override public boolean isInstanceof(Node node, Node node2) { return false; }
            @Override public boolean isPrototypeAlias(Node node) { return false; }
            @Override public boolean isPrivateMethod(Node node) { return false; }
            @Override public boolean isReservedClassKey(Node node) { return false; }
            @Override public boolean isConstructorParameter(Node node, String name) { return false; }
            @Override public boolean isFunctionPrototype(Node node) { return false; }
            @Override public boolean isAnonymousFunction(Node node) { return false; }
            @Override public String getAliasName(Node node) { return null; }
            @Override public String getSyntheticClassName(Node node) { return null; }
            @Override public String getAssetPath(Node node) { return null; }
            @Override public String getPrototypeOrConstructorName(Node node) { return null; }
            @Override public String getExportedHookName(Node node) { return null; }
            @Override public String getExportedNamespace(Node node) { return null; }
            @Override public String getVariableFormat(Node node) { return null; }
            @Override public String getRuntimeType(Node node) { return null; }
            @Override public String getPropertyObservableName(Node propertyOwner, String propertyName) { return null; }
            @Override public String getFunctionPrototypeName(Node node) { return null; }
            @Override public String getQualifiedName(Node node) { return null; }
            @Override public String getNormalizedStatementName(Node node) { return null; }
            @Override public String getPropertyFromObjectKey(Node node) { return null; }
            @Override public String getClassNameFromVar(Node node) { return null; }
            @Override public boolean isConstantClassName(Node node) { return false; }
            @Override public String getPropertyReferenceName(String propertyName) { return null; }
            @Override public String getGlobalObjectKey(String key) { return null; }
            @Override public String getSingletonGetterName(String name) { return null; }
            @Override public String getAbstractMethodName(String name) { return null; }
            @Override public String getInterfaceName(String name) { return null; }
            @Override public boolean isSuperClassOf(String name, String name2) { return false; }
            @Override public String getCtorName(String name) { return null; }
            @Override public boolean isConstructor(String name) { return false; }
            @Override public boolean isInstanceof(String name, String name2) { return false; }
            @Override public boolean isPrototypeAlias(String name) { return false; }
            @Override public boolean isPrivateMethod(String name) { return false; }
            @Override public boolean isReservedClassKey(String s) { return false; }
            @Override public boolean isConstructorParameter(String name) { return false; }
            @Override public boolean isFunctionPrototype(String name) { return false; }
            @Override public String getAliasName(String name) { return null; }
            @Override public String getSyntheticClassName(String name) { return null; }
            @Override public String getAssetPath(String name) { return null; }
            @Override public String getPrototypeOrConstructorName(String name) { return null; }
            @Override public String getExportedHookName(String name) { return null; }
            @Override public String getExportedNamespace(String name) { return null; }
            @Override public String getVariableFormat(String name) { return null; }
            @Override public String getRuntimeType(String name) { return null; }
            @Override public String getThisDefineKey(String name) { return null; }
            @Override public String getArrayElementDeclaredClass(String name) { return null; }
            @Override public String getArrayElementClassName(String name) { return null; }
            @Override public boolean isPropertyOfObject(String ownerName, String propertyName) { return false; }
            @Override public String getPropertyReferenceName(Node node) { return null; }
            @Override public String getGlobalObjectKey(Node node) { return null; }
            @Override public String getSingletonGetterName(Node node) { return null; }
            @Override public String getAbstractMethodName(Node node) { return null; }
            @Override public String getInterfaceName(Node node) { return null; }
            @Override public boolean isSuperClassOf(Node node, Node node2) { return false; }
            @Override public String getCtorName(Node node) { return null; }
            @Override public boolean isConstructor(Node node) { return false; }
            @Override public boolean isInstanceof(Node node, Node node2) { return false; }
            @Override public boolean isPrototypeAlias(Node node) { return false; }
            @Override public boolean isPrivateMethod(Node node) { return false; }
            @Override public boolean isReservedClassKey(Node node) { return false; }
            @Override public boolean isConstructorParameter(Node node, String name) { return false; }
            @Override public boolean isFunctionPrototype(Node node) { return false; }
            @Override public boolean isAnonymousFunction(Node node) { return false; }
            @Override public String getAliasName(Node node) { return null; }
            @Override public String getSyntheticClassName(Node node) { return null; }
            @Override public String getAssetPath(Node node) { return null; }
            @Override public String getPrototypeOrConstructorName(Node node) { return null; }
            @Override public String getExportedHookName(Node node) { return null; }
            @Override public String getExportedNamespace(Node node) { return null; }
            @Override public String getVariableFormat(Node node) { return null; }
            @Override public String getRuntimeType(Node node) { return null; }
            @Override public String getPropertyObservableName(Node propertyOwner, String propertyName) { return null; }
            @Override public String getFunctionPrototypeName(Node node) { return null; }
            @Override public String getQualifiedName(Node node) { return null; }
            @Override public String getNormalizedStatementName(Node node) { return null; }
            @Override public String getPropertyFromObjectKey(Node node) { return null; }
            @Override public String getClassNameFromVar(Node node) { return null; }
            @Override public boolean isConstantClassName(Node node) { return false; }
        };}
        @Override public void addToDebugLog(String message) {}
        @Override public String toSource(Node root) { return ""; }
        @Override public ErrorReporter getDefaultErrorReporter() { return new BasicErrorReporter(); }
        @Override public Supplier<String> getUniqueNameIdSupplier() {
            return new Supplier<String>() {
                private int id = 0;
                @Override public String get() { return String.valueOf(id++); }
            };
        }
        @Override public boolean hasHaltingErrors() { return false; }
        @Override public TypeValidator getTypeValidator() { return null; }
        @Override public JSTypeRegistry getTypeRegistry() { return null; }
        @Override public Scope getTopScope() { return null; }
        @Override public ReverseAbstractInterpreter getReverseAbstractInterpreter() { return null; }
        @Override public boolean isTypeCheckingEnabled() { return false; }
        @Override public void prepareAst(Node root) {}
        @Override public ErrorManager getErrorManager() { return null; }
        @Override public boolean areNodesEqualForInlining(Node n1, Node n2) { return false; }
        @Override public void setHasRegExpGlobalReferences(boolean references) {}
        @Override public boolean hasRegExpGlobalReferences() { return false; }
        @Override public JSModuleGraph getModuleGraph() { return null; }
        @Override public List<CompilerInput> getInputsInOrder() { return null; }
        @Override public CompilerInput getInput(String sourceName) { return null; }
        @Override public CompilerInput newExternInput(String name) { return null; }
        @Override public Node getNodeForCodeInsertion(JSModule module) { return new Node(Token.BLOCK); }
        @Override public Node parseSyntheticCode(String code) { return new Node(Token.SCRIPT); }
        @Override public Node parseSyntheticCode(String filename, String code) { return new Node(Token.SCRIPT); }
        @Override public Node parseTestCode(String code) { return new Node(Token.SCRIPT); }
        @Override public void setCssRenamingMap(CssRenamingMap map) {}
        @Override public CssRenamingMap getCssRenamingMap() { return null; }
        @Override public LifeCycleStage getLifeCycleStage() { return null; }
        @Override public void setLifeCycleStage(LifeCycleStage stage) {}
        @Override public void addChangeHandler(CodeChangeHandler handler) {}
        @Override public void removeChangeHandler(CodeChangeHandler handler) {}
        @Override public boolean isIdeMode() { return false; }
        @Override public boolean acceptEcmaScript5() { return false; }
        @Override public boolean acceptConstKeyword() { return false; }
        @Override public Config getParserConfig() { return new Config(null, null, false, false, false, false, false, false, false); }
        @Override public void throwInternalError(String msg, Exception cause) { throw new RuntimeException(msg, cause); }
        @Override public void setNodeForCodeInsertion(Node node) {}
        @Override public void setFileName(String fileName) {}
        @Override public String getFileName() { return null; }
        @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
    }

    private static class MockSupplier<T> implements Supplier<T> {
        private T value;
        public void set(T value) { this.value = value; }
        @Override public T get() { return this.value; }
    }

    @Test
    public void testMutateBasicFunction() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(10))));
        Node callNode = new Node(Token.CALL);
        String resultName = "result";
        boolean needsDefaultResult = false;
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("myFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node firstChild = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, firstChild.getType());
        assertEquals("JSCompiler_inline_label_myFunc_0", firstChild.getFirstChild().getString());
        Node blockInsideLabel = firstChild.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());
        Node returnStatement = blockInsideLabel.getFirstChild();
        assertEquals(Token.RETURN, returnStatement.getType());
        assertEquals(10.0, returnStatement.getOnlyChild().getDouble(), 0.0);
    }

    @Test
    public void testMutateWithResultName() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(20))));
        Node callNode = new Node(Token.CALL);
        String resultName = "resultVar";
        boolean needsDefaultResult = true; // This should cause assignment
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("myFuncWithResult", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node firstChild = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, firstChild.getType());
        Node blockInsideLabel = firstChild.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());
        Node assignmentStatement = blockInsideLabel.getFirstChild();
        assertEquals(Token.EXPR_RESULT, assignmentStatement.getType());
        Node assignNode = assignmentStatement.getFirstChild();
        assertEquals(Token.ASSIGN, assignNode.getType());
        assertEquals(resultName, assignNode.getFirstChild().getString());
        assertEquals(20.0, assignNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testMutateWithArguments() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.PARAM_LIST, new Node(Token.NAME, "a"), new Node(Token.NAME, "b")),
                new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.ADD, new Node(Token.NAME, "a"), new Node(Token.NAME, "b")))));
        Node callNode = new Node(Token.CALL, Node.newNumber(5), Node.newNumber(7));
        String resultName = "res";
        boolean needsDefaultResult = false;
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("addFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node firstChild = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, firstChild.getType());
        Node blockInsideLabel = firstChild.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());
        Node returnStatement = blockInsideLabel.getFirstChild(); // Should be RETURN
        assertEquals(Token.RETURN, returnStatement.getType());
        Node addNode = returnStatement.getOnlyChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(5.0, addNode.getFirstChild().getDouble(), 0.0);
        assertEquals(7.0, addNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testMutateCallInLoop() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.BLOCK, new Node(Token.VAR, Node.newString(Token.NAME, "x")), new Node(Token.RETURN, new Node(Token.NAME, "x"))));
        Node callNode = new Node(Token.CALL);
        String resultName = "loopResult";
        boolean needsDefaultResult = false;
        boolean isCallInLoop = true; // Key difference

        Node mutatedBlock = mutator.mutate("loopFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node firstChild = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, firstChild.getType());
        Node blockInsideLabel = firstChild.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());
        Node varStatement = blockInsideLabel.getFirstChild();
        assertEquals(Token.VAR, varStatement.getType());
        assertEquals(Token.NAME, varStatement.getFirstChild().getType());
        assertTrue(varStatement.getFirstChild().hasChildren()); // Should have undefined child
        assertEquals(Token.CALL, varStatement.getFirstChild().getFirstChild().getType()); // Undefined is a call
        assertEquals("undefined", varStatement.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testMutateWithUninitializedVarInLoop() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.BLOCK, new Node(Token.VAR, Node.newString(Token.NAME, "y"))));
        Node callNode = new Node(Token.CALL);
        String resultName = "loopRes";
        boolean needsDefaultResult = false;
        boolean isCallInLoop = true;

        Node mutatedBlock = mutator.mutate("loopVarFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node firstChild = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, firstChild.getType());
        Node blockInsideLabel = firstChild.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());
        Node varStatement = blockInsideLabel.getFirstChild();
        assertEquals(Token.VAR, varStatement.getType());
        assertEquals(Token.NAME, varStatement.getFirstChild().getType());
        assertTrue(varStatement.getFirstChild().hasChildren());
        assertEquals(Token.CALL, varStatement.getFirstChild().getFirstChild().getType()); // Undefined is a call
        assertEquals("undefined", varStatement.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testMutateWithReturnAndLabel() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(30))));
        Node callNode = new Node(Token.CALL);
        String resultName = "labelRes";
        boolean needsDefaultResult = true;
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("labelFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node labelNode = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        assertEquals("JSCompiler_inline_label_labelFunc_0", labelNode.getFirstChild().getString());
        Node blockInsideLabel = labelNode.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());
        Node assignmentStatement = blockInsideLabel.getFirstChild();
        assertEquals(Token.EXPR_RESULT, assignmentStatement.getType());
        Node assignNode = assignmentStatement.getFirstChild();
        assertEquals(Token.ASSIGN, assignNode.getType());
        assertEquals(resultName, assignNode.getFirstChild().getString());
        assertEquals(30.0, assignNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testMutateWithMultipleReturns() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node block = new Node(Token.BLOCK);
        block.addChildToBack(NodeUtil.newExpr(Node.newNumber(1.0)));
        block.addChildToBack(new Node(Token.RETURN, Node.newNumber(2.0)));
        block.addChildToBack(new Node(Token.RETURN, Node.newNumber(3.0)));

        Node fnNode = new Node(Token.FUNCTION, block);
        Node callNode = new Node(Token.CALL);
        String resultName = "multiRes";
        boolean needsDefaultResult = false;
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("multiReturnFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node labelNode = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node blockInsideLabel = labelNode.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());

        Node firstStatement = blockInsideLabel.getFirstChild();
        assertEquals(Token.RETURN, firstStatement.getType());
        assertEquals(3.0, firstStatement.getOnlyChild().getDouble(), 0.0);

        Node secondStatement = firstStatement.getNext();
        assertEquals(Token.BREAK, secondStatement.getType());
        assertEquals("JSCompiler_inline_label_multiReturnFunc_0", secondStatement.getFirstChild().getString());

        Node thirdStatement = secondStatement.getNext();
        assertEquals(Token.BREAK, thirdStatement.getType());
        assertEquals("JSCompiler_inline_label_multiReturnFunc_0", thirdStatement.getFirstChild().getString());
    }

    @Test
    public void testMutateWithNamedArgumentsAndAlias() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.PARAM_LIST, new Node(Token.NAME, "a"), new Node(Token.NAME, "b")),
                new Node(Token.BLOCK,
                        new Node(Token.ASSIGN, new Node(Token.NAME, "a"), Node.newNumber(100)), // Modifies 'a'
                        new Node(Token.RETURN, new Node(Token.ADD, new Node(Token.NAME, "a"), new Node(Token.NAME, "b")))));
        Node callNode = new Node(Token.CALL, Node.newNumber(5), Node.newNumber(7)); // a=5, b=7
        String resultName = "aliasRes";
        boolean needsDefaultResult = true;
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("aliasFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node labelNode = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node blockInsideLabel = labelNode.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());

        Node varDecl = blockInsideLabel.getFirstChild();
        assertEquals(Token.VAR, varDecl.getType());
        assertEquals("alias_0", varDecl.getFirstChild().getString());
        assertEquals(5.0, varDecl.getFirstChild().getOnlyChild().getDouble(), 0.0);

        Node assignment = varDecl.getNext();
        assertEquals(Token.EXPR_RESULT, assignment.getType());
        Node assignNode = assignment.getFirstChild();
        assertEquals(Token.ASSIGN, assignNode.getType());
        assertEquals(resultName, assignNode.getFirstChild().getString());
        Node addNode = assignNode.getLastChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals("alias_0", addNode.getFirstChild().getString());
        assertEquals(7.0, addNode.getLastChild().getDouble(), 0.0); // b is inlined directly
    }

    @Test
    public void testMutateFunctionWithNoBody() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.BLOCK)); // Empty function body
        Node callNode = new Node(Token.CALL);
        String resultName = "emptyRes";
        boolean needsDefaultResult = false;
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("emptyFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node labelNode = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node blockInsideLabel = labelNode.getLastChild();
        assertTrue(blockInsideLabel.getAllChildren().isEmpty());
    }

    @Test
    public void testMutateFunctionWithNoBodyAndNeedsDefaultResult() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        safeNameIdSupplier.set("0");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.BLOCK)); // Empty function body
        Node callNode = new Node(Token.CALL);
        String resultName = "defaultEmptyRes";
        boolean needsDefaultResult = true; // Should add a default assignment
        boolean isCallInLoop = false;

        Node mutatedBlock = mutator.mutate("defaultEmptyFunc", fnNode, callNode, resultName, needsDefaultResult, isCallInLoop);

        assertTrue(mutatedBlock.hasChildren());
        Node labelNode = mutatedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node blockInsideLabel = labelNode.getLastChild();
        assertTrue(blockInsideLabel.hasChildren());

        Node assignmentStatement = blockInsideLabel.getFirstChild();
        assertEquals(Token.EXPR_RESULT, assignmentStatement.getType());
        Node assignNode = assignmentStatement.getFirstChild();
        assertEquals(Token.ASSIGN, assignNode.getType());
        assertEquals(resultName, assignNode.getFirstChild().getString());
        assertEquals(Token.CALL, assignNode.getLastChild().getType()); // Undefined is a call.
        assertEquals("undefined", assignNode.getLastChild().getString());
    }

    @Test
    public void testFixUnitializedVarDeclarationsRecursive() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK);
        Node loop = new Node(Token.FOR, new Node(Token.BLOCK, new Node(Token.VAR, Node.newString(Token.NAME, "innerVar"))));
        block.addChildToBack(loop);
        block.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "outerVar")));

        Node mutatedBlock = mutator.mutate("recursiveLoopFunc", new Node(Token.FUNCTION, block), new Node(Token.CALL), "res", false, true);

        assertTrue(mutatedBlock.hasChildren());
        Node labelNode = mutatedBlock.getFirstChild();
        Node blockInsideLabel = labelNode.getLastChild();

        Node outerVarDecl = blockInsideLabel.getFirstChild();
        assertEquals(Token.VAR, outerVarDecl.getType());
        assertEquals("outerVar", outerVarDecl.getFirstChild().getString());
        assertTrue(outerVarDecl.getFirstChild().hasChildren());
        assertEquals(Token.CALL, outerVarDecl.getFirstChild().getFirstChild().getType());
        assertEquals("undefined", outerVarDecl.getFirstChild().getFirstChild().getString());

        Node forLoop = outerVarDecl.getNext();
        assertEquals(Token.FOR, forLoop.getType());
        Node innerBlock = forLoop.getLastChild();
        Node innerVarDecl = innerBlock.getFirstChild();
        assertEquals(Token.VAR, innerVarDecl.getType());
        assertEquals("innerVar", innerVarDecl.getFirstChild().getString());
        assertFalse(innerVarDecl.getFirstChild().hasChildren());
    }

    @Test
    public void testMakeLocalNamesUnique() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> idSupplier = new MockSupplier<>();
        idSupplier.set("1");
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, idSupplier);

        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.BLOCK,
                        new Node(Token.VAR, Node.newString(Token.NAME, "a")),
                        new Node(Token.VAR, Node.newString(Token.NAME, "b")),
                        new Node(Token.VAR, Node.newString(Token.NAME, "a"))));

        Node fnNodeClone = fnNode.cloneTree();
        mutator.makeLocalNamesUnique(fnNodeClone, false);

        Node body = fnNodeClone.getSecondChild();
        Node var1 = body.getFirstChild();
        assertEquals("a", var1.getFirstChild().getString());

        Node var2 = var1.getNext();
        assertEquals("b", var2.getFirstChild().getString());

        Node var3 = var2.getNext();
        assertEquals("inline_1", var3.getFirstChild().getString());
    }

    @Test
    public void testGetLabelNameForFunction() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSupplier<String> safeNameIdSupplier = new MockSupplier<>();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);

        safeNameIdSupplier.set("123");
        assertEquals("JSCompiler_inline_label_myFunc_123", mutator.getLabelNameForFunction("myFunc"));

        safeNameIdSupplier.set("456");
        assertEquals("JSCompiler_inline_label_anon_456", mutator.getLabelNameForFunction(null));

        safeNameIdSupplier.set("789");
        assertEquals("JSCompiler_inline_label_anon_789", mutator.getLabelNameForFunction(""));
    }

    @Test
    public void testAliasAndInlineArgumentsNoAliasNeeded() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node fnTemplateRoot = new Node(Token.BLOCK, new Node(Token.ADD, new Node(Token.NAME, "a"), new Node(Token.NAME, "b")));
        LinkedHashMap<String, Node> argMap = Maps.newLinkedHashMap();
        argMap.put("a", Node.newNumber(1.0));
        argMap.put("b", Node.newNumber(2.0));
        Set<String> namesToAlias = new HashSet<>();

        Node clonedRoot = fnTemplateRoot.cloneTree();
        Node result = mutator.aliasAndInlineArguments(clonedRoot, argMap, namesToAlias);

        assertEquals(Token.BLOCK, result.getType());
        Node addNode = result.getFirstChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(1.0, addNode.getFirstChild().getDouble(), 0.0);
        assertEquals(2.0, addNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testAliasAndInlineArgumentsWithAliasNeeded() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node fnTemplateRoot = new Node(Token.BLOCK,
                new Node(Token.ASSIGN, new Node(Token.NAME, "a"), Node.newNumber(100)),
                new Node(Token.RETURN, new Node(Token.ADD, new Node(Token.NAME, "a"), new Node(Token.NAME, "b"))));

        LinkedHashMap<String, Node> argMap = Maps.newLinkedHashMap();
        argMap.put("a", Node.newNumber(5.0));
        argMap.put("b", Node.newNumber(7.0));

        Set<String> namesToAlias = new HashSet<>();
        namesToAlias.add("a");

        Node clonedRoot = fnTemplateRoot.cloneTree();
        Node result = mutator.aliasAndInlineArguments(clonedRoot, argMap, namesToAlias);

        assertEquals(Token.BLOCK, result.getType());
        Node varDecl = result.getFirstChild();
        assertEquals(Token.VAR, varDecl.getType());
        assertEquals("alias_0", varDecl.getFirstChild().getString());
        assertEquals(5.0, varDecl.getFirstChild().getOnlyChild().getDouble(), 0.0);

        Node assignment = varDecl.getNext();
        assertEquals(Token.ASSIGN, assignment.getType());
        assertEquals("a", assignment.getFirstChild().getString());

        Node returnNode = assignment.getNext();
        assertEquals(Token.RETURN, returnNode.getType());
        Node addNode = returnNode.getOnlyChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals("alias_0", addNode.getFirstChild().getString());
        assertEquals(7.0, addNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testReplaceReturnsBasicReturn() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1.0)));
        String labelName = "foo";

        Node transformedBlock = mutator.replaceReturns(block, null, labelName, false);

        assertEquals(Token.BLOCK, transformedBlock.getType());
        Node labelNode = transformedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        assertEquals(labelName, labelNode.getFirstChild().getString());
        Node innerBlock = labelNode.getLastChild();
        Node returnNode = innerBlock.getFirstChild();
        assertEquals(Token.RETURN, returnNode.getType());
        assertEquals(1.0, returnNode.getOnlyChild().getDouble(), 0.0);
        Node breakNode = returnNode.getNext();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(labelName, breakNode.getFirstChild().getString());
    }

    @Test
    public void testReplaceReturnsNeedsDefaultResult() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(2.0)));
        String resultName = "res";
        String labelName = "bar";

        Node transformedBlock = mutator.replaceReturns(block, resultName, labelName, true);

        assertEquals(Token.BLOCK, transformedBlock.getType());
        Node labelNode = transformedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node innerBlock = labelNode.getLastChild();
        Node assignmentNode = innerBlock.getFirstChild();
        assertEquals(Token.EXPR_RESULT, assignmentNode.getType());
        Node assign = assignmentNode.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(resultName, assign.getFirstChild().getString());
        assertEquals(2.0, assign.getLastChild().getDouble(), 0.0);
        Node breakNode = assignmentNode.getNext();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(labelName, breakNode.getFirstChild().getString());
    }

    @Test
    public void testReplaceReturnsNoReturnButNeedsDefaultResult() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1.0)));
        String resultName = "res";
        String labelName = "baz";

        Node transformedBlock = mutator.replaceReturns(block, resultName, labelName, true);

        assertEquals(Token.BLOCK, transformedBlock.getType());
        Node labelNode = transformedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node innerBlock = labelNode.getLastChild();
        Node exprNode = innerBlock.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprNode.getType());
        assertEquals(1.0, exprNode.getOnlyChild().getDouble(), 0.0);

        Node assignmentNode = exprNode.getNext();
        assertEquals(Token.EXPR_RESULT, assignmentNode.getType());
        Node assign = assignmentNode.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(resultName, assign.getFirstChild().getString());
        assertEquals(Token.CALL, assign.getLastChild().getType());
        assertEquals("undefined", assign.getLastChild().getString());

        Node breakNode = assignmentNode.getNext();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(labelName, breakNode.getFirstChild().getString());
    }

    @Test
    public void testReplaceReturnsNoReturnAndNoNeedsDefaultResult() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1.0)));
        String resultName = "res";
        String labelName = "qux";

        Node transformedBlock = mutator.replaceReturns(block, resultName, labelName, false);

        assertEquals(Token.BLOCK, transformedBlock.getType());
        Node labelNode = transformedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node innerBlock = labelNode.getLastChild();
        Node exprNode = innerBlock.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprNode.getType());
        assertEquals(1.0, exprNode.getOnlyChild().getDouble(), 0.0);

        Node breakNode = exprNode.getNext();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(labelName, breakNode.getFirstChild().getString());
    }

    @Test
    public void testReplaceReturnsEmptyBlockNoNeedsDefaultResult() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK);
        String labelName = "empty";

        Node transformedBlock = mutator.replaceReturns(block, null, labelName, false);

        assertEquals(Token.BLOCK, transformedBlock.getType());
        Node labelNode = transformedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node innerBlock = labelNode.getLastChild();
        assertTrue(innerBlock.getAllChildren().isEmpty());

        Node breakNode = innerBlock.getFirstChild();
        if (breakNode != null) {
             assertEquals(Token.BREAK, breakNode.getType());
             assertEquals(labelName, breakNode.getFirstChild().getString());
        }
    }

    @Test
    public void testReplaceReturnsEmptyBlockNeedsDefaultResult() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK);
        String resultName = "res";
        String labelName = "emptyDefault";

        Node transformedBlock = mutator.replaceReturns(block, resultName, labelName, true);

        assertEquals(Token.BLOCK, transformedBlock.getType());
        Node labelNode = transformedBlock.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        Node innerBlock = labelNode.getLastChild();

        Node assignmentNode = innerBlock.getFirstChild();
        assertEquals(Token.EXPR_RESULT, assignmentNode.getType());
        Node assign = assignmentNode.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(resultName, assign.getFirstChild().getString());
        assertEquals(Token.CALL, assign.getLastChild().getType());
        assertEquals("undefined", assign.getLastChild().getString());

        Node breakNode = assignmentNode.getNext();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(labelName, breakNode.getFirstChild().getString());
    }

    @Test
    public void testConvertLastReturnToStatementBasic() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, null);

        Node block = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1.0)));
        String resultName = null;

        mutator.convertLastReturnToStatement(block, resultName);

        Node expr = block.getFirstChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertEquals(1.0, expr.getOnlyChild().getDouble(), 0.0);
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
    private static class MockNodeTraversal extends NodeTraversal {
        private final Callback callback;
        private final NodeTraversal.TraversalState state;

        MockNodeTraversal(AbstractCompiler compiler, Callback cb, Node root) {
            super(compiler, cb);
            this.callback = cb;
            this.state = new NodeTraversal.TraversalState(root);
        }

        void run() {
            traverse(state.getRoot());
        }

        private void traverse(Node node) {
            if (node == null) return;

            Node parent = state.getParent();
            NodeTraversal.NodeContext context = state.push(node, parent);

            boolean shouldDescend = true;
            if (callback instanceof NodeTraversal.ScopedCallback) {
                shouldDescend = ((NodeTraversal.ScopedCallback) callback).shouldTraverse(this, node, parent);
            } else if (callback instanceof NodeTraversal.Callback) {
                // Standard callback, call shouldTraverse if it exists
                try {
                    java.lang.reflect.Method shouldTraverseMethod = callback.getClass().getMethod("shouldTraverse", NodeTraversal.class, Node.class, Node.class);
                    shouldDescend = (boolean) shouldTraverseMethod.invoke(callback, this, node, parent);
                } catch (NoSuchMethodException e) {
                    // Method not found, proceed
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            if (shouldDescend) {
                if (callback instanceof NodeTraversal.ScopedCallback) {
                    ((NodeTraversal.ScopedCallback) callback).enterScope(this);
                }
                for (Node child = node.getFirstChild(); child != null; child = child.getNext()) {
                    traverse(child);
                }
                if (callback instanceof NodeTraversal.ScopedCallback) {
                    ((NodeTraversal.ScopedCallback) callback).exitScope(this);
                }
            }

            if (callback instanceof NodeTraversal.ScopedCallback) {
                ((NodeTraversal.ScopedCallback) callback).visit(this, node, parent);
            } else if (callback instanceof NodeTraversal.Callback) {
                // Standard callback, call visit if it exists
                try {
                    java.lang.reflect.Method visitMethod = callback.getClass().getMethod("visit", NodeTraversal.class, Node.class, Node.class);
                    visitMethod.invoke(callback, this, node, parent);
                } catch (NoSuchMethodException e) {
                    // Method not found, proceed
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            state.pop();
        }

        // Mocked implementation of getScopeRoot which is called by ScopedCallback methods
        @Override
        public Node getScopeRoot() {
            return state.getRoot();
        }
    }

    // Helper class to simulate LabelNamespace and LabelInfo used in RenameLabels
    private static class MockLabelNamespaceInfo {
        Map<String, LabelInfo> renameMap = new HashMap<>();
    }

    private static class LabelInfo {
        boolean referenced = false;
        final int id;

        LabelInfo(int id) {
            this.id = id;
        }
    }

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
    public void testProcessLabelsScopedCallback() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Supplier<String> nameSupplier = new Supplier<String>() {
            private int id = 0;
            @Override public String get() { return "scoped" + id++; }
        };
        RenameLabels renameLabels = new RenameLabels(compiler, nameSupplier, true);
        Node root = new Node(Token.SCRIPT);
        Node labelNode = new Node(Token.LABEL);
        labelNode.addChildToFront(Node.newString(Token.LABEL_NAME, "scopedLabel"));
        labelNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(labelNode);

        // Simulate NodeTraversal.traverse by directly calling the ScopedCallback methods
        RenameLabels.ProcessLabels processLabels = renameLabels.new ProcessLabels();
        MockNodeTraversal mockTraversal = new MockNodeTraversal(compiler, processLabels, root);

        // Manually invoke the lifecycle methods
        processLabels.enterScope(mockTraversal); // Enter global scope
        processLabels.shouldTraverse(mockTraversal, root, null); // Check root
        processLabels.enterScope(mockTraversal); // Enter scope for the label
        processLabels.shouldTraverse(mockTraversal, labelNode, root); // Check label node
        processLabels.visit(mockTraversal, labelNode, root); // Visit label node
        processLabels.exitScope(mockTraversal); // Exit scope for the label
        processLabels.exitScope(mockTraversal); // Exit global scope
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

    // Tests for private methods are generally not ideal, but these cover specific logic.
    // Direct calls to private methods require reflection or making them package-private.
    // Since we are not allowed to modify source, we are testing via public methods
    // that invoke them. The tests above cover most of this.
}
```

### SOURCE CODE ANALYSIS
The tests target the `mutate`, `makeLocalNamesUnique`, `getLabelNameForFunction`, `aliasAndInlineArguments`, `replaceReturns`, `fixUnitializedVarDeclarations`, `convertLastReturnToStatement`, `createAssignStatementNode`, `getReplacementReturnStatement`, `hasReturnAtExit`, `replaceReturnWithBreak`, and `addDummyAssignment` methods within the `FunctionToBlockMutator` class. Tests also indirectly cover logic within `FunctionArgumentInjector` and `RenameLabels` via calls to `mutate` and `process`.

### TEST CASE DESIGN
- `testMutateBasicFunction`: Mutates a simple function with a return statement. Expected: A labeled block containing the original return.
- `testMutateWithResultName`: Mutates a function where `needsDefaultResult` is true. Expected: An assignment statement setting the result name to the return value.
- `testMutateWithArguments`: Mutates a function with parameters and an addition operation using them. Expected: Inlined arguments used in the addition.
- `testMutateCallInLoop`: Mutates a function called within a loop context. Expected: Uninitialized VAR declarations are set to `undefined`.
- `testMutateWithUninitializedVarInLoop`: Similar to `testMutateCallInLoop`, focuses on VAR initialization in loops.
- `testMutateWithReturnAndLabel`: Mutates a function with a return, expecting label and break transformation.
- `testMutateWithMultipleReturns`: Tests handling of multiple RETURN statements within the function body. Expected: Returns are converted to BREAK statements with the label.
- `testMutateWithNamedArgumentsAndAlias`: Tests aliasing for modified parameters when inlining arguments. Expected: Temporary variable for argument and aliased usage.
- `testMutateFunctionWithNoBody`: Tests mutation of a function with an empty body. Expected: An empty labeled block.
- `testMutateFunctionWithNoBodyAndNeedsDefaultResult`: Tests an empty body function when a default result is required. Expected: Assignment to `undefined`.
- `testFixUnitializedVarDeclarationsRecursive`: Tests `fixUnitializedVarDeclarations` within nested structures (loops). Expected: Outer VAR initialized, inner VAR inside loop not affected by this specific logic.
- `testMakeLocalNamesUnique`: Tests the renaming of local variables to ensure uniqueness. Expected: New names are generated for duplicate variables.
- `test-getLabelNameForFunction`: Tests the generation of unique label names. Expected: Correct label name format based on function name and supplier.
- `testAliasAndInlineArgumentsNoAliasNeeded`: Tests `aliasAndInlineArguments` when no aliasing is required. Expected: Direct inlining of arguments.
- `testAliasAndInlineArgumentsWithAliasNeeded`: Tests `aliasAndInlineArguments` when aliasing is required. Expected: New VAR declaration for alias and inlined arguments.
- `testReplaceReturnsBasicReturn`: Tests `replaceReturns` with a simple RETURN statement. Expected: RETURN converted to expression and BREAK.
- `testReplaceReturnsNeedsDefaultResult`: Tests `replaceReturns` when a default result is needed and there's a RETURN. Expected: Assignment to resultName and BREAK.
- `testReplaceReturnsNoReturnButNeedsDefaultResult`: Tests `replaceReturns` with no RETURN but `needsDefaultResult` is true. Expected: Assignment to `undefined` and BREAK.
- `testReplaceReturnsNoReturnAndNoNeedsDefaultResult`: Tests `replaceReturns` with no RETURN and `needsDefaultResult` is false. Expected: Just BREAK.
- `testReplaceReturnsEmptyBlockNoNeedsDefaultResult`: Tests `replaceReturns` with an empty block and no default result. Expected: Empty block with BREAK.
- `testReplaceReturnsEmptyBlockNeedsDefaultResult`: Tests `replaceReturns` with an empty block and default result needed. Expected: Assignment to `undefined` and BREAK.
- `testConvertLastReturnToStatementBasic`: Tests converting the last RETURN to a statement. Expected: RETURN replaced by EXPR_RESULT.
- `testConvertLastReturnToStatementWithResultName`: Tests conversion with a result name. Expected: RETURN replaced by ASSIGN statement.
- `testConvertLastReturnToStatementEmptyReturn`: Tests conversion of an empty RETURN. Expected: RETURN removed.
- `testConvertLastReturnToStatementEmptyReturnNeedsDefaultResult`: Tests empty RETURN conversion with result name. Expected: ASSIGN to `undefined`.
- `testCreateAssignStatementNode`: Tests creation of an assignment statement node. Expected: Correct EXPR_RESULT -> ASSIGN structure.
- `testGetReplacementReturnStatementBasic`: Tests generating a replacement for a RETURN statement without result name. Expected: EXPR_RESULT.
- `testGetReplacementReturnStatementWithResultName`: Tests generating replacement with result name. Expected: ASSIGN statement.
- `testGetReplacementReturnStatementEmptyReturn`: Tests empty RETURN replacement. Expected: null.
- `testGetReplacementReturnStatementEmptyReturnWithResultName`: Tests empty RETURN replacement with result name. Expected: ASSIGN to `undefined`.
- `testHasReturnAtExit`: Tests the `hasReturnAtExit` helper method. Expected: Correct boolean value based on block's last child.
- `testReplaceReturnWithBreakBasic`: Tests `replaceReturnWithBreak` for a basic RETURN. Expected: BREAK node.
- `testReplaceReturnWithBreakWithResult`: Tests `replaceReturnWithBreak` with a result name. Expected: EXPR_RESULT (assignment) followed by BREAK.
- `testAddDummyAssignment`: Tests adding a dummy assignment for `undefined`. Expected: Correct ASSIGN to `undefined`.
- `testRenameLabelsProcess`: Tests the `RenameLabels.process` method, including renaming and referencing.
- `testRenameLabelsRemoveUnused`: Tests `RenameLabels` removing unused labels.
- `testRenameLabelsKeepUnusedIfRemoveUnusedFalse`: Tests `RenameLabels` keeping unused labels when `removeUnused` is false.
- `testRenameLabelsNestedLabels`: Tests renaming of nested labels.
- `testProcessLabelsScopedCallback`: Tests the `ScopedCallback` interface usage within `RenameLabels`.
- `testFunctionArgumentInjectorMaybeAddTempsForCallArguments`: Tests argument injection with and without parameter modification, checking for temporary variable creation.

### DEFECT DETECTION STRATEGY
The tests focus on thoroughly exercising the `mutate` method and its internal helpers. They cover various scenarios including argument inlining, variable scope handling (especially in loops), return statement transformation, and label renaming. By asserting exact derived values and structural changes in the AST, these tests aim to pinpoint deviations from the reference implementation's behavior, particularly around edge cases and state transformations.

### SUMMARY
34 tests.

### LIMITATIONS
Mocking `AbstractCompiler` and its dependencies is necessary for isolated testing but may not fully capture all compiler interactions. Some tests indirectly verify private methods by checking the outcome of public methods that call them.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.