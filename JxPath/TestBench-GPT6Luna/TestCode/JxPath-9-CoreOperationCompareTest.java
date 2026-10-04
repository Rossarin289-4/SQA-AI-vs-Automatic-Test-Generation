package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;

public class CoreOperationCompareTest {
    @Test
    public void testEqualSymbol() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertEquals("=", op.getSymbol());
    }

    @Test
    public void testNotEqualSymbol() throws Exception {
        CoreOperationNotEqual op = new CoreOperationNotEqual(null, null);
        assertEquals("!=", op.getSymbol());
    }

    @Test
    public void testEqualIdenticalStrings() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression("abc"), new ConstantExpression("abc"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testEqualDifferentStrings() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression("abc"), new ConstantExpression("abd"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testNotEqualIdenticalStrings() throws Exception {
        CoreOperationNotEqual op = new CoreOperationNotEqual(
                new ConstantExpression("abc"), new ConstantExpression("abc"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testNotEqualDifferentStrings() throws Exception {
        CoreOperationNotEqual op = new CoreOperationNotEqual(
                new ConstantExpression("abc"), new ConstantExpression("abd"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testEqualNumbersWithSameValue() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(Integer.valueOf(1)),
                new ConstantExpression(Double.valueOf(1.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testEqualNumbersWithDifferentValues() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(Integer.valueOf(1)),
                new ConstantExpression(Double.valueOf(2.0)));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBooleanComparedToTrueString() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(Boolean.TRUE),
                new ConstantExpression("true"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testNullValuesAreEqual() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(null), new ConstantExpression(null));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testNullAndStringDiffer() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(null), new ConstantExpression("x"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLeftCollectionContainsMatchingValue() throws Exception {
        Collection left = new HashSet();
        left.add("first");
        left.add("match");
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(left), new ConstantExpression("match"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLeftCollectionHasNoMatchingValue() throws Exception {
        Collection left = new HashSet();
        left.add("first");
        left.add("last");
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(left), new ConstantExpression("missing"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testRightCollectionContainsMatchingValue() throws Exception {
        Collection right = new HashSet();
        right.add("other");
        right.add("match");
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression("match"), new ConstantExpression(right));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testTwoCollectionsHaveCommonValue() throws Exception {
        Collection left = new HashSet();
        left.add("left");
        left.add("common");
        Collection right = new HashSet();
        right.add("right");
        right.add("common");
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(left), new ConstantExpression(right));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testTwoCollectionsHaveNoCommonValue() throws Exception {
        Collection left = new HashSet();
        left.add("left");
        Collection right = new HashSet();
        right.add("right");
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(left), new ConstantExpression(right));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testNotEqualCollectionNoMatch() throws Exception {
        Collection left = new HashSet();
        left.add("present");
        CoreOperationNotEqual op = new CoreOperationNotEqual(
                new ConstantExpression(left), new ConstantExpression("absent"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testEqualIntegerMaximum() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(Integer.valueOf(2147483647)),
                new ConstantExpression(Long.valueOf(2147483647L)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testEqualFirstValueAboveIntegerMaximum() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(Long.valueOf(2147483648L)),
                new ConstantExpression(Double.valueOf(2147483648.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testEqualIntegerMinimum() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(Integer.valueOf(-2147483648)),
                new ConstantExpression(Long.valueOf(-2147483648L)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testEqualFirstValueBelowIntegerMinimum() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(
                new ConstantExpression(Long.valueOf(-2147483649L)),
                new ConstantExpression(Double.valueOf(-2147483649.0)));
        assertEquals(Boolean.TRUE, op.computeValue(null));
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
