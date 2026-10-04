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
    public void testDescriptionsAndPeriodClass() throws Exception {
        TimeSeries s = new TimeSeries("s", "domain", "range", Month.class);
        assertEquals("domain", s.getDomainDescription());
        assertEquals("range", s.getRangeDescription());
        assertEquals(Month.class, s.getTimePeriodClass());
        s.setDomainDescription(null);
        s.setRangeDescription("updated");
        assertNull(s.getDomainDescription());
        assertEquals("updated", s.getRangeDescription());
    }

    @Test
    public void testMaximumItemCountZeroAndNegativeBoundary() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 1);
        s.setMaximumItemCount(0);
        assertEquals(0, s.getItemCount());
        assertEquals(0, s.getMaximumItemCount());
        try {
            s.setMaximumItemCount(-1);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, s.getMaximumItemCount());
    }

    @Test
    public void testMaximumItemCountTrimsOldestEntries() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(2, 2020), 20);
        s.add(new Month(3, 2020), 30);
        s.setMaximumItemCount(2);
        assertEquals(2, s.getItemCount());
        assertEquals(new Month(2, 2020), s.getTimePeriod(0));
        assertEquals(new Month(3, 2020), s.getTimePeriod(1));
    }

    @Test
    public void testMaximumItemAgeZeroAndNegativeBoundary() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(2, 2020), 20);
        s.setMaximumItemAge(0);
        assertEquals(1, s.getItemCount());
        assertEquals(new Month(2, 2020), s.getTimePeriod(0));
        assertEquals(0L, s.getMaximumItemAge());
        try {
            s.setMaximumItemAge(-1);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0L, s.getMaximumItemAge());
    }

    @Test
    public void testAddInOrderAndGetItemValuesAndPeriods() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(3, 2020), 30);
        assertEquals(2, s.getItemCount());
        assertEquals(new Month(1, 2020), s.getDataItem(0).getPeriod());
        assertEquals(30.0, s.getValue(1).doubleValue(), 0.0);
        assertEquals(new Month(3, 2020), s.getTimePeriod(1));
    }

    @Test
    public void testAddOutOfOrderMaintainsSortedPeriods() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(3, 2020), 30);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(2, 2020), 20);
        assertEquals(new Month(1, 2020), s.getTimePeriod(0));
        assertEquals(new Month(2, 2020), s.getTimePeriod(1));
        assertEquals(new Month(3, 2020), s.getTimePeriod(2));
    }

    @Test
    public void testAddRejectsDuplicateAndWrongPeriodClass() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        try {
            s.add(new Month(1, 2020), 11);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) { }
        try {
            s.add(new Day(1, 1, 2020), 12);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) { }
        assertEquals(1, s.getItemCount());
        assertEquals(10.0, s.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testIndexAndPeriodLookupsAtFirstLastAndMissing() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(3, 2020), 30);
        assertEquals(0, s.getIndex(new Month(1, 2020)));
        assertEquals(1, s.getIndex(new Month(3, 2020)));
        assertEquals(-2, s.getIndex(new Month(2, 2020)));
        assertNull(s.getDataItem(new Month(2, 2020)));
        assertNull(s.getValue(new Month(2, 2020)));
    }

    @Test
    public void testIndexRejectsNullPeriod() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        try {
            s.getIndex(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testItemsAndTimePeriodsCollections() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(2, 2020), 20);
        List items = s.getItems();
        assertEquals(2, items.size());
        Collection periods = s.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(new Month(1, 2020)));
        assertTrue(periods.contains(new Month(2, 2020)));
        try {
            items.clear();
            fail("expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) { }
        assertEquals(2, s.getItemCount());
    }

    @Test
    public void testNextPeriodFollowsLastItem() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(12, 2020), 10);
        assertEquals(new Month(1, 2021), s.getNextTimePeriod());
    }

    @Test
    public void testUniquePeriodsAgainstOtherSeries() throws Exception {
        TimeSeries first = new TimeSeries("a", Month.class);
        TimeSeries other = new TimeSeries("b", Month.class);
        first.add(new Month(1, 2020), 10);
        first.add(new Month(3, 2020), 30);
        other.add(new Month(1, 2020), 100);
        other.add(new Month(2, 2020), 200);
        Collection unique = first.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(new Month(2, 2020)));
        assertFalse(unique.contains(new Month(1, 2020)));
    }

    @Test
    public void testUpdateByPeriodAndIndex() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(2, 2020), 20);
        s.update(new Month(1, 2020), 11);
        s.update(1, 22);
        assertEquals(11.0, s.getValue(0).doubleValue(), 0.0);
        assertEquals(22.0, s.getValue(1).doubleValue(), 0.0);
    }

    @Test
    public void testUpdateMissingPeriodThrows() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        try {
            s.update(new Month(1, 2020), 1);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) { }
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testAddOrUpdateReturnsOldValueAndAddsMissing() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        TimeSeriesDataItem old = s.addOrUpdate(new Month(1, 2020), 15.0);
        assertEquals(10.0, old.getValue().doubleValue(), 0.0);
        assertEquals(15.0, s.getValue(0).doubleValue(), 0.0);
        assertNull(s.addOrUpdate(new Month(2, 2020), 20.0));
        assertEquals(2, s.getItemCount());
        assertEquals(20.0, s.getValue(1).doubleValue(), 0.0);
    }

    @Test
    public void testRemoveAgedItemsAtExactAgeAndBeyond() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(2, 2020), 20);
        s.add(new Month(3, 2020), 30);
        s.setMaximumItemAge(1);
        assertEquals(2, s.getItemCount());
        assertEquals(new Month(2, 2020), s.getTimePeriod(0));
        assertEquals(new Month(3, 2020), s.getTimePeriod(1));
    }

    @Test
    public void testClearRemovesAllItems() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.clear();
        assertEquals(0, s.getItemCount());
        assertTrue(s.getItems().isEmpty());
    }

    @Test
    public void testDeleteByPeriodAndInclusiveIndexRange() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(2, 2020), 20);
        s.add(new Month(3, 2020), 30);
        s.delete(new Month(2, 2020));
        assertEquals(2, s.getItemCount());
        s.delete(0, 1);
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testDeleteRejectsReversedRange() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        try {
            s.delete(1, 0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testCreateCopyByIndexKeepsRequestedEndpoints() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(2, 2020), 20);
        s.add(new Month(3, 2020), 30);
        TimeSeries copy = s.createCopy(1, 2);
        assertEquals(2, copy.getItemCount());
        assertEquals(new Month(2, 2020), copy.getTimePeriod(0));
        assertEquals(30.0, copy.getValue(1).doubleValue(), 0.0);
    }

    @Test
    public void testCreateCopyByPeriodsIncludesInRangeItems() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        s.add(new Month(1, 2020), 10);
        s.add(new Month(3, 2020), 30);
        TimeSeries copy = s.createCopy(new Month(2, 2020), new Month(3, 2020));
        assertEquals(1, copy.getItemCount());
        assertEquals(new Month(3, 2020), copy.getTimePeriod(0));
    }

    @Test
    public void testCreateCopyRejectsInvalidBounds() throws Exception {
        TimeSeries s = new TimeSeries("s", Month.class);
        try {
            s.createCopy(-1, 0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        try {
            s.createCopy(1, 0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testEqualsAndHashCodeForEquivalentSeries() throws Exception {
        TimeSeries a = new TimeSeries("s", Month.class);
        TimeSeries b = new TimeSeries("s", Month.class);
        a.add(new Month(1, 2020), 10);
        b.add(new Month(1, 2020), 10);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        b.setMaximumItemCount(0);
        assertFalse(a.equals(b));
    }
}
