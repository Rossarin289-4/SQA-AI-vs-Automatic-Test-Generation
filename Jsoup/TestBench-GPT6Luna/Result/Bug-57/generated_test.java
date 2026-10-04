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
    @Test
    public void testEmptyAttributes() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
        assertEquals("", attrs.get("missing"));
        assertFalse(attrs.hasKey("missing"));
    }

    @Test
    public void testGetIsCaseSensitive() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Name", "value");
        assertEquals("value", attrs.get("Name"));
        assertEquals("", attrs.get("name"));
    }

    @Test
    public void testGetIgnoreCase() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Name", "value");
        assertEquals("value", attrs.getIgnoreCase("nAME"));
        assertEquals("", attrs.getIgnoreCase("absent"));
    }

    @Test
    public void testPutReplacesExistingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "old");
        attrs.put("key", "new");
        assertEquals(1, attrs.size());
        assertEquals("new", attrs.get("key"));
    }

    @Test
    public void testBooleanPutAddsAndRemoves() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("enabled", true);
        assertTrue(attrs.hasKey("enabled"));
        attrs.put("enabled", false);
        assertFalse(attrs.hasKey("enabled"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemoveIsCaseSensitive() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Name", "value");
        attrs.remove("name");
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKey("Name"));
    }

    @Test
    public void testRemoveIgnoreCaseRemovesMatchingKeys() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Name", "one");
        attrs.put("nAME", "two");
        attrs.put("other", "three");
        attrs.removeIgnoreCase("name");
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKey("other"));
        assertFalse(attrs.hasKeyIgnoreCase("Name"));
    }

    @Test
    public void testHasKeyCaseSensitiveAndIgnoreCase() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Name", "value");
        assertTrue(attrs.hasKey("Name"));
        assertFalse(attrs.hasKey("name"));
        assertTrue(attrs.hasKeyIgnoreCase("name"));
    }

    @Test
    public void testAddAllAddsAndOverwrites() throws Exception {
        Attributes original = new Attributes();
        original.put("first", "old");
        Attributes incoming = new Attributes();
        incoming.put("first", "new");
        incoming.put("second", "two");

        original.addAll(incoming);

        assertEquals(2, original.size());
        assertEquals("new", original.get("first"));
        assertEquals("two", original.get("second"));
    }

    @Test
    public void testAddAllEmptyDoesNotChangeAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.addAll(new Attributes());
        assertEquals(1, attrs.size());
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void testIteratorAndListPreserveInsertionOrder() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("first", "1");
        attrs.put("second", "2");

        Iterator<Attribute> iter = attrs.iterator();
        assertEquals("first", iter.next().getKey());
        assertEquals("second", iter.next().getKey());
        assertFalse(iter.hasNext());

        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("first", list.get(0).getKey());
        assertEquals("second", list.get(1).getKey());
    }

    @Test
    public void testAsListIsUnmodifiable() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        List<Attribute> list = attrs.asList();
        try {
            list.clear();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals(1, attrs.size());
    }

    @Test
    public void testDatasetFiltersAndMapsDataAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("title", "ordinary");
        attrs.put("data-user-id", "7");
        attrs.put("data-mode", "fast");

        Map<String, String> data = attrs.dataset();

        assertEquals(2, data.size());
        assertEquals("7", data.get("user-id"));
        assertEquals("fast", data.get("mode"));
        assertFalse(data.containsKey("title"));
    }

    @Test
    public void testDatasetPutCreatesPrefixedAttributeAndReturnsOldValue() throws Exception {
        Attributes attrs = new Attributes();
        Map<String, String> data = attrs.dataset();

        assertNull(data.put("color", "blue"));
        assertEquals("blue", attrs.get("data-color"));
        assertEquals("blue", data.put("color", "red"));
        assertEquals("red", attrs.get("data-color"));
        assertEquals(1, data.size());
    }

    @Test
    public void testDatasetEntryIterationReturnsUnprefixedKeys() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-first", "one");
        attrs.put("plain", "ignored");
        attrs.put("data-last", "two");

        Iterator<Map.Entry<String, String>> iter = attrs.dataset().entrySet().iterator();

        assertTrue(iter.hasNext());
        Map.Entry<String, String> first = iter.next();
        assertEquals("first", first.getKey());
        assertEquals("one", first.getValue());
        assertTrue(iter.hasNext());
        Map.Entry<String, String> last = iter.next();
        assertEquals("last", last.getKey());
        assertEquals("two", last.getValue());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testHtmlAndToStringSerializeAttributesInOrder() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("first", "one");
        attrs.put("second", "two");
        assertEquals(" first=\"one\" second=\"two\"", attrs.html());
        assertEquals(attrs.html(), attrs.toString());
    }

    @Test
    public void testEqualsAndHashCodeForEqualAttributes() throws Exception {
        Attributes left = new Attributes();
        left.put("key", "value");
        Attributes right = new Attributes();
        right.put("key", "value");

        assertTrue(left.equals(right));
        assertEquals(left.hashCode(), right.hashCode());
    }

    @Test
    public void testEqualsRejectsDifferentContentAndOtherTypes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Attributes other = new Attributes();
        other.put("key", "different");

        assertFalse(attrs.equals(other));
        assertFalse(attrs.equals("not attributes"));
        assertTrue(attrs.equals(attrs));
    }

    @Test
    public void testCloneHasIndependentAttributeMap() throws Exception {
        Attributes original = new Attributes();
        original.put("key", "value");

        Attributes copy = original.clone();
        copy.put("key", "changed");
        copy.put("extra", "added");

        assertEquals("value", original.get("key"));
        assertEquals(1, original.size());
        assertEquals("changed", copy.get("key"));
        assertEquals(2, copy.size());
    }

    @Test
    public void testCloneOfEmptyAttributesIsEmpty() throws Exception {
        Attributes copy = new Attributes().clone();
        assertEquals(0, copy.size());
        assertEquals("", copy.get("missing"));
    }
}
