package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonParserDelegate;

public class FilteringParserDelegateTest {
    @Test
    public void testFilterAndInitialMatchCount() throws Exception {
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("1"), filter, false, true);
        assertSame(filter, parser.getFilter());
        assertEquals(0, parser.getMatchCount());
    }

    @Test
    public void testInitialTokenState() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("1"), TokenFilter.INCLUDE_ALL, false, true);
        assertNull(parser.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        assertFalse(parser.hasCurrentToken());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(parser.hasToken(JsonToken.VALUE_NUMBER_INT));
        assertFalse(parser.isExpectedStartArrayToken());
        assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testCurrentTokenStateAfterScalar() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("1"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonTokenId.ID_NUMBER_INT, parser.getCurrentTokenId());
        assertTrue(parser.hasCurrentToken());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NUMBER_INT));
        assertTrue(parser.hasToken(JsonToken.VALUE_NUMBER_INT));
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testClearAndLastClearedToken() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("\"x\""), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertFalse(parser.hasCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, parser.getLastClearedToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
    }

    @Test
    public void testGetCurrentNameOnField() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("{\"a\":1}"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
    }

    @Test
    public void testCurrentNameOnIncludedContainer() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("{\"a\":{}}"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentNameThrows() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("1"), TokenFilter.INCLUDE_ALL, false, true);
        try {
            parser.overrideCurrentName("a");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testIncludeAllTraversesObject() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("{\"a\":1}"), TokenFilter.INCLUDE_ALL, false, true);
        JsonToken[] expected = { JsonToken.START_OBJECT, JsonToken.FIELD_NAME,
                JsonToken.VALUE_NUMBER_INT, JsonToken.END_OBJECT };
        for (JsonToken token : expected) {
            assertEquals(token, parser.nextToken());
        }
        assertNull(parser.nextToken());
    }

    @Test
    public void testIncludeAllTraversesArray() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("[1,2]"), TokenFilter.INCLUDE_ALL, false, true);
        JsonToken[] expected = { JsonToken.START_ARRAY, JsonToken.VALUE_NUMBER_INT,
                JsonToken.VALUE_NUMBER_INT, JsonToken.END_ARRAY };
        for (JsonToken token : expected) {
            assertEquals(token, parser.nextToken());
        }
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextValueSkipsFieldName() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("{\"a\":1}"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextValue());
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testSkipChildrenConsumesContainer() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("[1,{\"a\":2},3]"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertSame(parser, parser.skipChildren());
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testBigIntegerValue() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("2147483648"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(new BigInteger("2147483648"), parser.getBigIntegerValue());
    }

    @Test
    public void testBooleanValue() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("true"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getBooleanValue());
    }

    @Test
    public void testByteValueAtMaximum() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("127"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals((byte) 127, parser.getByteValue());
    }

    @Test
    public void testShortValueAtMaximum() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("32767"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals((short) 32767, parser.getShortValue());
    }

    @Test
    public void testDecimalValue() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("1.25"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(new BigDecimal("1.25"), parser.getDecimalValue());
    }

    @Test
    public void testDoubleValue() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("1.5"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.5, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testFloatValue() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("1.5"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.5f, parser.getFloatValue(), 1e-6);
    }

    @Test
    public void testIntValueAtMaximum() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("2147483647"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
    }

    @Test
    public void testLongValueBeyondIntMaximum() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("2147483648"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2147483648L, parser.getLongValue());
    }

    @Test
    public void testNumberTypeAndNumberValue() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(
                new JsonFactory().createParser("1"), TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        assertEquals(Integer.valueOf(1), parser.getNumberValue());
    }
}
