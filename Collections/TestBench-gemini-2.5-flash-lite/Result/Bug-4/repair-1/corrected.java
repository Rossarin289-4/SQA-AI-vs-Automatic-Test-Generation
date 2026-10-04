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

    // Helper class to access private ReflectionFactory for testing purposes
    private static class TestReflectionFactory extends MultiValueMap.ReflectionFactory {
        public TestReflectionFactory(Class clazz) {
            super(clazz);
        }
        public Class getClazz() {
            return super.clazz;
        }
    }

    @Test
    public void testDecorateMap() throws Exception {
        Map<String, String> map = new HashMap<>();
        MultiValueMap multiMap = MultiValueMap.decorate(map);
        assertNotNull(multiMap);
        assertTrue(multiMap.getMap() == map);
    }

    @Test
    public void testDecorateMapClass() throws Exception {
        Map<String, String> map = new HashMap<>();
        MultiValueMap multiMap = MultiValueMap.decorate(map, ArrayList.class);
        assertNotNull(multiMap);
        assertTrue(multiMap.getMap() == map);
    }

    @Test
    public void testDecorateMapFactory() throws Exception {
        Map<String, String> map = new HashMap<>();
        // Use TestReflectionFactory to access internal fields if needed for assertion
        TestReflectionFactory factory = new TestReflectionFactory(ArrayList.class);
        MultiValueMap multiMap = MultiValueMap.decorate(map, factory);
        assertNotNull(multiMap);
        assertTrue(multiMap.getMap() == map);
    }

    @Test
    public void testMultiValueMapNoArgs() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        assertNotNull(multiMap);
        assertTrue(multiMap.getMap() instanceof HashMap);
        // Accessing collectionFactory directly is not possible due to private access.
        // We can infer it's using ArrayList by testing its behavior indirectly.
        multiMap.put("key", "value");
        assertTrue(multiMap.getCollection("key") instanceof ArrayList);
    }

    @Test
    public void testMultiValueMapWithMapAndFactory() throws Exception {
        Map<String, String> map = new HashMap<>();
        // Use TestReflectionFactory to allow checking the factory type
        TestReflectionFactory factory = new TestReflectionFactory(ArrayList.class);
        MultiValueMap multiMap = new MultiValueMap(map, factory);
        assertNotNull(multiMap);
        assertTrue(multiMap.getMap() == map);
        // Direct comparison of factory instances can be tricky if not the same implementation
        // We can assert the type of collection created by the factory.
        multiMap.put("key", "value");
        assertTrue(multiMap.getCollection("key") instanceof ArrayList);
    }

    @Test
    public void testMultiValueMapWithNullFactory() throws Exception {
        try {
            new MultiValueMap(new HashMap(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testClear() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");
        multiMap.clear();
        assertTrue(multiMap.isEmpty());
        assertEquals(0, multiMap.totalSize());
    }

    @Test
    public void testRemoveMapping() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");

        Object removed = multiMap.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        assertEquals(1, multiMap.size("key1"));
        assertTrue(multiMap.containsValue("key1", "value2"));

        removed = multiMap.removeMapping("key1", "value2");
        assertEquals("value2", removed);
        assertEquals(0, multiMap.size("key1"));
        assertNull(multiMap.getCollection("key1"));

        removed = multiMap.removeMapping("key2", "value3");
        assertEquals("value3", removed);
        assertEquals(0, multiMap.size("key2"));
        assertNull(multiMap.getCollection("key2"));

        removed = multiMap.removeMapping("nonexistent", "value");
        assertNull(removed);
    }

    @Test
    public void testRemoveMappingFromEmptyCollection() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.removeMapping("key1", "nonexistent");
        assertEquals(1, multiMap.size("key1"));
    }

    @Test
    public void testContainsValue() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");

        assertTrue(multiMap.containsValue("value1"));
        assertTrue(multiMap.containsValue("value2"));
        assertTrue(multiMap.containsValue("value3"));
        assertFalse(multiMap.containsValue("value4"));
    }

    @Test
    public void testPut() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        Object added = multiMap.put("key1", "value1");
        assertEquals("value1", added);
        assertEquals(1, multiMap.size("key1"));
        assertTrue(multiMap.containsValue("key1", "value1"));

        added = multiMap.put("key1", "value2");
        assertEquals("value2", added);
        assertEquals(2, multiMap.size("key1"));
        assertTrue(multiMap.containsValue("key1", "value2"));

        added = multiMap.put("key2", "value3");
        assertEquals("value3", added);
        assertEquals(1, multiMap.size("key2"));
        assertTrue(multiMap.containsValue("key2", "value3"));
    }

    @Test
    public void testPutWithEmptyCollectionFactory() throws Exception {
        // Factory that creates empty collections
        Factory emptyFactory = new Factory() {
            public Object create() {
                return new ArrayList<>();
            }
        };
        MultiValueMap multiMap = new MultiValueMap(new HashMap(), emptyFactory);
        Object added = multiMap.put("key1", "value1");
        assertEquals("value1", added);
        assertEquals(1, multiMap.size("key1"));
        assertTrue(multiMap.containsValue("key1", "value1"));
    }

    @Test
    public void testPutAllMap() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        Map<String, String> mapToPut = new HashMap<>();
        mapToPut.put("key1", "value1");
        mapToPut.put("key2", "value2");
        multiMap.putAll(mapToPut);

        assertEquals(1, multiMap.size("key1"));
        assertTrue(multiMap.containsValue("key1", "value1"));
        assertEquals(1, multiMap.size("key2"));
        assertTrue(multiMap.containsValue("key2", "value2"));
        assertEquals(2, multiMap.totalSize());
    }

    @Test
    public void testPutAllMultiMap() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1a");
        multiMap.put("key1", "value1b");
        multiMap.put("key2", "value2");

        MultiValueMap mapToPut = new MultiValueMap();
        mapToPut.put("key1", "value1c");
        mapToPut.put("key3", "value3");

        multiMap.putAll(mapToPut);

        assertEquals(3, multiMap.size("key1"));
        assertTrue(multiMap.containsValue("key1", "value1a"));
        assertTrue(multiMap.containsValue("key1", "value1b"));
        assertTrue(multiMap.containsValue("key1", "value1c"));
        assertEquals(1, multiMap.size("key2"));
        assertTrue(multiMap.containsValue("key2", "value2"));
        assertEquals(1, multiMap.size("key3"));
        assertTrue(multiMap.containsValue("key3", "value3"));
        assertEquals(5, multiMap.totalSize());
    }

    @Test
    public void testValues() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");

        Collection values = multiMap.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
        assertTrue(values.contains("value3"));

        // Test clearing through the values collection
        values.clear();
        assertTrue(multiMap.isEmpty());
    }

    @Test
    public void testGetCollection() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");

        Collection coll = multiMap.getCollection("key1");
        assertNotNull(coll);
        assertEquals(2, coll.size());
        assertTrue(coll.contains("value1"));
        assertTrue(coll.contains("value2"));

        assertNull(multiMap.getCollection("nonexistent"));
    }

    @Test
    public void testSize() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        assertEquals(0, multiMap.size("key1"));

        multiMap.put("key1", "value1");
        assertEquals(1, multiMap.size("key1"));

        multiMap.put("key1", "value2");
        assertEquals(2, multiMap.size("key1"));

        multiMap.removeMapping("key1", "value1");
        assertEquals(1, multiMap.size("key1"));

        multiMap.remove("key1");
        assertEquals(0, multiMap.size("key1"));
    }

    @Test
    public void testIteratorForKey() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");

        Iterator it = multiMap.iterator("key1");
        assertTrue(it.hasNext());
        Object next1 = it.next();
        assertTrue(next1.equals("value1") || next1.equals("value2"));
        assertTrue(it.hasNext());
        Object next2 = it.next();
        assertTrue(next2.equals("value1") || next2.equals("value2"));
        assertFalse(next1.equals(next2));
        assertFalse(it.hasNext());

        Iterator itEmpty = multiMap.iterator("nonexistent");
        assertFalse(itEmpty.hasNext());
        assertEquals(EmptyIterator.INSTANCE, itEmpty);
    }

    @Test
    public void testIteratorForKey_remove() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key1", "value3");

        Iterator it = multiMap.iterator("key1");
        it.next(); // consume one element
        it.remove(); // remove it
        assertEquals(2, multiMap.size("key1"));
        assertTrue(multiMap.containsValue("key1", "value2") || multiMap.containsValue("key1", "value3"));
        assertTrue(multiMap.containsValue("key1", "value3") || multiMap.containsValue("key1", "value2"));

        it.next();
        it.remove();
        assertEquals(1, multiMap.size("key1"));

        it.next();
        it.remove();
        assertEquals(0, multiMap.size("key1"));
        assertNull(multiMap.getCollection("key1"));
    }

    @Test
    public void testIteratorChainRemove() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("key1", "value1");
        multiMap.put("key1", "value2");
        multiMap.put("key2", "value3");

        Iterator valuesIterator = multiMap.values().iterator();
        valuesIterator.next();
        valuesIterator.remove(); // Should remove one value from key1
        assertEquals(1, multiMap.size("key1"));
        assertEquals(1, multiMap.size("key2"));
        assertEquals(2, multiMap.totalSize());
    }

    @Test
    public void testTotalSize() throws Exception {
        MultiValueMap multiMap = new MultiValueMap();
        assertEquals(0, multiMap.totalSize());

        multiMap.put("key1", "value1");
        assertEquals(1, multiMap.totalSize());

        multiMap.put("key1", "value2");
        assertEquals(2, multiMap.totalSize());

        multiMap.put("key2", "value3");
        assertEquals(3, multiMap.totalSize());

        multiMap.removeMapping("key1", "value1");
        assertEquals(2, multiMap.totalSize());

        multiMap.remove("key1");
        assertEquals(1, multiMap.totalSize());

        multiMap.remove("key2");
        assertEquals(0, multiMap.totalSize());
    }

    @Test
    public void testCreateCollection() throws Exception {
        Map<Object, Object> map = new HashMap<>();
        // Use TestReflectionFactory to allow testing of its create method indirectly
        TestReflectionFactory factory = new TestReflectionFactory(ArrayList.class);
        MultiValueMap multiMap = new MultiValueMap(map, factory);

        // Test createCollection indirectly via put
        multiMap.put("key1", "value1");
        Collection coll = multiMap.getCollection("key1");
        assertNotNull(coll);
        // The factory's create method is called when a new collection is needed.
        // The initial state from the factory is not directly accessible.
        // We can assert that the collection contains the added value.
        assertTrue(coll.contains("value1"));
        assertTrue(coll.size() >= 1); // At least one element from factory + added value

        // Test createCollection with explicit call
        // The size hint is not guaranteed to affect the created collection.
        Collection newColl = multiMap.createCollection(5);
        assertNotNull(newColl);
        // Assert that the factory was used and created a collection.
        assertTrue(newColl instanceof ArrayList);
    }

    @Test
    public void testCreateCollectionWithNullFactory() throws Exception {
        Map<Object, Object> map = new HashMap<>();
        // The constructor should throw IllegalArgumentException for null factory.
        try {
            new MultiValueMap(map, null);
            fail("Expected IllegalArgumentException for null factory");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testCreateCollectionWithNonCollectionFactory() throws Exception {
        Map<Object, Object> map = new HashMap<>();
        Factory nonCollectionFactory = new Factory() {
            public Object create() {
                return "not a collection";
            }
        };
        MultiValueMap multiMap = new MultiValueMap(map, nonCollectionFactory);
        try {
            multiMap.createCollection(1);
            fail("Expected ClassCastException or FunctorException");
        } catch (ClassCastException e) {
            // Expected when the returned object is cast to Collection
        } catch (FunctorException e) {
            // Expected if factory itself throws an exception wrapping the issue
        }
    }
}
