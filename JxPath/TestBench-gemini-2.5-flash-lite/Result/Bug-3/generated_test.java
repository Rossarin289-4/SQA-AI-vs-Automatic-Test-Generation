package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import java.util.Locale;

public class NullPropertyPointerTest {
    // Dummy objects for testing
    private static final Object DUMMY_BEAN = new Object();
    private static final JXPathContext DUMMY_CONTEXT = JXPathContext.newContext(DUMMY_BEAN);
    private static final Locale DUMMY_LOCALE = Locale.US;

    @Test
    public void testConstructorAndInitialState() {
        NodePointer parent = new NullPointer(null, new QName("root")); // Dummy parent
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        assertEquals("*", pointer.getPropertyName());
        assertFalse(pointer.isAttribute());
        assertEquals(0, pointer.getLength());
        assertNull(pointer.getBaseValue());
        assertNull(pointer.getImmediateNode());
        assertTrue(pointer.isLeaf());
        assertFalse(pointer.isActual());
        assertTrue(pointer.isContainer());
        assertFalse(pointer.isCollection());
        assertEquals(0, pointer.getPropertyCount());
        assertArrayEquals(new String[0], pointer.getPropertyNames());
    }

    @Test
    public void testGetName() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        pointer.setPropertyName("testProperty");
        QName name = pointer.getName();
        assertEquals("testProperty", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testSetNameAttributeValue() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        pointer.setNameAttributeValue("attributeName");
        assertEquals("attributeName", pointer.getPropertyName());
        assertTrue(pointer.asPath().contains("[@name='attributeName']"));
    }
    
    @Test
    public void testSetNameAttributeValueWithApostrophe() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        pointer.setNameAttributeValue("attr'name");
        assertEquals("attr'name", pointer.getPropertyName());
        assertTrue(pointer.asPath().contains("[@name='attr&apos;name']"));
    }

    @Test
    public void testSetNameAttributeValueWithQuote() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        pointer.setNameAttributeValue("attr\"name");
        assertEquals("attr\"name", pointer.getPropertyName());
        assertTrue(pointer.asPath().contains("[@name='attr&quot;name']"));
    }

    @Test
    public void testSetPropertyIndex() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        pointer.setPropertyIndex(5);
        // setPropertyIndex has no observable side effect on NullPropertyPointer itself
        // as it does not store the index. getIndex() is inherited from NodePointer and defaults to WHOLE_COLLECTION.
        assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
    }

    @Test
    public void testGetValuePointer() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        pointer.setPropertyName("someProperty");
        NodePointer valuePointer = pointer.getValuePointer();
        assertNotNull(valuePointer);
        assertTrue(valuePointer instanceof NullPointer);
        assertEquals("someProperty", valuePointer.getName().getName());
    }

    @Test
    public void testIsActualProperty() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        assertFalse(pointer.isActualProperty());
    }
    
    @Test
    public void testIsActual() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        assertFalse(pointer.isActual());
    }

    @Test
    public void testIsContainer() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        assertTrue(pointer.isContainer());
    }

    @Test
    public void testSetValueOnNullParent() {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        try {
            pointer.setValue("someValue");
            fail("Expected JXPathInvalidAccessException for null parent");
        } catch (JXPathInvalidAccessException expected) {
            assertTrue(expected.getMessage().contains("Cannot set property"));
            assertTrue(expected.getMessage().contains("the target object is null"));
        }
    }

    // Mock class to simulate PropertyOwnerPointer for testing setValue

    

    // Mock class to simulate NodePointer for testing createPath/createChild


    











    @Test
    public void testIsCollection() {
        NodePointer parent = new NullPointer(null, new QName("root"));
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        // isCollection is true if getIndex() != WHOLE_COLLECTION
        assertFalse(pointer.isCollection()); // Default index is WHOLE_COLLECTION
        pointer.setIndex(5);
        assertTrue(pointer.isCollection());
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertFalse(pointer.isCollection());
    }
}


