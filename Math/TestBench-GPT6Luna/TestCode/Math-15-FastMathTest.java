package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class FastMathTest {
    @Test
    public void testHyperbolicFunctionsAtZero() throws Exception {
        assertEquals(1.0, FastMath.cosh(0.0), 0.0);
        assertEquals(0.0, FastMath.sinh(0.0), 0.0);
        assertEquals(0.0, FastMath.tanh(0.0), 0.0);
    }

    @Test
    public void testHyperbolicLargeMagnitudeBranches() throws Exception {
        assertEquals(1.0, FastMath.tanh(21.0), 0.0);
        assertEquals(-1.0, FastMath.tanh(-21.0), 0.0);
        assertEquals(FastMath.cosh(21.0), FastMath.cosh(-21.0), 0.0);
        assertEquals(-FastMath.sinh(21.0), FastMath.sinh(-21.0), 0.0);
    }

    @Test
    public void testInverseHyperbolicFunctions() throws Exception {
        assertEquals(0.0, FastMath.asinh(0.0), 0.0);
        assertEquals(0.0, FastMath.atanh(0.0), 0.0);
        assertEquals(0.0, FastMath.acosh(1.0), 0.0);
        assertEquals(FastMath.asinh(0.5), -FastMath.asinh(-0.5), 1e-14);
        assertEquals(FastMath.atanh(0.5), -FastMath.atanh(-0.5), 1e-14);
    }

    @Test
    public void testSignumPreservesZeroAndNan() throws Exception {
        assertEquals(-1.0, FastMath.signum(-2.0), 0.0);
        assertEquals(1.0, FastMath.signum(2.0), 0.0);
        assertEquals(Double.doubleToRawLongBits(-0.0),
                     Double.doubleToRawLongBits(FastMath.signum(-0.0)));
        assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testNextUpAndNextAfter() throws Exception {
        assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), 0.0);
        assertEquals(Math.nextUp(1.0), FastMath.nextAfter(1.0, 2.0), 0.0);
        assertEquals(Math.nextDown(1.0), FastMath.nextAfter(1.0, 0.0), 0.0);
        assertEquals(-Double.MAX_VALUE,
                     FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.0), 0.0);
    }

    @Test
    public void testExponentialAndLogarithmicSpecialCases() throws Exception {
        assertEquals(1.0, FastMath.exp(0.0), 0.0);
        assertEquals(0.0, FastMath.expm1(0.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log10(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testLogarithmAndExponentialValues() throws Exception {
        assertEquals(Math.E, FastMath.exp(1.0), 1e-14);
        assertEquals(1.0, FastMath.log(Math.E), 1e-14);
        assertEquals(2.0, FastMath.log10(100.0), 1e-14);
        assertEquals(StrictMath.log1p(1e-7), FastMath.log1p(1e-7), 1e-14);
    }

    @Test
    public void testPowSpecialCases() throws Exception {
        assertEquals(1.0, FastMath.pow(0.0, 0.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), 0.0);
        assertEquals(-0.0, FastMath.pow(-0.0, 3.0), 0.0);
        assertTrue(Double.isNaN(FastMath.pow(-2.0, 0.5)));
        assertEquals(8.0, FastMath.pow(2.0, 3.0), 0.0);
    }

    @Test
    public void testTrigonometricZeroAndInfinity() throws Exception {
        assertEquals(0.0, FastMath.sin(0.0), 0.0);
        assertEquals(1.0, FastMath.cos(0.0), 0.0);
        assertEquals(0.0, FastMath.tan(0.0), 0.0);
        assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testTrigonometricQuadrants() throws Exception {
        assertEquals(1.0, FastMath.sin(Math.PI / 2.0), 1e-15);
        assertEquals(-1.0, FastMath.sin(-Math.PI / 2.0), 1e-15);
        assertEquals(-1.0, FastMath.cos(Math.PI), 1e-15);
        assertEquals(-1.0, FastMath.cos(-Math.PI), 1e-15);
        assertEquals(1.0, FastMath.tan(Math.PI / 4.0), 1e-14);
    }

    @Test
    public void testAtanAndAtan2Axes() throws Exception {
        assertEquals(0.0, FastMath.atan(0.0), 0.0);
        assertEquals(Math.PI / 2.0, FastMath.atan(Double.POSITIVE_INFINITY), 0.0);
        assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), 0.0);
        assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), 0.0);
        assertEquals(Math.PI / 4.0, FastMath.atan2(1.0, 1.0), 1e-15);
    }

    @Test
    public void testAsinAndAcosEndpoints() throws Exception {
        assertEquals(Math.PI / 2.0, FastMath.asin(1.0), 0.0);
        assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), 0.0);
        assertEquals(Math.PI, FastMath.acos(-1.0), 0.0);
        assertEquals(0.0, FastMath.acos(1.0), 0.0);
        assertTrue(Double.isNaN(FastMath.asin(1.1)));
        assertTrue(Double.isNaN(FastMath.acos(-1.1)));
    }

    @Test
    public void testCbrtPositiveNegativeAndZero() throws Exception {
        assertEquals(2.0, FastMath.cbrt(8.0), 1e-14);
        assertEquals(-2.0, FastMath.cbrt(-8.0), 1e-14);
        assertEquals(-0.0, FastMath.cbrt(-0.0), 0.0);
        assertEquals(3.0, FastMath.cbrt(27.0), 1e-14);
    }

    @Test
    public void testDegreeRadianConversions() throws Exception {
        assertEquals(Math.PI, FastMath.toRadians(180.0), 1e-15);
        assertEquals(180.0, FastMath.toDegrees(Math.PI), 1e-12);
        assertEquals(-0.0, FastMath.toRadians(-0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     FastMath.toDegrees(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testIntegerAbsoluteValueAndRounding() throws Exception {
        assertEquals(7, FastMath.abs(-7));
        assertEquals(Integer.MIN_VALUE, FastMath.abs(Integer.MIN_VALUE));
        assertEquals(2.0, FastMath.floor(2.9), 0.0);
        assertEquals(-3.0, FastMath.floor(-2.1), 0.0);
        assertEquals(-2.0, FastMath.ceil(-2.1), 0.0);
        assertEquals(-2L, FastMath.round(-2.5));
        assertEquals(2.0, FastMath.rint(2.5), 0.0);
        assertEquals(4.0, FastMath.rint(3.5), 0.0);
    }

    @Test
    public void testUlpAtPowersAndInfinity() throws Exception {
        assertEquals(Math.ulp(1.0), FastMath.ulp(1.0), 0.0);
        assertEquals(Double.MIN_VALUE, FastMath.ulp(0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     FastMath.ulp(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testScalbNormalAndUnderflowEdges() throws Exception {
        assertEquals(8.0, FastMath.scalb(1.0, 3), 0.0);
        assertEquals(Double.MIN_VALUE, FastMath.scalb(1.0, -1074), 0.0);
        assertEquals(0.0, FastMath.scalb(1.0, -2099), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 2098), 0.0);
    }

    @Test
    public void testFloorCeilAndRoundAtHalfValues() throws Exception {
        assertEquals(-0.0, FastMath.floor(-0.0), 0.0);
        assertEquals(-0.0, FastMath.ceil(-0.2), 0.0);
        assertEquals(3L, FastMath.round(2.5));
        assertEquals(-2L, FastMath.round(-2.5));
    }

    @Test
    public void testMinMaxAndSignedZero() throws Exception {
        assertEquals(-4, FastMath.min(3, -4));
        assertEquals(4, FastMath.max(3, 4));
        assertEquals(Double.doubleToRawLongBits(-0.0),
                     Double.doubleToRawLongBits(FastMath.min(0.0, -0.0)));
        assertEquals(Double.doubleToRawLongBits(0.0),
                     Double.doubleToRawLongBits(FastMath.max(-0.0, 0.0)));
    }

    @Test
    public void testHypotAvoidsOverflowAndUnderflow() throws Exception {
        assertEquals(5.0, FastMath.hypot(3.0, 4.0), 1e-15);
        assertEquals(Double.MAX_VALUE, FastMath.hypot(Double.MAX_VALUE, 1.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     FastMath.hypot(Double.POSITIVE_INFINITY, Double.NaN), 0.0);
    }

    @Test
    public void testIeeeRemainderTiesAndSpecialInputs() throws Exception {
        assertEquals(-1.0, FastMath.IEEEremainder(3.0, 2.0), 0.0);
        assertEquals(Double.NaN, FastMath.IEEEremainder(1.0, 0.0), 0.0);
        assertEquals(1.0, FastMath.IEEEremainder(1.0, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testCopySignAndExponent() throws Exception {
        assertEquals(-3.0, FastMath.copySign(3.0, -1.0), 0.0);
        assertEquals(3.0, FastMath.copySign(-3.0, 1.0), 0.0);
        assertEquals(0, FastMath.getExponent(1.0));
        assertEquals(1024, FastMath.getExponent(Double.POSITIVE_INFINITY));
        assertEquals(-1023, FastMath.getExponent(Double.MIN_VALUE));
    }
}
