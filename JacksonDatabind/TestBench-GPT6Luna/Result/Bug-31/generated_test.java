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

public class TokenBufferTest {
    @Test
    public void testFirstTokenAndParserTraversal() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        assertNull(b.firstToken());
        b.writeString("x");
        assertEquals(JsonToken.VALUE_STRING, b.firstToken());
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("x", p.getText());
        assertNull(p.nextToken());
    }

    @Test
    public void testSegmentBoundaryTraversal() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        for (int i = 0; i < 16; i++) b.writeNumber(i);
        b.writeNumber(16);
        JsonParser p = b.asParser();
        for (int i = 0; i <= 16; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
        assertNull(p.nextToken());
    }

    @Test
    public void testFieldNameAndContext() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeStartObject();
        b.writeFieldName("a");
        b.writeNumber(2);
        b.writeEndObject();
        JsonParser p = b.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextFieldNameFallsBackToNextToken() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeNumber(3);
        JsonParser p = b.asParser();
        assertNull(p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
        assertEquals(3, p.getIntValue());
    }

    @Test
    public void testTextAccessors() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeString("hello");
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
        assertEquals(5, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertArrayEquals("hello".toCharArray(), p.getTextCharacters());
        assertFalse(p.hasTextCharacters());
    }

    @Test
    public void testNumbersAtIntegerBoundaries() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeNumber(Integer.MAX_VALUE);
        b.writeNumber(2147483648L);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(Integer.MAX_VALUE, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2147483648L, p.getLongValue());
        assertEquals(BigInteger.valueOf(2147483648L), p.getBigIntegerValue());
    }

    @Test
    public void testLongBoundaries() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeNumber(Long.MAX_VALUE);
        b.writeNumber(Long.MIN_VALUE);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(Long.MAX_VALUE, p.getLongValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(Long.MIN_VALUE, p.getLongValue());
    }

    @Test
    public void testBigIntegerAndDecimalAccessors() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        BigInteger n = new BigInteger("12345678901234567890");
        BigDecimal d = new BigDecimal("12.50");
        b.writeNumber(n);
        b.writeNumber(d);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(n, p.getBigIntegerValue());
        assertEquals(new BigDecimal(n), p.getDecimalValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(d, p.getDecimalValue());
        assertEquals(12.5, p.getDoubleValue(), 1e-9);
    }

    @Test
    public void testEncodedNumberBoundaries() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeNumber("9223372036854775807");
        b.writeNumber("1.25");
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Long.MAX_VALUE, p.getLongValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.25, p.getDoubleValue(), 1e-9);
        assertEquals(new BigDecimal("1.25"), p.getDecimalValue());
    }

    @Test
    public void testNullBooleanAndEmbeddedObject() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        byte[] bytes = new byte[] { 1, 2 };
        b.writeBoolean(false);
        b.writeNull();
        b.writeObject(bytes);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertSame(bytes, p.getEmbeddedObject());
        assertArrayEquals(bytes, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testRawValueAndStringNull() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeString((String) null);
        b.writeRawValue("true");
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertEquals("true", ((RawValue) p.getEmbeddedObject()).rawValue());
    }

    @Test
    public void testAppendCopiesTokens() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null);
        source.writeStartArray();
        source.writeNumber(7);
        source.writeEndArray();
        TokenBuffer target = new TokenBuffer((ObjectCodec) null);
        assertSame(target, target.append(source));
        JsonParser p = target.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(7, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testFeatureMaskMutations() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        JsonGenerator.Feature f = JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        b.disable(f);
        assertFalse(b.isEnabled(f));
        b.enable(f);
        assertTrue(b.isEnabled(f));
        b.setFeatureMask(0);
        assertFalse(b.isEnabled(f));
        assertEquals(0, b.getFeatureMask());
    }

    @Test
    public void testCodecAndNoOpPrettyPrinter() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        ObjectCodec codec = new ObjectMapper();
        assertSame(b, b.setCodec(codec));
        assertSame(codec, b.getCodec());
        assertSame(b, b.useDefaultPrettyPrinter());
    }

    @Test
    public void testLifecycleAndBinaryCapability() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        assertTrue(b.canWriteBinaryNatively());
        assertFalse(b.isClosed());
        b.flush();
        b.close();
        assertTrue(b.isClosed());
    }

    @Test
    public void testOutputContextReturnsToRoot() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        JsonWriteContext root = b.getOutputContext();
        b.writeStartArray();
        assertNotSame(root, b.getOutputContext());
        b.writeEndArray();
        assertSame(root, b.getOutputContext());
    }

    @Test
    public void testNativeIdCapabilities() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, true);
        assertTrue(b.canWriteTypeId());
        assertTrue(b.canWriteObjectId());
    }

    @Test
    public void testParserCloseAndPeek() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeNumber(1);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.close();
        assertTrue(p.isClosed());
        assertNull(p.nextToken());
    }

    @Test
    public void testToStringIncludesTokenNames() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeStartObject();
        b.writeFieldName("x");
        b.writeBoolean(true);
        b.writeEndObject();
        assertEquals("[TokenBuffer: START_OBJECT, FIELD_NAME(x), VALUE_TRUE, END_OBJECT]", b.toString());
    }

    @Test
    public void testForceBigDecimalVersionAndParserNumbers() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        assertSame(b, b.forceUseOfBigDecimal(true));
        assertNotNull(b.version());
        b.writeNumber(2.5);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(new BigDecimal("2.5"), p.getDecimalValue());
    }

    @Test
    public void testSerializeWritesBufferedStructure() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeStartArray();
        b.writeNumber(4);
        b.writeEndArray();
        TokenBuffer copy = new TokenBuffer((ObjectCodec) null);
        b.serialize(copy);
        JsonParser p = copy.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(4, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testDeserializeCopiesCurrentScalar() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null);
        source.writeString("v");
        JsonParser p = source.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        TokenBuffer target = new TokenBuffer((ObjectCodec) null);
        assertSame(target, target.deserialize(p, null));
        JsonParser result = target.asParser();
        assertEquals(JsonToken.VALUE_STRING, result.nextToken());
        assertEquals("v", result.getText());
    }

    @Test
    public void testUnsupportedRawOperations() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        try {
            b.writeRaw("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        try {
            b.writeUTF8String(new byte[] { 1 }, 0, 1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        try {
            b.writeRawUTF8String(new byte[] { 1 }, 0, 1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testWriteTreeWithNull() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeTree(null);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testWriteBinaryCopiesRequestedRange() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        byte[] input = new byte[] { 8, 9, 10 };
        b.writeBinary(Base64Variants.getDefaultVariant(), input, 1, 1);
        input[1] = 0;
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(new byte[] { 9 }, (byte[]) p.getEmbeddedObject());
    }

    @Test
    public void testNativeIdsRoundTripThroughParser() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, true);
        b.writeTypeId("type");
        b.writeObjectId("object");
        b.writeString("v");
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("type", p.getTypeId());
        assertEquals("object", p.getObjectId());
    }

    @Test
    public void testCopyCurrentEventAndStructure() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null);
        source.writeStartArray();
        source.writeNumber(1);
        source.writeEndArray();
        JsonParser p = source.asParser();
        TokenBuffer target = new TokenBuffer((ObjectCodec) null);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        target.copyCurrentEvent(p);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        target.copyCurrentStructure(p);
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        target.copyCurrentEvent(p);
        JsonParser result = target.asParser();
        assertEquals(JsonToken.START_ARRAY, result.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        assertEquals(1, result.getIntValue());
        assertEquals(JsonToken.END_ARRAY, result.nextToken());
    }

    @Test
    public void testDeserializeFieldNameWrapsObject() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null);
        source.writeStartObject();
        source.writeFieldName("a");
        source.writeNumber(5);
        source.writeEndObject();
        JsonParser p = source.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        TokenBuffer target = new TokenBuffer((ObjectCodec) null);
        assertSame(target, target.deserialize(p, null));
        JsonParser result = target.asParser();
        assertEquals(JsonToken.START_OBJECT, result.nextToken());
        assertEquals(JsonToken.FIELD_NAME, result.nextToken());
        assertEquals("a", result.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        assertEquals(5, result.getIntValue());
        assertEquals(JsonToken.END_OBJECT, result.nextToken());
    }

    @Test
    public void testParserLocationNameOverrideAndContext() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        b.writeStartObject();
        b.writeFieldName("old");
        b.writeNumber(1);
        JsonParser p = b.asParser();
        assertSame(JsonLocation.NA, p.getCurrentLocation());
        assertSame(JsonLocation.NA, p.getTokenLocation());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertNotNull(p.getParsingContext());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        p.overrideCurrentName("new");
        assertEquals("new", p.getCurrentName());
    }
}
