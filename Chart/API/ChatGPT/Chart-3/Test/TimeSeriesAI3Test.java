package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimeSeriesAI3Test {

    @Test
    public void testEqualsAndHashCode() {
        TimeSeries series1 = new TimeSeries("Series 1");
        TimeSeries series2 = new TimeSeries("Series 1");

        assertTrue(series1.equals(series2));
        assertEquals(series1.hashCode(), series2.hashCode());

        series1.add(new Year(2020), 100.0);
        assertFalse(series1.equals(series2));

        series2.add(new Year(2020), 100.0);
        assertTrue(series1.equals(series2));
        assertEquals(series1.hashCode(), series2.hashCode());
    }

    @Test
    public void testCreateCopyRange() {
        TimeSeries series = new TimeSeries("Series");
        series.add(new Year(2010), 10.0);
        series.add(new Year(2011), 20.0);
        series.add(new Year(2012), 30.0);

        TimeSeries copy = series.createCopy(new Year(2011), new Year(2012));
        assertEquals(2, copy.getItemCount());
        assertEquals(new Year(2011), copy.getTimePeriod(0));
        assertEquals(new Year(2012), copy.getTimePeriod(1));
    }

    @Test
    public void testEmptyCreateCopyRange() {
        TimeSeries series = new TimeSeries("Series");
        series.add(new Year(2010), 10.0);

        TimeSeries copy = series.createCopy(new Year(2015), new Year(2016));
        assertEquals(0, copy.getItemCount());
    }
}
