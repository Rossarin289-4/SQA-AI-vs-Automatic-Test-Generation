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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorDefault() throws Exception {
        XYSeries series = new XYSeries("Test");
        assertEquals("Test", series.getKey());
        assertTrue(series.getAutoSort());
        assertTrue(series.getAllowDuplicateXValues());
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testConstructorWithAutoSort() throws Exception {
        XYSeries series = new XYSeries("Test", false);
        assertEquals("Test", series.getKey());
        assertFalse(series.getAutoSort());
        assertTrue(series.getAllowDuplicateXValues());
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testConstructorWithAutoSortAndAllowDuplicates() throws Exception {
        XYSeries series = new XYSeries("Test", false, false);
        assertEquals("Test", series.getKey());
        assertFalse(series.getAutoSort());
        assertFalse(series.getAllowDuplicateXValues());
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetAutoSort() throws Exception {
        XYSeries series = new XYSeries("Test", true);
        assertTrue(series.getAutoSort());
        series = new XYSeries("Test", false);
        assertFalse(series.getAutoSort());
    }

    @Test
    public void testGetAllowDuplicateXValues() throws Exception {
        XYSeries series = new XYSeries("Test", true, true);
        assertTrue(series.getAllowDuplicateXValues());
        series = new XYSeries("Test", true, false);
        assertFalse(series.getAllowDuplicateXValues());
    }

    @Test
    public void testGetItemCount() throws Exception {
        XYSeries series = new XYSeries("Test");
        assertEquals(0, series.getItemCount());
        series.add(1, 1);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testGetItemsEmpty() throws Exception {
        XYSeries series = new XYSeries("Test");
        assertTrue(series.getItems().isEmpty());
    }

    @Test
    public void testGetItemsNotEmpty() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        assertEquals(2, series.getItems().size());
        // The returned list is unmodifiable, so we check its size and content.
        // We cannot assert its concrete type or implementation details.
        assertEquals(new XYDataItem(1, 1), series.getItems().get(0));
        assertEquals(new XYDataItem(2, 2), series.getItems().get(1));
    }

    @Test
    public void testGetMaximumItemCount() throws Exception {
        XYSeries series = new XYSeries("Test");
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        series.setMaximumItemCount(10);
        assertEquals(10, series.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCount() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        assertEquals(3, series.getItemCount());
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, series.getDataItem(0).getXValue(), 0.0001);
        assertEquals(3.0, series.getDataItem(1).getXValue(), 0.0001);
    }

    @Test
    public void testSetMaximumItemCountWhenLess() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        assertEquals(3, series.getItemCount());
        series.setMaximumItemCount(5); // Should not remove anything
        assertEquals(3, series.getItemCount());
        assertEquals(1.0, series.getDataItem(0).getXValue(), 0.0001);
        assertEquals(2.0, series.getDataItem(1).getXValue(), 0.0001);
        assertEquals(3.0, series.getDataItem(2).getXValue(), 0.0001);
    }

    @Test
    public void testAddXYDataItem() throws Exception {
        XYSeries series = new XYSeries("Test");
        XYDataItem item = new XYDataItem(1, 1);
        series.add(item);
        assertEquals(1, series.getItemCount());
        assertEquals(item, series.getDataItem(0));
    }

    @Test
    public void testAddXYDataItemTwice() throws Exception {
        XYSeries series = new XYSeries("Test");
        XYDataItem item1 = new XYDataItem(1, 1);
        XYDataItem item2 = new XYDataItem(2, 2);
        series.add(item1);
        series.add(item2);
        assertEquals(2, series.getItemCount());
        assertEquals(item1, series.getDataItem(0));
        assertEquals(item2, series.getDataItem(1));
    }

    @Test
    public void testAddXYDataItemDuplicateXAutoSortTrue() throws Exception {
        XYSeries series = new XYSeries("Test", true, true);
        XYDataItem item1 = new XYDataItem(1, 1);
        XYDataItem item2 = new XYDataItem(1, 2);
        series.add(item1);
        series.add(item2); // should be added after item1
        assertEquals(2, series.getItemCount());
        assertEquals(item1, series.getDataItem(0));
        assertEquals(item2, series.getDataItem(1));
    }

    @Test
    public void testAddXYDataItemDuplicateXAutoSortFalse() throws Exception {
        XYSeries series = new XYSeries("Test", false, true);
        XYDataItem item1 = new XYDataItem(1, 1);
        XYDataItem item2 = new XYDataItem(1, 2);
        series.add(item1);
        series.add(item2); // should be added at the end
        assertEquals(2, series.getItemCount());
        assertEquals(item1, series.getDataItem(0));
        assertEquals(item2, series.getDataItem(1));
    }

    @Test
    public void testAddXYDataItemDuplicateXAllowFalse() throws Exception {
        XYSeries series = new XYSeries("Test", true, false);
        XYDataItem item1 = new XYDataItem(1, 1);
        XYDataItem item2 = new XYDataItem(1, 2);
        series.add(item1);
        try {
            series.add(item2);
            fail("Expected SeriesException for duplicate X value.");
        } catch (SeriesException e) {
            // Expected
        }
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddDoubleDouble() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 1.0);
        assertEquals(1, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddDoubleDoubleMultiple() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        assertEquals(2, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, series.getY(0).doubleValue(), 0.0001);
        assertEquals(2.0, series.getX(1).doubleValue(), 0.0001);
        assertEquals(2.0, series.getY(1).doubleValue(), 0.0001);
    }

    @Test
    public void testAddDoubleDoubleWithNullY() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, null);
        assertEquals(1, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertNull(series.getY(0));
    }

    @Test
    public void testAddNumberNumber() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(new Double(1), new Double(1));
        assertEquals(1, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddNumberNumberWithNullY() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(new Double(1), null);
        assertEquals(1, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertNull(series.getY(0));
    }

    @Test
    public void testAddNumberNumberDuplicateXAllowFalse() throws Exception {
        XYSeries series = new XYSeries("Test", true, false);
        series.add(new Double(1), new Double(1));
        try {
            series.add(new Double(1), new Double(2));
            fail("Expected SeriesException for duplicate X value.");
        } catch (SeriesException e) {
            // Expected
        }
        assertEquals(1, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testDelete() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        series.delete(1, 1); // delete item with x=2
        assertEquals(2, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(3.0, series.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testDeleteMultiple() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        series.add(4, 4);
        series.delete(1, 2); // delete items with x=2, x=3
        assertEquals(2, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(4.0, series.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testRemoveByIndex() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        XYDataItem removed = series.remove(1); // remove item with x=2
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, removed.getXValue(), 0.0001);
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(3.0, series.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testRemoveByNumber() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        XYDataItem removed = series.remove(new Double(2)); // remove item with x=2
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, removed.getXValue(), 0.0001);
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(3.0, series.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testRemoveByNumberNotFound() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        // The indexOf method for autoSort=true returns a negative value indicating insertion point.
        // For autoSort=false, it returns -1 if not found.
        // The remove(Number) method calls indexOf and then remove(int).
        // If indexOf returns -1, then remove(-1) is called, which throws IndexOutOfBoundsException.
        // If indexOf returns a negative value other than -1 (e.g., -2 for sorted list where item would be at index 1),
        // then remove is called with that negative value, also throwing IndexOutOfBoundsException.
        try {
            series.remove(new Double(2));
            fail("Expected IndexOutOfBoundsException for remove(Number) when not found.");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
        assertEquals(1, series.getItemCount()); // Ensure no item was removed
    }

    @Test
    public void testClear() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.clear();
        assertEquals(0, series.getItemCount());
        assertTrue(series.getItems().isEmpty());
    }

    @Test
    public void testClearEmpty() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.clear(); // should do nothing
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetDataItem() throws Exception {
        XYSeries series = new XYSeries("Test");
        XYDataItem item1 = new XYDataItem(1, 1);
        XYDataItem item2 = new XYDataItem(2, 2);
        series.add(item1);
        series.add(item2);
        assertEquals(item1, series.getDataItem(0));
        assertEquals(item2, series.getDataItem(1));
    }

    @Test
    public void testGetX() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1.5, 2.5);
        assertEquals(1.5, series.getX(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetY() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1.5, 2.5);
        assertEquals(2.5, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetYWithNull() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1.5, null);
        assertNull(series.getY(0));
    }

    @Test
    public void testUpdateByIndex() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.updateByIndex(1, new Double(5));
        assertEquals(5.0, series.getY(1).doubleValue(), 0.0001);
    }

    @Test
    public void testUpdate() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.update(new Double(1), new Double(5));
        assertEquals(5.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testUpdateNotFound() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        try {
            series.update(new Double(2), new Double(5));
            fail("Expected SeriesException for update on non-existent x.");
        } catch (SeriesException e) {
            // Expected
        }
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdateExisting() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        XYDataItem overwritten = series.addOrUpdate(new Double(1), new Double(5));
        assertEquals(1, series.getItemCount());
        assertEquals(5.0, series.getY(0).doubleValue(), 0.0001);
        assertNotNull(overwritten);
        assertEquals(1.0, overwritten.getXValue(), 0.0001);
        assertEquals(1.0, overwritten.getYValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateNew() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        XYDataItem overwritten = series.addOrUpdate(new Double(2), new Double(5));
        assertEquals(2, series.getItemCount());
        assertEquals(1.0, series.getY(0).doubleValue(), 0.0001);
        assertEquals(5.0, series.getY(1).doubleValue(), 0.0001);
        assertNull(overwritten);
    }

    @Test
    public void testAddOrUpdateNewAutoSortTrue() throws Exception {
        XYSeries series = new XYSeries("Test", true);
        series.add(2, 2);
        XYDataItem overwritten = series.addOrUpdate(new Double(1), new Double(1));
        assertEquals(2, series.getItemCount());
        assertEquals(1.0, series.getY(0).doubleValue(), 0.0001);
        assertEquals(2.0, series.getY(1).doubleValue(), 0.0001);
        assertNull(overwritten);
    }

    @Test
    public void testAddOrUpdateDuplicateXNotAllowed() throws Exception {
        XYSeries series = new XYSeries("Test", true, false);
        series.add(1, 1);
        XYDataItem overwritten = series.addOrUpdate(new Double(1), new Double(5));
        assertEquals(1, series.getItemCount());
        assertEquals(5.0, series.getY(0).doubleValue(), 0.0001);
        assertNotNull(overwritten);
        assertEquals(1.0, overwritten.getXValue(), 0.0001);
        assertEquals(1.0, overwritten.getYValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateWithNullY() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        XYDataItem overwritten = series.addOrUpdate(new Double(1), null);
        assertEquals(1, series.getItemCount());
        assertNull(series.getY(0));
        assertNotNull(overwritten); // Should return the overwritten item
        assertEquals(1.0, overwritten.getXValue(), 0.0001);
        assertEquals(1.0, overwritten.getYValue(), 0.0001);
    }

    @Test
    public void testIndexOfAutoSortTrue() throws Exception {
        XYSeries series = new XYSeries("Test", true);
        series.add(1, 1);
        series.add(3, 3);
        series.add(2, 2);
        assertEquals(0, series.indexOf(new Double(1)));
        assertEquals(1, series.indexOf(new Double(2)));
        assertEquals(2, series.indexOf(new Double(3)));
    }

    @Test
    public void testIndexOfAutoSortFalse() throws Exception {
        XYSeries series = new XYSeries("Test", false);
        series.add(1, 1);
        series.add(3, 3);
        series.add(2, 2);
        assertEquals(0, series.indexOf(new Double(1)));
        assertEquals(2, series.indexOf(new Double(2)));
        assertEquals(1, series.indexOf(new Double(3)));
    }

    @Test
    public void testIndexOfNotFound() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        // The indexOf method returns -1 if the item is not found.
        assertEquals(-1, series.indexOf(new Double(2)));
    }

    @Test
    public void testToArray() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, null);
        series.add(3, 3);
        double[][] array = series.toArray();
        assertEquals(3, array[0].length);
        assertEquals(3, array[1].length);
        assertEquals(1.0, array[0][0], 0.0001);
        assertEquals(1.0, array[1][0], 0.0001);
        assertEquals(2.0, array[0][1], 0.0001);
        assertTrue(Double.isNaN(array[1][1]));
        assertEquals(3.0, array[0][2], 0.0001);
        assertEquals(3.0, array[1][2], 0.0001);
    }

    @Test
    public void testClone() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        XYSeries clone = (XYSeries) series.clone();
        assertNotSame(series, clone);
        assertEquals(series.getKey(), clone.getKey());
        assertEquals(series.getItemCount(), clone.getItemCount());
        assertEquals(series.getAutoSort(), clone.getAutoSort());
        assertEquals(series.getAllowDuplicateXValues(), clone.getAllowDuplicateXValues());
        assertEquals(series.getMaximumItemCount(), clone.getMaximumItemCount());
        assertEquals(series.getDataItem(0), clone.getDataItem(0));
        assertEquals(series.getDataItem(1), clone.getDataItem(1));
        assertNotSame(series.getDataItem(0), clone.getDataItem(0)); // deep clone
    }

    @Test
    public void testCreateCopy() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        XYSeries copy = series.createCopy(1, 2);
        assertEquals("Test", copy.getKey());
        assertEquals(2, copy.getItemCount());
        assertEquals(2.0, copy.getX(0).doubleValue(), 0.0001);
        assertEquals(2.0, copy.getY(0).doubleValue(), 0.0001);
        assertEquals(3.0, copy.getX(1).doubleValue(), 0.0001);
        assertEquals(3.0, copy.getY(1).doubleValue(), 0.0001);
        assertNotSame(series.getDataItem(1), copy.getDataItem(0)); // deep clone
    }

    @Test
    public void testCreateCopyInvalidRange() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        series.add(2, 2);
        XYSeries copy = series.createCopy(0, 0);
        assertEquals(1, copy.getItemCount());
        assertEquals(1.0, copy.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, copy.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testEquals() throws Exception {
        XYSeries series1 = new XYSeries("Test");
        series1.add(1, 1);
        XYSeries series2 = new XYSeries("Test");
        series2.add(1, 1);
        assertTrue(series1.equals(series2));

        XYSeries series3 = new XYSeries("Test2");
        assertFalse(series1.equals(series3));

        XYSeries series4 = new XYSeries("Test");
        series4.add(2, 2);
        assertFalse(series1.equals(series4));

        XYSeries series5 = new XYSeries("Test", false, false);
        assertFalse(series1.equals(series5));
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        XYSeries series = new XYSeries("Test");
        assertTrue(series.equals(series));
    }

    @Test
    public void testEqualsNull() throws Exception {
        XYSeries series = new XYSeries("Test");
        assertFalse(series.equals(null));
    }

    @Test
    public void testHashCode() throws Exception {
        XYSeries series1 = new XYSeries("Test");
        series1.add(1, 1);
        XYSeries series2 = new XYSeries("Test");
        series2.add(1, 1);
        assertEquals(series1.hashCode(), series2.hashCode());

        XYSeries series3 = new XYSeries("Test");
        series3.add(2, 2);
        assertFalse(series1.hashCode() == series3.hashCode());

        XYSeries series4 = new XYSeries("Test", false, false);
        assertFalse(series1.hashCode() == series4.hashCode());
    }

    @Test
    public void testHashCodeWithMultipleItems() throws Exception {
        XYSeries series1 = new XYSeries("Test");
        series1.add(1, 1);
        series1.add(2, 2);
        series1.add(3, 3);

        XYSeries series2 = new XYSeries("Test");
        series2.add(1, 1);
        series2.add(2, 2);
        series2.add(3, 3);
        assertEquals(series1.hashCode(), series2.hashCode());
    }

    @Test
    public void testAddWithMaximumItemCount() throws Exception {
        XYSeries series = new XYSeries("Test", true, true);
        series.setMaximumItemCount(3);
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        assertEquals(3, series.getItemCount());
        series.add(4, 4); // should remove (1,1)
        assertEquals(3, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(3.0, series.getX(1).doubleValue(), 0.0001);
        assertEquals(4.0, series.getX(2).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateWithMaximumItemCount() throws Exception {
        XYSeries series = new XYSeries("Test", true, true);
        series.setMaximumItemCount(3);
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        assertEquals(3, series.getItemCount());
        series.addOrUpdate(4, 4); // should remove (1,1)
        assertEquals(3, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(3.0, series.getX(1).doubleValue(), 0.0001);
        assertEquals(4.0, series.getX(2).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateExistingWithMaximumItemCount() throws Exception {
        XYSeries series = new XYSeries("Test", true, true);
        series.setMaximumItemCount(3);
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        assertEquals(3, series.getItemCount());
        series.addOrUpdate(1, 10); // should update (1,1) to (1,10)
        assertEquals(3, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(10.0, series.getY(0).doubleValue(), 0.0001);
        assertEquals(2.0, series.getX(1).doubleValue(), 0.0001);
        assertEquals(2.0, series.getY(1).doubleValue(), 0.0001);
        assertEquals(3.0, series.getX(2).doubleValue(), 0.0001);
        assertEquals(3.0, series.getY(2).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateExistingWithMaximumItemCountAndRemove() throws Exception {
        XYSeries series = new XYSeries("Test", true, true);
        series.setMaximumItemCount(3);
        series.add(1, 1);
        series.add(2, 2);
        series.add(3, 3);
        assertEquals(3, series.getItemCount());
        series.addOrUpdate(2, 20); // should update (2,2) to (2,20)
        assertEquals(3, series.getItemCount()); // still 3 items
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, series.getY(0).doubleValue(), 0.0001);
        assertEquals(2.0, series.getX(1).doubleValue(), 0.0001);
        assertEquals(20.0, series.getY(1).doubleValue(), 0.0001);
        assertEquals(3.0, series.getX(2).doubleValue(), 0.0001);
        assertEquals(3.0, series.getY(2).doubleValue(), 0.0001);
    }

    @Test
    public void testRemoveInvalidIndex() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        try {
            series.remove(-1);
            fail("Expected IndexOutOfBoundsException for remove with negative index.");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
        try {
            series.remove(1);
            fail("Expected IndexOutOfBoundsException for remove with index out of bounds.");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testDeleteInvalidRange() throws Exception {
        XYSeries series = new XYSeries("Test");
        series.add(1, 1);
        // The delete method throws IllegalArgumentException if start > end.
        // It also throws IndexOutOfBoundsException if start or end are out of bounds.
        try {
            series.delete(1, 0); // start > end
            fail("Expected IllegalArgumentException for delete with start > end.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            series.delete(-1, 0);
            fail("Expected IndexOutOfBoundsException for delete with negative start index.");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
        try {
            series.delete(0, 1);
            fail("Expected IndexOutOfBoundsException for delete with end index out of bounds.");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }
}
