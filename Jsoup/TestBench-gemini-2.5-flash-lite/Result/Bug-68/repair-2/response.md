```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.Connection; // Added for Connection.KeyVal
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jsoup.attributes.Attributes; // Added for Attributes

public class HtmlTreeBuilderTest {

    @Test
    public void testInitialState() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertEquals(HtmlTreeBuilderState.Initial, tb.state());
    }

    @Test
    public void testProcessNullToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.process(null); // Should not throw exception
        assertNotNull(tb.state()); // State should still be valid
    }

    @Test
    public void testProcessCommentToken() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.Comment commentToken = new Token.Comment();
        commentToken.data = "test"; // This is a field, not a method.
        tb.process(commentToken); // This should work.
        assertNotNull(tb.state()); // State should still be valid
    }

    @Test
    public void testTransition() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        HtmlTreeBuilderState newState = HtmlTreeBuilderState.InBody;
        tb.transition(newState);
        assertEquals(newState, tb.state());
    }

    @Test
    public void testMarkAndOriginalState() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InHead, tb.originalState());
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testFramesetOk() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertTrue(tb.framesetOk());
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testGetDocument() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertNotNull(tb.getDocument());
        assertTrue(tb.getDocument() instanceof Document);
    }

    @Test
    public void testGetBaseUri() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        String baseUri = "http://example.com/";
        tb.initialiseParse(new StringReader(""), baseUri, ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertEquals(baseUri, tb.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://initial.com/", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Document doc = tb.getDocument();
        Element baseElement = new Element(Tag.valueOf("base"), "", new Attributes());
        baseElement.attr("href", "http://newbase.com/");
        tb.maybeSetBaseUri(baseElement);
        assertEquals("http://newbase.com/", tb.getBaseUri());
        assertEquals("http://newbase.com/", doc.baseUri());
    }

    @Test
    public void testMaybeSetBaseUri_emptyHref() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        String initialBaseUri = "http://initial.com/";
        tb.initialiseParse(new StringReader(""), initialBaseUri, ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Document doc = tb.getDocument();
        Element baseElement = new Element(Tag.valueOf("base"), "", new Attributes());
        baseElement.attr("href", ""); // Empty href
        tb.maybeSetBaseUri(baseElement);
        assertEquals(initialBaseUri, tb.getBaseUri()); // Base URI should not change
        assertEquals(initialBaseUri, doc.baseUri());
    }
    
    @Test
    public void testIsFragmentParsing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertFalse(tb.isFragmentParsing());
        tb.parseFragment("<a></a>", new Element(Tag.valueOf("div"), ""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertTrue(tb.isFragmentParsing());
    }

    @Test
    public void testErrorReporting() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.noParseError();
        tb.initialiseParse(new StringReader(""), "", errors, ParseSettings.htmlDefault);
        tb.transition(HtmlTreeBuilderState.InBody); // Set a state
        tb.error(HtmlTreeBuilderState.InBody); // Trigger error reporting
        assertTrue(errors.size() > 0);
    }

    @Test
    public void testInsertStartTagSelfClosing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "br";
        startTag.selfClosing = true;
        Element el = tb.insert(startTag);
        assertEquals("br", el.tagName());
        assertTrue(el.tag().isSelfClosing());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagNonSelfClosing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "p";
        startTag.selfClosing = false;
        Element el = tb.insert(startTag);
        assertEquals("p", el.tagName());
        assertFalse(el.tag().isSelfClosing());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagWithAttributes() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "a";
        startTag.attributes.put("href", "http://example.com");
        startTag.attributes.put("id", "link1");
        Element el = tb.insert(startTag);
        assertEquals("a", el.tagName());
        assertEquals("http://example.com", el.attr("href"));
        assertEquals("link1", el.id());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagUnknownTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "customtag";
        startTag.selfClosing = true; 
        Element el = tb.insert(startTag);
        assertEquals("customtag", el.tagName());
        assertTrue(el.tag().isSelfClosing());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagUnknownTagNonSelfClosing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "customtag";
        startTag.selfClosing = false;
        Element el = tb.insert(startTag);
        assertEquals("customtag", el.tagName());
        assertFalse(el.tag().isSelfClosing());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagKnownVoidTagNotSelfClosing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "img"; 
        startTag.selfClosing = false;
        Element el = tb.insert(startTag); 
        assertEquals("img", el.tagName());
        assertFalse(el.tag().isSelfClosing()); 
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagKnownVoidTagSelfClosing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "img"; 
        startTag.selfClosing = true;
        Element el = tb.insert(startTag);
        assertEquals("img", el.tagName());
        assertTrue(el.tag().isSelfClosing()); 
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagKnownNonVoidTagSelfClosing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "div"; 
        startTag.selfClosing = true;
        Element el = tb.insert(startTag); 
        assertEquals("div", el.tagName());
        assertFalse(el.tag().isSelfClosing());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagKnownNonVoidTagNotSelfClosing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "div";
        startTag.selfClosing = false;
        Element el = tb.insert(startTag);
        assertEquals("div", el.tagName());
        assertFalse(el.tag().isSelfClosing());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagWithName() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el = tb.insertStartTag("span");
        assertEquals("span", el.tagName());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element parent = new Element(Tag.valueOf("div"), "", new Attributes());
        tb.insert(parent); 
        assertEquals(1, tb.getStack().size());
        assertEquals(parent, tb.getStack().get(0));
        assertEquals(parent, tb.getDocument().child(0)); 
    }

    @Test
    public void testInsertElementIntoCurrent() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element parent = tb.insertStartTag("div");
        Element child = new Element(Tag.valueOf("span"), "", new Attributes());
        tb.insert(child); 
        assertEquals(2, tb.getStack().size());
        assertEquals(child, tb.getStack().get(1));
        assertEquals(child, parent.child(0)); 
    }

    @Test
    public void testInsertElementIntoFosterParent() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element body = tb.insertStartTag("body");
        Element table = tb.insertStartTag("table");
        Element p = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.setFosterInserts(true);
        tb.insert(p); // Foster within the table's parent (body)
        assertEquals(body, p.parent());
    }

    @Test
    public void testInsertEmpty() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "hr";
        startTag.selfClosing = true;
        Element el = tb.insertEmpty(startTag);
        assertEquals("hr", el.tagName());
        assertTrue(el.tag().isSelfClosing());
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testInsertFormElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "form";
        startTag.attributes.put("id", "myForm");
        FormElement form = tb.insertForm(startTag, true);
        assertEquals("form", form.tagName());
        assertEquals("myForm", form.id());
        assertEquals(1, tb.getStack().size());
        assertEquals(form, tb.getStack().get(0));
        assertEquals(form, tb.getFormElement()); 
    }

    @Test
    public void testInsertFormElementNotOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "form";
        FormElement form = tb.insertForm(startTag, false);
        assertEquals("form", form.tagName());
        assertEquals(0, tb.getStack().size()); 
        assertEquals(form, tb.getFormElement()); 
    }

    @Test
    public void testInsertComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.Comment commentToken = new Token.Comment();
        commentToken.data = "This is a comment";
        tb.insert(commentToken);
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNode(0) instanceof Comment);
        assertEquals("This is a comment", ((Comment) tb.getDocument().childNode(0)).getData());
    }

    @Test
    public void testInsertCharacter() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element parent = tb.insertStartTag("div");
        Token.Character characterToken = new Token.Character();
        characterToken.data = "Some text";
        tb.insert(characterToken);
        assertEquals(1, parent.childNodes().size());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertEquals("Some text", ((TextNode) parent.childNode(0)).text());
    }

    @Test
    public void testInsertCharacterInScript() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element script = tb.insertStartTag("script");
        Token.Character characterToken = new Token.Character();
        characterToken.data = "console.log('hello');";
        tb.insert(characterToken);
        assertEquals(1, script.childNodes().size());
        assertTrue(script.childNode(0) instanceof DataNode); 
        assertEquals("console.log('hello');", ((DataNode) script.childNode(0)).getWholeData());
    }

    @Test
    public void testInsertCharacterInStyle() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element style = tb.insertStartTag("style");
        Token.Character characterToken = new Token.Character();
        characterToken.data = "body { color: red; }";
        tb.insert(characterToken);
        assertEquals(1, style.childNodes().size());
        assertTrue(style.childNode(0) instanceof DataNode); 
        assertEquals("body { color: red; }", ((DataNode) style.childNode(0)).getWholeData());
    }

    @Test
    public void testInsertNodeToDocIfStackEmpty() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Node node = new Comment("test"); 
        tb.stack.clear();
        tb.insertNode(node);
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals(node, tb.getDocument().childNode(0));
    }

    @Test
    public void testInsertNodeToCurrentElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element parent = tb.insertStartTag("div");
        Node node = new TextNode("text"); 
        tb.setFosterInserts(false); 
        tb.insertNode(node);
        assertEquals(1, parent.childNodes().size());
        assertEquals(node, parent.childNode(0));
    }

    @Test
    public void testInsertNodeToFosterParent() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element body = tb.insertStartTag("body");
        Element table = tb.insertStartTag("table"); 
        tb.setFosterInserts(true);
        Node node = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.insertNode(node);
        assertEquals(body, node.parent());
    }

    @Test
    public void testFormElementAssociation() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Token.StartTag formToken = new Token.StartTag();
        formToken.name = "form";
        FormElement form = tb.insertForm(formToken, true);
        Element input = new Element(Tag.valueOf("input"), "", new Attributes());
        tb.insertNode(input); 
        assertEquals(1, form.elements().size());
        assertEquals(input, form.elements().get(0));
    }

    @Test
    public void testPop() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = tb.insertStartTag("div");
        Element el2 = tb.insertStartTag("span");
        assertEquals(2, tb.getStack().size());
        Element popped = tb.pop();
        assertEquals(el2, popped);
        assertEquals(1, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
    }

    @Test
    public void testPush() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.push(el);
        assertEquals(1, tb.getStack().size());
        assertEquals(el, tb.getStack().get(0));
    }

    @Test
    public void testGetStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = tb.insertStartTag("div");
        Element el2 = tb.insertStartTag("span");
        ArrayList<Element> stack = tb.getStack();
        assertEquals(2, stack.size());
        assertEquals(el1, stack.get(0));
        assertEquals(el2, stack.get(1));
    }

    @Test
    public void testOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = tb.insertStartTag("div");
        Element el2 = tb.insertStartTag("span");
        assertTrue(tb.onStack(el1));
        assertTrue(tb.onStack(el2));
        Element el3 = new Element(Tag.valueOf("p"), "", new Attributes());
        assertFalse(tb.onStack(el3));
    }

    @Test
    public void testGetFromStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = tb.insertStartTag("div");
        Element el2 = tb.insertStartTag("span");
        assertEquals(el2, tb.getFromStack("span"));
        assertEquals(el1, tb.getFromStack("div"));
        assertNull(tb.getFromStack("p"));
    }

    @Test
    public void testRemoveFromStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = tb.insertStartTag("div");
        Element el2 = tb.insertStartTag("span");
        assertTrue(tb.removeFromStack(el2));
        assertEquals(1, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertFalse(tb.removeFromStack(el2)); 
    }

    @Test
    public void testPopStackToCloseTagName() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element div = tb.insertStartTag("div");
        Element span = tb.insertStartTag("span");
        Element p = tb.insertStartTag("p");
        tb.popStackToClose("span"); 
        assertEquals(2, tb.getStack().size());
        assertEquals(div, tb.getStack().get(0));
        assertEquals(span, tb.getStack().get(1)); 
        tb.popStackToClose("div"); 
        assertEquals(1, tb.getStack().size());
        assertEquals(div, tb.getStack().get(0));
    }

    @Test
    public void testPopStackToCloseMultipleTagNames() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element div = tb.insertStartTag("div");
        Element span = tb.insertStartTag("span");
        Element p = tb.insertStartTag("p");
        Element li = tb.insertStartTag("li");
        tb.popStackToClose("p", "span"); 
        assertEquals(1, tb.getStack().size());
        assertEquals(div, tb.getStack().get(0));
    }

    @Test
    public void testPopStackToBefore() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element div = tb.insertStartTag("div");
        Element span = tb.insertStartTag("span");
        Element p = tb.insertStartTag("p");
        tb.popStackToBefore("span"); 
        assertEquals(2, tb.getStack().size());
        assertEquals(div, tb.getStack().get(0));
        assertEquals(span, tb.getStack().get(1));
    }

    @Test
    public void testClearStackToTableContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element html = tb.insertStartTag("html");
        Element body = tb.insertStartTag("body");
        Element table = tb.insertStartTag("table");
        tb.clearStackToTableContext(); 
        assertEquals(3, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(body, tb.getStack().get(1));
        assertEquals(table, tb.getStack().get(2));
    }

    @Test
    public void testClearStackToTableBodyContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element html = tb.insertStartTag("html");
        Element body = tb.insertStartTag("body");
        Element table = tb.insertStartTag("table");
        Element tbody = tb.insertStartTag("tbody");
        tb.clearStackToTableBodyContext(); 
        assertEquals(4, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(body, tb.getStack().get(1));
        assertEquals(table, tb.getStack().get(2));
        assertEquals(tbody, tb.getStack().get(3));
    }

    @Test
    public void testClearStackToTableRowContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element html = tb.insertStartTag("html");
        Element body = tb.insertStartTag("body");
        Element table = tb.insertStartTag("table");
        Element tbody = tb.insertStartTag("tbody");
        Element tr = tb.insertStartTag("tr");
        tb.clearStackToTableRowContext(); 
        assertEquals(5, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(body, tb.getStack().get(1));
        assertEquals(table, tb.getStack().get(2));
        assertEquals(tbody, tb.getStack().get(3));
        assertEquals(tr, tb.getStack().get(4));
    }

    @Test
    public void testAboveOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = tb.insertStartTag("div");
        Element el2 = tb.insertStartTag("span");
        Element el3 = tb.insertStartTag("p");
        assertEquals(el2, tb.aboveOnStack(el3));
        assertEquals(el1, tb.aboveOnStack(el2));
        assertNull(tb.aboveOnStack(el1)); 
    }

    @Test
    public void testInsertOnStackAfter() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = tb.insertStartTag("div");
        Element el2 = tb.insertStartTag("span");
        Element el3 = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.insertOnStackAfter(el1, el3);
        assertEquals(3, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el3, tb.getStack().get(1));
        assertEquals(el2, tb.getStack().get(2));
    }

    @Test
    public void testReplaceOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = tb.insertStartTag("div");
        Element el2 = tb.insertStartTag("span");
        Element el3 = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.replaceOnStack(el2, el3);
        assertEquals(2, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el3, tb.getStack().get(1));
    }

    @Test
    public void testResetInsertionModeInSelect() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("select");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionModeInCell() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("td");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionModeInRow() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("tr");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionModeInTableBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testResetInsertionModeInCaption() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("table");
        tb.insertStartTag("caption");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionModeInColumnGroup() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("table");
        tb.insertStartTag("colgroup");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionModeInTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("table");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionModeInHead() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionModeInBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionModeInFrameset() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testResetInsertionModeAtHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testResetInsertionModeDefault() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("div"); 
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionModeFragmentContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = new Element(Tag.valueOf("div"), "", new Attributes());
        tb.contextElement = context;
        tb.fragmentParsing = true;
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault); // Re-initialize after setting fragment parsing
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        assertTrue(tb.inScope("body"));
        assertTrue(tb.inScope("html"));
        assertFalse(tb.inScope("div"));
    }

    @Test
    public void testInScopeWithExtra() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("table");
        tb.insertStartTag("tr");
        assertTrue(tb.inScope("tr", new String[]{"table"}));
        assertFalse(tb.inScope("tr", new String[]{"div"}));
    }

    @Test
    public void testInScopeMultiple() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("table");
        tb.insertStartTag("tbody");
        assertTrue(tb.inScope(new String[]{"tbody", "table"}));
        assertFalse(tb.inScope(new String[]{"div", "span"}));
    }

    @Test
    public void testInListItemScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("ul");
        tb.insertStartTag("li");
        assertTrue(tb.inListItemScope("li"));
        assertTrue(tb.inListItemScope("ul"));
        assertFalse(tb.inListItemScope("div"));
    }

    @Test
    public void testInButtonScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("button");
        assertTrue(tb.inButtonScope("button"));
        assertFalse(tb.inButtonScope("div"));
    }

    @Test
    public void testInTableScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("table");
        assertTrue(tb.inTableScope("table"));
        assertTrue(tb.inTableScope("html"));
        assertFalse(tb.inTableScope("body"));
    }

    @Test
    public void testInSelectScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.insertStartTag("select");
        tb.insertStartTag("option");
        assertTrue(tb.inSelectScope("option"));
        assertTrue(tb.inSelectScope("select"));
        assertFalse(tb.inSelectScope("body"));
    }

    @Test
    public void testSetAndGetHeadElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element head = new Element(Tag.valueOf("head"), "", new Attributes());
        tb.setHeadElement(head);
        assertEquals(head, tb.getHeadElement());
    }

    @Test
    public void testSetAndGetFosterInserts() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertFalse(tb.isFosterInserts());
        tb.setFosterInserts(true);
        assertTrue(tb.isFosterInserts());
    }

    @Test
    public void testSetAndGetFormElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        tb.setFormElement(form);
        assertEquals(form, tb.getFormElement());
    }

    @Test
    public void testNewAndGetPendingTableCharacters() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.newPendingTableCharacters();
        assertNotNull(tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters() instanceof ArrayList);
    }

    @Test
    public void testSetPendingTableCharacters() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        List<String> chars = new ArrayList<>();
        chars.add("a");
        chars.add("b");
        tb.setPendingTableCharacters(chars);
        assertEquals(chars, tb.getPendingTableCharacters());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element p = tb.insertStartTag("p");
        Element li = tb.insertStartTag("li");
        tb.generateImpliedEndTags(); 
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testGenerateImpliedEndTagsWithExclude() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element p = tb.insertStartTag("p");
        Element li = tb.insertStartTag("li");
        tb.generateImpliedEndTags("p"); 
        assertEquals(1, tb.getStack().size());
        assertEquals(p, tb.getStack().get(0));
    }

    @Test
    public void testIsSpecial() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertTrue(tb.isSpecial(new Element(Tag.valueOf("script"), "", new Attributes())));
        assertTrue(tb.isSpecial(new Element(Tag.valueOf("table"), "", new Attributes())));
        assertFalse(tb.isSpecial(new Element(Tag.valueOf("div"), "", new Attributes())));
    }

    @Test
    public void testLastFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertNull(tb.lastFormattingElement());
        Element el = new Element(Tag.valueOf("b"), "", new Attributes());
        tb.pushActiveFormattingElements(el);
        assertEquals(el, tb.lastFormattingElement());
    }

    @Test
    public void testRemoveLastFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.removeLastFormattingElement());
        assertEquals(el1, tb.lastFormattingElement());
        assertEquals(el1, tb.removeLastFormattingElement());
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        el1.attr("href", "test");
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        Element el3 = new Element(Tag.valueOf("b"), "", new Attributes()); 
        el3.attr("href", "test");
        
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.pushActiveFormattingElements(el3);

        assertEquals(3, tb.formattingElements.size());
        assertEquals(el1, tb.formattingElements.get(0));
        assertEquals(el2, tb.formattingElements.get(1));
        assertEquals(el3, tb.formattingElements.get(2));
    }

    @Test
    public void testIsSameFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("a"), "", new Attributes());
        el1.attr("href", "link1");
        Element el2 = new Element(Tag.valueOf("a"), "", new Attributes());
        el2.attr("href", "link1");
        Element el3 = new Element(Tag.valueOf("a"), "", new Attributes());
        el3.attr("href", "link2");
        Element el4 = new Element(Tag.valueOf("b"), "", new Attributes());
        assertTrue(tb.isSameFormattingElement(el1, el2));
        assertFalse(tb.isSameFormattingElement(el1, el3));
        assertFalse(tb.isSameFormattingElement(el1, el4));
    }

    @Test
    public void testReconstructFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        
        // Test case where element is not on stack:
        tb.formattingElements.clear();
        tb.stack.clear();
        Element formattingB = new Element(Tag.valueOf("b"), "", new Attributes());
        tb.formattingElements.add(formattingB);
        // Element is NOT on stack.
        tb.reconstructFormattingElements(); 
        assertEquals(1, tb.formattingElements.size()); 
        assertEquals(formattingB, tb.formattingElements.get(0));
        assertEquals(1, tb.stack.size()); 
        assertEquals("b", tb.stack.get(0).tagName());
        assertNotEquals(formattingB, tb.stack.get(0));
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(null); // Marker
        tb.pushActiveFormattingElements(el2);
        tb.clearFormattingElementsToLastMarker();
        assertEquals(1, tb.formattingElements.size());
        assertNull(tb.formattingElements.get(0)); 
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.removeFromActiveFormattingElements(el1);
        assertEquals(1, tb.formattingElements.size());
        assertEquals(el2, tb.formattingElements.get(0));
    }

    @Test
    public void testIsInActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        assertTrue(tb.isInActiveFormattingElements(el1));
        assertFalse(tb.isInActiveFormattingElements(el2));
    }

    @Test
    public void testGetActiveFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.getActiveFormattingElement("i"));
        assertEquals(el1, tb.getActiveFormattingElement("b"));
        assertNull(tb.getActiveFormattingElement("p"));
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        Element el3 = new Element(Tag.valueOf("u"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.replaceActiveFormattingElement(el2, el3);
        assertEquals(2, tb.formattingElements.size());
        assertEquals(el1, tb.formattingElements.get(0));
        assertEquals(el3, tb.formattingElements.get(1));
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertMarkerToFormattingElements();
        assertEquals(1, tb.formattingElements.size());
        assertNull(tb.formattingElements.get(0));
    }

    @Test
    public void testInsertInFosterParentTableCase() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element body = tb.insertStartTag("body");
        Element table = tb.insertStartTag("table");
        Element p = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.setFosterInserts(true);
        tb.insertInFosterParent(p);
        assertEquals(body, p.parent()); 
    }

    @Test
    public void testInsertInFosterParentFragmentCase() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = new Element(Tag.valueOf("div"), "", new Attributes());
        tb.contextElement = context;
        tb.fragmentParsing = true;
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault); 
        Element p = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.setFosterInserts(true);
        tb.insertInFosterParent(p);
        assertTrue(p.parent() != null);
    }

    @Test
    public void testToString() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        String stateString = tb.toString();
        assertTrue(stateString.contains("currentToken=null"));
        assertTrue(stateString.contains("state=Initial"));
        assertTrue(stateString.contains("currentElement=null"));

        tb.transition(HtmlTreeBuilderState.InBody);
        Element el = tb.insertStartTag("div");
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "p";
        tb.currentToken = startTag;
        stateString = tb.toString();
        assertTrue(stateString.contains("currentToken=start tag: p"));
        assertTrue(stateString.contains("state=InBody"));
        assertTrue(stateString.contains("currentElement=div"));
    }
}
```