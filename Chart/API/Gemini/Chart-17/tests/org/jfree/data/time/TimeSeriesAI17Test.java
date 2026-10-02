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
public class TimeSeriesAI17Test {

    @Test
    public void testConstructorsAndDefaults() {
        TimeSeries series1 = new TimeSeries("Series 1");
        Assert.assertEquals("Series 1", series1.getKey());
        Assert.assertEquals("Time", series1.getDomainDescription());
        Assert.assertEquals("Value", series1.getRangeDescription());
        Assert.assertEquals(Day.class, series1.getTimePeriodClass());
        Assert.assertEquals(0, series1.getItemCount());
        Assert.assertEquals(Integer.MAX_VALUE, series1.getMaximumItemCount());
        Assert.assertEquals(Long.MAX_VALUE, series1.getMaximumItemAge());

        TimeSeries series2 = new TimeSeries("Series 2", Year.class);
        Assert.assertEquals(Year.class, series2.getTimePeriodClass());

        TimeSeries series3 = new TimeSeries("Series 3", "D", "R", Year.class);
        Assert.assertEquals("D", series3.getDomainDescription());
        Assert.assertEquals("R", series3.getRangeDescription());
        Assert.assertEquals(Year.class, series3.getTimePeriodClass());
    }

    @Test
    public void testAddAndGetValues() {
        TimeSeries series = new TimeSeries("Series", Year.class);
        Year y2001 = new Year(2001);
        Year y2002 = new Year(2002);
        Year y2003 = new Year(2003);

        series.add(y2002, 20.0);
        series.add(y2001, 10.0);
        series.add(y2003, 30.0);

        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(y2001, series.getTimePeriod(0));
        Assert.assertEquals(y2002, series.getTimePeriod(1));
        Assert.assertEquals(y2003, series.getTimePeriod(2));

        Assert.assertEquals(new Double(10.0), series.getValue(0));
        Assert.assertEquals(new Double(20.0), series.getValue(y2002));
        Assert.assertNull(series.getValue(new Year(2004)));

        Assert.assertEquals(new Year(2004), series.getNextTimePeriod());
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicatePeriodThrowsException() {
        TimeSeries series = new TimeSeries("Series", Year.class);
        series.add(new Year(2000), 100.0);
        series.add(new Year(2000), 200.0);
    }

    @Test(expected = SeriesException.class)
    public void testAddWrongPeriodClassThrowsException() {
        TimeSeries series = new TimeSeries("Series", Year.class);
        series.add(new Day(1, 1, 2000), 100.0);
    }

    @Test
    public void testAddOrUpdate() {
        TimeSeries series = new TimeSeries("Series", Year.class);
        Year y2000 = new Year(2000);
        Year y2001 = new Year(2001);

        TimeSeriesDataItem item1 = series.addOrUpdate(y2000, 10.0);
        Assert.assertNull(item1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Double(10.0), series.getValue(y2000));

        TimeSeriesDataItem item2 = series.addOrUpdate(y2000, 15.0);
        Assert.assertNotNull(item2);
        Assert.assertEquals(new Double(10.0), item2.getValue());
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Double(15.0), series.getValue(y2000));

        series.addOrUpdate(y2001, 20.0);
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(new Double(20.0), series.getValue(y2001));
    }

    @Test
    public void testAddAndOrUpdate() {
        TimeSeries s1 = new TimeSeries("S1", Year.class);
        s1.add(new Year(2000), 10.0);
        s1.add(new Year(2001), 20.0);

        TimeSeries s2 = new TimeSeries("S2", Year.class);
        s2.add(new Year(2001), 200.0);
        s2.add(new Year(2002), 300.0);

        TimeSeries overwritten = s1.addAndOrUpdate(s2);
        Assert.assertEquals(3, s1.getItemCount());
        Assert.assertEquals(new Double(10.0), s1.getValue(new Year(2000)));
        Assert.assertEquals(new Double(200.0), s1.getValue(new Year(2001)));
        Assert.assertEquals(new Double(300.0), s1.getValue(new Year(2002)));

        Assert.assertEquals(1, overwritten.getItemCount());
        Assert.assertEquals(new Double(20.0), overwritten.getValue(new Year(2001)));
    }

