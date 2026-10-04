package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HtmlTreeBuilderTest {

    // Helper method to initialize HtmlTreeBuilder for testing
    private HtmlTreeBuilder getTreeBuilder(String input, String baseUri, ParseErrorList errors) {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(input, baseUri, errors);
        return tb;
    }

    @Test
    public void testParseFragmentWithContext() throws Exception {
        String html = "<div><p><span></span></p></div>";
        Document doc = new Document("");
        Element context = new Element(Tag.valueOf("div"), "");
        doc.appendChild(context);
        ParseErrorList errors = new ParseErrorList(10, 10);
        List<Node> nodes = new HtmlTreeBuilder().parseFragment(html, context, "", errors);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("div", nodes.get(0).nodeName());
        assertEquals(1, nodes.get(0).childNodes().size());
        assertTrue(nodes.get(0).childNodes().get(0) instanceof Element);
        assertEquals("p", nodes.get(0).childNodes().get(0).nodeName());
    }

    @Test
    public void testParseFragmentWithNullContext() throws Exception {
        String html = "<div><p><span></span></p></div>";
        ParseErrorList errors = new ParseErrorList(10, 10);
        List<Node> nodes = new HtmlTreeBuilder().parseFragment(html, null, "", errors);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("div", nodes.get(0).nodeName());
    }

    @Test
    public void testInsertStartTag() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.transition(HtmlTreeBuilderState.InBody);
        Element div = tb.insert(new Token.StartTag("div"));
        assertEquals("div", div.tagName());
        assertTrue(tb.getStack().contains(div));
        assertEquals(div, tb.currentElement());
    }

    @Test
    public void testInsertStartTagWithName() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.transition(HtmlTreeBuilderState.InBody);
        Element p = tb.insert("p");
        assertEquals("p", p.tagName());
        assertTrue(tb.getStack().contains(p));
        assertEquals(p, tb.currentElement());
    }

    @Test
    public void testInsertComment() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.transition(HtmlTreeBuilderState.InBody);
        Element div = tb.insert(new Token.StartTag("div"));
        tb.insert(new Token.Comment("some comment"));
        assertEquals(1, div.childNodes().size());
        assertTrue(div.childNodes().get(0) instanceof Comment);
        assertEquals("some comment", ((Comment) div.childNodes().get(0)).getData());
    }

    @Test
    public void testInsertCharacterToken() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.transition(HtmlTreeBuilderState.InBody);
        Element div = tb.insert(new Token.StartTag("div"));
        tb.insert(new Token.Character("hello"));
        assertEquals(1, div.childNodes().size());
        assertTrue(div.childNodes().get(0) instanceof TextNode);
        assertEquals("hello", ((TextNode) div.childNodes().get(0)).text());
    }

    @Test
    public void testInsertEmptyKnownSelfClosingTag() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag brTag = new Token.StartTag("br").setSelfClosing();
        Element br = tb.insertEmpty(brTag);
        assertEquals("br", br.tagName());
        assertTrue(br.tag().isSelfClosing());
        // Self-closing tags are inserted, but not pushed onto the stack if they are handled as empty.
        // Based on insertEmpty, it doesn't push to stack.
        assertFalse(tb.getStack().contains(br));
    }

    @Test
    public void testInsertEmptyUnknownSelfClosingTag() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag unknownTag = new Token.StartTag("unknown").setSelfClosing();
        Element unknown = tb.insertEmpty(unknownTag);
        assertEquals("unknown", unknown.tagName());
        assertTrue(unknown.tag().isSelfClosing());
        assertFalse(tb.getStack().contains(unknown));
    }

    @Test
    public void testPop() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = tb.insert(new Token.StartTag("div"));
        Element p = tb.insert(new Token.StartTag("p"));
        Element popped = tb.pop();
        assertEquals(p, popped);
        assertEquals(div, tb.currentElement());
    }

    @Test
    public void testPush() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = tb.insert(new Token.StartTag("div"));
        Element p = new Element(Tag.valueOf("p"), "");
        tb.push(p);
        assertEquals(p, tb.currentElement());
        assertTrue(tb.getStack().contains(p));
    }

    @Test
    public void testOnStack() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = tb.insert(new Token.StartTag("div"));
        Element p = tb.insert(new Token.StartTag("p"));
        assertTrue(tb.onStack(div));
        assertTrue(tb.onStack(p));
        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(tb.onStack(span));
    }

    @Test
    public void testGetFromStack() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = tb.insert(new Token.StartTag("div"));
        Element p = tb.insert(new Token.StartTag("p"));
        assertEquals(p, tb.getFromStack("p"));
        assertEquals(div, tb.getFromStack("div"));
        assertNull(tb.getFromStack("span"));
    }

    @Test
    public void testRemoveFromStack() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = tb.insert(new Token.StartTag("div"));
        Element p = tb.insert(new Token.StartTag("p"));
        assertTrue(tb.removeFromStack(p));
        assertFalse(tb.getStack().contains(p));
        assertEquals(div, tb.currentElement());
        assertTrue(tb.removeFromStack(div));
        assertFalse(tb.getStack().contains(div));
    }

    @Test
    public void testPopStackToCloseString() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element body = tb.insert("body");
        Element div = tb.insert("div");
        tb.popStackToClose("body");
        assertEquals(2, tb.getStack().size());
        assertTrue(tb.getStack().contains(html));
        assertTrue(tb.getStack().contains(body));
        assertEquals(body, tb.currentElement());
    }

    @Test
    public void testPopStackToCloseMultipleStrings() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element body = tb.insert("body");
        Element div = tb.insert("div");
        Element p = tb.insert("p");
        tb.popStackToClose("div", "p");
        assertEquals(3, tb.getStack().size());
        assertTrue(tb.getStack().contains(html));
        assertTrue(tb.getStack().contains(body));
        assertTrue(tb.getStack().contains(div));
        assertEquals(div, tb.currentElement());
    }

    @Test
    public void testPopStackToBefore() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element body = tb.insert("body");
        Element div = tb.insert("div");
        Element p = tb.insert("p");
        tb.popStackToBefore("body");
        assertEquals(2, tb.getStack().size());
        assertTrue(tb.getStack().contains(html));
        assertTrue(tb.getStack().contains(body));
        assertEquals(body, tb.currentElement());
    }

    @Test
    public void testClearStackToTableContext() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element table = tb.insert("table");
        Element tbody = tb.insert("tbody");
        Element tr = tb.insert("tr");
        tb.clearStackToTableContext();
        assertEquals(2, tb.getStack().size());
        assertTrue(tb.getStack().contains(html));
        assertTrue(tb.getStack().contains(table));
        assertEquals(table, tb.currentElement());
    }

    @Test
    public void testClearStackToTableBodyContext() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element table = tb.insert("table");
        Element tbody = tb.insert("tbody");
        Element tr = tb.insert("tr");
        tb.clearStackToTableBodyContext();
        assertEquals(3, tb.getStack().size());
        assertTrue(tb.getStack().contains(html));
        assertTrue(tb.getStack().contains(table));
        assertTrue(tb.getStack().contains(tbody));
        assertEquals(tbody, tb.currentElement());
    }

    @Test
    public void testClearStackToTableRowContext() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element table = tb.insert("table");
        Element tbody = tb.insert("tbody");
        Element tr = tb.insert("tr");
        Element td = tb.insert("td");
        tb.clearStackToTableRowContext();
        assertEquals(4, tb.getStack().size());
        assertTrue(tb.getStack().contains(html));
        assertTrue(tb.getStack().contains(table));
        assertTrue(tb.getStack().contains(tbody));
        assertTrue(tb.getStack().contains(tr));
        assertEquals(tr, tb.currentElement());
    }

    @Test
    public void testAboveOnStack() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = tb.insert("div");
        Element p = tb.insert("p");
        Element span = tb.insert("span");
        assertEquals(p, tb.aboveOnStack(span));
        assertEquals(div, tb.aboveOnStack(p));
        assertNull(tb.aboveOnStack(div));
    }

    @Test
    public void testInsertOnStackAfter() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = tb.insert("div");
        Element p = tb.insert("p");
        Element span = new Element(Tag.valueOf("span"), "");
        tb.insertOnStackAfter(p, span);
        assertEquals(3, tb.getStack().size());
        assertEquals(div, tb.getStack().get(0));
        assertEquals(p, tb.getStack().get(1));
        assertEquals(span, tb.getStack().get(2));
    }

    @Test
    public void testReplaceOnStack() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = tb.insert("div");
        Element p = tb.insert("p");
        Element span = new Element(Tag.valueOf("span"), "");
        tb.replaceOnStack(p, span);
        assertEquals(2, tb.getStack().size());
        assertEquals(div, tb.getStack().get(0));
        assertEquals(span, tb.getStack().get(1));
    }

    @Test
    public void testResetInsertionModeInSelect() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element select = tb.insert("select");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionModeInCell() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element td = tb.insert("td");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionModeInRow() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element tr = tb.insert("tr");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionModeInTableBody() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element tbody = tb.insert("tbody");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testResetInsertionModeInCaption() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element caption = tb.insert("caption");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionModeInColumnGroup() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element colgroup = tb.insert("colgroup");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionModeInTable() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element table = tb.insert("table");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionModeInHead() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element head = tb.insert("head");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionModeInBody() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element body = tb.insert("body");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionModeInFrameset() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element frameset = tb.insert("frameset");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testResetInsertionModeInHtml() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testResetInsertionModeInBodyFragment() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        // Simulating fragment parsing context
        tb.contextElement = new Element(Tag.valueOf("div"), "");
        tb.fragmentParsing = true;
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInScopeValid() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element body = tb.insert("body");
        assertTrue(tb.inScope("body"));
        assertTrue(tb.inScope("html"));
    }

    @Test
    public void testInScopeInvalid() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element body = tb.insert("body");
        assertFalse(tb.inScope("div"));
    }

    @Test
    public void testInScopeWithExtras() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element table = tb.insert("table");
        Element td = tb.insert("td");
        assertTrue(tb.inScope("td", new String[]{"td"}));
        assertTrue(tb.inScope("html", new String[]{"td"}));
        assertFalse(tb.inScope("div", new String[]{"td"}));
    }

    @Test
    public void testInListItemScope() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element ul = tb.insert("ul");
        Element li = tb.insert("li");
        assertTrue(tb.inListItemScope("li"));
        assertTrue(tb.inListItemScope("ul"));
        assertFalse(tb.inListItemScope("div"));
    }

    @Test
    public void testInButtonScope() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element button = tb.insert("button");
        Element input = tb.insert("input");
        assertTrue(tb.inButtonScope("input"));
        assertTrue(tb.inButtonScope("button"));
        assertFalse(tb.inButtonScope("div"));
    }

    @Test
    public void testInTableScope() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element table = tb.insert("table");
        Element tbody = tb.insert("tbody");
        assertTrue(tb.inTableScope("tbody"));
        assertTrue(tb.inTableScope("table"));
        assertFalse(tb.inTableScope("div"));
    }

    @Test
    public void testInSelectScope() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element select = tb.insert("select");
        Element option = tb.insert("option");
        assertTrue(tb.inSelectScope("option"));
        assertTrue(tb.inSelectScope("select"));
        assertFalse(tb.inSelectScope("div"));
    }

    @Test
    public void testSetHeadElement() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element head = new Element(Tag.valueOf("head"), "");
        tb.setHeadElement(head);
        assertEquals(head, tb.getHeadElement());
    }

    @Test
    public void testSetFosterInserts() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.setFosterInserts(true);
        assertTrue(tb.isFosterInserts());
        tb.setFosterInserts(false);
        assertFalse(tb.isFosterInserts());
    }

    @Test
    public void testSetFormElement() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        tb.setFormElement(form);
        assertEquals(form, tb.getFormElement());
    }

    @Test
    public void testNewPendingTableCharacters() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.newPendingTableCharacters();
        assertTrue(tb.getPendingTableCharacters() instanceof ArrayList);
        assertTrue(tb.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void testSetPendingTableCharacters() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        List<Token.Character> chars = new ArrayList<>();
        chars.add(new Token.Character("a"));
        tb.setPendingTableCharacters(chars);
        assertEquals(chars, tb.getPendingTableCharacters());
    }

    @Test
    public void testGenerateImpliedEndTagsExcludeTag() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element body = tb.insert("body");
        Element p = tb.insert("p");
        Element dd = tb.insert("dd");
        Element dt = tb.insert("dt");
        tb.generateImpliedEndTags("dd");
        assertEquals(4, tb.getStack().size()); // html, body, p, dd
        assertEquals("dd", tb.currentElement().nodeName());
    }

    @Test
    public void testGenerateImpliedEndTagsNoExclude() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element body = tb.insert("body");
        Element p = tb.insert("p");
        Element dd = tb.insert("dd");
        Element dt = tb.insert("dt");
        tb.generateImpliedEndTags();
        assertEquals(3, tb.getStack().size()); // html, body, p
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testIsSpecialKnownTag() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element div = new Element(Tag.valueOf("div"), "");
        assertTrue(tb.isSpecial(div));
        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(tb.isSpecial(span));
    }

    @Test
    public void testIsSpecialUnknownTag() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element unknown = new Element(Tag.valueOf("unknown"), "");
        assertFalse(tb.isSpecial(unknown));
    }

    @Test
    public void testPushActiveFormattingElements() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element a = new Element(Tag.valueOf("a"), "");
        tb.pushActiveFormattingElements(a);
        // Accessing private field for test verification.
        assertEquals(1, tb.formattingElements.size());
        assertEquals(a, tb.formattingElements.peekLast());
    }

    @Test
    public void testReconstructFormattingElements() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));

        // Setup: Add elements to formattingElements that are NOT on the stack
        Element formattingA = new Element(Tag.valueOf("a"), "");
        Element formattingB = new Element(Tag.valueOf("b"), "");
        tb.formattingElements.add(formattingA);
        tb.formattingElements.add(formattingB);

        // Ensure stack is empty or contains elements that should not interfere
        tb.stack.clear();
        tb.stack.add(new Element(Tag.valueOf("html"), ""));

        tb.reconstructFormattingElements();

        // After reconstruction, the elements should be on the stack
        assertEquals(3, tb.getStack().size()); // html, a, b
        assertEquals("a", tb.getStack().get(1).nodeName());
        assertEquals("b", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testClearFormattingElementsToLastMarker() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        tb.formattingElements.add(a);
        tb.formattingElements.add(null); // Marker
        tb.formattingElements.add(b);
        tb.clearFormattingElementsToLastMarker();
        assertEquals(1, tb.formattingElements.size());
        assertEquals(b, tb.formattingElements.peekLast()); // Marker is removed, b remains
    }

    @Test
    public void testRemoveFromActiveFormattingElements() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        tb.formattingElements.add(a);
        tb.formattingElements.add(b);
        tb.removeFromActiveFormattingElements(a);
        assertEquals(1, tb.formattingElements.size());
        assertEquals(b, tb.formattingElements.peekLast());
    }

    @Test
    public void testIsInActiveFormattingElements() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        tb.formattingElements.add(a);
        assertTrue(tb.isInActiveFormattingElements(a));
        assertFalse(tb.isInActiveFormattingElements(b));
    }

    @Test
    public void testGetActiveFormattingElement() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        tb.formattingElements.add(a);
        tb.formattingElements.add(b);
        assertEquals(b, tb.getActiveFormattingElement("b"));
        assertNull(tb.getActiveFormattingElement("c"));
    }

    @Test
    public void testReplaceActiveFormattingElement() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        Element c = new Element(Tag.valueOf("c"), "");
        tb.formattingElements.add(a);
        tb.formattingElements.add(b);
        tb.replaceActiveFormattingElement(b, c);
        assertEquals(2, tb.formattingElements.size());
        assertEquals(a, tb.formattingElements.get(0));
        assertEquals(c, tb.formattingElements.get(1));
    }

    @Test
    public void testInsertMarkerToFormattingElements() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element a = new Element(Tag.valueOf("a"), "");
        tb.formattingElements.add(a);
        tb.insertMarkerToFormattingElements();
        assertEquals(2, tb.formattingElements.size());
        assertNull(tb.formattingElements.peekLast());
    }

    @Test
    public void testInsertInFosterParentWithTable() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        Element html = tb.insert("html");
        Element body = tb.insert("body");
        Element tableElement = new Element(Tag.valueOf("table"), "");
        body.appendChild(tableElement);
        tb.stack.add(tableElement);

        tb.setFosterInserts(true);

        Element nodeToInsert = new Element(Tag.valueOf("p"), "");
        tb.insertNode(nodeToInsert);

        assertEquals(body, nodeToInsert.parent());
    }

    @Test
    public void testInsertInFosterParentFragment() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.fragmentParsing = true;
        tb.setFosterInserts(true);

        Element root = new Element(Tag.valueOf("div"), "");
        tb.doc.appendChild(root);
        tb.stack.add(root);

        Element nodeToInsert = new Element(Tag.valueOf("p"), "");
        tb.insertNode(nodeToInsert);

        assertEquals(root, nodeToInsert.parent());
    }

    @Test
    public void testToString() throws Exception {
        HtmlTreeBuilder tb = getTreeBuilder("test", "", new ParseErrorList(10, 10));
        tb.transition(HtmlTreeBuilderState.InBody);
        Element div = tb.insert(new Token.StartTag("div"));
        String toStringResult = tb.toString();
        assertTrue(toStringResult.contains("state=InBody"));
        assertTrue(toStringResult.contains("currentToken=null"));
        assertTrue(toStringResult.contains("currentElement=div"));
    }
}
