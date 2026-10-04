```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;
import org.jsoup.parser.Tag;
import java.io.IOException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.StringUtil;
import org.jsoup.parser.TokenQueue;
import java.util.ArrayList;

public class PseudoTextElementTest {
    @Test
    public void tagNameIsPreserved() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        assertEquals("span", element.tagName());
    }

    @Test
    public void baseUriIsPreserved() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "uri", new Attributes());
        assertEquals("uri", element.baseUri());
    }

    @Test
    public void attributesArePreserved() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("id", "sample");
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", attributes);
        assertEquals("sample", element.id());
    }

    @Test
    public void elementCanBeMatchedByTag() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        assertTrue(new Evaluator.Tag("SPAN").matches(element, element));
    }

    @Test
    public void textChildIsSerializedWithoutElementTags() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        element.appendText("hello");
        assertEquals("hello", element.outerHtml());
    }

    @Test
    public void emptyElementSerializesToEmptyString() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        assertEquals("", element.outerHtml());
    }

    @Test
    public void textNodeIsStillReachableAfterAppending() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        element.appendText("text");
        assertEquals(1, element.childNodeSize());
    }

    @Test
    public void childTextIsReturned() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        element.appendText("text");
        assertEquals("text", element.text());
    }

    @Test
    public void idCanBeSetAndRead() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        element.attr("id", "item");
        assertEquals("item", element.id());
    }

    @Test
    public void classCanBeSetAndMatched() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        element.attr("class", "active");
        assertTrue(element.hasClass("active"));
    }

    @Test
    public void appendedElementIsAChild() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        Element child = element.appendElement("b");
        assertEquals(1, element.children().size());
        assertEquals("b", child.tagName());
    }

    @Test
    public void emptyRemovesChildren() throws Exception {
        PseudoTextElement element = new PseudoTextElement(Tag.valueOf("span"), "", new Attributes());
        element.appendText("text");
        element.empty();
        assertEquals(0, element.childNodeSize());
    }
}
```