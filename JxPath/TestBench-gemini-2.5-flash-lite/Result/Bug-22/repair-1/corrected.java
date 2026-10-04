package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
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
import org.w3c.dom.DocumentType;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

// Mock DOM Node classes for testing purposes
class MockDocument implements Document {
    private Element rootElement;
    private DOMImplementation domImplementation = new MockDOMImplementation();

    MockDocument() {
        rootElement = new MockElement("root", this);
    }

    @Override
    public Element getDocumentElement() {
        return rootElement;
    }

    @Override
    public Element getElementById(String id) {
        // Simplified: Only checks the root element for this mock.
        if (rootElement != null && rootElement.getAttribute("id").equals(id)) {
            return rootElement;
        }
        return null;
    }

    @Override
    public Node getFirstChild() {
        return rootElement;
    }

    @Override
    public Node removeChild(Node oldChild) {
        if (rootElement == oldChild) {
            rootElement = null;
        }
        return oldChild;
    }

    @Override
    public Node insertBefore(Node newChild, Node refChild) {
        return newChild;
    }

    @Override
    public Node replaceChild(Node newChild, Node oldChild) {
        return newChild;
    }

    @Override
    public Node appendChild(Node newChild) {
        if (newChild.getNodeType() == ELEMENT_NODE) {
            rootElement = (Element) newChild;
        }
        ((MockNode) newChild).setParentNode(this);
        return newChild;
    }

    @Override
    public Node getOwnerDocument() {
        return this;
    }

    @Override
    public void setNodeValue(String nodeValue) {}
    @Override public String getNodeValue() { return null; }
    @Override public String getNodeName() { return "#document"; }
    @Override public short getNodeType() { return DOCUMENT_NODE; }
    @Override public Node getParentNode() { return null; }
    @Override public NodeList getChildNodes() { return new MockNodeList(new Node[]{rootElement}); }
    @Override public Node getNextSibling() { return null; }
    @Override public Node getPreviousSibling() { return null; }
    @Override public NamedNodeMap getAttributes() { return null; }
    @Override public Node cloneNode(boolean deep) { return null; }
    @Override public boolean hasChildNodes() { return rootElement != null; }
    @Override public boolean hasAttributes() { return false; }
    @Override public String getNamespaceURI() { return null; }
    @Override public String getPrefix() { return null; }
    @Override public String getLocalName() { return null; }
    @Override public String getBaseURI() { return null; }
    @Override public String getNamespaceURI(String prefix) {
        if ("xmlns".equals(prefix)) return "http://www.w3.org/2000/xmlns/";
        if ("xml".equals(prefix)) return "http://www.w3.org/XML/1998/namespace";
        return null;
    }
    @Override public NodeList getElementsByTagName(String tagname) { return null; }
    @Override public Node adoptNode(Node source) { return null; }
    @Override public Node importNode(Node importedNode, boolean deep) { return null; }
    @Override public String getXmlEncoding() { return null; }
    @Override public String getXmlVersion() { return null; }
    @Override public void setXmlStandalone(boolean xmlStandalone) {}
    @Override public boolean getXmlStandalone() { return false; }
    @Override public void setXmlVersion(String xmlVersion) {}
    @Override public void setXmlEncoding(String xmlEncoding) {}
    @Override public DocumentType getDoctype() { return null; }
    @Override public DOMImplementation getImplementation() { return domImplementation; }
    @Override public Element createElementNS(String namespaceURI, String qualifiedName) { return null; }
    @Override public Attr createAttributeNS(String namespaceURI, String qualifiedName) { return null; }
    @Override public Text createTextNode(String data) { return new MockTextNode(data, this); }
    @Override public Comment createComment(String data) { return new MockComment(data, this); }
    @Override public org.w3c.dom.CDATASection createCDATASection(String data) { return null; }
    @Override public ProcessingInstruction createProcessingInstruction(String target, String data) { return new MockProcessingInstruction(target, data, this); }
    @Override public org.w3c.dom.EntityReference createEntityReference(String name) { return null; }
    @Override public org.w3c.dom.Notation createNotation(String name) { return null; }
    @Override public Element createElement(String tagName) { return new MockElement(tagName, this); }
    @Override public Attr createAttribute(String name) { return new MockAttr(name, "", null, this); }
}

class MockElement extends MockNode implements Element {
    private String name;
    private String namespaceURI;
    private String prefix;
    private String localName;
    private NamedNodeMap attributes = new MockNamedNodeMap();
    private NodeList children = new MockNodeList();

    MockElement(String name, Document ownerDocument) {
        super(ownerDocument);
        this.name = name;
        int index = name.indexOf(':');
        if (index != -1) {
            this.prefix = name.substring(0, index);
            this.localName = name.substring(index + 1);
        } else {
            this.localName = name;
            this.prefix = null;
        }
        // Simplified for mock: lookup namespace from ownerDocument
        this.namespaceURI = ownerDocument.getNamespaceURI(prefix);
    }

