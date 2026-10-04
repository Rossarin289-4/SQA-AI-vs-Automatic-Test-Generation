package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.util.MathUtils;

public class MultidimensionalCounterTest {
    @Test
    public void testDimensionsAndSize() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3, 4);
        assertEquals(3, c.getDimension());
        assertEquals(24, c.getSize());
    }

    @Test
    public void testSizesAreCopiedOnInput() throws Exception {
        int[] sizes = {2, 3};
        MultidimensionalCounter c = new MultidimensionalCounter(sizes);
        sizes[0] = 9;
        assertArrayEquals(new int[] {2, 3}, c.getSizes());
    }

    @Test
    public void testSizesAreCopiedOnOutput() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        int[] sizes = c.getSizes();
        sizes[0] = 9;
        assertArrayEquals(new int[] {2, 3}, c.getSizes());
    }

    @Test
    public void testToString() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        assertEquals("[0][0]", c.toString());
    }

    @Test
    public void testOneDimensionalCountsAndIndex() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(5);
        assertArrayEquals(new int[] {0}, c.getCounts(0));
        assertArrayEquals(new int[] {4}, c.getCounts(4));
        assertEquals(4, c.getCount(4));
    }

    @Test
    public void testFirstAndLastMultidimensionalIndices() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        assertEquals(0, c.getCount(0, 0, 0));
        assertEquals(23, c.getCount(1, 3, 2));
        assertArrayEquals(new int[] {0, 0, 0}, c.getCounts(0));
        assertArrayEquals(new int[] {1, 3, 2}, c.getCounts(23));
    }

    @Test
    public void testIntermediateIndexConversions() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 3);
        assertEquals(3, c.getCount(0, 1, 0));
        assertArrayEquals(new int[] {0, 1, 0}, c.getCounts(3));
        assertEquals(12, c.getCount(1, 0, 0));
        assertArrayEquals(new int[] {1, 0, 0}, c.getCounts(12));
    }

    @Test
    public void testIteratorInitialStateAndFirstNext() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator it = c.iterator();
        assertTrue(it.hasNext());
        assertEquals(-1, it.getCount());
        assertArrayEquals(new int[] {0, -1}, it.getCounts());
        assertEquals(Integer.valueOf(0), it.next());
        assertEquals(0, it.getCount());
        assertArrayEquals(new int[] {0, 0}, it.getCounts());
    }

    @Test
    public void testIteratorAdvancesAcrossDimensionBoundary() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator it = c.iterator();
        assertEquals(Integer.valueOf(0), it.next());
        assertEquals(Integer.valueOf(1), it.next());
        assertEquals(Integer.valueOf(2), it.next());
        assertArrayEquals(new int[] {0, 2}, it.getCounts());
        assertEquals(Integer.valueOf(3), it.next());
        assertArrayEquals(new int[] {1, 0}, it.getCounts());
    }

    @Test
    public void testIteratorLastElementAndExhaustion() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 2);
        MultidimensionalCounter.Iterator it = c.iterator();
        assertEquals(Integer.valueOf(0), it.next());
        assertEquals(Integer.valueOf(1), it.next());
        assertEquals(Integer.valueOf(2), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(3), it.next());
        assertArrayEquals(new int[] {1, 1}, it.getCounts());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorCountsAreCopied() throws Exception {
        MultidimensionalCounter.Iterator it =
            new MultidimensionalCounter(2, 2).iterator();
        it.next();
        int[] counts = it.getCounts();
        counts[0] = 9;
        assertArrayEquals(new int[] {0, 0}, it.getCounts());
    }

    @Test
    public void testIteratorRemoveThrows() throws Exception {
        MultidimensionalCounter.Iterator it =
            new MultidimensionalCounter(2).iterator();
        try {
            it.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testZeroSizeDimensionIsRejected() throws Exception {
        try {
            new MultidimensionalCounter(2, 0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testNegativeSizeDimensionIsRejected() throws Exception {
        try {
            new MultidimensionalCounter(2, -1);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testDimensionMismatchIsRejected() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        try {
            c.getCount(1);
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
        }
    }

    @Test
    public void testNegativeMultidimensionalIndexIsRejected() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        try {
            c.getCount(-1, 0);
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
        }
    }

    @Test
    public void testIndexAtDimensionSizeIsRejected() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        try {
            c.getCount(2, 0);
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
        }
    }

    @Test
    public void testNegativeLinearIndexIsRejected() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        try {
            c.getCounts(-1);
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
        }
    }

    @Test
    public void testLinearIndexAtSizeIsRejected() throws Exception {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3);
        try {
            c.getCounts(6);
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
        }
    }
}
