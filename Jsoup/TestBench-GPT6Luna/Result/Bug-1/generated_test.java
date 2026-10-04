package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.Validate;
import org.jsoup.parser.Tag;
import java.util.List;
import java.util.ArrayList;

public class DocumentTest {
    @Test
    public void testHeadInShell() throws Exception {
        Document doc = Document.createShell("base");
        assertEquals("head", doc.head().tagName());
    }

    @Test
    public void testBodyInShell() throws Exception {
        Document doc = Document.createShell("base");
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testMissingTitleIsEmpty() throws Exception {
        Document doc = Document.createShell("base");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleIsAddedAndTrimmed() throws Exception {
        Document doc = Document.createShell("base");
        doc.title("  Hi  ");
        assertEquals("Hi", doc.title());
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test
    public void testExistingTitleIsUpdated() throws Exception {
        Document doc = Document.createShell("base");
        doc.head().appendElement("title").text("Old");
        doc.title("New");
        assertEquals("New", doc.title());
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test
    public void testCreateElementUsesBaseUri() throws Exception {
        Document doc = new Document("base");
        assertEquals("base", doc.createElement("p").baseUri());
    }

    @Test
    public void testCreateElementKeepsRequestedTag() throws Exception {
        Document doc = new Document("base");
        assertEquals("p", doc.createElement("p").tagName());
    }

    @Test
    public void testNormaliseCreatesDocumentStructure() throws Exception {
        Document doc = new Document("base");
        assertSame(doc, doc.normalise());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals(1, doc.select("html").size());
    }

    @Test
    public void testNormalisePreservesExistingStructure() throws Exception {
        Document doc = Document.createShell("base");
        doc.normalise();
        assertEquals(1, doc.select("html").size());
        assertEquals(1, doc.select("head").size());
        assertEquals(1, doc.select("body").size());
    }

    @Test
    public void testNormaliseMovesRootTextIntoBody() throws Exception {
        Document doc = new Document("base");
        doc.appendText("root");
        doc.normalise();
        assertEquals("root", doc.body().text().trim());
    }

    @Test
    public void testNormaliseMovesHeadTextIntoBody() throws Exception {
        Document doc = Document.createShell("base");
        doc.head().appendText("headtext");
        doc.normalise();
        assertEquals("headtext", doc.body().text().trim());
        assertEquals("", doc.head().text());
    }

    @Test
    public void testNormaliseLeavesBlankRootTextOutOfBody() throws Exception {
        Document doc = new Document("base");
        doc.appendText("   ");
        doc.normalise();
        assertEquals("", doc.body().text());
    }

    @Test
    public void testOuterHtmlOmitsDocumentWrapper() throws Exception {
        Document doc = Document.createShell("base");
        assertTrue(doc.outerHtml().startsWith("<html>"));
        assertTrue(doc.outerHtml().endsWith("</html>"));
        assertEquals(1, doc.select("html").size());
    }

    @Test
    public void testTextSetsBodyWithoutRemovingDocumentStructure() throws Exception {
        Document doc = Document.createShell("base");
        doc.text("hello");
        assertEquals("hello", doc.body().text());
        assertEquals(1, doc.select("html").size());
        assertEquals(1, doc.select("head").size());
    }

    @Test
    public void testTextReplacesExistingBodyContent() throws Exception {
        Document doc = Document.createShell("base");
        doc.body().appendElement("p").text("old");
        doc.text("new");
        assertEquals("new", doc.body().text());
        assertEquals(0, doc.body().getElementsByTag("p").size());
    }

    @Test
    public void testNodeName() throws Exception {
        Document doc = new Document("base");
        assertEquals("#document", doc.nodeName());
    }
}
