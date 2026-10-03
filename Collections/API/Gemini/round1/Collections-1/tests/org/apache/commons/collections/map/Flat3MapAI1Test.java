package org.apache.commons.collections.map;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Flat3MapAI1Test {

    @Test
    public void testEmptyMapOperations() {
        Flat3Map map = new Flat3Map();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.get("key"));
        Assert.assertFalse(map.containsKey("key"));
        Assert.assertFalse(map.containsValue("val"));
        Assert.assertEquals("{}", map.toString());
        Assert.assertEquals(0, map.hashCode());

        Iterator it = map.entrySet().iterator();
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testPutGetRemoveFlatMode() {
        Flat3Map map = new Flat3Map();
        Assert.assertNull(map.put("k1", "v1"));
        Assert.assertNull(map.put("k2", "v2"));
        Assert.assertNull(map.put("k3", "v3"));

        Assert.assertEquals(3, map.size());
        Assert.assertEquals("v1", map.get("k1"));
        Assert.assertEquals("v2", map.get("k2"));
        Assert.assertEquals("v3", map.get("k3"));

        // Overwrite existing key
        Assert.assertEquals("v2", map.put("k2", "v2_new"));
        Assert.assertEquals("v2_new", map.get("k2"));
        Assert.assertEquals(3, map.size());

        // Remove from flat mode
        Assert.assertEquals("v2_new", map.remove("k2"));
        Assert.assertEquals(2, map.size());
        Assert.assertNull(map.get("k2"));
        Assert.assertFalse(map.containsKey("k2"));
        Assert.assertEquals("v1", map.get("k1"));
        Assert.assertEquals("v3", map.get("k3"));

        Assert.assertEquals("v1", map.remove("k1"));
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("v3", map.get("k3"));

        Assert.assertEquals("v3", map.remove("k3"));
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void testSwitchToDelegateModeAndBeyond() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        // Exceed size 3 to switch to delegate mode
        Assert.assertNull(map.put("k4", "v4"));

        Assert.assertEquals(4, map.size());
        Assert.assertEquals("v1", map.get("k1"));
        Assert.assertEquals("v2", map.get("k2"));
        Assert.assertEquals("v3", map.get("k3"));
        Assert.assertEquals("v4", map.get("k4"));

        Assert.assertTrue(map.containsKey("k1"));
        Assert.assertTrue(map.containsKey("k4"));
        Assert.assertTrue(map.containsValue("v4"));

        Assert.assertEquals("v4", map.remove("k4"));
        Assert.assertEquals(3, map.size());
        Assert.assertNull(map.get("k4"));
    }

    @Test
    public void testNullKeysAndValuesFlatMode() {
        Flat3Map map = new Flat3Map();
        Assert.assertNull(map.put(null, "nullValue"));
        Assert.assertEquals(1, map.size());
        Assert.assertTrue(map.containsKey(null));
        Assert.assertEquals("nullValue", map.get(null));

        Assert.assertNull(map.put("k2", null));
        Assert.assertEquals(2, map.size());
        Assert.assertTrue(map.containsValue(null));
        Assert.assertNull(map.get("k2"));

        Assert.assertEquals("nullValue", map.put(null, "updatedNullValue"));
        Assert.assertEquals("updatedNullValue", map.get(null));

        Assert.assertTrue(map.containsValue("updatedNullValue"));
    }

    @Test
    public void testPutAllSmallAndLargeMap() {
        Map small = new HashMap();
        small.put("a", "1");
        small.put("b", "2");

        Flat3Map map1 = new Flat3Map(small);
        Assert.assertEquals(2, map1.size());
        Assert.assertEquals("1", map1.get("a"));
        Assert.assertEquals("2", map1.get("b"));

        Map large = new HashMap();
        large.put("c", "3");
        large.put("d", "4");
        large.put("e", "5");
        large.put("f", "6");

        map1.putAll(large);
        Assert.assertEquals(6, map1.size());
        Assert.assertEquals("3", map1.get("c"));
        Assert.assertEquals("6", map1.get("f"));
    }

    @Test
    public void testEntrySetIteratorAndEntryModification() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Set entrySet = map.entrySet();
        Assert.assertEquals(2, entrySet.size());

        Iterator it = entrySet.iterator();
        Assert.assertTrue(it.hasNext());
        Map.Entry entry = (Map.Entry) it.next();
        Assert.assertNotNull(entry.getKey());
        Assert.assertNotNull(entry.getValue());

        // Modify value via entry
        if ("k1".equals(entry.getKey())) {
            entry.setValue("v1_mod");
            Assert.assertEquals("v1_mod", map.get("k1"));
        } else if ("k2".equals(entry.getKey())) {
            entry.setValue("v2_mod");
            Assert.assertEquals("v2_mod", map.get("k2"));
        }

        // Test removal through entrySet iterator
        it.remove();
        Assert.assertEquals(1, map.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testEntrySetIteratorRemoveWithoutNextThrowsException() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        it.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void testEntrySetIteratorExhaustedThrowsException() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        Assert.assertTrue(it.hasNext());
        it.next();
        Assert.assertFalse(it.hasNext());
        it.next();
    }

    @Test
    public void testKeySetAndValuesViews() {
        Flat3Map map = new Flat3Map();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        Set keys = map.keySet();
        Assert.assertEquals(3, keys.size());
        Assert.assertTrue(keys.contains("1"));
        Assert.assertTrue(keys.contains("2"));
        Assert.assertTrue(keys.contains("3"));
        Assert.assertFalse(keys.contains("4"));

        Collection values = map.values();
        Assert.assertEquals(3, values.size());
        Assert.assertTrue(values.contains("one"));
        Assert.assertTrue(values.contains("two"));
        Assert.assertTrue(values.contains("three"));
        Assert.assertFalse(values.contains("four"));

        keys.remove("2");
        Assert.assertEquals(2, map.size());
        Assert.assertFalse(map.containsKey("2"));
        Assert.assertFalse(values.contains("two"));
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

        Assert.assertEquals(map1, map2);
        Assert.assertEquals(map1, hashMap);
        Assert.assertEquals(map1.hashCode(), map2.hashCode());
        Assert.assertEquals(map1.hashCode(), hashMap.hashCode());

        map2.put("k3", "v3");
        Assert.assertFalse(map1.equals(map2));
    }

    @Test
    public void testClone() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Flat3Map cloned = (Flat3Map) map.clone();
        Assert.assertEquals(map, cloned);
        Assert.assertEquals(map.size(), cloned.size());

        cloned.put("k3", "v3");
        Assert.assertFalse(map.containsKey("k3"));
        Assert.assertTrue(cloned.containsKey("k3"));

        // Clone while in delegate mode
        map.put("k3", "v3");
        map.put("k4", "v4");
        Flat3Map clonedDelegate = (Flat3Map) map.clone();
        Assert.assertEquals(map, clonedDelegate);
        Assert.assertEquals(4, clonedDelegate.size());
    }

    @Test
    public void testSerialization() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4"); // in delegate mode

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map deserialized = (Flat3Map) ois.readObject();

        Assert.assertEquals(map.size(), deserialized.size());
        Assert.assertEquals(map, deserialized);
        Assert.assertEquals("v1", deserialized.get("k1"));
        Assert.assertEquals("v4", deserialized.get("k4"));
    }
}
