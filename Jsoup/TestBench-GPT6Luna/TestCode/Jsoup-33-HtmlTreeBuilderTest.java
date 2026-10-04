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
    @Test
    public void testToStringBeforeParsing() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        try {
            builder.toString();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testToStringIsStableBeforeParsing() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        try {
            builder.toString();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testToStringReportsInitialStateAfterEmptyParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("", "", ParseErrorList.noTracking());
        assertTrue(builder.toString().contains("state=InBody"));
    }

    @Test
    public void testToStringContainsStateAfterEmptyParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("", "", ParseErrorList.noTracking());
        assertTrue(builder.toString().contains("state=InBody"));
    }

    @Test
    public void testToStringReportsCurrentElementAfterParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("<p>x", "", ParseErrorList.noTracking());
        assertTrue(builder.toString().contains("currentElement=<p>"));
    }

    @Test
    public void testToStringReportsCurrentTokenAfterParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("<p>x", "", ParseErrorList.noTracking());
        assertTrue(builder.toString().contains("currentToken="));
    }

    @Test
    public void testToStringStableAfterParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("<p>x", "", ParseErrorList.noTracking());
        String first = builder.toString();
        assertEquals(first, builder.toString());
    }

    @Test
    public void testToStringAfterDoctypeParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("<!doctype html>", "", ParseErrorList.noTracking());
        assertTrue(builder.toString().startsWith("TreeBuilder{currentToken="));
    }

    @Test
    public void testToStringAfterCommentParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("<!--x-->", "", ParseErrorList.noTracking());
        assertTrue(builder.toString().contains(", state="));
    }

    @Test
    public void testToStringAfterBodyContentParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("<body>x</body>", "", ParseErrorList.noTracking());
        assertTrue(builder.toString().endsWith("}"));
    }

    @Test
    public void testToStringAfterTableParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("<table><tr><td>x</td></tr></table>", "", ParseErrorList.noTracking());
        assertTrue(builder.toString().contains("currentElement="));
    }

    @Test
    public void testToStringAfterFragmentParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parseFragment("x", null, "", ParseErrorList.noTracking());
        assertTrue(builder.toString().startsWith("TreeBuilder{"));
    }
}
