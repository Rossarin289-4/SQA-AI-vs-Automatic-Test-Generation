package org.joda.time;

import static org.junit.Assert.fail;

import org.junit.Test;

public class TestPeriodTime5 {

    /**
     * A Period containing months but no years field cannot be normalized
     * into a standard years/months representation.
     *
     * The fixed implementation detects that the PeriodType does not
     * support both years and months and throws IllegalArgumentException.
     */
    @Test
    public void testNormalizedStandardMonthsOnlyThrowsException() {
        Period period = new Period(
                13,
                PeriodType.months()
        );

        try {
            period.normalizedStandard();
            fail("A months-only Period cannot be normalized to years/months");
        } catch (IllegalArgumentException expected) {
            // Expected behavior.
        }
    }
}
