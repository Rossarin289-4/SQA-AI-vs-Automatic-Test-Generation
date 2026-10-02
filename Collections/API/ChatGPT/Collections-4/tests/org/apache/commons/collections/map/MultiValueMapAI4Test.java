package org.apache.commons.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.Factory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class MultiValueMapAI4Test {

    @Test
    public void testPutStoresMultipleValuesAndCountsTotalValues() {
        MultiValueMap map = new MultiValueMap();

        assertEquals("one", map.put("key", "one"));
        assertEquals("two", map.put("key", "two"));

        assertEquals(1, map.size());
        assertEquals(2, map.size("key"));
        assertEquals(2, map.totalSize());
        assertEquals(Arrays.asList(new Object[] { "one", "two" }),
                new ArrayList(map.getCollection("key")));
    }

    @Test
    public void testDecorateUpdatesTheSuppliedBackingMap() {
        Map backing = new HashMap();
        MultiValueMap map = MultiValueMap.decorate(backing);

        map.put("color", "red");
        map.put("color", "blue");

        assertTrue(backing.containsKey("color"));
        assertSame(map.getCollection("color"), backing.get("color"));
        assertEquals(2, ((Collection) backing.get("color")).size());
    }

    @Test
    public void testRemoveMappingRemovesOnlyRequestedValueAndThenKey() {
        MultiValueMap map = new MultiValueMap();
        String stored = new String("value");
        String requested = new String("value");
        map.put("key", stored);
        map.put("key", "other");

        assertSame(requested, map.removeMapping("key", requested));
        assertEquals(1, map.size("key"));
        assertTrue(map.containsValue("key", "other"));
        assertNull(map.removeMapping("key", "missing"));
        assertEquals("other", map.removeMapping("key", "other"));
        assertFalse(map.containsKey("key"));
        assertNull(map.getCollection("key"));
    }

    @Test
    public void testContainsValueSupportsGlobalKeySpecificAndNullValues() {
        MultiValueMap map = new MultiValueMap();
        map.put("first", "shared");
        map.put("second", null);

        assertTrue(map.containsValue("shared"));
        assertTrue(map.containsValue(null));
        assertTrue(map.containsValue("first", "shared"));
        assertFalse(map.containsValue("second", "shared"));
        assertTrue(map.containsValue("second", null));
        assertFalse(map.containsValue("absent"));
    }

    @Test
    public void testPutAllCollectionHandlesEmptyAndAddsAllValues() {
        MultiValueMap map = new MultiValueMap();

        assertFalse(map.putAll("key", null));
        assertFalse(map.putAll("key", new ArrayList()));
        assertFalse(map.containsKey("key"));

        assertTrue(map.putAll("key", Arrays.asList(new Object[] { "a", "b", "c" })));
        assertEquals(3, map.size("key"));
        assertEquals(3, map.totalSize());
        assertEquals(Arrays.asList(new Object[] { "a", "b", "c" }),
                new ArrayList(map.getCollection("key")));
    }

    @Test
    public void testPutAllMapHandlesNormalAndMultiMapSources() {
        MultiValueMap target = new MultiValueMap();
        Map normal = new HashMap();
        normal.put("normal", "value");

        target.putAll(normal);
        assertEquals(1, target.size("normal"));
        assertTrue(target.containsValue("normal", "value"));

        MultiValueMap source = new MultiValueMap();
        source.put("letters", "a");
        source.put("letters", "b");
        target.put("letters", "existing");

        target.putAll(source);

        assertEquals(3, target.size("letters"));
        assertTrue(target.containsValue("letters", "existing"));
        assertTrue(target.containsValue("letters", "a"));
        assertTrue(target.containsValue("letters", "b"));
    }

    @Test
    public void testIteratorRemoveRemovesEmptyKeyFromMap() {
        MultiValueMap map = new MultiValueMap();
        map.put("key", "first");
        map.put("key", "second");

        Iterator iterator = map.iterator("key");
        assertTrue(iterator.hasNext());
        iterator.next();
        iterator.remove();

        assertEquals(1, map.size("key"));
        assertTrue(iterator.hasNext());
        iterator.next();
        iterator.remove();

        assertFalse(map.containsKey("key"));
        assertFalse(map.iterator("missing").hasNext());
    }

    @Test
    public void testValuesViewContainsAllValuesIsLiveAndCanClearMap() {
        MultiValueMap map = new MultiValueMap();
        map.put("one", "a");
        map.put("one", "b");
        map.put("two", "c");

        Collection values = map.values();

        assertSame(values, map.values());
        assertEquals(3, values.size());
        assertTrue(values.contains("a"));
        assertTrue(values.contains("b"));
        assertTrue(values.contains("c"));

        values.clear();

        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
        assertEquals(0, values.size());
    }

    @Test
    public void testDecorateWithHashSetPreventsDuplicateValues() {
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), HashSet.class);

        assertEquals("value", map.put("key", "value"));
        assertNull(map.put("key", "value"));

        assertEquals(1, map.size("key"));
        assertEquals(1, map.totalSize());
        assertTrue(map.getCollection("key") instanceof HashSet);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsNullCollectionFactory() {
        new MultiValueMap(new HashMap(), (Factory) null);
    }
}
