package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ArrayUtilsLang35Test {

    @Test
    public void testAddBothNullThrowsIllegalArgumentException() {
        Integer[] array = null;
        Integer element = null;

        try {
            ArrayUtils.add(array, element);
            fail("Expected IllegalArgumentException when array and element are both null");
        } catch (IllegalArgumentException expected) {
            // Expected behavior
        }
    }

    @Test
    public void testAddBothNullWithIndexThrowsIllegalArgumentException() {
        Integer[] array = null;
        Integer element = null;

        try {
            ArrayUtils.add(array, 0, element);
            fail("Expected IllegalArgumentException when array and element are both null");
        } catch (IllegalArgumentException expected) {
            // Expected behavior
        }
    }

    @Test
    public void testAddNullArrayWithNonNullElementCreatesCorrectType() {
        Integer[] array = null;
        Integer element = Integer.valueOf(42);

        Integer[] result = ArrayUtils.add(array, element);

        assertEquals(Integer[].class, result.getClass());
        assertArrayEquals(new Integer[] {42}, result);
    }

    @Test
    public void testAddNonNullArrayWithNullElementPreservesArrayType() {
        Integer[] array = new Integer[] {10, 20};
        Integer element = null;

        Integer[] result = ArrayUtils.add(array, element);

        assertEquals(Integer[].class, result.getClass());
        assertArrayEquals(new Integer[] {10, 20, null}, result);
    }

    @Test
    public void testIndexedAddNullArrayWithNonNullElementCreatesCorrectType() {
        Integer[] array = null;
        Integer element = Integer.valueOf(7);

        Integer[] result = ArrayUtils.add(array, 0, element);

        assertEquals(Integer[].class, result.getClass());
        assertArrayEquals(new Integer[] {7}, result);
    }

    @Test
    public void testIndexedAddNonNullArrayWithNullElementPreservesArrayType() {
        Integer[] array = new Integer[] {3, 6};
        Integer element = null;

        Integer[] result = ArrayUtils.add(array, 1, element);

        assertEquals(Integer[].class, result.getClass());
        assertArrayEquals(new Integer[] {3, null, 6}, result);
    }
}
