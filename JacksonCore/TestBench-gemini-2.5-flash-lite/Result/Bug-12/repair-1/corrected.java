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
// Added import for ObjectReader
import com.fasterxml.jackson.databind.ObjectReader;
// Added import for SerializedString
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter;
// Added import for Base64Variants
import com.fasterxml.jackson.core.Base64Variants;


public class ReaderBasedJsonParserTest {

    // Helper to create a parser with minimal setup
    private ReaderBasedJsonParser createParser(String json) throws IOException {
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        // The constructor for ReaderBasedJsonParser needs an ObjectCodec, even if null
        return new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
    }

    // Helper to create a parser with object codec
    private ReaderBasedJsonParser createParserWithCodec(String json) throws IOException {
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        // Using a simple ObjectCodec for demonstration
        ObjectReader objectReader = new ObjectReader(null, null, null, null, null, null); // Corrected instantiation
        return new ReaderBasedJsonParser(ctxt, 0, reader, objectReader.getCodec(), symbols);
    }

    @Test
    public void testNextTokenSimpleString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testNextTokenEmptyObject() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_OBJECT, token);
        token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextTokenEmptyArray() throws Exception {
        ReaderBasedJsonParser parser = createParser("[]");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_ARRAY, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_ARRAY, token);
        token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextTokenSimpleNumber() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("123", parser.getText());
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testNextTokenSimpleDouble() throws Exception {
        ReaderBasedJsonParser parser = createParser("123.45");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, token);
        assertEquals("123.45", parser.getText());
        assertEquals(123.45, parser.getDoubleValue(), 0.00001);
    }

    @Test
    public void testNextTokenBooleanTrue() throws Exception {
        ReaderBasedJsonParser parser = createParser("true");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_TRUE, token);
        assertTrue(parser.getBooleanValue());
    }

    @Test
    public void testNextTokenBooleanFalse() throws Exception {
        ReaderBasedJsonParser parser = createParser("false");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_FALSE, token);
        assertFalse(parser.getBooleanValue());
    }

    @Test
    public void testNextTokenNull() throws Exception {
        ReaderBasedJsonParser parser = createParser("null");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NULL, token);
        assertNull(parser.getText());
    }

    @Test
    public void testNextTokenFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"name\":1");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("name", parser.getCurrentName());
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
    }

    @Test
    public void testNextTokenEscapedString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\\nworld\"");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("hello\nworld", parser.getText());
    }

    @Test
    public void testNextTokenUnicodeEscapedString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"hello\\u0041world\"");
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("helloAworld", parser.getText());
    }

    @Test
    public void testNextTokenComplexJson() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"a\":[1, true, null, \"b\"]}");
        JsonToken token = parser.nextToken();
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("a", parser.getCurrentName());
        token = parser.nextToken();
        assertEquals(JsonToken.START_ARRAY, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(1, parser.getIntValue());
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NULL, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("b", parser.getText());
        token = parser.nextToken();
        assertEquals(JsonToken.END_ARRAY, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_OBJECT, token);
        token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testGetIntValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("12345");
        parser.nextToken();
        assertEquals(12345, parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("9876543210");
        parser.nextToken();
        assertEquals(9876543210L, parser.getLongValue());
    }

    @Test
    public void testGetDoubleValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("1.23456789e-10");
        parser.nextToken();
        assertEquals(1.23456789e-10, parser.getDoubleValue(), 1e-15);
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"some text\"");
        parser.nextToken();
        char[] textChars = parser.getTextCharacters();
        assertNotNull(textChars);
        // The buffer might be larger than needed, so check length
        assertEquals("some text", new String(textChars, parser.getTextOffset(), parser.getTextLength()));
    }

    @Test
    public void testGetTextLength() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"short\"");
        parser.nextToken();
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"offset\"");
        parser.nextToken();
        // For simple strings, offset is usually 0. This is more for internal buffer management.
        // Asserting it's non-negative is a reasonable check.
        assertTrue(parser.getTextOffset() >= 0);
    }

    @Test
    public void testBinaryValueDecoding() throws Exception {
        // Base64 encoding of "hello"
        ReaderBasedJsonParser parser = createParser("\"aGVsbG8=\"");
        parser.nextToken();
        byte[] binaryData = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("hello".getBytes(), binaryData);
    }

    @Test
    public void testReadBinaryValueStreaming() throws Exception {
        // Base64 encoding of "world"
        ReaderBasedJsonParser parser = createParser("\"d29ybGQ=\"");
        parser.nextToken();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        parser.readBinaryValue(Base64Variants.getDefaultVariant(), baos);
        assertArrayEquals("world".getBytes(), baos.toByteArray());
    }

    @Test
    public void testNextBooleanValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("true");
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        parser = createParser("false");
        parser.nextToken();
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        parser = createParser("123"); // Not a boolean
        parser.nextToken();
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testNextIntValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("42");
        parser.nextToken();
        assertEquals(42, parser.nextIntValue(0));

        parser = createParser("abc"); // Not an int
        parser.nextToken();
        assertEquals(-1, parser.nextIntValue(-1));
    }

    @Test
    public void testNextLongValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("123456789012345");
        parser.nextToken();
        assertEquals(123456789012345L, parser.nextLongValue(0L));

        parser = createParser("abc"); // Not a long
        parser.nextToken();
        assertEquals(-1L, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextTokenWithComments() throws Exception {
        ReaderBasedJsonParser parser = createParser("/* comment */ 123 /* another */");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals("123", parser.getText());
    }

    @Test
    public void testNextTokenWithYAMLComments() throws Exception {
        ReaderBasedJsonParser parser = createParser("// YAML comment \n 456");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals("456", parser.getText());
    }

    @Test
    public void testTextBufferContentsAsString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"test string\"");
        parser.nextToken();
        // Ensure textBuffer contents are correctly reflected as string
        assertEquals("test string", parser.getText());
    }

    @Test
    public void testFieldNameMismatch() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"name\": 1, \"other\" : 2}");
        parser.nextToken(); // FIELD_NAME "name"
        parser.nextToken(); // VALUE_NUMBER_INT 1
        // Advance past comma and whitespace
        parser.nextToken(); // FIELD_NAME "other"
        assertEquals("other", parser.getCurrentName());
    }

    @Test
    public void testNumberParsingNegativeZero() throws Exception {
        ReaderBasedJsonParser parser = createParser("-0");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals("-0", parser.getText());
        assertEquals(0, parser.getIntValue()); // Should parse as 0
    }

    @Test
    public void testNumberParsingPositiveZero() throws Exception {
        ReaderBasedJsonParser parser = createParser("+0");
        // This should technically be an error in standard JSON, but some parsers allow it.
        // The reference code seems to allow it and parse as 0.
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals("+0", parser.getText());
        assertEquals(0, parser.getIntValue()); // Should parse as 0
    }

    @Test
    public void testNumberParsingVeryLargeDouble() throws Exception {
        // A double value that is very close to Double.MAX_VALUE
        ReaderBasedJsonParser parser = createParser("1.7976931348623157E308");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(Double.MAX_VALUE, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testNumberParsingVerySmallDouble() throws Exception {
        // A double value that is very close to Double.MIN_VALUE (smallest positive non-zero)
        ReaderBasedJsonParser parser = createParser("4.9E-324");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(Double.MIN_VALUE, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testNumberParsingMaxInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("2147483647");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(2147483647, parser.getIntValue());
        assertEquals(2147483647L, parser.getLongValue());
    }

    @Test
    public void testNumberParsingMinInt() throws Exception {
        ReaderBasedJsonParser parser = createParser("-2147483648");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(-2147483648, parser.getIntValue());
        assertEquals(-2147483648L, parser.getLongValue());
    }

    @Test
    public void testNumberParsingMaxLong() throws Exception {
        ReaderBasedJsonParser parser = createParser("9223372036854775807");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(9223372036854775807L, parser.getLongValue());
    }

    @Test
    public void testNumberParsingMinLong() throws Exception {
        ReaderBasedJsonParser parser = createParser("-9223372036854775808");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(-9223372036854775808L, parser.getLongValue());
    }

    @Test
    public void testNumberParsingExceedsMaxLong() throws Exception {
        // Value greater than Long.MAX_VALUE, should be parsed as double
        ReaderBasedJsonParser parser = createParser("9223372036854775808");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(9.223372036854776E18, parser.getDoubleValue(), 1e9); // Check against double representation
    }

    @Test
    public void testNumberParsingExceedsMinLong() throws Exception {
        // Value less than Long.MIN_VALUE, should be parsed as double
        ReaderBasedJsonParser parser = createParser("-9223372036854775809");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(-9.223372036854777E18, parser.getDoubleValue(), 1e9); // Check against double representation
    }

    @Test
    public void testGetStringValueWithLeadingZeros() throws Exception {
        // This test is more about the behavior of number parsing with leading zeros if enabled.
        // Standard JSON does not allow leading zeros for integers.
        // The default behavior for ReaderBasedJsonParser in Jackson 2.x typically disallows it
        // unless ALLOW_NUMERIC_LEADING_ZEROS is enabled.
        // We will test the default behavior which should error or parse as string if not numeric.
        // If it's parsed as a string, getText should return it.
        ReaderBasedJsonParser parser = createParser("\"007\"");
        JsonToken token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("007", parser.getText());

        // If it were to parse as a number and ALLOW_NUMERIC_LEADING_ZEROS was true:
        // parser = createParser("007");
        // parser.nextToken();
        // assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        // assertEquals(7, parser.getIntValue()); // Expected if leading zeros allowed
    }

    @Test
    public void testNumberWithExponent() throws Exception {
        ReaderBasedJsonParser parser = createParser("1e10");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(1e10, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testNumberWithExponentAndSign() throws Exception {
        ReaderBasedJsonParser parser = createParser("1.5e-5");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(1.5e-5, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testGetLocationAfterFieldName() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"field\": 1}");
        parser.nextToken(); // FIELD_NAME
        JsonLocation loc = parser.getTokenLocation();
        // The location of the FIELD_NAME token
        assertEquals(0, loc.getColumnNr()); // Column is 0-based
        assertEquals(1, loc.getLineNr());
        assertEquals(0, loc.getByteOffset()); // Byte offset might be different depending on exact implementation
    }

    @Test
    public void testGetCurrentLocation() throws Exception {
        ReaderBasedJsonParser parser = createParser(" [ 1 , 2 ] ");
        parser.nextToken(); // START_ARRAY
        JsonLocation loc1 = parser.getCurrentLocation();
        // Location should be after START_ARRAY, so pointing to the whitespace before '1'
        assertTrue(loc1.getByteOffset() > 0); // Offset should advance

        parser.nextToken(); // VALUE_NUMBER_INT 1
        JsonLocation loc2 = parser.getCurrentLocation();
        // Location should be after VALUE_NUMBER_INT 1, pointing to whitespace after it
        assertTrue(loc2.getByteOffset() > loc1.getByteOffset());

        parser.nextToken(); // END_ARRAY
        JsonLocation loc3 = parser.getCurrentLocation();
        assertTrue(loc3.getByteOffset() > loc2.getByteOffset());
    }

    @Test
    public void testReleaseBuffered() throws Exception {
        // To test releaseBuffered, we need to ensure the parser has some buffered data.
        // A simple way is to read some content.
        String json = "{\"key\": \"value\"}";
        StringReader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);

        // Read enough to potentially buffer
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        parser.nextToken(); // VALUE_STRING "value"

        StringWriter sw = new StringWriter();
        // The actual buffered content is what's left in the input buffer.
        // For ReaderBasedJsonParser, the reader itself holds the unread data.
        // releaseBuffered writes from the internal _inputBuffer. We need to ensure
        // some data is in _inputBuffer and _inputPtr < _inputEnd.
        // A more direct test would involve a known internal buffer state, but for now,
        // let's assume after reading tokens, there might be some buffered data.
        // This test might be fragile depending on internal buffering behavior.
        // For robustness, let's create a case where loadMore() has been called.

        // Let's try a simpler string that might leave data in the buffer.
        StringReader reader2 = new StringReader("some text left in buffer");
        IOContext ctxt2 = new IOContext(new BufferRecycler(), reader2, false);
        CharsToNameCanonicalizer symbols2 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser2 = new ReaderBasedJsonParser(ctxt2, 0, reader2, null, symbols2);
        
        // Manually fill the buffer to simulate state
        parser2.loadMore(); // This reads into _inputBuffer

        StringWriter sw2 = new StringWriter();
        int written = parser2.releaseBuffered(sw2);
        assertTrue("releaseBuffered should write some data", written > 0);
        // Check if the written content matches what's left in the buffer after loadMore
        // This part is tricky to assert precisely without knowing internal state.
        // A basic check that it wrote something is a start.
        // If the source string was "some text left in buffer", and loadMore() read it all,
        // then after releaseBuffered, the string should match.
        assertTrue(sw2.toString().contains("some text")); 
    }

    @Test
    public void testGetValueAsString() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"a value\"");
        parser.nextToken();
        assertEquals("a value", parser.getValueAsString());

        parser = createParser("123");
        parser.nextToken();
        assertEquals("123", parser.getValueAsString());

        parser = createParser("{\"field\":\"value\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("value", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefault() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals("123", parser.getValueAsString("default")); // Value exists

        parser = createParser("null");
        parser.nextToken(); // VALUE_NULL
        assertEquals("default", parser.getValueAsString("default")); // Value is null
    }

    @Test
    public void testGetBinaryValueEmpty() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"\""); // Empty string
        parser.nextToken();
        byte[] binaryData = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[0], binaryData);
    }

    @Test
    public void testGetBinaryValueWithPadding() throws Exception {
        // Base64 encoding of "AB" is "QUI="
        ReaderBasedJsonParser parser = createParser("\"QUI=\"");
        parser.nextToken();
        byte[] binaryData = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("AB".getBytes(), binaryData);
    }

    @Test
    public void testGetBinaryValueWithoutPadding() throws Exception {
        // Base64 encoding of "ABC" is "QUJD"
        // Some decoders might accept input without padding
        ReaderBasedJsonParser parser = createParser("\"QUJD\"");
        parser.nextToken();
        // Use a Base64Variant that allows for missing padding
        Base64Variant variantWithoutPadding = Base64Variants.MIME_NO_LINEFEEDS.withPaddingChar('?'); // This is not quite right, need a variant that handles missing padding. The getBinaryValue will internally check.
        // Re-creating a variant that allows missing padding if possible, or relying on default behavior
        Base64Variant variant = Base64Variants.getDefaultVariant(); // Default usually handles this.
        byte[] binaryData = parser.getBinaryValue(variant);
        assertArrayEquals("ABC".getBytes(), binaryData);
    }

    @Test
    public void testNextFieldNameLiteralMatch() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"expectedName\": 1}");
        parser.nextToken(); // START_OBJECT
        // Use SerializedString with the actual name
        boolean matched = parser.nextFieldName(new SerializedString("expectedName"));
        assertTrue(matched);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextFieldNameLiteralMismatch() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"otherName\": 1}");
        parser.nextToken(); // START_OBJECT
        // Use SerializedString with a name that does not match
        boolean matched = parser.nextFieldName(new SerializedString("expectedName"));
        assertFalse(matched);
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken()); // Should still advance to FIELD_NAME
        assertEquals("otherName", parser.getCurrentName());
    }

    @Test
    public void testNextTextValueSimple() throws Exception {
        ReaderBasedJsonParser parser = createParser("\"just text\"");
        parser.nextToken();
        assertEquals("just text", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueNotString() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        parser.nextToken();
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextBooleanValueFromField() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"flag\": true}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "flag"
        // Call nextBooleanValue() after the field name
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testGetCodec() throws Exception {
        ReaderBasedJsonParser parser = createParserWithCodec("123");
        assertNotNull(parser.getCodec());
        // Further assertions would depend on the mock ObjectCodec used
    }

    @Test
    public void testSetCodec() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        // Create a new ObjectReader to get a codec instance
        ObjectReader newObjectReader = new ObjectReader(null, null, null, null, null, null);
        ObjectCodec newCodec = newObjectReader.getCodec();
        parser.setCodec(newCodec);
        assertNotNull(parser.getCodec());
        assertEquals(newCodec, parser.getCodec());
    }

    @Test
    public void testGetInputSource() throws Exception {
        String input = "some input";
        StringReader reader = new StringReader(input);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        // The constructor requires an ObjectCodec, can be null for basic parsing
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
        assertEquals(reader, parser.getInputSource());
    }

    @Test
    public void testGetIntValueDefault() throws Exception {
        ReaderBasedJsonParser parser = createParser("null");
        parser.nextToken();
        assertEquals(0, parser.getIntValue()); // Default for null
    }

    @Test
    public void testGetLongValueDefault() throws Exception {
        ReaderBasedJsonParser parser = createParser("null");
        parser.nextToken();
        assertEquals(0L, parser.getLongValue()); // Default for null
    }
    
    @Test
    public void testGrowArrayBy() throws Exception {
        int[] originalArray = {1, 2};
        // Call the static method directly
        int[] newArray = ReaderBasedJsonParser.growArrayBy(originalArray, 3);
        assertEquals(5, newArray.length);
        assertEquals(1, newArray[0]);
        assertEquals(2, newArray[1]);
    }

    @Test
    public void testGrowArrayByNull() throws Exception {
        // Call the static method directly
        int[] newArray = ReaderBasedJsonParser.growArrayBy(null, 3);
        assertEquals(3, newArray.length);
    }
}
