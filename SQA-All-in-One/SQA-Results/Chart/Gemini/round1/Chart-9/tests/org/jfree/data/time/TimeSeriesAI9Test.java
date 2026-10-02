package org.jfree.data.time;

import java.util.Collection;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link TimeSeries}.
 */
public class TimeSeriesAI9Test {

    @Test
    public void testAddAndGetValues() {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(2, 1, 2020), 20.0);
        series.add(new Day(3, 1, 2020), 30.0);

        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(10.0, series.getValue(0).doubleValue(), 1e-9);
        Assert.assertEquals(20.0, series.getValue(1).doubleValue(), 1e-9);
        Assert.assertEquals(30.0, series.getValue(2).doubleValue(), 1e-9);
        Assert.assertEquals(20.0, series.getValue(new Day(2, 1, 2020)).doubleValue(), 1e-9);
        Assert.assertNull(series.getValue(new Day(4, 1, 2020)));
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicatePeriodThrowsException() {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(1, 1, 2020), 20.0);
    }

    @Test(expected = SeriesException.class)
    public void testAddWrongPeriodClassThrowsException() {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        series.add(new Year(2020), 10.0);
    }

    @Test
    public void testAddOrUpdate() {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        TimeSeriesDataItem item1 = series.addOrUpdate(new Day(1, 1, 2020), 10.0);
        Assert.assertNull(item1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(10.0, series.getValue(0).doubleValue(), 1e-9);

        TimeSeriesDataItem overwritten = series.addOrUpdate(new Day(1, 1, 2020), 25.0);
        Assert.assertNotNull(overwritten);
        Assert.assertEquals(10.0, overwritten.getValue().doubleValue(), 1e-9);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(25.0, series.getValue(0).doubleValue(), 1e-9);
    }

    @Test
    public void testMaximumItemCount() {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        series.setMaximumItemCount(2);

        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        Assert.assertEquals(2, series.getItemCount());

        series.add(new Day(3, 1, 2020), 3.0);
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
        Assert.assertEquals(new Day(3, 1, 2020), series.getTimePeriod(1));

        series.setMaximumItemCount(1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Day(3, 1, 2020), series.getTimePeriod(0));
    }

    @Test
    public void testMaximumItemAge() {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        series.setMaximumItemAge(2);

        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        Assert.assertEquals(3, series.getItemCount());

        series.add(new Day(5, 1, 2020), 5.0);
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(new Day(3, 1, 2020), series.getTimePeriod(0));
        Assert.assertEquals(new Day(5, 1, 2020), series.getTimePeriod(1));
    }

    @Test
    public void testDeleteAndClear() {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.add(new Day(4, 1, 2020), 4.0);

        series.delete(new Day(2, 1, 2020));
        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(-1, series.getIndex(new Day(2, 1, 2020)) >= 0 ? 0 : -1);

        series.delete(0, 1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Day(4, 1, 2020), series.getTimePeriod(0));

        series.clear();
        Assert.assertEquals(0, series.getItemCount());
    }

    @Test
    public void testCreateCopyByIndex() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);

        TimeSeries copy = series.createCopy(1, 2);
        Assert.assertEquals(2, copy.getItemCount());
        Assert.assertEquals(new Day(2, 1, 2020), copy.getTimePeriod(0));
        Assert.assertEquals(new Day(3, 1, 2020), copy.getTimePeriod(1));
    }

    @Test
    public void testCreateCopyByPeriod() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(4, 1, 2020), 4.0);
        series.add(new Day(6, 1, 2020), 6.0);

        TimeSeries copy = series.createCopy(new Day(3, 1, 2020), new Day(5, 1, 2020));
        Assert.assertEquals(1, copy.getItemCount());
        Assert.assertEquals(new Day(4, 1, 2020), copy.getTimePeriod(0));

        TimeSeries emptyCopy = series.createCopy(new Day(7, 1, 2020), new Day(8, 1, 2020));
        Assert.assertEquals(0, emptyCopy.getItemCount());
    }

    @Test
    public void testEqualsAndHashCode() throws CloneNotSupportedException {
        TimeSeries s1 = new TimeSeries("Series", "Domain", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Series", "Domain", "Range", Day.class);

        Assert.assertTrue(s1.equals(s2));
        Assert.assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(1, 1, 2020), 10.0);
        Assert.assertFalse(s1.equals(s2));

        s2.add(new Day(1, 1, 2020), 10.0);
        Assert.assertTrue(s1.equals(s2));
        Assert.assertEquals(s1.hashCode(), s2.hashCode());

        TimeSeries s3 = (TimeSeries) s1.clone();
        Assert.assertTrue(s1.equals(s3));
        Assert.assertEquals(s1.hashCode(), s3.hashCode());
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries s1 = new TimeSeries("Series 1", Day.class);
        s1.add(new Day(1, 1, 2020), 1.0);
        s1.add(new Day(2, 1, 2020), 2.0);

        TimeSeries s2 = new TimeSeries("Series 2", Day.class);
        s2.add(new Day(2, 1, 2020), 2.0);
        s2.add(new Day(3, 1, 2020), 3.0);
        s2.add(new Day(4, 1, 2020), 4.0);

        Collection unique = s1.getTimePeriodsUniqueToOtherSeries(s2);
        Assert.assertEquals(2, unique.size());
        Assert.assertTrue(unique.contains(new Day(3, 1, 2020)));
        Assert.assertTrue(unique.contains(new Day(4, 1, 2020)));
    }

    @Test
    public void testEventNotification() {
        TimeSeries series = new TimeSeries("Series A", Day.class);
        final int[] changeEventCount = new int[1];
        series.addChangeListener(new SeriesChangeListener() {
            public void seriesChanged(SeriesChangeEvent event) {
                changeEventCount[0]++;
            }
        });

        series.add(new Day(1, 1, 2020), 10.0, true);
        Assert.assertEquals(1, changeEventCount[0]);

        series.add(new Day(2, 1, 2020), 20.0, false);
        Assert.assertEquals(1, changeEventCount[0]);

        series.update(new Day(1, 1, 2020), 15.0);
        Assert.assertEquals(2, changeEventCount[0]);

        series.delete(new Day(1, 1, 2020));
        Assert.assertEquals(3, changeEventCount[0]);
    }
}
