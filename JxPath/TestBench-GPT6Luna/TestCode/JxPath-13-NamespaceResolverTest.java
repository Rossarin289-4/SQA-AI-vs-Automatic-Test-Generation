package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
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

public class NamespaceResolverTest {
    @Test
    public void testEmptyResolverLookups() throws Exception {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.getNamespaceURI("missing"));
        assertNull(resolver.getPrefix("missing"));
    }

    @Test
    public void testRegisteredNamespaceLookup() throws Exception {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p", "urn:p");
        assertEquals("urn:p", resolver.getNamespaceURI("p"));
    }

    @Test
    public void testReverseLookupAndCachedMapInvalidation() throws Exception {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p", "urn:p");
        assertEquals("p", resolver.getPrefix("urn:p"));
        resolver.registerNamespace("q", "urn:q");
        assertEquals("q", resolver.getPrefix("urn:q"));
    }

    @Test
    public void testOverwritingPrefixUpdatesReverseLookup() throws Exception {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p", "urn:old");
        assertEquals("p", resolver.getPrefix("urn:old"));
        resolver.registerNamespace("p", "urn:new");
        assertEquals("urn:new", resolver.getNamespaceURI("p"));
        assertNull(resolver.getPrefix("urn:old"));
        assertEquals("p", resolver.getPrefix("urn:new"));
    }

    @Test
    public void testChildInheritsExternalNamespace() throws Exception {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("p", "urn:p");
        NamespaceResolver child = new NamespaceResolver(parent);
        assertEquals("urn:p", child.getNamespaceURI("p"));
        assertEquals("p", child.getPrefix("urn:p"));
    }

    @Test
    public void testChildNamespaceOverridesParent() throws Exception {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("p", "urn:parent");
        NamespaceResolver child = new NamespaceResolver(parent);
        child.registerNamespace("p", "urn:child");
        assertEquals("urn:child", child.getNamespaceURI("p"));
        assertEquals("p", child.getPrefix("urn:child"));
    }

    @Test
    public void testContextPointerIsStoredAndReturned() throws Exception {
        DOMNodePointer pointer = new DOMNodePointer(null, Locale.ROOT);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.setNamespaceContextPointer(pointer);
        assertSame(pointer, resolver.getNamespaceContextPointer());
    }

    @Test
    public void testContextPointerInheritedFromParent() throws Exception {
        NamespaceResolver parent = new NamespaceResolver();
        DOMNodePointer pointer = new DOMNodePointer(null, Locale.ROOT);
        parent.setNamespaceContextPointer(pointer);
        NamespaceResolver child = new NamespaceResolver(parent);
        assertSame(pointer, child.getNamespaceContextPointer());
    }

    @Test
    public void testUnregisteredPrefixResolvedByContextPointer() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        element.setAttribute("xmlns:p", "urn:p");
        document.appendChild(element);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.setNamespaceContextPointer(new DOMNodePointer(element, Locale.ROOT));
        assertEquals("urn:p", resolver.getNamespaceURI("p"));
    }

    @Test
    public void testPrefixResolvedFromContextPointer() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        element.setAttribute("xmlns:p", "urn:p");
        document.appendChild(element);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.setNamespaceContextPointer(new DOMNodePointer(element, Locale.ROOT));
        assertEquals("p", resolver.getPrefix("urn:p"));
    }

    @Test
    public void testSealAndRejectRegistration() throws Exception {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p", "urn:p");
        resolver.seal();
        assertTrue(resolver.isSealed());
        try {
            resolver.registerNamespace("q", "urn:q");
            fail("expected IllegalStateException");
        }
        catch (IllegalStateException expected) {
            assertEquals("urn:p", resolver.getNamespaceURI("p"));
        }
    }

    @Test
    public void testSealPropagatesToParent() throws Exception {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        child.seal();
        assertTrue(child.isSealed());
        assertTrue(parent.isSealed());
    }

    @Test
    public void testCloneIsUnsealedAndRetainsMappings() throws Exception {
        NamespaceResolver original = new NamespaceResolver();
        original.registerNamespace("p", "urn:p");
        original.seal();
        NamespaceResolver copy = (NamespaceResolver) original.clone();
        assertFalse(copy.isSealed());
        assertEquals("urn:p", copy.getNamespaceURI("p"));
    }

    @Test
    public void testDOMValueAndNodeFacts() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        element.appendChild(document.createTextNode(" value "));
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);
        assertEquals("value", pointer.getValue());
        assertSame(element, pointer.getBaseValue());
        assertSame(element, pointer.getImmediateNode());
        assertTrue(pointer.isActual());
        assertFalse(pointer.isCollection());
        assertEquals(1, pointer.getLength());
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testElementNameAndLocalName() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElementNS("urn:test", "p:item");
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);
        assertEquals("item", pointer.getName().getName());
        assertEquals("item", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testDefaultNamespaceAndNamespaceResolver() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        element.setAttribute("xmlns", "urn:default");
        element.setAttribute("xmlns:p", "urn:p");
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);
        assertEquals("urn:default", pointer.getDefaultNamespaceURI());
        NamespaceResolver resolver = pointer.getNamespaceResolver();
        assertSame(resolver, pointer.getNamespaceResolver());
        assertEquals("urn:p", resolver.getNamespaceURI("p"));
    }

    @Test
    public void testIsLanguageUsesEnclosingXMLLanguage() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        element.setAttribute("xml:lang", "en-US");
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);
        assertTrue(pointer.isLanguage("en"));
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testSetValueReplacesElementContents() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        element.appendChild(document.createTextNode("old"));
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);
        pointer.setValue("new");
        assertEquals("new", pointer.getValue());
    }

    @Test
    public void testSetEmptyTextRemovesTextNode() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        Node text = document.createTextNode("gone");
        element.appendChild(text);
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(text, Locale.ROOT);
        pointer.setValue("");
        assertEquals(0, element.getChildNodes().getLength());
    }

    @Test
    public void testCreateAttributeOnElement() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);
        JXPathContext context = JXPathContext.newContext(element);
        NodePointer attribute = pointer.createAttribute(context, new QName("flag"));
        assertEquals("", attribute.getValue());
        assertTrue(element.hasAttribute("flag"));
    }

    @Test
    public void testRemoveChildElement() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ROOT);
        pointer.remove();
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testAsPathForRootElement() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);
        assertEquals("", pointer.asPath());
    }

    @Test
    public void testAsPathForIDEscapesQuotes() throws Exception {
        DOMNodePointer pointer = new DOMNodePointer(null, Locale.ROOT, "a'b");
        assertEquals("id('a&apos;b')", pointer.asPath());
    }

    @Test
    public void testPointerEqualityAndHashCode() throws Exception {
        Element element = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument().createElement("root");
        DOMNodePointer first = new DOMNodePointer(element, Locale.ROOT);
        DOMNodePointer second = new DOMNodePointer(element, Locale.ROOT);
        assertTrue(first.equals(second));
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testNamespacePointerAndNamespaceIterator() throws Exception {
        Document document = javax.xml.parsers.DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().newDocument();
        Element element = document.createElement("root");
        element.setAttribute("xmlns:p", "urn:p");
        document.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ROOT);
        NodePointer ns = pointer.namespacePointer("p");
        assertEquals("urn:p", ns.getValue());
        NodeIterator iterator = pointer.namespaceIterator();
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
    }
}
