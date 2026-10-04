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
import java.math.BigDecimal;
import java.math.BigInteger;

public class ReaderBasedJsonParserTest {
    // Helper method to create a ReaderBasedJsonParser with default settings
    private ReaderBasedJsonParser createParser(String json) throws IOException {
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        ObjectCodec codec = null; // Use null for ObjectCodec as it's not strictly needed for these tests
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        // Ensure the input buffer has enough space to read the entire JSON string for simpler tests
        // A larger buffer size can help avoid boundary issues in some internal parsing methods.
        // For this setup, we'll assume the default buffer is sufficient or that loadMore handles it.
        // If issues arise, a custom buffer size might be needed, but that's beyond basic setup.
        return new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(), reader, codec, st);
    }

    // Helper to create a parser with specific features enabled
    private ReaderBasedJsonParser createParserWithFeatures(String json, int features) throws IOException {
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        ObjectCodec codec = null;
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ctxt, features, reader, codec, st);
    }

    @Test
    public void testGetCodecAndSetCodec() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        assertNull(parser.getCodec());
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
        // To properly test releaseBuffered, we need to ensure some data is actually in the buffer.
        // Parsing a simple string will populate the buffer.
        ReaderBasedJsonParser parser = createParser("abc");
        parser.nextToken(); // This will advance the parser and potentially fill internal buffers.

        // Manually inspect internal state to ensure data is available for releaseBuffered
        // This is a bit of an edge case for testing. The primary use is when a parser has unread data.
        // A simpler approach is to parse and then check.
        
        StringWriter sw = new StringWriter();
        // The json "abc" is parsed as a string value. After this, the parser's internal buffer state
        // might have changed. We can try to write remaining data after parsing.
        // Let's test a scenario where a string is partially read.
        Reader reader = new StringReader("some_text");
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(), reader, null, st);
        
        // Manually prime the buffer
        p.loadMore(); // This should read "some_text" into the buffer.
        // Now _inputBuffer should contain "some_text", _inputPtr pointing to start, _inputEnd to end.
        
        assertEquals(11, p.releaseBuffered(sw));
        assertEquals("some_text", sw.toString());
        assertEquals(0, p.releaseBuffered(sw)); // After release, buffer should be empty.
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
        assertEquals(5, parser.getTextLength()); 
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
        assertEquals(0, parser.getTextOffset()); 
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
    public void testNextTextValueWhenString() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":\"value\"}");
        parser.nextToken(); // FIELD_NAME
        assertEquals("value", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueWhenNotString() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":123}");
        parser.nextToken(); // FIELD_NAME
        assertNull(parser.nextTextValue()); // Expecting null if not a string
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken()); // Ensure subsequent token is correct
    }
    
    @Test
    public void testNextTextValueWhenNotField() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"value\"");
        assertEquals("value", parser.nextTextValue()); // Direct call on a string value
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
        assertEquals(0, parser.nextIntValue(0)); // Default value
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken()); // Ensure subsequent token is correct
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
        assertEquals(0, parser.nextLongValue(0)); // Default value
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken()); // Ensure subsequent token is correct
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
        assertNull(parser.nextBooleanValue()); // Expecting null if not boolean
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken()); // Ensure subsequent token is correct
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
        // _reader should be nullified if resource managed.
        // This is tested indirectly by checking isClosed() and ensuring no IOException on close.
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
        // We can't directly check if reader.close() was called without mocking.
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
        // A very long string to ensure buffer boundary crossing is handled.
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < 4000; i++) { // Increased length to be more certain
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
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask());
        
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
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        // Use a delta for floating point comparisons
        assertEquals(Double.NaN, parser.getDoubleValue(), 1e-9); 
    }

    @Test
    public void testHandleOddValueInfinity() throws Exception {
        // This requires ALLOW_NON_NUMERIC_NUMBERS feature to be enabled
        String json = "Infinity";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 1e-9);
    }
    
    @Test
    public void testHandleOddValueNegativeInfinity() throws Exception {
        // This requires ALLOW_NON_NUMERIC_NUMBERS feature to be enabled
        String json = "-Infinity";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 1e-9);
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
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask());
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field'name", parser.getText());
    }

    @Test
    public void testParseFieldNameUnquoted() throws Exception {
        // This requires ALLOW_UNQUOTED_FIELD_NAMES feature to be enabled
        String json = "{key:\"value\"}";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask());
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
    }
    
    @Test
    public void testParseFieldNameUnquotedWithSpecialChars() throws Exception {
        // This requires ALLOW_UNQUOTED_FIELD_NAMES feature to be enabled
        String json = "{key_123:\"value\"}";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask());
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key_123", parser.getText());
    }

    @Test
    public void testHandleCommentsCStyle() throws Exception {
        // This requires ALLOW_COMMENTS feature to be enabled
        String json = "/* comment */ \"value\"";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_COMMENTS.getMask());
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testHandleCommentsLineStyle() throws Exception {
        // This requires ALLOW_COMMENTS feature to be enabled
        String json = "// comment\n \"value\"";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_COMMENTS.getMask());
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }
    
    @Test
    public void testHandleCommentsMultiLine() throws Exception {
        // This requires ALLOW_COMMENTS feature to be enabled
        String json = "/* comment line 1\ncomment line 2 */ \"value\"";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_COMMENTS.getMask());
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }
    
    @Test
    public void testHandleYAMLComments() throws Exception {
        // This requires ALLOW_YAML_COMMENTS feature to be enabled
        String json = "# yaml comment\n \"value\"";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask());
        
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
        // A number larger than Long.MAX_VALUE, but fits in double
        String largeNumber = "9223372036854775808"; 
        ReaderBasedJsonParser parser = createParser(largeNumber);
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(largeNumber, parser.getText()); // getText should return the original string
        // Accessing as double should work
        assertEquals(9.223372036854776E18, parser.getDoubleValue(), 1e9); 
    }

    @Test
    public void testNumberExceedingLongWithExponent() throws Exception {
        String largeNumber = "1.23e20"; // Large number with exponent
        ReaderBasedJsonParser parser = createParser(largeNumber);
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(1.23E20, parser.getDoubleValue(), 1e11); 
        assertEquals(largeNumber, parser.getText());
    }

    @Test
    public void testNumberWithLeadingZeroEnabled() throws Exception {
        // Test with ALLOW_NUMERIC_LEADING_ZEROS enabled
        String json = "0123";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        // The text representation should be the original string, value should be parsed correctly
        assertEquals("0123", parser.getText()); 
        assertEquals(123, parser.getIntValue()); // Should parse correctly as 123
    }

    @Test
    public void testNextTokenWithFieldNameAndColonSpace() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\" : \"value\"}");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertNull(parser.nextToken()); // End of input
    }
    
    @Test
    public void testNextTokenWithFieldNameAndNoSpace() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\":\"value\"}");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertNull(parser.nextToken()); // End of input
    }
    
    @Test
    public void testNextTokenWithFieldNameAndColonAndSpace() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\" :\"value\"}");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertNull(parser.nextToken()); // End of input
    }

    @Test
    public void testNextTokenInArray() throws Exception {
        ReaderBasedJsonParser parser = createParser("[1, \"two\", true]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("two", parser.getText());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken()); // End of input
    }

    @Test
    public void testGetBinaryValueForString() throws Exception {
        // Base64Variant is needed, standard one will do.
        Base64Variant b64variant = new Base64Variant(Base64Variants.getDefaultVariant(), "test", false, (char) 0, 4);
        ReaderBasedJsonParser parser = createParser("\"SGVsbG8gV29ybGQ=\""); // "Hello World" base64 encoded
        parser.nextToken(); // VALUE_STRING
        byte[] binaryData = parser.getBinaryValue(b64variant);
        assertArrayEquals("Hello World".getBytes(), binaryData);
    }
    
    @Test
    public void testGetTextCharactersForEmptyString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"\"");
        parser.nextToken(); // VALUE_STRING
        char[] chars = parser.getTextCharacters();
        assertEquals(0, chars.length);
    }

    @Test
    public void testGetTextLengthForEmptyString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetForEmptyString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"\"");
        parser.nextToken(); // VALUE_STRING
        assertEquals(0, parser.getTextOffset());
    }
    
    @Test
    public void testParseFieldNameUnquotedWithHyphen() throws Exception {
        // This requires ALLOW_UNQUOTED_FIELD_NAMES feature to be enabled
        String json = "{my-field:\"value\"}";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask());
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("my-field", parser.getText());
    }

    @Test
    public void testParseFieldNameUnquotedWithDot() throws Exception {
        // This requires ALLOW_UNQUOTED_FIELD_NAMES feature to be enabled
        String json = "{my.field:\"value\"}";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask());
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("my.field", parser.getText());
    }
    
    @Test
    public void testHandleOddValuePlusSign() throws Exception {
        // Test that a '+' sign before a number is handled as an invalid number start,
        // potentially leading to an error or specific handling if ALLOW_NON_NUMERIC_NUMBERS is on.
        // The _handleInvalidNumberStart method is called.
        ReaderBasedJsonParser parser = createParser("+123");
        try {
            parser.nextToken();
            fail("Expected exception for '+' sign");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected digit (0-9) to follow minus sign"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }
    
    @Test
    public void testNextTokenWithFieldNameAndColonOnly() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"key\" : }");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
        // Expecting an error here because the value is missing
        try {
            parser.nextToken();
            fail("Expected exception for missing value");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected a value"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testNumberParsingWithExponentSignOnly() throws Exception {
        ReaderBasedJsonParser parser = createParser("1e+");
        try {
            parser.nextToken();
            fail("Expected exception for exponent sign without digits");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Exponent indicator not followed by a digit"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testNumberParsingWithDecimalPointOnly() throws Exception {
        ReaderBasedJsonParser parser = createParser("123.");
        try {
            parser.nextToken();
            fail("Expected exception for decimal point without digits");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Decimal point not followed by a digit"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }
    
    @Test
    public void testParseStringWithUnescapedControlChar() {
        try {
            ReaderBasedJsonParser parser = createParser("\"hello\nworld\""); // newline not escaped
            parser.nextToken();
            fail("Expected JsonParseException for unescaped control character");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("string value"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testParseStringWithInvalidUnicodeEscape() {
        try {
            ReaderBasedJsonParser parser = createParser("\"\\u123g\""); // 'g' is not a hex digit
            parser.nextToken();
            fail("Expected JsonParseException for invalid unicode escape");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected a hex-digit"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testParseStringWithIncompleteUnicodeEscape() {
        try {
            ReaderBasedJsonParser parser = createParser("\"\\u123"); // incomplete escape sequence
            parser.nextToken();
            fail("Expected JsonParseException for incomplete unicode escape");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("in character escape sequence"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }
    
    @Test
    public void testParseFieldNameWithUnquotedSpace() {
        try {
            ReaderBasedJsonParser parser = createParser("{key value:\"val\"}"); // space in unquoted field name
            parser.nextToken();
            fail("Expected JsonParseException for space in unquoted field name");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting either valid name character"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }
    
    @Test
    public void testParseFieldNameWithMissingQuote() {
        try {
            ReaderBasedJsonParser parser = createParser("{\"key\" : \"value}"); // missing closing quote for field name
            parser.nextToken();
            assertEquals("key", parser.getText());
            parser.nextToken(); // This should fail
            fail("Expected JsonParseException for missing quote");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting closing '\"' for name"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testNumberParsingLargeInteger() throws Exception {
        String largeIntStr = "12345678901234567890"; // Larger than long
        ReaderBasedJsonParser parser = createParser(largeIntStr);
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(largeIntStr, parser.getText()); // getText should return the original string
        // It should be parsed as a double if it exceeds long's range but fits in double
        assertEquals(new BigDecimal(largeIntStr).doubleValue(), parser.getDoubleValue(), 1e9);
    }

    @Test
    public void testNumberParsingWithLeadingZerosEnabledAndComplexNumber() throws Exception {
        // Test with ALLOW_NUMERIC_LEADING_ZEROS enabled and a more complex number
        String json = "00123.45e-2";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals("00123.45e-2", parser.getText()); // Original text
        assertEquals(123.45e-2, parser.getDoubleValue(), 1e-9); // Parsed value
    }
    
    @Test
    public void testNextTokenWithCommaFollowedByComment() throws Exception {
        String json = "[\n  1, /* inline comment */\n  2\n]";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_COMMENTS.getMask());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithYAMLCommentFollowedByValue() throws Exception {
        String json = "# yaml comment\n\"value\"";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }
    
    @Test
    public void test_handle_invalid_utf8_start_byte() {
        // Simulate an invalid UTF-8 start byte. This is tricky to do with StringReader.
        // Instead, we can try to construct a scenario where `_reportInvalidInitial` might be called.
        // This often happens during multi-byte character decoding if the initial byte is malformed.
        // Since we are testing ReaderBasedJsonParser, which uses Chars, UTF-8 issues are less direct.
        // However, internal methods like _decodeCharForError can be called.
        // Let's test a character that would result in invalid UTF-8 if interpreted directly as bytes.
        // A simple way is to feed an unrepresentable character that might fall into those ranges.
        // For ReaderBasedJsonParser, this might be harder to trigger than for UTF8StreamJsonParser.
        // Testing specific error conditions in `_reportInvalidInitial` is best done with byte streams.
        // Given the context, we'll focus on reader-based inputs.
        // If an invalid char code is present in the reader, it might lead to _reportInvalidChar.
        // For example, a control character that's not whitespace.
        try {
            // Creating a Reader with a character that's invalid in JSON string context
            String invalidJson = "\"hello\u0001world\""; // Control character \u0001
            ReaderBasedJsonParser parser = createParser(invalidJson);
            parser.nextToken(); // Should throw an exception
            fail("Expected JsonParseException for invalid character");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unquoted control character"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }
    
    @Test
    public void test_handle_invalid_utf8_middle_byte() {
        // Similar to above, testing invalid middle byte is hard with Chars directly.
        // _reportInvalidOther is called when a byte sequence is malformed.
        // Again, this is more relevant to byte-based parsing.
        // For ReaderBasedJsonParser, `_throwInvalidSpace` or `_reportInvalidChar` are more likely.
        // If we try to trigger _decodeCharForError with a malformed sequence this way.
        // Let's try a sequence that might trigger this if it were bytes, but needs mapping for chars.
        // Test case for _reportInvalidOther needs to be carefully crafted to trigger it via Chars.
        // For example, a malformed escape sequence that implies a continuation byte is missing or wrong.
        try {
            // Simulate an invalid escape sequence that might lead to _reportInvalidOther if it were byte-based.
            // For ReaderBasedJsonParser, _decodeEscaped handles this. A bad hex escape is more likely.
            ReaderBasedJsonParser parser = createParser("\"\\u123"); // Incomplete unicode escape
            parser.nextToken();
            fail("Expected JsonParseException for incomplete escape");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("in character escape sequence"));
        } catch (IOException e) {
            fail("Expected JsonParseException, got IOException: " + e.getMessage());
        }
    }
}