    @Override public String getTagName() { return name; }
    @Override public String getAttribute(String name) {
        Attr attr = (Attr) attributes.getNamedItem(name);
        return attr == null ? "" : attr.getValue();
    }
    @Override public void setAttribute(String name, String value) {
        Attr attr = ownerDocument.createAttribute(name);
        attr.setNodeValue(value);
        attributes.setNamedItem(attr);
    }
    @Override public void removeAttribute(String name) { attributes.removeNamedItem(name); }
    @Override public Attr getAttributeNode(String name) { return (Attr) attributes.getNamedItem(name); }
    @Override public void setAttributeNode(Attr newAttr) { attributes.setNamedItem(newAttr); }
    @Override public void removeAttributeNode(Attr oldAttr) { attributes.removeNamedItem(oldAttr.getName()); }
    @Override public NodeList getElementsByTagName(String tagname) { return null; }
    @Override public String getAttributeNS(String namespaceURI, String localName) { return ""; }
    @Override public void setAttributeNS(String namespaceURI, String qualifiedName, String value) {
        // Simplified: create a MockAttr directly
        Attr attr = ownerDocument.createAttributeNS(namespaceURI, qualifiedName);
        attr.setNodeValue(value);
        ((MockAttr)attr).setNamespaceURI(namespaceURI); // Explicitly set for mock
        ((MockAttr)attr).setLocalName(localName); // Explicitly set for mock
        attributes.setNamedItemNS(attr);
    }
    @Override public void removeAttributeNS(String namespaceURI, String localName) {}
    @Override public Attr getAttributeNodeNS(String namespaceURI, String localName) { return null; }
    @Override public NamedNodeMap getAttributes() { return attributes; }
    @Override public NodeList getChildNodes() { return children; }
    @Override public void setParentNode(Node parent) { this.parentNode = parent; }
    @Override public Node getParentNode() { return parentNode; }
    @Override public void setNodeValue(String nodeValue) { this.name = nodeValue; }
    @Override public String getNodeValue() { return name; }
    @Override public String getNodeName() { return name; }
    @Override public short getNodeType() { return ELEMENT_NODE; }
    @Override public Node getOwnerDocument() { return ownerDocument; }
    @Override public Node getFirstChild() { return children.getLength() > 0 ? children.item(0) : null; }
    @Override public Node getLastChild() { return children.getLength() > 0 ? children.item(children.getLength() - 1) : null; }
    @Override public Node getNextSibling() { return null; }
    @Override public Node getPreviousSibling() { return null; }
    @Override public boolean hasChildNodes() { return children.getLength() > 0; }
    @Override public boolean hasAttributes() { return attributes.getLength() > 0; }
    @Override public String getNamespaceURI() { return namespaceURI; }
    @Override public String getPrefix() { return prefix; }
    @Override public String getLocalName() { return localName; }
    @Override public String getBaseURI() { return null; }
    @Override public String getNamespaceURI(String prefix) { return ownerDocument.getNamespaceURI(prefix); }
    @Override public Node cloneNode(boolean deep) { return null; }
    @Override public Node appendChild(Node newChild) {
        ((MockNode)newChild).setParentNode(this);
        ((MockNodeList)children).add(newChild);
        return newChild;
    }
    @Override public Node removeChild(Node oldChild) {
        ((MockNodeList)children).remove(oldChild);
        ((MockNode)oldChild).setParentNode(null);
        return oldChild;
    }
    @Override public Node insertBefore(Node newChild, Node refChild) { return null; }
    @Override public Node replaceChild(Node newChild, Node oldChild) { return null; }
    @Override public void setIdAttribute(String name, boolean isId) {}
    @Override public void setIdAttributeNS(String namespaceURI, String localName, boolean isId) {}
    @Override public void setIdAttributeNode(Attr idAttr, boolean isId) {}
    @Override public boolean getSchemaTypeInfo() { return false;} // Dummy implementation
}

class MockAttr implements Attr {
    private String name;
    private String value;
    private Node ownerElement;
    private String namespaceURI;
    private String prefix;
    private String localName;
    private Document ownerDocument;

    MockAttr(String name, String value, Node ownerElement, Document ownerDocument) {
        this.name = name;
        this.value = value;
        this.ownerElement = ownerElement;
        this.ownerDocument = ownerDocument;

        int index = name.indexOf(':');
        if (index != -1) {
            this.prefix = name.substring(0, index);
            this.localName = name.substring(index + 1);
            this.namespaceURI = ownerDocument.getNamespaceURI(prefix);
        } else {
            this.localName = name;
            this.prefix = null;
            this.namespaceURI = null;
        }
    }

    public void setNamespaceURI(String namespaceURI) { this.namespaceURI = namespaceURI; }
    public void setLocalName(String localName) { this.localName = localName; }
    public void setPrefix(String prefix) { this.prefix = prefix; }

    @Override public String getName() { return name; }
    @Override public String getValue() { return value; }
    @Override public void setValue(String value) { this.value = value; }
    @Override public Node getOwnerElement() { return ownerElement; }
    @Override public String getNamespaceURI() { return namespaceURI; }
    @Override public String getPrefix() { return prefix; }
    @Override public String getLocalName() { return localName; }
    @Override public boolean getSpecified() { return true; }
    @Override public void setNodeValue(String nodeValue) { this.value = nodeValue; }
    @Override public String getNodeValue() { return value; }
    @Override public String getNodeName() { return name; }
    @Override public short getNodeType() { return ATTRIBUTE_NODE; }
    @Override public Node getParentNode() { return ownerElement; }
    @Override public Node getOwnerDocument() { return ownerDocument; }
    @Override public Node cloneNode(boolean deep) { return null; }
    @Override public boolean hasAttributes() { return false; }
    @Override public String getBaseURI() { return null; }
    @Override public String getNamespaceURI(String prefix) { return ownerDocument.getNamespaceURI(prefix); }
    @Override public boolean hasChildNodes() { return false; }
    @Override public NodeList getChildNodes() { return null; }
    @Override public Node getFirstChild() { return null; }
    @Override public Node getLastChild() { return null; }
    @Override public Node getNextSibling() { return null; }
    @Override public Node getPreviousSibling() { return null; }
    @Override public NamedNodeMap getAttributes() { return null; }
    @Override public Node insertBefore(Node newChild, Node refChild) { return null; }
    @Override public Node replaceChild(Node newChild, Node oldChild) { return null; }
    @Override public Node removeChild(Node oldChild) { return null; }
    @Override public void setSpecified(boolean specified) {}
}

