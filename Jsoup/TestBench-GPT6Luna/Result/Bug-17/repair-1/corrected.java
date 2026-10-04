package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.Iterator;
import java.util.LinkedList;

public class TreeBuilderStateTest {
    @Test
    public void testInitialIgnoresWhitespace() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        assertTrue(TreeBuilderState.Initial.process(new Token.Character(" \t"), tb));
        assertEquals(TreeBuilderState.Initial, tb.state());
        assertEquals(0, tb.getDocument().childNodes().size());
    }

    @Test
    public void testInitialDoctypeTransitionsToBeforeHtml() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(TreeBuilderState.Initial.process(doctype, tb));
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
        assertEquals(1, tb.getDocument().childNodes().size());
    }

    @Test
    public void testBeforeHtmlRejectsUnexpectedEndTag() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        assertFalse(TreeBuilderState.BeforeHtml.process(new Token.EndTag("div"), tb));
    }

    @Test
    public void testBeforeHtmlCreatesHtmlForCharacter() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        assertTrue(TreeBuilderState.BeforeHtml.process(new Token.Character("x"), tb));
        assertEquals("html", tb.getDocument().childNode(0).nodeName());
        assertEquals("x", tb.getDocument().text());
    }

    @Test
    public void testBeforeHeadInsertsExplicitHead() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        assertTrue(TreeBuilderState.BeforeHead.process(new Token.StartTag("head"), tb));
        assertEquals(TreeBuilderState.InHead, tb.state());
        assertEquals("head", tb.currentElement().nodeName());
    }

    @Test
    public void testBeforeHeadRejectsDoctype() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        assertFalse(TreeBuilderState.BeforeHead.process(new Token.Doctype(), tb));
    }

    @Test
    public void testInHeadInsertsMetaAndKeepsState() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("head");
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("meta"), tb));
        assertEquals(TreeBuilderState.InHead, tb.state());
        assertEquals(1, tb.getHeadElement().childNodes().size());
        assertEquals("meta", tb.getHeadElement().childNode(0).nodeName());
    }

    @Test
    public void testInHeadHeadEndTransitionsAfterHead() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("head");
        assertTrue(TreeBuilderState.InHead.process(new Token.EndTag("head"), tb));
        assertEquals(TreeBuilderState.AfterHead, tb.state());
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyInsertsCharacterAndDisallowsFrameset() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        assertTrue(TreeBuilderState.InBody.process(new Token.Character("x"), tb));
        assertEquals("x", tb.getDocument().text());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyWhitespaceDoesNotDisallowFrameset() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        assertTrue(TreeBuilderState.InBody.process(new Token.Character(" \t"), tb));
        assertTrue(tb.framesetOk());
        assertEquals(" \t", tb.getDocument().text());
    }

    @Test
    public void testInBodyImageStartTagBecomesImg() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("image"), tb));
        assertEquals("img", tb.currentElement().nodeName());
        assertEquals("img", tb.getDocument().body().childNode(0).nodeName());
    }

    @Test
    public void testInBodyEndParagraphWithoutParagraphCreatesEmptyOne() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        assertTrue(TreeBuilderState.InBody.process(new Token.EndTag("p"), tb));
        assertEquals(1, tb.getDocument().body().childNodes().size());
        assertEquals("p", tb.getDocument().body().childNode(0).nodeName());
    }

    @Test
    public void testInBodyButtonStartTagCreatesButton() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("button"), tb));
        assertEquals("button", tb.currentElement().nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testTextStateInsertsCharacter() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("script");
        assertTrue(TreeBuilderState.Text.process(new Token.Character("x"), tb));
        assertEquals("x", tb.getDocument().text());
    }

    @Test
    public void testInTableCreatesTableBodyForRow() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("table");
        assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("tr"), tb));
        assertEquals("tr", tb.currentElement().nodeName());
        assertEquals("tbody", tb.getDocument().getElementsByTag("table").first().childNode(0).nodeName());
    }

    @Test
    public void testInTableRejectsInvalidBodyEndTag() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("table");
        assertFalse(TreeBuilderState.InTable.process(new Token.EndTag("body"), tb));
    }

    @Test
    public void testInColumnGroupInsertsCol() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("table");
        tb.insert("colgroup");
        assertTrue(TreeBuilderState.InColumnGroup.process(new Token.StartTag("col"), tb));
        assertEquals("col", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInSelectInsertsOption() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("select");
        assertTrue(TreeBuilderState.InSelect.process(new Token.StartTag("option"), tb));
        assertEquals("option", tb.currentElement().nodeName());
        assertEquals("option", tb.getDocument().getElementsByTag("select").first().childNode(0).nodeName());
    }

    @Test
    public void testInSelectRejectsUnknownStartTag() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("select");
        assertFalse(TreeBuilderState.InSelect.process(new Token.StartTag("div"), tb));
    }

    @Test
    public void testInCaptionEndTagReturnsToTable() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("table");
        tb.insert("caption");
        assertTrue(TreeBuilderState.InCaption.process(new Token.EndTag("caption"), tb));
        assertEquals(TreeBuilderState.InTable, tb.state());
        assertEquals("table", tb.currentElement().nodeName());
    }
}
