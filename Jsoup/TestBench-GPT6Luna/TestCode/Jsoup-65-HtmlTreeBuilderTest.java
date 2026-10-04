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
import org.jsoup.nodes.*;

public class HtmlTreeBuilderTest {
    @Test
    public void testToStringWithoutParsing() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        try {
            builder.toString();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}
