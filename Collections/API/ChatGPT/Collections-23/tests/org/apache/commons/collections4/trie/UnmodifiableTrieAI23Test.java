package org.apache.commons.collections4.trie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.junit.Assert;
import org.junit.Test;

public class UnmodifiableTrieAI23Test {

    private PatriciaTrie<Integer> populatedTrie() {
        PatriciaTrie<Integer> trie = new PatriciaTrie<Integer>();
        trie.put("apple", Integer.valueOf(1));
        trie.put("banana", Integer.valueOf(2));
        trie.put("carrot", Integer.valueOf(3));
        return trie;
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorRejectsNullTrie() {
        new UnmodifiableTrie<String, Integer>(null);
    }

    @Test
    public void delegatesReadOperationsAndOrdering() {
        PatriciaTrie<Integer> base = populatedTrie();
        Trie<String, Integer> trie = new UnmodifiableTrie<String, Integer>(base);

        Assert.assertEquals(3, trie.size());
        Assert.assertFalse(trie.isEmpty());
        Assert.assertTrue(trie.containsKey("banana"));
        Assert.assertTrue(trie.containsValue(Integer.valueOf(3)));
        Assert.assertEquals(Integer.valueOf(1), trie.get("apple"));
        Assert.assertNull(trie.get("missing"));
        Assert.assertEquals("apple", trie.firstKey());
        Assert.assertEquals("carrot", trie.lastKey());
        Assert.assertEquals("banana", trie.nextKey("apple"));
        Assert.assertEquals("banana", trie.previousKey("carrot"));
        Assert.assertNull(trie.comparator());
    }

    @Test
    public void factoryReturnsSameInstanceForAlreadyUnmodifiableTrieAndWrapperIsLive() {
        PatriciaTrie<Integer> base = new PatriciaTrie<Integer>();
        base.put("one", Integer.valueOf(1));

        Trie<String, Integer> wrapped =
                UnmodifiableTrie.<String, Integer>unmodifiableTrie(base);
        Trie<String, Integer> wrappedAgain =
                UnmodifiableTrie.<String, Integer>unmodifiableTrie(wrapped);

        Assert.assertSame(wrapped, wrappedAgain);
        base.put("two", Integer.valueOf(2));
        Assert.assertEquals(2, wrapped.size());
        Assert.assertEquals(Integer.valueOf(2), wrapped.get("two"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void putIsNotSupported() {
        Trie<String, Integer> trie = new UnmodifiableTrie<String, Integer>(populatedTrie());
        trie.put("date", Integer.valueOf(4));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeIsNotSupported() {
        Trie<String, Integer> trie = new UnmodifiableTrie<String, Integer>(populatedTrie());
        trie.remove("banana");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void clearIsNotSupported() {
        Trie<String, Integer> trie = new UnmodifiableTrie<String, Integer>(populatedTrie());
        trie.clear();
    }

    @Test
    public void putAllIsNotSupportedAndDoesNotChangeDelegate() {
        final Trie<String, Integer> trie =
                new UnmodifiableTrie<String, Integer>(populatedTrie());
        Map<String, Integer> additions = new HashMap<String, Integer>();
        additions.put("date", Integer.valueOf(4));

        try {
            trie.putAll(additions);
            Assert.fail("putAll should be unsupported");
        } catch (UnsupportedOperationException expected) {
            // expected
        }

        Assert.assertEquals(3, trie.size());
        Assert.assertFalse(trie.containsKey("date"));
    }

    @Test
    public void collectionViewsAreUnmodifiableAndReflectDelegateContents() {
        PatriciaTrie<Integer> base = populatedTrie();
        Trie<String, Integer> trie = new UnmodifiableTrie<String, Integer>(base);

        Set<String> keys = trie.keySet();
        Collection<Integer> values = trie.values();
        Set<Map.Entry<String, Integer>> entries = trie.entrySet();

        Assert.assertTrue(keys.contains("apple"));
        Assert.assertTrue(values.contains(Integer.valueOf(2)));
        Assert.assertEquals(3, entries.size());

        try {
            keys.remove("apple");
            Assert.fail("key set must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
        try {
            values.remove(Integer.valueOf(2));
            Assert.fail("values collection must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
        try {
            entries.clear();
            Assert.fail("entry set must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }

        base.put("date", Integer.valueOf(4));
        Assert.assertTrue(keys.contains("date"));
        Assert.assertTrue(values.contains(Integer.valueOf(4)));
        Assert.assertEquals(4, entries.size());
    }

    @Test
    public void rangeAndPrefixMapsHaveExpectedContentsAndAreUnmodifiable() {
        Trie<String, Integer> trie = new UnmodifiableTrie<String, Integer>(populatedTrie());

        SortedMap<String, Integer> head = trie.headMap("banana");
        SortedMap<String, Integer> tail = trie.tailMap("banana");
        SortedMap<String, Integer> sub = trie.subMap("apple", "carrot");
        SortedMap<String, Integer> prefix = trie.prefixMap("app");

        Assert.assertEquals(1, head.size());
        Assert.assertEquals(Integer.valueOf(1), head.get("apple"));
        Assert.assertEquals(2, tail.size());
        Assert.assertTrue(tail.containsKey("banana"));
        Assert.assertTrue(tail.containsKey("carrot"));
        Assert.assertEquals(2, sub.size());
        Assert.assertTrue(sub.containsKey("apple"));
        Assert.assertTrue(sub.containsKey("banana"));
        Assert.assertEquals(1, prefix.size());
        Assert.assertEquals(Integer.valueOf(1), prefix.get("apple"));

        try {
            head.put("avocado", Integer.valueOf(9));
            Assert.fail("range map must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
        try {
            prefix.remove("apple");
            Assert.fail("prefix map must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void mapIteratorProvidesTraversalButNotMutation() {
        Trie<String, Integer> trie = new UnmodifiableTrie<String, Integer>(populatedTrie());
        OrderedMapIterator<String, Integer> iterator = trie.mapIterator();

        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("apple", iterator.next());
        Assert.assertEquals("apple", iterator.getKey());
        Assert.assertEquals(Integer.valueOf(1), iterator.getValue());

        try {
            iterator.setValue(Integer.valueOf(10));
            Assert.fail("iterator setValue must be unsupported");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
        try {
            iterator.remove();
            Assert.fail("iterator remove must be unsupported");
        } catch (UnsupportedOperationException expected) {
            // expected
        }

        Assert.assertEquals(Integer.valueOf(1), trie.get("apple"));
    }
}
