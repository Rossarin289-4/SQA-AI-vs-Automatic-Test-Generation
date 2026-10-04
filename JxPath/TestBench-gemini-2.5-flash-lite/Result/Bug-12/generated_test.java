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
import org.w3c.dom.DocumentType;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;
import org.w3c.dom.DOMImplementation;

public class DOMNodePointerTest {

    // Mock DOM Node and Document for testing



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
            return attributes.get(localName); 
        }
        @Override public Node setNamedItemNS(Node arg) { return setNamedItem(arg); }
        @Override public Node removeNamedItemNS(String namespaceURI, String localName) { return removeNamedItem(localName); }
    }


    // Helper method to create a basic DOM structure





































    @Test
    public void testAsPath_ElementNode() throws Exception {
        MockNode root = createMockDOM("root");
        MockNode child = new MockNode("child", Node.ELEMENT_NODE, null);
        root.appendChild(child);
        child.setOwnerDocument(root.getOwnerDocument());

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        assertEquals("Path for a simple child element", "/root[1]/child[1]", pointer.asPath());
    }

    @Test
    public void testAsPath_TextNode() throws Exception {
        MockNode root = createMockDOM("root");
        MockNode textNode = new MockNode("#text", Node.TEXT_NODE, "some text");
        root.appendChild(textNode);
        textNode.setOwnerDocument(root.getOwnerDocument());

        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        assertEquals("Path for a text node", "/root[1]/text()[1]", pointer.asPath());
    }

    @Test
    public void testAsPath_ProcessingInstructionNode() throws Exception {
        MockNode root = createMockDOM("root");
        MockNode piNode = new MockNode("target", Node.PROCESSING_INSTRUCTION_NODE, "data");
        root.appendChild(piNode);
        piNode.setOwnerDocument(root.getOwnerDocument());

        DOMNodePointer pointer = new DOMNodePointer(piNode, Locale.US);
        assertEquals("Path for a PI node", "/root[1]/processing-instruction('target')[1]", pointer.asPath());
    }

    @Test
    public void testAsPath_WithId() throws Exception {
        MockNode root = createMockDOM("root");
        MockNode pointerTarget = new MockNode("target", Node.ELEMENT_NODE, null);
        root.appendChild(pointerTarget);
        pointerTarget.setOwnerDocument(root.getOwnerDocument());
        
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
        node.setPrefix(null); 
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
        node.setNamespaceURI(null); 

        MockNamedNodeMap parentAttributes = new MockNamedNodeMap();
        MockAttr xmlnsAttr = new MockAttr("xmlns:ns", "http://example.com");
        xmlnsAttr.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        parentAttributes.setNamedItem(xmlnsAttr);
        ((MockNode)parent).setAttributes(parentAttributes);
        node.setParentNode(parent); 

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
        ((MockNode)parent).getChildNodes().addNode(text); 

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
        text1.setOwnerDocument(parent.getOwnerDocument());
        text2.setOwnerDocument(parent.getOwnerDocument());

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
        comment.setOwnerDocument(parent.getOwnerDocument());
        text.setOwnerDocument(parent.getOwnerDocument());

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
        root.appendChild(element); 
        element.setOwnerDocument(root.getOwnerDocument());

        JXPathContext context = JXPathContext.newContext(root.getOwnerDocument());
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.US); 
        
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
        MockNode node2 = node1; 

        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);

        assertEquals("Comparing the same node pointer should return 0", 0, pointer1.compareChildNodePointers(pointer1, pointer2));
    }

    @Test
    public void testCompareChildNodePointers_DifferentNodes() throws Exception {
        MockNode node1 = new MockNode("element1", Node.ELEMENT_NODE, null);
        MockNode node2 = new MockNode("element2", Node.ELEMENT_NODE, null);

        MockNode parent = new MockNode("parent", Node.ELEMENT_NODE, null);
        parent.appendChild(node1); 
        parent.appendChild(node2);
        node1.setOwnerDocument(parent.getOwnerDocument());
        node2.setOwnerDocument(parent.getOwnerDocument());

        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.US);
        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);

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
        element.setOwnerDocument(createMockDOM("root").getOwnerDocument());
        attr.setOwnerDocument(element.getOwnerDocument());

        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);
        DOMNodePointer attrPointer = new DOMNodePointer(attr, Locale.US);

        int result = elementPointer.compareChildNodePointers(attrPointer, elementPointer);
        assertTrue("Attribute should come before element", result < 0);

        result = elementPointer.compareChildNodePointers(elementPointer, attrPointer);
        assertTrue("Element should come after attribute", result > 0);
    }

    @Test
    public void testChildIterator() throws Exception {
        MockNode parent = createMockDOM("parent");
        MockNode child1 = new MockNode("child1", Node.ELEMENT_NODE, null);
        MockNode child2 = new MockNode("child2", Node.ELEMENT_NODE, null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        child1.setOwnerDocument(parent.getOwnerDocument());
        child2.setOwnerDocument(parent.getOwnerDocument());


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
        attr1.setOwnerDocument(element.getOwnerDocument());
        attr2.setOwnerDocument(element.getOwnerDocument());

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
        MockAttr xmlnsAttr = new MockAttr("xmlns:ns", "http://example.com/ns");
        xmlnsAttr.setNodeName("xmlns:ns");
        xmlnsAttr.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        element.getAttributes().setNamedItem(xmlnsAttr);
        xmlnsAttr.setOwnerDocument(element.getOwnerDocument());

        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);
        NodePointer nsPointer = elementPointer.namespacePointer("ns");
        assertNotNull("Namespace pointer should not be null", nsPointer);
        assertEquals("Namespace pointer name should be 'ns'", "ns", nsPointer.getName().getName());
        assertEquals("Namespace pointer value should be the URI", "http://example.com/ns", nsPointer.getValue());
    }

    @Test
    public void testNamespaceIterator() throws Exception {
        MockNode element = createMockDOM("element");
        MockAttr xmlnsAttr1 = new MockAttr("xmlns:ns1", "http://example.com/ns1");
        xmlnsAttr1.setNodeName("xmlns:ns1");
        xmlnsAttr1.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        element.getAttributes().setNamedItem(xmlnsAttr1);
        MockAttr xmlnsAttr2 = new MockAttr("xmlns:ns2", "http://example.com/ns2");
        xmlnsAttr2.setNodeName("xmlns:ns2");
        xmlnsAttr2.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        element.getAttributes().setNamedItem(xmlnsAttr2);
        MockAttr defaultNsAttr = new MockAttr("xmlns", "http://example.com/default");
        defaultNsAttr.setNodeName("xmlns");
        defaultNsAttr.setNamespaceURI(DOMNodePointer.XMLNS_NAMESPACE_URI);
        element.getAttributes().setNamedItem(defaultNsAttr);
        xmlnsAttr1.setOwnerDocument(element.getOwnerDocument());
        xmlnsAttr2.setOwnerDocument(element.getOwnerDocument());
        defaultNsAttr.setOwnerDocument(element.getOwnerDocument());


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
        element.setNamespaceURI("http://example.com"); 
        
        JXPathContext context = JXPathContext.newContext(element);
        org.apache.commons.jxpath.ri.NamespaceResolver nsResolver = new org.apache.commons.jxpath.ri.NamespaceResolver();
        nsResolver.registerNamespace("custom", "http://example.com");
        context.setNamespaceResolver(nsResolver);

        DOMNodePointer elementPointer = new DOMNodePointer(element, Locale.US);
        elementPointer.setNamespaceResolver(nsResolver);
        
        QName attrName = new QName("custom", "myAttr"); 

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
        QName attrName = new QName("unknownPrefix", "myAttr"); 

        elementPointer.createAttribute(context, attrName);
    }

    @Test
    public void testHashCode() {
        MockNode node1 = new MockNode("element1", Node.ELEMENT_NODE, null);
        MockNode node2 = new MockNode("element2", Node.ELEMENT_NODE, null);
        DOMNodePointer pointer1 = new DOMNodePointer(node1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(node2, Locale.US);
        DOMNodePointer pointer3 = new DOMNodePointer(node1, Locale.US); 

        assertNotEquals("Hash codes for different nodes should be different", pointer1.hashCode(), pointer2.hashCode());
        assertEquals("Hash codes for same node should be the same", pointer1.hashCode(), pointer3.hashCode());
    }
}





