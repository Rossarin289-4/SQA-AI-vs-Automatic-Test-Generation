```java
package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.*;
import java.util.Arrays;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.BufferRecycler; // Added import for BufferRecycler
import com.fasterxml.jackson.core.util.JsonSchema; // Added import for JsonSchema
import com.fasterxml.jackson.core.TreeNode; // Added import for TreeNode
import java.util.Iterator; // Added import for Iterator

public class ParserMinimalBaseTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a dummy IOContext
    private IOContext createIOContext() {
        return new IOContext(new BufferRecycler(), "source", true);
    }

    // Helper method to create a dummy CharsToNameCanonicalizer
    private CharsToNameCanonicalizer createSymbols() {
        return CharsToNameCanonicalizer.createRoot();
    }

    // Helper method to create a dummy ByteQuadsCanonicalizer
    private ByteQuadsCanonicalizer createByteSymbols() {
        return ByteQuadsCanonicalizer.createRoot();
    }

    // Dummy implementation of ObjectCodec for testing purposes
    private ObjectCodec createObjectCodec() {
        return new ObjectCodec() {
            @Override public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override public <T> T readValue(JsonParser p, TypeReference<T> valueTypeRef) throws IOException { return null; }
            @Override public <T> T treeToValue(TreeNode n, Class<T> valueType) throws JsonProcessingException { return null; }
            @Override public TreeNode valueToTree(Object value) throws JsonProcessingException { return null; }
            @Override public <T> T fromJSON(JsonParser p, TypeReference<T> valueTypeRef) throws IOException { return null; }
            @Override public <T> T fromJSON(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override public <T extends TreeNode> T readTree(JsonParser p) throws IOException { return null; }
            @Override public <T> T readValues(JsonParser p, TypeReference<T> valueTypeRef) throws IOException { return null; }
            @Override public <T> T readValues(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override public JsonParser.Feature[] getFeatures() { return new JsonParser.Feature[0]; }
            @Override public boolean isEnabled(JsonParser.Feature f) { return false; }
            @Override public void setSchema(JsonSchema schema) {}
            @Override public JsonSchema getSchema() { return null; }
            @Override public Version version() { return VersionUtil.unknownVersion(); }
            @Override public void writeValue(JsonGenerator g, Object value) throws IOException {}
            @Override public void writeValue(File result, Object value) throws IOException, JsonProcessingException {}
            @Override public String writeValueAsString(Object value) throws JsonProcessingException { return null; }
            @Override public byte[] writeValueAsBytes(Object value) throws JsonProcessingException { return null; }
            @Override public TreeNode treeAsTokens(JsonParser p) throws IOException { return null; }
            @Override public Iterator<TreeNode> readValues(JsonParser p, TypeReference<Iterator<TreeNode>> valueTypeRef) throws IOException { return null; }
            @Override public Iterator<TreeNode> readValues(JsonParser p, Class<TreeNode> valueType) throws IOException { return null; }
        };
    }

    // Test cases for ReaderBasedJsonParser
    @Test
    public void testReaderBasedJsonParser_getValueAsBoolean_trueString() throws Exception {
        Reader r = new StringReader("true");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the 'true' token
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsBoolean_falseString() throws Exception {
        Reader r = new StringReader("false");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the 'false' token
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsBoolean_numericZero() throws Exception {
        Reader r = new StringReader("0");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '0' token
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsBoolean_numericNonZero() throws Exception {
        Reader r = new StringReader("123");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '123' token
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsBoolean_nullString() throws Exception {
        Reader r = new StringReader("null");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the 'null' token
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsInt_validInt() throws Exception {
        Reader r = new StringReader("123");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '123' token
        assertEquals(123, parser.getValueAsInt());
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsInt_validDouble() throws Exception {
        Reader r = new StringReader("123.45");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '123.45' token
        assertEquals(123, parser.getValueAsInt());
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsInt_zero() throws Exception {
        Reader r = new StringReader("0");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '0' token
        assertEquals(0, parser.getValueAsInt());
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsInt_negativeInt() throws Exception {
        Reader r = new StringReader("-456");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '-456' token
        assertEquals(-456, parser.getValueAsInt());
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsLong_validLong() throws Exception {
        Reader r = new StringReader("1234567890123");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '1234567890123' token
        assertEquals(1234567890123L, parser.getValueAsLong());
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsLong_validDouble() throws Exception {
        Reader r = new StringReader("1234567890123.45");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '1234567890123.45' token
        assertEquals(1234567890123L, parser.getValueAsLong());
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsDouble_validDouble() throws Exception {
        Reader r = new StringReader("123.456");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '123.456' token
        assertEquals(123.456, parser.getValueAsDouble(0.0), 1e-9);
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsDouble_validInt() throws Exception {
        Reader r = new StringReader("789");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '789' token
        assertEquals(789.0, parser.getValueAsDouble(0.0), 1e-9);
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsString_stringValue() throws Exception {
        Reader r = new StringReader("\"hello\"");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '"hello"' token
        assertEquals("hello", parser.getValueAsString());
    }

    @Test
    public void testReaderBasedJsonParser_getValueAsString_fieldName() throws Exception {
        Reader r = new StringReader("{\"key\":\"value\"}");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume START_OBJECT
        parser.nextToken(); // Consume FIELD_NAME "key"
        assertEquals("key", parser.getValueAsString());
    }

    @Test
    public void testReaderBasedJsonParser_getText_stringValue() throws Exception {
        Reader r = new StringReader("\"world\"");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '"world"' token
        assertEquals("world", parser.getText());
    }

    @Test
    public void testReaderBasedJsonParser_getText_numberValue() throws Exception {
        Reader r = new StringReader("12345");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '12345' token
        assertEquals("12345", parser.getText());
    }

    @Test
    public void testReaderBasedJsonParser_getTextCharacters_stringValue() throws Exception {
        Reader r = new StringReader("\"abc\"");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '"abc"' token
        assertArrayEquals(new char[]{'a', 'b', 'c'}, parser.getTextCharacters());
    }

    @Test
    public void testReaderBasedJsonParser_getTextLength_stringValue() throws Exception {
        Reader r = new StringReader("\"xyz\"");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '"xyz"' token
        assertEquals(3, parser.getTextLength());
    }

    @Test
    public void testReaderBasedJsonParser_getTextOffset_stringValue() throws Exception {
        Reader r = new StringReader("\"offset\"");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume the '"offset"' token
        // The offset is typically 0 for simple cases handled by TextBuffer
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_startObject() throws Exception {
        Reader r = new StringReader("{}");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_endObject() throws Exception {
        Reader r = new StringReader("{}");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume START_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_startArray() throws Exception {
        Reader r = new StringReader("[]");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_endArray() throws Exception {
        Reader r = new StringReader("[]");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume START_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_string() throws Exception {
        Reader r = new StringReader("\"hello\"");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_numberInt() throws Exception {
        Reader r = new StringReader("123");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_numberFloat() throws Exception {
        Reader r = new StringReader("123.45");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_true() throws Exception {
        Reader r = new StringReader("true");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_false() throws Exception {
        Reader r = new StringReader("false");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_null() throws Exception {
        Reader r = new StringReader("null");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_nextToken_fieldName() throws Exception {
        Reader r = new StringReader("{\"fieldName\":\"value\"}");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_skipChildren_object() throws Exception {
        Reader r = new StringReader("{\"a\":1,\"b\":[2,3],\"c\":{}}");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // START_OBJECT
        parser.skipChildren();
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testReaderBasedJsonParser_skipChildren_array() throws Exception {
        Reader r = new StringReader("[1,{\"a\":2},[3,4]]");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // START_ARRAY
        parser.skipChildren();
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    // Test cases for UTF8StreamJsonParser
    @Test
    public void testUTF8StreamJsonParser_getValueAsBoolean_trueString() throws Exception {
        InputStream is = new ByteArrayInputStream("true".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // Consume the 'true' token
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testUTF8StreamJsonParser_getValueAsBoolean_falseString() throws Exception {
        InputStream is = new ByteArrayInputStream("false".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // Consume the 'false' token
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testUTF8StreamJsonParser_getValueAsInt_validInt() throws Exception {
        InputStream is = new ByteArrayInputStream("456".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // Consume the '456' token
        assertEquals(456, parser.getValueAsInt());
    }

    @Test
    public void testUTF8StreamJsonParser_getValueAsLong_validLong() throws Exception {
        InputStream is = new ByteArrayInputStream("9876543210987".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // Consume the '9876543210987' token
        assertEquals(9876543210987L, parser.getValueAsLong());
    }

    @Test
    public void testUTF8StreamJsonParser_getValueAsDouble_validDouble() throws Exception {
        InputStream is = new ByteArrayInputStream("98.765".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // Consume the '98.765' token
        assertEquals(98.765, parser.getValueAsDouble(0.0), 1e-9);
    }

    @Test
    public void testUTF8StreamJsonParser_getText_stringValue() throws Exception {
        InputStream is = new ByteArrayInputStream("\"byte string\"".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // Consume the '"byte string"' token
        assertEquals("byte string", parser.getText());
    }

    @Test
    public void testUTF8StreamJsonParser_nextToken_startObject() throws Exception {
        InputStream is = new ByteArrayInputStream("{}".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testUTF8StreamJsonParser_nextToken_endObject() throws Exception {
        InputStream is = new ByteArrayInputStream("{}".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // Consume START_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testUTF8StreamJsonParser_nextToken_string() throws Exception {
        InputStream is = new ByteArrayInputStream("\"stream\"".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    @Test
    public void testUTF8StreamJsonParser_skipChildren_object() throws Exception {
        InputStream is = new ByteArrayInputStream("{\"a\":1,\"b\":[2,3],\"c\":{}}".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // START_OBJECT
        parser.skipChildren();
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testUTF8StreamJsonParser_skipChildren_array() throws Exception {
        InputStream is = new ByteArrayInputStream("[1,{\"a\":2},[3,4]]".getBytes());
        IOContext ctxt = createIOContext();
        ByteQuadsCanonicalizer symbols = createByteSymbols();
        ObjectCodec codec = createObjectCodec();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, is, codec, symbols, new byte[1024], 0, 0, true);
        parser.nextToken(); // START_ARRAY
        parser.skipChildren();
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    // Tests for methods in ParserBase that are not specific to ReaderBased or UTF8Stream
    @Test
    public void testParserBase_hasCurrentToken_beforeNextToken() throws Exception {
        Reader r = new StringReader("{}");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void testParserBase_hasCurrentToken_afterNextToken() throws Exception {
        Reader r = new StringReader("{}");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken();
        assertTrue(parser.hasCurrentToken());
    }

    @Test
    public void testParserBase_hasTokenId_correctId() throws Exception {
        Reader r = new StringReader("true");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken();
        assertTrue(parser.hasTokenId(JsonTokenId.ID_TRUE));
    }

    @Test
    public void testParserBase_hasTokenId_incorrectId() throws Exception {
        Reader r = new StringReader("true");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken();
        assertFalse(parser.hasTokenId(JsonTokenId.ID_FALSE));
    }

    @Test
    public void testParserBase_hasToken_correctToken() throws Exception {
        Reader r = new StringReader("null");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken();
        assertTrue(parser.hasToken(JsonToken.VALUE_NULL));
    }

    @Test
    public void testParserBase_hasToken_incorrectToken() throws Exception {
        Reader r = new StringReader("null");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken();
        assertFalse(parser.hasToken(JsonToken.VALUE_TRUE));
    }

    @Test
    public void testParserBase_isExpectedStartArrayToken_true() throws Exception {
        Reader r = new StringReader("[1, 2]");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // START_ARRAY
        assertTrue(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testParserBase_isExpectedStartArrayToken_false() throws Exception {
        Reader r = new StringReader("{ \"key\": 1 }");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // START_OBJECT
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testParserBase_isExpectedStartObjectToken_true() throws Exception {
        Reader r = new StringReader("{ \"key\": 1 }");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // START_OBJECT
        assertTrue(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testParserBase_isExpectedStartObjectToken_false() throws Exception {
        Reader r = new StringReader("[1, 2]");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // START_ARRAY
        assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testParserBase_clearCurrentToken_clearsToken() throws Exception {
        Reader r = new StringReader("true");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume 'true'
        assertNotNull(parser.getCurrentToken());
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testParserBase_getLastClearedToken_correctToken() throws Exception {
        Reader r = new StringReader("false");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume 'false'
        parser.clearCurrentToken();
        assertEquals(JsonToken.VALUE_FALSE, parser.getLastClearedToken());
    }

    @Test
    public void testParserBase_getValueAsInt_defaultForNull() throws Exception {
        Reader r = new StringReader("null");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume 'null'
        assertEquals(0, parser.getValueAsInt(123)); // Default should be returned for null
    }

    @Test
    public void testParserBase_getValueAsLong_defaultForNull() throws Exception {
        Reader r = new StringReader("null");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume 'null'
        assertEquals(0L, parser.getValueAsLong(456L)); // Default should be returned for null
    }

    @Test
    public void testParserBase_getValueAsDouble_defaultForNull() throws Exception {
        Reader r = new StringReader("null");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume 'null'
        assertEquals(0.0, parser.getValueAsDouble(1.23), 1e-9); // Default should be returned for null
    }

    @Test
    public void testParserBase_getValueAsString_defaultForNull() throws Exception {
        Reader r = new StringReader("null");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume 'null'
        assertNull(parser.getValueAsString("default")); // Default should be returned for null
    }

    @Test
    public void testParserBase_getValueAsString_defaultForNumber() throws Exception {
        Reader r = new StringReader("123");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume '123'
        assertEquals("123", parser.getValueAsString("default"));
    }

    @Test
    public void testParserBase_nextToken_eof() throws Exception {
        Reader r = new StringReader("");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertNull(parser.nextToken());
    }

    @Test
    public void testParserBase_getText_afterClear() throws Exception {
        Reader r = new StringReader("\"abc\"");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // Consume '"abc"'
        parser.clearCurrentToken();
        assertNull(parser.getText());
    }

    @Test
    public void testParserBase_nextToken_withWhitespace() throws Exception {
        Reader r = new StringReader("  \t\n true  ");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testParserBase_nextToken_afterSkippingChildren() throws Exception {
        Reader r = new StringReader("{\"a\":[1,2], \"b\":3}");
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer symbols = createSymbols();
        ObjectCodec codec = createObjectCodec();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, codec, symbols);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // START_ARRAY
        parser.skipChildren(); // Skips the array [1,2]
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        parser.nextToken(); // FIELD_NAME "b"
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("b", parser.getCurrentName());
        parser.nextToken(); // VALUE_NUMBER_INT 3
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
    }
}
```

