package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.Iterator;
import java.util.LinkedList;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;

public class TreeBuilderStateTest {

    // Helper method to create a TreeBuilder with a document and base URI
    private TreeBuilder createTreeBuilder(String baseUri) {
        TreeBuilder tb = new TreeBuilder();
        tb.parse("", baseUri); // Initialize with an empty document
        return tb;
    }

    // Helper method to create a TreeBuilder and transition to a specific state
    private TreeBuilder createAndTransition(String baseUri, TreeBuilderState targetState) {
        TreeBuilder tb = createTreeBuilder(baseUri);
        tb.transition(targetState);
        return tb;
    }

    @Test
    public void testInitialStateIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.Initial);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        // According to the source, whitespace is ignored and the state remains Initial. No nodes are added.
        assertEquals(0, tb.getDocument().childNodes().size());
    }


    @Test
    public void testInitialStateReprocessesTokenWhenNotWhitespaceOrCommentOrDoctype() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.Initial);
        Token.StartTag htmlTag = new Token.StartTag("html");
        // The logic is: if not whitespace, comment, or doctype, transition to BeforeHtml and reprocess.
        assertTrue(tb.state().process(htmlTag, tb));
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
        // The reprocessed token should be inserted.
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHtmlIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        // Whitespace is ignored, state remains BeforeHtml.
        assertEquals(0, tb.getDocument().childNodes().size());
    }


    @Test
    public void testBeforeHtmlTransitionsToBeforeHeadOnHtmlStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(tb.state().process(htmlTag, tb));
        assertEquals(TreeBuilderState.BeforeHead, tb.state());
        // The <html > tag should be inserted.
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHtmlHandlesUnexpectedEndTags() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Token.EndTag headTag = new Token.EndTag("head");
        // The spec says to call anythingElse, which inserts "html" and transitions to BeforeHead, then reprocesses.
        // The logic in anythingElse leads to inserting "html" and then processing the token again.
        // When the token is an end tag like "head", it hits the "tb.error(this); return false;" path.
        assertFalse(tb.state().process(headTag, tb));
        // The state should remain BeforeHtml on error.
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlAnythingElseHandlesMissingHtml() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Token.StartTag bodyTag = new Token.StartTag("body");
        // anythingElse inserts "html" and transitions to BeforeHead, then reprocesses the token.
        assertTrue(tb.state().process(bodyTag, tb));
        // The state transitions to BeforeHead.
        assertEquals(TreeBuilderState.BeforeHead, tb.state());
        // "html" is inserted, then "body" is processed in BeforeHead state.
        assertEquals(2, tb.getDocument().childNodes().size());
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
        assertEquals("body", tb.getDocument().childNode(1).nodeName());
    }

    @Test
    public void testBeforeHeadIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        // Whitespace is ignored.
        assertEquals(0, tb.getDocument().childNodes().size());
    }


    @Test
    public void testBeforeHeadTransitionsToInHeadOnHeadStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Token.StartTag headTag = new Token.StartTag("head");
        assertTrue(tb.state().process(headTag, tb));
        assertEquals(TreeBuilderState.InHead, tb.state());
        // The <head> tag should be inserted.
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals("head", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHeadHandlesUnexpectedEndTags() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Token.EndTag bodyTag = new Token.EndTag("body");
        // This should trigger the error path and return false.
        assertFalse(tb.state().process(bodyTag, tb));
        assertEquals(TreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testBeforeHeadAnythingElseHandlesMissingHead() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Token.StartTag metaTag = new Token.StartTag("meta");
        // anythingElse inserts "head" and transitions to InHead, then reprocesses the token.
        assertTrue(tb.state().process(metaTag, tb));
        assertEquals(TreeBuilderState.InHead, tb.state());
        // "head" is inserted, then "meta" is processed in InHead state.
        assertEquals(2, tb.getDocument().childNodes().size());
        assertEquals("head", tb.getDocument().childNode(0).nodeName());
        assertEquals("meta", tb.getDocument().childNode(1).nodeName());
    }

    @Test
    public void testInHeadIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        // Whitespace is inserted as a TextNode.
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof TextNode);
        assertEquals(" ", ((TextNode) tb.getDocument().childNodes().get(0)).getWholeText());
    }


    @Test
    public void testInHeadHandlesBaseTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag baseTag = new Token.StartTag("base");
        baseTag.attributes.put("href", "http://example.com");
        assertTrue(tb.state().process(baseTag, tb));
        // The base tag is inserted as an empty element.
        assertEquals(2, tb.getDocument().childNodes().size()); // head and base
        assertTrue(tb.getDocument().childNodes().get(1) instanceof Element);
        Element baseElement = (Element) tb.getDocument().childNodes().get(1);
        assertEquals("base", baseElement.nodeName());
        assertEquals("http://example.com", baseElement.attr("href"));
        // The base URI should be updated.
        assertEquals("http://example.com", tb.getBaseUri());
    }

    @Test
    public void testInHeadHandlesMetaTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag metaTag = new Token.StartTag("meta");
        assertTrue(tb.state().process(metaTag, tb));
        // The meta tag is inserted as an empty element.
        assertEquals(2, tb.getDocument().childNodes().size()); // head and meta
        assertTrue(tb.getDocument().childNodes().get(1) instanceof Element);
        assertEquals("meta", ((Element) tb.getDocument().childNodes().get(1)).nodeName());
    }

    @Test
    public void testInHeadHandlesTitleTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag titleStart = new Token.StartTag("title");
        Token.Character titleText = new Token.Character("Page Title");
        Token.EndTag titleEnd = new Token.EndTag("title");

        assertTrue(tb.state().process(titleStart, tb)); // Inserts start tag, transitions to Text state
        assertEquals(TreeBuilderState.Text, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // head and title start tag

        assertTrue(tb.state().process(titleText, tb)); // Inserts text in Text state
        assertEquals(3, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(2) instanceof TextNode);
        assertEquals("Page Title", ((TextNode) tb.getDocument().childNodes().get(2)).getWholeText());

        assertTrue(tb.state().process(titleEnd, tb)); // Transitions back to InHead, closing title
        assertEquals(TreeBuilderState.InHead, tb.state());
        // The title element and its text content should form a single node.
        assertEquals(2, tb.getDocument().childNodes().size()); // head and title element
        assertEquals("title", ((Element) tb.getDocument().childNodes().get(1)).nodeName());
        assertEquals("Page Title", ((Element) tb.getDocument().childNodes().get(1)).text());
    }

    @Test
    public void testInHeadHandlesNoscriptStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag noscriptStart = new Token.StartTag("noscript");
        assertTrue(tb.state().process(noscriptStart, tb));
        assertEquals(TreeBuilderState.InHeadNoscript, tb.state());
        // The noscript start tag is inserted.
        assertEquals(2, tb.getDocument().childNodes().size()); // head and noscript start
    }

    @Test
    public void testInHeadHandlesScriptStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag scriptStart = new Token.StartTag("script");
        assertTrue(tb.state().process(scriptStart, tb));
        assertEquals(TreeBuilderState.Text, tb.state()); // Transitions to Text state
        // The script start tag is inserted.
        assertEquals(2, tb.getDocument().childNodes().size()); // head and script start
        assertEquals("script", ((Element) tb.getDocument().childNodes().get(1)).nodeName());
    }

    @Test
    public void testInHeadHandlesHeadEndTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.EndTag headEnd = new Token.EndTag("head");
        assertTrue(tb.state().process(headEnd, tb));
        assertEquals(TreeBuilderState.AfterHead, tb.state());
        // The head element is now complete.
        assertEquals(1, tb.getDocument().childNodes().size());
    }

    @Test
    public void testInHeadHandlesUnexpectedEndTags() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.EndTag bodyTag = new Token.EndTag("body");
        // This should trigger the error path and return false.
        assertFalse(tb.state().process(bodyTag, tb));
        assertEquals(TreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInHeadAnythingElseHandlesMissingHeadEndTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag pTag = new Token.StartTag("p");
        // anythingElse inserts "</head>" and then reprocesses the token "<p>".
        assertTrue(tb.state().process(pTag, tb));
        // After inserting </head>, state becomes AfterHead. Then processing <p> in AfterHead moves it to InBody.
        assertEquals(TreeBuilderState.InBody, tb.state());
        // head, then p.
        assertEquals(2, tb.getDocument().childNodes().size());
        assertEquals("head", tb.getDocument().childNode(0).nodeName());
        assertEquals("p", tb.getDocument().childNode(1).nodeName());
    }

    @Test
    public void testInHeadNoscriptHandlesEndNoscriptTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHeadNoscript);
        Token.EndTag noscriptEnd = new Token.EndTag("noscript");
        assertTrue(tb.state().process(noscriptEnd, tb));
        assertEquals(TreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInHeadNoscriptHandlesEndBrTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHeadNoscript);
        Token.EndTag brTag = new Token.EndTag("br");
        // The spec says: else if (t.isEndTag() && t.asEndTag().name().equals("br")) { return anythingElse(t, tb); }
        // anythingElse calls tb.error(this); tb.process(new Token.EndTag("noscript")); return tb.process(t);
        // This will insert a </noscript> tag, then try to process <br> which moves to InBody.
        // The state should transition back to InHead after </noscript>.
        assertTrue(tb.state().process(brTag, tb));
        assertEquals(TreeBuilderState.InHead, tb.state()); // Should transition back to InHead after </noscript>
        // The document will have: head, noscript start, then the <br> (handled as InBody)
        assertEquals(3, tb.getDocument().childNodes().size());
    }

    @Test
    public void testAfterHeadIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        // Whitespace is inserted.
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof TextNode);
        assertEquals(" ", ((TextNode) tb.getDocument().childNodes().get(0)).getWholeText());
    }


    @Test
    public void testAfterHeadHandlesHtmlStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(tb.state().process(htmlTag, tb));
        // According to the spec, this transitions to InBody.
        assertEquals(TreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterHeadHandlesBodyStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag bodyTag = new Token.StartTag("body");
        assertTrue(tb.state().process(bodyTag, tb));
        assertEquals(TreeBuilderState.InBody, tb.state());
        // The <head> and <body> tags should be inserted.
        assertEquals(2, tb.getDocument().childNodes().size());
        assertEquals("body", tb.getDocument().childNode(1).nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testAfterHeadHandlesFramesetStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag framesetTag = new Token.StartTag("frameset");
        assertTrue(tb.state().process(framesetTag, tb));
        assertEquals(TreeBuilderState.InFrameset, tb.state());
        // The <head> and <frameset> tags should be inserted.
        assertEquals(2, tb.getDocument().childNodes().size());
        assertEquals("frameset", tb.getDocument().childNode(1).nodeName());
    }

    @Test
    public void testAfterHeadHandlesInvalidTags() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag scriptTag = new Token.StartTag("script");
        // The spec says: else if (name.equals("script")) { tb.error(this); Element head = tb.getHeadElement(); tb.push(head); tb.process(t, InHead); tb.removeFromStack(head); }
        assertTrue(tb.state().process(scriptTag, tb));
        // The state should return to AfterHead after processing.
        assertEquals(TreeBuilderState.AfterHead, tb.state());
        // The script tag should be inserted within the head.
        assertEquals(2, tb.getDocument().childNodes().size());
        assertEquals("head", tb.getDocument().childNode(0).nodeName());
        assertEquals("script", tb.getDocument().childNode(1).nodeName());
    }

    @Test
    public void testAfterHeadAnythingElseHandlesMissingBody() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag pTag = new Token.StartTag("p");
        // anythingElse inserts "<body>" and then reprocesses the token "<p>".
        assertTrue(tb.state().process(pTag, tb));
        // The state becomes InBody.
        assertEquals(TreeBuilderState.InBody, tb.state());
        // head, body, p.
        assertEquals(3, tb.getDocument().childNodes().size());
        assertEquals("body", tb.getDocument().childNode(1).nodeName());
    }

    // Adding tests for InBody state
    @Test
    public void testInBodyIgnoresNullStringCharacter() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.Character nullCharToken = new Token.Character(String.valueOf('\u0000'));
        // The spec says: if (c.getData().equals(nullString)) { tb.error(this); return false; }
        assertFalse(tb.state().process(nullCharToken, tb));
        assertEquals(TreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInBodyHandlesWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        // Whitespace is inserted as a TextNode. framesetOk should be false.
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof TextNode);
        assertEquals(" ", ((TextNode) tb.getDocument().childNodes().get(0)).getWholeText());
        assertFalse(tb.framesetOk());
    }


    @Test
    public void testInBodyHandlesHtmlStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag htmlTag = new Token.StartTag("html");
        htmlTag.attributes.put("lang", "en");
        assertTrue(tb.state().process(htmlTag, tb));
        // The spec says to merge attributes onto the existing html element. The state remains InBody.
        assertEquals(TreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
        assertEquals("en", tb.getDocument().childNode(0).attr("lang"));
    }

    @Test
    public void testInBodyHandlesBodyStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag bodyTag = new Token.StartTag("body");
        bodyTag.attributes.put("id", "main");
        assertTrue(tb.state().process(bodyTag, tb));
        // The spec says to merge attributes onto the existing body element. framesetOk becomes false.
        assertEquals(TreeBuilderState.InBody, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // html, body
        assertEquals("body", tb.getDocument().childNode(1).nodeName());
        assertEquals("main", tb.getDocument().childNode(1).attr("id"));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesPStartTagWhenInButtonScope() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        // Simulate being in a button scope. The spec says if in button scope, <p> is ignored and not inserted.
        tb.push(new Element(Tag.valueOf("button"), tb.getBaseUri()));
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(tb.state().process(pTag, tb));
        // The spec for InBody.StartTag.p says: if (tb.inButtonScope("p")) { tb.process(new Token.EndTag("p")); } else { tb.insert(startTag); }
        // Since "p" is not in button scope, it should insert a new <p>.
        assertEquals(3, tb.getStack().size()); // html, button, p
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesH1StartTagWhenInP() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        tb.insert(new Element(Tag.valueOf("p"), tb.getBaseUri())); // Add a <p> element
        Token.StartTag h1Tag = new Token.StartTag("h1");
        assertTrue(tb.state().process(h1Tag, tb));
        // If current element is h1, pop it. Then insert the new h1.
        // The logic is: if (StringUtil.in(tb.currentElement().nodeName(), "h1", "h2", "h3", "h4", "h5", "h6")) { tb.error(this); tb.pop(); } tb.insert(startTag);
        // Since current element is "p", this logic doesn't apply. The <p> is not implicitly closed.
        assertEquals(3, tb.getStack().size()); // html, p, h1
        assertEquals("h1", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesFormStartTagWhenFormExists() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Element form = tb.insert(new Token.StartTag("form"));
        tb.setFormElement(form);
        Token.StartTag anotherFormTag = new Token.StartTag("form");
        // The spec says: if (tb.getFormElement() != null) { tb.error(this); return false; }
        assertFalse(tb.state().process(anotherFormTag, tb));
        assertEquals(TreeBuilderState.InBody, tb.state());
        assertEquals(form, tb.getFormElement());
    }

    @Test
    public void testInBodyHandlesLiStartTagWhenInP() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag pTag = new Token.StartTag("p");
        Token.StartTag liTag = new Token.StartTag("li");
        tb.state().process(pTag, tb); // Insert <p>
        // InBody.StartTag.li: if (tb.inButtonScope("p")) { tb.process(new Token.EndTag("p")); } tb.insert(startTag);
        // Since <p> is not in button scope, it should just insert <li>.
        assertTrue(tb.state().process(liTag, tb));
        assertEquals(3, tb.getStack().size()); // html, p, li
        assertEquals("li", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesAStartTagWhenAExistsInActiveFormatting() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Element existingA = tb.insert(new Token.StartTag("a"));
        tb.pushActiveFormattingElements(existingA);
        Token.StartTag newATag = new Token.StartTag("a");
        // InBody.StartTag.a: if (tb.getActiveFormattingElement("a") != null) { tb.error(this); tb.process(new Token.EndTag("a")); ... tb.removeFromStack(remainingA); } tb.reconstructFormattingElements(); tb.insert(startTag); tb.pushActiveFormattingElements(a);
        assertTrue(tb.state().process(newATag, tb));
        // It should close the existing 'a', remove it from stack and active formatting, then insert the new 'a'.
        assertEquals(2, tb.getStack().size()); // html, a (new one)
        assertEquals("a", tb.currentElement().nodeName());
        assertNull(tb.getActiveFormattingElement("a")); // Should be removed from active formatting
    }

    @Test
    public void testInBodyHandlesStrongStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag strongTag = new Token.StartTag("strong");
        assertTrue(tb.state().process(strongTag, tb));
        // It inserts the strong tag and pushes it to active formatting elements.
        assertEquals(2, tb.getStack().size()); // html, strong
        assertEquals("strong", tb.currentElement().nodeName());
        assertTrue(tb.isInActiveFormattingElements(tb.currentElement()));
    }

    @Test
    public void testInBodyHandlesTableStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag tableTag = new Token.StartTag("table");
        assertTrue(tb.state().process(tableTag, tb));
        // State transitions to InTable. framesetOk becomes false.
        assertEquals(TreeBuilderState.InTable, tb.state());
        assertEquals(2, tb.getStack().size()); // html, table
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesInputStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag inputTag = new Token.StartTag("input");
        inputTag.attributes.put("type", "text");
        assertTrue(tb.state().process(inputTag, tb));
        // Input tags are inserted as empty elements. framesetOk becomes false.
        assertEquals(2, tb.getStack().size()); // html, input
        assertEquals("input", tb.currentElement().nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesHrStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag hrTag = new Token.StartTag("hr");
        assertTrue(tb.state().process(hrTag, tb));
        // hr is inserted as an empty element. framesetOk becomes false.
        assertEquals(2, tb.getStack().size()); // html, hr
        assertEquals("hr", tb.currentElement().nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesEndBodyTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.EndTag bodyTag = new Token.EndTag("body");
        assertTrue(tb.state().process(bodyTag, tb));
        // State transitions to AfterBody. The body element is closed.
        assertEquals(TreeBuilderState.AfterBody, tb.state());
        // Only the html element should remain on the stack.
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testInBodyHandlesEndHtmlTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.EndTag htmlTag = new Token.EndTag("html");
        // Processing an end tag "html" in InBody state:
        // 1. It first processes the end tag "body" (implicitly). This transitions to AfterBody.
        // 2. Then, it reprocesses the end tag "html" in AfterBody state, which transitions to AfterAfterBody.
        assertTrue(tb.state().process(htmlTag, tb));
        assertEquals(TreeBuilderState.AfterAfterBody, tb.state());
        // Only the html element should remain on the stack.
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testInBodyHandlesDivEndTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        // Insert a div element.
        tb.insert(new Element(Tag.valueOf("div"), tb.getBaseUri()));
        Token.EndTag divTag = new Token.EndTag("div");
        assertTrue(tb.state().process(divTag, tb));
        // The div element should be closed and popped from the stack.
        assertEquals(1, tb.getStack().size()); // html
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesPEndTagWhenNotInButtonScope() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag pTag = new Token.StartTag("p");
        Token.EndTag pTagEnd = new Token.EndTag("p");
        tb.state().process(pTag, tb); // Insert <p>
        // InBody.EndTag.p: if (!tb.inButtonScope(name)) { tb.error(this); tb.process(new Token.StartTag(name)); return tb.process(endTag); }
        // Since "p" is not in button scope, it will error, insert a new empty <p></p>, and then process the end tag for that new <p>.
        assertTrue(tb.state().process(pTagEnd, tb));
        assertEquals(2, tb.getStack().size()); // html, p
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesAEndTagWithActiveFormatting() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Element aTag = new Element(Tag.valueOf("a"), tb.getBaseUri());
        tb.insert(aTag);
        tb.pushActiveFormattingElements(aTag);
        Token.EndTag endATag = new Token.EndTag("a");
        // InBody.EndTag.a: handles adoption agency algorithm. If the element is on the stack and in scope, it's closed.
        assertTrue(tb.state().process(endATag, tb));
        // The 'a' tag should be closed and popped. It should also be removed from active formatting elements.
        assertEquals(1, tb.getStack().size()); // html
        assertEquals("html", tb.currentElement().nodeName());
        assertNull(tb.getActiveFormattingElement("a"));
    }

    @Test
    public void testInBodyHandlesUnsupportedEndTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.EndTag sarcasmTag = new Token.EndTag("sarcasm");
        // The spec says: else { return anyOtherEndTag(t, tb); }
        // anyOtherEndTag iterates up the stack looking for a matching tag. If not found, it errors and returns true.
        assertTrue(tb.state().process(sarcasmTag, tb));
        // Since there's no matching tag on the stack, it will error but return true. Stack remains.
        assertEquals(1, tb.getStack().size()); // html
        assertEquals("html", tb.currentElement().nodeName());
    }
}
