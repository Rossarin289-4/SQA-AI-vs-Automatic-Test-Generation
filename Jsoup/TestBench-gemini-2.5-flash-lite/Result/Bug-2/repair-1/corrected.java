package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.Validate;
import org.jsoup.nodes.*;
import java.util.*;

public class ParserTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseSimpleHtml() throws Exception {
        Document doc = Parser.parse("<html><head><title>Test Title</title></head><body><p>Hello</p></body></html>", "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testParseEmptyHtml() throws Exception {
        Document doc = Parser.parse("", "http://example.com");
        assertEquals("http://example.com", doc.baseUri());
        assertEquals(0, doc.childNodeSize()); // Should be an empty document
    }

    @Test
    public void testParseHtmlWithNoBody() throws Exception {
        Document doc = Parser.parse("<html><head></head></html>", "http://example.com");
        assertEquals("http://example.com", doc.baseUri());
        assertEquals(1, doc.children().size());
        assertEquals("html", doc.child(0).tagName());
        assertEquals(1, doc.child(0).children().size());
        assertEquals("head", doc.child(0).child(0).tagName());
    }

    @Test
    public void testParseFragment() throws Exception {
        Document doc = Parser.parseBodyFragment("<p>Paragraph</p><div>Div</div>", "http://example.com");
        assertEquals("http://example.com", doc.baseUri());
        assertEquals(2, doc.body().children().size());
        assertEquals("p", doc.body().child(0).tagName());
        assertEquals("Paragraph", doc.body().child(0).text());
        assertEquals("div", doc.body().child(1).tagName());
        assertEquals("Div", doc.body().child(1).text());
    }

    @Test
    public void testParseComment() throws Exception {
        Document doc = Parser.parse("<html><body><!-- This is a comment --></body></html>", "http://example.com");
        assertEquals(1, doc.body().childNodes().size());
        assertTrue(doc.body().childNode(0) instanceof Comment);
        assertEquals(" This is a comment ", ((Comment) doc.body().childNode(0)).getData());
    }

    @Test
    public void testParseCdata() throws Exception {
        Document doc = Parser.parse("<html><body><![CDATA[ <p>CDATA content</p> ]]></body></html>", "http://example.com");
        assertEquals(1, doc.body().childNodes().size());
        assertTrue(doc.body().childNode(0) instanceof TextNode);
        // CDATA content is treated as raw text. The outerHtml() method will represent it as TextNode content.
        assertEquals(" <p>CDATA content</p> ", doc.body().childNode(0).outerHtml().trim());
    }

    @Test
    public void testParseXmlDecl() throws Exception {
        Document doc = Parser.parse("<?xml version=\"1.0\" encoding=\"UTF-8\"?><html/>", "http://example.com");
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        // The XmlDeclaration object's toString() method provides the declaration data.
        assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", doc.childNode(0).toString());
    }

    @Test
    public void testParseProcInstr() throws Exception {
        Document doc = Parser.parse("<?xml-stylesheet type=\"text/css\" href=\"style.css\"?><html/>", "http://example.com");
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        // The XmlDeclaration object's toString() method provides the declaration data.
        assertEquals("xml-stylesheet type=\"text/css\" href=\"style.css\"", doc.childNode(0).toString());
    }

    @Test
    public void testParseStartTagNoAttributes() throws Exception {
        Document doc = Parser.parse("<html><body><p>Text</p></body></html>", "http://example.com");
        assertEquals("p", doc.select("p").first().tagName());
        assertEquals("Text", doc.select("p").first().text());
    }

    @Test
    public void testParseStartTagWithAttributes() throws Exception {
        Document doc = Parser.parse("<html><body><p id=\"main\" class=\"content\">Text</p></body></html>", "http://example.com");
        Element p = doc.select("p").first();
        assertEquals("main", p.attr("id"));
        assertEquals("content", p.className());
        assertEquals("Text", p.text());
    }

