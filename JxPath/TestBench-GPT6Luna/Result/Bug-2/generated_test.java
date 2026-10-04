package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.util.ValueUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

public class ExpressionTest {
    @Test
    public void testContextDependencyIsCached() throws Exception {
        VariableReference expression = new VariableReference(new QName("v"));
        assertEquals(false, expression.isContextDependent());
        assertEquals(false, expression.isContextDependent());
    }

    @Test
    public void testConstantIsContextIndependent() throws Exception {
        Constant expression = new Constant("value");
        assertEquals(false, expression.isContextDependent());
    }

    @Test
    public void testNumberConstantIsContextIndependent() throws Exception {
        Constant expression = new Constant(Integer.valueOf(7));
        assertEquals(false, expression.isContextDependent());
    }

    @Test
    public void testPointerIteratorEmpty() throws Exception {
        Expression.PointerIterator iterator =
                new Expression.PointerIterator(Collections.emptyList().iterator(),
                        new QName(null, "value"), Locale.ROOT);
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testPointerIteratorWrapsScalarValue() throws Exception {
        Expression.PointerIterator iterator =
                new Expression.PointerIterator(Collections.singletonList("x").iterator(),
                        new QName(null, "value"), Locale.ROOT);
        assertEquals(true, iterator.hasNext());
        assertEquals("x", ((Pointer) iterator.next()).getValue());
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testPointerIteratorPassesPointerThrough() throws Exception {
        Pointer pointer = NodePointer.newNodePointer(new QName(null, "value"), "x", Locale.ROOT);
        Expression.PointerIterator iterator =
                new Expression.PointerIterator(Collections.singletonList(pointer).iterator(),
                        new QName(null, "value"), Locale.ROOT);
        assertSame(pointer, iterator.next());
    }

    @Test
    public void testPointerIteratorRemoveUnsupported() throws Exception {
        Expression.PointerIterator iterator =
                new Expression.PointerIterator(Collections.singletonList("x").iterator(),
                        new QName(null, "value"), Locale.ROOT);
        try {
            iterator.remove();
            fail("expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) { }
        assertEquals(true, iterator.hasNext());
    }

    @Test
    public void testValueIteratorEmpty() throws Exception {
        Expression.ValueIterator iterator =
                new Expression.ValueIterator(Collections.emptyList().iterator());
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testValueIteratorReturnsPlainValue() throws Exception {
        Expression.ValueIterator iterator =
                new Expression.ValueIterator(Collections.singletonList("x").iterator());
        assertEquals("x", iterator.next());
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testValueIteratorDereferencesPointer() throws Exception {
        Pointer pointer = NodePointer.newNodePointer(new QName(null, "value"), "x", Locale.ROOT);
        Expression.ValueIterator iterator =
                new Expression.ValueIterator(Collections.singletonList(pointer).iterator());
        assertEquals("x", iterator.next());
    }

    @Test
    public void testValueIteratorRemoveUnsupported() throws Exception {
        Expression.ValueIterator iterator =
                new Expression.ValueIterator(Collections.singletonList("x").iterator());
        try {
            iterator.remove();
            fail("expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) { }
        assertEquals(true, iterator.hasNext());
    }

    @Test
    public void testPointerIteratorKeepsOrder() throws Exception {
        Expression.PointerIterator iterator =
                new Expression.PointerIterator(java.util.Arrays.asList("a", "b").iterator(),
                        new QName(null, "value"), Locale.ROOT);
        assertEquals("a", ((Pointer) iterator.next()).getValue());
        assertEquals("b", ((Pointer) iterator.next()).getValue());
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testValueIteratorKeepsOrder() throws Exception {
        Expression.ValueIterator iterator =
                new Expression.ValueIterator(java.util.Arrays.asList("a", "b").iterator());
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testConstantComputeContextDependent() throws Exception {
        Expression expression = new Constant("v");
        assertEquals(false, expression.computeContextDependent());
    }

    @Test
    public void testConstantComputeValueWithNullContext() throws Exception {
        Expression expression = new Constant("v");
        assertEquals("v", expression.computeValue(null));
    }

    @Test
    public void testConstantComputeWithNullContext() throws Exception {
        Expression expression = new Constant("v");
        assertEquals("v", expression.compute(null));
    }

    @Test
    public void testConstantIterateProducesValue() throws Exception {
        Expression expression = new Constant("v");
        Iterator iterator = expression.iterate(null);
        assertEquals(true, iterator.hasNext());
        assertEquals("v", iterator.next());
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testConstantIteratePointersProducesPointerValue() throws Exception {
        Expression expression = new Constant("v");
        try {
            expression.iteratePointers(null);
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testConstantNumberIterateProducesNumber() throws Exception {
        Expression expression = new Constant(Integer.valueOf(0));
        Iterator iterator = expression.iterate(null);
        assertEquals(true, iterator.hasNext());
        assertEquals(Integer.valueOf(0), iterator.next());
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testVariableContextDependencyDirectly() throws Exception {
        Expression expression = new VariableReference(new QName("v"));
        assertEquals(false, expression.computeContextDependent());
    }

    @Test
    public void testVariableComputeValueWithNullContextThrows() throws Exception {
        Expression expression = new VariableReference(new QName("v"));
        try {
            expression.computeValue(null);
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testVariableComputeWithNullContextThrows() throws Exception {
        Expression expression = new VariableReference(new QName("v"));
        try {
            expression.compute(null);
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testVariableIterateWithNullContextThrows() throws Exception {
        Expression expression = new VariableReference(new QName("v"));
        try {
            expression.iterate(null);
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testVariableIteratePointersWithNullContextThrows() throws Exception {
        Expression expression = new VariableReference(new QName("v"));
        try {
            expression.iteratePointers(null);
            fail("expected NullPointerException");
        }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testPointerIteratorEmptyHasNoNext() throws Exception {
        Expression.PointerIterator iterator =
                new Expression.PointerIterator(Collections.emptyList().iterator(),
                        new QName(null, "value"), Locale.ROOT);
        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void testValueIteratorSingleNullValue() throws Exception {
        Expression.ValueIterator iterator =
                new Expression.ValueIterator(Collections.singletonList(null).iterator());
        assertEquals(true, iterator.hasNext());
        assertNull(iterator.next());
        assertEquals(false, iterator.hasNext());
    }
}
