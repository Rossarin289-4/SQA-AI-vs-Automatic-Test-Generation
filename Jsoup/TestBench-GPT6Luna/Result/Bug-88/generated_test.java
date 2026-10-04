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
    public void testConstructorTrimsKey() throws Exception {
        assertEquals("id", new Attribute(" id ", "x").getKey());
    }

    @Test
    public void testConstructorPreservesKeyCase() throws Exception {
        assertEquals("Data-X", new Attribute("Data-X", "v").getKey());
    }

    @Test
    public void testSetKeyTrimsAndPreservesCase() throws Exception {
        Attribute attribute = new Attribute("old", "v");
        attribute.setKey(" New ");
        assertEquals("New", attribute.getKey());
    }

    @Test
    public void testSetKeyRejectsNull() throws Exception {
        Attribute attribute = new Attribute("key", "v");
        try {
            attribute.setKey(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals("key", attribute.getKey());
    }

    @Test
    public void testSetKeyRejectsWhitespaceOnly() throws Exception {
        Attribute attribute = new Attribute("key", "v");
        try {
            attribute.setKey("  ");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals("key", attribute.getKey());
    }

    @Test
    public void testGetValue() throws Exception {
        assertEquals("value", new Attribute("key", "value").getValue());
    }

    @Test
    public void testNullValueReadsAsEmptyString() throws Exception {
        assertEquals("", new Attribute("key", null).getValue());
    }

    @Test
    public void testSetValueReturnsOldValueWithoutParent() throws Exception {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "before", attributes);
        attributes.put(attribute);
        assertEquals("before", attribute.setValue("after"));
        assertEquals("after", attribute.getValue());
    }

    @Test
    public void testSetValueUpdatesContainingAttributes() throws Exception {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "before", attributes);
        attributes.put(attribute);
        assertEquals("before", attribute.setValue("after"));
        assertEquals("after", attributes.get("key"));
    }

    @Test
    public void testHtmlEscapesAttributeValue() throws Exception {
        assertEquals("title=\"A&amp;B\"", new Attribute("title", "A&B").html());
    }

    @Test
    public void testHtmlCollapsesEmptyBooleanAttribute() throws Exception {
        assertEquals("disabled", new Attribute("disabled", "").html());
    }

    @Test
    public void testHtmlDoesNotCollapseNonBooleanAttribute() throws Exception {
        assertEquals("title=\"\"", new Attribute("title", "").html());
    }

    @Test
    public void testToStringUsesHtmlRepresentation() throws Exception {
        Attribute attribute = new Attribute("id", "x");
        assertEquals(attribute.html(), attribute.toString());
    }

    @Test
    public void testCreateFromEncodedUnescapesValue() throws Exception {
        assertEquals("A&B", Attribute.createFromEncoded("title", "A&amp;B").getValue());
    }

    @Test
    public void testCreateFromEncodedKeepsPlainValue() throws Exception {
        assertEquals("plain", Attribute.createFromEncoded("title", "plain").getValue());
    }

    @Test
    public void testEqualsSameKeyAndValue() throws Exception {
        assertEquals(new Attribute("id", "x"), new Attribute("id", "x"));
    }

    @Test
    public void testEqualsDistinguishesKey() throws Exception {
        assertNotEquals(new Attribute("id", "x"), new Attribute("name", "x"));
    }

    @Test
    public void testEqualsDistinguishesNullAndEmptyValue() throws Exception {
        assertNotEquals(new Attribute("key", null), new Attribute("key", ""));
    }

    @Test
    public void testHashCodeMatchesEqualAttribute() throws Exception {
        Attribute first = new Attribute("id", "x");
        Attribute second = new Attribute("id", "x");
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testCloneHasEqualContents() throws Exception {
        Attribute attribute = new Attribute("id", "x");
        assertEquals(attribute, attribute.clone());
    }
}
