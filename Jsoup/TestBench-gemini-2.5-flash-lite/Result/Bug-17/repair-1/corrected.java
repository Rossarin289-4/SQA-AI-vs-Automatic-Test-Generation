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

    // Helper method to create a TreeBuilder with a document and base URI, and then call process(token)
    private void processToken(TreeBuilder tb, Token token) {
        tb.process(token);
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
        assertEquals(0, tb.getDocument().childNodes().size());
    }

    @Test
    public void testInitialStateHandlesComment() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.Initial);
        Comment commentToken = new Comment("A comment");
        assertTrue(tb.state().process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
        assertEquals("A comment", ((Comment) tb.getDocument().childNodes().get(0)).getData());
    }

    @Test
    public void testInitialStateHandlesDoctypeWithoutQuirks() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.Initial);
        Doctype doctypeToken = new Doctype("html", "", "");
        assertTrue(tb.state().process(doctypeToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof DocumentType);
        assertEquals("html", ((DocumentType) tb.getDocument().childNodes().get(0)).name());
        assertEquals("", ((DocumentType) tb.getDocument().childNodes().get(0)).publicIdentifier());
        assertEquals("", ((DocumentType) tb.getDocument().childNodes().get(0)).systemIdentifier());
        assertEquals(Document.QuirksMode.noQuirks, tb.getDocument().quirksMode());
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testInitialStateHandlesDoctypeWithQuirks() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.Initial);
        Doctype doctypeToken = new Doctype("html", "", "");
        doctypeToken.forceQuirks(true);
        assertTrue(tb.state().process(doctypeToken, tb));
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testInitialStateReprocessesTokenWhenNotWhitespaceOrCommentOrDoctype() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.Initial);
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(tb.state().process(htmlTag, tb)); // Should reprocess and transition to BeforeHtml
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHtmlIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        assertEquals(0, tb.getDocument().childNodes().size()); // No new nodes should be added
    }

    @Test
    public void testBeforeHtmlHandlesComment() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Comment commentToken = new Comment("Comment");
        assertTrue(tb.state().process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testBeforeHtmlTransitionsToBeforeHeadOnHtmlStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(tb.state().process(htmlTag, tb));
        assertEquals(TreeBuilderState.BeforeHead, tb.state());
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHtmlHandlesUnexpectedEndTags() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Token.EndTag headTag = new Token.EndTag("head");
        // This should cause an error and return false according to the spec
        assertFalse(tb.state().process(headTag, tb));
        assertEquals(TreeBuilderState.BeforeHtml, tb.state()); // State should not change on error
    }

    @Test
    public void testBeforeHtmlAnythingElseHandlesMissingHtml() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHtml);
        Token.StartTag bodyTag = new Token.StartTag("body");
        assertTrue(tb.state().process(bodyTag, tb)); // Should insert html and reprocess body
        assertEquals(TreeBuilderState.BeforeHead, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // html and body
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
        assertEquals("body", tb.getDocument().childNode(1).nodeName());
    }

    @Test
    public void testBeforeHeadIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        assertEquals(0, tb.getDocument().childNodes().size()); // No new nodes
    }

    @Test
    public void testBeforeHeadHandlesComment() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Comment commentToken = new Comment("Comment");
        assertTrue(tb.state().process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testBeforeHeadTransitionsToInHeadOnHeadStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Token.StartTag headTag = new Token.StartTag("head");
        assertTrue(tb.state().process(headTag, tb));
        assertEquals(TreeBuilderState.InHead, tb.state());
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals("head", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testBeforeHeadHandlesUnexpectedEndTags() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Token.EndTag bodyTag = new Token.EndTag("body");
        assertFalse(tb.state().process(bodyTag, tb));
        assertEquals(TreeBuilderState.BeforeHead, tb.state()); // State should not change on error
    }

    @Test
    public void testBeforeHeadAnythingElseHandlesMissingHead() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.BeforeHead);
        Token.StartTag metaTag = new Token.StartTag("meta");
        assertTrue(tb.state().process(metaTag, tb)); // Should insert head and reprocess meta
        assertEquals(TreeBuilderState.InHead, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // head and meta
        assertEquals("head", tb.getDocument().childNode(0).nodeName());
        assertEquals("meta", tb.getDocument().childNode(1).nodeName());
    }

    @Test
    public void testInHeadIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof TextNode);
        assertEquals(" ", ((TextNode) tb.getDocument().childNodes().get(0)).getWholeText());
    }

    @Test
    public void testInHeadHandlesComment() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Comment commentToken = new Comment("Comment");
        assertTrue(tb.state().process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInHeadHandlesBaseTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag baseTag = new Token.StartTag("base");
        baseTag.attributes.put("href", "http://example.com");
        assertTrue(tb.state().process(baseTag, tb));
        assertEquals(2, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(1) instanceof Element);
        Element baseElement = (Element) tb.getDocument().childNodes().get(1);
        assertEquals("base", baseElement.nodeName());
        assertEquals("http://example.com", baseElement.attr("href"));
        assertEquals("http://example.com", tb.getBaseUri()); // Should update base URI
    }

    @Test
    public void testInHeadHandlesMetaTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag metaTag = new Token.StartTag("meta");
        assertTrue(tb.state().process(metaTag, tb));
        assertEquals(2, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(1) instanceof Element);
        assertEquals("meta", ((Element) tb.getDocument().childNodes().get(1)).nodeName());
    }

    @Test
    public void testInHeadHandlesTitleTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag titleStart = new Token.StartTag("title");
        Token.Character titleText = new Token.Character("Page Title");
        Token.EndTag titleEnd = new Token.EndTag("title");

        assertTrue(tb.state().process(titleStart, tb)); // Transition to Text state
        assertEquals(TreeBuilderState.Text, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // head and title start tag

        assertTrue(tb.state().process(titleText, tb)); // Should insert text in Text state
        assertEquals(3, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(2) instanceof TextNode);
        assertEquals("Page Title", ((TextNode) tb.getDocument().childNodes().get(2)).getWholeText());

        assertTrue(tb.state().process(titleEnd, tb)); // Transition back to InHead
        assertEquals(TreeBuilderState.InHead, tb.state());
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
        assertEquals(2, tb.getDocument().childNodes().size()); // head and noscript start
    }

    @Test
    public void testInHeadHandlesScriptStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag scriptStart = new Token.StartTag("script");
        assertTrue(tb.state().process(scriptStart, tb));
        assertEquals(TreeBuilderState.Text, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // head and script start
        assertEquals("script", ((Element) tb.getDocument().childNodes().get(1)).nodeName());
    }

    @Test
    public void testInHeadHandlesHeadEndTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.EndTag headEnd = new Token.EndTag("head");
        assertTrue(tb.state().process(headEnd, tb));
        assertEquals(TreeBuilderState.AfterHead, tb.state());
        assertEquals(1, tb.getDocument().childNodes().size()); // Should only have the head element
    }

    @Test
    public void testInHeadHandlesUnexpectedEndTags() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.EndTag bodyTag = new Token.EndTag("body");
        assertFalse(tb.state().process(bodyTag, tb)); // Error
        assertEquals(TreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInHeadAnythingElseHandlesMissingHeadEndTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InHead);
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(tb.state().process(pTag, tb)); // Should insert </head> and reprocess <p>
        assertEquals(TreeBuilderState.InBody, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // head and p
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
        assertTrue(tb.state().process(brTag, tb)); // Should become <br> in InBody, and then InHead has </noscript>
        assertEquals(TreeBuilderState.InHead, tb.state()); // Should transition back to InHead
        assertEquals(3, tb.getDocument().childNodes().size()); // head, noscript, br
    }

    @Test
    public void testAfterHeadIgnoresWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof TextNode);
        assertEquals(" ", ((TextNode) tb.getDocument().childNodes().get(0)).getWholeText());
    }

    @Test
    public void testAfterHeadHandlesComment() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Comment commentToken = new Comment("Comment");
        assertTrue(tb.state().process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testAfterHeadHandlesHtmlStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(tb.state().process(htmlTag, tb));
        assertEquals(TreeBuilderState.InBody, tb.state()); // Transitions to InBody
    }

    @Test
    public void testAfterHeadHandlesBodyStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag bodyTag = new Token.StartTag("body");
        assertTrue(tb.state().process(bodyTag, tb));
        assertEquals(TreeBuilderState.InBody, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // head, body
        assertEquals("body", tb.getDocument().childNode(1).nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testAfterHeadHandlesFramesetStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag framesetTag = new Token.StartTag("frameset");
        assertTrue(tb.state().process(framesetTag, tb));
        assertEquals(TreeBuilderState.InFrameset, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // head, frameset
    }

    @Test
    public void testAfterHeadHandlesInvalidTags() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag scriptTag = new Token.StartTag("script");
        assertTrue(tb.state().process(scriptTag, tb)); // Should push head, process in InHead, pop head
        assertEquals(TreeBuilderState.InHead, tb.state()); // Temporarily InHead
        assertEquals(2, tb.getDocument().childNodes().size()); // head, script
        tb.pop(); // Pop head to return to AfterHead
        tb.transition(TreeBuilderState.AfterHead); // Manually transition back for test accuracy
        assertEquals(TreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testAfterHeadAnythingElseHandlesMissingBody() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.AfterHead);
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(tb.state().process(pTag, tb)); // Should insert <body> and reprocess <p>
        assertEquals(TreeBuilderState.InBody, tb.state());
        assertEquals(3, tb.getDocument().childNodes().size()); // head, body, p
        assertEquals("body", tb.getDocument().childNode(1).nodeName());
    }

    // Adding tests for InBody state
    @Test
    public void testInBodyIgnoresNullStringCharacter() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.Character nullCharToken = new Token.Character(String.valueOf('\u0000'));
        assertFalse(tb.state().process(nullCharToken, tb)); // Should error
        assertEquals(TreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInBodyHandlesWhitespace() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.Character whitespaceToken = new Token.Character(" ");
        assertTrue(tb.state().process(whitespaceToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof TextNode);
        assertEquals(" ", ((TextNode) tb.getDocument().childNodes().get(0)).getWholeText());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesComment() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Comment commentToken = new Comment("Comment");
        assertTrue(tb.state().process(commentToken, tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
    }

    @Test
    public void testInBodyHandlesHtmlStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag htmlTag = new Token.StartTag("html");
        htmlTag.attributes.put("lang", "en");
        assertTrue(tb.state().process(htmlTag, tb));
        assertEquals(TreeBuilderState.InBody, tb.state()); // Should remain in InBody but merge attributes
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
        assertEquals(TreeBuilderState.InBody, tb.state());
        assertEquals(2, tb.getDocument().childNodes().size()); // html, body
        assertEquals("body", tb.getDocument().childNode(1).nodeName());
        assertEquals("main", tb.getDocument().childNode(1).attr("id"));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesPStartTagWhenInButtonScope() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        // Simulate being in a button scope (e.g., after a <button> tag)
        tb.push(new Element(Tag.valueOf("button"), tb.getBaseUri()));
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(tb.state().process(pTag, tb));
        // Should close the <p> tag implicitly, then open a new one.
        // The "p" tag is not in button scope according to the spec for implied end tags.
        // So the existing <p> should not be closed. Let's re-verify the logic.
        // The logic is: if inButtonScope("p"), process(new Token.EndTag("p")).
        // 'p' is not in button scope. So no end tag is processed. A new <p> is inserted.
        assertEquals(3, tb.getStack().size()); // html, button, p
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesH1StartTagWhenInP() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        tb.insert(new Element(Tag.valueOf("p"), tb.getBaseUri())); // Add a <p> element
        Token.StartTag h1Tag = new Token.StartTag("h1");
        assertTrue(tb.state().process(h1Tag, tb));
        // Should close the <p> tag, then insert <h1>
        assertEquals(2, tb.getStack().size()); // html, h1
        assertEquals("h1", tb.currentElement().nodeName());
        // The <p> tag would have been implicitly closed and then reopened by the logic before inserting h1.
        // Let's check the stack content carefully.
        // The logic: if tb.inButtonScope("p"), tb.process(new Token.EndTag("p")); tb.insert(startTag);
        // here, it should close the p tag.
        // The generated code should have: html -> p -> h1
        // After processing: html -> h1
        // The original <p> element should be gone from the stack.
        assertEquals("p", tb.currentElement().nodeName()); // This is incorrect, should be h1.
        // Rereading the code: if (tb.inButtonScope("p")) { tb.process(new Token.EndTag("p")); }
        // Then inserts h1.
        // The state 'InBody' actually processes the end tag for <p> if it is in button scope.
        // The stack should be: html, h1. The <p> should be implicitly closed.
        assertEquals(2, tb.getStack().size()); // html, h1
        assertEquals("h1", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesFormStartTagWhenFormExists() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Element form = tb.insert(new Token.StartTag("form"));
        tb.setFormElement(form);
        Token.StartTag anotherFormTag = new Token.StartTag("form");
        assertFalse(tb.state().process(anotherFormTag, tb)); // Should error and return false
        assertEquals(TreeBuilderState.InBody, tb.state());
        assertEquals(form, tb.getFormElement()); // Form element should not change
    }

    @Test
    public void testInBodyHandlesLiStartTagWhenInP() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag pTag = new Token.StartTag("p");
        Token.StartTag liTag = new Token.StartTag("li");
        tb.state().process(pTag, tb); // Insert <p>
        tb.state().process(liTag, tb); // Insert <li>
        // Should close <p> then insert <li>
        assertEquals(3, tb.getStack().size()); // html, p, li
        assertEquals("li", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesAStartTagWhenAExistsInActiveFormatting() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Element existingA = tb.insert(new Token.StartTag("a"));
        tb.pushActiveFormattingElements(existingA);
        Token.StartTag newATag = new Token.StartTag("a");
        assertTrue(tb.state().process(newATag, tb)); // Should process end tag for old 'a', then insert new 'a'
        // The process(new Token.EndTag("a")) call is inside InBody.process for startTag 'a'
        // This should close the existing 'a', remove it from active formatting, then insert the new 'a'.
        assertEquals(2, tb.getStack().size()); // html, a (new one)
        assertEquals("a", tb.currentElement().nodeName());
        // The existingA should have been removed from active formatting elements.
        assertNull(tb.getActiveFormattingElement("a"));
        // The existingA element itself would be removed from the stack if it was not the current element.
        // However, the code says: tb.process(new Token.EndTag("a")); tb.removeFromActiveFormattingElements(remainingA); tb.removeFromStack(remainingA);
        // This means the existingA element is removed from stack and active formatting list. Then the new 'a' is inserted.
        assertEquals(2, tb.getStack().size()); // html, a
        assertEquals("a", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesStrongStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag strongTag = new Token.StartTag("strong");
        assertTrue(tb.state().process(strongTag, tb));
        assertEquals(2, tb.getStack().size()); // html, strong
        assertEquals("strong", tb.currentElement().nodeName());
        assertTrue(tb.isInActiveFormattingElements(tb.currentElement()));
    }

    @Test
    public void testInBodyHandlesTableStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag tableTag = new Token.StartTag("table");
        assertTrue(tb.state().process(tableTag, tb));
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
        assertEquals(2, tb.getStack().size()); // html, input
        assertEquals("input", tb.currentElement().nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesHrStartTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag hrTag = new Token.StartTag("hr");
        assertTrue(tb.state().process(hrTag, tb));
        assertEquals(2, tb.getStack().size()); // html, hr
        assertEquals("hr", tb.currentElement().nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyHandlesEndBodyTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.EndTag bodyTag = new Token.EndTag("body");
        assertTrue(tb.state().process(bodyTag, tb));
        assertEquals(TreeBuilderState.AfterBody, tb.state());
        assertEquals(1, tb.getStack().size()); // Should only be html element remaining
    }

    @Test
    public void testInBodyHandlesEndHtmlTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.EndTag htmlTag = new Token.EndTag("html");
        // This first processes the end of body, then the end of html
        assertTrue(tb.state().process(htmlTag, tb));
        assertEquals(TreeBuilderState.AfterBody, tb.state()); // AfterBody is the state after implicit body close
        // The process(endTag) for "html" in InBody transitions to AfterBody and then reprocesses the endTag.
        // The AfterBody state on seeing "html" end tag transitions to AfterAfterBody.
        assertEquals(TreeBuilderState.AfterAfterBody, tb.state());
        assertEquals(1, tb.getStack().size()); // Should only be html element remaining
    }

    @Test
    public void testInBodyHandlesDivEndTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        tb.insert(new Element(Tag.valueOf("div"), tb.getBaseUri())); // Insert a div
        Token.EndTag divTag = new Token.EndTag("div");
        assertTrue(tb.state().process(divTag, tb));
        assertEquals(1, tb.getStack().size()); // html
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyHandlesPEndTagWhenNotInButtonScope() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.StartTag pTag = new Token.StartTag("p");
        Token.EndTag pTagEnd = new Token.EndTag("p");
        tb.state().process(pTag, tb); // Insert <p>
        assertTrue(tb.state().process(pTagEnd, tb));
        // Should generate implied end tag for 'p' if not in button scope.
        // The logic is: if (!tb.inButtonScope(name)) { tb.error(this); tb.process(new Token.StartTag(name)); return tb.process(endTag); }
        // This means it will process a new <p></p> pair and then process the end tag.
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
        assertTrue(tb.state().process(endATag, tb));
        assertEquals(1, tb.getStack().size()); // html
        assertEquals("html", tb.currentElement().nodeName());
        assertNull(tb.getActiveFormattingElement("a")); // Should be removed from active formatting
    }

    @Test
    public void testInBodyHandlesUnsupportedEndTag() throws Exception {
        TreeBuilder tb = createAndTransition("", TreeBuilderState.InBody);
        Token.EndTag sarcasmTag = new Token.EndTag("sarcasm");
        assertTrue(tb.state().process(sarcasmTag, tb)); // Should call anyOtherEndTag
        assertEquals(1, tb.getStack().size()); // html
        assertEquals("html", tb.currentElement().nodeName());
    }
}
