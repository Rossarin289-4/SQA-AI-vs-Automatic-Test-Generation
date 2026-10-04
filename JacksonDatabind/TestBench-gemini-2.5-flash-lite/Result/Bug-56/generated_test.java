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

// Mock implementations for DeserializationContext and related classes to satisfy compilation
class MockDeserializationContext extends com.fasterxml.jackson.databind.deser.DefaultDeserializationContext {


    // Override necessary methods that might be called by FromStringDeserializer
    @Override
    public Class<?> findClass(String className) throws ClassNotFoundException {
        // Simple mock implementation to allow testing Class deserialization
        if ("java.lang.String".equals(className)) {
            return String.class;
        }
        throw new ClassNotFoundException(className);
    }


    @Override
    public JsonMappingException mappingException(Class<?> targetClass) {
        return new JsonMappingException("Mock mapping exception for class: " + targetClass.getName());
    }


    @Override
    public JsonMappingException instantiationException(Class<?> targetClass, Throwable t) {
        return new JsonMappingException("Mock instantiation exception for class: " + targetClass.getName(), t);
    }


    @Override
    public InvalidFormatException weirdStringException(String value, Class<?> targetType, String msg) {
        return new InvalidFormatException(msg, value, targetType);
    }

    @Override
    public JsonMappingException wrongTokenException(JsonParser p, JsonToken expectedToken, String message) {
        return new JsonMappingException(message);
    }

}

// Mock JsonParser to control tokens and values
class MockJsonParser extends com.fasterxml.jackson.core.JsonParserDelegate {
    private JsonToken _currentToken;
    private String _currentValue;
    private Object _embeddedObject;


    // Allow setting a sequence of tokens for testing transitions

    public void setEmbeddedObject(Object obj) {
        _embeddedObject = obj;
    }





    // Basic implementations for other required methods






    

    
}


// Mock DeserializationConfig for basic configuration
class MockDeserializationConfig extends com.fasterxml.jackson.databind.DeserializationConfig {
    private final int _featureFlags;


    

    @Override
    public com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) {
        return com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    }
}

public class FromStringDeserializerTest {

    // Helper to create a mock context with specific features

    // Helper to create a mock parser with a string value

    // Helper to create a mock parser for an empty string

    // Helper to create a mock parser for a null value

    // Helper to create a mock parser for an embedded object

    // --- Tests for File deserialization ---


    // --- Tests for URL deserialization ---


    // --- Tests for URI deserialization ---


    // --- Tests for Class deserialization ---

    // --- Tests for JavaType deserialization ---

    // --- Tests for Currency deserialization ---

