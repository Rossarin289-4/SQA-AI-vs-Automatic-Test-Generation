package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ArrayUtilsTest {
    @Test
    public void testToStringForNullAndArray() throws Exception {
        assertEquals("{}", ArrayUtils.toString(null));
        assertEquals("{a,b}", ArrayUtils.toString(new String[] {"a", "b"}));
    }

    @Test
    public void testIsEqualsDeepPrimitiveArrays() throws Exception {
        assertTrue(ArrayUtils.isEquals(new int[] {1, 2}, new int[] {1, 2}));
        assertFalse(ArrayUtils.isEquals(new int[] {1, 2}, new int[] {1, 3}));
    }

    @Test
    public void testToMapEntriesAndArrayEntries() throws Exception {
        Map<Object, Object> map = ArrayUtils.toMap(new Object[] {
            new Object[] {"x", "one"},
            new HashMap.SimpleEntry<Object, Object>("y", "two")
        });
        assertEquals(2, map.size());
        assertEquals("one", map.get("x"));
        assertEquals("two", map.get("y"));
    }

    @Test
    public void testToMapNullAndInvalidShortEntry() throws Exception {
        assertEquals(null, ArrayUtils.toMap(null));
        try {
            ArrayUtils.toMap(new Object[] {new Object[] {"only"}});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToArrayPreservesItemsAndEmptyCall() throws Exception {
        String[] values = ArrayUtils.toArray("a", "b");
        assertEquals(2, values.length);
        assertEquals("a", values[0]);
        assertEquals("b", values[1]);
        assertEquals(0, ArrayUtils.<String>toArray().length);
    }

    @Test
    public void testCloneIsShallowAndNullSafe() throws Exception {
        String[] source = new String[] {"a", "b"};
        String[] copy = ArrayUtils.clone(source);
        assertNotSame(source, copy);
        assertEquals(source[0], copy[0]);
        assertEquals(null, ArrayUtils.clone((String[]) null));
    }

    @Test
    public void testSubarrayClampsEndpointsAndUsesExclusiveEnd() throws Exception {
        String[] source = new String[] {"a", "b", "c"};
        assertArrayEquals(new String[] {"a", "b"}, ArrayUtils.subarray(source, -2, 2));
        assertArrayEquals(new String[] {"c"}, ArrayUtils.subarray(source, 2, 8));
        assertArrayEquals(new String[0], ArrayUtils.subarray(source, 2, 1));
        assertEquals(null, ArrayUtils.subarray((String[]) null, 0, 1));
    }

    @Test
    public void testIsSameLengthNullMeansZeroLength() throws Exception {
        assertTrue(ArrayUtils.isSameLength(null, new String[0]));
        assertFalse(ArrayUtils.isSameLength(null, new String[] {"x"}));
        assertFalse(ArrayUtils.isSameLength(new String[] {"x"}, new String[] {"x", "y"}));
    }

    @Test
    public void testGetLengthArraysNullAndNonArray() throws Exception {
        assertEquals(0, ArrayUtils.getLength(null));
        assertEquals(2, ArrayUtils.getLength(new int[] {4, 5}));
        try {
            ArrayUtils.getLength("not array");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testIsSameTypeAndNullRejection() throws Exception {
        assertTrue(ArrayUtils.isSameType(new int[0], new int[] {1}));
        assertFalse(ArrayUtils.isSameType(new int[0], new long[0]));
        try {
            ArrayUtils.isSameType(null, new int[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testReverseObjectArray() throws Exception {
        String[] values = new String[] {"a", "b", "c", "d"};
        ArrayUtils.reverse(values);
        assertArrayEquals(new String[] {"d", "c", "b", "a"}, values);
    }

    @Test
    public void testIndexOfObjectStartBoundsAndNullElement() throws Exception {
        String[] values = new String[] {"x", null, "x"};
        assertEquals(0, ArrayUtils.indexOf(values, "x"));
        assertEquals(1, ArrayUtils.indexOf(values, null, -1));
        assertEquals(2, ArrayUtils.indexOf(values, "x", 1));
        assertEquals(-1, ArrayUtils.indexOf(values, "x", 3));
    }

    @Test
    public void testLastIndexOfObjectClampsHighStartAndRejectsNegative() throws Exception {
        String[] values = new String[] {"x", null, "x"};
        assertEquals(2, ArrayUtils.lastIndexOf(values, "x"));
        assertEquals(1, ArrayUtils.lastIndexOf(values, null, 99));
        assertEquals(-1, ArrayUtils.lastIndexOf(values, "x", -1));
    }

    @Test
    public void testContainsObjectIncludingNull() throws Exception {
        assertTrue(ArrayUtils.contains(new String[] {"a", null}, null));
        assertFalse(ArrayUtils.contains(new String[] {"a"}, "b"));
        assertFalse(ArrayUtils.contains(null, "a"));
    }

    @Test
    public void testToPrimitiveCharacterArray() throws Exception {
        assertArrayEquals(new char[] {'a', 'z'}, ArrayUtils.toPrimitive(new Character[] {'a', 'z'}));
        assertEquals(null, ArrayUtils.toPrimitive((Character[]) null));
        try {
            ArrayUtils.toPrimitive(new Character[] {'a', null});
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testToObjectCharacterArray() throws Exception {
        assertArrayEquals(new Character[] {'a', 'z'}, ArrayUtils.toObject(new char[] {'a', 'z'}));
        assertEquals(0, ArrayUtils.toObject(new char[0]).length);
        assertEquals(null, ArrayUtils.toObject((char[]) null));
    }

    @Test
    public void testIsEmptyObjectArrays() throws Exception {
        assertTrue(ArrayUtils.isEmpty((String[]) null));
        assertTrue(ArrayUtils.isEmpty(new String[0]));
        assertFalse(ArrayUtils.isEmpty(new String[] {null}));
    }

    @Test
    public void testAddAllConcatenatesAndCopies() throws Exception {
        String[] first = new String[] {"a"};
        String[] result = ArrayUtils.addAll(first, new String[] {"b", "c"});
        assertArrayEquals(new String[] {"a", "b", "c"}, result);
        assertNotSame(first, result);
        assertArrayEquals(new String[] {"b"}, ArrayUtils.addAll((String[]) null, new String[] {"b"}));
        assertEquals(null, ArrayUtils.addAll((String[]) null, (String[]) null));
    }

    @Test
    public void testAddAtEndAndNullInput() throws Exception {
        String[] source = new String[] {"a"};
        assertArrayEquals(new String[] {"a", "b"}, ArrayUtils.add(source, "b"));
        assertArrayEquals(new String[] {"z"}, ArrayUtils.add((String[]) null, "z"));
        assertArrayEquals(new String[] {"a"}, source);
    }

    @Test
    public void testAddNullElementAndBothNull() throws Exception {
        assertArrayEquals(new String[] {"a", null}, ArrayUtils.add(new String[] {"a"}, null));
        try {
            ArrayUtils.add((String[]) null, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRemoveAtFirstMiddleAndLastIndex() throws Exception {
        assertArrayEquals(new String[] {"b", "c"}, ArrayUtils.remove(new String[] {"a", "b", "c"}, 0));
        assertArrayEquals(new String[] {"a", "c"}, ArrayUtils.remove(new String[] {"a", "b", "c"}, 1));
        assertArrayEquals(new String[] {"a", "b"}, ArrayUtils.remove(new String[] {"a", "b", "c"}, 2));
    }

    @Test
    public void testRemoveRejectsIndicesOutsideArray() throws Exception {
        String[] values = new String[] {"a"};
        try {
            ArrayUtils.remove(values, -1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
        try {
            ArrayUtils.remove(values, 1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
    }

    @Test
    public void testRemoveElementRemovesOnlyFirstMatch() throws Exception {
        assertArrayEquals(new String[] {"b", "a"},
                ArrayUtils.removeElement(new String[] {"a", "b", "a"}, "a"));
        assertArrayEquals(new String[] {"a"}, ArrayUtils.removeElement(new String[] {"a"}, "x"));
        assertEquals(null, ArrayUtils.removeElement((String[]) null, "x"));
    }
}
