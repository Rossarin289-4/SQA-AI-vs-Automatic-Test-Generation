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
import com.fasterxml.jackson.core.util.TextNode; // Added import for TextNode
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser; // Added import for UTF8StreamJsonParser
import com.fasterxml.jackson.core.json.UTF8JsonGenerator; // Added import for UTF8JsonGenerator

public class TokenBufferTest {
    @Test
    public void testWriteStartArrayAndEndArray() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeStartArray();
        buffer.writeEndArray();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStartObjectAndEndObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeStartObject();
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteFieldName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
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
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStringSerializable() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        SerializableString s = new TextNode("hello"); // Use imported TextNode
        buffer.writeString(s);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStringNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeString((String) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberShort() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeNumber((short) 123);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals((short) 123, parser.getNumberValue().shortValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberInt() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeNumber(12345);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(12345, parser.getIntValue());
        assertEquals(12345, parser.getNumberValue().intValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberLong() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeNumber(1234567890123L);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1234567890123L, parser.getLongValue());
        assertEquals(1234567890123L, parser.getNumberValue().longValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberDouble() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeNumber(123.456);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.456, parser.getDoubleValue(), 1e-9);
        assertEquals(123.456, parser.getNumberValue().doubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberFloat() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeNumber(123.456f);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.456f, parser.getFloatValue(), 1e-9);
        assertEquals(123.456f, parser.getNumberValue().floatValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigDecimal() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
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
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
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
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeNumber("123.45");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("123.45", parser.getText());
        assertEquals(123.45, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBooleanTrue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeBoolean(true);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBooleanFalse() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeBoolean(false);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeNull();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        Object value = new Object();
        buffer.writeObject(value);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertSame(value, parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBinary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        byte[] data = {1, 2, 3};
        buffer.writeBinary(null, data, 0, 3);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(data, (byte[]) parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testAppend() throws Exception {
        TokenBuffer buffer1 = new TokenBuffer(null, false); // Specify constructor
        buffer1.writeStartObject();
        buffer1.writeFieldName("a");
        buffer1.writeNumber(1);
        buffer1.writeEndObject();

        TokenBuffer buffer2 = new TokenBuffer(null, false); // Specify constructor
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
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
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
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.forceUseOfBigDecimal(true);
        buffer.writeNumber(123.456);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(BigDecimal.class, parser.getNumberValue().getClass());
    }

    @Test
    public void testForceUseOfBigDecimalFalse() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.forceUseOfBigDecimal(false);
        buffer.writeNumber(123.456);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(Double.class, parser.getNumberValue().getClass());
    }

    @Test
    public void testWriteRawValueString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeRawValue("raw string");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        RawValue rv = (RawValue) parser.getEmbeddedObject();
        assertEquals("raw string", rv.rawValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteRawValueCharArray() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeRawValue(new char[]{'r', 'a', 'w'}, 0, 3);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals("raw", parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testCopyCurrentEvent() throws Exception {
        TokenBuffer sourceBuffer = new TokenBuffer(null, false); // Specify constructor
        sourceBuffer.writeStartArray();
        sourceBuffer.writeNumber(1);

        TokenBuffer targetBuffer = new TokenBuffer(null, false); // Specify constructor
        // Need to advance the parser to the token to copy
        JsonParser sourceParser = sourceBuffer.asParser();
        sourceParser.nextToken(); // START_ARRAY
        targetBuffer.copyCurrentEvent(sourceParser); // copies START_ARRAY

        sourceParser.nextToken(); // VALUE_NUMBER_INT
        targetBuffer.copyCurrentEvent(sourceParser); // copies VALUE_NUMBER_INT

        JsonParser parser = targetBuffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testCopyCurrentStructure() throws Exception {
        TokenBuffer sourceBuffer = new TokenBuffer(null, false); // Specify constructor
        sourceBuffer.writeStartObject();
        sourceBuffer.writeFieldName("field");
        sourceBuffer.writeNumber(10);
        sourceBuffer.writeEndObject();

        TokenBuffer targetBuffer = new TokenBuffer(null, false); // Specify constructor
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
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        assertFalse(buffer.isClosed());
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testFlush() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.flush(); // Should be a no-op
        assertFalse(buffer.isClosed());
    }

    @Test
    public void testSetCodec() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        ObjectCodec codec = mockObjectCodec();
        buffer.setCodec(codec);
        assertSame(codec, buffer.getCodec());
    }

    @Test
    public void testGetOutputContext() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        JsonWriteContext context = buffer.getOutputContext();
        assertNotNull(context);
        // Initial context should be root
        assertEquals(JsonStreamContext.TYPE_ROOT, context.inRoot());
    }

    @Test
    public void testCanWriteBinaryNatively() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        assertTrue(buffer.canWriteBinaryNatively());
    }

    @Test
    public void testEnableAndDisableFeature() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buffer.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testSetFeatureMask() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        int mask = JsonGenerator.Feature.collectDefaults() | JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask();
        buffer.setFeatureMask(mask);
        assertEquals(mask, buffer.getFeatureMask());
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
    }

    @Test
    public void testUseDefaultPrettyPrinter() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.useDefaultPrettyPrinter(); // Should be a no-op
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.PRETTY_PRINT));
    }

    // Helper method to create a mock ObjectCodec (simplified)
    private ObjectCodec mockObjectCodec() {
        return new ObjectCodec() {
            @Override public Version version() { return null; }
            @Override public void close() throws IOException {}
            @Override public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override public Object readTree(JsonParser p) throws IOException { return null; }
            @Override public void writeValue(JsonGenerator g, Object value) throws IOException {}
            @Override public void writeTree(JsonGenerator g, TreeNode rootNode) throws IOException {}
        };
    }

    @Test
    public void testFirstTokenEmpty() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        assertNull(buffer.firstToken());
    }

