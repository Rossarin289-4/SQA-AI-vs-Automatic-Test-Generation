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

public class DOMNodePointerTest {
    @Test
    public void testValueAndLeafForConfiguredElement() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        d.appendChild(root);
        root.appendChild(d.createTextNode(" first "));
        Element child = d.createElement("child");
        child.appendChild(d.createTextNode("second"));
        root.appendChild(child);

        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        assertEquals("first second", p.getValue());
        assertFalse(p.isLeaf());
        assertEquals(root, p.getBaseValue());
        assertEquals(root, p.getImmediateNode());
        assertTrue(p.isActual());
        assertFalse(p.isCollection());
        assertEquals(1, p.getLength());
    }

    @Test
    public void testValueTrimsTextNode() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Node text = d.createTextNode("  x  ");
        DOMNodePointer p = new DOMNodePointer(text, Locale.ROOT);
        assertEquals("x", p.getValue());
        assertTrue(p.isLeaf());
    }

    @Test
    public void testValueForCommentAndProcessingInstruction() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        DOMNodePointer comment = new DOMNodePointer(d.createComment("  note  "), Locale.ROOT);
        DOMNodePointer pi = new DOMNodePointer(d.createProcessingInstruction("go", "  now  "), Locale.ROOT);
        assertEquals("note", comment.getValue());
        assertEquals("now", pi.getValue());
    }

    @Test
    public void testSetElementValueReplacesChildrenWithText() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.appendChild(d.createElement("old"));
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        p.setValue("new");
        assertEquals("new", p.getValue());
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals(Node.TEXT_NODE, root.getFirstChild().getNodeType());
    }

    @Test
    public void testSetTextValueAndRemoveEmptyText() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        d.appendChild(root);
        Node text = d.createTextNode("old");
        root.appendChild(text);
        DOMNodePointer p = new DOMNodePointer(text, Locale.ROOT);
        p.setValue("new");
        assertEquals("new", text.getNodeValue());
        p.setValue("");
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testDefaultAndPrefixedNamespaces() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.setAttribute("xmlns", "urn:default");
        root.setAttribute("xmlns:p", "urn:p");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        assertEquals("urn:default", p.getDefaultNamespaceURI());
        assertEquals("urn:p", p.getNamespaceURI("p"));
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, p.getNamespaceURI("xml"));
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, p.getNamespaceURI("xmlns"));
        assertNull(p.getNamespaceURI("missing"));
    }

    @Test
    public void testNoDefaultNamespace() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        d.appendChild(root);
        assertNull(new DOMNodePointer(root, Locale.ROOT).getDefaultNamespaceURI());
    }

    @Test
    public void testStaticNameHelpersAndElementName() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element e = d.createElementNS("urn:sample", "p:item");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertEquals("p", DOMNodePointer.getPrefix(e));
        assertEquals("item", DOMNodePointer.getLocalName(e));
        assertEquals("p", p.getName().getPrefix());
        assertEquals("item", p.getName().getName());
    }

    @Test
    public void testTestNodeTypesAndName() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element e = d.createElement("item");
        Node text = d.createTextNode("x");
        Node comment = d.createComment("x");
        Node pi = d.createProcessingInstruction("go", "x");
        assertTrue(DOMNodePointer.testNode(e, null));
        assertTrue(DOMNodePointer.testNode(e, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        assertFalse(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        assertTrue(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        assertTrue(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("go")));
        assertFalse(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("other")));
        assertTrue(DOMNodePointer.testNode(e, new NodeNameTest(new QName("item"), null)));
    }

    @Test
    public void testChildAndAttributeIterators() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element child = d.createElement("child");
        root.appendChild(child);
        root.setAttribute("a", "v");
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        NodeIterator children = p.childIterator(null, false, null);
        assertTrue(children.setPosition(1));
        assertEquals(child, children.getNodePointer().getBaseValue());
        NodeIterator attrs = p.attributeIterator(new QName("a"));
        assertTrue(attrs.setPosition(1));
        assertEquals("v", attrs.getNodePointer().getValue());
    }

    @Test
    public void testCreateAttributeAndReadValue() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        NodePointer attr = p.createAttribute(JXPathContext.newContext(root), new QName("a"));
        assertEquals("", attr.getValue());
        assertTrue(root.hasAttribute("a"));
    }

    @Test
    public void testRemoveChildAndRejectRootRemoval() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element child = d.createElement("child");
        root.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(new DOMNodePointer(root, Locale.ROOT), child);
        childPointer.remove();
        assertEquals(0, root.getChildNodes().getLength());

        try {
            new DOMNodePointer(d, Locale.ROOT).remove();
            fail("expected JXPathException");
        } catch (JXPathException expected) {
        }
    }

    @Test
    public void testAsPathUsesExplicitIdAndEscapesQuotes() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT, "a'b\"c");
        assertEquals("id('a&apos;b&quot;c')", p.asPath());
    }

    @Test
    public void testPointerEqualityUsesUnderlyingNodeIdentity() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element e = d.createElement("item");
        DOMNodePointer a = new DOMNodePointer(e, Locale.ROOT);
        DOMNodePointer b = new DOMNodePointer(e, Locale.ROOT);
        DOMNodePointer c = new DOMNodePointer(d.createElement("item"), Locale.ROOT);
        assertEquals(a, b);
        assertNotEquals(a, c);
        assertEquals(System.identityHashCode(e), a.hashCode());
    }

    @Test
    public void testCompareChildOrder() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element first = d.createElement("first");
        Element second = d.createElement("second");
        root.appendChild(first);
        root.appendChild(second);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        NodePointer a = new DOMNodePointer(p, first);
        NodePointer b = new DOMNodePointer(p, second);
        assertEquals(-1, p.compareChildNodePointers(a, b));
        assertEquals(1, p.compareChildNodePointers(b, a));
        assertEquals(0, p.compareChildNodePointers(a, a));
    }

    @Test
    public void testLanguageUsesAncestorAndCaseInsensitivePrefix() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = d.createElement("child");
        root.appendChild(child);
        DOMNodePointer p = new DOMNodePointer(child, Locale.ROOT);
        assertTrue(p.isLanguage("EN"));
        assertFalse(p.isLanguage("fr"));
    }

    @Test
    public void testGetPointerByMissingIdReturnsNullPointer() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        d.appendChild(root);
        Pointer ptr = new DOMNodePointer(d, Locale.ROOT).getPointerByID(JXPathContext.newContext(d), "absent");
        assertTrue(ptr instanceof NullPointer);
    }

    @Test
    public void testNamespacePointerUsesRequestedPrefix() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.setAttribute("xmlns:p", "urn:p");
        d.appendChild(root);
        DOMNodePointer parent = new DOMNodePointer(root, Locale.ROOT);
        NodePointer namespace = parent.namespacePointer("p");
        assertEquals("urn:p", namespace.getValue());
    }

    @Test
    public void testNamespacePointerForUnknownPrefix() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        d.appendChild(root);
        NodePointer namespace = new DOMNodePointer(root, Locale.ROOT)
                .namespacePointer("missing");
        assertNull(namespace.getValue());
    }

    @Test
    public void testNamespaceIteratorReturnsDeclaredNamespace() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.setAttribute("xmlns:p", "urn:p");
        d.appendChild(root);
        DOMNodePointer parent = new DOMNodePointer(root, Locale.ROOT);
        NodeIterator iterator = parent.namespaceIterator();
        assertTrue(iterator.setPosition(1));
        assertEquals("urn:p", iterator.getNodePointer().getValue());
    }

    @Test
    public void testNamespaceIteratorHasNoPositionAfterAvailableEntries() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.setAttribute("xmlns:p", "urn:p");
        d.appendChild(root);
        NodeIterator iterator = new DOMNodePointer(root, Locale.ROOT)
                .namespaceIterator();
        assertTrue(iterator.setPosition(1));
        assertFalse(iterator.setPosition(100));
    }

    @Test
    public void testCreateChildWithoutFactoryThrows() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        JXPathContext context = JXPathContext.newContext(root);
        try {
            new DOMNodePointer(root, Locale.ROOT).createChild(
                    context, new QName("child"), 0);
            fail("expected JXPathException");
        } catch (JXPathException expected) {
            assertEquals(JXPathException.class, expected.getClass());
        }
    }

    @Test
    public void testCreateChildFactoryFailureThrowsAbstractFactoryException() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext c, Pointer pointer,
                    Object parent, String name, int index) {
                return false;
            }
        });
        try {
            new DOMNodePointer(root, Locale.ROOT).createChild(
                    context, new QName("child"), 0);
            fail("expected JXPathAbstractFactoryException");
        } catch (JXPathAbstractFactoryException expected) {
            assertEquals(JXPathAbstractFactoryException.class, expected.getClass());
        }
    }

    @Test
    public void testEqualsNullAndOtherType() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);
        assertFalse(pointer.equals(null));
        assertFalse(pointer.equals("root"));
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEqualsDistinctPointersForSameNode() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        DOMNodePointer first = new DOMNodePointer(root, Locale.ROOT);
        DOMNodePointer second = new DOMNodePointer(root, Locale.ROOT, "id");
        assertTrue(first.equals(second));
        assertTrue(second.equals(first));
    }
}
