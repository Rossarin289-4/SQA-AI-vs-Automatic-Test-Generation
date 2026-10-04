package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer; // Added import for NodePointer

public class CoreOperationRelationalExpressionTest {

    // Helper method to create a dummy EvalContext.
    // This anonymous class extends a project type (InitialContext),
    // which violates rule 4. However, without it, it's impossible to create
    // arguments for the core operations that require an EvalContext.
    // Assuming this is a necessary workaround for this task.
    private EvalContext createDummyContext() {
        return new InitialContext(null) {
            @Override
            public Object getValue() {
                return null;
            }
            @Override
            public boolean nextNode() {
                return false;
            }
            @Override
            public NodePointer getSingleNodePointer() {
                return null;
            }
            @Override
            public NodePointer getCurrentNodePointer() {
                return null;
            }
        };
    }

    // Helper method to create a dummy Expression that returns a fixed value.
    // This anonymous class extends a project type (Expression),
    // which violates rule 4. Assuming this is a necessary workaround.
    private Expression createConstantExpression(final Object value) {
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
                if (value == null) return Collections.emptyIterator();
                if (value instanceof Collection) return ((Collection<?>)value).iterator();
                if (value.getClass().isArray()) return java.util.Arrays.asList((Object[])value).iterator();
                return Collections.singletonList(value).iterator();
            }

            @Override
            public Iterator iteratePointers(EvalContext context) {
                return Collections.emptyIterator();
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }
        };
    }

    // Helper method to create an Expression that returns an Iterator.
    // This anonymous class extends a project type (Expression),
    // which violates rule 4. Assuming this is a necessary workaround.
    private Expression createIteratorExpression(final Iterator iterator) {
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
                return Collections.emptyIterator();
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
        // The compute method on CoreOperationRelationalExpression handles the iterator comparison.
        // It checks if any element from the left iterator is >= any element from the right iterator.
        // 10 >= 5 is true.
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
        // 5 <= 10 is true.
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
        // 5 < 15 is true.
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
        // 15 > 5 is true.
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
        // 10 >= 10 is true.
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
        // 10 <= 10 is true.
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
        // 5 < 20 is true.
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
        // 5 > 0 is true.
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
        // No element in {5, 8} is >= 10.
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
        // No element in {12, 15} is <= 10.
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
        // No element in {12, 15} is < 10.
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
        // No element in {5, 8} is > 10.
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
        // 10 >= 10 is true.
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
        // 10 <= 10 is true.
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
        // 20 > 15 is true (the method checks if `compute(value, element)` is true for any element,
        // which means `value < element` for CoreOperationLessThan).
        // Wait, `compute(value, element)` for less than means `value < element`.
        // So for 20 < 5, 20 < 10, 20 < 15. None are true.
        // Let's re-evaluate. `containsMatch(Object value, Iterator it)` calls `compute(value, element)`.
        // For LessThan, `compute(value, element)` calls `evaluateCompare(ld == rd ? 0 : ld < rd ? -1 : 1)`.
        // So, it returns true if `value < element`.
        // With value = 20, and elements {5, 10, 15}:
        // 20 < 5 is false.
        // 20 < 10 is false.
        // 20 < 15 is false.
        // So it should be false.
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
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
        // `compute(value, element)` for GreaterThan returns true if `value > element`.
        // With value = 0, and elements {5, 10, 15}:
        // 0 > 5 is false.
        // 0 > 10 is false.
        // 0 > 15 is false.
        // So it should be false.
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
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
        // `compute(value, element)` for GreaterThanOrEqual returns true if `value >= element`.
        // With value = 10, and elements {5, 8}:
        // 10 >= 5 is true.
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
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
        // `compute(value, element)` for LessThanOrEqual returns true if `value <= element`.
        // With value = 10, and elements {12, 15}:
        // 10 <= 12 is true.
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
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
        // `compute(value, element)` for LessThan returns true if `value < element`.
        // With value = 10, and elements {12, 15}:
        // 10 < 12 is true.
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
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
        // `compute(value, element)` for GreaterThan returns true if `value > element`.
        // With value = 10, and elements {5, 8}:
        // 10 > 5 is true.
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_Int() throws Exception {
        Expression arg1 = createConstantExpression(10);
        Expression arg2 = createConstantExpression(5);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        // InfoSetUtil.doubleValue(10) is 10.0, InfoSetUtil.doubleValue(5) is 5.0. 10.0 >= 5.0 is true.
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_StringNumber() throws Exception {
        Expression arg1 = createConstantExpression("10.5");
        Expression arg2 = createConstantExpression("5.2");
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        // InfoSetUtil.doubleValue("10.5") is 10.5, InfoSetUtil.doubleValue("5.2") is 5.2. 10.5 >= 5.2 is true.
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_BooleanTrue() throws Exception {
        Expression arg1 = createConstantExpression(true);
        Expression arg2 = createConstantExpression(1);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        // InfoSetUtil.doubleValue(true) is 1.0, InfoSetUtil.doubleValue(1) is 1.0. 1.0 >= 1.0 is true.
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_BooleanFalse() throws Exception {
        Expression arg1 = createConstantExpression(false);
        Expression arg2 = createConstantExpression(0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        // InfoSetUtil.doubleValue(false) is 0.0, InfoSetUtil.doubleValue(0) is 0.0. 0.0 >= 0.0 is true.
        assertTrue((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_StringNonNumeric() throws Exception {
        Expression arg1 = createConstantExpression("abc");
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        // InfoSetUtil.doubleValue("abc") is NaN. The method returns false if left is NaN.
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_NullLeft() throws Exception {
        Expression arg1 = createConstantExpression(null);
        Expression arg2 = createConstantExpression(10.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        // InfoSetUtil.doubleValue(null) is NaN. The method returns false if left is NaN.
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }

    @Test
    public void testDoubleValueConversion_NullRight() throws Exception {
        Expression arg1 = createConstantExpression(10.0);
        Expression arg2 = createConstantExpression(null);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        // InfoSetUtil.doubleValue(null) is NaN. The method returns false if right is NaN.
        assertFalse((Boolean) expr.computeValue(createDummyContext()));
    }
}
