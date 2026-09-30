package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

public class NumberUtilsGeneratedTest {

    @Test
    public void testDecimalPrecisionEightDigitsReturnsDouble() {
        Number result = NumberUtils.createNumber("1.23456789");

        assertEquals(Double.class, result.getClass());
        assertEquals(Double.valueOf("1.23456789"), result);
    }

    @Test
    public void testDecimalPrecisionSevenDigitsReturnsFloat() {
        Number result = NumberUtils.createNumber("1.2345678");

        assertEquals(Float.class, result.getClass());
        assertEquals(Float.valueOf("1.2345678"), result);
    }

    @Test
    public void testFloatBoundaryWithHigherDecimalPrecisionReturnsDouble() {
        Number result = NumberUtils.createNumber("3.402823466e38");

        assertEquals(Double.class, result.getClass());
        assertEquals(Double.valueOf("3.402823466e38"), result);
    }

    @Test
    public void testDoubleBoundarySixteenDecimalDigitsReturnsDouble() {
        Number result = NumberUtils.createNumber("123456789.12345678");

        assertEquals(Double.class, result.getClass());
        assertEquals(Double.valueOf("123456789.12345678"), result);
    }

    @Test
    public void testBigDecimalFallbackMoreThanSixteenDecimalDigits() {
        String value = "0.12345678901234567";
        Number result = NumberUtils.createNumber(value);

        assertEquals(BigDecimal.class, result.getClass());
        assertTrue(result.equals(new BigDecimal(value)));
    }
}
