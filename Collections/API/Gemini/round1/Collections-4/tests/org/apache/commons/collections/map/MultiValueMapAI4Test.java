package org.apache.commons.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.Factory;
import org.junit.Assert;
import org.junit.Test;

public class MultiValueMapAI4Test {

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
        Assert.assertTrue(coll.contains("val1"));
        Assert.assertTrue(coll.contains("val2"));
        Assert.assertEquals(2, coll.size());
    }

    @Test
    public void testPutAllCollection() {
        MultiValueMap map = new MultiValueMap();
        List values = Arrays.asList("A", "B", "C");

        Assert.assertFalse(map.putAll("key1", null));
        Assert.assertFalse(map.putAll("key1", Collections.EMPTY_LIST));

        boolean changed = map.putAll("key1", values);
        Assert.assertTrue(changed);
        Assert.assertEquals(3, map.size("key1"));

        boolean changedAgain = map.putAll("key1", Arrays.asList("D"));
        Assert.assertTrue(changedAgain);
        Assert.assertEquals(4, map.size("key1"));
        Assert.assertEquals(4, map.totalSize());
    }

    @Test
    public void testPutAllMap() {
        MultiValueMap map1 = new MultiValueMap();
        map1.put("k1", "v1");
        map1.put("k1", "v2");

        MultiValueMap map2 = new MultiValueMap();
        map2.putAll(map1);
        Assert.assertEquals(2, map2.size("k1"));
        Assert.assertEquals(2, map2.totalSize());

        Map regularMap = new HashMap();
        regularMap.put("k2", "v3");
        regularMap.put("k3", "v4");

        map2.putAll(regularMap);
        Assert.assertEquals(1, map2.size("k2"));
        Assert.assertEquals(1, map2.size("k3"));
        Assert.assertEquals(4, map2.totalSize());
    }

    @Test
    public void testRemoveMapping() {
        MultiValueMap map = new MultiValueMap();
        map.put("key", "val1");
        map.put("key", "val2");

        Assert.assertNull(map.removeMapping("nonExistingKey", "val1"));
        Assert.assertNull(map.removeMapping("key", "nonExistingVal"));

        Object removed = map.removeMapping("key", "val1");
        Assert.assertEquals("val1", removed);
        Assert.assertEquals(1, map.size("key"));
        Assert.assertTrue(map.containsKey("key"));

        Object removedLast = map.removeMapping("key", "val2");
        Assert.assertEquals("val2", removedLast);
        Assert.assertNull(map.getCollection("key"));
        Assert.assertFalse(map.containsKey("key"));
        Assert.assertEquals(0, map.size("key"));
    }

    @Test
    public void testContainsValue() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Assert.assertTrue(map.containsValue("v1"));
        Assert.assertTrue(map.containsValue("v2"));
        Assert.assertTrue(map.containsValue("v3"));
        Assert.assertFalse(map.containsValue("nonExistent"));

        Assert.assertTrue(map.containsValue("k1", "v1"));
        Assert.assertFalse(map.containsValue("k1", "v3"));
        Assert.assertFalse(map.containsValue("nonExistentKey", "v1"));
    }

    @Test
    public void testValuesCollectionAndView() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Collection vals = map.values();
        Assert.assertEquals(3, vals.size());
        Assert.assertTrue(vals.contains("v1"));
        Assert.assertTrue(vals.contains("v2"));
        Assert.assertTrue(vals.contains("v3"));

        int iterated = 0;
        for (Iterator it = vals.iterator(); it.hasNext();) {
            it.next();
            iterated++;
        }
        Assert.assertEquals(3, iterated);

        vals.clear();
        Assert.assertEquals(0, map.totalSize());
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testIteratorAndIteratorRemove() {
        MultiValueMap map = new MultiValueMap();
        Iterator emptyIt = map.iterator("nonExistingKey");
        Assert.assertFalse(emptyIt.hasNext());

        map.put("k1", "v1");
        map.put("k1", "v2");

        Iterator it = map.iterator("k1");
        Assert.assertTrue(it.hasNext());
        Object first = it.next();
        Assert.assertEquals("v1", first);
        it.remove();
        Assert.assertEquals(1, map.size("k1"));

        Assert.assertTrue(it.hasNext());
        Object second = it.next();
        Assert.assertEquals("v2", second);
        it.remove();
        Assert.assertFalse(map.containsKey("k1"));
        Assert.assertEquals(0, map.totalSize());
    }

    @Test
    public void testDecorateWithCollectionClass() {
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), HashSet.class);
        map.put("k1", "val");
        Object duplicatePut = map.put("k1", "val");

        // Since HashSet does not accept duplicates, duplicate put should return null
        Assert.assertNull(duplicatePut);
        Assert.assertEquals(1, map.size("k1"));
        Assert.assertTrue(map.getCollection("k1") instanceof HashSet);
    }

    @Test
    public void testDecorateWithCustomFactory() {
        Factory customFactory = new Factory() {
            public Object create() {
                return new ArrayList();
            }
        };
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), customFactory);
        map.put("k", "v");
        Assert.assertEquals(1, map.size("k"));
        Assert.assertTrue(map.getCollection("k") instanceof ArrayList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFactoryThrowsException() {
        new MultiValueMap(new HashMap(), null);
    }

    @Test
    public void testClear() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals(2, map.totalSize());

        map.clear();
        Assert.assertEquals(0, map.totalSize());
        Assert.assertNull(map.getCollection("k1"));
        Assert.assertTrue(map.isEmpty());
    }
}
