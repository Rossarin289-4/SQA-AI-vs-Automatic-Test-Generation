package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token.Character;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.StartTag;

import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    // Test cases for the HtmlTreeBuilderState enum, covering various states and token processing.

    @Test
    public void testInitialStateHandlesWhitespace() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("   "), "http://example.com/", null, tb.defaultSettings());
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("   ");
        assertTrue(HtmlTreeBuilderState.Initial.process(whitespaceToken, tb));
        assertEquals(0, tb.getDocument().childNodeSize()); // Whitespace should be ignored
    }








    @Test
    public void testBeforeHeadIgnoresWhitespace() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader("  "), "http://example.com/", null, tb.defaultSettings());
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("  ");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(whitespaceToken, tb));
        assertEquals(0, tb.getDocument().childNodeSize()); // Whitespace should be ignored
    }




































}



