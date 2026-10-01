package org.joda.time;

import static org.junit.Assert.assertEquals;
import java.util.GregorianCalendar;
import java.util.Calendar;
import org.junit.Test;

public class TestLocalDateTime12 {
    @Test
    public void testCalendarBCYearIsPreserved() {
        GregorianCalendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.YEAR, 1);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        LocalDate date = LocalDate.fromCalendarFields(cal);
        LocalDateTime dateTime = LocalDateTime.fromCalendarFields(cal);

        assertEquals(0, date.getYear());
        assertEquals(0, dateTime.getYear());
    }
}