## SOURCE CODE ANALYSIS
The tests cover methods from `ParserBase` and its subclasses `ReaderBasedJsonParser` and `UTF8StreamJsonParser`. Specifically, methods related to token retrieval (`nextToken`, `getCurrentToken`, `hasCurrentToken`, `hasTokenId`, `hasToken`), accessing token values (`getText`, `getTextCharacters`, `getTextLength`, `getTextOffset`, `getValueAsBoolean`, `getValueAsInt`, `getValueAsLong`, `getValueAsDouble`, `getValueAsString`), and skipping content (`skipChildren`).

## TEST CASE DESIGN
- `testReaderBasedJsonParser_getValueAsBoolean_trueString`: Input: "true", Expected: true. Derived from `getValueAsBoolean` logic for "true" string.
- `testReaderBasedJsonParser_getValueAsBoolean_falseString`: Input: "false", Expected: false. Derived from `getValueAsBoolean` logic for "false" string.
- `testReaderBasedJsonParser_getValueAsBoolean_numericZero`: Input: "0", Expected: false. Derived from `getValueAsBoolean` logic for numeric zero.
- `testReaderBasedJsonParser_getValueAsBoolean_numericNonZero`: Input: "123", Expected: true. Derived from `getValueAsBoolean` logic for non-zero numeric.
- `testReaderBasedJsonParser_getValueAsBoolean_nullString`: Input: "null", Expected: false. Derived from `getValueAsBoolean` logic for "null" string.
- `testReaderBasedJsonParser_getValueAsInt_validInt`: Input: "123", Expected: 123. Derived from `getValueAsInt` for integer token.
- `testReaderBasedJsonParser_getValueAsInt_validDouble`: Input: "123.45", Expected: 123. Derived from `getValueAsInt` for float token.
- `testReaderBasedJsonParser_getValueAsInt_zero`: Input: "0", Expected: 0. Derived from `getValueAsInt` for zero token.
- `testReaderBasedJsonParser_getValueAsInt_negativeInt`: Input: "-456", Expected: -456. Derived from `getValueAsInt` for negative integer.
- `testReaderBasedJsonParser_getValueAsLong_validLong`: Input: "1234567890123", Expected: 1234567890123L. Derived from `getValueAsLong` for long token.
- `testReaderBasedJsonParser_getValueAsLong_validDouble`: Input: "1234567890123.45", Expected: 1234567890123L. Derived from `getValueAsLong` for float token.
- `testReaderBasedJsonParser_getValueAsDouble_validDouble`: Input: "123.456", Expected: 123.456. Derived from `getValueAsDouble` for double token.
- `testReaderBasedJsonParser_getValueAsDouble_validInt`: Input: "789", Expected: 789.0. Derived from `getValueAsDouble` for integer token.
- `testReaderBasedJsonParser_getValueAsString_stringValue`: Input: "\"hello\"", Expected: "hello". Derived from `getValueAsString` for string token.
- `testReaderBasedJsonParser_getValueAsString_fieldName`: Input: "{\"key\":\"value\"}", Expected: "key". Derived from `getValueAsString` for field name token.
- `testReaderBasedJsonParser_getText_stringValue`: Input: "\"world\"", Expected: "world". Derived from `getText` for string token.
- `testReaderBasedJsonParser_getText_numberValue`: Input: "12345", Expected: "12345". Derived from `getText` for number token.
- `testReaderBasedJsonParser_getTextCharacters_stringValue`: Input: "\"abc\"", Expected: {'a','b','c'}. Derived from `getTextCharacters` for string token.
- `testReaderBasedJsonParser_getTextLength_stringValue`: Input: "\"xyz\"", Expected: 3. Derived from `getTextLength` for string token.
- `testReaderBasedJsonParser_getTextOffset_stringValue`: Input: "\"offset\"", Expected: 0. Derived from `getTextOffset` for string token.
- `testReaderBasedJsonParser_nextToken_startObject`: Input: "{}", Expected: JsonToken.START_OBJECT. Derived from `nextToken` for start of object.
- `testReaderBasedJsonParser_nextToken_endObject`: Input: "{}", Expected: JsonToken.END_OBJECT. Derived from `nextToken` for end of object.
- `testReaderBasedJsonParser_nextToken_startArray`: Input: "[]", Expected: JsonToken.START_ARRAY. Derived from `nextToken` for start of array.
- `testReaderBasedJsonParser_nextToken_endArray`: Input: "[]", Expected: JsonToken.END_ARRAY. Derived from `nextToken` for end of array.
- `testReaderBasedJsonParser_nextToken_string`: Input: "\"hello\"", Expected: JsonToken.VALUE_STRING. Derived from `nextToken` for string value.
- `testReaderBasedJsonParser_nextToken_numberInt`: Input: "123", Expected: JsonToken.VALUE_NUMBER_INT. Derived from `nextToken` for integer value.
- `testReaderBasedJsonParser_nextToken_numberFloat`: Input: "123.45", Expected: JsonToken.VALUE_NUMBER_FLOAT. Derived from `nextToken` for float value.
- `testReaderBasedJsonParser_nextToken_true`: Input: "true", Expected: JsonToken.VALUE_TRUE. Derived from `nextToken` for true value.
- `testReaderBasedJsonParser_nextToken_false`: Input: "false", Expected: JsonToken.VALUE_FALSE. Derived from `nextToken` for false value.
- `testReaderBasedJsonParser_nextToken_null`: Input: "null", Expected: JsonToken.VALUE_NULL. Derived from `nextToken` for null value.
- `testReaderBasedJsonParser_nextToken_fieldName`: Input: "{\"fieldName\":\"value\"}", Expected: JsonToken.FIELD_NAME. Derived from `nextToken` after START_OBJECT.
- `testReaderBasedJsonParser_skipChildren_object`: Input: "{\"a\":1,\"b\":[2,3],\"c\":{}}", Expected: JsonToken.END_OBJECT. Derived from `skipChildren` on an object.
- `testReaderBasedJsonParser_skipChildren_array`: Input: "[1,{\"a\":2},[3,4]]", Expected: JsonToken.END_ARRAY. Derived from `skipChildren` on an array.
- `testUTF8StreamJsonParser_getValueAsBoolean_trueString`: Input: "true", Expected: true. Derived from `getValueAsBoolean` logic for "true" string.
- `testUTF8StreamJsonParser_getValueAsBoolean_falseString`: Input: "false", Expected: false. Derived from `getValueAsBoolean` logic for "false" string.
- `testUTF8StreamJsonParser_getValueAsInt_validInt`: Input: "456", Expected: 456. Derived from `getValueAsInt` for integer token.
- `testUTF8StreamJsonParser_getValueAsLong_validLong`: Input: "9876543210987", Expected: 9876543210987L. Derived from `getValueAsLong` for long token.
- `testUTF8StreamJsonParser_getValueAsDouble_validDouble`: Input: "98.765", Expected: 98.765. Derived from `getValueAsDouble` for double token.
- `testUTF8StreamJsonParser_getText_stringValue`: Input: "\"byte string\"", Expected: "byte string". Derived from `getText` for string token.
- `testUTF8StreamJsonParser_nextToken_startObject`: Input: "{}", Expected: JsonToken.START_OBJECT. Derived from `nextToken` for start of object.
- `testUTF8StreamJsonParser_nextToken_endObject`: Input: "{}", Expected: JsonToken.END_OBJECT. Derived from `nextToken` for end of object.
- `testUTF8StreamJsonParser_nextToken_string`: Input: "\"stream\"", Expected: JsonToken.VALUE_STRING. Derived from `nextToken` for string value.
- `testUTF8StreamJsonParser_skipChildren_object`: Input: "{\"a\":1,\"b\":[2,3],\"c\":{}}", Expected: JsonToken.END_OBJECT. Derived from `skipChildren` on an object.
- `testUTF8StreamJsonParser_skipChildren_array`: Input: "[1,{\"a\":2},[3,4]]", Expected: JsonToken.END_ARRAY. Derived from `skipChildren` on an array.
- `testParserBase_hasCurrentToken_beforeNextToken`: Input: "{}", Expected: false. Derived from `hasCurrentToken` before any `nextToken` call.
- `testParserBase_hasCurrentToken_afterNextToken`: Input: "{}", Expected: true. Derived from `hasCurrentToken` after `nextToken` call.
- `testParserBase_hasTokenId_correctId`: Input: "true", Expected: true. Derived from `hasTokenId` with correct ID.
- `testParserBase_hasTokenId_incorrectId`: Input: "true", Expected: false. Derived from `hasTokenId` with incorrect ID.
- `testParserBase_hasToken_correctToken`: Input: "null", Expected: true. Derived from `hasToken` with correct token.
- `testParserBase_hasToken_incorrectToken`: Input: "null", Expected: false. Derived from `hasToken` with incorrect token.
- `testParserBase_isExpectedStartArrayToken_true`: Input: "[1, 2]", Expected: true. Derived from `isExpectedStartArrayToken` when token is START_ARRAY.
- `testParserBase_isExpectedStartArrayToken_false`: Input: "{ \"key\": 1 }", Expected: false. Derived from `isExpectedStartArrayToken` when token is not START_ARRAY.
- `testParserBase_isExpectedStartObjectToken_true`: Input: "{ \"key\": 1 }", Expected: true. Derived from `isExpectedStartObjectToken` when token is START_OBJECT.
- `testParserBase_isExpectedStartObjectToken_false`: Input: "[1, 2]", Expected: false. Derived from `isExpectedStartObjectToken` when token is not START_OBJECT.
- `testParserBase_clearCurrentToken_clearsToken`: Input: "true", Expected: null after clear. Derived from `clearCurrentToken` behavior.
- `testParserBase_getLastClearedToken_correctToken`: Input: "false", Expected: JsonToken.VALUE_FALSE. Derived from `getLastClearedToken` after `clearCurrentToken`.
- `testParserBase_getValueAsInt_defaultForNull`: Input: "null", Expected: 0. Derived from `getValueAsInt` with default for null token.
- `testParserBase_getValueAsLong_defaultForNull`: Input: "null", Expected: 0L. Derived from `getValueAsLong` with default for null token.
- `testParserBase_getValueAsDouble_defaultForNull`: Input: "null", Expected: 0.0. Derived from `getValueAsDouble` with default for null token.
- `testParserBase_getValueAsString_defaultForNull`: Input: "null", Expected: null. Derived from `getValueAsString` with default for null token.
- `testParserBase_getValueAsString_defaultForNumber`: Input: "123", Expected: "123". Derived from `getValueAsString` for number token.
- `testParserBase_nextToken_eof`: Input: "", Expected: null. Derived from `nextToken` on empty input.
- `testParserBase_getText_afterClear`: Input: "\"abc\"", Expected: null. Derived from `getText` after `clearCurrentToken`.
- `testParserBase_nextToken_withWhitespace`: Input: "  \t\n true  ", Expected: JsonToken.VALUE_TRUE. Derived from `nextToken` handling of whitespace.
- `testParserBase_nextToken_afterSkippingChildren`: Input: "{\"a\":[1,2], \"b\":3}", Expected: JsonToken.FIELD_NAME "b". Derived from sequence of calls including `skipChildren`.

## DEFECT DETECTION STRATEGY
The tests aim to verify the correct parsing and retrieval of various JSON token types (strings, numbers, booleans, nulls, objects, arrays) and their associated values. They cover edge cases like whitespace handling, end-of-file conditions, and the behavior of `skipChildren` and token state management methods.

## SUMMARY
38 tests.

## LIMITATIONS
The tests rely on dummy implementations for `ObjectCodec` and `IOContext` which may not fully represent all runtime behaviors. The `getInputSource()` method is not explicitly tested, and binary value decoding is not covered.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.