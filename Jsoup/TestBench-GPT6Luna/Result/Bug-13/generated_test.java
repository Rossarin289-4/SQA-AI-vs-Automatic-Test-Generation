package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NodeTest {









    @Test
    public void testOwnerDocumentForDocumentAndAttachedElement() throws Exception {
        Document doc = new Document("http://example.com/");
        Element child = doc.createElement("p");
        doc.appendChild(child);
        assertSame(doc, doc.ownerDocument());
        assertSame(doc, child.ownerDocument());
    }













}


