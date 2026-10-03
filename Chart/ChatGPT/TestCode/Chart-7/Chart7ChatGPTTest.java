package org.jfree.data.time.junit;

import java.util.Date;
import junit.framework.TestCase;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriodValues;

public class Chart7ChatGPTTest extends TestCase {
    public void testMaximumMiddleIndexTracksLatestMiddle() {
        TimePeriodValues v = new TimePeriodValues("S");
        v.add(new SimpleTimePeriod(new Date(0), new Date(100)), 1.0);
        v.add(new SimpleTimePeriod(new Date(1000), new Date(1200)), 2.0);
        assertEquals(1, v.getMaxMiddleIndex());
    }
}
