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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorBigInteger() {
        BigFraction bf = new BigFraction(BigInteger.valueOf(2));
        assertEquals(BigInteger.valueOf(2), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerBigIntegerReduced() {
        BigFraction bf = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(6));
        assertEquals(BigInteger.valueOf(2), bf.getNumerator());
        assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerBigIntegerNegativeDenominator() {
        BigFraction bf = new BigFraction(BigInteger.valueOf(2), BigInteger.valueOf(-3));
        assertEquals(BigInteger.valueOf(-2), bf.getNumerator());
        assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerBigIntegerZeroNumerator() {
        BigFraction bf = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        assertEquals(BigInteger.ZERO, bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test(expected = ZeroException.class)
    public void testConstructorBigIntegerBigIntegerZeroDenominator() {
        new BigFraction(BigInteger.valueOf(2), BigInteger.ZERO);
    }

    @Test
    public void testConstructorDoubleExact() {
        BigFraction bf = new BigFraction(1.5);
        assertEquals(BigInteger.valueOf(3), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());
    }

    @Test
    public void testConstructorDoubleExactLarge() {
        double value = 1.0 / 3.0; // This is not exactly 1/3 in double representation
        BigFraction bf = new BigFraction(value);
        // The actual bits of 1.0/3.0 are used
        // 0.3333333333333333
        // 6004799503160661 / 18014398509481984
        assertEquals(BigInteger.valueOf(6004799503160661L), bf.getNumerator());
        assertEquals(BigInteger.valueOf(18014398509481984L), bf.getDenominator());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleNaN() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleInfinite() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testConstructorDoubleDoubleIntMaxIter() throws Exception {
        BigFraction bf = new BigFraction(0.75, 1.0e-12, 100);
        assertEquals(BigInteger.valueOf(3), bf.getNumerator());
        assertEquals(BigInteger.valueOf(4), bf.getDenominator());
    }

    @Test
    public void testConstructorDoubleDoubleIntMaxIterNearInteger() throws Exception {
        BigFraction bf = new BigFraction(2.000000000000001, 1.0e-12, 100);
        assertEquals(BigInteger.valueOf(2), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorDoubleDoubleIntMaxIterEpsilonZero() throws Exception {
        BigFraction bf = new BigFraction(0.5, 0, 100);
        assertEquals(BigInteger.ONE, bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());
    }

    @Test
    public void testConstructorDoubleIntMaxDen() throws Exception {
        BigFraction bf = new BigFraction(0.75, 1000);
        assertEquals(BigInteger.valueOf(3), bf.getNumerator());
        assertEquals(BigInteger.valueOf(4), bf.getDenominator());
    }

    @Test
    public void testConstructorDoubleIntMaxDenNoExactMatch() throws Exception {
        // Approximates 1/3 with max denominator of 1000
        BigFraction bf = new BigFraction(0.3333333, 1000);
        // Tracing the constructor:
        // value = 0.3333333
        // a0 = 0
        // r1 = 1 / (0.3333333 - 0) = 1 / 0.3333333 = 3.0000003
        // a1 = 3
        // p2 = (3 * 1) + 1 = 4
        // q2 = (3 * 1) + 0 = 3
        // convergent = 4/3 = 1.333...
        // Next iteration:
        // r0 = 3.0000003
        // a0 = 3
        // r1 = 1 / (3.0000003 - 3) = 1 / 0.0000003 = 3333333.33...
        // a1 = 3333333
        // p0 = 1, q0 = 0, p1 = 3, q1 = 1
        // p2 = (3333333 * 3) + 1 = 9999999 + 1 = 10000000
        // q2 = (3333333 * 1) + 0 = 3333333
        // The constructor uses a maxDenominator of 1000.
        // The fraction 1/3 is closer to 0.3333333 than 333/1000.
        // Let's re-evaluate the convergents for 0.3333333:
        // value = 0.3333333
        // 1st convergent: 0/1 = 0
        // 2nd convergent: 1/(1/0.3333333) = 1/3.0000003 = 0.33333331
        // With maxDenominator=1000, the last convergent that is within epsilon and under maxDenominator is used.
        // The actual approximation for 1/3 is 333/1000. Let's check if 333/1000 is within epsilon
        // abs(0.3333333 - (333.0/1000.0)) = abs(0.3333333 - 0.333) = 0.0003333
        // The default epsilon is 0, so it will try to find the exact fraction or the one that fits maxDenominator.
        // The source code for BigFraction(double value, int maxDenominator) calls BigFraction(value, 0, maxDenominator, 100);
        // The internal logic for epsilon=0 should be to find the best rational approximation.
        // For 0.3333333, convergents are: 0/1, 1/3, 333/1000, ...
        // The first convergent 1/3 has denominator 3, which is less than 1000. So it should return 1/3.
        assertEquals(BigInteger.ONE, bf.getNumerator());
        assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testConstructorInt() {
        BigFraction bf = new BigFraction(5);
        assertEquals(BigInteger.valueOf(5), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorIntInt() {
        BigFraction bf = new BigFraction(5, 2);
        assertEquals(BigInteger.valueOf(5), bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());
    }

    @Test
    public void testConstructorIntIntReduced() {
        BigFraction bf = new BigFraction(6, 9);
        assertEquals(BigInteger.valueOf(2), bf.getNumerator());
        assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testConstructorLong() {
        BigFraction bf = new BigFraction(5000000000L);
        assertEquals(BigInteger.valueOf(5000000000L), bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorLongLong() {
        BigFraction bf = new BigFraction(6000000000L, 9000000000L);
        assertEquals(BigInteger.valueOf(2), bf.getNumerator());
        assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testGetReducedFraction() {
        BigFraction bf = BigFraction.getReducedFraction(8, 12);
        assertEquals(BigInteger.valueOf(2), bf.getNumerator());
        assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testGetReducedFractionZeroNumerator() {
        BigFraction bf = BigFraction.getReducedFraction(0, 10);
        assertEquals(BigInteger.ZERO, bf.getNumerator());
        assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testAbsPositive() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(bf, bf.abs());
    }

    @Test
    public void testAbsNegative() {
        BigFraction bf = new BigFraction(-3, 4);
        assertEquals(new BigFraction(3, 4), bf.abs());
    }

    @Test
    public void testAddBigInteger() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), bf.add(BigInteger.ONE));
    }

    @Test
    public void testAddInt() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(5, 2), bf.add(2));
    }

    @Test
    public void testAddLong() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(5, 2), bf.add(2L));
    }

    @Test
    public void testAddBigFraction() {
        BigFraction bf = new BigFraction(1, 2);
        // 1/2 + 2/3 = 3/6 + 4/6 = 7/6
        assertEquals(new BigFraction(7, 6), bf.add(new BigFraction(2, 3)));
    }

    @Test
    public void testAddBigFractionSameDenominator() {
        BigFraction bf = new BigFraction(1, 2);
        // 1/2 + 1/2 = 2/2 = 1
        assertEquals(new BigFraction(1), bf.add(new BigFraction(1, 2)));
    }

    @Test
    public void testAddBigFractionZero() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(bf, bf.add(BigFraction.ZERO));
    }

    @Test(expected = NullArgumentException.class)
    public void testAddBigFractionNull() {
        new BigFraction(1, 2).add((BigFraction) null);
    }

    @Test
    public void testBigDecimalValue() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigDecimal("0.5"), bf.bigDecimalValue());
    }

    @Test
    public void testBigDecimalValueScaleAndRounding() {
        BigFraction bf = new BigFraction(1, 3);
        // 1/3 = 0.33333...
        // With scale 3 and ROUND_DOWN: 0.333
        // With scale 3 and ROUND_HALF_UP: 0.333
        // The original test had 0.334 which implies ROUND_HALF_UP for 0.3335 or greater.
        // For 1/3, the digit at scale+1 is 3, so it rounds down for ROUND_HALF_UP.
        assertEquals(new BigDecimal("0.333"), bf.bigDecimalValue(3, BigDecimal.ROUND_DOWN));
        assertEquals(new BigDecimal("0.333"), bf.bigDecimalValue(3, BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testCompareToEqual() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        assertEquals(0, bf1.compareTo(bf2));
    }

    @Test
    public void testCompareToLess() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(3, 4);
        assertEquals(-1, bf1.compareTo(bf2));
    }

    @Test
    public void testCompareToGreater() {
        BigFraction bf1 = new BigFraction(3, 4);
        BigFraction bf2 = new BigFraction(1, 2);
        assertEquals(1, bf1.compareTo(bf2));
    }

    @Test
    public void testDivideBigInteger() {
        BigFraction bf = new BigFraction(3, 4);
        // 3/4 divided by 2 is 3/8
        assertEquals(new BigFraction(3, 8), bf.divide(BigInteger.valueOf(2)));
    }

    @Test
    public void testDivideInt() {
        BigFraction bf = new BigFraction(3, 4);
        // 3/4 divided by 2 is 3/8
        assertEquals(new BigFraction(3, 8), bf.divide(2));
    }

    @Test
    public void testDivideLong() {
        BigFraction bf = new BigFraction(3, 4);
        // 3/4 divided by 2 is 3/8
        assertEquals(new BigFraction(3, 8), bf.divide(2L));
    }

    @Test
    public void testDivideBigFraction() {
        BigFraction bf = new BigFraction(3, 4);
        // (3/4) / (1/2) = (3/4) * (2/1) = 6/4 = 3/2
        assertEquals(new BigFraction(3, 2), bf.divide(new BigFraction(1, 2)));
    }

    @Test(expected = ZeroException.class)
    public void testDivideBigFractionZeroNumerator() {
        BigFraction bf = new BigFraction(3, 4);
        bf.divide(BigFraction.ZERO);
    }

    @Test
    public void testDoubleValue() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(0.5, bf.doubleValue(), 0.0);
    }

    @Test
    public void testDoubleValueLarge() {
        // BigInteger numerator is Long.MAX_VALUE, denominator is 2.
        // doubleValue() divides numerator by denominator.
        // Double.MAX_VALUE is approx 1.7976931348623157E308
        // Long.MAX_VALUE is approx 9.223372036854776E18
        // numerator.doubleValue() / denominator.doubleValue() = Long.MAX_VALUE / 2.0
        // This is a large positive number, not Infinity.
        // Infinity occurs when the result exceeds Double.MAX_VALUE.
        // Long.MAX_VALUE / 2 is well within the double range.
        BigFraction bf = new BigFraction(BigInteger.valueOf(Long.MAX_VALUE), BigInteger.valueOf(2));
        assertEquals(BigInteger.valueOf(Long.MAX_VALUE).doubleValue() / 2.0, bf.doubleValue(), 0.0);
    }

    @Test
    public void testEquals() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        assertTrue(bf1.equals(bf2));
    }

    @Test
    public void testEqualsNotEqual() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 3);
        assertFalse(bf1.equals(bf2));
    }

    @Test
    public void testEqualsNull() {
        BigFraction bf1 = new BigFraction(1, 2);
        assertFalse(bf1.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        BigFraction bf1 = new BigFraction(1, 2);
        assertFalse(bf1.equals(new Double(0.5)));
    }

    @Test
    public void testFloatValue() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(0.5f, bf.floatValue(), 0.0f);
    }

    @Test
    public void testFloatValueLarge() {
        // BigInteger numerator is Integer.MAX_VALUE, denominator is 2.
        // Float.MAX_VALUE is approx 3.4028235E38
        // Integer.MAX_VALUE is approx 2.147483647E9
        // numerator.floatValue() / denominator.floatValue() = Integer.MAX_VALUE / 2.0f
        // This is a large positive float, not Infinity.
        BigFraction bf = new BigFraction(BigInteger.valueOf(Integer.MAX_VALUE), BigInteger.valueOf(2));
        assertEquals(BigInteger.valueOf(Integer.MAX_VALUE).floatValue() / 2.0f, bf.floatValue(), 0.0f);
    }

    @Test
    public void testGetDenominator() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(BigInteger.valueOf(4), bf.getDenominator());
    }

    @Test
    public void testGetDenominatorAsInt() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(4, bf.getDenominatorAsInt());
    }

    @Test
    public void testGetDenominatorAsLong() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(4L, bf.getDenominatorAsLong());
    }

    @Test
    public void testGetNumerator() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(BigInteger.valueOf(3), bf.getNumerator());
    }

    @Test
    public void testGetNumeratorAsInt() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(3, bf.getNumeratorAsInt());
    }

    @Test
    public void testGetNumeratorAsLong() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(3L, bf.getNumeratorAsLong());
    }

    @Test
    public void testHashCode() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        assertEquals(bf1.hashCode(), bf2.hashCode());
    }

    @Test
    public void testHashCodeNotEqual() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 3);
        assertFalse(bf1.hashCode() == bf2.hashCode());
    }

    @Test
    public void testIntValue() {
        BigFraction bf = new BigFraction(7, 2);
        assertEquals(3, bf.intValue());
    }

    @Test
    public void testLongValue() {
        BigFraction bf = new BigFraction(Long.MAX_VALUE, 2L);
        assertEquals(Long.MAX_VALUE / 2L, bf.longValue());
    }

    @Test
    public void testMultiplyBigInteger() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), bf.multiply(BigInteger.valueOf(3)));
    }

    @Test
    public void testMultiplyInt() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), bf.multiply(3));
    }

    @Test
    public void testMultiplyLong() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), bf.multiply(3L));
    }

    @Test
    public void testMultiplyBigFraction() {
        BigFraction bf = new BigFraction(1, 2);
        // 1/2 * 2/3 = 2/6 = 1/3
        assertEquals(new BigFraction(1, 3), bf.multiply(new BigFraction(2, 3)));
    }

    @Test
    public void testMultiplyBigFractionZero() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(BigFraction.ZERO, bf.multiply(BigFraction.ZERO));
    }

    @Test
    public void testMultiplyBigFractionZeroNumerator() {
        BigFraction bf = new BigFraction(0, 1);
        assertEquals(BigFraction.ZERO, bf.multiply(new BigFraction(2, 3)));
    }

    @Test
    public void testNegate() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(new BigFraction(-3, 4), bf.negate());
    }

    @Test
    public void testPercentageValue() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(50.0, bf.percentageValue(), 0.0);
    }

    @Test
    public void testPowIntPositive() {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(4, 9), bf.pow(2));
    }

    @Test
    public void testPowIntNegative() {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(9, 4), bf.pow(-2));
    }

    @Test
    public void testPowIntZero() {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(BigFraction.ONE, bf.pow(0));
    }

    @Test
    public void testPowIntZeroNumerator() {
        BigFraction bf = new BigFraction(0, 3);
        assertEquals(BigFraction.ZERO, bf.pow(5));
    }

    @Test(expected = ZeroException.class)
    public void testPowIntZeroNumeratorNegativeExp() {
        BigFraction bf = new BigFraction(0, 3);
        bf.pow(-1); // This should throw ZeroException as it's equivalent to 1/0
    }

    @Test
    public void testPowLongPositive() {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(8, 27), bf.pow(3L));
    }

    @Test
    public void testPowLongNegative() {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(27, 8), bf.pow(-3L));
    }

    @Test
    public void testPowBigIntegerPositive() {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(16, 81), bf.pow(BigInteger.valueOf(4)));
    }

    @Test
    public void testPowBigIntegerNegative() {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(new BigFraction(81, 16), bf.pow(BigInteger.valueOf(-4)));
    }

    @Test
    public void testPowDouble() {
        BigFraction bf = new BigFraction(2, 3);
        assertEquals(Math.pow(2.0/3.0, 2.0), bf.pow(2.0), 1e-15);
    }

    @Test
    public void testReciprocal() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals(new BigFraction(4, 3), bf.reciprocal());
    }

    @Test(expected = ZeroException.class)
    public void testReciprocalZero() {
        BigFraction bf = new BigFraction(0, 1);
        bf.reciprocal();
    }

    @Test
    public void testReduce() {
        BigFraction bf = new BigFraction(4, 6);
        assertEquals(new BigFraction(2, 3), bf.reduce());
    }

    @Test
    public void testSubtractBigInteger() {
        BigFraction bf = new BigFraction(3, 2);
        assertEquals(new BigFraction(1, 2), bf.subtract(BigInteger.ONE));
    }

    @Test
    public void testSubtractInt() {
        BigFraction bf = new BigFraction(3, 2);
        assertEquals(new BigFraction(-1, 2), bf.subtract(2));
    }

    @Test
    public void testSubtractLong() {
        BigFraction bf = new BigFraction(3, 2);
        assertEquals(new BigFraction(-1, 2), bf.subtract(2L));
    }

    @Test
    public void testSubtractBigFraction() {
        BigFraction bf = new BigFraction(5, 6);
        // 5/6 - 4/6 = 1/6
        assertEquals(new BigFraction(1, 6), bf.subtract(new BigFraction(4, 6)));
    }

    @Test
    public void testSubtractBigFractionSameDenominator() {
        BigFraction bf = new BigFraction(5, 6);
        assertEquals(new BigFraction(1, 6), bf.subtract(new BigFraction(4, 6)));
    }

    @Test
    public void testSubtractBigFractionZero() {
        BigFraction bf = new BigFraction(1, 2);
        assertEquals(bf, bf.subtract(BigFraction.ZERO));
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractBigFractionNull() {
        new BigFraction(1, 2).subtract((BigFraction) null);
    }

    @Test
    public void testToStringReduced() {
        BigFraction bf = new BigFraction(3, 4);
        assertEquals("3 / 4", bf.toString());
    }

    @Test
    public void testToStringDenominatorOne() {
        BigFraction bf = new BigFraction(5, 1);
        assertEquals("5", bf.toString());
    }

    @Test
    public void testToStringZero() {
        BigFraction bf = new BigFraction(0, 1);
        assertEquals("0", bf.toString());
    }

    @Test
    public void testGetField() {
        BigFraction bf = new BigFraction(3, 4);
        assertNotNull(bf.getField());
        assertTrue(bf.getField() instanceof BigFractionField);
    }
}
