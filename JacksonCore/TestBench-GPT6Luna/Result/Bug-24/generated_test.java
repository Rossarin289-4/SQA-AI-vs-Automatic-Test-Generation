package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;

public class ParserBaseTest {
    private ReaderBasedJsonParser parser(String json) {
        IOContext ctxt = new IOContext(new com.fasterxml.jackson.core.util.BufferRecycler(), json, false);
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer symbols =
                com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ctxt, JsonParser.Feature.collectDefaults(),
                new StringReader(json), null, symbols);
    }

    private ReaderBasedJsonParser atValue(String json) throws IOException {
        ReaderBasedJsonParser p = parser(json);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        return p;
    }

    @Test
    public void testCurrentValueRoundTrip() throws Exception {
        ReaderBasedJsonParser p = parser("null");
        Object value = new Object();
        p.setCurrentValue(value);
        assertSame(value, p.getCurrentValue());
    }

    @Test
    public void testFeatureEnableDisable() throws Exception {
        ReaderBasedJsonParser p = parser("null");
        p.enable(Feature.STRICT_DUPLICATE_DETECTION);
        assertTrue(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        p.disable(Feature.STRICT_DUPLICATE_DETECTION);
        assertFalse(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testOverrideStandardFeaturesRespectsMask() throws Exception {
        ReaderBasedJsonParser p = parser("null");
        int mask = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        p.overrideStdFeatures(mask, mask);
        assertTrue(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        p.overrideStdFeatures(0, mask);
        assertFalse(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testSetFeatureMask() throws Exception {
        ReaderBasedJsonParser p = parser("null");
        int mask = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        p.setFeatureMask(p.getFeatureMask() | mask);
        assertTrue(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        p.setFeatureMask(p.getFeatureMask() & ~mask);
        assertFalse(p.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testTokenAndCurrentLocations() throws Exception {
        ReaderBasedJsonParser p = parser("  7");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2L, p.getTokenCharacterOffset());
        assertEquals(1, p.getTokenLineNr());
        assertEquals(3, p.getTokenColumnNr());
        assertEquals(2L, p.getTokenLocation().getCharOffset());
        assertEquals(1, p.getTokenLocation().getLineNr());
        assertEquals(4L, p.getCurrentLocation().getCharOffset());
    }

    @Test
    public void testTextCharacterAvailabilityForTokens() throws Exception {
        ReaderBasedJsonParser p = parser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertTrue(p.hasTextCharacters());
        assertEquals("hello", p.getText());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertFalse(p.hasTextCharacters());
    }

    @Test
    public void testBinaryValueFromStringAndCaching() throws Exception {
        ReaderBasedJsonParser p = parser("\"SGk=\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] first = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[] { 72, 105 }, first);
        assertSame(first, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testByteArrayBuilderResetBetweenRequests() throws Exception {
        ReaderBasedJsonParser p = parser("null");
        ByteArrayBuilder builder = p._getByteArrayBuilder();
        builder.append(1);
        assertEquals(1, builder.size());
        assertSame(builder, p._getByteArrayBuilder());
        assertEquals(0, builder.size());
    }

    @Test
    public void testIntRangeEndpoints() throws Exception {
        ReaderBasedJsonParser low = atValue("-2147483648");
        assertEquals(Integer.MIN_VALUE, low.getIntValue());
        ReaderBasedJsonParser high = atValue("2147483647");
        assertEquals(Integer.MAX_VALUE, high.getIntValue());
    }

    @Test
    public void testIntOverflowImmediatelyAboveRange() throws Exception {
        ReaderBasedJsonParser p = atValue("2147483648");
        try {
            p.getIntValue();
            fail("expected InputCoercionException");
        } catch (InputCoercionException expected) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, expected.getInputType());
            assertEquals(Integer.TYPE, expected.getTargetType());
        }
    }

    @Test
    public void testLongRangeEndpoints() throws Exception {
        ReaderBasedJsonParser low = atValue("-9223372036854775808");
        assertEquals(Long.MIN_VALUE, low.getLongValue());
        ReaderBasedJsonParser high = atValue("9223372036854775807");
        assertEquals(Long.MAX_VALUE, high.getLongValue());
    }

    @Test
    public void testBigIntegerBeyondLongRange() throws Exception {
        ReaderBasedJsonParser p = atValue("9223372036854775808");
        assertEquals(new BigInteger("9223372036854775808"), p.getBigIntegerValue());
        assertEquals(JsonParser.NumberType.BIG_INTEGER, p.getNumberType());
    }

    @Test
    public void testDecimalParsingAndConversions() throws Exception {
        ReaderBasedJsonParser p = parser("12.5");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(12.5, p.getDoubleValue(), 1e-9);
        assertEquals(new BigDecimal("12.5"), p.getDecimalValue());
        assertEquals(12, p.getIntValue());
    }

    @Test
    public void testNumberValueForInteger() throws Exception {
        ReaderBasedJsonParser p = atValue("123456789");
        assertEquals(Integer.valueOf(123456789), p.getNumberValue());
        assertEquals(JsonParser.NumberType.INT, p.getNumberType());
    }

    @Test
    public void testFloatValueConversion() throws Exception {
        ReaderBasedJsonParser p = parser("1.25");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.25f, p.getFloatValue(), 1e-6f);
    }

    @Test
    public void testNaNStatusOnlyForNonFiniteNumericToken() throws Exception {
        ReaderBasedJsonParser p = parser("1e999");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(p.getDoubleValue() > Double.MAX_VALUE || p.isNaN());
        assertTrue(p.isNaN());
        ReaderBasedJsonParser ordinary = parser("1.5");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, ordinary.nextToken());
        assertFalse(ordinary.isNaN());
    }

    @Test
    public void testValueCoercionsForBooleansAndNull() throws Exception {
        ReaderBasedJsonParser yes = parser("true");
        assertEquals(JsonToken.VALUE_TRUE, yes.nextToken());
        assertTrue(yes.getValueAsBoolean(false));
        assertEquals(1, yes.getValueAsInt());
        ReaderBasedJsonParser nil = parser("null");
        assertEquals(JsonToken.VALUE_NULL, nil.nextToken());
        assertEquals(0L, nil.getValueAsLong(7L));
        assertEquals(0.0, nil.getValueAsDouble(7.0), 0.0);
    }

    @Test
    public void testValueAsStringForScalarAndContainer() throws Exception {
        ReaderBasedJsonParser text = parser("\"word\"");
        assertEquals(JsonToken.VALUE_STRING, text.nextToken());
        assertEquals("word", text.getValueAsString());
        ReaderBasedJsonParser array = parser("[]");
        assertEquals(JsonToken.START_ARRAY, array.nextToken());
        assertEquals("fallback", array.getValueAsString("fallback"));
    }

    @Test
    public void testNextValueSkipsFieldName() throws Exception {
        ReaderBasedJsonParser p = parser("{\"a\":3}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextValue());
        assertEquals(3, p.getIntValue());
    }

    @Test
    public void testSkipChildrenLeavesParserAtMatchingEnd() throws Exception {
        ReaderBasedJsonParser p = parser("[[1],2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertSame(p, p.skipChildren());
        assertEquals(JsonToken.END_ARRAY, p.currentToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testCurrentNameOverrideAndContainerStartName() throws Exception {
        ReaderBasedJsonParser p = parser("{\"a\":[]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        p.overrideCurrentName("changed");
        assertEquals("changed", p.getCurrentName());
    }

    @Test
    public void testCloseIsIdempotent() throws Exception {
        ReaderBasedJsonParser p = parser("null");
        assertFalse(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
    }
}
