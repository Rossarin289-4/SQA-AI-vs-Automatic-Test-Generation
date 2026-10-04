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

public class TokenBufferTest {
    @Test
    public void testEmptyBufferParser() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        JsonParser parser = buffer.asParser();
        assertNull(buffer.firstToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testFirstTokenAndBooleanTraversal() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeBoolean(true);
        buffer.writeBoolean(false);
        assertEquals(JsonToken.VALUE_TRUE, buffer.firstToken());
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals("false", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNullStringIsNullToken() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeString((String) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals("null", parser.getText());
    }

    @Test
    public void testObjectFieldAndContext() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("a");
        buffer.writeString("b");
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("b", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertTrue(parser.getParsingContext().inRoot());
    }

    @Test
    public void testNumericTypeEdgesAndValues() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNumber(Integer.MAX_VALUE);
        buffer.writeNumber((long) Integer.MAX_VALUE + 1L);
        buffer.writeNumber(Long.MAX_VALUE);
        JsonParser parser = buffer.asParser();

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals((long) Integer.MAX_VALUE + 1L, parser.getLongValue());
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
    }

    @Test
    public void testNegativeIntegerEdge() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNumber(Integer.MIN_VALUE);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MIN_VALUE, parser.getIntValue());
        assertEquals(BigInteger.valueOf(Integer.MIN_VALUE), parser.getBigIntegerValue());
    }

    @Test
    public void testBigIntegerPreserved() throws Exception {
        BigInteger value = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNumber(value);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(value, parser.getBigIntegerValue());
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
    }

    @Test
    public void testDecimalPreserved() throws Exception {
        BigDecimal value = new BigDecimal("12.50");
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNumber(value);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(value, parser.getDecimalValue());
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
    }

    @Test
    public void testFloatAndDoubleValues() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNumber(1.5f);
        buffer.writeNumber(2.25d);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.5f, parser.getFloatValue(), 1e-6f);
        assertEquals(JsonParser.NumberType.FLOAT, parser.getNumberType());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(2.25d, parser.getDoubleValue(), 1e-9);
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }

    @Test
    public void testEncodedNumberText() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNumber("3.75");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("3.75", parser.getText());
        assertEquals(3.75d, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testNumberWithoutDecimalPointParsesAsLong() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNumber("17");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(17L, parser.getLongValue());
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
    }

    @Test
    public void testEmbeddedObjectAndByteArray() throws Exception {
        byte[] bytes = new byte[] { 1, 2, 3 };
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeObject(bytes);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertSame(bytes, parser.getEmbeddedObject());
        assertArrayEquals(bytes, parser.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testWriteBinaryCopiesSelectedRange() throws Exception {
        byte[] source = new byte[] { 4, 5, 6, 7 };
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeBinary(Base64Variants.getDefaultVariant(), source, 1, 2);
        source[1] = 99;

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(new byte[] { 5, 6 },
                parser.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testTokenBoundaryAcrossSegments() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        for (int i = 0; i < 17; i++) {
            buffer.writeNumber(i);
        }
        JsonParser parser = buffer.asParser();
        for (int i = 0; i < 17; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertEquals(i, parser.getIntValue());
        }
        assertNull(parser.nextToken());
    }

    @Test
    public void testAppendCopiesStructure() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null, false);
        source.writeStartArray();
        source.writeString("x");
        source.writeNumber(8);
        source.writeEndArray();

        TokenBuffer target = new TokenBuffer((ObjectCodec) null, false);
        assertSame(target, target.append(source));
        JsonParser parser = target.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("x", parser.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(8, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testToStringShowsTokensAndField() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("k");
        buffer.writeNumber(2);
        buffer.writeEndObject();
        assertEquals("[TokenBuffer: START_OBJECT, FIELD_NAME(k), VALUE_NUMBER_INT, END_OBJECT]",
                buffer.toString());
    }

    @Test
    public void testFeatureConfiguration() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        JsonGenerator.Feature feature = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        assertEquals(buffer, buffer.enable(feature));
        assertTrue(buffer.isEnabled(feature));
        int enabledMask = buffer.getFeatureMask();
        assertEquals(feature.getMask(), enabledMask & feature.getMask());

        buffer.disable(feature);
        assertFalse(buffer.isEnabled(feature));
        assertEquals(enabledMask & ~feature.getMask(), buffer.getFeatureMask());

        buffer.setFeatureMask(feature.getMask());
        assertTrue(buffer.isEnabled(feature));
    }

    @Test
    public void testCodecAndPrettyPrinterFluentMethods() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        assertSame(buffer, buffer.useDefaultPrettyPrinter());
        assertSame(buffer, buffer.setCodec(null));
        assertNull(buffer.getCodec());
    }

    @Test
    public void testCloseAndBinaryCapability() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        assertTrue(buffer.canWriteBinaryNatively());
        assertFalse(buffer.isClosed());
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testNativeIdCapabilities() throws Exception {
        TokenBuffer noIds = new TokenBuffer((ObjectCodec) null, false);
        assertFalse(noIds.canWriteTypeId());
        assertFalse(noIds.canWriteObjectId());

        TokenBuffer withIds = new TokenBuffer((ObjectCodec) null, true);
        assertTrue(withIds.canWriteTypeId());
        assertTrue(withIds.canWriteObjectId());
    }

    @Test
    public void testUnsupportedRawWriteThrows() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        try {
            buffer.writeRaw("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertNull(buffer.firstToken());
    }

    @Test
    public void testVersionIsAvailable() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        assertNotNull(buffer.version());
    }

    @Test
    public void testSerializeWritesBufferedTokens() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeStartArray();
        buffer.writeNumber(4);
        buffer.writeString("v");
        buffer.writeEndArray();

        TokenBuffer copy = new TokenBuffer((ObjectCodec) null, false);
        buffer.serialize(copy);

        JsonParser parser = copy.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(4, parser.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("v", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testDeserializeCopiesCurrentStructure() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null, false);
        source.writeStartObject();
        source.writeFieldName("x");
        source.writeNumber(6);
        source.writeEndObject();
        JsonParser parser = source.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        TokenBuffer target = new TokenBuffer((ObjectCodec) null, false);
        assertSame(target, target.deserialize(parser, null));
        JsonParser copied = target.asParser();
        assertEquals(JsonToken.START_OBJECT, copied.nextToken());
        assertEquals(JsonToken.FIELD_NAME, copied.nextToken());
        assertEquals("x", copied.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, copied.nextToken());
        assertEquals(6, copied.getIntValue());
        assertEquals(JsonToken.END_OBJECT, copied.nextToken());
    }

    @Test
    public void testOutputContextTracksContainerNesting() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        assertTrue(buffer.getOutputContext().inRoot());
        buffer.writeStartArray();
        assertTrue(buffer.getOutputContext().inArray());
        buffer.writeEndArray();
        assertTrue(buffer.getOutputContext().inRoot());
    }

    @Test
    public void testFlushLeavesBufferedContent() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNumber(9);
        buffer.flush();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(9, parser.getIntValue());
    }

    @Test
    public void testUnsupportedUtf8WritesThrow() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        try {
            buffer.writeRawUTF8String(new byte[] { 1 }, 0, 1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        try {
            buffer.writeUTF8String(new byte[] { 1 }, 0, 1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertNull(buffer.firstToken());
    }

    @Test
    public void testWriteRawValueThrows() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        try {
            buffer.writeRawValue("1");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertNull(buffer.firstToken());
    }

    @Test
    public void testWriteNullAndTreeWithoutCodec() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNull();
        buffer.writeTree(null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testCopyCurrentEventCopiesCurrentScalar() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null, false);
        source.writeNumber(10);
        JsonParser parser = source.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        TokenBuffer target = new TokenBuffer((ObjectCodec) null, false);
        target.copyCurrentEvent(parser);
        JsonParser copied = target.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, copied.nextToken());
        assertEquals(10, copied.getIntValue());
        assertNull(copied.nextToken());
    }

    @Test
    public void testCopyCurrentStructureFromFieldName() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null, false);
        source.writeStartObject();
        source.writeFieldName("a");
        source.writeStartArray();
        source.writeBoolean(true);
        source.writeEndArray();
        source.writeEndObject();

        JsonParser parser = source.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());

        TokenBuffer target = new TokenBuffer((ObjectCodec) null, false);
        target.copyCurrentStructure(parser);
        JsonParser copied = target.asParser();
        assertEquals(JsonToken.FIELD_NAME, copied.nextToken());
        assertEquals("a", copied.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, copied.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, copied.nextToken());
        assertEquals(JsonToken.END_ARRAY, copied.nextToken());
        assertNull(copied.nextToken());
    }

    @Test
    public void testParserLocationTextAndPeek() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeString("edge");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("edge", parser.getText());
        assertArrayEquals(new char[] { 'e', 'd', 'g', 'e' }, parser.getTextCharacters());
        assertEquals(4, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertFalse(parser.hasTextCharacters());
        assertEquals(JsonLocation.NA, parser.getTokenLocation());
        assertEquals(JsonLocation.NA, parser.getCurrentLocation());
    }

    @Test
    public void testOverrideCurrentNameOnStartObject() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeStartObject();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.overrideCurrentName("renamed");
        assertEquals("renamed", parser.getCurrentName());
    }

    @Test
    public void testExplicitParserLocationIsReturned() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNull();
        JsonParser parser = buffer.asParser();
        JsonLocation location = new JsonLocation(null, 3L, 2L, 1, 1);
        ((TokenBuffer.Parser) parser).setLocation(location);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(location, parser.getTokenLocation());
        assertEquals(location, parser.getCurrentLocation());
    }
}
```