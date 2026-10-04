package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.util.MathUtils;

public class MultidimensionalCounterTest {
    @Test
    public void testConstructorWithOneDimension() throws Exception {
        final int[] size = {5};
        final MultidimensionalCounter counter = new MultidimensionalCounter(size);
        assertEquals(1, counter.getDimension());
        assertArrayEquals(new int[]{5}, counter.getSizes());
        assertEquals(5, counter.getSize());
    }

    @Test
    public void testConstructorWithMultipleDimensions() throws Exception {
        final int[] size = {2, 3, 4};
        final MultidimensionalCounter counter = new MultidimensionalCounter(size);
        assertEquals(3, counter.getDimension());
        assertArrayEquals(new int[]{2, 3, 4}, counter.getSizes());
        assertEquals(24, counter.getSize());
    }

    @Test
    public void testConstructorWithLargeDimensions() throws Exception {
        final int[] size = {100, 200, 300};
        final MultidimensionalCounter counter = new MultidimensionalCounter(size);
        assertEquals(3, counter.getDimension());
        assertArrayEquals(new int[]{100, 200, 300}, counter.getSizes());
        assertEquals(6000000, counter.getSize());
    }

    @Test
    public void testConstructorThrowsNotStrictlyPositiveExceptionForZeroSize() throws Exception {
        try {
            new MultidimensionalCounter(1, 0, 2);
            fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            // Expected exception
        }
    }

    @Test
    public void testConstructorThrowsNotStrictlyPositiveExceptionForNegativeSize() throws Exception {
        try {
            new MultidimensionalCounter(1, -2, 3);
            fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            // Expected exception
        }
    }