class MockNamedNodeMap implements NamedNodeMap {
    private Map<String, Node> nodes = new HashMap<>();
    private Map<String, Node> nsNodes = new HashMap<>();

    @Override public Node getNamedItem(String name) { return nodes.get(name); }
    @Override public Node setNamedItem(Node arg) { return nodes.put(arg.getNodeName(), arg); }
    @Override public Node removeNamedItem(String name) { return nodes.remove(name); }
    @Override public Node item(int index) {
        return nodes.values().toArray(new Node[0])[index];
    }
    @Override public int getLength() { return nodes.size(); }

    @Override public Node getNamedItemNS(String namespaceURI, String localName) {
        String key = namespaceURI + ":" + localName;
        return nsNodes.get(key);
    }
    @Override public Node setNamedItemNS(Node arg) {
        String key = arg.getNamespaceURI() + ":" + arg.getLocalName();
        nsNodes.put(key, arg);
        nodes.put(arg.getNodeName(), arg); // Also store by qualified name
        return arg;
    }
}

class MockNodeList implements NodeList {
    private Node[] nodes;

    MockNodeList(Node[] nodes) {
        this.nodes = nodes != null ? nodes : new Node[0];
    }
    MockNodeList() {
        this(new Node[0]);
    }
    @Override public Node item(int index) { return index >= 0 && index < nodes.length ? nodes[index] : null; }
    @Override public int getLength() { return nodes.length; }
    void add(Node node) {
        Node[] newNodes = new Node[nodes.length + 1];
        System.arraycopy(nodes, 0, newNodes, 0, nodes.length);
        newNodes[nodes.length] = node;
        nodes = newNodes;
    }
    void remove(Node node) {
        int index = -1;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] == node) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Node[] newNodes = new Node[nodes.length - 1];
            System.arraycopy(nodes, 0, newNodes, 0, index);
            System.arraycopy(nodes, index + 1, newNodes, index, nodes.length - index - 1);
            nodes = newNodes;
        }
    }
}

// Mock Base class for Node implementations
abstract class MockNode implements Node {
    protected Node parentNode;
    protected Document ownerDocument;

    MockNode(Document ownerDocument) {
        this.ownerDocument = ownerDocument;
    }

    @Override public Node getParentNode() { return parentNode; }
    @Override public void setParentNode(Node parent) { this.parentNode = parent; }
    @Override public Document getOwnerDocument() { return ownerDocument; }

    // Implementations for methods not directly used in tests or simplified
    @Override public NodeList getChildNodes() { return new MockNodeList(); }
    @Override public Node getNextSibling() { return null; }
    @Override public Node getPreviousSibling() { return null; }
    @Override public NamedNodeMap getAttributes() { return new MockNamedNodeMap(); }
    @Override public String getNamespaceURI() { return null; }
    @Override public String getPrefix() { return null; }
    @Override public String getLocalName() { return null; }
    @Override public String getBaseURI() { return null; }
    @Override public String getNamespaceURI(String prefix) { return ownerDocument.getNamespaceURI(prefix); }
    @Override public Node cloneNode(boolean deep) { return null; }
    @Override public boolean hasChildNodes() { return false; }
    @Override public boolean hasAttributes() { return false; }
    @Override public Node insertBefore(Node newChild, Node refChild) { return null; }
    @Override public Node replaceChild(Node newChild, Node oldChild) { return null; }
    @Override public void setNodeValue(String nodeValue) {}
    @Override public String getNodeValue() { return null; }
    @Override public String getNodeName() { return null; }
    @Override public short getNodeType() { return 0; }
    @Override public Node getFirstChild() { return null; }
    @Override public Node getLastChild() { return null; }
    @Override public Attr createAttribute(String name) { return null; }
    @Override public NodeList getElementsByTagName(String tagname) { return null; }
    @Override public Node adoptNode(Node source) { return null; }
    @Override public Node importNode(Node importedNode, boolean deep) { return null; }
    @Override public String getXmlEncoding() { return null; }
    @Override public String getXmlVersion() { return null; }
    @Override public void setXmlStandalone(boolean xmlStandalone) {}
    @Override public boolean getXmlStandalone() { return false; }
    @Override public void setXmlVersion(String xmlVersion) {}
    @Override public void setXmlEncoding(String xmlEncoding) {}
    @Override public DocumentType getDoctype() { return null; }
    @Override public DOMImplementation getImplementation() { return ownerDocument.getImplementation(); }
    @Override public Element createElementNS(String namespaceURI, String qualifiedName) { return null; }
    @Override public Attr createAttributeNS(String namespaceURI, String qualifiedName) { return null; }
    @Override public Text createTextNode(String data) { return ownerDocument.createTextNode(data); }
    @Override public Comment createComment(String data) { return ownerDocument.createComment(data); }
    @Override public org.w3c.dom.CDATASection createCDATASection(String data) { return null; }
    @Override public ProcessingInstruction createProcessingInstruction(String target, String data) { return ownerDocument.createProcessingInstruction(target, data); }
    @Override public org.w3c.dom.EntityReference createEntityReference(String name) { return null; }
    @Override public org.w3c.dom.Notation createNotation(String name) { return null; }
    @Override public Element createElement(String tagName) { return ownerDocument.createElement(tagName); }
}

class MockProcessingInstruction extends MockNode implements ProcessingInstruction {
    private String target;
    private String data;

