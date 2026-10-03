package org.apache.commons.lang.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberUtilsLang58Test {

    @Test
    public void testCreateNumberPositiveSingleDigitZeroLong() {
        Number result = NumberUtils.createNumber("0L");

        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(0L), result);
    }

    @Test
    public void testCreateNumberPositiveSingleDigitLowercaseLong() {
        Number result = NumberUtils.createNumber("8l");

        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(8L), result);
    }

    @Test
    public void testCreateNumberPositiveMultiDigitLong() {
        Number result = NumberUtils.createNumber("42L");

        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(42L), result);
    }

    @Test
    public void testCreateNumberNegativeSingleDigitLong() {
        Number result = NumberUtils.createNumber("-7L");

        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(-7L), result);
    }

    @Test
    public void testCreateNumberLeadingZeroLong() {
        Number result = NumberUtils.createNumber("05L");

        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(5L), result);
    }
}
