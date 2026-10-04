```java
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

    // Dummy inner class to satisfy compiler for ReflectionFactory usage in test constructor
    private static class ReflectionFactory<T extends Collection<?>> implements Factory<T>, Serializable {
        private static final long serialVersionUID = 1L;
        private final Class<T> clazz;

        public ReflectionFactory(final Class<T> clazz) {
            this.clazz = clazz;
        }

        @Override
        public T create() {
            try {
                return clazz.newInstance();
            } catch (final Exception ex) {
                throw new FunctorException("Cannot instantiate class: " + clazz, ex);
            }
        }
    }

    @Test
    public void testConstructorDefault() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        assertNotNull(map);
        assertEquals(0, map.size());
        assertEquals(0, map.totalSize());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testConstructorWithMapAndFactory() throws Exception {
        Map<String, Collection<Integer>> underlyingMap = new HashMap<>();
        // The type parameter for ReflectionFactory needs to be explicitly Collection<Integer>
        Factory<Collection<Integer>> factory = new ReflectionFactory<Collection<Integer>>(ArrayList.class);
        MultiValueMap<String, Integer> map = new MultiValueMap<>(underlyingMap, factory);
        assertNotNull(map);
        assertEquals(0, map.size());
        assertEquals(0, map.totalSize());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testMultiValueMapStaticFactory() throws Exception {
        Map<String, Collection<Integer>> underlyingMap = new HashMap<>();
        // The type for the second argument of multiValueMap needs to be a subtype of Collection<Integer>
        // and be compatible with the map's value type. ArrayList.class is correct.
        MultiValueMap<String, Integer> map = MultiValueMap.<String, Integer, ArrayList<Integer>>multiValueMap(underlyingMap, ArrayList.class);
        assertNotNull(map);
        assertEquals(0, map.size());
        assertEquals(0, map.totalSize());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testPutAndGetSingleValue() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        Collection<Integer> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains(1));
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testPutAndGetMultipleValuesSameKey() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key1", 2);
        Collection<Integer> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(2, values.size());
        assertTrue(values.contains(1));
        assertTrue(values.contains(2));
        assertEquals(2, map.totalSize());
    }

    @Test
    public void testPutAndGetMultipleKeys() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        Collection<Integer> values1 = map.getCollection("key1");
        assertNotNull(values1);
        assertEquals(1, values1.size());
        assertTrue(values1.contains(1));

        Collection<Integer> values2 = map.getCollection("key2");
        assertNotNull(values2);
        assertEquals(1, values2.size());
        assertTrue(values2.contains(2));
        assertEquals(2, map.totalSize());
    }

    @Test
    public void testPutAllFromMap() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("key1", 1);
        sourceMap.put("key2", 2);
        map.putAll(sourceMap);

        Collection<Integer> values1 = map.getCollection("key1");
        assertNotNull(values1);
        assertEquals(1, values1.size());
        assertTrue(values1.contains(1));

        Collection<Integer> values2 = map.getCollection("key2");
        assertNotNull(values2);
        assertEquals(1, values2.size());
        assertTrue(values2.contains(2));
        assertEquals(2, map.totalSize());
    }

    @Test
    public void testPutAllFromMultiMap() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        MultiValueMap<String, Integer> sourceMap = new MultiValueMap<>();
        sourceMap.put("key1", 1);
        sourceMap.put("key1", 2);
        sourceMap.put("key2", 3);
        map.putAll(sourceMap);

        Collection<Integer> values1 = map.getCollection("key1");
        assertNotNull(values1);
        assertEquals(2, values1.size());
        assertTrue(values1.contains(1));
        assertTrue(values1.contains(2));

        Collection<Integer> values2 = map.getCollection("key2");
        assertNotNull(values2);
        assertEquals(1, values2.size());
        assertTrue(values2.contains(3));
        assertEquals(3, map.totalSize());
    }

    @Test
    public void testRemoveMappingSingleValue() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        boolean removed = map.removeMapping("key1", 1);
        assertTrue(removed);
        assertNull(map.getCollection("key1"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testRemoveMappingMultipleValuesSameKey() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key1", 2);
        boolean removed = map.removeMapping("key1", 1);
        assertTrue(removed);
        Collection<Integer> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains(2));
        assertEquals(1, map.totalSize());

        removed = map.removeMapping("key1", 2);
        assertTrue(removed);
        assertNull(map.getCollection("key1"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testRemoveMappingNonExistentValue() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        boolean removed = map.removeMapping("key1", 2);
        assertFalse(removed);
        Collection<Integer> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains(1));
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testRemoveMappingNonExistentKey() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        boolean removed = map.removeMapping("key1", 1);
        assertFalse(removed);
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testClear() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key1", 3);
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
        assertNull(map.getCollection("key1"));
        assertNull(map.getCollection("key2"));
    }

    @Test
    public void testContainsKey() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        assertTrue(map.containsKey("key1"));
        assertFalse(map.containsKey("key2"));
    }

    @Test
    public void testContainsValue() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        assertTrue(map.containsValue(1));
        assertTrue(map.containsValue(2));
        assertFalse(map.containsValue(3));
    }

    @Test
    public void testContainsValueForKey() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key1", 2);
        assertTrue(map.containsValue("key1", 1));
        assertTrue(map.containsValue("key1", 2));
        assertFalse(map.containsValue("key1", 3));
        assertFalse(map.containsValue("key2", 1));
    }

    @Test
    public void testSizeForKey() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key1", 2);
        assertEquals(2, map.size("key1"));
        assertEquals(0, map.size("key2"));
    }

    @Test
    public void testValuesView() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key1", 3);
        Collection<Object> values = map.values();
        assertNotNull(values);
        assertEquals(3, values.size());
        assertTrue(values.contains(1));
        assertTrue(values.contains(2));
        assertTrue(values.contains(3));
    }

    @Test
    public void testEntrySet() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key1", 3);
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        assertNotNull(entries);
        assertEquals(2, entries.size()); // Two distinct keys
        boolean foundKey1 = false;
        boolean foundKey2 = false;
        for (Map.Entry<String, Object> entry : entries) {
            if (entry.getKey().equals("key1")) {
                foundKey1 = true;
                Collection<?> values = (Collection<?>) entry.getValue();
                assertEquals(2, values.size());
                assertTrue(values.contains(1));
                assertTrue(values.contains(3));
            } else if (entry.getKey().equals("key2")) {
                foundKey2 = true;
                Collection<?> values = (Collection<?>) entry.getValue();
                assertEquals(1, values.size());
                assertTrue(values.contains(2));
            }
        }
        assertTrue(foundKey1);
        assertTrue(foundKey2);
    }

    @Test
    public void testIteratorForKeyEmpty() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        Iterator<Integer> iterator = map.iterator("key1");
        assertNotNull(iterator);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorForKeySingleValue() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        Iterator<Integer> iterator = map.iterator("key1");
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().intValue());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorForKeyMultipleValues() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key1", 2);
        map.put("key1", 3);
        Iterator<Integer> iterator = map.iterator("key1");
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        Collection<Integer> foundValues = new ArrayList<>();
        while (iterator.hasNext()) {
            foundValues.add(iterator.next());
        }
        assertEquals(3, foundValues.size());
        assertTrue(foundValues.contains(1));
        assertTrue(foundValues.contains(2));
        assertTrue(foundValues.contains(3));
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorRemoveSingleValue() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        Iterator<Integer> iterator = map.iterator("key1");
        iterator.next();
        iterator.remove();
        assertNull(map.getCollection("key1"));
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testIteratorRemoveMultipleValues() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key1", 2);
        Iterator<Integer> iterator = map.iterator("key1");
        iterator.next(); // consume 1
        iterator.remove();
        Collection<Integer> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains(2));
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testFullIterator() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key1", 3);
        Iterator<Map.Entry<String, Integer>> iterator = map.iterator();
        assertNotNull(iterator);
        int count = 0;
        Collection<Integer> collectedValues = new ArrayList<>();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            collectedValues.add(entry.getValue());
            count++;
        }
        assertEquals(3, count);
        assertTrue(collectedValues.contains(1));
        assertTrue(collectedValues.contains(2));
        assertTrue(collectedValues.contains(3));
        assertEquals(3, map.totalSize());
    }

    @Test
    public void testTotalSize() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        assertEquals(0, map.totalSize());
        map.put("key1", 1);
        assertEquals(1, map.totalSize());
        map.put("key2", 2);
        assertEquals(2, map.totalSize());
        map.put("key1", 3);
        assertEquals(3, map.totalSize());
        map.removeMapping("key1", 1);
        assertEquals(2, map.totalSize());
        map.remove("key2");
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testCreateCollectionWithInitialSize() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        // This test indirectly checks createCollection by observing behavior.
        // A direct test of createCollection is hard without mocking or knowing internal details.
        map.put("key1", 1);
        Collection<Integer> coll = map.getCollection("key1");
        assertNotNull(coll);
        assertEquals(1, coll.size());
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testValuesViewClear() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        Collection<Object> values = map.values();
        values.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testValuesViewIterator() throws Exception {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key1", 3);
        Collection<Object> values = map.values();
        Iterator<Object> iterator = values.iterator();
        assertNotNull(iterator);
        int count = 0;
        Collection<Object> collectedValues = new ArrayList<>();
        while (iterator.hasNext()) {
            collectedValues.add(iterator.next());
            count++;
        }
        assertEquals(3, count);
        assertTrue(collectedValues.contains(1));
        assertTrue(collectedValues.contains(2));
        assertTrue(collectedValues.contains(3));
    }

    @Test
    public void testPutNullValue() throws Exception {
        MultiValueMap<String, Object> map = new MultiValueMap<>();
        map.put("key1", null);
        Collection<Object> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains(null));
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testPutNullKey() throws Exception {
        MultiValueMap<Object, Integer> map = new MultiValueMap<>();
        map.put(null, 1);
        Collection<Integer> values = map.getCollection(null);
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains(1));
        assertEquals(1, map.totalSize());
    }

    @Test
    public void testRemoveMappingWithNullValue() throws Exception {
        MultiValueMap<String, Object> map = new MultiValueMap<>();
        map.put("key1", null);
        map.put("key1", 1);
        boolean removed = map.removeMapping("key1", null);
        assertTrue(removed);
        Collection<Object> values = map.getCollection("key1");
        assertNotNull(values);
        assertEquals(1, values.size());
        assertTrue(values.contains(1));
        assertEquals(1, map.totalSize());
    }
}
```