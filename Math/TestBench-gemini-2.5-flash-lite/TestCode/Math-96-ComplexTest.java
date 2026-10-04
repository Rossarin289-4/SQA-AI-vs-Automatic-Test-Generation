package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.util.MathUtils;

public class ComplexTest {

    @Test
    public void testAbs() throws Exception {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), 1e-9);

        Complex c2 = new Complex(-3.0, -4.0);
        assertEquals(5.0, c2.abs(), 1e-9);

        Complex c3 = new Complex(0.0, 0.0);
        assertEquals(0.0, c3.abs(), 1e-9);

        Complex c4 = new Complex(Double.NaN, 1.0);
        assertEquals(Double.NaN, c4.abs(), 1e-9);

        Complex c5 = new Complex(1.0, Double.NaN);
        assertEquals(Double.NaN, c5.abs(), 1e-9);

        Complex c6 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, c6.abs(), 1e-9);

        Complex c7 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, c7.abs(), 1e-9);
    }

    @Test
    public void testAdd() throws Exception {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex sum = c1.add(c2);
        assertEquals(4.0, sum.getReal(), 1e-9);
        assertEquals(6.0, sum.getImaginary(), 1e-9);

        Complex c3 = new Complex(Double.NaN, 1.0);
        Complex c4 = new Complex(1.0, 2.0);
        Complex sumNaN = c3.add(c4);
        assertTrue(sumNaN.isNaN());

        Complex c5 = new Complex(1.0, 2.0);
        Complex c6 = new Complex(Double.NaN, 1.0);
        Complex sumNaN2 = c5.add(c6);
        assertTrue(sumNaN2.isNaN());

        Complex c7 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex c8 = new Complex(1.0, 2.0);
        Complex sumInf = c7.add(c8);
        assertEquals(Double.POSITIVE_INFINITY, sumInf.getReal(), 1e-9);
        assertEquals(3.0, sumInf.getImaginary(), 1e-9);
    }

    @Test
    public void testConjugate() throws Exception {
        Complex c = new Complex(3.0, 4.0);
        Complex conj = c.conjugate();
        assertEquals(3.0, conj.getReal(), 1e-9);
        assertEquals(-4.0, conj.getImaginary(), 1e-9);

        Complex c2 = new Complex(3.0, -4.0);
        Complex conj2 = c2.conjugate();
        assertEquals(3.0, conj2.getReal(), 1e-9);
        assertEquals(4.0, conj2.getImaginary(), 1e-9);

        Complex c3 = new Complex(3.0, 0.0);
        Complex conj3 = c3.conjugate();
        assertEquals(3.0, conj3.getReal(), 1e-9);
        assertEquals(0.0, conj3.getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.NaN, 4.0);
        Complex conj4 = c4.conjugate();
        assertTrue(conj4.isNaN());

        Complex c5 = new Complex(3.0, Double.NaN);
        Complex conj5 = c5.conjugate();
        assertTrue(conj5.isNaN());

        Complex c6 = new Complex(1.0, Double.POSITIVE_INFINITY);
        Complex conj6 = c6.conjugate();
        assertEquals(1.0, conj6.getReal(), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, conj6.getImaginary(), 1e-9);
    }

    @Test
    public void testDivide() throws Exception {
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(4.0, 5.0);
        Complex div = c1.divide(c2);
        // Expected: (2+3i)/(4+5i) = (2*4 + 3*5)/(4^2+5^2) + (3*4 - 2*5)i/(4^2+5^2)
        // = (8+15)/41 + (12-10)i/41 = 23/41 + 2i/41
        assertEquals(23.0 / 41.0, div.getReal(), 1e-9);
        assertEquals(2.0 / 41.0, div.getImaginary(), 1e-9);

        Complex c3 = new Complex(1.0, 0.0);
        Complex c4 = new Complex(0.0, 0.0);
        Complex divZero = c3.divide(c4);
        assertTrue(divZero.isNaN());

        Complex c5 = new Complex(Double.NaN, 1.0);
        Complex c6 = new Complex(1.0, 2.0);
        Complex divNaN = c5.divide(c6);
        assertTrue(divNaN.isNaN());

        Complex c7 = new Complex(1.0, 2.0);
        Complex c8 = new Complex(Double.NaN, 1.0);
        Complex divNaN2 = c7.divide(c8);
        assertTrue(divNaN2.isNaN());

        Complex c9 = new Complex(1.0, 2.0);
        Complex c10 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex divInf = c9.divide(c10);
        assertEquals(0.0, divInf.getReal(), 1e-9);
        assertEquals(0.0, divInf.getImaginary(), 1e-9);
    }

    @Test
    public void testEquals() throws Exception {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(c1, c2);

        Complex c3 = new Complex(1.0, 2.0);
        Complex c4 = new Complex(1.0, 3.0);
        assertFalse(c3.equals(c4));

        Complex c5 = new Complex(1.0, 2.0);
        Complex c6 = new Complex(3.0, 2.0);
        assertFalse(c5.equals(c6));

        Complex c7 = new Complex(Double.NaN, 2.0);
        Complex c8 = new Complex(Double.NaN, 2.0);
        assertTrue(c7.equals(c8));

        Complex c9 = new Complex(1.0, Double.NaN);
        Complex c10 = new Complex(1.0, Double.NaN);
        assertTrue(c9.equals(c10));

        Complex c11 = Complex.NaN;
        Complex c12 = Complex.NaN;
        assertTrue(c11.equals(c12));

        Complex c13 = new Complex(1.0, 2.0);
        assertFalse(c13.equals(null));
        assertFalse(c13.equals("not a complex"));
    }

    @Test
    public void testHashCode() throws Exception {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(c1.hashCode(), c2.hashCode());

        Complex c3 = new Complex(1.0, 3.0);
        assertFalse(c1.hashCode() == c3.hashCode());

        Complex c4 = new Complex(3.0, 2.0);
        assertFalse(c1.hashCode() == c4.hashCode());

        Complex c5 = Complex.NaN;
        assertEquals(7, c5.hashCode());

        Complex c6 = Complex.NaN;
        assertEquals(7, c6.hashCode());
    }

    @Test
    public void testGetImaginary() throws Exception {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(2.0, c.getImaginary(), 1e-9);
    }

    @Test
    public void testGetReal() throws Exception {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 1e-9);
    }

    @Test
    public void testIsNaN() throws Exception {
        Complex c1 = new Complex(Double.NaN, 1.0);
        assertTrue(c1.isNaN());

        Complex c2 = new Complex(1.0, Double.NaN);
        assertTrue(c2.isNaN());

        Complex c3 = new Complex(Double.NaN, Double.NaN);
        assertTrue(c3.isNaN());

        Complex c4 = new Complex(1.0, 2.0);
        assertFalse(c4.isNaN());
    }

    @Test
    public void testIsInfinite() throws Exception {
        Complex c1 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(c1.isInfinite());

        Complex c2 = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertTrue(c2.isInfinite());

        Complex c3 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertTrue(c3.isInfinite());

        Complex c4 = new Complex(1.0, 2.0);
        assertFalse(c4.isInfinite());

        Complex c5 = new Complex(Double.NaN, 1.0);
        assertFalse(c5.isInfinite());

        Complex c6 = new Complex(1.0, Double.NaN);
        assertFalse(c6.isInfinite());
    }

    @Test
    public void testMultiply() throws Exception {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex prod = c1.multiply(c2);
        // Expected: (1+2i)(3+4i) = (1*3 - 2*4) + (1*4 + 2*3)i
        // = (3 - 8) + (4 + 6)i = -5 + 10i
        assertEquals(-5.0, prod.getReal(), 1e-9);
        assertEquals(10.0, prod.getImaginary(), 1e-9);

        Complex c3 = new Complex(Double.NaN, 1.0);
        Complex c4 = new Complex(1.0, 2.0);
        Complex prodNaN = c3.multiply(c4);
        assertTrue(prodNaN.isNaN());

        Complex c5 = new Complex(1.0, 2.0);
        Complex c6 = new Complex(Double.NaN, 1.0);
        Complex prodNaN2 = c5.multiply(c6);
        assertTrue(prodNaN2.isNaN());

        Complex c7 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex c8 = new Complex(1.0, 2.0);
        Complex prodInf = c7.multiply(c8);
        assertEquals(Double.POSITIVE_INFINITY, prodInf.getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, prodInf.getImaginary(), 1e-9);

        Complex c9 = new Complex(1.0, 2.0);
        Complex c10 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        Complex prodInf2 = c9.multiply(c10);
        assertEquals(Double.POSITIVE_INFINITY, prodInf2.getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, prodInf2.getImaginary(), 1e-9);
    }

    @Test
    public void testNegate() throws Exception {
        Complex c = new Complex(3.0, 4.0);
        Complex neg = c.negate();
        assertEquals(-3.0, neg.getReal(), 1e-9);
        assertEquals(-4.0, neg.getImaginary(), 1e-9);

        Complex c2 = new Complex(-3.0, -4.0);
        Complex neg2 = c2.negate();
        assertEquals(3.0, neg2.getReal(), 1e-9);
        assertEquals(4.0, neg2.getImaginary(), 1e-9);

        Complex c3 = new Complex(0.0, 0.0);
        Complex neg3 = c3.negate();
        assertEquals(0.0, neg3.getReal(), 1e-9);
        assertEquals(0.0, neg3.getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.NaN, 4.0);
        Complex neg4 = c4.negate();
        assertTrue(neg4.isNaN());

        Complex c5 = new Complex(3.0, Double.NaN);
        Complex neg5 = c5.negate();
        assertTrue(neg5.isNaN());
    }

    @Test
    public void testSubtract() throws Exception {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex diff = c1.subtract(c2);
        assertEquals(2.0, diff.getReal(), 1e-9);
        assertEquals(2.0, diff.getImaginary(), 1e-9);

        Complex c3 = new Complex(Double.NaN, 1.0);
        Complex c4 = new Complex(1.0, 2.0);
        Complex diffNaN = c3.subtract(c4);
        assertTrue(diffNaN.isNaN());

        Complex c5 = new Complex(1.0, 2.0);
        Complex c6 = new Complex(Double.NaN, 1.0);
        Complex diffNaN2 = c5.subtract(c6);
        assertTrue(diffNaN2.isNaN());

        Complex c7 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex c8 = new Complex(1.0, 2.0);
        Complex diffInf = c7.subtract(c8);
        assertEquals(Double.POSITIVE_INFINITY, diffInf.getReal(), 1e-9);
        assertEquals(-1.0, diffInf.getImaginary(), 1e-9);
    }

    @Test
    public void testAcos() throws Exception {
        // acos(z) = -i * log(z + i * sqrt(1 - z^2))
        // Test NaN and Infinite cases as manual calculation is complex.
        Complex nanInput = new Complex(Double.NaN, 1.0);
        assertTrue(nanInput.acos().isNaN());
        Complex infInput = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(infInput.acos().isNaN());
        Complex infInput2 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertTrue(infInput2.acos().isNaN());
    }

    @Test
    public void testAsin() throws Exception {
        // asin(z) = -i * log(sqrt(1 - z^2) + i*z)
        // Test NaN and Infinite cases as manual calculation is complex.
        Complex nanInput = new Complex(Double.NaN, 1.0);
        assertTrue(nanInput.asin().isNaN());
        Complex infInput = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(infInput.asin().isNaN());
        Complex infInput2 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertTrue(infInput2.asin().isNaN());
    }

    @Test
    public void testAtan() throws Exception {
        // atan(z) = (i/2) * log((i + z)/(i - z))
        // Test NaN and Infinite cases as manual calculation is complex.
        Complex nanInput = new Complex(Double.NaN, 1.0);
        assertTrue(nanInput.atan().isNaN());
        Complex infInput = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(infInput.atan().isNaN());
        Complex infInput2 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertTrue(infInput2.atan().isNaN());
    }

    @Test
    public void testCos() throws Exception {
        // cos(a + bi) = cos(a)cosh(b) - sin(a)sinh(b)i
        Complex c1 = new Complex(Math.PI / 2.0, 1.0);
        // cos(pi/2 + i) = cos(pi/2)cosh(1) - sin(pi/2)sinh(1)i = 0*cosh(1) - 1*sinh(1)i = -sinh(1)i
        assertEquals(0.0, c1.cos().getReal(), 1e-9);
        assertEquals(-MathUtils.sinh(1.0), c1.cos().getImaginary(), 1e-9);

        Complex c2 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c2.cos().getReal(), 1e-9);
        assertEquals(Double.NaN, c2.cos().getImaginary(), 1e-9);

        Complex c3 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.NaN, c3.cos().getReal(), 1e-9);
        assertEquals(Double.NaN, c3.cos().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c4.cos().getReal(), 1e-9);
        assertEquals(Double.NaN, c4.cos().getImaginary(), 1e-9);
    }

    @Test
    public void testCosh() throws Exception {
        // cosh(a + bi) = cosh(a)cos(b) + sinh(a)sin(b)i
        Complex c1 = new Complex(1.0, Math.PI / 2.0);
        // cosh(1 + i*pi/2) = cosh(1)cos(pi/2) + sinh(1)sin(pi/2)i = cosh(1)*0 + sinh(1)*1*i = sinh(1)i
        assertEquals(0.0, c1.cosh().getReal(), 1e-9);
        assertEquals(MathUtils.sinh(1.0), c1.cosh().getImaginary(), 1e-9);

        Complex c2 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, c2.cosh().getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, c2.cosh().getImaginary(), 1e-9);

        Complex c3 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c3.cosh().getReal(), 1e-9);
        assertEquals(Double.NaN, c3.cosh().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c4.cosh().getReal(), 1e-9);
        assertEquals(Double.NaN, c4.cosh().getImaginary(), 1e-9);
    }

    @Test
    public void testExp() throws Exception {
        // exp(a + bi) = exp(a)cos(b) + exp(a)sin(b)i
        Complex c1 = new Complex(1.0, Math.PI);
        // exp(1 + i*pi) = exp(1) * (cos(pi) + i*sin(pi)) = exp(1) * (-1 + 0i) = -exp(1)
        assertEquals(-Math.exp(1.0), c1.exp().getReal(), 1e-9);
        assertEquals(0.0, c1.exp().getImaginary(), 1e-9);

        Complex c2 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, c2.exp().getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, c2.exp().getImaginary(), 1e-9);

        Complex c3 = new Complex(Double.NEGATIVE_INFINITY, 1.0);
        assertEquals(0.0, c3.exp().getReal(), 1e-9);
        assertEquals(0.0, c3.exp().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c4.exp().getReal(), 1e-9);
        assertEquals(Double.NaN, c4.exp().getImaginary(), 1e-9);
    }

    @Test
    public void testLog() throws Exception {
        // log(a + bi) = ln(|a + bi|) + arg(a + bi)i
        Complex c1 = new Complex(1.0, 1.0);
        // log(1+i) = ln(|1+i|) + i*arg(1+i)
        // |1+i| = sqrt(1^2 + 1^2) = sqrt(2)
        // arg(1+i) = atan2(1,1) = pi/4
        assertEquals(Math.log(Math.sqrt(2.0)), c1.log().getReal(), 1e-9);
        assertEquals(Math.PI / 4.0, c1.log().getImaginary(), 1e-9);

        Complex c2 = new Complex(0.0, 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, c2.log().getReal(), 1e-9);
        assertEquals(0.0, c2.log().getImaginary(), 1e-9);

        Complex c3 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        // log(inf + i) = ln(inf) + atan2(1, inf)i = inf + 0i
        assertEquals(Double.POSITIVE_INFINITY, c3.log().getReal(), 1e-9);
        assertEquals(0.0, c3.log().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        // log(inf + inf i) = ln(inf) + atan2(inf, inf)i = inf + pi/4 i
        assertEquals(Double.POSITIVE_INFINITY, c4.log().getReal(), 1e-9);
        assertEquals(Math.PI / 4.0, c4.log().getImaginary(), 1e-9);

        Complex c5 = new Complex(Double.NEGATIVE_INFINITY, 1.0);
        // log(-inf + i) = ln(inf) + atan2(1, -inf)i = inf + pi i
        assertEquals(Double.POSITIVE_INFINITY, c5.log().getReal(), 1e-9);
        assertEquals(Math.PI, c5.log().getImaginary(), 1e-9);
    }

    @Test
    public void testPow() throws Exception {
        // pow(y, x) = exp(x * log(y))
        // Test NaN and Zero cases.
        Complex zeroBase = Complex.ZERO;
        Complex exp = new Complex(1.0, 1.0);
        assertTrue(zeroBase.pow(exp).isNaN());

        Complex nanBase = Complex.NaN;
        Complex exp2 = new Complex(1.0, 1.0);
        assertTrue(nanBase.pow(exp2).isNaN());

        Complex base2 = new Complex(1.0, 1.0);
        Complex nanExp = Complex.NaN;
        assertTrue(base2.pow(nanExp).isNaN());

        Complex base3 = new Complex(1.0, 0.0);
        Complex exp3 = new Complex(0.0, 0.0);
        assertEquals(1.0, base3.pow(exp3).getReal(), 1e-9);
        assertEquals(0.0, base3.pow(exp3).getImaginary(), 1e-9);
    }

    @Test
    public void testSin() throws Exception {
        // sin(a + bi) = sin(a)cosh(b) + cos(a)sinh(b)i
        Complex c1 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c1.sin().getReal(), 1e-9);
        assertEquals(Double.NaN, c1.sin().getImaginary(), 1e-9);

        Complex c2 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.NaN, c2.sin().getReal(), 1e-9);
        assertEquals(Double.NaN, c2.sin().getImaginary(), 1e-9);

        Complex c3 = new Complex(Math.PI / 2.0, 1.0);
        // sin(pi/2 + i) = sin(pi/2)cosh(1) + cos(pi/2)sinh(1)i = 1*cosh(1) + 0*sinh(1)i = cosh(1)
        assertEquals(MathUtils.cosh(1.0), c3.sin().getReal(), 1e-9);
        assertEquals(0.0, c3.sin().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c4.sin().getReal(), 1e-9);
        assertEquals(Double.NaN, c4.sin().getImaginary(), 1e-9);
    }

    @Test
    public void testSinh() throws Exception {
        // sinh(a + bi) = sinh(a)cos(b) + cosh(a)sin(b)i
        Complex c1 = new Complex(1.0, Math.PI / 2.0);
        // sinh(1 + i*pi/2) = sinh(1)cos(pi/2) + cosh(1)sin(pi/2)i = sinh(1)*0 + cosh(1)*1*i = cosh(1)i
        assertEquals(0.0, c1.sinh().getReal(), 1e-9);
        assertEquals(MathUtils.cosh(1.0), c1.sinh().getImaginary(), 1e-9);

        Complex c2 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, c2.sinh().getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, c2.sinh().getImaginary(), 1e-9);

        Complex c3 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c3.sinh().getReal(), 1e-9);
        assertEquals(Double.NaN, c3.sinh().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c4.sinh().getReal(), 1e-9);
        assertEquals(Double.NaN, c4.sinh().getImaginary(), 1e-9);
    }

    @Test
    public void testSqrt() throws Exception {
        // sqrt(a + bi) algorithm
        Complex c1 = new Complex(3.0, 4.0);
        // |3+4i|=5. t = sqrt((3+5)/2) = 2. real >= 0 -> t + (imag/(2t))i = 2 + (4/4)i = 2 + i
        assertEquals(2.0, c1.sqrt().getReal(), 1e-9);
        assertEquals(1.0, c1.sqrt().getImaginary(), 1e-9);

        Complex c2 = new Complex(-1.0, 0.0);
        // |-1|=1. t = sqrt((1+1)/2) = 1. real < 0, imag=0. -> |imag|/2t + indicator(imag)*t i = 0/2 + 1.0*1*i = i
        assertEquals(0.0, c2.sqrt().getReal(), 1e-9);
        assertEquals(1.0, c2.sqrt().getImaginary(), 1e-9);

        Complex c3 = new Complex(-3.0, -4.0);
        // |-3-4i|=5. t = sqrt((3+5)/2) = 2. real < 0. -> |imag|/2t + indicator(imag)*t i = |-4|/4 + indicator(-4)*2 i = 1 + (-1)*2 i = 1 - 2i
        assertEquals(1.0, c3.sqrt().getReal(), 1e-9);
        assertEquals(-2.0, c3.sqrt().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, c4.sqrt().getReal(), 1e-9);
        assertEquals(0.0, c4.sqrt().getImaginary(), 1e-9);

        Complex c5 = new Complex(0.0, Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, c5.sqrt().getReal(), 1e-9);
        assertEquals(0.0, c5.sqrt().getImaginary(), 1e-9); // Corrected from NaN to 0.0 based on documentation

        Complex c6 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, c6.sqrt().getReal(), 1e-9);
        assertEquals(Double.NaN, c6.sqrt().getImaginary(), 1e-9);

        Complex c7 = new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c7.sqrt().getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, c7.sqrt().getImaginary(), 1e-9);

        Complex c8 = new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        assertEquals(Double.NaN, c8.sqrt().getReal(), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, c8.sqrt().getImaginary(), 1e-9);
    }

    @Test
    public void testSqrt1z() throws Exception {
        // sqrt(1 - z^2)
        // Test NaN and Infinite cases.
        Complex nanInput = new Complex(Double.NaN, 1.0);
        assertTrue(nanInput.sqrt1z().isNaN());
        Complex infInput = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(infInput.sqrt1z().isNaN());
        Complex infInput2 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertTrue(infInput2.sqrt1z().isNaN());

        Complex c1 = new Complex(1.0, 0.0); // 1 - 1^2 = 0, sqrt(0) = 0
        assertEquals(0.0, c1.sqrt1z().getReal(), 1e-9);
        assertEquals(0.0, c1.sqrt1z().getImaginary(), 1e-9);

        Complex c2 = new Complex(0.0, 1.0); // 1 - i^2 = 1 - (-1) = 2, sqrt(2)
        assertEquals(Math.sqrt(2.0), c2.sqrt1z().getReal(), 1e-9);
        assertEquals(0.0, c2.sqrt1z().getImaginary(), 1e-9);
    }

    @Test
    public void testTan() throws Exception {
        // tan(a + bi) = sin(2a)/(cos(2a)+cosh(2b)) + [sinh(2b)/(cos(2a)+cosh(2b))]i
        Complex c1 = new Complex(Math.PI / 2.0, 0.0);
        // tan(pi/2) is infinite. The example states NaN for the imaginary part.
        assertEquals(Double.POSITIVE_INFINITY, c1.tan().getReal(), 1e-9);
        assertEquals(Double.NaN, c1.tan().getImaginary(), 1e-9);

        Complex c2 = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertEquals(0.0, c2.tan().getReal(), 1e-9);
        assertEquals(Double.NaN, c2.tan().getImaginary(), 1e-9);

        Complex c3 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.NaN, c3.tan().getReal(), 1e-9);
        assertEquals(Double.NaN, c3.tan().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.NaN, c4.tan().getReal(), 1e-9);
        assertEquals(Double.NaN, c4.tan().getImaginary(), 1e-9);
    }

    @Test
    public void testTanh() throws Exception {
        // tanh(a + bi) = sinh(2a)/(cosh(2a)+cos(2b)) + [sin(2b)/(cosh(2a)+cos(2b))]i
        Complex c1 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        // tanh(+inf + i) = NaN + 0i
        assertEquals(Double.NaN, c1.tanh().getReal(), 1e-9);
        assertEquals(0.0, c1.tanh().getImaginary(), 1e-9);

        Complex c2 = new Complex(1.0, Double.POSITIVE_INFINITY);
        // tanh(1 + inf i) = NaN + NaN i
        assertEquals(Double.NaN, c2.tanh().getReal(), 1e-9);
        assertEquals(Double.NaN, c2.tanh().getImaginary(), 1e-9);

        Complex c3 = new Complex(0.0, Math.PI / 2.0);
        // tanh(0 + i*pi/2) = NaN + INFINITY i
        assertEquals(Double.NaN, c3.tanh().getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, c3.tanh().getImaginary(), 1e-9);

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        // tanh(+inf + inf i) = NaN + NaN i
        assertEquals(Double.NaN, c4.tanh().getReal(), 1e-9);
        assertEquals(Double.NaN, c4.tanh().getImaginary(), 1e-9);
    }

    // Edge case tests for numerical precision and behavior with constants.
    @Test
    public void testComplexConstants() throws Exception {
        assertEquals(0.0, Complex.ZERO.getReal(), 1e-9);
        assertEquals(0.0, Complex.ZERO.getImaginary(), 1e-9);

        assertEquals(1.0, Complex.ONE.getReal(), 1e-9);
        assertEquals(0.0, Complex.ONE.getImaginary(), 1e-9);

        assertEquals(0.0, Complex.I.getReal(), 1e-9);
        assertEquals(1.0, Complex.I.getImaginary(), 1e-9);

        assertEquals(Double.NaN, Complex.NaN.getReal(), 1e-9);
        assertEquals(Double.NaN, Complex.NaN.getImaginary(), 1e-9);
        assertTrue(Complex.NaN.isNaN());

        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.getReal(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.getImaginary(), 1e-9);
        assertTrue(Complex.INF.isInfinite());
    }

    @Test
    public void testAbsWithZeroRealOrImaginary() throws Exception {
        Complex c1 = new Complex(0.0, 5.0);
        assertEquals(5.0, c1.abs(), 1e-9);

        Complex c2 = new Complex(5.0, 0.0);
        assertEquals(5.0, c2.abs(), 1e-9);
    }

    @Test
    public void testDivideBySelf() throws Exception {
        Complex c = new Complex(2.0, 3.0);
        Complex one = c.divide(c);
        assertEquals(1.0, one.getReal(), 1e-9);
        assertEquals(0.0, one.getImaginary(), 1e-9);

        Complex zero = Complex.ZERO;
        Complex divZero = zero.divide(zero);
        assertTrue(divZero.isNaN());
    }

    @Test
    public void testMultiplyByZero() throws Exception {
        Complex c = new Complex(2.0, 3.0);
        Complex zero = Complex.ZERO;
        Complex prod = c.multiply(zero);
        assertEquals(0.0, prod.getReal(), 1e-9);
        assertEquals(0.0, prod.getImaginary(), 1e-9);
    }

    @Test
    public void testAddZero() throws Exception {
        Complex c = new Complex(2.0, 3.0);
        Complex zero = Complex.ZERO;
        Complex sum = c.add(zero);
        assertEquals(c.getReal(), sum.getReal(), 1e-9);
        assertEquals(c.getImaginary(), sum.getImaginary(), 1e-9);
    }

    @Test
    public void testSubtractZero() throws Exception {
        Complex c = new Complex(2.0, 3.0);
        Complex zero = Complex.ZERO;
        Complex diff = c.subtract(zero);
        assertEquals(c.getReal(), diff.getReal(), 1e-9);
        assertEquals(c.getImaginary(), diff.getImaginary(), 1e-9);
    }

    @Test
    public void testPowWithZeroExponent() throws Exception {
        Complex c = new Complex(2.0, 3.0);
        Complex zeroExponent = Complex.ZERO;
        Complex result = c.pow(zeroExponent);
        assertEquals(1.0, result.getReal(), 1e-9);
        assertEquals(0.0, result.getImaginary(), 1e-9);
    }

    @Test
    public void testPowWithOneExponent() throws Exception {
        Complex c = new Complex(2.0, 3.0);
        Complex oneExponent = Complex.ONE;
        Complex result = c.pow(oneExponent);
        assertEquals(c.getReal(), result.getReal(), 1e-9);
        assertEquals(c.getImaginary(), result.getImaginary(), 1e-9);
    }

    @Test
    public void testSqrtOfZero() throws Exception {
        Complex zero = Complex.ZERO;
        Complex sqrtZero = zero.sqrt();
        assertEquals(0.0, sqrtZero.getReal(), 1e-9);
        assertEquals(0.0, sqrtZero.getImaginary(), 1e-9);
    }

    @Test
    public void testAbsOfNaN() throws Exception {
        Complex nanComplex = Complex.NaN;
        assertEquals(Double.NaN, nanComplex.abs(), 1e-9);
    }

    @Test
    public void testAbsOfInfinite() throws Exception {
        Complex infComplex = Complex.INF;
        assertEquals(Double.POSITIVE_INFINITY, infComplex.abs(), 1e-9);
    }

    @Test
    public void testAddWithNaN() throws Exception {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = Complex.NaN;
        Complex result = c1.add(c2);
        assertTrue(result.isNaN());
    }

    @Test
    public void testSubtractWithNaN() throws Exception {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = Complex.NaN;
        Complex result = c1.subtract(c2);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyWithNaN() throws Exception {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = Complex.NaN;
        Complex result = c1.multiply(c2);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideWithNaN() throws Exception {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = Complex.NaN;
        Complex result = c1.divide(c2);
        assertTrue(result.isNaN());
    }
}
