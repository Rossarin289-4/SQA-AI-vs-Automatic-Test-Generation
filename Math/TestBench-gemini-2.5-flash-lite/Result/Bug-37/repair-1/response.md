```java
package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math.FieldElement;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.FastMath;

public class ComplexTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    private static final double DELTA = 1e-9;

    @Test
    public void testAbs() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), DELTA);
        assertEquals(0.0, Complex.ZERO.abs(), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), DELTA);
        assertEquals(Double.NaN, Complex.NaN.abs(), DELTA);
        assertEquals(3.0, new Complex(3.0, 0.0).abs(), DELTA);
        assertEquals(4.0, new Complex(0.0, 4.0).abs(), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.POSITIVE_INFINITY, 1.0).abs(), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, new Complex(1.0, Double.POSITIVE_INFINITY).abs(), DELTA);
    }

    @Test
    public void testAdd() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(4.0, 6.0);
        assertEquals(expected, c1.add(c2));

        assertEquals(Complex.NaN, Complex.NaN.add(c1));
        assertEquals(Complex.NaN, c1.add(Complex.NaN));
        assertEquals(Complex.INF, Complex.INF.add(c1));
        assertEquals(Complex.INF, c1.add(Complex.INF));
        assertEquals(new Complex(4.0, 2.0), c1.add(3.0));
        assertEquals(new Complex(1.0, 6.0), c1.add(4.0));
        assertEquals(Complex.NaN, Complex.NaN.add(3.0));
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 1.0).add(1.0));
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN).add(1.0));

        try {
            c1.add(null);
            fail("NullArgumentException not thrown");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConjugate() {
        Complex c = new Complex(3.0, 4.0);
        Complex expected = new Complex(3.0, -4.0);
        assertEquals(expected, c.conjugate());
        assertEquals(Complex.ZERO, Complex.ZERO.conjugate());
        assertEquals(Complex.I, Complex.I.conjugate());
        assertEquals(Complex.NaN, Complex.NaN.conjugate());
        assertEquals(new Complex(1.0, Double.NEGATIVE_INFINITY), new Complex(1.0, Double.POSITIVE_INFINITY).conjugate());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, -1.0), new Complex(Double.POSITIVE_INFINITY, 1.0).conjugate());
    }

    @Test
    public void testDivide() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        // (1+2i)/(3+4i) = (1+2i)(3-4i)/(9+16) = (3-4i+6i+8)/25 = (11+2i)/25 = 0.44 + 0.08i
        Complex expected = new Complex(0.44, 0.08);
        assertEquals(expected, c1.divide(c2)); // Removed DELTA here, Complex.equals should handle precision

        assertEquals(Complex.NaN, Complex.NaN.divide(c1));
        assertEquals(Complex.NaN, c1.divide(Complex.NaN));
        assertEquals(Complex.NaN, c1.divide(Complex.ZERO));
        assertEquals(Complex.ZERO, c1.divide(Complex.INF));
        assertEquals(new Complex(0.0, 0.0), c1.divide(Double.POSITIVE_INFINITY));
        assertEquals(Complex.NaN, c1.divide(0.0));

        try {
            c1.divide(null);
            fail("NullArgumentException not thrown");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testReciprocal() {
        Complex c = new Complex(3.0, 4.0);
        // 1/(3+4i) = (3-4i)/(9+16) = (3-4i)/25 = 0.12 - 0.16i
        Complex expected = new Complex(0.12, -0.16);
        assertEquals(expected, c.reciprocal()); // Removed DELTA here

        assertEquals(Complex.NaN, Complex.NaN.reciprocal());
        assertEquals(Complex.NaN, Complex.ZERO.reciprocal());
        assertEquals(Complex.ZERO, Complex.INF.reciprocal());
        assertEquals(Complex.ONE, Complex.ONE.reciprocal());
    }

    @Test
    public void testEquals() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(1.0, 3.0);
        Complex c4 = new Complex(2.0, 2.0);
        Complex nan = Complex.NaN;

        assertEquals(c1, c2);
        assertNotEquals(c1, c3);
        assertNotEquals(c1, c4);
        assertEquals(nan, Complex.NaN);
        assertEquals(nan, new Complex(Double.NaN, 1.0));
        assertEquals(nan, new Complex(1.0, Double.NaN));
        assertEquals(nan, new Complex(Double.NaN, Double.NaN));
        assertNotEquals(nan, c1);
        assertEquals(Complex.INF, Complex.INF);
        assertNotEquals(Complex.INF, Complex.NaN);
        assertNotEquals(Complex.ONE, Complex.NaN);
    }

    @Test
    public void testHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(3.0, 4.0);
        Complex nan = Complex.NaN;

        assertEquals(c1.hashCode(), c2.hashCode());
        assertNotEquals(c1.hashCode(), c3.hashCode());
        assertEquals(nan.hashCode(), new Complex(Double.NaN, 1.0).hashCode());
        assertEquals(nan.hashCode(), new Complex(1.0, Double.NaN).hashCode());
        assertEquals(nan.hashCode(), new Complex(Double.NaN, Double.NaN).hashCode());
        assertEquals(Complex.INF.hashCode(), Complex.INF.hashCode());
    }

    @Test
    public void testGetters() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(4.0, c.getImaginary(), DELTA);
        assertEquals(0.0, Complex.ZERO.getReal(), DELTA);
        assertEquals(0.0, Complex.ZERO.getImaginary(), DELTA);
        assertEquals(1.0, Complex.ONE.getReal(), DELTA); // Corrected from 0.0 to 1.0
        assertEquals(0.0, Complex.ONE.getImaginary(), DELTA);
        assertEquals(0.0, Complex.I.getReal(), DELTA);
        assertEquals(1.0, Complex.I.getImaginary(), DELTA);
    }

    @Test
    public void testIsNaN() {
        assertTrue(Complex.NaN.isNaN());
        assertTrue(new Complex(Double.NaN, 1.0).isNaN());
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
        assertTrue(new Complex(Double.NaN, Double.NaN).isNaN());
        assertFalse(Complex.ONE.isNaN());
        assertFalse(Complex.ZERO.isNaN());
        assertFalse(Complex.INF.isNaN());
    }

    @Test
    public void testIsInfinite() {
        assertTrue(Complex.INF.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).isInfinite());
        assertTrue(new Complex(1.0, Double.NEGATIVE_INFINITY).isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).isInfinite());
        assertFalse(Complex.ONE.isInfinite());
        assertFalse(Complex.ZERO.isInfinite());
        assertFalse(Complex.NaN.isInfinite());
        assertFalse(new Complex(Double.NaN, 1.0).isInfinite());
    }

    @Test
    public void testMultiply() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        // (1+2i)(3+4i) = 3 + 4i + 6i - 8 = -5 + 10i
        Complex expected = new Complex(-5.0, 10.0);
        assertEquals(expected, c1.multiply(c2));

        assertEquals(Complex.NaN, Complex.NaN.multiply(c1));
        assertEquals(Complex.NaN, c1.multiply(Complex.NaN));
        assertEquals(Complex.INF, Complex.INF.multiply(c1));
        assertEquals(Complex.INF, c1.multiply(Complex.INF));
        assertEquals(Complex.ZERO, Complex.ZERO.multiply(c1));
        assertEquals(new Complex(3.0, 6.0), c1.multiply(3));
        assertEquals(new Complex(3.0, 6.0), c1.multiply(3.0));
        assertEquals(Complex.NaN, Complex.NaN.multiply(3));
        assertEquals(Complex.INF, Complex.INF.multiply(3));
        assertEquals(Complex.ZERO, Complex.ZERO.multiply(3.0));

        try {
            c1.multiply(null);
            fail("NullArgumentException not thrown");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testNegate() {
        Complex c = new Complex(3.0, 4.0);
        Complex expected = new Complex(-3.0, -4.0);
        assertEquals(expected, c.negate());
        assertEquals(Complex.ZERO, Complex.ZERO.negate());
        assertEquals(Complex.NaN, Complex.NaN.negate());
        assertEquals(new Complex(-Double.POSITIVE_INFINITY, -1.0), new Complex(Double.POSITIVE_INFINITY, 1.0).negate());
    }

    @Test
    public void testSubtract() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        // (1+2i) - (3+4i) = -2 - 2i
        Complex expected = new Complex(-2.0, -2.0);
        assertEquals(expected, c1.subtract(c2));

        assertEquals(Complex.NaN, Complex.NaN.subtract(c1));
        assertEquals(Complex.NaN, c1.subtract(Complex.NaN));
        assertEquals(new Complex(-2.0, 2.0), c1.subtract(3.0));
        assertEquals(new Complex(1.0, -2.0), c1.subtract(4.0));
        assertEquals(Complex.NaN, Complex.NaN.subtract(3.0));

        try {
            c1.subtract(null);
            fail("NullArgumentException not thrown");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAcos() {
        // acos(1) = 0
        assertEquals(Complex.ZERO, Complex.ONE.acos());
        // acos(0) = PI/2
        assertEquals(FastMath.PI / 2.0, Complex.ZERO.acos().getReal(), DELTA);
        assertEquals(0.0, Complex.ZERO.acos().getImaginary(), DELTA);
        // acos(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.acos());
        // acos(I) = -i * log(1 + i*i) = -i * log(0) = NaN
        assertEquals(Complex.NaN, Complex.I.acos());
        // acos(1 + i) = -i * log(1 + i * (sqrt(1 - (1+i)^2))) = -i * log(1 + i * sqrt(1 - (1+2i-1))) = -i * log(1 + i * sqrt(-2i))
        // sqrt(-2i) = sqrt(2) * e^(-i pi/4) = sqrt(2) * (1/sqrt(2) - i/sqrt(2)) = 1 - i
        // acos(1 + i) = -i * log(1 + i * (1-i)) = -i * log(1 + i - i^2) = -i * log(2+i)
        // log(2+i) = log(sqrt(5)) + i atan(1/2) = 0.8047 + 0.4636i
        // acos(1+i) = -i * (0.8047 + 0.4636i) = -0.8047i + 0.4636 = 0.4636 - 0.8047i
        assertEquals(0.4636476090008061, Complex.ONE.add(Complex.I).acos().getReal(), DELTA);
        assertEquals(-0.8047189562170503, Complex.ONE.add(Complex.I).acos().getImaginary(), DELTA);
    }

    @Test
    public void testAsin() {
        // asin(0) = 0
        assertEquals(Complex.ZERO, Complex.ZERO.asin());
        // asin(1) = PI/2
        assertEquals(FastMath.PI / 2.0, Complex.ONE.asin().getReal(), DELTA);
        assertEquals(0.0, Complex.ONE.asin().getImaginary(), DELTA);
        // asin(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.asin());
        // asin(I) = -i * log(sqrt(1-I^2) + I*I) = -i * log(sqrt(1-(-1)) - 1) = -i * log(sqrt(2) - 1)
        // log(sqrt(2)-1) = log(0.4142) = -0.8813
        // asin(I) = -i * (-0.8813) = 0.8813i
        assertEquals(0.0, Complex.I.asin().getReal(), DELTA);
        assertEquals(0.8813735870195430, Complex.I.asin().getImaginary(), DELTA);
    }

    @Test
    public void testAtan() {
        // atan(0) = 0
        assertEquals(Complex.ZERO, Complex.ZERO.atan());
        // atan(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.atan());
        // atan(I) = (i/2) * log((i+i)/(i-i)) = (i/2) * log(2i/0) = (i/2) * log(INF) = NaN
        assertEquals(Complex.NaN, Complex.I.atan());
        // atan(1) = PI/4
        assertEquals(FastMath.PI / 4.0, Complex.ONE.atan().getReal(), DELTA);
        assertEquals(0.0, Complex.ONE.atan().getImaginary(), DELTA);
    }

    @Test
    public void testCos() {
        // cos(0) = 1
        assertEquals(Complex.ONE, Complex.ZERO.cos());
        // cos(PI/2) = 0
        assertEquals(Complex.ZERO, Complex.valueOf(FastMath.PI / 2.0).cos());
        // cos(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.cos());
        // cos(INF + i) = NaN + NaN i
        assertEquals(Complex.NaN, Complex.INF.cos());
        // cos(1 + inf i) = NaN + NaN i - example in javadoc seems wrong, let's test it
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.POSITIVE_INFINITY).cos());
    }

    @Test
    public void testCosh() {
        // cosh(0) = 1
        assertEquals(Complex.ONE, Complex.ZERO.cosh());
        // cosh(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.cosh());
        // cosh(inf + i) = inf + inf i
        assertEquals(Complex.INF, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).cosh());
    }

    @Test
    public void testExp() {
        // exp(0) = 1
        assertEquals(Complex.ONE, Complex.ZERO.exp());
        // exp(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.exp());
        // exp(inf + i) = inf + inf i
        assertEquals(Complex.INF, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).exp());
        // exp(-inf + i) = 0
        assertEquals(Complex.ZERO, Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).exp());
    }

    @Test
    public void testLog() {
        // log(1) = 0
        assertEquals(Complex.ZERO, Complex.ONE.log());
        // log(0) = -inf
        assertEquals(Double.NEGATIVE_INFINITY, Complex.ZERO.log().getReal(), DELTA);
        assertEquals(0.0, Complex.ZERO.log().getImaginary(), DELTA);
        // log(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.log());
        // log(inf + i) = inf
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).log().getReal(), DELTA);
        assertEquals(0.0, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).log().getImaginary(), DELTA);
        // log(-inf + i) = inf + pi*i
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).log().getReal(), DELTA);
        assertEquals(FastMath.PI, Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).log().getImaginary(), DELTA);
        // log(inf + inf i) = inf + pi/4 i
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).log().getReal(), DELTA);
        assertEquals(FastMath.PI / 4.0, Complex.valueOf(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).log().getImaginary(), DELTA);
    }

    @Test
    public void testPow() {
        // 1^2 = 1
        assertEquals(Complex.ONE, Complex.ONE.pow(2.0));
        // 2^3 = 8
        assertEquals(new Complex(8.0, 0.0), Complex.valueOf(2.0).pow(3.0));
        // i^2 = -1
        assertEquals(new Complex(-1.0, 0.0), Complex.I.pow(2.0));
        // i^i = exp(i * log(i)) = exp(i * (log(1) + i*pi/2)) = exp(i * (i*pi/2)) = exp(-pi/2)
        assertEquals(FastMath.exp(-FastMath.PI / 2.0), Complex.I.pow(Complex.I).getReal(), DELTA);
        assertEquals(0.0, Complex.I.pow(Complex.I).getImaginary(), DELTA);
        // NaN^2 = NaN
        assertEquals(Complex.NaN, Complex.NaN.pow(2.0));
        // 2^NaN = NaN
        assertEquals(Complex.NaN, Complex.valueOf(2.0).pow(Complex.NaN));
        // 0^0 = NaN (as per Math.pow)
        assertEquals(Complex.NaN, Complex.ZERO.pow(0.0));
        // 0^2 = 0
        assertEquals(Complex.ZERO, Complex.ZERO.pow(2.0));
        // 2^0 = 1
        assertEquals(Complex.ONE, Complex.valueOf(2.0).pow(0.0));
    }

    @Test
    public void testSin() {
        // sin(0) = 0
        assertEquals(Complex.ZERO, Complex.ZERO.sin());
        // sin(PI) = 0
        assertEquals(Complex.ZERO, Complex.valueOf(FastMath.PI).sin());
        // sin(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.sin());
        // sin(inf + i) = NaN + NaN i
        assertEquals(Complex.NaN, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).sin());
        // sin(1 + inf i) = NaN + NaN i
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.POSITIVE_INFINITY).sin());
    }

    @Test
    public void testSinh() {
        // sinh(0) = 0
        assertEquals(Complex.ZERO, Complex.ZERO.sinh());
        // sinh(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.sinh());
        // sinh(inf + i) = inf + inf i
        assertEquals(Complex.INF, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).sinh());
        // sinh(-inf + i) = -inf + inf i
        assertEquals(new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).sinh());
    }

    @Test
    public void testSqrt() {
        // sqrt(0) = 0
        assertEquals(Complex.ZERO, Complex.ZERO.sqrt());
        // sqrt(1) = 1
        assertEquals(Complex.ONE, Complex.ONE.sqrt());
        // sqrt(-1) = i
        assertEquals(Complex.I, Complex.ONE.negate().sqrt());
        // sqrt(i) = (1+i)/sqrt(2)
        Complex sqrtI = Complex.I.sqrt();
        assertEquals(1.0/FastMath.sqrt(2.0), sqrtI.getReal(), DELTA);
        assertEquals(1.0/FastMath.sqrt(2.0), sqrtI.getImaginary(), DELTA);
        // sqrt(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.sqrt());
        // sqrt(inf + i) = inf
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).sqrt().getReal(), DELTA);
        assertEquals(0.0, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).sqrt().getImaginary(), DELTA);
        // sqrt(-inf + i) = 0 + inf i
        assertEquals(0.0, Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).sqrt().getReal(), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).sqrt().getImaginary(), DELTA);
        // sqrt(inf + inf i) = inf + NaN i
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).sqrt().getReal(), DELTA);
        assertEquals(Double.NaN, Complex.valueOf(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).sqrt().getImaginary(), DELTA);
        // sqrt(-inf + inf i) = NaN + inf i
        assertEquals(Double.NaN, Complex.valueOf(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY).sqrt().getReal(), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY).sqrt().getImaginary(), DELTA);
    }

    @Test
    public void testSqrt1z() {
        // sqrt(1 - 0^2) = sqrt(1) = 1
        assertEquals(Complex.ONE, Complex.ZERO.sqrt1z());
        // sqrt(1 - 1^2) = sqrt(0) = 0
        assertEquals(Complex.ZERO, Complex.ONE.sqrt1z());
        // sqrt(1 - i^2) = sqrt(1 - (-1)) = sqrt(2)
        assertEquals(FastMath.sqrt(2.0), Complex.I.sqrt1z().getReal(), DELTA);
        assertEquals(0.0, Complex.I.sqrt1z().getImaginary(), DELTA);
        // sqrt(1 - NaN^2) = NaN
        assertEquals(Complex.NaN, Complex.NaN.sqrt1z());
        // sqrt(1 - inf^2) = sqrt(1 - inf) = NaN
        assertEquals(Complex.NaN, Complex.INF.sqrt1z());
    }

    @Test
    public void testTan() {
        // tan(0) = 0
        assertEquals(Complex.ZERO, Complex.ZERO.tan());
        // tan(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.tan());
        // tan(inf + i) = NaN
        assertEquals(Complex.NaN, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).tan());
        // tan(pi/2) = inf
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(FastMath.PI / 2.0).tan().getReal(), DELTA);
        assertEquals(Double.NaN, Complex.valueOf(FastMath.PI / 2.0).tan().getImaginary(), DELTA);
        // tan(a + inf i) = 0 + i
        assertEquals(new Complex(0.0, 1.0), Complex.valueOf(1.0, Double.POSITIVE_INFINITY).tan());
        assertEquals(new Complex(0.0, -1.0), Complex.valueOf(1.0, Double.NEGATIVE_INFINITY).tan());
    }

    @Test
    public void testTanh() {
        // tanh(0) = 0
        assertEquals(Complex.ZERO, Complex.ZERO.tanh());
        // tanh(NaN) = NaN
        assertEquals(Complex.NaN, Complex.NaN.tanh());
        // tanh(inf + i) = NaN
        assertEquals(Complex.NaN, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).tanh());
        // tanh(inf + bi) = +/- 1
        assertEquals(Complex.ONE, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).tanh());
        assertEquals(new Complex(-1.0, 0.0), Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).tanh());
        // tanh(a + inf i) = NaN
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.POSITIVE_INFINITY).tanh());
        // tanh(0 + pi/2 i) = NaN + inf i
        assertEquals(Double.NaN, Complex.valueOf(0.0, FastMath.PI / 2.0).tanh().getReal(), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(0.0, FastMath.PI / 2.0).tanh().getImaginary(), DELTA);
    }

    @Test
    public void testGetArgument() {
        assertEquals(0.0, Complex.ONE.getArgument(), DELTA);
        assertEquals(FastMath.PI / 2.0, Complex.I.getArgument(), DELTA);
        assertEquals(FastMath.PI, new Complex(-1.0, 0.0).getArgument(), DELTA);
        assertEquals(-FastMath.PI / 2.0, new Complex(0.0, -1.0).getArgument(), DELTA);
        assertEquals(FastMath.atan2(1.0, 1.0), Complex.ONE.add(Complex.I).getArgument(), DELTA);
        assertEquals(Double.NaN, Complex.NaN.getArgument(), DELTA);
        assertEquals(FastMath.atan2(1.0, Double.POSITIVE_INFINITY), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).getArgument(), DELTA);
        assertEquals(FastMath.atan2(Double.POSITIVE_INFINITY, 1.0), Complex.valueOf(1.0, Double.POSITIVE_INFINITY).getArgument(), DELTA);
        assertEquals(FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), Complex.valueOf(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).getArgument(), DELTA);
        assertEquals(FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), Complex.valueOf(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY).getArgument(), DELTA);
    }

    @Test
    public void testNthRoot() {
        // nth root of 1 is 1
        assertEquals(Complex.ONE, Complex.ONE.nthRoot(1).get(0)); // Called on ONE instance
        // nth root of 0 is 0
        assertEquals(Complex.ZERO, Complex.ZERO.nthRoot(2).get(0));
        // square roots of 1 are 1 and -1
        List<Complex> roots2 = Complex.ONE.nthRoot(2);
        assertTrue(roots2.contains(Complex.ONE));
        assertTrue(roots2.contains(new Complex(-1.0, 0.0)));
        // cube roots of 1
        List<Complex> roots3 = Complex.ONE.nthRoot(3);
        assertEquals(3, roots3.size());
        // nth root of NaN is NaN
        assertEquals(Complex.NaN, Complex.NaN.nthRoot(2).get(0));
        // nth root of INF is INF
        assertEquals(Complex.INF, Complex.INF.nthRoot(2).get(0));

        try {
            Complex.ONE.nthRoot(0);
            fail("NotPositiveException not thrown");
        } catch (NotPositiveException e) {
            // expected
        }
        try {
            Complex.ONE.nthRoot(-1);
            fail("NotPositiveException not thrown");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testValueOf() {
        Complex c1 = Complex.valueOf(1.0, 2.0);
        assertEquals(1.0, c1.getReal(), DELTA);
        assertEquals(2.0, c1.getImaginary(), DELTA);
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 2.0));
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN));
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, Double.NaN));
        assertEquals(Complex.ONE, Complex.valueOf(1.0));
        assertEquals(Complex.ZERO, Complex.valueOf(0.0));
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN));
    }

    @Test
    public void testToString() {
        assertEquals("(1.0, 0.0)", Complex.ONE.toString());
        assertEquals("(0.0, 1.0)", Complex.I.toString());
        assertEquals("(3.0, 4.0)", new Complex(3.0, 4.0).toString());
        assertEquals("(NaN, NaN)", Complex.NaN.toString());
        assertEquals("(Infinity, Infinity)", Complex.INF.toString());
    }

    @Test
    public void testAddDouble() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(new Complex(4.0, 2.0), c.add(3.0));
        assertEquals(Complex.NaN, Complex.NaN.add(1.0));
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 1.0).add(1.0));
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN).add(1.0));
    }

    @Test
    public void testSubtractDouble() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(new Complex(-2.0, 2.0), c.subtract(3.0));
        assertEquals(Complex.NaN, Complex.NaN.subtract(1.0));
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 1.0).subtract(1.0));
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN).subtract(1.0));
    }

    @Test
    public void testMultiplyInt() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(new Complex(3.0, 6.0), c.multiply(3));
        assertEquals(Complex.NaN, Complex.NaN.multiply(3));
        assertEquals(Complex.INF, Complex.INF.multiply(3));
        assertEquals(Complex.ZERO, Complex.ZERO.multiply(3));
    }

    @Test
    public void testMultiplyDouble() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(new Complex(3.0, 6.0), c.multiply(3.0));
        assertEquals(Complex.NaN, Complex.NaN.multiply(3.0));
        assertEquals(Complex.INF, Complex.INF.multiply(3.0));
        assertEquals(Complex.ZERO, Complex.ZERO.multiply(3.0));
        assertEquals(Complex.INF, Complex.ONE.multiply(Double.POSITIVE_INFINITY));
        assertEquals(Complex.INF, Complex.I.multiply(Double.POSITIVE_INFINITY));
        assertEquals(Complex.NaN, Complex.ONE.multiply(Double.NaN));
    }

    @Test
    public void testDivideDouble() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(new Complex(0.5, 1.0), c.divide(2.0));
        assertEquals(Complex.NaN, Complex.NaN.divide(2.0));
        assertEquals(Complex.ZERO, Complex.ONE.divide(Double.POSITIVE_INFINITY));
        assertEquals(Complex.NaN, Complex.ONE.divide(0.0));
        assertEquals(Complex.INF, Complex.ONE.divide(Double.MIN_VALUE));
        assertEquals(Complex.ZERO, Complex.ONE.divide(Double.MAX_VALUE));
    }

    @Test
    public void testPowDouble() {
        assertEquals(new Complex(8.0, 0.0), Complex.valueOf(2.0).pow(3.0));
        assertEquals(Complex.NaN, Complex.NaN.pow(2.0));
        assertEquals(Complex.NaN, Complex.valueOf(2.0).pow(Double.NaN));
        assertEquals(Complex.ONE, Complex.valueOf(2.0).pow(0.0));
        assertEquals(Complex.ZERO, Complex.ZERO.pow(2.0));
        assertEquals(Complex.NaN, Complex.ZERO.pow(0.0));
        assertEquals(Complex.INF, Complex.valueOf(2.0).pow(1000.0)); // Check for overflow
    }
}
```