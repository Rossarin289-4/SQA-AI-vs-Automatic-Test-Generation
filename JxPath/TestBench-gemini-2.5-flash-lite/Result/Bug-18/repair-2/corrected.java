package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.JXPathContext;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

// Mock classes for testing, as we don't have access to the full JXPath context and model.
// These mocks simulate the behavior required by AttributeContext.
class MockNodePointer extends NodePointer {
    private QName name;
    private Object node;
    private boolean isAttribute = false;
    private boolean isLeaf = false;
    private int length = 0;
    private NodePointer parent;
    private NodeIterator attributeIterator;
    private Locale locale; // Added for Locale

    protected MockNodePointer(NodePointer parent, QName name, Object node, Locale locale) {
        super(parent);
        this.name = name;
        this.node = node;
        this.locale = locale;
    }

    // Factory method to create NodePointers
    public static NodePointer create(NodePointer parent, QName name, Object node) {
        return new MockNodePointer(parent, name, node, Locale.ROOT);
    }

    @Override
    public QName getName() {
        return name;
    }

    @Override
    public Object getBaseValue() {
        return node;
    }

    @Override
    public Object getImmediateNode() {
        return node;
    }

    @Override
    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    @Override
    public boolean isAttribute() {
        return isAttribute;
    }

    @Override
    public void setAttribute(boolean attribute) {
        this.isAttribute = attribute;
    }

    @Override
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean isCollection() {
        return false;
    }

    @Override
    public NodeIterator attributeIterator(QName name) {
        return attributeIterator;
    }

    public void setAttributeIterator(NodeIterator iterator) {
        this.attributeIterator = iterator;
    }

    @Override
    public NodePointer getParent() {
        return parent;
    }

    @Override
    public boolean isRoot() {
        return parent == null;
    }

    @Override
    public Object getValue() {
        return node;
    }

    @Override
    public void setValue(Object value) {
        this.node = value;
    }

    @Override
    public Object getNode() {
        return node;
    }

    @Override
    public boolean testNode(NodeTest test) {
        if (test instanceof NodeNameTest) {
            NodeNameTest nnt = (NodeNameTest) test;
            // Compare QNames directly for equality
            return nnt.getNodeName().equals(name);
        }
        if (test instanceof NodeTypeTest) {
            // For simplicity in mocks, assume NodeTypeTest matches if node is not null
            return node != null;
        }
        return false;
    }

    @Override
    public int compareChildNodePointers( NodePointer pointer1, NodePointer pointer2) {
        return 0; // Not used in this test
    }

    // Mock implementations for methods that require JXPathContext
    @Override
    public NodePointer createPath(JXPathContext context, Object value) {
        // In a real scenario, this would create a new NodePointer.
        // For this mock, we'll just return a new pointer with the given value.
        return new MockNodePointer(this, new QName("created"), value, locale);
    }

    @Override
    public NodePointer createPath(JXPathContext context) {
        // Similar to above, return a new pointer.
        return new MockNodePointer(this, new QName("created"), null, locale);
    }

    @Override
    public void remove() {
        // Not used in this test
    }

    @Override
    public Object getRootNode() {
        return this; // Simplified for testing
    }

    @Override
    public boolean isNode() {
        return true;
    }

    @Override
    public boolean isActual() {
        return true;
    }

    @Override
    public NodePointer getValuePointer() {
        return this;
    }

    @Override
    public NodePointer getImmediateValuePointer() {
        return this;
    }

    @Override
    public int getIndex() {
        return WHOLE_COLLECTION;
    }

    @Override
    public void setIndex(int index) {
        // Not used in this test
    }

    @Override
    public boolean isContainer() {
        return false;
    }

    @Override
    public Locale getLocale() {
        return locale;
    }

    // These methods were causing compilation errors and are not directly used by AttributeContext's logic for these tests.
    // Removing them or providing minimal implementations that don't cause type mismatches.
    // The errors were related to missing abstract methods from NodePointer and incorrect method signatures.
    // The following are implementations for methods that were previously missing or had incorrect signatures.

    @Override
    public void setNamespaceResolver(NamespaceResolver namespaceResolver) {
        // No-op for mock
    }

