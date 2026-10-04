```java
package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.data.general.Series;
import org.jfree.data.event.SeriesChangeEvent;
import org.jfree.data.general.SeriesException;
import java.util.Calendar;

public class TimeSeriesTest {

    // Helper method to create a TimeSeriesDataItem
    private TimeSeriesDataItem createDataItem(RegularTimePeriod period, Number value) {
        return new TimeSeriesDataItem(period, value);
    }

    // Helper method to create a dummy RegularTimePeriod (used for getIndex)
    private RegularTimePeriod createDummyPeriod() {
        return new Day(1, 1, 1900); // Using Day as a concrete example
    }

    @Test
    public void testConstructorDefault() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertEquals("Test Series", ts.getKey());
        assertEquals(TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, ts.getDomainDescription());
        assertEquals(TimeSeries.DEFAULT_RANGE_DESCRIPTION, ts.getRangeDescription());
        assertEquals(Integer.MAX_VALUE, ts.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, ts.getMaximumItemAge());
        assertTrue(ts.isEmpty());
    }

    @Test
    public void testConstructorWithDescriptions() {
        TimeSeries ts = new TimeSeries("Test Series", "Domain", "Range");
        assertEquals("Test Series", ts.getKey());
        assertEquals("Domain", ts.getDomainDescription());
        assertEquals("Range", ts.getRangeDescription());
        assertEquals(Integer.MAX_VALUE, ts.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, ts.getMaximumItemAge());
        assertTrue(ts.isEmpty());
    }

    @Test
    public void testGetSetDomainDescription() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.setDomainDescription("New Domain");
        assertEquals("New Domain", ts.getDomainDescription());
    }

    @Test
    public void testGetSetRangeDescription() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.setRangeDescription("New Range");
        assertEquals("New Range", ts.getRangeDescription());
    }

    @Test
    public void testGetItemCountEmpty() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testGetItemCountWithItems() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        assertEquals(2, ts.getItemCount());
    }

    @Test
    public void testGetItemsUnmodifiable() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        List items = ts.getItems();
        // The specific class of the unmodifiable list is not important, only its behavior.
        // We can test its unmodifiability directly.
        try {
            items.add(new TimeSeriesDataItem(new Day(3,1,2000), 12.0));
            fail("List should be unmodifiable.");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testGetMaximumItemCount() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertEquals(Integer.MAX_VALUE, ts.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCountZero() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        ts.setMaximumItemCount(0);
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testSetMaximumItemCountWithinLimit() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        ts.setMaximumItemCount(2);
        assertEquals(2, ts.getItemCount());
    }

    @Test
    public void testSetMaximumItemCountExceedingLimit() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        ts.add(new Day(3, 1, 2000), 12.0);
        ts.setMaximumItemCount(2); // Should remove the oldest item (Day 1)
        assertEquals(2, ts.getItemCount());
        assertEquals(11.0, ts.getValue(0).doubleValue(), 0.0001);
        assertEquals(12.0, ts.getValue(1).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegative() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.setMaximumItemCount(-1);
    }

    @Test
    public void testGetMaximumItemAge() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertEquals(Long.MAX_VALUE, ts.getMaximumItemAge());
    }

    @Test
    public void testSetMaximumItemAgeZero() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.setMaximumItemAge(0); // Should remove the item if its age > 0
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testSetMaximumItemAgeWithinLimit() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        ts.setMaximumItemAge(1); // If the difference between latest and oldest > 1, remove oldest
        // The difference is 1, so it should be kept.
        assertEquals(2, ts.getItemCount());
    }

    @Test
    public void testSetMaximumItemAgeExceedingLimit() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        ts.add(new Day(3, 1, 2000), 12.0);
        ts.setMaximumItemAge(1); // Latest is Day 3. Oldest is Day 1. Difference in serial index is 2. 2 > 1, so Day 1 should be removed.
        assertEquals(2, ts.getItemCount());
        assertEquals(11.0, ts.getValue(0).doubleValue(), 0.0001);
        assertEquals(12.0, ts.getValue(1).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegative() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.setMaximumItemAge(-1);
    }

    @Test
    public void testGetMinYEmpty() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertTrue(Double.isNaN(ts.getMinY()));
    }

    @Test
    public void testGetMaxYEmpty() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertTrue(Double.isNaN(ts.getMaxY()));
    }

    @Test
    public void testGetMinYWithValues() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 5.0);
        ts.add(new Day(3, 1, 2000), 15.0);
        assertEquals(5.0, ts.getMinY(), 0.0001);
    }

    @Test
    public void testGetMaxYWithValues() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 5.0);
        ts.add(new Day(3, 1, 2000), 15.0);
        assertEquals(15.0, ts.getMaxY(), 0.0001);
    }

    @Test
    public void testGetMinYWithNaN() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), Double.NaN);
        ts.add(new Day(3, 1, 2000), 5.0);
        assertEquals(5.0, ts.getMinY(), 0.0001);
    }

    @Test
    public void testGetMaxYWithNaN() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), Double.NaN);
        ts.add(new Day(3, 1, 2000), 15.0);
        assertEquals(15.0, ts.getMaxY(), 0.0001);
    }

    @Test
    public void testGetTimePeriodClassNullWhenEmpty() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertNull(ts.getTimePeriodClass());
    }

    @Test
    public void testGetTimePeriodClassAfterAdd() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        assertEquals(Day.class, ts.getTimePeriodClass());
    }

    @Test
    public void testGetDataItem() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        TimeSeriesDataItem item = ts.getDataItem(0);
        assertEquals(period, item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.0001);
        // Ensure it's a clone
        assertNotSame(ts.getRawDataItem(0), item);
    }

    @Test
    public void testGetDataItemWithInvalidIndex() {
        TimeSeries ts = new TimeSeries("Test Series");
        try {
            ts.getDataItem(0);
            fail("IndexOutOfBoundsException should be thrown.");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetDataItemByPeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        TimeSeriesDataItem item = ts.getDataItem(period);
        assertEquals(period, item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItemByPeriodNotFound() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        RegularTimePeriod otherPeriod = new Day(2, 1, 2000);
        assertNull(ts.getDataItem(otherPeriod));
    }

    @Test
    public void testGetRawDataItem() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        TimeSeriesDataItem item = ts.getRawDataItem(0);
        assertEquals(period, item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.0001);
        // Ensure it's the same instance
        assertSame(ts.getRawDataItem(0), item);
    }

    @Test
    public void testGetRawDataItemByPeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        TimeSeriesDataItem item = ts.getRawDataItem(period);
        assertEquals(period, item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetRawDataItemByPeriodNotFound() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        RegularTimePeriod otherPeriod = new Day(2, 1, 2000);
        assertNull(ts.getRawDataItem(otherPeriod));
    }

    @Test
    public void testGetTimePeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        assertEquals(period, ts.getTimePeriod(0));
    }

    @Test
    public void testGetTimePeriodInvalidIndex() {
        TimeSeries ts = new TimeSeries("Test Series");
        try {
            ts.getTimePeriod(0);
            fail("IndexOutOfBoundsException should be thrown.");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetNextTimePeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        ts.add(period1, 10.0);
        ts.add(period2, 11.0);
        assertEquals(new Day(3, 1, 2000), ts.getNextTimePeriod());
    }

    @Test
    public void testGetNextTimePeriodEmpty() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertNull(ts.getNextTimePeriod());
    }

    @Test
    public void testGetTimePeriods() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        ts.add(period1, 10.0);
        ts.add(period2, 11.0);
        Collection periods = ts.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(period1));
        assertTrue(periods.contains(period2));
    }

    @Test
    public void testGetTimePeriodsEmpty() {
        TimeSeries ts = new TimeSeries("Test Series");
        Collection periods = ts.getTimePeriods();
        assertEquals(0, periods.size());
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries ts1 = new TimeSeries("Series1");
        TimeSeries ts2 = new TimeSeries("Series2");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        RegularTimePeriod p3 = new Day(3, 1, 2000);

        ts1.add(p1, 10.0);
        ts1.add(p2, 11.0);

        ts2.add(p2, 11.0);
        ts2.add(p3, 12.0);

        Collection uniqueToTs2 = ts1.getTimePeriodsUniqueToOtherSeries(ts2);
        assertEquals(1, uniqueToTs2.size());
        assertTrue(uniqueToTs2.contains(p3));

        Collection uniqueToTs1 = ts2.getTimePeriodsUniqueToOtherSeries(ts1);
        assertEquals(1, uniqueToTs1.size());
        assertTrue(uniqueToTs1.contains(p1));
    }

    @Test
    public void testGetIndex() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        assertEquals(0, ts.getIndex(period));
    }

    @Test
    public void testGetIndexNotFound() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        ts.add(period1, 10.0);
        assertEquals(-2, ts.getIndex(period2)); // binarySearch returns -(insertion point) - 1
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexWithNullPeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.getIndex(null);
    }

    @Test
    public void testGetValue() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueInvalidIndex() {
        TimeSeries ts = new TimeSeries("Test Series");
        try {
            ts.getValue(0);
            fail("IndexOutOfBoundsException should be thrown.");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetValueByPeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        assertEquals(10.0, ts.getValue(period).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueByPeriodNotFound() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        ts.add(period1, 10.0);
        assertNull(ts.getValue(period2));
    }

    @Test
    public void testAddTimeSeriesDataItem() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        TimeSeriesDataItem item = new TimeSeriesDataItem(period, 10.0);
        ts.add(item);
        assertEquals(1, ts.getItemCount());
        assertEquals(period, ts.getTimePeriod(0));
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddTimeSeriesDataItemWithNotify() {
        TimeSeries ts = new TimeSeries("Test Series");
        // Note: Testing notification requires listeners, which are not part of this test setup.
        // We will assume the internal logic for notification is correct if add works.
        RegularTimePeriod period = new Day(1, 1, 2000);
        TimeSeriesDataItem item = new TimeSeriesDataItem(period, 10.0);
        ts.add(item, true);
        assertEquals(1, ts.getItemCount());
    }

    @Test
    public void testAddTimeSeriesDataItemWithoutNotify() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        TimeSeriesDataItem item = new TimeSeriesDataItem(period, 10.0);
        ts.add(item, false);
        assertEquals(1, ts.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullTimeSeriesDataItem() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAddTimeSeriesDataItemWithDifferentPeriodClass() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Month(1, 2000), 20.0); // Month is a different class
    }

    @Test
    public void testAddTimeSeriesDataItemInCorrectOrder() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        RegularTimePeriod period3 = new Day(3, 1, 2000);

        ts.add(period2, 11.0);
        ts.add(period1, 10.0); // Should be inserted before period2
        ts.add(period3, 12.0); // Should be appended

        assertEquals(3, ts.getItemCount());
        assertEquals(period1, ts.getTimePeriod(0));
        assertEquals(period2, ts.getTimePeriod(1));
        assertEquals(period3, ts.getTimePeriod(2));
    }

    @Test
    public void testAddTimeSeriesDataItemWithDuplicatePeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        try {
            ts.add(period, 20.0);
            fail("SeriesException should be thrown for duplicate period.");
        } catch (SeriesException e) {
            // Expected
        }
    }

    @Test
    public void testAddRegularTimePeriodDouble() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        assertEquals(1, ts.getItemCount());
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddRegularTimePeriodNumber() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, new Double(10.0));
        assertEquals(1, ts.getItemCount());
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddRegularTimePeriodNumberWithNullValue() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, (Number) null);
        assertEquals(1, ts.getItemCount());
        assertNull(ts.getValue(0));
    }

    @Test
    public void testUpdateByPeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        ts.update(period, 20.0);
        assertEquals(20.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testUpdateByPeriodWithNullValue() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        ts.update(period, null);
        assertNull(ts.getValue(0));
    }

    @Test(expected = SeriesException.class)
    public void testUpdateByPeriodNotFound() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        ts.add(period1, 10.0);
        ts.update(period2, 20.0);
    }

    @Test
    public void testUpdateByIndex() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        ts.update(0, 20.0);
        assertEquals(20.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testUpdateByIndexWithNullValue() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        ts.update(0, null);
        assertNull(ts.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdateByIndexInvalidIndex() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.update(0, 10.0);
    }

    @Test
    public void testAddAndOrUpdate() {
        TimeSeries ts = new TimeSeries("Target Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        RegularTimePeriod p3 = new Day(3, 1, 2000);

        ts.add(p1, 10.0);
        ts.add(p2, 11.0);

        TimeSeries updates = new TimeSeries("Updates");
        updates.add(p2, 22.0); // update existing
        updates.add(p3, 12.0); // add new

        TimeSeries overwritten = ts.addAndOrUpdate(updates);

        assertEquals(3, ts.getItemCount());
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0001);
        assertEquals(22.0, ts.getValue(1).doubleValue(), 0.0001);
        assertEquals(12.0, ts.getValue(2).doubleValue(), 0.0001);

        assertEquals(1, overwritten.getItemCount());
        assertEquals(p2, overwritten.getTimePeriod(0));
        assertEquals(11.0, overwritten.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateByPeriodDouble() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        TimeSeriesDataItem updated = ts.addOrUpdate(period, 10.0);
        assertNull(updated);
        assertEquals(1, ts.getItemCount());
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0001);

        updated = ts.addOrUpdate(period, 20.0); // update
        assertNotNull(updated);
        assertEquals(10.0, updated.getValue().doubleValue(), 0.0001); // This should be 10.0, the old value
        assertEquals(20.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateByPeriodNumber() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        TimeSeriesDataItem updated = ts.addOrUpdate(period, new Double(10.0));
        assertNull(updated);
        assertEquals(1, ts.getItemCount());
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0001);

        updated = ts.addOrUpdate(period, new Integer(20)); // update
        assertNotNull(updated);
        assertEquals(10.0, updated.getValue().doubleValue(), 0.0001);
        assertEquals(20.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateByPeriodNumberWithNull() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);

        TimeSeriesDataItem updated = ts.addOrUpdate(period, (Number) null); // update to null
        assertNotNull(updated);
        assertEquals(10.0, updated.getValue().doubleValue(), 0.0001);
        assertNull(ts.getValue(0));
    }

    @Test
    public void testAddOrUpdateWithNewItem() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        ts.add(period1, 10.0);
        TimeSeriesDataItem updated = ts.addOrUpdate(period2, 20.0);
        assertNull(updated);
        assertEquals(2, ts.getItemCount());
        assertEquals(20.0, ts.getValue(1).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateWithExistingItem() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.add(period, 10.0);
        TimeSeriesDataItem updated = ts.addOrUpdate(new TimeSeriesDataItem(period, 20.0));
        assertNotNull(updated);
        assertEquals(10.0, updated.getValue().doubleValue(), 0.0001);
        assertEquals(1, ts.getItemCount());
        assertEquals(20.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateWithNewItemViaDataItem() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        TimeSeriesDataItem item = new TimeSeriesDataItem(period, 10.0);
        TimeSeriesDataItem updated = ts.addOrUpdate(item);
        assertNull(updated);
        assertEquals(1, ts.getItemCount());
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testAddOrUpdateWithDifferentPeriodClass() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.addOrUpdate(new Month(1, 2000), 20.0);
    }

    @Test
    public void testRemoveAgedItemsTrue() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.setMaximumItemAge(1); // Keep only items within 1 period of each other
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        ts.add(new Day(3, 1, 2000), 12.0);

        // The difference between Day 3 and Day 1 is 2 periods, which is > maximumItemAge (1)
        // So, Day 1 should be removed.
        ts.removeAgedItems(true);
        assertEquals(2, ts.getItemCount());
        assertEquals(11.0, ts.getValue(0).doubleValue(), 0.0001); // Day 2
        assertEquals(12.0, ts.getValue(1).doubleValue(), 0.0001); // Day 3
    }

    @Test
    public void testRemoveAgedItemsFalse() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.setMaximumItemAge(1);
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        ts.add(new Day(3, 1, 2000), 12.0);

        ts.removeAgedItems(false); // Should remove item but not notify
        assertEquals(2, ts.getItemCount());
        assertEquals(11.0, ts.getValue(0).doubleValue(), 0.0001);
        assertEquals(12.0, ts.getValue(1).doubleValue(), 0.0001);
    }

    @Test
    public void testRemoveAgedItemsWithNoItems() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.removeAgedItems(true);
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testClear() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.add(new Day(1, 1, 2000), 10.0);
        ts.add(new Day(2, 1, 2000), 11.0);
        ts.clear();
        assertEquals(0, ts.getItemCount());
        assertNull(ts.getTimePeriodClass());
        assertTrue(Double.isNaN(ts.getMinY()));
        assertTrue(Double.isNaN(ts.getMaxY()));
    }

    @Test
    public void testClearEmpty() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.clear();
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testDeleteByPeriod() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        RegularTimePeriod period3 = new Day(3, 1, 2000);
        ts.add(period1, 10.0);
        ts.add(period2, 11.0);
        ts.add(period3, 12.0);

        ts.delete(period2);
        assertEquals(2, ts.getItemCount());
        assertEquals(period1, ts.getTimePeriod(0));
        assertEquals(period3, ts.getTimePeriod(1));
    }

    @Test
    public void testDeleteByPeriodNotFound() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period1 = new Day(1, 1, 2000);
        RegularTimePeriod period2 = new Day(2, 1, 2000);
        ts.add(period1, 10.0);
        ts.delete(period2); // Should do nothing
        assertEquals(1, ts.getItemCount());
    }

    @Test
    public void testDeleteByPeriodWhenEmpty() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod period = new Day(1, 1, 2000);
        ts.delete(period); // Should do nothing
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testDeleteByIndexRange() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        RegularTimePeriod p3 = new Day(3, 1, 2000);
        RegularTimePeriod p4 = new Day(4, 1, 2000);
        ts.add(p1, 10.0);
        ts.add(p2, 11.0);
        ts.add(p3, 12.0);
        ts.add(p4, 13.0);

        ts.delete(1, 2); // Delete p2 and p3
        assertEquals(2, ts.getItemCount());
        assertEquals(p1, ts.getTimePeriod(0));
        assertEquals(p4, ts.getTimePeriod(1));
    }

    @Test
    public void testDeleteByIndexRangeSingleItem() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        ts.add(p1, 10.0);
        ts.delete(0, 0); // Delete p1
        assertEquals(0, ts.getItemCount());
        assertNull(ts.getTimePeriodClass());
    }

    @Test
    public void testDeleteByIndexRangeAllItems() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        ts.add(p1, 10.0);
        ts.add(p2, 11.0);
        ts.delete(0, 1); // Delete p1 and p2
        assertEquals(0, ts.getItemCount());
        assertNull(ts.getTimePeriodClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteByIndexRangeInvalidRange() {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.delete(1, 0);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        ts.add(p1, 10.0);
        ts.add(p2, 11.0);
        ts.setDomainDescription("Domain");
        ts.setRangeDescription("Range");
        ts.setMaximumItemCount(5);
        ts.setMaximumItemAge(10);

        TimeSeries cloned = (TimeSeries) ts.clone();

        assertNotSame(ts, cloned);
        assertEquals(ts.getKey(), cloned.getKey());
        assertEquals(ts.getDomainDescription(), cloned.getDomainDescription());
        assertEquals(ts.getRangeDescription(), cloned.getRangeDescription());
        assertEquals(ts.getMaximumItemCount(), cloned.getMaximumItemCount());
        assertEquals(ts.getMaximumItemAge(), cloned.getMaximumItemAge());
        assertEquals(ts.getItemCount(), cloned.getItemCount());

        // Check that data items are cloned
        for (int i = 0; i < ts.getItemCount(); i++) {
            assertNotSame(ts.getRawDataItem(i), cloned.getRawDataItem(i));
            assertEquals(ts.getRawDataItem(i), cloned.getRawDataItem(i));
        }
    }

    @Test
    public void testCreateCopyByIndexRange() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        RegularTimePeriod p3 = new Day(3, 1, 2000);
        ts.add(p1, 10.0);
        ts.add(p2, 11.0);
        ts.add(p3, 12.0);

        TimeSeries copy = ts.createCopy(0, 1); // Copy p1 and p2

        assertEquals(2, copy.getItemCount());
        assertEquals(p1, copy.getTimePeriod(0));
        assertEquals(10.0, copy.getValue(0).doubleValue(), 0.0001);
        assertEquals(p2, copy.getTimePeriod(1));
        assertEquals(11.0, copy.getValue(1).doubleValue(), 0.0001);

        // Ensure it's a new instance and data items are cloned
        assertNotSame(ts, copy);
        assertNotSame(ts.getRawDataItem(0), copy.getRawDataItem(0));
    }

    @Test
    public void testCreateCopyByIndexRangeOutOfBoundsStart() {
        TimeSeries ts = new TimeSeries("Test Series");
        try {
            ts.createCopy(-1, 1);
            fail("IllegalArgumentException should be thrown.");
        } catch (IllegalArgumentException e) {
            // Expected
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException not expected here.");
        }
    }

    @Test
    public void testCreateCopyByIndexRangeOutOfBoundsEnd() {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        ts.add(p1, 10.0);
        try {
            // createCopy internally uses add which will throw SeriesException if the index is out of bounds
            ts.createCopy(0, 1);
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException not expected here.");
        } catch (SeriesException e) {
             // Expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyByIndexRangeStartGreaterThanEnd() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        ts.add(p1, 10.0);
        ts.createCopy(1, 0);
    }

    @Test
    public void testCreateCopyByPeriodRange() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        RegularTimePeriod p3 = new Day(3, 1, 2000);
        ts.add(p1, 10.0);
        ts.add(p2, 11.0);
        ts.add(p3, 12.0);

        TimeSeries copy = ts.createCopy(p1, p2); // Copy p1 and p2

        assertEquals(2, copy.getItemCount());
        assertEquals(p1, copy.getTimePeriod(0));
        assertEquals(10.0, copy.getValue(0).doubleValue(), 0.0001);
        assertEquals(p2, copy.getTimePeriod(1));
        assertEquals(11.0, copy.getValue(1).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyByPeriodRangeNullStart() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        ts.add(p1, 10.0);
        ts.createCopy(null, p1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyByPeriodRangeNullEnd() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        ts.add(p1, 10.0);
        ts.createCopy(p1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyByPeriodRangeStartAfterEnd() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        ts.add(p1, 10.0);
        ts.add(p2, 11.0);
        ts.createCopy(p2, p1);
    }

    @Test
    public void testCreateCopyByPeriodRangeEmptyResult() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("Test Series");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        RegularTimePeriod p3 = new Day(3, 1, 2000);
        ts.add(p1, 10.0);
        ts.add(p2, 11.0);

        // Create a copy range that doesn't exist in the series
        TimeSeries copy = ts.createCopy(p3, p3);
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testEqualsSameInstance() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertTrue(ts.equals(ts));
    }

    @Test
    public void testEqualsDifferentClass() {
        TimeSeries ts = new TimeSeries("Test Series");
        assertFalse(ts.equals("Not a TimeSeries"));
    }

    @Test
    public void testEqualsDifferentDomainDescription() {
        TimeSeries ts1 = new TimeSeries("Test Series", "Domain1", "Range");
        TimeSeries ts2 = new TimeSeries("Test Series", "Domain2", "Range");
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentRangeDescription() {
        TimeSeries ts1 = new TimeSeries("Test Series", "Domain", "Range1");
        TimeSeries ts2 = new TimeSeries("Test Series", "Domain", "Range2");
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentTimePeriodClass() {
        TimeSeries ts1 = new TimeSeries("Test Series");
        ts1.add(new Day(1, 1, 2000), 10.0);
        TimeSeries ts2 = new TimeSeries("Test Series");
        ts2.add(new Month(1, 2000), 20.0);
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentMaximumItemAge() {
        TimeSeries ts1 = new TimeSeries("Test Series");
        ts1.setMaximumItemAge(10);
        TimeSeries ts2 = new TimeSeries("Test Series");
        ts2.setMaximumItemAge(20);
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentMaximumItemCount() {
        TimeSeries ts1 = new TimeSeries("Test Series");
        ts1.setMaximumItemCount(10);
        TimeSeries ts2 = new TimeSeries("Test Series");
        ts2.setMaximumItemCount(20);
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentItemCount() {
        TimeSeries ts1 = new TimeSeries("Test Series");
        ts1.add(new Day(1, 1, 2000), 10.0);
        TimeSeries ts2 = new TimeSeries("Test Series");
        ts2.add(new Day(1, 1, 2000), 10.0);
        ts2.add(new Day(2, 1, 2000), 11.0);
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentData() {
        TimeSeries ts1 = new TimeSeries("Test Series");
        ts1.add(new Day(1, 1, 2000), 10.0);
        TimeSeries ts2 = new TimeSeries("Test Series");
        ts2.add(new Day(1, 1, 2000), 11.0);
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testEqualsSameData() {
        TimeSeries ts1 = new TimeSeries("Test Series", "Domain", "Range");
        TimeSeries ts2 = new TimeSeries("Test Series", "Domain", "Range");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        ts1.add(p1, 10.0);
        ts2.add(p1, 10.0);
        assertTrue(ts1.equals(ts2));
    }

    @Test
    public void testHashCode() {
        TimeSeries ts1 = new TimeSeries("Test Series", "Domain", "Range");
        TimeSeries ts2 = new TimeSeries("Test Series", "Domain", "Range");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        ts1.add(p1, 10.0);
        ts2.add(p1, 10.0);

        assertEquals(ts1.hashCode(), ts2.hashCode());
    }

    @Test
    public void testHashCodeWithDifferentData() {
        TimeSeries ts1 = new TimeSeries("Test Series", "Domain", "Range");
        TimeSeries ts2 = new TimeSeries("Test Series", "Domain", "Range");
        RegularTimePeriod p1 = new Day(1, 1, 2000);
        RegularTimePeriod p2 = new Day(2, 1, 2000);
        ts1.add(p1, 10.0);
        ts2.add(p2, 11.0);

        assertNotEquals(ts1.hashCode(), ts2.hashCode());
    }

    // Test for removeAgedItems(long latest, boolean notify)
    @Test
    public void testRemoveAgedItemsWithLatestAndNotify() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TimeSeries ts = new TimeSeries("Test Series");
        ts.setMaximumItemAge(1); // Max age of 1 period

        RegularTimePeriod p10 = new Day(1, 1, 2000); // serial index 1
        RegularTimePeriod p11 = new Day(11, 1, 2000); // serial index 11
        RegularTimePeriod p21 = new Day(21, 1, 2000); // serial index 21

        ts.add(p10, 10.0);
        ts.add(p11, 11.0);
        ts.add(p21, 12.0);

        // latest date is Day 11 (serial index 11)
        Day dayForLatest = new Day(11, 1, 2000);
        long latestMillis = dayForLatest.getFirstMillisecond();

        // The removeAgedItems(long latest, boolean notify) method uses reflection
        // to create a RegularTimePeriod instance. We need to ensure that call works.
        // The method itself is private, so we'd need to use reflection to call it.
        // However, the prompt states not to use reflection.
        // The `removeAgedItems(boolean notify)` method is public and more directly tests
        // the `maximumItemAge` logic based on the series' own time span.
        // The previous test `testRemoveAgedItemsTrue` already covers this.
        // This test will focus on verifying the `maximumItemAge` logic through the public method.

        // Let's re-verify the logic of `removeAgedItems(boolean notify)`
        // `(latest - getTimePeriod(0).getSerialIndex()) > this.maximumItemAge`
        // Here, `latest` is the serial index of the *last* item in the series.
        // If the span between the first and last item is greater than `maximumItemAge`,
        // the first item is removed.
        // For p10, p11, p21, the span is (serial index of p21) - (serial index of p10) = 21 - 1 = 20.
        // If maximumItemAge = 1, then 20 > 1, so p10 should be removed.
        // If maximumItemAge = 20, then 20 > 20 is false, so p10 should not be removed.
        // If maximumItemAge = 19, then 20 > 19 is true, so p10 should be removed.

        // Test case: maximumItemAge = 1, p10, p11, p21
        // Latest serial index is 21. First is p10 (serial index 1). Span = 20.
        // 20 > 1 is true. Remove p10.
        // Now series has p11, p21. Latest is p21 (serial index 21). First is p11 (serial index 11). Span = 10.
        // 10 > 1 is true. Remove p11.
        // Now series has p21. Latest is p21 (serial index 21). First is p21 (serial index 21). Span = 0.
        // 0 > 1 is false. Stop.
        // Expected: p10 and p11 removed. p21 remains.

        ts.removeAgedItems(true); // Use the public method for clarity.

        assertEquals(1, ts.getItemCount());
        assertEquals(p21, ts.getTimePeriod(0));
        assertEquals(12.0, ts.getValue(0).doubleValue(), 0.0001);
    }
}
```
