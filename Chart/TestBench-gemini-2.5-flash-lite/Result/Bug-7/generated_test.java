package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.data.general.Series;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesException;
import java.util.Date; // Added for TimePeriodValue creation

public class TimePeriodValuesTest {

    // Helper method to create a dummy TimePeriod
    private TimePeriod createDummyTimePeriod(long startMillis, long endMillis) {
        return new TimePeriod() {
            @Override
            public Date getStart() {
                return new Date(startMillis);
            }

            @Override
            public Date getEnd() {
                return new Date(endMillis);
            }

            @Override
            public int compareTo(Object o) {
                return 0; // Not relevant for these tests
            }

            @Override
            public String toString() {
                return "DummyTimePeriod";
            }
        };
    }

    @Test
    public void testConstructorAndInitialState() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        assertEquals("Test Series", series.getKey());
        assertEquals("Time", series.getDomainDescription());
        assertEquals("Value", series.getRangeDescription());
        assertEquals(0, series.getItemCount());
        assertTrue(series.isEmpty());
        assertEquals(-1, series.getMinStartIndex());
        assertEquals(-1, series.getMaxStartIndex());
        assertEquals(-1, series.getMinMiddleIndex());
        assertEquals(-1, series.getMaxMiddleIndex());
        assertEquals(-1, series.getMinEndIndex());
        assertEquals(-1, series.getMaxEndIndex());
    }

    @Test
    public void testConstructorWithDescriptions() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series", "DomainDesc", "RangeDesc");
        assertEquals("Test Series", series.getKey());
        assertEquals("DomainDesc", series.getDomainDescription());
        assertEquals("RangeDesc", series.getRangeDescription());
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testSetGetDomainDescription() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        series.setDomainDescription("New Domain");
        assertEquals("New Domain", series.getDomainDescription());
    }

    @Test
    public void testSetGetRangeDescription() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        series.setRangeDescription("New Range");
        assertEquals("New Range", series.getRangeDescription());
    }

    @Test
    public void testAddDataItem() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        TimePeriodValue item1 = new TimePeriodValue(period1, 10.5);
        series.add(item1);

        assertEquals(1, series.getItemCount());
        assertEquals(item1, series.getDataItem(0));
        assertEquals(period1, series.getTimePeriod(0));
        assertEquals(10.5, series.getValue(0).doubleValue(), 1e-9);
        assertFalse(series.isEmpty());

        TimePeriod period2 = createDummyTimePeriod(3000, 4000);
        TimePeriodValue item2 = new TimePeriodValue(period2, 20.0);
        series.add(item2);
        assertEquals(2, series.getItemCount());
        assertEquals(item2, series.getDataItem(1));
    }

    @Test
    public void testAddWithDoubleValue() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period = createDummyTimePeriod(5000, 6000);
        series.add(period, 30.0);

        assertEquals(1, series.getItemCount());
        assertEquals(30.0, series.getValue(0).doubleValue(), 1e-9);
    }

    @Test
    public void testAddWithNumberValue() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period = createDummyTimePeriod(7000, 8000);
        series.add(period, Integer.valueOf(42));

        assertEquals(1, series.getItemCount());
        assertEquals(42, series.getValue(0).intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullDataItemThrowsException() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        series.add((TimePeriodValue) null);
    }

    @Test
    public void testUpdateValue() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period = createDummyTimePeriod(9000, 10000);
        series.add(period, 50.0);

        series.update(0, 75.0);
        assertEquals(75.0, series.getValue(0).doubleValue(), 1e-9);
    }

    @Test
    public void testDeleteRange() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        TimePeriodValue item1 = new TimePeriodValue(period1, 10.5);
        series.add(item1);

        TimePeriod period2 = createDummyTimePeriod(3000, 4000);
        TimePeriodValue item2 = new TimePeriodValue(period2, 20.0);
        series.add(item2);

        TimePeriod period3 = createDummyTimePeriod(5000, 6000);
        TimePeriodValue item3 = new TimePeriodValue(period3, 30.0);
        series.add(item3);

        series.delete(0, 1); // Delete first two items

        assertEquals(1, series.getItemCount());
        assertEquals(item3, series.getDataItem(0));
    }

    @Test
    public void testDeleteSingleItem() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        series.add(period1, 10.0);
        TimePeriod period2 = createDummyTimePeriod(3000, 4000);
        series.add(period2, 20.0);

        series.delete(0, 0); // Delete first item
        assertEquals(1, series.getItemCount());
        assertEquals(period2, series.getTimePeriod(0));
    }

    @Test
    public void testDeleteAllItems() throws Exception {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        series.add(period1, 10.0);
        series.delete(0, 0);
        assertEquals(0, series.getItemCount());
        assertTrue(series.isEmpty());
    }

    @Test
    public void testEqualsSelf() {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        assertTrue(series.equals(series));
    }

    @Test
    public void testEqualsDifferentObject() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series");
        Object obj = new Object();
        assertFalse(series1.equals(obj));
    }

    @Test
    public void testEqualsDifferentClass() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series");
        TimeSeries series2 = new TimeSeries("Test Series");
        assertFalse(series1.equals(series2));
    }

    @Test
    public void testEqualsSameContent() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series", "Domain", "Range");
        TimePeriodValues series2 = new TimePeriodValues("Test Series", "Domain", "Range");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        series1.add(period1, 10.0);
        series2.add(period1, 10.0);
        assertTrue(series1.equals(series2));
    }

    @Test
    public void testEqualsDifferentDomain() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series", "Domain1", "Range");
        TimePeriodValues series2 = new TimePeriodValues("Test Series", "Domain2", "Range");
        assertFalse(series1.equals(series2));
    }

    @Test
    public void testEqualsDifferentRange() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series", "Domain", "Range1");
        TimePeriodValues series2 = new TimePeriodValues("Test Series", "Domain", "Range2");
        assertFalse(series1.equals(series2));
    }

    @Test
    public void testEqualsDifferentItemCount() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series");
        TimePeriodValues series2 = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        series1.add(period1, 10.0);
        assertFalse(series1.equals(series2));
    }

    @Test
    public void testEqualsDifferentDataItem() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series");
        TimePeriodValues series2 = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        series1.add(period1, 10.0);
        TimePeriod period2 = createDummyTimePeriod(3000, 4000);
        series2.add(period2, 10.0);
        assertFalse(series1.equals(series2));
    }

    @Test
    public void testHashCode() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series", "Domain", "Range");
        TimePeriodValues series2 = new TimePeriodValues("Test Series", "Domain", "Range");
        assertEquals(series1.hashCode(), series2.hashCode());
    }

    @Test
    public void testHashCodeDifferent() {
        TimePeriodValues series1 = new TimePeriodValues("Test Series", "Domain", "Range");
        TimePeriodValues series2 = new TimePeriodValues("Test Series", "Other Domain", "Range");
        assertNotEquals(series1.hashCode(), series2.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period = createDummyTimePeriod(1000, 2000);
        series.add(period, 10.0);

        TimePeriodValues clonedSeries = (TimePeriodValues) series.clone();

        assertNotSame(series, clonedSeries);
        assertEquals(series.getKey(), clonedSeries.getKey());
        assertEquals(series.getDomainDescription(), clonedSeries.getDomainDescription());
        assertEquals(series.getRangeDescription(), clonedSeries.getRangeDescription());
        assertEquals(series.getItemCount(), clonedSeries.getItemCount());
        assertEquals(series.getDataItem(0), clonedSeries.getDataItem(0));
        assertNotSame(series.getDataItem(0), clonedSeries.getDataItem(0)); // Ensure deep copy of data items
    }

    @Test
    public void testCreateCopyRange() throws CloneNotSupportedException {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        series.add(period1, 10.0);
        TimePeriod period2 = createDummyTimePeriod(3000, 4000);
        series.add(period2, 20.0);
        TimePeriod period3 = createDummyTimePeriod(5000, 6000);
        series.add(period3, 30.0);

        // The original test was failing because it expected to copy items from index 1 to 2,
        // but there were only 3 items (0, 1, 2). The createCopy method's loop condition
        // is inclusive for `end`. So, to copy items at index 1 and 2, the call should be createCopy(1, 2).
        // The code in createCopy adds the cloned item using `copy.add(clone)`.
        // After adding items, the bounds (minStartIndex, etc.) are updated.
        // The issue was that the reference source code's `createCopy` method did not re-calculate bounds.
        // However, the test logic for `createCopyRange` was correct.
        // The failure was due to the fact that `series.add(period3, 30.0)` was called AFTER `series.add(period2, 20.0)`,
        // thus `period3` became the last item. The indices were:
        // 0: period1
        // 1: period2
        // 2: period3
        // So `createCopy(1, 2)` should correctly copy items at index 1 and 2.
        // The test's expected values were:
        // assertEquals(2, copy.getItemCount()); // Correct
        // assertEquals(period2, copy.getTimePeriod(0)); // This is wrong. It should be period3 if it's index 0 in the copy.
        // Let's re-evaluate the expected values.
        // The `createCopy` method adds items from `start` to `end` inclusive.
        // So `createCopy(1, 2)` should result in `copy` having items at indices 0 and 1,
        // corresponding to original indices 1 and 2.
        // Original: period1 (idx 0), period2 (idx 1), period3 (idx 2)
        // Copy (from createCopy(1, 2)):
        //   - item from original index 1 (period2) becomes index 0 in copy.
        //   - item from original index 2 (period3) becomes index 1 in copy.
        TimePeriodValues copy = series.createCopy(1, 2);

        assertEquals(2, copy.getItemCount()); // Correct
        assertEquals(period2, copy.getTimePeriod(0)); // Correct, this is original index 1
        assertEquals(20.0, copy.getValue(0).doubleValue(), 1e-9); // Correct
        assertEquals(period3, copy.getTimePeriod(1)); // Correct, this is original index 2
        assertEquals(30.0, copy.getValue(1).doubleValue(), 1e-9); // Correct
    }

    @Test
    public void testCreateCopySingleItem() throws CloneNotSupportedException {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        series.add(period1, 10.0);
        TimePeriod period2 = createDummyTimePeriod(3000, 4000);
        series.add(period2, 20.0);

        // The original test failed because `series.delete(0, 0)` was called right before,
        // which should not have happened for this test. Also, the `createCopy(1, 1)`
        // call correctly creates a copy of the item at index 1.
        TimePeriodValues copy = series.createCopy(1, 1);

        assertEquals(1, copy.getItemCount());
        assertEquals(period2, copy.getTimePeriod(0));
        assertEquals(20.0, copy.getValue(0).doubleValue(), 1e-9);
    }

    @Test
    public void testCreateCopyEmptySeries() throws CloneNotSupportedException {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        // createCopy(0, -1) correctly creates an empty range.
        TimePeriodValues copy = series.createCopy(0, -1); // Empty range
        assertEquals(0, copy.getItemCount());
        assertTrue(copy.isEmpty());
    }

    @Test
    public void testCreateCopyAllItems() throws CloneNotSupportedException {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod period1 = createDummyTimePeriod(1000, 2000);
        series.add(period1, 10.0);
        TimePeriod period2 = createDummyTimePeriod(3000, 4000);
        series.add(period2, 20.0);

        // The original test failed. The issue was in the expected values.
        // `createCopy(0, 1)` should copy items at index 0 and 1.
        // The result `copy` should have `period1` at index 0 and `period2` at index 1.
        TimePeriodValues copy = series.createCopy(0, 1);

        assertEquals(2, copy.getItemCount());
        assertEquals(period1, copy.getTimePeriod(0)); // Correct
        assertEquals(period2, copy.getTimePeriod(1)); // Correct
    }

    @Test
    public void testMinStartIndex() {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod p1 = createDummyTimePeriod(2000, 3000); // start 2000
        series.add(p1, 10.0);
        TimePeriod p2 = createDummyTimePeriod(1000, 2500); // start 1000
        series.add(p2, 20.0);
        TimePeriod p3 = createDummyTimePeriod(3000, 4000); // start 3000
        series.add(p3, 30.0);
        assertEquals(1, series.getMinStartIndex());
    }

    @Test
    public void testMaxStartIndex() {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod p1 = createDummyTimePeriod(2000, 3000); // start 2000
        series.add(p1, 10.0);
        TimePeriod p2 = createDummyTimePeriod(1000, 2500); // start 1000
        series.add(p2, 20.0);
        TimePeriod p3 = createDummyTimePeriod(3000, 4000); // start 3000
        series.add(p3, 30.0);
        assertEquals(2, series.getMaxStartIndex());
    }

    @Test
    public void testMinMiddleIndex() {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        // p1: start 1000, end 3000, middle 2000
        TimePeriod p1 = createDummyTimePeriod(1000, 3000);
        series.add(p1, 10.0);
        // p2: start 1500, end 2500, middle 2000
        TimePeriod p2 = createDummyTimePeriod(1500, 2500);
        series.add(p2, 20.0);
        // p3: start 500, end 1500, middle 1000
        TimePeriod p3 = createDummyTimePeriod(500, 1500);
        series.add(p3, 30.0);
        assertEquals(2, series.getMinMiddleIndex());
    }

    @Test
    public void testMaxMiddleIndex() {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        // p1: start 1000, end 3000, middle 2000
        TimePeriod p1 = createDummyTimePeriod(1000, 3000);
        series.add(p1, 10.0);
        // p2: start 1500, end 2500, middle 2000
        TimePeriod p2 = createDummyTimePeriod(1500, 2500);
        series.add(p2, 20.0);
        // p3: start 2500, end 3500, middle 3000
        TimePeriod p3 = createDummyTimePeriod(2500, 3500);
        series.add(p3, 30.0);
        assertEquals(2, series.getMaxMiddleIndex());
    }

    @Test
    public void testMinEndIndex() {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod p1 = createDummyTimePeriod(1000, 3000); // end 3000
        series.add(p1, 10.0);
        TimePeriod p2 = createDummyTimePeriod(2000, 4000); // end 4000
        series.add(p2, 20.0);
        TimePeriod p3 = createDummyTimePeriod(3000, 2500); // end 2500
        series.add(p3, 30.0);
        assertEquals(2, series.getMinEndIndex());
    }

    @Test
    public void testMaxEndIndex() {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod p1 = createDummyTimePeriod(1000, 3000); // end 3000
        series.add(p1, 10.0);
        TimePeriod p2 = createDummyTimePeriod(2000, 4000); // end 4000
        series.add(p2, 20.0);
        TimePeriod p3 = createDummyTimePeriod(3000, 3500); // end 3500
        series.add(p3, 30.0);
        assertEquals(1, series.getMaxEndIndex());
    }

    @Test
    public void testBoundsUpdateAfterDelete() {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        TimePeriod p1 = createDummyTimePeriod(1000, 2000); // minStart, minEnd, minMiddle
        series.add(p1, 10.0);
        TimePeriod p2 = createDummyTimePeriod(3000, 4000); // maxStart, maxEnd, maxMiddle
        series.add(p2, 20.0);
        
        // After adding two items, the bounds are correctly set.
        // p1 (index 0) is min for start, end, middle.
        // p2 (index 1) is max for start, end, middle.
        assertEquals(0, series.getMinStartIndex());
        assertEquals(1, series.getMaxStartIndex());
        assertEquals(0, series.getMinMiddleIndex()); // middle of p1 is 1500
        assertEquals(1, series.getMaxMiddleIndex()); // middle of p2 is 3500
        assertEquals(0, series.getMinEndIndex());
        assertEquals(1, series.getMaxEndIndex());

        series.delete(0, 0); // Delete the first item (p1)

        // After deletion, the recalculateBounds() method is called.
        // The remaining item is p2 (at index 0 now).
        // So p2 should become the new min and max for all bounds.
        assertEquals(1, series.getItemCount()); // Should have one item left
        assertEquals(0, series.getMinStartIndex()); // The remaining item is at index 0
        assertEquals(0, series.getMaxStartIndex());
        assertEquals(0, series.getMinMiddleIndex());
        assertEquals(0, series.getMaxMiddleIndex());
        assertEquals(0, series.getMinEndIndex());
        assertEquals(0, series.getMaxEndIndex());
    }
}
