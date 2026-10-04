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
    public void testEmptyBufferFirstToken() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        assertNull(b.firstToken());
    }

    @Test
    public void testFirstTokenAfterWriting() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeString("x");
        assertEquals(JsonToken.VALUE_STRING, b.firstToken());
    }

    @Test
    public void testParserReadsNumbersAndBoolean() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeNumber(2147483647);
        b.writeNumber(2147483648L);
        b.writeBoolean(true);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2147483647, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2147483648L, p.getLongValue());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals("true", p.getText());
    }

    @Test
    public void testParserTraversesNestedStructure() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeStartObject();
        b.writeFieldName("a");
        b.writeStartArray();
        b.writeString("v");
        b.writeEndArray();
        b.writeEndObject();
        JsonParser p = b.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("v", p.getText());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testAppendCopiesContents() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null, false);
        source.writeString("a");
        source.writeNumber(3);
        TokenBuffer target = new TokenBuffer((ObjectCodec) null, false);
        assertSame(target, target.append(source));
        JsonParser p = target.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a", p.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertNull(p.nextToken());
    }

    @Test
    public void testSerializeWritesBufferedTokens() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeStartArray();
        b.writeString("s");
        b.writeNumber(2);
        b.writeEndArray();
        TokenBuffer copy = new TokenBuffer((ObjectCodec) null, false);
        b.serialize(copy);
        JsonParser p = copy.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("s", p.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testDeserializeCopiesCurrentStructure() throws Exception {
        TokenBuffer input = new TokenBuffer((ObjectCodec) null, false);
        input.writeStartObject();
        input.writeFieldName("k");
        input.writeNumber(4);
        input.writeEndObject();
        JsonParser source = input.asParser();
        assertEquals(JsonToken.START_OBJECT, source.nextToken());
        TokenBuffer result = new TokenBuffer((ObjectCodec) null, false);
        assertSame(result, result.deserialize(source, null));
        JsonParser p = result.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("k", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(4, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testToStringShowsTokensAndFieldName() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeStartObject();
        b.writeFieldName("k");
        b.writeNull();
        b.writeEndObject();
        assertEquals("[TokenBuffer: START_OBJECT, FIELD_NAME(k), VALUE_NULL, END_OBJECT]", b.toString());
    }

    @Test
    public void testGeneratorFeatureChanges() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        JsonGenerator.Feature feature = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        boolean initiallyEnabled = b.isEnabled(feature);
        assertEquals(initiallyEnabled, (b.getFeatureMask() & feature.getMask()) != 0);
        assertSame(b, b.enable(feature));
        assertTrue(b.isEnabled(feature));
        assertSame(b, b.disable(feature));
        assertFalse(b.isEnabled(feature));
    }

    @Test
    public void testGeneratorFeatureMaskCanBeSet() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.setFeatureMask(0);
        assertEquals(0, b.getFeatureMask());
        b.setFeatureMask(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask());
        assertTrue(b.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testCodecCanBeReadBack() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        assertNull(b.getCodec());
        b.setCodec(null);
        assertNull(b.getCodec());
    }

    @Test
    public void testBinaryCapabilityAndLifecycle() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        assertTrue(b.canWriteBinaryNatively());
        assertFalse(b.isClosed());
        b.flush();
        b.close();
        assertTrue(b.isClosed());
    }

    @Test
    public void testOutputContextReturnsToRoot() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        JsonWriteContext root = b.getOutputContext();
        b.writeStartArray();
        assertNotSame(root, b.getOutputContext());
        b.writeEndArray();
        assertSame(root, b.getOutputContext());
    }

    @Test
    public void testWriteNullAndNullString() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeString((String) null);
        b.writeNull();
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testWriteBigNumberAndDecimal() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeNumber(new BigInteger("9223372036854775807"));
        b.writeNumber(new BigDecimal("1.25"));
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(new BigInteger("9223372036854775807"), p.getBigIntegerValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(new BigDecimal("1.25"), p.getDecimalValue());
    }

    @Test
    public void testWriteEmbeddedObject() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        Object value = new byte[] { 1, 2 };
        b.writeObject(value);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertSame(value, p.getEmbeddedObject());
    }

    @Test
    public void testWriteBinaryCopiesSelectedRange() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        byte[] input = new byte[] { 7, 8, 9 };
        b.writeBinary(Base64Variants.getDefaultVariant(), input, 1, 1);
        input[1] = 0;
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(new byte[] { 8 }, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testNativeIdCapabilitiesFollowConstructor() throws Exception {
        TokenBuffer withoutIds = new TokenBuffer((ObjectCodec) null, false);
        TokenBuffer withIds = new TokenBuffer((ObjectCodec) null, true);
        assertFalse(withoutIds.canWriteTypeId());
        assertFalse(withoutIds.canWriteObjectId());
        assertTrue(withIds.canWriteTypeId());
        assertTrue(withIds.canWriteObjectId());
    }

    @Test
    public void testParserTextForFloatingPointAndBoolean() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeNumber(1.5);
        b.writeBoolean(false);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5, p.getDoubleValue(), 1e-9);
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals("false", p.getText());
    }

    @Test
    public void testParserTextCharacterAccessors() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeString("abc");
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertArrayEquals(new char[] { 'a', 'b', 'c' }, p.getTextCharacters());
        assertEquals(3, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertFalse(p.hasTextCharacters());
    }

    @Test
    public void testParserCloseStopsIteration() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeNull();
        JsonParser p = b.asParser();
        p.close();
        assertTrue(p.isClosed());
        assertNull(p.nextToken());
    }

    @Test
    public void testVersionIsAvailable() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        assertNotNull(b.version());
    }

    @Test
    public void testPrettyPrinterIsNoOp() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        assertSame(b, b.useDefaultPrettyPrinter());
    }

    @Test
    public void testRawWritingIsUnsupported() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        try { b.writeRaw("x"); fail("expected UnsupportedOperationException"); }
        catch (UnsupportedOperationException expected) { }
        try { b.writeRawValue("x"); fail("expected UnsupportedOperationException"); }
        catch (UnsupportedOperationException expected) { }
        assertNull(b.firstToken());
    }

    @Test
    public void testUtf8WritingIsUnsupported() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        try { b.writeRawUTF8String(new byte[] { 65 }, 0, 1); fail("expected UnsupportedOperationException"); }
        catch (UnsupportedOperationException expected) { }
        try { b.writeUTF8String(new byte[] { 65 }, 0, 1); fail("expected UnsupportedOperationException"); }
        catch (UnsupportedOperationException expected) { }
        assertNull(b.firstToken());
    }

    @Test
    public void testWriteTreeWithoutCodecEmbedsNode() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeTree(null);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNativeIdWritingCapabilities() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, true);
        b.writeObjectId("obj");
        b.writeTypeId("type");
        b.writeString("v");
        JsonParser p = b.asParser();
        assertTrue(p.canReadObjectId());
        assertTrue(p.canReadTypeId());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("v", p.getText());
        assertEquals("obj", p.getObjectId());
        assertEquals("type", p.getTypeId());
    }

    @Test
    public void testCopyCurrentEventFromParser() throws Exception {
        TokenBuffer src = new TokenBuffer((ObjectCodec) null, false);
        src.writeNumber(7);
        JsonParser input = src.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, input.nextToken());
        TokenBuffer target = new TokenBuffer((ObjectCodec) null, false);
        target.copyCurrentEvent(input);
        JsonParser output = target.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, output.nextToken());
        assertEquals(7, output.getIntValue());
    }

    @Test
    public void testCopyCurrentStructureFromParser() throws Exception {
        TokenBuffer src = new TokenBuffer((ObjectCodec) null, false);
        src.writeStartArray();
        src.writeString("a");
        src.writeEndArray();
        JsonParser input = src.asParser();
        assertEquals(JsonToken.START_ARRAY, input.nextToken());
        TokenBuffer target = new TokenBuffer((ObjectCodec) null, false);
        target.copyCurrentStructure(input);
        JsonParser output = target.asParser();
        assertEquals(JsonToken.START_ARRAY, output.nextToken());
        assertEquals(JsonToken.VALUE_STRING, output.nextToken());
        assertEquals("a", output.getText());
        assertEquals(JsonToken.END_ARRAY, output.nextToken());
        assertNull(output.nextToken());
    }

    @Test
    public void testParserLocationDefaultsToNotAvailable() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        JsonParser p = b.asParser();
        assertEquals(JsonLocation.NA, p.getCurrentLocation());
        assertEquals(JsonLocation.NA, p.getTokenLocation());
        assertNull(p.nextToken());
    }

    @Test
    public void testParserSetLocationPreservesLocation() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        JsonParser p = b.asParser();
        JsonLocation location = new JsonLocation(null, 1L, 2L, 3, 4);
        ((TokenBuffer.Parser) p).setLocation(location);
        assertSame(location, p.getCurrentLocation());
        assertSame(location, p.getTokenLocation());
    }

    @Test
    public void testPeekNextTokenAndParsingContext() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeStartObject();
        b.writeFieldName("k");
        b.writeNumber(5);
        b.writeEndObject();
        JsonParser p = b.asParser();
        assertEquals(JsonToken.START_OBJECT, ((TokenBuffer.Parser) p).peekNextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertNotNull(p.getParsingContext());
        assertEquals(JsonToken.FIELD_NAME, ((TokenBuffer.Parser) p).peekNextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("k", p.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeStartObject();
        b.writeFieldName("old");
        b.writeNull();
        JsonParser p = b.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.overrideCurrentName("new");
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("old", p.getCurrentName());
    }

    @Test
    public void testFloatValueAccessor() throws Exception {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null, false);
        b.writeNumber(1.5f);
        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5f, p.getFloatValue(), 1e-6f);
    }
}
