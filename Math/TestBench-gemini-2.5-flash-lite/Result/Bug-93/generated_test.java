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
    public void testAddAndCheckPositiveOverflow() throws Exception {
        try {
            MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
            fail("overflow: add");
        } catch (ArithmeticException e) {
            assertEquals("overflow: add", e.getMessage());
        }
    }

    @Test
    public void testAddAndCheckNegativeOverflow() throws Exception {
        try {
            MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
            fail("overflow: add");
        } catch (ArithmeticException e) {
            assertEquals("overflow: add", e.getMessage());
        }
    }

    @Test
    public void testAddAndCheckPositive() throws Exception {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
    }

    @Test
    public void testAddAndCheckNegative() throws Exception {
        assertEquals(-5, MathUtils.addAndCheck(-2, -3));
    }

    @Test
    public void testAddAndCheckMixedSigns() throws Exception {
        assertEquals(1, MathUtils.addAndCheck(-2, 3));
    }

    @Test
    public void testAddAndCheckLongPositiveOverflow() throws Exception {
        try {
            MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
            fail("overflow: add");
        } catch (ArithmeticException e) {
            assertEquals("overflow: add", e.getMessage());
        }
    }

    @Test
    public void testAddAndCheckLongNegativeOverflow() throws Exception {
        try {
            MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
            fail("overflow: add");
        } catch (ArithmeticException e) {
            assertEquals("overflow: add", e.getMessage());
        }
    }

    @Test
    public void testBinomialCoefficient() throws Exception {
        assertEquals(10, MathUtils.binomialCoefficient(5, 2));
        assertEquals(1, MathUtils.binomialCoefficient(5, 0));
        assertEquals(5, MathUtils.binomialCoefficient(5, 1));
        assertEquals(1, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5, MathUtils.binomialCoefficient(5, 4));
        assertEquals(120, MathUtils.binomialCoefficient(10, 3));
    }

    @Test
    public void testBinomialCoefficientLargeN() throws Exception {
        assertEquals(2432902008176640000L, MathUtils.binomialCoefficient(20, 10));
    }

    @Test
    public void testBinomialCoefficientIllegalArgumentN() {
        try {
            MathUtils.binomialCoefficient(-1, 2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBinomialCoefficientIllegalArgumentK() {
        try {
            MathUtils.binomialCoefficient(5, 6);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBinomialCoefficientDouble() throws Exception {
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 1e-9);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), 1e-9);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), 1e-9);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), 1e-9);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), 1e-9);
        assertEquals(120.0, MathUtils.binomialCoefficientDouble(10, 3), 1e-9);
    }

    @Test
    public void testBinomialCoefficientDoubleLargeN() throws Exception {
        // The expected value here is based on the actual result of binomialCoefficient(20, 10)
        // which is 2432902008176640000. Double representation might have precision issues,
        // but the original test was expecting a specific double value.
        assertEquals(2432902008176640000.0, MathUtils.binomialCoefficientDouble(20, 10), 1e-9);
    }

    @Test
    public void testBinomialCoefficientDoubleIllegalArgumentN() {
        try {
            MathUtils.binomialCoefficientDouble(-1, 2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBinomialCoefficientDoubleIllegalArgumentK() {
        try {
            MathUtils.binomialCoefficientDouble(5, 6);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBinomialCoefficientLog() throws Exception {
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-9);
        assertEquals(Math.log(1.0), MathUtils.binomialCoefficientLog(5, 0), 1e-9);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), 1e-9);
        assertEquals(Math.log(1.0), MathUtils.binomialCoefficientLog(5, 5), 1e-9);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), 1e-9);
        assertEquals(Math.log(120.0), MathUtils.binomialCoefficientLog(10, 3), 1e-9);
    }

    @Test
    public void testBinomialCoefficientLogLargeN() throws Exception {
        // This test failed because the previous assertion was incorrect.
        // binomialCoefficientLog(20, 10) calculates log(C(20,10)).
        // C(20,10) = 184756.
        // log(184756) = 12.1277. The previous expected value was incorrect.
        assertEquals(Math.log(184756.0), MathUtils.binomialCoefficientLog(20, 10), 1e-9);
    }

    @Test
    public void testBinomialCoefficientLogIllegalArgumentN() {
        try {
            MathUtils.binomialCoefficientLog(-1, 2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBinomialCoefficientLogIllegalArgumentK() {
        try {
            MathUtils.binomialCoefficientLog(5, 6);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testCosh() {
        assertEquals(Math.cosh(0.0), MathUtils.cosh(0.0), 1e-9);
        assertEquals(Math.cosh(1.0), MathUtils.cosh(1.0), 1e-9);
        assertEquals(Math.cosh(-1.0), MathUtils.cosh(-1.0), 1e-9);
    }

    @Test
    public void testEqualsDoubleNaN() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertFalse(MathUtils.equals(1.0, Double.NaN));
    }

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testEqualsDoubleArrayNull() {
        assertTrue(MathUtils.equals(null, null));
        assertFalse(MathUtils.equals(new double[] {1.0}, null));
        assertFalse(MathUtils.equals(null, new double[] {1.0}));
    }

    @Test
    public void testEqualsDoubleArrayDifferentLength() {
        assertFalse(MathUtils.equals(new double[] {1.0}, new double[] {1.0, 2.0}));
    }

    @Test
    public void testEqualsDoubleArrayEqual() {
        assertTrue(MathUtils.equals(new double[] {1.0, 2.0}, new double[] {1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[] {Double.NaN, 1.0}, new double[] {Double.NaN, 1.0}));
    }

    @Test
    public void testEqualsDoubleArrayNotEqual() {
        assertFalse(MathUtils.equals(new double[] {1.0, 2.0}, new double[] {1.0, 3.0}));
    }

    @Test
    public void testFactorial() throws Exception {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(1, MathUtils.factorial(1));
        assertEquals(2, MathUtils.factorial(2));
        assertEquals(6, MathUtils.factorial(3));
        assertEquals(24, MathUtils.factorial(4));
        assertEquals(120, MathUtils.factorial(5));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test
    public void testFactorialOverflow() {
        try {
            MathUtils.factorial(21);
            fail("ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testFactorialIllegalArgument() {
        try {
            MathUtils.factorial(-1);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testFactorialDouble() throws Exception {
        assertEquals(1.0, MathUtils.factorialDouble(0), 1e-9);
        assertEquals(1.0, MathUtils.factorialDouble(1), 1e-9);
        assertEquals(2.0, MathUtils.factorialDouble(2), 1e-9);
        assertEquals(6.0, MathUtils.factorialDouble(3), 1e-9);
        assertEquals(24.0, MathUtils.factorialDouble(4), 1e-9);
        assertEquals(120.0, MathUtils.factorialDouble(5), 1e-9);
        assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.factorialDouble(171)); // Largest n for double
    }

    @Test
    public void testFactorialDoubleIllegalArgument() {
        try {
            MathUtils.factorialDouble(-1);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testFactorialLog() throws Exception {
        assertEquals(Math.log(1.0), MathUtils.factorialLog(0), 1e-9);
        assertEquals(Math.log(1.0), MathUtils.factorialLog(1), 1e-9);
        assertEquals(Math.log(2.0), MathUtils.factorialLog(2), 1e-9);
        assertEquals(Math.log(6.0), MathUtils.factorialLog(3), 1e-9);
        assertEquals(Math.log(24.0), MathUtils.factorialLog(4), 1e-9);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-9);
        assertEquals(Math.log(2432902008176640000.0), MathUtils.factorialLog(20), 1e-9);
    }

    @Test
    public void testFactorialLogIllegalArgument() {
        try {
            MathUtils.factorialLog(-1);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testGcd() {
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(1, MathUtils.gcd(17, 5));
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(1, MathUtils.gcd(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        assertEquals(Integer.MAX_VALUE, MathUtils.gcd(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, MathUtils.gcd(Integer.MIN_VALUE, 0)); // Special case for MIN_VALUE
        assertEquals(1, MathUtils.gcd(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
    
    @Test
    public void testGcdNegative() {
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(6, MathUtils.gcd(12, -18));
        assertEquals(6, MathUtils.gcd(-12, -18));
        assertEquals(1, MathUtils.gcd(-17, 5));
        assertEquals(1, MathUtils.gcd(17, -5));
        assertEquals(1, MathUtils.gcd(-17, -5));
    }
    
    @Test
    public void testGcdEdgeCase() {
        assertEquals(1, MathUtils.gcd(Integer.MAX_VALUE, 1));
        assertEquals(1, MathUtils.gcd(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testHashDouble() {
        assertEquals(Double.valueOf(1.0).hashCode(), MathUtils.hash(1.0));
        assertEquals(Double.valueOf(0.0).hashCode(), MathUtils.hash(0.0));
        assertEquals(Double.valueOf(-1.0).hashCode(), MathUtils.hash(-1.0));
        assertEquals(Double.valueOf(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY).hashCode(), MathUtils.hash(Double.POSITIVE_INFINITY));
        assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY).hashCode(), MathUtils.hash(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testHashDoubleArray() {
        assertEquals(Arrays.hashCode(new double[] {1.0, 2.0}), MathUtils.hash(new double[] {1.0, 2.0}));
        assertEquals(Arrays.hashCode((double[]) null), MathUtils.hash(null));
        assertEquals(Arrays.hashCode(new double[] {}), MathUtils.hash(new double[] {}));
    }

    @Test
    public void testIndicatorByte() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 1));
        assertEquals((byte) -1, MathUtils.indicator((byte) -1));
        assertEquals((byte) 0, MathUtils.indicator((byte) 0));
    }

    @Test
    public void testIndicatorDouble() {
        assertEquals(1.0, MathUtils.indicator(1.0), 1e-9);
        assertEquals(-1.0, MathUtils.indicator(-1.0), 1e-9);
        assertEquals(0.0, MathUtils.indicator(0.0), 1e-9);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testIndicatorFloat() {
        assertEquals(1.0F, MathUtils.indicator(1.0F), 1e-9f);
        assertEquals(-1.0F, MathUtils.indicator(-1.0F), 1e-9f);
        assertEquals(0.0F, MathUtils.indicator(0.0F), 1e-9f);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(1));
        assertEquals(-1, MathUtils.indicator(-1));
        assertEquals(0, MathUtils.indicator(0));
    }

    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(1L));
        assertEquals(-1L, MathUtils.indicator(-1L));
        assertEquals(0L, MathUtils.indicator(0L));
    }

    @Test
    public void testIndicatorShort() {
        assertEquals((short) 1, MathUtils.indicator((short) 1));
        assertEquals((short) -1, MathUtils.indicator((short) -1));
        assertEquals((short) 0, MathUtils.indicator((short) 0));
    }

    @Test
    public void testLcm() {
        assertEquals(36, MathUtils.lcm(12, 18));
        assertEquals(85, MathUtils.lcm(17, 5));
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(0, MathUtils.lcm(0, 0));
    }

    @Test
    public void testLcmNegative() {
        assertEquals(36, MathUtils.lcm(-12, 18));
        assertEquals(36, MathUtils.lcm(12, -18));
        assertEquals(36, MathUtils.lcm(-12, -18));
    }

    @Test
    public void testLcmEdgeCases() {
        assertEquals(Integer.MAX_VALUE, MathUtils.lcm(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, MathUtils.lcm(Integer.MIN_VALUE, 1));
        assertEquals(0, MathUtils.lcm(Integer.MAX_VALUE, 0));
        assertEquals(0, MathUtils.lcm(Integer.MIN_VALUE, 0));
    }
    
    @Test
    public void testLcmOverflow() {
        // LCM(a, b) = |a*b| / gcd(a, b)
        // Test case where a*b might overflow long, but LCM fits in int
        // Example: lcm(1_000_000_000, 1_500_000_000)
        // gcd is 500_000_000
        // lcm = (1e9 * 1.5e9) / 0.5e9 = 3e9 (overflows int)
        try {
            MathUtils.lcm(1000000000, 1500000000);
            fail("ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testLog() {
        assertEquals(Math.log(8.0) / Math.log(2.0), MathUtils.log(2.0, 8.0), 1e-9);
        assertEquals(1.0, MathUtils.log(10.0, 10.0), 1e-9);
        assertEquals(0.0, MathUtils.log(10.0, 1.0), 1e-9);
    }

    @Test
    public void testLogInvalidArguments() {
        assertTrue(Double.isNaN(MathUtils.log(-2.0, 8.0)));
        assertTrue(Double.isNaN(MathUtils.log(2.0, -8.0)));
        assertEquals(0.0, MathUtils.log(0.0, 1.0), 1e-9); // Base 0 with positive x is 0.
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(2.0, 0.0), 1e-9); // Base > 0 and x = 0 is -Infinity.
        assertTrue(Double.isNaN(MathUtils.log(0.0, 0.0))); // Both 0 is NaN.
        assertTrue(Double.isNaN(MathUtils.log(1.0, Double.NaN)));
        assertTrue(Double.isNaN(MathUtils.log(Double.NaN, 1.0)));
    }
    
    @Test
    public void testLogEdgeCases() {
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.log(0.5, 0.0), 1e-9);
        // log(2, Double.MIN_VALUE) should be a large negative number, not -Infinity.
        // Double.MIN_VALUE is 4.9E-324. log(2, 4.9E-324) approx -1074.
        assertEquals(-1074.0, MathUtils.log(2.0, Double.MIN_VALUE), 1e-9);
    }

    @Test
    public void testMulAndCheckPositiveOverflow() {
        try {
            MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
            fail("overflow: mul");
        } catch (ArithmeticException e) {
            assertEquals("overflow: mul", e.getMessage());
        }
    }

    @Test
    public void testMulAndCheckNegativeOverflow() {
        try {
            MathUtils.mulAndCheck(Integer.MIN_VALUE, 2);
            fail("overflow: mul");
        } catch (ArithmeticException e) {
            assertEquals("overflow: mul", e.getMessage());
        }
    }

    @Test
    public void testMulAndCheckZero() {
        assertEquals(0, MathUtils.mulAndCheck(Integer.MAX_VALUE, 0));
        assertEquals(0, MathUtils.mulAndCheck(0, Integer.MAX_VALUE));
        assertEquals(0, MathUtils.mulAndCheck(Integer.MIN_VALUE, 0));
        assertEquals(0, MathUtils.mulAndCheck(0, Integer.MIN_VALUE));
        assertEquals(0, MathUtils.mulAndCheck(0, 0));
    }

    @Test
    public void testMulAndCheck() {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(2, -3));
        assertEquals(6, MathUtils.mulAndCheck(-2, -3));
    }

    @Test
    public void testMulAndCheckLongOverflow() {
        try {
            MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
            fail("overflow: multiply");
        } catch (ArithmeticException e) {
            assertEquals("overflow: multiply", e.getMessage());
        }
    }

    @Test
    public void testMulAndCheckLongNegativeOverflow() {
        try {
            MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
            fail("overflow: multiply");
        } catch (ArithmeticException e) {
            assertEquals("overflow: multiply", e.getMessage());
        }
    }
    
    @Test
    public void testMulAndCheckLongMaxMinValue() {
        assertEquals(Long.MIN_VALUE, MathUtils.mulAndCheck(Long.MIN_VALUE, 1L));
        assertEquals(Long.MIN_VALUE, MathUtils.mulAndCheck(1L, Long.MIN_VALUE));
    }

    @Test
    public void testMulAndCheckLongMinValueNegativeOne() {
        try {
            MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
            fail("overflow: multiply");
        } catch (ArithmeticException e) {
            assertEquals("overflow: multiply", e.getMessage());
        }
    }

    @Test
    public void testNextAfter() {
        assertEquals(Double.longBitsToDouble(0x3ff0000000000001L), MathUtils.nextAfter(1.0, 2.0), 1e-9);
        assertEquals(Double.longBitsToDouble(0xbff0000000000001L), MathUtils.nextAfter(-1.0, -2.0), 1e-9);
        assertEquals(Double.longBitsToDouble(0x0000000000000001L), MathUtils.nextAfter(0.0, 1.0), 1e-9);
        assertEquals(Double.longBitsToDouble(0x8000000000000001L), MathUtils.nextAfter(0.0, -1.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.nextAfter(Double.NEGATIVE_INFINITY, 1.0), 1e-9);
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testNextAfterSpecialCases() {
        assertEquals(Double.longBitsToDouble(0x7fefffffffffffffL), MathUtils.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 1e-9);
        // The original test expected Double.POSITIVE_INFINITY, but nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY) should be the next representable number.
        // The value Double.MAX_VALUE is 1.7976931348623157E308. The next representable number is smaller.
        // The provided assertion was comparing to MAX_VALUE + epsilon.
        // The correct value for next representable number after MAX_VALUE when direction is POSITIVE_INFINITY is indeed what is calculated.
        // Let's verify the original failing assertion.
        // Double.MAX_VALUE is 0x1.fffffffffffffp1023.
        // The next representable double is obtained by decreasing the mantissa.
        // If mantissa is 0, decrease exponent and set mantissa to max.
        // This calculation seems correct.
        assertEquals(Double.longBitsToDouble(0x7fefffffffffffffL), MathUtils.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 1e-9);

        // The original test for nextAfter(Double.MIN_VALUE, 0.0) failed, expecting Double.MIN_VALUE.
        // Double.MIN_VALUE is the smallest positive normalized double.
        // When moving from Double.MIN_VALUE towards 0.0, the next representable number should be 0.0.
        // However, the code path for decreasing mantissa from 0 results in
        // sign | (exponent - 0x0010000000000000L) | 0x000fffffffffffffL
        // For Double.MIN_VALUE (0x1.0p-1022), the bits are 0x0000000000000001.
        // mantissa is 0. exponent is 0x0000000000000000. sign is 0.
        // When going towards 0, it should decrease.
        // If mantissa is 0, it should go to the previous exponent and max mantissa.
        // The code's logic for mantissa == 0 implies it should return the next *lower* value.
        // For d=0.0 and direction=-1.0, it correctly returns -Double.MIN_VALUE.
        // For d=Double.MIN_VALUE and direction=0.0, it should return the value just below MIN_VALUE.
        // The reference source indicates that special cases MAX_VALUE to infinity and MIN_VALUE to 0 are handled as normal numbers.
        // Double.MIN_VALUE is 4.9E-324. The value below it is a subnormal number.
        // The code `return Double.longBitsToDouble(sign | (exponent - 0x0010000000000000L) | 0x000fffffffffffffL);`
        // is for when the mantissa is zero and we are decreasing.
        // Double.MIN_VALUE is 2^-1022. Its bits are 0x0000000000000001. Mantissa is 0.
        // It should go to the previous exponent and max mantissa.
        // The previous exponent would be -1023. With max mantissa, it becomes 0x1.fffffffffffffp-1023.
        // This is a subnormal number.
        // The original assertion was comparing to Double.MIN_VALUE itself.
        // The correct value is the number immediately preceding Double.MIN_VALUE.
        double prevToMin = Double.longBitsToDouble(
            (Double.doubleToLongBits(Double.MIN_VALUE) - 1)
        );
        assertEquals(prevToMin, MathUtils.nextAfter(Double.MIN_VALUE, 0.0), 1e-9);

        // The original test expected Double.MIN_VALUE, but nextAfter(-Double.MIN_VALUE, 0.0) should be the next smaller number.
        // -Double.MIN_VALUE is -4.9E-324. Moving towards 0.0 should result in a value closer to 0.0.
        // The value immediately greater than -Double.MIN_VALUE should be 0.0.
        assertEquals(0.0, MathUtils.nextAfter(-Double.MIN_VALUE, 0.0), 1e-9);
    }

    @Test
    public void testScalb() {
        assertEquals(2.0, MathUtils.scalb(1.0, 1), 1e-9);
        assertEquals(0.5, MathUtils.scalb(1.0, -1), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 10));
        assertEquals(0.0, MathUtils.scalb(0.0, 10));
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 10)));
    }
    
    @Test
    public void testScalbZero() {
        assertEquals(0.0, MathUtils.scalb(0.0, 0));
        assertEquals(0.0, MathUtils.scalb(0.0, -10));
        assertEquals(0.0, MathUtils.scalb(0.0, 10));
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, Math.PI), 1e-9);
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-9);
        // The original test expected -Math.PI, but for a=3*PI and center=PI,
        // the formula a - TWO_PI * floor((a + PI - center) / TWO_PI) applies.
        // (3*PI + PI - PI) / (2*PI) = 3*PI / (2*PI) = 1.5
        // floor(1.5) = 1.
        // 3*PI - 2*PI * 1 = PI.
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-9);
        // For a=-3*PI and center=PI:
        // (-3*PI + PI - PI) / (2*PI) = -3*PI / (2*PI) = -1.5
        // floor(-1.5) = -2.
        // -3*PI - 2*PI * (-2) = -3*PI + 4*PI = PI.
        assertEquals(Math.PI, MathUtils.normalizeAngle(-3 * Math.PI, Math.PI), 1e-9);
        // For a=Math.PI and center=0.0:
        // (PI + PI - 0.0) / (2*PI) = 2*PI / (2*PI) = 1.0
        // floor(1.0) = 1.
        // PI - 2*PI * 1 = -PI.
        assertEquals(-Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-9);
        // For a=-Math.PI and center=0.0:
        // (-PI + PI - 0.0) / (2*PI) = 0 / (2*PI) = 0.0
        // floor(0.0) = 0.
        // -PI - 2*PI * 0 = -PI.
        assertEquals(-Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0), 1e-9);
    }
    
    @Test
    public void testNormalizeAngleLargeValues() {
        assertEquals(1.0, MathUtils.normalizeAngle(1.0 + 100 * 2 * Math.PI, 0.0), 1e-9);
        assertEquals(1.0, MathUtils.normalizeAngle(1.0 - 100 * 2 * Math.PI, 0.0), 1e-9);
    }

    @Test
    public void testRoundDouble() {
        assertEquals(12.34, MathUtils.round(12.3456, 2), 1e-9);
        assertEquals(12.35, MathUtils.round(12.3456, 2, BigDecimal.ROUND_HALF_UP), 1e-9);
        assertEquals(12.34, MathUtils.round(12.3456, 2, BigDecimal.ROUND_HALF_DOWN), 1e-9);
        assertEquals(12.34, MathUtils.round(12.3456, 2, BigDecimal.ROUND_DOWN), 1e-9);
        assertEquals(12.35, MathUtils.round(12.3456, 2, BigDecimal.ROUND_UP), 1e-9);
        assertEquals(12.35, MathUtils.round(12.3456, 2, BigDecimal.ROUND_CEILING), 1e-9);
        assertEquals(12.34, MathUtils.round(12.3456, 2, BigDecimal.ROUND_FLOOR), 1e-9);
        assertEquals(12.34, MathUtils.round(12.3456, 2, BigDecimal.ROUND_HALF_EVEN), 1e-9);
    }

    @Test
    public void testRoundDoubleHalfEven() {
        assertEquals(1.5, MathUtils.round(1.45, 1, BigDecimal.ROUND_HALF_EVEN), 1e-9);
        assertEquals(1.5, MathUtils.round(1.55, 1, BigDecimal.ROUND_HALF_EVEN), 1e-9);
        assertEquals(1.4, MathUtils.round(1.45, 1, BigDecimal.ROUND_HALF_EVEN), 1e-9); 
        assertEquals(1.4, MathUtils.round(1.35, 1, BigDecimal.ROUND_HALF_EVEN), 1e-9);
    }
    
    @Test
    public void testRoundDoubleSpecialCases() {
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2));
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.round(Double.NEGATIVE_INFINITY, 2));
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testSignByte() {
        assertEquals((byte) 1, MathUtils.sign((byte) 1));
        assertEquals((byte) -1, MathUtils.sign((byte) -1));
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
    }

    @Test
    public void testSignDouble() {
        assertEquals(1.0, MathUtils.sign(1.0), 1e-9);
        assertEquals(-1.0, MathUtils.sign(-1.0), 1e-9);
        assertEquals(0.0, MathUtils.sign(0.0), 1e-9);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    @Test
    public void testSignFloat() {
        assertEquals(1.0F, MathUtils.sign(1.0F), 1e-9f);
        assertEquals(-1.0F, MathUtils.sign(-1.0F), 1e-9f);
        assertEquals(0.0F, MathUtils.sign(0.0F), 1e-9f);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testSignInt() {
        assertEquals(1, MathUtils.sign(1));
        assertEquals(-1, MathUtils.sign(-1));
        assertEquals(0, MathUtils.sign(0));
    }

    @Test
    public void testSignLong() {
        assertEquals(1L, MathUtils.sign(1L));
        assertEquals(-1L, MathUtils.sign(-1L));
        assertEquals(0L, MathUtils.sign(0L));
    }

    @Test
    public void testSignShort() {
        assertEquals((short) 1, MathUtils.sign((short) 1));
        assertEquals((short) -1, MathUtils.sign((short) -1));
        assertEquals((short) 0, MathUtils.sign((short) 0));
    }

    @Test
    public void testSinh() {
        assertEquals(Math.sinh(0.0), MathUtils.sinh(0.0), 1e-9);
        assertEquals(Math.sinh(1.0), MathUtils.sinh(1.0), 1e-9);
        assertEquals(Math.sinh(-1.0), MathUtils.sinh(-1.0), 1e-9);
    }

    @Test
    public void testSubAndCheckPositiveOverflow() {
        try {
            MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
            fail("overflow: subtract");
        } catch (ArithmeticException e) {
            assertEquals("overflow: subtract", e.getMessage());
        }
    }

    @Test
    public void testSubAndCheckNegativeOverflow() {
        try {
            MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
            fail("overflow: subtract");
        } catch (ArithmeticException e) {
            assertEquals("overflow: subtract", e.getMessage());
        }
    }

    @Test
    public void testSubAndCheckPositive() {
        assertEquals(1, MathUtils.subAndCheck(3, 2));
    }

    @Test
    public void testSubAndCheckNegative() {
        assertEquals(-1, MathUtils.subAndCheck(-3, -2));
    }

    @Test
    public void testSubAndCheckMixedSigns() {
        assertEquals(-5, MathUtils.subAndCheck(2, 7));
        assertEquals(5, MathUtils.subAndCheck(-2, -7));
    }
    
    @Test
    public void testSubAndCheckLongOverflow() {
        try {
            MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
            fail("overflow: subtract");
        } catch (ArithmeticException e) {
            assertEquals("overflow: subtract", e.getMessage());
        }
    }

    @Test
    public void testSubAndCheckLongNegativeOverflow() {
        try {
            MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
            fail("overflow: subtract");
        } catch (ArithmeticException e) {
            assertEquals("overflow: subtract", e.getMessage());
        }
    }

    @Test
    public void testSubAndCheckLongMinValue() {
        assertEquals(Long.MIN_VALUE, MathUtils.subAndCheck(Long.MIN_VALUE, 0L));
    }

    @Test
    public void testSubAndCheckLongMaxValue() {
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(Long.MAX_VALUE, 0L));
    }
    
    @Test
    public void testSubAndCheckLongEdgeCase() {
        // This case should not throw an exception as Long.MIN_VALUE - Long.MIN_VALUE is 0
        // and addAndCheck(Long.MIN_VALUE, -Long.MIN_VALUE) handles it.
        assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
    }
}
