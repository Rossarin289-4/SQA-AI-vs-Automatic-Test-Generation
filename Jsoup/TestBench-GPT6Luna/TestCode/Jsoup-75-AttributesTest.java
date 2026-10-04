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
    @Test
    public void testGetAndHasKeyCaseSensitive() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Name", "value");
        assertEquals("value", attrs.get("Name"));
        assertEquals("", attrs.get("name"));
        assertTrue(attrs.hasKey("Name"));
        assertFalse(attrs.hasKey("name"));
    }

    @Test
    public void testGetIgnoreCaseAndBooleanValue() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Checked", true);
        assertEquals("", attrs.getIgnoreCase("checked"));
        assertTrue(attrs.hasKeyIgnoreCase("CHECKED"));
        assertEquals("", attrs.get("Checked"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutReplacesOnlyCaseSensitiveMatch() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Key", "one").put("key", "two");
        assertEquals(2, attrs.size());
        attrs.put("Key", "updated");
        assertEquals("updated", attrs.get("Key"));
        assertEquals("two", attrs.get("key"));
        assertEquals(2, attrs.size());
    }

    @Test
    public void testRemoveCaseSensitive() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("First", "1").put("first", "2").put("last", "3");
        attrs.remove("First");
        assertEquals(2, attrs.size());
        assertFalse(attrs.hasKey("First"));
        assertEquals("2", attrs.get("first"));
        assertEquals("3", attrs.get("last"));
    }

    @Test
    public void testRemoveIgnoreCaseRemovesFirstMatch() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("First", "1").put("first", "2");
        attrs.removeIgnoreCase("FIRST");
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("First"));
        assertEquals("2", attrs.get("first"));
    }

    @Test
    public void testBooleanPutTrueAndFalse() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Selected", true);
        assertTrue(attrs.hasKeyIgnoreCase("selected"));
        attrs.put("selected", false);
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKeyIgnoreCase("SELECTED"));
    }

    @Test
    public void testAddAllReplacesMatchingAndAddsOtherKeys() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("same", "old").put("keep", "yes");
        Attributes incoming = new Attributes();
        incoming.put("same", "new").put("extra", "value");
        attrs.addAll(incoming);
        assertEquals(3, attrs.size());
        assertEquals("new", attrs.get("same"));
        assertEquals("yes", attrs.get("keep"));
        assertEquals("value", attrs.get("extra"));
    }

    @Test
    public void testIteratorVisitsEntriesAndRemovesCurrent() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("a", "1").put("b", "2").put("c", "3");
        Iterator<Attribute> iter = attrs.iterator();
        assertTrue(iter.hasNext());
        assertEquals("a", iter.next().getKey());
        iter.remove();
        assertEquals(2, attrs.size());
        assertEquals("b", iter.next().getKey());
        assertEquals("c", iter.next().getKey());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testAsListHasBooleanAndValuedAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("disabled", true).put("title", "note");
        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("disabled", list.get(0).getKey());
        assertNull(list.get(0).getValue());
        assertEquals("note", list.get(1).getValue());
    }

    @Test
    public void testDatasetFiltersAndMapsDataAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("id", "x").put("data-user", "Ada").put("data-count", "3");
        Map<String, String> data = attrs.dataset();
        assertEquals(2, data.size());
        assertEquals("Ada", data.get("user"));
        assertEquals("3", data.get("count"));
        assertFalse(data.containsKey("id"));
    }

    @Test
    public void testDatasetPutReturnsPreviousValueAndUpdatesAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-mode", "old");
        Map<String, String> data = attrs.dataset();
        assertEquals("old", data.put("mode", "new"));
        assertEquals("new", attrs.get("data-mode"));
        assertEquals(1, data.size());
    }

    @Test
    public void testDatasetIteratorRemovalRemovesBackingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-a", "1").put("plain", "2").put("data-b", "3");
        Iterator<Map.Entry<String, String>> iter = attrs.dataset().entrySet().iterator();
        assertEquals("a", iter.next().getKey());
        iter.remove();
        assertFalse(attrs.hasKey("data-a"));
        assertEquals(1, attrs.dataset().size());
    }

    @Test
    public void testHtmlSerializesOrdinaryAndBooleanAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("title", "a&b").put("checked", true);
        assertEquals(" title=\"a&amp;b\" checked", attrs.html());
        assertEquals(attrs.html(), attrs.toString());
    }

    @Test
    public void testEqualsAndHashCodeForEqualContent() throws Exception {
        Attributes one = new Attributes();
        one.put("a", "1").put("b", "2");
        Attributes two = new Attributes();
        two.put("a", "1").put("b", "2");
        assertEquals(one, two);
        assertEquals(one.hashCode(), two.hashCode());
        two.put("b", "different");
        assertNotEquals(one, two);
    }

    @Test
    public void testCloneHasIndependentStorage() throws Exception {
        Attributes original = new Attributes();
        original.put("a", "1").put("b", "2");
        Attributes copy = original.clone();
        copy.put("a", "changed").put("c", "3");
        assertEquals("1", original.get("a"));
        assertEquals(2, original.size());
        assertEquals("changed", copy.get("a"));
        assertEquals(3, copy.size());
    }

    @Test
    public void testNormalizeLowercasesAllKeys() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("DATA-Name", "x").put("TITLE", "y");
        attrs.normalize();
        assertTrue(attrs.hasKey("data-name"));
        assertTrue(attrs.hasKey("title"));
        assertFalse(attrs.hasKey("TITLE"));
        assertEquals("x", attrs.get("data-name"));
    }

    @Test
    public void testEmptyAddAllLeavesAttributesUnchanged() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("present", "yes");
        attrs.addAll(new Attributes());
        assertEquals(1, attrs.size());
        assertEquals("yes", attrs.get("present"));
    }

    @Test
    public void testGrowthAcrossInitialCapacityAndRemovalAtFirstAndLast() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("a", "1").put("b", "2").put("c", "3").put("d", "4").put("e", "5");
        assertEquals(5, attrs.size());
        attrs.remove("a");
        attrs.remove("e");
        assertEquals(3, attrs.size());
        assertEquals("2", attrs.get("b"));
        assertEquals("4", attrs.get("d"));
    }
}
