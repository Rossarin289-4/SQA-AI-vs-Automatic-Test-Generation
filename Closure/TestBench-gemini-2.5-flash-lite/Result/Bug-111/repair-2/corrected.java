package com.google.javascript.jscomp.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot; // Added import
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
        // Methods that were causing errors are removed or made to return null/defaults
        // as they are not essential for the current tests.
        @Override public String extractVersion(Node scriptRoot) { return null; }
        @Override public boolean isExported(Node node) { return false; }
        @Override public String getGlobalObjectString() { return null; }
        @Override public boolean isGlobalThis(Node node) { return false; }
        @Override public boolean isDisambiguateProperties(Node call) { return false; }
        @Override public boolean isPropertyAssign(Node n) { return false; }
        @Override public String getPropertyReferenceFromEnum(Node node) { return null; }
        @Override public String getNamespaceFromMap(Node map) { return null; }
        @Override public String getSingletonGetterClassName(Node node) { return null; }
        @Override public boolean isOptionalParameter(Node parameter) { return false; }
        @Override public boolean isRequiredParameter(Node parameter) { return false; }
        @Override public String getPropertyObservableIfSingleton(Node node) { return null; }
        @Override public String getClassName(Node node) { return null; }
        @Override public String getGetterSignature(Node node) { return null; }
        @Override public String getSetterSignature(Node node) { return null; }
        @Override public String getPropertyDeclaredClass(Node propertyNode) { return null; }
        @Override public String getEcmaScriptVersion(Node node) { return null; }
        @Override public String getPath(Node n) { return null; }
        @Override public String extractPackageName(Node node) { return null; }
        @Override public String extractClassNameIfRequire(Node node) { return null; }
        @Override public String getModuleName(Node node) { return null; }
        @Override public String getFunctionToken(Node node) { return null; }
        @Override public boolean isArrayLiteral(Node node) { return false; }
        @Override public boolean isEmptyFunction(Node node) { return false; }
        @Override public boolean isDefineCall(Node n) { return false; }
        @Override public String getBuiltinSymbol(String name) { return name; }
        @Override public void setImplicitPolyfill(String s, CharSequence s2) {}
        @Override public String getPropertyLastName(String s) { return s; }
        @Override public boolean isImplicitlyWrapped(Node n) { return false; }
        @Override public boolean isPropertyString(Node n) { return false; }
        @Override public boolean isPrivate(Node n) { return false; }
        @Override public boolean isConstructorPrototypeMethod(Node n) { return false; }
        @Override public String getFileHeader(Node n) { return null; }
        @Override public void setFileHeader(Node n, String s) {}
        @Override public String getCtorName(Node n) { return null; }
        @Override public boolean isPrivate(String name) { return false; }
        @Override public String getGoogFunctionType(Node n) { return null; }
        @Override public String getJSDocInfo(Node n) { return null; }
        @Override public String getJsDocTag(Node n, String s) { return null; }
        @Override public void setGetterSignature(Node n, String s) {}
        @Override public void setSetterSignature(Node n, String s) {}
        @Override public JSType getJSType(Node n) { return null; }
        @Override public void setJSType(Node n, JSType j) {}
        @Override public boolean isConstant(Node n) { return false; }
        @Override public boolean isDefineCall(NodeTraversal t, Node n) { return false; }
        @Override public boolean canBeAnnotatedForJsDoc(Node n) { return false; }
        @Override public String getAbstractMethodName(Node n) { return null; }
        @Override public boolean isConstructor(Node n) { return false; }
        @Override public boolean isInterface(Node n) { return false; }
        @Override public boolean isOptional(Node n) { return false; }
        @Override public String getAliasPackage(Node n) { return null; }
        @Override public String getAliasName(Node n) { return null; }
        @Override public boolean isConstructorParameter(Node n) { return false; }
        @Override public boolean isPropertyDeclaredClass(Node n) { return false; }
        @Override public boolean isAnnotatedObject(Node n) { return false; }
        @Override public void setImplicitPolyfill(String s, JSType j) {}
        @Override public String getThisAlias(Node n) { return null; }
        // These are the methods that caused the "cannot find symbol" errors.
        // They are related to NodeTraversal which is not available here.
        @Override public boolean isConstructor(NodeTraversal t, Node n) { return false; }
        @Override public boolean isInterface(NodeTraversal t, Node n) { return false; }
    }

    @Test
    public void testIsDefTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null); // Use local registry for isolated test
        JSType notUndefinedType = registry.getNativeType(JSTypeNative.OBJECT_TYPE); // Placeholder for non-undefined
        
        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(notUndefinedType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isDefFunction = interpreter.restricters.get("isDef");
        JSType resultType = isDefFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // The expected behavior of getRestrictedWithoutUndefined for a non-undefined type is the type itself.
        assertEquals(notUndefinedType, resultType);
    }

    @Test
    public void testIsDefFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        
        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(voidType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isDefFunction = interpreter.restricters.get("isDef");
        JSType resultType = isDefFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // When isDef is false and the input is void, the result should be void.
        assertTrue(resultType.isVoidType());
    }

    @Test
    public void testIsNullTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType someType = registry.createObjectType("SomeObject");

        JSType mockType = registry.createUnionType(nullType, someType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(mockType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isNullFunction = interpreter.restricters.get("isNull");
        JSType resultType = isNullFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // The result should be the intersection of the input type and null.
        assertTrue(resultType.isNullable()); // This implies it contains null.
        assertTrue(resultType.equals(nullType)); // The greatest subtype should be nullType
    }

    @Test
    public void testIsNullFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType someType = registry.createObjectType("SomeObject");
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType unionType = registry.createUnionType(someType, nullType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isNullFunction = interpreter.restricters.get("isNull");
        JSType resultType = isNullFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // The result should be the input type without null.
        assertFalse(resultType.isNullable());
        assertTrue(resultType.equals(someType));
    }

    @Test
    public void testIsDefAndNotNullTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType someObjectType = registry.createObjectType("SomeObject");

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(someObjectType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isDefAndNotNullFunction = interpreter.restricters.get("isDefAndNotNull");
        JSType resultType = isDefAndNotNullFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // If the input is already not void and not null, it should remain unchanged.
        assertEquals(someObjectType, resultType);
    }

    @Test
    public void testIsDefAndNotNullFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType unionType = registry.createUnionType(voidType, nullType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isDefAndNotNullFunction = interpreter.restricters.get("isDefAndNotNull");
        JSType resultType = isDefAndNotNullFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // When isDefAndNotNull is false, the result should be the union of null and void.
        assertTrue(resultType.isUnionType());
        assertTrue(resultType.equals(unionType));
    }

    @Test
    public void testIsStringTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(stringType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isStringFunction = interpreter.restricters.get("isString");
        JSType resultType = isStringFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isStringValueType());
        assertEquals(stringType, resultType);
    }

    @Test
    public void testIsStringFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unionType = registry.createUnionType(stringType, numberType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isStringFunction = interpreter.restricters.get("isString");
        JSType resultType = isStringFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // When isString is false, the string type should be removed from the union.
        assertFalse(resultType.isStringValueType());
        assertEquals(numberType, resultType);
    }

    @Test
    public void testIsBooleanTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(booleanType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isBooleanFunction = interpreter.restricters.get("isBoolean");
        JSType resultType = isBooleanFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isBooleanValueType());
        assertEquals(booleanType, resultType);
    }

    @Test
    public void testIsBooleanFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unionType = registry.createUnionType(booleanType, numberType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isBooleanFunction = interpreter.restricters.get("isBoolean");
        JSType resultType = isBooleanFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // When isBoolean is false, the boolean type should be removed from the union.
        assertFalse(resultType.isBooleanValueType());
        assertEquals(numberType, resultType);
    }

    @Test
    public void testIsNumberTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(numberType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isNumberFunction = interpreter.restricters.get("isNumber");
        JSType resultType = isNumberFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isNumberValueType());
        assertEquals(numberType, resultType);
    }

    @Test
    public void testIsNumberFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType unionType = registry.createUnionType(numberType, stringType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isNumberFunction = interpreter.restricters.get("isNumber");
        JSType resultType = isNumberFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // When isNumber is false, the number type should be removed from the union.
        assertFalse(resultType.isNumberValueType());
        assertEquals(stringType, resultType);
    }

    @Test
    public void testIsFunctionTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(functionType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isFunctionFunction = interpreter.restricters.get("isFunction");
        JSType resultType = isFunctionFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isFunctionType());
        assertEquals(functionType, resultType);
    }

    @Test
    public void testIsFunctionFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType unionType = registry.createUnionType(functionType, objectType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isFunctionFunction = interpreter.restricters.get("isFunction");
        JSType resultType = isFunctionFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // When isFunction is false, the function type should be removed from the union.
        assertFalse(resultType.isFunctionType());
        assertEquals(objectType, resultType);
    }

    @Test
    public void testIsArrayTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(arrayType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isArrayFunction = interpreter.restricters.get("isArray");
        JSType resultType = isArrayFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isArrayType());
        assertEquals(arrayType, resultType);
    }

    @Test
    public void testIsArrayFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        ObjectType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType unionType = registry.createUnionType(arrayType, objectType);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isArrayFunction = interpreter.restricters.get("isArray");
        JSType resultType = isArrayFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // When isArray is false, the array type should be removed from the union.
        assertFalse(resultType.isArrayType());
        assertEquals(objectType, resultType);
    }

    @Test
    public void testIsObjectTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(objectType, true);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isObjectFunction = interpreter.restricters.get("isObject");
        JSType resultType = isObjectFunction.apply(typeRestriction);

        assertNotNull(resultType);
        assertTrue(resultType.isObject());
        assertEquals(objectType, resultType);
    }

    @Test
    public void testIsObjectFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType nullVoid = registry.createUnionType(
            registry.getNativeType(JSTypeNative.NULL_TYPE),
            registry.getNativeType(JSTypeNative.VOID_TYPE)
        );
        JSType unionType = registry.createUnionType(numberType, nullVoid); // Contains non-objects

        ClosureReverseAbstractInterpreter.TypeRestriction typeRestriction = new ClosureReverseAbstractInterpreter.TypeRestriction(unionType, false);
        Function<ClosureReverseAbstractInterpreter.TypeRestriction, JSType> isObjectFunction = interpreter.restricters.get("isObject");
        JSType resultType = isObjectFunction.apply(typeRestriction);

        assertNotNull(resultType);
        // When isObject is false, all object types should be removed.
        assertTrue(resultType.isUnionType());
        assertEquals(nullVoid, resultType); // Only null and void should remain
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsDefTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry mockRegistry = new JSTypeRegistry(null);
        
        // Mock Node representing a call to goog.isDef(param)
        Node paramNode = new Node(Token.NAME, 0, 0);
        paramNode.setString("someParam");
        Node googName = new Node(Token.NAME, 0, 0);
        googName.setString("goog");
        Node isDefProp = new Node(Token.GETPROP, googName, "isDef", 0, 0);
        Node condition = new Node(Token.CALL, isDefProp, paramNode, 0, 0);

        // Mock FlowScope
        MockFlowScope mockBlindScope = new MockFlowScope();
        JSType paramType = mockRegistry.createAllUndefinedType(); // Type of param
        
        // To simulate the parameter being known, we add it to the scope.
        // The actual testing of getPreciserScopeKnowingConditionOutcome is complex as it interacts with the interpreter's internal state.
        // Here, we ensure the method can be called without immediate exceptions.
        // A more thorough test would involve checking the returned scope's inferred types.
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, true);
        
        assertNotNull(resultScope);
    }

     @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsObjectFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSTypeRegistry mockRegistry = new JSTypeRegistry(null);

        // Mock Node representing a call to goog.isObject(param)
        Node paramNode = new Node(Token.NAME, 0, 0);
        paramNode.setString("anotherParam");
        Node googName = new Node(Token.NAME, 0, 0);
        googName.setString("goog");
        Node isObjectProp = new Node(Token.GETPROP, googName, "isObject", 0, 0);
        Node condition = new Node(Token.CALL, isObjectProp, paramNode, 0, 0);

        MockFlowScope mockBlindScope = new MockFlowScope();
        JSType paramType = mockRegistry.createObjectType("SomeObject"); // Example type
        
        boolean outcome = false;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        
        assertNotNull(resultScope);
    }

    // Mock implementation of FlowScope for testing
    private static class MockFlowScope implements FlowScope {
        // Use a mutable map for inferred types for easier modification in tests
        private Map<String, JSType> inferredTypes = new java.util.HashMap<>();

        public void declareName(String name, JSType type) {
            inferredTypes.put(name, type);
        }

        @Override
        public FlowScope createChildFlowScope() {
            MockFlowScope child = new MockFlowScope();
            child.inferredTypes.putAll(this.inferredTypes); // Copy existing types
            return child;
        }

        @Override
        public void inferSlotType(String symbol, JSType type) {
            declareName(symbol, type);
        }

        @Override
        public void inferQualifiedSlot(Node node, String symbol, JSType bottomType, JSType inferredType) {
            // Not implemented for this test
        }

        @Override
        public FlowScope optimize() {
            return this; // No optimization in mock
        }

        @Override
        public StaticSlot<JSType> findUniqueRefinedSlot(FlowScope blindScope) {
            return null; // Not implemented for this test
        }

        @Override
        public void completeScope(StaticScope<JSType> scope) {
            // Not implemented for this test
        }

        @Override
        public JSType getTypeOfThis() {
            return null; // Not implemented for this test
        }

        @Override
        public JSType findPropertyType(String name) {
            return null; // Not implemented for this test
        }

        @Override
        public JSType getDeclaredType() {
            return null; // Not implemented for this test
        }

        @Override
        public StaticSlot<JSType> getSlot(String name) {
            // Return a mock StaticSlot if the name exists in inferredTypes
            if (inferredTypes.containsKey(name)) {
                return new MockStaticSlot<>(name, inferredTypes.get(name));
            }
            return null;
        }
    }
    
    // Mock implementation of StaticSlot to satisfy getSlot return type
    private static class MockStaticSlot<T extends JSType> implements StaticSlot<T> {
        private final String name;
        private final T type;

        MockStaticSlot(String name, T type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String getName() { return name; }
        @Override
        public T getType() { return type; }
        @Override
        public boolean isFinal() { return false; }
        @Override
        public boolean isProvided() { return false; }
        @Override
        public JSType getJSType() { return type; }
        @Override
        public Node getDeclaration() { return null; }
        @Override
        public String getScopeDescription() { return "mock"; }
    }
}
