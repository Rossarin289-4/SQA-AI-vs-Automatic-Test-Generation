package org.apache.commons.collections.map;

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
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.collections.Factory;
import org.junit.Assert;
import org.junit.Test;

public class MultiValueMapAI10Test {

    @Test
    public void testPutAndGetCollection() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertNull(map.getCollection("key1"));
        Assert.assertEquals(0, map.size("key1"));

        Object putResult1 = map.put("key1", "val1");
        Assert.assertEquals("val1", putResult1);
        Assert.assertEquals(1, map.size("key1"));

        Object putResult2 = map.put("key1", "val2");
        Assert.assertEquals("val2", putResult2);
        Assert.assertEquals(2, map.size("key1"));

        Collection coll = map.getCollection("key1");
        Assert.assertNotNull(coll);
        Assert.assertEquals(2, coll.size());
        Assert.assertTrue(coll.contains("val1"));
        Assert.assertTrue(coll.contains("val2"));
    }

    @Test
    public void testPutAllCollection() {
        MultiValueMap map = new MultiValueMap();
        Collection values = Arrays.asList(new Object[]{"v1", "v2", "v3"});

        boolean changedEmpty = map.putAll("k1", new ArrayList());
        Assert.assertFalse(changedEmpty);
        Assert.assertEquals(0, map.size("k1"));

        boolean changedNull = map.putAll("k1", null);
        Assert.assertFalse(changedNull);
        Assert.assertEquals(0, map.size("k1"));

        boolean changed = map.putAll("k1", values);
        Assert.assertTrue(changed);
        Assert.assertEquals(3, map.size("k1"));

        boolean changedAgain = map.putAll("k1", Arrays.asList(new Object[]{"v4"}));
        Assert.assertTrue(changedAgain);
        Assert.assertEquals(4, map.size("k1"));
    }

    @Test
    public void testPutAllMap() {
        Map regularMap = new HashMap();
        regularMap.put("k1", "v1");
        regularMap.put("k2", "v2");

        MultiValueMap target = new MultiValueMap();
        target.putAll(regularMap);

        Assert.assertEquals(1, target.size("k1"));
        Assert.assertEquals(1, target.size("k2"));
        Assert.assertTrue(target.containsValue("k1", "v1"));
        Assert.assertTrue(target.containsValue("k2", "v2"));

        MultiValueMap sourceMulti = new MultiValueMap();
        sourceMulti.put("k1", "v1_extra");
        sourceMulti.put("k3", "v3");

        target.putAll(sourceMulti);
        Assert.assertEquals(2, target.size("k1"));
        Assert.assertEquals(1, target.size("k3"));
        Assert.assertTrue(target.containsValue("k1", "v1_extra"));
    }

    @Test
    public void testRemoveMapping() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");

        Assert.assertNull(map.removeMapping("nonexistent", "v1"));
        Assert.assertNull(map.removeMapping("k1", "v3"));

        Object removed = map.removeMapping("k1", "v1");
        Assert.assertEquals("v1", removed);
        Assert.assertEquals(1, map.size("k1"));
        Assert.assertFalse(map.containsValue("k1", "v1"));
        Assert.assertTrue(map.containsValue("k1", "v2"));

        Object removedLast = map.removeMapping("k1", "v2");
        Assert.assertEquals("v2", removedLast);
        Assert.assertNull(map.getCollection("k1"));
        Assert.assertFalse(map.containsKey("k1"));
    }

    @Test
    public void testContainsValue() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Assert.assertTrue(map.containsValue("v1"));
        Assert.assertTrue(map.containsValue("v2"));
        Assert.assertFalse(map.containsValue("v3"));

        Assert.assertTrue(map.containsValue("k1", "v1"));
        Assert.assertFalse(map.containsValue("k1", "v2"));
        Assert.assertFalse(map.containsValue("k3", "v1"));
    }

    @Test
    public void testTotalSizeAndClear() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertEquals(0, map.totalSize());

        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Assert.assertEquals(3, map.totalSize());
        Assert.assertEquals(2, map.size()); // Map keys count

        map.clear();
        Assert.assertEquals(0, map.totalSize());
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.getCollection("k1"));
    }

    @Test
    public void testIterator() {
        MultiValueMap map = new MultiValueMap();
        Iterator emptyIt = map.iterator("nonexistent");
        Assert.assertFalse(emptyIt.hasNext());

        map.put("k1", "v1");
        map.put("k1", "v2");

        Iterator it = map.iterator("k1");
        Assert.assertTrue(it.hasNext());
        Object first = it.next();
        Assert.assertTrue(first.equals("v1") || first.equals("v2"));
        Assert.assertTrue(it.hasNext());
        it.next();
        Assert.assertFalse(it.hasNext());

        it.remove();
        Assert.assertEquals(1, map.size("k1"));
    }

    @Test
    public void testValuesCollectionAndViewIterator() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Collection values = map.values();
        Assert.assertEquals(3, values.size());
        Assert.assertTrue(values.contains("v1"));
        Assert.assertTrue(values.contains("v2"));
        Assert.assertTrue(values.contains("v3"));

        Iterator it = values.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

        Assert.assertEquals(0, map.totalSize());
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void testDecorateWithCustomCollectionClass() {
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), HashSet.class);
        map.put("k1", "v1");
        map.put("k1", "v1"); // Duplicate for Set

        Assert.assertEquals(1, map.size("k1"));
        Collection coll = map.getCollection("k1");
        Assert.assertTrue(coll instanceof HashSet);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateWithNullFactory() {
        MultiValueMap.decorate(new HashMap(), (Factory) null);
    }

    @Test
    public void testSerialization() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MultiValueMap deserialized = (MultiValueMap) ois.readObject();
        ois.close();

        Assert.assertEquals(3, deserialized.totalSize());
        Assert.assertEquals(2, deserialized.size("k1"));
        Assert.assertEquals(1, deserialized.size("k2"));
        Assert.assertTrue(deserialized.containsValue("k1", "v1"));
        Assert.assertTrue(deserialized.containsValue("k1", "v2"));
        Assert.assertTrue(deserialized.containsValue("k2", "v3"));
    }
}
