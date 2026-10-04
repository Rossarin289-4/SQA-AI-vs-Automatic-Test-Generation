package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class MathUtilsTest {
    @Test
    public void testAddAndCheckIntAtBounds() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        try { MathUtils.addAndCheck(Integer.MAX_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE + 1, -1));
        try { MathUtils.addAndCheck(Integer.MIN_VALUE, -1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testBinomialCoefficientBoundaryAndInvalidInputs() throws Exception {
        assertEquals(1L, MathUtils.binomialCoefficient(0, 0));
        assertEquals(66L, MathUtils.binomialCoefficient(66, 1));
        try { MathUtils.binomialCoefficient(2, 3); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { MathUtils.binomialCoefficient(-1, 0); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testBinomialCoefficientDoubleBranches() throws Exception {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), 0.0);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 0.0);
        assertEquals(66.0, MathUtils.binomialCoefficientDouble(66, 1), 0.0);
    }

    @Test
    public void testBinomialCoefficientLogBranches() throws Exception {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(4, 0), 0.0);
        assertEquals(Math.log(7.0), MathUtils.binomialCoefficientLog(7, 1), 0.0);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-14);
    }

    @Test
    public void testCoshPositiveAndNegative() throws Exception {
        assertEquals((Math.exp(1.0) + Math.exp(-1.0)) / 2.0, MathUtils.cosh(1.0), 1e-14);
        assertEquals(MathUtils.cosh(1.0), MathUtils.cosh(-1.0), 0.0);
    }

    @Test
    public void testEqualsScalarNaNAndSignedZero() throws Exception {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertTrue(MathUtils.equals(0.0, -0.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testFactorialRangeEdges() throws Exception {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
        try { MathUtils.factorial(21); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.factorial(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFactorialDoubleAtCacheAndBeyond() throws Exception {
        assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), 0.0);
        assertEquals(Math.floor(Math.exp(MathUtils.factorialLog(21)) + 0.5),
                     MathUtils.factorialDouble(21), 0.0);
    }

    @Test
    public void testFactorialLogCases() throws Exception {
        assertEquals(0.0, MathUtils.factorialLog(0), 0.0);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 0.0);
        try { MathUtils.factorialLog(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGcdSignsAndZero() throws Exception {
        assertEquals(6, MathUtils.gcd(54, -24));
        assertEquals(7, MathUtils.gcd(0, -7));
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test
    public void testHashMatchesJdkDoubleHash() throws Exception {
        assertEquals(Double.valueOf(1.5).hashCode(), MathUtils.hash(1.5));
        assertEquals(Double.valueOf(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testIndicatorByteSignsAndZero() throws Exception {
        assertEquals((byte)-1, MathUtils.indicator((byte)-1));
        assertEquals((byte)1, MathUtils.indicator((byte)0));
        assertEquals((byte)1, MathUtils.indicator((byte)1));
    }

    @Test
    public void testLcmAndZero() throws Exception {
        assertEquals(24, MathUtils.lcm(6, 8));
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(24, MathUtils.lcm(-6, 8));
    }

    @Test
    public void testLogBaseAndSpecialValues() throws Exception {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-14);
        assertTrue(Double.isNaN(MathUtils.log(0.0, 0.0)));
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(2.0, 0.0), 0.0);
    }

    @Test
    public void testMulAndCheckIntAtBounds() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.mulAndCheck(Integer.MAX_VALUE, 1));
        try { MathUtils.mulAndCheck(Integer.MAX_VALUE, 2); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        assertEquals(Integer.MIN_VALUE, MathUtils.mulAndCheck(Integer.MIN_VALUE, 1));
        try { MathUtils.mulAndCheck(Integer.MIN_VALUE, -1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testNextAfterSpecialValuesAndDirection() throws Exception {
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
        assertEquals(Math.nextUp(1.0), MathUtils.nextAfter(1.0, 2.0), 0.0);
        assertEquals(Math.nextDown(1.0), MathUtils.nextAfter(1.0, 0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     MathUtils.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
    }

    @Test
    public void testScalbFiniteAndSpecialValues() throws Exception {
        assertEquals(8.0, MathUtils.scalb(2.0, 2), 0.0);
        assertEquals(0.0, MathUtils.scalb(0.0, 10), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     MathUtils.scalb(Double.POSITIVE_INFINITY, 1), 0.0);
    }

    @Test
    public void testNormalizeAngleAroundCenter() throws Exception {
        assertEquals(-Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 0.0);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0), 0.0);
        assertEquals(0.5, MathUtils.normalizeAngle(0.5 + 4.0 * Math.PI, 0.0), 1e-14);
    }

    @Test
    public void testRoundHalfUpPositiveAndNegative() throws Exception {
        assertEquals(1.3, MathUtils.round(1.25, 1), 0.0);
        assertEquals(-1.3, MathUtils.round(-1.25, 1), 0.0);
        assertEquals(2.0, MathUtils.round(1.5, 0), 0.0);
    }

    @Test
    public void testSignByteThreeCases() throws Exception {
        assertEquals((byte)-1, MathUtils.sign((byte)-3));
        assertEquals((byte)0, MathUtils.sign((byte)0));
        assertEquals((byte)1, MathUtils.sign((byte)3));
    }

    @Test
    public void testSinhOddSymmetry() throws Exception {
        assertEquals((Math.exp(1.0) - Math.exp(-1.0)) / 2.0, MathUtils.sinh(1.0), 1e-14);
        assertEquals(-MathUtils.sinh(1.0), MathUtils.sinh(-1.0), 0.0);
    }

    @Test
    public void testSubAndCheckIntAtBounds() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE, 0));
        try { MathUtils.subAndCheck(Integer.MAX_VALUE, -1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE, 0));
        try { MathUtils.subAndCheck(Integer.MIN_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }
}
