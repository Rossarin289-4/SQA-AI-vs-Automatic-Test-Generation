package org.apache.commons.collections.map;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CaseInsensitiveMapAI14Test {

    @Test
    public void testBasicPutAndGetWithCaseInsensitivity() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key", "Value1");
        map.put("KEY", "Value2");

        Assert.assertEquals(1, map.size());
        Assert.assertEquals("Value2", map.get("key"));
        Assert.assertEquals("Value2", map.get("KEY"));
        Assert.assertEquals("Value2", map.get("Key"));
        Assert.assertTrue(map.containsKey("kEy"));
    }

    @Test
    public void testNullKeyHandling() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Assert.assertNull(map.put(null, "NullValue"));
        Assert.assertEquals(1, map.size());
        Assert.assertTrue(map.containsKey(null));
        Assert.assertEquals("NullValue", map.get(null));

        Object removed = map.remove(null);
        Assert.assertEquals("NullValue", removed);
        Assert.assertFalse(map.containsKey(null));
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void testRemoveCaseInsensitive() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("TestKey", "val");

        Assert.assertTrue(map.containsKey("testkey"));
        Object removed = map.remove("TESTKEY");
        Assert.assertEquals("val", removed);
        Assert.assertFalse(map.containsKey("TestKey"));
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void testKeySetContainsLowerCaseKeys() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("One", "1");
        map.put("TWO", "2");
        map.put(null, "3");

        Set keys = map.keySet();
        Assert.assertEquals(3, keys.size());
        Assert.assertTrue(keys.contains("one"));
        Assert.assertTrue(keys.contains("two"));
        Assert.assertTrue(keys.contains(null));
        Assert.assertFalse(keys.contains("One"));
        Assert.assertFalse(keys.contains("TWO"));
    }

    @Test
    public void testMapConstructorCollapsesCaseDuplicates() {
        Map source = new HashMap();
        source.put("hello", "val1");
        source.put("HELLO", "val2");
        source.put("world", "val3");

        CaseInsensitiveMap map = new CaseInsensitiveMap(source);
        Assert.assertEquals(2, map.size());
        Assert.assertTrue(map.containsKey("Hello"));
        Assert.assertTrue(map.containsKey("WORLD"));
        Assert.assertEquals("val3", map.get("World"));
    }

    @Test(expected = NullPointerException.class)
    public void testMapConstructorWithNullMapThrowsNPE() {
        new CaseInsensitiveMap((Map) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidCapacity() {
        new CaseInsensitiveMap(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidLoadFactor() {
        new CaseInsensitiveMap(16, -0.5f);
    }

    @Test
    public void testNonStringKeyHandling() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Integer intKey = Integer.valueOf(12345);
        map.put(intKey, "NumericValue");

        Assert.assertEquals("NumericValue", map.get(intKey));
        Assert.assertEquals("NumericValue", map.get("12345"));
        Assert.assertTrue(map.containsKey("12345"));
    }

    @Test
    public void testClone() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key", "Value");
        map.put(null, "NullValue");

        CaseInsensitiveMap cloned = (CaseInsensitiveMap) map.clone();
        Assert.assertEquals(map.size(), cloned.size());
        Assert.assertEquals("Value", cloned.get("KEY"));
        Assert.assertEquals("NullValue", cloned.get(null));

        cloned.put("key", "NewValue");
        Assert.assertEquals("Value", map.get("Key"));
        Assert.assertEquals("NewValue", cloned.get("Key"));
    }

    @Test
    public void testSerialization() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("SerializationKey", "SerializationVal");
        map.put(null, "NullVal");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CaseInsensitiveMap deserialized = (CaseInsensitiveMap) ois.readObject();
        ois.close();

        Assert.assertEquals(2, deserialized.size());
        Assert.assertEquals("SerializationVal", deserialized.get("SERIALIZATIONKEY"));
        Assert.assertEquals("NullVal", deserialized.get(null));
        Assert.assertTrue(deserialized.containsKey("serializationkey"));
        Assert.assertTrue(deserialized.containsKey(null));
    }
}
