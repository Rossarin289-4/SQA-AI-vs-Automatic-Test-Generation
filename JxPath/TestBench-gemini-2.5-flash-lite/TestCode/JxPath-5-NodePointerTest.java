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
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;

public class NodePointerTest {

    @Test
    public void testNewNodePointerNullBean() throws Exception {
        QName name = new QName("test");
        Locale locale = Locale.US;
        NodePointer pointer = NodePointer.newNodePointer(name, null, locale);
        assertTrue(pointer instanceof NullPointer);
        assertEquals(name, pointer.getName());
        assertEquals(locale, pointer.getLocale());
    }

    @Test
    public void testNewNodePointerWithBean() throws Exception {
        // This test assumes JXPathContextReferenceImpl.getNodePointerFactories() returns at least one factory
        // and that one of them can create a pointer for a String.
        // A simple String object will be used here as a placeholder for a bean.
        QName name = new QName("test");
        String bean = "someString";
        Locale locale = Locale.US;
        NodePointer pointer = NodePointer.newNodePointer(name, bean, locale);
        assertNotNull(pointer);
        // The exact type of pointer depends on the factories, so we just check it's not null.
        // We cannot assume it's a specific concrete type without knowing the factories.
        assertEquals(name, pointer.getName());
        assertEquals(locale, pointer.getLocale());
    }

    @Test
    public void testNewNodePointerWithBeanThrowsException() throws Exception {
        // This test assumes a bean type for which no NodePointerFactory can be found.
        // A custom object with no JXPath support will be used.
        class NoPointerBean {}
        QName name = new QName("test");
        Object bean = new NoPointerBean();
        Locale locale = Locale.US;
        try {
            NodePointer.newNodePointer(name, bean, locale);
            fail("Should throw JXPathException for unsupported bean type");
        } catch (JXPathException expected) {
            // Expected exception
        }
    }

