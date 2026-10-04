package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;

public class NullPropertyPointerTest {
    @Test
    public void testDefaultState() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        assertEquals("*", pointer.getPropertyName());
        assertEquals("*", pointer.getName().getName());
        assertEquals(0, pointer.getLength());
        assertNull(pointer.getBaseValue());
        assertNull(pointer.getImmediateNode());
        assertTrue(pointer.isLeaf());
        assertFalse(pointer.isActual());
        assertTrue(pointer.isContainer());
        assertEquals(0, pointer.getPropertyCount());
        assertEquals(0, pointer.getPropertyNames().length);
    }

    @Test
    public void testSetPropertyNameChangesName() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setPropertyName("alpha");
        assertEquals("alpha", pointer.getPropertyName());
        assertEquals("alpha", pointer.getName().getName());
    }

    @Test
    public void testSetNameAttributeValueChangesName() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setNameAttributeValue("field");
        assertEquals("field", pointer.getPropertyName());
        assertEquals("field", pointer.getName().getName());
    }

    @Test
    public void testSetPropertyIndexIsNoOp() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setPropertyIndex(3);
        assertEquals("*", pointer.getPropertyName());
        assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
    }

    @Test
    public void testWholeCollectionIsNotCollection() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testZeroIndexIsCollection() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setIndex(0);
        assertTrue(pointer.isCollection());
        assertEquals(0, pointer.getIndex());
    }

    @Test
    public void testPositiveIndexIsCollection() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setIndex(1);
        assertTrue(pointer.isCollection());
        assertEquals(1, pointer.getIndex());
    }

    @Test
    public void testNegativeIndexIsCollection() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setIndex(-1);
        assertTrue(pointer.isCollection());
        assertEquals(-1, pointer.getIndex());
    }

    @Test
    public void testValuePointerHasPropertyName() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setPropertyName("beta");
        assertEquals("beta", pointer.getValuePointer().getName().getName());
    }

    @Test
    public void testPropertyNamesIsEmpty() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        assertEquals(0, pointer.getPropertyNames().length);
    }

    @Test
    public void testPropertyCountIsZero() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        assertEquals(0, pointer.getPropertyCount());
    }

    @Test
    public void testSetValueWithoutParentThrows() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        try {
            pointer.setValue("value");
            fail("expected JXPathInvalidAccessException");
        }
        catch (JXPathInvalidAccessException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testNameAttributePathEscapesSingleQuote() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setNameAttributeValue("a'b");
        try {
            pointer.asPath();
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testNameAttributePathEscapesDoubleQuote() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setNameAttributeValue("a\"b");
        try {
            pointer.asPath();
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testNameAttributePathUsesOneBasedIndex() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setNameAttributeValue("entry");
        pointer.setIndex(0);
        try {
            pointer.asPath();
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testNameAttributePathUsesLastIndexValue() throws Exception {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setNameAttributeValue("entry");
        pointer.setIndex(2);
        try {
            pointer.asPath();
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) {
            assertNotNull(expected);
        }
    }
}
