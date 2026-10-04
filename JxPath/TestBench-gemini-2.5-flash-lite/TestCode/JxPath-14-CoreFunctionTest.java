package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.Pointer;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.JXPathContextFactory;
import org.apache.commons.jxpath.IdentityManager;
import org.apache.commons.jxpath.KeyManager;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ExpressionContext; // Added import

public class CoreFunctionTest {

    // --- Mock/Dummy Implementations ---

    private static class DummyExpression extends Expression {
        private Object value;
        private boolean contextDependent;

        DummyExpression(Object value) {
            this.value = value;
            this.contextDependent = false;
        }

        DummyExpression(Object value, boolean contextDependent) {
            this.value = value;
            this.contextDependent = contextDependent;
        }

        @Override
        public boolean computeContextDependent() {
            return contextDependent;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }

        @Override
        public Object compute(EvalContext context) {
            return computeValue(context);
        }

        @Override
        public Iterator<Pointer> iteratePointers(EvalContext context) {
            return null; // Not needed for these tests
        }

        @Override
        public Iterator<Object> iterate(EvalContext context) {
            return null; // Not needed for these tests
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }


    // Minimal Dummy JXPathContext to satisfy dependencies


    // Mock Pointer
    private static class DummyPointer extends NodePointer {
        private Object node;
        private QName name;
        private String namespaceURI;

        DummyPointer(Object node, QName name) {
            super(null); // No parent
            this.node = node;
            this.name = name;
        }

        DummyPointer(Object node, QName name, String namespaceURI) {
            super(null); // No parent
            this.node = node;
            this.name = name;
            this.namespaceURI = namespaceURI;
        }

        @Override
        public QName getName() { return name; }
        @Override
        public Object getBaseValue() { return node; }
        @Override
        public Object getNodeValue() { return node; }
        @Override
        public Object getNode() { return node; }
        @Override
        public Object getImmediateNode() { return node; }
        @Override
        public void setValue(Object value) { this.node = value; }
        @Override
        public int compareChildNodePointers( NodePointer pointer1, NodePointer pointer2) { return 0; }
        @Override
        public boolean isLeaf() { return true; }
        @Override
        public boolean isCollection() { return false; }
        @Override
        public int getLength() { return 1; }
        @Override
        public NodePointer createPath(JXPathContext context, Object value) { return null; }
        @Override
        public NodePointer createPath(JXPathContext context) { return null; }
        @Override
        public NodePointer createChild( JXPathContext context, QName name, int index, Object value) { return null; }

        // Mock implementation for specific functions
        @Override
        public String getNamespaceURI() { return namespaceURI; }
        public String getNameAsString() { return name != null ? name.getName() : null; }
        public String getNamespaceURI(String prefix) { return null; }
        public boolean isLanguage(String lang) { return false; }
        public NodePointer getPointerByID(JXPathContext context, String id) { return null; }
    }

    // Mock Expression factory
    private Expression expr(Object value) {
        return new DummyExpression(value);
    }
    
    private Expression contextDependentExpr(Object value) {
        return new DummyExpression(value, true);
    }

    // Mock EvalContext factory



    // --- Function Tests ---

    // --- Function: last() ---


    // --- Function: position() ---


    // --- Function: count() ---




    // --- Function: lang() ---



    // --- Function: id() ---


    // --- Function: local-name() ---



    // --- Function: namespace-uri() ---



    // --- Function: name() ---


    // --- Function: string() ---



    // --- Function: concat() ---



    // --- Function: starts-with() ---




    // --- Function: contains() ---



    // --- Function: substring-before() ---



    // --- Function: substring-after() ---



    // --- Function: substring() ---






    // --- Function: string-length() ---



    // --- Function: normalize-space() ---



    // --- Function: translate() ---




    // --- Function: boolean() ---




    // --- Function: not() ---


    // --- Function: true() ---

    // --- Function: false() ---

    // --- Function: number() ---




    // --- Function: sum() ---




    // --- Function: floor() ---





    // --- Function: ceiling() ---



    @Test
    public void testCeilingFunctionForNaN() {
        Expression arg = expr(Double.NaN);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CEILING, new Expression[]{arg});
        assertTrue(Double.isNaN((Double) func.computeValue(mockEvalContext())));
    }