    @Test
    public void testUpdateExistingAndNonExisting() {
        TimeSeries series = new TimeSeries("Series", Year.class);
        series.add(new Year(2000), 10.0);
        series.update(0, 15.0);
        Assert.assertEquals(new Double(15.0), series.getValue(0));

        series.update(new Year(2000), 20.0);
        Assert.assertEquals(new Double(20.0), series.getValue(new Year(2000)));

        try {
            series.update(new Year(2001), 30.0);
            Assert.fail("Expected SeriesException when updating non-existent period");
        }
        catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testMaximumItemCount() {
        TimeSeries series = new TimeSeries("Series", Year.class);
        series.setMaximumItemCount(2);

        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        Assert.assertEquals(2, series.getItemCount());

        series.add(new Year(2002), 3.0);
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(new Year(2001), series.getTimePeriod(0));
        Assert.assertEquals(new Year(2002), series.getTimePeriod(1));

        series.setMaximumItemCount(1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Year(2002), series.getTimePeriod(0));
    }

    @Test
    public void testMaximumItemAge() {
        TimeSeries series = new TimeSeries("Series", Year.class);
        series.setMaximumItemAge(2);

        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        Assert.assertEquals(3, series.getItemCount());

        series.add(new Year(2003), 4.0);
        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(new Year(2001), series.getTimePeriod(0));
        Assert.assertEquals(new Year(2002), series.getTimePeriod(1));
        Assert.assertEquals(new Year(2003), series.getTimePeriod(2));
    }

    @Test
    public void testDeleteAndClear() {
        TimeSeries series = new TimeSeries("Series", Year.class);
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.add(new Year(2003), 4.0);

        series.delete(new Year(2001));
        Assert.assertEquals(3, series.getItemCount());
        Assert.assertNull(series.getValue(new Year(2001)));

        series.delete(0, 1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Year(2003), series.getTimePeriod(0));

        series.clear();
        Assert.assertEquals(0, series.getItemCount());
    }

    @Test
    public void testCreateCopyAndClone() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Series", Year.class);
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);

        TimeSeries clone = (TimeSeries) series.clone();
        Assert.assertEquals(series, clone);
        Assert.assertEquals(series.hashCode(), clone.hashCode());

        clone.update(0, 99.0);
        Assert.assertFalse(series.equals(clone));
        Assert.assertEquals(new Double(1.0), series.getValue(0));
        Assert.assertEquals(new Double(99.0), clone.getValue(0));

        TimeSeries copyIndices = series.createCopy(1, 2);
        Assert.assertEquals(2, copyIndices.getItemCount());
        Assert.assertEquals(new Year(2001), copyIndices.getTimePeriod(0));
        Assert.assertEquals(new Year(2002), copyIndices.getTimePeriod(1));

        TimeSeries copyPeriods = series.createCopy(new Year(2000), new Year(2001));
        Assert.assertEquals(2, copyPeriods.getItemCount());
        Assert.assertEquals(new Year(2000), copyPeriods.getTimePeriod(0));
        Assert.assertEquals(new Year(2001), copyPeriods.getTimePeriod(1));

        TimeSeries emptyCopy = series.createCopy(new Year(1990), new Year(1995));
        Assert.assertEquals(0, emptyCopy.getItemCount());
    }

    @Test
    public void testTimePeriodsCollectionsAndListeners() {
        TimeSeries series1 = new TimeSeries("S1", Year.class);
        series1.add(new Year(2000), 1.0);
        series1.add(new Year(2001), 2.0);

        TimeSeries series2 = new TimeSeries("S2", Year.class);
        series2.add(new Year(2001), 2.0);
        series2.add(new Year(2002), 3.0);

        Collection periods = series1.getTimePeriods();
        Assert.assertEquals(2, periods.size());
        Assert.assertTrue(periods.contains(new Year(2000)));
        Assert.assertTrue(periods.contains(new Year(2001)));

        Collection unique = series1.getTimePeriodsUniqueToOtherSeries(series2);
        Assert.assertEquals(1, unique.size());
        Assert.assertTrue(unique.contains(new Year(2002)));

        final boolean[] notified = new boolean[] { false };
        series1.addChangeListener(new SeriesChangeListener() {
            public void seriesChanged(SeriesChangeEvent event) {
                notified[0] = true;
            }
        });

        series1.add(new Year(2005), 5.0, true);
        Assert.assertTrue(notified[0]);
    }
}
