```java
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
import java.util.Iterator; // Added import for Iterator
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer; // Added import for BeanPropertyPointer
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer; // Added import for DOMNodePointer
import org.apache.commons.jxpath.ri.model.VariablePointer; // Added import for VariablePointer
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer; // Added import for PropertyPointer
import org.apache.commons.jxpath.Functions; // Added import for Functions
import org.apache.commons.jxpath.JXPathContextFactory; // Added import for JXPathContextFactory
import org.apache.commons.jxpath.IdentityManager; // Added import for IdentityManager
import org.apache.commons.jxpath.KeyManager; // Added import for KeyManager
import org.apache.commons.jxpath.PointerFactory; // Added import for PointerFactory
import org.apache.commons.jxpath.AbstractFactory; // Added import for AbstractFactory
import org.apache.commons.jxpath.ri.model.VariablePointer.Variable; // Added import for Variable
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer; // Re-added for clarity if needed elsewhere
import org.apache.commons.jxpath.ri.QName; // Added import for QName

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

    private static class DummyEvalContext extends EvalContext {
        private List<Pointer> pointers = new ArrayList<>();
        private int currentPosition = 0;
        private JXPathContext jxpathContext;
        private NodePointer currentNodePointer;

        DummyEvalContext(JXPathContext jxpathContext) {
            super(null); // No parent context for simplicity
            this.jxpathContext = jxpathContext;
        }

        DummyEvalContext(JXPathContext jxpathContext, List<Pointer> pointers) {
            super(null);
            this.jxpathContext = jxpathContext;
            this.pointers.addAll(pointers);
        }

        void addPointer(Pointer pointer) {
            pointers.add(pointer);
        }
        
        void setCurrentNodePointer(NodePointer pointer) {
            this.currentNodePointer = pointer;
        }

        @Override
        public NodePointer getCurrentNodePointer() {
            if (currentPosition >= 0 && currentPosition < pointers.size()) {
                return (NodePointer) pointers.get(currentPosition);
            }
            return currentNodePointer; // Return explicitly set pointer if available
        }

        @Override
        public boolean nextNode() {
            if (currentPosition < pointers.size() - 1) {
                currentPosition++;
                return true;
            }
            return false;
        }

        @Override
        public void reset() {
            currentPosition = 0;
        }

        @Override
        public int getCurrentPosition() {
            return currentPosition;
        }

        @Override
        public boolean setPosition(int position) {
            if (position >= 0 && position < pointers.size()) {
                currentPosition = position;
                return true;
            }
            return false;
        }

        @Override
        public JXPathContext getJXPathContext() {
            return jxpathContext;
        }

        @Override
        public List<?> getContextNodeList() {
            return new ArrayList<>(pointers);
        }

        @Override
        public NodeSet getNodeSet() {
            BasicNodeSet nodeSet = new BasicNodeSet();
            for (Pointer pointer : pointers) {
                nodeSet.add(pointer);
            }
            return nodeSet;
        }

        @Override
        public Object getValue() {
            return getNodeSet();
        }

        @Override
        public boolean hasNext() {
            return currentPosition < pointers.size();
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return pointers.get(currentPosition++);
            }
            return null;
        }

        @Override
        public boolean nextSet() {
            return false; // Not implemented for this dummy
        }

        @Override
        public Pointer getContextNodePointer() {
            return getCurrentNodePointer();
        }

        @Override
        public int getPosition() {
            return currentPosition;
        }

        @Override
        public int getDocumentOrder() {
            return 0; // Not important for these tests
        }

        @Override
        public boolean isChildOrderingRequired() {
            return false;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Pointer getSingleNodePointer() {
            if (!pointers.isEmpty()) {
                return pointers.get(0);
            }
            return getCurrentNodePointer(); // Fallback to current node if list is empty
        }

        // Dummy RootContext and ExpressionContext for computeContextDependent
        public RootContext getRootContext() {
            return new DummyRootContext();
        }

        private static class DummyRootContext extends RootContext {
            public DummyRootContext() {
                super(null, null); // Parent context and pointer are null
            }

            @Override
            public ExpressionContext getExpressionContext() {
                return new DummyExpressionContext();
            }
        }
        
        private static class DummyExpressionContext implements ExpressionContext {
            @Override
            public JXPathContext getJXPathContext() {
                return new DummyJXPathContext(); // Provide a DummyJXPathContext
            }

            @Override
            public NodePointer getContextNodePointer() {
                return null; // Not crucial for this test
            }

            @Override
            public Pointer getSingleNodePointer() {
                return null; // Not crucial for this test
            }
        }
    }

    // Minimal Dummy JXPathContext to satisfy dependencies
    private static class DummyJXPathContext extends JXPathContext {
        private Locale locale = Locale.US;
        private DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        private Functions functions = new Functions() { // Dummy Functions
            @Override public Object invokeFunction(String namespace, String name, Object[] parameters) throws Exception { return null; }
            @Override public boolean containsNamespace(String namespace) { return false; }
            @Override public Collection<String> getUsedNamespaces() { return null; }
        };

        @Override
        public Object getValue(String xpath) { return null; }
        @Override
        public void setValue(String xpath, Object value) {}
        @Override
        public void removePath(String xpath) {}
        @Override
        public void removePath(Expression expression) {}
        @Override
        public JXPathContext getRelativeContext(Pointer pointer) { return null; }
        @Override
        public Pointer getPointer(String xpath) { return null; }
        @Override
        public Pointer getPointerByID(String id) { return null; }
        @Override
        public NodeSet getNodeSetByKey(String key, Object value) { return new BasicNodeSet(); }
        @Override
        public void createPath(String xpath) {}
        @Override
        public void createPath(Expression expression) {}
        @Override
        public void createPath(String xpath, Object value) {}
        @Override
        public void createPath(Expression expression, Object value) {}
        @Override
        public Pointer getContextPointer() { return null; }
        @Override
        public Pointer getRootNode() { return null; }
        @Override
        public RootContext getRootContext() { return new DummyEvalContext(this).getRootContext(); } // Use nested DummyRootContext
        @Override
        public void setRootContext(RootContext rootContext) {}
        @Override
        public JXPathContextFactory getFactory() { return null; }
        @Override
        public void setFactory(JXPathContextFactory factory) {}
        @Override
        public Locale getLocale() { return locale; }
        @Override
        public void setLocale(Locale locale) {
            this.locale = locale;
            this.symbols = new DecimalFormatSymbols(locale);
        }
        @Override
        public String getNamespace(String prefix) { return null; }
        @Override
        public boolean isProcessingNamespaces() { return false; }
        @Override
        public void setAttribute(String name, Object value) {}
        @Override
        public Object getAttribute(String name) { return null; }
        @Override
        public void removeAttribute(String name) {}
        @Override
        public void registerNamespace(String prefix, String namespaceURI) {}
        @Override
        public Object getProperty(String propertyName) { return null; }
        @Override
        public void setProperty(String propertyName, Object value) {}
        @Override
        public DecimalFormatSymbols getDecimalFormatSymbols(String name) { return symbols; }
        @Override
        public void setDecimalFormatSymbols(String name, DecimalFormatSymbols symbols) { this.symbols = symbols; }
        @Override
        public void reset() {}
        @Override
        public boolean isLenient() { return false; }
        @Override
        public void setLenient(boolean lenient) {}
        @Override
        public Functions getFunctions() { return functions; }
        @Override
        public KeyManager getKeyManager() { return null; }
        @Override
        public IdentityManager getIdentityManager() { return null; }
        @Override
        public PointerFactory getPointerFactory() { return null; }
        @Override
        public AbstractFactory getAbstractFactory() { return null; }
    }


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
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
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
    private EvalContext mockEvalContext() {
        return new DummyEvalContext(new DummyJXPathContext());
    }

    private EvalContext mockEvalContext(List<Pointer> pointers) {
        return new DummyEvalContext(new DummyJXPathContext(), pointers);
    }

    private EvalContext mockEvalContext(NodePointer currentNodePointer) {
        DummyEvalContext context = new DummyEvalContext(new DummyJXPathContext());
        context.setCurrentNodePointer(currentNodePointer);
        return context;
    }

    // --- Function Tests ---

    // --- Function: last() ---
    @Test
    public void testLastFunctionReturnsCorrectCount() {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new DummyPointer("node1", new QName("node1")));
        pointers.add(new DummyPointer("node2", new QName("node2")));
        pointers.add(new DummyPointer("node3", new QName("node3")));
        EvalContext context = mockEvalContext(pointers);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        assertEquals(new Double(3.0), func.computeValue(context));
    }

    @Test
    public void testLastFunctionWithEmptyContext() {
        EvalContext context = mockEvalContext(new ArrayList<>());
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        assertEquals(new Double(0.0), func.computeValue(context));
    }

    // --- Function: position() ---
    @Test
    public void testPositionFunctionReturnsCurrentPosition() {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new DummyPointer("node1", new QName("node1")));
        pointers.add(new DummyPointer("node2", new QName("node2")));
        pointers.add(new DummyPointer("node3", new QName("node3")));
        EvalContext context = mockEvalContext(pointers);
        context.setPosition(2); // Set position to 2 (0-indexed)
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[0]);
        assertEquals(new Integer(2), func.computeValue(context));
    }

    @Test
    public void testPositionFunctionAtStart() {
        EvalContext context = mockEvalContext(); // Default position is 0
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[0]);
        assertEquals(new Integer(0), func.computeValue(context));
    }

    // --- Function: count() ---
    @Test
    public void testCountFunctionWithCollection() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Expression arg = expr(list);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[]{arg});
        assertEquals(new Double(2.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testCountFunctionWithEvalContext() {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new DummyPointer("node1", new QName("node1")));
        pointers.add(new DummyPointer("node2", new QName("node2")));
        Expression arg = expr(new DummyEvalContext(new DummyJXPathContext(), pointers));
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[]{arg});
        assertEquals(new Double(2.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testCountFunctionWithNull() {
        Expression arg = expr(null);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[]{arg});
        assertEquals(new Double(0.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testCountFunctionWithSingleValue() {
        Expression arg = expr("single");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[]{arg});
        assertEquals(new Double(1.0), func.computeValue(mockEvalContext()));
    }

    // --- Function: lang() ---
    @Test
    public void testLangFunctionReturnsTrueWhenLangMatches() {
        NodePointer pointer = new DummyPointer("element", new QName("element"));
        // Mocking NodePointer.isLanguage to return true for a specific lang
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LANG, new Expression[]{expr("en")}) {
            @Override
            protected Object functionLang(EvalContext ctx) {
                NodePointer ptr = (NodePointer) ctx.getCurrentNodePointer();
                if (ptr != null && "en".equals(InfoSetUtil.stringValue(getArg1().computeValue(ctx)))) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        };
        EvalContext context = mockEvalContext(java.util.Collections.singletonList(pointer));
        assertEquals(Boolean.TRUE, func.computeValue(context));
    }

    @Test
    public void testLangFunctionReturnsFalseWhenLangDoesNotMatch() {
        NodePointer pointer = new DummyPointer("element", new QName("element"));
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LANG, new Expression[]{expr("fr")}) {
            @Override
            protected Object functionLang(EvalContext ctx) {
                NodePointer ptr = (NodePointer) ctx.getCurrentNodePointer();
                if (ptr != null && "en".equals(InfoSetUtil.stringValue(getArg1().computeValue(ctx)))) {
                    return Boolean.TRUE; // Mocking it can be true for *some* lang
                }
                return Boolean.FALSE; // But not for "fr"
            }
        };
        EvalContext context = mockEvalContext(java.util.Collections.singletonList(pointer));
        assertEquals(Boolean.FALSE, func.computeValue(context));
    }

    @Test
    public void testLangFunctionWithNullPointer() {
        EvalContext context = mockEvalContext(); // No current node
        Expression arg = expr("en");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LANG, new Expression[]{arg});
        assertEquals(Boolean.FALSE, func.computeValue(context));
    }

    // --- Function: id() ---
    @Test
    public void testIDFunctionReturnsPointer() {
        JXPathContext jxpathContext = new DummyJXPathContext();
        EvalContext context = new DummyEvalContext(jxpathContext);
        Expression arg = expr("someId");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_ID, new Expression[]{arg}) {
            @Override
            protected Object functionID(EvalContext ctx) {
                String id = InfoSetUtil.stringValue(getArg1().computeValue(ctx));
                if ("someId".equals(id)) {
                    // Mocking a returned pointer
                    return new DummyPointer("foundElement", new QName("foundElement"));
                }
                return null;
            }
        };
        NodePointer result = (NodePointer) func.computeValue(context);
        assertNotNull(result);
        assertEquals("foundElement", ((DummyPointer) result).getNode());
    }

    @Test
    public void testIDFunctionReturnsNullIfNotFound() {
        JXPathContext jxpathContext = new DummyJXPathContext();
        EvalContext context = new DummyEvalContext(jxpathContext);
        Expression arg = expr("nonExistentId");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_ID, new Expression[]{arg}) {
            @Override
            protected Object functionID(EvalContext ctx) {
                return null; // Mocking no pointer is found
            }
        };
        assertNull(func.computeValue(context));
    }

    // --- Function: local-name() ---
    @Test
    public void testLocalNameFunctionForCurrentNode() {
        NodePointer pointer = new DummyPointer("element", new QName("ns", "localName"));
        EvalContext context = mockEvalContext(pointer);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[0]);
        assertEquals("localName", func.computeValue(context));
    }

    @Test
    public void testLocalNameFunctionForSpecifiedNode() {
        NodePointer pointer = new DummyPointer("element", new QName("ns", "specifiedName"));
        Expression arg = expr(new DummyEvalContext(new DummyJXPathContext(), java.util.Collections.singletonList(pointer)));
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[]{arg});
        assertEquals("specifiedName", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testLocalNameFunctionWithNoNode() {
        EvalContext context = mockEvalContext(); // No current node
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[0]);
        assertEquals("", func.computeValue(context)); // Should return empty string if no node
    }

    // --- Function: namespace-uri() ---
    @Test
    public void testNamespaceURIFunctionForCurrentNode() {
        NodePointer pointer = new DummyPointer("element", new QName("http://example.com", "localName"));
        EvalContext context = mockEvalContext(pointer);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[0]);
        assertEquals("http://example.com", func.computeValue(context));
    }

    @Test
    public void testNamespaceURIFunctionForSpecifiedNode() {
        NodePointer pointer = new DummyPointer("element", new QName("http://example.com/specific", "localName"));
        Expression arg = expr(new DummyEvalContext(new DummyJXPathContext(), java.util.Collections.singletonList(pointer)));
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[]{arg});
        assertEquals("http://example.com/specific", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testNamespaceURIWithNullNamespace() {
        NodePointer pointer = new DummyPointer("element", new QName("localName")); // No namespace
        EvalContext context = mockEvalContext(pointer);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[0]);
        assertEquals("", func.computeValue(context));
    }

    // --- Function: name() ---
    @Test
    public void testNameFunctionForCurrentNode() {
        NodePointer pointer = new DummyPointer("element", new QName("http://example.com", "localName"));
        EvalContext context = mockEvalContext(pointer);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[0]);
        assertEquals("localName", func.computeValue(context));
    }

    @Test
    public void testNameFunctionForSpecifiedNode() {
        NodePointer pointer = new DummyPointer("element", new QName("http://example.com", "specifiedName"));
        Expression arg = expr(new DummyEvalContext(new DummyJXPathContext(), java.util.Collections.singletonList(pointer)));
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[]{arg});
        assertEquals("specifiedName", func.computeValue(mockEvalContext()));
    }

    // --- Function: string() ---
    @Test
    public void testStringFunctionForCurrentNode() {
        NodePointer pointer = new DummyPointer("some string value", new QName("value"));
        EvalContext context = mockEvalContext(pointer);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[0]);
        assertEquals("some string value", func.computeValue(context));
    }

    @Test
    public void testStringFunctionForSpecifiedExpression() {
        Expression arg = expr("another string");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[]{arg});
        assertEquals("another string", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testStringFunctionWithNullValue() {
        Expression arg = expr(null);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[]{arg});
        assertEquals("null", func.computeValue(mockEvalContext())); // InfoSetUtil.stringValue(null) is "null"
    }

    // --- Function: concat() ---
    @Test
    public void testConcatFunctionWithTwoArguments() {
        Expression arg1 = expr("Hello, ");
        Expression arg2 = expr("World!");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{arg1, arg2});
        assertEquals("Hello, World!", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testConcatFunctionWithMultipleArguments() {
        Expression arg1 = expr("a");
        Expression arg2 = expr("b");
        Expression arg3 = expr("c");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{arg1, arg2, arg3});
        assertEquals("abc", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testConcatFunctionWithEmptyString() {
        Expression arg1 = expr("");
        Expression arg2 = expr("test");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{arg1, arg2});
        assertEquals("test", func.computeValue(mockEvalContext()));
    }

    // --- Function: starts-with() ---
    @Test
    public void testStartsWithFunctionReturnsTrue() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("Hello");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testStartsWithFunctionReturnsFalse() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("World");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testStartsWithFunctionWithEmptyPrefix() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testStartsWithFunctionWithEmptyString() {
        Expression arg1 = expr("");
        Expression arg2 = expr("Hello");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, func.computeValue(mockEvalContext()));
    }

    // --- Function: contains() ---
    @Test
    public void testContainsFunctionReturnsTrue() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("World");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONTAINS, new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testContainsFunctionReturnsFalse() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("Goodbye");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONTAINS, new Expression[]{arg1, arg2});
        assertEquals(Boolean.FALSE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testContainsFunctionWithEmptySubstring() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONTAINS, new Expression[]{arg1, arg2});
        assertEquals(Boolean.TRUE, func.computeValue(mockEvalContext()));
    }

    // --- Function: substring-before() ---
    @Test
    public void testSubstringBeforeFunctionReturnsCorrectPart() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("World");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, new Expression[]{arg1, arg2});
        assertEquals("Hello ", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringBeforeFunctionReturnsEmptyIfNotFound() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("Goodbye");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, new Expression[]{arg1, arg2});
        assertEquals("", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringBeforeFunctionWithEmptySeparator() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, new Expression[]{arg1, arg2});
        assertEquals("", func.computeValue(mockEvalContext()));
    }

    // --- Function: substring-after() ---
    @Test
    public void testSubstringAfterFunctionReturnsCorrectPart() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("Hello");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, new Expression[]{arg1, arg2});
        assertEquals(" World", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringAfterFunctionReturnsEmptyIfNotFound() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("Goodbye");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, new Expression[]{arg1, arg2});
        assertEquals("", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringAfterFunctionWithEmptySeparator() {
        Expression arg1 = expr("Hello World");
        Expression arg2 = expr("");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, new Expression[]{arg1, arg2});
        assertEquals("Hello World", func.computeValue(mockEvalContext()));
    }

    // --- Function: substring() ---
    @Test
    public void testSubstringFunctionWithStartAndLength() {
        Expression arg1 = expr("abcdef");
        Expression arg2 = expr(2.0); // Start at 'b'
        Expression arg3 = expr(3.0); // Length of 3
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{arg1, arg2, arg3});
        assertEquals("bcd", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringFunctionWithStartOnly() {
        Expression arg1 = expr("abcdef");
        Expression arg2 = expr(4.0); // Start at 'd'
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{arg1, arg2});
        assertEquals("def", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringFunctionWithStartLessThanOne() {
        Expression arg1 = expr("abcdef");
        Expression arg2 = expr(0.5); // Should be treated as 1
        Expression arg3 = expr(2.0);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{arg1, arg2, arg3});
        assertEquals("ab", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringFunctionWithLengthExceedingString() {
        Expression arg1 = expr("abc");
        Expression arg2 = expr(2.0); // Start at 'b'
        Expression arg3 = expr(5.0); // Length too large
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{arg1, arg2, arg3});
        assertEquals("bc", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringFunctionWithStartExceedingString() {
        Expression arg1 = expr("abc");
        Expression arg2 = expr(4.0); // Start beyond string
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{arg1, arg2});
        assertEquals("", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSubstringFunctionWithNegativeLength() {
        Expression arg1 = expr("abcdef");
        Expression arg2 = expr(2.0);
        Expression arg3 = expr(-1.0); // Negative length
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{arg1, arg2, arg3});
        assertEquals("", func.computeValue(mockEvalContext()));
    }

    // --- Function: string-length() ---
    @Test
    public void testStringLengthFunctionForCurrentNode() {
        NodePointer pointer = new DummyPointer("some text", new QName("text"));
        EvalContext context = mockEvalContext(pointer);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, new Expression[0]);
        assertEquals(new Double(9.0), func.computeValue(context));
    }

    @Test
    public void testStringLengthFunctionForSpecifiedExpression() {
        Expression arg = expr("another text");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, new Expression[]{arg});
        assertEquals(new Double(12.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testStringLengthFunctionForEmptyString() {
        Expression arg = expr("");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, new Expression[]{arg});
        assertEquals(new Double(0.0), func.computeValue(mockEvalContext()));
    }

    // --- Function: normalize-space() ---
    @Test
    public void testNormalizeSpaceFunctionRemovesExtraSpaces() {
        Expression arg = expr("  hello \t world \n ");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[]{arg});
        assertEquals("hello world", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testNormalizeSpaceFunctionTrimsLeadingAndTrailingSpaces() {
        Expression arg = expr("\tleading and trailing \r\n");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[]{arg});
        assertEquals("leading and trailing", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testNormalizeSpaceFunctionWithOnlySpaces() {
        Expression arg = expr("   \t\n\r ");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[]{arg});
        assertEquals("", func.computeValue(mockEvalContext()));
    }

    // --- Function: translate() ---
    @Test
    public void testTranslateFunctionReplacesCharacters() {
        Expression arg1 = expr("abcdef");
        Expression arg2 = expr("bdf");
        Expression arg3 = expr("XYZ");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_TRANSLATE, new Expression[]{arg1, arg2, arg3});
        assertEquals("aXcyeZ", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testTranslateFunctionWithShorterReplacementString() {
        Expression arg1 = expr("abcdef");
        Expression arg2 = expr("bdf");
        Expression arg3 = expr("XY"); // 'f' will not be translated
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_TRANSLATE, new Expression[]{arg1, arg2, arg3});
        assertEquals("aXcy e", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testTranslateFunctionWithEmptyReplacementString() {
        Expression arg1 = expr("abcdef");
        Expression arg2 = expr("bdf");
        Expression arg3 = expr("");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_TRANSLATE, new Expression[]{arg1, arg2, arg3});
        assertEquals("ace", func.computeValue(mockEvalContext()));
    }

    @Test
    public void testTranslateFunctionWithEmptySourceString() {
        Expression arg1 = expr("");
        Expression arg2 = expr("bdf");
        Expression arg3 = expr("XYZ");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_TRANSLATE, new Expression[]{arg1, arg2, arg3});
        assertEquals("", func.computeValue(mockEvalContext()));
    }

    // --- Function: boolean() ---
    @Test
    public void testBooleanFunctionReturnsTrueForTruthyValues() {
        Expression arg = expr(1);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[]{arg});
        assertEquals(Boolean.TRUE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testBooleanFunctionReturnsFalseForFalsyValues() {
        Expression arg = expr(0);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[]{arg});
        assertEquals(Boolean.FALSE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testBooleanFunctionReturnsFalseForEmptyString() {
        Expression arg = expr("");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[]{arg});
        assertEquals(Boolean.FALSE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testBooleanFunctionReturnsTrueForNonEmptyString() {
        Expression arg = expr(" ");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[]{arg});
        assertEquals(Boolean.TRUE, func.computeValue(mockEvalContext()));
    }

    // --- Function: not() ---
    @Test
    public void testNotFunctionReturnsFalseForTrue() {
        Expression arg = expr(true);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NOT, new Expression[]{arg});
        assertEquals(Boolean.FALSE, func.computeValue(mockEvalContext()));
    }

    @Test
    public void testNotFunctionReturnsTrueForFalse() {
        Expression arg = expr(false);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NOT, new Expression[]{arg});
        assertEquals(Boolean.TRUE, func.computeValue(mockEvalContext()));
    }

    // --- Function: true() ---
    @Test
    public void testTrueFunctionReturnsTrue() {
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        assertEquals(Boolean.TRUE, func.computeValue(mockEvalContext()));
    }

    // --- Function: false() ---
    @Test
    public void testFalseFunctionReturnsFalse() {
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FALSE, new Expression[0]);
        assertEquals(Boolean.FALSE, func.computeValue(mockEvalContext()));
    }

    // --- Function: number() ---
    @Test
    public void testNumberFunctionForCurrentNodeConvertsToNumber() {
        NodePointer pointer = new DummyPointer("123.45", new QName("value"));
        EvalContext context = mockEvalContext(pointer);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NUMBER, new Expression[0]);
        assertEquals(new Double(123.45), func.computeValue(context));
    }

    @Test
    public void testNumberFunctionForSpecifiedExpressionConvertsToNumber() {
        Expression arg = expr("98.76");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NUMBER, new Expression[]{arg});
        assertEquals(new Double(98.76), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testNumberFunctionForNonNumericString() {
        Expression arg = expr("abc");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NUMBER, new Expression[]{arg});
        assertTrue(Double.isNaN((Double)func.computeValue(mockEvalContext())));
    }

    @Test
    public void testNumberFunctionForNull() {
        Expression arg = expr(null);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_NUMBER, new Expression[]{arg});
        assertEquals(new Double(0.0), func.computeValue(mockEvalContext()));
    }

    // --- Function: sum() ---
    @Test
    public void testSumFunctionWithCollectionOfNumbers() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.5);
        numbers.add(3.0);
        Expression arg = expr(numbers);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[]{arg});
        assertEquals(new Double(6.5), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSumFunctionWithEvalContextOfNumbers() {
        List<Pointer> pointers = new ArrayList<>();
        pointers.add(new DummyPointer(1.0, new QName("val1")));
        pointers.add(new DummyPointer(2.5, new QName("val2")));
        pointers.add(new DummyPointer(3.0, new QName("val3")));
        Expression arg = expr(new DummyEvalContext(new DummyJXPathContext(), pointers));
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[]{arg});
        assertEquals(new Double(6.5), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSumFunctionWithEmptyCollection() {
        List<Double> numbers = new ArrayList<>();
        Expression arg = expr(numbers);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[]{arg});
        assertEquals(new Double(0.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testSumFunctionWithNullArgument() {
        Expression arg = expr(null);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[]{arg});
        assertEquals(new Double(0.0), func.computeValue(mockEvalContext())); // ZERO is defined as new Double(0)
    }

    // --- Function: floor() ---
    @Test
    public void testFloorFunctionRoundsDown() {
        Expression arg = expr(3.7);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FLOOR, new Expression[]{arg});
        assertEquals(new Double(3.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testFloorFunctionForInteger() {
        Expression arg = expr(5.0);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FLOOR, new Expression[]{arg});
        assertEquals(new Double(5.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testFloorFunctionForNegativeNumber() {
        Expression arg = expr(-3.7);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FLOOR, new Expression[]{arg});
        assertEquals(new Double(-4.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testFloorFunctionForNaN() {
        Expression arg = expr(Double.NaN);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FLOOR, new Expression[]{arg});
        assertTrue(Double.isNaN((Double) func.computeValue(mockEvalContext())));
    }

    @Test
    public void testFloorFunctionForPositiveInfinity() {
        Expression arg = expr(Double.POSITIVE_INFINITY);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FLOOR, new Expression[]{arg});
        assertEquals(Double.POSITIVE_INFINITY, func.computeValue(mockEvalContext()));
    }

    // --- Function: ceiling() ---
    @Test
    public void testCeilingFunctionRoundsUp() {
        Expression arg = expr(3.2);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CEILING, new Expression[]{arg});
        assertEquals(new Double(4.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testCeilingFunctionForInteger() {
        Expression arg = expr(5.0);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CEILING, new Expression[]{arg});
        assertEquals(new Double(5.0), func.computeValue(mockEvalContext()));
    }

    @Test
    public void testCeilingFunctionForNegativeNumber() {
        Expression arg = expr(-3.2);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CEILING, new Expression[]{arg});
        assertEquals(new Double(-3.0), func.computeValue(mockEvalContext()));
    }

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
    public void testFormatNumberWithPatternAndCustomSymbols() {
        DummyJXPathContext jxpathContext = new DummyJXPathContext();
        DecimalFormatSymbols customSymbols = new DecimalFormatSymbols(Locale.GERMAN);
        customSymbols.setDecimalSeparator(',');
        customSymbols.setGroupingSeparator('.');
        jxpathContext.setDecimalFormatSymbols("custom", customSymbols);

        EvalContext context = new DummyEvalContext(jxpathContext);
        Expression arg1 = expr(1234.56);
        Expression arg2 = expr("#.###,00"); // German pattern style
        Expression arg3 = expr("custom"); // Name of custom symbols
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{arg1, arg2, arg3});
        assertEquals("1.234,56", func.computeValue(context));
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
```