    @Test
    public void testFirstTokenAfterWrite() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeStartArray();
        assertEquals(JsonToken.START_ARRAY, buffer.firstToken());
    }

    @Test
    public void testAsParserWithCodec() throws Exception {
        ObjectCodec codec = mockObjectCodec();
        TokenBuffer buffer = new TokenBuffer(codec, false); // Specify constructor
        JsonParser parser = buffer.asParser();
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testAsParserWithJsonParser() throws Exception {
        // Create a dummy JsonParser to pass
        // This requires a concrete implementation of JsonParser, e.g., from Jackson Core
        // For testing purposes, we can use a minimal implementation or a known one.
        // Assuming com.fasterxml.jackson.core.JsonParser is available.
        JsonParser dummyParser = new UTF8StreamJsonParser(
            null, 0, null, null, JsonParser.Feature.collectDefaults(), null, null, false, null, null, null, 0, 0, null, null
        );
        TokenBuffer buffer = new TokenBuffer(dummyParser); // Constructor taking JsonParser
        JsonParser parser = buffer.asParser(dummyParser);
        assertNotNull(parser);
    }

    // New tests for uncalled methods

    @Test
    public void testSerialize() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeEndArray();

        // Use a ByteArrayOutputStream to capture the JSON output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JsonGenerator generator = new UTF8JsonGenerator(null, null, null, baos); // Use imported UTF8JsonGenerator

        buffer.serialize(generator);
        generator.close(); // Ensure everything is flushed

        String output = baos.toString("UTF-8");
        assertEquals("[1]", output);
    }

    @Test
    public void testDeserializeWithFieldName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        // Simulate a parser that starts with a FIELD_NAME
        // This requires constructing a parser with specific state.
        // A simpler approach is to use a TokenBuffer to create a parser with this state.
        TokenBuffer inputParserSource = new TokenBuffer(null, false); // Specify constructor
        inputParserSource.writeStartObject();
        inputParserSource.writeFieldName("a");
        inputParserSource.writeNumber(1);
        JsonParser parser = inputParserSource.asParser();
        parser.nextToken(); // Advance to START_OBJECT
        parser.nextToken(); // Advance to FIELD_NAME "a"

        TokenBuffer targetBuffer = new TokenBuffer(null, false); // Specify constructor
        DeserializationContext ctxt = mockDeserializationContext();
        targetBuffer.deserialize(parser, ctxt);

        JsonParser resultParser = targetBuffer.asParser();
        assertEquals(JsonToken.START_OBJECT, resultParser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, resultParser.nextToken());
        assertEquals("a", resultParser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, resultParser.nextToken());
        assertEquals(1, resultParser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, resultParser.nextToken());
        assertNull(resultParser.nextToken());
    }

    @Test
    public void testWriteRawUTF8String() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        try {
            buffer.writeRawUTF8String(new byte[]{1, 2, 3}, 0, 3);
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteUTF8String() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        try {
            buffer.writeUTF8String(new byte[]{1, 2, 3}, 0, 3);
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        try {
            buffer.writeRaw("some raw string");
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawValueStringWithOffsetAndLength() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeRawValue("prefix_raw string_suffix", 7, 11); // "raw string"
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals("raw string", parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBinaryWithBase64VariantAndInputStream() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
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

        // Need a way to construct with native IDs enabled.
        // The constructors are:
        // TokenBuffer(ObjectCodec codec) -> false
        // TokenBuffer(ObjectCodec codec, boolean hasNativeIds) -> true
        // TokenBuffer(JsonParser p) -> depends on parser
        // TokenBuffer(JsonParser p, DeserializationContext ctxt) -> depends on parser and ctxt
        
        // Let's use the constructor with hasNativeIds
        TokenBuffer bufferWithIds = new TokenBuffer(null, true);
        assertTrue(bufferWithIds.canWriteTypeId());
        assertTrue(bufferWithIds.canWriteObjectId()); // both are enabled together in this constructor
    }

    @Test
    public void testWriteTypeIdAndObjectId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true); // Enable native IDs
        buffer.writeTypeId("type1");
        buffer.writeObjectId("obj1");
        buffer.writeStartObject(); // The ID should be associated with this token

        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        assertEquals("type1", parser.getTypeId());
        assertEquals("obj1", parser.getObjectId());
    }

    @Test
    public void testSetLocation() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        JsonLocation loc = new JsonLocation("source", 10, 5, 20, 30);
        // The constructor TokenBuffer(JsonParser p) is not used for the buffer itself.
        // We create the parser using asParser() and set its location.
        JsonParser parser = buffer.asParser();
        parser.setLocation(loc);
        assertEquals(loc, parser.getCurrentLocation());
    }
    
    @Test
    public void testNextTokenBasic() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
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
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeStartObject();
        buffer.writeFieldName("myField");
        buffer.writeNull();
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("myField", parser.getCurrentName());
        parser.nextToken(); // VALUE_NULL
        // After a value token, getCurrentName() should return null until the next FIELD_NAME
        assertNull(parser.getCurrentName()); 
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeStartObject();
        buffer.writeFieldName("originalName");
        buffer.writeNull();
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "originalName"

        // Override the name
        parser.overrideCurrentName("newFieldName");
        assertEquals("newFieldName", parser.getCurrentName());

        // Now verify that the overridden name is captured by the buffer's parser
        // This requires re-parsing from the start or a separate parser.
        // The override applies to the parser *currently being used*, not to the buffer's internal state for future parses.
        // To test this correctly, we'd need to write the overridden name to the buffer.
        // The current implementation of overrideCurrentName in Parser does not seem to affect the TokenBuffer's content.
        // Let's test the direct effect on the parser.
        JsonParser tempParser = buffer.asParser();
        tempParser.nextToken(); // START_OBJECT
        tempParser.nextToken(); // FIELD_NAME "originalName"
        tempParser.overrideCurrentName("newFieldName"); // This should change what getCurrentName() returns *for this parser instance*
        assertEquals("newFieldName", tempParser.getCurrentName());
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_STRING
        char[] textChars = parser.getTextCharacters();
        assertNotNull(textChars);
        // getText() returns a String, convert it to char array for comparison
        assertArrayEquals("test text".toCharArray(), textChars);
    }

    @Test
    public void testGetTextLength() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_STRING
        assertEquals(9, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_STRING
        assertEquals(0, parser.getTextOffset()); // TokenBuffer's parser always returns 0
    }

    @Test
    public void testHasTextCharacters() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_STRING
        assertFalse(parser.hasTextCharacters()); // TokenBuffer's parser does not have text characters directly
    }

    @Test
    public void testGetBigIntegerValueBoundary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger minInt = BigInteger.valueOf(Integer.MIN_VALUE);

        buffer.writeNumber(maxInt);
        buffer.writeNumber(minInt);

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(BigInteger.valueOf(Integer.MAX_VALUE), parser.getBigIntegerValue());
        parser.nextToken();
        assertEquals(BigInteger.valueOf(Integer.MIN_VALUE), parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValueBoundary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
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
        TokenBuffer buffer = new TokenBuffer(null, false); // Specify constructor
        buffer.writeNumber(Double.MAX_VALUE);
        buffer.writeNumber(Double.MIN_VALUE);

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(Double.MAX_VALUE, parser.getDoubleValue(), 1e-9);
        parser.nextToken();
        assertEquals(Double.MIN_VALUE, parser.getDoubleValue(), 1e-9);
    }

    // Helper method to create a mock DeserializationContext
    private DeserializationContext mockDeserializationContext() {
        // Need to instantiate an abstract class. Since DeserializationContext is abstract,
        // we must provide implementations for all abstract methods.
        // Many of these methods are not relevant for this test.
        return new DeserializationContext(null, null, null) {
            @Override
            public boolean isEnabled(DeserializationFeature f) {
                return false; // Default to false for simplicity
            }

            @Override
            public <T> T findInjectableValue(Object key, BeanProperty forProperty, DatabindContext ctxt, Object valueToDefaults) {
                return null;
            }

            @Override
            public BeanProperty findProperty(com.fasterxml.jackson.databind.introspect.AnnotatedMember property) {
                return null;
            }

            @Override
            public TreeNode readTree(JsonParser p) throws IOException {
                return null;
            }

            @Override
            public JavaType constructType(java.lang.reflect.Type ref) {
                return null;
            }

            // Methods that must be implemented but are not directly tested here.
            // Providing minimal implementations.

            @Override
            protected com.fasterxml.jackson.databind.cfg.MapperConfig<?> getConfig() {
                // Mock a minimal config if needed, or return null if it's acceptable
                return null;
            }

            @Override
            public JsonMappingException mappingException(String message) {
                return new JsonMappingException(null, message);
            }

            @Override
            public JsonMappingException mappingException(java.lang.reflect.Type expectedType, String message) {
                return new JsonMappingException(null, message);
            }

            @Override
            public JsonMappingException mappingException(java.lang.reflect.Type expectedType, JsonToken found) {
                return new JsonMappingException(null, "Unexpected token: " + found);
            }
             @Override
            public Date parseDate(String dateStr) throws IllegalArgumentException {
                // Mock implementation or throw if not expected to be called
                return null;
            }
        };
    }
}
