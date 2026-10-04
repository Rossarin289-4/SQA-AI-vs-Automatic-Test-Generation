package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {
    @Test
    public void testToIntDefaultAndRange() throws Exception {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(Integer.MAX_VALUE, NumberUtils.toInt("2147483647"));
        assertEquals(0, NumberUtils.toInt("2147483648"));
    }

    @Test
    public void testToLongDefaultAndRange() throws Exception {
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(Long.MAX_VALUE, NumberUtils.toLong("9223372036854775807"));
        assertEquals(0L, NumberUtils.toLong("9223372036854775808"));
    }

    @Test
    public void testToFloatParsingAndFallback() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 1e-6f);
        assertEquals(0.0f, NumberUtils.toFloat("bad"), 0.0f);
    }

    @Test
    public void testToDoubleParsingAndFallback() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 1e-12d);
        assertEquals(0.0d, NumberUtils.toDouble("bad"), 0.0d);
    }

    @Test
    public void testToByteLimitsAndInvalid() throws Exception {
        assertEquals((byte) 127, NumberUtils.toByte("127"));
        assertEquals((byte) 0, NumberUtils.toByte("128"));
        assertEquals((byte) -128, NumberUtils.toByte("-128"));
        assertEquals((byte) 0, NumberUtils.toByte("-129"));
    }

    @Test
    public void testToShortLimitsAndInvalid() throws Exception {
        assertEquals((short) 32767, NumberUtils.toShort("32767"));
        assertEquals((short) 0, NumberUtils.toShort("32768"));
        assertEquals((short) -32768, NumberUtils.toShort("-32768"));
        assertEquals((short) 0, NumberUtils.toShort("-32769"));
    }

    @Test
    public void testCreateNumberIntegerRangeAndHex() throws Exception {
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), NumberUtils.createNumber("2147483647"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(Integer.valueOf(26), NumberUtils.createNumber("0x1A"));
    }

    @Test
    public void testCreateNumberDecimalAndExponent() throws Exception {
        assertEquals(Float.valueOf(1.25f), NumberUtils.createNumber("1.25"));
        assertEquals(Float.valueOf(1000.0f), NumberUtils.createNumber("1E3"));
    }

    @Test
    public void testCreateNumberNullBlankAndMalformed() throws Exception {
        assertNull(NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber(" ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
        try {
            NumberUtils.createNumber("1x");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testCreateFloatNullAndValue() throws Exception {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.25f), NumberUtils.createFloat("1.25"));
    }

    @Test
    public void testCreateDoubleNullAndValue() throws Exception {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(2.5d), NumberUtils.createDouble("2.5"));
    }

    @Test
    public void testCreateIntegerDecodeForms() throws Exception {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(127), NumberUtils.createInteger("0177"));
        assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xFF"));
    }

    @Test
    public void testCreateLongRange() throws Exception {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(Long.MAX_VALUE), NumberUtils.createLong("9223372036854775807"));
        try {
            NumberUtils.createLong("9223372036854775808");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testCreateBigInteger() throws Exception {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("12345678901234567890"),
                NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test
    public void testCreateBigDecimal() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("1.25"), NumberUtils.createBigDecimal("1.25"));
        try {
            NumberUtils.createBigDecimal("");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testMinLongArray() throws Exception {
        assertEquals(-9L, NumberUtils.min(new long[] {4L, -9L, 2L}));
        assertEquals(Long.MIN_VALUE, NumberUtils.min(new long[] {0L, Long.MIN_VALUE}));
    }

    @Test
    public void testMaxLongArray() throws Exception {
        assertEquals(7L, NumberUtils.max(new long[] {-4L, 7L, 2L}));
        assertEquals(Long.MAX_VALUE, NumberUtils.max(new long[] {0L, Long.MAX_VALUE}));
    }

    @Test
    public void testIsDigitsBoundaries() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("123"));
        assertFalse(NumberUtils.isDigits("12a"));
    }

    @Test
    public void testIsNumberFormsAndBoundaries() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertTrue(NumberUtils.isNumber("0xFF"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertTrue(NumberUtils.isNumber("1."));
        assertTrue(NumberUtils.isNumber("1E-2"));
        assertFalse(NumberUtils.isNumber("1E"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertFalse(NumberUtils.isNumber("1E2L"));
    }
}
