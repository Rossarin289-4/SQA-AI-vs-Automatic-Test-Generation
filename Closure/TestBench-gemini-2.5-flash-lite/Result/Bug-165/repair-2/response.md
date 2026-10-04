```java
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptRuntime;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticSlot;
import java.util.SortedMap;
import java.util.Collections;

public class JSTypeRegistryTest {

    private final ErrorReporter errorReporter = new com.google.javascript.rhino.SimpleErrorReporter();
    private final JSTypeRegistry registry = new JSTypeRegistry(errorReporter);

    @Test
    public void testConstructor() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(errorReporter);
        assertNotNull(registry);
        assertNotNull(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    }

    @Test
    public void testConstructorWithTolerateUndefined() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(errorReporter, true);
        assertNotNull(registry);
        assertTrue(registry.shouldTolerateUndefinedValues());
    }

    @Test
    public void testSetResolveMode() throws Exception {
        registry.setResolveMode(JSTypeRegistry.ResolveMode.IMMEDIATE);
        assertEquals(JSTypeRegistry.ResolveMode.IMMEDIATE, registry.getResolveMode());
        registry.setResolveMode(JSTypeRegistry.ResolveMode.LAZY_NAMES);
        assertEquals(JSTypeRegistry.ResolveMode.LAZY_NAMES, registry.getResolveMode());
    }

    @Test
    public void testGetErrorReporter() throws Exception {
        assertEquals(errorReporter, registry.getErrorReporter());
    }

    @Test
    public void testShouldTolerateUndefinedValues() throws Exception {
        JSTypeRegistry registryWithToleration = new JSTypeRegistry(errorReporter, true);
        assertTrue(registryWithToleration.shouldTolerateUndefinedValues());

        JSTypeRegistry registryWithoutToleration = new JSTypeRegistry(errorReporter, false);
        assertFalse(registryWithoutToleration.shouldTolerateUndefinedValues());
    }

    @Test
    public void testResetForTypeCheck() throws Exception {
        registry.declareType("Foo", registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        registry.resetForTypeCheck();
        assertNull(registry.getType("Foo"));
        assertNotNull(registry.getNativeType(JSTypeNative.OBJECT_TYPE)); // Built-ins should be reset
    }

    @Test
    public void testRegisterPropertyOnType() throws Exception {
        ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        registry.registerPropertyOnType("myProp", objectType);
        assertTrue(registry.canPropertyBeDefined(objectType, "myProp"));
        Iterable<JSType> typesWithProp = registry.getTypesWithProperty("myProp");
        assertTrue(Lists.newArrayList(typesWithProp).contains(objectType));
    }

    @Test
    public void testUnregisterPropertyOnType() throws Exception {
        ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        registry.registerPropertyOnType("myProp", objectType);
        assertTrue(registry.canPropertyBeDefined(objectType, "myProp"));
        registry.unregisterPropertyOnType("myProp", objectType);
        assertFalse(registry.canPropertyBeDefined(objectType, "myProp"));
    }

    @Test
    public void testGetGreatestSubtypeWithProperty() throws Exception {
        ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        registry.registerPropertyOnType("myProp", objectType);
        JSType result = registry.getGreatestSubtypeWithProperty(objectType, "myProp");
        assertEquals(objectType, result);

        JSType nonExistentType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        assertEquals(noType, registry.getGreatestSubtypeWithProperty(nonExistentType, "nonExistentProp"));
    }

    @Test
    public void testCanPropertyBeDefined() throws Exception {
        ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertFalse(registry.canPropertyBeDefined(objectType, "myProp"));
        registry.registerPropertyOnType("myProp", objectType);
        assertTrue(registry.canPropertyBeDefined(objectType, "myProp"));
    }

    @Test
    public void testGetTypesWithProperty() throws Exception {
        ObjectType objectType1 = registry.createAnonymousObjectType();
        ObjectType objectType2 = registry.createAnonymousObjectType();
        registry.registerPropertyOnType("prop1", objectType1);
        registry.registerPropertyOnType("prop1", objectType2);

        Iterable<JSType> types = registry.getTypesWithProperty("prop1");
        Set<JSType> typeSet = Sets.newHashSet(types);
        assertTrue(typeSet.contains(objectType1));
        assertTrue(typeSet.contains(objectType2));
        assertEquals(2, typeSet.size());

        Iterable<JSType> emptyTypes = registry.getTypesWithProperty("nonExistentProp");
        assertFalse(emptyTypes.iterator().hasNext());
    }

    @Test
    public void testGetEachReferenceTypeWithProperty() throws Exception {
        ObjectType objectType1 = registry.createAnonymousObjectType();
        ObjectType objectType2 = registry.createAnonymousObjectType();
        registry.registerPropertyOnType("prop1", objectType1);
        registry.registerPropertyOnType("prop1", objectType2);

        Iterable<ObjectType> types = registry.getEachReferenceTypeWithProperty("prop1");
        Set<ObjectType> typeSet = Sets.newHashSet(types);
        assertTrue(typeSet.contains(objectType1));
        assertTrue(typeSet.contains(objectType2));
        assertEquals(2, typeSet.size());

        Iterable<ObjectType> emptyTypes = registry.getEachReferenceTypeWithProperty("nonExistentProp");
        assertFalse(emptyTypes.iterator().hasNext());
    }

    @Test
    public void testIncrementGenerationAndSetLastGeneration() throws Exception {
        assertFalse(registry.isLastGeneration());
        registry.setLastGeneration(true);
        assertTrue(registry.isLastGeneration());
        registry.setLastGeneration(false);
        assertFalse(registry.isLastGeneration());
        registry.incrementGeneration(); // Call the method to ensure it's covered.
    }

    @Test
    public void testDeclareTypeAndGetType() throws Exception {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        registry.declareType("MyNumber", numberType);
        assertEquals(numberType, registry.getType("MyNumber"));
        assertNull(registry.getType("NonExistent"));
    }

    @Test
    public void testOverwriteDeclaredType() throws Exception {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        registry.declareType("MyType", registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), registry.getType("MyType"));

        registry.overwriteDeclaredType("MyType", numberType);
        assertEquals(numberType, registry.getType("MyType"));
    }

    @Test
    public void testForwardDeclareTypeAndIsForwardDeclaredType() throws Exception {
        registry.forwardDeclareType("ForwardedType");
        assertTrue(registry.isForwardDeclaredType("ForwardedType"));
        assertFalse(registry.isForwardDeclaredType("RegularType"));
    }

    @Test
    public void testHasNamespace() throws Exception {
        // Add a namespace directly to test hasNamespace.
        // In a real scenario, this might be tested indirectly via other methods.
        // Accessing private field 'namespaces' directly for testing purposes.
        try {
            java.lang.reflect.Field field = JSTypeRegistry.class.getDeclaredField("namespaces");
            field.setAccessible(true);
            @SuppressWarnings("unchecked")
            Set<String> namespaces = (Set<String>) field.get(registry);
            namespaces.add("com.example.namespace");
            assertTrue(registry.hasNamespace("com.example.namespace"));
            assertFalse(registry.hasNamespace("com.nonexistent"));
        } catch (Exception e) {
            // Handle potential reflection exceptions if field access fails.
            // For this exercise, we'll assume it works or skip the test if it fails.
            System.err.println("Reflection failed for namespaces: " + e.getMessage());
            fail("Reflection failed for namespaces.");
        }
    }

    @Test
    public void testGetNativeTypes() throws Exception {
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        assertEquals(registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE), registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE));
    }

    @Test
    public void testClearNamedTypes() throws Exception {
        registry.declareType("TestType", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        assertNotNull(registry.getType("TestType"));
        registry.clearNamedTypes();
        assertNull(registry.getType("TestType"));
    }

    @Test
    public void testCreateOptionalType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType optionalStringType = registry.createOptionalType(stringType);
        assertTrue(optionalStringType.isUnionType());
        // UnionType.getAlternates() returns a Collection, not an Iterable.
        assertTrue(optionalStringType.toMaybeUnionType().getAlternates().contains(stringType));
        assertTrue(optionalStringType.toMaybeUnionType().getAlternates().contains(registry.getNativeType(JSTypeNative.VOID_TYPE)));

        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertEquals(unknownType, registry.createOptionalType(unknownType));
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        assertEquals(allType, registry.createOptionalType(allType));
    }

    @Test
    public void testCreateNullableType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType nullableStringType = registry.createNullableType(stringType);
        assertTrue(nullableStringType.isUnionType());
        assertTrue(nullableStringType.toMaybeUnionType().getAlternates().contains(stringType));
        assertTrue(nullableStringType.toMaybeUnionType().getAlternates().contains(registry.getNativeType(JSTypeNative.NULL_TYPE)));
    }

    @Test
    public void testCreateOptionalNullableType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType optNullStringType = registry.createOptionalNullableType(stringType);
        assertTrue(optNullStringType.isUnionType());
        assertTrue(optNullStringType.toMaybeUnionType().getAlternates().contains(stringType));
        assertTrue(optNullStringType.toMaybeUnionType().getAlternates().contains(registry.getNativeType(JSTypeNative.VOID_TYPE)));
        assertTrue(optNullStringType.toMaybeUnionType().getAlternates().contains(registry.getNativeType(JSTypeNative.NULL_TYPE)));
    }

    @Test
    public void testCreateUnionTypeWithJSTypes() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unionType = registry.createUnionType(stringType, numberType);
        assertTrue(unionType.isUnionType());
        assertTrue(unionType.toMaybeUnionType().getAlternates().contains(stringType));
        assertTrue(unionType.toMaybeUnionType().getAlternates().contains(numberType));
    }

    @Test
    public void testCreateUnionTypeWithJSTypeNatives() throws Exception {
        JSType unionType = registry.createUnionType(
            JSTypeNative.STRING_TYPE, JSTypeNative.NUMBER_TYPE);
        assertTrue(unionType.isUnionType());
        assertTrue(unionType.toMaybeUnionType().getAlternates().contains(
            registry.getNativeType(JSTypeNative.STRING_TYPE)));
        assertTrue(unionType.toMaybeUnionType().getAlternates().contains(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testCreateEnumType() throws Exception {
        Node sourceNode = new Node(Token.STRING, 0, 0); // Minimal node
        JSType elementType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        EnumType enumType = registry.createEnumType("MyEnum", sourceNode, elementType);
        assertEquals("MyEnum", enumType.getReferenceName());
        assertEquals(elementType, enumType.getElementsType());
    }

    @Test
    public void testCreateFunctionType() throws Exception {
        JSType returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType param1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType param2 = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

        FunctionType functionType = registry.createFunctionType(returnType, param1, param2);
        assertEquals(returnType, functionType.getReturnType());
        assertEquals(2, functionType.getMaxArguments());
        assertEquals(2, functionType.getMinArguments());
        assertEquals(param1, functionType.getSlot("0").getType());
        assertEquals(param2, functionType.getSlot("1").getType());
    }

    @Test
    public void testCreateFunctionTypeWithVarArgs() throws Exception {
        JSType returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType param1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        List<JSType> params = Lists.newArrayList(param1);
        FunctionType functionType = registry.createFunctionTypeWithVarArgs(returnType, params);
        assertEquals(returnType, functionType.getReturnType());
        assertEquals(1, functionType.getMinArguments());
        assertEquals(Integer.MAX_VALUE, functionType.getMaxArguments());
        assertEquals(param1, functionType.getSlot("0").getType());
    }

    @Test
    public void testCreateConstructorType() throws Exception {
        JSType returnType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType param1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FunctionType constructorType = registry.createConstructorType(returnType, param1);
        assertTrue(constructorType.isConstructor());
        assertEquals(returnType, constructorType.getReturnType());
        assertEquals(1, constructorType.getMinArguments());
        assertEquals(1, constructorType.getMaxArguments());
    }

    @Test
    public void testCreateConstructorTypeWithVarArgs() throws Exception {
        JSType returnType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType param1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType[] params = {param1}; // Use array for varargs
        FunctionType constructorType = registry.createConstructorTypeWithVarArgs(returnType, params);
        assertTrue(constructorType.isConstructor());
        assertEquals(returnType, constructorType.getReturnType());
        assertEquals(1, constructorType.getMinArguments());
        assertEquals(Integer.MAX_VALUE, constructorType.getMaxArguments());
    }

    @Test
    public void testCreateParameters() throws Exception {
        JSType param1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node paramList = registry.createParameters(param1);
        assertEquals(Token.PARAM_LIST, paramList.getType());
        assertNotNull(paramList.getFirstChild());
        assertEquals(param1, paramList.getFirstChild().getJSType());
    }

    @Test
    public void testCreateParametersWithVarArgs() throws Exception {
        JSType param1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType[] params = {param1}; // Use array for varargs
        Node paramList = registry.createParametersWithVarArgs(params);
        assertEquals(Token.PARAM_LIST, paramList.getType());
        assertNotNull(paramList.getFirstChild());
        assertEquals(Token.ELLIPSIS, paramList.getFirstChild().getType());
        assertNotNull(paramList.getFirstChild().getFirstChild());
        assertEquals(param1, paramList.getFirstChild().getFirstChild().getJSType());
    }

    @Test
    public void testCreateOptionalParameters() throws Exception {
        JSType param1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node paramList = registry.createOptionalParameters(param1);
        assertEquals(Token.PARAM_LIST, paramList.getType());
        assertNotNull(paramList.getFirstChild());
        assertEquals(Token.EQUALS, paramList.getFirstChild().getType()); // Optional param represented by EQUALS
        assertEquals(param1, paramList.getFirstChild().getJSType());
    }

    @Test
    public void testCreateFunctionTypeWithNewReturnType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FunctionType originalFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType newFn = registry.createFunctionTypeWithNewReturnType(originalFn, stringType);
        assertEquals(stringType, newFn.getReturnType());
        assertEquals(originalFn.getMinArguments(), newFn.getMinArguments());
        assertEquals(originalFn.getMaxArguments(), newFn.getMaxArguments());
    }

    @Test
    public void testCreateFunctionTypeWithNewThisType() throws Exception {
        ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType originalFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType newFn = registry.createFunctionTypeWithNewThisType(originalFn, objectType);
        assertEquals(objectType, newFn.getTypeOfThis());
        assertEquals(originalFn.getReturnType(), newFn.getReturnType());
        assertEquals(originalFn.getMinArguments(), newFn.getMinArguments());
        assertEquals(originalFn.getMaxArguments(), newFn.getMaxArguments());
    }

    @Test
    public void testCreateObjectType() throws Exception {
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
        ObjectType objType = registry.createObjectType(implicitProto);
        assertEquals(implicitProto, objType.getImplicitPrototype());
    }

    @Test
    public void testCreateRecordType() throws Exception {
        Map<String, RecordProperty> properties = new HashMap<>();
        properties.put("field1", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), new Node(Token.STRING)));
        properties.put("field2", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), new Node(Token.NUMBER)));

        RecordType recordType = registry.createRecordType(properties);
        assertTrue(recordType.isRecordType());
        assertEquals(2, recordType.getPropertiesCount());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), recordType.getPropertyType("field1"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), recordType.getPropertyType("field2"));
    }

    @Test
    public void testCreateAnonymousObjectType() throws Exception {
        ObjectType anonymousType = registry.createAnonymousObjectType();
        assertTrue(anonymousType.isObject());
        assertFalse(anonymousType.hasReferenceName());
    }

    @Test
    public void testResetImplicitPrototype() throws Exception {
        ObjectType objType = registry.createAnonymousObjectType();
        ObjectType newProto = registry.createAnonymousObjectType();
        assertTrue(registry.resetImplicitPrototype(objType, newProto));
        assertEquals(newProto, objType.getImplicitPrototype());
    }

    @Test
    public void testCreateInterfaceType() throws Exception {
        Node sourceNode = new Node(Token.FUNCTION, 0, 0); // Minimal node
        FunctionType interfaceType = registry.createInterfaceType("MyInterface", sourceNode);
        assertTrue(interfaceType.isInterface());
        assertEquals("MyInterface", interfaceType.getReferenceName());
    }

    @Test
    public void testCreateParameterizedType() throws Exception {
        ObjectType baseObjectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        JSType paramType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ParameterizedType parameterizedType = registry.createParameterizedType(baseObjectType, paramType);
        assertEquals(baseObjectType, parameterizedType.getObjectType());
        assertEquals(paramType, parameterizedType.getParameterType());
    }

    @Test
    public void testCreateNamedType() throws Exception {
        JSType namedType = registry.createNamedType("MyNamedType", "test.js", 10, 5);
        assertTrue(namedType.isNominalType());
        assertEquals("MyNamedType", namedType.getReferenceName());
    }

    @Test
    public void testIdentifyNonNullableName() throws Exception {
        registry.identifyNonNullableName("MyNonNullable");
        // Accessing private field 'nonNullableTypeNames' directly for testing purposes.
        try {
            java.lang.reflect.Field field = JSTypeRegistry.class.getDeclaredField("nonNullableTypeNames");
            field.setAccessible(true);
            @SuppressWarnings("unchecked")
            Set<String> nonNullableTypeNames = (Set<String>) field.get(registry);
            assertTrue(nonNullableTypeNames.contains("MyNonNullable"));
        } catch (Exception e) {
            System.err.println("Reflection failed for nonNullableTypeNames: " + e.getMessage());
            fail("Reflection failed for nonNullableTypeNames.");
        }
    }

    @Test
    public void testCreateFromTypeNodes_Basic() throws Exception {
        Node stringNode = Node.newString(Token.STRING, "string", 0, 0);
        JSType stringType = registry.createFromTypeNodes(stringNode, "test.js", null);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), stringType);
    }

    @Test
    public void testCreateFromTypeNodes_Nullable() throws Exception {
        Node stringNode = Node.newString(Token.STRING, "string", 0, 0);
        Node nullableNode = new Node(Token.QMARK, stringNode, 0, 0);
        JSType nullableStringType = registry.createFromTypeNodes(nullableNode, "test.js", null);
        assertTrue(nullableStringType.isUnionType());
        assertTrue(nullableStringType.toMaybeUnionType().getAlternates().contains(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        assertTrue(nullableStringType.toMaybeUnionType().getAlternates().contains(registry.getNativeType(JSTypeNative.NULL_TYPE)));
    }

    @Test
    public void testCreateFromTypeNodes_Record() throws Exception {
        Node recordNode = new Node(Token.LC,
            new Node(Token.COLON, Node.newString(Token.STRING, "field1", 0, 0), Node.newString(Token.STRING, "number", 0, 0)),
            new Node(Token.COLON, Node.newString(Token.STRING, "field2", 0, 0), Node.newString(Token.STRING, "string", 0, 0))
        );
        JSType recordType = registry.createFromTypeNodes(recordNode, "test.js", null);
        assertTrue(recordType.isRecordType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), recordType.toMaybeRecordType().getPropertyType("field1"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), recordType.toMaybeRecordType().getPropertyType("field2"));
    }

    @Test
    public void testCreateFromTypeNodes_Function() throws Exception {
        Node paramNode = Node.newString(Token.STRING, "number", 0, 0);
        Node returnNode = Node.newString(Token.STRING, "string", 0, 0);
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.PARAM_LIST, paramNode), returnNode);
        
        JSType functionType = registry.createFromTypeNodes(functionNode, "test.js", null);
        assertTrue(functionType.isFunctionType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), functionType.getReturnType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), functionType.getSlot("0").getType());
    }

    @Test
    public void testSetTemplateTypeName() throws Exception {
        registry.setTemplateTypeName("T");
        // Accessing private fields for testing: templateTypeName and templateType
        try {
            java.lang.reflect.Field nameField = JSTypeRegistry.class.getDeclaredField("templateTypeName");
            nameField.setAccessible(true);
            assertEquals("T", (String) nameField.get(registry));

            java.lang.reflect.Field typeField = JSTypeRegistry.class.getDeclaredField("templateType");
            typeField.setAccessible(true);
            assertNotNull(typeField.get(registry));
            assertEquals("T", ((TemplateType)typeField.get(registry)).getReferenceName());
        } catch (Exception e) {
            System.err.println("Reflection failed for template type: " + e.getMessage());
            fail("Reflection failed for template type.");
        }
    }

    @Test
    public void testClearTemplateTypeName() throws Exception {
        registry.setTemplateTypeName("T");
        registry.clearTemplateTypeName();
        // Accessing private fields for testing: templateTypeName and templateType
        try {
            java.lang.reflect.Field nameField = JSTypeRegistry.class.getDeclaredField("templateTypeName");
            nameField.setAccessible(true);
            assertNull(nameField.get(registry));

            java.lang.reflect.Field typeField = JSTypeRegistry.class.getDeclaredField("templateType");
            typeField.setAccessible(true);
            assertNull(typeField.get(registry));
        } catch (Exception e) {
            System.err.println("Reflection failed for clearing template type: " + e.getMessage());
            fail("Reflection failed for clearing template type.");
        }
    }

    @Test
    public void testGetRootNode() throws Exception {
        assertNull(registry.getRootNode());
    }

    @Test
    public void testGetParentScope() throws Exception {
        assertNull(registry.getParentScope());
    }

    @Test
    public void testGetSlot() throws Exception {
        // This method is abstract in ObjectType and implemented by concrete classes.
        // Test through a concrete object type.
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertNull(objType.getSlot("nonexistent"));
    }

    @Test
    public void testGetOwnSlot() throws Exception {
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertNull(objType.getOwnSlot("nonexistent"));
    }

    @Test
    public void testGetJSDocInfo() throws Exception {
        // JSDocInfo is null by default for native types.
        assertNull(registry.getNativeType(JSTypeNative.OBJECT_TYPE).getJSDocInfo());
    }

    @Test
    public void testSetJSDocInfo() throws Exception {
        JSDocInfo info = new JSDocInfo();
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        objType.setJSDocInfo(info);
        assertEquals(info, objType.getJSDocInfo());
    }

    @Test
    public void testGetReferenceName() throws Exception {
        // This is abstract in ObjectType. Test concrete implementations.
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertNull(objType.getReferenceName()); // ObjectType is not named by default.

        FunctionType fnType = registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        assertEquals("Function", fnType.getReferenceName());
    }

    @Test
    public void testGetDirectImplementors() throws Exception {
        ObjectType interfaceInstance = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE); // Placeholder for an interface instance
        Collection<FunctionType> implementors = registry.getDirectImplementors(interfaceInstance);
        assertNotNull(implementors); // Should not be null, even if empty
    }

    @Test
    public void testResolveTypesInScope() throws Exception {
        // This method is complex and its effects are internal.
        // A simple test is to ensure it runs without exceptions.
        StaticScope<JSType> scope = null; // Using null scope for simplicity
        registry.resolveTypesInScope(scope);
        // No assertion needed here, just ensuring the method runs without error.
    }

    @Test
    public void testCreateDefaultObjectUnion() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType defaultUnion = registry.createDefaultObjectUnion(stringType);
        assertTrue(defaultUnion.isUnionType());
        // Depending on tolerateUndefinedValues, it might include null/undefined
        assertTrue(defaultUnion.toMaybeUnionType().getAlternates().contains(stringType));
        assertTrue(defaultUnion.toMaybeUnionType().getAlternates().contains(registry.getNativeType(JSTypeNative.NULL_TYPE)));
        if (registry.shouldTolerateUndefinedValues()) {
            assertTrue(defaultUnion.toMaybeUnionType().getAlternates().contains(registry.getNativeType(JSTypeNative.VOID_TYPE)));
        }
    }
    
    @Test
    public void testGetIndexType() throws Exception {
        ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
        // The getIndexType method is defined in ObjectType but might return null for native types.
        // Let's test a concrete implementation like ParameterizedType.
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ParameterizedType parameterizedType = registry.createParameterizedType(arrayType, stringType);
        assertEquals(stringType, parameterizedType.getIndexType());
    }

    @Test
    public void testCreateFunctionTypeWithNewThisTypeUsingObjectType() throws Exception {
        ObjectType newThisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType originalFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType newFn = registry.createFunctionTypeWithNewThisType(originalFn, newThisType);
        assertEquals(newThisType, newFn.getTypeOfThis());
    }
    
    @Test
    public void testCreateConstructorTypeWithNewThisType() throws Exception {
        ObjectType newThisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType originalConstructor = registry.createConstructorType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        // The method createFunctionTypeWithNewThisType takes a FunctionType and ObjectType
        FunctionType newConstructor = registry.createFunctionTypeWithNewThisType(originalConstructor, newThisType);
        assertEquals(newThisType, newConstructor.getTypeOfThis());
        assertTrue(newConstructor.isConstructor());
    }

    @Test
    public void testCreateObjectTypeWithClassName() throws Exception {
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
        // The signature is createObjectType(String name, Node n, ObjectType implicitPrototype)
        // Using null for Node n as it's optional for this test's purpose.
        ObjectType objType = registry.createObjectType("MyClass", null, implicitProto);
        assertEquals("MyClass", objType.getReferenceName());
        assertEquals(implicitProto, objType.getImplicitPrototype());
    }

    @Test
    public void testCreateRecordType_Empty() throws Exception {
        Map<String, RecordProperty> properties = new HashMap<>();
        RecordType recordType = registry.createRecordType(properties);
        // An empty record type should resolve to the OBJECT_TYPE
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), recordType);
    }

    @Test
    public void testIsForwardDeclaredType() throws Exception {
        registry.forwardDeclareType("TrulyForwarded");
        assertTrue(registry.isForwardDeclaredType("TrulyForwarded"));
        assertFalse(registry.isForwardDeclaredType("NotForwarded"));
    }

    @Test
    public void testGetTypeWithScope() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        // For simplicity, we use null for scope, sourceName, lineno, charno.
        // This tests the basic lookup and creation of NamedType if not found.
        JSType foundType = registry.getType(null, "string", "test.js", 1, 1);
        assertEquals(stringType, foundType);

        // Test when the type is not found, a NamedType should be created.
        JSType unresolvedType = registry.getType(null, "NonExistentType", "test.js", 2, 2);
        assertTrue(unresolvedType.isNominalType());
        assertEquals("NonExistentType", unresolvedType.getReferenceName());
    }
}
```