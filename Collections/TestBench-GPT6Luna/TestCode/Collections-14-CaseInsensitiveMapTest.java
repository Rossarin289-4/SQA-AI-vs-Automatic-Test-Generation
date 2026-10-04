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
    public void testCloneRetainsEntries() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("Alpha", "one");
        original.put(null, "nil");

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        assertEquals(2, copy.size());
        assertEquals("one", copy.get("ALPHA"));
        assertEquals("nil", copy.get(null));
    }

    @Test
    public void testCloneIsIndependentWhenCloneChanges() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("Key", "old");

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();
        copy.put("KEY", "new");

        assertEquals("old", original.get("key"));
        assertEquals("new", copy.get("key"));
        assertEquals(1, original.size());
        assertEquals(1, copy.size());
    }

    @Test
    public void testCloneIsIndependentWhenOriginalChanges() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("Key", "value");

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();
        original.remove("KEY");

        assertEquals("value", copy.get("key"));
        assertEquals(0, original.size());
        assertEquals(1, copy.size());
    }

    @Test
    public void testCloneOfEmptyMapIsEmpty() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        assertEquals(0, copy.size());
        assertTrue(copy.isEmpty());
    }

    @Test
    public void testClonePreservesCaseInsensitiveLookup() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("MiXeD", "value");

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        assertEquals("value", copy.get("mixed"));
        assertTrue(copy.containsKey("MIXED"));
    }

    @Test
    public void testClonePreservesNullKeyMapping() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put(null, "value");

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        assertEquals(1, copy.size());
        assertEquals("value", copy.get(null));
        assertTrue(copy.containsKey(null));
    }

    @Test
    public void testClonePreservesNullValueMapping() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("Key", null);

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        assertEquals(1, copy.size());
        assertTrue(copy.containsKey("KEY"));
        assertNull(copy.get("key"));
    }

    @Test
    public void testClonePreservesMultipleMappings() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("First", 1);
        original.put("Second", 2);
        original.put("Third", 3);

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        assertEquals(3, copy.size());
        assertEquals(1, copy.get("FIRST"));
        assertEquals(2, copy.get("second"));
        assertEquals(3, copy.get("Third"));
    }

    @Test
    public void testCloneCanRemoveMappingWithoutChangingOriginal() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("Key", "value");

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();
        assertEquals("value", copy.remove("KEY"));

        assertEquals("value", original.get("key"));
        assertNull(copy.get("key"));
    }

    @Test
    public void testCloneCanAddMappingWithoutChangingOriginal() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        copy.put("Added", "value");

        assertEquals(0, original.size());
        assertEquals(1, copy.size());
        assertEquals("value", copy.get("ADDED"));
    }

    @Test
    public void testClonePreservesOverwrittenValue() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("Key", "first");
        original.put("KEY", "second");

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        assertEquals(1, copy.size());
        assertEquals("second", copy.get("key"));
    }

    @Test
    public void testClonePreservesCaseInsensitiveRemovalBehavior() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("Key", "value");

        CaseInsensitiveMap copy = (CaseInsensitiveMap) original.clone();

        assertEquals("value", copy.remove("kEy"));
        assertEquals(0, copy.size());
        assertEquals("value", original.get("KEY"));
    }
}
