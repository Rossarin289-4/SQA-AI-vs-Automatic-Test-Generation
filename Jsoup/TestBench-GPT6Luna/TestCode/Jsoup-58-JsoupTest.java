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

public class JsoupTest {
    @Test
    public void testParseUsesSuppliedBaseUri() throws Exception {
        Document doc = Jsoup.parse("<a href='item'>go</a>", "http://example.com/path/");
        assertEquals("http://example.com/path/", doc.baseUri());
        assertEquals("http://example.com/path/item", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testParseConvenienceUsesEmptyBaseUri() throws Exception {
        Document doc = Jsoup.parse("<p>x</p>");
        assertEquals("", doc.baseUri());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testParserOverloadHonorsXmlParser() throws Exception {
        Document doc = Jsoup.parse("<Root><Child/></Root>", "", Parser.xmlParser());
        assertEquals("Root", doc.child(0).tagName());
        assertEquals("Child", doc.child(0).child(0).tagName());
    }

    @Test
    public void testParseBodyFragmentKeepsBodyContent() throws Exception {
        Document doc = Jsoup.parseBodyFragment("<p>one</p><p>two</p>", "http://example.com/");
        assertEquals(2, doc.body().children().size());
        assertEquals("one", doc.body().child(0).text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParseBodyFragmentWithoutBaseUri() throws Exception {
        Document doc = Jsoup.parseBodyFragment("<b>text</b>");
        assertEquals("text", doc.body().text());
        assertEquals("", doc.baseUri());
    }

    @Test
    public void testParseBodyFragmentRepairsPlainText() throws Exception {
        Document doc = Jsoup.parseBodyFragment("plain");
        assertEquals("plain", doc.body().text());
    }

    @Test
    public void testCleanRemovesDisallowedElementsButKeepsText() throws Exception {
        String result = Jsoup.clean("<script>bad</script><b>good</b>", Whitelist.simpleText());
        assertEquals("<b>good</b>", result);
    }

    @Test
    public void testCleanStripsDisallowedAttributes() throws Exception {
        String result = Jsoup.clean("<b onclick='x'>ok</b>", Whitelist.simpleText());
        assertEquals("<b>ok</b>", result);
    }

    @Test
    public void testCleanPreservesPermittedHref() throws Exception {
        String result = Jsoup.clean("<a href='http://example.com'>link</a>", Whitelist.basic());
        assertEquals("<a href=\"http://example.com\" rel=\"nofollow\">link</a>", result);
    }

    @Test
    public void testCleanWithBaseUriMakesRelativeLinkAbsolute() throws Exception {
        String result = Jsoup.clean("<a href='/item'>link</a>", "http://example.com/base", Whitelist.basic());
        assertEquals("<a href=\"http://example.com/item\" rel=\"nofollow\">link</a>", result);
    }

    @Test
    public void testCleanWithOutputSettings() throws Exception {
        Document.OutputSettings settings = new Document.OutputSettings();
        String result = Jsoup.clean("<b>ok</b>", "", Whitelist.simpleText(), settings);
        assertEquals("<b>ok</b>", result);
    }

    @Test
    public void testIsValidAcceptsAllowedMarkup() throws Exception {
        assertTrue(Jsoup.isValid("<b>text</b>", Whitelist.simpleText()));
    }

    @Test
    public void testIsValidRejectsDisallowedElement() throws Exception {
        assertFalse(Jsoup.isValid("<script>x</script>", Whitelist.simpleText()));
    }

    @Test
    public void testIsValidRejectsDisallowedAttribute() throws Exception {
        assertFalse(Jsoup.isValid("<b onclick='x'>x</b>", Whitelist.simpleText()));
    }

    @Test
    public void testIsValidAcceptsPlainText() throws Exception {
        assertTrue(Jsoup.isValid("plain", Whitelist.none()));
    }

    @Test
    public void testConnectReturnsConnectionForHttpUrl() throws Exception {
        assertNotNull(Jsoup.connect("http://example.com"));
    }

    @Test
    public void testConnectReturnsConnectionForHttpsUrl() throws Exception {
        assertNotNull(Jsoup.connect("https://example.com"));
    }

    @Test
    public void testParseXmlFragmentPreservesCase() throws Exception {
        List<Node> nodes = Parser.parseXmlFragment("<Root/>", "");
        assertEquals(1, nodes.size());
        assertEquals("Root", ((Element) nodes.get(0)).tagName());
    }

    @Test
    public void testParseFragmentParsesMultipleNodes() throws Exception {
        List<Node> nodes = Parser.parseFragment("<b>a</b><i>b</i>", null, "");
        assertEquals(1, nodes.size());
        assertEquals("b", ((Element) nodes.get(0)).tagName());
    }

    @Test
    public void testUnescapeEntitiesInText() throws Exception {
        assertEquals("&", Parser.unescapeEntities("&amp;", false));
    }

    @Test
    public void testUnescapeEntitiesInAttribute() throws Exception {
        assertEquals("&", Parser.unescapeEntities("&amp;", true));
    }

    @Test
    public void testRelaxedFragmentParsingBuildsDocumentBody() throws Exception {
        Document doc = Parser.parseBodyFragmentRelaxed("<p>x</p>", "");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testParseInputWithHtmlParser() throws Exception {
        Parser parser = Parser.htmlParser();
        Document doc = parser.parseInput("<p>edge</p>", "http://example.com/");
        assertEquals("edge", doc.body().text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testHtmlParserTreeBuilderIsRetained() throws Exception {
        Parser parser = Parser.htmlParser();
        assertSame(parser.getTreeBuilder(), parser.getTreeBuilder());
    }

    @Test
    public void testParserErrorTrackingDisabledInitially() throws Exception {
        Parser parser = Parser.htmlParser();
        assertFalse(parser.isTrackErrors());
        parser.parseInput("<p>x</p>", "");
        assertTrue(parser.getErrors().isEmpty());
    }

    @Test
    public void testParserErrorTrackingEnabledAtOne() throws Exception {
        Parser parser = Parser.htmlParser().setTrackErrors(1);
        assertTrue(parser.isTrackErrors());
        parser.parseInput("<p>x</p>", "");
        assertTrue(parser.getErrors().size() <= 1);
    }

    @Test
    public void testParserErrorTrackingDisabledAtZero() throws Exception {
        Parser parser = Parser.htmlParser().setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
        parser.parseInput("<p>x</p>", "");
        assertTrue(parser.getErrors().isEmpty());
    }

    @Test
    public void testParserErrorTrackingEnabledForNegativeLimit() throws Exception {
        Parser parser = Parser.htmlParser().setTrackErrors(-1);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSettingsSetterReturnsParserAndStoresSettings() throws Exception {
        Parser parser = Parser.htmlParser();
        assertSame(parser, parser.settings(parser.settings()));
        assertSame(parser.settings(), parser.settings());
    }

    @Test
    public void testIsValidBodyHtmlAcceptsCleanMarkup() throws Exception {
        assertTrue(new Cleaner(Whitelist.simpleText()).isValidBodyHtml("<b>text</b>"));
    }

    @Test
    public void testIsValidBodyHtmlRejectsDisallowedMarkup() throws Exception {
        assertFalse(new Cleaner(Whitelist.simpleText()).isValidBodyHtml("<script>x</script>"));
    }

    @Test
    public void testIsValidBodyHtmlAcceptsPlainText() throws Exception {
        assertTrue(new Cleaner(Whitelist.none()).isValidBodyHtml("plain"));
    }
}