    @Test
    public void testNewChildNodePointer() throws Exception {
        // This test assumes a parent pointer and a bean for which a child pointer can be created.
        // We will use a NullPointer as a parent for simplicity, and a String as a bean.
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US);
        QName name = new QName("child");
        Object bean = "someBean";
        NodePointer childPointer = NodePointer.newChildNodePointer(parent, name, bean);
        assertNotNull(childPointer);
        assertEquals(parent, childPointer.getImmediateParentPointer());
        assertEquals(name, childPointer.getName());
        // The exact type of pointer depends on the factories, so we just check it's not null.
        // We cannot assume it's a specific concrete type without knowing the factories.
    }

    @Test
    public void testNewChildNodePointerThrowsException() throws Exception {
        // This test assumes a parent pointer and a bean for which no child pointer can be created.
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US);
        QName name = new QName("child");
        class NoPointerBean {}
        Object bean = new NoPointerBean();
        try {
            NodePointer.newChildNodePointer(parent, name, bean);
            fail("Should throw JXPathException for unsupported bean type");
        } catch (JXPathException expected) {
            // Expected exception
        }
    }

    @Test
    public void testGetParent() {
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US);
        NodePointer child = new NullPointer(new QName("child"), Locale.US);
        child.parent = parent; // Manually setting parent for testing
        assertEquals(parent, child.getParent());
    }

    @Test
    public void testGetImmediateParentPointer() {
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US);
        NodePointer child = new NullPointer(new QName("child"), Locale.US);
        child.parent = parent; // Manually setting parent for testing
        assertEquals(parent, child.getImmediateParentPointer());
    }

    @Test
    public void testSetAttributeAndIsAttribute() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        pointer.setAttribute(true);
        assertTrue(pointer.isAttribute());
        pointer.setAttribute(false);
        assertFalse(pointer.isAttribute());
    }

    @Test
    public void testIsRoot() {
        NodePointer root = new NullPointer(new QName("root"), Locale.US);
        assertTrue(root.isRoot());
        NodePointer child = new NullPointer(new QName("child"), Locale.US);
        child.parent = root;
        assertFalse(child.isRoot());
    }

    @Test
    public void testIsNode() {
        // NullPointer is not a container, so isNode should be true.
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        assertTrue(pointer.isNode());
    }

    @Test
    public void testIsContainer() {
        // NullPointer is not a container.
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        assertFalse(pointer.isContainer());
    }

    @Test
    public void testGetIndexAndSetIndex() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
        pointer.setIndex(5);
        assertEquals(5, pointer.getIndex());
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
    }

    @Test
    public void testIsActualForWholeCollection() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertTrue(pointer.isActual()); // WHOLE_COLLECTION is considered actual
    }

    @Test
    public void testIsActualForValidIndex() {
        // We need a concrete pointer that has a getLength method. CollectionPointer is suitable.
        CollectionPointer pointer = new CollectionPointer(new Object[]{"a", "b"}, Locale.US);
        pointer.setIndex(0); // Valid index
        assertTrue(pointer.isActual());
        pointer.setIndex(1); // Valid index
        assertTrue(pointer.isActual());
    }

    @Test
    public void testIsActualForInvalidIndexTooHigh() {
        CollectionPointer pointer = new CollectionPointer(new Object[]{"a", "b"}, Locale.US);
        pointer.setIndex(2); // Invalid index, too high
        assertFalse(pointer.isActual());
    }

    @Test
    public void testIsActualForInvalidIndexNegative() {
        CollectionPointer pointer = new CollectionPointer(new Object[]{"a", "b"}, Locale.US);
        pointer.setIndex(-1); // Invalid index, negative
        assertFalse(pointer.isActual());
    }

    @Test
    public void testGetNamespaceResolverInheritance() {
        NamespaceResolver parentResolver = new NamespaceResolver();
        parentResolver.registerNamespace("pre", "uri");
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US) {
            @Override
            public NamespaceResolver getNamespaceResolver() {
                return parentResolver;
            }
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return null; }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        NodePointer child = new NullPointer(new QName("child"), Locale.US);
        child.parent = parent;
        assertEquals(parentResolver, child.getNamespaceResolver());
    }

    @Test
    public void testSetNamespaceResolverAndGet() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        NamespaceResolver resolver = new NamespaceResolver();
        pointer.setNamespaceResolver(resolver);
        assertEquals(resolver, pointer.getNamespaceResolver());
    }

    @Test
    public void testGetLocaleFromParent() {
        Locale parentLocale = Locale.FRANCE;
        NodePointer parent = new NullPointer(new QName("parent"), parentLocale) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        NodePointer child = new NullPointer(new QName("child"), null); // Child locale is null
        child.parent = parent;
        assertEquals(parentLocale, child.getLocale());
    }

    @Test
    public void testGetLocaleWhenSet() {
        Locale locale = Locale.GERMANY;
        NodePointer pointer = new NullPointer(new QName("test"), locale);
        assertEquals(locale, pointer.getLocale());
    }

    @Test
    public void testIsLanguageTrue() {
        Locale locale = Locale.forLanguageTag("en-US");
        NodePointer pointer = new NullPointer(new QName("test"), locale) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertTrue(pointer.isLanguage("en"));
        assertTrue(pointer.isLanguage("EN"));
    }

    @Test
    public void testIsLanguageFalse() {
        Locale locale = Locale.forLanguageTag("en-US");
        NodePointer pointer = new NullPointer(new QName("test"), locale) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testGetNamespaceURIWithPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("xml", "http://www.w3.org/XML/1998/namespace");
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override
            public NamespaceResolver getNamespaceResolver() {
                return resolver;
            }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertEquals("http://www.w3.org/XML/1998/namespace", pointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIWithUnknownPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override
            public NamespaceResolver getNamespaceResolver() {
                return resolver;
            }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        // getNamespaceURI(prefix) should return null if prefix is not registered and no parent resolver exists.
        assertNull(pointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIWithoutPrefix() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        assertNull(pointer.getNamespaceURI()); // Default implementation returns null
    }

    @Test
    public void testAsPathWithAttribute() {
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US) {
            @Override public String asPath() { return "/parent"; }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return new QName("parent"); }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        NodePointer attributePointer = new NullPointer(new QName("attr"), Locale.US) {
            @Override public String asPath() { return "/parent/@attr"; }
            @Override public boolean isAttribute() { return true; }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return new QName("attr"); }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        attributePointer.parent = parent;
        attributePointer.setAttribute(true);
        assertEquals("/parent/@attr", attributePointer.asPath());
    }

    @Test
    public void testAsPathWithIndex() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object[]{"a", "b"}, Locale.US);
        collectionPointer.setIndex(1);
        collectionPointer.parent = new NullPointer(new QName("list"), Locale.US) {
            @Override public String asPath() { return "/list"; }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return true; } // Must be collection for index to be used
             @Override public int getLength() { return 2; }
             @Override public QName getName() { return new QName("list"); }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertEquals("/list[2]", collectionPointer.asPath());
    }
    
    @Test
    public void testClone() {
        NodePointer original = new NullPointer(new QName("test"), Locale.US);
        original.setIndex(5);
        original.setAttribute(true);
        original.setNamespaceResolver(new NamespaceResolver());

        NodePointer cloned = (NodePointer) original.clone();

        assertNotSame(original, cloned);
        assertEquals(original.getIndex(), cloned.getIndex());
        assertEquals(original.isAttribute(), cloned.isAttribute());
        assertNotNull(cloned.getNamespaceResolver());
        // The namespace resolver itself is not cloned by NodePointer.clone().
        // It should be a new instance if the original was set.
        // If the original's namespaceResolver was null, the cloned one should also be null.
        // The current implementation of NodePointer.clone() just copies the reference.
        // If the expectation is a new instance, that would require overriding clone() in subclasses or modifying NodePointer.clone().
        // For now, assert that it's not the same instance if it was not null.
        if (original.getNamespaceResolver() != null) {
             assertNotSame(original.getNamespaceResolver(), cloned.getNamespaceResolver());
        }
    }

    @Test
    public void testToString() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override public String asPath() { return "/test/path"; }
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("test"); }
            @Override public Object getBaseValue() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertEquals("/test/path", pointer.toString());
    }
    
    @Test
    public void testCompareToSameParentDifferentChildren() {
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("parent"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
                if (pointer1.getName().getName().equals("a")) return -1;
                if (pointer2.getName().getName().equals("a")) return 1;
                return 0;
            }
        };

        NodePointer p1 = new NullPointer(new QName("a"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("a"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return parent.compareChildNodePointers(pointer1, pointer2); }
        };
        p1.parent = parent;

        NodePointer p2 = new NullPointer(new QName("b"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("b"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return parent.compareChildNodePointers(pointer1, pointer2); }
        };
        p2.parent = parent;
        
        // p1 should come before p2 based on the custom compareChildNodePointers
        assertTrue(p1.compareTo(p2) < 0);
    }

    @Test
    public void testCompareToDifferentParentsDifferentDepths() {
        NodePointer grandParent = new NullPointer(new QName("grandparent"), Locale.US) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return new QName("grandparent"); }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; } // Simplified
        };

        NodePointer parent1 = new NullPointer(new QName("parent1"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("parent1"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        parent1.parent = grandParent;

        NodePointer parent2 = new NullPointer(new QName("parent2"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("parent2"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        parent2.parent = grandParent;

        NodePointer child1 = new NullPointer(new QName("child1"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("child1"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        child1.parent = parent1;

        NodePointer child2 = new NullPointer(new QName("child2"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("child2"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        child2.parent = parent2;

        // child1 has depth 3, child2 has depth 3.
        // parent1 has depth 2, parent2 has depth 2.
        // grandParent has depth 1.
        // child1 and child2 are at the same depth from root.
        // compareTo should compare their parents first, then children if parents are same.
        // Since parents are at same depth, it will compare grand parents, which are same.
        // Then it will use compareChildNodePointers of grandParent.
        // For simplicity, assume compareChildNodePointers returns 0 if parents are different.
        // The logic in compareNodePointers will eventually return 0 if depths are same and parents are different.
        // Let's test depth difference:
        NodePointer child3 = new NullPointer(new QName("child3"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("child3"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        child3.parent = parent1; // Depth 3

        NodePointer child4 = new NullPointer(new QName("child4"), Locale.US) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return new QName("child4"); }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        child4.parent = grandParent; // Depth 2

        // child3 is deeper than child4. child3 should come after child4.
        assertTrue(child3.compareTo(child4) > 0);
        assertTrue(child4.compareTo(child3) < 0);
    }

    @Test
    public void testCompareToSamePointer() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        assertEquals(0, pointer.compareTo(pointer));
    }

    @Test
    public void testGetValuePointerRecursion() {
        // Create a scenario with nested containers (represented by NullPointers for simplicity)
        NodePointer ultimateValuePointer = new NullPointer(new QName("value"), Locale.US) {
            @Override public Object getImmediateNode() { return "actual value"; }
            @Override public boolean isLeaf() { return true; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 1; }
            @Override public QName getName() { return new QName("value"); }
            @Override public Object getBaseValue() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };

        NodePointer containerC = new NullPointer(new QName("containerC"), Locale.US) {
            @Override public NodePointer getImmediateValuePointer() { return ultimateValuePointer; }
            @Override public boolean isContainer() { return true; }
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 1; }
            @Override public QName getName() { return new QName("containerC"); }
            @Override public Object getBaseValue() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        containerC.parent = ultimateValuePointer; // Setting parent for completeness, though not strictly needed for this test.

        NodePointer containerB = new NullPointer(new QName("containerB"), Locale.US) {
            @Override public NodePointer getImmediateValuePointer() { return containerC; }
            @Override public boolean isContainer() { return true; }
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 1; }
            @Override public QName getName() { return new QName("containerB"); }
            @Override public Object getBaseValue() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        containerB.parent = containerC;

        NodePointer pointerA = new NullPointer(new QName("pointerA"), Locale.US) {
            @Override public NodePointer getImmediateValuePointer() { return containerB; }
            @Override public boolean isContainer() { return true; } // Make pointerA a container as well to test recursion
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 1; }
            @Override public QName getName() { return new QName("pointerA"); }
            @Override public Object getBaseValue() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        pointerA.parent = new NullPointer(new QName("root"), Locale.US); // Need a parent

        assertEquals(ultimateValuePointer, pointerA.getValuePointer());
        assertEquals("actual value", pointerA.getValue());
        assertEquals("actual value", pointerA.getNode());
    }

    @Test
    public void testGetNode() {
        // This test relies on the behavior of getValuePointer() and getImmediateNode().
        // We'll create a simple scenario where getNode() should return the value.
        QName name = new QName("test");
        Locale locale = Locale.US;
        
        NodePointer pointer = new NullPointer(name, locale) {
            @Override
            public Object getImmediateNode() {
                return "mockedNodeValue";
            }
             @Override public boolean isLeaf() { return true; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 1; }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };

        assertEquals("mockedNodeValue", pointer.getNode());
    }
    
    @Test
    public void testGetRootNode() {
        // A root node should return its own immediate node.
        NodePointer root = new NullPointer(new QName("root"), Locale.US) {
            @Override public Object getImmediateNode() { return "rootNodeValue"; }
            @Override public boolean isLeaf() { return true; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 1; }
            @Override public QName getName() { return new QName("root"); }
            @Override public Object getBaseValue() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertEquals("rootNodeValue", root.getRootNode());

        // A child node should delegate to its parent's getRootNode().
        NodePointer child = new NullPointer(new QName("child"), Locale.US);
        child.parent = root;
        assertEquals("rootNodeValue", child.getRootNode());
    }
    
    @Test
    public void testCreatePathWithNullValue() throws Exception {
        // This test requires a JXPathContext and a pointer that supports setValue.
        // NullPointer's setValue does nothing, which is fine for this test.
        JXPathContext context = JXPathContext.newContext(null); // Create a context with a null bean
        
        // Create a mock NodePointer that has a concrete implementation for required abstract methods
        // and whose setValue can be observed.
        NodePointer pointer = new NullPointer(new QName("path"), Locale.US) {
            boolean valueSet = false;
            Object setValueArg = null;

            @Override
            public void setValue(Object value) {
                this.valueSet = true;
                this.setValueArg = value;
            }
            
            @Override public boolean isLeaf() { return true; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 1; }
            @Override public QName getName() { return new QName("path"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        
        NodePointer resultPointer = pointer.createPath(context, null);
        assertSame(pointer, resultPointer);
        // The NullPointer's setValue does nothing. However, the contract is that createPath calls setValue.
        // We can't assert that it was called with null as NullPointer's setValue is abstract and
        // the provided NullPointer does not implement it in a way we can verify.
        // The assertion here is that createPath returns 'this'.
    }
    
    @Test
    public void testCreatePathWithoutValue() throws Exception {
        JXPathContext context = JXPathContext.newContext(null);
        NodePointer pointer = new NullPointer(new QName("path"), Locale.US) {
             @Override public boolean isLeaf() { return true; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 1; }
             @Override public QName getName() { return new QName("path"); }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {} // No-op for this test
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };

        NodePointer resultPointer = pointer.createPath(context);
        // createPath should return 'this' pointer.
        assertSame(pointer, resultPointer);
    }
    
    @Test
    public void testRemove() {
        // The remove method in NodePointer is a no-op.
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("test"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        try {
            pointer.remove(); // Should not throw an exception
            assertTrue(true); // Test passes if no exception is thrown
        } catch (Exception e) {
            fail("remove() should be a no-op and not throw an exception");
        }
    }

    @Test
    public void testCreateChildThrowsException() {
        NodePointer pointer = new NullPointer(new QName("parent"), Locale.US) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return new QName("parent"); }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };
        JXPathContext context = JXPathContext.newContext(null);
        QName name = new QName("child");
        try {
            pointer.createChild(context, name, 0, "someValue");
            fail("Should throw JXPathException");
        } catch (JXPathException expected) {
            // Expected
        }
    }

    @Test
    public void testCreateChildWithoutValueThrowsException() {
        NodePointer pointer = new NullPointer(new QName("parent"), Locale.US) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return new QName("parent"); }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };
        JXPathContext context = JXPathContext.newContext(null);
        QName name = new QName("child");
        try {
            pointer.createChild(context, name, 0);
            fail("Should throw JXPathException");
        } catch (JXPathException expected) {
            // Expected
        }
    }

    @Test
    public void testCreateAttributeThrowsException() {
        NodePointer pointer = new NullPointer(new QName("node"), Locale.US) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return new QName("node"); }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };
        JXPathContext context = JXPathContext.newContext(null);
        QName name = new QName("attribute");
        try {
            pointer.createAttribute(context, name);
            fail("Should throw JXPathException");
        } catch (JXPathException expected) {
            // Expected
        }
    }

    @Test
    public void testTestNodeWithNameTestMatching() {
        QName nodeName = new QName("element");
        NodePointer pointer = new NullPointer(nodeName, Locale.US) {
            @Override public QName getName() { return nodeName; }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };
        NodeNameTest test = new NodeNameTest(nodeName);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNameTestNotMatching() {
        QName nodeName = new QName("element");
        QName testName = new QName("otherElement");
        NodePointer pointer = new NullPointer(nodeName, Locale.US) {
            @Override public QName getName() { return nodeName; }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };
        NodeNameTest test = new NodeNameTest(testName);
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNameTestWildcard() {
        QName nodeName = new QName("element");
        NodePointer pointer = new NullPointer(nodeName, Locale.US) {
            @Override public QName getName() { return nodeName; }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };
        NodeNameTest test = new NodeNameTest(new QName("*")); // Wildcard
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNullTest() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        assertTrue(pointer.testNode(null));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override public boolean isNode() { return true; } // Explicitly state it is a node
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNodeNotNode() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override public boolean isNode() { return false; } // Explicitly state it is NOT a node
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
             @Override public Object getImmediateNode() { return null; }
        };
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testGetPointerByID() {
        // Mock JXPathContext.getPointerByID to return a specific pointer
        JXPathContext mockContext = new JXPathContextReferenceImpl(null, null) {
            @Override
            public Pointer getPointerByID(String id) {
                return new NullPointer(new QName("idPointer"), Locale.US);
            }
        };
        NodePointer nodePointer = new NullPointer(new QName("test"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("test"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertNotNull(nodePointer.getPointerByID(mockContext, "someId"));
    }

    @Test
    public void testGetPointerByKey() {
        // Mock JXPathContext.getPointerByKey to return a specific pointer
        JXPathContext mockContext = new JXPathContextReferenceImpl(null, null) {
            @Override
            public Pointer getPointerByKey(String key, String value) {
                return new NullPointer(new QName("keyPointer"), Locale.US);
            }
        };
        NodePointer nodePointer = new NullPointer(new QName("test"), Locale.US) {
            @Override public boolean isLeaf() { return false; }
            @Override public boolean isCollection() { return false; }
            @Override public int getLength() { return 0; }
            @Override public QName getName() { return new QName("test"); }
            @Override public Object getBaseValue() { return null; }
            @Override public Object getImmediateNode() { return null; }
            @Override public void setValue(Object value) {}
            @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertNotNull(nodePointer.getPointerByKey(mockContext, "someKey", "someValue"));
    }

    // Tests for methods not previously covered:

    @Test
    public void testGetNodeValue() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override
            public Object getValue() {
                return "mockedValue";
            }
             @Override public boolean isLeaf() { return true; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 1; }
             @Override public QName getName() { return new QName("test"); }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertEquals("mockedValue", pointer.getNodeValue());
    }

    @Test
    public void testChildIteratorReturnsNullForNullValuePointer() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override
            public NodePointer getValuePointer() {
                // The actual NodePointer.childIterator checks if valuePointer is null or this.
                // If it's null, it returns null.
                return null;
            }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertNull(pointer.childIterator(null, false, null));
    }


    @Test
    public void testAttributeIteratorReturnsNullForNullValuePointer() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override
            public NodePointer getValuePointer() {
                // The actual NodePointer.attributeIterator checks if valuePointer is null or this.
                // If it's null, it returns null.
                return null;
            }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        assertNull(pointer.attributeIterator(null));
    }

    @Test
    public void testAttributeIteratorDelegateToValuePointer() {
        QName attrName = new QName("attribute");
        NodePointer valuePointer = new NullPointer(attrName, Locale.US) {
            @Override
            public NodeIterator attributeIterator(QName qname) {
                // Simulate returning an iterator
                return new BeanAttributeIterator(this, null);
            }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return attrName; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
            @Override
            public NodePointer getValuePointer() {
                return valuePointer;
            }
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return null; }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        NodeIterator iterator = pointer.attributeIterator(attrName);
        assertNotNull(iterator);
    }

    @Test
    public void testNamespaceIteratorReturnsNull() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        assertNull(pointer.namespaceIterator());
    }

    @Test
    public void testNamespacePointerReturnsNull() {
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US);
        assertNull(pointer.namespacePointer("someNamespace"));
    }

    @Test
    public void testPrintPointerChain() {
        // This method prints to System.err and is hard to test directly without mocking System.err.
        // We'll call it to ensure it doesn't throw an exception.
        NodePointer pointer = new NullPointer(new QName("test"), Locale.US) {
             @Override public boolean isLeaf() { return false; }
             @Override public boolean isCollection() { return false; }
             @Override public int getLength() { return 0; }
             @Override public QName getName() { return new QName("test"); }
             @Override public Object getBaseValue() { return null; }
             @Override public Object getImmediateNode() { return null; }
             @Override public void setValue(Object value) {}
             @Override public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
        };
        try {
            pointer.printPointerChain();
            assertTrue(true); // Test passes if no exception is thrown
        } catch (Exception e) {
            fail("printPointerChain() should not throw an exception");
        }
    }
}
