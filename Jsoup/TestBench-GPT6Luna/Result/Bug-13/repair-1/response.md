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

public class NodeTest {
    @Test
    public void testAttributeLookupAndMissingValue() throws Exception {
        Element node = new Element(Tag.valueOf("a"), "http://example.com/");
        node.attr("href", "page");
        assertEquals("page", node.attr("href"));
        assertEquals("", node.attr("missing"));
    }

    @Test
    public void testHasAndRemoveAttribute() throws Exception {
        Element node = new Element(Tag.valueOf("a"), "");
        node.attr("href", "page");
        assertTrue(node.hasAttr("href"));
        node.removeAttr("href");
        assertFalse(node.hasAttr("href"));
    }

    @Test
    public void testAbsoluteAttributeLookupAndPrefix() throws Exception {
        Element node = new Element(Tag.valueOf("a"), "http://example.com/dir/");
        node.attr("href", "page");
        assertEquals("http://example.com/dir/page", node.absUrl("href"));
        assertEquals("http://example.com/dir/page", node.attr("abs:href"));
    }

    @Test
    public void testAbsoluteUrlQueryKeepsBasePath() throws Exception {
        Element node = new Element(Tag.valueOf("a"), "http://example.com/dir/page");
        node.attr("href", "?q=x");
        assertEquals("http://example.com/dir/page?q=x", node.absUrl("href"));
    }

    @Test
    public void testAbsoluteUrlWithInvalidBaseAndAbsoluteAttribute() throws Exception {
        Element node = new Element(Tag.valueOf("a"), "not-a-url");
        node.attr("href", "https://example.com/p");
        assertEquals("https://example.com/p", node.absUrl("href"));
    }

    @Test
    public void testInvalidAbsoluteUrlReturnsEmpty() throws Exception {
        Element node = new Element(Tag.valueOf("a"), "not-a-url");
        node.attr("href", "relative");
        assertEquals("", node.absUrl("href"));
    }

    @Test
    public void testBaseUriTrimsConstructorInputAndSetterPreservesInput() throws Exception {
        Element node = new Element(Tag.valueOf("a"), "  http://example.com/  ");
        assertEquals("http://example.com/", node.baseUri());
        node.setBaseUri("  next  ");
        assertEquals("  next  ", node.baseUri());
    }

