package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.util.Map;
import java.util.Set;

public class PrototypeObjectTypeTest {
    @Test
    public void testNamedObjectReference() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null);
        assertEquals("Widget", type.getReferenceName());
        assertTrue(type.hasReferenceName());
    }

    @Test
    public void testAnonymousObjectReference() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null);
        assertNull(type.getReferenceName());
        assertFalse(type.hasReferenceName());
    }

    @Test
    public void testNativeTypeHasNoImplicitPrototype() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Native", null, true);
        assertNull(type.getImplicitPrototype());
        assertTrue(type.isNativeObjectType());
    }

    @Test
    public void testGetConstructorIsNull() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null);
        assertNull(type.getConstructor());
    }

    @Test
    public void testObjectContextAlwaysMatches() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null);
        assertTrue(type.matchesObjectContext());
    }

    @Test
    public void testNonRegexpCannotBeCalled() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null);
        assertFalse(type.canBeCalled());
    }

    @Test
    public void testEmptyObjectHasNoOwnProperties() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertEquals(0, type.getPropertiesCount());
        assertTrue(type.getOwnPropertyNames().isEmpty());
    }

    @Test
    public void testDefineAndReadInferredProperty() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertTrue(type.defineInferredProperty("x", null, null));
        assertTrue(type.hasProperty("x"));
        assertTrue(type.hasOwnProperty("x"));
        assertTrue(type.isPropertyTypeInferred("x"));
        assertFalse(type.isPropertyTypeDeclared("x"));
        assertEquals(1, type.getPropertiesCount());
    }

    @Test
    public void testDefineDeclaredPropertyCannotBeRedefined() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertTrue(type.defineDeclaredProperty("x", null, null));
        assertFalse(type.defineInferredProperty("x", null, null));
        assertTrue(type.isPropertyTypeDeclared("x"));
        assertEquals(1, type.getPropertiesCount());
    }

    @Test
    public void testRemoveOwnProperty() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        type.defineInferredProperty("x", null, null);
        assertTrue(type.removeProperty("x"));
        assertFalse(type.removeProperty("x"));
        assertFalse(type.hasOwnProperty("x"));
        assertEquals(0, type.getPropertiesCount());
    }

    @Test
    public void testMissingPropertyHasNoSlotOrNode() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getSlot("missing"));
        assertNull(type.getPropertyNode("missing"));
        assertFalse(type.hasProperty("missing"));
    }

    @Test
    public void testJSDocInfoCreatesInferredProperty() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        JSDocInfo info = new JSDocInfo();
        type.setPropertyJSDocInfo("documented", info);
        assertTrue(type.hasOwnProperty("documented"));
        assertSame(info, type.getOwnPropertyJSDocInfo("documented"));
        assertTrue(type.isPropertyTypeInferred("documented"));
    }

    @Test
    public void testNullJSDocInfoDoesNotCreateProperty() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        type.setPropertyJSDocInfo("documented", null);
        assertFalse(type.hasOwnProperty("documented"));
        assertEquals(0, type.getPropertiesCount());
    }

    @Test
    public void testNoOwnerFunctionForPlainObject() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getOwnerFunction());
        assertTrue(!type.getCtorImplementedInterfaces().iterator().hasNext());
        assertTrue(!type.getCtorExtendedInterfaces().iterator().hasNext());
    }

    @Test
    public void testNativeObjectNotNumberOrStringContext() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Native", null, true);
        assertFalse(type.matchesNumberContext());
        assertFalse(type.matchesStringContext());
    }

    @Test
    public void testUnboxesToUsesSuperclassDefault() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.unboxesTo());
    }

    @Test
    public void testOwnPropertyNamesReflectRemoval() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        type.defineInferredProperty("first", null, null);
        type.defineInferredProperty("last", null, null);
        Set<String> names = type.getOwnPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("first"));
        assertTrue(names.contains("last"));
        type.removeProperty("first");
        assertEquals(Sets.newHashSet("last"), type.getOwnPropertyNames());
    }

    @Test
    public void testNativeTypeHasNoOwnPropertyAfterRemovalAttempt() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Native", null, true);
        assertFalse(type.removeProperty("absent"));
        assertEquals(0, type.getPropertiesCount());
    }

    @Test
    public void testMissingPropertyTypeIsUnknown() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Native", null, true);
        JSType missing = type.getPropertyType("missing");
        assertSame(missing, type.getPropertyType("anotherMissing"));
    }

    @Test
    public void testDefinedPropertyTypeIsReturned() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Native", null, true);
        JSType unknown = type.getPropertyType("x");
        type.defineInferredProperty("x", unknown, null);
        assertSame(unknown, type.getPropertyType("x"));
    }

    @Test
    public void testLocalPropertyExternsDefaultsFalse() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Native", null, true);
        type.defineInferredProperty("x", null, null);
        assertFalse(type.isPropertyInExterns("x"));
    }

    @Test
    public void testSubtypeOfSelf() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Native", null, true);
        assertTrue(type.isSubtype(type));
    }

    @Test
    public void testNativeObjectHasNoCachedValuesInitially() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Native", null, true);
        assertFalse(type.hasCachedValues());
    }

    @Test
    public void testMatchConstraintOnNamedObjectDoesNothing() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        type.matchConstraint(type);
        assertEquals(0, type.getPropertiesCount());
    }
}
