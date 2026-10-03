package org.jfree.data.time.junit;

import junit.framework.TestCase;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;

public class Chart9ChatGPTTest extends TestCase {
    public void testCreateCopyForRangeBeforeFirstItemIsEmpty() throws Exception {
        TimeSeries s = new TimeSeries("S");
        s.add(new Day(10,1,2000), 1.0);
        TimeSeries c = s.createCopy(new Day(1,1,2000), new Day(2,1,2000));
        assertEquals(0, c.getItemCount());
    }
}
