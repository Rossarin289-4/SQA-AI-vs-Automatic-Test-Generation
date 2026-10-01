package org.joda.time.format;

import static org.junit.Assert.assertEquals;

import org.joda.time.Period;
import org.junit.Test;

public class TestPeriodFormatterBuilderTime27 {

    @Test
    public void testSeparatorWithExistingAfterFormatter() {
        PeriodFormatter first = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparatorIfFieldsAfter("T")
                .appendHours()
                .toFormatter();

        PeriodFormatter combined = new PeriodFormatterBuilder()
                .append(first)
                .appendMinutes()
                .toFormatter();

        Period period = combined.parsePeriod("1T2:3");

        assertEquals(1, period.getDays());
        assertEquals(2, period.getHours());
        assertEquals(3, period.getMinutes());
    }
}
