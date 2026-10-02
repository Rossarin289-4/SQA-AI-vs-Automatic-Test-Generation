package org.apache.commons.collections4.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class MultiValueMapAI27Test {

    @Test
    public void testPutAccumulatesValuesForSameKey() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();

        map.put("fruit", "apple");
        map.put("fruit", "pear");
        map.put("color", "red");

        Assert.assertEquals(2, map.size("fruit"));
        Assert.assertEquals(3, map.totalSize());
        Assert.assertTrue(map.containsValue("apple"));
        Assert.assertTrue(map.containsValue("fruit", "pear"));
        Assert.assertFalse(map.containsValue("fruit", "red"));
        Assert.assertEquals("apple", map.getCollection("fruit").iterator().next());
    }

    @Test
    public void testDefaultCollectionsAreArrayListsAndSupportNullValues() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();

        map.put(null, null);
        map.put(null, "value");

        Collection<String> values = map.getCollection(null);
        Assert.assertTrue(values instanceof ArrayList);
        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains(null));
        Assert.assertTrue(values.contains("value"));
    }

    @Test
    public void testRemoveMappingRemovesOnlyRequestedValueAndThenKey() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key", "first");
        map.put("key", "second");

        Assert.assertFalse(map.removeMapping("key", "missing"));
        Assert.assertTrue(map.removeMapping("key", "first"));
        Assert.assertTrue(map.containsKey("key"));
        Assert.assertEquals(1, map.size("key"));
        Assert.assertTrue(map.removeMapping("key", "second"));
        Assert.assertFalse(map.containsKey("key"));
        Assert.assertNull(map.getCollection("key"));
        Assert.assertFalse(map.removeMapping("key", "second"));
    }

    @Test
    public void testPutAllCollectionIgnoresEmptyCollectionAndAddsAllValues() {
        MultiValueMap<String, Integer> map = new MultiValueMap<String, Integer>();
        Collection<Integer> empty = new ArrayList<Integer>();
        Collection<Integer> values = new ArrayList<Integer>();
        values.add(Integer.valueOf(3));
        values.add(Integer.valueOf(5));

        Assert.assertFalse(map.putAll("numbers", empty));
        Assert.assertFalse(map.containsKey("numbers"));
        Assert.assertTrue(map.putAll("numbers", values));
        Assert.assertEquals(2, map.size("numbers"));
        Assert.assertTrue(map.containsValue("numbers", Integer.valueOf(3)));
        Assert.assertTrue(map.containsValue("numbers", Integer.valueOf(5)));
        Assert.assertFalse(map.putAll("numbers", empty));
    }

    @Test
    public void testPutAllFromNormalMapAndMultiMapCopiesMappings() {
        MultiValueMap<String, String> destination = new MultiValueMap<String, String>();
        Map<String, String> ordinary = new HashMap<String, String>();
        ordinary.put("one", "first");
        ordinary.put("two", "second");

        destination.putAll(ordinary);

        Assert.assertEquals(2, destination.totalSize());
        Assert.assertTrue(destination.containsValue("one", "first"));
        Assert.assertTrue(destination.containsValue("two", "second"));

        MultiValueMap<String, String> source = new MultiValueMap<String, String>();
        source.put("letters", "a");
        source.put("letters", "b");
        destination.putAll(source);

        Assert.assertEquals(4, destination.totalSize());
        Assert.assertEquals(2, destination.size("letters"));
        source.put("letters", "c");
        Assert.assertEquals(2, destination.size("letters"));
    }

    @Test
    public void testDecoratesSuppliedMapAndValuesViewIsLive() {
        Map<String, Collection<String>> backing = new HashMap<String, Collection<String>>();
        MultiValueMap<String, String> map = MultiValueMap.multiValueMap(backing);

        map.put("a", "one");
        map.put("b", "two");

        Assert.assertEquals(2, backing.size());
        Assert.assertTrue(backing.get("a").contains("one"));

        Collection<Object> values = map.values();
        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("one"));
        Assert.assertTrue(values.contains("two"));

        values.clear();

        Assert.assertTrue(map.isEmpty());
        Assert.assertTrue(backing.isEmpty());
        Assert.assertEquals(0, values.size());
    }

    @Test
    public void testIteratorForKeyRemovesEmptyKeyAndMissingKeyIsEmpty() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key", "only");

        Iterator<String> iterator = map.iterator("key");
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("only", iterator.next());
        iterator.remove();

        Assert.assertFalse(map.containsKey("key"));
        Assert.assertFalse(map.iterator("missing").hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testFlattenedIteratorEntriesDoNotSupportSetValue() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key", "value");

        Map.Entry<String, String> entry = map.iterator().next();
        Assert.assertEquals("key", entry.getKey());
        Assert.assertEquals("value", entry.getValue());
        entry.setValue("replacement");
    }

    @Test
    public void testFlattenedIteratorVisitsEveryKeyValuePair() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("a", "one");
        map.put("a", "two");
        map.put("b", "three");

        Set<String> pairs = new HashSet<String>();
        Iterator<Map.Entry<String, String>> iterator = map.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            pairs.add(entry.getKey() + "=" + entry.getValue());
        }

        Assert.assertEquals(3, pairs.size());
        Assert.assertTrue(pairs.contains("a=one"));
        Assert.assertTrue(pairs.contains("a=two"));
        Assert.assertTrue(pairs.contains("b=three"));
    }
}