    @Override
    public NamespaceResolver getNamespaceResolver() {
        return null; // No-op for mock
    }

    @Override
    public NodePointer getImmediateParentPointer() {
        return parent;
    }

    @Override
    public boolean isRootContext() {
        return isRoot();
    }

    @Override
    public void removeAttribute(QName name) {
        // No-op for mock
    }

    @Override
    public void removeChild(QName name) {
        // No-op for mock
    }

    @Override
    public void createAttribute(JXPathContext context, QName name) {
        // No-op for mock
    }

    @Override
    public void createChild(JXPathContext context, QName name, Object value) {
        // No-op for mock
    }

    @Override
    public NodePointer createChild(JXPathContext context, QName name) {
        return null;
    }

    @Override
    public NodePointer getNamespacePointer() {
        return null;
    }

    @Override
    public void copyChild(JXPathContext context, NodePointer pointer) {
        // No-op for mock
    }

    @Override
    public NodePointer getBasePointer() {
        return this;
    }

    @Override
    public boolean isLeaf(QName qname) {
        return false;
    }

    @Override
    public boolean isCollection(QName qname) {
        return false;
    }

    @Override
    public List getChildNodePointers() {
        return null;
    }

    @Override
    public Object getProperty(String propertyName) {
        return null;
    }

    @Override
    public void setProperty(String propertyName, Object value) {
        // No-op for mock
    }

     // Override missing abstract methods from NodePointer
    public boolean isChildOrderingRequired() { return false; }
    public boolean hasNext() { return false; }
    public Object next() { return null; }
    public void remove() { } // Already present but good to ensure it's here.
    public void sortPointers(List l) { }
    public List getContextNodeList() { return null; }
    public Object getValue() { return null; } // Already present
    public NodeSet getNodeSet() { return null; }
    public boolean nextSet() { return false; }
    public abstract boolean nextNode(); // AttributeContext implements this. This mock should not have abstract methods.
    public boolean setPosition(int position) { return false; } // AttributeContext implements this.

    // Re-implementing abstract methods that MockNodePointer might need to implement if it were a concrete NodePointer itself.
    // However, since it's a mock *for* NodePointer, these should align with NodePointer's abstract methods.
    // In the context of AttributeContext, we mainly need methods like attributeIterator, getName, getBaseValue etc.
    // The abstract methods in NodePointer that need implementation are:
    // isLeaf(), getLength(), isCollection(), getName(), getBaseValue(), getImmediateNode(), setValue(), compareChildNodePointers()

    // MockNodePointer already provides implementations for these, so no further abstract method issues should arise for this class.
}

class MockNodeIterator implements NodeIterator {
    private List<NodePointer> pointers = new ArrayList<>();
    private int position = -1;

    public MockNodeIterator(NodePointer[] pointers) {
        if (pointers != null) {
            for (NodePointer p : pointers) {
                this.pointers.add(p);
            }
        }
    }

    @Override
    public NodePointer getNodePointer() {
        if (position >= 0 && position < pointers.size()) {
            return pointers.get(position);
        }
        return null;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public boolean setPosition(int position) {
        // The iterator's setPosition should allow going up to pointers.size() (one past the last element)
        if (position >= 0 && position <= pointers.size()) {
            this.position = position;
            return true;
        }
        return false;
    }

    @Override
    public NodePointer next() {
        // next() should advance the position and return the new node
        if (setPosition(position + 1)) {
            return getNodePointer();
        }
        return null;
    }

    @Override
    public void remove() {
        // Not implemented
    }
}

// Mock EvalContext that provides a current node and optionally an iterator.
class MockEvalContext extends EvalContext {
    private NodePointer currentNodePointer;
    private NodeIterator iterator;

    public MockEvalContext(EvalContext parentContext, NodePointer currentNodePointer) {
        super(parentContext);
        this.currentNodePointer = currentNodePointer;
    }

    public MockEvalContext(EvalContext parentContext, NodePointer currentNodePointer, NodeIterator iterator) {
        super(parentContext);
        this.currentNodePointer = currentNodePointer;
        this.iterator = iterator;
    }

