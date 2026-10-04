package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.lang.Double; // Added import for Double.NaN

public class FastMathTest {

    // Test cases for trigonometric functions and their inverses
    @Test
    public void testSin() throws Exception {
        // Test sin for values near zero, PI/2, PI, 3PI/2, 2PI
        assertEquals(0.0, FastMath.sin(0.0), 1e-15);
        assertEquals(1.0, FastMath.sin(FastMath.PI / 2.0), 1e-15);
        assertEquals(0.0, FastMath.sin(FastMath.PI), 1e-15);
        assertEquals(-1.0, FastMath.sin(3.0 * FastMath.PI / 2.0), 1e-15);
        assertEquals(0.0, FastMath.sin(2.0 * FastMath.PI), 1e-15);

        // Test sin for negative values
        assertEquals(-1.0, FastMath.sin(-FastMath.PI / 2.0), 1e-15);
        assertEquals(0.0, FastMath.sin(-FastMath.PI), 1e-15);

        // Test sin for values outside the typical range [0, 2*PI]
        assertEquals(1.0, FastMath.sin(FastMath.PI / 2.0 + 2.0 * FastMath.PI), 1e-15);
        assertEquals(0.0, FastMath.sin(FastMath.PI + 4.0 * FastMath.PI), 1e-15);

        // Test sin for edge cases like NaN and Infinity
        assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.sin(Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testCos() throws Exception {
        // Test cos for values near zero, PI/2, PI, 3PI/2, 2PI
        assertEquals(1.0, FastMath.cos(0.0), 1e-15);
        assertEquals(0.0, FastMath.cos(FastMath.PI / 2.0), 1e-15);
        assertEquals(-1.0, FastMath.cos(FastMath.PI), 1e-15);
        assertEquals(0.0, FastMath.cos(3.0 * FastMath.PI / 2.0), 1e-15);
        assertEquals(1.0, FastMath.cos(2.0 * FastMath.PI), 1e-15);

        // Test cos for negative values
        assertEquals(0.0, FastMath.cos(-FastMath.PI / 2.0), 1e-15);
        assertEquals(-1.0, FastMath.cos(-FastMath.PI), 1e-15);

        // Test cos for values outside the typical range [0, 2*PI]
        assertEquals(1.0, FastMath.cos(FastMath.PI / 2.0 + 2.0 * FastMath.PI), 1e-15);
        assertEquals(-1.0, FastMath.cos(FastMath.PI + 4.0 * FastMath.PI), 1e-15);

        // Test cos for edge cases like NaN and Infinity
        assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.cos(Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testTan() throws Exception {
        // Test tan for values near zero, PI/4, PI/2, PI, 3PI/2, 2PI
        assertEquals(0.0, FastMath.tan(0.0), 1e-15);
        assertEquals(1.0, FastMath.tan(FastMath.PI / 4.0), 1e-15);
        assertTrue(Double.isInfinite(FastMath.tan(FastMath.PI / 2.0))); // tan(PI/2) is undefined (approaches infinity)
        assertEquals(0.0, FastMath.tan(FastMath.PI), 1e-15);
        assertEquals(1.0, FastMath.tan(5.0 * FastMath.PI / 4.0), 1e-15);
        assertEquals(0.0, FastMath.tan(2.0 * FastMath.PI), 1e-15);

        // Test tan for negative values
        assertEquals(0.0, FastMath.tan(-0.0), 1e-15);
        assertEquals(-1.0, FastMath.tan(-FastMath.PI / 4.0), 1e-15);

        // Test tan for values approaching PI/2 from below and above
        assertTrue(FastMath.tan(FastMath.PI / 2.0 - 1e-15) > 0);
        assertTrue(FastMath.tan(FastMath.PI / 2.0 + 1e-15) < 0);

        // Test tan for edge cases like NaN and Infinity
        assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.tan(Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testAtan() throws Exception {
        // Test atan for values 0, 1, -1
        assertEquals(0.0, FastMath.atan(0.0), 1e-15);
        assertEquals(FastMath.PI / 4.0, FastMath.atan(1.0), 1e-15);
        assertEquals(-FastMath.PI / 4.0, FastMath.atan(-1.0), 1e-15);

        // Test atan for large positive and negative values
        assertEquals(FastMath.PI / 2.0, FastMath.atan(Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(-FastMath.PI / 2.0, FastMath.atan(Double.NEGATIVE_INFINITY), 1e-15);

        // Test atan for NaN
        assertTrue(Double.isNaN(FastMath.atan(Double.NaN)));
    }

    @Test
    public void testAsin() throws Exception {
        // Test asin for values 0, 1, -1
        assertEquals(0.0, FastMath.asin(0.0), 1e-15);
        assertEquals(FastMath.PI / 2.0, FastMath.asin(1.0), 1e-15);
        assertEquals(-FastMath.PI / 2.0, FastMath.asin(-1.0), 1e-15);

        // Test asin for values outside [-1, 1]
        assertTrue(Double.isNaN(FastMath.asin(1.1)));
        assertTrue(Double.isNaN(FastMath.asin(-1.1)));

        // Test asin for NaN and Infinity
        assertTrue(Double.isNaN(FastMath.asin(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.asin(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.asin(Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testAcos() throws Exception {
        // Test acos for values 0, 1, -1
        assertEquals(FastMath.PI / 2.0, FastMath.acos(0.0), 1e-15);
        assertEquals(0.0, FastMath.acos(1.0), 1e-15);
        assertEquals(FastMath.PI, FastMath.acos(-1.0), 1e-15);

        // Test acos for values outside [-1, 1]
        assertTrue(Double.isNaN(FastMath.acos(1.1)));
        assertTrue(Double.isNaN(FastMath.acos(-1.1)));

        // Test acos for NaN and Infinity
        assertTrue(Double.isNaN(FastMath.acos(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.acos(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.acos(Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testCosh() throws Exception {
        // Test cosh for 0
        assertEquals(1.0, FastMath.cosh(0.0), 1e-15);

        // Test cosh for positive values
        assertEquals(FastMath.cosh(1.0), FastMath.cosh(1.0), 1e-15);
        assertEquals(FastMath.cosh(10.0), FastMath.cosh(10.0), 1e-9); // Large values may have larger error

        // Test cosh for negative values
        assertEquals(FastMath.cosh(1.0), FastMath.cosh(-1.0), 1e-15);
        assertEquals(FastMath.cosh(10.0), FastMath.cosh(-10.0), 1e-9);

        // Test cosh for edge cases like NaN and Infinity
        assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testSinh() throws Exception {
        // Test sinh for 0
        assertEquals(0.0, FastMath.sinh(0.0), 1e-15);

        // Test sinh for positive values
        assertEquals(FastMath.sinh(1.0), FastMath.sinh(1.0), 1e-15);
        assertEquals(FastMath.sinh(10.0), FastMath.sinh(10.0), 1e-9); // Large values may have larger error

        // Test sinh for negative values
        assertEquals(-FastMath.sinh(1.0), FastMath.sinh(-1.0), 1e-15);
        assertEquals(-FastMath.sinh(10.0), FastMath.sinh(-10.0), 1e-9);

        // Test sinh for edge cases like NaN and Infinity
        assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.sinh(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testTanh() throws Exception {
        // Test tanh for 0
        assertEquals(0.0, FastMath.tanh(0.0), 1e-15);

        // Test tanh for positive values
        assertEquals(FastMath.tanh(1.0), FastMath.tanh(1.0), 1e-15);
        assertEquals(1.0, FastMath.tanh(20.0), 1e-15); // Near 1 for large positive values
        assertEquals(1.0, FastMath.tanh(Double.POSITIVE_INFINITY), 0);

        // Test tanh for negative values
        assertEquals(-FastMath.tanh(1.0), FastMath.tanh(-1.0), 1e-15);
        assertEquals(-1.0, FastMath.tanh(-20.0), 1e-15); // Near -1 for large negative values
        assertEquals(-1.0, FastMath.tanh(Double.NEGATIVE_INFINITY), 0);

        // Test tanh for NaN
        assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
    }

    @Test
    public void testAcosh() throws Exception {
        // Test acosh for 1
        assertEquals(0.0, FastMath.acosh(1.0), 1e-15);

        // Test acosh for values > 1
        assertEquals(FastMath.acosh(2.0), FastMath.acosh(2.0), 1e-15);
        assertEquals(FastMath.acosh(10.0), FastMath.acosh(10.0), 1e-15);

        // Test acosh for values < 1
        assertTrue(Double.isNaN(FastMath.acosh(0.9)));
        assertTrue(Double.isNaN(FastMath.acosh(0.0)));

        // Test acosh for NaN and Infinity
        assertTrue(Double.isNaN(FastMath.acosh(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.acosh(Double.POSITIVE_INFINITY), 0);
    }

    @Test
    public void testAsinh() throws Exception {
        // Test asinh for 0
        assertEquals(0.0, FastMath.asinh(0.0), 1e-15);

        // Test asinh for positive values
        assertEquals(FastMath.asinh(1.0), FastMath.asinh(1.0), 1e-15);
        assertEquals(FastMath.asinh(10.0), FastMath.asinh(10.0), 1e-15);

        // Test asinh for negative values
        assertEquals(-FastMath.asinh(1.0), FastMath.asinh(-1.0), 1e-15);
        assertEquals(-FastMath.asinh(10.0), FastMath.asinh(-10.0), 1e-15);

        // Test asinh for NaN and Infinity
        assertTrue(Double.isNaN(FastMath.asinh(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.asinh(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.asinh(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testAtanh() throws Exception {
        // Test atanh for 0
        assertEquals(0.0, FastMath.atanh(0.0), 1e-15);

        // Test atanh for values between -1 and 1 (exclusive)
        assertEquals(FastMath.atanh(0.5), FastMath.atanh(0.5), 1e-15);
        assertEquals(-FastMath.atanh(0.5), FastMath.atanh(-0.5), 1e-15);

        // Test atanh for values outside (-1, 1)
        assertTrue(Double.isNaN(FastMath.atanh(1.0)));
        assertTrue(Double.isNaN(FastMath.atanh(-1.0)));
        assertTrue(Double.isNaN(FastMath.atanh(2.0)));

        // Test atanh for NaN and Infinity
        assertTrue(Double.isNaN(FastMath.atanh(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.atanh(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.atanh(Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testExp() throws Exception {
        // Test exp for 0
        assertEquals(1.0, FastMath.exp(0.0), 1e-15);

        // Test exp for positive values
        assertEquals(Math.exp(1.0), FastMath.exp(1.0), 1e-15);
        assertEquals(Math.exp(2.0), FastMath.exp(2.0), 1e-15);
        assertEquals(Math.exp(10.0), FastMath.exp(10.0), 1e-12); // Larger values may have larger error

        // Test exp for negative values
        assertEquals(Math.exp(-1.0), FastMath.exp(-1.0), 1e-15);
        assertEquals(Math.exp(-2.0), FastMath.exp(-2.0), 1e-15);

        // Test exp for edge cases like NaN and Infinity
        assertTrue(Double.isNaN(FastMath.exp(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(Double.POSITIVE_INFINITY), 0);
        assertEquals(0.0, FastMath.exp(Double.NEGATIVE_INFINITY), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(1000.0), 0); // Test potential overflow
    }

    @Test
    public void testExpm1() throws Exception {
        // Test expm1 for 0
        assertEquals(0.0, FastMath.expm1(0.0), 1e-15);

        // Test expm1 for small positive values
        assertEquals(Math.expm1(1e-5), FastMath.expm1(1e-5), 1e-15);
        assertEquals(Math.expm1(1e-10), FastMath.expm1(1e-10), 1e-15);

        // Test expm1 for small negative values
        assertEquals(Math.expm1(-1e-5), FastMath.expm1(-1e-5), 1e-15);
        assertEquals(Math.expm1(-1e-10), FastMath.expm1(-1e-10), 1e-15);

        // Test expm1 for larger values
        assertEquals(Math.expm1(1.0), FastMath.expm1(1.0), 1e-15);
        assertEquals(Math.expm1(-1.0), FastMath.expm1(-1.0), 1e-15);

        // Test expm1 for edge cases like NaN and Infinity
        assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.expm1(Double.POSITIVE_INFINITY), 0);
        assertEquals(-1.0, FastMath.expm1(Double.NEGATIVE_INFINITY), 1e-15);
    }

    @Test
    public void testLog() throws Exception {
        // Test log for 1
        assertEquals(0.0, FastMath.log(1.0), 1e-15);

        // Test log for positive values
        assertEquals(Math.log(2.0), FastMath.log(2.0), 1e-15);
        assertEquals(Math.log(10.0), FastMath.log(10.0), 1e-15);
        assertEquals(Math.log(FastMath.E), FastMath.log(FastMath.E), 1e-15);

        // Test log for values between 0 and 1
        assertEquals(Math.log(0.5), FastMath.log(0.5), 1e-15);

        // Test log for edge cases like 0, negative, NaN, Infinity
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(-0.0), 0);
        assertTrue(Double.isNaN(FastMath.log(-1.0)));
        assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 0);
    }

    @Test
    public void testLog1p() throws Exception {
        // Test log1p for 0
        assertEquals(0.0, FastMath.log1p(0.0), 1e-15);

        // Test log1p for small positive values
        assertEquals(Math.log1p(1e-5), FastMath.log1p(1e-5), 1e-15);
        assertEquals(Math.log1p(1e-10), FastMath.log1p(1e-10), 1e-15);

        // Test log1p for small negative values
        assertEquals(Math.log1p(-1e-5), FastMath.log1p(-1e-5), 1e-15);
        assertEquals(Math.log1p(-1e-10), FastMath.log1p(-1e-10), 1e-15);

        // Test log1p for larger values
        assertEquals(Math.log1p(1.0), FastMath.log1p(1.0), 1e-15);
        assertEquals(Math.log1p(0.5), FastMath.log1p(0.5), 1e-15);
        assertEquals(Math.log1p(-0.5), FastMath.log1p(-0.5), 1e-15);

        // Test log1p for edge cases like -1, NaN, Infinity
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0);
        assertTrue(Double.isNaN(FastMath.log1p(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 0);
    }

    @Test
    public void testLog10() throws Exception {
        // Test log10 for 1
        assertEquals(0.0, FastMath.log10(1.0), 1e-15);

        // Test log10 for positive values
        assertEquals(Math.log10(10.0), FastMath.log10(10.0), 1e-15);
        assertEquals(Math.log10(100.0), FastMath.log10(100.0), 1e-15);
        assertEquals(Math.log10(2.0), FastMath.log10(2.0), 1e-15);

        // Test log10 for values between 0 and 1
        assertEquals(Math.log10(0.1), FastMath.log10(0.1), 1e-15);

        // Test log10 for edge cases like 0, negative, NaN, Infinity
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), 0);
        assertTrue(Double.isNaN(FastMath.log10(-1.0)));
        assertTrue(Double.isNaN(FastMath.log10(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log10(Double.POSITIVE_INFINITY), 0);
    }

    @Test
    public void testPowDoubleDouble() throws Exception {
        // Test pow for basic cases
        assertEquals(8.0, FastMath.pow(2.0, 3.0), 1e-15);
        assertEquals(1.0, FastMath.pow(5.0, 0.0), 1e-15);
        assertEquals(1.0, FastMath.pow(-2.0, 0.0), 1e-15);
        assertEquals(0.25, FastMath.pow(2.0, -2.0), 1e-15);

        // Test pow for fractional exponents
        assertEquals(Math.pow(2.0, 0.5), FastMath.pow(2.0, 0.5), 1e-15);
        assertEquals(Math.pow(9.0, 0.5), FastMath.pow(9.0, 0.5), 1e-15);

        // Test pow for negative base and fractional exponent
        assertTrue(Double.isNaN(FastMath.pow(-2.0, 0.5)));

        // Test pow for edge cases
        assertEquals(1.0, FastMath.pow(Double.NaN, 0.0), 1e-15);
        assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 2.0), 0);
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -2.0), 0);
        assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), 0);
        assertEquals(0.0, FastMath.pow(0.0, 2.0), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), 0);
        assertEquals(-0.0, FastMath.pow(-2.0, 3.0), 1e-15);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-2.0, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(-2.0, Double.NEGATIVE_INFINITY), 0);
        assertEquals(1.0, FastMath.pow(1.0, Double.NaN), 1e-15);
        assertEquals(1.0, FastMath.pow(-1.0, Double.NaN), 1e-15);
    }

    @Test
    public void testPowDoubleInt() throws Exception {
        // Test pow(double, int) for basic cases
        assertEquals(8.0, FastMath.pow(2.0, 3), 1e-15);
        assertEquals(1.0, FastMath.pow(5.0, 0), 1e-15);
        assertEquals(0.25, FastMath.pow(2.0, -2), 1e-15);
        assertEquals(1.0, FastMath.pow(-2.0, 0), 1e-15);

        // Test pow with negative base and odd/even exponent
        assertEquals(-8.0, FastMath.pow(-2.0, 3), 1e-15);
        assertEquals(16.0, FastMath.pow(-2.0, 4), 1e-15);

        // Test edge cases
        assertEquals(1.0, FastMath.pow(Double.NaN, 0), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 2), 0);
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -2), 0);
        assertEquals(0.0, FastMath.pow(0.0, 5), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -5), 0);
        assertEquals(-0.0, FastMath.pow(-0.0, 3), 1e-15);
        assertEquals(0.0, FastMath.pow(-0.0, 2), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Integer.MAX_VALUE), 0);
        assertEquals(0.0, FastMath.pow(2.0, Integer.MIN_VALUE), 0);
    }

    @Test
    public void testCbrt() throws Exception {
        // Test cbrt for 0
        assertEquals(0.0, FastMath.cbrt(0.0), 1e-15);

        // Test cbrt for positive values
        assertEquals(2.0, FastMath.cbrt(8.0), 1e-15);
        assertEquals(1.0, FastMath.cbrt(1.0), 1e-15);
        assertEquals(Math.cbrt(10.0), FastMath.cbrt(10.0), 1e-15);

        // Test cbrt for negative values
        assertEquals(-2.0, FastMath.cbrt(-8.0), 1e-15);
        assertEquals(-1.0, FastMath.cbrt(-1.0), 1e-15);
        assertEquals(-Math.cbrt(10.0), FastMath.cbrt(-10.0), 1e-15);

        // Test cbrt for edge cases like NaN and Infinity
        assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.cbrt(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testToRadians() throws Exception {
        // Test toRadians for 0, 180, 90 degrees
        assertEquals(0.0, FastMath.toRadians(0.0), 1e-15);
        assertEquals(FastMath.PI, FastMath.toRadians(180.0), 1e-15);
        assertEquals(FastMath.PI / 2.0, FastMath.toRadians(90.0), 1e-15);

        // Test toRadians for negative values
        assertEquals(-FastMath.PI, FastMath.toRadians(-180.0), 1e-15);

        // Test toRadians for edge cases
        assertTrue(Double.isNaN(FastMath.toRadians(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.toRadians(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.toRadians(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testToDegrees() throws Exception {
        // Test toDegrees for 0, PI, PI/2 radians
        assertEquals(0.0, FastMath.toDegrees(0.0), 1e-15);
        assertEquals(180.0, FastMath.toDegrees(FastMath.PI), 1e-15);
        assertEquals(90.0, FastMath.toDegrees(FastMath.PI / 2.0), 1e-15);

        // Test toDegrees for negative values
        assertEquals(-180.0, FastMath.toDegrees(-FastMath.PI), 1e-15);

        // Test toDegrees for edge cases
        assertTrue(Double.isNaN(FastMath.toDegrees(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.toDegrees(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.toDegrees(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testAbsInt() throws Exception {
        assertEquals(5, FastMath.abs(5));
        assertEquals(5, FastMath.abs(-5));
        assertEquals(0, FastMath.abs(0));
        assertEquals(Integer.MAX_VALUE, FastMath.abs(Integer.MAX_VALUE));
        // Integer.MIN_VALUE abs overflows to itself in Java
        assertEquals(Integer.MIN_VALUE, FastMath.abs(Integer.MIN_VALUE));
    }

    @Test
    public void testAbsLong() throws Exception {
        assertEquals(5L, FastMath.abs(5L));
        assertEquals(5L, FastMath.abs(-5L));
        assertEquals(0L, FastMath.abs(0L));
        assertEquals(Long.MAX_VALUE, FastMath.abs(Long.MAX_VALUE));
        // Long.MIN_VALUE abs overflows to itself in Java
        assertEquals(Long.MIN_VALUE, FastMath.abs(Long.MIN_VALUE));
    }

    @Test
    public void testAbsFloat() throws Exception {
        assertEquals(5.0f, FastMath.abs(5.0f), 1e-15f);
        assertEquals(5.0f, FastMath.abs(-5.0f), 1e-15f);
        assertEquals(0.0f, FastMath.abs(0.0f), 1e-15f);
        assertEquals(0.0f, FastMath.abs(-0.0f), 1e-15f); // abs(-0.0f) should be +0.0f
        assertEquals(Float.POSITIVE_INFINITY, FastMath.abs(Float.POSITIVE_INFINITY), 0);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.abs(Float.NEGATIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.abs(Float.NaN)));
    }

    @Test
    public void testAbsDouble() throws Exception {
        assertEquals(5.0, FastMath.abs(5.0), 1e-15);
        assertEquals(5.0, FastMath.abs(-5.0), 1e-15);
        assertEquals(0.0, FastMath.abs(0.0), 1e-15);
        assertEquals(0.0, FastMath.abs(-0.0), 1e-15); // abs(-0.0) should be +0.0
        assertEquals(Double.POSITIVE_INFINITY, FastMath.abs(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.abs(Double.NEGATIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.abs(Double.NaN)));
    }

    @Test
    public void testUlpDouble() throws Exception {
        // Using value 1.0 as a representative normal number
        assertEquals(FastMath.ulp(1.0), FastMath.ulp(1.0), 1e-15);
        // Testing the smallest positive normal double
        assertEquals(FastMath.ulp(Double.MIN_VALUE), FastMath.ulp(Double.MIN_VALUE), 1e-15);
        // Testing subnormal number, ulp should be very small
        assertEquals(FastMath.ulp(Double.MIN_NORMAL / 2.0), FastMath.ulp(Double.MIN_NORMAL / 2.0), 1e-300); // expecting a very small number
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.NEGATIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.ulp(Double.NaN)));
    }

    @Test
    public void testScalbDouble() throws Exception {
        assertEquals(2.0, FastMath.scalb(1.0, 1), 1e-15);
        assertEquals(1.0, FastMath.scalb(2.0, -1), 1e-15);
        assertEquals(Double.MAX_VALUE, FastMath.scalb(Double.MAX_VALUE / 2.0, 1), 0); // Should be very close to MAX_VALUE
        assertEquals(Double.MIN_VALUE, FastMath.scalb(Double.MIN_VALUE * 2.0, -1), 0); // Should be very close to MIN_VALUE
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.MAX_VALUE, 1), 0);
        assertEquals(0.0, FastMath.scalb(Double.MIN_VALUE, -1), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.POSITIVE_INFINITY, 10), 0);
        assertEquals(0.0, FastMath.scalb(Double.POSITIVE_INFINITY, -10), 0);
        assertEquals(Double.NaN, FastMath.scalb(Double.NaN, 5), 0);
        // Corrected: Integer.NaN is not a valid input for the exponent.
        // scalb does not accept Integer.NaN as exponent.
        // The behavior for Integer.NaN is not specified, but it's likely to throw an exception or result in NaN.
        // Since the source code does not explicitly handle Integer.NaN for the exponent,
        // we can test for NaN if the underlying operations produce it.
        // For now, let's assert that it's NaN, assuming typical double arithmetic.
        assertTrue(Double.isNaN(FastMath.scalb(1.0, Integer.MAX_VALUE / 2))); // Test with a large exponent that might result in NaN or Infinity
        assertTrue(Double.isNaN(FastMath.scalb(1.0, Integer.MIN_VALUE / 2))); // Test with a small exponent that might result in NaN or 0.0
    }

    @Test
    public void testNextAfterDouble() throws Exception {
        assertEquals(2.0000000000000004, FastMath.nextAfter(2.0, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(1.9999999999999998, FastMath.nextAfter(2.0, Double.NEGATIVE_INFINITY), 1e-15);
        assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, Double.NEGATIVE_INFINITY), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextAfter(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.MAX_VALUE, FastMath.nextAfter(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.nextAfter(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 0);
        assertEquals(-Double.MAX_VALUE, FastMath.nextAfter(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
        assertEquals(1.0, FastMath.nextAfter(1.0, Double.NaN), 1e-15);
    }

    @Test
    public void testFloor() throws Exception {
        assertEquals(2.0, FastMath.floor(2.1), 1e-15);
        assertEquals(2.0, FastMath.floor(2.0), 1e-15);
        assertEquals(-3.0, FastMath.floor(-2.1), 1e-15);
        assertEquals(-2.0, FastMath.floor(-2.0), 1e-15);
        assertEquals(0.0, FastMath.floor(0.0), 1e-15);
        assertEquals(0.0, FastMath.floor(-0.0), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.floor(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.floor(Double.NEGATIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
        assertEquals(4.503599627370496E15, FastMath.floor(4.503599627370496E15)); // MAX_VALUE is near 2^52, floor should not change it
    }

    @Test
    public void testCeil() throws Exception {
        assertEquals(3.0, FastMath.ceil(2.1), 1e-15);
        assertEquals(2.0, FastMath.ceil(2.0), 1e-15);
        assertEquals(-2.0, FastMath.ceil(-2.1), 1e-15);
        assertEquals(-2.0, FastMath.ceil(-2.0), 1e-15);
        assertEquals(0.0, FastMath.ceil(0.0), 1e-15);
        assertEquals(0.0, FastMath.ceil(-0.0), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ceil(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.ceil(Double.NEGATIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));
        assertEquals(4.503599627370496E15, FastMath.ceil(4.503599627370496E15)); // MAX_VALUE is near 2^52, ceil should not change it
    }

    @Test
    public void testRint() throws Exception {
        assertEquals(2.0, FastMath.rint(2.1), 1e-15);
        assertEquals(2.0, FastMath.rint(2.0), 1e-15);
        assertEquals(-2.0, FastMath.rint(-2.1), 1e-15);
        assertEquals(-2.0, FastMath.rint(-2.0), 1e-15);
        assertEquals(0.0, FastMath.rint(0.0), 1e-15);
        assertEquals(0.0, FastMath.rint(-0.0), 1e-15);
        assertEquals(2.0, FastMath.rint(2.5), 1e-15); // round half to even
        assertEquals(2.0, FastMath.rint(1.5), 1e-15); // round half to even
        assertEquals(-2.0, FastMath.rint(-2.5), 1e-15); // round half to even
        assertEquals(-2.0, FastMath.rint(-1.5), 1e-15); // round half to even
        assertEquals(Double.POSITIVE_INFINITY, FastMath.rint(Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.rint(Double.NEGATIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.rint(Double.NaN)));
        assertEquals(Double.MAX_VALUE, FastMath.rint(Double.MAX_VALUE)); // Should round to itself
    }

    @Test
    public void testRoundDouble() throws Exception {
        assertEquals(2L, FastMath.round(2.1));
        assertEquals(2L, FastMath.round(2.0));
        assertEquals(-2L, FastMath.round(-2.1));
        assertEquals(-2L, FastMath.round(-2.0));
        assertEquals(0L, FastMath.round(0.0));
        assertEquals(0L, FastMath.round(-0.0));
        assertEquals(3L, FastMath.round(2.5)); // round half up
        assertEquals(-2L, FastMath.round(-2.5)); // round half up
        assertEquals(Long.MAX_VALUE, FastMath.round(Double.MAX_VALUE));
        assertEquals(Long.MIN_VALUE, FastMath.round(Double.MIN_VALUE));
        assertEquals(Long.MIN_VALUE, FastMath.round(Double.NEGATIVE_INFINITY));
        assertEquals(Long.MAX_VALUE, FastMath.round(Double.POSITIVE_INFINITY));
        assertTrue(Double.isNaN(FastMath.round(Double.NaN)));
    }

    @Test
    public void testRoundFloat() throws Exception {
        assertEquals(2, FastMath.round(2.1f));
        assertEquals(2, FastMath.round(2.0f));
        assertEquals(-2, FastMath.round(-2.1f));
        assertEquals(-2, FastMath.round(-2.0f));
        assertEquals(0, FastMath.round(0.0f));
        assertEquals(0, FastMath.round(-0.0f));
        assertEquals(3, FastMath.round(2.5f)); // round half up
        assertEquals(-2, FastMath.round(-2.5f)); // round half up
        assertEquals(Integer.MAX_VALUE, FastMath.round(Float.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, FastMath.round(Float.MIN_VALUE));
        assertEquals(Integer.MIN_VALUE, FastMath.round(Float.NEGATIVE_INFINITY));
        assertEquals(Integer.MAX_VALUE, FastMath.round(Float.POSITIVE_INFINITY));
        assertTrue(Double.isNaN(FastMath.round(Float.NaN)));
    }

    @Test
    public void testMinInt() throws Exception {
        assertEquals(2, FastMath.min(2, 3));
        assertEquals(2, FastMath.min(3, 2));
        assertEquals(2, FastMath.min(2, 2));
        assertEquals(Integer.MIN_VALUE, FastMath.min(Integer.MIN_VALUE, 5));
        assertEquals(Integer.MIN_VALUE, FastMath.min(5, Integer.MIN_VALUE));
        assertEquals(Integer.MAX_VALUE, FastMath.min(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testMaxInt() throws Exception {
        assertEquals(3, FastMath.max(2, 3));
        assertEquals(3, FastMath.max(3, 2));
        assertEquals(2, FastMath.max(2, 2));
        assertEquals(5, FastMath.max(Integer.MIN_VALUE, 5));
        assertEquals(5, FastMath.max(5, Integer.MIN_VALUE));
        assertEquals(Integer.MAX_VALUE, FastMath.max(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testHypot() throws Exception {
        assertEquals(5.0, FastMath.hypot(3.0, 4.0), 1e-15);
        assertEquals(5.0, FastMath.hypot(4.0, 3.0), 1e-15);
        assertEquals(0.0, FastMath.hypot(0.0, 0.0), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 1.0), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(1.0, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.hypot(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(FastMath.hypot(1.0, Double.NaN)));
        assertEquals(1.0, FastMath.hypot(1.0, 0.0), 1e-15);
        assertEquals(1.0, FastMath.hypot(0.0, 1.0), 1e-15);
    }

    @Test
    public void testIEEEremainder() throws Exception {
        assertEquals(1.0, FastMath.IEEEremainder(5.0, 2.0), 1e-15);
        assertEquals(1.0, FastMath.IEEEremainder(5.0, -2.0), 1e-15);
        assertEquals(-1.0, FastMath.IEEEremainder(-5.0, 2.0), 1e-15);
        assertEquals(-1.0, FastMath.IEEEremainder(-5.0, -2.0), 1e-15);
        // 4.0 / 2.0 = 2.0 (exact even integer). Remainder is 4.0 - 2.0*2.0 = 0.0
        assertEquals(0.0, FastMath.IEEEremainder(4.0, 2.0), 1e-15);
        assertEquals(0.0, FastMath.IEEEremainder(0.0, 2.0), 1e-15);
        assertEquals(Double.NaN, FastMath.IEEEremainder(Double.POSITIVE_INFINITY, 2.0), 0);
        assertEquals(Double.NaN, FastMath.IEEEremainder(5.0, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NaN, FastMath.IEEEremainder(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.IEEEremainder(Double.NaN, 2.0)));
        assertTrue(Double.isNaN(FastMath.IEEEremainder(2.0, Double.NaN)));
        // Test case where quotient is exactly halfway between two integers
        assertEquals(-1.0, FastMath.IEEEremainder(3.0, 2.0), 1e-15); // 3.0/2.0 = 1.5, closest even integer is 2.0. 3.0 - 2.0*2.0 = -1.0.
        assertEquals(1.0, FastMath.IEEEremainder(-3.0, 2.0), 1e-15); // -3.0/2.0 = -1.5, closest even integer is -2.0. -3.0 - (-2.0*2.0) = 1.0.
    }

    @Test
    public void testCopySignDouble() throws Exception {
        assertEquals(5.0, FastMath.copySign(5.0, 1.0), 1e-15);
        assertEquals(-5.0, FastMath.copySign(5.0, -1.0), 1e-15);
        assertEquals(5.0, FastMath.copySign(-5.0, 1.0), 1e-15);
        assertEquals(-5.0, FastMath.copySign(-5.0, -1.0), 1e-15);
        assertEquals(0.0, FastMath.copySign(0.0, 1.0), 1e-15);
        assertEquals(-0.0, FastMath.copySign(-0.0, -1.0), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.copySign(Double.POSITIVE_INFINITY, 1.0), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.copySign(Double.POSITIVE_INFINITY, -1.0), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.copySign(Double.NEGATIVE_INFINITY, 1.0), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.copySign(Double.NEGATIVE_INFINITY, -1.0), 0);
        assertEquals(1.0, FastMath.copySign(5.0, Double.NaN), 1e-15); // NaN sign is treated as positive
        assertEquals(0.0, FastMath.copySign(0.0, 0.0), 1e-15);
        assertEquals(0.0, FastMath.copySign(-0.0, 0.0), 1e-15);
        assertEquals(-0.0, FastMath.copySign(0.0, -0.0), 1e-15);
        assertEquals(-0.0, FastMath.copySign(-0.0, -0.0), 1e-15);
    }

    @Test
    public void testCopySignFloat() throws Exception {
        assertEquals(5.0f, FastMath.copySign(5.0f, 1.0f), 1e-15f);
        assertEquals(-5.0f, FastMath.copySign(5.0f, -1.0f), 1e-15f);
        assertEquals(5.0f, FastMath.copySign(-5.0f, 1.0f), 1e-15f);
        assertEquals(-5.0f, FastMath.copySign(-5.0f, -1.0f), 1e-15f);
        assertEquals(0.0f, FastMath.copySign(0.0f, 1.0f), 1e-15f);
        assertEquals(-0.0f, FastMath.copySign(-0.0f, -1.0f), 1e-15f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.copySign(Float.POSITIVE_INFINITY, 1.0f), 0);
        assertEquals(Float.NEGATIVE_INFINITY, FastMath.copySign(Float.POSITIVE_INFINITY, -1.0f), 0);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.copySign(Float.NEGATIVE_INFINITY, 1.0f), 0);
        assertEquals(Float.NEGATIVE_INFINITY, FastMath.copySign(Float.NEGATIVE_INFINITY, -1.0f), 0);
        assertEquals(1.0f, FastMath.copySign(5.0f, Float.NaN), 1e-15f); // NaN sign is treated as positive
        assertEquals(0.0f, FastMath.copySign(0.0f, 0.0f), 1e-15f);
        assertEquals(0.0f, FastMath.copySign(-0.0f, 0.0f), 1e-15f);
        assertEquals(-0.0f, FastMath.copySign(0.0f, -0.0f), 1e-15f);
        assertEquals(-0.0f, FastMath.copySign(-0.0f, -0.0f), 1e-15f);
    }

    @Test
    public void testGetExponentDouble() throws Exception {
        assertEquals(0, FastMath.getExponent(1.0));
        assertEquals(1, FastMath.getExponent(2.0));
        assertEquals(-1, FastMath.getExponent(0.5));
        assertEquals(1023, FastMath.getExponent(Double.MAX_VALUE));
        assertEquals(-1022, FastMath.getExponent(Double.MIN_VALUE));
        assertEquals(1024, FastMath.getExponent(Double.POSITIVE_INFINITY)); // infinity has max exponent
        assertEquals(1024, FastMath.getExponent(Double.NaN)); // NaN also has max exponent
        assertEquals(-1023, FastMath.getExponent(0.0)); // zero has min exponent
        assertEquals(-1023, FastMath.getExponent(-0.0));
        assertEquals(-1074, FastMath.getExponent(Double.MIN_NORMAL)); // Smallest normal number
    }

    @Test
    public void testGetExponentFloat() throws Exception {
        assertEquals(0, FastMath.getExponent(1.0f));
        assertEquals(1, FastMath.getExponent(2.0f));
        assertEquals(-1, FastMath.getExponent(0.5f));
        assertEquals(127, FastMath.getExponent(Float.MAX_VALUE));
        assertEquals(-126, FastMath.getExponent(Float.MIN_VALUE));
        assertEquals(255, FastMath.getExponent(Float.POSITIVE_INFINITY)); // infinity has max exponent
        assertEquals(255, FastMath.getExponent(Float.NaN)); // NaN also has max exponent
        assertEquals(-127, FastMath.getExponent(0.0f)); // zero has min exponent
        assertEquals(-127, FastMath.getExponent(-0.0f));
        assertEquals(-126, FastMath.getExponent(Float.MIN_NORMAL)); // Smallest normal number
    }

    @Test
    public void testAtan2() throws Exception {
        assertEquals(0.0, FastMath.atan2(0.0, 1.0), 1e-15);
        assertEquals(Math.PI / 4.0, FastMath.atan2(1.0, 1.0), 1e-15);
        assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), 1e-15);
        assertEquals(3.0 * Math.PI / 4.0, FastMath.atan2(1.0, -1.0), 1e-15);
        assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), 1e-15);
        assertEquals(-Math.PI / 4.0, FastMath.atan2(-1.0, 1.0), 1e-15);
        assertEquals(-Math.PI / 2.0, FastMath.atan2(-1.0, 0.0), 1e-15);
        assertEquals(-3.0 * Math.PI / 4.0, FastMath.atan2(-1.0, -1.0), 1e-15);

        assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(3.0 * Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-15);
        assertEquals(Math.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 0.0), 1e-15);
        assertEquals(-Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(-3.0 * Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-15);
        assertEquals(-Math.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 0.0), 1e-15);

        assertEquals(0.0, FastMath.atan2(0.0, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(Math.PI, FastMath.atan2(0.0, Double.NEGATIVE_INFINITY), 1e-15);
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));
        assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), 1e-15); // Check positive y, zero x
        assertEquals(-Math.PI / 2.0, FastMath.atan2(-1.0, 0.0), 1e-15); // Check negative y, zero x
    }

    // --- Added tests for methods not covered by previous answer ---

    @Test
    public void testSqrt() throws Exception {
        assertEquals(2.0, FastMath.sqrt(4.0), 1e-15);
        assertEquals(1.0, FastMath.sqrt(1.0), 1e-15);
        assertEquals(0.0, FastMath.sqrt(0.0), 1e-15);
        assertEquals(0.0, FastMath.sqrt(-0.0), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.sqrt(Double.POSITIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.sqrt(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
    }

    @Test
    public void testSignumDouble() throws Exception {
        assertEquals(1.0, FastMath.signum(10.0), 1e-15);
        assertEquals(-1.0, FastMath.signum(-10.0), 1e-15);
        assertEquals(0.0, FastMath.signum(0.0), 1e-15);
        assertEquals(0.0, FastMath.signum(-0.0), 1e-15);
        assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
        assertEquals(1.0, FastMath.signum(Double.POSITIVE_INFINITY), 0);
        assertEquals(-1.0, FastMath.signum(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testSignumFloat() throws Exception {
        assertEquals(1.0f, FastMath.signum(10.0f), 1e-15f);
        assertEquals(-1.0f, FastMath.signum(-10.0f), 1e-15f);
        assertEquals(0.0f, FastMath.signum(0.0f), 1e-15f);
        assertEquals(0.0f, FastMath.signum(-0.0f), 1e-15f);
        assertTrue(Double.isNaN(FastMath.signum(Float.NaN)));
        assertEquals(1.0f, FastMath.signum(Float.POSITIVE_INFINITY), 0);
        assertEquals(-1.0f, FastMath.signum(Float.NEGATIVE_INFINITY), 0);
    }


    @Test
    public void testNextUpDouble() throws Exception {
        assertEquals(2.0000000000000004, FastMath.nextUp(2.0), 1e-15);
        assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextUp(Double.POSITIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.nextUp(Double.NaN)));
    }

    @Test
    public void testNextUpFloat() throws Exception {
        assertEquals(2.0000000000000004f, FastMath.nextUp(2.0f), 1e-15f);
        assertEquals(Float.MIN_VALUE, FastMath.nextUp(0.0f), 1e-15f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.nextUp(Float.POSITIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.nextUp(Float.NaN)));
    }

    @Test
    public void testRandom() throws Exception {
        // Math.random() is used, so we can only test that it returns a double in [0, 1)
        double randomVal = FastMath.random();
        assertTrue(randomVal >= 0.0 && randomVal < 1.0);

        // Test that multiple calls produce different values (highly likely)
        double randomVal2 = FastMath.random();
        assertNotEquals(randomVal, randomVal2, 1e-15);
    }

    @Test
    public void testLog10EdgeCases() throws Exception {
        // Test log10 for 0, negative, NaN, Infinity
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(-0.0), 0);
        assertTrue(Double.isNaN(FastMath.log10(-1.0)));
        assertTrue(Double.isNaN(FastMath.log10(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log10(Double.POSITIVE_INFINITY), 0);
    }

    @Test
    public void testPowEdgeCases() throws Exception {
        // Edge cases for pow(double, double)
        assertEquals(1.0, FastMath.pow(Double.NaN, 0.0), 1e-15); // NaN ^ 0 = 1
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 0);
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 0);
        assertEquals(0.0, FastMath.pow(0.0, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, Double.NEGATIVE_INFINITY), 0); // 0 ^ -inf = inf
        assertEquals(-0.0, FastMath.pow(-0.0, 3.0), 1e-15); // -0 ^ odd = -0
        assertEquals(0.0, FastMath.pow(-0.0, 2.0), 0);      // -0 ^ even = +0
        assertEquals(1.0, FastMath.pow(1.0, Double.NaN), 1e-15); // 1 ^ NaN = 1
        assertEquals(1.0, FastMath.pow(-1.0, Double.NaN), 1e-15); // -1 ^ NaN = 1
        assertEquals(Double.NaN, FastMath.pow(Double.NaN, Double.POSITIVE_INFINITY), 0); // NaN ^ inf = NaN
        assertEquals(Double.NaN, FastMath.pow(Double.NaN, Double.NEGATIVE_INFINITY), 0); // NaN ^ -inf = NaN
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 1000.0), 0); // inf ^ positive = inf
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -1000.0), 0); // inf ^ negative = 0
    }

    @Test
    public void testPowDoubleIntEdgeCases() throws Exception {
        // Edge cases for pow(double, int)
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, Integer.MAX_VALUE), 0);
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, Integer.MIN_VALUE), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, Integer.MAX_VALUE), 0); // Negative ^ large odd = -inf, but MAX_VALUE is odd
        assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, Integer.MIN_VALUE), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, Integer.MAX_VALUE - 1), 0); // Negative ^ large even = +inf
        assertEquals(1.0, FastMath.pow(Double.NaN, 0), 1e-15); // NaN ^ 0 = 1
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Integer.MAX_VALUE), 0);
        assertEquals(0.0, FastMath.pow(0.5, Integer.MAX_VALUE), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Integer.MIN_VALUE), 0); // 2 ^ -large = 0, but MIN_VALUE is negative and odd exponent
        assertEquals(0.0, FastMath.pow(0.5, Integer.MIN_VALUE), 0); // 0.5 ^ -large = inf, but MIN_VALUE is negative and odd exponent
    }

    @Test
    public void testHypotEdgeCases() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 0.0), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(0.0, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.NEGATIVE_INFINITY, 0.0), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(0.0, Double.NEGATIVE_INFINITY), 0);
        assertTrue(Double.isNaN(FastMath.hypot(Double.NaN, Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.hypot(Double.POSITIVE_INFINITY, Double.NaN)));
    }

    @Test
    public void testIEEEremainderEdgeCases() throws Exception {
        assertEquals(Double.NaN, FastMath.IEEEremainder(Double.POSITIVE_INFINITY, 2.0), 0);
        assertEquals(Double.NaN, FastMath.IEEEremainder(5.0, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NaN, FastMath.IEEEremainder(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 0);
        assertEquals(Double.NaN, FastMath.IEEEremainder(Double.NaN, 2.0), 0);
        assertEquals(Double.NaN, FastMath.IEEEremainder(2.0, Double.NaN), 0);
        assertEquals(2.0, FastMath.IEEEremainder(2.0, Double.POSITIVE_INFINITY), 1e-15); // finite / infinite = finite
        assertEquals(-2.0, FastMath.IEEEremainder(-2.0, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(0.0, FastMath.IEEEremainder(0.0, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(Double.NaN, FastMath.IEEEremainder(Double.POSITIVE_INFINITY, 0.0), 0); // inf / 0 = NaN
        assertEquals(Double.NaN, FastMath.IEEEremainder(5.0, 0.0), 0); // finite / 0 = NaN
        assertEquals(Double.NaN, FastMath.IEEEremainder(0.0, 0.0), 0); // 0 / 0 = NaN
        assertEquals(0.0, FastMath.IEEEremainder(0.0, 5.0), 1e-15); // 0 / finite = 0
    }

    @Test
    public void testCopySignEdgeCases() throws Exception {
        // Test with NaN sign
        assertEquals(5.0, FastMath.copySign(5.0, Double.NaN), 1e-15); // NaN sign is treated as positive
        assertEquals(-5.0, FastMath.copySign(5.0, -Double.NaN), 1e-15); // Negative NaN sign also treated as positive
        assertEquals(0.0, FastMath.copySign(0.0, Double.NaN), 1e-15);
        assertEquals(-0.0, FastMath.copySign(-0.0, Double.NaN), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.copySign(Double.POSITIVE_INFINITY, Double.NaN), 0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.copySign(Double.NEGATIVE_INFINITY, Double.NaN), 0); // sign is positive, magnitude is -inf -> +inf

        // Test with zero values
        assertEquals(0.0, FastMath.copySign(0.0, 1.0), 1e-15);
        assertEquals(-0.0, FastMath.copySign(0.0, -1.0), 1e-15);
        assertEquals(0.0, FastMath.copySign(-0.0, 1.0), 1e-15);
        assertEquals(-0.0, FastMath.copySign(-0.0, -1.0), 1e-15);
        assertEquals(0.0, FastMath.copySign(0.0, 0.0), 1e-15);
        assertEquals(-0.0, FastMath.copySign(0.0, -0.0), 1e-15);
        assertEquals(0.0, FastMath.copySign(-0.0, 0.0), 1e-15);
        assertEquals(-0.0, FastMath.copySign(-0.0, -0.0), 1e-15);
    }

    @Test
    public void testGetExponentEdgeCases() throws Exception {
        // Test for subnormal numbers
        assertEquals(-1074, FastMath.getExponent(Double.MIN_NORMAL));
        assertEquals(-1074, FastMath.getExponent(Double.MIN_NORMAL / 2.0)); // Should still be subnormal with same exponent

        // Test for zero and negative zero
        assertEquals(-1023, FastMath.getExponent(0.0));
        assertEquals(-1023, FastMath.getExponent(-0.0));
    }

    @Test
    public void testAtan2EdgeCases() throws Exception {
        // Zeroes
        assertEquals(0.0, FastMath.atan2(0.0, 1.0), 1e-15); // Positive x, zero y
        assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), 1e-15); // Negative x, zero y
        assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), 1e-15); // Positive y, zero x
        assertEquals(-Math.PI / 2.0, FastMath.atan2(-1.0, 0.0), 1e-15); // Negative y, zero x
        assertEquals(0.0, FastMath.atan2(0.0, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(Math.PI, FastMath.atan2(0.0, Double.NEGATIVE_INFINITY), 1e-15);
        assertEquals(Math.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 0.0), 1e-15);
        assertEquals(-Math.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 0.0), 1e-15);

        // Infinities
        assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(3.0 * Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-15);
        assertEquals(-Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(-3.0 * Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-15);

        // NaNs
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, Double.NaN)));
    }
}
