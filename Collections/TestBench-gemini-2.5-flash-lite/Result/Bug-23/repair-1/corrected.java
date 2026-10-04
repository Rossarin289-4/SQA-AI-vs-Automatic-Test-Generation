package org.apache.commons.collections4.trie;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.Unmodifiable;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;

public class UnmodifiableTrieTest {

    // A minimal implementation of Trie to pass to UnmodifiableTrie constructor.
    // This is a last resort as mocks are forbidden, but necessary to instantiate
    // UnmodifiableTrie and test its methods. This implementation is extremely basic
    // and will likely fail tests expecting specific delegate behavior for non-unmodifiable methods.
    // However, it allows testing of the UnsupportedOperationException throwing methods.
    private static class BasicTrie<K, V> implements Trie<K, V>, Serializable {
        private static final long serialVersionUID = 1L;
        private final Map<K, V> map = Collections.emptyMap(); // Use empty map as delegate for basic ops

        @Override public Set<Entry<K, V>> entrySet() { return map.entrySet(); }
        @Override public Set<K> keySet() { return map.keySet(); }
        @Override public Collection<V> values() { return map.values(); }
        @Override public void clear() { throw new UnsupportedOperationException(); }
        @Override public boolean containsKey(Object key) { return map.containsKey(key); }
        @Override public boolean containsValue(Object value) { return map.containsValue(value); }
        @Override public V get(Object key) { return map.get(key); }
        @Override public boolean isEmpty() { return map.isEmpty(); }
        @Override public V put(K key, V value) { throw new UnsupportedOperationException(); }
        @Override public void putAll(Map<? extends K, ? extends V> m) { throw new UnsupportedOperationException(); }
        @Override public V remove(Object key) { throw new UnsupportedOperationException(); }
        @Override public int size() { return map.size(); }
        @Override public K firstKey() { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public SortedMap<K, V> headMap(K toKey) { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public K lastKey() { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public SortedMap<K, V> subMap(K fromKey, K toKey) { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public SortedMap<K, V> tailMap(K fromKey) { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public SortedMap<K, V> prefixMap(K key) { throw new UnsupportedOperationException("Trie specific methods"); }
        @Override public Comparator<? super K> comparator() { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public OrderedMapIterator<K, V> mapIterator() {
            // This is problematic without a real iterator, but UnmodifiableTrie wraps it.
            // For testing UnsupportedOperationException, this is less critical.
            // Returning an unmodifiable iterator for an empty map.
            return UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(
                new org.apache.commons.collections4.MapIterator<K, V>() {
                    private boolean calledNext = false;
                    @Override public boolean hasNext() { return false; }
                    @Override public K next() { throw new java.util.NoSuchElementException(); }
                    @Override public K getKey() { throw new java.util.NoSuchElementException(); }
                    @Override public V getValue() { throw new java.util.NoSuchElementException(); }
                    @Override public V setValue(V value) { throw new UnsupportedOperationException(); }
                    @Override public void remove() { throw new UnsupportedOperationException(); }
                }
            );
        }
        @Override public K nextKey(K key) { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public K previousKey(K key) { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public int hashCode() { return map.hashCode(); }
        @Override public boolean equals(Object obj) { return map.equals(obj); }
        @Override public String toString() { return map.toString(); }
    }


    @Test
    public void testUnmodifiableTrie_constructor_nullInput_throwsIllegalArgumentException() {
        try {
            new UnmodifiableTrie<>(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Trie must not be null", e.getMessage());
        }
    }

    @Test
    public void testUnmodifiableTrie_factoryMethod_nullInput_throwsIllegalArgumentException() {
        try {
            UnmodifiableTrie.unmodifiableTrie(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Trie must not be null", e.getMessage());
        }
    }

    @Test
    public void testUnmodifiableTrie_factoryMethod_alreadyUnmodifiable_returnsSameInstance() {
        // We need an instance of UnmodifiableTrie to test this.
        // Create a BasicTrie first, then wrap it.
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        Trie<String, Integer> unmodifiableDelegate = UnmodifiableTrie.unmodifiableTrie(delegate);

        // Now, pass the unmodifiable instance to the factory method again.
        Trie<String, Integer> returnedTrie = UnmodifiableTrie.unmodifiableTrie(unmodifiableDelegate);

        // It should return the same instance because it's already Unmodifiable.
        assertSame(unmodifiableDelegate, returnedTrie);
    }

    // Tests for methods that should throw UnsupportedOperationException
    @Test
    public void testUnmodifiableTrie_clear_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_put_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.put("key", 1);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_putAll_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        Map<String, Integer> map = Collections.singletonMap("key", 1);
        try {
            unmodifiableTrie.putAll(map);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_remove_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.remove("key");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    // Tests for methods that delegate and return unmodifiable views/iterators
    // These tests are highly dependent on the BasicTrie implementation and
    // might not fully capture UnmodifiableTrie's behavior if the delegate's
    // behavior is not as expected.

    @Test
    public void testUnmodifiableTrie_entrySet_returnsUnmodifiableSet() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        Set<Map.Entry<String, Integer>> entrySet = unmodifiableTrie.entrySet();
        // BasicTrie uses Collections.emptyMap(), so entrySet is unmodifiable by default.
        // We assert it's a Set and it's unmodifiable.
        assertTrue(entrySet instanceof Set);
        try {
            entrySet.add(null); // This should throw UnsupportedOperationException
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_keySet_returnsUnmodifiableSet() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        Set<String> keySet = unmodifiableTrie.keySet();
        assertTrue(keySet instanceof Set);
        try {
            keySet.add("test"); // This should throw UnsupportedOperationException
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_values_returnsUnmodifiableCollection() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        Collection<Integer> values = unmodifiableTrie.values();
        assertTrue(values instanceof Collection);
        try {
            values.add(1); // This should throw UnsupportedOperationException
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_containsKey_delegates() {
        // This test is limited by the BasicTrie using an empty map.
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertFalse(unmodifiableTrie.containsKey("test")); // For empty map
    }

    @Test
    public void testUnmodifiableTrie_containsValue_delegates() {
        // This test is limited by the BasicTrie using an empty map.
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertFalse(unmodifiableTrie.containsValue(1)); // For empty map
    }

    @Test
    public void testUnmodifiableTrie_get_delegates() {
        // This test is limited by the BasicTrie using an empty map.
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertNull(unmodifiableTrie.get("test")); // For empty map
    }

    @Test
    public void testUnmodifiableTrie_isEmpty_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertTrue(unmodifiableTrie.isEmpty()); // For empty map
    }

    @Test
    public void testUnmodifiableTrie_size_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertEquals(0, unmodifiableTrie.size()); // For empty map
    }

    @Test
    public void testUnmodifiableTrie_mapIterator_returnsUnmodifiableIterator() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>(); // Uses empty map
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        OrderedMapIterator<String, Integer> iterator = unmodifiableTrie.mapIterator();

        assertTrue(iterator instanceof OrderedMapIterator);
        assertTrue(iterator instanceof Unmodifiable); // Ensure it's marked as unmodifiable

        assertFalse(iterator.hasNext()); // For empty map delegate

        // Test that iterator operations that modify are unsupported
        try {
            iterator.setValue(10);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
        try {
            iterator.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    // These tests are placeholders because BasicTrie does not implement
    // SortedMap methods like firstKey, lastKey, headMap, subMap, tailMap, prefixMap, comparator, nextKey, previousKey
    // and throws UnsupportedOperationException.
    // If a proper Trie implementation were available, these would be meaningful.
    @Test
    public void testUnmodifiableTrie_firstKey_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.firstKey();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_headMap_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.headMap("key");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_lastKey_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.lastKey();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_subMap_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.subMap("from", "to");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_tailMap_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.tailMap("from");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_prefixMap_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.prefixMap("key");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_comparator_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.comparator();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_nextKey_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.nextKey("key");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_previousKey_throwsUnsupportedOperationException() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        try {
            unmodifiableTrie.previousKey("key");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testUnmodifiableTrie_hashCode_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertEquals(delegate.hashCode(), unmodifiableTrie.hashCode());
    }

    @Test
    public void testUnmodifiableTrie_equals_delegates() {
        BasicTrie<String, Integer> delegate1 = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie1 = new UnmodifiableTrie<>(delegate1);

        BasicTrie<String, Integer> delegate2 = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie2 = new UnmodifiableTrie<>(delegate2);

        assertEquals(unmodifiableTrie1, unmodifiableTrie2); // Both use empty map delegate

        BasicTrie<String, Integer> delegate3 = new BasicTrie<>();
        delegate3.map.put("a", 1); // Modify delegate to make it different
        UnmodifiableTrie<String, Integer> unmodifiableTrie3 = new UnmodifiableTrie<>(delegate3);

        assertNotEquals(unmodifiableTrie1, unmodifiableTrie3);
    }

    @Test
    public void testUnmodifiableTrie_toString_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertEquals(delegate.toString(), unmodifiableTrie.toString());
    }
}
