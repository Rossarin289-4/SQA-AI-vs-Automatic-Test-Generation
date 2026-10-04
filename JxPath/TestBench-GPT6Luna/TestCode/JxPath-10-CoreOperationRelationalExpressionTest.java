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
    @Test
    public void testGreaterThanNumbers() throws Exception {
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(5), new ConstantExpression(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanEqualNumbers() throws Exception {
        CoreOperationGreaterThanOrEqual op =
                new CoreOperationGreaterThanOrEqual(new ConstantExpression(3), new ConstantExpression(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLessThanNumbers() throws Exception {
        CoreOperationLessThan op =
                new CoreOperationLessThan(new ConstantExpression(2), new ConstantExpression(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLessThanOrEqualNumbers() throws Exception {
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(new ConstantExpression(3), new ConstantExpression(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanRejectsEqual() throws Exception {
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(4), new ConstantExpression(4));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanOrEqualRejectsSmallerLeft() throws Exception {
        CoreOperationGreaterThanOrEqual op =
                new CoreOperationGreaterThanOrEqual(new ConstantExpression(2), new ConstantExpression(3));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessThanRejectsEqual() throws Exception {
        CoreOperationLessThan op =
                new CoreOperationLessThan(new ConstantExpression(4), new ConstantExpression(4));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessThanOrEqualRejectsLargerLeft() throws Exception {
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(new ConstantExpression(4), new ConstantExpression(3));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanNumericStrings() throws Exception {
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression("12"), new ConstantExpression("3"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testInvalidNumericStringDoesNotMatch() throws Exception {
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression("bad"), new ConstantExpression(1));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testIteratorLeftFindsMatchingValue() throws Exception {
        HashSet left = new HashSet();
        left.add(Integer.valueOf(2));
        left.add(Integer.valueOf(5));
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(left), new ConstantExpression(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testIteratorLeftWithNoMatch() throws Exception {
        HashSet left = new HashSet();
        left.add(Integer.valueOf(1));
        left.add(Integer.valueOf(2));
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(left), new ConstantExpression(3));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testIteratorRightMatchesAgainstLeftValue() throws Exception {
        HashSet right = new HashSet();
        right.add(Integer.valueOf(2));
        right.add(Integer.valueOf(5));
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(right), new ConstantExpression(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testBothIteratorsFindPair() throws Exception {
        HashSet left = new HashSet();
        left.add(Integer.valueOf(5));
        HashSet right = new HashSet();
        right.add(Integer.valueOf(3));
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(left), new ConstantExpression(right));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testBothIteratorsWithoutMatchingPair() throws Exception {
        HashSet left = new HashSet();
        left.add(Integer.valueOf(1));
        HashSet right = new HashSet();
        right.add(Integer.valueOf(3));
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(left), new ConstantExpression(right));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testEmptyIteratorHasNoMatch() throws Exception {
        HashSet left = new HashSet();
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(left), new ConstantExpression(1));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLongMaximumComparedToPrecedingValue() throws Exception {
        CoreOperationGreaterThan op =
                new CoreOperationGreaterThan(new ConstantExpression(Long.valueOf(Long.MAX_VALUE)),
                        new ConstantExpression(Long.valueOf(Long.MAX_VALUE - 1)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLongMinimumComparedToPrecedingValue() throws Exception {
        CoreOperationLessThan op =
                new CoreOperationLessThan(new ConstantExpression(Long.valueOf(Long.MIN_VALUE)),
                        new ConstantExpression(Long.valueOf(Long.MIN_VALUE + 1)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    private static class ConstantExpression extends Expression {
        private final Object value;

        ConstantExpression(Object value) {
            this.value = value;
        }

        public boolean computeContextDependent() {
            return false;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public Object compute(EvalContext context) {
            return value;
        }
    }
}
