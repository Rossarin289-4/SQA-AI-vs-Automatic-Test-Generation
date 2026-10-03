package org.jfree.data.xy.junit;

import junit.framework.TestCase;
import org.jfree.data.xy.XYSeries;

public class Chart5GeminiTest extends TestCase {

    public Chart5GeminiTest(String name) {
        super(name);
    }

    public void testAddOrUpdateAllowDuplicateX() {
        XYSeries series = new XYSeries("Test", true, true);
        series.add(1.0, 10.0);
        series.add(3.0, 30.0);
        
        // Adding duplicate X value via addOrUpdate
        series.addOrUpdate(1.0, 15.0);
        
        assertEquals(3, series.getItemCount());
        assertEquals(15.0, series.getY(2).doubleValue(), 0.000001);
    }
}
