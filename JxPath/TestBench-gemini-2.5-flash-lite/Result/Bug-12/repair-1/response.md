```java
package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
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
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

public class DOMNodePointerTest {

    // Mock DOM Node and Document for testing
    private static class MockNode implements Node {
        private String nodeName;
        private String nodeValue;
        private short nodeType;
        private Node parentNode;
        private NamedNodeMap attributes;
        private NodeList childNodes;
        private String prefix;
        private String localName;
        private String namespaceURI;
        private Document ownerDocument; // Added for getOwnerDocument

        MockNode(String nodeName, short nodeType, String nodeValue) {
            this.nodeName = nodeName;
            this.nodeType = nodeType;
            this.nodeValue = nodeValue;
            this.attributes = new MockNamedNodeMap();
            this.childNodes = new MockNodeList(this); // Pass parent to NodeList
        }

        void setNodeType(short nodeType) { this.nodeType = nodeType; }
        void setNodeName(String nodeName) { this.nodeName = nodeName; }
        void setNodeValue(String nodeValue) { this.nodeValue = nodeValue; }
        void setParentNode(Node parentNode) { this.parentNode = parentNode; }
        void setAttributes(NamedNodeMap attributes) { this.attributes = attributes; }
        void setChildNodes(NodeList childNodes) { this.childNodes = childNodes; }
        void setPrefix(String prefix) { this.prefix = prefix; }
        void setLocalName(String localName) { this.localName = localName; }
        void setNamespaceURI(String namespaceURI) { this.namespaceURI = namespaceURI; }
        void setOwnerDocument(Document ownerDocument) { this.ownerDocument = ownerDocument; }

        @Override public String getNodeName() { return nodeName; }
        @Override public String getNodeValue() { return nodeValue; }
        @Override public short getNodeType() { return nodeType; }
        @Override public Node getParentNode() { return parentNode; }
        @Override public NamedNodeMap getAttributes() { return attributes; }
        @Override public NodeList getChildNodes() { return childNodes; }
        @Override public String getPrefix() { return prefix; }
        @Override public String getLocalName() { return localName; }
        @Override public String getNamespaceURI() { return namespaceURI; }
        @Override public Document getOwnerDocument() { return ownerDocument; }

        // Implementations for Node interface methods
        @Override public String getBaseURI() { return null; }
        @Override public short compareDocumentPosition(Node other) throws DOMException { return 0; }
        @Override public boolean isEqualNode(Node arg) { return false; }
        @Override public Object getFeature(String feature, String version) { return null; }
        @Override public Object setUserData(String key, Object data, UserDataHandler handler) { return null; }
        @Override public Object getUserData(String key) { return null; }
        @Override public Element getParentElement() { return (Element) (nodeType == Node.ELEMENT_NODE ? this : null); }
        @Override public Node insertBefore(Node newChild, Node refChild) throws DOMException { return null; }
        @Override public Node removeChild(Node oldChild) throws DOMException { return null; }
        @Override public Node replaceChild(Node newChild, Node oldChild) throws DOMException { return null; }
        @Override public Node cloneNode(boolean deep) { return null; }
        @Override public String getNamespaceURI(String qualifiedName) { return null; }
        @Override public String getLocalName(String qualifiedName) { return null; }
        @Override public String getPrefix(String uri) { return null; }
        @Override public void setTextContent(String textContent) {}
        @Override public String getTextContent() { return null; }
        @Override public String getLookupPrefix(String namespaceURI) { return null; }
        @Override public boolean isDefaultNamespace(String namespaceURI) { return false; }
        @Override public String getLookupNamespaceURI(String prefix) { return null; }
        @Override public boolean isSameNode(Node other) { return false; }
        @Override public void appendChild(Node newChild) { ((MockNodeList)childNodes).addNode(newChild); }
        @Override public Node getFirstChild() { return childNodes.getLength() > 0 ? childNodes.item(0) : null; }
        @Override public Node getLastChild() { return childNodes.getLength() > 0 ? childNodes.item(childNodes.getLength() - 1) : null; }
        @Override public Node getNextSibling() { return null; }
        @Override public Node getPreviousSibling() { return null; }
        @Override public boolean hasChildNodes() { return childNodes.getLength() > 0; }
        @Override public String getAsText() { return null; }
        @Override public String getTarget() { return null; }
        @Override public String getData() { return null; }
        @Override public Attr getAttributeNode(String name) { return (Attr) attributes.getNamedItem(name); }
        @Override public Attr getAttributeNodeNS(String namespaceURI, String localName) { return (Attr) attributes.getNamedItemNS(namespaceURI, localName); }
        @Override public Node removeAttributeNode(Attr oldAttr) { return attributes.removeNamedItem(oldAttr.getNodeName()); }
        @Override public Attr setAttributeNode(Attr newAttr) { attributes.setNamedItem(newAttr); return newAttr; }
        @Override public void removeAttribute(String name) { attributes.removeNamedItem(name); }
        @Override public void setAttribute(String name, String value) {
            MockAttr attr = new MockAttr(name, value);
            attributes.setNamedItem(attr);
        }
        @Override public String getAttribute(String name) {
            Node attr = attributes.getNamedItem(name);
            return attr != null ? attr.getNodeValue() : "";
        }
        @Override public String getAttributeNS(String namespaceURI, String localName) {
            Node attr = attributes.getNamedItemNS(namespaceURI, localName);
            return attr != null ? attr.getNodeValue() : "";
        }
        @Override public void setAttributeNS(String namespaceURI, String qualifiedName, String value) {
            MockAttr attr = new MockAttr(qualifiedName, value);
            attr.setNamespaceURI(namespaceURI);
            ((MockNamedNodeMap)attributes).setNamedItemNS(attr);
        }
        @Override public NodeList getElementsByTagName(String tagname) { return null; }
        @Override public NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
        @Override public void normalize() {}
        @Override public Node importNode(Node importedNode, boolean deep) { return null; }
        @Override public Element createElementNS(String namespaceURI, String qualifiedName) { return null; }
        @Override public Attr createAttributeNS(String namespaceURI, String qualifiedName) { return null; }
        @Override public String getInputEncoding() { return null; }
        @Override public String getXmlEncoding() { return null; }
        @Override public boolean getXmlStandalone() { return false; }
        @Override public void setXmlStandalone(boolean xmlStandalone) {}
        @Override public String getXmlVersion() { return null; }
        @Override public void setXmlVersion(String xmlVersion) {}
        @Override public String getDocumentURI() { return null; }
        @Override public void setDocumentURI(String documentURI) {}
        @Override public DOMConfiguration getDomConfig() { return null; }
        @Override public void normalizeDocument() {}
        @Override public Node adoptNode(Node source) throws DOMException { return null; }
        @Override public Node renameNode(Node n, String namespaceURI, String qualifiedName) throws DOMException { return null; }
        @Override public Node getDocType() { return null; }
        @Override public Node getXmlDeclaration() { return null; }
        @Override public void setXmlDeclaration(Node xmlDeclaration) {}
        @Override public void setNodeValue(String nodeValue) { this.nodeValue = nodeValue; }
        @Override public boolean hasAttributes() { return attributes.getLength() > 0; }
    }

    private static class MockDocument extends MockNode implements Document {
        private Element documentElement;
        private Map<String, Element> elementsById = new HashMap<>();

        MockDocument(Element documentElement) {
            super("#document", Node.DOCUMENT_NODE, null);
            this.documentElement = documentElement;
            if (documentElement != null) {
                ((MockNode)documentElement).setOwnerDocument(this);
                addElementsToMap(documentElement);
            }
        }
        
        private void addElementsToMap(Node node) {
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element el = (Element) node;
                String id = el.getAttribute("id");
                if (id != null && !id.isEmpty()) {
                    elementsById.put(id, el);
                }
                NodeList children = node.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    addElementsToMap(children.item(i));
                }
            }
        }

        @Override public Element getDocumentElement() { return documentElement; }
        @Override public Element getElementById(String elementId) { return elementsById.get(elementId); }

        @Override public DocumentType createDocumentType(String name, String publicId, String systemId) { return null; }
        @Override public ProcessingInstruction createProcessingInstruction(String target, String data) { return new MockNode(target, Node.PROCESSING_INSTRUCTION_NODE, data); }
        @Override public Comment createComment(String data) { return new MockNode("#comment", Node.COMMENT_NODE, data); }
        @Override public Text createTextNode(String data) { return new MockNode("#text", Node.TEXT_NODE, data); }
        @Override public CDATASection createCDATASection(String data) { return new MockNode("#cdata-section", Node.CDATA_SECTION_NODE, data); }
        @Override public DocumentFragment createDocumentFragment() { return null; } // Not critical for current tests
        @Override public Attr createAttribute(String name) { return new MockAttr(name, ""); }
        @Override public EntityReference createEntityReference(String name) { return null; }
        @Override public NodeList getElementsByTagName(String tagname) { return null; }
        @Override public Node importNode(Node importedNode, boolean deep) { return null; }
        @Override public Element createElementNS(String namespaceURI, String qualifiedName) { return null; }
        @Override public Attr createAttributeNS(String namespaceURI, String qualifiedName) { return new MockAttr(qualifiedName, ""); }
        @Override public NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
        @Override public DOMImplementation getImplementation() { return null; }
        @Override public Node getDocType() { return null; }
        @Override public Node getXmlDeclaration() { return null; }
        @Override public void setXmlDeclaration(Node xmlDeclaration) {}
        @Override public void setNodeValue(String nodeValue) {}
        @Override public Node getOwnerDocument() { return null; }
        @Override public void setOwnerDocument(Node ownerDocument) {}
        @Override public Node getParentNode() { return null; }
        @Override public void setParentNode(Node parentNode) {}
        @Override public NodeList getChildNodes() { return childNodes; }
        @Override public Node getFirstChild() { return childNodes.getLength() > 0 ? childNodes.item(0) : null; }
        @Override public Node getLastChild() { return childNodes.getLength() > 0 ? childNodes.item(childNodes.getLength() - 1) : null; }
        @Override public Node getNextSibling() { return null; }
        @Override public Node getPreviousSibling() { return null; }
        @Override public NamedNodeMap getAttributes() { return null; }
        @Override public String getNodeName() { return "#document"; }
        @Override public short getNodeType() { return Node.DOCUMENT_NODE; }
        @Override public String getNodeValue() { return null; }
        @Override public String getLocalName() { return null; }
        @Override public String getNamespaceURI() { return null; }
        @Override public String getPrefix() { return null; }
        @Override public void setPrefix(String prefix) {}
        @Override public void setLocalName(String localName) {}
        @Override public void setNamespaceURI(String namespaceURI) {}
        @Override public String getInputEncoding() { return null; }
        @Override public DOMConfiguration getDomConfig() { return null; }
        @Override public void normalizeDocument() {}
        @Override public Node adoptNode(Node source) throws DOMException { return null; }
        @Override public Node renameNode(Node n, String namespaceURI, String qualifiedName) throws DOMException { return null; }
        @Override public Node getXmlDeclaration() { return null; }
        @Override public void setXmlDeclaration(Node xmlDeclaration) {}
        @Override public Node cloneNode(boolean deep) { return null; }
        @Override public Element createElement(String tagName) { return null; }
    }

    private static class MockAttr extends MockNode implements Attr {
        MockAttr(String name, String value) {
            super(name, Node.ATTRIBUTE_NODE, value);
            setNodeName(name); // Ensure nodeName is set correctly for attributes
        }

        @Override public String getName() { return getNodeName(); }
        @Override public boolean getSpecified() { return true; }
        @Override public void setValue(String value) { setNodeValue(value); }
        @Override public String getValue() { return getNodeValue(); }
        @Override public Element getOwnerElement() { return null; } // Not relevant for these tests
    }

    private static class MockNamedNodeMap implements NamedNodeMap {
        private Map<String, Node> attributes = new HashMap<>();

        @Override public Node getNamedItem(String name) { return attributes.get(name); }
        @Override public Node setNamedItem(Node arg) { return attributes.put(arg.getNodeName(), arg); }
        @Override public Node removeNamedItem(String name) { return attributes.remove(name); }
        @Override public Node item(int index) {
            if (index < 0 || index >= attributes.size()) return null;
            return (Node) attributes.values().toArray()[index];
        }
        @Override public int getLength() { return attributes.size(); }
        @Override public Node getNamedItemNS(String namespaceURI, String localName) {
            // Simplified: assumes localName is enough to identify unique attribute within this map
            return attributes.get(localName); 
        }
        @Override public Node setNamedItemNS(Node arg) { return setNamedItem(arg); }
        @Override public Node removeNamedItemNS(String namespaceURI, String localName) { return removeNamedItem(localName); }
    }

    private static class MockNodeList implements NodeList {
        private java.util.List<Node> nodes = new java.util.ArrayList<>();
        private Node parent;

        MockNodeList(Node parent) { this.parent = parent; }

        @Override public Node item(int index) {
            if (index < 0 || index >= nodes.size()) return null;
            return nodes.get(index);
        }
        @Override public int getLength() { return nodes.size(); }
        void addNode(Node node) {
            nodes.add(node);
            if (node instanceof MockNode) {
                ((MockNode) node).setParentNode(parent);
            }
        }
        void removeNode(Node node) { nodes.remove(node); }
    }

    // Helper method to create a basic DOM structure
    private MockNode createMockDOM(String rootName) {
        MockNode root = new MockNode(rootName, Node.ELEMENT_NODE, null);
        MockDocument document = new MockDocument(root);
        root.setOwnerDocument(document);
        return root;
    }

    @Test
    public void testTestNode_ElementNode_MatchingName() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        NodeNameTest test = new NodeNameTest(new QName("element"));
        assertTrue("Should match element with same name", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_ElementNode_WildcardName() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        NodeNameTest test = new NodeNameTest(new QName("*"));
        assertTrue("Should match element with wildcard", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_ElementNode_WildcardNameWithPrefix() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setPrefix("ns");
        node.setNamespaceURI("http://example.com/ns");
        NodeNameTest test = new NodeNameTest(new QName("*"));
        assertTrue("Should match element with wildcard name", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_ElementNode_NonMatchingName() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        NodeNameTest test = new NodeNameTest(new QName("other"));
        assertFalse("Should not match element with different name", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_ElementNode_MatchingNameWithNamespace() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setPrefix("ns");
        node.setNamespaceURI("http://example.com/ns");
        NodeNameTest test = new NodeNameTest(new QName("ns", "element"), "http://example.com/ns");
        assertTrue("Should match element with same name and namespace", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_ElementNode_NonMatchingNamespace() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setPrefix("ns");
        node.setNamespaceURI("http://example.com/ns");
        NodeNameTest test = new NodeNameTest(new QName("ns", "element"), "http://other.com/ns");
        assertFalse("Should not match element with different namespace", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_TextNode() throws Exception {
        MockNode node = new MockNode("#text", Node.TEXT_NODE, "some text");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue("Should match text node", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_CommentNode() throws Exception {
        MockNode node = new MockNode("#comment", Node.COMMENT_NODE, "a comment");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue("Should match comment node", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionNode() throws Exception {
        MockNode node = new MockNode("target", Node.PROCESSING_INSTRUCTION_NODE, "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue("Should match PI with target", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionNode_NonMatchingTarget() throws Exception {
        MockNode node = new MockNode("target", Node.PROCESSING_INSTRUCTION_NODE, "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse("Should not match PI with different target", DOMNodePointer.testNode(node, test));
    }

    @Test
    public void testGetName_ElementNode() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setPrefix("ns");
        node.setNamespaceURI("http://example.com/ns");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        QName name = pointer.getName();
        assertEquals("Prefix should be 'ns'", "ns", name.getPrefix());
        assertEquals("Local name should be 'element'", "element", name.getName());
    }

    @Test
    public void testGetName_ProcessingInstructionNode() throws Exception {
        MockNode node = new MockNode("target", Node.PROCESSING_INSTRUCTION_NODE, "data");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        QName name = pointer.getName();
        assertNull("Prefix should be null", name.getPrefix());
        assertEquals("Local name should be the target", "target", name.getName());
    }

    @Test
    public void testGetNamespaceURI_ElementNode_WithPrefix() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setPrefix("ns");
        node.setNamespaceURI("http://example.com/ns");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals("Namespace URI should be 'http://example.com/ns'", "http://example.com/ns", pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_ElementNode_NoPrefix() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        node.setNamespaceURI(null); // Explicitly null
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertNull("Namespace URI should be null", pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_ElementNode_WithAttribute() throws Exception {
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        MockNode node = new MockNode("child", Node.ELEMENT_NODE, null);
        node.setParentNode(parent);
        node.setNamespaceURI(null); // No direct namespace

        MockNamedNodeMap parentAttributes = new MockNamedNodeMap();
        MockAttr xmlnsAttr = new MockAttr("xmlns:ns", "http://example.com/ns");
        xmlnsAttr.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        parentAttributes.setNamedItem(xmlnsAttr);
        ((MockNode)parent).setAttributes(parentAttributes);
        
        ((MockNode)node).setPrefix("ns"); // Set prefix on the child node itself

        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        pointer.setNamespaceResolver(new org.apache.commons.jxpath.ri.NamespaceResolver()); // Set a dummy resolver

        // Test when the node itself doesn't declare namespace, but parent does
        assertEquals("Namespace URI should be found via parent attribute", "http://example.com/ns", pointer.getNamespaceURI("ns"));
    }

    @Test
    public void testGetNamespaceURI_ElementNode_WithDefaultNamespaceAttribute() throws Exception {
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        MockNode node = new MockNode("child", Node.ELEMENT_NODE, null);
        node.setParentNode(parent);
        node.setNamespaceURI(null); // No direct namespace

        MockNamedNodeMap parentAttributes = new MockNamedNodeMap();
        MockAttr xmlnsAttr = new MockAttr("xmlns", "http://example.com/default");
        xmlnsAttr.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        parentAttributes.setNamedItem(xmlnsAttr);
        ((MockNode)parent).setAttributes(parentAttributes);

        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);

        assertEquals("Default namespace URI should be 'http://example.com/default'", "http://example.com/default", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_XmlNamespace() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals("XML namespace URI", DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURI_XmlnsNamespace() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals("XMLNS namespace URI", DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURI_NullPrefix() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertNull("Default namespace URI for null prefix", pointer.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURI_EmptyPrefix() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertNull("Default namespace URI for empty prefix", pointer.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURI_UnknownPrefix() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        pointer.setNamespaceResolver(new org.apache.commons.jxpath.ri.NamespaceResolver());
        assertNull("Namespace URI for unknown prefix should be null", pointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetBaseValue() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertSame("Base value should be the Node itself", node, pointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertSame("Immediate node should be the Node itself", node, pointer.getImmediateNode());
    }

    @Test
    public void testIsActual() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue("DOMNodePointer should be actual", pointer.isActual());
    }

    @Test
    public void testIsCollection() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertFalse("DOMNodePointer should not be a collection by default", pointer.isCollection());
    }

    @Test
    public void testGetLength() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertEquals("Length should be 1 for a single node", 1, pointer.getLength());
    }

    @Test
    public void testIsLeaf_WithChildren() throws Exception {
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        MockNode child = new MockNode("child", Node.ELEMENT_NODE, null);
        parent.appendChild(child); // Use appendChild
        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        assertFalse("Node with children should not be a leaf", pointer.isLeaf());
    }

    @Test
    public void testIsLeaf_WithoutChildren() throws Exception {
        MockNode node = new MockNode("leaf", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue("Node without children should be a leaf", pointer.isLeaf());
    }

    @Test
    public void testIsLanguage_Match() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        MockNamedNodeMap attributes = new MockNamedNodeMap();
        MockAttr langAttr = new MockAttr("xml:lang", "en-US");
        langAttr.setNodeName("xml:lang"); // Ensure node name is set for attribute
        attributes.setNamedItem(langAttr);
        ((MockNode)node).setAttributes(attributes);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertTrue("Should match language 'en'", pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_SuperCall() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        // Assuming super.isLanguage("en") would return false if not specified
        assertFalse("Should fall back to super.isLanguage", pointer.isLanguage("nonexistent"));
    }

    @Test
    public void testSetValue_TextNode_String() throws Exception {
        MockNode owner = new MockNode("owner", Node.ELEMENT_NODE, null);
        MockNode textNode = new MockNode("#text", Node.TEXT_NODE, "old text");
        owner.appendChild(textNode);

        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue("new text");

        assertEquals("Text node value should be updated", "new text", textNode.getNodeValue());
        assertEquals("Text node should still be present", 1, owner.getChildNodes().getLength());
        assertSame("The same text node should be present", textNode, owner.getChildNodes().item(0));
    }

    @Test
    public void testSetValue_TextNode_EmptyString() throws Exception {
        MockNode owner = new MockNode("owner", Node.ELEMENT_NODE, null);
        MockNode textNode = new MockNode("#text", Node.TEXT_NODE, "old text");
        owner.appendChild(textNode);

        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue("");

        assertEquals("Text node should be removed", 0, owner.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_ElementNode_String() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        MockNode textNode = new MockNode("#text", Node.TEXT_NODE, "old text");
        node.appendChild(textNode);

        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        pointer.setValue("new text");

        assertEquals("Element should have one child node", 1, node.getChildNodes().getLength());
        Node newNode = node.getChildNodes().item(0);
        assertEquals("New node should be text node", Node.TEXT_NODE, newNode.getNodeType());
        assertEquals("New text node value should be 'new text'", "new text", newNode.getNodeValue());
    }

    @Test
    public void testSetValue_ElementNode_Node() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        MockNode oldChild = new MockNode("old", Node.ELEMENT_NODE, null);
        node.appendChild(oldChild);

        MockNode newChildElement = new MockNode("new", Node.ELEMENT_NODE, null);
        MockNode newChildText = new MockNode("#text", Node.TEXT_NODE, "new content");
        newChildElement.appendChild(newChildText);

        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        pointer.setValue(newChildElement);

        assertEquals("Element should have one child node", 1, node.getChildNodes().getLength());
        Node clonedChild = node.getChildNodes().item(0);
        assertEquals("New node should be a clone of the provided element", "new", clonedChild.getNodeName());
        assertEquals("Cloned child should have text content", "new content", clonedChild.getFirstChild().getNodeValue());
    }

    @Test
    public void testRemove_ElementNode() throws Exception {
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        MockNode nodeToRemove = new MockNode("element", Node.ELEMENT_NODE, null);
        parent.appendChild(nodeToRemove);

        DOMNodePointer pointer = new DOMNodePointer(nodeToRemove, Locale.US);
        pointer.remove();

        assertEquals("Parent should have no children after removal", 0, parent.getChildNodes().getLength());
    }

    @Test
    public void testAsPath_RootDocument() throws Exception {
        MockDocument document = new MockDocument(null);
        DOMNodePointer pointer = new DOMNodePointer(document, Locale.US);
        assertEquals("Path for document node", "", pointer.asPath());
    }

    @Test
    public void testAsPath_ElementNode() throws Exception {
        MockNode root = createMockDOM("root");
        MockNode child = new MockNode("child", Node.ELEMENT_NODE, null);
        root.appendChild(child);

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        assertEquals("Path for a simple child element", "/root[1]/child[1]", pointer.asPath());
    }

    @Test
    public void testAsPath_TextNode() throws Exception {
        MockNode root = createMockDOM("root");
        MockNode textNode = new MockNode("#text", Node.TEXT_NODE, "some text");
        root.appendChild(textNode);

        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("Path for a text node", "/root[1]/text()[1]", pointer.asPath());
    }

    @Test
    public void testAsPath_ProcessingInstructionNode() throws Exception {
        MockNode root = createMockDOM("root");
        MockNode piNode = new MockNode("target", Node.PROCESSING_INSTRUCTION_NODE, "data");
        root.appendChild(piNode);

        DOMNodePointer pointer = new DOMNodePointer(piNode, Locale.US);
        assertEquals("Path for a PI node", "/root[1]/processing-instruction('target')[1]", pointer.asPath());
    }

    @Test
    public void testAsPath_WithId() throws Exception {
        MockNode root = createMockDOM("root");
        MockNode pointerTarget = new MockNode("target", Node.ELEMENT_NODE, null);
        root.appendChild(pointerTarget);
        
        // Add an ID attribute to the target node
        MockAttr idAttr = new MockAttr("id", "myId");
        idAttr.setNodeName("id");
        pointerTarget.getAttributes().setNamedItem(idAttr);

        DOMNodePointer pointer = new DOMNodePointer(pointerTarget, Locale.US, "myId");
        assertEquals("Path for node with ID", "id('myId')", pointer.asPath());
    }

    @Test
    public void testEquals_SameObject() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer1 = new DOMNodePointer(node, Locale.US);
        DOMNodePointer pointer2 = pointer1;
        assertTrue("Pointers to the same object should be equal", pointer1.equals(pointer2));
    }

    @Test
    public void testEquals_SameNodeDifferentLocale() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer1 = new DOMNodePointer(node, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node, Locale.GERMANY);
        assertTrue("Pointers to the same node should be equal", pointer1.equals(pointer2));
    }

    @Test
    public void testEquals_DifferentNode() throws Exception {
        MockNode node1 = new MockNode("element1", Node.ELEMENT_NODE, null);
        MockNode node2 = new MockNode("element2", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);
        assertFalse("Pointers to different nodes should not be equal", pointer1.equals(pointer2));
    }

    @Test
    public void testEquals_Null() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertFalse("Pointer should not be equal to null", pointer.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.US);
        assertFalse("Pointer should not be equal to a different class object", pointer.equals(new Object()));
    }

    @Test
    public void testGetLocalName_WithLocalName() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setLocalName("element");
        node.setNamespaceURI("http://example.com");
        assertEquals("Local name should be from getLocalName()", "element", DOMNodePointer.getLocalName(node));
    }

    @Test
    public void testGetLocalName_WithoutLocalName() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        assertEquals("Local name should be from getNodeName()", "element", DOMNodePointer.getLocalName(node));
    }

    @Test
    public void testGetLocalName_WithPrefixInNodeName() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        // Simulate a node where getLocalName() returns null but getNodeName() has a prefix
        node.setLocalName(null);
        assertEquals("Local name should be extracted from getNodeName()", "element", DOMNodePointer.getLocalName(node));
    }

    @Test
    public void testGetPrefix_WithPrefix() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setPrefix("ns");
        assertEquals("Prefix should be from getPrefix()", "ns", DOMNodePointer.getPrefix(node));
    }

    @Test
    public void testGetPrefix_WithoutPrefix() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        assertNull("Prefix should be null", DOMNodePointer.getPrefix(node));
    }

    @Test
    public void testGetPrefix_WithColonInNodeName() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setPrefix(null); // Simulate getPrefix() returning null
        assertEquals("Prefix should be extracted from getNodeName()", "ns", DOMNodePointer.getPrefix(node));
    }

    @Test
    public void testGetNamespaceURI_WithURI() throws Exception {
        MockNode node = new MockNode("ns:element", Node.ELEMENT_NODE, null);
        node.setNamespaceURI("http://example.com");
        assertEquals("Namespace URI should be from getNamespaceURI()", "http://example.com", DOMNodePointer.getNamespaceURI(node));
    }

    @Test
    public void testGetNamespaceURI_NullURI() throws Exception {
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        node.setNamespaceURI(null);
        assertNull("Namespace URI should be null", DOMNodePointer.getNamespaceURI(node));
    }

    @Test
    public void testGetNamespaceURI_WithAttribute() throws Exception {
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        MockNode node = new MockNode("element", Node.ELEMENT_NODE, null);
        node.setNamespaceURI(null); // No direct namespace

        MockNamedNodeMap parentAttributes = new MockNamedNodeMap();
        MockAttr xmlnsAttr = new MockAttr("xmlns:ns", "http://example.com");
        xmlnsAttr.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        parentAttributes.setNamedItem(xmlnsAttr);
        ((MockNode)parent).setAttributes(parentAttributes);
        node.setParentNode(parent); // Important for traversal

        // Simulate getPrefix returning "ns" when there's a colon in node name
        ((MockNode)node).setNodeName("ns:element");
        ((MockNode)node).setPrefix("ns");

        assertEquals("Namespace URI should be found via parent attribute", "http://example.com", DOMNodePointer.getNamespaceURI(node));
    }

    @Test
    public void testGetNamespaceURI_DocumentNode() throws Exception {
        MockNode element = new MockNode("root", Node.ELEMENT_NODE, null);
        element.setNamespaceURI("http://example.com/root");
        MockDocument document = new MockDocument(element);
        assertEquals("Namespace URI for document should be from its document element", "http://example.com/root", DOMNodePointer.getNamespaceURI(document));
    }

    @Test
    public void testGetValue_CommentNode() throws Exception {
        MockNode comment = new MockNode("#comment", Node.COMMENT_NODE, " a comment ");
        DOMNodePointer pointer = new DOMNodePointer(comment, Locale.US);
        assertEquals("Comment node value should be trimmed", "a comment", pointer.getValue());
    }

    @Test
    public void testGetValue_TextNode() throws Exception {
        MockNode text = new MockNode("#text", Node.TEXT_NODE, "  some text  ");
        DOMNodePointer pointer = new DOMNodePointer(text, Locale.US);
        assertEquals("Text node value should be trimmed", "some text", pointer.getValue());
    }

    @Test
    public void testGetValue_TextNode_PreserveSpace() throws Exception {
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        MockNode text = new MockNode("#text", Node.TEXT_NODE, "  some text  ");
        text.setParentNode(parent);
        MockNamedNodeMap attributes = new MockNamedNodeMap();
        MockAttr spaceAttr = new MockAttr("xml:space", "preserve");
        spaceAttr.setNodeName("xml:space");
        attributes.setNamedItem(spaceAttr);
        ((MockNode)parent).setAttributes(attributes);
        ((MockNode)parent).getChildNodes().addNode(text); // Set child node for parent

        DOMNodePointer pointer = new DOMNodePointer(text, Locale.US);
        assertEquals("Text node value should not be trimmed if xml:space='preserve'", "  some text  ", pointer.getValue());
    }

    @Test
    public void testGetValue_ProcessingInstructionNode() throws Exception {
        MockNode pi = new MockNode("target", Node.PROCESSING_INSTRUCTION_NODE, " data ");
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        assertEquals("PI node value should be trimmed", "data", pointer.getValue());
    }

    @Test
    public void testGetValue_ElementNode_WithTextChild() throws Exception {
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        MockNode text1 = new MockNode("#text", Node.TEXT_NODE, " part1 ");
        MockNode text2 = new MockNode("#text", Node.TEXT_NODE, "part2");
        parent.appendChild(text1);
        parent.appendChild(text2);

        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        assertEquals("Element value should be concatenation of child text values", "part1part2", pointer.getValue());
    }

    @Test
    public void testGetValue_ElementNode_WithCommentChild() throws Exception {
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        MockNode comment = new MockNode("#comment", Node.COMMENT_NODE, "comment");
        MockNode text = new MockNode("#text", Node.TEXT_NODE, "text");
        parent.appendChild(comment);
        parent.appendChild(text);

        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        assertEquals("Comment nodes should not contribute to element value", "text", pointer.getValue());
    }

    @Test
    public void testGetPointerByID_Found() throws Exception {
        MockNode element = new MockNode("element", Node.ELEMENT_NODE, null);
        MockAttr idAttr = new MockAttr("id", "myId");
        idAttr.setNodeName("id");
        element.getAttributes().setNamedItem(idAttr);

        MockNode root = createMockDOM("root");
        root.appendChild(element); // Use appendChild
        element.setOwnerDocument(root.getOwnerDocument()); // Set owner document for element

        JXPathContext context = JXPathContext.newContext(root.getOwnerDocument());
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US); // Pointer to the element itself
        
        Pointer resultPointer = pointer.getPointerByID(context, "myId");
        
        assertNotNull("Pointer should not be null", resultPointer);
        assertTrue("Pointer should be a DOMNodePointer", resultPointer instanceof DOMNodePointer);
        assertSame("Pointer should point to the correct element", element, ((DOMNodePointer)resultPointer).getImmediateNode());
        assertEquals("Pointer ID should be set", "myId", ((DOMNodePointer)resultPointer).id);
    }

    @Test
    public void testGetPointerByID_NotFound() throws Exception {
        MockNode element = new MockNode("element", Node.ELEMENT_NODE, null);
        MockDocument document = new MockDocument(new MockNode("root", Node.ELEMENT_NODE, null));
        element.setOwnerDocument(document);

        JXPathContext context = JXPathContext.newContext(document);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US);
        Pointer resultPointer = pointer.getPointerByID(context, "nonexistentId");

        assertNotNull("Pointer should not be null", resultPointer);
        assertTrue("Pointer should be a NullPointer", resultPointer instanceof NullPointer);
        assertEquals("NullPointer should have the requested ID", "nonexistentId", ((NullPointer) resultPointer).getValue());
    }

    @Test
    public void testCompareChildNodePointers_SameNode() throws Exception {
        MockNode node1 = new MockNode("element1", Node.ELEMENT_NODE, null);
        MockNode node2 = node1; // Same instance

        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);

        assertEquals("Comparing the same node pointer should return 0", 0, pointer1.compareChildNodePointers(pointer1, pointer2));
    }

    @Test
    public void testCompareChildNodePointers_DifferentNodes() throws Exception {
        MockNode node1 = new MockNode("element1", Node.ELEMENT_NODE, null);
        MockNode node2 = new MockNode("element2", Node.ELEMENT_NODE, null);

        // Set up a parent-child relationship for comparison
        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        parent.appendChild(node1); // Use appendChild
        parent.appendChild(node2);

        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.US);
        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);

        // The method compares node1 and node2 as if they were children of 'parent'.
        // In this setup, node1 is first, so node1 < node2.
        int result = parentPointer.compareChildNodePointers(pointer1, pointer2);
        assertTrue("node1 should come before node2", result < 0);

        result = parentPointer.compareChildNodePointers(pointer2, pointer1);
        assertTrue("node2 should come after node1", result > 0);
    }

    @Test
    public void testCompareChildNodePointers_AttributeVsElement() throws Exception {
        MockNode element = new MockNode("element", Node.ELEMENT_NODE, null);
        MockAttr attr = new MockAttr("attr", "value");
        attr.setNodeName("attr");
        element.getAttributes().setNamedItem(attr);

        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);
        DOMNodePointer attrPointer = new DOMNodePointer(attr, Locale.US);

        // When comparing an attribute and an element as children, attributes come first.
        // The compareChildNodePointers method is defined on the parent pointer.
        int result = elementPointer.compareChildNodePointers(attrPointer, elementPointer);
        assertTrue("Attribute should come before element", result < 0);

        result = elementPointer.compareChildNodePointers(elementPointer, attrPointer);
        assertTrue("Element should come after attribute", result > 0);
    }

    // Tests for methods that were not called in the previous version

    @Test
    public void testChildIterator() throws Exception {
        MockNode parent = createMockDOM("parent");
        MockNode child1 = new MockNode("child1", Node.ELEMENT_NODE, null);
        MockNode child2 = new MockNode("child2", Node.ELEMENT_NODE, null);
        parent.appendChild(child1);
        parent.appendChild(child2);

        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.US);
        NodeTest nodeNameTest = new NodeNameTest(new QName("child1"));

        NodeIterator iterator = parentPointer.childIterator(nodeNameTest, false, null);
        assertNotNull("Child iterator should not be null", iterator);

        assertTrue("Iterator should have a first element", iterator.setPosition(1));
        assertEquals("First element should be child1", child1, iterator.getNodePointer().getImmediateNode());

        assertTrue("Iterator should have a second element", iterator.setPosition(2));
        assertEquals("Second element should be child2", child2, iterator.getNodePointer().getImmediateNode());

        assertFalse("Iterator should not have a third element", iterator.setPosition(3));
    }

    @Test
    public void testAttributeIterator() throws Exception {
        MockNode element = createMockDOM("element");
        MockAttr attr1 = new MockAttr("attr1", "value1");
        attr1.setNodeName("attr1");
        MockAttr attr2 = new MockAttr("attr2", "value2");
        attr2.setNodeName("attr2");
        element.getAttributes().setNamedItem(attr1);
        element.getAttributes().setNamedItem(attr2);

        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);
        QName attrName = new QName("attr1");

        NodeIterator iterator = elementPointer.attributeIterator(attrName);
        assertNotNull("Attribute iterator should not be null", iterator);

        assertTrue("Iterator should have a first element", iterator.setPosition(1));
        assertEquals("First attribute should be attr1", attr1, iterator.getNodePointer().getImmediateNode());
        assertEquals("First attribute name", "attr1", iterator.getNodePointer().getName().getName());

        assertFalse("Iterator should not have a second element for this name", iterator.setPosition(2));
    }

    @Test
    public void testNamespacePointer() throws Exception {
        MockNode element = createMockDOM("element");
        // Add a namespace attribute
        MockAttr xmlnsAttr = new MockAttr("xmlns:ns", "http://example.com/ns");
        xmlnsAttr.setNodeName("xmlns:ns");
        xmlnsAttr.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        element.getAttributes().setNamedItem(xmlnsAttr);

        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);
        NodePointer nsPointer = elementPointer.namespacePointer("ns");
        assertNotNull("Namespace pointer should not be null", nsPointer);
        assertEquals("Namespace pointer name should be 'ns'", "ns", nsPointer.getName().getName());
        assertEquals("Namespace pointer value should be the URI", "http://example.com/ns", nsPointer.getValue());
    }

    @Test
    public void testNamespaceIterator() throws Exception {
        MockNode element = createMockDOM("element");
        // Add namespace attributes
        MockAttr xmlnsAttr1 = new MockAttr("xmlns:ns1", "http://example.com/ns1");
        xmlnsAttr1.setNodeName("xmlns:ns1");
        xmlnsAttr1.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        element.getAttributes().setNamedItem(xmlnsAttr1);
        MockAttr xmlnsAttr2 = new MockAttr("xmlns:ns2", "http://example.com/ns2");
        xmlnsAttr2.setNodeName("xmlns:ns2");
        xmlnsAttr2.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        element.getAttributes().setNamedItem(xmlnsAttr2);
        // Add a default namespace
        MockAttr defaultNsAttr = new MockAttr("xmlns", "http://example.com/default");
        defaultNsAttr.setNodeName("xmlns");
        defaultNsAttr.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        element.getAttributes().setNamedItem(defaultNsAttr);

        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);
        NodeIterator nsIterator = elementPointer.namespaceIterator();

        assertTrue("Namespace iterator should have a position", nsIterator.setPosition(1));
        assertEquals("First namespace name should be 'ns1'", "ns1", nsIterator.getNodePointer().getName().getName());
        assertEquals("First namespace value", "http://example.com/ns1", nsIterator.getNodePointer().getValue());

        assertTrue("Namespace iterator should have a second position", nsIterator.setPosition(2));
        assertEquals("Second namespace name should be 'ns2'", "ns2", nsIterator.getNodePointer().getName().getName());
        assertEquals("Second namespace value", "http://example.com/ns2", nsIterator.getNodePointer().getValue());

        assertTrue("Namespace iterator should have a third position for default", nsIterator.setPosition(3));
        assertEquals("Third namespace name should be empty", "", nsIterator.getNodePointer().getName().getName());
        assertEquals("Third namespace value", "http://example.com/default", nsIterator.getNodePointer().getValue());

        assertFalse("Namespace iterator should not have a fourth position", nsIterator.setPosition(4));
    }

    @Test
    public void testCreateChild_Success() throws Exception {
        MockNode parent = createMockDOM("parent");
        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.US);

        // Mock AbstractFactory to return true for createObject
        AbstractFactory mockFactory = new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext context, NodePointer pointer, Object parent, String name, int index) {
                if (name.equals("newChild") && index == 0) {
                    Node newNode = new MockNode(name, Node.ELEMENT_NODE, null);
                    newNode.setOwnerDocument(parent.getOwnerDocument());
                    ((Node)parent).appendChild(newNode);
                    return true;
                }
                return false;
            }

            @Override
            public boolean createObject(JXPathContext context, NodePointer pointer, Object parent, QName name, int index) {
                 return createObject(context, pointer, parent, name.toString(), index);
            }
        };

        JXPathContext context = JXPathContext.newContext(parent);
        context.setFactory(mockFactory);
        QName childName = new QName("newChild");

        NodePointer createdPointer = parentPointer.createChild(context, childName, 0);

        assertNotNull("Created child pointer should not be null", createdPointer);
        assertTrue("Created pointer should be DOMNodePointer", createdPointer instanceof DOMNodePointer);
        assertEquals("Created child node name", "newChild", createdPointer.getName().getName());
        assertEquals("Parent should now have one child", 1, ((MockNode)parent).getChildNodes().getLength());
        assertEquals("Child node name", "newChild", ((MockNode)parent).getChildNodes().item(0).getNodeName());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_Failure() throws Exception {
        MockNode parent = createMockDOM("parent");
        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.US);

        // Mock AbstractFactory to return false for createObject
        AbstractFactory mockFactory = new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext context, NodePointer pointer, Object parent, String name, int index) {
                return false;
            }
             @Override
            public boolean createObject(JXPathContext context, NodePointer pointer, Object parent, QName name, int index) {
                 return createObject(context, pointer, parent, name.toString(), index);
            }
        };

        JXPathContext context = JXPathContext.newContext(parent);
        context.setFactory(mockFactory);
        QName childName = new QName("newChild");

        parentPointer.createChild(context, childName, 0);
    }
    
    @Test
    public void testCreateAttribute_ElementNode() throws Exception {
        MockNode element = createMockDOM("element");
        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);

        JXPathContext context = JXPathContext.newContext(element);
        QName attrName = new QName("myAttr");

        NodePointer attrPointer = elementPointer.createAttribute(context, attrName);
        
        assertNotNull("Attribute pointer should not be null", attrPointer);
        assertTrue("Attribute pointer should be DOMNodePointer", attrPointer instanceof DOMNodePointer);
        assertEquals("Attribute name", "myAttr", attrPointer.getName().getName());
        assertEquals("Attribute value should be empty string", "", attrPointer.getValue());
        assertTrue("Element should have the attribute", element.hasAttributes());
        assertNotNull("Attribute node should exist", element.getAttributes().getNamedItem("myAttr"));
    }

    @Test
    public void testCreateAttribute_WithNamespace() throws Exception {
        MockNode element = createMockDOM("element");
        element.setNamespaceURI("http://example.com"); // Element belongs to a namespace
        
        // Need a NamespaceResolver for getNamespaceURI(prefix) to work correctly inside createAttribute
        JXPathContext context = JXPathContext.newContext(element);
        org.apache.commons.jxpath.ri.NamespaceResolver nsResolver = new org.apache.commons.jxpath.ri.NamespaceResolver();
        // Assume 'custom' prefix maps to 'http://example.com'
        nsResolver.registerNamespace("custom", "http://example.com");
        context.setNamespaceResolver(nsResolver);

        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);
        elementPointer.setNamespaceResolver(nsResolver); // Also set on pointer for getNamespaceURI calls
        
        QName attrName = new QName("custom", "myAttr"); // Attribute with prefix

        NodePointer attrPointer = elementPointer.createAttribute(context, attrName);
        
        assertNotNull("Attribute pointer should not be null", attrPointer);
        assertTrue("Attribute pointer should be DOMNodePointer", attrPointer instanceof DOMNodePointer);
        assertEquals("Attribute name", "myAttr", attrPointer.getName().getName());
        assertEquals("Attribute prefix", "custom", attrPointer.getName().getPrefix());
        assertEquals("Attribute value should be empty string", "", attrPointer.getValue());

        String nsURI = element.getAttributeNS("http://example.com", "myAttr");
        assertNotNull("Attribute should have namespace URI", nsURI);
        assertEquals("Attribute namespace URI mismatch", "http://example.com", nsURI);
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_UnknownNamespacePrefix() throws Exception {
        MockNode element = createMockDOM("element");
        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);

        JXPathContext context = JXPathContext.newContext(element);
        QName attrName = new QName("unknownPrefix", "myAttr"); // Unknown prefix

        elementPointer.createAttribute(context, attrName);
    }

    @Test
    public void testHashCode() {
        MockNode node1 = new MockNode("element1", Node.ELEMENT_NODE, null);
        MockNode node2 = new MockNode("element2", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);
        DOMNodePointer pointer3 = new DOMNodePointer(node1, Locale.US); // Same node as pointer1

        assertNotEquals("Hash codes for different nodes should be different", pointer1.hashCode(), pointer2.hashCode());
        assertEquals("Hash codes for same node should be the same", pointer1.hashCode(), pointer3.hashCode());
    }
}
```