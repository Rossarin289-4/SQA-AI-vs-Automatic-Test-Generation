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
    public void testReferenceNameIsClassName() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertEquals("Widget", type.getReferenceName());
    }

    @Test
    public void testNamedTypeHasReferenceName() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertTrue(type.hasReferenceName());
    }

    @Test
    public void testAnonymousTypeHasNoReferenceName() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
        assertNull(type.getReferenceName());
    }

    @Test
    public void testAnonymousTypeReportsNoReferenceName() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
        assertFalse(type.hasReferenceName());
    }

    @Test
    public void testNativeFlagIsRetained() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertTrue(type.isNativeObjectType());
    }

    @Test
    public void testNonNativeFlagIsRetained() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertTrue(type.isNativeObjectType());
    }

    @Test
    public void testNullPrototypeRemainsNullForNativeType() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getImplicitPrototype());
    }

    @Test
    public void testNewTypeHasNoConstructor() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getConstructor());
    }

    @Test
    public void testNewTypeHasNoOwnerFunction() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getOwnerFunction());
    }

    @Test
    public void testNewTypeHasNoOwnProperties() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertEquals(0, type.getPropertiesCount());
    }

    @Test
    public void testNewTypeHasEmptyOwnPropertyNames() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertTrue(type.getOwnPropertyNames().isEmpty());
    }

    @Test
    public void testMissingOwnSlotIsNull() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getSlot("missing"));
    }

    @Test
    public void testMissingPropertyIsNotOwn() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertFalse(type.hasOwnProperty("missing"));
    }

    @Test
    public void testRemovingMissingPropertyReturnsFalse() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertFalse(type.removeProperty("missing"));
    }

    @Test
    public void testMissingPropertyNodeIsNull() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getPropertyNode("missing"));
    }

    @Test
    public void testMissingOwnPropertyDocInfoIsNull() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getOwnPropertyJSDocInfo("missing"));
    }

    @Test
    public void testObjectMatchesObjectContext() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertTrue(type.matchesObjectContext());
    }

    @Test
    public void testOrdinaryObjectCannotBeCalled() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertFalse(type.canBeCalled());
    }

    @Test
    public void testPrettyPrintFlagCanBeEnabled() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        type.setPrettyPrint(true);
        assertTrue(type.isPrettyPrint());
    }

    @Test
    public void testPrettyPrintFlagCanBeDisabled() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        type.setPrettyPrint(true);
        type.setPrettyPrint(false);
        assertFalse(type.isPrettyPrint());
    }

    @Test
    public void testMissingPropertyIsNotPresent() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertFalse(type.hasProperty("missing"));
    }

    @Test
    public void testMissingPropertyIsNeitherDeclaredNorInferred() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertFalse(type.isPropertyTypeDeclared("missing"));
        assertFalse(type.isPropertyTypeInferred("missing"));
    }

    @Test
    public void testMissingPropertyTypeIsNotCheckedWithoutRegistry() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.getSlot("missing"));
    }

    @Test
    public void testMissingPropertyIsNotExtern() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertFalse(type.isPropertyInExterns("missing"));
    }

    @Test
    public void testNullPropertyDocInfoDoesNotCreateProperty() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        type.setPropertyJSDocInfo("tag", null);
        assertFalse(type.hasOwnProperty("tag"));
        assertEquals(0, type.getPropertiesCount());
    }

    @Test
    public void testOrdinaryAnonymousObjectDoesNotMatchNumberContext() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
        assertFalse(type.matchesNumberContext());
    }

    @Test
    public void testOrdinaryAnonymousObjectDoesNotMatchStringContext() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
        assertFalse(type.matchesStringContext());
    }

    @Test
    public void testOrdinaryObjectUnboxesToNullWithoutRegistry() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertNull(type.unboxesTo());
    }

    @Test
    public void testSubtypeOfItself() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertTrue(type.isSubtype(type));
    }

    @Test
    public void testNewTypeHasNoCachedValues() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertFalse(type.hasCachedValues());
    }

    @Test
    public void testNonFunctionPrototypeHasNoImplementedOrExtendedInterfaces() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null, true);
        assertFalse(type.getCtorImplementedInterfaces().iterator().hasNext());
        assertFalse(type.getCtorExtendedInterfaces().iterator().hasNext());
    }
}
