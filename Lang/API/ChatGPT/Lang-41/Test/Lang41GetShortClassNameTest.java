package org.apache.commons.lang;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lang41GetShortClassNameTest {

    @Test
    public void testShortClassNameForOneDimensionalReferenceArray() {
        assertEquals(
                "String[]",
                ClassUtils.getShortClassName(String[].class)
        );
    }

    @Test
    public void testShortClassNameForMultiDimensionalPrimitiveArray() {
        assertEquals(
                "int[][]",
                ClassUtils.getShortClassName(int[][].class)
        );
    }

    @Test
    public void testShortClassNameForMultiDimensionalReferenceArrayFromString() {
        assertEquals(
                "Integer[][][]",
                ClassUtils.getShortClassName("[[[Ljava.lang.Integer;")
        );
    }

    @Test
    public void testShortClassNameForArrayOfInnerClass() {
        assertEquals(
                "Map.Entry[]",
                ClassUtils.getShortClassName("[Ljava.util.Map$Entry;")
        );
    }

    @Test
    public void testShortClassNameForArrayObject() {
        Object value = new Double[1];

        assertEquals(
                "Double[]",
                ClassUtils.getShortClassName(value, "fallback")
        );
    }

    @Test
    public void testShortClassNameForOrdinaryClassRemainsUnchanged() {
        assertEquals(
                "String",
                ClassUtils.getShortClassName("java.lang.String")
        );
    }
}
