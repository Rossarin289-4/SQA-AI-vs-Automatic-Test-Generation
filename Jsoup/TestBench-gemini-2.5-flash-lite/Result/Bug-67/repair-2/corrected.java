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
import org.jsoup.Tag; // Imported Tag
import org.jsoup.parser.Token.StartTag; // Imported StartTag
import org.jsoup.parser.Token.EndTag;   // Imported EndTag
import org.jsoup.parser.Token.Comment; // Imported Comment token
import org.jsoup.parser.Token.Character; // Imported Character token
import org.jsoup.parser.TokeniserState; // Imported TokeniserState

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jsoup.Connection;


public class HtmlTreeBuilderTest {

    @Test
    public void testInitialiseParseResetsState() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", null, null);
        assertEquals(HtmlTreeBuilderState.Initial, tb.state());
        assertNull(tb.originalState());
        assertFalse(tb.baseUriSetFromDoc); // Accessing public fields
        assertNull(tb.headElement); // Accessing public fields
        assertNull(tb.formElement); // Accessing public fields
        assertNull(tb.contextElement); // Accessing public fields
        assertTrue(tb.formattingElements.isEmpty()); // Accessing public fields
        assertTrue(tb.pendingTableCharacters.isEmpty()); // Accessing public fields
        assertNotNull(tb.emptyEnd); // Accessing public fields
        assertTrue(tb.framesetOk); // Accessing public fields
        assertFalse(tb.fosterInserts); // Accessing public fields
        assertFalse(tb.fragmentParsing); // Accessing public fields
    }

    @Test
    public void testParseFragmentCreatesDocument() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("", null, "http://example.com", null, null);
        assertNotNull(nodes);
        assertTrue(nodes.isEmpty());
        assertNotNull(tb.getDocument());
        assertEquals("http://example.com/", tb.getDocument().baseUri());
    }

    @Test
    public void testParseFragmentWithContextCreatesDocumentWithRoot() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = new Document("http://example.com");
        Element context = new Element("body");
        doc.appendChild(context);
        List<Node> nodes = tb.parseFragment("", context, "http://example.com", null, null);
        assertNotNull(nodes);
        assertTrue(nodes.isEmpty());
        assertNotNull(tb.getDocument());
        assertEquals("http://example.com/", tb.getDocument().baseUri());
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNode(0) instanceof Element);
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
    }

    @Test
    public void testParseFragmentHandlesTitleTagCorrectly() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // The initialiseParse method is called by parseFragment internally if needed,
        // but for setting the initial tokeniser state, we might need to call it explicitly
        // or ensure it's done before the relevant part of parseFragment is reached.
        // For the purpose of testing the state transition, we can call initialiseParse.
        tb.initialiseParse(new StringReader("title"), "", null, null);
        tb.parseFragment("title", null, "http://example.com", null, null);
        // The tokeniser is an internal detail, but we can access it through a getter if available or if it's package-private.
        // Assuming tokeniser is accessible for testing.
        assertEquals(TokeniserState.Rcdata, tb.tokeniser.state());
    }

    @Test
    public void testParseFragmentHandlesIframeTagCorrectly() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("iframe"), "", null, null);
        tb.parseFragment("iframe", null, "http://example.com", null, null);
        assertEquals(TokeniserState.Rawtext, tb.tokeniser.state());
    }

    @Test
    public void testParseFragmentHandlesScriptTagCorrectly() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("script"), "", null, null);
        tb.parseFragment("script", null, "http://example.com", null, null);
        assertEquals(TokeniserState.ScriptData, tb.tokeniser.state());
    }

    @Test
    public void testParseFragmentHandlesPlaintextTagCorrectly() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("plaintext"), "", null, null);
        tb.parseFragment("plaintext", null, "http://example.com", null, null);
        assertEquals(TokeniserState.Data, tb.tokeniser.state());
    }

    @Test
    public void testInsertStartTagCreatesElementAndAppendsToStack() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<div>"), "", null, null);
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("div", new org.jsoup.nodes.Attributes());
        Element div = tb.insert(startTag);
        assertEquals("div", div.tagName());
        assertEquals(1, tb.getStack().size());
        assertEquals(div, tb.getStack().get(0));
    }

    @Test
    public void testInsertStartTagWithAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<div id='test'>"), "", null, null);
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("div", new org.jsoup.nodes.Attributes().put("id", "test"));
        Element div = tb.insert(startTag);
        assertEquals("div", div.tagName());
        assertEquals("test", div.id());
    }

    @Test
    public void testInsertEmptyUnknownTagIsSelfClosing() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<unknown>"), "", null, null);
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("unknown", new org.jsoup.nodes.Attributes());
        startTag.selfClosing = true;
        Element unknown = tb.insertEmpty(startTag);
        assertTrue(unknown.tag().isSelfClosing());
        assertEquals("unknown", unknown.tagName());
    }

    @Test
    public void testInsertFormElementAddsToFormElementField() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<form><input></form>"), "", null, null);
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new org.jsoup.nodes.Attributes());
        FormElement form = tb.insertForm(formTag, true);
        assertNotNull(tb.getFormElement());
        assertEquals(form, tb.getFormElement());

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.nameAttr("input", new org.jsoup.nodes.Attributes());
        Element input = tb.insert(inputTag);
        assertEquals(1, form.elements().size());
        assertEquals(input, form.elements().get(0));
    }

    @Test
    public void testInsertComment() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<!-- comment -->"), "", null, null);
        Token.Comment commentToken = new Token.Comment();
        commentToken.data(" comment ");
        tb.insert(commentToken);
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNode(0) instanceof org.jsoup.nodes.Comment); // Use nodes.Comment
        assertEquals(" comment ", ((org.jsoup.nodes.Comment) tb.getDocument().childNode(0)).getData()); // Use nodes.Comment
    }

    @Test
    public void testInsertCharacterDataIntoScriptTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<script>var a=1;</script>"), "", null, null);
        Token.StartTag scriptTag = new Token.StartTag();
        scriptTag.nameAttr("script", new org.jsoup.nodes.Attributes());
        Element script = tb.insert(scriptTag);
        Token.Character charToken = new Token.Character();
        charToken.data("var a=1;");
        tb.insert(charToken);
        assertEquals(1, script.childNodes().size());
        assertTrue(script.childNode(0) instanceof DataNode);
        assertEquals("var a=1;", ((DataNode) script.childNode(0)).getWholeData());
    }

    @Test
    public void testInsertCharacterDataIntoStyleTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<style>body {color: red;}</style>"), "", null, null);
        Token.StartTag styleTag = new Token.StartTag();
        styleTag.nameAttr("style", new org.jsoup.nodes.Attributes());
        Element style = tb.insert(styleTag);
        Token.Character charToken = new Token.Character();
        charToken.data("body {color: red;}");
        tb.insert(charToken);
        assertEquals(1, style.childNodes().size());
        assertTrue(style.childNode(0) instanceof DataNode);
        assertEquals("body {color: red;}", ((DataNode) style.childNode(0)).getWholeData());
    }

    @Test
    public void testInsertCharacterDataIntoOtherTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<div>Some text</div>"), "", null, null);
        Token.StartTag divTag = new Token.StartTag();
        divTag.nameAttr("div", new org.jsoup.nodes.Attributes());
        Element div = tb.insert(divTag);
        Token.Character charToken = new Token.Character();
        charToken.data("Some text");
        tb.insert(charToken);
        assertEquals(1, div.childNodes().size());
        assertTrue(div.childNode(0) instanceof TextNode);
        assertEquals("Some text", ((TextNode) div.childNode(0)).getWholeText());
    }

    @Test
    public void testPopRemovesAndReturnsTopElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        assertEquals(el2, tb.pop());
        assertEquals(1, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
    }

    @Test
    public void testPushAddsElementToStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        tb.push(el1);
        assertEquals(1, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
    }

    @Test
    public void testOnStackChecksIfElementIsInStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        assertTrue(tb.onStack(el1));
        assertFalse(tb.onStack(el2));
    }

    @Test
    public void testGetFromStackFindsElementByName() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        assertEquals(el2, tb.getFromStack("span"));
        assertEquals(el1, tb.getFromStack("div"));
    }

    @Test
    public void testGetFromStackReturnsNullIfNotPresent() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        tb.push(el1);
        assertNull(tb.getFromStack("span"));
    }

    @Test
    public void testRemoveFromStackRemovesElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        assertTrue(tb.removeFromStack(el2));
        assertEquals(1, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertFalse(tb.removeFromStack(el2)); // already removed
    }

    @Test
    public void testPopStackToCloseRemovesUntilTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        tb.push(el1);
        tb.push(el2);
        tb.push(el3);
        tb.popStackToClose("span");
        assertEquals(2, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el2, tb.getStack().get(1));
    }

    @Test
    public void testPopStackToCloseWithMultipleTargets() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("li");
        Element el3 = new Element("p");
        Element el4 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        tb.push(el3);
        tb.push(el4);
        tb.popStackToClose(new String[]{"li", "p"});
        assertEquals(2, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el2, tb.getStack().get(1));
    }

    @Test
    public void testPopStackToBeforeRemovesUntilTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        tb.push(el1);
        tb.push(el2);
        tb.push(el3);
        tb.popStackToBefore("span");
        assertEquals(2, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el2, tb.getStack().get(1));
    }

    @Test
    public void testClearStackToTableContextClearsCorrectly() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element table = new Element("table");
        Element tr = new Element("tr");
        tb.push(html);
        tb.push(body);
        tb.push(table);
        tb.push(tr);
        tb.clearStackToTableContext();
        assertEquals(3, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(body, tb.getStack().get(1));
        assertEquals(table, tb.getStack().get(2));
    }

    @Test
    public void testClearStackToTableBodyContextClearsCorrectly() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element table = new Element("table");
        Element tbody = new Element("tbody");
        Element tr = new Element("tr");
        tb.push(html);
        tb.push(table);
        tb.push(tbody);
        tb.push(tr);
        tb.clearStackToTableBodyContext();
        assertEquals(3, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(table, tb.getStack().get(1));
        assertEquals(tbody, tb.getStack().get(2));
    }

    @Test
    public void testClearStackToTableRowContextClearsCorrectly() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element table = new Element("table");
        Element tbody = new Element("tbody");
        Element tr = new Element("tr");
        tb.push(html);
        tb.push(table);
        tb.push(tbody);
        tb.push(tr);
        tb.clearStackToTableRowContext();
        assertEquals(4, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(table, tb.getStack().get(1));
        assertEquals(tbody, tb.getStack().get(2));
        assertEquals(tr, tb.getStack().get(3));
    }

    @Test
    public void testAboveOnStackReturnsElementAbove() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        assertEquals(el1, tb.aboveOnStack(el2));
    }

    @Test
    public void testAboveOnStackReturnsNullIfNoElementAbove() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        tb.push(el1);
        assertNull(tb.aboveOnStack(el1));
    }

    @Test
    public void testInsertOnStackAfterInsertsAtCorrectPosition() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        tb.push(el1);
        tb.push(el2);
        tb.insertOnStackAfter(el1, el3);
        assertEquals(3, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el3, tb.getStack().get(1));
        assertEquals(el2, tb.getStack().get(2));
    }

    @Test
    public void testReplaceOnStackReplacesCorrectElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        tb.push(el1);
        tb.push(el2);
        tb.replaceOnStack(el2, el3);
        assertEquals(2, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el3, tb.getStack().get(1));
    }

    @Test
    public void testResetInsertionModeForSelect() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element select = new Element("select");
        tb.push(select);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionModeForTdOrTh() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element td = new Element("td");
        tb.push(td);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());

        tb = new HtmlTreeBuilder();
        Element th = new Element("th");
        tb.push(th);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionModeForTr() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element tr = new Element("tr");
        tb.push(tr);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionModeForTbodyTheadTfoot() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element tbody = new Element("tbody");
        tb.push(tbody);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());

        tb = new HtmlTreeBuilder();
        Element thead = new Element("thead");
        tb.push(thead);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());

        tb = new HtmlTreeBuilder();
        Element tfoot = new Element("tfoot");
        tb.push(tfoot);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testResetInsertionModeForCaption() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element caption = new Element("caption");
        tb.push(caption);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionModeForColgroup() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element colgroup = new Element("colgroup");
        tb.push(colgroup);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionModeForTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        tb.push(table);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionModeForHead() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element head = new Element("head");
        tb.push(head);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionModeForBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element body = new Element("body");
        tb.push(body);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionModeForFrameset() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element frameset = new Element("frameset");
        tb.push(frameset);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testResetInsertionModeForHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        tb.push(html);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testResetInsertionModeDefaultsToInBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInSpecificScopeWithMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element tr = new Element("tr");
        Element td = new Element("td");
        tb.push(table);
        tb.push(tr);
        tb.push(td);
        // Using the static array from the class under test
        assertTrue(tb.inSpecificScope("td", HtmlTreeBuilder.TagsSearchInScope, null));
    }

    @Test
    public void testInSpecificScopeWithBaseTypeNotMatching() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element tbody = new Element("tbody");
        tb.push(table);
        tb.push(tbody);
        // Using the static array from the class under test
        assertFalse(tb.inSpecificScope("td", HtmlTreeBuilder.TagsSearchInScope, null));
    }

    @Test
    public void testInSpecificScopeWithExtraTypeMatching() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element button = new Element("button");
        Element span = new Element("span");
        tb.push(button);
        tb.push(span);
        // Using the static array from the class under test
        assertFalse(tb.inSpecificScope("span", null, HtmlTreeBuilder.TagSearchButton));
    }

    @Test
    public void testInScopeWithMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element div = new Element("div");
        tb.push(html);
        tb.push(body);
        tb.push(div);
        assertTrue(tb.inScope("div"));
    }

    @Test
    public void testInScopeWithNonMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        tb.push(html);
        tb.push(body);
        assertFalse(tb.inScope("div"));
    }

    @Test
    public void testInScopeWithExtras() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element table = new Element("table");
        Element td = new Element("td");
        tb.push(html);
        tb.push(table);
        tb.push(td);
        // Using the static array from the class under test
        assertTrue(tb.inScope("td", HtmlTreeBuilder.TagSearchTableScope));
    }

    @Test
    public void testInListItemScopeWithMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element ol = new Element("ol");
        Element li = new Element("li");
        tb.push(ol);
        tb.push(li);
        assertTrue(tb.inListItemScope("li"));
    }

    @Test
    public void testInListItemScopeWithNonMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element ol = new Element("ol");
        Element div = new Element("div");
        tb.push(ol);
        tb.push(div);
        assertFalse(tb.inListItemScope("li"));
    }

    @Test
    public void testInButtonScopeWithMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element button = new Element("button");
        Element span = new Element("span");
        tb.push(button);
        tb.push(span);
        assertTrue(tb.inButtonScope("span"));
    }

    @Test
    public void testInButtonScopeWithNonMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element button = new Element("button");
        Element div = new Element("div");
        tb.push(button);
        tb.push(div);
        assertFalse(tb.inButtonScope("span"));
    }

    @Test
    public void testInTableScopeWithMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element td = new Element("td");
        tb.push(table);
        tb.push(td);
        assertTrue(tb.inTableScope("td"));
    }

    @Test
    public void testInTableScopeWithNonMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element div = new Element("div");
        tb.push(table);
        tb.push(div);
        assertFalse(tb.inTableScope("td"));
    }

    @Test
    public void testInSelectScopeWithMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element select = new Element("select");
        Element option = new Element("option");
        tb.push(select);
        tb.push(option);
        assertTrue(tb.inSelectScope("option"));
    }

    @Test
    public void testInSelectScopeWithNonMatchingTarget() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element select = new Element("select");
        Element div = new Element("div");
        tb.push(select);
        tb.push(div);
        assertFalse(tb.inSelectScope("option"));
    }

    @Test
    public void testSetHeadElementAndGetHeadElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element head = new Element("head");
        tb.setHeadElement(head);
        assertEquals(head, tb.getHeadElement());
    }

    @Test
    public void testSetFosterInsertsAndGetFosterInserts() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.setFosterInserts(true);
        assertTrue(tb.isFosterInserts());
        tb.setFosterInserts(false);
        assertFalse(tb.isFosterInserts());
    }

    @Test
    public void testSetFormElementAndGetFormElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        FormElement form = new FormElement(Tag.valueOf("form"), "", null);
        tb.setFormElement(form);
        assertEquals(form, tb.getFormElement());
    }

    @Test
    public void testNewPendingTableCharactersCreatesNewList() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.newPendingTableCharacters();
        assertNotNull(tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters() instanceof ArrayList);
    }

    @Test
    public void testSetPendingTableCharacters() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<String> chars = new ArrayList<>();
        chars.add("a");
        tb.setPendingTableCharacters(chars);
        assertEquals(chars, tb.getPendingTableCharacters());
    }

    @Test
    public void testGenerateImpliedEndTagsHandlesBasicCase() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element li = new Element("li");
        Element p = new Element("p");
        tb.push(li);
        tb.push(p);
        tb.generateImpliedEndTags();
        assertEquals(1, tb.getStack().size());
        assertEquals(li, tb.getStack().get(0));
    }

    @Test
    public void testGenerateImpliedEndTagsExcludesSpecificTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element li = new Element("li");
        Element p = new Element("p");
        tb.push(li);
        tb.push(p);
        tb.generateImpliedEndTags("p");
        assertEquals(2, tb.getStack().size());
        assertEquals(li, tb.getStack().get(0));
        assertEquals(p, tb.getStack().get(1));
    }

    @Test
    public void testIsSpecialChecksKnownSpecialTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element body = new Element("body");
        Element div = new Element("div");
        assertTrue(tb.isSpecial(body));
        assertFalse(tb.isSpecial(div));
    }

    @Test
    public void testLastFormattingElementReturnsLast() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        Element el2 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.lastFormattingElement());
    }

    @Test
    public void testLastFormattingElementReturnsNullIfEmpty() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testRemoveLastFormattingElementRemovesAndReturnsLast() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        Element el2 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.removeLastFormattingElement());
        assertEquals(1, tb.formattingElements.size()); // Accessing public field
        assertEquals(el1, tb.formattingElements.get(0)); // Accessing public field
    }

    @Test
    public void testRemoveLastFormattingElementReturnsNullIfEmpty() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertNull(tb.removeLastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElementsAddsElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        tb.pushActiveFormattingElements(el1);
        assertEquals(1, tb.formattingElements.size()); // Accessing public field
        assertEquals(el1, tb.formattingElements.get(0)); // Accessing public field
    }

    @Test
    public void testPushActiveFormattingElementsHandlesMaxThree() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        Element el2 = new Element("b");
        Element el3 = new Element("c");
        Element el4 = new Element("d");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.pushActiveFormattingElements(el3);
        tb.pushActiveFormattingElements(el4);
        assertEquals(3, tb.formattingElements.size()); // Accessing public field
        assertEquals(el2, tb.formattingElements.get(0)); // Accessing public field
        assertEquals(el3, tb.formattingElements.get(1)); // Accessing public field
        assertEquals(el4, tb.formattingElements.get(2)); // Accessing public field
    }

    @Test
    public void testReconstructFormattingElementsCreatesNewElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        el1.attr("href", "http://example.com");
        Element el2 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.setFosterInserts(false); // to ensure insertion into current element
        tb.initialiseParse(new StringReader("<div></div>"), "", null, null);
        Element div = tb.insertStartTag("div");
        tb.reconstructFormattingElements();

        assertEquals(2, tb.formattingElements.size()); // Accessing public field
        assertTrue(tb.formattingElements.get(0) instanceof Element); // Accessing public field
        assertTrue(tb.formattingElements.get(1) instanceof Element); // Accessing public field
        assertNotSame(el1, tb.formattingElements.get(0));
        assertNotSame(el2, tb.formattingElements.get(1));
        assertEquals("a", tb.formattingElements.get(0).nodeName());
        assertEquals("http://example.com", tb.formattingElements.get(0).attr("href"));
        assertEquals("b", tb.formattingElements.get(1).nodeName());
    }

    @Test
    public void testClearFormattingElementsToLastMarkerClearsCorrectly() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        Element el2 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.insertMarkerToFormattingElements(); // null marker
        Element el3 = new Element("c");
        tb.pushActiveFormattingElements(el3);
        tb.clearFormattingElementsToLastMarker();
        assertEquals(1, tb.formattingElements.size()); // Accessing public field
        assertEquals(el1, tb.formattingElements.get(0)); // Accessing public field
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        Element el2 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.removeFromActiveFormattingElements(el1);
        assertEquals(1, tb.formattingElements.size()); // Accessing public field
        assertEquals(el2, tb.formattingElements.get(0)); // Accessing public field
    }

    @Test
    public void testIsInActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        Element el2 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        assertTrue(tb.isInActiveFormattingElements(el1));
        assertFalse(tb.isInActiveFormattingElements(el2));
    }

    @Test
    public void testGetActiveFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        Element el2 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.getActiveFormattingElement("b"));
        assertEquals(el1, tb.getActiveFormattingElement("a"));
        assertNull(tb.getActiveFormattingElement("c"));
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("a");
        Element el2 = new Element("b");
        Element el3 = new Element("c");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.replaceActiveFormattingElement(el2, el3);
        assertEquals(2, tb.formattingElements.size()); // Accessing public field
        assertEquals(el1, tb.formattingElements.get(0)); // Accessing public field
        assertEquals(el3, tb.formattingElements.get(1)); // Accessing public field
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.insertMarkerToFormattingElements();
        assertEquals(1, tb.formattingElements.size()); // Accessing public field
        assertNull(tb.formattingElements.get(0)); // Accessing public field
    }

    @Test
    public void testInsertInFosterParentAddsNodeToParent() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<table><tbody><tr></tr></tbody></table>"), "", null, null);
        Element table = tb.getFromStack("table");
        Element tbody = tb.getFromStack("tbody");
        Element tr = tb.getFromStack("tr");
        Node newNode = new TextNode("text");

        tb.setFosterInserts(true);
        tb.insertInFosterParent(newNode);

        // The foster parent should be the table's parent, or the table itself if it has no parent in the stack.
        // In this setup, it's the tbody.
        assertEquals(1, tbody.childNodes().size());
        assertEquals(newNode, tbody.childNodes().get(0));
    }

    @Test
    public void testInsertInFosterParentHandlesNoTableScenario() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<div></div>"), "", null, null);
        Element div = tb.getFromStack("div");
        Node newNode = new TextNode("text");

        tb.setFosterInserts(true);
        tb.insertInFosterParent(newNode);

        // In this case, the foster parent is the first element on the stack, which is 'div'.
        assertEquals(1, div.childNodes().size());
        assertEquals(newNode, div.childNodes().get(0));
    }
}
