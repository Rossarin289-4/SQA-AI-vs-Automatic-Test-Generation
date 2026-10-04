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

    private static final double DELTA = 1e-9;

    @Test
    public void testAbs() {
        assertEquals(1.0, Complex.ONE.abs(), DELTA);
        assertEquals(1.0, Complex.I.abs(), DELTA);
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), DELTA);
        assertEquals(Double.NaN, Complex.NaN.abs(), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), DELTA);
        assertEquals(1.0, new Complex(1.0, 0.0).abs(), DELTA);
        assertEquals(0.0, Complex.ZERO.abs(), DELTA);
    }

    @Test
    public void testAdd() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(4.0, 6.0);
        assertEquals(expected, c1.add(c2));
        assertEquals(expected, c1.add(3.0).add(new Complex(0.0, 4.0))); // add(double)
        assertEquals(Complex.NaN, c1.add(Complex.NaN));
        assertEquals(Complex.NaN, Complex.NaN.add(c2));
        assertEquals(Complex.INF, c1.add(Complex.INF));
        assertEquals(Complex.INF, Complex.INF.add(c2));
        assertEquals(Complex.NaN, Complex.INF.add(Complex.INF)); // special case
    }

    @Test
    public void testConjugate() {
        assertEquals(new Complex(1.0, -2.0), new Complex(1.0, 2.0).conjugate());
        assertEquals(Complex.ZERO, Complex.ZERO.conjugate());
        assertEquals(Complex.I.negate(), Complex.I.conjugate());
        assertEquals(Complex.NaN, Complex.NaN.conjugate());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), Complex.INF.conjugate());
    }

    @Test
    public void testDivide() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(0.44, 0.08);
        assertEquals(expected, c1.divide(c2));
        assertEquals(Complex.ZERO, c1.divide(Complex.INF));
        assertEquals(Complex.NaN, c1.divide(Complex.ZERO));
        assertEquals(Complex.NaN, Complex.ZERO.divide(Complex.ZERO));
        assertEquals(Complex.NaN, Complex.INF.divide(Complex.INF));
        assertEquals(new Complex(0.5, 0.0), Complex.ONE.divide(2.0));
        assertEquals(Complex.NaN, Complex.NaN.divide(c2));
        assertEquals(Complex.NaN, c1.divide(Complex.NaN));
        assertEquals(Complex.NaN, Complex.INF.divide(c2));
    }

    @Test
    public void testReciprocal() {
        assertEquals(Complex.ONE, Complex.ONE.reciprocal());
        assertEquals(Complex.I.negate(), Complex.I.reciprocal());
        assertEquals(new Complex(0.2, -0.4), new Complex(1.0, 2.0).reciprocal());
        assertEquals(Complex.INF, Complex.ZERO.reciprocal());
        assertEquals(Complex.ZERO, Complex.INF.reciprocal());
        assertEquals(Complex.NaN, Complex.NaN.reciprocal());
    }

    @Test
    public void testEquals() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(3.0, 4.0);
        Complex nan1 = new Complex(Double.NaN, 1.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        Complex nan3 = new Complex(Double.NaN, Double.NaN);

        assertTrue(c1.equals(c2));
        assertFalse(c1.equals(c3));
        assertFalse(c1.equals(null));
        assertFalse(c1.equals(new Object()));
        assertTrue(nan1.equals(nan2));
        assertTrue(nan1.equals(nan3));
        assertTrue(nan2.equals(nan3));
        assertTrue(nan1.equals(new Complex(Double.NaN, Double.NaN)));
    }

    @Test
    public void testHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(3.0, 4.0);
        Complex nan1 = new Complex(Double.NaN, 1.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        Complex nan3 = new Complex(Double.NaN, Double.NaN);

        assertEquals(c1.hashCode(), c2.hashCode());
        assertNotEquals(c1.hashCode(), c3.hashCode());
        assertEquals(7, nan1.hashCode());
        assertEquals(7, nan2.hashCode());
        assertEquals(7, nan3.hashCode());
    }

    @Test
    public void testGetters() {
        Complex c = new Complex(3.0, -4.0);
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(-4.0, c.getImaginary(), DELTA);
        assertEquals(1.0, Complex.ONE.getReal(), DELTA);
        assertEquals(1.0, Complex.I.getImaginary(), DELTA);
    }

    @Test
    public void testIsNaN() {
        assertFalse(Complex.ONE.isNaN());
        assertTrue(Complex.NaN.isNaN());
        assertTrue(new Complex(Double.NaN, 1.0).isNaN());
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
    }

    @Test
    public void testIsInfinite() {
        assertFalse(Complex.ONE.isInfinite());
        assertFalse(Complex.ZERO.isInfinite());
        assertTrue(Complex.INF.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).isInfinite());
        assertTrue(new Complex(1.0, Double.NEGATIVE_INFINITY).isInfinite());
        assertFalse(Complex.NaN.isInfinite());
        assertFalse(new Complex(Double.POSITIVE_INFINITY, Double.NaN).isInfinite());
    }

    @Test
    public void testMultiply() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(-5.0, 10.0);
        assertEquals(expected, c1.multiply(c2));
        assertEquals(new Complex(2.0, 4.0), c1.multiply(2)); // multiply(int)
        assertEquals(new Complex(2.0, 4.0), c1.multiply(2.0)); // multiply(double)
        assertEquals(Complex.NaN, c1.multiply(Complex.NaN));
        assertEquals(Complex.NaN, Complex.NaN.multiply(c2));
        assertEquals(Complex.INF, c1.multiply(Complex.INF));
        assertEquals(Complex.INF, Complex.INF.multiply(c2));
        assertEquals(Complex.INF, Complex.INF.multiply(Complex.INF)); // Special case
        assertEquals(Complex.ZERO, new Complex(1.0, 2.0).multiply(0.0));
    }

    @Test
    public void testNegate() {
        assertEquals(new Complex(-1.0, -2.0), new Complex(1.0, 2.0).negate());
        assertEquals(Complex.ZERO, Complex.ZERO.negate());
        assertEquals(new Complex(-1.0, 0.0), Complex.ONE.negate());
        assertEquals(new Complex(0.0, -1.0), Complex.I.negate());
        assertEquals(Complex.NaN, Complex.NaN.negate());
        assertEquals(new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), Complex.INF.negate());
    }

    @Test
    public void testSubtract() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(-2.0, -2.0);
        assertEquals(expected, c1.subtract(c2));
        assertEquals(expected, c1.subtract(3.0).subtract(new Complex(0.0, 4.0))); // subtract(double)
        assertEquals(Complex.NaN, c1.subtract(Complex.NaN));
        assertEquals(Complex.NaN, Complex.NaN.subtract(c2));
        assertEquals(Complex.NaN, c1.subtract(Complex.INF)); // INF - INF is NaN
        assertEquals(Complex.INF, Complex.INF.subtract(c2));
        assertEquals(Complex.NaN, Complex.INF.subtract(Complex.INF));
    }















    @Test
    public void testGetArgument() {
        assertEquals(0.0, Complex.ONE.getArgument(), DELTA);
        assertEquals(Math.PI / 2.0, Complex.I.getArgument(), DELTA);
        assertEquals(Math.PI, new Complex(-1.0, 0.0).getArgument(), DELTA);
        assertEquals(-Math.PI / 2.0, new Complex(0.0, -1.0).getArgument(), DELTA);
        assertEquals(Math.atan2(4.0, 3.0), new Complex(3.0, 4.0).getArgument(), DELTA);
        assertEquals(Double.NaN, Complex.NaN.getArgument(), DELTA);
        assertEquals(FastMath.atan2(Double.POSITIVE_INFINITY, 1.0), new Complex(1.0, Double.POSITIVE_INFINITY).getArgument(), DELTA);
        assertEquals(FastMath.atan2(1.0, Double.POSITIVE_INFINITY), new Complex(Double.POSITIVE_INFINITY, 1.0).getArgument(), DELTA);
    }

    @Test
    public void testNthRoot() throws NotPositiveException {
        List<Complex> roots1 = Complex.ONE.nthRoot(2);
        assertEquals(2, roots1.size());
        assertEquals(Complex.ONE, roots1.get(0));
        assertEquals(Complex.ONE.negate(), roots1.get(1));

        List<Complex> roots2 = Complex.ONE.nthRoot(3);
        assertEquals(3, roots2.size());
        assertEquals(-0.5, roots2.get(1).getReal(), DELTA);
        assertEquals(0.8660254037844386, roots2.get(1).getImaginary(), DELTA);
        assertEquals(-0.5, roots2.get(2).getReal(), DELTA);
        assertEquals(-0.8660254037844386, roots2.get(2).getImaginary(), DELTA);

        List<Complex> roots3 = Complex.I.nthRoot(2);
        assertEquals(2, roots3.size());
        assertEquals(0.7071067811865476, roots3.get(0).getReal(), DELTA);
        assertEquals(0.7071067811865476, roots3.get(0).getImaginary(), DELTA);
        assertEquals(-0.7071067811865476, roots3.get(1).getReal(), DELTA);
        assertEquals(-0.7071067811865476, roots3.get(1).getImaginary(), DELTA);

        List<Complex> nanRoots = Complex.NaN.nthRoot(2);
        assertEquals(1, nanRoots.size());
        assertEquals(Complex.NaN, nanRoots.get(0));

        List<Complex> infRoots = Complex.INF.nthRoot(2);
        assertEquals(1, infRoots.size());
        assertEquals(Complex.INF, infRoots.get(0));

        try {
            Complex.ONE.nthRoot(0);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // Expected
        }
        try {
            Complex.ONE.nthRoot(-1);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // Expected
        }
    }

    @Test
    public void testValueOf() {
        Complex c1 = Complex.valueOf(1.0, 2.0);
        assertEquals(new Complex(1.0, 2.0), c1);
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 1.0));
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN));
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, Double.NaN));

        Complex c2 = Complex.valueOf(3.0);
        assertEquals(new Complex(3.0, 0.0), c2);
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN));
    }

    @Test
    public void testToString() {
        assertEquals("(1.0, 0.0)", Complex.ONE.toString());
        assertEquals("(0.0, 1.0)", Complex.I.toString());
        assertEquals("(1.0, 2.0)", new Complex(1.0, 2.0).toString());
        assertEquals("(1.0, -2.0)", new Complex(1.0, -2.0).toString());
        assertEquals("(-1.0, 2.0)", new Complex(-1.0, 2.0).toString());
        assertEquals("(-1.0, -2.0)", new Complex(-1.0, -2.0).toString());
        assertEquals("(NaN, NaN)", Complex.NaN.toString());
        assertEquals("(Infinity, Infinity)", Complex.INF.toString());
    }
}




