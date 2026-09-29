package org.jfree.data.time.junit;

import junit.framework.TestCase;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;

public class Chart3GeminiTest extends TestCase {

    public Chart3GeminiTest(String name) {
        super(name);
    }

    public void testCreateCopyMinMaxY() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test Series");
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);

        series.add(d1, 10.0);
        series.add(d2, 100.0);

        // Copy only the first item (index 0 to 0)
        TimeSeries copy = series.createCopy(0, 0);

        assertEquals(1, copy.getItemCount());
        assertEquals(10.0, copy.getMinY(), 0.000001);
        assertEquals(10.0, copy.getMaxY(), 0.000001);
    }
}
