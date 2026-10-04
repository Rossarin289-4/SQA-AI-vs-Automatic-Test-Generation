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
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.w3c.dom.Node;
import java.util.Locale;


public class CoreOperationRelationalExpressionTest {

    // Helper method to create a dummy EvalContext for testing
    private EvalContext createDummyEvalContext() {
        JXPathContext jxpathContext = JXPathContext.newContext(new Object());
        // The constructor for DOMNodePointer requires a Node and a Locale.
        // Since we don't have a Node here, we'll use a simplified approach for context creation if possible,
        // or a mock if necessary, but given the API, it's likely a Node is needed.
        // However, for simple value computations, the context might not be strictly used.
        // Let's try to create a minimal valid context.
        // If DOMNodePointer constructor needs Node, we'd need to create a mock Node or a dummy XML.
        // Given the context, it seems the actual DOM Node isn't critical for these tests as they focus on value computation.
        // Let's try to use a simpler EvalContext if possible, or mock the Node.
        // A more straightforward approach might be to create an InitialContext with a dummy RootContext.
        // The RootContext requires a JXPathContext and a NodePointer.
        // PropertyPointer can be used as a generic NodePointer if Node is not available.

        // Let's try to create a simple EvalContext that doesn't rely on DOM.
        // InitialContext(EvalContext parentContext)
        // RootContext(JXPathContext context, NodePointer pointer)
        // The Pointer type needs to be resolved.
        // If we cannot construct a valid DOMNodePointer, we might need to use a different pointer or a mock.

        // For now, let's assume we can create a minimal context that satisfies the computeValue call.
        // The computeValue method uses args[0].computeValue(context) and args[1].computeValue(context).
        // If args are ConstantExpressions, they don't use the context.
        // So, the context might be a placeholder.

        // Let's try to use PropertyPointer which is more generic.
        // new DOMNodePointer(jxpathContext, new Object()) seems to be the problematic part.
        // The original JXPath tests might use specific test utilities.
        // Let's create a dummy context that does not rely on DOM.
        // A simple EvalContext might be an InitialContext with a RootContext.
        // RootContext requires JXPathContext and NodePointer.
        // PropertyPointer can be a NodePointer.
        // The constructor for PropertyPointer is PropertyPointer(JXPathContext context, NodePointer parent).
        // This leads to circular dependency if we use PropertyPointer for the pointer itself.

        // Let's reconsider the DOMNodePointer constructor. It takes Node and Locale.
        // If we must use DOMNodePointer, we need a Node.
        // Creating a dummy Node is complex.

        // Let's simplify the EvalContext creation.
        // The computeValue method in CoreOperationRelationalExpression only uses computeValue from its arguments,
        // and then reduce, and then InfoSetUtil.doubleValue or iterator operations.
        // If the arguments are ConstantExpressions, they return their value directly.
        // So, the EvalContext might not even be inspected by ConstantExpression.

        // Let's use a minimal RootContext and InitialContext.
        // RootContext needs a JXPathContext and a NodePointer.
        // NodePointer can be a PropertyPointer.
        // PropertyPointer needs JXPathContext and NodePointer. This is tricky.

        // Let's try a very basic approach that might work if context isn't heavily used by ConstantExpression.
        return new InitialContext(new org.apache.commons.jxpath.ri.axes.RootContext(jxpathContext, new PropertyPointer(jxpathContext, null)));
    }


