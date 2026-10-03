package org.jfree.data.time.junit;

import junit.framework.TestCase;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;

public class Chart9GeminiTest extends TestCase {

    public Chart9GeminiTest(String name) {
        super(name);
    }

    public void testCreateCopyEndBeforeStart() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(10, 1, 2020), 2.0);

        // Querying a period between existing dates where start > end in series index terms
        TimeSeries copy = series.createCopy(new Day(2, 1, 2020), new Day(5, 1, 2020));
        assertEquals(0, copy.getItemCount());
    }
}
