package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.FieldElement;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.ZeroException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.ArithmeticUtils;

public class BigFractionTest {
    @Test
    public void testReducedFractionNormalizesZero() throws Exception {
        BigFraction f = BigFraction.getReducedFraction(0, -7);
        assertEquals(BigInteger.ZERO, f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testReducedFractionReducesAndMovesSign() throws Exception {
        BigFraction f = BigFraction.getReducedFraction(6, -8);
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testAbsoluteValueOfNegativeFraction() throws Exception {
        assertEquals(new BigFraction(3, 4), new BigFraction(-6, 8).abs());
    }

    @Test
    public void testAbsoluteValueOfNonnegativeFraction() throws Exception {
        BigFraction f = new BigFraction(3, 4);
        assertEquals(f, f.abs());
    }

    @Test
    public void testAddBigInteger() throws Exception {
        assertEquals(new BigFraction(11, 3), new BigFraction(2, 3).add(BigInteger.valueOf(3)));
    }

    @Test
    public void testBigDecimalValueTerminatingQuotient() throws Exception {
        assertEquals(new BigDecimal("0.125"), new BigFraction(1, 8).bigDecimalValue());
    }

    @Test
    public void testCompareFractionsWithDifferentDenominators() throws Exception {
        assertTrue(new BigFraction(2, 3).compareTo(new BigFraction(3, 5)) > 0);
    }

    @Test
    public void testDivideByBigIntegerReducesResult() throws Exception {
        assertEquals(new BigFraction(1, 6), new BigFraction(1, 2).divide(BigInteger.valueOf(3)));
    }

    @Test
    public void testDoubleValue() throws Exception {
        assertEquals(0.75, new BigFraction(3, 4).doubleValue(), 1e-12);
    }

    @Test
    public void testEqualsReducedRepresentations() throws Exception {
        assertTrue(new BigFraction(2, 4).equals(new BigFraction(1, 2)));
        assertFalse(new BigFraction(1, 2).equals(null));
    }

    @Test
    public void testFloatValue() throws Exception {
        assertEquals(0.75f, new BigFraction(3, 4).floatValue(), 1e-6f);
    }

    @Test
    public void testBigIntegerAccessors() throws Exception {
        BigFraction f = new BigFraction(-7, 9);
        assertEquals(BigInteger.valueOf(-7), f.getNumerator());
        assertEquals(BigInteger.valueOf(9), f.getDenominator());
    }

    @Test
    public void testNarrowAccessorsAtIntegerLimits() throws Exception {
        BigFraction f = new BigFraction(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE, f.getNumeratorAsInt());
        assertEquals((long) Integer.MAX_VALUE, f.getNumeratorAsLong());
        assertEquals(1, f.getDenominatorAsInt());
        assertEquals(1L, f.getDenominatorAsLong());
    }

    @Test
    public void testHashCodeMatchesEqualFraction() throws Exception {
        assertEquals(new BigFraction(1, 2).hashCode(), new BigFraction(2, 4).hashCode());
    }

    @Test
    public void testIntegerAndLongValueTruncateTowardZero() throws Exception {
        BigFraction f = new BigFraction(-7, 3);
        assertEquals(-2, f.intValue());
        assertEquals(-2L, f.longValue());
    }

    @Test
    public void testMultiplyBigInteger() throws Exception {
        assertEquals(new BigFraction(5, 3), new BigFraction(5, 6).multiply(BigInteger.valueOf(2)));
    }

    @Test
    public void testNegate() throws Exception {
        assertEquals(new BigFraction(-3, 4), new BigFraction(3, 4).negate());
    }

    @Test
    public void testPercentageValue() throws Exception {
        assertEquals(37.5, new BigFraction(3, 8).percentageValue(), 1e-12);
    }

    @Test
    public void testPowPositiveZeroAndNegative() throws Exception {
        BigFraction f = new BigFraction(2, 3);
        assertEquals(new BigFraction(8, 27), f.pow(3));
        assertEquals(BigFraction.ONE, f.pow(0));
        assertEquals(new BigFraction(3, 2), f.pow(-1));
    }

    @Test
    public void testReciprocal() throws Exception {
        assertEquals(new BigFraction(3, 2), new BigFraction(2, 3).reciprocal());
    }

    @Test
    public void testReduce() throws Exception {
        assertEquals(new BigFraction(3, 4), new BigFraction(6, 8).reduce());
    }

    @Test
    public void testSubtractBigInteger() throws Exception {
        assertEquals(new BigFraction(-7, 3), new BigFraction(2, 3).subtract(BigInteger.valueOf(3)));
    }

    @Test
    public void testToStringForIntegerAndFraction() throws Exception {
        assertEquals("-2", new BigFraction(-2).toString());
        assertEquals("3 / 4", new BigFraction(3, 4).toString());
    }

    @Test
    public void testGetFieldIsSingleton() throws Exception {
        assertSame(BigFraction.ONE.getField(), BigFraction.ZERO.getField());
    }
}
