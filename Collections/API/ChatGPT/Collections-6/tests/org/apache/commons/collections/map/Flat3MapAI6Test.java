package org.apache.commons.collections.map;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.ResettableIterator;
import org.junit.Assert;
import org.junit.Test;

public class Flat3MapAI6Test {

    @Test
    public void testPutGetUpdateAndNullMappings() {
        Flat3Map map = new Flat3Map();

        Assert.assertNull(map.put("one", Integer.valueOf(1)));
        Assert.assertNull(map.put(null, "null-key"));
        Assert.assertNull(map.put("null-value", null));
        Assert.assertEquals(3, map.size());

        Assert.assertEquals(Integer.valueOf(1), map.get("one"));
        Assert.assertEquals("null-key", map.get(null));
        Assert.assertNull(map.get("null-value"));
        Assert.assertTrue(map.containsKey(null));
        Assert.assertTrue(map.containsValue(null));

        Assert.assertEquals(Integer.valueOf(1), map.put("one", Integer.valueOf(10)));
        Assert.assertEquals(3, map.size());
        Assert.assertEquals(Integer.valueOf(10), map.get("one"));
    }

    @Test
    public void testRemoveFromFlatMapPreservesOtherEntries() {
        Flat3Map map = new Flat3Map();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");

        Assert.assertEquals("B", map.remove("b"));
        Assert.assertEquals(2, map.size());
        Assert.assertFalse(map.containsKey("b"));
        Assert.assertEquals("A", map.get("a"));
        Assert.assertEquals("C", map.get("c"));

        Assert.assertNull(map.remove("missing"));
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("A", map.remove("a"));
        Assert.assertEquals("C", map.remove("c"));
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testFourthEntryUsesMapSemanticsAndRetainsAllMappings() {
        Flat3Map map = new Flat3Map();
        Map expected = new HashMap();

        for (int i = 1; i <= 4; i++) {
            String key = "k" + i;
            Integer value = Integer.valueOf(i);
            map.put(key, value);
            expected.put(key, value);
        }

        Assert.assertEquals(4, map.size());
        Assert.assertEquals(expected, map);
        Assert.assertEquals(expected.hashCode(), map.hashCode());

        Assert.assertEquals(Integer.valueOf(2), map.remove("k2"));
        expected.remove("k2");
        Assert.assertEquals(expected, map);
        Assert.assertEquals(Integer.valueOf(4), map.get("k4"));
    }

    @Test
    public void testKeySetAndValuesViewsModifyMap() {
        Flat3Map map = new Flat3Map();
        map.put(null, "zero");
        map.put("one", "one-value");
        map.put("two", "two-value");

        Assert.assertTrue(map.keySet().remove(null));
        Assert.assertFalse(map.containsKey(null));
        Assert.assertEquals(2, map.size());

        Assert.assertTrue(map.values().remove("one-value"));
        Assert.assertFalse(map.containsKey("one"));
        Assert.assertEquals(1, map.size());
        Assert.assertTrue(map.values().contains("two-value"));

        map.values().clear();
        Assert.assertTrue(map.isEmpty());
        Assert.assertTrue(map.keySet().isEmpty());
    }

    @Test
    public void testMapIteratorSetValueRemoveAndReset() {
        Flat3Map map = new Flat3Map();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");

        MapIterator iterator = map.mapIterator();
        boolean changed = false;
        while (iterator.hasNext()) {
            Object key = iterator.next();
            if ("b".equals(key)) {
                Assert.assertEquals("B", iterator.getValue());
                Assert.assertEquals("B", iterator.setValue("changed"));
                Assert.assertEquals("changed", iterator.getValue());
                iterator.remove();
                changed = true;
                break;
            }
        }

        Assert.assertTrue(changed);
        Assert.assertFalse(map.containsKey("b"));
        Assert.assertEquals(2, map.size());

        ResettableIterator resettable = (ResettableIterator) iterator;
        resettable.reset();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        Assert.assertEquals(2, count);
    }

    @Test
    public void testEntrySetEntrySetValueUpdatesBackingMap() {
        Flat3Map map = new Flat3Map();
        map.put("first", "old");
        map.put("second", "other");

        Iterator iterator = map.entrySet().iterator();
        boolean updated = false;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if ("first".equals(entry.getKey())) {
                Assert.assertEquals("old", entry.setValue("new"));
                updated = true;
                break;
            }
        }

        Assert.assertTrue(updated);
        Assert.assertEquals("new", map.get("first"));
        Assert.assertTrue(map.entrySet().contains(new java.util.AbstractMap.SimpleEntry("first", "new")));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testEmptyMapIteratorNextThrowsNoSuchElementException() {
        Flat3Map map = new Flat3Map();
        map.mapIterator().next();
    }

    @Test
    public void testCloneIsIndependentForMappings() {
        Flat3Map original = new Flat3Map();
        original.put("a", "A");
        original.put("b", "B");
        original.put("c", "C");
        original.put("d", "D");

        Flat3Map copy = (Flat3Map) original.clone();
        Assert.assertEquals(original, copy);

        copy.put("a", "changed");
        copy.remove("d");

        Assert.assertEquals("A", original.get("a"));
        Assert.assertEquals("D", original.get("d"));
        Assert.assertEquals("changed", copy.get("a"));
        Assert.assertFalse(copy.containsKey("d"));
    }

    @Test
    public void testSerializationRoundTripRetainsNullAndDelegateEntries() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put(null, "null-key");
        map.put("a", null);
        map.put("b", Integer.valueOf(2));
        map.put("c", Integer.valueOf(3));

        Flat3Map restored = serializeAndRead(map);

        Assert.assertEquals(map, restored);
        Assert.assertEquals(4, restored.size());
        Assert.assertTrue(restored.containsKey(null));
        Assert.assertNull(restored.get("a"));
        Assert.assertEquals(Integer.valueOf(3), restored.get("c"));
    }

    @Test
    public void testEqualsHashCodeAndSelfReferenceToString() {
        Flat3Map map = new Flat3Map();
        map.put("a", Integer.valueOf(1));
        map.put(null, null);

        Map expected = new HashMap();
        expected.put("a", Integer.valueOf(1));
        expected.put(null, null);

        Assert.assertTrue(map.equals(expected));
        Assert.assertTrue(expected.equals(map));
        Assert.assertEquals(expected.hashCode(), map.hashCode());

        Flat3Map selfMap = new Flat3Map();
        selfMap.put("self", selfMap);
        Assert.assertEquals("{self=(this Map)}", selfMap.toString());
    }

    private Flat3Map serializeAndRead(Flat3Map map) throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ObjectOutputStream output = new ObjectOutputStream(bytes);
        output.writeObject(map);
        output.close();

        ObjectInputStream input = new ObjectInputStream(
                new ByteArrayInputStream(bytes.toByteArray()));
        Flat3Map result = (Flat3Map) input.readObject();
        input.close();
        return result;
    }
}
