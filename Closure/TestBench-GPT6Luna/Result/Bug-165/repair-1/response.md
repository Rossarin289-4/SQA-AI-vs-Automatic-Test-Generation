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
    @Test
    public void testNativeTypeLookup() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertTrue(registry.getNativeType(JSTypeNative.NUMBER_TYPE).isNumber());
        assertTrue(registry.getNativeType(JSTypeNative.STRING_TYPE).isString());
    }

    @Test
    public void testNativeObjectTypeLookup() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertTrue(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE).isObject());
    }

    @Test
    public void testNativeFunctionTypeLookup() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertTrue(registry.getNativeFunctionType(
                JSTypeNative.ARRAY_FUNCTION_TYPE).isConstructor());
    }

    @Test
    public void testUndefinedToleranceSetting() throws Exception {
        JSTypeRegistry strict = new JSTypeRegistry(null);
        JSTypeRegistry tolerant = new JSTypeRegistry(null, true);
        assertFalse(strict.shouldTolerateUndefinedValues());
        assertTrue(tolerant.shouldTolerateUndefinedValues());
    }

    @Test
    public void testDeclareTypeAndDuplicate() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(registry.declareType("Local", number));
        assertFalse(registry.declareType("Local",
                registry.getNativeType(JSTypeNative.STRING_TYPE)));
        assertSame(number, registry.getType("Local"));
    }

    @Test
    public void testOverwriteDeclaredType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(registry.declareType("Local", number));
        registry.overwriteDeclaredType("Local", string);
        assertSame(string, registry.getType("Local"));
    }

    @Test
    public void testForwardDeclaration() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertFalse(registry.isForwardDeclaredType("Future"));
        registry.forwardDeclareType("Future");
        assertTrue(registry.isForwardDeclaredType("Future"));
    }

    @Test
    public void testNamespaceFromDeclaredName() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertTrue(registry.declareType("pkg.Local",
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        assertTrue(registry.hasNamespace("pkg"));
        assertFalse(registry.hasNamespace("other"));
    }

    @Test
    public void testGetUnknownName() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertNull(registry.getType("NotDeclared"));
    }

    @Test
    public void testTemplateNameSetAndClear() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertNull(registry.getType("T"));
        registry.setTemplateTypeName("T");
        JSType template = registry.getType("T");
        assertNotNull(template);
        assertTrue(template.isTemplateType());
        registry.clearTemplateTypeName();
        assertNull(registry.getType("T"));
    }

    @Test
    public void testOptionalTypeAddsVoid() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType optional = registry.createOptionalType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(optional.isUnionType());
        assertTrue(optional.isSubtype(registry.getNativeType(JSTypeNative.VOID_TYPE)));
        assertTrue(optional.isSubtype(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testOptionalUnknownRemainsUnknown() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertSame(unknown, registry.createOptionalType(unknown));
    }

    @Test
    public void testNullableTypeContainsNull() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType nullable = registry.createNullableType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(nullable.isUnionType());
        assertTrue(nullable.isSubtype(registry.getNativeType(JSTypeNative.NULL_TYPE)));
        assertTrue(nullable.isSubtype(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testDefaultObjectUnionStrictMode() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType result = registry.createDefaultObjectUnion(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(result.isSubtype(registry.getNativeType(JSTypeNative.NULL_TYPE)));
        assertFalse(result.isSubtype(registry.getNativeType(JSTypeNative.VOID_TYPE)));
    }

    @Test
    public void testDefaultObjectUnionTolerantMode() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        JSType result = registry.createDefaultObjectUnion(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(result.isSubtype(registry.getNativeType(JSTypeNative.NULL_TYPE)));
        assertTrue(result.isSubtype(registry.getNativeType(JSTypeNative.VOID_TYPE)));
    }

    @Test
    public void testExplicitOptionalNullableType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType result = registry.createOptionalNullableType(
                registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(result.isSubtype(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        assertTrue(result.isSubtype(registry.getNativeType(JSTypeNative.NULL_TYPE)));
        assertTrue(result.isSubtype(registry.getNativeType(JSTypeNative.VOID_TYPE)));
    }

    @Test
    public void testCreateUnionCollapsesSingleAlternative() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertSame(number, registry.createUnionType(number));
    }

    @Test
    public void testCreateUnionContainsAlternatives() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType union = registry.createUnionType(number, string);
        assertTrue(union.isSubtype(number));
        assertTrue(union.isSubtype(string));
    }

    @Test
    public void testCreateObjectTypeAndResetPrototype() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType base = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        ObjectType child = registry.createObjectType(base);
        assertSame(base, child.getImplicitPrototype());
        ObjectType replacement = registry.createAnonymousObjectType();
        assertTrue(registry.resetImplicitPrototype(child, replacement));
        assertSame(replacement, child.getImplicitPrototype());
    }

    @Test
    public void testResetPrototypeRejectsNonPrototypeType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertFalse(registry.resetImplicitPrototype(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE),
                registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
    }

    @Test
    public void testPropertyRegistryRecordsTypesAndCanDefine() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType object = registry.createAnonymousObjectType();
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        registry.registerPropertyOnType("field", object);
        assertTrue(registry.canPropertyBeDefined(object, "field"));
        assertFalse(registry.canPropertyBeDefined(number, "field"));
        assertTrue(registry.getTypesWithProperty("field").iterator().hasNext());
        assertTrue(registry.getEachReferenceTypeWithProperty("field").iterator().hasNext());
    }

    @Test
    public void testUnregisteredPropertyHasNoPossibleType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertFalse(registry.canPropertyBeDefined(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE), "missing"));
        assertFalse(registry.getTypesWithProperty("missing").iterator().hasNext());
        assertFalse(registry.getEachReferenceTypeWithProperty("missing").iterator().hasNext());
    }

    @Test
    public void testCreateFunctionTypeArguments() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = registry.createFunctionType(
                registry.getNativeType(JSTypeNative.STRING_TYPE),
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(1, function.getMinArguments());
        assertEquals(1, function.getMaxArguments());
        assertSame(registry.getNativeType(JSTypeNative.STRING_TYPE),
                function.getReturnType());
    }

    @Test
    public void testFunctionTypeWithVarArgs() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = registry.createFunctionTypeWithVarArgs(
                registry.getNativeType(JSTypeNative.STRING_TYPE),
                Collections.singletonList(
                        registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        assertEquals(1, function.getMinArguments());
        assertEquals(Integer.MAX_VALUE, function.getMaxArguments());
    }

    @Test
    public void testRecordBuilderEmptyAndNonempty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        RecordTypeBuilder empty = new RecordTypeBuilder(registry);
        assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), empty.build());

        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        assertSame(builder, builder.addProperty("x",
                registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        JSType record = builder.build();
        assertTrue(record.isRecordType());
        assertTrue(record.toObjectType().hasProperty("x"));
        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
                record.toObjectType().getPropertyType("x"));
    }

    @Test
    public void testRecordBuilderRejectsDuplicateField() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        assertSame(builder, builder.addProperty("x",
                registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        assertNull(builder.addProperty("x",
                registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
                builder.build().toObjectType().getPropertyType("x"));
    }

    @Test
    public void testSetResolveMode() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        registry.setResolveMode(JSTypeRegistry.ResolveMode.IMMEDIATE);
        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
                registry.getType("Number"));
    }

    @Test
    public void testResetForTypeCheckClearsUserTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(registry.declareType("Local", number));
        registry.resetForTypeCheck();
        assertNull(registry.getType("Local"));
        assertNotNull(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    }

    @Test
    public void testErrorReporterGetter() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        assertNull(registry.getErrorReporter());
    }

    @Test
    public void testGreatestSubtypeWithRegisteredProperty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        registry.registerPropertyOnType("p", number);
        assertSame(number, registry.getGreatestSubtypeWithProperty(number, "p"));
        assertTrue(registry.getGreatestSubtypeWithProperty(string, "p").isEmptyType());
    }

    @Test
    public void testUnregisterReferenceTypeProperty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType named = registry.createObjectType("Named", null,
                registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        registry.registerPropertyOnType("p", named);
        assertSame(named, registry.getEachReferenceTypeWithProperty("p").iterator().next());
        registry.unregisterPropertyOnType("p", named);
        assertFalse(registry.getEachReferenceTypeWithProperty("p").iterator().hasNext());
    }

    @Test
    public void testDirectImplementorsInitiallyEmpty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType interfaceInstance = registry.createInterfaceType("I", null).getInstanceType();
        assertEquals(0, registry.getDirectImplementors(interfaceInstance).size());
    }

    @Test
    public void testClearNamedTypesDoesNotRemoveDeclaredTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(registry.declareType("Known", number));
        registry.clearNamedTypes();
        assertSame(number, registry.getType("Known"));
    }

    @Test
    public void testResolveEmptyScope() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        registry.resolveTypesInScope(null);
        assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE),
                registry.getNativeType(JSTypeNative.GLOBAL_THIS).toObjectType()
                        .getImplicitPrototype());
    }

    @Test
    public void testCreateEnumTypeUsesElementType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        EnumType enumType = registry.createEnumType("E", null,
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(enumType.isEnumType());
        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
                enumType.getElementsType());
    }

    @Test
    public void testConstructorTypeArguments() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType constructor = registry.createConstructorType(
                registry.getNativeType(JSTypeNative.STRING_TYPE),
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(1, constructor.getMinArguments());
        assertEquals(1, constructor.getMaxArguments());
    }

    @Test
    public void testConstructorTypeVarArgs() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType constructor = registry.createConstructorTypeWithVarArgs(
                registry.getNativeType(JSTypeNative.STRING_TYPE),
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(1, constructor.getMinArguments());
        assertEquals(Integer.MAX_VALUE, constructor.getMaxArguments());
    }

    @Test
    public void testCreateParameterNodes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node required = registry.createParameters(Collections.singletonList(number));
        Node varargs = registry.createParametersWithVarArgs(
                Collections.singletonList(number));
        Node optional = registry.createOptionalParameters(number);
        assertEquals(Token.BLOCK, required.getType());
        assertEquals(Token.BLOCK, varargs.getType());
        assertEquals(Token.BLOCK, optional.getType());
        assertEquals(1, required.getChildCount());
        assertEquals(1, varargs.getChildCount());
        assertEquals(1, optional.getChildCount());
    }

    @Test
    public void testCreateFunctionTypeWithNewReturnType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        FunctionType original = registry.createFunctionType(number);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FunctionType changed = registry.createFunctionTypeWithNewReturnType(original, string);
        assertSame(string, changed.getReturnType());
        assertSame(number, original.getReturnType());
    }

    @Test
    public void testCreateFunctionTypeWithNewThisType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType original = registry.createFunctionType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ObjectType thisType = registry.createAnonymousObjectType();
        FunctionType changed = registry.createFunctionTypeWithNewThisType(original, thisType);
        assertSame(thisType, changed.getTypeOfThis());
    }

    @Test
    public void testCreateRecordTypeFromEmptyMap() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        RecordType record = registry.createRecordType(Collections.<String, RecordProperty>emptyMap());
        assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), record);
    }

    @Test
    public void testCreateInterfaceType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType type = registry.createInterfaceType("I", null);
        assertTrue(type.isInterface());
        assertTrue(type.getInstanceType().isObject());
    }

    @Test
    public void testCreateParameterizedType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType array = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ParameterizedType parameterized = registry.createParameterizedType(array, number);
        assertSame(number, parameterized.getParameterType());
    }

    @Test
    public void testCreateNamedType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType named = registry.createNamedType("Missing", "source", 0, 0);
        assertTrue(named.isNamedType());
    }

    @Test
    public void testIdentifyNonNullableNameAndCreateTypeNode() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        registry.identifyNonNullableName("Number");
        Node name = Node.newString(Token.STRING, "Number");
        JSType result = registry.createFromTypeNodes(name, "source", null);
        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
    }

    @Test
    public void testObjectTypeScopeAndSlotDefaults() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType object = registry.createAnonymousObjectType();
        assertNull(object.getRootNode());
        assertNull(object.getTypeOfThis());
        assertNull(object.getSlot("absent"));
        assertNull(object.getOwnSlot("absent"));
        assertNull(object.getParameterType());
        assertNull(object.getIndexType());
    }

    @Test
    public void testObjectTypePropertySlotAfterDefinition() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType object = registry.createAnonymousObjectType();
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(object.defineDeclaredProperty("p", number, null));
        assertSame(number, object.getSlot("p").getType());
        assertSame(object.getSlot("p"), object.getOwnSlot("p"));
        assertSame(number, object.findPropertyType("p"));
    }

    @Test
    public void testObjectTypeJSDocInfoRoundTrip() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType object = registry.createAnonymousObjectType();
        JSDocInfo info = new JSDocInfo();
        object.setJSDocInfo(info);
        assertSame(info, object.getJSDocInfo());
    }

    @Test
    public void testObjectTypeDisplayAndReferenceName() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType named = registry.createObjectType("Named", null,
                registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        assertEquals("Named", named.getReferenceName());
        assertEquals("Named", named.getDisplayName());
        assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE),
                named.getParentScope());
    }
}
```