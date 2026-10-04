package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {
    @Test
    public void testToIntDefaultAndOverflow() throws Exception {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(7, NumberUtils.toInt("", 7));
        assertEquals(7, NumberUtils.toInt("2147483648", 7));
        assertEquals(Integer.MAX_VALUE, NumberUtils.toInt("2147483647"));
    }

    @Test
    public void testToLongBounds() throws Exception {
        assertEquals(Long.MAX_VALUE, NumberUtils.toLong("9223372036854775807"));
        assertEquals(9L, NumberUtils.toLong("9223372036854775808", 9L));
        assertEquals(-9L, NumberUtils.toLong(null, -9L));
    }

    @Test
    public void testToFloatParsingAndDefault() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
        assertEquals(3.0f, NumberUtils.toFloat(null, 3.0f), 0.0f);
        assertEquals(3.0f, NumberUtils.toFloat("bad", 3.0f), 0.0f);
    }

    @Test
    public void testToDoubleParsingAndDefault() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
        assertEquals(4.0d, NumberUtils.toDouble("", 4.0d), 0.0d);
        assertEquals(4.0d, NumberUtils.toDouble(null, 4.0d), 0.0d);
    }

    @Test
    public void testToByteBoundaries() throws Exception {
        assertEquals((byte) 127, NumberUtils.toByte("127"));
        assertEquals((byte) -128, NumberUtils.toByte("-128"));
        assertEquals((byte) 6, NumberUtils.toByte("128", (byte) 6));
        assertEquals((byte) 6, NumberUtils.toByte(null, (byte) 6));
    }

    @Test
    public void testToShortBoundaries() throws Exception {
        assertEquals((short) 32767, NumberUtils.toShort("32767"));
        assertEquals((short) -32768, NumberUtils.toShort("-32768"));
        assertEquals((short) 5, NumberUtils.toShort("32768", (short) 5));
    }

    @Test
    public void testCreateNumberNullBlankAndInteger() throws Exception {
        assertNull(NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber(" ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
        assertEquals(Integer.valueOf(12), NumberUtils.createNumber("12"));
    }

    @Test
    public void testCreateNumberOctalAndHexBoundaries() throws Exception {
        assertEquals(Integer.valueOf(63), NumberUtils.createNumber("077"));
        assertEquals(Integer.valueOf(2147483647), NumberUtils.createNumber("0x7FFFFFFF"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("0x80000000"));
    }

    @Test
    public void testCreateNumberDecimalPrecisionSelection() throws Exception {
        assertEquals(Float.valueOf(1.25f), NumberUtils.createNumber("1.25"));
        assertEquals(Double.valueOf(1.123456789d), NumberUtils.createNumber("1.123456789"));
        assertEquals(new BigDecimal("1.12345678901234567"),
                NumberUtils.createNumber("1.12345678901234567"));
    }

    @Test
    public void testCreateFloatAndDouble() throws Exception {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(2.5f), NumberUtils.createFloat("2.5"));
        assertEquals(Double.valueOf(2.5d), NumberUtils.createDouble("2.5"));
    }

    @Test
    public void testCreateIntegerAndLongRadix() throws Exception {
        assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));
        assertEquals(Long.valueOf(63L), NumberUtils.createLong("077"));
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateBigIntegerRadixAndNull() throws Exception {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("16"), NumberUtils.createBigInteger("0x10"));
        assertEquals(new BigInteger("-63"), NumberUtils.createBigInteger("-077"));
    }

    @Test
    public void testCreateBigDecimalAndInvalidInput() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("1.25"), NumberUtils.createBigDecimal("1.25"));
        try {
            NumberUtils.createBigDecimal("--1");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testLongArrayMinMaxAndEdges() throws Exception {
        assertEquals(Long.MIN_VALUE, NumberUtils.min(new long[] { 3L, Long.MIN_VALUE, 7L }));
        assertEquals(Long.MAX_VALUE, NumberUtils.max(new long[] { -3L, Long.MAX_VALUE, 7L }));
        assertEquals(4L, NumberUtils.min(new long[] { 4L }));
        assertEquals(-2L, NumberUtils.max(new long[] { -2L }));
    }

    @Test
    public void testLongArrayRejectsNullAndEmpty() throws Exception {
        try {
            NumberUtils.min((long[]) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            NumberUtils.max(new long[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testIsDigitsForms() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("0123"));
        assertFalse(NumberUtils.isDigits("12a"));
    }

    @Test
    public void testIsNumberFormsAndBoundaries() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertTrue(NumberUtils.isNumber("-0x1f"));
        assertTrue(NumberUtils.isNumber("1E-2"));
        assertTrue(NumberUtils.isNumber("12L"));
        assertFalse(NumberUtils.isNumber("1E"));
        assertFalse(NumberUtils.isNumber("1.2L"));
    }
}
