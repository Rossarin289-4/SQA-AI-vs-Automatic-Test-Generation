package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AttributesTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testGetWhenAttributesIsNull() {
        Attributes attrs = new Attributes();
        // The internal map is null by default. get() should return "" for a non-existent key.
        assertEquals("", attrs.get("nonexistent"));
    }

    @Test
    public void testGetWhenAttributeExists() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void testGetWhenAttributeDoesNotExist() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertEquals("", attrs.get("key2"));
    }

    @Test
    public void testGetIgnoreCaseWhenAttributeExistsCaseInsensitive() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        assertEquals("value", attrs.getIgnoreCase("key"));
    }

    @Test
    public void testGetIgnoreCaseWhenAttributeExistsExactCase() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.getIgnoreCase("key"));
    }

    @Test
    public void testGetIgnoreCaseWhenAttributeDoesNotExist() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertEquals("", attrs.getIgnoreCase("key2"));
    }

    @Test
    public void testGetIgnoreCaseWhenAttributesIsNull() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.getIgnoreCase("nonexistent"));
    }

    @Test
    public void testPutNewAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
        assertEquals("value", attrs.get("key"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutExistingAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value1");
        attrs.put("key", "value2");
        assertTrue(attrs.hasKey("key"));
        assertEquals("value2", attrs.get("key"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutBooleanAttributeTrue() {
        Attributes attrs = new Attributes();
        attrs.put("key", true);
        assertTrue(attrs.hasKey("key"));
        assertEquals("", attrs.get("key")); // Boolean attributes have empty value
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutBooleanAttributeFalse() {
        Attributes attrs = new Attributes();
        attrs.put("key", false);
        assertFalse(attrs.hasKey("key"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testPutAttributeObject() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("key", "value");
        attrs.put(attr);
        assertTrue(attrs.hasKey("key"));
        assertEquals("value", attrs.get("key"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveExistingAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        attrs.remove("key1");
        assertFalse(attrs.hasKey("key1"));
        assertEquals("value2", attrs.get("key2"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveNonExistentAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.remove("key2");
        assertTrue(attrs.hasKey("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveWhenAttributesIsNull() {
        Attributes attrs = new Attributes();
        attrs.remove("key"); // Should not throw exception
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCaseExistingAttributeCaseInsensitive() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        attrs.removeIgnoreCase("key");
        assertFalse(attrs.hasKey("KEY"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCaseExistingAttributeExactCase() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.removeIgnoreCase("key");
        assertFalse(attrs.hasKey("key"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCaseNonExistentAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.removeIgnoreCase("key2");
        assertTrue(attrs.hasKey("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCaseWhenAttributesIsNull() {
        Attributes attrs = new Attributes();
        attrs.removeIgnoreCase("key"); // Should not throw exception
        assertEquals(0, attrs.size());
    }

    @Test
    public void testHasKeyWhenAttributeExists() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
    }

    @Test
    public void testHasKeyWhenAttributeDoesNotExist() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertFalse(attrs.hasKey("key2"));
    }

    @Test
    public void testHasKeyWhenAttributesIsNull() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void testHasKeyIgnoreCaseWhenAttributeExistsCaseInsensitive() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        assertTrue(attrs.hasKeyIgnoreCase("key"));
    }

    @Test
    public void testHasKeyIgnoreCaseWhenAttributeExistsExactCase() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertTrue(attrs.hasKeyIgnoreCase("key"));
    }

    @Test
    public void testHasKeyIgnoreCaseWhenAttributeDoesNotExist() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertFalse(attrs.hasKeyIgnoreCase("key2"));
    }

    @Test
    public void testHasKeyIgnoreCaseWhenAttributesIsNull() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKeyIgnoreCase("key"));
    }

    @Test
    public void testSizeWhenEmpty() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
    }

    @Test
    public void testSizeWhenNotEmpty() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        assertEquals(2, attrs.size());
    }

    @Test
    public void testAddAllFromEmptyAttributes() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs1.addAll(attrs2);
        assertEquals(1, attrs1.size());
        assertEquals("value1", attrs1.get("key1"));
    }

    @Test
    public void testAddAllFromAttributesWithExistingKeys() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value2"); // Overwrites
        attrs2.put("key2", "value3");
        attrs1.addAll(attrs2);
        assertEquals(2, attrs1.size());
        assertEquals("value2", attrs1.get("key1"));
        assertEquals("value3", attrs1.get("key2"));
    }

    @Test
    public void testAddAllWhenTargetIsNull() {
        Attributes attrs1 = new Attributes(); // attributes is null initially
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value2");
        attrs1.addAll(attrs2);
        assertEquals(2, attrs1.size());
        assertEquals("value1", attrs1.get("key1"));
        assertEquals("value2", attrs1.get("key2"));
    }

    @Test
    public void testIteratorWhenEmpty() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.iterator().hasNext());
    }

    @Test
    public void testIteratorWhenNotEmpty() {
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
    public void testAsListWhenEmpty() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.asList().isEmpty());
    }

    @Test
    public void testAsListWhenNotEmpty() {
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
    public void testDatasetEmpty() {
        Attributes attrs = new Attributes();
        Map<String, String> dataset = attrs.dataset();
        assertTrue(dataset.isEmpty());
    }

    @Test
    public void testDatasetWithDataAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        attrs.put("data-name", "test");
        attrs.put("other", "value"); // Should not appear in dataset
        Map<String, String> dataset = attrs.dataset();
        assertEquals(2, dataset.size());
        assertEquals("123", dataset.get("id"));
        assertEquals("test", dataset.get("name"));
        assertNull(dataset.get("other"));
    }

    @Test
    public void testDatasetPutNew() {
        Attributes attrs = new Attributes();
        Map<String, String> dataset = attrs.dataset();
        dataset.put("id", "123");
        assertTrue(attrs.hasKey("data-id"));
        assertEquals("123", attrs.get("data-id"));
    }

    @Test
    public void testDatasetPutExisting() {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        Map<String, String> dataset = attrs.dataset();
        dataset.put("id", "456");
        assertTrue(attrs.hasKey("data-id"));
        assertEquals("456", attrs.get("data-id"));
    }

    @Test
    public void testHtmlEmpty() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.html());
    }

    @Test
    public void testHtmlWithAttributes() throws IOException {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        // The order is determined by LinkedHashMap insertion order.
        String expectedHtml = " key1=\"value1\" key2=\"value2\"";
        assertEquals(expectedHtml, attrs.html());
    }

    @Test
    public void testHtmlWithBooleanAttribute() throws IOException {
        Attributes attrs = new Attributes();
        attrs.put("key", true);
        attrs.put("key2", "value2");
        // Boolean attributes are rendered as just the key in HTML
        String expectedHtml = " key=\"\" key2=\"value2\""; // Standard behavior for boolean attributes in some contexts, though Jsoup might normalize to just 'key'
        assertEquals(expectedHtml, attrs.html());
    }

    @Test
    public void testHtmlWithDataAttribute() throws IOException {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        String expectedHtml = " data-id=\"123\"";
        assertEquals(expectedHtml, attrs.html());
    }

    @Test
    public void testToStringIsHtml() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals(attrs.html(), attrs.toString());
    }

    @Test
    public void testEqualsWhenSameObject() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertTrue(attrs.equals(attrs));
    }

    @Test
    public void testEqualsWhenSameContent() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");
        assertTrue(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsWhenDifferentContent() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value2");
        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsWhenDifferentKeys() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value1");
        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsWhenOneIsNull() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = null;
        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsWhenBothNullAttributesInternal() {
        Attributes attrs3 = new Attributes();
        Attributes attrs4 = new Attributes();
        assertTrue(attrs3.equals(attrs4)); // Both have null internal map
    }

    @Test
    public void testHashCodeWhenEmpty() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.hashCode());
    }

    @Test
    public void testHashCodeWhenNotEmpty() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        // The hash code is based on the internal map's hash code.
        // We can't predict the exact value without knowing the map implementation details,
        // but we can check that it's not zero and consistent.
        assertNotEquals(0, attrs.hashCode());
        assertEquals(attrs.hashCode(), attrs.clone().hashCode());
    }

    @Test
    public void testCloneEmpty() {
        Attributes attrs = new Attributes();
        Attributes clonedAttrs = attrs.clone();
        assertNotSame(attrs, clonedAttrs);
        assertEquals(0, clonedAttrs.size());
    }

    @Test
    public void testCloneNotEmpty() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        Attribute attr2 = new Attribute("key2", "value2");
        attrs.put(attr2);

        Attributes clonedAttrs = attrs.clone();
        assertNotSame(attrs, clonedAttrs);
        assertEquals(2, clonedAttrs.size());
        assertEquals("value1", clonedAttrs.get("key1"));
        assertEquals("value2", clonedAttrs.get("key2"));

        // Ensure it's a deep clone (modifying original doesn't affect clone)
        attrs.remove("key1");
        assertEquals(1, attrs.size());
        assertEquals(2, clonedAttrs.size());
        assertFalse(attrs.hasKey("key1"));
        assertTrue(clonedAttrs.hasKey("key1"));

        // Ensure cloned attribute is also a clone
        Attribute clonedAttr2 = clonedAttrs.asList().stream().filter(a -> a.getKey().equals("key2")).findFirst().get();
        assertNotSame(attr2, clonedAttr2);
    }

    // The error was that `entrySet()` is not a public method of `Attributes`.
    // It's a method of the inner `Dataset` class which implements `Map`.
    // However, `Attributes` itself does not implement `Map`.
    // The `dataset()` method returns a `Map<String, String>`, so we should test that.
    // The original tests for `entrySet()` were incorrect.

    // Replaced `entrySet()` tests with tests for `dataset()`
    @Test
    public void testDatasetAccessMethods() {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        attrs.put("data-name", "test");
        attrs.put("other", "value"); // Should not appear in dataset

        Map<String, String> dataset = attrs.dataset();
        assertEquals(2, dataset.size());
        assertEquals("123", dataset.get("id"));
        assertEquals("test", dataset.get("name"));
        assertNull(dataset.get("other")); // Should not be present in dataset view

        // Test modification via dataset
        dataset.put("id", "456");
        assertEquals("456", attrs.get("data-id"));

        // Test adding via dataset
        dataset.put("new", "data");
        assertTrue(attrs.hasKey("data-new"));
        assertEquals("data", attrs.get("data-new"));

        // Test removal via dataset (if iterator.remove() is called)
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            if(entry.getKey().equals("name")){
                it.remove();
                break;
            }
        }
        assertFalse(attrs.hasKey("data-name"));
        assertEquals(2, dataset.size()); // size of dataset after removal
    }
}
