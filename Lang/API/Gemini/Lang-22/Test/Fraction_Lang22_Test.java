package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class Fraction_Lang22_Test {

    @Test(timeout = 2000)
    public void testReducedFractionWithZeroNumerator() {
        Fraction f = Fraction.getReducedFraction(0, 15);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(timeout = 2000)
    public void testReducedFractionWithNegativeDenominatorAndZero() {
        Fraction f = Fraction.getReducedFraction(0, -25);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(timeout = 2000)
    public void testFractionAdditionZeroHandling() {
        Fraction f1 = Fraction.getFraction(0, 1);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction sum = f1.add(f2);
        assertEquals(1, sum.getNumerator());
        assertEquals(3, sum.getDenominator());
    }
}
