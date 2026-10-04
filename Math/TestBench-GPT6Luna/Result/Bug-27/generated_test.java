package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.math.BigInteger;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;

public class FractionTest {
    @Test
    public void testReducedConstructionAndFormatting() throws Exception {
        Fraction f = new Fraction(6, -8);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
        assertEquals("-3 / 4", f.toString());
    }

    @Test
    public void testZeroAndIntegerFormatting() throws Exception {
        assertEquals("0", new Fraction(0, 7).toString());
        assertEquals("5", new Fraction(10, 2).toString());
    }

    @Test
    public void testZeroDenominatorRejected() throws Exception {
        try { new Fraction(1, 0); fail("expected MathArithmeticException"); }
        catch (MathArithmeticException expected) { }
        assertEquals(1, Fraction.ONE.getNumerator());
    }

    @Test
    public void testReducedFractionMinimumDenominator() throws Exception {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator());
    }

    @Test
    public void testReducedFractionNormalizesZero() throws Exception {
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, -7));
    }

    @Test
    public void testComparisonAcrossDifferentDenominators() throws Exception {
        assertEquals(0, new Fraction(2, 3).compareTo(new Fraction(4, 6)));
        assertTrue(new Fraction(-1, 2).compareTo(new Fraction(-1, 3)) < 0);
        assertTrue(new Fraction(3, 4).compareTo(new Fraction(2, 3)) > 0);
    }

    @Test
    public void testDoubleAndFloatValues() throws Exception {
        Fraction f = new Fraction(1, 3);
        assertEquals(1.0 / 3.0, f.doubleValue(), 1e-15);
        assertEquals((float)(1.0 / 3.0), f.floatValue(), 1e-7);
    }

    @Test
    public void testWholeNumberConversionsTruncateTowardZero() throws Exception {
        Fraction positive = new Fraction(7, 3);
        Fraction negative = new Fraction(-7, 3);
        assertEquals(2, positive.intValue());
        assertEquals(2L, positive.longValue());
        assertEquals(-2, negative.intValue());
        assertEquals(-2L, negative.longValue());
    }

    @Test
    public void testEqualityAndHashCodeForReducedFractions() throws Exception {
        Fraction a = new Fraction(2, 4);
        Fraction b = new Fraction(1, 2);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(null));
    }

    @Test
    public void testAbsoluteValueAndNegation() throws Exception {
        Fraction f = new Fraction(-3, 5);
        assertEquals(new Fraction(3, 5), f.abs());
        assertEquals(new Fraction(3, 5), f.negate());
        assertSame(Fraction.ONE, Fraction.ONE.abs());
    }

    @Test
    public void testReciprocalAndNegativeReciprocal() throws Exception {
        assertEquals(new Fraction(5, 3), new Fraction(3, 5).reciprocal());
        assertEquals(new Fraction(-5, 3), new Fraction(-3, 5).reciprocal());
    }

    @Test
    public void testAddFractionsWithCommonFactors() throws Exception {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).add(new Fraction(1, 3)));
        assertEquals(new Fraction(1, 2), new Fraction(1, 6).add(new Fraction(1, 3)));
    }

    @Test
    public void testSubtractFractions() throws Exception {
        assertEquals(new Fraction(1, 6), new Fraction(1, 2).subtract(new Fraction(1, 3)));
        assertEquals(new Fraction(-1, 2), new Fraction(1, 3).subtract(new Fraction(5, 6)));
    }

    @Test
    public void testMultiplyFractionsAndZero() throws Exception {
        assertEquals(new Fraction(3, 10), new Fraction(2, 3).multiply(new Fraction(9, 20)));
        assertEquals(Fraction.ZERO, new Fraction(5, 7).multiply(Fraction.ZERO));
    }

    @Test
    public void testDivideFractions() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(2, 3).divide(new Fraction(4, 9)));
        assertEquals(new Fraction(-2, 3), new Fraction(1, 3).divide(new Fraction(-1, 2)));
    }

    @Test
    public void testAddAndSubtractNullRejected() throws Exception {
        try { Fraction.ONE.add((Fraction) null); fail("expected NullArgumentException"); }
        catch (NullArgumentException expected) { }
        try { Fraction.ONE.subtract((Fraction) null); fail("expected NullArgumentException"); }
        catch (NullArgumentException expected) { }
        assertEquals(Fraction.ONE, Fraction.ONE);
    }

    @Test
    public void testMultiplyAndDivideNullRejected() throws Exception {
        try { Fraction.ONE.multiply((Fraction) null); fail("expected NullArgumentException"); }
        catch (NullArgumentException expected) { }
        try { Fraction.ONE.divide((Fraction) null); fail("expected NullArgumentException"); }
        catch (NullArgumentException expected) { }
        assertEquals(1, Fraction.ONE.getNumerator());
    }

    @Test
    public void testDivisionByZeroFractionRejected() throws Exception {
        try { Fraction.ONE.divide(Fraction.ZERO); fail("expected MathArithmeticException"); }
        catch (MathArithmeticException expected) { }
        assertEquals(Fraction.ZERO, new Fraction(0, 5));
    }

    @Test
    public void testPercentageValue() throws Exception {
        assertEquals(62.5, new Fraction(5, 8).percentageValue(), 1e-12);
        assertEquals(-50.0, new Fraction(-1, 2).percentageValue(), 1e-12);
    }

    @Test
    public void testReducedFractionSignAndReduction() throws Exception {
        assertEquals(new Fraction(-3, 4), Fraction.getReducedFraction(6, -8));
        assertEquals(new Fraction(3, 4), Fraction.getReducedFraction(-6, -8));
    }

    @Test
    public void testReducedFractionZeroDenominatorRejected() throws Exception {
        try { Fraction.getReducedFraction(1, 0); fail("expected MathArithmeticException"); }
        catch (MathArithmeticException expected) { }
        assertEquals(new Fraction(1, 2), Fraction.getReducedFraction(2, 4));
    }

    @Test
    public void testFieldSingleton() throws Exception {
        assertSame(Fraction.ONE.getField(), Fraction.ZERO.getField());
    }

    @Test
    public void testIntegerEndpointsRemainExact() throws Exception {
        Fraction high = new Fraction(Integer.MAX_VALUE);
        Fraction low = new Fraction(Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, high.getNumerator());
        assertEquals(Integer.MIN_VALUE, low.getNumerator());
        assertEquals(1, high.getDenominator());
        assertEquals(1, low.getDenominator());
    }
}