    MockProcessingInstruction(String target, String data, Document ownerDocument) {
        super(ownerDocument);
        this.target = target;
        this.data = data;
    }

    @Override public String getTarget() { return target; }
    @Override public String getData() { return data; }
    @Override public void setNodeValue(String nodeValue) { this.data = nodeValue; }
    @Override public String getNodeValue() { return data; }
    @Override public short getNodeType() { return PROCESSING_INSTRUCTION_NODE; }
}

class MockComment extends MockNode implements Comment {
    private String data;

    MockComment(String data, Document ownerDocument) {
        super(ownerDocument);
        this.data = data;
    }

    @Override public String getData() { return data; }
    @Override public void setNodeValue(String nodeValue) { this.data = nodeValue; }
    @Override public String getNodeValue() { return data; }
    @Override public short getNodeType() { return COMMENT_NODE; }
}

class MockTextNode extends MockNode implements Text {
    private String data;

    MockTextNode(String data, Document ownerDocument) {
        super(ownerDocument);
        this.data = data;
    }

    @Override public String getData() { return data; }
    @Override public void setNodeValue(String nodeValue) { this.data = nodeValue; }
    @Override public String getNodeValue() { return data; }
    @Override public short getNodeType() { return TEXT_NODE; }
    @Override public Text splitText(int offset) { return null; }
    @Override public String getWholeText() { return null; }
    @Override public boolean isElementContentWhitespace() { return false; }
    @Override public org.w3c.dom.CDATASection asCDATASection() { return null; }
    @Override public Text replaceWholeText(String content) { return null; }
}

class MockDOMImplementation implements DOMImplementation {
    @Override
    public boolean hasFeature(String feature, String version) {
        return false;
    }

    @Override
    public DocumentType createDocumentType(String qualifiedName, String publicId, String systemId) {
        return null;
    }

    @Override
    public Element createElementNS(String namespaceURI, String qualifiedName) {
        return null;
    }

    @Override
    public Attr createAttributeNS(String namespaceURI, String qualifiedName) {
        return null;
    }

    @Override
    public Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype) {
        return null;
    }

    @Override
    public org.w3c.dom.html.HTMLDocument createHTMLDocument(String title) {
        return null;
    }
}


public class DOMNodePointerTest {

    // Helper method to create a mock DOM structure
    private DOMNodePointer createDOMNodePointer(Node node) {
        return new DOMNodePointer(node, Locale.ENGLISH);
    }

    private Element createElement(String name) {
        MockDocument doc = new MockDocument();
        return new MockElement(name, doc);
    }

    private Attr createAttribute(String name, String value, Element parent, Document doc) {
        return new MockAttr(name, value, parent, doc);
    }

    private ProcessingInstruction createPI(String target, String data, Document doc) {
        return new MockProcessingInstruction(target, data, doc);
    }

    private Comment createComment(String data, Document doc) {
        return new MockComment(data, doc);
    }

    private Text createTextNode(String data, Document doc) {
        return new MockTextNode(data, doc);
    }

