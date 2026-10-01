package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PartialTest {

    @Test
    public void testWithFieldTypeAndValuePreservesChronology() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2026);
        Partial updated = partial.with(DateTimeFieldType.hourOfDay(), 10);

        assertEquals(2, updated.size());
        assertEquals(DateTimeFieldType.year(), updated.getFieldType(0));
        assertEquals(2026, updated.getValue(0));
        assertEquals(DateTimeFieldType.hourOfDay(), updated.getFieldType(1));
        assertEquals(10, updated.getValue(1));
    }
}
