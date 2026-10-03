package org.jfree.data.time.junit;

import junit.framework.TestCase;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriodValues;

public class Chart7GeminiTest extends TestCase {

    public Chart7GeminiTest(String name) {
        super(name);
    }

    public void testMaxMiddleIndexBounds() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        
        // Add items with different period lengths and positions
        tpv.add(new SimpleTimePeriod(100L, 200L), 10.0); // middle 150
        tpv.add(new SimpleTimePeriod(300L, 500L), 20.0); // middle 400 (max middle)
        tpv.add(new SimpleTimePeriod(0L, 50L), 30.0);    // middle 25 (min middle)

        assertEquals(1, tpv.getMaxMiddleIndex());
        assertEquals(2, tpv.getMinMiddleIndex());
    }
}
