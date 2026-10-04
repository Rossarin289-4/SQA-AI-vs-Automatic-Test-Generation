package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map; // Added import for Map

public class DocumentTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructor() throws Exception {
        Document doc = new Document("http://example.com");
        assertEquals("#document", doc.nodeName());
        assertEquals("http://example.com", doc.baseUri());
        assertEquals("html", doc.tag().getName()); // The superclass Element constructor sets the tag to html.
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testCreateShell() throws Exception {
        Document doc = Document.createShell("http://example.com");
        assertEquals("#document", doc.nodeName());
        assertEquals("http://example.com", doc.baseUri());
        assertEquals("html", doc.tag().getName());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testHead() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("head", head.tagName());
        assertEquals(doc, head.ownerDocument());
    }

    @Test
    public void testBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("body", body.tagName());
        assertEquals(doc, body.ownerDocument());
    }

    @Test
    public void testTitleWhenSet() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("My Test Title");
        assertEquals("My Test Title", doc.title());
    }

    @Test
    public void testTitleWhenEmpty() throws Exception {
        Document doc = Document.createShell("http://example.com");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleWhenNoTitleTag() throws Exception {
        Document doc = new Document("http://example.com"); // No head or body yet
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleSetsInHead() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("New Title");
        Element titleEl = doc.head().getElementsByTag("title").first();
        assertNotNull(titleEl);
        assertEquals("New Title", titleEl.text());
    }

    @Test
    public void testTitleUpdatesExisting() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text("Old Title");
        doc.title("Updated Title");
        Element titleEl = doc.head().getElementsByTag("title").first();
        assertNotNull(titleEl);
        assertEquals("Updated Title", titleEl.text());
        assertEquals(1, doc.head().getElementsByTag("title").size());
    }

    @Test
    public void testTitleTrimsWhitespace() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text("  Trimmed Title  ");
        assertEquals("Trimmed Title", doc.title());
    }

    @Test
    public void testCreateElement() throws Exception {
        Document doc = new Document("http://example.com");
        Element div = doc.createElement("div");
        assertEquals("div", div.tagName());
        assertEquals("http://example.com", div.baseUri());
        assertNull(div.parent()); // Not added to the document yet
    }

    @Test
    public void testNormalise() throws Exception {
        Document doc = new Document("http://example.com");
        doc.normalise();
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        Element htmlElement = doc.getElementsByTag("html").first();
        assertNotNull(htmlElement);
        assertEquals("html", htmlElement.tagName());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testNormaliseMovesTextToBody() throws Exception {
        Document doc = new Document("http://example.com");
        doc.prependText("Some text before head.");
        doc.normalise();
        assertEquals("Some text before head.", doc.body().text());
    }

    @Test
    public void testNormaliseHandlesMultipleHeads() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("head").appendText("second head");
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("head").size());
        assertEquals("second head", doc.head().text());
    }

    @Test
    public void testNormaliseHandlesMultipleBodies() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.body().appendElement("body").appendText("second body");
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("body").size());
        assertEquals("second body", doc.body().text());
    }

    @Test
    public void testOuterHtml() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("My Title");
        String html = doc.outerHtml();
        assertTrue(html.contains("<html>"));
        assertTrue(html.contains("<head>"));
        assertTrue(html.contains("<title>My Title</title>"));
        assertTrue(html.contains("<body>"));
        assertTrue(html.contains("</body>"));
        assertTrue(html.contains("</html>"));
    }

    @Test
    public void testTextSetsBodyText() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.text("New body content");
        assertEquals("New body content", doc.body().text());
        assertEquals(1, doc.body().childNodes().size());
        assertTrue(doc.body().childNodes().get(0) instanceof TextNode);
    }

    @Test
    public void testNodeName() throws Exception {
        Document doc = new Document("http://example.com");
        assertEquals("#document", doc.nodeName());
    }

    @Test
    public void testOutputSettingsConstructor() throws Exception {
        Document doc = new Document("http://example.com");
        Document.OutputSettings settings = doc.outputSettings();
        assertNotNull(settings);
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        assertEquals(Charset.forName("UTF-8"), settings.charset());
        assertTrue(settings.prettyPrint());
        assertEquals(1, settings.indentAmount());
    }

    @Test
    public void testOutputSettingsEscapeMode() throws Exception {
        Document doc = new Document("http://example.com");
        doc.outputSettings().escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, doc.outputSettings().escapeMode());
    }

    @Test
    public void testOutputSettingsCharsetByName() throws Exception {
        Document doc = new Document("http://example.com");
        doc.outputSettings().charset("ISO-8859-1");
        assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void testOutputSettingsPrettyPrint() throws Exception {
        Document doc = new Document("http://example.com");
        doc.outputSettings().prettyPrint(false);
        assertFalse(doc.outputSettings().prettyPrint());
    }

    @Test
    public void testOutputSettingsIndentAmount() throws Exception {
        Document doc = new Document("http://example.com");
        doc.outputSettings().indentAmount(4);
        assertEquals(4, doc.outputSettings().indentAmount());
    }

    @Test
    public void testOutputSettingsIndentAmountZero() throws Exception {
        Document doc = new Document("http://example.com");
        doc.outputSettings().indentAmount(0);
        assertEquals(0, doc.outputSettings().indentAmount());
    }

    @Test
    public void testOutputSettingsIndentAmountNegative() {
        Document doc = new Document("http://example.com");
        try {
            doc.outputSettings().indentAmount(-1);
            fail("Expected IllegalArgumentException for negative indent amount");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}
