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
    public void testNameAndNamespaceOnNamespacedElement() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElementNS("urn:x", "p:item");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertEquals("item", p.getName().getName());
        assertEquals("p", p.getName().getPrefix());
        assertEquals("urn:x", p.getNamespaceURI());
    }

    @Test
    public void testNodeNameTestMatchesNameAndNamespace() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElementNS("urn:x", "p:item");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertTrue(p.testNode(new NodeNameTest(new QName("p", "item"), "urn:x")));
        assertFalse(p.testNode(new NodeNameTest(new QName("p", "other"), "urn:x")));
    }

    @Test
    public void testTypeTestsCoverElementTextCommentAndPI() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Node[] nodes = { d.createElement("r"), d.createTextNode("x"),
                d.createComment("x"), d.createProcessingInstruction("go", "x") };
        int[] types = { Compiler.NODE_TYPE_NODE, Compiler.NODE_TYPE_TEXT,
                Compiler.NODE_TYPE_COMMENT, Compiler.NODE_TYPE_PI };
        for (int i = 0; i < nodes.length; i++) {
            assertTrue(DOMNodePointer.testNode(nodes[i],
                    new NodeTypeTest(types[i])));
        }
        assertFalse(DOMNodePointer.testNode(nodes[0],
                new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
    }

    @Test
    public void testProcessingInstructionTargetTest() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Node pi = d.createProcessingInstruction("go", "x");
        assertTrue(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("go")));
        assertFalse(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("stop")));
    }

    @Test
    public void testLeafAndNonLeaf() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertTrue(p.isLeaf());
        e.appendChild(d.createTextNode("x"));
        assertFalse(p.isLeaf());
    }

    @Test
    public void testDefaultAndPrefixedNamespaceResolution() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.setAttribute("xmlns", "urn:def");
        e.setAttribute("xmlns:p", "urn:p");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertEquals("urn:def", p.getDefaultNamespaceURI());
        assertEquals("urn:p", p.getNamespaceURI("p"));
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, p.getNamespaceURI("xml"));
        assertNull(p.getNamespaceURI("missing"));
    }

    @Test
    public void testEmptyNamespaceDeclarationsResolveAsNull() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.setAttribute("xmlns", "");
        e.setAttribute("xmlns:p", "");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertNull(p.getDefaultNamespaceURI());
        assertNull(p.getNamespaceURI("p"));
    }

    @Test
    public void testValueConcatenatesTextAndHonorsXmlSpacePreserve() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.setAttribute("xml:space", "preserve");
        e.appendChild(d.createTextNode(" a "));
        e.appendChild(d.createCDATASection("b"));
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertEquals(" a b", p.getValue());
    }

    @Test
    public void testValueTrimsTextByDefault() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Node text = d.createTextNode("  word  ");
        assertEquals("word", new DOMNodePointer(text, Locale.ROOT).getValue());
    }

    @Test
    public void testCommentValueIsTrimmed() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Node comment = d.createComment("  note  ");
        assertEquals("note", new DOMNodePointer(comment, Locale.ROOT).getValue());
    }

    @Test
    public void testSetElementValueReplacesChildrenWithText() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.appendChild(d.createElement("old"));
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        p.setValue("new");
        assertEquals(1, e.getChildNodes().getLength());
        assertEquals("new", p.getValue());
    }

    @Test
    public void testSetTextValueChangesNodeContent() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        Node text = d.createTextNode("old");
        e.appendChild(text);
        new DOMNodePointer(text, Locale.ROOT).setValue("new");
        assertEquals("new", text.getNodeValue());
    }

    @Test
    public void testSetEmptyTextValueRemovesTextNode() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        Node text = d.createTextNode("old");
        e.appendChild(text);
        new DOMNodePointer(text, Locale.ROOT).setValue("");
        assertEquals(0, e.getChildNodes().getLength());
    }

    @Test
    public void testLanguageUsesEnclosingXmlLangPrefixCaseInsensitively() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.setAttribute("xml:lang", "en-US");
        Node text = d.createTextNode("x");
        e.appendChild(text);
        assertTrue(new DOMNodePointer(text, Locale.ROOT).isLanguage("EN"));
        assertFalse(new DOMNodePointer(text, Locale.ROOT).isLanguage("fr"));
    }

    @Test
    public void testStaticPrefixAndLocalNameFallback() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("p:item");
        assertEquals("p", DOMNodePointer.getPrefix(e));
        assertEquals("item", DOMNodePointer.getLocalName(e));
        Element plain = d.createElement("item");
        assertNull(DOMNodePointer.getPrefix(plain));
        assertEquals("item", DOMNodePointer.getLocalName(plain));
    }

    @Test
    public void testPointerIdentityAndLengthFlags() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertTrue(p.isActual());
        assertFalse(p.isCollection());
        assertEquals(1, p.getLength());
        assertSame(e, p.getBaseValue());
        assertSame(e, p.getImmediateNode());
        assertEquals(p, new DOMNodePointer(e, Locale.ROOT));
        assertNotEquals(p, new DOMNodePointer(d.createElement("r"), Locale.ROOT));
    }

    @Test
    public void testPathUsesIdAndEscapesQuotes() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT, "a'b\"c");
        assertEquals("id('a&apos;b&quot;c')", p.asPath());
    }

    @Test
    public void testPathComputesRepeatedElementSiblingPosition() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element first = d.createElement("item");
        Element other = d.createElement("other");
        Element last = d.createElement("item");
        root.appendChild(first);
        root.appendChild(other);
        root.appendChild(last);
        DOMNodePointer parent = new DOMNodePointer(root, Locale.ROOT);
        DOMNodePointer child = new DOMNodePointer(parent, last);
        assertEquals("/root[1]/item[2]", child.asPath());
    }

    @Test
    public void testPathComputesTextPositionAmongTextNodes() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.appendChild(d.createTextNode("a"));
        root.appendChild(d.createElement("x"));
        Node last = d.createTextNode("b");
        root.appendChild(last);
        DOMNodePointer child = new DOMNodePointer(new DOMNodePointer(root, Locale.ROOT), last);
        assertEquals("/root[1]/text()[2]", child.asPath());
    }

    @Test
    public void testRemoveDetachesChild() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element child = d.createElement("child");
        root.appendChild(child);
        new DOMNodePointer(child, Locale.ROOT).remove();
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testRemoveRootThrowsJXPathException() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        try {
            new DOMNodePointer(d, Locale.ROOT).remove();
            fail("expected JXPathException");
        } catch (JXPathException expected) { }
    }

    @Test
    public void testCompareChildPointersAndAttributeOrdering() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element a = d.createElement("a");
        Element b = d.createElement("b");
        root.appendChild(a);
        root.appendChild(b);
        Attr attr = d.createAttribute("id");
        root.setAttributeNode(attr);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        assertEquals(-1, p.compareChildNodePointers(
                new DOMNodePointer(a, Locale.ROOT), new DOMNodePointer(b, Locale.ROOT)));
        assertEquals(-1, p.compareChildNodePointers(
                new DOMNodePointer(attr, Locale.ROOT), new DOMNodePointer(a, Locale.ROOT)));
        assertEquals(0, p.compareChildNodePointers(
                new DOMNodePointer(a, Locale.ROOT), new DOMNodePointer(a, Locale.ROOT)));
    }

    @Test
    public void testCreateAttributeCreatesAndReturnsAttributePointer() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        NodePointer attr = p.createAttribute(JXPathContext.newContext(e), new QName("id"));
        assertEquals("", e.getAttribute("id"));
        assertNotNull(attr);
    }

    @Test
    public void testGetPointerByUnknownIdReturnsNullPointer() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        d.appendChild(e);
        Pointer pointer = new DOMNodePointer(d, Locale.ROOT).getPointerByID(
                JXPathContext.newContext(d), "missing");
        assertTrue(pointer instanceof NullPointer);
    }

    @Test
    public void testChildIteratorFindsMatchingChild() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element child = d.createElement("item");
        root.appendChild(child);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ROOT);
        NodeIterator it = p.childIterator(new NodeNameTest(new QName("item"), null), false, null);
        assertTrue(it.setPosition(1));
        assertSame(child, it.getNodePointer().getImmediateNode());
        assertFalse(it.setPosition(2));
    }

    @Test
    public void testAttributeIteratorFindsConfiguredAttribute() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.setAttribute("id", "x");
        NodeIterator it = new DOMNodePointer(e, Locale.ROOT)
                .attributeIterator(new QName("id"));
        assertTrue(it.setPosition(1));
        assertEquals("x", it.getNodePointer().getValue());
        assertFalse(it.setPosition(2));
    }

    @Test
    public void testNamespacePointerResolvesDeclaredPrefix() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.setAttribute("xmlns:p", "urn:p");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        NodePointer namespace = p.namespacePointer("p");
        assertEquals("urn:p", namespace.getValue());
    }

    @Test
    public void testNamespacePointerUsesXmlNamespace() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        DOMNodePointer p = new DOMNodePointer(d.createElement("r"), Locale.ROOT);
        NodePointer namespace = p.namespacePointer("xml");
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, namespace.getValue());
    }

    @Test
    public void testNamespaceIteratorEnumeratesDeclaredNamespace() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.setAttribute("xmlns:p", "urn:p");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        NodeIterator iterator = p.namespaceIterator();
        assertTrue(iterator.setPosition(1));
        assertEquals("urn:p", iterator.getNodePointer().getValue());
    }

    @Test
    public void testNamespaceIteratorIncludesDefaultNamespace() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        e.setAttribute("xmlns", "urn:def");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        NodeIterator iterator = p.namespaceIterator();
        assertTrue(iterator.setPosition(1));
        assertEquals("urn:def", iterator.getNodePointer().getValue());
    }

    @Test
    public void testHashCodeMatchesNodeIdentityHashCode() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertEquals(System.identityHashCode(e), p.hashCode());
    }

    @Test
    public void testEqualsUsesUnderlyingNodeIdentity() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertTrue(p.equals(p));
        assertTrue(p.equals(new DOMNodePointer(e, Locale.US)));
        assertFalse(p.equals(new DOMNodePointer(d.createElement("r"), Locale.ROOT)));
        assertFalse(p.equals(null));
    }

    @Test
    public void testEqualsDoesNotTreatDifferentPointerTypeAsEqual() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().newDocument();
        Element e = d.createElement("r");
        DOMNodePointer p = new DOMNodePointer(e, Locale.ROOT);
        assertFalse(p.equals(new JDOMNodePointer(e, Locale.ROOT)));
    }
}
