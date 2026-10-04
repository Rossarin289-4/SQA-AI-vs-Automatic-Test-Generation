package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math; // Added import for Math class

public class FastMathTest {

    @Test
    public void testSqrt() throws Exception {
        assertEquals(FastMath.sqrt(4.0), 2.0, 1e-15);
        assertEquals(FastMath.sqrt(0.0), 0.0, 1e-15);
        assertEquals(FastMath.sqrt(Double.MAX_VALUE), Math.sqrt(Double.MAX_VALUE), 1e-15);
        assertEquals(FastMath.sqrt(Double.MIN_VALUE), Math.sqrt(Double.MIN_VALUE), 1e-15);
        assertEquals(FastMath.sqrt(1e-300), Math.sqrt(1e-300), 1e-310);
    }

    @Test
    public void testCosh() throws Exception {
        assertEquals(FastMath.cosh(0.0), 1.0, 1e-15);
        assertEquals(FastMath.cosh(1.0), Math.cosh(1.0), 1e-15);
        assertEquals(FastMath.cosh(20.0), Math.cosh(20.0), 1e-7); // Larger tolerance due to approximation
        assertEquals(FastMath.cosh(-20.0), Math.cosh(-20.0), 1e-7); // Larger tolerance due to approximation
        assertEquals(FastMath.cosh(Double.MAX_VALUE), Double.POSITIVE_INFINITY, 0);
        assertEquals(FastMath.cosh(Double.NEGATIVE_INFINITY), Double.POSITIVE_INFINITY, 0);
    }

