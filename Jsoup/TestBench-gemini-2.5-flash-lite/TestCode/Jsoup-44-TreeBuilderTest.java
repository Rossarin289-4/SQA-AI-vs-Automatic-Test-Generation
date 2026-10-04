package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.ArrayList;
import java.util.Map;

public class TreeBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testProcessStartTag_simple() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body>Hello</body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        assertTrue(tb.processStartTag("div", attrs)); // Expect true for successful processing
        assertEquals("div", tb.currentElement().tagName());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_withAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("id", "test-id");
        attrs.put("class", "test-class");
        assertTrue(tb.processStartTag("p", attrs));
        assertEquals("p", tb.currentElement().tagName());
        assertEquals("test-id", tb.currentElement().id());
        assertEquals("test-class", tb.currentElement().className());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_nested() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        assertTrue(tb.processStartTag("div", new Attributes()));
        assertTrue(tb.processStartTag("span", new Attributes()));
        assertEquals("span", tb.currentElement().tagName());
        assertEquals(2, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_withEmptyAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        assertTrue(tb.processStartTag("a", attrs));
        assertEquals("a", tb.currentElement().tagName());
        assertEquals(0, tb.currentElement().attributes().size());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_existingElementAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("href", "http://example.com");
        assertTrue(tb.processStartTag("link", attrs));
        assertEquals("link", tb.currentElement().tagName());
        assertEquals("http://example.com", tb.currentElement().attr("href"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_multipleAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("data-id", "123");
        attrs.put("data-value", "abc");
        assertTrue(tb.processStartTag("custom", attrs));
        assertEquals("custom", tb.currentElement().tagName());
        assertEquals("123", tb.currentElement().dataset().get("id"));
        assertEquals("abc", tb.currentElement().dataset().get("value"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_caseInsensitiveTagName() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        assertTrue(tb.processStartTag("DiV", attrs)); // Test with mixed case tag name
        assertEquals("div", tb.currentElement().tagName()); // Expect it to be normalized to lowercase
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_tagNameWithHyphen() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        assertTrue(tb.processStartTag("custom-tag", attrs));
        assertEquals("custom-tag", tb.currentElement().tagName());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributeValueWithSpaces() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("title", "This is a title");
        assertTrue(tb.processStartTag("h1", attrs));
        assertEquals("h1", tb.currentElement().tagName());
        assertEquals("This is a title", tb.currentElement().attr("title"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributeValueWithQuotes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("data-val", "\"quoted value\"");
        assertTrue(tb.processStartTag("data", attrs));
        assertEquals("data", tb.currentElement().tagName());
        assertEquals("\"quoted value\"", tb.currentElement().attr("data-val"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributeKeyWithHyphen() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("aria-label", "Close button");
        assertTrue(tb.processStartTag("button", attrs));
        assertEquals("button", tb.currentElement().tagName());
        assertEquals("Close button", tb.currentElement().attr("aria-label"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributeKeyWithUnderscore() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("data_custom", "some_value");
        assertTrue(tb.processStartTag("test", attrs));
        assertEquals("test", tb.currentElement().tagName());
        assertEquals("some_value", tb.currentElement().attr("data_custom"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_emptyTagName() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        // The tokeniser might handle this, but processStartTag expects a valid name.
        // An empty string here will likely lead to an exception from Validate.notEmpty
        // if that's implicitly used by the method or the underlying token processing.
        // Looking at the source, it directly creates a Token.StartTag, which can have an empty name.
        // The 'name' parameter is used to set the tag name.
        assertTrue(tb.processStartTag("", attrs));
        assertEquals("", tb.currentElement().tagName());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_nullTagName() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        // Validate.notNull is called on input and baseUri in initialiseParse,
        // but not directly on the tag name String parameter here.
        // If `start.nameAttr(name, attrs)` is called with null `name`, it might throw NPE.
        // Let's test for the expected NPE.
        try {
            tb.processStartTag(null, attrs);
            fail("Expected NullPointerException for null tag name");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testProcessStartTag_nullAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        // Validate.notNull is not applied to attrs parameter directly.
        // The `start.nameAttr(name, attrs)` method will be called. If attrs is null, it will throw NPE.
        try {
            tb.processStartTag("div", null);
            fail("Expected NullPointerException for null attributes");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testProcessStartTag_maxAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        for (int i = 0; i < 100; i++) {
            attrs.put("attr" + i, "value" + i);
        }
        assertTrue(tb.processStartTag("big", attrs));
        assertEquals("big", tb.currentElement().tagName());
        assertEquals(100, tb.currentElement().attributes().size());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_longTagName() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        String longTagName = "a".repeat(50); // A very long tag name
        Attributes attrs = new Attributes();
        assertTrue(tb.processStartTag(longTagName, attrs));
        assertEquals(longTagName, tb.currentElement().tagName());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_tagNameWithSpecialCharacters() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        // The String tag name can contain these. The resulting element will have this tagName.
        assertTrue(tb.processStartTag("tag!@#$", attrs));
        assertEquals("tag!@#$", tb.currentElement().tagName());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributeValueWithEmptyString() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("data-empty", "");
        assertTrue(tb.processStartTag("element", attrs));
        assertEquals("element", tb.currentElement().tagName());
        assertEquals("", tb.currentElement().attr("data-empty"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributeValueWithNullString() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        // Attributes.put(key, null) will store null. get() will return null.
        attrs.put("data-null", null);
        assertTrue(tb.processStartTag("element", attrs));
        assertEquals("element", tb.currentElement().tagName());
        assertNull(tb.currentElement().attr("data-null"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_duplicateAttributeKey() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("key", "value1");
        attrs.put("key", "value2"); // Duplicate key, last one should win
        assertTrue(tb.processStartTag("element", attrs));
        assertEquals("element", tb.currentElement().tagName());
        assertEquals("value2", tb.currentElement().attr("key")); // Expecting the last value
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_booleanAttribute() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("required", ""); // Boolean attribute, value is often ignored
        assertTrue(tb.processStartTag("input", attrs));
        assertEquals("input", tb.currentElement().tagName());
        // The behavior of "boolean attributes" in HTML parsing is complex.
        // In Jsoup, attributes are stored as key-value pairs. An empty string value is common for boolean attributes.
        assertEquals("", tb.currentElement().attr("required"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributeWithNonAsciiChars() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("data-unicode", "你好世界"); // Unicode characters
        assertTrue(tb.processStartTag("test", attrs));
        assertEquals("test", tb.currentElement().tagName());
        assertEquals("你好世界", tb.currentElement().attr("data-unicode"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_manyNestedElements() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        int depth = 50; // Sufficient depth to test stack behavior
        for (int i = 0; i < depth; i++) {
            assertTrue(tb.processStartTag("div", new Attributes()));
        }
        assertEquals("div", tb.currentElement().tagName());
        // The initial 'html' tag is not explicitly added by processStartTag calls, but the stack starts empty.
        // After processing 'div' 50 times, the stack should have 50 elements.
        assertEquals(depth, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributesAfterTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        assertTrue(tb.processStartTag("body", attrs));
        assertEquals("body", tb.currentElement().tagName());
        assertEquals("main", tb.currentElement().id());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_tagNameAsEmptyStringInAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        // Passing an empty string as an attribute key. Attributes map might handle this.
        // The get() method on Attributes can retrieve values for empty keys.
        attrs.put("", "value");
        assertTrue(tb.processStartTag("element", attrs));
        assertEquals("element", tb.currentElement().tagName());
        assertEquals("value", tb.currentElement().attr(""));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributesAddedIncrementally() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs1 = new Attributes();
        attrs1.put("a", "1");
        assertTrue(tb.processStartTag("div", attrs1));
        assertEquals("1", tb.currentElement().attr("a"));

        Attributes attrs2 = new Attributes();
        attrs2.put("b", "2");
        // This test should not re-use the `tb` state from the previous `processStartTag` call.
        // A new call to `processStartTag` adds a new element.
        // To test incremental attribute adding to an *existing* element's state,
        // we would need to call `processStartTag` with the same tag name and potentially merge attributes,
        // but the method signature doesn't support that directly for modifying an existing element on the stack.
        // This call adds a new element.
        assertTrue(tb.processStartTag("span", attrs2));
        assertEquals("span", tb.currentElement().tagName());
        assertEquals("2", tb.currentElement().attr("b"));
        assertEquals(2, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributeValueWithHtmlEntities() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        // HTML entities are typically resolved by the tokeniser. This method receives the string as is.
        attrs.put("title", "Less than &lt; Greater than &gt;");
        assertTrue(tb.processStartTag("div", attrs));
        assertEquals("div", tb.currentElement().tagName());
        assertEquals("Less than &lt; Greater than &gt;", tb.currentElement().attr("title"));
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_attributesInDifferentOrder() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs1 = new Attributes();
        attrs1.put("class", "c1");
        attrs1.put("id", "i1");

        Attributes attrs2 = new Attributes();
        attrs2.put("id", "i1");
        attrs2.put("class", "c1");

        assertTrue(tb.processStartTag("div", attrs1));
        assertEquals("c1", tb.currentElement().className());
        assertEquals("i1", tb.currentElement().id());

        // Resetting the parser state for a fresh test
        tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        assertTrue(tb.processStartTag("div", attrs2));
        assertEquals("c1", tb.currentElement().className());
        assertEquals("i1", tb.currentElement().id());
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_tagNameWithLeadingWhitespace() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        // The String tag name can contain leading whitespace. The current code doesn't trim it.
        assertTrue(tb.processStartTag("  div", attrs));
        assertEquals("  div", tb.currentElement().tagName()); // Expecting it to keep the whitespace
        assertEquals(1, tb.stack.size());
    }

    @Test
    public void testProcessStartTag_tagNameWithTrailingWhitespace() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        // The String tag name can contain trailing whitespace. The current code doesn't trim it.
        assertTrue(tb.processStartTag("div  ", attrs));
        assertEquals("div  ", tb.currentElement().tagName()); // Expecting it to keep the whitespace
        assertEquals(1, tb.stack.size());
    }
}
