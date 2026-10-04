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
    public void testToStringNullUsesDefault() throws Exception {
        assertEquals("{}", ArrayUtils.toString(null));
    }

    @Test
    public void testIsEqualsDeepPrimitiveArrays() throws Exception {
        assertTrue(ArrayUtils.isEquals(new int[][] {{1, 2}}, new int[][] {{1, 2}}));
        assertFalse(ArrayUtils.isEquals(new int[][] {{1, 2}}, new int[][] {{1, 3}}));
    }

    @Test
    public void testToMapArrayEntries() throws Exception {
        Map<Object, Object> result = ArrayUtils.toMap(new Object[] {
            new Object[] {"a", 1}, new Object[] {"b", 2}
        });
        assertEquals(2, result.size());
        assertEquals(1, result.get("a"));
        assertEquals(2, result.get("b"));
    }

    @Test
    public void testToMapNullAndTooShortEntry() throws Exception {
        assertNull(ArrayUtils.toMap(null));
        try {
            ArrayUtils.toMap(new Object[] {new Object[] {"a"}});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testCloneObjectArrayShallowAndNull() throws Exception {
        String item = "x";
        String[] input = {item};
        String[] copy = ArrayUtils.clone(input);
        assertArrayEquals(new String[] {"x"}, copy);
        assertNotSame(input, copy);
        assertSame(item, copy[0]);
        assertNull(ArrayUtils.clone((String[]) null));
    }

    @Test
    public void testSubarrayClampsBounds() throws Exception {
        String[] input = {"a", "b", "c"};
        assertArrayEquals(new String[] {"a", "b", "c"}, ArrayUtils.subarray(input, -1, 9));
        assertArrayEquals(new String[] {"b"}, ArrayUtils.subarray(input, 1, 2));
        assertArrayEquals(new String[0], ArrayUtils.subarray(input, 2, 1));
        assertNull(ArrayUtils.subarray((String[]) null, 0, 1));
    }

    @Test
    public void testIsSameLengthNullAndZeroLengthEdges() throws Exception {
        assertTrue(ArrayUtils.isSameLength(null, new Object[0]));
        assertFalse(ArrayUtils.isSameLength(null, new Object[] {"x"}));
        assertFalse(ArrayUtils.isSameLength(new Object[] {"x"}, new Object[0]));
    }

    @Test
    public void testGetLengthArrayKindsAndNonArray() throws Exception {
        assertEquals(0, ArrayUtils.getLength(null));
        assertEquals(2, ArrayUtils.getLength(new int[] {1, 2}));
        assertEquals(1, ArrayUtils.getLength(new Object[] {null}));
        try {
            ArrayUtils.getLength("x");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testIsSameTypeIncludingDimensions() throws Exception {
        assertTrue(ArrayUtils.isSameType(new int[1], new int[2]));
        assertFalse(ArrayUtils.isSameType(new int[1], new long[1]));
        assertFalse(ArrayUtils.isSameType(new int[1][1], new int[1]));
        try {
            ArrayUtils.isSameType(null, new int[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testReverseObjectArray() throws Exception {
        String[] values = {"a", "b", "c", "d"};
        ArrayUtils.reverse(values);
        assertArrayEquals(new String[] {"d", "c", "b", "a"}, values);
    }

    @Test
    public void testIndexOfObjectStartIndexAndNullValues() throws Exception {
        String[] values = {"x", null, "x"};
        assertEquals(0, ArrayUtils.indexOf(values, "x"));
        assertEquals(2, ArrayUtils.indexOf(values, "x", 1));
        assertEquals(1, ArrayUtils.indexOf(values, null));
        assertEquals(-1, ArrayUtils.indexOf(values, "x", 3));
        assertEquals(-1, ArrayUtils.indexOf(null, "x"));
    }

    @Test
    public void testLastIndexOfObjectBoundsAndDuplicates() throws Exception {
        String[] values = {"x", null, "x"};
        assertEquals(2, ArrayUtils.lastIndexOf(values, "x"));
        assertEquals(0, ArrayUtils.lastIndexOf(values, "x", 1));
        assertEquals(1, ArrayUtils.lastIndexOf(values, null, 8));
        assertEquals(-1, ArrayUtils.lastIndexOf(values, "x", -1));
    }

    @Test
    public void testContainsObjectUsesSearchSemantics() throws Exception {
        assertTrue(ArrayUtils.contains(new String[] {"a", null}, null));
        assertFalse(ArrayUtils.contains(new String[] {"a"}, "b"));
        assertFalse(ArrayUtils.contains(null, "a"));
    }

    @Test
    public void testToPrimitiveCharactersWithNullReplacement() throws Exception {
        assertArrayEquals(new char[] {'a', '?'},
                ArrayUtils.toPrimitive(new Character[] {'a', null}, '?'));
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
        try {
            ArrayUtils.toPrimitive(new Character[] {null});
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testToObjectCharacters() throws Exception {
        assertArrayEquals(new Character[] {'a', 'b'}, ArrayUtils.toObject(new char[] {'a', 'b'}));
        assertArrayEquals(new Character[0], ArrayUtils.toObject(new char[0]));
        assertNull(ArrayUtils.toObject((char[]) null));
    }

    @Test
    public void testIsEmptyObjectArrays() throws Exception {
        assertTrue(ArrayUtils.isEmpty((String[]) null));
        assertTrue(ArrayUtils.isEmpty(new String[0]));
        assertFalse(ArrayUtils.isEmpty(new String[] {null}));
    }

    @Test
    public void testAddAllPreservesOrderAndMakesNewArray() throws Exception {
        String[] first = {"a", "b"};
        String[] combined = ArrayUtils.addAll(first, new String[] {"c"});
        assertArrayEquals(new String[] {"a", "b", "c"}, combined);
        assertNotSame(first, combined);
        assertArrayEquals(new String[] {"c"}, ArrayUtils.addAll(null, new String[] {"c"}));
        assertArrayEquals(new String[] {"a", "b"}, ArrayUtils.addAll(first, (String[]) null));
        assertNull(ArrayUtils.addAll((String[]) null, (String[]) null));
    }

    @Test
    public void testAddObjectAppendsWithoutChangingInput() throws Exception {
        String[] input = {"a"};
        String[] result = ArrayUtils.add(input, "b");
        assertArrayEquals(new String[] {"a", "b"}, result);
        assertArrayEquals(new String[] {"a"}, input);
        assertArrayEquals(new String[] {"x"}, ArrayUtils.add((String[]) null, "x"));
    }

    @Test
    public void testRemoveObjectAtFirstAndLastPositions() throws Exception {
        String[] input = {"a", "b", "c"};
        assertArrayEquals(new String[] {"b", "c"}, ArrayUtils.remove(input, 0));
        assertArrayEquals(new String[] {"a", "b"}, ArrayUtils.remove(input, 2));
        try {
            ArrayUtils.remove(input, 3);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testRemoveElementRemovesOnlyFirstMatch() throws Exception {
        assertArrayEquals(new String[] {"b", "a"},
                ArrayUtils.removeElement(new String[] {"a", "b", "a"}, "a"));
        assertArrayEquals(new String[] {"a"},
                ArrayUtils.removeElement(new String[] {"a"}, "z"));
        assertNull(ArrayUtils.removeElement((String[]) null, "a"));
    }
}
