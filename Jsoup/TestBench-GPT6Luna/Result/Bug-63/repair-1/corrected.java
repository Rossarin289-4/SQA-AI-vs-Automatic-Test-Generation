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
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Entities;
import java.util.Arrays;

public class HtmlTreeBuilderTest {
    @Test
    public void testToStringBeforeParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertEquals("TreeBuilder{currentToken=null, state=null, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringAfterInitialiseParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringReflectsTransition() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals("TreeBuilder{currentToken=null, state=InBody, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringAfterStackPush() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element element = new Element("div");
        builder.push(element);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=<div></div>}", builder.toString());
    }

    @Test
    public void testToStringShowsTopStackElement() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.push(new Element("div"));
        Element top = new Element("p");
        builder.push(top);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=<p></p>}", builder.toString());
    }

    @Test
    public void testToStringChangesAfterPop() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.push(new Element("div"));
        builder.push(new Element("p"));
        builder.pop();
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=<div></div>}", builder.toString());
    }

    @Test
    public void testToStringAfterStackBecomesEmpty() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.push(new Element("div"));
        builder.pop();
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringUsesCurrentElementAfterRemoval() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element element = new Element("section");
        builder.push(element);
        assertTrue(builder.removeFromStack(element));
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringAfterChangingStateTwice() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.transition(HtmlTreeBuilderState.InTable);
        builder.transition(HtmlTreeBuilderState.InRow);
        assertEquals("TreeBuilder{currentToken=null, state=InRow, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringAfterReinitialisationResetsStackAndState() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.push(new Element("div"));
        builder.transition(HtmlTreeBuilderState.InBody);
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringAfterParsingHasCurrentState() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.transition(HtmlTreeBuilderState.InTable);
        assertEquals("TreeBuilder{currentToken=null, state=InTable, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringStackTopChangesWithPush() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element first = new Element("html");
        builder.push(first);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=<html></html>}", builder.toString());
        Element second = new Element("body");
        builder.push(second);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=<body></body>}", builder.toString());
    }
}
