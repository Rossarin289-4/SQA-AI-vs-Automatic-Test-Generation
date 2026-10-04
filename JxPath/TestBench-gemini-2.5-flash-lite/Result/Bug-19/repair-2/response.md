```java
package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.util.TypeUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.DOMImplementation;
import org.apache.xerces.dom.DOMImplementationImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.dom.ElementImpl;
import org.apache.xerces.dom.TextImpl;
import org.apache.xerces.dom.CommentImpl;
import org.apache.xerces.dom.ProcessingInstructionImpl;
import java.util.List;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Namespace;

public class DOMNodePointerTest {

    private DOMNodePointer createPointer(Node node) {
        return new DOMNodePointer(node, Locale.ENGLISH);
    }

    private Document createDocument() {
        DOMImplementation impl = new DOMImplementationImpl();
        return (Document) impl.createDocument(null, null, null);
    }

    @Test
    public void testConstructor() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);
        assertNotNull(ptr);
        assertEquals(elem, ptr.getBaseValue());
        assertEquals(Locale.ENGLISH, ptr.getLocale());
    }

    @Test
    public void testConstructorWithId() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH, "myid");
        assertNotNull(ptr);
        assertEquals(elem, ptr.getBaseValue());
        assertEquals(Locale.ENGLISH, ptr.getLocale());
        assertEquals("id('myid')", ptr.asPath());
    }

    @Test
    public void testConstructorWithParent() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        Element child = new ElementImpl((DocumentImpl) doc, "child");
        root.appendChild(child);
        doc.appendChild(root);

        DOMNodePointer parentPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer ptr = new DOMNodePointer(parentPtr, child);
        assertNotNull(ptr);
        assertEquals(child, ptr.getBaseValue());
        assertEquals(parentPtr, ptr.getParent());
    }

    @Test
    public void testTestNodeNull() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertTrue(ptr.testNode(null));
    }

    @Test
    public void testTestNodeNodeNameTestWildcard() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertTrue(ptr.testNode(new NodeNameTest(new QName("*"))));
    }

    @Test
    public void testTestNodeNodeNameTestExactMatch() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertTrue(ptr.testNode(new NodeNameTest(new QName("root"))));
    }

    @Test
    public void testTestNodeNodeNameTestExactMatchWrongName() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertFalse(ptr.testNode(new NodeNameTest(new QName("other"))));
    }

    @Test
    public void testTestNodeNodeNameTestNamespaceMatch() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.setAttributeNS("http://example.com", "xmlns:ns", "http://example.com");
        elem.setPrefix("ns");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertTrue(ptr.testNode(new NodeNameTest(new QName("ns", "root"), "http://example.com")));
    }

    @Test
    public void testTestNodeNodeNameTestNamespaceMismatch() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.setAttributeNS("http://example.com", "xmlns:ns", "http://example.com");
        elem.setPrefix("ns");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertFalse(ptr.testNode(new NodeNameTest(new QName("ns", "root"), "http://other.com")));
    }

    @Test
    public void testTestNodeNodeTypeTestNode() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }

    @Test
    public void testTestNodeNodeTypeTestText() {
        Document doc = createDocument();
        Text textNode = new TextImpl((DocumentImpl) doc, "some text");
        doc.appendChild(textNode);
        DOMNodePointer ptr = createPointer(textNode);
        assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
    }

    @Test
    public void testTestNodeNodeTypeTestComment() {
        Document doc = createDocument();
        Comment commentNode = new CommentImpl((DocumentImpl) doc, "some comment");
        doc.appendChild(commentNode);
        DOMNodePointer ptr = createPointer(commentNode);
        assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
    }

    @Test
    public void testTestNodeNodeTypeTestProcessingInstruction() {
        Document doc = createDocument();
        ProcessingInstruction piNode = new ProcessingInstructionImpl((DocumentImpl) doc, "target", "data");
        doc.appendChild(piNode);
        DOMNodePointer ptr = createPointer(piNode);
        assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));
    }

    @Test
    public void testTestNodeProcessingInstructionTestMatch() {
        Document doc = createDocument();
        ProcessingInstruction piNode = new ProcessingInstructionImpl((DocumentImpl) doc, "target", "data");
        doc.appendChild(piNode);
        DOMNodePointer ptr = createPointer(piNode);
        assertTrue(ptr.testNode(new ProcessingInstructionTest("target")));
    }

    @Test
    public void testTestNodeProcessingInstructionTestMismatch() {
        Document doc = createDocument();
        ProcessingInstruction piNode = new ProcessingInstructionImpl((DocumentImpl) doc, "target", "data");
        doc.appendChild(piNode);
        DOMNodePointer ptr = createPointer(piNode);
        assertFalse(ptr.testNode(new ProcessingInstructionTest("other")));
    }

    @Test
    public void testGetNameElement() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        QName name = ptr.getName();
        assertEquals("", name.getPrefix());
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetNameElementWithPrefix() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "ns", "root", "http://example.com");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        QName name = ptr.getName();
        assertEquals("ns", name.getPrefix());
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetNameProcessingInstruction() {
        Document doc = createDocument();
        ProcessingInstruction piNode = new ProcessingInstructionImpl((DocumentImpl) doc, "target", "data");
        doc.appendChild(piNode);
        DOMNodePointer ptr = createPointer(piNode);
        QName name = ptr.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNamespaceURIElement() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "ns", "root", "http://example.com");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals("http://example.com", ptr.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIElementWithoutNamespace() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertNull(ptr.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIFromAttribute() {
        Document doc = createDocument();
        Element parent = new ElementImpl((DocumentImpl) doc, "parent");
        parent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://example.com");
        Element elem = new ElementImpl((DocumentImpl) doc, "ns", "child", "http://example.com");
        parent.appendChild(elem);
        doc.appendChild(parent);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals("http://example.com", ptr.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIFromAttributeOnParent() {
        Document doc = createDocument();
        Element grandparent = new ElementImpl((DocumentImpl) doc, "grandparent");
        grandparent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://example.com");
        Element parent = new ElementImpl((DocumentImpl) doc, "parent");
        grandparent.appendChild(parent);
        Element elem = new ElementImpl((DocumentImpl) doc, "ns", "child", "http://example.com"); // This should inherit from grandparent
        parent.appendChild(elem);
        doc.appendChild(grandparent);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals("http://example.com", ptr.getNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://example.com");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals("http://example.com", ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURIOnParent() {
        Document doc = createDocument();
        Element parent = new ElementImpl((DocumentImpl) doc, "parent");
        parent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://example.com");
        Element elem = new ElementImpl((DocumentImpl) doc, "child");
        parent.appendChild(elem);
        doc.appendChild(parent);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals("http://example.com", ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetBaseValue() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals(elem, ptr.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals(elem, ptr.getImmediateNode());
    }

    @Test
    public void testIsActual() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertTrue(ptr.isActual());
    }

    @Test
    public void testIsCollection() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertFalse(ptr.isCollection());
    }

    @Test
    public void testGetLength() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals(1, ptr.getLength());
    }

    @Test
    public void testIsLeafEmptyElement() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertTrue(ptr.isLeaf());
    }

    @Test
    public void testIsLeafElementWithText() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.appendChild(new TextImpl((DocumentImpl) doc, "text"));
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertFalse(ptr.isLeaf());
    }

    @Test
    public void testIsLanguageMatch() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.setAttribute("xml:lang", "en-US");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertTrue(ptr.isLanguage("en"));
    }

    @Test
    public void testIsLanguageNoMatch() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.setAttribute("xml:lang", "en-US");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertFalse(ptr.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageInherited() {
        Document doc = createDocument();
        Element parent = new ElementImpl((DocumentImpl) doc, "parent");
        parent.setAttribute("xml:lang", "en-US");
        Element child = new ElementImpl((DocumentImpl) doc, "child");
        parent.appendChild(child);
        doc.appendChild(parent);

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.ENGLISH);
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, child);
        assertTrue(childPtr.isLanguage("en"));
    }

    @Test
    public void testSetValueOnTextNode() {
        Document doc = createDocument();
        Text textNode = new TextImpl((DocumentImpl) doc, "old text");
        doc.appendChild(textNode);
        DOMNodePointer ptr = createPointer(textNode);
        ptr.setValue("new text");
        assertEquals("new text", textNode.getNodeValue());
    }

    @Test
    public void testSetValueOnTextNodeToEmptyString() {
        Document doc = createDocument();
        Text textNode = new TextImpl((DocumentImpl) doc, "old text");
        doc.appendChild(textNode);
        DOMNodePointer ptr = createPointer(textNode);
        ptr.setValue("");
        assertEquals(0, doc.getChildNodes().getLength()); // Text node should be removed
    }

    @Test
    public void testSetValueOnTextNodeToNull() {
        Document doc = createDocument();
        Text textNode = new TextImpl((DocumentImpl) doc, "old text");
        doc.appendChild(textNode);
        DOMNodePointer ptr = createPointer(textNode);
        ptr.setValue(null);
        assertEquals(0, doc.getChildNodes().getLength()); // Text node should be removed
    }

    @Test
    public void testSetValueOnElementWithNewText() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        ptr.setValue("new text");
        assertEquals(1, elem.getChildNodes().getLength());
        assertEquals(Node.TEXT_NODE, elem.getFirstChild().getNodeType());
        assertEquals("new text", elem.getFirstChild().getNodeValue());
    }

    @Test
    public void testSetValueOnElementWithNewElement() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        Element newElem = new ElementImpl((DocumentImpl) doc, "child");
        DOMNodePointer ptr = createPointer(elem);
        ptr.setValue(newElem);
        assertEquals(1, elem.getChildNodes().getLength());
        assertEquals(Node.ELEMENT_NODE, elem.getFirstChild().getNodeType());
        assertEquals("child", elem.getFirstChild().getNodeName());
    }

    @Test
    public void testSetValueOnElementWithDocumentChildren() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        Document newDoc = createDocument();
        Element child1 = new ElementImpl((DocumentImpl) newDoc, "child1");
        Element child2 = new ElementImpl((DocumentImpl) newDoc, "child2");
        newDoc.appendChild(child1);
        newDoc.appendChild(child2);

        DOMNodePointer ptr = createPointer(elem);
        ptr.setValue(newDoc);

        assertEquals(2, elem.getChildNodes().getLength());
        assertEquals("child1", elem.getFirstChild().getNodeName());
        assertEquals("child2", elem.getLastChild().getNodeName());
    }

    @Test
    public void testCreateChild() throws Exception {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);

        JXPathContext context = JXPathContext.newContext(null, null);
        QName childName = new QName("child");
        NodePointer childPtr = ptr.createChild(context, childName, 0);

        assertNotNull(childPtr);
        assertEquals("child", childPtr.getName().getName());
        assertEquals(1, elem.getChildNodes().getLength());
        assertEquals(Node.ELEMENT_NODE, elem.getFirstChild().getNodeType());
        assertEquals("child", elem.getFirstChild().getNodeName());
    }

    @Test
    public void testCreateAttribute() throws Exception {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);

        JXPathContext context = JXPathContext.newContext(null, null);
        QName attrName = new QName("attr");
        NodePointer attrPtr = ptr.createAttribute(context, attrName);

        assertNotNull(attrPtr);
        assertEquals("attr", attrPtr.getName().getName());
        assertTrue(elem.hasAttribute("attr"));
        assertEquals("", elem.getAttribute("attr"));
    }

    @Test
    public void testCreateAttributeWithNamespace() throws Exception {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);

        NamespaceResolver nsResolver = new NamespaceResolver(null);
        nsResolver.setNamespaceContextPointer(ptr);
        // Cannot use declarePrefix directly, need to use a context or a different method.
        // The test will check if the attribute is created with the correct namespace.
        // JXPathContext context = JXPathContext.newContext(null, null); // Original code
        // context.setNamespaceResolver(nsResolver); // Original code

        QName attrName = new QName("ns", "attr");
        // Manually set the namespace for the context for this test to work without
        // expecting a public method that doesn't exist in the API outline.
        JXPathContext context = JXPathContext.newContext(null); // Use overloaded constructor
        context.setFactory(new org.apache.commons.jxpath.BasicXPathFactory() {
            @Override
            public NamespaceResolver getNamespaceResolver() {
                return nsResolver;
            }
        });
        nsResolver.declarePrefix("ns", "http://example.com"); // This should work with the custom factory

        NodePointer attrPtr = ptr.createAttribute(context, attrName);

        assertNotNull(attrPtr);
        assertEquals("attr", attrPtr.getName().getName());
        assertEquals("ns", attrPtr.getName().getPrefix());
        assertTrue(elem.hasAttributeNS("http://example.com", "attr"));
        assertEquals("", elem.getAttributeNS("http://example.com", "attr"));
    }

    @Test
    public void testRemove() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        Element child = new ElementImpl((DocumentImpl) doc, "child");
        root.appendChild(child);
        doc.appendChild(root);

        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        ptr.remove();

        assertEquals(0, root.getChildNodes().getLength());
        assertNull(child.getParentNode());
    }

    @Test
    public void testRemoveRoot() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(root);

        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.ENGLISH);
        try {
            ptr.remove();
            fail("Should throw JXPathException");
        } catch (JXPathException e) {
            // Expected
        }
    }

    @Test
    public void testAsPathElement() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        Element child = new ElementImpl((DocumentImpl) doc, "child");
        root.appendChild(child);
        doc.appendChild(root);

        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("/root[1]/child[1]", ptr.asPath());
    }

    @Test
    public void testAsPathWithId() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH, "myid");
        assertEquals("id('myid')", ptr.asPath());
    }

    @Test
    public void testAsPathTextNode() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        Text textNode = new TextImpl((DocumentImpl) doc, "some text");
        root.appendChild(textNode);
        doc.appendChild(root);

        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.ENGLISH);
        assertEquals("/root[1]/text()[1]", ptr.asPath());
    }

    @Test
    public void testAsPathProcessingInstruction() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        ProcessingInstruction pi = new ProcessingInstructionImpl((DocumentImpl) doc, "target", "data");
        root.appendChild(pi);
        doc.appendChild(root);

        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("/root[1]/processing-instruction('target')[1]", ptr.asPath());
    }

    @Test
    public void testHashCode() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr1 = new DOMNodePointer(elem, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(elem, Locale.ENGLISH);
        assertEquals(ptr1.hashCode(), ptr2.hashCode());
    }

    @Test
    public void testEquals() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr1 = new DOMNodePointer(elem, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(elem, Locale.ENGLISH);
        DOMNodePointer ptr3 = new DOMNodePointer(new ElementImpl((DocumentImpl) doc, "other"), Locale.ENGLISH);

        assertTrue(ptr1.equals(ptr1));
        assertTrue(ptr1.equals(ptr2));
        assertFalse(ptr1.equals(ptr3));
        assertFalse(ptr1.equals(null));
        assertFalse(ptr1.equals("string"));
    }

    @Test
    public void testGetPrefixStatic() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "ns", "root", "http://example.com");
        doc.appendChild(elem);
        assertEquals("ns", DOMNodePointer.getPrefix(elem));

        Element elemNoPrefix = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elemNoPrefix);
        assertNull(DOMNodePointer.getPrefix(elemNoPrefix));
    }

    @Test
    public void testGetLocalNameStatic() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "ns", "root", "http://example.com");
        doc.appendChild(elem);
        assertEquals("root", DOMNodePointer.getLocalName(elem));

        Element elemNoPrefix = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elemNoPrefix);
        assertEquals("root", DOMNodePointer.getLocalName(elemNoPrefix));
    }

    @Test
    public void testGetNamespaceURIStatic() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "ns", "root", "http://example.com");
        doc.appendChild(elem);
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(elem));

        Element elemNoNamespace = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elemNoNamespace);
        assertNull(DOMNodePointer.getNamespaceURI(elemNoNamespace));
    }

    @Test
    public void testGetNamespaceURIStaticInherited() {
        Document doc = createDocument();
        Element parent = new ElementImpl((DocumentImpl) doc, "parent");
        parent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://example.com");
        Element child = new ElementImpl((DocumentImpl) doc, "ns", "child", "http://example.com");
        parent.appendChild(child);
        doc.appendChild(parent);
        DOMNodePointer ptr = createPointer(child);
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testGetValueTextNode() {
        Document doc = createDocument();
        Text textNode = new TextImpl((DocumentImpl) doc, "some text");
        doc.appendChild(textNode);
        DOMNodePointer ptr = createPointer(textNode);
        assertEquals("some text", ptr.getValue());
    }

    @Test
    public void testGetValueCommentNode() {
        Document doc = createDocument();
        Comment commentNode = new CommentImpl((DocumentImpl) doc, "some comment");
        doc.appendChild(commentNode);
        DOMNodePointer ptr = createPointer(commentNode);
        assertEquals("some comment", ptr.getValue());
    }

    @Test
    public void testGetValueProcessingInstruction() {
        Document doc = createDocument();
        ProcessingInstruction pi = new ProcessingInstructionImpl((DocumentImpl) doc, "target", "data");
        doc.appendChild(pi);
        DOMNodePointer ptr = createPointer(pi);
        assertEquals("data", ptr.getValue());
    }

    @Test
    public void testGetValueElementWithTextChildren() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        root.appendChild(new TextImpl((DocumentImpl) doc, "text1"));
        root.appendChild(new TextImpl((DocumentImpl) doc, "text2"));
        doc.appendChild(root);

        DOMNodePointer ptr = createPointer(root);
        assertEquals("text1text2", ptr.getValue());
    }

    @Test
    public void testGetValueElementWithMixedChildren() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        root.appendChild(new TextImpl((DocumentImpl) doc, "text1"));
        root.appendChild(new ElementImpl((DocumentImpl) doc, "child"));
        root.appendChild(new TextImpl((DocumentImpl) doc, "text2"));
        doc.appendChild(root);

        DOMNodePointer ptr = createPointer(root);
        assertEquals("text1text2", ptr.getValue()); // Elements don't contribute to string value
    }

    @Test
    public void testGetPointerByIDFound() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.setAttribute("id", "myid");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);

        JXPathContext context = JXPathContext.newContext(doc);
        Pointer foundPtr = ptr.getPointerByID(context, "myid");

        assertNotNull(foundPtr);
        assertTrue(foundPtr instanceof DOMNodePointer);
        // The 'id' field is private, so we cannot directly assert its value.
        // We can assert that the pointer is for the correct element.
        assertEquals(elem, foundPtr.getBaseValue());
    }

    @Test
    public void testGetPointerByIDNotFound() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);

        JXPathContext context = JXPathContext.newContext(doc);
        Pointer notFoundPtr = ptr.getPointerByID(context, "nonexistent");

        assertNotNull(notFoundPtr);
        assertTrue(notFoundPtr instanceof NullPointer);
        assertEquals("nonexistent", notFoundPtr.getNode());
    }

    @Test
    public void testCompareChildNodePointersElements() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        Element child1 = new ElementImpl((DocumentImpl) doc, "child1");
        Element child2 = new ElementImpl((DocumentImpl) doc, "child2");
        root.appendChild(child1);
        root.appendChild(child2);
        doc.appendChild(root);

        DOMNodePointer ptrRoot = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer ptrChild1 = new DOMNodePointer(child1, Locale.ENGLISH);
        DOMNodePointer ptrChild2 = new DOMNodePointer(child2, Locale.ENGLISH);

        assertEquals(-1, ptrRoot.compareChildNodePointers(ptrChild1, ptrChild2));
        assertEquals(1, ptrRoot.compareChildNodePointers(ptrChild2, ptrChild1));
        assertEquals(0, ptrRoot.compareChildNodePointers(ptrChild1, ptrChild1));
    }

    @Test
    public void testCompareChildNodePointersAttributes() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        root.setAttribute("attr1", "val1");
        root.setAttribute("attr2", "val2");
        doc.appendChild(root);

        DOMNodePointer ptrRoot = new DOMNodePointer(root, Locale.ENGLISH);
        Node attr1Node = root.getAttributes().getNamedItem("attr1");
        Node attr2Node = root.getAttributes().getNamedItem("attr2");
        DOMNodePointer ptrAttr1 = new DOMNodePointer(attr1Node, Locale.ENGLISH);
        DOMNodePointer ptrAttr2 = new DOMNodePointer(attr2Node, Locale.ENGLISH);

        assertEquals(-1, ptrRoot.compareChildNodePointers(ptrAttr1, ptrAttr2));
        assertEquals(1, ptrRoot.compareChildNodePointers(ptrAttr2, ptrAttr1));
        assertEquals(0, ptrRoot.compareChildNodePointers(ptrAttr1, ptrAttr1));
    }

    @Test
    public void testCompareChildNodePointersMixed() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        root.setAttribute("attr1", "val1");
        Element child1 = new ElementImpl((DocumentImpl) doc, "child1");
        root.appendChild(child1);
        doc.appendChild(root);

        DOMNodePointer ptrRoot = new DOMNodePointer(root, Locale.ENGLISH);
        Node attr1Node = root.getAttributes().getNamedItem("attr1");
        DOMNodePointer ptrAttr1 = new DOMNodePointer(attr1Node, Locale.ENGLISH);
        DOMNodePointer ptrChild1 = new DOMNodePointer(child1, Locale.ENGLISH);

        assertEquals(-1, ptrRoot.compareChildNodePointers(ptrAttr1, ptrChild1));
        assertEquals(1, ptrRoot.compareChildNodePointers(ptrChild1, ptrAttr1));
    }

    @Test
    public void testChildIteratorEmpty() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        NodeIterator iterator = ptr.childIterator(null, false, null);
        assertFalse(iterator.setPosition(1)); // No children, should return false
    }

    @Test
    public void testChildIteratorWithChildren() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        Element child1 = new ElementImpl((DocumentImpl) doc, "child1");
        Element child2 = new ElementImpl((DocumentImpl) doc, "child2");
        root.appendChild(child1);
        root.appendChild(child2);
        doc.appendChild(root);

        DOMNodePointer ptr = createPointer(root);
        NodeIterator iterator = ptr.childIterator(null, false, null);
        assertTrue(iterator.setPosition(1));
        assertEquals(child1, iterator.getNodePointer().getBaseValue());
        assertTrue(iterator.setPosition(2));
        assertEquals(child2, iterator.getNodePointer().getBaseValue());
        assertFalse(iterator.setPosition(3));
    }
    
    @Test
    public void testAttributeIteratorNoAttributes() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        NodeIterator iterator = ptr.attributeIterator(null);
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testAttributeIteratorWithAttributes() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        root.setAttribute("attr1", "val1");
        root.setAttribute("attr2", "val2");
        doc.appendChild(root);

        DOMNodePointer ptr = createPointer(root);
        NodeIterator iterator = ptr.attributeIterator(null);
        assertTrue(iterator.setPosition(1));
        assertEquals("attr1", iterator.getNodePointer().getName().getName());
        assertTrue(iterator.setPosition(2));
        assertEquals("attr2", iterator.getNodePointer().getName().getName());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testNamespacePointer() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://example.com");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);

        NodePointer nsPtr = ptr.namespacePointer("ns");
        assertNotNull(nsPtr);
        assertTrue(nsPtr instanceof NamespacePointer);
        assertEquals(ptr, nsPtr.getParent());
    }

    @Test
    public void testNamespaceIteratorEmpty() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        NodeIterator iterator = ptr.namespaceIterator();
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testNamespaceIteratorWithNamespaces() {
        Document doc = createDocument();
        Element root = new ElementImpl((DocumentImpl) doc, "root");
        root.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns1", "http://example.com/ns1");
        root.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns2", "http://example.com/ns2");
        doc.appendChild(root);
        DOMNodePointer ptr = createPointer(root);
        NodeIterator iterator = ptr.namespaceIterator();
        assertTrue(iterator.setPosition(1));
        assertEquals("ns1", iterator.getNodePointer().getName().getName());
        assertTrue(iterator.setPosition(2));
        assertEquals("ns2", iterator.getNodePointer().getName().getName());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testGetNamespaceResolver() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        NamespaceResolver resolver = ptr.getNamespaceResolver();
        assertNotNull(resolver);
        assertTrue(resolver instanceof NamespaceResolver);
        assertEquals(ptr, resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceURIForXmlPrefix() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals("http://www.w3.org/XML/1998/namespace", ptr.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIForXmlnsPrefix() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals("http://www.w3.org/2000/xmlns/", ptr.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURIForDeclaredPrefix() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        elem.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://example.com");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertEquals("http://example.com", ptr.getNamespaceURI("ns"));
    }

    @Test
    public void testGetNamespaceURIForUndeclaredPrefix() {
        Document doc = createDocument();
        Element elem = new ElementImpl((DocumentImpl) doc, "root");
        doc.appendChild(elem);
        DOMNodePointer ptr = createPointer(elem);
        assertNull(ptr.getNamespaceURI("unknown"));
    }
    
    @Test
    public void testNamespaceResolverWithParent() {
        Document doc = createDocument();
        Element parent = new ElementImpl((DocumentImpl) doc, "parent");
        parent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:pns", "http://parent.com");
        Element child = new ElementImpl((DocumentImpl) doc, "child");
        parent.appendChild(child);
        doc.appendChild(parent);

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.ENGLISH);
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, child);

        NamespaceResolver parentResolver = parentPtr.getNamespaceResolver();
        NamespaceResolver childResolver = childPtr.getNamespaceResolver();

        assertNotNull(childResolver);
        assertNotEquals(parentResolver, childResolver);
        assertEquals("http://parent.com", childResolver.getNamespaceURI("pns"));
    }

    @Test
    public void testFindEnclosingAttribute() {
        Document doc = createDocument();
        Element parent = new ElementImpl((DocumentImpl) doc, "parent");
        parent.setAttribute("attr", "parentValue");
        Element child = new ElementImpl((DocumentImpl) doc, "child");
        parent.appendChild(child);
        doc.appendChild(parent);

        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        // Using a protected method for testing, as it's part of the logic
        String value = DOMNodePointer.findEnclosingAttribute(ptr.getBaseValue(), "attr");
        assertEquals("parentValue", value);
    }

    @Test
    public void testFindEnclosingAttributeNotFound() {
        Document doc = createDocument();
        Element parent = new ElementImpl((DocumentImpl) doc, "parent");
        Element child = new ElementImpl((DocumentImpl) doc, "child");
        parent.appendChild(child);
        doc.appendChild(parent);

        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        String value = DOMNodePointer.findEnclosingAttribute(ptr.getBaseValue(), "nonexistent");
        assertNull(value);
    }
}
```