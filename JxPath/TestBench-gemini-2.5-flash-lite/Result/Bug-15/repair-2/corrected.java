package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.QName;
import org.apache.commons.jxpath.ri.RootContext;
import org.apache.commons.jxpath.NodeSet;

// Mock EvalContext to simulate different contexts
class MockEvalContext extends EvalContext {
    private List<Pointer> pointers;
    private int currentPosition = -1;
    private BasicNodeSet nodeSet = new BasicNodeSet();
    private boolean prepared = false;
    private boolean calledNextSet = false;

    public MockEvalContext(EvalContext parentContext, List<Pointer> pointers) {
        super(parentContext);
        this.pointers = pointers != null ? pointers : new ArrayList<>();
        // RootContext is needed by EvalContext constructor, use a mock
        this.rootContext = new RootContext(null, null); 
    }

    @Override
    public Pointer getContextNodePointer() {
        if (currentPosition >= 0 && currentPosition < pointers.size()) {
            return pointers.get(currentPosition);
        }
        return null;
    }

    @Override
    public NodePointer getCurrentNodePointer() {
        if (currentPosition >= 0 && currentPosition < pointers.size()) {
            return (NodePointer) pointers.get(currentPosition);
        }
        return null;
    }

    @Override
    public boolean nextNode() {
        currentPosition++;
        return currentPosition < pointers.size();
    }

    @Override
    public boolean nextSet() {
        if (!calledNextSet) {
            calledNextSet = true;
            for (Pointer pointer : pointers) {
                nodeSet.add(pointer);
            }
        }
        return false; // Only one set for this mock
    }

    @Override
    public boolean setPosition(int position) {
        this.currentPosition = position - 1; // Adjust for 0-based indexing
        if (position > 0 && position <= pointers.size()) {
            // Preparation logic is primarily handled by setPosition in UnionContext.
            // This mock might not need to fully replicate that.
            return true;
        }
        return false;
    }

    @Override
    public NodeSet getNodeSet() {
        if (!prepared) {
            prepared = true;
            // To correctly populate nodeSet for UnionContext, we need to iterate through all nodes.
            // In a real scenario, this would involve nextSet() and nextNode().
            // For this mock, we'll directly add all pointers.
            for (Pointer pointer : pointers) {
                nodeSet.add(pointer);
            }
        }
        return nodeSet;
    }

    @Override
    public int getDocumentOrder() {
        return 0; // Default for mock
    }

    @Override
    public boolean isChildOrderingRequired() {
        return false;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < pointers.size() - 1;
    }

    @Override
    public Object next() {
        if (nextNode()) {
            return getCurrentNodePointer();
        }
        return null;
    }

    @Override
    public void remove() {
        // Not implemented for mock
    }
    
    @Override
    public void reset() {
        this.currentPosition = -1;
        this.prepared = false;
        this.calledNextSet = false;
        this.nodeSet = new BasicNodeSet();
    }
    
    @Override
    public int getCurrentPosition() {
        return currentPosition + 1; // Return 1-based position
    }

    @Override
    public Pointer getSingleNodePointer() {
        return (currentPosition >= 0 && currentPosition < pointers.size()) ? pointers.get(currentPosition) : null;
    }
    
    @Override
    public Object getValue() {
        return getCurrentNodePointer();
    }
}

// Mock NodePointer
abstract class MockNodePointer extends NodePointer {
    protected Object node;
    protected QName name;

    public MockNodePointer(QName name, Object node) {
        super(null, Locale.ROOT); // Parent and locale are not critical for this mock
        this.name = name;
        this.node = node;
    }

    @Override
    public QName getName() {
        return name;
    }

    @Override
    public Object getValue() {
        return node;
    }

    @Override
    public Object getNode() {
        return node;
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
    public void setValue(Object value) {
        this.node = value;
    }

    @Override
    public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
        return 0; // Default for mock
    }

