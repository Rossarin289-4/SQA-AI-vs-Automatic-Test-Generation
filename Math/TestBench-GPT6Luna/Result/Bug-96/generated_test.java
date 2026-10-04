package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.util.MathUtils;

public class ComplexTest {
    @Test
    public void testAbsoluteValueBranches() throws Exception {
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), 1e-12);
        assertEquals(0.0, new Complex(0.0, 0.0).abs(), 0.0);
        assertTrue(Double.isInfinite(new Complex(Double.POSITIVE_INFINITY, 1.0).abs()));
        assertTrue(Double.isNaN(new Complex(Double.NaN, 1.0).abs()));
    }

    @Test
    public void testAddition() throws Exception {
        Complex result = new Complex(2.0, -3.0).add(new Complex(4.0, 5.0));
        assertEquals(6.0, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
        assertTrue(new Complex(1.0, 0.0).add(Complex.NaN).isNaN());
    }

    @Test
    public void testConjugate() throws Exception {
        Complex result = new Complex(2.0, 3.0).conjugate();
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(-3.0, result.getImaginary(), 0.0);
        assertTrue(new Complex(1.0, Double.NaN).conjugate().isNaN());
    }

    @Test
    public void testDivisionOrdinaryAndSpecialCases() throws Exception {
        Complex result = new Complex(1.0, 2.0).divide(new Complex(3.0, 4.0));
        assertEquals(11.0 / 25.0, result.getReal(), 1e-12);
        assertEquals(2.0 / 25.0, result.getImaginary(), 1e-12);
        assertTrue(new Complex(1.0, 2.0).divide(Complex.ZERO).isNaN());
        assertEquals(Complex.ZERO, new Complex(1.0, 2.0).divide(Complex.INF));
    }

    @Test
    public void testDivisionImaginaryDominantBranch() throws Exception {
        Complex result = new Complex(1.0, 2.0).divide(new Complex(1.0, 3.0));
        assertEquals(7.0 / 10.0, result.getReal(), 1e-12);
        assertEquals(-1.0 / 10.0, result.getImaginary(), 1e-12);
    }

    @Test
    public void testEqualityAndHashForNaN() throws Exception {
        assertTrue(Complex.NaN.equals(new Complex(Double.NaN, 3.0)));
        assertFalse(new Complex(1.0, 2.0).equals(null));
        assertFalse(new Complex(1.0, 2.0).equals("other"));
        assertEquals(7, new Complex(1.0, Double.NaN).hashCode());
        assertTrue(new Complex(1.0, 2.0).equals(new Complex(1.0, 2.0)));
    }

    @Test
    public void testPredicatesAndGetters() throws Exception {
        Complex value = new Complex(-2.5, 4.0);
        assertEquals(-2.5, value.getReal(), 0.0);
        assertEquals(4.0, value.getImaginary(), 0.0);
        assertFalse(value.isNaN());
        assertFalse(value.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0.0).isInfinite());
        assertFalse(new Complex(Double.POSITIVE_INFINITY, Double.NaN).isInfinite());
    }

    @Test
    public void testMultiplication() throws Exception {
        Complex result = new Complex(2.0, 3.0).multiply(new Complex(4.0, -1.0));
        assertEquals(11.0, result.getReal(), 0.0);
        assertEquals(10.0, result.getImaginary(), 0.0);
        assertEquals(Complex.INF, new Complex(Double.NEGATIVE_INFINITY, 0.0).multiply(Complex.ZERO));
        assertTrue(new Complex(1.0, 0.0).multiply(Complex.NaN).isNaN());
    }

    @Test
    public void testNegation() throws Exception {
        Complex result = new Complex(2.0, -3.0).negate();
        assertEquals(-2.0, result.getReal(), 0.0);
        assertEquals(3.0, result.getImaginary(), 0.0);
        assertTrue(new Complex(Double.NaN, 0.0).negate().isNaN());
    }

    @Test
    public void testSubtraction() throws Exception {
        Complex result = new Complex(5.0, 4.0).subtract(new Complex(2.0, 7.0));
        assertEquals(3.0, result.getReal(), 0.0);
        assertEquals(-3.0, result.getImaginary(), 0.0);
        assertTrue(new Complex(5.0, 4.0).subtract(Complex.NaN).isNaN());
    }

    @Test
    public void testInverseTrigonometricFunctions() throws Exception {
        Complex asin = Complex.ZERO.asin();
        assertEquals(0.0, asin.getReal(), 1e-12);
        assertEquals(0.0, asin.getImaginary(), 1e-12);
        Complex atan = Complex.ZERO.atan();
        assertEquals(0.0, atan.getReal(), 1e-12);
        assertEquals(0.0, atan.getImaginary(), 1e-12);
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0.0).acos().isNaN());
    }

    @Test
    public void testCosineAndHyperbolicCosine() throws Exception {
        Complex cosine = Complex.ZERO.cos();
        assertEquals(1.0, cosine.getReal(), 1e-12);
        assertEquals(0.0, cosine.getImaginary(), 1e-12);
        Complex hyperbolic = Complex.ZERO.cosh();
        assertEquals(1.0, hyperbolic.getReal(), 1e-12);
        assertEquals(0.0, hyperbolic.getImaginary(), 1e-12);
        assertTrue(new Complex(Double.NaN, 0.0).cos().isNaN());
    }

    @Test
    public void testExponential() throws Exception {
        Complex result = Complex.ZERO.exp();
        assertEquals(1.0, result.getReal(), 1e-12);
        assertEquals(0.0, result.getImaginary(), 1e-12);
        Complex negativeInfinity = new Complex(Double.NEGATIVE_INFINITY, 0.0).exp();
        assertEquals(0.0, negativeInfinity.getReal(), 0.0);
        assertEquals(0.0, negativeInfinity.getImaginary(), 0.0);
    }

    @Test
    public void testLogarithm() throws Exception {
        Complex result = new Complex(0.0, 1.0).log();
        assertEquals(0.0, result.getReal(), 1e-12);
        assertEquals(Math.PI / 2.0, result.getImaginary(), 1e-12);
        Complex zeroLog = Complex.ZERO.log();
        assertTrue(Double.isInfinite(zeroLog.getReal()));
        assertEquals(0.0, zeroLog.getImaginary(), 0.0);
    }

    @Test
    public void testPower() throws Exception {
        Complex result = new Complex(2.0, 0.0).pow(new Complex(2.0, 0.0));
        assertEquals(4.0, result.getReal(), 1e-12);
        assertEquals(0.0, result.getImaginary(), 1e-12);
        assertTrue(Complex.ZERO.pow(Complex.ONE).isNaN());
    }

    @Test
    public void testSineAndHyperbolicSine() throws Exception {
        Complex sine = Complex.ZERO.sin();
        assertEquals(0.0, sine.getReal(), 1e-12);
        assertEquals(0.0, sine.getImaginary(), 1e-12);
        Complex hyperbolic = Complex.ZERO.sinh();
        assertEquals(0.0, hyperbolic.getReal(), 1e-12);
        assertEquals(0.0, hyperbolic.getImaginary(), 1e-12);
        assertTrue(new Complex(Double.NaN, 0.0).sinh().isNaN());
    }

    @Test
    public void testSquareRootZeroAndPositiveReal() throws Exception {
        Complex zero = Complex.ZERO.sqrt();
        assertEquals(0.0, zero.getReal(), 0.0);
        assertEquals(0.0, zero.getImaginary(), 0.0);
        Complex result = new Complex(4.0, 0.0).sqrt();
        assertEquals(2.0, result.getReal(), 1e-12);
        assertEquals(0.0, result.getImaginary(), 1e-12);
    }

    @Test
    public void testSquareRootNegativeRealAndNaN() throws Exception {
        Complex result = new Complex(-4.0, 0.0).sqrt();
        assertEquals(0.0, result.getReal(), 1e-12);
        assertEquals(2.0, result.getImaginary(), 1e-12);
        assertTrue(new Complex(0.0, Double.NaN).sqrt().isNaN());
    }

    @Test
    public void testSquareRootOfOneMinusSquare() throws Exception {
        Complex result = Complex.ZERO.sqrt1z();
        assertEquals(1.0, result.getReal(), 1e-12);
        assertEquals(0.0, result.getImaginary(), 1e-12);
        Complex atOne = Complex.ONE.sqrt1z();
        assertEquals(0.0, atOne.getReal(), 1e-12);
        assertEquals(0.0, atOne.getImaginary(), 1e-12);
    }

    @Test
    public void testTangentAndHyperbolicTangent() throws Exception {
        Complex tangent = Complex.ZERO.tan();
        assertEquals(0.0, tangent.getReal(), 1e-12);
        assertEquals(0.0, tangent.getImaginary(), 1e-12);
        Complex hyperbolic = Complex.ZERO.tanh();
        assertEquals(0.0, hyperbolic.getReal(), 1e-12);
        assertEquals(0.0, hyperbolic.getImaginary(), 1e-12);
        assertTrue(new Complex(Double.NaN, 0.0).tanh().isNaN());
    }
}
