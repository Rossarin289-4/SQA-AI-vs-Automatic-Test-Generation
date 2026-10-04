package org.apache.commons.collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.apache.commons.collections.iterators.IteratorChain;

public class MultiValueMapTest {
    @Test
    public void testPutAccumulatesAndCountsValues() throws Exception {
        MultiValueMap map = new MultiValueMap();
        assertEquals("a", map.put("k", "a"));
        assertEquals("b", map.put("k", "b"));
        assertEquals(2, map.size("k"));
        assertEquals(2, map.totalSize());
    }

    @Test
    public void testRemoveMappingKeepsOtherValues() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "a");
        map.put("k", "b");
        assertEquals("a", map.removeMapping("k", "a"));
        assertEquals(1, map.size("k"));
        assertTrue(map.containsValue("k", "b"));
    }

    @Test
    public void testRemoveMappingLastValueRemovesKey() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "a");
        assertEquals("a", map.removeMapping("k", "a"));
        assertNull(map.getCollection("k"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testRemoveMappingAbsentKeyOrValue() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "a");
        assertNull(map.removeMapping("missing", "a"));
        assertNull(map.removeMapping("k", "missing"));
        assertEquals(1, map.size("k"));
    }

    @Test
    public void testContainsValueSearchesAllKeys() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("first", "a");
        map.put("second", "b");
        assertTrue(map.containsValue("b"));
        assertFalse(map.containsValue("missing"));
    }

    @Test
    public void testPutAllValuesAtKey() throws Exception {
        MultiValueMap map = new MultiValueMap();
        Collection values = new ArrayList();
        values.add("a");
        values.add("b");
        assertTrue(map.putAll("k", values));
        assertEquals(2, map.size("k"));
        assertFalse(map.putAll("k", new ArrayList()));
        assertFalse(map.putAll("k", null));
    }

    @Test
    public void testPutAllAppendsToExistingKey() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "a");
        Collection values = new ArrayList();
        values.add("b");
        values.add("c");
        assertTrue(map.putAll("k", values));
        assertEquals(3, map.size("k"));
        assertEquals(3, map.totalSize());
    }

    @Test
    public void testPutAllFromOrdinaryMap() throws Exception {
        MultiValueMap map = new MultiValueMap();
        Map source = new HashMap();
        source.put("k", "a");
        source.put("other", "b");
        map.putAll(source);
        assertEquals(2, map.totalSize());
        assertTrue(map.containsValue("a"));
        assertTrue(map.containsValue("b"));
    }

    @Test
    public void testPutAllFromMultiMapCopiesEachValue() throws Exception {
        MultiValueMap source = new MultiValueMap();
        source.put("k", "a");
        source.put("k", "b");
        MultiValueMap target = new MultiValueMap();
        target.putAll((Map) source);
        assertEquals(2, target.size("k"));
        assertTrue(target.containsValue("k", "a"));
        assertTrue(target.containsValue("k", "b"));
    }

    @Test
    public void testValuesViewCombinesValuesAndReportsSize() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("first", "a");
        map.put("second", "b");
        Collection values = map.values();
        assertEquals(2, values.size());
        assertTrue(values.contains("a"));
        assertTrue(values.contains("b"));
    }

    @Test
    public void testValuesIteratorRemovesLastValueAndItsKey() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "a");
        Iterator it = map.iterator("k");
        assertEquals("a", it.next());
        it.remove();
        assertNull(map.getCollection("k"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testValuesViewClearClearsMap() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "a");
        map.values().clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testGetCollectionAndSizeForPresentAndAbsentKeys() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "a");
        assertEquals(1, map.getCollection("k").size());
        assertEquals(1, map.size("k"));
        assertNull(map.getCollection("missing"));
        assertEquals(0, map.size("missing"));
    }

    @Test
    public void testIteratorForAbsentKeyIsEmpty() throws Exception {
        MultiValueMap map = new MultiValueMap();
        Iterator it = map.iterator("missing");
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorVisitsValuesInKeyCollectionOrder() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "first");
        map.put("k", "last");
        Iterator it = map.iterator("k");
        assertTrue(it.hasNext());
        assertEquals("first", it.next());
        assertEquals("last", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testTotalSizeCountsAllCollections() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("a", "one");
        map.put("a", "two");
        map.put("b", "three");
        assertEquals(3, map.totalSize());
        map.removeMapping("a", "one");
        assertEquals(2, map.totalSize());
    }

    @Test
    public void testClearRemovesAllMappings() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("a", "one");
        map.put("b", "two");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
    }
}