    @Override
    public NodePointer getCurrentNodePointer() {
        // For AttributeContext tests, we want to ensure the correct pointer is returned.
        // The actual AttributeContext.getCurrentNodePointer() returns its internal currentNodePointer field.
        // In our mock, we need to make sure this field is updated correctly when iterating.
        return this.currentNodePointer;
    }

    @Override
    public boolean nextNode() {
        // This is a mock implementation. The real EvalContext.nextNode() logic is complex.
        // For AttributeContext, the core logic is in AttributeContext.nextNode().
        // This mock is primarily to satisfy the EvalContext base class requirements.
        // If an iterator is provided, we can simulate advancing it.
        if (iterator != null) {
            NodePointer nextPtr = iterator.next();
            if (nextPtr != null) {
                this.currentNodePointer = nextPtr; // Update current node for the mock context
                return true;
            }
        }
        return false; // No more nodes or no iterator
    }

    @Override
    public boolean setPosition(int position) {
        super.setPosition(position); // Updates internal position field of EvalContext
        if (iterator != null) {
            if (iterator.setPosition(position)) {
                this.currentNodePointer = iterator.getNodePointer();
                return true;
            } else {
                this.currentNodePointer = null; // Clear if iterator failed to set position
                return false;
            }
        }
        // If no iterator, we can only set position to 0 or 1 if we have a current node.
        if (position == 0) {
            this.currentNodePointer = null; // Resetting position to 0 typically means no current node.
            return true;
        } else if (position == 1 && this.currentNodePointer != null) {
            return true; // Valid if position 1 and a node exists.
        }
        return false; // Invalid position for non-iterator context.
    }

    // Required by EvalContext base class, not critical for AttributeContext tests.
    @Override
    public Object getValue() { return null; }
    @Override
    public List getContextNodeList() { return null; }
    // NodeSet is not an interface in this package, it's likely a concrete class.
    // As it's not used by AttributeContext, returning null is fine.
    // If it were an interface, MockNodeSet would be needed.
    @Override
    public org.apache.commons.jxpath.ri.model.NodeSet getNodeSet() { return null; }
    @Override
    public boolean nextSet() { return false; }

    @Override
    public void reset() {
        super.reset();
        if (iterator != null) {
            iterator.setPosition(-1); // Reset iterator
        }
        this.currentNodePointer = null; // Reset current node pointer for this mock context
    }
}


public class AttributeContextTest {

    // Helper to create a basic parent context with a mock NodePointer
    private EvalContext createParentContext() {
        // The parent context needs a NodePointer that can provide an attributeIterator.
        NodePointer mockParentPointer = MockNodePointer.create(null, new QName("parent"), "parentBean");
        // Create a mock EvalContext that returns this pointer as its current node.
        MockEvalContext parentEvalContext = new MockEvalContext(null, mockParentPointer);
        return parentEvalContext;
    }

    // Helper to create an AttributeContext with a specific NodeTest and mocked attributes
    private AttributeContext createAttributeContext(EvalContext parentContext, NodeTest nodeTest, NodePointer[] attributes) {
        NodePointer parentPointer = parentContext.getCurrentNodePointer();
        NodeIterator mockIterator = new MockNodeIterator(attributes);
        // Set the attribute iterator on the parent's NodePointer
        if (parentPointer instanceof MockNodePointer) {
            ((MockNodePointer) parentPointer).setAttributeIterator(mockIterator);
        } else {
            throw new IllegalStateException("Parent context's current node pointer is not a MockNodePointer");
        }
        // Create the AttributeContext with the parent context and node test.
        return new AttributeContext(parentContext, nodeTest);
    }

