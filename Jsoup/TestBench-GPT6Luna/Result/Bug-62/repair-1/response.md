```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.ArrayList;

public class HtmlTreeBuilderStateTest {
    @Test
    public void testInitialWhitespaceIgnored() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Character().data(" "), tb));
        assertEquals(0, tb.getDocument().childNodeSize());
    }

    @Test
    public void testInitialCommentInserted() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Comment(), tb));
        assertEquals(1, tb.getDocument().childNodeSize());
    }

    @Test
    public void testInitialDoctypeTransitionsAndAppends() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Doctype(), tb));
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlRejectsUnlistedEndTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(new Token.EndTag().name("div"), tb));
    }

    @Test
    public void testBeforeHtmlCreatesHtmlAndHeadForText() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.Character().data("x"), tb));
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
        assertEquals("head", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInHeadRejectsDuplicateHead() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.InHead.process(new Token.StartTag().name("head"), tb));
    }

    @Test
    public void testInHeadInsertsMetaAsEmptyElement() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("<head></head>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag().name("meta"), tb));
        assertEquals(1, tb.getDocument().select("meta").size());
    }

    @Test
    public void testInBodyDropsCaptionStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.InBody.process(new Token.StartTag().name("caption"), tb));
    }

    @Test
    public void testInBodyConvertsImageStartToImg() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("<body></body>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag().name("image"), tb));
        assertEquals(1, tb.getDocument().select("img").size());
    }

    @Test
    public void testInBodyClosesParagraphBeforeDiv() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<p>x<div>y</div>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals("<p>x</p><div>y</div>", doc.body().html());
    }

    @Test
    public void testInBodyCreatesEmptyParagraphOnUnmatchedEnd() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("</p>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals("<p></p>", doc.body().html());
    }

    @Test
    public void testInTableCreatesTableBodyForRow() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<table><tr><td>x</td></tr></table>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals(1, doc.select("table > tbody > tr > td").size());
    }

    @Test
    public void testInTableFostersNonWhitespaceText() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<table>x<tr><td>y</td></tr></table>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals("x", doc.body().childNode(0).outerHtml());
    }

    @Test
    public void testInSelectOptionReplacesPreviousOption() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<select><option>a<option>b</select>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals(2, doc.select("select > option").size());
        assertEquals("b", doc.select("option").get(1).text());
    }

    @Test
    public void testTextStateInsertsCharacterToken() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("<title></title>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertTrue(HtmlTreeBuilderState.Text.process(new Token.Character().data("x"), tb));
        assertEquals("x", tb.getDocument().select("title").text());
    }

    @Test
    public void testAfterBodyReprocessesStartTagInBody() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("<body></body>", "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.StartTag().name("p"), tb));
        assertEquals(1, tb.getDocument().select("body > p").size());
    }

    @Test
    public void testInFramesetRejectsUnexpectedStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag().name("div"), tb));
    }

    @Test
    public void testAfterAfterFramesetRejectsUnexpectedText() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.Character().data("x"), tb));
    }
}
```