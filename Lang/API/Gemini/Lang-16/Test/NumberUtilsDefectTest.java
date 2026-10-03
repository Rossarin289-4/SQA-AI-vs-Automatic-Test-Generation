package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsDefectTest {

    @Test
    public void testCreateNumberWithNegativeExponent() {
        // Test scientific notation with a negative exponent
        Number result = NumberUtils.createNumber("1e-10");
        assertNotNull("NumberUtils.createNumber should not return null for scientific notation", result);
        assertEquals(Double.valueOf(1e-10), Double.valueOf(result.doubleValue()));
    }

    @Test
    public void testCreateNumberWithPositiveExponentAndSign() {
        // Test scientific notation with an explicit positive sign in the exponent
        Number result = NumberUtils.createNumber("2.5e+4");
        assertNotNull("NumberUtils.createNumber should not return null for scientific notation with positive sign", result);
        assertEquals(Double.valueOf(25000.0), Double.valueOf(result.doubleValue()));
    }

    @Test
    public void testCreateNumberWithDecimalAndExponent() {
        // Test number containing both a decimal point and a negative exponent
        Number result = NumberUtils.createNumber("1.23e-2");
        assertNotNull("NumberUtils.createNumber should handle decimals with exponents", result);
        assertEquals(Double.valueOf(0.0123), Double.valueOf(result.doubleValue()));
    }
}
