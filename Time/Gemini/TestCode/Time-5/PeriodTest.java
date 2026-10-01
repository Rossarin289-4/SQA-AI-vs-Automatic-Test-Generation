package org.joda.time;

import org.junit.Test;

public class PeriodTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testNormalizedStandardWithPeriodTypeMissingYears() {
        PeriodType typeMissingYears = PeriodType.forFields(new DurationFieldType[] {
            DurationFieldType.months(),
            DurationFieldType.weeks(),
            DurationFieldType.days()
        });

        Period period = new Period(0, 15, 0, 0, 0, 0, 0, 0, typeMissingYears);
        period.normalizedStandard();
    }
}
