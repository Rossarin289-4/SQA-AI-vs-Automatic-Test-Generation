package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class FractionTest {
    @Test
    public void testGetFractionNormalizesNegativeDenominator() throws Exception {
        Fraction f = Fraction.getFraction(2, -4);
        assertEquals(-2, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testGetFractionRejectsZeroDenominator() throws Exception {
        try { Fraction.getFraction(1, 0); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testReducedFractionNormalizesAndReduces() throws Exception {
        Fraction f = Fraction.getReducedFraction(6, -8);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testReducedFractionHandlesEvenNumeratorWithMinimumDenominator() throws Exception {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator());
    }

    @Test
    public void testReducedFractionRejectsOddNumeratorWithMinimumDenominator() throws Exception {
        try { Fraction.getReducedFraction(1, Integer.MIN_VALUE); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testNumeratorDenominatorAndProperParts() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(-7, f.getNumerator());
        assertEquals(4, f.getDenominator());
        assertEquals(3, f.getProperNumerator());
        assertEquals(-1, f.getProperWhole());
    }

    @Test
    public void testNumberConversions() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(-1, f.intValue());
        assertEquals(-1L, f.longValue());
        assertEquals(-1.75f, f.floatValue(), 1e-6f);
        assertEquals(-1.75, f.doubleValue(), 1e-12);
    }

    @Test
    public void testReduceReturnsCanonicalEquivalent() throws Exception {
        Fraction f = Fraction.getFraction(2, 4).reduce();
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testInvertNegativeFraction() throws Exception {
        Fraction f = Fraction.getFraction(-2, 3).invert();
        assertEquals(-3, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testNegateAndAbs() throws Exception {
        Fraction f = Fraction.getFraction(-2, 3);
        assertEquals(Fraction.getFraction(2, 3), f.negate());
        assertEquals(Fraction.getFraction(2, 3), f.abs());
    }

    @Test
    public void testPowerPositiveZeroAndNegative() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        assertEquals(Fraction.getFraction(8, 27), f.pow(3));
        assertEquals(Fraction.ONE, f.pow(0));
        assertEquals(Fraction.getFraction(3, 2), f.pow(-1));
    }

    @Test
    public void testAddWithDifferentDenominators() throws Exception {
        assertEquals(Fraction.getFraction(5, 6),
                Fraction.getFraction(1, 2).add(Fraction.getFraction(1, 3)));
    }

    @Test
    public void testAddReducesSharedDenominatorFactors() throws Exception {
        assertEquals(Fraction.getFraction(1, 1),
                Fraction.getFraction(1, 6).add(Fraction.getFraction(5, 6)));
    }

    @Test
    public void testSubtractProducesNegativeResult() throws Exception {
        assertEquals(Fraction.getFraction(-1, 6),
                Fraction.getFraction(1, 3).subtract(Fraction.getFraction(1, 2)));
    }

    @Test
    public void testMultiplyCrossReduces() throws Exception {
        assertEquals(Fraction.getFraction(1, 2),
                Fraction.getFraction(2, 3).multiplyBy(Fraction.getFraction(3, 4)));
    }

    @Test
    public void testDivideFractions() throws Exception {
        assertEquals(Fraction.getFraction(3, 2),
                Fraction.getFraction(2, 3).divideBy(Fraction.getFraction(4, 9)));
    }

    @Test
    public void testDivideByZeroRejects() throws Exception {
        try { Fraction.ONE.divideBy(Fraction.ZERO); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testStructuralEqualityAndHashCode() throws Exception {
        Fraction a = Fraction.getFraction(2, 4);
        Fraction b = Fraction.getFraction(2, 4);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(Fraction.getFraction(1, 2)));
    }

    @Test
    public void testCompareToUsesFractionalValue() throws Exception {
        assertEquals(0, Fraction.getFraction(1, 2).compareTo(Fraction.getFraction(2, 4)));
        assertEquals(-1, Fraction.getFraction(1, 3).compareTo(Fraction.getFraction(1, 2)));
        assertEquals(1, Fraction.getFraction(3, 4).compareTo(Fraction.getFraction(2, 3)));
    }

    @Test
    public void testStringRepresentations() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals("-7/4", f.toString());
        assertEquals("-1 3/4", f.toProperString());
        assertEquals("1", Fraction.ONE.toProperString());
        assertEquals("0", Fraction.ZERO.toProperString());
    }
}
