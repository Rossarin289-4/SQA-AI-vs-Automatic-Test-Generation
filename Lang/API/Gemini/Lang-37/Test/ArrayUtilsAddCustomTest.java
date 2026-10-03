package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilsAddCustomTest {

    @Test
    public void testAddAllWithNullFirstArgument() {
        Integer[] second = new Integer[] { 1, 2, 3 };
        Integer[] result = ArrayUtils.addAll(null, second);
        assertNotNull("Result should not be null", result);
        assertArrayEquals("Result should match the second array", second, result);
        assertEquals("Component type should be Integer[]", Integer.class, result.getClass().getComponentType());
    }

    @Test
    public void testAddAllWithNullSecondArgument() {
        Integer[] first = new Integer[] { 4, 5, 6 };
        Integer[] result = ArrayUtils.addAll(first, (Integer[]) null);
        assertNotNull("Result should not be null", result);
        assertArrayEquals("Result should match the first array", first, result);
        assertEquals("Component type should be Integer[]", Integer.class, result.getClass().getComponentType());
    }

    @Test
    public void testAddAllBothNull() {
        Integer[] result = ArrayUtils.addAll(null, (Integer[]) null);
        assertNull("Result should be null when both inputs are null", result);
    }

    @Test
    public void testAddAllTypedObjects() {
        String[] first = new String[] { "a", "b" };
        String[] second = new String[] { "c", "d" };
        String[] result = ArrayUtils.addAll(first, second);
        assertNotNull("Result should not be null", result);
        assertArrayEquals("Combined array should match expected elements", new String[] { "a", "b", "c", "d" }, result);
        assertEquals("Component type should remain String[]", String.class, result.getClass().getComponentType());
    }
}
