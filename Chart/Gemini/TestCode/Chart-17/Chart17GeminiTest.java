package org.jfree.data.time.junit;

import junit.framework.TestCase;
import org.jfree.data.time.TimeSeries;

public class Chart17GeminiTest extends TestCase {

    public Chart17GeminiTest(String name) {
        super(name);
    }

    public void testCloneEmptySeries() {
        TimeSeries series = new TimeSeries("Empty Series");
        try {
            TimeSeries clone = (TimeSeries) series.clone();
            assertNotNull(clone);
            assertEquals(0, clone.getItemCount());
            assertEquals(series.getKey(), clone.getKey());
        } catch (CloneNotSupportedException e) {
            fail("clone() threw CloneNotSupportedException");
        } catch (IllegalArgumentException e) {
            fail("clone() on empty series threw IllegalArgumentException: " + e.getMessage());
        }
    }
}
