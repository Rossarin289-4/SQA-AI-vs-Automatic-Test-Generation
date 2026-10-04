package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.data.general.Series;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesException;

public class TimeSeriesTest {

    @Test
    public void testTimeSeriesConstructor() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        assertEquals("TestSeries", ts.getKey());
        assertEquals(TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, ts.getDomainDescription());
        assertEquals(TimeSeries.DEFAULT_RANGE_DESCRIPTION, ts.getRangeDescription());
        assertEquals(Day.class, ts.getTimePeriodClass());
        assertEquals(0, ts.getItemCount());
        assertEquals(Integer.MAX_VALUE, ts.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, ts.getMaximumItemAge());
    }

    @Test
    public void testTimeSeriesConstructorWithDescriptions() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", "DomainDesc", "RangeDesc", Day.class);
        assertEquals("TestSeries", ts.getKey());
        assertEquals("DomainDesc", ts.getDomainDescription());
        assertEquals("RangeDesc", ts.getRangeDescription());
        assertEquals(Day.class, ts.getTimePeriodClass());
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testSetDomainDescription() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setDomainDescription("New Domain");
        assertEquals("New Domain", ts.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setRangeDescription("New Range");
        assertEquals("New Range", ts.getRangeDescription());
    }

    @Test
    public void testGetItemCountEmpty() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testGetItemsEmpty() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        assertTrue(ts.getItems().isEmpty());
    }

    @Test
    public void testGetItemsAfterAdding() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        assertEquals(1, ts.getItems().size());
        assertEquals(d1, ((TimeSeriesDataItem) ts.getItems().get(0)).getPeriod());
        assertEquals(10.0, ((TimeSeriesDataItem) ts.getItems().get(0)).getValue().doubleValue(), 0.0);
    }

    @Test
    public void testSetMaximumItemCount() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setMaximumItemCount(3);
        assertEquals(3, ts.getMaximumItemCount());
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        Day d4 = new Day(4, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        ts.add(d3, 30.0);
        ts.add(d4, 40.0);
        assertEquals(3, ts.getItemCount());
        assertEquals(d2, ts.getTimePeriod(0));
        assertEquals(d3, ts.getTimePeriod(1));
        assertEquals(d4, ts.getTimePeriod(2));
    }

    @Test
    public void testSetMaximumItemCountToZero() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setMaximumItemCount(0);
        assertEquals(0, ts.getMaximumItemCount());
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        assertEquals(0, ts.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegative() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemAge() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setMaximumItemAge(2); // Keep last 2 periods
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        ts.add(d3, 30.0); // d1 should be removed
        assertEquals(2, ts.getItemCount());
        assertEquals(d2, ts.getTimePeriod(0));
        assertEquals(d3, ts.getTimePeriod(1));
    }

    @Test
    public void testSetMaximumItemAgeZero() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setMaximumItemAge(0); // Keep only the latest
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0); // d1 should be removed
        assertEquals(1, ts.getItemCount());
        assertEquals(d2, ts.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegative() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setMaximumItemAge(-1);
    }

    @Test
    public void testGetDataItemByIndex() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        TimeSeriesDataItem item = ts.getDataItem(0);
        assertEquals(d1, item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.0);
    }

    @Test
    public void testGetDataItemByPeriod() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        TimeSeriesDataItem item = ts.getDataItem(d1);
        assertEquals(d1, item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.0);
    }

    @Test
    public void testGetDataItemByPeriodNotFound() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        assertNull(ts.getDataItem(d2));
    }

    @Test
    public void testGetTimePeriodByIndex() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        assertEquals(d1, ts.getTimePeriod(0));
    }

    @Test
    public void testGetNextTimePeriod() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        assertEquals(new Day(2, 1, 2000), ts.getNextTimePeriod());
    }

    @Test
    public void testGetTimePeriods() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        Collection periods = ts.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(d1));
        assertTrue(periods.contains(d2));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() throws Exception {
        TimeSeries ts1 = new TimeSeries("Series1", Day.class);
        TimeSeries ts2 = new TimeSeries("Series2", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.add(d2, 20.0);
        ts2.add(d2, 20.0);
        ts2.add(d3, 30.0);
        Collection unique = ts1.getTimePeriodsUniqueToOtherSeries(ts2);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(d1));
    }

    @Test
    public void testGetIndex() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        assertEquals(0, ts.getIndex(d1));
        assertEquals(1, ts.getIndex(d2));
    }

    @Test
    public void testGetIndexNotFound() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        assertEquals(-2, ts.getIndex(d2)); // binarySearch returns negative for not found
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNull() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.getIndex(null);
    }

    @Test
    public void testGetValueByIndex() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.5);
        assertEquals(10.5, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testGetValueByPeriod() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.5);
        assertEquals(10.5, ts.getValue(d1).doubleValue(), 0.0);
    }

    @Test
    public void testGetValueByPeriodNotFound() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.5);
        assertNull(ts.getValue(d2));
    }

    @Test
    public void testAdd() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        TimeSeriesDataItem item = new TimeSeriesDataItem(d1, 10.0);
        ts.add(item);
        assertEquals(1, ts.getItemCount());
        assertEquals(d1, ts.getTimePeriod(0));
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItem() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAddWrongTimePeriodClass() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Month m1 = new Month(1, 2000);
        ts.add(m1, 10.0);
    }

    @Test
    public void testAddWithNotify() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0, true);
        assertEquals(1, ts.getItemCount());
    }

    @Test
    public void testAddDoubleValue() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        assertEquals(1, ts.getItemCount());
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddDoubleValueWithNotify() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0, true);
        assertEquals(1, ts.getItemCount());
    }

    @Test
    public void testAddNumberValue() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, new Double(10.0));
        assertEquals(1, ts.getItemCount());
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddNumberValueWithNotify() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, new Double(10.0), true);
        assertEquals(1, ts.getItemCount());
    }

    @Test
    public void testAddNumberValueNull() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, (Number) null);
        assertNull(ts.getValue(0));
    }

    @Test
    public void testUpdateByPeriod() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        ts.update(d1, 20.0);
        assertEquals(20.0, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateByPeriodNotFound() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        ts.update(d2, 20.0);
    }

    @Test
    public void testUpdateByIndex() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        ts.update(0, 20.0);
        assertEquals(20.0, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddAndOrUpdate() throws Exception {
        TimeSeries ts1 = new TimeSeries("Series1", Day.class);
        TimeSeries ts2 = new TimeSeries("Series2", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.add(d2, 20.0);
        ts2.add(d2, 25.0); // update
        ts2.add(d3, 30.0); // add
        TimeSeries overwritten = ts1.addAndOrUpdate(ts2);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(d2, overwritten.getTimePeriod(0));
        assertEquals(20.0, overwritten.getValue(0).doubleValue(), 0.0);
        assertEquals(3, ts1.getItemCount());
        assertEquals(25.0, ts1.getValue(ts1.getIndex(d2)).doubleValue(), 0.0);
        assertEquals(30.0, ts1.getValue(ts1.getIndex(d3)).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateDoubleValue() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        TimeSeriesDataItem overwritten = ts.addOrUpdate(d2, 20.0);
        assertNull(overwritten);
        assertEquals(2, ts.getItemCount());
        assertEquals(20.0, ts.getValue(ts.getIndex(d2)).doubleValue(), 0.0);

        overwritten = ts.addOrUpdate(d1, 15.0);
        assertNotNull(overwritten);
        assertEquals(d1, overwritten.getPeriod());
        assertEquals(10.0, overwritten.getValue().doubleValue(), 0.0);
        assertEquals(2, ts.getItemCount());
        assertEquals(15.0, ts.getValue(ts.getIndex(d1)).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateNumberValue() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        TimeSeriesDataItem overwritten = ts.addOrUpdate(d2, new Double(20.0));
        assertNull(overwritten);
        assertEquals(2, ts.getItemCount());
        assertEquals(20.0, ts.getValue(ts.getIndex(d2)).doubleValue(), 0.0);

        overwritten = ts.addOrUpdate(d1, new Double(15.0));
        assertNotNull(overwritten);
        assertEquals(d1, overwritten.getPeriod());
        assertEquals(10.0, overwritten.getValue().doubleValue(), 0.0);
        assertEquals(2, ts.getItemCount());
        assertEquals(15.0, ts.getValue(ts.getIndex(d1)).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateNumberValueNull() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        TimeSeriesDataItem overwritten = ts.addOrUpdate(d1, (Number) null);
        assertNotNull(overwritten);
        assertEquals(d1, overwritten.getPeriod());
        assertEquals(10.0, overwritten.getValue().doubleValue(), 0.0);
        assertNull(ts.getValue(ts.getIndex(d1)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateNullPeriod() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.addOrUpdate(null, 10.0);
    }

    @Test
    public void testRemoveAgedItemsNoNotify() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setMaximumItemAge(2);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        ts.add(d3, 30.0); // d1 should be removed
        assertEquals(2, ts.getItemCount());
        assertEquals(d2, ts.getTimePeriod(0));
        assertEquals(d3, ts.getTimePeriod(1));
    }

    @Test
    public void testRemoveAgedItemsWithNotify() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        ts.setMaximumItemAge(2);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        ts.removeAgedItems(true); // Should not remove anything yet
        assertEquals(2, ts.getItemCount());
        ts.add(d3, 30.0); // d1 should be removed by add()
        assertEquals(2, ts.getItemCount());
        assertEquals(d2, ts.getTimePeriod(0));
        assertEquals(d3, ts.getTimePeriod(1));
    }

    @Test
    public void testClear() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        ts.clear();
        assertEquals(0, ts.getItemCount());
        assertTrue(ts.getItems().isEmpty());
    }

    @Test
    public void testDeleteByPeriod() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        ts.add(d3, 30.0);
        ts.delete(d2);
        assertEquals(2, ts.getItemCount());
        assertEquals(d1, ts.getTimePeriod(0));
        assertEquals(d3, ts.getTimePeriod(1));
    }

    @Test
    public void testDeleteByPeriodNotFound() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts.add(d1, 10.0);
        ts.delete(d2); // Should do nothing
        assertEquals(1, ts.getItemCount());
        assertEquals(d1, ts.getTimePeriod(0));
    }

    @Test
    public void testDeleteByIndexRange() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts.add(d1, 10.0);
        ts.add(d2, 20.0);
        ts.add(d3, 30.0);
        ts.delete(0, 1); // Delete d1 and d2
        assertEquals(1, ts.getItemCount());
        assertEquals(d3, ts.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteByIndexRangeInvalidRange() throws Exception {
        TimeSeries ts = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts.add(d1, 10.0);
        ts.delete(1, 0);
    }

    @Test
    public void testClone() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.add(d2, 20.0);
        TimeSeries ts2 = (TimeSeries) ts1.clone();

        assertNotSame(ts1, ts2);
        assertEquals(ts1.getKey(), ts2.getKey());
        assertEquals(ts1.getDomainDescription(), ts2.getDomainDescription());
        assertEquals(ts1.getRangeDescription(), ts2.getRangeDescription());
        assertEquals(ts1.getTimePeriodClass(), ts2.getTimePeriodClass());
        assertEquals(ts1.getMaximumItemCount(), ts2.getMaximumItemCount());
        assertEquals(ts1.getMaximumItemAge(), ts2.getMaximumItemAge());
        assertEquals(ts1.getItemCount(), ts2.getItemCount());

        // Check data items are independent
        TimeSeriesDataItem item1 = ts1.getDataItem(0);
        TimeSeriesDataItem item2 = ts2.getDataItem(0);
        assertNotSame(item1, item2);
        assertEquals(item1, item2);
    }

    @Test
    public void testCreateCopyByIndexRange() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.add(d2, 20.0);
        ts1.add(d3, 30.0);

        TimeSeries copy = ts1.createCopy(1, 2);
        assertEquals(ts1.getKey(), copy.getKey());
        assertEquals(2, copy.getItemCount());
        assertEquals(d2, copy.getTimePeriod(0));
        assertEquals(20.0, copy.getValue(0).doubleValue(), 0.0);
        assertEquals(d3, copy.getTimePeriod(1));
        assertEquals(30.0, copy.getValue(1).doubleValue(), 0.0);

        // Ensure original series is not modified and copy is independent
        assertEquals(3, ts1.getItemCount());
        assertNotSame(ts1.getDataItem(1), copy.getDataItem(0));
    }

    @Test
    public void testCreateCopyByPeriodRange() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.add(d2, 20.0);
        ts1.add(d3, 30.0);

        TimeSeries copy = ts1.createCopy(d1, d2);
        assertEquals(ts1.getKey(), copy.getKey());
        assertEquals(2, copy.getItemCount());
        assertEquals(d1, copy.getTimePeriod(0));
        assertEquals(10.0, copy.getValue(0).doubleValue(), 0.0);
        assertEquals(d2, copy.getTimePeriod(1));
        assertEquals(20.0, copy.getValue(1).doubleValue(), 0.0);
    }

    @Test
    public void testCreateCopyByPeriodRangePartialMatchStart() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.add(d2, 20.0);
        ts1.add(d3, 30.0);

        // Start period is not exactly in the series, but before d2
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.setTime(d1.getStart());
        cal.add(Calendar.MILLISECOND, 1); // Just after d1's start
        Date date1_5 = cal.getTime();
        Day d1_5 = new Day(date1_5);

        TimeSeries copy = ts1.createCopy(d1_5, d3);
        assertEquals(ts1.getKey(), copy.getKey());
        assertEquals(2, copy.getItemCount());
        assertEquals(d2, copy.getTimePeriod(0));
        assertEquals(20.0, copy.getValue(0).doubleValue(), 0.0);
        assertEquals(d3, copy.getTimePeriod(1));
        assertEquals(30.0, copy.getValue(1).doubleValue(), 0.0);
    }

    @Test
    public void testCreateCopyByPeriodRangePartialMatchEnd() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        Day d3 = new Day(3, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.add(d2, 20.0);
        ts1.add(d3, 30.0);

        // End period is not exactly in the series, but between d1 and d2
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.setTime(d1.getStart());
        cal.add(Calendar.MILLISECOND, 1); // Just after d1's start
        Date date1_5 = cal.getTime();
        Day d1_5 = new Day(date1_5);

        TimeSeries copy = ts1.createCopy(d1, d1_5);
        assertEquals(ts1.getKey(), copy.getKey());
        assertEquals(1, copy.getItemCount());
        assertEquals(d1, copy.getTimePeriod(0));
        assertEquals(10.0, copy.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testCreateCopyByPeriodRangeEmptyRange() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.add(d2, 20.0);

        Day d3 = new Day(3, 1, 2000);
        TimeSeries copy = ts1.createCopy(d3, d3); // Range outside existing data
        assertEquals(ts1.getKey(), copy.getKey());
        assertEquals(0, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyByPeriodRangeStartAfterEnd() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        Day d2 = new Day(2, 1, 2000);
        ts1.add(d1, 10.0);
        ts1.createCopy(d2, d1);
    }

    @Test
    public void testEquals() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        TimeSeries ts2 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts1.add(d1, 10.0);
        ts2.add(d1, 10.0);
        assertTrue(ts1.equals(ts2));
        assertTrue(ts2.equals(ts1));
    }

    @Test
    public void testEqualsDifferentKey() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries1", Day.class);
        TimeSeries ts2 = new TimeSeries("TestSeries2", Day.class);
        assertTrue(!ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentDomainDescription() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", "Domain1", "Range", Day.class);
        TimeSeries ts2 = new TimeSeries("TestSeries", "Domain2", "Range", Day.class);
        assertTrue(!ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentRangeDescription() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", "Domain", "Range1", Day.class);
        TimeSeries ts2 = new TimeSeries("TestSeries", "Domain", "Range2", Day.class);
        assertTrue(!ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentClass() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        TimeSeries ts2 = new TimeSeries("TestSeries", Month.class);
        assertTrue(!ts1.equals(ts2)); // This was failing, now correctly asserts inequality.
    }

    @Test
    public void testEqualsDifferentMaximumItemCount() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        ts1.setMaximumItemCount(10);
        TimeSeries ts2 = new TimeSeries("TestSeries", Day.class);
        ts2.setMaximumItemCount(20);
        assertTrue(!ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentMaximumItemAge() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        ts1.setMaximumItemAge(100);
        TimeSeries ts2 = new TimeSeries("TestSeries", Day.class);
        ts2.setMaximumItemAge(200);
        assertTrue(!ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentData() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        Day d1 = new Day(1, 1, 2000);
        ts1.add(d1, 10.0);
        TimeSeries ts2 = new TimeSeries("TestSeries", Day.class);
        Day d2 = new Day(2, 1, 2000);
        ts2.add(d2, 20.0);
        assertTrue(!ts1.equals(ts2));
    }

    @Test
    public void testHashCode() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries", Day.class);
        TimeSeries ts2 = new TimeSeries("TestSeries", Day.class);
        assertEquals(ts1.hashCode(), ts2.hashCode());

        Day d1 = new Day(1, 1, 2000);
        ts1.add(d1, 10.0);
        ts2.add(d1, 10.0);
        assertEquals(ts1.hashCode(), ts2.hashCode());
    }

    @Test
    public void testHashCodeDifferent() throws Exception {
        TimeSeries ts1 = new TimeSeries("TestSeries1", Day.class);
        TimeSeries ts2 = new TimeSeries("TestSeries2", Day.class);
        assertTrue(ts1.hashCode() != ts2.hashCode());

        Day d1 = new Day(1, 1, 2000);
        ts1.add(d1, 10.0);
        Day d2 = new Day(2, 1, 2000);
        ts2.add(d2, 20.0);
        assertTrue(ts1.hashCode() != ts2.hashCode());
    }
}
