package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Member;
import java.util.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class CreatorCollectorTest {
    @Test
    public void testVanillaCollectionInstantiation() throws Exception {
        fail("The required BeanDescription and MapperConfig cannot be constructed using declarations supplied here.");
    }

    @Test
    public void testVanillaListInstantiation() throws Exception {
        fail("No usable BeanDescription construction API is supplied.");
    }

    @Test
    public void testVanillaArrayListInstantiation() throws Exception {
        fail("No usable MapperConfig construction API is supplied.");
    }

    @Test
    public void testVanillaMapInstantiation() throws Exception {
        fail("No usable BeanDescription construction API is supplied.");
    }

    @Test
    public void testVanillaLinkedHashMapInstantiation() throws Exception {
        fail("No usable MapperConfig construction API is supplied.");
    }

    @Test
    public void testVanillaHashMapInstantiation() throws Exception {
        fail("No usable BeanDescription construction API is supplied.");
    }

    @Test
    public void testDefaultCreatorState() throws Exception {
        fail("No CreatorCollector instance can be initialized from the supplied declarations.");
    }

    @Test
    public void testStringCreatorState() throws Exception {
        fail("No creator or collector initialization is available from the supplied declarations.");
    }

    @Test
    public void testIntCreatorState() throws Exception {
        fail("No creator or collector initialization is available from the supplied declarations.");
    }

    @Test
    public void testLongCreatorState() throws Exception {
        fail("No creator or collector initialization is available from the supplied declarations.");
    }

    @Test
    public void testDoubleCreatorState() throws Exception {
        fail("No creator or collector initialization is available from the supplied declarations.");
    }

    @Test
    public void testBooleanCreatorState() throws Exception {
        fail("No creator or collector initialization is available from the supplied declarations.");
    }

    @Test
    public void testDelegatingCreatorState() throws Exception {
        fail("No AnnotatedWithParams instance can be constructed from the supplied declarations.");
    }

    @Test
    public void testPropertyBasedCreatorState() throws Exception {
        fail("No property creator instance can be constructed from the supplied declarations.");
    }

    @Test
    public void testIncompleteParameterRegistration() throws Exception {
        fail("No AnnotatedParameter instance or collector initialization API is supplied.");
    }

    @Test
    public void testNonVanillaInstantiator() throws Exception {
        fail("The supplied declarations do not provide construction of the required dependencies.");
    }

    @Test
    public void testVanillaCollectionDescription() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION);
        assertEquals(ArrayList.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testVanillaMapDescription() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_MAP);
        assertEquals(LinkedHashMap.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testVanillaHashMapDescription() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_HASH_MAP);
        assertEquals(HashMap.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testVanillaUnknownTypeDescription() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(-1);
        assertEquals(Object.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testVanillaCollectionCanInstantiateAndCreateByDefault() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION);
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testVanillaMapCanInstantiateAndCreateByDefault() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_MAP);
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testVanillaHashMapCanInstantiateAndCreateByDefault() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_HASH_MAP);
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testVanillaUnknownTypeStillReportsCreationCapabilities() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(0);
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testVanillaUnknownTypeDefaultCreationThrows() throws Exception {
        CreatorCollector.Vanilla inst = new CreatorCollector.Vanilla(0);
        try {
            inst.createUsingDefault(null);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }
}
