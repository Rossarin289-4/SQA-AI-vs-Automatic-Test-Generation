```java
package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.util.Localizable;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.exception.NonMonotonousSequenceException;
import java.util.Locale;
import java.io.PrintStream;
import java.io.EOFException;
import java.io.IOException;

public class MathUtilsTest {

    // Constants from MathUtils class that are used in tests
    private static final long[] FACTORIALS = new long[] {
                       1l,                  1l,                   2l,
                       6l,                 24l,                 120l,
                     720l,               5040l,               40320l,
                  362880l,            3628800l,            39916800l,
               479001600l,         6227020800l,         87178291200l,
           1307674368000l,     20922789888000l,     355687428096000l,
        6402373705728000l, 121645100408832000l, 2432902008176640000l };


    @Test
    public void testAddAndCheckPositive() {
        assertEquals(10, MathUtils.addAndCheck(5, 5));
    }

    @Test
    public void testAddAndCheckNegative() {
        assertEquals(-10, MathUtils.addAndCheck(-5, -5));
    }

    @Test
    public void testAddAndCheckOverflow() {
        try {
            MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAddAndCheckUnderflow() {
        try {
            MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testBinomialCoefficientBaseCases() {
        assertEquals(1, MathUtils.binomialCoefficient(5, 0));
        assertEquals(1, MathUtils.binomialCoefficient(5, 5));
    }

    @Test
    public void testBinomialCoefficientSimple() {
        assertEquals(5, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10, MathUtils.binomialCoefficient(5, 2));
        assertEquals(10, MathUtils.binomialCoefficient(5, 3));
    }

    @Test
    public void testBinomialCoefficientLargeN() {
        // Test case where n is close to the limit for long
        assertEquals(2432902008176640000L, MathUtils.binomialCoefficient(66, 33));
    }

    @Test
    public void testBinomialCoefficientDoubleBaseCases() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), 0.0);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), 0.0);
    }

    @Test
    public void testBinomialCoefficientDoubleSimple() {
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), 0.0);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), 0.0);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 0.0);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 3), 0.0);
    }

    @Test
    public void testBinomialCoefficientDoubleLargeN() {
        // Test case where double result might approach MAX_VALUE
        assertEquals(1.270957908101856E30, MathUtils.binomialCoefficientDouble(1029, 515), 1e23);
    }

    @Test
    public void testBinomialCoefficientLogBaseCases() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), 0.0);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), 0.0);
    }

    @Test
    public void testBinomialCoefficientLogSimple() {
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), 1e-9);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), 1e-9);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-9);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 3), 1e-9);
    }

    @Test
    public void testBinomialCoefficientLogLargeN() {
        // Test case for large n where log calculation is necessary
        assertEquals(FastMath.log(MathUtils.binomialCoefficientDouble(1029, 515)), MathUtils.binomialCoefficientLog(1029, 515), 1e-9);
    }

    @Test
    public void testCompareToEqual() {
        assertEquals(0, MathUtils.compareTo(1.0, 1.0, 1e-9));
        assertEquals(0, MathUtils.compareTo(1.0, 1.0000000001, 1e-9));
    }

    @Test
    public void testCompareToLess() {
        assertEquals(-1, MathUtils.compareTo(1.0, 2.0, 1e-9));
        assertEquals(-1, MathUtils.compareTo(1.0, 1.001, 1e-9));
    }

    @Test
    public void testCompareToGreater() {
        assertEquals(1, MathUtils.compareTo(2.0, 1.0, 1e-9));
        assertEquals(1, MathUtils.compareTo(1.001, 1.0, 1e-9));
    }

    @Test
    public void testCosh() {
        assertEquals(Math.cosh(1.0), MathUtils.cosh(1.0), 1e-9);
        assertEquals(Math.cosh(0.0), MathUtils.cosh(0.0), 1e-9);
        assertEquals(Math.cosh(-1.0), MathUtils.cosh(-1.0), 1e-9);
    }

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertTrue(MathUtils.equals(1.0, 1.0 + 1e-10));
        assertFalse(MathUtils.equals(1.0, 1.1));
    }

    @Test
    public void testEqualsIncludingNaN() {
        assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equalsIncludingNaN(1.0, 1.0));
        assertFalse(MathUtils.equalsIncludingNaN(1.0, Double.NaN));
    }

    @Test
    public void testFactorialBaseCases() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
    }

    @Test
    public void testFactorialSimple() {
        assertEquals(2L, MathUtils.factorial(2));
        assertEquals(6L, MathUtils.factorial(3));
        assertEquals(24L, MathUtils.factorial(4));
    }

    @Test
    public void testFactorialMaxLong() {
        assertEquals(FACTORIALS[20], MathUtils.factorial(20));
    }

    @Test
    public void testFactorialDoubleBaseCases() {
        assertEquals(1.0, MathUtils.factorialDouble(0), 0.0);
        assertEquals(1.0, MathUtils.factorialDouble(1), 0.0);
    }

    @Test
    public void testFactorialDoubleSimple() {
        assertEquals(2.0, MathUtils.factorialDouble(2), 0.0);
        assertEquals(6.0, MathUtils.factorialDouble(3), 0.0);
    }

    @Test
    public void testFactorialDoubleMaxDouble() {
        // Max n for factorial to fit in double is 170
        // The factorialLog method is used internally by factorialDouble for large n
        assertEquals(FastMath.floor(FastMath.exp(MathUtils.factorialLog(170)) + 0.5), MathUtils.factorialDouble(170), 1e-9);
    }

    @Test
    public void testFactorialLogBaseCases() {
        assertEquals(FastMath.log(1.0), MathUtils.factorialLog(0), 1e-9);
        assertEquals(FastMath.log(1.0), MathUtils.factorialLog(1), 1e-9);
    }

    @Test
    public void testFactorialLogSimple() {
        assertEquals(FastMath.log(2.0), MathUtils.factorialLog(2), 1e-9);
        assertEquals(FastMath.log(6.0), MathUtils.factorialLog(3), 1e-9);
    }

    @Test
    public void testGCDIntSimple() {
        assertEquals(2, MathUtils.gcd(8, 12));
        assertEquals(1, MathUtils.gcd(7, 5));
    }

    @Test
    public void testGCDIntZero() {
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test
    public void testGCDIntNegative() {
        assertEquals(2, MathUtils.gcd(-8, 12));
        assertEquals(2, MathUtils.gcd(8, -12));
        assertEquals(2, MathUtils.gcd(-8, -12));
    }

    @Test
    public void testGCDLongSimple() {
        assertEquals(2L, MathUtils.gcd(8L, 12L));
        assertEquals(1L, MathUtils.gcd(7L, 5L));
    }

    @Test
    public void testGCDLongZero() {
        assertEquals(5L, MathUtils.gcd(0L, 5L));
        assertEquals(5L, MathUtils.gcd(5L, 0L));
        assertEquals(0L, MathUtils.gcd(0L, 0L));
    }

    @Test
    public void testGCDLongNegative() {
        assertEquals(2L, MathUtils.gcd(-8L, 12L));
        assertEquals(2L, MathUtils.gcd(8L, -12L));
        assertEquals(2L, MathUtils.gcd(-8L, -12L));
    }

    @Test
    public void testHashDouble() {
        assertEquals(Double.valueOf(1.23).hashCode(), MathUtils.hash(1.23));
        assertEquals(Double.valueOf(-0.0).hashCode(), MathUtils.hash(-0.0));
        assertEquals(Double.valueOf(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testHashDoubleArray() {
        double[] arr1 = {1.0, 2.0};
        double[] arr2 = {1.0, 2.0};
        double[] arr3 = {1.0, 3.0};
        double[] arr4 = null;
        assertEquals(Arrays.hashCode(arr1), MathUtils.hash(arr1));
        assertEquals(Arrays.hashCode(arr2), MathUtils.hash(arr2));
        assertNotEquals(Arrays.hashCode(arr1), MathUtils.hash(arr3));
        assertEquals(Arrays.hashCode(arr4), MathUtils.hash(arr4));
    }

    @Test
    public void testIndicatorByte() {
        assertEquals((byte)1, MathUtils.indicator((byte)5));
        assertEquals((byte)-1, MathUtils.indicator((byte)-5));
        assertEquals((byte)0, MathUtils.indicator((byte)0));
    }

    @Test
    public void testIndicatorDouble() {
        assertEquals(1.0, MathUtils.indicator(5.0), 0.0);
        assertEquals(-1.0, MathUtils.indicator(-5.0), 0.0);
        assertEquals(0.0, MathUtils.indicator(0.0), 0.0);
        assertEquals(Double.NaN, MathUtils.indicator(Double.NaN));
    }

    @Test
    public void testIndicatorFloat() {
        assertEquals(1.0F, MathUtils.indicator(5.0F), 0.0f);
        assertEquals(-1.0F, MathUtils.indicator(-5.0F), 0.0f);
        assertEquals(0.0F, MathUtils.indicator(0.0F), 0.0f);
        assertEquals(Float.NaN, MathUtils.indicator(Float.NaN));
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-5));
        assertEquals(0, MathUtils.indicator(0));
    }

    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(-1L, MathUtils.indicator(-5L));
        assertEquals(0L, MathUtils.indicator(0L));
    }

    @Test
    public void testIndicatorShort() {
        assertEquals((short)1, MathUtils.indicator((short)5));
        assertEquals((short)-1, MathUtils.indicator((short)-5));
        assertEquals((short)0, MathUtils.indicator((short)0));
    }

    @Test
    public void testLcmIntSimple() {
        assertEquals(24, MathUtils.lcm(8, 12));
        assertEquals(35, MathUtils.lcm(7, 5));
    }

    @Test
    public void testLcmIntZero() {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(0, MathUtils.lcm(0, 0));
    }

    @Test
    public void testLcmIntNegative() {
        assertEquals(24, MathUtils.lcm(-8, 12));
        assertEquals(24, MathUtils.lcm(8, -12));
        assertEquals(24, MathUtils.lcm(-8, -12));
    }

    @Test
    public void testLcmLongSimple() {
        assertEquals(24L, MathUtils.lcm(8L, 12L));
        assertEquals(35L, MathUtils.lcm(7L, 5L));
    }

    @Test
    public void testLcmLongZero() {
        assertEquals(0L, MathUtils.lcm(0L, 5L));
        assertEquals(0L, MathUtils.lcm(5L, 0L));
        assertEquals(0L, MathUtils.lcm(0L, 0L));
    }

    @Test
    public void testLcmLongNegative() {
        assertEquals(24L, MathUtils.lcm(-8L, 12L));
        assertEquals(24L, MathUtils.lcm(8L, -12L));
        assertEquals(24L, MathUtils.lcm(-8L, -12L));
    }

    @Test
    public void testLogBaseCases() {
        assertEquals(Double.NaN, MathUtils.log(Double.NaN, 10.0));
        assertEquals(Double.NaN, MathUtils.log(10.0, Double.NaN));
        assertEquals(Double.NaN, MathUtils.log(0.0, 0.0));
        assertEquals(0.0, MathUtils.log(0.0, 1.0), 1e-9); // log base 0 of 1 is undefined, but 0^0 is usually 1. The formula gives 0/NaN -> NaN, but the implementation path might differ. The code returns 0.
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.log(10.0, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(10.0, 0.0), 1e-9);
        assertEquals(0.0, MathUtils.log(1.0, 1.0), 1e-9);
    }

    @Test
    public void testLogSimple() {
        assertEquals(Math.log(100.0) / Math.log(10.0), MathUtils.log(10.0, 100.0), 1e-9);
        assertEquals(Math.log(8.0) / Math.log(2.0), MathUtils.log(2.0, 8.0), 1e-9);
    }

    @Test
    public void testMulAndCheckPositive() {
        assertEquals(25, MathUtils.mulAndCheck(5, 5));
    }

    @Test
    public void testMulAndCheckNegative() {
        assertEquals(-25, MathUtils.mulAndCheck(-5, 5));
        assertEquals(25, MathUtils.mulAndCheck(-5, -5));
    }

    @Test
    public void testMulAndCheckOverflow() {
        try {
            MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testMulAndCheckUnderflow() {
        try {
            MathUtils.mulAndCheck(Integer.MIN_VALUE, 2);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testScalbZero() {
        assertEquals(0.0, MathUtils.scalb(0.0, 10), 0.0);
    }

    @Test
    public void testScalbNaN() {
        assertEquals(Double.NaN, MathUtils.scalb(Double.NaN, 10));
    }

    @Test
    public void testScalbInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 10));
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.scalb(Double.NEGATIVE_INFINITY, 10));
    }

    @Test
    public void testScalbPositiveScale() {
        assertEquals(100.0, MathUtils.scalb(10.0, 1), 0.0);
        assertEquals(1000.0, MathUtils.scalb(10.0, 2), 0.0);
    }

    @Test
    public void testScalbNegativeScale() {
        assertEquals(1.0, MathUtils.scalb(10.0, -1), 0.0);
        assertEquals(0.1, MathUtils.scalb(10.0, -2), 0.0);
    }

    @Test
    public void testNormalizeAngleSimple() {
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, Math.PI), 1e-9);
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-9);
    }

    @Test
    public void testNormalizeAnglePositive() {
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-9);
        assertEquals(Math.PI, MathUtils.normalizeAngle(5 * Math.PI, Math.PI), 1e-9);
    }

    @Test
    public void testNormalizeAngleNegative() {
        assertEquals(Math.PI, MathUtils.normalizeAngle(-Math.PI, Math.PI), 1e-9);
        assertEquals(Math.PI, MathUtils.normalizeAngle(-3 * Math.PI, Math.PI), 1e-9);
    }

    @Test
    public void testNormalizeAngleAroundZero() {
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-9);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0), 1e-9);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3*Math.PI, 0.0), 1e-9);
    }

    @Test
    public void testNormalizeArraySimple() {
        double[] values = {1.0, 2.0, 3.0};
        double normalizedSum = 6.0;
        double[] expected = {1.0, 2.0, 3.0};
        assertArrayEquals(expected, MathUtils.normalizeArray(values, normalizedSum), 1e-9);
    }

    @Test
    public void testNormalizeArrayTargetSum() {
        double[] values = {1.0, 1.0, 1.0};
        double normalizedSum = 1.5;
        double[] expected = {0.5, 0.5, 0.5};
        assertArrayEquals(expected, MathUtils.normalizeArray(values, normalizedSum), 1e-9);
    }

    @Test
    public void testNormalizeArrayWithNaN() {
        double[] values = {1.0, Double.NaN, 3.0};
        double normalizedSum = 4.0;
        double[] expected = {1.0, Double.NaN, 3.0};
        assertArrayEquals(expected, MathUtils.normalizeArray(values, normalizedSum), 1e-9);
    }

    @Test
    public void testRoundDoubleToScale() {
        assertEquals(12.34, MathUtils.round(12.3456, 2), 1e-9);
        assertEquals(12.35, MathUtils.round(12.3456, 2, BigDecimal.ROUND_HALF_UP), 1e-9);
        assertEquals(12.34, MathUtils.round(12.3446, 2), 1e-9);
    }

    @Test
    public void testRoundDoubleToScaleNegative() {
        assertEquals(-12.34, MathUtils.round(-12.3456, 2), 1e-9);
        assertEquals(-12.35, MathUtils.round(-12.3456, 2, BigDecimal.ROUND_HALF_UP), 1e-9);
        assertEquals(-12.34, MathUtils.round(-12.3446, 2), 1e-9);
    }

    @Test
    public void testRoundDoubleToScaleLarge() {
        assertEquals(12345.67, MathUtils.round(12345.6789, 2), 1e-9);
    }

    @Test
    public void testSignByte() {
        assertEquals((byte)1, MathUtils.sign((byte)5));
        assertEquals((byte)-1, MathUtils.sign((byte)-5));
        assertEquals((byte)0, MathUtils.sign((byte)0));
    }

    @Test
    public void testSignDouble() {
        assertEquals(1.0, MathUtils.sign(5.0), 0.0);
        assertEquals(-1.0, MathUtils.sign(-5.0), 0.0);
        assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        assertEquals(Double.NaN, MathUtils.sign(Double.NaN));
    }

    @Test
    public void testSignFloat() {
        assertEquals(1.0F, MathUtils.sign(5.0F), 0.0F);
        assertEquals(-1.0F, MathUtils.sign(-5.0F), 0.0F);
        assertEquals(0.0F, MathUtils.sign(0.0F), 0.0F);
        assertEquals(Float.NaN, MathUtils.sign(Float.NaN));
    }

    @Test
    public void testSignInt() {
        assertEquals(1, MathUtils.sign(5));
        assertEquals(-1, MathUtils.sign(-5));
        assertEquals(0, MathUtils.sign(0));
    }

    @Test
    public void testSignLong() {
        assertEquals(1L, MathUtils.sign(5L));
        assertEquals(-1L, MathUtils.sign(-5L));
        assertEquals(0L, MathUtils.sign(0L));
    }

    @Test
    public void testSignShort() {
        assertEquals((short)1, MathUtils.sign((short)5));
        assertEquals((short)-1, MathUtils.sign((short)-5));
        assertEquals((short)0, MathUtils.sign((short)0));
    }

    @Test
    public void testSinh() {
        assertEquals(Math.sinh(1.0), MathUtils.sinh(1.0), 1e-9);
        assertEquals(Math.sinh(0.0), MathUtils.sinh(0.0), 1e-9);
        assertEquals(Math.sinh(-1.0), MathUtils.sinh(-1.0), 1e-9);
    }

    @Test
    public void testSubAndCheckPositive() {
        assertEquals(0, MathUtils.subAndCheck(5, 5));
    }

    @Test
    public void testSubAndCheckNegative() {
        assertEquals(0, MathUtils.subAndCheck(-5, -5));
    }

    @Test
    public void testSubAndCheckOverflow() {
        try {
            MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testSubAndCheckUnderflow() {
        try {
            MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testPowIntPositiveExponent() {
        assertEquals(8, MathUtils.pow(2, 3));
        assertEquals(1, MathUtils.pow(2, 0));
    }

    @Test
    public void testPowIntNegativeBase() {
        assertEquals(-8, MathUtils.pow(-2, 3));
        assertEquals(1, MathUtils.pow(-2, 0));
        assertEquals(4, MathUtils.pow(-2, 2));
    }

    @Test
    public void testPowLongPositiveExponent() {
        assertEquals(8L, MathUtils.pow(2L, 3L));
        assertEquals(1L, MathUtils.pow(2L, 0L));
    }

    @Test
    public void testPowLongNegativeBase() {
        assertEquals(-8L, MathUtils.pow(-2L, 3L));
        assertEquals(1L, MathUtils.pow(-2L, 0L));
        assertEquals(4L, MathUtils.pow(-2L, 2L));
    }

    @Test
    public void testPowBigIntegerPositiveExponent() {
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(3)));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(2), BigInteger.ZERO));
    }

    @Test
    public void testPowBigIntegerNegativeBase() {
        assertEquals(BigInteger.valueOf(-8), MathUtils.pow(BigInteger.valueOf(-2), BigInteger.valueOf(3)));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(-2), BigInteger.ZERO));
        assertEquals(BigInteger.valueOf(4), MathUtils.pow(BigInteger.valueOf(-2), BigInteger.valueOf(2)));
    }

    @Test
    public void testDistance1Double() {
        double[] p1 = {1.0, 2.0, 3.0};
        double[] p2 = {4.0, 5.0, 6.0};
        assertEquals(9.0, MathUtils.distance1(p1, p2), 1e-9);
    }

    @Test
    public void testDistance1Int() {
        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5, 6};
        assertEquals(9, MathUtils.distance1(p1, p2));
    }

    @Test
    public void testDistanceDouble() {
        double[] p1 = {3.0, 4.0};
        double[] p2 = {0.0, 0.0};
        assertEquals(5.0, MathUtils.distance(p1, p2), 1e-9);
    }

    @Test
    public void testDistanceInt() {
        int[] p1 = {3, 4};
        int[] p2 = {0, 0};
        assertEquals(5.0, MathUtils.distance(p1, p2), 1e-9);
    }

    @Test
    public void testDistanceInfDouble() {
        double[] p1 = {1.0, 2.0, 3.0};
        double[] p2 = {4.0, 5.0, 1.0};
        assertEquals(3.0, MathUtils.distanceInf(p1, p2), 1e-9);
    }

    @Test
    public void testDistanceInfInt() {
        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5, 1};
        assertEquals(3, MathUtils.distanceInf(p1, p2));
    }

    @Test
    public void testCheckOrderIncreasingStrict() {
        double[] val = {1.0, 2.0, 3.0};
        MathUtils.checkOrder(val, MathUtils.OrderDirection.INCREASING, true);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderIncreasingStrictFail() {
        double[] val = {1.0, 2.0, 2.0};
        MathUtils.checkOrder(val, MathUtils.OrderDirection.INCREASING, true);
    }

    @Test
    public void testCheckOrderIncreasingNonStrict() {
        double[] val = {1.0, 2.0, 2.0, 3.0};
        MathUtils.checkOrder(val, MathUtils.OrderDirection.INCREASING, false);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderIncreasingNonStrictFail() {
        double[] val = {1.0, 3.0, 2.0};
        MathUtils.checkOrder(val, MathUtils.OrderDirection.INCREASING, false);
    }

    @Test
    public void testCheckOrderDecreasingStrict() {
        double[] val = {3.0, 2.0, 1.0};
        MathUtils.checkOrder(val, MathUtils.OrderDirection.DECREASING, true);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderDecreasingStrictFail() {
        double[] val = {3.0, 2.0, 2.0};
        MathUtils.checkOrder(val, MathUtils.OrderDirection.DECREASING, true);
    }

    @Test
    public void testCheckOrderDecreasingNonStrict() {
        double[] val = {3.0, 2.0, 2.0, 1.0};
        MathUtils.checkOrder(val, MathUtils.OrderDirection.DECREASING, false);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderDecreasingNonStrictFail() {
        double[] val = {1.0, 2.0, 3.0};
        MathUtils.checkOrder(val, MathUtils.OrderDirection.DECREASING, false);
    }

    @Test
    public void testCheckOrderSimple() {
        double[] val = {1.0, 2.0, 3.0};
        MathUtils.checkOrder(val);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderSimpleFail() {
        double[] val = {1.0, 3.0, 2.0};
        MathUtils.checkOrder(val);
    }

    @Test
    public void testSafeNormSimple() {
        double[] v = {3.0, 4.0};
        assertEquals(5.0, MathUtils.safeNorm(v), 1e-9);
    }

    @Test
    public void testSafeNormZero() {
        double[] v = {0.0, 0.0};
        assertEquals(0.0, MathUtils.safeNorm(v), 1e-9);
    }

    @Test
    public void testSafeNormLargeValues() {
        double[] v = {Double.MAX_VALUE / 2.0, Double.MAX_VALUE / 2.0};
        assertEquals(Double.MAX_VALUE, MathUtils.safeNorm(v), Double.MAX_VALUE * 1e-9);
    }
}
```