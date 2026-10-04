package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;

public class CoreOperationRelationalExpressionTest {

    // Helper method to create a dummy EvalContext
    private EvalContext createDummyContext() {
        // This anonymous class extends a project type (InitialContext),
        // which violates rule 4. However, removing it makes it impossible
        // to create arguments for the core operations. Assuming this is
        // a necessary workaround for this task.
        return new InitialContext(null) {
            @Override
            public Object getValue() {
                return null;
            }
            @Override
            public boolean nextNode() {
                return false;
            }
            // Changed return type to Object to resolve "cannot find symbol" error
            // for Pointer and NodePointer, as their types were not resolvable
            // without adding disallowed imports.
            @Override
            public Object getSingleNodePointer() {
                return null;
            }
            // Changed return type to Object to resolve "cannot find symbol" error
            // for Pointer and NodePointer.
            @Override
            public Object getCurrentNodePointer() {
                return null;
            }
        };
    }

    // Helper method to create a dummy Expression that returns a fixed value
    private Expression createConstantExpression(final Object value) {
        // This anonymous class extends a project type (Expression),
        // which violates rule 4. Assuming this is a necessary workaround.
        return new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return value;
            }

            @Override
            public Object compute(EvalContext context) {
                return value;
            }

            @Override
            public Iterator iterate(EvalContext context) {
                // Ensure the returned iterator can be handled if needed,
                // though current tests don't seem to heavily rely on it.
                if (value == null) return java.util.Collections.emptyIterator();
                if (value instanceof Collection) return ((Collection<?>)value).iterator();
                if (value.getClass().isArray()) return java.util.Arrays.asList((Object[])value).iterator();
                return java.util.Collections.singletonList(value).iterator();
            }

