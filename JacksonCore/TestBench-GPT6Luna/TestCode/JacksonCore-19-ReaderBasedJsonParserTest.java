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

public class ReaderBasedJsonParserTest {
    @Test
    public void testGrowArrayWithNullAndZeroMore() throws Exception {
        assertEquals(0, UTF8StreamJsonParser.growArrayBy(null, 0).length);
    }

    @Test
    public void testGrowArrayAddsRequestedCapacity() throws Exception {
        int[] original = new int[] {1, 2};
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 3);
        assertEquals(5, grown.length);
        assertArrayEquals(new int[] {1, 2, 0, 0, 0}, grown);
        assertArrayEquals(new int[] {1, 2}, original);
    }

    @Test
    public void testCodecCanBeReadAndReplaced() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(context, 0,
                new StringReader(""), null, CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertNull(parser.getCodec());
        parser.setCodec(null);
        assertNull(parser.getCodec());
    }

    @Test
    public void testInputSourceIsSuppliedReader() throws Exception {
        Reader reader = new StringReader("1");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, reader, null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testGetTextBeforeTokensIsNull() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("1"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertNull(parser.getText());
    }

    @Test
    public void testReadIntegerTokenText() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("2147483647"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("2147483647", parser.getText());
        assertEquals(2147483647, parser.getValueAsInt());
    }

    @Test
    public void testReadIntegerJustBeyondIntRangeAsInt() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("2147483648"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("2147483648", parser.getText());
        try {
            parser.getValueAsInt();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { }
    }

    @Test
    public void testNegativeIntegerAtIntMinimum() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("-2147483648"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-2147483648, parser.getValueAsInt());
    }

    @Test
    public void testStringTextAndCharacters() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("\"abc\""), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("abc", parser.getText());
        assertEquals(3, parser.getTextLength());
        assertEquals("abc", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));
    }

    @Test
    public void testStringValueAsString() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("\"x\""), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("x", parser.getValueAsString());
    }

    @Test
    public void testBooleanValueText() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("true"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());
    }

    @Test
    public void testNextTextValueAfterFieldName() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("{\"a\":\"b\"}"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.nextTextValue());
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());
    }

    @Test
    public void testNextIntValueAfterFieldNameAtMaxInt() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("{\"a\":2147483647}"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(2147483647, parser.nextIntValue(-1));
    }

    @Test
    public void testNextIntValueUsesDefaultForStringFieldValue() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("{\"a\":\"b\"}"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(7, parser.nextIntValue(7));
    }

    @Test
    public void testNextLongValueAtLongMaximum() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("{\"a\":9223372036854775807}"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Long.MAX_VALUE, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueForFalseField() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("{\"a\":false}"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextFieldNameMatchesExpectedName() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("{\"abc\":1}"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals("abc", parser.nextFieldName());
    }

    @Test
    public void testNextFieldNameReportsDifferentName() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("{\"abc\":1}"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals("abc", parser.nextFieldName());
        assertEquals("abc", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTokenTraversesArrayAndEnd() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("[1]"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testReleaseBufferedWritesRemainingInput() throws Exception {
        char[] input = "true".toCharArray();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, null, null,
                CharsToNameCanonicalizer.createRoot().makeChild(0),
                input, 0, input.length, false);
        StringWriter writer = new StringWriter();
        assertEquals(4, parser.releaseBuffered(writer));
        assertEquals("true", writer.toString());
    }

    @Test
    public void testReleaseBufferedReturnsZeroWhenNoCharactersRemain() throws Exception {
        char[] input = new char[0];
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, null, null,
                CharsToNameCanonicalizer.createRoot().makeChild(0),
                input, 0, 0, false);
        assertEquals(0, parser.releaseBuffered(new StringWriter()));
    }

    @Test
    public void testBinaryValueDecodesBase64String() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("\"AQID\""), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertArrayEquals(new byte[] {1, 2, 3}, parser.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testReadBinaryValueWritesDecodedBytes() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("\"AQI=\""), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(2, parser.readBinaryValue(Base64Variants.getDefaultVariant(), out));
        assertArrayEquals(new byte[] {1, 2}, out.toByteArray());
    }

    @Test
    public void testTokenAndCurrentLocationsAdvanceAcrossInput() throws Exception {
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                new IOContext(new BufferRecycler(), null, false), 0, new StringReader("1 2"), null,
                CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0L, parser.getTokenLocation().getCharOffset());
        assertEquals(1L, parser.getCurrentLocation().getCharOffset());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2L, parser.getTokenLocation().getCharOffset());
    }
}
