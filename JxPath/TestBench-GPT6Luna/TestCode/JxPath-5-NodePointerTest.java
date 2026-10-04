package org.apache.commons.jxpath.ri.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer;
import org.apache.commons.jxpath.ri.model.beans.LangAttributePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
import org.apache.commons.jxpath.ri.model.dom.NamespacePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer;

public class NodePointerTest {
    @Test
    public void testCollectionPointerIndexAndLength() throws Exception {
        CollectionPointer pointer =
                new CollectionPointer(new Object[] {"a", "b", "c"}, Locale.US);
        assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
        assertEquals(3, pointer.getLength());
        assertTrue(pointer.isCollection());
        pointer.setIndex(0);
        assertEquals(0, pointer.getIndex());
        assertTrue(pointer.isActual());
        pointer.setIndex(2);
        assertTrue(pointer.isActual());
        pointer.setIndex(3);
        assertFalse(pointer.isActual());
        pointer.setIndex(-1);
        assertFalse(pointer.isActual());
    }

    @Test
    public void testCollectionPointerPathIndexEdges() throws Exception {
        CollectionPointer pointer =
                new CollectionPointer(new Object[] {"a", "b"}, Locale.US);
        pointer.setIndex(0);
        assertEquals("./[1]", pointer.asPath());
        pointer.setIndex(1);
        assertEquals("./[2]", pointer.asPath());
    }

    @Test
    public void testAttributeAndRootState() throws Exception {
        CollectionPointer pointer = new CollectionPointer("root", Locale.US);
        assertTrue(pointer.isRoot());
        assertFalse(pointer.isAttribute());
        pointer.setAttribute(true);
        assertTrue(pointer.isAttribute());
        assertEquals("/", pointer.asPath());
    }

    @Test
    public void testValueNodeAndRootForRootPointer() throws Exception {
        CollectionPointer pointer = new CollectionPointer("value", Locale.US);
        assertEquals("value", pointer.getValue());
        assertEquals("value", pointer.getNode());
        assertEquals("value", pointer.getNodeValue());
        assertEquals("value", pointer.getRootNode());
        assertEquals("value", pointer.getBaseValue());
    }

