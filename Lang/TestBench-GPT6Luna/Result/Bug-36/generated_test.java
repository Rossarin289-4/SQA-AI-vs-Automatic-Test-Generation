package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {
    @Test
    public void testToIntDefaultOnNullAndEmpty() throws Exception {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToLongValidAndInvalid() throws Exception {
        assertEquals(42L, NumberUtils.toLong("42"));
        assertEquals(0L, NumberUtils.toLong(" 42"));
    }

    @Test
    public void testToFloatValidAndInvalid() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 1e-6);
        assertEquals(0.0f, NumberUtils.toFloat("bad"), 0.0);
    }

    @Test
    public void testToDoubleValidAndInvalid() throws Exception {
        assertEquals(2.25, NumberUtils.toDouble("2.25"), 1e-12);
        assertEquals(0.0, NumberUtils.toDouble("bad"), 0.0);
    }

    @Test
    public void testToByteRangeEdges() throws Exception {
        assertEquals((byte) 127, NumberUtils.toByte("127"));
        assertEquals((byte) 0, NumberUtils.toByte("128"));
        assertEquals((byte) -128, NumberUtils.toByte("-128"));
        assertEquals((byte) 0, NumberUtils.toByte("-129"));
    }

    @Test
    public void testToShortRangeEdges() throws Exception {
        assertEquals((short) 32767, NumberUtils.toShort("32767"));
        assertEquals((short) 0, NumberUtils.toShort("32768"));
        assertEquals((short) -32768, NumberUtils.toShort("-32768"));
        assertEquals((short) 0, NumberUtils.toShort("-32769"));
    }

    @Test
    public void testCreateNumberIntegerBoundaries() throws Exception {
        assertEquals(Integer.valueOf(2147483647), NumberUtils.createNumber("2147483647"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
    }

    @Test
    public void testCreateNumberHexadecimalAndLeadingZero() throws Exception {
        assertEquals(Integer.valueOf(16), NumberUtils.createNumber("0x10"));
        assertEquals(Integer.valueOf(8), NumberUtils.createNumber("010"));
    }

    @Test
    public void testCreateNumberDecimalAndExponent() throws Exception {
        assertEquals(Float.valueOf(1.25f), NumberUtils.createNumber("1.25"));
        assertEquals(Float.valueOf(1000.0f), NumberUtils.createNumber("1E3"));
    }

    @Test
    public void testCreateNumberNullBlankAndRepeatedSign() throws Exception {
        assertNull(NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber(" ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateFloatNullAndValue() throws Exception {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(1.25f, NumberUtils.createFloat("1.25"), 1e-6);
    }

    @Test
    public void testCreateDoubleNullAndValue() throws Exception {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(2.5, NumberUtils.createDouble("2.5"), 1e-12);
    }

    @Test
    public void testCreateIntegerHexAndNull() throws Exception {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xFF"));
    }

    @Test
    public void testCreateLongAndBigInteger() throws Exception {
        assertEquals(Long.valueOf(12L), NumberUtils.createLong("12"));
        assertEquals(new BigInteger("12345678901234567890"),
                NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test
    public void testCreateBigDecimalNullBlankAndValue() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("1.20"), NumberUtils.createBigDecimal("1.20"));
        try {
            NumberUtils.createBigDecimal("");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testLongArrayMinimumAndMaximum() throws Exception {
        long[] values = { 8L, -3L, 5L };
        assertEquals(-3L, NumberUtils.min(values));
        assertEquals(8L, NumberUtils.max(values));
    }

    @Test
    public void testLongArraySingleElementExtrema() throws Exception {
        long[] values = { Long.MIN_VALUE };
        assertEquals(Long.MIN_VALUE, NumberUtils.min(values));
        assertEquals(Long.MIN_VALUE, NumberUtils.max(values));
    }

    @Test
    public void testIsDigitsNullEmptyAndContent() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("123"));
        assertFalse(NumberUtils.isDigits("12a"));
    }

    @Test
    public void testIsNumberIntegerAndHexForms() throws Exception {
        assertTrue(NumberUtils.isNumber("-12"));
        assertTrue(NumberUtils.isNumber("0xAF"));
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumberDecimalExponentAndSuffix() throws Exception {
        assertTrue(NumberUtils.isNumber("1.5"));
        assertTrue(NumberUtils.isNumber("1E-2"));
        assertTrue(NumberUtils.isNumber("12L"));
        assertFalse(NumberUtils.isNumber("1E"));
    }

    @Test
    public void testIsNumberRejectsMalformedForms() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber(" 1"));
    }
}
