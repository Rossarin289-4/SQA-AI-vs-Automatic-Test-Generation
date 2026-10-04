package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.jstype.UnionType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.io.Serializable;

public class TypeCheckTest {

    // --- Mock Objects ---

    private static class MockCompiler implements AbstractCompiler {
        @Override public DiagnosticType[] getDiagnosticGroups() { return new DiagnosticType[0]; }
        @Override public void report(JSError error) { }
        @Override public boolean isNormalizedNodeNamesEnabled() { return false; }
        @Override public CodingConvention getCodingConvention() { return new GoogleCodingConvention(); }
        @Override public TypeValidator getTypeValidator() { return new TypeValidator(this); }
        @Override public void setProgress(Progress p) { }
        @Override public void setBootProgress(Progress p) { }
        @Override public Progress getProgress() { return null; }
        @Override public PhaseOptimizer getOptimizer() { return null; }
        @Override public CompilerOptions getOptions() { return new CompilerOptions(); }
        @Override public ErrorReporter getErrorReporter() {
            return new ErrorReporter() {
                @Override public void report(JSError.Severity severity, String message) {}
                @Override public void report(JSError.Severity severity, String message, String sourceName, int lineNumber, int charNumber) {}
            };
        }
    }

    private static class MockJSTypeRegistry extends JSTypeRegistry {
        public MockJSTypeRegistry() {
            super(new MockMessageFormatter());
        }

        @Override public JSType getType(String typeName) {
            if ("string".equals(typeName)) return getNativeType(JSTypeNative.STRING_TYPE);
            if ("number".equals(typeName)) return getNativeType(JSTypeNative.NUMBER_TYPE);
            if ("boolean".equals(typeName)) return getNativeType(JSTypeNative.BOOLEAN_TYPE);
            if ("undefined".equals(typeName)) return getNativeType(JSTypeNative.VOID_TYPE);
            if ("object".equals(typeName)) return getNativeType(JSTypeNative.OBJECT_TYPE);
            if ("function".equals(typeName)) return getNativeType(JSTypeNative.FUNCTION_TYPE);
            return getNativeType(JSTypeNative.UNKNOWN_TYPE);
        }

        @Override public JSType getNativeType(JSTypeNative typeId) { return new MockJSType(typeId); }
        @Override public boolean canPropertyBeDefined(JSType objectType, String propName) { return true; }
        @Override public ObjectType getObjectFromPrototype(ObjectType proto) { return proto; }
        @Override public FunctionType getNativeFunctionType(JSTypeNative typeId) { return new MockFunctionType(typeId, this); }
        @Override public JSType getFunctionType(ObjectType objectType) { return getNativeFunctionType(JSTypeNative.FUNCTION_TYPE); }
    }

    private static class MockJSType extends JSType {
        private JSTypeNative nativeType;
        private boolean isFunction = false;
        private boolean isConstructor = false;
        private boolean isInterface = false;
        private boolean isUnknown = false;
        private boolean isString = false;
        private boolean isNumber = false;
        private boolean isBoolean = false;
        private boolean isVoid = false;
        private boolean isObject = false;
        private boolean isStruct = false;
        private boolean isDict = false;
        private ObjectType prototype;
        private boolean isEnum = false;

        MockJSType(JSTypeNative nativeType) {
            super(null); // Mock registry is null
            this.nativeType = nativeType;
            switch (nativeType) {
                case STRING_TYPE: isString = true; isObject = true; break;
                case NUMBER_TYPE: isNumber = true; isObject = true; break;
                case BOOLEAN_TYPE: isBoolean = true; isObject = true; break;
                case VOID_TYPE: isVoid = true; break;
                case OBJECT_TYPE: isObject = true; break;
                case FUNCTION_TYPE: isFunction = true; break;
                case UNKNOWN_TYPE: isUnknown = true; break;
                case REGEXP_TYPE: isObject = true; break;
                case ARRAY_TYPE: isObject = true; break;
                default: break;
            }
        }

        @Override public String getDisplayName() { return nativeType.name(); }
        @Override public boolean isString() { return isString; }
        @Override public boolean isNumber() { return isNumber; }
        @Override public boolean isBoolean() { return isBoolean; }
        @Override public boolean isVoidType() { return isVoid; }
        @Override public boolean isObject() { return isObject; }
        @Override public boolean isFunctionType() { return isFunction; }
        @Override public boolean isConstructor() { return isConstructor; }
        @Override public boolean isInterface() { return isInterface; }
        @Override public boolean isUnknownType() { return isUnknown; }
        @Override public boolean isStruct() { return isStruct; }
        @Override public boolean isDict() { return isDict; }
        @Override public boolean isEnumType() { return isEnum; }

