package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class DocumentTest {
    @Test
    public void testHeadAndBodyInShell() throws Exception {
        Document doc = Document.createShell("base");
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testHeadAndBodyMissingBeforeNormalise() throws Exception {
        Document doc = new Document("base");
        assertNull(doc.head());
        assertNull(doc.body());
    }

    @Test
    public void testTitleAbsentAndSet() throws Exception {
        Document doc = Document.createShell("base");
        assertEquals("", doc.title());
        doc.title("  hello  world ");
        assertEquals("hello world", doc.title());
    }

    @Test
    public void testTitleUpdatesExistingElement() throws Exception {
        Document doc = Document.createShell("base");
        doc.head().appendElement("title").text("old");
        doc.title("new");
        assertEquals("new", doc.title());
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test
    public void testCreateElementUsesDocumentBaseUri() throws Exception {
        Document doc = new Document("base");
        Element element = doc.createElement("p");
        assertEquals("base", element.baseUri());
        assertEquals("p", element.tagName());
    }

    @Test
    public void testNormaliseCreatesDocumentStructure() throws Exception {
        Document doc = new Document("base");
        assertSame(doc, doc.normalise());
        assertEquals("html", doc.child(0).tagName());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testNormaliseMovesRootTextIntoBody() throws Exception {
        Document doc = Document.createShell("base");
        doc.appendText("outside");
        doc.normalise();
        assertEquals("outside", doc.body().text());
    }

    @Test
    public void testNormaliseMergesDuplicateHeadsAndBodies() throws Exception {
        Document doc = Document.createShell("base");
        Element html = doc.child(0);
        html.appendElement("head").appendElement("meta");
        html.appendElement("body").appendElement("p").text("extra");
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("head").size());
        assertEquals(1, doc.getElementsByTag("body").size());
        assertEquals(1, doc.head().getElementsByTag("meta").size());
        assertEquals("extra", doc.body().text());
    }

    @Test
    public void testOuterHtmlOmitsDocumentWrapper() throws Exception {
        Document doc = Document.createShell("base");
        assertEquals(doc.html(), doc.outerHtml());
        assertTrue(doc.outerHtml().startsWith("<html>"));
    }

    @Test
    public void testTextSetsBodyWithoutRemovingStructure() throws Exception {
        Document doc = Document.createShell("base");
        doc.body().appendElement("p").text("old");
        assertSame(doc, doc.text("new text"));
        assertEquals("new text", doc.body().text());
        assertEquals(1, doc.getElementsByTag("head").size());
    }

    @Test
    public void testNodeName() throws Exception {
        assertEquals("#document", new Document("base").nodeName());
    }

    @Test
    public void testCloneCopiesStructureAndOutputSettings() throws Exception {
        Document doc = Document.createShell("base");
        doc.outputSettings().prettyPrint(false);
        doc.outputSettings().indentAmount(0);
        Document clone = doc.clone();
        assertEquals(doc.outerHtml(), clone.outerHtml());
        assertFalse(clone.outputSettings().prettyPrint());
        assertEquals(0, clone.outputSettings().indentAmount());
        clone.appendElement("extra");
        assertEquals(0, doc.getElementsByTag("extra").size());
    }

    @Test
    public void testDefaultOutputSettings() throws Exception {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        assertEquals(Charset.forName("UTF-8"), settings.charset());
        assertTrue(settings.prettyPrint());
        assertEquals(1, settings.indentAmount());
    }

    @Test
    public void testOutputSettingsMutators() throws Exception {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertSame(settings, settings.escapeMode(Entities.EscapeMode.extended));
        assertSame(settings, settings.charset("US-ASCII"));
        assertSame(settings, settings.prettyPrint(false));
        assertSame(settings, settings.indentAmount(0));
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
        assertEquals(Charset.forName("US-ASCII"), settings.charset());
        assertFalse(settings.prettyPrint());
        assertEquals(0, settings.indentAmount());
    }

    @Test
    public void testOutputSettingsClonePreservesConfiguration() throws Exception {
        Document.OutputSettings settings = new Document.OutputSettings()
                .escapeMode(Entities.EscapeMode.extended)
                .charset("US-ASCII")
                .prettyPrint(false)
                .indentAmount(0);
        Document.OutputSettings clone = settings.clone();
        assertEquals(settings.escapeMode(), clone.escapeMode());
        assertEquals(settings.charset(), clone.charset());
        assertEquals(settings.prettyPrint(), clone.prettyPrint());
        assertEquals(settings.indentAmount(), clone.indentAmount());
    }

    @Test
    public void testOutputSettingsCanBeReplaced() throws Exception {
        Document doc = new Document("base");
        Document.OutputSettings settings = new Document.OutputSettings().prettyPrint(false);
        assertSame(doc, doc.outputSettings(settings));
        assertSame(settings, doc.outputSettings());
        assertFalse(doc.outputSettings().prettyPrint());
    }

    @Test
    public void testQuirksModeCanBeChanged() throws Exception {
        Document doc = new Document("base");
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
        assertSame(doc, doc.quirksMode(Document.QuirksMode.quirks));
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
        doc.quirksMode(Document.QuirksMode.limitedQuirks);
        assertEquals(Document.QuirksMode.limitedQuirks, doc.quirksMode());
    }

    @Test
    public void testIndentAmountRejectsNegativeAndAcceptsZero() throws Exception {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(0);
        assertEquals(0, settings.indentAmount());
        try {
            settings.indentAmount(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
