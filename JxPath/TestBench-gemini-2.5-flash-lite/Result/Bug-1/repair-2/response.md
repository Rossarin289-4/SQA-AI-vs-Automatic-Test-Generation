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
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DOMStringList;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;

// Mock DOM classes for testing purposes
class MockNode implements Node {
    private short nodeType;
    private String nodeName;
    private String nodeValue;
    private Node parentNode;
    private NodeList childNodes;
    private NamedNodeMap attributes;
    private Document ownerDocument;
    private String prefix;
    private String localName;
    private String namespaceURI;

    public MockNode(short nodeType, String nodeName) {
        this.nodeType = nodeType;
        this.nodeName = nodeName;
        this.childNodes = new MockNodeList();
    }

    public void setNodeType(short nodeType) { this.nodeType = nodeType; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public void setNodeValue(String nodeValue) { this.nodeValue = nodeValue; }
    public void setParentNode(Node parentNode) { this.parentNode = parentNode; }
    public void setChildNodes(NodeList childNodes) { this.childNodes = childNodes; }
    public void setAttributes(NamedNodeMap attributes) { this.attributes = attributes; }
    public void setOwnerDocument(Document ownerDocument) { this.ownerDocument = ownerDocument; }
    public void setPrefix(String prefix) { this.prefix = prefix; }
    public void setLocalName(String localName) { this.localName = localName; }
    public void setNamespaceURI(String namespaceURI) { this.namespaceURI = namespaceURI; }

    @Override public short getNodeType() { return nodeType; }
    @Override public String getNodeName() { return nodeName; }
    @Override public String getNodeValue() { return nodeValue; }
    @Override public Node getParentNode() { return parentNode; }
    @Override public NodeList getChildNodes() { return childNodes; }
    @Override public NamedNodeMap getAttributes() { return attributes; }
    @Override public Document getOwnerDocument() { return ownerDocument; }
    @Override public String getPrefix() { return prefix; }
    @Override public String getLocalName() { return localName; }
    @Override public String getNamespaceURI() { return namespaceURI; }

    // Required by Node interface, not used in tests
    @Override public Node appendChild(Node newChild) { return null; }
    @Override public Node cloneNode(boolean deep) { return null; }
    @Override public Node getFirstChild() { return null; }
    @Override public Node getLastChild() { return null; }
    @Override public Node getNextSibling() { return null; }
    @Override public Node getPreviousSibling() { return null; }
    @Override public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) { return null; }
    @Override public boolean hasChildNodes() { return childNodes.getLength() > 0; }
    @Override public void normalize() { }
    @Override public void removeChild(org.w3c.dom.Node oldChild) { }
    @Override public org.w3c.dom.DOMStringList getElementsByTagName(String tagname) { return null; }
    @Override public boolean hasAttributes() { return attributes != null && attributes.getLength() > 0; }
    @Override public String getBaseURI() { return null; }
    @Override public org.w3c.dom.Text createTextNode(String data) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNode(String name) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNodeNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) { return null; }
    @Override public String getAttribute(String name) { return null; }
    @Override public String getAttributeNS(String namespaceURI, String localName) { return null; }
    @Override public void removeAttribute(String name) { }
    @Override public void removeAttributeNS(String namespaceURI, String localName) { }
    @Override public void setAttribute(String name, String value) { }
    @Override public void setAttributeNS(String namespaceURI, String qualifiedName, String value) { }
    @Override public org.w3c.dom.DOMImplementation getImplementation() { return null; }
    @Override public org.w3c.dom.DocumentType getDoctype() { return null; }
    @Override public org.w3c.dom.Element getDocumentElement() { return null; }
    @Override public org.w3c.dom.Text getTextContent() { return null; }
    @Override public void setTextContent(String textContent) { }
}

class MockDocument extends MockNode implements Document {
    private Element documentElement;
    private Map<String, Element> elementsById = new HashMap<>();

    public MockDocument() {
        super(Node.DOCUMENT_NODE, "#document");
    }

    public void setDocumentElement(Element documentElement) {
        this.documentElement = documentElement;
        if (documentElement != null) {
            documentElement.setOwnerDocument(this);
        }
    }

    @Override
    public Element getDocumentElement() {
        return documentElement;
    }

    public void putElementById(String id, Element element) {
        elementsById.put(id, element);
    }

    @Override
    public Element getElementById(String id) {
        return elementsById.get(id);
    }

    // Required by Document interface, not used in tests
    @Override public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) { return null; }
    @Override public org.w3c.dom.Node cloneNode(boolean deep) { return null; }
    @Override public org.w3c.dom.Node getFirstChild() { return null; }
    @Override public org.w3c.dom.Node getLastChild() { return null; }
    @Override public org.w3c.dom.Node getNextSibling() { return null; }
    @Override public org.w3c.dom.Node getPreviousSibling() { return null; }
    @Override public org.w3c.dom.Document getOwnerDocument() { return null; }
    @Override public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) { return null; }
    @Override public boolean hasChildNodes() { return getChildNodes().getLength() > 0; }
    @Override public void normalize() { }
    @Override public void removeChild(org.w3c.dom.Node oldChild) { }
    @Override public org.w3c.dom.DOMStringList getElementsByTagName(String tagname) { return null; }
    @Override public boolean hasAttributes() { return false; }
    @Override public String getBaseURI() { return null; }
    @Override public org.w3c.dom.Text createTextNode(String data) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNode(String name) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNodeNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) { return null; }
    @Override public String getAttribute(String name) { return null; }
    @Override public String getAttributeNS(String namespaceURI, String localName) { return null; }
    @Override public void removeAttribute(String name) { }
    @Override public void removeAttributeNS(String namespaceURI, String localName) { }
    @Override public void setAttribute(String name, String value) { }
    @Override public void setAttributeNS(String namespaceURI, String qualifiedName, String value) { }
    @Override public org.w3c.dom.DOMImplementation getImplementation() { return null; }
    @Override public org.w3c.dom.NodeList getChildNodes() { return new MockNodeList(); }
    @Override public org.w3c.dom.NamedNodeMap getAttributes() { return new MockNamedNodeMap(); }
    @Override public org.w3c.dom.Node getParentNode() { return null; }
    @Override public String getNodeValue() { return null; }
    @Override public void setNodeValue(String nodeValue) { }
    @Override public org.w3c.dom.Element createElement(String tagName) { return null; }
    @Override public org.w3c.dom.Text getTextContent() { return null; }
    @Override public void setTextContent(String textContent) { }
}

