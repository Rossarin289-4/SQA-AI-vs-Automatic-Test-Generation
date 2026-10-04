package org.apache.commons.collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
    public void testPutAddsValuesAndReportsChanges() throws Exception {
        MultiValueMap map = new MultiValueMap();
        assertEquals("a", map.put("k", "a"));
        assertEquals("b", map.put("k", "b"));
        assertEquals(2, map.size("k"));
        assertEquals(2, map.totalSize());
    }

    @Test
    public void testPutNullValue() throws Exception {
        MultiValueMap map = new MultiValueMap();
        assertNull(map.put("k", null));
        assertTrue(map.containsKey("k"));
        assertEquals(1, map.size("k"));
        assertTrue(map.containsValue("k", null));
    }

    @Test
    public void testContainsValueAcrossKeysAndMissingValue() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("first", "one");
        map.put("second", "two");
        assertTrue(map.containsValue("two"));
        assertFalse(map.containsValue("absent"));
    }

    @Test
    public void testContainsValueForKey() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "present");
        assertTrue(map.containsValue("k", "present"));
        assertFalse(map.containsValue("other", "present"));
        assertFalse(map.containsValue("k", "absent"));
    }

    @Test
    public void testRemoveMappingMissingKeyAndValue() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "kept");
        assertNull(map.removeMapping("missing", "kept"));
        assertNull(map.removeMapping("k", "absent"));
        assertEquals(1, map.size("k"));
    }

    @Test
    public void testRemoveMappingKeepsOtherValuesThenRemovesEmptyKey() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "one");
        map.put("k", "two");
        assertEquals("one", map.removeMapping("k", "one"));
        assertEquals(1, map.size("k"));
        assertEquals("two", map.removeMapping("k", "two"));
        assertNull(map.getCollection("k"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testPutAllCollectionHandlesNullEmptyAndPopulatedInputs() throws Exception {
        MultiValueMap map = new MultiValueMap();
        assertFalse(map.putAll("k", null));
        assertFalse(map.putAll("k", new ArrayList()));
        Collection values = new ArrayList();
        values.add("a");
        values.add("b");
        assertTrue(map.putAll("k", values));
        assertEquals(2, map.size("k"));
        Collection duplicateValues = new ArrayList();
        duplicateValues.add("a");
        duplicateValues.add("b");
        assertTrue(map.putAll("k", duplicateValues));
        assertEquals(4, map.size("k"));
    }

    @Test
    public void testPutAllOrdinaryMapAddsEachEntry() throws Exception {
        MultiValueMap map = new MultiValueMap();
        Map source = new HashMap();
        source.put("a", "one");
        source.put("b", "two");
        map.putAll(source);
        assertEquals(2, map.totalSize());
        assertEquals("one", map.getCollection("a").iterator().next());
        assertEquals("two", map.getCollection("b").iterator().next());
    }

    @Test
    public void testPutAllMultiMapCopiesAllValues() throws Exception {
        MultiValueMap source = new MultiValueMap();
        source.put("k", "one");
        source.put("k", "two");
        MultiValueMap target = new MultiValueMap();
        target.putAll(source);
        assertEquals(2, target.size("k"));
        assertTrue(target.containsValue("k", "one"));
        assertTrue(target.containsValue("k", "two"));
    }

    @Test
    public void testValuesViewFlattensAndTracksMap() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "one");
        map.put("k", "two");
        map.put("other", "three");
        Collection view = map.values();
        assertEquals(3, view.size());
        assertTrue(view.contains("one"));
        map.put("k", "four");
        assertEquals(4, view.size());
    }

    @Test
    public void testValuesViewClearClearsMap() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "value");
        map.values().clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testGetCollectionAndSizeForPresentAndMissingKeys() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "value");
        assertEquals(1, map.getCollection("k").size());
        assertEquals(1, map.size("k"));
        assertNull(map.getCollection("missing"));
        assertEquals(0, map.size("missing"));
    }

    @Test
    public void testIteratorEmptyKey() throws Exception {
        MultiValueMap map = new MultiValueMap();
        Iterator it = map.iterator("missing");
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorVisitsValuesForKey() throws Exception {
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
    public void testIteratorRemoveDeletesLastValueMapping() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k", "only");
        Iterator it = map.iterator("k");
        assertEquals("only", it.next());
        it.remove();
        assertNull(map.getCollection("k"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testTotalSizeCountsValuesRatherThanKeys() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("a", "one");
        map.put("a", "two");
        map.put("b", "three");
        assertEquals(3, map.totalSize());
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
