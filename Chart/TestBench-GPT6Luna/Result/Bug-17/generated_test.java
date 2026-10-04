package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
    public void testDescriptionsCanBeSetToNull() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.setDomainDescription(null);
        s.setRangeDescription(null);
        assertEquals(null, s.getDomainDescription());
        assertEquals(null, s.getRangeDescription());
    }

    @Test
    public void testInitialDescriptionsAndPeriodClass() throws Exception {
        TimeSeries s = new TimeSeries("s");
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
        assertEquals(Day.class, s.getTimePeriodClass());
    }

    @Test
    public void testEmptyItemsAndPeriods() throws Exception {
        TimeSeries s = new TimeSeries("s");
        assertEquals(0, s.getItemCount());
        assertEquals(0, s.getItems().size());
        assertEquals(0, s.getTimePeriods().size());
    }

    @Test
    public void testMaximumItemCountZeroAndOne() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.setMaximumItemCount(1);
        s.add(new Day(1, 1, 2020), 2.0);
        s.add(new Day(2, 1, 2020), 3.0);
        assertEquals(1, s.getMaximumItemCount());
        assertEquals(1, s.getItemCount());
        assertEquals(3.0, s.getValue(0).doubleValue(), 1e-9);
        s.setMaximumItemCount(0);
        assertEquals(0, s.getMaximumItemCount());
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testMaximumItemCountNegativeRejected() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.setMaximumItemCount(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
    }

    @Test
    public void testMaximumItemAgeZeroRemovesOlderPeriods() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), 1.0);
        s.add(new Day(2, 1, 2020), 2.0);
        s.setMaximumItemAge(0);
        assertEquals(1, s.getItemCount());
        assertEquals(2.0, s.getValue(0).doubleValue(), 1e-9);
    }

    @Test
    public void testMaximumItemAgeNegativeRejected() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.setMaximumItemAge(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testAddMaintainsPeriodOrderAndLookup() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(1, 1, 2020);
        Day second = new Day(2, 1, 2020);
        s.add(second, 2.0);
        s.add(first, 1.0);
        assertEquals(2, s.getItemCount());
        assertEquals(first, s.getTimePeriod(0));
        assertEquals(0, s.getIndex(first));
        assertEquals(1.0, s.getValue(first).doubleValue(), 1e-9);
    }

    @Test
    public void testAddRejectsDuplicatePeriod() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        s.add(day, 1.0);
        try {
            s.add(day, 2.0);
            fail("expected SeriesException");
        } catch (SeriesException expected) { }
        assertEquals(1, s.getItemCount());
        assertEquals(1.0, s.getValue(0).doubleValue(), 1e-9);
    }

    @Test
    public void testAddNullItemRejected() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.add((TimeSeriesDataItem) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testGetIndexMissingAndNull() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        s.add(day, 1.0);
        assertEquals(-2, s.getIndex(new Day(2, 1, 2020)));
        try {
            s.getIndex(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testNextPeriodAndPeriodCollection() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        s.add(day, 1.0);
        assertEquals(day.next(), s.getNextTimePeriod());
        assertEquals(Collections.singletonList(day), new java.util.ArrayList(s.getTimePeriods()));
    }

    @Test
    public void testUniquePeriodsFromOtherSeries() throws Exception {
        TimeSeries first = new TimeSeries("first");
        TimeSeries other = new TimeSeries("other");
        Day shared = new Day(1, 1, 2020);
        Day unique = new Day(2, 1, 2020);
        first.add(shared, 1.0);
        other.add(shared, 2.0);
        other.add(unique, 3.0);
        assertEquals(Collections.singletonList(unique),
                new java.util.ArrayList(first.getTimePeriodsUniqueToOtherSeries(other)));
    }

    @Test
    public void testUpdateByPeriodAndByIndex() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        s.add(day, 1.0);
        s.update(day, 2.0);
        assertEquals(2.0, s.getValue(0).doubleValue(), 1e-9);
        s.update(0, null);
        assertEquals(null, s.getValue(day));
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testAddOrUpdateReturnsOverwrittenAndChangesValue() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day day = new Day(1, 1, 2020);
        assertEquals(null, s.addOrUpdate(day, 1.0));
        TimeSeriesDataItem old = s.addOrUpdate(day, 2.0);
        assertEquals(1.0, old.getValue().doubleValue(), 1e-9);
        assertEquals(2.0, s.getValue(day).doubleValue(), 1e-9);
    }

    @Test
    public void testAddAndOrUpdateTracksOverwrittenValues() throws Exception {
        TimeSeries base = new TimeSeries("base");
        TimeSeries incoming = new TimeSeries("incoming");
        Day day = new Day(1, 1, 2020);
        base.add(day, 1.0);
        incoming.add(day, 2.0);
        incoming.add(new Day(2, 1, 2020), 3.0);
        TimeSeries overwritten = base.addAndOrUpdate(incoming);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(1.0, overwritten.getValue(day).doubleValue(), 1e-9);
        assertEquals(2, base.getItemCount());
        assertEquals(2.0, base.getValue(day).doubleValue(), 1e-9);
    }

    @Test
    public void testRemoveAgedItemsKeepsBoundaryAge() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), 1.0);
        s.add(new Day(3, 1, 2020), 3.0);
        s.setMaximumItemAge(2);
        assertEquals(2, s.getItemCount());
        s.setMaximumItemAge(1);
        assertEquals(1, s.getItemCount());
        assertEquals(3.0, s.getValue(0).doubleValue(), 1e-9);
    }

    @Test
    public void testDeleteByPeriodAndClear() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(1, 1, 2020);
        Day second = new Day(2, 1, 2020);
        s.add(first, 1.0);
        s.add(second, 2.0);
        s.delete(first);
        assertEquals(1, s.getItemCount());
        assertEquals(second, s.getTimePeriod(0));
        s.clear();
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testCreateCopyByIndex() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), 1.0);
        s.add(new Day(2, 1, 2020), 2.0);
        s.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = s.createCopy(1, 2);
        assertEquals(2, copy.getItemCount());
        assertEquals(2.0, copy.getValue(0).doubleValue(), 1e-9);
        assertEquals(3.0, copy.getValue(1).doubleValue(), 1e-9);
    }

    @Test
    public void testCreateCopyByPeriodBounds() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(1, 1, 2020);
        Day middle = new Day(2, 1, 2020);
        Day last = new Day(3, 1, 2020);
        s.add(first, 1.0);
        s.add(middle, 2.0);
        s.add(last, 3.0);
        TimeSeries copy = s.createCopy(middle, last);
        assertEquals(2, copy.getItemCount());
        assertEquals(middle, copy.getTimePeriod(0));
        assertEquals(last, copy.getTimePeriod(1));
    }

    @Test
    public void testCloneAndEquality() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(1, 1, 2020), 1.0);
        TimeSeries copy = (TimeSeries) s.clone();
        assertEquals(s, copy);
        assertEquals(s.hashCode(), copy.hashCode());
        copy.update(0, 2.0);
        assertFalse(s.equals(copy));
    }
}
