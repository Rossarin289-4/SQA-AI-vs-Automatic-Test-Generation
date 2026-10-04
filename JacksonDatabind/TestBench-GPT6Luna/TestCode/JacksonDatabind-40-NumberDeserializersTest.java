package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class NumberDeserializersTest {
    @Test
    public void testFindPrimitiveInteger() throws Exception {
        assertNotNull(NumberDeserializers.find(Integer.TYPE, "ignored"));
    }

    @Test
    public void testFindPrimitiveBoolean() throws Exception {
        assertNotNull(NumberDeserializers.find(Boolean.TYPE, "ignored"));
    }

    @Test
    public void testFindPrimitiveLong() throws Exception {
        assertNotNull(NumberDeserializers.find(Long.TYPE, "ignored"));
    }

    @Test
    public void testFindPrimitiveDouble() throws Exception {
        assertNotNull(NumberDeserializers.find(Double.TYPE, "ignored"));
    }

    @Test
    public void testFindPrimitiveCharacter() throws Exception {
        assertNotNull(NumberDeserializers.find(Character.TYPE, "ignored"));
    }

    @Test
    public void testFindPrimitiveByte() throws Exception {
        assertNotNull(NumberDeserializers.find(Byte.TYPE, "ignored"));
    }

    @Test
    public void testFindPrimitiveShort() throws Exception {
        assertNotNull(NumberDeserializers.find(Short.TYPE, "ignored"));
    }

    @Test
    public void testFindPrimitiveFloat() throws Exception {
        assertNotNull(NumberDeserializers.find(Float.TYPE, "ignored"));
    }

    @Test
    public void testFindWrapperInteger() throws Exception {
        assertNotNull(NumberDeserializers.find(Integer.class, Integer.class.getName()));
    }

    @Test
    public void testFindWrapperBoolean() throws Exception {
        assertNotNull(NumberDeserializers.find(Boolean.class, Boolean.class.getName()));
    }

    @Test
    public void testFindWrapperLong() throws Exception {
        assertNotNull(NumberDeserializers.find(Long.class, Long.class.getName()));
    }

    @Test
    public void testFindWrapperDouble() throws Exception {
        assertNotNull(NumberDeserializers.find(Double.class, Double.class.getName()));
    }

    @Test
    public void testFindWrapperCharacter() throws Exception {
        assertNotNull(NumberDeserializers.find(Character.class, Character.class.getName()));
    }

    @Test
    public void testFindWrapperByte() throws Exception {
        assertNotNull(NumberDeserializers.find(Byte.class, Byte.class.getName()));
    }

    @Test
    public void testFindWrapperShort() throws Exception {
        assertNotNull(NumberDeserializers.find(Short.class, Short.class.getName()));
    }

    @Test
    public void testFindWrapperFloat() throws Exception {
        assertNotNull(NumberDeserializers.find(Float.class, Float.class.getName()));
    }

    @Test
    public void testFindNumber() throws Exception {
        assertNotNull(NumberDeserializers.find(Number.class, Number.class.getName()));
    }

    @Test
    public void testFindBigDecimal() throws Exception {
        assertNotNull(NumberDeserializers.find(BigDecimal.class, BigDecimal.class.getName()));
    }

    @Test
    public void testFindBigInteger() throws Exception {
        assertNotNull(NumberDeserializers.find(BigInteger.class, BigInteger.class.getName()));
    }

    @Test
    public void testFindUnlistedClass() throws Exception {
        assertNull(NumberDeserializers.find(String.class, String.class.getName()));
    }

    @Test
    public void testFindListedNameWithDifferentTypeThrows() throws Exception {
        try {
            NumberDeserializers.find(String.class, Integer.class.getName());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFindUnknownPrimitiveNameDoesNotMatter() throws Exception {
        assertNotNull(NumberDeserializers.find(int.class, "unknown"));
    }

    @Test
    public void testIntegerDeserializerIsCachable() throws Exception {
        NumberDeserializers.IntegerDeserializer deserializer =
                new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertTrue(deserializer.isCachable());
    }

    @Test
    public void testLongDeserializerIsCachable() throws Exception {
        NumberDeserializers.LongDeserializer deserializer =
                new NumberDeserializers.LongDeserializer(Long.class, null);
        assertTrue(deserializer.isCachable());
    }

    @Test
    public void testPrimitiveBooleanNullValue() throws Exception {
        NumberDeserializers.BooleanDeserializer deserializer =
                new NumberDeserializers.BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        assertEquals(Boolean.FALSE, deserializer.getNullValue());
    }

    @Test
    public void testWrapperBooleanNullValue() throws Exception {
        NumberDeserializers.BooleanDeserializer deserializer =
                new NumberDeserializers.BooleanDeserializer(Boolean.class, null);
        assertNull(deserializer.getNullValue());
    }

    @Test
    public void testPrimitiveIntegerNullValue() throws Exception {
        NumberDeserializers.IntegerDeserializer deserializer =
                new NumberDeserializers.IntegerDeserializer(Integer.TYPE, Integer.valueOf(0));
        assertEquals(Integer.valueOf(0), deserializer.getNullValue());
    }

    @Test
    public void testWrapperIntegerNullValue() throws Exception {
        NumberDeserializers.IntegerDeserializer deserializer =
                new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertNull(deserializer.getNullValue());
    }

    @Test
    public void testBooleanGetNullValueWithNullContextCannotBeCalled() throws Exception {
        NumberDeserializers.BooleanDeserializer deserializer =
                new NumberDeserializers.BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        assertEquals(Boolean.FALSE, deserializer.getNullValue());
    }

    @Test
    public void testWrapperIntegerGetEmptyValueWithNullContext() throws Exception {
        NumberDeserializers.IntegerDeserializer deserializer =
                new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertNull(deserializer.getEmptyValue(null));
    }

    @Test
    public void testWrapperBooleanGetEmptyValueWithNullContext() throws Exception {
        NumberDeserializers.BooleanDeserializer deserializer =
                new NumberDeserializers.BooleanDeserializer(Boolean.class, null);
        assertNull(deserializer.getEmptyValue(null));
    }

    @Test
    public void testPrimitiveByteGetEmptyValueWithNullContext() throws Exception {
        NumberDeserializers.ByteDeserializer deserializer =
                new NumberDeserializers.ByteDeserializer(Byte.TYPE, Byte.valueOf((byte) 0));
        try {
            deserializer.getEmptyValue(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testPrimitiveCharacterNullValue() throws Exception {
        NumberDeserializers.CharacterDeserializer deserializer =
                new NumberDeserializers.CharacterDeserializer(Character.TYPE, '\0');
        assertEquals(Character.valueOf('\0'), deserializer.getNullValue());
    }

    @Test
    public void testWrapperCharacterNullValue() throws Exception {
        NumberDeserializers.CharacterDeserializer deserializer =
                new NumberDeserializers.CharacterDeserializer(Character.class, null);
        assertNull(deserializer.getNullValue());
    }

    @Test
    public void testPrimitiveLongEmptyValueWithNullContext() throws Exception {
        NumberDeserializers.LongDeserializer deserializer =
                new NumberDeserializers.LongDeserializer(Long.TYPE, Long.valueOf(0L));
        try {
            deserializer.getEmptyValue(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testWrapperLongEmptyValueWithNullContext() throws Exception {
        NumberDeserializers.LongDeserializer deserializer =
                new NumberDeserializers.LongDeserializer(Long.class, null);
        assertNull(deserializer.getEmptyValue(null));
    }
}
