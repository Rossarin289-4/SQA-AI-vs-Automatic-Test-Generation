package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.testing.EmptyScope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.EvaluatorException; // Added import for EvaluatorException
import com.google.javascript.rhino.jstype.BooleanLiteralSet; // Added import

public class JSTypeTest {

    // Mock ErrorReporter and JSTypeRegistry for testing purposes
    private ErrorReporter errorReporter = new ErrorReporter() {
        @Override
        public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {}
        @Override
        public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {}
        @Override
        public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
            return new EvaluatorException(message);
        }
    };

    private JSTypeRegistry registry = new JSTypeRegistry(errorReporter);

    // Helper to create concrete JSTypes for tests where mocks are not sufficient
    private JSType createNumberType() { return registry.getNativeType(JSTypeNative.NUMBER_TYPE); }
    private JSType createStringType() { return registry.getNativeType(JSTypeNative.STRING_TYPE); }
    private JSType createObjectType() { return registry.getNativeType(JSTypeNative.OBJECT_TYPE); }
    private JSType createNullType() { return registry.getNativeType(JSTypeNative.NULL_TYPE); }
    private JSType createVoidType() { return registry.getNativeType(JSTypeNative.VOID_TYPE); }
    private JSType createUnknownType() { return registry.getNativeType(JSTypeNative.UNKNOWN_TYPE); }
    private JSType createAllType() { return registry.getNativeType(JSTypeNative.ALL_TYPE); }
    private JSType createNoType() { return registry.getNativeType(JSTypeNative.NO_TYPE); }
    private JSType createNoObjectType() { return registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE); }
    private JSType createNoResolvedType() { return registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE); }
    private JSType createNumberObjectType() { return registry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE); }
    private JSType createStringObjectType() { return registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE); }
    private JSType createBooleanObjectType() { return registry.getNativeType(JSTypeNative.BOOLEAN_OBJECT_TYPE); }
    private JSType createBooleanValueType() { return registry.getNativeType(JSTypeNative.BOOLEAN_TYPE); }
    private JSType createFunctionType() { return registry.createFunctionType(createVoidType()); }

    @Test
    public void testMatchesInt32ContextForNumber() throws Exception {
        assertTrue(createNumberType().matchesInt32Context());
    }

    @Test
    public void testMatchesUint32ContextForNumber() throws Exception {
        assertTrue(createNumberType().matchesUint32Context());
    }

    @Test
    public void testMatchesNumberContextForNumber() throws Exception {
        assertTrue(createNumberType().matchesNumberContext());
    }

    @Test
    public void testMatchesStringContextForString() throws Exception {
        assertTrue(createStringType().matchesStringContext());
    }

    @Test
    public void testMatchesObjectContextForObject() throws Exception {
        assertTrue(createObjectType().matchesObjectContext());
    }

    @Test
    public void testFindPropertyTypeOnObject() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType();
        JSType stringType = createStringType();
        objectType.defineInferredProperty("testProp", stringType, false, null);
        assertEquals(stringType, objectType.findPropertyType("testProp"));
    }

    @Test
    public void testFindPropertyTypeOnUnknownType() throws Exception {
        // UnknownType does not have properties by definition.
        assertNull(createUnknownType().findPropertyType("anyProp"));
    }

    @Test
    public void testCanBeCalledForFunctionType() throws Exception {
        assertTrue(createFunctionType().canBeCalled());
    }

    @Test
    public void testCanBeCalledForObjectType() throws Exception {
        assertFalse(createObjectType().canBeCalled());
    }

    @Test
    public void testCanAssignToWhenSubtype() throws Exception {
        JSType numberType = createNumberType();
        JSType objectType = createObjectType();
        assertTrue(numberType.canAssignTo(objectType));
    }

    @Test
    public void testCanAssignToWhenNotSubtype() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();
        assertFalse(stringType.canAssignTo(numberType));
    }

    @Test
    public void testAutoboxesToForNumber() throws Exception {
        assertEquals(createNumberObjectType(), createNumberType().autoboxesTo());
    }

    @Test
    public void testUnboxesToForStringObject() throws Exception {
        assertEquals(createStringType(), createStringObjectType().unboxesTo());
    }

    @Test
    public void testToObjectTypeWhenIsObjectType() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType();
        assertSame(objectType, objectType.toObjectType());
    }

    @Test
    public void testToObjectTypeWhenNotObjectType() throws Exception {
        assertNull(createStringType().toObjectType());
    }

    @Test
    public void testDereferenceForObjectType() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType();
        ObjectType dereferenced = objectType.dereference();
        assertNotNull(dereferenced);
        assertSame(objectType, dereferenced);
    }

    @Test
    public void testDereferenceForPrimitiveType() throws Exception {
        assertEquals(createNumberObjectType(), createNumberType().dereference());
    }

    @Test
    public void testCanTestForEqualityWithUnknown() throws Exception {
        // According to JSType.testForEqualityHelper, if either type is unknown,
        // the result is UNKNOWN. canTestForEqualityWith returns true if testForEquality
        // returns UNKNOWN.
        assertTrue(createUnknownType().canTestForEqualityWith(createAllType()));
    }

    @Test
    public void testCanTestForEqualityWithNonNull() throws Exception {
        // String vs Number comparison results in UNKNOWN in testForEquality.
        // canTestForEqualityWith returns true if testForEquality returns UNKNOWN.
        assertTrue(createStringType().canTestForEqualityWith(createNumberType()));
    }

    @Test
    public void testTestForEqualityWithBoolean() throws Exception {
        // boolean == boolean is true.
        assertEquals(TernaryValue.TRUE, createBooleanValueType().testForEquality(createBooleanValueType()));
    }

    @Test
    public void testTestForEqualityWithDifferentTypes() throws Exception {
        // String vs Number comparison results in UNKNOWN.
        assertEquals(TernaryValue.UNKNOWN, createStringType().testForEquality(createNumberType()));
    }

    @Test
    public void testCanTestForShallowEqualityWithSameType() throws Exception {
        // According to canTestForShallowEqualityWith, thisType.isSubtype(that) || that.isSubtype(this)
        // For same types, this is true.
        assertTrue(createStringType().canTestForShallowEqualityWith(createStringType()));
    }

    @Test
    public void testCanTestForShallowEqualityWithSubtype() throws Exception {
        // number is a subtype of Object, so number.canTestForShallowEqualityWith(Object) is true.
        assertTrue(createNumberType().canTestForShallowEqualityWith(createObjectType()));
    }

    @Test
    public void testIsNullableForNullType() throws Exception {
        assertTrue(createNullType().isNullable());
    }

    @Test
    public void testIsNullableForObjectType() throws Exception {
        assertFalse(createObjectType().isNullable());
    }

    @Test
    public void testGetLeastSupertypeWithSameTypes() throws Exception {
        JSType numberType = createNumberType();
        assertEquals(numberType, numberType.getLeastSupertype(numberType));
    }

    @Test
    public void testGetLeastSupertypeWithDifferentTypes() throws Exception {
        JSType numberType = createNumberType();
        JSType objectType = createObjectType();
        // number | Object = Object
        assertEquals(objectType, numberType.getLeastSupertype(objectType));
    }

    @Test
    public void testGetGreatestSubtypeWithSameTypes() throws Exception {
        JSType numberType = createNumberType();
        assertEquals(numberType, numberType.getGreatestSubtype(numberType));
    }

    @Test
    public void testGetGreatestSubtypeWithDifferentTypes() throws Exception {
        JSType numberType = createNumberType();
        JSType objectType = createObjectType();
        // number & Object = NoObjectType
        assertTrue(numberType.getGreatestSubtype(objectType).isNoObjectType());
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeTrue() throws Exception {
        JSType stringType = createStringType();
        // String can be true or false. Restricting to true should return String itself.
        assertEquals(stringType, stringType.getRestrictedTypeGivenToBooleanOutcome(true));
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeFalse() throws Exception {
        JSType stringType = createStringType();
        // String can be true or false. Restricting to false should return String itself.
        assertEquals(stringType, stringType.getRestrictedTypeGivenToBooleanOutcome(false));
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeForNull() throws Exception {
        JSType nullType = createNullType();
        // Null is always false. Restricting to true should result in NoType.
        assertTrue(nullType.getRestrictedTypeGivenToBooleanOutcome(true).isNoType());
    }

    @Test
    public void testIsSubtypeOfUnknown() throws Exception {
        // All types are subtypes of UnknownType.
        assertTrue(createStringType().isSubtype(createUnknownType()));
    }

    @Test
    public void testIsSubtypeOfSelf() throws Exception {
        assertTrue(createStringType().isSubtype(createStringType()));
    }

    @Test
    public void testIsSubtypeWithUnion() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();
        UnionType unionType = (UnionType) registry.createUnionType(stringType, numberType);
        assertTrue(stringType.isSubtype(unionType));
        assertTrue(numberType.isSubtype(unionType));
    }

    @Test
    public void testIsSubtypeWithUnionWhenNotSubtypeOfAnyAlternate() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();
        ObjectType objectType = (ObjectType) createObjectType();
        UnionType unionType = (UnionType) registry.createUnionType(stringType, numberType);
        // Object is not a subtype of string or number.
        assertFalse(objectType.isSubtype(unionType));
    }

    @Test
    public void testDiffersFromWithDifferentTypes() throws Exception {
        assertTrue(createStringType().differsFrom(createNumberType()));
    }

    @Test
    public void testDiffersFromWithSameTypes() throws Exception {
        assertFalse(createStringType().differsFrom(createStringType()));
    }

    @Test
    public void testDiffersFromWithUnknown() throws Exception {
        // A specific type differs from Unknown.
        assertTrue(createStringType().differsFrom(createUnknownType()));
        assertTrue(createUnknownType().differsFrom(createStringType()));
    }

    @Test
    public void testDiffersFromWithTwoUnknowns() throws Exception {
        // Two Unknown types do not differ.
        assertFalse(createUnknownType().differsFrom(createUnknownType()));
    }

    @Test
    public void testSafeResolveHandlesNullType() throws Exception {
        JSType result = JSType.safeResolve(null, errorReporter, new EmptyScope());
        assertNull(result);
    }

    @Test
    public void testCompareMethod() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();
        Comparator<JSType> alphaComparator = JSType.ALPHA;

        int result = alphaComparator.compare(stringType, numberType);
        assertTrue(result != 0);
        assertTrue(result > 0); // "string" > "number"

        result = alphaComparator.compare(numberType, stringType);
        assertTrue(result < 0); // "number" < "string"

        result = alphaComparator.compare(stringType, stringType);
        assertEquals(0, result);
    }

    @Test
    public void testIsString() throws Exception {
        JSType stringValue = createStringType();
        JSType stringObject = createStringObjectType();
        assertTrue(stringValue.isString());
        assertTrue(stringObject.isString());

        JSType numberType = createNumberType();
        assertFalse(numberType.isString());
    }

    @Test
    public void testIsNumber() throws Exception {
        JSType numberValue = createNumberType();
        JSType numberObject = createNumberObjectType();
        assertTrue(numberValue.isNumber());
        assertTrue(numberObject.isNumber());

        JSType stringType = createStringType();
        assertFalse(stringType.isNumber());
    }

    @Test
    public void testGetTypesUnderShallowEquality() throws Exception {
        JSType stringType = createStringType();
        ObjectType objectType = (ObjectType) createObjectType();

        // The greatest subtype of string and object is NoObjectType.
        JSType.TypePair pair = stringType.getTypesUnderShallowEquality(objectType);
        assertNotNull(pair);
        assertTrue(pair.typeA.isNoObjectType());
        assertTrue(pair.typeB.isNoObjectType());

        // The greatest subtype of string and string is string.
        pair = stringType.getTypesUnderShallowEquality(stringType);
        assertSame(stringType, pair.typeA);
        assertSame(stringType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequality() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();

        // Shallow inequality between string and number is string and number.
        JSType.TypePair pair = stringType.getTypesUnderShallowInequality(numberType);
        assertSame(stringType, pair.typeA);
        assertSame(numberType, pair.typeB);

        JSType nullType = createNullType();
        JSType voidType = createVoidType();

        // Shallow inequality of null with itself results in null, null.
        pair = nullType.getTypesUnderShallowInequality(nullType);
        assertNull(pair.typeA);
        assertNull(pair.typeB);

        // Shallow inequality of void with itself results in null, null.
        pair = voidType.getTypesUnderShallowInequality(voidType);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testRestrictByNotNullOrUndefined() throws Exception {
        JSType stringType = createStringType();
        assertSame(stringType, stringType.restrictByNotNullOrUndefined());

        JSType nullType = createNullType();
        UnionType unionWithNull = (UnionType) registry.createUnionType(stringType, nullType);
        JSType restrictedUnion = unionWithNull.restrictByNotNullOrUndefined();
        assertNotNull(restrictedUnion);
        // After restricting null, only string remains.
        assertTrue(restrictedUnion.isStringValueType());
        assertFalse(restrictedUnion.isNullable());
    }

    @Test
    public void testIsSubtype() throws Exception {
        JSType numberType = createNumberType();
        JSType objectType = createObjectType();
        // number is a subtype of Object.
        assertTrue(numberType.isSubtype(objectType));

        JSType stringType = createStringType();
        // string is not a subtype of number.
        assertFalse(stringType.isSubtype(numberType));
    }

    @Test
    public void testFindPropertyTypeForObjectTypeWithProperty() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType();
        JSType stringType = createStringType();
        objectType.defineInferredProperty("testProp", stringType, false, null);
        assertEquals(stringType, objectType.findPropertyType("testProp"));
    }

    @Test
    public void testFindPropertyTypeForObjectTypeWithoutProperty() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType();
        assertNull(objectType.findPropertyType("nonExistentProp"));
    }

    @Test
    public void testFindPropertyTypeForNullType() throws Exception {
        // Null type cannot have properties.
        assertNull(createNullType().findPropertyType("anyProp"));
    }
}
