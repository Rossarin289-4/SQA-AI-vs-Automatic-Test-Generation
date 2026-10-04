The `assertEquals` method has multiple overloads. When comparing two `Complex` objects, you should use the overload that takes two `Complex` objects and an optional delta for floating-point comparisons. The compiler error indicates that it's trying to use an `assertEquals` overload that expects primitive types or arrays, which is incorrect for comparing `Complex` objects.

To fix this, replace `assertEquals(expected, c1.divide(c2), 1e-9)` with `assertEquals(expected.getReal(), c1.divide(c2).getReal(), 1e-9)` and `assertEquals(expected.getImaginary(), c1.divide(c2).getImaginary(), 1e-9)`. Do this for all other comparisons between `Complex` objects where a `double` tolerance is provided.

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

    @Test
    public void testAbs() {
        assertEquals(1.0, new Complex(1.0, 0.0).abs(), 1e-9);
        assertEquals(1.0, new Complex(0.0, 1.0).abs(), 1e-9);
        assertEquals(FastMath.sqrt(2.0), new Complex(1.0, 1.0).abs(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), 1e-9);
        assertEquals(Double.NaN, Complex.NaN.abs(), 1e-9);
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), 1e-9);
        assertEquals(5.0, new Complex(-3.0, -4.0).abs(), 1e-9);
        assertEquals(5.0, new Complex(-3.0, 4.0).abs(), 1e-9);
        assertEquals(5.0, new Complex(3.0, -4.0).abs(), 1e-9);
    }

    @Test
    public void testAdd() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(4.0, 6.0);
        assertEquals(expected.getReal(), c1.add(c2).getReal(), 1e-9);
        assertEquals(expected.getImaginary(), c1.add(c2).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.add(c2));
        assertEquals(Complex.NaN, c1.add(Complex.NaN));
        assertEquals(Complex.INF, Complex.INF.add(c2));
        assertEquals(Complex.INF, c1.add(Complex.INF));
        assertEquals(new Complex(1.0, 2.0).getReal(), c1.add(0.0).getReal(), 1e-9);
        assertEquals(new Complex(1.0, 2.0).getImaginary(), c1.add(0.0).getImaginary(), 1e-9);
        assertEquals(new Complex(1.0, 2.0).getReal(), c1.add(Complex.ZERO).getReal(), 1e-9);
        assertEquals(new Complex(1.0, 2.0).getImaginary(), c1.add(Complex.ZERO).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.add(0.0));
    }

    @Test
    public void testConjugate() {
        assertEquals(new Complex(1.0, -2.0).getReal(), new Complex(1.0, 2.0).conjugate().getReal(), 1e-9);
        assertEquals(new Complex(1.0, -2.0).getImaginary(), new Complex(1.0, 2.0).conjugate().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.conjugate());
        assertEquals(Complex.INF, Complex.INF.conjugate());
        assertEquals(new Complex(1.0, Double.NEGATIVE_INFINITY).getReal(), new Complex(1.0, Double.POSITIVE_INFINITY).conjugate().getReal(), 1e-9);
        assertEquals(new Complex(1.0, Double.NEGATIVE_INFINITY).getImaginary(), new Complex(1.0, Double.POSITIVE_INFINITY).conjugate().getImaginary(), 1e-9);
    }

    @Test
    public void testDivide() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        // (1+2i)/(3+4i) = (1+2i)*(3-4i) / (3^2+4^2) = (3 - 4i + 6i - 8i^2) / 25 = (3+8 + 2i) / 25 = 11/25 + 2i/25
        Complex expected = new Complex(11.0/25.0, 2.0/25.0);
        assertEquals(expected.getReal(), c1.divide(c2).getReal(), 1e-9);
        assertEquals(expected.getImaginary(), c1.divide(c2).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.divide(c2));
        assertEquals(Complex.NaN, c1.divide(Complex.NaN));
        assertEquals(Complex.INF, Complex.ONE.divide(Complex.ZERO));
        assertEquals(Complex.NaN, Complex.ZERO.divide(Complex.ZERO));
        assertEquals(Complex.ZERO, Complex.ONE.divide(Complex.INF));
        assertEquals(new Complex(2.0, 0.0).getReal(), c1.divide(0.5).getReal(), 1e-9);
        assertEquals(new Complex(2.0, 0.0).getImaginary(), c1.divide(0.5).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.divide(0.5));
    }

    @Test
    public void testEquals() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(3.0, 4.0);
        Complex nan1 = new Complex(Double.NaN, 1.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        Complex nan3 = new Complex(Double.NaN, Double.NaN);
        Complex nan4 = new Complex(Double.NaN, 1.0);

        assertTrue(c1.equals(c2));
        assertFalse(c1.equals(c3));
        assertFalse(c1.equals(null));
        assertFalse(c1.equals(new Object()));
        assertTrue(nan1.equals(nan4));
        assertTrue(nan1.equals(nan3));
        assertTrue(nan2.equals(nan3));
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
        Complex c = new Complex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 1e-9);
        assertEquals(2.0, c.getImaginary(), 1e-9);
    }

    @Test
    public void testIsNaN() {
        assertTrue(Complex.NaN.isNaN());
        assertTrue(new Complex(Double.NaN, 1.0).isNaN());
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
        assertFalse(new Complex(1.0, 2.0).isNaN());
    }

    @Test
    public void testIsInfinite() {
        assertTrue(Complex.INF.isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).isInfinite());
        assertTrue(new Complex(1.0, Double.NEGATIVE_INFINITY).isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).isInfinite());
        assertFalse(new Complex(1.0, 2.0).isInfinite());
        assertFalse(Complex.NaN.isInfinite());
        assertFalse(new Complex(Double.NaN, Double.POSITIVE_INFINITY).isInfinite());
    }

    @Test
    public void testMultiply() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        // (1+2i)*(3+4i) = 3 + 4i + 6i + 8i^2 = 3 - 8 + 10i = -5 + 10i
        Complex expected = new Complex(-5.0, 10.0);
        assertEquals(expected.getReal(), c1.multiply(c2).getReal(), 1e-9);
        assertEquals(expected.getImaginary(), c1.multiply(c2).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.multiply(c2));
        assertEquals(Complex.NaN, c1.multiply(Complex.NaN));
        assertEquals(Complex.INF, Complex.INF.multiply(c2));
        assertEquals(Complex.INF, c1.multiply(Complex.INF));
        assertEquals(new Complex(2.0, 4.0).getReal(), c1.multiply(2.0).getReal(), 1e-9);
        assertEquals(new Complex(2.0, 4.0).getImaginary(), c1.multiply(2.0).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.multiply(2.0));
    }

    @Test
    public void testNegate() {
        assertEquals(new Complex(-1.0, -2.0).getReal(), new Complex(1.0, 2.0).negate().getReal(), 1e-9);
        assertEquals(new Complex(-1.0, -2.0).getImaginary(), new Complex(1.0, 2.0).negate().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.negate());
        assertEquals(new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY).getReal(), Complex.INF.negate().getReal(), 1e-9);
        assertEquals(new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY).getImaginary(), Complex.INF.negate().getImaginary(), 1e-9);
    }

    @Test
    public void testSubtract() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex expected = new Complex(-2.0, -2.0);
        assertEquals(expected.getReal(), c1.subtract(c2).getReal(), 1e-9);
        assertEquals(expected.getImaginary(), c1.subtract(c2).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.subtract(c2));
        assertEquals(Complex.NaN, c1.subtract(Complex.NaN));
        assertEquals(Complex.INF, Complex.INF.subtract(c2));
        assertEquals(Complex.INF, c1.subtract(Complex.INF));
        assertEquals(new Complex(-2.0, -2.0).getReal(), c1.subtract(3.0).getReal(), 1e-9);
        assertEquals(new Complex(-2.0, -2.0).getImaginary(), c1.subtract(3.0).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.subtract(3.0));
    }

    @Test
    public void testAcos() {
        // acos(z) = -i * log(z + i*sqrt(1-z^2))
        // Example: acos(1) = 0
        assertEquals(Complex.ONE.getReal(), Complex.ONE.acos().getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), Complex.ONE.acos().getImaginary(), 1e-9);
        // acos(0) = PI/2
        assertEquals(new Complex(FastMath.PI / 2.0, 0.0).getReal(), Complex.ZERO.acos().getReal(), 1e-9);
        assertEquals(new Complex(FastMath.PI / 2.0, 0.0).getImaginary(), Complex.ZERO.acos().getImaginary(), 1e-9);
        // acos(i) = -i*log(i + sqrt(2))
        Complex iPlusSqrt2 = Complex.I.add(new Complex(FastMath.sqrt(2.0), 0.0));
        Complex expectedIacos = new Complex(0.0, -FastMath.log(iPlusSqrt2.abs())); // arg(i + sqrt(2)) is 0
        assertEquals(expectedIacos.getReal(), Complex.I.acos().getReal(), 1e-9);
        assertEquals(expectedIacos.getImaginary(), Complex.I.acos().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.acos());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(Double.POSITIVE_INFINITY, 0).acos());
    }

    @Test
    public void testAsin() {
        // asin(z) = -i * log(sqrt(1-z^2) + i*z)
        // Example: asin(0) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ZERO.asin().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ZERO.asin().getImaginary(), 1e-9);
        // asin(1) = PI/2
        assertEquals(new Complex(FastMath.PI / 2.0, 0.0).getReal(), Complex.ONE.asin().getReal(), 1e-9);
        assertEquals(new Complex(FastMath.PI / 2.0, 0.0).getImaginary(), Complex.ONE.asin().getImaginary(), 1e-9);
        // asin(i) = -i*log(sqrt(2) - 1)
        Complex expectedIasin = new Complex(0.0, -FastMath.log(FastMath.sqrt(2.0) - 1.0));
        assertEquals(expectedIasin.getReal(), Complex.I.asin().getReal(), 1e-9);
        assertEquals(expectedIasin.getImaginary(), Complex.I.asin().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.asin());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(Double.POSITIVE_INFINITY, 0).asin());
    }

    @Test
    public void testAtan() {
        // atan(z) = (i/2) * log((i+z)/(i-z))
        // Example: atan(0) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ZERO.atan().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ZERO.atan().getImaginary(), 1e-9);
        // atan(1) = PI/4
        assertEquals(new Complex(FastMath.PI / 4.0, 0.0).getReal(), Complex.ONE.atan().getReal(), 1e-9);
        assertEquals(new Complex(FastMath.PI / 4.0, 0.0).getImaginary(), Complex.ONE.atan().getImaginary(), 1e-9);
        // atan(i) -> infinity. The formula yields NaN+Infinity*i
        assertEquals(Complex.NaN.getReal(), Complex.I.atan().getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, Complex.I.atan().getImaginary(), 1e-9);

        assertEquals(Complex.NaN, Complex.NaN.atan());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(Double.POSITIVE_INFINITY, 0).atan());
    }

    @Test
    public void testCos() {
        // cos(a+bi) = cos(a)cosh(b) - i*sin(a)sinh(b)
        // cos(0) = 1
        assertEquals(Complex.ONE.getReal(), Complex.ZERO.cos().getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), Complex.ZERO.cos().getImaginary(), 1e-9);
        // cos(PI) = -1
        assertEquals(new Complex(-1.0, 0.0).getReal(), new Complex(FastMath.PI, 0.0).cos().getReal(), 1e-9);
        assertEquals(new Complex(-1.0, 0.0).getImaginary(), new Complex(FastMath.PI, 0.0).cos().getImaginary(), 1e-9);
        // cos(i) = cosh(1)
        assertEquals(new Complex(MathUtils.cosh(1.0), 0.0).getReal(), Complex.I.cos().getReal(), 1e-9);
        assertEquals(new Complex(MathUtils.cosh(1.0), 0.0).getImaginary(), Complex.I.cos().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.cos());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(Double.POSITIVE_INFINITY, 0).cos());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(0, Double.POSITIVE_INFINITY).cos()); // Example from javadoc
    }

    @Test
    public void testCosh() {
        // cosh(a+bi) = cosh(a)cos(b) + i*sinh(a)sin(b)
        // cosh(0) = 1
        assertEquals(Complex.ONE.getReal(), Complex.ZERO.cosh().getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), Complex.ZERO.cosh().getImaginary(), 1e-9);
        // cosh(i) = cos(1)
        assertEquals(new Complex(FastMath.cos(1.0), 0.0).getReal(), Complex.I.cosh().getReal(), 1e-9);
        assertEquals(new Complex(FastMath.cos(1.0), 0.0).getImaginary(), Complex.I.cosh().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.cosh());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(Double.POSITIVE_INFINITY, 0).cosh());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).getReal(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).cosh().getReal(), 1e-9);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).getImaginary(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).cosh().getImaginary(), 1e-9);
    }

    @Test
    public void testExp() {
        // exp(a+bi) = exp(a) * (cos(b) + i*sin(b))
        // exp(0) = 1
        assertEquals(Complex.ONE.getReal(), Complex.ZERO.exp().getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), Complex.ZERO.exp().getImaginary(), 1e-9);
        // exp(i) = cos(1) + i*sin(1)
        assertEquals(new Complex(FastMath.cos(1.0), FastMath.sin(1.0)).getReal(), Complex.I.exp().getReal(), 1e-9);
        assertEquals(new Complex(FastMath.cos(1.0), FastMath.sin(1.0)).getImaginary(), Complex.I.exp().getImaginary(), 1e-9);
        // exp(1) = e
        assertEquals(new Complex(FastMath.E, 0.0).getReal(), Complex.ONE.exp().getReal(), 1e-9);
        assertEquals(new Complex(FastMath.E, 0.0).getImaginary(), Complex.ONE.exp().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.exp());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).getReal(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).exp().getReal(), 1e-9);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).getImaginary(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).exp().getImaginary(), 1e-9);
        assertEquals(new Complex(0.0, 0.0).getReal(), Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).exp().getReal(), 1e-9);
        assertEquals(new Complex(0.0, 0.0).getImaginary(), Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).exp().getImaginary(), 1e-9);
    }

    @Test
    public void testLog() {
        // log(z) = log(|z|) + i*atan2(imag(z), real(z))
        // log(1) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ONE.log().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ONE.log().getImaginary(), 1e-9);
        // log(i) = log(1) + i*atan2(1,0) = 0 + i*PI/2
        assertEquals(new Complex(0.0, FastMath.PI / 2.0).getReal(), Complex.I.log().getReal(), 1e-9);
        assertEquals(new Complex(0.0, FastMath.PI / 2.0).getImaginary(), Complex.I.log().getImaginary(), 1e-9);
        // log(-1) = log(1) + i*atan2(0,-1) = 0 + i*PI
        assertEquals(new Complex(0.0, FastMath.PI).getReal(), new Complex(-1.0, 0.0).log().getReal(), 1e-9);
        assertEquals(new Complex(0.0, FastMath.PI).getImaginary(), new Complex(-1.0, 0.0).log().getImaginary(), 1e-9);
        // log(0) = -Infinity
        assertEquals(Complex.ZERO.log().getReal(), Double.NEGATIVE_INFINITY, 1e-9);
        assertEquals(Complex.ZERO.log().getImaginary(), 0.0, 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.log());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, FastMath.PI / 2.0).getReal(), Complex.valueOf(0, Double.POSITIVE_INFINITY).log().getReal(), 1e-9);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, FastMath.PI / 2.0).getImaginary(), Complex.valueOf(0, Double.POSITIVE_INFINITY).log().getImaginary(), 1e-9);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, 0.0).getReal(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).log().getReal(), 1e-9);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, 0.0).getImaginary(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).log().getImaginary(), 1e-9);
    }

    @Test
    public void testPow() {
        // z^w = exp(w * log(z))
        // 1^2 = 1
        assertEquals(Complex.ONE.getReal(), Complex.ONE.pow(2.0).getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), Complex.ONE.pow(2.0).getImaginary(), 1e-9);
        // i^2 = -1
        assertEquals(new Complex(-1.0, 0.0).getReal(), Complex.I.pow(2.0).getReal(), 1e-9);
        assertEquals(new Complex(-1.0, 0.0).getImaginary(), Complex.I.pow(2.0).getImaginary(), 1e-9);
        // 2^i = exp(i * log(2)) = exp(i * ln(2)) = cos(ln(2)) + i*sin(ln(2))
        double log2 = FastMath.log(2.0);
        assertEquals(new Complex(FastMath.cos(log2), FastMath.sin(log2)).getReal(), new Complex(2.0, 0.0).pow(Complex.I).getReal(), 1e-9);
        assertEquals(new Complex(FastMath.cos(log2), FastMath.sin(log2)).getImaginary(), new Complex(2.0, 0.0).pow(Complex.I).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.pow(2.0));
        assertEquals(Complex.NaN, Complex.ONE.pow(Complex.NaN));
        assertEquals(Complex.ZERO, Complex.ZERO.pow(2.0));
        assertEquals(Complex.NaN, Complex.ZERO.pow(0.0)); // 0^0 is NaN
    }

    @Test
    public void testSin() {
        // sin(a+bi) = sin(a)cosh(b) + i*cos(a)sinh(b)
        // sin(0) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ZERO.sin().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ZERO.sin().getImaginary(), 1e-9);
        // sin(PI/2) = 1
        assertEquals(Complex.ONE.getReal(), new Complex(FastMath.PI / 2.0, 0.0).sin().getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), new Complex(FastMath.PI / 2.0, 0.0).sin().getImaginary(), 1e-9);
        // sin(i) = i*sinh(1)
        assertEquals(new Complex(0.0, MathUtils.sinh(1.0)).getReal(), Complex.I.sin().getReal(), 1e-9);
        assertEquals(new Complex(0.0, MathUtils.sinh(1.0)).getImaginary(), Complex.I.sin().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.sin());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(Double.POSITIVE_INFINITY, 0).sin());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(0, Double.POSITIVE_INFINITY).sin());
    }

    @Test
    public void testSinh() {
        // sinh(a+bi) = sinh(a)cos(b) + i*cosh(a)sin(b)
        // sinh(0) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ZERO.sinh().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ZERO.sinh().getImaginary(), 1e-9);
        // sinh(i) = i*sin(1)
        assertEquals(new Complex(0.0, FastMath.sin(1.0)).getReal(), Complex.I.sinh().getReal(), 1e-9);
        assertEquals(new Complex(0.0, FastMath.sin(1.0)).getImaginary(), Complex.I.sinh().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.sinh());
        assertEquals(new Complex(Double.NaN, Double.NaN), Complex.valueOf(Double.POSITIVE_INFINITY, 0).sinh());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).getReal(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).sinh().getReal(), 1e-9);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).getImaginary(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).sinh().getImaginary(), 1e-9);
    }

    @Test
    public void testSqrt() {
        // sqrt(a+bi)
        // sqrt(0) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ZERO.sqrt().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ZERO.sqrt().getImaginary(), 1e-9);
        // sqrt(1) = 1
        assertEquals(Complex.ONE.getReal(), Complex.ONE.sqrt().getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), Complex.ONE.sqrt().getImaginary(), 1e-9);
        // sqrt(-1) = i
        assertEquals(Complex.I.getReal(), new Complex(-1.0, 0.0).sqrt().getReal(), 1e-9);
        assertEquals(Complex.I.getImaginary(), new Complex(-1.0, 0.0).sqrt().getImaginary(), 1e-9);
        // sqrt(i) = sqrt(e^(i*PI/2)) = e^(i*PI/4) = cos(PI/4) + i*sin(PI/4) = sqrt(2)/2 + i*sqrt(2)/2
        double sqrt2_2 = FastMath.sqrt(2.0) / 2.0;
        assertEquals(sqrt2_2, Complex.I.sqrt().getReal(), 1e-9);
        assertEquals(sqrt2_2, Complex.I.sqrt().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.sqrt());
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.NaN).getReal(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).sqrt().getReal(), 1e-9);
        assertEquals(new Complex(Double.POSITIVE_INFINITY, Double.NaN).getImaginary(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).sqrt().getImaginary(), 1e-9);
        assertEquals(new Complex(0.0, Double.POSITIVE_INFINITY).getReal(), Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).sqrt().getReal(), 1e-9);
        assertEquals(new Complex(0.0, Double.POSITIVE_INFINITY).getImaginary(), Complex.valueOf(Double.NEGATIVE_INFINITY, 1.0).sqrt().getImaginary(), 1e-9);
    }

    @Test
    public void testSqrt1z() {
        // sqrt(1-z^2)
        // sqrt(1-0^2) = 1
        assertEquals(Complex.ONE.getReal(), Complex.ZERO.sqrt1z().getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), Complex.ZERO.sqrt1z().getImaginary(), 1e-9);
        // sqrt(1-1^2) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ONE.sqrt1z().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ONE.sqrt1z().getImaginary(), 1e-9);
        // sqrt(1-i^2) = sqrt(1-(-1)) = sqrt(2)
        assertEquals(new Complex(FastMath.sqrt(2.0), 0.0).getReal(), Complex.I.sqrt1z().getReal(), 1e-9);
        assertEquals(new Complex(FastMath.sqrt(2.0), 0.0).getImaginary(), Complex.I.sqrt1z().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.sqrt1z());
    }

    @Test
    public void testTan() {
        // tan(a+bi) = sin(2a)/(cos(2a)+cosh(2b)) + i*sinh(2b)/(cos(2a)+cosh(2b))
        // tan(0) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ZERO.tan().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ZERO.tan().getImaginary(), 1e-9);
        // tan(PI/4) = 1
        assertEquals(Complex.ONE.getReal(), new Complex(FastMath.PI / 4.0, 0.0).tan().getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), new Complex(FastMath.PI / 4.0, 0.0).tan().getImaginary(), 1e-9);
        // tan(PI/2) -> infinity. The formula yields NaN+Infinity*i for real PI/2
        assertEquals(Complex.NaN.getReal(), new Complex(FastMath.PI / 2.0, 0.0).tan().getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, new Complex(FastMath.PI / 2.0, 0.0).tan().getImaginary(), 1e-9);

        assertEquals(Complex.NaN, Complex.NaN.tan());
        assertEquals(new Complex(0.0, Double.NaN), Complex.valueOf(1.0, Double.POSITIVE_INFINITY).tan());
    }

    @Test
    public void testTanh() {
        // tanh(a+bi) = sinh(2a)/(cosh(2a)+cos(2b)) + i*sin(2b)/(cosh(2a)+cos(2b))
        // tanh(0) = 0
        assertEquals(Complex.ZERO.getReal(), Complex.ZERO.tanh().getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ZERO.tanh().getImaginary(), 1e-9);
        // tanh(i) = i*tan(1)
        assertEquals(new Complex(0.0, FastMath.tan(1.0)).getReal(), Complex.I.tanh().getReal(), 1e-9);
        assertEquals(new Complex(0.0, FastMath.tan(1.0)).getImaginary(), Complex.I.tanh().getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.tanh());
        assertEquals(new Complex(Double.NaN, 0.0).getReal(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).tanh().getReal(), 1e-9);
        assertEquals(new Complex(Double.NaN, 0.0).getImaginary(), Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).tanh().getImaginary(), 1e-9);
        assertEquals(new Complex(Double.NaN, Double.POSITIVE_INFINITY).getReal(), Complex.valueOf(0.0, FastMath.PI / 2.0).tanh().getReal(), 1e-9);
        assertEquals(new Complex(Double.NaN, Double.POSITIVE_INFINITY).getImaginary(), Complex.valueOf(0.0, FastMath.PI / 2.0).tanh().getImaginary(), 1e-9);
    }

    @Test
    public void testGetArgument() {
        assertEquals(0.0, new Complex(1.0, 0.0).getArgument(), 1e-9);
        assertEquals(FastMath.PI / 2.0, new Complex(0.0, 1.0).getArgument(), 1e-9);
        assertEquals(FastMath.PI, new Complex(-1.0, 0.0).getArgument(), 1e-9);
        assertEquals(-FastMath.PI / 2.0, new Complex(0.0, -1.0).getArgument(), 1e-9);
        assertEquals(FastMath.PI / 4.0, new Complex(1.0, 1.0).getArgument(), 1e-9);
        assertEquals(Double.NaN, Complex.NaN.getArgument(), 1e-9);
        assertEquals(FastMath.PI / 2.0, Complex.valueOf(Double.POSITIVE_INFINITY, 1.0).getArgument(), 1e-9);
        assertEquals(FastMath.PI / 2.0, Complex.valueOf(1.0, Double.POSITIVE_INFINITY).getArgument(), 1e-9);
        assertEquals(FastMath.PI / 4.0, Complex.valueOf(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).getArgument(), 1e-9);
    }

    @Test
    public void testNthRoot() {
        // nthRoot(n)
        // sqrt(1) -> [1, -1]
        List<Complex> roots1 = new Complex(1.0, 0.0).nthRoot(2);
        assertEquals(2, roots1.size());
        assertTrue(roots1.contains(new Complex(1.0, 0.0)));
        assertTrue(roots1.contains(new Complex(-1.0, 0.0)));

        // nthRoot(1) -> [this]
        Complex c = new Complex(3.0, 4.0);
        List<Complex> roots2 = c.nthRoot(1);
        assertEquals(1, roots2.size());
        assertEquals(c.getReal(), roots2.get(0).getReal(), 1e-9);
        assertEquals(c.getImaginary(), roots2.get(0).getImaginary(), 1e-9);

        // nthRoot(2) for i -> [sqrt(2)/2 + i*sqrt(2)/2, -sqrt(2)/2 - i*sqrt(2)/2]
        double sqrt2_2 = FastMath.sqrt(2.0) / 2.0;
        List<Complex> roots3 = Complex.I.nthRoot(2);
        assertEquals(2, roots3.size());
        assertTrue(roots3.contains(new Complex(sqrt2_2, sqrt2_2)));
        assertTrue(roots3.contains(new Complex(-sqrt2_2, -sqrt2_2)));

        // nthRoot(NaN) -> [NaN]
        List<Complex> roots4 = Complex.NaN.nthRoot(3);
        assertEquals(1, roots4.size());
        assertEquals(Complex.NaN, roots4.get(0));

        // nthRoot(INF) -> [INF]
        List<Complex> roots5 = Complex.INF.nthRoot(3);
        assertEquals(1, roots5.size());
        assertEquals(Complex.INF, roots5.get(0));
    }

    @Test
    public void testValueOf() {
        assertEquals(Complex.ZERO.getReal(), Complex.valueOf(0.0, 0.0).getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.valueOf(0.0, 0.0).getImaginary(), 1e-9);
        assertEquals(Complex.ONE.getReal(), Complex.valueOf(1.0, 0.0).getReal(), 1e-9);
        assertEquals(Complex.ONE.getImaginary(), Complex.valueOf(1.0, 0.0).getImaginary(), 1e-9);
        assertEquals(Complex.I.getReal(), Complex.valueOf(0.0, 1.0).getReal(), 1e-9);
        assertEquals(Complex.I.getImaginary(), Complex.valueOf(0.0, 1.0).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 1.0));
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN));
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, Double.NaN));
        assertEquals(new Complex(3.0, 4.0).getReal(), Complex.valueOf(3.0, 4.0).getReal(), 1e-9);
        assertEquals(new Complex(3.0, 4.0).getImaginary(), Complex.valueOf(3.0, 4.0).getImaginary(), 1e-9);
        assertEquals(new Complex(3.0, 0.0).getReal(), Complex.valueOf(3.0).getReal(), 1e-9);
        assertEquals(new Complex(3.0, 0.0).getImaginary(), Complex.valueOf(3.0).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN));
    }

    @Test
    public void testToString() {
        assertEquals("(1.0, 2.0)", new Complex(1.0, 2.0).toString());
        assertEquals("(0.0, 0.0)", Complex.ZERO.toString());
        assertEquals("(1.0, 0.0)", Complex.ONE.toString());
        assertEquals("(0.0, 1.0)", Complex.I.toString());
        assertEquals("(NaN, NaN)", Complex.NaN.toString());
        assertEquals("(Infinity, Infinity)", Complex.INF.toString());
    }

    @Test
    public void testAddDouble() {
        assertEquals(new Complex(4.0, 2.0).getReal(), new Complex(1.0, 2.0).add(3.0).getReal(), 1e-9);
        assertEquals(new Complex(4.0, 2.0).getImaginary(), new Complex(1.0, 2.0).add(3.0).getImaginary(), 1e-9);
        assertEquals(new Complex(1.0, 2.0).getReal(), new Complex(1.0, 2.0).add(0.0).getReal(), 1e-9);
        assertEquals(new Complex(1.0, 2.0).getImaginary(), new Complex(1.0, 2.0).add(0.0).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.add(5.0));
        assertEquals(Complex.NaN, new Complex(1.0, 2.0).add(Double.NaN));
        assertEquals(Complex.INF, Complex.INF.add(5.0));
    }

    @Test
    public void testSubtractDouble() {
        assertEquals(new Complex(-2.0, 2.0).getReal(), new Complex(1.0, 2.0).subtract(3.0).getReal(), 1e-9);
        assertEquals(new Complex(-2.0, 2.0).getImaginary(), new Complex(1.0, 2.0).subtract(3.0).getImaginary(), 1e-9);
        assertEquals(new Complex(1.0, 2.0).getReal(), new Complex(1.0, 2.0).subtract(0.0).getReal(), 1e-9);
        assertEquals(new Complex(1.0, 2.0).getImaginary(), new Complex(1.0, 2.0).subtract(0.0).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.subtract(5.0));
        assertEquals(Complex.NaN, new Complex(1.0, 2.0).subtract(Double.NaN));
        assertEquals(Complex.INF, Complex.INF.subtract(5.0));
    }

    @Test
    public void testMultiplyDouble() {
        assertEquals(new Complex(3.0, 6.0).getReal(), new Complex(1.0, 2.0).multiply(3.0).getReal(), 1e-9);
        assertEquals(new Complex(3.0, 6.0).getImaginary(), new Complex(1.0, 2.0).multiply(3.0).getImaginary(), 1e-9);
        assertEquals(Complex.ZERO.getReal(), Complex.ZERO.multiply(3.0).getReal(), 1e-9);
        assertEquals(Complex.ZERO.getImaginary(), Complex.ZERO.multiply(3.0).getImaginary(), 1e-9);
        assertEquals(Complex.NaN, Complex.NaN.multiply(3.0));
        assertEquals(Complex.NaN, new Complex(1.0, 2.0).multiply(Double.NaN));
        assertEquals(Complex.INF, Complex.INF.multiply(3.0));
    }

    @Test
    public void testDivideDouble() {
        assertEquals(new Complex(1.0/3.0, 2.0/3.0).getReal(), new Complex(1.0, 2.0).divide(3.0).getReal(), 1e-9);
        assertEquals(new Complex(1.0/3.0, 2.0/3.0).getImaginary(), new Complex(1.0, 2.0).divide(3.0).getImaginary(), 1e-9);
        assertEquals(Complex.ZERO, Complex.ONE.divide(Double.POSITIVE_INFINITY));
        assertEquals(Complex.NaN, Complex.ZERO.divide(0.0));
        assertEquals(Complex.NaN, Complex.NaN.divide(3.0));
        assertEquals(Complex.NaN, new Complex(1.0, 2.0).divide(Double.NaN));
        assertEquals(Complex.INF, Complex.ONE.divide(0.0));
        assertEquals(Complex.ZERO, Complex.ONE.divide(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testAcosBoundary() {
        // Test values that might cause issues in sqrt(1-z^2)
        // The formula for acos is -i * log(z + i*sqrt(1-z^2))
        // For z = 1 + epsilon*i, 1-z^2 = 1 - (1 + 2*epsilon*i - epsilon^2) = -2*epsilon*i + epsilon^2
        // sqrt(1-z^2) will be complex. The test cases below aim to check behavior when 1-z^2 is close to zero or negative.
        // However, the javadoc states "Returns Complex#NaN if either real or imaginary part of the input argument is NaN or infinite."
        // The specific boundary cases are hard to determine without more detailed analysis of the `sqrt1z` method's behavior at the edges.
        // The current tests cover NaN and Infinity inputs. Let's add tests for values very close to 1.0.
        assertEquals(Complex.NaN, Complex.valueOf(1.0 + 1e-100, 0).acos()); // z=1+eps
        assertEquals(Complex.NaN, Complex.valueOf(1.0 - 1e-100, 0).acos()); // z=1-eps
        assertEquals(Complex.NaN, Complex.valueOf(-1.0 + 1e-100, 0).acos()); // z=-1+eps
        assertEquals(Complex.NaN, Complex.valueOf(-1.0 - 1e-100, 0).acos()); // z=-1-eps
    }

    @Test
    public void testAsinBoundary() {
        // Test values that might cause issues in sqrt(1-z^2)
        // The formula for asin is -i * log(sqrt(1-z^2) + i*z)
        // Similar to acos, testing values very close to 1.0 and -1.0.
        assertEquals(Complex.NaN, Complex.valueOf(1.0 + 1e-100, 0).asin()); // z=1+eps
        assertEquals(Complex.NaN, Complex.valueOf(1.0 - 1e-100, 0).asin()); // z=1-eps
        assertEquals(Complex.NaN, Complex.valueOf(-1.0 + 1e-100, 0).asin()); // z=-1+eps
        assertEquals(Complex.NaN, Complex.valueOf(-1.0 - 1e-100, 0).asin()); // z=-1-eps
    }

    @Test
    public void testAtanBoundary() {
        // Test values that might cause issues in log((i+z)/(i-z))
        // atan(i) leads to division by zero in (i-z) when z=i.
        // Test values where the denominator is close to zero.
        Complex i = Complex.I;
        // The direct calculation of log((2i)/0) may result in NaN or Infinity depending on implementation
        // Test the result of atan(i) which is known to be problematic.
        assertEquals(Complex.NaN, Complex.I.atan());

        // Test values very close to i.
        assertEquals(Complex.NaN.getReal(), Complex.valueOf(0.0, 1.0 + 1e-100).atan().getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, Complex.valueOf(0.0, 1.0 + 1e-100).atan().getImaginary(), 1e-9);
        assertEquals(Complex.NaN.getReal(), Complex.valueOf(0.0, 1.0 - 1e-100).atan().getReal(), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, Complex.valueOf(0.0, 1.0 - 1e-100).atan().getImaginary(), 1e-9);

        // Testing values that would make (i+z)/(i-z) have large magnitude or be NaN.
        // For large real part, z/(i-z) approx -1, log(-1) = PI*i
        assertEquals(new Complex(0.0, Math.PI / 2.0).getReal(), Complex.valueOf(1e10, 0).atan().getReal(), 1e-9); // Approximation
        assertEquals(new Complex(0.0, Math.PI / 2.0).getImaginary(), Complex.valueOf(1e10, 0).atan().getImaginary(), 1e-9);
    }

    @Test
    public void testLogBoundary() {
        // Test values near zero, and negative real axis
        assertEquals(Double.NEGATIVE_INFINITY, Complex.ZERO.log().getReal(), 1e-9);
        assertEquals(0.0, Complex.ZERO.log().getImaginary(), 1e-9);
        assertEquals(0.0, new Complex(-1.0, 0.0).log().getReal(), 1e-9);
        assertEquals(Math.PI, new Complex(-1.0, 0.0).log().getImaginary(), 1e-9);
        // Test values very close to the negative real axis, positive and negative imaginary parts.
        double epsilon = 1e-100;
        assertEquals(0.0, new Complex(-1.0, epsilon).log().getReal(), 1e-9);
        assertEquals(Math.PI, new Complex(-1.0, epsilon).log().getImaginary(), 1e-9);
        assertEquals(0.0, new Complex(-1.0, -epsilon).log().getReal(), 1e-9);
        assertEquals(-Math.PI, new Complex(-1.0, -epsilon).log().getImaginary(), 1e-9);
    }

    @Test
    public void testPowBoundary() {
        // Test 0^0, 0^positive, 0^negative
        assertEquals(Complex.NaN, Complex.ZERO.pow(0.0));
        assertEquals(Complex.ZERO, Complex.ZERO.pow(2.0));
        assertEquals(Complex.INF, Complex.ZERO.pow(-2.0)); // 1/0
        // Test base = NaN
        assertEquals(Complex.NaN, Complex.NaN.pow(2.0));
        assertEquals(Complex.NaN, Complex.NaN.pow(Complex.I));
        // Test exponent = NaN
        assertEquals(Complex.NaN, Complex.ONE.pow(Complex.NaN));
        assertEquals(Complex.NaN, Complex.I.pow(Complex.NaN));
    }

    @Test
    public void testNthRootBoundary() {
        // Test n=0 and n negative
        try {
            Complex.ONE.nthRoot(0);
            fail("NotPositiveException expected");
        } catch (NotPositiveException e) {
            // expected
        }
        try {
            Complex.ONE.nthRoot(-1);
            fail("NotPositiveException expected");
        } catch (NotPositiveException e) {
            // expected
        }
    }
}
```