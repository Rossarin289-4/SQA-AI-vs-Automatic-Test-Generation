package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TimeSeriesAI9Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyIntBounds() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyRegularTimePeriodNull() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy((RegularTimePeriod) null, (RegularTimePeriod) null);
    }

    @Test
    public void testCreateCopyValidRange() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        series.add(day1, 100.0);
        series.add(day2, 200.0);

        TimeSeries copy = series.createCopy(day1, day2);
        assertNotNull(copy);
        assertEquals(2, copy.getItemCount());
        assertEquals(100.0, copy.getValue(0).doubleValue(), 0.001);
        assertEquals(200.0, copy.getValue(1).doubleValue(), 0.001);
    }
}
