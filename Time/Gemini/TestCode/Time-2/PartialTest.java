package org.joda.time;

import org.junit.Test;

public class PartialTest {

    @Test
    public void testSupportedFieldFollowedByUnsupportedField() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.era()
        };
        int[] values = new int[] {2026, 1};

        new Partial(types, values);
    }
}
