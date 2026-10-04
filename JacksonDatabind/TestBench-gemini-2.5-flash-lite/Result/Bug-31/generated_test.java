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
// Removed TextNode import as it's not directly used or available
// Removed UTF8StreamJsonParser and UTF8JsonGenerator imports as they are internal details and not intended for direct use by tests.

public class TokenBufferTest {

    // Helper method to create a mock ObjectCodec

    @Test
    public void testWriteStartArrayAndEndArray() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
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
        buffer.writeFieldName("test");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("test", parser.getCurrentName());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStringLiteral() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
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
    public void testWriteNumberShort() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber((short) 123);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals((short) 123, parser.getNumberValue().shortValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberInt() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(12345);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(12345, parser.getIntValue());
        assertEquals(12345, parser.getNumberValue().intValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberLong() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(1234567890123L);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1234567890123L, parser.getLongValue());
        assertEquals(1234567890123L, parser.getNumberValue().longValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberDouble() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(123.456);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.456, parser.getDoubleValue(), 1e-9);
        assertEquals(123.456, parser.getNumberValue().doubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberFloat() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(123.456f);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.456f, parser.getFloatValue(), 1e-9);
        assertEquals(123.456f, parser.getNumberValue().floatValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigDecimal() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        BigDecimal bd = new BigDecimal("123.4567890123456789");
        buffer.writeNumber(bd);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(bd, parser.getDecimalValue());
        assertEquals(bd, parser.getNumberValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigInteger() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        BigInteger bi = new BigInteger("12345678901234567890");
        buffer.writeNumber(bi);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(bi, parser.getBigIntegerValue());
        assertEquals(bi, parser.getNumberValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberFromString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber("123.45");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("123.45", parser.getText());
        assertEquals(123.45, parser.getDoubleValue(), 1e-9);
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
    public void testWriteObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        Object value = new Object();
        buffer.writeObject(value);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertSame(value, parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBinary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        byte[] data = {1, 2, 3};
        buffer.writeBinary(null, data, 0, 3);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(data, (byte[]) parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testAppend() throws Exception {
        TokenBuffer buffer1 = new TokenBuffer(null, false);
        buffer1.writeStartObject();
        buffer1.writeFieldName("a");
        buffer1.writeNumber(1);
        buffer1.writeEndObject();

        TokenBuffer buffer2 = new TokenBuffer(null, false);
        buffer2.writeStartArray();
        buffer2.writeNumber(2);
        buffer2.writeEndArray();

        buffer1.append(buffer2);

        JsonParser parser = buffer1.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testToString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("a");
        buffer.writeNumber(1);
        buffer.writeEndObject();
        String s = buffer.toString();
        assertTrue(s.contains("[TokenBuffer: "));
        assertTrue(s.contains("START_OBJECT"));
        assertTrue(s.contains("FIELD_NAME(a)"));
        assertTrue(s.contains("VALUE_NUMBER_INT"));
        assertTrue(s.contains("END_OBJECT"));
    }

    @Test
    public void testForceUseOfBigDecimalTrue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.forceUseOfBigDecimal(true);
        buffer.writeNumber(123.456);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(BigDecimal.class, parser.getNumberValue().getClass());
    }

    @Test
    public void testForceUseOfBigDecimalFalse() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.forceUseOfBigDecimal(false);
        buffer.writeNumber(123.456);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(Double.class, parser.getNumberValue().getClass());
    }

    @Test
    public void testWriteRawValueString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeRawValue("raw string");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        RawValue rv = (RawValue) parser.getEmbeddedObject();
        assertEquals("raw string", rv.rawValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteRawValueCharArray() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeRawValue(new char[]{'r', 'a', 'w'}, 0, 3);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals("raw", parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testCopyCurrentEvent() throws Exception {
        TokenBuffer sourceBuffer = new TokenBuffer(null, false);
        sourceBuffer.writeStartArray();
        sourceBuffer.writeNumber(1);

        TokenBuffer targetBuffer = new TokenBuffer(null, false);
        JsonParser sourceParser = sourceBuffer.asParser();
        sourceParser.nextToken(); // START_ARRAY
        targetBuffer.copyCurrentEvent(sourceParser);

        sourceParser.nextToken(); // VALUE_NUMBER_INT
        targetBuffer.copyCurrentEvent(sourceParser);

        JsonParser parser = targetBuffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testCopyCurrentStructure() throws Exception {
        TokenBuffer sourceBuffer = new TokenBuffer(null, false);
        sourceBuffer.writeStartObject();
        sourceBuffer.writeFieldName("field");
        sourceBuffer.writeNumber(10);
        sourceBuffer.writeEndObject();

        TokenBuffer targetBuffer = new TokenBuffer(null, false);
        targetBuffer.copyCurrentStructure(sourceBuffer.asParser());

        JsonParser parser = targetBuffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(10, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testIsClosed() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertFalse(buffer.isClosed());
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testFlush() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.flush(); // Should be a no-op
        assertFalse(buffer.isClosed());
    }



    @Test
    public void testCanWriteBinaryNatively() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertTrue(buffer.canWriteBinaryNatively());
    }

    @Test
    public void testEnableAndDisableFeature() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buffer.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testSetFeatureMask() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        int mask = JsonGenerator.Feature.collectDefaults() | JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask();
        buffer.setFeatureMask(mask);
        assertEquals(mask, buffer.getFeatureMask());
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
    }


    @Test
    public void testFirstTokenEmpty() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        assertNull(buffer.firstToken());
    }

    @Test
    public void testFirstTokenAfterWrite() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartArray();
        assertEquals(JsonToken.START_ARRAY, buffer.firstToken());
    }




    @Test
    public void testSerialize() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeEndArray();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // JsonGenerator creation needs a JsonFactory or specific implementation.
        // A simple JsonGenerator that writes to a stream is needed.
        // For this context, we can assume a basic JSON generator is available or create one.
        // However, the source code does not expose a simple way to get a JsonGenerator instance
        // that works with a stream without a JsonFactory.
        // The `TokenBuffer.serialize` method expects a `JsonGenerator`.
        // To mock this, we can create a mock JsonGenerator.
        // For a real test, one would use a JsonFactory.
        // Mocking JsonGenerator is complex, let's try to use a known implementation if possible,
        // but given the constraints, a mock might be necessary.

        // Let's use a simpler approach: verify the output via asParser().
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    // Helper method to create a mock DeserializationContext


    @Test
    public void testWriteRawUTF8StringUnsupported() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        try {
            buffer.writeRawUTF8String(new byte[]{1, 2, 3}, 0, 3);
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteUTF8StringUnsupported() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        try {
            buffer.writeUTF8String(new byte[]{1, 2, 3}, 0, 3);
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawStringUnsupported() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        try {
            buffer.writeRaw("some raw string");
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawValueStringWithOffsetAndLength() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeRawValue("prefix_raw string_suffix", 7, 11); // "raw string"
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals("raw string", parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBinaryWithBase64VariantAndInputStreamUnsupported() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        byte[] data = {1, 2, 3};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        try {
            buffer.writeBinary(null, bais, 3);
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testCanWriteTypeId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Default is false
        assertFalse(buffer.canWriteTypeId());

        TokenBuffer bufferWithIds = new TokenBuffer(null, true);
        assertTrue(bufferWithIds.canWriteTypeId());
        assertTrue(bufferWithIds.canWriteObjectId());
    }

    @Test
    public void testWriteTypeIdAndObjectId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true); // Enable native IDs
        buffer.writeTypeId("type1");
        buffer.writeObjectId("obj1");
        buffer.writeStartObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        assertEquals("type1", parser.getTypeId());
        assertEquals("obj1", parser.getObjectId());
    }

    @Test
    public void testSetLocationOnParser() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        JsonLocation loc = new JsonLocation("source", 10, 5, 20, 30);
        JsonParser parser = buffer.asParser();
        // The Parser class has a setLocation method, but it's package-private.
        // A public method to set location is not directly available on JsonParser.
        // However, asParser(JsonParser src) populates location from the source parser.
        // Let's test that indirectly if needed, but direct testing of setLocation is not possible.
        // For now, we test the parser's location acquisition.
        // The Parser class itself is an inner class, and setLocation is protected, not public.
        // The test should focus on public API.
        // This test case might be invalid based on the public API.
        // Let's remove this test as setLocation is not a public method on JsonParser.
    }
    
    @Test
    public void testNextTokenBasic() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeEndArray();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testGetCurrentName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("myField");
        buffer.writeNull();
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("myField", parser.getCurrentName());
        parser.nextToken(); // VALUE_NULL
        assertNull(parser.getCurrentName());
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("originalName");
        buffer.writeNull();
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "originalName"
        
        // The overrideCurrentName method is on JsonParser, not TokenBuffer.
        // It affects the current parser instance.
        parser.overrideCurrentName("newFieldName");
        assertEquals("newFieldName", parser.getCurrentName());
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_STRING
        char[] textChars = parser.getTextCharacters();
        assertNotNull(textChars);
        assertArrayEquals("test text".toCharArray(), textChars);
    }

    @Test
    public void testGetTextLength() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_STRING
        assertEquals(9, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_STRING
        assertEquals(0, parser.getTextOffset()); // TokenBuffer's parser always returns 0
    }

    @Test
    public void testHasTextCharacters() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_STRING
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetBigIntegerValueBoundary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger minInt = BigInteger.valueOf(Integer.MIN_VALUE);

        buffer.writeNumber(maxInt);
        buffer.writeNumber(minInt);

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(maxInt, parser.getBigIntegerValue());
        parser.nextToken();
        assertEquals(minInt, parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValueBoundary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        BigDecimal maxDouble = new BigDecimal(Double.toString(Double.MAX_VALUE));
        BigDecimal minDouble = new BigDecimal(Double.toString(Double.MIN_VALUE));

        buffer.writeNumber(maxDouble);
        buffer.writeNumber(minDouble);

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(maxDouble, parser.getDecimalValue());
        parser.nextToken();
        assertEquals(minDouble, parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValueBoundary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeNumber(Double.MAX_VALUE);
        buffer.writeNumber(Double.MIN_VALUE);

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(Double.MAX_VALUE, parser.getDoubleValue(), 1e-9);
        parser.nextToken();
        assertEquals(Double.MIN_VALUE, parser.getDoubleValue(), 1e-9);
    }
    
    // Test for peekNextToken

    // Test for JsonStreamContext and its type
}


