package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.Arrays;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.*;
import com.fasterxml.jackson.core.util.*;

public class UTF8StreamJsonParserTest {

    // Helper to create a parser from a String
    private JsonParser createParser(String json) throws IOException {
        byte[] bytes = json.getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        IOContext ctxt = new IOContext(new BufferRecycler(), bais, false);
        // Default features, and a dummy BytesToNameCanonicalizer
        return new UTF8StreamJsonParser(ctxt, JsonParser.Feature.collectDefaults(), bais, null, BytesToNameCanonicalizer.createRoot(-1), bytes, 0, bytes.length, false);
    }

    // Helper to create a parser from a String and specify features
    private JsonParser createParser(String json, int features) throws IOException {
        byte[] bytes = json.getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        IOContext ctxt = new IOContext(new BufferRecycler(), bais, false);
        return new UTF8StreamJsonParser(ctxt, features, bais, null, BytesToNameCanonicalizer.createRoot(-1), bytes, 0, bytes.length, false);
    }


    @Test
    public void testSimpleString() throws Exception {
        String json = "\"hello\"";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("hello", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testEmptyString() throws Exception {
        String json = "\"\"";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testStringWithEscape() throws Exception {
        String json = "\"hello\\nworld\"";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("hello\nworld", parser.getText());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testStringWithUnicodeEscape() throws Exception {
        String json = "\"\\u0041\""; // 'A'
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("A", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testStringWithMixedEscapes() throws Exception {
        String json = "\"line1\\nline2\\tquoted\\\"text\\\"\"";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("line1\nline2\tquoted\"text\"", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSimpleInteger() throws Exception {
        String json = "12345";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("12345", parser.getText());
        assertEquals(12345, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNegativeInteger() throws Exception {
        String json = "-67890";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("-67890", parser.getText());
        assertEquals(-67890, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testLargeInteger() throws Exception {
        String json = "2147483647"; // Max 32-bit signed int
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("2147483647", parser.getText());
        assertEquals(2147483647, parser.getIntValue());
        assertEquals(2147483647L, parser.getLongValue());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testIntegerOneAboveMaxInt() throws Exception {
        String json = "2147483648"; // One above Max 32-bit signed int
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("2147483648", parser.getText());
        assertEquals(2147483647, parser.getIntValue()); // Should wrap or truncate
        assertEquals(2147483648L, parser.getLongValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testIntegerAtMinInt() throws Exception {
        String json = "-2147483648"; // Min 32-bit signed int
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("-2147483648", parser.getText());
        assertEquals(-2147483648, parser.getIntValue());
        assertEquals(-2147483648L, parser.getLongValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testIntegerOneBelowMinInt() throws Exception {
        String json = "-2147483649"; // One below Min 32-bit signed int
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("-2147483649", parser.getText());
        assertEquals(-2147483648, parser.getIntValue()); // Should wrap or truncate
        assertEquals(-2147483649L, parser.getLongValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSimpleDouble() throws Exception {
        String json = "123.45";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, token);
        assertEquals("123.45", parser.getText());
        assertEquals(123.45, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testDoubleWithExponent() throws Exception {
        String json = "1.23e-4";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, token);
        assertEquals("1.23e-4", parser.getText());
        assertEquals(1.23e-4, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testDoubleWithPositiveExponent() throws Exception {
        String json = "5.67E+10";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, token);
        assertEquals("5.67E+10", parser.getText());
        assertEquals(5.67E10, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testDoubleZero() throws Exception {
        String json = "0.0";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, token);
        assertEquals("0.0", parser.getText());
        assertEquals(0.0, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testBooleanTrue() throws Exception {
        String json = "true";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_TRUE, token);
        assertTrue(parser.getBooleanValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testBooleanFalse() throws Exception {
        String json = "false";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_FALSE, token);
        assertFalse(parser.getBooleanValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNullValue() throws Exception {
        String json = "null";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NULL, token);
        assertNull(parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testEmptyObject() throws Exception {
        String json = "{}";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_OBJECT, token);
        assertNull(parser.nextToken());
    }

    @Test
    public void testSimpleObject() throws Exception {
        String json = "{\"key\":\"value\"}";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("key", parser.getText());
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("value", parser.getText());
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_OBJECT, token);
        assertNull(parser.nextToken());
    }

    @Test
    public void testObjectWithMultipleFields() throws Exception {
        String json = "{\"a\":1, \"b\":true, \"c\":null}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 1
        parser.nextToken(); // FIELD_NAME "b"
        parser.nextToken(); // VALUE_TRUE
        parser.nextToken(); // FIELD_NAME "c"
        parser.nextToken(); // VALUE_NULL
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_OBJECT, token);
        assertNull(parser.nextToken());
    }

    @Test
    public void testEmptyArray() throws Exception {
        String json = "[]";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_ARRAY, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_ARRAY, token);
        assertNull(parser.nextToken());
    }

    @Test
    public void testSimpleArray() throws Exception {
        String json = "[1,\"hello\",true]";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // VALUE_NUMBER_INT 1
        parser.nextToken(); // VALUE_STRING "hello"
        parser.nextToken(); // VALUE_TRUE
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_ARRAY, token);
        assertNull(parser.nextToken());
    }

    @Test
    public void testArrayWithMultipleElements() throws Exception {
        String json = "[null, {\"a\":1}, [false]]";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // VALUE_NULL
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 1
        parser.nextToken(); // END_OBJECT
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // VALUE_FALSE
        parser.nextToken(); // END_ARRAY
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_ARRAY, token);
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenAdvance() throws Exception {
        String json = "{\"name\":\"Test\", \"value\":100}";
        JsonParser parser = createParser(json);
        
        // After START_OBJECT, nextToken should return FIELD_NAME "name"
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        
        // After VALUE_STRING "Test", nextToken should return FIELD_NAME "value"
        parser.nextToken(); // VALUE_STRING "Test"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("value", parser.getCurrentName());

        // After VALUE_NUMBER_INT 100, nextToken should return END_OBJECT
        parser.nextToken(); // VALUE_NUMBER_INT 100
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        // After END_OBJECT, nextToken should return null
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTextValue() throws Exception {
        String json = "{\"string\":\"some text\", \"number\":123, \"boolean\":true}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT

        parser.nextToken(); // FIELD_NAME "string"
        assertEquals("some text", parser.nextTextValue());

        parser.nextToken(); // FIELD_NAME "number"
        assertNull(parser.nextTextValue()); // Number is not a string
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());

        parser.nextToken(); // FIELD_NAME "boolean"
        assertNull(parser.nextTextValue()); // Boolean is not a string
        assertEquals(JsonToken.VALUE_TRUE, parser.getCurrentToken());

        parser.nextToken(); // END_OBJECT
        assertNull(parser.nextTextValue());
    }
    
    @Test
    public void testNextIntValue() throws Exception {
        String json = "{\"num\":42, \"str\":\"hello\", \"bool\":false, \"big\":9876543210}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT

        parser.nextToken(); // FIELD_NAME "num"
        assertEquals(42, parser.nextIntValue(0));

        parser.nextToken(); // FIELD_NAME "str"
        assertEquals(0, parser.nextIntValue(0)); // Not an int
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());

        parser.nextToken(); // FIELD_NAME "bool"
        assertEquals(0, parser.nextIntValue(0)); // Not an int
        assertEquals(JsonToken.VALUE_FALSE, parser.getCurrentToken());

        parser.nextToken(); // FIELD_NAME "big"
        // This should return the truncated int value
        assertEquals(2147483647, parser.nextIntValue(0)); // Max int value

        parser.nextToken(); // END_OBJECT
        assertEquals(0, parser.nextIntValue(0)); // End of object
    }
    
    @Test
    public void testNextLongValue() throws Exception {
        String json = "{\"num\":42, \"str\":\"hello\", \"bool\":false, \"big\":987654321012345}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT

        parser.nextToken(); // FIELD_NAME "num"
        assertEquals(42L, parser.nextLongValue(0L));

        parser.nextToken(); // FIELD_NAME "str"
        assertEquals(0L, parser.nextLongValue(0L)); // Not a long
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());

        parser.nextToken(); // FIELD_NAME "bool"
        assertEquals(0L, parser.nextLongValue(0L)); // Not a long
        assertEquals(JsonToken.VALUE_FALSE, parser.getCurrentToken());

        parser.nextToken(); // FIELD_NAME "big"
        assertEquals(987654321012345L, parser.nextLongValue(0L));

        parser.nextToken(); // END_OBJECT
        assertEquals(0L, parser.nextLongValue(0L)); // End of object
    }

    @Test
    public void testNextBooleanValue() throws Exception {
        String json = "{\"b1\":true, \"b2\":false, \"num\":123}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT

        parser.nextToken(); // FIELD_NAME "b1"
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        parser.nextToken(); // FIELD_NAME "b2"
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        parser.nextToken(); // FIELD_NAME "num"
        assertNull(parser.nextBooleanValue()); // Not a boolean
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());

        parser.nextToken(); // END_OBJECT
        assertNull(parser.nextBooleanValue()); // End of object
    }

    @Test
    public void testFieldNameMatching() throws Exception {
        String json = "{\"exactName\":1, \"otherName\":2}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        
        SerializableString exactName = new SerializedString("exactName");
        SerializableString nonExistentName = new SerializedString("nonExistent");

        assertTrue(parser.nextFieldName(exactName));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken()); // Move past the value
        assertEquals(1, parser.getIntValue());

        assertFalse(parser.nextFieldName(exactName)); // Already consumed the field
        // Should be pointing to FIELD_NAME "otherName"
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("otherName", parser.getCurrentName());
        
        assertTrue(parser.nextFieldName(new SerializedString("otherName")));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken()); // Move past the value
        assertEquals(2, parser.getIntValue());

        assertFalse(parser.nextFieldName(nonExistentName)); // End of object
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testFieldNameMatchingWithDifferentCase() throws Exception {
        String json = "{\"caseSensitive\":1}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        
        SerializableString lowerCaseName = new SerializedString("casesensitive");
        assertFalse(parser.nextFieldName(lowerCaseName));
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken()); // Still pointing to the field name
        assertEquals("caseSensitive", parser.getCurrentName());
    }
    
    @Test
    public void testFieldNameMatchingWithDifferentCaseEnabled() throws Exception {
        String json = "{\"caseSensitive\":1}";
        // Enabling IGNORE_CASE for comparison
        JsonParser parser = createParser(json, JsonParser.Feature.collectDefaults() | Feature.IGNORE_CASE.getMask());
        parser.nextToken(); // START_OBJECT
        
        SerializableString lowerCaseName = new SerializedString("casesensitive");
        // Should return true because IGNORE_CASE is enabled
        assertTrue(parser.nextFieldName(lowerCaseName));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        String json = "{\"name\":\"TestName\", \"value\":123}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT

        parser.nextToken(); // FIELD_NAME "name"
        char[] nameChars = parser.getTextCharacters();
        assertNotNull(nameChars);
        assertEquals("TestName", new String(nameChars, parser.getTextOffset(), parser.getTextLength()));

        parser.nextToken(); // VALUE_STRING "TestName"
        char[] valueChars = parser.getTextCharacters();
        assertNotNull(valueChars);
        assertEquals("TestName", new String(valueChars, parser.getTextOffset(), parser.getTextLength()));

        parser.nextToken(); // FIELD_NAME "value"
        char[] fieldNameChars = parser.getTextCharacters();
        assertNotNull(fieldNameChars);
        assertEquals("value", new String(fieldNameChars, parser.getTextOffset(), parser.getTextLength()));

        parser.nextToken(); // VALUE_NUMBER_INT 123
        char[] numberChars = parser.getTextCharacters();
        assertNotNull(numberChars);
        assertEquals("123", new String(numberChars, parser.getTextOffset(), parser.getTextLength()));
    }

    @Test
    public void testGetTextLength() throws Exception {
        String json = "{\"short\":\"s\", \"long\":\"verylongstring\"}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT

        parser.nextToken(); // FIELD_NAME "short"
        assertEquals("short".length(), parser.getTextLength());

        parser.nextToken(); // VALUE_STRING "s"
        assertEquals("s".length(), parser.getTextLength());

        parser.nextToken(); // FIELD_NAME "long"
        assertEquals("long".length(), parser.getTextLength());

        parser.nextToken(); // VALUE_STRING "verylongstring"
        assertEquals("verylongstring".length(), parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        // The offset is usually 0 for strings and numbers parsed into TextBuffer
        // Field names can have different offsets if they are part of the context
        String json = "{\"field\":\"value\"}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT

        parser.nextToken(); // FIELD_NAME "field"
        // The offset for field names might not always be 0 if managed internally.
        // For simplicity and robustness, check the text content.
        // Let's ensure that getTextOffset returns a non-negative value.
        assertTrue(parser.getTextOffset() >= 0);

        parser.nextToken(); // VALUE_STRING "value"
        assertEquals(0, parser.getTextOffset()); // Should be 0 for Value Strings/Numbers

        parser.nextToken(); // END_OBJECT
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetBinaryValue() throws Exception {
        String json = "\"SGVsbG8gV29ybGQ=\""; // "Hello World" in Base64
        JsonParser parser = createParser(json);
        parser.nextToken(); // VALUE_STRING

        byte[] binaryData = parser.getBinaryValue(Base64Variants.getDefault());
        assertArrayEquals("Hello World".getBytes(), binaryData);
    }

    @Test
    public void testGetBinaryValueEmptyString() throws Exception {
        String json = "\"\"";
        JsonParser parser = createParser(json);
        parser.nextToken(); // VALUE_STRING

        byte[] binaryData = parser.getBinaryValue(Base64Variants.getDefault());
        assertArrayEquals(new byte[0], binaryData);
    }

    @Test
    public void testGetBinaryValueWithPadding() throws Exception {
        String json = "\"Zm9vYg==\""; // "foob" in Base64
        JsonParser parser = createParser(json);
        parser.nextToken(); // VALUE_STRING

        byte[] binaryData = parser.getBinaryValue(Base64Variants.getDefault());
        assertArrayEquals("foob".getBytes(), binaryData);
    }

    @Test
    public void testGetBinaryValueNoPadding() throws Exception {
        String json = "\"Zm9vYg\""; // "foob" in Base64, no padding
        // Using a Base64Variant that does not use padding
        Base64Variant noPaddingVariant = Base64Variants.getDefault().withPaddingChar((char)0);
        
        JsonParser parser = createParser(json);
        parser.nextToken(); // VALUE_STRING

        // Test with default variant, which expects padding
        try {
            parser.getBinaryValue(Base64Variants.getDefault());
            fail("Expected exception for missing padding with default variant");
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testReadBinaryValue() throws Exception {
        String json = "\"SGVsbG8gV29ybGQ=\""; // "Hello World" in Base64
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JsonParser parser = createParser(json);
        parser.nextToken(); // VALUE_STRING

        int bytesRead = parser.readBinaryValue(Base64Variants.getDefault(), baos);
        assertEquals("Hello World".length(), bytesRead);
        assertArrayEquals("Hello World".getBytes(), baos.toByteArray());
    }

    @Test
    public void testReadBinaryValueEmpty() throws Exception {
        String json = "\"\"";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JsonParser parser = createParser(json);
        parser.nextToken(); // VALUE_STRING

        int bytesRead = parser.readBinaryValue(Base64Variants.getDefault(), baos);
        assertEquals(0, bytesRead);
        assertArrayEquals(new byte[0], baos.toByteArray());
    }
    
    @Test
    public void testGetTokenLocation() throws Exception {
        String json = "{\"field\":\"value\"}";
        JsonParser parser = createParser(json);
        JsonLocation loc;

        // Before first token
        loc = parser.getTokenLocation();
        assertEquals(-1, loc.getByteOffset());
        assertEquals(-1, loc.getCharOffset());
        assertEquals(1, loc.getLineNr());
        assertEquals(1, loc.getColumnNr());

        parser.nextToken(); // START_OBJECT
        loc = parser.getTokenLocation();
        assertEquals(0, loc.getByteOffset()); // Start of input
        assertEquals(1, loc.getLineNr());
        assertEquals(1, loc.getColumnNr());

        parser.nextToken(); // FIELD_NAME "field"
        loc = parser.getTokenLocation();
        assertTrue(loc.getByteOffset() > 0); // Should be after START_OBJECT
        assertEquals(1, loc.getLineNr());
        assertEquals(2, loc.getColumnNr()); // After "{"

        parser.nextToken(); // VALUE_STRING "value"
        loc = parser.getTokenLocation();
        assertTrue(loc.getByteOffset() > 0); // Should be after FIELD_NAME
        assertEquals(1, loc.getLineNr());
        // Column number depends on exact spacing, assert it's reasonable
        assertTrue(loc.getColumnNr() > 0); 

        parser.nextToken(); // END_OBJECT
        loc = parser.getTokenLocation();
        assertTrue(loc.getByteOffset() > 0); // Should be after VALUE_STRING
        assertEquals(1, loc.getLineNr());
        assertTrue(loc.getColumnNr() > 0);
    }

    @Test
    public void testGetCurrentLocation() throws Exception {
        String json = "{\"field\":\"value\"}";
        JsonParser parser = createParser(json);
        JsonLocation loc;

        // Initial location
        loc = parser.getCurrentLocation();
        assertEquals(0, loc.getByteOffset());
        assertEquals(1, loc.getLineNr());
        assertEquals(1, loc.getColumnNr());

        parser.nextToken(); // START_OBJECT
        loc = parser.getCurrentLocation();
        // Location should be after the token that was just read
        assertEquals(1, loc.getByteOffset()); // After '{'
        assertEquals(1, loc.getLineNr());
        assertEquals(2, loc.getColumnNr());

        parser.nextToken(); // FIELD_NAME "field"
        loc = parser.getCurrentLocation();
        assertEquals(2, loc.getByteOffset()); // After '"'
        assertEquals(1, loc.getLineNr());
        assertEquals(3, loc.getColumnNr());

        parser.nextToken(); // VALUE_STRING "value"
        loc = parser.getCurrentLocation();
        assertEquals(9, loc.getByteOffset()); // After '"' of field name
        assertEquals(1, loc.getLineNr());
        assertEquals(10, loc.getColumnNr());
    }
    
    @Test
    public void testNumbersWithLeadingZerosDisabled() throws Exception {
        String json = "0123";
        JsonParser parser = createParser(json);
        try {
            parser.nextToken();
            fail("Should have failed due to leading zero");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Leading zeroes not allowed"));
        }
    }

    @Test
    public void testNumbersWithLeadingZerosEnabled() throws Exception {
        String json = "0123";
        // Enable ALLOW_NUMERIC_LEADING_ZEROS
        JsonParser parser = createParser(json, JsonParser.Feature.collectDefaults() | Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("0123", parser.getText());
        assertEquals(123, parser.getIntValue());
    }
    
    @Test
    public void testNumberZero() throws Exception {
        String json = "0";
        JsonParser parser = createParser(json);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("0", parser.getText());
        assertEquals(0, parser.getIntValue());
    }

    @Test
    public void testNumberStartingWithPlus() throws Exception {
        String json = "+123";
        JsonParser parser = createParser(json);
        try {
            parser.nextToken();
            fail("Should have failed due to leading plus sign");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected digit (0-9) to follow plus sign"));
        }
    }
    
    @Test
    public void testNumberWithTrailingJunk() throws Exception {
        String json = "123abc";
        JsonParser parser = createParser(json);
        try {
            parser.nextToken();
            fail("Should have failed due to trailing characters");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unrecognized token 'abc'"));
        }
    }

    @Test
    public void testEscapedFieldName() throws Exception {
        String json = "{\"field\\\"name\":1}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "field\"name"
        assertEquals("field\"name", parser.getCurrentName());
        parser.nextToken(); // VALUE_NUMBER_INT 1
        parser.nextToken(); // END_OBJECT
    }

    @Test
    public void testFieldNameWithUnicodeEscape() throws Exception {
        String json = "{\"\\u0066ield\":1}"; // \u0066 is 'f'
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "field"
        assertEquals("field", parser.getCurrentName());
        parser.nextToken(); // VALUE_NUMBER_INT 1
        parser.nextToken(); // END_OBJECT
    }
    
    @Test
    public void testUnquotedFieldNameAllowed() throws Exception {
        String json = "{key:\"value\"}";
        JsonParser parser = createParser(json, JsonParser.Feature.collectDefaults() | Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask());
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        assertEquals("key", parser.getCurrentName());
        parser.nextToken(); // VALUE_STRING "value"
        parser.nextToken(); // END_OBJECT
    }

    @Test
    public void testUnquotedFieldNameNotAllowed() throws Exception {
        String json = "{key:\"value\"}";
        JsonParser parser = createParser(json); // Default, unquoted not allowed
        try {
            parser.nextToken(); // START_OBJECT
            parser.nextToken(); // FIELD_NAME "key"
            fail("Should have failed due to unquoted field name");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting double-quote to start field name"));
        }
    }
    
    @Test
    public void testStringWithApostropheAllowed() throws Exception {
        String json = "{'key':'value'}";
        JsonParser parser = createParser(json, JsonParser.Feature.collectDefaults() | Feature.ALLOW_SINGLE_QUOTES.getMask());
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        assertEquals("key", parser.getCurrentName());
        parser.nextToken(); // VALUE_STRING "value"
        assertEquals("value", parser.getText());
        parser.nextToken(); // END_OBJECT
    }

    @Test
    public void testStringWithApostropheNotAllowed() throws Exception {
        String json = "{'key':'value'}";
        JsonParser parser = createParser(json); // Default, single quotes not allowed
        try {
            parser.nextToken(); // START_OBJECT
            parser.nextToken(); // FIELD_NAME 'key' - error here if not careful
            fail("Should have failed due to single quote in field name or value");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting double-quote to start field name") || 
                       e.getMessage().contains("expected a valid value") ||
                       e.getMessage().contains("Unrecognized token 'key'"));
        }
    }

    @Test
    public void testIntegerParsingEdgeCaseZero() throws Exception {
        String json = "0";
        JsonParser parser = createParser(json);
        parser.nextToken();
        assertEquals(0, parser.getIntValue());
    }

    @Test
    public void testIntegerParsingEdgeCaseMaxInt() throws Exception {
        String json = "2147483647";
        JsonParser parser = createParser(json);
        parser.nextToken();
        assertEquals(2147483647, parser.getIntValue());
    }

    @Test
    public void testIntegerParsingEdgeCaseMinInt() throws Exception {
        String json = "-2147483648";
        JsonParser parser = createParser(json);
        parser.nextToken();
        assertEquals(-2147483648, parser.getIntValue());
    }
    
    @Test
    public void testDoubleParsingEdgeCaseSmallestPositive() throws Exception {
        String json = "4.9E-324"; // Smallest positive double
        JsonParser parser = createParser(json);
        parser.nextToken();
        // The delta for the smallest double is very small. Using a reasonable epsilon for comparison.
        assertEquals(4.9E-324, parser.getDoubleValue(), 1e-324); 
    }

    @Test
    public void testDoubleParsingEdgeCaseLargestNegative() throws Exception {
        String json = "-1.7976931348623157E308"; // Largest negative double
        JsonParser parser = createParser(json);
        parser.nextToken();
        assertEquals(-1.7976931348623157E308, parser.getDoubleValue(), 1e-308);
    }

    @Test
    public void testNonNumericNumbersAllowed() throws Exception {
        String json = "[NaN, Infinity, -Infinity]";
        JsonParser parser = createParser(json, JsonParser.Feature.collectDefaults() | Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // NaN
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
        parser.nextToken(); // Infinity
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0);
        parser.nextToken(); // -Infinity
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getCurrentToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0);
        parser.nextToken(); // END_ARRAY
    }
    
    @Test
    public void testNonNumericNumbersNotAllowed() throws Exception {
        String json = "[NaN]";
        JsonParser parser = createParser(json); // Default, not allowed
        try {
            parser.nextToken();
            fail("Should have failed due to NaN");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Non-standard token 'NaN'"));
        }
    }
    
    @Test
    public void testCommentsAllowed() throws Exception {
        String json = "/* comment */ { \"key\": 1 /* inline comment */ } // line comment";
        JsonParser parser = createParser(json, JsonParser.Feature.collectDefaults() | Feature.ALLOW_COMMENTS.getMask());
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        parser.nextToken(); // VALUE_NUMBER_INT 1
        parser.nextToken(); // END_OBJECT
        assertNull(parser.nextToken()); // End of input
    }

    @Test
    public void testCommentsNotAllowed() throws Exception {
        String json = "{ /* comment */ \"key\": 1 }";
        JsonParser parser = createParser(json); // Default, comments not allowed
        try {
            parser.nextToken(); // START_OBJECT
            parser.nextToken(); // Field name, should fail at comment
            fail("Should have failed due to comment");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("maybe a (non-standard) comment?"));
        }
    }
    
    @Test
    public void testYAMLCommentsAllowed() throws Exception {
        String json = "{ \"key\": 1 # YAML comment \n}";
        JsonParser parser = createParser(json, JsonParser.Feature.collectDefaults() | Feature.ALLOW_YAML_COMMENTS.getMask());
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        parser.nextToken(); // VALUE_NUMBER_INT 1
        parser.nextToken(); // END_OBJECT
        assertNull(parser.nextToken());
    }

    @Test
    public void testYAMLCommentsNotAllowed() throws Exception {
        String json = "{ \"key\": 1 # YAML comment \n}";
        JsonParser parser = createParser(json); // Default, YAML comments not allowed
        try {
            parser.nextToken(); // START_OBJECT
            parser.nextToken(); // FIELD_NAME "key"
            parser.nextToken(); // VALUE_NUMBER_INT 1
            parser.nextToken(); // END_OBJECT
            fail("Should have failed due to YAML comment");
        } catch (JsonParseException e) {
            // The parser might interpret '#' as part of a string or invalid token depending on context
            // The specific error message can vary. We check for general failure.
            assertTrue(e.getMessage().contains("Unexpected character '#'"));
        }
    }
    
    @Test
    public void testEmptyInput() throws Exception {
        String json = "";
        JsonParser parser = createParser(json);
        assertNull(parser.nextToken()); // Should return null for empty input
    }
    
    @Test
    public void testInputWithOnlyWhitespace() throws Exception {
        String json = "   \n \t ";
        JsonParser parser = createParser(json);
        assertNull(parser.nextToken()); // Should return null after skipping whitespace
    }
    
    @Test
    public void testUTF8CharactersInString() throws Exception {
        // String containing multi-byte UTF-8 characters
        String json = "\"你好世界\""; // "Hello World" in Chinese
        JsonParser parser = createParser(json);
        parser.nextToken();
        assertEquals("你好世界", parser.getText());
    }

    @Test
    public void testUTF8CharactersInFieldName() throws Exception {
        String json = "{\"你好\":\"世界\"}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "你好"
        assertEquals("你好", parser.getCurrentName());
        parser.nextToken(); // VALUE_STRING "世界"
        assertEquals("世界", parser.getText());
        parser.nextToken(); // END_OBJECT
    }

    // Tests for methods not previously covered
    @Test
    public void testGetCodecAndSetCodec() throws Exception {
        String json = "{}";
        JsonParser parser = createParser(json);
        assertNull(parser.getCodec()); // Initially null
        
        ObjectCodec mockCodec = new ObjectMapper(); // Use a concrete implementation for testing
        parser.setCodec(mockCodec);
        assertNotNull(parser.getCodec());
        assertEquals(mockCodec, parser.getCodec());
    }

    @Test
    public void testReleaseBuffered() throws Exception {
        String json = "{\"key\":\"value\"}";
        byte[] bytes = json.getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        IOContext ctxt = new IOContext(new BufferRecycler(), bais, false);
        // Create parser with full buffer to test releaseBuffered
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, JsonParser.Feature.collectDefaults(), bais, null, BytesToNameCanonicalizer.createRoot(-1), bytes, 0, bytes.length, false);

        // Read some data
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Release the remaining buffered data
        int released = parser.releaseBuffered(baos);
        assertTrue(released > 0);
        // Check if the released bytes match the remaining JSON string
        assertEquals(new String(bytes, parser._inputPtr, parser._inputEnd - parser._inputPtr), baos.toString());
        assertEquals(parser._inputEnd - parser._inputPtr, released);
    }

    @Test
    public void testGetInputSource() throws Exception {
        String json = "{}";
        byte[] bytes = json.getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        IOContext ctxt = new IOContext(new BufferRecycler(), bais, false);
        JsonParser parser = new UTF8StreamJsonParser(ctxt, JsonParser.Feature.collectDefaults(), bais, null, BytesToNameCanonicalizer.createRoot(-1), bytes, 0, bytes.length, false);

        Object source = parser.getInputSource();
        assertNotNull(source);
        assertEquals(bais, source); // Should return the underlying InputStream
    }
    
    @Test
    public void testGetValueAsStringDefault() throws Exception {
        String json = "{\"field\":\"value\"}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "field"
        parser.nextToken(); // VALUE_STRING "value"
        assertEquals("value", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefault() throws Exception {
        String json = "{\"field\":123}";
        JsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "field"
        parser.nextToken(); // VALUE_NUMBER_INT 123
        assertEquals("123", parser.getValueAsString("default")); // Should return the string representation of the number
        
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getValueAsString("default")); // Should return default for null token
    }

    @Test
    public void testGrowArrayBy() throws Exception {
        int[] initialArray = {1, 2, 3};
        int[] grownArray = UTF8StreamJsonParser.growArrayBy(initialArray, 5);
        assertEquals(initialArray.length + 5, grownArray.length);
        assertEquals(1, grownArray[0]);
        assertEquals(2, grownArray[1]);
        assertEquals(3, grownArray[2]);

        int[] grownNullArray = UTF8StreamJsonParser.growArrayBy(null, 2);
        assertEquals(2, grownNullArray.length);
    }
}
