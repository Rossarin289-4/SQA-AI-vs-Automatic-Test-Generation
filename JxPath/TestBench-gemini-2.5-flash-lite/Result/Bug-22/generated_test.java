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


    @Override
    public Element getDocumentElement() {
        return rootElement;
    }

    @Override
    public Element getElementById(String id) {
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



}

class MockElement extends MockNode implements Element {
    private String name;
    private String namespaceURI;
    private String prefix;
    private String localName;
    private NamedNodeMap attributes = new MockNamedNodeMap();
    private NodeList children = new MockNodeList();


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
}

class MockAttr implements Attr {
    private String name;
    private String value;
    private Node ownerElement;
    private String namespaceURI;
    private String prefix;
    private String localName;
    private Document ownerDocument;


    public void setNamespaceURI(String namespaceURI) { this.namespaceURI = namespaceURI; }
    public void setLocalName(String localName) { this.localName = localName; }
    public void setPrefix(String prefix) { this.prefix = prefix; }

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
        nodes.put(arg.getNodeName(), arg);
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


    // Implementations for methods not directly used in tests or simplified
}

class MockProcessingInstruction extends MockNode implements ProcessingInstruction {
    private String target;
    private String data;

    MockProcessingInstruction(String target, String data, Document ownerDocument) {
        super(ownerDocument);
        this.target = target;
        this.data = data;
    }

}

class MockComment extends MockNode implements Comment {
    private String data;

    MockComment(String data, Document ownerDocument) {
        super(ownerDocument);
        this.data = data;
    }

}

class MockTextNode extends MockNode implements Text {
    private String data;

    MockTextNode(String data, Document ownerDocument) {
        super(ownerDocument);
        this.data = data;
    }

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
    public Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype) {
        return null;
    }

}


public class DOMNodePointerTest {

    // Helper method to create a mock DOM structure
    private DOMNodePointer createDOMNodePointer(Node node) {
        return new DOMNodePointer(node, Locale.ENGLISH);
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
    public void testGetNameForPI() throws Exception {
        Document doc = new MockDocument();
        ProcessingInstruction pi = new MockProcessingInstruction("target", "data", doc);
        DOMNodePointer pointer = createDOMNodePointer(pi);
        QName name = pointer.getName();
        assertEquals("target", name.getName());
        assertNull(name.getPrefix());
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