        @Override public ObjectType getPrototype() {
            if (prototype == null) {
                prototype = new MockObjectType(this, null);
            }
            return prototype;
        }

        @Override public JSType restrictByNotNullOrUndefined() { return this; }
        @Override public TernaryValue testForEquality(JSType other) { return TernaryValue.UNKNOWN; }
        @Override public boolean canCastTo(JSType target) { return true; }
        @Override public boolean isSubtype(JSType other) { return true; }
        @Override public JSType autocompl(JSTypeNative typeId) { return this; }
        @Override public JSType visit(TemplateTypeMapReplacer replacer) { return this; }
        @Override public TemplateTypeMap getTemplateTypeMap() { return new TemplateTypeMap(); }
        @Override public boolean isEquivalentTo(JSType other) { return this == other; }
        @Override public UnionType toMaybeUnionType() { return null; }
        @Override public FunctionType toMaybeFunctionType() {
            if (isFunction) return new MockFunctionType(this.nativeType, null);
            return null;
        }
        @Override public ObjectType toMaybeObjectType() {
            if (isObject) return new MockObjectType(this, null);
            return null;
        }
        @Override public EnumElementType toMaybeEnumElementType() { return null; }
        @Override public EnumType toMaybeEnumType() {
             if (isEnum) return new MockEnumType(this.nativeType, null);
             return null;
        }
        @Override public Object toMaybeRecordType() { return null; }
        @Override public TemplatizedType toMaybeTemplatizedType() { return null; }
        @Override public TemplateType toMaybeTemplateType() { return null; }
        @Override public JSDocInfo getJSDocInfo() { return null; }
    }

    private static class MockFunctionType extends MockJSType implements FunctionType {
        private JSType returnType = null;
        private JSType[] params = new JSType[0];
        private boolean hasInstanceType = false;

        MockFunctionType(JSTypeNative nativeType, JSTypeRegistry registry) {
            super(nativeType);
            isFunction = true;
            if (nativeType == JSTypeNative.OBJECT_FUNCTION_TYPE) {
                isConstructor = true;
                returnType = getNativeType(JSTypeNative.OBJECT_TYPE);
                prototype = new MockObjectType(this, registry);
                ((MockObjectType) prototype).setConstructor(this);
                hasInstanceType = true;
            }
        }

        @Override public JSType getReturnType() { return returnType != null ? returnType : getNativeType(JSTypeNative.UNKNOWN_TYPE); }
        @Override public JSType getTypeOfThis() { return getNativeType(JSTypeNative.OBJECT_TYPE); }
        @Override public java.util.List<JSType> getParameters() { return Arrays.asList(params); }
        @Override public int getMinArguments() { return 0; }
        @Override public int getMaxArguments() { return Integer.MAX_VALUE; }
        @Override public boolean isInstanceType() { return false; }
        @Override public ObjectType getInstanceType() { return hasInstanceType ? new MockObjectType(this, null) : null; }
        @Override public FunctionType getSuperClassConstructor() { return null; }
        @Override public ImmutableList<JSType> getImplementedInterfaces() { return ImmutableList.of(); }
        @Override public ImmutableList<ObjectType> getExtendedInterfaces() { return ImmutableList.of(); }
        @Override public String getReferenceName() { return "MockFunction"; }
        @Override public boolean hasInstanceType() { return hasInstanceType; }
        @Override public boolean canBeCalled() { return true; }
        @Override public ObjectType getPrototype() {
            if (prototype == null) {
                prototype = new MockObjectType(this, null);
            }
            return prototype;
        }
    }
    
    private static class MockEnumType extends MockJSType implements EnumType {
        MockEnumType(JSTypeNative nativeType, JSTypeRegistry registry) {
            super(nativeType);
            isEnum = true;
        }

        @Override public JSType getElementsType() { return getNativeType(JSTypeNative.NUMBER_TYPE); }
    }

    private static class MockObjectType extends MockJSType implements ObjectType {
        private ObjectType implicitPrototype = null;
        private FunctionType constructor = null;
        private Map<String, JSType> properties = new HashMap<>();
        private JSType baseType;

        MockObjectType(JSType baseType, JSTypeRegistry registry) {
            super(JSTypeNative.OBJECT_TYPE);
            this.baseType = baseType;
            this.isObject = true;
        }

