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
        assertEquals("<html><head></head><body></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithBasicWhitelist() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Hello <b>world</b></p><script>alert('bad')</script></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p>Hello <b>world</b></p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithBasicWithImagesWhitelist() throws Exception {
        Whitelist whitelist = Whitelist.basicWithImages();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p><img src=\"http://example.com/img.jpg\" alt=\"image\"></p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p><img src=\"http://example.com/img.jpg\" alt=\"image\"></p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithRelaxedWhitelist() throws Exception {
        Whitelist whitelist = Whitelist.relaxed();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><h1>Title</h1><p>Some text <a href=\"http://example.com\">link</a></p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><h1>Title</h1><p>Some text <a href=\"http://example.com\">link</a></p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanRemovesUnknownTags() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Hello <custom>world</custom></p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p>Hello world</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanRemovesUnsafeAttributes() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p style=\"color: red;\">Hello</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p>Hello</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanPreservesSafeAttributes() throws Exception {
        Whitelist whitelist = Whitelist.basic().addAttributes("p", "class");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p class=\"foo\">Hello</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p class=\"foo\">Hello</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanEnforcesAttributes() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"http://example.com\">Link</a></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><a href=\"http://example.com\" rel=\"nofollow\">Link</a></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanHandlesNestedSafeTags() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p><b><i>Hello</i></b></p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p><b><i>Hello</i></b></p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanHandlesNestedUnsafeTags() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Hello <script>alert('bad')</script> world</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p>Hello  world</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanHandlesMixedNesting() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Text <b>bold <script>alert('bad')</script></b> more text</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p>Text <b>bold </b> more text</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testIsValidBasicHtml() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Hello <b>world</b></p></body></html>");
        assertTrue(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidInvalidHtml() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p><script>alert('bad')</script></p></body></html>");
        assertFalse(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidWithUnsafeAttribute() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p style=\"color:red;\">Hello</p></body></html>");
        assertFalse(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidWithSafeAttribute() throws Exception {
        Whitelist whitelist = Whitelist.basic().addAttributes("p", "class");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p class=\"foo\">Hello</p></body></html>");
        assertTrue(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidWithEnforcedAttributeMissing() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "href", "http://example.com");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a>Link</a></body></html>");
        assertFalse(cleaner.isValid(doc));
    }

    @Test
    public void testIsValidWithEnforcedAttributePresent() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "href", "http://example.com");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"http://example.com\">Link</a></body></html>");
        assertTrue(cleaner.isValid(doc));
    }

    @Test
    public void testCleanWithEmptyBody() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Document.createShell("");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanHandlesFramesetDocument() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Document.createShell("");
        Element head = doc.head();
        Element frameset = new Element(Tag.valueOf("frameset"), doc.baseUri());
        frameset.appendChild(new Element(Tag.valueOf("frame"), doc.baseUri()).attr("src", "frame.html"));
        doc.body().replaceWith(frameset);
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body></body></html>", cleanedDoc.html()); // frameset body is discarded
    }

    @Test
    public void testCleanPreservesTextNodes() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Some <b>bold</b> text.</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p>Some <b>bold</b> text.</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanDoesNotDiscardTextNodes() throws Exception {
        Whitelist whitelist = Whitelist.none(); // Allow no tags, but text should remain
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p>Just text.</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body>Just text.</body></html>", cleanedDoc.html()); // <p> tag is removed, text remains
    }
    
    @Test
    public void testCleanHandlesEmptyTagAttributes() throws Exception {
        Whitelist whitelist = Whitelist.basic().addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"\">Empty Link</a></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><a href=\"\">Empty Link</a></body></html>", cleanedDoc.html());
    }
    
    @Test
    public void testCleanHandlesAttributeWithEmptyValue() throws Exception {
        Whitelist whitelist = Whitelist.basic().addAttributes("p", "class");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p class=\"\">Empty Class</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p class=\"\">Empty Class</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithNonDefaultBaseUri() throws Exception {
        Whitelist whitelist = Whitelist.basic().preserveRelativeLinks(true);
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><a href=\"/path/to/page\">Relative Link</a></body></html>", "http://example.com");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><a href=\"/path/to/page\">Relative Link</a></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanWithEnforcedAttributeValueOverride() throws Exception {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("p", "dir", "rtl");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Jsoup.parse("<html><body><p dir=\"ltr\">Text</p></body></html>");
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body><p dir=\"rtl\">Text</p></body></html>", cleanedDoc.html());
    }

    @Test
    public void testCleanIgnoresUnknownBaseUri() throws Exception {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Document.createShell(null); // null base URI
        Document cleanedDoc = cleaner.clean(doc);
        assertEquals("<html><head></head><body></body></html>", cleanedDoc.html());
    }
}
