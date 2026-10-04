package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Comparator;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.testing.EmptyScope;

public class JSTypeTest {
    @Test
    public void testDisplayNameDefaultsToNull() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(type.getDisplayName());
        assertFalse(type.hasDisplayName());
    }

    @Test
    public void testNativeTypeEquivalentToItself() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.isEquivalentTo(type));
        assertTrue(JSType.isEquivalent(type, type));
    }

    @Test
    public void testEquivalentNullTypes() throws Exception {
        assertTrue(JSType.isEquivalent(null, null));
        assertFalse(JSType.isEquivalent(null,
                new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testEqualsRejectsNonType() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(type.equals("number"));
        assertTrue(type.equals(type));
    }

    @Test
    public void testMatchesNumberContexts() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertEquals(type.matchesNumberContext(), type.matchesInt32Context());
        assertEquals(type.matchesNumberContext(), type.matchesUint32Context());
    }

    @Test
    public void testSubtypeAssignment() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertTrue(number.canAssignTo(unknown));
        assertFalse(unknown.canAssignTo(number));
    }

    @Test
    public void testToObjectTypeForNativeObject() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType object = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertSame(object, object.toObjectType());
    }

    @Test
    public void testToObjectTypeForNumber() throws Exception {
        JSType number = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(number.toObjectType());
    }

    @Test
    public void testCanTestEqualityWithUnknown() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertTrue(number.canTestForEqualityWith(unknown));
    }

    @Test
    public void testShallowEqualityForSameType() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.canTestForShallowEqualityWith(type));
    }

    @Test
    public void testLeastSupertypeWithSelf() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertSame(type, type.getLeastSupertype(type));
    }

    @Test
    public void testGreatestSubtypeWithSelf() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertSame(type, type.getGreatestSubtype(type));
    }

    @Test
    public void testRestrictedBooleanOutcomeForNumber() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertSame(type, type.getRestrictedTypeGivenToBooleanOutcome(true));
    }

    @Test
    public void testUnknownSubtypeRules() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertTrue(number.isSubtype(unknown));
    }

    @Test
    public void testNumberIsNotString() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertFalse(number.isSubtype(string));
    }

    @Test
    public void testIdentityHashCodeStable() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertEquals(System.identityHashCode(type), type.hashCode());
    }

    @Test
    public void testPropertyLookupOnPrimitive() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(type.findPropertyType("missing"));
    }

    @Test
    public void testAutoboxAndUnboxDefaults() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(type.autoboxesTo());
        assertNull(type.unboxesTo());
    }

    @Test
    public void testDefaultContextPredicates() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(type.matchesStringContext());
        assertFalse(type.matchesObjectContext());
    }

    @Test
    public void testDefaultCallablePredicate() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(type.canBeCalled());
    }

    @Test
    public void testAlphaComparatorOrdersText() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(JSType.ALPHA.compare(number, string) *
                number.toString().compareTo(string.toString()) > 0);
        assertEquals(0, JSType.ALPHA.compare(number, number));
    }

    @Test
    public void testDefaultTypeFlags() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(type.isNoType());
        assertFalse(type.isNoResolvedType());
        assertFalse(type.isNoObjectType());
        assertFalse(type.isNumberObjectType());
        assertFalse(type.isNumberValueType());
        assertFalse(type.isFunctionPrototypeType());
    }

    @Test
    public void testRemainingDefaultTypeFlags() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(type.isStringObjectType());
        assertFalse(type.isStringValueType());
        assertFalse(type.isArrayType());
        assertFalse(type.isBooleanObjectType());
        assertFalse(type.isBooleanValueType());
        assertFalse(type.isRegexpType());
        assertFalse(type.isDateType());
    }

    @Test
    public void testNativeNumberStringAndNumberPredicates() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(number.isNumber());
        assertFalse(number.isString());
        assertTrue(string.isString());
        assertFalse(string.isNumber());
    }

    @Test
    public void testDefaultCategorizationAndEmptyFlag() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(type.isNullType());
        assertFalse(type.isVoidType());
        assertFalse(type.isAllType());
        assertFalse(type.isUnknownType());
        assertFalse(type.isCheckedUnknownType());
        assertFalse(type.isUnionType());
        assertFalse(type.isFunctionType());
        assertFalse(type.isEmptyType());
    }

    @Test
    public void testRemainingDefaultCategorization() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(type.isEnumElementType());
        assertFalse(type.isEnumType());
        assertFalse(type.isRecordType());
        assertFalse(type.isTemplateType());
        assertFalse(type.isObject());
        assertFalse(type.isConstructor());
        assertFalse(type.isNominalType());
        assertFalse(type.isInstanceType());
        assertFalse(type.isInterface());
        assertFalse(type.isOrdinaryFunction());
    }

    @Test
    public void testDefaultJSDocAndDereference() throws Exception {
        JSType type = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(type.getJSDocInfo());
        assertNull(type.dereference());
    }

    @Test
    public void testEqualityResultWithUnknown() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertEquals(TernaryValue.UNKNOWN, number.testForEquality(unknown));
    }

    @Test
    public void testNumberNotNullable() throws Exception {
        JSType number = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(number.isNullable());
    }
}
