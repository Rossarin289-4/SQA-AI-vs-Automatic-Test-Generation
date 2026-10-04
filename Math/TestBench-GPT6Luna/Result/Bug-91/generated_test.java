package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.util.MathUtils;

public class FractionTest {
    @Test
    public void testConstructorReducesAndNormalizesSign() throws Exception {
        Fraction f = new Fraction(6, -8);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testAbsForNegativeAndNonnegativeValues() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(-3, 4).abs());
        assertEquals(new Fraction(3, 4), new Fraction(3, 4).abs());
    }

    @Test
    public void testCompareToAcrossSignsAndEquality() throws Exception {
        assertEquals(-1, new Fraction(-1, 2).compareTo(new Fraction(0, 1)));
        assertEquals(1, new Fraction(3, 4).compareTo(new Fraction(1, 2)));
        assertEquals(0, new Fraction(2, 3).compareTo(new Fraction(4, 6)));
    }

    @Test
    public void testDoubleValue() throws Exception {
        assertEquals(0.75, new Fraction(3, 4).doubleValue(), 1e-12);
    }

    @Test
    public void testEqualsCases() throws Exception {
        Fraction f = new Fraction(2, 3);
        assertTrue(f.equals(f));
        assertTrue(f.equals(new Fraction(4, 6)));
        assertFalse(f.equals(null));
        assertFalse(f.equals("fraction"));
        assertFalse(f.equals(new Fraction(3, 2)));
    }

    @Test
    public void testFloatValue() throws Exception {
        assertEquals(0.75f, new Fraction(3, 4).floatValue(), 1e-7f);
    }

    @Test
    public void testHashCodeFormula() throws Exception {
        Fraction f = new Fraction(2, 3);
        assertEquals(37 * (37 * 17 + 2) + 3, f.hashCode());
    }

    @Test
    public void testIntegerAndLongValueTruncateTowardZero() throws Exception {
        Fraction f = new Fraction(-7, 3);
        assertEquals(-2, f.intValue());
        assertEquals(-2L, f.longValue());
    }

    @Test
    public void testNegateAndMinimumNumeratorBoundary() throws Exception {
        assertEquals(new Fraction(-3, 4), new Fraction(3, 4).negate());
        try {
            new Fraction(Integer.MIN_VALUE, 1).negate();
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }

    @Test
    public void testReciprocalAndZeroNumerator() throws Exception {
        assertEquals(new Fraction(4, 3), new Fraction(3, 4).reciprocal());
        try {
            Fraction.ZERO.reciprocal();
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }

    @Test
    public void testAddWithDifferentDenominators() throws Exception {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).add(new Fraction(1, 3)));
    }

    @Test
    public void testAddWithCommonDenominatorAndZeroIdentity() throws Exception {
        assertEquals(new Fraction(5, 6), new Fraction(1, 6).add(new Fraction(2, 3)));
        assertEquals(new Fraction(2, 3), Fraction.ZERO.add(new Fraction(2, 3)));
    }

    @Test
    public void testSubtractAndZeroCases() throws Exception {
        assertEquals(new Fraction(1, 6), new Fraction(1, 2).subtract(new Fraction(1, 3)));
        assertEquals(new Fraction(-2, 3), Fraction.ZERO.subtract(new Fraction(2, 3)));
    }

    @Test
    public void testAddAndSubtractRejectNull() throws Exception {
        try {
            Fraction.ONE.add(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            Fraction.ONE.subtract(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMultiplyWithCrossCancellationAndZero() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(2, 3).multiply(new Fraction(3, 4)));
        assertEquals(Fraction.ZERO, new Fraction(5, 7).multiply(Fraction.ZERO));
    }

    @Test
    public void testMultiplyRejectsNull() throws Exception {
        try {
            Fraction.ONE.multiply(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDivideAndZeroDivisor() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(1, 2).divide(new Fraction(1, 3)));
        try {
            Fraction.ONE.divide(Fraction.ZERO);
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }

    @Test
    public void testDivideRejectsNull() throws Exception {
        try {
            Fraction.ONE.divide(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGetReducedFractionNormalizesAndReduces() throws Exception {
        assertEquals(new Fraction(-3, 4), Fraction.getReducedFraction(6, -8));
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, 7));
    }

    @Test
    public void testGetReducedFractionHandlesEvenNumeratorWithMinimumDenominator() throws Exception {
        assertEquals(new Fraction(1, 1073741824),
                Fraction.getReducedFraction(-2, Integer.MIN_VALUE));
    }

    @Test
    public void testGetReducedFractionZeroDenominator() throws Exception {
        try {
            Fraction.getReducedFraction(1, 0);
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }

    @Test
    public void testDoubleConstructorIntegerAndRationalValues() throws Exception {
        assertEquals(new Fraction(2, 1), new Fraction(2.0));
        assertEquals(new Fraction(1, 2), new Fraction(0.5));
    }

    @Test
    public void testDoubleConstructorMaximumRepresentableInteger() throws Exception {
        Fraction f = new Fraction((double) Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testIntegerConstructorZeroDenominator() throws Exception {
        try {
            new Fraction(1, 0);
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }
}