        @Override public FunctionType getConstructor() { return constructor; }
        public void setConstructor(FunctionType constructor) { this.constructor = constructor; }
        @Override public ObjectType getImplicitPrototype() { return implicitPrototype; }
        public void setImplicitPrototype(ObjectType proto) { this.implicitPrototype = proto; }
        @Override public String getReferenceName() { return "MockObject"; }
        @Override public Set<String> getOwnPropertyNames() { return properties.keySet(); }
        @Override public boolean hasOwnProperty(String name) { return properties.containsKey(name); }
        @Override public JSType getPropertyType(String name) { return properties.get(name); }
        @Override public boolean defineProperty(String name, JSType type, boolean inferred, Node node) {
            properties.put(name, type);
            return true;
        }
        @Override public boolean isStruct() { return isStruct; }
        @Override public void setStruct(boolean isStruct) { this.isStruct = isStruct; }
        @Override public boolean isDict() { return isDict; }
        @Override public void setDict(boolean isDict) { this.isDict = isDict; }
        @Override public JSDocInfo getOwnPropertyJSDocInfo(String propertyName) { return null; }
        @Override public boolean hasProperty(String name) { return properties.containsKey(name) || (implicitPrototype != null && implicitPrototype.hasProperty(name)); }
        @Override public ObjectType getOwnerFunction() { return this; }
        @Override public JSType getTypeOfThis() { return this.baseType; }

        @Override public JSType findPropertyType(String propertyName) {
            if (properties.containsKey(propertyName)) {
                return properties.get(propertyName);
            }
            if (implicitPrototype != null) {
                return implicitPrototype.findPropertyType(propertyName);
            }
            return getNativeType(JSTypeNative.UNKNOWN_TYPE);
        }
        @Override public boolean isPropertyTypeDeclared(String propertyName) { return properties.containsKey(propertyName); }
        @Override public boolean isPropertyTypeInferred(String propertyName) { return properties.containsKey(propertyName); }
        @Override public ObjectType getTopMostDefiningType(String propertyName) { return this; }
        @Override public Node getRootNode() { return new MockNode(Token.OBJECTLIT); }
        @Override public PropertyMap getPropertyMap() { return null; }
        @Override public Property getSlot(String name) { return null; }
        @Override public Property getOwnSlot(String name) { return null; }
        @Override public ObjectType getParentScope() { return null; }
        @Override public boolean detectImplicitPrototypeCycle() { return false; }
        @Override public boolean detectInheritanceCycle() { return false; }
        @Override public String getNormalizedReferenceName() { return getReferenceName(); }
        @Override public boolean hasReferenceName() { return true; }
        @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
        @Override public boolean defineDeclaredProperty(String propertyName, JSType type, Node propertyNode) { return defineProperty(propertyName, type, false, propertyNode); }
        @Override public boolean defineSynthesizedProperty(String propertyName, JSType type, Node propertyNode) { return defineProperty(propertyName, type, true, propertyNode); }
        @Override public boolean removeProperty(String propertyName) { return false; }
        @Override public Node getPropertyNode(String propertyName) { return null; }
        @Override public void setPropertyJSDocInfo(String propertyName, JSDocInfo info) {}
        @Override public int getPropertiesCount() { return properties.size(); }
        @Override public void collectPropertyNames(Set<String> props) { props.addAll(properties.keySet()); }
    }
    
    private static class MockNode extends Node {
        private JSType type = null;
        private String stringValue = null;
        private double doubleValue = 0.0;
        private boolean isFromExterns = false;
        private JSDocInfo jsDocInfo = null;

        MockNode(int type) { super(type); }
        MockNode(int type, String value) { super(type); this.stringValue = value; }
        MockNode(int type, double value) { super(type); this.doubleValue = value; }

        @Override public void setJSType(JSType type) { this.type = type; }
        @Override public JSType getJSType() { return this.type != null ? this.type : new MockJSType(JSTypeNative.UNKNOWN_TYPE); }
        @Override public String getString() { return this.stringValue; }
        @Override public double getDouble() { return this.doubleValue; }
        public void setFromExterns(boolean isFromExterns) { this.isFromExterns = isFromExterns; }
        @Override public boolean isFromExterns() { return this.isFromExterns; }
        @Override public JSDocInfo getJSDocInfo() { return this.jsDocInfo; }
        public void setJSDocInfo(JSDocInfo jsDocInfo) { this.jsDocInfo = jsDocInfo; }
    }

    private static class MockNodeTraversal extends NodeTraversal {
        private Scope currentScope;
        private MockCompiler compiler;

        MockNodeTraversal(MockCompiler compiler, Scope scope) {
            super(compiler, null, null);
            this.compiler = compiler;
            this.currentScope = scope;
        }

        @Override public Scope getScope() { return currentScope; }
        @Override public void report(Node n, DiagnosticType diagnosticType, String... arguments) { }
        @Override public NodeTraversal makeError(Node n, DiagnosticType dt, String... arguments) { return this; }
        @Override public ErrorReporter getErrorReporter() { return compiler.getErrorReporter(); }
    }
    
    private static class MockScope implements Scope {
        private Map<String, Var> vars = new HashMap<>();
        private JSType typeOfThis;
        private Node rootNode;
        private Scope parent;

