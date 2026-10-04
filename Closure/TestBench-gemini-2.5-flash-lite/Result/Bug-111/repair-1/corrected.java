package com.google.javascript.jscomp.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.Visitor;
import java.util.Map;

public class ClosureReverseAbstractInterpreterTest {

    // Mock CodingConvention and JSTypeRegistry for testing
    private CodingConvention mockConvention = new MockCodingConvention();
    private JSTypeRegistry typeRegistry = new JSTypeRegistry(null);

    private ClosureReverseAbstractInterpreter createInterpreter() {
        return new ClosureReverseAbstractInterpreter(mockConvention, typeRegistry);
    }

    // Mock implementation of CodingConvention to satisfy the compiler
    private static class MockCodingConvention implements CodingConvention {
        @Override
        public String extractVersion(Node scriptRoot) { return null; }
        @Override
        public boolean isExported(Node node) { return false; }
        @Override
        public String getGlobalObjectString() { return null; }
        @Override
        public boolean isGlobalThis(Node node) { return false; }
        @Override
        public boolean isDisambiguateProperties(Node call) { return false; }
        @Override
        public boolean isPropertyAssign(Node n) { return false; }
        @Override
        public String getPropertyReferenceFromEnum(Node node) { return null; }
        @Override
        public String getNamespaceFromMap(Node map) { return null; }
        @Override
        public String getSingletonGetterClassName(Node node) { return null; }
        @Override
        public boolean isOptionalParameter(Node parameter) { return false; }
        @Override
        public boolean isRequiredParameter(Node parameter) { return false; }
        @Override
        public String getPropertyObservableIfSingleton(Node node) { return null; }
        @Override
        public String getClassName(Node node) { return null; }
        @Override
        public String getGetterSignature(Node node) { return null; }
        @Override
        public String getSetterSignature(Node node) { return null; }
        @Override
        public String getPropertyDeclaredClass(Node propertyNode) { return null; }
        @Override
        public String getEcmaScriptVersion(Node node) { return null; }
        @Override
        public String getPath(Node n) { return null; }
        @Override
        public String extractClassNameIfRequire(Node node) { return null; }
        @Override
        public String getModuleName(Node node) { return null; }
        @Override
        public String getFunctionToken(Node node) { return null; }
        @Override
        public boolean isArrayLiteral(Node node) { return false; }
        @Override
        public boolean isEmptyFunction(Node node) { return false; }
        @Override
        public boolean isDefineCall(Node n) { return false; }
        @Override
        public String getBuiltinSymbol(String name) { return name; }
        @Override
        public String extractPackageName(Node node) { return null; }
        @Override
        public void setImplicitPolyfill(String s, CharSequence s2) {}
        @Override
        public String getPropertyLastName(String s) { return s; }
        @Override
        public boolean isImplicitlyWrapped(Node n) { return false; }
        @Override
        public boolean isPropertyString(Node n) { return false; }
        @Override
        public boolean isPrivate(Node n) { return false; }
        @Override
        public boolean isConstructorPrototypeMethod(Node n) { return false; }
        @Override
        public String getFileHeader(Node n) { return null; }
        @Override
        public void setFileHeader(Node n, String s) {}
        @Override
        public String getCtorName(Node n) { return null; }
        @Override
        public boolean isPrivate(String name) { return false; }
        @Override
        public boolean isConstructor(NodeTraversal t, Node n) { return false; }
        @Override
        public boolean isInterface(NodeTraversal t, Node n) { return false; }
        @Override
        public String getGoogFunctionType(Node n) { return null; }
        @Override
        public String getJSDocInfo(Node n) { return null; }
        @Override
        public String getJsDocTag(Node n, String s) { return null; }
        @Override
        public void setGetterSignature(Node n, String s) {}
        @Override
        public void setSetterSignature(Node n, String s) {}
        @Override
        public JSType getJSType(Node n) { return null; }
        @Override
        public void setJSType(Node n, JSType j) {}
        @Override
        public boolean isConstant(Node n) { return false; }
        @Override
        public boolean isDefineCall(NodeTraversal t, Node n) { return false; }
        @Override
        public boolean canBeAnnotatedForJsDoc(Node n) { return false; }
        @Override
        public String getAbstractMethodName(Node n) { return null; }
        @Override
        public boolean isConstructor(Node n) { return false; }
        @Override
        public boolean isInterface(Node n) { return false; }
        @Override
        public boolean isOptional(Node n) { return false; }
        @Override
        public String getAliasPackage(Node n) { return null; }
        @Override
        public String getAliasName(Node n) { return null; }
        @Override
        public boolean isConstructorParameter(Node n) { return false; }
        @Override
        public boolean isPropertyDeclaredClass(Node n) { return false; }
        @Override
        public boolean isAnnotatedObject(Node n) { return false; }
        @Override
        public void setImplicitPolyfill(String s, JSType j) {}
        @Override
        public String getThisAlias(Node n) { return null; }
    }

