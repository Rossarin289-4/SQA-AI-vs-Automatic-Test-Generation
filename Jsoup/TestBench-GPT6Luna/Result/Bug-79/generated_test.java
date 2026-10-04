package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import java.util.Collections;
import java.util.List;

public class LeafNodeTest {
    @Test
    public void testTextNodeCoreAttribute() throws Exception {
        TextNode node = new TextNode("text");
        assertEquals("", node.attr("text"));
        assertEquals("", node.attr("other"));
    }

    @Test
    public void testSetCoreAttribute() throws Exception {
        TextNode node = new TextNode("old");
        node.attr("text", "new");
        assertEquals("new", node.attr("text"));
    }

    @Test
    public void testSetOtherAttributePreservesCoreValue() throws Exception {
        TextNode node = new TextNode("body");
        node.attr("title", "caption");
        assertEquals("", node.attr("text"));
        assertEquals("caption", node.attr("title"));
    }

    @Test
    public void testAttributeMapAndCoreValueReplacement() throws Exception {
        TextNode node = new TextNode("body");
        node.attr("title", "caption");
        node.attr("text", "changed");
        assertEquals("changed", node.attr("text"));
        assertEquals("caption", node.attr("title"));
    }

    @Test
    public void testAttributesExposeConfiguredValues() throws Exception {
        TextNode node = new TextNode("body");
        node.attr("title", "caption");
        assertEquals("", node.attributes().get("text"));
        assertEquals("caption", node.attributes().get("title"));
    }

    @Test
    public void testAttributesMaterializeCoreValue() throws Exception {
        TextNode node = new TextNode("body");
        assertEquals("", node.attributes().get("text"));
        assertEquals("", node.attr("text"));
    }

    @Test
    public void testHasAttrForCoreAttribute() throws Exception {
        TextNode node = new TextNode("body");
        assertFalse(node.hasAttr("text"));
        assertFalse(node.hasAttr("title"));
    }

    @Test
    public void testHasAttrForAdditionalAttribute() throws Exception {
        TextNode node = new TextNode("body");
        node.attr("title", "caption");
        assertTrue(node.hasAttr("title"));
        assertFalse(node.hasAttr("missing"));
    }

    @Test
    public void testRemoveCoreAttribute() throws Exception {
        TextNode node = new TextNode("body");
        node.removeAttr("text");
        assertFalse(node.hasAttr("text"));
        assertEquals("", node.attr("text"));
    }

    @Test
    public void testRemoveAdditionalAttributePreservesCoreValue() throws Exception {
        TextNode node = new TextNode("body");
        node.attr("title", "caption");
        node.removeAttr("title");
        assertEquals("", node.attr("text"));
        assertFalse(node.hasAttr("title"));
    }

    @Test
    public void testRemoveMissingAttribute() throws Exception {
        TextNode node = new TextNode("body");
        node.removeAttr("missing");
        assertEquals("", node.attr("text"));
        assertFalse(node.hasAttr("missing"));
    }

    @Test
    public void testAbsUrlWithoutUrlAttribute() throws Exception {
        TextNode node = new TextNode("body");
        assertEquals("", node.absUrl("href"));
    }

    @Test
    public void testAbsUrlAfterSettingUrlAttribute() throws Exception {
        TextNode node = new TextNode("body");
        node.attr("href", "https://example.com/a");
        assertEquals("https://example.com/a", node.absUrl("href"));
    }

    @Test
    public void testBaseUriWithoutParent() throws Exception {
        TextNode node = new TextNode("body", "https://example.com/");
        assertEquals("", node.baseUri());
    }

    @Test
    public void testSetBaseUriDoesNotChangeLeafBaseUri() throws Exception {
        TextNode node = new TextNode("body", "https://example.com/");
        node.setBaseUri("https://other.example/");
        assertEquals("", node.baseUri());
    }

    @Test
    public void testChildNodeSizeIsZero() throws Exception {
        TextNode node = new TextNode("body");
        assertEquals(0, node.childNodeSize());
    }

    @Test
    public void testChildNodesAreEmpty() throws Exception {
        TextNode node = new TextNode("body");
        assertEquals(0, node.childNodes().size());
    }
}
