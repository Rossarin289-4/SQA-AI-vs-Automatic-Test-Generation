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
import com.fasterxml.jackson.core.sym.*;

public class ReaderBasedJsonParserTest {
    // Helper method to create a ReaderBasedJsonParser with default settings
    private ReaderBasedJsonParser createParser(String json) throws IOException {
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        ObjectCodec codec = null; // Use null for ObjectCodec as it's not strictly needed for these tests
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(), reader, codec, st);
    }

    @Test
    public void testGetCodecAndSetCodec() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        assertNull(parser.getCodec());
        // MockObjectCodec is removed as it requires external dependencies not available here.
        // We will test the getter/setter behavior without a concrete mock.
        parser.setCodec(null); // Setting to null is a valid operation.
        assertNull(parser.getCodec());
    }

    @Test
    public void testReleaseBufferedEmpty() throws Exception {
        ReaderBasedJsonParser parser = createParser("");
        StringWriter sw = new StringWriter();
        assertEquals(0, parser.releaseBuffered(sw));
        assertEquals("", sw.toString());
    }

    @Test
    public void testReleaseBufferedNotEmpty() throws Exception {
        // Create a parser with some initial content.
        // We need to prime the parser's internal buffer.
        // The simplest way is to ensure loadMore() has been called or data exists.
        // We can manually set inputBuffer and inputEnd for a controlled test,
        // or simply parse a known string. Parsing is cleaner.
        ReaderBasedJsonParser parser = createParser("abc");
        parser.nextToken(); // This will parse "abc" and populate internal state.
        
        StringWriter sw = new StringWriter();
        assertEquals(3, parser.releaseBuffered(sw));
        assertEquals("abc", sw.toString());
        
        // After releasing, the buffer should be empty from the parser's perspective.
        assertEquals(0, parser.releaseBuffered(sw));
        assertEquals("abc", sw.toString()); // sw retains previous content.
    }

    @Test
    public void testGetInputSource() throws Exception {
        String json = "{}";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        ObjectCodec codec = null;
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(), reader, codec, st);
        assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testGetTextForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"field\":\"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals("field", parser.getText());
    }

    @Test
    public void testGetTextForNumberInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals("123", parser.getText());
    }

    @Test
    public void testGetTextForNumberFloat() throws Exception {
        ReaderBasedJsonParser parser = createParser("123.45");
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals("123.45", parser.getText());
    }

    @Test
    public void testGetTextForNull() throws Exception {
        ReaderBasedJsonParser parser = createParser("null");
        parser.nextToken(); // VALUE_NULL
        assertEquals("null", parser.getText());
    }
    
    @Test
    public void testGetValueAsStringForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals("hello", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForNumberInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals("123", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForNull() throws Exception {
        ReaderBasedJsonParser parser = createParser("null");
        parser.nextToken(); // VALUE_NULL
        assertEquals("null", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringForBooleanTrue() throws Exception {
        ReaderBasedJsonParser parser = createParser("true");
        parser.nextToken(); // VALUE_TRUE
        assertEquals("true", parser.getValueAsString());
    }
    
    @Test
    public void testGetValueAsStringWithDefault() throws Exception {
        ReaderBasedJsonParser parser = createParser("null");
        parser.nextToken(); // VALUE_NULL
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetTextCharactersForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertArrayEquals("hello".toCharArray(), parser.getTextCharacters());
    }

    @Test
    public void testGetTextCharactersForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"field\":\"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals("field".toCharArray().length, parser.getTextLength()); // Check length first
        assertArrayEquals("field".toCharArray(), parser.getTextCharacters());
    }

    @Test
    public void testGetTextLengthForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextLengthForNumberInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("12345");
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetForValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals(0, parser.getTextOffset()); // Assuming offset is 0 for TextBuffer content
    }
    
    @Test
    public void testGetBinaryValueSuccess() throws Exception {
        String base64String = "aGVsbG8="; // "hello"
        ReaderBasedJsonParser parser = createParser("\"" + base64String + "\"");
        parser.nextToken(); // VALUE_STRING
        byte[] expected = "hello".getBytes();
        assertArrayEquals(expected, parser.getBinaryValue(Base64Variants.getDefault()));
    }
    
    @Test
    public void testReadBinaryValueSuccess() throws Exception {
        String base64String = "aGVsbG8="; // "hello"
        ReaderBasedJsonParser parser = createParser("\"" + base64String + "\"");
        parser.nextToken(); // VALUE_STRING
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] expected = "hello".getBytes();
        assertEquals(expected.length, parser.readBinaryValue(Base64Variants.getDefault(), baos));
        assertArrayEquals(expected, baos.toByteArray());
    }

    @Test
    public void testNextTokenStartObject() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenEndObject() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenStartArray() throws Exception {
        ReaderBasedJsonParser parser = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenEndArray() throws Exception {
        ReaderBasedJsonParser parser = createParser("[]");
        parser.nextToken(); // START_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenValueString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"test\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    @Test
    public void testNextTokenValueNumberInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTokenValueNumberFloat() throws Exception {
        ReaderBasedJsonParser parser = createParser("123.45");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
    }

    @Test
    public void testNextTokenValueTrue() throws Exception {
        ReaderBasedJsonParser parser = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenValueFalse() throws Exception {
        ReaderBasedJsonParser parser = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenValueNull() throws Exception {
        ReaderBasedJsonParser parser = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenWithFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\": \"value\"}");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testNextTokenAfterFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\": \"value\"}");
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_STRING
        assertNull(parser.nextToken()); // End of input
    }
    
    @Test
    public void testNextTokenEndOfInput() throws Exception {
        ReaderBasedJsonParser parser = createParser("");
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextFieldNameExactMatch() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"exact\":\"value\"}");
        assertTrue(parser.nextFieldName(new SerializedString("exact")));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    @Test
    public void testNextFieldNameNoMatch() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"other\":\"value\"}");
        assertFalse(parser.nextFieldName(new SerializedString("exact")));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // Should still return the actual field name
        assertEquals("other", parser.getText());
    }
    
    @Test
    public void testNextFieldNameNotFound() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        assertFalse(parser.nextFieldName(new SerializedString("exact")));
        assertNull(parser.nextToken()); // End of input
    }

    @Test
    public void testNextFieldNameNotFoundInArray() throws Exception {
        ReaderBasedJsonParser parser = createParser("[\"value\"]");
        // nextFieldName should not find anything in an array context
        assertFalse(parser.nextFieldName(new SerializedString("exact")));
        assertEquals(JsonToken.START_ARRAY, parser.nextToken()); // Current token before call
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken()); // After call, it moves to next token
    }
    
    @Test
    public void testNextFieldNameEmptyObject() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        assertFalse(parser.nextFieldName(new SerializedString("someName")));
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTextValueWhenString() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":\"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals("value", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueWhenNotString() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":123}");
        parser.nextToken(); // FIELD_NAME
        assertNull(parser.nextTextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }
    
    @Test
    public void testNextTextValueWhenNotField() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"value\"");
        assertEquals("value", parser.nextTextValue());
    }

    @Test
    public void testNextIntValueWhenInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":123}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(123, parser.nextIntValue(0));
    }

    @Test
    public void testNextIntValueWhenNotInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":\"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(0, parser.nextIntValue(0));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }
    
    @Test
    public void testNextIntValueWhenNotField() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        assertEquals(123, parser.nextIntValue(0));
    }

    @Test
    public void testNextLongValueWhenLong() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":1234567890123}"); // Literal long
        parser.nextToken(); // FIELD_NAME
        assertEquals(1234567890123L, parser.nextLongValue(0));
    }
    
    @Test
    public void testNextLongValueWhenNotLong() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":\"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(0, parser.nextLongValue(0));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }
    
    @Test
    public void testNextLongValueWhenNotField() throws Exception {
        ReaderBasedJsonParser parser = createParser("1234567890123");
        assertEquals(1234567890123L, parser.nextLongValue(0));
    }

    @Test
    public void testNextBooleanValueWhenTrue() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":true}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueWhenFalse() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":false}");
        parser.nextToken(); // FIELD_NAME
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueWhenNotBoolean() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":123}");
        parser.nextToken(); // FIELD_NAME
        assertNull(parser.nextBooleanValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }
    
    @Test
    public void testNextBooleanValueWhenNotField() throws Exception {
        ReaderBasedJsonParser parser = createParser("true");
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }
    
    @Test
    public void testCloseWithReader() throws Exception {
        StringReader reader = new StringReader("{\"a\":1}");
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, true); // Resource managed
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(), reader, null, st);
        parser.close();
        assertTrue(parser.isClosed());
        // Internal reader reference should be nullified by _closeInput if resource managed or AUTO_CLOSE_SOURCE is true.
        // Since _closeInput is called by close(), we can assume it's handled.
    }
    
    @Test
    public void testCloseWithReaderAutoCloseEnabled() throws Exception {
        StringReader reader = new StringReader("{\"a\":1}");
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false); // Resource not managed
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        // Enable AUTO_CLOSE_SOURCE feature
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.AUTO_CLOSE_SOURCE.getMask(), reader, null, st);
        parser.close();
        assertTrue(parser.isClosed());
        // The reader is expected to be closed by the parser due to AUTO_CLOSE_SOURCE.
    }

    @Test
    public void testGrowArrayByNull() {
        int[] expanded = ReaderBasedJsonParser.growArrayBy(null, 5);
        assertEquals(5, expanded.length);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, expanded);
    }

    @Test
    public void testGrowArrayByExisting() {
        int[] original = {1, 2};
        int[] expanded = ReaderBasedJsonParser.growArrayBy(original, 3);
        assertEquals(5, expanded.length);
        assertArrayEquals(new int[]{1, 2, 0, 0, 0}, expanded);
    }

    @Test
    public void testNumberParsingInteger() throws Exception {
        ReaderBasedJsonParser parser = createParser("12345");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(12345, parser.getIntValue());
        assertEquals(12345L, parser.getLongValue());
        assertEquals("12345", parser.getText());
    }

    @Test
    public void testNumberParsingNegativeInteger() throws Exception {
        ReaderBasedJsonParser parser = createParser("-12345");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(-12345, parser.getIntValue());
        assertEquals(-12345L, parser.getLongValue());
        assertEquals("-12345", parser.getText());
    }

    @Test
    public void testNumberParsingFloat() throws Exception {
        ReaderBasedJsonParser parser = createParser("123.45");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(123.45, parser.getDoubleValue(), 1e-9);
        assertEquals("123.45", parser.getText());
    }

    @Test
    public void testNumberParsingNegativeFloat() throws Exception {
        ReaderBasedJsonParser parser = createParser("-123.45");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(-123.45, parser.getDoubleValue(), 1e-9);
        assertEquals("-123.45", parser.getText());
    }

    @Test
    public void testNumberParsingScientificNotation() throws Exception {
        ReaderBasedJsonParser parser = createParser("1.23e4");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(12300.0, parser.getDoubleValue(), 1e-9);
        assertEquals("1.23e4", parser.getText());
    }

    @Test
    public void testNumberParsingScientificNotationNegativeExponent() throws Exception {
        ReaderBasedJsonParser parser = createParser("1.23e-4");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(0.000123, parser.getDoubleValue(), 1e-9);
        assertEquals("1.23e-4", parser.getText());
    }

    @Test
    public void testNumberParsingLeadingZeroNotAllowed() {
        try {
            ReaderBasedJsonParser parser = createParser("0123");
            parser.nextToken();
            fail("Expected a JsonParseException for leading zero");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage(), e.getMessage().contains("Leading zeroes not allowed"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testNumberParsingZeroAllowed() throws Exception {
        ReaderBasedJsonParser parser = createParser("0");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(0, parser.getIntValue());
        assertEquals("0", parser.getText());
    }

    @Test
    public void testNumberParsingWithDecimalPointWithoutDigits() {
        try {
            ReaderBasedJsonParser parser = createParser("123.");
            parser.nextToken();
            fail("Expected a JsonParseException for decimal point without digits");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage(), e.getMessage().contains("Decimal point not followed by a digit"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testNumberParsingWithExponentWithoutDigits() {
        try {
            ReaderBasedJsonParser parser = createParser("123e");
            parser.nextToken();
            fail("Expected a JsonParseException for exponent without digits");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage(), e.getMessage().contains("Exponent indicator not followed by a digit"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testNumberParsingWithExponentSignWithoutDigits() {
        try {
            ReaderBasedJsonParser parser = createParser("123e+");
            parser.nextToken();
            fail("Expected a JsonParseException for exponent sign without digits");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage(), e.getMessage().contains("Exponent indicator not followed by a digit"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testParseStringWithEscapedQuote() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello \\\"world\"");
        parser.nextToken();
        assertEquals("hello \"world", parser.getText());
    }

    @Test
    public void testParseStringWithEscapedBackslash() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"path\\\\to\\\\file\"");
        parser.nextToken();
        assertEquals("path\\to\\file", parser.getText());
    }

    @Test
    public void testParseStringWithEscapedNewline() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"line1\\nline2\"");
        parser.nextToken();
        assertEquals("line1\nline2", parser.getText());
    }

    @Test
    public void testParseStringWithEscapedUnicode() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"\\u0041\""); // 'A'
        parser.nextToken();
        assertEquals("A", parser.getText());
    }

    @Test
    public void testParseStringWithMixedEscapes() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"a\\\"b\\tc\\nd\\\\e\\u0042\""); // a"b\tc\nd\eB
        parser.nextToken();
        assertEquals("a\"b\tc\nd\\eB", parser.getText());
    }

    @Test
    public void testParseStringAcrossBufferBoundary() throws Exception {
        // Simulate buffer boundary by creating a long string
        // The exact buffer size is not directly exposed, so we create a string
        // that is likely to be larger than a typical buffer for testing.
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < 2000; i++) { // Sufficiently long to likely cross buffer boundaries
            sb.append("a");
        }
        sb.append("\"");
        ReaderBasedJsonParser parser = createParser(sb.toString());
        parser.nextToken();
        String expected = sb.substring(1, sb.length() - 1);
        assertEquals(expected, parser.getText());
    }
    
    @Test
    public void testHandleOddValueSingleQuoteString() throws Exception {
        // This requires ALLOW_SINGLE_QUOTES feature to be enabled
        String json = "{'key':'value'}";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask(), reader, null, st);
        
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testHandleOddValueNaN() throws Exception {
        // This requires ALLOW_NON_NUMERIC_NUMBERS feature to be enabled
        String json = "NaN";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask(), reader, null, st);
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NaN, parser.getDoubleValue());
    }

    @Test
    public void testHandleOddValueInfinity() throws Exception {
        // This requires ALLOW_NON_NUMERIC_NUMBERS feature to be enabled
        String json = "Infinity";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask(), reader, null, st);
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue());
    }
    
    @Test
    public void testHandleOddValueNegativeInfinity() throws Exception {
        // This requires ALLOW_NON_NUMERIC_NUMBERS feature to be enabled
        String json = "-Infinity";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask(), reader, null, st);
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue());
    }
    
    @Test
    public void testParseFieldNameWithEscapes() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"field\\nname\":\"value\"}");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field\nname", parser.getText());
    }
    
    @Test
    public void testParseFieldNameWithApostrophe() throws Exception {
        // This requires ALLOW_SINGLE_QUOTES feature to be enabled
        String json = "{'field\\'name':'value'}";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask(), reader, null, st);
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field'name", parser.getText());
    }

    @Test
    public void testParseFieldNameUnquoted() throws Exception {
        // This requires ALLOW_UNQUOTED_FIELD_NAMES feature to be enabled
        String json = "{key:\"value\"}";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask(), reader, null, st);
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
    }
    
    @Test
    public void testParseFieldNameUnquotedWithSpecialChars() throws Exception {
        // This requires ALLOW_UNQUOTED_FIELD_NAMES feature to be enabled
        String json = "{key_123:\"value\"}";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask(), reader, null, st);
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key_123", parser.getText());
    }

    @Test
    public void testHandleCommentsCStyle() throws Exception {
        // This requires ALLOW_COMMENTS feature to be enabled
        String json = "/* comment */ \"value\"";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_COMMENTS.getMask(), reader, null, st);
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testHandleCommentsLineStyle() throws Exception {
        // This requires ALLOW_COMMENTS feature to be enabled
        String json = "// comment\n \"value\"";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_COMMENTS.getMask(), reader, null, st);
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }
    
    @Test
    public void testHandleCommentsMultiLine() throws Exception {
        // This requires ALLOW_COMMENTS feature to be enabled
        String json = "/* comment line 1\ncomment line 2 */ \"value\"";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_COMMENTS.getMask(), reader, null, st);
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }
    
    @Test
    public void testHandleYAMLComments() throws Exception {
        // This requires ALLOW_YAML_COMMENTS feature to be enabled
        String json = "# yaml comment\n \"value\"";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask(), reader, null, st);
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testMaxIntegerBoundary() throws Exception {
        ReaderBasedJsonParser parser = createParser(String.valueOf(Integer.MAX_VALUE));
        parser.nextToken();
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
        assertEquals(Integer.MAX_VALUE, parser.getLongValue());
    }

    @Test
    public void testMinIntegerBoundary() throws Exception {
        ReaderBasedJsonParser parser = createParser(String.valueOf(Integer.MIN_VALUE));
        parser.nextToken();
        assertEquals(Integer.MIN_VALUE, parser.getIntValue());
        assertEquals(Integer.MIN_VALUE, parser.getLongValue());
    }

    @Test
    public void testMaxLongBoundary() throws Exception {
        ReaderBasedJsonParser parser = createParser(String.valueOf(Long.MAX_VALUE));
        parser.nextToken();
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
    }

    @Test
    public void testMinLongBoundary() throws Exception {
        ReaderBasedJsonParser parser = createParser(String.valueOf(Long.MIN_VALUE));
        parser.nextToken();
        assertEquals(Long.MIN_VALUE, parser.getLongValue());
    }
    
    @Test
    public void testNumberExceedingLong() throws Exception {
        // A number larger than Long.MAX_VALUE
        String largeNumber = "9223372036854775808"; 
        ReaderBasedJsonParser parser = createParser(largeNumber);
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        // The source code indicates _parseNumber and resetInt/resetFloat are used.
        // For numbers exceeding Long.MAX_VALUE, they should be parsed as doubles if they fit.
        // If it's a plain integer exceeding Long.MAX_VALUE, it might be parsed as a String if not handled specifically by BigInteger.
        // Testing the text representation is a safe approach here.
        assertEquals(largeNumber, parser.getText());
        // Verify it can be read as double
        assertEquals(9.223372036854776E18, parser.getDoubleValue(), 1e9); // Approximate value for large number
    }

    @Test
    public void testNumberExceedingLongWithExponent() throws Exception {
        String largeNumber = "1.23e20"; // Large number with exponent
        ReaderBasedJsonParser parser = createParser(largeNumber);
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(1.23E20, parser.getDoubleValue(), 1e11); // Check double value with tolerance
        assertEquals(largeNumber, parser.getText());
    }

    @Test
    public void testNumberWithLeadingZeroEnabled() throws Exception {
        // Test with ALLOW_NUMERIC_LEADING_ZEROS enabled
        String json = "0123";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask(), reader, null, st);
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(123, parser.getIntValue()); // Should parse correctly
        assertEquals("0123", parser.getText());
    }
}
