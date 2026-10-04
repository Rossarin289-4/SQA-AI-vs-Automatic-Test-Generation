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

public class NodeTest {
    @Test
    public void testAttributeSetGetAndRemove() throws Exception {
        Element element = new Element(Tag.valueOf("a"), "http://example.com/");
        element.attr("href", "page");
        assertEquals("page", element.attr("href"));
        assertTrue(element.hasAttr("href"));
        element.removeAttr("href");
        assertFalse(element.hasAttr("href"));
        assertEquals("", element.attr("href"));
    }

    @Test
    public void testMissingAbsoluteAttribute() throws Exception {
        Element element = new Element(Tag.valueOf("a"), "http://example.com/");
        assertEquals("", element.absUrl("href"));
        assertEquals("", element.attr("abs:href"));
    }

    @Test
    public void testRelativeAbsoluteUrl() throws Exception {
        Element element = new Element(Tag.valueOf("a"), "http://example.com/dir/");
        element.attr("href", "page");
        assertEquals("http://example.com/dir/page", element.absUrl("href"));
        assertEquals("http://example.com/dir/page", element.attr("abs:href"));
        assertTrue(element.hasAttr("abs:href"));
    }

    @Test
    public void testUnresolvableAbsoluteAttributeDoesNotCountAsPresent() throws Exception {
        Element element = new Element(Tag.valueOf("a"), "");
        element.attr("href", "relative");
        assertEquals("", element.absUrl("href"));
        assertFalse(element.hasAttr("abs:href"));
    }

    @Test
    public void testBaseUriIsTrimmedAtConstructionAndSetOnNode() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "  http://example.com/  ");
        assertEquals("http://example.com/", element.baseUri());
        element.setBaseUri("new-base");
        assertEquals("new-base", element.baseUri());
    }

    @Test
    public void testSetBaseUriUpdatesDescendants() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "old");
        Element child = new Element(Tag.valueOf("p"), "old");
        parent.appendChild(child);
        parent.setBaseUri("changed");
        assertEquals("changed", parent.baseUri());
        assertEquals("changed", child.baseUri());
    }

    @Test
    public void testChildBoundariesAndSize() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = new Element(Tag.valueOf("p"), "");
        Element last = new Element(Tag.valueOf("b"), "");
        parent.appendChild(first);
        parent.appendChild(last);
        assertEquals(2, parent.childNodeSize());
        assertSame(first, parent.childNode(0));
        assertSame(last, parent.childNode(1));
    }

    @Test
    public void testChildNodesCopyIsIndependent() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        List<Node> copy = parent.childNodesCopy();
        assertEquals(1, copy.size());
        assertNotSame(child, copy.get(0));
        ((Element) copy.get(0)).attr("id", "copy");
        assertEquals("", child.attr("id"));
    }

    @Test
    public void testParentAndOwnerDocument() throws Exception {
        Document document = new Document("");
        Element child = new Element(Tag.valueOf("p"), "");
        document.appendChild(child);
        assertSame(document, child.parent());
        assertSame(document, child.parentNode());
        assertSame(document, child.ownerDocument());
        assertSame(document, document.ownerDocument());
    }

    @Test
    public void testSiblingNavigationAndReindexAfterRemoval() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = new Element(Tag.valueOf("i"), "");
        Element middle = new Element(Tag.valueOf("b"), "");
        Element last = new Element(Tag.valueOf("u"), "");
        parent.appendChild(first);
        parent.appendChild(middle);
        parent.appendChild(last);
        assertSame(middle, first.nextSibling());
        assertSame(first, middle.previousSibling());
        assertEquals(2, middle.siblingNodes().size());
        middle.remove();
        assertEquals(1, last.siblingIndex());
        assertSame(last, first.nextSibling());
        assertNull(first.previousSibling());
    }

    @Test
    public void testReplaceWithPreservesPosition() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element oldChild = new Element(Tag.valueOf("p"), "");
        Element newChild = new Element(Tag.valueOf("b"), "");
        parent.appendChild(oldChild);
        oldChild.replaceWith(newChild);
        assertSame(newChild, parent.childNode(0));
        assertNull(oldChild.parent());
        assertSame(parent, newChild.parent());
    }

    @Test
    public void testBeforeAndAfterHtml() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element center = new Element(Tag.valueOf("i"), "");
        parent.appendChild(center);
        center.before("<b></b>");
        center.after("<u></u>");
        assertEquals("div", parent.tagName());
        assertEquals("b", ((Element) parent.childNode(0)).tagName());
        assertSame(center, parent.childNode(1));
        assertEquals("u", ((Element) parent.childNode(2)).tagName());
    }

    @Test
    public void testUnwrapMovesChildrenToParent() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element wrapper = new Element(Tag.valueOf("span"), "");
        Element child = new Element(Tag.valueOf("b"), "");
        parent.appendChild(wrapper);
        wrapper.appendChild(child);
        assertSame(child, wrapper.unwrap());
        assertEquals(1, parent.childNodeSize());
        assertSame(child, parent.childNode(0));
        assertNull(wrapper.parent());
    }

    @Test
    public void testWrapPlacesNodeInsideDeepestWrapper() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        assertSame(child, child.wrap("<section><b></b></section>"));
        Element section = (Element) parent.childNode(0);
        Element bold = (Element) section.childNode(0);
        assertSame(child, bold.childNode(0));
    }

    @Test
    public void testTraverseDepthFirstHeadAndTail() throws Exception {
        final List<String> events = new ArrayList<String>();
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        root.appendChild(child);
        Node result = root.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                events.add("H" + node.nodeName() + depth);
            }
            public void tail(Node node, int depth) {
                events.add("T" + node.nodeName() + depth);
            }
        });
        assertSame(root, result);
        assertEquals(4, events.size());
        assertEquals("Hdiv0", events.get(0));
        assertEquals("Hp1", events.get(1));
        assertEquals("Tp1", events.get(2));
        assertEquals("Tdiv0", events.get(3));
    }

    @Test
    public void testOuterHtmlAndToString() throws Exception {
        Element element = new Element(Tag.valueOf("p"), "");
        element.appendText("text");
        assertEquals("<p>text</p>", element.outerHtml());
        assertEquals(element.outerHtml(), element.toString());
    }

    @Test
    public void testEqualityAndHashCodeIgnoreParentPosition() throws Exception {
        Element left = new Element(Tag.valueOf("p"), "");
        Element right = new Element(Tag.valueOf("p"), "");
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(left);
        parent.appendChild(right);
        assertEquals(left, right);
        assertEquals(left.hashCode(), right.hashCode());
    }

    @Test
    public void testCloneIsDetachedDeepCopy() throws Exception {
        Element original = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        original.attr("id", "root");
        child.attr("class", "item");
        original.appendChild(child);
        Node copy = original.clone();
        assertNull(copy.parent());
        assertEquals(original, copy);
        assertNotSame(original.childNode(0), copy.childNode(0));
        ((Element) copy).attr("id", "copy");
        assertEquals("root", original.attr("id"));
    }

    @Test
    public void testAbsoluteAttributeRequiresNonemptyKey() throws Exception {
        Element element = new Element(Tag.valueOf("a"), "");
        try {
            element.absUrl("");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals("", element.attr("href"));
    }
}
