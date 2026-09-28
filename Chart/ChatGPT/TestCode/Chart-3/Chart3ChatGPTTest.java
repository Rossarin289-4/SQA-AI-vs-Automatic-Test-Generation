package org.jfree.data.time.junit;

import junit.framework.TestCase;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;

public class Chart3ChatGPTTest extends TestCase {
    public void testCreateCopyRecalculatesBounds() throws Exception {
        TimeSeries s = new TimeSeries("S");
        s.add(new Day(1, 1, 2000), -100.0);
        s.add(new Day(2, 1, 2000), 5.0);
        s.add(new Day(3, 1, 2000), 10.0);
        TimeSeries c = s.createCopy(1, 2);
        assertEquals(5.0, c.getMinY(), 0.0);
        assertEquals(10.0, c.getMaxY(), 0.0);
    }
}
