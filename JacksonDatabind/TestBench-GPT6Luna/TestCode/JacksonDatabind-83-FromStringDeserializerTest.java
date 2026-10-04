package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class FromStringDeserializerTest {

    @Test
    public void testTypesListsSupportedTypes() throws Exception {
        Class<?>[] types = FromStringDeserializer.types();
        assertEquals(13, types.length);
        assertEquals(java.io.File.class, types[0]);
        assertEquals(URL.class, types[1]);
        assertEquals(URI.class, types[2]);
        assertEquals(StringBuilder.class, types[12]);
    }

    @Test
    public void testFindDeserializerForSupportedTypes() throws Exception {
        Class<?>[] types = FromStringDeserializer.types();
        for (Class<?> type : types) {
            assertNotNull(FromStringDeserializer.findDeserializer(type));
        }
    }

    @Test
    public void testFindDeserializerForUnsupportedType() throws Exception {
        assertNull(FromStringDeserializer.findDeserializer(Object.class));
    }

    @Test
    public void testFindDeserializerRequiresExactClass() throws Exception {
        assertNull(FromStringDeserializer.findDeserializer(java.io.File.class.getSuperclass()));
    }

    @Test
    public void testFindDeserializerForStringBuilder() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(StringBuilder.class));
    }

    @Test
    public void testDeserializeMethodIsExposed() throws Exception {
        assertTrue(java.util.Arrays.asList(FromStringDeserializer.class.getDeclaredMethods())
                .contains(FromStringDeserializer.class.getDeclaredMethod(
                        "deserialize", JsonParser.class, DeserializationContext.class)));
    }

    @Test
    public void testSupportedTypesContainLocale() throws Exception {
        boolean found = false;
        for (Class<?> type : FromStringDeserializer.types()) {
            if (type == Locale.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testSupportedTypesContainInetSocketAddress() throws Exception {
        boolean found = false;
        for (Class<?> type : FromStringDeserializer.types()) {
            if (type == InetSocketAddress.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testSupportedTypesContainPattern() throws Exception {
        boolean found = false;
        for (Class<?> type : FromStringDeserializer.types()) {
            if (type == Pattern.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testSupportedTypesContainCharset() throws Exception {
        boolean found = false;
        for (Class<?> type : FromStringDeserializer.types()) {
            if (type == Charset.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testSupportedTypesContainCurrency() throws Exception {
        boolean found = false;
        for (Class<?> type : FromStringDeserializer.types()) {
            if (type == Currency.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testSupportedTypesContainTimeZone() throws Exception {
        boolean found = false;
        for (Class<?> type : FromStringDeserializer.types()) {
            if (type == TimeZone.class) {
                found = true;
            }
        }
        assertTrue(found);
    }
}
