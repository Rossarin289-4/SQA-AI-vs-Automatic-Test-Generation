package org.jfree.data.time.junit;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import junit.framework.TestCase;
import org.jfree.data.time.Week;

public class Chart8ChatGPTTest extends TestCase {
    public void testConstructorUsesSuppliedTimeZone() {
        TimeZone z = TimeZone.getTimeZone("Pacific/Kiritimati");
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        c.clear(); c.set(2007, Calendar.DECEMBER, 31, 12, 0, 0);
        Date d = c.getTime();
        Week expected = new Week(d, z, java.util.Locale.getDefault());
        Week actual = new Week(d, z);
        assertEquals(expected, actual);
    }
}
