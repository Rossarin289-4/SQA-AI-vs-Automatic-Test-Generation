package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

public class MathArraysTest {
    @Test
    public void testScaleAndCopy() throws Exception {
        double[] input = {2, -3};
        assertArrayEquals(new double[] {4, -6}, MathArrays.scale(2, input), 0);
        assertArrayEquals(new double[] {2, -3}, input, 0);
    }

    @Test
    public void testScaleInPlace() throws Exception {
        double[] input = {0, -2, 3};
        MathArrays.scaleInPlace(-2, input);
        assertArrayEquals(new double[] {0, 4, -6}, input, 0);
    }

    @Test
    public void testElementwiseAddition() throws Exception {
        assertArrayEquals(new double[] {5, 1}, MathArrays.ebeAdd(new double[] {2, -3}, new double[] {3, 4}), 0);
    }

    @Test
    public void testElementwiseSubtraction() throws Exception {
        assertArrayEquals(new double[] {-1, -7}, MathArrays.ebeSubtract(new double[] {2, -3}, new double[] {3, 4}), 0);
    }

    @Test
    public void testElementwiseMultiplication() throws Exception {
        assertArrayEquals(new double[] {6, -12}, MathArrays.ebeMultiply(new double[] {2, -3}, new double[] {3, 4}), 0);
    }

    @Test
    public void testElementwiseDivision() throws Exception {
        assertArrayEquals(new double[] {2, -2}, MathArrays.ebeDivide(new double[] {6, -8}, new double[] {3, 4}), 0);
    }

    @Test
    public void testDistanceOne() throws Exception {
        assertEquals(9, MathArrays.distance1(new double[] {1, -2, 5}, new double[] {3, 1, 1}), 0);
    }

    @Test
    public void testEuclideanDistance() throws Exception {
        assertEquals(5, MathArrays.distance(new double[] {1, 2}, new double[] {4, 6}), 0);
    }

    @Test
    public void testInfinityDistance() throws Exception {
        assertEquals(4, MathArrays.distanceInf(new double[] {1, -2, 5}, new double[] {3, 1, 1}), 0);
    }

    @Test
    public void testMonotonicStrictAndNonStrict() throws Exception {
        assertTrue(MathArrays.isMonotonic(new Integer[] {1, 2, 3}, MathArrays.OrderDirection.INCREASING, true));
        assertTrue(MathArrays.isMonotonic(new Integer[] {3, 3, 1}, MathArrays.OrderDirection.DECREASING, false));
        assertFalse(MathArrays.isMonotonic(new Integer[] {1, 2, 2}, MathArrays.OrderDirection.INCREASING, true));
    }

    @Test
    public void testCheckOrderBranches() throws Exception {
        assertTrue(MathArrays.checkOrder(new double[] {1, 2, 2}, MathArrays.OrderDirection.INCREASING, false, false));
        assertFalse(MathArrays.checkOrder(new double[] {1, 2, 2}, MathArrays.OrderDirection.INCREASING, true, false));
        assertTrue(MathArrays.checkOrder(new double[] {3, 2, 1}, MathArrays.OrderDirection.DECREASING, true, false));
    }

    @Test
    public void testCheckOrderAbort() throws Exception {
        try {
            MathArrays.checkOrder(new double[] {1, 3, 2}, MathArrays.OrderDirection.INCREASING, true, true);
            fail("expected NonMonotonicSequenceException");
        } catch (NonMonotonicSequenceException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testRectangularArray() throws Exception {
        MathArrays.checkRectangular(new long[][] {{1, 2}, {3, 4}});
        try {
            MathArrays.checkRectangular(new long[][] {{1, 2}, {3}});
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testPositiveArrayChecks() throws Exception {
        MathArrays.checkPositive(new double[] {0.5, 2});
        try {
            MathArrays.checkPositive(new double[] {1, 0});
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testNonNegativeArrayChecks() throws Exception {
        MathArrays.checkNonNegative(new long[] {0, 1, Long.MAX_VALUE});
        try {
            MathArrays.checkNonNegative(new long[] {0, -1});
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testSafeNorm() throws Exception {
        assertEquals(5, MathArrays.safeNorm(new double[] {3, 4}), 1e-12);
        assertEquals(0, MathArrays.safeNorm(new double[] {0, 0}), 0);
    }

    @Test
    public void testSortAscendingWithAssociatedArray() throws Exception {
        double[] x = {3, 1, 2};
        double[] y = {30, 10, 20};
        MathArrays.sortInPlace(x, y);
        assertArrayEquals(new double[] {1, 2, 3}, x, 0);
        assertArrayEquals(new double[] {10, 20, 30}, y, 0);
    }

    @Test
    public void testCopyOfWithLengthEdges() throws Exception {
        assertArrayEquals(new int[] {4, 5}, MathArrays.copyOf(new int[] {4, 5, 6}, 2));
        assertArrayEquals(new int[] {4, 5, 6, 0}, MathArrays.copyOf(new int[] {4, 5, 6}, 4));
        assertArrayEquals(new int[] {}, MathArrays.copyOf(new int[] {4}, 0));
    }

    @Test
    public void testLinearCombinationArray() throws Exception {
        assertEquals(11, MathArrays.linearCombination(new double[] {1, 2}, new double[] {3, 4}), 0);
        assertEquals(12, MathArrays.linearCombination(new double[] {3}, new double[] {4}), 0);
    }

    @Test
    public void testFloatArrayEquality() throws Exception {
        assertTrue(MathArrays.equals(new float[] {1, 2}, new float[] {1, 2}));
        assertFalse(MathArrays.equals(new float[] {1}, new float[] {2}));
        assertTrue(MathArrays.equals((float[]) null, (float[]) null));
        assertFalse(MathArrays.equals((float[]) null, new float[] {}));
    }

    @Test
    public void testFloatArrayEqualityIncludingNaN() throws Exception {
        assertTrue(MathArrays.equalsIncludingNaN(new float[] {Float.NaN, 2}, new float[] {Float.NaN, 2}));
        assertFalse(MathArrays.equalsIncludingNaN(new float[] {Float.NaN}, new float[] {1}));
    }

    @Test
    public void testNormalizeArray() throws Exception {
        assertArrayEquals(new double[] {2, 4}, MathArrays.normalizeArray(new double[] {1, 2}, 6), 0);
        assertTrue(Double.isNaN(MathArrays.normalizeArray(new double[] {1, Double.NaN}, 2)[1]));
    }

    @Test
    public void testConvolution() throws Exception {
        assertArrayEquals(new double[] {1, 4, 7, 6}, MathArrays.convolve(new double[] {1, 2, 3}, new double[] {1, 2}), 0);
        try {
            MathArrays.convolve(new double[] {}, new double[] {1});
            fail("expected NoDataException");
        } catch (NoDataException expected) {
            assertTrue(true);
        }
    }
}
