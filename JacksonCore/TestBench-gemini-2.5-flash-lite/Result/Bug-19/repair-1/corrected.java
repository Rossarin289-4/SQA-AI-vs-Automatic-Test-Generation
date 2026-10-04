package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.*;
import java.util.Arrays;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonProcessingException;
import com.fasterxml.jackson.databind.ResolvedType;
import com.fasterxml.jackson.databind.TreeNode;
import com.fasterxml.jackson.databind.type.TypeReference;

public class ReaderBasedJsonParserTest {

    // Helper to create a parser with minimal setup
    private ReaderBasedJsonParser createParser(String json) throws IOException {
        StringReader sr = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), sr, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ctxt, 0, sr, null, symbols);
    }

    // Helper to create a parser from a Reader with known buffer content
    private ReaderBasedJsonParser createParserWithBuffer(Reader r, char[] buffer, int start, int end) throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), r, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ctxt, 0, r, null, symbols, buffer, start, end, true);
    }


    @Test
    public void testGetTextForValueString() throws Exception {
        ReaderBasedJsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals("hello", p.getText());
    }

    @Test
    public void testGetTextForFieldName() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":\"value\"}");
        p.nextToken(); // FIELD_NAME
        assertEquals("key", p.getText());
    }

    @Test
    public void testGetTextForNumberInt() throws Exception {
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken();
        assertEquals("123", p.getText());
    }

    @Test
    public void testGetTextForNumberFloat() throws Exception {
        ReaderBasedJsonParser p = createParser("123.45");
        p.nextToken();
        assertEquals("123.45", p.getText());
    }

    @Test
    public void testGetTextForBooleanTrue() throws Exception {
        ReaderBasedJsonParser p = createParser("true");
        p.nextToken();
        assertEquals("true", p.getText());
    }

    @Test
    public void testGetTextForBooleanFalse() throws Exception {
        ReaderBasedJsonParser p = createParser("false");
        p.nextToken();
        assertEquals("false", p.getText());
    }

    @Test
    public void testGetTextForNull() throws Exception {
        ReaderBasedJsonParser p = createParser("null");
        p.nextToken();
        assertEquals("null", p.getText());
    }

    @Test
    public void testGetTextWhenNullToken() throws Exception {
        ReaderBasedJsonParser p = createParser("{}");
        assertNull(p.getText());
    }

    @Test
    public void testGetValueAsStringForValueString() throws Exception {
        ReaderBasedJsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals("hello", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForFieldName() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":\"value\"}");
        p.nextToken(); // FIELD_NAME
        assertEquals("key", p.getCurrentName()); // getCurrentName is called first
        assertEquals("key", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForNumberInt() throws Exception {
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken();
        assertEquals("123", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForNumberFloat() throws Exception {
        ReaderBasedJsonParser p = createParser("123.45");
        p.nextToken();
        assertEquals("123.45", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForBooleanTrue() throws Exception {
        ReaderBasedJsonParser p = createParser("true");
        p.nextToken();
        assertEquals("true", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForBooleanFalse() throws Exception {
        ReaderBasedJsonParser p = createParser("false");
        p.nextToken();
        assertEquals("false", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForNull() throws Exception {
        ReaderBasedJsonParser p = createParser("null");
        p.nextToken();
        assertEquals("null", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefault() throws Exception {
        ReaderBasedJsonParser p = createParser("true");
        p.nextToken();
        assertEquals("true", p.getValueAsString("default"));
        p.nextToken(); // END_OBJECT or END_ARRAY
        assertEquals("default", p.getValueAsString("default"));
    }

    @Test
    public void testGetTextCharactersForValueString() throws Exception {
        ReaderBasedJsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertArrayEquals("hello".toCharArray(), p.getTextCharacters());
    }

    @Test
    public void testGetTextCharactersForFieldName() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":\"value\"}");
        p.nextToken(); // FIELD_NAME
        assertArrayEquals("key".toCharArray(), p.getTextCharacters());
    }

    @Test
    public void testGetTextCharactersForNumberInt() throws Exception {
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken();
        assertArrayEquals("123".toCharArray(), p.getTextCharacters());
    }

    @Test
    public void testGetTextCharactersForNumberFloat() throws Exception {
        ReaderBasedJsonParser p = createParser("123.45");
        p.nextToken();
        assertArrayEquals("123.45".toCharArray(), p.getTextCharacters());
    }

    @Test
    public void testGetTextLengthForValueString() throws Exception {
        ReaderBasedJsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals(5, p.getTextLength());
    }

    @Test
    public void testGetTextLengthForFieldName() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":\"value\"}");
        p.nextToken(); // FIELD_NAME
        assertEquals(3, p.getTextLength());
    }

    @Test
    public void testGetTextLengthForNumberInt() throws Exception {
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken();
        assertEquals(3, p.getTextLength());
    }

    @Test
    public void testGetTextLengthForNumberFloat() throws Exception {
        ReaderBasedJsonParser p = createParser("123.45");
        p.nextToken();
        assertEquals(6, p.getTextLength());
    }

    @Test
    public void testGetTextOffsetForValueString() throws Exception {
        ReaderBasedJsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals(0, p.getTextOffset());
    }

    @Test
    public void testGetTextOffsetForFieldName() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":\"value\"}");
        p.nextToken(); // FIELD_NAME
        assertEquals(0, p.getTextOffset());
    }

    @Test
    public void testGetTextOffsetForNumberInt() throws Exception {
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken();
        assertEquals(0, p.getTextOffset());
    }

    @Test
    public void testGetTextOffsetForNumberFloat() throws Exception {
        ReaderBasedJsonParser p = createParser("123.45");
        p.nextToken();
        assertEquals(0, p.getTextOffset());
    }

    @Test
    public void testNextTokenSimpleArray() throws Exception {
        ReaderBasedJsonParser p = createParser("[1, 2, 3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextTokenSimpleObject() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"a\":1, \"b\":2}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextTokenEndOfInput() throws Exception {
        ReaderBasedJsonParser p = createParser("1");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextTokenEmptyObject() throws Exception {
        ReaderBasedJsonParser p = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextTokenEmptyArray() throws Exception {
        ReaderBasedJsonParser p = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextTokenWithEscapedCharsInString() throws Exception {
        ReaderBasedJsonParser p = createParser("\"hello\\nworld\"");
        p.nextToken();
        assertEquals("hello\nworld", p.getText());
    }

    @Test
    public void testNextTokenWithUnicodeEscape() throws Exception {
        ReaderBasedJsonParser p = createParser("\"\\u0041\""); // 'A'
        p.nextToken();
        assertEquals("A", p.getText());
    }

    @Test
    public void testNextTokenWithNumberZero() throws Exception {
        ReaderBasedJsonParser p = createParser("0");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
        assertEquals("0", p.getText());
    }
    
    @Test
    public void testNextTokenWithNegativeNumber() throws Exception {
        ReaderBasedJsonParser p = createParser("-123");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
        assertEquals("-123", p.getText());
    }

    @Test
    public void testNextTokenWithFloatingPointNumber() throws Exception {
        ReaderBasedJsonParser p = createParser("123.45e-6");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.getCurrentToken());
        assertEquals("123.45e-6", p.getText());
    }

    @Test
    public void testNextFieldNameSimple() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"field\":\"value\"}");
        p.nextToken(); // START_OBJECT
        assertEquals("field", p.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
    }

    @Test
    public void testNextFieldNameAfterComma() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"field1\":\"v1\", \"field2\":\"v2\"}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // field1
        p.nextToken(); // v1
        assertEquals("field2", p.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("v2", p.getText());
    }

    @Test
    public void testNextFieldNameWithEmptyObject() throws Exception {
        ReaderBasedJsonParser p = createParser("{}");
        p.nextToken(); // START_OBJECT
        assertNull(p.nextFieldName()); // Should return null after END_OBJECT
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testNextFieldNameWithNonObjectStart() throws Exception {
        ReaderBasedJsonParser p = createParser("[1, 2]");
        p.nextToken(); // START_ARRAY
        assertNull(p.nextFieldName()); // Should not find field name in array
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testNextFieldNameMatch() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"exact\":\"value\"}");
        p.nextToken(); // START_OBJECT
        assertTrue(p.nextFieldName(new SerializedString("exact")));
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
    }

    @Test
    public void testNextFieldNameMismatch() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"wrong\":\"value\"}");
        p.nextToken(); // START_OBJECT
        assertFalse(p.nextFieldName(new SerializedString("exact")));
        assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
        assertEquals("wrong", p.getCurrentName());
    }

    @Test
    public void testNextTextValueForString() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":\"value\"}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals("value", p.nextTextValue());
    }

    @Test
    public void testNextTextValueForNonString() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":123}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertNull(p.nextTextValue()); // Not a string
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }
    
    @Test
    public void testNextIntValue() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":123}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals(123, p.nextIntValue(0));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    @Test
    public void testNextIntValueForNonInt() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":123.45}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals(0, p.nextIntValue(0)); // Default value as it's not INT
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
    }
    
    @Test
    public void testNextIntValueWithDefault() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":true}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals(0, p.nextIntValue(0)); // Default value as it's not a number
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
    }

    @Test
    public void testNextLongValue() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":1234567890123}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals(1234567890123L, p.nextLongValue(0));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    @Test
    public void testNextLongValueForNonLong() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":123.45}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals(0, p.nextLongValue(0)); // Default value as it's not LONG
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
    }

    @Test
    public void testNextLongValueWithDefault() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":null}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals(0, p.nextLongValue(0)); // Default value as it's not a number
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testNextBooleanValueForTrue() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":true}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
    }

    @Test
    public void testNextBooleanValueForFalse() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":false}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
    }

    @Test
    public void testNextBooleanValueForNonBoolean() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":123}");
        p.nextToken(); // START_OBJECT
        p.nextFieldName(); // key
        assertNull(p.nextBooleanValue()); // Not a boolean
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    @Test
    public void testGetBinaryValueSimpleBase64() throws Exception {
        ReaderBasedJsonParser p = createParser("\"SGVsbG8=\""); // "Hello"
        p.nextToken();
        byte[] expected = "Hello".getBytes();
        assertArrayEquals(expected, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testGetBinaryValueWithPadding() throws Exception {
        ReaderBasedJsonParser p = createParser("\"SGVsbG8gV29ybGQh\""); // "Hello World!"
        p.nextToken();
        byte[] expected = "Hello World!".getBytes();
        assertArrayEquals(expected, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testGetBinaryValueWithMismatchedPadding() throws Exception {
        ReaderBasedJsonParser p = createParser("\"SGVsbG8g\""); // Incomplete
        p.nextToken();
        try {
            p.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Should throw exception for invalid base64");
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testGetBinaryValueNotStringToken() throws Exception {
        ReaderBasedJsonParser p = createParser("[1, 2]");
        p.nextToken();
        p.nextToken();
        try {
            p.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Should throw exception if token is not string");
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testLoadMoreSimple() throws Exception {
        char[] buffer = "abc".toCharArray();
        StringReader sr = new StringReader("def");
        ReaderBasedJsonParser p = createParserWithBuffer(sr, buffer, 0, 3);
        p.nextToken(); // 'a'
        assertTrue(p.loadMore()); // Should load 'def' into buffer
        assertEquals(3, p._inputEnd); // Buffer should be filled
        assertEquals(0, p._inputPtr); // Pointer reset
        assertEquals('d', p.getNextChar("eof"));
    }

    @Test
    public void testLoadMoreEmptyReader() throws Exception {
        char[] buffer = "abc".toCharArray();
        StringReader sr = new StringReader("");
        ReaderBasedJsonParser p = createParserWithBuffer(sr, buffer, 0, 3);
        p.nextToken(); // 'a'
        assertFalse(p.loadMore()); // Should not load anything
    }

    @Test
    public void testLoadMoreWithNullReader() throws Exception {
        char[] buffer = "abc".toCharArray();
        ReaderBasedJsonParser p = createParserWithBuffer(null, buffer, 0, 3);
        p.nextToken(); // 'a'
        assertFalse(p.loadMore()); // Should return false if reader is null
    }
    
    @Test
    public void testGetTokenLocation() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":\"value\"}");
        JsonLocation loc1 = p.getCurrentLocation(); // Before first token
        
        p.nextToken(); // START_OBJECT
        JsonLocation loc2 = p.getTokenLocation();
        JsonLocation loc3 = p.getCurrentLocation();

        p.nextToken(); // FIELD_NAME "key"
        JsonLocation loc4 = p.getTokenLocation();
        JsonLocation loc5 = p.getCurrentLocation();

        p.nextToken(); // VALUE_STRING "value"
        JsonLocation loc6 = p.getTokenLocation();
        JsonLocation loc7 = p.getCurrentLocation();

        p.nextToken(); // END_OBJECT
        JsonLocation loc8 = p.getTokenLocation();

        assertTrue(loc1.getByteOffset() < loc2.getByteOffset());
        assertTrue(loc2.getByteOffset() < loc3.getByteOffset());
        assertTrue(loc3.getByteOffset() < loc4.getByteOffset());
        assertTrue(loc4.getByteOffset() < loc5.getByteOffset());
        assertTrue(loc5.getByteOffset() < loc6.getByteOffset());
        assertTrue(loc6.getByteOffset() < loc7.getByteOffset());
        assertTrue(loc7.getByteOffset() < loc8.getByteOffset());
    }
    
    @Test
    public void testGetCurrentLocation() throws Exception {
        ReaderBasedJsonParser p = createParser("{\"key\":\"value\"}");
        JsonLocation loc1 = p.getCurrentLocation();
        p.nextToken(); // START_OBJECT
        JsonLocation loc2 = p.getCurrentLocation();
        p.nextToken(); // FIELD_NAME "key"
        JsonLocation loc3 = p.getCurrentLocation();
        p.nextToken(); // VALUE_STRING "value"
        JsonLocation loc4 = p.getCurrentLocation();

        assertTrue(loc1.getByteOffset() < loc2.getByteOffset());
        assertTrue(loc2.getByteOffset() < loc3.getByteOffset());
        assertTrue(loc3.getByteOffset() < loc4.getByteOffset());
    }

    @Test
    public void testGetCodecAndSetCodec() throws Exception {
        ReaderBasedJsonParser p = createParser("{}");
        assertNull(p.getCodec());
        ObjectCodec mockCodec = new MockObjectCodec();
        p.setCodec(mockCodec);
        assertEquals(mockCodec, p.getCodec());
    }

    @Test
    public void testGetInputSource() throws Exception {
        StringReader sr = new StringReader("[]");
        ReaderBasedJsonParser p = createParser(sr.toString()); // Json string is "[]"
        assertEquals(sr, p.getInputSource());
    }

    @Test
    public void testReleaseBufferedEmpty() throws Exception {
        ReaderBasedJsonParser p = createParser("");
        StringWriter sw = new StringWriter();
        assertEquals(0, p.releaseBuffered(sw));
    }

    @Test
    public void testReleaseBufferedSomeContent() throws Exception {
        char[] buffer = "abc".toCharArray();
        StringReader sr = new StringReader("def");
        ReaderBasedJsonParser p = createParserWithBuffer(sr, buffer, 1, 3); // starts at 'b'
        StringWriter sw = new StringWriter();
        assertEquals(2, p.releaseBuffered(sw)); // should release 'b' and 'c'
        assertEquals("bc", sw.toString());
    }
    
    @Test
    public void testGetValueAsInt() throws Exception {
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken();
        assertEquals(123, p.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntFloat() throws Exception {
        ReaderBasedJsonParser p = createParser("123.45");
        p.nextToken();
        assertEquals(123, p.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntNonNumeric() throws Exception {
        ReaderBasedJsonParser p = createParser("true");
        p.nextToken();
        assertEquals(0, p.getValueAsInt());
    }
    
    @Test
    public void testGetValueAsIntWithDefault() throws Exception {
        ReaderBasedJsonParser p = createParser("false");
        p.nextToken();
        assertEquals(0, p.getValueAsInt(5));
    }

    // Mock ObjectCodec for testing purposes
    private static class MockObjectCodec extends ObjectCodec {
        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        @Override
        public Object readValue(JsonParser p, Class<?> c) throws IOException {
            return null; // Not needed for these tests
        }

        @Override
        public <T> T readValue(JsonParser p, JavaType t) throws IOException {
            return null; // Not needed for these tests
        }

        @Override
        public <T> T readValue(JsonParser p, TypeReference<T> t) throws IOException {
            return null; // Not needed for these tests
        }

        // TreeNode is in com.fasterxml.jackson.core.TreeNode
        @Override
        public <T extends TreeNode> T readTree(JsonParser p) throws IOException {
            return null; // Not needed for these tests
        }

        @Override
        public void writeValue(JsonGenerator g, Object value) throws IOException {
            // Not needed
        }

        @Override
        public <T> T treeToValue(JsonNode n, Class<T> c) throws JsonProcessingException {
            return null; // Not needed
        }

        @Override
        public JsonNode valueToTree(Object value) throws IllegalArgumentException {
            return null; // Not needed
        }
    }
}
