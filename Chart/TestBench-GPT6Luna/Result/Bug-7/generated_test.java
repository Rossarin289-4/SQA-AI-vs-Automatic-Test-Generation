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

public class TimePeriodValuesTest {
    @Test
    public void testDefaultDescriptionsAndEmptyCount() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        assertEquals("Time", values.getDomainDescription());
        assertEquals("Value", values.getRangeDescription());
        assertEquals(0, values.getItemCount());
    }

    @Test
    public void testCustomAndNullableDescriptions() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series", "Date", "Amount");
        assertEquals("Date", values.getDomainDescription());
        assertEquals("Amount", values.getRangeDescription());
        values.setDomainDescription(null);
        values.setRangeDescription(null);
        assertNull(values.getDomainDescription());
        assertNull(values.getRangeDescription());
    }

    @Test
    public void testDescriptionSettersReplaceValues() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series", "oldD", "oldR");
        values.setDomainDescription("newD");
        values.setRangeDescription("newR");
        assertEquals("newD", values.getDomainDescription());
        assertEquals("newR", values.getRangeDescription());
    }

    @Test
    public void testAddAndReadSingleItem() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        SimpleTimePeriod period = new SimpleTimePeriod(3L, 8L);
        values.add(period, 12.5);
        assertEquals(1, values.getItemCount());
        assertEquals(period, values.getTimePeriod(0));
        assertEquals(Double.valueOf(12.5), values.getValue(0));
        assertEquals(period, values.getDataItem(0).getPeriod());
    }

    @Test
    public void testAddPreservesInsertionOrderAndNullValue() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        SimpleTimePeriod first = new SimpleTimePeriod(8L, 10L);
        SimpleTimePeriod second = new SimpleTimePeriod(1L, 4L);
        values.add(first, (Number) null);
        values.add(second, Integer.valueOf(7));
        assertEquals(2, values.getItemCount());
        assertEquals(first, values.getTimePeriod(0));
        assertNull(values.getValue(0));
        assertEquals(second, values.getTimePeriod(1));
        assertEquals(Integer.valueOf(7), values.getValue(1));
    }

    @Test
    public void testAddNullItemThrows() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        try {
            values.add((TimePeriodValue) null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals(0, values.getItemCount());
    }

    @Test
    public void testUpdateValueAtFirstAndLastIndexes() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        values.add(new SimpleTimePeriod(0L, 1L), 1.0);
        values.add(new SimpleTimePeriod(2L, 3L), 2.0);
        values.update(0, Integer.valueOf(9));
        values.update(1, null);
        assertEquals(Integer.valueOf(9), values.getValue(0));
        assertNull(values.getValue(1));
        assertEquals(2, values.getItemCount());
    }

    @Test
    public void testDeleteFirstAndLastItemRecalculatesBounds() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        values.add(new SimpleTimePeriod(1L, 2L), 1.0);
        values.add(new SimpleTimePeriod(10L, 12L), 2.0);
        values.add(new SimpleTimePeriod(20L, 24L), 3.0);
        values.delete(0, 0);
        assertEquals(2, values.getItemCount());
        assertEquals(new SimpleTimePeriod(10L, 12L), values.getTimePeriod(0));
        assertEquals(0, values.getMinStartIndex());
        assertEquals(1, values.getMaxStartIndex());
        values.delete(1, 1);
        assertEquals(1, values.getItemCount());
        assertEquals(0, values.getMinEndIndex());
        assertEquals(0, values.getMaxEndIndex());
    }

    @Test
    public void testDeleteInclusiveRange() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        values.add(new SimpleTimePeriod(0L, 1L), 0.0);
        values.add(new SimpleTimePeriod(2L, 3L), 1.0);
        values.add(new SimpleTimePeriod(4L, 5L), 2.0);
        values.add(new SimpleTimePeriod(6L, 7L), 3.0);
        values.delete(1, 2);
        assertEquals(2, values.getItemCount());
        assertEquals(new SimpleTimePeriod(0L, 1L), values.getTimePeriod(0));
        assertEquals(new SimpleTimePeriod(6L, 7L), values.getTimePeriod(1));
    }

    @Test
    public void testBoundsAcrossDistinctStartsMiddlesAndEnds() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        values.add(new SimpleTimePeriod(10L, 30L), 1.0);
        values.add(new SimpleTimePeriod(0L, 40L), 2.0);
        values.add(new SimpleTimePeriod(20L, 25L), 3.0);
        assertEquals(1, values.getMinStartIndex());
        assertEquals(2, values.getMaxStartIndex());
        assertEquals(0, values.getMinMiddleIndex());
        assertEquals(1, values.getMaxMiddleIndex());
        assertEquals(2, values.getMinEndIndex());
        assertEquals(1, values.getMaxEndIndex());
    }

    @Test
    public void testBoundsOnEqualPeriodTimesKeepEarliestIndex() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        values.add(new SimpleTimePeriod(4L, 8L), 1.0);
        values.add(new SimpleTimePeriod(4L, 8L), 2.0);
        assertEquals(0, values.getMinStartIndex());
        assertEquals(0, values.getMaxStartIndex());
        assertEquals(0, values.getMinMiddleIndex());
        assertEquals(0, values.getMaxMiddleIndex());
        assertEquals(0, values.getMinEndIndex());
        assertEquals(0, values.getMaxEndIndex());
    }

    @Test
    public void testBoundsInitiallyAndAfterDeletingAllItems() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series");
        assertEquals(-1, values.getMinStartIndex());
        assertEquals(-1, values.getMaxStartIndex());
        assertEquals(-1, values.getMinMiddleIndex());
        assertEquals(-1, values.getMaxMiddleIndex());
        assertEquals(-1, values.getMinEndIndex());
        assertEquals(-1, values.getMaxEndIndex());
        values.add(new SimpleTimePeriod(0L, 2L), 1.0);
        values.delete(0, 0);
        assertEquals(-1, values.getMinStartIndex());
        assertEquals(-1, values.getMaxEndIndex());
        assertEquals(0, values.getItemCount());
    }

    @Test
    public void testEqualsForMatchingSeriesAndDifferentData() throws Exception {
        TimePeriodValues first = new TimePeriodValues("series", "D", "R");
        TimePeriodValues same = new TimePeriodValues("series", "D", "R");
        TimePeriodValues different = new TimePeriodValues("series", "D", "R");
        first.add(new SimpleTimePeriod(2L, 5L), 3.0);
        same.add(new SimpleTimePeriod(2L, 5L), 3.0);
        different.add(new SimpleTimePeriod(2L, 5L), 4.0);
        assertTrue(first.equals(same));
        assertFalse(first.equals(different));
        assertTrue(first.equals(first));
        assertFalse(first.equals(null));
        assertFalse(first.equals("other"));
    }

    @Test
    public void testEqualsIncludesDescriptionsAndItemOrder() throws Exception {
        TimePeriodValues first = new TimePeriodValues("series", "D", "R");
        TimePeriodValues descriptionDiff = new TimePeriodValues("series", "X", "R");
        TimePeriodValues orderDiff = new TimePeriodValues("series", "D", "R");
        first.add(new SimpleTimePeriod(0L, 1L), 1.0);
        first.add(new SimpleTimePeriod(2L, 3L), 2.0);
        descriptionDiff.add(new SimpleTimePeriod(0L, 1L), 1.0);
        descriptionDiff.add(new SimpleTimePeriod(2L, 3L), 2.0);
        orderDiff.add(new SimpleTimePeriod(2L, 3L), 2.0);
        orderDiff.add(new SimpleTimePeriod(0L, 1L), 1.0);
        assertFalse(first.equals(descriptionDiff));
        assertFalse(first.equals(orderDiff));
    }

    @Test
    public void testHashCodeStableForUnchangedSeries() throws Exception {
        TimePeriodValues values = new TimePeriodValues("series", "D", "R");
        values.add(new SimpleTimePeriod(1L, 4L), 7.0);
        int original = values.hashCode();
        assertEquals(original, values.hashCode());
        values.setDomainDescription("other");
        assertFalse(original == values.hashCode());
    }

    @Test
    public void testCloneCopiesItemsIndependently() throws Exception {
        TimePeriodValues original = new TimePeriodValues("series", "D", "R");
        original.add(new SimpleTimePeriod(3L, 9L), 5.0);
        TimePeriodValues copy = (TimePeriodValues) original.clone();
        assertTrue(original.equals(copy));
        copy.update(0, 8.0);
        assertEquals(Double.valueOf(5.0), original.getValue(0));
        assertEquals(Double.valueOf(8.0), copy.getValue(0));
    }

    @Test
    public void testCreateCopyCopiesRequestedInclusiveIndexes() throws Exception {
        TimePeriodValues original = new TimePeriodValues("series", "D", "R");
        original.add(new SimpleTimePeriod(0L, 1L), 10.0);
        original.add(new SimpleTimePeriod(2L, 3L), 20.0);
        original.add(new SimpleTimePeriod(4L, 5L), 30.0);
        TimePeriodValues copy = original.createCopy(1, 1);
        assertEquals(1, copy.getItemCount());
        assertEquals(new SimpleTimePeriod(2L, 3L), copy.getTimePeriod(0));
        assertEquals(Double.valueOf(20.0), copy.getValue(0));
    }

    @Test
    public void testCreateCopyCanCopyFirstItemOnly() throws Exception {
        TimePeriodValues original = new TimePeriodValues("series");
        original.add(new SimpleTimePeriod(6L, 9L), 11.0);
        original.add(new SimpleTimePeriod(10L, 13L), 12.0);
        TimePeriodValues copy = original.createCopy(0, 0);
        assertEquals(1, copy.getItemCount());
        assertEquals(new SimpleTimePeriod(6L, 9L), copy.getTimePeriod(0));
        assertEquals(0, copy.getMinStartIndex());
        assertEquals(0, copy.getMaxEndIndex());
    }

    private static class SimpleTimePeriod implements TimePeriod, Serializable {
        private static final long serialVersionUID = 1L;
        private final java.util.Date start;
        private final java.util.Date end;

        SimpleTimePeriod(long start, long end) {
            this.start = new java.util.Date(start);
            this.end = new java.util.Date(end);
        }

        public java.util.Date getStart() {
            return this.start;
        }

        public java.util.Date getEnd() {
            return this.end;
        }

        public int compareTo(Object other) {
            SimpleTimePeriod that = (SimpleTimePeriod) other;
            int result = this.start.compareTo(that.start);
            return result != 0 ? result : this.end.compareTo(that.end);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SimpleTimePeriod)) {
                return false;
            }
            SimpleTimePeriod that = (SimpleTimePeriod) obj;
            return this.start.equals(that.start) && this.end.equals(that.end);
        }

        public int hashCode() {
            return 31 * this.start.hashCode() + this.end.hashCode();
        }
    }
}
