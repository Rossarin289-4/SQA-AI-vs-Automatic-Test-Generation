package org.apache.commons.collections.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.MapIterator;
import org.junit.Test;

public class Flat3MapAI6Test {

    @Test
    public void testPutGetAndSizeWithinThreeElements() {
        Flat3Map map = new Flat3Map();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());

        assertNull(map.put("key1", "val1"));
        assertEquals(1, map.size());
        assertFalse(map.isEmpty());
        assertEquals("val1", map.get("key1"));
        assertTrue(map.containsKey("key1"));
        assertTrue(map.containsValue("val1"));

        assertNull(map.put("key2", "val2"));
        assertNull(map.put("key3", "val3"));
        assertEquals(3, map.size());
        assertEquals("val2", map.get("key2"));
        assertEquals("val3", map.get("key3"));

        // Overwrite existing key
        Object old = map.put("key2", "val2_new");
        assertEquals("val2", old);
        assertEquals(3, map.size());
        assertEquals("val2_new", map.get("key2"));

        assertNull(map.get("nonexistent"));
        assertFalse(map.containsKey("nonexistent"));
        assertFalse(map.containsValue("nonexistent"));
    }

    @Test
    public void testTransitionToDelegateMapAndClear() {
        Flat3Map map = new Flat3Map();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        // Transitions to delegate map on 4th put
        map.put("d", "4");

        assertEquals(4, map.size());
        assertTrue(map.containsKey("a"));
        assertTrue(map.containsKey("b"));
        assertTrue(map.containsKey("c"));
        assertTrue(map.containsKey("d"));
        assertEquals("1", map.get("a"));
        assertEquals("4", map.get("d"));

        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertFalse(map.containsKey("a"));
        assertNull(map.get("a"));
    }

    @Test
    public void testNullKeyAndNullValue() {
        Flat3Map map = new Flat3Map();

        // Null key with value
        assertNull(map.put(null, "nullValue"));
        assertEquals(1, map.size());
        assertTrue(map.containsKey(null));
        assertTrue(map.containsValue("nullValue"));
        assertEquals("nullValue", map.get(null));

        // Overwrite null key
        assertEquals("nullValue", map.put(null, "updatedNullValue"));
        assertEquals("updatedNullValue", map.get(null));

        // Non-null key with null value
        assertNull(map.put("keyWithNullVal", null));
        assertEquals(2, map.size());
        assertTrue(map.containsKey("keyWithNullVal"));
        assertTrue(map.containsValue(null));
        assertNull(map.get("keyWithNullVal"));

        // Third element: both null
        Flat3Map map2 = new Flat3Map();
        map2.put("k1", "v1");
        map2.put(null, null);
        assertEquals(2, map2.size());
        assertTrue(map2.containsKey(null));
        assertTrue(map2.containsValue(null));
        assertNull(map2.get(null));
    }

    @Test
    public void testRemoveInFlatMode() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        // Remove non-existent key
        assertNull(map.remove("kNotFound"));
        assertEquals(3, map.size());

        // Remove middle element
        assertEquals("v2", map.remove("k2"));
        assertEquals(2, map.size());
        assertFalse(map.containsKey("k2"));
        assertTrue(map.containsKey("k1"));
        assertTrue(map.containsKey("k3"));

        // Remove remaining elements
        assertEquals("v1", map.remove("k1"));
        assertEquals(1, map.size());
        assertEquals("v3", map.remove("k3"));
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testMapIteratorNavigationAndModification() {
        Flat3Map map = new Flat3Map();
        map.put("one", "1");
        map.put("two", "2");

        MapIterator it = map.mapIterator();
        assertTrue(it.hasNext());

        int count = 0;
        while (it.hasNext()) {
            Object key = it.next();
            assertNotNull(key);
            assertNotNull(it.getValue());
            if ("two".equals(key)) {
                it.setValue("2_updated");
            }
            count++;
        }
        assertEquals(2, count);
        assertEquals("2_updated", map.get("two"));
    }

    @Test
    public void testKeySetAndValuesViews() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Set keys = map.keySet();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("k1"));
        assertTrue(keys.contains("k2"));

        keys.remove("k1");
        assertEquals(1, map.size());
        assertFalse(map.containsKey("k1"));

        Collection values = map.values();
        assertEquals(1, values.size());
        assertTrue(values.contains("v2"));

        Iterator valIt = values.iterator();
        assertTrue(valIt.hasNext());
        assertEquals("v2", valIt.next());
        assertFalse(valIt.hasNext());
    }

    @Test
    public void testEqualsAndHashCode() {
        Flat3Map map1 = new Flat3Map();
        map1.put("k1", "v1");
        map1.put("k2", "v2");

        Flat3Map map2 = new Flat3Map();
        map2.put("k2", "v2");
        map2.put("k1", "v1");

        Map hashMap = new HashMap();
        hashMap.put("k1", "v1");
        hashMap.put("k2", "v2");

        assertEquals(map1, map1);
        assertEquals(map1, map2);
        assertEquals(map1, hashMap);
        assertEquals(map1.hashCode(), map2.hashCode());
        assertEquals(map1.hashCode(), hashMap.hashCode());

        map2.put("k3", "v3");
        assertFalse(map1.equals(map2));

        Flat3Map mapDiffVal = new Flat3Map();
        mapDiffVal.put("k1", "v1");
        mapDiffVal.put("k2", "different");
        assertFalse(map1.equals(mapDiffVal));

        assertFalse(map1.equals("aString"));
        assertFalse(map1.equals(null));
    }

    @Test
    public void testClone() {
        Flat3Map original = new Flat3Map();
        original.put("k1", "v1");
        original.put("k2", "v2");

        Flat3Map cloned = (Flat3Map) original.clone();
        assertEquals(original, cloned);

        cloned.put("k3", "v3");
        assertEquals(2, original.size());
        assertEquals(3, cloned.size());
        assertFalse(original.containsKey("k3"));

        // Clone after transitioning to delegate map
        original.put("k3", "v3");
        original.put("k4", "v4");
        Flat3Map clonedDelegate = (Flat3Map) original.clone();
        assertEquals(4, clonedDelegate.size());
        clonedDelegate.put("k5", "v5");
        assertEquals(4, original.size());
        assertEquals(5, clonedDelegate.size());
    }

    @Test
    public void testSerializationFlatAndDelegateModes() throws Exception {
        // Flat mode serialization
        Flat3Map flatMap = new Flat3Map();
        flatMap.put("A", "1");
        flatMap.put("B", "2");

        Flat3Map deserializedFlat = serializeAndDeserialize(flatMap);
        assertEquals(flatMap, deserializedFlat);
        assertEquals("1", deserializedFlat.get("A"));
        assertEquals("2", deserializedFlat.get("B"));

        // Delegate mode serialization (> 3 elements)
        Flat3Map delegateMap = new Flat3Map();
        delegateMap.put("A", "1");
        delegateMap.put("B", "2");
        delegateMap.put("C", "3");
        delegateMap.put("D", "4");

        Flat3Map deserializedDelegate = serializeAndDeserialize(delegateMap);
        assertEquals(delegateMap, deserializedDelegate);
        assertEquals(4, deserializedDelegate.size());
        assertEquals("4", deserializedDelegate.get("D"));
    }

    @Test
    public void testConstructorWithMap() {
        Map source = new HashMap();
        source.put("x", "10");
        source.put("y", "20");

        Flat3Map map = new Flat3Map(source);
        assertEquals(2, map.size());
        assertEquals("10", map.get("x"));
        assertEquals("20", map.get("y"));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullMapThrowsException() {
        new Flat3Map((Map) null);
    }

    private Flat3Map serializeAndDeserialize(Flat3Map map) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map result = (Flat3Map) ois.readObject();
        ois.close();
        return result;
    }
}
