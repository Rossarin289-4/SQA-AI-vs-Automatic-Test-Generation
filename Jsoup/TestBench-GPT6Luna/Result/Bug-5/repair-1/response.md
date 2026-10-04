```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import java.util.LinkedList;

public class ParserTest {
    @Test
    public void testParseCreatesDocumentStructure() throws Exception {
        Document doc = Parser.parse("", "https://example.com/");
        assertEquals("html", doc.child(0).nodeName());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testParseTextInBody() throws Exception {
        Document doc = Parser.parse("<p>hello</p>", "https://example.com/");
        assertEquals("hello", doc.select("p").first().text());
    }

    @Test
    public void testParseQuotedAndUnquotedAttributes() throws Exception {
        Document doc = Parser.parse("<a x='one' y=two>z</a>", "https://example.com/");
        Element a = doc.select("a").first();
        assertEquals("one", a.attr("x"));
        assertEquals("two", a.attr("y"));
    }

    @Test
    public void testParseBooleanAttribute() throws Exception {
        Document doc = Parser.parse("<input disabled>", "https://example.com/");
        assertEquals("", doc.select("input").first().attr("disabled"));
        assertTrue(doc.select("input").first().hasAttr("disabled"));
    }

    @Test
    public void testParseEmptyTagDoesNotConsumeFollowingText() throws Exception {
        Document doc = Parser.parse("<img>after", "https://example.com/");
        assertEquals("after", doc.body().text());
    }

    @Test
    public void testParseTextareaAsText() throws Exception {
        Document doc = Parser.parse("<textarea>&amp;</textarea>", "https://example.com/");
        assertEquals("&", doc.select("textarea").first().text());
    }

    @Test
    public void testParseScriptAsRawData() throws Exception {
        Document doc = Parser.parse("<script>a<b</script>", "https://example.com/");
        assertEquals("a<b", doc.select("script").first().data());
    }

    @Test
    public void testParseComment() throws Exception {
        Document doc = Parser.parse("<!--note-->", "https://example.com/");
        assertEquals("note", doc.childNode(0).childNode(0).attr("text"));
    }

    @Test
    public void testParseCdata() throws Exception {
        Document doc = Parser.parse("<![CDATA[a<b]]>", "https://example.com/");
        assertEquals("a<b", doc.text());
    }

    @Test
    public void testParseBodyFragmentPlacesTextInBody() throws Exception {
        Document doc = Parser.parseBodyFragment("hello", "https://example.com/");
        assertEquals("hello", doc.body().text());
        assertEquals("", doc.head().text());
    }

    @Test
    public void testParseBodyFragmentCreatesImplicitParagraph() throws Exception {
        Document doc = Parser.parseBodyFragment("<p>x</p>", "https://example.com/");
        assertEquals("x", doc.body().select("p").first().text());
    }

    @Test
    public void testRelaxedFragmentOmitsImplicitParagraph() throws Exception {
        Document doc = Parser.parseBodyFragmentRelaxed("<p>x</p>", "https://example.com/");
        assertEquals("p", doc.body().child(0).tagName());
        assertEquals("x", doc.body().child(0).text());
    }

    @Test
    public void testBaseElementUpdatesDocumentBaseUri() throws Exception {
        Document doc = Parser.parse("<base href='https://example.org/path/'><a href='item'>x</a>",
                "https://example.com/");
        assertEquals("https://example.org/path/item", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testClosingTagClosesMatchingElement() throws Exception {
        Document doc = Parser.parse("<div><span>a</span>b</div>", "https://example.com/");
        assertEquals("a", doc.select("span").first().text());
        assertEquals("ab", doc.select("div").first().text());
    }

    @Test
    public void testUnknownSelfClosingTagIsPreserved() throws Exception {
        Document doc = Parser.parse("<widget/>tail", "https://example.com/");
        assertEquals("tail", doc.body().text());
        assertEquals(0, doc.select("widget").first().childNodes().size());
    }

    @Test
    public void testParseTextWithLessThanNotStartingTag() throws Exception {
        Document doc = Parser.parse("a < b", "https://example.com/");
        assertEquals("a < b", doc.body().text());
    }

    @Test
    public void testParseXmlDeclaration() throws Exception {
        Document doc = Parser.parse("<?xml version='1.0'?><p>x</p>", "https://example.com/");
        assertEquals("x", doc.select("p").first().text());
        assertEquals(1, doc.childNodes().size());
    }

    @Test
    public void testNullHtmlRejected() throws Exception {
        try {
            Parser.parse(null, "https://example.com/");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testNullBaseUriRejected() throws Exception {
        try {
            Parser.parse("", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
```