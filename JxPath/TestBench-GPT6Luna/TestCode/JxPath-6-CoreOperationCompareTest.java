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
    public void testEqualNumericValues() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertTrue(op.equal(Integer.valueOf(7), Double.valueOf(7.0)));
    }

    @Test
    public void testDifferentNumericValues() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertFalse(op.equal(Integer.valueOf(7), Double.valueOf(8.0)));
    }

    @Test
    public void testBooleanComparisonWithNonBoolean() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertTrue(op.equal(Boolean.TRUE, "true"));
    }

    @Test
    public void testStringComparisonWithNumber() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertTrue(op.equal("12", Integer.valueOf(12)));
    }

    @Test
    public void testNullEquality() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertTrue(op.equal(null, null));
    }

    @Test
    public void testOneNullAndNonNull() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertFalse(op.equal(null, "value"));
    }

    @Test
    public void testEqualUsesObjectEquality() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertTrue(op.equal(new String("same"), new String("same")));
    }

    @Test
    public void testNotEqualOperationReturnsFalseForEqualNumbers() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertTrue(op.equal(Integer.valueOf(3), Integer.valueOf(3)));
    }

    @Test
    public void testContainsMatchingElement() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection values = new HashSet();
        values.add("first");
        values.add("match");
        assertTrue(op.contains(values.iterator(), "match"));
    }

    @Test
    public void testContainsNoMatchingElement() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection values = new HashSet();
        values.add("first");
        assertFalse(op.contains(values.iterator(), "other"));
    }

    @Test
    public void testContainsEmptyIterator() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection values = new HashSet();
        assertFalse(op.contains(values.iterator(), "any"));
    }

    @Test
    public void testFindMatchAcrossIterators() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection left = new HashSet();
        left.add("alpha");
        left.add("shared");
        Collection right = new HashSet();
        right.add("shared");
        assertTrue(op.findMatch(left.iterator(), right.iterator()));
    }

    @Test
    public void testFindMatchWithNoIntersection() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection left = new HashSet();
        left.add("left");
        Collection right = new HashSet();
        right.add("right");
        assertFalse(op.findMatch(left.iterator(), right.iterator()));
    }

    @Test
    public void testFindMatchWithEmptyLeftIterator() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection left = new HashSet();
        Collection right = new HashSet();
        right.add("right");
        assertFalse(op.findMatch(left.iterator(), right.iterator()));
    }

    @Test
    public void testCompareCollectionsContainingMatch() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection left = new HashSet();
        left.add("x");
        left.add("y");
        Collection right = new HashSet();
        right.add("y");
        assertFalse(op.equal(left, right));
    }

    @Test
    public void testCompareCollectionToScalar() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection values = new HashSet();
        values.add("x");
        values.add("target");
        assertFalse(op.equal(values, "target"));
    }

    @Test
    public void testCompareDisjointCollections() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        Collection left = new HashSet();
        left.add("left");
        Collection right = new HashSet();
        right.add("right");
        assertFalse(op.equal(left, right));
    }

    @Test
    public void testNumbersAtIntegerMaximumRemainEqual() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertTrue(op.equal(Integer.valueOf(2147483647), Double.valueOf(2147483647.0)));
    }

    @Test
    public void testNumbersJustAboveIntegerMaximumRemainDistinct() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertFalse(op.equal(Integer.valueOf(2147483647), Double.valueOf(2147483648.0)));
    }

    @Test
    public void testNumbersAtIntegerMinimumRemainEqual() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertTrue(op.equal(Integer.valueOf(-2147483648), Double.valueOf(-2147483648.0)));
    }

    @Test
    public void testNumbersJustBelowIntegerMinimumRemainDistinct() throws Exception {
        CoreOperationEqual op = new CoreOperationEqual(null, null);
        assertFalse(op.equal(Integer.valueOf(-2147483648), Double.valueOf(-2147483649.0)));
    }
}
