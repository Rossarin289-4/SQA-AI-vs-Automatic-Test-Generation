package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FractionLang22Test {

    @Test
    public void testReducedFractionIntegerMinValueWithFour() {
        Fraction fraction = Fraction.getReducedFraction(Integer.MIN_VALUE, 4);

        assertEquals(Integer.MIN_VALUE / 4, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testReducedFractionIntegerMinValueWithEight() {
        Fraction fraction = Fraction.getReducedFraction(Integer.MIN_VALUE, 8);

        assertEquals(Integer.MIN_VALUE / 8, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testReduceIntegerMinValueWithFour() {
        Fraction fraction = Fraction.getFraction(Integer.MIN_VALUE, 4);
        Fraction reduced = fraction.reduce();

        assertEquals(Integer.MIN_VALUE / 4, reduced.getNumerator());
        assertEquals(1, reduced.getDenominator());
    }

    @Test
    public void testOrdinaryNegativeFractionReduction() {
        Fraction fraction = Fraction.getReducedFraction(-48, 12);

        assertEquals(-4, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testOrdinaryPositiveFractionReduction() {
        Fraction fraction = Fraction.getReducedFraction(84, 28);

        assertEquals(3, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testAlreadyReducedFractionRemainsUnchanged() {
        Fraction fraction = Fraction.getReducedFraction(7, 13);

        assertEquals(7, fraction.getNumerator());
        assertEquals(13, fraction.getDenominator());
    }

    @Test
    public void testZeroFractionIsNormalized() {
        Fraction fraction = Fraction.getReducedFraction(0, 19);

        assertEquals(0, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
}
