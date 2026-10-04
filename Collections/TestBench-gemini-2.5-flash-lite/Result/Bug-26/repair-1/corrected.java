package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;

public class MultiKeyTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorTwoKeys() throws Exception {
        String key1 = "key1";
        Integer key2 = 1;
        MultiKey<Object> multiKey = new MultiKey<>(key1, key2);
        assertEquals(2, multiKey.size());
        assertEquals(key1, multiKey.getKey(0));
        assertEquals(key2, multiKey.getKey(1));
    }

    @Test
    public void testConstructorThreeKeys() throws Exception {
        String key1 = "key1";
        Integer key2 = 1;
        Double key3 = 3.14;
        MultiKey<Object> multiKey = new MultiKey<>(key1, key2, key3);
        assertEquals(3, multiKey.size());
        assertEquals(key1, multiKey.getKey(0));
        assertEquals(key2, multiKey.getKey(1));
        assertEquals(key3, multiKey.getKey(2));
    }

    @Test
    public void testConstructorFourKeys() throws Exception {
        String key1 = "key1";
        Integer key2 = 1;
        Double key3 = 3.14;
        Boolean key4 = true;
        MultiKey<Object> multiKey = new MultiKey<>(key1, key2, key3, key4);
        assertEquals(4, multiKey.size());
        assertEquals(key1, multiKey.getKey(0));
        assertEquals(key2, multiKey.getKey(1));
        assertEquals(key3, multiKey.getKey(2));
        assertEquals(key4, multiKey.getKey(3));
    }

    @Test
    public void testConstructorFiveKeys() throws Exception {
        String key1 = "key1";
        Integer key2 = 1;
        Double key3 = 3.14;
        Boolean key4 = true;
        Character key5 = 'a';
        MultiKey<Object> multiKey = new MultiKey<>(key1, key2, key3, key4, key5);
        assertEquals(5, multiKey.size());
        assertEquals(key1, multiKey.getKey(0));
        assertEquals(key2, multiKey.getKey(1));
        assertEquals(key3, multiKey.getKey(2));
        assertEquals(key4, multiKey.getKey(3));
        assertEquals(key5, multiKey.getKey(4));
    }

    @Test
    public void testConstructorArrayKeysClone() throws Exception {
        String[] keys = {"key1", "key2"};
        MultiKey<String> multiKey = new MultiKey<>(keys);
        assertEquals(2, multiKey.size());
        assertEquals("key1", multiKey.getKey(0));
        assertEquals("key2", multiKey.getKey(1));

        // verify it's a clone
        keys[0] = "changed";
        assertEquals("key1", multiKey.getKey(0));
    }

    @Test
    public void testConstructorArrayKeysNoClone() throws Exception {
        String[] keys = {"key1", "key2"};
        MultiKey<String> multiKey = new MultiKey<>(keys, false);
        assertEquals(2, multiKey.size());
        assertEquals("key1", multiKey.getKey(0));
        assertEquals("key2", multiKey.getKey(1));

        // verify it's not a clone
        keys[0] = "changed";
        assertEquals("changed", multiKey.getKey(0));
    }

    @Test
    public void testConstructorArrayKeysWithOneElementAndNoClone() throws Exception {
        String[] keys = {"key1"};
        MultiKey<String> multiKey = new MultiKey<>(keys, false);
        assertEquals(1, multiKey.size());
        assertEquals("key1", multiKey.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullKeysArray() throws Exception {
        new MultiKey<>((Object[]) null); // Explicitly cast to Object[] to match constructor
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullKeysArrayWithBoolean() throws Exception {
        new MultiKey<>((Object[]) null, false); // Explicitly cast to Object[] to match constructor
    }

    @Test
    public void testGetKeys() throws Exception {
        String[] keys = {"key1", "key2"};
        MultiKey<String> multiKey = new MultiKey<>(keys);
        String[] retrievedKeys = multiKey.getKeys(); // Changed type to String[]
        assertArrayEquals(keys, retrievedKeys);
        // verify it's a clone
        retrievedKeys[0] = "changed";
        assertArrayEquals(keys, multiKey.getKeys());
    }

    @Test
    public void testGetKeyValidIndex() throws Exception {
        String key1 = "key1";
        Integer key2 = 1;
        MultiKey<Object> multiKey = new MultiKey<>(key1, key2);
        assertEquals(key1, multiKey.getKey(0));
        assertEquals(key2, multiKey.getKey(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyInvalidIndexTooHigh() throws Exception {
        MultiKey<String> multiKey = new MultiKey<>("key1");
        multiKey.getKey(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyInvalidIndexNegative() throws Exception {
        MultiKey<String> multiKey = new MultiKey<>("key1");
        multiKey.getKey(-1);
    }

    @Test
    public void testSizeZero() throws Exception {
        MultiKey<Object> multiKey = new MultiKey<>(new Object[0]);
        assertEquals(0, multiKey.size());
    }

    @Test
    public void testSizeOne() throws Exception {
        MultiKey<String> multiKey = new MultiKey<>("key1"); // Explicitly typed
        assertEquals(1, multiKey.size());
    }

    @Test
    public void testEqualsWithSelf() throws Exception {
        MultiKey<String> multiKey = new MultiKey<>("key1", "key2");
        assertTrue(multiKey.equals(multiKey));
    }

    @Test
    public void testEqualsWithSameKeys() throws Exception {
        MultiKey<String> multiKey1 = new MultiKey<>("key1", "key2");
        MultiKey<String> multiKey2 = new MultiKey<>("key1", "key2");
        assertTrue(multiKey1.equals(multiKey2));
    }

    @Test
    public void testEqualsWithDifferentKeysOrder() throws Exception {
        MultiKey<String> multiKey1 = new MultiKey<>("key1", "key2");
        MultiKey<String> multiKey2 = new MultiKey<>("key2", "key1");
        assertFalse(multiKey1.equals(multiKey2));
    }

    @Test
    public void testEqualsWithDifferentKeysContent() throws Exception {
        MultiKey<String> multiKey1 = new MultiKey<>("key1", "key2");
        MultiKey<String> multiKey2 = new MultiKey<>("key1", "key3");
        assertFalse(multiKey1.equals(multiKey2));
    }

    @Test
    public void testEqualsWithDifferentNumberOfKeys() throws Exception {
        MultiKey<String> multiKey1 = new MultiKey<>("key1", "key2");
        MultiKey<String> multiKey2 = new MultiKey<>("key1");
        assertFalse(multiKey1.equals(multiKey2));
    }

    @Test
    public void testEqualsWithNull() throws Exception {
        MultiKey<String> multiKey = new MultiKey<>("key1");
        assertFalse(multiKey.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() throws Exception {
        MultiKey<String> multiKey = new MultiKey<>("key1");
        assertFalse(multiKey.equals("not a MultiKey"));
    }

    @Test
    public void testHashCodeConsistency() throws Exception {
        MultiKey<String> multiKey1 = new MultiKey<>("key1", "key2");
        MultiKey<String> multiKey2 = new MultiKey<>("key1", "key2");
        assertEquals(multiKey1.hashCode(), multiKey2.hashCode());
    }

    @Test
    public void testHashCodeDifferentOrder() throws Exception {
        MultiKey<String> multiKey1 = new MultiKey<>("key1", "key2");
        MultiKey<String> multiKey2 = new MultiKey<>("key2", "key1");
        // The current implementation uses XOR, so order doesn't matter.
        // If it were sum or a different combination, this might be different.
        assertEquals(multiKey1.hashCode(), multiKey2.hashCode());
    }

    @Test
    public void testHashCodeWithNullKeys() throws Exception {
        MultiKey<Object> multiKey1 = new MultiKey<>(null, "key2"); // Use Object for null key
        MultiKey<Object> multiKey2 = new MultiKey<>("key1", null); // Use Object for null key
        MultiKey<Object> multiKey3 = new MultiKey<>(null, null);   // Use Object for null key
        // Hash code calculation XORs with 0 for nulls.
        // So null, "key2" and "key1", null have different hash codes.
        // null, null has hash code 0.
        assertNotEquals(multiKey1.hashCode(), multiKey2.hashCode());
        assertNotEquals(multiKey1.hashCode(), multiKey3.hashCode());
        assertEquals(0, multiKey3.hashCode());
    }

    @Test
    public void testHashCodeSingleKey() throws Exception {
        String key = "single";
        MultiKey<String> multiKey = new MultiKey<>(key);
        assertEquals(key.hashCode(), multiKey.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        MultiKey<Object> multiKey = new MultiKey<>("key1", 1); // Use Object for mixed types
        assertEquals("MultiKey[key1, 1]", multiKey.toString());
    }

    @Test
    public void testReadResolve() throws Exception {
        String[] keys = {"key1", "key2"};
        MultiKey<String> multiKey = new MultiKey<>(keys);
        // Manually setting hashCode to a dummy value to test readResolve
        // In a real scenario, this would happen during deserialization.
        // We simulate this by directly calling calculateHashCode with a different state if needed,
        // but here we rely on the fact that readResolve recalculates it.
        // For this test, we just check that hashCode is correct after construction,
        // and readResolve should preserve it or recalculate it correctly.
        // The primary function of readResolve is to fix hashCode if it's transient.
        // If hashCode was transient and deserialized to 0, readResolve would fix it.
        // We can't easily test the transient aspect without serialization/deserialization.
        // However, we can check that the computed hashCode is correct.
        int expectedHashCode = 0;
        for (final Object key : keys) {
            if (key != null) {
                expectedHashCode ^= key.hashCode();
            }
        }
        assertEquals(expectedHashCode, multiKey.hashCode());
        // Calling readResolve directly to ensure it does not alter the correct hashcode.
        Object resolved = multiKey.readResolve();
        assertTrue(resolved instanceof MultiKey);
        assertEquals(multiKey.hashCode(), ((MultiKey<?>)resolved).hashCode());
    }

    @Test
    public void testMultiKeyWithNullKeysOnly() throws Exception {
        MultiKey<Object> multiKey = new MultiKey<>(null, null);
        assertEquals(2, multiKey.size());
        assertNull(multiKey.getKey(0));
        assertNull(multiKey.getKey(1));
        assertEquals(0, multiKey.hashCode()); // XOR of null hashes is 0
        assertEquals("MultiKey[null, null]", multiKey.toString());
    }

    @Test
    public void testConstructorWithSingleKeyArray() throws Exception {
        String[] keys = {"singleKey"};
        MultiKey<String> multiKey = new MultiKey<>(keys);
        assertEquals(1, multiKey.size());
        assertEquals("singleKey", multiKey.getKey(0));
    }

    @Test
    public void testConstructorWithEmptyArray() throws Exception {
        String[] keys = {};
        MultiKey<String> multiKey = new MultiKey<>(keys);
        assertEquals(0, multiKey.size());
    }

    @Test
    public void testEqualsWithDifferentType() throws Exception {
        MultiKey<String> multiKey = new MultiKey<>("key1", "key2");
        assertFalse(multiKey.equals(new Object()));
    }
}
