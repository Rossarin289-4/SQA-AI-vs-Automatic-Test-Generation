package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
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
import java.util.List;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Namespace;
import org.jdom.Text;

public class DOMNodePointerTest {
    @Test
    public void testIdentityAndBasicPointerProperties() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(e, Locale.ENGLISH);
        assertSame(e, p.getBaseValue());
        assertSame(e, p.getImmediateNode());
        assertTrue(p.isActual());
        assertFalse(p.isCollection());
        assertEquals(1, p.getLength());
        assertTrue(p.isLeaf());
    }

    @Test
    public void testNameAndNamespaceForPrefixedElement() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElementNS("urn:x", "p:item");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(e, Locale.ENGLISH);
        assertEquals(new QName("p", "item"), p.getName());
        assertEquals("urn:x", p.getNamespaceURI());
        assertEquals("urn:x", p.getNamespaceURI("p"));
    }

    @Test
    public void testDefaultNamespaceLookup() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        e.setAttribute("xmlns", "urn:def");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(d, Locale.ENGLISH);
        assertEquals("urn:def", p.getDefaultNamespaceURI());
    }

    @Test
    public void testReservedNamespacePrefixes() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(e, Locale.ENGLISH);
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, p.getNamespaceURI("xml"));
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, p.getNamespaceURI("xmlns"));
        assertNull(p.getNamespaceURI("missing"));
    }

    @Test
    public void testNodeNameTestMatchesQualifiedElement() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElementNS("urn:x", "p:item");
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(e, Locale.ENGLISH);
        assertTrue(p.testNode(new NodeNameTest(new QName("p", "item"), "urn:x")));
        assertFalse(p.testNode(new NodeNameTest(new QName("p", "other"), "urn:x")));
        assertTrue(p.testNode(null));
    }

    @Test
    public void testNodeTypeTestForTextAndComment() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        d.appendChild(e);
        Node text = d.createTextNode("v");
        Node comment = d.createComment("c");
        e.appendChild(text);
        e.appendChild(comment);
        assertTrue(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        assertFalse(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
    }

    @Test
    public void testGetValueTrimsTextByDefault() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Node text = d.createTextNode("  value  ");
        DOMNodePointer p = new DOMNodePointer(text, Locale.ENGLISH);
        assertEquals("value", p.getValue());
    }

    @Test
    public void testXmlSpacePreserveAffectsStringValue() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        e.setAttribute("xml:space", "preserve");
        d.appendChild(e);
        Node text = d.createTextNode("  value  ");
        e.appendChild(text);
        assertEquals("  value  ", new DOMNodePointer(text, Locale.ENGLISH).getValue());
    }

    @Test
    public void testCommentValueIsTrimmed() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Node comment = d.createComment("  note  ");
        assertEquals("note", new DOMNodePointer(comment, Locale.ENGLISH).getValue());
    }

    @Test
    public void testSetElementValueReplacesChildrenWithText() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        e.appendChild(d.createElement("old"));
        d.appendChild(e);
        DOMNodePointer p = new DOMNodePointer(e, Locale.ENGLISH);
        p.setValue("new");
        assertEquals("new", p.getValue());
        assertEquals(1, e.getChildNodes().getLength());
    }

    @Test
    public void testSetTextValueUpdatesExistingNode() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        d.appendChild(e);
        Node text = d.createTextNode("old");
        e.appendChild(text);
        DOMNodePointer p = new DOMNodePointer(text, Locale.ENGLISH);
        p.setValue("new");
        assertEquals("new", text.getNodeValue());
        assertSame(text, e.getFirstChild());
    }

    @Test
    public void testSetEmptyTextValueRemovesNode() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        d.appendChild(e);
        Node text = d.createTextNode("old");
        e.appendChild(text);
        new DOMNodePointer(text, Locale.ENGLISH).setValue("");
        assertEquals(0, e.getChildNodes().getLength());
    }

    @Test
    public void testAsPathUsesSameNameSiblingPosition() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        d.appendChild(root);
        Element first = d.createElement("item");
        Element second = d.createElement("item");
        root.appendChild(first);
        root.appendChild(second);
        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer secondPointer = new DOMNodePointer(rootPointer, second);
        assertEquals("item[2]", secondPointer.asPath());
    }

    @Test
    public void testAsPathUsesIdWhenPresent() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        d.appendChild(e);
        assertEquals("id('abc')", new DOMNodePointer(e, Locale.ENGLISH, "abc").asPath());
    }

    @Test
    public void testStaticPrefixAndLocalNameFallback() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("p:item");
        assertEquals("p", DOMNodePointer.getPrefix(e));
        assertEquals("item", DOMNodePointer.getLocalName(e));
    }

    @Test
    public void testChildIteratorFindsConfiguredChild() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element child = d.createElement("item");
        root.appendChild(child);
        d.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.ENGLISH);
        NodeIterator it = p.childIterator(
                new NodeNameTest(new QName("item"), null), false, null);
        assertTrue(it.setPosition(1));
        assertSame(child, it.getNodePointer().getBaseValue());
        assertFalse(it.setPosition(2));
    }

    @Test
    public void testAttributeIteratorFindsConfiguredAttribute() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.setAttribute("key", "value");
        d.appendChild(root);
        NodeIterator it = new DOMNodePointer(root, Locale.ENGLISH)
                .attributeIterator(new QName("key"));
        assertTrue(it.setPosition(1));
        assertEquals("value", it.getNodePointer().getValue());
    }

    @Test
    public void testCreateAttributeCreatesAndReturnsAttribute() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        d.appendChild(root);
        NodePointer pointer = new DOMNodePointer(root, Locale.ENGLISH)
                .createAttribute(null, new QName("key"));
        assertEquals("", ((Attr) pointer.getBaseValue()).getValue());
        assertTrue(root.hasAttribute("key"));
    }

    @Test
    public void testRemoveDetachesChild() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element child = d.createElement("child");
        root.appendChild(child);
        d.appendChild(root);
        new DOMNodePointer(child, Locale.ENGLISH).remove();
        assertNull(child.getParentNode());
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testRemoveRootThrows() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        try {
            new DOMNodePointer(d, Locale.ENGLISH).remove();
            fail("expected JXPathException");
        }
        catch (JXPathException expected) {
            assertEquals(0, d.getChildNodes().getLength());
        }
    }

    @Test
    public void testCompareSiblingPointersInDocumentOrder() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        Element a = d.createElement("a");
        Element b = d.createElement("b");
        root.appendChild(a);
        root.appendChild(b);
        d.appendChild(root);
        DOMNodePointer parent = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer pa = new DOMNodePointer(parent, a);
        DOMNodePointer pb = new DOMNodePointer(parent, b);
        assertEquals(-1, parent.compareChildNodePointers(pa, pb));
        assertEquals(1, parent.compareChildNodePointers(pb, pa));
        assertEquals(0, parent.compareChildNodePointers(pa, pa));
    }

    @Test
    public void testEqualityUsesUnderlyingNodeIdentity() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        DOMNodePointer a = new DOMNodePointer(e, Locale.ENGLISH);
        DOMNodePointer b = new DOMNodePointer(e, Locale.ENGLISH);
        DOMNodePointer c = new DOMNodePointer(d.createElement("root"), Locale.ENGLISH);
        assertEquals(a, b);
        assertNotEquals(a, c);
        assertEquals(e.hashCode(), a.hashCode());
    }

    @Test
    public void testNamespaceResolverIsCachedAndResolvesElementPrefix() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElementNS("urn:one", "p:item");
        d.appendChild(e);
        DOMNodePointer pointer = new DOMNodePointer(e, Locale.ENGLISH);
        NamespaceResolver resolver = pointer.getNamespaceResolver();
        assertSame(resolver, pointer.getNamespaceResolver());
        assertEquals("urn:one", resolver.getNamespaceURI("p"));
    }

    @Test
    public void testNamespaceIteratorSeesDeclaredNamespace() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        e.setAttribute("xmlns:p", "urn:one");
        d.appendChild(e);
        DOMNodePointer pointer = new DOMNodePointer(e, Locale.ENGLISH);
        NodeIterator iterator = pointer.namespaceIterator();
        assertTrue(iterator.setPosition(1));
        assertEquals("p", iterator.getNodePointer().getName().getName());
    }

    @Test
    public void testNamespacePointerResolvesPrefix() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        e.setAttribute("xmlns:p", "urn:one");
        d.appendChild(e);
        NodePointer pointer = new DOMNodePointer(e, Locale.ENGLISH)
                .namespacePointer("p");
        assertEquals("urn:one", pointer.getValue());
    }

    @Test
    public void testLanguageUsesNearestXmlLangPrefixCaseInsensitively() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = d.createElement("child");
        root.appendChild(child);
        d.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertTrue(pointer.isLanguage("EN"));
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testLanguageUsesMoreSpecificPrefix() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        e.setAttribute("xml:lang", "en-US");
        d.appendChild(e);
        DOMNodePointer pointer = new DOMNodePointer(e, Locale.ENGLISH);
        assertTrue(pointer.isLanguage("en-US"));
        assertFalse(pointer.isLanguage("en-GB"));
    }

    @Test
    public void testEqualsRejectsDifferentPointerType() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(e, Locale.ENGLISH);
        JDOMNodePointer other = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testPointerByIdReturnsNullPointerForMissingId() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        d.appendChild(e);
        DOMNodePointer pointer = new DOMNodePointer(d, Locale.ENGLISH);
        Pointer result = pointer.getPointerByID(null, "missing");
        assertTrue(result instanceof NullPointer);
        assertEquals("id('missing')", result.asPath());
    }

    @Test
    public void testPointerByIdUsesDocumentElementForDocumentContext() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        d.appendChild(e);
        DOMNodePointer pointer = new DOMNodePointer(d, Locale.ENGLISH);
        Pointer result = pointer.getPointerByID(null, "absent");
        assertEquals("id('absent')", result.asPath());
    }

    @Test
    public void testNamespaceLookupUsesNearestDeclaration() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = d.createElement("root");
        root.setAttribute("xmlns:p", "urn:outer");
        Element child = d.createElement("child");
        child.setAttribute("xmlns:p", "urn:inner");
        root.appendChild(child);
        d.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("urn:inner", pointer.getNamespaceURI("p"));
    }

    @Test
    public void testNamespaceLookupReturnsNullForEmptyDeclaration() throws Exception {
        Document d = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element e = d.createElement("root");
        e.setAttribute("xmlns:p", "");
        d.appendChild(e);
        assertNull(new DOMNodePointer(e, Locale.ENGLISH).getNamespaceURI("p"));
    }
}
