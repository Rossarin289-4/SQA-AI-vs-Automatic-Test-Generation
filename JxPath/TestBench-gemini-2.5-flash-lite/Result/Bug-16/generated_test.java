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
import java.util.List;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Namespace;
import org.jdom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import java.io.StringReader;

public class DOMNodePointerTest {

    private Document doc;

    private void setupDocument(String xml) throws SAXException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true); // Important for namespace handling
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new InputSource(new StringReader(xml)));
        } catch (Exception e) {
            throw new SAXException("Failed to parse XML: " + e.getMessage(), e);
        }
    }

    @Test
    public void testConstructorWithNodeAndLocale() throws Exception {
        setupDocument("<root><child>text</child></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNotNull(pointer);
        assertEquals(rootElement, pointer.getBaseValue());
        assertEquals(Locale.US, pointer.getLocale());
    }

    @Test
    public void testConstructorWithNodeLocaleAndId() throws Exception {
        setupDocument("<root id='r1'><child>text</child></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US, "r1");
        assertNotNull(pointer);
        assertEquals(rootElement, pointer.getBaseValue());
        assertEquals(Locale.US, pointer.getLocale());
        assertEquals("id('r1')", pointer.asPath());
    }

    @Test
    public void testConstructorWithParentAndNode() throws Exception {
        setupDocument("<root><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer parentPointer = new DOMNodePointer(rootElement, Locale.US);
        Element childElement = (Element) rootElement.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(parentPointer, childElement);
        assertNotNull(pointer);
        assertEquals(childElement, pointer.getBaseValue());
        assertEquals(parentPointer, pointer.getParent());
    }

    @Test
    public void testTestNodeWithNullTest() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.testNode(null));
    }

    @Test
    public void testTestNodeWithNodeNameTestMatchingElement() throws Exception {
        setupDocument("<root><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("root"));
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNotMatchingElement() throws Exception {
        setupDocument("<root><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("other"));
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcard() throws Exception {
        setupDocument("<root><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("*"));
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() throws Exception {
        setupDocument("<root>text</root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse(pointer.testNode(test)); // root is element, not text

        Node textNode = rootElement.getFirstChild();
        DOMNodePointer textPointer = new DOMNodePointer(textNode, Locale.US);
        assertTrue(textPointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestComment() throws Exception {
        setupDocument("<root><!-- comment --></root>");
        Element rootElement = doc.getDocumentElement();
        Node commentNode = rootElement.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(commentNode, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestPI() throws Exception {
        setupDocument("<?pi target data?>");
        ProcessingInstruction pi = (ProcessingInstruction) doc.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestMatching() throws Exception {
        setupDocument("<?pi target data?>");
        ProcessingInstruction pi = (ProcessingInstruction) doc.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        ProcessingInstructionTest test = new ProcessingInstructionTest("pi");
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestNotMatching() throws Exception {
        setupDocument("<?pi target data?>");
        ProcessingInstruction pi = (ProcessingInstruction) doc.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testGetNameForElement() throws Exception {
        setupDocument("<root xmlns:ns='http://example.com'><ns:child/></root>");
        Element childElement = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(childElement, Locale.US);
        QName name = pointer.getName();
        assertEquals("ns", name.getPrefix());
        assertEquals("child", name.getName());
    }

    @Test
    public void testGetNameForProcessingInstruction() throws Exception {
        setupDocument("<?pi target data?>");
        ProcessingInstruction pi = (ProcessingInstruction) doc.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("pi", name.getName());
    }

    @Test
    public void testGetNamespaceURIForElement() throws Exception {
        setupDocument("<root xmlns='http://example.com'><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals("http://example.com", pointer.getNamespaceURI());
    }
    
    @Test
    public void testGetNamespaceURIForElementWithExplicitNamespace() throws Exception {
        setupDocument("<root xmlns:ns='http://example.com'><ns:child/></root>");
        Element childElement = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(childElement, Locale.US);
        assertEquals("http://example.com", pointer.getNamespaceURI());
    }

    @Test
    public void testChildIteratorForElements() throws Exception {
        setupDocument("<root><child1/><child2/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodeIterator iterator = pointer.childIterator(null, false, null);
        assertTrue(iterator.setPosition(1));
        assertEquals("child1", iterator.getNodePointer().getName().getName());
        assertTrue(iterator.setPosition(2));
        assertEquals("child2", iterator.getNodePointer().getName().getName());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testAttributeIterator() throws Exception {
        setupDocument("<root attr='value' xmlns:ns='http://example.com' ns:attr2='value2'/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodeIterator iterator = pointer.attributeIterator(null);
        assertTrue(iterator.setPosition(1));
        assertEquals("attr", iterator.getNodePointer().getName().getName());
        assertTrue(iterator.setPosition(2));
        assertEquals("attr2", iterator.getNodePointer().getName().getName());
        assertEquals("ns", iterator.getNodePointer().getName().getPrefix());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testNamespacePointer() throws Exception {
        setupDocument("<root xmlns='default' xmlns:ns='http://example.com'/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodePointer nsPointer = pointer.namespacePointer("ns");
        assertNotNull(nsPointer);
        assertEquals("http://example.com", nsPointer.getValue());
    }
    
    @Test
    public void testNamespacePointerForDefaultNamespace() throws Exception {
        setupDocument("<root xmlns='default'/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodePointer nsPointer = pointer.namespacePointer("");
        assertNotNull(nsPointer);
        assertEquals("default", nsPointer.getValue());
    }

    @Test
    public void testNamespaceIterator() throws Exception {
        setupDocument("<root xmlns='default' xmlns:ns='http://example.com'/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NodeIterator iterator = pointer.namespaceIterator();
        assertTrue(iterator.setPosition(1)); // Default namespace
        assertEquals("", iterator.getNodePointer().getName().getName());
        assertEquals("default", iterator.getNodePointer().getValue());
        assertTrue(iterator.setPosition(2)); // ns prefix
        assertEquals("ns", iterator.getNodePointer().getName().getName());
        assertEquals("http://example.com", iterator.getNodePointer().getValue());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testGetNamespaceResolver() throws Exception {
        setupDocument("<root xmlns:ns='http://example.com'/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        NamespaceResolver resolver = pointer.getNamespaceResolver();
        assertNotNull(resolver);
        assertEquals("http://example.com", resolver.getNamespaceURI("ns"));
    }

    @Test
    public void testGetDefaultNamespaceURI() throws Exception {
        setupDocument("<root xmlns='default'/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals("default", pointer.getDefaultNamespaceURI());
    }
    
    @Test
    public void testGetDefaultNamespaceURIWhenNone() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetBaseValue() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals(rootElement, pointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals(rootElement, pointer.getImmediateNode());
    }

    @Test
    public void testIsActual() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.isActual());
    }

    @Test
    public void testIsCollection() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetLength() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void testIsLeafWhenHasChildNodes() throws Exception {
        setupDocument("<root><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLeafWhenNoChildNodes() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLanguageWhenAttributeMatches() throws Exception {
        setupDocument("<root xml:lang='en'><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWhenAttributePartialMatch() throws Exception {
        setupDocument("<root xml:lang='en-US'><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWhenAttributeNotMatching() throws Exception {
        setupDocument("<root xml:lang='fr'><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWhenInherited() throws Exception {
        setupDocument("<root xml:lang='en'><child lang='en-US'/></root>");
        Element childElement = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(childElement, Locale.US);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testSetValueForTextNode() throws Exception {
        setupDocument("<root>old text</root>");
        Element rootElement = doc.getDocumentElement();
        Node textNode = rootElement.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue("new text");
        assertEquals("new text", textNode.getNodeValue());
    }

    @Test
    public void testSetValueForTextNodeToRemove() throws Exception {
        setupDocument("<root>old text</root>");
        Element rootElement = doc.getDocumentElement();
        Node textNode = rootElement.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue(""); // Setting empty string should remove node
        assertEquals(0, rootElement.getChildNodes().getLength());
    }

    @Test
    public void testSetValueForElementWithNewText() throws Exception {
        setupDocument("<root><oldChild/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        pointer.setValue("new text");
        assertEquals(1, rootElement.getChildNodes().getLength());
        assertEquals(Node.TEXT_NODE, rootElement.getFirstChild().getNodeType());
        assertEquals("new text", rootElement.getFirstChild().getNodeValue());
    }
    
    @Test
    public void testSetValueForElementWithNewElement() throws Exception {
        setupDocument("<root><oldChild/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        
        Document newDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element newElement = newDoc.createElement("new");
        newElement.setTextContent("content");
        
        pointer.setValue(newElement);
        
        assertEquals(1, rootElement.getChildNodes().getLength());
        Node appendedNode = rootElement.getFirstChild();
        assertEquals(Node.ELEMENT_NODE, appendedNode.getNodeType());
        assertEquals("new", appendedNode.getNodeName());
        assertEquals("content", appendedNode.getFirstChild().getNodeValue());
    }


    
    @Test
    public void testCreateAttributeSuccessfully() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        
        NodePointer attrPointer = pointer.createAttribute(JXPathContext.newContext(rootElement), new QName("newAttr"));
        assertNotNull(attrPointer);
        assertEquals("newAttr", attrPointer.getName().getName());
        assertEquals("", rootElement.getAttribute("newAttr")); // Default value is empty string
    }

    @Test
    public void testCreateAttributeWithNamespaceSuccessfully() throws Exception {
        setupDocument("<root xmlns:ns='http://example.com'/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        
        JXPathContext context = JXPathContext.newContext(rootElement);
        NodePointer attrPointer = pointer.createAttribute(context, new QName("ns", "newAttr"));
        assertNotNull(attrPointer);
        assertEquals("newAttr", attrPointer.getName().getName());
        assertEquals("ns", attrPointer.getName().getPrefix());
        assertEquals("http://example.com", attrPointer.getNamespaceURI());
        assertEquals("", rootElement.getAttributeNS("http://example.com", "newAttr"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeWithUnknownNamespacePrefix() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        
        JXPathContext context = JXPathContext.newContext(rootElement);
        pointer.createAttribute(context, new QName("ns", "newAttr"));
    }

    @Test
    public void testRemoveNode() throws Exception {
        setupDocument("<root><child/></root>");
        Element rootElement = doc.getDocumentElement();
        Element childElement = (Element) rootElement.getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(childElement, Locale.US);
        pointer.remove();
        assertEquals(0, rootElement.getChildNodes().getLength());
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootNode() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        pointer.remove();
    }

    @Test
    public void testAsPathForId() throws Exception {
        setupDocument("<root id='r1'><child/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US, "r1");
        assertEquals("id('r1')", pointer.asPath());
    }

    @Test
    public void testAsPathForElement() throws Exception {
        setupDocument("<root><child1/><child2/></root>");
        // Find child2 by iterating through siblings to ensure correct relative position
        Element rootElement = doc.getDocumentElement();
        Node child2Node = null;
        NodeList children = rootElement.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            if (children.item(i).getNodeType() == Node.ELEMENT_NODE && children.item(i).getNodeName().equals("child2")) {
                child2Node = children.item(i);
                break;
            }
        }
        DOMNodePointer pointer = new DOMNodePointer(child2Node, Locale.US);
        assertEquals("/root[1]/child2[2]", pointer.asPath());
    }

    @Test
    public void testAsPathForElementWithNamespace() throws Exception {
        setupDocument("<root xmlns:ns='http://example.com'><ns:child/></root>");
        Element childElement = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(childElement, Locale.US);
        
        assertEquals("/root[1]/ns:child[1]", pointer.asPath());
    }

    @Test
    public void testAsPathForTextNode() throws Exception {
        setupDocument("<root>text</root>");
        Node textNode = doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("/root[1]/text()[1]", pointer.asPath());
    }

    @Test
    public void testAsPathForPI() throws Exception {
        setupDocument("<root><?pi target data?></root>");
        ProcessingInstruction pi = (ProcessingInstruction) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        assertEquals("/root[1]/processing-instruction('target')[1]", pointer.asPath());
    }

    @Test
    public void testHashCode() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(rootElement, Locale.US);
        assertEquals(pointer1.hashCode(), pointer2.hashCode());
    }

    @Test
    public void testEquals() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(rootElement, Locale.US);
        DOMNodePointer pointer3 = new DOMNodePointer(doc.getDocumentElement().cloneNode(true), Locale.US); // Different Node object

        assertTrue(pointer1.equals(pointer2));
        assertFalse(pointer1.equals(pointer3));
        assertFalse(pointer1.equals(null));
        assertFalse(pointer1.equals("string"));
    }

    @Test
    public void testGetPrefixForElementWithPrefix() throws Exception {
        setupDocument("<ns:root xmlns:ns='http://example.com'/>");
        Element rootElement = (Element) doc.getFirstChild(); // Assuming ns:root is the root
        assertEquals("ns", DOMNodePointer.getPrefix(rootElement));
    }

    @Test
    public void testGetPrefixForElementWithoutPrefix() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        assertNull(DOMNodePointer.getPrefix(rootElement));
    }
    
    @Test
    public void testGetPrefixForDocument() throws Exception {
        setupDocument("<root/>");
        assertNull(DOMNodePointer.getPrefix(doc)); // Document node has no prefix
    }

    @Test
    public void testGetLocalNameForElementWithPrefix() throws Exception {
        setupDocument("<ns:root xmlns:ns='http://example.com'/>");
        Element rootElement = (Element) doc.getFirstChild();
        assertEquals("root", DOMNodePointer.getLocalName(rootElement));
    }

    @Test
    public void testGetLocalNameForElementWithoutPrefix() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        assertEquals("root", DOMNodePointer.getLocalName(rootElement));
    }
    
    @Test
    public void testGetLocalNameForDocument() throws Exception {
        setupDocument("<root/>");
        assertNull(DOMNodePointer.getLocalName(doc)); // Document node has no local name
    }

    @Test
    public void testGetNamespaceURIForElementWithNamespace() throws Exception {
        setupDocument("<root xmlns='http://example.com'><child/></root>");
        Element rootElement = doc.getDocumentElement();
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(rootElement));
    }

    @Test
    public void testGetNamespaceURIForElementWithPrefixedNamespace() throws Exception {
        setupDocument("<ns:root xmlns:ns='http://example.com'><child/></ns:root>");
        Element rootElement = (Element) doc.getFirstChild();
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(rootElement));
    }
    
    @Test
    public void testGetNamespaceURIForElementWithAttributeDefiningNamespace() throws Exception {
        setupDocument("<root xmlns:prefix='http://example.com'/>");
        Element rootElement = doc.getDocumentElement();
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(rootElement));
    }

    @Test
    public void testGetValueForCommentNode() throws Exception {
        setupDocument("<root><!-- comment data --></root>");
        Comment commentNode = (Comment) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(commentNode, Locale.US);
        assertEquals("comment data", pointer.getValue());
    }
    
    @Test
    public void testGetValueForCommentNodeWithSpaces() throws Exception {
        setupDocument("<root><!--   comment data   --></root>");
        Comment commentNode = (Comment) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(commentNode, Locale.US);
        assertEquals("comment data", pointer.getValue());
    }

    @Test
    public void testGetValueForTextNode() throws Exception {
        setupDocument("<root>text data</root>");
        Node textNode = doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("text data", pointer.getValue());
    }
    
    @Test
    public void testGetValueForTextNodeWithSpaces() throws Exception {
        setupDocument("<root>   text data   </root>");
        Node textNode = doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("text data", pointer.getValue());
    }
    
    @Test
    public void testGetValueForTextNodeWithPreserveSpace() throws Exception {
        setupDocument("<root xml:space='preserve'>  text data  </root>");
        Node textNode = doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("  text data  ", pointer.getValue());
    }

    @Test
    public void testGetValueForPI() throws Exception {
        setupDocument("<root><?pi target data?></root>");
        ProcessingInstruction pi = (ProcessingInstruction) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        assertEquals("data", pointer.getValue());
    }
    
    @Test
    public void testGetValueForPIWithSpaces() throws Exception {
        setupDocument("<root><?pi target   data   ?></root>");
        ProcessingInstruction pi = (ProcessingInstruction) doc.getDocumentElement().getFirstChild();
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        assertEquals("data", pointer.getValue());
    }

    @Test
    public void testGetValueForElementWithChildren() throws Exception {
        setupDocument("<root><child1>text1</child1><child2>text2</child2></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals("text1text2", pointer.getValue());
    }

    @Test
    public void testGetValueForElementWithMixedContent() throws Exception {
        setupDocument("<root>text <child>inner</child> more text</root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals("textinnermore text", pointer.getValue());
    }

    @Test
    public void testGetPointerByID() throws Exception {
        setupDocument("<root id='r1'><child id='c1'/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        Pointer foundPointer = pointer.getPointerByID(JXPathContext.newContext(rootElement), "c1");
        assertNotNull(foundPointer);
        assertTrue(foundPointer instanceof DOMNodePointer);
        assertEquals("id('c1')", foundPointer.asPath()); 
    }
    
    @Test
    public void testGetPointerByIDNotFound() throws Exception {
        setupDocument("<root/>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        Pointer foundPointer = pointer.getPointerByID(JXPathContext.newContext(rootElement), "nonexistent");
        assertNotNull(foundPointer);
        assertTrue(foundPointer instanceof NullPointer);
    }

    @Test
    public void testCompareChildNodePointersEqual() throws Exception {
        setupDocument("<root><child1/><child2/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer1 = new DOMNodePointer((Node) rootElement.getChildNodes().item(0), Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer((Node) rootElement.getChildNodes().item(0), Locale.US);
        assertEquals(0, pointer1.compareChildNodePointers(pointer1, pointer2));
    }

    @Test
    public void testCompareChildNodePointersFirstBeforeSecond() throws Exception {
        setupDocument("<root><child1/><child2/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer1 = new DOMNodePointer((Node) rootElement.getChildNodes().item(0), Locale.US); // child1
        DOMNodePointer pointer2 = new DOMNodePointer((Node) rootElement.getChildNodes().item(1), Locale.US); // child2
        assertEquals(-1, pointer1.compareChildNodePointers(pointer1, pointer2));
    }
    
    @Test
    public void testCompareChildNodePointersSecondBeforeFirst() throws Exception {
        setupDocument("<root><child1/><child2/></root>");
        Element rootElement = doc.getDocumentElement();
        DOMNodePointer pointer1 = new DOMNodePointer((Node) rootElement.getChildNodes().item(1), Locale.US); // child2
        DOMNodePointer pointer2 = new DOMNodePointer((Node) rootElement.getChildNodes().item(0), Locale.US); // child1
        assertEquals(1, pointer1.compareChildNodePointers(pointer1, pointer2));
    }
    
    @Test
    public void testCompareChildNodePointersAttributeVsElement() throws Exception {
        setupDocument("<root attr='val'><child/></root>");
        Element rootElement = doc.getDocumentElement();
        Node attrNode = rootElement.getAttributes().item(0);
        Node childNode = rootElement.getFirstChild();
        
        DOMNodePointer attrPointer = new DOMNodePointer(attrNode, Locale.US);
        DOMNodePointer childPointer = new DOMNodePointer(childNode, Locale.US);
        
        assertEquals(-1, attrPointer.compareChildNodePointers(attrPointer, childPointer));
        assertEquals(1, childPointer.compareChildNodePointers(childPointer, attrPointer));
    }
}
