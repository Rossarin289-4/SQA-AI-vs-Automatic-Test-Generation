package org.jfree.data.time;

import org.jfree.data.general.SeriesException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class TimeSeriesAI3Test {

    @Test
    public void testAddAndGetValues() {
        TimeSeries series = new TimeSeries("Series A", "Domain Description", "Range Description");
        Assert.assertEquals("Domain Description", series.getDomainDescription());
        Assert.assertEquals("Range Description", series.getRangeDescription());
        Assert.assertEquals(0, series.getItemCount());
        Assert.assertTrue(Double.isNaN(series.getMinY()));
        Assert.assertTrue(Double.isNaN(series.getMaxY()));

        series.add(new Year(2001), 100.0);
        series.add(new Year(2002), 200.0);
        series.add(new Year(2003), 50.0);

        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(Year.class, series.getTimePeriodClass());
        Assert.assertEquals(100.0, series.getValue(0).doubleValue(), 1e-9);
        Assert.assertEquals(200.0, series.getValue(new Year(2002)).doubleValue(), 1e-9);
        Assert.assertEquals(50.0, series.getMinY(), 1e-9);
        Assert.assertEquals(200.0, series.getMaxY(), 1e-9);
        Assert.assertEquals(new Year(2004), series.getNextTimePeriod());
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicatePeriodThrowsException() {
        TimeSeries series = new TimeSeries("Series");
        series.add(new Year(2001), 10.0);
        series.add(new Year(2001), 20.0);
    }

    @Test(expected = SeriesException.class)
    public void testAddDifferentTimePeriodClassThrowsException() {
        TimeSeries series = new TimeSeries("Series");
        series.add(new Year(2001), 10.0);
        series.add(new Month(1, 2002), 20.0);
    }

    @Test
    public void testMaximumItemCountEnforced() {
        TimeSeries series = new TimeSeries("Series");
        series.setMaximumItemCount(2);

        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2003), 30.0);

        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(new Year(2002), series.getTimePeriod(0));
        Assert.assertEquals(new Year(2003), series.getTimePeriod(1));
        Assert.assertEquals(20.0, series.getMinY(), 1e-9);
        Assert.assertEquals(30.0, series.getMaxY(), 1e-9);

        series.setMaximumItemCount(1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Year(2003), series.getTimePeriod(0));
    }

    @Test
    public void testMaximumItemAgeAging() {
        TimeSeries series = new TimeSeries("Series");
        series.setMaximumItemAge(2);

        series.add(new Year(2000), 10.0);
        series.add(new Year(2001), 20.0);
        series.add(new Year(2002), 30.0);
        Assert.assertEquals(3, series.getItemCount());

        series.add(new Year(2003), 40.0);
        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(new Year(2001), series.getTimePeriod(0));
        Assert.assertEquals(new Year(2003), series.getTimePeriod(2));
    }

    @Test
    public void testUpdateAndMinMaxRecalculation() {
        TimeSeries series = new TimeSeries("Series");
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2003), 30.0);

        series.update(new Year(2001), 15.0);
        Assert.assertEquals(15.0, series.getValue(new Year(2001)).doubleValue(), 1e-9);
        Assert.assertEquals(15.0, series.getMinY(), 1e-9);
        Assert.assertEquals(30.0, series.getMaxY(), 1e-9);

        series.update(2, 5.0);
        Assert.assertEquals(5.0, series.getValue(2).doubleValue(), 1e-9);
        Assert.assertEquals(5.0, series.getMinY(), 1e-9);
        Assert.assertEquals(20.0, series.getMaxY(), 1e-9);
    }

    @Test
    public void testAddOrUpdate() {
        TimeSeries series = new TimeSeries("Series");
        TimeSeriesDataItem item1 = series.addOrUpdate(new Year(2001), 10.0);
        Assert.assertNull(item1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(10.0, series.getValue(0).doubleValue(), 1e-9);

        TimeSeriesDataItem item2 = series.addOrUpdate(new Year(2001), 25.0);
        Assert.assertNotNull(item2);
        Assert.assertEquals(10.0, item2.getValue().doubleValue(), 1e-9);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(25.0, series.getValue(0).doubleValue(), 1e-9);
    }

    @Test
    public void testDeleteAndClear() {
        TimeSeries series = new TimeSeries("Series");
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2003), 30.0);
        series.add(new Year(2004), 40.0);

        series.delete(new Year(2002));
        Assert.assertEquals(3, series.getItemCount());
        Assert.assertNull(series.getValue(new Year(2002)));

        series.delete(0, 1);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(new Year(2004), series.getTimePeriod(0));
        Assert.assertEquals(40.0, series.getMinY(), 1e-9);
        Assert.assertEquals(40.0, series.getMaxY(), 1e-9);

        series.clear();
        Assert.assertEquals(0, series.getItemCount());
        Assert.assertNull(series.getTimePeriodClass());
        Assert.assertTrue(Double.isNaN(series.getMinY()));
        Assert.assertTrue(Double.isNaN(series.getMaxY()));
    }

    @Test
    public void testCloneAndEquals() throws CloneNotSupportedException {
        TimeSeries series1 = new TimeSeries("Series 1", "Domain", "Range");
        series1.add(new Year(2001), 100.0);
        series1.add(new Year(2002), 200.0);

        TimeSeries series2 = (TimeSeries) series1.clone();
        Assert.assertEquals(series1, series2);
        Assert.assertEquals(series1.hashCode(), series2.hashCode());

        series2.add(new Year(2003), 300.0);
        Assert.assertFalse(series1.equals(series2));
        Assert.assertEquals(2, series1.getItemCount());
        Assert.assertEquals(3, series2.getItemCount());
    }

    @Test
    public void testCreateCopy() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Original");
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2003), 30.0);
        series.add(new Year(2004), 40.0);

        TimeSeries copyRange = series.createCopy(new Year(2002), new Year(2003));
        Assert.assertEquals(2, copyRange.getItemCount());
        Assert.assertEquals(new Year(2002), copyRange.getTimePeriod(0));
        Assert.assertEquals(new Year(2003), copyRange.getTimePeriod(1));

        TimeSeries copyEmpty = series.createCopy(new Year(1990), new Year(1995));
        Assert.assertEquals(0, copyEmpty.getItemCount());

        TimeSeries copyIndices = series.createCopy(1, 2);
        Assert.assertEquals(2, copyIndices.getItemCount());
        Assert.assertEquals(new Year(2002), copyIndices.getTimePeriod(0));
        Assert.assertEquals(new Year(2003), copyIndices.getTimePeriod(1));
    }

    @Test
    public void testTimePeriodsUniqueToOtherSeries() {
        TimeSeries series1 = new TimeSeries("Series 1");
        series1.add(new Year(2001), 10.0);
        series1.add(new Year(2002), 20.0);

        TimeSeries series2 = new TimeSeries("Series 2");
        series2.add(new Year(2002), 20.0);
        series2.add(new Year(2003), 30.0);
        series2.add(new Year(2004), 40.0);

        Collection unique = series1.getTimePeriodsUniqueToOtherSeries(series2);
        Assert.assertEquals(2, unique.size());
        Assert.assertTrue(unique.contains(new Year(2003)));
        Assert.assertTrue(unique.contains(new Year(2004)));
        Assert.assertFalse(unique.contains(new Year(2002)));
    }
}
