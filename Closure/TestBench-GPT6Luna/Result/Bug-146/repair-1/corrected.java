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

public class JSTypeTest {
    @Test
    public void testNativeTypesAndPredicates() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType no = registry.getNativeType(JSTypeNative.NO_TYPE);

        assertTrue(number.isNumber());
        assertTrue(number.matchesNumberContext());
        assertTrue(number.matchesInt32Context());
        assertTrue(number.matchesUint32Context());
        assertFalse(number.isString());
        assertTrue(string.isString());
        assertFalse(string.matchesNumberContext());
        assertTrue(no.isEmptyType());
        assertTrue(all.isAllType());
    }

    @Test
    public void testReferenceEquivalence() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType sameNumber = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);

        assertTrue(number.isEquivalentTo(sameNumber));
        assertTrue(JSType.isEquivalent(number, sameNumber));
        assertFalse(number.isEquivalentTo(string));
        assertFalse(JSType.isEquivalent(number, null));
        assertTrue(JSType.isEquivalent(null, null));
        assertTrue(number.equals(sameNumber));
        assertFalse(number.equals("number"));
        assertEquals(number.hashCode(), sameNumber.hashCode());
    }

    @Test
    public void testStringAndNumberNativeEquivalence() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertTrue(string.matchesStringContext());
        assertFalse(string.matchesNumberContext());
        assertTrue(number.matchesNumberContext());
        assertFalse(number.matchesStringContext());
    }

    @Test
    public void testTypeOrdering() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);

        assertTrue(JSType.ALPHA.compare(number, string) < 0);
        assertTrue(JSType.ALPHA.compare(string, number) > 0);
        assertEquals(0, JSType.ALPHA.compare(number, number));
    }

    @Test
    public void testInt32AndUint32Contexts() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);

        assertEquals(number.matchesNumberContext(), number.matchesInt32Context());
        assertEquals(number.matchesNumberContext(), number.matchesUint32Context());
        assertFalse(string.matchesInt32Context());
        assertFalse(string.matchesUint32Context());
    }

    @Test
    public void testBasePropertyLookup() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertNull(number.findPropertyType("missing"));
    }

    @Test
    public void testBaseCallAndBoxingDefaults() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertFalse(number.canBeCalled());
        assertNull(number.autoboxesTo());
        assertNull(number.unboxesTo());
        assertNull(number.toObjectType());
    }

    @Test
    public void testAssignmentAndSubtype() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);

        assertTrue(number.canAssignTo(all));
        assertFalse(number.canAssignTo(string));
        assertTrue(number.canTestForShallowEqualityWith(all));
        assertFalse(number.canTestForShallowEqualityWith(string));
    }

    @Test
    public void testGreatestSubtypeWithEndTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType no = registry.getNativeType(JSTypeNative.NO_TYPE);

        assertSame(number, number.getGreatestSubtype(all));
        assertSame(no, number.getGreatestSubtype(no));
    }

    @Test
    public void testGreatestSubtypeOfIncompatiblePrimitives() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType result = number.getGreatestSubtype(string);

        assertTrue(result.isNoType());
    }

    @Test
    public void testLeastSupertypeContainsBothOperands() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType result = number.getLeastSupertype(string);

        assertTrue(result.isSubtype(result));
        assertTrue(number.isSubtype(result));
        assertTrue(string.isSubtype(result));
    }

    @Test
    public void testRestrictedBooleanOutcomeForNumber() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertSame(number, number.getRestrictedTypeGivenToBooleanOutcome(true));
        assertSame(number, number.getRestrictedTypeGivenToBooleanOutcome(false));
    }

    @Test
    public void testNullAndVoidBooleanOutcomes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        assertSame(nullType,
                nullType.getRestrictedTypeGivenToBooleanOutcome(false));
        assertTrue(nullType.getRestrictedTypeGivenToBooleanOutcome(true).isNoType());
        assertSame(voidType,
                voidType.getRestrictedTypeGivenToBooleanOutcome(false));
        assertTrue(voidType.getRestrictedTypeGivenToBooleanOutcome(true).isNoType());
    }

    @Test
    public void testEqualityWithAllTypeIsUnknown() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);

        assertEquals(TernaryValue.UNKNOWN, number.testForEquality(all));
        assertTrue(number.canTestForEqualityWith(all));
    }

    @Test
    public void testEqualityTypesUnderKnownComparison() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType.TypePair pair = number.getTypesUnderEquality(all);

        assertSame(number, pair.typeA);
        assertSame(all, pair.typeB);
    }

    @Test
    public void testInequalityTypesUnderKnownComparison() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType.TypePair pair = number.getTypesUnderInequality(all);

        assertTrue(pair.typeA.isNoType());
        assertTrue(pair.typeB.isNoType());
    }

    @Test
    public void testShallowEqualityAndInequalityPairs() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType.TypePair equal = number.getTypesUnderShallowEquality(all);
        JSType.TypePair unequal = number.getTypesUnderShallowInequality(all);

        assertSame(number, equal.typeA);
        assertSame(number, equal.typeB);
        assertSame(number, unequal.typeA);
        assertSame(all, unequal.typeB);
    }

    @Test
    public void testResolvedStateCanBeCleared() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertFalse(number.isResolved());
        number.clearResolved();
        assertFalse(number.isResolved());
    }

    @Test
    public void testDebugHashCodeFormat() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertEquals("{" + number.hashCode() + "}",
                number.toDebugHashCodeString());
    }

    @Test
    public void testNoObjectTypePredicateAndEmptyType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType noObject = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);

        assertTrue(noObject.isNoObjectType());
        assertTrue(noObject.isEmptyType());
    }

    @Test
    public void testNullAndVoidTypePredicates() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        assertTrue(nullType.isNullType());
        assertTrue(nullType.isNullable());
        assertTrue(voidType.isVoidType());
        assertTrue(voidType.isNullable());
    }

    @Test
    public void testUnknownAndCheckedUnknownPredicates() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        assertTrue(unknown.isUnknownType());
        assertFalse(unknown.isCheckedUnknownType());
        assertTrue(unknown.isSubtype(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testNativeObjectHasObjectShape() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType object = registry.getNativeType(JSTypeNative.OBJECT_TYPE);

        assertTrue(object.isObject());
        assertNotNull(object.toObjectType());
        assertSame(object.toObjectType(), object.dereference());
    }

    @Test
    public void testNumberIsNotObjectTypeOrFunction() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertFalse(number.isNumberObjectType());
        assertFalse(number.isFunctionType());
        assertFalse(number.isConstructor());
        assertFalse(number.isInterface());
        assertFalse(number.isOrdinaryFunction());
    }

    @Test
    public void testNumberIsNotStringBooleanArrayOrDate() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertFalse(number.isStringObjectType());
        assertFalse(number.isStringValueType());
        assertFalse(number.isBooleanObjectType());
        assertFalse(number.isBooleanValueType());
        assertFalse(number.isArrayType());
        assertFalse(number.isDateType());
    }

    @Test
    public void testNumberIsNotRegexpEnumRecordOrTemplate() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertFalse(number.isRegexpType());
        assertFalse(number.isEnumElementType());
        assertFalse(number.isEnumType());
        assertFalse(number.isRecordType());
        assertFalse(number.isTemplateType());
        assertFalse(number.isInstanceType());
        assertFalse(number.isNominalType());
        assertFalse(number.isUnionType());
    }

    @Test
    public void testNativeObjectBooleanOutcomeRestriction() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType object = registry.getNativeType(JSTypeNative.OBJECT_TYPE);

        assertSame(object, object.getRestrictedTypeGivenToBooleanOutcome(true));
        assertTrue(object.getRestrictedTypeGivenToBooleanOutcome(false).isNoType());
    }

    @Test
    public void testNullableAndNonNullableNativeTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);

        assertFalse(number.isNullable());
        assertTrue(nullType.isNullable());
    }
}
