package org.jfree.data.time.junit;

import junit.framework.TestCase;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;

public class Chart17ChatGPTTest extends TestCase {
    public void testClonePreservesEmptySeriesMetadata() throws Exception {
        TimeSeries s = new TimeSeries("S");
        s.setMaximumItemCount(7);
        TimeSeries c = (TimeSeries) s.clone();
        assertEquals(0, c.getItemCount());
        assertEquals(7, c.getMaximumItemCount());
        c.add(new Day(1,1,2000), 1.0);
        assertEquals(0, s.getItemCount());
    }
}
