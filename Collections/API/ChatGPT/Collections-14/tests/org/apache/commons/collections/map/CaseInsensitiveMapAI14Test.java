package org.apache.commons.collections.map;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CaseInsensitiveMapAI14Test {

    @Test
    public void testPutGetAndOverwriteIgnoringCase() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        Assert.assertNull(map.put("One", "first"));
        Assert.assertEquals("first", map.get("ONE"));
        Assert.assertEquals("first", map.put("oNe", "second"));

        Assert.assertEquals(1, map.size());
        Assert.assertEquals("second", map.get("one"));
        Assert.assertTrue(map.containsKey("ONe"));
        Assert.assertTrue(map.keySet().contains("one"));
    }

    @Test
    public void testNullKeyIsSupported() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        Assert.assertNull(map.put(null, "null-value"));
        Assert.assertEquals("null-value", map.get(null));
        Assert.assertTrue(map.containsKey(null));
        Assert.assertTrue(map.keySet().contains(null));

        Assert.assertEquals("null-value", map.remove(null));
        Assert.assertFalse(map.containsKey(null));
        Assert.assertNull(map.get(null));
    }

    @Test
    public void testNonStringKeysUseTheirStringRepresentation() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        map.put(Integer.valueOf(123), "number");

        Assert.assertEquals(1, map.size());
        Assert.assertEquals("number", map.get("123"));
        Assert.assertEquals("number", map.get(Integer.valueOf(123)));
        Assert.assertTrue(map.containsKey("123"));
        Assert.assertTrue(map.keySet().contains("123"));
    }

    @Test
    public void testRemoveAndContainsKeyIgnoreCase() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("MiXeD", "value");

        Assert.assertTrue(map.containsKey("mixed"));
        Assert.assertEquals("value", map.remove("MIXED"));
        Assert.assertFalse(map.containsKey("mixed"));
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.remove("mixed"));
    }

    @Test
    public void testCopyConstructorCollapsesCaseEquivalentKeys() {
        Map source = new LinkedHashMap();
        source.put("First", "original");
        source.put("FIRST", "replacement");
        source.put("Second", "other");

        CaseInsensitiveMap map = new CaseInsensitiveMap(source);

        Assert.assertEquals(2, map.size());
        Assert.assertEquals("replacement", map.get("first"));
        Assert.assertEquals("other", map.get("SECOND"));
        Assert.assertTrue(map.keySet().contains("first"));
        Assert.assertTrue(map.keySet().contains("second"));
    }

    @Test
    public void testKeySetRemoveAcceptsDifferentCase() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Alpha", Integer.valueOf(1));
        map.put("Beta", Integer.valueOf(2));

        Assert.assertTrue(map.keySet().remove("ALPHA"));
        Assert.assertEquals(1, map.size());
        Assert.assertFalse(map.containsKey("alpha"));
        Assert.assertEquals(Integer.valueOf(2), map.get("beta"));
        Assert.assertFalse(map.keySet().remove("ALPHA"));
    }

    @Test
    public void testCloneHasIndependentMapStructure() {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("One", "one");

        CaseInsensitiveMap clone = (CaseInsensitiveMap) original.clone();
        clone.put("TWO", "two");
        clone.put("one", "changed");

        Assert.assertEquals(1, original.size());
        Assert.assertEquals("one", original.get("ONE"));
        Assert.assertFalse(original.containsKey("two"));

        Assert.assertEquals(2, clone.size());
        Assert.assertEquals("changed", clone.get("ONE"));
        Assert.assertEquals("two", clone.get("two"));
    }

    @Test
    public void testSerializationPreservesCaseInsensitiveLookupAndNullKey() throws Exception {
        CaseInsensitiveMap original = new CaseInsensitiveMap();
        original.put("CamelCase", "value");
        original.put(null, "null-value");

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ObjectOutputStream output = new ObjectOutputStream(bytes);
        output.writeObject(original);
        output.close();

        ObjectInputStream input = new ObjectInputStream(
                new ByteArrayInputStream(bytes.toByteArray()));
        CaseInsensitiveMap restored = (CaseInsensitiveMap) input.readObject();
        input.close();

        Assert.assertEquals(2, restored.size());
        Assert.assertEquals("value", restored.get("CAMELCASE"));
        Assert.assertEquals("null-value", restored.get(null));
        Assert.assertTrue(restored.keySet().contains("camelcase"));
        Assert.assertTrue(restored.keySet().contains(null));
    }
}
