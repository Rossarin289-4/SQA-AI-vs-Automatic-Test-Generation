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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.core.util.VersionUtil; // Import VersionUtil

// Mock classes for DeserializationContext and JsonParser
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

public class FromStringDeserializerTest {

    // Mock DeserializationContext to return default values or throw exceptions as needed

    // Mock JsonParser to return specific values for getValueAsString and getCurrentToken

    // Helper to create a Std deserializer instance
    private FromStringDeserializer.Std createStdDeserializer(Class<?> valueType, int kind) {
        return new FromStringDeserializer.Std(valueType, kind);
    }

    // --- Tests for deserializing specific types ---


    














    
    








    


    
    

    // --- Tests for findDeserializer ---

    @Test
    public void testFindDeserializerFile() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(File.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_FILE, deserializer._kind);
    }

    @Test
    public void testFindDeserializerURL() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(URL.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_URL, deserializer._kind);
    }

    @Test
    public void testFindDeserializerURI() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(URI.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_URI, deserializer._kind);
    }

    @Test
    public void testFindDeserializerClass() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Class.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_CLASS, deserializer._kind);
    }

    @Test
    public void testFindDeserializerJavaType() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(JavaType.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_JAVA_TYPE, deserializer._kind);
    }

    @Test
    public void testFindDeserializerCurrency() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Currency.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_CURRENCY, deserializer._kind);
    }

    @Test
    public void testFindDeserializerPattern() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Pattern.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_PATTERN, deserializer._kind);
    }

    @Test
    public void testFindDeserializerLocale() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Locale.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_LOCALE, deserializer._kind);
    }

    @Test
    public void testFindDeserializerCharset() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Charset.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_CHARSET, deserializer._kind);
    }

    @Test
    public void testFindDeserializerTimeZone() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(TimeZone.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_TIME_ZONE, deserializer._kind);
    }

    @Test
    public void testFindDeserializerInetAddress() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(InetAddress.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_INET_ADDRESS, deserializer._kind);
    }

    @Test
    public void testFindDeserializerInetSocketAddress() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS, deserializer._kind);
    }

    @Test
    public void testFindDeserializerStringBuilder() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(StringBuilder.class);
        assertNotNull(deserializer);
        assertEquals(FromStringDeserializer.Std.STD_STRING_BUILDER, deserializer._kind);
    }

    @Test
    public void testFindDeserializerUnknown() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(String.class);
        assertNull(deserializer);
    }

    // --- Tests for general deserialization logic ---

    
    

    // --- Tests for _deserializeFromEmptyString() override cases ---

    @Test
    public void testDeserializeURIEmptyStringOverride() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(URI.class, FromStringDeserializer.Std.STD_URI);
        URI result = (URI) deserializer._deserializeFromEmptyString();
        assertEquals(URI.create(""), result);
    }

    @Test
    public void testDeserializeLocaleEmptyStringOverride() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        Locale result = (Locale) deserializer._deserializeFromEmptyString();
        assertEquals(Locale.ROOT, result);
    }

    @Test
    public void testDeserializeStringBuilderEmptyStringOverride() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(StringBuilder.class, FromStringDeserializer.Std.STD_STRING_BUILDER);
        StringBuilder result = (StringBuilder) deserializer._deserializeFromEmptyString();
        assertEquals("", result.toString());
    }

    // --- Test for _firstHyphenOrUnderscore helper method ---

    @Test
    public void testFirstHyphenOrUnderscore_NoSeparator() {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Object.class, 0); // Kind doesn't matter for this helper
        assertEquals(-1, deserializer._firstHyphenOrUnderscore("HelloWorld"));
    }

    @Test
    public void testFirstHyphenOrUnderscore_HyphenFirst() {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Object.class, 0);
        assertEquals(5, deserializer._firstHyphenOrUnderscore("en-US"));
    }

    @Test
    public void testFirstHyphenOrUnderscore_UnderscoreFirst() {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Object.class, 0);
        assertEquals(2, deserializer._firstHyphenOrUnderscore("fr_CA"));
    }

    @Test
    public void testFirstHyphenOrUnderscore_MultipleSeparators() {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Object.class, 0);
        assertEquals(2, deserializer._firstHyphenOrUnderscore("zh_CN-TW")); // Should find the first one
    }

    @Test
    public void testFirstHyphenOrUnderscore_EmptyString() {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Object.class, 0);
        assertEquals(-1, deserializer._firstHyphenOrUnderscore(""));
    }
}




