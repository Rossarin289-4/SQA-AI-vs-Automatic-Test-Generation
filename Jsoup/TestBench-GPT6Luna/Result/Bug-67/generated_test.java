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
    public void testToStringWithoutParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringAfterInitialiseParse() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringShowsCurrentState() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals("TreeBuilder{currentToken=null, state=InBody, currentElement=null}", builder.toString());
    }
}