class MockElement extends MockNode implements Element {
    private Map<String, Attr> attributes = new HashMap<>();
    private Map<String, String> attributeMap = new HashMap<>();
    private MockNodeList childNodes = new MockNodeList();

    public MockElement(String nodeName) {
        super(Node.ELEMENT_NODE, nodeName);
        setChildNodes(childNodes);
    }

    public void setAttribute(String name, String value) {
        attributeMap.put(name, value);
        MockAttr attr = new MockAttr(name, value);
        attr.setOwnerDocument(getOwnerDocument());
        attributes.put(name, attr);
    }

    public void setAttributeNS(String namespaceURI, String qualifiedName, String value) {
        attributeMap.put(qualifiedName, value);
        this.setNamespaceURI(namespaceURI);
        String prefix = qualifiedName.contains(":") ? qualifiedName.substring(0, qualifiedName.indexOf(':')) : null;
        String localName = qualifiedName.contains(":") ? qualifiedName.substring(qualifiedName.indexOf(':') + 1) : qualifiedName;
        this.setPrefix(prefix);
        this.setLocalName(localName);

        MockAttr attr = new MockAttr(qualifiedName, value);
        attr.setOwnerDocument(getOwnerDocument());
        attr.setNamespaceURI(namespaceURI);
        attr.setPrefix(prefix);
        attr.setLocalName(localName);
        attributes.put(qualifiedName, attr);
    }

    @Override
    public String getAttribute(String name) {
        return attributeMap.get(name);
    }

    @Override
    public String getAttributeNS(String namespaceURI, String localName) {
        String qualifiedName = localName;
        if (getPrefix() != null && getNamespaceURI() != null && getNamespaceURI().equals(namespaceURI)) {
            qualifiedName = getPrefix() + ":" + localName;
        } else if (namespaceURI == null && getNamespaceURI() == null) {
             qualifiedName = localName;
        }
        return attributeMap.get(qualifiedName);
    }

    @Override
    public NodeList getChildNodes() {
        return childNodes;
    }

    @Override
    public NamedNodeMap getAttributes() {
        return new MockNamedNodeMap(new ArrayList<>(attributes.values()));
    }

    public void appendChild(Node child) {
        childNodes.add(child);
        child.setParentNode(this);
    }

    public void removeAttribute(String name) {
        attributeMap.remove(name);
        attributes.remove(name);
    }

    public Attr getAttributeNode(String name) {
        return attributes.get(name);
    }

    public void setAttributeNode(Attr newAttr) {
        attributes.put(newAttr.getName(), newAttr);
        attributeMap.put(newAttr.getName(), newAttr.getValue());
    }

    // Required by Element interface, not used in tests
    @Override public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) { return null; }
    @Override public org.w3c.dom.Node cloneNode(boolean deep) { return null; }
    @Override public org.w3c.dom.Node getFirstChild() { return null; }
    @Override public org.w3c.dom.Node getLastChild() { return null; }
    @Override public org.w3c.dom.Node getNextSibling() { return null; }
    @Override public org.w3c.dom.Node getPreviousSibling() { return null; }
    @Override public org.w3c.dom.Document getOwnerDocument() { return (Document) super.getOwnerDocument(); }
    @Override public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) { return null; }
    @Override public boolean hasChildNodes() { return childNodes.getLength() > 0; }
    @Override public void normalize() { }
    @Override public void removeChild(org.w3c.dom.Node oldChild) { childNodes.remove((Node) oldChild); }
    @Override public org.w3c.dom.DOMStringList getElementsByTagName(String tagname) { return null; }
    @Override public boolean hasAttributes() { return attributes.size() > 0; }
    @Override public String getBaseURI() { return null; }
    @Override public org.w3c.dom.Text createTextNode(String data) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNodeNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) { return null; }
    @Override public org.w3c.dom.Element createElement(String tagName) { return null; }
    @Override public org.w3c.dom.DocumentType getDoctype() { return null; }
    @Override public org.w3c.dom.Element getDocumentElement() { return null; }
    @Override public org.w3c.dom.Text getTextContent() { return null; }
    @Override public void setTextContent(String textContent) { }
}

class MockAttr extends MockNode implements Attr {
    public MockAttr(String name, String value) {
        super(Node.ATTRIBUTE_NODE, name);
        setNodeValue(value);
    }
    // Required by Attr interface, not used in tests
    @Override public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) { return null; }
    @Override public org.w3c.dom.Node cloneNode(boolean deep) { return null; }
    @Override public org.w3c.dom.Node getFirstChild() { return null; }
    @Override public org.w3c.dom.Node getLastChild() { return null; }
    @Override public org.w3c.dom.Node getNextSibling() { return null; }
    @Override public org.w3c.dom.Node getPreviousSibling() { return null; }
    @Override public org.w3c.dom.Document getOwnerDocument() { return null; }
    @Override public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) { return null; }
    @Override public boolean hasChildNodes() { return false; }
    @Override public void normalize() { }
    @Override public void removeChild(org.w3c.dom.Node oldChild) { }
    @Override public org.w3c.dom.DOMStringList getElementsByTagName(String tagname) { return null; }
    @Override public boolean hasAttributes() { return false; }
    @Override public String getBaseURI() { return null; }
    @Override public org.w3c.dom.Text createTextNode(String data) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNode(String name) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNodeNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) { return null; }
    @Override public String getAttribute(String name) { return null; }
    @Override public String getAttributeNS(String namespaceURI, String localName) { return null; }
    @Override public void removeAttribute(String name) { }
    @Override public void removeAttributeNS(String namespaceURI, String localName) { }
    @Override public void setAttribute(String name, String value) { }
    @Override public void setAttributeNS(String namespaceURI, String qualifiedName, String value) { }
    @Override public org.w3c.dom.DOMImplementation getImplementation() { return null; }
    @Override public org.w3c.dom.NodeList getChildNodes() { return new MockNodeList(); }
    @Override public org.w3c.dom.NamedNodeMap getAttributes() { return new MockNamedNodeMap(); }
    @Override public org.w3c.dom.Node getParentNode() { return null; }
    @Override public String getNodeValue() { return super.getNodeValue(); }
    @Override public void setNodeValue(String nodeValue) { super.setNodeValue(nodeValue); }
    @Override public org.w3c.dom.Element createElement(String tagName) { return null; }
    @Override public org.w3c.dom.DocumentType getDoctype() { return null; }
    @Override public org.w3c.dom.Element getDocumentElement() { return null; }
    @Override public org.w3c.dom.Text getTextContent() { return null; }
    @Override public void setTextContent(String textContent) { }
}

