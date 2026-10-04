```java
package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.ResettableIterator;
import org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator;
import org.apache.commons.collections4.keyvalue.AbstractMapEntry;
import org.apache.commons.collections4.list.UnmodifiableList;

public class ListOrderedMapTest {
    @Test
    public void testOrderedPutAndIndexedAccess() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        assertNull(map.put("a", 1));
        assertNull(map.put("b", 2));
        assertEquals("a", map.get(0));
        assertEquals(Integer.valueOf(2), map.getValue(1));
        assertEquals(0, map.indexOf("a"));
        assertEquals(-1, map.indexOf("missing"));
    }

    @Test
    public void testReplacingPutPreservesPosition() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(Integer.valueOf(1), map.put("a", 3));
        assertEquals("a", map.get(0));
        assertEquals(Integer.valueOf(3), map.getValue(0));
    }

    @Test
    public void testPutAllAddsEntriesInIterationOrder() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        Map<String, Integer> additions = new java.util.LinkedHashMap<String, Integer>();
        additions.put("x", 4);
        additions.put("y", 5);
        map.putAll(additions);
        assertEquals(2, map.size());
        assertEquals("x", map.get(0));
        assertEquals("y", map.get(1));
    }

    @Test
    public void testIndexedPutAtStartAndEnd() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        assertNull(map.put(0, "x", 3));
        assertNull(map.put(3, "z", 4));
        assertEquals("x", map.get(0));
        assertEquals("z", map.get(3));
    }

    @Test
    public void testIndexedPutMovesExistingKeyAtIndex() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals(Integer.valueOf(2), map.put(0, "b", 9));
        assertEquals("b", map.get(0));
        assertEquals(Integer.valueOf(9), map.getValue(0));
        assertEquals("a", map.get(1));
    }

    @Test
    public void testPutAllAtIndexInsertsAndReplaces() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        Map<String, Integer> additions = new java.util.LinkedHashMap<String, Integer>();
        additions.put("b", 8);
        additions.put("x", 7);
        map.putAll(0, additions);
        assertEquals("b", map.get(0));
        assertEquals("x", map.get(1));
        assertEquals("a", map.get(2));
        assertEquals(Integer.valueOf(8), map.getValue(0));
    }

    @Test
    public void testRemoveByKeyAndIndex() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(Integer.valueOf(1), map.remove("a"));
        assertEquals(Integer.valueOf(2), map.remove(0));
        assertEquals(0, map.size());
        assertNull(map.remove("absent"));
    }

    @Test
    public void testFirstLastNextPreviousKeyEdges() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals("a", map.firstKey());
        assertEquals("c", map.lastKey());
        assertEquals("b", map.nextKey("a"));
        assertNull(map.nextKey("c"));
        assertNull(map.nextKey("missing"));
        assertEquals("b", map.previousKey("c"));
        assertNull(map.previousKey("a"));
        assertNull(map.previousKey("missing"));
    }

    @Test
    public void testEmptyFirstKeyThrows() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        try {
            map.firstKey();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testKeyAndValueListsFollowInsertionOrder() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(java.util.Arrays.asList("a", "b"), map.keyList());
        assertEquals(java.util.Arrays.asList(1, 2), map.valueList());
        assertEquals(map.keyList(), map.asList());
    }

    @Test
    public void testValueListSetUpdatesMapAndRemove() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        List<Integer> values = map.valueList();
        assertEquals(Integer.valueOf(1), values.set(0, 9));
        assertEquals(Integer.valueOf(9), map.get("a"));
        assertEquals(Integer.valueOf(2), values.remove(1));
        assertEquals(1, map.size());
    }

    @Test
    public void testKeySetAndValuesViews() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        assertEquals(java.util.Arrays.asList("a", "b"), new ArrayList<String>(map.keySet()));
        assertTrue(map.keySet().contains("b"));
        assertEquals(java.util.Arrays.asList(1, 2), new ArrayList<Integer>(map.values()));
        assertTrue(map.values().contains(2));
    }

    @Test
    public void testEntrySetEntryUpdatesValueAndRemovesEntry() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<String, Integer> entry = iterator.next();
        assertEquals("a", entry.getKey());
        assertEquals(Integer.valueOf(1), entry.setValue(7));
        assertEquals(Integer.valueOf(7), map.get("a"));
        assertTrue(map.entrySet().remove(new java.util.AbstractMap.SimpleEntry<String, Integer>("b", 2)));
        assertEquals(1, map.size());
    }

    @Test
    public void testMapIteratorForwardBackwardAndReset() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        OrderedMapIterator<String, Integer> iterator = map.mapIterator();
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertEquals("a", iterator.getKey());
        assertEquals(Integer.valueOf(1), iterator.getValue());
        assertEquals("a", iterator.previous());
        assertEquals("a", iterator.next());
    }

    @Test
    public void testMapIteratorSetValueAndRemove() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        OrderedMapIterator<String, Integer> iterator = map.mapIterator();
        assertEquals("a", iterator.next());
        assertEquals(Integer.valueOf(1), iterator.setValue(8));
        assertEquals(Integer.valueOf(8), map.get("a"));
        iterator.remove();
        assertFalse(map.containsKey("a"));
        assertEquals(1, map.size());
    }

    @Test
    public void testMapIteratorValueBeforeReadThrows() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        OrderedMapIterator<String, Integer> iterator = map.mapIterator();
        try {
            iterator.getValue();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertEquals("a", iterator.next());
    }

    @Test
    public void testClearAndEmptyString() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertEquals("{}", map.toString());
    }

    @Test
    public void testToStringInsertionOrder() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("b", 2);
        map.put("a", 1);
        assertEquals("{b=2, a=1}", map.toString());
    }

    @Test
    public void testSetValueAndContainment() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        assertEquals(Integer.valueOf(1), map.setValue(0, 5));
        assertEquals(Integer.valueOf(5), map.getValue(0));
        assertTrue(map.containsValue(5));
        assertTrue(map.containsKey("a"));
    }

    @Test
    public void testFactoryWrapsSuppliedMap() throws Exception {
        Map<String, Integer> backing = new HashMap<String, Integer>();
        backing.put("q", 3);
        ListOrderedMap<String, Integer> map = ListOrderedMap.listOrderedMap(backing);
        assertEquals(1, map.size());
        assertEquals("q", map.get(0));
        map.put("r", 4);
        assertTrue(backing.containsKey("r"));
    }

    @Test
    public void testKeyListIsUnmodifiable() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        try {
            map.keyList().add("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals(1, map.size());
    }

    @Test
    public void testEntrySetContainsAllPresentEntries() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        List<Map.Entry<String, Integer>> entries =
                new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        assertTrue(map.entrySet().containsAll(entries));
        assertEquals(2, entries.size());
    }

    @Test
    public void testEntrySetContainsAllEmptyCollection() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        assertTrue(map.entrySet().containsAll(new ArrayList<Map.Entry<String, Integer>>()));
        assertEquals(1, map.size());
    }

    @Test
    public void testEntrySetContainsAllRejectsWrongValue() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        List<Map.Entry<String, Integer>> entries =
                new ArrayList<Map.Entry<String, Integer>>();
        entries.add(new java.util.AbstractMap.SimpleEntry<String, Integer>("a", 2));
        assertFalse(map.entrySet().containsAll(entries));
    }

    @Test
    public void testMapEqualsSameMappingsRegardlessOfOrder() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        Map<String, Integer> other = new HashMap<String, Integer>();
        other.put("b", 2);
        other.put("a", 1);
        assertTrue(map.equals(other));
        assertTrue(map.equals(map));
    }

    @Test
    public void testMapEqualsRejectsDifferentMapping() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        Map<String, Integer> other = new HashMap<String, Integer>();
        other.put("a", 2);
        assertFalse(map.equals(other));
    }

    @Test
    public void testMapHashCodeMatchesEntryHashCodes() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        int expected = ("a".hashCode() ^ Integer.valueOf(1).hashCode())
                + ("b".hashCode() ^ Integer.valueOf(2).hashCode());
        assertEquals(expected, map.hashCode());
        assertEquals(expected, map.entrySet().hashCode());
    }

    @Test
    public void testMapIteratorHasPreviousAtStartAndAfterNext() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        OrderedMapIterator<String, Integer> iterator = map.mapIterator();
        assertFalse(iterator.hasPrevious());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasPrevious());
        assertEquals("a", iterator.previous());
        assertFalse(iterator.hasPrevious());
    }

    @Test
    public void testMapIteratorHasPreviousAtEnd() throws Exception {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        OrderedMapIterator<String, Integer> iterator = map.mapIterator();
        iterator.next();
        iterator.next();
        assertTrue(iterator.hasPrevious());
        assertEquals("b", iterator.previous());
    }
}
```