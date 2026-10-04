```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.Iterator;
import java.util.LinkedList;

public class HtmlTreeBuilderStateTest {
    @Test
    public void testInitialIgnoresWhitespace() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse(" \n", "");
        assertEquals(0, document.childNodeSize());
    }

    @Test
    public void testInitialProcessesOrdinaryText() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("text", "");
        assertEquals("text", document.body().text());
    }

    @Test
    public void testInitialDoctypeCreatesDocumentType() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<!doctype html><html><head></head><body></body></html>", "");
        assertEquals("html", document.childNode(0).nodeName());
    }

    @Test
    public void testBeforeHtmlCreatesHtmlForText() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<!doctype html>text", "");
        assertEquals("html", document.childNode(1).nodeName());
    }

    @Test
    public void testBeforeHeadCreatesHeadWhenBodyAppears() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<html><body>x</body></html>", "");
        assertEquals(1, document.head().childNodeSize());
        assertEquals("x", document.body().text());
    }

    @Test
    public void testHeadMetadataIsInsertedIntoHead() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<head><meta name=x></head><body></body>", "");
        assertEquals(1, document.head().childNodeSize());
        assertEquals("meta", document.head().childNode(0).nodeName());
    }

    @Test
    public void testTitleTextIsParsedAsRcdata() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<title>a &amp; b</title>", "");
        assertEquals("a & b", document.title());
    }

    @Test
    public void testBodyTextIsInserted() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<body>hello</body>", "");
        assertEquals("hello", document.body().text());
    }

    @Test
    public void testUnclosedParagraphIsClosedByDiv() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<p>a<div>b</div>", "");
        assertEquals(2, document.body().children().size());
        assertEquals("p", document.body().child(0).nodeName());
        assertEquals("div", document.body().child(1).nodeName());
    }

    @Test
    public void testRepeatedListItemsAreSiblings() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<ul><li>a<li>b</ul>", "");
        assertEquals(2, document.select("li").size());
        assertEquals("a", document.select("li").get(0).text());
        assertEquals("b", document.select("li").get(1).text());
    }

    @Test
    public void testInputIsInsertedAsEmptyElement() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<input type=hidden>", "");
        assertEquals("hidden", document.select("input").get(0).attr("type"));
    }

    @Test
    public void testTableBuildsRowsAndCells() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<table><tr><td>x</td></tr></table>", "");
        assertEquals(1, document.select("tr").size());
        assertEquals("x", document.select("td").get(0).text());
    }

    @Test
    public void testImplicitTbodyIsInsertedForTableRow() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<table><tr><td>x</td></tr></table>", "");
        assertEquals("tbody", document.select("table").get(0).child(0).nodeName());
    }

    @Test
    public void testWhitespaceInsideTableIsRetained() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<table> <tr><td>x</td></tr></table>", "");
        assertEquals(" ", document.select("table").get(0).childNode(0).outerHtml());
    }

    @Test
    public void testSelectOptionsBecomeChildrenOfSelect() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<select><option>a<option>b</select>", "");
        assertEquals(2, document.select("option").size());
        assertEquals("b", document.select("option").get(1).text());
    }

    @Test
    public void testTextareaTextIsRetained() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<textarea>a &amp; b</textarea>", "");
        assertEquals("a & b", document.select("textarea").get(0).text());
    }

    @Test
    public void testRawTextStyleContentIsNotParsedAsMarkup() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<style>a<b</style>", "");
        assertEquals("a<b", document.select("style").get(0).data());
    }

    @Test
    public void testEndParagraphWithoutOpenParagraphCreatesEmptyParagraph() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("</p>", "");
        assertEquals(1, document.select("p").size());
        assertEquals("", document.select("p").get(0).text());
    }

    @Test
    public void testUnclosedBodyStillContainsText() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<body>x", "");
        assertEquals("x", document.body().text());
    }

    @Test
    public void testFramesetContainsFrame() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<frameset><frame></frameset>", "");
        assertEquals(1, document.select("frame").size());
    }
}
```