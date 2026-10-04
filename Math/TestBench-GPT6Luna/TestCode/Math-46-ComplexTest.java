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
    public void testAbsUsesBothComponents() throws Exception {
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), 1e-12);
    }

    @Test
    public void testAbsZeroAndSpecialValues() throws Exception {
        assertEquals(0.0, Complex.ZERO.abs(), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.POSITIVE_INFINITY, 1.0).abs(), 0.0);
        assertTrue(new Complex(Double.NaN, 1.0).abs() != new Complex(Double.NaN, 1.0).abs());
    }

    @Test
    public void testAddComplexAndReal() throws Exception {
        Complex sum = new Complex(2.0, 3.0).add(new Complex(4.0, -1.0));
        assertEquals(new Complex(6.0, 2.0), sum);
        assertEquals(new Complex(7.0, 3.0), new Complex(2.0, 3.0).add(5.0));
    }

    @Test
    public void testConjugateAndNegate() throws Exception {
        assertEquals(new Complex(2.0, -3.0), new Complex(2.0, 3.0).conjugate());
        assertEquals(new Complex(-2.0, -3.0), new Complex(2.0, 3.0).negate());
    }

    @Test
    public void testDivideComplexAndReal() throws Exception {
        assertEquals(new Complex(2.0, 1.0),
                     new Complex(4.0, 2.0).divide(new Complex(2.0, 0.0)));
        assertEquals(new Complex(2.0, 1.0),
                     new Complex(4.0, 2.0).divide(2.0));
    }

    @Test
    public void testDivideSpecialCases() throws Exception {
        assertTrue(Complex.ZERO.divide(Complex.ZERO).isNaN());
        assertEquals(Complex.ZERO, new Complex(1.0, 2.0).divide(Complex.INF));
    }

    @Test
    public void testEqualsAndHashCodeForNaN() throws Exception {
        Complex nanReal = new Complex(Double.NaN, 1.0);
        Complex nanImaginary = new Complex(1.0, Double.NaN);
        assertEquals(nanReal, nanImaginary);
        assertEquals(7, nanReal.hashCode());
    }

    @Test
    public void testEqualsDistinguishesValuesAndOtherTypes() throws Exception {
        Complex value = new Complex(1.0, 2.0);
        assertEquals(value, new Complex(1.0, 2.0));
        assertFalse(value.equals(new Complex(1.0, 3.0)));
        assertFalse(value.equals(null));
        assertFalse(value.equals("other"));
    }

    @Test
    public void testAccessorsAndClassification() throws Exception {
        Complex value = new Complex(2.0, 3.0);
        assertEquals(2.0, value.getReal(), 0.0);
        assertEquals(3.0, value.getImaginary(), 0.0);
        assertFalse(value.isNaN());
        assertFalse(value.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0.0).isInfinite());
        assertTrue(new Complex(0.0, Double.NaN).isNaN());
    }

    @Test
    public void testMultiplyAndSubtract() throws Exception {
        assertEquals(new Complex(1.0, 8.0),
                     new Complex(2.0, 3.0).multiply(new Complex(2.0, 1.0)));
        assertEquals(new Complex(3.0, 3.0),
                     new Complex(5.0, 3.0).subtract(new Complex(2.0, 0.0)));
    }

    @Test
    public void testTrigonometricValuesAtZero() throws Exception {
        Complex zero = Complex.ZERO;
        assertEquals(Complex.ONE, zero.cos());
        assertEquals(Complex.ZERO, zero.sin());
        assertEquals(Complex.ZERO, zero.tan());
        assertEquals(Complex.ONE, zero.cosh());
        assertEquals(Complex.ZERO, zero.sinh());
        assertEquals(Complex.ZERO, zero.tanh());
    }

    @Test
    public void testExponentialAndLogarithmAtOne() throws Exception {
        assertEquals(Complex.ONE, Complex.ZERO.exp());
        assertEquals(Complex.ZERO, Complex.ONE.log());
    }

    @Test
    public void testSquareRootsAndInverseSquareRootHelper() throws Exception {
        assertEquals(Complex.ZERO, Complex.ZERO.sqrt());
        assertEquals(new Complex(0.0, 1.0), new Complex(-1.0, 0.0).sqrt());
        assertEquals(Complex.ONE, Complex.ZERO.sqrt1z());
    }

    @Test
    public void testInverseTrigonometricFunctionsAtZero() throws Exception {
        assertEquals(Complex.ZERO, Complex.ZERO.asin());
        assertEquals(Complex.ZERO, Complex.ZERO.atan());
        assertEquals(new Complex(Math.PI / 2.0, 0.0), Complex.ZERO.acos());
    }

    @Test
    public void testPowerWithUnitAndZeroExponent() throws Exception {
        assertEquals(Complex.ONE, new Complex(2.0, 0.0).pow(Complex.ZERO));
        assertEquals(new Complex(4.0, 0.0), new Complex(2.0, 0.0).pow(new Complex(2.0, 0.0)));
    }

    @Test
    public void testArgumentQuadrants() throws Exception {
        assertEquals(Math.PI / 4.0, new Complex(1.0, 1.0).getArgument(), 1e-12);
        assertEquals(Math.PI, new Complex(-1.0, 0.0).getArgument(), 1e-12);
    }

    @Test
    public void testNthRootReturnsRequestedRoots() throws Exception {
        List<Complex> roots = Complex.ONE.nthRoot(2);
        assertEquals(2, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), 1e-12);
        assertEquals(0.0, roots.get(0).getImaginary(), 1e-12);
        assertEquals(-1.0, roots.get(1).getReal(), 1e-12);
        assertEquals(0.0, roots.get(1).getImaginary(), 1e-12);
    }

    @Test
    public void testNthRootSpecialValuesAndInvalidDegree() throws Exception {
        assertEquals(1, new Complex(Double.NaN, 1.0).nthRoot(3).size());
        assertEquals(Complex.NaN, new Complex(Double.NaN, 1.0).nthRoot(3).get(0));
        assertEquals(1, new Complex(Double.POSITIVE_INFINITY, 0.0).nthRoot(2).size());
        try {
            Complex.ONE.nthRoot(0);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) {
        }
    }

    @Test
    public void testValueOfCanonicalizesNaN() throws Exception {
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN));
        assertEquals(new Complex(2.0, 3.0), Complex.valueOf(2.0, 3.0));
    }

    @Test
    public void testFieldAndStringRepresentation() throws Exception {
        assertNotNull(Complex.ONE.getField());
        assertEquals("(1.0, 0.0)", Complex.ONE.toString());
    }
}
