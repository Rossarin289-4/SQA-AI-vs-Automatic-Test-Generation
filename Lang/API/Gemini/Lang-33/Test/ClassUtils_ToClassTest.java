package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClassUtils_ToClassTest {

    @Test
    public void testToClass_withMixedNullAndNonNullElements() {
        Object[] inputs = new Object[] { "Hello", null, Integer.valueOf(5), Boolean.TRUE };
        Class<?>[] classes = ClassUtils.toClass(inputs);
        assertNotNull("Returned class array should not be null", classes);
        assertEquals(4, classes.length);
        assertEquals(String.class, classes[0]);
        assertNull("Element at index 1 should be null", classes[1]);
        assertEquals(Integer.class, classes[2]);
        assertEquals(Boolean.class, classes[3]);
    }

    @Test
    public void testToClass_withAllNullElements() {
        Object[] inputs = new Object[] { null, null, null };
        Class<?>[] classes = ClassUtils.toClass(inputs);
        assertNotNull("Returned class array should not be null", classes);
        assertEquals(3, classes.length);
        assertNull(classes[0]);
        assertNull(classes[1]);
        assertNull(classes[2]);
    }

    @Test
    public void testToClass_withSingleNullElement() {
        Object[] inputs = new Object[] { null };
        Class<?>[] classes = ClassUtils.toClass(inputs);
        assertNotNull("Returned class array should not be null", classes);
        assertEquals(1, classes.length);
        assertNull(classes[0]);
    }

    @Test
    public void testToClass_withNullAtBeginningAndEnd() {
        Object[] inputs = new Object[] { null, Double.valueOf(3.14), null };
        Class<?>[] classes = ClassUtils.toClass(inputs);
        assertNotNull("Returned class array should not be null", classes);
        assertEquals(3, classes.length);
        assertNull(classes[0]);
        assertEquals(Double.class, classes[1]);
        assertNull(classes[2]);
    }
}