    @Test
    public void testChildAdditionsAndSiblingIndices() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = new Element(Tag.valueOf("p"), "");
        Element second = new Element(Tag.valueOf("p"), "");
        parent.appendChild(first);
        parent.appendChild(second);
        assertEquals(2, parent.childNodes().size());
        assertSame(first, parent.childNode(0));
        assertSame(second, parent.childNode(1));
        assertEquals(0, first.siblingIndex());
        assertEquals(1, second.siblingIndex());
    }

    @Test
    public void testSiblingNavigationAtBothEdges() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = new Element(Tag.valueOf("p"), "");
        Element last = new Element(Tag.valueOf("p"), "");
        parent.appendChild(first);
        parent.appendChild(last);
        assertNull(first.previousSibling());
        assertSame(last, first.nextSibling());
        assertSame(first, last.previousSibling());
        assertNull(last.nextSibling());
    }

    @Test
    public void testOwnerDocumentForDocumentAndAttachedElement() throws Exception {
        Document doc = new Document("http://example.com/");
        Element child = doc.createElement("p");
        doc.appendChild(child);
        assertSame(doc, doc.ownerDocument());
        assertSame(doc, child.ownerDocument());
    }

    @Test
    public void testRemoveDetachesChildAndReindexesFollowingChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = new Element(Tag.valueOf("p"), "");
        Element second = new Element(Tag.valueOf("p"), "");
        parent.appendChild(first);
        parent.appendChild(second);
        first.remove();
        assertNull(first.parent());
        assertSame(second, parent.childNode(0));
        assertEquals(0, second.siblingIndex());
    }

    @Test
    public void testInsertHtmlBeforeAndAfter() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element middle = new Element(Tag.valueOf("i"), "");
        parent.appendChild(middle);
        middle.before("<b></b>");
        middle.after("<u></u>");
        assertEquals("b", parent.childNode(0).nodeName());
        assertSame(middle, parent.childNode(1));
        assertEquals("u", parent.childNode(2).nodeName());
        assertEquals(3, parent.childNodes().size());
    }

    @Test
    public void testWrapNestsOriginalNode() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        assertSame(child, child.wrap("<section><b></b></section>"));
        assertEquals("section", parent.childNode(0).nodeName());
        assertSame(child, parent.childNode(0).childNode(0).childNode(0));
        assertSame(parent, parent.childNode(0).parent());
    }

    @Test
    public void testReplaceWithUpdatesParentAndDetachesOriginal() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element oldNode = new Element(Tag.valueOf("p"), "");
        Element replacement = new Element(Tag.valueOf("span"), "");
        parent.appendChild(oldNode);
        oldNode.replaceWith(replacement);
        assertSame(replacement, parent.childNode(0));
        assertNull(oldNode.parent());
        assertSame(parent, replacement.parent());
    }

    @Test
    public void testSiblingNodesIncludeSelfAndAreUnmodifiable() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        assertEquals(1, child.siblingNodes().size());
        assertSame(child, child.siblingNodes().get(0));
        try {
            child.siblingNodes().clear();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertSame(child, parent.childNode(0));
    }

    @Test
    public void testOuterHtmlAndToStringMatchForElement() throws Exception {
        Element node = new Element(Tag.valueOf("p"), "");
        node.appendText("x");
        assertEquals("<p>x</p>", node.outerHtml());
        assertEquals(node.outerHtml(), node.toString());
    }

    @Test
    public void testEqualityIsIdentityBased() throws Exception {
        Element first = new Element(Tag.valueOf("p"), "");
        Element same = first;
        Element other = new Element(Tag.valueOf("p"), "");
        assertTrue(first.equals(same));
        assertFalse(first.equals(other));
    }

    @Test
    public void testCloneIsIndependentAndDetached() throws Exception {
        Element original = new Element(Tag.valueOf("div"), "");
        original.attr("id", "one");
        Element child = new Element(Tag.valueOf("p"), "");
        original.appendChild(child);
        Node copy = original.clone();
        assertNull(copy.parent());
        assertEquals("one", copy.attr("id"));
        assertEquals(1, copy.childNodes().size());
        assertNull(copy.childNode(0).parent().parent());
        copy.attr("id", "two");
        assertEquals("one", original.attr("id"));
    }

    @Test
    public void testAttributesReturnsLiveAttributeSet() throws Exception {
        Element node = new Element(Tag.valueOf("p"), "");
        Attributes attrs = node.attributes();
        assertEquals(0, attrs.size());
        node.attr("id", "x");
        assertEquals(1, attrs.size());
        assertEquals("x", attrs.get("id"));
    }

    @Test
    public void testHashCodeIncludesAttributesAndParent() throws Exception {
        Element node = new Element(Tag.valueOf("p"), "");
        int initial = node.hashCode();
        node.attr("id", "x");
        assertEquals(node.attributes().hashCode(), node.hashCode());

        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(node);
        assertEquals(31 * parent.hashCode() + node.attributes().hashCode(), node.hashCode());
        assertNotEquals(initial, node.hashCode());
    }

    @Test
    public void testCloneHashCodeTracksCopiedAttributes() throws Exception {
        Element original = new Element(Tag.valueOf("p"), "");
        original.attr("id", "x");
        Node clone = original.clone();
        assertEquals(original.attributes().hashCode(), clone.hashCode());
        clone.attr("id", "y");
        assertEquals(clone.attributes().hashCode(), clone.hashCode());
        assertNotEquals(original.hashCode(), clone.hashCode());
    }

    @Test
    public void testNestedParentHashCodeChain() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element parent = new Element(Tag.valueOf("section"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        root.appendChild(parent);
        parent.appendChild(child);
        assertEquals(31 * parent.hashCode() + child.attributes().hashCode(), child.hashCode());
    }

    @Test
    public void testEmptyAttributesHashCode() throws Exception {
        Element node = new Element(Tag.valueOf("p"), "");
        assertEquals(node.attributes().hashCode(), node.hashCode());
    }
}
```