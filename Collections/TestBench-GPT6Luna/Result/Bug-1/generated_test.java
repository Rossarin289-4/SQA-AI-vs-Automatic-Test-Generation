package org.apache.commons.collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections.IterableMap;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.ResettableIterator;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.apache.commons.collections.iterators.EmptyMapIterator;

public class Flat3MapTest {
    @Test
    public void testEmptyMapState() throws Exception {
        Flat3Map map = new Flat3Map();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertNull(map.get("x"));
        assertFalse(map.containsKey("x"));
        assertFalse(map.containsValue("x"));
    }

    @Test
    public void testNullKeyAndValueInFlatMode() throws Exception {
        Flat3Map map = new Flat3Map();
        assertNull(map.put(null, null));
        assertEquals(1, map.size());
        assertTrue(map.containsKey(null));
        assertTrue(map.containsValue(null));
        assertNull(map.get(null));
    }

    @Test
    public void testPutReplacementAndAbsentRemoval() throws Exception {
        Flat3Map map = new Flat3Map();
        assertNull(map.put("k", "old"));
        assertEquals("old", map.put("k", "new"));
        assertEquals("new", map.get("k"));
        assertNull(map.remove("missing"));
        assertEquals(1, map.size());
    }

    @Test
    public void testRemoveFirstMiddleAndLastFlatEntries() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals(3, map.remove("a"));
        assertEquals(2, map.size());
        assertEquals(2, map.get("b"));
        assertEquals(3, map.get("c"));
        assertEquals(3, map.remove("c"));
        assertEquals(1, map.size());
        assertEquals(2, map.remove("b"));
        assertTrue(map.isEmpty());
    }

    @Test
    public void testRemoveNullKeyAndPreserveOtherEntries() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put(null, 2);
        map.put("c", 3);
        assertEquals(3, map.remove(null));
        assertFalse(map.containsKey(null));
        assertEquals(1, map.get("a"));
        assertEquals(3, map.get("c"));
        assertEquals(2, map.size());
    }

    @Test
    public void testFourthEntrySwitchesToDelegateBehavior() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertNull(map.put("d", 4));
        assertEquals(4, map.size());
        assertEquals(1, map.get("a"));
        assertEquals(4, map.get("d"));
        assertTrue(map.containsValue(3));
    }

    @Test
    public void testPutAllSmallAndLargeSources() throws Exception {
        Flat3Map small = new Flat3Map();
        java.util.HashMap source = new java.util.HashMap();
        source.put("a", 1);
        source.put("b", 2);
        small.putAll(source);
        assertEquals(2, small.size());
        assertEquals(1, small.get("a"));

        java.util.HashMap larger = new java.util.HashMap();
        larger.put("c", 3);
        larger.put("d", 4);
        larger.put("e", 5);
        larger.put("f", 6);
        small.putAll(larger);
        assertEquals(6, small.size());
        assertEquals(6, small.get("f"));
    }

    @Test
    public void testClearAfterDelegateModeAllowsReuse() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertNull(map.put("z", 9));
        assertEquals(1, map.size());
        assertEquals(9, map.get("z"));
    }

    @Test
    public void testMapIteratorReadsAndUpdatesCurrentEntry() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("key", "old");
        MapIterator it = map.mapIterator();
        assertTrue(it.hasNext());
        assertEquals("key", it.next());
        assertEquals("key", it.getKey());
        assertEquals("old", it.getValue());
        assertEquals("old", it.setValue("new"));
        assertEquals("new", map.get("key"));
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIteratorRemoveAndReset() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put("b", 2);
        MapIterator it = map.mapIterator();
        Object first = it.next();
        it.remove();
        assertEquals(1, map.size());
        assertFalse(map.containsKey(first));
        it = map.mapIterator();
        assertTrue(it.hasNext());
        Object remaining = it.next();
        assertTrue(map.containsKey(remaining));
        assertEquals(2, map.get(remaining));
    }

    @Test
    public void testEntrySetRemoveAndClearViews() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put("b", 2);
        Set entries = map.entrySet();
        assertTrue(entries.remove(new java.util.AbstractMap.SimpleEntry("a", 99)));
        assertFalse(map.containsKey("a"));
        assertEquals(1, entries.size());
        entries.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testKeySetAndValuesViewsMutateMap() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put("b", 2);
        Set keys = map.keySet();
        Collection values = map.values();
        assertTrue(keys.contains("a"));
        assertTrue(values.contains(2));
        assertTrue(keys.remove("a"));
        assertFalse(map.containsKey("a"));
        assertTrue(values.remove(2));
        assertEquals(0, map.size());
    }

    @Test
    public void testEqualsAndHashCodeWithNulls() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put(null, "v");
        map.put("n", null);
        java.util.HashMap other = new java.util.HashMap();
        other.put(null, "v");
        other.put("n", null);
        assertTrue(map.equals(other));
        assertEquals(other.hashCode(), map.hashCode());
        other.put("n", "different");
        assertFalse(map.equals(other));
    }

    @Test
    public void testToStringFlatAndEmptyForms() throws Exception {
        Flat3Map empty = new Flat3Map();
        assertEquals("{}", empty.toString());
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put("b", 2);
        assertEquals("{b=2,a=1}", map.toString());
    }

    @Test
    public void testCloneIsIndependentForFlatMap() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        Flat3Map copy = (Flat3Map) map.clone();
        assertTrue(copy.equals(map));
        copy.put("a", 2);
        assertEquals(1, map.get("a"));
        assertEquals(2, copy.get("a"));
    }

    @Test
    public void testCloneIsIndependentForDelegateMap() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        Flat3Map copy = (Flat3Map) map.clone();
        copy.put("a", 9);
        assertEquals(1, map.get("a"));
        assertEquals(9, copy.get("a"));
        assertEquals(4, copy.size());
    }

    @Test
    public void testEntryIteratorSetValueUpdatesMap() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("k", "before");
        Iterator iterator = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) iterator.next();
        assertEquals("k", entry.getKey());
        assertEquals("before", entry.getValue());
        assertEquals("before", entry.setValue("after"));
        assertEquals("after", map.get("k"));
    }

    @Test
    public void testKeyAndValueIteratorsReturnTheirContents() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("k", "v");
        Iterator keys = map.keySet().iterator();
        Iterator values = map.values().iterator();
        assertEquals("k", keys.next());
        assertEquals("v", values.next());
        assertFalse(keys.hasNext());
        assertFalse(values.hasNext());
    }
}
