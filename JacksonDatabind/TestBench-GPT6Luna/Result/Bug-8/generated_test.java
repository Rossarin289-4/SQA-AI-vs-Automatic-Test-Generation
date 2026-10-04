package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Member;
import java.util.*;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class CreatorCollectorTest {
    @Test
    public void testInitiallyHasNoDefaultCreator() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullDefaultCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.setDefaultCreator(null);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullStringCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addStringCreator(null, false);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullExplicitStringCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addStringCreator(null, true);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullIntCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addIntCreator(null, false);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullLongCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addLongCreator(null, false);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullDoubleCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addDoubleCreator(null, false);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullBooleanCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addBooleanCreator(null, false);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullDelegatingCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addDelegatingCreator(null, false, null);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullExplicitDelegatingCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addDelegatingCreator(null, true, null);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testEmptyPropertyCreatorLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addPropertyCreator(null, false, new CreatorProperty[0]);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullIncompleteParameterLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addIncompeteParameter(null);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testRepeatedNullIncompleteParameterLeavesDefaultAbsent() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addIncompeteParameter(null);
        collector.addIncompeteParameter(null);
        assertFalse(collector.hasDefaultCreator());
    }

    @Test
    public void testNullPropertyArrayThrowsNullPointerException() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        try {
            collector.addPropertyCreator(null, false, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testConstructValueInstantiatorRequiresBeanDescription() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        try {
            collector.constructValueInstantiator(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testConstructValueInstantiatorWithNoConfigRequiresBeanDescription() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        try {
            collector.constructValueInstantiator(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testGetValueTypeDescCannotConstructWithoutBeanDescription() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        try {
            collector.constructValueInstantiator(null).getValueTypeDesc();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCanInstantiateCannotConstructWithoutBeanDescription() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        try {
            collector.constructValueInstantiator(null).canInstantiate();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCanCreateUsingDefaultCannotConstructWithoutBeanDescription() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        try {
            collector.constructValueInstantiator(null).canCreateUsingDefault();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateUsingDefaultCannotConstructWithoutBeanDescription() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        try {
            collector.constructValueInstantiator(null).createUsingDefault(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testHasDefaultCreatorAfterNullSetterIsFalse() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.setDefaultCreator(null);
        assertEquals(false, collector.hasDefaultCreator());
    }

    @Test
    public void testEmptyArrayPropertyCreatorDoesNotAddDefaultCreator() throws Exception {
        CreatorCollector collector = new CreatorCollector(null, false);
        collector.addPropertyCreator(null, true, new CreatorProperty[0]);
        assertEquals(false, collector.hasDefaultCreator());
    }
}
