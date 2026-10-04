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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorSetsKeyAndValue() {
        Attribute attr = new Attribute("key", "value");
        assertEquals("key", attr.getKey());
        assertEquals("value", attr.getValue());
    }

    @Test
    public void testGetKey() {
        Attribute attr = new Attribute("testKey", "testValue");
        assertEquals("testKey", attr.getKey());
    }

    @Test
    public void testSetKey() {
        Attribute attr = new Attribute("oldKey", "value");
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void testGetValue() {
        Attribute attr = new Attribute("key", "testValue");
        assertEquals("testValue", attr.getValue());
    }

    @Test
    public void testSetValue() {
        Attribute attr = new Attribute("key", "oldValue");
        String oldValue = attr.setValue("newValue");
        assertEquals("newValue", attr.getValue());
        assertEquals("oldValue", oldValue);
    }

    @Test
    public void testHtmlAttributeBasic() throws IOException {
        Attribute attr = new Attribute("href", "index.html");
        Document doc = Document.createShell("http://example.com");
        String html = attr.html();
        assertEquals("href=\"index.html\"", html);
    }

    @Test
    public void testHtmlAttributeWithSpecialChars() throws IOException {
        Attribute attr = new Attribute("data-url", "http://example.com?a=1&b=2");
        Document doc = Document.createShell("http://example.com");
        String html = attr.html();
        assertEquals("data-url=\"http://example.com?a=1&amp;b=2\"", html);
    }

    @Test
    public void testHtmlAttributeBooleanTrue() throws IOException {
        Attribute attr = new Attribute("disabled", "");
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().syntax(Document.OutputSettings.Syntax.html);
        String html = attr.html();
        assertEquals("disabled", html);
    }

    @Test
    public void testHtmlAttributeBooleanTrueWithValueSameAsKey() throws IOException {
        Attribute attr = new Attribute("required", "required");
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().syntax(Document.OutputSettings.Syntax.html);
        String html = attr.html();
        assertEquals("required", html);
    }

    @Test
    public void testHtmlAttributeBooleanTrueWithValueDifferentFromKey() throws IOException {
        Attribute attr = new Attribute("checked", "true");
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().syntax(Document.OutputSettings.Syntax.html);
        String html = attr.html();
        assertEquals("checked=\"true\"", html);
    }

    @Test
    public void testHtmlAttributeNonBoolean() throws IOException {
        Attribute attr = new Attribute("class", "myClass");
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().syntax(Document.OutputSettings.Syntax.html);
        String html = attr.html();
        assertEquals("class=\"myClass\"", html);
    }

    @Test
    public void testToStringIsHtml() {
        Attribute attr = new Attribute("id", "main");
        assertEquals("id=\"main\"", attr.toString());
    }

    @Test
    public void testCreateFromEncodedBasic() {
        Attribute attr = Attribute.createFromEncoded("name", "John Doe");
        assertEquals("name", attr.getKey());
        assertEquals("John Doe", attr.getValue());
    }

    @Test
    public void testCreateFromEncodedWithEntities() {
        Attribute attr = Attribute.createFromEncoded("title", "Hello &amp; Welcome");
        assertEquals("title", attr.getKey());
        assertEquals("Hello & Welcome", attr.getValue());
    }

    @Test
    public void testEqualsSameAttribute() {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertTrue(attr1.equals(attr2));
    }

    @Test
    public void testEqualsDifferentKey() {
        Attribute attr1 = new Attribute("key1", "value");
        Attribute attr2 = new Attribute("key2", "value");
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testEqualsDifferentValue() {
        Attribute attr1 = new Attribute("key", "value1");
        Attribute attr2 = new Attribute("key", "value2");
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testEqualsNull() {
        Attribute attr = new Attribute("key", "value");
        assertFalse(attr.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Attribute attr = new Attribute("key", "value");
        Object other = new Object();
        assertFalse(attr.equals(other));
    }

    @Test
    public void testHashCodeSameAttribute() {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testHashCodeDifferentKey() {
        Attribute attr1 = new Attribute("key1", "value");
        Attribute attr2 = new Attribute("key2", "value");
        assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testHashCodeDifferentValue() {
        Attribute attr1 = new Attribute("key", "value1");
        Attribute attr2 = new Attribute("key", "value2");
        assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testClone() {
        Attribute original = new Attribute("name", "value");
        Attribute cloned = original.clone();
        assertNotSame(original, cloned);
        assertEquals(original.getKey(), cloned.getKey());
        assertEquals(original.getValue(), cloned.getValue());
    }

    @Test
    public void testConstructorValidatesNotNullKey() {
        try {
            new Attribute(null, "value");
            fail("Expected IllegalArgumentException for null key");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorValidatesNotEmptyKey() {
        try {
            new Attribute("  ", "value");
            fail("Expected IllegalArgumentException for empty key after trim");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetKeyValidatesNotNull() {
        Attribute attr = new Attribute("key", "value");
        try {
            attr.setKey(null);
            fail("Expected IllegalArgumentException for null key");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetKeyValidatesNotEmpty() {
        Attribute attr = new Attribute("key", "value");
        try {
            attr.setKey("   ");
            fail("Expected IllegalArgumentException for empty key after trim");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetValueHandlesNullInternally() {
        Attribute attr = new Attribute("key", null);
        // The reference source's checkNotNull on getValue() ensures that a null value is treated as an empty string.
        assertEquals("", attr.getValue());
    }

    @Test
    public void testSetValueReturnsOldValue() {
        Attribute attr = new Attribute("key", "oldValue");
        String oldValue = attr.setValue("newValue");
        assertEquals("oldValue", oldValue);
    }

    @Test
    public void testIsDataAttribute() {
        Attribute attr = new Attribute("data-id", "123");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttributeFalse() {
        Attribute attr = new Attribute("id", "main");
        assertFalse(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttributeTooShort() {
        Attribute attr = new Attribute("data-", "");
        assertFalse(attr.isDataAttribute());
    }

    @Test
    public void testShouldCollapseAttributeBooleanFalse() throws IOException {
        Attribute attr = new Attribute("checked", "false");
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().syntax(Document.OutputSettings.Syntax.html);
        assertFalse(attr.shouldCollapseAttribute(doc.outputSettings()));
    }

    @Test
    public void testShouldCollapseAttributeNonBoolean() throws IOException {
        Attribute attr = new Attribute("class", "myClass");
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().syntax(Document.OutputSettings.Syntax.html);
        assertFalse(attr.shouldCollapseAttribute(doc.outputSettings()));
    }

    @Test
    public void testIsBooleanAttributeStaticTrue() {
        assertTrue(Attribute.isBooleanAttribute("disabled"));
    }

    @Test
    public void testIsBooleanAttributeStaticFalse() {
        assertFalse(Attribute.isBooleanAttribute("href"));
    }

    @Test
    public void testConstructorTrimsKey() {
        Attribute attr = new Attribute("  key  ", "value");
        assertEquals("key", attr.getKey());
    }

    @Test
    public void testSetKeyTrimsKey() {
        Attribute attr = new Attribute("key", "value");
        attr.setKey("  newKey  ");
        assertEquals("newKey", attr.getKey());
    }
}
