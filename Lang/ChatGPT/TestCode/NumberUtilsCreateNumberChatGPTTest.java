package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

public class NumberUtilsCreateNumberChatGPTTest {

    @Test
    public void testCreateNumberInteger() {
        Number result = NumberUtils.createNumber("123");

        assertTrue(result instanceof Integer);
        assertEquals(Integer.valueOf(123), result);
    }

    @Test
    public void testCreateNumberLongWhenIntegerOverflow() {
        Number result = NumberUtils.createNumber("2147483648");

        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(2147483648L), result);
    }

    @Test
    public void testCreateNumberBigIntegerWhenLongOverflow() {
        Number result = NumberUtils.createNumber("9223372036854775808");

        assertTrue(result instanceof BigInteger);
        assertEquals(
                new BigInteger("9223372036854775808"),
                result);
    }

    @Test
    public void testCreateNumberSimpleDecimal() {
        Number result = NumberUtils.createNumber("1.23");

        assertTrue(result instanceof Float);
        assertEquals(Float.valueOf(1.23f), result);
    }

    @Test
    public void testCreateNumberUsesDoubleForHigherDecimalPrecision() {
        Number result = NumberUtils.createNumber("1.2345678");

        assertTrue(result instanceof Double);
    }

    @Test
    public void testCreateNumberUsesDoubleAtDoublePrecisionBoundary() {
        Number result = NumberUtils.createNumber("1.2345678901234567");

        assertTrue(result instanceof Double);
    }

    @Test
    public void testCreateNumberUsesBigDecimalForExcessiveDecimalPrecision() {
        Number result =
                NumberUtils.createNumber("1.23456789012345678");

        assertTrue(result instanceof java.math.BigDecimal);
        assertEquals(
                new java.math.BigDecimal("1.23456789012345678"),
                result);
    }

    @Test
    public void testCreateNumberExponent() {
        Number result = NumberUtils.createNumber("1.23E3");

        assertTrue(result instanceof Float);
        assertEquals(Float.valueOf(1.23E3f), result);
    }

    @Test
    public void testCreateNumberNull() {
        assertEquals(null, NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlankString() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidString() {
        NumberUtils.createNumber("abc");
    }
}