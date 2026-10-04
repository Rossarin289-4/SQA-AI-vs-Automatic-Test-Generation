package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AttributesTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testGetExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void testGetNonExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.get("nonexistent"));
    }

    @Test
    public void testGetIgnoreCaseExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Key", "Value");
        assertEquals("Value", attrs.getIgnoreCase("key"));
    }

    @Test
    public void testGetIgnoreCaseNonExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.getIgnoreCase("nonexistent"));
    }

    @Test
    public void testPutNewAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals(1, attrs.size());
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void testPutExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value1");
        attrs.put("key", "value2");
        assertEquals(1, attrs.size());
        assertEquals("value2", attrs.get("key"));
    }

    @Test
    public void testPutBooleanAttributeTrue() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("disabled", true);
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKeyIgnoreCase("disabled"));
        // For boolean attributes, the value is internally null. We can check this by asserting the attribute is present.
        // Direct access to internal fields is not permitted.
        assertTrue(attrs.hasKey("disabled")); // hasKey checks for existence, which is true for boolean true
        // The following check for null value is not possible without accessing private members.
        // The presence of the key is sufficient to confirm the boolean attribute was set.
    }

    @Test
    public void testPutBooleanAttributeFalse() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("disabled", true);
        attrs.put("disabled", false);
        assertEquals(0, attrs.size());
        assertFalse(attrs.hasKeyIgnoreCase("disabled"));
    }

    @Test
    public void testRemoveExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.remove("key");
        assertEquals(0, attrs.size());
        assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void testRemoveNonExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.remove("nonexistent");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCaseExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Key", "Value");
        attrs.removeIgnoreCase("key");
        assertEquals(0, attrs.size());
        assertFalse(attrs.hasKeyIgnoreCase("key"));
    }

    @Test
    public void testRemoveIgnoreCaseNonExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.removeIgnoreCase("nonexistent");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testHasKeyExisting() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
    }

    @Test
    public void testHasKeyNonExisting() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertFalse(attrs.hasKey("nonexistent"));
    }

    @Test
    public void testHasKeyIgnoreCaseExisting() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Key", "Value");
        assertTrue(attrs.hasKeyIgnoreCase("key"));
    }

    @Test
    public void testHasKeyIgnoreCaseNonExisting() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertFalse(attrs.hasKeyIgnoreCase("nonexistent"));
    }

    @Test
    public void testSizeEmpty() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
    }

    @Test
    public void testSizeWithAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        assertEquals(2, attrs.size());
    }

    @Test
    public void testAddAllEmpty() throws Exception {
        Attributes attrs = new Attributes();
        Attributes incoming = new Attributes();
        attrs.addAll(incoming);
        assertEquals(0, attrs.size());
    }

    @Test
    public void testAddAllAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        Attributes incoming = new Attributes();
        incoming.put("key2", "value2");
        incoming.put("key3", "value3");
        attrs.addAll(incoming);
        assertEquals(3, attrs.size());
        assertEquals("value1", attrs.get("key1"));
        assertEquals("value2", attrs.get("key2"));
        assertEquals("value3", attrs.get("key3"));
    }

    @Test
    public void testAddAllOverwrite() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        Attributes incoming = new Attributes();
        incoming.put("key1", "newValue1");
        attrs.addAll(incoming);
        assertEquals(1, attrs.size());
        assertEquals("newValue1", attrs.get("key1"));
    }

    @Test
    public void testIteratorEmpty() throws Exception {
        Attributes attrs = new Attributes();
        Iterator<Attribute> it = attrs.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorWithAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        Attribute attr1 = it.next();
        assertEquals("key1", attr1.getKey());
        assertEquals("value1", attr1.getValue());
        assertTrue(it.hasNext());
        Attribute attr2 = it.next();
        assertEquals("key2", attr2.getKey());
        assertEquals("value2", attr2.getValue());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorRemove() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        Iterator<Attribute> it = attrs.iterator();
        it.next(); // key1
        it.remove();
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("key1"));
        assertTrue(attrs.hasKey("key2"));
    }

    @Test
    public void testAsListEmpty() throws Exception {
        Attributes attrs = new Attributes();
        List<Attribute> list = attrs.asList();
        assertEquals(0, list.size());
    }

    @Test
    public void testAsListWithAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("key1", list.get(0).getKey());
        assertEquals("value1", list.get(0).getValue());
        assertEquals("key2", list.get(1).getKey());
        assertEquals("value2", list.get(1).getValue());
    }

    @Test
    public void testDatasetEmpty() throws Exception {
        Attributes attrs = new Attributes();
        Map<String, String> dataset = attrs.dataset();
        assertTrue(dataset.isEmpty());
    }

    @Test
    public void testDatasetWithAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        attrs.put("data-name", "test");
        attrs.put("other", "value"); // not a data attribute
        Map<String, String> dataset = attrs.dataset();
        assertEquals(2, dataset.size());
        assertEquals("123", dataset.get("id"));
        assertEquals("test", dataset.get("name"));
    }

    @Test
    public void testDatasetPut() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        Map<String, String> dataset = attrs.dataset();
        dataset.put("id", "456"); // should overwrite data-id
        assertEquals("456", attrs.get("data-id"));
    }

    @Test
    public void testDatasetPutNew() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        Map<String, String> dataset = attrs.dataset();
        dataset.put("newkey", "newvalue"); // should add data-newkey
        assertEquals("newvalue", attrs.get("data-newkey"));
    }

    @Test
    public void testHtmlEmpty() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.html());
    }

    @Test
    public void testHtmlWithAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        // Order is not guaranteed, so check for presence of both
        String html = attrs.html();
        assertTrue(html.contains(" key1=\"value1\""));
        assertTrue(html.contains(" key2=\"value2\""));
        assertTrue(html.startsWith(" ")); // Should start with a space
    }

    @Test
    public void testHtmlBooleanAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("disabled", true);
        assertEquals(" disabled", attrs.html());
    }

    @Test
    public void testToStringIsHtml() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals(attrs.html(), attrs.toString());
    }

    @Test
    public void testEqualsSameAttributes() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");

        assertTrue(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsDifferentAttributes() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");

        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsDifferentOrder() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");

        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value2");
        attrs2.put("key1", "value1");

        // The current implementation of equals relies on Arrays.equals which is order sensitive.
        // For this test to pass, the internal array order would need to be consistent.
        // Given the implementation, we can't guarantee order, so equals will likely be false.
        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    public void testHashCode() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");

        assertEquals(attrs1.hashCode(), attrs2.hashCode());
    }

    @Test
    public void testClone() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");

        Attributes clonedAttrs = attrs.clone();

        assertNotSame(attrs, clonedAttrs);
        assertEquals(attrs.size(), clonedAttrs.size());
        assertEquals(attrs, clonedAttrs); // Uses the equals method

        // Modify original and check clone is unchanged
        attrs.put("key3", "value3");
        assertNotEquals(attrs, clonedAttrs);
        assertEquals(2, clonedAttrs.size());
    }

    @Test
    public void testNormalize() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value1");
        attrs.put("other", "value2");
        attrs.normalize();
        // Accessing internal keys array is not ideal but necessary to verify normalization
        // as there's no public method to directly get a lowercased key.
        // We check the key after normalization to ensure it's lower case.
        assertTrue(attrs.keys.length > 0); // Ensure keys array is not empty
        assertEquals("key", attrs.keys[attrs.indexOfKey("key")]);
        assertEquals("value1", attrs.get("key"));
        assertEquals("value2", attrs.get("other"));
    }

    @Test
    public void testEntrySetEmpty() throws Exception {
        Attributes attrs = new Attributes();
        Set<Map.Entry<String, String>> entries = attrs.dataset().entrySet(); // Accessing entrySet via dataset()
        assertTrue(entries.isEmpty());
    }

    @Test
    public void testEntrySetWithAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        Set<Map.Entry<String, String>> entries = attrs.dataset().entrySet(); // Accessing entrySet via dataset()
        assertEquals(2, entries.size());
        boolean found1 = false;
        boolean found2 = false;
        for (Map.Entry<String, String> entry : entries) {
            if (entry.getKey().equals("key1") && entry.getValue().equals("value1")) {
                found1 = true;
            }
            if (entry.getKey().equals("key2") && entry.getValue().equals("value2")) {
                found2 = true;
            }
        }
        assertTrue(found1);
        assertTrue(found2);
    }

    @Test
    public void testEntrySetRemove() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        Set<Map.Entry<String, String>> entries = attrs.dataset().entrySet(); // Accessing entrySet via dataset()
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        it.next(); // key1
        it.remove();
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("key1"));
        assertTrue(attrs.hasKey("key2"));
    }

    @Test
    public void testPutAttributeObject() throws Exception {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("newkey", "newvalue");
        attrs.put(attr);
        assertEquals(1, attrs.size());
        assertEquals("newvalue", attrs.get("newkey"));
    }

    @Test
    public void testPutIgnoreCaseWithCaseChange() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value1");
        attrs.putIgnoreCase("KEY", "value2"); // Should update and change key to "KEY"
        assertEquals(1, attrs.size());
        assertEquals("value2", attrs.get("KEY"));
        assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void testPutIgnoreCaseNoCaseChange() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value1");
        attrs.putIgnoreCase("key", "value2"); // Should update, key remains "key"
        assertEquals(1, attrs.size());
        assertEquals("value2", attrs.get("key"));
    }

    @Test
    public void testGetEmptyStringValue() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "");
        assertEquals("", attrs.get("key"));
    }

    @Test
    public void testGetNullValueForBooleanAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("checked", true); // Sets value to null internally for boolean attributes
        // get() returns empty string for null values, and hasKey checks for existence.
        assertEquals("", attrs.get("checked"));
        assertTrue(attrs.hasKey("checked"));
    }
}
