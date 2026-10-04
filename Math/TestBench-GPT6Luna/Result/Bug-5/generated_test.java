package org.apache.commons.math3.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

public class ComplexTest {
    @Test
    public void testMagnitudeAndArgument() throws Exception {
        Complex z = new Complex(3, 4);
        assertEquals(5.0, z.abs(), 1e-12);
        assertEquals(Math.atan2(4, 3), z.getArgument(), 1e-12);
    }

    @Test
    public void testAddition() throws Exception {
        Complex z = new Complex(2, 3).add(new Complex(4, -1));
        assertEquals(6.0, z.getReal(), 0.0);
        assertEquals(2.0, z.getImaginary(), 0.0);
    }

    @Test
    public void testConjugateAndNegate() throws Exception {
        Complex z = new Complex(2, -3);
        assertEquals(new Complex(2, 3), z.conjugate());
        assertEquals(new Complex(-2, 3), z.negate());
    }

    @Test
    public void testComplexDivision() throws Exception {
        Complex z = new Complex(3, 4).divide(new Complex(1, 2));
        assertEquals(2.2, z.getReal(), 1e-12);
        assertEquals(-0.4, z.getImaginary(), 1e-12);
    }

    @Test
    public void testReciprocal() throws Exception {
        Complex z = new Complex(3, 4).reciprocal();
        assertEquals(0.12, z.getReal(), 1e-12);
        assertEquals(-0.16, z.getImaginary(), 1e-12);
    }

    @Test
    public void testEqualityAndHashForNaN() throws Exception {
        Complex a = new Complex(Double.NaN, 1);
        Complex b = new Complex(2, Double.NaN);
        assertEquals(a, b);
        assertEquals(7, a.hashCode());
        assertFalse(a.equals(null));
    }

    @Test
    public void testAccessorsAndClassification() throws Exception {
        Complex z = new Complex(2, -3);
        assertEquals(2.0, z.getReal(), 0.0);
        assertEquals(-3.0, z.getImaginary(), 0.0);
        assertFalse(z.isNaN());
        assertFalse(z.isInfinite());
    }

    @Test
    public void testMultiply() throws Exception {
        Complex z = new Complex(2, 3).multiply(new Complex(4, -1));
        assertEquals(11.0, z.getReal(), 0.0);
        assertEquals(10.0, z.getImaginary(), 0.0);
    }

    @Test
    public void testSubtract() throws Exception {
        Complex z = new Complex(5, 4).subtract(new Complex(2, 7));
        assertEquals(3.0, z.getReal(), 0.0);
        assertEquals(-3.0, z.getImaginary(), 0.0);
    }

    @Test
    public void testInverseCircularFunctionsAtZero() throws Exception {
        Complex zero = Complex.ZERO;
        assertEquals(0.0, zero.asin().getReal(), 1e-12);
        assertEquals(0.0, zero.asin().getImaginary(), 1e-12);
        assertEquals(Math.PI / 2, zero.acos().getReal(), 1e-12);
        assertEquals(0.0, zero.atan().getImaginary(), 1e-12);
    }

    @Test
    public void testCosAndSinAtZero() throws Exception {
        Complex zero = Complex.ZERO;
        assertEquals(1.0, zero.cos().getReal(), 1e-12);
        assertEquals(0.0, zero.cos().getImaginary(), 1e-12);
        assertEquals(0.0, zero.sin().getReal(), 1e-12);
        assertEquals(0.0, zero.sin().getImaginary(), 1e-12);
    }

    @Test
    public void testHyperbolicFunctionsAtZero() throws Exception {
        Complex zero = Complex.ZERO;
        assertEquals(1.0, zero.cosh().getReal(), 1e-12);
        assertEquals(0.0, zero.cosh().getImaginary(), 1e-12);
        assertEquals(0.0, zero.sinh().getReal(), 1e-12);
        assertEquals(0.0, zero.sinh().getImaginary(), 1e-12);
    }

    @Test
    public void testExponentialAndLogarithm() throws Exception {
        Complex zero = Complex.ZERO;
        assertEquals(1.0, zero.exp().getReal(), 1e-12);
        assertEquals(0.0, zero.exp().getImaginary(), 1e-12);
        Complex log = new Complex(1, 0).log();
        assertEquals(0.0, log.getReal(), 1e-12);
        assertEquals(0.0, log.getImaginary(), 1e-12);
    }

    @Test
    public void testComplexPower() throws Exception {
        Complex z = new Complex(2, 0).pow(new Complex(2, 0));
        assertEquals(4.0, z.getReal(), 1e-10);
        assertEquals(0.0, z.getImaginary(), 1e-10);
    }

    @Test
    public void testSquareRoot() throws Exception {
        Complex z = new Complex(-4, 0).sqrt();
        assertEquals(0.0, z.getReal(), 1e-12);
        assertEquals(2.0, z.getImaginary(), 1e-12);
    }

    @Test
    public void testSqrtOneMinusSquare() throws Exception {
        Complex z = Complex.ZERO.sqrt1z();
        assertEquals(1.0, z.getReal(), 1e-12);
        assertEquals(0.0, z.getImaginary(), 1e-12);
    }

    @Test
    public void testTangentLargeImaginaryBranches() throws Exception {
        Complex upper = new Complex(3, 21).tan();
        assertEquals(0.0, upper.getReal(), 0.0);
        assertEquals(1.0, upper.getImaginary(), 0.0);
        Complex lower = new Complex(3, -21).tan();
        assertEquals(0.0, lower.getReal(), 0.0);
        assertEquals(-1.0, lower.getImaginary(), 0.0);
    }

    @Test
    public void testHyperbolicTangentLargeRealBranches() throws Exception {
        Complex upper = new Complex(21, 3).tanh();
        assertEquals(1.0, upper.getReal(), 0.0);
        assertEquals(0.0, upper.getImaginary(), 0.0);
        Complex lower = new Complex(-21, 3).tanh();
        assertEquals(-1.0, lower.getReal(), 0.0);
        assertEquals(0.0, lower.getImaginary(), 0.0);
    }

    @Test
    public void testNthRoots() throws Exception {
        List<Complex> roots = new Complex(1, 0).nthRoot(2);
        assertEquals(2, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), 1e-12);
        assertEquals(0.0, roots.get(0).getImaginary(), 1e-12);
        assertEquals(-1.0, roots.get(1).getReal(), 1e-12);
        assertEquals(0.0, roots.get(1).getImaginary(), 1e-12);
    }

    @Test
    public void testNthRootRejectsZeroDegree() throws Exception {
        try {
            Complex.ONE.nthRoot(0);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) {
            assertEquals(1.0, Complex.ONE.getReal(), 0.0);
        }
    }

    @Test
    public void testValueOfNaNAndFormatting() throws Exception {
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 2));
        assertEquals("(2.0, 3.0)", new Complex(2, 3).toString());
    }

    @Test
    public void testFieldIsAvailable() throws Exception {
        assertEquals(Complex.ONE.getField(), new Complex(2, 3).getField());
    }

    @Test
    public void testInfinityClassificationAndMagnitude() throws Exception {
        Complex z = new Complex(Double.POSITIVE_INFINITY, 1);
        assertTrue(z.isInfinite());
        assertFalse(z.isNaN());
        assertEquals(Double.POSITIVE_INFINITY, z.abs(), 0.0);
    }
}
