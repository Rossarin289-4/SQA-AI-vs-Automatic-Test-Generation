package org.apache.commons.collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

public class CaseInsensitiveMapTest {

    @Test
    public void testDefaultConstructor() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testInitialCapacityConstructor() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap(10);
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }
    
    @Test
    public void testInitialCapacityAndLoadFactorConstructor() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap(10, 0.5f);
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testMapConstructor() throws Exception {
        Map<String, String> initialMap = new java.util.HashMap<>();
        initialMap.put("Key1", "Value1");
        initialMap.put("KEY2", "Value2");
        CaseInsensitiveMap map = new CaseInsensitiveMap(initialMap);
        assertEquals(2, map.size());
        assertEquals("Value1", map.get("key1"));
        assertEquals("Value1", map.get("Key1"));
        assertEquals("Value2", map.get("key2"));
        assertEquals("Value2", map.get("KEY2"));
    }

    @Test
    public void testPutAndGet() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("One", "1");
        assertEquals("1", map.get("One"));
        assertEquals("1", map.get("one"));
        assertEquals("1", map.get("ONE"));
    }
    
    @Test
    public void testPutNullKey() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put(null, "NullValue");
        assertEquals("NullValue", map.get(null));
        assertEquals(1, map.size());
    }

    @Test
    public void testPutAndGetDifferentCase() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("CASE", "CaseValue");
        assertEquals("CaseValue", map.get("case"));
        assertEquals("CaseValue", map.get("CASE"));
        assertEquals("CaseValue", map.get("Case"));
    }

    @Test
    public void testPutOverride() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key", "Value1");
        map.put("key", "Value2");
        assertEquals("Value2", map.get("Key"));
        assertEquals(1, map.size());
    }

    @Test
    public void testPutAll() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Map<String, String> otherMap = new java.util.HashMap<>();
        otherMap.put("A", "Alpha");
        otherMap.put("b", "Beta");
        map.putAll(otherMap);
        assertEquals("Alpha", map.get("a"));
        assertEquals("Beta", map.get("B"));
        assertEquals(2, map.size());
    }
    
    @Test
    public void testRemove() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("RemoveMe", "Value");
        assertEquals(1, map.size());
        Object value = map.remove("removeme");
        assertEquals("Value", value);
        assertEquals(0, map.size());
        assertNull(map.get("RemoveMe"));
    }

    @Test
    public void testRemoveNonExistent() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key", "Value");
        Object value = map.remove("NonExistent");
        assertNull(value);
        assertEquals(1, map.size());
    }

    @Test
    public void testClear() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertNull(map.get("Key1"));
    }
    
    @Test
    public void testContainsKey() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("TestKey", "Value");
        assertTrue(map.containsKey("testkey"));
        assertTrue(map.containsKey("TestKey"));
        assertFalse(map.containsKey("OtherKey"));
    }

    @Test
    public void testContainsKeyNull() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put(null, "NullValue");
        assertTrue(map.containsKey(null));
        assertFalse(map.containsKey("NullKey"));
    }

    @Test
    public void testContainsValue() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        assertTrue(map.containsValue("Value1"));
        assertTrue(map.containsValue("Value2"));
        assertFalse(map.containsValue("OtherValue"));
    }

    @Test
    public void testSize() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        assertEquals(0, map.size());
        map.put("Key1", "Value1");
        assertEquals(1, map.size());
        map.put("Key2", "Value2");
        assertEquals(2, map.size());
        map.put("key1", "NewValue1"); // Override
        assertEquals(2, map.size());
    }

    @Test
    public void testIsEmpty() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        assertTrue(map.isEmpty());
        map.put("Key", "Value");
        assertFalse(map.isEmpty());
        map.remove("Key");
        assertTrue(map.isEmpty());
    }
    
    @Test
    public void testConvertKeyToLowerCase() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        // The convertKey method is protected, so we can't call it directly.
        // We rely on put and get to exercise convertKey indirectly.
        map.put("UPPER", "Value");
        assertEquals("Value", map.get("upper"));
    }

    @Test
    public void testConvertKeyWithMixedCase() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("MiXeD", "Value");
        assertEquals("Value", map.get("mixed"));
    }

    @Test
    public void testConvertKeyWithNonAlphabetic() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key123!", "Value");
        assertEquals("Value", map.get("key123!"));
    }

    @Test
    public void testClone() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key", "Value");
        CaseInsensitiveMap clonedMap = (CaseInsensitiveMap) map.clone();
        assertEquals(map.size(), clonedMap.size());
        assertEquals(map.get("Key"), clonedMap.get("Key"));
        // Ensure it's a shallow clone
        assertNotSame(map, clonedMap);
        // Modify original and check clone
        map.put("AnotherKey", "AnotherValue");
        assertEquals(2, map.size());
        assertEquals(1, clonedMap.size());
    }

    @Test
    public void testHashCode() throws Exception {
        CaseInsensitiveMap map1 = new CaseInsensitiveMap();
        map1.put("A", "1");
        map1.put("b", "2");

        CaseInsensitiveMap map2 = new CaseInsensitiveMap();
        map2.put("a", "1");
        map2.put("B", "2");

        assertEquals(map1.hashCode(), map2.hashCode());

        CaseInsensitiveMap map3 = new CaseInsensitiveMap();
        map3.put("A", "1");
        map3.put("b", "3"); // Different value
        assertNotEquals(map1.hashCode(), map3.hashCode());
    }
    
    @Test
    public void testEquals() throws Exception {
        CaseInsensitiveMap map1 = new CaseInsensitiveMap();
        map1.put("A", "1");
        map1.put("b", "2");

        CaseInsensitiveMap map2 = new CaseInsensitiveMap();
        map2.put("a", "1");
        map2.put("B", "2");

        assertTrue(map1.equals(map2));
        assertTrue(map2.equals(map1));

        CaseInsensitiveMap map3 = new CaseInsensitiveMap();
        map3.put("A", "1");
        map3.put("b", "3"); // Different value
        assertFalse(map1.equals(map3));

        CaseInsensitiveMap map4 = new CaseInsensitiveMap();
        map4.put("A", "1");
        map4.put("b", "2");
        map4.put("C", "3"); // Extra entry
        assertFalse(map1.equals(map4));
        
        // Test with null
        assertFalse(map1.equals(null));
        
        // Test with a different map type
        Map<String, String> hashMap = new java.util.HashMap<>();
        hashMap.put("A", "1");
        hashMap.put("b", "2");
        assertFalse(map1.equals(hashMap));
    }

     @Test
    public void testSerializable() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Test", "Value");
        map.put(null, "NullValue");
        
        // Custom serialization for CaseInsensitiveMap
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CaseInsensitiveMap deserializedMap = (CaseInsensitiveMap) ois.readObject();
        ois.close();

        assertEquals(map.size(), deserializedMap.size());
        assertEquals(map.get("Test"), deserializedMap.get("Test"));
        assertEquals(map.get(null), deserializedMap.get(null));
        
        // Ensure it's a new instance
        assertNotSame(map, deserializedMap);
    }

    @Test
    public void testPutNonStringKey() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Integer key = Integer.valueOf(123);
        String value = "IntValue";
        map.put(key, value);
        // convertKey uses toString(), so it should be "123" case-insensitively
        assertEquals(value, map.get(Integer.valueOf(123)));
        assertEquals(value, map.get("123"));
        assertEquals(1, map.size());
    }

    @Test
    public void testPutObjectToString() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Object key = new Object() {
            @Override
            public String toString() {
                return "CustomKey";
            }
        };
        String value = "CustomValue";
        map.put(key, value);
        assertEquals(value, map.get("customkey"));
        assertEquals(value, map.get("CustomKey"));
        assertEquals(1, map.size());
    }

     @Test
    public void testPutNonStringKeyOverride() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("1", "StringValue"); // This key becomes "1" internally
        Integer intKey = Integer.valueOf(1); // This also becomes "1" internally
        map.put(intKey, "IntValue");
        
        assertEquals("IntValue", map.get("1"));
        assertEquals("IntValue", map.get(Integer.valueOf(1)));
        assertEquals(1, map.size()); // Should override the "1" entry.
    }
}
