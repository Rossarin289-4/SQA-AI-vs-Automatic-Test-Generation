package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimeSeriesAI17Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyIndexOutOfBounds() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyInvalidRange() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(5, 2);
    }

    @Test
    public void testCreateCopyValidRange() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test", Day.class);
        series.add(new Day(1, 1, 2020), 100.0);
        series.add(new Day(2, 1, 2020), 200.0);
        
        TimeSeries copy = series.createCopy(0, 1);
        assertNotNull(copy);
        assertEquals(2, copy.getItemCount());
        assertTrue(series.equals(copy));
    }
}
