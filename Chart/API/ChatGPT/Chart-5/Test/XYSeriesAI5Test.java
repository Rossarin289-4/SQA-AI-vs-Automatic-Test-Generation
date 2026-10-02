package org.jfree.data.xy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class XYSeriesAI5Test {

    @Test
    public void testIndexOfAndAutoSort() {
        XYSeries series = new XYSeries("Series1", true, true);
        series.add(2.0, 20.0);
        series.add(1.0, 10.0);
        series.add(3.0, 30.0);

        assertEquals(0, series.indexOf(1.0));
        assertEquals(1, series.indexOf(2.0));
        assertEquals(2, series.indexOf(3.0));
        assertEquals(-1, series.indexOf(4.0));
    }

    @Test
    public void testToArrayWithNullY() {
        XYSeries series = new XYSeries("Series2");
        series.add(1.0, null);
        series.add(2.0, 5.0);

        double[][] array = series.toArray();
        assertNotNull(array);
        assertEquals(2, array.length);
        assertEquals(2, array[0].length);
        assertEquals(1.0, array[0][0], 0.0001);
        assertEquals(Double.NaN, array[1][0], 0.0001);
        assertEquals(2.0, array[0][1], 0.0001);
        assertEquals(5.0, array[1][1], 0.0001);
    }

    @Test
    public void testEqualsAndHashCode() {
        XYSeries s1 = new XYSeries("S");
        s1.add(1.0, 1.0);

        XYSeries s2 = new XYSeries("S");
        s2.add(1.0, 1.0);

        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());
    }
}
