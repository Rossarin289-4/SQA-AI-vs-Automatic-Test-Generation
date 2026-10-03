package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilsCustomTest {

    @Test
    public void testAddObjectArrayNullAndNonNullElement() {
        String[] result = ArrayUtils.add((String[]) null, "testValue");
        assertNotNull("Resulting array should not be null", result);
        assertEquals(1, result.length);
        assertEquals("testValue", result[0]);
        assertSame(String[].class, result.getClass());
    }

    @Test
    public void testAddIntegerArrayNullAndIntegerElement() {
        Integer[] result = ArrayUtils.add((Integer[]) null, Integer.valueOf(100));
        assertNotNull("Resulting array should not be null", result);
        assertEquals(1, result.length);
        assertEquals(Integer.valueOf(100), result[0]);
        assertSame(Integer[].class, result.getClass());
    }

    @Test
    public void testAddBooleanArrayNullAndBooleanElement() {
        Boolean[] result = ArrayUtils.add((Boolean[]) null, Boolean.TRUE);
        assertNotNull("Resulting array should not be null", result);
        assertEquals(1, result.length);
        assertEquals(Boolean.TRUE, result[0]);
        assertSame(Boolean[].class, result.getClass());
    }
}
