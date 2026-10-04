package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.EnumValues;

public class StdKeySerializersTest {
    @Test
    public void testNullTypeUsesDynamicSerializer() throws Exception {
        JsonSerializer<Object> serializer =
                StdKeySerializers.getStdKeySerializer(null, null, false);
        assertTrue(serializer instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testObjectTypeUsesDynamicSerializer() throws Exception {
        JsonSerializer<Object> serializer =
                StdKeySerializers.getStdKeySerializer(null, Object.class, true);
        assertTrue(serializer instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testStringTypeUsesStringSerializer() throws Exception {
        JsonSerializer<Object> serializer =
                StdKeySerializers.getStdKeySerializer(null, String.class, false);
        assertTrue(serializer instanceof StdKeySerializers.StringKeySerializer);
        assertSame(serializer, StdKeySerializers.getStdKeySerializer(null, String.class, true));
    }

    @Test
    public void testPrimitiveIntUsesDefaultSerializer() throws Exception {
        assertSame(StdKeySerializers.getDefault(),
                StdKeySerializers.getStdKeySerializer(null, int.class, false));
    }

    @Test
    public void testNumberSubclassUsesDefaultSerializer() throws Exception {
        assertSame(StdKeySerializers.getDefault(),
                StdKeySerializers.getStdKeySerializer(null, Integer.class, false));
    }

    @Test
    public void testClassTypeUsesDefaultSerializer() throws Exception {
        JsonSerializer<Object> serializer =
                StdKeySerializers.getStdKeySerializer(null, Class.class, false);
        assertTrue(serializer instanceof StdKeySerializers.Default);
    }

    @Test
    public void testDateTypeUsesDefaultSerializer() throws Exception {
        JsonSerializer<Object> serializer =
                StdKeySerializers.getStdKeySerializer(null, Date.class, false);
        assertTrue(serializer instanceof StdKeySerializers.Default);
    }

    @Test
    public void testCalendarTypeUsesDefaultSerializer() throws Exception {
        JsonSerializer<Object> serializer =
                StdKeySerializers.getStdKeySerializer(null, Calendar.class, false);
        assertTrue(serializer instanceof StdKeySerializers.Default);
    }

    @Test
    public void testUuidTypeUsesDefaultSerializer() throws Exception {
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(
                null, java.util.UUID.class, false);
        assertTrue(serializer instanceof StdKeySerializers.Default);
    }

    @Test
    public void testUnknownTypeWithoutFallbackReturnsNull() throws Exception {
        assertNull(StdKeySerializers.getStdKeySerializer(null, Object[].class, false));
    }

    @Test
    public void testUnknownTypeWithFallbackReturnsDefault() throws Exception {
        assertSame(StdKeySerializers.getDefault(),
                StdKeySerializers.getStdKeySerializer(null, Object[].class, true));
    }

    @Test
    public void testFallbackNullTypeReturnsDefault() throws Exception {
        assertSame(StdKeySerializers.getDefault(),
                StdKeySerializers.getFallbackKeySerializer(null, null));
    }

    @Test
    public void testFallbackEnumBaseTypeIsDynamic() throws Exception {
        JsonSerializer<Object> serializer =
                StdKeySerializers.getFallbackKeySerializer(null, Enum.class);
        assertTrue(serializer instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testFallbackNonEnumTypeReturnsDefault() throws Exception {
        assertSame(StdKeySerializers.getDefault(),
                StdKeySerializers.getFallbackKeySerializer(null, String.class));
    }

    @Test
    public void testGetDefaultReturnsSameInstance() throws Exception {
        assertSame(StdKeySerializers.getDefault(), StdKeySerializers.getDefault());
    }

    @Test
    public void testStringKeySerializerHandledType() throws Exception {
        StdKeySerializers.StringKeySerializer serializer =
                new StdKeySerializers.StringKeySerializer();
        assertEquals(String.class, serializer.handledType());
    }

    @Test
    public void testDefaultClassSerializerHandledType() throws Exception {
        StdKeySerializers.Default serializer =
                new StdKeySerializers.Default(3, Class.class);
        assertEquals(Class.class, serializer.handledType());
    }

    @Test
    public void testDateDefaultSerializerHandledType() throws Exception {
        StdKeySerializers.Default serializer =
                new StdKeySerializers.Default(1, Date.class);
        assertEquals(Date.class, serializer.handledType());
    }

    @Test
    public void testCalendarDefaultSerializerHandledType() throws Exception {
        StdKeySerializers.Default serializer =
                new StdKeySerializers.Default(2, Calendar.class);
        assertEquals(Calendar.class, serializer.handledType());
    }

    @Test
    public void testToStringDefaultSerializerHandledType() throws Exception {
        StdKeySerializers.Default serializer =
                new StdKeySerializers.Default(5, java.util.UUID.class);
        assertEquals(java.util.UUID.class, serializer.handledType());
    }
}
