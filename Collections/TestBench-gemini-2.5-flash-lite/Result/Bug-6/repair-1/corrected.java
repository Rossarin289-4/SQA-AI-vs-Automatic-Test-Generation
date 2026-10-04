package org.apache.commons.collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections.IterableMap;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.ResettableIterator;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.apache.commons.collections.iterators.EmptyMapIterator;

public class Flat3MapTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmptyMap() {
        Flat3Map map = new Flat3Map();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testPutAndGetOneEntry() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        assertEquals(1, map.size());
        assertFalse(map.isEmpty());
        assertEquals("value1", map.get("key1"));
    }

    @Test
    public void testPutAndGetTwoEntries() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testPutAndGetThreeEntries() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals(3, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get("key3"));
    }

    @Test
    public void testPutAndGetFourEntriesTriggersDelegate() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // This should trigger conversion to delegateMap
        assertEquals(4, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get("key3"));
        assertEquals("value4", map.get("key4"));
    }

    @Test
    public void testPutNullKeyAndValue() {
        Flat3Map map = new Flat3Map();
        map.put(null, null);
        assertEquals(1, map.size());
        assertNull(map.get(null)); // get(null) on an empty map returns null
        assertTrue(map.containsKey(null));
        assertTrue(map.containsValue(null));
    }

    @Test
    public void testPutNullKeyAndValueWithExistingEntries() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put(null, null);
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
        assertNull(map.get(null));
        assertTrue(map.containsKey(null));
        assertTrue(map.containsValue(null));
    }

    @Test
    public void testPutExistingKeyUpdatesValue() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        Object oldValue = map.put("key1", "newValue1");
        assertEquals(1, map.size());
        assertEquals("value1", oldValue);
        assertEquals("newValue1", map.get("key1"));
    }
    
    @Test
    public void testPutExistingKeyUpdatesValueInDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        Object oldValue = map.put("key1", "newValue1");
        assertEquals(4, map.size());
        assertEquals("value1", oldValue);
        assertEquals("newValue1", map.get("key1"));
    }

    @Test
    public void testRemoveFromEmptyMap() {
        Flat3Map map = new Flat3Map();
        assertNull(map.remove("key1"));
        assertEquals(0, map.size());
    }

    @Test
    public void testRemoveExistingKey() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals("value1", map.remove("key1"));
        assertEquals(1, map.size());
        assertFalse(map.containsKey("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testRemoveNonExistingKey() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        assertNull(map.remove("key2"));
        assertEquals(1, map.size());
        assertEquals("value1", map.get("key1"));
    }

    @Test
    public void testRemoveLastKey() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        assertEquals("value1", map.remove("key1"));
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testRemoveWithNullKey() {
        Flat3Map map = new Flat3Map();
        map.put(null, "nullValue");
        map.put("key1", "value1");
        assertEquals("nullValue", map.remove(null));
        assertEquals(1, map.size());
        assertFalse(map.containsKey(null));
        assertEquals("value1", map.get("key1"));
    }

    @Test
    public void testRemoveAndShiftKeys() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals("value1", map.remove("key1")); // Should shift key2 and key3
        assertEquals(2, map.size());
        assertFalse(map.containsKey("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get("key3"));
    }

    @Test
    public void testRemoveAndShiftKeysFromMiddle() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals("value2", map.remove("key2")); // Should shift key3
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
        assertFalse(map.containsKey("key2"));
        assertEquals("value3", map.get("key3"));
    }

    @Test
    public void testClearMap() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertFalse(map.containsKey("key1"));
        assertFalse(map.containsKey("key2"));
    }

    @Test
    public void testClearMapInDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertFalse(map.containsKey("key1"));
    }
    
    @Test
    public void testPutAllEmptyMap() {
        Flat3Map map = new Flat3Map();
        Map<String, String> otherMap = new java.util.HashMap<>();
        map.putAll(otherMap);
        assertEquals(0, map.size());
    }

    @Test
    public void testPutAllThreeEntries() {
        Flat3Map map = new Flat3Map();
        Map<String, String> otherMap = new java.util.HashMap<>();
        otherMap.put("key1", "value1");
        otherMap.put("key2", "value2");
        otherMap.put("key3", "value3");
        map.putAll(otherMap);
        assertEquals(3, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get("key3"));
    }
    
    @Test
    public void testPutAllTriggersDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        Map<String, String> otherMap = new java.util.HashMap<>();
        otherMap.put("key2", "value2");
        otherMap.put("key3", "value3");
        otherMap.put("key4", "value4");
        map.putAll(otherMap);
        assertEquals(4, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get("key3"));
        assertEquals("value4", map.get("key4"));
    }
    
    @Test
    public void testPutAllIntoDelegateModeMap() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        Map<String, String> otherMap = new java.util.HashMap<>();
        otherMap.put("key5", "value5");
        otherMap.put("key6", "value6");
        map.putAll(otherMap);
        assertEquals(6, map.size());
        assertEquals("value5", map.get("key5"));
        assertEquals("value6", map.get("key6"));
    }

    @Test
    public void testMapIteratorEmpty() {
        Flat3Map map = new Flat3Map();
        MapIterator it = map.mapIterator();
        assertFalse(it.hasNext());
        // Accessing next() or getKey() on empty iterator should throw exception
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {}
        try {
            it.getKey();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {}
        try {
            it.getValue();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {}
        try {
            it.remove();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {}
        try {
            it.setValue("test");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {}
    }

    @Test
    public void testMapIteratorOneEntry() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        MapIterator it = map.mapIterator();
        assertTrue(it.hasNext());
        assertEquals("key1", it.next());
        assertEquals("key1", it.getKey());
        assertEquals("value1", it.getValue());
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIteratorThreeEntries() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        MapIterator it = map.mapIterator();
        assertTrue(it.hasNext());
        Object key1 = it.next();
        assertEquals("key3", key1); // Iterator goes in reverse order for flat mode
        assertEquals("key3", it.getKey());
        assertEquals("value3", it.getValue());

        assertTrue(it.hasNext());
        Object key2 = it.next();
        assertEquals("key2", key2);
        assertEquals("key2", it.getKey());
        assertEquals("value2", it.getValue());

        assertTrue(it.hasNext());
        Object key3 = it.next();
        assertEquals("key1", key3);
        assertEquals("key1", it.getKey());
        assertEquals("value1", it.getValue());
        assertFalse(it.hasNext());
    }
    
    @Test
    public void testMapIteratorDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        MapIterator it = map.mapIterator();
        // The order in delegate mode is not guaranteed to be reverse of insertion
        // but it should iterate all elements.
        int count = 0;
        while(it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    @Test
    public void testMapIteratorRemove() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        MapIterator it = map.mapIterator();
        it.next(); // key3
        it.next(); // key2
        assertEquals("key2", it.getKey());
        it.remove();
        assertEquals(2, map.size());
        assertFalse(map.containsKey("key2"));
        assertEquals("value3", map.get("key3"));
        assertEquals("value1", map.get("key1"));
    }

    @Test
    public void testMapIteratorRemoveLastElement() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        MapIterator it = map.mapIterator();
        it.next();
        it.remove();
        assertEquals(0, map.size());
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIteratorRemoveAndThenNext() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        MapIterator it = map.mapIterator();
        it.next(); // key3
        it.remove(); // remove key3
        assertTrue(it.hasNext());
        assertEquals("key2", it.next()); // should be key2 now
        assertEquals("key2", it.getKey());
        assertEquals("value2", it.getValue());
    }
    
    @Test
    public void testMapIteratorSet() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        MapIterator it = map.mapIterator();
        it.next(); // key3
        Object oldValue = it.setValue("newValue3");
        assertEquals("value3", oldValue);
        assertEquals("newValue3", map.get("key3"));
        assertEquals(3, map.size());
    }

    @Test
    public void testMapIteratorSetInDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        MapIterator it = map.mapIterator();
        // Find an element to set its value
        while(it.hasNext()) {
            if ("key2".equals(it.next())) {
                Object oldValue = it.setValue("newValue2");
                assertEquals("value2", oldValue);
                assertEquals("newValue2", map.get("key2"));
                break;
            }
        }
        assertEquals(4, map.size());
    }

    @Test
    public void testMapIteratorReset() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        MapIterator it = map.mapIterator();
        it.next(); // key3
        it.next(); // key2
        assertEquals("key2", it.getKey());
        // The ResettableIterator interface has the reset method,
        // but MapIterator does not directly expose it.
        // However, FlatMapIterator implements ResettableIterator.
        // We need to cast to access it.
        if (it instanceof ResettableIterator) {
            ((ResettableIterator) it).reset();
        }
        assertTrue(it.hasNext());
        assertEquals("key3", it.next()); // Should be back to the first element
        assertEquals("key3", it.getKey());
    }

    @Test
    public void testEntrySetEmpty() {
        Flat3Map map = new Flat3Map();
        Set<Map.Entry> entrySet = map.entrySet();
        assertEquals(0, entrySet.size());
        assertFalse(entrySet.iterator().hasNext());
        assertFalse(entrySet.remove(null));
    }

    @Test
    public void testEntrySetOneEntry() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        Set<Map.Entry> entrySet = map.entrySet();
        assertEquals(1, entrySet.size());
        Iterator<Map.Entry> it = entrySet.iterator();
        assertTrue(it.hasNext());
        Map.Entry entry = it.next();
        assertEquals("key1", entry.getKey());
        assertEquals("value1", entry.getValue());
        assertFalse(it.hasNext());
    }

    @Test
    public void testEntrySetRemove() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Set<Map.Entry> entrySet = map.entrySet();
        Iterator<Map.Entry> it = entrySet.iterator();
        Map.Entry entryToRemove = null;
        while (it.hasNext()) {
            Map.Entry currentEntry = it.next();
            if ("key1".equals(currentEntry.getKey())) {
                entryToRemove = currentEntry;
                break;
            }
        }
        assertNotNull(entryToRemove);
        assertTrue(entrySet.remove(entryToRemove));
        assertEquals(1, map.size());
        assertFalse(map.containsKey("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testEntrySetIteratorSetValue() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Set<Map.Entry> entrySet = map.entrySet();
        Iterator<Map.Entry> it = entrySet.iterator();
        Map.Entry entryToModify = null;
        while (it.hasNext()) {
            Map.Entry currentEntry = it.next();
            if ("key1".equals(currentEntry.getKey())) {
                entryToModify = currentEntry;
                break;
            }
        }
        assertNotNull(entryToModify);
        Object oldValue = entryToModify.setValue("newValue1");
        assertEquals("value1", oldValue);
        assertEquals("newValue1", map.get("key1"));
        assertEquals(2, map.size());
    }

    @Test
    public void testKeySetEmpty() {
        Flat3Map map = new Flat3Map();
        Set<Object> keySet = map.keySet();
        assertEquals(0, keySet.size());
        assertFalse(keySet.iterator().hasNext());
    }

    @Test
    public void testKeySetOneEntry() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        Set<Object> keySet = map.keySet();
        assertEquals(1, keySet.size());
        assertTrue(keySet.contains("key1"));
        assertFalse(keySet.contains("key2"));
    }

    @Test
    public void testKeySetRemove() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Set<Object> keySet = map.keySet();
        assertTrue(keySet.remove("key1"));
        assertEquals(1, map.size());
        assertFalse(map.containsKey("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testValuesEmpty() {
        Flat3Map map = new Flat3Map();
        Collection<Object> values = map.values();
        assertEquals(0, values.size());
        assertFalse(values.iterator().hasNext());
    }

    @Test
    public void testValuesOneEntry() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        Collection<Object> values = map.values();
        assertEquals(1, values.size());
        assertTrue(values.contains("value1"));
        assertFalse(values.contains("value2"));
    }

    @Test
    public void testValuesRemove() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Collection<Object> values = map.values();
        assertTrue(values.remove("value1"));
        assertEquals(1, map.size());
        assertFalse(map.containsKey("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testEqualsSameObject() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        assertTrue(map.equals(map));
    }

    @Test
    public void testEqualsEmptyMaps() {
        Flat3Map map1 = new Flat3Map();
        Flat3Map map2 = new Flat3Map();
        assertTrue(map1.equals(map2));
    }

    @Test
    public void testEqualsEqualMaps() {
        Flat3Map map1 = new Flat3Map();
        map1.put("key1", "value1");
        map1.put("key2", "value2");

        Flat3Map map2 = new Flat3Map();
        map2.put("key1", "value1");
        map2.put("key2", "value2");
        assertTrue(map1.equals(map2));
    }
    
    @Test
    public void testEqualsEqualMapsDelegateMode() {
        Flat3Map map1 = new Flat3Map();
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");
        map1.put("key4", "value4");

        Flat3Map map2 = new Flat3Map();
        map2.put("key1", "value1");
        map2.put("key2", "value2");
        map2.put("key3", "value3");
        map2.put("key4", "value4");
        assertTrue(map1.equals(map2));
    }

    @Test
    public void testEqualsDifferentSize() {
        Flat3Map map1 = new Flat3Map();
        map1.put("key1", "value1");
        Flat3Map map2 = new Flat3Map();
        map2.put("key1", "value1");
        map2.put("key2", "value2");
        assertFalse(map1.equals(map2));
    }

    @Test
    public void testEqualsDifferentKeysOrValues() {
        Flat3Map map1 = new Flat3Map();
        map1.put("key1", "value1");
        map1.put("key2", "value2");

        Flat3Map map2 = new Flat3Map();
        map2.put("key1", "value1");
        map2.put("key2", "newValue2");
        assertFalse(map1.equals(map2));
    }

    @Test
    public void testHashCodeEmpty() {
        Flat3Map map = new Flat3Map();
        assertEquals(0, map.hashCode());
    }

    @Test
    public void testHashCodeOneEntry() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        assertEquals("key1".hashCode() ^ "value1".hashCode(), map.hashCode());
    }

    @Test
    public void testHashCodeThreeEntries() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        int expectedHash = ("key3".hashCode() ^ "value3".hashCode()) +
                           ("key2".hashCode() ^ "value2".hashCode()) +
                           ("key1".hashCode() ^ "value1".hashCode());
        assertEquals(expectedHash, map.hashCode());
    }
    
    @Test
    public void testHashCodeDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        assertEquals(new java.util.HashMap<>(map).hashCode(), map.hashCode());
    }

    @Test
    public void testToStringEmpty() {
        Flat3Map map = new Flat3Map();
        assertEquals("{}", map.toString());
    }

    @Test
    public void testToStringOneEntry() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        assertEquals("{key1=value1}", map.toString());
    }

    @Test
    public void testToStringThreeEntries() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        // Order in toString for flat mode is key3, key2, key1
        assertEquals("{key3=value3,key2=value2,key1=value1}", map.toString());
    }
    
    @Test
    public void testToStringDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        // For delegate mode, toString delegates to HashMap, order may vary
        String mapString = map.toString();
        assertTrue(mapString.contains("key1=value1"));
        assertTrue(mapString.contains("key2=value2"));
        assertTrue(mapString.contains("key3=value3"));
        assertTrue(mapString.contains("key4=value4"));
        assertTrue(mapString.startsWith("{"));
        assertTrue(mapString.endsWith("}"));
    }

    @Test
    public void testCloneShallow() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        Flat3Map clonedMap = (Flat3Map) map.clone();

        assertEquals(map.size(), clonedMap.size());
        assertEquals(map.get("key1"), clonedMap.get("key1"));
        assertEquals(map.get("key2"), clonedMap.get("key2"));
        assertEquals(map.get("key3"), clonedMap.get("key3"));

        // Verify it's a shallow copy
        assertTrue(map != clonedMap);
        // Accessing delegateMap directly is not allowed due to it being private.
        // We test the behavior indirectly. If cloning was correct,
        // delegateMap should be null if it was null in the original and
        // delegateMap should be a clone if it was non-null in the original.

        // Modify original, check clone is unaffected
        map.put("key1", "newValue1");
        assertEquals("newValue1", map.get("key1"));
        assertEquals("value1", clonedMap.get("key1"));
    }
    
    @Test
    public void testCloneShallowDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        
        Flat3Map clonedMap = (Flat3Map) map.clone();

        assertEquals(map.size(), clonedMap.size());
        assertEquals(map.get("key1"), clonedMap.get("key1"));
        assertEquals(map.get("key4"), clonedMap.get("key4"));
        // Accessing delegateMap directly is not allowed due to it being private.
        // We test the behavior indirectly. If cloning was correct,
        // delegateMap should be a clone if it was non-null in the original.

        // Verify it's a shallow copy
        assertTrue(map != clonedMap);
        // The cloned map's delegate map should be a separate instance from the original's.
        // We can't directly compare them as delegateMap is private.

        // Modify original, check clone is unaffected
        map.put("key1", "newValue1");
        assertEquals("newValue1", map.get("key1"));
        assertEquals("value1", clonedMap.get("key1"));
    }

    // Example test for a null key with multiple entries
    @Test
    public void testGetNullKeyWithEntries() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put(null, "nullValue");
        map.put("key2", "value2");
        assertEquals("nullValue", map.get(null));
        assertEquals(3, map.size());
    }

    // Example test for null value
    @Test
    public void testPutNullValue() {
        Flat3Map map = new Flat3Map();
        map.put("key1", null);
        assertEquals(1, map.size());
        assertNull(map.get("key1"));
        assertTrue(map.containsKey("key1"));
        assertTrue(map.containsValue(null));
    }

    // Example test for a case where remove might shift elements in delegate mode
    @Test
    public void testRemoveInDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4"); // Triggers delegate mode
        assertEquals("key2", map.remove("key2"));
        assertEquals(3, map.size());
        assertFalse(map.containsKey("key2"));
        assertEquals("value1", map.get("key1"));
        assertEquals("value3", map.get("key3"));
        assertEquals("value4", map.get("key4"));
    }

    // Test case for containsKey with null
    @Test
    public void testContainsKeyNull() {
        Flat3Map map = new Flat3Map();
        assertFalse(map.containsKey(null));
        map.put(null, "value");
        assertTrue(map.containsKey(null));
        assertEquals(1, map.size());
    }

    // Test case for containsValue with null
    @Test
    public void testContainsValueNull() {
        Flat3Map map = new Flat3Map();
        assertFalse(map.containsValue(null));
        map.put("key", null);
        assertTrue(map.containsValue(null));
        assertEquals(1, map.size());
    }
}
