```java
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
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.Base64Variants;


public class TokenBufferTest {

    @Test
    public void testConstructorWithCodec() throws Exception {
        ObjectCodec codec = null; // Or mock one if necessary
        TokenBuffer buffer = new TokenBuffer(codec);
        assertNotNull(buffer);
        assertNull(buffer.getCodec());
        assertTrue(buffer.firstToken() == null);
        assertTrue(buffer.getOutputContext().inRoot());
    }

    @Test
    public void testConstructorWithCodecAndNativeIds() throws Exception {
        ObjectCodec codec = null;
        TokenBuffer buffer = new TokenBuffer(codec, true);
        assertNotNull(buffer);
        assertTrue(buffer.canWriteTypeId());
        assertTrue(buffer.canWriteObjectId());
    }

    @Test
    public void testConstructorWithJsonParser() throws Exception {
        // To construct a TokenBuffer.Parser, we need a Segment.
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        segment.append(0, JsonToken.VALUE_STRING, "dummy");
        // TokenBuffer.Parser has a deprecated constructor that takes Segment and ObjectCodec
        TokenBuffer buffer = new TokenBuffer(segment, null); // Use the deprecated constructor for now
        assertNotNull(buffer);
    }

    @Test
    public void testVersion() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertNotNull(buffer.version());
    }

    @Test
    public void testAsParser() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeEndArray();
        JsonParser parser = buffer.asParser();
        assertNotNull(parser);
        assertTrue(parser.nextToken() == JsonToken.START_ARRAY);
        assertTrue(parser.nextToken() == JsonToken.VALUE_NUMBER_INT);
        assertEquals(1, parser.getIntValue());
        assertTrue(parser.nextToken() == JsonToken.END_ARRAY);
        assertTrue(parser.nextToken() == null);
    }

    @Test
    public void testAsParserWithCodec() throws Exception {
        ObjectCodec codec = null; // Mock codec
        TokenBuffer buffer = new TokenBuffer(codec);
        JsonParser parser = buffer.asParser(codec);
        assertNotNull(parser);
    }

    @Test
    public void testAsParserWithSourceParser() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        // To construct a TokenBuffer.Parser, we need a Segment.
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        segment.append(0, JsonToken.VALUE_STRING, "dummy");
        JsonParser sourceParser = new TokenBuffer.Parser(segment, null, false, false);
        JsonParser parser = buffer.asParser(sourceParser);
        assertNotNull(parser);
    }

    @Test
    public void testFirstTokenWhenEmpty() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertNull(buffer.firstToken());
    }

    @Test
    public void testFirstTokenAfterWriting() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartObject();
        assertEquals(JsonToken.START_OBJECT, buffer.firstToken());
    }

    @Test
    public void testAppendEmptyBuffer() throws Exception {
        TokenBuffer buffer1 = new TokenBuffer(null);
        TokenBuffer buffer2 = new TokenBuffer(null);
        buffer1.append(buffer2);
        assertNull(buffer1.firstToken());
    }

    @Test
    public void testAppendNonEmptyBuffer() throws Exception {
        TokenBuffer buffer1 = new TokenBuffer(null);
        buffer1.writeNumber(1);
        TokenBuffer buffer2 = new TokenBuffer(null);
        buffer2.writeString("hello");
        buffer1.append(buffer2);

        JsonParser parser = buffer1.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSerializeEmptyBuffer() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        StringWriter sw = new StringWriter();
        // The UTF8JsonGenerator constructor needs specific arguments.
        // Using a mock or simpler generator if available is better.
        // For now, let's try to construct it with minimal valid arguments.
        // IOContext is needed for UTF8JsonGenerator.
        IOContext ioContext = new IOContext(new BufferRecycler(), "", false);
        ObjectCodec codec = null;
        Base64Variant b64Variant = Base64Variants.MIME_NO_LINEFEEDS;
        UTF8JsonGenerator generator = new UTF8JsonGenerator(ioContext, codec, sw, b64Variant);
        buffer.serialize(generator);
        generator.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testDeserializeSimpleValue() throws Exception {
        // The deserialize method is protected and not directly testable via public API.
        // We will test its functionality indirectly through copyCurrentStructure.
        TokenBuffer sourceBuffer = new TokenBuffer(null);
        sourceBuffer.writeNumber(456);

        TokenBuffer targetBuffer = new TokenBuffer(null);
        JsonParser sourceParser = sourceBuffer.asParser();
        sourceParser.nextToken(); // Move to VALUE_NUMBER_INT
        targetBuffer.copyCurrentStructure(sourceParser);

        // Verify the state of targetBuffer
        JsonParser resultParser = targetBuffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, resultParser.nextToken());
        assertEquals(456, resultParser.getIntValue());
        assertNull(resultParser.nextToken());
    }

    @Test
    public void testToStringEmpty() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertEquals("[TokenBuffer: ]", buffer.toString());
    }

    @Test
    public void testToStringWithData() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
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
        assertTrue(s.contains("]"));
    }

    @Test
    public void testEnableDisableFeatures() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)); // Default
        buffer.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        buffer.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testGetFeatureMask() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        int mask = buffer.getFeatureMask();
        assertTrue(mask > 0); // Should have default features enabled
        buffer.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        assertNotEquals(mask, buffer.getFeatureMask());
    }

    @Test
    public void testSetFeatureMask() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        int initialMask = buffer.getFeatureMask();
        buffer.setFeatureMask(0);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        buffer.setFeatureMask(initialMask);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testUseDefaultPrettyPrinter() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        // This method is a no-op for TokenBuffer, so just check it doesn't throw
        TokenBuffer result = (TokenBuffer) buffer.useDefaultPrettyPrinter();
        assertSame(buffer, result);
    }

    @Test
    public void testSetCodec() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        ObjectCodec codec = null; // Mock codec
        TokenBuffer result = (TokenBuffer) buffer.setCodec(codec);
        assertSame(buffer, result);
        assertNull(buffer.getCodec()); // Because we set it to null
    }

    @Test
    public void testGetCodec() throws Exception {
        ObjectCodec codec = null; // Mock codec
        TokenBuffer buffer = new TokenBuffer(codec);
        assertNull(buffer.getCodec());
    }

    @Test
    public void testGetOutputContext() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertNotNull(buffer.getOutputContext());
        assertTrue(buffer.getOutputContext().inRoot());
    }

    @Test
    public void testCanWriteBinaryNatively() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertTrue(buffer.canWriteBinaryNatively());
    }

    @Test
    public void testFlush() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.flush(); // Should be a no-op
    }

    @Test
    public void testClose() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testIsClosed() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertFalse(buffer.isClosed());
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testWriteStartArray() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartArray();
        assertEquals(JsonToken.START_ARRAY, buffer.firstToken());
        assertTrue(buffer.getOutputContext().inArray());
    }

    @Test
    public void testWriteEndArray() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartArray();
        buffer.writeEndArray();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        assertTrue(buffer.getOutputContext().inRoot()); // Parent of array context is root
    }

    @Test
    public void testWriteStartObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartObject();
        assertEquals(JsonToken.START_OBJECT, buffer.firstToken());
        assertTrue(buffer.getOutputContext().inObject());
    }

    @Test
    public void testWriteEndObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartObject();
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        assertTrue(buffer.getOutputContext().inRoot()); // Parent of object context is root
    }

    @Test
    public void testWriteFieldName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartObject();
        buffer.writeFieldName("test");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("test", parser.getCurrentName());
        assertTrue(buffer.getOutputContext().getCurrentName().equals("test"));
    }

    @Test
    public void testWriteString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStringNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeString((String) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStringWithChars() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        char[] data = "world".toCharArray();
        buffer.writeString(data, 0, data.length);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("world", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStringSerializableString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        // Using a concrete implementation of SerializableString
        SerializableString sString = new com.fasterxml.jackson.core.util.BufferRecycler.TextValue(null, "jackson".toCharArray());
        buffer.writeString(sString);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("jackson", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberShort() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber((short) 123);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals((short) 123, parser.getShortValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberInt() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(456);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(456, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberLong() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(789L);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(789L, parser.getLongValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberDouble() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(12.34);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(12.34, parser.getDoubleValue(), 0.0001);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberFloat() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(56.78f);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(56.78f, parser.getFloatValue(), 0.0001f);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigDecimal() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        BigDecimal bd = new BigDecimal("123.456");
        buffer.writeNumber(bd);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(bd, parser.getDecimalValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberBigInteger() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        BigInteger bi = new BigInteger("9876543210");
        buffer.writeNumber(bi);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(bi, parser.getBigIntegerValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNumberString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber("1.23E4");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("1.23E4", parser.getText());
        assertEquals(12300.0, parser.getDoubleValue(), 0.0001);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBooleanTrue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeBoolean(true);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBooleanFalse() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeBoolean(false);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNull();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        Object value = new Object();
        buffer.writeObject(value);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals(value, parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteObjectNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeObject(null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteObjectBinary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        byte[] data = {1, 2, 3};
        buffer.writeObject(data);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(data, (byte[]) parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteTree() throws Exception {
        // This requires a TreeNode implementation, which is not provided.
        // We'll assume a mock TreeNode or skip detailed verification if not feasible.
        TokenBuffer buffer = new TokenBuffer(null);
        TreeNode node = null; // Replace with a mock TreeNode if available
        buffer.writeTree(node);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken()); // Assuming null node writes null
    }

    @Test
    public void testWriteBinary() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        Base64Variant b64Variant = Base64Variants.MIME_NO_LINEFEEDS; // Use a default variant
        byte[] data = {10, 20, 30};
        buffer.writeBinary(b64Variant, data, 0, data.length);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(data, (byte[]) parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteTypeId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true); // Ensure native IDs are supported
        buffer.writeTypeId("type1");
        // This sets internal state, effects are seen when converting to parser or serializing
        assertTrue(buffer.canWriteTypeId());
        // To verify, we need to write a structure that includes it.
        buffer.writeStartObject();
        buffer.writeEndObject(); // Need to complete the structure to see the effect in parser
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        assertEquals("type1", parser.getTypeId());
        parser.nextToken(); // END_OBJECT
    }

    @Test
    public void testWriteObjectId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true); // Ensure native IDs are supported
        buffer.writeObjectId(123);
        assertTrue(buffer.canWriteObjectId());
        buffer.writeStartObject();
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        assertEquals(123, parser.getObjectId());
        parser.nextToken(); // END_OBJECT
    }

    @Test
    public void testCopyCurrentEvent() throws Exception {
        // Create a source TokenBuffer and copy an event from it
        TokenBuffer sourceBuffer = new TokenBuffer(null);
        sourceBuffer.writeNumber(100);
        JsonParser sourceParser = sourceBuffer.asParser();
        sourceParser.nextToken(); // Move to VALUE_NUMBER_INT

        TokenBuffer targetBuffer = new TokenBuffer(null);
        targetBuffer.copyCurrentEvent(sourceParser);

        JsonParser targetParser = targetBuffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, targetParser.nextToken());
        assertEquals(100, targetParser.getIntValue());
        assertNull(targetParser.nextToken());
    }

    @Test
    public void testCopyCurrentStructure() throws Exception {
        // Create a source TokenBuffer with a structure and copy it
        TokenBuffer sourceBuffer = new TokenBuffer(null);
        sourceBuffer.writeStartObject();
        sourceBuffer.writeFieldName("nested");
        sourceBuffer.writeStartArray();
        sourceBuffer.writeNumber(1);
        sourceBuffer.writeEndArray();
        sourceBuffer.writeEndObject();

        JsonParser sourceParser = sourceBuffer.asParser();
        sourceParser.nextToken(); // Move to START_OBJECT

        TokenBuffer targetBuffer = new TokenBuffer(null);
        targetBuffer.copyCurrentStructure(sourceParser);

        JsonParser targetParser = targetBuffer.asParser();
        assertEquals(JsonToken.START_OBJECT, targetParser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, targetParser.nextToken());
        assertEquals("nested", targetParser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, targetParser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, targetParser.nextToken());
        assertEquals(1, targetParser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, targetParser.nextToken());
        assertEquals(JsonToken.END_OBJECT, targetParser.nextToken());
        assertNull(targetParser.nextToken());
    }

    @Test
    public void testSetLocation() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        JsonParser parser = buffer.asParser();
        JsonLocation loc = new JsonLocation("test", 10, 5, 20, 30);
        if (parser instanceof TokenBuffer.Parser) {
            ((TokenBuffer.Parser) parser).setLocation(loc);
            assertEquals(loc, ((TokenBuffer.Parser) parser).getCurrentLocation());
        } else {
            fail("asParser did not return TokenBuffer.Parser");
        }
    }

    @Test
    public void testPeekNextToken() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertNull(buffer.peekNextToken()); // Initially null
        buffer.writeNumber(1);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.peekNextToken());
        parser.nextToken(); // Consume the token
        assertNull(parser.peekNextToken()); // Should be null after consuming
    }

    @Test
    public void testNextToken() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartArray();
        buffer.writeNumber(2);
        buffer.writeEndArray();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testGetParsingContext() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        JsonParser parser = buffer.asParser();
        assertTrue(parser.getParsingContext().inRoot());
        buffer.writeStartObject();
        parser.nextToken(); // Consume START_OBJECT
        assertTrue(parser.getParsingContext().inObject());
        buffer.writeFieldName("a");
        parser.nextToken(); // Consume FIELD_NAME
        assertEquals("a", parser.getCurrentName());
        assertTrue(parser.getParsingContext().getCurrentName().equals("a"));
    }

    @Test
    public void testGetCurrentName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartObject();
        buffer.writeFieldName("name");
        buffer.writeString("value");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("name", parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartObject();
        buffer.writeFieldName("oldName");
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("oldName", parser.getCurrentName());
        parser.overrideCurrentName("newName");
        assertEquals("newName", parser.getCurrentName());
    }

    @Test
    public void testGetText() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeString("test text");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals("test text", parser.getText());

        buffer.writeNumber(123);
        parser = buffer.asParser();
        parser.nextToken();
        assertEquals("123", parser.getText());
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeString("char text");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertArrayEquals("char text".toCharArray(), parser.getTextCharacters());
    }

    @Test
    public void testGetTextLength() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeString("length test");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals("length test".length(), parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeString("offset test");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(0, parser.getTextOffset()); // TokenBuffer's parser always returns 0
    }

    @Test
    public void testHasTextCharacters() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeString("has text");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertFalse(parser.hasTextCharacters()); // TokenBuffer's parser does not use char arrays directly
    }

    @Test
    public void testGetBigIntegerValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(new BigInteger("12345678901234567890"));
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(new BigInteger("12345678901234567890"), parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(new BigDecimal("123.4567890123456789"));
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(new BigDecimal("123.4567890123456789"), parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(1.23456789);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(1.23456789, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testGetFloatValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(9.8765f);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(9.8765f, parser.getFloatValue(), 1e-6f);
    }

    @Test
    public void testGetIntValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(Integer.MAX_VALUE);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(Long.MAX_VALUE);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
    }

    @Test
    public void testGetNumberType() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(100); // int
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());

        buffer.writeNumber(100L); // long
        parser = buffer.asParser();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());

        buffer.writeNumber(100.0); // double
        parser = buffer.asParser();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());

        buffer.writeNumber(new BigDecimal("100.1")); // bigdecimal
        parser = buffer.asParser();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());

        buffer.writeNumber(new BigInteger("1000000000000000000")); // biginteger
        parser = buffer.asParser();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());

        buffer.writeNumber(100.5f); // float
        parser = buffer.asParser();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.FLOAT, parser.getNumberType());
    }

    @Test
    public void testGetNumberValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber(123);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        Number num = parser.getNumberValue();
        assertTrue(num instanceof Integer);
        assertEquals(123, num.intValue());
    }

    @Test
    public void testGetEmbeddedObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        Object obj = new Object();
        buffer.writeObject(obj);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(obj, parser.getEmbeddedObject());
    }

    @Test
    public void testGetBinaryValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        byte[] data = {1, 2, 3, 4};
        buffer.writeBinary(Base64Variants.MIME_NO_LINEFEEDS, data, 0, data.length);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertArrayEquals(data, parser.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS));
    }

    @Test
    public void testReadBinaryValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        byte[] data = {5, 6, 7, 8};
        buffer.writeBinary(Base64Variants.MIME_NO_LINEFEEDS, data, 0, data.length);
        JsonParser parser = buffer.asParser();
        parser.nextToken();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int bytesRead = parser.readBinaryValue(Base64Variants.MIME_NO_LINEFEEDS, baos);
        assertEquals(data.length, bytesRead);
        assertArrayEquals(data, baos.toByteArray());
    }

    @Test
    public void testCanReadObjectId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true); // Native IDs enabled
        assertTrue(buffer.canReadObjectId());
        TokenBuffer buffer2 = new TokenBuffer(null, false); // Native IDs disabled
        assertFalse(buffer2.canReadObjectId());
    }

    @Test
    public void testCanReadTypeId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true); // Native IDs enabled
        assertTrue(buffer.canReadTypeId());
        TokenBuffer buffer2 = new TokenBuffer(null, false); // Native IDs disabled
        assertFalse(buffer2.canReadTypeId());
    }

    @Test
    public void testGetTypeId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true);
        buffer.writeTypeId("testType");
        buffer.writeStartObject();
        buffer.writeEndObject(); 
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        assertEquals("testType", parser.getTypeId());
        parser.nextToken(); // END_OBJECT
    }

    @Test
    public void testGetObjectId() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null, true);
        buffer.writeObjectId(999);
        buffer.writeStartObject();
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        assertEquals(999, parser.getObjectId());
        parser.nextToken(); // END_OBJECT
    }

    @Test
    public void testWriteRawUTF8String() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        byte[] data = "raw utf8".getBytes("UTF-8");
        try {
            buffer.writeRawUTF8String(data, 0, data.length);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteUTF8String() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        byte[] data = "utf8".getBytes("UTF-8");
        try {
            buffer.writeUTF8String(data, 0, data.length);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        try {
            buffer.writeRaw("raw string");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
    
    @Test
    public void testWriteRawStringWithOffsetAndLength() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        try {
            buffer.writeRaw("raw string", 0, 4);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawValueString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        try {
            buffer.writeRawValue("raw value");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawValueStringWithOffsetAndLength() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        try {
            buffer.writeRawValue("raw value", 0, 4);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawValueChars() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        char[] data = "raw chars".toCharArray();
        try {
            buffer.writeRawValue(data, 0, data.length);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testWriteRawChar() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        try {
            buffer.writeRaw('c');
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
    
    @Test
    public void testWriteFieldNameSerializableString() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartObject();
        // Using a concrete implementation of SerializableString
        SerializableString sString = new com.fasterxml.jackson.core.util.BufferRecycler.TextValue(null, "fieldName".toCharArray());
        buffer.writeFieldName(sString);
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("fieldName", parser.getCurrentName());
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber((BigDecimal) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber((BigInteger) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testWriteNumberStringNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeNumber((String) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testWriteObjectCodecNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null); // No codec
        Object value = new Object();
        buffer.writeObject(value);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals(value, parser.getEmbeddedObject());
    }
    
    @Test
    public void testWriteTreeNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeTree(null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testGetBinaryValueNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        // Test with an embedded null which is not a byte array
        buffer.writeObject(null);
        JsonParser parser = buffer.asParser();
        parser.nextToken(); // VALUE_NULL
        // getBinaryValue should throw an exception or return null if not applicable
        try {
            parser.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS);
            fail("Expected exception when getting binary value from non-binary token");
        } catch (JsonParseException e) {
            // Expected exception
        }
    }
}
```