    @Test
    public void testParseStartTagEmptyElementSelfClosed() throws Exception {
        Document doc = Parser.parse("<html><body><img src=\"test.jpg\"/></body></html>", "http://example.com");
        assertEquals("img", doc.select("img").first().tagName());
        assertEquals("test.jpg", doc.select("img").first().attr("src"));
        assertTrue(Tag.valueOf("img").isEmpty()); // img is predefined as empty
    }

    @Test
    public void testParseStartTagEmptyElementImplicit() throws Exception {
        Document doc = Parser.parse("<html><body><br></body></html>", "http://example.com");
        assertEquals("br", doc.select("br").first().tagName());
        assertTrue(Tag.valueOf("br").isEmpty()); // br is predefined as empty
    }

    @Test
    public void testParseStartTagWithQuotes() throws Exception {
        Document doc = Parser.parse("<html><body><a href=\"http://example.com\">Link</a></body></html>", "http://example.com");
        assertEquals("http://example.com", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testParseStartTagWithoutQuotes() throws Exception {
        Document doc = Parser.parse("<html><body><a href=http://example.com>Link</a></body></html>", "http://example.com");
        assertEquals("http://example.com", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testParseStartTagUnquotedValueWithSpace() throws Exception {
        Document doc = Parser.parse("<html><body><input type=text disabled></body></html>", "http://example.com");
        assertEquals("text", doc.select("input").first().attr("type"));
        assertTrue(doc.select("input").first().hasAttr("disabled"));
    }

    @Test
    public void testParseStartTagAttributeKeyOnly() throws Exception {
        Document doc = Parser.parse("<html><body><input disabled></body></html>", "http://example.com");
        assertTrue(doc.select("input").first().hasAttr("disabled"));
    }

    @Test
    public void testParseEndTagSimple() throws Exception {
        Document doc = Parser.parse("<html><body><p>Some text</p></body></html>", "http://example.com");
        assertEquals("body", doc.body().tagName());
        assertEquals(1, doc.body().children().size());
        assertEquals("p", doc.body().child(0).tagName());
    }

    @Test
    public void testParseEndTagMismatched() throws Exception {
        Document doc = Parser.parse("<html><body><p><b>Bold</p></b></body></html>", "http://example.com");
        // The parser should handle this by closing the <p> and then parsing </b> as a new tag or text.
        // Based on the source, it should close the p.
        assertEquals("body", doc.body().tagName());
        assertEquals(1, doc.body().children().size()); // Expecting only <p>
        assertEquals("p", doc.body().child(0).tagName());
        assertEquals(1, doc.body().child(0).children().size());
        assertEquals("b", doc.body().child(0).child(0).tagName());
        assertEquals("Bold", doc.body().child(0).child(0).text());
    }

    @Test
    public void testParseEndTagWithMissingTag() throws Exception {
        Document doc = Parser.parse("<html><body><p>Some text</p><div></div></body></html>", "http://example.com");
        assertEquals("body", doc.body().tagName());
        assertEquals(2, doc.body().children().size());
        assertEquals("p", doc.body().child(0).tagName());
        assertEquals("div", doc.body().child(1).tagName());
    }

    @Test
    public void testParseTextNode() throws Exception {
        Document doc = Parser.parse("<html><body>Hello World</body></html>", "http://example.com");
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testParseTextNodeWithEntities() throws Exception {
        Document doc = Parser.parse("<html><body>&lt;div&gt;Escaped&lt;/div&gt;</body></html>", "http://example.com");
        // TextNode.createFromEncoded will decode HTML entities.
        assertEquals("<div>Escaped</div>", doc.body().html());
    }

    @Test
    public void testParseTextNodeWithLeadingTrailingSpace() throws Exception {
        Document doc = Parser.parse("<html><body>  Some Text  </body></html>", "http://example.com");
        assertEquals("  Some Text  ", doc.body().html());
    }

    @Test
    public void testParseTitleTagContent() throws Exception {
        Document doc = Parser.parse("<html><head><title>Page Title</title></head><body></body></html>", "http://example.com");
        assertEquals("Page Title", doc.title());
        assertEquals("title", doc.head().child(0).tagName());
        assertEquals("Page Title", doc.head().child(0).text());
    }

    @Test
    public void testParseTextareaTagContent() throws Exception {
        Document doc = Parser.parse("<html><body><textarea>Textarea Content</textarea></body></html>", "http://example.com");
        assertEquals("Textarea Content", doc.select("textarea").first().text());
    }

    @Test
    public void testParseBaseUriUpdate() throws Exception {
        Document doc = Parser.parse("<html><body><p>Paragraph</p><base href=\"http://new.example.com/path/\"></body></html>", "http://example.com");
        assertEquals("http://new.example.com/path/", doc.baseUri());
        assertEquals("http://new.example.com/path/", doc.body().baseUri());
    }

    @Test
    public void testParseBaseUriUpdateNoHref() throws Exception {
        Document doc = Parser.parse("<html><body><p>Paragraph</p><base target=\"_blank\"></body></html>", "http://example.com");
        assertEquals("http://example.com", doc.baseUri()); // Base URI should not change if href is missing
    }

    @Test
    public void testParseNestedEmptyTags() throws Exception {
        Document doc = Parser.parse("<html><body><div><p><br></p></div></body></html>", "http://example.com");
        assertEquals("div", doc.body().child(0).tagName());
        assertEquals("p", doc.body().child(0).child(0).tagName());
        assertEquals("br", doc.body().child(0).child(0).child(0).tagName());
    }

    @Test
    public void testParseFragmentWithImplicitHtmlBodyHead() throws Exception {
        Document doc = Parser.parseBodyFragment("<div>Content</div>", "http://example.com");
        assertEquals("html", doc.child(0).tagName());
        assertEquals("body", doc.child(0).child(0).tagName());
        assertEquals("head", doc.child(0).child(0).child(0).tagName()); // Implicit head before body content
        assertEquals("div", doc.body().child(1).tagName()); // Body content starts after implicit head
    }

    @Test
    public void testParseMalformedHtmlAttribute() throws Exception {
        Document doc = Parser.parse("<html><body><p class=test > text</p></body></html>", "http://example.com");
        assertEquals("test", doc.select("p").first().className());
    }

    @Test
    public void testParseHtmlWithAttributesWithQuotesAndSpaces() throws Exception {
        Document doc = Parser.parse("<html><body><a href=\"http://example.com/some page\" title='Some Title'>Link</a></body></html>", "http://example.com");
        assertEquals("http://example.com/some page", doc.select("a").first().absUrl("href"));
        assertEquals("Some Title", doc.select("a").first().attr("title"));
    }

    @Test
    public void testParseDoctype() throws Exception {
        Document doc = Parser.parse("<!DOCTYPE html><html><body></body></html>", "http://example.com");
        assertEquals("http://example.com", doc.baseUri());
        assertEquals(1, doc.childNodes().size()); // DOCTYPE is not a child node in the Document object's children
        assertEquals("html", doc.child(0).tagName());
    }

    @Test
    public void testParseHtmlWithMultipleBaseTags() throws Exception {
        Document doc = Parser.parse("<html><body><base href=\"http://first.com\"><base href=\"http://second.com\"></body></html>", "http://example.com");
        // The last base tag should take precedence
        assertEquals("http://second.com", doc.baseUri());
    }

    @Test
    public void testParseHtmlWithEmptyAttributeValue() throws Exception {
        Document doc = Parser.parse("<html><body><input type=\"\"></body></html>", "http://example.com");
        assertEquals("", doc.select("input").first().attr("type"));
    }

    @Test
    public void testParseHtmlWithEmptyAttributeValueNoQuotes() throws Exception {
        Document doc = Parser.parse("<html><body><input type=></body></html>", "http://example.com");
        assertEquals("", doc.select("input").first().attr("type"));
    }

    @Test
    public void testParseHtmlWithAttributeKeyContainingSpecialChars() throws Exception {
        // Based on consumeAttributeKey, it seems to consume letters, digits, -, _, :
        Document doc = Parser.parse("<html><body><span data-attr:key=\"value\"></span></body></html>", "http://example.com");
        assertEquals("value", doc.select("span").first().attr("data-attr:key"));
    }
}