class MockProcessingInstruction extends MockNode implements ProcessingInstruction {
    public MockProcessingInstruction(String target, String data) {
        super(Node.PROCESSING_INSTRUCTION_NODE, target);
        setNodeValue(data);
    }
    // Required by ProcessingInstruction interface, not used in tests
    @Override public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) { return null; }
    @Override public org.w3c.dom.Node cloneNode(boolean deep) { return null; }
    @Override public org.w3c.dom.Node getFirstChild() { return null; }
    @Override public org.w3c.dom.Node getLastChild() { return null; }
    @Override public org.w3c.dom.Node getNextSibling() { return null; }
    @Override public org.w3c.dom.Node getPreviousSibling() { return null; }
    @Override public org.w3c.dom.Document getOwnerDocument() { return null; }
    @Override public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) { return null; }
    @Override public boolean hasChildNodes() { return false; }
    @Override public void normalize() { }
    @Override public void removeChild(org.w3c.dom.Node oldChild) { }
    @Override public org.w3c.dom.DOMStringList getElementsByTagName(String tagname) { return null; }
    @Override public boolean hasAttributes() { return false; }
    @Override public String getBaseURI() { return null; }
    @Override public org.w3c.dom.Text createTextNode(String data) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNode(String name) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNodeNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) { return null; }
    @Override public String getAttribute(String name) { return null; }
    @Override public String getAttributeNS(String namespaceURI, String localName) { return null; }
    @Override public void removeAttribute(String name) { }
    @Override public void removeAttributeNS(String namespaceURI, String localName) { }
    @Override public void setAttribute(String name, String value) { }
    @Override public void setAttributeNS(String namespaceURI, String qualifiedName, String value) { }
    @Override public org.w3c.dom.DOMImplementation getImplementation() { return null; }
    @Override public org.w3c.dom.NodeList getChildNodes() { return new MockNodeList(); }
    @Override public org.w3c.dom.NamedNodeMap getAttributes() { return new MockNamedNodeMap(); }
    @Override public org.w3c.dom.Node getParentNode() { return null; }
    @Override public String getNodeValue() { return super.getNodeValue(); }
    @Override public void setNodeValue(String nodeValue) { super.setNodeValue(nodeValue); }
    @Override public org.w3c.dom.Element createElement(String tagName) { return null; }
    @Override public org.w3c.dom.DocumentType getDoctype() { return null; }
    @Override public org.w3c.dom.Element getDocumentElement() { return null; }
    @Override public org.w3c.dom.Text getTextContent() { return null; }
    @Override public void setTextContent(String textContent) { }
}

class MockComment extends MockNode implements Comment {
    public MockComment(String data) {
        super(Node.COMMENT_NODE, "#comment");
        setNodeValue(data);
    }
    // Required by Comment interface, not used in tests
    @Override public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) { return null; }
    @Override public org.w3c.dom.Node cloneNode(boolean deep) { return null; }
    @Override public org.w3c.dom.Node getFirstChild() { return null; }
    @Override public org.w3c.dom.Node getLastChild() { return null; }
    @Override public org.w3c.dom.Node getNextSibling() { return null; }
    @Override public org.w3c.dom.Node getPreviousSibling() { return null; }
    @Override public org.w3c.dom.Document getOwnerDocument() { return null; }
    @Override public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) { return null; }
    @Override public boolean hasChildNodes() { return false; }
    @Override public void normalize() { }
    @Override public void removeChild(org.w3c.dom.Node oldChild) { }
    @Override public org.w3c.dom.DOMStringList getElementsByTagName(String tagname) { return null; }
    @Override public boolean hasAttributes() { return false; }
    @Override public String getBaseURI() { return null; }
    @Override public org.w3c.dom.Text createTextNode(String data) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNode(String name) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNodeNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) { return null; }
    @Override public String getAttribute(String name) { return null; }
    @Override public String getAttributeNS(String namespaceURI, String localName) { return null; }
    @Override public void removeAttribute(String name) { }
    @Override public void removeAttributeNS(String namespaceURI, String localName) { }
    @Override public void setAttribute(String name, String value) { }
    @Override public void setAttributeNS(String namespaceURI, String qualifiedName, String value) { }
    @Override public org.w3c.dom.DOMImplementation getImplementation() { return null; }
    @Override public org.w3c.dom.NodeList getChildNodes() { return new MockNodeList(); }
    @Override public org.w3c.dom.NamedNodeMap getAttributes() { return new MockNamedNodeMap(); }
    @Override public org.w3c.dom.Node getParentNode() { return null; }
    @Override public String getNodeValue() { return super.getNodeValue(); }
    @Override public void setNodeValue(String nodeValue) { super.setNodeValue(nodeValue); }
    @Override public org.w3c.dom.Element createElement(String tagName) { return null; }
    @Override public org.w3c.dom.DocumentType getDoctype() { return null; }
    @Override public org.w3c.dom.Element getDocumentElement() { return null; }
    @Override public org.w3c.dom.Text getTextContent() { return null; }
    @Override public void setTextContent(String textContent) { }
}

