package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Arrays;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MathRuntimeException;

public class MathUtilsTest {
    @Test
    public void testAddAndCheckIntAtMaximum() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
    }

    @Test
    public void testAddAndCheckIntOverflow() throws Exception {
        try { MathUtils.addAndCheck(Integer.MAX_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testBinomialCoefficientBranchesAndSymmetry() throws Exception {
        assertEquals(1L, MathUtils.binomialCoefficient(0, 0));
        assertEquals(67L, MathUtils.binomialCoefficient(67, 1));
        assertEquals(1001L, MathUtils.binomialCoefficient(14, 4));
        assertEquals(1001L, MathUtils.binomialCoefficient(14, 10));
        assertEquals(7219428434016265740L, MathUtils.binomialCoefficient(66, 33));
    }

    @Test
    public void testBinomialCoefficientOverflow() throws Exception {
        try { MathUtils.binomialCoefficient(67, 33); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testBinomialCoefficientDoubleAcrossThreshold() throws Exception {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(67, 0), 0.0);
        assertEquals(1001.0, MathUtils.binomialCoefficientDouble(14, 4), 0.0);
        assertEquals(14226520737620288370.0,
                MathUtils.binomialCoefficientDouble(67, 33), 1e5);
    }

    @Test
    public void testBinomialCoefficientLogBranches() throws Exception {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), 0.0);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(10, 1), 1e-12);
        assertEquals(Math.log(1001.0), MathUtils.binomialCoefficientLog(14, 4), 1e-12);
        assertEquals(MathUtils.binomialCoefficientLog(1030, 3),
                MathUtils.binomialCoefficientLog(1030, 1027), 1e-10);
    }

    @Test
    public void testCosh() throws Exception {
        assertEquals((Math.exp(2.0) + Math.exp(-2.0)) / 2.0, MathUtils.cosh(2.0), 1e-12);
    }

    @Test
    public void testEqualsDoubles() throws Exception {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertTrue(MathUtils.equals(0.0, -0.0));
        assertFalse(MathUtils.equals(1.0, Math.nextAfter(1.0, 2.0)));
    }

    @Test
    public void testFactorialBoundary() throws Exception {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test
    public void testFactorialOutOfRange() throws Exception {
        try { MathUtils.factorial(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { MathUtils.factorial(21); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testFactorialDoubleAndLog() throws Exception {
        assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), 0.0);
        assertEquals(51090942171709440000.0, MathUtils.factorialDouble(21), 1e6);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-12);
        assertEquals(Math.log(21.0), MathUtils.factorialLog(21) -
                MathUtils.factorialLog(20), 1e-12);
    }

    @Test
    public void testGcdBranchesAndZeroCases() throws Exception {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(12, MathUtils.gcd(0, -12));
        assertEquals(6, MathUtils.gcd(54, 24));
        assertEquals(1, MathUtils.gcd(Integer.MIN_VALUE, 3));
    }

    @Test
    public void testGcdOverflowAtMinimum() throws Exception {
        try { MathUtils.gcd(Integer.MIN_VALUE, 0); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testHashDouble() throws Exception {
        assertEquals(Double.valueOf(1.5).hashCode(), MathUtils.hash(1.5));
        assertEquals(Double.valueOf(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testIndicatorByte() throws Exception {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator(Byte.MIN_VALUE));
    }

    @Test
    public void testLcmAndOverflow() throws Exception {
        assertEquals(0, MathUtils.lcm(0, 9));
        assertEquals(42, MathUtils.lcm(-6, 14));
        assertEquals(2147483646, MathUtils.lcm(2, 1073741823));
        try { MathUtils.lcm(Integer.MIN_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testLog() throws Exception {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-12);
        assertTrue(Double.isNaN(MathUtils.log(-2.0, 8.0)));
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(2.0, 0.0), 0.0);
    }

    @Test
    public void testMulAndCheckIntBoundaries() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.mulAndCheck(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, MathUtils.mulAndCheck(Integer.MIN_VALUE, 1));
        assertEquals(0, MathUtils.mulAndCheck(Integer.MIN_VALUE, 0));
        try { MathUtils.mulAndCheck(Integer.MAX_VALUE, 2); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testNextAfterSpecialAndAdjacentValues() throws Exception {
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
        assertEquals(Math.nextAfter(1.0, 2.0), MathUtils.nextAfter(1.0, 2.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 0.0);
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testScalbSpecialAndScaling() throws Exception {
        assertEquals(8.0, MathUtils.scalb(1.0, 3), 0.0);
        assertEquals(Double.MIN_VALUE, MathUtils.scalb(Double.MIN_VALUE, 0), 0.0);
        assertEquals(-7.983361238138879E292, MathUtils.scalb(1.0, -1075), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
    }

    @Test
    public void testNormalizeAngle() throws Exception {
        assertEquals(-Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-12);
        assertEquals(0.0, MathUtils.normalizeAngle(2.0 * Math.PI, 0.0), 1e-12);
        assertEquals(2.0 * Math.PI, MathUtils.normalizeAngle(0.0, Math.PI), 1e-12);
    }

    @Test
    public void testRoundDouble() throws Exception {
        assertEquals(1.24, MathUtils.round(1.235, 2), 0.0);
        assertEquals(-1.24, MathUtils.round(-1.235, 2), 0.0);
        assertEquals(2.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_HALF_UP), 0.0);
        assertEquals(1.0, MathUtils.round(1.5, 0, BigDecimal.ROUND_HALF_DOWN), 0.0);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
    }

    @Test
    public void testSignByte() throws Exception {
        assertEquals((byte) -1, MathUtils.sign(Byte.MIN_VALUE));
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign(Byte.MAX_VALUE));
    }

    @Test
    public void testSinh() throws Exception {
        assertEquals((Math.exp(1.0) - Math.exp(-1.0)) / 2.0, MathUtils.sinh(1.0), 1e-12);
        assertEquals(0.0, MathUtils.sinh(0.0), 0.0);
    }

    @Test
    public void testSubAndCheckIntBoundaries() throws Exception {
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE + 1, 1));
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE - 1, -1));
        try { MathUtils.subAndCheck(Integer.MIN_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }
}
