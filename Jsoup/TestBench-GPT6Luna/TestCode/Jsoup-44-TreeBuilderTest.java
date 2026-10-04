package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.ArrayList;

public class TreeBuilderTest {
    @Test
    public void testProcessTagOnEmptyInput() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        Attributes attrs = new Attributes();
        attrs.put("id", "x");
        assertTrue(builder.processStartTag("div", attrs));
        assertEquals(1, doc.body().children().size());
        assertEquals("x", doc.body().child(0).id());
    }

    @Test
    public void testAddsAttributesToCreatedElement() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        Attributes attrs = new Attributes();
        attrs.put("class", "note");
        assertTrue(builder.processStartTag("p", attrs));
        assertEquals("note", doc.body().child(0).attr("class", "note").attr("class"));
    }

    @Test
    public void testEmptyAttributes() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        assertTrue(builder.processStartTag("section", new Attributes()));
        assertEquals("section", doc.body().child(0).tagName());
    }

    @Test
    public void testUppercaseTagName() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        assertTrue(builder.processStartTag("DIV", new Attributes()));
        assertEquals("div", doc.body().child(0).tagName());
    }

    @Test
    public void testConsecutiveTags() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        assertTrue(builder.processStartTag("div", new Attributes()));
        assertTrue(builder.processStartTag("span", new Attributes()));
        assertEquals(1, doc.body().children().size());
        assertEquals("span", doc.body().child(0).child(0).tagName());
    }

    @Test
    public void testAttributesRemainOnFirstTagAfterSecondTag() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        Attributes attrs = new Attributes();
        attrs.put("id", "first");
        assertTrue(builder.processStartTag("div", attrs));
        assertTrue(builder.processStartTag("em", new Attributes()));
        assertEquals("first", doc.body().child(0).id());
        assertEquals("em", doc.body().child(0).child(0).tagName());
    }

    @Test
    public void testAttributeValueWithSpace() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        Attributes attrs = new Attributes();
        attrs.put("title", "two words");
        assertTrue(builder.processStartTag("p", attrs));
        assertEquals("two words", doc.body().child(0).attr("title"));
    }

    @Test
    public void testMultipleAttributes() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        Attributes attrs = new Attributes();
        attrs.put("id", "a");
        attrs.put("class", "b");
        assertTrue(builder.processStartTag("div", attrs));
        assertEquals("a", doc.body().child(0).id());
        assertEquals("b", doc.body().child(0).attr("class"));
    }

    @Test
    public void testAttributeContainingEmptyValue() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        Attributes attrs = new Attributes();
        attrs.put("title", "");
        assertTrue(builder.processStartTag("p", attrs));
        assertEquals("", doc.body().child(0).attr("title"));
    }

    @Test
    public void testRepeatedAttributeKeyUsesAttributesValue() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        Attributes attrs = new Attributes();
        attrs.put("id", "old");
        attrs.put("id", "new");
        assertTrue(builder.processStartTag("div", attrs));
        assertEquals("new", doc.body().child(0).id());
    }

    @Test
    public void testTagWithHyphen() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        assertTrue(builder.processStartTag("custom-tag", new Attributes()));
        assertEquals("custom-tag", doc.body().child(0).tagName());
    }

    @Test
    public void testTagWithDigits() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com");
        assertTrue(builder.processStartTag("h2", new Attributes()));
        assertEquals("h2", doc.body().child(0).tagName());
    }
}
