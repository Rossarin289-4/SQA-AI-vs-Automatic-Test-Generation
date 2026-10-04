package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;

public class ValueInstantiatorTest {
    @Test
    public void testBaseClassTypeMetadata() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        assertEquals(String.class, inst.getValueClass());
        assertEquals(String.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testNullTypeUsesObjectClass() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, (Class<?>) null);
        assertEquals(Object.class, inst.getValueClass());
        assertEquals("UNKNOWN TYPE", inst.getValueTypeDesc());
    }

    @Test
    public void testNoCreatorsMeansCannotInstantiate() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        assertFalse(inst.canInstantiate());
        assertFalse(inst.canCreateFromString());
        assertFalse(inst.canCreateFromInt());
        assertFalse(inst.canCreateFromLong());
        assertFalse(inst.canCreateFromDouble());
        assertFalse(inst.canCreateFromBoolean());
        assertFalse(inst.canCreateUsingDefault());
        assertFalse(inst.canCreateUsingDelegate());
        assertFalse(inst.canCreateUsingArrayDelegate());
        assertFalse(inst.canCreateFromObjectWith());
    }

    @Test
    public void testUnconfiguredArgumentsAndTypesAreNull() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        assertNull(inst.getFromObjectArguments(null));
        assertNull(inst.getDelegateType(null));
        assertNull(inst.getArrayDelegateType(null));
    }

    @Test
    public void testObjectSettingsPreserveCreatorAndArguments() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        JavaType delegateType = new ObjectMapper().constructType(Integer.class);
        SettableBeanProperty[] args = new SettableBeanProperty[0];
        inst.configureFromObjectSettings(null, null, delegateType, null, null, args);
        assertSame(delegateType, inst.getDelegateType(null));
        assertSame(args, inst.getFromObjectArguments(null));
        assertTrue(inst.canCreateUsingDelegate());
        assertFalse(inst.canCreateUsingDefault());
    }

    @Test
    public void testArraySettingsSetArrayDelegateOnly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        JavaType type = new ObjectMapper().constructType(String[].class);
        inst.configureFromArraySettings(null, type, null);
        assertSame(type, inst.getArrayDelegateType(null));
        assertTrue(inst.canCreateUsingArrayDelegate());
        assertFalse(inst.canCreateUsingDelegate());
    }

    @Test
    public void testObjectSettingsCanSetDefaultAndPropertiesCreators() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        inst.configureFromObjectSettings(null, null, null, null, null, null);
        assertNull(inst.getDefaultCreator());
        assertNull(inst.getWithArgsCreator());
        assertFalse(inst.canCreateUsingDefault());
        assertFalse(inst.canCreateFromObjectWith());
    }

    @Test
    public void testConfiguringNullScalarCreatorsLeavesCapabilitiesFalse() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        inst.configureFromStringCreator(null);
        inst.configureFromIntCreator(null);
        inst.configureFromLongCreator(null);
        inst.configureFromDoubleCreator(null);
        inst.configureFromBooleanCreator(null);
        assertFalse(inst.canCreateFromString());
        assertFalse(inst.canCreateFromInt());
        assertFalse(inst.canCreateFromLong());
        assertFalse(inst.canCreateFromDouble());
        assertFalse(inst.canCreateFromBoolean());
        assertFalse(inst.canInstantiate());
    }

    @Test
    public void testIncompleteParameterInitiallyNull() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        assertNull(inst.getIncompleteParameter());
    }

    @Test
    public void testSettingIncompleteParameterToNull() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        inst.configureIncompleteParameter(null);
        assertNull(inst.getIncompleteParameter());
    }

    @Test
    public void testJsonLocationInstantiatorHasValueMetadata() throws Exception {
        JsonLocationInstantiator inst = new JsonLocationInstantiator();
        assertNotNull(inst.getValueClass());
        assertEquals(inst.getValueClass().getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testJsonLocationInstantiatorReportsSomeCreationCapability() throws Exception {
        JsonLocationInstantiator inst = new JsonLocationInstantiator();
        assertEquals(inst.canCreateUsingDefault()
                || inst.canCreateUsingDelegate()
                || inst.canCreateUsingArrayDelegate()
                || inst.canCreateFromObjectWith()
                || inst.canCreateFromString()
                || inst.canCreateFromInt()
                || inst.canCreateFromLong()
                || inst.canCreateFromDouble()
                || inst.canCreateFromBoolean(), inst.canInstantiate());
    }

    @Test
    public void testDelegateCreatorInitiallyNull() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        assertNull(inst.getDelegateCreator());
    }

    @Test
    public void testArrayDelegateCreatorInitiallyNull() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        assertNull(inst.getArrayDelegateCreator());
    }

    @Test
    public void testCreateUsingDefaultWithoutCreatorFailsClearly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createUsingDefault(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateFromObjectWithWithoutCreatorFailsClearly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createFromObjectWith(null, new Object[0]);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateUsingDelegateWithoutCreatorThrowsIllegalState() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createUsingDelegate(null, "value");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testCreateUsingArrayDelegateWithoutCreatorThrowsIllegalState() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createUsingArrayDelegate(null, "value");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testCreateFromIntWithoutCreatorFailsClearly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createFromInt(null, Integer.MAX_VALUE);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateFromLongWithoutCreatorFailsClearly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createFromLong(null, Long.MIN_VALUE);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateFromDoubleWithoutCreatorFailsClearly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createFromDouble(null, 0.0);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateFromBooleanWithoutCreatorFailsClearly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createFromBoolean(null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testEmptyStringFallbackWithoutContextFailsClearly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createFromString(null, "");
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateFromStringNonemptyFallbackWithoutContextFailsClearly() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        try {
            inst.createFromString(null, "x");
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }
}
