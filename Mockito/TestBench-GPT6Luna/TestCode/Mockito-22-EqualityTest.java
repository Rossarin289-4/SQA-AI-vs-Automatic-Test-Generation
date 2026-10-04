package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;

public class EqualityTest {
    @Test
    public void testSameReference() throws Exception {
        Object value = new Object();
        assertTrue(Equality.areEqual(value, value));
    }

    @Test
    public void testBothNull() throws Exception {
        assertTrue(Equality.areEqual(null, null));
    }

    @Test
    public void testFirstNull() throws Exception {
        assertFalse(Equality.areEqual(null, "value"));
    }

    @Test
    public void testSecondNull() throws Exception {
        assertFalse(Equality.areEqual("value", null));
    }

    @Test
    public void testEqualOrdinaryValues() throws Exception {
        assertTrue(Equality.areEqual("same", new String("same")));
    }

    @Test
    public void testUnequalOrdinaryValues() throws Exception {
        assertFalse(Equality.areEqual("left", "right"));
    }

    @Test
    public void testUnequalValueTypes() throws Exception {
        assertFalse(Equality.areEqual(Integer.valueOf(1), Long.valueOf(1)));
    }

    @Test
    public void testEqualEmptyArrays() throws Exception {
        assertTrue(Equality.areEqual(new int[0], new int[0]));
    }

    @Test
    public void testDifferentArrayLengths() throws Exception {
        assertFalse(Equality.areEqual(new int[] {1}, new int[] {1, 2}));
    }

    @Test
    public void testEqualPrimitiveArrayElements() throws Exception {
        assertTrue(Equality.areEqual(new int[] {1, 2}, new int[] {1, 2}));
    }

    @Test
    public void testUnequalPrimitiveArrayElements() throws Exception {
        assertFalse(Equality.areEqual(new int[] {1, 2}, new int[] {1, 3}));
    }

    @Test
    public void testDifferentPrimitiveArrayTypes() throws Exception {
        assertFalse(Equality.areEqual(new int[] {1}, new long[] {1}));
    }

    @Test
    public void testEqualReferenceArrayElements() throws Exception {
        assertTrue(Equality.areEqual(new String[] {"a", "b"}, new String[] {"a", "b"}));
    }

    @Test
    public void testUnequalReferenceArrayElements() throws Exception {
        assertFalse(Equality.areEqual(new String[] {"a"}, new String[] {"b"}));
    }

    @Test
    public void testNestedArraysWithEqualElements() throws Exception {
        assertTrue(Equality.areEqual(new Object[] {new int[] {1, 2}},
                new Object[] {new int[] {1, 2}}));
    }

    @Test
    public void testNestedArraysWithDifferentElements() throws Exception {
        assertFalse(Equality.areEqual(new Object[] {new int[] {1}},
                new Object[] {new int[] {2}}));
    }

    @Test
    public void testNullArrayElementAgainstNull() throws Exception {
        assertTrue(Equality.areEqual(new Object[] {null}, new Object[] {null}));
    }

    @Test
    public void testNullArrayElementAgainstValue() throws Exception {
        assertFalse(Equality.areEqual(new Object[] {null}, new Object[] {"value"}));
    }

    @Test
    public void testArrayAgainstNonArray() throws Exception {
        assertFalse(Equality.areEqual(new int[] {1}, "value"));
    }

    @Test
    public void testNonArrayAgainstArray() throws Exception {
        assertFalse(Equality.areEqual("value", new int[] {1}));
    }
}
