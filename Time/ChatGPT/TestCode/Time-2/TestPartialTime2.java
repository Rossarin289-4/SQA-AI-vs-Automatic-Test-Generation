package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPartialTime2 {

    /**
     * Verifies that an era field can be followed by a year field
     * in a Partial, with fields ordered from largest to smallest.
     *
     * The era duration field is unsupported while the year duration
     * field is supported. They must not be treated as duplicate fields.
     */
    @Test
    public void testEraBeforeYearIsAccepted() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
                DateTimeFieldType.era(),
                DateTimeFieldType.year()
        };

        int[] values = new int[] {
                1,
                2024
        };

        Partial partial = new Partial(types, values);

        assertEquals(2, partial.size());
        assertEquals(DateTimeFieldType.era(), partial.getFieldType(0));
        assertEquals(DateTimeFieldType.year(), partial.getFieldType(1));
        assertEquals(1, partial.getValue(0));
        assertEquals(2024, partial.getValue(1));
    }
}
