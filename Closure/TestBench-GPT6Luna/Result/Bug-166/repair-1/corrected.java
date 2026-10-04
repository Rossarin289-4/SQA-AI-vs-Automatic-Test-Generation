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
    public void testNamedTypeIdentity() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Widget", null);
        assertEquals("Widget", type.getReferenceName());
        assertTrue(type.hasReferenceName());
        assertEquals(null, type.getConstructor());
    }

    @Test
    public void testAnonymousTypeIdentity() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null);
        assertEquals(null, type.getReferenceName());
        assertFalse(type.hasReferenceName());
    }

    @Test
    public void testExplicitPrototype() throws Exception {
        PrototypeObjectType parent = new PrototypeObjectType(null, "Parent", null, true);
        PrototypeObjectType child = new PrototypeObjectType(null, "Child", parent, true);
        assertSame(parent, child.getImplicitPrototype());
    }

    @Test
    public void testNativeFlag() throws Exception {
        PrototypeObjectType nativeType = new PrototypeObjectType(null, "Native", null, true);
        PrototypeObjectType ordinaryType = new PrototypeObjectType(null, "Ordinary", null, false);
        assertTrue(nativeType.isNativeObjectType());
        assertFalse(ordinaryType.isNativeObjectType());
    }

    @Test
    public void testOwnPropertyLifecycle() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        JSType valueType = type.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.defineInferredProperty("value", valueType, null));
        assertTrue(type.hasProperty("value"));
        assertTrue(type.hasOwnProperty("value"));
        assertEquals(valueType, type.getPropertyType("value"));
        assertTrue(type.removeProperty("value"));
        assertFalse(type.hasProperty("value"));
        assertFalse(type.removeProperty("value"));
    }

    @Test
    public void testDuplicateDeclaredPropertyIsRejected() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        JSType valueType = type.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.defineDeclaredProperty("value", valueType, null));
        assertFalse(type.defineInferredProperty("value", valueType, null));
        assertTrue(type.isPropertyTypeDeclared("value"));
    }

    @Test
    public void testOwnPropertyNamesAndCount() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        JSType valueType = type.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.defineInferredProperty("a", valueType, null));
        assertTrue(type.defineInferredProperty("b", valueType, null));
        assertEquals(2, type.getPropertiesCount());
        assertEquals(Sets.newHashSet("a", "b"), type.getOwnPropertyNames());
    }

    @Test
    public void testInheritedPropertyLookup() throws Exception {
        PrototypeObjectType parent = new PrototypeObjectType(null, "Parent", null, true);
        PrototypeObjectType child = new PrototypeObjectType(null, "Child", parent, true);
        JSType valueType = parent.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(parent.defineDeclaredProperty("label", valueType, null));
        assertTrue(child.hasProperty("label"));
        assertFalse(child.hasOwnProperty("label"));
        assertEquals(valueType, child.getPropertyType("label"));
    }

    @Test
    public void testInheritedAndShadowedCount() throws Exception {
        PrototypeObjectType parent = new PrototypeObjectType(null, "Parent", null, true);
        PrototypeObjectType child = new PrototypeObjectType(null, "Child", parent, true);
        JSType valueType = parent.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(parent.defineInferredProperty("shared", valueType, null));
        assertTrue(parent.defineInferredProperty("parentOnly", valueType, null));
        assertTrue(child.defineInferredProperty("shared", valueType, null));
        assertTrue(child.defineInferredProperty("childOnly", valueType, null));
        assertEquals(3, child.getPropertiesCount());
    }

    @Test
    public void testUnknownPropertyHasUnknownNativeType() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        assertFalse(type.hasProperty("missing"));
        assertEquals(type.getNativeType(JSTypeNative.UNKNOWN_TYPE),
            type.getPropertyType("missing"));
    }

    @Test
    public void testDeclaredAndInferredPropertyFlags() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        JSType valueType = type.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.defineDeclaredProperty("fixed", valueType, null));
        assertTrue(type.defineInferredProperty("guess", valueType, null));
        assertTrue(type.isPropertyTypeDeclared("fixed"));
        assertFalse(type.isPropertyTypeInferred("fixed"));
        assertTrue(type.isPropertyTypeInferred("guess"));
        assertFalse(type.isPropertyTypeDeclared("guess"));
    }

    @Test
    public void testAbsentPropertyTypeFlags() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        assertFalse(type.isPropertyTypeDeclared("missing"));
        assertFalse(type.isPropertyTypeInferred("missing"));
    }

    @Test
    public void testPropertyNodeIsReturned() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        Node node = new Node(1);
        assertTrue(type.defineInferredProperty("value",
            type.getNativeType(JSTypeNative.NUMBER_TYPE), node));
        assertSame(node, type.getPropertyNode("value"));
        assertEquals(null, type.getPropertyNode("missing"));
    }

    @Test
    public void testPropertyJSDocInfo() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        JSDocInfo info = new JSDocInfo();
        type.setPropertyJSDocInfo("documented", info);
        assertTrue(type.hasOwnProperty("documented"));
        assertSame(info, type.getOwnPropertyJSDocInfo("documented"));
        assertEquals(null, type.getOwnPropertyJSDocInfo("missing"));
    }

    @Test
    public void testNullPropertyJSDocInfoDoesNotCreateProperty() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        type.setPropertyJSDocInfo("absent", null);
        assertFalse(type.hasOwnProperty("absent"));
        assertEquals(0, type.getPropertiesCount());
    }

    @Test
    public void testExternPropertyFlag() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        JSType valueType = type.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.defineInferredProperty("external", valueType, null));
        assertFalse(type.isPropertyInExterns("external"));
        assertFalse(type.isPropertyInExterns("missing"));
    }

    @Test
    public void testObjectContextAndCallability() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        assertTrue(type.matchesObjectContext());
        assertFalse(type.canBeCalled());
    }

    @Test
    public void testNonNativeObjectContextMatches() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, false);
        assertTrue(type.matchesObjectContext());
        assertFalse(type.canBeCalled());
    }

    @Test
    public void testOwnerFunctionInitiallyAbsent() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        assertEquals(null, type.getOwnerFunction());
        assertEquals(ImmutableList.of(), type.getCtorImplementedInterfaces());
        assertEquals(ImmutableList.of(), type.getCtorExtendedInterfaces());
    }

    @Test
    public void testSubtypeOfSelf() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        assertTrue(type.isSubtype(type));
    }

    @Test
    public void testPrettyPrintEmptyProperties() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
        type.setPrettyPrint(true);
        assertEquals("{}", type.toString());
        assertTrue(type.isPrettyPrint());
    }

    @Test
    public void testPrettyPrintSortsAndDisplaysProperties() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
        type.defineInferredProperty("z", type.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        type.defineInferredProperty("a", type.getNativeType(JSTypeNative.STRING_TYPE), null);
        type.setPrettyPrint(true);
        assertEquals("{a: string, z: number}", type.toString());
    }

    @Test
    public void testPropertyCountAtPrettyPrintLimit() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
        JSType valueType = type.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.defineInferredProperty("a", valueType, null));
        assertTrue(type.defineInferredProperty("b", valueType, null));
        assertTrue(type.defineInferredProperty("c", valueType, null));
        assertTrue(type.defineInferredProperty("d", valueType, null));
        type.setPrettyPrint(true);
        assertEquals("{a: number, b: number, c: number, d: number}", type.toString());
    }

    @Test
    public void testPrettyPrintOverLimitUsesEllipsis() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
        JSType valueType = type.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.defineInferredProperty("a", valueType, null));
        assertTrue(type.defineInferredProperty("b", valueType, null));
        assertTrue(type.defineInferredProperty("c", valueType, null));
        assertTrue(type.defineInferredProperty("d", valueType, null));
        assertTrue(type.defineInferredProperty("e", valueType, null));
        type.setPrettyPrint(true);
        assertEquals("{a: number, b: number, c: number, d: number, ...}", type.toString());
    }

    @Test
    public void testGetSlotOwnAndMissing() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        JSType valueType = type.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(type.defineInferredProperty("value", valueType, null));
        assertSame(type.getOwnSlot("value"), type.getSlot("value"));
        assertNull(type.getSlot("missing"));
    }

    @Test
    public void testGetSlotSearchesImplicitPrototype() throws Exception {
        PrototypeObjectType parent = new PrototypeObjectType(null, "Parent", null, true);
        PrototypeObjectType child = new PrototypeObjectType(null, "Child", parent, true);
        assertTrue(parent.defineInferredProperty(
            "inherited", parent.getNativeType(JSTypeNative.STRING_TYPE), null));
        assertSame(parent.getOwnSlot("inherited"), child.getSlot("inherited"));
    }

    @Test
    public void testNumberContextMatchesNumberObject() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType numberObject =
            registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
        assertTrue(numberObject.matchesNumberContext());
    }

    @Test
    public void testStringContextMatchesStringObject() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType stringObject =
            registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
        assertTrue(stringObject.matchesStringContext());
    }

    @Test
    public void testUnboxesNumberObject() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType numberObject =
            registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            numberObject.unboxesTo());
    }

    @Test
    public void testUnboxesStringObject() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType stringObject =
            registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
        assertSame(registry.getNativeType(JSTypeNative.STRING_TYPE),
            stringObject.unboxesTo());
    }

    @Test
    public void testHasCachedValuesInitially() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        assertFalse(type.hasCachedValues());
    }

    @Test
    public void testMatchConstraintDoesNotAddPropertiesToNamedType() throws Exception {
        PrototypeObjectType type = new PrototypeObjectType(null, "Box", null, true);
        type.matchConstraint(null);
        assertEquals(0, type.getPropertiesCount());
    }
}
