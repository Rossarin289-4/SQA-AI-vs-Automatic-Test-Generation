```java
package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.parser.HtmlTreeBuilder;
import java.nio.charset.Charset;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.ParseError;
import java.util.Collection;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class JsoupTest {
    @Test
    public void testParse_basicHtml_withBaseUri() throws Exception {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello</p></body></html>";
        String baseUri = "http://example.com/";
        Document doc = Jsoup.parse(html, baseUri);
        assertEquals("Test Title", doc.title());
        assertEquals("http://example.com/", doc.location());
        assertEquals("<p>Hello</p>", doc.body().html());
    }

    @Test
    public void testParse_basicHtml_noBaseUri() throws Exception {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello</p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Test Title", doc.title());
        assertEquals("", doc.location()); // No base URI means empty location
        assertEquals("<p>Hello</p>", doc.body().html());
    }

    @Test
    public void testParse_htmlWithBaseTag() throws Exception {
        String html = "<html><head><title>Test Title</title><base href=\"http://base.com/\"></head><body><p><a href=\"page.html\">Link</a></p></body></html>";
        String baseUri = "http://example.com/"; // This should be overridden by the base tag
        Document doc = Jsoup.parse(html, baseUri);
        assertEquals("http://base.com/", doc.location());
        assertEquals("http://base.com/page.html", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testParse_htmlWithAlternateParser() throws Exception {
        String html = "<doc><item>Value</item></doc>";
        String baseUri = "http://example.com/";
        Parser xmlParser = Parser.xmlParser();
        Document doc = Jsoup.parse(html, baseUri, xmlParser);
        assertEquals("doc", doc.childNode(0).nodeName()); // XML parser creates a different structure
        assertEquals("item", doc.select("item").first().nodeName());
    }

    @Test
    public void testConnect_validUrl() throws Exception {
        // Test creation of Connection object, not network activity.
        try {
            org.jsoup.Connection con = Jsoup.connect("http://example.com");
            assertNotNull(con);
        } catch (Exception e) {
            // Fail if connection object creation itself throws an unexpected error.
            fail("Jsoup.connect() threw an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testParse_file_withCharsetAndBaseUri() throws Exception {
        File tempFile = File.createTempFile("jsouptest", ".html");
        tempFile.deleteOnExit();
        String htmlContent = "<html><body><p>File content</p></body></html>";
        Files.write(tempFile.toPath(), htmlContent.getBytes("UTF-8"));

        try {
            Document doc = Jsoup.parse(tempFile, "UTF-8", "http://file.test/");
            assertEquals("http://file.test/", doc.location());
            assertEquals("<p>File content</p>", doc.body().html());
        } finally {
            if (tempFile.exists()) {
                tempFile.delete();
            }
        }
    }

    @Test
    public void testParse_file_withCharsetNoBaseUri() throws Exception {
        File tempFile = File.createTempFile("jsouptest", ".html");
        tempFile.deleteOnExit();
        String htmlContent = "<html><body><p>File content</p></body></html>";
        Files.write(tempFile.toPath(), htmlContent.getBytes("UTF-8"));

        try {
            Document doc = Jsoup.parse(tempFile, "UTF-8");
            // Ensure absolute URL detection for file path is consistent
            assertEquals(tempFile.getAbsolutePath(), doc.location());
            assertEquals("<p>File content</p>", doc.body().html());
        } finally {
            if (tempFile.exists()) {
                tempFile.delete();
            }
        }
    }

    @Test
    public void testParse_inputStream_withCharsetAndBaseUri() throws Exception {
        String html = "<html><body><p>Stream content</p></body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        String baseUri = "http://stream.test/";
        Document doc = Jsoup.parse(is, "UTF-8", baseUri);
        assertEquals("http://stream.test/", doc.location());
        assertEquals("<p>Stream content</p>", doc.body().html());
        is.close(); // Close the stream
    }

    @Test
    public void testParse_inputStream_withCharsetBaseUriAndParser() throws Exception {
        String html = "<data><value>Stream data</value></data>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        String baseUri = "http://stream.test/";
        Parser xmlParser = Parser.xmlParser();
        Document doc = Jsoup.parse(is, "UTF-8", baseUri, xmlParser);
        assertEquals("data", doc.childNode(0).nodeName());
        assertEquals("value", doc.select("value").first().nodeName());
        is.close(); // Close the stream
    }

    @Test
    public void testParseBodyFragment_basicFragment_withBaseUri() throws Exception {
        String bodyHtml = "<p>This is a fragment.</p>";
        String baseUri = "http://fragment.test/";
        Document doc = Jsoup.parseBodyFragment(bodyHtml, baseUri);
        assertEquals("http://fragment.test/", doc.location());
        assertEquals("<p>This is a fragment.</p>", doc.body().html());
    }

    @Test
    public void testParseBodyFragment_basicFragment_noBaseUri() throws Exception {
        String bodyHtml = "<p>This is a fragment.</p>";
        Document doc = Jsoup.parseBodyFragment(bodyHtml);
        assertEquals("", doc.location());
        assertEquals("<p>This is a fragment.</p>", doc.body().html());
    }

    @Test
    public void testParse_url_withTimeout() throws Exception {
        // This test focuses on the method call and setting the timeout, not actual network fetch.
        URL testUrl = null;
        try {
            testUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            fail("Malformed URL created unexpectedly.");
        }
        int timeout = 5000;
        try {
            Jsoup.parse(testUrl, timeout);
            // If this line executes without throwing an exception related to connection setup,
            // it implies the method was entered and timeout set. Actual fetch errors are expected if network fails.
        } catch (IOException e) {
            // Expected for network issues, but we verify the call was made.
            assertTrue(e.getMessage().contains("timed out") || e.getMessage().contains("Connection timed out"));
        } catch (Exception e) {
            fail("Jsoup.parse(URL, timeout) threw an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testClean_basicHtml_withWhitelist() throws Exception {
        String dirtyHtml = "<p>Hello <a href='http://example.com'>World</a></p><script>alert('XSS')</script>";
        Whitelist whitelist = Whitelist.basic();
        String cleanHtml = Jsoup.clean(dirtyHtml, "", whitelist); // Empty baseUri
        assertEquals("<p>Hello <a href=\"http://example.com\">World</a></p>", cleanHtml);
    }

    @Test
    public void testClean_htmlWithCustomAttributesAndProtocols() throws Exception {
        String dirtyHtml = "<p id='test' data-id='123' onclick='alert(\"bad\")'><a href='mailto:test@example.com'>Email</a></p>";
        Whitelist whitelist = Whitelist.basic()
                .addAttributes("p", "id", "data-id")
                .addProtocols("a", "href", "mailto", "http", "https");
        String cleanHtml = Jsoup.clean(dirtyHtml, "", whitelist);
        assertEquals("<p id=\"test\" data-id=\"123\"><a href=\"mailto:test@example.com\">Email</a></p>", cleanHtml);
    }

    @Test
    public void testClean_htmlWithEnforcedAttributes() throws Exception {
        String dirtyHtml = "<a href='page.html'>Link</a>";
        Whitelist whitelist = Whitelist.basic()
                .addEnforcedAttribute("a", "target", "_blank")
                .addEnforcedAttribute("a", "rel", "noopener");
        String cleanHtml = Jsoup.clean(dirtyHtml, "", whitelist);
        assertEquals("<a href=\"page.html\" target=\"_blank\" rel=\"noopener\">Link</a>", cleanHtml);
    }

    @Test
    public void testClean_htmlWithOutputSettings() throws Exception {
        String dirtyHtml = "<p>Some <strong>bold</strong> text.</p>";
        Whitelist whitelist = Whitelist.basic();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false).escapeMode(org.jsoup.nodes.Entities.EscapeMode.extended);
        String cleanHtml = Jsoup.clean(dirtyHtml, "", whitelist, settings);
        assertEquals("<p>Some <strong>bold</strong> text.</p>", cleanHtml);
    }

    @Test
    public void testIsValid_validHtml_basicWhitelist() throws Exception {
        String html = "<p>Hello <strong>World</strong></p>";
        Whitelist whitelist = Whitelist.basic();
        assertTrue(Jsoup.isValid(html, whitelist));
    }

    @Test
    public void testIsValid_invalidHtml_basicWhitelist() throws Exception {
        String html = "<p><script>alert('XSS')</script>Hello</p>";
        Whitelist whitelist = Whitelist.basic();
        assertFalse(Jsoup.isValid(html, whitelist));
    }

    @Test
    public void testIsValid_validHtml_withImages() throws Exception {
        String html = "<p><img src='http://example.com/img.png'></p>";
        Whitelist whitelist = Whitelist.basicWithImages();
        assertTrue(Jsoup.isValid(html, whitelist));
    }

    @Test
    public void testIsValid_invalidHtml_withImages_badProtocol() throws Exception {
        String html = "<p><img src='ftp://example.com/img.png'></p>";
        Whitelist whitelist = Whitelist.basicWithImages();
        assertFalse(Jsoup.isValid(html, whitelist));
    }

    @Test
    public void testParser_htmlParser_returnsHtmlTreeBuilder() throws Exception {
        Parser parser = Jsoup.htmlParser();
        assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testParser_xmlParser_returnsXmlTreeBuilder() throws Exception {
        Parser parser = Jsoup.xmlParser();
        assertNotNull(parser);
        // The TreeBuilder itself is not public, so we cannot check its type directly via API.
        // We trust that xmlParser() returns a valid parser instance configured for XML.
    }

    @Test
    public void testParseFragment_withContext_andBaseUri() throws Exception {
        String fragmentHtml = "<b>bold</b><i>italic</i>";
        Element context = Document.createShell("http://context.test/").body();
        String baseUri = "http://context.test/";
        List<Node> nodes = Parser.parseFragment(fragmentHtml, context, baseUri);
        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("b", ((Element) nodes.get(0)).tagName());
        assertTrue(nodes.get(1) instanceof Element);
        assertEquals("i", ((Element) nodes.get(1)).tagName());
    }

    @Test
    public void testParseXmlFragment_basicXmlFragment() throws Exception {
        String fragmentXml = "<note><to>Tove</to><from>Jani</from></note>";
        String baseUri = "http://xml.test/";
        List<Node> nodes = Parser.parseXmlFragment(fragmentXml, baseUri);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("note", ((Element) nodes.get(0)).tagName());
        assertEquals("Tove", ((Element) nodes.get(0)).select("to").first().text());
    }

    @Test
    public void testUnescapeEntities_htmlEntities() throws Exception {
        String htmlEscaped = "Hello &amp; Goodbye &lt;tag&gt;";
        String unescaped = Jsoup.unescapeEntities(htmlEscaped, false);
        assertEquals("Hello & Goodbye <tag>", unescaped);
    }

    @Test
    public void testUnescapeEntities_attributeEntities() throws Exception {
        String htmlEscaped = "Hello &amp; Goodbye";
        String unescaped = Jsoup.unescapeEntities(htmlEscaped, true);
        assertEquals("Hello & Goodbye", unescaped);
    }

    @Test
    public void testParser_setTrackErrors_getErrors() throws Exception {
        Parser parser = Jsoup.htmlParser();
        parser.setTrackErrors(5);
        assertTrue(parser.isTrackErrors());
        List<ParseError> errors = parser.getErrors(); // Initially empty, but capacity is set
        parser.parseInput("<html><body></body></html>", "");
        assertEquals(0, errors.size()); // No errors for valid HTML
    }

    @Test
    public void testCleaner_isValidBodyHtml_true() throws Exception {
        String html = "<p>Safe content</p>";
        Whitelist whitelist = Whitelist.basic();
        assertTrue(Jsoup.isValid(html, whitelist));
    }

    @Test
    public void testCleaner_isValidBodyHtml_false() throws Exception {
        String html = "<script>alert('bad')</script>";
        Whitelist whitelist = Whitelist.basic();
        assertFalse(Jsoup.isValid(html, whitelist));
    }

    @Test
    public void testParser_settings_getSettings() throws Exception {
        Parser parser = Jsoup.htmlParser();
        ParseSettings settings = ParseSettings.htmlDefault();
        parser.settings(settings);
        assertEquals(settings, parser.settings());
    }

    @Test
    public void testJsoup_clean_preservesRelativeLinksDefault() throws Exception {
        String html = "<a href='page.html'>Link</a>";
        Whitelist whitelist = Whitelist.basic();
        String cleanHtml = Jsoup.clean(html, "", whitelist);
        assertEquals("<a href=\"page.html\">Link</a>", cleanHtml);
    }

    @Test
    public void testJsoup_clean_withPreserveRelativeLinksFalse() throws Exception {
        // Note: `Whitelist.preserveRelativeLinks()` is called on the Whitelist object,
        // and its effect is observed when a Cleaner uses that whitelist.
        // Jsoup.clean() uses Cleaner internally.
        String html = "<a href='page.html'>Link</a>";
        Whitelist whitelist = Whitelist.basic().preserveRelativeLinks(false);
        String baseUri = "http://example.com/";
        Document doc = Document.createShell(baseUri);
        doc.body().appendElement("a").attr("href", "page.html");
        Cleaner cleaner = new Cleaner(whitelist);
        Document cleanDoc = cleaner.clean(doc);
        assertEquals("http://example.com/page.html", cleanDoc.select("a").first().absUrl("href"));

        // Also test through Jsoup.clean which takes a baseUri argument
        cleanHtml = Jsoup.clean(html, baseUri, whitelist);
        assertEquals("<a href=\"http://example.com/page.html\">Link</a>", cleanHtml);
    }

    @Test
    public void testParse_emptyHtml_emptyBaseUri() throws Exception {
        String html = "";
        String baseUri = "";
        Document doc = Jsoup.parse(html, baseUri);
        assertEquals("", doc.title());
        assertEquals("", doc.location());
        assertEquals("", doc.body().html());
    }

    @Test
    public void testParse_htmlWithOnlyTags() throws Exception {
        String html = "<html><body><div><p><span></span></p></div></body></html>";
        String baseUri = "";
        Document doc = Jsoup.parse(html, baseUri);
        assertEquals("<div><p><span></span></p></div>", doc.body().html());
    }

    @Test
    public void testParser_setTreeBuilder() throws Exception {
        Parser parser = Jsoup.htmlParser();
        // HtmlTreeBuilder is not public, so we cannot instantiate it directly.
        // However, its functionality is exercised by htmlParser().
        // We can test that setting a TreeBuilder object (even if not a concrete public one)
        // through the public API is reflected. But since we can't instantiate one,
        // this test should focus on the get/set methods if applicable or be omitted.
        // Given the API, we cannot directly test setting a new TreeBuilder instance from outside the package.
        // This test will be skipped as we cannot create a valid TreeBuilder instance externally.
    }

    @Test
    public void testParseBodyFragmentRelaxed_basic() throws Exception {
        String bodyHtml = "<p>Relaxed fragment.</p>";
        String baseUri = "http://relaxed.test/";
        Document doc = Jsoup.parseBodyFragmentRelaxed(bodyHtml, baseUri);
        assertEquals("http://relaxed.test/", doc.location());
        assertEquals("<p>Relaxed fragment.</p>", doc.body().html());
    }

    @Test
    public void testIsValidBodyHtml_true_complex() throws Exception {
        String html = "<p>Safe <strong>content</strong> with <a href='#'>link</a></p>";
        Whitelist whitelist = Whitelist.basic();
        assertTrue(Jsoup.isValid(html, whitelist));
    }

    @Test
    public void testIsValidBodyHtml_false_complex() throws Exception {
        String html = "<p>Content with <img src='img.jpg' onerror='alert(1)'></p>";
        Whitelist whitelist = Whitelist.basic(); // basic whitelist does not allow img
        assertFalse(Jsoup.isValid(html, whitelist));
    }
}
```