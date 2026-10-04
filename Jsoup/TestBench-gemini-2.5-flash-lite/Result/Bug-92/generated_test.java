package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseSettings;
// Removed import for Token as it's not public and not directly used in the test methods.
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
// Removed import for HtmlTreeBuilderState as it's not public and not directly used in the test methods.
import org.jsoup.parser.Tag;

public class AttributesTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testGetBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertEquals("value1", attrs.get("key1"));
    }

    @Test
    public void testGetNonExistent() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertEquals("", attrs.get("key2"));
    }

    @Test
    public void testGetEmpty() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.get("key1"));
    }

    @Test
    public void testGetIgnoreCaseBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("KEY1", "value1");
        assertEquals("value1", attrs.getIgnoreCase("key1"));
        assertEquals("value1", attrs.getIgnoreCase("KEY1"));
    }

    @Test
    public void testGetIgnoreCaseNonExistent() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertEquals("", attrs.getIgnoreCase("key2"));
    }

    @Test
    public void testAddBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        assertEquals("value1", attrs.get("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertEquals("value1", attrs.get("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutOverwrite() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key1", "value2");
        assertEquals("value2", attrs.get("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutBooleanTrue() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-valid", true);
        // Boolean attributes have null value in the internal representation
        assertEquals("", attrs.get("data-valid"));
        assertTrue(attrs.hasKey("data-valid"));
    }

    @Test
    public void testPutBooleanFalse() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-invalid", true);
        attrs.put("data-invalid", false);
        assertFalse(attrs.hasKey("data-invalid"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemoveBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        attrs.remove("key1");
        assertEquals("", attrs.get("key1"));
        assertEquals("value2", attrs.get("key2"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveNonExistent() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.remove("key2");
        assertEquals("value1", attrs.get("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCaseBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("KEY1", "value1");
        attrs.removeIgnoreCase("key1");
        assertFalse(attrs.hasKeyIgnoreCase("key1"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testHasKeyBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertTrue(attrs.hasKey("key1"));
    }

    @Test
    public void testHasKeyNonExistent() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertFalse(attrs.hasKey("key2"));
    }

    @Test
    public void testHasKeyIgnoreCaseBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("KEY1", "value1");
        assertTrue(attrs.hasKeyIgnoreCase("key1"));
        assertTrue(attrs.hasKeyIgnoreCase("KEY1"));
    }

    @Test
    public void testSizeBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        assertEquals(2, attrs.size());
    }

    @Test
    public void testSizeEmpty() throws Exception {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
    }

    @Test
    public void testIsEmptyBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertFalse(attrs.isEmpty());
    }

    @Test
    public void testIsEmptyTrue() throws Exception {
        Attributes attrs = new Attributes();
        assertTrue(attrs.isEmpty());
    }

    @Test
    public void testAddAllBasic() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");

        Attributes attrs2 = new Attributes();
        attrs2.put("key3", "value3");

        attrs1.addAll(attrs2);
        assertEquals(3, attrs1.size());
        assertEquals("value1", attrs1.get("key1"));
        assertEquals("value2", attrs1.get("key2"));
        assertEquals("value3", attrs1.get("key3"));
    }

    @Test
    public void testAddAllOverwrite() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value2");

        attrs1.addAll(attrs2);
        assertEquals(1, attrs1.size());
        assertEquals("value2", attrs1.get("key1"));
    }

    @Test
    public void testIteratorBasic() throws Exception {
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
        attrs.put("key3", "value3");

        Iterator<Attribute> it = attrs.iterator();
        it.next(); // key1
        it.next(); // key2
        it.remove(); // remove key2
        assertEquals(2, attrs.size());
        assertFalse(attrs.hasKey("key2"));
        assertEquals("value1", attrs.get("key1"));
        assertEquals("value3", attrs.get("key3"));
    }

    @Test
    public void testAsListBasic() throws Exception {
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
    public void testDatasetBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        attrs.put("data-name", "test");
        attrs.put("other", "value");

        Map<String, String> dataset = attrs.dataset();
        assertEquals("123", dataset.get("id"));
        assertEquals("test", dataset.get("name"));
        assertNull(dataset.get("other"));
        assertEquals(2, dataset.size());
    }

    @Test
    public void testDatasetPut() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        Map<String, String> dataset = attrs.dataset();
        dataset.put("name", "test");
        assertEquals("test", attrs.get("data-name"));
        assertEquals("test", dataset.get("name"));
    }

    @Test
    public void testHtmlBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        assertEquals(" key1=\"value1\" key2=\"value2\"", attrs.html());
    }

    @Test
    public void testHtmlWithSpecialChars() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "<>&'\"");
        assertEquals(" key1=\"&lt;&gt;&amp;&apos;&quot;\"", attrs.html());
    }

    @Test
    public void testToString() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertEquals(" key1=\"value1\"", attrs.toString());
    }

    @Test
    public void testEqualsBasic() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");

        assertTrue(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsDifferentOrder() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");

        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value2");
        attrs2.put("key1", "value1");

        assertTrue(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsDifferentKeys() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value1");

        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    public void testEqualsDifferentValues() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value2");

        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    public void testHashCodeBasic() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");

        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");

        assertEquals(attrs1.hashCode(), attrs2.hashCode());
    }

    @Test
    public void testCloneBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        Attributes clonedAttrs = attrs.clone();

        assertNotSame(attrs, clonedAttrs);
        assertEquals(attrs, clonedAttrs);
        assertEquals(1, clonedAttrs.size());
        assertEquals("value1", clonedAttrs.get("key1"));
    }

    @Test
    public void testCloneModifyOriginal() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        Attributes clonedAttrs = attrs.clone();
        attrs.put("key2", "value2");
        assertEquals(1, clonedAttrs.size());
        assertEquals("value1", clonedAttrs.get("key1"));
        assertFalse(clonedAttrs.hasKey("key2"));
    }

    @Test
    public void testNormalizeBasic() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("KEY1", "value1");
        attrs.put("Key2", "value2");
        attrs.normalize();
        // Accessing internal fields keys and vals directly is generally discouraged,
        // but for testing normalization, it's the most direct way to verify.
        assertEquals("key1", attrs.keys[0]);
        assertEquals("key2", attrs.keys[1]);
    }

    @Test
    public void testDeduplicateWithPreserveCase() throws Exception {
        ParseSettings settings = new ParseSettings(true, true); // preserve case
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value1");
        attrs.put("key", "value2"); // This should be removed because preserveAttributeCase is true, and KEY comes first
        int dupes = attrs.deduplicate(settings);
        assertEquals(1, dupes);
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKey("KEY")); // should keep first encountered with preserve case
        assertEquals("value1", attrs.get("KEY"));
    }

    // Tests for methods not covered in the previous answer

    @Test
    public void testNormalizeTagAndAttribute() throws Exception {
        ParseSettings settings = new ParseSettings(false, false); // preserveTagCase = false, preserveAttributeCase = false
        Attributes attrs = new Attributes();
        attrs.put("KEY", "VALUE"); // Uppercase key and value

        String normalizedTagName = settings.normalizeTag("TagName");
        assertEquals("tagname", normalizedTagName);

        String normalizedAttrName = settings.normalizeAttribute("AttrName");
        assertEquals("attrname", normalizedAttrName);

        attrs.normalize(); // normalize keys within the Attributes object
        // Accessing internal fields keys and vals directly is generally discouraged,
        // but for testing normalization, it's the most direct way to verify.
        assertEquals("key", attrs.keys[0]);
        assertEquals("VALUE", attrs.vals[0]); // Value should remain unchanged as normalize() only affects keys
    }

    @Test
    public void testPreserveTagCase() throws Exception {
        ParseSettings settings = new ParseSettings(true, false); // preserveTagCase = true
        assertTrue(settings.preserveTagCase());
        assertFalse(settings.preserveAttributeCase());
        assertEquals("TagName", settings.normalizeTag("TagName"));
    }

    @Test
    public void testPreserveAttributeCase() throws Exception {
        ParseSettings settings = new ParseSettings(false, true); // preserveAttributeCase = true
        assertFalse(settings.preserveTagCase());
        assertTrue(settings.preserveAttributeCase());
        assertEquals("AttrName", settings.normalizeAttribute("AttrName"));
    }

    @Test
    public void testHtmlWithNullValue() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", null); // Representing a boolean attribute
        assertEquals(" key1", attrs.html()); // Boolean attributes are rendered without a value
    }

    @Test
    public void testHtmlWithEmptyStringValue() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("key1", ""); // Representing an empty string value
        assertEquals(" key1=\"\"", attrs.html());
    }

    @Test
    public void testHtmlAttributeCollapse_CheckedTrue() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("checked", ""); // Simulating a collapsed attribute
        assertEquals(" checked", attrs.html());
    }

    @Test
    public void testHtmlAttributeCollapse_CheckedFalse() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("checked", "false"); // Not a collapsed attribute value
        assertEquals(" checked=\"false\"", attrs.html());
    }

    @Test
    public void testDeduplicatePreserveAttributeCase() throws Exception {
        ParseSettings settings = new ParseSettings(false, true); // preserve attribute case, not tag case
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value1");
        attrs.put("Key", "value2"); // This should be removed because preserveAttributeCase is true, and KEY comes first
        int dupes = attrs.deduplicate(settings);
        assertEquals(1, dupes); // One duplicate should be removed
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKey("KEY")); // The first one (KEY) should be preserved due to preserveAttributeCase=true
        assertEquals("value1", attrs.get("KEY"));
    }

    @Test
    public void testDeduplicatePreserveTagCase() throws Exception {
        ParseSettings settings = new ParseSettings(true, false); // preserve tag case, not attribute case
        Attributes attrs = new Attributes();
        attrs.put("key", "VALUE");
        attrs.put("KEY", "value"); // This should be removed because preserveAttributeCase is false, and 'key' comes first
        int dupes = attrs.deduplicate(settings);
        assertEquals(1, dupes); // One duplicate should be removed
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKey("key")); // The first one (key) should be preserved due to preserveAttributeCase=false
        assertEquals("value", attrs.get("key")); // The value of the duplicate is kept
    }

    @Test
    public void testDatasetPutNew() throws Exception {
        Attributes attrs = new Attributes();
        Map<String, String> dataset = attrs.dataset();
        dataset.put("new", "newValue");
        assertEquals("newValue", attrs.get("data-new"));
        assertTrue(attrs.hasKey("data-new"));
    }

    @Test
    public void testDatasetRemove() throws Exception {
        Attributes attrsToRemove = new Attributes();
        attrsToRemove.put("data-remove", "toRemove");
        Iterator<Map.Entry<String, String>> it = attrsToRemove.dataset().entrySet().iterator();
        assertTrue(it.hasNext()); // Ensure there is an element to remove
        it.next(); // Move to the "remove" entry
        it.remove(); // Remove the attribute
        assertFalse(attrsToRemove.hasKey("data-remove"));
        assertEquals(0, attrsToRemove.size());
    }
}
