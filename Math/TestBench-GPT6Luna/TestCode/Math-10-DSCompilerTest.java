package org.apache.commons.math3.analysis.differentiation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

public class DSCompilerTest {

    @Test
    public void testCompilerDimensionsAndSize() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(2, 2);
        assertEquals(2, c.getFreeParameters());
        assertEquals(2, c.getOrder());
        assertEquals(6, c.getSize());
    }

    @Test
    public void testZeroParameterCompiler() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(0, 3);
        assertEquals(1, c.getSize());
        assertEquals(0, c.getPartialDerivativeIndex());
        assertArrayEquals(new int[0], c.getPartialDerivativeOrders(0));
    }

    @Test
    public void testIndexOrdersRoundTrip() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(2, 2);
        for (int i = 0; i < c.getSize(); i++) {
            int[] orders = c.getPartialDerivativeOrders(i);
            assertEquals(i, c.getPartialDerivativeIndex(orders));
        }
    }

    @Test
    public void testFirstOrderIndices() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(3, 1);
        assertEquals(0, c.getPartialDerivativeIndex(0, 0, 0));
        assertEquals(1, c.getPartialDerivativeIndex(1, 0, 0));
        assertEquals(2, c.getPartialDerivativeIndex(0, 1, 0));
        assertEquals(3, c.getPartialDerivativeIndex(0, 0, 1));
    }

    @Test
    public void testIndexRejectsWrongNumberOfOrders() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        try {
            c.getPartialDerivativeIndex(0);
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            assertEquals(2, expected.getDimension());
        }
    }

    @Test
    public void testIndexRejectsOrderAboveLimit() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        try {
            c.getPartialDerivativeIndex(3);
            fail("expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException expected) {
            assertEquals(2, expected.getMax());
        }
    }

    @Test
    public void testAddAndSubtractWithOffsets() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] a = {99, 4, 7, 99};
        double[] b = {99, 1, 3, 99};
        double[] r = new double[4];
        c.add(a, 1, b, 1, r, 1);
        assertArrayEquals(new double[] {0, 5, 10, 0}, r, 0);
        c.subtract(a, 1, b, 1, r, 1);
        assertArrayEquals(new double[] {0, 3, 4, 0}, r, 0);
    }

    @Test
    public void testLinearCombinationWithOffset() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] r = new double[4];
        c.linearCombination(2, new double[] {0, 3, 4, 0}, 1,
                           -1, new double[] {0, 1, 2, 0}, 1, r, 1);
        assertArrayEquals(new double[] {0, 5, 6, 0}, r, 0);
    }

    @Test
    public void testMultiplyFirstOrderStructures() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] r = new double[2];
        c.multiply(new double[] {2, 3}, 0, new double[] {5, 7}, 0, r, 0);
        assertArrayEquals(new double[] {10, 29}, r, 0);
    }

    @Test
    public void testDivideFirstOrderStructures() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] r = new double[2];
        c.divide(new double[] {6, 2}, 0, new double[] {3, 1}, 0, r, 0);
        assertEquals(2, r[0], 1e-12);
        assertEquals(0, r[1], 1e-12);
    }

    @Test
    public void testRemainderFirstOrderStructures() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] r = new double[2];
        c.remainder(new double[] {7, 5}, 0, new double[] {3, 2}, 0, r, 0);
        assertArrayEquals(new double[] {1, 1}, r, 1e-12);
    }

    @Test
    public void testIntegerPowerZero() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] r = new double[3];
        c.pow(new double[] {4, 3, 2}, 0, 0, r, 0);
        assertArrayEquals(new double[] {1, 0, 0}, r, 0);
    }

    @Test
    public void testPositiveIntegerPower() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] r = new double[3];
        c.pow(new double[] {2, 1, 0}, 0, 3, r, 0);
        assertArrayEquals(new double[] {8, 12, 12}, r, 1e-12);
    }

    @Test
    public void testFractionalPower() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] r = new double[3];
        c.pow(new double[] {4, 1, 0}, 0, 0.5, r, 0);
        assertEquals(2, r[0], 1e-12);
        assertEquals(0.25, r[1], 1e-12);
        assertEquals(-0.03125, r[2], 1e-12);
    }

    @Test
    public void testSquareRoot() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] r = new double[3];
        c.rootN(new double[] {4, 1, 0}, 0, 2, r, 0);
        assertEquals(2, r[0], 1e-12);
        assertEquals(0.25, r[1], 1e-12);
        assertEquals(-0.03125, r[2], 1e-12);
    }

    @Test
    public void testExponentialAndExpm1() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] exp = new double[2];
        double[] expm1 = new double[2];
        c.exp(new double[] {0, 1}, 0, exp, 0);
        c.expm1(new double[] {0, 1}, 0, expm1, 0);
        assertArrayEquals(new double[] {1, 1}, exp, 1e-12);
        assertArrayEquals(new double[] {0, 1}, expm1, 1e-12);
    }

    @Test
    public void testLogarithmVariants() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] log = new double[2];
        double[] log1p = new double[2];
        double[] log10 = new double[2];
        c.log(new double[] {2, 1}, 0, log, 0);
        c.log1p(new double[] {1, 1}, 0, log1p, 0);
        c.log10(new double[] {10, 1}, 0, log10, 0);
        assertEquals(Math.log(2), log[0], 1e-12);
        assertEquals(0.5, log[1], 1e-12);
        assertEquals(Math.log(2), log1p[0], 1e-12);
        assertEquals(0.5, log1p[1], 1e-12);
        assertEquals(1, log10[0], 1e-12);
        assertEquals(1 / (10 * Math.log(10)), log10[1], 1e-12);
    }

    @Test
    public void testSineAndCosine() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] s = new double[3];
        double[] co = new double[3];
        c.sin(new double[] {0, 1, 0}, 0, s, 0);
        c.cos(new double[] {0, 1, 0}, 0, co, 0);
        assertArrayEquals(new double[] {0, 1, 0}, s, 1e-12);
        assertArrayEquals(new double[] {1, 0, -1}, co, 1e-12);
    }

    @Test
    public void testTangentAtZero() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] r = new double[3];
        c.tan(new double[] {0, 1, 0}, 0, r, 0);
        assertArrayEquals(new double[] {0, 1, 0}, r, 1e-12);
    }

    @Test
    public void testInverseTrigonometricFunctionsAtZero() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] asin = new double[3];
        double[] acos = new double[3];
        double[] atan = new double[3];
        c.asin(new double[] {0, 1, 0}, 0, asin, 0);
        c.acos(new double[] {0, 1, 0}, 0, acos, 0);
        c.atan(new double[] {0, 1, 0}, 0, atan, 0);
        assertArrayEquals(new double[] {0, 1, 0}, asin, 1e-12);
        assertArrayEquals(new double[] {Math.PI / 2, -1, 0}, acos, 1e-12);
        assertArrayEquals(new double[] {0, 1, 0}, atan, 1e-12);
    }

    @Test
    public void testAtan2Axes() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] r = new double[2];
        c.atan2(new double[] {1, 1}, 0, new double[] {0, 0}, 0, r, 0);
        assertEquals(Math.PI / 2, r[0], 1e-12);
        assertEquals(0, r[1], 1e-12);
    }

    @Test
    public void testHyperbolicFunctionsAtZero() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] cosh = new double[3];
        double[] sinh = new double[3];
        double[] tanh = new double[3];
        c.cosh(new double[] {0, 1, 0}, 0, cosh, 0);
        c.sinh(new double[] {0, 1, 0}, 0, sinh, 0);
        c.tanh(new double[] {0, 1, 0}, 0, tanh, 0);
        assertArrayEquals(new double[] {1, 0, 1}, cosh, 1e-12);
        assertArrayEquals(new double[] {0, 1, 0}, sinh, 1e-12);
        assertArrayEquals(new double[] {0, 1, 0}, tanh, 1e-12);
    }

    @Test
    public void testInverseHyperbolicFunctionsAtZero() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] asinh = new double[3];
        double[] atanh = new double[3];
        c.asinh(new double[] {0, 1, 0}, 0, asinh, 0);
        c.atanh(new double[] {0, 1, 0}, 0, atanh, 0);
        assertArrayEquals(new double[] {0, 1, 0}, asinh, 1e-12);
        assertArrayEquals(new double[] {0, 1, 0}, atanh, 1e-12);
    }

    @Test
    public void testAcoshAtTwo() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] r = new double[2];
        c.acosh(new double[] {2, 1}, 0, r, 0);
        assertEquals(Math.log(2 + Math.sqrt(3)), r[0], 1e-12);
        assertEquals(1 / Math.sqrt(3), r[1], 1e-12);
    }

    @Test
    public void testCompositionForSquare() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] r = new double[3];
        c.compose(new double[] {2, 1, 0}, 0, new double[] {4, 4, 2}, r, 0);
        assertArrayEquals(new double[] {4, 4, 2}, r, 1e-12);
    }

    @Test
    public void testTaylorExpansion() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] ds = new double[3];
        ds[c.getPartialDerivativeIndex(0)] = 2;
        ds[c.getPartialDerivativeIndex(1)] = 3;
        ds[c.getPartialDerivativeIndex(2)] = 4;
        assertEquals(7, c.taylor(ds, 0, 1), 1e-12);
    }

    @Test
    public void testCompatibilityAndMismatch() throws Exception {
        DSCompiler c = DSCompiler.getCompiler(2, 2);
        c.checkCompatibility(DSCompiler.getCompiler(2, 2));
        try {
            c.checkCompatibility(DSCompiler.getCompiler(1, 2));
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            assertEquals(1, expected.getDimension());
        }
    }
}
