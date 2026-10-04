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
        Comment commentToken = new Comment();
        commentToken.data(" comment ");
        assertTrue(HtmlTreeBuilderState.Initial.process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals("<!-- comment -->", tb.getDocument().childNode(0).outerHtml());
    }

    @Test
    public void testInitialStateHandlesDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!DOCTYPE html>"), "http://example.com/", null, tb.defaultSettings());
        Doctype doctypeToken = new Doctype();
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
        StartTag startTag = new StartTag("p");
        assertTrue(HtmlTreeBuilderState.Initial.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlIgnoresDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!DOCTYPE html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Doctype doctypeToken = new Doctype();
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
        Comment commentToken = new Comment();
        commentToken.data(" comment ");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals("<!-- comment -->", tb.getDocument().childNode(0).outerHtml());
    }

    @Test
    public void testBeforeHtmlHandlesHtmlStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        StartTag startTag = new StartTag("html");
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
        StartTag startTag = new StartTag("p");
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
        StartTag startTag = new StartTag("head");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        assertEquals("head", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHeadHandlesImplicitHead() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<body>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        StartTag startTag = new StartTag("body");
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
        StartTag startTag = new StartTag("meta");
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
        StartTag startTag = new StartTag("title");
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag, tb)); // Start of title
        Token.Character dataToken = new Token.Character();
        dataToken.data("Page Title");
        assertTrue(HtmlTreeBuilderState.Text.process(dataToken, tb)); // Text within title
        EndTag endTag = new EndTag("title");
        assertTrue(HtmlTreeBuilderState.Text.process(endTag, tb)); // End of title
        assertEquals("Page Title", tb.getDocument().childNode(0).childNode(0).outerHtml());
    }

    @Test
    public void testInHeadHandlesNoscriptStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<noscript>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHead);
        StartTag startTag = new StartTag("noscript");
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
    }

    @Test
    public void testInHeadHandlesScriptStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<script>alert('hi');</script>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHead);
        StartTag startTag = new StartTag("script");
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
        assertEquals(TokeniserState.ScriptData, tb.tokeniser.getState());
    }

    @Test
    public void testInHeadHandlesEndHeadTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</head>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHead);
        EndTag endTag = new EndTag("head");
        assertTrue(HtmlTreeBuilderState.InHead.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInHeadNoscriptHandlesEndNoscriptTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</noscript>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        EndTag endTag = new EndTag("noscript");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterHeadHandlesBodyStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<body>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterHead);
        StartTag startTag = new StartTag("body");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("body", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testAfterHeadHandlesImplicitBody() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<p>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterHead);
        StartTag startTag = new StartTag("p");
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
        StartTag pStart = new StartTag("p");
        tb.insert(pStart);
        EndTag pEnd = new EndTag("p");
        assertTrue(HtmlTreeBuilderState.InBody.process(pEnd, tb));
        assertEquals("p", tb.getDocument().childNode(0).childNode(0).nodeName());
        assertEquals(0, tb.getDocument().childNode(0).childNode(0).childNodeSize());
    }

    @Test
    public void testInBodyHandlesAnchorTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<a>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        StartTag startTag = new StartTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag, tb));
        assertEquals("a", tb.getDocument().childNode(0).childNode(0).nodeName());
        assertTrue(tb.hasActiveFormattingElements("a"));
    }

    @Test
    public void testInBodyHandlesImgTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<img src='test.jpg'>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        StartTag startTag = new StartTag("img");
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
        StartTag startTag = new StartTag("table");
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
        StartTag startTag = new StartTag("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag, tb));
        assertNotNull(tb.getFormElement());
        assertEquals("form", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInBodyHandlesEndBodyTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</body>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InBody);
        EndTag endTag = new EndTag("body");
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testInTableHandlesCaptionStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<caption>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTable);
        StartTag startTag = new StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testInTableHandlesColgroupStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<colgroup>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTable);
        StartTag startTag = new StartTag("colgroup");
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testInTableHandlesTbodyStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<tbody>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTable);
        StartTag startTag = new StartTag("tbody");
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInTableHandlesEndTableTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</table>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTable);
        EndTag endTag = new EndTag("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state()); // Default reset
    }

    @Test
    public void testInTableBodyHandlesTrStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<tr>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTableBody);
        StartTag startTag = new StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInTableBodyHandlesEndTbodyTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</tbody>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InTableBody);
        EndTag endTag = new EndTag("tbody");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInRowHandlesTdStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<td>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InRow);
        StartTag startTag = new StartTag("td");
        assertTrue(HtmlTreeBuilderState.InRow.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInRowHandlesEndTrTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</tr>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InRow);
        EndTag endTag = new EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InRow.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInCellHandlesEndTdTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</td>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InCell);
        EndTag endTag = new EndTag("td");
        assertTrue(HtmlTreeBuilderState.InCell.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellHandlesUnexpectedTrEndTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</tr>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InCell);
        EndTag endTag = new EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InCell.process(endTag, tb)); // Should close cell and then process tr end tag
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInSelectHandlesOptionStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<option>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InSelect);
        StartTag startTag = new StartTag("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(startTag, tb));
        assertEquals("option", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInSelectHandlesEndSelectTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</select>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InSelect);
        EndTag endTag = new EndTag("select");
        assertTrue(HtmlTreeBuilderState.InSelect.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state()); // Default reset
    }

    @Test
    public void testAfterBodyHandlesHtmlStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterBody);
        StartTag startTag = new StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterBodyHandlesEndHtmlTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterBody);
        EndTag endTag = new EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testInFramesetHandlesFramesetStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<frameset>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InFrameset);
        StartTag startTag = new StartTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(startTag, tb));
        assertEquals("frameset", tb.getDocument().childNode(0).childNode(0).nodeName());
    }

    @Test
    public void testInFramesetHandlesEndFramesetTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</frameset>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.InFrameset);
        EndTag endTag = new EndTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void testAfterFramesetHandlesHtmlStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        StartTag startTag = new StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterFramesetHandlesEndHtmlTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("</html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        EndTag endTag = new EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(endTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testAfterAfterBodyHandlesComment() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!-- comment -->"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Comment commentToken = new Comment();
        commentToken.data(" comment ");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertEquals("<!-- comment -->", tb.getDocument().childNode(0).outerHtml());
    }

    @Test
    public void testAfterAfterFramesetHandlesDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("<!DOCTYPE html>"), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Doctype doctypeToken = new Doctype();
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

