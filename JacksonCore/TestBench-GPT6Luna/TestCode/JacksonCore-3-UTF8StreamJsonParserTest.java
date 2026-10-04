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
    @Test
    public void testGrowArrayByExtendsArray() throws Exception {
        int[] original = { 1, 2 };
        assertArrayEquals(new int[] { 1, 2, 0, 0 },
                UTF8StreamJsonParser.growArrayBy(original, 2));
    }

    @Test
    public void testGrowArrayByNullArray() throws Exception {
        assertArrayEquals(new int[3],
                UTF8StreamJsonParser.growArrayBy(null, 3));
    }

    @Test
    public void testCodecRoundTrip() throws Exception {
        UTF8StreamJsonParser parser = parser("null");
        assertNull(parser.getCodec());
        parser.setCodec(null);
        assertNull(parser.getCodec());
    }

    @Test
    public void testInputSourceIsSuppliedStream() throws Exception {
        InputStream input = new ByteArrayInputStream("null".getBytes("UTF-8"));
        UTF8StreamJsonParser parser = parser(input, "null");
        assertSame(input, parser.getInputSource());
    }

    @Test
    public void testReleaseBufferedReturnsRemainingBytes() throws Exception {
        UTF8StreamJsonParser parser = parser("true");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(4, parser.releaseBuffered(out));
        assertArrayEquals("true".getBytes("UTF-8"), out.toByteArray());
    }

    @Test
    public void testReleaseBufferedEmptyAfterReading() throws Exception {
        UTF8StreamJsonParser parser = parser("null");
        parser.nextToken();
        assertEquals(0, parser.releaseBuffered(new ByteArrayOutputStream()));
    }

    @Test
    public void testTokenAndTextAccessorsForString() throws Exception {
        UTF8StreamJsonParser parser = parser("\"abc\"");
        assertNull(parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("abc", parser.getText());
        assertEquals("abc", parser.getValueAsString());
        assertEquals(3, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertArrayEquals(new char[] { 'a', 'b', 'c' },
                Arrays.copyOf(parser.getTextCharacters(), 3));
    }

    @Test
    public void testTextAccessorsForInteger() throws Exception {
        UTF8StreamJsonParser parser = parser("2147483647");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("21474836472147483647", parser.getText());
        assertEquals(10, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testTextAccessorsForBooleanToken() throws Exception {
        UTF8StreamJsonParser parser = parser("true");
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("truetrue", parser.getText());
        assertEquals(4, parser.getTextLength());
        assertArrayEquals(new char[] { 't', 'r', 'u', 'e' },
                Arrays.copyOf(parser.getTextCharacters(), 4));
    }

    @Test
    public void testNextTokenTraversesArray() throws Exception {
        UTF8StreamJsonParser parser = parser("[1]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("11", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextIntValueAndDefault() throws Exception {
        UTF8StreamJsonParser parser = parser("{\"n\":2147483647,\"s\":\"x\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Integer.MAX_VALUE, parser.nextIntValue(-1));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(-1, parser.nextIntValue(-1));
    }

    @Test
    public void testNextLongValueAtLongMaximum() throws Exception {
        UTF8StreamJsonParser parser = parser("{\"n\":9223372036854775807}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Long.MAX_VALUE, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueTrueAndFalse() throws Exception {
        UTF8StreamJsonParser parser = parser("[true,false]");
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testTokenAndCurrentLocations() throws Exception {
        UTF8StreamJsonParser parser = parser("1");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        JsonLocation tokenLocation = parser.getTokenLocation();
        assertEquals(0L, tokenLocation.getByteOffset());
        JsonLocation currentLocation = parser.getCurrentLocation();
        assertEquals(3L, currentLocation.getByteOffset());
    }

    @Test
    public void testBase64ValueDecoding() throws Exception {
        UTF8StreamJsonParser parser = parser("\"AQI=\"");
        parser.nextToken();
        assertArrayEquals(new byte[] { 1, 2 },
                parser.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testReadBinaryValueWritesDecodedBytes() throws Exception {
        UTF8StreamJsonParser parser = parser("\"AQI=\"");
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(2, parser.readBinaryValue(
                Base64Variants.getDefaultVariant(), out));
        assertArrayEquals(new byte[] { 1, 2 }, out.toByteArray());
    }

    private UTF8StreamJsonParser parser(String json) throws Exception {
        return parser(new ByteArrayInputStream(json.getBytes("UTF-8")), json);
    }

    private UTF8StreamJsonParser parser(InputStream input, String json) {
        byte[] bytes = json.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        IOContext context = new IOContext(null, input, false);
        BytesToNameCanonicalizer symbols = BytesToNameCanonicalizer.createRoot();
        return new UTF8StreamJsonParser(context, 0, input, null, symbols,
                bytes, 0, bytes.length, false);
    }
}
