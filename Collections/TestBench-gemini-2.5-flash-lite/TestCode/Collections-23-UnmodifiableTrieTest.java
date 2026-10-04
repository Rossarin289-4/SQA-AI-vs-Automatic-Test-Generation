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
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class UnmodifiableTrieTest {

    // A minimal implementation of Trie to pass to UnmodifiableTrie constructor.
    private static class BasicTrie<K, V> implements Trie<K, V>, Serializable {
        private static final long serialVersionUID = 1L;
        private final Map<K, V> map = Collections.emptyMap(); // Use empty map as delegate for basic ops
        private final OrderedMapIterator<K, V> mapIterator = new BasicMapIterator<>();

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
            return mapIterator;
        }
        @Override public K nextKey(K key) { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public K previousKey(K key) { throw new UnsupportedOperationException("TreeMap required for this"); }
        @Override public int hashCode() { return map.hashCode(); }
        @Override public boolean equals(Object obj) { return map.equals(obj); }
        @Override public String toString() { return map.toString(); }

        // Minimal MapIterator implementation for BasicTrie
        private static class BasicMapIterator<K, V> implements OrderedMapIterator<K, V> {
            @Override public boolean hasNext() { return false; }
            @Override public K next() { throw new NoSuchElementException(); }
            @Override public K getKey() { throw new NoSuchElementException(); }
            @Override public V getValue() { throw new NoSuchElementException(); }
            @Override public V setValue(V value) { throw new UnsupportedOperationException(); }
            @Override public void remove() { throw new UnsupportedOperationException(); }
            @Override public boolean hasPrevious() { return false; }
            @Override public K previous() { throw new NoSuchElementException(); }
        }
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
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        Trie<String, Integer> unmodifiableDelegate = UnmodifiableTrie.unmodifiableTrie(delegate);
        Trie<String, Integer> returnedTrie = UnmodifiableTrie.unmodifiableTrie(unmodifiableDelegate);
        assertSame(unmodifiableDelegate, returnedTrie);
    }

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

    @Test
    public void testUnmodifiableTrie_entrySet_returnsUnmodifiableSet() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        Set<Entry<String, Integer>> entrySet = unmodifiableTrie.entrySet();
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
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertFalse(unmodifiableTrie.containsKey("test"));
    }

    @Test
    public void testUnmodifiableTrie_containsValue_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertFalse(unmodifiableTrie.containsValue(1));
    }

    @Test
    public void testUnmodifiableTrie_get_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertNull(unmodifiableTrie.get("test"));
    }

    @Test
    public void testUnmodifiableTrie_isEmpty_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertTrue(unmodifiableTrie.isEmpty());
    }

    @Test
    public void testUnmodifiableTrie_size_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertEquals(0, unmodifiableTrie.size());
    }

    @Test
    public void testUnmodifiableTrie_mapIterator_returnsUnmodifiableIterator() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        OrderedMapIterator<String, Integer> iterator = unmodifiableTrie.mapIterator();

        assertTrue(iterator instanceof OrderedMapIterator);
        assertTrue(iterator instanceof Unmodifiable);

        assertFalse(iterator.hasNext());
        assertFalse(iterator.hasPrevious());

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

        // To test inequality, we need a delegate that can actually hold entries.
        // Since BasicTrie uses Collections.emptyMap(), we cannot directly modify it
        // to make it different. A better approach would be to use a real Trie implementation
        // as the delegate here, but since that's not available or allowed, we can only
        // assert equality for identical delegates.
    }

    @Test
    public void testUnmodifiableTrie_toString_delegates() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        UnmodifiableTrie<String, Integer> unmodifiableTrie = new UnmodifiableTrie<>(delegate);
        assertEquals(delegate.toString(), unmodifiableTrie.toString());
    }

    // Added test for the static factory method's return type to be Trie
    @Test
    public void testUnmodifiableTrie_factoryMethod_returnsTrie() {
        BasicTrie<String, Integer> delegate = new BasicTrie<>();
        Trie<String, Integer> trie = UnmodifiableTrie.unmodifiableTrie(delegate);
        assertTrue(trie instanceof Trie);
    }
}
