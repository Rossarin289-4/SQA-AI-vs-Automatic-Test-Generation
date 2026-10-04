package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.util.Localizable;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.exception.NonMonotonousSequenceException;

public class MathUtilsTest {
    @Test
    public void testAddAndCheckIntEdges() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        try { MathUtils.addAndCheck(Integer.MAX_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testBinomialCoefficientBranches() throws Exception {
        assertEquals(1L, MathUtils.binomialCoefficient(10, 0));
        assertEquals(10L, MathUtils.binomialCoefficient(10, 1));
        assertEquals(252L, MathUtils.binomialCoefficient(10, 5));
        assertEquals(155117520L, MathUtils.binomialCoefficient(30, 15));
    }

    @Test
    public void testBinomialCoefficientOverflowAndPrecondition() throws Exception {
        assertEquals(7219428434016265740L, MathUtils.binomialCoefficient(66, 33));
        try { MathUtils.binomialCoefficient(67, 33); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.binomialCoefficient(2, 3); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testBinomialCoefficientDouble() throws Exception {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(100, 0), 0.0);
        assertEquals(100.0, MathUtils.binomialCoefficientDouble(100, 1), 0.0);
        assertEquals(1.008913445455642e29, MathUtils.binomialCoefficientDouble(100, 50), 1e15);
    }

    @Test
    public void testBinomialCoefficientLog() throws Exception {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(8, 0), 0.0);
        assertEquals(Math.log(8), MathUtils.binomialCoefficientLog(8, 1), 1e-14);
        assertEquals(Math.log(28), MathUtils.binomialCoefficientLog(8, 2), 1e-14);
        assertTrue(MathUtils.binomialCoefficientLog(1030, 515) > 700.0);
    }

    @Test
    public void testCompareToTolerance() throws Exception {
        assertEquals(0, MathUtils.compareTo(1.0, 1.0 + 1e-8, 1e-8));
        assertEquals(-1, MathUtils.compareTo(1.0, 1.1, 0.01));
        assertEquals(1, MathUtils.compareTo(1.1, 1.0, 0.01));
    }

    @Test
    public void testEqualsDoubleSpecialValues() throws Exception {
        assertTrue(MathUtils.equals(1.0, Math.nextUp(1.0)));
        assertTrue(MathUtils.equals(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
        assertFalse(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN));
    }

    @Test
    public void testFactorialLongBoundary() throws Exception {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
        try { MathUtils.factorial(21); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.factorial(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFactorialDoubleAndLog() throws Exception {
        assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), 0.0);
        assertEquals(51090942171709440000.0, MathUtils.factorialDouble(21), 1e6);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-14);
        assertEquals(0.0, MathUtils.factorialLog(0), 0.0);
    }

    @Test
    public void testGcdInt() throws Exception {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(12, MathUtils.gcd(-36, 60));
        assertEquals(Integer.MAX_VALUE, MathUtils.gcd(0, Integer.MAX_VALUE));
        try { MathUtils.gcd(Integer.MIN_VALUE, 0); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testHashDouble() throws Exception {
        assertEquals(Double.valueOf(2.5).hashCode(), MathUtils.hash(2.5));
        assertEquals(Double.valueOf(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testIndicatorByte() throws Exception {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator(Byte.MIN_VALUE));
    }

    @Test
    public void testLcmInt() throws Exception {
        assertEquals(0, MathUtils.lcm(0, 9));
        assertEquals(42, MathUtils.lcm(-6, 21));
        assertEquals(2147483646, MathUtils.lcm(1073741823, 2));
        try { MathUtils.lcm(Integer.MIN_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testLogBaseAndSpecialArguments() throws Exception {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-14);
        assertEquals(0.0, MathUtils.log(0.0, 8.0), 0.0);
        assertTrue(Double.isNaN(MathUtils.log(0.0, 0.0)));
    }

    @Test
    public void testMultiplyIntEdges() throws Exception {
        assertEquals(2147441940, MathUtils.mulAndCheck(46341, 46340));
        assertEquals(Integer.MIN_VALUE, MathUtils.mulAndCheck(Integer.MIN_VALUE, 1));
        try { MathUtils.mulAndCheck(46341, 46341); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testScalb() throws Exception {
        assertEquals(12.0, MathUtils.scalb(3.0, 2), 0.0);
        assertEquals(-3.0, MathUtils.scalb(-12.0, -2), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 2), 0.0);
    }

    @Test
    public void testNormalizeAngle() throws Exception {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-14);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3.0 * Math.PI, Math.PI), 1e-14);
        assertTrue(MathUtils.normalizeAngle(-7.0, 0.0) >= -Math.PI);
    }

    @Test
    public void testNormalizeArrayValuesAndNaN() throws Exception {
        double[] result = MathUtils.normalizeArray(new double[] { 1.0, 2.0, Double.NaN }, 6.0);
        assertEquals(2.0, result[0], 1e-14);
        assertEquals(4.0, result[1], 1e-14);
        assertTrue(Double.isNaN(result[2]));
    }

    @Test
    public void testNormalizeArrayErrors() throws Exception {
        try { MathUtils.normalizeArray(new double[] { 1.0, Double.POSITIVE_INFINITY }, 1.0); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.normalizeArray(new double[] { 1.0, -1.0 }, 1.0); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.normalizeArray(new double[] { 1.0 }, Double.NaN); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRoundDoubleModes() throws Exception {
        assertEquals(1.3, MathUtils.round(1.25, 1), 0.0);
        assertEquals(1.2, MathUtils.round(1.25, 1, BigDecimal.ROUND_HALF_EVEN), 0.0);
        assertEquals(-1.3, MathUtils.round(-1.21, 1, BigDecimal.ROUND_UP), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
    }

    @Test
    public void testSignByte() throws Exception {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign(Byte.MAX_VALUE));
        assertEquals((byte) -1, MathUtils.sign(Byte.MIN_VALUE));
    }

    @Test
    public void testSinhCosh() throws Exception {
        assertEquals(1.0, MathUtils.sinh(0.881373587019543), 1e-14);
        assertEquals(1.0, MathUtils.cosh(0.0), 0.0);
    }

    @Test
    public void testSubtractIntEdges() throws Exception {
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE + 1, 1));
        try { MathUtils.subAndCheck(Integer.MIN_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testPowIntForms() throws Exception {
        assertEquals(1, MathUtils.pow(7, 0));
        assertEquals(1024, MathUtils.pow(2, 10));
        assertEquals(-8, MathUtils.pow(-2, 3L));
        try { MathUtils.pow(2, -1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDistances() throws Exception {
        assertEquals(7.0, MathUtils.distance1(new double[] { 1, 2 }, new double[] { 4, -2 }), 0.0);
        assertEquals(5.0, MathUtils.distance(new double[] { 0, 0 }, new double[] { 3, 4 }), 1e-14);
        assertEquals(4.0, MathUtils.distanceInf(new double[] { 1, 2 }, new double[] { 4, -2 }), 0.0);
    }

    @Test
    public void testCheckOrderDirectionsAndStrictness() throws Exception {
        MathUtils.checkOrder(new double[] { 1, 1, 2 }, MathUtils.OrderDirection.INCREASING, false);
        MathUtils.checkOrder(new double[] { 3, 2, 1 }, MathUtils.OrderDirection.DECREASING, true);
        try {
            MathUtils.checkOrder(new double[] { 1, 1 }, MathUtils.OrderDirection.INCREASING, true);
            fail("expected NonMonotonousSequenceException");
        } catch (NonMonotonousSequenceException expected) {
            assertEquals(1, expected.getIndex());
        }
    }

    @Test
    public void testSafeNormMagnitudeRanges() throws Exception {
        assertEquals(5.0, MathUtils.safeNorm(new double[] { 3.0, 4.0 }), 1e-14);
        assertEquals(0.0, MathUtils.safeNorm(new double[] { 0.0, 0.0 }), 0.0);
        assertEquals(1e200, MathUtils.safeNorm(new double[] { 1e200, 0.0 }), 1e186);
    }
}
