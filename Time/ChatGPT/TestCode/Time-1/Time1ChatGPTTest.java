package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Time1ChatGPTTest {

    @Test
    public void testPartialConstructorWithEqualDurationFields() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.weekyear()
        };

        int[] values = new int[] {
            2000,
            2000
        };

        Partial partial = new Partial(types, values);

        assertEquals(2, partial.size());
        assertEquals(DateTimeFieldType.year(), partial.getFieldType(0));
        assertEquals(DateTimeFieldType.weekyear(), partial.getFieldType(1));
        assertEquals(2000, partial.getValue(0));
        assertEquals(2000, partial.getValue(1));
    }
}
