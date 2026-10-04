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

public class ReaderBasedJsonParserTest {

    // Helper method to create a basic parser instance
    private ReaderBasedJsonParser createParser(String json) throws IOException {
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ObjectCodec codec = null; // Not needed for these tests
        return new ReaderBasedJsonParser(ctxt, 0, reader, codec, symbols);
    }

    // Helper method to create a parser with specific features
    private ReaderBasedJsonParser createParser(String json, int features) throws IOException {
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ObjectCodec codec = null; // Not needed for these tests
        return new ReaderBasedJsonParser(ctxt, features, reader, codec, symbols);
    }

    // Test for releaseBuffered
    @Test
    public void testReleaseBuffered() throws Exception {
        ReaderBasedJsonParser parser = createParser("[1, 2, 3]");
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // VALUE_NUMBER_INT (1)
        StringWriter sw = new StringWriter();
        int released = parser.releaseBuffered(sw);
        assertEquals(0, released); // No data to release yet as it's not fully consumed.
    }

    // Test for getText when token is VALUE_STRING
    @Test
    public void testGetTextForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals("hello", parser.getText());
    }

    // Test for getText when token is FIELD_NAME
    @Test
    public void testGetTextForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"name\": \"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals("name", parser.getText());
    }

    // Test for getText when token is numeric
    @Test
    public void testGetTextForNumericValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals("123", parser.getText());
    }

    // Test for getValueAsString when token is VALUE_STRING
    @Test
    public void testGetValueAsStringForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals("hello", parser.getValueAsString());
    }

    // Test for getValueAsString when token is FIELD_NAME
    @Test
    public void testGetValueAsStringForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"name\": \"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals("name", parser.getValueAsString());
    }

    // Test for getValueAsString with a default value when token is not string or field name
    @Test
    public void testGetValueAsStringWithDefault() throws Exception {
        ReaderBasedJsonParser parser = createParser("[1]");
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals("default", parser.getValueAsString("default"));
    }

    // Test for getTextCharacters when token is VALUE_STRING
    @Test
    public void testGetTextCharactersForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertArrayEquals("hello".toCharArray(), parser.getTextCharacters());
    }

    // Test for getTextCharacters when token is FIELD_NAME
    @Test
    public void testGetTextCharactersForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"name\": \"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals("name", new String(parser.getTextCharacters()));
    }

    // Test for getTextLength when token is VALUE_STRING
    @Test
    public void testGetTextLengthForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals(5, parser.getTextLength());
    }

    // Test for getTextLength when token is FIELD_NAME
    @Test
    public void testGetTextLengthForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"name\": \"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(4, parser.getTextLength());
    }

    // Test for getTextOffset when token is VALUE_STRING
    @Test
    public void testGetTextOffsetForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals(0, parser.getTextOffset()); // Offset within the text buffer
    }

    // Test for getBinaryValue for a valid base64 string
    @Test
    public void testGetBinaryValueValidBase64() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"SGVsbG8gV29ybGQ=\""); // "Hello World"
        parser.nextToken(); // VALUE_STRING
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, parser.getBinaryValue(Base64Variants.getDefault()));
    }

    // Test for readBinaryValue for a valid base64 string
    @Test
    public void testReadBinaryValueValidBase64() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"SGVsbG8gV29ybGQ=\""); // "Hello World"
        parser.nextToken(); // VALUE_STRING
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        parser.readBinaryValue(Base64Variants.getDefault(), baos);
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, baos.toByteArray());
    }

    // Test nextToken for START_OBJECT
    @Test
    public void testNextTokenForStartObject() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    // Test nextToken for END_OBJECT
    @Test
    public void testNextTokenForEndObject() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    // Test nextToken for START_ARRAY
    @Test
    public void testNextTokenForStartArray() throws Exception {
        ReaderBasedJsonParser parser = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
    }

    // Test nextToken for END_ARRAY
    @Test
    public void testNextTokenForEndArray() throws Exception {
        ReaderBasedJsonParser parser = createParser("[]");
        parser.nextToken(); // START_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    // Test nextToken for VALUE_STRING
    @Test
    public void testNextTokenForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"test\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    // Test nextToken for VALUE_NUMBER_INT
    @Test
    public void testNextTokenForValueNumberInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    // Test nextToken for VALUE_NUMBER_FLOAT
    @Test
    public void testNextTokenForValueNumberFloat() throws Exception {
        ReaderBasedJsonParser parser = createParser("123.45");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
    }

    // Test nextToken for VALUE_TRUE
    @Test
    public void testNextTokenForValueTrue() throws Exception {
        ReaderBasedJsonParser parser = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    // Test nextToken for VALUE_FALSE
    @Test
    public void testNextTokenForValueFalse() throws Exception {
        ReaderBasedJsonParser parser = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    // Test nextToken for VALUE_NULL
    @Test
    public void testNextTokenForValueNull() throws Exception {
        ReaderBasedJsonParser parser = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    // Test nextToken for FIELD_NAME
    @Test
    public void testNextTokenForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\": 1}");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
    }

    // Test finishToken for an incomplete string
    @Test
    public void testFinishTokenForIncompleteString() throws Exception {
        // This scenario is hard to trigger directly with simple String input
        // as the parser usually reads the whole string at once unless it's very long.
        // We'll simulate by ensuring it's called.
        ReaderBasedJsonParser parser = createParser("\"incomplete"); // This will likely be parsed as a full string anyway by the setup
        parser._tokenIncomplete = true; // Manually set for test
        parser.finishToken();
        assertFalse(parser._tokenIncomplete); // Should be false after finishToken
    }

    // Test nextFieldName for a matching field name
    @Test
    public void testNextFieldNameMatching() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"test\": 1}");
        assertTrue(parser.nextFieldName(new SerializedString("test")));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    // Test nextFieldName for a non-matching field name
    @Test
    public void testNextFieldNameNonMatching() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"test\": 1}");
        assertFalse(parser.nextFieldName(new SerializedString("other")));
        // The parser should still consume the field name "test"
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    // Test nextTextValue when the next token is VALUE_STRING
    @Test
    public void testNextTextValueForString() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"text\": \"hello\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals("hello", parser.nextTextValue());
    }

    // Test nextTextValue when the next token is not VALUE_STRING
    @Test
    public void testNextTextValueNotString() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"number\": 123}");
        parser.nextToken(); // FIELD_NAME
        assertNull(parser.nextTextValue());
    }

    // Test nextIntValue for a matching integer value
    @Test
    public void testNextIntValueMatching() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"value\": 42}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(42, parser.nextIntValue(0));
    }

    // Test nextIntValue with default value when next token is not integer
    @Test
    public void testNextIntValueNonInteger() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"value\": \"abc\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(99, parser.nextIntValue(99));
    }

    // Test nextLongValue for a matching long integer value
    @Test
    public void testNextLongValueMatching() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"value\": 1234567890123}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(1234567890123L, parser.nextLongValue(0L));
    }

    // Test nextLongValue with default value when next token is not integer
    @Test
    public void testNextLongValueNonInteger() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"value\": \"abc\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(999L, parser.nextLongValue(999L));
    }

    // Test nextBooleanValue for true
    @Test
    public void testNextBooleanValueTrue() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"flag\": true}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    // Test nextBooleanValue for false
    @Test
    public void testNextBooleanValueFalse() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"flag\": false}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    // Test nextBooleanValue when next token is not boolean
    @Test
    public void testNextBooleanValueNotBoolean() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"flag\": 1}");
        parser.nextToken(); // FIELD_NAME
        assertNull(parser.nextBooleanValue());
    }

    // Test getTokenLocation for a field name
    @Test
    public void testGetTokenLocationForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"name\": \"value\"}");
        parser.nextToken(); // FIELD_NAME
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
        assertEquals(0, loc.getByteOffset()); // Assuming input is not byte-oriented here
        assertEquals(1, loc.getCharOffset()); // 1-based column
        assertEquals(1, loc.getLineNr());
    }

    // Test getTokenLocation for a value
    @Test
    public void testGetTokenLocationForValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("[1, 2]");
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // VALUE_NUMBER_INT (1)
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
        assertEquals(2, loc.getCharOffset()); // 1-based column
        assertEquals(1, loc.getLineNr());
    }

    // Test getCurrentLocation at the start
    @Test
    public void testGetCurrentLocationAtStart() throws Exception {
        ReaderBasedJsonParser parser = createParser("abc");
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
        assertEquals(1, loc.getCharOffset()); // Starts at col 1
        assertEquals(1, loc.getLineNr());
    }

    // Test getCurrentLocation after reading some characters
    @Test
    public void testGetCurrentLocationAfterRead() throws Exception {
        ReaderBasedJsonParser parser = createParser("abc");
        parser.nextToken(); // VALUE_STRING
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
        // After reading "abc" and potential whitespace, the pointer should be past it.
        // The exact column depends on internal parsing logic and whitespace handling.
        // We check it's a valid location.
        assertTrue(loc.getCharOffset() > 0);
        assertTrue(loc.getLineNr() > 0);
    }

    // Test edge case: empty JSON string
    @Test
    public void testEmptyJsonString() throws Exception {
        ReaderBasedJsonParser parser = createParser("");
        assertNull(parser.nextToken());
    }

    // Test edge case: JSON with only whitespace
    @Test
    public void testWhitespaceOnlyJson() throws Exception {
        ReaderBasedJsonParser parser = createParser("   \n \t ");
        assertNull(parser.nextToken());
    }

    // Test edge case: Number with leading zero (if allowed by feature)
    @Test
    public void testNumberWithLeadingZeroAllowed() throws Exception {
        ReaderBasedJsonParser parser = createParser("0123", Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("0123", parser.getText());
    }

    // Test edge case: Number with leading zero (not allowed by default)
    @Test(expected = JsonParseException.class)
    public void testNumberWithLeadingZeroDisallowed() throws Exception {
        ReaderBasedJsonParser parser = createParser("0123");
        parser.nextToken();
    }

    // Test edge case: Very long string value that might cross buffer boundaries
    @Test
    public void testVeryLongString() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append('"');
        for (int i = 0; i < 10000; ++i) { // Create a long string
            sb.append('a');
        }
        sb.append('"');
        ReaderBasedJsonParser parser = createParser(sb.toString());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(10000, parser.getTextLength());
        // Further checks could involve verifying the content if it were more complex
    }

    // Test edge case: String with escape sequences
    @Test
    public void testStringWithEscapeSequences() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"line1\\nline2\\t\\\"quoted\\\"\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("line1\nline2\t\"quoted\"", parser.getText());
    }

    // Test edge case: Unicode escape sequence
    @Test
    public void testUnicodeEscapeSequence() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"\\u0041\""); // 'A'
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("A", parser.getText());
    }

    // Test number parsing with exponent
    @Test
    public void testNumberWithExponent() throws Exception {
        ReaderBasedJsonParser parser = createParser("1.23e4");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("1.23e4", parser.getText());
    }

    // Test number parsing with negative exponent
    @Test
    public void testNumberWithNegativeExponent() throws Exception {
        ReaderBasedJsonParser parser = createParser("1.23e-4");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("1.23e-4", parser.getText());
    }

    // Test number parsing with positive exponent sign
    @Test
    public void testNumberWithPositiveExponentSign() throws Exception {
        ReaderBasedJsonParser parser = createParser("1.23e+4");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("1.23e+4", parser.getText());
    }

    // Test parsing of MIN_VALUE for integer
    @Test
    public void testMinValueInteger() throws Exception {
        ReaderBasedJsonParser parser = createParser("-2147483648"); // Integer.MIN_VALUE
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MIN_VALUE, parser.getIntValue());
    }

    // Test parsing of MAX_VALUE for integer
    @Test
    public void testMaxValueInteger() throws Exception {
        ReaderBasedJsonParser parser = createParser("2147483647"); // Integer.MAX_VALUE
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
    }

    // Test parsing of MIN_VALUE for long
    @Test
    public void testMinValueLong() throws Exception {
        ReaderBasedJsonParser parser = createParser("-9223372036854775808"); // Long.MIN_VALUE
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Long.MIN_VALUE, parser.getLongValue());
    }

    // Test parsing of MAX_VALUE for long
    @Test
    public void testMaxValueLong() throws Exception {
        ReaderBasedJsonParser parser = createParser("9223372036854775807"); // Long.MAX_VALUE
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
    }

    // Test parsing of a number that exceeds long capacity (will be parsed as double)
    @Test
    public void testNumberExceedingLong() throws Exception {
        ReaderBasedJsonParser parser = createParser("9223372036854775808"); // Long.MAX_VALUE + 1
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(9.223372036854776E18, parser.getDoubleValue(), 1e-9);
    }

    // Test parsing of a very small negative double
    @Test
    public void testVerySmallNegativeDouble() throws Exception {
        ReaderBasedJsonParser parser = createParser("-1.0E-10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-1.0E-10, parser.getDoubleValue(), 1e-15);
    }

    // Test parsing of a very small positive double
    @Test
    public void testVerySmallPositiveDouble() throws Exception {
        ReaderBasedJsonParser parser = createParser("1.0E-10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.0E-10, parser.getDoubleValue(), 1e-15);
    }

    // Test for handling of unquoted field names when allowed
    @Test
    public void testUnquotedFieldNameAllowed() throws Exception {
        ReaderBasedJsonParser parser = createParser("{fieldName: \"value\"}", JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("fieldName", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    // Test for handling of single quoted field names when allowed
    @Test
    public void testSingleQuotedFieldNameAllowed() throws Exception {
        ReaderBasedJsonParser parser = createParser("{'fieldName': \"value\"}", JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("fieldName", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }
}
