package org.apache.commons.collections4.map;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Assert;
import org.junit.Test;

public class ListOrderedMapAI22Test {

    @Test
    public void testInsertionReplacementAndNavigationPreserveOrder() {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();

        Assert.assertNull(map.put("one", Integer.valueOf(1)));
        Assert.assertNull(map.put("two", Integer.valueOf(2)));
        Assert.assertNull(map.put("three", Integer.valueOf(3)));
        Assert.assertEquals(Integer.valueOf(2), map.put("two", Integer.valueOf(20)));

        Assert.assertEquals(Arrays.asList("one", "two", "three"), map.keyList());
        Assert.assertEquals("one", map.firstKey());
        Assert.assertEquals("three", map.lastKey());
        Assert.assertEquals("two", map.nextKey("one"));
        Assert.assertEquals("two", map.previousKey("three"));
        Assert.assertNull(map.nextKey("three"));
        Assert.assertNull(map.previousKey("one"));
        Assert.assertEquals(Integer.valueOf(20), map.get("two"));
    }

    @Test
    public void testIndexedPutMovesExistingKeyAndAddsNewKey() {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", Integer.valueOf(1));
        map.put("b", Integer.valueOf(2));
        map.put("c", Integer.valueOf(3));

        Assert.assertEquals(Integer.valueOf(3), map.put(0, "c", Integer.valueOf(30)));
        Assert.assertEquals(Arrays.asList("c", "a", "b"), map.keyList());

        Assert.assertNull(map.put(1, "new", Integer.valueOf(4)));
        Assert.assertEquals(Arrays.asList("c", "new", "a", "b"), map.keyList());
        Assert.assertEquals(Integer.valueOf(30), map.getValue(0));
        Assert.assertEquals(2, map.indexOf("a"));
    }

    @Test
    public void testIndexedRemoveAndValuesViewStaySynchronized() {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", Integer.valueOf(1));
        map.put("b", Integer.valueOf(2));
        map.put("c", Integer.valueOf(3));

        Assert.assertEquals(Integer.valueOf(2), map.remove(1));
        Assert.assertEquals(Arrays.asList("a", "c"), map.keyList());

        List<Integer> values = map.valueList();
        Assert.assertEquals(Integer.valueOf(3), values.set(1, Integer.valueOf(30)));
        Assert.assertEquals(Integer.valueOf(30), map.get("c"));
        Assert.assertEquals(Integer.valueOf(1), values.remove(0));
        Assert.assertFalse(map.containsKey("a"));
        Assert.assertEquals(Arrays.asList("c"), map.keyList());
    }

    @Test
    public void testKeyListIsLiveAndUnmodifiable() {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("first", Integer.valueOf(1));

        List<String> keys = map.asList();
        map.put("second", Integer.valueOf(2));

        Assert.assertEquals(Arrays.asList("first", "second"), keys);
        try {
            keys.add("third");
            Assert.fail("key list must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals(2, map.size());
        }
    }

    @Test
    public void testEntrySetIteratorRemovalRemovesMappingAndOrder() {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("first", Integer.valueOf(1));
        map.put("second", Integer.valueOf(2));

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<String, Integer> first = iterator.next();
        Assert.assertEquals("first", first.getKey());
        Assert.assertEquals(Integer.valueOf(1), first.getValue());

        iterator.remove();

        Assert.assertFalse(map.containsKey("first"));
        Assert.assertEquals(Arrays.asList("second"), map.keyList());
        Assert.assertTrue(map.entrySet().remove(
                new AbstractMap.SimpleEntry<String, Integer>("second", Integer.valueOf(2))));
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testOrderedMapIteratorSupportsForwardBackwardAndValueUpdate() {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("a", Integer.valueOf(1));
        map.put("b", Integer.valueOf(2));

        OrderedMapIterator<String, Integer> iterator = map.mapIterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("a", iterator.next());
        Assert.assertEquals("a", iterator.getKey());
        Assert.assertEquals(Integer.valueOf(1), iterator.getValue());
        Assert.assertEquals(Integer.valueOf(1), iterator.setValue(Integer.valueOf(10)));
        Assert.assertEquals("b", iterator.next());
        Assert.assertTrue(iterator.hasPrevious());
        Assert.assertEquals("b", iterator.previous());
        iterator.remove();

        Assert.assertFalse(map.containsKey("b"));
        Assert.assertEquals(Integer.valueOf(10), map.get("a"));
        Assert.assertEquals(Arrays.asList("a"), map.keyList());
    }

    @Test
    public void testIndexedPutAllHandlesExistingAndNewKeys() {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put("p", Integer.valueOf(1));
        map.put("a", Integer.valueOf(2));
        map.put("q", Integer.valueOf(3));

        Map<String, Integer> additions = new LinkedHashMap<String, Integer>();
        additions.put("a", Integer.valueOf(20));
        additions.put("x", Integer.valueOf(4));
        map.putAll(2, additions);

        Assert.assertEquals(Arrays.asList("p", "a", "x", "q"), map.keyList());
        Assert.assertEquals(Integer.valueOf(20), map.get("a"));
        Assert.assertEquals(Integer.valueOf(4), map.get("x"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirstKeyOnEmptyMapThrowsNoSuchElementException() {
        new ListOrderedMap<String, Integer>().firstKey();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexedPutRejectsInvalidIndex() {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>();
        map.put(-1, "x", Integer.valueOf(1));
    }

    @Test
    public void testFactoryWrapsSuppliedMapAndRetainsItsOrder() {
        Map<String, Integer> backing = new LinkedHashMap<String, Integer>();
        backing.put("alpha", Integer.valueOf(1));
        backing.put("beta", Integer.valueOf(2));

        ListOrderedMap<String, Integer> map = ListOrderedMap.listOrderedMap(backing);
        map.put("gamma", Integer.valueOf(3));

        Assert.assertEquals(Arrays.asList("alpha", "beta", "gamma"), map.keyList());
        Assert.assertEquals(Integer.valueOf(3), backing.get("gamma"));
        Assert.assertEquals("alpha", map.firstKey());
    }
}
