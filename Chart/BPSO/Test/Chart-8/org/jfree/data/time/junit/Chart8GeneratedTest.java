package org.jfree.data.time.junit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import junit.framework.TestCase;
import org.jfree.data.time.Week;
public class Chart8GeneratedTest extends TestCase {
    public void testConstructorUsesSuppliedTimeZone() {
        TimeZone utc = TimeZone.getTimeZone("UTC");
        Calendar calendar = new GregorianCalendar(utc, Locale.US);
        calendar.set(2007, Calendar.AUGUST, 26, 23, 30, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date time = calendar.getTime();
        Week expected = new Week(time, utc, Locale.US);
        Week actual = new Week(time, utc);
        assertEquals(expected, actual);
    }
}
