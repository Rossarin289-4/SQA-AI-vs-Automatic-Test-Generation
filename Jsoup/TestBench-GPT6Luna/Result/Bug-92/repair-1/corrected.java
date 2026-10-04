package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
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
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import java.io.Reader;
import java.io.StringReader;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Tag;

public class AttributesTest {
    @Test
    public void testEmptyAndMissingLookups() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
        assertTrue(attrs.isEmpty());
        assertEquals("", attrs.get("missing"));
        assertEquals("", attrs.getIgnoreCase("missing"));
    }

    @Test
    public void testExactAndCaseInsensitiveLookups() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Name", "value");
        assertEquals("value", attrs.get("Name"));
        assertEquals("", attrs.get("name"));
        assertEquals("value", attrs.getIgnoreCase("name"));
        assertTrue(attrs.hasKey("Name"));
        assertFalse(attrs.hasKey("name"));
        assertTrue(attrs.hasKeyIgnoreCase("name"));
    }

    @Test
    public void testAddAllowsDuplicateKeys() throws Exception {
        Attributes attrs = new Attributes();
        attrs.add("k", "first");
        attrs.add("k", "second");
        assertEquals(2, attrs.size());
        assertEquals("first", attrs.get("k"));
        assertEquals("second", attrs.asList().get(1).getValue());
    }

    @Test
    public void testPutReplacesByExactKey() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Key", "old");
        attrs.put("Key", "new");
        attrs.put("key", "lower");
        assertEquals(2, attrs.size());
        assertEquals("new", attrs.get("Key"));
        assertEquals("lower", attrs.get("key"));
    }

    @Test
    public void testBooleanPutAndRemovalAreCaseInsensitive() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("CHECKED", true);
        assertEquals(1, attrs.size());
        assertEquals("", attrs.get("checked"));
        assertTrue(attrs.hasKeyIgnoreCase("checked"));
        attrs.put("checked", false);
        assertEquals(0, attrs.size());
        assertFalse(attrs.hasKeyIgnoreCase("CHECKED"));
    }

    @Test
    public void testRemoveIsCaseSensitiveAndShiftsEntries() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        attrs.remove("B");
        assertEquals(3, attrs.size());
        attrs.remove("b");
        assertEquals(2, attrs.size());
        assertEquals("3", attrs.get("c"));
    }

    @Test
    public void testRemoveIgnoreCase() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("Name", "v");
        attrs.removeIgnoreCase("nAmE");
        assertTrue(attrs.isEmpty());
        assertFalse(attrs.hasKeyIgnoreCase("name"));
    }

    @Test
    public void testAddAllReplacesMatchingKeysAndAddsOthers() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("a", "old");
        Attributes incoming = new Attributes();
        incoming.put("a", "new");
        incoming.put("b", "two");
        attrs.addAll(incoming);
        assertEquals(2, attrs.size());
        assertEquals("new", attrs.get("a"));
        assertEquals("two", attrs.get("b"));
    }

    @Test
    public void testIteratorCanRemoveAndContinuesInOrder() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        Iterator<Attribute> iterator = attrs.iterator();
        assertEquals("a", iterator.next().getKey());
        iterator.remove();
        assertEquals("b", iterator.next().getKey());
        assertEquals(2, attrs.size());
        assertEquals("3", attrs.get("c"));
    }

    @Test
    public void testAsListPreservesBooleanAndValueAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("flag", true);
        attrs.put("name", "value");
        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("flag", list.get(0).getKey());
        assertNull(list.get(0).getValue());
        assertEquals("value", list.get(1).getValue());
    }

    @Test
    public void testDatasetFiltersAndMapsDataKeys() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("id", "x");
        attrs.put("data-user", "Ada");
        attrs.put("data-count", "2");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(2, dataset.size());
        assertEquals("Ada", dataset.get("user"));
        assertEquals("2", dataset.get("count"));
        assertFalse(dataset.containsKey("id"));
    }

    @Test
    public void testDatasetPutReturnsPriorValueAndUpdatesAttributes() throws Exception {
        Attributes attrs = new Attributes();
        Map<String, String> dataset = attrs.dataset();
        assertNull(dataset.put("mode", "one"));
        assertEquals("one", attrs.get("data-mode"));
        assertEquals("one", dataset.put("mode", "two"));
        assertEquals("two", attrs.get("data-mode"));
    }

    @Test
    public void testDatasetIteratorRemovalRemovesBackingAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-x", "one");
        attrs.put("data-y", "two");
        Iterator<Map.Entry<String, String>> iterator = attrs.dataset().entrySet().iterator();
        assertEquals("x", iterator.next().getKey());
        iterator.remove();
        assertFalse(attrs.hasKey("data-x"));
        assertEquals(1, attrs.dataset().size());
    }

    @Test
    public void testHtmlEscapesValuesAndRendersBooleanAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("checked", true);
        attrs.put("title", "a&b");
        assertEquals(" checked title=\"a&amp;b\"", attrs.html());
        assertEquals(attrs.html(), attrs.toString());
    }

    @Test
    public void testEqualsAndHashCodeReflectContents() throws Exception {
        Attributes first = new Attributes();
        first.put("a", "1");
        Attributes same = new Attributes();
        same.put("a", "1");
        Attributes different = new Attributes();
        different.put("a", "2");
        assertEquals(first, same);
        assertEquals(first.hashCode(), same.hashCode());
        assertFalse(first.equals(different));
    }

    @Test
    public void testCloneIsIndependent() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        Attributes copy = attrs.clone();
        copy.put("a", "2");
        copy.put("b", "3");
        assertEquals("1", attrs.get("a"));
        assertEquals(1, attrs.size());
        assertEquals("2", copy.get("a"));
        assertEquals(2, copy.size());
    }

    @Test
    public void testNormalizeLowercasesAllKeys() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("MiXeD", "v");
        attrs.normalize();
        assertTrue(attrs.hasKey("mixed"));
        assertEquals("v", attrs.get("mixed"));
        assertFalse(attrs.hasKey("MiXeD"));
    }

    @Test
    public void testDeduplicatePreservingCase() throws Exception {
        Attributes attrs = new Attributes();
        attrs.add("Key", "first");
        attrs.add("Key", "second");
        attrs.add("key", "third");
        assertEquals(1, attrs.deduplicate(ParseSettings.preserveCase));
        assertEquals(2, attrs.size());
        assertEquals("first", attrs.get("Key"));
        assertEquals("third", attrs.get("key"));
    }

    @Test
    public void testDeduplicateIgnoringCase() throws Exception {
        Attributes attrs = new Attributes();
        attrs.add("Key", "first");
        attrs.add("key", "second");
        assertEquals(1, attrs.deduplicate(ParseSettings.htmlDefault));
        assertEquals(1, attrs.size());
        assertEquals("first", attrs.get("Key"));
    }

    @Test
    public void testDeduplicateEmptyAttributes() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.deduplicate(ParseSettings.htmlDefault));
        assertTrue(attrs.isEmpty());
    }

    @Test
    public void testIteratorHasNextAcrossEmptyAndPopulatedStates() throws Exception {
        Attributes attrs = new Attributes();
        Iterator<Attribute> emptyIterator = attrs.iterator();
        assertFalse(emptyIterator.hasNext());
        attrs.put("edge", "value");
        Iterator<Attribute> iterator = attrs.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("edge", iterator.next().getKey());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testParseSettingsPreserveCaseFlags() throws Exception {
        assertFalse(ParseSettings.htmlDefault.preserveTagCase());
        assertFalse(ParseSettings.htmlDefault.preserveAttributeCase());
        assertTrue(ParseSettings.preserveCase.preserveTagCase());
        assertTrue(ParseSettings.preserveCase.preserveAttributeCase());
    }

    @Test
    public void testNormalizeTagTrimsAndAppliesCaseSetting() throws Exception {
        assertEquals("div", ParseSettings.htmlDefault.normalizeTag(" DIV "));
        assertEquals("DIV", ParseSettings.preserveCase.normalizeTag(" DIV "));
    }

    @Test
    public void testNormalizeAttributeTrimsAndAppliesCaseSetting() throws Exception {
        assertEquals("name", ParseSettings.htmlDefault.normalizeAttribute(" NAME "));
        assertEquals("NAME", ParseSettings.preserveCase.normalizeAttribute(" NAME "));
    }
}
