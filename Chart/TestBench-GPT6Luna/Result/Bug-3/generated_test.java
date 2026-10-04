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

public class TimeSeriesTest {
    @Test
    public void testDescriptions() throws Exception {
        TimeSeries s = new TimeSeries("s", "Domain", "Range");
        assertEquals("Domain", s.getDomainDescription());
        assertEquals("Range", s.getRangeDescription());
        s.setDomainDescription(null);
        s.setRangeDescription("Y");
        assertNull(s.getDomainDescription());
        assertEquals("Y", s.getRangeDescription());
    }

    @Test
    public void testInitialState() throws Exception {
        TimeSeries s = new TimeSeries("s");
        assertEquals(0, s.getItemCount());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
        assertTrue(Double.isNaN(s.getMinY()));
        assertTrue(Double.isNaN(s.getMaxY()));
        assertNull(s.getTimePeriodClass());
        assertTrue(s.getItems().isEmpty());
    }

    @Test
    public void testMaximumItemCountZero() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.setMaximumItemCount(0);
        assertEquals(0, s.getMaximumItemCount());
        s.add(new Day(1, 1, 2020), 4.0);
        assertEquals(0, s.getItemCount());
        assertTrue(Double.isNaN(s.getMinY()));
        assertTrue(Double.isNaN(s.getMaxY()));
    }

    @Test
    public void testMaximumItemCountTrimsOldest() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), 1.0);
        s.add(new Day(2, 1, 2020), 2.0);
        s.add(new Day(3, 1, 2020), 3.0);
        s.setMaximumItemCount(2);
        assertEquals(2, s.getItemCount());
        assertEquals(new Day(2, 1, 2020), s.getTimePeriod(0));
        assertEquals(2.0, s.getMinY(), 0.0);
        assertEquals(3.0, s.getMaxY(), 0.0);
    }

    @Test
    public void testRejectNegativeMaximumItemCount() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.setMaximumItemCount(-1);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
    }

    @Test
    public void testMaximumAgeBoundary() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.setMaximumItemAge(1);
        s.add(new Day(1, 1, 2020), 1.0);
        s.add(new Day(2, 1, 2020), 2.0);
        assertEquals(2, s.getItemCount());
        s.add(new Day(3, 1, 2020), 3.0);
        assertEquals(2, s.getItemCount());
        assertEquals(new Day(2, 1, 2020), s.getTimePeriod(0));
        assertEquals(2.0, s.getMinY(), 0.0);
    }

    @Test
    public void testRejectNegativeMaximumAge() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.setMaximumItemAge(-1);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testGetIndexAndValuesAtFirstAndLast() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(1, 1, 2020);
        Day last = new Day(3, 1, 2020);
        s.add(last, 30.0);
        s.add(first, 10.0);
        assertEquals(0, s.getIndex(first));
        assertEquals(1, s.getIndex(last));
        assertEquals(10.0, s.getValue(0).doubleValue(), 0.0);
        assertEquals(30.0, s.getValue(last).doubleValue(), 0.0);
        assertNull(s.getValue(new Day(2, 1, 2020)));
    }

    @Test
    public void testGetIndexRejectsNull() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.getIndex(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testSortedItemsAndUnmodifiableItems() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(1, 1, 2020);
        Day second = new Day(2, 1, 2020);
        s.add(second, 2.0);
        s.add(first, 1.0);
        List items = s.getItems();
        assertEquals(2, items.size());
        assertEquals(first, ((TimeSeriesDataItem) items.get(0)).getPeriod());
        assertEquals(second, ((TimeSeriesDataItem) items.get(1)).getPeriod());
        try {
            items.clear();
            fail("expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) { }
        assertEquals(2, s.getItemCount());
    }

    @Test
    public void testDataItemIsCopy() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        s.add(day, 5.0);
        TimeSeriesDataItem item = s.getDataItem(0);
        item.setValue(9.0);
        assertEquals(5.0, s.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testNextPeriodAndTimePeriods() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        s.add(day, 5.0);
        Collection periods = s.getTimePeriods();
        assertEquals(1, periods.size());
        assertTrue(periods.contains(day));
        assertEquals(day.next(), s.getNextTimePeriod());
    }

    @Test
    public void testUniquePeriodsFromOtherSeries() throws Exception {
        TimeSeries a = new TimeSeries("a");
        TimeSeries b = new TimeSeries("b");
        Day one = new Day(1, 1, 2020);
        Day two = new Day(2, 1, 2020);
        a.add(one, 1.0);
        b.add(one, 10.0);
        b.add(two, 20.0);
        Collection unique = a.getTimePeriodsUniqueToOtherSeries(b);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(two));
    }

    @Test
    public void testBoundsIgnoreNullAndNaN() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), (Number) null);
        s.add(new Day(2, 1, 2020), Double.NaN);
        assertTrue(Double.isNaN(s.getMinY()));
        assertTrue(Double.isNaN(s.getMaxY()));
        s.add(new Day(3, 1, 2020), -2.0);
        s.add(new Day(4, 1, 2020), 7.0);
        assertEquals(-2.0, s.getMinY(), 0.0);
        assertEquals(7.0, s.getMaxY(), 0.0);
    }

    @Test
    public void testUpdateRecalculatesBounds() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day one = new Day(1, 1, 2020);
        Day two = new Day(2, 1, 2020);
        s.add(one, 1.0);
        s.add(two, 4.0);
        s.update(one, 3.0);
        assertEquals(3.0, s.getMinY(), 0.0);
        assertEquals(4.0, s.getMaxY(), 0.0);
        s.update(two, (Number) null);
        assertEquals(3.0, s.getMinY(), 0.0);
        assertEquals(3.0, s.getMaxY(), 0.0);
    }

    @Test
    public void testUpdateMissingPeriodThrows() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.update(new Day(1, 1, 2020), 2.0);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) { }
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testAddOrUpdateReturnsOldAndReplacesValue() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        assertNull(s.addOrUpdate(day, 2.0));
        TimeSeriesDataItem old = s.addOrUpdate(day, 6.0);
        assertEquals(2.0, old.getValue().doubleValue(), 0.0);
        assertEquals(6.0, s.getValue(day).doubleValue(), 0.0);
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testAddAndOrUpdateReportsOverwrittenItems() throws Exception {
        TimeSeries target = new TimeSeries("target");
        TimeSeries source = new TimeSeries("source");
        Day one = new Day(1, 1, 2020);
        Day two = new Day(2, 1, 2020);
        target.add(one, 1.0);
        source.add(one, 10.0);
        source.add(two, 20.0);
        TimeSeries overwritten = target.addAndOrUpdate(source);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(1.0, overwritten.getValue(one).doubleValue(), 0.0);
        assertEquals(10.0, target.getValue(one).doubleValue(), 0.0);
        assertEquals(20.0, target.getValue(two).doubleValue(), 0.0);
    }

    @Test
    public void testDeletePeriodAndRecalculateBounds() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day one = new Day(1, 1, 2020);
        Day two = new Day(2, 1, 2020);
        s.add(one, -1.0);
        s.add(two, 4.0);
        s.delete(one);
        assertEquals(1, s.getItemCount());
        assertEquals(4.0, s.getMinY(), 0.0);
        assertEquals(4.0, s.getMaxY(), 0.0);
        assertEquals(0, s.getIndex(two));
    }

    @Test
    public void testClearResetsSeriesDataAndPeriodClass() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), 2.0);
        s.clear();
        assertEquals(0, s.getItemCount());
        assertNull(s.getTimePeriodClass());
        assertTrue(Double.isNaN(s.getMinY()));
        assertTrue(Double.isNaN(s.getMaxY()));
    }

    @Test
    public void testCreateCopyInclusiveRange() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), 1.0);
        s.add(new Day(2, 1, 2020), 2.0);
        s.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = s.createCopy(1, 2);
        assertEquals(2, copy.getItemCount());
        assertEquals(2.0, copy.getValue(0).doubleValue(), 0.0);
        assertEquals(3.0, copy.getValue(1).doubleValue(), 0.0);
        assertEquals(1.0, s.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testCreateCopyPeriodRangeClipsToPresentItems() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(2, 1, 2020), 2.0);
        s.add(new Day(4, 1, 2020), 4.0);
        TimeSeries copy = s.createCopy(new Day(1, 1, 2020),
                new Day(5, 1, 2020));
        assertEquals(2, copy.getItemCount());
        assertEquals(2.0, copy.getValue(0).doubleValue(), 0.0);
        assertEquals(4.0, copy.getValue(1).doubleValue(), 0.0);
    }

    @Test
    public void testCloneIsEqualAndIndependent() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), 3.0);
        TimeSeries copy = (TimeSeries) s.clone();
        assertEquals(s, copy);
        copy.update(0, 8.0);
        assertEquals(3.0, s.getValue(0).doubleValue(), 0.0);
        assertEquals(8.0, copy.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testEqualityDistinguishesSeriesContent() throws Exception {
        TimeSeries a = new TimeSeries("s");
        TimeSeries b = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        a.add(day, 1.0);
        b.add(day, 2.0);
        assertFalse(a.equals(b));
        assertTrue(a.equals(a));
        assertFalse(a.equals(null));
    }
}
