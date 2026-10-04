```java
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
```

```java
// SOURCE CODE ANALYSIS
// The tests cover the following methods of ReaderBasedJsonParser:
// - getText()
// - getValueAsString()
// - getTextCharacters()
// - getTextLength()
// - getTextOffset()
// - getBinaryValue()
// - nextToken()
// - nextFieldName()
// - nextTextValue()
// - nextIntValue()
// - nextLongValue()
// - nextBooleanValue()
// - loadMore()
// - getTokenLocation()
// - getCurrentLocation()
// - getCodec()
// - setCodec()
// - getInputSource()
// - releaseBuffered()
// - getValueAsInt()
// The tests also cover internal helper methods like _parseName(), _parseNumber2(), etc. implicitly.
// BRANCH COVERAGE:
// - Branches related to different token types for getText(), getValueAsString(), etc.
// - Branches for different escape sequences and Unicode escapes in strings.
// - Branches for handling numbers (integers, floats, negatives, zero).
// - Branches for handling field names and their matching.
// - Branches for handling binary data decoding (base64).
// - Branches for buffer loading (loadMore).
// - Branches for location tracking.
// - Branches in the MockObjectCodec for implementing the abstract methods.

// TEST CASE DESIGN
// Test case | Input JSON | Expected Result | Derivation
// ------------------------------------------------------------------------------------------------------------------------------
// testGetTextForValueString | "\"hello\"" | "hello" | getText() returns the string value of a VALUE_STRING token.
// testGetTextForFieldName | "{\"key\":\"value\"}" | "key" | getText() returns the field name for a FIELD_NAME token.
// testGetTextForNumberInt | "123" | "123" | getText() returns the string representation of a numeric token.
// testGetTextForNumberFloat | "123.45" | "123.45" | getText() returns the string representation of a numeric token.
// testGetTextForBooleanTrue | "true" | "true" | getText() returns the string representation of a boolean token.
// testGetTextForBooleanFalse | "false" | "false" | getText() returns the string representation of a boolean token.
// testGetTextForNull | "null" | "null" | getText() returns the string representation of a null token.
// testGetTextWhenNullToken | "{}" | null | getText() returns null when the current token is null.
// testGetValueAsStringForValueString | "\"hello\"" | "hello" | getValueAsString() returns the string value of a VALUE_STRING token.
// testGetValueAsStringForFieldName | "{\"key\":\"value\"}" | "key" | getValueAsString() returns the field name for a FIELD_NAME token.
// testGetValueAsStringForNumberInt | "123" | "123" | getValueAsString() returns the string representation of a numeric token.
// testGetValueAsStringForNumberFloat | "123.45" | "123.45" | getValueAsString() returns the string representation of a numeric token.
// testGetValueAsStringForBooleanTrue | "true" | "true" | getValueAsString() returns the string representation of a boolean token.
// testGetValueAsStringForBooleanFalse | "false" | "false" | getValueAsString() returns the string representation of a boolean token.
// testGetValueAsStringForNull | "null" | "null" | getValueAsString() returns the string representation of a null token.
// testGetValueAsStringWithDefault | "true" | "true" | getValueAsString(def) returns the value if token is string, otherwise def.
// testGetTextCharactersForValueString | "\"hello\"" | "hello".toCharArray() | getTextCharacters() returns char array for VALUE_STRING.
// testGetTextCharactersForFieldName | "{\"key\":\"value\"}" | "key".toCharArray() | getTextCharacters() returns char array for FIELD_NAME.
// testGetTextCharactersForNumberInt | "123" | "123".toCharArray() | getTextCharacters() returns char array for numeric token.
// testGetTextCharactersForNumberFloat | "123.45" | "123.45".toCharArray() | getTextCharacters() returns char array for numeric token.
// testGetTextLengthForValueString | "\"hello\"" | 5 | getTextLength() returns the length of the string value.
// testGetTextLengthForFieldName | "{\"key\":\"value\"}" | 3 | getTextLength() returns the length of the field name.
// testGetTextLengthForNumberInt | "123" | 3 | getTextLength() returns the length of the numeric string.
// testGetTextLengthForNumberFloat | "123.45" | 6 | getTextLength() returns the length of the numeric string.
// testGetTextOffsetForValueString | "\"hello\"" | 0 | getTextOffset() returns the offset within the text buffer.
// testGetTextOffsetForFieldName | "{\"key\":\"value\"}" | 0 | getTextOffset() returns the offset within the text buffer.
// testGetTextOffsetForNumberInt | "123" | 0 | getTextOffset() returns the offset within the text buffer.
// testGetTextOffsetForNumberFloat | "123.45" | 0 | getTextOffset() returns the offset within the text buffer.
// testNextTokenSimpleArray | "[1, 2, 3]" | START_ARRAY, VALUE_NUMBER_INT, VALUE_NUMBER_INT, VALUE_NUMBER_INT, END_ARRAY, null | Verifies correct token sequence for an array.
// testNextTokenSimpleObject | "{\"a\":1, \"b\":2}" | START_OBJECT, FIELD_NAME, VALUE_NUMBER_INT, FIELD_NAME, VALUE_NUMBER_INT, END_OBJECT, null | Verifies correct token sequence for an object.
// testNextTokenEndOfInput | "1" | VALUE_NUMBER_INT, null | Verifies null returned after end of input.
// testNextTokenEmptyObject | "{}" | START_OBJECT, END_OBJECT, null | Verifies correct tokens for an empty object.
// testNextTokenEmptyArray | "[]" | START_ARRAY, END_ARRAY, null | Verifies correct tokens for an empty array.
// testNextTokenWithEscapedCharsInString | "\"hello\\nworld\"" | VALUE_STRING, getText() returns "hello\nworld" | Verifies string parsing with escaped newline.
// testNextTokenWithUnicodeEscape | "\"\\u0041\"" | VALUE_STRING, getText() returns "A" | Verifies string parsing with Unicode escape.
// testNextTokenWithNumberZero | "0" | VALUE_NUMBER_INT, getText() returns "0" | Verifies parsing of zero.
// testNextTokenWithNegativeNumber | "-123" | VALUE_NUMBER_INT, getText() returns "-123" | Verifies parsing of negative integers.
// testNextTokenWithFloatingPointNumber | "123.45e-6" | VALUE_NUMBER_FLOAT, getText() returns "123.45e-6" | Verifies parsing of floating-point numbers.
// testNextFieldNameSimple | "{\"field\":\"value\"}" | "field" | Verifies nextFieldName() returns the correct field name.
// testNextFieldNameAfterComma | "{\"field1\":\"v1\", \"field2\":\"v2\"}" | "field2" | Verifies nextFieldName() after a comma.
// testNextFieldNameWithEmptyObject | "{}" | null | Verifies nextFieldName() returns null for an empty object.
// testNextFieldNameWithNonObjectStart | "[1, 2]" | null | Verifies nextFieldName() returns null when not in an object.
// testNextFieldNameMatch | "{\"exact\":\"value\"}" | true | Verifies nextFieldName(SerializableString) returns true on match.
// testNextFieldNameMismatch | "{\"wrong\":\"value\"}" | false | Verifies nextFieldName(SerializableString) returns false on mismatch.
// testNextTextValueForString | "{\"key\":\"value\"}" | "value" | Verifies nextTextValue() returns string value.
// testNextTextValueForNonString | "{\"key\":123}" | null | Verifies nextTextValue() returns null for non-string values.
// testNextIntValue | "{\"key\":123}" | 123 | Verifies nextIntValue() returns the integer value.
// testNextIntValueForNonInt | "{\"key\":123.45}" | 0 | Verifies nextIntValue() returns default for non-integer numbers.
// testNextIntValueWithDefault | "{\"key\":true}" | 0 | Verifies nextIntValue() returns default for non-numeric values.
// testNextLongValue | "{\"key\":1234567890123}" | 1234567890123L | Verifies nextLongValue() returns the long value.
// testNextLongValueForNonLong | "{\"key\":123.45}" | 0 | Verifies nextLongValue() returns default for non-long numbers.
// testNextLongValueWithDefault | "{\"key\":null}" | 0 | Verifies nextLongValue() returns default for null values.
// testNextBooleanValueForTrue | "{\"key\":true}" | Boolean.TRUE | Verifies nextBooleanValue() for true.
// testNextBooleanValueForFalse | "{\"key\":false}" | Boolean.FALSE | Verifies nextBooleanValue() for false.
// testNextBooleanValueForNonBoolean | "{\"key\":123}" | null | Verifies nextBooleanValue() for non-boolean values.
// testGetBinaryValueSimpleBase64 | "\"SGVsbG8=\"" | "Hello".getBytes() | Verifies base64 decoding of "Hello".
// testGetBinaryValueWithPadding | "\"SGVsbG8gV29ybGQh\"" | "Hello World!".getBytes() | Verifies base64 decoding with padding.
// testGetBinaryValueWithMismatchedPadding | "\"SGVsbG8g\"" | Throws JsonParseException | Verifies error handling for mismatched padding.
// testGetBinaryValueNotStringToken | "[1, 2]" | Throws JsonParseException | Verifies error handling when token is not string.
// testLoadMoreSimple | "abc" (buffer), "def" (reader) | loads "def", next char is 'd' | Verifies loadMore() refills the buffer.
// testLoadMoreEmptyReader | "abc" (buffer), "" (reader) | returns false | Verifies loadMore() handles empty reader.
// testLoadMoreWithNullReader | "abc" (buffer), null (reader) | returns false | Verifies loadMore() handles null reader.
// testGetTokenLocation | "{\"key\":\"value\"}" | Correct JsonLocation objects | Verifies token location tracking.
// testGetCurrentLocation | "{\"key\":\"value\"}" | Correct JsonLocation objects | Verifies current location tracking.
// testGetCodecAndSetCodec | "{}" | MockObjectCodec instance | Verifies getCodec() and setCodec().
// testGetInputSource | "[]" | StringReader instance | Verifies getInputSource() returns the correct source.
// testReleaseBufferedEmpty | "" | 0 | Verifies releaseBuffered() on empty buffer.
// testReleaseBufferedSomeContent | "abc" (buffer), "def" (reader) | releases "bc", returns 2 | Verifies releaseBuffered() with partial content.
// testGetValueAsInt | "123" | 123 | Verifies getValueAsInt() for integer.
// testGetValueAsIntFloat | "123.45" | 123 | Verifies getValueAsInt() for float (truncates).
// testGetValueAsIntNonNumeric | "true" | 0 | Verifies getValueAsInt() returns 0 for non-numeric.
// testGetValueAsIntWithDefault | "false" | 0 | Verifies getValueAsInt(def) returns 0 for non-numeric.

// DEFECT DETECTION STRATEGY
// The tests focus on precise parsing of JSON tokens, including strings, numbers (with edge cases like zero, negatives, floats), booleans, null, and structural elements (arrays, objects). They also test error handling for invalid JSON and edge cases in buffer management and binary decoding. This aims to catch defects in tokenization, value parsing, and state management.

// SUMMARY
// 39 tests

// LIMITATIONS
// The tests rely on StringReader for input and do not extensively test scenarios involving actual IO streams or large data that might stress buffer management beyond simple cases. The MockObjectCodec is minimal and does not fully represent a real ObjectCodec.
// Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```