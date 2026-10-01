package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMutableDateTimeTime3 {

    /**
     * Adding zero must be a no-op.
     *
     * In particular, add(DateTimeFieldType, 0) should not invoke the
     * underlying DateTimeField operation. The date-time must remain
     * unchanged after the zero addition.
     */
    @Test
    public void testAddZeroDoesNotChangeDateTime() {
        MutableDateTime dateTime = new MutableDateTime(2020, 6, 15, 12, 30, 45, 123);

        long originalMillis = dateTime.getMillis();

        dateTime.add(DateTimeFieldType.dayOfMonth(), 0);

        assertEquals(
                "Adding zero must not change the instant",
                originalMillis,
                dateTime.getMillis()
        );

        assertEquals(2020, dateTime.getYear());
        assertEquals(6, dateTime.getMonthOfYear());
        assertEquals(15, dateTime.getDayOfMonth());
        assertEquals(12, dateTime.getHourOfDay());
        assertEquals(30, dateTime.getMinuteOfHour());
        assertEquals(45, dateTime.getSecondOfMinute());
        assertEquals(123, dateTime.getMillisOfSecond());
    }
}