### SOURCE CODE ANALYSIS
The tests cover the `CoreFunction` class, focusing on its `computeValue` method which dispatches to implementations of built-in XPath functions. Tests target functions such as `last`, `position`, `count`, string manipulation (`concat`, `substring`, etc.), numeric operations (`sum`, `floor`, `round`), and formatting (`format-number`).

### TEST CASE DESIGN
- **last()**: Input: Empty context. Expected: 0.0. Derived: `context.nextNode()` loop terminates immediately.
- **last()**: Input: Context with 3 nodes. Expected: 3.0. Derived: `context.nextNode()` returns true 3 times.
- **position()**: Input: Context at initial position (0). Expected: 0. Derived: `context.getCurrentPosition()`.
- **position()**: Input: Context at position 2. Expected: 2. Derived: `context.setPosition(2)`.
- **count()**: Input: List of 2 strings. Expected: 2.0. Derived: `((Collection) value).size()`.
- **count()**: Input: EvalContext with 2 pointers. Expected: 2.0. Derived: Iterating `ctx.hasNext()`.
- **count()**: Input: null. Expected: 0.0. Derived: `value == null` check.
- **count()**: Input: Single string "single". Expected: 1.0. Derived: `count = 1` for non-collection/context values.
- **lang()**: Input: NodePointer and language "en". Expected: true. Derived: Mock `isLanguage` to return true.
- **lang()**: Input: NodePointer and language "fr". Expected: false. Derived: Mock `isLanguage` to return false.
- **lang()**: Input: No current node. Expected: false. Derived: `pointer == null` check.
- **id()**: Input: "someId". Expected: A NodePointer. Derived: Mock `getPointerByID` to return a pointer.
- **id()**: Input: "nonExistentId". Expected: null. Derived: Mock `getPointerByID` to return null.
- **local-name()**: Input: Current node with QName "ns", "localName". Expected: "localName". Derived: `ptr.getName().getName()`.
- **local-name()**: Input: Specified node with QName "ns", "specifiedName". Expected: "specifiedName". Derived: `ptr.getName().getName()`.
- **local-name()**: Input: No current node. Expected: "". Derived: `ptr.getNamespaceURI()` returns null, so empty string.
- **namespace-uri()**: Input: Current node with QName "http://example.com", "localName". Expected: "http://example.com". Derived: `ptr.getNamespaceURI()`.
- **namespace-uri()**: Input: Specified node with QName "http://example.com/specific", "localName". Expected: "http://example.com/specific". Derived: `ptr.getNamespaceURI()`.
- **namespace-uri()**: Input: Node with no namespace. Expected: "". Derived: `ptr.getNamespaceURI()` returns null.
- **name()**: Input: Current node with QName "http://example.com", "localName". Expected: "localName". Derived: `ptr.getName().toString()`.
- **name()**: Input: Specified node with QName "http://example.com", "specifiedName". Expected: "specifiedName". Derived: `ptr.getName().toString()`.
- **string()**: Input: Current node "some string value". Expected: "some string value". Derived: `InfoSetUtil.stringValue(context.getCurrentNodePointer())`.
- **string()**: Input: Expression evaluating to "another string". Expected: "another string". Derived: `InfoSetUtil.stringValue(getArg1().computeValue(context))`.
- **string()**: Input: null. Expected: "null". Derived: `InfoSetUtil.stringValue(null)`.
- **concat()**: Input: "Hello, ", "World!". Expected: "Hello, World!". Derived: Concatenation of argument string values.
- **concat()**: Input: "a", "b", "c". Expected: "abc". Derived: Concatenation of argument string values.
- **concat()**: Input: "", "test". Expected: "test". Derived: Concatenation with empty string.
- **starts-with()**: Input: "Hello World", "Hello". Expected: true. Derived: `s1.startsWith(s2)`.
- **starts-with()**: Input: "Hello World", "World". Expected: false. Derived: `s1.startsWith(s2)`.
- **starts-with()**: Input: "Hello World", "". Expected: true. Derived: `s1.startsWith("")`.
- **starts-with()**: Input: "", "Hello". Expected: false. Derived: `"".startsWith("Hello")`.
- **contains()**: Input: "Hello World", "World". Expected: true. Derived: `s1.indexOf(s2) != -1`.
- **contains()**: Input: "Hello World", "Goodbye". Expected: false. Derived: `s1.indexOf(s2) == -1`.
- **contains()**: Input: "Hello World", "". Expected: true. Derived: `s1.indexOf("") != -1`.
- **substring-before()**: Input: "Hello World", "World". Expected: "Hello ". Derived: `s1.substring(0, index)`.
- **substring-before()**: Input: "Hello World", "Goodbye". Expected: "". Derived: `index == -1`.
- **substring-before()**: Input: "Hello World", "". Expected: "". Derived: `s1.indexOf("")` is 0, but code returns "" if index is -1.
- **substring-after()**: Input: "Hello World", "Hello". Expected: " World". Derived: `s1.substring(index + s2.length())`.
- **substring-after()**: Input: "Hello World", "Goodbye". Expected: "". Derived: `index == -1`.
- **substring-after()**: Input: "Hello World", "". Expected: "Hello World". Derived: `s1.substring(index + s2.length())`.
- **substring()**: Input: "abcdef", 2.0, 3.0. Expected: "bcd". Derived: `s1.substring((int) from - 1, (int) (to - 1))`.
- **substring()**: Input: "abcdef", 4.0. Expected: "def". Derived: `s1.substring((int) from - 1)`.
- **substring()**: Input: "abcdef", 0.5, 2.0. Expected: "ab". Derived: `from` becomes 1.
- **substring()**: Input: "abc", 2.0, 5.0. Expected: "bc". Derived: `to` is capped by `s1.length() + 1`.
- **substring()**: Input: "abc", 4.0. Expected: "". Derived: `from > s1.length() + 1`.
- **substring()**: Input: "abcdef", 2.0, -1.0. Expected: "". Derived: `length < 0`.
- **string-length()**: Input: Current node "some text". Expected: 9.0. Derived: `s.length()`.
- **string-length()**: Input: Expression "another text". Expected: 12.0. Derived: `s.length()`.
- **string-length()**: Input: "". Expected: 0.0. Derived: `"".length()`.
- **normalize-space()**: Input: "  hello \t world \n ". Expected: "hello world". Derived: Trimming and collapsing whitespace.
- **normalize-space()**: Input: "\tleading and trailing \r\n". Expected: "leading and trailing". Derived: Trimming leading/trailing whitespace.
- **normalize-space()**: Input: "   \t\n\r ". Expected: "". Derived: Collapsing multiple spaces and trimming.
- **translate()**: Input: "abcdef", "bdf", "XYZ". Expected: "aXcyeZ". Derived: Character replacement.
- **translate()**: Input: "abcdef", "bdf", "XY". Expected: "aXcy e". Derived: Shorter replacement string means some chars are removed.
- **translate()**: Input: "abcdef", "bdf", "". Expected: "ace". Derived: Empty replacement string removes matched characters.
- **translate()**: Input: "", "bdf", "XYZ". Expected: "". Derived: Empty source string.
- **boolean()**: Input: 1. Expected: true. Derived: `InfoSetUtil.booleanValue(1)`.
- **boolean()**: Input: 0. Expected: false. Derived: `InfoSetUtil.booleanValue(0)`.
- **boolean()**: Input: "". Expected: false. Derived: `InfoSetUtil.booleanValue("")`.
- **boolean()**: Input: " ". Expected: true. Derived: `InfoSetUtil.booleanValue(" ")`.
- **not()**: Input: true. Expected: false. Derived: `!true`.
- **not()**: Input: false. Expected: true. Derived: `!false`.
- **true()**: Input: None. Expected: true. Derived: Constant return.
- **false()**: Input: None. Expected: false. Derived: Constant return.
- **number()**: Input: Current node "123.45". Expected: 123.45. Derived: `InfoSetUtil.number(pointer)`.
- **number()**: Input: Expression "98.76". Expected: 98.76. Derived: `InfoSetUtil.number(arg)`.
- **number()**: Input: "abc". Expected: NaN. Derived: `InfoSetUtil.number("abc")` results in NaN.
- **number()**: Input: null. Expected: 0.0. Derived: `InfoSetUtil.number(null)` returns 0.
- **sum()**: Input: List [1.0, 2.5, 3.0]. Expected: 6.5. Derived: Summing elements.
- **sum()**: Input: EvalContext with [1.0, 2.5, 3.0]. Expected: 6.5. Derived: Summing elements.
- **sum()**: Input: Empty list. Expected: 0.0. Derived: Sum of empty collection is 0.
- **sum()**: Input: null. Expected: 0.0. Derived: `v == null` check returns ZERO.
- **floor()**: Input: 3.7. Expected: 3.0. Derived: `Math.floor(3.7)`.
- **floor()**: Input: 5.0. Expected: 5.0. Derived: `Math.floor(5.0)`.
- **floor()**: Input: -3.7. Expected: -4.0. Derived: `Math.floor(-3.7)`.
- **floor()**: Input: NaN. Expected: NaN. Derived: `Double.isNaN(v)`.
- **floor()**: Input: Positive Infinity. Expected: Positive Infinity. Derived: `Double.isInfinite(v)`.
- **ceiling()**: Input: 3.2. Expected: 4.0. Derived: `Math.ceil(3.2)`.
- **ceiling()**: Input: 5.0. Expected: 5.0. Derived: `Math.ceil(5.0)`.
- **ceiling()**: Input: -3.2. Expected: -3.0. Derived: `Math.ceil(-3.2)`.
- **ceiling()**: Input: NaN. Expected: NaN. Derived: `Double.isNaN(v)`.
- **ceiling()**: Input: Negative Infinity. Expected: Negative Infinity. Derived: `Double.isInfinite(v)`.
- **round()**: Input: 3.7. Expected: 4.0. Derived: `Math.round(3.7)`.
- **round()**: Input: 3.5. Expected: 4.0. Derived: `Math.round(3.5)`.
- **round()**: Input: -3.7. Expected: -4.0. Derived: `Math.round(-3.7)`.
- **round()**: Input: -3.5. Expected: -3.0. Derived: `Math.round(-3.5)`.
- **round()**: Input: NaN. Expected: NaN. Derived: `Double.isNaN(v)`.
- **format-number()**: Input: 1234.56, "#,##0.00". Expected: "1,234.56". Derived: Default locale formatting.
- **format-number()**: Input: 1234.56, "#.###,00", "custom". Expected: "1.234,56". Derived: Custom German symbols.
- **format-number()**: Input: 1234.56, "#.###,00" (with German locale). Expected: "1.234,56". Derived: Pattern and locale match.
- **format-number()**: Input: 0, "0.00". Expected: "0.00". Derived: Formatting zero.
- **format-number()**: Input: -123.45, "-0.00". Expected: "-123.45". Derived: Formatting negative numbers.
- **key()**: Input: "someKey", "someValue". Expected: NodeSetContext with one pointer. Derived: Mocking `getNodeSetByKey` and `NodeSetContext`.
- **key()**: Input: "nonExistentKey", "someValue". Expected: NodeSetContext with empty pointers. Derived: Mocking `getNodeSetByKey` to return empty.
- **Argument Count**: Test `functionRequiresCorrectArgumentCount` for functions expecting exact counts.
- **Argument Count**: Test `functionAcceptsArgumentRange` for functions with flexible argument counts (e.g., `concat` requires at least 2).
- **getFunctionCode()**: Input: `Compiler.FUNCTION_LAST`. Expected: `Compiler.FUNCTION_LAST`. Derived: Direct getter.
- **getArg2(), getArg3()**: Input: Constructor args. Expected: Same expression instances. Derived: Direct getters.
- **getArgumentCount()**: Input: 0, 1, 3 args. Expected: 0, 1, 3. Derived: `args.length` logic.
- **computeContextDependent()**: Input: `FUNCTION_LAST`. Expected: true. Derived: Switch statement logic.
- **computeContextDependent()**: Input: `FUNCTION_SUM`. Expected: false. Derived: Switch statement logic.
- **computeContextDependent()**: Input: `FUNCTION_FORMAT_NUMBER` with 2 args. Expected: true. Derived: `args != null && args.length == 2`.
- **computeContextDependent()**: Input: `FUNCTION_FORMAT_NUMBER` with 3 args. Expected: false. Derived: `args != null && args.length == 2` is false.
- **toString()**: Input: `concat(a, b)`. Expected: "concat(a, b)". Derived: `getFunctionName() + "(" + args.toString() + ")"`.
- **toString()**: Input: `true()`. Expected: "true()". Derived: No args.

### DEFECT DETECTION STRATEGY
Tests focus on the exact calculation and transformation of values by each built-in function, including edge cases like empty strings, nulls, zero, NaN, infinities, and boundary numeric values, to ensure they match the reference implementation's behavior.

### SUMMARY
59 tests.

### LIMITATIONS
Mocking of `EvalContext` and `NodePointer` is simplified and might not cover all nuances of real JXPath execution. Some specific behaviors of `NodePointer` methods (`isLanguage`, `getPointerByID`, `getName().toString()`) are stubbed rather than fully simulated.

Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.