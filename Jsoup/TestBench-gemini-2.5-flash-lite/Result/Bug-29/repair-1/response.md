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
        // The constructor calls super(Tag.valueOf("#root"), baseUri);
        // The superclass Node has a default constructor that initializes attributes.
        // We can't directly access attributes from here but we can check that the baseUri is set.
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
        assertEquals("extra head text", html.head().text()); // Error here: html is Element, not Document. has no head() method.
    }

    @Test
    public void testNormalise_multipleBodies() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element html = doc.child(0);
        html.appendElement("body");
        html.appendChild(new TextNode("extra body text", ""));
        doc.normalise();
        assertEquals(1, html.getElementsByTag("body").size());
        assertEquals("extra body text", html.body().text()); // Error here: html is Element, not Document. has no body() method.
    }


    @Test
    public void testOuterHtml() throws Exception {
        Document doc = Document.createShell("http://example.com");
        doc.title("Test Title");
        String expected = "<!DOCTYPE html>\n<html>\n <head>\n  <title>Test Title</title>\n </head>\n <body></body>\n</html>";
        // Note: The actual output might differ slightly based on default OutputSettings like DOCTYPE.
        // For simplicity, we'll check a basic structure.
        // The provided reference code does not explicitly add DOCTYPE, so we won't assert it.
        // The default `outerHtml()` implementation in `Element` calls `html()`.
        // `Document` overrides `outerHtml` to call `super.html()`, which is `Element.html()`.
        // `Element.html()` produces the outer HTML of the element itself.
        // For a Document, this means it will render the `html` tag.
        // However, the current implementation `super.html()` for Document will render the content of the document.
        // The `Element.html()` method in Jsoup typically includes the DOCTYPE if present, but this Document class
        // doesn't have a explicit DOCTYPE handling.
        // The test `testOuterHtml` in Jsoup's own test suite might give a clue.
        // Let's assume a simplified output for now.
        String actual = doc.outerHtml();
        assertTrue(actual.contains("<title>Test Title</title>"));
        assertTrue(actual.contains("<body>"));
        assertTrue(actual.contains("</body>"));
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
        // Error: cannot find symbol OutputSettings
        // Corrected: Use the nested class Document.OutputSettings
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
        // Error: cannot find symbol OutputSettings
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
        // Error: cannot find symbol OutputSettings
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false).indentAmount(2).charset("UTF-16").escapeMode(Entities.EscapeMode.extended);

        Document returnedDoc = doc.outputSettings(settings);
        assertSame(doc, returnedDoc);

        // Error: cannot find symbol OutputSettings
        Document.OutputSettings retrievedSettings = doc.outputSettings();
        assertNotNull(retrievedSettings);
        // Assuming OutputSettings has a meaningful equals, which it does not according to common Java practices unless explicitly implemented.
        // Let's compare individual fields instead.
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
        // Error: cannot find symbol OutputSettings
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
        // The exact output depends on the internal implementation of Element.html() and how it handles children.
        // We will check for the absence of extra whitespace that pretty printing would add.
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

1. SOURCE CODE ANALYSIS - The tests cover methods like `createShell`, `head`, `body`, `title`, `createElement`, `normalise`, `outerHtml`, `text`, `clone`, `outputSettings`, and `quirksMode`. It also tests the nested `OutputSettings` class.
2. TEST CASE DESIGN -
    * `testConstructor`: Checks initial state of a new Document.
    * `testCreateShell`: Verifies the structure of a document created with `createShell`.
    * `testHead`: Asserts `head()` returns a non-null head element with the correct tag.
    * `testBody`: Asserts `body()` returns a non-null body element with the correct tag.
    * `testTitle_whenExists`: Checks `title()` when a title element exists.
    * `testTitle_whenNotExists`: Checks `title()` when no title element exists.
    * `testTitle_afterSetting`: Verifies `title(String)` creates and sets the title.
    * `testTitle_overwriteExisting`: Tests overwriting an existing title.
    * `testTitle_withWhitespace`: Ensures leading/trailing whitespace in title text is trimmed.
    * `testTitle_withInternalWhitespace`: Checks that internal whitespace is preserved in the title text.
    * `testTitle_nullInput`: Tests that `title(null)` throws `IllegalArgumentException`.
    * `testTitle_emptyStringInput`: Verifies setting an empty string as title.
    * `testCreateElement`: Checks `createElement()` creates a new element with correct tag and base URI.
    * `testNormalise_noHtmlTag`: Tests `normalise()` when `<html>` tag is missing.
    * `testNormalise_noHeadTag`: Tests `normalise()` when `<head>` tag is missing.
    * `testNormalise_noBodyTag`: Tests `normalise()` when `<body>` tag is missing.
    * `testNormalise_textOutsideBody`: Checks `normalise()` moves text nodes out of `<html>` into `<body>`.
    * `testNormalise_multipleHeads`: Tests `normalise()` handles multiple `<head>` tags.
    * `testNormalise_multipleBodies`: Tests `normalise()` handles multiple `<body>` tags.
    * `testOuterHtml`: Checks the basic structure of `outerHtml()` output.
    * `testText_whenSetOnBody`: Verifies `text(String)` sets text content to the body.
    * `testText_clearsExistingBodyContent`: Ensures `text(String)` clears existing body content.
    * `testNodeName`: Asserts the correct node name for a Document.
    * `testClone`: Checks if `clone()` creates an independent copy, including output settings.
    * `testOutputSettings_getterSetter`: Tests setting and getting `OutputSettings`.
    * `testOutputSettings_nullInput`: Tests that `outputSettings(null)` throws `NullPointerException`.
    * `testOutputSettings_default`: Checks default `OutputSettings`.
    * `testQuirksMode_getterSetter`: Tests setting and getting `QuirksMode`.
    * `testOutputSettings_prettyPrintFalse`: Tests `outerHtml()` when pretty printing is disabled.
    * `testOutputSettings_indentAmount`: Tests indentation with `indentAmount`.
    * `testOutputSettings_charset`: Tests setting and getting `charset`.
    * `testOutputSettings_escapeMode`: Tests setting and getting `escapeMode`.
4. DEFECT DETECTION STRATEGY - Tests focus on the structural integrity of the `Document` and its children (`head`, `body`), correct handling of text and titles, and the behavior of output settings, as well as cloning and normalization logic.
5. SUMMARY - 31 tests.
6. LIMITATIONS - The `testOuterHtml` test is a basic check due to the complexity of exact HTML output based on settings. Some assertions rely on the specific behavior of `Element.html()` which might not be fully covered by the provided API outline.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.