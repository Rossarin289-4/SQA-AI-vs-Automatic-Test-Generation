package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class TypedScopeCreatorTest {
    @Test
    public void testFunctionTypeMinimumArgumentsDefault() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertEquals(0, type.getMinArguments());
    }

    @Test
    public void testFunctionTypeMaximumArgumentsDefault() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertEquals(0, type.getMaxArguments());
    }

    @Test
    public void testFunctionTypePrototypeIsAvailable() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNotNull(type.getPrototype());
        assertTrue(type.getOwnPropertyNames().contains("prototype"));
    }

    @Test
    public void testFunctionTypeRejectsNullPrototype() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertFalse(type.setPrototype(null));
    }

    @Test
    public void testFunctionTypeCallPropertyIsCreated() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNotNull(type.getPropertyType("call"));
    }

    @Test
    public void testFunctionTypeApplyPropertyIsCreated() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNotNull(type.getPropertyType("apply"));
    }

    @Test
    public void testFunctionTypeHasNoTemplateNameByDefault() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNull(type.getTemplateTypeName());
    }

    @Test
    public void testFunctionTypeIsOrdinaryByDefault() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertTrue(type.isOrdinaryFunction());
        assertFalse(type.isConstructor());
        assertFalse(type.isInterface());
    }

    @Test
    public void testFunctionTypeHasNoInstanceTypeByDefault() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertFalse(type.hasInstanceType());
    }

    @Test
    public void testFunctionTypeOwnNamesInitiallyExcludePrototype() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertFalse(type.getOwnPropertyNames().contains("prototype"));
    }

    @Test
    public void testFunctionTypeHasNoSourceByDefault() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNull(type.getSource());
    }

    @Test
    public void testFunctionTypeSetSourceRoundTrips() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        Node source = new Node(Token.FUNCTION);
        type.setSource(source);
        assertSame(source, type.getSource());
    }

    @Test
    public void testFunctionTypeExtendedInterfacesInitiallyEmpty() throws Exception {
        FunctionType type = new JSTypeRegistry(null).createInterfaceType("I", null);
        assertEquals(0, type.getExtendedInterfacesCount());
        assertFalse(type.getExtendedInterfaces().iterator().hasNext());
    }

    @Test
    public void testFunctionTypeSubtypesInitiallyNull() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNull(type.getSubTypes());
    }

    @Test
    public void testFunctionTypeOwnPropertyNamesInitiallyEmpty() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertTrue(type.getOwnPropertyNames().isEmpty());
    }

    @Test
    public void testFunctionTypeHasNoImplementedInterfacesInitially() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertFalse(type.hasImplementedInterfaces());
    }

    @Test
    public void testFunctionTypeConversionReturnsItself() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertSame(type, type.toMaybeFunctionType());
        assertTrue(type.canBeCalled());
    }

    @Test
    public void testFunctionTypeReturnTypeIsAvailable() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNotNull(type.getReturnType());
    }

    @Test
    public void testFunctionTypeSlotPrototypeMatchesPrototypeObject() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertSame(type.getPrototype(), type.getSlot("prototype").getType());
    }

    @Test
    public void testFunctionTypeSetPrototypeBasedOnNativeObjectType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType type = registry.createFunctionType("f", null, null, null, null);
        ObjectType base = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        type.setPrototypeBasedOn(base);
        assertTrue(type.getOwnPropertyNames().contains("prototype"));
    }

    @Test
    public void testFunctionTypeSetEmptyImplementedInterfaces() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType type = registry.createFunctionType("f", null, null, null, null);
        type.setImplementedInterfaces(Collections.<ObjectType>emptyList());
        assertFalse(type.getImplementedInterfaces().iterator().hasNext());
        assertFalse(type.hasImplementedInterfaces());
    }

    @Test
    public void testFunctionTypeSetEmptyExtendedInterfaces() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType type = registry.createInterfaceType("I", null);
        type.setExtendedInterfaces(Collections.<ObjectType>emptyList());
        assertEquals(0, type.getExtendedInterfacesCount());
        assertFalse(type.getAllExtendedInterfaces().iterator().hasNext());
    }

    @Test
    public void testFunctionTypeEqualCallTypeWithItself() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertTrue(type.hasEqualCallType(type));
        assertTrue(type.isEquivalentTo(type));
        assertEquals(type.hashCode(), type.hashCode());
    }

    @Test
    public void testFunctionTypeSubtypeOfItself() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertTrue(type.isSubtype(type));
        assertSame(type, type.getLeastSupertype(type));
        assertSame(type, type.getGreatestSubtype(type));
    }

    @Test
    public void testFunctionTypeStringRepresentationsAreAvailable() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNotNull(type.toString());
        assertNotNull(type.toDebugHashCodeString());
    }

    @Test
    public void testFunctionTypeClearCachedValuesLeavesPrototypeAvailable() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        type.getPrototype();
        type.clearCachedValues();
        assertTrue(type.hasCachedValues());
    }

    @Test
    public void testFunctionTypeInterfaceHasInstanceTypeAndNoSuperclass() throws Exception {
        FunctionType type = new JSTypeRegistry(null).createInterfaceType("I", null);
        assertTrue(type.hasInstanceType());
        assertNotNull(type.getInstanceType());
        assertNull(type.getSuperClassConstructor());
    }

    @Test
    public void testFunctionTypeOrdinaryThisTypeIsAvailable() throws Exception {
        FunctionType type = new JSTypeRegistry(null)
                .createFunctionType("f", null, null, null, null);
        assertNotNull(type.getTypeOfThis());
        assertNull(type.getSubTypes());
    }
}
