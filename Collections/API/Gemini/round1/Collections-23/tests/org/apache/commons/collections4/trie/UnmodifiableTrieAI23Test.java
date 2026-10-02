package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.junit.Before;
import org.junit.Test;

public class UnmodifiableTrieAI23Test {

    private Trie<String, Integer> underlyingTrie;
    private Trie<String, Integer> unmodifiableTrie;

    @Before
    public void setUp() {
        underlyingTrie = new PatriciaTrie<Integer>();
        underlyingTrie.put("apple", 1);
        underlyingTrie.put("app", 2);
        underlyingTrie.put("banana", 3);
        unmodifiableTrie = UnmodifiableTrie.unmodifiableTrie(underlyingTrie);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryWithNullTrie() {
        UnmodifiableTrie.unmodifiableTrie(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullTrie() {
        new UnmodifiableTrie<String, Integer>(null);
    }

    @Test
    public void testFactoryIdempotent() {
        final Trie<String, Integer> wrappedAgain = UnmodifiableTrie.unmodifiableTrie(unmodifiableTrie);
        assertSame(unmodifiableTrie, wrappedAgain);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPutThrowsException() {
        unmodifiableTrie.put("cherry", 4);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveThrowsException() {
        unmodifiableTrie.remove("app");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClearThrowsException() {
        unmodifiableTrie.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPutAllThrowsException() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("date", 5);
        unmodifiableTrie.putAll(map);
    }

    @Test
    public void testReadOperationsAndDelegation() {
        assertEquals(3, unmodifiableTrie.size());
        assertFalse(unmodifiableTrie.isEmpty());
        assertTrue(unmodifiableTrie.containsKey("apple"));
        assertFalse(unmodifiableTrie.containsKey("cherry"));
        assertTrue(unmodifiableTrie.containsValue(Integer.valueOf(1)));
        assertFalse(unmodifiableTrie.containsValue(Integer.valueOf(99)));
        assertEquals(Integer.valueOf(1), unmodifiableTrie.get("apple"));
        assertEquals(Integer.valueOf(2), unmodifiableTrie.get("app"));
        assertEquals("app", unmodifiableTrie.firstKey());
        assertEquals("banana", unmodifiableTrie.lastKey());
        assertEquals("apple", unmodifiableTrie.nextKey("app"));
        assertEquals("app", unmodifiableTrie.previousKey("apple"));
        assertEquals(underlyingTrie.comparator(), unmodifiableTrie.comparator());
        assertEquals(underlyingTrie.hashCode(), unmodifiableTrie.hashCode());
        assertEquals(underlyingTrie.toString(), unmodifiableTrie.toString());
        assertEquals(underlyingTrie, unmodifiableTrie);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testKeySetUnmodifiable() {
        unmodifiableTrie.keySet().remove("app");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testValuesUnmodifiable() {
        unmodifiableTrie.values().remove(Integer.valueOf(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testEntrySetUnmodifiable() {
        unmodifiableTrie.entrySet().clear();
    }

    @Test
    public void testSubMapsAreUnmodifiable() {
        final SortedMap<String, Integer> prefix = unmodifiableTrie.prefixMap("app");
        assertEquals(2, prefix.size());
        assertTrue(prefix.containsKey("app"));
        assertTrue(prefix.containsKey("apple"));

        try {
            prefix.clear();
            org.junit.Assert.fail("Expected UnsupportedOperationException on prefixMap.clear()");
        } catch (final UnsupportedOperationException expected) {
            // expected
        }

        final SortedMap<String, Integer> head = unmodifiableTrie.headMap("banana");
        assertEquals(2, head.size());
        try {
            head.remove("app");
            org.junit.Assert.fail("Expected UnsupportedOperationException on headMap.remove()");
        } catch (final UnsupportedOperationException expected) {
            // expected
        }

        final SortedMap<String, Integer> tail = unmodifiableTrie.tailMap("banana");
        assertEquals(1, tail.size());
        try {
            tail.clear();
            org.junit.Assert.fail("Expected UnsupportedOperationException on tailMap.clear()");
        } catch (final UnsupportedOperationException expected) {
            // expected
        }

        final SortedMap<String, Integer> sub = unmodifiableTrie.subMap("app", "banana");
        assertEquals(2, sub.size());
        try {
            sub.clear();
            org.junit.Assert.fail("Expected UnsupportedOperationException on subMap.clear()");
        } catch (final UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testMapIteratorUnmodifiable() {
        final OrderedMapIterator<String, Integer> it = unmodifiableTrie.mapIterator();
        assertNotNull(it);
        assertTrue(it.hasNext());
        it.next();
        it.remove();
    }
}
