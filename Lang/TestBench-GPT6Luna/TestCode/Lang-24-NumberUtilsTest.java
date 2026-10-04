package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {
    @Test
    public void testToIntDefaultsAndRange() throws Exception {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(17, NumberUtils.toInt("", 17));
        assertEquals(Integer.MAX_VALUE, NumberUtils.toInt("2147483647", 17));
        assertEquals(17, NumberUtils.toInt("2147483648", 17));
    }

    @Test
    public void testToLongDefaultsAndRange() throws Exception {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(19L, NumberUtils.toLong("", 19L));
        assertEquals(Long.MAX_VALUE, NumberUtils.toLong("9223372036854775807", 19L));
        assertEquals(19L, NumberUtils.toLong("9223372036854775808", 19L));
    }

    @Test
    public void testToFloatParsingAndFallback() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 7f), 1e-6f);
        assertEquals(7f, NumberUtils.toFloat("bad", 7f), 1e-6f);
        assertEquals(7f, NumberUtils.toFloat(null, 7f), 1e-6f);
    }

    @Test
    public void testToDoubleParsingAndFallback() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 7d), 1e-12);
        assertEquals(7d, NumberUtils.toDouble("bad", 7d), 1e-12);
        assertEquals(7d, NumberUtils.toDouble(null, 7d), 1e-12);
    }

    @Test
    public void testToByteAtBounds() throws Exception {
        assertEquals(Byte.MIN_VALUE, NumberUtils.toByte("-128", (byte) 9));
        assertEquals(Byte.MAX_VALUE, NumberUtils.toByte("127", (byte) 9));
        assertEquals((byte) 9, NumberUtils.toByte("128", (byte) 9));
        assertEquals((byte) 9, NumberUtils.toByte("-129", (byte) 9));
    }

    @Test
    public void testToShortAtBounds() throws Exception {
        assertEquals(Short.MIN_VALUE, NumberUtils.toShort("-32768", (short) 9));
        assertEquals(Short.MAX_VALUE, NumberUtils.toShort("32767", (short) 9));
        assertEquals((short) 9, NumberUtils.toShort("32768", (short) 9));
        assertEquals((short) 9, NumberUtils.toShort("-32769", (short) 9));
    }

    @Test
    public void testCreateNumberIntegerLongAndBigIntegerEdges() throws Exception {
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), NumberUtils.createNumber("2147483647"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(Long.valueOf(Long.MAX_VALUE), NumberUtils.createNumber("9223372036854775807"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void testCreateNumberDecimalAndExponent() throws Exception {
        assertEquals(Float.valueOf(1.25f), NumberUtils.createNumber("1.25"));
        assertEquals(1000.0d, NumberUtils.createNumber("1E3").doubleValue(), 0.0d);
        assertEquals(0.0d, NumberUtils.createNumber("0.0").doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumberHexLeadingZeroAndSuffix() throws Exception {
        assertEquals(Integer.valueOf(16), NumberUtils.createNumber("0x10"));
        assertEquals(Integer.valueOf(8), NumberUtils.createNumber("010"));
        assertEquals(Long.valueOf(12L), NumberUtils.createNumber("12L"));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5F"));
    }

    @Test
    public void testCreateNumberNullBlankAndMalformed() throws Exception {
        assertNull(NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber(" ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
        assertNull(NumberUtils.createNumber("--1"));
        try {
            NumberUtils.createNumber("1 ");
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
        assertEquals(Double.valueOf(1.25d), NumberUtils.createDouble("1.25"));
    }

    @Test
    public void testCreateIntegerHexAndNull() throws Exception {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xFF"));
    }

    @Test
    public void testCreateLongNullAndValue() throws Exception {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(-12L), NumberUtils.createLong("-12"));
    }

    @Test
    public void testCreateBigIntegerNullAndValue() throws Exception {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("12345678901234567890"),
                NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test
    public void testCreateBigDecimalNullAndValue() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("1.25"), NumberUtils.createBigDecimal("1.25"));
    }

    @Test
    public void testCreateBigDecimalRejectsBlank() throws Exception {
        try {
            NumberUtils.createBigDecimal(" ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testMinLongArray() throws Exception {
        assertEquals(-7L, NumberUtils.min(new long[] { 3L, -7L, 5L }));
        assertEquals(Long.MIN_VALUE, NumberUtils.min(new long[] { 0L, Long.MIN_VALUE }));
    }

    @Test
    public void testMaxLongArray() throws Exception {
        assertEquals(9L, NumberUtils.max(new long[] { 3L, -7L, 9L }));
        assertEquals(Long.MAX_VALUE, NumberUtils.max(new long[] { 0L, Long.MAX_VALUE }));
    }

    @Test
    public void testIsDigitsBoundaries() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("0123"));
        assertFalse(NumberUtils.isDigits("12a"));
    }

    @Test
    public void testIsNumberFormsAndInvalidEdges() throws Exception {
        assertTrue(NumberUtils.isNumber("-12"));
        assertTrue(NumberUtils.isNumber("0xFF"));
        assertTrue(NumberUtils.isNumber("1.2E-3"));
        assertTrue(NumberUtils.isNumber("12L"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("1E"));
        assertFalse(NumberUtils.isNumber("1..2"));
        assertFalse(NumberUtils.isNumber(""));
    }
}