    @Override
    public boolean isLeaf() { return true; }
    @Override
    public boolean isCollection() { return false; }
    @Override
    public int getLength() { return 0; }
    @Override
    public boolean isActual() { return true; }
    @Override
    public NodePointer getValuePointer() { return this; }
    @Override
    public NodePointer getImmediateValuePointer() { return this; }
    @Override
    public Object getRootNode() { return null; } // Not used in this test
    @Override
    public boolean isRoot() { return false; }
    @Override
    public boolean isNode() { return true; }
    @Override
    public boolean isContainer() { return false; }
    @Override
    public int getIndex() { return WHOLE_COLLECTION; }
    @Override
    public void setIndex(int index) { }
    @Override
    public NodePointer createPath(JXPathContext context, Object value) { return this; }
    @Override
    public void remove() { }
    @Override
    public NodePointer createPath(JXPathContext context) { return this; }
    @Override
    public NodePointer createChild( JXPathContext context, QName name, int index, Object value) { return this; }
    @Override
    public boolean testNode(org.apache.commons.jxpath.ri.compiler.NodeTest test) { return true; }
}

// Concrete mock NodePointer for testing values
class MockValueNodePointer extends MockNodePointer {
    public MockValueNodePointer(QName name, Object value) {
        super(name, value);
    }
}


public class UnionContextTest {

    @Test
    public void testGetDocumentOrderSingleContext() throws Exception {
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, null);
        UnionContext unionContext = new UnionContext(null, contexts);
        // A single context should retain its document order
        assertEquals(0, unionContext.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrderMultipleContexts() throws Exception {
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, null);
        contexts[1] = new MockEvalContext(null, null);
        UnionContext unionContext = new UnionContext(null, contexts);
        // Multiple contexts imply a union, which should have document order 1
        assertEquals(1, unionContext.getDocumentOrder());
    }

