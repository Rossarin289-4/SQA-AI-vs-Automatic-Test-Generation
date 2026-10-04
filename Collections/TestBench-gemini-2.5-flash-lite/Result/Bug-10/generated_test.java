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

    // Helper to create a new MultiValueMap with default settings
    private MultiValueMap createMap() {
        return new MultiValueMap();
    }

    // Helper to create a new MultiValueMap with a specific collection type
    private MultiValueMap createMap(Class<?> collectionClass) {
        return MultiValueMap.decorate(new HashMap(), collectionClass);
    }

    @Test
    public void testDecorateWithMapAndCollectionClass() {
        Map<String, Collection<Integer>> map = new HashMap<>(); // Ensure value is a Collection
        Collection<Integer> values = new ArrayList<>();
        values.add(1);
        map.put("a", values);
        MultiValueMap multiMap = MultiValueMap.decorate(map, ArrayList.class);
        assertNotNull(multiMap);
        assertEquals(1, multiMap.size());
        assertTrue(multiMap.getCollection("a") instanceof ArrayList);
    }

    @Test
    public void testDecorateWithMapAndFactory() {
        Map<String, Integer> map = new HashMap<>();
        Factory factory = new Factory() {
            @Override
            public Object create() {
                return new ArrayList<>();
            }
        };
        MultiValueMap multiMap = MultiValueMap.decorate(map, factory);
        assertNotNull(multiMap);
        assertEquals(0, multiMap.size());
    }

    @Test
    public void testDefaultConstructor() {
        MultiValueMap map = createMap();
        assertNotNull(map);
        assertTrue(map.getMap() instanceof HashMap);
        Collection<?> values = map.values();
        assertNotNull(values);
        assertTrue(values instanceof AbstractCollection);
    }

    @Test
    public void testPutAndGetSingleValue() {
        MultiValueMap map = createMap();
        Object value = map.put("key1", "value1");
        assertEquals("value1", value);
        Collection<?> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains("value1"));
    }

    @Test
    public void testPutAndGetMultipleValuesForKey() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        Collection<?> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(2, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
    }

    @Test
    public void testPutAndGetDifferentKeys() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, map.totalSize());
        Collection<?> values1 = map.getCollection("key1");
        assertNotNull(values1);
        assertEquals(1, values1.size());
        assertTrue(values1.contains("value1"));
        Collection<?> values2 = map.getCollection("key2");
        assertNotNull(values2);
        assertEquals(1, values2.size());
        assertTrue(values2.contains("value2"));
    }

    @Test
    public void testPutAllMap() {
        MultiValueMap map = createMap();
        Map<String, String> toPut = new HashMap<>();
        toPut.put("key1", "value1");
        toPut.put("key2", "value2");
        map.putAll(toPut);
        assertEquals(2, map.totalSize());
        assertTrue(map.getCollection("key1").contains("value1"));
        assertTrue(map.getCollection("key2").contains("value2"));
    }

    @Test
    public void testPutAllMultiMap() {
        MultiValueMap map = createMap();
        MultiValueMap toPut = createMap();
        toPut.put("key1", "value1a");
        toPut.put("key1", "value1b");
        toPut.put("key2", "value2");
        map.putAll(toPut);
        assertEquals(3, map.totalSize());
        Collection<?> values1 = map.getCollection("key1");
        assertEquals(2, values1.size());
        assertTrue(values1.contains("value1a"));
        assertTrue(values1.contains("value1b"));
        assertTrue(map.getCollection("key2").contains("value2"));
    }

    @Test
    public void testRemoveMappingExistingValue() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        Object removed = map.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        Collection<?> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains("value2"));
    }

    @Test
    public void testRemoveMappingNonExistingValue() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        Object removed = map.removeMapping("key1", "value2");
        assertNull(removed);
        Collection<?> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains("value1"));
    }

    @Test
    public void testRemoveMappingLastValue() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        Object removed = map.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        assertNull(map.getCollection("key1"));
        assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testRemoveMappingFromEmptyCollection() {
        MultiValueMap map = createMap();
        Object removed = map.removeMapping("key1", "value1");
        assertNull(removed);
        assertNull(map.getCollection("key1"));
    }

    @Test
    public void testClear() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testContainsValueSpecific() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertTrue(map.containsValue("value1"));
        assertTrue(map.containsValue("value2"));
        assertFalse(map.containsValue("value3"));
    }

    @Test
    public void testContainsValueForKey() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        assertTrue(map.containsValue("key1", "value1"));
        assertTrue(map.containsValue("key1", "value2"));
        assertFalse(map.containsValue("key1", "value3"));
        assertFalse(map.containsValue("key2", "value1"));
    }

    @Test
    public void testContainsValueForKeyWhenKeyNotPresent() {
        MultiValueMap map = createMap();
        assertFalse(map.containsValue("key1", "value1"));
    }

    @Test
    public void testGetCollectionWhenKeyPresent() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        Collection<?> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(2, values.size());
    }

    @Test
    public void testGetCollectionWhenKeyNotPresent() {
        MultiValueMap map = createMap();
        Collection<?> values = map.getCollection("key1");
        assertNull(values);
    }

    @Test
    public void testSizeOfKeyPresent() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        assertEquals(2, map.size("key1"));
    }

    @Test
    public void testSizeOfKeyNotPresent() {
        MultiValueMap map = createMap();
        assertEquals(0, map.size("key1"));
    }

    @Test
    public void testIteratorForValidKey() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        Iterator<?> it = map.iterator("key1");
        assertNotNull(it);
        assertTrue(it.hasNext());
        Object val1 = it.next();
        assertTrue(val1.equals("value1") || val1.equals("value2"));
        assertTrue(it.hasNext());
        Object val2 = it.next();
        assertTrue(val2.equals("value1") || val2.equals("value2"));
        assertFalse(val1.equals(val2));
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorForInvalidKey() {
        MultiValueMap map = createMap();
        Iterator<?> it = map.iterator("key1");
        assertNotNull(it);
        assertFalse(it.hasNext());
        // The iterator returned for a non-existent key is EmptyIterator.INSTANCE
        assertTrue(it instanceof EmptyIterator);
    }

    @Test
    public void testIteratorRemove() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        Iterator<?> it = map.iterator("key1");
        it.next(); // "value1"
        it.remove();
        assertEquals(1, map.size("key1"));
        assertTrue(map.getCollection("key1").contains("value2"));
    }

    @Test
    public void testIteratorRemoveLastElement() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        Iterator<?> it = map.iterator("key1");
        it.next(); // "value1"
        it.remove();
        assertEquals(0, map.size("key1"));
        assertNull(map.getCollection("key1"));
        assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testTotalSizeEmptyMap() {
        MultiValueMap map = createMap();
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testTotalSizeWithMultipleKeysAndValues() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        assertEquals(3, map.totalSize());
    }

    @Test
    public void testValuesView() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        Collection<?> values = map.values();
        assertNotNull(values);
        assertEquals(3, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
        assertTrue(values.contains("value3"));
    }

    @Test
    public void testValuesViewClear() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Collection<?> values = map.values();
        values.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testValuesViewIteratorRemove() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        Collection<?> values = map.values();
        Iterator<?> it = values.iterator();
        it.next(); // "value1"
        it.remove();
        assertEquals(2, map.totalSize());
        assertTrue(map.getCollection("key1").contains("value2"));
        assertTrue(map.getCollection("key2").contains("value3"));
    }

    @Test
    public void testPutWithNullValue() {
        MultiValueMap map = createMap();
        Object result = map.put("key1", null);
        assertNull(result);
        Collection<?> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains(null));
    }

    @Test
    public void testPutAllWithNullValueInCollection() {
        MultiValueMap map = createMap();
        Collection<Object> values = new ArrayList<>();
        values.add("value1");
        values.add(null);
        boolean changed = map.putAll("key1", values);
        assertTrue(changed);
        Collection<?> resultValues = map.getCollection("key1");
        assertNotNull(resultValues);
        assertEquals(2, resultValues.size());
        assertTrue(resultValues.contains("value1"));
        assertTrue(resultValues.contains(null));
    }

    @Test
    public void testCreateCollectionWithInitialSize() {
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), ArrayList.class);
        map.put("key", "value");
        Collection<?> coll = map.getCollection("key");
        assertTrue(coll instanceof ArrayList);
    }

    @Test
    public void testPutNonStandardCollection() {
        MultiValueMap map = createMap(java.util.LinkedList.class);
        map.put("key", "value1");
        map.put("key", "value2");
        Collection<?> values = map.getCollection("key");
        assertNotNull(values);
        assertEquals(2, values.size());
        assertTrue(values instanceof java.util.LinkedList);
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
    }

    @Test
    public void testPutAllWithEmptyCollection() {
        MultiValueMap map = createMap();
        Collection<String> emptyCollection = new ArrayList<>();
        boolean changed = map.putAll("key1", emptyCollection);
        assertFalse(changed);
        assertNull(map.getCollection("key1"));
    }

    @Test
    public void testPutAllWithNullCollection() {
        MultiValueMap map = createMap();
        boolean changed = map.putAll("key1", null);
        assertFalse(changed);
        assertNull(map.getCollection("key1"));
    }

    @Test
    public void testRemoveMappingOnKeyWithSingleValue() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        Object removed = map.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        assertNull(map.getCollection("key1"));
        assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testRemoveMappingOnKeyWithMultipleValues() {
        MultiValueMap map = createMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        Object removed = map.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        Collection<?> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains("value2"));
    }

    @Test
    public void testRemoveMappingNonExistentKey() {
        MultiValueMap map = createMap();
        Object removed = map.removeMapping("nonexistent_key", "value1");
        assertNull(removed);
        assertNull(map.getCollection("nonexistent_key"));
    }

    @Test
    public void testIteratorRemoveOnEmptyMap() {
        MultiValueMap map = createMap();
        Iterator<?> it = map.iterator("key1");
        assertFalse(it.hasNext());
        // The remove method on EmptyIterator should throw UnsupportedOperationException
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }
}
