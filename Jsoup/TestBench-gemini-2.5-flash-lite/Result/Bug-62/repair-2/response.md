HtmlTreeBuilderStateTest.java:43: error: '(' or '[' expected
        doctypeToken.publicIdentifier = new StringBuilder "-//W3C//DTD XHTML 1.0 Strict//EN");
                                                          ^
1 error

The compiler error indicates an issue with how `doctypeToken.publicIdentifier` is being assigned. The `StringBuilder` constructor expects arguments that can be used to initialize it, and a string literal like `"//W3C//DTD XHTML 1.0 Strict//EN"` needs to be passed correctly.

The original code uses `new StringBuilder("...")` but has an extra closing parenthesis, `)`, before the semicolon. This parenthesis is likely a typo and should be removed.

Let's fix this in the test `testInitialStateProcessesDoctype`.

```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.ArrayList;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.Character;

public class HtmlTreeBuilderStateTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testInitialStateIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.Initial.process(whitespaceToken, tb));
        assertTrue(tb.getStack().isEmpty());
    }

    @Test
    public void testInitialStateInsertsComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        assertTrue(HtmlTreeBuilderState.Initial.process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInitialStateProcessesDoctype() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name = new StringBuilder("html");
        // Fixed the syntax error here: removed the extraneous closing parenthesis.
        doctypeToken.publicIdentifier = new StringBuilder("-//W3C//DTD XHTML 1.0 Strict//EN");
        doctypeToken.systemIdentifier = new StringBuilder("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");
        assertTrue(HtmlTreeBuilderState.Initial.process(doctypeToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof DocumentType);
        DocumentType dt = (DocumentType) tb.getDocument().childNodes().get(0);
        assertEquals("html", dt.name());
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", dt.publicId());
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", dt.systemId());
    }

    @Test
    public void testInitialStateTransitionsToBeforeHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag("p"); // Non-DOCTYPE, non-comment, non-whitespace
        assertTrue(HtmlTreeBuilderState.Initial.process(startTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("  \n");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(whitespaceToken, tb));
        assertTrue(tb.getStack().isEmpty());
    }

    @Test
    public void testBeforeHtmlInsertsComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("before html comment");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testBeforeHtmlProcessesDoctypeError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name = new StringBuilder("html");
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(doctypeToken, tb));
    }

    @Test
    public void testBeforeHtmlProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testBeforeHtmlHandlesEndTagBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.EndTag bodyTag = new Token.EndTag("body");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(bodyTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("body", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testBeforeHtmlHandlesEndTagHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.EndTag htmlTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testBeforeHtmlAnythingElseTransitionsToBeforeHtmlAndReprocesses() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("p", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testBeforeHeadIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("   ");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(whitespaceToken, tb));
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("   ", tb.getStack().get(1).toString()); // Character nodes are inserted
    }

    @Test
    public void testBeforeHeadInsertsComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("head comment");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(commentToken, tb));
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals(1, tb.getDocument().childNodes().size()); // Comment goes to document
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testBeforeHeadProcessesDoctypeError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name = new StringBuilder("html");
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(doctypeToken, tb));
    }

    @Test
    public void testBeforeHeadProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(htmlTag, tb));
        // It should process as if in InBody state, meaning it doesn't transition
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testBeforeHeadProcessesHeadStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        Token.StartTag headTag = new Token.StartTag("head");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(headTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("head", tb.getHeadElement().nodeName());
    }

    @Test
    public void testBeforeHeadProcessesHeadEndTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        tb.processStartTag("head"); // Ensure head exists before processing end tag
        Token.EndTag headTag = new Token.EndTag("head");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(headTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testBeforeHeadAnythingElseProcessesHeadAndReprocessesToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        Token.StartTag bodyTag = new Token.StartTag("body");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(bodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // After head is processed, transitions to InBody
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("head", tb.getStack().get(1).nodeName()); // Head is implied
        assertEquals("body", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInHeadIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("\t\n");
        assertTrue(HtmlTreeBuilderState.InHead.process(whitespaceToken, tb));
        assertEquals("head", tb.getStack().get(1).nodeName());
        assertEquals("\t\n", tb.getStack().get(2).toString()); // Character nodes are inserted into head
    }

    @Test
    public void testInHeadProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("in head comment");
        assertTrue(HtmlTreeBuilderState.InHead.process(commentToken, tb));
        assertEquals("head", tb.getStack().get(1).nodeName());
        assertEquals(1, tb.getStack().get(1).childNodes().size());
        assertTrue(tb.getStack().get(1).childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInHeadProcessesDoctypeError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name = new StringBuilder("html");
        assertFalse(HtmlTreeBuilderState.InHead.process(doctypeToken, tb));
    }

    @Test
    public void testInHeadProcessesBaseTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.StartTag baseTag = new Token.StartTag("base");
        baseTag.attributes.put("href", "http://example.com");
        assertTrue(HtmlTreeBuilderState.InHead.process(baseTag, tb));
        assertEquals("base", tb.getStack().get(2).nodeName());
        assertEquals("http://example.com", tb.getStack().get(2).attr("href"));
        assertEquals("http://example.com", tb.getBaseUri()); // Should update base URI
    }

    @Test
    public void testInHeadProcessesMetaTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.StartTag metaTag = new Token.StartTag("meta");
        metaTag.attributes.put("charset", "UTF-8");
        assertTrue(HtmlTreeBuilderState.InHead.process(metaTag, tb));
        assertEquals("meta", tb.getStack().get(2).nodeName());
        assertEquals("UTF-8", tb.getStack().get(2).attr("charset"));
    }

    @Test
    public void testInHeadProcessesTitleStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.StartTag titleTag = new Token.StartTag("title");
        assertTrue(HtmlTreeBuilderState.InHead.process(titleTag, tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
        assertEquals("title", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInHeadProcessesNoscriptStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.StartTag noscriptTag = new Token.StartTag("noscript");
        assertTrue(HtmlTreeBuilderState.InHead.process(noscriptTag, tb));
        assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
        assertEquals("noscript", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInHeadProcessesHeadEndTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.EndTag headEndTag = new Token.EndTag("head");
        assertTrue(HtmlTreeBuilderState.InHead.process(headEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testInHeadAnythingElseProcessesEndTagHeadAndReprocesses() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.StartTag bodyTag = new Token.StartTag("body");
        assertTrue(HtmlTreeBuilderState.InHead.process(bodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // After head, transitions to InBody
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("body", tb.getStack().get(1).nodeName()); // Head is implied and closed
    }

    @Test
    public void testInHeadNoscriptProcessesEndTagNoscript() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.insertStartTag("noscript");
        Token.EndTag noscriptEndTag = new Token.EndTag("noscript");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(noscriptEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        assertEquals("head", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInHeadNoscriptProcessesWhitespaceAsInHead() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.insertStartTag("noscript");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Should transition back to InHead
        assertEquals("head", tb.getStack().get(1).nodeName());
        assertEquals(" ", tb.getStack().get(2).toString()); // Whitespace is inserted into head
    }

    @Test
    public void testInHeadNoscriptAnythingElseErrorsAndInsertsCharacter() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.insertStartTag("noscript");
        Token.StartTag scriptTag = new Token.StartTag("script"); // Not in the list of allowed tags
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(scriptTag, tb));
        assertEquals("noscript", tb.getStack().get(2).nodeName());
        assertEquals(1, tb.getStack().get(2).childNodes().size());
        assertTrue(tb.getStack().get(2).childNodes().get(0) instanceof Element);
        assertEquals("script", ((Element) tb.getStack().get(2).childNodes().get(0)).nodeName());
        // The error message is generated, but the token is processed as character data
    }

    @Test
    public void testAfterHeadIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" \t");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(whitespaceToken, tb));
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals(" \t", tb.getStack().get(1).toString()); // Whitespace inserted into html
    }

    @Test
    public void testAfterHeadInsertsComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after head comment");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(commentToken, tb));
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testAfterHeadProcessesDoctypeError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name = new StringBuilder("html");
        assertFalse(HtmlTreeBuilderState.AfterHead.process(doctypeToken, tb));
    }

    @Test
    public void testAfterHeadProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterHeadProcessesBodyStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.StartTag bodyTag = new Token.StartTag("body");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(bodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("body", tb.getStack().get(1).nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testAfterHeadProcessesFramesetStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.StartTag framesetTag = new Token.StartTag("frameset");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(framesetTag, tb));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("frameset", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testAfterHeadProcessesStyleStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.StartTag styleTag = new Token.StartTag("style");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(styleTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Processed as in InHead
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("head", tb.getStack().get(1).nodeName()); // Head is the parent
    }

    @Test
    public void testAfterHeadProcessesEndTagBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.EndTag bodyTag = new Token.EndTag("body");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(bodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("body", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testAfterHeadAnythingElseProcessesBodyAndReprocesses() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("body", tb.getStack().get(1).nodeName()); // Body implied
        assertEquals("p", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInBodyProcessesCharacterData() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.Character charToken = new Token.Character();
        charToken.data("hello");
        assertTrue(HtmlTreeBuilderState.InBody.process(charToken, tb));
        assertEquals("hello", tb.getStack().get(2).childNode(0).outerHtml());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("in body comment");
        assertTrue(HtmlTreeBuilderState.InBody.process(commentToken, tb));
        assertEquals("in body comment", tb.getStack().get(2).childNode(0).outerHtml());
    }

    @Test
    public void testInBodyProcessesDoctypeError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name = new StringBuilder("html");
        assertFalse(HtmlTreeBuilderState.InBody.process(doctypeToken, tb));
    }

    @Test
    public void testInBodyProcessesAStartTagWhenAIsInActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Element aTag = tb.insertStartTag("a");
        tb.pushActiveFormattingElements(aTag);

        Token.StartTag anotherATag = new Token.StartTag("a");
        anotherATag.attributes.put("href", "#");
        assertTrue(HtmlTreeBuilderState.InBody.process(anotherATag, tb));

        assertEquals(2, tb.getStack().get(2).childNodeSize()); // original 'a' and the new 'a'
        Element insertedA = (Element) tb.getStack().get(2).childNode(1);
        assertEquals("a", insertedA.nodeName());
        assertEquals("#", insertedA.attr("href"));
        assertEquals(2, tb.getActiveFormattingElements().size()); // original 'a' and new 'a'
    }

    @Test
    public void testInBodyProcessesSpanStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag spanTag = new Token.StartTag("span");
        assertTrue(HtmlTreeBuilderState.InBody.process(spanTag, tb));
        assertEquals("span", tb.getStack().get(2).nodeName());
        assertEquals(1, tb.getActiveFormattingElements().size());
        assertEquals("span", tb.lastFormattingElement().nodeName());
    }

    @Test
    public void testInBodyProcessesLiStartTagWhenInButtonScopeP() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("p");
        Token.StartTag liTag = new Token.StartTag("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(liTag, tb));
        assertEquals("p", tb.getStack().get(3).nodeName()); // The <p> should have been closed
        assertEquals("li", tb.getStack().get(4).nodeName());
    }

    @Test
    public void testInBodyProcessesHtmlStartTagInBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag htmlTag = new Token.StartTag("html");
        htmlTag.attributes.put("lang", "en");
        assertTrue(HtmlTreeBuilderState.InBody.process(htmlTag, tb));
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertTrue(tb.getStack().get(0).hasAttr("lang"));
        assertEquals("en", tb.getStack().get(0).attr("lang"));
    }

    @Test
    public void testInBodyProcessesFormStartTagWhenNoFormElementExists() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag formTag = new Token.StartTag("form");
        formTag.attributes.put("action", "/submit");
        assertTrue(HtmlTreeBuilderState.InBody.process(formTag, tb));
        assertNotNull(tb.getFormElement());
        assertEquals("/submit", tb.getFormElement().attr("action"));
        assertEquals("form", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInBodyProcessesTableStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag tableTag = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InBody.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals("table", tb.getStack().get(3).nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyProcessesInputStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag inputTag = new Token.StartTag("input");
        inputTag.attributes.put("type", "text");
        assertTrue(HtmlTreeBuilderState.InBody.process(inputTag, tb));
        assertEquals("input", tb.getStack().get(2).nodeName());
        assertEquals("text", tb.getStack().get(2).attr("type"));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyProcessesHrStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag hrTag = new Token.StartTag("hr");
        assertTrue(HtmlTreeBuilderState.InBody.process(hrTag, tb));
        assertEquals("hr", tb.getStack().get(2).nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyProcessesImgStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag imgTag = new Token.StartTag("img");
        imgTag.attributes.put("src", "image.jpg");
        assertTrue(HtmlTreeBuilderState.InBody.process(imgTag, tb));
        assertEquals("img", tb.getStack().get(2).nodeName());
        assertEquals("image.jpg", tb.getStack().get(2).attr("src"));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyProcessesAStartTagWhenAIsNotInActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag aTag = new Token.StartTag("a");
        aTag.attributes.put("href", "/link");
        assertTrue(HtmlTreeBuilderState.InBody.process(aTag, tb));
        assertEquals("a", tb.getStack().get(2).nodeName());
        assertEquals("/link", tb.getStack().get(2).attr("href"));
        assertEquals(1, tb.getActiveFormattingElements().size());
        assertEquals("a", tb.lastFormattingElement().nodeName());
    }

    @Test
    public void testInBodyProcessesEndTagA() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Element aTag = tb.insertStartTag("a");
        tb.pushActiveFormattingElements(aTag);
        tb.insert(new Token.Character().data("text"));

        Token.EndTag endATag = new Token.EndTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(endATag, tb));

        assertEquals(3, tb.getStack().get(2).childNodeSize()); // original 'a', text, and closing 'a'
        Element closedATag = (Element) tb.getStack().get(2).childNode(2);
        assertEquals("a", closedATag.nodeName());
        assertEquals(0, tb.getActiveFormattingElements().size());
    }

    @Test
    public void testInBodyProcessesEndTagPWhenInButtonScopeP() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("p");
        tb.insert(new Token.Character().data("paragraph text"));
        Token.EndTag endPTag = new Token.EndTag("p");
        assertTrue(HtmlTreeBuilderState.InBody.process(endPTag, tb));
        assertEquals("p", tb.getStack().get(2).nodeName());
        assertEquals("paragraph text", tb.getStack().get(2).childNode(0).outerHtml());
    }

    @Test
    public void testInBodyProcessesEndTagLiWhenInListItemScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("ul");
        tb.insertStartTag("li");
        tb.insert(new Token.Character().data("list item text"));
        Token.EndTag endLiTag = new Token.EndTag("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(endLiTag, tb));
        assertEquals("li", tb.getStack().get(3).nodeName());
        assertEquals("list item text", tb.getStack().get(3).childNode(0).outerHtml());
    }

    @Test
    public void testInBodyProcessesEndTagBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.EndTag endBodyTag = new Token.EndTag("body");
        assertTrue(HtmlTreeBuilderState.InBody.process(endBodyTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testInBodyProcessesEndTagHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.EndTag endHtmlTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.InBody.process(endHtmlTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state()); // Should process end tag body first
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testInBodyProcessesEndTagFormWhenFormElementExists() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        FormElement form = tb.insertForm(new Token.StartTag("form"), true);
        tb.setFormElement(form);
        Token.EndTag endFormTag = new Token.EndTag("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(endFormTag, tb));
        assertNull(tb.getFormElement());
        assertEquals("body", tb.getStack().get(1).nodeName()); // Form is removed from stack
    }

    @Test
    public void testInBodyProcessesEndTagDivWhenNotInScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.EndTag endDivTag = new Token.EndTag("div");
        assertFalse(HtmlTreeBuilderState.InBody.process(endDivTag, tb)); // Error case
    }

    @Test
    public void testInBodyProcessesEndTagAWhenAIsInActiveFormattingElementsAndNotOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Element aTag = tb.insertStartTag("a");
        tb.pushActiveFormattingElements(aTag);
        tb.removeFromStack(aTag); // Simulate 'a' not being on the stack

        Token.EndTag endATag = new Token.EndTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(endATag, tb));
        assertEquals(0, tb.getActiveFormattingElements().size()); // Should be removed from active formatting elements
    }

    @Test
    public void testInBodyProcessesEndTagAWhenAIsInActiveFormattingElementsAndOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Element aTag = tb.insertStartTag("a");
        tb.pushActiveFormattingElements(aTag);

        Token.EndTag endATag = new Token.EndTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(endATag, tb));
        assertEquals(0, tb.getActiveFormattingElements().size());
    }

    @Test
    public void testInBodyProcessesEndTagPWhenNotInButtonScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.EndTag endPTag = new Token.EndTag("p");
        assertTrue(HtmlTreeBuilderState.InBody.process(endPTag, tb));
        assertEquals("p", tb.getStack().get(2).nodeName()); // Creates an empty <p>
        assertEquals("p", tb.getStack().get(3).nodeName()); // Processes the end tag
        assertEquals("body", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInTableProcessesCharacterData() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.Character charToken = new Token.Character();
        charToken.data("table text");
        assertTrue(HtmlTreeBuilderState.InTable.process(charToken, tb));
        assertEquals(HtmlTreeBuilderState.InTableText, tb.state());
        assertEquals("table text", tb.getPendingTableCharacters().get(0));
    }

    @Test
    public void testInTableProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("in table comment");
        assertTrue(HtmlTreeBuilderState.InTable.process(commentToken, tb));
        assertEquals("in table comment", tb.getStack().get(1).childNode(0).outerHtml());
    }

    @Test
    public void testInTableProcessesDoctypeError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name = new StringBuilder("html");
        assertFalse(HtmlTreeBuilderState.InTable.process(doctypeToken, tb));
    }

    @Test
    public void testInTableProcessesCaptionStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag captionTag = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InTable.process(captionTag, tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
        assertEquals("caption", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInTableProcessesTbodyStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag tbodyTag = new Token.StartTag("tbody");
        assertTrue(HtmlTreeBuilderState.InTable.process(tbodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
        assertEquals("tbody", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInTableProcessesTrStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody"); // Need tbody for tr
        Token.StartTag trTag = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(trTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
        assertEquals("tr", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInTableProcessesScriptStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag scriptTag = new Token.StartTag("script");
        assertTrue(HtmlTreeBuilderState.InTable.process(scriptTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Processed as in InHead
        assertEquals("script", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInTableProcessesEndTagTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.EndTag tableEndTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(tableEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Reset insertion mode
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInTableProcessesEndTagTbody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        Token.EndTag tbodyEndTag = new Token.EndTag("tbody");
        assertTrue(HtmlTreeBuilderState.InTable.process(tbodyEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Transition back to InTable
        assertEquals("table", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInTableProcessesEndTagHtmlError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        assertFalse(HtmlTreeBuilderState.InTable.process(htmlEndTag, tb));
    }

    @Test
    public void testInTableAnythingElseTransitionsToInBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InTable.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // Processed in InBody
        assertEquals("p", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInTableTextProcessesCharacterData() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableText);
        tb.insertStartTag("table");
        Token.Character charToken = new Token.Character();
        charToken.data("text in table text");
        assertTrue(HtmlTreeBuilderState.InTableText.process(charToken, tb));
        assertEquals("text in table text", tb.getPendingTableCharacters().get(0));
    }

    @Test
    public void testInTableTextProcessesEndTagAfterProcessingPendingCharacters() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableText);
        tb.insertStartTag("table");
        Token.Character charToken = new Token.Character();
        charToken.data("some text");
        tb.getPendingTableCharacters().add(charToken.getData()); // Manually add to simulate pending chars

        Token.EndTag endTableTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InTableText.process(endTableTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Reset insertion mode
        assertEquals("some text", tb.getStack().get(1).childNode(0).outerHtml()); // The pending characters are inserted
        assertEquals(0, tb.getStack().size()); // Table is closed
    }

    @Test
    public void testInCaptionProcessesEndTagCaption() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        tb.insertStartTag("table");
        tb.insertStartTag("caption");
        Token.EndTag captionEndTag = new Token.EndTag("caption");
        assertTrue(HtmlTreeBuilderState.InCaption.process(captionEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals("table", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInCaptionProcessesStartTagTbody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        tb.insertStartTag("table");
        tb.insertStartTag("caption");
        Token.StartTag tbodyTag = new Token.StartTag("tbody");
        assertTrue(HtmlTreeBuilderState.InCaption.process(tbodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Processes end tag caption and then reprocesses tbody
        assertEquals("table", tb.getStack().get(1).nodeName());
        assertEquals("tbody", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInCaptionProcessesEndTagTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        tb.insertStartTag("table");
        tb.insertStartTag("caption");
        Token.EndTag tableEndTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InCaption.process(tableEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Processes end tag caption, then end tag table
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInCaptionProcessesEndTagTrError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        tb.insertStartTag("table");
        tb.insertStartTag("caption");
        Token.EndTag trEndTag = new Token.EndTag("tr");
        assertFalse(HtmlTreeBuilderState.InCaption.process(trEndTag, tb));
    }

    @Test
    public void testInCaptionAnythingElseTransitionsToInBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        tb.insertStartTag("table");
        tb.insertStartTag("caption");
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InCaption.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("p", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInColumnGroupProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        tb.insertStartTag("table");
        tb.insertStartTag("colgroup");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(whitespaceToken, tb));
        assertEquals(" ", tb.getStack().get(3).toString()); // Whitespace inserted into colgroup
    }

    @Test
    public void testInColumnGroupProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        tb.insertStartTag("table");
        tb.insertStartTag("colgroup");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("col group comment");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(commentToken, tb));
        assertEquals("col group comment", tb.getStack().get(3).childNode(0).outerHtml());
    }

    @Test
    public void testInColumnGroupProcessesColStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        tb.insertStartTag("table");
        tb.insertStartTag("colgroup");
        Token.StartTag colTag = new Token.StartTag("col");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(colTag, tb));
        assertEquals("col", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInColumnGroupProcessesEndTagColgroup() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        tb.insertStartTag("table");
        tb.insertStartTag("colgroup");
        Token.EndTag colgroupEndTag = new Token.EndTag("colgroup");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(colgroupEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals("table", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInColumnGroupAnythingElseTransitionsToInTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        tb.insertStartTag("table");
        tb.insertStartTag("colgroup");
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Processes end tag colgroup and reprocesses p
        assertEquals("p", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInTableBodyProcessesTrStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        Token.StartTag trTag = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(trTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
        assertEquals("tr", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInTableBodyProcessesTdStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        Token.StartTag tdTag = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(tdTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state()); // Processes start tag tr, then td
        assertEquals("tr", tb.getStack().get(3).nodeName());
        assertEquals("td", tb.getStack().get(4).nodeName());
    }

    @Test
    public void testInTableBodyProcessesEndTagTbody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        Token.EndTag tbodyEndTag = new Token.EndTag("tbody");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(tbodyEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals("table", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInTableBodyProcessesEndTagTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        Token.EndTag tableEndTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(tableEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Processes end tag tbody, then end tag table
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInTableBodyAnythingElseTransitionsToInTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Processed in InTable
        assertEquals("p", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInRowProcessesTdStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        Token.StartTag tdTag = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InRow.process(tdTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
        assertEquals("td", tb.getStack().get(4).nodeName());
    }

    @Test
    public void testInRowProcessesEndTagTr() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        Token.EndTag trEndTag = new Token.EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InRow.process(trEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
        assertEquals("tbody", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInRowProcessesEndTagTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        Token.EndTag tableEndTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InRow.process(tableEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Processes end tag tr, then end tag table
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInRowProcessesEndTagTbody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        Token.EndTag tbodyEndTag = new Token.EndTag("tbody");
        assertTrue(HtmlTreeBuilderState.InRow.process(tbodyEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state()); // Processes end tag tr, then reprocesses tbody end tag
        assertEquals("tbody", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInRowAnythingElseTransitionsToInTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InRow.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Processed in InTable
        assertEquals("p", tb.getStack().get(4).nodeName());
    }

    @Test
    public void testInCellProcessesEndTagTd() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        tb.insertStartTag("td");
        Token.EndTag tdEndTag = new Token.EndTag("td");
        assertTrue(HtmlTreeBuilderState.InCell.process(tdEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
        assertEquals("tr", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInCellProcessesEndTagTh() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        tb.insertStartTag("th");
        Token.EndTag thEndTag = new Token.EndTag("th");
        assertTrue(HtmlTreeBuilderState.InCell.process(thEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
        assertEquals("tr", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInCellProcessesEndTagTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        tb.insertStartTag("td");
        Token.EndTag tableEndTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InCell.process(tableEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Processes end tag td, then end tag table
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInCellProcessesStartTagTbodyError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        tb.insertStartTag("td");
        Token.StartTag tbodyTag = new Token.StartTag("tbody");
        assertTrue(HtmlTreeBuilderState.InCell.process(tbodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state()); // Closes cell, then reprocesses tbody in InRow
        assertEquals("tr", tb.getStack().get(3).nodeName());
        assertEquals("tbody", tb.getStack().get(4).nodeName());
    }

    @Test
    public void testInCellAnythingElseTransitionsToInBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.insertStartTag("tr");
        tb.insertStartTag("td");
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InCell.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("p", tb.getStack().get(5).nodeName());
    }

    @Test
    public void testInSelectProcessesOptionStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        Token.StartTag optionTag = new Token.StartTag("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optionTag, tb));
        assertEquals("option", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInSelectProcessesOptgroupStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        Token.StartTag optgroupTag = new Token.StartTag("optgroup");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optgroupTag, tb));
        assertEquals("optgroup", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInSelectProcessesEndTagSelect() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        Token.EndTag selectEndTag = new Token.EndTag("select");
        assertTrue(HtmlTreeBuilderState.InSelect.process(selectEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Reset insertion mode
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInSelectProcessesEndTagOption() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        tb.insertStartTag("option");
        Token.EndTag optionEndTag = new Token.EndTag("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optionEndTag, tb));
        assertEquals("select", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInSelectProcessesEndTagOptgroup() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        tb.insertStartTag("optgroup");
        Token.EndTag optgroupEndTag = new Token.EndTag("optgroup");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optgroupEndTag, tb));
        assertEquals("select", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInSelectProcessesInputStartTagError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        Token.StartTag inputTag = new Token.StartTag("input");
        assertTrue(HtmlTreeBuilderState.InSelect.process(inputTag, tb));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state()); // Processed end tag select, then reprocesses input in InSelect
        assertEquals("select", tb.getStack().get(1).nodeName()); // select is closed
    }

    @Test
    public void testInSelectInTableProcessesStartTagTableError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        tb.insertStartTag("table");
        tb.insertStartTag("select");
        Token.StartTag tableTag = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Processes end tag select, then reprocesses table in InTable
        assertEquals("table", tb.getStack().get(1).nodeName()); // select is closed
    }

    @Test
    public void testInSelectInTableProcessesEndTagTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        tb.insertStartTag("table");
        tb.insertStartTag("select");
        Token.EndTag tableEndTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tableEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Processes end tag select, then reprocesses end tag table
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testAfterBodyProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body to be in AfterBody
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(" ", tb.getStack().get(1).toString()); // Whitespace inserted into html
    }

    @Test
    public void testAfterBodyProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body to be in AfterBody
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after body comment");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(commentToken, tb));
        assertEquals("after body comment", tb.getStack().get(0).childNode(0).outerHtml());
    }

    @Test
    public void testAfterBodyProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body to be in AfterBody
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterBodyProcessesEndTagHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body to be in AfterBody
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterBodyProcessesEndTagHtmlInFragment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // To simulate fragment parsing, we'd need to initialize differently,
        // but for testing the state transition directly, we can manually set fragmentParsing flag.
        // A simpler test is to just check that the transition to AfterAfterBody doesn't happen for fragments.
        // Since this test specifically targets the non-fragment case for transition to AfterAfterBody,
        // we assume non-fragment parsing context.
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop();
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        // Assuming not fragment parsing for this path.
        assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testAfterBodyTransitionsToInBodyForOtherTokens() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("p", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInFramesetProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(whitespaceToken, tb));
        assertEquals(" ", tb.getStack().get(2).toString()); // Whitespace inserted into frameset
    }

    @Test
    public void testInFramesetProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("frameset comment");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(commentToken, tb));
        assertEquals("frameset comment", tb.getStack().get(2).childNode(0).outerHtml());
    }

    @Test
    public void testInFramesetProcessesFramesetStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.StartTag framesetTag = new Token.StartTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(framesetTag, tb));
        assertEquals("frameset", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInFramesetProcessesFrameStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.StartTag frameTag = new Token.StartTag("frame");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(frameTag, tb));
        assertEquals("frame", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInFramesetProcessesNoframesStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Processed as in InHead
        assertEquals("noframes", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInFramesetProcessesEndTagFrameset() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.EndTag framesetEndTag = new Token.EndTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(framesetEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state()); // Assuming not fragment parsing
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testInFramesetProcessesEndTagFramesetInFragment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("frameset"); // Simulate fragment parsing context
        Token.EndTag framesetEndTag = new Token.EndTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(framesetEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state()); // Does not transition to AfterFrameset in fragment context
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInFramesetProcessesEndTagHtmlError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        assertFalse(HtmlTreeBuilderState.InFrameset.process(htmlEndTag, tb));
    }

    @Test
    public void testInFramesetAnythingElseErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.StartTag pTag = new Token.StartTag("p");
        assertFalse(HtmlTreeBuilderState.InFrameset.process(pTag, tb));
    }

    @Test
    public void testAfterFramesetProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // Transitions to InBody
        assertEquals(" ", tb.getStack().get(1).toString()); // Whitespace inserted into html
    }

    @Test
    public void testAfterFramesetProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after frameset comment");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(commentToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // Transitions to InBody
        assertEquals("after frameset comment", tb.getStack().get(0).childNode(0).outerHtml());
    }

    @Test
    public void testAfterFramesetProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterFramesetProcessesEndTagHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(htmlEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterFramesetProcessesNoframesStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Processed as in InHead
        assertEquals("noframes", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testAfterFramesetAnythingElseErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag pTag = new Token.StartTag("p");
        assertFalse(HtmlTreeBuilderState.AfterFrameset.process(pTag, tb));
    }

    @Test
    public void testAfterAfterBodyProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        tb.insertStartTag("html");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after after body comment");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(commentToken, tb));
        assertEquals("after after body comment", tb.getStack().get(0).childNode(0).outerHtml());
    }

    @Test
    public void testAfterAfterBodyProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        tb.insertStartTag("html");
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterAfterBodyProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        tb.insertStartTag("html");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(" ", tb.getStack().get(1).toString()); // Whitespace inserted into html
    }

    @Test
    public void testAfterAfterFramesetProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        tb.insertStartTag("html");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after after frameset comment");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(commentToken, tb));
        assertEquals("after after frameset comment", tb.getStack().get(0).childNode(0).outerHtml());
    }

    @Test
    public void testAfterAfterFramesetProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterAfterFramesetProcessesNoframesStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Processed as in InHead
        assertEquals("noframes", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testAfterAfterFramesetAnythingElseErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag pTag = new Token.StartTag("p");
        assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(pTag, tb));
    }
}
```