    @Test
    public void testSetPositionWithEmptyContexts() throws Exception {
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, new ArrayList<>());
        contexts[1] = new MockEvalContext(null, new ArrayList<>());
        UnionContext unionContext = new UnionContext(null, contexts);
        assertTrue(unionContext.setPosition(1)); // Should succeed even if empty
        assertEquals(0, unionContext.getCurrentPosition());
    }

    @Test
    public void testSetPositionWithSingleElementInFirstContext() throws Exception {
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(new MockValueNodePointer(new QName("node1"), "value1"));
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, pointers1);
        contexts[1] = new MockEvalContext(null, new ArrayList<>());
        UnionContext unionContext = new UnionContext(null, contexts);
        assertTrue(unionContext.setPosition(1));
        assertEquals(0, unionContext.getCurrentPosition());
        assertEquals("value1", unionContext.getCurrentNodePointer().getValue());
    }

    @Test
    public void testSetPositionWithSingleElementInSecondContext() throws Exception {
        List<Pointer> pointers2 = new ArrayList<>();
        pointers2.add(new MockValueNodePointer(new QName("node2"), "value2"));
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, new ArrayList<>());
        contexts[1] = new MockEvalContext(null, pointers2);
        UnionContext unionContext = new UnionContext(null, contexts);
        assertTrue(unionContext.setPosition(1));
        assertEquals(0, unionContext.getCurrentPosition());
        assertEquals("value2", unionContext.getCurrentNodePointer().getValue());
    }

    @Test
    public void testSetPositionWithElementsInBothContexts() throws Exception {
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(new MockValueNodePointer(new QName("nodeA"), "valueA"));
        List<Pointer> pointers2 = new ArrayList<>();
        pointers2.add(new MockValueNodePointer(new QName("nodeB"), "valueB"));
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, pointers1);
        contexts[1] = new MockEvalContext(null, pointers2);
        UnionContext unionContext = new UnionContext(null, contexts);

        assertTrue(unionContext.setPosition(1));
        assertEquals(0, unionContext.getCurrentPosition());
        assertEquals("valueA", unionContext.getCurrentNodePointer().getValue());

        assertTrue(unionContext.setPosition(2));
        assertEquals(1, unionContext.getCurrentPosition());
        assertEquals("valueB", unionContext.getCurrentNodePointer().getValue());
    }

    @Test
    public void testSetPositionWithDuplicatePointers() throws Exception {
        MockValueNodePointer sharedPointer = new MockValueNodePointer(new QName("nodeShared"), "sharedValue");
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(sharedPointer);
        pointers1.add(new MockValueNodePointer(new QName("nodeUnique1"), "value1"));
        List<Pointer> pointers2 = new ArrayList<>();
        pointers2.add(new MockValueNodePointer(new QName("nodeUnique2"), "value2"));
        pointers2.add(sharedPointer);
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, pointers1);
        contexts[1] = new MockEvalContext(null, pointers2);
        UnionContext unionContext = new UnionContext(null, contexts);

        assertTrue(unionContext.setPosition(1));
        assertEquals("sharedValue", unionContext.getCurrentNodePointer().getValue());

        assertTrue(unionContext.setPosition(2));
        assertEquals("value1", unionContext.getCurrentNodePointer().getValue());

        assertTrue(unionContext.setPosition(3));
        assertEquals("value2", unionContext.getCurrentNodePointer().getValue());

        // Check that the duplicate pointer is only added once after sorting
        assertEquals(3, unionContext.getNodeSet().getPointers().size());
    }

    @Test
    public void testSetPositionOutOfBoundsNegative() throws Exception {
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, new ArrayList<>());
        UnionContext unionContext = new UnionContext(null, contexts);
        assertFalse(unionContext.setPosition(0)); // Position must be >= 1
    }

    @Test
    public void testSetPositionOutOfBoundsTooLarge() throws Exception {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new MockValueNodePointer(new QName("node1"), "value1"));
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, pointers);
        UnionContext unionContext = new UnionContext(null, contexts);
        assertTrue(unionContext.setPosition(1));
        assertFalse(unionContext.setPosition(2)); // Only one element
    }

    @Test
    public void testGetNodeSetAfterSetPosition() throws Exception {
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(new MockValueNodePointer(new QName("node1"), "value1"));
        List<Pointer> pointers2 = new ArrayList<>();
        pointers2.add(new MockValueNodePointer(new QName("node2"), "value2"));
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, pointers1);
        contexts[1] = new MockEvalContext(null, pointers2);
        UnionContext unionContext = new UnionContext(null, contexts);

        unionContext.setPosition(1);
        NodeSet nodeSet = unionContext.getNodeSet();
        assertEquals(2, nodeSet.getPointers().size());
        assertEquals("value1", nodeSet.getPointers().get(0).getValue());
        assertEquals("value2", nodeSet.getPointers().get(1).getValue());
    }

    @Test
    public void testNextNodeAfterSetPosition() throws Exception {
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(new MockValueNodePointer(new QName("node1"), "value1"));
        pointers1.add(new MockValueNodePointer(new QName("node2"), "value2"));
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, pointers1);
        UnionContext unionContext = new UnionContext(null, contexts);

        assertTrue(unionContext.setPosition(1));
        assertTrue(unionContext.nextNode());
        assertEquals("value1", unionContext.getCurrentNodePointer().getValue());
        assertTrue(unionContext.nextNode());
        assertEquals("value2", unionContext.getCurrentNodePointer().getValue());
        assertFalse(unionContext.nextNode()); // No more nodes
    }

    @Test
    public void testNextNodeWhenPreparedFalse() throws Exception {
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(new MockValueNodePointer(new QName("node1"), "value1"));
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, pointers1);
        UnionContext unionContext = new UnionContext(null, contexts);

        // setPosition is not called, so prepared is false.
        // nextNode should implicitly call setPosition(1) and prepare.
        assertTrue(unionContext.nextNode());
        assertEquals("value1", unionContext.getCurrentNodePointer().getValue());
    }

    @Test
    public void testNextNodeWithMultipleContextsAndNoSetPosition() throws Exception {
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(new MockValueNodePointer(new QName("node1"), "value1"));
        List<Pointer> pointers2 = new ArrayList<>();
        pointers2.add(new MockValueNodePointer(new QName("node2"), "value2"));
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, pointers1);
        contexts[1] = new MockEvalContext(null, pointers2);
        UnionContext unionContext = new UnionContext(null, contexts);

        // nextNode should implicitly call setPosition(1) and prepare.
        assertTrue(unionContext.nextNode());
        assertEquals("value1", unionContext.getCurrentNodePointer().getValue());

        assertTrue(unionContext.nextNode());
        assertEquals("value2", unionContext.getCurrentNodePointer().getValue());

        assertFalse(unionContext.nextNode());
    }

    @Test
    public void testNextSetWhenPreparedFalse() throws Exception {
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(new MockValueNodePointer(new QName("node1"), "value1"));
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, pointers1);
        UnionContext unionContext = new UnionContext(null, contexts);

        // nextSet should implicitly call setPosition(1) and prepare.
        assertTrue(unionContext.nextSet());
        assertEquals(1, unionContext.getNodeSet().getPointers().size());
        assertEquals("value1", unionContext.getNodeSet().getPointers().get(0).getValue());
    }

    @Test
    public void testNextSetWithMultipleContextsAndNoSetPosition() throws Exception {
        List<Pointer> pointers1 = new ArrayList<>();
        pointers1.add(new MockValueNodePointer(new QName("node1"), "value1"));
        List<Pointer> pointers2 = new ArrayList<>();
        pointers2.add(new MockValueNodePointer(new QName("node2"), "value2"));
        EvalContext[] contexts = new EvalContext[2];
        contexts[0] = new MockEvalContext(null, pointers1);
        contexts[1] = new MockEvalContext(null, pointers2);
        UnionContext unionContext = new UnionContext(null, contexts);

        // nextSet should implicitly call setPosition(1) and prepare.
        assertTrue(unionContext.nextSet());
        assertEquals(2, unionContext.getNodeSet().getPointers().size());
        assertEquals("value1", unionContext.getNodeSet().getPointers().get(0).getValue());
        assertEquals("value2", unionContext.getNodeSet().getPointers().get(1).getValue());
    }

    @Test
    public void testGetContextNodePointerWhenSetPositionIsCalledFirst() throws Exception {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new MockValueNodePointer(new QName("node1"), "value1"));
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, pointers);
        UnionContext unionContext = new UnionContext(null, contexts);

        unionContext.setPosition(1);
        // getContextNodePointer should return the same as getCurrentNodePointer after setPosition
        assertEquals(unionContext.getCurrentNodePointer(), unionContext.getContextNodePointer());
    }

    @Test
    public void testGetContextNodePointerWhenNextNodeIsCalledFirst() throws Exception {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new MockValueNodePointer(new QName("node1"), "value1"));
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, pointers);
        UnionContext unionContext = new UnionContext(null, contexts);

        unionContext.nextNode(); // This implicitly calls setPosition(1)
        assertEquals(unionContext.getCurrentNodePointer(), unionContext.getContextNodePointer());
    }

    @Test
    public void testGetContextNodePointerWhenNextSetIsCalledFirst() throws Exception {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new MockValueNodePointer(new QName("node1"), "value1"));
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, pointers);
        UnionContext unionContext = new UnionContext(null, contexts);

        unionContext.nextSet(); // This implicitly calls setPosition(1)
        assertEquals(unionContext.getCurrentNodePointer(), unionContext.getContextNodePointer());
    }

    @Test
    public void testCurrentPositionAfterReset() throws Exception {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new MockValueNodePointer(new QName("node1"), "value1"));
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, pointers);
        UnionContext unionContext = new UnionContext(null, contexts);

        unionContext.setPosition(1);
        assertEquals(1, unionContext.getCurrentPosition()); // setPosition(1) makes currentPosition 1
        unionContext.reset();
        assertEquals(0, unionContext.getCurrentPosition()); // reset() makes currentPosition 0
    }
    
    @Test
    public void testSetPositionWithNullParentContext() throws Exception {
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, new ArrayList<>());
        UnionContext unionContext = new UnionContext(null, contexts);
        assertTrue(unionContext.setPosition(1));
        // parentContext is null in this test setup, which is acceptable.
    }

    @Test
    public void testSetPositionWithEmptyContextsArray() throws Exception {
        EvalContext[] contexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(null, contexts);
        assertFalse(unionContext.setPosition(1)); // No contexts to set position on
    }
}
