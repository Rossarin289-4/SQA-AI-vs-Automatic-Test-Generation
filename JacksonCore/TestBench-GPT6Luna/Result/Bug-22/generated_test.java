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
    public void testInitialState() throws Exception {
        JsonParser parser = new JsonFactory().createParser("1");
        TokenFilter filter = new TokenFilter();
        FilteringParserDelegate filtering =
                new FilteringParserDelegate(parser, filter, false, false);
        assertSame(filter, filtering.getFilter());
        assertEquals(0, filtering.getMatchCount());
        assertNull(filtering.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, filtering.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, filtering.currentTokenId());
        assertFalse(filtering.hasCurrentToken());
        assertTrue(filtering.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(filtering.hasToken(JsonToken.VALUE_NUMBER_INT));
        assertNull(filtering.getLastClearedToken());
    }

    @Test
    public void testScalarInclusion() throws Exception {
        JsonParser parser = new JsonFactory().createParser("7");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(7, filtering.getIntValue());
        assertEquals(1, filtering.getMatchCount());
        assertNull(filtering.nextToken());
    }

    @Test
    public void testMultipleRootScalars() throws Exception {
        JsonParser parser = new JsonFactory().createParser("1 2");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(1, filtering.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(2, filtering.getIntValue());
        assertEquals(0, filtering.getMatchCount());
    }

    @Test
    public void testIncludedObjectAndFields() throws Exception {
        JsonParser parser = new JsonFactory().createParser("{\"a\":1}");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.START_OBJECT, filtering.nextToken());
        assertTrue(filtering.isExpectedStartObjectToken());
        assertEquals(JsonToken.FIELD_NAME, filtering.nextToken());
        assertEquals("a", filtering.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(1, filtering.getIntValue());
        assertEquals(JsonToken.END_OBJECT, filtering.nextToken());
        assertNull(filtering.nextToken());
    }

    @Test
    public void testFilterOutRootValue() throws Exception {
        JsonParser parser = new JsonFactory().createParser("1");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, null, false, false);
        assertNull(filtering.nextToken());
        assertEquals(0, filtering.getMatchCount());
    }

    @Test
    public void testNextValueSkipsFieldName() throws Exception {
        JsonParser parser = new JsonFactory().createParser("{\"a\":3}");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.START_OBJECT, filtering.nextToken());
        assertEquals(JsonToken.FIELD_NAME, filtering.nextValue());
        assertEquals("a", filtering.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextValue());
        assertEquals(3, filtering.getIntValue());
    }

    @Test
    public void testClearCurrentToken() throws Exception {
        JsonParser parser = new JsonFactory().createParser("4");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        filtering.clearCurrentToken();
        assertNull(filtering.getCurrentToken());
        assertFalse(filtering.hasCurrentToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.getLastClearedToken());
        assertTrue(filtering.hasTokenId(JsonTokenId.ID_NO_TOKEN));
    }

    @Test
    public void testTokenIdAndTokenPredicates() throws Exception {
        JsonParser parser = new JsonFactory().createParser("[0]");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.START_ARRAY, filtering.nextToken());
        assertTrue(filtering.hasToken(JsonToken.START_ARRAY));
        assertTrue(filtering.hasTokenId(JsonTokenId.ID_START_ARRAY));
        assertTrue(filtering.isExpectedStartArrayToken());
        assertFalse(filtering.isExpectedStartObjectToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertFalse(filtering.isExpectedStartArrayToken());
    }

    @Test
    public void testOverrideCurrentNameThrows() throws Exception {
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                new JsonFactory().createParser("null"), TokenFilter.INCLUDE_ALL,
                false, false);
        try {
            filtering.overrideCurrentName("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertNull(filtering.getCurrentToken());
        }
    }

    @Test
    public void testSkipChildren() throws Exception {
        JsonParser parser = new JsonFactory().createParser("[1,{\"a\":2},3]");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.START_ARRAY, filtering.nextToken());
        assertSame(filtering, filtering.skipChildren());
        assertEquals(JsonToken.END_ARRAY, filtering.getCurrentToken());
        assertNull(filtering.nextToken());
    }

    @Test
    public void testNumericDelegationForIntEdges() throws Exception {
        JsonParser parser = new JsonFactory().createParser("[2147483647,-2147483648]");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_ARRAY, filtering.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(Integer.MAX_VALUE, filtering.getIntValue());
        assertEquals(Integer.MAX_VALUE, filtering.getBigIntegerValue().intValue());
        assertEquals(JsonParser.NumberType.INT, filtering.getNumberType());
        assertEquals(Integer.MAX_VALUE, filtering.getNumberValue().intValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(Integer.MIN_VALUE, filtering.getIntValue());
        assertEquals(Integer.MIN_VALUE, filtering.getBigIntegerValue().intValue());
    }

    @Test
    public void testNumericDelegationForLongEdges() throws Exception {
        JsonParser parser = new JsonFactory().createParser(
                "[9223372036854775807,-9223372036854775808]");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_ARRAY, filtering.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(Long.MAX_VALUE, filtering.getLongValue());
        assertEquals(Long.MAX_VALUE, filtering.getBigIntegerValue().longValue());
        assertEquals(JsonParser.NumberType.LONG, filtering.getNumberType());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(Long.MIN_VALUE, filtering.getLongValue());
        assertEquals(Long.MIN_VALUE, filtering.getBigIntegerValue().longValue());
    }

    @Test
    public void testBigIntegerBeyondLongRange() throws Exception {
        JsonParser parser = new JsonFactory().createParser("9223372036854775808");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(new BigInteger("9223372036854775808"),
                filtering.getBigIntegerValue());
    }

    @Test
    public void testDecimalAccessors() throws Exception {
        JsonParser parser = new JsonFactory().createParser("1.25");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, filtering.nextToken());
        assertEquals(new BigDecimal("1.25"), filtering.getDecimalValue());
        assertEquals(JsonParser.NumberType.DOUBLE, filtering.getNumberType());
        assertEquals(1.25, filtering.getDoubleValue(), 1e-9);
        assertEquals(1.25f, filtering.getFloatValue(), 1e-6);
    }

    @Test
    public void testBooleanAccessor() throws Exception {
        JsonParser parser = new JsonFactory().createParser("true");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_TRUE, filtering.nextToken());
        assertTrue(filtering.getBooleanValue());
    }

    @Test
    public void testByteValueAtMaximum() throws Exception {
        JsonParser parser = new JsonFactory().createParser("127");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals((byte) 127, filtering.getByteValue());
    }

    @Test
    public void testShortValueAtMinimum() throws Exception {
        JsonParser parser = new JsonFactory().createParser("-32768");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals((short) -32768, filtering.getShortValue());
    }

    @Test
    public void testGetParsingContext() throws Exception {
        JsonParser parser = new JsonFactory().createParser("[1]");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        JsonStreamContext initial = filtering.getParsingContext();
        assertNotNull(initial);
        assertEquals(JsonToken.START_ARRAY, filtering.nextToken());
        assertEquals(1, filtering.getParsingContext().getEntryCount());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(1, filtering.getParsingContext().getEntryCount());
    }

    @Test
    public void testCurrentNameForObjectValue() throws Exception {
        JsonParser parser = new JsonFactory().createParser("{\"key\":9}");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.START_OBJECT, filtering.nextToken());
        assertEquals(JsonToken.FIELD_NAME, filtering.nextToken());
        assertEquals("key", filtering.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals("key", filtering.getCurrentName());
    }

    @Test
    public void testIncludePathForMatchingNestedValue() throws Exception {
        JsonParser parser = new JsonFactory().createParser("{\"a\":{\"b\":2}}");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, true, false);
        assertEquals(JsonToken.START_OBJECT, filtering.nextToken());
        assertEquals(JsonToken.FIELD_NAME, filtering.nextToken());
        assertEquals("a", filtering.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, filtering.nextToken());
        assertEquals(JsonToken.FIELD_NAME, filtering.nextToken());
        assertEquals("b", filtering.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtering.nextToken());
        assertEquals(2, filtering.getIntValue());
    }

    @Test
    public void testDecimalNegativeValue() throws Exception {
        JsonParser parser = new JsonFactory().createParser("-0.5");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, filtering.nextToken());
        assertEquals(new BigDecimal("-0.5"), filtering.getDecimalValue());
        assertEquals(-0.5, filtering.getDoubleValue(), 1e-9);
    }

    @Test
    public void testNullTokenDoesNotCountAsMatch() throws Exception {
        JsonParser parser = new JsonFactory().createParser("null");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, null, false, true);
        assertNull(filtering.nextToken());
        assertEquals(0, filtering.getMatchCount());
    }

    @Test
    public void testLastClearedTokenRemainsAfterAnotherClear() throws Exception {
        JsonParser parser = new JsonFactory().createParser("[1]");
        FilteringParserDelegate filtering = new FilteringParserDelegate(
                parser, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.START_ARRAY, filtering.nextToken());
        filtering.clearCurrentToken();
        assertEquals(JsonToken.START_ARRAY, filtering.getLastClearedToken());
        filtering.clearCurrentToken();
        assertEquals(JsonToken.START_ARRAY, filtering.getLastClearedToken());
    }
}