    @Test
    public void testLocaleLanguagePrefix() throws Exception {
        CollectionPointer pointer = new CollectionPointer("x", Locale.US);
        assertEquals(Locale.US, pointer.getLocale());
        assertTrue(pointer.isLanguage("en"));
        assertTrue(pointer.isLanguage("EN-us"));
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testNamespaceResolverSetAndGet() throws Exception {
        CollectionPointer pointer = new CollectionPointer("x", Locale.US);
        NamespaceResolver resolver = new NamespaceResolver();
        pointer.setNamespaceResolver(resolver);
        assertSame(resolver, pointer.getNamespaceResolver());
    }

    @Test
    public void testAttributeFlagDoesNotChangeNodeState() throws Exception {
        CollectionPointer pointer =
                new CollectionPointer(new Object[] {"x"}, Locale.US);
        pointer.setAttribute(true);
        assertTrue(pointer.isAttribute());
        assertTrue(pointer.isNode());
        assertFalse(pointer.isContainer());
    }

    @Test
    public void testSetValueOnCollectionPointer() throws Exception {
        CollectionPointer pointer = new CollectionPointer("old", Locale.US);
        pointer.setValue("changed");
        assertEquals("changed", pointer.getNode());
    }

    @Test
    public void testCreatePathSetsValue() throws Exception {
        CollectionPointer pointer = new CollectionPointer("old", Locale.US);
        NodePointer returned = pointer.createPath((JXPathContext) null, "new");
        assertSame(pointer, returned);
        assertEquals("new", pointer.getNode());
    }

    @Test
    public void testCreatePathWithoutValueReturnsSamePointer() throws Exception {
        CollectionPointer pointer = new CollectionPointer("value", Locale.US);
        assertSame(pointer, pointer.createPath((JXPathContext) null));
    }

    @Test
    public void testRemoveDoesNotChangeNode() throws Exception {
        CollectionPointer pointer = new CollectionPointer("value", Locale.US);
        pointer.remove();
        assertEquals("value", pointer.getNode());
    }

    @Test
    public void testDefaultNamespaceAndIteratorMethods() throws Exception {
        CollectionPointer pointer = new CollectionPointer("value", Locale.US);
        assertNull(pointer.getNamespaceURI("p"));
        assertNull(pointer.getNamespaceURI());
        assertNull(pointer.namespaceIterator());
        assertNull(pointer.namespacePointer("urn:x"));
        assertNotNull(pointer.childIterator(null, false, null));
        assertNull(pointer.attributeIterator(new QName("a")));
    }

    @Test
    public void testCloneHasSamePath() throws Exception {
        CollectionPointer pointer =
                new CollectionPointer(new Object[] {"a", "b"}, Locale.US);
        pointer.setIndex(1);
        Object copy = pointer.clone();
        assertEquals(pointer.asPath(), ((NodePointer) copy).asPath());
        assertEquals("./[2]", ((NodePointer) copy).asPath());
    }

    @Test
    public void testToStringMatchesPath() throws Exception {
        CollectionPointer pointer = new CollectionPointer("value", Locale.US);
        assertEquals(pointer.asPath(), pointer.toString());
    }

    @Test
    public void testTestNodeNullAndName() throws Exception {
        CollectionPointer pointer = new CollectionPointer("value", Locale.US);
        assertTrue(pointer.testNode(null));
        assertFalse(pointer.testNode(new NodeNameTest(new QName("item"))));
    }

    @Test
    public void testCreateChildIsAllowedByCollectionPointer() throws Exception {
        CollectionPointer pointer =
                new CollectionPointer(new Object[] {"a", "b"}, Locale.US);
        NodePointer child = pointer.createChild(
                null, new QName("child"), 0);
        assertNotNull(child);
        assertEquals(0, child.getIndex());
    }

    @Test
    public void testCreateChildWithValueIsAllowedByCollectionPointer() throws Exception {
        CollectionPointer pointer =
                new CollectionPointer(new Object[] {"a", "b"}, Locale.US);
        NodePointer child = pointer.createChild(
                null, new QName("child"), 0, "x");
        assertNotNull(child);
        assertEquals(0, child.getIndex());
    }

    @Test
    public void testCreateAttributeIsRejected() throws Exception {
        CollectionPointer pointer = new CollectionPointer("value", Locale.US);
        try {
            pointer.createAttribute(null, new QName("a"));
            fail("expected JXPathException");
        }
        catch (JXPathException expected) {
            assertTrue(expected instanceof JXPathException);
        }
    }

    @Test
    public void testNewNodePointerForNullBean() throws Exception {
        NodePointer pointer = NodePointer.newNodePointer(
                new QName("item"), null, Locale.US);
        assertTrue(pointer instanceof NullPointer);
        assertTrue(pointer.isRoot());
        assertEquals(Locale.US, pointer.getLocale());
    }

    @Test
    public void testNewNodePointerForCollection() throws Exception {
        NodePointer pointer = NodePointer.newNodePointer(
                new QName("items"), new Object[] {"a", "b"}, Locale.US);
        assertEquals(2, pointer.getLength());
        assertEquals("./", pointer.asPath());
    }

    @Test
    public void testNewChildNodePointerParentAndPath() throws Exception {
        NodePointer parent = NodePointer.newNodePointer(
                new QName("root"), new Object(), Locale.US);
        NodePointer child = NodePointer.newChildNodePointer(
                parent, new QName("child"), "value");
        assertSame(parent, child.getImmediateParentPointer());
        assertSame(parent, child.getParent());
        assertEquals("child", child.asPath());
    }

    @Test
    public void testParentAccessorsAndRootNode() throws Exception {
        NodePointer parent = new CollectionPointer("root", Locale.US);
        NodePointer child = NodePointer.newChildNodePointer(
                parent, new QName("child"), "leaf");
        assertSame(parent, child.getImmediateParentPointer());
        assertSame(parent, child.getParent());
        assertEquals("root", child.getRootNode());
    }

    @Test
    public void testValuePointerDefaultsToSelf() throws Exception {
        NodePointer pointer = new CollectionPointer("value", Locale.US);
        assertSame(pointer, pointer.getImmediateValuePointer());
        assertSame(pointer, pointer.getValuePointer());
    }

    @Test
    public void testCollectionPointerNameAndImmediateNode() throws Exception {
        NodePointer pointer = NodePointer.newNodePointer(
                new QName("items"), new Object[] {"a", "b"}, Locale.US);
        assertNull(pointer.getName());
        assertSame(pointer.getImmediateNode(), pointer.getNode());
    }

    @Test
    public void testCompareToSameRootPointers() throws Exception {
        NodePointer parent = NodePointer.newNodePointer(
                new QName("root"), new Object(), Locale.US);
        NodePointer first = NodePointer.newChildNodePointer(
                parent, new QName("first"), "a");
        NodePointer second = NodePointer.newChildNodePointer(
                parent, new QName("second"), "b");
        assertEquals(0, first.compareTo(first));
        assertEquals(-1, Integer.signum(first.compareTo(second)));
        assertEquals(1, Integer.signum(second.compareTo(first)));
    }

    @Test
    public void testCompareToAncestorAndDescendant() throws Exception {
        NodePointer root = NodePointer.newNodePointer(
                new QName("root"), new Object(), Locale.US);
        NodePointer child = NodePointer.newChildNodePointer(
                root, new QName("child"), "value");
        assertEquals(-1, Integer.signum(root.compareTo(child)));
        assertEquals(1, Integer.signum(child.compareTo(root)));
    }

    @Test
    public void testPointerLookupDelegatesToContext() throws Exception {
        JXPathContext context = JXPathContext.newContext("root");
        NodePointer pointer = NodePointer.newNodePointer(
                new QName("root"), "root", Locale.US);
        try {
            pointer.getPointerByID(context, "missing");
            fail("expected JXPathException");
        }
        catch (JXPathException expected) {
            assertTrue(expected instanceof JXPathException);
        }
    }
}
