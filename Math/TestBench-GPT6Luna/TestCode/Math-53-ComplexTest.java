package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math.FieldElement;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.FastMath;

public class ComplexTest {
    @Test
    public void testAbsFiniteAndZero() throws Exception {
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), 1e-12);
        assertEquals(0.0, new Complex(0.0, 0.0).abs(), 0.0);
    }

    @Test
    public void testAbsNaNAndInfinite() throws Exception {
        assertTrue(Double.isNaN(new Complex(Double.NaN, 1.0).abs()));
        assertEquals(Double.POSITIVE_INFINITY,
                new Complex(1.0, Double.POSITIVE_INFINITY).abs(), 0.0);
    }

    @Test
    public void testAddSubtractionAndNull() throws Exception {
        Complex sum = new Complex(3.0, 4.0).add(new Complex(2.0, -1.0));
        assertEquals(new Complex(5.0, 3.0), sum);
        assertEquals(new Complex(1.0, 5.0),
                new Complex(3.0, 4.0).subtract(new Complex(2.0, -1.0)));
        try {
            new Complex(1.0, 2.0).add(null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) { }
    }

    @Test
    public void testAddNaNAndSubtractNaN() throws Exception {
        assertEquals(Complex.NaN, new Complex(1.0, 2.0).add(new Complex(Double.NaN, 0.0)));
        assertEquals(Complex.NaN, new Complex(1.0, 2.0).subtract(new Complex(0.0, Double.NaN)));
    }

    @Test
    public void testConjugateAndNegate() throws Exception {
        assertEquals(new Complex(2.0, -3.0), new Complex(2.0, 3.0).conjugate());
        assertEquals(new Complex(-2.0, -3.0), new Complex(2.0, 3.0).negate());
        assertEquals(Complex.NaN, new Complex(Double.NaN, 1.0).conjugate());
    }

    @Test
    public void testDivideOrdinaryAndBranchPrescaling() throws Exception {
        Complex quotient = new Complex(7.0, 5.0).divide(new Complex(2.0, 1.0));
        assertEquals(3.8, quotient.getReal(), 1e-12);
        assertEquals(0.6, quotient.getImaginary(), 1e-12);
        Complex otherBranch = new Complex(7.0, 5.0).divide(new Complex(1.0, 2.0));
        assertEquals(3.4, otherBranch.getReal(), 1e-12);
        assertEquals(-1.8, otherBranch.getImaginary(), 1e-12);
    }

    @Test
    public void testDivideSpecialOperands() throws Exception {
        assertEquals(Complex.NaN, new Complex(1.0, 2.0).divide(Complex.ZERO));
        assertEquals(Complex.ZERO,
                new Complex(1.0, 2.0).divide(new Complex(Double.POSITIVE_INFINITY, 0.0)));
        assertEquals(Complex.NaN, new Complex(1.0, 2.0).divide(Complex.NaN));
    }

    @Test
    public void testEqualsAndHashCodeNaNs() throws Exception {
        Complex nanPart = new Complex(4.0, Double.NaN);
        assertEquals(Complex.NaN, nanPart);
        assertEquals(7, nanPart.hashCode());
        assertFalse(new Complex(1.0, 2.0).equals(null));
        assertFalse(new Complex(1.0, 2.0).equals("not complex"));
        assertEquals(new Complex(1.0, 2.0), new Complex(1.0, 2.0));
    }

    @Test
    public void testAccessorsAndStateFlags() throws Exception {
        Complex value = new Complex(-2.5, 7.25);
        assertEquals(-2.5, value.getReal(), 0.0);
        assertEquals(7.25, value.getImaginary(), 0.0);
        assertFalse(value.isNaN());
        assertFalse(value.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0.0).isInfinite());
        assertTrue(new Complex(0.0, Double.NaN).isNaN());
        assertFalse(new Complex(Double.POSITIVE_INFINITY, Double.NaN).isInfinite());
    }

    @Test
    public void testMultiplyComplexAndScalar() throws Exception {
        assertEquals(new Complex(-5.0, 10.0),
                new Complex(1.0, 2.0).multiply(new Complex(3.0, 4.0)));
        assertEquals(new Complex(3.0, -6.0), new Complex(1.0, -2.0).multiply(3.0));
        assertEquals(Complex.INF, new Complex(1.0, 2.0).multiply(Double.POSITIVE_INFINITY));
        assertEquals(Complex.NaN, new Complex(Double.NaN, 1.0).multiply(2.0));
    }

    @Test
    public void testTrigonometricFunctionsAtZero() throws Exception {
        Complex zero = new Complex(0.0, 0.0);
        assertEquals(new Complex(1.0, 0.0), zero.cos());
        assertEquals(new Complex(0.0, 0.0), zero.sin());
        assertEquals(new Complex(0.0, 0.0), zero.tan());
        assertEquals(new Complex(1.0, 0.0), zero.cosh());
        assertEquals(new Complex(0.0, 0.0), zero.sinh());
        assertEquals(new Complex(0.0, 0.0), zero.tanh());
    }

    @Test
    public void testExponentialLogarithmAndPower() throws Exception {
        Complex z = new Complex(1.0, 0.0);
        Complex exponential = z.exp();
        assertEquals(FastMath.E, exponential.getReal(), 1e-12);
        assertEquals(0.0, exponential.getImaginary(), 1e-12);
        Complex logarithm = new Complex(0.0, 1.0).log();
        assertEquals(0.0, logarithm.getReal(), 1e-12);
        assertEquals(FastMath.PI / 2.0, logarithm.getImaginary(), 1e-12);
        assertEquals(new Complex(1.0, 0.0), z.pow(new Complex(0.0, 0.0)));
    }

    @Test
    public void testInverseTrigonometricFunctionsAtZero() throws Exception {
        Complex zero = new Complex(0.0, 0.0);
        assertEquals(FastMath.PI / 2.0, zero.acos().getReal(), 1e-12);
        assertEquals(0.0, zero.acos().getImaginary(), 1e-12);
        assertEquals(0.0, zero.asin().getReal(), 1e-12);
        assertEquals(0.0, zero.asin().getImaginary(), 1e-12);
        assertEquals(0.0, zero.atan().getReal(), 1e-12);
        assertEquals(0.0, zero.atan().getImaginary(), 1e-12);
    }

    @Test
    public void testSqrtAndSqrtOneMinusSquare() throws Exception {
        Complex root = new Complex(3.0, 4.0).sqrt();
        assertEquals(2.0, root.getReal(), 1e-12);
        assertEquals(1.0, root.getImaginary(), 1e-12);
        assertEquals(new Complex(0.0, 0.0), Complex.ONE.sqrt1z());
        assertEquals(new Complex(0.0, 0.0), Complex.ZERO.sqrt());
        assertEquals(Complex.NaN, new Complex(Double.NaN, 0.0).sqrt());
    }

    @Test
    public void testArgumentQuadrantsAndSignedAxis() throws Exception {
        assertEquals(FastMath.PI / 4.0, new Complex(1.0, 1.0).getArgument(), 1e-12);
        assertEquals(FastMath.PI, new Complex(-1.0, 0.0).getArgument(), 1e-12);
        assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).getArgument()));
    }

    @Test
    public void testNthRootDegreeOneAndMultipleRoots() throws Exception {
        List<Complex> one = new Complex(3.0, 4.0).nthRoot(1);
        assertEquals(1, one.size());
        assertEquals(3.0, one.get(0).getReal(), 1e-12);
        assertEquals(4.0, one.get(0).getImaginary(), 1e-12);

        List<Complex> roots = Complex.ONE.nthRoot(2);
        assertEquals(2, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), 1e-12);
        assertEquals(0.0, roots.get(0).getImaginary(), 1e-12);
        assertEquals(-1.0, roots.get(1).getReal(), 1e-12);
        assertEquals(0.0, roots.get(1).getImaginary(), 1e-12);
    }

    @Test
    public void testNthRootSpecialInputsAndInvalidDegree() throws Exception {
        assertEquals(Complex.NaN, Complex.NaN.nthRoot(3).get(0));
        assertEquals(Complex.INF,
                new Complex(Double.POSITIVE_INFINITY, 1.0).nthRoot(3).get(0));
        try {
            Complex.ONE.nthRoot(0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRenderingAndFieldAvailable() throws Exception {
        assertEquals("(2.0, -3.0)", new Complex(2.0, -3.0).toString());
        assertNotNull(Complex.ONE.getField());
    }
}
