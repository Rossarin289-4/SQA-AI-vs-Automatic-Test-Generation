package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.Validate;
import org.jsoup.nodes.*;
import java.util.*;

public class ParserTest {
    @Test
    public void testParseEmptyDocument() throws Exception {
        Document doc = Parser.parse("", "http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("html", doc.child(0).nodeName());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testParseTextAsBodyText() throws Exception {
        Document doc = Parser.parse("hello", "http://example.com/");
        assertEquals("hello", doc.body().text());
    }

    @Test
    public void testParseEncodedText() throws Exception {
        Document doc = Parser.parse("a&amp;b", "http://example.com/");
        assertEquals("a&b", doc.body().text());
    }

    @Test
    public void testParseMalformedLessThan() throws Exception {
        Document doc = Parser.parse("a < b", "http://example.com/");
        assertEquals("a < b", doc.body().text());
    }

    @Test
    public void testParseComment() throws Exception {
        Document doc = Parser.parse("<!--note--><p>x</p>", "http://example.com/");
        assertEquals("note", ((Comment) doc.child(0).childNode(0)).getData());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testParseCdata() throws Exception {
        Document doc = Parser.parse("<![CDATA[a&b]]>", "http://example.com/");
        assertEquals("a&b", doc.body().text());
    }

    @Test
    public void testParseDeclaration() throws Exception {
        Document doc = Parser.parse("<!abc><p>x</p>", "http://example.com/");
        assertEquals("abc", ((XmlDeclaration) doc.child(0).childNode(0)).getWholeDeclaration());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testParseAttributesWithQuotedAndUnquotedValues() throws Exception {
        Document doc = Parser.parse("<p id='one' title=two disabled>x</p>", "http://example.com/");
        Element p = doc.select("p").first();
        assertEquals("one", p.attr("id"));
        assertEquals("two", p.attr("title"));
        assertEquals("", p.attr("disabled"));
        assertEquals("x", p.text());
    }

    @Test
    public void testParseSelfClosingElement() throws Exception {
        Document doc = Parser.parse("<div><span/>tail</div>", "http://example.com/");
        Element div = doc.select("div").first();
        assertEquals(2, div.childNodes().size());
        assertEquals("span", div.child(0).tagName());
        assertEquals("tail", div.text());
    }

    @Test
    public void testParseImplicitHtmlStructure() throws Exception {
        Document doc = Parser.parse("<p>x</p>", "http://example.com/");
        assertEquals("html", doc.child(0).nodeName());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testParseDataTagRawContents() throws Exception {
        Document doc = Parser.parse("<script>if (a < b) &amp;</script>", "http://example.com/");
        assertEquals("if (a < b) &amp;", doc.select("script").first().data());
    }

    @Test
    public void testParseTextareaDecodesText() throws Exception {
        Document doc = Parser.parse("<textarea>a&amp;b</textarea>", "http://example.com/");
        assertEquals("a&b", doc.select("textarea").first().text());
    }

    @Test
    public void testParseBodyFragmentKeepsFragmentInBody() throws Exception {
        Document doc = Parser.parseBodyFragment("<p>x</p>", "http://example.com/");
        assertEquals("x", doc.body().text());
        assertEquals(1, doc.body().children().size());
        assertEquals("p", doc.body().child(0).tagName());
    }

    @Test
    public void testParseEmptyBodyFragment() throws Exception {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertEquals("", doc.body().text());
        assertEquals(0, doc.body().children().size());
        assertEquals("head", doc.head().tagName());
    }

    @Test
    public void testParseBaseUriUpdate() throws Exception {
        Document doc = Parser.parse("<base href='http://other.example/path/'><a href='child'>x</a>",
                "http://example.com/");
        assertEquals("http://other.example/path/", doc.baseUri());
        assertEquals("http://other.example/path/child", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testParseIgnoresUnmatchedEndTag() throws Exception {
        Document doc = Parser.parse("</unknown><p>x</p>", "http://example.com/");
        assertEquals("x", doc.body().text());
    }

    @Test
    public void testParseEndTagClosesNestedElements() throws Exception {
        Document doc = Parser.parse("<div><b>x</div>y", "http://example.com/");
        assertEquals("xy", doc.body().text());
        assertEquals(1, doc.select("div").first().children().size());
    }

    @Test
    public void testParseBooleanAttribute() throws Exception {
        Document doc = Parser.parse("<input checked>", "http://example.com/");
        assertEquals("", doc.select("input").first().attr("checked"));
        assertEquals(1, doc.select("input").size());
    }
}
