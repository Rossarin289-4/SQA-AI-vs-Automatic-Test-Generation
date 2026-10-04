package org.apache.commons.collections4.trie;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.OrderedMapIterator;

public class AbstractPatriciaTrieTest {
    @Test
    public void testPutReplaceAndRemove() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        assertNull(trie.put("a", "one"));
        assertEquals("one", trie.put("a", "two"));
        assertEquals(1, trie.size());
        assertEquals("two", trie.remove("a"));
        assertEquals(0, trie.size());
    }

    @Test
    public void testNullPutRejected() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        try { trie.put(null, "v"); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
        assertEquals(0, trie.size());
    }

    @Test
    public void testLookupOfNullAndAbsentKeys() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("cat", "pet");
        assertNull(trie.get(null));
        assertFalse(trie.containsKey(null));
        assertNull(trie.get("dog"));
        assertFalse(trie.containsKey("dog"));
    }

    @Test
    public void testSelectClosestAndSelectAccessors() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("H", "eight");
        trie.put("L", "twelve");
        Map.Entry<String, String> selected = trie.select("D");
        assertNotNull(selected);
        assertEquals("L", selected.getKey());
        assertEquals("L", trie.selectKey("D"));
        assertEquals("twelve", trie.selectValue("D"));
    }

    @Test
    public void testSelectEmptyTrie() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        assertNull(trie.select("a"));
        assertNull(trie.selectKey("a"));
        assertNull(trie.selectValue("a"));
    }

    @Test
    public void testViewsReflectPutAndRemove() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("b", "two");
        trie.put("a", "one");
        assertEquals(2, trie.keySet().size());
        assertTrue(trie.keySet().contains("a"));
        assertTrue(trie.values().contains("two"));
        assertTrue(trie.entrySet().contains(new AbstractMap.SimpleEntry<String, String>("a", "one")));
        assertEquals("one", trie.remove("a"));
        assertEquals(1, trie.entrySet().size());
    }

    @Test
    public void testIteratorOrderAndMapIteratorMutation() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("b", "B");
        trie.put("a", "A");
        trie.put("c", "C");
        Iterator<String> keys = trie.keySet().iterator();
        assertEquals("a", keys.next());
        assertEquals("b", keys.next());
        OrderedMapIterator<String, String> it = trie.mapIterator();
        assertEquals("a", it.next());
        assertEquals("A", it.getValue());
        assertEquals("A", it.setValue("changed"));
        assertEquals("changed", trie.get("a"));
        assertTrue(it.hasPrevious());
        assertEquals("a", it.previous());
    }

    @Test
    public void testIteratorFailsFastAfterModification() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        Iterator<String> it = trie.keySet().iterator();
        assertEquals("a", it.next());
        trie.put("b", "B");
        try { it.hasNext(); assertTrue(true); it.next(); fail("expected ConcurrentModificationException"); }
        catch (ConcurrentModificationException expected) { assertEquals(2, trie.size()); }
    }

    @Test
    public void testClearResetsTrie() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        trie.put("b", "B");
        trie.clear();
        assertEquals(0, trie.size());
        assertTrue(trie.isEmpty());
        assertNull(trie.get("a"));
    }

    @Test
    public void testFirstLastAndNeighborKeys() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("b", "B");
        trie.put("a", "A");
        trie.put("c", "C");
        assertEquals("a", trie.firstKey());
        assertEquals("c", trie.lastKey());
        assertEquals("b", trie.nextKey("a"));
        assertNull(trie.nextKey("c"));
        assertEquals("b", trie.previousKey("c"));
        assertNull(trie.previousKey("a"));
        assertNull(trie.nextKey("missing"));
    }

    @Test
    public void testNavigationRejectsNull() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        try { trie.nextKey(null); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { assertEquals(0, trie.size()); }
    }

    @Test
    public void testPrefixMapConfiguredView() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("car", "one");
        trie.put("cart", "two");
        trie.put("cat", "three");
        trie.put("dog", "four");
        SortedMap<String, String> prefix = trie.prefixMap("car");
        assertEquals(2, prefix.size());
        assertEquals("car", prefix.firstKey());
        assertEquals("cart", prefix.lastKey());
        assertFalse(prefix.containsKey("cat"));
        assertEquals("two", prefix.get("cart"));
    }

    @Test
    public void testEmptyPrefixMapReturnsWholeTrie() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        trie.put("b", "B");
        assertEquals(2, trie.prefixMap("").size());
    }

    @Test
    public void testPrefixMapMutationAndClearAreScoped() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("ab", "one");
        trie.put("ac", "two");
        trie.put("zz", "other");
        SortedMap<String, String> prefix = trie.prefixMap("a");
        prefix.remove("ab");
        assertFalse(trie.containsKey("ab"));
        assertTrue(trie.containsKey("zz"));
        prefix.clear();
        assertFalse(trie.containsKey("ac"));
        assertTrue(trie.containsKey("zz"));
    }

    @Test
    public void testHeadTailAndSubMapBoundaries() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        trie.put("b", "B");
        trie.put("c", "C");
        trie.put("d", "D");
        SortedMap<String, String> sub = trie.subMap("b", "d");
        assertEquals(2, sub.size());
        assertTrue(sub.containsKey("b"));
        assertFalse(sub.containsKey("d"));
        assertEquals("c", sub.lastKey());
        assertEquals(2, trie.headMap("c").size());
        assertEquals(2, trie.tailMap("c").size());
    }

    @Test
    public void testRangePutAndOutOfRangeRejected() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("b", "B");
        SortedMap<String, String> range = trie.subMap("b", "d");
        assertNull(range.put("c", "C"));
        assertEquals("C", trie.get("c"));
        try { range.put("d", "D"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { assertFalse(range.containsKey("d")); }
    }

    @Test
    public void testRangeViewRemovalAndEntryIteration() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        trie.put("b", "B");
        trie.put("c", "C");
        SortedMap<String, String> range = trie.subMap("b", "c");
        Iterator<Map.Entry<String, String>> entries = range.entrySet().iterator();
        assertEquals("b", entries.next().getKey());
        assertFalse(entries.hasNext());
        assertEquals("B", range.remove("b"));
        assertEquals(2, trie.size());
    }

    @Test
    public void testComparatorAndSortedViews() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("b", "B");
        trie.put("a", "A");
        Comparator<? super String> comparator = trie.comparator();
        assertTrue(comparator.compare("a", "b") < 0);
        assertEquals("a", trie.headMap("b").firstKey());
    }

    @Test
    public void testEntrySetConditionalRemoval() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("key", "value");
        assertFalse(trie.entrySet().remove(new AbstractMap.SimpleEntry<String, String>("key", "wrong")));
        assertTrue(trie.entrySet().remove(new AbstractMap.SimpleEntry<String, String>("key", "value")));
        assertFalse(trie.containsKey("key"));
    }

    @Test
    public void testKeySetAndValuesRemoval() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "same");
        trie.put("b", "same");
        assertTrue(trie.values().remove("same"));
        assertEquals(1, trie.size());
        assertTrue(trie.keySet().remove(trie.firstKey()));
        assertTrue(trie.isEmpty());
    }

    @Test
    public void testFirstAndLastKeyOnEmptyThrow() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        try { trie.firstKey(); fail("expected NoSuchElementException"); }
        catch (NoSuchElementException expected) { assertEquals(0, trie.size()); }
        try { trie.lastKey(); fail("expected NoSuchElementException"); }
        catch (NoSuchElementException expected) { assertTrue(trie.isEmpty()); }
    }

    @Test
    public void testRemoveMissingAndNull() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        assertNull(trie.remove(null));
        assertNull(trie.remove("z"));
        assertEquals(1, trie.size());
    }

    @Test
    public void testEntrySetUnmodifiableEntryTextAndNodeState() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("x", "value");
        Map.Entry<String, String> entry = trie.entrySet().iterator().next();
        assertEquals("x", entry.getKey());
        assertEquals("value", entry.getValue());
        String text = entry.toString();
        assertTrue(text.contains("x"));
        assertTrue(text.contains("value"));
    }

    @Test
    public void testRangeViewEndpointsAndInclusionFlags() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        trie.put("b", "B");
        trie.put("c", "C");
        SortedMap<String, String> range = trie.subMap("a", "c");
        assertEquals("a", range.firstKey());
        assertEquals("b", range.lastKey());
        assertTrue(range.containsKey("a"));
        assertFalse(range.containsKey("c"));
    }

    @Test
    public void testHeadAndTailRangeEndpointKeys() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        trie.put("b", "B");
        trie.put("c", "C");
        SortedMap<String, String> head = trie.headMap("b");
        SortedMap<String, String> tail = trie.tailMap("b");
        assertEquals("a", head.firstKey());
        assertEquals("a", head.lastKey());
        assertEquals("b", tail.firstKey());
        assertEquals("c", tail.lastKey());
    }

    @Test
    public void testNestedRangeEndpointInclusion() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        trie.put("b", "B");
        trie.put("c", "C");
        trie.put("d", "D");
        SortedMap<String, String> range = trie.subMap("b", "d");
        assertEquals("b", range.firstKey());
        assertEquals("c", range.lastKey());
        assertEquals(2, range.size());
    }

    @Test
    public void testRangeSubMapKeepsEndpointFlags() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("a", "A");
        trie.put("b", "B");
        trie.put("c", "C");
        trie.put("d", "D");
        SortedMap<String, String> range = trie.subMap("a", "d");
        SortedMap<String, String> nested = range.subMap("b", "d");
        assertEquals("b", nested.firstKey());
        assertEquals("c", nested.lastKey());
        assertEquals(2, nested.size());
    }

    @Test
    public void testPrefixRangeExposesDerivedEndpoints() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("car", "one");
        trie.put("cart", "two");
        trie.put("cat", "three");
        SortedMap<String, String> prefix = trie.prefixMap("car");
        assertEquals(2, prefix.size());
        assertEquals("car", prefix.firstKey());
        assertEquals("cart", prefix.lastKey());
    }

    @Test
    public void testPrefixRangeNestedHeadAndTailAreBounded() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("aa", "one");
        trie.put("ab", "two");
        trie.put("ac", "three");
        trie.put("ba", "four");
        SortedMap<String, String> prefix = trie.prefixMap("a");
        SortedMap<String, String> head = prefix.headMap("ac");
        SortedMap<String, String> tail = prefix.tailMap("ab");
        assertEquals("aa", head.firstKey());
        assertEquals("ab", head.lastKey());
        assertEquals("ab", tail.firstKey());
        assertEquals("ac", tail.lastKey());
    }

    @Test
    public void testPrefixRangeNestedMapEndpointValues() throws Exception {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("aa", "A");
        trie.put("ab", "B");
        trie.put("ac", "C");
        SortedMap<String, String> prefix = trie.prefixMap("a");
        SortedMap<String, String> nested = prefix.subMap("aa", "ac");
        assertEquals("aa", nested.firstKey());
        assertEquals("ab", nested.lastKey());
        assertEquals(2, nested.size());
    }
}
