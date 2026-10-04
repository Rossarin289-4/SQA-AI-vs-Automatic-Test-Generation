package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.data.general.Series;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesException;

public class XYSeriesTest {
    @Test
    public void testConstructorFlagsAndEmptyState() throws Exception {
        XYSeries s = new XYSeries("key", false, false);
        assertFalse(s.getAutoSort());
        assertFalse(s.getAllowDuplicateXValues());
        assertEquals(0, s.getItemCount());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
    }

    @Test
    public void testAutoSortAndDuplicateInsertion() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(3.0, 30.0);
        s.add(1.0, 10.0);
        s.add(3.0, 31.0);
        assertEquals(1.0, s.getX(0).doubleValue(), 0.0);
        assertEquals(30.0, s.getY(1).doubleValue(), 0.0);
        assertEquals(31.0, s.getY(2).doubleValue(), 0.0);
    }

    @Test
    public void testRejectDuplicateWhenNotAllowed() throws Exception {
        XYSeries s = new XYSeries("key", true, false);
        s.add(1.0, 10.0);
        try {
            s.add(1.0, 20.0);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) {
            assertEquals(1, s.getItemCount());
        }
    }

    @Test
    public void testUnsortedInsertionAndIndexLookup() throws Exception {
        XYSeries s = new XYSeries("key", false, true);
        s.add(3.0, 30.0);
        s.add(1.0, 10.0);
        assertEquals(3.0, s.getX(0).doubleValue(), 0.0);
        assertEquals(1, s.indexOf(1.0));
        assertEquals(-1, s.indexOf(2.0));
    }

    @Test
    public void testUnsortedDuplicateRejected() throws Exception {
        XYSeries s = new XYSeries("key", false, false);
        s.add(2.0, 20.0);
        try {
            s.add(2.0, 21.0);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) {
            assertEquals(1, s.getItemCount());
        }
    }

    @Test
    public void testMaximumCountTrimsOldestItems() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.add(3.0, 30.0);
        s.setMaximumItemCount(2);
        assertEquals(2, s.getItemCount());
        assertEquals(2.0, s.getX(0).doubleValue(), 0.0);
        s.add(4.0, 40.0);
        assertEquals(3.0, s.getX(0).doubleValue(), 0.0);
    }

    @Test
    public void testZeroMaximumCountRemovesAddedItem() throws Exception {
        XYSeries s = new XYSeries("key");
        s.setMaximumItemCount(0);
        s.add(1.0, 10.0);
        assertEquals(0, s.getItemCount());
        assertEquals(0, s.getMaximumItemCount());
    }

    @Test
    public void testAddNullItemThrows() throws Exception {
        XYSeries s = new XYSeries("key");
        try {
            s.add((XYDataItem) null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(0, s.getItemCount());
        }
    }

    @Test
    public void testDeleteInclusiveRange() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.add(3.0, 30.0);
        s.add(4.0, 40.0);
        s.delete(1, 2);
        assertEquals(2, s.getItemCount());
        assertEquals(1.0, s.getX(0).doubleValue(), 0.0);
        assertEquals(4.0, s.getX(1).doubleValue(), 0.0);
    }

    @Test
    public void testRemoveReturnsRemovedItem() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        XYDataItem removed = s.remove(0);
        assertEquals(1.0, removed.getXValue(), 0.0);
        assertEquals(1, s.getItemCount());
        assertEquals(2.0, s.getX(0).doubleValue(), 0.0);
    }

    @Test
    public void testClearRemovesAllItems() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        s.clear();
        assertEquals(0, s.getItemCount());
        s.clear();
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testItemsListIsUnmodifiable() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        List items = s.getItems();
        assertEquals(1, items.size());
        try {
            items.clear();
            fail("expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) {
            assertEquals(1, s.getItemCount());
        }
    }

    @Test
    public void testUpdateByIndexAllowsNullY() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        s.updateByIndex(0, null);
        assertNull(s.getY(0));
    }

    @Test
    public void testUpdateExistingX() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.update(2.0, 25.0);
        assertEquals(25.0, s.getY(1).doubleValue(), 0.0);
        assertEquals(2, s.getItemCount());
    }

    @Test
    public void testUpdateMissingXThrows() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        try {
            s.update(2.0, 20.0);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) {
            assertEquals(10.0, s.getY(0).doubleValue(), 0.0);
        }
    }

    @Test
    public void testAddOrUpdateAddsAndReturnsNull() throws Exception {
        XYSeries s = new XYSeries("key", true, false);
        XYDataItem old = s.addOrUpdate(2.0, 20.0);
        assertNull(old);
        assertEquals(1, s.getItemCount());
        assertEquals(20.0, s.getY(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateReturnsOldValueAndReplacesY() throws Exception {
        XYSeries s = new XYSeries("key", true, false);
        s.add(2.0, 20.0);
        XYDataItem old = s.addOrUpdate(2.0, 25.0);
        assertEquals(20.0, old.getYValue(), 0.0);
        assertEquals(25.0, s.getY(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateWithDuplicatesAllowedAppends() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        assertNull(s.addOrUpdate(1.0, 11.0));
        assertEquals(2, s.getItemCount());
        assertEquals(11.0, s.getY(1).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateRejectsNullX() throws Exception {
        XYSeries s = new XYSeries("key", true, false);
        try {
            s.addOrUpdate((Number) null, 1.0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(0, s.getItemCount());
        }
    }

    @Test
    public void testToArrayConvertsNullYToNaN() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(2.0, (Number) null);
        s.add(3.0, 4.0);
        double[][] a = s.toArray();
        assertEquals(2, a.length);
        assertEquals(2.0, a[0][0], 0.0);
        assertTrue(Double.isNaN(a[1][0]));
        assertEquals(4.0, a[1][1], 0.0);
    }

    @Test
    public void testCreateCopyOfMiddleRange() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.add(3.0, 30.0);
        XYSeries copy = s.createCopy(1, 2);
        assertEquals(2, copy.getItemCount());
        assertEquals(2.0, copy.getX(0).doubleValue(), 0.0);
        assertEquals(3.0, copy.getX(1).doubleValue(), 0.0);
    }

    @Test
    public void testCloneEqualsAndIndependentData() throws Exception {
        XYSeries s = new XYSeries("key");
        s.add(1.0, 10.0);
        XYSeries copy = (XYSeries) s.clone();
        assertTrue(s.equals(copy));
        copy.updateByIndex(0, 20.0);
        assertFalse(s.equals(copy));
        assertEquals(10.0, s.getY(0).doubleValue(), 0.0);
    }

    @Test
    public void testEqualsChecksConfigurationAndData() throws Exception {
        XYSeries a = new XYSeries("key", true, true);
        XYSeries b = new XYSeries("key", true, false);
        a.add(1.0, 2.0);
        b.add(1.0, 2.0);
        assertFalse(a.equals(b));
        XYSeries c = new XYSeries("key", true, true);
        c.add(1.0, 2.0);
        assertTrue(a.equals(c));
        assertFalse(a.equals(null));
    }

    @Test
    public void testHashCodeStableForEqualSeries() throws Exception {
        XYSeries a = new XYSeries("key");
        XYSeries b = new XYSeries("key");
        a.add(1.0, 2.0);
        b.add(1.0, 2.0);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