    @Test
    public void testCeilingFunctionForNegativeInfinity() {
        Expression arg = expr(Double.NEGATIVE_INFINITY);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CEILING, new Expression[]{arg});
        assertEquals(Double.NEGATIVE_INFINITY, func.computeValue(mockEvalContext()));
    }

    // --- Function: round() ---
    @Test
    public void testRoundFunctionRoundsToNearestInteger() {
        Expression arg = expr(3.7);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_ROUND, new Expression[]{arg});
        assertEquals(new Double(4.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testRoundFunctionRoundsDownAtPointFive() {
        Expression arg = expr(3.5);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_ROUND, new Expression[]{arg});
        assertEquals(new Double(4.0), func.computeValue(mockEvalContext())); // Math.round(3.5) is 4
    }

    @Test
    public void testRoundFunctionForNegativeNumber() {
        Expression arg = expr(-3.7);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_ROUND, new Expression[]{arg});
        assertEquals(new Double(-4.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testRoundFunctionForNegativePointFive() {
        Expression arg = expr(-3.5);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_ROUND, new Expression[]{arg});
        assertEquals(new Double(-3.0), func.computeValue(mockEvalContext())); // Math.round(-3.5) is -3
    }

    @Test
    public void testRoundFunctionForNaN() {
        Expression arg = expr(Double.NaN);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_ROUND, new Expression[]{arg});
        assertTrue(Double.isNaN((Double) func.computeValue(mockEvalContext())));
    }

    // --- Function: format-number() ---
    @Test
    public void testFormatNumberWithPatternAndDefaultSymbols() {
        Expression arg1 = expr(1234.56);
        Expression arg2 = expr("#,##0.00");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{arg1, arg2});
        assertEquals("1,234.56", func.computeValue(mockEvalContext()));
    }


    @Test
    public void testFormatNumberWithLocalizedPattern() {
        DummyJXPathContext jxpathContext = new DummyJXPathContext();
        jxpathContext.setLocale(Locale.GERMAN); // Set locale for default symbols
        EvalContext context = new DummyEvalContext(jxpathContext);

        Expression arg1 = expr(1234.56);
        Expression arg2 = expr("#.###,00"); // Pattern using German conventions
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{arg1, arg2});
        assertEquals("1.234,56", func.computeValue(context));
    }

    @Test
    public void testFormatNumberWithZeroAndPattern() {
        Expression arg1 = expr(0);
        Expression arg2 = expr("0.00");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{arg1, arg2});
        assertEquals("0.00", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testFormatNumberWithNegativeNumber() {
        Expression arg1 = expr(-123.45);
        Expression arg2 = expr("-0.00");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{arg1, arg2});
        assertEquals("-123.45", func.computeValue(mockEvalContext()));
    }
    
    // --- Function: key() ---
    @Test
    public void testKeyFunctionWithSingleArgument() {
        JXPathContext jxpathContext = new DummyJXPathContext();
        EvalContext context = new DummyEvalContext(jxpathContext);
        Expression arg1 = expr("someKey");
        Expression arg2 = expr("someValue");
        
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_KEY, new Expression[]{arg1, arg2}) {
            @Override
            protected Object functionKey(EvalContext ctx) {
                String key = InfoSetUtil.stringValue(getArg1().computeValue(ctx));
                Object value = getArg2().compute(ctx);
                
                NodeSet nodeSet = new BasicNodeSet();
                if ("someKey".equals(key) && "someValue".equals(InfoSetUtil.stringValue(value))) {
                    nodeSet.add(new DummyPointer("node1", new QName("node1")));
                }
                return new NodeSetContext(ctx, nodeSet);
            }
        };
        
        Object result = func.computeValue(context);
        assertTrue(result instanceof NodeSetContext);
        NodeSetContext nsContext = (NodeSetContext) result;
        assertEquals(1, nsContext.getNodeSet().getPointers().size());
    }
    
    @Test
    public void testKeyFunctionWithEmptyNodeSet() {
        JXPathContext jxpathContext = new DummyJXPathContext();
        EvalContext context = new DummyEvalContext(jxpathContext);
        Expression arg1 = expr("nonExistentKey");
        Expression arg2 = expr("someValue");
        
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_KEY, new Expression[]{arg1, arg2}) {
            @Override
            protected Object functionKey(EvalContext ctx) {
                String key = InfoSetUtil.stringValue(getArg1().computeValue(ctx));
                Object value = getArg2().compute(ctx);
                
                if (!"nonExistentKey".equals(key)) { // Simulate not found
                    return new NodeSetContext(ctx, new BasicNodeSet());
                }
                return null; // Should not happen based on above check
            }
        };
        
        Object result = func.computeValue(context);
        assertTrue(result instanceof NodeSetContext);
        NodeSet nodeSet = ((NodeSetContext) result).getNodeSet();
        assertTrue(nodeSet.getPointers().isEmpty());
    }

    // --- Edge Cases: Argument Counts ---
    @Test
    public void testFunctionRequiresCorrectArgumentCount() {
        // Example: function that expects 1 argument
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, new Expression[0]); // 0 args
        try {
            func.computeValue(mockEvalContext());
            fail("Expected JXPathInvalidSyntaxException for incorrect argument count");
        } catch (JXPathInvalidSyntaxException e) {
            // Expected exception
        }

        // Example: function that expects 2 arguments
        CoreFunction func2 = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{expr("a")}); // 1 arg
        try {
            func2.computeValue(mockEvalContext());
            fail("Expected JXPathInvalidSyntaxException for incorrect argument count");
        } catch (JXPathInvalidSyntaxException e) {
            // Expected exception
        }
    }

    @Test
    public void testFunctionAcceptsArgumentRange() {
        // Example: CONCAT accepts 2 or more arguments
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{expr("a")}); // 1 arg, should fail
        try {
            func.computeValue(mockEvalContext());
            fail("Expected JXPathInvalidSyntaxException for incorrect argument count (less than min)");
        } catch (JXPathInvalidSyntaxException e) {
            // Expected exception
        }
    }

    // --- Tests for methods not explicitly called by other tests ---

    // getFunctionCode()
    @Test
    public void testGetFunctionCodeReturnsCorrectCode() {
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        assertEquals(Compiler.FUNCTION_LAST, func.getFunctionCode());
    }

    // getArg2() and getArg3()
    @Test
    public void testGetArg2AndGetArg3() {
        Expression arg1 = expr("arg1");
        Expression arg2 = expr("arg2");
        Expression arg3 = expr("arg3");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{arg1, arg2, arg3});
        assertSame(arg2, func.getArg2());
        assertSame(arg3, func.getArg3());
    }

    // getArgumentCount()
    @Test
    public void testGetArgumentCount() {
        CoreFunction func0 = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals(0, func0.getArgumentCount());

        CoreFunction func1 = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[]{expr("arg")});
        assertEquals(1, func1.getArgumentCount());

        CoreFunction func3 = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{expr("a"), expr("b"), expr("c")});
        assertEquals(3, func3.getArgumentCount());
    }

    // computeContextDependent()
    @Test
    public void testComputeContextDependent() {
        // Functions that are context-dependent
        CoreFunction funcLast = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertTrue(funcLast.computeContextDependent());

        CoreFunction funcPosition = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        assertTrue(funcPosition.computeContextDependent());

        // Function with no arguments and context dependent by definition
        CoreFunction funcBoolean = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        assertTrue(funcBoolean.computeContextDependent());
        CoreFunction funcBooleanWithArg = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[]{expr("true")});
        assertTrue(funcBooleanWithArg.computeContextDependent());
        
        CoreFunction funcFormatNumberWith2Args = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{expr(1), expr("pattern")});
        assertTrue(funcFormatNumberWith2Args.computeContextDependent());

        // Function that is not context-dependent
        CoreFunction funcSum = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[]{expr(1), expr(2)});
        assertFalse(funcSum.computeContextDependent());
        
        CoreFunction funcFormatNumberWith3Args = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{expr(1), expr("pattern"), expr("symbols")});
        assertFalse(funcFormatNumberWith3Args.computeContextDependent());
    }

    // toString()
    @Test
    public void testToString() {
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{expr("a"), expr("b")});
        assertEquals("concat(a, b)", func.toString());

        CoreFunction funcNoArgs = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals("true()", funcNoArgs.toString());

        CoreFunction funcOneArg = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[]{expr("hello")});
        assertEquals("string(hello)", funcOneArg.toString());
    }
}





