package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;

public class StdKeyDeserializerTest {
    @Test
    public void testStringKeyAndNullKey() throws Exception {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(String.class);
        assertEquals("text", deser.deserializeKey("text", null));
        assertNull(deser.deserializeKey(null, null));
    }

    @Test
    public void testStringDeserializerKeyClass() throws Exception {
        assertEquals(String.class, StdKeyDeserializer.forType(String.class).getKeyClass());
    }

    @Test
    public void testBooleanTrue() throws Exception {
        assertEquals(Boolean.TRUE, StdKeyDeserializer.forType(Boolean.class)._parse("true", null));
    }

    @Test
    public void testBooleanFalse() throws Exception {
        assertEquals(Boolean.FALSE, StdKeyDeserializer.forType(Boolean.class)._parse("false", null));
    }

    @Test
    public void testByteMinimum() throws Exception {
        assertEquals(Byte.valueOf(Byte.MIN_VALUE),
                StdKeyDeserializer.forType(Byte.class)._parse("-128", null));
    }

    @Test
    public void testByteMaximumAcceptedValue() throws Exception {
        assertEquals(Byte.valueOf((byte) 255),
                StdKeyDeserializer.forType(Byte.class)._parse("255", null));
    }

    @Test
    public void testByteFirstValueAboveAcceptedRange() throws Exception {
        try {
            StdKeyDeserializer.forType(Byte.class)._parse("256", null);
            fail("expected exception");
        } catch (Exception expected) {
            assertTrue(expected instanceof IOException || expected instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testShortMinimum() throws Exception {
        assertEquals(Short.valueOf(Short.MIN_VALUE),
                StdKeyDeserializer.forType(Short.class)._parse("-32768", null));
    }

    @Test
    public void testShortMaximum() throws Exception {
        assertEquals(Short.valueOf(Short.MAX_VALUE),
                StdKeyDeserializer.forType(Short.class)._parse("32767", null));
    }

    @Test
    public void testCharacterSingleCharacter() throws Exception {
        assertEquals(Character.valueOf('x'),
                StdKeyDeserializer.forType(Character.class)._parse("x", null));
    }

    @Test
    public void testIntegerMaximum() throws Exception {
        assertEquals(Integer.valueOf(Integer.MAX_VALUE),
                StdKeyDeserializer.forType(Integer.class)._parse("2147483647", null));
    }

    @Test
    public void testIntegerMinimum() throws Exception {
        assertEquals(Integer.valueOf(Integer.MIN_VALUE),
                StdKeyDeserializer.forType(Integer.class)._parse("-2147483648", null));
    }

    @Test
    public void testIntegerFirstValueAboveMaximum() throws Exception {
        try {
            StdKeyDeserializer.forType(Integer.class)._parse("2147483648", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testLongMaximum() throws Exception {
        assertEquals(Long.valueOf(Long.MAX_VALUE),
                StdKeyDeserializer.forType(Long.class)._parse("9223372036854775807", null));
    }

    @Test
    public void testLongMinimum() throws Exception {
        assertEquals(Long.valueOf(Long.MIN_VALUE),
                StdKeyDeserializer.forType(Long.class)._parse("-9223372036854775808", null));
    }

    @Test
    public void testFloatConversion() throws Exception {
        Number result = (Number) StdKeyDeserializer.forType(Float.class)._parse("1.25", null);
        assertEquals(1.25, result.doubleValue(), 1e-6);
    }

    @Test
    public void testDoubleConversion() throws Exception {
        assertEquals(1.25, ((Number) StdKeyDeserializer.forType(Double.class)
                ._parse("1.25", null)).doubleValue(), 1e-12);
    }

    @Test
    public void testUuidParsing() throws Exception {
        UUID expected = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        assertEquals(expected, StdKeyDeserializer.forType(UUID.class)
                ._parse("123e4567-e89b-12d3-a456-426614174000", null));
    }

    @Test
    public void testUriParsing() throws Exception {
        assertEquals(URI.create("https://example.org/a"),
                StdKeyDeserializer.forType(URI.class)._parse("https://example.org/a", null));
    }

    @Test
    public void testUrlParsing() throws Exception {
        URL expected = new URL("https://example.org/a");
        URL actual = (URL) StdKeyDeserializer.forType(URL.class)
                ._parse("https://example.org/a", null);
        assertEquals(expected.toExternalForm(), actual.toExternalForm());
    }
}