class MockText extends MockNode implements Text {
    public MockText(String data) {
        super(Node.TEXT_NODE, "#text");
        setNodeValue(data);
    }
    // Required by Text interface, not used in tests
    @Override public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) { return null; }
    @Override public org.w3c.dom.Node cloneNode(boolean deep) { return null; }
    @Override public org.w3c.dom.Node getFirstChild() { return null; }
    @Override public org.w3c.dom.Node getLastChild() { return null; }
    @Override public org.w3c.dom.Node getNextSibling() { return null; }
    @Override public org.w3c.dom.Node getPreviousSibling() { return null; }
    @Override public org.w3c.dom.Document getOwnerDocument() { return null; }
    @Override public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) { return null; }
    @Override public boolean hasChildNodes() { return false; }
    @Override public void normalize() { }
    @Override public void removeChild(org.w3c.dom.Node oldChild) { }
    @Override public org.w3c.dom.DOMStringList getElementsByTagName(String tagname) { return null; }
    @Override public boolean hasAttributes() { return false; }
    @Override public String getBaseURI() { return null; }
    @Override public org.w3c.dom.Text createTextNode(String data) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNode(String name) { return null; }
    @Override public org.w3c.dom.Attr getAttributeNodeNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
    @Override public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) { return null; }
    @Override public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) { return null; }
    @Override public String getAttribute(String name) { return null; }
    @Override public String getAttributeNS(String namespaceURI, String localName) { return null; }
    @Override public void removeAttribute(String name) { }
    @Override public void removeAttributeNS(String namespaceURI, String localName) { }
    @Override public void setAttribute(String name, String value) { }
    @Override public void setAttributeNS(String namespaceURI, String qualifiedName, String value) { }
    @Override public org.w3c.dom.DOMImplementation getImplementation() { return null; }
    @Override public org.w3c.dom.NodeList getChildNodes() { return new MockNodeList(); }
    @Override public org.w3c.dom.NamedNodeMap getAttributes() { return new MockNamedNodeMap(); }
    @Override public org.w3c.dom.Node getParentNode() { return null; }
    @Override public String getNodeValue() { return super.getNodeValue(); }
    @Override public void setNodeValue(String nodeValue) { super.setNodeValue(nodeValue); }
    @Override public org.w3c.dom.Element createElement(String tagName) { return null; }
    @Override public org.w3c.dom.DocumentType getDoctype() { return null; }
    @Override public org.w3c.dom.Element getDocumentElement() { return null; }
    @Override public org.w3c.dom.Text getTextContent() { return null; }
    @Override public void setTextContent(String textContent) { }
    @Override public org.w3c.dom.Text splitText(int offset) { return null; }
    @Override public String getWholeText() { return null; }
    @Override public boolean isElementContentWhitespace() { return false; }
}

// Helper classes for NodeList and NamedNodeMap to make mocking easier
class MockNodeList implements NodeList {
    private List<Node> nodes = new ArrayList<>();

    public void add(Node node) {
        nodes.add(node);
    }
    public void remove(Node node) {
        nodes.remove(node);
    }

    @Override
    public Node item(int index) {
        return nodes.get(index);
    }

    @Override
    public int getLength() {
        return nodes.size();
    }
}

class MockNamedNodeMap implements NamedNodeMap {
    private List<Attr> attrs = new ArrayList<>();

    public MockNamedNodeMap() {}
    public MockNamedNodeMap(List<Attr> attrs) { this.attrs = attrs; }

    public void add(Attr attr) { attrs.add(attr); }

    @Override
    public Node item(int index) {
        return attrs.get(index);
    }

    @Override
    public int getLength() {
        return attrs.size();
    }

    @Override
    public Node getNamedItem(String name) {
        for (Attr attr : attrs) {
            if (attr.getName().equals(name)) {
                return attr;
            }
        }
        return null;
    }

    @Override
    public Node getNamedItemNS(String namespaceURI, String localName) { return null; }
    @Override
    public Node removeNamedItem(String name) { return null; }
    @Override
    public Node removeNamedItemNS(String namespaceURI, String localName) { return null; }
    @Override
    public Node setNamedItem(Node arg) { return null; }
    @Override
    public Node setNamedItemNS(Node arg) { return null; }
}

public class DOMNodePointerTest {

