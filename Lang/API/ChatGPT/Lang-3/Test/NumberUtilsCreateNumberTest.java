package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberUtilsCreateNumberTest {

    @Test
    public void testCreateNumberPreservesEightFractionalDigits() {
        final String input = "1.23456789";

        final Number result = NumberUtils.createNumber(input);

        assertTrue(result instanceof Double);
        assertEquals(input, result.toString());
    }

    @Test
    public void testCreateNumberPreservesHighPrecisionNegativeDecimal() {
        final String input = "-12345.67890123";

        final Number result = NumberUtils.createNumber(input);

        assertTrue(result instanceof Double);
        assertEquals(input, result.toString());
    }

    @Test
    public void testCreateNumberUsesDoubleForPrecisionSensitiveDecimal() {
        final String input = "9876543.21098765";

        final Number result = NumberUtils.createNumber(input);

        assertTrue(result instanceof Double);
        assertEquals(input, result.toString());
    }
}