    @Test
    public void testDeserializeCurrencyInvalid() throws Exception {
        FromStringDeserializer<Currency> deserializer = new FromStringDeserializer.Std(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("INVALID");
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected IllegalArgumentException for invalid currency code");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // --- Tests for Pattern deserialization ---
    @Test
    public void testDeserializePattern() throws Exception {
        FromStringDeserializer<Pattern> deserializer = new FromStringDeserializer.Std(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("a.*b");
        Pattern pattern = deserializer.deserialize(p, ctxt);
        assertTrue(pattern.matcher("acccb").matches());
    }

    @Test
    public void testDeserializePatternMalformed() throws Exception {
        FromStringDeserializer<Pattern> deserializer = new FromStringDeserializer.Std(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("["); // Malformed regex
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected IllegalArgumentException for malformed regex");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // --- Tests for Locale deserialization ---
    @Test
    public void testDeserializeLocaleLangOnly() throws Exception {
        FromStringDeserializer<Locale> deserializer = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("fr");
        Locale locale = deserializer.deserialize(p, ctxt);
        assertEquals("fr", locale.getLanguage());
        assertTrue(locale.getCountry().isEmpty());
        assertTrue(locale.getVariant().isEmpty());
    }

    @Test
    public void testDeserializeLocaleLangCountry() throws Exception {
        FromStringDeserializer<Locale> deserializer = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("en_US");
        Locale locale = deserializer.deserialize(p, ctxt);
        assertEquals("en", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertTrue(locale.getVariant().isEmpty());
    }

    @Test
    public void testDeserializeLocaleLangCountryVariant() throws Exception {
        FromStringDeserializer<Locale> deserializer = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("de_CH_variant");
        Locale locale = deserializer.deserialize(p, ctxt);
        assertEquals("de", locale.getLanguage());
        assertEquals("CH", locale.getCountry());
        assertEquals("variant", locale.getVariant());
    }

    @Test
    public void testDeserializeLocaleEmptyString() throws Exception {
        FromStringDeserializer<Locale> deserializer = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParserForEmptyString();
        Locale locale = deserializer.deserialize(p, ctxt);
        assertEquals(Locale.ROOT, locale); // Overridden behavior for empty string
    }

    // --- Tests for Charset deserialization ---
    @Test
    public void testDeserializeCharset() throws Exception {
        FromStringDeserializer<Charset> deserializer = new FromStringDeserializer.Std(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("UTF-8");
        Charset charset = deserializer.deserialize(p, ctxt);
        assertEquals("UTF-8", charset.name());
    }

    @Test
    public void testDeserializeCharsetUnknown() throws Exception {
        FromStringDeserializer<Charset> deserializer = new FromStringDeserializer.Std(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("UNKNOWN-CHARSET");
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected IllegalArgumentException for unknown charset");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // --- Tests for TimeZone deserialization ---
    @Test
    public void testDeserializeTimeZone() throws Exception {
        FromStringDeserializer<TimeZone> deserializer = new FromStringDeserializer.Std(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("GMT");
        TimeZone timeZone = deserializer.deserialize(p, ctxt);
        assertEquals("GMT", timeZone.getID());
    }

    @Test
    public void testDeserializeTimeZoneInvalid() throws Exception {
        FromStringDeserializer<TimeZone> deserializer = new FromStringDeserializer.Std(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("INVALID/TIMEZONE");
        TimeZone timeZone = deserializer.deserialize(p, ctxt);
        assertEquals("GMT", timeZone.getID()); // TimeZone.getTimeZone("invalid") returns GMT
    }

    // --- Tests for InetAddress deserialization ---
    @Test
    public void testDeserializeInetAddressIPv4() throws Exception {
        FromStringDeserializer<InetAddress> deserializer = new FromStringDeserializer.Std(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("127.0.0.1");
        InetAddress address = deserializer.deserialize(p, ctxt);
        assertEquals("127.0.0.1", address.getHostAddress());
    }

    @Test
    public void testDeserializeInetAddressIPv6() throws Exception {
        FromStringDeserializer<InetAddress> deserializer = new FromStringDeserializer.Std(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("::1");
        InetAddress address = deserializer.deserialize(p, ctxt);
        assertEquals("::1", address.getHostAddress());
    }

    @Test
    public void testDeserializeInetAddressHostname() throws Exception {
        FromStringDeserializer<InetAddress> deserializer = new FromStringDeserializer.Std(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("localhost");
        InetAddress address = deserializer.deserialize(p, ctxt);
        // Hostname resolution can be complex and depend on the environment.
        // We can at least assert it's not null and has a host name if resolution succeeds.
        assertNotNull(address);
        // For testing, we might not be able to guarantee localhost resolves to a specific IP,
        // but we can check if the host name is correctly identified.
        // In a real test, one might mock InetAddress.getByName.
        // For this exercise, we'll assume a basic resolution.
        if (address.getHostName().equals("localhost")) {
            // If it resolves to localhost, then this is likely correct.
            assertTrue(true);
        } else {
            // If it resolves to something else, it's still an InetAddress, but might not be 'localhost'.
            // This assertion is weak.
            assertTrue(address.getHostAddress() != null && !address.getHostAddress().isEmpty());
        }
    }

    // --- Tests for InetSocketAddress deserialization ---
    @Test
    public void testDeserializeInetSocketAddressHostPort() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("example.com:8080");
        InetSocketAddress socketAddress = deserializer.deserialize(p, ctxt);
        assertEquals("example.com", socketAddress.getHostName());
        assertEquals(8080, socketAddress.getPort());
    }

    @Test
    public void testDeserializeInetSocketAddressIPv6Port() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("[::1]:80");
        InetSocketAddress socketAddress = deserializer.deserialize(p, ctxt);
        assertEquals("::1", socketAddress.getAddress().getHostAddress());
        assertEquals(80, socketAddress.getPort());
    }

    @Test
    public void testDeserializeInetSocketAddressIPv6NoPort() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("[::1]");
        InetSocketAddress socketAddress = deserializer.deserialize(p, ctxt);
        assertEquals("::1", socketAddress.getAddress().getHostAddress());
        assertEquals(0, socketAddress.getPort()); // Default port is 0
    }

    @Test
    public void testDeserializeInetSocketAddressHostOnly() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParser("localhost");
        InetSocketAddress socketAddress = deserializer.deserialize(p, ctxt);
        assertEquals("localhost", socketAddress.getHostName());
        assertEquals(0, socketAddress.getPort()); // Default port is 0
    }

    // --- Test for null token ---
    @Test
    public void testDeserializeNullToken() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParserForNull();
        // When current token is null, it should throw mappingException
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected JsonMappingException for null token");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    // --- Test UNWRAP_SINGLE_VALUE_ARRAYS feature ---
    @Test
    public void testDeserializeUnwrapSingleValueArrayEnabled() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);

        MockJsonParser p = new MockJsonParser(JsonToken.START_ARRAY, null);
        p.setTokenSequence(JsonToken.VALUE_STRING, JsonToken.END_ARRAY); // Sequence: START_ARRAY, VALUE_STRING, END_ARRAY
        p.setCurrentValue("/path/to/file/in/array"); // Set value for VALUE_STRING

        File file = deserializer.deserialize(p, ctxt);
        assertEquals("/path/to/file/in/array", file.getPath());
    }

    @Test
    public void testDeserializeUnwrapSingleValueArrayEnabledMultipleValues() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);

        MockJsonParser p = new MockJsonParser(JsonToken.START_ARRAY, null);
        // Sequence: START_ARRAY, VALUE_STRING, VALUE_STRING, END_ARRAY
        // The second VALUE_STRING should trigger the exception.
        p.setTokenSequence(JsonToken.VALUE_STRING, JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        p.setCurrentValue("/path/to/file");

        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected JsonMappingException for multiple values in unwrapped array");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Attempted to unwrap single value array"));
        }
    }

    // --- Test embedded objects ---
    @Test
    public void testDeserializeEmbeddedObject() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();
        File embeddedFile = new File("/embedded/path");
        JsonParser p = createMockParserForEmbedded(embeddedFile);

        File deserializedFile = deserializer.deserialize(p, ctxt);
        assertSame(embeddedFile, deserializedFile); // Should return the exact instance
    }

    @Test
    public void testDeserializeEmbeddedNullObject() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = createMockParserForEmbedded(null);

        File deserializedFile = deserializer.deserialize(p, ctxt);
        assertNull(deserializedFile);
    }

    // Test for embedded object of wrong type (should delegate to _deserializeEmbedded)
    @Test
    public void testDeserializeEmbeddedObjectWrongType() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();
        String embeddedString = "not a file";
        JsonParser p = createMockParserForEmbedded(embeddedString);

        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected JsonMappingException for wrong embedded object type");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Don't know how to convert embedded Object"));
            assertTrue(e.getMessage().contains(String.class.getName()));
            assertTrue(e.getMessage().contains(File.class.getName()));
        }
    }

    // --- Test for non-string token ---
    @Test
    public void testDeserializeNonStringToken() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();
        JsonParser p = new MockJsonParser(JsonToken.VALUE_NUMBER_INT, "123"); // Not a string token

        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected JsonMappingException for non-string token");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    // --- Test findDeserializer method ---
    @Test
    public void testFindDeserializerFile() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(File.class);
        assertNotNull(deserializer);
        assertEquals(File.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_FILE, deserializer._kind);
    }

    @Test
    public void testFindDeserializerURL() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(URL.class);
        assertNotNull(deserializer);
        assertEquals(URL.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_URL, deserializer._kind);
    }

    @Test
    public void testFindDeserializerURI() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(URI.class);
        assertNotNull(deserializer);
        assertEquals(URI.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_URI, deserializer._kind);
    }

    @Test
    public void testFindDeserializerClass() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Class.class);
        assertNotNull(deserializer);
        assertEquals(Class.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_CLASS, deserializer._kind);
    }

    @Test
    public void testFindDeserializerJavaType() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(JavaType.class);
        assertNotNull(deserializer);
        assertEquals(JavaType.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_JAVA_TYPE, deserializer._kind);
    }

    @Test
    public void testFindDeserializerCurrency() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Currency.class);
        assertNotNull(deserializer);
        assertEquals(Currency.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_CURRENCY, deserializer._kind);
    }

    @Test
    public void testFindDeserializerPattern() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Pattern.class);
        assertNotNull(deserializer);
        assertEquals(Pattern.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_PATTERN, deserializer._kind);
    }

    @Test
    public void testFindDeserializerLocale() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Locale.class);
        assertNotNull(deserializer);
        assertEquals(Locale.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_LOCALE, deserializer._kind);
    }

    @Test
    public void testFindDeserializerCharset() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(Charset.class);
        assertNotNull(deserializer);
        assertEquals(Charset.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_CHARSET, deserializer._kind);
    }

    @Test
    public void testFindDeserializerTimeZone() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(TimeZone.class);
        assertNotNull(deserializer);
        assertEquals(TimeZone.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_TIME_ZONE, deserializer._kind);
    }

    @Test
    public void testFindDeserializerInetAddress() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(InetAddress.class);
        assertNotNull(deserializer);
        assertEquals(InetAddress.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_INET_ADDRESS, deserializer._kind);
    }

    @Test
    public void testFindDeserializerInetSocketAddress() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        assertNotNull(deserializer);
        assertEquals(InetSocketAddress.class, deserializer._valueClass);
        assertEquals(FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS, deserializer._kind);
    }

    @Test
    public void testFindDeserializerUnsupportedType() {
        FromStringDeserializer.Std deserializer = FromStringDeserializer.findDeserializer(String.class);
        assertNull(deserializer);
    }

    // --- Test types() method ---
    @Test
    public void testTypesMethod() {
        Class<?>[] types = FromStringDeserializer.types();
        assertNotNull(types);
        assertEquals(12, types.length);
        assertEquals(File.class, types[0]);
        assertEquals(URL.class, types[1]);
        assertEquals(URI.class, types[2]);
        assertEquals(Class.class, types[3]);
        assertEquals(JavaType.class, types[4]);
        assertEquals(Currency.class, types[5]);
        assertEquals(Pattern.class, types[6]);
        assertEquals(Locale.class, types[7]);
        assertEquals(Charset.class, types[8]);
        assertEquals(TimeZone.class, types[9]);
        assertEquals(InetAddress.class, types[10]);
        assertEquals(InetSocketAddress.class, types[11]);
    }
}





