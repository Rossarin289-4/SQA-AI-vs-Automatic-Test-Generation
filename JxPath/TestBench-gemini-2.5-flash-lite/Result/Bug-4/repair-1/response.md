```java
package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
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
import java.util.List;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Namespace;
import org.jdom.Text;
import org.w3c.dom.DOMImplementation;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.dom.ElementImpl;
import org.apache.xerces.dom.TextImpl;
import org.apache.xerces.dom.CommentImpl;
import org.apache.xerces.dom.ProcessingInstructionImpl;

public class DOMNodePointerTest {

    // Helper method to create a DOM Document
    private Document createDocument() {
        DOMImplementation domImpl = new org.apache.xerces.dom.DOMImplementationImpl();
        return domImpl.createDocument(null, "root", null);
    }

    // Helper method to create a DOM Element
    private Element createElement(Document doc, String tagName) {
        return doc.createElement(tagName);
    }

    // Helper method to create a DOM Text Node
    private Node createTextNode(Document doc, String text) {
        return doc.createTextNode(text);
    }

    // Helper method to create a DOM Comment Node
    private Node createCommentNode(Document doc, String data) {
        return doc.createComment(data);
    }

    // Helper method to create a DOM Processing Instruction Node
    private Node createProcessingInstructionNode(Document doc, String target, String data) {
        return doc.createProcessingInstruction(target, data);
    }

    // Helper method to create a DOM Attribute Node
    private Attr createAttributeNode(Document doc, String name, String value) {
        Attr attr = doc.createAttribute(name);
        attr.setValue(value);
        return attr;
    }

    @Test
    public void testConstructorWithNodeAndLocale() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertNotNull(pointer);
        assertEquals(node, pointer.getBaseValue());
        assertEquals(Locale.US, pointer.getLocale());
    }

    @Test
    public void testConstructorWithNodeLocaleAndId() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US, "testId");
        assertNotNull(pointer);
        assertEquals(node, pointer.getBaseValue());
        assertEquals(Locale.US, pointer.getLocale());
        // 'id' field is not public, so we cannot directly assert it.
        // Rely on other methods that might use it if possible or omit this check.
    }

    @Test
    public void testConstructorWithParentAndNode() {
        Document doc = createDocument();
        Node parentNode = createElement(doc, "parent");
        Node childNode = createElement(doc, "child");
        DOMNodePointer parentPointer = new DOMNodePointer(parentNode, Locale.US);
        DOMNodePointer childPointer = new DOMNodePointer(parentPointer, childNode);
        assertNotNull(childPointer);
        assertEquals(childNode, childPointer.getBaseValue());
        assertEquals(parentPointer, childPointer.getParent());
    }

    @Test
    public void testTestNodeWithNullTest() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer.testNode(null));
    }

    @Test
    public void testTestNodeWithNodeNameTestMatching() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("root"));
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNotMatching() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("other"));
        assertFalse(pointer.testNode(test));
    }
    
    @Test
    public void testTestNodeWithNodeNameTestWildcard() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("*"));
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestElement() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        root.appendChild(createTextNode(doc, "some text"));
        doc.appendChild(root);
        // Need to get the actual Text node, not just the Element
        Node textNode = root.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(pointer.testNode(test));
    }
    
    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        root.appendChild(createCommentNode(doc, "a comment"));
        doc.appendChild(root);
        Node commentNode = root.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(commentNode, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestMatching() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        ProcessingInstruction pi = (ProcessingInstruction) createProcessingInstructionNode(doc, "target", "data");
        root.appendChild(pi);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestNotMatching() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        ProcessingInstruction pi = (ProcessingInstruction) createProcessingInstructionNode(doc, "target", "data");
        root.appendChild(pi);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testGetNameForElement() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        QName name = pointer.getName();
        assertEquals("", name.getPrefix());
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        ProcessingInstruction pi = (ProcessingInstruction) createProcessingInstructionNode(doc, "target", "data");
        root.appendChild(pi);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNamespaceURIForElement() {
        Document doc = createDocument();
        Element root = doc.createElementNS("http://example.com/ns", "ns:root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        assertEquals("http://example.com/ns", pointer.getNamespaceURI());
    }
    
    @Test
    public void testGetNamespaceURIForElementWithoutNamespace() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        assertNull(pointer.getNamespaceURI());
    }

    @Test
    public void testChildIterator() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Element child1 = createElement(doc, "child1");
        Element child2 = createElement(doc, "child2");
        root.appendChild(child1);
        root.appendChild(child2);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        NodeIterator iterator = pointer.childIterator(null, false, null);
        assertTrue(iterator.setPosition(1));
        assertEquals(child1, iterator.getNodePointer().getBaseValue());
        assertTrue(iterator.setPosition(2));
        assertEquals(child2, iterator.getNodePointer().getBaseValue());
        assertFalse(iterator.setPosition(3));
    }
    
    @Test
    public void testAttributeIterator() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Attr attr1 = createAttributeNode(doc, "attr1", "value1");
        Attr attr2 = createAttributeNode(doc, "attr2", "value2");
        root.setAttributeNode(attr1);
        root.setAttributeNode(attr2);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        NodeIterator iterator = pointer.attributeIterator(new QName("attr1"));
        assertTrue(iterator.setPosition(1));
        assertEquals(attr1, iterator.getNodePointer().getBaseValue());
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testNamespacePointer() {
        Document doc = createDocument();
        Element root = doc.createElementNS("http://example.com/ns", "ns:root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        NodePointer nsPointer = pointer.namespacePointer("ns");
        assertNotNull(nsPointer);
        assertEquals("http://example.com/ns", nsPointer.getValue());
    }

    @Test
    public void testNamespaceIterator() {
        Document doc = createDocument();
        Element root = doc.createElementNS("http://example.com/ns", "ns:root");
        // Add another namespace declaration
        root.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:other", "http://other.com");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        NodeIterator iterator = pointer.namespaceIterator();
        assertTrue(iterator.setPosition(1));
        assertEquals("ns", iterator.getNodePointer().getName().getName());
        assertTrue(iterator.setPosition(2));
        assertEquals("other", iterator.getNodePointer().getName().getName());
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        Document doc = createDocument();
        Element root = doc.createElementNS("http://example.com/ns", "ns:root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        assertEquals("http://example.com/ns", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURIWhenUndefined() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetBaseValue() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals(node, pointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals(node, pointer.getImmediateNode());
    }

    @Test
    public void testIsActual() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer.isActual());
    }

    @Test
    public void testIsCollection() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetLength() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void testIsLeafWhenHasChildren() {
        Document doc = createDocument();
        Element parent = createElement(doc, "parent");
        Element child = createElement(doc, "child");
        parent.appendChild(child);
        doc.appendChild(parent);
        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLeafWhenNoChildren() {
        Document doc = createDocument();
        Element parent = createElement(doc, "parent");
        doc.appendChild(parent);
        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLanguageMatching() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        root.setAttribute("xml:lang", "en");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        assertTrue(pointer.isLanguage("en"));
        assertTrue(pointer.isLanguage("EN"));
    }

    @Test
    public void testIsLanguageNotMatching() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        root.setAttribute("xml:lang", "en");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageInherited() {
        Document doc = createDocument();
        Element parent = createElement(doc, "parent");
        parent.setAttribute("xml:lang", "es");
        Element child = createElement(doc, "child");
        parent.appendChild(child);
        doc.appendChild(parent);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        assertTrue(pointer.isLanguage("es"));
    }

    @Test
    public void testSetValueOnTextNode() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Node textNode = createTextNode(doc, "old text");
        root.appendChild(textNode);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue("new text");
        assertEquals("new text", textNode.getNodeValue());
    }

    @Test
    public void testSetValueOnElementWithNewText() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        pointer.setValue("some text");
        assertEquals(1, root.getChildNodes().getLength());
        Node child = root.getFirstChild();
        assertEquals(Node.TEXT_NODE, child.getNodeType());
        assertEquals("some text", child.getNodeValue());
    }

    @Test
    public void testSetValueOnElementWithExistingChildren() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Element existingChild = createElement(doc, "existing");
        root.appendChild(existingChild);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        pointer.setValue("new text");
        assertEquals(1, root.getChildNodes().getLength());
        Node child = root.getFirstChild();
        assertEquals(Node.TEXT_NODE, child.getNodeType());
        assertEquals("new text", child.getNodeValue());
    }

    @Test
    public void testSetValueOnElementWithNodeValue() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Element valueNode = createElement(doc, "value");
        valueNode.appendChild(createTextNode(doc, "value content"));
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        pointer.setValue(valueNode);
        assertEquals(1, root.getChildNodes().getLength());
        Node child = root.getFirstChild();
        assertEquals(Node.ELEMENT_NODE, child.getNodeType());
        assertEquals("value", child.getNodeName());
        assertEquals(1, child.getChildNodes().getLength());
        Node grandChild = child.getFirstChild();
        assertEquals(Node.TEXT_NODE, grandChild.getNodeType());
        assertEquals("value content", grandChild.getNodeValue());
    }

    @Test
    public void testCreateChildSuccessfully() throws Exception {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);

        JXPathContext context = JXPathContext.newContext(doc);
        // Mock an AbstractFactory to simulate successful creation
        AbstractFactory mockFactory = new AbstractFactory() {
            public boolean createObject(JXPathContext context, NodePointer pointer, Object parent, String name, int index) {
                if (parent.getBaseValue() instanceof Node && name.equals("newChild")) {
                    Node parentNode = (Node) parent.getBaseValue();
                    Node newNode = parentNode.getOwnerDocument().createElement(name);
                    if (index == 0) {
                        parentNode.appendChild(newNode);
                    } else {
                        parentNode.appendChild(newNode);
                    }
                    return true;
                }
                return false;
            }
            public boolean createAttribute(JXPathContext context, NodePointer pointer, String attributeName) { return false; }
        };
        context.setFactory(mockFactory);

        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        QName childName = new QName("newChild");
        
        NodePointer newPointer = pointer.createChild(context, childName, 0);
        
        assertNotNull(newPointer);
        assertEquals("newChild", newPointer.getName().getName());
        assertEquals(root.getFirstChild(), newPointer.getBaseValue());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChildFails() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);

        JXPathContext context = JXPathContext.newContext(doc);
        // No factory set, should throw exception
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        QName childName = new QName("newChild");
        pointer.createChild(context, childName, 0);
    }

    @Test
    public void testCreateAttributeSuccessfully() throws Exception {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);

        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        QName attrName = new QName("newAttr");
        
        NodePointer attrPointer = pointer.createAttribute(context, attrName);
        
        assertNotNull(attrPointer);
        assertEquals("newAttr", attrPointer.getName().getName());
        assertEquals("newAttr", root.getAttribute("newAttr"));
    }

    @Test
    public void testCreateAttributeWithNamespace() throws Exception {
        Document doc = createDocument();
        Element root = doc.createElementNS("http://example.com/ns", "ns:root");
        doc.appendChild(root);

        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        // Correct QName constructor for namespace and local name
        QName attrName = new QName("http://example.com/attr", "newAttr");
        
        NodePointer attrPointer = pointer.createAttribute(context, attrName);
        
        assertNotNull(attrPointer);
        assertEquals("newAttr", attrPointer.getName().getName());
        assertEquals("http://example.com/attr", attrPointer.getNamespaceURI());
        assertEquals("newAttr", root.getAttributeNS("http://example.com/attr", "newAttr"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeWithUnknownNamespacePrefix() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);

        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        // QName constructor does not take prefix directly for namespace.
        // If it's a namespace attribute, it should be specified via NS URI.
        QName attrName = new QName("unknownprefix", "newAttr"); 
        
        pointer.createAttribute(context, attrName);
    }

    @Test
    public void testRemoveNode() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Element child = createElement(doc, "child");
        root.appendChild(child);
        doc.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        pointer.remove();

        assertNull(child.getParentNode());
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootNode() {
        Document doc = createDocument();
        DOMNodePointer pointer = new DOMNodePointer(doc, Locale.US);
        pointer.remove();
    }

    @Test
    public void testAsPathForRoot() {
        Document doc = createDocument();
        DOMNodePointer pointer = new DOMNodePointer(doc, Locale.US);
        assertEquals("", pointer.asPath());
    }

    @Test
    public void testAsPathForElement() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Element child = createElement(doc, "child");
        root.appendChild(child);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        assertEquals("/root[1]/child[1]", pointer.asPath());
    }

    @Test
    public void testAsPathForTextNode() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Node textNode = createTextNode(doc, "some text");
        root.appendChild(textNode);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("/root[1]/text()[1]", pointer.asPath());
    }

    @Test
    public void testAsPathForProcessingInstruction() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        ProcessingInstruction pi = (ProcessingInstruction) createProcessingInstructionNode(doc, "target", "data");
        root.appendChild(pi);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        assertEquals("/root[1]/processing-instruction('target')[1]", pointer.asPath());
    }

    @Test
    public void testAsPathWithId() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US, "myId");
        assertEquals("id('myId')", pointer.asPath());
    }

    @Test
    public void testEscapeForId() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US, "my'id\"");
        // The asPath method uses escape internally.
        assertEquals("id('my&apos;id&quot;')", pointer.asPath());
    }

    @Test
    public void testHashCode() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer1 = new DOMNodePointer(node, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node, Locale.US);
        assertEquals(pointer1.hashCode(), pointer2.hashCode());
    }

    @Test
    public void testEqualsSameInstance() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEqualsDifferentInstanceSameNode() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer1 = new DOMNodePointer(node, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer1.equals(pointer2));
    }

    @Test
    public void testEqualsDifferentNode() {
        Document doc = createDocument();
        Node node1 = createElement(doc, "root1");
        Node node2 = createElement(doc, "root2");
        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);
        assertFalse(pointer1.equals(pointer2));
    }
    
    @Test
    public void testEqualsDifferentType() {
        Document doc = createDocument();
        Node node = createElement(doc, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        JDOMNodePointer other = new JDOMNodePointer(node, Locale.US); // Different type
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testGetPrefixForNodeWithPrefix() {
        Document doc = createDocument();
        Element element = doc.createElementNS("http://example.com/ns", "ns:root");
        doc.appendChild(element);
        assertEquals("ns", DOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetPrefixForNodeWithoutPrefix() {
        Document doc = createDocument();
        Element element = createElement(doc, "root");
        doc.appendChild(element);
        assertNull(DOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetLocalNameForNodeWithPrefix() {
        Document doc = createDocument();
        Element element = doc.createElementNS("http://example.com/ns", "ns:root");
        doc.appendChild(element);
        assertEquals("root", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetLocalNameForNodeWithoutPrefix() {
        Document doc = createDocument();
        Element element = createElement(doc, "root");
        doc.appendChild(element);
        assertEquals("root", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetNamespaceURIForElementWithNamespace() {
        Document doc = createDocument();
        Element element = doc.createElementNS("http://example.com/ns", "ns:root");
        doc.appendChild(element);
        assertEquals("http://example.com/ns", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIForElementWithoutNamespace() {
        Document doc = createDocument();
        Element element = createElement(doc, "root");
        doc.appendChild(element);
        assertNull(DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetValueForCommentNode() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Comment comment = (Comment) createCommentNode(doc, "a comment");
        root.appendChild(comment);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(comment, Locale.US);
        assertEquals("a comment", pointer.getValue());
    }

    @Test
    public void testGetValueForTextNode() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Text textNode = (Text) createTextNode(doc, "some text");
        root.appendChild(textNode);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("some text", pointer.getValue());
    }

    @Test
    public void testGetValueForTextNodeWithXmlSpacePreserve() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        root.setAttribute("xml:space", "preserve");
        Text textNode = (Text) createTextNode(doc, "  some text  ");
        root.appendChild(textNode);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("  some text  ", pointer.getValue());
    }

    @Test
    public void testGetValueForTextNodeWithXmlSpaceDefault() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        root.setAttribute("xml:space", "default"); // or any other value not "preserve"
        Text textNode = (Text) createTextNode(doc, "  some text  ");
        root.appendChild(textNode);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("some text", pointer.getValue());
    }

    @Test
    public void testGetValueForProcessingInstruction() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        ProcessingInstruction pi = (ProcessingInstruction) createProcessingInstructionNode(doc, "target", "data");
        root.appendChild(pi);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        assertEquals("data", pointer.getValue());
    }

    @Test
    public void testGetValueForElement() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        root.appendChild(createTextNode(doc, "text1"));
        root.appendChild(createElement(doc, "child"));
        root.appendChild(createTextNode(doc, "text2"));
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        assertEquals("text1text2", pointer.getValue());
    }

    @Test
    public void testGetPointerByIDFound() {
        Document doc = createDocument();
        Element element = createElement(doc, "element");
        element.setAttribute("id", "testId");
        doc.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(doc, Locale.US);
        JXPathContext context = JXPathContext.newContext(doc);
        Pointer foundPointer = pointer.getPointerByID(context, "testId");
        assertNotNull(foundPointer);
        // getBaseValue() is defined on Pointer, so it should be accessible.
        assertEquals(element, foundPointer.getBaseValue());
        // The 'id' field is private and thus not directly accessible.
        // Rely on other behavior if possible or omit this specific assertion.
    }

    @Test
    public void testGetPointerByIDNotFound() {
        Document doc = createDocument();
        Element element = createElement(doc, "element");
        doc.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(doc, Locale.US);
        JXPathContext context = JXPathContext.newContext(doc);
        Pointer notFoundPointer = pointer.getPointerByID(context, "nonexistentId");
        assertNotNull(notFoundPointer);
        assertTrue(notFoundPointer instanceof NullPointer);
        assertEquals("nonexistentId", ((NullPointer) notFoundPointer).getValue());
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Element child1 = createElement(doc, "child1");
        Element child2 = createElement(doc, "child2");
        root.appendChild(child1);
        root.appendChild(child2);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer child1Pointer = new DOMNodePointer(child1, Locale.US);
        DOMNodePointer child2Pointer = new DOMNodePointer(child2, Locale.US);
        assertEquals(0, pointer.compareChildNodePointers(child1Pointer, child1Pointer));
    }

    @Test
    public void testCompareChildNodePointersOrder() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Element child1 = createElement(doc, "child1");
        Element child2 = createElement(doc, "child2");
        root.appendChild(child1);
        root.appendChild(child2);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer child1Pointer = new DOMNodePointer(child1, Locale.US);
        DOMNodePointer child2Pointer = new DOMNodePointer(child2, Locale.US);
        assertEquals(-1, pointer.compareChildNodePointers(child1Pointer, child2Pointer));
        assertEquals(1, pointer.compareChildNodePointers(child2Pointer, child1Pointer));
    }

    @Test
    public void testCompareChildNodePointersAttributeFirst() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Attr attr = createAttributeNode(doc, "attr", "value");
        root.setAttributeNode(attr);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer attrPointer = new DOMNodePointer(attr, Locale.US);
        assertEquals(-1, pointer.compareChildNodePointers(attrPointer, pointer));
    }

    @Test
    public void testCompareChildNodePointersElementFirst() {
        Document doc = createDocument();
        Element root = createElement(doc, "root");
        Element child = createElement(doc, "child");
        root.appendChild(child);
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.US);
        assertEquals(1, pointer.compareChildNodePointers(pointer, childPointer));
    }
}
```