package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class FromStringDeserializerTest {
    @Test
    public void testTypesListsSupportedTypes() throws Exception {
        assertArrayEquals(new Class<?>[] {
            File.class, URL.class, URI.class, Class.class, JavaType.class,
            Currency.class, Pattern.class, Locale.class, Charset.class,
            TimeZone.class, InetAddress.class, InetSocketAddress.class
        }, FromStringDeserializer.types());
    }

    @Test
    public void testTypesReturnsFreshArray() throws Exception {
        Class<?>[] first = FromStringDeserializer.types();
        first[0] = Object.class;
        assertEquals(File.class, FromStringDeserializer.types()[0]);
    }

    @Test
    public void testFindDeserializerForFile() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(File.class));
    }

    @Test
    public void testFindDeserializerForUrl() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(URL.class));
    }

    @Test
    public void testFindDeserializerForUri() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(URI.class));
    }

    @Test
    public void testFindDeserializerForClass() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Class.class));
    }

    @Test
    public void testFindDeserializerForJavaType() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(JavaType.class));
    }

    @Test
    public void testFindDeserializerForCurrency() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Currency.class));
    }

    @Test
    public void testFindDeserializerForPattern() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Pattern.class));
    }

    @Test
    public void testFindDeserializerForLocale() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Locale.class));
    }

    @Test
    public void testFindDeserializerForCharset() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Charset.class));
    }

    @Test
    public void testFindDeserializerForTimeZone() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(TimeZone.class));
    }

    @Test
    public void testFindDeserializerForInetAddress() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(InetAddress.class));
    }

    @Test
    public void testFindDeserializerForInetSocketAddress() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(InetSocketAddress.class));
    }

    @Test
    public void testFindDeserializerForUnsupportedClass() throws Exception {
        assertNull(FromStringDeserializer.findDeserializer(Object.class));
    }
}
