package org.apache.commons.collections4.map;

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
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.LazyIteratorChain;
import org.apache.commons.collections4.iterators.TransformIterator;

public class MultiValueMapTest {
    @Test
    public void testPutAddsMultipleValues() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertEquals("one", map.put("k", "one"));
        assertEquals("two", map.put("k", "two"));
        assertEquals(2, map.size("k"));
        assertEquals(2, map.totalSize());
    }

    @Test
    public void testPutAllCollectionAddsOnlyNonemptyValues() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertFalse(map.putAll("k", null));
        assertFalse(map.putAll("k", new ArrayList<String>()));
        ArrayList<String> values = new ArrayList<String>();
        values.add("a");
        values.add("b");
        assertTrue(map.putAll("k", values));
        assertEquals(2, map.size("k"));
        assertFalse(map.putAll("k", values));
    }

    @Test
    public void testPutAllOrdinaryMap() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        Map<String, String> source = new HashMap<String, String>();
        source.put("a", "x");
        source.put("b", "y");
        map.putAll(source);
        assertEquals(2, map.totalSize());
        assertTrue(map.containsValue("a", "x"));
        assertTrue(map.containsValue("b", "y"));
    }

    @Test
    public void testPutAllMultiMapCopiesEachValue() throws Exception {
        MultiValueMap<String, String> source = new MultiValueMap<String, String>();
        source.put("k", "a");
        source.put("k", "b");
        MultiValueMap<String, String> target = new MultiValueMap<String, String>();
        target.putAll(source);
        assertEquals(2, target.size("k"));
        assertTrue(target.containsValue("k", "a"));
        assertTrue(target.containsValue("k", "b"));
    }

    @Test
    public void testRemoveMappingMissingKeyAndValue() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertFalse(map.removeMapping("absent", "x"));
        map.put("k", "x");
        assertFalse(map.removeMapping("k", "y"));
        assertEquals(1, map.size("k"));
    }

    @Test
    public void testRemoveMappingPreservesOtherValuesThenRemovesLastKey() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "a");
        map.put("k", "b");
        assertTrue(map.removeMapping("k", "a"));
        assertEquals(1, map.size("k"));
        assertTrue(map.removeMapping("k", "b"));
        assertNull(map.getCollection("k"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testContainsValueSearchesAllKeys() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("a", "x");
        map.put("b", "y");
        assertTrue(map.containsValue("y"));
        assertFalse(map.containsValue("z"));
        assertTrue(map.containsValue("a", "x"));
        assertFalse(map.containsValue("missing", "x"));
    }

    @Test
    public void testClearRemovesEntries() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "a");
        map.put("k", "b");
        map.clear();
        assertEquals(0, map.totalSize());
        assertNull(map.getCollection("k"));
    }

    @Test
    public void testGetCollectionAndSizeForExistingAndMissingKeys() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "value");
        assertEquals(1, map.getCollection("k").size());
        assertEquals("value", map.getCollection("k").iterator().next());
        assertEquals(0, map.size("missing"));
    }

    @Test
    public void testPerKeyIteratorMissingAndPresent() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        Iterator<String> empty = map.iterator("missing");
        assertFalse(empty.hasNext());
        map.put("k", "a");
        map.put("k", "b");
        Iterator<String> it = map.iterator("k");
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testPerKeyIteratorRemoveDeletesEmptyKey() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "only");
        Iterator<String> it = map.iterator("k");
        assertEquals("only", it.next());
        it.remove();
        assertNull(map.getCollection("k"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testFlattenedValuesView() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("a", "x");
        map.put("a", "y");
        map.put("b", "z");
        Collection<Object> values = map.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("x"));
        assertTrue(values.contains("y"));
        assertTrue(values.contains("z"));
        values.clear();
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testFlattenedEntryIteratorAndUnsupportedSetValue() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "value");
        Iterator<Map.Entry<String, String>> it = map.iterator();
        Map.Entry<String, String> entry = it.next();
        assertEquals("k", entry.getKey());
        assertEquals("value", entry.getValue());
        try {
            entry.setValue("other");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertFalse(it.hasNext());
    }

    @Test
    public void testEntrySetContainsCollectionForKey() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "a");
        map.put("k", "b");
        assertEquals(1, map.entrySet().size());
        assertEquals(2, ((Collection<?>) map.entrySet().iterator().next().getValue()).size());
    }

    @Test
    public void testPutWithNullValueIsStillStored() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertNull(map.put("k", null));
        assertEquals(1, map.size("k"));
        assertTrue(map.getCollection("k").contains(null));
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testMultiValueMapFactoryWithSuppliedMap() throws Exception {
        Map<String, Collection<String>> backing = new HashMap<String, Collection<String>>();
        MultiValueMap<String, String> map = MultiValueMap.multiValueMap(backing);
        map.put("k", "v");
        assertEquals(1, map.size("k"));
        assertTrue(backing.containsKey("k"));
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testFlattenedIteratorRemoveRemovesLastMapping() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "v");
        Iterator<Map.Entry<String, String>> it = map.iterator();
        assertEquals("v", it.next().getValue());
        it.remove();
        assertNull(map.getCollection("k"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testPutAllExistingKeyAddsValues() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "a");
        ArrayList<String> values = new ArrayList<String>();
        values.add("b");
        values.add("c");
        assertTrue(map.putAll("k", values));
        assertEquals(3, map.size("k"));
        assertEquals(3, map.totalSize());
    }

    @Test
    public void testValuesReflectLaterAdditions() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        Collection<Object> values = map.values();
        assertEquals(0, values.size());
        map.put("k", "later");
        assertEquals(1, values.size());
        assertTrue(values.contains("later"));
    }

    @Test
    public void testTotalSizeCountsValuesAcrossKeys() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("a", "1");
        map.put("a", "2");
        map.put("b", "3");
        assertEquals(3, map.totalSize());
    }
}
