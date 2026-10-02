package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;

public class ListOrderedMapAI22Test {

    @Test
    public void testPutMaintainsInsertionOrderAndDuplicatesPreservePosition() {
        final ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        assertEquals("one", map.firstKey());
        assertEquals("three", map.lastKey());
        assertEquals("two", map.nextKey("one"));
        assertEquals("three", map.nextKey("two"));
        assertNull(map.nextKey("three"));

        // Updating an existing key should preserve its order
        map.put("two", 20);
        assertEquals(3, map.size());
        assertEquals(Integer.valueOf(20), map.get("two"));
        assertEquals("two", map.nextKey("one"));
        assertEquals("three", map.nextKey("two"));
    }

    @Test
    public void testOrderedMapIteratorBidirectionalAndModifications() {
        final ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("A", "Alpha");
        map.put("B", "Beta");
        map.put("C", "Gamma");

        final OrderedMapIterator<String, String> it = map.mapIterator();
        assertFalse(it.hasPrevious());
        assertTrue(it.hasNext());

        assertEquals("A", it.next());
        assertEquals("A", it.getKey());
        assertEquals("Alpha", it.getValue());
        assertTrue(it.hasPrevious());

        assertEquals("B", it.next());
        assertEquals("Beta", it.setValue("Bravo"));
        assertEquals("Bravo", map.get("B"));

        assertEquals("C", it.next());
        assertFalse(it.hasNext());

        // Backtrack
        assertEquals("C", it.previous());
        assertEquals("B", it.previous());
        assertEquals("B", it.getKey());
        it.remove();

        assertEquals(2, map.size());
        assertFalse(map.containsKey("B"));
        assertEquals("A", map.firstKey());
        assertEquals("C", map.lastKey());
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorInvalidState() {
        final ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("key", "value");
        final OrderedMapIterator<String, String> it = map.mapIterator();
        // calling getKey before next() must throw IllegalStateException
        it.getKey();
    }

    @Test
    public void testFirstKeyAndLastKeyEmptyMapThrows() {
        final ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        try {
            map.firstKey();
            org.junit.Assert.fail("Expected NoSuchElementException on empty firstKey()");
        } catch (final NoSuchElementException e) {
            // expected
        }

        try {
            map.lastKey();
            org.junit.Assert.fail("Expected NoSuchElementException on empty lastKey()");
        } catch (final NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testNextAndPreviousKey() {
        final ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        assertNull(map.previousKey("k1"));
        assertEquals("k1", map.previousKey("k2"));
        assertEquals("k2", map.previousKey("k3"));

        assertEquals("k2", map.nextKey("k1"));
        assertEquals("k3", map.nextKey("k2"));
        assertNull(map.nextKey("k3"));

        assertNull(map.previousKey("nonexistent"));
        assertNull(map.nextKey("nonexistent"));
    }

    @Test
    public void testPutWithIndexNewKey() {
        final ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("c", 3);

        map.put(1, "b", 2);

        assertEquals(3, map.size());
        final List<String> keys = map.asList();
        assertEquals("a", keys.get(0));
        assertEquals("b", keys.get(1));
        assertEquals("c", keys.get(2));
    }

    @Test
    public void testPutWithIndexExistingKeyReorder() {
        final ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Move "c" (index 2) to index 0
        final Integer oldVal = map.put(0, "c", 30);
        assertEquals(Integer.valueOf(3), oldVal);
        assertEquals(3, map.size());

        final List<String> keys = map.asList();
        assertEquals("c", keys.get(0));
        assertEquals("a", keys.get(1));
        assertEquals("b", keys.get(2));
        assertEquals(Integer.valueOf(30), map.get("c"));

        // Move "c" from index 0 to index 2
        map.put(2, "c", 300);
        final List<String> keysAfter = map.asList();
        assertEquals("a", keysAfter.get(0));
        assertEquals("b", keysAfter.get(1));
        assertEquals("c", keysAfter.get(2));
        assertEquals(Integer.valueOf(300), map.get("c"));
    }

    @Test
    public void testRemoveByIndex() {
        final ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("x", "10");
        map.put("y", "20");
        map.put("z", "30");

        final String removed = map.remove(1);
        assertEquals("20", removed);
        assertEquals(2, map.size());
        assertFalse(map.containsKey("y"));
        assertEquals("x", map.firstKey());
        assertEquals("z", map.lastKey());
    }

    @Test
    public void testPutAllWithIndex() {
        final ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("a", "A");
        map.put("d", "D");

        final Map<String, String> insert = new ListOrderedMap<String, String>();
        insert.put("b", "B");
        insert.put("c", "C");

        map.putAll(1, insert);

        assertEquals(4, map.size());
        final List<String> keys = map.asList();
        assertEquals("a", keys.get(0));
        assertEquals("b", keys.get(1));
        assertEquals("c", keys.get(2));
        assertEquals("d", keys.get(3));
    }

    @Test
    public void testPutAllWithIndexContainingExistingKey() {
        final ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");

        final Map<String, String> insert = new ListOrderedMap<String, String>();
        insert.put("b", "B2");
        insert.put("d", "D");

        map.putAll(0, insert);

        final List<String> keys = map.asList();
        assertEquals("b", keys.get(0));
        assertEquals("d", keys.get(1));
        assertEquals("a", keys.get(2));
        assertEquals("c", keys.get(3));
        assertEquals("B2", map.get("b"));
    }

    @Test
    public void testEntrySetIteratorAndRemove() {
        final ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);

        final Iterator<Map.Entry<String, Integer>> entryIt = map.entrySet().iterator();
        assertTrue(entryIt.hasNext());
        final Map.Entry<String, Integer> e1 = entryIt.next();
        assertEquals("first", e1.getKey());
        assertEquals(Integer.valueOf(1), e1.getValue());

        e1.setValue(10);
        assertEquals(Integer.valueOf(10), map.get("first"));

        final Map.Entry<String, Integer> e2 = entryIt.next();
        assertEquals("second", e2.getKey());
        entryIt.remove();

        assertEquals(2, map.size());
        assertFalse(map.containsKey("second"));
        assertEquals("third", map.nextKey("first"));
    }

    @Test
    public void testValuesViewAndKeySetView() {
        final ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        assertEquals(3, map.keySet().size());
        assertTrue(map.keySet().contains("k2"));
        assertFalse(map.keySet().contains("k4"));

        assertEquals(3, map.values().size());
        assertTrue(map.values().contains("v2"));
        assertFalse(map.values().contains("v4"));

        final List<String> vals = new ArrayList<String>(map.values());
        assertEquals("v1", vals.get(0));
        assertEquals("v2", vals.get(1));
        assertEquals("v3", vals.get(2));

        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertTrue(map.keySet().isEmpty());
        assertTrue(map.values().isEmpty());
    }
}
