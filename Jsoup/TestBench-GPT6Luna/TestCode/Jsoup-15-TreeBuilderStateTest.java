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
        tb.transition(TreeBuilderState.Initial);
        assertTrue(TreeBuilderState.Initial.process(new Token.Character(" "), tb));
        assertEquals(TreeBuilderState.Initial, tb.state());
        assertEquals(0, tb.getDocument().childNodes().size());
    }

    @Test
    public void testInitialDoctypeTransitionsToBeforeHtml() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.transition(TreeBuilderState.Initial);
        Token.Doctype d = new Token.Doctype();
        assertTrue(TreeBuilderState.Initial.process(d, tb));
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
        assertEquals(1, tb.getDocument().childNodes().size());
    }

    @Test
    public void testBeforeHtmlRejectsUnexpectedEndTag() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.transition(TreeBuilderState.BeforeHtml);
        assertFalse(TreeBuilderState.BeforeHtml.process(new Token.EndTag("p"), tb));
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlCreatesHtmlAndHeadForText() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.transition(TreeBuilderState.BeforeHtml);
        assertTrue(TreeBuilderState.BeforeHtml.process(new Token.Character("x"), tb));
        assertEquals(TreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testBeforeHeadInsertsHead() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.BeforeHead);
        assertTrue(TreeBuilderState.BeforeHead.process(new Token.StartTag("head"), tb));
        assertEquals(TreeBuilderState.InHead, tb.state());
        assertEquals("head", tb.currentElement().nodeName());
    }

    @Test
    public void testInHeadClosesHead() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        assertTrue(TreeBuilderState.InHead.process(new Token.EndTag("head"), tb));
        assertEquals(TreeBuilderState.AfterHead, tb.state());
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testInHeadInsertsMetaAsEmptyElement() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        assertTrue(TreeBuilderState.InHead.process(new Token.StartTag("meta"), tb));
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testInBodyInsertsParagraph() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.transition(TreeBuilderState.InBody);
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("p"), tb));
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyEndParagraphPopsParagraph() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("p");
        tb.transition(TreeBuilderState.InBody);
        assertTrue(TreeBuilderState.InBody.process(new Token.EndTag("p"), tb));
        assertEquals("body", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyMapsImageTagToImg() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.transition(TreeBuilderState.InBody);
        assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("image"), tb));
        assertEquals(1, tb.getDocument().getElementsByTag("img").size());
    }

    @Test
    public void testInBodyBrEndTagInsertsBrAndReturnsFalse() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.transition(TreeBuilderState.InBody);
        assertFalse(TreeBuilderState.InBody.process(new Token.EndTag("br"), tb));
        assertEquals(1, tb.getDocument().getElementsByTag("br").size());
    }

    @Test
    public void testTextStateInsertsCharacter() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.transition(TreeBuilderState.Text);
        assertTrue(TreeBuilderState.Text.process(new Token.Character("x"), tb));
        assertEquals("x", tb.getDocument().text());
    }

    @Test
    public void testTableCreatesTbodyForRow() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);
        assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("tr"), tb));
        assertEquals("tr", tb.currentElement().nodeName());
        assertEquals(1, tb.getDocument().getElementsByTag("tbody").size());
    }

    @Test
    public void testTableRejectsBodyEndTag() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);
        assertFalse(TreeBuilderState.InTable.process(new Token.EndTag("body"), tb));
    }

    @Test
    public void testSelectInsertsOptionAndText() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.insert("select");
        tb.transition(TreeBuilderState.InSelect);
        assertTrue(TreeBuilderState.InSelect.process(new Token.StartTag("option"), tb));
        assertTrue(TreeBuilderState.InSelect.process(new Token.Character("a"), tb));
        assertEquals("a", tb.currentElement().text());
    }

    @Test
    public void testAfterBodyEndHtmlTransitions() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.transition(TreeBuilderState.AfterBody);
        assertTrue(TreeBuilderState.AfterBody.process(new Token.EndTag("html"), tb));
        assertEquals(TreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testForeignContentAcceptsToken() throws Exception {
        TreeBuilder tb = new TreeBuilder();
        assertTrue(TreeBuilderState.ForeignContent.process(new Token.Character("x"), tb));
    }
}
