```java
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

public class NodeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper Node subclass for testing purposes.
    private static class TestNode extends Node {
        private String nodeName;

        public TestNode(String baseUri, Attributes attributes, String nodeName) {
            super(baseUri, attributes);
            this.nodeName = nodeName;
        }

        public TestNode(String baseUri, String nodeName) {
            super(baseUri);
            this.nodeName = nodeName;
        }

        @Override
        public String nodeName() {
            return nodeName;
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            // Simplified for testing purposes
            accum.append("<").append(nodeName).append(">");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            // Simplified for testing purposes
            accum.append("</").append(nodeName).append(">");
        }
    }

    @Test
    public void testAttr_existing() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Node node = new TestNode("http://example.com", attributes, "test");
        assertEquals("value", node.attr("key"));
    }

    @Test
    public void testAttr_nonExisting() throws Exception {
        Attributes attributes = new Attributes();
        Node node = new TestNode("http://example.com", attributes, "test");
        assertEquals("", node.attr("nonexistent"));
    }

    @Test
    public void testAttr_absPrefix() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("href", "/path/to/page");
        Node node = new TestNode("http://example.com/dir/", attributes, "test");
        assertEquals("http://example.com/path/to/page", node.attr("abs:href"));
    }
    
    @Test
    public void testAttr_absPrefix_malformedBaseUri() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("href", "page.html");
        Node node = new TestNode("invalid-uri", attributes, "test");
        // The malformed base URI will cause the relative URL to be parsed as absolute.
        // This behavior is specific to the implementation detail of URL(String).
        assertEquals("page.html", node.attr("abs:href"));
    }


    @Test
    public void testAttributes() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        Node node = new TestNode("http://example.com", attributes, "test");
        assertEquals(attributes, node.attributes());
    }

    @Test
    public void testHasAttr_true() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Node node = new TestNode("http://example.com", attributes, "test");
        assertTrue(node.hasAttr("key"));
    }

    @Test
    public void testHasAttr_false() throws Exception {
        Attributes attributes = new Attributes();
        Node node = new TestNode("http://example.com", attributes, "test");
        assertFalse(node.hasAttr("key"));
    }

    @Test
    public void testRemoveAttr_existing() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Node node = new TestNode("http://example.com", attributes, "test");
        node.removeAttr("key");
        assertFalse(node.hasAttr("key"));
    }

    @Test
    public void testRemoveAttr_nonExisting() throws Exception {
        Attributes attributes = new Attributes();
        Node node = new TestNode("http://example.com", attributes, "test");
        node.removeAttr("key"); // Should not throw an exception
        assertFalse(node.hasAttr("key"));
    }

    @Test
    public void testBaseUri() throws Exception {
        Node node = new TestNode("http://example.com", "test");
        assertEquals("http://example.com", node.baseUri());
    }

    @Test
    public void testSetBaseUri() throws Exception {
        Node node = new TestNode("http://example.com", "test");
        node.setBaseUri("http://new.com");
        assertEquals("http://new.com", node.baseUri());
    }

    @Test
    public void testAbsUrl_existingAndAbsolute() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("href", "http://external.com/page");
        Node node = new TestNode("http://example.com", attributes, "test");
        assertEquals("http://external.com/page", node.absUrl("href"));
    }

    @Test
    public void testAbsUrl_existingAndRelative() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("href", "/internal/page");
        Node node = new TestNode("http://example.com/base/", attributes, "test");
        assertEquals("http://example.com/internal/page", node.absUrl("href"));
    }
    
    @Test
    public void testAbsUrl_existingAndRelative_withQuestionMark() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("href", "?query=param");
        Node node = new TestNode("http://example.com/base/page.html", attributes, "test");
        assertEquals("http://example.com/base/page.html?query=param", node.absUrl("href"));
    }

    @Test
    public void testAbsUrl_nonExisting() throws Exception {
        Node node = new TestNode("http://example.com", "test");
        assertEquals("", node.absUrl("href"));
    }
    
    @Test
    public void testAbsUrl_malformedBaseUri_relativeAttr() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("href", "page.html");
        Node node = new TestNode("malformed-base", attributes, "test");
        assertEquals("page.html", node.absUrl("href"));
    }

    @Test
    public void testChildNode_validIndex() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child1 = new TestNode("http://example.com", "child1");
        Node child2 = new TestNode("http://example.com", "child2");
        parent.addChildren(child1, child2);
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_invalidIndex() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        parent.childNode(0);
    }

    @Test
    public void testChildNodes_empty() throws Exception {
        Node node = new TestNode("http://example.com", "test");
        assertTrue(node.childNodes().isEmpty());
    }

    @Test
    public void testChildNodes_withChildren() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child1 = new TestNode("http://example.com", "child1");
        Node child2 = new TestNode("http://example.com", "child2");
        parent.addChildren(child1, child2);
        List<Node> children = parent.childNodes();
        assertEquals(2, children.size());
        assertTrue(children.contains(child1));
        assertTrue(children.contains(child2));
    }

    @Test
    public void testParent_nullForRoot() throws Exception {
        Node node = new TestNode("http://example.com", "test");
        assertNull(node.parent());
    }

    @Test
    public void testParent_whenAttached() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child = new TestNode("http://example.com", "child");
        parent.addChildren(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testOwnerDocument_nullWhenNoParent() throws Exception {
        Node node = new TestNode("http://example.com", "test");
        assertNull(node.ownerDocument());
    }

    @Test
    public void testOwnerDocument_whenAttachedToDocument() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node = new TestNode("http://example.com", "test");
        body.appendChild(node);
        assertEquals(doc, node.ownerDocument());
    }
    
    @Test
    public void testRemove() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node = new TestNode("http://example.com", "test");
        body.appendChild(node);
        
        assertNotNull(node.parent());
        assertEquals(1, body.childNodes().size());
        
        node.remove();
        
        assertNull(node.parent());
        assertEquals(0, body.childNodes().size());
    }

    @Test
    public void testReplaceWith() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node nodeToReplace = new TestNode("http://example.com", "old");
        Node replacementNode = new TestNode("http://example.com", "new");
        
        body.appendChild(nodeToReplace);
        nodeToReplace.replaceWith(replacementNode);
        
        assertEquals(replacementNode, body.childNode(0));
        assertEquals(body, replacementNode.parent());
        assertNull(nodeToReplace.parent());
    }

    @Test
    public void testSiblingNodes_singleChild() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node = new TestNode("http://example.com", "test");
        body.appendChild(node);
        
        List<Node> siblings = node.siblingNodes();
        assertEquals(1, siblings.size());
        assertEquals(node, siblings.get(0));
    }
    
    @Test
    public void testSiblingNodes_multipleChildren() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node1 = new TestNode("http://example.com", "child1");
        Node node2 = new TestNode("http://example.com", "child2");
        Node node3 = new TestNode("http://example.com", "child3");
        body.addChildren(node1, node2, node3);
        
        List<Node> siblingsOfNode2 = node2.siblingNodes();
        assertEquals(3, siblingsOfNode2.size());
        assertEquals(node1, siblingsOfNode2.get(0));
        assertEquals(node2, siblingsOfNode2.get(1));
        assertEquals(node3, siblingsOfNode2.get(2));
    }

    @Test
    public void testNextSibling_lastElement() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node1 = new TestNode("http://example.com", "child1");
        Node node2 = new TestNode("http://example.com", "child2");
        body.addChildren(node1, node2);
        
        assertNull(node2.nextSibling());
    }

    @Test
    public void testNextSibling_middleElement() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node1 = new TestNode("http://example.com", "child1");
        Node node2 = new TestNode("http://example.com", "child2");
        Node node3 = new TestNode("http://example.com", "child3");
        body.addChildren(node1, node2, node3);
        
        assertEquals(node3, node2.nextSibling());
    }

    @Test
    public void testPreviousSibling_firstElement() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node1 = new TestNode("http://example.com", "child1");
        Node node2 = new TestNode("http://example.com", "child2");
        body.addChildren(node1, node2);
        
        assertNull(node1.previousSibling());
    }

    @Test
    public void testPreviousSibling_middleElement() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node1 = new TestNode("http://example.com", "child1");
        Node node2 = new TestNode("http://example.com", "child2");
        Node node3 = new TestNode("http://example.com", "child3");
        body.addChildren(node1, node2, node3);
        
        assertEquals(node1, node2.previousSibling());
    }

    @Test
    public void testSiblingIndex_first() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node1 = new TestNode("http://example.com", "child1");
        body.appendChild(node1);
        assertEquals(Integer.valueOf(0), node1.siblingIndex());
    }

    @Test
    public void testSiblingIndex_middle() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node1 = new TestNode("http://example.com", "child1");
        Node node2 = new TestNode("http://example.com", "child2");
        Node node3 = new TestNode("http://example.com", "child3");
        body.addChildren(node1, node2, node3);
        assertEquals(Integer.valueOf(1), node2.siblingIndex());
    }

    @Test
    public void testOuterHtml() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node node = new TestNode("http://example.com", new Attributes(), "myNode");
        node.attr("key", "value");
        body.appendChild(node);

        String expectedHtml = "<body><myNode key=\"value\"></myNode></body>";
        assertEquals(expectedHtml, doc.outerHtml());
    }

    @Test
    public void testToString() throws Exception {
        Node node = new TestNode("http://example.com", "test");
        assertEquals(node.outerHtml(), node.toString());
    }

    @Test
    public void testClone_deepCopy() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        Node originalNode = new TestNode("http://example.com", "original");
        originalNode.attr("attr", "value");
        body.appendChild(originalNode);

        Node clonedNode = originalNode.clone();

        // Check it's a different instance
        assertNotSame(originalNode, clonedNode);
        // Check it's detached (no parent)
        assertNull(clonedNode.parent());
        // Check attributes are copied
        assertEquals("value", clonedNode.attr("attr"));
        // Check baseUri is copied
        assertEquals("http://example.com", clonedNode.baseUri());
        // Check node name
        assertEquals("original", clonedNode.nodeName());

        // Modify the clone and check the original is unaffected
        clonedNode.attr("newAttr", "newValue");
        assertFalse(originalNode.hasAttr("newAttr"));
        assertEquals("value", originalNode.attr("attr"));
        
        // Check original is still attached to the document
        assertEquals(originalNode, body.childNode(0));
    }
    
    @Test
    public void testEquals_sameInstance() throws Exception {
        Node node = new TestNode("http://example.com", "test");
        assertTrue(node.equals(node));
    }

    @Test
    public void testHashCode_consistentWithEquals() throws Exception {
        Node node1 = new TestNode("http://example.com", new Attributes());
        Node node2 = new TestNode("http://example.com", new Attributes());
        Node node3 = new TestNode("http://example.com", new Attributes());
        node3.attr("key", "value");

        assertEquals(node1.hashCode(), node2.hashCode()); // Same parent (null), same attributes (empty)
        assertNotEquals(node1.hashCode(), node3.hashCode()); // Different attributes
    }

    // Visitor methods are primarily used internally by NodeTraversor,
    // so we test their effect through outerHtml.
    // However, we can test them directly if they had observable side effects.

    @Test
    public void testOuterHtmlVisitorHeadCall() throws Exception {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        Node node = new TestNode("http://example.com", "test");
        NodeTraversor traversor = new NodeTraversor(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {
                node.outerHtmlHead(accum, depth, out);
            }
            @Override
            public void tail(Node node, int depth) {}
        });
        traversor.traverse(node);
        assertEquals("<test>", accum.toString());
    }
    
    @Test
    public void testOuterHtmlVisitorTailCall() throws Exception {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        Node node = new TestNode("http://example.com", "test");
        NodeTraversor traversor = new NodeTraversor(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {}
            @Override
            public void tail(Node node, int depth) {
                node.outerHtmlTail(accum, depth, out);
            }
        });
        traversor.traverse(node);
        assertEquals("</test>", accum.toString());
    }
    
    @Test
    public void testOuterHtmlVisitorTailCall_textNode() throws Exception {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        // TextNodes are a special case in Node.java's outerHtmlTail, they are not appended.
        Node textNode = new TextNode("some text", "http://example.com");
        NodeTraversor traversor = new NodeTraversor(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {}
            @Override
            public void tail(Node node, int depth) {
                node.outerHtmlTail(accum, depth, out);
            }
        });
        traversor.traverse(textNode);
        assertEquals("", accum.toString());
    }

    @Test
    public void testAddChildren_reparentsChild() throws Exception {
        Node parent1 = new TestNode("http://example.com", "parent1");
        Node parent2 = new TestNode("http://example.com", "parent2");
        Node child = new TestNode("http://example.com", "child");

        parent1.addChildren(child);
        assertEquals(parent1, child.parent());
        assertEquals(1, parent1.childNodes().size());

        parent2.addChildren(child); // reparents the child
        assertEquals(parent2, child.parent());
        assertEquals(0, parent1.childNodes().size());
        assertEquals(1, parent2.childNodes().size());
    }
    
    @Test
    public void testAddChildren_withIndex_insertAtBeginning() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child1 = new TestNode("http://example.com", "child1");
        Node child2 = new TestNode("http://example.com", "child2");
        Node child3 = new TestNode("http://example.com", "child3");
        
        parent.addChildren(child1, child2);
        parent.addChildren(0, child3); // Insert child3 at index 0
        
        assertEquals(3, parent.childNodes().size());
        assertEquals(child3, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
        assertEquals(child2, parent.childNode(2));
    }

    @Test
    public void testAddChildren_withIndex_insertAtEnd() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child1 = new TestNode("http://example.com", "child1");
        Node child2 = new TestNode("http://example.com", "child2");
        
        parent.addChildren(child1);
        parent.addChildren(1, child2); // Insert child2 at index 1 (end)
        
        assertEquals(2, parent.childNodes().size());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
    }

    @Test
    public void testAddChildren_withIndex_insertInMiddle() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child1 = new TestNode("http://example.com", "child1");
        Node child3 = new TestNode("http://example.com", "child3");
        Node child2 = new TestNode("http://example.com", "child2");
        
        parent.addChildren(child1, child3);
        parent.addChildren(1, child2); // Insert child2 at index 1 (middle)
        
        assertEquals(3, parent.childNodes().size());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertEquals(child3, parent.childNode(2));
    }
    
    @Test
    public void testReplaceChild() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child1 = new TestNode("http://example.com", "child1");
        Node child2 = new TestNode("http://example.com", "child2");
        Node newChild = new TestNode("http://example.com", "newChild");
        
        parent.addChildren(child1, child2);
        parent.replaceChild(child1, newChild);
        
        assertEquals(2, parent.childNodes().size());
        assertEquals(newChild, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertNull(child1.parent());
        assertEquals(parent, newChild.parent());
    }

    @Test
    public void testRemoveChild() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child1 = new TestNode("http://example.com", "child1");
        Node child2 = new TestNode("http://example.com", "child2");
        
        parent.addChildren(child1, child2);
        parent.removeChild(child1);
        
        assertEquals(1, parent.childNodes().size());
        assertEquals(child2, parent.childNode(0));
        assertNull(child1.parent());
    }

    @Test
    public void testSetParentNode_null() throws Exception {
        Node parent = new TestNode("http://example.com", "parent");
        Node child = new TestNode("http://example.com", "child");
        parent.addChildren(child);
        
        child.setParentNode(null);
        assertNull(child.parent());
        assertEquals(0, parent.childNodes().size());
    }

    @Test
    public void testSetParentNode_newParent() throws Exception {
        Node parent1 = new TestNode("http://example.com", "parent1");
        Node parent2 = new TestNode("http://example.com", "parent2");
        Node child = new TestNode("http://example.com", "child");
        
        parent1.addChildren(child);
        assertEquals(parent1, child.parent());
        
        child.setParentNode(parent2);
        assertEquals(parent2, child.parent());
        assertEquals(0, parent1.childNodes().size());
        assertEquals(1, parent2.childNodes().size());
        assertEquals(child, parent2.childNode(0));
    }
}
```