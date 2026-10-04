package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class NodeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNodeName() throws Exception {
        // TextNode implements nodeName()
        TextNode textNode = new TextNode("Some text", "http://example.com");
        assertEquals("#text", textNode.nodeName());
    }













    




    @Test
    public void testOwnerDocument() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div = doc.body().appendElement("div");
        assertEquals(doc, div.ownerDocument());
    }
    

    @Test
    public void testRemove() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div = doc.body().appendElement("div");
        Element span = div.appendElement("span");
        span.remove();
        assertEquals(0, div.childNodes().size());
        assertNull(span.parent());
    }


    @Test
    public void testSiblingNodes() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.body().appendElement("div");
        Element div2 = doc.body().appendElement("div");
        List<Node> siblings = div1.siblingNodes();
        assertEquals(2, siblings.size());
        assertEquals(div1, siblings.get(0));
        assertEquals(div2, siblings.get(1));
    }

    @Test
    public void testNextSibling() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.body().appendElement("div");
        Element div2 = doc.body().appendElement("div");
        assertEquals(div2, div1.nextSibling());
    }

    @Test
    public void testNextSiblingNull() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.body().appendElement("div");
        assertNull(div1.nextSibling());
    }

    @Test
    public void testPreviousSibling() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.body().appendElement("div");
        Element div2 = doc.body().appendElement("div");
        assertEquals(div1, div2.previousSibling());
    }

    @Test
    public void testPreviousSiblingNull() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.body().appendElement("div");
        assertNull(div1.previousSibling());
    }

    @Test
    public void testSiblingIndex() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.body().appendElement("div");
        Element div2 = doc.body().appendElement("div");
        assertEquals(Integer.valueOf(0), div1.siblingIndex());
        assertEquals(Integer.valueOf(1), div2.siblingIndex());
    }
    
    @Test
    public void testOuterHtml() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div = doc.body().appendElement("div");
        div.attr("id", "test");
        // The default OutputSettings for a new Document might not indent, so direct comparison is safer.
        assertEquals("<div><div id=\"test\"></div></div>", doc.body().outerHtml());
    }

    @Test
    public void testToString() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div = doc.body().appendElement("div");
        assertEquals(div.outerHtml(), div.toString());
    }


    
    // Tests for NodeVisitor methods (head and tail) are indirectly tested by outerHtml.
    // Explicitly testing them would require mocking or complex setup not suitable here.
    // The OuterHtmlVisitor uses these methods internally.
}