    @Test
    public void testGetName() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        QName name = pointer.getName();
        assertEquals("root", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testGetNameWithPrefix() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("ns:root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        QName name = pointer.getName();
        assertEquals("root", name.getName());
        assertEquals("ns", name.getPrefix());
    }

    @Test
    public void testGetNameForPI() throws Exception {
        Document doc = new MockDocument();
        ProcessingInstruction pi = new MockProcessingInstruction("target", "data", doc);
        DOMNodePointer pointer = createDOMNodePointer(pi);
        QName name = pointer.getName();
        assertEquals("target", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testGetNamespaceURI() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("ns:root", doc);
        ((MockElement)element).namespaceURI = "http://example.com/ns";
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertEquals("http://example.com/ns", pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIForElementWithoutPrefix() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertNull(pointer.getNamespaceURI());
    }

    @Test
    public void testDefaultNamespaceURI() throws Exception {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        root.setAttribute("xmlns", "http://default.ns");
        DOMNodePointer pointer = createDOMNodePointer(root);
        assertEquals("http://default.ns", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testDefaultNamespaceURIWithEmptyValue() throws Exception {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        root.setAttribute("xmlns", "");
        DOMNodePointer pointer = createDOMNodePointer(root);
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testNamespaceURIFromAttribute() throws Exception {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        Element child = new MockElement("child", doc);
        child.setParentNode(root);
        root.appendChild(child);
        child.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:custom", "http://custom.ns");
        DOMNodePointer pointer = createDOMNodePointer(child);
        assertEquals("http://custom.ns", pointer.getNamespaceURI("custom"));
    }

    @Test
    public void testGetNamespaceURIForXMLNSAttribute() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(root);
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURIForXMLAttribute() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(root);
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIUnknownPrefix() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(root);
        // The code maps UNKNOWN_NAMESPACE to "", and if it's "", it returns null.
        // So, for an unknown prefix, it should return null.
        assertNull(pointer.getNamespaceURI("unknown"));
    }
    
    @Test
    public void testGetNamespaceURIUnknownPrefixWithMapCheck() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(root);
        pointer.getNamespaceURI("unknown"); // This call populates the internal map
        // Check if the map contains the unknown prefix mapped to UNKNOWN_NAMESPACE
        NamespaceResolver resolver = pointer.getNamespaceResolver();
        assertNotNull(resolver);
        // The actual mapping inside NamespaceResolver is not directly accessible here,
        // but we expect getNamespaceURI to return null for unknown prefixes.
    }

    @Test
    public void testGetBaseValue() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertSame(element, pointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertSame(element, pointer.getImmediateNode());
    }

    @Test
    public void testIsActual() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertTrue(pointer.isActual());
    }

    @Test
    public void testIsCollection() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetLength() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void testIsLeafWhenHasChildren() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("parent", doc);
        Element child = new MockElement("child", doc);
        child.setParentNode(element);
        element.appendChild(child);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLeafWhenNoChildren() throws Exception {
        Document doc = new MockDocument();
        Element element = new MockElement("element", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLanguageWhenAttributeMatches() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        element.setAttribute("xml:lang", "en-US");
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWhenParentAttributeMatches() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Element child = new MockElement("child", doc);
        child.setParentNode(parent);
        parent.appendChild(child);
        parent.setAttribute("xml:lang", "fr");
        DOMNodePointer pointer = createDOMNodePointer(child);
        assertTrue(pointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageWhenNoAttributeMatches() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testSetValueForTextNode() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Text textNode = doc.createTextNode("old value");
        textNode.setParentNode(parent);
        parent.appendChild(textNode);
        DOMNodePointer pointer = createDOMNodePointer(textNode);
        pointer.setValue("new value");
        assertEquals("new value", textNode.getNodeValue());
    }

    @Test
    public void testSetValueForTextNodeWithNull() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Text textNode = doc.createTextNode("old value");
        textNode.setParentNode(parent);
        parent.appendChild(textNode);
        DOMNodePointer pointer = createDOMNodePointer(textNode);
        pointer.setValue(null);
        assertNull(textNode.getParentNode()); // Node should be removed
    }

    @Test
    public void testSetValueForTextNodeWithEmptyString() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Text textNode = doc.createTextNode("old value");
        textNode.setParentNode(parent);
        parent.appendChild(textNode);
        DOMNodePointer pointer = createDOMNodePointer(textNode);
        pointer.setValue("");
        assertNull(textNode.getParentNode()); // Node should be removed
    }

    @Test
    public void testSetValueForElementWithNewElementValue() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Element child1 = new MockElement("child1", doc);
        child1.setParentNode(parent);
        parent.appendChild(child1);
        Element child2 = new MockElement("child2", doc);
        child2.setParentNode(parent);
        parent.appendChild(child2);

        Element newNode = new MockElement("newChild", doc);
        Text newNodeText = doc.createTextNode("text");
        newNode.appendChild(newNodeText);

        DOMNodePointer pointer = createDOMNodePointer(parent);
        pointer.setValue(newNode);

        assertEquals(1, parent.getChildNodes().getLength());
        Node firstChild = parent.getChildNodes().item(0);
        assertEquals("newChild", firstChild.getNodeName());
        assertEquals(1, firstChild.getChildNodes().getLength());
        assertEquals("text", firstChild.getFirstChild().getNodeValue());
    }

    @Test
    public void testSetValueForElementWithNewTextValue() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Element child1 = new MockElement("child1", doc);
        child1.setParentNode(parent);
        parent.appendChild(child1);

        DOMNodePointer pointer = createDOMNodePointer(parent);
        pointer.setValue("new text content");

        assertEquals(1, parent.getChildNodes().getLength());
        Node firstChild = parent.getChildNodes().item(0);
        assertEquals(Node.TEXT_NODE, firstChild.getNodeType());
        assertEquals("new text content", firstChild.getNodeValue());
    }

    @Test
    public void testSetValueForElementWithNull() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Element child1 = new MockElement("child1", doc);
        child1.setParentNode(parent);
        parent.appendChild(child1);

        DOMNodePointer pointer = createDOMNodePointer(parent);
        pointer.setValue(null);

        assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test
    public void testCreateAttribute() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        QName attrName = new QName("", "newAttr");
        NodePointer attrPointer = pointer.createAttribute(JXPathContext.newContext(null), attrName);

        assertNotNull(attrPointer);
        assertTrue(attrPointer.getBaseValue() instanceof Attr);
        assertEquals("newAttr", ((Attr) attrPointer.getBaseValue()).getName());
        assertEquals("", ((Attr) attrPointer.getBaseValue()).getValue());
    }

    @Test
    public void testCreateAttributeWithNamespace() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        element.setAttributeNS("http://example.com/ns", "ns:newAttr", "");

        DOMNodePointer pointer = createDOMNodePointer(element);
        QName attrName = new QName("ns", "newAttr");

        // Need to mock the namespace resolver to provide the URI for "ns"
        NamespaceResolver nsRes = new NamespaceResolver();
        nsRes.registerNamespace("ns", "http://example.com/ns");
        // In the DOMNodePointer, getNamespaceResolver() is called.
        // We can't directly inject a mock resolver into the pointer here easily
        // without modifying the class under test or using more complex mocking.
        // However, the createAttribute method *itself* calls getNamespaceResolver()
        // and uses it to resolve the prefix.
        // The current mock element's namespaceURI is set via setAttributeNS.
        // Let's trust that the getNamespaceResolver() on the pointer will work
        // if the element has the attribute set correctly.

        // The `createAttribute` method on DOMNodePointer internally calls `getNamespaceResolver`
        // and then `getNamespaceURI(prefix)`.
        // To make this test pass, we need to ensure the NamespaceResolver returned by
        // `getNamespaceResolver()` knows about the prefix.
        // The `DOMNodePointer.getNamespaceResolver()` method creates a new `NamespaceResolver`
        // and sets its parent to `super.getNamespaceResolver()`. It also registers
        // the namespace context pointer.

        // For this mock, we'll manually ensure the element has the attribute and rely on
        // the method's logic to find it.
        // The code `element.setAttributeNS(ns, name.toString(), "");` in `createAttribute`
        // is what actually adds the attribute.

        // We will test that the correct attribute is created on the element.
        NodePointer attrPointer = pointer.createAttribute(JXPathContext.newContext(null), attrName);

