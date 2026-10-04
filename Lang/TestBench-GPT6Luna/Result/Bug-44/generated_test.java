package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {
    @Test
    public void testStringToIntParsesBoundsAndUsesDefaultOnOverflow() throws Exception {
        assertEquals(Integer.MAX_VALUE, NumberUtils.stringToInt("2147483647"));
        assertEquals(Integer.MIN_VALUE, NumberUtils.stringToInt("-2147483648"));
        assertEquals(7, NumberUtils.stringToInt("2147483648", 7));
        assertEquals(0, NumberUtils.stringToInt("bad"));
    }

    @Test
    public void testCreateNumberNullAndInvalidEmpty() throws Exception {
        assertNull(NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber("");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testCreateNumberIntegerLongAndBigIntegerRanges() throws Exception {
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), NumberUtils.createNumber("2147483647"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("9223372036854775808"),
                NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void testCreateNumberHexAndLeadingZeroDecimal() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertEquals(Long.valueOf(8L), NumberUtils.createNumber("08"));
    }

    @Test
    public void testCreateNumberDecimalAndExponent() throws Exception {
        assertEquals(Float.valueOf(1.25F), NumberUtils.createNumber("1.25"));
        assertEquals(new BigDecimal("1E+40"), NumberUtils.createNumber("1E40"));
    }

    @Test
    public void testCreateNumberTypeQualifiers() throws Exception {
        assertEquals(Long.valueOf(12L), NumberUtils.createNumber("12L"));
        assertEquals(Float.valueOf(1.5F), NumberUtils.createNumber("1.5F"));
        assertEquals(Double.valueOf(1.5D), NumberUtils.createNumber("1.5D"));
    }

    @Test
    public void testCreateFloat() throws Exception {
        assertEquals(Float.valueOf(-2.5F), NumberUtils.createFloat("-2.5"));
    }

    @Test
    public void testCreateDouble() throws Exception {
        assertEquals(Double.valueOf(1.25D), NumberUtils.createDouble("1.25"));
    }

    @Test
    public void testCreateIntegerDecode() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xFF"));
        assertEquals(Integer.valueOf(63), NumberUtils.createInteger("077"));
    }

    @Test
    public void testCreateLong() throws Exception {
        assertEquals(Long.valueOf(Long.MAX_VALUE), NumberUtils.createLong("9223372036854775807"));
    }

    @Test
    public void testCreateBigInteger() throws Exception {
        assertEquals(new BigInteger("9223372036854775808"),
                NumberUtils.createBigInteger("9223372036854775808"));
    }

    @Test
    public void testCreateBigDecimal() throws Exception {
        assertEquals(new BigDecimal("1.25"), NumberUtils.createBigDecimal("1.25"));
    }

    @Test
    public void testMinimumLong() throws Exception {
        assertEquals(Long.MIN_VALUE, NumberUtils.minimum(0L, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    @Test
    public void testMaximumLong() throws Exception {
        assertEquals(Long.MAX_VALUE, NumberUtils.maximum(0L, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    @Test
    public void testCompareDoubleOrderAndSpecialValues() throws Exception {
        assertEquals(-1, NumberUtils.compare(-1.0D, 0.0D));
        assertEquals(1, NumberUtils.compare(0.0D, -0.0D));
        assertEquals(-1, NumberUtils.compare(Double.NEGATIVE_INFINITY, -Double.MAX_VALUE));
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
    }

    @Test
    public void testIsDigitsNullEmptyAndCharacters() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("123"));
        assertFalse(NumberUtils.isDigits("12a"));
    }

    @Test
    public void testIsNumberEmptyAndHexCases() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertTrue(NumberUtils.isNumber("0xFF"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("0xG"));
    }

    @Test
    public void testIsNumberDecimalExponentAndSuffixCases() throws Exception {
        assertTrue(NumberUtils.isNumber("-1.25"));
        assertTrue(NumberUtils.isNumber("1E-2"));
        assertTrue(NumberUtils.isNumber("12L"));
        assertFalse(NumberUtils.isNumber("1E"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("1E2L"));
    }
}
