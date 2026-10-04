```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token.Character;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.StartTag;

import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    // Test cases for the HtmlTreeBuilderState enum, covering various states and token processing.

    @Test
    public void testInitialStateHandlesWhitespace() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("   "), "http://example.com/", null, tb.defaultSettings());
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("   ");
        assertTrue(HtmlTreeBuilderState.Initial.process(whitespaceToken, tb));
        assertEquals(0, tb.getDocument().childNodeSize()); // Whitespace should be ignored
    }

    @Test
    public void testInitialStateHandlesComment() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!-- comment -->"), "http://example.com/", null, tb.defaultSettings());
        Token.Comment commentToken = new Token.Comment();
        commentToken.data(" comment ");
        assertTrue(HtmlTreeBuilderState.Initial.process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals(" comment ", tb.getDocument().childNode(0).outerHtml());
    }

    @Test
    public void testInitialStateHandlesDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!DOCTYPE html>"), "http://example.com/", null, tb.defaultSettings());
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        doctypeToken.publicIdentifier("");
        doctypeToken.systemIdentifier("");
        assertTrue(HtmlTreeBuilderState.Initial.process(doctypeToken, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertTrue(tb.getDocument().childNode(0) instanceof DocumentType);
        assertEquals("html", ((DocumentType) tb.getDocument().childNode(0)).name());
    }

    @Test
    public void testInitialStateTransitionsToBeforeHtmlOnStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<p>"), "http://example.com/", null, tb.defaultSettings());
        Token.StartTag startTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.Initial.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlIgnoresDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!DOCTYPE html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        doctypeToken.publicIdentifier("");
        doctypeToken.systemIdentifier("");
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(doctypeToken, tb)); // Should be an error
    }

    @Test
    public void testBeforeHtmlIgnoresComment() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!-- comment -->"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Comment commentToken = new Token.Comment();
        commentToken.data(" comment ");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals(" comment ", tb.getDocument().childNode(0).outerHtml());
    }

    @Test
    public void testBeforeHtmlHandlesHtmlStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag startTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHtmlHandlesAnythingElseByInsertingHtml() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<p>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag startTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.getDocument().childNode(0).nodeName()); // Html inserted implicitly
        assertEquals("p", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testBeforeHeadIgnoresWhitespace() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("  "), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("  ");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(whitespaceToken, tb));
        assertEquals(0, tb.getDocument().childNodeSize()); // Whitespace should be ignored
    }

    @Test
    public void testBeforeHeadHandlesHeadStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<head>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag startTag = new Token.StartTag("head");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        assertEquals("head", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHeadHandlesImplicitHead() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<body>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag startTag = new Token.StartTag("body");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("head", tb.getDocument().childNode(0).nodeName()); // Implicit head
        assertEquals("body", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInHeadHandlesMetaTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<meta charset='utf-8'>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag startTag = new Token.StartTag("meta");
        startTag.attributes.put("charset", "utf-8");
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals("meta", tb.getDocument().childNode(0).nodeName());
        assertEquals("utf-8", ((Element) tb.getDocument().childNode(0)).attr("charset"));
    }

    @Test
    public void testInHeadHandlesTitleTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<title>Page Title</title>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag startTag = new Token.StartTag("title");
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag, tb)); // Start of title
        Token.Character dataToken = new Token.Character();
        dataToken.data("Page Title");
        assertTrue(HtmlTreeBuilderState.Text.process(dataToken, tb)); // Text within title
        Token.EndTag endTag = new Token.EndTag("title");
        assertTrue(HtmlTreeBuilderState.Text.process(endTag, tb)); // End of title
        assertEquals("Page Title", tb.getDocument().childNode(0).childNode(0).outerHtml());
    }

    @Test
    public void testInHeadHandlesNoscriptStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<noscript>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag startTag = new Token.StartTag("noscript");
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
    }

    @Test
    public void testInHeadHandlesScriptStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<script>alert('hi');</script>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag startTag = new Token.StartTag("script");
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
        assertEquals(TokeniserState.ScriptData, tb.tokeniser.getState());
    }

    @Test
    public void testInHeadHandlesEndHeadTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</head>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.EndTag endTag = new Token.EndTag("head");
        assertTrue(HtmlTreeBuilderState.InHead.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInHeadNoscriptHandlesEndNoscriptTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</noscript>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.EndTag endTag = new Token.EndTag("noscript");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterHeadHandlesBodyStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<body>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag startTag = new Token.StartTag("body");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("body", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testAfterHeadHandlesImplicitBody() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<p>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag startTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("body", tb.getDocument().childNode(0).childNode(0).nodeName()); // Implicit body
        assertEquals("p", tb.getDocument().childNode(0).childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInBodyHandlesParagraphEndTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<p></p>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag pStart = new Token.StartTag("p");
        tb.insert(pStart);
        Token.EndTag pEnd = new Token.EndTag("p");
        assertTrue(HtmlTreeBuilderState.InBody.process(pEnd, tb));
        assertEquals("p", tb.getDocument().childNode(0).childNode(0).nodeName());
        assertEquals(0, tb.getDocument().childNode(0).childNode(0).childNodeSize());
    }

    @Test
    public void testInBodyHandlesAnchorTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<a>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag, tb));
        assertEquals("a", tb.getDocument().childNode(0).childNode(0).nodeName());
        assertTrue(tb.hasActiveFormattingElements("a"));
    }

    @Test
    public void testInBodyHandlesImgTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<img src='test.jpg'>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag("img");
        startTag.attributes.put("src", "test.jpg");
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals("img", tb.getDocument().childNode(0).nodeName());
        assertEquals("test.jpg", ((Element) tb.getDocument().childNode(0)).attr("src"));
        assertFalse(tb.framesetOk()); // img tag is not frameset ok
    }

    @Test
    public void testInBodyHandlesTableStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<table>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals("table", tb.getDocument().childNode(0).childNode(0).nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesFormStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<form>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag, tb));
        assertNotNull(tb.getFormElement());
        assertEquals("form", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInBodyHandlesEndBodyTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</body>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.EndTag endTag = new Token.EndTag("body");
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testInTableHandlesCaptionStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<caption>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTable);
        Token.StartTag startTag = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testInTableHandlesColgroupStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<colgroup>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTable);
        Token.StartTag startTag = new Token.StartTag("colgroup");
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testInTableHandlesTbodyStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<tbody>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTable);
        Token.StartTag startTag = new Token.StartTag("tbody");
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInTableHandlesEndTableTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</table>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTable);
        Token.EndTag endTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state()); // Default reset
    }

    @Test
    public void testInTableBodyHandlesTrStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<tr>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Token.StartTag startTag = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInTableBodyHandlesEndTbodyTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</tbody>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Token.EndTag endTag = new Token.EndTag("tbody");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInRowHandlesTdStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<td>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InRow);
        Token.StartTag startTag = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InRow.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInRowHandlesEndTrTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</tr>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InRow);
        Token.EndTag endTag = new Token.EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InRow.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInCellHandlesEndTdTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</td>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InCell);
        Token.EndTag endTag = new Token.EndTag("td");
        assertTrue(HtmlTreeBuilderState.InCell.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellHandlesUnexpectedTrEndTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</tr>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InCell);
        Token.EndTag endTag = new Token.EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InCell.process(endTag, tb)); // Should close cell and then process tr end tag
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInSelectHandlesOptionStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<option>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InSelect);
        Token.StartTag startTag = new Token.StartTag("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(startTag, tb));
        assertEquals("option", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInSelectHandlesEndSelectTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</select>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InSelect);
        Token.EndTag endTag = new Token.EndTag("select");
        assertTrue(HtmlTreeBuilderState.InSelect.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state()); // Default reset
    }

    @Test
    public void testAfterBodyHandlesHtmlStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Token.StartTag startTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterBodyHandlesEndHtmlTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Token.EndTag endTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testInFramesetHandlesFramesetStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<frameset>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Token.StartTag startTag = new Token.StartTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(startTag, tb));
        assertEquals("frameset", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInFramesetHandlesEndFramesetTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</frameset>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Token.EndTag endTag = new Token.EndTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void testAfterFramesetHandlesHtmlStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Token.StartTag startTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterFramesetHandlesEndHtmlTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Token.EndTag endTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testAfterAfterBodyHandlesComment() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!-- comment -->"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Token.Comment commentToken = new Token.Comment();
        commentToken.data(" comment ");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals(" comment ", tb.getDocument().childNode(0).outerHtml());
    }

    @Test
    public void testAfterAfterFramesetHandlesDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!DOCTYPE html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        doctypeToken.publicIdentifier("");
        doctypeToken.systemIdentifier("");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(doctypeToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // Transitions to InBody
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover transitions between various states of the `HtmlTreeBuilder` enum, focusing on how different token types (StartTag, EndTag, Comment, Doctype, Character) are handled in each state. Logic branches within the `process` methods of several states are implicitly tested.
2. TEST CASE DESIGN -
    - testInitialStateHandlesWhitespace: Input: "   ", Expected: Whitespace ignored, Derived: Initial.process(whitespace, tb) returns true and no node is inserted.
    - testInitialStateHandlesComment: Input: "<!-- comment -->", Expected: Comment inserted, Derived: Initial.process(comment, tb) returns true, comment is the first child.
    - testInitialStateHandlesDoctype: Input: "<!DOCTYPE html>", Expected: Doctype inserted, Derived: Initial.process(doctype, tb) returns true, doctype is the first child.
    - testInitialStateTransitionsToBeforeHtmlOnStartTag: Input: "<p>", Expected: State transitions to BeforeHtml, Derived: Initial.process(startTag("p"), tb) returns true and tb.state() is BeforeHtml.
    - testBeforeHtmlIgnoresDoctype: Input: "<!DOCTYPE html>", Expected: false (error), Derived: BeforeHtml.process(doctype, tb) returns false.
    - testBeforeHtmlIgnoresComment: Input: "<!-- comment -->", Expected: Comment inserted, Derived: BeforeHtml.process(comment, tb) returns true, comment is the first child.
    - testBeforeHtmlHandlesHtmlStartTag: Input: "<html>", Expected: State transitions to BeforeHead, Derived: BeforeHtml.process(startTag("html"), tb) returns true and tb.state() is BeforeHead.
    - testBeforeHtmlHandlesAnythingElseByInsertingHtml: Input: "<p>", Expected: Html inserted and state is BeforeHead, Derived: BeforeHtml.process(startTag("p"), tb) returns true, implicit html tag created.
    - testBeforeHeadIgnoresWhitespace: Input: "  ", Expected: Whitespace ignored, Derived: BeforeHead.process(whitespace, tb) returns true and no node is inserted.
    - testBeforeHeadHandlesHeadStartTag: Input: "<head>", Expected: State transitions to InHead, Derived: BeforeHead.process(startTag("head"), tb) returns true and tb.state() is InHead.
    - testBeforeHeadHandlesImplicitHead: Input: "<body>", Expected: Implicit head and body inserted, Derived: BeforeHead.process(startTag("body"), tb) returns true, state is InBody.
    - testInHeadHandlesMetaTag: Input: "<meta charset='utf-8'>", Expected: Meta tag inserted with attribute, Derived: InHead.process(startTag("meta"), tb) inserts the element with attribute.
    - testInHeadHandlesTitleTag: Input: "<title>Page Title</title>", Expected: Title text parsed, Derived: InHead processes startTag, Text processes data, Text processes endTag.
    - testInHeadHandlesNoscriptStartTag: Input: "<noscript>", Expected: State transitions to InHeadNoscript, Derived: InHead.process(startTag("noscript"), tb) transitions state.
    - testInHeadHandlesScriptStartTag: Input: "<script>alert('hi');</script>", Expected: State transitions to Text and Tokeniser state to ScriptData, Derived: InHead.process(startTag("script"), tb) transitions states.
    - testInHeadHandlesEndHeadTag: Input: "</head>", Expected: State transitions to AfterHead, Derived: InHead.process(endTag("head"), tb) transitions state.
    - testInHeadNoscriptHandlesEndNoscriptTag: Input: "</noscript>", Expected: State transitions to InHead, Derived: InHeadNoscript.process(endTag("noscript"), tb) transitions state.
    - testAfterHeadHandlesBodyStartTag: Input: "<body>", Expected: State transitions to InBody, Derived: AfterHead.process(startTag("body"), tb) transitions state.
    - testAfterHeadHandlesImplicitBody: Input: "<p>", Expected: Implicit body inserted, Derived: AfterHead.process(startTag("p"), tb) transitions to InBody, inserting implicit body.
    - testInBodyHandlesParagraphEndTag: Input: "<p></p>", Expected: Paragraph closed correctly, Derived: InBody processing endTag("p") closes the element.
    - testInBodyHandlesAnchorTag: Input: "<a>", Expected: Anchor tag inserted and added to formatting elements, Derived: InBody.process(startTag("a"), tb) inserts tag and calls pushActiveFormattingElements.
    - testInBodyHandlesImgTag: Input: "<img src='test.jpg'>", Expected: Img tag inserted and framesetOk is false, Derived: InBody.process(startTag("img"), tb) inserts tag and sets framesetOk to false.
    - testInBodyHandlesTableStartTag: Input: "<table>", Expected: State transitions to InTable and framesetOk is false, Derived: InBody.process(startTag("table"), tb) transitions state and sets framesetOk to false.
    - testInBodyHandlesFormStartTag: Input: "<form>", Expected: Form element set, Derived: InBody.process(startTag("form"), tb) calls insertForm and sets formElement.
    - testInBodyHandlesEndBodyTag: Input: "</body>", Expected: State transitions to AfterBody, Derived: InBody.process(endTag("body"), tb) transitions state.
    - testInTableHandlesCaptionStartTag: Input: "<caption>", Expected: State transitions to InCaption, Derived: InTable.process(startTag("caption"), tb) transitions state.
    - testInTableHandlesColgroupStartTag: Input: "<colgroup>", Expected: State transitions to InColumnGroup, Derived: InTable.process(startTag("colgroup"), tb) transitions state.
    - testInTableHandlesTbodyStartTag: Input: "<tbody>", Expected: State transitions to InTableBody, Derived: InTable.process(startTag("tbody"), tb) transitions state.
    - testInTableHandlesEndTableTag: Input: "</table>", Expected: State transitions to AfterBody, Derived: InTable.process(endTag("table"), tb) resets insertion mode to AfterBody.
    - testInTableBodyHandlesTrStartTag: Input: "<tr>", Expected: State transitions to InRow, Derived: InTableBody.process(startTag("tr"), tb) transitions state.
    - testInTableBodyHandlesEndTbodyTag: Input: "</tbody>", Expected: State transitions to InTable, Derived: InTableBody.process(endTag("tbody"), tb) transitions state.
    - testInRowHandlesTdStartTag: Input: "<td>", Expected: State transitions to InCell, Derived: InRow.process(startTag("td"), tb) transitions state.
    - testInRowHandlesEndTrTag: Input: "</tr>", Expected: State transitions to InTableBody, Derived: InRow.process(endTag("tr"), tb) transitions state.
    - testInCellHandlesEndTdTag: Input: "</td>", Expected: State transitions to InRow, Derived: InCell.process(endTag("td"), tb) transitions state.
    - testInCellHandlesUnexpectedTrEndTag: Input: "</tr>", Expected: Cell closed and state transitions to InTableBody, Derived: InCell processes endTag("tr") by calling closeCell and then tb.process(t).
    - testInSelectHandlesOptionStartTag: Input: "<option>", Expected: Option tag inserted, Derived: InSelect.process(startTag("option"), tb) inserts the element.
    - testInSelectHandlesEndSelectTag: Input: "</select>", Expected: State transitions to AfterBody, Derived: InSelect.process(endTag("select"), tb) resets insertion mode.
    - testAfterBodyHandlesHtmlStartTag: Input: "<html>", Expected: State transitions to InBody, Derived: AfterBody.process(startTag("html"), tb) transitions state.
    - testAfterBodyHandlesEndHtmlTag: Input: "</html>", Expected: State transitions to AfterAfterBody, Derived: AfterBody.process(endTag("html"), tb) transitions state.
    - testInFramesetHandlesFramesetStartTag: Input: "<frameset>", Expected: Frameset tag inserted, Derived: InFrameset.process(startTag("frameset"), tb) inserts the element.
    - testInFramesetHandlesEndFramesetTag: Input: "</frameset>", Expected: State transitions to AfterFrameset, Derived: InFrameset.process(endTag("frameset"), tb) transitions state.
    - testAfterFramesetHandlesHtmlStartTag: Input: "<html>", Expected: State transitions to InBody, Derived: AfterFrameset.process(startTag("html"), tb) transitions state.
    - testAfterFramesetHandlesEndHtmlTag: Input: "</html>", Expected: State transitions to AfterAfterFrameset, Derived: AfterFrameset.process(endTag("html"), tb) transitions state.
    - testAfterAfterBodyHandlesComment: Input: "<!-- comment -->", Expected: Comment inserted, Derived: AfterAfterBody.process(comment, tb) inserts the comment.
    - testAfterAfterFramesetHandlesDoctype: Input: "<!DOCTYPE html>", Expected: State transitions to InBody and doctype inserted, Derived: AfterAfterFrameset.process(doctype, tb) transitions to InBody and inserts doctype.
4. DEFECT DETECTION STRATEGY - Tests cover the state transitions and token handling logic in various `HtmlTreeBuilderState` enums, targeting the core parsing logic of the HTML tree builder.
5. SUMMARY - 44 tests.
6. LIMITATIONS - Tests assume default settings and do not cover edge cases like malformed HTML that might trigger specific error handling paths within the states. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.