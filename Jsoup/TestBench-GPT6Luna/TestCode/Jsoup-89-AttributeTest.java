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
        Attribute attribute = new Attribute("  title  ", "value");
        assertEquals("title", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

    @Test
    public void testConstructorRejectsNullKey() throws Exception {
        try {
            new Attribute(null, "value");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructorRejectsWhitespaceOnlyKey() throws Exception {
        try {
            new Attribute("   ", "value");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetKeyTrimsAndPreservesCase() throws Exception {
        Attribute attribute = new Attribute("name", "value");
        attribute.setKey("  DATA-X ");
        assertEquals("DATA-X", attribute.getKey());
    }

    @Test
    public void testSetKeyRejectsEmptyAfterTrim() throws Exception {
        Attribute attribute = new Attribute("name", "value");
        try {
            attribute.setKey(" \t ");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals("name", attribute.getKey());
    }

    @Test
    public void testSetValueReturnsPreviousValue() throws Exception {
        Attribute attribute = new Attribute("name", "old");
        assertEquals("old", attribute.setValue("new"));
        assertEquals("new", attribute.getValue());
    }

    @Test
    public void testSetValueNullIsReturnedAsEmptyValue() throws Exception {
        Attribute attribute = new Attribute("name", "old");
        assertEquals("old", attribute.setValue(null));
        assertEquals("", attribute.getValue());
    }

    @Test
    public void testGetValueNullIsEmptyValue() throws Exception {
        Attribute attribute = new Attribute("name", null);
        assertEquals("", attribute.getValue());
    }

    @Test
    public void testHtmlEscapesAttributeValue() throws Exception {
        Attribute attribute = new Attribute("title", "a&b");
        assertEquals("title=\"a&amp;b\"", attribute.html());
    }

    @Test
    public void testHtmlRendersEmptyBooleanAttributeCollapsed() throws Exception {
        Attribute attribute = new Attribute("disabled", "");
        assertEquals("disabled", attribute.html());
    }

    @Test
    public void testHtmlRendersBooleanNameValueCollapsed() throws Exception {
        Attribute attribute = new Attribute("checked", "CHECKED");
        assertEquals("checked", attribute.html());
    }

    @Test
    public void testHtmlDoesNotCollapseOrdinaryAttribute() throws Exception {
        Attribute attribute = new Attribute("title", "");
        assertEquals("title=\"\"", attribute.html());
    }

    @Test
    public void testToStringMatchesHtml() throws Exception {
        Attribute attribute = new Attribute("href", "index");
        assertEquals("href=\"index\"", attribute.toString());
        assertEquals(attribute.html(), attribute.toString());
    }

    @Test
    public void testCreateFromEncodedUnescapesValue() throws Exception {
        Attribute attribute = Attribute.createFromEncoded("title", "a&amp;b");
        assertEquals("title", attribute.getKey());
        assertEquals("a&b", attribute.getValue());
    }

    @Test
    public void testCreateFromEncodedDecodesNumericEntity() throws Exception {
        Attribute attribute = Attribute.createFromEncoded("title", "&#65;");
        assertEquals("A", attribute.getValue());
    }

    @Test
    public void testEqualsUsesKeyAndValue() throws Exception {
        Attribute first = new Attribute("name", "value");
        Attribute same = new Attribute("name", "value");
        Attribute different = new Attribute("name", "other");
        assertEquals(first, same);
        assertFalse(first.equals(different));
    }

    @Test
    public void testEqualsRejectsNullAndDifferentObjectType() throws Exception {
        Attribute attribute = new Attribute("name", "value");
        assertFalse(attribute.equals(null));
        assertFalse(attribute.equals("name"));
    }

    @Test
    public void testEqualsDistinguishesKeyCase() throws Exception {
        Attribute lower = new Attribute("name", "value");
        Attribute upper = new Attribute("Name", "value");
        assertFalse(lower.equals(upper));
    }

    @Test
    public void testHashCodeMatchesKeyAndValueFormula() throws Exception {
        Attribute attribute = new Attribute("a", "b");
        assertEquals(31 * "a".hashCode() + "b".hashCode(), attribute.hashCode());
    }

    @Test
    public void testHashCodeHandlesNullValue() throws Exception {
        Attribute attribute = new Attribute("a", null);
        assertEquals(31 * "a".hashCode(), attribute.hashCode());
    }

    @Test
    public void testCloneIsEqualAndIndependentAfterMutation() throws Exception {
        Attribute original = new Attribute("name", "value");
        Attribute copy = original.clone();
        assertEquals(original, copy);
        copy.setValue("changed");
        assertEquals("value", original.getValue());
        assertEquals("changed", copy.getValue());
    }
}
