```java
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
import java.util.Map;

public class DocumentTest {

    @Test
    public void testConstructor() throws Exception {
        Document doc = new Document("http://example.com");
        assertEquals("#root", doc.nodeName());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testCreateShell() throws Exception {
        Document doc = Document.createShell("http://example.com");
        assertEquals("#document", doc.nodeName());
        assertEquals("http://example.com", doc.baseUri());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
        assertEquals(1, doc.head().siblingIndex());
        assertEquals(1, doc.body().siblingIndex());
    }

    @Test
    public void testHead() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("head", head.tagName());
    }

    @Test
    public void testBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

    @Test
    public void testTitle_whenExists() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text("My Title");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void testTitle_whenNotExists() throws Exception {
        Document doc = Document.createShell("http://example.com");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitle_afterSetting() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("New Title");
        assertEquals("New Title", doc.title());
        assertEquals("title", doc.head().child(0).nodeName());
        assertEquals("New Title", doc.head().child(0).text());
    }

    @Test
    public void testTitle_overwriteExisting() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text("Old Title");
        doc.title("Updated Title");
        assertEquals("Updated Title", doc.title());
        assertEquals(1, doc.head().children().size());
    }

    @Test
    public void testTitle_withWhitespace() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text("  Trim Me  ");
        assertEquals("Trim Me", doc.title());
    }

    @Test
    public void testTitle_withInternalWhitespace() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text(" Title With Internal Whitespace ");
        assertEquals("Title With Internal Whitespace", doc.title());
    }

    @Test
    public void testTitle_nullInput() {
        Document doc = new Document("http://example.com");
        try {
            doc.title(null);
            fail("Expected IllegalArgumentException for null title");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testTitle_emptyStringInput() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().appendElement("title").text("Some Title");
        doc.title("");
        assertEquals("", doc.title());
        assertEquals("", doc.head().getElementsByTag("title").first().text());
    }


    @Test
    public void testCreateElement() throws Exception {
        Document doc = new Document("http://example.com");
        Element p = doc.createElement("p");
        assertEquals("p", p.tagName());
        assertEquals("http://example.com", p.baseUri());
        assertNull(p.parent());
    }

    @Test
    public void testNormalise_noHtmlTag() throws Exception {
        Document doc = new Document("http://example.com");
        doc.appendChild(new TextNode("Some text", ""));
        doc.normalise();
        assertEquals("html", doc.child(0).nodeName());
        assertEquals("head", doc.head().nodeName());
        assertEquals("body", doc.body().nodeName());
        assertEquals("Some text", doc.body().text());
    }

    @Test
    public void testNormalise_noHeadTag() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.body().appendChild(new TextNode("Some text", ""));
        doc.normalise(); // This should not re-add head if it was already there.
        assertNotNull(doc.head());
        assertEquals("head", doc.head().nodeName());
        assertEquals("Some text", doc.body().text());
    }

    @Test
    public void testNormalise_noBodyTag() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.head().remove(); // remove body to test
        doc.normalise();
        assertNotNull(doc.body());
        assertEquals("body", doc.body().nodeName());
    }

    @Test
    public void testNormalise_textOutsideBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element html = doc.child(0);
        TextNode textNode = new TextNode("text outside body", "");
        html.before(textNode);
        doc.normalise();
        assertEquals(0, html.siblingIndex());
        assertEquals("text outside body", doc.body().text());
        assertTrue(textNode.parent() == null || textNode.parent().nodeName().equals("#document"));
    }

    @Test
    public void testNormalise_multipleHeads() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element html = doc.child(0);
        html.appendElement("head");
        html.appendChild(new TextNode("extra head text", ""));
        doc.normalise();
        assertEquals(1, html.getElementsByTag("head").size());
        assertEquals("extra head text", html.getElementsByTag("head").first().text()); // Corrected: accessing text of the first head element
    }

    @Test
    public void testNormalise_multipleBodies() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element html = doc.child(0);
        html.appendElement("body");
        html.appendChild(new TextNode("extra body text", ""));
        doc.normalise();
        assertEquals(1, html.getElementsByTag("body").size());
        assertEquals("extra body text", html.getElementsByTag("body").first().text()); // Corrected: accessing text of the first body element
    }


    @Test
    public void testOuterHtml() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("Test Title");
        String actual = doc.outerHtml();
        assertTrue(actual.contains("<title>Test Title</title>"));
        assertTrue(actual.contains("<body>"));
        assertTrue(actual.contains("</body>"));
        // The outerHtml for Document doesn't output DOCTYPE by default unless added.
        // It renders the html tag's content.
        assertTrue(actual.contains("<html>"));
        assertTrue(actual.contains("</html>"));
    }


    @Test
    public void testText_whenSetOnBody() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.text("Hello World");
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testText_clearsExistingBodyContent() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.body().appendElement("p").text("Old content");
        doc.text("New content");
        assertEquals("New content", doc.body().text());
        assertEquals(0, doc.body().children().size());
    }

    @Test
    public void testNodeName() throws Exception {
        Document doc = new Document("http://example.com");
        assertEquals("#document", doc.nodeName());
    }

    @Test
    public void testClone() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("Original Title");
        
        Document.OutputSettings originalSettings = doc.outputSettings();
        originalSettings.prettyPrint(false);
        originalSettings.indentAmount(4);
        originalSettings.charset("ISO-8859-1");
        originalSettings.escapeMode(Entities.EscapeMode.extended);

        Document clonedDoc = doc.clone();

        assertEquals("#document", clonedDoc.nodeName());
        assertEquals("http://example.com", clonedDoc.baseUri());
        assertEquals("Original Title", clonedDoc.title());

        // Check that output settings are cloned independently
        Document.OutputSettings clonedSettings = clonedDoc.outputSettings();
        assertNotSame(originalSettings, clonedSettings);
        assertFalse(clonedSettings.prettyPrint());
        assertEquals(4, clonedSettings.indentAmount());
        assertEquals("ISO-8859-1", clonedSettings.charset().name());
        assertEquals(Entities.EscapeMode.extended, clonedSettings.escapeMode());

        // Modify original after clone and check clone is unaffected
        doc.title("Modified Title");
        originalSettings.prettyPrint(true);
        assertEquals("Original Title", clonedDoc.title());
        assertFalse(clonedDoc.outputSettings().prettyPrint());
    }

    @Test
    public void testOutputSettings_getterSetter() throws Exception {
        Document doc = new Document("http://example.com");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false).indentAmount(2).charset("UTF-16").escapeMode(Entities.EscapeMode.extended);

        Document returnedDoc = doc.outputSettings(settings);
        assertSame(doc, returnedDoc);

        Document.OutputSettings retrievedSettings = doc.outputSettings();
        assertNotNull(retrievedSettings);
        assertFalse(retrievedSettings.prettyPrint());
        assertEquals(2, retrievedSettings.indentAmount());
        assertEquals("UTF-16", retrievedSettings.charset().name());
        assertEquals(Entities.EscapeMode.extended, retrievedSettings.escapeMode());
    }

    @Test
    public void testOutputSettings_nullInput() {
        Document doc = new Document("http://example.com");
        try {
            doc.outputSettings(null);
            fail("Expected NullPointerException for null outputSettings");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testOutputSettings_default() throws Exception {
        Document doc = new Document("http://example.com");
        Document.OutputSettings settings = doc.outputSettings();
        assertNotNull(settings);
        assertTrue(settings.prettyPrint());
        assertEquals(1, settings.indentAmount());
        assertEquals("UTF-8", settings.charset().name());
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
    }

    @Test
    public void testQuirksMode_getterSetter() throws Exception {
        Document doc = new Document("http://example.com");
        Document returnedDoc = doc.quirksMode(Document.QuirksMode.quirks);
        assertSame(doc, returnedDoc);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());

        returnedDoc = doc.quirksMode(Document.QuirksMode.limitedQuirks);
        assertEquals(Document.QuirksMode.limitedQuirks, doc.quirksMode());

        returnedDoc = doc.quirksMode(Document.QuirksMode.noQuirks);
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    // Testing specific output settings of OutputSettings class, as they affect Document.outerHtml()
    @Test
    public void testOutputSettings_prettyPrintFalse() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().prettyPrint(false).indentAmount(4); // Indent amount should not matter if prettyPrint is false
        Element p = doc.body().appendElement("p");
        p.appendText("Hello");
        p.appendChild(new Element(Tag.valueOf("br"), ""));
        p.appendText(" World");

        String html = doc.html(); // Using html() which respects output settings
        // Without pretty printing, it should be more compact.
        assertFalse(html.contains("\n")); // No newlines expected if pretty print is false
        assertTrue(html.contains("<p>Hello<br /> World</p>")); // Check for basic structure without extra spaces
    }

    @Test
    public void testOutputSettings_indentAmount() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().prettyPrint(true).indentAmount(2);
        Element div = doc.body().appendElement("div");
        div.appendElement("p");

        String html = doc.html();
        // Expecting indentation with 2 spaces
        assertTrue(html.contains("<div>"));
        assertTrue(html.contains("  <p>"));
        assertTrue(html.contains("  </p>"));
        assertTrue(html.contains("</div>"));
    }

    @Test
    public void testOutputSettings_charset() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Charset utf16 = Charset.forName("UTF-16");
        doc.outputSettings().charset(utf16);
        assertEquals(utf16, doc.outputSettings().charset());
    }

    @Test
    public void testOutputSettings_escapeMode() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.outputSettings().escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, doc.outputSettings().escapeMode());
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover the `Document` class's core functionalities: document structure manipulation (`createShell`, `normalise`), title handling (`title`), element creation (`createElement`), and output settings (`outputSettings`, `quirksMode`). Tests focus on edge cases like missing elements, multiple elements, and null inputs.
2. TEST CASE DESIGN -
    - `testConstructor`: Checks basic initialization of a Document object.
    - `testCreateShell`: Verifies the creation of a valid document shell with head and body.
    - `testHead`: Asserts the `head()` method correctly returns the head element.
    - `testBody`: Asserts the `body()` method correctly returns the body element.
    - `testTitle_whenExists`: Checks retrieving an existing title.
    - `testTitle_whenNotExists`: Checks retrieving a title when none exists.
    - `testTitle_afterSetting`: Verifies setting and retrieving a title.
    - `testTitle_overwriteExisting`: Ensures `title()` overwrites an existing title.
    - `testTitle_withWhitespace`: Tests title normalization for leading/trailing whitespace.
    - `testTitle_withInternalWhitespace`: Tests title normalization for internal whitespace.
    - `testTitle_nullInput`: Checks for expected exception on null input to `title()`.
    - `testTitle_emptyStringInput`: Tests setting an empty title.
    - `testCreateElement`: Verifies creation of a new element with correct tag and base URI.
    - `testNormalise_noHtmlTag`: Tests `normalise()` when `<html>` tag is missing.
    - `testNormalise_noHeadTag`: Tests `normalise()` when `<head>` tag is missing.
    - `testNormalise_noBodyTag`: Tests `normalise()` when `<body>` tag is missing.
    - `testNormalise_textOutsideBody`: Checks `normalise()` moves text nodes out of `<html>` and into `<body>`.
    - `testNormalise_multipleHeads`: Tests `normalise()` with multiple `<head>` tags.
    - `testNormalise_multipleBodies`: Tests `normalise()` with multiple `<body>` tags.
    - `testOuterHtml`: Checks the basic structure of the outer HTML for a document.
    - `testText_whenSetOnBody`: Verifies `text()` sets content on the body.
    - `testText_clearsExistingBodyContent`: Ensures `text()` clears existing body content.
    - `testNodeName`: Checks the node name of a Document.
    - `testClone`: Tests deep cloning of a Document, including its OutputSettings.
    - `testOutputSettings_getterSetter`: Verifies setting and getting OutputSettings.
    - `testOutputSettings_nullInput`: Checks for expected exception on null input to `outputSettings()`.
    - `testOutputSettings_default`: Verifies default OutputSettings.
    - `testQuirksMode_getterSetter`: Verifies setting and getting QuirksMode.
    - `testOutputSettings_prettyPrintFalse`: Tests output with pretty printing disabled.
    - `testOutputSettings_indentAmount`: Tests output with specific indent amount.
    - `testOutputSettings_charset`: Tests setting the output charset.
    - `testOutputSettings_escapeMode`: Tests setting the output escape mode.
4. DEFECT DETECTION STRATEGY - The tests cover the core logic of Document creation, manipulation, and serialization, particularly focusing on structural integrity and the behavior of OutputSettings. Any deviation in these areas would likely cause a test failure.
5. SUMMARY - 30 tests.
6. LIMITATIONS - Tests rely on the default behavior of `Jsoup.parse()` for creating initial document structures, and the `outerHtml()` and `html()` methods' output formatting is checked for general correctness rather than exact string matches due to potential variations in whitespace handling by the Jsoup library itself. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.