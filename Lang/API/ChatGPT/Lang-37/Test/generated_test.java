package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ArrayUtilsLang37Test {

    @Test
    public void testAddAllRejectsIncompatibleIntegerAndLongArrays() {
        Integer[] first = new Integer[] { 10 };
        Long[] second = new Long[] { 20L };

        try {
            ArrayUtils.addAll(first, second);
            fail("Expected IllegalArgumentException for incompatible array types");
        } catch (IllegalArgumentException expected) {
            // Expected behavior in the fixed version.
        }
    }

    @Test
    public void testAddAllRejectsIncompatibleLongAndIntegerArrays() {
        Long[] first = new Long[] { 30L };
        Integer[] second = new Integer[] { 40 };

        try {
            ArrayUtils.addAll(first, second);
            fail("Expected IllegalArgumentException for incompatible array types");
        } catch (IllegalArgumentException expected) {
            // Expected behavior in the fixed version.
        }
    }

    @Test
    public void testAddAllRejectsIncompatibleStringAndIntegerArrays() {
        String[] first = new String[] { "alpha" };
        Integer[] second = new Integer[] { 50 };

        try {
            ArrayUtils.addAll(first, second);
            fail("Expected IllegalArgumentException for incompatible array types");
        } catch (IllegalArgumentException expected) {
            // Expected behavior in the fixed version.
        }
    }

    @Test
    public void testAddAllRejectsIncompatibleArraysWithMultipleElements() {
        Double[] first = new Double[] { 1.5, 2.5 };
        String[] second = new String[] { "x", "y" };

        try {
            ArrayUtils.addAll(first, second);
            fail("Expected IllegalArgumentException for incompatible array types");
        } catch (IllegalArgumentException expected) {
            // Expected behavior in the fixed version.
        }
    }

    @Test
    public void testAddAllWorksForSameComponentType() {
        Integer[] first = new Integer[] { 1, 2 };
        Integer[] second = new Integer[] { 3, 4 };

        Integer[] result = ArrayUtils.addAll(first, second);

        assertArrayEquals(
                new Integer[] { 1, 2, 3, 4 },
                result);
        assertEquals(Integer[].class, result.getClass());
    }

    @Test
    public void testAddAllWorksWhenSecondTypeIsAssignableToFirstType() {
        Number[] first = new Number[] { 1.5 };
        Integer[] second = new Integer[] { 7 };

        Number[] result = ArrayUtils.addAll(first, second);

        assertArrayEquals(
                new Number[] { 1.5, 7 },
                result);
        assertEquals(Number[].class, result.getClass());
    }
}
