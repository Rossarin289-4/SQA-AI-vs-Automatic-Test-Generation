package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {
    @Test
    public void testIntegerConversionDefaultsAndEdges() throws Exception {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(17, NumberUtils.toInt(null, 17));
        assertEquals(17, NumberUtils.toInt("", 17));
        assertEquals(Integer.MAX_VALUE, NumberUtils.toInt("2147483647", 17));
        assertEquals(17, NumberUtils.toInt("2147483648", 17));
    }

    @Test
    public void testLongConversionDefaultAndRangeEdges() throws Exception {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(23L, NumberUtils.toLong("", 23L));
        assertEquals(Long.MAX_VALUE, NumberUtils.toLong("9223372036854775807", 23L));
        assertEquals(23L, NumberUtils.toLong("9223372036854775808", 23L));
    }

    @Test
    public void testFloatConversion() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
        assertEquals(2.5f, NumberUtils.toFloat("2.5"), 1e-6f);
        assertEquals(9.0f, NumberUtils.toFloat("bad", 9.0f), 0.0f);
    }

    @Test
    public void testDoubleConversion() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
        assertEquals(-1.25d, NumberUtils.toDouble("-1.25"), 1e-12);
        assertEquals(7.0d, NumberUtils.toDouble("bad", 7.0d), 0.0d);
    }

    @Test
    public void testByteConversionRangeEdges() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 127, NumberUtils.toByte("127", (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("128", (byte) 5));
        assertEquals((byte) -128, NumberUtils.toByte("-128", (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("-129", (byte) 5));
    }

    @Test
    public void testShortConversionRangeEdges() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 32767, NumberUtils.toShort("32767", (short) 4));
        assertEquals((short) 4, NumberUtils.toShort("32768", (short) 4));
        assertEquals((short) -32768, NumberUtils.toShort("-32768", (short) 4));
        assertEquals((short) 4, NumberUtils.toShort("-32769", (short) 4));
    }

    @Test
    public void testCreateNumberIntegralAndOctalCases() throws Exception {
        assertNull(NumberUtils.createNumber(null));
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("10"));
        assertEquals(Integer.valueOf(8), NumberUtils.createNumber("010"));
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), NumberUtils.createNumber("2147483647"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
    }

    @Test
    public void testCreateNumberHexLengthBoundaries() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertEquals(Long.valueOf(4294967296L), NumberUtils.createNumber("0x100000000"));
        assertEquals(new BigInteger("10000000000000000", 16),
                NumberUtils.createNumber("0x10000000000000000"));
    }

    @Test
    public void testCreateNumberDecimalPrecisionBranches() throws Exception {
        assertEquals(Float.valueOf(1.25f), NumberUtils.createNumber("1.25"));
        assertEquals(Double.valueOf(1.12345678d), NumberUtils.createNumber("1.12345678"));
        assertEquals(new BigDecimal("1.12345678901234567"),
                NumberUtils.createNumber("1.12345678901234567"));
    }

    @Test
    public void testCreateNumberSuffixAndInvalidInputs() throws Exception {
        assertEquals(Long.valueOf(12L), NumberUtils.createNumber("12L"));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5F"));
        try {
            NumberUtils.createNumber(" ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testCreateFloatAndDoubleNullAndParsing() throws Exception {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(2.5f), NumberUtils.createFloat("2.5"));
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(-3.25d), NumberUtils.createDouble("-3.25"));
    }

    @Test
    public void testCreateIntegerAndLongDecodeForms() throws Exception {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(63L), NumberUtils.createLong("077"));
    }

    @Test
    public void testCreateBigIntegerRadicesAndSign() throws Exception {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("255"), NumberUtils.createBigInteger("0xFF"));
        assertEquals(new BigInteger("-63"), NumberUtils.createBigInteger("-077"));
        assertEquals(new BigInteger("123"), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigDecimalNullAndExactDecimal() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("1.230"), NumberUtils.createBigDecimal("1.230"));
        try {
            NumberUtils.createBigDecimal("--1");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testLongArrayMinimumAcrossPositions() throws Exception {
        assertEquals(-8L, NumberUtils.min(new long[] {4L, -8L, 2L}));
        assertEquals(Long.MIN_VALUE, NumberUtils.min(new long[] {0L, Long.MIN_VALUE}));
    }

    @Test
    public void testLongArrayMaximumAcrossPositions() throws Exception {
        assertEquals(9L, NumberUtils.max(new long[] {-2L, 9L, 3L}));
        assertEquals(Long.MAX_VALUE, NumberUtils.max(new long[] {Long.MAX_VALUE, 0L}));
    }

    @Test
    public void testLongArrayMinRejectsNullAndEmpty() throws Exception {
        try {
            NumberUtils.min((long[]) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            NumberUtils.min(new long[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testLongArrayMaxRejectsNullAndEmpty() throws Exception {
        try {
            NumberUtils.max((long[]) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            NumberUtils.max(new long[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testIsDigitsNullEmptyAndUnicode() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("123"));
        assertTrue(NumberUtils.isDigits("\u0661"));
        assertFalse(NumberUtils.isDigits("1a"));
    }

    @Test
    public void testIsNumberFormsAndInvalidEdges() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertTrue(NumberUtils.isNumber("-0xF"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertTrue(NumberUtils.isNumber("1."));
        assertTrue(NumberUtils.isNumber("1E-2"));
        assertFalse(NumberUtils.isNumber("1E"));
        assertFalse(NumberUtils.isNumber("1.2L"));
    }
}
