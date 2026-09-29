package org.jfree.data.time.junit;
import junit.framework.TestCase;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Year;
public class Chart7GeneratedTest extends TestCase {
    public void testMaxMiddleIndexUsesLatestPeriod() {
        TimePeriodValues values = new TimePeriodValues("S");
        values.add(new TimePeriodValue(new Year(2000), 1.0));
        values.add(new TimePeriodValue(new Year(2002), 2.0));
        assertEquals(1, values.getMaxMiddleIndex());
    }
}
