package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseFragmentSimple() {
        String html = "<div><p>Hello</p><p>World</p></div>";
        Document doc = Jsoup.parse(html);
        Elements divs = doc.select("div");
        assertEquals(1, divs.size());
        assertEquals(2, divs.get(0).children().size());
        assertEquals("Hello", divs.get(0).child(0).text());
        assertEquals("World", divs.get(0).child(1).text());
    }

    @Test
    public void testParseFragmentWithUnknownTag() {
        String html = "<div><custom>Content</custom></div>";
        Document doc = Jsoup.parse(html);
        Elements divs = doc.select("div");
        assertEquals(1, divs.size());
        assertEquals(1, divs.get(0).children().size());
        assertEquals("custom", divs.get(0).child(0).tagName());
        assertEquals("Content", divs.get(0).child(0).text());
    }

    @Test
    public void testParseFragmentWithSelfClosingTag() {
        String html = "<div><br/></div>";
        Document doc = Jsoup.parse(html);
        Elements divs = doc.select("div");
        assertEquals(1, divs.size());
        assertEquals(1, divs.get(0).children().size());
        assertEquals("br", divs.get(0).child(0).tagName());
        // Self-closing tags in HTML5 don't get a specific attribute for self-closing.
        // They are just void elements. We test if it's parsed as expected.
        assertTrue(divs.get(0).child(0).is("br"));
    }

    @Test
    public void testParseFragmentWithEmptyTag() {
        String html = "<div><></div>"; // Should be parsed as a div
        Document doc = Jsoup.parse(html);
        Elements divs = doc.select("div");
        assertEquals(1, divs.size());
        assertEquals(1, divs.get(0).children().size());
        assertEquals("div", divs.get(0).child(0).tagName());
    }

    @Test
    public void testParseFragmentWithMultipleParagraphs() {
        String html = "<p>1</p><p>2</p><p>3</p>";
        Document doc = Jsoup.parse(html);
        Elements ps = doc.select("p");
        assertEquals(3, ps.size());
        assertEquals("1", ps.get(0).text());
        assertEquals("2", ps.get(1).text());
        assertEquals("3", ps.get(2).text());
    }

    @Test
    public void testParseFragmentWithNestedLists() {
        String html = "<ul><li>Item 1<ul><li>Subitem 1.1</li><li>Subitem 1.2</li></ul></li><li>Item 2</li></ul>";
        Document doc = Jsoup.parse(html);
        Elements lis = doc.select("li");
        assertEquals(3, lis.size());
        assertEquals("Item 1", lis.get(0).text().trim());
        assertEquals("Subitem 1.1", lis.get(1).text().trim());
        assertEquals("Subitem 1.2", lis.get(2).text().trim());
    }

    @Test
    public void testParseFragmentWithTables() {
        String html = "<table><thead><tr><th>Header</th></tr></thead><tbody><tr><td>Data</td></tr></tbody></table>";
        Document doc = Jsoup.parse(html);
        Element table = doc.select("table").first();
        assertNotNull(table);
        assertEquals("Header", table.select("th").first().text());
        assertEquals("Data", table.select("td").first().text());
    }

    @Test
    public void testParseFragmentWithForms() {
        String html = "<form><input type='text' name='q'><button type='submit'>Search</button></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = doc.select("form").first();
        assertNotNull(form);
        assertEquals(2, form.children().size());
        assertEquals("input", form.child(0).tagName());
        assertEquals("button", form.child(1).tagName());
    }

    @Test
    public void testParseFragmentWithAttributes() {
        String html = "<div id='main' class='container'><a href='#' title='Link'>Click</a></div>";
        Document doc = Jsoup.parse(html);
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("main", div.id());
        assertTrue(div.hasClass("container"));
        Element a = div.select("a").first();
        assertNotNull(a);
        assertEquals("#", a.attr("href"));
        assertEquals("Link", a.attr("title"));
    }

    @Test
    public void testParseFragmentWithComments() {
        String html = "<div><!-- This is a comment --></div>";
        Document doc = Jsoup.parse(html);
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals(1, div.childNodes().size());
        assertTrue(div.childNode(0) instanceof Comment);
        assertEquals(" This is a comment ", ((Comment) div.childNode(0)).getData());
    }

    @Test
    public void testParseFragmentWithDoctype() {
        String html = "<!DOCTYPE html><html><body>Hi</body></html>";
        Document doc = Jsoup.parse(html);
        // The doctype itself is not directly accessible as a node in the same way as elements.
        // We can check the document's quirks mode, which is derived from the doctype.
        // For this test, we will assert that the document is not in quirks mode if a standard doctype is present.
        assertFalse(doc.quirksMode() == Document.QuirksMode.quirks);
    }

    @Test
    public void testParseFragmentWithScriptAndStyle() {
        String html = "<script>var x = 1;</script><style>.red { color: red; }</style>";
        Document doc = Jsoup.parse(html);
        Elements scripts = doc.select("script");
        assertEquals(1, scripts.size());
        assertEquals("var x = 1;", scripts.first().data());
        Elements styles = doc.select("style");
        assertEquals(1, styles.size());
        assertEquals(".red { color: red; }", styles.first().data());
    }

    @Test
    public void testParseFragmentWithDataNodes() {
        String html = "<script>console.log('hello');</script>";
        Document doc = Jsoup.parse(html);
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.childNode(0) instanceof DataNode);
        assertEquals("console.log('hello');", script.childNode(0).outerHtml());
    }

    @Test
    public void testParseFragmentWithTextNodes() {
        String html = "<div>Some text</div>";
        Document doc = Jsoup.parse(html);
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertTrue(div.childNode(0) instanceof TextNode);
        assertEquals("Some text", div.childNode(0).outerHtml());
    }

    @Test
    public void testParseFragmentWithEmptyString() {
        String html = "";
        Document doc = Jsoup.parse(html);
        assertEquals(0, doc.childNodes().size());
    }

    @Test
    public void testParseFragmentWithWhitespace() {
        String html = "   \n \t ";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.childNode(0) instanceof TextNode);
        assertEquals("   \n \t ", doc.childNode(0).outerHtml());
    }

    @Test
    public void testParseFragmentWithLeadingAndTrailingSpacesAroundTags() {
        String html = "  <div>  <p>  Hello  </p>  </div>  ";
        Document doc = Jsoup.parse(html);
        Elements divs = doc.select("div");
        assertEquals(1, divs.size());
        assertEquals(1, divs.get(0).children().size());
        assertEquals("p", divs.get(0).child(0).tagName());
        assertEquals("  Hello  ", divs.get(0).child(0).html()); // HTML preserves internal whitespace
    }

    @Test
    public void testParseFragmentWithEntities() {
        String html = "<div>&lt;tag&gt; &amp; &quot;quote&quot;</div>";
        Document doc = Jsoup.parse(html);
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("<tag> & \"quote\"", div.text());
    }

    @Test
    public void testParseFragmentWithNumericEntities() {
        String html = "<div>&#60;tag&#62; &#x26; &#x22;quote&#x22;</div>";
        Document doc = Jsoup.parse(html);
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("<tag> & \"quote\"", div.text());
    }

    @Test
    public void testParseFragmentWithUnclosedTags() {
        String html = "<div><p>Hello</div>"; // Missing closing </p>
        Document doc = Jsoup.parse(html);
        Elements divs = doc.select("div");
        assertEquals(1, divs.size());
        assertEquals(1, divs.get(0).children().size());
        assertEquals("p", divs.get(0).child(0).tagName());
        assertEquals("Hello", divs.get(0).child(0).text());
    }

    @Test
    public void testParseFragmentWithMismatchedTags() {
        String html = "<div><p><span>Hello</p></span></div>";
        Document doc = Jsoup.parse(html);
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals(1, div.children().size());
        Element p = div.child(0);
        assertEquals("p", p.tagName());
        assertEquals(1, p.children().size());
        Element span = p.child(0);
        assertEquals("span", span.tagName());
        assertEquals("Hello", span.text());
    }

    @Test
    public void testParseFragmentWithNestingAndClosing() {
        String html = "<ul><li>1<li>2</ul>";
        Document doc = Jsoup.parse(html);
        Elements lis = doc.select("li");
        assertEquals(2, lis.size());
        assertEquals("1", lis.get(0).text());
        assertEquals("2", lis.get(1).text());
    }

    @Test
    public void testParseFragmentWithSpecialTags() {
        String html = "<head><title>Test</title></head><body><p>Body</p></body>";
        Document doc = Jsoup.parse(html);
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("Test", head.select("title").first().text());
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("Body", body.select("p").first().text());
    }

    @Test
    public void testParseFragmentWithIframe() {
        String html = "<div><iframe></iframe></div>";
        Document doc = Jsoup.parse(html);
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals(1, div.children().size());
        assertEquals("iframe", div.child(0).tagName());
    }

    @Test
    public void testParseFragmentWithUnknownVoidElement() {
        String html = "<unknown/>"; // Unknown void element
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.childNodes().size());
        Element el = (Element) doc.childNode(0);
        assertEquals("unknown", el.tagName());
        assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testParseFragmentWithBodyInsideHtml() {
        String html = "<html><body>Hello</body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseFragmentWithHeadInsideHtml() {
        String html = "<html><head><title>Title</title></head></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Title", doc.title());
    }

    @Test
    public void testParseFragmentWithMultipleHeadTags() {
        String html = "<html><head>1</head><head>2</head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.head().childNodes().size());
        assertEquals("1", doc.head().text());
    }

    @Test
    public void testParseFragmentWithMultipleBodyTags() {
        String html = "<html><body>1</body><body>2</body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.body().childNodes().size());
        assertEquals("1", doc.body().text());
    }

    @Test
    public void testParseFragmentWithBaseUri() {
        String html = "<base href='http://example.com/path/'><p>Link</p>";
        Document doc = Jsoup.parse(html, "http://localhost/");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("http://example.com/path/", doc.baseUri());
        // The href attribute should be resolved to an absolute URL.
        // The test should check if the resolved URL is correct.
        assertEquals("http://example.com/path/", p.attr("href"));
    }

    @Test
    public void testParseFragmentWithBaseHrefAndRelativeLink() {
        String html = "<base href='http://example.com/path/'><a href='sub/page.html'>Link</a>";
        Document doc = Jsoup.parse(html, "http://localhost/");
        Element a = doc.select("a").first();
        assertNotNull(a);
        assertEquals("http://example.com/path/sub/page.html", a.attr("href"));
    }
}
