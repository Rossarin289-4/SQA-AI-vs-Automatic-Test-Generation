package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;

public class MultiKeyTest {
    @Test
    public void testTwoKeySizeAndAccess() throws Exception {
        MultiKey<String> key = new MultiKey<>("a", "b");
        assertEquals(2, key.size());
        assertEquals("a", key.getKey(0));
        assertEquals("b", key.getKey(1));
    }

    @Test
    public void testThreeKeySizeAndAccess() throws Exception {
        MultiKey<String> key = new MultiKey<>("a", "b", "c");
        assertEquals(3, key.size());
        assertEquals("c", key.getKey(2));
    }

    @Test
    public void testFourKeySize() throws Exception {
        MultiKey<String> key = new MultiKey<>("a", "b", "c", "d");
        assertEquals(4, key.size());
        assertEquals("d", key.getKey(3));
    }

    @Test
    public void testFiveKeySize() throws Exception {
        MultiKey<String> key = new MultiKey<>("a", "b", "c", "d", "e");
        assertEquals(5, key.size());
        assertEquals("e", key.getKey(4));
    }

    @Test
    public void testEmptyArray() throws Exception {
        MultiKey<String> key = new MultiKey<>(new String[0]);
        assertEquals(0, key.size());
        assertEquals(0, key.hashCode());
        assertEquals("MultiKey[]", key.toString());
    }

    @Test
    public void testArrayConstructorClonesInput() throws Exception {
        String[] input = {"left", "right"};
        MultiKey<String> key = new MultiKey<>(input);
        input[0] = "changed";
        assertEquals("left", key.getKey(0));
        assertEquals(Arrays.asList("left", "right"), Arrays.asList(key.getKeys()));
    }

    @Test
    public void testGetKeysReturnsIndependentArray() throws Exception {
        MultiKey<String> key = new MultiKey<>("first", "last");
        String[] returned = key.getKeys();
        returned[0] = "changed";
        assertEquals("first", key.getKey(0));
        assertEquals("last", key.getKey(1));
    }

    @Test
    public void testArrayConstructorWithoutCloneUsesArrayContents() throws Exception {
        String[] input = {"before", "after"};
        MultiKey<String> key = new MultiKey<>(input, false);
        assertEquals("before", key.getKey(0));
        assertEquals("after", key.getKey(1));
    }

    @Test
    public void testGetKeyRejectsNegativeIndex() throws Exception {
        MultiKey<String> key = new MultiKey<>("only", "other");
        try {
            key.getKey(-1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
        assertEquals(2, key.size());
    }

    @Test
    public void testGetKeyRejectsIndexAtSize() throws Exception {
        MultiKey<String> key = new MultiKey<>("only", "other");
        try {
            key.getKey(2);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
        assertEquals("other", key.getKey(1));
    }

    @Test
    public void testArrayConstructorRejectsNull() throws Exception {
        try {
            new MultiKey<String>((String[]) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(1, new MultiKey<>("x", "y").size() - 1);
    }

    @Test
    public void testArrayConstructorRejectsNullWithoutClone() throws Exception {
        try {
            new MultiKey<String>(null, false);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(2, new MultiKey<>("x", "y").size());
    }

    @Test
    public void testEqualsSameKeysAndLength() throws Exception {
        MultiKey<String> first = new MultiKey<>("a", "b");
        MultiKey<String> second = new MultiKey<>("a", "b");
        assertTrue(first.equals(second));
        assertTrue(first.equals(first));
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testEqualsDistinguishesKeyOrder() throws Exception {
        MultiKey<String> first = new MultiKey<>("a", "b");
        MultiKey<String> second = new MultiKey<>("b", "a");
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsDistinguishesLengthAndOtherTypes() throws Exception {
        MultiKey<String> key = new MultiKey<>("a", "b");
        assertFalse(key.equals(new MultiKey<String>(new String[]{"a"})));
        assertFalse(key.equals("a"));
        assertFalse(key.equals(null));
    }

    @Test
    public void testEqualsHandlesNullKeys() throws Exception {
        MultiKey<String> first = new MultiKey<>(null, "b");
        MultiKey<String> second = new MultiKey<>(null, "b");
        MultiKey<String> different = new MultiKey<>("a", "b");
        assertTrue(first.equals(second));
        assertFalse(first.equals(different));
        assertEquals("b", first.getKey(1));
    }

    @Test
    public void testHashCodeXorsNonNullKeyHashes() throws Exception {
        MultiKey<String> key = new MultiKey<>("a", "b");
        assertEquals("a".hashCode() ^ "b".hashCode(), key.hashCode());
    }

    @Test
    public void testHashCodeIgnoresNullKeys() throws Exception {
        MultiKey<String> key = new MultiKey<>(null, "b", null);
        assertEquals("b".hashCode(), key.hashCode());
    }

    @Test
    public void testHashCodeEqualKeysCancel() throws Exception {
        MultiKey<String> key = new MultiKey<>("same", "same");
        assertEquals(0, key.hashCode());
    }

    @Test
    public void testToStringShowsKeyArray() throws Exception {
        MultiKey<String> key = new MultiKey<>("a", null, "c");
        assertEquals("MultiKey[a, null, c]", key.toString());
    }

    @Test
    public void testArrayConstructorPreservesArrayOrder() throws Exception {
        MultiKey<String> key = new MultiKey<>(new String[]{"last", "first"});
        assertEquals("last", key.getKey(0));
        assertEquals("first", key.getKey(1));
        assertEquals("MultiKey[last, first]", key.toString());
    }
}
