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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Import Tag class as it's required by Element constructors and not implicitly available

public class NodeTest {

    // Test setup for creating a simple node structure

    private TextNode createTextNode(String text, String baseUri) {
        return new TextNode(text, baseUri);
    }

    private Document createDocument(String baseUri) {
        return new Document(baseUri);
    }










    @Test
    public void testSetBaseUri() throws Exception {
        Document doc = createDocument("http://old.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);
        Element div2 = doc.createElement("div");
        div1.appendChild(div2);

        doc.setBaseUri("http://new.com");
        assertEquals("http://new.com", doc.baseUri());
        assertEquals("http://new.com", div1.baseUri());
        assertEquals("http://new.com", div2.baseUri());
    }





    @Test
    public void testChildNode() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        TextNode text = createTextNode("hello", "http://example.com");
        div.appendChild(text);

        assertEquals(text, div.childNode(0));
    }



    @Test
    public void testChildNodesCopy() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        TextNode text = createTextNode("hello", "http://example.com");
        div.appendChild(text);

        List<Node> copy = div.childNodesCopy();
        assertEquals(1, copy.size());
        assertEquals(text.toString(), copy.get(0).toString()); // Compare content
        assertNotSame(text, copy.get(0)); // Should be a different instance
    }


    @Test
    public void testParent() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        doc.appendChild(div);
        assertEquals(doc, div.parent());
    }


    @Test
    public void testParentNode() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        doc.appendChild(div);
        assertEquals(doc, div.parentNode());
    }


    @Test
    public void testOwnerDocument() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        doc.appendChild(div);
        assertEquals(doc, div.ownerDocument());
        assertEquals(doc, doc.ownerDocument());
    }


    @Test
    public void testRemove() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        doc.appendChild(div);
        assertEquals(1, doc.childNodeSize());
        div.remove();
        assertEquals(0, doc.childNodeSize());
        assertNull(div.parent());
    }

    @Test
    public void testBefore_String() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);
        Element div2 = doc.createElement("div");
        doc.appendChild(div2);

        div2.before("<p>Paragraph</p>");
        assertEquals(3, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof Element);
        assertEquals("p", doc.childNode(0).nodeName());
        assertEquals("Paragraph", doc.childNode(0).childNode(0).outerHtml());
        assertEquals(div1, doc.childNode(1));
        assertEquals(div2, doc.childNode(2));
    }


    @Test
    public void testAfter_String() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);
        Element div2 = doc.createElement("div");
        doc.appendChild(div2);

        div1.after("<span>Span</span>");
        assertEquals(3, doc.childNodeSize());
        assertEquals(div1, doc.childNode(0));
        assertTrue(doc.childNode(1) instanceof Element);
        assertEquals("span", doc.childNode(1).nodeName());
        assertEquals("Span", doc.childNode(1).childNode(0).outerHtml());
        assertEquals(div2, doc.childNode(2));
    }


    @Test
    public void testWrap_String() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        div.attr("id", "original");
        doc.appendChild(div);

        div.wrap("<div class='wrapper'><p>Wrapped</p></div>");

        assertEquals("wrapper", doc.childNode(0).attributes().get("class"));
        assertEquals("div", doc.childNode(0).nodeName());
        assertEquals("p", doc.childNode(0).childNode(0).nodeName());
        assertEquals("Wrapped", doc.childNode(0).childNode(0).childNode(0).outerHtml());
        assertEquals(div, doc.childNode(0).childNode(0).nextSibling()); // The original div should be a sibling of p
        assertEquals("original", doc.childNode(0).childNode(0).nextSibling().attributes().get("id"));
    }

    @Test
    public void testWrap_String_unbalanced() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        div.attr("id", "original");
        doc.appendChild(div);

        div.wrap("<div><p></p><span></span>"); // unbalanced

        assertEquals("div", doc.childNode(0).nodeName());
        assertEquals("p", doc.childNode(0).childNode(0).nodeName());
        assertEquals("span", doc.childNode(0).childNode(1).nodeName());
        assertEquals(div, doc.childNode(0).childNode(1).nextSibling()); // Original div should be last
    }

    @Test
    public void testUnwrap() throws Exception {
        Document doc = createDocument("http://example.com");
        Element divWrapper = doc.createElement("div");
        divWrapper.attr("class", "wrapper");
        Element p = doc.createElement("p");
        TextNode text = createTextNode("content", "http://example.com");
        p.appendChild(text);
        divWrapper.appendChild(p);
        doc.appendChild(divWrapper);

        Node unwrapped = divWrapper.unwrap();

        assertEquals(p, unwrapped);
        assertEquals(1, doc.childNodeSize());
        assertEquals(p, doc.childNode(0));
        assertNull(divWrapper.parent());
        assertEquals(doc, p.parent());
    }

    @Test
    public void testUnwrap_noChildren() throws Exception {
        Document doc = createDocument("http://example.com");
        Element divWrapper = doc.createElement("div");
        doc.appendChild(divWrapper);

        Node unwrapped = divWrapper.unwrap();

        assertNull(unwrapped);
        assertEquals(0, doc.childNodeSize());
        assertNull(divWrapper.parent());
    }

    @Test
    public void testReplaceWith() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);
        Element div2 = doc.createElement("div");

        div1.replaceWith(div2);

        assertEquals(1, doc.childNodeSize());
        assertEquals(div2, doc.childNode(0));
        assertNull(div1.parent());
        assertEquals(doc, div2.parent());
    }

    @Test
    public void testSiblingNodes() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);
        Element span = doc.createElement("span");
        doc.appendChild(span);
        Element div2 = doc.createElement("div");
        doc.appendChild(div2);

        List<Node> siblingsOfSpan = span.siblingNodes();
        assertEquals(2, siblingsOfSpan.size());
        assertEquals(div1, siblingsOfSpan.get(0));
        assertEquals(div2, siblingsOfSpan.get(1));
    }

    @Test
    public void testSiblingNodes_noSiblings() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);

        List<Node> siblingsOfDiv1 = div1.siblingNodes();
        assertEquals(0, siblingsOfDiv1.size());
    }


    @Test
    public void testNextSibling() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);
        Element span = doc.createElement("span");
        doc.appendChild(span);
        Element div2 = doc.createElement("div");
        doc.appendChild(div2);

        assertEquals(span, div1.nextSibling());
        assertEquals(div2, span.nextSibling());
        assertNull(div2.nextSibling());
    }


    @Test
    public void testPreviousSibling() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);
        Element span = doc.createElement("span");
        doc.appendChild(span);
        Element div2 = doc.createElement("div");
        doc.appendChild(div2);

        assertNull(div1.previousSibling());
        assertEquals(div1, span.previousSibling());
        assertEquals(span, div2.previousSibling());
    }


    @Test
    public void testSiblingIndex() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        doc.appendChild(div1);
        Element span = doc.createElement("span");
        doc.appendChild(span);
        Element div2 = doc.createElement("div");
        doc.appendChild(div2);

        assertEquals(0, div1.siblingIndex());
        assertEquals(1, span.siblingIndex());
        assertEquals(2, div2.siblingIndex());
    }

    @Test
    public void testTraverse() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        div.attr("id", "outer");
        doc.appendChild(div);
        Element p = doc.createElement("p");
        p.attr("id", "inner");
        div.appendChild(p);

        final List<String> nodeNames = new ArrayList<>();
        doc.traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {
                nodeNames.add(node.nodeName());
            }

            @Override
            public void tail(Node node, int depth) {
                // Not testing tail for this traversal test.
            }
        });

        assertEquals(3, nodeNames.size());
        assertEquals("#document", nodeNames.get(0));
        assertEquals("div", nodeNames.get(1));
        assertEquals("p", nodeNames.get(2));
    }

    @Test
    public void testOuterHtml() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        div.attr("id", "test");
        TextNode text = createTextNode("Hello", "http://example.com");
        div.appendChild(text);
        doc.appendChild(div);

        assertEquals("<div id=\"test\">Hello</div>", doc.outerHtml());
    }



    @Test
    public void testToString() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.createElement("div");
        TextNode text = createTextNode("Hello", "http://example.com");
        div.appendChild(text);
        doc.appendChild(div);

        assertEquals(doc.outerHtml(), doc.toString());
    }



    @Test
    public void testEquals_sameContent() throws Exception {
        Document doc1 = createDocument("http://example.com");
        Element div1 = doc1.createElement("div");
        div1.attr("id", "test");
        TextNode text1 = createTextNode("Hello", "http://example.com");
        div1.appendChild(text1);
        doc1.appendChild(div1);

        Document doc2 = createDocument("http://example.com");
        Element div2 = doc2.createElement("div");
        div2.attr("id", "test");
        TextNode text2 = createTextNode("Hello", "http://example.com");
        div2.appendChild(text2);
        doc2.appendChild(div2);

        assertTrue(doc1.equals(doc2));
        assertTrue(div1.equals(div2));
        assertTrue(text1.equals(text2));
    }

    @Test
    public void testEquals_differentContent() throws Exception {
        Document doc1 = createDocument("http://example.com");
        Element div1 = doc1.createElement("div");
        div1.attr("id", "test1");
        doc1.appendChild(div1);

        Document doc2 = createDocument("http://example.com");
        Element div2 = doc2.createElement("div");
        div2.attr("id", "test2");
        doc2.appendChild(div2);

        assertFalse(doc1.equals(doc2));
        assertFalse(div1.equals(div2));
    }

    @Test
    public void testHashCode_sameContent() throws Exception {
        Document doc1 = createDocument("http://example.com");
        Element div1 = doc1.createElement("div");
        div1.attr("id", "test");
        TextNode text1 = createTextNode("Hello", "http://example.com");
        div1.appendChild(text1);
        doc1.appendChild(div1);

        Document doc2 = createDocument("http://example.com");
        Element div2 = doc2.createElement("div");
        div2.attr("id", "test");
        TextNode text2 = createTextNode("Hello", "http://example.com");
        div2.appendChild(text2);
        doc2.appendChild(div2);

        assertEquals(doc1.hashCode(), doc2.hashCode());
        assertEquals(div1.hashCode(), div2.hashCode());
        assertEquals(text1.hashCode(), text2.hashCode());
    }

    @Test
    public void testClone() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.createElement("div");
        div1.attr("id", "parent");
        TextNode text = createTextNode("content", "http://example.com");
        div1.appendChild(text);
        Element div2 = doc.createElement("div");
        div2.attr("id", "child");
        div1.appendChild(div2);
        doc.appendChild(div1);

        Node clonedNode = div1.clone();

        assertNotSame(div1, clonedNode);
        assertEquals(div1.outerHtml(), clonedNode.outerHtml()); // Content should be the same
        assertNull(clonedNode.parent()); // Cloned node should be an orphan
        assertEquals(1, clonedNode.childNodeSize());
        assertNotSame(text, clonedNode.childNode(0)); // Children should also be cloned
        assertEquals("content", clonedNode.childNode(0).outerHtml());
        assertEquals(1, clonedNode.childNode(0).childNodeSize());
        assertNotSame(div2, clonedNode.childNode(0).childNode(0));
        assertEquals("child", clonedNode.childNode(0).childNode(0).nodeName());
    }
}


