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
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;

public class DOMNodePointerTest {
    @Test
    public void testBasicPointerState() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        assertSame(root, p.getBaseValue());
        assertSame(root, p.getImmediateNode());
        assertTrue(p.isActual());
        assertFalse(p.isCollection());
        assertEquals(1, p.getLength());
        assertTrue(p.isLeaf());
        assertEquals("", p.getValue());
    }

    @Test
    public void testTestNodeNullAndElementName() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element e = d.createElement("item");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertTrue(p.testNode(null));
        assertTrue(p.testNode(new NodeNameTest(new QName("item"))));
        assertFalse(p.testNode(new NodeNameTest(new QName("other"))));
    }

    @Test
    public void testNodeTypeDistinguishesDocumentAndText() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element e = d.createElement("root");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(d, Locale.ROOT);
        assertTrue(p.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        DOMNodePointer text = new DOMNodePointer(d.createTextNode("x"), Locale.ROOT);
        assertTrue(text.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertFalse(text.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }

    @Test
    public void testCommentTypeTest() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Comment comment = d.createComment("note");
        DOMNodePointer p = new DOMNodePointer(comment, Locale.ROOT);
        assertTrue(p.testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        assertFalse(p.testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));
    }

    @Test
    public void testProcessingInstructionTargetTest() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        ProcessingInstruction pi = d.createProcessingInstruction("go", " data ");
        DOMNodePointer p = new DOMNodePointer(pi, Locale.ROOT);
        assertTrue(p.testNode(new ProcessingInstructionTest("go")));
        assertFalse(p.testNode(new ProcessingInstructionTest("stop")));
        assertEquals("go", p.getName().getName());
    }

    @Test
    public void testNameAndNamespaceHelpers() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element e = d.createElement("p:thing");
        e.setAttribute("xmlns:p", "urn:test");
        assertEquals("p", DOMNodePointer.getPrefix(e));
        assertEquals("thing", DOMNodePointer.getLocalName(e));
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertEquals("urn:test", p.getNamespaceURI());
        assertEquals("p", p.getName().getPrefix());
        assertEquals("thing", p.getName().getName());
    }

    @Test
    public void testNamespaceDefaultsAndReservedPrefixes() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        root.setAttribute("xmlns", "urn:default");
        root.setAttribute("xmlns:q", "urn:q");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        assertEquals("urn:default", p.getDefaultNamespaceURI());
        assertEquals("urn:default", p.getNamespaceURI(""));
        assertEquals("urn:q", p.getNamespaceURI("q"));
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, p.getNamespaceURI("xml"));
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, p.getNamespaceURI("xmlns"));
        assertNull(p.getNamespaceURI("missing"));
    }

    @Test
    public void testLeafValueAndStringMutation() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        Node text = d.createTextNode(" old ");
        root.appendChild(text);
        DOMNodePointer p = new DOMNodePointer(text, Locale.ROOT);
        assertTrue(p.isLeaf());
        assertEquals("old", p.getValue());
        p.setValue("new");
        assertEquals("new", p.getValue());
        assertEquals("new", text.getNodeValue());
    }

    @Test
    public void testEmptyTextValueRemovesTextNode() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        Node text = d.createTextNode("x");
        root.appendChild(text);
        new DOMNodePointer(text, Locale.ROOT).setValue("");
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testSetElementValueReplacesChildren() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        root.appendChild(d.createTextNode("old"));
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        p.setValue("new");
        assertEquals("new", p.getValue());
        assertEquals(1, root.getChildNodes().getLength());
    }

    @Test
    public void testXmlSpacePreserveAndCommentValue() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        root.setAttribute("xml:space", "preserve");
        Node text = d.createTextNode("  x  ");
        root.appendChild(text);
        d.appendChild(root);
        assertEquals("  x  ", new DOMNodePointer(text, Locale.ROOT).getValue());
        assertEquals("note", new DOMNodePointer(d.createComment(" note "), Locale.ROOT).getValue());
    }

    @Test
    public void testAsPathForRootAndSameNameSiblings() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        Element first = d.createElement("item");
        Element second = d.createElement("item");
        root.appendChild(first);
        root.appendChild(second);
        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.ROOT);
        DOMNodePointer secondPointer = new DOMNodePointer(rootPointer, second);
        assertEquals("", rootPointer.asPath());
        assertEquals("/item[2]", secondPointer.asPath());
    }

    @Test
    public void testIdPathEscapesQuotes() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element e = d.createElement("item");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT, "a'b\"c");
        assertEquals("id('a&apos;b&quot;c')", p.asPath());
    }

    @Test
    public void testEqualityUsesNodeIdentity() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element e = d.createElement("item");
        DOMNodePointer p1 = new DOMNodePointer(e, Locale.ROOT);
        DOMNodePointer p2 = new DOMNodePointer(e, Locale.ROOT);
        DOMNodePointer p3 = new DOMNodePointer(d.createElement("item"), Locale.ROOT);
        assertEquals(p1, p2);
        assertNotEquals(p1, p3);
        assertEquals(System.identityHashCode(e), p1.hashCode());
    }

    @Test
    public void testRemoveAttachedNode() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        Element child = d.createElement("child");
        d.appendChild(root);
        root.appendChild(child);
        new DOMNodePointer(child, Locale.ROOT).remove();
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testRemoveDocumentRootThrows() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        try {
            new DOMNodePointer(d, Locale.ROOT).remove();
            fail("expected JXPathException");
        }
        catch (JXPathException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testAttributeAndChildIterators() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        root.setAttribute("id", "v");
        Element child = d.createElement("child");
        root.appendChild(child);
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        NodeIterator ai = p.attributeIterator(new QName("id"));
        assertTrue(ai.setPosition(1));
        assertEquals("v", ai.getNodePointer().getValue());
        NodeIterator ci = p.childIterator(new NodeNameTest(new QName("child")), false, null);
        assertTrue(ci.setPosition(1));
        assertSame(child, ci.getNodePointer().getImmediateNode());
    }

    @Test
    public void testCompareChildOrderAndIdentity() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        Element a = d.createElement("a");
        Element b = d.createElement("b");
        root.appendChild(a);
        root.appendChild(b);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        DOMNodePointer pa = new DOMNodePointer(p, a);
        DOMNodePointer pb = new DOMNodePointer(p, b);
        assertEquals(-1, p.compareChildNodePointers(pa, pb));
        assertEquals(1, p.compareChildNodePointers(pb, pa));
        assertEquals(0, p.compareChildNodePointers(pa, pa));
    }

    @Test
    public void testLanguagePrefixIsCaseInsensitive() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        assertTrue(p.isLanguage("EN"));
        assertFalse(p.isLanguage("fr"));
    }

    @Test
    public void testNamespacePointerAndNamespaceIteratorExist() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        assertNotNull(p.namespacePointer("xml"));
        assertNotNull(p.namespaceIterator());
    }

    @Test
    public void testEqualsSelfSameAndDifferentNode() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element a = d.createElement("a");
        Element b = d.createElement("a");
        DOMNodePointer pa = new DOMNodePointer(a, Locale.ROOT);
        DOMNodePointer same = new DOMNodePointer(a, Locale.ROOT);
        DOMNodePointer different = new DOMNodePointer(b, Locale.ROOT);
        assertTrue(pa.equals(pa));
        assertTrue(pa.equals(same));
        assertFalse(pa.equals(different));
        assertFalse(pa.equals(null));
    }

    @Test
    public void testPointerByIdReturnsNullPointerForMissingId() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(d, Locale.ROOT);
        Pointer result = p.getPointerByID(JXPathContext.newContext(d), "absent");
        assertTrue(result instanceof NullPointer);
    }

    @Test
    public void testPointerByIdFindsRegisteredId() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        Element item = d.createElement("item");
        item.setAttribute("id", "wanted");
        d.appendChild(root);
        root.appendChild(item);
        d.getDocumentElement().setIdAttribute("id", true);
        DOMNodePointer p = new DOMNodePointer(d, Locale.ROOT);
        Pointer result = p.getPointerByID(JXPathContext.newContext(d), "wanted");
        assertSame(item, ((NodePointer) result).getImmediateNode());
    }

    @Test
    public void testCreateUnprefixedAttributeAndReadItBack() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        NodePointer attribute = p.createAttribute(JXPathContext.newContext(d),
                new QName("code"));
        assertEquals("", attribute.getValue());
        assertEquals("", root.getAttribute("code"));
    }

    @Test
    public void testCreateAttributeDoesNotReplaceExistingValue() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        root.setAttribute("code", "old");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        NodePointer attribute = p.createAttribute(JXPathContext.newContext(d),
                new QName("code"));
        assertEquals("old", attribute.getValue());
        assertEquals("old", root.getAttribute("code"));
    }

    @Test
    public void testCreatePrefixedAttributeWithDeclaredNamespace() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        root.setAttribute("xmlns:p", "urn:p");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        NodePointer attribute = p.createAttribute(JXPathContext.newContext(d),
                new QName("p", "code"));
        assertEquals("", attribute.getValue());
        assertEquals("urn:p", ((Attr) root.getAttributeNodeNS("urn:p", "code"))
                .getNamespaceURI());
    }

    @Test
    public void testCreatePrefixedAttributeRejectsUnknownNamespace() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        try {
            p.createAttribute(JXPathContext.newContext(d), new QName("missing", "code"));
            fail("expected JXPathException");
        }
        catch (JXPathException expected) {
            assertEquals(0, root.getAttributes().getLength());
        }
    }

    @Test
    public void testCreateChildWithoutFactoryThrows() throws Exception {
        Document d = new org.apache.xerces.dom.DocumentImpl();
        Element root = d.createElement("root");
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        try {
            p.createChild(JXPathContext.newContext(d), new QName("child"), 0);
            fail("expected JXPathException");
        }
        catch (JXPathException expected) {
            assertEquals(0, root.getChildNodes().getLength());
        }
    }
}
