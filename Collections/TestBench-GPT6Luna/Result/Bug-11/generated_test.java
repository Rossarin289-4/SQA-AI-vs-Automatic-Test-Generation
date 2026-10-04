package org.apache.commons.collections.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public class MultiKeyTest {
    @Test
    public void testTwoKeyConstructionAndSize() throws Exception {
        MultiKey key = new MultiKey("a", "b");
        assertEquals(2, key.size());
        assertEquals("a", key.getKey(0));
        assertEquals("b", key.getKey(1));
    }

    @Test
    public void testThreeKeyConstructionAndLastIndex() throws Exception {
        MultiKey key = new MultiKey("a", "b", "c");
        assertEquals(3, key.size());
        assertEquals("c", key.getKey(2));
    }

    @Test
    public void testFourKeyConstruction() throws Exception {
        MultiKey key = new MultiKey("a", "b", "c", "d");
        assertEquals(4, key.size());
        assertEquals("d", key.getKey(3));
    }

    @Test
    public void testFiveKeyConstruction() throws Exception {
        MultiKey key = new MultiKey("a", "b", "c", "d", "e");
        assertEquals(5, key.size());
        assertEquals("e", key.getKey(4));
    }

    @Test
    public void testArrayConstructionCopiesArray() throws Exception {
        Object[] keys = new Object[] {"a", "b"};
        MultiKey key = new MultiKey(keys);
        keys[0] = "changed";
        assertEquals("a", key.getKey(0));
        assertEquals(2, key.size());
    }

    @Test
    public void testExplicitCloneCopiesArray() throws Exception {
        Object[] keys = new Object[] {"a", "b"};
        MultiKey key = new MultiKey(keys, true);
        keys[1] = "changed";
        assertEquals("b", key.getKey(1));
    }

    @Test
    public void testNoCloneUsesArrayContentsForKeys() throws Exception {
        Object[] keys = new Object[] {"a", "b"};
        MultiKey key = new MultiKey(keys, false);
        keys[0] = "changed";
        assertEquals("changed", key.getKey(0));
        assertEquals(2, key.size());
    }

    @Test
    public void testNullArrayIsRejected() throws Exception {
        try {
            new MultiKey((Object[]) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetKeysReturnsContents() throws Exception {
        MultiKey key = new MultiKey("a", "b", "c");
        assertArrayEquals(new Object[] {"a", "b", "c"}, key.getKeys());
    }

    @Test
    public void testGetKeysReturnsIndependentArray() throws Exception {
        MultiKey key = new MultiKey("a", "b");
        Object[] result = key.getKeys();
        result[0] = "changed";
        assertEquals("a", key.getKey(0));
    }

    @Test
    public void testGetKeyAtFirstIndex() throws Exception {
        MultiKey key = new MultiKey(new Object[] {"first", "last"});
        assertEquals("first", key.getKey(0));
    }

    @Test
    public void testGetKeyAtLastIndex() throws Exception {
        MultiKey key = new MultiKey(new Object[] {"first", "last"});
        assertEquals("last", key.getKey(1));
    }

    @Test
    public void testInvalidNegativeIndex() throws Exception {
        MultiKey key = new MultiKey(new Object[] {"a"});
        try {
            key.getKey(-1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testInvalidIndexAtSize() throws Exception {
        MultiKey key = new MultiKey(new Object[] {"a"});
        try {
            key.getKey(1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testEmptyArraySizeAndKeys() throws Exception {
        MultiKey key = new MultiKey(new Object[0]);
        assertEquals(0, key.size());
        assertArrayEquals(new Object[0], key.getKeys());
    }

    @Test
    public void testEqualKeysCompareEqual() throws Exception {
        MultiKey left = new MultiKey("a", "b");
        MultiKey right = new MultiKey("a", "b");
        assertTrue(left.equals(right));
        assertTrue(right.equals(left));
    }

    @Test
    public void testDifferentKeyOrderIsNotEqual() throws Exception {
        MultiKey left = new MultiKey("a", "b");
        MultiKey right = new MultiKey("b", "a");
        assertFalse(left.equals(right));
    }

    @Test
    public void testDifferentKeyCountIsNotEqual() throws Exception {
        MultiKey left = new MultiKey("a", "b");
        MultiKey right = new MultiKey("a", "b", "c");
        assertFalse(left.equals(right));
    }

    @Test
    public void testEqualsNullAndOtherType() throws Exception {
        MultiKey key = new MultiKey(new Object[] {"a"});
        assertFalse(key.equals(null));
        assertFalse(key.equals("a"));
    }

    @Test
    public void testEqualsSelf() throws Exception {
        MultiKey key = new MultiKey("a", "b");
        assertTrue(key.equals(key));
    }

    @Test
    public void testHashCodeXorsNonNullKeyHashes() throws Exception {
        MultiKey key = new MultiKey("a", null, "b");
        assertEquals("a".hashCode() ^ "b".hashCode(), key.hashCode());
    }

    @Test
    public void testHashCodeEqualForEqualKeys() throws Exception {
        MultiKey left = new MultiKey("a", "b");
        MultiKey right = new MultiKey("a", "b");
        assertEquals(left.hashCode(), right.hashCode());
    }

    @Test
    public void testHashCodeEmptyAndNullKeys() throws Exception {
        assertEquals(0, new MultiKey(new Object[0]).hashCode());
        assertEquals(0, new MultiKey(new Object[] {null, null}).hashCode());
    }

    @Test
    public void testToStringForMultipleKeys() throws Exception {
        MultiKey key = new MultiKey("a", null, "b");
        assertEquals("MultiKey[a, null, b]", key.toString());
    }

    @Test
    public void testToStringForEmptyKeys() throws Exception {
        MultiKey key = new MultiKey(new Object[0]);
        assertEquals("MultiKey[]", key.toString());
    }
}