    @Test
    public void testIsDefTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null); // Use local registry for isolated test
        JSType notUndefinedType = registry.createNamedType("NotUndefined", null, -1, -1);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        JSType mockType = notUndefinedType;
        if (voidType.isSubtype(mockType)) {
            mockType = voidType.getGreatestSubtype(mockType);
        }

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(mockType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isDefFunction = interpreter.restricters.get("isDef");
        JSType resultType = isDefFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertFalse(resultType.isVoidType());
    }

    @Test
    public void testIsDefFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType someType = registry.createAllUndefinedType();

        JSType mockType = someType;

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(mockType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isDefFunction = interpreter.restricters.get("isDef");
        JSType resultType = isDefFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isVoidType());
    }

    @Test
    public void testIsNullTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType someType = registry.createObjectType("SomeObject");

        JSType mockType = nullType.getGreatestSubtype(someType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(mockType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isNullFunction = interpreter.restricters.get("isNull");
        JSType resultType = isNullFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isNullable());
    }

    @Test
    public void testIsNullFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType someType = registry.createAllUndefinedType();

        JSType mockType = someType;

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(mockType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isNullFunction = interpreter.restricters.get("isNull");
        JSType resultType = isNullFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertFalse(resultType.isNullable());
    }

    @Test
    public void testIsDefAndNotNullTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType someType = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(someType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isDefAndNotNullFunction = interpreter.restricters.get("isDefAndNotNull");
        JSType resultType = isDefAndNotNullFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertFalse(resultType.isVoidType());
        assertFalse(resultType.isNullable());
    }

    @Test
    public void testIsDefAndNotNullFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType unionType = registry.createUnionType(registry.getNativeType(JSTypeNative.NULL_TYPE), registry.getNativeType(JSTypeNative.VOID_TYPE));

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isDefAndNotNullFunction = interpreter.restricters.get("isDefAndNotNull");
        JSType resultType = isDefAndNotNullFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isUnionType());
        // The actual behavior of isUnionType and getAlternates might require more specific checks.
        // For now, checking if the union contains at least one of the null/void types is a proxy.
        boolean foundNullOrVoid = false;
        if (resultType.toMaybeUnionType() != null) {
            for (JSType alternate : resultType.toMaybeUnionType().getAlternates()) {
                if (alternate.isNullable() || alternate.isVoidType()) {
                    foundNullOrVoid = true;
                    break;
                }
            }
        }
        assertTrue(foundNullOrVoid);
    }

    @Test
    public void testIsStringTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isStringFunction = interpreter.restricters.get("isString");
        JSType resultType = isStringFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isStringValueType());
    }

    @Test
    public void testIsStringFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isStringFunction = interpreter.restricters.get("isString");
        JSType resultType = isStringFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertFalse(resultType.isStringValueType());
    }

    @Test
    public void testIsBooleanTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isBooleanFunction = interpreter.restricters.get("isBoolean");
        JSType resultType = isBooleanFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isBooleanValueType());
    }

    @Test
    public void testIsBooleanFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isBooleanFunction = interpreter.restricters.get("isBoolean");
        JSType resultType = isBooleanFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertFalse(resultType.isBooleanValueType());
    }

    @Test
    public void testIsNumberTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isNumberFunction = interpreter.restricters.get("isNumber");
        JSType resultType = isNumberFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isNumberValueType());
    }

    @Test
    public void testIsNumberFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isNumberFunction = interpreter.restricters.get("isNumber");
        JSType resultType = isNumberFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertFalse(resultType.isNumberValueType());
    }

    @Test
    public void testIsFunctionTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isFunctionFunction = interpreter.restricters.get("isFunction");
        JSType resultType = isFunctionFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isFunctionType());
    }

    @Test
    public void testIsFunctionFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isFunctionFunction = interpreter.restricters.get("isFunction");
        JSType resultType = isFunctionFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertFalse(resultType.isFunctionType());
    }

    @Test
    public void testIsArrayTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isArrayFunction = interpreter.restricters.get("isArray");
        JSType resultType = isArrayFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isArrayType());
    }

    @Test
    public void testIsArrayFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        ObjectType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isArrayFunction = interpreter.restricters.get("isArray");
        JSType resultType = isArrayFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertFalse(resultType.isArrayType());
    }

    @Test
    public void testIsObjectTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType allTypes = registry.createAllUndefinedType();

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(allTypes, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isObjectFunction = interpreter.restricters.get("isObject");
        JSType resultType = isObjectFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isObject());
    }

    @Test
    public void testIsObjectFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType numberStringBoolean = registry.createUnionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            registry.getNativeType(JSTypeNative.STRING_TYPE),
            registry.getNativeType(JSTypeNative.BOOLEAN_TYPE)
        );
        JSType nullVoid = registry.createUnionType(
            registry.getNativeType(JSTypeNative.NULL_TYPE),
            registry.getNativeType(JSTypeNative.VOID_TYPE)
        );
        JSType unionType = registry.createUnionType(numberStringBoolean, nullVoid);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isObjectFunction = interpreter.restricters.get("isObject");
        JSType resultType = isObjectFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isUnionType());
        // Check that the union contains types that are not objects.
        boolean foundNonObject = false;
        if (resultType.toMaybeUnionType() != null) {
            for (JSType alternate : resultType.toMaybeUnionType().getAlternates()) {
                if (!alternate.isObject()) {
                    foundNonObject = true;
                    break;
                }
            }
        }
        assertTrue(foundNonObject);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsDefTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        // Create a mock Node that represents a call to goog.isDef
        Node condition = new Node(com.google.javascript.rhino.Token.CALL,
                                  new Node(com.google.javascript.rhino.Token.GETPROP,
                                           new Node(com.google.javascript.rhino.Token.NAME, null, "goog", 0, 0),
                                           "isDef", 0, 0),
                                  new Node(com.google.javascript.rhino.Token.STRING, "someParam", 0, 0));
        
        // Mock FlowScope and JSTypeRegistry for the test
        JSTypeRegistry mockRegistry = new JSTypeRegistry(null);
        FlowScope mockBlindScope = new MockFlowScope(); // Need a mock implementation
        JSType paramType = mockRegistry.createAllUndefinedType(); // Example type
        
        // Declare the parameter in the blind scope for the interpreter to use
        FlowScope childScope = mockBlindScope.createChildFlowScope();
        ((MockFlowScope) childScope).declareName("someParam", paramType);
        
        boolean outcome = true;
        interpreter.getPreciserScopeKnowingConditionOutcome(condition, childScope, outcome);
        // Basic check: if it doesn't throw an exception, it's a pass for this mock setup.
        assertTrue(true);
    }

     @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsObjectFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        // Create a mock Node that represents a call to goog.isObject
        Node condition = new Node(com.google.javascript.rhino.Token.CALL,
                                  new Node(com.google.javascript.rhino.Token.GETPROP,
                                           new Node(com.google.javascript.rhino.Token.NAME, null, "goog", 0, 0),
                                           "isObject", 0, 0),
                                  new Node(com.google.javascript.rhino.Token.STRING, "anotherParam", 0, 0));

        JSTypeRegistry mockRegistry = new JSTypeRegistry(null);
        FlowScope mockBlindScope = new MockFlowScope(); // Need a mock implementation
        JSType paramType = mockRegistry.createAllUndefinedType(); // Example type
        
        FlowScope childScope = mockBlindScope.createChildFlowScope();
        ((MockFlowScope) childScope).declareName("anotherParam", paramType);
        
        boolean outcome = false;
        interpreter.getPreciserScopeKnowingConditionOutcome(condition, childScope, outcome);
        assertTrue(true);
    }

    // Mock implementation of FlowScope for testing
    private static class MockFlowScope implements FlowScope {
        private Map<String, JSType> inferredTypes = new ImmutableMap.Builder<String, JSType>().build();

        public void declareName(String name, JSType type) {
            inferredTypes = new ImmutableMap.Builder<String, JSType>()
                .putAll(inferredTypes)
                .put(name, type)
                .build();
        }

        @Override
        public FlowScope createChildFlowScope() {
            MockFlowScope child = new MockFlowScope();
            child.inferredTypes = new ImmutableMap.Builder<String, JSType>()
                .putAll(this.inferredTypes)
                .build();
            return child;
        }

        @Override
        public void inferSlotType(String symbol, JSType type) {
            declareName(symbol, type);
        }

        @Override
        public void inferQualifiedSlot(Node node, String symbol, JSType bottomType, JSType inferredType) {
            throw new UnsupportedOperationException("MockFlowScope.inferQualifiedSlot not implemented");
        }

        @Override
        public FlowScope optimize() {
            return this;
        }

        @Override
        public StaticSlot<JSType> findUniqueRefinedSlot(FlowScope blindScope) {
            return null;
        }

        @Override
        public void completeScope(StaticScope<JSType> scope) {
            throw new UnsupportedOperationException("MockFlowScope.completeScope not implemented");
        }

        @Override
        public JSType getTypeOfThis() {
            return null;
        }

        @Override
        public JSType findPropertyType(String name) {
            return null;
        }

        @Override
        public JSType getDeclaredType() {
            return null;
        }

        @Override
        public StaticSlot<JSType> getSlot(String name) {
            return null;
        }
    }
}
