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

public class NodeTest {
    @Test
    public void testAttributesAndMissingAttribute() throws Exception {
        Node node = new Element(null, "http://example.com/");
        assertEquals("", node.attr("href"));
        assertFalse(node.hasAttr("href"));
    }

    @Test
    public void testSetAndRemoveAttribute() throws Exception {
        Node node = new Element(null, "http://example.com/");
        assertSame(node, node.attr("href", "first"));
        node.attr("href", "second");
        assertEquals("second", node.attr("href"));
        assertTrue(node.hasAttr("href"));
        assertSame(node, node.removeAttr("href"));
        assertEquals("", node.attr("href"));
        assertFalse(node.hasAttr("href"));
    }

    @Test
    public void testAttributesReturnsMutableAttributeSet() throws Exception {
        Node node = new Element(null, "http://example.com/");
        node.attributes().put("id", "x");
        assertEquals("x", node.attr("id"));
    }

    @Test
    public void testBaseUriTrimmedAtConstructionAndSetExactly() throws Exception {
        Node node = new TextNode("x", "  http://example.com/  ");
        assertEquals("http://example.com/", node.baseUri());
        node.setBaseUri("  http://other.example/  ");
        assertEquals("  http://other.example/  ", node.baseUri());
    }

    @Test
    public void testAbsoluteAndRelativeUrls() throws Exception {
        Node node = new Element(null, "http://example.com/path/");
        node.attr("href", "../next");
        assertEquals("http://example.com/next", node.absUrl("href"));
        assertEquals("http://example.com/next", node.attr("abs:href"));
        node.attr("href", "https://other.example/item");
        assertEquals("https://other.example/item", node.absUrl("href"));
    }

    @Test
    public void testAbsoluteUrlMissingOrInvalid() throws Exception {
        Node node = new Element(null, "not a URL");
        assertEquals("", node.absUrl("href"));
        node.attr("href", "http://example.com/");
        assertEquals("http://example.com/", node.absUrl("href"));
        node.attr("href", "http://[");
        assertEquals("", node.absUrl("href"));
    }

    @Test
    public void testAbsoluteUrlUsesBaseWhenBaseIsValid() throws Exception {
        Node node = new Element(null, "http://example.com/root/");
        node.attr("href", "");
        assertEquals("http://example.com/root/", node.absUrl("href"));
    }

    @Test
    public void testChildNodesAndIndex() throws Exception {
        Element parent = new Element(null, "");
        Node first = new TextNode("a", "");
        Node last = new TextNode("b", "");
        parent.appendChild(first);
        parent.appendChild(last);
        assertEquals(2, parent.childNodes().size());
        assertSame(first, parent.childNode(0));
        assertSame(last, parent.childNode(1));
    }

    @Test
    public void testParentAndOwnerDocument() throws Exception {
        Document doc = new Document("http://example.com/");
        Element child = doc.createElement("div");
        doc.appendChild(child);
        assertSame(doc, child.parent());
        assertSame(doc, child.ownerDocument());
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testDetachedNodeHasNoParentOrDocument() throws Exception {
        Node node = new TextNode("x", "");
        assertNull(node.parent());
        assertNull(node.ownerDocument());
        assertNull(node.nextSibling());
    }

    @Test
    public void testSiblingNavigationAndIndices() throws Exception {
        Element parent = new Element(null, "");
        Node first = new TextNode("a", "");
        Node middle = new TextNode("b", "");
        Node last = new TextNode("c", "");
        parent.appendChild(first);
        parent.appendChild(middle);
        parent.appendChild(last);
        assertEquals(Integer.valueOf(0), first.siblingIndex());
        assertEquals(Integer.valueOf(1), middle.siblingIndex());
        assertEquals(Integer.valueOf(2), last.siblingIndex());
        assertNull(first.previousSibling());
        assertSame(middle, first.nextSibling());
        assertSame(first, middle.previousSibling());
        assertSame(last, middle.nextSibling());
        assertSame(middle, last.previousSibling());
        assertNull(last.nextSibling());
        assertEquals(3, middle.siblingNodes().size());
    }

    @Test
    public void testRemoveUpdatesParentAndSiblingIndices() throws Exception {
        Element parent = new Element(null, "");
        Node first = new TextNode("a", "");
        Node removed = new TextNode("b", "");
        Node last = new TextNode("c", "");
        parent.appendChild(first);
        parent.appendChild(removed);
        parent.appendChild(last);
        removed.remove();
        assertNull(removed.parent());
        assertEquals(2, parent.childNodes().size());
        assertSame(last, parent.childNode(1));
        assertEquals(Integer.valueOf(1), last.siblingIndex());
    }

    @Test
    public void testReplaceWithUpdatesTree() throws Exception {
        Element parent = new Element(null, "");
        Node old = new TextNode("old", "");
        Node replacement = new TextNode("new", "");
        parent.appendChild(old);
        old.replaceWith(replacement);
        assertNull(old.parent());
        assertSame(parent, replacement.parent());
        assertSame(replacement, parent.childNode(0));
        assertEquals(Integer.valueOf(0), replacement.siblingIndex());
    }

    @Test
    public void testReparentingMovesNodeAndReindexes() throws Exception {
        Element firstParent = new Element(null, "");
        Element secondParent = new Element(null, "");
        Node moving = new TextNode("x", "");
        Node remain = new TextNode("y", "");
        firstParent.appendChild(moving);
        firstParent.appendChild(remain);
        secondParent.appendChild(moving);
        assertEquals(1, firstParent.childNodes().size());
        assertSame(remain, firstParent.childNode(0));
        assertEquals(Integer.valueOf(0), remain.siblingIndex());
        assertSame(moving, secondParent.childNode(0));
    }

    @Test
    public void testChildNodesListIsUnmodifiable() throws Exception {
        Element parent = new Element(null, "");
        parent.appendChild(new TextNode("x", ""));
        try {
            parent.childNodes().clear();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals(1, parent.childNodes().size());
    }

    @Test
    public void testOuterHtmlAndToStringForText() throws Exception {
        Node node = new TextNode("hello", "");
        assertEquals("hello", node.outerHtml());
        assertEquals("hello", node.toString());
    }

    @Test
    public void testOuterHtmlForComment() throws Exception {
        Node node = new Comment("note", "");
        assertEquals("<!--note-->", node.outerHtml());
    }

    @Test
    public void testEqualityUsesIdentity() throws Exception {
        Node node = new TextNode("x", "");
        Node sameContent = new TextNode("x", "");
        assertTrue(node.equals(node));
        assertFalse(node.equals(sameContent));
        assertFalse(node.equals(null));
    }

    @Test
    public void testHashCodeStableForDetachedNode() throws Exception {
        Node node = new TextNode("x", "");
        int hash = node.hashCode();
        assertEquals(hash, node.hashCode());
    }
}
