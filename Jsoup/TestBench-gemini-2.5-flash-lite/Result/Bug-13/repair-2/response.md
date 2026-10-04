```java
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
    private Element createElement(String tagName, String baseUri) {
        // Tag is not directly available here, so create Element with String tagName
        // Assuming Tag.valueOf is an internal detail of Element construction
        return new Element(Tag.valueOf(tagName), baseUri, new Attributes());
    }

    // Helper to create a Document
    private Document createDocument(String baseUri) {
        return Document.createShell(baseUri);
    }

    @Test
    public void testNodeName() throws Exception {
        Document doc = createDocument("http://example.com");
        assertEquals("#document", doc.nodeName());

        Element el = createElement("div", "http://example.com");
        assertEquals("div", el.nodeName());

        Comment comment = new Comment("test", "http://example.com");
        assertEquals("#comment", comment.nodeName());

        TextNode text = new TextNode("test", "http://example.com");
        assertEquals("#text", text.nodeName());

        DataNode data = new DataNode("test", "http://example.com");
        assertEquals("#data", data.nodeName());

        DocumentType dt = new DocumentType("html", "pub", "sys", "http://example.com");
        assertEquals("#doctype", dt.nodeName());

        // XmlDeclaration constructor is not directly visible, assuming it exists and works.
        // For testing purposes, we can rely on its existence as per API outline.
        // However, direct instantiation is not shown in API outline.
        // If XmlDeclaration has a constructor like the one below, this test will work.
        // If not, this part might need adjustment based on actual available constructors.
        // Based on the source code, XmlDeclaration(String name, String baseUri, boolean isProcessingInstruction) exists.
        XmlDeclaration xml = new XmlDeclaration("xml", "http://example.com", false);
        assertEquals("!xml", xml.nodeName());
    }

    @Test
    public void testAttr() throws Exception {
        Element el = createElement("a", "http://example.com");
        el.attr("href", "/path/to/file.html");
        assertEquals("/path/to/file.html", el.attr("href"));
        assertEquals("", el.attr("nonexistent"));

        // Test abs: prefix
        assertEquals("http://example.com/path/to/file.html", el.attr("abs:href"));
        assertEquals("", el.attr("abs:nonexistent"));
    }

    @Test
    public void testAttributes() throws Exception {
        Element el = createElement("div", "http://example.com");
        Attributes attrs = el.attributes();
        assertEquals(0, attrs.size());

        el.attr("id", "myId");
        attrs = el.attributes();
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKey("id"));
        assertEquals("myId", attrs.get("id"));
    }

    @Test
    public void testHasAttr() throws Exception {
        Element el = createElement("p", "http://example.com");
        el.attr("class", "intro");
        assertTrue(el.hasAttr("class"));
        assertFalse(el.hasAttr("id"));

        // Test abs: prefix
        el.attr("href", "/relative");
        assertTrue(el.hasAttr("abs:href"));
        assertFalse(el.hasAttr("abs:src"));
    }

    @Test
    public void testRemoveAttr() throws Exception {
        Element el = createElement("img", "http://example.com");
        el.attr("src", "/image.png");
        assertTrue(el.hasAttr("src"));
        el.removeAttr("src");
        assertFalse(el.hasAttr("src"));
    }

    @Test
    public void testBaseUri() throws Exception {
        Document doc = createDocument("http://example.com/path/");
        assertEquals("http://example.com/path/", doc.baseUri());

        Element el = createElement("a", "http://example.com/path/");
        assertEquals("http://example.com/path/", el.baseUri());

        el.setBaseUri("http://example.com/newpath/");
        assertEquals("http://example.com/newpath/", el.baseUri());
    }

    @Test
    public void testAbsUrl() throws Exception {
        Element el = createElement("a", "http://example.com/path/");
        el.attr("href", "/page.html");
        assertEquals("http://example.com/page.html", el.absUrl("href"));

        el.attr("href", "http://othersite.com/external.html");
        assertEquals("http://othersite.com/external.html", el.absUrl("href"));

        // Test with malformed base URI
        Element el2 = createElement("a", "malformed-base");
        el2.attr("href", "/page.html");
        // The behavior when baseUri is malformed and attribute is relative is to return "" if new URL(relUrl) fails.
        // If new URL(relUrl) succeeds, it returns that. Here it should succeed.
        assertEquals("http://malformed-base/page.html", el2.absUrl("href"));


        // Test with missing attribute
        Element el3 = createElement("a", "http://example.com");
        assertEquals("", el3.absUrl("href"));

        // Test with leading "?"
        Element el4 = createElement("a", "http://example.com/path");
        el4.attr("href", "?query=param");
        assertEquals("http://example.com/path?query=param", el4.absUrl("href"));
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
    public void testChildNodes() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.appendElement("div");
        // appendText returns Element, not TextNode. We need to get the actual text node child.
        doc.appendText("Some text"); 

        List<Node> children = doc.childNodes();
        assertEquals(2, children.size());
        assertTrue(children.contains(div));
        assertTrue(children.get(1) instanceof TextNode); // The appended text becomes a TextNode
        assertEquals("Some text", ((TextNode) children.get(1)).text());

        List<Node> emptyChildren = new ArrayList<>();
        assertEquals(emptyChildren, new Element(Tag.valueOf("p"), "http://example.com", new Attributes()).childNodes());
    }

    @Test
    public void testParent() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.appendElement("div");
        assertEquals(doc, div.parent());
        assertNull(doc.parent());
    }

    @Test
    public void testOwnerDocument() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div = doc.appendElement("div");
        assertEquals(doc, div.ownerDocument());
        assertEquals(doc, doc.ownerDocument());

        Element orphanDiv = createElement("div", "http://example.com");
        assertNull(orphanDiv.ownerDocument());
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
    public void testBeforeNode() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        Element div2 = doc.appendElement("div");
        Element newDiv = createElement("section", "http://example.com");

        div1.before(newDiv);
        assertEquals(3, doc.childNodes().size());
        assertEquals(newDiv, doc.childNode(0));
        assertEquals(div1, doc.childNode(1));
        assertEquals(div2, doc.childNode(2));
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
    public void testAfterNode() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        Element div2 = doc.appendElement("div");
        Element newDiv = createElement("section", "http://example.com");

        div1.after(newDiv);
        assertEquals(3, doc.childNodes().size());
        assertEquals(div1, doc.childNode(0));
        assertEquals(newDiv, doc.childNode(1));
        assertEquals(div2, doc.childNode(2));
    }

    @Test
    public void testWrap() throws Exception {
        Element div = createElement("div", "http://example.com");
        div.attr("id", "original");
        Element span = createElement("span", "http://example.com");
        span.attr("class", "wrapped");
        div.appendChild(span);

        String html = "<div class='wrapper'></div>";
        Node wrappedNode = div.wrap(html);

        assertEquals("wrapper", wrappedNode.nodeName());
        assertEquals("original", ((Element)wrappedNode).id());
        assertEquals(1, wrappedNode.childNodes().size());
        assertTrue(wrappedNode.childNode(0) instanceof Element);
        assertEquals("span", wrappedNode.childNode(0).nodeName());
        assertEquals("wrapped", ((Element)wrappedNode.childNode(0)).className());
    }

    @Test
    public void testReplaceWith() throws Exception {
        Document doc = createDocument("http://example.com");
        Element div1 = doc.appendElement("div");
        Element div2 = doc.appendElement("div");
        Element replacement = createElement("section", "http://example.com");

        div1.replaceWith(replacement);
        assertEquals(2, doc.childNodes().size());
        assertEquals(replacement, doc.childNode(0));
        assertEquals(div2, doc.childNode(1));
        assertNull(div1.parent());
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

    @Test
    public void testEquals() throws Exception {
        Document doc1 = createDocument("http://example.com");
        Document doc2 = createDocument("http://example.com");
        Document doc3 = createDocument("http://another.com");

        assertTrue(doc1.equals(doc1)); // Same instance
        assertFalse(doc1.equals(doc3)); // Different baseUri

        Element el1 = createElement("div", "http://example.com");
        Element el2 = createElement("div", "http://example.com");
        assertTrue(el1.equals(el1));
        // The equals method in Node is always false, so this comparison is expected to be false.
        assertFalse(el1.equals(el2));

        // Check against different types
        assertFalse(doc1.equals(el1));
        assertFalse(el1.equals(doc1));
    }

    @Test
    public void testHashCode() throws Exception {
        Document doc1 = createDocument("http://example.com");
        Document doc2 = createDocument("http://example.com");
        Document doc3 = createDocument("http://another.com");

        assertEquals(doc1.hashCode(), doc2.hashCode());
        // Hashcode depends on parentNode and attributes. For documents, parentNode is null.
        // Attributes are initially empty for Document.createShell.
        assertNotEquals(doc1.hashCode(), doc3.hashCode());


        Element el1 = createElement("div", "http://example.com");
        el1.attr("id", "test");
        Element el2 = createElement("div", "http://example.com");
        el2.attr("id", "test");
        // The hashCode method in Node depends on parentNode and attributes.
        // If they are not set or differ, hashCodes will differ.
        // Two separate Element instances with the same attributes will likely have different hashCodes if their parentNode is different or null.
        // If parentNode is the same, and attributes are the same, it would be equal.
        // The current implementation of Node.hashCode is simple and might not capture equality of content well.
        // Testing that two different instances do NOT have the same hashcode unless parent and attributes are identical.
        // Note: el1 and el2 have the same parentNode (null) and attributes. The `equals` method of Node returns false if they are not the same instance.
        // The hashCode implementation also uses parentNode and attributes. If these are the same, the hashCodes will be the same.
        // So, el1.hashCode() and el2.hashCode() should be equal if they have the same parentNode and attributes.
        // Let's re-evaluate. `el1` and `el2` are created with `new Element(...)`, so they are distinct objects.
        // `hashCode()` relies on `parentNode` and `attributes`. Both `el1` and `el2` have `parentNode = null` and identical `attributes`.
        // Thus, their `hashCode()` should be the same. The test `assertNotEquals(el1.hashCode(), el2.hashCode());` is incorrect for this logic.
        // We will test for equality.
        assertEquals(el1.hashCode(), el2.hashCode());
    }

    @Test
    public void testClone() throws Exception {
        Document doc = createDocument("http://example.com");
        doc.title("My Title");
        Element body = doc.body();
        Element h1 = body.appendElement("h1");
        h1.attr("class", "main");
        h1.appendText("Hello");
        body.appendElement("p");

        Node clonedDoc = doc.clone();

        // Check if it's a deep copy
        assertNotSame(doc, clonedDoc);
        assertEquals(doc.outerHtml(), clonedDoc.outerHtml());

        // Modify original, check clone is unchanged
        doc.title("New Title");
        assertEquals("My Title", clonedDoc.title());

        // Modify clone, check original is unchanged
        Element clonedH1 = (Element) clonedDoc.select("h1").get(0); // select is available on Element
        clonedH1.removeAttr("class");
        assertEquals("main", ((Element)doc.select("h1").get(0)).className()); // select is available on Element

        // Check parent/child relationships in clone
        Element clonedBody = (Element) clonedDoc.body(); // body() is available on Document
        assertEquals(clonedDoc, clonedBody.parent());
        assertEquals(2, clonedBody.childNodes().size());
        assertNull(clonedDoc.parent()); // Document is root, has no parent
        assertEquals(0, clonedDoc.siblingIndex()); // Document is root, index 0.
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
```