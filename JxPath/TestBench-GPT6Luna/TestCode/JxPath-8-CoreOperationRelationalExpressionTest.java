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
    public void testGreaterThanIntegers() throws Exception {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(3), new Literal(2));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanEqualIntegers() throws Exception {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(2), new Literal(2));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanOrEqualEqualValues() throws Exception {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Literal(2), new Literal(2));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanOrEqualSmallerLeft() throws Exception {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
                new Literal(1), new Literal(2));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessThanIntegers() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(1), new Literal(2));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLessThanEqualIntegers() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(2), new Literal(2));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessThanOrEqualEqualValues() throws Exception {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
                new Literal(2), new Literal(2));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLessThanOrEqualLargerLeft() throws Exception {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
                new Literal(3), new Literal(2));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testZeroLessThanOne() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(0), new Literal(1));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testNegativeOneLessThanZero() throws Exception {
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(-1), new Literal(0));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testStringNumbersAreComparedNumerically() throws Exception {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal("10"), new Literal("2"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testNonNumericValuesDoNotCompareAsGreater() throws Exception {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal("abc"), new Literal(1));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testEmptyCollectionDoesNotMatch() throws Exception {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(new HashSet()), new Literal(1));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testCollectionElementGreaterThanScalar() throws Exception {
        HashSet values = new HashSet();
        values.add(1);
        values.add(3);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(values), new Literal(2));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testCollectionWithNoGreaterElementDoesNotMatch() throws Exception {
        HashSet values = new HashSet();
        values.add(1);
        values.add(2);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(
                new Literal(values), new Literal(2));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testScalarComparedAgainstCollection() throws Exception {
        HashSet values = new HashSet();
        values.add(1);
        values.add(3);
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(2), new Literal(values));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testTwoCollectionsFindMatchingPair() throws Exception {
        HashSet left = new HashSet();
        left.add(1);
        left.add(4);
        HashSet right = new HashSet();
        right.add(2);
        right.add(5);
        CoreOperationLessThan op = new CoreOperationLessThan(
                new Literal(left), new Literal(right));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testTwoCollectionsWithoutMatchingPair() throws Exception {
        HashSet left = new HashSet();
        left.add(4);
        left.add(5);
        HashSet right = new HashSet();
        right.add(1);
        right.add(2);
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
