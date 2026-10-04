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
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DOMAttributeIteratorTest {

    private Document createDocument() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        DOMImplementation dim = db.getDOMImplementation();
        return dim.createDocument(null, "root", null);
    }

    // Helper method to create a mock DOM Element
    private Element createElement(Document doc, String tagName) {
        return doc.createElement(tagName);
    }

    // Helper method to create a mock DOM Attr
    private Attr createAttr(Document doc, String name, String value) {
        Attr attr = doc.createAttribute(name);
        attr.setValue(value);
        return attr;
    }

    // Helper method to create a mock DOM Attr with namespace
    private Attr createAttrNS(Document doc, String namespaceURI, String localName, String value) {
        Attr attr = doc.createAttributeNS(namespaceURI, "ns:" + localName);
        attr.setPrefix("ns");
        attr.setValue(value);
        return attr;
    }

    // Helper method to create a mock DOM Element with namespace
    private Element createElementNS(Document doc, String namespaceURI, String qName) {
        return doc.createElementNS(namespaceURI, qName);
    }

    @Test
    public void testIterateSingleAttributeByName() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("id", "test");
        root.setAttribute("name", "value");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("id");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("test", pointer.getValue());

        assertTrue(iterator.setPosition(2));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateAllAttributesWhenNameIsStar() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("id", "test1");
        root.setAttribute("name", "value1");
        root.setAttribute("class", "myClass");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer1 = iterator.getNodePointer();
        assertNotNull(pointer1);
        assertEquals("test1", pointer1.getValue());

        assertTrue(iterator.setPosition(2));
        NodePointer pointer2 = iterator.getNodePointer();
        assertNotNull(pointer2);
        assertEquals("value1", pointer2.getValue());

        assertTrue(iterator.setPosition(3));
        NodePointer pointer3 = iterator.getNodePointer();
        assertNotNull(pointer3);
        assertEquals("myClass", pointer3.getValue());

        assertTrue(iterator.setPosition(4));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateAttributeWithNamespace() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        String nsURI = "http://example.com/ns";
        root.setAttributeNS(nsURI, "ns:attr1", "value1");
        root.setAttribute("attr2", "value2");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("ns", "attr1");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("value1", pointer.getValue());
        assertEquals("ns", pointer.getName().getPrefix());
        assertEquals("attr1", pointer.getName().getName());

        assertTrue(iterator.setPosition(2));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateAttributeWithNamespaceWildcard() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        String nsURI = "http://example.com/ns";
        root.setAttributeNS(nsURI, "ns:attr1", "value1");
        root.setAttributeNS(nsURI, "ns:attr2", "value2");
        root.setAttribute("attr3", "value3");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("ns", "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer1 = iterator.getNodePointer();
        assertNotNull(pointer1);
        assertEquals("value1", pointer1.getValue());

        assertTrue(iterator.setPosition(2));
        NodePointer pointer2 = iterator.getNodePointer();
        assertNotNull(pointer2);
        assertEquals("value2", pointer2.getValue());

        assertTrue(iterator.setPosition(3));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateAttributeWhenElementHasNoAttributes() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("id");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateNonExistentAttribute() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("id", "test");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("nonExistent");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateWithNamespaceAndNoMatchingAttribute() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("id", "test");
        String nsURI = "http://example.com/ns";
        root.setAttributeNS(nsURI, "ns:attr1", "value1");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("otherNS", "attr");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateAllAttributesWithNamespaceFiltering() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        String nsURI1 = "http://example.com/ns1";
        String nsURI2 = "http://example.com/ns2";
        root.setAttributeNS(nsURI1, "ns1:attr1", "value1");
        root.setAttributeNS(nsURI1, "ns1:attr2", "value2");
        root.setAttributeNS(nsURI2, "ns2:attr3", "value3");
        root.setAttribute("attr4", "value4");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("ns1", "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer1 = iterator.getNodePointer();
        assertNotNull(pointer1);
        assertEquals("value1", pointer1.getValue());

        assertTrue(iterator.setPosition(2));
        NodePointer pointer2 = iterator.getNodePointer();
        assertNotNull(pointer2);
        assertEquals("value2", pointer2.getValue());

        assertTrue(iterator.setPosition(3));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateAttributeWithEmptyNamespacePrefix() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("attr1", "value1");
        root.setAttributeNS("http://example.com/ns", "ns:attr2", "value2");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("", "attr1"); // Empty prefix for default namespace
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("value1", pointer.getValue());

        assertTrue(iterator.setPosition(2));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateStarWithEmptyNamespacePrefix() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("attr1", "value1");
        String nsURI = "http://example.com/ns";
        root.setAttributeNS(nsURI, "ns:attr2", "value2");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        // Requesting attributes without a prefix means matching attributes in the default namespace (or no namespace).
        // The '*' in QName("","*") means any local name.
        QName name = new QName("", "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer1 = iterator.getNodePointer();
        assertNotNull(pointer1);
        assertEquals("value1", pointer1.getValue()); // attr1 should match
        assertEquals("", pointer1.getName().getPrefix());
        assertEquals("attr1", pointer1.getName().getName());

        assertTrue(iterator.setPosition(2));
        assertNull(iterator.getNodePointer()); // ns:attr2 should not match because it has a prefix.
    }

    @Test
    public void testIterateSpecificNamespaceAttributeWithStarLocalName() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        String nsURI = "http://example.com/ns";
        root.setAttributeNS(nsURI, "ns:attr1", "value1");
        root.setAttributeNS(nsURI, "ns:attr2", "value2");
        root.setAttribute("attr3", "value3");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("ns", "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer1 = iterator.getNodePointer();
        assertNotNull(pointer1);
        assertEquals("value1", pointer1.getValue());

        assertTrue(iterator.setPosition(2));
        NodePointer pointer2 = iterator.getNodePointer();
        assertNotNull(pointer2);
        assertEquals("value2", pointer2.getValue());

        assertTrue(iterator.setPosition(3));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testIterateAllAttributesWhenNodeIsNotElement() throws Exception {
        Document doc = createDocument();
        NodePointer parentPointer = new DOMNodePointer(doc, null); // Pointer to the document itself
        QName name = new QName("*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testGetPosition() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("id", "test");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("id");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertEquals(0, iterator.getPosition());
        iterator.setPosition(1);
        assertEquals(1, iterator.getPosition());
        iterator.getNodePointer(); // Advance position
        assertEquals(1, iterator.getPosition());
        iterator.setPosition(2);
        assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testSetPositionOutOfBounds() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("id", "test");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("id");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertFalse(iterator.setPosition(0));
        assertFalse(iterator.setPosition(2));
        assertFalse(iterator.setPosition(-1));
    }

    @Test
    public void testGetNodePointerWhenNoAttributesMatch() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("id", "test");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("nonExistent");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        // Initial call to getNodePointer should not advance position if no attributes
        assertNull(iterator.getNodePointer());
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testAttributeWithXmlPrefixIsIgnored() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("xml:lang", "en"); // This should be ignored by the iterator
        root.setAttribute("lang", "fr");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("lang"); // Trying to get 'lang' attribute
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("fr", pointer.getValue());
        // The "xml:lang" attribute should not be returned.
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testAttributeWithXmlnsPrefixIsIgnored() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("xmlns:prefix", "http://example.com"); // This should be ignored
        root.setAttribute("id", "test");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        QName name = new QName("id");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("test", pointer.getValue());

        assertTrue(iterator.setPosition(2));
        assertNull(iterator.getNodePointer()); // xmlns:prefix should not be returned
    }

    @Test
    public void testAttributeWithNamespaceResolver() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        String nsURI = "http://example.com/custom";
        root.setAttributeNS(nsURI, "custom:attr", "customValue");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        NamespaceResolver nsr = new NamespaceResolver(null);
        nsr.registerNamespace("custom", nsURI);
        parentPointer.setNamespaceResolver(nsr);

        QName name = new QName("custom", "attr");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("customValue", pointer.getValue());
        assertEquals("custom", pointer.getName().getPrefix());
        assertEquals("attr", pointer.getName().getName());
    }

    @Test
    public void testAttributeWithNamespaceResolverAndNoMatch() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        String nsURI = "http://example.com/custom";
        root.setAttributeNS(nsURI, "custom:attr", "customValue");

        NodePointer parentPointer = new DOMNodePointer(root, null);
        NamespaceResolver nsr = new NamespaceResolver(null);
        nsr.registerNamespace("other", "http://example.com/other"); // Registering different namespace
        parentPointer.setNamespaceResolver(nsr);

        QName name = new QName("custom", "attr"); // Requesting 'custom' namespace attribute
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testAttributeWithNamespaceResolverButNoNamespaceSetOnElement() throws Exception {
        Document doc = createDocument();
        Element root = (Element) doc.getDocumentElement();
        root.setAttribute("id", "test"); // No namespace

        NodePointer parentPointer = new DOMNodePointer(root, null);
        NamespaceResolver nsr = new NamespaceResolver(null);
        nsr.registerNamespace("custom", "http://example.com/custom");
        parentPointer.setNamespaceResolver(nsr);

        QName name = new QName("custom", "attr"); // Requesting 'custom' namespace attribute
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }
}
