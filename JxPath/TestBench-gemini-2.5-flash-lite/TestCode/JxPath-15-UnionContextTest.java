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
    public boolean testNode(org.apache.commons.jxpath.ri.compiler.NodeTest test) { return true; }
}

// Concrete mock NodePointer for testing values
class MockValueNodePointer extends MockNodePointer {
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
    public void testSetPositionOutOfBoundsNegative() throws Exception {
        EvalContext[] contexts = new EvalContext[1];
        contexts[0] = new MockEvalContext(null, new ArrayList<>());
        UnionContext unionContext = new UnionContext(null, contexts);
        assertFalse(unionContext.setPosition(0)); // Position must be >= 1
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


