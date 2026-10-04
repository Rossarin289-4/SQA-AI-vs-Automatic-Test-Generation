package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {
    @Test
    public void testToIntDefaultAndBoundaries() throws Exception {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(Integer.MAX_VALUE, NumberUtils.toInt("2147483647"));
        assertEquals(17, NumberUtils.toInt("2147483648", 17));
        assertEquals(Integer.MIN_VALUE, NumberUtils.toInt("-2147483648"));
        assertEquals(17, NumberUtils.toInt("-2147483649", 17));
    }

    @Test
    public void testToLongBoundaries() throws Exception {
        assertEquals(Long.MAX_VALUE, NumberUtils.toLong("9223372036854775807"));
        assertEquals(19L, NumberUtils.toLong("9223372036854775808", 19L));
        assertEquals(Long.MIN_VALUE, NumberUtils.toLong("-9223372036854775808"));
        assertEquals(19L, NumberUtils.toLong("-9223372036854775809", 19L));
    }

    @Test
    public void testToFloatDefaultAndParsing() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
        assertEquals(1.25f, NumberUtils.toFloat("1.25"), 0.0f);
        assertEquals(2.5f, NumberUtils.toFloat("bad", 2.5f), 0.0f);
    }

    @Test
    public void testToDoubleDefaultAndParsing() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
        assertEquals(1.25d, NumberUtils.toDouble("1.25"), 0.0d);
        assertEquals(2.5d, NumberUtils.toDouble("bad", 2.5d), 0.0d);
    }

    @Test
    public void testToByteBoundaries() throws Exception {
        assertEquals(Byte.MAX_VALUE, NumberUtils.toByte("127"));
        assertEquals((byte) 9, NumberUtils.toByte("128", (byte) 9));
        assertEquals(Byte.MIN_VALUE, NumberUtils.toByte("-128"));
        assertEquals((byte) 9, NumberUtils.toByte("-129", (byte) 9));
    }

    @Test
    public void testToShortBoundaries() throws Exception {
        assertEquals(Short.MAX_VALUE, NumberUtils.toShort("32767"));
        assertEquals((short) 9, NumberUtils.toShort("32768", (short) 9));
        assertEquals(Short.MIN_VALUE, NumberUtils.toShort("-32768"));
        assertEquals((short) 9, NumberUtils.toShort("-32769", (short) 9));
    }

    @Test
    public void testCreateNumberNullAndBlank() throws Exception {
        assertEquals(null, NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber(" ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateNumberIntegerLongAndBigIntegerBoundaries() throws Exception {
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), NumberUtils.createNumber("2147483647"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE),
                NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void testCreateNumberHexLeadingZeroAndSuffix() throws Exception {
        assertEquals(Integer.valueOf(16), NumberUtils.createNumber("0x10"));
        assertEquals(Integer.valueOf(8), NumberUtils.createNumber("010"));
        assertEquals(Long.valueOf(12L), NumberUtils.createNumber("12L"));
    }

    @Test
    public void testCreateNumberDecimalExponentAndInvalidInput() throws Exception {
        assertEquals(Float.valueOf(1.25f), NumberUtils.createNumber("1.25"));
        assertEquals(new BigDecimal("1e100"), NumberUtils.createNumber("1e100"));
        try {
            NumberUtils.createNumber("1 ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateFloatNullAndValue() throws Exception {
        assertEquals(null, NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test
    public void testCreateDoubleNullAndValue() throws Exception {
        assertEquals(null, NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
    }

    @Test
    public void testCreateIntegerHexAndNull() throws Exception {
        assertEquals(null, NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));
    }

    @Test
    public void testCreateLongNullAndValue() throws Exception {
        assertEquals(null, NumberUtils.createLong(null));
        assertEquals(Long.valueOf(-12L), NumberUtils.createLong("-12"));
    }

    @Test
    public void testCreateBigIntegerNullAndValue() throws Exception {
        assertEquals(null, NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("12345678901234567890"),
                NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test
    public void testCreateBigDecimalNullAndValue() throws Exception {
        assertEquals(null, NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("1.25"), NumberUtils.createBigDecimal("1.25"));
    }

    @Test
    public void testMinLongArray() throws Exception {
        assertEquals(-5L, NumberUtils.min(new long[] { 3L, -5L, 8L }));
        assertEquals(Long.MIN_VALUE, NumberUtils.min(new long[] { Long.MAX_VALUE, Long.MIN_VALUE }));
    }

    @Test
    public void testMaxLongArray() throws Exception {
        assertEquals(8L, NumberUtils.max(new long[] { 3L, -5L, 8L }));
        assertEquals(Long.MAX_VALUE, NumberUtils.max(new long[] { Long.MIN_VALUE, Long.MAX_VALUE }));
    }

    @Test
    public void testMinLongArrayRejectsEmpty() throws Exception {
        try {
            NumberUtils.min(new long[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testIsDigitsForms() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("123"));
        assertFalse(NumberUtils.isDigits("12a"));
    }

    @Test
    public void testIsNumberHexAndInvalidPrefix() throws Exception {
        assertTrue(NumberUtils.isNumber("0x1f"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertTrue(NumberUtils.isNumber("-0xA"));
    }

    @Test
    public void testIsNumberDecimalExponentAndSuffix() throws Exception {
        assertTrue(NumberUtils.isNumber("1."));
        assertTrue(NumberUtils.isNumber("1E-2"));
        assertTrue(NumberUtils.isNumber("12L"));
        assertFalse(NumberUtils.isNumber("1E"));
        assertFalse(NumberUtils.isNumber("1.2L"));
    }
}