    @Test
    public void testSinh() throws Exception {
        assertEquals(FastMath.sinh(0.0), 0.0, 1e-15);
        assertEquals(FastMath.sinh(1.0), Math.sinh(1.0), 1e-15);
        assertEquals(FastMath.sinh(20.0), Math.sinh(20.0), 1e-7); // Larger tolerance due to approximation
        assertEquals(FastMath.sinh(-20.0), Math.sinh(-20.0), 1e-7); // Larger tolerance due to approximation
        assertEquals(FastMath.sinh(Double.MAX_VALUE), Double.POSITIVE_INFINITY, 0);
        assertEquals(FastMath.sinh(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, 0);
    }

    @Test
    public void testTanh() throws Exception {
        assertEquals(FastMath.tanh(0.0), 0.0, 1e-15);
        assertEquals(FastMath.tanh(1.0), Math.tanh(1.0), 1e-15);
        assertEquals(FastMath.tanh(20.0), 1.0, 1e-15);
        assertEquals(FastMath.tanh(-20.0), -1.0, 1e-15);
        assertEquals(FastMath.tanh(Double.MAX_VALUE), 1.0, 1e-15);
        assertEquals(FastMath.tanh(Double.NEGATIVE_INFINITY), -1.0, 1e-15);
    }

    @Test
    public void testAcosh() throws Exception {
        assertEquals(FastMath.acosh(1.0), Math.acosh(1.0), 1e-15);
        assertEquals(FastMath.acosh(2.0), Math.acosh(2.0), 1e-15);
        assertEquals(FastMath.acosh(Double.MAX_VALUE), Math.acosh(Double.MAX_VALUE), 1e-15);
        assertEquals(FastMath.acosh(1.0 + Double.MIN_VALUE), Math.acosh(1.0 + Double.MIN_VALUE), 1e-15);
        assertTrue(Double.isNaN(FastMath.acosh(0.999))); // Should be NaN for input < 1
    }

    @Test
    public void testAsinh() throws Exception {
        assertEquals(FastMath.asinh(0.0), 0.0, 1e-15);
        assertEquals(FastMath.asinh(1.0), Math.asinh(1.0), 1e-15);
        assertEquals(FastMath.asinh(-1.0), Math.asinh(-1.0), 1e-15);
        assertEquals(FastMath.asinh(Double.MAX_VALUE), Math.asinh(Double.MAX_VALUE), 1e-15);
        assertEquals(FastMath.asinh(Double.MIN_VALUE), Math.asinh(Double.MIN_VALUE), 1e-15);
        assertEquals(FastMath.asinh(-Double.MIN_VALUE), Math.asinh(-Double.MIN_VALUE), 1e-15);
    }

    @Test
    public void testAtanh() throws Exception {
        assertEquals(FastMath.atanh(0.0), 0.0, 1e-15);
        assertEquals(FastMath.atanh(0.5), Math.atanh(0.5), 1e-15);
        assertEquals(FastMath.atanh(-0.5), Math.atanh(-0.5), 1e-15);
        assertEquals(FastMath.atanh(0.99), Math.atanh(0.99), 1e-15);
        assertTrue(Double.isNaN(FastMath.atanh(1.0)));
        assertTrue(Double.isNaN(FastMath.atanh(-1.0)));
    }

    @Test
    public void testSignum() throws Exception {
        assertEquals(FastMath.signum(10.0), 1.0, 1e-15);
        assertEquals(FastMath.signum(-10.0), -1.0, 1e-15);
        assertEquals(FastMath.signum(0.0), 0.0, 1e-15);
        assertEquals(FastMath.signum(-0.0), 0.0, 1e-15);
        assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testNextUp() throws Exception {
        assertEquals(FastMath.nextUp(1.0), Math.nextUp(1.0), 1e-15);
        assertEquals(FastMath.nextUp(0.0), Math.nextUp(0.0), 1e-15);
        assertEquals(FastMath.nextUp(-0.0), Math.nextUp(-0.0), 1e-15);
        assertEquals(FastMath.nextUp(Double.MAX_VALUE), Double.POSITIVE_INFINITY, 0);
        assertEquals(FastMath.nextUp(-Double.MAX_VALUE), -Double.MAX_VALUE + Double.MIN_NORMAL, 1e-15); // Approximating
    }

    @Test
    public void testExp() throws Exception {
        assertEquals(FastMath.exp(0.0), 1.0, 1e-15);
        assertEquals(FastMath.exp(1.0), Math.E, 1e-15);
        assertEquals(FastMath.exp(-1.0), 1.0 / Math.E, 1e-15);
        assertEquals(FastMath.exp(709.0), Math.exp(709.0), 1e-15);
        assertEquals(FastMath.exp(710.0), Double.POSITIVE_INFINITY, 0);
        assertEquals(FastMath.exp(-746.0), Math.exp(-746.0), 1e-15); // Subnormal output
        assertEquals(FastMath.exp(-747.0), 0.0, 1e-15);
    }

    @Test
    public void testExpm1() throws Exception {
        assertEquals(FastMath.expm1(0.0), 0.0, 1e-15);
        assertEquals(FastMath.expm1(1.0), Math.expm1(1.0), 1e-15);
        assertEquals(FastMath.expm1(-1.0), Math.expm1(-1.0), 1e-15);
        assertEquals(FastMath.expm1(0.5), Math.expm1(0.5), 1e-15);
        assertEquals(FastMath.expm1(-0.5), Math.expm1(-0.5), 1e-15);
    }

    @Test
    public void testLog() throws Exception {
        assertEquals(FastMath.log(1.0), 0.0, 1e-15);
        assertEquals(FastMath.log(Math.E), 1.0, 1e-15);
        assertEquals(FastMath.log(2.0), Math.log(2.0), 1e-15);
        assertEquals(FastMath.log(0.5), Math.log(0.5), 1e-15);
        assertEquals(FastMath.log(Double.MAX_VALUE), Math.log(Double.MAX_VALUE), 1e-15);
        assertEquals(FastMath.log(Double.MIN_NORMAL), Math.log(Double.MIN_NORMAL), 1e-15);
        assertEquals(FastMath.log(Double.MIN_VALUE), Math.log(Double.MIN_VALUE), 1e-15);
        assertEquals(FastMath.log(0.0), Double.NEGATIVE_INFINITY, 0);
        assertTrue(Double.isNaN(FastMath.log(-1.0)));
    }

    @Test
    public void testLog1p() throws Exception {
        assertEquals(FastMath.log1p(0.0), 0.0, 1e-15);
        assertEquals(FastMath.log1p(1.0), Math.log1p(1.0), 1e-15);
        assertEquals(FastMath.log1p(-0.5), Math.log1p(-0.5), 1e-15);
        assertEquals(FastMath.log1p(Double.MAX_VALUE), Math.log1p(Double.MAX_VALUE), 1e-15);
        assertEquals(FastMath.log1p(Double.MIN_VALUE), Math.log1p(Double.MIN_VALUE), 1e-15);
        assertEquals(FastMath.log1p(-1.0), Double.NEGATIVE_INFINITY, 0);
        assertEquals(FastMath.log1p(-0.0), 0.0, 1e-15);
    }

    @Test
    public void testLog10() throws Exception {
        assertEquals(FastMath.log10(1.0), 0.0, 1e-15);
        assertEquals(FastMath.log10(10.0), 1.0, 1e-15);
        assertEquals(FastMath.log10(100.0), 2.0, 1e-15);
        assertEquals(FastMath.log10(0.1), -1.0, 1e-15);
        assertEquals(FastMath.log10(Double.MAX_VALUE), Math.log10(Double.MAX_VALUE), 1e-15);
        assertEquals(FastMath.log10(Double.MIN_NORMAL), Math.log10(Double.MIN_NORMAL), 1e-15);
        assertEquals(FastMath.log10(0.0), Double.NEGATIVE_INFINITY, 0);
        assertTrue(Double.isNaN(FastMath.log10(-1.0)));
    }

    @Test
    public void testPow() throws Exception {
        assertEquals(FastMath.pow(2.0, 3.0), 8.0, 1e-15);
        assertEquals(FastMath.pow(2.0, -1.0), 0.5, 1e-15);
        assertEquals(FastMath.pow(4.0, 0.5), 2.0, 1e-15);
        assertEquals(FastMath.pow(0.0, 1.0), 0.0, 1e-15);
        assertEquals(FastMath.pow(0.0, -1.0), Double.POSITIVE_INFINITY, 0);
        assertEquals(FastMath.pow(-2.0, 3.0), -8.0, 1e-15);
        assertEquals(FastMath.pow(-2.0, 2.0), 4.0, 1e-15);
        assertEquals(FastMath.pow(-2.0, 0.5), Double.NaN, 0);
        assertEquals(FastMath.pow(Double.NaN, 1.0), Double.NaN, 0);
        assertEquals(FastMath.pow(1.0, Double.NaN), Double.NaN, 0);
        assertEquals(FastMath.pow(2.0, Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, 0);
        assertEquals(FastMath.pow(0.5, Double.POSITIVE_INFINITY), 0.0, 1e-15);
    }

    @Test
    public void testSin() throws Exception {
        assertEquals(FastMath.sin(0.0), 0.0, 1e-15);
        assertEquals(FastMath.sin(Math.PI / 2.0), 1.0, 1e-15);
        assertEquals(FastMath.sin(Math.PI), 0.0, 1e-15);
        assertEquals(FastMath.sin(3 * Math.PI / 2.0), -1.0, 1e-15);
        assertEquals(FastMath.sin(2 * Math.PI), 0.0, 1e-15);
        assertEquals(FastMath.sin(-Math.PI / 2.0), -1.0, 1e-15);
    }

    @Test
    public void testCos() throws Exception {
        assertEquals(FastMath.cos(0.0), 1.0, 1e-15);
        assertEquals(FastMath.cos(Math.PI / 2.0), 0.0, 1e-15);
        assertEquals(FastMath.cos(Math.PI), -1.0, 1e-15);
        assertEquals(FastMath.cos(3 * Math.PI / 2.0), 0.0, 1e-15);
        assertEquals(FastMath.cos(2 * Math.PI), 1.0, 1e-15);
        assertEquals(FastMath.cos(-Math.PI / 2.0), 0.0, 1e-15);
    }

    @Test
    public void testTan() throws Exception {
        assertEquals(FastMath.tan(0.0), 0.0, 1e-15);
        assertEquals(FastMath.tan(Math.PI / 4.0), 1.0, 1e-15);
        assertEquals(FastMath.tan(Math.PI), 0.0, 1e-15);
        assertEquals(FastMath.tan(3 * Math.PI / 4.0), -1.0, 1e-15);
        assertTrue(Double.isNaN(FastMath.tan(Math.PI / 2.0)));
        assertTrue(Double.isNaN(FastMath.tan(3 * Math.PI / 2.0)));
    }

    @Test
    public void testAtan() throws Exception {
        assertEquals(FastMath.atan(0.0), 0.0, 1e-15);
        assertEquals(FastMath.atan(1.0), Math.PI / 4.0, 1e-15);
        assertEquals(FastMath.atan(-1.0), -Math.PI / 4.0, 1e-15);
        assertEquals(FastMath.atan(Double.POSITIVE_INFINITY), Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.atan(Double.NEGATIVE_INFINITY), -Math.PI / 2.0, 1e-15);
    }

    @Test
    public void testAtan2() throws Exception {
        assertEquals(FastMath.atan2(1.0, 0.0), Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.atan2(-1.0, 0.0), -Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.atan2(0.0, 1.0), 0.0, 1e-15);
        assertEquals(FastMath.atan2(0.0, -1.0), Math.PI, 1e-15);
        assertEquals(FastMath.atan2(1.0, 1.0), Math.PI / 4.0, 1e-15);
        assertEquals(FastMath.atan2(-1.0, -1.0), -3.0 * Math.PI / 4.0, 1e-15);
        assertEquals(FastMath.atan2(Double.POSITIVE_INFINITY, 0.0), Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.atan2(Double.NEGATIVE_INFINITY, 0.0), -Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.atan2(1.0, Double.POSITIVE_INFINITY), 0.0, 1e-15);
        assertEquals(FastMath.atan2(1.0, Double.NEGATIVE_INFINITY), Math.PI, 1e-15);
    }

    @Test
    public void testAsin() throws Exception {
        assertEquals(FastMath.asin(0.0), 0.0, 1e-15);
        assertEquals(FastMath.asin(1.0), Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.asin(-1.0), -Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.asin(0.5), Math.asin(0.5), 1e-15);
        assertEquals(FastMath.asin(-0.5), Math.asin(-0.5), 1e-15);
        assertTrue(Double.isNaN(FastMath.asin(1.1)));
        assertTrue(Double.isNaN(FastMath.asin(-1.1)));
    }

    @Test
    public void testAcos() throws Exception {
        assertEquals(FastMath.acos(0.0), Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.acos(1.0), 0.0, 1e-15);
        assertEquals(FastMath.acos(-1.0), Math.PI, 1e-15);
        assertEquals(FastMath.acos(0.5), Math.acos(0.5), 1e-15);
        assertEquals(FastMath.acos(-0.5), Math.acos(-0.5), 1e-15);
        assertTrue(Double.isNaN(FastMath.acos(1.1)));
        assertTrue(Double.isNaN(FastMath.acos(-1.1)));
    }

    @Test
    public void testCbrt() throws Exception {
        assertEquals(FastMath.cbrt(8.0), 2.0, 1e-15);
        assertEquals(FastMath.cbrt(-8.0), -2.0, 1e-15);
        assertEquals(FastMath.cbrt(0.0), 0.0, 1e-15);
        assertEquals(FastMath.cbrt(Double.MIN_VALUE), Math.cbrt(Double.MIN_VALUE), 1e-15); // Subnormal
        assertEquals(FastMath.cbrt(Double.MAX_VALUE), Math.cbrt(Double.MAX_VALUE), 1e-15);
    }

    @Test
    public void testToRadians() throws Exception {
        assertEquals(FastMath.toRadians(180.0), Math.PI, 1e-15);
        assertEquals(FastMath.toRadians(90.0), Math.PI / 2.0, 1e-15);
        assertEquals(FastMath.toRadians(0.0), 0.0, 1e-15);
        assertEquals(FastMath.toRadians(360.0), 2.0 * Math.PI, 1e-15);
    }

    @Test
    public void testToDegrees() throws Exception {
        assertEquals(FastMath.toDegrees(Math.PI), 180.0, 1e-15);
        assertEquals(FastMath.toDegrees(Math.PI / 2.0), 90.0, 1e-15);
        assertEquals(FastMath.toDegrees(0.0), 0.0, 1e-15);
        assertEquals(FastMath.toDegrees(2.0 * Math.PI), 360.0, 1e-15);
    }

    @Test
    public void testAbsInt() throws Exception {
        assertEquals(FastMath.abs(5), 5);
        assertEquals(FastMath.abs(-5), 5);
        assertEquals(FastMath.abs(0), 0);
        assertEquals(FastMath.abs(Integer.MIN_VALUE), Integer.MIN_VALUE); // Overflow case
    }

    @Test
    public void testAbsLong() throws Exception {
        assertEquals(FastMath.abs(5L), 5L);
        assertEquals(FastMath.abs(-5L), 5L);
        assertEquals(FastMath.abs(0L), 0L);
        assertEquals(FastMath.abs(Long.MIN_VALUE), Long.MIN_VALUE); // Overflow case
    }

    @Test
    public void testAbsFloat() throws Exception {
        assertEquals(FastMath.abs(5.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.abs(-5.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.abs(0.0f), 0.0f, 1e-15f);
        assertEquals(FastMath.abs(-0.0f), 0.0f, 1e-15f);
        assertEquals(FastMath.abs(Float.MIN_VALUE), Float.MIN_VALUE, 1e-15f);
        assertEquals(FastMath.abs(-Float.MIN_VALUE), Float.MIN_VALUE, 1e-15f);
    }

    @Test
    public void testAbsDouble() throws Exception {
        assertEquals(FastMath.abs(5.0), 5.0, 1e-15);
        assertEquals(FastMath.abs(-5.0), 5.0, 1e-15);
        assertEquals(FastMath.abs(0.0), 0.0, 1e-15);
        assertEquals(FastMath.abs(-0.0), 0.0, 1e-15);
        assertEquals(FastMath.abs(Double.MIN_VALUE), Double.MIN_VALUE, 1e-15);
        assertEquals(FastMath.abs(-Double.MIN_VALUE), Double.MIN_VALUE, 1e-15);
    }

    @Test
    public void testUlp() throws Exception {
        assertEquals(FastMath.ulp(1.0), Math.ulp(1.0), 1e-15);
        assertEquals(FastMath.ulp(0.0), Math.ulp(0.0), 1e-15);
        assertEquals(FastMath.ulp(Double.MIN_VALUE), Math.ulp(Double.MIN_VALUE), 1e-15);
        assertEquals(FastMath.ulp(Double.MAX_VALUE), Math.ulp(Double.MAX_VALUE), 1e-15);
    }

    @Test
    public void testNextAfter() throws Exception {
        assertEquals(FastMath.nextAfter(1.0, 2.0), Math.nextAfter(1.0, 2.0), 1e-15);
        assertEquals(FastMath.nextAfter(1.0, 0.0), Math.nextAfter(1.0, 0.0), 1e-15);
        assertEquals(FastMath.nextAfter(0.0, 1.0), Math.nextAfter(0.0, 1.0), 1e-15);
        assertEquals(FastMath.nextAfter(0.0, -1.0), Math.nextAfter(0.0, -1.0), 1e-15);
        assertEquals(FastMath.nextAfter(-0.0, 1.0), Math.nextAfter(-0.0, 1.0), 1e-15);
        assertEquals(FastMath.nextAfter(-0.0, -1.0), Math.nextAfter(-0.0, -1.0), 1e-15);
        assertEquals(FastMath.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, 0);
        assertEquals(FastMath.nextAfter(Double.MIN_VALUE, 0.0), Double.MIN_VALUE - Double.MIN_VALUE/2, 1e-300); // Approximation
    }

    @Test
    public void testFloor() throws Exception {
        assertEquals(FastMath.floor(3.7), 3.0, 1e-15);
        assertEquals(FastMath.floor(-3.7), -4.0, 1e-15);
        assertEquals(FastMath.floor(3.0), 3.0, 1e-15);
        assertEquals(FastMath.floor(-3.0), -3.0, 1e-15);
        assertEquals(FastMath.floor(Double.MAX_VALUE), Double.MAX_VALUE, 0);
        assertEquals(FastMath.floor(Double.MIN_VALUE), 0.0, 1e-15);
        assertEquals(FastMath.floor(-Double.MIN_VALUE), -1.0, 1e-15);
    }

    @Test
    public void testCeil() throws Exception {
        assertEquals(FastMath.ceil(3.7), 4.0, 1e-15);
        assertEquals(FastMath.ceil(-3.7), -3.0, 1e-15);
        assertEquals(FastMath.ceil(3.0), 3.0, 1e-15);
        assertEquals(FastMath.ceil(-3.0), -3.0, 1e-15);
        assertEquals(FastMath.ceil(Double.MAX_VALUE), Double.MAX_VALUE, 0);
        assertEquals(FastMath.ceil(Double.MIN_VALUE), Double.MIN_VALUE, 1e-15);
        assertEquals(FastMath.ceil(-Double.MIN_VALUE), 0.0, 1e-15);
    }

    @Test
    public void testRint() throws Exception {
        assertEquals(FastMath.rint(3.7), 4.0, 1e-15);
        assertEquals(FastMath.rint(-3.7), -4.0, 1e-15);
        assertEquals(FastMath.rint(3.2), 3.0, 1e-15);
        assertEquals(FastMath.rint(-3.2), -3.0, 1e-15);
        assertEquals(FastMath.rint(3.5), 4.0, 1e-15); // Round half to even
        assertEquals(FastMath.rint(4.5), 4.0, 1e-15); // Round half to even
        assertEquals(FastMath.rint(-3.5), -4.0, 1e-15); // Round half to even
        assertEquals(FastMath.rint(-4.5), -4.0, 1e-15); // Round half to even
    }

    @Test
    public void testRoundDouble() throws Exception {
        assertEquals(FastMath.round(3.7), 4L, 0);
        assertEquals(FastMath.round(-3.7), -4L, 0);
        assertEquals(FastMath.round(3.2), 3L, 0);
        assertEquals(FastMath.round(-3.2), -3L, 0);
        assertEquals(FastMath.round(3.5), 4L, 0);
        assertEquals(FastMath.round(Long.MAX_VALUE - 0.1), Long.MAX_VALUE, 0);
        assertEquals(FastMath.round(Long.MIN_VALUE + 0.1), Long.MIN_VALUE, 0);
    }

    @Test
    public void testMinInt() throws Exception {
        assertEquals(FastMath.min(5, 10), 5);
        assertEquals(FastMath.min(10, 5), 5);
        assertEquals(FastMath.min(5, 5), 5);
        assertEquals(FastMath.min(Integer.MIN_VALUE, 5), Integer.MIN_VALUE);
        assertEquals(FastMath.min(Integer.MAX_VALUE, 5), 5);
    }

    @Test
    public void testMinLong() throws Exception {
        assertEquals(FastMath.min(5L, 10L), 5L);
        assertEquals(FastMath.min(10L, 5L), 5L);
        assertEquals(FastMath.min(5L, 5L), 5L);
        assertEquals(FastMath.min(Long.MIN_VALUE, 5L), Long.MIN_VALUE);
        assertEquals(FastMath.min(Long.MAX_VALUE, 5L), 5L);
    }

    @Test
    public void testMinFloat() throws Exception {
        assertEquals(FastMath.min(5.0f, 10.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.min(10.0f, 5.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.min(5.0f, 5.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.min(Float.NaN, 5.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.min(5.0f, Float.NaN), 5.0f, 1e-15f);
        assertEquals(FastMath.min(Float.POSITIVE_INFINITY, 5.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.min(Float.NEGATIVE_INFINITY, 5.0f), Float.NEGATIVE_INFINITY, 1e-15f);
    }

    @Test
    public void testMinDouble() throws Exception {
        assertEquals(FastMath.min(5.0, 10.0), 5.0, 1e-15);
        assertEquals(FastMath.min(10.0, 5.0), 5.0, 1e-15);
        assertEquals(FastMath.min(5.0, 5.0), 5.0, 1e-15);
        assertEquals(FastMath.min(Double.NaN, 5.0), 5.0, 1e-15);
        assertEquals(FastMath.min(5.0, Double.NaN), 5.0, 1e-15);
        assertEquals(FastMath.min(Double.POSITIVE_INFINITY, 5.0), 5.0, 1e-15);
        assertEquals(FastMath.min(Double.NEGATIVE_INFINITY, 5.0), Double.NEGATIVE_INFINITY, 1e-15);
    }

    @Test
    public void testMaxInt() throws Exception {
        assertEquals(FastMath.max(5, 10), 10);
        assertEquals(FastMath.max(10, 5), 10);
        assertEquals(FastMath.max(5, 5), 5);
        assertEquals(FastMath.max(Integer.MIN_VALUE, 5), 5);
        assertEquals(FastMath.max(Integer.MAX_VALUE, 5), Integer.MAX_VALUE);
    }

    @Test
    public void testMaxLong() throws Exception {
        assertEquals(FastMath.max(5L, 10L), 10L);
        assertEquals(FastMath.max(10L, 5L), 10L);
        assertEquals(FastMath.max(5L, 5L), 5L);
        assertEquals(FastMath.max(Long.MIN_VALUE, 5L), 5L);
        assertEquals(FastMath.max(Long.MAX_VALUE, 5L), Long.MAX_VALUE);
    }

    @Test
    public void testMaxFloat() throws Exception {
        assertEquals(FastMath.max(5.0f, 10.0f), 10.0f, 1e-15f);
        assertEquals(FastMath.max(10.0f, 5.0f), 10.0f, 1e-15f);
        assertEquals(FastMath.max(5.0f, 5.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.max(Float.NaN, 5.0f), 5.0f, 1e-15f);
        assertEquals(FastMath.max(5.0f, Float.NaN), 5.0f, 1e-15f);
        assertEquals(FastMath.max(Float.POSITIVE_INFINITY, 5.0f), Float.POSITIVE_INFINITY, 1e-15f);
        assertEquals(FastMath.max(Float.NEGATIVE_INFINITY, 5.0f), 5.0f, 1e-15f);
    }

    @Test
    public void testMaxDouble() throws Exception {
        assertEquals(FastMath.max(5.0, 10.0), 10.0, 1e-15);
        assertEquals(FastMath.max(10.0, 5.0), 10.0, 1e-15);
        assertEquals(FastMath.max(5.0, 5.0), 5.0, 1e-15);
        assertEquals(FastMath.max(Double.NaN, 5.0), 5.0, 1e-15);
        assertEquals(FastMath.max(5.0, Double.NaN), 5.0, 1e-15);
        assertEquals(FastMath.max(Double.POSITIVE_INFINITY, 5.0), Double.POSITIVE_INFINITY, 1e-15);
        assertEquals(FastMath.max(Double.NEGATIVE_INFINITY, 5.0), 5.0, 1e-15);
    }
}