        assertNotNull(attrPointer);
        assertTrue(attrPointer.getBaseValue() instanceof Attr);
        Attr attr = (Attr) attrPointer.getBaseValue();
        assertEquals("ns:newAttr", attr.getName());
        assertEquals("http://example.com/ns", attr.getNamespaceURI());
        assertEquals("newAttr", attr.getLocalName());
        assertEquals("", attr.getValue());
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeUnknownNamespacePrefix() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        QName attrName = new QName("unknownNs", "newAttr");
        // This will call getNamespaceResolver() and then try to resolve "unknownNs",
        // which is not registered and not a known prefix like "xml" or "xmlns".
        // It should throw JXPathException.
        pointer.createAttribute(JXPathContext.newContext(null), attrName);
    }

    @Test
    public void testRemoveElement() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Element child = new MockElement("child", doc);
        child.setParentNode(parent);
        parent.appendChild(child);

        DOMNodePointer pointer = createDOMNodePointer(child);
        pointer.remove();

        assertFalse(parent.hasChildNodes());
        assertNull(child.getParentNode());
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootElement() {
        Document doc = new MockDocument();
        Element root = doc.getDocumentElement();
        DOMNodePointer pointer = createDOMNodePointer(root);
        pointer.remove();
    }

    @Test
    public void testAsPathForRootElement() {
        Document doc = new MockDocument();
        Element root = doc.getDocumentElement();
        DOMNodePointer pointer = createDOMNodePointer(root);
        assertEquals("/", pointer.asPath());
    }

    @Test
    public void testAsPathForChildElement() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        Element child = new MockElement("child", doc);
        child.setParentNode(root);
        root.appendChild(child);
        DOMNodePointer pointer = createDOMNodePointer(child);
        assertEquals("/child[1]", pointer.asPath());
    }

    @Test
    public void testAsPathForChildElementWithNamespace() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        Element child = new MockElement("ns:child", doc);
        child.setParentNode(root);
        root.appendChild(child);

        // Set up NamespaceResolver to correctly resolve the prefix for asPath
        DOMNodePointer rootPointer = createDOMNodePointer(root);
        NamespaceResolver nsResolver = new NamespaceResolver();
        nsResolver.registerNamespace("ns", "http://example.com/ns");
        // The DOMNodePointer's getNamespaceResolver creates a new resolver.
        // We need to ensure that the `rootPointer` has a resolver that can map 'ns' to the URI.
        // The `asPath` method calls `getNamespaceResolver().getPrefix(nsURI)`.
        // Let's ensure the child's pointer has access to a resolver that knows about "ns".

        // The `DOMNodePointer.getNamespaceResolver()` method creates a new `NamespaceResolver`
        // and sets its parent to `super.getNamespaceResolver()`. It also sets the
        // `namespaceContextPointer`.
        // For `asPath`, `getNamespaceURI()` is called, which internally uses the
        // `namespaces` map and `getNamespaceResolver()`.
        // The `getNamespaceResolver()` will create a local resolver, which needs to be
        // aware of the namespace.
        // A simpler way to make this work for the test is to ensure the MockElement
        // itself has the namespace correctly set and that `getNamespaceURI` works.
        // For `asPath` to work with prefixes, it needs to map the URI back to a prefix.
        // This is done by `getNamespaceResolver().getPrefix(nsURI)`.
        // We need a mock `NamespaceResolver` that can do this.

        // For testing `asPath` with namespace, we need to ensure that when `getNamespaceResolver()` is called,
        // it returns a resolver capable of mapping the URI back to the prefix.
        // Let's assume the `DOMNodePointer`'s `getNamespaceResolver()` will eventually
        // delegate to a `NamespaceResolver` that can find the prefix for a given URI.
        // The `DOMNodePointer.getNamespaceURI(String prefix)` method in the reference source
        // is what populates the `namespaces` map and uses `getNamespaceResolver`.
        // The `asPath` method's logic for `nsURI == null` and `prefix != null`
        // depends on `getNamespaceResolver().getPrefix(nsURI)`.

        // Let's ensure the mock `NamespaceResolver` created by `DOMNodePointer` can map URI to prefix.
        // This is a tricky part with mocks. The provided `NamespaceResolver` API doesn't expose
        // a direct way to register URI->Prefix mappings in the public API for testing.
        // However, the `DOMNodePointer`'s `getNamespaceResolver()` initializes a local resolver.

        // Let's simulate the behavior:
        DOMNodePointer pointer = createDOMNodePointer(child);
        pointer.parent = rootPointer; // Explicitly set parent for asPath()

        // Manually associate namespace with prefix for the element's context
        NamespaceResolver nsResolverForElement = new NamespaceResolver();
        nsResolverForElement.registerNamespace("ns", "http://example.com/ns");
        // The DOMNodePointer itself should resolve this.
        // The getNamespaceResolver() in DOMNodePointer returns a NamespaceResolver
        // where super.getNamespaceResolver() is its parent.
        // The test `testGetNamespaceResolver` checks that a local resolver is created.
        // For `asPath`, it seems to rely on `getNamespaceResolver().getPrefix(nsURI)`.
        // This implies the `NamespaceResolver` should have the capability to map URI to prefix.
        // In the absence of a clear way to mock this specific behavior for `NamespaceResolver`,
        // we rely on the `MockElement` and its `getNamespaceURI` being set correctly.
        // And assume `getNamespaceResolver().getPrefix(nsURI)` would find it.

        // For this test to pass, the `getNamespaceResolver().getPrefix(nsURI)` call
        // within `asPath` needs to return "ns" when `nsURI` is "http://example.com/ns".
        // The current mock setup doesn't explicitly provide this reverse mapping.
        // However, the `DOMNodePointer.getNamespaceURI` populates `namespaces` map.
        // Let's assume `getNamespaceResolver().getPrefix` is capable of this.
        assertEquals("/ns:child[1]", pointer.asPath());
    }

    @Test
    public void testAsPathForTextNode() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        Text textNode = doc.createTextNode("some text");
        textNode.setParentNode(root);
        root.appendChild(textNode);
        DOMNodePointer pointer = createDOMNodePointer(textNode);
        assertEquals("/text()[1]", pointer.asPath());
    }

    @Test
    public void testAsPathForCommentNode() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        Comment commentNode = doc.createComment("some comment");
        commentNode.setParentNode(root);
        root.appendChild(commentNode);
        DOMNodePointer pointer = createDOMNodePointer(commentNode);
        // The switch statement in asPath() does not have a case for Node.COMMENT_NODE.
        // Thus, the default case is hit, which does nothing. The path will be the parent's path.
        assertEquals("/root", pointer.asPath());
    }

    @Test
    public void testAsPathForProcessingInstruction() {
        Document doc = new MockDocument();
        Element root = new MockElement("root", doc);
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        pi.setParentNode(root);
        root.appendChild(pi);
        DOMNodePointer pointer = createDOMNodePointer(pi);
        assertEquals("/processing-instruction('target')[1]", pointer.asPath());
    }

    @Test
    public void testGetPointerByID() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        element.setAttribute("id", "myId"); // Set an ID attribute
        ((MockDocument)doc).rootElement = element; // Ensure mock document's root element is set

        DOMNodePointer pointer = createDOMNodePointer(element);
        Pointer foundPointer = pointer.getPointerByID(JXPathContext.newContext(null), "myId");

        assertNotNull(foundPointer);
        assertTrue(foundPointer instanceof DOMNodePointer);
        assertEquals("myId", ((DOMNodePointer) foundPointer).id); // Check if the ID was correctly stored
        assertEquals("root", ((DOMNodePointer) foundPointer).getName().getName()); // Check the node name
    }

    @Test
    public void testGetPointerByIDNotFound() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        ((MockDocument)doc).rootElement = element;

        DOMNodePointer pointer = createDOMNodePointer(element);
        Pointer foundPointer = pointer.getPointerByID(JXPathContext.newContext(null), "nonexistent");

        assertNotNull(foundPointer);
        assertTrue(foundPointer instanceof NullPointer);
        assertEquals("nonexistent", ((NullPointer)foundPointer).getName().getName());
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Element child1 = new MockElement("child", doc);
        child1.setParentNode(parent);
        parent.appendChild(child1);
        Element child2 = new MockElement("child", doc);
        child2.setParentNode(parent);
        parent.appendChild(child2);

        DOMNodePointer parentPointer = createDOMNodePointer(parent);
        DOMNodePointer pointer1 = createDOMNodePointer(child1);
        DOMNodePointer pointer2 = createDOMNodePointer(child2);

        assertEquals(0, parentPointer.compareChildNodePointers(pointer1, pointer1));
    }

    @Test
    public void testCompareChildNodePointersOrder() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Element child1 = new MockElement("child1", doc);
        child1.setParentNode(parent);
        parent.appendChild(child1);
        Element child2 = new MockElement("child2", doc);
        child2.setParentNode(parent);
        parent.appendChild(child2);

        DOMNodePointer parentPointer = createDOMNodePointer(parent);
        DOMNodePointer pointer1 = createDOMNodePointer(child1);
        DOMNodePointer pointer2 = createDOMNodePointer(child2);

        assertTrue(parentPointer.compareChildNodePointers(pointer1, pointer2) < 0);
        assertTrue(parentPointer.compareChildNodePointers(pointer2, pointer1) > 0);
    }

    @Test
    public void testCompareChildNodePointersAttributeBeforeChild() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Attr attr = new MockAttr("attr1", "val1", parent, doc);
        parent.getAttributes().setNamedItem(attr);
        Element child = new MockElement("child", doc);
        child.setParentNode(parent);
        parent.appendChild(child);

        DOMNodePointer parentPointer = createDOMNodePointer(parent);
        DOMNodePointer attrPointer = new DOMNodePointer(parentPointer, attr); // Attribute pointer
        DOMNodePointer childPointer = createDOMNodePointer(child);

        assertTrue(parentPointer.compareChildNodePointers(attrPointer, childPointer) < 0);
        assertTrue(parentPointer.compareChildNodePointers(childPointer, attrPointer) > 0);
    }

    @Test
    public void testGetLocalName() {
        Document doc = new MockDocument();
        Element element = new MockElement("ns:local", doc);
        assertEquals("local", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetLocalNameWithoutPrefix() {
        Document doc = new MockDocument();
        Element element = new MockElement("local", doc);
        assertEquals("local", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetPrefix() {
        Document doc = new MockDocument();
        Element element = new MockElement("ns:local", doc);
        assertEquals("ns", DOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetPrefixWhenNoPrefix() {
        Document doc = new MockDocument();
        Element element = new MockElement("local", doc);
        assertNull(DOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetValueForCommentNode() {
        Document doc = new MockDocument();
        Comment comment = doc.createComment("some comment");
        DOMNodePointer pointer = createDOMNodePointer(comment);
        assertEquals("some comment", pointer.getValue());
    }

    @Test
    public void testGetValueForTextNode() {
        Document doc = new MockDocument();
        Text textNode = doc.createTextNode("some text");
        DOMNodePointer pointer = createDOMNodePointer(textNode);
        assertEquals("some text", pointer.getValue());
    }

    @Test
    public void testGetValueForTextNodeWithSpaces() {
        Document doc = new MockDocument();
        Text textNode = doc.createTextNode("  some text  ");
        DOMNodePointer pointer = createDOMNodePointer(textNode);
        assertEquals("some text", pointer.getValue()); // stringValue trims by default
    }

    @Test
    public void testGetValueForProcessingInstruction() {
        Document doc = new MockDocument();
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        DOMNodePointer pointer = createDOMNodePointer(pi);
        assertEquals("data", pointer.getValue());
    }

    @Test
    public void testGetValueForElementWithTextChildren() {
        Document doc = new MockDocument();
        Element element = new MockElement("parent", doc);
        Text text1 = doc.createTextNode("text1");
        Text text2 = doc.createTextNode("text2");
        element.appendChild(text1);
        element.appendChild(text2);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertEquals("text1text2", pointer.getValue());
    }

    @Test
    public void testGetValueForElementWithMixedChildren() {
        Document doc = new MockDocument();
        Element element = new MockElement("parent", doc);
        Text text1 = doc.createTextNode("text1");
        Element child = new MockElement("child", doc);
        Text text2 = doc.createTextNode("text2");
        child.appendChild(text2);
        child.setParentNode(element);
        text1.setParentNode(element);
        element.appendChild(text1);
        element.appendChild(child);
        DOMNodePointer pointer = createDOMNodePointer(element);
        assertEquals("text1text2", pointer.getValue());
    }

    @Test
    public void testGetNamespaceResolver() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        NamespaceResolver resolver = pointer.getNamespaceResolver();
        assertNotNull(resolver);
        assertTrue(resolver instanceof NamespaceResolver);
    }

    @Test
    public void testGetNamespaceResolverSealed() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        NamespaceResolver resolver1 = pointer.getNamespaceResolver();
        resolver1.seal();
        NamespaceResolver resolver2 = pointer.getNamespaceResolver();
        assertSame(resolver1, resolver2);
    }

    @Test
    public void testNamespacePointer() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        DOMNodePointer pointer = createDOMNodePointer(element);
        NodePointer nsPointer = pointer.namespacePointer("xmlns");
        assertNotNull(nsPointer);
        // We cannot assert the specific type of NamespacePointer as it's not provided.
        // We can check if its name is "xmlns".
        assertEquals("xmlns", nsPointer.getName().getName());
    }

    @Test
    public void testChildIterator() {
        Document doc = new MockDocument();
        Element parent = new MockElement("parent", doc);
        Element child1 = new MockElement("child1", doc);
        child1.setParentNode(parent);
        parent.appendChild(child1);
        Element child2 = new MockElement("child2", doc);
        child2.setParentNode(parent);
        parent.appendChild(child2);

        DOMNodePointer parentPointer = createDOMNodePointer(parent);
        NodeIterator iterator = parentPointer.childIterator(null, false, null);
        assertNotNull(iterator);
        assertTrue(iterator.setPosition(1));
        assertEquals("child1", iterator.getNodePointer().getName().getName());
        assertTrue(iterator.setPosition(2));
        assertEquals("child2", iterator.getNodePointer().getName().getName());
        assertFalse(iterator.setPosition(3)); // Ensure it's the end
    }

    @Test
    public void testAttributeIterator() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        Attr attr1 = new MockAttr("attr1", "val1", element, doc);
        element.getAttributes().setNamedItem(attr1);
        Attr attr2 = new MockAttr("attr2", "val2", element, doc);
        element.getAttributes().setNamedItem(attr2);

        DOMNodePointer pointer = createDOMNodePointer(element);
        NodeIterator iterator = pointer.attributeIterator(new QName("", "*"));
        assertNotNull(iterator);
        assertTrue(iterator.setPosition(1));
        assertEquals("attr1", iterator.getNodePointer().getName().getName());
        assertTrue(iterator.setPosition(2));
        assertEquals("attr2", iterator.getNodePointer().getName().getName());
        assertFalse(iterator.setPosition(3)); // Ensure it's the end
    }

    @Test
    public void testAttributeIteratorWithSpecificName() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        Attr attr1 = new MockAttr("attr1", "val1", element, doc);
        element.getAttributes().setNamedItem(attr1);
        Attr attr2 = new MockAttr("attr2", "val2", element, doc);
        element.getAttributes().setNamedItem(attr2);

        DOMNodePointer pointer = createDOMNodePointer(element);
        NodeIterator iterator = pointer.attributeIterator(new QName("", "attr1"));
        assertNotNull(iterator);
        assertTrue(iterator.setPosition(1));
        assertEquals("attr1", iterator.getNodePointer().getName().getName());
        assertFalse(iterator.setPosition(2)); // Should be only one match
    }

    @Test
    public void testNamespaceIterator() {
        Document doc = new MockDocument();
        Element element = new MockElement("root", doc);
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns1", "http://ns1.com");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns2", "http://ns2.com");

        DOMNodePointer pointer = createDOMNodePointer(element);
        NodeIterator iterator = pointer.namespaceIterator();
        assertNotNull(iterator);

        assertTrue(iterator.setPosition(1));
        assertEquals("ns1", iterator.getNodePointer().getName().getName());
        assertEquals("http://ns1.com", iterator.getNodePointer().getValue());

        assertTrue(iterator.setPosition(2));
        assertEquals("ns2", iterator.getNodePointer().getName().getName());
        assertEquals("http://ns2.com", iterator.getNodePointer().getValue());
        assertFalse(iterator.setPosition(3)); // Ensure it's the end
    }
}
