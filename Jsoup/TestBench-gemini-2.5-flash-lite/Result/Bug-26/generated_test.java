package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CleanerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCleanEmptyHtml() throws Exception {
        Whitelist whitelist = Whitelist.none();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>text</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // With Whitelist.none(), only text nodes should remain. The <p> tag should be removed.
        assertEquals("<html><head></head><body>text</body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithBasicWhitelist() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Hello <b>world</b></p><script>alert('bad')</script></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // <script> tag should be removed.
        assertEquals("<html><head></head><body><p>Hello <b>world</b></p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithBasicWithImagesWhitelist() throws Exception {
        Whitelist whitelist = Whitelist.basicWithImages();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p><img src=\"http://example.com/img.jpg\" alt=\"image\"></p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // BasicWithImages allows img tags with valid src.
        assertEquals("<html><head></head><body><p><img src=\"http://example.com/img.jpg\" alt=\"image\"></p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithRelaxedWhitelist() throws Exception {
        Whitelist whitelist = Whitelist.relaxed();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><h1>Title</h1><p>Some text <a href=\"http://example.com\">link</a></p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // Relaxed whitelist allows h1, p, a tags and their attributes.
        assertEquals("<html><head></head><body><h1>Title</h1><p>Some text <a href=\"http://example.com\">link</a></p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanRemovesUnknownTags() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Hello <custom>world</custom></p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // <custom> tag is not in basic whitelist, so it should be removed, but its text content preserved.
        assertEquals("<html><head></head><body><p>Hello world</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanRemovesUnsafeAttributes() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p style=\"color: red;\">Hello</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // 'style' attribute is not allowed by basic whitelist for <p>.
        assertEquals("<html><head></head><body><p>Hello</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanPreservesSafeAttributes() throws Exception {
        Whitelist whitelist = Whitelist.basic().addAttributes("p", "class");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p class=\"foo\">Hello</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // 'class' attribute is allowed for <p> by the configured whitelist.
        assertEquals("<html><head></head><body><p class=\"foo\">Hello</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanEnforcesAttributes() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"http://example.com\">Link</a></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // Enforced 'rel="nofollow"' attribute should be added to <a> tags.
        assertEquals("<html><head></head><body><a href=\"http://example.com\" rel=\"nofollow\">Link</a></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanHandlesNestedSafeTags() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p><b><i>Hello</i></b></p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // Basic whitelist allows <b> and <i>.
        assertEquals("<html><head></head><body><p><b><i>Hello</i></b></p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanHandlesNestedUnsafeTags() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Hello <script>alert('bad')</script> world</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // <script> tag is unsafe and should be removed, leaving its text content.
        assertEquals("<html><head></head><body><p>Hello  world</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanHandlesMixedNesting() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Text <b>bold <script>alert('bad')</script></b> more text</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // The inner <script> tag should be removed.
        assertEquals("<html><head></head><body><p>Text <b>bold  </b> more text</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testIsValidBasicHtml() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Hello <b>world</b></p></body></html>");
        // All tags and attributes are allowed by basic whitelist.
        assertTrue(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidInvalidHtml() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p><script>alert('bad')</script></p></body></html>");
        // <script> tag is not allowed by basic whitelist.
        assertFalse(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidWithUnsafeAttribute() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p style=\"color:red;\">Hello</p></body></html>");
        // 'style' attribute is not allowed for <p> by basic whitelist.
        assertFalse(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidWithSafeAttribute() throws Exception {
        Whitelist whitelist = Whitelist.basic().addAttributes("p", "class");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p class=\"foo\">Hello</p></body></html>");
        // 'class' attribute is allowed for <p> by the configured whitelist.
        assertTrue(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidWithEnforcedAttributeMissing() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "href", "http://example.com");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a>Link</a></body></html>");
        // The enforced 'href' attribute is missing.
        assertFalse(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidWithEnforcedAttributePresent() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "href", "http://example.com");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"http://example.com\">Link</a></body></html>");
        // The enforced 'href' attribute is present.
        assertTrue(cleaner.isValid(doc));
    }

    @Test
    public void testCleanWithEmptyBody() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Document.createShell("");
        Document cleanedDoc = cleaner.clean(doc);
        // Should result in an empty body.
        assertEquals("<html><head></head><body></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanHandlesFramesetDocument() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Document.createShell("");
        Element frameset = new Element(Tag.valueOf("frameset"), doc.baseUri());
        frameset.appendChild(new Element(Tag.valueOf("frame"), doc.baseUri()).attr("src", "frame.html"));
        doc.body().replaceWith(frameset);
        Document cleanedDoc = cleaner.clean(doc);
        // Frameset documents do not have a body, so the cleaned doc should have an empty body.
        assertEquals("<html><head></head><body></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanPreservesTextNodes() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Some <b>bold</b> text.</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // Text nodes should be preserved.
        assertEquals("<html><head></head><body><p>Some <b>bold</b> text.</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanDoesNotDiscardTextNodes() throws Exception {
        Whitelist whitelist = Whitelist.none(); // Allow no tags, but text should remain
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Just text.</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // With Whitelist.none(), the <p> tag is removed, but its text content remains.
        assertEquals("<html><head></head><body>Just text.</body></html>", cleanedDoc.html());
    }
    
    @Test
    public void testCleanHandlesEmptyTagAttributes() throws Exception {
        Whitelist whitelist = Whitelist.basic().addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"\">Empty Link</a></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // An empty href attribute is allowed by the whitelist.
        assertEquals("<html><head></head><body><a href=\"\">Empty Link</a></body></html>", cleanedDoc.html());
    }
    
    @Test
    public void testCleanHandlesAttributeWithEmptyValue() throws Exception {
        Whitelist whitelist = Whitelist.basic().addAttributes("p", "class");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p class=\"\">Empty Class</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // An empty class attribute is allowed by the whitelist.
        assertEquals("<html><head></head><body><p class=\"\">Empty Class</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithNonDefaultBaseUri() throws Exception {
        // preserveRelativeLinks is true by default in Whitelist.basic()
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"/path/to/page\">Relative Link</a></body></html>", "http://example.com");
        Document cleanedDoc = cleaner.clean(doc);
        // Relative links should be preserved.
        assertEquals("<html><head></head><body><a href=\"/path/to/page\">Relative Link</a></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithEnforcedAttributeValueOverride() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("p", "dir", "rtl");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p dir=\"ltr\">Text</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // The enforced 'dir="rtl"' should override the existing 'dir="ltr"'.
        assertEquals("<html><head></head><body><p dir=\"rtl\">Text</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanIgnoresUnknownBaseUri() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Document.createShell(null); // null base URI
        // Validate.notNull(dirtyDocument) will be called before accessing body.
        // The issue was `dirtyDocument.baseUri()` being null inside `createShell`.
        // `Document.createShell(null)` correctly handles it by setting an empty string.
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithInvalidBaseUri() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        // A Document with a base URI of "" is handled correctly.
        Document doc = Document.createShell("");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithEnforcedAttributeAlreadyPresent() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "target", "_blank");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"#\" target=\"_blank\">Link</a></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        // The enforced attribute is already present and matches.
        assertEquals("<html><head></head><body><a href=\"#\" target=\"_blank\">Link</a></body></html>", cleanedDoc.html());
    }
}