    @Test
    public void testConstructorWithNodeAndLocale() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertNotNull(pointer);
        assertEquals(node, pointer.getBaseValue());
        assertEquals(Locale.US, pointer.getLocale());
    }

    @Test
    public void testConstructorWithNodeLocaleAndId() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US, "rootId");
        assertNotNull(pointer);
        assertEquals(node, pointer.getBaseValue());
        assertEquals(Locale.US, pointer.getLocale());
        assertEquals("rootId", pointer.id);
    }

    @Test
    public void testConstructorWithParentAndNode() {
        MockNode parentNode = new MockNode(Node.ELEMENT_NODE, "parent");
        MockNode childNode = new MockNode(Node.ELEMENT_NODE, "child");
        DOMNodePointer parentPointer = new DOMNodePointer(parentNode, Locale.US);
        DOMNodePointer childPointer = new DOMNodePointer(parentPointer, childNode);
        assertNotNull(childPointer);
        assertEquals(childNode, childPointer.getBaseValue());
        assertEquals(parentPointer, childPointer.getParent());
    }

    @Test
    public void testTestNodeWithNullTest() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "test");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer.testNode((NodeTest) null));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcard() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "test");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("*"), null);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeNameTestMatchingName() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "test");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("test"), null);
        assertTrue(pointer.testNode(test));
    }
    
    @Test
    public void testTestNodeWithNodeNameTestNonMatchingName() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "test");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("other"), null);
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeNameTestMatchingNameAndNamespace() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "test");
        node.setNamespaceURI("http://example.com");
        node.setLocalName("test");
        node.setPrefix("ex");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("ex", "test"), "http://example.com");
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonMatchingNamespace() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "test");
        node.setNamespaceURI("http://example.com");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeNameTest test = new NodeNameTest(new QName("test"), "http://other.com");
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "test");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        MockNode node = new MockNode(Node.TEXT_NODE, "#text");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(pointer.testNode(test));
    }
    
    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        MockNode node = new MockNode(Node.COMMENT_NODE, "#comment");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestPI() {
        MockNode node = new MockNode(Node.PROCESSING_INSTRUCTION_NODE, "target");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(pointer.testNode(test));
    }
    
    @Test
    public void testTestNodeWithProcessingInstructionTestMatchingTarget() {
        MockNode node = new MockNode(Node.PROCESSING_INSTRUCTION_NODE, "target");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestNonMatchingTarget() {
        MockNode node = new MockNode(Node.PROCESSING_INSTRUCTION_NODE, "target");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testGetNameForElement() {
        MockElement node = new MockElement("root");
        node.setPrefix("ns");
        node.setLocalName("root");
        node.setNamespaceURI("http://example.com");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        QName name = pointer.getName();
        assertEquals("ns", name.getPrefix());
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetNameForPI() {
        MockProcessingInstruction node = new MockProcessingInstruction("target", "data");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNamespaceURI() {
        MockElement node = new MockElement("root");
        node.setNamespaceURI("http://example.com");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals("http://example.com", pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIForDocument() {
        MockDocument doc = new MockDocument();
        MockElement root = new MockElement("root");
        root.setNamespaceURI("http://example.com");
        doc.setDocumentElement(root);
        DOMNodePointer pointer = new DOMNodePointer(doc, Locale.US);
        assertEquals("http://example.com", pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIForNullNamespace() {
        MockElement node = new MockElement("root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertNull(pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIWithPrefix() {
        MockElement node = new MockElement("ns:root");
        node.setNamespaceURI("http://example.com");
        node.setPrefix("ns");
        node.setLocalName("root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals("http://example.com", pointer.getNamespaceURI("ns"));
    }

    @Test
    public void testGetNamespaceURIWithUnknownPrefix() {
        MockElement node = new MockElement("ns:root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals(NodePointer.UNKNOWN_NAMESPACE, pointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIWithEmptyPrefix() {
        MockElement node = new MockElement("root");
        node.setNamespaceURI("http://default.com");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        
        MockElement parent = new MockElement("parent");
        parent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://parent.com");
        parent.setParentNode(null); // Ensure parent is not attached to avoid unintended behavior
        node.setParentNode(parent);

        assertEquals("http://parent.com", pointer.getNamespaceURI(""));
    }
    
    @Test
    public void testGetNamespaceURIWithEmptyPrefixAndNoParentDefault() {
        MockElement node = new MockElement("root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertNull(pointer.getNamespaceURI(""));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        MockElement node = new MockElement("root");
        node.setNamespaceURI("http://default.com");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals("http://default.com", pointer.getDefaultNamespaceURI());
    }
    
    @Test
    public void testGetDefaultNamespaceURIWithAttribute() {
        MockElement node = new MockElement("root");
        MockElement parent = new MockElement("parent");
        parent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://default.com");
        parent.setParentNode(null); // Ensure parent is not attached to avoid unintended behavior
        node.setParentNode(parent);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals("http://default.com", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURINoAttribute() {
        MockElement node = new MockElement("root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetBaseValue() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals(node, pointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals(node, pointer.getImmediateNode());
    }

    @Test
    public void testIsActual() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer.isActual());
    }

    @Test
    public void testIsCollection() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetLength() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void testIsLeafWhenHasChildNodes() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        MockNodeList children = new MockNodeList();
        children.add(new MockNode(Node.TEXT_NODE, "text"));
        node.setChildNodes(children);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLeafWhenNoChildNodes() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLanguageWhenAttributeMatches() {
        MockElement node = new MockElement("root");
        node.setAttribute("xml:lang", "en");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer.isLanguage("en"));
        assertTrue(pointer.isLanguage("EN"));
    }

    @Test
    public void testIsLanguageWhenAttributeMatchesPrefix() {
        MockElement node = new MockElement("root");
        node.setAttribute("xml:lang", "en-US");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer.isLanguage("en"));
    }
    
    @Test
    public void testIsLanguageWhenParentAttributeMatches() {
        MockElement parent = new MockElement("parent");
        parent.setAttribute("xml:lang", "fr");
        MockElement node = new MockElement("child");
        parent.appendChild(node);
        node.setParentNode(parent);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US); 
        assertTrue(pointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageWhenNoAttributeMatches() {
        MockElement node = new MockElement("root");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testSetValueForTextNode() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockText textNode = new MockText("old text");
        parent.appendChild(textNode);
        doc.appendChild(parent);
        textNode.setOwnerDocument(doc);
        textNode.setParentNode(parent);

        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue("new text");

        assertEquals("new text", textNode.getNodeValue());
    }

    @Test
    public void testSetValueForTextNodeToRemove() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockText textNode = new MockText("old text");
        parent.appendChild(textNode);
        doc.appendChild(parent);
        textNode.setOwnerDocument(doc);
        textNode.setParentNode(parent);

        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue(""); // Setting empty string should remove node

        assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test
    public void testSetValueForElementWithNewText() {
        MockDocument doc = new MockDocument();
        MockElement element = new MockElement("element");
        doc.appendChild(element);
        element.setOwnerDocument(doc);

        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        pointer.setValue("new text content");

        NodeList children = element.getChildNodes();
        assertEquals(1, children.getLength());
        assertEquals(Node.TEXT_NODE, children.item(0).getNodeType());
        assertEquals("new text content", children.item(0).getNodeValue());
    }

    @Test
    public void testSetValueForElementWithNewElement() {
        MockDocument doc = new MockDocument();
        MockElement element = new MockElement("element");
        doc.appendChild(element);
        element.setOwnerDocument(doc);

        MockElement newChild = new MockElement("child");
        newChild.setAttribute("id", "c1");

        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        pointer.setValue(newChild);

        NodeList children = element.getChildNodes();
        assertEquals(1, children.getLength());
        assertEquals(newChild, children.item(0));
        assertEquals("c1", ((Element)children.item(0)).getAttribute("id"));
    }

    @Test
    public void testCreateChild() throws Exception {
        MockDocument doc = new MockDocument();
        MockElement root = new MockElement("root");
        doc.appendChild(root);
        root.setOwnerDocument(doc);

        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);

        AbstractFactory mockFactory = new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext context, NodePointer parent, Object contextNode, String name, int index) {
                if (contextNode instanceof Node && name.equals("newChild")) {
                    MockElement child = new MockElement(name);
                    ((Node)contextNode).appendChild(child);
                    child.setParentNode((Node)contextNode);
                    child.setOwnerDocument(((Node)contextNode).getOwnerDocument());
                    return true;
                }
                return false;
            }

            @Override
            public boolean createAttribute(JXPathContext context, NodePointer parent, Object contextNode, String name) {
                return false;
            }
        };
        context.setFactory(mockFactory);

        QName qname = new QName("newChild");
        NodePointer childPointer = pointer.createChild(context, qname, 0);

        assertNotNull(childPointer);
        assertEquals(Node.ELEMENT_NODE, ((Node) childPointer.getBaseValue()).getNodeType());
        assertEquals("newChild", ((Node)childPointer.getBaseValue()).getNodeName());
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals(childPointer.getBaseValue(), root.getChildNodes().item(0));
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChildFailsWhenFactoryCannotCreate() throws Exception {
        MockDocument doc = new MockDocument();
        MockElement root = new MockElement("root");
        doc.appendChild(root);
        root.setOwnerDocument(doc);

        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);

        AbstractFactory mockFactory = new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext context, NodePointer parent, Object contextNode, String name, int index) {
                return false;
            }

            @Override
            public boolean createAttribute(JXPathContext context, NodePointer parent, Object contextNode, String name) {
                return false;
            }
        };
        context.setFactory(mockFactory);

        QName qname = new QName("newChild");
        pointer.createChild(context, qname, 0);
    }
    
    @Test
    public void testCreateAttribute() {
        MockElement element = new MockElement("root");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName attrName = new QName("myAttr");
        NodePointer attrPointer = pointer.createAttribute(null, attrName); 

        assertNotNull(attrPointer);
        assertEquals(Node.ATTRIBUTE_NODE, attrPointer.getBaseValue().getNodeType());
        assertEquals("myAttr", ((Attr) attrPointer.getBaseValue()).getName());
        assertEquals("", ((Attr) attrPointer.getBaseValue()).getValue()); 
        assertTrue(element.getAttribute("myAttr").equals(""));
    }

    @Test
    public void testCreateAttributeWithNamespace() {
        MockElement element = new MockElement("root");
        element.setNamespaceURI("http://example.com");
        element.setPrefix("ns");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName attrName = new QName("ns", "myAttr");

        NamespaceResolver mockNamespaceResolver = new NamespaceResolver();
        mockNamespaceResolver.declareNamespace("ns", "http://example.com");
        pointer.setNamespaceResolver(mockNamespaceResolver);

        NodePointer attrPointer = pointer.createAttribute(null, attrName);

        assertNotNull(attrPointer);
        assertEquals(Node.ATTRIBUTE_NODE, attrPointer.getBaseValue().getNodeType());
        assertEquals("ns:myAttr", ((Attr) attrPointer.getBaseValue()).getName());
        assertTrue(element.getAttributeNS("http://example.com", "myAttr").equals(""));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeWithUnknownNamespacePrefix() {
        MockElement element = new MockElement("root");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName attrName = new QName("unknown", "myAttr");
        pointer.createAttribute(null, attrName);
    }
    
    @Test
    public void testRemove() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockElement child = new MockElement("child");
        parent.appendChild(child);
        child.setParentNode(parent);
        child.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        pointer.remove();

        assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootNode() {
        MockDocument doc = new MockDocument();
        DOMNodePointer pointer = new DOMNodePointer(doc, Locale.US);
        pointer.remove();
    }

    @Test
    public void testAsPathForRootElement() {
        MockDocument doc = new MockDocument();
        MockElement root = new MockElement("root");
        doc.appendChild(root);
        root.setOwnerDocument(doc);
        root.setNamespaceURI("http://example.com");
        root.setPrefix("ns");
        root.setLocalName("root");

        NamespaceResolver mockNamespaceResolver = new NamespaceResolver();
        mockNamespaceResolver.declareNamespace("ns", "http://example.com");
        mockNamespaceResolver.declareNamespace("", "http://default.com");
        
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        pointer.setNamespaceResolver(mockNamespaceResolver);

        assertEquals("ns:root[1]", pointer.asPath());
    }
    
    @Test
    public void testAsPathForRootElementWithDefaultNamespace() {
        MockDocument doc = new MockDocument();
        MockElement root = new MockElement("root");
        doc.appendChild(root);
        root.setOwnerDocument(doc);
        root.setNamespaceURI("http://default.com");
        root.setLocalName("root");

        NamespaceResolver mockNamespaceResolver = new NamespaceResolver();
        mockNamespaceResolver.declareNamespace("", "http://default.com");
        
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        pointer.setNamespaceResolver(mockNamespaceResolver);

        assertEquals("root[1]", pointer.asPath());
    }

    @Test
    public void testAsPathForTextNode() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockText text = new MockText("some text");
        parent.appendChild(text);
        text.setParentNode(parent);
        text.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer = new DOMNodePointer(text, Locale.US);
        assertEquals("/text()[1]", pointer.asPath());
    }
    
    @Test
    public void testAsPathForProcessingInstruction() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockProcessingInstruction pi = new MockProcessingInstruction("target", "data");
        parent.appendChild(pi);
        pi.setParentNode(parent);
        pi.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        assertEquals("/processing-instruction('target')[1]", pointer.asPath());
    }

    @Test
    public void testAsPathWithId() {
        MockDocument doc = new MockDocument();
        MockElement element = new MockElement("element");
        element.setOwnerDocument(doc);
        doc.appendChild(element);
        doc.putElementById("elementId", element);

        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US, "elementId");
        assertEquals("id('elementId')", pointer.asPath());
    }

    @Test
    public void testEscapeWithSingleQuote() {
        DOMNodePointer pointer = new DOMNodePointer(null, Locale.US);
        assertEquals("abc&apos;def", pointer.escape("abc'def"));
    }

    @Test
    public void testEscapeWithDoubleQuote() {
        DOMNodePointer pointer = new DOMNodePointer(null, Locale.US);
        assertEquals("abc&quot;def", pointer.escape("abc\"def"));
    }

    @Test
    public void testGetRelativePositionByName() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockElement child1 = new MockElement("child");
        MockElement child2 = new MockElement("child");
        MockElement child3 = new MockElement("other");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        child1.setParentNode(parent);
        child2.setParentNode(parent);
        child3.setParentNode(parent);
        child1.setOwnerDocument(doc);
        child2.setOwnerDocument(doc);
        child3.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer1 = new DOMNodePointer(child1, Locale.US);
        assertEquals(1, pointer1.getRelativePositionByName());

        DOMNodePointer pointer2 = new DOMNodePointer(child2, Locale.US);
        assertEquals(2, pointer2.getRelativePositionByName());
    }

    @Test
    public void testGetRelativePositionOfElement() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockElement child1 = new MockElement("child1");
        MockElement child2 = new MockElement("child2");
        MockText textNode = new MockText("text");
        parent.appendChild(child1);
        parent.appendChild(textNode);
        parent.appendChild(child2);
        child1.setParentNode(parent);
        textNode.setParentNode(parent);
        child2.setParentNode(parent);
        child1.setOwnerDocument(doc);
        textNode.setOwnerDocument(doc);
        child2.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer1 = new DOMNodePointer(child1, Locale.US);
        assertEquals(1, pointer1.getRelativePositionOfElement());

        DOMNodePointer pointer2 = new DOMNodePointer(child2, Locale.US);
        assertEquals(2, pointer2.getRelativePositionOfElement());
    }
    
    @Test
    public void testGetRelativePositionOfTextNode() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockText text1 = new MockText("text1");
        MockElement child1 = new MockElement("child1");
        MockText text2 = new MockText("text2");
        parent.appendChild(text1);
        parent.appendChild(child1);
        parent.appendChild(text2);
        text1.setParentNode(parent);
        child1.setParentNode(parent);
        text2.setParentNode(parent);
        text1.setOwnerDocument(doc);
        child1.setOwnerDocument(doc);
        text2.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer1 = new DOMNodePointer(text1, Locale.US);
        assertEquals(1, pointer1.getRelativePositionOfTextNode());

        DOMNodePointer pointer2 = new DOMNodePointer(text2, Locale.US);
        assertEquals(2, pointer2.getRelativePositionOfTextNode());
    }

    @Test
    public void testGetRelativePositionOfPI() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockProcessingInstruction pi1 = new MockProcessingInstruction("target1", "data1");
        MockElement child1 = new MockElement("child1");
        MockProcessingInstruction pi2 = new MockProcessingInstruction("target1", "data2");
        parent.appendChild(pi1);
        parent.appendChild(child1);
        parent.appendChild(pi2);
        pi1.setParentNode(parent);
        child1.setParentNode(parent);
        pi2.setParentNode(parent);
        pi1.setOwnerDocument(doc);
        child1.setOwnerDocument(doc);
        pi2.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer1 = new DOMNodePointer(pi1, Locale.US);
        assertEquals(1, pointer1.getRelativePositionOfPI("target1"));

        DOMNodePointer pointer2 = new DOMNodePointer(pi2, Locale.US);
        assertEquals(2, pointer2.getRelativePositionOfPI("target1"));
    }

    @Test
    public void testHashCode() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer1 = new DOMNodePointer(node, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node, Locale.US);
        assertEquals(pointer1.hashCode(), pointer2.hashCode());
    }

    @Test
    public void testEquals() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer1 = new DOMNodePointer(node, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node, Locale.US);
        assertTrue(pointer1.equals(pointer2));
    }

    @Test
    public void testNotEqualsDifferentNodes() {
        MockNode node1 = new MockNode(Node.ELEMENT_NODE, "root1");
        MockNode node2 = new MockNode(Node.ELEMENT_NODE, "root2");
        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    public void testNotEqualsDifferentClass() {
        MockNode node = new MockNode(Node.ELEMENT_NODE, "root");
        DOMNodePointer pointer1 = new DOMNodePointer(node, Locale.US);
        JDOMNodePointer pointer2 = new JDOMNodePointer(new org.jdom.Element("root"), Locale.US);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    public void testStaticGetPrefix() {
        MockElement element = new MockElement("ns:root");
        element.setPrefix("ns");
        element.setNodeName("ns:root");
        assertEquals("ns", DOMNodePointer.getPrefix(element));
    }

    @Test
    public void testStaticGetPrefixNoPrefix() {
        MockElement element = new MockElement("root");
        element.setNodeName("root");
        assertNull(DOMNodePointer.getPrefix(element));
    }

    @Test
    public void testStaticGetLocalName() {
        MockElement element = new MockElement("ns:root");
        element.setLocalName("root");
        element.setNodeName("ns:root");
        assertEquals("root", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testStaticGetLocalNameNoPrefix() {
        MockElement element = new MockElement("root");
        element.setLocalName("root");
        element.setNodeName("root");
        assertEquals("root", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testStaticGetNamespaceURI() {
        MockElement element = new MockElement("ns:root");
        element.setNamespaceURI("http://example.com");
        element.setPrefix("ns");
        element.setLocalName("root");
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testStaticGetNamespaceURIWithAttribute() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        parent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://example.com");
        parent.setOwnerDocument(doc);
        doc.appendChild(parent);

        MockElement child = new MockElement("ns:child");
        child.setPrefix("ns");
        child.setLocalName("child");
        child.setOwnerDocument(doc);
        parent.appendChild(child);
        child.setParentNode(parent);

        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testStaticGetNamespaceURIWithDefaultAttribute() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        parent.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://example.com");
        parent.setOwnerDocument(doc);
        doc.appendChild(parent);

        MockElement child = new MockElement("child");
        child.setLocalName("child");
        child.setOwnerDocument(doc);
        parent.appendChild(child);
        child.setParentNode(parent);

        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(child));
    }
    
    @Test
    public void testStaticGetNamespaceURINoAttribute() {
        MockElement element = new MockElement("root");
        element.setNamespaceURI(null);
        assertEquals(null, DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetValueForTextNode() {
        MockText textNode = new MockText("  some text  ");
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("some text", pointer.getValue());
    }

    @Test
    public void testGetValueForCommentNode() {
        MockComment commentNode = new MockComment("  a comment  ");
        DOMNodePointer pointer = new DOMNodePointer(commentNode, Locale.US);
        assertEquals("a comment", pointer.getValue());
    }
    
    @Test
    public void testGetValueForProcessingInstructionNode() {
        MockProcessingInstruction piNode = new MockProcessingInstruction("target", "  some data  ");
        DOMNodePointer pointer = new DOMNodePointer(piNode, Locale.US);
        assertEquals("some data", pointer.getValue());
    }

    @Test
    public void testGetValueForElementWithTextChildren() {
        MockDocument doc = new MockDocument();
        MockElement element = new MockElement("element");
        MockText text1 = new MockText("  hello ");
        MockText text2 = new MockText(" world  ");
        element.appendChild(text1);
        element.appendChild(text2);
        text1.setParentNode(element);
        text2.setParentNode(element);
        element.setOwnerDocument(doc);
        doc.appendChild(element);

        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        assertEquals("hello world", pointer.getValue());
    }

    @Test
    public void testGetValueForElementWithMixedChildren() {
        MockDocument doc = new MockDocument();
        MockElement element = new MockElement("element");
        MockText text1 = new MockText("  first ");
        MockElement child = new MockElement("child");
        child.setNodeValue("inner"); 
        MockText text2 = new MockText(" last  ");
        element.appendChild(text1);
        element.appendChild(child);
        element.appendChild(text2);
        text1.setParentNode(element);
        child.setParentNode(element);
        text2.setParentNode(element);
        child.setOwnerDocument(doc);
        text1.setOwnerDocument(doc);
        text2.setOwnerDocument(doc);
        doc.appendChild(element);

        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        assertEquals("first inner last", pointer.getValue());
    }

    @Test
    public void testGetPointerByIDFound() {
        MockDocument doc = new MockDocument();
        MockElement element = new MockElement("element");
        element.setOwnerDocument(doc);
        doc.appendChild(element);
        doc.putElementById("foundId", element);

        Pointer result = new DOMNodePointer(doc, Locale.US).getPointerByID(null, "foundId"); 
        assertNotNull(result);
        assertTrue(result instanceof DOMNodePointer);
        assertEquals(element, result.getBaseValue());
    }

    @Test
    public void testGetPointerByIDNotFound() {
        MockDocument doc = new MockDocument();
        Pointer result = new DOMNodePointer(doc, Locale.US).getPointerByID(null, "notFoundId"); 
        assertNotNull(result);
        assertTrue(result instanceof NullPointer);
        assertEquals("notFoundId", ((NullPointer) result).getId());
    }

    @Test
    public void testCompareChildNodePointersEqualNodes() {
        MockNode node1 = new MockNode(Node.ELEMENT_NODE, "child1");
        MockNode node2 = node1; 
        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);
        assertEquals(0, pointer1.compareChildNodePointers(pointer1, pointer2));
    }
    
    @Test
    public void testCompareChildNodePointersAttributeVsElement() {
        MockNode attrNode = new MockNode(Node.ATTRIBUTE_NODE, "attr");
        MockNode elementNode = new MockNode(Node.ELEMENT_NODE, "element");
        DOMNodePointer pointer1 = new DOMNodePointer(attrNode, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(elementNode, Locale.US);
        assertEquals(-1, pointer1.compareChildNodePointers(pointer1, pointer2));
        assertEquals(1, pointer2.compareChildNodePointers(pointer2, pointer1));
    }

    @Test
    public void testCompareChildNodePointersSameNodeTypeOrder() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockNode child1 = new MockNode(Node.ELEMENT_NODE, "child1");
        MockNode child2 = new MockNode(Node.ELEMENT_NODE, "child2");
        parent.appendChild(child1);
        parent.appendChild(child2);
        child1.setParentNode(parent);
        child2.setParentNode(parent);
        child1.setOwnerDocument(doc);
        child2.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer1 = new DOMNodePointer(child1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(child2, Locale.US);
        assertEquals(-1, pointer1.compareChildNodePointers(pointer1, pointer2));
        assertEquals(1, pointer1.compareChildNodePointers(pointer2, pointer1));
    }
    
    @Test
    public void testCompareChildNodePointersSameNodeTypeOrderTextNodes() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockNode text1 = new MockNode(Node.TEXT_NODE, "#text");
        MockNode text2 = new MockNode(Node.TEXT_NODE, "#text");
        parent.appendChild(text1);
        parent.appendChild(text2);
        text1.setParentNode(parent);
        text2.setParentNode(parent);
        text1.setOwnerDocument(doc);
        text2.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer1 = new DOMNodePointer(text1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(text2, Locale.US);
        assertEquals(-1, pointer1.compareChildNodePointers(pointer1, pointer2));
        assertEquals(1, pointer1.compareChildNodePointers(pointer2, pointer1));
    }

    @Test
    public void testCompareChildNodePointersSameNodeTypeOrderPIs() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockNode pi1 = new MockNode(Node.PROCESSING_INSTRUCTION_NODE, "target1");
        MockNode pi2 = new MockNode(Node.PROCESSING_INSTRUCTION_NODE, "target2");
        parent.appendChild(pi1);
        parent.appendChild(pi2);
        pi1.setParentNode(parent);
        pi2.setParentNode(parent);
        pi1.setOwnerDocument(doc);
        pi2.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer1 = new DOMNodePointer(pi1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(pi2, Locale.US);
        assertEquals(-1, pointer1.compareChildNodePointers(pointer1, pointer2));
        assertEquals(1, pointer1.compareChildNodePointers(pointer2, pointer1));
    }

    @Test
    public void testChildIterator() {
        MockDocument doc = new MockDocument();
        MockElement parent = new MockElement("parent");
        MockElement child1 = new MockElement("child1");
        MockText text1 = new MockText("text1");
        parent.appendChild(child1);
        parent.appendChild(text1);
        child1.setParentNode(parent);
        text1.setParentNode(parent);
        child1.setOwnerDocument(doc);
        text1.setOwnerDocument(doc);
        doc.appendChild(parent);

        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        NodeIterator iterator = pointer.childIterator(null, false, null);
        
        assertNotNull(iterator);
        assertTrue(iterator.setPosition(1));
        assertEquals(child1, iterator.getNodePointer().getBaseValue());
        assertTrue(iterator.setPosition(2));
        assertEquals(text1, iterator.getNodePointer().getBaseValue());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testAttributeIterator() {
        MockElement element = new MockElement("root");
        MockAttr attr1 = new MockAttr("attr1", "val1");
        MockAttr attr2 = new MockAttr("attr2", "val2");
        element.setAttributeNode(attr1);
        element.setAttributeNode(attr2);

        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        NodeIterator iterator = pointer.attributeIterator(null); 

        assertNotNull(iterator);
        assertTrue(iterator.setPosition(1));
        assertEquals(attr1, iterator.getNodePointer().getBaseValue());
        assertTrue(iterator.setPosition(2));
        assertEquals(attr2, iterator.getNodePointer().getBaseValue());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testNamespacePointer() {
        MockElement element = new MockElement("ns:root");
        element.setPrefix("ns");
        element.setNamespaceURI("http://example.com");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);

        NodePointer nsPointer = pointer.namespacePointer("ns");
        assertNotNull(nsPointer);
        assertEquals("http://example.com", nsPointer.getValue());
    }

    @Test
    public void testNamespaceIterator() {
        MockElement element = new MockElement("root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns1", "http://namespace1.com");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns2", "http://namespace2.com");

        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        NodeIterator iterator = pointer.namespaceIterator();

        assertNotNull(iterator);
        assertTrue(iterator.setPosition(1));
        assertEquals("ns1", iterator.getNodePointer().getName().getName());
        assertTrue(iterator.setPosition(2));
        assertEquals("ns2", iterator.getNodePointer().getName().getName());
        assertFalse(iterator.setPosition(3));
    }
}
```