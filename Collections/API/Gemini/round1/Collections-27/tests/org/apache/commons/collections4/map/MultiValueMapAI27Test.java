package org.apache.commons.collections4.map;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.Factory;
import org.junit.Assert;
import org.junit.Test;

public class MultiValueMapAI27Test {

    @Test
    public void testDefaultConstructorAndBasicPutGet() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        Assert.assertEquals(0, map.totalSize());
        Assert.assertEquals(0, map.size());

        map.put("A", "v1");
        map.put("A", "v2");
        map.put("B", "v3");

        Assert.assertEquals(2, map.size());
        Assert.assertEquals(3, map.totalSize());
        Assert.assertEquals(2, map.size("A"));
        Assert.assertEquals(1, map.size("B"));
        Assert.assertEquals(0, map.size("C"));

        Collection<String> collA = map.getCollection("A");
        Assert.assertNotNull(collA);
        Assert.assertEquals(2, collA.size());
        Assert.assertTrue(collA.contains("v1"));
        Assert.assertTrue(collA.contains("v2"));
    }

    @Test
    public void testMultiValueMapFactoryWithCustomCollectionClass() {
        MultiValueMap<String, String> map = MultiValueMap.multiValueMap(
                new HashMap<String, Object>(),
                HashSet.class);

        map.put("K", "duplicate");
        map.put("K", "duplicate");

        Assert.assertEquals(1, map.totalSize());
        Assert.assertEquals(1, map.size("K"));
        Collection<String> coll = map.getCollection("K");
        Assert.assertTrue(coll instanceof HashSet);
    }

    @Test
    public void testMultiValueMapFactoryWithCustomFactory() {
        Factory<ArrayList<String>> customFactory = new Factory<ArrayList<String>>() {
            @Override
            public ArrayList<String> create() {
                return new ArrayList<String>();
            }
        };

        MultiValueMap<String, String> map = MultiValueMap.multiValueMap(
                new HashMap<String, Object>(),
                customFactory);

        map.put("K", "val");
        Assert.assertTrue(map.containsValue("val"));
        Assert.assertTrue(map.containsValue("K", "val"));
        Assert.assertFalse(map.containsValue("K", "absent"));
        Assert.assertFalse(map.containsValue("absentKey", "val"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullFactoryThrowsException() {
        new MultiValueMap<String, String>(new HashMap<String, Object>(), (Factory<ArrayList<String>>) null);
    }

    @Test
    public void testRemoveMappingRemovesKeyWhenEmpty() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key1", "val1");
        map.put("key1", "val2");

        Assert.assertFalse(map.removeMapping("nonExistent", "val1"));
        Assert.assertFalse(map.removeMapping("key1", "nonExistent"));

        Assert.assertTrue(map.removeMapping("key1", "val1"));
        Assert.assertEquals(1, map.size("key1"));
        Assert.assertTrue(map.containsKey("key1"));

        Assert.assertTrue(map.removeMapping("key1", "val2"));
        Assert.assertEquals(0, map.size("key1"));
        Assert.assertFalse(map.containsKey("key1"));
        Assert.assertNull(map.getCollection("key1"));
    }

    @Test
    public void testPutAllCollection() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();

        Assert.assertFalse(map.putAll("K1", (Collection<String>) null));
        Assert.assertFalse(map.putAll("K1", new ArrayList<String>()));
        Assert.assertEquals(0, map.totalSize());

        Assert.assertTrue(map.putAll("K1", Arrays.asList("a", "b", "c")));
        Assert.assertEquals(3, map.size("K1"));

        Assert.assertTrue(map.putAll("K1", Arrays.asList("d")));
        Assert.assertEquals(4, map.size("K1"));
    }

    @Test
    public void testPutAllFromMapAndMultiMap() {
        Map<String, String> regularMap = new HashMap<String, String>();
        regularMap.put("r1", "v1");
        regularMap.put("r2", "v2");

        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.putAll(regularMap);
        Assert.assertEquals(2, map.totalSize());
        Assert.assertEquals(1, map.size("r1"));
        Assert.assertEquals(1, map.size("r2"));

        MultiValueMap<String, String> srcMulti = new MultiValueMap<String, String>();
        srcMulti.put("m1", "val1");
        srcMulti.put("m1", "val2");

        map.putAll(srcMulti);
        Assert.assertEquals(4, map.totalSize());
        Assert.assertEquals(2, map.size("m1"));
    }

    @Test
    public void testIteratorPerKey() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        Iterator<String> emptyIt = map.iterator("nonExisting");
        Assert.assertFalse(emptyIt.hasNext());

        map.put("key", "a");
        map.put("key", "b");
        Iterator<String> it = map.iterator("key");
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("a", it.next());
        it.remove();
        Assert.assertEquals(1, map.size("key"));

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("b", it.next());
        it.remove();
        Assert.assertFalse(map.containsKey("key"));
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testTotalIterator() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Iterator<Map.Entry<String, String>> it = map.iterator();
        int count = 0;
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            Assert.assertNotNull(entry.getKey());
            Assert.assertNotNull(entry.getValue());
            count++;
        }
        Assert.assertEquals(3, count);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTotalIteratorEntrySetValueUnsupported() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k", "v");
        Iterator<Map.Entry<String, String>> it = map.iterator();
        Assert.assertTrue(it.hasNext());
        Map.Entry<String, String> entry = it.next();
        entry.setValue("newVal");
    }

    @Test
    public void testValuesCollection() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k1", "a");
        map.put("k1", "b");
        map.put("k2", "c");

        Collection<Object> values = map.values();
        Assert.assertEquals(3, values.size());
        Assert.assertTrue(values.contains("a"));
        Assert.assertTrue(values.contains("b"));
        Assert.assertTrue(values.contains("c"));

        values.clear();
        Assert.assertEquals(0, map.size());
        Assert.assertEquals(0, map.totalSize());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testSerializationRoundTrip() throws Exception {
        MultiValueMap<String, String> original = new MultiValueMap<String, String>();
        original.put("A", "1");
        original.put("A", "2");
        original.put("B", "3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MultiValueMap<String, String> deserialized = (MultiValueMap<String, String>) ois.readObject();
        ois.close();

        Assert.assertEquals(2, deserialized.size());
        Assert.assertEquals(3, deserialized.totalSize());
        Assert.assertTrue(deserialized.containsValue("A", "1"));
        Assert.assertTrue(deserialized.containsValue("A", "2"));
        Assert.assertTrue(deserialized.containsValue("B", "3"));
    }
}
