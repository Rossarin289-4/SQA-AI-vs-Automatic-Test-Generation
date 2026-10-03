package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionDefectTest {

    @Test
    public void testReduceWithIntegerMinValueDenominator() {
        // Test reducing a fraction with denominator = Integer.MIN_VALUE and even numerator
        Fraction frac = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertNotNull(frac);
        assertEquals(-1, frac.getNumerator());
        assertEquals(1073741824, frac.getDenominator());
    }

    @Test
    public void testReduceNegativeFractionWithMinValue() {
        // Test reducing a negative fraction where denominator is Integer.MIN_VALUE
        Fraction frac = Fraction.getReducedFraction(-4, Integer.MIN_VALUE);
        assertNotNull(frac);
        assertEquals(1, frac.getNumerator());
        assertEquals(536870912, frac.getDenominator());
    }

    @Test
    public void testReduceMultipleOfTwoWithMinValue() {
        // Test reducing 6 / Integer.MIN_VALUE
        Fraction frac = Fraction.getReducedFraction(6, Integer.MIN_VALUE);
        assertNotNull(frac);
        assertEquals(-3, frac.getNumerator());
        assertEquals(1073741824, frac.getDenominator());
    }
}
