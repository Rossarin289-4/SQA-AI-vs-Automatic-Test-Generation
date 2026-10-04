===== COMPILER ERRORS (javac) =====
MathUtilsTest.java:288: error: reference to hashCode is ambiguous
        assertEquals(Arrays.hashCode(null), MathUtils.hash(null));
                           ^
  both method hashCode(double[]) in Arrays and method hashCode(Object[]) in Arrays match
1 error
===== END COMPILER ERRORS =====
The error message indicates that the `Arrays.hashCode(null)` call is ambiguous because there are multiple `hashCode` methods in the `Arrays` class that could match. This ambiguity arises when passing `null` to `Arrays.hashCode()`. To resolve this, we need to explicitly specify the type of array `hashCode` should be called on, even if it's null.

```java
package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import org.apache.commons.math.MathRuntimeException;

public class MathUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAddAndCheckInt() throws Exception {
        assertEquals(10, MathUtils.addAndCheck(5, 5));
        assertEquals(-10, MathUtils.addAndCheck(-5, -5));
        assertEquals(0, MathUtils.addAndCheck(5, -5));
        try {
            MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
            fail("Expected ArithmeticException for underflow");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testAddAndCheckLong() throws Exception {
        assertEquals(10L, MathUtils.addAndCheck(5L, 5L));
        assertEquals(-10L, MathUtils.addAndCheck(-5L, -5L));
        assertEquals(0L, MathUtils.addAndCheck(5L, -5L));
        try {
            MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
            fail("Expected ArithmeticException for underflow");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testBinomialCoefficient() throws Exception {
        assertEquals(1, MathUtils.binomialCoefficient(0, 0));
        assertEquals(1, MathUtils.binomialCoefficient(5, 0));
        assertEquals(5, MathUtils.binomialCoefficient(5, 1));
        assertEquals(10, MathUtils.binomialCoefficient(5, 2));
        assertEquals(10, MathUtils.binomialCoefficient(5, 3));
        assertEquals(5, MathUtils.binomialCoefficient(5, 4));
        assertEquals(1, MathUtils.binomialCoefficient(5, 5));
        assertEquals(1, MathUtils.binomialCoefficient(66, 0));
        assertEquals(66, MathUtils.binomialCoefficient(66, 1));
        assertEquals(1197531720L, MathUtils.binomialCoefficient(66, 5)); // Example from docs
        try {
            MathUtils.binomialCoefficient(-1, 0);
            fail("Expected IllegalArgumentException for n < 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            MathUtils.binomialCoefficient(5, 6);
            fail("Expected IllegalArgumentException for k > n");
        } catch (IllegalArgumentException e) {
            // expected
        }
        // Test boundary for long overflow (n > 66 as per source)
        try {
            MathUtils.binomialCoefficient(67, 33); // This will overflow long
            fail("Expected ArithmeticException for result too large");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testBinomialCoefficientDouble() throws Exception {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(0, 0), 1e-9);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 1e-9);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 3), 1e-9);
        assertEquals(1197531720.0, MathUtils.binomialCoefficientDouble(66, 5), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.binomialCoefficientDouble(1030, 500), 1e-9); // Test overflow to infinity
        try {
            MathUtils.binomialCoefficientDouble(-1, 0);
            fail("Expected IllegalArgumentException for n < 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            MathUtils.binomialCoefficientDouble(5, 6);
            fail("Expected IllegalArgumentException for k > n");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testBinomialCoefficientLog() throws Exception {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(0, 0), 1e-9);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-9);
        assertEquals(Math.log(1197531720.0), MathUtils.binomialCoefficientLog(66, 5), 1e-9);
        assertEquals(Math.log(Double.POSITIVE_INFINITY), MathUtils.binomialCoefficientLog(1030, 500), 1e-9); // Test overflow to infinity
        try {
            MathUtils.binomialCoefficientLog(-1, 0);
            fail("Expected IllegalArgumentException for n < 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            MathUtils.binomialCoefficientLog(5, 6);
            fail("Expected IllegalArgumentException for k > n");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCompareTo() throws Exception {
        assertEquals(0, MathUtils.compareTo(1.0, 1.0, 1e-9));
        assertEquals(0, MathUtils.compareTo(1.0, 1.0000000001, 1e-9));
        assertEquals(-1, MathUtils.compareTo(1.0, 1.1, 1e-9));
        assertEquals(1, MathUtils.compareTo(1.1, 1.0, 1e-9));
        assertEquals(0, MathUtils.compareTo(Double.NaN, Double.NaN, 1e-9));
        assertEquals(1, MathUtils.compareTo(Double.POSITIVE_INFINITY, 1.0, 1e-9));
        assertEquals(-1, MathUtils.compareTo(Double.NEGATIVE_INFINITY, 1.0, 1e-9));
    }

    @Test
    public void testCosh() throws Exception {
        assertEquals(Math.cosh(0.0), MathUtils.cosh(0.0), 1e-9);
        assertEquals(Math.cosh(1.0), MathUtils.cosh(1.0), 1e-9);
        assertEquals(Math.cosh(-1.0), MathUtils.cosh(-1.0), 1e-9);
    }

    @Test
    public void testEqualsDouble() throws Exception {
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(1.0, 2.0));
        assertTrue(MathUtils.equals(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
        assertTrue(MathUtils.equals(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY));
        assertFalse(MathUtils.equals(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testEqualsDoubleEps() throws Exception {
        assertTrue(MathUtils.equals(1.0, 1.0, 1e-9));
        assertTrue(MathUtils.equals(1.0, 1.0000000001, 1e-9));
        assertFalse(MathUtils.equals(1.0, 1.00000001, 1e-9));
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN, 1e-9));
        assertTrue(MathUtils.equals(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1e-9));
    }

    @Test
    public void testEqualsDoubleMaxUlps() throws Exception {
        assertTrue(MathUtils.equals(1.0, 1.0, 1));
        // Two numbers are considered equal if they are at most maxUlps apart.
        // 1.0 and nextAfter(1.0, 2.0) should be 1 ulp apart.
        assertTrue(MathUtils.equals(1.0, MathUtils.nextAfter(1.0, 2.0), 2));
        // Check against a value further away
        assertFalse(MathUtils.equals(1.0, MathUtils.nextAfter(MathUtils.nextAfter(1.0, 2.0), 2.0), 2));
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN, 1)); // NaNs are equal
        assertTrue(MathUtils.equals(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1));
    }

    @Test
    public void testEqualsDoubleArray() throws Exception {
        assertTrue(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(null, null));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[]{1.0, Double.NaN}, new double[]{1.0, Double.NaN}));
        assertTrue(MathUtils.equals(new double[]{Double.POSITIVE_INFINITY}, new double[]{Double.POSITIVE_INFINITY}));
    }

    @Test
    public void testFactorial() throws Exception {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
        assertEquals(2L, MathUtils.factorial(2));
        assertEquals(6L, MathUtils.factorial(3));
        assertEquals(2432902008176640000L, MathUtils.factorial(20)); // Largest factorial that fits in long
        try {
            MathUtils.factorial(-1);
            fail("Expected IllegalArgumentException for n < 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            MathUtils.factorial(21);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testFactorialDouble() throws Exception {
        assertEquals(1.0, MathUtils.factorialDouble(0), 1e-9);
        assertEquals(1.0, MathUtils.factorialDouble(1), 1e-9);
        assertEquals(2.0, MathUtils.factorialDouble(2), 1e-9);
        assertEquals(2.0 * 3.0 * 4.0 * 5.0 * 6.0 * 7.0 * 8.0 * 9.0 * 10.0 * 11.0 * 12.0 * 13.0 * 14.0 * 15.0 * 16.0 * 17.0 * 18.0 * 19.0 * 20.0, MathUtils.factorialDouble(20), 1e-9);
        assertEquals(Math.floor(Math.exp(MathUtils.factorialLog(170)) + 0.5), MathUtils.factorialDouble(170), 1e-9); // Max n for double
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.factorialDouble(171), 1e-9); // Overflow to infinity
        try {
            MathUtils.factorialDouble(-1);
            fail("Expected IllegalArgumentException for n < 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFactorialLog() throws Exception {
        assertEquals(Math.log(1.0), MathUtils.factorialLog(0), 1e-9);
        assertEquals(Math.log(2.0), MathUtils.factorialLog(2), 1e-9);
        assertEquals(Math.log(2432902008176640000.0), MathUtils.factorialLog(20), 1e-9);
        try {
            MathUtils.factorialLog(-1);
            fail("Expected IllegalArgumentException for n < 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGcd() throws Exception {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 5));
        assertEquals(2, MathUtils.gcd(4, 6));
        assertEquals(3, MathUtils.gcd(9, 12));
        assertEquals(1, MathUtils.gcd(7, 11));
        assertEquals(10, MathUtils.gcd(100, 30));
        assertEquals(5, MathUtils.gcd(-5, 0));
        assertEquals(5, MathUtils.gcd(5, -5));
        assertEquals(5, MathUtils.gcd(-5, -5));
        assertEquals(Integer.MAX_VALUE, MathUtils.gcd(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MAX_VALUE, MathUtils.gcd(Integer.MAX_VALUE, Integer.MAX_VALUE));
        // Test case for overflow: gcd(Integer.MIN_VALUE, 0)
        try {
            MathUtils.gcd(Integer.MIN_VALUE, 0);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        // Test case for overflow: gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)
        try {
            MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        // Test case for overflow: gcd(Integer.MIN_VALUE, 1073741824) (which is 2^30)
        try {
            MathUtils.gcd(Integer.MIN_VALUE, 1 << 30);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testHashDouble() throws Exception {
        assertEquals(Double.valueOf(1.0).hashCode(), MathUtils.hash(1.0));
        assertEquals(Double.valueOf(0.0).hashCode(), MathUtils.hash(0.0));
        assertEquals(Double.valueOf(-0.0).hashCode(), MathUtils.hash(-0.0));
        assertEquals(Double.valueOf(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY).hashCode(), MathUtils.hash(Double.POSITIVE_INFINITY));
        assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY).hashCode(), MathUtils.hash(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testHashDoubleArray() throws Exception {
        assertEquals(Arrays.hashCode(new double[]{1.0, 2.0}), MathUtils.hash(new double[]{1.0, 2.0}));
        // Explicitly cast null to double[] to resolve ambiguity
        assertEquals(Arrays.hashCode((double[]) null), MathUtils.hash(null));
        assertEquals(Arrays.hashCode(new double[]{}), MathUtils.hash(new double[]{}));
        assertEquals(Arrays.hashCode(new double[]{Double.NaN}), MathUtils.hash(new double[]{Double.NaN}));
    }

    @Test
    public void testIndicatorByte() throws Exception {
        assertEquals((byte) 1, MathUtils.indicator((byte) 10));
        assertEquals((byte) -1, MathUtils.indicator((byte) -10));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) 1, MathUtils.indicator(Byte.MAX_VALUE));
        assertEquals((byte) -1, MathUtils.indicator(Byte.MIN_VALUE));
    }

    @Test
    public void testIndicatorDouble() throws Exception {
        assertEquals(1.0, MathUtils.indicator(10.0), 1e-9);
        assertEquals(-1.0, MathUtils.indicator(-10.0), 1e-9);
        assertEquals(0.0, MathUtils.indicator(0.0), 1e-9);
        assertEquals(Double.NaN, MathUtils.indicator(Double.NaN), 1e-9);
        assertEquals(1.0, MathUtils.indicator(Double.MAX_VALUE), 1e-9);
        assertEquals(-1.0, MathUtils.indicator(Double.MIN_NORMAL), 1e-9); // Smallest normalized positive
        assertEquals(-1.0, MathUtils.indicator(Double.MIN_VALUE), 1e-9); // Smallest positive non-zero
        assertEquals(-1.0, MathUtils.indicator(Double.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testIndicatorFloat() throws Exception {
        assertEquals(1.0F, MathUtils.indicator(10.0F), 1e-9);
        assertEquals(-1.0F, MathUtils.indicator(-10.0F), 1e-9);
        assertEquals(0.0F, MathUtils.indicator(0.0F), 1e-9);
        assertEquals(Float.NaN, MathUtils.indicator(Float.NaN), 1e-9);
        assertEquals(1.0F, MathUtils.indicator(Float.MAX_VALUE), 1e-9);
        assertEquals(-1.0F, MathUtils.indicator(Float.MIN_NORMAL), 1e-9);
        assertEquals(-1.0F, MathUtils.indicator(Float.MIN_VALUE), 1e-9);
        assertEquals(-1.0F, MathUtils.indicator(Float.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testIndicatorInt() throws Exception {
        assertEquals(1, MathUtils.indicator(10));
        assertEquals(-1, MathUtils.indicator(-10));
        assertEquals(0, MathUtils.indicator(0));
        assertEquals(1, MathUtils.indicator(Integer.MAX_VALUE));
        assertEquals(-1, MathUtils.indicator(Integer.MIN_VALUE));
    }

    @Test
    public void testIndicatorLong() throws Exception {
        assertEquals(1L, MathUtils.indicator(10L));
        assertEquals(-1L, MathUtils.indicator(-10L));
        assertEquals(0L, MathUtils.indicator(0L));
        assertEquals(1L, MathUtils.indicator(Long.MAX_VALUE));
        assertEquals(-1L, MathUtils.indicator(Long.MIN_VALUE));
    }

    @Test
    public void testIndicatorShort() throws Exception {
        assertEquals((short) 1, MathUtils.indicator((short) 10));
        assertEquals((short) -1, MathUtils.indicator((short) -10));
        assertEquals((short) 0, MathUtils.indicator((short) 0));
        assertEquals((short) 1, MathUtils.indicator(Short.MAX_VALUE));
        assertEquals((short) -1, MathUtils.indicator(Short.MIN_VALUE));
    }

    @Test
    public void testLcm() throws Exception {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(0, MathUtils.lcm(0, 0));
        assertEquals(30, MathUtils.lcm(5, 6));
        assertEquals(12, MathUtils.lcm(4, 6));
        assertEquals(21, MathUtils.lcm(7, 3));
        assertEquals(10, MathUtils.lcm(10, 5));
        assertEquals(10, MathUtils.lcm(-5, 2));
        assertEquals(10, MathUtils.lcm(5, -2));
        assertEquals(10, MathUtils.lcm(-5, -2));
        assertEquals(Integer.MAX_VALUE, MathUtils.lcm(Integer.MAX_VALUE, 1));
        // Test overflow: lcm(Integer.MIN_VALUE, 1)
        try {
            MathUtils.lcm(Integer.MIN_VALUE, 1);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        // Test overflow: lcm(Integer.MIN_VALUE / 2, 2)
        try {
            MathUtils.lcm(Integer.MIN_VALUE / 2, 2);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        // Test case where result is 2^31
        try {
            MathUtils.lcm(Integer.MIN_VALUE, 1); // This should throw overflow
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testLog() throws Exception {
        assertEquals(Math.log(10.0) / Math.log(2.0), MathUtils.log(2.0, 10.0), 1e-9);
        assertEquals(1.0, MathUtils.log(10.0, 10.0), 1e-9);
        assertEquals(0.0, MathUtils.log(10.0, 1.0), 1e-9);
        assertEquals(Math.log(8.0) / Math.log(2.0), MathUtils.log(2.0, 8.0), 1e-9);
        assertEquals(Double.NaN, MathUtils.log(-2.0, 10.0), 1e-9); // Negative base
        assertEquals(Double.NaN, MathUtils.log(2.0, -10.0), 1e-9); // Negative argument
        assertEquals(0.0, MathUtils.log(0.0, 5.0), 1e-9); // Base is 0, x is positive
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(2.0, 0.0), 1e-9); // Base positive, x is 0
        assertEquals(Double.NaN, MathUtils.log(0.0, 0.0), 1e-9); // Both 0
        assertEquals(Double.NaN, MathUtils.log(Double.NaN, 5.0), 1e-9);
        assertEquals(Double.NaN, MathUtils.log(5.0, Double.NaN), 1e-9);
    }

    @Test
    public void testMulAndCheckInt() throws Exception {
        assertEquals(25, MathUtils.mulAndCheck(5, 5));
        assertEquals(-25, MathUtils.mulAndCheck(-5, 5));
        assertEquals(25, MathUtils.mulAndCheck(-5, -5));
        assertEquals(0, MathUtils.mulAndCheck(5, 0));
        assertEquals(Integer.MAX_VALUE, MathUtils.mulAndCheck(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, MathUtils.mulAndCheck(Integer.MIN_VALUE, 1));
        try {
            MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            MathUtils.mulAndCheck(Integer.MIN_VALUE, -2);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            MathUtils.mulAndCheck(Integer.MAX_VALUE, Integer.MAX_VALUE);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testMulAndCheckLong() throws Exception {
        assertEquals(25L, MathUtils.mulAndCheck(5L, 5L));
        assertEquals(-25L, MathUtils.mulAndCheck(-5L, 5L));
        assertEquals(25L, MathUtils.mulAndCheck(-5L, -5L));
        assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        assertEquals(Long.MAX_VALUE, MathUtils.mulAndCheck(Long.MAX_VALUE, 1L));
        assertEquals(Long.MIN_VALUE, MathUtils.mulAndCheck(Long.MIN_VALUE, 1L));
        try {
            MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            MathUtils.mulAndCheck(Long.MIN_VALUE, -2L);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            MathUtils.mulAndCheck(Long.MAX_VALUE, Long.MAX_VALUE);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testNextAfter() throws Exception {
        assertEquals(1.0, MathUtils.nextAfter(1.0, 2.0), 1e-9); // direction > d
        assertEquals(-1.0, MathUtils.nextAfter(-1.0, -2.0), 1e-9); // direction < d
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 1e-9); // d is 0, direction positive
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 1e-9); // d is 0, direction negative
        assertEquals(Double.NaN, MathUtils.nextAfter(Double.NaN, 1.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.nextAfter(Double.NEGATIVE_INFINITY, 1.0), 1e-9);
        assertEquals(Double.longBitsToDouble(0x7fefffffffffffffL), MathUtils.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 1e-9); // close to MAX_VALUE
        assertEquals(Double.longBitsToDouble(0x8000000000000001L), MathUtils.nextAfter(Double.MIN_VALUE, 0.0), 1e-9); // close to MIN_VALUE
    }

    @Test
    public void testScalb() throws Exception {
        assertEquals(10.0, MathUtils.scalb(5.0, 1), 1e-9); // 5 * 2^1 = 10
        assertEquals(2.5, MathUtils.scalb(5.0, -1), 1e-9); // 5 * 2^-1 = 2.5
        assertEquals(0.0, MathUtils.scalb(0.0, 100), 1e-9);
        assertEquals(Double.NaN, MathUtils.scalb(Double.NaN, 100), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 100), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.scalb(Double.NEGATIVE_INFINITY, 100), 1e-9);
        assertEquals(Double.MAX_VALUE, MathUtils.scalb(Double.MAX_VALUE, 0), 1e-9);
        assertEquals(Double.MIN_VALUE, MathUtils.scalb(Double.MIN_VALUE, 0), 1e-9);
    }

    @Test
    public void testNormalizeAngle() throws Exception {
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, Math.PI), 1e-9); // center-pi to center+pi
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-9);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-9); // a = 3pi, center = pi => a - 2pi = pi
        assertEquals(Math.PI, MathUtils.normalizeAngle(-Math.PI, Math.PI), 1e-9); // a = -pi, center = pi => a + 2pi = pi
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, Math.PI), 1e-9);

        // Test normalization to [-pi, pi]
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-9);
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-9);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0), 1e-9);
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-9);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(-3 * Math.PI, 0.0), 1e-9);

        // Test normalization between two points
        assertEquals(Math.PI / 2.0, MathUtils.normalizeAngle(Math.PI, Math.PI / 2.0), 1e-9); // center = pi/2. Expected interval [0, pi]. a=pi. Correct.
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-9); // a = 3pi, center = pi. Expected interval [0, 2pi]. Result 3pi - 2pi*floor((3pi+pi-pi)/(2pi)) = 3pi - 2pi*floor(3/2) = 3pi - 2pi*1 = pi.
    }

    @Test
    public void testNormalizeArray() throws Exception {
        double[] values1 = {1.0, 2.0, 3.0};
        double[] expected1 = {1.0 * 10.0 / 6.0, 2.0 * 10.0 / 6.0, 3.0 * 10.0 / 6.0};
        assertTrue(Arrays.equals(expected1, MathUtils.normalizeArray(values1, 10.0)));

        double[] values2 = {1.0, Double.NaN, 3.0};
        double[] expected2 = {1.0 * 10.0 / 4.0, Double.NaN, 3.0 * 10.0 / 4.0};
        assertTrue(Arrays.equals(expected2, MathUtils.normalizeArray(values2, 10.0)));

        try {
            MathUtils.normalizeArray(new double[]{1.0, Double.POSITIVE_INFINITY, 3.0}, 10.0);
            fail("Expected ArithmeticException for infinite element");
        } catch (ArithmeticException e) {
            // expected
        }

        try {
            MathUtils.normalizeArray(new double[]{1.0, 2.0, 3.0}, Double.POSITIVE_INFINITY);
            fail("Expected IllegalArgumentException for infinite normalizedSum");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            MathUtils.normalizeArray(new double[]{1.0, 2.0, 3.0}, Double.NaN);
            fail("Expected IllegalArgumentException for NaN normalizedSum");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            MathUtils.normalizeArray(new double[]{0.0, 0.0}, 10.0);
            fail("Expected ArithmeticException for sum zero");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testRoundDoubleScale() throws Exception {
        assertEquals(123.46, MathUtils.round(123.456, 2), 1e-9);
        assertEquals(123.45, MathUtils.round(123.454, 2), 1e-9);
        assertEquals(123.46, MathUtils.round(123.456, 2, BigDecimal.ROUND_HALF_UP), 1e-9);
        assertEquals(123.45, MathUtils.round(123.456, 2, BigDecimal.ROUND_HALF_DOWN), 1e-9);
        assertEquals(123.46, MathUtils.round(123.456, 2, BigDecimal.ROUND_HALF_EVEN), 1e-9);
        assertEquals(123.45, MathUtils.round(123.454, 2, BigDecimal.ROUND_HALF_UP), 1e-9);
        assertEquals(123.45, MathUtils.round(123.45, 2), 1e-9);
        assertEquals(1.0, MathUtils.round(0.999, 0), 1e-9);
        assertEquals(0.0, MathUtils.round(-0.001, 0), 1e-9);
        assertEquals(-1.0, MathUtils.round(-0.999, 0), 1e-9);
        assertEquals(1.0, MathUtils.round(0.999, 0, BigDecimal.ROUND_HALF_UP), 1e-9);
        assertEquals(0.0, MathUtils.round(-0.999, 0, BigDecimal.ROUND_HALF_DOWN), 1e-9);
        assertEquals(0.0, MathUtils.round(-0.5, 0, BigDecimal.ROUND_HALF_EVEN), 1e-9); // -0.5 rounds to 0
        assertEquals(1.0, MathUtils.round(0.5, 0, BigDecimal.ROUND_HALF_EVEN), 1e-9); // 0.5 rounds to 1

        // Test with infinity
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.round(Double.NEGATIVE_INFINITY, 2), 1e-9);
    }

    @Test
    public void testSignByte() throws Exception {
        assertEquals((byte) 1, MathUtils.sign((byte) 10));
        assertEquals((byte) -1, MathUtils.sign((byte) -10));
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
    }

    @Test
    public void testSignDouble() throws Exception {
        assertEquals(1.0, MathUtils.sign(10.0), 1e-9);
        assertEquals(-1.0, MathUtils.sign(-10.0), 1e-9);
        assertEquals(0.0, MathUtils.sign(0.0), 1e-9);
        assertEquals(0.0, MathUtils.sign(-0.0), 1e-9);
        assertEquals(Double.NaN, MathUtils.sign(Double.NaN), 1e-9);
        assertEquals(1.0, MathUtils.sign(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(-1.0, MathUtils.sign(Double.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testSignFloat() throws Exception {
        assertEquals(1.0F, MathUtils.sign(10.0F), 1e-9);
        assertEquals(-1.0F, MathUtils.sign(-10.0F), 1e-9);
        assertEquals(0.0F, MathUtils.sign(0.0F), 1e-9);
        assertEquals(0.0F, MathUtils.sign(-0.0F), 1e-9);
        assertEquals(Float.NaN, MathUtils.sign(Float.NaN), 1e-9);
        assertEquals(1.0F, MathUtils.sign(Float.POSITIVE_INFINITY), 1e-9);
        assertEquals(-1.0F, MathUtils.sign(Float.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testSignInt() throws Exception {
        assertEquals(1, MathUtils.sign(10));
        assertEquals(-1, MathUtils.sign(-10));
        assertEquals(0, MathUtils.sign(0));
    }

    @Test
    public void testSignLong() throws Exception {
        assertEquals(1L, MathUtils.sign(10L));
        assertEquals(-1L, MathUtils.sign(-10L));
        assertEquals(0L, MathUtils.sign(0L));
    }

    @Test
    public void testSignShort() throws Exception {
        assertEquals((short) 1, MathUtils.sign((short) 10));
        assertEquals((short) -1, MathUtils.sign((short) -10));
        assertEquals((short) 0, MathUtils.sign((short) 0));
    }

    @Test
    public void testSinh() throws Exception {
        assertEquals(Math.sinh(0.0), MathUtils.sinh(0.0), 1e-9);
        assertEquals(Math.sinh(1.0), MathUtils.sinh(1.0), 1e-9);
        assertEquals(Math.sinh(-1.0), MathUtils.sinh(-1.0), 1e-9);
    }

    @Test
    public void testSubAndCheckInt() throws Exception {
        assertEquals(0, MathUtils.subAndCheck(5, 5));
        assertEquals(10, MathUtils.subAndCheck(5, -5));
        assertEquals(-10, MathUtils.subAndCheck(-5, 5));
        assertEquals(0, MathUtils.subAndCheck(-5, -5));
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE, 0));
        try {
            MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
            fail("Expected ArithmeticException for underflow");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testSubAndCheckLong() throws Exception {
        assertEquals(0L, MathUtils.subAndCheck(5L, 5L));
        assertEquals(10L, MathUtils.subAndCheck(5L, -5L));
        assertEquals(-10L, MathUtils.subAndCheck(-5L, 5L));
        assertEquals(0L, MathUtils.subAndCheck(-5L, -5L));
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(Long.MAX_VALUE, 0L));
        assertEquals(Long.MIN_VALUE, MathUtils.subAndCheck(Long.MIN_VALUE, 0L));
        try {
            MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
            fail("Expected ArithmeticException for underflow");
        } catch (ArithmeticException e) {
            // expected
        }
        try {
            MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // expected
        }
        // Edge case: subtracting Long.MIN_VALUE
        try {
            MathUtils.subAndCheck(0L, Long.MIN_VALUE); // Should overflow to positive
            fail("Expected ArithmeticException for subtracting MIN_VALUE");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testPowIntInt() throws Exception {
        assertEquals(1, MathUtils.pow(2, 0));
        assertEquals(2, MathUtils.pow(2, 1));
        assertEquals(8, MathUtils.pow(2, 3));
        assertEquals(1, MathUtils.pow(5, 0));
        assertEquals(625, MathUtils.pow(5, 4));
        assertEquals(1, MathUtils.pow(-2, 0));
        assertEquals(-8, MathUtils.pow(-2, 3));
        assertEquals(16, MathUtils.pow(-2, 4));
        try {
            MathUtils.pow(2, -1);
            fail("Expected IllegalArgumentException for negative exponent");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPowIntLong() throws Exception {
        assertEquals(1, MathUtils.pow(2, 0L));
        assertEquals(2, MathUtils.pow(2, 1L));
        assertEquals(8, MathUtils.pow(2, 3L));
        assertEquals(1, MathUtils.pow(5, 0L));
        assertEquals(625, MathUtils.pow(5, 4L));
        assertEquals(1, MathUtils.pow(-2, 0L));
        assertEquals(-8, MathUtils.pow(-2, 3L));
        assertEquals(16, MathUtils.pow(-2, 4L));
        // Test large exponent that would overflow int result
        try {
            MathUtils.pow(2, 31); // 2^31 exceeds int max
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // This method does not check for result overflow, only exponent validity.
            // The actual overflow will happen during multiplication.
            // The test should focus on the contract: only check exponent.
            // The actual overflow is a separate issue from method contract.
            // For now, we are testing the contract.
        }
        try {
            MathUtils.pow(2, -1L);
            fail("Expected IllegalArgumentException for negative exponent");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPowLongInt() throws Exception {
        assertEquals(1L, MathUtils.pow(2L, 0));
        assertEquals(2L, MathUtils.pow(2L, 1));
        assertEquals(8L, MathUtils.pow(2L, 3));
        assertEquals(1L, MathUtils.pow(5L, 0));
        assertEquals(625L, MathUtils.pow(5L, 4));
        assertEquals(1L, MathUtils.pow(-2L, 0));
        assertEquals(-8L, MathUtils.pow(-2L, 3));
        assertEquals(16L, MathUtils.pow(-2L, 4));
        // Test large exponent that would overflow long result
        try {
            MathUtils.pow(2L, 63); // 2^63 exceeds long max
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Similar to Int-Int pow, this method doesn't check result overflow.
            // Testing exponent validity.
        }
        try {
            MathUtils.pow(2L, -1);
            fail("Expected IllegalArgumentException for negative exponent");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPowLongLong() throws Exception {
        assertEquals(1L, MathUtils.pow(2L, 0L));
        assertEquals(2L, MathUtils.pow(2L, 1L));
        assertEquals(8L, MathUtils.pow(2L, 3L));
        assertEquals(1L, MathUtils.pow(5L, 0L));
        assertEquals(625L, MathUtils.pow(5L, 4L));
        assertEquals(1L, MathUtils.pow(-2L, 0L));
        assertEquals(-8L, MathUtils.pow(-2L, 3L));
        assertEquals(16L, MathUtils.pow(-2L, 4L));
        // Test large exponent that would overflow long result
        try {
            MathUtils.pow(2L, 63L); // 2^63 exceeds long max
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Testing exponent validity.
        }
        try {
            MathUtils.pow(2L, -1L);
            fail("Expected IllegalArgumentException for negative exponent");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPowBigIntegerInt() throws Exception {
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(2), 0));
        assertEquals(BigInteger.valueOf(2), MathUtils.pow(BigInteger.valueOf(2), 1));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(5), 0));
        assertEquals(BigInteger.valueOf(625), MathUtils.pow(BigInteger.valueOf(5), 4));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(-2), 0));
        assertEquals(BigInteger.valueOf(-8), MathUtils.pow(BigInteger.valueOf(-2), 3));
        assertEquals(BigInteger.valueOf(16), MathUtils.pow(BigInteger.valueOf(-2), 4));
        try {
            MathUtils.pow(BigInteger.valueOf(2), -1);
            fail("Expected IllegalArgumentException for negative exponent");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPowBigIntegerLong() throws Exception {
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(2L), 0L));
        assertEquals(BigInteger.valueOf(2L), MathUtils.pow(BigInteger.valueOf(2L), 1L));
        assertEquals(BigInteger.valueOf(8L), MathUtils.pow(BigInteger.valueOf(2L), 3L));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(5L), 0L));
        assertEquals(BigInteger.valueOf(625L), MathUtils.pow(BigInteger.valueOf(5L), 4L));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(-2L), 0L));
        assertEquals(BigInteger.valueOf(-8L), MathUtils.pow(BigInteger.valueOf(-2L), 3L));
        assertEquals(BigInteger.valueOf(16L), MathUtils.pow(BigInteger.valueOf(-2L), 4L));
        try {
            MathUtils.pow(BigInteger.valueOf(2L), -1L);
            fail("Expected IllegalArgumentException for negative exponent");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPowBigIntegerBigInteger() throws Exception {
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.ONE, BigInteger.ZERO));
        assertEquals(BigInteger.valueOf(2), MathUtils.pow(BigInteger.valueOf(2), BigInteger.ONE));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(3)));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(5), BigInteger.ZERO));
        assertEquals(BigInteger.valueOf(625), MathUtils.pow(BigInteger.valueOf(5), BigInteger.valueOf(4)));
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(-2), BigInteger.ZERO));
        assertEquals(BigInteger.valueOf(-8), MathUtils.pow(BigInteger.valueOf(-2), BigInteger.valueOf(3)));
        assertEquals(BigInteger.valueOf(16), MathUtils.pow(BigInteger.valueOf(-2), BigInteger.valueOf(4)));
        try {
            MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(-1));
            fail("Expected IllegalArgumentException for negative exponent");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDistance1DoubleArray() throws Exception {
        assertEquals(0.0, MathUtils.distance1(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}), 1e-9);
        assertEquals(2.0, MathUtils.distance1(new double[]{1.0, 2.0}, new double[]{2.0, 3.0}), 1e-9);
        assertEquals(3.0, MathUtils.distance1(new double[]{1.0, -2.0}, new double[]{2.0, 1.0}), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.distance1(new double[]{Double.POSITIVE_INFINITY, 2.0}, new double[]{1.0, 3.0}), 1e-9);
        assertEquals(Double.NaN, MathUtils.distance1(new double[]{Double.NaN, 2.0}, new double[]{1.0, 3.0}), 1e-9);
    }

    @Test
    public void testDistance1IntArray() throws Exception {
        assertEquals(0, MathUtils.distance1(new int[]{1, 2}, new int[]{1, 2}));
        assertEquals(2, MathUtils.distance1(new int[]{1, 2}, new int[]{2, 3}));
        assertEquals(3, MathUtils.distance1(new int[]{1, -2}, new int[]{2, 1}));
        assertEquals(Integer.MAX_VALUE, MathUtils.distance1(new int[]{Integer.MAX_VALUE, 0}, new int[]{0, 0}));
        // Test potential overflow during intermediate calculation if not handled carefully, though abs should prevent it here.
        assertEquals(2, MathUtils.distance1(new int[]{Integer.MIN_VALUE, 0}, new int[]{Integer.MIN_VALUE + 2, 0}));
    }

    @Test
    public void testDistanceDoubleArray() throws Exception {
        assertEquals(0.0, MathUtils.distance(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}), 1e-9);
        assertEquals(Math.sqrt(2.0), MathUtils.distance(new double[]{1.0, 2.0}, new double[]{2.0, 3.0}), 1e-9);
        assertEquals(Math.sqrt(10.0), MathUtils.distance(new double[]{1.0, -2.0}, new double[]{2.0, 1.0}), 1e-9); // (1-2)^2 + (-2-1)^2 = 1 + 9 = 10
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.distance(new double[]{Double.POSITIVE_INFINITY, 2.0}, new double[]{1.0, 3.0}), 1e-9);
        assertEquals(Double.NaN, MathUtils.distance(new double[]{Double.NaN, 2.0}, new double[]{1.0, 3.0}), 1e-9);
    }

    @Test
    public void testDistanceIntArray() throws Exception {
        assertEquals(0.0, MathUtils.distance(new int[]{1, 2}, new int[]{1, 2}), 1e-9);
        assertEquals(Math.sqrt(2.0), MathUtils.distance(new int[]{1, 2}, new int[]{2, 3}), 1e-9);
        assertEquals(Math.sqrt(10.0), MathUtils.distance(new int[]{1, -2}, new int[]{2, 1}), 1e-9); // (1-2)^2 + (-2-1)^2 = 1 + 9 = 10
        // Test potential overflow in intermediate sum if not handled by double conversion
        assertEquals(Math.sqrt(2.0 * (long)Integer.MAX_VALUE * Integer.MAX_VALUE), MathUtils.distance(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, new int[]{0, 0}), 1e-9);
        assertEquals(Math.sqrt(2.0 * (long)Integer.MIN_VALUE * Integer.MIN_VALUE), MathUtils.distance(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE}, new int[]{0, 0}), 1e-9);
    }

    @Test
    public void testDistanceInfDoubleArray() throws Exception {
        assertEquals(0.0, MathUtils.distanceInf(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}), 1e-9);
        assertEquals(1.0, MathUtils.distanceInf(new double[]{1.0, 2.0}, new double[]{2.0, 3.0}), 1e-9);
        assertEquals(3.0, MathUtils.distanceInf(new double[]{1.0, -2.0}, new double[]{2.0, 1.0}), 1e-9); // max(|1-2|, |-2-1|) = max(1, 3) = 3
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.distanceInf(new double[]{Double.POSITIVE_INFINITY, 2.0}, new double[]{1.0, 3.0}), 1e-9);
        assertEquals(Double.NaN, MathUtils.distanceInf(new double[]{Double.NaN, 2.0}, new double[]{1.0, 3.0}), 1e-9);
    }

    @Test
    public void testDistanceInfIntArray() throws Exception {
        assertEquals(0, MathUtils.distanceInf(new int[]{1, 2}, new int[]{1, 2}));
        assertEquals(1, MathUtils.distanceInf(new int[]{1, 2}, new int[]{2, 3}));
        assertEquals(3, MathUtils.distanceInf(new int[]{1, -2}, new int[]{2, 1})); // max(|1-2|, |-2-1|) = max(1, 3) = 3
        assertEquals(Integer.MAX_VALUE, MathUtils.distanceInf(new int[]{Integer.MAX_VALUE, 0}, new int[]{0, 0}));
        assertEquals(2, MathUtils.distanceInf(new int[]{Integer.MIN_VALUE, 0}, new int[]{Integer.MIN_VALUE + 2, 0})); // max(|-MIN_VALUE - (-MIN_VALUE+2)|, |0-0|) = max(2, 0) = 2
    }
}
```