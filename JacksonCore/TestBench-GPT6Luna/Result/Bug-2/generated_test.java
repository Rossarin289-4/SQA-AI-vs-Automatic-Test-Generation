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

public class ReaderBasedJsonParserTest {
    @Test
    public void testGrowArrayByCopiesAndExtends() throws Exception {
        int[] original = { 3, 7 };
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 2);
        assertArrayEquals(new int[] { 3, 7, 0, 0 }, grown);
        assertArrayEquals(new int[] { 3, 7 }, original);
    }

    @Test
    public void testGrowArrayByNullStartsAtRequestedLength() throws Exception {
        assertEquals(3, UTF8StreamJsonParser.growArrayBy(null, 3).length);
    }

    @Test
    public void testParserCodecAndInputSource() throws Exception {
        StringReader reader = new StringReader("null");
        IOContext context = new IOContext(new BufferRecycler(), reader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot().makeChild(true, true);
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(context, 0, reader, null, symbols);
        assertNull(parser.getCodec());
        parser.setCodec(null);
        assertNull(parser.getCodec());
        assertSame(reader, parser.getInputSource());
        parser.close();
    }

    @Test
    public void testReadNullTokenTextAndEndOfInput() throws Exception {
        StringReader reader = new StringReader("null");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals("null", parser.getText());
        assertNull(parser.getValueAsString());
        assertNull(parser.nextToken());
        assertNull(parser.getText());
        parser.close();
    }

    @Test
    public void testStringTextAndCharacterAccess() throws Exception {
        StringReader reader = new StringReader("\"hi\"");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hi", parser.getText());
        assertEquals("hi", parser.getValueAsString());
        assertEquals("hi", new String(parser.getTextCharacters(), parser.getTextOffset(),
                parser.getTextLength()));
        assertEquals(2, parser.getTextLength());
        parser.close();
    }

    @Test
    public void testNumberTextAndCharacterAccess() throws Exception {
        StringReader reader = new StringReader("123");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("123", parser.getText());
        assertEquals(3, parser.getTextLength());
        assertEquals("123", new String(parser.getTextCharacters(), parser.getTextOffset(),
                parser.getTextLength()));
        parser.close();
    }

    @Test
    public void testNumberIntMaximum() throws Exception {
        StringReader reader = new StringReader("2147483647");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
        parser.close();
    }

    @Test
    public void testNumberIntMinimum() throws Exception {
        StringReader reader = new StringReader("-2147483648");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MIN_VALUE, parser.getIntValue());
        parser.close();
    }

    @Test
    public void testNumberLongMaximum() throws Exception {
        StringReader reader = new StringReader("9223372036854775807");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
        parser.close();
    }

    @Test
    public void testNextTextValueForObjectString() throws Exception {
        StringReader reader = new StringReader("{\"a\":\"x\"}");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("x", parser.nextTextValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextIntValueForObjectInteger() throws Exception {
        StringReader reader = new StringReader("{\"n\":17}");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(17, parser.nextIntValue(-1));
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextLongValueForObjectInteger() throws Exception {
        StringReader reader = new StringReader("{\"n\":2147483648}");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(2147483648L, parser.nextLongValue(-1L));
        parser.close();
    }

    @Test
    public void testNextBooleanValueForTrueAndFalse() throws Exception {
        StringReader reader = new StringReader("{\"a\":true,\"b\":false}");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
        parser.close();
    }

    @Test
    public void testNextValueMethodsReturnDefaultsForOtherTypes() throws Exception {
        StringReader reader = new StringReader("{\"s\":\"x\",\"b\":null}");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(-9, parser.nextIntValue(-9));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertNull(parser.nextBooleanValue());
        parser.close();
    }

    @Test
    public void testReleaseBufferedWritesUnreadCharacters() throws Exception {
        StringReader reader = new StringReader("true");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        StringWriter writer = new StringWriter();
        assertEquals(0, parser.releaseBuffered(writer));
        assertEquals("", writer.toString());
        parser.close();
    }

    @Test
    public void testReleaseBufferedWhenConsumedIsZero() throws Exception {
        StringReader reader = new StringReader("null");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
        assertEquals(0, parser.releaseBuffered(new StringWriter()));
        parser.close();
    }

    @Test
    public void testBase64ValueAndStreamingRead() throws Exception {
        StringReader reader = new StringReader("\"aGk=\"");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] expected = new byte[] { 'h', 'i' };
        assertArrayEquals(expected, parser.getBinaryValue(Base64Variants.getDefaultVariant()));
        parser.close();

        reader = new StringReader("\"aGk=\"");
        parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(2, parser.readBinaryValue(Base64Variants.getDefaultVariant(), out));
        assertArrayEquals(expected, out.toByteArray());
        parser.close();
    }

    @Test
    public void testFieldNameTextAndLength() throws Exception {
        StringReader reader = new StringReader("{\"key\":1}");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
        assertEquals(3, parser.getTextLength());
        assertEquals("key", new String(parser.getTextCharacters(), 0, parser.getTextLength()));
        parser.close();
    }

    @Test
    public void testArrayTraversalAndBooleanTokenText() throws Exception {
        StringReader reader = new StringReader("[true,false]");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testCloseMarksParserClosed() throws Exception {
        StringReader reader = new StringReader("null");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), reader, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(true, true));
        parser.close();
        assertTrue(parser.isClosed());
    }
}
