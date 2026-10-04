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
    public void testAttributesSetReplaceAndRemove() throws Exception {
        Node node = new TextNode("text", "");
        node.attr("k", "one");
        assertEquals("one", node.attr("k"));
        node.attr("k", "two");
        assertEquals("two", node.attr("k"));
        node.removeAttr("k");
        assertFalse(node.hasAttr("k"));
        assertEquals("", node.attr("k"));
    }

    @Test
    public void testAttributesCollectionIsLive() throws Exception {
        Node node = new TextNode("text", "");
        node.attr("k", "v");
        assertEquals(1, node.attributes().size());
        node.removeAttr("k");
        assertEquals(0, node.attributes().size());
    }

    @Test
    public void testBaseUriTrimmedOnConstructionAndSetExactly() throws Exception {
        Node node = new TextNode("text", "  http://example.com/a  ");
        assertEquals("http://example.com/a", node.baseUri());
        node.setBaseUri("  custom  ");
        assertEquals("  custom  ", node.baseUri());
    }

    @Test
    public void testAbsoluteUrlFromRelativeAttribute() throws Exception {
        Node node = new TextNode("text", "http://example.com/dir/page");
        node.attr("href", "../next");
        assertEquals("http://example.com/next", node.absUrl("href"));
    }

    @Test
    public void testAbsoluteUrlAlreadyAbsolute() throws Exception {
        Node node = new TextNode("text", "http://example.com/");
        node.attr("href", "https://other.example/path");
        assertEquals("https://other.example/path", node.absUrl("href"));
    }

    @Test
    public void testAbsoluteUrlQueryKeepsBasePath() throws Exception {
        Node node = new TextNode("text", "http://example.com/dir/page");
        node.attr("href", "?q=1");
        assertEquals("http://example.com/dir/page?q=1", node.absUrl("href"));
    }

    @Test
    public void testAbsoluteUrlMissingOrInvalid() throws Exception {
        Node node = new TextNode("text", "not a url");
        assertEquals("", node.absUrl("href"));
        node.attr("href", "also not a url");
        assertEquals("", node.absUrl("href"));
    }

    @Test
    public void testAbsoluteAttributeShortcutAndOrdinaryMissingAttribute() throws Exception {
        Node node = new TextNode("text", "http://example.com/base");
        node.attr("href", "child");
        assertEquals("http://example.com/child", node.attr("abs:href"));
        assertEquals("", node.attr("missing"));
    }

    @Test
    public void testChildNodesAndIndicesAfterAppending() throws Exception {
        Element parent = new Element(null, "");
        Node first = new TextNode("a", "");
        Node second = new TextNode("b", "");
        parent.appendChild(first);
        parent.appendChild(second);
        assertSame(first, parent.childNode(0));
        assertSame(second, parent.childNode(1));
        assertEquals(Integer.valueOf(0), first.siblingIndex());
        assertEquals(Integer.valueOf(1), second.siblingIndex());
        assertEquals(2, parent.childNodes().size());
    }

    @Test
    public void testParentAndOwnerDocument() throws Exception {
        Document document = new Document("http://example.com/");
        Element child = document.createElement("div");
        document.appendChild(child);
        assertSame(document, child.parent());
        assertSame(document, child.ownerDocument());
        assertSame(document, document.ownerDocument());
    }

    @Test
    public void testSiblingBoundariesAndMiddle() throws Exception {
        Element parent = new Element(null, "");
        Node first = new TextNode("a", "");
        Node middle = new TextNode("b", "");
        Node last = new TextNode("c", "");
        parent.appendChild(first);
        parent.appendChild(middle);
        parent.appendChild(last);
        assertNull(first.previousSibling());
        assertSame(middle, first.nextSibling());
        assertSame(first, middle.previousSibling());
        assertSame(last, middle.nextSibling());
        assertSame(middle, last.previousSibling());
        assertNull(last.nextSibling());
        assertEquals(3, middle.siblingNodes().size());
    }

    @Test
    public void testRemoveReindexesRemainingChildren() throws Exception {
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
        assertSame(last, first.nextSibling());
        assertEquals(Integer.valueOf(1), last.siblingIndex());
    }

    @Test
    public void testReplaceWithUpdatesTree() throws Exception {
        Element parent = new Element(null, "");
        Node oldNode = new TextNode("old", "");
        Node newNode = new TextNode("new", "");
        parent.appendChild(oldNode);
        oldNode.replaceWith(newNode);
        assertSame(newNode, parent.childNode(0));
        assertNull(oldNode.parent());
        assertSame(parent, newNode.parent());
        assertEquals(Integer.valueOf(0), newNode.siblingIndex());
    }

    @Test
    public void testChildCanBeReparented() throws Exception {
        Element firstParent = new Element(null, "");
        Element secondParent = new Element(null, "");
        Node child = new TextNode("x", "");
        firstParent.appendChild(child);
        secondParent.appendChild(child);
        assertEquals(0, firstParent.childNodes().size());
        assertSame(child, secondParent.childNode(0));
        assertSame(secondParent, child.parent());
    }

    @Test
    public void testCloneIsIndependentAndOrphaned() throws Exception {
        Element original = new Element(null, "");
        original.attr("id", "old");
        original.appendChild(new TextNode("child", ""));
        Node copy = original.clone();
        assertNull(copy.parent());
        assertEquals(1, copy.childNodes().size());
        assertEquals("old", copy.attr("id"));
        copy.attr("id", "new");
        assertEquals("old", original.attr("id"));
        assertEquals("new", copy.attr("id"));
    }

    @Test
    public void testEqualsUsesIdentity() throws Exception {
        Node node = new TextNode("x", "");
        assertTrue(node.equals(node));
        assertFalse(node.equals(new TextNode("x", "")));
    }

    @Test
    public void testHashCodeMatchesAttributesAndParentState() throws Exception {
        Node left = new TextNode("x", "");
        Node right = new TextNode("x", "");
        assertEquals(left.hashCode(), right.hashCode());
        left.attr("k", "v");
        assertTrue(left.hashCode() != right.hashCode());
    }

    @Test
    public void testOuterHtmlAndToStringAgreeForTextNode() throws Exception {
        Node node = new TextNode("sample", "");
        assertEquals("sample", node.outerHtml());
        assertEquals(node.outerHtml(), node.toString());
    }
}