        MockScope(Node rootNode, JSType typeOfThis) {
            this.rootNode = rootNode;
            this.typeOfThis = typeOfThis;
        }

        @Override public Var getVar(String name) { return vars.get(name); }
        @Override public boolean isDeclared(String name, boolean preferFnDecl) { return vars.containsKey(name); }
        @Override public JSType getTypeOfThis() { return typeOfThis; }
        @Override public Node getRootNode() { return rootNode; }
        @Override public Scope getParent() { return parent; }
        public void setParent(Scope parent) { this.parent = parent; }

        @Override public Var generateConstantVar(String name, JSType type, boolean cast) { return null;}
        @Override public Var declare(String name, Node node, JSType type, boolean cast, boolean implicit) { return null;}
        @Override public void declareTypeAlias(String name, Node node, JSType type) {}
        @Override public boolean isGlobal() { return parent == null; }
        @Override public Var getImplicitObject() { return null; }
        @Override public void inferParameterTypes(Node fnNode) {}
        @Override public void setGlobalVar(String name, JSType type, boolean cast) {}
        @Override public Var getOwnSlot(String name) { return null; }
        @Override public void setChildScope(Scope childScope) {}
        @Override public void setPrototypeDeclaration(Node node) {}
        @Override public void setTypedScopeCreator(TypedScopeCreator creator) {}
        @Override public TypedScopeCreator getTypedScopeCreator() { return null; }
    }
    
    private static class MockTypedScopeCreator extends TypedScopeCreator {
        MockTypedScopeCreator(AbstractCompiler compiler) { super(compiler); }
        
        @Override public Scope createScope(Node node, Scope parent) {
            MockScope mockScope = new MockScope(node, null);
            mockScope.setParent(parent);
            return mockScope;
        }
    }
    
    private static class MockMemoizedScopeCreator extends MemoizedScopeCreator {
        MockMemoizedScopeCreator(TypedScopeCreator delegate) { super(delegate); }

        @Override public Scope createScope(Node rootNode, Scope parent) {
            MockScope mockScope = new MockScope(rootNode, null);
            mockScope.setParent(parent);
            return mockScope;
        }
    }

    private static class MockReverseAbstractInterpreter extends ReverseAbstractInterpreter {
        MockReverseAbstractInterpreter(JSTypeRegistry typeRegistry) { super(typeRegistry); }
        @Override public JSType getPreciseViaTypeof(Node node, String typeStr) { return typeRegistry.getType(typeStr); }
    }

    // Helper to create TypeCheck instance with mocks
    private TypeCheck createTypeCheck(AbstractCompiler compiler, JSTypeRegistry registry, Scope scope, MemoizedScopeCreator scopeCreator) {
        ReverseAbstractInterpreter reverseInterpreter = new MockReverseAbstractInterpreter(registry);
        return new TypeCheck(compiler, reverseInterpreter, registry, scope, scopeCreator, CheckLevel.WARNING);
    }

    // --- Test Cases ---

