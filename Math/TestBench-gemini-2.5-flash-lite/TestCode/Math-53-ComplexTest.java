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
    /**
     * Test for {@link Complex#abs()}.
     */
    @Test
    public void testAbs() {
        assertEquals(0.0, Complex.ZERO.abs(), 1e-15);
        assertEquals(1.0, Complex.ONE.abs(), 1e-15);
        assertEquals(1.0, Complex.I.abs(), 1e-15);
        assertEquals(Math.sqrt(2.0), new Complex(1.0, 1.0).abs(), 1e-15);
        assertEquals(Math.sqrt(5.0), new Complex(2.0, 1.0).abs(), 1e-15);
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), 1e-15);
        assertEquals(Double.NaN, Complex.NaN.abs(), 1e-15);
    }

    /**
     * Test for {@link Complex#add(Complex)}.
     */
    @Test
    public void testAdd() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(4.0, 6.0);
        assertEquals(expected, c1.add(c2));

        assertEquals(Complex.ONE, Complex.ZERO.add(Complex.ONE));
        assertEquals(Complex.I, Complex.ZERO.add(Complex.I));
        assertEquals(Complex.NaN, Complex.ONE.add(Complex.NaN));
        assertEquals(Complex.NaN, Complex.NaN.add(Complex.ONE));
        assertEquals(Complex.INF, Complex.ONE.add(Complex.INF));
        assertEquals(Complex.INF, Complex.INF.add(Complex.ONE));
        assertEquals(Complex.INF, Complex.INF.add(Complex.INF));
    }

    /**
     * Test for {@link Complex#conjugate()}.
     */
    @Test
    public void testConjugate() {
        assertEquals(Complex.ZERO, Complex.ZERO.conjugate());
        assertEquals(Complex.ONE, Complex.ONE.conjugate());
        assertEquals(Complex.I.negate(), Complex.I.conjugate()); // 0 - 1i
        assertEquals(new Complex(1.0, -2.0), new Complex(1.0, 2.0).conjugate());
        assertEquals(Complex.NaN, Complex.NaN.conjugate());
        assertEquals(new Complex(1.0, Double.NEGATIVE_INFINITY), new Complex(1.0, Double.POSITIVE_INFINITY).conjugate());
    }

    /**
     * Test for {@link Complex#divide(Complex)}.
     */
    @Test
    public void testDivide() {
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(4.0, 5.0);
        // (2+3i)/(4+5i) = (2*4+3*5 + (3*4-2*5)i) / (4^2+5^2) = (8+15 + (12-10)i) / 16+25 = (23 + 2i) / 41
        Complex expected = new Complex(23.0 / 41.0, 2.0 / 41.0);
        assertEquals(expected, c1.divide(c2));

        assertEquals(Complex.ZERO, Complex.ZERO.divide(Complex.ONE));
        assertEquals(Complex.NaN, Complex.ONE.divide(Complex.ZERO));
        assertEquals(Complex.NaN, Complex.ONE.divide(Complex.NaN));
        assertEquals(Complex.NaN, Complex.NaN.divide(Complex.ONE));
        assertEquals(Complex.NaN, Complex.NaN.divide(Complex.NaN));
        assertEquals(Complex.ZERO, Complex.ONE.divide(Complex.INF));
        assertEquals(Complex.ZERO, Complex.INF.divide(Complex.ONE));
        assertEquals(Complex.NaN, Complex.INF.divide(Complex.INF));
    }

    /**
     * Test for {@link Complex#equals(Object)}.
     */
    @Test
    public void testEquals() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(1.0, 3.0);
        Complex c4 = new Complex(2.0, 2.0);

        assertEquals(c1, c2);
        assertNotEquals(c1, c3);
        assertNotEquals(c1, c4);
        assertNotEquals(c1, null);
        assertNotEquals(c1, new Object());

        assertEquals(Complex.NaN, Complex.NaN); // NaN == NaN
        assertEquals(Complex.INF, Complex.INF);

        // Test with NaN in one part
        Complex nan1 = new Complex(Double.NaN, 2.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        Complex nan3 = new Complex(Double.NaN, Double.NaN);
        assertEquals(Complex.NaN, nan1);
        assertEquals(Complex.NaN, nan2);
        assertEquals(Complex.NaN, nan3);
    }

    /**
     * Test for {@link Complex#hashCode()}.
     */
    @Test
    public void testHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(2.0, 1.0);

        assertEquals(c1.hashCode(), c2.hashCode());
        assertNotEquals(c1.hashCode(), c3.hashCode());
        assertEquals(Complex.NaN.hashCode(), Complex.NaN.hashCode());
    }

    /**
     * Test for {@link Complex#getImaginary()} and {@link Complex#getReal()}.
     */
    @Test
    public void testGetters() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), 1e-15);
        assertEquals(4.0, c.getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#isNaN()}.
     */
    @Test
    public void testIsNaN() {
        assertTrue(Complex.NaN.isNaN());
        assertTrue(new Complex(Double.NaN, 1.0).isNaN());
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
        assertTrue(new Complex(Double.NaN, Double.NaN).isNaN());
        assertFalse(Complex.ZERO.isNaN());
        assertFalse(Complex.ONE.isNaN());
        assertFalse(Complex.INF.isNaN());
    }

    /**
     * Test for {@link Complex#isInfinite()}.
     */
    @Test
    public void testIsInfinite() {
        assertTrue(Complex.INF.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).isInfinite());
        assertTrue(new Complex(1.0, Double.NEGATIVE_INFINITY).isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).isInfinite());
        assertFalse(Complex.ZERO.isInfinite());
        assertFalse(Complex.ONE.isInfinite());
        assertFalse(Complex.NaN.isInfinite());
    }

    /**
     * Test for {@link Complex#multiply(Complex)}.
     */
    @Test
    public void testMultiplyComplex() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        // (1+2i)(3+4i) = (1*3 - 2*4) + (1*4 + 2*3)i = (3 - 8) + (4 + 6)i = -5 + 10i
        Complex expected = new Complex(-5.0, 10.0);
        assertEquals(expected, c1.multiply(c2));

        assertEquals(Complex.ZERO, Complex.ZERO.multiply(Complex.ONE));
        assertEquals(Complex.ZERO, Complex.ONE.multiply(Complex.ZERO));
        assertEquals(Complex.NaN, Complex.ONE.multiply(Complex.NaN));
        assertEquals(Complex.NaN, Complex.NaN.multiply(Complex.ONE));
        assertEquals(Complex.INF, Complex.ONE.multiply(Complex.INF));
        assertEquals(Complex.INF, Complex.INF.multiply(Complex.ONE));
        assertEquals(Complex.INF, Complex.INF.multiply(Complex.INF));
    }

    /**
     * Test for {@link Complex#multiply(double)}.
     */
    @Test
    public void testMultiplyDouble() {
        Complex c1 = new Complex(1.0, 2.0);
        double scalar = 3.0;
        Complex expected = new Complex(3.0, 6.0);
        assertEquals(expected, c1.multiply(scalar));

        assertEquals(Complex.ZERO, Complex.ZERO.multiply(3.0));
        assertEquals(Complex.ZERO, Complex.ONE.multiply(0.0));
        assertEquals(Complex.NaN, Complex.ONE.multiply(Double.NaN));
        assertEquals(Complex.NaN, Complex.NaN.multiply(3.0));
        assertEquals(Complex.INF, Complex.ONE.multiply(Double.POSITIVE_INFINITY));
        assertEquals(Complex.INF, Complex.INF.multiply(3.0));
        assertEquals(Complex.INF, Complex.INF.multiply(Double.POSITIVE_INFINITY));
    }

    /**
     * Test for {@link Complex#negate()}.
     */
    @Test
    public void testNegate() {
        assertEquals(Complex.ZERO, Complex.ZERO.negate());
        assertEquals(Complex.ONE.negate(), new Complex(-1.0, 0.0));
        assertEquals(Complex.I.negate(), new Complex(0.0, -1.0));
        assertEquals(new Complex(-1.0, -2.0), new Complex(1.0, 2.0).negate());
        assertEquals(Complex.NaN, Complex.NaN.negate());
        assertEquals(new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), Complex.INF.negate());
    }

    /**
     * Test for {@link Complex#subtract(Complex)}.
     */
    @Test
    public void testSubtract() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(-2.0, -2.0);
        assertEquals(expected, c1.subtract(c2));

        assertEquals(Complex.ZERO, Complex.ONE.subtract(Complex.ONE));
        assertEquals(Complex.I.negate(), Complex.ZERO.subtract(Complex.I));
        assertEquals(Complex.NaN, Complex.ONE.subtract(Complex.NaN));
        assertEquals(Complex.NaN, Complex.NaN.subtract(Complex.ONE));
        assertEquals(Complex.INF.negate(), Complex.ONE.subtract(Complex.INF));
        assertEquals(Complex.INF.negate(), Complex.INF.subtract(Complex.ONE));
        assertEquals(Complex.NaN, Complex.INF.subtract(Complex.INF));
    }

    /**
     * Test for {@link Complex#acos()}.
     */
    @Test
    public void testAcos() {
        assertEquals(Complex.NaN, Complex.NaN.acos());
        assertEquals(Complex.NaN, Complex.INF.acos());

        // acos(0) = PI/2
        assertEquals(FastMath.PI / 2.0, Complex.ZERO.acos().getReal(), 1e-15);
        assertEquals(0.0, Complex.ZERO.acos().getImaginary(), 1e-15);

        // acos(1) = 0
        assertEquals(0.0, Complex.ONE.acos().getReal(), 1e-15);
        assertEquals(0.0, Complex.ONE.acos().getImaginary(), 1e-15);

        // acos(-1) = PI
        assertEquals(FastMath.PI, Complex.ONE.negate().acos().getReal(), 1e-15);
        assertEquals(0.0, Complex.ONE.negate().acos().getImaginary(), 1e-15);

        // acos(i) = PI/2 - i*log(sqrt(2)+1)
        Complex i = Complex.I;
        double expectedReal = FastMath.PI / 2.0;
        double expectedImaginary = -FastMath.log(Math.sqrt(2.0) + 1.0);
        assertEquals(expectedReal, i.acos().getReal(), 1e-15);
        assertEquals(expectedImaginary, i.acos().getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#asin()}.
     */
    @Test
    public void testAsin() {
        assertEquals(Complex.NaN, Complex.NaN.asin());
        assertEquals(Complex.NaN, Complex.INF.asin());

        // asin(0) = 0
        assertEquals(0.0, Complex.ZERO.asin().getReal(), 1e-15);
        assertEquals(0.0, Complex.ZERO.asin().getImaginary(), 1e-15);

        // asin(1) = PI/2
        assertEquals(FastMath.PI / 2.0, Complex.ONE.asin().getReal(), 1e-15);
        assertEquals(0.0, Complex.ONE.asin().getImaginary(), 1e-15);

        // asin(-1) = -PI/2
        assertEquals(-FastMath.PI / 2.0, Complex.ONE.negate().asin().getReal(), 1e-15);
        assertEquals(0.0, Complex.ONE.negate().asin().getImaginary(), 1e-15);

        // asin(i) = i * log(sqrt(2)+1)
        Complex i = Complex.I;
        double expectedReal = 0.0;
        double expectedImaginary = FastMath.log(Math.sqrt(2.0) + 1.0);
        assertEquals(expectedReal, i.asin().getReal(), 1e-15);
        assertEquals(expectedImaginary, i.asin().getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#atan()}.
     */

    /**
     * Test for {@link Complex#cos()}.
     */
    @Test
    public void testCos() {
        assertEquals(Complex.NaN, Complex.NaN.cos());
        assertEquals(Complex.NaN, Complex.INF.cos());

        // cos(0) = 1
        assertEquals(1.0, Complex.ZERO.cos().getReal(), 1e-15);
        assertEquals(0.0, Complex.ZERO.cos().getImaginary(), 1e-15);

        // cos(PI) = -1
        assertEquals(-1.0, new Complex(FastMath.PI, 0.0).cos().getReal(), 1e-15);
        assertEquals(0.0, new Complex(FastMath.PI, 0.0).cos().getImaginary(), 1e-15);

        // cos(PI/2) = 0
        assertEquals(0.0, new Complex(FastMath.PI / 2.0, 0.0).cos().getReal(), 1e-15);
        assertEquals(0.0, new Complex(FastMath.PI / 2.0, 0.0).cos().getImaginary(), 1e-15);

        // cos(i) = cosh(1)
        assertEquals(MathUtils.cosh(1.0), Complex.I.cos().getReal(), 1e-15);
        assertEquals(0.0, Complex.I.cos().getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#cosh()}.
     */
    @Test
    public void testCosh() {
        assertEquals(Complex.NaN, Complex.NaN.cosh());
        assertEquals(Complex.NaN, Complex.INF.cosh());

        // cosh(0) = 1
        assertEquals(1.0, Complex.ZERO.cosh().getReal(), 1e-15);
        assertEquals(0.0, Complex.ZERO.cosh().getImaginary(), 1e-15);

        // cosh(i) = cos(1)
        assertEquals(FastMath.cos(1.0), Complex.I.cosh().getReal(), 1e-15);
        assertEquals(0.0, Complex.I.cosh().getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#exp()}.
     */

    /**
     * Test for {@link Complex#log()}.
     */

    /**
     * Test for {@link Complex#pow(Complex)}.
     */
    @Test
    public void testPowComplex() {
        // Test with base 0
        assertEquals(Complex.ZERO, Complex.ZERO.pow(Complex.ONE));
        assertEquals(Complex.NaN, Complex.ZERO.pow(Complex.ZERO)); // 0^0 is NaN
        assertEquals(Complex.ZERO, Complex.ZERO.pow(Complex.I)); // 0^i should be 0

        // Test with exponent 0
        assertEquals(Complex.ONE, Complex.ONE.pow(Complex.ZERO));
        assertEquals(Complex.ONE, Complex.I.pow(Complex.ZERO));
        assertEquals(Complex.ONE, Complex.NaN.pow(Complex.ZERO)); // NaN^0 is 1

        // Test with exponent 1
        assertEquals(Complex.ONE, Complex.ONE.pow(Complex.ONE));
        assertEquals(Complex.I, Complex.I.pow(Complex.ONE));
        assertEquals(Complex.NaN, Complex.NaN.pow(Complex.ONE));

        // Test with base 1
        assertEquals(Complex.ONE, Complex.ONE.pow(Complex.ONE));
        assertEquals(Complex.ONE, Complex.ONE.pow(Complex.I));
        assertEquals(Complex.ONE, Complex.ONE.pow(Complex.NaN));

        // Test with base i
        // i^2 = -1
        assertEquals(Complex.ONE.negate(), Complex.I.pow(Complex.ONE.add(Complex.ONE)));
        // i^i = exp(-PI/2)
        assertEquals(FastMath.exp(-FastMath.PI / 2.0), Complex.I.pow(Complex.I).getReal(), 1e-15);
        assertEquals(0.0, Complex.I.pow(Complex.I).getImaginary(), 1e-15);

        // Test for NaN and Infinity cases
        assertEquals(Complex.NaN, Complex.NaN.pow(Complex.NaN));
        assertEquals(Complex.NaN, Complex.ONE.pow(Complex.NaN)); // 1^NaN is NaN
        assertEquals(Complex.NaN, Complex.NaN.pow(Complex.ONE)); // NaN^1 is NaN
        assertEquals(Complex.INF, Complex.INF.pow(Complex.ONE)); // INF^1 is INF
        assertEquals(Complex.NaN, Complex.ONE.pow(Complex.INF)); // 1^INF is NaN
    }

    /**
     * Test for {@link Complex#sin()}.
     */
    @Test
    public void testSin() {
        assertEquals(Complex.NaN, Complex.NaN.sin());
        assertEquals(Complex.NaN, Complex.INF.sin());

        // sin(0) = 0
        assertEquals(0.0, Complex.ZERO.sin().getReal(), 1e-15);
        assertEquals(0.0, Complex.ZERO.sin().getImaginary(), 1e-15);

        // sin(PI) = 0
        assertEquals(0.0, new Complex(FastMath.PI, 0.0).sin().getReal(), 1e-15);
        assertEquals(0.0, new Complex(FastMath.PI, 0.0).sin().getImaginary(), 1e-15);

        // sin(PI/2) = 1
        assertEquals(1.0, new Complex(FastMath.PI / 2.0, 0.0).sin().getReal(), 1e-15);
        assertEquals(0.0, new Complex(FastMath.PI / 2.0, 0.0).sin().getImaginary(), 1e-15);

        // sin(i) = i*sinh(1)
        assertEquals(0.0, Complex.I.sin().getReal(), 1e-15);
        assertEquals(MathUtils.sinh(1.0), Complex.I.sin().getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#sinh()}.
     */
    @Test
    public void testSinh() {
        assertEquals(Complex.NaN, Complex.NaN.sinh());
        assertEquals(Complex.NaN, Complex.INF.sinh());

        // sinh(0) = 0
        assertEquals(0.0, Complex.ZERO.sinh().getReal(), 1e-15);
        assertEquals(0.0, Complex.ZERO.sinh().getImaginary(), 1e-15);

        // sinh(i) = i*sin(1)
        assertEquals(0.0, Complex.I.sinh().getReal(), 1e-15);
        assertEquals(FastMath.sin(1.0), Complex.I.sinh().getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#sqrt()}.
     */
    @Test
    public void testSqrt() {
        assertEquals(Complex.ZERO, Complex.ZERO.sqrt());
        assertEquals(Complex.ONE, Complex.ONE.sqrt());
        // sqrt(-1) = i, but can also be -i. The implementation returns i.
        assertEquals(Complex.I, new Complex(-1.0, 0.0).sqrt());
        assertEquals(Complex.NaN, Complex.NaN.sqrt());
        assertEquals(Complex.INF, Complex.INF.sqrt());

        // sqrt(i) = (1+i)/sqrt(2)
        Complex sqrtI_expected = new Complex(FastMath.cos(FastMath.PI / 4.0), FastMath.sin(FastMath.PI / 4.0));
        Complex sqrtI_actual = Complex.I.sqrt();
        assertEquals(sqrtI_expected.getReal(), sqrtI_actual.getReal(), 1e-15);
        assertEquals(sqrtI_expected.getImaginary(), sqrtI_actual.getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#sqrt1z()}.
     */
    @Test
    public void testSqrt1z() {
        // sqrt(1-z^2)
        Complex one = Complex.ONE;
        Complex i = Complex.I;

        // sqrt(1-0^2) = sqrt(1) = 1
        assertEquals(one, Complex.ZERO.sqrt1z());

        // sqrt(1-1^2) = sqrt(0) = 0
        assertEquals(Complex.ZERO, one.sqrt1z());

        // sqrt(1-i^2) = sqrt(1 - (-1)) = sqrt(2)
        assertEquals(Complex.ONE.add(Complex.ONE), Complex.I.sqrt1z());
    }

    /**
     * Test for {@link Complex#tan()}.
     */

    /**
     * Test for {@link Complex#tanh()}.
     */
    @Test
    public void testTanh() {
        assertEquals(Complex.NaN, Complex.NaN.tanh());
        assertEquals(Complex.NaN, Complex.INF.tanh());

        // tanh(0) = 0
        assertEquals(0.0, Complex.ZERO.tanh().getReal(), 1e-15);
        assertEquals(0.0, Complex.ZERO.tanh().getImaginary(), 1e-15);

        // tanh(i) = i*tan(1)
        assertEquals(0.0, Complex.I.tanh().getReal(), 1e-15);
        assertEquals(FastMath.tan(1.0), Complex.I.tanh().getImaginary(), 1e-15);
    }

    /**
     * Test for {@link Complex#getArgument()}.
     */
    @Test
    public void testGetArgument() {
        assertEquals(0.0, Complex.ONE.getArgument(), 1e-15);
        assertEquals(FastMath.PI / 2.0, Complex.I.getArgument(), 1e-15);
        assertEquals(FastMath.PI, Complex.ONE.negate().getArgument(), 1e-15);
        assertEquals(-FastMath.PI / 2.0, Complex.I.negate().getArgument(), 1e-15);
        assertEquals(FastMath.PI / 4.0, new Complex(1.0, 1.0).getArgument(), 1e-15);
        assertEquals(Double.NaN, Complex.NaN.getArgument(), 1e-15);
        assertEquals(FastMath.PI / 2.0, Complex.INF.getArgument(), 1e-15); // atan2(inf, inf) is pi/2
    }

    /**
     * Test for {@link Complex#nthRoot(int)}.
     */
    @Test
    public void testNthRoot() {
        // nthRoot of 0 is 0
        List<Complex> rootsOfZero = Complex.ZERO.nthRoot(3);
        assertEquals(1, rootsOfZero.size());
        assertEquals(Complex.ZERO, rootsOfZero.get(0));

        // nthRoot of 1 is 1
        List<Complex> rootsOfOne = Complex.ONE.nthRoot(3);
        assertEquals(3, rootsOfOne.size());
        assertEquals(Complex.ONE, rootsOfOne.get(0));
        // Check other roots of unity
        Complex w1 = new Complex(Math.cos(2 * Math.PI / 3), Math.sin(2 * Math.PI / 3));
        Complex w2 = new Complex(Math.cos(4 * Math.PI / 3), Math.sin(4 * Math.PI / 3));
        assertTrue(w1.equals(rootsOfOne.get(1)) || w1.equals(rootsOfOne.get(2)));
        assertTrue(w2.equals(rootsOfOne.get(1)) || w2.equals(rootsOfOne.get(2)));

        // nthRoot of i
        List<Complex> rootsOfI = Complex.I.nthRoot(2);
        assertEquals(2, rootsOfI.size());
        Complex sqrtI_val1 = new Complex(FastMath.cos(FastMath.PI / 4.0), FastMath.sin(FastMath.PI / 4.0));
        Complex sqrtI_val2 = new Complex(FastMath.cos(5.0 * FastMath.PI / 4.0), FastMath.sin(5.0 * FastMath.PI / 4.0));
        assertTrue(sqrtI_val1.equals(rootsOfI.get(0)) || sqrtI_val1.equals(rootsOfI.get(1)));
        assertTrue(sqrtI_val2.equals(rootsOfI.get(0)) || sqrtI_val2.equals(rootsOfI.get(1)));

        // nthRoot of NaN is NaN
        List<Complex> rootsOfNaN = Complex.NaN.nthRoot(3);
        assertEquals(1, rootsOfNaN.size());
        assertEquals(Complex.NaN, rootsOfNaN.get(0));

        // nthRoot of INF is INF
        List<Complex> rootsOfINF = Complex.INF.nthRoot(3);
        assertEquals(1, rootsOfINF.size());
        assertEquals(Complex.INF, rootsOfINF.get(0));

        // Test invalid n
        try {
            Complex.ONE.nthRoot(0);
            fail("Expected IllegalArgumentException for n=0");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            Complex.ONE.nthRoot(-1);
            fail("Expected IllegalArgumentException for n=-1");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    /**
     * Test for {@link Complex#getField()}.
     */
    @Test
    public void testGetField() {
        assertEquals(ComplexField.getInstance(), Complex.ONE.getField());
    }

    /**
     * Test for {@link Complex#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals("(1.0, 2.0)", new Complex(1.0, 2.0).toString());
        assertEquals("(0.0, 0.0)", Complex.ZERO.toString());
        assertEquals("(1.0, 0.0)", Complex.ONE.toString());
        assertEquals("(0.0, 1.0)", Complex.I.toString());
        assertEquals("(NaN, NaN)", Complex.NaN.toString());
        assertEquals("(Infinity, Infinity)", Complex.INF.toString());
    }
}

