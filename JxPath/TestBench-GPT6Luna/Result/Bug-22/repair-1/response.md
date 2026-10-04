```java
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
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;

public class DOMNodePointerTest {

    @Test
    public void testBasicsAndLeafState() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        assertSame(root, pointer.getBaseValue());
        assertSame(root, pointer.getImmediateNode());
        assertTrue(pointer.isActual());
        assertFalse(pointer.isCollection());
        assertEquals(1, pointer.getLength());
        assertTrue(pointer.isLeaf());
        root.appendChild(document.createElement("child"));
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testQNameAndStaticNameParts() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElementNS("urn:sample", "p:item");
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);

        assertEquals("p", pointer.getName().getPrefix());
        assertEquals("item", pointer.getName().getName());
        assertEquals("p", DOMNodePointer.getPrefix(element));
        assertEquals("item", DOMNodePointer.getLocalName(element));
        assertEquals("urn:sample", pointer.getNamespaceURI());
    }

    @Test
    public void testUnprefixedQNameParts() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("item");

        assertNull(DOMNodePointer.getPrefix(element));
        assertEquals("item", DOMNodePointer.getLocalName(element));
        assertNull(DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testNodeTypeTests() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        Node text = document.createTextNode("x");
        Node comment = document.createComment("x");
        ProcessingInstruction pi = document.createProcessingInstruction("go", "x");

        assertTrue(DOMNodePointer.testNode(text,
                new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(DOMNodePointer.testNode(comment,
                new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        assertTrue(DOMNodePointer.testNode(pi,
                new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        assertTrue(DOMNodePointer.testNode(root,
                new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        assertFalse(DOMNodePointer.testNode(root,
                new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(DOMNodePointer.testNode(root, null));
    }

    @Test
    public void testProcessingInstructionTargetTest() throws Exception {
        ProcessingInstruction pi =
                javax.xml.parsers.DocumentBuilderFactory.newInstance()
                        .newDocumentBuilder().newDocument()
                        .createProcessingInstruction("go", "data");

        assertTrue(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("go")));
        assertFalse(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("stop")));
    }

    @Test
    public void testNodeNameTest() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElementNS("urn:sample", "p:item");

        assertTrue(DOMNodePointer.testNode(element,
                new NodeNameTest(new QName("p", "item"), "urn:sample")));
        assertFalse(DOMNodePointer.testNode(element,
                new NodeNameTest(new QName("p", "other"), "urn:sample")));
    }

    @Test
    public void testNamespaceLookupsIncludingReservedPrefixes() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        root.setAttribute("xmlns:p", "urn:p");
        root.setAttribute("xmlns", "urn:default");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        assertEquals("urn:p", pointer.getNamespaceURI("p"));
        assertEquals("urn:default", pointer.getDefaultNamespaceURI());
        assertEquals("urn:default", pointer.getNamespaceURI());
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
        assertNull(pointer.getNamespaceURI("missing"));
    }

    @Test
    public void testNamespaceResolverCachesOnPointer() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        assertSame(pointer.getNamespaceResolver(), pointer.getNamespaceResolver());
    }

    @Test
    public void testValueAndXmlSpacePreserve() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        root.setAttribute("xml:space", "preserve");
        root.appendChild(document.createTextNode("  text  "));
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        assertEquals("  text  ", pointer.getValue());
    }

    @Test
    public void testCommentValueIsTrimmed() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Comment comment = document.createComment("  note  ");
        DOMNodePointer pointer = new DOMNodePointer(comment, Locale.ROOT);

        assertEquals("note", pointer.getValue());
    }

    @Test
    public void testSetTextValueAndRemoveOnEmpty() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        Node text = document.createTextNode("old");
        root.appendChild(text);
        DOMNodePointer pointer = new DOMNodePointer(text, Locale.ROOT);

        pointer.setValue("new");
        assertEquals("new", text.getNodeValue());
        pointer.setValue("");
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testSetElementTextContents() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        root.appendChild(document.createElement("old"));
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        pointer.setValue("replacement");
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("replacement", root.getTextContent());
    }

    @Test
    public void testSetElementFromElementClonesChildren() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        Element source = document.createElement("source");
        source.appendChild(document.createElement("child"));
        root.appendChild(document.createElement("old"));
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        pointer.setValue(source);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("child", root.getFirstChild().getNodeName());
        assertNull(source.getParentNode());
    }

    @Test
    public void testAttributeCreationReturnsAttachedAttributePointer() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        NodePointer attributePointer = pointer.createAttribute(null, new QName("key"));
        assertEquals("", root.getAttribute("key"));
        assertSame(root.getAttributeNode("key"), attributePointer.getBaseValue());
    }

    @Test
    public void testCreateAttributeRejectsUnknownPrefix() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        try {
            pointer.createAttribute(null, new QName("unknown", "key"));
            fail("expected JXPathException");
        }
        catch (JXPathException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testRemoveAttachedNode() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ROOT);

        pointer.remove();
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testRemoveRootThrows() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        DOMNodePointer pointer = new DOMNodePointer(document, Locale.ROOT);

        try {
            pointer.remove();
            fail("expected JXPathException");
        }
        catch (JXPathException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testPathForTextAndExplicitId() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        Node text = document.createTextNode("x");
        root.appendChild(text);
        DOMNodePointer textPointer = new DOMNodePointer(text, Locale.ROOT);
        DOMNodePointer idPointer = new DOMNodePointer(root, Locale.ROOT, "abc");

        assertEquals("/text()[1]", textPointer.asPath());
        assertEquals("id('abc')", idPointer.asPath());
    }

    @Test
    public void testPointerIdentityEqualityAndHash() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        DOMNodePointer first = new DOMNodePointer(element, Locale.ROOT);
        DOMNodePointer sameNode = new DOMNodePointer(element, Locale.ROOT);
        DOMNodePointer other = new DOMNodePointer(document.createElement("root"), Locale.ROOT);

        assertEquals(first, sameNode);
        assertEquals(first.hashCode(), sameNode.hashCode());
        assertNotEquals(first, other);
    }

    @Test
    public void testCompareChildNodeOrder() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element parent = document.createElement("parent");
        Element first = document.createElement("first");
        Element second = document.createElement("second");
        parent.appendChild(first);
        parent.appendChild(second);
        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.ROOT);
        DOMNodePointer firstPointer = new DOMNodePointer(parentPointer, first);
        DOMNodePointer secondPointer = new DOMNodePointer(parentPointer, second);

        assertTrue(parentPointer.compareChildNodePointers(firstPointer, secondPointer) < 0);
        assertTrue(parentPointer.compareChildNodePointers(secondPointer, firstPointer) > 0);
        assertEquals(0, parentPointer.compareChildNodePointers(firstPointer, firstPointer));
    }

    @Test
    public void testLanguageMatchingCaseInsensitively() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ROOT);

        assertTrue(pointer.isLanguage("EN"));
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testChildIteratorNameFilterAndPosition() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        Element first = document.createElement("item");
        Element other = document.createElement("other");
        Element last = document.createElement("item");
        root.appendChild(first);
        root.appendChild(other);
        root.appendChild(last);
        DOMNodePointer parent = new DOMNodePointer(root, Locale.ROOT);
        NodeTest test = new NodeNameTest(new QName("item"), null);
        NodeIterator iterator = parent.childIterator(test, false, null);

        assertTrue(iterator.setPosition(1));
        assertSame(first, iterator.getNodePointer().getBaseValue());
        assertTrue(iterator.setPosition(2));
        assertSame(last, iterator.getNodePointer().getBaseValue());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testChildIteratorReverseOrder() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        Element first = document.createElement("first");
        Element second = document.createElement("second");
        root.appendChild(first);
        root.appendChild(second);
        NodeIterator iterator =
                new DOMNodePointer(root, Locale.ROOT).childIterator(null, true, null);

        assertTrue(iterator.setPosition(1));
        assertSame(second, iterator.getNodePointer().getBaseValue());
    }

    @Test
    public void testAttributeIteratorFindsAttachedAttribute() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        root.setAttribute("key", "value");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);
        NodeIterator iterator = pointer.attributeIterator(new QName("key"));

        assertTrue(iterator.setPosition(1));
        assertSame(root.getAttributeNode("key"), iterator.getNodePointer().getBaseValue());
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testNamespacePointerAndNamespaceIterator() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        root.setAttribute("xmlns:p", "urn:p");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);

        NodePointer namespace = pointer.namespacePointer("p");
        assertEquals("urn:p", namespace.getValue());
        NodeIterator iterator = pointer.namespaceIterator();
        boolean found = false;
        for (int position = 1; iterator.setPosition(position); position++) {
            NodePointer current = iterator.getNodePointer();
            if ("p".equals(current.getName().getName())) {
                assertEquals("urn:p", current.getValue());
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testGetPointerByIDMissingID() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(document, Locale.ROOT);
        Pointer result = pointer.getPointerByID(JXPathContext.newContext(document), "missing");

        assertNotNull(result);
        assertSame(document, pointer.getBaseValue());
    }

    @Test
    public void testCreateChildWithoutFactoryThrows() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ROOT);
        JXPathContext context = JXPathContext.newContext(document);

        try {
            pointer.createChild(context, new QName("child"), 0);
            fail("expected JXPathAbstractFactoryException");
        }
        catch (JXPathAbstractFactoryException expected) {
            assertEquals(0, root.getChildNodes().getLength());
        }
    }

    @Test
    public void testDocumentPointerEqualsSameDocument() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        DOMNodePointer first = new DOMNodePointer(document, Locale.ROOT);
        DOMNodePointer second = new DOMNodePointer(document, Locale.ROOT);

        assertTrue(first.equals(second));
        assertTrue(first.equals(first));
        assertFalse(first.equals(null));
    }
}
```