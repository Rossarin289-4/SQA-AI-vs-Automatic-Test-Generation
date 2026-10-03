package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Independent test suite targeting floating-point type precision selection
 * in NumberUtils.createNumber(String) (LANG-693 / Lang-3).
 */
public class NumberUtilsCreateNumberTest {

    @Test
    public void testCreateNumber_PrecisionExceedsFloatCapacity() {
        final String input = "12345678.90123456";
        final Number result = NumberUtils.createNumber(input);

        assertTrue("Input with 16 digits should return Double or BigDecimal, got: "
                + result.getClass().getName(),
                result instanceof Double || result instanceof java.math.BigDecimal);
        assertEquals(Double.parseDouble(input), result.doubleValue(), 0.000000001);
    }

    @Test
    public void testCreateNumber_SmallDecimalRequiresDoublePrecision() {
        final String input = "0.000000123456789";
        final Number result = NumberUtils.createNumber(input);

        assertTrue("High-precision small decimal should return Double, got: "
                + result.getClass().getName(),
                result instanceof Double || result instanceof java.math.BigDecimal);
        assertEquals(Double.parseDouble(input), result.doubleValue(), 1e-15);
    }

    @Test
    public void testCreateNumber_PreserveExactDoubleValue() {
        final String input = "3.14159265358979323846";
        final Number result = NumberUtils.createNumber(input);

        assertTrue("Pi string with 20 decimal places should not be downcast to Float",
                result instanceof Double || result instanceof java.math.BigDecimal);
    }

    @Test
    public void testCreateNumber_LargeIntegerMantissaWithDecimal() {
        final String input = "987654321.123456";
        final Number result = NumberUtils.createNumber(input);

        assertTrue("Large number with fraction precision should be Double, got: "
                + result.getClass().getName(),
                result instanceof Double || result instanceof java.math.BigDecimal);
        assertEquals(Double.parseDouble(input), result.doubleValue(), 0.000001);
    }
}
