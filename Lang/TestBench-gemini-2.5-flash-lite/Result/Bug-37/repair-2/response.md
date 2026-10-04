```java
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

    // toString tests
    //-----------------------------------------------------------------------

    @Test
    public void testToString_nullArray() {
        assertEquals("{}", ArrayUtils.toString(null));
    }

    @Test
    public void testToString_emptyObjectArray() {
        assertEquals("{}", ArrayUtils.toString(new Object[0]));
    }

    @Test
    public void testToString_objectArray() {
        Object[] array = {"a", "b", "c"};
        assertEquals("{a, b, c}", ArrayUtils.toString(array));
    }

    @Test
    public void testToString_nullArrayWithNullString() {
        assertNull(ArrayUtils.toString(null, null));
    }

    @Test
    public void testToString_emptyObjectArrayWithNullString() {
        assertEquals("{}", ArrayUtils.toString(new Object[0], "{}"));
    }

    @Test
    public void testToString_objectArrayWithNullString() {
        Object[] array = {"a", "b", "c"};
        assertEquals("{a, b, c}", ArrayUtils.toString(array, "{}"));
    }

    // isEquals tests
    //-----------------------------------------------------------------------

    @Test
    public void testIsEquals_bothNull() {
        assertTrue(ArrayUtils.isEquals(null, null));
    }

    @Test
    public void testIsEquals_firstNull() {
        assertFalse(ArrayUtils.isEquals(null, new Object[]{"a"}));
    }

    @Test
    public void testIsEquals_secondNull() {
        assertFalse(ArrayUtils.isEquals(new Object[]{"a"}, null));
    }

    @Test
    public void testIsEquals_emptyArrays() {
        assertTrue(ArrayUtils.isEquals(new Object[0], new Object[0]));
    }

    @Test
    public void testIsEquals_equalArrays() {
        Object[] array1 = {"a", "b", "c"};
        Object[] array2 = {"a", "b", "c"};
        assertTrue(ArrayUtils.isEquals(array1, array2));
    }

    @Test
    public void testIsEquals_unequalArrays() {
        Object[] array1 = {"a", "b", "c"};
        Object[] array2 = {"a", "b", "d"};
        assertFalse(ArrayUtils.isEquals(array1, array2));
    }

    @Test
    public void testIsEquals_differentLengthArrays() {
        Object[] array1 = {"a", "b", "c"};
        Object[] array2 = {"a", "b"};
        assertFalse(ArrayUtils.isEquals(array1, array2));
    }

    // toMap tests
    //-----------------------------------------------------------------------

    @Test
    public void testToMap_nullArray() {
        assertNull(ArrayUtils.toMap(null));
    }

    @Test
    public void testToMap_emptyArray() {
        Map<Object, Object> map = ArrayUtils.toMap(new Object[0]);
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testToMap_validArrayOfArrays() {
        Object[][] array = {{"key1", "value1"}, {"key2", "value2"}};
        Map<Object, Object> map = ArrayUtils.toMap(array);
        assertNotNull(map);
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_arrayWithEmptySubArray() {
        Object[][] array = {{}};
        ArrayUtils.toMap(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_arrayWithSingleElementSubArray() {
        Object[][] array = {{"key1"}};
        ArrayUtils.toMap(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_arrayWithNonArrayOrEntryElement() {
        Object[] array = {"not an array or entry"};
        ArrayUtils.toMap(array);
    }

    // clone tests
    //-----------------------------------------------------------------------

    @Test
    public void testClone_nullArray() {
        assertNull(ArrayUtils.clone((Object[]) null));
    }

    @Test
    public void testClone_emptyObjectArray() {
        Object[] array = ArrayUtils.clone(new Object[0]);
        assertNotNull(array);
        assertEquals(0, array.length);
    }

    @Test
    public void testClone_objectArray() {
        String[] original = {"a", "b"};
        String[] cloned = ArrayUtils.clone(original);
        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertEquals(original.length, cloned.length);
        assertArrayEquals(original, cloned);
    }

    @Test
    public void testClone_primitiveLongArray() {
        long[] original = {1L, 2L, 3L};
        long[] cloned = ArrayUtils.clone(original);
        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertEquals(original.length, cloned.length);
        assertArrayEquals(original, cloned);
    }

    // subarray tests
    //-----------------------------------------------------------------------

    @Test
    public void testSubarray_nullArray() {
        assertNull(ArrayUtils.subarray((String[]) null, 0, 0));
    }

    @Test
    public void testSubarray_emptyArray() {
        String[] array = {};
        String[] sub = ArrayUtils.subarray(array, 0, 0);
        assertNotNull(sub);
        assertEquals(0, sub.length);
    }

    @Test
    public void testSubarray_basic() {
        String[] original = {"a", "b", "c", "d", "e"};
        String[] sub = ArrayUtils.subarray(original, 1, 4); // b, c, d
        assertNotNull(sub);
        assertEquals(3, sub.length);
        assertArrayEquals(new String[]{"b", "c", "d"}, sub);
    }

    @Test
    public void testSubarray_startIndexTooLow() {
        String[] original = {"a", "b", "c"};
        String[] sub = ArrayUtils.subarray(original, -5, 2); // a, b
        assertNotNull(sub);
        assertEquals(2, sub.length);
        assertArrayEquals(new String[]{"a", "b"}, sub);
    }

    @Test
    public void testSubarray_endIndexTooHigh() {
        String[] original = {"a", "b", "c"};
        String[] sub = ArrayUtils.subarray(original, 1, 10); // b, c
        assertNotNull(sub);
        assertEquals(2, sub.length);
        assertArrayEquals(new String[]{"b", "c"}, sub);
    }

    @Test
    public void testSubarray_startIndexEqualsEndIndex() {
        String[] original = {"a", "b", "c"};
        String[] sub = ArrayUtils.subarray(original, 1, 1);
        assertNotNull(sub);
        assertEquals(0, sub.length);
    }

    @Test
    public void testSubarray_startIndexGreaterThanEndIndex() {
        String[] original = {"a", "b", "c"};
        String[] sub = ArrayUtils.subarray(original, 2, 1);
        assertNotNull(sub);
        assertEquals(0, sub.length);
    }

    @Test
    public void testSubarray_primitiveIntArray() {
        int[] original = {1, 2, 3, 4, 5};
        int[] sub = ArrayUtils.subarray(original, 1, 4); // 2, 3, 4
        assertNotNull(sub);
        assertEquals(3, sub.length);
        assertArrayEquals(new int[]{2, 3, 4}, sub);
    }

    // isSameLength tests
    //-----------------------------------------------------------------------

    @Test
    public void testIsSameLength_bothNull() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, null));
    }

    @Test
    public void testIsSameLength_firstNullSecondEmpty() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, new Object[0]));
    }

    @Test
    public void testIsSameLength_firstEmptySecondNull() {
        assertTrue(ArrayUtils.isSameLength(new Object[0], null));
    }

    @Test
    public void testIsSameLength_bothEmpty() {
        assertTrue(ArrayUtils.isSameLength(new Object[0], new Object[0]));
    }

    @Test
    public void testIsSameLength_sameLengthNonEmpty() {
        assertTrue(ArrayUtils.isSameLength(new Object[]{"a"}, new Object[]{"b"}));
    }

    @Test
    public void testIsSameLength_differentLength() {
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a"}, new Object[]{"b", "c"}));
    }

    @Test
    public void testIsSameLength_firstNullSecondNonEmpty() {
        assertFalse(ArrayUtils.isSameLength(null, new Object[]{"a"}));
    }

    @Test
    public void testIsSameLength_firstNonEmptySecondNull() {
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a"}, null));
    }

    @Test
    public void testIsSameLength_primitiveInt_sameLength() {
        assertTrue(ArrayUtils.isSameLength(new int[]{1}, new int[]{2}));
    }

    // getLength tests
    //-----------------------------------------------------------------------

    @Test
    public void testGetLength_null() {
        assertEquals(0, ArrayUtils.getLength(null));
    }

    @Test
    public void testGetLength_emptyArray() {
        assertEquals(0, ArrayUtils.getLength(new Object[0]));
    }

    @Test
    public void testGetLength_nonEmptyArray() {
        assertEquals(3, ArrayUtils.getLength(new String[]{"a", "b", "c"}));
    }

    @Test
    public void testGetLength_primitiveArray() {
        assertEquals(2, ArrayUtils.getLength(new int[]{1, 2}));
    }

    // isSameType tests
    //-----------------------------------------------------------------------

    @Test
    public void testIsSameType_sameTypes() {
        assertTrue(ArrayUtils.isSameType(new String[0], new String[1]));
    }

    @Test
    public void testIsSameType_differentTypes() {
        assertFalse(ArrayUtils.isSameType(new String[0], new Integer[0]));
    }

    @Test
    public void testIsSameType_primitiveAndWrapper() {
        assertFalse(ArrayUtils.isSameType(new int[0], new Integer[0]));
    }

    @Test
    public void testIsSameType_multiDimensional() {
        assertTrue(ArrayUtils.isSameType(new String[1][1], new String[2][2]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_firstNull() {
        ArrayUtils.isSameType(null, new String[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_secondNull() {
        ArrayUtils.isSameType(new String[0], null);
    }

    // reverse tests
    //-----------------------------------------------------------------------

    @Test
    public void testReverse_nullArray() {
        ArrayUtils.reverse((Object[]) null); // Should not throw an exception
    }

    @Test
    public void testReverse_emptyArray() {
        Object[] array = {};
        ArrayUtils.reverse(array);
        assertArrayEquals(new Object[0], array);
    }

    @Test
    public void testReverse_singleElementArray() {
        Object[] array = {"a"};
        ArrayUtils.reverse(array);
        assertArrayEquals(new Object[]{"a"}, array);
    }

    @Test
    public void testReverse_objectArray() {
        String[] array = {"a", "b", "c"};
        ArrayUtils.reverse(array);
        assertArrayEquals(new String[]{"c", "b", "a"}, array);
    }

    @Test
    public void testReverse_primitiveIntArray() {
        int[] array = {1, 2, 3, 4};
        ArrayUtils.reverse(array);
        assertArrayEquals(new int[]{4, 3, 2, 1}, array);
    }

    // indexOf tests
    //-----------------------------------------------------------------------

    @Test
    public void testIndexOf_objectArray_nullArray() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((Object[]) null, "a"));
    }

    @Test
    public void testIndexOf_objectArray_emptyArray() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[0], "a"));
    }

    @Test
    public void testIndexOf_objectArray_found() {
        assertEquals(1, ArrayUtils.indexOf(new String[]{"a", "b", "c"}, "b"));
    }

    @Test
    public void testIndexOf_objectArray_notFound() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new String[]{"a", "b", "c"}, "d"));
    }

    @Test
    public void testIndexOf_objectArray_foundAtIndex0() {
        assertEquals(0, ArrayUtils.indexOf(new String[]{"a", "b", "c"}, "a"));
    }

    @Test
    public void testIndexOf_objectArray_foundAtLastIndex() {
        assertEquals(2, ArrayUtils.indexOf(new String[]{"a", "b", "c"}, "c"));
    }

    @Test
    public void testIndexOf_objectArray_nullElement() {
        assertEquals(1, ArrayUtils.indexOf(new String[]{"a", null, "c"}, null));
    }

    @Test
    public void testIndexOf_objectArray_startIndex() {
        assertEquals(2, ArrayUtils.indexOf(new String[]{"a", "b", "c", "b"}, "b", 2));
    }

    @Test
    public void testIndexOf_objectArray_startIndexOutOfBoundsNegative() {
        assertEquals(1, ArrayUtils.indexOf(new String[]{"a", "b", "c"}, "b", -1));
    }

    @Test
    public void testIndexOf_objectArray_startIndexOutOfBoundsPositive() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new String[]{"a", "b", "c"}, "b", 3));
    }

    @Test
    public void testIndexOf_primitiveLong_nullArray() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((long[]) null, 1L));
    }

    @Test
    public void testIndexOf_primitiveLong_found() {
        assertEquals(1, ArrayUtils.indexOf(new long[]{1L, 2L, 3L}, 2L));
    }

    @Test
    public void testIndexOf_primitiveLong_startIndex() {
        assertEquals(2, ArrayUtils.indexOf(new long[]{1L, 2L, 3L, 2L}, 2L, 2));
    }

    // lastIndexOf tests
    //-----------------------------------------------------------------------

    @Test
    public void testLastIndexOf_objectArray_nullArray() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((Object[]) null, "a"));
    }

    @Test
    public void testLastIndexOf_objectArray_emptyArray() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new Object[0], "a"));
    }

    @Test
    public void testLastIndexOf_objectArray_found() {
        assertEquals(1, ArrayUtils.lastIndexOf(new String[]{"a", "b", "c"}, "b"));
    }

    @Test
    public void testLastIndexOf_objectArray_notFound() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new String[]{"a", "b", "c"}, "d"));
    }

    @Test
    public void testLastIndexOf_objectArray_foundAtIndex0() {
        assertEquals(0, ArrayUtils.lastIndexOf(new String[]{"a", "b", "c"}, "a"));
    }

    @Test
    public void testLastIndexOf_objectArray_foundAtLastIndex() {
        assertEquals(2, ArrayUtils.lastIndexOf(new String[]{"a", "b", "c"}, "c"));
    }

    @Test
    public void testLastIndexOf_objectArray_multipleOccurrences() {
        assertEquals(2, ArrayUtils.lastIndexOf(new String[]{"a", "b", "a", "c", "a"}, "a"));
    }

    @Test
    public void testLastIndexOf_objectArray_nullElement() {
        assertEquals(1, ArrayUtils.lastIndexOf(new String[]{"a", null, "c", null}, null));
    }

    @Test
    public void testLastIndexOf_objectArray_startIndex() {
        assertEquals(1, ArrayUtils.lastIndexOf(new String[]{"a", "b", "c", "b"}, "b", 2));
    }

    @Test
    public void testLastIndexOf_objectArray_startIndexOutOfBoundsNegative() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new String[]{"a", "b", "c"}, "b", -1));
    }

    @Test
    public void testLastIndexOf_objectArray_startIndexOutOfBoundsPositive() {
        assertEquals(2, ArrayUtils.lastIndexOf(new String[]{"a", "b", "c"}, "c", 5));
    }

    @Test
    public void testLastIndexOf_primitiveLong_nullArray() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((long[]) null, 1L));
    }

    @Test
    public void testLastIndexOf_primitiveLong_found() {
        assertEquals(1, ArrayUtils.lastIndexOf(new long[]{1L, 2L, 3L}, 2L));
    }

    @Test
    public void testLastIndexOf_primitiveLong_multipleOccurrences() {
        assertEquals(3, ArrayUtils.lastIndexOf(new long[]{1L, 2L, 1L, 3L, 1L}, 1L));
    }

    // contains tests
    //-----------------------------------------------------------------------

    @Test
    public void testContains_objectArray_nullArray() {
        assertFalse(ArrayUtils.contains((Object[]) null, "a"));
    }

    @Test
    public void testContains_objectArray_emptyArray() {
        assertFalse(ArrayUtils.contains(new Object[0], "a"));
    }

    @Test
    public void testContains_objectArray_found() {
        assertTrue(ArrayUtils.contains(new String[]{"a", "b", "c"}, "b"));
    }

    @Test
    public void testContains_objectArray_notFound() {
        assertFalse(ArrayUtils.contains(new String[]{"a", "b", "c"}, "d"));
    }

    @Test
    public void testContains_objectArray_nullElementFound() {
        assertTrue(ArrayUtils.contains(new String[]{"a", null, "c"}, null));
    }

    @Test
    public void testContains_objectArray_nullElementNotFound() {
        assertFalse(ArrayUtils.contains(new String[]{"a", "b", "c"}, null));
    }

    @Test
    public void testContains_primitiveLong_nullArray() {
        assertFalse(ArrayUtils.contains((long[]) null, 1L));
    }

    @Test
    public void testContains_primitiveLong_found() {
        assertTrue(ArrayUtils.contains(new long[]{1L, 2L, 3L}, 2L));
    }

    @Test
    public void testContains_primitiveLong_notFound() {
        assertFalse(ArrayUtils.contains(new long[]{1L, 2L, 3L}, 4L));
    }

    // toPrimitive tests
    //-----------------------------------------------------------------------

    @Test
    public void testToPrimitive_CharacterArray_null() {
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
    }

    @Test
    public void testToPrimitive_CharacterArray_empty() {
        char[] result = ArrayUtils.toPrimitive(new Character[0]);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testToPrimitive_CharacterArray_basic() {
        Character[] array = {'a', 'b', 'c'};
        char[] result = ArrayUtils.toPrimitive(array);
        assertNotNull(result);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
    }

    @Test
    public void testToPrimitive_CharacterArray_withNull() {
        Character[] array = {'a', null, 'c'};
        try {
            ArrayUtils.toPrimitive(array);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // Expected
        }
    }

    @Test
    public void testToPrimitive_CharacterArray_withNullAndDefault() {
        Character[] array = {'a', null, 'c'};
        char[] result = ArrayUtils.toPrimitive(array, 'X');
        assertNotNull(result);
        assertArrayEquals(new char[]{'a', 'X', 'c'}, result);
    }

    // toObject tests
    //-----------------------------------------------------------------------

    @Test
    public void testToObject_charArray_null() {
        assertNull(ArrayUtils.toObject((char[]) null));
    }

    @Test
    public void testToObject_charArray_empty() {
        Character[] result = ArrayUtils.toObject(new char[0]);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testToObject_charArray_basic() {
        char[] array = {'a', 'b', 'c'};
        Character[] result = ArrayUtils.toObject(array);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals('a', result[0].charValue());
        assertEquals('b', result[1].charValue());
        assertEquals('c', result[2].charValue());
    }

    // isEmpty tests
    //-----------------------------------------------------------------------

    @Test
    public void testIsEmpty_objectArray_null() {
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
    }

    @Test
    public void testIsEmpty_objectArray_empty() {
        assertTrue(ArrayUtils.isEmpty(new Object[0]));
    }

    @Test
    public void testIsEmpty_objectArray_notEmpty() {
        assertFalse(ArrayUtils.isEmpty(new Object[]{"a"}));
    }

    @Test
    public void testIsEmpty_primitiveIntArray_null() {
        assertTrue(ArrayUtils.isEmpty((int[]) null));
    }

    @Test
    public void testIsEmpty_primitiveIntArray_empty() {
        assertTrue(ArrayUtils.isEmpty(new int[0]));
    }

    @Test
    public void testIsEmpty_primitiveIntArray_notEmpty() {
        assertFalse(ArrayUtils.isEmpty(new int[]{1}));
    }

    // addAll tests
    //-----------------------------------------------------------------------

    @Test
    public void testAddAll_objectArrays_bothNull() {
        assertNull(ArrayUtils.addAll(null, (String[]) null));
    }

    @Test
    public void testAddAll_objectArrays_firstNull() {
        String[] array2 = {"a", "b"};
        String[] result = ArrayUtils.addAll(null, array2);
        assertNotNull(result);
        assertNotSame(array2, result);
        assertArrayEquals(array2, result);
    }

    @Test
    public void testAddAll_objectArrays_secondNull() {
        String[] array1 = {"a", "b"};
        String[] result = ArrayUtils.addAll(array1, (String[]) null);
        assertNotNull(result);
        assertNotSame(array1, result);
        assertArrayEquals(array1, result);
    }

    @Test
    public void testAddAll_objectArrays_bothEmpty() {
        String[] result = ArrayUtils.addAll(new String[0], new String[0]);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testAddAll_objectArrays_basic() {
        String[] array1 = {"a", "b"};
        String[] array2 = {"c", "d"};
        String[] result = ArrayUtils.addAll(array1, array2);
        assertNotNull(result);
        assertEquals(4, result.length);
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, result);
    }

    @Test
    public void testAddAll_primitiveBooleanArray() {
        boolean[] array1 = {true, false};
        boolean[] array2 = {false, true};
        boolean[] result = ArrayUtils.addAll(array1, array2);
        assertNotNull(result);
        assertEquals(4, result.length);
        assertArrayEquals(new boolean[]{true, false, false, true}, result);
    }

    // add tests
    //-----------------------------------------------------------------------

    @Test
    public void testAdd_objectArray_nullArray_nullElement() {
        Object[] result = ArrayUtils.add((Object[]) null, null);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertNull(result[0]);
    }

    @Test
    public void testAdd_objectArray_nullArray_nonNullElement() {
        String[] result = ArrayUtils.add(null, "a");
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("a", result[0]);
    }

    @Test
    public void testAdd_objectArray_nonNullArray_nullElement() {
        String[] array = {"a"};
        String[] result = ArrayUtils.add(array, null);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new String[]{"a", null}, result);
    }

    @Test
    public void testAdd_objectArray_basic() {
        String[] array = {"a", "b"};
        String[] result = ArrayUtils.add(array, "c");
        assertNotNull(result);
        assertEquals(3, result.length);
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    @Test
    public void testAdd_primitiveIntArray_basic() {
        int[] array = {1, 2};
        int[] result = ArrayUtils.add(array, 3);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    // remove tests
    //-----------------------------------------------------------------------

    @Test
    public void testRemove_objectArray_emptyArray() {
        Object[] array = {};
        try {
            ArrayUtils.remove(array, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testRemove_objectArray_singleElement() {
        Object[] array = {"a"};
        Object[] result = ArrayUtils.remove(array, 0);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemove_objectArray_basicFirstElement() {
        String[] array = {"a", "b", "c"};
        String[] result = ArrayUtils.remove(array, 0);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new String[]{"b", "c"}, result);
    }

    @Test
    public void testRemove_objectArray_basicMiddleElement() {
        String[] array = {"a", "b", "c"};
        String[] result = ArrayUtils.remove(array, 1);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new String[]{"a", "c"}, result);
    }

    @Test
    public void testRemove_objectArray_basicLastElement() {
        String[] array = {"a", "b", "c"};
        String[] result = ArrayUtils.remove(array, 2);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_objectArray_indexTooHigh() {
        ArrayUtils.remove(new String[]{"a"}, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_objectArray_indexTooLow() {
        ArrayUtils.remove(new String[]{"a"}, -1);
    }

    @Test
    public void testRemove_primitiveIntArray_basicMiddleElement() {
        int[] array = {1, 2, 3};
        int[] result = ArrayUtils.remove(array, 1);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    // removeElement tests
    //-----------------------------------------------------------------------

    @Test
    public void testRemoveElement_objectArray_nullArray() {
        assertNull(ArrayUtils.removeElement(null, "a"));
    }

    @Test
    public void testRemoveElement_objectArray_emptyArray() {
        Object[] array = {};
        Object[] result = ArrayUtils.removeElement(array, "a");
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testRemoveElement_objectArray_elementNotFound() {
        String[] array = {"a", "b"};
        String[] result = ArrayUtils.removeElement(array, "c");
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(array, result); // Should be same content, possibly new array instance
        assertNotSame(array, result);
    }

    @Test
    public void testRemoveElement_objectArray_firstOccurrence() {
        String[] array = {"a", "b", "a", "c"};
        String[] result = ArrayUtils.removeElement(array, "a");
        assertNotNull(result);
        assertEquals(3, result.length);
        assertArrayEquals(new String[]{"b", "a", "c"}, result);
    }

    @Test
    public void testRemoveElement_objectArray_nullElement() {
        String[] array = {"a", null, "b"};
        String[] result = ArrayUtils.removeElement(array, null);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testRemoveElement_primitiveIntArray_firstOccurrence() {
        int[] array = {1, 2, 1, 3};
        int[] result = ArrayUtils.removeElement(array, 1);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertArrayEquals(new int[]{2, 1, 3}, result);
    }
}
```