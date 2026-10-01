package org.joda.time;

import org.junit.Test;

public class PartialTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPartialWithSupportedThenUnsupportedFieldTypes() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.era()
        };
        int[] values = new int[] {2020, 1};

        new Partial(types, values);
    }
}
