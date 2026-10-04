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
    public void testToStringNull() throws Exception {
        assertEquals("{}", ArrayUtils.toString(null));
    }

    @Test
    public void testToStringEmpty() throws Exception {
        assertEquals("{}", ArrayUtils.toString(ArrayUtils.EMPTY_OBJECT_ARRAY));
    }

    @Test
    public void testToStringNonEmpty() throws Exception {
        assertEquals("{a, b}", ArrayUtils.toString(new Object[]{"a", "b"}));
    }

    @Test
    public void testToStringWithNullDefault() throws Exception {
        assertEquals("{}", ArrayUtils.toString(null, "{}"));
    }

    @Test
    public void testToStringWithCustomDefault() throws Exception {
        assertEquals("default", ArrayUtils.toString(null, "default"));
    }

    @Test
    public void testToStringWithNonEmptyArrayAndCustomDefault() throws Exception {
        assertEquals("{a, b}", ArrayUtils.toString(new Object[]{"a", "b"}, "default"));
    }
    
    @Test
    public void testIsEqualsNullNull() throws Exception {
        assertTrue(ArrayUtils.isEquals(null, null));
    }

    @Test
    public void testIsEqualsNullNonNull() throws Exception {
        assertFalse(ArrayUtils.isEquals(null, new Object[]{"a"}));
    }

    @Test
    public void testIsEqualsNonNullNull() throws Exception {
        assertFalse(ArrayUtils.isEquals(new Object[]{"a"}, null));
    }

    @Test
    public void testIsEqualsEmptyEmpty() throws Exception {
        assertTrue(ArrayUtils.isEquals(new Object[0], new Object[0]));
    }

    @Test
    public void testIsEqualsSameContent() throws Exception {
        assertTrue(ArrayUtils.isEquals(new Object[]{"a", "b"}, new Object[]{"a", "b"}));
    }

    @Test
    public void testIsEqualsDifferentContent() throws Exception {
        assertFalse(ArrayUtils.isEquals(new Object[]{"a", "b"}, new Object[]{"a", "c"}));
    }
    
    @Test
    public void testToMapNull() throws Exception {
        assertNull(ArrayUtils.toMap(null));
    }

    @Test
    public void testToMapEmpty() throws Exception {
        assertTrue(ArrayUtils.toMap(new Object[0]).isEmpty());
    }
    
    @Test
    public void testToMapWithEntries() throws Exception {
        Object[] entries = new Object[]{
                new Object[]{"key1", "value1"},
                new Object[]{"key2", "value2"}
        };
        Map<Object, Object> map = ArrayUtils.toMap(entries);
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals(2, map.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMapWithInvalidEntryLength() throws Exception {
        Object[] entries = new Object[]{new Object[]{"key"}};
        ArrayUtils.toMap(entries);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMapWithInvalidEntryType() throws Exception {
        Object[] entries = new Object[]{123};
        ArrayUtils.toMap(entries);
    }

    @Test
    public void testToArrayVarargs() throws Exception {
        String[] array = ArrayUtils.toArray("a", "b", "c");
        assertEquals(3, array.length);
        assertEquals("a", array[0]);
        assertEquals("b", array[1]);
        assertEquals("c", array[2]);
    }

    @Test
    public void testToArrayEmptyVarargs() throws Exception {
        String[] array = ArrayUtils.toArray();
        assertEquals(0, array.length);
    }

    @Test
    public void testCloneNull() throws Exception {
        assertNull(ArrayUtils.clone((Object[]) null));
    }

    @Test
    public void testCloneEmpty() throws Exception {
        Object[] array = ArrayUtils.clone(new Object[0]);
        assertEquals(0, array.length);
    }

    @Test
    public void testCloneNonEmpty() throws Exception {
        Object[] original = {"a", "b"};
        Object[] cloned = ArrayUtils.clone(original);
        assertNotSame(original, cloned);
        assertEquals(original.length, cloned.length);
        assertArrayEquals(original, cloned);
    }


    @Test
    public void testSubarrayObjectEmpty() throws Exception {
        Object[] subarray = ArrayUtils.subarray(new Object[0], 0, 0);
        assertEquals(0, subarray.length);
    }

    @Test
    public void testSubarrayObjectBasic() throws Exception {
        Object[] array = {"a", "b", "c", "d"};
        Object[] subarray = ArrayUtils.subarray(array, 1, 3);
        assertArrayEquals(new Object[]{"b", "c"}, subarray);
    }

    @Test
    public void testSubarrayObjectStartIndexInclusiveZero() throws Exception {
        Object[] array = {"a", "b", "c", "d"};
        Object[] subarray = ArrayUtils.subarray(array, 0, 2);
        assertArrayEquals(new Object[]{"a", "b"}, subarray);
    }

    @Test
    public void testSubarrayObjectEndIndexExclusiveLength() throws Exception {
        Object[] array = {"a", "b", "c", "d"};
        Object[] subarray = ArrayUtils.subarray(array, 2, 4);
        assertArrayEquals(new Object[]{"c", "d"}, subarray);
    }

    @Test
    public void testSubarrayObjectStartIndexNegative() throws Exception {
        Object[] array = {"a", "b", "c", "d"};
        Object[] subarray = ArrayUtils.subarray(array, -1, 2);
        assertArrayEquals(new Object[]{"a", "b"}, subarray);
    }

    @Test
    public void testSubarrayObjectEndIndexOverLength() throws Exception {
        Object[] array = {"a", "b", "c", "d"};
        Object[] subarray = ArrayUtils.subarray(array, 2, 5);
        assertArrayEquals(new Object[]{"c", "d"}, subarray);
    }

    @Test
    public void testSubarrayObjectStartIndexOverEndIndex() throws Exception {
        Object[] array = {"a", "b", "c", "d"};
        Object[] subarray = ArrayUtils.subarray(array, 3, 1);
        assertEquals(0, subarray.length);
    }
    
    @Test
    public void testIsSameLengthNullNull() throws Exception {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, null));
    }

    @Test
    public void testIsSameLengthNullEmpty() throws Exception {
        assertTrue(ArrayUtils.isSameLength(null, new Object[0]));
    }

    @Test
    public void testIsSameLengthEmptyNull() throws Exception {
        assertTrue(ArrayUtils.isSameLength(new Object[0], null));
    }

    @Test
    public void testIsSameLengthEmptyEmpty() throws Exception {
        assertTrue(ArrayUtils.isSameLength(new Object[0], new Object[0]));
    }

    @Test
    public void testIsSameLengthSameLength() throws Exception {
        assertTrue(ArrayUtils.isSameLength(new Object[]{"a"}, new Object[]{"b"}));
    }

    @Test
    public void testIsSameLengthDifferentLength() throws Exception {
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a"}, new Object[]{"a", "b"}));
    }

    @Test
    public void testIsSameLengthOneNullOneNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isSameLength(null, new Object[]{"a"}));
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a"}, null));
    }

    @Test
    public void testGetLengthNull() throws Exception {
        assertEquals(0, ArrayUtils.getLength(null));
    }

    @Test
    public void testGetLengthEmptyObjectArray() throws Exception {
        assertEquals(0, ArrayUtils.getLength(new Object[0]));
    }

    @Test
    public void testGetLengthObjectArray() throws Exception {
        assertEquals(3, ArrayUtils.getLength(new String[]{"a", "b", "c"}));
    }

    @Test
    public void testGetLengthPrimitiveArray() throws Exception {
        assertEquals(3, ArrayUtils.getLength(new int[]{1, 2, 3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLengthNotArray() throws Exception {
        ArrayUtils.getLength("not an array");
    }

    @Test
    public void testIsSameTypeObjectAndObject() throws Exception {
        assertTrue(ArrayUtils.isSameType(new String[0], new String[0]));
    }

    @Test
    public void testIsSameTypeObjectAndDifferentObject() throws Exception {
        assertFalse(ArrayUtils.isSameType(new String[0], new Integer[0]));
    }

    @Test
    public void testIsSameTypePrimitiveAndPrimitive() throws Exception {
        assertTrue(ArrayUtils.isSameType(new int[0], new int[0]));
    }

    @Test
    public void testIsSameTypePrimitiveAndDifferentPrimitive() throws Exception {
        assertFalse(ArrayUtils.isSameType(new int[0], new long[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameTypeNull() throws Exception {
        ArrayUtils.isSameType(null, new String[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameTypeNull2() throws Exception {
        ArrayUtils.isSameType(new String[0], null);
    }

    @Test
    public void testReverseObjectEmpty() throws Exception {
        Object[] array = new Object[0];
        ArrayUtils.reverse(array);
        assertArrayEquals(new Object[0], array);
    }

    @Test
    public void testReverseObjectSingleElement() throws Exception {
        Object[] array = {"a"};
        ArrayUtils.reverse(array);
        assertArrayEquals(new Object[]{"a"}, array);
    }

    @Test
    public void testReverseObjectMultipleElements() throws Exception {
        Object[] array = {"a", "b", "c"};
        ArrayUtils.reverse(array);
        assertArrayEquals(new Object[]{"c", "b", "a"}, array);
    }

    @Test
    public void testReverseObjectNull() throws Exception {
        ArrayUtils.reverse((Object[]) null); // Should not throw exception
    }
    
    @Test
    public void testIndexOfObjectNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((Object[]) null, "a"));
    }

    @Test
    public void testIndexOfObjectEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[0], "a"));
    }

    @Test
    public void testIndexOfObjectFound() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new Object[]{"a", "b", "c"}, "b"));
    }

    @Test
    public void testIndexOfObjectNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"a", "b", "c"}, "d"));
    }

    @Test
    public void testIndexOfObjectNullElement() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new Object[]{"a", null, "c"}, null));
    }

    @Test
    public void testIndexOfObjectNullElementNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"a", "b", "c"}, null));
    }

    @Test
    public void testIndexOfObjectStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new Object[]{"a", "b", "c", "b"}, "b", 2));
    }

    @Test
    public void testIndexOfObjectStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new Object[]{"a", "b", "c"}, "b", -5));
    }

    @Test
    public void testIndexOfObjectStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"a", "b", "c"}, "b", 5));
    }

    @Test
    public void testLastIndexOfObjectNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((Object[]) null, "a"));
    }

    @Test
    public void testLastIndexOfObjectEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new Object[0], "a"));
    }

    @Test
    public void testLastIndexOfObjectFound() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new Object[]{"a", "b", "c", "b"}, "b"));
    }

    @Test
    public void testLastIndexOfObjectNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new Object[]{"a", "b", "c"}, "d"));
    }

    @Test
    public void testLastIndexOfObjectNullElement() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new Object[]{"a", null, "c", null}, null));
    }

    @Test
    public void testLastIndexOfObjectNullElementNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new Object[]{"a", "b", "c"}, null));
    }

    @Test
    public void testLastIndexOfObjectStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new Object[]{"a", "b", "c", "b"}, "b", 2));
    }

    @Test
    public void testLastIndexOfObjectStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new Object[]{"a", "b", "c"}, "b", -5));
    }

    @Test
    public void testLastIndexOfObjectStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new Object[]{"a", "b", "c"}, "c", 5));
    }

    @Test
    public void testContainsObjectNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((Object[]) null, "a"));
    }

    @Test
    public void testContainsObjectEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new Object[0], "a"));
    }

    @Test
    public void testContainsObjectFound() throws Exception {
        assertTrue(ArrayUtils.contains(new Object[]{"a", "b", "c"}, "b"));
    }

    @Test
    public void testContainsObjectNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new Object[]{"a", "b", "c"}, "d"));
    }

    @Test
    public void testContainsObjectNullElement() throws Exception {
        assertTrue(ArrayUtils.contains(new Object[]{"a", null, "c"}, null));
    }

    @Test
    public void testContainsObjectNullElementNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new Object[]{"a", "b", "c"}, null));
    }

    @Test
    public void testIndexOfLongNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((long[]) null, 1L));
    }

    @Test
    public void testIndexOfLongEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new long[0], 1L));
    }

    @Test
    public void testIndexOfLongFound() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new long[]{1L, 2L, 3L}, 2L));
    }

    @Test
    public void testIndexOfLongNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new long[]{1L, 2L, 3L}, 4L));
    }

    @Test
    public void testIndexOfLongStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new long[]{1L, 2L, 3L, 2L}, 2L, 2));
    }

    @Test
    public void testIndexOfLongStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new long[]{1L, 2L, 3L}, 2L, -5));
    }

    @Test
    public void testIndexOfLongStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new long[]{1L, 2L, 3L}, 2L, 5));
    }
    
    @Test
    public void testLastIndexOfLongNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((long[]) null, 1L));
    }

    @Test
    public void testLastIndexOfLongEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new long[0], 1L));
    }

    @Test
    public void testLastIndexOfLongFound() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new long[]{1L, 2L, 3L, 2L}, 2L));
    }

    @Test
    public void testLastIndexOfLongNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new long[]{1L, 2L, 3L}, 4L));
    }

    @Test
    public void testLastIndexOfLongStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new long[]{1L, 2L, 3L, 2L}, 2L, 2));
    }

    @Test
    public void testLastIndexOfLongStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new long[]{1L, 2L, 3L}, 2L, -5));
    }

    @Test
    public void testLastIndexOfLongStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new long[]{1L, 2L, 3L}, 3L, 5));
    }

    @Test
    public void testContainsLongNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((long[]) null, 1L));
    }

    @Test
    public void testContainsLongEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new long[0], 1L));
    }

    @Test
    public void testContainsLongFound() throws Exception {
        assertTrue(ArrayUtils.contains(new long[]{1L, 2L, 3L}, 2L));
    }

    @Test
    public void testContainsLongNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new long[]{1L, 2L, 3L}, 4L));
    }

    @Test
    public void testIndexOfIntNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((int[]) null, 1));
    }

    @Test
    public void testIndexOfIntEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new int[0], 1));
    }

    @Test
    public void testIndexOfIntFound() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new int[]{1, 2, 3}, 2));
    }

    @Test
    public void testIndexOfIntNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new int[]{1, 2, 3}, 4));
    }

    @Test
    public void testIndexOfIntStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new int[]{1, 2, 3, 2}, 2, 2));
    }

    @Test
    public void testIndexOfIntStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new int[]{1, 2, 3}, 2, -5));
    }

    @Test
    public void testIndexOfIntStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new int[]{1, 2, 3}, 2, 5));
    }

    @Test
    public void testLastIndexOfIntNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((int[]) null, 1));
    }

    @Test
    public void testLastIndexOfIntEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new int[0], 1));
    }

    @Test
    public void testLastIndexOfIntFound() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new int[]{1, 2, 3, 2}, 2));
    }

    @Test
    public void testLastIndexOfIntNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new int[]{1, 2, 3}, 4));
    }

    @Test
    public void testLastIndexOfIntStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new int[]{1, 2, 3, 2}, 2, 2));
    }

    @Test
    public void testLastIndexOfIntStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new int[]{1, 2, 3}, 2, -5));
    }

    @Test
    public void testLastIndexOfIntStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new int[]{1, 2, 3}, 3, 5));
    }

    @Test
    public void testContainsIntNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((int[]) null, 1));
    }

    @Test
    public void testContainsIntEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new int[0], 1));
    }

    @Test
    public void testContainsIntFound() throws Exception {
        assertTrue(ArrayUtils.contains(new int[]{1, 2, 3}, 2));
    }

    @Test
    public void testContainsIntNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new int[]{1, 2, 3}, 4));
    }

    @Test
    public void testIndexOfShortNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((short[]) null, (short) 1));
    }

    @Test
    public void testIndexOfShortEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new short[0], (short) 1));
    }

    @Test
    public void testIndexOfShortFound() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new short[]{(short) 1, (short) 2, (short) 3}, (short) 2));
    }

    @Test
    public void testIndexOfShortNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new short[]{(short) 1, (short) 2, (short) 3}, (short) 4));
    }

    @Test
    public void testIndexOfShortStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new short[]{(short) 1, (short) 2, (short) 3, (short) 2}, (short) 2, 2));
    }

    @Test
    public void testIndexOfShortStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new short[]{(short) 1, (short) 2, (short) 3}, (short) 2, -5));
    }

    @Test
    public void testIndexOfShortStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new short[]{(short) 1, (short) 2, (short) 3}, (short) 2, 5));
    }

    @Test
    public void testLastIndexOfShortNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((short[]) null, (short) 1));
    }

    @Test
    public void testLastIndexOfShortEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new short[0], (short) 1));
    }

    @Test
    public void testLastIndexOfShortFound() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new short[]{(short) 1, (short) 2, (short) 3, (short) 2}, (short) 2));
    }

    @Test
    public void testLastIndexOfShortNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new short[]{(short) 1, (short) 2, (short) 3}, (short) 4));
    }

    @Test
    public void testLastIndexOfShortStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new short[]{(short) 1, (short) 2, (short) 3, (short) 2}, (short) 2, 2));
    }

    @Test
    public void testLastIndexOfShortStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new short[]{(short) 1, (short) 2, (short) 3}, (short) 2, -5));
    }

    @Test
    public void testLastIndexOfShortStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new short[]{(short) 1, (short) 2, (short) 3}, (short) 3, 5));
    }

    @Test
    public void testContainsShortNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((short[]) null, (short) 1));
    }

    @Test
    public void testContainsShortEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new short[0], (short) 1));
    }

    @Test
    public void testContainsShortFound() throws Exception {
        assertTrue(ArrayUtils.contains(new short[]{(short) 1, (short) 2, (short) 3}, (short) 2));
    }

    @Test
    public void testContainsShortNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new short[]{(short) 1, (short) 2, (short) 3}, (short) 4));
    }

    @Test
    public void testIndexOfCharNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((char[]) null, 'a'));
    }

    @Test
    public void testIndexOfCharEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new char[0], 'a'));
    }

    @Test
    public void testIndexOfCharFound() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new char[]{'a', 'b', 'c'}, 'b'));
    }

    @Test
    public void testIndexOfCharNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new char[]{'a', 'b', 'c'}, 'd'));
    }

    @Test
    public void testIndexOfCharStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new char[]{'a', 'b', 'c', 'b'}, 'b', 2));
    }

    @Test
    public void testIndexOfCharStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new char[]{'a', 'b', 'c'}, 'b', -5));
    }

    @Test
    public void testIndexOfCharStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new char[]{'a', 'b', 'c'}, 'b', 5));
    }

    @Test
    public void testLastIndexOfCharNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((char[]) null, 'a'));
    }

    @Test
    public void testLastIndexOfCharEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new char[0], 'a'));
    }

    @Test
    public void testLastIndexOfCharFound() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new char[]{'a', 'b', 'c', 'b'}, 'b'));
    }

    @Test
    public void testLastIndexOfCharNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new char[]{'a', 'b', 'c'}, 'd'));
    }

    @Test
    public void testLastIndexOfCharStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new char[]{'a', 'b', 'c', 'b'}, 'b', 2));
    }

    @Test
    public void testLastIndexOfCharStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new char[]{'a', 'b', 'c'}, 'b', -5));
    }

    @Test
    public void testLastIndexOfCharStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new char[]{'a', 'b', 'c'}, 'c', 5));
    }

    @Test
    public void testContainsCharNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((char[]) null, 'a'));
    }

    @Test
    public void testContainsCharEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new char[0], 'a'));
    }

    @Test
    public void testContainsCharFound() throws Exception {
        assertTrue(ArrayUtils.contains(new char[]{'a', 'b', 'c'}, 'b'));
    }

    @Test
    public void testContainsCharNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new char[]{'a', 'b', 'c'}, 'd'));
    }

    @Test
    public void testIndexOfByteNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((byte[]) null, (byte) 1));
    }

    @Test
    public void testIndexOfByteEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new byte[0], (byte) 1));
    }

    @Test
    public void testIndexOfByteFound() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 2));
    }

    @Test
    public void testIndexOfByteNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 4));
    }

    @Test
    public void testIndexOfByteStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 2}, (byte) 2, 2));
    }

    @Test
    public void testIndexOfByteStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 2, -5));
    }

    @Test
    public void testIndexOfByteStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 2, 5));
    }

    @Test
    public void testLastIndexOfByteNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((byte[]) null, (byte) 1));
    }

    @Test
    public void testLastIndexOfByteEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new byte[0], (byte) 1));
    }

    @Test
    public void testLastIndexOfByteFound() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 2}, (byte) 2));
    }

    @Test
    public void testLastIndexOfByteNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 4));
    }

    @Test
    public void testLastIndexOfByteStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 2}, (byte) 2, 2));
    }

    @Test
    public void testLastIndexOfByteStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 2, -5));
    }

    @Test
    public void testLastIndexOfByteStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 3, 5));
    }

    @Test
    public void testContainsByteNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((byte[]) null, (byte) 1));
    }

    @Test
    public void testContainsByteEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new byte[0], (byte) 1));
    }

    @Test
    public void testContainsByteFound() throws Exception {
        assertTrue(ArrayUtils.contains(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 2));
    }

    @Test
    public void testContainsByteNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new byte[]{(byte) 1, (byte) 2, (byte) 3}, (byte) 4));
    }

    @Test
    public void testIndexOfDoubleNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((double[]) null, 1.0));
    }

    @Test
    public void testIndexOfDoubleEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new double[0], 1.0));
    }

    @Test
    public void testIndexOfDoubleFound() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new double[]{1.0, 2.0, 3.0}, 2.0));
    }

    @Test
    public void testIndexOfDoubleNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new double[]{1.0, 2.0, 3.0}, 4.0));
    }

    @Test
    public void testIndexOfDoubleTolerance() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new double[]{1.0, 2.00001, 3.0}, 2.0, 0.0001));
    }

    @Test
    public void testIndexOfDoubleToleranceNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new double[]{1.0, 2.001, 3.0}, 2.0, 0.0001));
    }

    @Test
    public void testIndexOfDoubleStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new double[]{1.0, 2.0, 3.0, 2.0}, 2.0, 2));
    }

    @Test
    public void testIndexOfDoubleStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new double[]{1.0, 2.0, 3.0}, 2.0, -5));
    }

    @Test
    public void testIndexOfDoubleStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new double[]{1.0, 2.0, 3.0}, 2.0, 5));
    }

    @Test
    public void testIndexOfDoubleStartIndexTolerance() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new double[]{1.0, 2.0, 3.00001, 2.0}, 2.0, 2, 0.0001));
    }

    @Test
    public void testIndexOfDoubleStartIndexToleranceNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new double[]{1.0, 2.00001, 3.0}, 2.0, -5, 0.0001));
    }

    @Test
    public void testIndexOfDoubleStartIndexTolerancePastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new double[]{1.0, 2.0, 3.0}, 2.0, 5, 0.0001));
    }

    @Test
    public void testLastIndexOfDoubleNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((double[]) null, 1.0));
    }

    @Test
    public void testLastIndexOfDoubleEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[0], 1.0));
    }

    @Test
    public void testLastIndexOfDoubleFound() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new double[]{1.0, 2.0, 3.0, 2.0}, 2.0));
    }

    @Test
    public void testLastIndexOfDoubleNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[]{1.0, 2.0, 3.0}, 4.0));
    }

    @Test
    public void testLastIndexOfDoubleTolerance() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new double[]{1.0, 2.00001, 3.0, 2.00002}, 2.0, 0.0001));
    }

    @Test
    public void testLastIndexOfDoubleToleranceNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[]{1.0, 2.001, 3.0}, 2.0, 0.0001));
    }

    @Test
    public void testLastIndexOfDoubleStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new double[]{1.0, 2.0, 3.0, 2.0}, 2.0, 2));
    }

    @Test
    public void testLastIndexOfDoubleStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[]{1.0, 2.0, 3.0}, 2.0, -5));
    }

    @Test
    public void testLastIndexOfDoubleStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new double[]{1.0, 2.0, 3.0}, 3.0, 5));
    }

    @Test
    public void testLastIndexOfDoubleStartIndexTolerance() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new double[]{1.0, 2.0, 3.00001, 2.0}, 2.0, 3, 0.0001));
    }

    @Test
    public void testLastIndexOfDoubleStartIndexToleranceNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[]{1.0, 2.0, 3.0}, 2.0, -5, 0.0001));
    }

    @Test
    public void testLastIndexOfDoubleStartIndexToleranceOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new double[]{1.0, 2.0, 3.00001}, 3.0, 5, 0.0001));
    }

    @Test
    public void testContainsDoubleNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((double[]) null, 1.0));
    }

    @Test
    public void testContainsDoubleEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new double[0], 1.0));
    }

    @Test
    public void testContainsDoubleFound() throws Exception {
        assertTrue(ArrayUtils.contains(new double[]{1.0, 2.0, 3.0}, 2.0));
    }

    @Test
    public void testContainsDoubleNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new double[]{1.0, 2.0, 3.0}, 4.0));
    }

    @Test
    public void testContainsDoubleTolerance() throws Exception {
        assertTrue(ArrayUtils.contains(new double[]{1.0, 2.00001, 3.0}, 2.0, 0.0001));
    }

    @Test
    public void testContainsDoubleToleranceNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new double[]{1.0, 2.001, 3.0}, 2.0, 0.0001));
    }

    @Test
    public void testIndexOfFloatNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((float[]) null, 1.0f));
    }

    @Test
    public void testIndexOfFloatEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new float[0], 1.0f));
    }

    @Test
    public void testIndexOfFloatFound() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new float[]{1.0f, 2.0f, 3.0f}, 2.0f));
    }

    @Test
    public void testIndexOfFloatNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new float[]{1.0f, 2.0f, 3.0f}, 4.0f));
    }

    @Test
    public void testIndexOfFloatStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new float[]{1.0f, 2.0f, 3.0f, 2.0f}, 2.0f, 2));
    }

    @Test
    public void testIndexOfFloatStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new float[]{1.0f, 2.0f, 3.0f}, 2.0f, -5));
    }

    @Test
    public void testIndexOfFloatStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new float[]{1.0f, 2.0f, 3.0f}, 2.0f, 5));
    }

    @Test
    public void testLastIndexOfFloatNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((float[]) null, 1.0f));
    }

    @Test
    public void testLastIndexOfFloatEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new float[0], 1.0f));
    }

    @Test
    public void testLastIndexOfFloatFound() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new float[]{1.0f, 2.0f, 3.0f, 2.0f}, 2.0f));
    }

    @Test
    public void testLastIndexOfFloatNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new float[]{1.0f, 2.0f, 3.0f}, 4.0f));
    }

    @Test
    public void testLastIndexOfFloatStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new float[]{1.0f, 2.0f, 3.0f, 2.0f}, 2.0f, 2));
    }

    @Test
    public void testLastIndexOfFloatStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new float[]{1.0f, 2.0f, 3.0f}, 2.0f, -5));
    }

    @Test
    public void testLastIndexOfFloatStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new float[]{1.0f, 2.0f, 3.0f}, 3.0f, 5));
    }

    @Test
    public void testContainsFloatNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((float[]) null, 1.0f));
    }

    @Test
    public void testContainsFloatEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new float[0], 1.0f));
    }

    @Test
    public void testContainsFloatFound() throws Exception {
        assertTrue(ArrayUtils.contains(new float[]{1.0f, 2.0f, 3.0f}, 2.0f));
    }

    @Test
    public void testContainsFloatNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new float[]{1.0f, 2.0f, 3.0f}, 4.0f));
    }

    @Test
    public void testIndexOfBooleanNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((boolean[]) null, true));
    }

    @Test
    public void testIndexOfBooleanEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new boolean[0], true));
    }

    @Test
    public void testIndexOfBooleanFoundTrue() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new boolean[]{false, true, false}, true));
    }

    @Test
    public void testIndexOfBooleanFoundFalse() throws Exception {
        assertEquals(0, ArrayUtils.indexOf(new boolean[]{false, true, false}, false));
    }

    @Test
    public void testIndexOfBooleanNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new boolean[]{false, true}, true));
    }

    @Test
    public void testIndexOfBooleanStartIndex() throws Exception {
        assertEquals(2, ArrayUtils.indexOf(new boolean[]{false, true, false, true}, true, 2));
    }

    @Test
    public void testIndexOfBooleanStartIndexNegative() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(new boolean[]{false, true, false}, true, -5));
    }

    @Test
    public void testIndexOfBooleanStartIndexPastEnd() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new boolean[]{false, true}, true, 5));
    }

    @Test
    public void testLastIndexOfBooleanNullArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((boolean[]) null, true));
    }

    @Test
    public void testLastIndexOfBooleanEmptyArray() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new boolean[0], true));
    }

    @Test
    public void testLastIndexOfBooleanFoundTrue() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new boolean[]{false, true, false, true}, true));
    }

    @Test
    public void testLastIndexOfBooleanFoundFalse() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new boolean[]{false, true, false}, false));
    }

    @Test
    public void testLastIndexOfBooleanNotFound() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new boolean[]{true, true}, false));
    }

    @Test
    public void testLastIndexOfBooleanStartIndex() throws Exception {
        assertEquals(1, ArrayUtils.lastIndexOf(new boolean[]{false, true, false, true}, true, 2));
    }

    @Test
    public void testLastIndexOfBooleanStartIndexNegative() throws Exception {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new boolean[]{false, true, false}, true, -5));
    }

    @Test
    public void testLastIndexOfBooleanStartIndexOverLength() throws Exception {
        assertEquals(2, ArrayUtils.lastIndexOf(new boolean[]{false, true, false}, false, 5));
    }

    @Test
    public void testContainsBooleanNullArray() throws Exception {
        assertFalse(ArrayUtils.contains((boolean[]) null, true));
    }

    @Test
    public void testContainsBooleanEmptyArray() throws Exception {
        assertFalse(ArrayUtils.contains(new boolean[0], true));
    }

    @Test
    public void testContainsBooleanFoundTrue() throws Exception {
        assertTrue(ArrayUtils.contains(new boolean[]{false, true, false}, true));
    }

    @Test
    public void testContainsBooleanFoundFalse() throws Exception {
        assertTrue(ArrayUtils.contains(new boolean[]{false, true, false}, false));
    }

    @Test
    public void testContainsBooleanNotFound() throws Exception {
        assertFalse(ArrayUtils.contains(new boolean[]{true, true}, false));
    }

    @Test
    public void testToPrimitiveCharacterNull() throws Exception {
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
    }

    @Test
    public void testToPrimitiveCharacterEmpty() throws Exception {
        assertArrayEquals(new char[0], ArrayUtils.toPrimitive(new Character[0]));
    }

    @Test
    public void testToPrimitiveCharacterArray() throws Exception {
        Character[] input = {'a', 'b', 'c'};
        char[] expected = {'a', 'b', 'c'};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveCharacterArrayWithNullElement() throws Exception {
        ArrayUtils.toPrimitive(new Character[]{'a', null, 'c'});
    }

    @Test
    public void testToPrimitiveCharacterArrayWithNullValue() throws Exception {
        Character[] input = {'a', null, 'c'};
        char[] expected = {'a', 'x', 'c'};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input, 'x'));
    }

    @Test
    public void testToObjectCharacterNull() throws Exception {
        assertNull(ArrayUtils.toObject((char[]) null));
    }

    @Test
    public void testToObjectCharacterEmpty() throws Exception {
        Character[] expected = new Character[0];
        assertArrayEquals(expected, ArrayUtils.toObject(new char[0]));
    }

    @Test
    public void testToObjectCharacterArray() throws Exception {
        char[] input = {'a', 'b', 'c'};
        Character[] expected = {'a', 'b', 'c'};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    @Test
    public void testToPrimitiveLongNull() throws Exception {
        assertNull(ArrayUtils.toPrimitive((Long[]) null));
    }

    @Test
    public void testToPrimitiveLongEmpty() throws Exception {
        assertArrayEquals(new long[0], ArrayUtils.toPrimitive(new Long[0]));
    }

    @Test
    public void testToPrimitiveLongArray() throws Exception {
        Long[] input = {1L, 2L, 3L};
        long[] expected = {1L, 2L, 3L};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveLongArrayWithNullElement() throws Exception {
        ArrayUtils.toPrimitive(new Long[]{1L, null, 3L});
    }

    @Test
    public void testToPrimitiveLongArrayWithNullValue() throws Exception {
        Long[] input = {1L, null, 3L};
        long[] expected = {1L, (long) -1, 3L};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input, -1L));
    }

    @Test
    public void testToObjectLongNull() throws Exception {
        assertNull(ArrayUtils.toObject((long[]) null));
    }

    @Test
    public void testToObjectLongEmpty() throws Exception {
        Long[] expected = new Long[0];
        assertArrayEquals(expected, ArrayUtils.toObject(new long[0]));
    }

    @Test
    public void testToObjectLongArray() throws Exception {
        long[] input = {1L, 2L, 3L};
        Long[] expected = {1L, 2L, 3L};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    @Test
    public void testToPrimitiveIntegerNull() throws Exception {
        assertNull(ArrayUtils.toPrimitive((Integer[]) null));
    }

    @Test
    public void testToPrimitiveIntegerEmpty() throws Exception {
        assertArrayEquals(new int[0], ArrayUtils.toPrimitive(new Integer[0]));
    }

    @Test
    public void testToPrimitiveIntegerArray() throws Exception {
        Integer[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveIntegerArrayWithNullElement() throws Exception {
        ArrayUtils.toPrimitive(new Integer[]{1, null, 3});
    }

    @Test
    public void testToPrimitiveIntegerArrayWithNullValue() throws Exception {
        Integer[] input = {1, null, 3};
        int[] expected = {1, -1, 3};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input, -1));
    }

    @Test
    public void testToObjectIntegerNull() throws Exception {
        assertNull(ArrayUtils.toObject((int[]) null));
    }

    @Test
    public void testToObjectIntegerEmpty() throws Exception {
        Integer[] expected = new Integer[0];
        assertArrayEquals(expected, ArrayUtils.toObject(new int[0]));
    }

    @Test
    public void testToObjectIntegerArray() throws Exception {
        int[] input = {1, 2, 3};
        Integer[] expected = {1, 2, 3};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    @Test
    public void testToPrimitiveShortNull() throws Exception {
        assertNull(ArrayUtils.toPrimitive((Short[]) null));
    }

    @Test
    public void testToPrimitiveShortEmpty() throws Exception {
        assertArrayEquals(new short[0], ArrayUtils.toPrimitive(new Short[0]));
    }

    @Test
    public void testToPrimitiveShortArray() throws Exception {
        Short[] input = {(short) 1, (short) 2, (short) 3};
        short[] expected = {(short) 1, (short) 2, (short) 3};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveShortArrayWithNullElement() throws Exception {
        ArrayUtils.toPrimitive(new Short[]{(short) 1, null, (short) 3});
    }

    @Test
    public void testToPrimitiveShortArrayWithNullValue() throws Exception {
        Short[] input = {(short) 1, null, (short) 3};
        short[] expected = {(short) 1, (short) -1, (short) 3};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input, (short) -1));
    }

    @Test
    public void testToObjectShortNull() throws Exception {
        assertNull(ArrayUtils.toObject((short[]) null));
    }

    @Test
    public void testToObjectShortEmpty() throws Exception {
        Short[] expected = new Short[0];
        assertArrayEquals(expected, ArrayUtils.toObject(new short[0]));
    }

    @Test
    public void testToObjectShortArray() throws Exception {
        short[] input = {(short) 1, (short) 2, (short) 3};
        Short[] expected = {(short) 1, (short) 2, (short) 3};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    @Test
    public void testToPrimitiveByteNull() throws Exception {
        assertNull(ArrayUtils.toPrimitive((Byte[]) null));
    }

    @Test
    public void testToPrimitiveByteEmpty() throws Exception {
        assertArrayEquals(new byte[0], ArrayUtils.toPrimitive(new Byte[0]));
    }

    @Test
    public void testToPrimitiveByteArray() throws Exception {
        Byte[] input = {(byte) 1, (byte) 2, (byte) 3};
        byte[] expected = {(byte) 1, (byte) 2, (byte) 3};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveByteArrayWithNullElement() throws Exception {
        ArrayUtils.toPrimitive(new Byte[]{(byte) 1, null, (byte) 3});
    }

    @Test
    public void testToPrimitiveByteArrayWithNullValue() throws Exception {
        Byte[] input = {(byte) 1, null, (byte) 3};
        byte[] expected = {(byte) 1, (byte) -1, (byte) 3};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input, (byte) -1));
    }

    @Test
    public void testToObjectByteNull() throws Exception {
        assertNull(ArrayUtils.toObject((byte[]) null));
    }

    @Test
    public void testToObjectByteEmpty() throws Exception {
        Byte[] expected = new Byte[0];
        assertArrayEquals(expected, ArrayUtils.toObject(new byte[0]));
    }

    @Test
    public void testToObjectByteArray() throws Exception {
        byte[] input = {(byte) 1, (byte) 2, (byte) 3};
        Byte[] expected = {(byte) 1, (byte) 2, (byte) 3};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    @Test
    public void testToPrimitiveDoubleNull() throws Exception {
        assertNull(ArrayUtils.toPrimitive((Double[]) null));
    }

    @Test
    public void testToPrimitiveDoubleEmpty() throws Exception {
        assertArrayEquals(new double[0], ArrayUtils.toPrimitive(new Double[0]), 0.0);
    }

    @Test
    public void testToPrimitiveDoubleArray() throws Exception {
        Double[] input = {1.0, 2.0, 3.0};
        double[] expected = {1.0, 2.0, 3.0};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input), 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveDoubleArrayWithNullElement() throws Exception {
        ArrayUtils.toPrimitive(new Double[]{1.0, null, 3.0});
    }

    @Test
    public void testToPrimitiveDoubleArrayWithNullValue() throws Exception {
        Double[] input = {1.0, null, 3.0};
        double[] expected = {1.0, -1.0, 3.0};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input, -1.0), 0.0);
    }

    @Test
    public void testToObjectDoubleNull() throws Exception {
        assertNull(ArrayUtils.toObject((double[]) null));
    }

    @Test
    public void testToObjectDoubleEmpty() throws Exception {
        Double[] expected = new Double[0];
        assertArrayEquals(expected, ArrayUtils.toObject(new double[0]));
    }

    @Test
    public void testToObjectDoubleArray() throws Exception {
        double[] input = {1.0, 2.0, 3.0};
        Double[] expected = {1.0, 2.0, 3.0};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    @Test
    public void testToPrimitiveFloatNull() throws Exception {
        assertNull(ArrayUtils.toPrimitive((Float[]) null));
    }

    @Test
    public void testToPrimitiveFloatEmpty() throws Exception {
        assertArrayEquals(new float[0], ArrayUtils.toPrimitive(new Float[0]), 0.0f);
    }

    @Test
    public void testToPrimitiveFloatArray() throws Exception {
        Float[] input = {1.0f, 2.0f, 3.0f};
        float[] expected = {1.0f, 2.0f, 3.0f};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input), 0.0f);
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitiveFloatArrayWithNullElement() throws Exception {
        ArrayUtils.toPrimitive(new Float[]{1.0f, null, 3.0f});
    }

    @Test
    public void testToPrimitiveFloatArrayWithNullValue() throws Exception {
        Float[] input = {1.0f, null, 3.0f};
        float[] expected = {1.0f, -1.0f, 3.0f};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input, -1.0f), 0.0f);
    }

    @Test
    public void testToObjectFloatNull() throws Exception {
        assertNull(ArrayUtils.toObject((float[]) null));
    }

    @Test
    public void testToObjectFloatEmpty() throws Exception {
        Float[] expected = new Float[0];
        assertArrayEquals(expected, ArrayUtils.toObject(new float[0]));
    }

    @Test
    public void testToObjectFloatArray() throws Exception {
        float[] input = {1.0f, 2.0f, 3.0f};
        Float[] expected = {1.0f, 2.0f, 3.0f};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    @Test
    public void testToPrimitiveBooleanNull() throws Exception {
        assertNull(ArrayUtils.toPrimitive((Boolean[]) null));
    }



    @Test(expected = NullPointerException.class)
    public void testToPrimitiveBooleanArrayWithNullElement() throws Exception {
        ArrayUtils.toPrimitive(new Boolean[]{true, null, false});
    }


    @Test
    public void testToObjectBooleanNull() throws Exception {
        assertNull(ArrayUtils.toObject((boolean[]) null));
    }

    @Test
    public void testToObjectBooleanEmpty() throws Exception {
        Boolean[] expected = new Boolean[0];
        assertArrayEquals(expected, ArrayUtils.toObject(new boolean[0]));
    }

    @Test
    public void testToObjectBooleanArray() throws Exception {
        boolean[] input = {true, false, true};
        Boolean[] expected = {true, false, true};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    @Test
    public void testIsEmptyObjectArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
    }

    @Test
    public void testIsEmptyObjectArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new Object[0]));
    }

    @Test
    public void testIsEmptyObjectArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new Object[]{"a"}));
    }

    @Test
    public void testIsEmptyLongArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((long[]) null));
    }

    @Test
    public void testIsEmptyLongArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new long[0]));
    }

    @Test
    public void testIsEmptyLongArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new long[]{1L}));
    }

    @Test
    public void testIsEmptyIntArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((int[]) null));
    }

    @Test
    public void testIsEmptyIntArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new int[0]));
    }

    @Test
    public void testIsEmptyIntArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new int[]{1}));
    }

    @Test
    public void testIsEmptyShortArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((short[]) null));
    }

    @Test
    public void testIsEmptyShortArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new short[0]));
    }

    @Test
    public void testIsEmptyShortArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new short[]{1}));
    }

    @Test
    public void testIsEmptyCharArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((char[]) null));
    }

    @Test
    public void testIsEmptyCharArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new char[0]));
    }

    @Test
    public void testIsEmptyCharArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new char[]{'a'}));
    }

    @Test
    public void testIsEmptyByteArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((byte[]) null));
    }

    @Test
    public void testIsEmptyByteArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new byte[0]));
    }

    @Test
    public void testIsEmptyByteArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new byte[]{1}));
    }

    @Test
    public void testIsEmptyDoubleArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((double[]) null));
    }

    @Test
    public void testIsEmptyDoubleArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new double[0]));
    }

    @Test
    public void testIsEmptyDoubleArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new double[]{1.0}));
    }

    @Test
    public void testIsEmptyFloatArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((float[]) null));
    }

    @Test
    public void testIsEmptyFloatArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new float[0]));
    }

    @Test
    public void testIsEmptyFloatArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new float[]{1.0f}));
    }

    @Test
    public void testIsEmptyBooleanArrayNull() throws Exception {
        assertTrue(ArrayUtils.isEmpty((boolean[]) null));
    }

    @Test
    public void testIsEmptyBooleanArrayEmpty() throws Exception {
        assertTrue(ArrayUtils.isEmpty(new boolean[0]));
    }

    @Test
    public void testIsEmptyBooleanArrayNonEmpty() throws Exception {
        assertFalse(ArrayUtils.isEmpty(new boolean[]{true}));
    }


    @Test
    public void testAddAllObjectArray1Null() throws Exception {
        Object[] array2 = {"a", "b"};
        assertArrayEquals(array2, ArrayUtils.addAll(null, array2));
    }

    @Test
    public void testAddAllObjectArray2Null() throws Exception {
        Object[] array1 = {"a", "b"};
        assertArrayEquals(array1, ArrayUtils.addAll(array1, null));
    }

    @Test
    public void testAddAllObjectEmptyEmpty() throws Exception {
        Object[] result = ArrayUtils.addAll(new Object[0], new Object[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAllObjectBasic() throws Exception {
        Object[] array1 = {"a", "b"};
        Object[] array2 = {"c", "d"};
        Object[] result = ArrayUtils.addAll(array1, array2);
        assertArrayEquals(new Object[]{"a", "b", "c", "d"}, result);
    }
    
    @Test
    public void testAddAllBooleanNullNull() throws Exception {
        assertNull(ArrayUtils.addAll((boolean[]) null, (boolean[]) null));
    }



    @Test
    public void testAddAllBooleanEmptyEmpty() throws Exception {
        boolean[] result = ArrayUtils.addAll(new boolean[0], new boolean[0]);
        assertEquals(0, result.length);
    }


    @Test
    public void testAddAllCharNullNull() throws Exception {
        assertNull(ArrayUtils.addAll((char[]) null, (char[]) null));
    }

    @Test
    public void testAddAllCharArray1Null() throws Exception {
        char[] array2 = {'a', 'b'};
        assertArrayEquals(array2, ArrayUtils.addAll(null, array2));
    }

    @Test
    public void testAddAllCharArray2Null() throws Exception {
        char[] array1 = {'a', 'b'};
        assertArrayEquals(array1, ArrayUtils.addAll(array1, null));
    }

    @Test
    public void testAddAllCharEmptyEmpty() throws Exception {
        char[] result = ArrayUtils.addAll(new char[0], new char[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAllCharBasic() throws Exception {
        char[] array1 = {'a', 'b'};
        char[] array2 = {'c', 'd'};
        char[] result = ArrayUtils.addAll(array1, array2);
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd'}, result);
    }

    @Test
    public void testAddAllByteNullNull() throws Exception {
        assertNull(ArrayUtils.addAll((byte[]) null, (byte[]) null));
    }

    @Test
    public void testAddAllByteArray1Null() throws Exception {
        byte[] array2 = {1, 2};
        assertArrayEquals(array2, ArrayUtils.addAll(null, array2));
    }

    @Test
    public void testAddAllByteArray2Null() throws Exception {
        byte[] array1 = {1, 2};
        assertArrayEquals(array1, ArrayUtils.addAll(array1, null));
    }

    @Test
    public void testAddAllByteEmptyEmpty() throws Exception {
        byte[] result = ArrayUtils.addAll(new byte[0], new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAllByteBasic() throws Exception {
        byte[] array1 = {1, 2};
        byte[] array2 = {3, 4};
        byte[] result = ArrayUtils.addAll(array1, array2);
        assertArrayEquals(new byte[]{1, 2, 3, 4}, result);
    }

    @Test
    public void testAddAllShortNullNull() throws Exception {
        assertNull(ArrayUtils.addAll((short[]) null, (short[]) null));
    }

    @Test
    public void testAddAllShortArray1Null() throws Exception {
        short[] array2 = {1, 2};
        assertArrayEquals(array2, ArrayUtils.addAll(null, array2));
    }

    @Test
    public void testAddAllShortArray2Null() throws Exception {
        short[] array1 = {1, 2};
        assertArrayEquals(array1, ArrayUtils.addAll(array1, null));
    }

    @Test
    public void testAddAllShortEmptyEmpty() throws Exception {
        short[] result = ArrayUtils.addAll(new short[0], new short[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAllShortBasic() throws Exception {
        short[] array1 = {1, 2};
        short[] array2 = {3, 4};
        short[] result = ArrayUtils.addAll(array1, array2);
        assertArrayEquals(new short[]{1, 2, 3, 4}, result);
    }

    @Test
    public void testAddAllIntNullNull() throws Exception {
        assertNull(ArrayUtils.addAll((int[]) null, (int[]) null));
    }

    @Test
    public void testAddAllIntArray1Null() throws Exception {
        int[] array2 = {1, 2};
        assertArrayEquals(array2, ArrayUtils.addAll(null, array2));
    }

    @Test
    public void testAddAllIntArray2Null() throws Exception {
        int[] array1 = {1, 2};
        assertArrayEquals(array1, ArrayUtils.addAll(array1, null));
    }

    @Test
    public void testAddAllIntEmptyEmpty() throws Exception {
        int[] result = ArrayUtils.addAll(new int[0], new int[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAllIntBasic() throws Exception {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        int[] result = ArrayUtils.addAll(array1, array2);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void testAddAllLongNullNull() throws Exception {
        assertNull(ArrayUtils.addAll((long[]) null, (long[]) null));
    }

    @Test
    public void testAddAllLongArray1Null() throws Exception {
        long[] array2 = {1L, 2L};
        assertArrayEquals(array2, ArrayUtils.addAll(null, array2));
    }

    @Test
    public void testAddAllLongArray2Null() throws Exception {
        long[] array1 = {1L, 2L};
        assertArrayEquals(array1, ArrayUtils.addAll(array1, null));
    }

    @Test
    public void testAddAllLongEmptyEmpty() throws Exception {
        long[] result = ArrayUtils.addAll(new long[0], new long[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAllLongBasic() throws Exception {
        long[] array1 = {1L, 2L};
        long[] array2 = {3L, 4L};
        long[] result = ArrayUtils.addAll(array1, array2);
        assertArrayEquals(new long[]{1L, 2L, 3L, 4L}, result);
    }

    @Test
    public void testAddAllFloatNullNull() throws Exception {
        assertNull(ArrayUtils.addAll((float[]) null, (float[]) null));
    }

    @Test
    public void testAddAllFloatArray1Null() throws Exception {
        float[] array2 = {1.0f, 2.0f};
        assertArrayEquals(array2, ArrayUtils.addAll(null, array2), 0.0f);
    }

    @Test
    public void testAddAllFloatArray2Null() throws Exception {
        float[] array1 = {1.0f, 2.0f};
        assertArrayEquals(array1, ArrayUtils.addAll(array1, null), 0.0f);
    }

    @Test
    public void testAddAllFloatEmptyEmpty() throws Exception {
        float[] result = ArrayUtils.addAll(new float[0], new float[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAllFloatBasic() throws Exception {
        float[] array1 = {1.0f, 2.0f};
        float[] array2 = {3.0f, 4.0f};
        float[] result = ArrayUtils.addAll(array1, array2);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f, 4.0f}, result, 0.0f);
    }

    @Test
    public void testAddAllDoubleNullNull() throws Exception {
        assertNull(ArrayUtils.addAll((double[]) null, (double[]) null));
    }

    @Test
    public void testAddAllDoubleArray1Null() throws Exception {
        double[] array2 = {1.0, 2.0};
        assertArrayEquals(array2, ArrayUtils.addAll(null, array2), 0.0);
    }

    @Test
    public void testAddAllDoubleArray2Null() throws Exception {
        double[] array1 = {1.0, 2.0};
        assertArrayEquals(array1, ArrayUtils.addAll(array1, null), 0.0);
    }

    @Test
    public void testAddAllDoubleEmptyEmpty() throws Exception {
        double[] result = ArrayUtils.addAll(new double[0], new double[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAllDoubleBasic() throws Exception {
        double[] array1 = {1.0, 2.0};
        double[] array2 = {3.0, 4.0};
        double[] result = ArrayUtils.addAll(array1, array2);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, result, 0.0);
    }

    @Test
    public void testAddObjectNullElement() throws Exception {
        Object[] array = null;
        Object element = "a";
        Object[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new Object[]{"a"}, result);
    }

    @Test
    public void testAddObjectElementNull() throws Exception {
        Object[] array = {"a"};
        Object element = null;
        Object[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new Object[]{"a", null}, result);
    }

    @Test
    public void testAddObjectBasic() throws Exception {
        Object[] array = {"a", "b"};
        Object element = "c";
        Object[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new Object[]{"a", "b", "c"}, result);
    }

    @Test
    public void testAddObjectEmptyArray() throws Exception {
        Object[] array = new Object[0];
        Object element = "a";
        Object[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new Object[]{"a"}, result);
    }



    @Test
    public void testAddCharA() throws Exception {
        char[] array = {'a', 'b'};
        char element = 'c';
        char[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
    }

    @Test
    public void testAddCharNullArray() throws Exception {
        char[] array = null;
        char element = 'a';
        char[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new char[]{'a'}, result);
    }

    @Test
    public void testAddByte1() throws Exception {
        byte[] array = {1, 2};
        byte element = 3;
        byte[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new byte[]{1, 2, 3}, result);
    }

    @Test
    public void testAddByteNullArray() throws Exception {
        byte[] array = null;
        byte element = 1;
        byte[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new byte[]{1}, result);
    }

    @Test
    public void testAddShort1() throws Exception {
        short[] array = {1, 2};
        short element = 3;
        short[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new short[]{1, 2, 3}, result);
    }

    @Test
    public void testAddShortNullArray() throws Exception {
        short[] array = null;
        short element = 1;
        short[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new short[]{1}, result);
    }

    @Test
    public void testAddInt1() throws Exception {
        int[] array = {1, 2};
        int element = 3;
        int[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testAddIntNullArray() throws Exception {
        int[] array = null;
        int element = 1;
        int[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void testAddLong1L() throws Exception {
        long[] array = {1L, 2L};
        long element = 3L;
        long[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new long[]{1L, 2L, 3L}, result);
    }

    @Test
    public void testAddLongNullArray() throws Exception {
        long[] array = null;
        long element = 1L;
        long[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new long[]{1L}, result);
    }

    @Test
    public void testAddFloat1f() throws Exception {
        float[] array = {1.0f, 2.0f};
        float element = 3.0f;
        float[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, result, 0.0f);
    }

    @Test
    public void testAddFloatNullArray() throws Exception {
        float[] array = null;
        float element = 1.0f;
        float[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new float[]{1.0f}, result, 0.0f);
    }

    @Test
    public void testAddDouble1d() throws Exception {
        double[] array = {1.0, 2.0};
        double element = 3.0;
        double[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, result, 0.0);
    }

    @Test
    public void testAddDoubleNullArray() throws Exception {
        double[] array = null;
        double element = 1.0;
        double[] result = ArrayUtils.add(array, element);
        assertArrayEquals(new double[]{1.0}, result, 0.0);
    }

    @Test
    public void testAddObjectWithIndexNullArray() throws Exception {
        Object[] array = null;
        int index = 0;
        Object element = "a";
        Object[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new Object[]{"a"}, result);
    }

    @Test
    public void testAddObjectWithIndexBasic() throws Exception {
        Object[] array = {"a", "c"};
        int index = 1;
        Object element = "b";
        Object[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new Object[]{"a", "b", "c"}, result);
    }

    @Test
    public void testAddObjectWithIndexEmptyArray() throws Exception {
        Object[] array = new Object[0];
        int index = 0;
        Object element = "a";
        Object[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new Object[]{"a"}, result);
    }

    @Test
    public void testAddObjectWithIndexInsertAtStart() throws Exception {
        Object[] array = {"b", "c"};
        int index = 0;
        Object element = "a";
        Object[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new Object[]{"a", "b", "c"}, result);
    }

    @Test
    public void testAddObjectWithIndexInsertAtEnd() throws Exception {
        Object[] array = {"a", "b"};
        int index = 2;
        Object element = "c";
        Object[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new Object[]{"a", "b", "c"}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddObjectWithIndexInvalidIndexTooHigh() throws Exception {
        Object[] array = {"a", "b"};
        ArrayUtils.add(array, 3, "c");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddObjectWithIndexInvalidIndexNegative() throws Exception {
        Object[] array = {"a", "b"};
        ArrayUtils.add(array, -1, "c");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddObjectWithIndexNullArrayInvalidIndex() throws Exception {
        ArrayUtils.add(null, 1, "a");
    }


    
    @Test
    public void testAddCharWithIndexA() throws Exception {
        char[] array = {'a', 'c'};
        int index = 1;
        char element = 'b';
        char[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
    }

    @Test
    public void testAddCharWithIndexNullArray() throws Exception {
        char[] array = null;
        int index = 0;
        char element = 'a';
        char[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new char[]{'a'}, result);
    }

    @Test
    public void testAddByteWithIndex1() throws Exception {
        byte[] array = {1, 3};
        int index = 1;
        byte element = 2;
        byte[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new byte[]{1, 2, 3}, result);
    }

    @Test
    public void testAddByteWithIndexNullArray() throws Exception {
        byte[] array = null;
        int index = 0;
        byte element = 1;
        byte[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new byte[]{1}, result);
    }

    @Test
    public void testAddShortWithIndex1() throws Exception {
        short[] array = {1, 3};
        int index = 1;
        short element = 2;
        short[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new short[]{1, 2, 3}, result);
    }

    @Test
    public void testAddShortWithIndexNullArray() throws Exception {
        short[] array = null;
        int index = 0;
        short element = 1;
        short[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new short[]{1}, result);
    }

    @Test
    public void testAddIntWithIndex1() throws Exception {
        int[] array = {1, 3};
        int index = 1;
        int element = 2;
        int[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testAddIntWithIndexNullArray() throws Exception {
        int[] array = null;
        int index = 0;
        int element = 1;
        int[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void testAddLongWithIndex1L() throws Exception {
        long[] array = {1L, 3L};
        int index = 1;
        long element = 2L;
        long[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new long[]{1L, 2L, 3L}, result);
    }

    @Test
    public void testAddLongWithIndexNullArray() throws Exception {
        long[] array = null;
        int index = 0;
        long element = 1L;
        long[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new long[]{1L}, result);
    }

    @Test
    public void testAddFloatWithIndex1f() throws Exception {
        float[] array = {1.0f, 3.0f};
        int index = 1;
        float element = 2.0f;
        float[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, result, 0.0f);
    }

    @Test
    public void testAddFloatWithIndexNullArray() throws Exception {
        float[] array = null;
        int index = 0;
        float element = 1.0f;
        float[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new float[]{1.0f}, result, 0.0f);
    }

    @Test
    public void testAddDoubleWithIndex1d() throws Exception {
        double[] array = {1.0, 3.0};
        int index = 1;
        double element = 2.0;
        double[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, result, 0.0);
    }

    @Test
    public void testAddDoubleWithIndexNullArray() throws Exception {
        double[] array = null;
        int index = 0;
        double element = 1.0;
        double[] result = ArrayUtils.add(array, index, element);
        assertArrayEquals(new double[]{1.0}, result, 0.0);
    }

    @Test
    public void testRemoveObjectEmptyArray() throws Exception {
        Object[] array = {};
        Object[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveObjectBasic() throws Exception {
        Object[] array = {"a", "b", "c"};
        Object[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(new Object[]{"a", "c"}, result);
    }

    @Test
    public void testRemoveObjectFirstElement() throws Exception {
        Object[] array = {"a", "b", "c"};
        Object[] result = ArrayUtils.remove(array, 0);
        assertArrayEquals(new Object[]{"b", "c"}, result);
    }

    @Test
    public void testRemoveObjectLastElement() throws Exception {
        Object[] array = {"a", "b", "c"};
        Object[] result = ArrayUtils.remove(array, 2);
        assertArrayEquals(new Object[]{"a", "b"}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveObjectInvalidIndex() throws Exception {
        Object[] array = {"a", "b"};
        ArrayUtils.remove(array, 2);
    }


    @Test
    public void testRemoveElementObjectBasic() throws Exception {
        Object[] array = {"a", "b", "c", "b"};
        Object[] result = ArrayUtils.removeElement(array, "b");
        assertArrayEquals(new Object[]{"a", "c", "b"}, result);
    }

    @Test
    public void testRemoveElementObjectNotFound() throws Exception {
        Object[] array = {"a", "b", "c"};
        Object[] result = ArrayUtils.removeElement(array, "d");
        assertArrayEquals(array, result); // Should be unchanged
    }

    @Test
    public void testRemoveElementObjectNull() throws Exception {
        Object[] array = {"a", null, "c"};
        Object[] result = ArrayUtils.removeElement(array, null);
        assertArrayEquals(new Object[]{"a", "c"}, result);
    }

    @Test
    public void testRemoveElementObjectEmpty() throws Exception {
        Object[] array = {};
        Object[] result = ArrayUtils.removeElement(array, "a");
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveElementObjectNullArray() throws Exception {
        assertNull(ArrayUtils.removeElement(null, "a"));
    }

    @Test
    public void testRemoveBooleanEmptyArray() throws Exception {
        boolean[] array = {};
        boolean[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }




    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveBooleanInvalidIndex() throws Exception {
        boolean[] array = {true, false};
        ArrayUtils.remove(array, 2);
    }




    @Test
    public void testRemoveElementBooleanEmpty() throws Exception {
        boolean[] array = {};
        boolean[] result = ArrayUtils.removeElement(array, true);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveElementBooleanNullArray() throws Exception {
        assertNull(ArrayUtils.removeElement(null, true));
    }

    @Test
    public void testRemoveCharEmptyArray() throws Exception {
        char[] array = {};
        char[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveCharBasic() throws Exception {
        char[] array = {'a', 'b', 'c'};
        char[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(new char[]{'a', 'c'}, result);
    }

    @Test
    public void testRemoveCharFirstElement() throws Exception {
        char[] array = {'a', 'b', 'c'};
        char[] result = ArrayUtils.remove(array, 0);
        assertArrayEquals(new char[]{'b', 'c'}, result);
    }

    @Test
    public void testRemoveCharLastElement() throws Exception {
        char[] array = {'a', 'b', 'c'};
        char[] result = ArrayUtils.remove(array, 2);
        assertArrayEquals(new char[]{'a', 'b'}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveCharInvalidIndex() throws Exception {
        char[] array = {'a', 'b'};
        ArrayUtils.remove(array, 2);
    }


    @Test
    public void testRemoveElementCharBasic() throws Exception {
        char[] array = {'a', 'b', 'c', 'b'};
        char[] result = ArrayUtils.removeElement(array, 'b');
        assertArrayEquals(new char[]{'a', 'c', 'b'}, result);
    }

    @Test
    public void testRemoveElementCharNotFound() throws Exception {
        char[] array = {'a', 'b', 'c'};
        char[] result = ArrayUtils.removeElement(array, 'd');
        assertArrayEquals(array, result); // Should be unchanged
    }

    @Test
    public void testRemoveElementCharEmpty() throws Exception {
        char[] array = {};
        char[] result = ArrayUtils.removeElement(array, 'a');
        assertEquals(0, result.length);
    }


    @Test
    public void testRemoveByteEmptyArray() throws Exception {
        byte[] array = {};
        byte[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveByteBasic() throws Exception {
        byte[] array = {1, 2, 3};
        byte[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(new byte[]{1, 3}, result);
    }

    @Test
    public void testRemoveByteFirstElement() throws Exception {
        byte[] array = {1, 2, 3};
        byte[] result = ArrayUtils.remove(array, 0);
        assertArrayEquals(new byte[]{2, 3}, result);
    }

    @Test
    public void testRemoveByteLastElement() throws Exception {
        byte[] array = {1, 2, 3};
        byte[] result = ArrayUtils.remove(array, 2);
        assertArrayEquals(new byte[]{1, 2}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByteInvalidIndex() throws Exception {
        byte[] array = {1, 2};
        ArrayUtils.remove(array, 2);
    }


    @Test
    public void testRemoveElementByteBasic() throws Exception {
        byte[] array = {1, 2, 3, 2};
        byte[] result = ArrayUtils.removeElement(array, (byte) 2);
        assertArrayEquals(new byte[]{1, 3, 2}, result);
    }

    @Test
    public void testRemoveElementByteNotFound() throws Exception {
        byte[] array = {1, 2, 3};
        byte[] result = ArrayUtils.removeElement(array, (byte) 4);
        assertArrayEquals(array, result); // Should be unchanged
    }

    @Test
    public void testRemoveElementByteEmpty() throws Exception {
        byte[] array = {};
        byte[] result = ArrayUtils.removeElement(array, (byte) 1);
        assertEquals(0, result.length);
    }


    @Test
    public void testRemoveShortEmptyArray() throws Exception {
        short[] array = {};
        short[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveShortBasic() throws Exception {
        short[] array = {1, 2, 3};
        short[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(new short[]{1, 3}, result);
    }

    @Test
    public void testRemoveShortFirstElement() throws Exception {
        short[] array = {1, 2, 3};
        short[] result = ArrayUtils.remove(array, 0);
        assertArrayEquals(new short[]{2, 3}, result);
    }

    @Test
    public void testRemoveShortLastElement() throws Exception {
        short[] array = {1, 2, 3};
        short[] result = ArrayUtils.remove(array, 2);
        assertArrayEquals(new short[]{1, 2}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveShortInvalidIndex() throws Exception {
        short[] array = {1, 2};
        ArrayUtils.remove(array, 2);
    }


    @Test
    public void testRemoveElementShortBasic() throws Exception {
        short[] array = {1, 2, 3, 2};
        short[] result = ArrayUtils.removeElement(array, (short) 2);
        assertArrayEquals(new short[]{1, 3, 2}, result);
    }

    @Test
    public void testRemoveElementShortNotFound() throws Exception {
        short[] array = {1, 2, 3};
        short[] result = ArrayUtils.removeElement(array, (short) 4);
        assertArrayEquals(array, result); // Should be unchanged
    }

    @Test
    public void testRemoveElementShortEmpty() throws Exception {
        short[] array = {};
        short[] result = ArrayUtils.removeElement(array, (short) 1);
        assertEquals(0, result.length);
    }


    @Test
    public void testRemoveIntEmptyArray() throws Exception {
        int[] array = {};
        int[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveIntBasic() throws Exception {
        int[] array = {1, 2, 3};
        int[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    public void testRemoveIntFirstElement() throws Exception {
        int[] array = {1, 2, 3};
        int[] result = ArrayUtils.remove(array, 0);
        assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    public void testRemoveIntLastElement() throws Exception {
        int[] array = {1, 2, 3};
        int[] result = ArrayUtils.remove(array, 2);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIntInvalidIndex() throws Exception {
        int[] array = {1, 2};
        ArrayUtils.remove(array, 2);
    }


    @Test
    public void testRemoveElementIntBasic() throws Exception {
        int[] array = {1, 2, 3, 2};
        int[] result = ArrayUtils.removeElement(array, 2);
        assertArrayEquals(new int[]{1, 3, 2}, result);
    }

    @Test
    public void testRemoveElementIntNotFound() throws Exception {
        int[] array = {1, 2, 3};
        int[] result = ArrayUtils.removeElement(array, 4);
        assertArrayEquals(array, result); // Should be unchanged
    }

    @Test
    public void testRemoveElementIntEmpty() throws Exception {
        int[] array = {};
        int[] result = ArrayUtils.removeElement(array, 1);
        assertEquals(0, result.length);
    }


    @Test
    public void testRemoveLongEmptyArray() throws Exception {
        long[] array = {};
        long[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveLongBasic() throws Exception {
        long[] array = {1L, 2L, 3L};
        long[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(new long[]{1L, 3L}, result);
    }

    @Test
    public void testRemoveLongFirstElement() throws Exception {
        long[] array = {1L, 2L, 3L};
        long[] result = ArrayUtils.remove(array, 0);
        assertArrayEquals(new long[]{2L, 3L}, result);
    }

    @Test
    public void testRemoveLongLastElement() throws Exception {
        long[] array = {1L, 2L, 3L};
        long[] result = ArrayUtils.remove(array, 2);
        assertArrayEquals(new long[]{1L, 2L}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveLongInvalidIndex() throws Exception {
        long[] array = {1L, 2L};
        ArrayUtils.remove(array, 2);
    }


    @Test
    public void testRemoveElementLongBasic() throws Exception {
        long[] array = {1L, 2L, 3L, 2L};
        long[] result = ArrayUtils.removeElement(array, 2L);
        assertArrayEquals(new long[]{1L, 3L, 2L}, result);
    }

    @Test
    public void testRemoveElementLongNotFound() throws Exception {
        long[] array = {1L, 2L, 3L};
        long[] result = ArrayUtils.removeElement(array, 4L);
        assertArrayEquals(array, result); // Should be unchanged
    }

    @Test
    public void testRemoveElementLongEmpty() throws Exception {
        long[] array = {};
        long[] result = ArrayUtils.removeElement(array, 1L);
        assertEquals(0, result.length);
    }


    @Test
    public void testRemoveFloatEmptyArray() throws Exception {
        float[] array = {};
        float[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveFloatBasic() throws Exception {
        float[] array = {1.0f, 2.0f, 3.0f};
        float[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(new float[]{1.0f, 3.0f}, result, 0.0f);
    }

    @Test
    public void testRemoveFloatFirstElement() throws Exception {
        float[] array = {1.0f, 2.0f, 3.0f};
        float[] result = ArrayUtils.remove(array, 0);
        assertArrayEquals(new float[]{2.0f, 3.0f}, result, 0.0f);
    }

    @Test
    public void testRemoveFloatLastElement() throws Exception {
        float[] array = {1.0f, 2.0f, 3.0f};
        float[] result = ArrayUtils.remove(array, 2);
        assertArrayEquals(new float[]{1.0f, 2.0f}, result, 0.0f);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveFloatInvalidIndex() throws Exception {
        float[] array = {1.0f, 2.0f};
        ArrayUtils.remove(array, 2);
    }


    @Test
    public void testRemoveElementFloatBasic() throws Exception {
        float[] array = {1.0f, 2.0f, 3.0f, 2.0f};
        float[] result = ArrayUtils.removeElement(array, 2.0f);
        assertArrayEquals(new float[]{1.0f, 3.0f, 2.0f}, result, 0.0f);
    }

    @Test
    public void testRemoveElementFloatNotFound() throws Exception {
        float[] array = {1.0f, 2.0f, 3.0f};
        float[] result = ArrayUtils.removeElement(array, 4.0f);
        assertArrayEquals(array, result, 0.0f); // Should be unchanged
    }

    @Test
    public void testRemoveElementFloatEmpty() throws Exception {
        float[] array = {};
        float[] result = ArrayUtils.removeElement(array, 1.0f);
        assertEquals(0, result.length);
    }


    @Test
    public void testRemoveDoubleEmptyArray() throws Exception {
        double[] array = {};
        double[] result = ArrayUtils.remove(array, 0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveDoubleBasic() throws Exception {
        double[] array = {1.0, 2.0, 3.0};
        double[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(new double[]{1.0, 3.0}, result, 0.0);
    }

    @Test
    public void testRemoveDoubleFirstElement() throws Exception {
        double[] array = {1.0, 2.0, 3.0};
        double[] result = ArrayUtils.remove(array, 0);
        assertArrayEquals(new double[]{2.0, 3.0}, result, 0.0);
    }

    @Test
    public void testRemoveDoubleLastElement() throws Exception {
        double[] array = {1.0, 2.0, 3.0};
        double[] result = ArrayUtils.remove(array, 2);
        assertArrayEquals(new double[]{1.0, 2.0}, result, 0.0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveDoubleInvalidIndex() throws Exception {
        double[] array = {1.0, 2.0};
        ArrayUtils.remove(array, 2);
    }


    @Test
    public void testRemoveElementDoubleBasic() throws Exception {
        double[] array = {1.0, 2.0, 3.0, 2.0};
        double[] result = ArrayUtils.removeElement(array, 2.0);
        assertArrayEquals(new double[]{1.0, 3.0, 2.0}, result, 0.0);
    }

    @Test
    public void testRemoveElementDoubleNotFound() throws Exception {
        double[] array = {1.0, 2.0, 3.0};
        double[] result = ArrayUtils.removeElement(array, 4.0);
        assertArrayEquals(array, result, 0.0); // Should be unchanged
    }

    @Test
    public void testRemoveElementDoubleEmpty() throws Exception {
        double[] array = {};
        double[] result = ArrayUtils.removeElement(array, 1.0);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveElementDoubleNullArray() throws Exception {
        assertNull(ArrayUtils.removeElement(null, 1.0));
    }
}




