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

public class DocumentTest {
    @Test
    public void testHeadInitiallyAbsent() throws Exception {
        Document doc = new Document("");
        assertNull(doc.head());
    }

    @Test
    public void testBodyInitiallyAbsent() throws Exception {
        Document doc = new Document("");
        assertNull(doc.body());
    }

    @Test
    public void testTitleInitiallyEmpty() throws Exception {
        Document doc = new Document("");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleReadsTrimmedText() throws Exception {
        Document doc = Document.createShell("");
        doc.head().appendElement("title").text("  A title  ");
        assertEquals("A title", doc.title());
    }

    @Test
    public void testCreateElementUsesDocumentBaseUri() throws Exception {
        Document doc = new Document("http://example.com/");
        assertEquals("http://example.com/", doc.createElement("p").baseUri());
    }

    @Test
    public void testCreateElementPreservesTagName() throws Exception {
        Document doc = new Document("");
        assertEquals("section", doc.createElement("section").tagName());
    }

    @Test
    public void testNormaliseCreatesDocumentStructure() throws Exception {
        Document doc = new Document("");
        assertSame(doc, doc.normalise());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals(1, doc.getElementsByTag("html").size());
    }

    @Test
    public void testNormaliseMovesRootTextIntoBody() throws Exception {
        Document doc = new Document("");
        doc.appendText("root");
        doc.normalise();
        assertEquals("root", doc.body().text());
    }

    @Test
    public void testNormaliseMergesDuplicateHeads() throws Exception {
        Document doc = Document.createShell("");
        Element html = doc.getElementsByTag("html").first();
        html.appendElement("head").appendElement("title").text("merged");
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("head").size());
        assertEquals("merged", doc.title());
    }

    @Test
    public void testNormaliseMergesDuplicateBodies() throws Exception {
        Document doc = Document.createShell("");
        Element html = doc.getElementsByTag("html").first();
        html.appendElement("body").appendElement("p").text("extra");
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("body").size());
        assertEquals("extra", doc.body().text());
    }

    @Test
    public void testOuterHtmlHasNoDocumentWrapper() throws Exception {
        Document doc = Document.createShell("");
        doc.body().appendElement("p").text("hello");
        assertEquals(doc.html(), doc.outerHtml());
    }

    @Test
    public void testDocumentTextUpdatesBody() throws Exception {
        Document doc = Document.createShell("");
        doc.body().appendElement("p").text("old");
        assertSame(doc, doc.text("new"));
        assertEquals("new", doc.body().text());
        assertNotNull(doc.head());
    }

    @Test
    public void testNodeNameIsDocument() throws Exception {
        assertEquals("#document", new Document("").nodeName());
    }

    @Test
    public void testOutputSettingsAccessibleAndStable() throws Exception {
        Document doc = new Document("");
        assertSame(doc.outputSettings(), doc.outputSettings());
    }

    @Test
    public void testDefaultEscapeMode() throws Exception {
        assertEquals(Entities.EscapeMode.base, new Document("").outputSettings().escapeMode());
    }

    @Test
    public void testDefaultCharset() throws Exception {
        assertEquals(Charset.forName("UTF-8"), new Document("").outputSettings().charset());
    }

    @Test
    public void testDefaultPrettyPrint() throws Exception {
        assertTrue(new Document("").outputSettings().prettyPrint());
    }

    @Test
    public void testDefaultIndentAmount() throws Exception {
        assertEquals(1, new Document("").outputSettings().indentAmount());
    }

    @Test
    public void testSetOutputSettingsValues() throws Exception {
        Document.OutputSettings settings = new Document("").outputSettings();
        settings.escapeMode(Entities.EscapeMode.extended);
        settings.charset("US-ASCII");
        settings.prettyPrint(false);
        settings.indentAmount(0);
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
        assertEquals(Charset.forName("US-ASCII"), settings.charset());
        assertFalse(settings.prettyPrint());
        assertEquals(0, settings.indentAmount());
    }

    @Test
    public void testIndentAmountAcceptsPositiveValue() throws Exception {
        Document.OutputSettings settings = new Document("").outputSettings();
        settings.indentAmount(24);
        assertEquals(24, settings.indentAmount());
    }

    @Test
    public void testIndentAmountRejectsNegativeValue() throws Exception {
        Document.OutputSettings settings = new Document("").outputSettings();
        try {
            settings.indentAmount(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(1, settings.indentAmount());
    }
}
