package org.joda.time;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMonthFieldTime14 {
    @Test
    public void testAddingMonthWrapsMonthDayPartial() {
        Partial partial = new Partial()
                .with(DateTimeFieldType.monthOfYear(), 12)
                .with(DateTimeFieldType.dayOfMonth(), 15);

        Partial result = partial.withFieldAdded(DurationFieldType.months(), 1);

        assertEquals(1, result.getMonthOfYear());
        assertEquals(15, result.getDayOfMonth());
    }
}