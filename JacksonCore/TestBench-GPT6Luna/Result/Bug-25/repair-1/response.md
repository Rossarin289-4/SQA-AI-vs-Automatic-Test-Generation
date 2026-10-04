```java
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

public class ReaderBasedJsonParserTest {
    private ReaderBasedJsonParser parser(String json) {
        IOContext ctxt = new IOContext(new BufferRecycler(), json, false);
        return new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(),
                new StringReader(json), null, CharsToNameCanonicalizer.createRoot());
    }

    @Test
    public void testReleaseBuffered() throws Exception {
        ReaderBasedJsonParser p = parser("true");
        StringWriter w = new StringWriter();
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(0, p.releaseBuffered(w));
    }

    @Test
    public void testTextBeforeToken() throws Exception {
        assertNull(parser("null").getText());
    }

    @Test
    public void testValueAsStringForText() throws Exception {
        ReaderBasedJsonParser p = parser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getValueAsString());
    }

    @Test
    public void testValueAsStringDefaultOnNumber() throws Exception {
        ReaderBasedJsonParser p = parser("7");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("fallback", p.getValueAsString("fallback"));
    }

    @Test
    public void testTextCharactersForTrue() throws Exception {
        ReaderBasedJsonParser p = parser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals("true", new String(p.getTextCharacters(), 0, p.getTextLength()));
    }

    @Test
    public void testTextLengthForString() throws Exception {
        ReaderBasedJsonParser p = parser("\"abc\"");
        p.nextToken();
        assertEquals(3, p.getTextLength());
    }

    @Test
    public void testTextOffsetForTokenWithoutTextBuffer() throws Exception {
        ReaderBasedJsonParser p = parser("false");
        p.nextToken();
        assertEquals(0, p.getTextOffset());
    }

    @Test
    public void testBinaryValueFromBase64String() throws Exception {
        ReaderBasedJsonParser p = parser("\"AQID\"");
        p.nextToken();
        assertArrayEquals(new byte[] { 1, 2, 3 }, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testReadBinaryValueFromBase64String() throws Exception {
        ReaderBasedJsonParser p = parser("\"AQID\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(3, p.readBinaryValue(Base64Variants.getDefaultVariant(), out));
        assertArrayEquals(new byte[] { 1, 2, 3 }, out.toByteArray());
    }

    @Test
    public void testNextTokenTraversesObjectAndArray() throws Exception {
        ReaderBasedJsonParser p = parser("{\"a\":[1]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testFinishTokenCompletesString() throws Exception {
        ReaderBasedJsonParser p = parser("\"x\\ny\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.finishToken();
        assertEquals("x\ny", p.getText());
    }

    @Test
    public void testNextFieldNameMatchesName() throws Exception {
        ReaderBasedJsonParser p = parser("{\"key\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertTrue(p.nextFieldName(null));
    }

    @Test
    public void testNextTextValueAfterFieldName() throws Exception {
        ReaderBasedJsonParser p = parser("{\"a\":\"v\"}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("v", p.nextTextValue());
    }

    @Test
    public void testNextIntValueAtIntMaximum() throws Exception {
        ReaderBasedJsonParser p = parser("[2147483647]");
        p.nextToken();
        assertEquals(2147483647, p.nextIntValue(-1));
    }

    @Test
    public void testNextIntValueUsesDefaultForString() throws Exception {
        ReaderBasedJsonParser p = parser("[\"x\"]");
        p.nextToken();
        assertEquals(-9, p.nextIntValue(-9));
    }

    @Test
    public void testNextLongValueAtLongMaximum() throws Exception {
        ReaderBasedJsonParser p = parser("[9223372036854775807]");
        p.nextToken();
        assertEquals(Long.MAX_VALUE, p.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueTrue() throws Exception {
        ReaderBasedJsonParser p = parser("[true]");
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueNullForNumber() throws Exception {
        ReaderBasedJsonParser p = parser("[0]");
        p.nextToken();
        assertNull(p.nextBooleanValue());
    }

    @Test
    public void testTokenLocationAtStart() throws Exception {
        ReaderBasedJsonParser p = parser("true");
        p.nextToken();
        assertEquals(0L, p.getTokenLocation().getCharOffset());
    }

    @Test
    public void testCurrentLocationAfterTrue() throws Exception {
        ReaderBasedJsonParser p = parser("true");
        p.nextToken();
        assertEquals(4L, p.getCurrentLocation().getCharOffset());
    }

    @Test
    public void testIntOneBeyondMaximumRejected() throws Exception {
        ReaderBasedJsonParser p = parser("[2147483648]");
        p.nextToken();
        try {
            p.nextIntValue(-1);
            fail("expected exception");
        } catch (JsonParseException expected) { }
    }

    @Test
    public void testLongOneBeyondMaximumRejected() throws Exception {
        ReaderBasedJsonParser p = parser("[9223372036854775808]");
        p.nextToken();
        try {
            p.nextLongValue(-1L);
            fail("expected exception");
        } catch (JsonParseException expected) { }
    }
}
```