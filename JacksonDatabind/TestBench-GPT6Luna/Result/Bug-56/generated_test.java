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
    public void testTypesListsAllSupportedTypes() throws Exception {
        assertArrayEquals(new Class<?>[] { File.class, URL.class, URI.class, Class.class,
                JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class,
                TimeZone.class, InetAddress.class, InetSocketAddress.class },
                FromStringDeserializer.types());
    }

    @Test
    public void testFindDeserializerRecognizesFile() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(File.class));
    }

    @Test
    public void testFindDeserializerRecognizesSocketAddress() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(InetSocketAddress.class));
    }

    @Test
    public void testFindDeserializerRejectsUnsupportedType() throws Exception {
        assertNull(FromStringDeserializer.findDeserializer(String.class));
    }

    @Test
    public void testFileDeserializerFactoryForEachSupportedType() throws Exception {
        Class<?>[] types = FromStringDeserializer.types();
        for (Class<?> type : types) {
            assertNotNull(FromStringDeserializer.findDeserializer(type));
        }
    }

    @Test
    public void testUnsupportedInterfaceDoesNotGetDeserializer() throws Exception {
        assertNull(FromStringDeserializer.findDeserializer(Iterable.class));
    }

    @Test
    public void testTypesReturnsFreshArray() throws Exception {
        Class<?>[] first = FromStringDeserializer.types();
        first[0] = String.class;
        assertEquals(File.class, FromStringDeserializer.types()[0]);
    }

    @Test
    public void testClassTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Class.class));
    }

    @Test
    public void testUriTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(URI.class));
    }

    @Test
    public void testPatternTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Pattern.class));
    }

    @Test
    public void testLocaleTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Locale.class));
    }

    @Test
    public void testCharsetTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Charset.class));
    }

    @Test
    public void testTimeZoneTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(TimeZone.class));
    }

    @Test
    public void testInetAddressTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(InetAddress.class));
    }

    @Test
    public void testCurrencyTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(Currency.class));
    }

    @Test
    public void testJavaTypeIsSupported() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(JavaType.class));
    }
}
