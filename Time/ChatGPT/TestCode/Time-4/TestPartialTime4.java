package org.joda.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestPartialTime4 {

    @Test
    public void testWithAddsEraBeforeYear() {
        Partial original = new Partial(
                DateTimeFieldType.year(),
                2020
        );

        Partial result = original.with(
                DateTimeFieldType.era(),
                1
        );

        assertNotNull(result);

        assertEquals(2, result.size());

        assertEquals(
                DateTimeFieldType.era(),
                result.getFieldType(0)
        );
        assertEquals(
                DateTimeFieldType.year(),
                result.getFieldType(1)
        );

        assertEquals(1, result.getValue(0));
        assertEquals(2020, result.getValue(1));

        assertEquals(1, original.size());
        assertEquals(DateTimeFieldType.year(), original.getFieldType(0));
        assertEquals(2020, original.getValue(0));
    }
}
