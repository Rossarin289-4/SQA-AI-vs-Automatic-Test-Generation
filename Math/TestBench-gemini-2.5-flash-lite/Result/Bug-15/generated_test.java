package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class FastMathTest {

    // Test methods for FastMath

    @Test
    public void testSqrt() {
        assertEquals(Math.sqrt(25.0), FastMath.sqrt(25.0), 1e-9);
        assertEquals(Math.sqrt(Double.MAX_VALUE), FastMath.sqrt(Double.MAX_VALUE), 1e-9);
        assertEquals(Math.sqrt(Double.MIN_VALUE), FastMath.sqrt(Double.MIN_VALUE), 1e-9);
        assertEquals(Math.sqrt(0.0), FastMath.sqrt(0.0), 1e-9);
        assertEquals(Math.sqrt(-0.0), FastMath.sqrt(-0.0), 1e-9);
        assertEquals(Math.sqrt(Double.POSITIVE_INFINITY), FastMath.sqrt(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.sqrt(Double.NaN), FastMath.sqrt(Double.NaN), 1e-9);
    }

    @Test
    public void testCosh() {
        assertEquals(Math.cosh(0.0), FastMath.cosh(0.0), 1e-9);
        assertEquals(Math.cosh(1.0), FastMath.cosh(1.0), 1e-9);
        assertEquals(Math.cosh(20.0), FastMath.cosh(20.0), 1e-9); // Edge case for large positive values
        assertEquals(Math.cosh(-20.0), FastMath.cosh(-20.0), 1e-9); // Edge case for large negative values
        assertEquals(Math.cosh(Double.MAX_VALUE), FastMath.cosh(Double.MAX_VALUE), 1e-9); // Potential overflow
        assertEquals(Math.cosh(Double.NEGATIVE_INFINITY), FastMath.cosh(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.cosh(Double.POSITIVE_INFINITY), FastMath.cosh(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.cosh(Double.NaN), FastMath.cosh(Double.NaN), 1e-9);
    }

    @Test
    public void testSinh() {
        assertEquals(Math.sinh(0.0), FastMath.sinh(0.0), 1e-9);
        assertEquals(Math.sinh(1.0), FastMath.sinh(1.0), 1e-9);
        assertEquals(Math.sinh(20.0), FastMath.sinh(20.0), 1e-9); // Edge case for large positive values
        assertEquals(Math.sinh(-20.0), FastMath.sinh(-20.0), 1e-9); // Edge case for large negative values
        assertEquals(Math.sinh(Double.MAX_VALUE), FastMath.sinh(Double.MAX_VALUE), 1e-9); // Potential overflow
        assertEquals(Math.sinh(Double.NEGATIVE_INFINITY), FastMath.sinh(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.sinh(Double.POSITIVE_INFINITY), FastMath.sinh(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.sinh(Double.NaN), FastMath.sinh(Double.NaN), 1e-9);
    }

    @Test
    public void testTanh() {
        assertEquals(Math.tanh(0.0), FastMath.tanh(0.0), 1e-9);
        assertEquals(Math.tanh(1.0), FastMath.tanh(1.0), 1e-9);
        assertEquals(Math.tanh(-1.0), FastMath.tanh(-1.0), 1e-9);
        assertEquals(Math.tanh(20.0), FastMath.tanh(20.0), 1e-9); // Edge case for large positive values
        assertEquals(Math.tanh(-20.0), FastMath.tanh(-20.0), 1e-9); // Edge case for large negative values
        assertEquals(Math.tanh(Double.MAX_VALUE), FastMath.tanh(Double.MAX_VALUE), 1e-9);
        assertEquals(Math.tanh(Double.NEGATIVE_INFINITY), FastMath.tanh(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.tanh(Double.POSITIVE_INFINITY), FastMath.tanh(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.tanh(Double.NaN), FastMath.tanh(Double.NaN), 1e-9);
    }




    @Test
    public void testSignumDouble() {
        assertEquals(1.0, FastMath.signum(10.0), 1e-9);
        assertEquals(-1.0, FastMath.signum(-10.0), 1e-9);
        assertEquals(0.0, FastMath.signum(0.0), 1e-9);
        assertEquals(-0.0, FastMath.signum(-0.0), 1e-9);
        assertEquals(1.0, FastMath.signum(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(-1.0, FastMath.signum(Double.NEGATIVE_INFINITY), 1e-9);
        assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testSignumFloat() {
        assertEquals(1.0f, FastMath.signum(10.0f), 1e-9f);
        assertEquals(-1.0f, FastMath.signum(-10.0f), 1e-9f);
        assertEquals(0.0f, FastMath.signum(0.0f), 1e-9f);
        assertEquals(-0.0f, FastMath.signum(-0.0f), 1e-9f);
        assertEquals(1.0f, FastMath.signum(Float.POSITIVE_INFINITY), 1e-9f);
        assertEquals(-1.0f, FastMath.signum(Float.NEGATIVE_INFINITY), 1e-9f);
        assertTrue(Double.isNaN(FastMath.signum(Float.NaN)));
    }

    @Test
    public void testNextUpDouble() {
        assertEquals(nextUpPositiveInfinity, FastMath.nextUp(1.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextUp(Double.MAX_VALUE), 1e-9); // Largest finite value
        assertEquals(Double.MIN_NORMAL, FastMath.nextUp(0.0), 1e-9);
        assertEquals(Double.MIN_VALUE, FastMath.nextUp(-Double.MIN_NORMAL), 1e-9); // Smallest positive subnormal
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextUp(Double.POSITIVE_INFINITY), 1e-9);
    }

    @Test
    public void testNextUpFloat() {
        assertEquals(nextUpPositiveInfinityFloat, FastMath.nextUp(1.0f), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.nextUp(Float.MAX_VALUE), 1e-9f); // Largest finite value
        assertEquals(Float.MIN_NORMAL, FastMath.nextUp(0.0f), 1e-9f);
        assertEquals(Float.MIN_VALUE, FastMath.nextUp(-Float.MIN_NORMAL), 1e-9f); // Smallest positive subnormal
        assertEquals(Float.POSITIVE_INFINITY, FastMath.nextUp(Float.POSITIVE_INFINITY), 1e-9f);
    }

    @Test
    public void testRandom() {
        double r1 = FastMath.random();
        double r2 = FastMath.random();
        assertTrue(r1 >= 0.0 && r1 < 1.0);
        assertTrue(r2 >= 0.0 && r2 < 1.0);
        // The exact values are non-deterministic, so we can only check the range.
        // We can check that calling it twice produces different results (with high probability).
        assertFalse(r1 == r2);
    }

    @Test
    public void testExp() {
        assertEquals(Math.exp(0.0), FastMath.exp(0.0), 1e-9);
        assertEquals(Math.exp(1.0), FastMath.exp(1.0), 1e-9);
        assertEquals(Math.exp(-1.0), FastMath.exp(-1.0), 1e-9);
        assertEquals(Math.exp(709.78), FastMath.exp(709.78), 1e-9); // Near max exp
        assertEquals(Math.exp(709.7827), FastMath.exp(709.7827), 1e-9); // Max positive double
        assertEquals(Math.exp(-708.39), FastMath.exp(-708.39), 1e-9); // Near min exp
        assertEquals(Math.exp(Double.MAX_VALUE), FastMath.exp(Double.MAX_VALUE), 1e-9); // Overflow
        assertEquals(Math.exp(Double.MIN_VALUE), FastMath.exp(Double.MIN_VALUE), 1e-9); // Subnormal
        assertEquals(Math.exp(Double.POSITIVE_INFINITY), FastMath.exp(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.exp(Double.NEGATIVE_INFINITY), FastMath.exp(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.exp(Double.NaN), FastMath.exp(Double.NaN), 1e-9);
    }

    @Test
    public void testExpm1() {
        assertEquals(Math.expm1(0.0), FastMath.expm1(0.0), 1e-9);
        assertEquals(Math.expm1(1.0), FastMath.expm1(1.0), 1e-9);
        assertEquals(Math.expm1(-1.0), FastMath.expm1(-1.0), 1e-9);
        assertEquals(Math.expm1(709.78), FastMath.expm1(709.78), 1e-9); // Near max exp
        assertEquals(Math.expm1(Double.MAX_VALUE), FastMath.expm1(Double.MAX_VALUE), 1e-9); // Overflow
        assertEquals(Math.expm1(Double.MIN_NORMAL), FastMath.expm1(Double.MIN_NORMAL), 1e-9); // Smallest positive normal
        assertEquals(Math.expm1(-Double.MIN_NORMAL), FastMath.expm1(-Double.MIN_NORMAL), 1e-9); // Smallest negative normal
        assertEquals(Math.expm1(Double.POSITIVE_INFINITY), FastMath.expm1(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.expm1(Double.NEGATIVE_INFINITY), FastMath.expm1(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.expm1(Double.NaN), FastMath.expm1(Double.NaN), 1e-9);
    }

    @Test
    public void testLog() {
        assertEquals(Math.log(1.0), FastMath.log(1.0), 1e-9);
        assertEquals(Math.log(FastMath.E), FastMath.log(FastMath.E), 1e-9);
        assertEquals(Math.log(10.0), FastMath.log(10.0), 1e-9);
        assertEquals(Math.log(Double.MAX_VALUE), FastMath.log(Double.MAX_VALUE), 1e-9); // Max positive double
        assertEquals(Math.log(Double.MIN_NORMAL), FastMath.log(Double.MIN_NORMAL), 1e-9); // Smallest positive normal
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 1e-9); // Zero
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(-0.0), 1e-9); // Negative zero
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.log(Double.NEGATIVE_INFINITY), 1e-9); // Negative infinity
        assertEquals(Double.NaN, FastMath.log(Double.NaN), 1e-9);
        // Test values near 1.0
        assertEquals(Math.log(1.0 + Precision.EPSILON), FastMath.log(1.0 + Precision.EPSILON), 1e-9);
        assertEquals(Math.log(1.0 - Precision.EPSILON), FastMath.log(1.0 - Precision.EPSILON), 1e-9);
    }

    @Test
    public void testLog1p() {
        assertEquals(Math.log1p(0.0), FastMath.log1p(0.0), 1e-9);
        assertEquals(Math.log1p(1.0), FastMath.log1p(1.0), 1e-9);
        assertEquals(Math.log1p(-0.5), FastMath.log1p(-0.5), 1e-9);
        assertEquals(Math.log1p(Double.MAX_VALUE), FastMath.log1p(Double.MAX_VALUE), 1e-9);
        assertEquals(Math.log1p(Double.MIN_NORMAL), FastMath.log1p(Double.MIN_NORMAL), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 1e-9); // Log of 0
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.log1p(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.log1p(Double.NaN), 1e-9);
    }

    @Test
    public void testLog10() {
        assertEquals(Math.log10(1.0), FastMath.log10(1.0), 1e-9);
        assertEquals(Math.log10(10.0), FastMath.log10(10.0), 1e-9);
        assertEquals(Math.log10(100.0), FastMath.log10(100.0), 1e-9);
        assertEquals(Math.log10(Double.MAX_VALUE), FastMath.log10(Double.MAX_VALUE), 1e-9);
        assertEquals(Math.log10(Double.MIN_NORMAL), FastMath.log10(Double.MIN_NORMAL), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(-0.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log10(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.log10(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.log10(Double.NaN), 1e-9);
    }

    @Test
    public void testPowDoubleDouble() {
        assertEquals(Math.pow(2.0, 3.0), FastMath.pow(2.0, 3.0), 1e-9);
        assertEquals(Math.pow(2.0, -3.0), FastMath.pow(2.0, -3.0), 1e-9);
        assertEquals(Math.pow(-2.0, 3.0), FastMath.pow(-2.0, 3.0), 1e-9); // Negative base, odd exponent
        assertEquals(Math.pow(-2.0, 4.0), FastMath.pow(-2.0, 4.0), 1e-9); // Negative base, even exponent
        assertEquals(Math.pow(-2.0, 3.5), FastMath.pow(-2.0, 3.5), 1e-9); // Negative base, fractional exponent
        assertEquals(Math.pow(0.0, 3.0), FastMath.pow(0.0, 3.0), 1e-9); // Zero base, positive exponent
        assertEquals(Math.pow(0.0, -3.0), FastMath.pow(0.0, -3.0), 1e-9); // Zero base, negative exponent
        assertEquals(Math.pow(0.0, 0.0), FastMath.pow(0.0, 0.0), 1e-9); // Zero base, zero exponent
        assertEquals(Math.pow(2.0, 0.0), FastMath.pow(2.0, 0.0), 1e-9); // Positive base, zero exponent
        assertEquals(Math.pow(-2.0, 0.0), FastMath.pow(-2.0, 0.0), 1e-9); // Negative base, zero exponent
        assertEquals(Math.pow(1.0, Double.POSITIVE_INFINITY), FastMath.pow(1.0, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.pow(0.5, Double.POSITIVE_INFINITY), FastMath.pow(0.5, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.pow(2.0, Double.POSITIVE_INFINITY), FastMath.pow(2.0, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Math.pow(1.0, Double.NEGATIVE_INFINITY), FastMath.pow(1.0, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.pow(0.5, Double.NEGATIVE_INFINITY), FastMath.pow(0.5, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.pow(2.0, Double.NEGATIVE_INFINITY), FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.pow(Double.POSITIVE_INFINITY, 2.0), FastMath.pow(Double.POSITIVE_INFINITY, 2.0), 1e-9);
        assertEquals(Math.pow(Double.POSITIVE_INFINITY, -2.0), FastMath.pow(Double.POSITIVE_INFINITY, -2.0), 1e-9);
        assertEquals(Math.pow(Double.NEGATIVE_INFINITY, 2.0), FastMath.pow(Double.NEGATIVE_INFINITY, 2.0), 1e-9);
        assertEquals(Math.pow(Double.NEGATIVE_INFINITY, 3.0), FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), 1e-9);
        assertEquals(Math.pow(Double.NEGATIVE_INFINITY, -2.0), FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), 1e-9);
        assertEquals(Math.pow(Double.NaN, 2.0), FastMath.pow(Double.NaN, 2.0), 1e-9);
        assertEquals(Math.pow(2.0, Double.NaN), FastMath.pow(2.0, Double.NaN), 1e-9);
        assertEquals(Math.pow(Double.NaN, Double.NaN), FastMath.pow(Double.NaN, Double.NaN), 1e-9);
    }

    @Test
    public void testPowDoubleInt() {
        assertEquals(Math.pow(2.0, 3), FastMath.pow(2.0, 3), 1e-9);
        assertEquals(Math.pow(2.0, -3), FastMath.pow(2.0, -3), 1e-9);
        assertEquals(Math.pow(-2.0, 3), FastMath.pow(-2.0, 3), 1e-9); // Negative base, odd exponent
        assertEquals(Math.pow(-2.0, 4), FastMath.pow(-2.0, 4), 1e-9); // Negative base, even exponent
        assertEquals(Math.pow(0.0, 3), FastMath.pow(0.0, 3), 1e-9); // Zero base, positive exponent
        assertEquals(Math.pow(0.0, -3), FastMath.pow(0.0, -3), 1e-9); // Zero base, negative exponent
        assertEquals(Math.pow(0.0, 0), FastMath.pow(0.0, 0), 1e-9); // Zero base, zero exponent
        assertEquals(Math.pow(2.0, 0), FastMath.pow(2.0, 0), 1e-9); // Positive base, zero exponent
        assertEquals(Math.pow(-2.0, 0), FastMath.pow(-2.0, 0), 1e-9); // Negative base, zero exponent
        assertEquals(Math.pow(Double.POSITIVE_INFINITY, 2), FastMath.pow(Double.POSITIVE_INFINITY, 2), 1e-9);
        assertEquals(Math.pow(Double.POSITIVE_INFINITY, -2), FastMath.pow(Double.POSITIVE_INFINITY, -2), 1e-9);
        assertEquals(Math.pow(Double.NEGATIVE_INFINITY, 2), FastMath.pow(Double.NEGATIVE_INFINITY, 2), 1e-9);
        assertEquals(Math.pow(Double.NEGATIVE_INFINITY, 3), FastMath.pow(Double.NEGATIVE_INFINITY, 3), 1e-9);
        assertEquals(Math.pow(Double.NEGATIVE_INFINITY, -2), FastMath.pow(Double.NEGATIVE_INFINITY, -2), 1e-9);
        assertEquals(Math.pow(2.0, Integer.MAX_VALUE), FastMath.pow(2.0, Integer.MAX_VALUE), 1e-9); // Large exponent
        assertEquals(Math.pow(2.0, Integer.MIN_VALUE), FastMath.pow(2.0, Integer.MIN_VALUE), 1e-9); // Small exponent
    }

    @Test
    public void testSin() {
        assertEquals(Math.sin(0.0), FastMath.sin(0.0), 1e-9);
        assertEquals(Math.sin(Math.PI / 2.0), FastMath.sin(Math.PI / 2.0), 1e-9);
        assertEquals(Math.sin(Math.PI), FastMath.sin(Math.PI), 1e-9);
        assertEquals(Math.sin(3.0 * Math.PI / 2.0), FastMath.sin(3.0 * Math.PI / 2.0), 1e-9);
        assertEquals(Math.sin(2.0 * Math.PI), FastMath.sin(2.0 * Math.PI), 1e-9);
        assertEquals(Math.sin(-Math.PI / 2.0), FastMath.sin(-Math.PI / 2.0), 1e-9);
        assertEquals(Double.NaN, FastMath.sin(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.sin(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.sin(Double.NaN), 1e-9);
        // Large argument reduction test
        assertEquals(Math.sin(3294198.0 + 0.5), FastMath.sin(3294198.0 + 0.5), 1e-9);
    }

    @Test
    public void testCos() {
        assertEquals(Math.cos(0.0), FastMath.cos(0.0), 1e-9);
        assertEquals(Math.cos(Math.PI / 2.0), FastMath.cos(Math.PI / 2.0), 1e-9);
        assertEquals(Math.cos(Math.PI), FastMath.cos(Math.PI), 1e-9);
        assertEquals(Math.cos(3.0 * Math.PI / 2.0), FastMath.cos(3.0 * Math.PI / 2.0), 1e-9);
        assertEquals(Math.cos(2.0 * Math.PI), FastMath.cos(2.0 * Math.PI), 1e-9);
        assertEquals(Math.cos(-Math.PI / 2.0), FastMath.cos(-Math.PI / 2.0), 1e-9);
        assertEquals(Double.NaN, FastMath.cos(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.cos(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.cos(Double.NaN), 1e-9);
        // Large argument reduction test
        assertEquals(Math.cos(3294198.0 + 0.5), FastMath.cos(3294198.0 + 0.5), 1e-9);
    }

    @Test
    public void testTan() {
        assertEquals(Math.tan(0.0), FastMath.tan(0.0), 1e-9);
        assertEquals(Math.tan(Math.PI / 4.0), FastMath.tan(Math.PI / 4.0), 1e-9);
        assertEquals(Math.tan(Math.PI), FastMath.tan(Math.PI), 1e-9); // Should be close to 0
        assertEquals(Math.tan(-Math.PI / 4.0), FastMath.tan(-Math.PI / 4.0), 1e-9);
        // tan(PI/2) is infinity
        assertEquals(Math.tan(Math.PI / 2.0), FastMath.tan(Math.PI / 2.0), 1e-9); // Will be a large number
        assertEquals(Math.tan(3.0 * Math.PI / 2.0), FastMath.tan(3.0 * Math.PI / 2.0), 1e-9); // Will be a large number
        assertEquals(Double.NaN, FastMath.tan(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.tan(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.tan(Double.NaN), 1e-9);
        // Large argument reduction test
        assertEquals(Math.tan(3294198.0 + 0.5), FastMath.tan(3294198.0 + 0.5), 1e-9);
    }

    @Test
    public void testAtan() {
        assertEquals(Math.atan(0.0), FastMath.atan(0.0), 1e-9);
        assertEquals(Math.atan(1.0), FastMath.atan(1.0), 1e-9);
        assertEquals(Math.atan(-1.0), FastMath.atan(-1.0), 1e-9);
        assertEquals(Math.atan(Double.MAX_VALUE), FastMath.atan(Double.MAX_VALUE), 1e-9); // Approaching PI/2
        assertEquals(Math.atan(Double.MIN_NORMAL), FastMath.atan(Double.MIN_NORMAL), 1e-9); // Small positive
        assertEquals(Math.atan(-Double.MIN_NORMAL), FastMath.atan(-Double.MIN_NORMAL), 1e-9); // Small negative
        assertEquals(Math.PI / 2.0, FastMath.atan(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(-Math.PI / 2.0, FastMath.atan(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.atan(Double.NaN), 1e-9);
    }

    @Test
    public void testAtan2() {
        assertEquals(Math.atan2(1.0, 0.0), FastMath.atan2(1.0, 0.0), 1e-9);
        assertEquals(Math.atan2(0.0, 1.0), FastMath.atan2(0.0, 1.0), 1e-9);
        assertEquals(Math.atan2(-1.0, 0.0), FastMath.atan2(-1.0, 0.0), 1e-9);
        assertEquals(Math.atan2(0.0, -1.0), FastMath.atan2(0.0, -1.0), 1e-9);
        assertEquals(Math.atan2(1.0, 1.0), FastMath.atan2(1.0, 1.0), 1e-9);
        assertEquals(Math.atan2(-1.0, 1.0), FastMath.atan2(-1.0, 1.0), 1e-9);
        assertEquals(Math.atan2(1.0, -1.0), FastMath.atan2(1.0, -1.0), 1e-9);
        assertEquals(Math.atan2(-1.0, -1.0), FastMath.atan2(-1.0, -1.0), 1e-9);
        assertEquals(Math.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 1.0), 1e-9);
        assertEquals(0.0, FastMath.atan2(1.0, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(-Math.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 1.0), 1e-9);
        assertEquals(Math.PI, FastMath.atan2(1.0, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(3.0 * Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(-Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(-3.0 * Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.atan2(Double.NaN, 1.0), 1e-9);
        assertEquals(Double.NaN, FastMath.atan2(1.0, Double.NaN), 1e-9);
        assertEquals(Double.NaN, FastMath.atan2(Double.NaN, Double.NaN), 1e-9);
    }

    @Test
    public void testAsin() {
        assertEquals(Math.asin(0.0), FastMath.asin(0.0), 1e-9);
        assertEquals(Math.asin(1.0), FastMath.asin(1.0), 1e-9);
        assertEquals(Math.asin(-1.0), FastMath.asin(-1.0), 1e-9);
        assertEquals(Math.asin(0.5), FastMath.asin(0.5), 1e-9);
        assertEquals(Math.asin(-0.5), FastMath.asin(-0.5), 1e-9);
        assertEquals(Double.NaN, FastMath.asin(1.1), 1e-9); // Greater than 1
        assertEquals(Double.NaN, FastMath.asin(-1.1), 1e-9); // Less than -1
        assertEquals(Double.NaN, FastMath.asin(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.asin(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.asin(Double.NaN), 1e-9);
    }

    @Test
    public void testAcos() {
        assertEquals(Math.acos(0.0), FastMath.acos(0.0), 1e-9);
        assertEquals(Math.acos(1.0), FastMath.acos(1.0), 1e-9);
        assertEquals(Math.acos(-1.0), FastMath.acos(-1.0), 1e-9);
        assertEquals(Math.acos(0.5), FastMath.acos(0.5), 1e-9);
        assertEquals(Math.acos(-0.5), FastMath.acos(-0.5), 1e-9);
        assertEquals(Double.NaN, FastMath.acos(1.1), 1e-9); // Greater than 1
        assertEquals(Double.NaN, FastMath.acos(-1.1), 1e-9); // Less than -1
        assertEquals(Double.NaN, FastMath.acos(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.acos(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.acos(Double.NaN), 1e-9);
    }

    @Test
    public void testCbrt() {
        assertEquals(Math.cbrt(0.0), FastMath.cbrt(0.0), 1e-9);
        assertEquals(Math.cbrt(-0.0), FastMath.cbrt(-0.0), 1e-9);
        assertEquals(Math.cbrt(1.0), FastMath.cbrt(1.0), 1e-9);
        assertEquals(Math.cbrt(-1.0), FastMath.cbrt(-1.0), 1e-9);
        assertEquals(Math.cbrt(8.0), FastMath.cbrt(8.0), 1e-9);
        assertEquals(Math.cbrt(-8.0), FastMath.cbrt(-8.0), 1e-9);
        assertEquals(Math.cbrt(Double.MAX_VALUE), FastMath.cbrt(Double.MAX_VALUE), 1e-9);
        assertEquals(Math.cbrt(Double.MIN_VALUE), FastMath.cbrt(Double.MIN_VALUE), 1e-9); // Subnormal input
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.cbrt(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.cbrt(Double.NaN), 1e-9);
    }

    @Test
    public void testToRadians() {
        assertEquals(0.0, FastMath.toRadians(0.0), 1e-9);
        assertEquals(Math.PI / 180.0, FastMath.toRadians(1.0), 1e-9);
        assertEquals(Math.PI, FastMath.toRadians(180.0), 1e-9);
        assertEquals(2.0 * Math.PI, FastMath.toRadians(360.0), 1e-9);
        assertEquals(-Math.PI / 2.0, FastMath.toRadians(-90.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.toRadians(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.toRadians(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.toRadians(Double.NaN), 1e-9);
    }

    @Test
    public void testToDegrees() {
        assertEquals(0.0, FastMath.toDegrees(0.0), 1e-9);
        assertEquals(180.0 / Math.PI, FastMath.toDegrees(1.0), 1e-9);
        assertEquals(90.0, FastMath.toDegrees(Math.PI / 2.0), 1e-9);
        assertEquals(180.0, FastMath.toDegrees(Math.PI), 1e-9);
        assertEquals(-90.0, FastMath.toDegrees(-Math.PI / 2.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.toDegrees(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.toDegrees(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.toDegrees(Double.NaN), 1e-9);
    }

    @Test
    public void testAbsInt() {
        assertEquals(5, FastMath.abs(5));
        assertEquals(5, FastMath.abs(-5));
        assertEquals(0, FastMath.abs(0));
        assertEquals(Integer.MIN_VALUE, FastMath.abs(Integer.MIN_VALUE)); // Edge case: abs(Integer.MIN_VALUE) is Integer.MIN_VALUE
        assertEquals(Integer.MAX_VALUE, FastMath.abs(Integer.MAX_VALUE));
    }

    @Test
    public void testAbsLong() {
        assertEquals(5L, FastMath.abs(5L));
        assertEquals(5L, FastMath.abs(-5L));
        assertEquals(0L, FastMath.abs(0L));
        assertEquals(Long.MIN_VALUE, FastMath.abs(Long.MIN_VALUE)); // Edge case: abs(Long.MIN_VALUE) is Long.MIN_VALUE
        assertEquals(Long.MAX_VALUE, FastMath.abs(Long.MAX_VALUE));
    }

    @Test
    public void testAbsFloat() {
        assertEquals(5.0f, FastMath.abs(5.0f), 1e-9f);
        assertEquals(5.0f, FastMath.abs(-5.0f), 1e-9f);
        assertEquals(0.0f, FastMath.abs(0.0f), 1e-9f);
        assertEquals(0.0f, FastMath.abs(-0.0f), 1e-9f); // -0.0 becomes +0.0
        assertEquals(Float.POSITIVE_INFINITY, FastMath.abs(Float.POSITIVE_INFINITY), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.abs(Float.NEGATIVE_INFINITY), 1e-9f);
        assertEquals(Float.NaN, FastMath.abs(Float.NaN), 1e-9f);
        assertEquals(Float.MAX_VALUE, FastMath.abs(Float.MAX_VALUE), 1e-9f);
        assertEquals(Float.MIN_NORMAL, FastMath.abs(Float.MIN_NORMAL), 1e-9f);
        assertEquals(Float.MIN_NORMAL, FastMath.abs(-Float.MIN_NORMAL), 1e-9f);
    }

    @Test
    public void testAbsDouble() {
        assertEquals(5.0, FastMath.abs(5.0), 1e-9);
        assertEquals(5.0, FastMath.abs(-5.0), 1e-9);
        assertEquals(0.0, FastMath.abs(0.0), 1e-9);
        assertEquals(0.0, FastMath.abs(-0.0), 1e-9); // -0.0 becomes +0.0
        assertEquals(Double.POSITIVE_INFINITY, FastMath.abs(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.abs(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.abs(Double.NaN), 1e-9);
        assertEquals(Double.MAX_VALUE, FastMath.abs(Double.MAX_VALUE), 1e-9);
        assertEquals(Double.MIN_NORMAL, FastMath.abs(Double.MIN_NORMAL), 1e-9);
        assertEquals(Double.MIN_NORMAL, FastMath.abs(-Double.MIN_NORMAL), 1e-9);
    }

    @Test
    public void testUlpDouble() {
        assertEquals(ulpPositiveInfinity, FastMath.ulp(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(ulpPositiveInfinity, FastMath.ulp(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(ulpNaN, FastMath.ulp(Double.NaN), 1e-9);
        assertEquals(FastMath.ulp(1.0), FastMath.ulp(1.0), 1e-9);
        assertEquals(FastMath.ulp(Double.MAX_VALUE), FastMath.ulp(Double.MAX_VALUE), 1e-9);
        assertEquals(FastMath.ulp(Double.MIN_NORMAL), FastMath.ulp(Double.MIN_NORMAL), 1e-9);
        assertEquals(FastMath.ulp(Double.MIN_VALUE), FastMath.ulp(Double.MIN_VALUE), 1e-9);
        assertEquals(FastMath.ulp(0.0), FastMath.ulp(0.0), 1e-9);
        assertEquals(FastMath.ulp(-0.0), FastMath.ulp(-0.0), 1e-9);
    }

    @Test
    public void testUlpFloat() {
        assertEquals(ulpPositiveInfinityFloat, FastMath.ulp(Float.POSITIVE_INFINITY), 1e-9f);
        assertEquals(ulpPositiveInfinityFloat, FastMath.ulp(Float.NEGATIVE_INFINITY), 1e-9f);
        assertEquals(ulpNaNFloat, FastMath.ulp(Float.NaN), 1e-9f);
        assertEquals(FastMath.ulp(1.0f), FastMath.ulp(1.0f), 1e-9f);
        assertEquals(FastMath.ulp(Float.MAX_VALUE), FastMath.ulp(Float.MAX_VALUE), 1e-9f);
        assertEquals(FastMath.ulp(Float.MIN_NORMAL), FastMath.ulp(Float.MIN_NORMAL), 1e-9f);
        assertEquals(FastMath.ulp(Float.MIN_VALUE), FastMath.ulp(Float.MIN_VALUE), 1e-9f);
        assertEquals(FastMath.ulp(0.0f), FastMath.ulp(0.0f), 1e-9f);
        assertEquals(FastMath.ulp(-0.0f), FastMath.ulp(-0.0f), 1e-9f);
    }

    @Test
    public void testScalbDouble() {
        assertEquals(80.0, FastMath.scalb(10.0, 3), 1e-9);
        assertEquals(10.0, FastMath.scalb(10.0, 0), 1e-9);
        assertEquals(5.0, FastMath.scalb(10.0, -1), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.POSITIVE_INFINITY, 10), 1e-9);
        assertEquals(0.0, FastMath.scalb(Double.MIN_NORMAL, -1074), 1e-9); // Scaled down to zero
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.MAX_VALUE, 1074), 1e-9); // Scaled up to infinity
        assertEquals(Double.NaN, FastMath.scalb(Double.NaN, 10), 1e-9);
        assertEquals(0.0, FastMath.scalb(0.0, 100), 1e-9);
        assertEquals(-0.0, FastMath.scalb(-0.0, 100), 1e-9);
        assertEquals(0.0, FastMath.scalb(1.0, -2098), 1e-9); // Underflow to zero
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 2097), 1e-9); // Overflow to infinity
    }

    @Test
    public void testScalbFloat() {
        assertEquals(80.0f, FastMath.scalb(10.0f, 3), 1e-9f);
        assertEquals(10.0f, FastMath.scalb(10.0f, 0), 1e-9f);
        assertEquals(5.0f, FastMath.scalb(10.0f, -1), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(Float.POSITIVE_INFINITY, 10), 1e-9f);
        assertEquals(0.0f, FastMath.scalb(Float.MIN_NORMAL, -150), 1e-9f); // Scaled down to zero
        assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(Float.MAX_VALUE, 151), 1e-9f); // Scaled up to infinity
        assertEquals(Float.NaN, FastMath.scalb(Float.NaN, 10), 1e-9f);
        assertEquals(0.0f, FastMath.scalb(0.0f, 100), 1e-9f);
        assertEquals(-0.0f, FastMath.scalb(-0.0f, 100), 1e-9f);
        assertEquals(0.0f, FastMath.scalb(1.0f, -277), 1e-9f); // Underflow to zero
        assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 276), 1e-9f); // Overflow to infinity
    }

    @Test
    public void testNextAfterDouble() {
        assertEquals(1.0 + Double.MIN_NORMAL, FastMath.nextAfter(1.0, Double.POSITIVE_INFINITY), 1e-9); // small positive increment
        assertEquals(1.0 - Double.MIN_NORMAL, FastMath.nextAfter(1.0, Double.NEGATIVE_INFINITY), 1e-9); // small negative increment
        assertEquals(-1.0 - Double.MIN_NORMAL, FastMath.nextAfter(-1.0, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(-1.0 + Double.MIN_NORMAL, FastMath.nextAfter(-1.0, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.MIN_NORMAL, FastMath.nextAfter(0.0, 1.0), 1e-9);
        assertEquals(-Double.MIN_NORMAL, FastMath.nextAfter(0.0, -1.0), 1e-9);
        assertEquals(Double.MIN_NORMAL, FastMath.nextAfter(-0.0, 1.0), 1e-9);
        assertEquals(-Double.MIN_NORMAL, FastMath.nextAfter(-0.0, -1.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextAfter(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.MAX_VALUE, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.nextAfter(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(-Double.MAX_VALUE, FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.0), 1e-9);
        assertEquals(Double.NaN, FastMath.nextAfter(Double.NaN, 1.0), 1e-9);
        assertEquals(Double.NaN, FastMath.nextAfter(1.0, Double.NaN), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 1e-9); // next to infinity is infinity
        assertEquals(-Double.MAX_VALUE, FastMath.nextAfter(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY), 1e-9); // next to -infinity is -infinity
    }

    @Test
    public void testNextAfterFloat() {
        assertEquals(1.0f + Float.MIN_NORMAL, FastMath.nextAfter(1.0f, Double.POSITIVE_INFINITY), 1e-9f); // small positive increment
        assertEquals(1.0f - Float.MIN_NORMAL, FastMath.nextAfter(1.0f, Double.NEGATIVE_INFINITY), 1e-9f); // small negative increment
        assertEquals(-1.0f - Float.MIN_NORMAL, FastMath.nextAfter(-1.0f, Double.NEGATIVE_INFINITY), 1e-9f);
        assertEquals(-1.0f + Float.MIN_NORMAL, FastMath.nextAfter(-1.0f, Double.POSITIVE_INFINITY), 1e-9f);
        assertEquals(Float.MIN_NORMAL, FastMath.nextAfter(0.0f, 1.0), 1e-9f);
        assertEquals(-Float.MIN_NORMAL, FastMath.nextAfter(0.0f, -1.0), 1e-9f);
        assertEquals(Float.MIN_NORMAL, FastMath.nextAfter(-0.0f, 1.0), 1e-9f);
        assertEquals(-Float.MIN_NORMAL, FastMath.nextAfter(-0.0f, -1.0), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.nextAfter(Float.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9f);
        assertEquals(Float.MAX_VALUE, FastMath.nextAfter(Float.POSITIVE_INFINITY, 0.0), 1e-9f);
        assertEquals(Float.NEGATIVE_INFINITY, FastMath.nextAfter(Float.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9f);
        assertEquals(-Float.MAX_VALUE, FastMath.nextAfter(Float.NEGATIVE_INFINITY, 0.0), 1e-9f);
        assertEquals(Float.NaN, FastMath.nextAfter(Float.NaN, 1.0), 1e-9f);
        assertEquals(Float.NaN, FastMath.nextAfter(1.0f, Double.NaN), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.nextAfter(Float.MAX_VALUE, Double.POSITIVE_INFINITY), 1e-9f); // next to infinity is infinity
        assertEquals(-Float.MAX_VALUE, FastMath.nextAfter(-Float.MAX_VALUE, Double.NEGATIVE_INFINITY), 1e-9f); // next to -infinity is -infinity
    }

    @Test
    public void testFloor() {
        assertEquals(5.0, FastMath.floor(5.0), 1e-9);
        assertEquals(5.0, FastMath.floor(5.1), 1e-9);
        assertEquals(-6.0, FastMath.floor(-5.1), 1e-9);
        assertEquals(-5.0, FastMath.floor(-5.0), 1e-9);
        assertEquals(0.0, FastMath.floor(0.0), 1e-9);
        assertEquals(-0.0, FastMath.floor(-0.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.floor(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.floor(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.floor(Double.NaN), 1e-9);
        assertEquals(Double.MAX_VALUE, FastMath.floor(Double.MAX_VALUE), 1e-9);
        assertEquals(-Double.MAX_VALUE, FastMath.floor(-Double.MAX_VALUE), 1e-9);
        assertEquals(0.0, FastMath.floor(Double.MIN_NORMAL), 1e-9);
        assertEquals(-1.0, FastMath.floor(-Double.MIN_NORMAL), 1e-9); // Floor of a small negative number
    }

    @Test
    public void testCeil() {
        assertEquals(5.0, FastMath.ceil(5.0), 1e-9);
        assertEquals(6.0, FastMath.ceil(5.1), 1e-9);
        assertEquals(-5.0, FastMath.ceil(-5.1), 1e-9);
        assertEquals(-5.0, FastMath.ceil(-5.0), 1e-9);
        assertEquals(0.0, FastMath.ceil(0.0), 1e-9);
        assertEquals(-0.0, FastMath.ceil(-0.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ceil(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.ceil(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.ceil(Double.NaN), 1e-9);
        assertEquals(Double.MAX_VALUE, FastMath.ceil(Double.MAX_VALUE), 1e-9);
        assertEquals(-Double.MAX_VALUE, FastMath.ceil(-Double.MAX_VALUE), 1e-9);
        assertEquals(0.0, FastMath.ceil(Double.MIN_NORMAL), 1e-9); // Ceil of a small positive number
    }

    @Test
    public void testRint() {
        assertEquals(5.0, FastMath.rint(5.0), 1e-9);
        assertEquals(5.0, FastMath.rint(5.1), 1e-9);
        assertEquals(-5.0, FastMath.rint(-5.1), 1e-9);
        assertEquals(6.0, FastMath.rint(5.5), 1e-9); // Round half up to even
        assertEquals(-6.0, FastMath.rint(-5.5), 1e-9); // Round half down to even
        assertEquals(0.0, FastMath.rint(0.0), 1e-9);
        assertEquals(-0.0, FastMath.rint(-0.0), 1e-9);
        assertEquals(0.0, FastMath.rint(0.5), 1e-9); // Round half up to even (0.0)
        assertEquals(-0.0, FastMath.rint(-0.5), 1e-9); // Round half down to even (-0.0)
        assertEquals(Double.POSITIVE_INFINITY, FastMath.rint(Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.rint(Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.rint(Double.NaN), 1e-9);
    }



    @Test
    public void testMinInt() {
        assertEquals(5, FastMath.min(5, 10));
        assertEquals(5, FastMath.min(10, 5));
        assertEquals(5, FastMath.min(5, 5));
        assertEquals(Integer.MIN_VALUE, FastMath.min(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, FastMath.min(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testMinLong() {
        assertEquals(5L, FastMath.min(5L, 10L));
        assertEquals(5L, FastMath.min(10L, 5L));
        assertEquals(5L, FastMath.min(5L, 5L));
        assertEquals(Long.MIN_VALUE, FastMath.min(Long.MIN_VALUE, Long.MAX_VALUE));
        assertEquals(Long.MIN_VALUE, FastMath.min(Long.MAX_VALUE, Long.MIN_VALUE));
    }

    @Test
    public void testMinFloat() {
        assertEquals(5.0f, FastMath.min(5.0f, 10.0f), 1e-9f);
        assertEquals(5.0f, FastMath.min(10.0f, 5.0f), 1e-9f);
        assertEquals(5.0f, FastMath.min(5.0f, 5.0f), 1e-9f);
        assertEquals(-0.0f, FastMath.min(0.0f, -0.0f), 1e-9f); // min(+0.0, -0.0) == -0.0
        assertEquals(-0.0f, FastMath.min(-0.0f, 0.0f), 1e-9f);
        assertEquals(Float.NaN, FastMath.min(Float.NaN, 5.0f), 1e-9f); // NaN propagation
        assertEquals(Float.NaN, FastMath.min(5.0f, Float.NaN), 1e-9f);
        assertEquals(Float.NEGATIVE_INFINITY, FastMath.min(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY), 1e-9f);
        assertEquals(Float.NEGATIVE_INFINITY, FastMath.min(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY), 1e-9f);
    }

    @Test
    public void testMinDouble() {
        assertEquals(5.0, FastMath.min(5.0, 10.0), 1e-9);
        assertEquals(5.0, FastMath.min(10.0, 5.0), 1e-9);
        assertEquals(5.0, FastMath.min(5.0, 5.0), 1e-9);
        assertEquals(-0.0, FastMath.min(0.0, -0.0), 1e-9); // min(+0.0, -0.0) == -0.0
        assertEquals(-0.0, FastMath.min(-0.0, 0.0), 1e-9);
        assertEquals(Double.NaN, FastMath.min(Double.NaN, 5.0), 1e-9); // NaN propagation
        assertEquals(Double.NaN, FastMath.min(5.0, Double.NaN), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.min(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.min(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testMaxInt() {
        assertEquals(10, FastMath.max(5, 10));
        assertEquals(10, FastMath.max(10, 5));
        assertEquals(5, FastMath.max(5, 5));
        assertEquals(Integer.MAX_VALUE, FastMath.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, FastMath.max(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testMaxLong() {
        assertEquals(10L, FastMath.max(5L, 10L));
        assertEquals(10L, FastMath.max(10L, 5L));
        assertEquals(5L, FastMath.max(5L, 5L));
        assertEquals(Long.MAX_VALUE, FastMath.max(Long.MIN_VALUE, Long.MAX_VALUE));
        assertEquals(Long.MAX_VALUE, FastMath.max(Long.MAX_VALUE, Long.MIN_VALUE));
    }

    @Test
    public void testMaxFloat() {
        assertEquals(10.0f, FastMath.max(5.0f, 10.0f), 1e-9f);
        assertEquals(10.0f, FastMath.max(10.0f, 5.0f), 1e-9f);
        assertEquals(5.0f, FastMath.max(5.0f, 5.0f), 1e-9f);
        assertEquals(+0.0f, FastMath.max(0.0f, -0.0f), 1e-9f); // max(+0.0, -0.0) == +0.0
        assertEquals(+0.0f, FastMath.max(-0.0f, 0.0f), 1e-9f);
        assertEquals(Float.NaN, FastMath.max(Float.NaN, 5.0f), 1e-9f); // NaN propagation
        assertEquals(Float.NaN, FastMath.max(5.0f, Float.NaN), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.max(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.max(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY), 1e-9f);
    }

    @Test
    public void testMaxDouble() {
        assertEquals(10.0, FastMath.max(5.0, 10.0), 1e-9);
        assertEquals(10.0, FastMath.max(10.0, 5.0), 1e-9);
        assertEquals(5.0, FastMath.max(5.0, 5.0), 1e-9);
        assertEquals(+0.0, FastMath.max(0.0, -0.0), 1e-9); // max(+0.0, -0.0) == +0.0
        assertEquals(+0.0, FastMath.max(-0.0, 0.0), 1e-9);
        assertEquals(Double.NaN, FastMath.max(Double.NaN, 5.0), 1e-9); // NaN propagation
        assertEquals(Double.NaN, FastMath.max(5.0, Double.NaN), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.max(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.max(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testHypot() {
        assertEquals(5.0, FastMath.hypot(3.0, 4.0), 1e-9);
        assertEquals(5.0, FastMath.hypot(4.0, 3.0), 1e-9);
        assertEquals(0.0, FastMath.hypot(0.0, 0.0), 1e-9);
        assertEquals(0.0, FastMath.hypot(-0.0, 0.0), 1e-9);
        assertEquals(0.0, FastMath.hypot(0.0, -0.0), 1e-9);
        assertEquals(5.0, FastMath.hypot(-3.0, 4.0), 1e-9);
        assertEquals(5.0, FastMath.hypot(3.0, -4.0), 1e-9);
        assertEquals(5.0, FastMath.hypot(-3.0, -4.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 1.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(1.0, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.NEGATIVE_INFINITY, 1.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(1.0, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9);
        assertEquals(Double.NaN, FastMath.hypot(Double.NaN, 1.0), 1e-9);
        assertEquals(Double.NaN, FastMath.hypot(1.0, Double.NaN), 1e-9);
        // Test potential overflow/underflow cases
        assertEquals(FastMath.hypot(Double.MAX_VALUE, Double.MAX_VALUE), Double.POSITIVE_INFINITY, 1e-9);
        assertEquals(Math.sqrt(2) * Double.MIN_NORMAL, FastMath.hypot(Double.MIN_NORMAL, Double.MIN_NORMAL), 1e-9);
    }


    @Test
    public void testCopySignDouble() {
        assertEquals(5.0, FastMath.copySign(5.0, 10.0), 1e-9); // Positive magnitude, positive sign
        assertEquals(-5.0, FastMath.copySign(5.0, -10.0), 1e-9); // Positive magnitude, negative sign
        assertEquals(5.0, FastMath.copySign(-5.0, 10.0), 1e-9); // Negative magnitude, positive sign
        assertEquals(-5.0, FastMath.copySign(-5.0, -10.0), 1e-9); // Negative magnitude, negative sign
        assertEquals(0.0, FastMath.copySign(0.0, 10.0), 1e-9);
        assertEquals(-0.0, FastMath.copySign(0.0, -10.0), 1e-9);
        assertEquals(0.0, FastMath.copySign(-0.0, 10.0), 1e-9);
        assertEquals(-0.0, FastMath.copySign(-0.0, -10.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.copySign(Double.POSITIVE_INFINITY, 10.0), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.copySign(Double.POSITIVE_INFINITY, -10.0), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.copySign(Double.NEGATIVE_INFINITY, 10.0), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.copySign(Double.NEGATIVE_INFINITY, -10.0), 1e-9);
        assertEquals(5.0, FastMath.copySign(5.0, Double.NaN), 1e-9); // NaN sign becomes positive
        assertEquals(Double.NaN, FastMath.copySign(Double.NaN, 10.0), 1e-9);
    }

    @Test
    public void testCopySignFloat() {
        assertEquals(5.0f, FastMath.copySign(5.0f, 10.0f), 1e-9f); // Positive magnitude, positive sign
        assertEquals(-5.0f, FastMath.copySign(5.0f, -10.0f), 1e-9f); // Positive magnitude, negative sign
        assertEquals(5.0f, FastMath.copySign(-5.0f, 10.0f), 1e-9f); // Negative magnitude, positive sign
        assertEquals(-5.0f, FastMath.copySign(-5.0f, -10.0f), 1e-9f); // Negative magnitude, negative sign
        assertEquals(0.0f, FastMath.copySign(0.0f, 10.0f), 1e-9f);
        assertEquals(-0.0f, FastMath.copySign(0.0f, -10.0f), 1e-9f);
        assertEquals(0.0f, FastMath.copySign(-0.0f, 10.0f), 1e-9f);
        assertEquals(-0.0f, FastMath.copySign(-0.0f, -10.0f), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.copySign(Float.POSITIVE_INFINITY, 10.0f), 1e-9f);
        assertEquals(Float.NEGATIVE_INFINITY, FastMath.copySign(Float.POSITIVE_INFINITY, -10.0f), 1e-9f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.copySign(Float.NEGATIVE_INFINITY, 10.0f), 1e-9f);
        assertEquals(Float.NEGATIVE_INFINITY, FastMath.copySign(Float.NEGATIVE_INFINITY, -10.0f), 1e-9f);
        assertEquals(5.0f, FastMath.copySign(5.0f, Float.NaN), 1e-9f); // NaN sign becomes positive
        assertEquals(Float.NaN, FastMath.copySign(Float.NaN, 10.0f), 1e-9f);
    }

    @Test
    public void testGetExponentDouble() {
        assertEquals(0, FastMath.getExponent(1.0));
        assertEquals(1, FastMath.getExponent(2.0));
        assertEquals(-1, FastMath.getExponent(0.5));
        assertEquals(1023, FastMath.getExponent(Double.MAX_VALUE)); // Exponent of MAX_VALUE
        assertEquals(-1022, FastMath.getExponent(Double.MIN_NORMAL)); // Exponent of smallest normal
        assertEquals(-1074, FastMath.getExponent(Double.MIN_VALUE)); // Exponent of smallest subnormal
        assertEquals(1024, FastMath.getExponent(Double.POSITIVE_INFINITY)); // Infinity exponent
        assertEquals(1024, FastMath.getExponent(Double.NaN)); // NaN exponent
    }

    @Test
    public void testGetExponentFloat() {
        assertEquals(0, FastMath.getExponent(1.0f));
        assertEquals(1, FastMath.getExponent(2.0f));
        assertEquals(-1, FastMath.getExponent(0.5f));
        assertEquals(127, FastMath.getExponent(Float.MAX_VALUE)); // Exponent of MAX_VALUE
        assertEquals(-126, FastMath.getExponent(Float.MIN_NORMAL)); // Exponent of smallest normal
        assertEquals(-149, FastMath.getExponent(Float.MIN_VALUE)); // Exponent of smallest subnormal
        assertEquals(128, FastMath.getExponent(Float.POSITIVE_INFINITY)); // Infinity exponent
        assertEquals(128, FastMath.getExponent(Float.NaN)); // NaN exponent
    }

    // Helper values
    private static final double ulpPositiveInfinity = Double.POSITIVE_INFINITY;
    private static final double ulpNaN = Double.NaN;
    private static final float ulpPositiveInfinityFloat = Float.POSITIVE_INFINITY;
    private static final float ulpNaNFloat = Float.NaN;

    // Values for nextUp testing
    private static final double nextUpPositiveInfinity = Double.POSITIVE_INFINITY;
    private static final float nextUpPositiveInfinityFloat = Float.POSITIVE_INFINITY;

}
