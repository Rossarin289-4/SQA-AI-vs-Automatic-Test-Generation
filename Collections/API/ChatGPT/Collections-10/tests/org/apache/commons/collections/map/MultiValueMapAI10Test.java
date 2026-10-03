package org.apache.commons.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.Factory;
import org.junit.Assert;
import org.junit.Test;

public class MultiValueMapAI10Test {

    @Test
    public void testPutAccumulatesValuesForSameKey() {
        MultiValueMap map = new MultiValueMap();

        Assert.assertEquals("one", map.put("letters", "one"));
        Assert.assertEquals("two", map.put("letters", "two"));

        Assert.assertEquals(1, map.size());
        Assert.assertEquals(2, map.size("letters"));
        Assert.assertEquals(2, map.totalSize());
        Assert.assertEquals(Arrays.asList(new Object[] { "one", "two" }),
                map.getCollection("letters"));
        Assert.assertTrue(map.containsValue("one"));
        Assert.assertTrue(map.containsValue("letters", "two"));
        Assert.assertFalse(map.containsValue("letters", "missing"));
    }

    @Test
    public void testPutAllCollectionHandlesNullEmptyAndValues() {
        MultiValueMap map = new MultiValueMap();

        Assert.assertFalse(map.putAll("numbers", null));
        Assert.assertFalse(map.putAll("numbers", new ArrayList()));
        Assert.assertFalse(map.containsKey("numbers"));

        Collection values = Arrays.asList(new Object[] { "one", "two", "three" });
        Assert.assertTrue(map.putAll("numbers", values));

        Assert.assertEquals(3, map.size("numbers"));
        Assert.assertEquals(3, map.totalSize());
        Assert.assertEquals(values, map.getCollection("numbers"));

        Assert.assertTrue(map.putAll("numbers", Arrays.asList(new Object[] { "four" })));
        Assert.assertEquals(Arrays.asList(new Object[] { "one", "two", "three", "four" }),
                map.getCollection("numbers"));
    }

    @Test
    public void testRemoveMappingOnlyRemovesRequestedValueAndRemovesEmptyKey() {
        MultiValueMap map = new MultiValueMap();
        map.put("key", "first");
        map.put("key", "second");

        Assert.assertNull(map.removeMapping("key", "absent"));
        Assert.assertEquals("first", map.removeMapping("key", "first"));
        Assert.assertTrue(map.containsKey("key"));
        Assert.assertEquals(Arrays.asList(new Object[] { "second" }), map.getCollection("key"));

        Assert.assertEquals("second", map.removeMapping("key", "second"));
        Assert.assertFalse(map.containsKey("key"));
        Assert.assertNull(map.getCollection("key"));
        Assert.assertEquals(0, map.totalSize());
    }

    @Test
    public void testIteratorForKeyRemovesKeyWhenLastValueIsRemoved() {
        MultiValueMap map = new MultiValueMap();
        map.put("only", "value");

        Iterator iterator = map.iterator("only");
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("value", iterator.next());
        iterator.remove();

        Assert.assertFalse(iterator.hasNext());
        Assert.assertFalse(map.containsKey("only"));
        Assert.assertEquals(0, map.totalSize());

        Iterator missing = map.iterator("missing");
        Assert.assertFalse(missing.hasNext());
    }

    @Test
    public void testValuesViewContainsFlattenedValuesAndClearIsLive() {
        MultiValueMap map = new MultiValueMap();
        map.put("first", "a");
        map.put("first", "b");
        map.put("second", "c");

        Collection values = map.values();
        Assert.assertEquals(3, values.size());
        Assert.assertTrue(values.contains("a"));
        Assert.assertTrue(values.contains("b"));
        Assert.assertTrue(values.contains("c"));

        values.clear();

        Assert.assertTrue(map.isEmpty());
        Assert.assertTrue(values.isEmpty());
        Assert.assertEquals(0, map.totalSize());

        map.put("new", "value");
        Assert.assertEquals(1, values.size());
        Assert.assertTrue(values.contains("value"));
    }

    @Test
    public void testPutAllFromNormalMapAddsEachEntryAsValue() {
        MultiValueMap map = new MultiValueMap();
        Map source = new HashMap();
        source.put("one", "first");
        source.put("two", "second");

        map.putAll(source);

        Assert.assertEquals(2, map.size());
        Assert.assertEquals(2, map.totalSize());
        Assert.assertEquals(Arrays.asList(new Object[] { "first" }), map.getCollection("one"));
        Assert.assertEquals(Arrays.asList(new Object[] { "second" }), map.getCollection("two"));
    }

    @Test
    public void testPutAllFromMultiMapCopiesEachContainedValue() {
        MultiValueMap source = new MultiValueMap();
        source.put("group", "source-one");
        source.put("group", "source-two");

        MultiValueMap destination = new MultiValueMap();
        destination.put("group", "existing");
        destination.putAll(source);

        Assert.assertEquals(1, destination.size());
        Assert.assertEquals(3, destination.totalSize());
        Assert.assertEquals(
                Arrays.asList(new Object[] { "existing", "source-one", "source-two" }),
                destination.getCollection("group"));
    }

    @Test
    public void testDecorateWithHashSetPreventsDuplicateValues() {
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), HashSet.class);

        Assert.assertEquals("value", map.put("key", "value"));
        Assert.assertNull(map.put("key", "value"));

        Assert.assertEquals(1, map.size());
        Assert.assertEquals(1, map.size("key"));
        Assert.assertEquals(1, map.totalSize());
        Assert.assertTrue(map.getCollection("key") instanceof HashSet);
        Assert.assertTrue(map.containsValue("key", "value"));
    }

    @Test
    public void testDecoratedBackingMapReceivesCollectionMappings() {
        Map backing = new HashMap();
        MultiValueMap map = MultiValueMap.decorate(backing);

        map.put("key", "value");

        Assert.assertTrue(backing.containsKey("key"));
        Assert.assertTrue(backing.get("key") instanceof Collection);
        Assert.assertEquals(Arrays.asList(new Object[] { "value" }), backing.get("key"));

        ((Collection) backing.get("key")).add("added-directly");
        Assert.assertEquals(2, map.size("key"));
        Assert.assertEquals(2, map.totalSize());
        Assert.assertTrue(map.containsValue("added-directly"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateRejectsNullFactory() {
        MultiValueMap.decorate(new HashMap(), (Factory) null);
    }
}
