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
    public void testConstructorTrimsKeyAndPreservesValue() throws Exception {
        Attribute attribute = new Attribute("  id  ", "main");
        assertEquals("id", attribute.getKey());
        assertEquals("main", attribute.getValue());
    }

    @Test
    public void testConstructorAllowsNullValue() throws Exception {
        Attribute attribute = new Attribute("checked", null);
        assertNull(attribute.getValue());
    }

    @Test
    public void testConstructorRejectsNullKey() throws Exception {
        try {
            new Attribute(null, "x");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructorRejectsKeyTrimmedToEmpty() throws Exception {
        try {
            new Attribute("   ", "x");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetKeyTrimsAndPreservesCase() throws Exception {
        Attribute attribute = new Attribute("old", "v");
        attribute.setKey("  NewKey ");
        assertEquals("NewKey", attribute.getKey());
    }

    @Test
    public void testSetKeyRejectsNull() throws Exception {
        Attribute attribute = new Attribute("old", "v");
        try {
            attribute.setKey(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetKeyRejectsBlankAfterTrim() throws Exception {
        Attribute attribute = new Attribute("old", "v");
        try {
            attribute.setKey("  ");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetValueReturnsOldValueAndChangesValue() throws Exception {
        Attributes parent = new Attributes();
        parent.put("name", "before");
        Attribute attribute = parent.asList().get(0);
        assertEquals("before", attribute.setValue("after"));
        assertEquals("after", attribute.getValue());
        assertEquals("after", parent.get("name"));
    }

    @Test
    public void testSetValueFromNull() throws Exception {
        Attributes parent = new Attributes();
        parent.put("name", (String) null);
        Attribute attribute = parent.asList().get(0);
        assertNull(attribute.setValue("after"));
        assertEquals("after", attribute.getValue());
    }

    @Test
    public void testHtmlEscapesAttributeValue() throws Exception {
        Attribute attribute = new Attribute("title", "a&b");
        assertEquals("title=\"a&amp;b\"", attribute.html());
    }

    @Test
    public void testHtmlCollapsesBooleanAttributeWithEmptyValue() throws Exception {
        Attribute attribute = new Attribute("checked", "");
        assertEquals("checked", attribute.html());
    }

    @Test
    public void testHtmlCollapsesBooleanAttributeWithMatchingValue() throws Exception {
        Attribute attribute = new Attribute("checked", "CHECKED");
        assertEquals("checked", attribute.html());
    }

    @Test
    public void testHtmlDoesNotCollapseNonBooleanAttribute() throws Exception {
        Attribute attribute = new Attribute("title", "");
        assertEquals("title=\"\"", attribute.html());
    }

    @Test
    public void testHtmlNullValueCollapsesInHtmlSyntax() throws Exception {
        Attribute attribute = new Attribute("title", null);
        assertEquals("title", attribute.html());
    }

    @Test
    public void testToStringMatchesHtml() throws Exception {
        Attribute attribute = new Attribute("title", "value");
        assertEquals(attribute.html(), attribute.toString());
    }

    @Test
    public void testCreateFromEncodedUnescapesValue() throws Exception {
        Attribute attribute = Attribute.createFromEncoded("title", "a&amp;b");
        assertEquals("title", attribute.getKey());
        assertEquals("a&b", attribute.getValue());
    }

    @Test
    public void testCreateFromEncodedPreservesPlainValue() throws Exception {
        Attribute attribute = Attribute.createFromEncoded("id", "main");
        assertEquals("main", attribute.getValue());
    }

    @Test
    public void testEqualsSameKeyAndValue() throws Exception {
        assertEquals(new Attribute("id", "x"), new Attribute("id", "x"));
    }

    @Test
    public void testEqualsDistinguishesKeyAndValue() throws Exception {
        assertNotEquals(new Attribute("id", "x"), new Attribute("ID", "x"));
        assertNotEquals(new Attribute("id", "x"), new Attribute("id", "y"));
    }

    @Test
    public void testEqualsNullValues() throws Exception {
        assertEquals(new Attribute("id", null), new Attribute("id", null));
        assertNotEquals(new Attribute("id", null), new Attribute("id", ""));
    }

    @Test
    public void testEqualsNullAndDifferentObjectType() throws Exception {
        Attribute attribute = new Attribute("id", "x");
        assertFalse(attribute.equals(null));
        assertFalse(attribute.equals("id"));
    }

    @Test
    public void testHashCodeUsesKeyAndValue() throws Exception {
        Attribute attribute = new Attribute("id", "x");
        assertEquals(31 * "id".hashCode() + "x".hashCode(), attribute.hashCode());
    }

    @Test
    public void testHashCodeWithNullValue() throws Exception {
        Attribute attribute = new Attribute("id", null);
        assertEquals(31 * "id".hashCode(), attribute.hashCode());
    }

    @Test
    public void testCloneHasEqualKeyAndValue() throws Exception {
        Attribute attribute = new Attribute("id", "x");
        Attribute copy = attribute.clone();
        assertNotSame(attribute, copy);
        assertEquals(attribute, copy);
        assertEquals("id", copy.getKey());
        assertEquals("x", copy.getValue());
    }
}
