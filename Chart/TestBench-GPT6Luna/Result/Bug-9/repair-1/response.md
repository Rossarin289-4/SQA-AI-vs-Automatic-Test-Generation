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
import java.util.List;
import java.util.TimeZone;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.data.general.Series;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesException;

public class TimeSeriesTest {
    @Test
    public void testDefaultConstructionAndDescriptions() throws Exception {
        TimeSeries s = new TimeSeries("series");
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
        assertEquals(Day.class, s.getTimePeriodClass());
        assertEquals(0, s.getItemCount());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testSetDescriptionsIncludingNull() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.setDomainDescription(null);
        s.setRangeDescription("R");
        assertEquals(null, s.getDomainDescription());
        assertEquals("R", s.getRangeDescription());
    }

    @Test
    public void testMaximumItemCountZeroRemovesEveryAddedItem() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.setMaximumItemCount(0);
        assertEquals(0, s.getMaximumItemCount());
        s.add(new Day(new Date(0)), 2.0);
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testMaximumItemCountTrimsOldestAndRejectsNegative() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(new Date(0)), 1.0);
        s.add(new Day(new Date(86400000L)), 2.0);
        s.add(new Day(new Date(172800000L)), 3.0);
        s.setMaximumItemCount(2);
        assertEquals(2, s.getItemCount());
        assertEquals(new Day(new Date(86400000L)), s.getTimePeriod(0));
        try {
            s.setMaximumItemCount(-1);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(2, s.getMaximumItemCount());
    }

    @Test
    public void testMaximumAgeZeroKeepsOnlyNewestOnAddition() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.setMaximumItemAge(0);
        s.add(new Day(new Date(0)), 1.0);
        s.add(new Day(new Date(86400000L)), 2.0);
        assertEquals(1, s.getItemCount());
        assertEquals(new Day(new Date(86400000L)), s.getTimePeriod(0));
    }

    @Test
    public void testMaximumAgeRejectsNegativeAndAcceptsLongMaximum() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.setMaximumItemAge(-1);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        s.setMaximumItemAge(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testAddMaintainsSortedOrderAndGetsByPeriod() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day later = new Day(new Date(172800000L));
        Day earlier = new Day(new Date(0));
        Day middle = new Day(new Date(86400000L));
        s.add(later, 3.0);
        s.add(earlier, 1.0);
        s.add(middle, 2.0);
        assertEquals(3, s.getItemCount());
        assertEquals(earlier, s.getTimePeriod(0));
        assertEquals(middle, s.getTimePeriod(1));
        assertEquals(later, s.getTimePeriod(2));
        assertEquals(Double.valueOf(2.0), s.getValue(middle));
    }

    @Test
    public void testAddRejectsNullAndDuplicate() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.add((TimeSeriesDataItem) null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        s.add(new Day(new Date(0)), 1.0);
        try {
            s.add(new Day(new Date(0)), 2.0);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) { }
        assertEquals(1, s.getItemCount());
        assertEquals(Double.valueOf(1.0), s.getValue(0));
    }

    @Test
    public void testItemsAndTimePeriodsContainAddedPeriod() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day d = new Day(new Date(0));
        s.add(d, 4.0);
        List items = s.getItems();
        Collection periods = s.getTimePeriods();
        assertEquals(1, items.size());
        assertEquals(1, periods.size());
        assertEquals(d, periods.iterator().next());
        assertEquals(d, s.getDataItem(0).getPeriod());
        assertEquals(d, s.getTimePeriod(0));
    }

    @Test
    public void testIndexAndLookupsForPresentAndAbsentPeriods() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day present = new Day(new Date(86400000L));
        Day absent = new Day(new Date(172800000L));
        s.add(present, 5.0);
        assertEquals(0, s.getIndex(present));
        assertEquals(-2, s.getIndex(absent));
        assertEquals(Double.valueOf(5.0), s.getValue(present));
        assertEquals(null, s.getValue(absent));
        assertEquals(null, s.getDataItem(absent));
    }

    @Test
    public void testIndexRejectsNull() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.getIndex(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(0, s.getItemCount());
        }
    }

    @Test
    public void testNextPeriodFollowsLastItem() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day d = new Day(new Date(0));
        s.add(d, 1.0);
        assertEquals(d.next(), s.getNextTimePeriod());
    }

    @Test
    public void testUniquePeriodsFromOtherSeries() throws Exception {
        TimeSeries base = new TimeSeries("base");
        TimeSeries other = new TimeSeries("other");
        Day shared = new Day(new Date(0));
        Day unique = new Day(new Date(86400000L));
        base.add(shared, 1.0);
        other.add(shared, 2.0);
        other.add(unique, 3.0);
        Collection result = base.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(1, result.size());
        assertEquals(unique, result.iterator().next());
    }

    @Test
    public void testUpdateByPeriodAndIndex() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day d = new Day(new Date(0));
        s.add(d, 1.0);
        s.update(d, 2.0);
        assertEquals(Double.valueOf(2.0), s.getValue(0));
        s.update(0, null);
        assertEquals(null, s.getValue(d));
    }

    @Test
    public void testUpdateMissingPeriodThrows() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.update(new Day(new Date(0)), 2.0);
            fail("expected SeriesException");
        }
        catch (SeriesException expected) {
            assertEquals(0, s.getItemCount());
        }
    }

    @Test
    public void testAddOrUpdateReturnsOldValueAndAddsNewPeriod() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(new Date(0));
        Day second = new Day(new Date(86400000L));
        assertEquals(null, s.addOrUpdate(first, 1.0));
        TimeSeriesDataItem old = s.addOrUpdate(first, 2.0);
        assertEquals(Double.valueOf(1.0), old.getValue());
        assertEquals(Double.valueOf(2.0), s.getValue(first));
        assertEquals(null, s.addOrUpdate(second, 3.0));
        assertEquals(2, s.getItemCount());
    }

    @Test
    public void testAddOrUpdateRejectsNullPeriod() throws Exception {
        TimeSeries s = new TimeSeries("s");
        try {
            s.addOrUpdate(null, 1.0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(0, s.getItemCount());
        }
    }

    @Test
    public void testAgingUsesInclusiveMaximumAgeBoundary() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(new Date(0));
        Day second = new Day(new Date(86400000L));
        s.add(first, 1.0);
        s.add(second, 2.0);
        s.setMaximumItemAge(second.getSerialIndex() - first.getSerialIndex());
        assertEquals(2, s.getItemCount());
        s.setMaximumItemAge(0);
        assertEquals(1, s.getItemCount());
        assertEquals(second, s.getTimePeriod(0));
    }

    @Test
    public void testRemoveAgedItemsAgainstLatestSerialIndex() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(new Date(0));
        Day second = new Day(new Date(86400000L));
        s.add(first, 1.0);
        s.add(second, 2.0);
        s.setMaximumItemAge(1);
        s.removeAgedItems(false);
        assertEquals(2, s.getItemCount());
    }

    @Test
    public void testDeleteByPeriodAndClear() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(new Date(0));
        Day second = new Day(new Date(86400000L));
        s.add(first, 1.0);
        s.add(second, 2.0);
        s.delete(first);
        assertEquals(1, s.getItemCount());
        assertEquals(second, s.getTimePeriod(0));
        s.clear();
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testDeleteRangeRejectsReversedRange() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(new Date(0)), 1.0);
        try {
            s.delete(1, 0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(1, s.getItemCount());
        }
    }

    @Test
    public void testCreateCopyByIndicesAndPeriods() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day first = new Day(new Date(0));
        Day second = new Day(new Date(86400000L));
        Day third = new Day(new Date(172800000L));
        s.add(first, 1.0);
        s.add(second, 2.0);
        s.add(third, 3.0);
        TimeSeries indexCopy = s.createCopy(1, 2);
        assertEquals(2, indexCopy.getItemCount());
        assertEquals(second, indexCopy.getTimePeriod(0));
        TimeSeries periodCopy = s.createCopy(first, second);
        assertEquals(2, periodCopy.getItemCount());
        assertEquals(Double.valueOf(2.0), periodCopy.getValue(second));
    }

    @Test
    public void testCreateCopyEmptyRangeAndInvalidStart() throws Exception {
        TimeSeries s = new TimeSeries("s");
        s.add(new Day(new Date(0)), 1.0);
        TimeSeries empty = s.createCopy(new Day(new Date(86400000L)),
                new Day(new Date(172800000L)));
        assertEquals(0, empty.getItemCount());
        try {
            s.createCopy(-1, 0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(1, s.getItemCount());
        }
    }

    @Test
    public void testCloneAndEqualsReflectIndependentContents() throws Exception {
        TimeSeries s = new TimeSeries("s");
        Day d = new Day(new Date(0));
        s.add(d, 1.0);
        TimeSeries copy = (TimeSeries) s.clone();
        assertEquals(s, copy);
        copy.update(0, 2.0);
        assertFalse(s.equals(copy));
        assertEquals(Double.valueOf(1.0), s.getValue(0));
    }

    @Test
    public void testEqualsTracksMaximumItemSettings() throws Exception {
        TimeSeries left = new TimeSeries("s");
        TimeSeries right = new TimeSeries("s");
        assertEquals(left, right);
        right.setMaximumItemCount(Integer.MAX_VALUE - 1);
        assertFalse(left.equals(right));
    }

    @Test
    public void testHashCodeStableForEqualEmptySeries() throws Exception {
        TimeSeries left = new TimeSeries("s");
        TimeSeries right = new TimeSeries("s");
        assertEquals(left, right);
        assertEquals(left.hashCode(), right.hashCode());
    }
}
```