package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;

public class UnionContextTest {
    @Test
    public void testSingleContextDocumentOrder() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[1]);
        assertEquals(0, context.getDocumentOrder());
    }

    @Test
    public void testMultipleContextsDocumentOrder() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[2]);
        assertEquals(1, context.getDocumentOrder());
    }

    @Test
    public void testEmptyContextsDocumentOrder() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[0]);
        assertEquals(0, context.getDocumentOrder());
    }

    @Test
    public void testSetPositionZeroWithNoContexts() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[0]);
        assertFalse(context.setPosition(0));
    }

    @Test
    public void testSetPositionOneWithNoContexts() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[0]);
        assertFalse(context.setPosition(1));
    }

    @Test
    public void testSetPositionNegativeWithNoContexts() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[0]);
        assertFalse(context.setPosition(-1));
    }

    @Test
    public void testRepeatedSetPositionWithNoContexts() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[0]);
        assertFalse(context.setPosition(0));
        assertFalse(context.setPosition(0));
    }

    @Test
    public void testSingleNullContextDocumentOrder() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[] { null });
        assertEquals(0, context.getDocumentOrder());
    }

    @Test
    public void testTwoNullContextsDocumentOrder() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[] { null, null });
        assertEquals(1, context.getDocumentOrder());
    }

    @Test
    public void testDocumentOrderUnaffectedByPosition() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[0]);
        assertFalse(context.setPosition(0));
        assertEquals(0, context.getDocumentOrder());
    }

    @Test
    public void testDocumentOrderStableAcrossCalls() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[1]);
        assertEquals(context.getDocumentOrder(), context.getDocumentOrder());
    }

    @Test
    public void testPositionFailureDoesNotChangeDocumentOrder() throws Exception {
        UnionContext context = new UnionContext(null, new EvalContext[0]);
        context.setPosition(-1);
        assertEquals(0, context.getDocumentOrder());
    }
}
