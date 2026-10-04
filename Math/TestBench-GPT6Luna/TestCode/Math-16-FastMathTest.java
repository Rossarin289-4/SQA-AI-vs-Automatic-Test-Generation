package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class FastMathTest {
    @Test
    public void testHyperbolicFunctions() throws Exception {
        assertEquals(1.0, FastMath.cosh(0.0), 0.0);
        assertEquals(0.0, FastMath.sinh(0.0), 0.0);
        assertEquals(0.0, FastMath.tanh(0.0), 0.0);
        assertEquals(-1.0, FastMath.tanh(-21.0), 0.0);
    }

    @Test
    public void testInverseHyperbolicFunctions() throws Exception {
        assertEquals(0.0, FastMath.asinh(0.0), 0.0);
        assertEquals(0.0, FastMath.atanh(0.0), 0.0);
        assertEquals(0.0, FastMath.acosh(1.0), 0.0);
    }

    @Test
    public void testSignumPreservesSignedZero() throws Exception {
        assertEquals(Double.doubleToRawLongBits(-0.0),
                     Double.doubleToRawLongBits(FastMath.signum(-0.0)));
        assertEquals(-1.0, FastMath.signum(-2.0), 0.0);
        assertEquals(1.0, FastMath.signum(2.0), 0.0);
    }

    @Test
    public void testNextUpFromZero() throws Exception {
        assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextUp(Double.MAX_VALUE), 0.0);
    }

    @Test
    public void testExponentialEdges() throws Exception {
        assertEquals(1.0, FastMath.exp(0.0), 0.0);
        assertEquals(0.0, FastMath.expm1(0.0), 0.0);
        assertEquals(0.0, FastMath.exp(Double.NEGATIVE_INFINITY), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testLogarithmSpecialValues() throws Exception {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        assertTrue(Double.isNaN(FastMath.log(-1.0)));
        assertEquals(0.0, FastMath.log(1.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
    }

    @Test
    public void testLogarithmBaseAndDecimal() throws Exception {
        assertEquals(3.0, FastMath.log(2.0, 8.0), 1e-14);
        assertEquals(2.0, FastMath.log10(100.0), 1e-14);
    }

    @Test
    public void testPowerSpecialCases() throws Exception {
        assertEquals(1.0, FastMath.pow(0.0, 0.0), 0.0);
        assertEquals(-8.0, FastMath.pow(-2.0, 3.0), 1e-14);
        assertTrue(Double.isNaN(FastMath.pow(-2.0, 0.5)));
        assertEquals(8.0, FastMath.pow(2.0, 3), 0.0);
    }

    @Test
    public void testTrigonometricZerosAndPeriod() throws Exception {
        assertEquals(0.0, FastMath.sin(0.0), 0.0);
        assertEquals(1.0, FastMath.cos(0.0), 0.0);
        assertEquals(0.0, FastMath.tan(0.0), 0.0);
        assertEquals(0.0, FastMath.sin(FastMath.PI), 1e-15);
    }

    @Test
    public void testInverseTrigonometricEndpoints() throws Exception {
        assertEquals(Math.PI / 2.0, FastMath.asin(1.0), 0.0);
        assertEquals(Math.PI, FastMath.acos(-1.0), 0.0);
        assertTrue(Double.isNaN(FastMath.asin(1.1)));
        assertEquals(Math.PI / 2.0, FastMath.atan(Double.POSITIVE_INFINITY), 1e-15);
    }

    @Test
    public void testAtan2QuadrantsAndSignedZero() throws Exception {
        assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), 0.0);
        assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), 0.0);
        assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), 1e-15);
    }

    @Test
    public void testCubicRoot() throws Exception {
        assertEquals(-2.0, FastMath.cbrt(-8.0), 1e-14);
        assertEquals(0.0, FastMath.cbrt(0.0), 0.0);
    }

    @Test
    public void testAngleConversions() throws Exception {
        assertEquals(Math.PI, FastMath.toRadians(180.0), 1e-15);
        assertEquals(180.0, FastMath.toDegrees(Math.PI), 1e-12);
        assertEquals(Double.NEGATIVE_INFINITY,
                     FastMath.toRadians(Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testIntegerAbsoluteValueBoundaries() throws Exception {
        assertEquals(Integer.MAX_VALUE, FastMath.abs(Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, FastMath.abs(Integer.MIN_VALUE));
        assertEquals(7, FastMath.abs(-7));
    }

    @Test
    public void testUlpAtOneAndInfinity() throws Exception {
        assertEquals(Math.ulp(1.0), FastMath.ulp(1.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testScaleByPowerOfTwoAtRangeBoundary() throws Exception {
        assertEquals(2.0, FastMath.scalb(1.0, 1), 0.0);
        assertEquals(Double.MIN_VALUE, FastMath.scalb(1.0, -1074), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 2098), 0.0);
    }

    @Test
    public void testNextAfterEdges() throws Exception {
        assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);
        assertEquals(Double.MAX_VALUE,
                     FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     FastMath.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testFloorCeilRintAndRound() throws Exception {
        assertEquals(-2.0, FastMath.floor(-1.5), 0.0);
        assertEquals(-1.0, FastMath.ceil(-1.5), 0.0);
        assertEquals(2.0, FastMath.rint(2.5), 0.0);
        assertEquals(2L, FastMath.round(1.5));
    }

    @Test
    public void testIntegerMinMaxBoundaries() throws Exception {
        assertEquals(Integer.MIN_VALUE, FastMath.min(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, FastMath.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testHypotenuseScalingAndSpecialValues() throws Exception {
        assertEquals(5.0, FastMath.hypot(3.0, 4.0), 1e-14);
        assertEquals(Double.POSITIVE_INFINITY,
                     FastMath.hypot(Double.POSITIVE_INFINITY, Double.NaN), 0.0);
        assertTrue(Double.isNaN(FastMath.hypot(1.0, Double.NaN)));
    }

    @Test
    public void testIeeeRemainderTiesAndZero() throws Exception {
        assertEquals(-2.0, FastMath.IEEEremainder(6.0, 4.0), 0.0);
        assertEquals(2.0, FastMath.IEEEremainder(10.0, 4.0), 0.0);
        assertTrue(Double.isNaN(FastMath.IEEEremainder(Double.NEGATIVE_INFINITY, 2.0)));
    }

    @Test
    public void testCopySignAndExponent() throws Exception {
        assertEquals(-3.0, FastMath.copySign(3.0, -1.0), 0.0);
        assertEquals(3.0, FastMath.copySign(-3.0, 1.0), 0.0);
        assertEquals(0, FastMath.getExponent(1.0));
        assertEquals(1024, FastMath.getExponent(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testRandomRange() throws Exception {
        double value = FastMath.random();
        assertTrue(value >= 0.0);
        assertTrue(value < 1.0);
    }
}
