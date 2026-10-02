package org.apache.commons.collections.map;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.MapIterator;
import org.junit.Assert;
import org.junit.Test;

public class Flat3MapAI1Test {

    @Test
    public void testNewMapIsEmptyAndHasNoMappings() {
        Flat3Map map = new Flat3Map();

        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.get("missing"));
        Assert.assertFalse(map.containsKey("missing"));
        Assert.assertFalse(map.containsValue("missing"));
        Assert.assertEquals("{}", map.toString());
    }

    @Test
    public void testPutReplacementAndNullKeyAndValue() {
        Flat3Map map = new Flat3Map();

        Assert.assertNull(map.put(null, "first"));
        Assert.assertNull(map.put("key", null));
        Assert.assertEquals("first", map.put(null, "replaced"));

        Assert.assertEquals(2, map.size());
        Assert.assertTrue(map.containsKey(null));
        Assert.assertTrue(map.containsKey("key"));
        Assert.assertEquals("replaced", map.get(null));
        Assert.assertNull(map.get("key"));
        Assert.assertTrue(map.containsValue(null));
        Assert.assertTrue(map.containsValue("replaced"));
    }

    @Test
    public void testEqualButDistinctKeysAccessSameMapping() {
        Flat3Map map = new Flat3Map();
        EqualKey stored = new EqualKey("id");
        EqualKey lookup = new EqualKey("id");

        Assert.assertNull(map.put(stored, "value"));
        Assert.assertEquals("value", map.get(lookup));
        Assert.assertTrue(map.containsKey(lookup));
        Assert.assertEquals("value", map.put(lookup, "newValue"));

        Assert.assertEquals(1, map.size());
        Assert.assertEquals("newValue", map.get(stored));
    }

    @Test
    public void testRemovingMiddleFlatEntryKeepsOtherEntries() {
        Flat3Map map = new Flat3Map();
        map.put("first", "one");
        map.put("second", "two");
        map.put("third", "three");

        map.remove("second");

        Assert.assertEquals(2, map.size());
        Assert.assertFalse(map.containsKey("second"));
        Assert.assertEquals("one", map.get("first"));
        Assert.assertEquals("three", map.get("third"));
        Assert.assertNull(map.remove("not-present"));
    }

    @Test
    public void testPutAllWithFourEntriesRetainsAllMappings() {
        Map source = new HashMap();
        source.put("one", Integer.valueOf(1));
        source.put("two", Integer.valueOf(2));
        source.put("three", Integer.valueOf(3));
        source.put("four", Integer.valueOf(4));

        Flat3Map map = new Flat3Map();
        map.putAll(source);

        Assert.assertEquals(4, map.size());
        Assert.assertEquals(Integer.valueOf(1), map.get("one"));
        Assert.assertEquals(Integer.valueOf(2), map.get("two"));
        Assert.assertEquals(Integer.valueOf(3), map.get("three"));
        Assert.assertEquals(Integer.valueOf(4), map.get("four"));

        Assert.assertEquals(Integer.valueOf(2), map.put("two", Integer.valueOf(20)));
        Assert.assertEquals(Integer.valueOf(20), map.get("two"));
        Assert.assertEquals(4, map.size());
    }

    @Test
    public void testMapIteratorCanUpdateAndRemoveMappings() {
        Flat3Map map = new Flat3Map();
        map.put("a", "one");
        map.put("b", "two");
        map.put("c", "three");

        MapIterator iterator = map.mapIterator();
        boolean changed = false;
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Assert.assertEquals(key, iterator.getKey());
            if ("b".equals(key)) {
                Assert.assertEquals("two", iterator.setValue("updated"));
                iterator.remove();
                changed = true;
            }
        }

        Assert.assertTrue(changed);
        Assert.assertEquals(2, map.size());
        Assert.assertFalse(map.containsKey("b"));
        Assert.assertEquals("one", map.get("a"));
        Assert.assertEquals("three", map.get("c"));
    }

    @Test
    public void testCollectionViewsModifyBackingMap() {
        Flat3Map map = new Flat3Map();
        map.put("a", "one");
        map.put("b", "two");
        map.put("c", "three");

        Assert.assertTrue(map.keySet().remove("a"));
        Assert.assertFalse(map.containsKey("a"));

        Assert.assertTrue(map.values().remove("two"));
        Assert.assertFalse(map.containsKey("b"));
        Assert.assertEquals(1, map.size());

        Iterator entries = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) entries.next();
        Assert.assertEquals("c", entry.getKey());
        Assert.assertEquals("three", entry.setValue("changed"));
        Assert.assertEquals("changed", map.get("c"));
    }

    @Test
    public void testCloneIsIndependentAndMapEqualityMatchesHashMap() {
        Flat3Map map = new Flat3Map();
        map.put("a", "one");
        map.put("b", null);
        map.put(null, "null-key");

        Flat3Map clone = (Flat3Map) map.clone();
        clone.put("a", "changed");
        clone.remove("b");

        Map expected = new HashMap();
        expected.put("a", "one");
        expected.put("b", null);
        expected.put(null, "null-key");

        Assert.assertEquals(expected, map);
        Assert.assertEquals(expected.hashCode(), map.hashCode());
        Assert.assertEquals("one", map.get("a"));
        Assert.assertTrue(map.containsKey("b"));
        Assert.assertEquals("changed", clone.get("a"));
        Assert.assertFalse(clone.containsKey("b"));
    }

    @Test
    public void testSerializationPreservesFlatAndDelegateSizedMappings() throws Exception {
        Flat3Map original = new Flat3Map();
        original.put("one", Integer.valueOf(1));
        original.put("two", Integer.valueOf(2));
        original.put("three", Integer.valueOf(3));
        original.put("four", Integer.valueOf(4));

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ObjectOutputStream output = new ObjectOutputStream(bytes);
        output.writeObject(original);
        output.close();

        ObjectInputStream input = new ObjectInputStream(
                new ByteArrayInputStream(bytes.toByteArray()));
        Flat3Map restored = (Flat3Map) input.readObject();
        input.close();

        Assert.assertEquals(original, restored);
        Assert.assertEquals(4, restored.size());
        Assert.assertEquals(Integer.valueOf(1), restored.get("one"));
        Assert.assertEquals(Integer.valueOf(4), restored.get("four"));
    }

    @Test
    public void testClearEmptiesMapAndViewsAfterGrowth() {
        Flat3Map map = new Flat3Map();
        map.put("a", "one");
        map.put("b", "two");
        map.put("c", "three");
        map.put("d", "four");

        map.clear();

        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
        Assert.assertTrue(map.keySet().isEmpty());
        Assert.assertTrue(map.values().isEmpty());
        Assert.assertTrue(map.entrySet().isEmpty());

        Assert.assertNull(map.put("new", "value"));
        Assert.assertEquals("value", map.get("new"));
    }

    private static final class EqualKey {
        private final String value;

        private EqualKey(String value) {
            this.value = value;
        }

        public int hashCode() {
            return value.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof EqualKey)) {
                return false;
            }
            return value.equals(((EqualKey) obj).value);
        }
    }
}
