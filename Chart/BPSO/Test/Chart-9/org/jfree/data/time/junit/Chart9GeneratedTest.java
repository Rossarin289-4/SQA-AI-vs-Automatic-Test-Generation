package org.jfree.data.time.junit;
import junit.framework.TestCase;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
public class Chart9GeneratedTest extends TestCase {
    public void testCreateCopyForDisjointPeriodRangeIsEmpty() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("S");
        series.add(new Day(1, 1, 2007), 1.0);
        series.add(new Day(2, 1, 2007), 2.0);
        TimeSeries copy = series.createCopy(new Day(10, 1, 2007), new Day(11, 1, 2007));
        assertEquals(0, copy.getItemCount());
    }
}
