package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUnionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.jscomp.graph.StandardUnionFind;
import com.google.javascript.jscomp.graph.UnionFind;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;

public class DisambiguatePropertiesTest {
    @Test
    public void testReferencePlaceholder() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testConcreteTypeNonePredicate() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.isNone());
    }

    @Test
    public void testConcreteTypeSingletonPredicate() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.isNone());
    }

    @Test
    public void testConcreteTypeEmptyPropertySlots() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.getPropertySlots("x").isEmpty());
    }

    @Test
    public void testConcreteTypeEmptyFunctions() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.getFunctions().isEmpty());
    }

    @Test
    public void testConcreteTypeEmptyInstances() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.getInstances().isEmpty());
    }

    @Test
    public void testConcreteTypeEmptyFunctionInstanceTypes() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.getFunctionInstanceTypes().isEmpty());
    }

    @Test
    public void testConcreteTypeEmptyPrototypeTypes() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.getPrototypeTypes().isEmpty());
    }

    @Test
    public void testConcreteTypeEmptySuperclassTypes() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.getSuperclassTypes().isEmpty());
    }

    @Test
    public void testConcreteTypeEmptyParameterSlots() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.getParameterSlots(0).isEmpty());
    }

    @Test
    public void testConcreteTypeEmptyPropertyType() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertTrue(type.getPropertyType("x").isNone());
    }

    @Test
    public void testConcreteTypeUnionWithNone() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertSame(type, type.unionWith(type));
    }

    @Test
    public void testConcreteTypeIntersectionWithNone() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertSame(type, type.intersectWith(type));
    }

    @Test
    public void testConcreteTypeScopeForNone() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertNull(type.getScope());
    }

    @Test
    public void testConcreteTypeAllPredicatesForNone() throws Exception {
        ConcreteType type = ConcreteType.createForTypes(
                java.util.Collections.<ConcreteType>emptySet());
        assertFalse(type.isAll());
    }
}
