package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.Validate;
import org.jsoup.parser.Tag;
import java.util.List;
import java.util.ArrayList;

public class DocumentTest {

    @Test
    public void testCreateShell() throws Exception {
        Document doc = Document.createShell("http://example.com");
        assertEquals("http://example.com", doc.baseUri());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
        assertEquals(3, doc.childNodes().size()); // html, head, body
    }

    @Test
    public void testHead() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("head", head.tagName());
        assertEquals(doc, head.parent());
    }

    @Test
    public void testBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("body", body.tagName());
        assertEquals(doc, body.parent());
    }

    @Test
    public void testTitleGetWhenPresent() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text("My Title");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void testTitleGetWhenMissing() throws Exception {
        Document doc = Document.createShell("http://example.com");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleSetNew() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("New Page Title");
        assertEquals("New Page Title", doc.title());
        assertNotNull(doc.head().getElementsByTag("title").first());
        assertEquals("title", doc.head().getElementsByTag("title").first().tagName());
        assertEquals("New Page Title", doc.head().getElementsByTag("title").first().text());
    }

    @Test
    public void testTitleSetExisting() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text("Old Title");
        doc.title("Updated Page Title");
        assertEquals("Updated Page Title", doc.title());
        assertEquals(1, doc.head().getElementsByTag("title").size());
        assertEquals("Updated Page Title", doc.head().getElementsByTag("title").first().text());
    }

    @Test
    public void testCreateElement() throws Exception {
        Document doc = new Document("http://example.com");
        Element p = doc.createElement("p");
        assertEquals("p", p.tagName());
        assertEquals("http://example.com", p.baseUri());
        assertNull(p.parent()); // not yet added to document
    }

    @Test
    public void testNormalise_noHtml() throws Exception {
        Document doc = new Document("http://example.com");
        doc.normalise();
        assertEquals("html", doc.child(0).nodeName());
        assertEquals("head", doc.head().nodeName());
        assertEquals("body", doc.body().nodeName());
    }

    @Test
    public void testNormalise_noHead() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().remove(); // remove head
        doc.normalise();
        assertEquals("head", doc.head().nodeName());
        assertEquals("html", doc.head().parent().nodeName());
    }

    @Test
    public void testNormalise_noBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.body().remove(); // remove body
        doc.normalise();
        assertEquals("body", doc.body().nodeName());
        assertEquals("html", doc.body().parent().nodeName());
    }

    @Test
    public void testNormalise_textOutsideBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.prependText("  some text  "); // text node in root
        doc.head().prependText("more text"); // text node in head
        doc.normalise();

        Element body = doc.body();
        assertTrue(body.hasText());
        assertTrue(body.text().contains("some text"));
        assertTrue(body.text().contains("more text"));

        // Check if the text nodes were moved to body
        assertEquals(0, doc.childNodes().stream().filter(n -> n instanceof TextNode).count());
        assertEquals(0, doc.head().childNodes().stream().filter(n -> n instanceof TextNode).count());
        assertEquals(1, body.childNodes().stream().filter(n -> n instanceof TextNode && ((TextNode) n).getWholeText().trim().equals("some text")).count());
        assertEquals(1, body.childNodes().stream().filter(n -> n instanceof TextNode && ((TextNode) n).getWholeText().trim().equals("more text")).count());
    }

    @Test
    public void testNormalise_blankTextOutsideBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.prependText("   \n\t "); // blank text node in root
        doc.head().prependText(" \n "); // blank text node in head
        doc.normalise();

        // Blank text nodes should not be moved and should be removed
        assertEquals(0, doc.childNodes().stream().filter(n -> n instanceof TextNode).count());
        assertEquals(0, doc.head().childNodes().stream().filter(n -> n instanceof TextNode).count());
        assertEquals(0, doc.body().childNodes().stream().filter(n -> n instanceof TextNode).count());
    }

    @Test
    public void testOuterHtml() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("Test Title");
        String html = doc.outerHtml();
        assertTrue(html.contains("<!DOCTYPE html>")); // default doctype from superclass? Or inherent in shell? Assume present.
        assertTrue(html.contains("<title>Test Title</title>"));
        assertTrue(html.contains("<html>"));
        assertTrue(html.contains("<head>"));
        assertTrue(html.contains("<body>"));
    }

    @Test
    public void testTextOverride() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.text("New body text");
        assertEquals("New body text", doc.body().text());
        assertEquals(0, doc.head().childNodes().size()); // head should be untouched
    }

    @Test
    public void testNodeName() throws Exception {
        Document doc = new Document("http://example.com");
        assertEquals("#document", doc.nodeName());
    }
    
    // Test cases for potential edge cases based on normalise logic
    @Test
    public void testNormalise_emptyDoc() throws Exception {
        Document doc = new Document("http://example.com");
        doc.normalise();
        assertEquals("html", doc.tagName());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_htmlWithoutHeadOrBody() throws Exception {
        Document doc = new Document("http://example.com");
        doc.appendChild(new Element(Tag.valueOf("html"), doc.baseUri())); // Add html element without head/body
        doc.normalise();
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
        assertEquals(doc.select("html").first(), doc.head().parent());
        assertEquals(doc.select("html").first(), doc.body().parent());
    }
    
    @Test
    public void testNormalise_textInRootAndHead() throws Exception {
        Document doc = new Document("http://example.com");
        Element html = doc.appendElement("html");
        Element head = html.appendElement("head");
        Element body = html.appendElement("body");
        
        TextNode rootText = new TextNode("Root Text", "http://example.com");
        TextNode headText = new TextNode("Head Text", "http://example.com");
        
        doc.appendChild(rootText);
        head.appendChild(headText);
        
        doc.normalise();
        
        assertEquals("Root Text", body.childNodes().get(0).outerHtml().trim());
        assertEquals("Head Text", body.childNodes().get(1).outerHtml().trim());
        assertTrue(body.text().contains("Root Text"));
        assertTrue(body.text().contains("Head Text"));
    }

    @Test
    public void testTitleSetEmptyString() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("Initial Title");
        doc.title(""); // Setting empty title
        assertEquals("", doc.title());
        Element titleEl = doc.head().getElementsByTag("title").first();
        assertNotNull(titleEl);
        assertEquals("", titleEl.text());
    }
    
    @Test
    public void testCreateElement_withAttributes() throws Exception {
        Document doc = new Document("http://example.com");
        Element div = doc.createElement("div");
        div.attr("id", "main");
        div.attr("class", "container");
        assertEquals("div", div.tagName());
        assertEquals("main", div.id());
        assertEquals("container", div.attributes().get("class"));
    }

    @Test
    public void testBody_isEmptyInitially() throws Exception {
        Document doc = Document.createShell("http://example.com");
        assertTrue(doc.body().isBlock());
        assertEquals(0, doc.body().childNodes().size());
        assertEquals(0, doc.body().children().size());
    }
    
    @Test
    public void testHead_isEmptyInitially() throws Exception {
        Document doc = Document.createShell("http://example.com");
        assertTrue(doc.head().isBlock());
        assertEquals(0, doc.head().childNodes().size());
        assertEquals(0, doc.head().children().size());
    }

    @Test
    public void testOuterHtml_emptyDocument() throws Exception {
        Document doc = new Document("http://example.com");
        String html = doc.outerHtml();
        assertTrue(html.contains("<html>"));
        assertTrue(html.contains("<head></head>"));
        assertTrue(html.contains("<body></body>"));
    }
    
    @Test
    public void testText_overwritesExistingContentInBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.body().appendElement("p").text("Old paragraph");
        doc.text("New body text");
        assertEquals("New body text", doc.body().text());
        assertEquals(0, doc.body().children().size()); // all previous children should be gone
    }

    @Test
    public void testNormalise_textWithInternalWhitespace() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().prependText("  text with spaces  ");
        doc.normalise();
        Element body = doc.body();
        assertEquals(1, body.childNodes().stream().filter(n -> n instanceof TextNode && ((TextNode) n).getWholeText().trim().equals("text with spaces")).count());
        assertTrue(body.text().contains("text with spaces"));
    }
}
