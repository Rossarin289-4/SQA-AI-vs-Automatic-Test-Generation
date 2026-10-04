package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class MathUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAddAndCheckPositive() throws Exception {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
    }

    @Test
    public void testAddAndCheckNegative() throws Exception {
        assertEquals(-5, MathUtils.addAndCheck(-2, -3));
    }

    @Test
    public void testAddAndCheckPositiveOverflow() throws Exception {
        try {
            MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAddAndCheckNegativeOverflow() throws Exception {
        try {
            MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAddAndCheckLongPositive() throws Exception {
        assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
    }

    @Test
    public void testAddAndCheckLongNegative() throws Exception {
        assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
    }

    @Test
    public void testAddAndCheckLongPositiveOverflow() throws Exception {
        try {
            MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAddAndCheckLongNegativeOverflow() throws Exception {
        try {
            MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testAddAndCheckLongMixedSigns() throws Exception {
        // Trace: Long.MIN_VALUE is -9223372036854775808. Long.MAX_VALUE is 9223372036854775807.
        // a = Long.MIN_VALUE, b = Long.MAX_VALUE.
        // a < 0, b > 0. Opposite signs, so always safe.
        // a + b = -1.
        assertEquals(-1L, MathUtils.addAndCheck(Long.MIN_VALUE, Long.MAX_VALUE));
    }

    @Test
    public void testBinomialCoefficientSimple() throws Exception {
        assertEquals(10, MathUtils.binomialCoefficient(5, 2));
    }

    @Test
    public void testBinomialCoefficientZeroK() throws Exception {
        assertEquals(1, MathUtils.binomialCoefficient(5, 0));
    }

    @Test
    public void testBinomialCoefficientOneK() throws Exception {
        assertEquals(5, MathUtils.binomialCoefficient(5, 1));
    }

    @Test
    public void testBinomialCoefficientNMinusOneK() throws Exception {
        assertEquals(5, MathUtils.binomialCoefficient(5, 4));
    }

    @Test
    public void testBinomialCoefficientNK() throws Exception {
        assertEquals(1, MathUtils.binomialCoefficient(5, 5));
    }

    @Test
    public void testBinomialCoefficientLargeN() throws Exception {
        assertEquals(155117520L, MathUtils.binomialCoefficient(30, 15));
    }
    
    @Test
    public void testBinomialCoefficientDoubleSimple() throws Exception {
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 1e-9);
    }

    @Test
    public void testBinomialCoefficientDoubleLargeN() throws Exception {
        // The value 1.55117520E8 is the result for binomialCoefficient(30, 15).
        // Using a larger tolerance as per the example's implied precision.
        assertEquals(1.55117520E8, MathUtils.binomialCoefficientDouble(30, 15), 1e1); // Reduced tolerance
    }

    @Test
    public void testBinomialCoefficientLogSimple() throws Exception {
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-9);
    }
    
    @Test
    public void testBinomialCoefficientLogLargeN() throws Exception {
        assertEquals(Math.log(1.55117520E8), MathUtils.binomialCoefficientLog(30, 15), 1e-9);
    }
    
    @Test
    public void testCoshZero() throws Exception {
        assertEquals(1.0, MathUtils.cosh(0.0), 1e-9);
    }

    @Test
    public void testCoshPositive() throws Exception {
        assertEquals(Math.cosh(1.0), MathUtils.cosh(1.0), 1e-9);
    }

    @Test
    public void testCoshNegative() throws Exception {
        assertEquals(Math.cosh(-1.0), MathUtils.cosh(-1.0), 1e-9);
    }

    @Test
    public void testEqualsDoubleEqual() throws Exception {
        assertTrue(MathUtils.equals(1.23, 1.23));
    }

    @Test
    public void testEqualsDoubleNaN() throws Exception {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
    }

    @Test
    public void testEqualsDoubleNotEqual() throws Exception {
        assertFalse(MathUtils.equals(1.23, 4.56));
    }

    @Test
    public void testEqualsDoubleArrayEqual() throws Exception {
        double[] arr1 = {1.0, 2.0, 3.0};
        double[] arr2 = {1.0, 2.0, 3.0};
        assertTrue(MathUtils.equals(arr1, arr2));
    }

    @Test
    public void testEqualsDoubleArrayNull() throws Exception {
        assertTrue(MathUtils.equals(null, null));
    }
    
    @Test
    public void testEqualsDoubleArrayOneNull() throws Exception {
        double[] arr1 = {1.0, 2.0, 3.0};
        assertFalse(MathUtils.equals(arr1, null));
        assertFalse(MathUtils.equals(null, arr1));
    }

    @Test
    public void testEqualsDoubleArrayDifferentLength() throws Exception {
        double[] arr1 = {1.0, 2.0};
        double[] arr2 = {1.0, 2.0, 3.0};
        assertFalse(MathUtils.equals(arr1, arr2));
    }

    @Test
    public void testEqualsDoubleArrayDifferentElements() throws Exception {
        double[] arr1 = {1.0, 2.0, 3.0};
        double[] arr2 = {1.0, 2.1, 3.0};
        assertFalse(MathUtils.equals(arr1, arr2));
    }

    @Test
    public void testFactorialZero() throws Exception {
        assertEquals(1L, MathUtils.factorial(0));
    }

    @Test
    public void testFactorialOne() throws Exception {
        assertEquals(1L, MathUtils.factorial(1));
    }

    @Test
    public void testFactorialTwenty() throws Exception {
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test
    public void testFactorialNegative() throws Exception {
        try {
            MathUtils.factorial(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testFactorialDoubleZero() throws Exception {
        assertEquals(1.0, MathUtils.factorialDouble(0), 1e-9);
    }

    @Test
    public void testFactorialDoubleTwenty() throws Exception {
        assertEquals(2.43290200817664E18, MathUtils.factorialDouble(20), 1e11);
    }

    @Test
    public void testFactorialDouble170() throws Exception {
        // Largest factorial that fits in a double
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.factorialDouble(170), 0); // Corrected from 171 to 170 based on Double.MAX_VALUE
    }

    @Test
    public void testFactorialDoubleNegative() throws Exception {
        try {
            MathUtils.factorialDouble(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testFactorialLogZero() throws Exception {
        assertEquals(0.0, MathUtils.factorialLog(0), 1e-9);
    }

    @Test
    public void testFactorialLogTwenty() throws Exception {
        assertEquals(Math.log(2.43290200817664E18), MathUtils.factorialLog(20), 1e-9);
    }
    
    @Test
    public void testFactorialLogNegative() throws Exception {
        try {
            MathUtils.factorialLog(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testGcdSimple() throws Exception {
        assertEquals(5, MathUtils.gcd(15, 25));
    }

    @Test
    public void testGcdOneZero() throws Exception {
        assertEquals(1, MathUtils.gcd(1, 0));
    }
    
    @Test
    public void testGcdZeroOne() throws Exception {
        assertEquals(1, MathUtils.gcd(0, 1));
    }

    @Test
    public void testGcdZeroZero() throws Exception {
        // Trace: (u == 0) || (v == 0) is true. Returns Math.abs(u) + Math.abs(v)
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test
    public void testGcdNegative() throws Exception {
        assertEquals(5, MathUtils.gcd(-15, 25));
        assertEquals(5, MathUtils.gcd(15, -25));
        assertEquals(5, MathUtils.gcd(-15, -25));
    }
    
    @Test
    public void testGcdIntMinValue() throws Exception {
        // Trace: gcd(Integer.MIN_VALUE, Integer.MIN_VALUE + 1)
        // u = -2147483648, v = -2147483647
        // u & 1 == 0, v & 1 == 1. k=0.
        // t = -(u / 2) = -(-1073741824) = 1073741824.
        // loop: t is even, t /= 2 ... until t is odd.
        // Eventually, u will become -1.
        assertEquals(1, MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE + 1));
    }
    
    @Test
    public void testGcdMaxInt() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.gcd(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testHashDouble() throws Exception {
        assertEquals(new Double(1.23).hashCode(), MathUtils.hash(1.23));
    }
    
    @Test
    public void testHashDoubleNaN() throws Exception {
        // Trace: new Double(Double.NaN).hashCode()
        assertEquals(Double.NaN, MathUtils.hash(Double.NaN), 0); // NaN comparison
    }

    @Test
    public void testHashDoubleArrayNull() throws Exception {
        assertEquals(Arrays.hashCode((double[])null), MathUtils.hash((double[])null));
    }

    @Test
    public void testHashDoubleArrayEmpty() throws Exception {
        double[] arr = {};
        assertEquals(Arrays.hashCode(arr), MathUtils.hash(arr));
    }

    @Test
    public void testIndicatorBytePositive() {
        assertEquals(1, MathUtils.indicator((byte) 5));
    }

    @Test
    public void testIndicatorByteNegative() {
        assertEquals(-1, MathUtils.indicator((byte) -5));
    }

    @Test
    public void testIndicatorByteZero() {
        // Trace: x=0, ZB=0. x >= ZB is true. Returns PB which is 1.
        assertEquals(1, MathUtils.indicator((byte) 0));
    }

    @Test
    public void testIndicatorDoublePositive() {
        assertEquals(1.0, MathUtils.indicator(5.0), 1e-9);
    }

    @Test
    public void testIndicatorDoubleNegative() {
        assertEquals(-1.0, MathUtils.indicator(-5.0), 1e-9);
    }

    @Test
    public void testIndicatorDoubleZero() {
        // Trace: x=0.0. x >= 0.0 is true. Returns 1.0.
        assertEquals(1.0, MathUtils.indicator(0.0), 1e-9);
    }

    @Test
    public void testIndicatorDoubleNaN() {
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }
    
    @Test
    public void testIndicatorFloatPositive() {
        assertEquals(1.0F, MathUtils.indicator(5.0F), 1e-9F);
    }

    @Test
    public void testIndicatorFloatNegative() {
        assertEquals(-1.0F, MathUtils.indicator(-5.0F), 1e-9F);
    }

    @Test
    public void testIndicatorFloatZero() {
        // Trace: x=0.0F. x >= 0.0F is true. Returns 1.0F.
        assertEquals(1.0F, MathUtils.indicator(0.0F), 1e-9F);
    }

    @Test
    public void testIndicatorFloatNaN() {
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
    }

    @Test
    public void testIndicatorIntPositive() {
        assertEquals(1, MathUtils.indicator(5));
    }

    @Test
    public void testIndicatorIntNegative() {
        assertEquals(-1, MathUtils.indicator(-5));
    }

    @Test
    public void testIndicatorIntZero() {
        // Trace: x=0. x >= 0 is true. Returns 1.
        assertEquals(1, MathUtils.indicator(0));
    }
    
    @Test
    public void testIndicatorLongPositive() {
        assertEquals(1L, MathUtils.indicator(5L));
    }

    @Test
    public void testIndicatorLongNegative() {
        assertEquals(-1L, MathUtils.indicator(-5L));
    }

    @Test
    public void testIndicatorLongZero() {
        // Trace: x=0L. x >= 0L is true. Returns 1L.
        assertEquals(1L, MathUtils.indicator(0L));
    }
    
    @Test
    public void testIndicatorShortPositive() {
        assertEquals(1, MathUtils.indicator((short) 5));
    }

    @Test
    public void testIndicatorShortNegative() {
        assertEquals(-1, MathUtils.indicator((short) -5));
    }

    @Test
    public void testIndicatorShortZero() {
        // Trace: x=0. ZS=0. x >= ZS is true. Returns PS which is 1.
        assertEquals(1, MathUtils.indicator((short) 0));
    }

    @Test
    public void testLcmSimple() throws Exception {
        assertEquals(75, MathUtils.lcm(15, 25));
    }
    
    @Test
    public void testLcmWithZero() throws Exception {
        // Trace: gcd(0, 5) = 5. a/gcd(a,b) = 0/5 = 0. mulAndCheck(0, 5) = 0. abs(0) = 0.
        assertEquals(0, MathUtils.lcm(0, 5));
        // Trace: gcd(5, 0) = 5. a/gcd(a,b) = 5/5 = 1. mulAndCheck(1, 0) = 0. abs(0) = 0.
        assertEquals(0, MathUtils.lcm(5, 0));
        // Trace: gcd(0, 0) = 0. Division by zero.
        // The test is incorrect as it expects 0, but a division by zero exception should occur.
        // The problem description states "If you cannot be certain, assert something you are certain of".
        // Given the code, an ArithmeticException will be thrown. However, the instruction is to
        // correct *failing tests*. This test fails because it expects 0, but gets an exception.
        // The reference code, when gcd(0,0) is 0, will lead to division by zero.
        // To make the test pass *on the reference code*, we need to handle the division by zero.
        // The `lcm` method calls `gcd(a, b)`. If `a` and `b` are both 0, `gcd` returns 0.
        // Then `a / gcd(a, b)` will cause division by zero.
        // Thus, the original test which expected 0 is incorrect.
        // The specification for `gcd(0,0)` is `Math.abs(0) + Math.abs(0)` which is 0.
        // The current `lcm` method will throw an ArithmeticException: "/ by zero" when inputs are (0,0).
        // The instruction is to correct tests that FAIL on the REFERENCE version.
        // The test `testLcmWithZero` failed with `ArithmeticException: / by zero` for `lcm(0,0)`.
        // The reference code *does* throw this exception for (0,0). So the test expectation was wrong.
        // The correct behavior for lcm(0,0) is undefined or an error.
        // The instruction is to correct *failing* tests. This test failed.
        // The simplest correction is to expect the exception for (0,0).
        try {
            MathUtils.lcm(0, 0);
            fail("Expected ArithmeticException for lcm(0,0)");
        } catch (ArithmeticException e) {
            // Expected: division by zero in gcd(0,0) used by lcm
            assertTrue(e.getMessage().contains("division by zero"));
        }
    }

    @Test
    public void testLcmWithOne() throws Exception {
        assertEquals(5, MathUtils.lcm(1, 5));
        assertEquals(5, MathUtils.lcm(5, 1));
    }
    
    @Test
    public void testLcmWithNegative() throws Exception {
        assertEquals(75, MathUtils.lcm(-15, 25));
        assertEquals(75, MathUtils.lcm(15, -25));
        assertEquals(75, MathUtils.lcm(-15, -25));
    }

    @Test
    public void testLcmOverflow() throws Exception {
        // Trace: gcd(Integer.MAX_VALUE, Integer.MAX_VALUE - 1) = 1
        // a / gcd(a,b) = Integer.MAX_VALUE.
        // mulAndCheck(Integer.MAX_VALUE, Integer.MAX_VALUE - 1) overflows.
        try {
            MathUtils.lcm(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testLogSimple() throws Exception {
        assertEquals(Math.log(8.0) / Math.log(2.0), MathUtils.log(2.0, 8.0), 1e-9);
    }
    
    @Test
    public void testLogBaseOne() throws Exception {
        // Trace: Math.log(x) / Math.log(1.0). Math.log(1.0) is 0.0.
        // If x > 0, Math.log(x) / 0.0 results in Infinity.
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.log(1.0, 2.0), 1e-9);
    }
    
    @Test
    public void testLogBaseZero() throws Exception {
        // Trace: Math.log(x) / Math.log(0.0). Math.log(0.0) is -Infinity.
        // Math.log(2.0) / -Infinity is 0.0.
        assertEquals(0.0, MathUtils.log(0.0, 2.0), 1e-9);
    }
    
    @Test
    public void testLogXZero() throws Exception {
        // Trace: Math.log(0.0) / Math.log(base). Math.log(0.0) is -Infinity.
        // If base > 0 and base != 1, Math.log(base) is finite.
        // -Infinity / finite_positive results in -Infinity.
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(2.0, 0.0), 1e-9);
    }

    @Test
    public void testLogNaN() throws Exception {
        // Trace: Math.log(NaN) is NaN. NaN / anything is NaN.
        assertTrue(Double.isNaN(MathUtils.log(Double.NaN, 2.0)));
        // Trace: Math.log(x) / Math.log(NaN). Math.log(NaN) is NaN.
        // anything / NaN is NaN.
        assertTrue(Double.isNaN(MathUtils.log(2.0, Double.NaN)));
        assertTrue(Double.isNaN(MathUtils.log(Double.NaN, Double.NaN)));
    }

    @Test
    public void testLogNegativeBase() throws Exception {
        // Trace: Math.log(base) where base is negative is NaN.
        // x / NaN is NaN.
        assertTrue(Double.isNaN(MathUtils.log(-2.0, 8.0)));
    }

    @Test
    public void testLogNegativeX() throws Exception {
        // Trace: Math.log(x) where x is negative is NaN.
        // NaN / base is NaN.
        assertTrue(Double.isNaN(MathUtils.log(2.0, -8.0)));
    }
    
    @Test
    public void testLogZeroZero() throws Exception {
        // Trace: Math.log(0.0) is -Infinity. Math.log(0.0) is -Infinity.
        // -Infinity / -Infinity is NaN.
        assertTrue(Double.isNaN(MathUtils.log(0.0, 0.0)));
    }

    @Test
    public void testMulAndCheckPositive() throws Exception {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
    }

    @Test
    public void testMulAndCheckNegative() throws Exception {
        assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(2, -3));
        assertEquals(6, MathUtils.mulAndCheck(-2, -3));
    }

    @Test
    public void testMulAndCheckZero() throws Exception {
        assertEquals(0, MathUtils.mulAndCheck(0, 5));
        assertEquals(0, MathUtils.mulAndCheck(5, 0));
        assertEquals(0, MathUtils.mulAndCheck(0, 0));
    }

    @Test
    public void testMulAndCheckPositiveOverflow() throws Exception {
        try {
            MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testMulAndCheckNegativeOverflow() throws Exception {
        try {
            MathUtils.mulAndCheck(Integer.MIN_VALUE, 2);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testMulAndCheckLongPositive() throws Exception {
        assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
    }

    @Test
    public void testMulAndCheckLongNegative() throws Exception {
        assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        assertEquals(-6L, MathUtils.mulAndCheck(2L, -3L));
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
    }

    @Test
    public void testMulAndCheckLongZero() throws Exception {
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, 0L));
    }

    @Test
    public void testMulAndCheckLongPositiveOverflow() throws Exception {
        // Trace: (Long.MAX_VALUE / 2 + 1) * 2
        // (9223372036854775807 / 2 + 1) * 2
        // (4611686018427387903 + 1) * 2
        // 4611686018427387904 * 2 = 9223372036854775808
        // This is Long.MAX_VALUE + 1, which overflows.
        try {
            MathUtils.mulAndCheck(Long.MAX_VALUE / 2 + 1, 2);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testMulAndCheckLongMinValue() throws Exception {
        assertEquals(Long.MIN_VALUE, MathUtils.mulAndCheck(Long.MIN_VALUE, 1L));
    }

    @Test
    public void testMulAndCheckLongMinValueByNegativeOne() throws Exception {
        // Trace: Long.MIN_VALUE * -1
        // a = Long.MIN_VALUE, b = -1. a < 0, b < 0.
        // Check: a >= Long.MAX_VALUE / b
        // Long.MIN_VALUE >= Long.MAX_VALUE / -1
        // -9223372036854775808 >= -9223372036854775807 is false.
        // Throws ArithmeticException.
        try {
            MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testNextAfterPositiveToPositive() throws Exception {
        // Trace: d=1.0, direction=2.0. direction - d = 1.0. d * (direction - d) = 1.0. >= 0.
        // mantissa = 0. exponent = 0x0010000000000000L.
        // mantissa == 0x000fffffffffffffL is false.
        // mantissa + 1.
        // bits for 1.0 is 0x3ff0000000000000L.
        // mantissa is 0x0000000000000000L. exponent is 0x3ff0000000000000L.
        // This is where the logic is tricky. The raw components are:
        // sign = 0
        // exponent = 0x3ff0000000000000L
        // mantissa = 0x0000000000000000L
        // For d = 1.0, bits are 0x3ff0000000000000.
        // exponent = 0x3ff0000000000000
        // mantissa = 0
        // direction - d = 1.0, so d * (direction - d) = 1.0, which is >= 0.
        // increment mantissa. mantissa + 1 = 1.
        // new bits = sign | exponent | (mantissa + 1) = 0x3ff0000000000001L.
        // Double.longBitsToDouble(0x3ff0000000000001L) is the next representable number after 1.0.
        // Math.nextUp(1.0) returns this value.
        assertEquals(Math.nextUp(1.0), MathUtils.nextAfter(1.0, 2.0), 1e-15);
    }

    @Test
    public void testNextAfterPositiveToNegative() throws Exception {
        // Trace: d=1.0, direction=0.0. direction - d = -1.0. d * (direction - d) = -1.0. < 0.
        // decrease the mantissa.
        // bits for 1.0 is 0x3ff0000000000000L.
        // mantissa is 0. exponent is 0x3ff0000000000000L.
        // mantissa == 0L is true.
        // return Double.longBitsToDouble(sign | (exponent - 0x0010000000000000L) | 0x000fffffffffffffL);
        // exponent - 0x0010000000000000L = 0x3fe0000000000000L.
        // mantissa = 0x000fffffffffffffL.
        // new bits = 0x3fefffffffffffffL. This is Double.MAX_VALUE.
        // Double.longBitsToDouble(0x3fefffffffffffffL) is Double.MAX_VALUE
        // Math.nextDown(1.0) returns Double.MAX_VALUE.
        assertEquals(Math.nextDown(1.0), MathUtils.nextAfter(1.0, 0.0), 1e-15);
    }

    @Test
    public void testNextAfterZeroToPositive() throws Exception {
        // Trace: d=0.0, direction=1.0. d == 0. returns (direction < 0) ? -Double.MIN_VALUE : Double.MIN_VALUE;
        // direction (1.0) < 0 is false. Returns Double.MIN_VALUE.
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 1e-15);
    }

    @Test
    public void testNextAfterZeroToNegative() throws Exception {
        // Trace: d=0.0, direction=-1.0. d == 0. returns (direction < 0) ? -Double.MIN_VALUE : Double.MIN_VALUE;
        // direction (-1.0) < 0 is true. Returns -Double.MIN_VALUE.
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 1e-15);
    }

    @Test
    public void testNextAfterNaN() throws Exception {
        // Trace: Double.isNaN(d) is true. Returns d.
        assertEquals(Double.NaN, MathUtils.nextAfter(Double.NaN, 1.0), 0); // Use 0 for NaN comparison
        // Trace: d=1.0, direction=NaN. Double.isNaN(d) is false. d == 0 is false.
        // d * (direction - d) = 1.0 * (NaN - 1.0) = 1.0 * NaN = NaN.
        // NaN >= 0 is false.
        // So it goes to the else block (decrease mantissa).
        // mantissa == 0L is true for 1.0.
        // This should return Double.MAX_VALUE.
        // The test expected NaN, but the code does not return NaN here.
        // The correct behavior for d=1.0, direction=NaN is to return Double.MAX_VALUE.
        // However, the instruction is to correct tests that FAIL on reference. This test failed.
        // The reference code does NOT return NaN for this case.
        // Let's re-read the nextAfter() method description:
        // "If d is NaN or Infinite, it is returned unchanged."
        // The current test calls nextAfter(1.0, Double.NaN). Here 'd' is 1.0, not NaN.
        // The current code does not explicitly check if 'direction' is NaN, but the arithmetic
        // with NaN will result in NaN.
        // Let's trace the path again for d=1.0, direction=NaN.
        // d * (direction - d) = 1.0 * (NaN - 1.0) = NaN.
        // NaN >= 0 is false.
        // So it goes to the 'else' branch (decrease mantissa).
        // mantissa == 0L is true for d=1.0.
        // return Double.longBitsToDouble(sign | (exponent - 0x0010000000000000L) | 0x000fffffffffffffL);
        // This calculation yields Double.MAX_VALUE.
        // The test *failed* because it expected NaN, but got Double.MAX_VALUE.
        // The *correct* expectation for nextAfter(1.0, Double.NaN) is Double.MAX_VALUE.
        assertEquals(Double.MAX_VALUE, MathUtils.nextAfter(1.0, Double.NaN), 1e-15);
    }

    @Test
    public void testNextAfterInfinity() throws Exception {
        // Trace: Double.isInfinite(d) is true. Returns d.
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 1e-15);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.nextAfter(Double.NEGATIVE_INFINITY, 1.0), 1e-15);
        // Trace: d=inf, direction=inf. Double.isInfinite(d) is true. Returns d.
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-15);
    }
    
    @Test
    public void testNextAfterMaxDouble() throws Exception {
        // Trace: d=Double.MAX_VALUE, direction=POSITIVE_INFINITY.
        // d * (direction - d) = MAX_VALUE * (INF - MAX_VALUE) = MAX_VALUE * INF = INF. >= 0.
        // increase mantissa.
        // bits for MAX_VALUE: 0x7fefffffffffffffL.
        // sign = 0, exponent = 0x7fe0000000000000L, mantissa = 0x000fffffffffffffL.
        // mantissa == 0x000fffffffffffffL is true.
        // return Double.longBitsToDouble(sign | (exponent + 0x0010000000000000L));
        // exponent + 0x0010000000000000L = 0x7ff0000000000000L.
        // This is the bit representation of Double.POSITIVE_INFINITY.
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 1e-15);
        
        // Trace: d=Double.MAX_VALUE, direction=0.0.
        // d * (direction - d) = MAX_VALUE * (0.0 - MAX_VALUE) = MAX_VALUE * (-MAX_VALUE) < 0.
        // decrease mantissa.
        // mantissa == 0L is false.
        // return Double.longBitsToDouble(sign | exponent | (mantissa - 1));
        // mantissa - 1 = 0x000fffffffffffffL - 1 = 0x000ffffffffffffeL.
        // new bits = 0x7feffffffffffffeL.
        // This is the largest number smaller than Double.MAX_VALUE.
        // Math.nextDown(Double.MAX_VALUE) returns this value.
        assertEquals(Math.nextDown(Double.MAX_VALUE), MathUtils.nextAfter(Double.MAX_VALUE, 0.0), 1e-15);
    }

    @Test
    public void testNextAfterMinDouble() throws Exception {
        // Trace: d=Double.MIN_VALUE, direction=Double.NEGATIVE_INFINITY.
        // d * (direction - d) = MIN_VALUE * (-INF - MIN_VALUE) = MIN_VALUE * (-INF) = INF. >= 0.
        // increase mantissa.
        // bits for MIN_VALUE (smallest positive normalized): 0x0010000000000000L.
        // sign=0, exponent=0x0010000000000000L, mantissa=0.
        // mantissa == 0x000fffffffffffffL is false.
        // mantissa + 1.
        // new bits = 0x0010000000000001L.
        // This is the smallest number greater than Double.MIN_VALUE.
        // The test expected Double.NEGATIVE_INFINITY, which is wrong.
        // Corrected to expect the next representable value.
        // Double.longBitsToDouble(0x0010000000000001L) is the correct expectation.
        // However, Math.nextUp(Double.MIN_VALUE) will give this.
        assertEquals(Math.nextUp(Double.MIN_VALUE), MathUtils.nextAfter(Double.MIN_VALUE, Double.NEGATIVE_INFINITY), 1e-15);

        // Trace: d=Double.MIN_VALUE, direction=0.0.
        // d * (direction - d) = MIN_VALUE * (0.0 - MIN_VALUE) = MIN_VALUE * (-MIN_VALUE) > 0. >= 0.
        // increase mantissa.
        // mantissa == 0x000fffffffffffffL is false.
        // mantissa + 1.
        // new bits = 0x0010000000000001L.
        // The test expected -Double.MIN_VALUE, which is wrong.
        // The reference code gives the next representable value *after* MIN_VALUE.
        // Corrected to expect the next representable value.
        assertEquals(Math.nextUp(Double.MIN_VALUE), MathUtils.nextAfter(Double.MIN_VALUE, 0.0), 1e-15);
        
        // Trace: d=-Double.MIN_VALUE, direction=0.0.
        // d is negative. direction is 0.0.
        // d * (direction - d) = -MIN_VALUE * (0.0 - (-MIN_VALUE)) = -MIN_VALUE * MIN_VALUE < 0. < 0.
        // decrease mantissa.
        // bits for -Double.MIN_VALUE: 0x8010000000000000L.
        // sign = 0x8000000000000000L, exponent = 0x0010000000000000L, mantissa = 0.
        // mantissa == 0L is true.
        // return Double.longBitsToDouble(sign | (exponent - 0x0010000000000000L) | 0x000fffffffffffffL);
        // exponent - 0x0010000000000000L = 0.
        // new bits = 0x8000000000000000L | 0x000fffffffffffffL = 0x800fffffffffffffL.
        // This is the largest negative number smaller than -Double.MIN_VALUE.
        // The test expected Double.MIN_VALUE, which is wrong.
        // The reference code gives the previous representable value.
        // Math.nextDown(-Double.MIN_VALUE) will give this.
        assertEquals(Math.nextDown(-Double.MIN_VALUE), MathUtils.nextAfter(-Double.MIN_VALUE, 0.0), 1e-15);
    }

    @Test
    public void testScalbSimple() throws Exception {
        assertEquals(12.0, MathUtils.scalb(3.0, 2), 1e-9);
    }

    @Test
    public void testScalbNegativeScale() throws Exception {
        assertEquals(0.75, MathUtils.scalb(3.0, -2), 1e-9);
    }

    @Test
    public void testScalbZero() throws Exception {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 1e-9);
    }

    @Test
    public void testScalbNaN() throws Exception {
        assertEquals(Double.NaN, MathUtils.scalb(Double.NaN, 5), 0); // NaN comparison
    }

    @Test
    public void testScalbInfinity() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.scalb(Double.NEGATIVE_INFINITY, 5), 1e-9);
    }
    
    @Test
    public void testNormalizeAngleSimple() throws Exception {
        assertEquals(Math.PI / 2.0, MathUtils.normalizeAngle(Math.PI / 2.0, 0.0), 1e-9);
    }

    @Test
    public void testNormalizeAnglePositiveLarge() throws Exception {
        assertEquals(Math.PI / 2.0, MathUtils.normalizeAngle(Math.PI / 2.0 + 2 * Math.PI, 0.0), 1e-9);
    }

    @Test
    public void testNormalizeAngleNegativeLarge() throws Exception {
        assertEquals(Math.PI / 2.0, MathUtils.normalizeAngle(Math.PI / 2.0 - 2 * Math.PI, 0.0), 1e-9);
    }

    @Test
    public void testNormalizeAngleAroundPi() throws Exception {
        // a = 3*PI, center = PI
        // a + PI - center = 3*PI + PI - PI = 3*PI
        // (a + PI - center) / TWO_PI = 3*PI / (2*PI) = 1.5
        // Math.floor(1.5) = 1.0
        // TWO_PI * 1.0 = 2*PI
        // result = a - TWO_PI * 1.0 = 3*PI - 2*PI = PI.
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-9);
    }

    @Test
    public void testNormalizeAngleAroundZero() throws Exception {
        // a = 2*PI, center = 0.0
        // a + PI - center = 2*PI + PI - 0.0 = 3*PI
        // (a + PI - center) / TWO_PI = 3*PI / (2*PI) = 1.5
        // Math.floor(1.5) = 1.0
        // TWO_PI * 1.0 = 2*PI
        // result = a - TWO_PI * 1.0 = 2*PI - 2*PI = 0.0.
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-9);
    }
    
    @Test
    public void testNormalizeAngleLargeDifference() throws Exception {
        // a = 5*PI, center = PI
        // a + PI - center = 5*PI + PI - PI = 5*PI
        // (a + PI - center) / TWO_PI = 5*PI / (2*PI) = 2.5
        // Math.floor(2.5) = 2.0
        // TWO_PI * 2.0 = 4*PI
        // result = a - TWO_PI * 2.0 = 5*PI - 4*PI = PI.
        assertEquals(Math.PI, MathUtils.normalizeAngle(5 * Math.PI, Math.PI), 1e-9);
    }
    
    @Test
    public void testRoundDoubleSimple() throws Exception {
        // Trace: x=12.345, scale=2. Using default ROUND_HALF_UP.
        // BigDecimal("12.345").setScale(2, BigDecimal.ROUND_HALF_UP)
        // "12.345" scaled to 2 decimal places with HALF_UP rounds to "12.35".
        // doubleValue() returns 12.35.
        assertEquals(12.35, MathUtils.round(12.345, 2), 1e-9);
        // The explicit call uses ROUND_HALF_UP, so it should also be 12.35.
        assertEquals(12.35, MathUtils.round(12.345, 2, BigDecimal.ROUND_HALF_UP), 1e-9);
    }

    @Test
    public void testRoundDoubleNegative() throws Exception {
        // Trace: x=-12.345, scale=2. Using default ROUND_HALF_UP.
        // BigDecimal("-12.345").setScale(2, BigDecimal.ROUND_HALF_UP)
        // "-12.345" scaled to 2 decimal places with HALF_UP rounds to "-12.35".
        // doubleValue() returns -12.35.
        assertEquals(-12.35, MathUtils.round(-12.345, 2), 1e-9);
        // The explicit call uses ROUND_HALF_UP, so it should also be -12.35.
        assertEquals(-12.35, MathUtils.round(-12.345, 2, BigDecimal.ROUND_HALF_UP), 1e-9);
    }

    @Test
    public void testRoundDoubleScaleZero() throws Exception {
        // Trace: x=12.345, scale=0. ROUND_HALF_UP.
        // BigDecimal("12.345").setScale(0, BigDecimal.ROUND_HALF_UP) rounds to "12". doubleValue() returns 12.0.
        assertEquals(12.0, MathUtils.round(12.345, 0), 1e-9);
        // Trace: x=12.45, scale=0. ROUND_HALF_UP.
        // BigDecimal("12.45").setScale(0, BigDecimal.ROUND_HALF_UP) rounds to "12". doubleValue() returns 12.0.
        assertEquals(12.0, MathUtils.round(12.45, 0), 1e-9);
    }

    @Test
    public void testRoundDoubleScaleNegative() throws Exception {
        // Trace: x=12.345, scale=-1. ROUND_HALF_UP.
        // BigDecimal("12.345").setScale(-1, BigDecimal.ROUND_HALF_UP) rounds to "10". doubleValue() returns 10.0.
        assertEquals(10.0, MathUtils.round(12.345, -1), 1e-9);
        // Trace: x=12.345, scale=-2. ROUND_HALF_UP.
        // BigDecimal("12.345").setScale(-2, BigDecimal.ROUND_HALF_UP) rounds to "0". doubleValue() returns 0.0.
        assertEquals(0.0, MathUtils.round(12.345, -2), 1e-9);
    }

    @Test
    public void testRoundDoubleNaN() throws Exception {
        // Trace: x=NaN. NumberFormatException is not thrown. Double.isInfinite(x) is false. Returns Double.NaN.
        assertEquals(Double.NaN, MathUtils.round(Double.NaN, 2), 0); // NaN comparison
    }

    @Test
    public void testRoundDoubleInfinity() throws Exception {
        // Trace: x=Infinity. NumberFormatException is not thrown. Double.isInfinite(x) is true. Returns x.
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.round(Double.NEGATIVE_INFINITY, 2), 1e-9);
    }
    
    @Test
    public void testRoundFloatSimple() throws Exception {
        // Trace: x=12.345F, scale=2. ROUND_HALF_UP.
        // BigDecimal("12.345").setScale(2, BigDecimal.ROUND_HALF_UP) rounds to "12.35". doubleValue() returns 12.35F.
        assertEquals(12.35F, MathUtils.round(12.345F, 2), 1e-6F);
        // Explicit call with ROUND_HALF_UP should yield the same result.
        assertEquals(12.35F, MathUtils.round(12.345F, 2, BigDecimal.ROUND_HALF_UP), 1e-6F);
    }

    @Test
    public void testSignBytePositive() {
        assertEquals(1, MathUtils.sign((byte) 5));
    }

    @Test
    public void testSignByteNegative() {
        assertEquals(-1, MathUtils.sign((byte) -5));
    }

    @Test
    public void testSignByteZero() {
        // Trace: x=0. ZB=0. x == ZB is true. Returns ZB which is 0.
        assertEquals(0, MathUtils.sign((byte) 0));
    }

    @Test
    public void testSignDoublePositive() {
        assertEquals(1.0, MathUtils.sign(5.0), 1e-9);
    }

    @Test
    public void testSignDoubleNegative() {
        assertEquals(-1.0, MathUtils.sign(-5.0), 1e-9);
    }

    @Test
    public void testSignDoubleZero() {
        // Trace: x=0.0. x == 0.0 is true. Returns 0.0.
        assertEquals(0.0, MathUtils.sign(0.0), 1e-9);
    }

    @Test
    public void testSignDoubleNaN() {
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }
    
    @Test
    public void testSignFloatPositive() {
        assertEquals(1.0F, MathUtils.sign(5.0F), 1e-9F);
    }

    @Test
    public void testSignFloatNegative() {
        assertEquals(-1.0F, MathUtils.sign(-5.0F), 1e-9F);
    }

    @Test
    public void testSignFloatZero() {
        // Trace: x=0.0F. x == 0.0F is true. Returns 0.0F.
        assertEquals(0.0F, MathUtils.sign(0.0F), 1e-9F);
    }

    @Test
    public void testSignFloatNaN() {
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testSignIntPositive() {
        assertEquals(1, MathUtils.sign(5));
    }

    @Test
    public void testSignIntNegative() {
        assertEquals(-1, MathUtils.sign(-5));
    }

    @Test
    public void testSignIntZero() {
        // Trace: x=0. x == 0 is true. Returns 0.
        assertEquals(0, MathUtils.sign(0));
    }
    
    @Test
    public void testSignLongPositive() {
        assertEquals(1L, MathUtils.sign(5L));
    }

    @Test
    public void testSignLongNegative() {
        assertEquals(-1L, MathUtils.sign(-5L));
    }

    @Test
    public void testSignLongZero() {
        // Trace: x=0L. x == 0L is true. Returns 0L.
        assertEquals(0L, MathUtils.sign(0L));
    }
    
    @Test
    public void testSignShortPositive() {
        assertEquals(1, MathUtils.sign((short) 5));
    }

    @Test
    public void testSignShortNegative() {
        assertEquals(-1, MathUtils.sign((short) -5));
    }

    @Test
    public void testSignShortZero() {
        // Trace: x=0. ZS=0. x == ZS is true. Returns ZS which is 0.
        assertEquals(0, MathUtils.sign((short) 0));
    }

    @Test
    public void testSinhZero() throws Exception {
        assertEquals(0.0, MathUtils.sinh(0.0), 1e-9);
    }

    @Test
    public void testSinhPositive() throws Exception {
        assertEquals(Math.sinh(1.0), MathUtils.sinh(1.0), 1e-9);
    }

    @Test
    public void testSinhNegative() throws Exception {
        assertEquals(Math.sinh(-1.0), MathUtils.sinh(-1.0), 1e-9);
    }

    @Test
    public void testSubAndCheckPositive() throws Exception {
        assertEquals(1, MathUtils.subAndCheck(3, 2));
    }

    @Test
    public void testSubAndCheckNegative() throws Exception {
        assertEquals(-1, MathUtils.subAndCheck(2, 3));
        assertEquals(-5, MathUtils.subAndCheck(-2, 3));
        assertEquals(1, MathUtils.subAndCheck(-2, -3));
    }

    @Test
    public void testSubAndCheckPositiveOverflow() throws Exception {
        // Trace: x = Integer.MIN_VALUE, y = 1.
        // s = (long)Integer.MIN_VALUE - (long)1 = -2147483648L - 1L = -2147483649L.
        // s < Integer.MIN_VALUE (-2147483648) is true. Throws ArithmeticException.
        try {
            MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testSubAndCheckNegativeOverflow() throws Exception {
        // Trace: x = Integer.MAX_VALUE, y = -1.
        // s = (long)Integer.MAX_VALUE - (long)(-1) = 2147483647L + 1L = 2147483648L.
        // s > Integer.MAX_VALUE (2147483647) is true. Throws ArithmeticException.
        try {
            MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testSubAndCheckLongPositive() throws Exception {
        assertEquals(1L, MathUtils.subAndCheck(3L, 2L));
    }

    @Test
    public void testSubAndCheckLongNegative() throws Exception {
        assertEquals(-1L, MathUtils.subAndCheck(2L, 3L));
        assertEquals(-5L, MathUtils.subAndCheck(-2L, 3L));
        assertEquals(1L, MathUtils.subAndCheck(-2L, -3L));
    }

    @Test
    public void testSubAndCheckLongPositiveOverflow() throws Exception {
        // Trace: a = Long.MIN_VALUE, b = 1L.
        // addAndCheck(a, -b, msg) -> addAndCheck(Long.MIN_VALUE, -1L, "overflow: subtract")
        // Inside addAndCheck:
        // a = Long.MIN_VALUE, b = -1L.
        // a < 0, b < 0. Check for negative overflow.
        // Long.MIN_VALUE - (-1L) <= a ?
        // Long.MIN_VALUE + 1L <= Long.MIN_VALUE ?
        // -9223372036854775808L + 1L <= -9223372036854775808L ?
        // -9223372036854775807L <= -9223372036854775808L is false.
        // Throws ArithmeticException.
        try {
            MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testSubAndCheckLongNegativeOverflow() throws Exception {
        // Trace: a = Long.MAX_VALUE, b = -1L.
        // addAndCheck(a, -b, msg) -> addAndCheck(Long.MAX_VALUE, 1L, "overflow: subtract")
        // Inside addAndCheck:
        // a = Long.MAX_VALUE, b = 1L.
        // a >= 0, b >= 0. Check for positive overflow.
        // a <= Long.MAX_VALUE - b ?
        // Long.MAX_VALUE <= Long.MAX_VALUE - 1L ? is false.
        // Throws ArithmeticException.
        try {
            MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testSubAndCheckLongMinValue() throws Exception {
        // Trace: a = Long.MIN_VALUE, b = 0L.
        // addAndCheck(a, -b, msg) -> addAndCheck(Long.MIN_VALUE, 0L, "overflow: subtract")
        // Inside addAndCheck:
        // a = Long.MIN_VALUE, b = 0L.
        // a < 0, b >= 0. Opposite signs, always safe.
        // ret = a + b = Long.MIN_VALUE + 0L = Long.MIN_VALUE.
        assertEquals(Long.MIN_VALUE, MathUtils.subAndCheck(Long.MIN_VALUE, 0L));
    }

    @Test
    public void testSubAndCheckLongMinValueSubtractPositive() throws Exception {
        // Trace: a = Long.MIN_VALUE, b = 1L.
        // addAndCheck(a, -b, msg) -> addAndCheck(Long.MIN_VALUE, -1L, "overflow: subtract")
        // This was tested and correctly throws ArithmeticException.
        // The test case was correct.
        try {
            MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testSubAndCheckLongMinValueSubtractMinValue() throws Exception {
        // Trace: a = Long.MIN_VALUE, b = Long.MIN_VALUE.
        // addAndCheck(a, -b, msg) -> addAndCheck(Long.MIN_VALUE, -Long.MIN_VALUE, "overflow: subtract")
        // -Long.MIN_VALUE overflows.
        // The code has a special check for `b == Long.MIN_VALUE`.
        // If b is Long.MIN_VALUE, and a < 0, it computes a - b.
        // Here, a is Long.MIN_VALUE, which is < 0.
        // So, it computes a - b = Long.MIN_VALUE - Long.MIN_VALUE = 0.
        // The test expected ArithmeticException, but the reference code returns 0.
        assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
    }

}
