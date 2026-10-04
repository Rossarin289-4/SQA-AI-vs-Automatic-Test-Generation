package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import org.apache.commons.math.MathRuntimeException;

public class MathUtilsTest {
    @Test
    public void testCheckedIntAdditionBoundaries() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        try { MathUtils.addAndCheck(Integer.MAX_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE + 1, -1));
        try { MathUtils.addAndCheck(Integer.MIN_VALUE, -1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testBinomialCoefficientBranches() throws Exception {
        assertEquals(1L, MathUtils.binomialCoefficient(0, 0));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(252L, MathUtils.binomialCoefficient(10, 5));
    }

    @Test
    public void testBinomialCoefficientOverflowBoundary() throws Exception {
        assertEquals(7219428434016265740L, MathUtils.binomialCoefficient(66, 33));
        try { MathUtils.binomialCoefficient(67, 33); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testBinomialDoubleLargeAndSymmetry() throws Exception {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(100, 0), 0.0);
        assertEquals(3921225.0, MathUtils.binomialCoefficientDouble(100, 4), 0.0);
        assertEquals(MathUtils.binomialCoefficientDouble(100, 4),
                     MathUtils.binomialCoefficientDouble(100, 96), 0.0);
    }

    @Test
    public void testBinomialLogBranches() throws Exception {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(8, 0), 0.0);
        assertEquals(Math.log(8.0), MathUtils.binomialCoefficientLog(8, 1), 0.0);
        assertEquals(Math.log(120.0), MathUtils.binomialCoefficientLog(10, 3), 1e-14);
    }

    @Test
    public void testCompareToToleranceAndOrder() throws Exception {
        assertEquals(-1, MathUtils.compareTo(1.0, 1.05, 0.05));
        assertEquals(-1, MathUtils.compareTo(1.0, 2.0, 0.1));
        assertEquals(1, MathUtils.compareTo(2.0, 1.0, 0.1));
    }

    @Test
    public void testDoubleEqualitySpecialValues() throws Exception {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equals(0.0, -0.0));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
    }

    @Test
    public void testFactorialLongLimit() throws Exception {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
        try { MathUtils.factorial(21); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testFactorialDoubleAndLog() throws Exception {
        assertEquals(1.0, MathUtils.factorialDouble(0), 0.0);
        assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), 0.0);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-14);
    }

    @Test
    public void testGcdZeroAndNegativeValues() throws Exception {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(12, MathUtils.gcd(-36, 24));
        assertEquals(7, MathUtils.gcd(0, -7));
    }

    @Test
    public void testGcdMinimumOverflow() throws Exception {
        try { MathUtils.gcd(Integer.MIN_VALUE, 0); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testHashDoubleSemantics() throws Exception {
        assertEquals(Double.valueOf(1.5).hashCode(), MathUtils.hash(1.5));
        assertEquals(Double.valueOf(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testByteIndicatorBoundaries() throws Exception {
        assertEquals((byte) -1, MathUtils.indicator(Byte.MIN_VALUE));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) 1, MathUtils.indicator(Byte.MAX_VALUE));
    }

    @Test
    public void testLcmAndOverflow() throws Exception {
        assertEquals(0, MathUtils.lcm(0, 7));
        assertEquals(42, MathUtils.lcm(-6, 14));
        try { MathUtils.lcm(Integer.MIN_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testLogAndHyperbolicFunctions() throws Exception {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-14);
        assertEquals(Math.cosh(1.0), MathUtils.cosh(1.0), 1e-14);
        assertEquals(Math.sinh(1.0), MathUtils.sinh(1.0), 1e-14);
    }

    @Test
    public void testCheckedIntMultiplicationBoundaries() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.mulAndCheck(Integer.MAX_VALUE, 1));
        try { MathUtils.mulAndCheck(Integer.MAX_VALUE, 2); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        assertEquals(Integer.MIN_VALUE, MathUtils.mulAndCheck(Integer.MIN_VALUE, 1));
        try { MathUtils.mulAndCheck(Integer.MIN_VALUE, -1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testNextAfterRepresentableNeighbors() throws Exception {
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
        assertEquals(Math.nextUp(1.0), MathUtils.nextAfter(1.0, 2.0), 0.0);
        assertEquals(Math.nextDown(1.0), MathUtils.nextAfter(1.0, 0.0), 0.0);
    }

    @Test
    public void testScalbNormalAndSpecialValues() throws Exception {
        assertEquals(8.0, MathUtils.scalb(2.0, 2), 0.0);
        assertEquals(0.0, MathUtils.scalb(0.0, 10), 0.0);
        assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 2)));
    }

    @Test
    public void testNormalizeAngleAcrossPeriod() throws Exception {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 0.0);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(3.0 * Math.PI, 0.0), 1e-14);
        assertEquals(0.0, MathUtils.normalizeAngle(2.0 * Math.PI, 0.0), 1e-14);
    }

    @Test
    public void testNormalizeArrayConfiguredValues() throws Exception {
        double[] result = MathUtils.normalizeArray(new double[] { 1.0, 2.0, Double.NaN }, 6.0);
        assertEquals(2.0, result[0], 0.0);
        assertEquals(4.0, result[1], 0.0);
        assertTrue(Double.isNaN(result[2]));
    }

    @Test
    public void testNormalizeArrayRejectsZeroSum() throws Exception {
        try { MathUtils.normalizeArray(new double[] { 1.0, -1.0 }, 2.0); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testDoubleRoundingModesAndSpecialValues() throws Exception {
        assertEquals(2.0, MathUtils.round(1.5, 0), 0.0);
        assertEquals(2.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_HALF_EVEN), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 0), 0.0);
    }

    @Test
    public void testSignAndCheckedSubtraction() throws Exception {
        assertEquals((byte) -1, MathUtils.sign((byte) -4));
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE, 0));
        try { MathUtils.subAndCheck(Integer.MIN_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testIntegerPowerBranches() throws Exception {
        assertEquals(1, MathUtils.pow(7, 0));
        assertEquals(1024, MathUtils.pow(2, 10));
        assertEquals(-8, MathUtils.pow(-2, 3));
        try { MathUtils.pow(2, -1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDistancesAcrossDimensions() throws Exception {
        assertEquals(7.0, MathUtils.distance1(new double[] { 1, 2 }, new double[] { 4, 6 }), 0.0);
        assertEquals(5.0, MathUtils.distance(new double[] { 1, 2 }, new double[] { 4, 6 }), 0.0);
        assertEquals(4.0, MathUtils.distanceInf(new double[] { 1, 2 }, new double[] { 4, 6 }), 0.0);
    }
}
