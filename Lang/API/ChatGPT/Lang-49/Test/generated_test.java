package org.apache.commons.lang.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class FractionLang49Test {

    @Test
    public void testReduceZeroWithEvenDenominator() {
        Fraction fraction = Fraction.getFraction(0, 8);

        Fraction result = fraction.reduce();

        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
        assertSame(Fraction.ZERO, result);
    }

    @Test
    public void testReduceZeroWithOddDenominator() {
        Fraction fraction = Fraction.getFraction(0, 9);

        Fraction result = fraction.reduce();

        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
        assertSame(Fraction.ZERO, result);
    }

    @Test
    public void testReduceAlreadyCanonicalZero() {
        Fraction fraction = Fraction.ZERO;

        Fraction result = fraction.reduce();

        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
        assertSame(fraction, result);
    }

    @Test
    public void testReduceNonZeroReducibleFraction() {
        Fraction fraction = Fraction.getFraction(18, 24);

        Fraction result = fraction.reduce();

        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    public void testReduceAlreadyReducedFraction() {
        Fraction fraction = Fraction.getFraction(5, 7);

        Fraction result = fraction.reduce();

        assertEquals(5, result.getNumerator());
        assertEquals(7, result.getDenominator());
        assertSame(fraction, result);
    }

    @Test
    public void testReduceNegativeReducibleFraction() {
        Fraction fraction = Fraction.getFraction(-12, 18);

        Fraction result = fraction.reduce();

        assertEquals(-2, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }
}
