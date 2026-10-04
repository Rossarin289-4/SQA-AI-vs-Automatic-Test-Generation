```java
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Comparator;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.testing.EmptyScope;
// Removed import for TypeInference as it's not used and likely inaccessible
import com.google.javascript.rhino.Node; // Added for Node in createObjectType

public class JSTypeTest {

    // Dummy objects needed for testing JSType methods that interact with JSTypeRegistry
    // and ErrorReporter. These are minimal implementations to satisfy method signatures.
    private JSTypeRegistry registry = new JSTypeRegistry(new MockErrorReporter());
    private EmptyScope scope = new EmptyScope();

    // Mock ErrorReporter to avoid actual reporting during tests.
    private static class MockErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {}

        @Override
        public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {}

        // EvaluatorException is in com.google.javascript.jscomp.EvaluatorException,
        // but it's not readily available and its usage here seems to be for asserting
        // runtime errors. If it's not part of the public API we can use,
        // we can rethrow a standard exception.
        // Added import for Node to satisfy the createObjectType call.
        @Override
        public com.google.javascript.jscomp.EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
            // Returning a generic RuntimeException if EvaluatorException is not directly accessible or needed.
            // For now, let's assume a standard RuntimeException is sufficient for test failure.
             return new com.google.javascript.jscomp.EvaluatorException(message, sourceName, line, lineSource, lineOffset);
        }
    }

    @Test
    public void testIsSubtypeWithUnknownType() {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(unknownType.isSubtype(stringType));
    }

    @Test
    public void testIsSubtypeWithAllType() {
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(stringType.isSubtype(allType));
    }

    @Test
    public void testIsSubtypeWithEquivalentTypes() {
        JSType stringType1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        // To ensure we are testing with potentially different instances that should be equivalent
        JSType stringType2 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(stringType1.isSubtype(stringType2));
    }

    @Test
    public void testIsSubtypeWithUnionTypeRight() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        UnionType unionType = (UnionType) registry.createUnionType(stringType, numberType);
        assertTrue(stringType.isSubtype(unionType));
    }

    @Test
    public void testIsSubtypeWithUnionTypeLeft() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        UnionType unionType = (UnionType) registry.createUnionType(stringType, numberType);
        // For unionType to be subtype of stringType, BOTH stringType and numberType must be subtypes of stringType.
        // This is only true if numberType is also a subtype of stringType, which it isn't.
        assertFalse(unionType.isSubtype(stringType));
    }

    @Test
    public void testGetLeastSupertypeWithUnionType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unionType = registry.createUnionType(stringType, numberType);
        JSType anotherStringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType leastSupertype = unionType.getLeastSupertype(anotherStringType);
        // The least supertype of a union (string, number) and string is (string, number).
        assertEquals(unionType, leastSupertype);
    }

    @Test
    public void testGetLeastSupertypeWithNonNullTypes() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leastSupertype = stringType.getLeastSupertype(numberType);
        assertTrue(leastSupertype.isUnionType());
        UnionType union = (UnionType) leastSupertype;
        // The least supertype of string and number is a union of string and number.
        assertTrue(union.contains(stringType));
        assertTrue(union.contains(numberType));
    }

    @Test
    public void testGetGreatestSubtypeWithUnionType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        UnionType unionType = (UnionType) registry.createUnionType(stringType, numberType);
        JSType greatestSubtype = unionType.getGreatestSubtype(stringType);
        // The greatest subtype of (string, number) and string is string.
        assertEquals(stringType, greatestSubtype);
    }

    @Test
    public void testGetGreatestSubtypeWithSubtype() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType greatestSubtype = stringType.getGreatestSubtype(allType);
        // The greatest subtype of string and AllType is string.
        assertEquals(stringType, greatestSubtype);
    }

    @Test
    public void testGetGreatestSubtypeWithUnknown() {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType greatestSubtype = unknownType.getGreatestSubtype(stringType);
        // The greatest subtype of Unknown and string is Unknown.
        assertEquals(unknownType, greatestSubtype);
    }

    @Test
    public void testGetGreatestSubtypeWithEqualObjects() {
        JSType stringType1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType stringType2 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType greatestSubtype = stringType1.getGreatestSubtype(stringType2);
        // The greatest subtype of string and string is string.
        assertEquals(stringType1, greatestSubtype);
    }


    @Test
    public void testMatchesStringContextTrue() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(stringType.matchesStringContext());
    }

    @Test
    public void testMatchesStringContextFalseForNumber() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(numberType.matchesStringContext());
    }

    @Test
    public void testMatchesNumberContextTrue() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(numberType.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContextFalseForString() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertFalse(stringType.matchesNumberContext());
    }

    @Test
    public void testMatchesObjectContextTrue() {
        // Use a concrete ObjectType or a named type that represents an object.
        // For simplicity, let's use a known native object type.
        ObjectType objectType = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertTrue(objectType.matchesObjectContext());
    }

    @Test
    public void testMatchesObjectContextFalseForNull() {
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        assertFalse(nullType.matchesObjectContext());
    }

    @Test
    public void testCanAssignToTrue() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        // stringType can be assigned to AllType.
        assertTrue(stringType.canAssignTo(allType));
    }

    @Test
    public void testCanAssignToFalse() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // stringType cannot be assigned to numberType.
        assertFalse(stringType.canAssignTo(numberType));
    }

    @Test
    public void testAutoboxesToString() {
        JSType stringPrimitive = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType stringObject = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        // String primitive autoboxes to String object.
        assertEquals(stringObject, stringPrimitive.autoboxesTo());
    }

    @Test
    public void testAutoboxesToNullIfNoBoxing() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        // Object type does not autobox to a different type.
        assertNull(objectType.autoboxesTo());
    }

    @Test
    public void testUnboxesToNumber() {
        JSType numberObject = registry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE);
        JSType numberPrimitive = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // Number object unboxes to Number primitive.
        assertEquals(numberPrimitive, numberObject.unboxesTo());
    }

    @Test
    public void testUnboxesToNullIfNoUnboxing() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        // String type does not unbox to a different type.
        assertNull(stringType.unboxesTo());
    }

    @Test
    public void testToObjectType() {
        // Need a concrete ObjectType. Using a native one.
        ObjectType objectType = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertEquals(objectType, objectType.toObjectType());
    }

    @Test
    public void testToObjectTypeReturnsNullForPrimitive() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        // String primitive is not an ObjectType.
        assertNull(stringType.toObjectType());
    }

    @Test
    public void testDereferencePrimitive() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ObjectType dereferenced = stringType.dereference();
        assertNotNull(dereferenced);
        // Dereferencing a string primitive results in the string object type.
        assertEquals("String", dereferenced.getReferenceName());
    }

    @Test
    public void testDereferenceObject() {
        ObjectType objectType = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        // Dereferencing an object type that is already an object should return itself.
        assertEquals(objectType, objectType.dereference());
    }

    @Test
    public void testCanTestForEqualityWith() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // The default implementation relies on isSubtype, which is not sufficient for general equality.
        // The testForEquality method itself handles more cases.
        // For types that are not strictly subtypes of each other, the default behavior
        // might be to assume UNKNOWN or a more complex check.
        // Let's check the behavior of `testForEquality` directly.
        assertTrue(stringType.canTestForEqualityWith(numberType)); // This means testForEquality(numberType) returns UNKNOWN.
    }

    @Test
    public void testTestForEqualityBooleanTrue() {
        JSType booleanType1 = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType booleanType2 = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        assertEquals(TernaryValue.TRUE, booleanType1.testForEquality(booleanType2));
    }

    @Test
    public void testTestForEqualityBooleanFalse() {
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertEquals(TernaryValue.FALSE, booleanType.testForEquality(stringType));
    }

    @Test
    public void testTestForEqualityBooleanUnknown() {
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertEquals(TernaryValue.UNKNOWN, booleanType.testForEquality(unknownType));
    }

    @Test
    public void testTestForEqualityUnionType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        UnionType unionType = (UnionType) registry.createUnionType(stringType, numberType);
        // stringType compared to (string | number) is UNKNOWN.
        assertEquals(TernaryValue.UNKNOWN, stringType.testForEquality(unionType));
    }

    @Test
    public void testCanTestForShallowEqualityWithSubtype() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        // stringType is a subtype of allType.
        assertTrue(stringType.canTestForShallowEqualityWith(allType));
    }

    @Test
    public void testCanTestForShallowEqualityWithUnrelated() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // stringType and numberType are not subtypes of each other.
        assertFalse(stringType.canTestForShallowEqualityWith(numberType));
    }

    @Test
    public void testIsNullableTrue() {
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        assertTrue(nullType.isNullable());
    }

    @Test
    public void testIsNullableFalse() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertFalse(stringType.isNullable());
    }

    @Test
    public void testGetTypesUnderEqualityWhenEquivalent() {
        JSType stringType1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType stringType2 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType.TypePair pair = stringType1.getTypesUnderEquality(stringType2);
        assertEquals(stringType1, pair.typeA);
        assertEquals(stringType2, pair.typeB);
    }

    @Test
    public void testGetTypesUnderEqualityWhenIncompatible() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType.TypePair pair = stringType.getTypesUnderEquality(numberType);
        // Incompatible types under equality result in null.
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderInequalityWhenEquivalent() {
        JSType stringType1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType stringType2 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        JSType.TypePair pair = stringType1.getTypesUnderInequality(stringType2);
        // If types are equivalent, inequality always fails, resulting in NO_TYPE.
        assertEquals(noType, pair.typeA);
        assertEquals(noType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderInequalityWhenIncompatible() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType.TypePair pair = stringType.getTypesUnderInequality(numberType);
        // If types are incompatible, inequality is possible, so they remain themselves.
        assertEquals(stringType, pair.typeA);
        assertEquals(numberType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowEquality() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // The common type between string and number (in terms of shallow equality) is Object.
        // This method seems to return the greatest subtype, which for unrelated types is often ALL_TYPE.
        // Let's check the definition of getGreatestSubtype, it can return NO_TYPE or ALL_TYPE.
        // The test case from the original prompt used ALL_TYPE.
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType.TypePair pair = stringType.getTypesUnderShallowEquality(numberType);
        assertEquals(allType, pair.typeA);
        assertEquals(allType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequalityNull() {
        JSType nullType1 = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType nullType2 = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType.TypePair pair = nullType1.getTypesUnderShallowInequality(nullType2);
        // If two null types are compared for shallow inequality, the result is null.
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequalityVoid() {
        JSType voidType1 = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType voidType2 = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType.TypePair pair = voidType1.getTypesUnderShallowInequality(voidType2);
        // If two void types are compared for shallow inequality, the result is null.
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequalityDifferentTypes() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType.TypePair pair = stringType.getTypesUnderShallowInequality(numberType);
        // If types are different and not null/void, they remain themselves for shallow inequality.
        assertEquals(stringType, pair.typeA);
        assertEquals(numberType, pair.typeB);
    }

    @Test
    public void testRestrictByNotNullOrUndefinedForNonNullType() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertEquals(stringType, stringType.restrictByNotNullOrUndefined());
    }

    @Test
    public void testRestrictByNotNullOrUndefinedForUnionType() {
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        UnionType unionWithNullAndVoid = (UnionType) registry.createUnionType(nullType, voidType, stringType);
        JSType restrictedUnion = unionWithNullAndVoid.restrictByNotNullOrUndefined();
        assertTrue(restrictedUnion.isUnionType());
        UnionType restricted = (UnionType) restrictedUnion;
        assertFalse(restricted.contains(nullType));
        assertFalse(restricted.contains(voidType));
        assertTrue(restricted.contains(stringType));
    }

    @Test
    public void testCompareAlphabeticalOrder() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Comparator<JSType> alphaComparator = JSType.ALPHA;
        // "string" comes after "number" alphabetically.
        assertTrue(alphaComparator.compare(stringType, numberType) > 0);
        assertTrue(alphaComparator.compare(numberType, stringType) < 0);
    }

    @Test
    public void testCompareSameTypesAlphabeticalOrder() {
        JSType stringType1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType stringType2 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Comparator<JSType> alphaComparator = JSType.ALPHA;
        assertEquals(0, alphaComparator.compare(stringType1, stringType2));
    }
}
```