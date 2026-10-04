package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.type.TypeReference;
import java.net.URL;

public class TokenBufferTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testWriteStartArrayAndEndArray() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Use constructor with codec and hasNativeIds
        buffer.writeStartArray();
        buffer.writeEndArray();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStartObjectAndEndObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteFieldName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("testField");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("testField", parser.getCurrentName());
        parser.nextToken(); // END_OBJECT
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testWriteStringEmpty() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberShort() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber((short) 123);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberInt() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(12345);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(12345, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberIntMax() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(Integer.MAX_VALUE);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberIntMin() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(Integer.MIN_VALUE);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MIN_VALUE, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberLong() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(1234567890123L);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1234567890123L, parser.getLongValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberLongMax() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(Long.MAX_VALUE);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberLongMin() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(Long.MIN_VALUE);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Long.MIN_VALUE, parser.getLongValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberDouble() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(123.456);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.456, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testWriteNumberDoubleZero() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(0.0);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.0, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberFloat() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(123.456f);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.456f, parser.getFloatValue(), 1e-5);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigDecimal() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        BigDecimal bd = new BigDecimal("12345.67890123456789");
        buffer.writeNumber(bd);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(bd, parser.getDecimalValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigInteger() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        BigInteger bi = new BigInteger("123456789012345678901234567890");
        buffer.writeNumber(bi);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(bi, parser.getBigIntegerValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBooleanTrue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeBoolean(true);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBooleanFalse() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeBoolean(false);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNull();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteEmbeddedObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        Object obj = new Object();
        buffer.writeObject(obj);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals(obj, parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStringNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString((String) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber((BigDecimal) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber((BigInteger) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testMultipleTokensInSequence() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("a");
        buffer.writeNumber(1);
        buffer.writeFieldName("b");
        buffer.writeString("two");
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("two", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testAppendBuffer() throws Exception {
        TokenBuffer buffer1 = new TokenBuffer(null, false);
        buffer1.writeStartArray();
        buffer1.writeNumber(1);
        buffer1.writeEndArray();

        TokenBuffer buffer2 = new TokenBuffer(null, false);
        buffer2.writeStartObject();
        buffer2.writeFieldName("test");
        buffer2.writeBoolean(true);
        buffer2.writeEndObject();

        buffer1.append(buffer2);

        JsonParser parser = buffer1.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("test", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testToStringEmpty() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertEquals("[TokenBuffer: ]", buffer.toString());
    }

    
    @Test
    public void testFirstTokenNullForEmptyBuffer() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertNull(buffer.firstToken());
    }

    
    @Test
    public void testCloseDoesNotAffectParsing() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("data");
        buffer.close();
        assertTrue(buffer.isClosed());
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("data", parser.getText());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testWriteRawUTF8StringUnsupported() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        try {
            buffer.writeRawUTF8String(new byte[]{1, 2, 3}, 0, 3);
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        } catch (IOException e) {
            fail("Expected UnsupportedOperationException, but got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testWriteUTF8StringUnsupported() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        try {
            buffer.writeUTF8String(new byte[]{1, 2, 3}, 0, 3);
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        } catch (IOException e) {
            fail("Expected UnsupportedOperationException, but got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testWriteRawStringUnsupported() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        try {
            buffer.writeRaw("raw string");
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        } catch (IOException e) {
            fail("Expected UnsupportedOperationException, but got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testWriteRawValueStringUnsupported() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        try {
            buffer.writeRawValue("raw value string");
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        } catch (IOException e) {
            fail("Expected UnsupportedOperationException, but got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testWriteBinaryUnsupported() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        try {
            buffer.writeBinary(null, new byte[]{1}, 0, 1);
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        } catch (IOException e) {
            fail("Expected UnsupportedOperationException, but got IOException: " + e.getMessage());
        }
    }


    @Test
    public void testWriteTreeNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeTree(null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    // New tests for uncalled methods
    @Test
    public void testVersion() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertNotNull(buffer.version());
    }

    
    @Test
    public void testEnableDisableFeature() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        buffer.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        buffer.enable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
    }

    
    @Test
    public void testSetFeatureMask() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        int mask = JsonGenerator.Feature.collectDefaults() | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        buffer.setFeatureMask(mask);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testUseDefaultPrettyPrinter() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        // No-op, but should not throw exception
        assertNotNull(buffer.useDefaultPrettyPrinter());
    }



    @Test
    public void testGetOutputContext() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertNotNull(buffer.getOutputContext());
        assertTrue(buffer.getOutputContext() instanceof JsonWriteContext);
    }
    
    @Test
    public void testCanWriteBinaryNatively() {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertTrue(buffer.canWriteBinaryNatively());
    }

    @Test
    public void testFlush() throws IOException {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.flush(); // No-op
    }

    @Test
    public void testCanWriteTypeId() {
        TokenBuffer buffer = new TokenBuffer(null, true); // hasNativeIds = true
        assertTrue(buffer.canWriteTypeId());
        TokenBuffer buffer2 = new TokenBuffer(null, false); // hasNativeIds = false
        assertFalse(buffer2.canWriteTypeId());
    }

    @Test
    public void testCanWriteObjectId() {
        TokenBuffer buffer = new TokenBuffer(null, true); // hasNativeIds = true
        assertTrue(buffer.canWriteObjectId());
        TokenBuffer buffer2 = new TokenBuffer(null, false); // hasNativeIds = false
        assertFalse(buffer2.canWriteObjectId());
    }

    @Test
    public void testWriteTypeIdAndObjectId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true);
        buffer.writeStartObject();
        buffer.writeTypeId("type1");
        buffer.writeObjectId("id1");
        buffer.writeFieldName("field");
        buffer.writeNumber(1);
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        // The typeId and objectId are associated with the *next* token, not START_OBJECT
        // To test them, we need to read the token they are associated with.
        // In this case, it's the FIELD_NAME token.
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // Move to FIELD_NAME
        assertEquals("type1", parser.getTypeId());
        assertEquals("id1", parser.getObjectId());
        assertEquals("field", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testCopyCurrentEvent() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeEndArray();

        TokenBuffer targetBuffer = new TokenBuffer(null, false);
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_ARRAY
        targetBuffer.copyCurrentEvent(parser);
        parser.nextToken(); // VALUE_NUMBER_INT
        targetBuffer.copyCurrentEvent(parser);
        parser.nextToken(); // END_ARRAY
        targetBuffer.copyCurrentEvent(parser);

        JsonParser targetParser = targetBuffer.asParser();
        assertEquals(JsonToken.START_ARRAY, targetParser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, targetParser.nextToken());
        assertEquals(1, targetParser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, targetParser.nextToken());
        assertNull(targetParser.nextToken());
    }

    @Test
    public void testCopyCurrentStructure() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("nested");
        buffer.writeStartArray();
        buffer.writeNumber(10);
        buffer.writeEndArray();
        buffer.writeEndObject();

        TokenBuffer targetBuffer = new TokenBuffer(null, false);
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        targetBuffer.copyCurrentStructure(parser);

        JsonParser targetParser = targetBuffer.asParser();
        assertEquals(JsonToken.START_OBJECT, targetParser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, targetParser.nextToken());
        assertEquals("nested", targetParser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, targetParser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, targetParser.nextToken());
        assertEquals(10, targetParser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, targetParser.nextToken());
        assertEquals(JsonToken.END_OBJECT, targetParser.nextToken());
        assertNull(targetParser.nextToken());
    }
    

    @Test
    public void testGetTokenLocation() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartArray();
        JsonParser parser = buffer.asParser();
        // TokenBuffer.Parser.getTokenLocation() returns JsonLocation.NA if _location is null
        // and _location is null by default.
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
        assertTrue(loc == JsonLocation.NA);
    }

    @Test
    public void testGetCurrentLocation() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartArray();
        JsonParser parser = buffer.asParser();
        // TokenBuffer.Parser.getCurrentLocation() returns JsonLocation.NA if _location is null
        // and _location is null by default.
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
        assertTrue(loc == JsonLocation.NA);
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        // The overrideCurrentName method is intended to be called on a Parser instance
        // after a FIELD_NAME token has been consumed, to correct the name.
        // The method in ParserMinimalBase has a check for this, but TokenBuffer.Parser overrides it.
        // Let's simulate the context where it would be used.
        buffer.writeFieldName("originalName");
        parser.nextToken(); // FIELD_NAME
        parser.overrideCurrentName("newName"); // This should work on the FIELD_NAME token.
        assertEquals("newName", parser.getCurrentName());
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("someText");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        // The getTextCharacters() in TokenBuffer.Parser is implemented to return null
        // if hasTextCharacters() is false, which it always is.
        // Therefore, the assertion should be for null.
        assertNull(chars); 
    }

    @Test
    public void testGetTextLength() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("someText");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        // getTextLength() in TokenBuffer.Parser returns 0 if getTextCharacters() is null.
        // Since getTextCharacters() is null, getTextLength() should be 0.
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("someText");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        // getTextOffset() in TokenBuffer.Parser is implemented to return 0 if hasTextCharacters() is false.
        assertEquals(0, parser.getTextOffset()); 
    }

    @Test
    public void testHasTextCharacters() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("someText");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        // hasTextCharacters() in TokenBuffer.Parser is always false.
        assertFalse(parser.hasTextCharacters()); 
    }

    @Test
    public void testGetBinaryValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        byte[] data = {1, 2, 3};
        buffer.writeObject(data); // writeObject handles byte[] as embedded object
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        byte[] result = parser.getBinaryValue(null); // Base64Variant not needed for embedded object
        assertArrayEquals(data, result);
    }

    @Test
    public void testReadBinaryValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        byte[] data = {1, 2, 3};
        buffer.writeObject(data);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int bytesWritten = parser.readBinaryValue(null, baos);
        assertEquals(data.length, bytesWritten);
        assertArrayEquals(data, baos.toByteArray());
    }

    @Test
    public void testGetTypeId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true); // hasNativeIds = true
        buffer.writeStartObject();
        buffer.writeTypeId("type1"); // writeTypeId applies to the *next* token.
        buffer.writeFieldName("field"); // This is the token that will have typeId
        buffer.writeNumber(1);
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("type1", parser.getTypeId());
    }

    @Test
    public void testGetObjectId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true); // hasNativeIds = true
        buffer.writeStartObject();
        buffer.writeObjectId("id1"); // writeObjectId applies to the *next* token.
        buffer.writeFieldName("field"); // This is the token that will have objectId
        buffer.writeNumber(1);
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("id1", parser.getObjectId());
    }


    // Helper mock for ObjectCodec
}