    @Test
    public void testGreaterThanOrEqualDoubleTrue() throws Exception {
        Expression arg1 = new ConstantExpression(5.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualDoubleTruePositive() throws Exception {
        Expression arg1 = new ConstantExpression(6.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualDoubleFalse() throws Exception {
        Expression arg1 = new ConstantExpression(4.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualDoubleNaNLeft() throws Exception {
        Expression arg1 = new ConstantExpression(Double.NaN);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualDoubleNaNRight() throws Exception {
        Expression arg1 = new ConstantExpression(5.0);
        Expression arg2 = new ConstantExpression(Double.NaN);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualIntegerTrue() throws Exception {
        Expression arg1 = new ConstantExpression(5);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualIntegerTruePositive() throws Exception {
        Expression arg1 = new ConstantExpression(6);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualIntegerFalse() throws Exception {
        Expression arg1 = new ConstantExpression(4);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualStringTrue() throws Exception {
        Expression arg1 = new ConstantExpression("banana");
        Expression arg2 = new ConstantExpression("apple");
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualStringFalse() throws Exception {
        Expression arg1 = new ConstantExpression("apple");
        Expression arg2 = new ConstantExpression("banana");
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualStringEqual() throws Exception {
        Expression arg1 = new ConstantExpression("apple");
        Expression arg2 = new ConstantExpression("apple");
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualIteratorTrue() throws Exception {
        Collection<Object> collection1 = new HashSet<>();
        collection1.add("a");
        collection1.add("b");
        Iterator<Object> iter1 = collection1.iterator();

        Collection<Object> collection2 = new HashSet<>();
        collection2.add("c");
        Iterator<Object> iter2 = collection2.iterator();

        // Anonymous inner class implementing Expression to return iterators
        Expression arg1 = new Expression() {
            @Override
            public Object computeValue(EvalContext context) { return iter1; }
            @Override public Object compute(EvalContext context) { return iter1; } // As per API outline, compute also returns Object
            @Override public String getSymbol() { return "iterator1"; } // Added for clarity, though not used by CoreOperationRelationalExpression
            @Override protected boolean isSymmetric() { return false; } // Not used by CoreOperationRelationalExpression
            @Override protected int getPrecedence() { return 0; } // Not used by CoreOperationRelationalExpression
            @Override public boolean computeContextDependent() { return false; } // Not used by CoreOperationRelationalExpression
        };
        Expression arg2 = new Expression() {
            @Override
            public Object computeValue(EvalContext context) { return iter2; }
            @Override public Object compute(EvalContext context) { return iter2; }
            @Override public String getSymbol() { return "iterator2"; }
            @Override protected boolean isSymmetric() { return false; }
            @Override protected int getPrecedence() { return 0; }
            @Override public boolean computeContextDependent() { return false; }
        };
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanOrEqualIteratorFalse() throws Exception {
        Collection<Object> collection1 = new HashSet<>();
        collection1.add("a");
        Iterator<Object> iter1 = collection1.iterator();
        Collection<Object> collection2 = new HashSet<>();
        collection2.add("c");
        Iterator<Object> iter2 = collection2.iterator();
        Expression arg1 = new Expression() {
            @Override
            public Object computeValue(EvalContext context) { return iter1; }
            @Override public Object compute(EvalContext context) { return iter1; }
            @Override public String getSymbol() { return "iterator1"; }
            @Override protected boolean isSymmetric() { return false; }
            @Override protected int getPrecedence() { return 0; }
            @Override public boolean computeContextDependent() { return false; }
        };
        Expression arg2 = new Expression() {
            @Override
            public Object computeValue(EvalContext context) { return iter2; }
            @Override public Object compute(EvalContext context) { return iter2; }
            @Override public String getSymbol() { return "iterator2"; }
            @Override protected boolean isSymmetric() { return false; }
            @Override protected int getPrecedence() { return 0; }
            @Override public boolean computeContextDependent() { return false; }
        };
        CoreOperationGreaterThanOrEqual expr = new CoreOperationGreaterThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualDoubleTrue() throws Exception {
        Expression arg1 = new ConstantExpression(5.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualDoubleTruePositive() throws Exception {
        Expression arg1 = new ConstantExpression(4.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualDoubleFalse() throws Exception {
        Expression arg1 = new ConstantExpression(6.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualIntegerTrue() throws Exception {
        Expression arg1 = new ConstantExpression(5);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualIntegerTruePositive() throws Exception {
        Expression arg1 = new ConstantExpression(4);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualIntegerFalse() throws Exception {
        Expression arg1 = new ConstantExpression(6);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualStringTrue() throws Exception {
        Expression arg1 = new ConstantExpression("apple");
        Expression arg2 = new ConstantExpression("banana");
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualStringFalse() throws Exception {
        Expression arg1 = new ConstantExpression("banana");
        Expression arg2 = new ConstantExpression("apple");
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanOrEqualStringEqual() throws Exception {
        Expression arg1 = new ConstantExpression("apple");
        Expression arg2 = new ConstantExpression("apple");
        CoreOperationLessThanOrEqual expr = new CoreOperationLessThanOrEqual(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanDoubleTrue() throws Exception {
        Expression arg1 = new ConstantExpression(6.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanDoubleFalse() throws Exception {
        Expression arg1 = new ConstantExpression(5.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanDoubleFalseNegative() throws Exception {
        Expression arg1 = new ConstantExpression(4.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanIntegerTrue() throws Exception {
        Expression arg1 = new ConstantExpression(6);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanIntegerFalse() throws Exception {
        Expression arg1 = new ConstantExpression(5);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanIntegerFalseNegative() throws Exception {
        Expression arg1 = new ConstantExpression(4);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanStringTrue() throws Exception {
        Expression arg1 = new ConstantExpression("banana");
        Expression arg2 = new ConstantExpression("apple");
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanStringFalse() throws Exception {
        Expression arg1 = new ConstantExpression("apple");
        Expression arg2 = new ConstantExpression("banana");
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testGreaterThanStringEqual() throws Exception {
        Expression arg1 = new ConstantExpression("apple");
        Expression arg2 = new ConstantExpression("apple");
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanDoubleTrue() throws Exception {
        Expression arg1 = new ConstantExpression(4.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanDoubleFalse() throws Exception {
        Expression arg1 = new ConstantExpression(5.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanDoubleFalseNegative() throws Exception {
        Expression arg1 = new ConstantExpression(6.0);
        Expression arg2 = new ConstantExpression(5.0);
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanIntegerTrue() throws Exception {
        Expression arg1 = new ConstantExpression(4);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanIntegerFalse() throws Exception {
        Expression arg1 = new ConstantExpression(5);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanIntegerFalseNegative() throws Exception {
        Expression arg1 = new ConstantExpression(6);
        Expression arg2 = new ConstantExpression(5);
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanStringTrue() throws Exception {
        Expression arg1 = new ConstantExpression("apple");
        Expression arg2 = new ConstantExpression("banana");
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanStringFalse() throws Exception {
        Expression arg1 = new ConstantExpression("banana");
        Expression arg2 = new ConstantExpression("apple");
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }

    @Test
    public void testLessThanStringEqual() throws Exception {
        Expression arg1 = new ConstantExpression("apple");
        Expression arg2 = new ConstantExpression("apple");
        CoreOperationLessThan expr = new CoreOperationLessThan(new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, expr.computeValue(createDummyEvalContext()));
    }
}
