```java
package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.*;
import java.util.Arrays;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;

public class ParserMinimalBaseTest {
    @Test
    public void testNextValueSkipsFieldName() throws Exception {
        ReaderBasedJsonParser p = parser("{\"a\":3}");
        assertEquals(JsonToken.FIELD_NAME, p.nextValue());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
    }

    @Test
    public void testNextValueReturnsFollowingArrayValue() throws Exception {
        ReaderBasedJsonParser p = parser("[1,2]");
        assertEquals(JsonToken.START_ARRAY, p.nextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextValue());
        assertEquals(1, p.getIntValue());
    }

    @Test
    public void testSkipChildrenNestedArray() throws Exception {
        ReaderBasedJsonParser p = parser("[[1],2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertSame(p, p.skipChildren());
        assertEquals(JsonToken.END_ARRAY, p.getCurrentToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
    }

    @Test
    public void testSkipChildrenScalarDoesNotAdvance() throws Exception {
        ReaderBasedJsonParser p = parser("[7]");
        p.nextToken();
        p.nextToken();
        assertSame(p, p.skipChildren());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
        assertEquals(7, p.getIntValue());
    }

    @Test
    public void testGetValueAsBooleanForStringForms() throws Exception {
        ReaderBasedJsonParser p = parser("[\" true \",\"null\",\"other\"]");
        p.nextToken();
        p.nextToken();
        assertTrue(p.getValueAsBoolean(false));
        p.nextToken();
        assertFalse(p.getValueAsBoolean(true));
        p.nextToken();
        assertTrue(p.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanForZeroAndNonzero() throws Exception {
        ReaderBasedJsonParser p = parser("[0,1]");
        p.nextToken();
        p.nextToken();
        assertFalse(p.getValueAsBoolean(true));
        p.nextToken();
        assertTrue(p.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsIntSignedBoundaries() throws Exception {
        ReaderBasedJsonParser p = parser("[2147483647,-2147483648]");
        p.nextToken();
        p.nextToken();
        assertEquals(Integer.MAX_VALUE, p.getValueAsInt());
        p.nextToken();
        assertEquals(Integer.MIN_VALUE, p.getValueAsInt(9));
    }

    @Test
    public void testGetValueAsIntStringAndFallback() throws Exception {
        ReaderBasedJsonParser p = parser("[\"12\",\"bad\",true,null]");
        p.nextToken();
        p.nextToken();
        assertEquals(12, p.getValueAsInt(8));
        p.nextToken();
        assertEquals(8, p.getValueAsInt(8));
        p.nextToken();
        assertEquals(1, p.getValueAsInt(8));
        p.nextToken();
        assertEquals(0, p.getValueAsInt(8));
    }

    @Test
    public void testGetValueAsLongBoundaries() throws Exception {
        ReaderBasedJsonParser p = parser("[9223372036854775807,-9223372036854775808]");
        p.nextToken();
        p.nextToken();
        assertEquals(Long.MAX_VALUE, p.getValueAsLong());
        p.nextToken();
        assertEquals(Long.MIN_VALUE, p.getValueAsLong(4));
    }

    @Test
    public void testGetValueAsLongStringAndFallback() throws Exception {
        ReaderBasedJsonParser p = parser("[\"23\",\"bad\",false]");
        p.nextToken();
        p.nextToken();
        assertEquals(23L, p.getValueAsLong(6L));
        p.nextToken();
        assertEquals(6L, p.getValueAsLong(6L));
        p.nextToken();
        assertEquals(0L, p.getValueAsLong(6L));
    }

    @Test
    public void testGetValueAsDoubleForms() throws Exception {
        ReaderBasedJsonParser p = parser("[\"2.5\",4,true,null]");
        p.nextToken();
        p.nextToken();
        assertEquals(2.5, p.getValueAsDouble(8.0), 1e-9);
        p.nextToken();
        assertEquals(4.0, p.getValueAsDouble(8.0), 1e-9);
        p.nextToken();
        assertEquals(1.0, p.getValueAsDouble(8.0), 1e-9);
        p.nextToken();
        assertEquals(0.0, p.getValueAsDouble(8.0), 1e-9);
    }

    @Test
    public void testGetValueAsStringScalarAndDefault() throws Exception {
        ReaderBasedJsonParser p = parser("[\"x\",2,null,[]]");
        p.nextToken();
        p.nextToken();
        assertEquals("x", p.getValueAsString());
        p.nextToken();
        assertEquals("2", p.getValueAsString("d"));
        p.nextToken();
        assertEquals("d", p.getValueAsString("d"));
        p.nextToken();
        assertEquals("d", p.getValueAsString("d"));
    }

    @Test
    public void testTextAndTextCharactersForString() throws Exception {
        ReaderBasedJsonParser p = parser("[\"cat\"]");
        p.nextToken();
        p.nextToken();
        assertEquals("cat", p.getText());
        assertEquals(3, p.getTextLength());
        assertEquals("cat", new String(p.getTextCharacters(), p.getTextOffset(), p.getTextLength()));
    }

    @Test
    public void testTextForStructuralAndNullTokens() throws Exception {
        ReaderBasedJsonParser p = parser("[null]");
        p.nextToken();
        assertEquals("[", p.getText());
        p.nextToken();
        assertEquals("null", p.getText());
        assertEquals(4, p.getTextLength());
    }

    @Test
    public void testBinaryValueDecodesBase64() throws Exception {
        ReaderBasedJsonParser p = parser("[\"AQID\"]");
        p.nextToken();
        p.nextToken();
        assertArrayEquals(new byte[] {1, 2, 3}, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testReadBinaryValueWritesDecodedBytes() throws Exception {
        ReaderBasedJsonParser p = parser("[\"AQID\"]");
        p.nextToken();
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(3, p.readBinaryValue(Base64Variants.getDefaultVariant(), out));
        assertArrayEquals(new byte[] {1, 2, 3}, out.toByteArray());
    }

    @Test
    public void testNextTokenAndCurrentTokenId() throws Exception {
        ReaderBasedJsonParser p = parser("[true]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertTrue(p.hasToken(JsonToken.START_ARRAY));
        assertEquals(JsonToken.START_ARRAY.id(), p.getCurrentTokenId());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.hasTokenId(JsonToken.VALUE_TRUE.id()));
    }

    @Test
    public void testNextFieldNameMatchAndValue() throws Exception {
        UTF8StreamJsonParser p = utf8("{\"key\":1}");
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("key", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
    }

    @Test
    public void testNextTextValueAfterName() throws Exception {
        ReaderBasedJsonParser p = parser("{\"a\":\"v\"}");
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("v", p.nextTextValue());
        assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken());
    }

    @Test
    public void testNextIntValueAfterName() throws Exception {
        ReaderBasedJsonParser p = parser("{\"n\":7}");
        p.nextToken();
        assertEquals(7, p.nextIntValue(-1));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
    }

    @Test
    public void testNextLongValueDefaultForNonInteger() throws Exception {
        ReaderBasedJsonParser p = parser("{\"n\":true}");
        p.nextToken();
        assertEquals(9L, p.nextLongValue(9L));
        assertEquals(JsonToken.VALUE_TRUE, p.getCurrentToken());
    }

    @Test
    public void testNextBooleanValueBothBooleanValues() throws Exception {
        ReaderBasedJsonParser p = parser("{\"a\":true,\"b\":false}");
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
    }

    @Test
    public void testCodecRoundTripAndInputSource() throws Exception {
        Reader reader = new StringReader("null");
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(),
                reader, null, CharsToNameCanonicalizer.createRoot().makeChild(0));
        assertSame(reader, p.getInputSource());
        assertNull(p.getCodec());
        p.setCodec(null);
        assertNull(p.getCodec());
    }

    @Test
    public void testGrowArrayByPreservesAndExtends() throws Exception {
        int[] values = UTF8StreamJsonParser.growArrayBy(new int[] {3, 4}, 2);
        assertEquals(4, values.length);
        assertEquals(3, values[0]);
        assertEquals(4, values[1]);
        assertEquals(0, values[2]);
    }

    private ReaderBasedJsonParser parser(String json) {
        Reader reader = new StringReader(json);
        IOContext ctxt = new IOContext(new BufferRecycler(), reader, false);
        return new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(),
                reader, null, CharsToNameCanonicalizer.createRoot().makeChild(0));
    }

    private UTF8StreamJsonParser utf8(String json) {
        byte[] bytes = json.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(bytes);
        IOContext ctxt = new IOContext(new BufferRecycler(), input, false);
        return new UTF8StreamJsonParser(ctxt, JsonParser.Feature.collectDefaults(),
                input, null, ByteQuadsCanonicalizer.createRoot().makeChild(0),
                bytes, 0, bytes.length, false);
    }
}
```