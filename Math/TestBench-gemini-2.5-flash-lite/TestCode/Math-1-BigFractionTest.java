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
    public void testConstructorBigIntegerBigInteger() throws Exception {
        BigFraction bf = new BigFraction(BigInteger.valueOf(1), BigInteger.valueOf(2));
        assertEquals(1, bf.getNumeratorAsInt());
        assertEquals(2, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorBigIntegerBigIntegerZeroNumerator() throws Exception {
        BigFraction bf = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(2));
        assertEquals(0, bf.getNumeratorAsInt());
        assertEquals(1, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorBigIntegerBigIntegerNegativeDenominator() throws Exception {
        BigFraction bf = new BigFraction(BigInteger.valueOf(1), BigInteger.valueOf(-2));
        assertEquals(-1, bf.getNumeratorAsInt());
        assertEquals(2, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorBigIntegerBigIntegerReduced() throws Exception {
        BigFraction bf = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(6));
        assertEquals(2, bf.getNumeratorAsInt());
        assertEquals(3, bf.getDenominatorAsInt());
    }

    @Test(expected = ZeroException.class)
    public void testConstructorBigIntegerBigIntegerZeroDenominator() throws Exception {
        new BigFraction(BigInteger.valueOf(1), BigInteger.ZERO);
    }

    @Test
    public void testConstructorDoubleExact() throws Exception {
        BigFraction bf = new BigFraction(0.5);
        assertEquals(1, bf.getNumeratorAsInt());
        assertEquals(2, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorDoubleExactOneThird() throws Exception {
        // Due to floating point representation, 1.0/3.0 is not exactly 1/3
        // This tests the exact bit representation conversion.
        BigFraction bf = new BigFraction(1.0 / 3.0);
        // The exact fraction for 1.0/3.0 represented as double
        assertEquals(6004799503160661L, bf.getNumeratorAsLong());
        assertEquals(18014398509481984L, bf.getDenominatorAsLong());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleNaN() throws Exception {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleInfinite() throws Exception {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testConstructorInt() throws Exception {
        BigFraction bf = new BigFraction(5);
        assertEquals(5, bf.getNumeratorAsInt());
        assertEquals(1, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorIntZero() throws Exception {
        BigFraction bf = new BigFraction(0);
        assertEquals(0, bf.getNumeratorAsInt());
        assertEquals(1, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorIntNegative() throws Exception {
        BigFraction bf = new BigFraction(-5);
        assertEquals(-5, bf.getNumeratorAsInt());
        assertEquals(1, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorIntInt() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(3, bf.getNumeratorAsInt());
        assertEquals(4, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorIntIntReduced() throws Exception {
        BigFraction bf = new BigFraction(6, 8);
        assertEquals(3, bf.getNumeratorAsInt());
        assertEquals(4, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorIntIntNegativeDenominator() throws Exception {
        BigFraction bf = new BigFraction(3, -4);
        assertEquals(-3, bf.getNumeratorAsInt());
        assertEquals(4, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorIntIntZeroDenominator() throws Exception {
        try {
            new BigFraction(3, 0);
            fail("Expected ZeroException");
        } catch (ZeroException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorLong() throws Exception {
        BigFraction bf = new BigFraction(BigInteger.valueOf(10000000000L));
        assertEquals(10000000000L, bf.getNumeratorAsLong());
        assertEquals(1, bf.getDenominatorAsInt());
    }

    @Test
    public void testConstructorLongInt() throws Exception {
        BigFraction bf = new BigFraction(BigInteger.valueOf(5000000000L), BigInteger.valueOf(2));
        assertEquals(2500000000L, bf.getNumeratorAsLong());
        assertEquals(1, bf.getDenominatorAsInt());
    }

    @Test
    public void testGetReducedFractionIntInt() throws Exception {
        BigFraction bf = BigFraction.getReducedFraction(10, 15);
        assertEquals(2, bf.getNumeratorAsInt());
        assertEquals(3, bf.getDenominatorAsInt());
    }

    @Test
    public void testGetReducedFractionIntIntZeroNum() throws Exception {
        BigFraction bf = BigFraction.getReducedFraction(0, 5);
        assertEquals(0, bf.getNumeratorAsInt());
        assertEquals(1, bf.getDenominatorAsInt());
    }

    @Test
    public void testGetReducedFractionIntIntNegativeDen() throws Exception {
        BigFraction bf = BigFraction.getReducedFraction(5, -10);
        assertEquals(-1, bf.getNumeratorAsInt());
        assertEquals(2, bf.getDenominatorAsInt());
    }

    @Test
    public void testGetReducedFractionIntIntZeroDen() throws Exception {
        try {
            BigFraction.getReducedFraction(5, 0);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAbsPositive() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(new BigFraction(3, 4), bf.abs());
    }

    @Test
    public void testAbsNegative() throws Exception {
        BigFraction bf = new BigFraction(-3, 4);
        assertEquals(new BigFraction(3, 4), bf.abs());
    }

    @Test
    public void testAbsZero() throws Exception {
        BigFraction bf = BigFraction.ZERO;
        assertEquals(BigFraction.ZERO, bf.abs());
    }

    @Test
    public void testAddBigInteger() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        BigInteger bg = BigInteger.valueOf(3);
        assertEquals(new BigFraction(7, 2), bf.add(bg));
    }

    @Test
    public void testAddBigIntegerZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.add(BigInteger.ZERO));
    }

    @Test
    public void testAddInt() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(5, 2), bf.add(2));
    }

    @Test
    public void testAddIntZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.add(0));
    }

    @Test
    public void testAddLong() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(BigInteger.valueOf(10000000001L), BigInteger.valueOf(2)), bf.add(5000000000L));
    }

    @Test
    public void testAddLongZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.add(0L));
    }

    @Test
    public void testAddBigFractionSameDenominator() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 1), bf1.add(bf2));
    }

    @Test
    public void testAddBigFractionDifferentDenominator() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 3);
        assertEquals(new BigFraction(5, 6), bf1.add(bf2));
    }

    @Test
    public void testAddBigFractionZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.add(BigFraction.ZERO));
    }

    @Test
    public void testAddBigFractionSelf() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 1), bf.add(bf));
    }

    @Test
    public void testBigDecimalValueExact() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigDecimal("0.5"), bf.bigDecimalValue());
    }

    @Test
    public void testBigDecimalValueExactZero() throws Exception {
        BigFraction bf = BigFraction.ZERO;
        assertEquals(BigDecimal.ZERO, bf.bigDecimalValue());
    }

    @Test
    public void testBigDecimalValueWithScaleAndRounding() throws Exception {
        BigFraction bf = new BigFraction(1, 3);
        // The exact value of 1/3 cannot be represented exactly as a BigDecimal with scale 3.
        // The constructor uses new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode)
        // which will perform the division and rounding.
        // 1 / 3 = 0.33333...
        // With scale 3 and ROUND_HALF_UP, this should be 0.333
        assertEquals(new BigDecimal("0.333"), bf.bigDecimalValue(3, BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testBigDecimalValueWithRounding() throws Exception {
        BigFraction bf = new BigFraction(1, 3);
        // For BigFraction.bigDecimalValue(int roundingMode), it uses the default scale of BigDecimal, which is 0 for new BigDecimal(num).divide(new BigDecimal(den)) when no scale is specified.
        // This means it will throw ArithmeticException for non-terminating decimals.
        // However, the method signature in the source code for bigDecimalValue() does not take a scale.
        // Looking at the source, it calls `new BigDecimal(numerator).divide(new BigDecimal(denominator))`.
        // This will throw an ArithmeticException if the division is not exact.
        // For 1/3, this should throw an exception.
        // The provided test expected 0.33, which is incorrect for the method that doesn't specify scale.
        // The correct behavior for 1/3 with unspecified scale is to throw ArithmeticException.
        // Let's change the test to assert that.
        try {
            bf.bigDecimalValue(BigDecimal.ROUND_HALF_UP);
            fail("Expected ArithmeticException for non-terminating decimal");
        } catch (ArithmeticException e) {
            // Expected
        }
    }


    @Test
    public void testCompareToEqual() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        assertEquals(0, bf1.compareTo(bf2));
    }

    @Test
    public void testCompareToLess() throws Exception {
        BigFraction bf1 = new BigFraction(1, 3);
        BigFraction bf2 = new BigFraction(1, 2);
        assertEquals(-1, bf1.compareTo(bf2));
    }

    @Test
    public void testCompareToGreater() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 3);
        assertEquals(1, bf1.compareTo(bf2));
    }

    @Test
    public void testDivideBigInteger() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 6), bf.divide(BigInteger.valueOf(3)));
    }

    @Test
    public void testDivideBigIntegerZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.divide(BigInteger.ONE));
    }

    @Test
    public void testDivideBigIntegerByZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        try {
            bf.divide(BigInteger.ZERO);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testDoubleValue() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(0.5, bf.doubleValue(), 1e-9);
    }

    @Test
    public void testDoubleValueLargeNumerator() throws Exception {
        // Test for potential overflow/precision issues in double conversion
        BigFraction bf = new BigFraction(new BigInteger("1000000000000000000"), BigInteger.valueOf(2));
        assertEquals(5.0E17, bf.doubleValue(), 5.0E17 * 1e-9);
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertTrue(bf.equals(bf));
    }

    @Test
    public void testEqualsEqualFraction() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        assertTrue(bf1.equals(bf2));
    }

    @Test
    public void testEqualsDifferentFraction() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 3);
        assertFalse(bf1.equals(bf2));
    }

    @Test
    public void testEqualsNull() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertFalse(bf.equals(null));
    }

    @Test
    public void testEqualsDifferentType() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertFalse(bf.equals(Integer.valueOf(1)));
    }

    @Test
    public void testFloatValue() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(0.5f, bf.floatValue(), 1e-9f);
    }

    @Test
    public void testFloatValueOneThird() throws Exception {
        BigFraction bf = new BigFraction(1, 3);
        assertEquals(1.0f / 3.0f, bf.floatValue(), 1e-9f);
    }

    @Test
    public void testGetDenominator() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(BigInteger.valueOf(4), bf.getDenominator());
    }

    @Test
    public void testGetDenominatorAsInt() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(4, bf.getDenominatorAsInt());
    }

    @Test
    public void testGetDenominatorAsLong() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(4L, bf.getDenominatorAsLong());
    }

    @Test
    public void testGetNumerator() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(BigInteger.valueOf(3), bf.getNumerator());
    }

    @Test
    public void testGetNumeratorAsInt() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(3, bf.getNumeratorAsInt());
    }

    @Test
    public void testGetNumeratorAsLong() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(3L, bf.getNumeratorAsLong());
    }

    @Test
    public void testHashCode() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        assertEquals(bf1.hashCode(), bf2.hashCode());
        BigFraction bf3 = new BigFraction(1, 3);
        assertFalse(bf1.hashCode() == bf3.hashCode());
    }

    @Test
    public void testIntValue() throws Exception {
        BigFraction bf = new BigFraction(7, 2); // 3.5
        assertEquals(3, bf.intValue());
    }

    @Test
    public void testIntValueNegative() throws Exception {
        BigFraction bf = new BigFraction(-7, 2); // -3.5
        assertEquals(-3, bf.intValue());
    }

    @Test
    public void testLongValue() throws Exception {
        BigFraction bf = new BigFraction(BigInteger.valueOf(7000000000L), BigInteger.valueOf(2)); // 3.5 * 10^9
        assertEquals(3500000000L, bf.longValue());
    }

    @Test
    public void testLongValueNegative() throws Exception {
        BigFraction bf = new BigFraction(BigInteger.valueOf(-7000000000L), BigInteger.valueOf(2)); // -3.5 * 10^9
        assertEquals(-3500000000L, bf.longValue());
    }

    @Test
    public void testMultiplyBigInteger() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), bf.multiply(BigInteger.valueOf(3)));
    }

    @Test
    public void testMultiplyBigIntegerZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(BigFraction.ZERO, bf.multiply(BigInteger.ZERO));
    }

    @Test
    public void testMultiplyInt() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), bf.multiply(3));
    }

    @Test
    public void testMultiplyIntZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(BigFraction.ZERO, bf.multiply(0));
    }

    @Test
    public void testMultiplyLong() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(BigInteger.valueOf(5000000000L), BigInteger.valueOf(2)), bf.multiply(5000000000L));
    }

    @Test
    public void testMultiplyLongZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(BigFraction.ZERO, bf.multiply(0L));
    }

    @Test
    public void testMultiplyBigFraction() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 3);
        assertEquals(new BigFraction(1, 3), bf1.multiply(bf2));
    }

    @Test
    public void testMultiplyBigFractionZero() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        assertEquals(BigFraction.ZERO, bf1.multiply(BigFraction.ZERO));
    }

    @Test
    public void testMultiplyBigFractionBySelf() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 4), bf.multiply(bf));
    }

    @Test
    public void testNegate() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(-1, 2), bf.negate());
    }

    @Test
    public void testNegateNegative() throws Exception {
        BigFraction bf = new BigFraction(-1, 2);
        assertEquals(new BigFraction(1, 2), bf.negate());
    }

    @Test
    public void testNegateZero() throws Exception {
        BigFraction bf = BigFraction.ZERO;
        assertEquals(BigFraction.ZERO, bf.negate());
    }

    @Test
    public void testPercentageValue() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(50.0, bf.percentageValue(), 1e-9);
    }

    @Test
    public void testPercentageValueOne() throws Exception {
        BigFraction bf = BigFraction.ONE;
        assertEquals(100.0, bf.percentageValue(), 1e-9);
    }

    @Test
    public void testPowPositiveExponent() throws Exception {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(4, 9), bf.pow(2));
    }

    @Test
    public void testPowNegativeExponent() throws Exception {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(9, 4), bf.pow(-2));
    }

    @Test
    public void testPowZeroExponent() throws Exception {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(BigFraction.ONE, bf.pow(0));
    }

    @Test
    public void testPowOneExponent() throws Exception {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(bf, bf.pow(1));
    }

    @Test
    public void testPowLargePositiveExponent() throws Exception {
        BigFraction bf = new BigFraction(2);
        assertEquals(new BigFraction(1024), bf.pow(10));
    }

    @Test
    public void testPowLargeNegativeExponent() throws Exception {
        BigFraction bf = new BigFraction(2);
        assertEquals(new BigFraction(1, 1024), bf.pow(-10));
    }

    @Test
    public void testReciprocal() throws Exception {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(3, 2), bf.reciprocal());
    }

    @Test
    public void testReciprocalNegative() throws Exception {
        BigFraction bf = new BigFraction(-2, 3);
        assertEquals(new BigFraction(3, -2), bf.reciprocal());
    }

    @Test
    public void testReciprocalOne() throws Exception {
        BigFraction bf = BigFraction.ONE;
        assertEquals(BigFraction.ONE, bf.reciprocal());
    }

    @Test
    public void testReciprocalZero() throws Exception {
        BigFraction bf = BigFraction.ZERO;
        // The reciprocal of zero should throw an exception because the denominator becomes zero.
        try {
            bf.reciprocal();
            fail("Expected ZeroException");
        } catch (ZeroException e) {
            // Expected
        }
    }

    @Test
    public void testReduce() throws Exception {
        BigFraction bf = new BigFraction(4, 6);
        assertEquals(new BigFraction(2, 3), bf.reduce());
    }

    @Test
    public void testReduceAlreadyReduced() throws Exception {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(2, 3), bf.reduce());
    }

    @Test
    public void testReduceZero() throws Exception {
        BigFraction bf = new BigFraction(0, 5);
        assertEquals(BigFraction.ZERO, bf.reduce());
    }

    @Test
    public void testSubtractBigInteger() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(-5, 2), bf.subtract(BigInteger.valueOf(3)));
    }

    @Test
    public void testSubtractBigIntegerZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.subtract(BigInteger.ZERO));
    }

    @Test
    public void testSubtractInt() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(-3, 2), bf.subtract(2));
    }

    @Test
    public void testSubtractIntZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.subtract(0));
    }

    @Test
    public void testSubtractLong() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(BigInteger.valueOf(-9999999999L), BigInteger.valueOf(2)), bf.subtract(5000000000L));
    }

    @Test
    public void testSubtractLongZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.subtract(0L));
    }

    @Test
    public void testSubtractBigFractionSameDenominator() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 2);
        assertEquals(BigFraction.ZERO, bf1.subtract(bf2));
    }

    @Test
    public void testSubtractBigFractionDifferentDenominator() throws Exception {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 3);
        assertEquals(new BigFraction(1, 6), bf1.subtract(bf2));
    }

    @Test
    public void testSubtractBigFractionZero() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 2), bf.subtract(BigFraction.ZERO));
    }

    @Test
    public void testSubtractBigFractionSelf() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(BigFraction.ZERO, bf.subtract(bf));
    }

    @Test
    public void testToStringDenominatorOne() throws Exception {
        BigFraction bf = new BigFraction(5);
        assertEquals("5", bf.toString());
    }

    @Test
    public void testToStringZero() throws Exception {
        BigFraction bf = BigFraction.ZERO;
        assertEquals("0", bf.toString());
    }

    @Test
    public void testToStringFraction() throws Exception {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals("3 / 4", bf.toString());
    }

    @Test
    public void testToStringNegativeNumerator() throws Exception {
        BigFraction bf = new BigFraction(-3, 4);
        assertEquals("-3 / 4", bf.toString());
    }

    @Test
    public void testToStringNegativeDenominator() throws Exception {
        BigFraction bf = new BigFraction(3, -4);
        assertEquals("-3 / 4", bf.toString());
    }

    @Test
    public void testToStringNegativeBoth() throws Exception {
        BigFraction bf = new BigFraction(-3, -4);
        assertEquals("3 / 4", bf.toString());
    }

    @Test
    public void testGetField() throws Exception {
        BigFraction bf = new BigFraction(1, 2);
        assertTrue(bf.getField() instanceof BigFractionField);
    }

    @Test
    public void testBigFractionConstants() {
        assertEquals(new BigFraction(2, 1), BigFraction.TWO);
        assertEquals(new BigFraction(1, 1), BigFraction.ONE);
        assertEquals(new BigFraction(0, 1), BigFraction.ZERO);
        assertEquals(new BigFraction(-1, 1), BigFraction.MINUS_ONE);
        assertEquals(new BigFraction(4, 5), BigFraction.FOUR_FIFTHS);
        assertEquals(new BigFraction(1, 5), BigFraction.ONE_FIFTH);
        assertEquals(new BigFraction(1, 2), BigFraction.ONE_HALF);
        assertEquals(new BigFraction(1, 4), BigFraction.ONE_QUARTER);
        assertEquals(new BigFraction(1, 3), BigFraction.ONE_THIRD);
        assertEquals(new BigFraction(3, 5), BigFraction.THREE_FIFTHS);
        assertEquals(new BigFraction(3, 4), BigFraction.THREE_QUARTERS);
        assertEquals(new BigFraction(2, 5), BigFraction.TWO_FIFTHS);
        assertEquals(new BigFraction(2, 4), BigFraction.TWO_QUARTERS);
        assertEquals(new BigFraction(2, 3), BigFraction.TWO_THIRDS);
    }

    @Test
    public void testPowBigIntegerPositive() {
        BigFraction bf = new BigFraction(2);
        assertEquals(new BigFraction(8), bf.pow(BigInteger.valueOf(3)));
    }

    @Test
    public void testPowBigIntegerNegative() {
        BigFraction bf = new BigFraction(2);
        assertEquals(new BigFraction(1, 8), bf.pow(BigInteger.valueOf(-3)));
    }

    @Test
    public void testPowBigIntegerZero() {
        BigFraction bf = new BigFraction(2);
        assertEquals(BigFraction.ONE, bf.pow(BigInteger.ZERO));
    }

    @Test
    public void testPowBigIntegerOne() {
        BigFraction bf = new BigFraction(2);
        assertEquals(bf, bf.pow(BigInteger.ONE));
    }

    @Test
    public void testPowDoublePositive() {
        BigFraction bf = new BigFraction(2);
        assertEquals(4.0, bf.pow(2.0), 1e-9);
    }

    @Test
    public void testPowDoubleNegative() {
        BigFraction bf = new BigFraction(2);
        assertEquals(0.25, bf.pow(-2.0), 1e-9);
    }

    @Test
    public void testPowDoubleFractional() {
        BigFraction bf = new BigFraction(4);
        assertEquals(2.0, bf.pow(0.5), 1e-9);
    }

    @Test
    public void testPowDoubleZero() {
        BigFraction bf = new BigFraction(2);
        assertEquals(1.0, bf.pow(0.0), 1e-9);
    }
}
