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

public class HtmlTreeBuilderTest {
    @Test
    public void testInitialToStringShowsNullStateAndElement() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        String result = builder.toString();
        assertTrue(result.contains("state=Initial"));
        assertTrue(result.contains("currentElement=null"));
    }

    @Test
    public void testToStringShowsTransitionedState() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.transition(HtmlTreeBuilderState.InBody);
        String result = builder.toString();
        assertTrue(result.contains("state=InBody"));
        assertTrue(result.contains("currentElement=null"));
    }

    @Test
    public void testToStringChangesWithState() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.transition(HtmlTreeBuilderState.InTable);
        String tableState = builder.toString();
        builder.transition(HtmlTreeBuilderState.InBody);
        String bodyState = builder.toString();
        assertTrue(tableState.contains("state=InTable"));
        assertTrue(bodyState.contains("state=InBody"));
        assertFalse(tableState.equals(bodyState));
    }

    @Test
    public void testToStringShowsCurrentElementAfterParseInitialization() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader("<p>"), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        String result = builder.toString();
        assertTrue(result.contains("currentElement=null"));
        assertTrue(result.contains("state=Initial"));
    }

    @Test
    public void testToStringShowsInsertedCurrentElement() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element html = builder.insertStartTag("html");
        String result = builder.toString();
        assertTrue(result.contains("currentElement=" + html.toString()));
        assertTrue(result.contains("currentElement=<html"));
    }

    @Test
    public void testToStringReflectsStackPop() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        assertTrue(builder.toString().contains("currentElement=" + body.toString()));
        builder.pop();
        assertTrue(builder.toString().contains("currentElement=<html"));
    }

    @Test
    public void testToStringIncludesCurrentTokenWhenPresent() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        String result = builder.toString();
        assertTrue(result.contains("currentToken=null"));
    }

    @Test
    public void testToStringContainsAllFieldLabels() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        String result = builder.toString();
        assertTrue(result.contains("currentToken="));
        assertTrue(result.contains(", state="));
        assertTrue(result.contains(", currentElement="));
    }

    @Test
    public void testToStringUsesCurrentElementAfterNestedInsertions() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        Element div = builder.insertStartTag("div");
        assertTrue(builder.toString().contains("currentElement=" + div.toString()));
    }

    @Test
    public void testToStringStateAndElementCanBeCheckedTogether() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element html = builder.insertStartTag("html");
        builder.transition(HtmlTreeBuilderState.InTable);
        String result = builder.toString();
        assertTrue(result.contains("state=InTable"));
        assertTrue(result.contains("currentElement=" + html.toString()));
    }

    @Test
    public void testRepeatedToStringIsStableWithoutMutation() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        String first = builder.toString();
        String second = builder.toString();
        assertEquals(first, second);
    }

    @Test
    public void testToStringUpdatesAfterAnotherTransition() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.transition(HtmlTreeBuilderState.InSelect);
        String selectState = builder.toString();
        builder.transition(HtmlTreeBuilderState.InBody);
        String bodyState = builder.toString();
        assertTrue(selectState.contains("state=InSelect"));
        assertTrue(bodyState.contains("state=InBody"));
    }
}
