package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class FastMathTest {
    @Test
    public void testSqrt() throws Exception {
        assertEquals(3.0, FastMath.sqrt(9.0), 0.0);
    }

    @Test
    public void testHyperbolicFunctions() throws Exception {
        assertEquals(1.0, FastMath.cosh(0.0), 1e-15);
        assertEquals(0.0, FastMath.sinh(0.0), 0.0);
        assertEquals(0.0, FastMath.tanh(0.0), 0.0);
        assertEquals(-1.0, FastMath.tanh(-21.0), 0.0);
        assertEquals(1.0, FastMath.tanh(21.0), 0.0);
    }

    @Test
    public void testInverseHyperbolicFunctions() throws Exception {
        assertEquals(0.0, FastMath.asinh(0.0), 0.0);
        assertEquals(0.0, FastMath.atanh(0.0), 0.0);
        assertEquals(0.0, FastMath.acosh(1.0), 1e-15);
    }

    @Test
    public void testSignum() throws Exception {
        assertEquals(-1.0, FastMath.signum(-2.0), 0.0);
        assertEquals(0.0, FastMath.signum(-0.0), 0.0);
        assertEquals(1.0, FastMath.signum(2.0), 0.0);
        assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testNextUpAndNextAfter() throws Exception {
        assertEquals(Math.nextUp(1.0), FastMath.nextUp(1.0), 0.0);
        assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);
        assertEquals(Math.nextDown(1.0), FastMath.nextAfter(1.0, 0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     FastMath.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testExp() throws Exception {
        assertEquals(1.0, FastMath.exp(0.0), 0.0);
        assertEquals(Math.E, FastMath.exp(1.0), 1e-14);
        assertEquals(0.0, FastMath.exp(-1000.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(710.0), 0.0);
    }

    @Test
    public void testExpm1() throws Exception {
        assertEquals(0.0, FastMath.expm1(0.0), 0.0);
        assertEquals(Math.expm1(0.5), FastMath.expm1(0.5), 1e-14);
        assertEquals(Math.expm1(-0.5), FastMath.expm1(-0.5), 1e-14);
    }

    @Test
    public void testLogarithms() throws Exception {
        assertEquals(0.0, FastMath.log(1.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        assertTrue(Double.isNaN(FastMath.log(-1.0)));
        assertEquals(Math.log(2.0), FastMath.log(2.0), 1e-14);
        assertEquals(Math.log1p(1e-8), FastMath.log1p(1e-8), 1e-15);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
        assertEquals(2.0, FastMath.log10(100.0), 1e-14);
    }

    @Test
    public void testPow() throws Exception {
        assertEquals(1.0, FastMath.pow(0.0, 0.0), 0.0);
        assertEquals(-8.0, FastMath.pow(-2.0, 3.0), 1e-14);
        assertTrue(Double.isNaN(FastMath.pow(-2.0, 0.5)));
        assertEquals(Double.NEGATIVE_INFINITY,
                     FastMath.pow(-0.0, -3.0), 0.0);
        assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testTrigonometricFunctions() throws Exception {
        assertEquals(0.0, FastMath.sin(0.0), 0.0);
        assertEquals(-0.0, FastMath.sin(-0.0), 0.0);
        assertEquals(1.0, FastMath.cos(0.0), 1e-15);
        assertEquals(0.0, FastMath.tan(0.0), 0.0);
        assertEquals(1.0, FastMath.sin(Math.PI / 2.0), 1e-15);
        assertEquals(-1.0, FastMath.cos(Math.PI), 1e-15);
        assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testAtanAndAtan2() throws Exception {
        assertEquals(0.0, FastMath.atan(0.0), 0.0);
        assertEquals(Math.PI / 2.0, FastMath.atan(Double.POSITIVE_INFINITY), 1e-15);
        assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), 1e-15);
        assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), 1e-15);
        assertEquals(Math.PI / 4.0, FastMath.atan2(1.0, 1.0), 1e-15);
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
    }

    @Test
    public void testAsinAndAcos() throws Exception {
        assertEquals(Math.PI / 2.0, FastMath.asin(1.0), 0.0);
        assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), 0.0);
        assertTrue(Double.isNaN(FastMath.asin(1.01)));
        assertEquals(0.0, FastMath.acos(1.0), 0.0);
        assertEquals(Math.PI, FastMath.acos(-1.0), 0.0);
        assertEquals(Math.PI / 2.0, FastMath.acos(0.0), 0.0);
    }

    @Test
    public void testCbrt() throws Exception {
        assertEquals(2.0, FastMath.cbrt(8.0), 1e-14);
        assertEquals(-2.0, FastMath.cbrt(-8.0), 1e-14);
        assertEquals(Double.MIN_VALUE == 0.0 ? 0.0 : FastMath.cbrt(0.0), 0.0, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testAngleConversions() throws Exception {
        assertEquals(Math.PI, FastMath.toRadians(180.0), 1e-14);
        assertEquals(180.0, FastMath.toDegrees(Math.PI), 1e-12);
        assertEquals(0.0, FastMath.toRadians(0.0), 0.0);
        assertEquals(0.0, FastMath.toDegrees(0.0), 0.0);
    }

    @Test
    public void testAbsAndUlp() throws Exception {
        assertEquals(7, FastMath.abs(-7));
        assertEquals(Integer.MIN_VALUE, FastMath.abs(Integer.MIN_VALUE));
        assertEquals(Math.ulp(1.0), FastMath.ulp(1.0), 0.0);
        assertEquals(Double.MIN_VALUE, FastMath.ulp(0.0), 0.0);
    }

    @Test
    public void testFloorCeilAndRint() throws Exception {
        assertEquals(-2.0, FastMath.floor(-1.2), 0.0);
        assertEquals(-1.0, FastMath.ceil(-1.2), 0.0);
        assertEquals(2.0, FastMath.rint(2.5), 0.0);
        assertEquals(4.0, FastMath.rint(3.5), 0.0);
        assertEquals(-0.0, FastMath.floor(-0.0), 0.0);
        assertEquals(4503599627370496.0, FastMath.floor(4503599627370496.0), 0.0);
    }

    @Test
    public void testRound() throws Exception {
        assertEquals(2L, FastMath.round(1.5));
        assertEquals(-1L, FastMath.round(-1.5));
        assertEquals(Long.MAX_VALUE, FastMath.round(Double.POSITIVE_INFINITY));
        assertEquals(Integer.MAX_VALUE, FastMath.round(Float.POSITIVE_INFINITY));
    }

    @Test
    public void testMinMax() throws Exception {
        assertEquals(Integer.MIN_VALUE, FastMath.min(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, FastMath.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(4, FastMath.min(4, 4));
        assertEquals(4, FastMath.max(4, 4));
    }
}
