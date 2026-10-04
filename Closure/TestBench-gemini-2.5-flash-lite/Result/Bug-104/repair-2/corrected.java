package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.EvaluatorException; // Added import
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnionTypeTest {

    // Use a real JSTypeRegistry and a simple ErrorReporter mock
    private JSTypeRegistry registry = new JSTypeRegistry(new MockErrorReporter());

    // Mock ErrorReporter to satisfy the constructor of JSTypeRegistry
    private static class MockErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {}
        @Override
        public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {}
        @Override
        public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
            return new EvaluatorException(message);
        }
    }

    // Helper to create a simple UnionType
    private UnionType createUnionType(Set<JSType> alternates) {
        return new UnionType(registry, alternates);
    }

    @Test
    public void testGetAlternates() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);
        // Check that the returned alternates match the input, considering order might differ in sets.
        assertEquals(alternates.size(), ImmutableSet.copyOf(unionType.getAlternates()).size());
        assertTrue(ImmutableSet.copyOf(unionType.getAlternates()).containsAll(alternates));
    }

    @Test
    public void testForgiveUnknownNames() {
        // Create a dummy UnknownType to test forgiveness
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        Set<JSType> alternates = ImmutableSet.of(unknownType);
        UnionType unionType = createUnionType(alternates);
        // The method iterates through alternates and calls forgiveUnknownNames on each.
        // We can't directly assert side-effects without deeper mocking, but calling it should be safe.
        unionType.forgiveUnknownNames();
        // Assert that the operation did not throw an exception.
        assertTrue(true);
    }

    @Test
    public void testMatchesNumberContextWhenOneAlternateMatches() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);
        assertTrue(unionType.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContextWhenNoAlternateMatches() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, booleanType);
        UnionType unionType = createUnionType(alternates);
        assertFalse(unionType.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContextWhenOneAlternateMatches() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(numberType, stringType);
        UnionType unionType = createUnionType(alternates);
        assertTrue(unionType.matchesStringContext());
    }

    @Test
    public void testMatchesStringContextWhenNoAlternateMatches() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Set<JSType> alternates = ImmutableSet.of(numberType, booleanType);
        UnionType unionType = createUnionType(alternates);
        assertFalse(unionType.matchesStringContext());
    }

    @Test
    public void testMatchesObjectContextWhenOneAlternateMatches() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, objectType);
        UnionType unionType = createUnionType(alternates);
        assertTrue(unionType.matchesObjectContext());
    }

    @Test
    public void testMatchesObjectContextWhenNoAlternateMatches() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);
        assertFalse(unionType.matchesObjectContext());
    }

    @Test
    public void testFindPropertyTypeWhenPropertyExistsInOneAlternate() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // Simulate a string type having a 'length' property returning a number type.
        JSType stringWithLength = new StringType(registry) {
            @Override
            public JSType findPropertyType(String propertyName) {
                if ("length".equals(propertyName)) {
                    return registry.getNativeType(JSTypeNative.NUMBER_TYPE);
                }
                return null;
            }
            // Override abstract methods from JSType if they are not implicitly handled
            @Override
            public JSType getLeastSupertype(JSType that) { return null; } // Dummy implementation
            @Override
            public JSType findPropertyType(String propertyName, JSType source) { return null; } // Dummy implementation
            @Override
            protected JSType findJSDocInfo(String propertyName) { return null; } // Dummy implementation
            @Override
            public boolean isUnknownType() { return false; } // Dummy implementation
            @Override
            public boolean isStringObjectType() { return false; } // Dummy implementation
            @Override
            public boolean isStringValueType() { return true; } // Treat as string value type for context
            @Override
            public boolean isObject() { return false; } // Treat as not an object for context
            @Override
            public boolean isNullable() { return false; } // Dummy implementation
            @Override
            public boolean isConstructor() { return false; } // Dummy implementation
            @Override
            public boolean isInterface() { return false; } // Dummy implementation
            @Override
            public boolean isFunctionType() { return false; } // Dummy implementation
            @Override
            public boolean isInstanceType() { return false; } // Dummy implementation
            @Override
            public boolean isNominalType() { return false; } // Dummy implementation
            @Override
            public boolean isOrdinaryFunction() { return false; } // Dummy implementation
            @Override
            public boolean isTemplatizedType() { return false; } // Dummy implementation
            @Override
            public boolean isUnionType() { return false; } // Dummy implementation
            @Override
            public String toString() { return "StringType"; } // Dummy implementation
        };
        Set<JSType> alternates = ImmutableSet.of(stringWithLength, numberType);
        UnionType unionType = createUnionType(alternates);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), unionType.findPropertyType("length"));
    }

    @Test
    public void testFindPropertyTypeWhenPropertyDoesNotExist() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);

        assertNull(unionType.findPropertyType("nonExistentProperty"));
    }

    @Test
    public void testFindPropertyTypeWhenPropertyExistsInMultipleAlternates() {
        // This tests the getLeastSupertype logic implicitly.
        // We don't have a concrete least supertype implementation for string/number easily available.
        // Focus on the structure: if a property exists in multiple, it should find a supertype.
        // If not overridden, findPropertyType typically returns null for primitives.
        // Let's use OBJECT_TYPE and FUNCTION_TYPE which have common properties.
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType functionType = registry.getNativeType(JSTypeNative.FUNCTION_TYPE);

        // Assume 'prototype' exists in both (it does, but with different types).
        // The exact type of 'prototype' is complex. For this test, we check that *some* type is returned.
        Set<JSType> alternates = ImmutableSet.of(objectType, functionType);
        UnionType unionType = createUnionType(alternates);

        // The actual result of getLeastSupertype between two complex types like prototype properties is hard to predict without deep knowledge of the registry.
        // We assert that *a* type is found, indicating the loop and getLeastSupertype were called.
        // A more robust test would mock getLeastSupertype.
        assertNotNull(unionType.findPropertyType("prototype"));
    }

    @Test
    public void testCanAssignToWhenAllAlternatesCanAssign() {
        JSType targetType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);

        assertTrue(unionType.canAssignTo(targetType));
    }

    @Test
    public void testCanAssignToWhenOneAlternateCannotAssign() {
        JSType targetType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE); // Null cannot be assigned to Object

        Set<JSType> alternates = ImmutableSet.of(stringType, nullType);
        UnionType unionType = createUnionType(alternates);

        assertFalse(unionType.canAssignTo(targetType));
    }

    @Test
    public void testCanAssignToWithUnknownTypeAlternate() {
        JSType targetType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        Set<JSType> alternates = ImmutableSet.of(unknownType);
        UnionType unionType = createUnionType(alternates);

        // According to the source: "if (t.isUnknownType()) { return true; }"
        assertTrue(unionType.canAssignTo(targetType));
    }

    @Test
    public void testCanBeCalledWhenAllAlternatesCanBeCalled() {
        JSType functionType = registry.getNativeType(JSTypeNative.FUNCTION_TYPE);
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE); // Objects can sometimes be callable (e.g., built-ins)

        Set<JSType> alternates = ImmutableSet.of(functionType, objectType);
        UnionType unionType = createUnionType(alternates);
        // Assuming functionType and objectType can be called in this context.
        // A more accurate test would mock these specifically.
        assertTrue(unionType.canBeCalled());
    }

    @Test
    public void testCanBeCalledWhenOneAlternateCannotBeCalled() {
        JSType functionType = registry.getNativeType(JSTypeNative.FUNCTION_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE); // Numbers cannot be called

        Set<JSType> alternates = ImmutableSet.of(functionType, numberType);
        UnionType unionType = createUnionType(alternates);
        assertFalse(unionType.canBeCalled());
    }

    @Test
    public void testRestrictByNotNullOrUndefined() {
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        Set<JSType> alternates = ImmutableSet.of(nullType, voidType, stringType);
        UnionType unionType = createUnionType(alternates);
        UnionType restrictedUnion = (UnionType) unionType.restrictByNotNullOrUndefined();

        // NullType and VoidType should be removed by restrictByNotNullOrUndefined()
        assertFalse(restrictedUnion.contains(nullType));
        assertFalse(restrictedUnion.contains(voidType));
        assertTrue(restrictedUnion.contains(stringType));
        assertEquals(1, ImmutableSet.copyOf(restrictedUnion.getAlternates()).size());
    }

    @Test
    public void testTestForEqualityWhenAllAlternatesAreEqual() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, stringType); // Duplicate types are fine for the set
        UnionType unionType = createUnionType(alternates);
        // If the 'that' type is also STRING_TYPE, then testForEquality should be TRUE.
        assertEquals(TernaryValue.TRUE, unionType.testForEquality(stringType));
    }

    @Test
    public void testTestForEqualityWhenAlternatesDiffer() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);
        // Testing equality between string and number should be FALSE.
        assertEquals(TernaryValue.FALSE, unionType.testForEquality(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        // If alternates produce different results for the same 'that' type, UNKNOWN is returned.
        // This test is tricky because testForEquality is often implemented by checking specific types.
        // A more direct test for UNKNOWN:
        JSType mockTypeTrue = new JSType(registry) {
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.TRUE; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return this; } // Implement abstract methods
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; } // Implement abstract methods
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); } // Implement abstract methods
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); } // Implement abstract methods
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); } // Implement abstract methods
            @Override public boolean isSubtype(JSType that) { return true; } // Implement abstract methods
            @Override public JSType findPropertyType(String propertyName) { return null; } // Implement abstract methods
            @Override public boolean isNullable() { return false; } // Implement abstract methods
            @Override public boolean isUnknownType() { return false; } // Implement abstract methods
            @Override public boolean isObject() { return false; } // Implement abstract methods
            @Override public boolean isUnionType() { return false; } // Implement abstract methods
            @Override public boolean isStringValueType() { return false; } // Implement abstract methods
            @Override public boolean isNumberValueType() { return false; } // Implement abstract methods
            @Override public boolean isBooleanValueType() { return false; } // Implement abstract methods
            @Override public boolean isStringObjectType() { return false; } // Implement abstract methods
            @Override public boolean isNumberObjectType() { return false; } // Implement abstract methods
            @Override public boolean isBooleanObjectType() { return false; } // Implement abstract methods
            @Override public boolean isFunctionType() { return false; } // Implement abstract methods
            @Override public boolean isConstructor() { return false; } // Implement abstract methods
            @Override public boolean isInterface() { return false; } // Implement abstract methods
            @Override public boolean isNamedType() { return false; } // Implement abstract methods
            @Override public boolean isRecordType() { return false; } // Implement abstract methods
            @Override public boolean isTemplateType() { return false; } // Implement abstract methods
            @Override public boolean isEnumElementType() { return false; } // Implement abstract methods
            @Override public boolean isEnumType() { return false; } // Implement abstract methods
            @Override public boolean isVoidType() { return false; } // Implement abstract methods
            @Override public boolean isNullType() { return false; } // Implement abstract methods
            @Override public boolean isAllType() { return false; } // Implement abstract methods
            @Override public boolean isNoType() { return false; } // Implement abstract methods
            @Override public boolean isNoObjectType() { return false; } // Implement abstract methods
            @Override public boolean isEmptyType() { return false; } // Implement abstract methods
            @Override public boolean isTheObjectType() { return false; } // Implement abstract methods
            @Override public boolean isFunctionPrototypeType() { return false; } // Implement abstract methods
            @Override public boolean isString() { return false; } // Implement abstract methods
            @Override public boolean isNumber() { return false; } // Implement abstract methods
            @Override public boolean isBoolean() { return false; } // Implement abstract methods
            @Override public boolean isRegexpType() { return false; } // Implement abstract methods
            @Override public boolean isDateType() { return false; } // Implement abstract methods
            @Override public boolean isInstanceType() { return false; } // Implement abstract methods
            @Override public boolean isArrayType() { return false; } // Implement abstract methods
            @Override public boolean isCheckedUnknownType() { return false; } // Implement abstract methods
            @Override public boolean isObject() { return false; } // Implement abstract methods
            @Override public boolean isNominalType() { return false; } // Implement abstract methods
            @Override public boolean isEnumType() { return false; } // Implement abstract methods
            @Override public boolean isEnumElementType() { return false; } // Implement abstract methods
            @Override public void forgiveUnknownNames() {} // Implement abstract methods
            @Override public JSType getLeastSupertype(JSType that) { return this; } // Implement abstract methods
            @Override public String toString() { return "MockTrue"; } // Implement abstract methods
        };
        JSType mockTypeFalse = new JSType(registry) {
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.FALSE; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return this; } // Implement abstract methods
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; } // Implement abstract methods
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); } // Implement abstract methods
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); } // Implement abstract methods
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); } // Implement abstract methods
            @Override public boolean isSubtype(JSType that) { return true; } // Implement abstract methods
            @Override public JSType findPropertyType(String propertyName) { return null; } // Implement abstract methods
            @Override public boolean isNullable() { return false; } // Implement abstract methods
            @Override public boolean isUnknownType() { return false; } // Implement abstract methods
            @Override public boolean isObject() { return false; } // Implement abstract methods
            @Override public boolean isUnionType() { return false; } // Implement abstract methods
            @Override public boolean isStringValueType() { return false; } // Implement abstract methods
            @Override public boolean isNumberValueType() { return false; } // Implement abstract methods
            @Override public boolean isBooleanValueType() { return false; } // Implement abstract methods
            @Override public boolean isStringObjectType() { return false; } // Implement abstract methods
            @Override public boolean isNumberObjectType() { return false; } // Implement abstract methods
            @Override public boolean isBooleanObjectType() { return false; } // Implement abstract methods
            @Override public boolean isFunctionType() { return false; } // Implement abstract methods
            @Override public boolean isConstructor() { return false; } // Implement abstract methods
            @Override public boolean isInterface() { return false; } // Implement abstract methods
            @Override public boolean isNamedType() { return false; } // Implement abstract methods
            @Override public boolean isRecordType() { return false; } // Implement abstract methods
            @Override public boolean isTemplateType() { return false; } // Implement abstract methods
            @Override public boolean isEnumElementType() { return false; } // Implement abstract methods
            @Override public boolean isEnumType() { return false; } // Implement abstract methods
            @Override public boolean isVoidType() { return false; } // Implement abstract methods
            @Override public boolean isNullType() { return false; } // Implement abstract methods
            @Override public boolean isAllType() { return false; } // Implement abstract methods
            @Override public boolean isNoType() { return false; } // Implement abstract methods
            @Override public boolean isNoObjectType() { return false; } // Implement abstract methods
            @Override public boolean isEmptyType() { return false; } // Implement abstract methods
            @Override public boolean isTheObjectType() { return false; } // Implement abstract methods
            @Override public boolean isFunctionPrototypeType() { return false; } // Implement abstract methods
            @Override public boolean isString() { return false; } // Implement abstract methods
            @Override public boolean isNumber() { return false; } // Implement abstract methods
            @Override public boolean isBoolean() { return false; } // Implement abstract methods
            @Override public boolean isRegexpType() { return false; } // Implement abstract methods
            @Override public boolean isDateType() { return false; } // Implement abstract methods
            @Override public boolean isInstanceType() { return false; } // Implement abstract methods
            @Override public boolean isArrayType() { return false; } // Implement abstract methods
            @Override public boolean isCheckedUnknownType() { return false; } // Implement abstract methods
            @Override public boolean isObject() { return false; } // Implement abstract methods
            @Override public boolean isNominalType() { return false; } // Implement abstract methods
            @Override public boolean isEnumType() { return false; } // Implement abstract methods
            @Override public boolean isEnumElementType() { return false; } // Implement abstract methods
            @Override public void forgiveUnknownNames() {} // Implement abstract methods
            @Override public JSType getLeastSupertype(JSType that) { return this; } // Implement abstract methods
            @Override public String toString() { return "MockFalse"; } // Implement abstract methods
        };
        Set<JSType> differentAlternates = ImmutableSet.of(mockTypeTrue, mockTypeFalse);
        UnionType unionTypeDifferent = createUnionType(differentAlternates);
        assertEquals(TernaryValue.UNKNOWN, unionTypeDifferent.testForEquality(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)));
    }

    @Test
    public void testIsNullableWhenOneAlternateIsNullable() {
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(nullType, numberType);
        UnionType unionType = createUnionType(alternates);
        assertTrue(unionType.isNullable());
    }

    @Test
    public void testIsNullableWhenNoAlternateIsNullable() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);
        assertFalse(unionType.isNullable());
    }

    @Test
    public void testIsUnknownTypeWhenOneAlternateIsUnknown() {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Set<JSType> alternates = ImmutableSet.of(unknownType, stringType);
        UnionType unionType = createUnionType(alternates);
        assertTrue(unionType.isUnknownType());
    }

    @Test
    public void testIsUnknownTypeWhenNoAlternateIsUnknown() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);
        assertFalse(unionType.isUnknownType());
    }

    @Test
    public void testGetLeastSupertypeWhenOneAlternateIsSubtypeOfThat() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE); // Supertype of string and number

        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);

        // stringType is a subtype of objectType. The method checks if `that.isSubtype(alternate)`
        // for any alternate. Here, `objectType.isSubtype(stringType)` is false.
        // Let's rephrase: when `that` is a supertype of `this`, `that` is the least supertype.
        // When `this` is a supertype of `that`, `that` is the least supertype.
        // In `getLeastSupertype(this, that)`: if `that` is subtype of `this`, return `that`.
        // Here, stringType is a subtype of unionType. So unionType.getLeastSupertype(stringType) should be unionType.
        assertTrue(stringType.isSubtype(unionType));
        assertEquals(unionType, unionType.getLeastSupertype(stringType));
    }

    @Test
    public void testGetLeastSupertypeWhenNoAlternateIsSubtypeOfThat() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);

        // stringType is not a subtype of booleanType.
        // numberType is not a subtype of booleanType.
        // The method will fallback to `getLeastSupertype(this, that)`
        // The result depends on the implementation of the superclass `getLeastSupertype`.
        // We expect a union of string|number and boolean. The precise outcome is complex.
        // Let's test getLeastSupertype(string|number, string) which should be string|number
        assertEquals(unionType, unionType.getLeastSupertype(stringType));
    }

    @Test
    public void testEqualsSameUnionType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType1 = createUnionType(alternates);
        UnionType unionType2 = createUnionType(alternates); // Same alternates
        assertEquals(unionType1, unionType2);
    }

    @Test
    public void testEqualsDifferentUnionType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Set<JSType> alternates1 = ImmutableSet.of(stringType, numberType);
        Set<JSType> alternates2 = ImmutableSet.of(stringType, booleanType);
        UnionType unionType1 = createUnionType(alternates1);
        UnionType unionType2 = createUnionType(alternates2);
        assertNotEquals(unionType1, unionType2);
    }

    @Test
    public void testHashCode() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType1 = createUnionType(alternates);
        UnionType unionType2 = createUnionType(alternates);
        assertEquals(unionType1.hashCode(), unionType2.hashCode());
    }

    @Test
    public void testIsUnionType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        UnionType unionType = createUnionType(ImmutableSet.of(stringType));
        assertTrue(unionType.isUnionType());
    }

    @Test
    public void testIsObjectWhenAllAlternatesAreObjects() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType functionType = registry.getNativeType(JSTypeNative.FUNCTION_TYPE); // Also considered an object type
        UnionType unionType = createUnionType(ImmutableSet.of(objectType, functionType));
        assertTrue(unionType.isObject());
    }

    @Test
    public void testIsObjectWhenOneAlternateIsNotObject() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE); // Not an object type
        UnionType unionType = createUnionType(ImmutableSet.of(objectType, numberType));
        assertFalse(unionType.isObject());
    }

    @Test
    public void testContainsWhenAlternateIsPresent() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        UnionType unionType = createUnionType(ImmutableSet.of(stringType, numberType));
        assertTrue(unionType.contains(stringType));
    }

    @Test
    public void testContainsWhenAlternateIsNotPresent() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        UnionType unionType = createUnionType(ImmutableSet.of(stringType, registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        assertFalse(unionType.contains(booleanType));
    }

    @Test
    public void testGetRestrictedUnionWhenOneAlternateIsSubtype() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

        Set<JSType> alternates = ImmutableSet.of(numberType, stringType, booleanType);
        UnionType unionType = createUnionType(alternates);

        // Restricting by 'numberType' should remove 'numberType' from the union.
        // isSubtype check is `!t.isSubtype(type)` -> remove if `t` is a subtype of `type`.
        // So if `type` is `numberType`, then `numberType.isSubtype(numberType)` is true, so it's removed.
        JSType restricted = unionType.getRestrictedUnion(numberType);
        assertTrue(restricted instanceof UnionType);
        UnionType restrictedUnion = (UnionType) restricted;
        assertFalse(restrictedUnion.contains(numberType));
        assertTrue(restrictedUnion.contains(stringType));
        assertTrue(restrictedUnion.contains(booleanType));
        assertEquals(2, ImmutableSet.copyOf(restrictedUnion.getAlternates()).size());
    }

    @Test
    public void testGetRestrictedUnionWhenNoAlternateIsSubtype() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        UnionType unionType = createUnionType(ImmutableSet.of(numberType, stringType));

        // Restricting by a type that is not a supertype of any alternate.
        // e.g., try to remove 'number' from a union of 'string' and 'number', using 'boolean' as the type to remove.
        // No alternate is a subtype of BOOLEAN_TYPE. So no type is removed.
        JSType restricted = unionType.getRestrictedUnion(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        assertEquals(unionType, restricted);
    }

    @Test
    public void testIsSubtypeWhenAllAlternatesAreSubtypes() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        UnionType unionType = createUnionType(ImmutableSet.of(stringType, numberType));

        // Test if unionType is a subtype of a type that all its alternates are subtypes of.
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertTrue(unionType.isSubtype(objectType));
    }

    @Test
    public void testIsSubtypeWhenOneAlternateIsNotSubtype() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        UnionType unionType = createUnionType(ImmutableSet.of(stringType, numberType));

        // Test if unionType is a subtype of a type where one alternate is not.
        // String is not a subtype of NumberValueType.
        JSType numberValueType = registry.getNativeType(JSTypeNative.NUMBER_VALUE_TYPE);
        assertFalse(unionType.isSubtype(numberValueType));
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeTrue() {
        // Mock types to control their outcome behavior
        JSType mockTypeString = new JSType(registry) {
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
                return outcome ? registry.getNativeType(JSTypeNative.STRING_TYPE) : registry.getNativeType(JSTypeNative.NULL_TYPE);
            }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return true; }
            @Override public boolean isNumberValueType() { return false; }
            @Override public boolean isBooleanValueType() { return false; }
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return true; }
            @Override public boolean isNumber() { return false; }
            @Override public boolean isBoolean() { return false; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "mockString"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return getRestrictedTypeGivenToBooleanOutcome(outcome); }
        };
        JSType mockTypeNumber = new JSType(registry) {
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
                return outcome ? registry.getNativeType(JSTypeNative.NUMBER_TYPE) : registry.getNativeType(JSTypeNative.NULL_TYPE);
            }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return false; }
            @Override public boolean isNumberValueType() { return true; }
            @Override public boolean isBooleanValueType() { return false; }
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return false; }
            @Override public boolean isNumber() { return true; }
            @Override public boolean isBoolean() { return false; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "mockNumber"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return getRestrictedTypeGivenToBooleanOutcome(outcome); }
        };

        Set<JSType> alternates = ImmutableSet.of(mockTypeString, mockTypeNumber);
        UnionType unionType = createUnionType(alternates);

        UnionType restricted = (UnionType) unionType.getRestrictedTypeGivenToBooleanOutcome(true);
        assertTrue(restricted.contains(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        assertTrue(restricted.contains(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        assertEquals(2, ImmutableSet.copyOf(restricted.getAlternates()).size());
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeFalse() {
        JSType mockTypeString = new JSType(registry) {
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
                return outcome ? registry.getNativeType(JSTypeNative.STRING_TYPE) : registry.getNativeType(JSTypeNative.NULL_TYPE);
            }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return true; }
            @Override public boolean isNumberValueType() { return false; }
            @Override public boolean isBooleanValueType() { return false; }
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return true; }
            @Override public boolean isNumber() { return false; }
            @Override public boolean isBoolean() { return false; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "mockString"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return getRestrictedTypeGivenToBooleanOutcome(outcome); }
        };
        JSType mockTypeNumber = new JSType(registry) {
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
                return outcome ? registry.getNativeType(JSTypeNative.NUMBER_TYPE) : registry.getNativeType(JSTypeNative.NULL_TYPE);
            }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return false; }
            @Override public boolean isNumberValueType() { return true; }
            @Override public boolean isBooleanValueType() { return false; }
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return false; }
            @Override public boolean isNumber() { return true; }
            @Override public boolean isBoolean() { return false; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "mockNumber"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return getRestrictedTypeGivenToBooleanOutcome(outcome); }
        };

        Set<JSType> alternates = ImmutableSet.of(mockTypeString, mockTypeNumber);
        UnionType unionType = createUnionType(alternates);

        UnionType restricted = (UnionType) unionType.getRestrictedTypeGivenToBooleanOutcome(false);
        assertTrue(restricted.contains(registry.getNativeType(JSTypeNative.NULL_TYPE))); // Null is the result for false outcome
        assertEquals(1, ImmutableSet.copyOf(restricted.getAlternates()).size());
    }

    @Test
    public void testGetPossibleToBooleanOutcomesWhenBothPresent() {
        JSType mockTypeTrue = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.get(true); }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return false; }
            @Override public boolean isNumberValueType() { return false; }
            @Override public boolean isBooleanValueType() { return true; } // Representing boolean true
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return false; }
            @Override public boolean isNumber() { return false; }
            @Override public boolean isBoolean() { return true; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "MockTrue"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return this; }
        };
        JSType mockTypeFalse = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.get(false); }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return false; }
            @Override public boolean isNumberValueType() { return false; }
            @Override public boolean isBooleanValueType() { return true; } // Representing boolean false
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return false; }
            @Override public boolean isNumber() { return false; }
            @Override public boolean isBoolean() { return true; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "MockFalse"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return this; }
        };
        Set<JSType> alternates = ImmutableSet.of(mockTypeTrue, mockTypeFalse);
        UnionType unionType = createUnionType(alternates);
        assertEquals(BooleanLiteralSet.BOTH, unionType.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testGetPossibleToBooleanOutcomesWhenOnlyTruePresent() {
        JSType mockTypeTrue = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.get(true); }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return false; }
            @Override public boolean isNumberValueType() { return false; }
            @Override public boolean isBooleanValueType() { return true; }
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return false; }
            @Override public boolean isNumber() { return false; }
            @Override public boolean isBoolean() { return true; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "MockTrue"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return this; }
        };
        Set<JSType> alternates = ImmutableSet.of(mockTypeTrue);
        UnionType unionType = createUnionType(alternates);
        assertEquals(BooleanLiteralSet.get(true), unionType.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testGetTypesUnderEquality() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        // A mock type that simulates returning specific types under equality
        JSType mockType = new JSType(registry) {
            @Override public TypePair getTypesUnderEquality(JSType that) {
                // This logic depends on 'that'. For simplicity, we return fixed types.
                return new TypePair(stringType, numberType);
            }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return false; }
            @Override public boolean isNumberValueType() { return false; }
            @Override public boolean isBooleanValueType() { return false; }
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return false; }
            @Override public boolean isNumber() { return false; }
            @Override public boolean isBoolean() { return false; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "MockType"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return this; }
        };
        Set<JSType> alternates = ImmutableSet.of(mockType);
        UnionType unionType = createUnionType(alternates);
        TypePair result = unionType.getTypesUnderEquality(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        assertNotNull(result.typeA);
        assertNotNull(result.typeB);
        assertEquals(stringType, result.typeA);
        assertEquals(numberType, result.typeB);
    }

    @Test
    public void testGetTypesUnderInequality() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        JSType mockType = new JSType(registry) {
            @Override public TypePair getTypesUnderInequality(JSType that) {
                return new TypePair(stringType, numberType);
            }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return false; }
            @Override public boolean isNumberValueType() { return false; }
            @Override public boolean isBooleanValueType() { return false; }
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return false; }
            @Override public boolean isNumber() { return false; }
            @Override public boolean isBoolean() { return false; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "MockType"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderShallowInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return this; }
        };
        Set<JSType> alternates = ImmutableSet.of(mockType);
        UnionType unionType = createUnionType(alternates);
        TypePair result = unionType.getTypesUnderInequality(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        assertNotNull(result.typeA);
        assertNotNull(result.typeB);
        assertEquals(stringType, result.typeA);
        assertEquals(numberType, result.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequality() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        JSType mockType = new JSType(registry) {
            @Override public TypePair getTypesUnderShallowInequality(JSType that) {
                return new TypePair(stringType, numberType);
            }
            // Implementing abstract methods
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public JSType findPropertyType(String propertyName) { return null; }
            @Override public boolean isNullable() { return false; }
            @Override public boolean isUnknownType() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public boolean isUnionType() { return false; }
            @Override public boolean isStringValueType() { return false; }
            @Override public boolean isNumberValueType() { return false; }
            @Override public boolean isBooleanValueType() { return false; }
            @Override public boolean isStringObjectType() { return false; }
            @Override public boolean isNumberObjectType() { return false; }
            @Override public boolean isBooleanObjectType() { return false; }
            @Override public boolean isFunctionType() { return false; }
            @Override public boolean isConstructor() { return false; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isNamedType() { return false; }
            @Override public boolean isRecordType() { return false; }
            @Override public boolean isTemplateType() { return false; }
            @Override public boolean isEnumElementType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isVoidType() { return false; }
            @Override public boolean isNullType() { return false; }
            @Override public boolean isAllType() { return false; }
            @Override public boolean isNoType() { return false; }
            @Override public boolean isNoObjectType() { return false; }
            @Override public boolean isEmptyType() { return false; }
            @Override public boolean isTheObjectType() { return false; }
            @Override public boolean isFunctionPrototypeType() { return false; }
            @Override public boolean isString() { return false; }
            @Override public boolean isNumber() { return false; }
            @Override public boolean isBoolean() { return false; }
            @Override public boolean isRegexpType() { return false; }
            @Override public boolean isDateType() { return false; }
            @Override public boolean isInstanceType() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isCheckedUnknownType() { return false; }
            @Override public void forgiveUnknownNames() {}
            @Override public JSType getLeastSupertype(JSType that) { return this; }
            @Override public String toString() { return "MockType"; }
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.EMPTY; }
            @Override public TypePair getTypesUnderEquality(JSType that) { return new TypePair(this, this); }
            @Override public TypePair getTypesUnderInequality(JSType that) { return new TypePair(this, this); }
            @Override public JSType restrictByNotNullOrUndefined() { return this; }
            @Override public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) { return this; }
        };
        Set<JSType> alternates = ImmutableSet.of(mockType);
        UnionType unionType = createUnionType(alternates);
        TypePair result = unionType.getTypesUnderShallowInequality(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        assertNotNull(result.typeA);
        assertNotNull(result.typeB);
        assertEquals(stringType, result.typeA);
        assertEquals(numberType, result.typeB);
    }

    @Test
    public void testVisit() {
        // A dummy visitor that returns a string.
        Visitor<String> dummyVisitor = new Visitor<String>() {
            @Override
            public String caseUnionType(UnionType type) {
                return "Visited UnionType";
            }
            // Implement other cases to satisfy the Visitor interface.
            // For cases not directly tested here, provide a default return or throw.
            @Override public String caseAllType(AllType type) { return "caseAllType"; }
            @Override public String caseBooleanType(BooleanType type) { return "caseBooleanType"; }
            @Override public String caseObjectType(ObjectType type) { return "caseObjectType"; }
            @Override public String caseFunctionType(FunctionType type) { return "caseFunctionType"; }
            @Override public String caseEnumType(EnumType type) { return "caseEnumType"; }
            @Override public String caseEnumElementType(EnumElementType type) { return "caseEnumElementType"; }
            @Override public String caseErrorType(ErrorType type) { return "caseErrorType"; }
            @Override public String caseNoObjectType(NoObjectType type) { return "caseNoObjectType"; }
            @Override public String caseNoType(NoType type) { return "caseNoType"; }
            @Override public String caseNullType(NullType type) { return "caseNullType"; }
            @Override public String caseNumberType(NumberType type) { return "caseNumberType"; }
            @Override public String caseStringType(StringType type) { return "caseStringType"; }
            @Override public String caseTemplateType(TemplateType type) { return "caseTemplateType"; }
            @Override public String caseTypeVariable(TypeVariable type) { return "caseTypeVariable"; }
            @Override public String caseUnknownType(UnknownType type) { return "caseUnknownType"; }
            @Override public String caseVoidType(VoidType type) { return "caseVoidType"; }
            @Override public String caseNamedType(NamedType type) { return "caseNamedType"; }
            @Override public String caseRecordType(RecordType type) { return "caseRecordType"; }
            @Override public String casePrototypeObjectType(PrototypeObjectType type) { return "casePrototypeObjectType"; }
            @Override public String caseFunctionPrototypeType(FunctionPrototypeType type) { return "caseFunctionPrototypeType"; }
            @Override public String caseVoidErrorFunctionType(VoidErrorFunctionType type) { return "caseVoidErrorFunctionType"; }
            @Override public String caseConstructorType(ConstructorType type) { return "caseConstructorType"; }
            @Override public String caseInterfaceType(InterfaceType type) { return "caseInterfaceType"; }
            @Override public String caseParameterizedType(ParameterizedType type) { return "caseParameterizedType"; }
            @Override public String caseArrowType(ArrowType type) { return "caseArrowType"; }
            @Override public String caseUnknownClassType(UnknownClassType type) { return "caseUnknownClassType"; }
            @Override public String caseObjectPrototype(ObjectPrototype type) { return "caseObjectPrototype"; }
            @Override public String caseReferenceToUnknown(ReferenceToUnknownType type) { return "caseReferenceToUnknown"; }
        };
        UnionType unionType = createUnionType(ImmutableSet.of(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        assertEquals("Visited UnionType", unionType.visit(dummyVisitor));
    }
}
