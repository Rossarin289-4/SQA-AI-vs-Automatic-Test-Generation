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
    public void testComponentsAndStringForm() throws Exception {
        Complex z = new Complex(3.0, -4.0);
        assertEquals(3.0, z.getReal(), 0.0);
        assertEquals(-4.0, z.getImaginary(), 0.0);
        assertEquals("(3.0, -4.0)", z.toString());
    }

    @Test
    public void testModulusFiniteAndZero() throws Exception {
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), 1e-12);
        assertEquals(0.0, Complex.ZERO.abs(), 0.0);
    }

    @Test
    public void testModulusNanAndInfinity() throws Exception {
        assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).abs()));
        assertEquals(Double.POSITIVE_INFINITY,
                new Complex(Double.POSITIVE_INFINITY, 0.0).abs(), 0.0);
    }

    @Test
    public void testAddAndNaN() throws Exception {
        Complex sum = new Complex(2.0, 3.0).add(new Complex(-1.0, 4.0));
        assertEquals(new Complex(1.0, 7.0), sum);
        assertTrue(new Complex(1.0, 0.0).add(Complex.NaN).isNaN());
    }

    @Test
    public void testAddNullThrows() throws Exception {
        try {
            Complex.ONE.add((Complex) null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) {
        }
    }

    @Test
    public void testConjugateSignsAndNan() throws Exception {
        assertEquals(new Complex(2.0, 3.0), new Complex(2.0, -3.0).conjugate());
        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    @Test
    public void testDivideComplexBothBranchesAndZero() throws Exception {
        assertEquals(new Complex(2.0, 1.0),
                new Complex(4.0, 2.0).divide(new Complex(2.0, 0.0)));
        assertEquals(new Complex(0.0, -1.0),
                new Complex(1.0, 0.0).divide(new Complex(0.0, 1.0)));
        assertTrue(Complex.ONE.divide(Complex.ZERO).isNaN());
    }

    @Test
    public void testDivideInfiniteDivisor() throws Exception {
        assertEquals(Complex.ZERO,
                new Complex(3.0, 4.0).divide(Complex.INF));
    }

    @Test
    public void testReciprocalFiniteZeroAndInfinite() throws Exception {
        assertEquals(new Complex(0.4, -0.2),
                new Complex(2.0, 1.0).reciprocal());
        assertTrue(Complex.ZERO.reciprocal().isNaN());
        assertEquals(Complex.ZERO,
                new Complex(Double.POSITIVE_INFINITY, 1.0).reciprocal());
    }

    @Test
    public void testEqualityNaNAndOtherObjects() throws Exception {
        assertEquals(Complex.NaN, new Complex(Double.NaN, 1.0));
        assertNotEquals(new Complex(1.0, 2.0), new Complex(1.0, -2.0));
        assertFalse(Complex.ONE.equals(null));
        assertFalse(Complex.ONE.equals("one"));
    }

    @Test
    public void testHashCodeForNaN() throws Exception {
        assertEquals(7, new Complex(1.0, Double.NaN).hashCode());
    }

    @Test
    public void testClassification() throws Exception {
        assertTrue(new Complex(0.0, Double.NaN).isNaN());
        assertFalse(new Complex(Double.POSITIVE_INFINITY, Double.NaN).isInfinite());
        assertTrue(new Complex(0.0, Double.NEGATIVE_INFINITY).isInfinite());
        assertFalse(Complex.ZERO.isInfinite());
    }

    @Test
    public void testMultiplyComplex() throws Exception {
        assertEquals(new Complex(-5.0, 10.0),
                new Complex(1.0, 2.0).multiply(new Complex(3.0, 4.0)));
        assertEquals(Complex.INF,
                new Complex(1.0, 0.0).multiply(new Complex(Double.NEGATIVE_INFINITY, 0.0)));
        assertTrue(Complex.NaN.multiply(Complex.ONE).isNaN());
    }

    @Test
    public void testNegate() throws Exception {
        assertEquals(new Complex(-2.0, 3.0), new Complex(2.0, -3.0).negate());
        assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(new Complex(3.0, -2.0),
                new Complex(5.0, 1.0).subtract(new Complex(2.0, 3.0)));
        assertTrue(Complex.ONE.subtract(Complex.NaN).isNaN());
    }

    @Test
    public void testAcosAndAsinAtZero() throws Exception {
        assertEquals(0.0, Complex.ZERO.asin().getReal(), 1e-12);
        assertEquals(FastMath.PI / 2.0, Complex.ZERO.acos().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.acos().getImaginary(), 1e-12);
    }

    @Test
    public void testAtanAtZeroAndNaN() throws Exception {
        assertEquals(0.0, Complex.ZERO.atan().getReal(), 1e-12);
        assertEquals(0.0, Complex.ZERO.atan().getImaginary(), 1e-12);
        assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testTrigonometricFunctionsAtZero() throws Exception {
        assertEquals(Complex.ONE, Complex.ZERO.cos());
        assertEquals(Complex.ZERO, Complex.ZERO.sin());
        assertEquals(Complex.ZERO, Complex.ZERO.tan());
    }

    @Test
    public void testHyperbolicFunctionsAtZero() throws Exception {
        assertEquals(Complex.ONE, Complex.ZERO.cosh());
        assertEquals(Complex.ZERO, Complex.ZERO.sinh());
        assertEquals(Complex.ZERO, Complex.ZERO.tanh());
    }

    @Test
    public void testTangentExtremeImaginaryBranches() throws Exception {
        assertEquals(new Complex(0.0, 1.0),
                new Complex(2.0, 21.0).tan());
        assertEquals(new Complex(0.0, -1.0),
                new Complex(2.0, -21.0).tan());
        Complex boundary = new Complex(2.0, 20.0).tan();
        assertEquals(0.0, boundary.getReal(), 1e-15);
        assertEquals(1.0, boundary.getImaginary(), 1e-15);
    }

    @Test
    public void testExpLogAndArgument() throws Exception {
        assertEquals(Complex.ONE, Complex.ZERO.exp());
        assertEquals(0.0, Complex.ONE.log().getReal(), 0.0);
        assertEquals(0.0, Complex.ONE.log().getImaginary(), 0.0);
        assertEquals(FastMath.PI, new Complex(-1.0, 0.0).getArgument(), 1e-12);
    }

    @Test
    public void testComplexPower() throws Exception {
        assertEquals(new Complex(4.0, 0.0),
                new Complex(2.0, 0.0).pow(new Complex(2.0, 0.0)));
    }

    @Test
    public void testSquareRootAndSqrtOneMinusSquare() throws Exception {
        assertEquals(Complex.ZERO, Complex.ZERO.sqrt());
        assertEquals(new Complex(2.0, 1.0), new Complex(3.0, 4.0).sqrt());
        assertEquals(Complex.ONE, Complex.ZERO.sqrt1z());
    }

    @Test
    public void testNthRootsCountAndValues() throws Exception {
        List<Complex> roots = new Complex(1.0, 0.0).nthRoot(2);
        assertEquals(2, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), 1e-12);
        assertEquals(0.0, roots.get(0).getImaginary(), 1e-12);
        assertEquals(-1.0, roots.get(1).getReal(), 1e-12);
        assertEquals(0.0, roots.get(1).getImaginary(), 1e-12);
    }

    @Test
    public void testNthRootNonPositiveDegreeThrows() throws Exception {
        try {
            Complex.ONE.nthRoot(0);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) {
        }
    }

    @Test
    public void testNthRootsSpecialValues() throws Exception {
        assertEquals(1, Complex.NaN.nthRoot(3).size());
        assertEquals(1, Complex.INF.nthRoot(3).size());
        assertEquals(Complex.NaN, Complex.NaN.nthRoot(3).get(0));
        assertEquals(Complex.INF, Complex.INF.nthRoot(3).get(0));
    }

    @Test
    public void testValueOfCanonicalizesNaN() throws Exception {
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN));
        assertEquals(new Complex(2.0, 0.0), Complex.valueOf(2.0, 0.0));
    }

    @Test
    public void testFieldIsAvailable() throws Exception {
        assertNotNull(Complex.ONE.getField());
    }
}
