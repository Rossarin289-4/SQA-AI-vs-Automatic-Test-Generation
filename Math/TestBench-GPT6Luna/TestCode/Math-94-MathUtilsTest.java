package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class MathUtilsTest {
    @Test
    public void testAddAndCheckIntEdges() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE + 1, -1));
        try { MathUtils.addAndCheck(Integer.MAX_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.addAndCheck(Integer.MIN_VALUE, -1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testBinomialCoefficientBranches() throws Exception {
        assertEquals(1L, MathUtils.binomialCoefficient(0, 0));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(252L, MathUtils.binomialCoefficient(10, 5));
    }

    @Test
    public void testBinomialCoefficientInvalidInputs() throws Exception {
        try { MathUtils.binomialCoefficient(2, 3); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { MathUtils.binomialCoefficient(-1, 0); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testBinomialCoefficientDoubleAndLog() throws Exception {
        assertEquals(252.0, MathUtils.binomialCoefficientDouble(10, 5), 0.0);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(10, 1), 1e-14);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(10, 0), 0.0);
        assertEquals(Math.log(252.0), MathUtils.binomialCoefficientLog(10, 5), 1e-12);
    }

    @Test
    public void testCosh() throws Exception {
        assertEquals(1.0, MathUtils.cosh(0.0), 0.0);
        assertEquals(Math.cosh(1.0), MathUtils.cosh(1.0), 1e-15);
    }

    @Test
    public void testEqualsDouble() throws Exception {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 0.0));
        assertTrue(MathUtils.equals(-0.0, 0.0));
        assertFalse(MathUtils.equals(1.0, Math.nextAfter(1.0, 2.0)));
    }

    @Test
    public void testFactorialBranches() throws Exception {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
        assertEquals(3628800L, MathUtils.factorial(10));
        try { MathUtils.factorial(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFactorialDoubleAndLog() throws Exception {
        assertEquals(1.0, MathUtils.factorialDouble(0), 0.0);
        assertEquals(120.0, MathUtils.factorialDouble(5), 0.0);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-14);
        assertEquals(0.0, MathUtils.factorialLog(1), 0.0);
    }

    @Test
    public void testGcdBranchesAndEdges() throws Exception {
        assertEquals(6, MathUtils.gcd(54, 24));
        assertEquals(6, MathUtils.gcd(-54, 24));
        assertEquals(7, MathUtils.gcd(0, 7));
        assertEquals(Integer.MIN_VALUE, MathUtils.gcd(Integer.MIN_VALUE, 0));
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
        assertEquals((byte) 1, MathUtils.indicator(Byte.MAX_VALUE));
        assertEquals((byte) -1, MathUtils.indicator(Byte.MIN_VALUE));
    }

    @Test
    public void testLcm() throws Exception {
        assertEquals(36, MathUtils.lcm(12, 18));
        assertEquals(0, MathUtils.lcm(0, 7));
        assertEquals(12, MathUtils.lcm(-4, 6));
    }

    @Test
    public void testLog() throws Exception {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-15);
        assertTrue(Double.isNaN(MathUtils.log(-2.0, 8.0)));
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(2.0, 0.0), 0.0);
    }

    @Test
    public void testMulAndCheckIntEdges() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.mulAndCheck(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, MathUtils.mulAndCheck(Integer.MIN_VALUE, 1));
        try { MathUtils.mulAndCheck(Integer.MAX_VALUE, 2); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.mulAndCheck(Integer.MIN_VALUE, -1); fail("expected ArithmeticException"); }
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
    public void testScalb() throws Exception {
        assertEquals(12.0, MathUtils.scalb(3.0, 2), 0.0);
        assertEquals(0.0, MathUtils.scalb(0.0, 10), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     MathUtils.scalb(Double.POSITIVE_INFINITY, -1), 0.0);
        assertEquals(Double.NaN, MathUtils.scalb(Double.NaN, 2), 0.0);
    }

    @Test
    public void testNormalizeAngle() throws Exception {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 0.0);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3.0 * Math.PI, Math.PI), 1e-14);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-14);
    }

    @Test
    public void testRoundDefaultAndExplicitMode() throws Exception {
        assertEquals(1.24, MathUtils.round(1.235, 2), 0.0);
        assertEquals(1.2, MathUtils.round(1.25, 1, BigDecimal.ROUND_HALF_DOWN), 0.0);
        assertEquals(1.3, MathUtils.round(1.25, 1, BigDecimal.ROUND_HALF_UP), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
                     MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
    }

    @Test
    public void testSignByte() throws Exception {
        assertEquals((byte) -1, MathUtils.sign(Byte.MIN_VALUE));
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign(Byte.MAX_VALUE));
    }

    @Test
    public void testSinh() throws Exception {
        assertEquals(0.0, MathUtils.sinh(0.0), 0.0);
        assertEquals(Math.sinh(1.0), MathUtils.sinh(1.0), 1e-15);
    }

    @Test
    public void testSubAndCheckIntEdges() throws Exception {
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE, 0));
        try { MathUtils.subAndCheck(Integer.MAX_VALUE, -1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
        try { MathUtils.subAndCheck(Integer.MIN_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }
}