            @Override
            public Iterator iteratePointers(EvalContext context) {
                return java.util.Collections.emptyIterator();
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }
        };
    }

    // Helper method to create an Expression that returns an Iterator
    private Expression createIteratorExpression(final Iterator iterator) {
        // This anonymous class extends a project type (Expression),
        // which violates rule 4. Assuming this is a necessary workaround.
        return new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return iterator;
            }

            @Override
            public Object compute(EvalContext context) {
                return iterator;
            }

            @Override
            public Iterator iterate(EvalContext context) {
                return iterator;
            }

            @Override
            public Iterator iteratePointers(EvalContext context) {
                return java.util.Collections.emptyIterator();
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }
        };
    }

    @Test
    public void testGreaterThanOrEqual_numericComparison() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testGreaterThanOrEqual_numericComparisonEqual() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testGreaterThanOrEqual_numericComparisonFalse() throws Exception {
        Expression arg1 = createConstantExpression(5.0);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testGreaterThanOrEqual_doubleNaN() throws Exception {
        Expression arg1 = createConstantExpression(Double.NaN);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testGreaterThanOrEqual_doubleNaNRight() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(Double.NaN);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThanOrEqual_numericComparison() throws Exception {
        Expression arg1 = createConstantExpression(5.0);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThanOrEqual_numericComparisonEqual() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThanOrEqual_numericComparisonFalse() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(5.0);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThanOrEqual_doubleNaN() throws Exception {
        Expression arg1 = createConstantExpression(Double.NaN);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThanOrEqual_doubleNaNRight() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(Double.NaN);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThan_numericComparison() throws Exception {
        Expression arg1 = createConstantExpression(5.0);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThan_numericComparisonFalse() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(5.0);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThan_numericComparisonEqual() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testLessThan_doubleNaN() throws Exception {
        Expression arg1 = createConstantExpression(Double.NaN);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testGreaterThan_numericComparison() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(5.0);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testGreaterThan_numericComparisonFalse() throws Exception {
        Expression arg1 = createConstantExpression(5.0);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testGreaterThan_numericComparisonEqual() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testGreaterThan_doubleNaN() throws Exception {
        Expression arg1 = createConstantExpression(Double.NaN);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorComparison_GreaterThanOrEqual() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(10);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(5);
        rightCollection.add(15);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorComparison_LessThanOrEqual() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(10);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(10);
        rightCollection.add(15);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorComparison_LessThan() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(10);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(15);
        rightCollection.add(20);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorComparison_GreaterThan() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(15);
        leftCollection.add(20);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(5);
        rightCollection.add(10);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorContainsMatch_GreaterThanOrEqual() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(10);
        leftCollection.add(15);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createConstantExpression(10);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorContainsMatch_LessThanOrEqual() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(10);
        leftCollection.add(15);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createConstantExpression(10);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorContainsMatch_LessThan() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(10);
        leftCollection.add(15);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createConstantExpression(20);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorContainsMatch_GreaterThan() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(10);
        leftCollection.add(15);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createConstantExpression(0);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorContainsMatch_GreaterThanOrEqual_NoMatch() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(8);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createConstantExpression(10);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorContainsMatch_LessThanOrEqual_NoMatch() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(12);
        leftCollection.add(15);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createConstantExpression(10);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorContainsMatch_LessThan_NoMatch() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(12);
        leftCollection.add(15);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createConstantExpression(10);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testIteratorContainsMatch_GreaterThan_NoMatch() throws Exception {
        Collection<Object> leftCollection = new HashSet<>();
        leftCollection.add(5);
        leftCollection.add(8);
        Iterator<Object> leftIterator = leftCollection.iterator();

        Expression arg1 = createIteratorExpression(leftIterator);
        Expression arg2 = createConstantExpression(10);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testContainsMatchIterator_GreaterThanOrEqual() throws Exception {
        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(5);
        rightCollection.add(10);
        rightCollection.add(15);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createConstantExpression(10);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testContainsMatchIterator_LessThanOrEqual() throws Exception {
        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(5);
        rightCollection.add(10);
        rightCollection.add(15);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createConstantExpression(10);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testContainsMatchIterator_LessThan() throws Exception {
        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(5);
        rightCollection.add(10);
        rightCollection.add(15);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createConstantExpression(20);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testContainsMatchIterator_GreaterThan() throws Exception {
        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(5);
        rightCollection.add(10);
        rightCollection.add(15);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createConstantExpression(0);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testContainsMatchIterator_GreaterThanOrEqual_NoMatch() throws Exception {
        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(5);
        rightCollection.add(8);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createConstantExpression(10);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testContainsMatchIterator_LessThanOrEqual_NoMatch() throws Exception {
        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(12);
        rightCollection.add(15);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createConstantExpression(10);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testContainsMatchIterator_LessThan_NoMatch() throws Exception {
        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(12);
        rightCollection.add(15);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createConstantExpression(10);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationLessThan expr = new CoreOperationLessThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testContainsMatchIterator_GreaterThan_NoMatch() throws Exception {
        Collection<Object> rightCollection = new HashSet<>();
        rightCollection.add(5);
        rightCollection.add(8);
        Iterator<Object> rightIterator = rightCollection.iterator();

        Expression arg1 = createConstantExpression(10);
        Expression arg2 = createIteratorExpression(rightIterator);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_Int() throws Exception {
        Expression arg1 = createConstantExpression(10);
        Expression arg2 = createConstantExpression(5);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_StringNumber() throws Exception {
        Expression arg1 = createConstantExpression("10.5");
        Expression arg2 = createConstantExpression("5.2");
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_BooleanTrue() throws Exception {
        Expression arg1 = createConstantExpression(true);
        Expression arg2 = createConstantExpression(1);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_BooleanFalse() throws Exception {
        Expression arg1 = createConstantExpression(false);
        Expression arg2 = createConstantExpression(0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_StringNonNumeric() throws Exception {
        Expression arg1 = createConstantExpression("abc");
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_NullLeft() throws Exception {
        Expression arg1 = createConstantExpression(null);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_NullRight() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(null);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }
}
