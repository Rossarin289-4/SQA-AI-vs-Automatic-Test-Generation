package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class FractionTest {
    @Test
    public void testConstructionAndDenominatorSign() throws Exception {
        Fraction f = Fraction.getFraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testConstructionRejectsZeroDenominator() throws Exception {
        try { Fraction.getFraction(1, 0); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testReducedFractionNormalizesZeroAndReduces() throws Exception {
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, 7));
        Fraction f = Fraction.getReducedFraction(-6, -8);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testReducedFractionMinimumDenominatorEvenNumerator() throws Exception {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator());
    }

    @Test
    public void testAccessorsAndProperParts() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(-7, f.getNumerator());
        assertEquals(4, f.getDenominator());
        assertEquals(3, f.getProperNumerator());
        assertEquals(-1, f.getProperWhole());
    }

    @Test
    public void testNumberConversionsTruncateTowardZero() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(-1, f.intValue());
        assertEquals(-1L, f.longValue());
        assertEquals(-1.75f, f.floatValue(), 1e-6f);
        assertEquals(-1.75, f.doubleValue(), 1e-12);
    }

    @Test
    public void testReduceAndAlreadyReduced() throws Exception {
        Fraction f = Fraction.getFraction(6, 8);
        Fraction reduced = f.reduce();
        assertEquals(3, reduced.getNumerator());
        assertEquals(4, reduced.getDenominator());
        Fraction simplest = Fraction.getFraction(3, 7);
        assertSame(simplest, simplest.reduce());
    }

    @Test
    public void testInvertPositiveAndNegative() throws Exception {
        Fraction positive = Fraction.getFraction(3, 5).invert();
        assertEquals(5, positive.getNumerator());
        assertEquals(3, positive.getDenominator());
        Fraction negative = Fraction.getFraction(-3, 5).invert();
        assertEquals(-5, negative.getNumerator());
        assertEquals(3, negative.getDenominator());
    }

    @Test
    public void testNegateAndAbs() throws Exception {
        Fraction f = Fraction.getFraction(-3, 5);
        Fraction negated = f.negate();
        assertEquals(3, negated.getNumerator());
        assertEquals(5, negated.getDenominator());
        assertEquals(3, f.abs().getNumerator());
        Fraction positive = Fraction.getFraction(2, 3);
        assertSame(positive, positive.abs());
    }

    @Test
    public void testPowerPositiveZeroAndNegative() throws Exception {
        Fraction base = Fraction.getFraction(2, 3);
        Fraction square = base.pow(2);
        assertEquals(4, square.getNumerator());
        assertEquals(9, square.getDenominator());
        assertEquals(Fraction.ONE, Fraction.ZERO.pow(0));
        Fraction inverse = base.pow(-1);
        assertEquals(3, inverse.getNumerator());
        assertEquals(2, inverse.getDenominator());
    }

    @Test
    public void testAddWithCommonDenominator() throws Exception {
        Fraction sum = Fraction.getFraction(1, 6).add(Fraction.getFraction(1, 3));
        assertEquals(1, sum.getNumerator());
        assertEquals(2, sum.getDenominator());
    }

    @Test
    public void testSubtractWithCommonDenominator() throws Exception {
        Fraction difference = Fraction.getFraction(3, 4).subtract(Fraction.getFraction(1, 4));
        assertEquals(1, difference.getNumerator());
        assertEquals(2, difference.getDenominator());
    }

    @Test
    public void testAddWithCoprimeDenominators() throws Exception {
        Fraction sum = Fraction.getFraction(1, 3).add(Fraction.getFraction(1, 4));
        assertEquals(7, sum.getNumerator());
        assertEquals(12, sum.getDenominator());
    }

    @Test
    public void testMultiplyReducesCrossFactors() throws Exception {
        Fraction product = Fraction.getFraction(2, 3).multiplyBy(Fraction.getFraction(9, 4));
        assertEquals(3, product.getNumerator());
        assertEquals(2, product.getDenominator());
    }

    @Test
    public void testDivide() throws Exception {
        Fraction quotient = Fraction.getFraction(2, 3).divideBy(Fraction.getFraction(4, 5));
        assertEquals(5, quotient.getNumerator());
        assertEquals(6, quotient.getDenominator());
    }

    @Test
    public void testDivideByZeroThrows() throws Exception {
        try { Fraction.ONE.divideBy(Fraction.ZERO); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testEqualityHashAndStringForms() throws Exception {
        Fraction f = Fraction.getFraction(7, 4);
        assertTrue(f.equals(Fraction.getFraction(7, 4)));
        assertFalse(f.equals(Fraction.getFraction(1, 2)));
        assertEquals("7/4", f.toString());
        assertEquals("1 3/4", f.toProperString());
        assertEquals(37 * (37 * 17 + 7) + 4, f.hashCode());
    }

    @Test
    public void testProperStringWholeAndZero() throws Exception {
        assertEquals("-1", Fraction.getFraction(-1, 1).toProperString());
        assertEquals("0", Fraction.ZERO.toProperString());
    }

    @Test
    public void testCompareFractionsByValue() throws Exception {
        assertEquals(0, Fraction.getFraction(1, 2).compareTo(Fraction.getFraction(2, 4)));
        assertEquals(-1, Fraction.getFraction(1, 3).compareTo(Fraction.getFraction(1, 2)));
        assertEquals(1, Fraction.getFraction(3, 4).compareTo(Fraction.getFraction(2, 3)));
    }

    @Test
    public void testMinimumNumeratorNegationOverflow() throws Exception {
        try {
            Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }
}