    @Test
    public void testGetDimension() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3, 4);
        assertEquals(3, counter.getDimension());
    }

    @Test
    public void testGetSizes() throws Exception {
        final int[] size = {2, 3, 4};
        final MultidimensionalCounter counter = new MultidimensionalCounter(size);
        assertArrayEquals(size, counter.getSizes());
    }

    @Test
    public void testGetSize() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3, 4);
        assertEquals(24, counter.getSize());
    }

    @Test
    public void testIteratorBasic() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        final java.util.Iterator<Integer> iterator = counter.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(0, (int) iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(1, (int) iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, (int) iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, (int) iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(4, (int) iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(5, (int) iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorEnd() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 2);
        final java.util.Iterator<Integer> iterator = counter.iterator();
        for (int i = 0; i < 4; i++) {
            iterator.next();
        }
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorSingleDimension() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(5);
        final java.util.Iterator<Integer> iterator = counter.iterator();
        for (int i = 0; i < 5; i++) {
            assertTrue(iterator.hasNext());
            assertEquals(i, (int) iterator.next());
        }
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorWithThreeDimensions() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3, 2);
        final java.util.Iterator<Integer> iterator = counter.iterator();
        int expectedCount = 0;
        while (iterator.hasNext()) {
            assertEquals(expectedCount, (int) iterator.next());
            expectedCount++;
        }
        assertEquals(12, expectedCount);
    }

    @Test
    public void testIteratorGetCounts() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        final MultidimensionalCounter.Iterator iterator = counter.iterator();
        iterator.next(); // count = 0, counter = {0, 0}
        assertArrayEquals(new int[]{0, 0}, iterator.getCounts());
        iterator.next(); // count = 1, counter = {0, 1}
        assertArrayEquals(new int[]{0, 1}, iterator.getCounts());
        iterator.next(); // count = 2, counter = {0, 2}
        assertArrayEquals(new int[]{0, 2}, iterator.getCounts());
        iterator.next(); // count = 3, counter = {1, 0}
        assertArrayEquals(new int[]{1, 0}, iterator.getCounts());
    }

    @Test
    public void testIteratorGetCountForDimension() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3, 2);
        final MultidimensionalCounter.Iterator iterator = counter.iterator();
        iterator.next(); // 0: {0,0,0}
        assertEquals(0, iterator.getCount(0));
        assertEquals(0, iterator.getCount(1));
        assertEquals(0, iterator.getCount(2));

        iterator.next(); // 1: {0,0,1}
        assertEquals(0, iterator.getCount(0));
        assertEquals(0, iterator.getCount(1));
        assertEquals(1, iterator.getCount(2));

        iterator.next(); // 2: {0,1,0}
        assertEquals(0, iterator.getCount(0));
        assertEquals(1, iterator.getCount(1));
        assertEquals(0, iterator.getCount(2));

        iterator.next(); // 3: {0,1,1}
        assertEquals(0, iterator.getCount(0));
        assertEquals(1, iterator.getCount(1));
        assertEquals(1, iterator.getCount(2));

        iterator.next(); // 4: {0,2,0}
        assertEquals(0, iterator.getCount(0));
        assertEquals(2, iterator.getCount(1));
        assertEquals(0, iterator.getCount(2));

        iterator.next(); // 5: {0,2,1}
        assertEquals(0, iterator.getCount(0));
        assertEquals(2, iterator.getCount(1));
        assertEquals(1, iterator.getCount(2));

        iterator.next(); // 6: {1,0,0}
        assertEquals(1, iterator.getCount(0));
        assertEquals(0, iterator.getCount(1));
        assertEquals(0, iterator.getCount(2));
    }

    @Test
    public void testIteratorGetCountException() {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        final MultidimensionalCounter.Iterator iterator = counter.iterator();
        try {
            iterator.getCount(2);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // Expected
        }
        try {
            iterator.getCount(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // Expected
        }
    }

    @Test
    public void testGetCountsBasic() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3, 4);
        assertArrayEquals(new int[]{0, 0, 0}, counter.getCounts(0));
        assertArrayEquals(new int[]{0, 0, 1}, counter.getCounts(1));
        assertArrayEquals(new int[]{0, 0, 3}, counter.getCounts(3));
        assertArrayEquals(new int[]{0, 1, 0}, counter.getCounts(4));
        assertArrayEquals(new int[]{1, 2, 3}, counter.getCounts(23));
    }

    @Test
    public void testGetCountsWithOneDimension() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(5);
        assertArrayEquals(new int[]{0}, counter.getCounts(0));
        assertArrayEquals(new int[]{4}, counter.getCounts(4));
    }

    @Test
    public void testGetCountsThrowsOutOfRangeExceptionForNegativeIndex() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        try {
            counter.getCounts(-1);
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
            // Expected
        }
    }

    @Test
    public void testGetCountsThrowsOutOfRangeExceptionForIndexTooLarge() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        try {
            counter.getCounts(6); // Total size is 6
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
            // Expected
        }
    }

    @Test
    public void testGetCountsForTotalSizeMinusOne() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3, 4);
        assertArrayEquals(new int[]{1, 2, 3}, counter.getCounts(23));
    }

    @Test
    public void testGetCountBasic() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3, 4);
        assertEquals(0, counter.getCount(0, 0, 0));
        assertEquals(1, counter.getCount(0, 0, 1));
        assertEquals(3, counter.getCount(0, 0, 3));
        assertEquals(4, counter.getCount(0, 1, 0));
        assertEquals(23, counter.getCount(1, 2, 3));
    }

    @Test
    public void testGetCountWithOneDimension() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(5);
        assertEquals(0, counter.getCount(0));
        assertEquals(4, counter.getCount(4));
    }

    @Test
    public void testGetCountThrowsDimensionMismatchException() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        try {
            counter.getCount(0, 1, 2);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            // Expected
        }
        try {
            counter.getCount();
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            // Expected
        }
    }

    @Test
    public void testGetCountThrowsOutOfRangeExceptionForNegativeIndex() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        try {
            counter.getCount(-1, 0);
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
            // Expected
        }
    }

    @Test
    public void testGetCountThrowsOutOfRangeExceptionForIndexTooLarge() throws Exception {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        try {
            counter.getCount(0, 3); // Size for second dim is 3, max index is 2
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
            // Expected
        }
    }

    @Test
    public void testToString() throws Exception {
        final MultidimensionalCounter counterDim1 = new MultidimensionalCounter(3);
        assertEquals("[0]", counterDim1.toString());
    }

    @Test
    public void testIteratorRemoveUnsupported() {
        final MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        final java.util.Iterator<Integer> iterator = counter.iterator();
        try {
            iterator.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Expected
        }
    }
}
