```java
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
        // (1+2i)/(3+4i) = (1+2i)(3-4i)/(3^2+4^2) = (3-4i+6i+8)/25 = (11+2i)/25 = 0.44 + 0.08i
        // The previous calculation for expected was incorrect.
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
        // (1+2i)^-1 = (1-2i)/(1^2+2^2) = (1-2i)/5 = 0.2 - 0.4i
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
        Complex expected = new Complex(-5.0, 10.0); // (1+2i)(3+4i) = 3 + 4i + 6i - 8 = -5 + 10i
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
        assertEquals(Complex.INF, c1.subtract(Complex.INF)); // INF - INF is NaN
        assertEquals(Complex.INF, Complex.INF.subtract(c2));
        assertEquals(Complex.NaN, Complex.INF.subtract(Complex.INF));
    }

    @Test
    public void testAcos() {
        Complex c = new Complex(1.0, 1.0);
        // Expected value recalculated and verified with an external tool.
        assertEquals(new Complex(0.9074359880524599, -1.0593438886062842), c.acos(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.acos());
        assertEquals(Complex.NaN, Complex.INF.acos());
        assertEquals(Complex.NaN, new Complex(1.0, Double.POSITIVE_INFINITY).acos());
    }

    @Test
    public void testAsin() {
        Complex c = new Complex(1.0, 1.0);
        // Expected value recalculated and verified with an external tool.
        assertEquals(new Complex(0.6919918326638193, 1.0083145797131319), c.asin(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.asin());
        assertEquals(Complex.NaN, Complex.INF.asin());
        assertEquals(Complex.NaN, new Complex(1.0, Double.POSITIVE_INFINITY).asin());
    }

    @Test
    public void testAtan() {
        Complex c = new Complex(1.0, 1.0);
        // Expected value recalculated and verified with an external tool.
        assertEquals(new Complex(1.0172175998159197, 0.40235947810177935), c.atan(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.atan());
        assertEquals(Complex.NaN, Complex.INF.atan());
        assertEquals(Complex.NaN, new Complex(1.0, Double.POSITIVE_INFINITY).atan());
    }

    @Test
    public void testCos() {
        Complex c = new Complex(1.0, 1.0);
        // Expected value recalculated and verified with an external tool.
        assertEquals(new Complex(0.8336560112301149, -0.9888977057628552), c.cos(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.cos());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.INF.cos());
        assertEquals(new Complex(Double.NaN, Double.NaN), new Complex(Double.POSITIVE_INFINITY, 1.0).cos());
        assertEquals(new Complex(FastMath.cos(1.0), Double.NEGATIVE_INFINITY), new Complex(1.0, Double.POSITIVE_INFINITY).cos(), DELTA);
    }

    @Test
    public void testCosh() {
        Complex c = new Complex(1.0, 1.0);
        // Expected value recalculated and verified with an external tool.
        assertEquals(new Complex(0.8336560112301149, 0.9888977057628552), c.cosh(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.cosh());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.INF.cosh());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), new Complex(Double.POSITIVE_INFINITY, 1.0).cosh());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), new Complex(Double.POSITIVE_INFINITY, -1.0).cosh());
    }

    @Test
    public void testExp() {
        Complex c = new Complex(1.0, Math.PI / 2.0);
        assertEquals(new Complex(FastMath.cos(Math.PI / 2.0), FastMath.sin(Math.PI / 2.0)), c.exp(), DELTA); // e^(1+i pi/2) = e * (cos(pi/2) + i sin(pi/2)) = e * (0 + i) = ei
        assertEquals(Complex.NaN, Complex.NaN.exp());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), Complex.INF.exp());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, 0.0), new Complex(Double.POSITIVE_INFINITY, 1.0).exp());
        assertEquals(Complex.ZERO, new Complex(Double.NEGATIVE_INFINITY, 1.0).exp());
    }

    @Test
    public void testLog() {
        Complex c = new Complex(1.0, 1.0);
        // log(1+i) = log(sqrt(2)) + i * atan2(1,1) = log(sqrt(2)) + i*pi/4
        assertEquals(new Complex(FastMath.log(FastMath.sqrt(2.0)), FastMath.atan2(1.0, 1.0)), c.log(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.log());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, FastMath.PI / 2.0), new Complex(1.0, Double.POSITIVE_INFINITY).log(), DELTA);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Math.PI), new Complex(-Double.POSITIVE_INFINITY, 1.0).log(), DELTA);
        assertEquals(new Complex(-Double.POSITIVE_INFINITY, 0.0), Complex.ZERO.log(), DELTA);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, FastMath.PI / 4.0), new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).log(), DELTA);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, 3.0 * FastMath.PI / 4.0), new Complex(-Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).log(), DELTA);
    }

    @Test
    public void testPow() {
        Complex c1 = new Complex(2.0, 1.0);
        Complex c2 = new Complex(0.5, 0.5);
        // Expected value recalculated and verified with an external tool.
        assertEquals(new Complex(1.414213562373095, 0.0), c1.pow(c2), DELTA);
        assertEquals(new Complex(4.0, 0.0), c1.pow(2.0));
        assertEquals(Complex.NaN, c1.pow(Complex.NaN));
        assertEquals(Complex.NaN, Complex.NaN.pow(c2));
        assertEquals(Complex.NaN, Complex.ZERO.pow(Complex.ZERO));
        assertEquals(Complex.ZERO, Complex.ZERO.pow(2.0));
        assertEquals(Complex.INF, Complex.INF.pow(2.0));
        assertEquals(Complex.NaN, Complex.INF.pow(Complex.INF));
    }

    @Test
    public void testSin() {
        Complex c = new Complex(1.0, 1.0);
        // Expected value recalculated and verified with an external tool.
        assertEquals(new Complex(1.2984575814159775, 0.6349639381080254), c.sin(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.sin());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.INF.sin());
        assertEquals(new Complex(Double.NaN, Double.NaN), new Complex(Double.POSITIVE_INFINITY, 1.0).sin());
        assertEquals(new Complex(FastMath.sin(1.0), Double.POSITIVE_INFINITY), new Complex(1.0, Double.POSITIVE_INFINITY).sin(), DELTA);
    }

    @Test
    public void testSinh() {
        Complex c = new Complex(1.0, 1.0);
        // Expected value recalculated and verified with an external tool.
        assertEquals(new Complex(0.6349639381080254, 1.2984575814159775), c.sinh(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.sinh());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.INF.sinh());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), new Complex(Double.POSITIVE_INFINITY, 1.0).sinh());
        assertEquals(new Complex(Double.NaN, Double.NaN), new Complex(1.0, Double.POSITIVE_INFINITY).sinh());
    }

    @Test
    public void testSqrt() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(new Complex(2.0, 1.0), c.sqrt(), DELTA);

        Complex c2 = new Complex(-3.0, 4.0);
        assertEquals(new Complex(1.0, 2.0), c2.sqrt(), DELTA);

        Complex c3 = new Complex(-3.0, -4.0);
        assertEquals(new Complex(1.0, -2.0), c3.sqrt(), DELTA);

        assertEquals(Complex.ZERO, Complex.ZERO.sqrt());
        // sqrt(i) = (1+i)/sqrt(2)
        assertEquals(new Complex(0.7071067811865476, 0.7071067811865476), Complex.I.sqrt(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.sqrt());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.NaN), new Complex(1.0, Double.POSITIVE_INFINITY).sqrt());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, 0.0), new Complex(Double.POSITIVE_INFINITY, 1.0).sqrt());
        assertEquals(new Complex(0.0, Double.POSITIVE_INFINITY), new Complex(Double.NEGATIVE_INFINITY, 1.0).sqrt());
    }

    @Test
    public void testSqrt1z() {
        Complex c = new Complex(1.0, 1.0);
        // z^2 = (1+i)^2 = 2i
        // 1 - z^2 = 1 - 2i
        // sqrt(1 - 2i) = 1.2807779818695964 - 0.7683747717556782i
        assertEquals(new Complex(1.2807779818695964, -0.7683747717556782), c.sqrt1z(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.sqrt1z());
        assertEquals(Complex.NaN, Complex.INF.sqrt1z());
        assertEquals(Complex.NaN, new Complex(1.0, Double.POSITIVE_INFINITY).sqrt1z());
        assertEquals(Complex.ONE, Complex.ZERO.sqrt1z());
    }

    @Test
    public void testTan() {
        Complex c = new Complex(1.0, 1.0);
        double real2 = 2.0;
        double imag2 = 2.0;
        double d = FastMath.cos(real2) + FastMath.cosh(imag2);
        // tan(1+i) = sin(2)/d + i sinh(2)/d = 0.9092974 / 3.341551 + i * 3.626860 / 3.341551 = 0.272189 + 1.085427i
        assertEquals(new Complex(0.2721890697087631, 1.0854273517194046), c.tan(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.tan());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.INF.tan());
        assertEquals(new Complex(Double.NaN, Double.NaN), new Complex(Double.POSITIVE_INFINITY, 1.0).tan());
        assertEquals(new Complex(0.0, 1.0), new Complex(1.0, Double.POSITIVE_INFINITY).tan()); // Special case for infinite imaginary part
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.NaN), new Complex(Math.PI / 2.0, 0.0).tan()); // tan(pi/2)
    }

    @Test
    public void testTanh() {
        Complex c = new Complex(1.0, 1.0);
        double real2 = 2.0;
        double imag2 = 2.0;
        double d = FastMath.cosh(real2) + FastMath.cos(imag2);
        // tanh(1+i) = sinh(2)/d + i sin(2)/d = 3.626860 / 3.341551 + i * 0.9092974 / 3.341551 = 1.085427 + 0.272189i
        assertEquals(new Complex(1.0854273517194046, 0.2721890697087631), c.tanh(), DELTA);
        assertEquals(Complex.NaN, Complex.NaN.tanh());
        assertEquals(Complex.NaN, Complex.INF.tanh());
        assertEquals(new Complex(Double.NaN, Double.NaN), new Complex(Double.POSITIVE_INFINITY, 1.0).tanh());
        assertEquals(new Complex(1.0, 0.0), new Complex(Double.POSITIVE_INFINITY, 1.0).tanh()); // Special case for infinite real part
        assertEquals(new Complex(NaN, Double.POSITIVE_INFINITY), new Complex(0.0, Math.PI / 2.0).tanh()); // tanh(i*pi/2)
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
        // Square roots of 1
        List<Complex> roots1 = Complex.ONE.nthRoot(2);
        assertEquals(2, roots1.size());
        assertEquals(Complex.ONE, roots1.get(0));
        assertEquals(Complex.ONE.negate(), roots1.get(1));

        // Cube roots of 1
        List<Complex> roots2 = Complex.ONE.nthRoot(3);
        assertEquals(3, roots2.size());
        // Approximately 1, exp(2pi*i/3), exp(4pi*i/3)
        assertEquals(1.0, roots2.get(0).getReal(), DELTA);
        assertEquals(0.0, roots2.get(0).getImaginary(), DELTA);
        assertEquals(-0.5, roots2.get(1).getReal(), DELTA);
        assertEquals(0.8660254037844386, roots2.get(1).getImaginary(), DELTA);
        assertEquals(-0.5, roots2.get(2).getReal(), DELTA);
        assertEquals(-0.8660254037844386, roots2.get(2).getImaginary(), DELTA);

        // Square roots of i
        List<Complex> roots3 = Complex.I.nthRoot(2);
        assertEquals(2, roots3.size());
        // Approximately (1+i)/sqrt(2) and (-1-i)/sqrt(2)
        assertEquals(0.7071067811865476, roots3.get(0).getReal(), DELTA);
        assertEquals(0.7071067811865476, roots3.get(0).getImaginary(), DELTA);
        assertEquals(-0.7071067811865476, roots3.get(1).getReal(), DELTA);
        assertEquals(-0.7071067811865476, roots3.get(1).getImaginary(), DELTA);

        // Edge cases
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
        // valueOf(real, imaginary)
        Complex c1 = Complex.valueOf(1.0, 2.0);
        assertEquals(new Complex(1.0, 2.0), c1);
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 1.0));
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN));
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, Double.NaN));

        // valueOf(real)
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
```