package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder tb = new HtmlTreeBuilder();
    private ParseErrorList errors = ParseErrorList.noTracking();
    private ParseSettings settings = tb.defaultSettings();

    private void setupBuilder(String html) {
        tb.initialiseParse(new StringReader(html), "", errors, settings);
        tb.transition(HtmlTreeBuilderState.Initial);
    }

    private Token nextToken(String html) {
        tb.initialiseParse(new StringReader(html), "", errors, settings);
        // Directly use Tokeniser to create tokens without necessarily processing them into the tree
        Tokeniser tokeniser = new Tokeniser(tb, new StringReader(html), settings);
        return tokeniser.read(tb, new CharacterReader(html));
    }

    private void processToken(Token token) {
        tb.process(token);
    }

    private void processToken(Token token, HtmlTreeBuilderState state) {
        tb.process(token, state);
    }

    @Test
    public void testInitialStateWhitespace() {
        setupBuilder("  ");
        Token t = nextToken("  ");
        assertTrue(HtmlTreeBuilderState.Initial.process(t, tb));
        assertEquals(0, tb.getDocument().childNodes().size());
    }

    @Test
    public void testInitialStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        assertTrue(HtmlTreeBuilderState.Initial.process(t, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInitialStateDoctype() {
        setupBuilder("<!DOCTYPE html>");
        Token t = nextToken("<!DOCTYPE html>");
        assertTrue(HtmlTreeBuilderState.Initial.process(t, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof DocumentType);
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testInitialStateOtherToken() {
        setupBuilder("abc");
        Token t = nextToken("abc");
        assertTrue(HtmlTreeBuilderState.Initial.process(t, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
        // The token should be re-processed by BeforeHtml state
        assertTrue(tb.process(t));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Element);
        assertEquals("html", tb.getDocument().childNodes().get(0).nodeName());
    }

    @Test
    public void testBeforeHtmlStateWhitespace() {
        setupBuilder("  ");
        Token t = nextToken("  ");
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(t, tb));
        assertEquals(0, tb.getDocument().childNodes().size());
    }

    @Test
    public void testBeforeHtmlStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(t, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testBeforeHtmlStateDoctype() {
        setupBuilder("<!DOCTYPE html>");
        Token t = nextToken("<!DOCTYPE html>");
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testBeforeHtmlStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testBeforeHtmlStateEndTagKnown() {
        setupBuilder("</html>"); // Should be ignored, then process "html" start tag
        Token t = nextToken("</html>");
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testBeforeHtmlStateEndTagUnknown() {
        setupBuilder("</p>");
        Token t = nextToken("</p>");
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testBeforeHtmlStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // "html" inserted
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        // Re-process <p>
        assertTrue(tb.process(t));
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testBeforeHeadStateWhitespace() {
        setupBuilder("  ");
        Token t = nextToken("  ");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(t, tb));
        assertEquals(0, tb.getDocument().childNodes().size());
    }

    @Test
    public void testBeforeHeadStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(t, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testBeforeHeadStateDoctype() {
        setupBuilder("<!DOCTYPE html>");
        Token t = nextToken("<!DOCTYPE html>");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testBeforeHeadStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(t, tb));
        // Should be processed by InBody state which doesn't transition
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testBeforeHeadStateStartTagHead() {
        setupBuilder("<head>");
        Token t = nextToken("<head>");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(t, tb));
        assertEquals("head", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testBeforeHeadStateEndTagKnown() {
        setupBuilder("</head>");
        Token t = nextToken("</head>");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(t, tb));
        assertEquals("head", tb.currentElement().nodeName()); // "head" inserted
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        // Re-process </head>
        assertTrue(tb.process(t));
        assertEquals("html", tb.currentElement().nodeName()); // head popped
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testBeforeHeadStateEndTagUnknown() {
        setupBuilder("</p>");
        Token t = nextToken("</p>");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testBeforeHeadStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(t, tb));
        assertEquals("head", tb.currentElement().nodeName()); // "head" inserted
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        // Re-process <p>
        assertTrue(tb.process(t));
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInHeadStateWhitespace() {
        setupBuilder("  ");
        Token t = nextToken("  ");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals("  ", tb.currentElement().childNode(0).outerHtml());
    }

    @Test
    public void testInHeadStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals(1, tb.currentElement().childNodes().size());
        assertTrue(tb.currentElement().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInHeadStateDoctype() {
        setupBuilder("<!DOCTYPE html>");
        Token t = nextToken("<!DOCTYPE html>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertFalse(HtmlTreeBuilderState.InHead.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testInHeadStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertTrue(tb.process(t)); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testInHeadStateStartTagBase() {
        setupBuilder("<base href='http://example.com'>");
        Token t = nextToken("<base href='http://example.com'>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals("base", tb.currentElement().childNode(0).nodeName());
        assertEquals("http://example.com", tb.getBaseUri());
    }

    @Test
    public void testInHeadStateStartTagMeta() {
        setupBuilder("<meta charset='utf-8'>");
        Token t = nextToken("<meta charset='utf-8'>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals("meta", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInHeadStateStartTagTitle() {
        setupBuilder("<title>Test Title</title>");
        Token t = nextToken("<title>Test Title</title>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals("title", tb.currentElement().childNode(0).nodeName());
        assertEquals("Test Title", tb.currentElement().childNode(0).childNode(0).outerHtml());
        assertEquals(HtmlTreeBuilderState.Text, tb.state()); // transition to Text
        assertEquals(HtmlTreeBuilderState.InHead, tb.originalState()); // original state is saved
    }

    @Test
    public void testInHeadStateStartTagNoframes() {
        setupBuilder("<noframes>content</noframes>");
        Token t = nextToken("<noframes>content</noframes>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals("noframes", tb.currentElement().childNode(0).nodeName());
        assertEquals("content", tb.currentElement().childNode(0).childNode(0).outerHtml());
        assertEquals(HtmlTreeBuilderState.Text, tb.state()); // transition to Text
    }

    @Test
    public void testInHeadStateStartTagNoscript() {
        setupBuilder("<noscript>content</noscript>");
        Token t = nextToken("<noscript>content</noscript>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals("noscript", tb.currentElement().childNode(0).nodeName());
        assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
    }

    @Test
    public void testInHeadStateStartTagScript() {
        setupBuilder("<script>alert('hi')</script>");
        Token t = nextToken("<script>alert('hi')</script>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals("script", tb.currentElement().childNode(0).nodeName());
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
        assertEquals(HtmlTreeBuilderState.InHead, tb.originalState());
    }

    @Test
    public void testInHeadStateStartTagHead() {
        setupBuilder("<head>");
        Token t = nextToken("<head>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertFalse(HtmlTreeBuilderState.InHead.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testInHeadStateEndTagHead() {
        setupBuilder("</head>");
        Token t = nextToken("</head>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInHeadStateEndTagKnown() {
        setupBuilder("</body>");
        Token t = nextToken("</body>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        // "body" is processed via anythingElse, which calls processEndTag("head")
        assertEquals("html", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInHeadStateEndTagUnknown() {
        setupBuilder("</p>");
        Token t = nextToken("</p>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertFalse(HtmlTreeBuilderState.InHead.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testInHeadStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(t, tb));
        // "head" is processed via anythingElse, which calls processEndTag("head")
        assertEquals("html", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
        // Re-process <p>
        assertTrue(tb.process(t));
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInHeadNoscriptStateDoctype() {
        setupBuilder("<!DOCTYPE html>");
        Token t = nextToken("<!DOCTYPE html>");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testInHeadNoscriptStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertTrue(tb.process(t, HtmlTreeBuilderState.InBody)); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testInHeadNoscriptStateEndTagNoscript() {
        setupBuilder("</noscript>");
        Token t = nextToken("</noscript>");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInHeadNoscriptStateWhitespace() {
        setupBuilder("  ");
        Token t = nextToken("  ");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // transitions back to InHead
        assertEquals("  ", tb.currentElement().childNode(0).outerHtml());
    }

    @Test
    public void testInHeadNoscriptStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        assertEquals(1, tb.currentElement().childNodes().size());
        assertTrue(tb.currentElement().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInHeadNoscriptStateStartTagStyle() {
        setupBuilder("<style>body {}</style>");
        Token t = nextToken("<style>body {}</style>");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // transitions back to InHead
        assertEquals("style", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInHeadNoscriptStateEndTagBr() {
        setupBuilder("<br>");
        Token t = nextToken("<br>");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // transitions back to InHead
        assertEquals("br", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInHeadNoscriptStateStartTagHead() {
        setupBuilder("<head>");
        Token t = nextToken("<head>");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testInHeadNoscriptStateEndTagBody() {
        setupBuilder("</body>");
        Token t = nextToken("</body>");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testInHeadNoscriptStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // transitions back to InHead
        // The error is that we inserted <p> as character data.
        assertEquals("p", tb.currentElement().childNode(0).outerHtml());
    }

    @Test
    public void testAfterHeadStateWhitespace() {
        setupBuilder("  ");
        Token t = nextToken("  ");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        assertEquals("  ", tb.currentElement().childNode(0).outerHtml());
    }

    @Test
    public void testAfterHeadStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        assertEquals(1, tb.currentElement().childNodes().size());
        assertTrue(tb.currentElement().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testAfterHeadStateDoctype() {
        setupBuilder("<!DOCTYPE html>");
        Token t = nextToken("<!DOCTYPE html>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertFalse(HtmlTreeBuilderState.AfterHead.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testAfterHeadStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertTrue(tb.process(t, HtmlTreeBuilderState.InBody)); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterHeadStateStartTagBody() {
        setupBuilder("<body>");
        Token t = nextToken("<body>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        assertEquals("body", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterHeadStateStartTagFrameset() {
        setupBuilder("<frameset></frameset>");
        Token t = nextToken("<frameset></frameset>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        assertEquals("frameset", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testAfterHeadStateStartTagScript() {
        setupBuilder("<script>alert('hi')</script>");
        Token t = nextToken("<script>alert('hi')</script>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        // Should be processed as InHead, then transition to AfterHead
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
        assertEquals("head", tb.currentElement().nodeName()); // head is on stack
        assertEquals("script", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testAfterHeadStateStartTagHead() {
        setupBuilder("<head>");
        Token t = nextToken("<head>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertFalse(HtmlTreeBuilderState.AfterHead.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testAfterHeadStateEndTagBody() {
        setupBuilder("</body>");
        Token t = nextToken("</body>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        // "body" processed via anythingElse, which calls processStartTag("body")
        assertEquals("body", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterHeadStateEndTagHtml() {
        setupBuilder("</html>");
        Token t = nextToken("</html>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        // "body" processed via anythingElse, which calls processStartTag("body")
        assertEquals("body", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        // Re-process </html>
        assertTrue(tb.process(t));
        assertEquals("html", tb.currentElement().nodeName()); // body popped
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testAfterHeadStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(t, tb));
        // "body" processed via anythingElse, which calls processStartTag("body")
        assertEquals("body", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        // Re-process <p>
        assertTrue(tb.process(t));
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateCharacter() {
        setupBuilder("abc");
        Token t = nextToken("abc");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("abc", tb.currentElement().childNode(0).outerHtml());
    }

    @Test
    public void testInBodyStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals(1, tb.currentElement().childNodes().size());
        assertTrue(tb.currentElement().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInBodyStateDoctype() {
        setupBuilder("<!DOCTYPE html>");
        Token t = nextToken("<!DOCTYPE html>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertFalse(HtmlTreeBuilderState.InBody.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testInBodyStateStartTagA() {
        setupBuilder("<a><b></b></a>");
        Token t = nextToken("<a><b></b></a>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("a", tb.currentElement().nodeName());
        assertEquals(1, tb.getActiveFormattingElements().size());
        assertEquals("a", tb.getActiveFormattingElements().get(0).nodeName());
    }

    @Test
    public void testInBodyStateStartTagPCloser() {
        setupBuilder("<p><b></b></p>");
        Token t = nextToken("<p><b></b></p>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagLi() {
        setupBuilder("<li>Item</li>");
        Token t = nextToken("<li>Item</li>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("li", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagHtml() {
        setupBuilder("<html id='main'></html>");
        Token t = nextToken("<html id='main'>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("html", tb.getStack().get(0).nodeName()); // Should merge attributes
        assertEquals("main", tb.getStack().get(0).attr("id"));
    }

    @Test
    public void testInBodyStateStartTagBody() {
        setupBuilder("<body class='content'></body>");
        Token t = nextToken("<body class='content'>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("body", tb.currentElement().nodeName()); // Should merge attributes
        assertEquals("content", tb.currentElement().attr("class"));
    }

    @Test
    public void testInBodyStateStartTagFrameset() {
        setupBuilder("<frameset></frameset>");
        Token t = nextToken("<frameset></frameset>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testInBodyStateStartTagH1() {
        setupBuilder("<h1>Title</h1>");
        Token t = nextToken("<h1>Title</h1>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("h1", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagPre() {
        setupBuilder("<pre>Preformatted</pre>");
        Token t = nextToken("<pre>Preformatted</pre>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("pre", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInBodyStateStartTagForm() {
        setupBuilder("<form><input></form>");
        Token t = nextToken("<form><input></form>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("form", tb.getFormElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagDd() {
        setupBuilder("<dd>Data</dd>");
        Token t = nextToken("<dd>Data</dd>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("dd", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagPlaintext() {
        setupBuilder("<plaintext>Plain text</plaintext>");
        Token t = nextToken("<plaintext>Plain text</plaintext>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("plaintext", tb.currentElement().nodeName());
        assertEquals(TokeniserState.PLAINTEXT, tb.tokeniser.state());
    }

    @Test
    public void testInBodyStateStartTagButton() {
        setupBuilder("<button></button>");
        Token t = nextToken("<button></button>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("button", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagB() {
        setupBuilder("<b>Bold</b>");
        Token t = nextToken("<b>Bold</b>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("b", tb.currentElement().nodeName());
        assertEquals(1, tb.getActiveFormattingElements().size());
        assertEquals("b", tb.getActiveFormattingElements().get(0).nodeName());
    }

    @Test
    public void testInBodyStateStartTagNobr() {
        setupBuilder("<nobr>No break</nobr>");
        Token t = nextToken("<nobr>No break</nobr>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("nobr", tb.currentElement().nodeName());
        assertEquals(1, tb.getActiveFormattingElements().size());
        assertEquals("nobr", tb.getActiveFormattingElements().get(0).nodeName());
    }

    @Test
    public void testInBodyStateStartTagApplet() {
        setupBuilder("<applet></applet>");
        Token t = nextToken("<applet></applet>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("applet", tb.currentElement().nodeName());
        assertTrue(tb.getStack().get(tb.getStack().size() - 1).hasAttributes()); // Marker inserted
    }

    @Test
    public void testInBodyStateStartTagTable() {
        setupBuilder("<table></table>");
        Token t = nextToken("<table></table>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("table", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInBodyStateStartTagInputHidden() {
        setupBuilder("<input type='hidden'>");
        Token t = nextToken("<input type='hidden'>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("input", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInBodyStateStartTagInputText() {
        setupBuilder("<input type='text'>");
        Token t = nextToken("<input type='text'>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("input", tb.currentElement().childNode(0).nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyStateStartTagHr() {
        setupBuilder("<hr>");
        Token t = nextToken("<hr>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("hr", tb.currentElement().childNode(0).nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyStateStartTagImage() {
        setupBuilder("<image src='img.png'>");
        Token t = nextToken("<image src='img.png'>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("img", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInBodyStateStartTagIsindex() {
        setupBuilder("<isindex prompt='Enter:'>");
        Token t = nextToken("<isindex prompt='Enter:'>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        // Check for generated form, hr, label, input, hr, form
        assertEquals(3, tb.getDocument().childNodes().size()); // Assuming document has no other nodes
        Element form = (Element) tb.getDocument().childNode(0);
        assertEquals("form", form.nodeName());
        assertEquals(1, form.childNodes().size());
        Element input = (Element) form.childNode(0);
        assertEquals("input", input.nodeName());
        assertEquals("isindex", input.attr("name"));
    }

    @Test
    public void testInBodyStateStartTagTextarea() {
        setupBuilder("<textarea></textarea>");
        Token t = nextToken("<textarea></textarea>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("textarea", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInBodyStateStartTagXmp() {
        setupBuilder("<xmp>content</xmp>");
        Token t = nextToken("<xmp>content</xmp>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("xmp", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInBodyStateStartTagIframe() {
        setupBuilder("<iframe></iframe>");
        Token t = nextToken("<iframe></iframe>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("iframe", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInBodyStateStartTagNoembed() {
        setupBuilder("<noembed>content</noembed>");
        Token t = nextToken("<noembed>content</noembed>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("noembed", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInBodyStateStartTagSelect() {
        setupBuilder("<select></select>");
        Token t = nextToken("<select></select>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("select", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInBodyStateStartTagOption() {
        setupBuilder("<option></option>");
        Token t = nextToken("<option></option>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("option", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagRuby() {
        setupBuilder("<ruby></ruby>");
        Token t = nextToken("<ruby></ruby>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("ruby", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagMath() {
        setupBuilder("<math></math>");
        Token t = nextToken("<math></math>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("math", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateStartTagSvg() {
        setupBuilder("<svg></svg>");
        Token t = nextToken("<svg></svg>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("svg", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStateEndTagA() {
        setupBuilder("<a></a>");
        Token t = nextToken("</a>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup for active formatting elements
        Element a = new Element(Tag.valueOf("a"), tb.getBaseUri());
        tb.pushActiveFormattingElements(a);
        tb.push(a);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // a is popped
        assertEquals(0, tb.getActiveFormattingElements().size());
    }

    @Test
    public void testInBodyStateEndTagP() {
        setupBuilder("<p></p>");
        Token t = nextToken("</p>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup
        Element p = new Element(Tag.valueOf("p"), tb.getBaseUri());
        tb.push(p);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // p is popped
    }

    @Test
    public void testInBodyStateEndTagLi() {
        setupBuilder("<li></li>");
        Token t = nextToken("</li>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup
        Element li = new Element(Tag.valueOf("li"), tb.getBaseUri());
        tb.push(li);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // li is popped
    }

    @Test
    public void testInBodyStateEndTagBody() {
        setupBuilder("</body>");
        Token t = nextToken("</body>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testInBodyStateEndTagHtml() {
        setupBuilder("</html>");
        Token t = nextToken("</html>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup
        tb.push(new Element(Tag.valueOf("html"), tb.getBaseUri()));
        tb.push(new Element(Tag.valueOf("body"), tb.getBaseUri()));
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testInBodyStateEndTagForm() {
        setupBuilder("</form>");
        Token t = nextToken("</form>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup
        FormElement form = new FormElement(Tag.valueOf("form"), tb.getBaseUri(), new Attributes());
        tb.push(form);
        tb.setFormElement(form);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertNull(tb.getFormElement());
        assertEquals("html", tb.currentElement().nodeName()); // form is popped
    }

    @Test
    public void testInBodyStateEndTagDd() {
        setupBuilder("</dd>");
        Token t = nextToken("</dd>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup
        Element dd = new Element(Tag.valueOf("dd"), tb.getBaseUri());
        tb.push(dd);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // dd is popped
    }

    @Test
    public void testInBodyStateEndTagH1() {
        setupBuilder("</h1>");
        Token t = nextToken("</h1>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup
        Element h1 = new Element(Tag.valueOf("h1"), tb.getBaseUri());
        tb.push(h1);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // h1 is popped
    }

    @Test
    public void testInBodyStateEndTagSpan() {
        setupBuilder("</span>");
        Token t = nextToken("</span>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup
        Element span = new Element(Tag.valueOf("span"), tb.getBaseUri());
        tb.push(span);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // span is popped
    }

    @Test
    public void testInBodyStateEndTagSarcasm() {
        setupBuilder("</sarcasm>");
        Token t = nextToken("</sarcasm>");
        tb.transition(HtmlTreeBuilderState.InBody);
        // Mock setup
        Element sarcasm = new Element(Tag.valueOf("sarcasm"), tb.getBaseUri());
        tb.push(sarcasm);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // sarcasm is popped
    }

    @Test
    public void testInBodyStateEndTagBr() {
        setupBuilder("<br>");
        Token t = nextToken("<br>");
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(t, tb));
        // Should process start tag "br" and then return false
        assertFalse(tb.framesetOk());
        assertEquals("br", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInBodyStateEOF() {
        setupBuilder("");
        // Create an EOF token manually
        Token eofToken = new Token.EOF();
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(eofToken, tb));
        // Nothing specific to assert, just checks it doesn't crash
    }

    @Test
    public void testInTableStateStartTagCaption() {
        setupBuilder("<caption>Caption</caption>");
        Token t = nextToken("<caption>Caption</caption>");
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(t, tb));
        assertEquals("caption", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testInTableStateStartTagColgroup() {
        setupBuilder("<colgroup></colgroup>");
        Token t = nextToken("<colgroup></colgroup>");
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(t, tb));
        assertEquals("colgroup", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testInTableStateStartTagTbody() {
        setupBuilder("<tbody></tbody>");
        Token t = nextToken("<tbody></tbody>");
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(t, tb));
        assertEquals("tbody", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInTableStateEndTagTable() {
        setupBuilder("</table>");
        Token t = nextToken("</table>");
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // table popped
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // resetInsertionMode
    }

    @Test
    public void testInTableStateStartTagInputHidden() {
        setupBuilder("<input type='hidden'>");
        Token t = nextToken("<input type='hidden'>");
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(t, tb));
        assertEquals("input", tb.currentElement().childNode(0).nodeName());
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // stays in InTable
    }

    @Test
    public void testInTableStateStartTagInputOther() {
        setupBuilder("<input type='text'>");
        Token t = nextToken("<input type='text'>");
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // transitions to InBody
        assertEquals("input", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInTableStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // transitions to InBody
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInTableTextStateCharacter() {
        setupBuilder("abc");
        Token t = nextToken("abc");
        tb.transition(HtmlTreeBuilderState.InTableText);
        assertTrue(HtmlTreeBuilderState.InTableText.process(t, tb));
        assertEquals("abc", tb.getPendingTableCharacters().get(0));
    }

    @Test
    public void testInTableTextStateEndTagTbody() {
        setupBuilder("</tbody>");
        Token t = nextToken("</tbody>");
        tb.transition(HtmlTreeBuilderState.InTableText);
        // Process pending characters first
        tb.newPendingTableCharacters();
        tb.getPendingTableCharacters().add("  "); // add whitespace
        assertTrue(HtmlTreeBuilderState.InTableText.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // original state
        assertEquals("tbody", tb.currentElement().nodeName()); // tbody is processed
    }

    @Test
    public void testInCaptionStateEndTagCaption() {
        setupBuilder("</caption>");
        Token t = nextToken("</caption>");
        tb.transition(HtmlTreeBuilderState.InCaption);
        // Mock setup
        Element caption = new Element(Tag.valueOf("caption"), tb.getBaseUri());
        tb.push(caption);
        assertTrue(HtmlTreeBuilderState.InCaption.process(t, tb));
        assertEquals("table", tb.currentElement().nodeName()); // caption popped
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInCaptionStateStartTagTable() {
        setupBuilder("<table>");
        Token t = nextToken("<table>");
        tb.transition(HtmlTreeBuilderState.InCaption);
        assertTrue(HtmlTreeBuilderState.InCaption.process(t, tb));
        // End tag "caption" is processed, then table is processed
        assertEquals("table", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInCaptionStateEndTagTable() {
        setupBuilder("</table>");
        Token t = nextToken("</table>");
        tb.transition(HtmlTreeBuilderState.InCaption);
        assertTrue(HtmlTreeBuilderState.InCaption.process(t, tb));
        // End tag "caption" is processed, then table is processed
        assertEquals("html", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInColumnGroupStateEndTagColgroup() {
        setupBuilder("</colgroup>");
        Token t = nextToken("</colgroup>");
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        // Mock setup
        Element colgroup = new Element(Tag.valueOf("colgroup"), tb.getBaseUri());
        tb.push(colgroup);
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(t, tb));
        assertEquals("table", tb.currentElement().nodeName()); // colgroup popped
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInColumnGroupStateStartTagCol() {
        setupBuilder("<col>");
        Token t = nextToken("<col>");
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(t, tb));
        assertEquals("col", tb.currentElement().childNode(0).nodeName());
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testInColumnGroupStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Handled by anythingElse
        assertEquals("html", tb.currentElement().nodeName()); // colgroup popped
    }

    @Test
    public void testInTableBodyStateStartTagTr() {
        setupBuilder("<tr></tr>");
        Token t = nextToken("<tr></tr>");
        tb.transition(HtmlTreeBuilderState.InTableBody);
        assertTrue(HtmlTreeBuilderState.InTableBody.process(t, tb));
        assertEquals("tr", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInTableBodyStateStartTagTd() {
        setupBuilder("<td></td>");
        Token t = nextToken("<td></td>");
        tb.transition(HtmlTreeBuilderState.InTableBody);
        assertTrue(HtmlTreeBuilderState.InTableBody.process(t, tb));
        assertEquals("tr", tb.currentElement().nodeName()); // implicit tr
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
        assertEquals("td", tb.currentElement().childNode(0).nodeName());
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInTableBodyStateEndTagTbody() {
        setupBuilder("</tbody>");
        Token t = nextToken("</tbody>");
        tb.transition(HtmlTreeBuilderState.InTableBody);
        // Mock setup
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);
        assertTrue(HtmlTreeBuilderState.InTableBody.process(t, tb));
        assertEquals("table", tb.currentElement().nodeName()); // tbody popped
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInTableBodyStateEndTagTable() {
        setupBuilder("</table>");
        Token t = nextToken("</table>");
        tb.transition(HtmlTreeBuilderState.InTableBody);
        assertTrue(HtmlTreeBuilderState.InTableBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // exitTableBody calls processEndTag("tbody") and then processes table token.
    }

    @Test
    public void testInRowStateStartTagTh() {
        setupBuilder("<th></th>");
        Token t = nextToken("<th></th>");
        tb.transition(HtmlTreeBuilderState.InRow);
        assertTrue(HtmlTreeBuilderState.InRow.process(t, tb));
        assertEquals("th", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInRowStateEndTagTr() {
        setupBuilder("</tr>");
        Token t = nextToken("</tr>");
        tb.transition(HtmlTreeBuilderState.InRow);
        // Mock setup
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr);
        assertTrue(HtmlTreeBuilderState.InRow.process(t, tb));
        assertEquals("tbody", tb.currentElement().nodeName()); // tr popped
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInRowStateHandleMissingTr() {
        setupBuilder("<td></td>");
        Token t = nextToken("<td></td>");
        tb.transition(HtmlTreeBuilderState.InRow);
        // Process missing tr
        assertTrue(HtmlTreeBuilderState.InRow.process(t, tb));
        assertEquals("td", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInCellStateEndTagTd() {
        setupBuilder("</td>");
        Token t = nextToken("</td>");
        tb.transition(HtmlTreeBuilderState.InCell);
        // Mock setup
        Element td = new Element(Tag.valueOf("td"), tb.getBaseUri());
        tb.push(td);
        tb.insertMarkerToFormattingElements(); // Simulate marker
        assertTrue(HtmlTreeBuilderState.InCell.process(t, tb));
        assertEquals("tr", tb.currentElement().nodeName()); // td popped
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellStateEndTagTh() {
        setupBuilder("</th>");
        Token t = nextToken("</th>");
        tb.transition(HtmlTreeBuilderState.InCell);
        // Mock setup
        Element th = new Element(Tag.valueOf("th"), tb.getBaseUri());
        tb.push(th);
        tb.insertMarkerToFormattingElements(); // Simulate marker
        assertTrue(HtmlTreeBuilderState.InCell.process(t, tb));
        assertEquals("tr", tb.currentElement().nodeName()); // th popped
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellStateStartTagTable() {
        setupBuilder("<table>");
        Token t = nextToken("<table>");
        tb.transition(HtmlTreeBuilderState.InCell);
        assertTrue(HtmlTreeBuilderState.InCell.process(t, tb));
        assertEquals("tr", tb.currentElement().nodeName()); // cell closed, then table processed
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInCellStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.InCell);
        assertTrue(HtmlTreeBuilderState.InCell.process(t, tb));
        assertEquals("p", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInSelectStateStartTagOption() {
        setupBuilder("<option></option>");
        Token t = nextToken("<option></option>");
        tb.transition(HtmlTreeBuilderState.InSelect);
        assertTrue(HtmlTreeBuilderState.InSelect.process(t, tb));
        assertEquals("option", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectStateEndTagOption() {
        setupBuilder("</option>");
        Token t = nextToken("</option>");
        tb.transition(HtmlTreeBuilderState.InSelect);
        // Mock setup
        Element option = new Element(Tag.valueOf("option"), tb.getBaseUri());
        tb.push(option);
        assertTrue(HtmlTreeBuilderState.InSelect.process(t, tb));
        assertEquals("select", tb.currentElement().nodeName()); // option popped
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectStateEndTagSelect() {
        setupBuilder("</select>");
        Token t = nextToken("</select>");
        tb.transition(HtmlTreeBuilderState.InSelect);
        // Mock setup
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);
        assertTrue(HtmlTreeBuilderState.InSelect.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // select popped
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // resetInsertionMode
    }

    @Test
    public void testInSelectStateStartTagInput() {
        setupBuilder("<input>");
        Token t = nextToken("<input>");
        tb.transition(HtmlTreeBuilderState.InSelect);
        assertTrue(HtmlTreeBuilderState.InSelect.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // transitions to InBody
    }

    @Test
    public void testInSelectStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.InSelect);
        assertTrue(HtmlTreeBuilderState.InSelect.process(t, tb));
        // Error reported, returns false
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testInSelectInTableStateStartTagTable() {
        setupBuilder("<table>");
        Token t = nextToken("<table>");
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // select closed, table processed in InBody
    }

    @Test
    public void testInSelectInTableStateEndTagTable() {
        setupBuilder("</table>");
        Token t = nextToken("</table>");
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // select closed, table processed in InBody
    }

    @Test
    public void testInSelectInTableStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state()); // transitions to InSelect
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterBodyStateWhitespace() {
        setupBuilder("  ");
        Token t = nextToken("  ");
        tb.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("  ", tb.currentElement().childNode(0).outerHtml());
    }

    @Test
    public void testAfterBodyStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // comment inserted into html
    }

    @Test
    public void testAfterBodyStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertTrue(tb.process(t, HtmlTreeBuilderState.InBody)); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterBodyStateEndTagHtml() {
        setupBuilder("</html>");
        Token t = nextToken("</html>");
        tb.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testAfterBodyStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInFramesetStateStartTagFrameset() {
        setupBuilder("<frameset></frameset>");
        Token t = nextToken("<frameset></frameset>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertEquals("frameset", tb.currentElement().nodeName());
    }

    @Test
    public void testInFramesetStateStartTagFrame() {
        setupBuilder("<frame></frame>");
        Token t = nextToken("<frame></frame>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertEquals("frame", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInFramesetStateStartTagNoframes() {
        setupBuilder("<noframes></noframes>");
        Token t = nextToken("<noframes></noframes>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInFramesetStateEndTagFrameset() {
        setupBuilder("</frameset>");
        Token t = nextToken("</frameset>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        // Mock setup
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // frameset popped
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void testInFramesetStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        assertFalse(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testAfterFramesetStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertTrue(tb.process(t, HtmlTreeBuilderState.InBody)); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterFramesetStateEndTagHtml() {
        setupBuilder("</html>");
        Token t = nextToken("</html>");
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testAfterFramesetStateStartTagNoframes() {
        setupBuilder("<noframes></noframes>");
        Token t = nextToken("<noframes></noframes>");
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterFramesetStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        assertFalse(HtmlTreeBuilderState.AfterFrameset.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testAfterAfterBodyStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // comment inserted into html
    }

    @Test
    public void testAfterAfterBodyStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertTrue(tb.process(t, HtmlTreeBuilderState.InBody)); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterAfterBodyStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterAfterFramesetStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertTrue(tb.process(t, HtmlTreeBuilderState.InBody)); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterAfterFramesetStateStartTagNoframes() {
        setupBuilder("<noframes></noframes>");
        Token t = nextToken("<noframes></noframes>");
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterAfterFramesetStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

}
