package org.joda.time.format;

import static org.junit.Assert.assertEquals;
import org.joda.time.Period;
import org.junit.Test;

public class TestPeriodFormatterTime13 {
    @Test
    public void testNegativeSubsecondFormattingKeepsMinusSign() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithOptionalMillis()
                .toFormatter();

        assertEquals("-0.001", formatter.print(new Period(0,0,0,0,0,0,0,-1)));
    }
}