    @Test public void testVisitCase() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node switchNode = new MockNode(Token.SWITCH);
        Node caseNode = new MockNode(Token.CASE);
        Node caseValueNode = new MockNode(Token.NUMBER, 10.0);
        caseValueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        caseNode.addChildToBack(caseValueNode);
        switchNode.addChildToBack(new MockNode(Token.DEFAULT_CASE));
        switchNode.addChildToBack(caseNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, caseNode, switchNode);
        assertNotNull(caseNode.getJSType());
    }

    @Test public void testVisitWith() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node withNode = new MockNode(Token.WITH);
        Node objectNode = new MockNode(Token.OBJECTLIT);
        objectNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        withNode.addChildToBack(objectNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        Node parent = new MockNode(Token.BLOCK);
        parent.addChildToBack(withNode);

        typeCheck.visit(traversal, withNode, parent);
        assertNotNull(objectNode.getJSType());
    }

    @Test public void testVisitFunctionSimple() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node functionNode = new MockNode(Token.FUNCTION);
        Node functionNameNode = new MockNode(Token.NAME, "myFunction");
        functionNode.addChildToBack(functionNameNode);
        functionNode.setJSType(new MockFunctionType(JSTypeNative.FUNCTION_TYPE, registry));

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, functionNode, new MockNode(Token.BLOCK));

        assertNotNull(functionNode.getJSType());
        assertTrue(functionNode.getJSType().isFunctionType());
    }

    @Test public void testVisitVarDeclaration() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "myVar");
        Node valueNode = new MockNode(Token.NUMBER, 123.0);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        nameNode.addChildToBack(valueNode);
        varNode.addChildToBack(nameNode);

        Var var = new Var("myVar", nameNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("myVar", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, varNode, new MockNode(Token.BLOCK));

        assertNotNull(nameNode.getJSType());
        assertTrue(nameNode.getJSType().isNumber());
    }

    @Test public void testVisitNewExpression() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node newNode = new MockNode(Token.NEW);
        Node constructorNode = new MockNode(Token.NAME, "MyClass");
        MockFunctionType constructorType = new MockFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE, registry);
        constructorType.isConstructor = true;
        constructorType.returnType = new MockObjectType(constructorType, registry);
        constructorNode.setJSType(constructorType);
        newNode.addChildToBack(constructorNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, newNode, new MockNode(Token.EXPR_RESULT));

        assertNotNull(newNode.getJSType());
        assertEquals(constructorType.getInstanceType(), newNode.getJSType());
    }

    @Test public void testVisitCallExpression() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node callNode = new MockNode(Token.CALL);
        Node functionNameNode = new MockNode(Token.NAME, "myFunc");
        MockFunctionType funcType = new MockFunctionType(JSTypeNative.FUNCTION_TYPE, registry);
        funcType.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        functionNameNode.setJSType(funcType);
        callNode.addChildToBack(functionNameNode);
        callNode.addChildToBack(new MockNode(Token.NUMBER, 1.0));

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, callNode, new MockNode(Token.EXPR_RESULT));

        assertNotNull(callNode.getJSType());
        assertEquals(funcType.getReturnType(), callNode.getJSType());
    }

    @Test public void testVisitReturnStatement() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Node scriptNode = new MockNode(Token.SCRIPT);
        Scope rootScope = new MockScope(scriptNode, null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node returnNode = new MockNode(Token.RETURN);
        Node returnValueNode = new MockNode(Token.NUMBER, 42.0);
        returnValueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        returnNode.addChildToBack(returnValueNode);

        Node functionNode = new MockNode(Token.FUNCTION);
        MockFunctionType funcType = new MockFunctionType(JSTypeNative.FUNCTION_TYPE, registry);
        funcType.returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        functionNode.setJSType(funcType);
        
        Node blockNode = new MockNode(Token.BLOCK);
        blockNode.addChildToBack(returnNode);
        functionNode.addChildToBack(blockNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        traversal.currentScope = new MockScope(functionNode, null); // Set context
        
        typeCheck.visit(traversal, returnNode, blockNode);
        assertNotNull(returnNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorAdd() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node addNode = new MockNode(Token.ADD);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        addNode.addChildToBack(leftNode);
        addNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, addNode, new MockNode(Token.BLOCK));

        assertNotNull(addNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorSubtract() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node subNode = new MockNode(Token.SUB);
        Node leftNode = new MockNode(Token.NUMBER, 15.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        subNode.addChildToBack(leftNode);
        subNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, subNode, new MockNode(Token.BLOCK));

        assertNotNull(subNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), subNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorMultiply() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node mulNode = new MockNode(Token.MUL);
        Node leftNode = new MockNode(Token.NUMBER, 3.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 4.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        mulNode.addChildToBack(leftNode);
        mulNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, mulNode, new MockNode(Token.BLOCK));

        assertNotNull(mulNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), mulNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorDivide() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node divNode = new MockNode(Token.DIV);
        Node leftNode = new MockNode(Token.NUMBER, 20.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        divNode.addChildToBack(leftNode);
        divNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, divNode, new MockNode(Token.BLOCK));

        assertNotNull(divNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), divNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorModulus() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node modNode = new MockNode(Token.MOD);
        Node leftNode = new MockNode(Token.NUMBER, 7.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 3.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        modNode.addChildToBack(leftNode);
        modNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, modNode, new MockNode(Token.BLOCK));

        assertNotNull(modNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), modNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorBitwiseAnd() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node bitAndNode = new MockNode(Token.BITAND);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 3.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitAndNode.addChildToBack(leftNode);
        bitAndNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, bitAndNode, new MockNode(Token.BLOCK));

        assertNotNull(bitAndNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitAndNode.getJSType());
    }
    
    @Test public void testVisitBinaryOperatorBitwiseOr() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node bitOrNode = new MockNode(Token.BITOR);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 3.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitOrNode.addChildToBack(leftNode);
        bitOrNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, bitOrNode, new MockNode(Token.BLOCK));

        assertNotNull(bitOrNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitOrNode.getJSType());
    }
    
    @Test public void testVisitBinaryOperatorBitwiseXor() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node bitXorNode = new MockNode(Token.BITXOR);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 3.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitXorNode.addChildToBack(leftNode);
        bitXorNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, bitXorNode, new MockNode(Token.BLOCK));

        assertNotNull(bitXorNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitXorNode.getJSType());
    }
    
    @Test public void testVisitBinaryOperatorLeftShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node lshNode = new MockNode(Token.LSH);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 2.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        lshNode.addChildToBack(leftNode);
        lshNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, lshNode, new MockNode(Token.BLOCK));

        assertNotNull(lshNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), lshNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorRightShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node rshNode = new MockNode(Token.RSH);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 1.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rshNode.addChildToBack(leftNode);
        rshNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, rshNode, new MockNode(Token.BLOCK));

        assertNotNull(rshNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), rshNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorUnsignedRightShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node urshNode = new MockNode(Token.URSH);
        Node leftNode = new MockNode(Token.NUMBER, -5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 1.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        urshNode.addChildToBack(leftNode);
        urshNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, urshNode, new MockNode(Token.BLOCK));

        assertNotNull(urshNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), urshNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorAdd() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_ADD);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitAssignOperatorSubtract() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_SUB);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitAssignOperatorMultiply() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_MUL);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorDivide() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_DIV);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorModulus() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_MOD);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorBitwiseAnd() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_BITAND);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorLeftShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_LSH);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 2.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorRightShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_RSH);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 1.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitAssignOperatorUnsignedRightShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_URSH);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 1.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitGetProp() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node getPropNode = new MockNode(Token.GETPROP);
        Node objNode = new MockNode(Token.OBJECTLIT);
        objNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNameNode = new MockNode(Token.STRING_KEY, "myProperty");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        
        ((MockObjectType)objNode.getJSType()).defineProperty("myProperty", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, propNameNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, getPropNode, new MockNode(Token.BLOCK));

        assertNotNull(getPropNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), getPropNode.getJSType());
    }

    @Test public void testVisitGetElem() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node getElemNode = new MockNode(Token.GETELEM);
        Node arrayNode = new MockNode(Token.ARRAYLIT);
        arrayNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        Node indexNode = new MockNode(Token.NUMBER, 0.0);
        indexNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        getElemNode.addChildToBack(arrayNode);
        getElemNode.addChildToBack(indexNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, getElemNode, new MockNode(Token.BLOCK));

        assertNotNull(getElemNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), getElemNode.getJSType());
    }

    @Test public void testVisitCast() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node castNode = new MockNode(Token.CAST);
        Node exprNode = new MockNode(Token.STRING, "hello");
        exprNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        castNode.addChildToBack(exprNode);
        castNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); 

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, castNode, new MockNode(Token.BLOCK));

        assertNotNull(exprNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), exprNode.getJSType());
        assertNotNull(castNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), castNode.getJSType());
    }

    @Test public void testVisitThis() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        
        JSType thisType = registry.getType("MyClass");
        Node scriptNode = new MockNode(Token.SCRIPT);
        Scope rootScope = new MockScope(scriptNode, thisType); 
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node thisNode = new MockNode(Token.THIS);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, thisNode, new MockNode(Token.BLOCK));

        assertNotNull(thisNode.getJSType());
        assertEquals(thisType, thisNode.getJSType());
    }

    @Test public void testVisitNumberLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node numberNode = new MockNode(Token.NUMBER, 123.45);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, numberNode, new MockNode(Token.BLOCK));

        assertNotNull(numberNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberNode.getJSType());
    }

    @Test public void testVisitStringLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node stringNode = new MockNode(Token.STRING, "test");

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, stringNode, new MockNode(Token.BLOCK));

        assertNotNull(stringNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), stringNode.getJSType());
    }

    @Test public void testVisitBooleanLiteralTrue() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node trueNode = new MockNode(Token.TRUE);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, trueNode, new MockNode(Token.BLOCK));

        assertNotNull(trueNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), trueNode.getJSType());
    }

    @Test public void testVisitBooleanLiteralFalse() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node falseNode = new MockNode(Token.FALSE);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, falseNode, new MockNode(Token.BLOCK));

        assertNotNull(falseNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), falseNode.getJSType());
    }

    @Test public void testVisitNullLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node nullNode = new MockNode(Token.NULL);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, nullNode, new MockNode(Token.BLOCK));

        assertNotNull(nullNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), nullNode.getJSType());
    }

    @Test public void testVisitRegExpLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node regexpNode = new MockNode(Token.REGEXP);
        regexpNode.setJSType(registry.getNativeType(JSTypeNative.REGEXP_TYPE));

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, regexpNode, new MockNode(Token.BLOCK));

        assertNotNull(regexpNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.REGEXP_TYPE), regexpNode.getJSType());
    }

    @Test public void testVisitArrayLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node arrayNode = new MockNode(Token.ARRAYLIT);
        arrayNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, arrayNode, new MockNode(Token.BLOCK));

        assertNotNull(arrayNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayNode.getJSType());
    }

    @Test public void testVisitCommaOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node commaNode = new MockNode(Token.COMMA);
        Node expr1 = new MockNode(Token.NUMBER, 1.0);
        expr1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node expr2 = new MockNode(Token.STRING, "two");
        expr2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        commaNode.addChildToBack(expr1);
        commaNode.addChildToBack(expr2);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, commaNode, new MockNode(Token.BLOCK));

        assertNotNull(commaNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), commaNode.getJSType());
    }
    
    @Test public void testVisitNotOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node notNode = new MockNode(Token.NOT);
        Node operandNode = new MockNode(Token.TRUE);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        notNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, notNode, new MockNode(Token.BLOCK));

        assertNotNull(notNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), notNode.getJSType());
    }
    
    @Test public void testVisitBitNotOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node bitNotNode = new MockNode(Token.BITNOT);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitNotNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, bitNotNode, new MockNode(Token.BLOCK));

        assertNotNull(bitNotNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitNotNode.getJSType());
    }

    @Test public void testVisitPosOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node posNode = new MockNode(Token.POS);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        posNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, posNode, new MockNode(Token.BLOCK));

        assertNotNull(posNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), posNode.getJSType());
    }
    
    @Test public void testVisitNegOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node negNode = new MockNode(Token.NEG);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        negNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, negNode, new MockNode(Token.BLOCK));

        assertNotNull(negNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), negNode.getJSType());
    }

    @Test public void testVisitVoidOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node voidNode = new MockNode(Token.VOID);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        voidNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, voidNode, new MockNode(Token.BLOCK));

        assertNotNull(voidNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), voidNode.getJSType());
    }

    @Test public void testVisitTypeOfOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node typeOfNode = new MockNode(Token.TYPEOF);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        typeOfNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, typeOfNode, new MockNode(Token.BLOCK));

        assertNotNull(typeOfNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeOfNode.getJSType());
    }

    @Test public void testVisitIncOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node incNode = new MockNode(Token.INC);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        incNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, incNode, new MockNode(Token.BLOCK));

        assertNotNull(incNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), incNode.getJSType());
    }

    @Test public void testVisitDecOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node decNode = new MockNode(Token.DEC);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        decNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, decNode, new MockNode(Token.BLOCK));

        assertNotNull(decNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), decNode.getJSType());
    }

    @Test public void testVisitDelPropOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node delPropNode = new MockNode(Token.DELPROP);
        Node objNode = new MockNode(Token.OBJECTLIT);
        objNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNameNode = new MockNode(Token.STRING_KEY, "prop");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        delPropNode.addChildToBack(objNode);
        delPropNode.addChildToBack(propNameNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, delPropNode, new MockNode(Token.BLOCK));

        assertNotNull(delPropNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), delPropNode.getJSType());
    }
    
    @Test public void testProcessForTesting() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Node externsRoot = new MockNode(Token.SCRIPT);
        Node jsRoot = new MockNode(Token.SCRIPT);
        TypeCheck typeCheck = new TypeCheck(compiler, new MockReverseAbstractInterpreter(registry), registry);

        Scope resultScope = typeCheck.processForTesting(externsRoot, jsRoot);

        assertNotNull(resultScope);
        assertTrue(resultScope instanceof MockScope);
    }

    @Test public void testCheckExterns() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);
        
        Node externsNode = new MockNode(Token.SCRIPT);
        externsNode.setFromExterns(true);

        typeCheck.check(externsNode, true);
        assertTrue(true); 
    }

    @Test public void testCheckSourceCode() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);
        
        Node jsCodeNode = new MockNode(Token.SCRIPT);

        typeCheck.check(jsCodeNode, false);
        assertTrue(true);
    }
    
    @Test public void testShouldTraverseFunctionMaskingVariable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node functionNode = new MockNode(Token.FUNCTION);
        Node functionNameNode = new MockNode(Token.NAME, "myVar");
        functionNode.addChildToBack(functionNameNode);
        
        Node varNameNode = new MockNode(Token.NAME, "myVar");
        varNameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Var existingVar = new Var("myVar", varNameNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("myVar", existingVar);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        Node parent = new MockNode(Token.BLOCK);
        parent.addChildToBack(functionNode);

        boolean shouldTraverse = typeCheck.shouldTraverse(traversal, functionNode, parent);

        assertTrue(shouldTraverse);
    }

    @Test public void testVisitAssignPrototype() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getPropNode = new MockNode(Token.GETPROP);
        Node constructorNode = new MockNode(Token.NAME, "MyClass");
        MockFunctionType constructorType = new MockFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE, registry);
        constructorType.isConstructor = true;
        constructorNode.setJSType(constructorType);

        Node prototypeNode = new MockNode(Token.STRING_KEY, "prototype");
        prototypeNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        getPropNode.addChildToBack(constructorNode);
        getPropNode.addChildToBack(prototypeNode);
        getPropNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));

        Node valueNode = new MockNode(Token.OBJECTLIT);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(valueNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitTypeofString() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node eqNode = new MockNode(Token.EQ);
        Node typeofNode = new MockNode(Token.TYPEOF);
        Node exprNode = new MockNode(Token.STRING, "hello");
        exprNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        typeofNode.addChildToBack(exprNode);
        typeofNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node stringLiteralNode = new MockNode(Token.STRING, "string");
        stringLiteralNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        eqNode.addChildToBack(typeofNode);
        eqNode.addChildToBack(stringLiteralNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, eqNode, new MockNode(Token.BLOCK));

        assertNotNull(eqNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), eqNode.getJSType());
    }

    @Test public void testVisitEnumAlias() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node nameNodeLeft = new MockNode(Token.NAME, "enumVar1");
        nameNodeLeft.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));

        Node nameNodeRight = new MockNode(Token.NAME, "enumVar2");
        MockJSType enumType1 = new MockJSType(JSTypeNative.OBJECT_TYPE);
        enumType1.isEnum = true;
        nameNodeRight.setJSType(enumType1);

        assignNode.addChildToBack(nameNodeLeft);
        assignNode.addChildToBack(nameNodeRight);

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addEnumParameterType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ((MockNode)nameNodeLeft).setJSDocInfo(jsDocInfo);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitParamListOfFunctionType() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node functionNode = new MockNode(Token.FUNCTION);
        Node paramList = new MockNode(Token.PARAM_LIST);
        Node param1 = new MockNode(Token.NAME, "arg1");
        param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node param2 = new MockNode(Token.NAME, "arg2");
        param2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        paramList.addChildToBack(param1);
        paramList.addChildToBack(param2);
        functionNode.addChildToBack(paramList);

        MockFunctionType funcType = new MockFunctionType(JSTypeNative.FUNCTION_TYPE, registry);
        funcType.params = new JSType[]{registry.getNativeType(JSTypeNative.NUMBER_TYPE), registry.getNativeType(JSTypeNative.STRING_TYPE)};
        functionNode.setJSType(funcType);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, functionNode, new MockNode(Token.BLOCK));

        assertNotNull(functionNode.getJSType());
    }
    
    @Test public void testVisitCallWithNoArguments() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node callNode = new MockNode(Token.CALL);
        Node functionNameNode = new MockNode(Token.NAME, "noArgsFunc");
        MockFunctionType funcType = new MockFunctionType(JSTypeNative.FUNCTION_TYPE, registry);
        funcType.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        functionNameNode.setJSType(funcType);
        callNode.addChildToBack(functionNameNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, callNode, new MockNode(Token.EXPR_RESULT));

        assertNotNull(callNode.getJSType());
        assertEquals(funcType.getReturnType(), callNode.getJSType());
    }

    @Test public void testVisitAssignToStructProperty() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getPropNode = new MockNode(Token.GETPROP);
        Node structNode = new MockNode(Token.OBJECTLIT);
        MockObjectType structType = new MockObjectType(null, registry);
        structType.setStruct(true);
        structNode.setJSType(structType);
        
        Node propNameNode = new MockNode(Token.STRING_KEY, "myStructProp");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        getPropNode.addChildToBack(structNode);
        getPropNode.addChildToBack(propNameNode);
        
        structType.defineProperty("myStructProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, propNameNode);

        Node valueNode = new MockNode(Token.NUMBER, 123.0);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(valueNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignToNewPropertyOnStruct() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getPropNode = new MockNode(Token.GETPROP);
        Node structNode = new MockNode(Token.OBJECTLIT);
        MockObjectType structType = new MockObjectType(null, registry);
        structType.setStruct(true);
        structNode.setJSType(structType);
        
        Node propNameNode = new MockNode(Token.STRING_KEY, "newStructProp");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        getPropNode.addChildToBack(structNode);
        getPropNode.addChildToBack(propNameNode);
        
        Node valueNode = new MockNode(Token.NUMBER, 123.0);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(valueNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testProcessMethod() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node externsRoot = new MockNode(Token.SCRIPT);
        Node jsRoot = new MockNode(Token.SCRIPT);
        Node parentNode = new MockNode(Token.BLOCK);
        parentNode.addChildToBack(jsRoot);

        typeCheck.process(externsRoot, jsRoot);
        assertTrue(true);
    }

    @Test public void testShouldTraverseNonFunctionNode() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node node = new MockNode(Token.STRING, "some string");
        Node parent = new MockNode(Token.BLOCK);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);

        boolean result = typeCheck.shouldTraverse(traversal, node, parent);

        assertTrue(result);
    }

    @Test public void testVisitAssignQualifiedName() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node leftNode = new MockNode(Token.NAME, "myVar");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 42.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("myVar", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("myVar", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
}
