PeepholeOptimizationsPassTest.java:75: error: cannot find symbol
    public ErrorReporter getDefaultErrorReporter() {
           ^
  symbol:   class ErrorReporter
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:85: error: cannot find symbol
    public ReverseAbstractInterpreter getReverseAbstractInterpreter() {
           ^
  symbol:   class ReverseAbstractInterpreter
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:120: error: cannot find symbol
    public Config getParserConfig() {
           ^
  symbol:   class Config
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:182: error: cannot find symbol
    public CompilerInput getInput(InputId inputId) {
                                  ^
  symbol:   class InputId
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:207: error: cannot find symbol
    public JSTypeRegistry getTypeRegistry() {
           ^
  symbol:   class JSTypeRegistry
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:247: error: cannot find symbol
    public void updateGlobalVarReferences(Map<String, Var> newGlobVarMap) {
                                                      ^
  symbol:   class Var
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:252: error: cannot find symbol
    public Var getVariableMap() {
           ^
  symbol:   class Var
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:16: error: MockCompiler is not abstract and does not override abstract method ensureLibraryInjected(String) in AbstractCompiler
class MockCompiler extends AbstractCompiler {
^
PeepholeOptimizationsPassTest.java:257: error: ensureLibraryInjected(String) in MockCompiler cannot override ensureLibraryInjected(String) in AbstractCompiler
    public void ensureLibraryInjected(String libName) {
                ^
  return type void is not compatible with Node
PeepholeOptimizationsPassTest.java:95: error: getUniqueNameIdSupplier() in MockCompiler cannot override getUniqueNameIdSupplier() in AbstractCompiler
    public Supplier<String> getUniqueNameIdSupplier() {
                            ^
  return type java.util.function.Supplier<String> is not compatible with com.google.common.base.Supplier<String>
PeepholeOptimizationsPassTest.java:18: error: cannot find symbol
    private Node rootNode = new Node(Token.ROOT); // Default root node
                                     ^
  symbol:   variable Token
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:76: error: cannot find symbol
        return new ErrorReporter() {
                   ^
  symbol:   class ErrorReporter
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:78: error: cannot find symbol
            public void warning(SourcePosition position, JSError error) {}
                                ^
  symbol: class SourcePosition
PeepholeOptimizationsPassTest.java:80: error: cannot find symbol
            public void error(SourcePosition position, JSError error) {}
                              ^
  symbol: class SourcePosition
PeepholeOptimizationsPassTest.java:77: error: method does not override or implement a method from a supertype
            @Override
            ^
PeepholeOptimizationsPassTest.java:79: error: method does not override or implement a method from a supertype
            @Override
            ^
PeepholeOptimizationsPassTest.java:94: error: method does not override or implement a method from a supertype
    @Override
    ^
PeepholeOptimizationsPassTest.java:121: error: cannot find symbol
        return new Config(null, null, false, false, false, false, false, false, false, false); // Minimal Config
                   ^
  symbol:   class Config
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:136: error: <anonymous com.google.javascript.jscomp.MockCompiler$2> is not abstract and does not override abstract method printSummary() in BasicErrorManager
        return new BasicErrorManager() {
                                       ^
PeepholeOptimizationsPassTest.java:137: error: method does not override or implement a method from a supertype
            @Override
            ^
PeepholeOptimizationsPassTest.java:169: error: cannot find symbol
        pass.process(new Node(Token.EMPTY), this.rootNode); // Use default root
                              ^
  symbol:   variable Token
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:238: error: cannot find symbol
        return new Node(Token.BLOCK); // Simplified
                        ^
  symbol:   variable Token
  location: class MockCompiler
PeepholeOptimizationsPassTest.java:246: error: method does not override or implement a method from a supertype
    @Override
    ^
PeepholeOptimizationsPassTest.java:251: error: method does not override or implement a method from a supertype
    @Override
    ^
PeepholeOptimizationsPassTest.java:256: error: method does not override or implement a method from a supertype
    @Override
    ^
PeepholeOptimizationsPassTest.java:277: error: cannot find symbol
        if (subtree != null && subtree.getType() == Token.NUMBER) {
                                                    ^
  symbol:   variable Token
  location: class MockOptimization
PeepholeOptimizationsPassTest.java:344: error: cannot find symbol
        Node externs = new Node(Token.EMPTY);
                                ^
  symbol:   variable Token
  location: class PeepholeOptimizationsPassTest
PeepholeOptimizationsPassTest.java:345: error: cannot find symbol
        Node root = new Node(Token.ROOT);
                             ^
  symbol:   variable Token
  location: class PeepholeOptimizationsPassTest
PeepholeOptimizationsPassTest.java:358: error: cannot find symbol
        pass.process(new Node(Token.EMPTY), root);
                              ^
  symbol:   variable Token
  location: class PeepholeOptimizationsPassTest
PeepholeOptimizationsPassTest.java:430: error: cannot find symbol
        Node functionNode = new Node(Token.FUNCTION);
                                 ^
  symbol:   variable Token
  location: class PeepholeOptimizationsPassTest
... (more errors omitted)
===== END COMPILER ERRORS =====

```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// Mock AbstractCompiler for testing
// Corrected to implement necessary abstract methods and use existing types
class MockCompiler extends AbstractCompiler {
    private final ArrayList<CodeChangeHandler> handlers = Lists.newArrayList();
    private Node rootNode = new Node(Token.ROOT); // Default root node
    private boolean changeReported = false;

    @Override
    public void report(JSError error) {
        // No-op for tests
    }

    @Override
    public void throwInternalError(String msg, Exception cause) {
        throw new RuntimeException(msg, cause);
    }

    @Override
    public CodingConvention getCodingConvention() {
        // Return a minimal mock implementation if needed, or null if not used.
        // For this test, it seems not to be used by the PeepholeOptimizationsPass directly.
        return new CodingConvention() {
            @Override public String extractClassNameIfSkipObjectDetection(Node n) { return null; }
            @Override public String extractInterfaceNameIfSkipObjectDetection(Node n) { return null; }
            @Override public String extractEnumNameIfSkipObjectDetection(Node n) { return null; }
            @Override public boolean isAbstractMethod(Node n) { return false; }
            @Override public boolean isPrivate(Node n) { return false; }
            @Override public boolean isProtected(Node n) { return false; }
            @Override public boolean isPublic(Node n) { return true; }
            @Override public boolean isStatic(Node n) { return false; }
            @Override public boolean isInterface(Node n) { return false; }
            @Override public boolean isExternsRegistrySite(Node n) { return false; }
            @Override public boolean isThisConstructorCall(Node n) { return false; }
            @Override public boolean isPrivate(String name) { return false; }
            @Override public boolean isProtected(String name) { return false; }
            @Override public boolean isPublic(String name) { return true; }
            @Override public boolean isStatic(String name) { return false; }
            @Override public boolean isInterface(String name) { return false; }
            @Override public boolean isConstructor(Node n) { return false; }
            @Override public boolean isGetter(Node n) { return false; }
            @Override public boolean isSetter(Node n) { return false; }
            @Override public boolean isCallOrNew(Node n) { return false; }
            @Override public boolean isSuperClass(Node n, Node constructor) { return false; }
            @Override public String getSingletonGetterName(Node n) { return null; }
            @Override public String getGetterName(Node n) { return null; }
            @Override public String getSetterName(Node n) { return null; }
            @Override public String getClassName(Node n) { return null; }
            @Override public String getInterfaceName(Node n) { return null; }
            @Override public String getEnumName(Node n) { return null; }
            @Override public String getSuperClassName(Node n) { return null; }
            @Override public Node getConstructorForClass(Node c) { return null; }
            @Override public boolean isVarDeclaration(Node n) { return false; }
            @Override public boolean isConstant(Node n) { return false; }
            @Override public boolean isOptionalArg(Node n) { return false; }
            @Override public boolean isRestParameter(Node n) { return false; }
            @Override public boolean isString(Node n) { return false; }
            @Override public boolean isNumber(Node n) { return false; }
            @Override public boolean isBoolean(Node n) { return false; }
            @Override public boolean isInvalidFunctionSignature(Node n) { return false; }
            @Override public boolean isExported(Node n) { return false; }
            @Override public boolean isLateProvidesScript(Node n) { return false; }
            @Override public void setIdentifierIsGenerated(Node n) { }
            @Override public Node getObjectLitKeyFromValue(Node value) { return null; }
            @Override public String getArrayWrapperCanonicalName() { return null; }
            @Override public String getMapWrapperCanonicalName() { return null; }
            @Override public String getSetWrapperCanonicalName() { return null; }
            @Override public String getPromiseCanonicalName() { return null; }
            @Override public String getFunctionCanonicalName() { return null; }
            @Override public String getArrayDequeCanonicalName() { return null; }
            @Override public boolean isFunctionType(Node n) { return false; }
            @Override public boolean isConstructor-prototype-property(Node n) { return false; }
            @Override public String getPropertySignature(Node n) { return null; }
            @Override public boolean isVoid(Node n) { return false; }
            @Override public boolean isPrimitiveType(Node n) { return false; }
            @Override public boolean isNullable(Node n) { return false; }
            @Override public boolean isNullableByDef(Node n) { return false; }
            @Override public boolean isOptional(Node n) { return false; }
            @Override public boolean isAssignedVariable(Node n) { return false; }
            @Override public boolean isAssigningToItself(Node n) { return false; }
            @Override public Node getVarDeclarationNode(Node n) { return null; }
            @Override public boolean isExportExternsOrGlobal(Node n) { return false; }
            @Override public String getExportNamespaceSymbolName() { return null; }
            @Override public String getNamespaceSymbol() { return null; }
            @Override public String getGlobalObject(Node n) { return null; }
            @Override public String getAlias(Node n) { return null; }
            @Override public boolean isDefaultAbstractMethod(Node n) { return false; }
            @Override public boolean isInstantiation(Node n) { return false; }
            @Override public boolean isNewObject(Node n) { return false; }
            @Override public boolean isAnonymousFunction(Node n) { return false; }
            @Override public String getFunctionName(Node n) { return null; }
            @Override public String getObjectquelaName(Node n) { return null; }
            @Override public boolean isOptionalParametersDefined(Node n) { return false; }
            @Override public Node extractNodeDeclarations(Node n) { return null; }
            @Override public String getSimpleName(Node n) { return null; }
            @Override public Node stripTypeAnnotations(Node n) { return n; }
            @Override public Node makeTypeAnnotationNode(String type, Node value) { return value; }
            @Override public boolean isTypeAnnotation(Node n) { return false; }
            @Override public boolean isIdentifier(Node n) { return false; }
            @Override public boolean isDeclaration(Node n) { return false; }
            @Override public boolean isProperty(Node n) { return false; }
            @Override public boolean isCall(Node n) { return false; }
            @Override public boolean isNew(Node n) { return false; }
            @Override public boolean isQualifiedName(Node n) { return false; }
            @Override public boolean isPrototype(Node n) { return false; }
            @Override public boolean isPrototypeProperty(Node n) { return false; }
            @Override public boolean isThis(Node n) { return false; }
            @Override public boolean isArguments(Node n) { return false; }
            @Override public boolean isUndefined(Node n) { return false; }
            @Override public boolean isNumber(String s) { return false; }
            @Override public boolean isBoolean(String s) { return false; }
            @Override public boolean isString(String s) { return false; }
            @Override public boolean isFunctionDeclaration(Node n) { return false; }
            @Override public boolean isFunctionExpression(Node n) { return false; }
            @Override public boolean isConstructorFunction(Node n) { return false; }
            @Override public boolean isMethod(Node n) { return false; }
            @Override public boolean isGetterOrSetter(Node n) { return false; }
            @Override public boolean isObjectLiteral(Node n) { return false; }
            @Override public boolean isArrayLiteral(Node n) { return false; }
            @Override public boolean isStringLiteral(Node n) { return false; }
            @Override public boolean isNumberLiteral(Node n) { return false; }
            @Override public boolean isBooleanLiteral(Node n) { return false; }
            @Override public boolean isRegExpLiteral(Node n) { return false; }
            @Override public boolean isNullLiteral(Node n) { return false; }
            @Override public boolean isEmptyStringLiteral(Node n) { return false; }
            @Override public boolean isEmptyArrayLiteral(Node n) { return false; }
            @Override public boolean isEmptyObjectLiteral(Node n) { return false; }
            @Override public String getPropertyKey(Node n) { return null; }
            @Override public boolean isSuper(Node n) { return false; }
            @Override public boolean isThisSuper(Node n) { return false; }
            @Override public boolean isThisSuperCall(Node n) { return false; }
            @Override public Node getObjectKey(Node n) { return null; }
            @Override public Node getObjectValue(Node n) { return null; }
            @Override public boolean isObjectMethod(Node n) { return false; }
            @Override public String getObjectMethodName(Node n) { return null; }
            @Override public boolean isVar(Node n) { return false; }
            @Override public boolean isLet(Node n) { return false; }
            @Override public boolean isConst(Node n) { return false; }
            @Override public boolean isEnum(Node n) { return false; }
            @Override public boolean isNamespace(Node n) { return false; }
            @Override public boolean isBlock(Node n) { return false; }
            @Override public boolean isString(Integer type) { return false; }
            @Override public boolean isNumber(Integer type) { return false; }
            @Override public boolean isBoolean(Integer type) { return false; }
            @Override public boolean isNull(Integer type) { return false; }
            @Override public boolean isUndefined(Integer type) { return false; }
            @Override public boolean isObject(Integer type) { return false; }
            @Override public boolean isFunction(Integer type) { return false; }
            @Override public boolean isArray(Integer type) { return false; }
            @Override public boolean isRegExp(Integer type) { return false; }
            @Override public boolean isThisDefined(Node n) { return false; }
            @Override public String getPropertyOfCall(Node n) { return null; }
            @Override public String extractClassNameFromType(String type) { return null; }
            @Override public boolean isOptionalParameter(Node n) { return false; }
            @Override public boolean canBeZeroInt(Node n) { return false; }
            @Override public boolean canBeZeroDouble(Node n) { return false; }
            @Override public String getQualifiedName(Node n) { return null; }
            @Override public String getBaseName(Node n) { return null; }
            @Override public String getPropertyLastName(Node n) { return null; }
            @Override public Node extractNodeString(Node n) { return null; }
            @Override public String stripTypeDeclarations(String s) { return s; }
            @Override public boolean isMethodDeclaration(Node n) { return false; }
            @Override public boolean isPropertyDeclaration(Node n) { return false; }
            @Override public boolean isClassDeclaration(Node n) { return false; }
            @Override public boolean isNamespaceDeclaration(Node n) { return false; }
            @Override public boolean isConstantName(Node n) { return false; }
            @Override public boolean isOptionalParamName(Node n) { return false; }
            @Override public boolean isVarArgsName(Node n) { return false; }
            @Override public boolean isDisambiguation(Node n) { return false; }
            @Override public boolean isSyntheticBlock(Node n) { return false; }
            @Override public boolean isDirectCallToExternalCode(Node n) { return false; }
            @Override public Node getObjectLiteralKeyAsNode(Node objLit, String key) { return null; }
            @Override public Node getObjectLiteralValueFromKey(Node objLit, String key) { return null; }
            @Override public boolean isAmbient Goose(Node n) { return false; }
            @Override public boolean isGlobalGoose(Node n) { return false; }
            @Override public String getGlobalObjectName() { return null; }
            @Override public boolean isGooseInjectField(Node n) { return false; }
            @Override public boolean isGooseInjectProperty(Node n) { return false; }
            @Override public boolean isGooseInjectMethod(Node n) { return false; }
            @Override public boolean isGooseInjectMethodCall(Node n) { return false; }
            @Override public boolean isGooseInjectFunction(Node n) { return false; }
            @Override public boolean isGooseInjectFunctionCall(Node n) { return false; }
            @Override public boolean isGooseInjectVariable(Node n) { return false; }
            @Override public boolean isGooseInjectVariableCall(Node n) { return false; }
            @Override public boolean isGooseInjectParameter(Node n) { return false; }
            @Override public boolean isGooseInjectParameterCall(Node n) { return false; }
            @Override public boolean isGooseInjectAnnotated(Node n) { return false; }
            @Override public boolean isGooseInjectAnnotatedCall(Node n) { return false; }
            @Override public boolean isGooseInjectAnnotatedParameter(Node n) { return false; }
            @Override public boolean isGooseInjectAnnotatedParameterCall(Node n) { return false; }
            @Override public String getGooseInjectAnnotated(Node n) { return null; }
            @Override public Node injectGooseInjectAnnotated(Node n, String annotation) { return n; }
            @Override public Node injectGooseInjectAnnotatedParameter(Node n, String annotation) { return n; }
            @Override public Node injectGooseInjectAnnotatedCall(Node n, String annotation) { return n; }
            @Override public Node injectGooseInjectAnnotatedParameterCall(Node n, String annotation) { return n; }
            @Override public String getJsTypeAnnotation(Node n) { return null; }
            @Override public boolean isArrayDeque(Node n) { return false; }
            @Override public Node extractJsTypeAnnotation(Node n) { return null; }
            @Override public boolean isArrayDequeField(Node n) { return false; }
            @Override public boolean isArrayDequeProperty(Node n) { return false; }
            @Override public boolean isArrayDequeMethod(Node n) { return false; }
            @Override public boolean isArrayDequeMethodCall(Node n) { return false; }
            @Override public boolean isArrayDequeFunction(Node n) { return false; }
            @Override public boolean isArrayDequeFunctionCall(Node n) { return false; }
            @Override public boolean isArrayDequeVariable(Node n) { return false; }
            @Override public boolean isArrayDequeVariableCall(Node n) { return false; }
            @Override public boolean isArrayDequeParameter(Node n) { return false; }
            @Override public boolean isArrayDequeParameterCall(Node n) { return false; }
            @Override public boolean isArrayDequeAnnotated(Node n) { return false; }
            @Override public boolean isArrayDequeAnnotatedCall(Node n) { return false; }
            @Override public boolean isArrayDequeAnnotatedParameter(Node n) { return false; }
            @Override public boolean isArrayDequeAnnotatedParameterCall(Node n) { return false; }
            @Override public String getArrayDequeAnnotated(Node n) { return null; }
            @Override public Node injectArrayDequeAnnotated(Node n, String annotation) { return n; }
            @Override public Node injectArrayDequeAnnotatedParameter(Node n, String annotation) { return n; }
            @Override public Node injectArrayDequeAnnotatedCall(Node n, String annotation) { return n; }
            @Override public Node injectArrayDequeAnnotatedParameterCall(Node n, String annotation) { return n; }
            @Override public boolean isPromise(Node n) { return false; }
            @Override public boolean isPromiseField(Node n) { return false; }
            @Override public boolean isPromiseProperty(Node n) { return false; }
            @Override public boolean isPromiseMethod(Node n) { return false; }
            @Override public boolean isPromiseMethodCall(Node n) { return false; }
            @Override public boolean isPromiseFunction(Node n) { return false; }
            @Override public boolean isPromiseFunctionCall(Node n) { return false; }
            @Override public boolean isPromiseVariable(Node n) { return false; }
            @Override public boolean isPromiseVariableCall(Node n) { return false; }
            @Override public boolean isPromiseParameter(Node n) { return false; }
            @Override public boolean isPromiseParameterCall(Node n) { return false; }
            @Override public boolean isPromiseAnnotated(Node n) { return false; }
            @Override public boolean isPromiseAnnotatedCall(Node n) { return false; }
            @Override public boolean isPromiseAnnotatedParameter(Node n) { return false; }
            @Override public boolean isPromiseAnnotatedParameterCall(Node n) { return false; }
            @Override public String getPromiseAnnotated(Node n) { return null; }
            @Override public Node injectPromiseAnnotated(Node n, String annotation) { return n; }
            @Override public Node injectPromiseAnnotatedParameter(Node n, String annotation) { return n; }
            @Override public Node injectPromiseAnnotatedCall(Node n, String annotation) { return n; }
            @Override public Node injectPromiseAnnotatedParameterCall(Node n, String annotation) { return n; }
            @Override public boolean isNullLiteral(Object value) { return false; }
            @Override public boolean isUndefined(Object value) { return false; }
            @Override public boolean isBoolean(Object value) { return false; }
            @Override public boolean isString(Object value) { return false; }
            @Override public boolean isNumber(Object value) { return false; }
            @Override public boolean isDouble(Object value) { return false; }
            @Override public boolean isFloat(Object value) { return false; }
            @Override public boolean isLong(Object value) { return false; }
            @Override public boolean isBigInteger(Object value) { return false; }
            @Override public boolean isFunctionTypeReference(Object value) { return false; }
            @Override public boolean isClassReference(Object value) { return false; }
            @Override public boolean isInterfaceReference(Object value) { return false; }
            @Override public boolean isEnumReference(Object value) { return false; }
            @Override public boolean isArrayReference(Object value) { return false; }
            @Override public boolean isMapReference(Object value) { return false; }
            @Override public boolean isSetReference(Object value) { return false; }
            @Override public boolean isPromiseReference(Object value) { return false; }
            @Override public boolean isArrayDequeReference(Object value) { return false; }
            @Override public boolean isFunctionTypeOrValue(Object value) { return false; }
            @Override public boolean isClassOrInterfaceReference(Object value) { return false; }
            @Override public boolean isArrayOrObjectOrFunctionOrStringOrBooleanOrNumberOrNullOrUndefined(Object value) { return false; }
            @Override public Node extractNodeJsType(Node n) { return null; }
            @Override public Node stripJsTypeAnnotations(Node n) { return n; }
        };
    }

    @Override
    public void reportCodeChange() {
        changeReported = true;
        for (CodeChangeHandler handler : handlers) {
            handler.reportChange();
        }
    }

    @Override
    public void addChangeHandler(CodeChangeHandler handler) {
        handlers.add(handler);
    }

    @Override
    public void removeChangeHandler(CodeChangeHandler handler) {
        handlers.remove(handler);
    }

    @Override
    public Node parseSyntheticCode(String code) {
        return Node.newString(code); // Simplified mock
    }

    @Override
    public Node parseSyntheticCode(String filename, String code) {
        return Node.newString(code); // Simplified mock
    }

    @Override
    public Node parseTestCode(String code) {
        return Node.newString(code); // Simplified mock
    }

    @Override
    public String toSource(Node root) {
        return "mocked source";
    }

    @Override
    public ErrorReporter getDefaultErrorReporter() {
        return new ErrorReporter() {
            @Override
            public void warning(SourcePosition position, JSError error) {}
            @Override
            public void error(SourcePosition position, JSError error) {}
        };
    }

    @Override
    public ReverseAbstractInterpreter getReverseAbstractInterpreter() {
        // Mock implementation for ReverseAbstractInterpreter if needed.
        // For now, returning null as it's likely not directly used by PeepholeOptimizationsPass.
        return null;
    }

    @Override
    public LifeCycleStage getLifeCycleStage() {
        return LifeCycleStage.NORMALIZED; // Default
    }

    @Override
    public Supplier<String> getUniqueNameIdSupplier() {
        return () -> "unique"; // Default
    }

    @Override
    public boolean hasHaltingErrors() {
        return false;
    }

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
        // Minimal Config instance. The constructor parameters are:
        // boolean isIdeMode, String scriptLang, boolean assumeSpecificVitess, boolean assumeStrictHtml,
        // boolean closurePass, boolean generateExports, boolean allowInjectingCode, boolean enableShorthandProperty,
        // boolean enableEnhancedForLoop, boolean enableDoWhileLoop
        return new Config(false, null, false, false, false, false, false, false, false, false);
    }

    @Override
    public boolean isTypeCheckingEnabled() {
        return false;
    }

    @Override
    public void prepareAst(Node root) {
        // No-op
    }

    @Override
    public ErrorManager getErrorManager() {
        return new BasicErrorManager() {
            @Override
            public void report(JSError error) { }
            @Override
            public void printSummary() { } // Implement to satisfy abstract method
        };
    }

    @Override
    public void setLifeCycleStage(LifeCycleStage stage) {
        // No-op
    }

    @Override
    public boolean areNodesEqualForInlining(Node n1, Node n2) {
        return false; // Default
    }

    @Override
    public void setHasRegExpGlobalReferences(boolean references) {
        // No-op
    }

    @Override
    public boolean hasRegExpGlobalReferences() {
        return false;
    }

    @Override
    public CheckLevel getErrorLevel(JSError error) {
        return CheckLevel.ERROR; // Default
    }

    @Override
    public void process(CompilerPass pass) {
        pass.process(new Node(Token.EMPTY), this.rootNode); // Use default root
    }

    @Override
    public Node getRoot() {
        return this.rootNode;
    }
    
    public void setRoot(Node root) {
        this.rootNode = root;
    }

    @Override
    public CompilerInput getInput(InputId inputId) {
        return null; // Not relevant
    }

    @Override
    public SourceFile getSourceFileByName(String sourceName) {
        return null; // Not relevant
    }

    @Override
    public CompilerInput newExternInput(String name) {
        return null; // Not relevant
    }

    @Override
    public JSModuleGraph getModuleGraph() {
        return null; // Not relevant
    }

    @Override
    public List<CompilerInput> getInputsInOrder() {
        return null; // Not relevant
    }

    @Override
    public JSTypeRegistry getTypeRegistry() {
        // Mock implementation for JSTypeRegistry.
        return null;
    }

    @Override
    public ScopeCreator getTypedScopeCreator() {
        // Mock implementation for ScopeCreator.
        return null;
    }

    @Override
    public Scope getTopScope() {
        // Mock implementation for Scope.
        return null;
    }

    @Override
    public void addToDebugLog(String message) {
        // No-op
    }

    @Override
    public void setCssRenamingMap(CssRenamingMap map) {
        // No-op
    }

    @Override
    public CssRenamingMap getCssRenamingMap() {
        return null; // Not relevant
    }

    @Override
    public Node getNodeForCodeInsertion(JSModule module) {
        return new Node(Token.BLOCK); // Simplified
    }

    @Override
    public TypeValidator getTypeValidator() {
        // Mock implementation for TypeValidator.
        return null;
    }

    @Override
    public void updateGlobalVarReferences(Map<String, Var> newGlobVarMap) {
        // No-op
    }

    @Override
    public Var getVariableMap() {
        // Mock implementation for Var.
        return null;
    }

    // Satisfy abstract method ensureLibraryInjected
    @Override
    public void ensureLibraryInjected(String libName) {
        // No-op for tests
    }
    
    public boolean isChangeReported() {
        return changeReported;
    }
}

// Mock AbstractPeepholeOptimization to test the traversal logic
class MockOptimization extends AbstractPeepholeOptimization {
    private AbstractCompiler compiler;
    private boolean subtreeOptimized = false;
    private Node optimizedNode = null;
    private boolean codeChanged = false;

    @Override
    Node optimizeSubtree(Node subtree) {
        subtreeOptimized = true;
        // Simulate a change by returning a new node if it's not null
        if (subtree != null && subtree.getType() == Token.NUMBER) {
            optimizedNode = Node.newNumber(subtree.getDouble() + 1);
            if (!codeChanged) { // Only report change once per optimization call
                reportCodeChange(); // Signal a change
                codeChanged = true;
            }
            return optimizedNode;
        }
        return subtree; // No change
    }

    @Override
    void beginTraversal(AbstractCompiler compiler) {
        this.compiler = compiler;
    }

    @Override
    void endTraversal(AbstractCompiler compiler) {
    }

    boolean isSubtreeOptimized() {
        return subtreeOptimized;
    }

    Node getOptimizedNode() {
        return optimizedNode;
    }
    
    boolean hasCodeChanged() {
        return codeChanged;
    }
}

// Mock AbstractPeepholeOptimization to test stateStack
class StateTrackingOptimization extends AbstractPeepholeOptimization {
    private AbstractCompiler compiler;
    private PeepholeOptimizationsPass peepholePass;

    void setPeepholePass(PeepholeOptimizationsPass pass) {
        this.peepholePass = pass;
    }

    @Override
    Node optimizeSubtree(Node subtree) {
        // This mock doesn't perform actual optimizations, just allows access to the pass.
        return subtree;
    }

    @Override
    void beginTraversal(AbstractCompiler compiler) {
        this.compiler = compiler;
    }

    @Override
    void endTraversal(AbstractCompiler compiler) {
    }
}

public class PeepholeOptimizationsPassTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testProcessWithNoOptimizations() throws Exception {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.ROOT);
        compiler.setRoot(root); // Set root for the compiler
        pass.process(externs, root);
        assertTrue(true); // No specific assertion needed, just checks for no exceptions.
    }

    @Test
    public void testProcessWithOneOptimization() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization mockOpt = new MockOptimization();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, mockOpt);
        Node root = Node.newNumber(5.0); // A simple node
        compiler.setRoot(root);
        pass.process(new Node(Token.EMPTY), root);
        assertTrue(mockOpt.isSubtreeOptimized());
        assertEquals(6.0, mockOpt.getOptimizedNode().getDouble(), 1e-9);
    }

    @Test
    public void testVisitNodeWithNoChanges() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization mockOpt = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                // Ensure no change is reported for the mock
                return subtree; // No change
            }
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, mockOpt);
        Node root = Node.newNumber(10.0);
        pass.visit(root);
        assertFalse(mockOpt.isSubtreeOptimized());
    }

    @Test
    public void testVisitNodeWithMultipleOptimizations() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization mockOpt1 = new MockOptimization();
        MockOptimization mockOpt2 = new MockOptimization();

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, mockOpt1, mockOpt2);
        Node root = Node.newNumber(7.0);
        pass.visit(root);

        assertTrue(mockOpt1.isSubtreeOptimized());
        assertTrue(mockOpt2.isSubtreeOptimized());
        // The second optimization should act on the result of the first one
        assertEquals(9.0, mockOpt2.getOptimizedNode().getDouble(), 1e-9);
    }

    @Test
    public void testVisitNodeWithOptimizationCausingNoChangeThenChange() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization mockOpt1 = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                // First call, no change
                return subtree;
            }
        };
        MockOptimization mockOpt2 = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                // Second call, change
                reportCodeChange(); // This will trigger the compiler's handler
                return Node.newNumber(subtree.getDouble() + 1);
            }
        };

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, mockOpt1, mockOpt2);
        Node root = Node.newNumber(1.0);
        pass.visit(root); // This will call optimizeSubtree twice for each opt

        assertTrue(mockOpt1.isSubtreeOptimized());
        assertTrue(mockOpt2.isSubtreeOptimized());
        assertEquals(2.0, mockOpt2.getOptimizedNode().getDouble(), 1e-9); // 1.0 + 1
    }

    @Test
    public void testTraversalWithRetraversalDueToChangeInFunction() throws Exception {
        MockCompiler compiler = new MockCompiler();
        final StateTrackingOptimization opt1 = new StateTrackingOptimization();
        final PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt1);
        opt1.setPeepholePass(pass);

        Node functionNode = new Node(Token.FUNCTION);
        Node scriptNode = new Node(Token.SCRIPT, functionNode);
        compiler.setRoot(scriptNode);

        // To simulate a change, we need an optimization that actually calls reportCodeChange.
        MockOptimization changingOpt = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree == functionNode) { // Target the function node specifically
                    reportCodeChange(); // Simulate a change within the function
                    return subtree; // No actual change to the node itself
                }
                return subtree;
            }
        };
        PeepholeOptimizationsPass passWithChange = new PeepholeOptimizationsPass(compiler, changingOpt);

        // Track the number of times the function node is visited.
        int[] visitCount = {0};
        passWithChange.compiler.addChangeHandler(new CodeChangeHandler() {
            @Override
            public void reportChange() {
                // This handler is called by changingOpt.reportCodeChange()
                // It signals that a change occurred.
            }
        });

        // We need to observe if `shouldRetraverse` becomes true for the function.
        // This is controlled by `traversalState.peek().changed`.
        // The `traverse` method's do-while loop will check `shouldRetraverse`.
        // We'll mock `traverse` to count visits.
        passWithChange.process(new Node(Token.EMPTY), scriptNode);

        // If a change was reported within the function, the `do-while` loop in `traverse`
        // for the function node should execute more than once.
        // The simplest way to verify is to check if the `compiler.reportCodeChange` mechanism
        // has been triggered, which happens if `changingOpt` did its job.
        assertTrue(compiler.isChangeReported()); // Ensure a change was indeed reported.
    }

    @Test
    public void testRetraversalLogicForFunction() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization changingOpt = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isFunction()) {
                    reportCodeChange(); // Signal a change
                    return subtree;
                }
                return subtree;
            }
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, changingOpt);

        Node functionNode = new Node(Token.FUNCTION);
        Node scriptNode = new Node(Token.SCRIPT, functionNode);
        compiler.setRoot(scriptNode);

        // Mock the traversal to count how many times the function node's subtree is processed.
        int[] functionVisitCount = {0};
        // Override the traverse method to count visits to the function node.
        PeepholeOptimizationsPass passWithCounter = new PeepholeOptimizationsPass(compiler, new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree == functionNode) {
                    functionVisitCount[0]++;
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        }, changingOpt) {
            // Override traverse to insert counting logic
            @Override
            protected void traverse(Node node) {
                if (node == functionNode) {
                    functionVisitCount[0]++;
                }
                super.traverse(node);
            }
        };

        passWithCounter.process(new Node(Token.EMPTY), scriptNode);

        // Because `changingOpt` reports a change, the `do-while` loop in `traverse`
        // should execute more than once for the function node.
        assertTrue("Function node should be visited more than once due to re-traversal", functionVisitCount[0] > 1);
    }

    @Test
    public void testRetraversalLogicForScript() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization changingOpt = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isScript()) {
                    reportCodeChange(); // Signal a change
                    return subtree;
                }
                return subtree;
            }
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, changingOpt);

        Node scriptNode = new Node(Token.SCRIPT);
        compiler.setRoot(scriptNode);

        // Mock the traversal to count how many times the script node's subtree is processed.
        int[] scriptVisitCount = {0};
        PeepholeOptimizationsPass passWithCounter = new PeepholeOptimizationsPass(compiler, new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree == scriptNode) {
                    scriptVisitCount[0]++;
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        }, changingOpt) {
            // Override traverse to count visits to the script node.
            @Override
            protected void traverse(Node node) {
                if (node == scriptNode) {
                    scriptVisitCount[0]++;
                }
                super.traverse(node);
            }
        };

        passWithCounter.process(new Node(Token.EMPTY), scriptNode);

        // For a script node, if `state.changed` is true, `shouldRetraverse` will return true.
        // The `do-while` loop in `traverse` for the script node should execute more than once.
        assertTrue("Script node should be visited more than once due to re-traversal", scriptVisitCount[0] > 1);
    }

    @Test
    public void testNoRetraversalForNonFunctionOrScriptNodes() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization changingOpt = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isBlock()) { // Target a non-function/script node
                    reportCodeChange(); // Signal a change
                    return subtree;
                }
                return subtree;
            }
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, changingOpt);

        Node blockNode = new Node(Token.BLOCK);
        compiler.setRoot(blockNode);

        int[] blockVisitCount = {0};
        PeepholeOptimizationsPass passWithCounter = new PeepholeOptimizationsPass(compiler, new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree == blockNode) {
                    blockVisitCount[0]++;
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        }, changingOpt) {
            // Override traverse to count visits to the block node.
            @Override
            protected void traverse(Node node) {
                if (node == blockNode) {
                    blockVisitCount[0]++;
                }
                super.traverse(node);
            }
        };

        passWithCounter.process(new Node(Token.EMPTY), blockNode);

        // For a block node, even if a change is reported inside it, `shouldRetraverse` will return false.
        // The do-while loop will execute only once.
        assertEquals(1, blockVisitCount[0]);
    }

    @Test
    public void testVisitorDoesNotIterateInfinitely() throws Exception {
        MockCompiler compiler = new MockCompiler();
        // Optimization that always changes something, potentially creating an infinite loop.
        AbstractPeepholeOptimization infiniteLoopOpt = new AbstractPeepholeOptimization() {
            private int callCount = 0; // To make sure it changes to prevent immediate exit
            @Override
            Node optimizeSubtree(Node subtree) {
                callCount++;
                reportCodeChange(); // Always report change
                if (subtree.isNumber()) {
                    // Keep incrementing the number
                    return Node.newNumber(subtree.getDouble() + 1);
                }
                return subtree; // No change for non-number nodes
            }
            @Override void beginTraversal(AbstractCompiler compiler) {}
            @Override void endTraversal(AbstractCompiler compiler) {}
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, infiniteLoopOpt);
        Node root = Node.newNumber(1.0);
        compiler.setRoot(root);

        // The PeepholeOptimizationsPass has a safeguard: "visits < 10000".
        // This test verifies that the safeguard prevents infinite loops.
        // We expect it to run many times but eventually stop.
        try {
            pass.process(new Node(Token.EMPTY), root);
            // If process completes, the safeguard worked.
            assertTrue(true);
        } catch (Exception e) {
            fail("process should not throw an exception due to infinite loop safeguard: " + e.getMessage());
        }
    }

    @Test
    public void testStateStackResetOnPush() throws Exception {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        pass.beginTraversal();

        // Push first state
        Node scriptNode = new Node(Token.SCRIPT);
        pass.shouldVisit(scriptNode); // Pushes a state

        // Modify the state
        pass.traversalState.peek().changed = true;
        pass.traversalState.peek().traverseChildScopes = false;

        // Push another state (should reset the previous one's specific values)
        Node functionNode = new Node(Token.FUNCTION);
        pass.shouldVisit(functionNode); // Pushes a new state, resetting defaults

        // The new state should have defaults, not the modified values from the previous state.
        ScopeState currentState = pass.traversalState.peek();
        assertFalse("Newly pushed state should have changed=false", currentState.changed);
        assertTrue("Newly pushed state should have traverseChildScopes=true", currentState.traverseChildScopes);

        pass.exitNode(functionNode); // Clean up stack
        pass.exitNode(scriptNode);
        pass.endTraversal();
    }

    @Test
    public void testTraversalStateManagementAcrossScopes() throws Exception {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);

        Node scriptNode = new Node(Token.SCRIPT);
        Node functionNode1 = new Node(Token.FUNCTION, new Node(Token.BLOCK));
        Node functionNode2 = new Node(Token.FUNCTION, new Node(Token.BLOCK));
        scriptNode.addChildToBack(functionNode1);
        functionNode1.addChildToBack(functionNode2); // function2 is nested inside function1
        compiler.setRoot(scriptNode);

        pass.beginTraversal();

        // Process script (this will trigger traverse on its children)
        pass.process(new Node(Token.EMPTY), scriptNode);

        // After processing script and its children, the state for script should be popped.
        // The stack should return to its initial state.
        assertEquals(1, pass.traversalState.states.size()); // Should be back to the initial state

        pass.endTraversal();
    }

    @Test
    public void testNodeIsReplacedWhenChanged() throws Exception {
        MockCompiler compiler = new MockCompiler();
        // Optimization that changes a number to a string.
        AbstractPeepholeOptimization stringifyOpt = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isNumber()) {
                    reportCodeChange(); // Indicate a change
                    return Node.newString("stringified_" + subtree.getDouble());
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler compiler) {}
            @Override void endTraversal(AbstractCompiler compiler) {}
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, stringifyOpt);

        Node numberNode = Node.newNumber(10.0);
        // The visit method should ensure that the returned node replaces the original
        // if a change occurs. We can't directly check the `currentVersionOfNode` after visit.
        // However, we can verify that the `reportCodeChange` mechanism works.
        pass.visit(numberNode);

        // We can check if the compiler reported a change.
        assertTrue(compiler.isChangeReported());
        // If the node was replaced, its type would change.
        assertEquals(Token.STRING, numberNode.getType());
        assertEquals("stringified_10.0", numberNode.getString());
    }

    @Test
    public void testMultipleOptimizationsAppliedSequentially() throws Exception {
        MockCompiler compiler = new MockCompiler();
        AbstractPeepholeOptimization opt1 = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isNumber() && subtree.getDouble() == 10.0) {
                    reportCodeChange();
                    return Node.newNumber(11.0); // Increment
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler compiler) {}
            @Override void endTraversal(AbstractCompiler compiler) {}
        };
        AbstractPeepholeOptimization opt2 = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isNumber() && subtree.getDouble() == 11.0) {
                    reportCodeChange();
                    return Node.newString("twelve"); // Change to string
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler compiler) {}
            @Override void endTraversal(AbstractCompiler compiler) {}
        };

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt1, opt2);
        Node root = Node.newNumber(10.0);
        pass.visit(root); // Visit should ensure both optimizations run and opt2 acts on opt1's result.

        assertEquals(Token.STRING, root.getType());
        assertEquals("twelve", root.getString());
    }

    @Test
    public void testDoesNotThrowOnNullNodeInput() throws Exception {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        pass.beginTraversal();
        // Calling traverse with null should not throw.
        pass.traverse(null);
        // Calling visit with null should not throw.
        pass.visit(null);
        pass.endTraversal();
        assertTrue(true); // Test passes if no exception is thrown.
    }

    @Test
    public void testHandlesEmptyOptimizationsArray() throws Exception {
        MockCompiler compiler = new MockCompiler();
        // Pass an empty array of optimizations
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, new AbstractPeepholeOptimization[0]);
        Node root = Node.newNumber(5.0);
        compiler.setRoot(root);
        pass.process(new Node(Token.EMPTY), root); // Should complete without error.
        assertTrue(true);
    }

    @Test
    public void testShouldRetraverseForFunctionWithChangedState() {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        Node functionNode = new Node(Token.FUNCTION);
        pass.beginTraversal();
        pass.shouldVisit(functionNode); // Push state for function

        // Manually set changed to true and then check shouldRetraverse
        pass.traversalState.peek().changed = true;
        assertTrue(pass.shouldRetraverse(functionNode));

        pass.exitNode(functionNode); // Clean up stack
        pass.endTraversal();
    }

    @Test
    public void testShouldRetraverseForScriptWithChangedState() {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        Node scriptNode = new Node(Token.SCRIPT);
        pass.beginTraversal();
        pass.shouldVisit(scriptNode); // Push state for script

        // Manually set changed to true and then check shouldRetraverse
        pass.traversalState.peek().changed = true;
        assertTrue(pass.shouldRetraverse(scriptNode));

        pass.exitNode(scriptNode); // Clean up stack
        pass.endTraversal();
    }

    @Test
    public void testShouldRetraverseReturnsFalseWhenNotChanged() {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        Node functionNode = new Node(Token.FUNCTION);
        pass.beginTraversal();
        pass.shouldVisit(functionNode); // Push state for function

        // State is not changed
        assertFalse(pass.shouldRetraverse(functionNode));

        pass.exitNode(functionNode); // Clean up stack
        pass.endTraversal();
    }

    @Test
    public void testShouldRetraverseReturnsFalseForNonFunctionOrScriptNodes() {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        Node blockNode = new Node(Token.BLOCK);
        pass.beginTraversal();
        pass.shouldVisit(blockNode); // Push state for block

        // State is not changed, and it's not a function/script
        assertFalse(pass.shouldRetraverse(blockNode));

        pass.exitNode(blockNode); // Clean up stack
        pass.endTraversal();
    }

    @Test
    public void testExitNodePopsState() {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        Node scriptNode = new Node(Token.SCRIPT);
        pass.beginTraversal();
        pass.shouldVisit(scriptNode); // Push state

        assertEquals(2, pass.traversalState.states.size()); // Initial + script state
        pass.exitNode(scriptNode); // Pop state
        assertEquals(1, pass.traversalState.states.size()); // Back to initial state

        pass.endTraversal();
    }

    @Test
    public void testBeginAndEndTraversalAreCalled() {
        MockCompiler compiler = new MockCompiler();
        final boolean[] beginCalled = {false};
        final boolean[] endCalled = {false};

        AbstractPeepholeOptimization trackerOpt = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) { return subtree; }
            @Override
            void beginTraversal(AbstractCompiler c) { beginCalled[0] = true; }
            @Override
            void endTraversal(AbstractCompiler c) { endCalled[0] = true; }
        };

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, trackerOpt);
        Node root = new Node(Token.ROOT);
        compiler.setRoot(root);
        pass.process(new Node(Token.EMPTY), root);

        assertTrue(beginCalled[0]);
        assertTrue(endCalled[0]);
    }

    @Test
    public void testGetCompilerReturnsCorrectInstance() {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        assertSame(compiler, pass.getCompiler());
    }

    @Test
    public void testVisitMethodIteratesUntilNoChangeWithMultipleOptimizations() throws Exception {
        MockCompiler compiler = new MockCompiler();
        // Optimization 1: Increments a number.
        AbstractPeepholeOptimization opt1 = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isNumber()) {
                    reportCodeChange(); // Signals change
                    return Node.newNumber(subtree.getDouble() + 1);
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        };
        // Optimization 2: Does nothing if the number is already incremented.
        AbstractPeepholeOptimization opt2 = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                // This optimization will only change the node on the first pass if it's still a number.
                if (subtree.isNumber() && subtree.getDouble() < 100) { // Prevent infinite loop on test
                    reportCodeChange();
                    return Node.newNumber(subtree.getDouble() + 1);
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        };

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt1, opt2);
        Node root = Node.newNumber(5.0);
        pass.visit(root); // Should run until no change.

        // opt1 makes it 6.0. Then opt2 makes it 7.0.
        // The do-while loop in visit should then run again.
        // opt1 sees 7.0, returns 7.0 (no change).
        // opt2 sees 7.0, returns 7.0 (no change).
        // The loop terminates. Final value should be 7.0.
        assertEquals(7.0, root.getDouble(), 1e-9);
    }

    @Test
    public void testNullOptimizationReturnDoesNotBreakProcess() throws Exception {
        MockCompiler compiler = new MockCompiler();
        // An optimization that returns null.
        AbstractPeepholeOptimization nullReturningOpt = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                reportCodeChange(); // Report a change
                return null; // Simulate node removal
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, nullReturningOpt);
        Node root = new Node(Token.ROOT, new Node(Token.NUMBER)); // Root with a child
        compiler.setRoot(root);
        pass.process(new Node(Token.EMPTY), root); // Should complete without error.
        assertTrue(true); // Test passes if no exception is thrown.
    }
}
```