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
    public void testScale() {
        double[] arr = {1.0, 2.0, 3.0};
        double val = 2.0;
        double[] expected = {2.0, 4.0, 6.0};
        assertArrayEquals(expected, MathArrays.scale(val, arr), 1e-9);
    }

    @Test
    public void testScaleInPlace() {
        double[] arr = {1.0, 2.0, 3.0};
        double val = 2.0;
        double[] expected = {2.0, 4.0, 6.0};
        MathArrays.scaleInPlace(val, arr);
        assertArrayEquals(expected, arr, 1e-9);
    }

    @Test
    public void testEbeAdd() {
        double[] a = {1.0, 2.0};
        double[] b = {3.0, 4.0};
        double[] expected = {4.0, 6.0};
        assertArrayEquals(expected, MathArrays.ebeAdd(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeAddDimensionMismatch() {
        double[] a = {1.0, 2.0};
        double[] b = {3.0};
        MathArrays.ebeAdd(a, b);
    }

    @Test
    public void testEbeSubtract() {
        double[] a = {3.0, 4.0};
        double[] b = {1.0, 2.0};
        double[] expected = {2.0, 2.0};
        assertArrayEquals(expected, MathArrays.ebeSubtract(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeSubtractDimensionMismatch() {
        double[] a = {3.0, 4.0};
        double[] b = {1.0};
        MathArrays.ebeSubtract(a, b);
    }

    @Test
    public void testEbeMultiply() {
        double[] a = {1.0, 2.0, 3.0};
        double[] b = {4.0, 5.0, 6.0};
        double[] expected = {4.0, 10.0, 18.0};
        assertArrayEquals(expected, MathArrays.ebeMultiply(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiplyDimensionMismatch() {
        double[] a = {1.0, 2.0};
        double[] b = {4.0, 5.0, 6.0};
        MathArrays.ebeMultiply(a, b);
    }

    @Test
    public void testEbeDivide() {
        double[] a = {4.0, 10.0, 18.0};
        double[] b = {1.0, 2.0, 3.0};
        double[] expected = {4.0, 5.0, 6.0};
        assertArrayEquals(expected, MathArrays.ebeDivide(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivideDimensionMismatch() {
        double[] a = {4.0, 10.0};
        double[] b = {1.0, 2.0, 3.0};
        MathArrays.ebeDivide(a, b);
    }

    @Test
    public void testDistance1Double() {
        double[] p1 = {1.0, 2.0, 3.0};
        double[] p2 = {4.0, 5.0, 6.0};
        assertEquals(9.0, MathArrays.distance1(p1, p2), 1e-9);
    }

    @Test
    public void testDistance1Int() {
        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5, 6};
        assertEquals(9, MathArrays.distance1(p1, p2));
    }

    @Test
    public void testDistanceDouble() {
        double[] p1 = {1.0, 0.0};
        double[] p2 = {4.0, 0.0};
        assertEquals(3.0, MathArrays.distance(p1, p2), 1e-9);
    }

    @Test
    public void testDistanceInt() {
        int[] p1 = {1, 0};
        int[] p2 = {4, 0};
        assertEquals(3.0, MathArrays.distance(p1, p2), 1e-9);
    }

    @Test
    public void testDistanceInfDouble() {
        double[] p1 = {1.0, 5.0};
        double[] p2 = {4.0, 2.0};
        assertEquals(3.0, MathArrays.distanceInf(p1, p2), 1e-9);
    }

    @Test
    public void testDistanceInfInt() {
        int[] p1 = {1, 5};
        int[] p2 = {4, 2};
        assertEquals(3, MathArrays.distanceInf(p1, p2));
    }

    @Test
    public void testIsMonotonicIncreasingStrictTrue() {
        String[] val = {"a", "b", "c"};
        assertTrue(MathArrays.isMonotonic(val, MathArrays.OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicIncreasingStrictFalse() {
        String[] val = {"a", "a", "c"};
        assertFalse(MathArrays.isMonotonic(val, MathArrays.OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicIncreasingNotStrictTrue() {
        String[] val = {"a", "a", "c"};
        assertTrue(MathArrays.isMonotonic(val, MathArrays.OrderDirection.INCREASING, false));
    }

    @Test
    public void testIsMonotonicDecreasingStrictTrue() {
        String[] val = {"c", "b", "a"};
        assertTrue(MathArrays.isMonotonic(val, MathArrays.OrderDirection.DECREASING, true));
    }

    @Test
    public void testIsMonotonicDecreasingStrictFalse() {
        String[] val = {"c", "c", "a"};
        assertFalse(MathArrays.isMonotonic(val, MathArrays.OrderDirection.DECREASING, true));
    }

    @Test
    public void testIsMonotonicDecreasingNotStrictTrue() {
        String[] val = {"c", "c", "a"};
        assertTrue(MathArrays.isMonotonic(val, MathArrays.OrderDirection.DECREASING, false));
    }

    @Test
    public void testCheckOrderDoubleIncreasingStrictTrue() throws NonMonotonicSequenceException {
        double[] val = {1.0, 2.0, 3.0};
        assertTrue(MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, true, false));
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderDoubleIncreasingStrictFalseAbort() throws NonMonotonicSequenceException {
        double[] val = {1.0, 1.0, 3.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, true, true);
    }

    @Test
    public void testCheckOrderDoubleIncreasingNotStrictTrue() throws NonMonotonicSequenceException {
        double[] val = {1.0, 1.0, 3.0};
        assertTrue(MathArrays.checkOrder(val, MathArrays.OrderDirection.INCREASING, false, false));
    }

    @Test
    public void testCheckOrderDoubleDecreasingStrictTrue() throws NonMonotonicSequenceException {
        double[] val = {3.0, 2.0, 1.0};
        assertTrue(MathArrays.checkOrder(val, MathArrays.OrderDirection.DECREASING, true, false));
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderDoubleDecreasingStrictFalseAbort() throws NonMonotonicSequenceException {
        double[] val = {3.0, 3.0, 1.0};
        MathArrays.checkOrder(val, MathArrays.OrderDirection.DECREASING, true, true);
    }

    @Test
    public void testCheckOrderDoubleDecreasingNotStrictTrue() throws NonMonotonicSequenceException {
        double[] val = {3.0, 3.0, 1.0};
        assertTrue(MathArrays.checkOrder(val, MathArrays.OrderDirection.DECREASING, false, false));
    }

    @Test
    public void testCheckOrderDouble() throws NonMonotonicSequenceException {
        double[] val = {1.0, 2.0, 3.0};
        MathArrays.checkOrder(val);
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderDoubleNonMonotonic() throws NonMonotonicSequenceException {
        double[] val = {1.0, 3.0, 2.0};
        MathArrays.checkOrder(val);
    }

    @Test
    public void testCheckRectangular() {
        long[][] in = {{1L, 2L}, {3L, 4L}};
        try {
            MathArrays.checkRectangular(in);
        } catch (DimensionMismatchException e) {
            fail("Should not throw DimensionMismatchException");
        } catch (NullArgumentException e) {
            fail("Should not throw NullArgumentException");
        }
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckRectangularDimensionMismatch() {
        long[][] in = {{1L, 2L}, {3L}};
        MathArrays.checkRectangular(in);
    }

    @Test(expected = NullArgumentException.class)
    public void testCheckRectangularNull() {
        MathArrays.checkRectangular(null);
    }

    @Test
    public void testCheckPositive() {
        double[] in = {1.0, 2.0, 3.0};
        try {
            MathArrays.checkPositive(in);
        } catch (NotStrictlyPositiveException e) {
            fail("Should not throw NotStrictlyPositiveException");
        }
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveNonStrict() {
        double[] in = {1.0, 0.0, 3.0};
        MathArrays.checkPositive(in);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveNegative() {
        double[] in = {1.0, -2.0, 3.0};
        MathArrays.checkPositive(in);
    }

    @Test
    public void testCheckNonNegativeLong() {
        long[] in = {0L, 1L, 2L};
        try {
            MathArrays.checkNonNegative(in);
        } catch (NotPositiveException e) {
            fail("Should not throw NotPositiveException");
        }
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegativeLongNegative() {
        long[] in = {-1L, 1L, 2L};
        MathArrays.checkNonNegative(in);
    }

    @Test
    public void testCheckNonNegativeLong2D() {
        long[][] in = {{0L, 1L}, {2L, 3L}};
        try {
            MathArrays.checkNonNegative(in);
        } catch (NotPositiveException e) {
            fail("Should not throw NotPositiveException");
        }
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegativeLong2DNegative() {
        long[][] in = {{0L, -1L}, {2L, 3L}};
        MathArrays.checkNonNegative(in);
    }

    @Test
    public void testSafeNorm() {
        double[] v = {3.0, 4.0};
        assertEquals(5.0, MathArrays.safeNorm(v), 1e-9);
    }

    @Test
    public void testSafeNormZero() {
        double[] v = {0.0, 0.0};
        assertEquals(0.0, MathArrays.safeNorm(v), 1e-9);
    }

    @Test
    public void testSafeNormLargeValues() {
        double[] v = {1e20, 1e20};
        assertEquals(Math.sqrt(2) * 1e20, MathArrays.safeNorm(v), 1e20 * 1e-9);
    }

    @Test
    public void testSafeNormSmallValues() {
        double[] v = {1e-20, 1e-20};
        assertEquals(Math.sqrt(2) * 1e-20, MathArrays.safeNorm(v), 1e-20 * 1e-9);
    }

    @Test
    public void testSortInPlace() {
        double[] x = {3.0, 1.0, 2.0};
        double[] y = {1.0, 2.0, 3.0};
        double[] z = {0.0, 5.0, 7.0};
        double[] expectedX = {1.0, 2.0, 3.0};
        double[] expectedY = {2.0, 3.0, 1.0};
        double[] expectedZ = {5.0, 7.0, 0.0};

        MathArrays.sortInPlace(x, y, z);
        assertArrayEquals(expectedX, x, 1e-9);
        assertArrayEquals(expectedY, y, 1e-9);
        assertArrayEquals(expectedZ, z, 1e-9);
    }

    @Test
    public void testSortInPlaceDecreasing() {
        double[] x = {3.0, 1.0, 2.0};
        double[] y = {1.0, 2.0, 3.0};
        // The reference source code sorts in decreasing order, meaning the largest element comes first.
        // For x = {3.0, 1.0, 2.0}, the sorted order is {3.0, 2.0, 1.0}.
        // The corresponding permutation for y should be {1.0, 3.0, 2.0}.
        double[] expectedX = {3.0, 2.0, 1.0};
        double[] expectedY = {1.0, 3.0, 2.0};

        MathArrays.sortInPlace(x, MathArrays.OrderDirection.DECREASING, y);
        assertArrayEquals(expectedX, x, 1e-9);
        assertArrayEquals(expectedY, y, 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlaceDimensionMismatch() {
        double[] x = {3.0, 1.0, 2.0};
        double[] y = {1.0, 2.0};
        MathArrays.sortInPlace(x, y);
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlaceNullX() {
        MathArrays.sortInPlace(null, new double[]{1.0});
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlaceNullY() {
        double[] x = {3.0, 1.0};
        MathArrays.sortInPlace(x, (double[]) null);
    }

    @Test
    public void testCopyOfInt() {
        int[] source = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, MathArrays.copyOf(source));
    }

    @Test
    public void testCopyOfIntTruncated() {
        int[] source = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, MathArrays.copyOf(source, 3));
    }

    @Test
    public void testCopyOfIntPadded() {
        int[] source = {1, 2, 3};
        int[] expected = {1, 2, 3, 0, 0};
        assertArrayEquals(expected, MathArrays.copyOf(source, 5));
    }

    @Test
    public void testCopyOfDouble() {
        double[] source = {1.0, 2.0, 3.0};
        double[] expected = {1.0, 2.0, 3.0};
        assertArrayEquals(expected, MathArrays.copyOf(source), 1e-9);
    }

    @Test
    public void testCopyOfDoubleTruncated() {
        double[] source = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expected = {1.0, 2.0, 3.0};
        assertArrayEquals(expected, MathArrays.copyOf(source, 3), 1e-9);
    }

    @Test
    public void testCopyOfDoublePadded() {
        double[] source = {1.0, 2.0, 3.0};
        double[] expected = {1.0, 2.0, 3.0, 0.0, 0.0};
        assertArrayEquals(expected, MathArrays.copyOf(source, 5), 1e-9);
    }

    @Test
    public void testLinearCombinationArrayDouble() {
        double[] a = {1.0, 2.0};
        double[] b = {3.0, 4.0};
        assertEquals(1.0 * 3.0 + 2.0 * 4.0, MathArrays.linearCombination(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testLinearCombinationArrayDoubleMismatch() {
        double[] a = {1.0, 2.0};
        double[] b = {3.0};
        MathArrays.linearCombination(a, b);
    }

    @Test
    public void testLinearCombinationDoubleDoubleDoubleDouble() {
        assertEquals(1.0 * 2.0 + 3.0 * 4.0, MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0), 1e-9);
    }

    @Test
    public void testLinearCombinationDoubleDoubleDoubleDoubleDoubleDouble() {
        assertEquals(1.0 * 2.0 + 3.0 * 4.0 + 5.0 * 6.0, MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0), 1e-9);
    }

    @Test
    public void testLinearCombinationDoubleDoubleDoubleDoubleDoubleDoubleDoubleDouble() {
        assertEquals(1.0 * 2.0 + 3.0 * 4.0 + 5.0 * 6.0 + 7.0 * 8.0, MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0), 1e-9);
    }

    @Test
    public void testEqualsFloat() {
        float[] x = {1.0f, 2.0f, 3.0f};
        float[] y = {1.0f, 2.0f, 3.0f};
        assertTrue(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsFloatNull() {
        float[] x = null;
        float[] y = null;
        assertTrue(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsFloatDifferentLength() {
        float[] x = {1.0f, 2.0f};
        float[] y = {1.0f, 2.0f, 3.0f};
        assertFalse(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsFloatDifferentValues() {
        float[] x = {1.0f, 2.0f, 3.0f};
        float[] y = {1.0f, 2.1f, 3.0f};
        assertFalse(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsIncludingNaNFloat() {
        float[] x = {1.0f, Float.NaN, 3.0f};
        float[] y = {1.0f, Float.NaN, 3.0f};
        assertTrue(MathArrays.equalsIncludingNaN(x, y));
    }

    @Test
    public void testEqualsIncludingNaNFloatDifferentNaN() {
        float[] x = {1.0f, Float.NaN, 3.0f};
        float[] y = {1.0f, Float.NaN, 3.1f};
        assertFalse(MathArrays.equalsIncludingNaN(x, y));
    }

    @Test
    public void testEqualsDouble() {
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {1.0, 2.0, 3.0};
        assertTrue(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsDoubleNull() {
        double[] x = null;
        double[] y = null;
        assertTrue(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsDoubleDifferentLength() {
        double[] x = {1.0, 2.0};
        double[] y = {1.0, 2.0, 3.0};
        assertFalse(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsDoubleDifferentValues() {
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {1.0, 2.1, 3.0};
        assertFalse(MathArrays.equals(x, y));
    }

    @Test
    public void testEqualsIncludingNaNdouble() {
        double[] x = {1.0, Double.NaN, 3.0};
        double[] y = {1.0, Double.NaN, 3.0};
        assertTrue(MathArrays.equalsIncludingNaN(x, y));
    }

    @Test
    public void testEqualsIncludingNaNdoubleDifferentNaN() {
        double[] x = {1.0, Double.NaN, 3.0};
        double[] y = {1.0, Double.NaN, 3.1};
        assertFalse(MathArrays.equalsIncludingNaN(x, y));
    }

    @Test
    public void testNormalizeArray() throws MathIllegalArgumentException, MathArithmeticException {
        double[] values = {1.0, 2.0, 3.0};
        double normalizedSum = 6.0;
        double[] expected = {1.0, 2.0, 3.0};
        assertArrayEquals(expected, MathArrays.normalizeArray(values, normalizedSum), 1e-9);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayInfiniteSum() throws MathIllegalArgumentException, MathArithmeticException {
        double[] values = {1.0, 2.0, 3.0};
        MathArrays.normalizeArray(values, Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayNaNSum() throws MathIllegalArgumentException, MathArithmeticException {
        double[] values = {1.0, 2.0, 3.0};
        MathArrays.normalizeArray(values, Double.NaN);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeArrayZeroSum() throws MathIllegalArgumentException, MathArithmeticException {
        double[] values = {0.0, 0.0};
        MathArrays.normalizeArray(values, 1.0);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayInfiniteElement() throws MathIllegalArgumentException, MathArithmeticException {
        double[] values = {1.0, Double.POSITIVE_INFINITY, 3.0};
        MathArrays.normalizeArray(values, 1.0);
    }

    @Test
    public void testConvolve() throws NullArgumentException, NoDataException {
        double[] x = {1.0, 2.0};
        double[] h = {3.0, 4.0};
        double[] expected = {3.0, 10.0, 8.0};
        assertArrayEquals(expected, MathArrays.convolve(x, h), 1e-9);
    }

    @Test(expected = NoDataException.class)
    public void testConvolveEmptyX() throws NullArgumentException, NoDataException {
        double[] x = {};
        double[] h = {3.0, 4.0};
        MathArrays.convolve(x, h);
    }

    @Test(expected = NoDataException.class)
    public void testConvolveEmptyH() throws NullArgumentException, NoDataException {
        double[] x = {1.0, 2.0};
        double[] h = {};
        MathArrays.convolve(x, h);
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolveNullX() throws NullArgumentException, NoDataException {
        double[] h = {3.0, 4.0};
        MathArrays.convolve(null, h);
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolveNullH() throws NullArgumentException, NoDataException {
        double[] x = {1.0, 2.0};
        MathArrays.convolve(x, null);
    }

    @Test
    public void testConvolveSingleElement() throws NullArgumentException, NoDataException {
        double[] x = {5.0};
        double[] h = {2.0};
        double[] expected = {10.0};
        assertArrayEquals(expected, MathArrays.convolve(x, h), 1e-9);
    }

    @Test
    public void testConvolveLongerOutput() throws NullArgumentException, NoDataException {
        double[] x = {1.0, 2.0, 3.0};
        double[] h = {4.0, 5.0};
        double[] expected = {4.0, 13.0, 22.0, 15.0};
        assertArrayEquals(expected, MathArrays.convolve(x, h), 1e-9);
    }
}
