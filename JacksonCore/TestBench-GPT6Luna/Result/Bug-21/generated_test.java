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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testFilterAndInitialMatchCount() throws Exception {
        TokenFilter filter = new TokenFilter();
        JsonParser parser = new JsonFactory().createParser("1");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, filter, false, true);
        assertSame(filter, filtered.getFilter());
        assertEquals(0, filtered.getMatchCount());
    }

    @Test
    public void testNoCurrentTokenState() throws Exception {
        JsonParser parser = new JsonFactory().createParser("1");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        assertNull(filtered.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, filtered.getCurrentTokenId());
        assertFalse(filtered.hasCurrentToken());
        assertTrue(filtered.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertNull(filtered.getLastClearedToken());
    }

    @Test
    public void testIncludeAllScalarAndClearCurrentToken() throws Exception {
        JsonParser parser = new JsonFactory().createParser("7");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtered.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtered.currentToken());
        assertTrue(filtered.hasToken(JsonToken.VALUE_NUMBER_INT));
        assertEquals(JsonToken.VALUE_NUMBER_INT.id(), filtered.currentTokenId());
        assertEquals(7, filtered.getIntValue());
        filtered.clearCurrentToken();
        assertNull(filtered.getCurrentToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtered.getLastClearedToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, filtered.getCurrentTokenId());
    }

    @Test
    public void testIncludeAllObjectTraversalAndContextName() throws Exception {
        JsonParser parser = new JsonFactory().createParser("{\"a\":1}");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_OBJECT, filtered.nextToken());
        assertTrue(filtered.isExpectedStartObjectToken());
        assertEquals(JsonToken.FIELD_NAME, filtered.nextToken());
        assertEquals("a", filtered.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtered.nextToken());
        assertEquals(1, filtered.getIntValue());
        assertEquals(JsonToken.END_OBJECT, filtered.nextToken());
    }

    @Test
    public void testNextValueSkipsFieldName() throws Exception {
        JsonParser parser = new JsonFactory().createParser("{\"x\":2}");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_OBJECT, filtered.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtered.nextValue());
        assertEquals(2, filtered.getIntValue());
    }

    @Test
    public void testSkipChildrenConsumesNestedContainer() throws Exception {
        JsonParser parser = new JsonFactory().createParser("[[1],2]");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_ARRAY, filtered.nextToken());
        assertSame(filtered, filtered.skipChildren());
        assertEquals(JsonToken.END_ARRAY, filtered.getCurrentToken());
        assertNull(filtered.nextToken());
    }

    @Test
    public void testOverrideCurrentNameThrows() throws Exception {
        JsonParser parser = new JsonFactory().createParser("null");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        try {
            filtered.overrideCurrentName("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGetParsingContextInitiallyRoot() throws Exception {
        JsonParser parser = new JsonFactory().createParser("1");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        assertNotNull(filtered.getParsingContext());
    }

    @Test
    public void testGetBigIntegerValue() throws Exception {
        JsonParser parser = new JsonFactory().createParser("2147483648");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtered.nextToken());
        assertEquals(new BigInteger("2147483648"), filtered.getBigIntegerValue());
    }

    @Test
    public void testGetLongValueAtMaximum() throws Exception {
        JsonParser parser = new JsonFactory().createParser("9223372036854775807");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        filtered.nextToken();
        assertEquals(Long.MAX_VALUE, filtered.getLongValue());
    }

    @Test
    public void testGetDecimalValue() throws Exception {
        JsonParser parser = new JsonFactory().createParser("1.25");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        filtered.nextToken();
        assertEquals(new BigDecimal("1.25"), filtered.getDecimalValue());
    }

    @Test
    public void testGetFloatingPointValues() throws Exception {
        JsonParser parser = new JsonFactory().createParser("1.5");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        filtered.nextToken();
        assertEquals(1.5, filtered.getDoubleValue(), 1e-9);
        assertEquals(1.5f, filtered.getFloatValue(), 1e-6f);
    }

    @Test
    public void testGetNumberTypeAndNumberValue() throws Exception {
        JsonParser parser = new JsonFactory().createParser("3");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        filtered.nextToken();
        assertEquals(JsonParser.NumberType.INT, filtered.getNumberType());
        assertEquals(3, filtered.getNumberValue().intValue());
    }

    @Test
    public void testBooleanValue() throws Exception {
        JsonParser parser = new JsonFactory().createParser("true");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        filtered.nextToken();
        assertTrue(filtered.getBooleanValue());
    }

    @Test
    public void testByteValueMaximum() throws Exception {
        JsonParser parser = new JsonFactory().createParser("127");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        filtered.nextToken();
        assertEquals((byte) 127, filtered.getByteValue());
    }

    @Test
    public void testShortValueMaximum() throws Exception {
        JsonParser parser = new JsonFactory().createParser("32767");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        filtered.nextToken();
        assertEquals((short) 32767, filtered.getShortValue());
    }

    @Test
    public void testLongValueMinimum() throws Exception {
        JsonParser parser = new JsonFactory().createParser("-9223372036854775808");
        FilteringParserDelegate filtered =
                new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, true);
        filtered.nextToken();
        assertEquals(Long.MIN_VALUE, filtered.getLongValue());
    }
}
