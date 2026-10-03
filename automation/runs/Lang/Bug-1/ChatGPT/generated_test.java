package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void testCreateNumberEightDigitHexAboveIntegerRange() {
        Number result = NumberUtils.createNumber("0x81000000");

        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(0x81000000L), result);
    }

    @Test
    public void testCreateNumberSixteenDigitHexAboveLongRange() {
        Number result = NumberUtils.createNumber("0xFEDCBA9876543210");

        assertTrue(result instanceof BigInteger);
        assertEquals(
                new BigInteger("FEDCBA9876543210", 16),
                result);
    }

    @Test
    public void testCreateNumberEightDigitHexWithLeadingZeros() {
        Number result = NumberUtils.createNumber("0x0000000081000000");

        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(0x81000000L), result);
    }

    @Test
    public void testCreateNumberSixteenDigitHexWithLeadingZeros() {
        Number result = NumberUtils.createNumber("0x00FEDCBA9876543210");

        assertTrue(result instanceof BigInteger);
        assertEquals(
                new BigInteger("FEDCBA9876543210", 16),
                result);
    }
}
