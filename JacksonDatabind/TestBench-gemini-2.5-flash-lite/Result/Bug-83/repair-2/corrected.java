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
    private DeserializationContext mockContext() {
        DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        Mockito.when(ctxt.getTypeFactory()).thenReturn(com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance());
        // Mock findClass to throw ClassNotFoundException for any input
        Mockito.when(ctxt.findClass(Mockito.anyString())).thenThrow(new ClassNotFoundException("Mock Class Not Found"));
        // Mock handleInstantiationProblem to return null for simplicity, as it's a fallback
        Mockito.when(ctxt.handleInstantiationProblem(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(null);
        // Mock reportMappingException to throw a JsonMappingException
        // This method returns void, so we use doThrow
        Mockito.doThrow(new JsonMappingException(null, "Mock Mapping Exception")).when(ctxt).reportMappingException(Mockito.anyString(), Mockito.anyVararg());
        // Mock weirdStringException to throw an InvalidFormatException
        Mockito.when(ctxt.weirdStringException(Mockito.anyString(), Mockito.any(), Mockito.anyString())).thenThrow(new InvalidFormatException(null, "Mock Invalid Format", null, null));
        // Mock handleUnexpectedToken to throw a JsonMappingException
        Mockito.when(ctxt.handleUnexpectedToken(Mockito.any(), Mockito.any())).thenThrow(new JsonMappingException(null, "Mock Unexpected Token"));
        // Mock behavior for getParser()
        Mockito.when(ctxt.getParser()).thenReturn(mockParser());

        // Default behavior for DeserializationFeatures
        Mockito.when(ctxt.isEnabled(Mockito.any())).thenReturn(false);
        Mockito.when(ctxt.getDeserializationFeatures()).thenReturn(0);
        Mockito.when(ctxt.hasDeserializationFeatures(Mockito.anyInt())).thenReturn(false);
        Mockito.when(ctxt.hasSomeOfFeatures(Mockito.anyInt())).thenReturn(false);

        return ctxt;
    }

    // Mock JsonParser to return specific values for getValueAsString and getCurrentToken
    private JsonParser mockParser() {
        JsonParser p = Mockito.mock(JsonParser.class);
        // Default: return null for getValueAsString, as many tests start with this.
        Mockito.when(p.getValueAsString()).thenReturn(null);
        Mockito.when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING); // Default to string for tests that expect it.
        return p;
    }

    // Helper to create a Std deserializer instance
    private FromStringDeserializer.Std createStdDeserializer(Class<?> valueType, int kind) {
        return new FromStringDeserializer.Std(valueType, kind);
    }

    // --- Tests for deserializing specific types ---

    @Test
    public void testDeserializeFile() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getValueAsString()).thenReturn("path/to/file.txt");
        File result = (File) deserializer.deserialize(p, ctxt);
        assertEquals("path/to/file.txt", result.getPath());
    }

    @Test
    public void testDeserializeFileEmptyString() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getValueAsString()).thenReturn("");
        Object result = deserializer.deserialize(p, ctxt);
        assertNull(result);
    }
    
    @Test
    public void testDeserializeFileTrimmedEmptyString() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getValueAsString()).thenReturn("   ");
        Object result = deserializer.deserialize(p, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserializeURL() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(URL.class, FromStringDeserializer.Std.STD_URL);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String urlString = "http://example.com";
        Mockito.when(p.getValueAsString()).thenReturn(urlString);
        URL result = (URL) deserializer.deserialize(p, ctxt);
        assertEquals(urlString, result.toExternalForm());
    }

    @Test
    public void testDeserializeURI() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(URI.class, FromStringDeserializer.Std.STD_URI);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String uriString = "http://example.com/path";
        Mockito.when(p.getValueAsString()).thenReturn(uriString);
        URI result = (URI) deserializer.deserialize(p, ctxt);
        assertEquals(uriString, result.toString());
    }

    @Test
    public void testDeserializeURIMalformed() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(URI.class, FromStringDeserializer.Std.STD_URI);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getValueAsString()).thenReturn("invalid uri");
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getMessage().contains("invalid uri"));
        }
    }

    @Test
    public void testDeserializeURIEmptyString() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(URI.class, FromStringDeserializer.Std.STD_URI);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getValueAsString()).thenReturn("");
        URI result = (URI) deserializer._deserializeFromEmptyString(); // Use protected method directly for this specific case
        assertEquals("", result.toString());
    }

    @Test
    public void testDeserializeClass() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Class.class, FromStringDeserializer.Std.STD_CLASS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String className = "java.lang.String";
        Mockito.when(p.getValueAsString()).thenReturn(className);
        // Mock findClass to return a specific Class object
        Class<?> expectedClass = String.class;
        Mockito.when(ctxt.findClass(className)).thenReturn(expectedClass);
        Class<?> result = (Class<?>) deserializer.deserialize(p, ctxt);
        assertEquals(expectedClass, result);
    }

    @Test
    public void testDeserializeClassNotFound() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Class.class, FromStringDeserializer.Std.STD_CLASS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String className = "com.example.NonExistentClass";
        Mockito.when(p.getValueAsString()).thenReturn(className);
        // Mock findClass to throw ClassNotFoundException
        Mockito.when(ctxt.findClass(className)).thenThrow(new ClassNotFoundException("Mock Class Not Found"));
        // Mock handleInstantiationProblem to return null, as it's called when findClass fails
        Mockito.when(ctxt.handleInstantiationProblem(Mockito.eq(Class.class), Mockito.eq(className), Mockito.any(Throwable.class)))
                .thenReturn(null); // Based on the mock, this is what handleInstantiationProblem returns
        Object result = deserializer.deserialize(p, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserializeJavaType() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(JavaType.class, FromStringDeserializer.Std.STD_JAVA_TYPE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String canonicalName = "java.util.ArrayList<java.lang.String>";
        Mockito.when(p.getValueAsString()).thenReturn(canonicalName);
        // Mock constructFromCanonical to return a valid JavaType
        JavaType mockJavaType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructFromCanonical(canonicalName);
        Mockito.when(ctxt.getTypeFactory().constructFromCanonical(canonicalName)).thenReturn(mockJavaType);
        JavaType result = (JavaType) deserializer.deserialize(p, ctxt);
        assertEquals(mockJavaType, result);
    }

    @Test
    public void testDeserializeCurrency() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String currencyCode = "USD";
        Mockito.when(p.getValueAsString()).thenReturn(currencyCode);
        Currency result = (Currency) deserializer.deserialize(p, ctxt);
        assertEquals(Currency.getInstance(currencyCode), result);
    }

    @Test
    public void testDeserializeCurrencyInvalid() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String invalidCurrencyCode = "XYZ";
        Mockito.when(p.getValueAsString()).thenReturn(invalidCurrencyCode);
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected InvalidFormatException for invalid currency");
        } catch (InvalidFormatException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getMessage().contains("problem:"));
            assertTrue(e.getMessage().contains("XYZ")); // Ensure the invalid code is mentioned
        }
    }

    @Test
    public void testDeserializePattern() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String regex = "^start.*end$";
        Mockito.when(p.getValueAsString()).thenReturn(regex);
        Pattern result = (Pattern) deserializer.deserialize(p, ctxt);
        assertEquals(regex, result.pattern());
    }

    @Test
    public void testDeserializePatternMalformed() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String malformedRegex = "["; // Malformed regex
        Mockito.when(p.getValueAsString()).thenReturn(malformedRegex);
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected InvalidFormatException for malformed regex");
        } catch (InvalidFormatException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getMessage().contains("problem:"));
        }
    }

    @Test
    public void testDeserializeLocaleSimple() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String localeStr = "en";
        Mockito.when(p.getValueAsString()).thenReturn(localeStr);
        Locale result = (Locale) deserializer.deserialize(p, ctxt);
        assertEquals(Locale.ENGLISH, result);
    }

    @Test
    public void testDeserializeLocaleTwoPart() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String localeStr = "en_US";
        Mockito.when(p.getValueAsString()).thenReturn(localeStr);
        Locale result = (Locale) deserializer.deserialize(p, ctxt);
        assertEquals(new Locale("en", "US"), result);
    }

    @Test
    public void testDeserializeLocaleThreePart() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String localeStr = "en_US_POSIX";
        Mockito.when(p.getValueAsString()).thenReturn(localeStr);
        Locale result = (Locale) deserializer.deserialize(p, ctxt);
        assertEquals(new Locale("en", "US", "POSIX"), result);
    }
    
    @Test
    public void testDeserializeLocaleUnderscore() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String localeStr = "fr_CA";
        Mockito.when(p.getValueAsString()).thenReturn(localeStr);
        Locale result = (Locale) deserializer.deserialize(p, ctxt);
        assertEquals(new Locale("fr", "CA"), result);
    }
    
    @Test
    public void testDeserializeLocaleEmptyString() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getValueAsString()).thenReturn("");
        Object result = deserializer._deserializeFromEmptyString(); // Use protected method directly
        assertEquals(Locale.ROOT, result);
    }

    @Test
    public void testDeserializeCharset() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String charsetName = "UTF-8";
        Mockito.when(p.getValueAsString()).thenReturn(charsetName);
        Charset result = (Charset) deserializer.deserialize(p, ctxt);
        assertEquals(Charset.forName(charsetName), result);
    }

    @Test
    public void testDeserializeCharsetUnsupported() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String unsupportedCharset = "UNSUPPORTED";
        Mockito.when(p.getValueAsString()).thenReturn(unsupportedCharset);
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected InvalidFormatException for unsupported charset");
        } catch (InvalidFormatException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getMessage().contains("problem:"));
        }
    }

    @Test
    public void testDeserializeTimeZone() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String timeZoneId = "GMT";
        Mockito.when(p.getValueAsString()).thenReturn(timeZoneId);
        TimeZone result = (TimeZone) deserializer.deserialize(p, ctxt);
        assertEquals(TimeZone.getTimeZone(timeZoneId), result);
    }

    @Test
    public void testDeserializeTimeZoneInvalid() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String invalidTimeZoneId = "INVALID_TZ_ID";
        Mockito.when(p.getValueAsString()).thenReturn(invalidTimeZoneId);
        // TimeZone.getTimeZone returns a fixed offset GMT for unknown IDs.
        TimeZone result = (TimeZone) deserializer.deserialize(p, ctxt);
        assertEquals("GMT", result.getID());
    }

    @Test
    public void testDeserializeInetAddress() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String ipAddress = "127.0.0.1";
        Mockito.when(p.getValueAsString()).thenReturn(ipAddress);
        InetAddress result = (InetAddress) deserializer.deserialize(p, ctxt);
        assertEquals(ipAddress, result.getHostAddress());
    }

    @Test
    public void testDeserializeInetAddressInvalid() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String invalidIpAddress = "invalid-ip";
        Mockito.when(p.getValueAsString()).thenReturn(invalidIpAddress);
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected InvalidFormatException for invalid IP address");
        } catch (InvalidFormatException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getMessage().contains("problem:"));
        }
    }

    @Test
    public void testDeserializeInetSocketAddressHostPort() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String addressStr = "localhost:8080";
        Mockito.when(p.getValueAsString()).thenReturn(addressStr);
        InetSocketAddress result = (InetSocketAddress) deserializer.deserialize(p, ctxt);
        assertEquals("localhost", result.getHostName());
        assertEquals(8080, result.getPort());
    }

    @Test
    public void testDeserializeInetSocketAddressHostOnly() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String addressStr = "example.com";
        Mockito.when(p.getValueAsString()).thenReturn(addressStr);
        InetSocketAddress result = (InetSocketAddress) deserializer.deserialize(p, ctxt);
        assertEquals("example.com", result.getHostName());
        assertEquals(0, result.getPort()); // Default port is 0 if not specified
    }
    
    @Test
    public void testDeserializeInetSocketAddressIPv6WithPort() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String addressStr = "[::1]:8080";
        Mockito.when(p.getValueAsString()).thenReturn(addressStr);
        InetSocketAddress result = (InetSocketAddress) deserializer.deserialize(p, ctxt);
        assertEquals("::1", result.getAddress().getHostAddress());
        assertEquals(8080, result.getPort());
    }

    @Test
    public void testDeserializeInetSocketAddressIPv6NoPort() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String addressStr = "[::1]";
        Mockito.when(p.getValueAsString()).thenReturn(addressStr);
        InetSocketAddress result = (InetSocketAddress) deserializer.deserialize(p, ctxt);
        assertEquals("::1", result.getAddress().getHostAddress());
        assertEquals(0, result.getPort()); // Default port is 0 if not specified
    }

    @Test
    public void testDeserializeInetSocketAddressInvalidIPv6Format() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String addressStr = ":::1]"; // Missing opening bracket
        Mockito.when(p.getValueAsString()).thenReturn(addressStr);
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected InvalidFormatException for invalid IPv6 format");
        } catch (InvalidFormatException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getValue().toString().contains(":::1]"));
        }
    }
    
    @Test
    public void testDeserializeStringBuilder() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(StringBuilder.class, FromStringDeserializer.Std.STD_STRING_BUILDER);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        String text = "Hello, world!";
        Mockito.when(p.getValueAsString()).thenReturn(text);
        StringBuilder result = (StringBuilder) deserializer.deserialize(p, ctxt);
        assertEquals(text, result.toString());
    }
    
    @Test
    public void testDeserializeStringBuilderEmptyString() throws Exception {
        FromStringDeserializer.Std deserializer = createStdDeserializer(StringBuilder.class, FromStringDeserializer.Std.STD_STRING_BUILDER);
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getValueAsString()).thenReturn("");
        Object result = deserializer._deserializeFromEmptyString(); // Use protected method directly
        assertEquals("", result.toString());
    }

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

    @Test
    public void testDeserializeNullString() throws Exception {
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getValueAsString()).thenReturn(null); // Explicitly return null
        // The kinds are File(1) to StringBuilder(13)
        for (int kind = 1; kind <= 13; kind++) {
            FromStringDeserializer.Std deserializer = createStdDeserializer(Object.class, kind);
            Object result = deserializer.deserialize(p, ctxt);
            assertNull("Should return null for null input string (kind: " + kind + ")", result);
        }
    }
    
    @Test
    public void testDeserializeUnexpectedToken() throws Exception {
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        Mockito.when(p.getCurrentToken()).thenReturn(JsonToken.START_OBJECT);
        Mockito.when(p.getValueAsString()).thenReturn(null); // Ensure it doesn't hit the string path
        
        FromStringDeserializer.Std deserializer = createStdDeserializer(File.class, FromStringDeserializer.Std.STD_FILE);
        
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected JsonMappingException for unexpected token");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Mock Unexpected Token"));
        }
    }
    
    @Test
    public void testDeserializeEmbeddedObject() throws Exception {
        DeserializationContext ctxt = mockContext();
        JsonParser p = mockParser();
        
        // Test with null embedded object
        Mockito.when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        Mockito.when(p.getEmbeddedObject()).thenReturn(null);
        FromStringDeserializer.Std deserializerNull = createStdDeserializer(File.class, FromStringDeserializer.Std.STD_FILE);
        Object resultNull = deserializerNull.deserialize(p, ctxt);
        assertNull(resultNull);

        // Test with an object of the correct type
        File existingFile = new File("existing.txt");
        Mockito.when(p.getEmbeddedObject()).thenReturn(existingFile);
        FromStringDeserializer.Std deserializerFile = createStdDeserializer(File.class, FromStringDeserializer.Std.STD_FILE);
        Object resultFile = deserializerFile.deserialize(p, ctxt);
        assertSame(existingFile, resultFile); // Should return the exact instance

        // Test with an object of an incompatible type
        String incompatibleObject = "not a file";
        Mockito.when(p.getEmbeddedObject()).thenReturn(incompatibleObject);
        // Mock reportMappingException to throw a JsonMappingException as expected for incompatible types
        // reportMappingException returns void, so use doThrow
        Mockito.doThrow(new JsonMappingException(null, "Mock Mapping Exception for embedded object")).when(ctxt).reportMappingException(Mockito.contains("Don't know how to convert embedded Object"), Mockito.anyVararg());
        FromStringDeserializer.Std deserializerIncompatible = createStdDeserializer(File.class, FromStringDeserializer.Std.STD_FILE);
        try {
            deserializerIncompatible.deserialize(p, ctxt);
            fail("Expected JsonMappingException for incompatible embedded object");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Mock Mapping Exception for embedded object"));
        }
    }

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
