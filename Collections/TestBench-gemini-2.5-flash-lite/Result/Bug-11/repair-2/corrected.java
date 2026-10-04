package org.apache.commons.collections.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class MultiKeyTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testMultiKeyConstructorTwoKeys() {
        Object key1 = "key1";
        Object key2 = "key2";
        MultiKey mk = new MultiKey(key1, key2);
        assertNotNull(mk);
        assertEquals(2, mk.size());
        assertArrayEquals(new Object[]{key1, key2}, mk.getKeys());
    }

    @Test
    public void testMultiKeyConstructorThreeKeys() {
        Object key1 = "key1";
        Object key2 = "key2";
        Object key3 = "key3";
        MultiKey mk = new MultiKey(key1, key2, key3);
        assertNotNull(mk);
        assertEquals(3, mk.size());
        assertArrayEquals(new Object[]{key1, key2, key3}, mk.getKeys());
    }

    @Test
    public void testMultiKeyConstructorFourKeys() {
        Object key1 = "key1";
        Object key2 = "key2";
        Object key3 = "key3";
        Object key4 = "key4";
        MultiKey mk = new MultiKey(key1, key2, key3, key4);
        assertNotNull(mk);
        assertEquals(4, mk.size());
        assertArrayEquals(new Object[]{key1, key2, key3, key4}, mk.getKeys());
    }

    @Test
    public void testMultiKeyConstructorFiveKeys() {
        Object key1 = "key1";
        Object key2 = "key2";
        Object key3 = "key3";
        Object key4 = "key4";
        Object key5 = "key5";
        MultiKey mk = new MultiKey(key1, key2, key3, key4, key5);
        assertNotNull(mk);
        assertEquals(5, mk.size());
        assertArrayEquals(new Object[]{key1, key2, key3, key4, key5}, mk.getKeys());
    }

    @Test
    public void testMultiKeyConstructorArray() {
        Object[] keys = {"key1", "key2"};
        MultiKey mk = new MultiKey(keys);
        assertNotNull(mk);
        assertEquals(2, mk.size());
        // Ensure it's a clone
        keys[0] = "changed";
        assertArrayEquals(new Object[]{"key1", "key2"}, mk.getKeys());
    }

    @Test
    public void testMultiKeyConstructorArrayNoClone() {
        Object[] keys = {"key1", "key2"};
        MultiKey mk = new MultiKey(keys, false);
        assertNotNull(mk);
        assertEquals(2, mk.size());
        // Ensure it's not a clone
        keys[0] = "changed";
        assertArrayEquals(new Object[]{"changed", "key2"}, mk.getKeys());
    }

    @Test
    public void testMultiKeyConstructorNullArray() {
        try {
            new MultiKey((Object[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testMultiKeyConstructorArrayNullElement() {
        Object[] keys = {"key1", null};
        MultiKey mk = new MultiKey(keys, true);
        assertNotNull(mk);
        assertEquals(2, mk.size());
        assertArrayEquals(new Object[]{"key1", null}, mk.getKeys());
    }

    @Test
    public void testGetKeysReturnsClone() {
        Object[] keys = {"key1", "key2"};
        MultiKey mk = new MultiKey(keys);
        Object[] retrievedKeys = mk.getKeys();
        assertNotNull(retrievedKeys);
        assertNotSame(keys, retrievedKeys);
        assertTrue(Arrays.equals(keys, retrievedKeys));
    }

    @Test
    public void testGetKeyByIndex() {
        Object key1 = "key1";
        Object key2 = "key2";
        MultiKey mk = new MultiKey(key1, key2);
        assertEquals(key1, mk.getKey(0));
        assertEquals(key2, mk.getKey(1));
    }

    @Test
    public void testGetKeyByIndexOutOfBounds() {
        MultiKey mk = new MultiKey("key1", "key2");
        try {
            mk.getKey(2); // Index 2 is out of bounds for size 2
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            mk.getKey(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSize() {
        MultiKey mk2 = new MultiKey("k1", "k2");
        assertEquals(2, mk2.size());
        MultiKey mk5 = new MultiKey("k1", "k2", "k3", "k4", "k5");
        assertEquals(5, mk5.size());
        // Test size for a single-key MultiKey using the array constructor
        MultiKey mkSingle = new MultiKey(new Object[]{"k1"}, true);
        assertEquals(1, mkSingle.size());
    }

    @Test
    public void testEqualsSameInstance() {
        MultiKey mk = new MultiKey("k1", "k2");
        assertTrue(mk.equals(mk));
    }

    @Test
    public void testEqualsDifferentObjectSameKeys() {
        Object key1 = "key1";
        Object key2 = "key2";
        MultiKey mk1 = new MultiKey(key1, key2);
        MultiKey mk2 = new MultiKey(key1, key2);
        assertTrue(mk1.equals(mk2));
    }

    @Test
    public void testEqualsDifferentObjectSameKeysArray() {
        Object[] keys = {"key1", "key2"};
        MultiKey mk1 = new MultiKey(keys, true);
        MultiKey mk2 = new MultiKey(keys, true);
        assertTrue(mk1.equals(mk2));
    }
    
    @Test
    public void testEqualsNull() {
        MultiKey mk = new MultiKey("k1", "k2");
        assertFalse(mk.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        MultiKey mk = new MultiKey("k1", "k2");
        assertFalse(mk.equals(new Object()));
    }

    @Test
    public void testEqualsDifferentNumberOfKeys() {
        MultiKey mk1 = new MultiKey("k1", "k2");
        MultiKey mk2Single = new MultiKey(new Object[]{"k1"}, true);
        assertFalse(mk1.equals(mk2Single));
    }

    @Test
    public void testEqualsDifferentKeys() {
        MultiKey mk1 = new MultiKey("k1", "k2");
        MultiKey mk2 = new MultiKey("k1", "k3");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEqualsWithNullKeys() {
        MultiKey mk1 = new MultiKey("k1", null);
        MultiKey mk2 = new MultiKey("k1", null);
        assertTrue(mk1.equals(mk2));

        MultiKey mk3 = new MultiKey(null, "k2");
        MultiKey mk4 = new MultiKey(null, "k2");
        assertTrue(mk3.equals(mk4));

        MultiKey mk5 = new MultiKey(null, null);
        MultiKey mk6 = new MultiKey(null, null);
        assertTrue(mk5.equals(mk6));
    }
    
    @Test
    public void testEqualsDifferentWithNullKeys() {
        MultiKey mk1 = new MultiKey("k1", null);
        MultiKey mk2 = new MultiKey("k1", "k2");
        assertFalse(mk1.equals(mk2));
        
        MultiKey mk3 = new MultiKey(null, "k2");
        MultiKey mk4 = new MultiKey("k1", "k2");
        assertFalse(mk3.equals(mk4));
    }

    @Test
    public void testHashCodeCalculation() {
        Object key1 = "key1";
        Object key2 = "key2";
        MultiKey mk = new MultiKey(key1, key2);
        MultiKey mk2 = new MultiKey(key1, key2);
        assertEquals(mk.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCodeWithNullKey() {
        Object key1 = "key1";
        MultiKey mk = new MultiKey(key1, null);
        MultiKey mk2 = new MultiKey(key1, null);
        assertEquals(mk.hashCode(), mk2.hashCode());

        MultiKey mk3 = new MultiKey(null, key1);
        MultiKey mk4 = new MultiKey(null, key1);
        assertEquals(mk3.hashCode(), mk4.hashCode());

        MultiKey mk5 = new MultiKey(null, null);
        MultiKey mk6 = new MultiKey(null, null);
        assertEquals(mk5.hashCode(), mk6.hashCode());
    }

    @Test
    public void testHashCodeRemainsStableAfterKeyModification() {
        class MutableKey {
            private String value;
            private int hash;

            public MutableKey(String value) {
                this.value = value;
                this.hash = value.hashCode();
            }

            public void changeValue(String newValue) {
                this.value = newValue;
                this.hash = newValue.hashCode(); // Recalculate hash
            }

            @Override
            public int hashCode() {
                return hash;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                MutableKey other = (MutableKey) obj;
                return Objects.equals(value, other.value);
            }
        }

        MutableKey mutableKey1 = new MutableKey("initial");
        MultiKey mk = new MultiKey(mutableKey1, "key2");
        int initialHashCode = mk.hashCode();

        mutableKey1.changeValue("changed");

        // The hashCode of mk should NOT change because it's cached.
        assertEquals(initialHashCode, mk.hashCode());
        
        // This verifies that the equality check works correctly even if hash codes differ.
        MultiKey mkChanged = new MultiKey(mutableKey1, "key2");
        assertFalse(mk.equals(mkChanged)); 
    }

    @Test
    public void testToString() {
        MultiKey mk = new MultiKey("key1", 123, true);
        assertEquals("MultiKey[key1, 123, true]", mk.toString());
    }

    @Test
    public void testToStringWithNullKey() {
        MultiKey mk = new MultiKey("key1", null, true);
        assertEquals("MultiKey[key1, null, true]", mk.toString());
    }

    @Test
    public void testMultiKeyConstructorEmptyArray() {
        Object[] keys = {};
        MultiKey mk = new MultiKey(keys, true);
        assertNotNull(mk);
        assertEquals(0, mk.size());
        assertArrayEquals(new Object[]{}, mk.getKeys());
        assertEquals(0, mk.hashCode()); // Hashcode of empty set of keys should be 0
    }

    @Test
    public void testMultiKeyConstructorEmptyArrayNoClone() {
        Object[] keys = {};
        MultiKey mk = new MultiKey(keys, false);
        assertNotNull(mk);
        assertEquals(0, mk.size());
        assertArrayEquals(new Object[]{}, mk.getKeys());
        assertEquals(0, mk.hashCode());
    }
    
    @Test
    public void testMultiKeyEqualsEmptyArrays() {
        MultiKey mk1 = new MultiKey(new Object[]{}, true);
        MultiKey mk2 = new MultiKey(new Object[]{}, false);
        assertTrue(mk1.equals(mk2));
    }

    @Test
    public void testMultiKeyHashCodeEmptyArrays() {
        MultiKey mk1 = new MultiKey(new Object[]{}, true);
        MultiKey mk2 = new MultiKey(new Object[]{}, false);
        assertEquals(mk1.hashCode(), mk2.hashCode());
        assertEquals(0, mk1.hashCode());
    }
}