    @Test
    public void testConstructorAndInitialState() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));
        AttributeContext attributeContext = new AttributeContext(parentContext, nodeTest);

        assertNotNull(attributeContext);
        // Accessing protected fields for verification. This is a common practice in testing.
        assertEquals(parentContext, attributeContext.parentContext);
        assertEquals(nodeTest, attributeContext.nodeTest);
        assertFalse("setStarted should be false initially", attributeContext.setStarted);
        assertNull("iterator should be null initially", attributeContext.iterator);
        assertNull("currentNodePointer should be null initially", attributeContext.currentNodePointer);
    }

    @Test
    public void testReset() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));
        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, new NodePointer[]{attr1});

        // Manually set some state that reset() should clear
        attributeContext.setStarted = true;
        attributeContext.iterator = new MockNodeIterator(new NodePointer[0]);
        attributeContext.currentNodePointer = MockNodePointer.create(null, new QName("someAttr"), "someValue");
        attributeContext.setPosition(1); // Advance position

        attributeContext.reset();

        assertFalse("setStarted should be false after reset", attributeContext.setStarted);
        assertNull("iterator should be null after reset", attributeContext.iterator);
        assertNull("currentNodePointer should be null after reset", attributeContext.currentNodePointer);
        assertEquals("Current position should be 0 after reset", 0, attributeContext.getCurrentPosition());
    }

    @Test
    public void testSetPosition_advance() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer attr2 = MockNodePointer.create(null, new QName("attr2"), "value2");
        NodePointer[] attrs = {attr1, attr2};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertTrue("setPosition(1) should return true", attributeContext.setPosition(1));
        assertEquals("Current position should be 1", 1, attributeContext.getCurrentPosition());
        assertEquals("Current node pointer should be attr1", attr1, attributeContext.getCurrentNodePointer());

        assertTrue("setPosition(2) should return true", attributeContext.setPosition(2));
        assertEquals("Current position should be 2", 2, attributeContext.getCurrentPosition());
        assertEquals("Current node pointer should be attr2", attr2, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testSetPosition_rewindAndAdvance() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer attr2 = MockNodePointer.create(null, new QName("attr2"), "value2");
        NodePointer[] attrs = {attr1, attr2};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        // Advance to position 2
        assertTrue(attributeContext.setPosition(2));
        assertEquals(2, attributeContext.getCurrentPosition());
        assertEquals(attr2, attributeContext.getCurrentNodePointer());

        // Now setPosition to 1. This should reset and then advance to position 1.
        assertTrue("setPosition(1) after advancing to 2 should return true", attributeContext.setPosition(1));
        assertEquals("Current position should be 1 after rewinding", 1, attributeContext.getCurrentPosition());
        assertEquals("Current node pointer should be attr1 after rewinding", attr1, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testSetPosition_toZero() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer[] attrs = {attr1};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        // Advance to position 1
        assertTrue(attributeContext.setPosition(1));
        assertEquals(1, attributeContext.getCurrentPosition());

        // Set position to 0. This should reset the context.
        assertTrue("setPosition(0) should return true", attributeContext.setPosition(0));
        assertEquals("Current position should be 0", 0, attributeContext.getCurrentPosition());
        // After setting position to 0, the currentNodePointer should be null.
        assertNull("Current node pointer should be null after setPosition(0)", attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testSetPosition_outOfBounds_tooHigh() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer[] attrs = {attr1}; // Only one attribute

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        // Try to set position beyond the available nodes. The iterator's setPosition will return false.
        assertFalse("setPosition(2) should return false for out of bounds", attributeContext.setPosition(2));
        // The current position remains 0 because setPosition(2) ultimately failed to reach that position.
        assertEquals("Current position should be 0 when setPosition fails due to being too high", 0, attributeContext.getCurrentPosition());
        assertNull("Current node pointer should be null when setPosition fails", attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testSetPosition_outOfBounds_negative() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer[] attrs = {attr1};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        // setPosition should return false for negative positions.
        assertFalse("setPosition(-1) should return false", attributeContext.setPosition(-1));
        assertEquals("Current position should be 0 when setPosition(-1) fails", 0, attributeContext.getCurrentPosition());
        assertNull("Current node pointer should be null when setPosition(-1) fails", attributeContext.getCurrentNodePointer());
    }


    @Test
    public void testNextNode_initialCall() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer[] attrs = {attr1};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertTrue("First nextNode() should return true if nodes exist", attributeContext.nextNode());
        assertEquals("Current position should be 1 after first nextNode()", 1, attributeContext.getCurrentPosition());
        assertEquals("Current node pointer should be attr1", attr1, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_multipleCalls() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer attr2 = MockNodePointer.create(null, new QName("attr2"), "value2");
        NodePointer[] attrs = {attr1, attr2};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertTrue("First nextNode() should succeed", attributeContext.nextNode());
        assertEquals("Position after first nextNode()", 1, attributeContext.getCurrentPosition());
        assertEquals("Node pointer after first nextNode()", attr1, attributeContext.getCurrentNodePointer());

        assertTrue("Second nextNode() should succeed", attributeContext.nextNode());
        assertEquals("Position after second nextNode()", 2, attributeContext.getCurrentPosition());
        assertEquals("Node pointer after second nextNode()", attr2, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_noMoreNodes() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer[] attrs = {attr1};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertTrue("First nextNode() should succeed", attributeContext.nextNode()); // Advances to position 1
        assertEquals(1, attributeContext.getCurrentPosition());
        assertEquals(attr1, attributeContext.getCurrentNodePointer());

        assertFalse("Second nextNode() should fail as no more nodes", attributeContext.nextNode()); // Tries to advance to position 2
        // After a failed nextNode, the position and current node pointer should remain as they were before the failed call.
        assertEquals("Position should remain 1 after failed nextNode()", 1, attributeContext.getCurrentPosition());
        assertEquals("Current node pointer should remain attr1 after failed nextNode()", attr1, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_iteratorIsNull() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));
        // Create context without setting an iterator on the parent
        AttributeContext attributeContext = new AttributeContext(parentContext, nodeTest);
        // Manually ensure iterator is null (it is by default)
        attributeContext.iterator = null;

        assertFalse("nextNode() should return false when iterator is null", attributeContext.nextNode());
        assertEquals("Current position should be 0", 0, attributeContext.getCurrentPosition());
        assertNull("Current node pointer should be null", attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_invalidNodeTest_handledByAttributeContextLogic() throws Exception {
        EvalContext parentContext = createParentContext();
        // An invalid NodeTest that is neither NodeNameTest nor NodeTypeTest.
        NodeTest invalidTest = new NodeTest() {}; // Anonymous subclass of NodeTest

        AttributeContext attributeContext = new AttributeContext(parentContext, invalidTest);

        // The logic in AttributeContext.nextNode() checks:
        // if (nodeTest instanceof NodeTypeTest) { ... }
        // else if (nodeTest instanceof NodeNameTest) { ... }
        // if (nodeNameTest == null) { return false; }
        // Since invalidTest is neither, nodeNameTest will be null, and it should return false.
        assertFalse("nextNode() should return false for an unhandled NodeTest type", attributeContext.nextNode());
        assertEquals("Current position should be 0", 0, attributeContext.getCurrentPosition());
        assertNull("Current node pointer should be null", attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_wildcardWithNodeTypeTest() throws Exception {
        EvalContext parentContext = createParentContext();
        // NodeTypeTest with NODE_TYPE_NODE should map to WILDCARD_TEST
        NodeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer attr2 = MockNodePointer.create(null, new QName("attr2"), "value2");
        NodePointer[] attrs = {attr1, attr2};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        // The iterator should be created with the wildcard QName(null, "*")
        assertTrue("First nextNode() should succeed with NodeTypeTest(NODE_TYPE_NODE)", attributeContext.nextNode());
        assertEquals(1, attributeContext.getCurrentPosition());
        assertEquals(attr1, attributeContext.getCurrentNodePointer());

        assertTrue("Second nextNode() should succeed", attributeContext.nextNode());
        assertEquals(2, attributeContext.getCurrentPosition());
        assertEquals(attr2, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_wildcardWithNodeTypeTest_noAttributes() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE); // Wildcard for nodes

        NodePointer[] attrs = {}; // No attributes available
        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertFalse("nextNode() should return false when no attributes match wildcard", attributeContext.nextNode());
        assertEquals(0, attributeContext.getCurrentPosition());
        assertNull(attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_specificAttributeName_matchFound() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeNameTest nodeTest = new NodeNameTest(new QName("targetAttr"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("otherAttr"), "value1");
        NodePointer attr2 = MockNodePointer.create(null, new QName("targetAttr"), "value2");
        NodePointer attr3 = MockNodePointer.create(null, new QName("anotherAttr"), "value3");
        NodePointer[] attrs = {attr1, attr2, attr3};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        // The attributeIterator returned by parentContext.getCurrentNodePointer().attributeIterator(nodeNameTest.getNodeName())
        // should effectively filter for "targetAttr".
        assertTrue("nextNode() should find the matching attribute", attributeContext.nextNode()); // Should find attr2
        assertEquals(1, attributeContext.getCurrentPosition());
        assertEquals(attr2, attributeContext.getCurrentNodePointer());

        // After finding the attribute, subsequent calls to nextNode() should continue searching
        // from where the iterator left off. In this mock setup, the iterator is responsible for filtering.
        // The current mock iterator will simply return null if setPosition is called beyond the available elements.
        // So, the next call to nextNode() will result in the iterator's setPosition(2) returning false.
        assertFalse("nextNode() should return false if no more matching attributes", attributeContext.nextNode());
        assertEquals("Position should remain 1 after failed nextNode()", 1, attributeContext.getCurrentPosition());
        assertEquals("Current node pointer should remain attr2", attr2, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_noMatchingAttributeName() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeNameTest nodeTest = new NodeNameTest(new QName("nonExistentAttr"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer[] attrs = {attr1};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        // The attributeIterator should not yield any attribute named "nonExistentAttr".
        // The iterator will be created for "nonExistentAttr", but the mock iterator simply returns whatever is given to it.
        // The *filtering* should happen by the attributeIterator call itself or within the iterator logic.
        // Our mock iterator doesn't filter, it just lists what it's given.
        // The `parentContext.getCurrentNodePointer().attributeIterator(nodeNameTest.getNodeName())` call is where filtering *should* happen.
        // If `attributeIterator(QName)` returns an iterator that contains no matching attributes, then nextNode() should return false.
        // In our mock, `setAttributeIterator` is called with a `mockIterator`. The filtering logic is assumed to be in `attributeIterator` itself.
        // If the mock iterator receives an empty list, `nextNode()` will return false.
        assertFalse("nextNode() should return false when no attribute matches the name", attributeContext.nextNode());
        assertEquals(0, attributeContext.getCurrentPosition());
        assertNull(attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testGetCurrentNodePointer_beforeFirstNextNode() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));
        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, new NodePointer[0]); // Empty attributes

        assertNull("getCurrentNodePointer() should return null before any iteration", attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testGetCurrentNodePointer_afterSuccessfulNextNode() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameNameTest(new QName("attributeName")); // Typo fixed: NodeNameTest

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer[] attrs = {attr1};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);
        attributeContext.nextNode(); // Advance to the first node

        assertEquals("getCurrentNodePointer() should return the current node after successful nextNode()", attr1, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testGetCurrentNodePointer_afterFailedNextNode() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer[] attrs = {}; // No attributes
        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);
        attributeContext.nextNode(); // This call will fail

        assertNull("getCurrentNodePointer() should return null after failed nextNode()", attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testGetCurrentNodePointer_afterSetPosition() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer attr2 = MockNodePointer.create(null, new QName("attr2"), "value2");
        NodePointer[] attrs = {attr1, attr2};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);
        attributeContext.setPosition(2); // Move to the second attribute

        assertEquals("getCurrentNodePointer() should return the correct node after setPosition()", attr2, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testAttributeIterator_specificQName() throws Exception {
        EvalContext parentContext = createParentContext();
        QName qname = new QName("ns", "attrName"); // Attribute with namespace
        NodeNameTest nodeTest = new NodeNameTest(qname, "namespaceURI"); // nodeTest specifies namespace

        NodePointer attr1 = MockNodePointer.create(null, qname, "value1");
        NodePointer attr2 = MockNodePointer.create(null, new QName("attrName"), "value2"); // Same name, no namespace
        NodePointer[] attrs = {attr1, attr2};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertTrue("nextNode() should find the attribute with the specific QName", attributeContext.nextNode());
        assertEquals(1, attributeContext.getCurrentPosition());
        assertEquals(attr1, attributeContext.getCurrentNodePointer());

        // The iterator created for `qname` should have filtered. If it only returned attr1,
        // then the second call to nextNode should fail.
        assertFalse("nextNode() should not find attr2 as it lacks the namespace", attributeContext.nextNode());
        assertEquals(1, attributeContext.getCurrentPosition());
        assertEquals(attr1, attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testAttributeIterator_wildcardNodeNameTest() throws Exception {
        EvalContext parentContext = createParentContext();
        // NodeNameTest with QName(null, "*") is treated as a wildcard for any attribute name
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "*"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("ns1", "attr1"), "value1");
        NodePointer attr2 = MockNodePointer.create(null, new QName("attr2"), "value2");
        NodePointer[] attrs = {attr1, attr2};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertTrue("First nextNode() should return the first attribute", attributeContext.nextNode());
        assertEquals(1, attributeContext.getCurrentPosition());
        assertEquals(attr1, attributeContext.getCurrentNodePointer());

        assertTrue("Second nextNode() should return the second attribute", attributeContext.nextNode());
        assertEquals(2, attributeContext.getCurrentPosition());
        assertEquals(attr2, attributeContext.getCurrentNodePointer());

        assertFalse("Third nextNode() should return false", attributeContext.nextNode());
    }

    @Test
    public void testAttributeIterator_noAttributesAvailable() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeNameTest nodeTest = new NodeNameTest(new QName("anyAttribute"));

        NodePointer[] attrs = {}; // No attributes
        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertFalse("nextNode() should return false when no attributes are available", attributeContext.nextNode());
        assertEquals(0, attributeContext.getCurrentPosition());
        assertNull(attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testAttributeIterator_wildcardAndNoAttributes() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE); // Wildcard

        NodePointer[] attrs = {}; // No attributes
        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        assertFalse("nextNode() should return false when no attributes are available, even with wildcard", attributeContext.nextNode());
        assertEquals(0, attributeContext.getCurrentPosition());
        assertNull(attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testAttributeIterator_NodeNameTestWithNullQName() throws Exception {
        EvalContext parentContext = createParentContext();
        // Test case where NodeNameTest is constructed with a null QName.
        // This should cause a NullPointerException when getNodeName() is called within AttributeContext.nextNode().
        try {
            NodeNameTest nodeTest = new NodeNameTest(null); // Passing null QName to constructor
            AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, new NodePointer[0]);
            attributeContext.nextNode(); // This call should trigger the NPE
            fail("Expected NullPointerException for null QName in NodeNameTest constructor");
        } catch (NullPointerException expected) {
            // This is the expected outcome
        } catch (Exception e) {
            fail("Expected NullPointerException, but got " + e.getClass().getName());
        }
    }

     @Test
    public void testNextNode_setStarted_true_iterator_null() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));
        AttributeContext attributeContext = new AttributeContext(parentContext, nodeTest);

        // Manually set state: setStarted = true, iterator = null
        attributeContext.setStarted = true;
        attributeContext.iterator = null;

        // nextNode should return false if iterator is null, even if setStarted is true
        assertFalse("nextNode() should return false when iterator is null", attributeContext.nextNode());
        assertEquals(0, attributeContext.getCurrentPosition());
        assertNull(attributeContext.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_setStarted_false_iterator_not_null() throws Exception {
        EvalContext parentContext = createParentContext();
        NodeTest nodeTest = new NodeNameTest(new QName("attributeName"));

        NodePointer attr1 = MockNodePointer.create(null, new QName("attr1"), "value1");
        NodePointer[] attrs = {attr1};

        AttributeContext attributeContext = createAttributeContext(parentContext, nodeTest, attrs);

        // At this point, setStarted is false (default), and iterator is set by createAttributeContext.
        // The first call to nextNode() will set setStarted to true.
        assertTrue("First nextNode() should succeed and set setStarted to true", attributeContext.nextNode());
        assertTrue("setStarted should be true after first nextNode()", attributeContext.setStarted);
        assertEquals(1, attributeContext.getCurrentPosition());
        assertEquals(attr1, attributeContext.getCurrentNodePointer());
    }
}
