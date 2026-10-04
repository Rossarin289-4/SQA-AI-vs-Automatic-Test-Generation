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
    public void testLessThanOrdinaryNumbers() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(2), new Literal(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLessThanEqualNumbers() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(3), new Literal(3));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessThanOrEqualAtEquality() throws Exception {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
                new Literal(3), new Literal(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLessThanOrEqualAboveRight() throws Exception {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
                new Literal(4), new Literal(3));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanAtEquality() throws Exception {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(3), new Literal(3));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanOrEqualAtEquality() throws Exception {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Literal(3), new Literal(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanOrEqualBelowRight() throws Exception {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Literal(2), new Literal(3));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testIntegerMaximumComparedToNextValue() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(2147483647), new Literal(2147483648L));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testIntegerMinimumComparedToOneBelow() throws Exception {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(-2147483648), new Literal(-2147483649L));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLongMaximumComparedToNextValue() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(9223372036854775807L),
                new Literal(9223372036854775807L));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testNaNOperandIsFalse() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(Double.NaN), new Literal(1));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLeftCollectionHasMatchingElement() throws Exception {
        Collection values = new HashSet();
        values.add(1);
        values.add(4);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(values), new Literal(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLeftCollectionWithoutMatchingElement() throws Exception {
        Collection values = new HashSet();
        values.add(1);
        values.add(2);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(values), new Literal(3));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testRightCollectionMatches() throws Exception {
        Collection values = new HashSet();
        values.add(4);
        values.add(2);
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(3), new Literal(values));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testTwoCollectionsHaveMatchingPair() throws Exception {
        Collection left = new HashSet();
        left.add(1);
        left.add(5);
        Collection right = new HashSet();
        right.add(3);
        right.add(6);
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(left), new Literal(right));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testTwoCollectionsHaveNoMatchingPair() throws Exception {
        Collection left = new HashSet();
        left.add(4);
        Collection right = new HashSet();
        right.add(1);
        left.add(2);
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(left), new Literal(right));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    private static final class Literal extends Expression {
        private final Object value;

        Literal(Object value) {
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
