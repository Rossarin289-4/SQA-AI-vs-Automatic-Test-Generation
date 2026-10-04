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
    public void testAbsPositiveAndNegative() throws Exception {
        Fraction positive = new Fraction(2, 3);
        assertSame(positive, positive.abs());
        assertEquals(new Fraction(2, 3), new Fraction(-2, 3).abs());
    }

    @Test
    public void testAbsIntegerMinimumThrows() throws Exception {
        try {
            new Fraction(Integer.MIN_VALUE).abs();
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) { }
    }

    @Test
    public void testCompareToAllOutcomes() throws Exception {
        assertEquals(-1, new Fraction(1, 3).compareTo(new Fraction(1, 2)));
        assertEquals(0, new Fraction(2, 4).compareTo(new Fraction(1, 2)));
        assertEquals(1, new Fraction(3, 4).compareTo(new Fraction(2, 3)));
    }

    @Test
    public void testDoubleAndFloatValue() throws Exception {
        Fraction fraction = new Fraction(1, 4);
        assertEquals(0.25, fraction.doubleValue(), 0.0);
        assertEquals(0.25f, fraction.floatValue(), 0.0f);
    }

    @Test
    public void testEqualityAndHashCode() throws Exception {
        Fraction half = new Fraction(1, 2);
        assertTrue(half.equals(new Fraction(2, 4)));
        assertFalse(half.equals(null));
        assertFalse(half.equals("1 / 2"));
        assertEquals(half.hashCode(), new Fraction(2, 4).hashCode());
    }

    @Test
    public void testGettersAndStringForms() throws Exception {
        Fraction fraction = new Fraction(-6, 8);
        assertEquals(-3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
        assertEquals("-3 / 4", fraction.toString());
        assertEquals("5", new Fraction(5).toString());
        assertEquals("0", new Fraction(0, 7).toString());
    }

    @Test
    public void testIntegerAndLongValueTruncateTowardZero() throws Exception {
        Fraction positive = new Fraction(7, 3);
        Fraction negative = new Fraction(-7, 3);
        assertEquals(2, positive.intValue());
        assertEquals(2L, positive.longValue());
        assertEquals(-2, negative.intValue());
        assertEquals(-2L, negative.longValue());
    }

    @Test
    public void testNegate() throws Exception {
        assertEquals(new Fraction(-3, 4), new Fraction(3, 4).negate());
        assertEquals(new Fraction(3, 4), new Fraction(-3, 4).negate());
    }

    @Test
    public void testNegateIntegerMinimumThrows() throws Exception {
        try {
            new Fraction(Integer.MIN_VALUE).negate();
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) { }
    }

    @Test
    public void testReciprocal() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(2, 3).reciprocal());
        assertEquals(new Fraction(-3, 2), new Fraction(2, -3).reciprocal());
    }

    @Test
    public void testReciprocalOfZeroThrows() throws Exception {
        try {
            Fraction.ZERO.reciprocal();
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) { }
    }

    @Test
    public void testAddFractionsAndInteger() throws Exception {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).add(new Fraction(1, 3)));
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).add(new Fraction(1, 3)));
        assertEquals(new Fraction(7, 3), new Fraction(1, 3).add(2));
    }

    @Test
    public void testAddZeroAndNull() throws Exception {
        Fraction value = new Fraction(2, 5);
        assertEquals(value, Fraction.ZERO.add(value));
        assertEquals(value, value.add(Fraction.ZERO));
        try {
            value.add((Fraction) null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) { }
    }

    @Test
    public void testSubtractFractionsAndInteger() throws Exception {
        assertEquals(new Fraction(1, 6), new Fraction(1, 2).subtract(new Fraction(1, 3)));
        assertEquals(new Fraction(-5, 6), new Fraction(1, 2).subtract(new Fraction(4, 3)));
        assertEquals(new Fraction(-5, 3), new Fraction(1, 3).subtract(2));
    }

    @Test
    public void testSubtractZeroAndNull() throws Exception {
        Fraction value = new Fraction(2, 5);
        assertEquals(value, value.subtract(Fraction.ZERO));
        assertEquals(new Fraction(-2, 5), Fraction.ZERO.subtract(value));
        try {
            value.subtract((Fraction) null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) { }
    }

    @Test
    public void testMultiplyFractions() throws Exception {
        assertEquals(new Fraction(1, 6), new Fraction(1, 2).multiply(new Fraction(1, 3)));
        assertEquals(new Fraction(-1, 2), new Fraction(2, 3).multiply(new Fraction(-3, 4)));
        assertEquals(Fraction.ZERO, new Fraction(3, 5).multiply(Fraction.ZERO));
    }

    @Test
    public void testMultiplyNullThrows() throws Exception {
        try {
            new Fraction(1, 2).multiply((Fraction) null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) { }
    }

    @Test
    public void testDivideFractions() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(1, 2).divide(new Fraction(1, 3)));
        assertEquals(new Fraction(-2, 3), new Fraction(1, 2).divide(new Fraction(-3, 4)));
    }

    @Test
    public void testDivideByZeroAndNullThrow() throws Exception {
        try {
            new Fraction(1, 2).divide(Fraction.ZERO);
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) { }
        try {
            new Fraction(1, 2).divide((Fraction) null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) { }
    }

    @Test
    public void testPercentageValue() throws Exception {
        assertEquals(25.0, new Fraction(1, 4).percentageValue(), 0.0);
        assertEquals(-150.0, new Fraction(-3, 2).percentageValue(), 0.0);
    }

    @Test
    public void testReducedFractionSignsAndReduction() throws Exception {
        assertEquals(new Fraction(3, 4), Fraction.getReducedFraction(6, 8));
        assertEquals(new Fraction(-3, 4), Fraction.getReducedFraction(6, -8));
        assertEquals(new Fraction(-3, 4), Fraction.getReducedFraction(-6, 8));
    }

    @Test
    public void testReducedFractionZeroAndMinimumDenominator() throws Exception {
        assertSame(Fraction.ZERO, Fraction.getReducedFraction(0, Integer.MIN_VALUE));
        assertEquals(new Fraction(-1, 1073741824),
                     Fraction.getReducedFraction(2, Integer.MIN_VALUE));
    }

    @Test
    public void testReducedFractionInvalidDenominatorsThrow() throws Exception {
        try {
            Fraction.getReducedFraction(1, 0);
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) { }
        try {
            Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) { }
    }
}
