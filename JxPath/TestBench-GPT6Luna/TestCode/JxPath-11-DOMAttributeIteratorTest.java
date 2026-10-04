package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import java.util.Collections;
import org.jdom.Attribute;
import org.jdom.Namespace;

public class DOMAttributeIteratorTest {
    @Test
    public void testExactAttributeAndPosition() throws Exception {
        Element element = element("<root a='one'/>");
        DOMNodePointer parent = new DOMNodePointer(element, null);
        NodeIterator iterator = new DOMAttributeIterator(parent, new QName("a"));

        assertEquals(0, iterator.getPosition());
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        assertEquals("a", iterator.getNodePointer().getName().getName());
        assertEquals("one", iterator.getNodePointer().getValue());
    }

    @Test
    public void testEmptyElementDoesNotHaveNamedAttribute() throws Exception {
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element("<root/>"), null), new QName("a"));

        assertFalse(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testWildcardIncludesOrdinaryAttributes() throws Exception {
        Element element = element("<root a='one' b='two'/>");
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element, null), new QName("*"));

        assertTrue(iterator.setPosition(1));
        assertEquals("one", iterator.getNodePointer().getValue());
        assertTrue(iterator.setPosition(2));
        assertEquals("two", iterator.getNodePointer().getValue());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testWildcardExcludesNamespaceDeclarations() throws Exception {
        Element element = element("<root xmlns:p='urn:p' a='one' p:b='two'/>");
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element, null), new QName("*"));

        assertTrue(iterator.setPosition(1));
        assertEquals("one", iterator.getNodePointer().getValue());
        assertTrue(iterator.setPosition(2));
        assertEquals("two", iterator.getNodePointer().getValue());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testNamespacedAttributeByPrefix() throws Exception {
        Element element = element("<root xmlns:p='urn:p' p:a='value'/>");
        DOMNodePointer parent = new DOMNodePointer(element, null);
        NodeIterator iterator = new DOMAttributeIterator(parent, new QName("p", "a"));

        assertTrue(iterator.setPosition(1));
        assertEquals("value", iterator.getNodePointer().getValue());
    }

    @Test
    public void testNamespaceResolverPrefixMapping() throws Exception {
        Element element = element("<root xmlns:q='urn:p' q:a='value'/>");
        DOMNodePointer parent = new DOMNodePointer(element, null);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p", "urn:p");
        parent.setNamespaceResolver(resolver);
        NodeIterator iterator = new DOMAttributeIterator(parent, new QName("p", "a"));

        assertTrue(iterator.setPosition(1));
        assertEquals("value", iterator.getNodePointer().getValue());
    }

    @Test
    public void testWildcardMatchesResolvedNamespace() throws Exception {
        Element element = element("<root xmlns:q='urn:p' q:a='value'/>");
        DOMNodePointer parent = new DOMNodePointer(element, null);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p", "urn:p");
        parent.setNamespaceResolver(resolver);
        NodeIterator iterator = new DOMAttributeIterator(parent, new QName("p", "*"));

        assertTrue(iterator.setPosition(1));
        assertEquals("value", iterator.getNodePointer().getValue());
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testWildcardWithoutPrefixSelectsOnlyUnprefixedAttributes() throws Exception {
        Element element = element("<root xmlns:p='urn:p' a='one' p:b='two'/>");
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element, null), new QName("*"));

        assertTrue(iterator.setPosition(1));
        assertEquals("one", iterator.getNodePointer().getValue());
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testPositionZeroAndNegativeAreRejected() throws Exception {
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element("<root a='one'/>"), null), new QName("a"));

        assertFalse(iterator.setPosition(0));
        assertEquals(0, iterator.getPosition());
        assertFalse(iterator.setPosition(-1));
        assertEquals(-1, iterator.getPosition());
    }

    @Test
    public void testPositionPastLastIsRejected() throws Exception {
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element("<root a='one'/>"), null), new QName("a"));

        assertFalse(iterator.setPosition(2));
        assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testImplicitPointerLookupStartsAtFirstAttribute() throws Exception {
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element("<root a='one'/>"), null), new QName("a"));

        assertEquals("one", iterator.getNodePointer().getValue());
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testRepeatedImplicitPointerLookupIsStable() throws Exception {
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element("<root a='one'/>"), null), new QName("a"));

        assertEquals("one", iterator.getNodePointer().getValue());
        assertEquals("one", iterator.getNodePointer().getValue());
    }

    @Test
    public void testExplicitLastPositionReturnsLastAttribute() throws Exception {
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(element("<root a='one' b='two'/>"), null), new QName("*"));

        assertTrue(iterator.setPosition(2));
        assertEquals("two", iterator.getNodePointer().getValue());
    }

    @Test
    public void testNonElementNodeHasNoAttributes() throws Exception {
        org.w3c.dom.Document document =
            javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        NodeIterator iterator = new DOMAttributeIterator(
            new DOMNodePointer(document, null), new QName("*"));

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    private Element element(String xml) throws Exception {
        javax.xml.parsers.DocumentBuilderFactory factory =
            javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        org.w3c.dom.Document document = factory.newDocumentBuilder()
            .parse(new org.xml.sax.InputSource(new java.io.StringReader(xml)));
        return document.getDocumentElement();
    }
}
