package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.ArrayList;

public class HtmlTreeBuilderStateTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testInitialIgnoresWhitespace() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Character().data(" \t"), tb));
    }

    @Test
    public void testInitialCommentIsAccepted() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Comment(), tb));
    }

    @Test
    public void testInitialDoctypeTransitionsToBeforeHtml() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.Doctype d = new Token.Doctype();
        assertTrue(HtmlTreeBuilderState.Initial.process(d, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlRejectsUnexpectedEndTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(new Token.EndTag().name("x"), tb));
    }

    @Test
    public void testBeforeHeadIgnoresWhitespace() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Character().data("\n"), tb));
    }

    @Test
    public void testInHeadRejectsDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.InHead.process(new Token.Doctype(), tb));
    }

    @Test
    public void testInHeadNoscriptClosesNoscript() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag().name("noscript"), tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterHeadRejectsHeadStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag().name("head"), tb));
    }

    @Test
    public void testInBodyRejectsNullCharacter() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.InBody.process(new Token.Character().data("\u0000"), tb));
    }

    @Test
    public void testInBodyAcceptsOrdinaryCharacter() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.Character().data("x"), tb));
    }

    @Test
    public void testInBodyCreatesMissingParagraphOnClose() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.EndTag().name("p"), tb));
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    @Test
    public void testTextInsertsCharacters() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element el = new Element(Tag.valueOf("title"), "");
        tb.push(el);
        assertTrue(HtmlTreeBuilderState.Text.process(new Token.Character().data("x"), tb));
        assertEquals("x", el.text());
    }

    @Test
    public void testInTableRejectsDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.InTable.process(new Token.Doctype(), tb));
    }

    @Test
    public void testInTableTextBuffersCharacterData() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.newPendingTableCharacters();
        assertTrue(HtmlTreeBuilderState.InTableText.process(new Token.Character().data("x"), tb));
        assertEquals(1, tb.getPendingTableCharacters().size());
        assertEquals("x", tb.getPendingTableCharacters().get(0));
    }

    @Test
    public void testInSelectRejectsDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(HtmlTreeBuilderState.InSelect.process(new Token.Doctype(), tb));
    }

    @Test
    public void testForeignContentAcceptsToken() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.Character().data("x"), tb));
    }
}
