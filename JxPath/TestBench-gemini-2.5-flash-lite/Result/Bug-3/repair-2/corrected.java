package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.PropertyPointer; // Added import
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
    private static class MockPropertyOwnerPointer extends PropertyOwnerPointer {
        private PropertyPointer propertyPointer;
        private boolean dynamicPropertyDeclarationSupported;
        private boolean isContainer;

        MockPropertyOwnerPointer(NodePointer parent, Locale locale, boolean isContainer, boolean dynamicPropertyDeclarationSupported) {
            super(parent, locale);
            this.isContainer = isContainer;
            this.dynamicPropertyDeclarationSupported = dynamicPropertyDeclarationSupported;
        }

        @Override
        public QName getName() { return new QName("mockParent"); }
        @Override
        public int getLength() { return 0; }
        @Override
        public Object getBaseValue() { return null; }
        @Override
        public Object getImmediateNode() { return null; }
        @Override
        public boolean isLeaf() { return true; }
        @Override
        public NodePointer getValuePointer() { return null; }
        @Override
        public boolean isActual() { return false; }
        @Override
        public boolean isContainer() { return isContainer; }
        @Override
        public NodePointer createPath(JXPathContext context) { return this; }
        @Override
        public NodePointer createChild(JXPathContext context, QName name, int index) { return null; }
        @Override
        public String getPropertyName() { return "mockParent"; }
        @Override
        public boolean isCollection() { return false; }
        @Override
        public int getPropertyCount() { return 0; }
        @Override
        public String[] getPropertyNames() { return new String[0]; }
        @Override
        public String asPath() { return "mockParentPath"; }
        @Override
        public PropertyPointer getPropertyPointer() {
            if (propertyPointer == null) {
                propertyPointer = new PropertyPointer(this) {
                    private Object value;
                    private String name;
                    @Override
                    public void setValue(Object value) { this.value = value; }
                    @Override
                    public void setPropertyName(String name) { this.name = name; }
                    @Override
                    public QName getName() { return new QName(name); }
                    @Override public int getLength() { return 0; }
                    @Override public Object getBaseValue() { return null; }
                    @Override public Object getImmediateNode() { return null; }
                    @Override public boolean isLeaf() { return true; }
                    @Override public NodePointer getValuePointer() { return null; }
                    @Override public boolean isActual() { return false; }
                    @Override public boolean isContainer() { return false; }
                    @Override public NodePointer createPath(JXPathContext context) { return this; }
                    @Override public NodePointer createChild(JXPathContext context, QName name, int index) { return null; }
                    @Override public String getPropertyName() { return name; }
                    @Override public boolean isCollection() { return false; }
                    @Override public int getPropertyCount() { return 0; }
                    @Override public String[] getPropertyNames() { return new String[0]; }
                    @Override public String asPath() { return "mockProperty." + name; }
                };
            }
            return propertyPointer;
        }
        @Override
        public boolean isDynamicPropertyDeclarationSupported() {
            return dynamicPropertyDeclarationSupported;
        }
    }

    @Test
    public void testSetValueOnNonContainerParent() {
        MockPropertyOwnerPointer mockParent = new MockPropertyOwnerPointer(null, DUMMY_LOCALE, false, false);

        NullPropertyPointer pointer = new NullPropertyPointer(mockParent);
        try {
            pointer.setValue("someValue");
            fail("Expected JXPathInvalidAccessException for non-container parent");
        } catch (JXPathInvalidAccessException expected) {
            assertTrue(expected.getMessage().contains("Cannot set property"));
            assertTrue(expected.getMessage().contains("path does not match a changeable location"));
        }
    }
    
    @Test
    public void testSetValueWithDynamicPropertyDeclarationSupported() {
        MockPropertyOwnerPointer mockParent = new MockPropertyOwnerPointer(null, DUMMY_LOCALE, true, true);
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParent);
        pointer.setPropertyName("dynamicProp");
        Object testValue = "dynamicValue";
        pointer.setValue(testValue);

        PropertyPointer actualPropertyPointer = mockParent.getPropertyPointer();
        assertEquals("dynamicProp", actualPropertyPointer.getPropertyName());
        // The mock property pointer's setValue doesn't expose the value directly.
        // This test verifies that the correct property name is set and no exception is thrown.
    }

    // Mock class to simulate NodePointer for testing createPath/createChild
    private static class MockNodePointer extends NodePointer {
        private Object value;
        private String name;
        private int index;
        private boolean isAttribute;
        private NodePointer attributePointer;
        private NodePointer childPointer;

        MockNodePointer(NodePointer parent, Locale locale) {
            super(parent, locale);
        }

        @Override
        public QName getName() { return new QName(name); }
        public void setName(String name) { this.name = name; }
        @Override
        public int getIndex() { return index; }
        public void setIndex(int index) { this.index = index; }
        @Override
        public void setValue(Object value) { this.value = value; }
        @Override
        public Object getValue() { return value; }
        @Override
        public String asPath() { 
            if (isAttribute) {
                return "[@" + name + "]";
            }
            return "mockPath." + name + (index == WHOLE_COLLECTION ? "" : "[" + (index + 1) + "]");
        }
        @Override public int getLength() { return 0; }
        @Override public Object getBaseValue() { return null; }
        @Override public Object getImmediateNode() { return null; }
        @Override public boolean isLeaf() { return true; }
        @Override public NodePointer getValuePointer() { return null; }
        @Override public boolean isActual() { return false; }
        @Override public boolean isContainer() { return true; }
        @Override public NodePointer createPath(JXPathContext context) { return this; }
        @Override public NodePointer createChild(JXPathContext context, QName name, int index, Object value) { 
            MockNodePointer child = new MockNodePointer(this, locale);
            child.setName(name.getName());
            child.setIndex(index);
            child.setValue(value);
            this.childPointer = child;
            return child;
        }
        @Override public NodePointer createChild(JXPathContext context, QName name, int index) { 
            MockNodePointer child = new MockNodePointer(this, locale);
            child.setName(name.getName());
            child.setIndex(index);
            this.childPointer = child;
            return child;
        }
        @Override public String getPropertyName() { return name; }
        @Override public boolean isCollection() { return index != WHOLE_COLLECTION; }
        @Override public int getPropertyCount() { return 0; }
        @Override public String[] getPropertyNames() { return new String[0]; }

        @Override
        public NodePointer createAttribute(JXPathContext context, QName name) {
            MockNodePointer attr = new MockNodePointer(this, locale);
            attr.setName(name.getName());
            attr.setAttribute(true);
            this.attributePointer = attr;
            return attr;
        }

        public void setAttribute(boolean attribute) { this.isAttribute = attribute; }
        public NodePointer getAttributePointer() { return attributePointer; }
        public NodePointer getChildPointer() { return childPointer; }
    }

    @Test
    public void testCreatePathWithAttribute() {
        MockNodePointer mockParentPointer = new MockNodePointer(null, DUMMY_LOCALE);
        mockParentPointer.setAttribute(true);

        NullPropertyPointer pointer = new NullPropertyPointer(mockParentPointer);
        pointer.setPropertyName("myAttribute");
        pointer.parent = mockParentPointer;

        NodePointer resultPointer = pointer.createPath(DUMMY_CONTEXT);
        assertNotNull(resultPointer);
        assertTrue(resultPointer.isAttribute());
        assertEquals("myAttribute", resultPointer.getName().getName());
    }

    @Test
    public void testCreatePathWithoutAttribute() {
        MockNodePointer mockParentPointer = new MockNodePointer(null, DUMMY_LOCALE);
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParentPointer);
        pointer.setPropertyName("myProperty");
        pointer.setIndex(1); // Test with an index
        pointer.parent = mockParentPointer;

        NodePointer resultPointer = pointer.createPath(DUMMY_CONTEXT);
        assertNotNull(resultPointer);
        assertEquals("myProperty", resultPointer.getName().getName());
        assertEquals(1, resultPointer.getIndex());
        assertTrue(resultPointer instanceof MockNodePointer);
        assertEquals("mockPath.myProperty[2]", resultPointer.asPath());
    }
    
    @Test
    public void testCreatePathWithNullParentAndNullPointerParent() {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setPropertyName("testProp");
        
        NullPointer mockNullPointerParent = new NullPointer(null, new QName("root")) {
            @Override
            public NodePointer createPath(JXPathContext context) {
                return this;
            }
             @Override
             public NodePointer createChild(JXPathContext context, QName name, int index) {
                 // This call path is reached when the NullPropertyPointer's parent is a NullPointer
                 // and the parent's createPath returns itself.
                 // The NullPropertyPointer expects to get a PropertyPointer from the parent (if it's a PropertyOwnerPointer).
                 // Since NullPointer is not a PropertyOwnerPointer, this should lead to an exception.
                 return null; // Indicate no child could be created by a non-PropertyOwnerPointer
             }
        };
        
        pointer.parent = mockNullPointerParent;

        JXPathContext mockContext = JXPathContext.newContext(DUMMY_BEAN);
        AbstractFactory mockFactory = new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext context, String xpath, Object parent, QName name, int index) {
                throw new UnsupportedOperationException("Should not be called");
            }
            @Override
            public boolean createObject(JXPathContext context, String xpath, Object parent, QName name) {
                throw new UnsupportedOperationException("Should not be called");
            }
        };
        mockContext.setFactory(mockFactory);

        try {
            pointer.createPath(mockContext);
            fail("Expected JXPathAbstractFactoryException when parent is NullPointer and parent.createPath returns itself.");
        } catch (JXPathAbstractFactoryException expected) {
            assertTrue(expected.getMessage().contains("Factory null reported success creating object for path:"));
            assertTrue(expected.getMessage().contains("but object was null."));
        }
    }

    @Test
    public void testCreatePathWithPropertyOwnerPointerParent() {
        MockPropertyOwnerPointer mockParent = new MockPropertyOwnerPointer(null, DUMMY_LOCALE, true, false);

        NullPropertyPointer pointer = new NullPropertyPointer(mockParent);
        pointer.setPropertyName("targetProperty");
        pointer.setIndex(3);
        pointer.parent = mockParent;

        NodePointer resultPointer = pointer.createPath(DUMMY_CONTEXT);
        assertNotNull(resultPointer);
        // The result should be the PropertyPointer obtained from the parent
        assertTrue(resultPointer instanceof PropertyPointer);
        assertEquals("targetProperty", resultPointer.getName().getName());
        assertEquals(3, resultPointer.getIndex());
    }

    @Test
    public void testCreatePathAndSetValueWithAttribute() {
        MockNodePointer mockParentPointer = new MockNodePointer(null, DUMMY_LOCALE);
        mockParentPointer.setAttribute(true);
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParentPointer);
        pointer.setPropertyName("myAttribute");
        pointer.parent = mockParentPointer;

        Object testValue = "attributeValue";
        NodePointer resultPointer = pointer.createPath(DUMMY_CONTEXT, testValue);

        assertNotNull(resultPointer);
        assertTrue(resultPointer.isAttribute());
        assertEquals("myAttribute", resultPointer.getName().getName());
        assertEquals(testValue, resultPointer.getValue());
    }

    @Test
    public void testCreatePathAndSetValueWithoutAttribute() {
        MockNodePointer mockParentPointer = new MockNodePointer(null, DUMMY_LOCALE);
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParentPointer);
        pointer.setPropertyName("myProperty");
        pointer.setIndex(2);
        pointer.parent = mockParentPointer;

        Object testValue = "propertyValue";
        NodePointer resultPointer = pointer.createPath(DUMMY_CONTEXT, testValue);

        assertNotNull(resultPointer);
        assertEquals("myProperty", resultPointer.getName().getName());
        assertEquals(2, resultPointer.getIndex());
        assertEquals(testValue, resultPointer.getValue());
        assertTrue(resultPointer instanceof MockNodePointer);
        assertEquals("mockPath.myProperty[3]", resultPointer.asPath());
    }

    @Test
    public void testCreateChildDelegation() {
        MockNodePointer mockParentPointer = new MockNodePointer(null, DUMMY_LOCALE);
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParentPointer);
        pointer.setPropertyName("childProp");
        pointer.setIndex(0);
        pointer.parent = mockParentPointer;

        QName childName = new QName("newChild");
        NodePointer resultPointer = pointer.createChild(DUMMY_CONTEXT, childName, 5);

        assertNotNull(resultPointer);
        assertEquals("newChild", resultPointer.getName().getName());
        assertEquals(5, resultPointer.getIndex());
        assertTrue(resultPointer instanceof MockNodePointer);
        assertEquals("mockPath.newChild[6]", resultPointer.asPath());
    }

    @Test
    public void testCreateChildDelegationWithValue() {
        MockNodePointer mockParentPointer = new MockNodePointer(null, DUMMY_LOCALE);
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParentPointer);
        pointer.setPropertyName("childProp");
        pointer.setIndex(0);
        pointer.parent = mockParentPointer;

        QName childName = new QName("newChild");
        Object testValue = "childValue";
        NodePointer resultPointer = pointer.createChild(DUMMY_CONTEXT, childName, 5, testValue);

        assertNotNull(resultPointer);
        assertEquals(testValue, resultPointer.getValue());
        assertEquals("newChild", resultPointer.getName().getName());
        assertEquals(5, resultPointer.getIndex());
        assertTrue(resultPointer instanceof MockNodePointer);
        assertEquals("mockPath.newChild[6]", resultPointer.asPath());
    }

    @Test
    public void testAsPathDefault() {
        MockNodePointer mockParent = new MockNodePointer(null, DUMMY_LOCALE);
        mockParent.setName("root");
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParent);
        pointer.setPropertyName("defaultPath");
        pointer.parent = mockParent;
        
        assertEquals("mockPath.defaultPath", pointer.asPath());
    }

    @Test
    public void testAsPathWithByNameAttribute() {
        MockNodePointer mockParent = new MockNodePointer(null, DUMMY_LOCALE);
        mockParent.setName("parentPath");
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParent);
        pointer.setNameAttributeValue("attrName");
        pointer.setIndex(1); // Test with index
        pointer.parent = mockParent;

        String expectedPath = "parentPath[@name='attrName'][2]";
        assertEquals(expectedPath, pointer.asPath());
    }

    @Test
    public void testAsPathWithByNameAttributeAndApostrophe() {
        MockNodePointer mockParent = new MockNodePointer(null, DUMMY_LOCALE);
        mockParent.setName("parentPath");
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParent);
        pointer.setNameAttributeValue("attr'name");
        pointer.setIndex(0);
        pointer.parent = mockParent;

        String expectedPath = "parentPath[@name='attr&apos;name'][1]";
        assertEquals(expectedPath, pointer.asPath());
    }

    @Test
    public void testAsPathWithByNameAttributeAndQuote() {
        MockNodePointer mockParent = new MockNodePointer(null, DUMMY_LOCALE);
        mockParent.setName("parentPath");
        
        NullPropertyPointer pointer = new NullPropertyPointer(mockParent);
        pointer.setNameAttributeValue("attr\"name");
        pointer.setIndex(0);
        pointer.parent = mockParent;

        String expectedPath = "parentPath[@name='attr&quot;name'][1]";
        assertEquals(expectedPath, pointer.asPath());
    }


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