SOURCE CODE ANALYSIS - The tests cover transitions between various `HtmlTreeBuilderState` enums. They primarily focus on the `process` method of each state, testing how different `Token` types (StartTag, EndTag, Comment, Doctype, Character) are handled and how the state transitions.
TEST CASE DESIGN -
- testInitialStateHandlesWhitespace: Input: Whitespace token. Expected: Whitespace ignored. Derived from: Initial.process logic.
- testInitialStateHandlesComment: Input: Comment token. Expected: Comment inserted. Derived from: Initial.process logic.
- testInitialStateHandlesDoctype: Input: Doctype token. Expected: DocumentType node inserted. Derived from: Initial.process logic.
- testInitialStateTransitionsToBeforeHtmlOnStartTag: Input: StartTag token. Expected: Transition to BeforeHtml. Derived from: Initial.process logic.
- testBeforeHtmlIgnoresDoctype: Input: Doctype token. Expected: False (error). Derived from: BeforeHtml.process logic.
- testBeforeHtmlIgnoresComment: Input: Comment token. Expected: Comment inserted. Derived from: BeforeHtml.process logic.
- testBeforeHtmlHandlesHtmlStartTag: Input: Html StartTag. Expected: Transition to BeforeHead. Derived from: BeforeHtml.process logic.
- testBeforeHtmlHandlesAnythingElseByInsertingHtml: Input: Other StartTag. Expected: Implicit html, transition to BeforeHead. Derived from: BeforeHtml.process logic.
- testBeforeHeadIgnoresWhitespace: Input: Whitespace token. Expected: Whitespace ignored. Derived from: BeforeHead.process logic.
- testBeforeHeadHandlesHeadStartTag: Input: Head StartTag. Expected: Transition to InHead. Derived from: BeforeHead.process logic.
- testBeforeHeadHandlesImplicitHead: Input: Body StartTag. Expected: Implicit head, transition to InBody. Derived from: BeforeHead.process logic.
- testInHeadHandlesMetaTag: Input: Meta StartTag. Expected: Meta element inserted. Derived from: InHead.process logic.
- testInHeadHandlesTitleTag: Input: Title tag pair with text. Expected: Title element with text. Derived from: InHead.process logic and Text.process logic.
- testInHeadHandlesNoscriptStartTag: Input: Noscript StartTag. Expected: Transition to InHeadNoscript. Derived from: InHead.process logic.
- testInHeadHandlesScriptStartTag: Input: Script StartTag. Expected: Transition to Text state, ScriptData tokeniser. Derived from: InHead.process logic.
- testInHeadHandlesEndHeadTag: Input: Head EndTag. Expected: Transition to AfterHead. Derived from: InHead.process logic.
- testInHeadNoscriptHandlesEndNoscriptTag: Input: Noscript EndTag. Expected: Transition to InHead. Derived from: InHeadNoscript.process logic.
- testAfterHeadHandlesBodyStartTag: Input: Body StartTag. Expected: Transition to InBody. Derived from: AfterHead.process logic.
- testAfterHeadHandlesImplicitBody: Input: Other StartTag. Expected: Implicit body, transition to InBody. Derived from: AfterHead.process logic.
- testInBodyHandlesParagraphEndTag: Input: P EndTag. Expected: Paragraph closed. Derived from: InBody.process logic.
- testInBodyHandlesAnchorTag: Input: A StartTag. Expected: Anchor element, active formatting. Derived from: InBody.process logic.
- testInBodyHandlesImgTag: Input: Img StartTag. Expected: Img element, not frameset ok. Derived from: InBody.process logic.
- testInBodyHandlesTableStartTag: Input: Table StartTag. Expected: Transition to InTable, not frameset ok. Derived from: InBody.process logic.
- testInBodyHandlesFormStartTag: Input: Form StartTag. Expected: Form element, form element set. Derived from: InBody.process logic.
- testInBodyHandlesEndBodyTag: Input: Body EndTag. Expected: Transition to AfterBody. Derived from: InBody.process logic.
- testInTableHandlesCaptionStartTag: Input: Caption StartTag. Expected: Transition to InCaption. Derived from: InTable.process logic.
- testInTableHandlesColgroupStartTag: Input: Colgroup StartTag. Expected: Transition to InColumnGroup. Derived from: InTable.process logic.
- testInTableHandlesTbodyStartTag: Input: Tbody StartTag. Expected: Transition to InTableBody. Derived from: InTable.process logic.
- testInTableHandlesEndTableTag: Input: Table EndTag. Expected: Transition to AfterBody. Derived from: InTable.process logic.
- testInTableBodyHandlesTrStartTag: Input: Tr StartTag. Expected: Transition to InRow. Derived from: InTableBody.process logic.
- testInTableBodyHandlesEndTbodyTag: Input: Tbody EndTag. Expected: Transition to InTable. Derived from: InTableBody.process logic.
- testInRowHandlesTdStartTag: Input: Td StartTag. Expected: Transition to InCell. Derived from: InRow.process logic.
- testInRowHandlesEndTrTag: Input: Tr EndTag. Expected: Transition to InTableBody. Derived from: InRow.process logic.
- testInCellHandlesEndTdTag: Input: Td EndTag. Expected: Transition to InRow. Derived from: InCell.process logic.
- testInCellHandlesUnexpectedTrEndTag: Input: Tr EndTag in InCell state. Expected: Cell closed, transition to InTableBody. Derived from: InCell.process logic.
- testInSelectHandlesOptionStartTag: Input: Option StartTag. Expected: Option element. Derived from: InSelect.process logic.
- testInSelectHandlesEndSelectTag: Input: Select EndTag. Expected: Transition to AfterBody. Derived from: InSelect.process logic.
- testAfterBodyHandlesHtmlStartTag: Input: Html StartTag. Expected: Transition to InBody. Derived from: AfterBody.process logic.
- testAfterBodyHandlesEndHtmlTag: Input: Html EndTag. Expected: Transition to AfterAfterBody. Derived from: AfterBody.process logic.
- testInFramesetHandlesFramesetStartTag: Input: Frameset StartTag. Expected: Frameset element. Derived from: InFrameset.process logic.
- testInFramesetHandlesEndFramesetTag: Input: Frameset EndTag. Expected: Transition to AfterFrameset. Derived from: InFrameset.process logic.
- testAfterFramesetHandlesHtmlStartTag: Input: Html StartTag. Expected: Transition to InBody. Derived from: AfterFrameset.process logic.
- testAfterFramesetHandlesEndHtmlTag: Input: Html EndTag. Expected: Transition to AfterAfterFrameset. Derived from: AfterFrameset.process logic.
- testAfterAfterBodyHandlesComment: Input: Comment token. Expected: Comment inserted. Derived from: AfterAfterBody.process logic.
- testAfterAfterFramesetHandlesDoctype: Input: Doctype token. Expected: DocumentType node inserted, transition to InBody. Derived from: AfterAfterFrameset.process logic.
DEFECT DETECTION STRATEGY - The tests exercise the state transitions and token handling logic of the `HtmlTreeBuilderState` enum, aiming to catch deviations in how tokens are processed or how states are transitioned.
SUMMARY - 46 tests.
LIMITATIONS - The tests assume the `Token` constructors and methods (`data`, `name`, `publicIdentifier`, `systemIdentifier`) and `DocumentType.name()` are correctly implemented and accessible.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.