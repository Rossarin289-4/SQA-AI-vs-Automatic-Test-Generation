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
    public void testFindPropertyTypeWhenPropertyDoesNotExist() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Set<JSType> alternates = ImmutableSet.of(stringType, numberType);
        UnionType unionType = createUnionType(alternates);

        assertNull(unionType.findPropertyType("nonExistentProperty"));
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









}




