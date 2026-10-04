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
    @Test
    public void testAbsFiniteAndExceptionalInputs() throws Exception {
        assertEquals(5.0, new Complex(3, 4).abs(), 1e-12);
        assertEquals(Double.POSITIVE_INFINITY,
                new Complex(Double.POSITIVE_INFINITY, 1).abs(), 0.0);
        assertTrue(Double.isNaN(new Complex(Double.NaN, 1).abs()));
    }

    @Test
    public void testAddComplexAndNaN() throws Exception {
        Complex sum = new Complex(2, 3).add(new Complex(4, -1));
        assertEquals(6.0, sum.getReal(), 0.0);
        assertEquals(2.0, sum.getImaginary(), 0.0);
        assertTrue(new Complex(1, 0).add(Complex.NaN).isNaN());
    }

    @Test
    public void testConjugateAndNaN() throws Exception {
        Complex conjugate = new Complex(2, -3).conjugate();
        assertEquals(2.0, conjugate.getReal(), 0.0);
        assertEquals(3.0, conjugate.getImaginary(), 0.0);
        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    @Test
    public void testDivideComplexBranches() throws Exception {
        Complex quotient = new Complex(5, 5).divide(new Complex(2, 1));
        assertEquals(3.0, quotient.getReal(), 1e-12);
        assertEquals(1.0, quotient.getImaginary(), 1e-12);
        assertTrue(Complex.ZERO.divide(Complex.ZERO).isNaN());
        assertTrue(new Complex(1, 1).divide(Complex.ZERO).isInfinite());
        assertEquals(Complex.ZERO, new Complex(1, 1).divide(Complex.INF));
    }

    @Test
    public void testEqualityAndHashCodeForNaN() throws Exception {
        assertEquals(new Complex(Double.NaN, 1), new Complex(2, Double.NaN));
        assertEquals(7, new Complex(2, Double.NaN).hashCode());
        assertFalse(new Complex(1, 2).equals(null));
        assertFalse(new Complex(1, 2).equals("other"));
    }

    @Test
    public void testAccessorsAndClassification() throws Exception {
        Complex value = new Complex(-2, 3);
        assertEquals(-2.0, value.getReal(), 0.0);
        assertEquals(3.0, value.getImaginary(), 0.0);
        assertFalse(value.isNaN());
        assertFalse(value.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0).isInfinite());
        assertFalse(new Complex(Double.POSITIVE_INFINITY, Double.NaN).isInfinite());
    }

    @Test
    public void testMultiplyComplexFiniteAndInfinite() throws Exception {
        Complex product = new Complex(2, 3).multiply(new Complex(4, -1));
        assertEquals(11.0, product.getReal(), 0.0);
        assertEquals(10.0, product.getImaginary(), 0.0);
        assertTrue(new Complex(1, 0).multiply(Complex.INF).isInfinite());
        assertTrue(Complex.NaN.multiply(Complex.ONE).isNaN());
    }

    @Test
    public void testNegate() throws Exception {
        Complex negative = new Complex(2, -3).negate();
        assertEquals(-2.0, negative.getReal(), 0.0);
        assertEquals(3.0, negative.getImaginary(), 0.0);
        assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testSubtractComplex() throws Exception {
        Complex difference = new Complex(5, 4).subtract(new Complex(2, 1));
        assertEquals(3.0, difference.getReal(), 0.0);
        assertEquals(3.0, difference.getImaginary(), 0.0);
        assertTrue(new Complex(1, 0).subtract(Complex.NaN).isNaN());
    }

    @Test
    public void testInverseTrigonometricFunctionsAtZero() throws Exception {
        Complex zero = Complex.ZERO;
        assertEquals(0.0, zero.acos().getImaginary(), 1e-12);
        assertEquals(FastMath.PI / 2, zero.acos().getReal(), 1e-12);
        assertEquals(0.0, zero.asin().getReal(), 1e-12);
        assertEquals(0.0, zero.atan().getReal(), 1e-12);
        assertEquals(0.0, zero.atan().getImaginary(), 1e-12);
    }

    @Test
    public void testCosineAndHyperbolicCosineAtZero() throws Exception {
        assertEquals(1.0, Complex.ZERO.cos().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.cos().getImaginary(), 1e-12);
        assertEquals(1.0, Complex.ZERO.cosh().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.cosh().getImaginary(), 1e-12);
        assertTrue(new Complex(Double.NaN, 0).cos().isNaN());
    }

    @Test
    public void testExpAndLog() throws Exception {
        Complex exponential = Complex.ZERO.exp();
        assertEquals(1.0, exponential.getReal(), 1e-12);
        assertEquals(0.0, exponential.getImaginary(), 1e-12);
        Complex logarithm = Complex.ONE.log();
        assertEquals(0.0, logarithm.getReal(), 1e-12);
        assertEquals(0.0, logarithm.getImaginary(), 1e-12);
        assertEquals(Double.NEGATIVE_INFINITY, Complex.ZERO.log().getReal(), 0.0);
    }

    @Test
    public void testPowComplex() throws Exception {
        Complex squared = new Complex(2, 0).pow(new Complex(2, 0));
        assertEquals(4.0, squared.getReal(), 1e-12);
        assertEquals(0.0, squared.getImaginary(), 1e-12);
        assertTrue(Complex.ZERO.pow(Complex.ONE).isNaN());
    }

    @Test
    public void testSineAndHyperbolicSineAtZero() throws Exception {
        assertEquals(0.0, Complex.ZERO.sin().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.sin().getImaginary(), 1e-12);
        assertEquals(0.0, Complex.ZERO.sinh().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.sinh().getImaginary(), 1e-12);
    }

    @Test
    public void testSquareRootBranches() throws Exception {
        Complex positive = new Complex(4, 0).sqrt();
        assertEquals(2.0, positive.getReal(), 1e-12);
        assertEquals(0.0, positive.getImaginary(), 1e-12);
        Complex negative = new Complex(-4, 0).sqrt();
        assertEquals(0.0, negative.getReal(), 1e-12);
        assertEquals(2.0, negative.getImaginary(), 1e-12);
        assertEquals(Complex.ZERO, Complex.ZERO.sqrt());
        assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrt1zAtZeroAndOne() throws Exception {
        assertEquals(1.0, Complex.ZERO.sqrt1z().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.sqrt1z().getImaginary(), 1e-12);
        assertEquals(Complex.ZERO, Complex.ONE.sqrt1z());
    }

    @Test
    public void testTangentAtZero() throws Exception {
        assertEquals(0.0, Complex.ZERO.tan().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.tan().getImaginary(), 1e-12);
        assertTrue(new Complex(Double.NaN, 0).tan().isNaN());
    }

    @Test
    public void testHyperbolicTangentAtZero() throws Exception {
        assertEquals(0.0, Complex.ZERO.tanh().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.tanh().getImaginary(), 1e-12);
        assertTrue(new Complex(0, Double.NaN).tanh().isNaN());
    }

    @Test
    public void testArgumentQuadrantsAndZero() throws Exception {
        assertEquals(0.0, Complex.ZERO.getArgument(), 0.0);
        assertEquals(FastMath.PI / 4, new Complex(1, 1).getArgument(), 1e-12);
        assertEquals(-FastMath.PI / 2, new Complex(0, -1).getArgument(), 1e-12);
    }

    @Test
    public void testNthRootCountValuesAndExceptionalInputs() throws Exception {
        List<Complex> roots = new Complex(4, 0).nthRoot(2);
        assertEquals(2, roots.size());
        assertEquals(2.0, roots.get(0).getReal(), 1e-12);
        assertEquals(-2.0, roots.get(1).getReal(), 1e-12);
        assertEquals(1, Complex.NaN.nthRoot(2).size());
        assertEquals(1, Complex.INF.nthRoot(2).size());
        try {
            Complex.ONE.nthRoot(0);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) {
        }
    }

    @Test
    public void testValueOfNaNAndFinite() throws Exception {
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 1));
        Complex value = Complex.valueOf(2, 3);
        assertEquals(2.0, value.getReal(), 0.0);
        assertEquals(3.0, value.getImaginary(), 0.0);
    }

    @Test
    public void testFieldAndStringRepresentation() throws Exception {
        assertNotNull(Complex.ONE.getField());
        assertEquals("(1.0, 0.0)", Complex.ONE.toString());
    }
}
