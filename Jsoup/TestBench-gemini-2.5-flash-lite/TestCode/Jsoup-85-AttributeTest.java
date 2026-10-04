package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class AttributeTest {
    @Test
    public void testGetKey() throws Exception {
        Attribute attribute = new Attribute("key", "value");
        assertEquals("key", attribute.getKey());
    }

    @Test
    public void testGetKeyWithWhitespace() throws Exception {
        Attribute attribute = new Attribute("  key  ", "value");
        assertEquals("key", attribute.getKey());
    }

    @Test
    public void testGetValue() throws Exception {
        Attribute attribute = new Attribute("key", "value");
        assertEquals("value", attribute.getValue());
    }

    @Test
    public void testGetValueWhenNull() throws Exception {
        Attribute attribute = new Attribute("key", null);
        assertNull(attribute.getValue());
    }

    @Test
    public void testSetKey() throws Exception {
        Attribute attribute = new Attribute("oldKey", "value");
        attribute.setKey("newKey");
        assertEquals("newKey", attribute.getKey());
    }

    @Test
    public void testSetKeyWithWhitespace() throws Exception {
        Attribute attribute = new Attribute("oldKey", "value");
        attribute.setKey("  newKey  ");
        assertEquals("newKey", attribute.getKey());
    }

    // This test needs to be adapted as IllegalArgumentException is expected from Validate.notEmpty
    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyToNull() throws Exception {
        Attribute attribute = new Attribute("key", "value");
        attribute.setKey(null);
    }

    // This test needs to be adapted as IllegalArgumentException is expected from Validate.notEmpty
    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyToEmpty() throws Exception {
        Attribute attribute = new Attribute("key", "value");
        attribute.setKey("");
    }

    // This test needs to be adapted as IllegalArgumentException is expected from Validate.notEmpty
    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyToBlank() throws Exception {
        Attribute attribute = new Attribute("key", "value");
        attribute.setKey("   ");
    }

    @Test
    public void testSetValue() throws Exception {
        Attribute attribute = new Attribute("key", "oldValue");
        // The setValue method in Attribute directly updates `this.val` and also updates the parent's value.
        // To test this without a parent, we can directly set the value and assert.
        // The original test might have been trying to assert a side effect on a parent, which isn't directly testable here without setting up a parent.
        // For simplicity, we will focus on the direct update of `this.val`.
        attribute.setValue("newValue");
        assertEquals("newValue", attribute.getValue());
    }

    @Test
    public void testSetValueToNull() throws Exception {
        Attribute attribute = new Attribute("key", "oldValue");
        attribute.setValue(null);
        assertNull(attribute.getValue());
    }

    @Test
    public void testHtml() throws Exception {
        Attribute attribute = new Attribute("href", "index.html");
        assertEquals("href=\"index.html\"", attribute.html());
    }

    @Test
    public void testHtmlBooleanAttributeNoValue() throws Exception {
        Attribute attribute = new Attribute("disabled", "");
        Document doc = new Document("about:blank"); // Need a document to get OutputSettings
        Document.OutputSettings outputSettings = doc.outputSettings();
        outputSettings.syntax(Document.OutputSettings.Syntax.html);
        assertEquals("disabled", attribute.html());
    }

    @Test
    public void testHtmlBooleanAttributeWithValueSameAsKey() throws Exception {
        Attribute attribute = new Attribute("checked", "checked");
        Document doc = new Document("about:blank"); // Need a document to get OutputSettings
        Document.OutputSettings outputSettings = doc.outputSettings();
        outputSettings.syntax(Document.OutputSettings.Syntax.html);
        assertEquals("checked", attribute.html());
    }

    @Test
    public void testHtmlBooleanAttributeWithValueDifferentThanKey() throws Exception {
        Attribute attribute = new Attribute("checked", "true");
        Document doc = new Document("about:blank"); // Need a document to get OutputSettings
        Document.OutputSettings outputSettings = doc.outputSettings();
        outputSettings.syntax(Document.OutputSettings.Syntax.html);
        assertEquals("checked=\"true\"", attribute.html());
    }

    @Test
    public void testHtmlWithSpecialChars() throws Exception {
        Attribute attribute = new Attribute("data-value", "a < b & c > d");
        // The Entities.escape method handles the encoding. Tracing `html()` method:
        // it calls `html(key, val, accum, out)` which then calls `Entities.escape(accum, Attributes.checkNotNull(val) , out, true, false, false);`
        // The `true` for inAttribute means quotes within values are encoded.
        assertEquals("data-value=\"a &lt; b &amp; c &gt; d\"", attribute.html());
    }

    @Test
    public void testHtmlWithQuotes() throws Exception {
        Attribute attribute = new Attribute("title", "It's a \"test\"");
        // Tracing `html()` method: it calls `Entities.escape(accum, Attributes.checkNotNull(val) , out, true, false, false);`
        // The `true` for inAttribute means quotes within values are encoded.
        // ' is encoded as &apos; and " as &quot;
        assertEquals("title=\"It&apos;s a &quot;test&quot;\"", attribute.html());
    }

    @Test
    public void testToString() throws Exception {
        Attribute attribute = new Attribute("name", "value");
        assertEquals("name=\"value\"", attribute.toString());
    }

    @Test
    public void testCreateFromEncoded() throws Exception {
        Attribute attribute = Attribute.createFromEncoded("href", "index.html");
        assertEquals("href", attribute.getKey());
        assertEquals("index.html", attribute.getValue());
    }

    @Test
    public void testCreateFromEncodedWithEntities() throws Exception {
        Attribute attribute = Attribute.createFromEncoded("title", "It&apos;s a &quot;test&quot;");
        assertEquals("title", attribute.getKey());
        assertEquals("It's a \"test\"", attribute.getValue());
    }

    @Test
    public void testEqualsSameAttribute() throws Exception {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertTrue(attr1.equals(attr2));
    }

    @Test
    public void testEqualsDifferentKey() throws Exception {
        Attribute attr1 = new Attribute("key1", "value");
        Attribute attr2 = new Attribute("key2", "value");
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testEqualsDifferentValue() throws Exception {
        Attribute attr1 = new Attribute("key", "value1");
        Attribute attr2 = new Attribute("key", "value2");
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testEqualsNullValue() throws Exception {
        Attribute attr1 = new Attribute("key", null);
        Attribute attr2 = new Attribute("key", null);
        assertTrue(attr1.equals(attr2));
    }

    @Test
    public void testEqualsNullValueWithNonNullValue() throws Exception {
        Attribute attr1 = new Attribute("key", null);
        Attribute attr2 = new Attribute("key", "value");
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testEqualsNonNullValueWithNullValue() throws Exception {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", null);
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testHashCodeSameAttribute() throws Exception {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testHashCodeDifferentKey() throws Exception {
        Attribute attr1 = new Attribute("key1", "value");
        Attribute attr2 = new Attribute("key2", "value");
        assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testHashCodeDifferentValue() throws Exception {
        Attribute attr1 = new Attribute("key", "value1");
        Attribute attr2 = new Attribute("key", "value2");
        assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testClone() throws Exception {
        Attribute original = new Attribute("key", "value");
        Attribute cloned = original.clone();
        assertNotSame(original, cloned);
        assertEquals(original.getKey(), cloned.getKey());
        assertEquals(original.getValue(), cloned.getValue());
    }

    @Test
    public void testCloneWithNullValue() throws Exception {
        Attribute original = new Attribute("key", null);
        Attribute cloned = original.clone();
        assertNotSame(original, cloned);
        assertEquals(original.getKey(), cloned.getKey());
        assertNull(cloned.getValue());
    }
}
