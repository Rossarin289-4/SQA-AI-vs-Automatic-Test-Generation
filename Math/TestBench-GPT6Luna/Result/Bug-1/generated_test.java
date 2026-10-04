package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

public class BigFractionTest {
    @Test
    public void testReducedFractionNormalizesSignsAndTerms() throws Exception {
        BigFraction f = BigFraction.getReducedFraction(6, -8);
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testReducedFractionZeroIsCanonical() throws Exception {
        BigFraction f = BigFraction.getReducedFraction(0, -7);
        assertEquals(BigInteger.ZERO, f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testAbsoluteValueOfNegativeFraction() throws Exception {
        BigFraction f = new BigFraction(-3, 4).abs();
        assertEquals(BigInteger.valueOf(3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testAddBigInteger() throws Exception {
        BigFraction f = new BigFraction(3, 4).add(BigInteger.valueOf(2));
        assertEquals(BigInteger.valueOf(11), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testExactBigDecimalValue() throws Exception {
        assertEquals(new BigDecimal("0.125"), new BigFraction(1, 8).bigDecimalValue());
    }

    @Test
    public void testCompareFractionsWithDifferentDenominators() throws Exception {
        assertEquals(-1, new BigFraction(2, 5).compareTo(new BigFraction(1, 2)));
    }

    @Test
    public void testDivideByBigInteger() throws Exception {
        BigFraction f = new BigFraction(3, 4).divide(BigInteger.valueOf(-2));
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(8), f.getDenominator());
    }

    @Test
    public void testDoubleValue() throws Exception {
        assertEquals(0.75, new BigFraction(3, 4).doubleValue(), 1e-12);
    }

    @Test
    public void testEqualsUsesFractionValue() throws Exception {
        assertTrue(new BigFraction(2, 4).equals(new BigFraction(1, 2)));
        assertFalse(new BigFraction(1, 2).equals(null));
    }

    @Test
    public void testFloatValue() throws Exception {
        assertEquals(0.75f, new BigFraction(3, 4).floatValue(), 1e-6f);
    }

    @Test
    public void testGetDenominatorAndNarrowConversions() throws Exception {
        BigFraction f = new BigFraction(7, 3);
        assertEquals(BigInteger.valueOf(3), f.getDenominator());
        assertEquals(3, f.getDenominatorAsInt());
        assertEquals(3L, f.getDenominatorAsLong());
    }

    @Test
    public void testGetNumeratorAndNarrowConversions() throws Exception {
        BigFraction f = new BigFraction(-7, 3);
        assertEquals(BigInteger.valueOf(-7), f.getNumerator());
        assertEquals(-7, f.getNumeratorAsInt());
        assertEquals(-7L, f.getNumeratorAsLong());
    }

    @Test
    public void testHashCodeMatchesEqualFraction() throws Exception {
        assertEquals(new BigFraction(1, 2).hashCode(), new BigFraction(2, 4).hashCode());
    }

    @Test
    public void testIntegerConversionsTruncateTowardZero() throws Exception {
        BigFraction f = new BigFraction(-7, 3);
        assertEquals(-2, f.intValue());
        assertEquals(-2L, f.longValue());
    }

    @Test
    public void testMultiplyByBigInteger() throws Exception {
        BigFraction f = new BigFraction(3, 4).multiply(BigInteger.valueOf(-2));
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testNegate() throws Exception {
        BigFraction f = new BigFraction(3, 4).negate();
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testPercentageValue() throws Exception {
        assertEquals(75.0, new BigFraction(3, 4).percentageValue(), 1e-12);
    }

    @Test
    public void testIntegerPower() throws Exception {
        BigFraction f = new BigFraction(2, 3).pow(3);
        assertEquals(BigInteger.valueOf(8), f.getNumerator());
        assertEquals(BigInteger.valueOf(27), f.getDenominator());
    }

    @Test
    public void testNegativeIntegerPower() throws Exception {
        BigFraction f = new BigFraction(2, 3).pow(-2);
        assertEquals(BigInteger.valueOf(9), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testReciprocal() throws Exception {
        BigFraction f = new BigFraction(-2, 3).reciprocal();
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testReduce() throws Exception {
        BigFraction f = new BigFraction(BigInteger.valueOf(6), BigInteger.valueOf(8)).reduce();
        assertEquals(BigInteger.valueOf(3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testSubtractBigInteger() throws Exception {
        BigFraction f = new BigFraction(3, 4).subtract(BigInteger.valueOf(2));
        assertEquals(BigInteger.valueOf(-5), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testToStringForProperFractionAndInteger() throws Exception {
        assertEquals("3 / 4", new BigFraction(3, 4).toString());
        assertEquals("-2", new BigFraction(-2).toString());
    }

    @Test
    public void testFieldIsSingleton() throws Exception {
        assertSame(BigFraction.ONE.getField(), BigFraction.ZERO.getField());
    }
}
