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
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory;
import org.apache.commons.jxpath.JXPathContext;


public class CoreOperationGreaterThanTest {

    // Helper method to create a dummy EvalContext for testing
    private EvalContext createDummyEvalContext() {
        return new InitialContext(null) {
            @Override
            public NodePointer getCurrentNodePointer() {
                return null;
            }
            @Override
            public boolean nextNode() {
                return false;
            }
             @Override
             public Object getValue() {
                 return null;
             }
        };
    }

    @Test
    public void testGreaterThanWithEqualNumbers() throws Exception {
        Expression arg1 = new Constant(5);
        Expression arg2 = new Constant(5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("5 > 5 should be false", result);
    }

    @Test
    public void testGreaterThanWithFirstNumberLarger() throws Exception {
        Expression arg1 = new Constant(10);
        Expression arg2 = new Constant(5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertTrue("10 > 5 should be true", result);
    }

    @Test
    public void testGreaterThanWithSecondNumberLarger() throws Exception {
        Expression arg1 = new Constant(3);
        Expression arg2 = new Constant(7);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("3 > 7 should be false", result);
    }

    @Test
    public void testGreaterThanWithDoubleNumbersEqual() throws Exception {
        Expression arg1 = new Constant(5.5);
        Expression arg2 = new Constant(5.5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("5.5 > 5.5 should be false", result);
    }

    @Test
    public void testGreaterThanWithDoubleNumbersFirstLarger() throws Exception {
        Expression arg1 = new Constant(5.6);
        Expression arg2 = new Constant(5.5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertTrue("5.6 > 5.5 should be true", result);
    }

    @Test
    public void testGreaterThanWithDoubleNumbersSecondLarger() throws Exception {
        Expression arg1 = new Constant(5.4);
        Expression arg2 = new Constant(5.5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("5.4 > 5.5 should be false", result);
    }

    @Test
    public void testGreaterThanWithNegativeNumbersEqual() throws Exception {
        Expression arg1 = new Constant(-5);
        Expression arg2 = new Constant(-5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("-5 > -5 should be false", result);
    }

    @Test
    public void testGreaterThanWithNegativeNumbersFirstLarger() throws Exception {
        Expression arg1 = new Constant(-2);
        Expression arg2 = new Constant(-5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertTrue("-2 > -5 should be true", result);
    }

    @Test
    public void testGreaterThanWithNegativeNumbersSecondLarger() throws Exception {
        Expression arg1 = new Constant(-5);
        Expression arg2 = new Constant(-2);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("-5 > -2 should be false", result);
    }

    @Test
    public void testGreaterThanWithZeroAndPositive() throws Exception {
        Expression arg1 = new Constant(0);
        Expression arg2 = new Constant(5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("0 > 5 should be false", result);
    }

    @Test
    public void testGreaterThanWithPositiveAndZero() throws Exception {
        Expression arg1 = new Constant(5);
        Expression arg2 = new Constant(0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertTrue("5 > 0 should be true", result);
    }

    @Test
    public void testGreaterThanWithZeroAndNegative() throws Exception {
        Expression arg1 = new Constant(0);
        Expression arg2 = new Constant(-5);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertTrue("0 > -5 should be true", result);
    }

    @Test
    public void testGreaterThanWithNegativeAndZero() throws Exception {
        Expression arg1 = new Constant(-5);
        Expression arg2 = new Constant(0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("-5 > 0 should be false", result);
    }

    @Test
    public void testGreaterThanWithLargeNumbers() throws Exception {
        Expression arg1 = new Constant(Long.MAX_VALUE);
        Expression arg2 = new Constant(Long.MAX_VALUE - 1);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertTrue("Long.MAX_VALUE > Long.MAX_VALUE - 1 should be true", result);
    }

    @Test
    public void testGreaterThanWithSmallNumbers() throws Exception {
        Expression arg1 = new Constant(Long.MIN_VALUE);
        Expression arg2 = new Constant(Long.MIN_VALUE + 1);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("Long.MIN_VALUE > Long.MIN_VALUE + 1 should be false", result);
    }

    @Test
    public void testGreaterThanWithDoublePrecision() throws Exception {
        Expression arg1 = new Constant(0.0000001);
        Expression arg2 = new Constant(0.0000000);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertTrue("0.0000001 > 0.0000000 should be true", result);
    }

    @Test
    public void testGreaterThanWithDoublePrecisionEqual() throws Exception {
        Expression arg1 = new Constant(0.0000001);
        Expression arg2 = new Constant(0.0000001);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("0.0000001 > 0.0000001 should be false", result);
    }

    @Test
    public void testGreaterThanWithVerySmallNegativeNumbers() throws Exception {
        Expression arg1 = new Constant(-0.0000001);
        Expression arg2 = new Constant(-0.0000002);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertTrue("-0.0000001 > -0.0000002 should be true", result);
    }

    @Test
    public void testGreaterThanWithVerySmallNegativeNumbersEqual() throws Exception {
        Expression arg1 = new Constant(-0.0000001);
        Expression arg2 = new Constant(-0.0000001);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        EvalContext context = createDummyEvalContext();
        Boolean result = (Boolean) op.computeValue(context);
        assertFalse("-0.0000001 > -0.0000001 should be false", result);
    }
    
    // Tests involving iterators are omitted because the 'Constant' class does not have
    // constructors to accept Iterator objects, and no other suitable concrete Expression
    // subclass is available from the provided API to produce an Iterator for testing.
}
