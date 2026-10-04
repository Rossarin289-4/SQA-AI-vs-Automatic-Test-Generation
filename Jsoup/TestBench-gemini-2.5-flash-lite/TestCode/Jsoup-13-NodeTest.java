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
import java.util.Map;

public class NodeTest {

    // Helper to create a basic Element for testing

    // Helper to create a Document
    private Document createDocument(String baseUri) {
        return Document.createShell(baseUri);
    }








    @Test
    public void testChildNode() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.appendElement("div");
        Element span = div.appendElement("span");

        assertEquals(div, doc.childNode(0));
        assertEquals(span, div.childNode(0));
        try {
            doc.childNode(1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }


    @Test
    public void testParent() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.appendElement("div");
        assertEquals(doc, div.parent());
        assertNull(doc.parent());
    }


    @Test
    public void testRemove() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.appendElement("div");
        Element span = div.appendElement("span");
        doc.appendChild(span); // Add span as a direct child too

        assertEquals(2, doc.childNodes().size());
        assertEquals(1, div.childNodes().size());

        span.remove();
        assertFalse(doc.childNodes().contains(span));
        assertEquals(1, doc.childNodes().size());
        assertEquals(0, div.childNodes().size());

        div.remove();
        assertFalse(doc.childNodes().contains(div));
        assertEquals(0, doc.childNodes().size());
    }

    @Test
    public void testBeforeString() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        div1.before("<p>New Para</p>");

        assertEquals(2, doc.childNodes().size());
        assertTrue(doc.childNode(0) instanceof Element);
        assertEquals("p", doc.childNode(0).nodeName());
        assertEquals("New Para", ((TextNode)doc.childNode(0).childNode(0)).text()); // Corrected access to text
        assertEquals(div1, doc.childNode(1));
    }


    @Test
    public void testAfterString() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        div1.after("<p>After Para</p>");

        assertEquals(2, doc.childNodes().size());
        assertEquals(div1, doc.childNode(0));
        assertTrue(doc.childNode(1) instanceof Element);
        assertEquals("p", doc.childNode(1).nodeName());
        assertEquals("After Para", ((TextNode)doc.childNode(1).childNode(0)).text()); // Corrected access to text
    }




    @Test
    public void testSiblingNodes() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        Element p1 = doc.appendElement("p");
        Element div2 = doc.appendElement("div");

        List<Node> siblingsOfP1 = p1.siblingNodes();
        assertEquals(3, siblingsOfP1.size());
        assertEquals(div1, siblingsOfP1.get(0));
        assertEquals(p1, siblingsOfP1.get(1));
        assertEquals(div2, siblingsOfP1.get(2));
    }

    @Test
    public void testNextSibling() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        doc.appendText("Some text"); // Append text to document
        Element div2 = doc.appendElement("div");

        assertEquals(doc.childNode(1), div1.nextSibling());
        assertEquals(div2, doc.childNode(1).nextSibling());
        assertNull(div2.nextSibling());
        assertNull(doc.nextSibling()); // Document has no siblings
    }

    @Test
    public void testPreviousSibling() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        doc.appendText("Some text"); // Append text to document
        Element div2 = doc.appendElement("div");

        assertNull(div1.previousSibling());
        assertEquals(div1, doc.childNode(1).previousSibling());
        assertEquals(doc.childNode(1), div2.previousSibling());
        assertNull(doc.previousSibling()); // Document has no siblings
    }

    @Test
    public void testSiblingIndex() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        doc.appendText("Some text"); // Append text to document
        Element div2 = doc.appendElement("div");

        assertEquals(0, div1.siblingIndex());
        assertEquals(1, doc.childNode(1).siblingIndex());
        assertEquals(2, div2.siblingIndex());
        assertEquals(0, doc.siblingIndex()); // Document has no siblings, index is 0.
    }

    @Test
    public void testOuterHtml() throws Exception {
        Document doc = createDocument("http://example.com");
        doc.title("My Title");
        Element body = doc.body();
        body.appendElement("h1").text("Hello");
        body.appendElement("p").text("World");

        String html = doc.outerHtml();
        assertTrue(html.contains("<!DOCTYPE html>"));
        assertTrue(html.contains("<head>"));
        assertTrue(html.contains("<title>My Title</title>"));
        assertTrue(html.contains("<body>"));
        assertTrue(html.contains("<h1>Hello</h1>"));
        assertTrue(html.contains("<p>World</p>"));
        assertTrue(html.contains("</body>"));
        assertTrue(html.contains("</html>"));
    }

    @Test
    public void testToString() throws Exception {
        Document doc = createDocument("http://example.com");
        doc.title("My Title");
        Element body = doc.body();
        body.appendElement("h1").text("Hello");

        assertEquals(doc.outerHtml(), doc.toString());
    }




    // Test case for head and tail methods.
    // These methods are abstract in Node, but concrete implementations are expected for subclasses.
    // In the context of testing Node, we usually test through its concrete subclasses or
    // via methods that use them (like outerHtml).
    // The OuterHtmlVisitor uses outerHtmlHead and outerHtmlTail.
    // Testing these directly is complex and often involves mocking or deep knowledge of the visitor pattern.
    // Given the constraints, we'll focus on testing through outerHtml, which implicitly tests these.
    // If direct testing is required, we'd need to instantiate a concrete Node subclass and call these methods.
    // For demonstration, let's test with an Element, which has concrete implementations.
    @Test
    public void testOuterHtmlHeadAndTailCoverage() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.appendElement("div");
        div.attr("id", "testDiv");
        
        // outerHtml delegates to NodeTraversor, which calls head and tail.
        // The actual content of outerHtmlHead and outerHtmlTail is in the Node subclasses.
        // We can't directly test the abstract methods here, but we can assert that
        // outerHtml produces the expected output, implying these methods are called and work correctly.
        String html = div.outerHtml();
        assertTrue(html.contains("<div id=\"testDiv\"></div>")); // Basic check
    }
}


