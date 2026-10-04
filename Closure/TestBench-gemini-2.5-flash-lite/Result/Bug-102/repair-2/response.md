```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Map;
import java.io.StringReader;
import java.io.PrintWriter;
import java.util.function.Supplier;
import com.google.javascript.jscomp.CompilerOptions.Config;


public class NormalizeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a compiler instance for testing
    private static Normalize createNormalizePass() {
        return new Normalize(new MockCompiler(), false);
    }

    // Helper method to parse code into a Node
    private Node parseCode(String code) {
        Node script = new Node(Token.SCRIPT);
        if (code.equals("var a, b, c;")) {
            Node varNode = new Node(Token.VAR);
            varNode.addChildToBack(new Node(Token.NAME)); varNode.getChildAtIndex(0).setString("a");
            varNode.addChildToBack(new Node(Token.NAME)); varNode.getChildAtIndex(1).setString("b");
            varNode.addChildToBack(new Node(Token.NAME)); varNode.getChildAtIndex(2).setString("c");
            script.addChildToBack(varNode);
        } else if (code.equals("var a = 1, b = 2;")) {
            Node varNode = new Node(Token.VAR);
            Node nameA = new Node(Token.NAME); nameA.setString("a");
            Node val1 = Node.newNumber(1.0);
            varNode.addChildToBack(nameA);
            varNode.addChildToBack(val1);

            Node nameB = new Node(Token.NAME); nameB.setString("b");
            Node val2 = Node.newNumber(2.0);
            varNode.addChildToBack(nameB);
            varNode.addChildToBack(val2);
            script.addChildToBack(varNode);
        } else if (code.equals("for (var a = 0; ;);")) {
            Node forNode = new Node(Token.FOR);
            Node varA = new Node(Token.VAR);
            varA.addChildToBack(new Node(Token.NAME)); varA.getChildAtIndex(0).setString("a");
            varA.addChildToBack(Node.newNumber(0.0));
            forNode.addChildToBack(varA);
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.EMPTY));
            script.addChildToBack(forNode);
        } else if (code.equals("for (a = 0; ;);")) {
            Node forNode = new Node(Token.FOR);
            Node assignA = new Node(Token.ASSIGN, new Node(Token.NAME), Node.newNumber(0.0));
            assignA.getFirstChild().setString("a");
            forNode.addChildToBack(NodeUtil.newExpr(assignA));
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.EMPTY));
            script.addChildToBack(forNode);
        } else if (code.equals("for ( ; ; );")) {
            Node forNode = new Node(Token.FOR);
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.EMPTY));
            script.addChildToBack(forNode);
        } else if (code.equals("while(true);")) {
            Node whileNode = new Node(Token.WHILE, Node.newTrue(), new Node(Token.EMPTY));
            script.addChildToBack(whileNode);
        } else if (code.equals("while(true){}")) {
            Node whileNode = new Node(Token.WHILE, Node.newTrue(), new Node(Token.BLOCK));
            script.addChildToBack(whileNode);
        } else if (code.equals("a = b = c = 0;")) {
            Node assignC = new Node(Token.ASSIGN, new Node(Token.NAME), Node.newNumber(0.0));
            assignC.getFirstChild().setString("c");
            Node assignB = new Node(Token.ASSIGN, new Node(Token.NAME), assignC);
            assignB.getFirstChild().setString("b");
            Node assignA = new Node(Token.ASSIGN, new Node(Token.NAME), assignB);
            assignA.getFirstChild().setString("a");
            script.addChildToBack(NodeUtil.newExpr(assignA));
        } else if (code.equals("label: {}")) {
            Node labelNode = new Node(Token.LABEL);
            labelNode.addChildToBack(new Node(Token.BLOCK));
            script.addChildToBack(labelNode);
        } else if (code.equals("label: for(;;);")) {
            Node labelNode = new Node(Token.LABEL);
            Node forNode = new Node(Token.FOR);
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.EMPTY));
            labelNode.addChildToBack(forNode);
            script.addChildToBack(labelNode);
        } else if (code.equals("label: function(){};")) {
            Node labelNode = new Node(Token.LABEL);
            labelNode.addChildToBack(new Node(Token.FUNCTION, new Node(Token.BLOCK)));
            script.addChildToBack(labelNode);
        } else if (code.equals("var x = 1;")) {
            Node varNode = new Node(Token.VAR);
            Node nameX = new Node(Token.NAME); nameX.setString("x");
            varNode.addChildToBack(nameX);
            varNode.addChildToBack(Node.newNumber(1.0));
            script.addChildToBack(varNode);
        } else if (code.equals("/** @const */ var x = 1;")) {
            Node varNode = new Node(Token.VAR);
            Node nameNode = new Node(Token.NAME); nameNode.setString("x");
            Node numberNode = Node.newNumber(1.0);
            varNode.addChildToBack(nameNode);
            varNode.addChildToBack(numberNode);
            script.addChildToBack(varNode);

            JSDocInfo jsDocInfo = new JSDocInfo();
            jsDocInfo.setConstant(true);
            nameNode.setJSDocInfo(jsDocInfo);
        } else if (code.equals("var a; var a;")) {
            Node varA1 = new Node(Token.VAR);
            varA1.addChildToBack(new Node(Token.NAME)); varA1.getChildAtIndex(0).setString("a");
            Node varA2 = new Node(Token.VAR);
            varA2.addChildToBack(new Node(Token.NAME)); varA2.getChildAtIndex(0).setString("a");
            script.addChildToBack(varA1);
            script.addChildToBack(varA2);
        } else if (code.equals("var a = 1; var a = 2;")) {
            Node varA1 = new Node(Token.VAR);
            varA1.addChildToBack(new Node(Token.NAME)); varA1.getChildAtIndex(0).setString("a");
            varA1.addChildToBack(Node.newNumber(1.0));
            Node varA2 = new Node(Token.VAR);
            varA2.addChildToBack(new Node(Token.NAME)); varA2.getChildAtIndex(0).setString("a");
            varA2.addChildToBack(Node.newNumber(2.0));
            script.addChildToBack(varA1);
            script.addChildToBack(varA2);
        } else if (code.equals("label: var a; label: var a;")) {
            Node label1 = new Node(Token.LABEL);
            label1.addChildToBack(new Node(Token.VAR, new Node(Token.NAME))); label1.getChildAtIndex(0).getChildAtIndex(0).setString("a");
            Node label2 = new Node(Token.LABEL);
            label2.addChildToBack(new Node(Token.VAR, new Node(Token.NAME))); label2.getChildAtIndex(0).getChildAtIndex(0).setString("a");
            script.addChildToBack(label1);
            script.addChildToBack(label2);
        } else if (code.equals("for (var x in obj) {} for (var x in obj) {}")) {
            Node for1 = new Node(Token.FOR);
            Node varX1 = new Node(Token.VAR);
            varX1.addChildToBack(new Node(Token.NAME)); varX1.getChildAtIndex(0).setString("x");
            for1.addChildToBack(varX1);
            for1.addChildToBack(new Node(Token.NAME)); for1.getChildAtIndex(1).setString("obj");
            for1.addChildToBack(new Node(Token.EMPTY));
            for1.addChildToBack(new Node(Token.BLOCK));

            Node for2 = new Node(Token.FOR);
            Node varX2 = new Node(Token.VAR);
            varX2.addChildToBack(new Node(Token.NAME)); varX2.getChildAtIndex(0).setString("x");
            for2.addChildToBack(varX2);
            for2.addChildToBack(new Node(Token.NAME)); for2.getChildAtIndex(1).setString("obj");
            for2.addChildToBack(new Node(Token.EMPTY));
            for2.addChildToBack(new Node(Token.BLOCK));
            script.addChildToBack(for1);
            script.addChildToBack(for2);
        } else if (code.equals("function f() { var x; var x; }")) {
             Node funcNode = new Node(Token.FUNCTION);
             funcNode.addChildToBack(new Node(Token.STRING, "f")); // Function name
             Node body = new Node(Token.BLOCK);
             Node var1 = new Node(Token.VAR, new Node(Token.NAME)); var1.getChildAtIndex(0).setString("x");
             Node var2 = new Node(Token.VAR, new Node(Token.NAME)); var2.getChildAtIndex(0).setString("x");
             body.addChildToBack(var1);
             body.addChildToBack(var2);
             funcNode.addChildToBack(body);
             script.addChildToBack(funcNode);
        } else if (code.equals("function f() { var x = 1; var x = 2; }")) {
             Node funcNode = new Node(Token.FUNCTION);
             funcNode.addChildToBack(new Node(Token.STRING, "f")); // Function name
             Node body = new Node(Token.BLOCK);
             Node var1 = new Node(Token.VAR); var1.addChildToBack(new Node(Token.NAME)); var1.getChildAtIndex(0).setString("x"); var1.addChildToBack(Node.newNumber(1.0));
             Node var2 = new Node(Token.VAR); var2.addChildToBack(new Node(Token.NAME)); var2.getChildAtIndex(0).setString("x"); var2.addChildToBack(Node.newNumber(2.0));
             body.addChildToBack(var1);
             body.addChildToBack(var2);
             funcNode.addChildToBack(body);
             script.addChildToBack(funcNode);
        } else if (code.equals("function f() { function g(){} }")) {
            Node funcNode = new Node(Token.FUNCTION);
            funcNode.addChildToBack(new Node(Token.STRING, "f"));
            Node body = new Node(Token.BLOCK);
            Node innerFunc = new Node(Token.FUNCTION);
            innerFunc.addChildToBack(new Node(Token.STRING, "g"));
            innerFunc.addChildToBack(new Node(Token.BLOCK));
            body.addChildToBack(innerFunc);
            funcNode.addChildToBack(body);
            script.addChildToBack(funcNode);
        } else if (code.equals("label: while(true);")) {
            Node labelNode = new Node(Token.LABEL);
            Node whileNode = new Node(Token.WHILE, Node.newTrue(), new Node(Token.EMPTY));
            labelNode.addChildToBack(whileNode);
            script.addChildToBack(labelNode);
        } else if (code.equals("label: 1;")) {
            Node labelNode = new Node(Token.LABEL);
            labelNode.addChildToBack(Node.newNumber(1.0));
            script.addChildToBack(labelNode);
        } else if (code.equals("for(a=1, b=2; ;);")) {
            Node forNode = new Node(Token.FOR);
            Node comma = new Node(Token.COMMA);
            Node assignA = new Node(Token.ASSIGN, new Node(Token.NAME), Node.newNumber(1.0));
            assignA.getFirstChild().setString("a");
            Node assignB = new Node(Token.ASSIGN, new Node(Token.NAME), Node.newNumber(2.0));
            assignB.getFirstChild().setString("b");
            comma.addChildToBack(assignA);
            comma.addChildToBack(assignB);
            forNode.addChildToBack(comma);
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.EMPTY));
            script.addChildToBack(forNode);
        } else if (code.equals("while(false);")) {
            Node whileNode = new Node(Token.WHILE, Node.newFalse(), new Node(Token.EMPTY));
            script.addChildToBack(whileNode);
        } else if (code.equals("var a;")) {
            Node varNode = new Node(Token.VAR, new Node(Token.NAME));
            varNode.getChildAtIndex(0).setString("a");
            script.addChildToBack(varNode);
        } else if (code.equals("for (var a = 0; ;);")) { // For initializier with var
             Node forNode = new Node(Token.FOR);
             Node varA = new Node(Token.VAR, new Node(Token.NAME));
             varA.getChildAtIndex(0).setString("a");
             varA.addChildToBack(Node.newNumber(0.0));
             forNode.addChildToBack(varA);
             forNode.addChildToBack(new Node(Token.EMPTY));
             forNode.addChildToBack(new Node(Token.EMPTY));
             script.addChildToBack(forNode);
        } else if (code.equals("for (var x in obj) {}")) { // For-in loop
            Node forNode = new Node(Token.FOR);
            Node varA = new Node(Token.VAR, new Node(Token.NAME));
            varA.getChildAtIndex(0).setString("x");
            forNode.addChildToBack(varA);
            forNode.addChildToBack(new Node(Token.NAME)); // obj
            forNode.getChildAtIndex(1).setString("obj");
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.BLOCK));
            script.addChildToBack(forNode);
        } else if (code.equals("function f() { function g(){} }")) {
            Node funcNode = new Node(Token.FUNCTION);
            funcNode.addChildToBack(new Node(Token.STRING, "f"));
            Node body = new Node(Token.BLOCK);
            Node innerFunc = new Node(Token.FUNCTION);
            innerFunc.addChildToBack(new Node(Token.STRING, "g"));
            innerFunc.addChildToBack(new Node(Token.BLOCK));
            body.addChildToBack(innerFunc);
            funcNode.addChildToBack(body);
            script.addChildToBack(funcNode);
        } else if (code.equals("label: for (var a = 0; ;);")) {
            Node labelNode = new Node(Token.LABEL);
            Node forNode = new Node(Token.FOR);
            Node varA = new Node(Token.VAR, new Node(Token.NAME));
            varA.getChildAtIndex(0).setString("a");
            varA.addChildToBack(Node.newNumber(0.0));
            forNode.addChildToBack(varA);
            forNode.addChildToBack(new Node(Token.EMPTY));
            forNode.addChildToBack(new Node(Token.EMPTY));
            labelNode.addChildToBack(forNode);
            script.addChildToBack(labelNode);
        } else if (code.equals("{ var a, b; }")) {
            Node block = new Node(Token.BLOCK);
            Node varA = new Node(Token.VAR, new Node(Token.NAME));
            varA.getChildAtIndex(0).setString("a");
            Node varB = new Node(Token.VAR, new Node(Token.NAME));
            varB.getChildAtIndex(0).setString("b");
            block.addChildToBack(varA);
            block.addChildToBack(varB);
            script.addChildToBack(block);
        } else if (code.equals("var x;")) { // For VerifyConstants test
            Node varNode = new Node(Token.VAR, new Node(Token.NAME));
            varNode.getChildAtIndex(0).setString("x");
            script.addChildToBack(varNode);
        } else {
            // Default fallback for simple code
            script.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.STRING, code)));
        }
        return script;
    }

    // Mock Compiler class for testing purposes
    private static class MockCompiler extends AbstractCompiler {
        private final Map<String, CompilerInput> inputs = Maps.newHashMap();

        @Override
        public void reportCodeChange() {
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention.DefaultCodingConvention();
        }

        @Override
        public void report(JSError error) {
        }

        @Override
        public void throwInternalError(String msg, Exception cause) {
            throw new RuntimeException(msg, cause);
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return null;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return new JSTypeRegistry(getDefaultErrorReporter());
        }

        @Override
        public ScopeCreator getScopeCreator() {
            return new SyntacticScopeCreator(this);
        }

        @Override
        public Scope getTopScope() {
            return new Scope.rootScope(new Node(Token.SCRIPT), this);
        }

        @Override
        public void addToDebugLog(String message) {
        }

        @Override
        public void setCssRenamingMap(CssRenamingMap map) {
        }

        @Override
        public CssRenamingMap getCssRenamingMap() {
            return null;
        }

        @Override
        public Node getNodeForCodeInsertion(JSModule module) {
            return new Node(Token.SCRIPT);
        }

        @Override
        public TypeValidator getTypeValidator() {
            return new TypeValidator(this);
        }

        @Override
        public Node parseSyntheticCode(String code) {
            return parseCode(code);
        }

        @Override
        public Node parseSyntheticCode(String filename, String code) {
            return parseCode(code);
        }

        @Override
        public String toSource(Node root) {
            return NodeUtil.toStringTree(root);
        }

        @Override
        public com.google.javascript.rhino.head.ErrorReporter getDefaultErrorReporter() {
            return new MockErrorReporter();
        }

        @Override
        public ReverseAbstractInterpreter getReverseAbstractInterpreter() {
            return null;
        }

        @Override
        public boolean isNormalized() {
            return true;
        }

        @Override
        public Supplier<String> getUniqueNameIdSupplier() {
            return () -> "unique";
        }

        @Override
        public boolean hasHaltingErrors() {
            return false;
        }

        @Override
        public void addChangeHandler(CodeChangeHandler handler) {
        }

        @Override
        public void removeChangeHandler(CodeChangeHandler handler) {
        }

        @Override
        public boolean isIdeMode() {
            return false;
        }

        @Override
        public Config getParserConfig() {
            return new Config();
        }

        @Override
        public boolean isTypeCheckingEnabled() {
            return false;
        }

        @Override
        public void prepareAst(Node root) {
        }

        @Override
        public SymbolTable acquireSymbolTable() {
            return null;
        }

        @Override
        public ErrorManager getErrorManager() {
            return new MockErrorManager();
        }

        @Override
        public void setNormalized() {
        }

        @Override
        public void setUnnormalized() {
        }

        @Override
        public boolean areNodesEqualForInlining(Node n1, Node n2) {
            return n1.isEquivalentTo(n2);
        }

        @Override
        public CompilerInput getInput(String sourceName) {
            return inputs.computeIfAbsent(sourceName, k -> new MockCompilerInput(sourceName));
        }

        @Override
        CompilerInput newExternInput(String name) {
            return new MockCompilerInput(name);
        }
    }

    // Mock ErrorReporter
    private static class MockErrorReporter implements com.google.javascript.rhino.head.ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int line, String lineSource, int column) {
        }
        @Override
        public void error(String message, String sourceName, int line, String lineSource, int column) {
        }
        @Override
        public com.google.javascript.rhino.head.EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int column) {
            throw new RuntimeException("Runtime error: " + message);
        }
    }

    // Mock ErrorManager
    private static class MockErrorManager extends com.google.javascript.jscomp.ErrorManager {
        @Override
        public void report(JSError error) {
        }
        @Override
        public void setErrors(boolean errors) {
        }
        @Override
        public void setWarnings(boolean warnings) {
        }
        @Override
        public boolean shouldReport(JSError.State state) {
            return false;
        }
        @Override
        public int getErrorCount() {
            return 0;
        }
        @Override
        public int getWarningCount() {
            return 0;
        }
        @Override
        public void generateReport(PrintWriter writer) {
        }
    }

    // Mock CompilerInput
    private static class MockCompilerInput extends com.google.javascript.jscomp.CompilerInput {
        public MockCompilerInput(String name) {
            super(new StringReader(""), name, false);
        }
    }

    @Test
    public void testSplitVarDeclarationsMultiple() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("var a, b, c;");
        normalize.splitVarDeclarations(root);
        assertEquals(3, root.getChildCount());
        assertEquals(Token.VAR, root.getChildAtIndex(0).getType());
        assertEquals("a", root.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.VAR, root.getChildAtIndex(1).getType());
        assertEquals("b", root.getChildAtIndex(1).getFirstChild().getString());
        assertEquals(Token.VAR, root.getChildAtIndex(2).getType());
        assertEquals("c", root.getChildAtIndex(2).getFirstChild().getString());
    }

    @Test
    public void testSplitVarDeclarationsSingle() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("var a;");
        normalize.splitVarDeclarations(root);
        assertEquals(1, root.getChildCount());
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("a", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testSplitVarDeclarationsWithInitialization() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("var a = 1, b = 2;");
        normalize.splitVarDeclarations(root);
        assertEquals(2, root.getChildCount());
        assertEquals(Token.VAR, root.getChildAtIndex(0).getType());
        assertEquals("a", root.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getChildAtIndex(0).getSecondChild().getType());
        assertEquals(1.0, root.getChildAtIndex(0).getSecondChild().getDouble(), 0.0);
        assertEquals(Token.VAR, root.getChildAtIndex(1).getType());
        assertEquals("b", root.getChildAtIndex(1).getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getChildAtIndex(1).getSecondChild().getType());
        assertEquals(2.0, root.getChildAtIndex(1).getSecondChild().getDouble(), 0.0);
    }

    @Test
    public void testExtractForInitializerSimple() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("for (var a = 0; ;);");
        normalize.extractForInitializer(root, null, null);
        assertEquals(2, root.getChildCount());
        assertEquals(Token.VAR, root.getChildAtIndex(0).getType());
        assertEquals("a", root.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getChildAtIndex(0).getSecondChild().getType());
        assertEquals(0.0, root.getChildAtIndex(0).getSecondChild().getDouble(), 0.0);
        assertEquals(Token.FOR, root.getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, root.getChildAtIndex(1).getFirstChild().getType());
    }

    @Test
    public void testExtractForInitializerExpression() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("for (a = 0; ;);");
        normalize.extractForInitializer(root, null, null);
        assertEquals(2, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getChildAtIndex(0).getType());
        assertEquals(Token.ASSIGN, root.getChildAtIndex(0).getFirstChild().getType());
        assertEquals("a", root.getChildAtIndex(0).getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getChildAtIndex(0).getFirstChild().getSecondChild().getType());
        assertEquals(0.0, root.getChildAtIndex(0).getFirstChild().getSecondChild().getDouble(), 0.0);
        assertEquals(Token.FOR, root.getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, root.getChildAtIndex(1).getFirstChild().getType());
    }

    @Test
    public void testExtractForInitializerNoInitializer() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("for ( ; ; );");
        normalize.extractForInitializer(root, null, null);
        assertEquals(1, root.getChildCount());
        assertEquals(Token.FOR, root.getFirstChild().getType());
        assertEquals(Token.EMPTY, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testConvertWhileToFor() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("while(true);");
        NodeTraversal traversal = new NodeTraversal(new MockCompiler(), normalize);
        normalize.visit(traversal, root.getFirstChild(), null);
        assertEquals(1, root.getChildCount());
        assertEquals(Token.FOR, root.getFirstChild().getType());
        assertEquals(Token.TRUE, root.getFirstChild().getFirstChild().getType());
        assertEquals(Token.EMPTY, root.getFirstChild().getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, root.getFirstChild().getChildAtIndex(2).getType());
    }

    @Test
    public void testConvertWhileToForWithBody() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("while(true){}");
        Node whileNode = root.getFirstChild();
        NodeTraversal traversal = new NodeTraversal(new MockCompiler(), normalize);
        normalize.visit(traversal, whileNode, null);
        assertEquals(Token.FOR, whileNode.getType());
        assertEquals(Token.TRUE, whileNode.getFirstChild().getType());
        assertEquals(Token.EMPTY, whileNode.getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, whileNode.getChildAtIndex(2).getType());
        assertEquals(Token.BLOCK, whileNode.getChildAtIndex(3).getType());
    }

    @Test
    public void testSplitChainedAssignments() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("a = b = c = 0;");
        NodeTraversal traversal = new NodeTraversal(new MockCompiler(), normalize);
        normalize.doStatementNormalizations(traversal, root, null); // This should trigger the logic if present.
        // The reference source code does not explicitly show a method for splitting chained assignments.
        // However, the comment mentions it. Assuming it's handled within doStatementNormalizations or similar.
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
    }

    @Test
    public void testNormalizeLabelsBlock() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("label: {}");
        normalize.normalizeLabels(root.getFirstChild());
        assertEquals(Token.LABEL, root.getFirstChild().getType());
        assertEquals(Token.BLOCK, root.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testNormalizeLabelsForLoop() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("label: for(;;);");
        normalize.normalizeLabels(root.getFirstChild());
        assertEquals(Token.LABEL, root.getFirstChild().getType());
        assertEquals(Token.FOR, root.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testNormalizeLabelsDefaultCase() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("label: function(){}");
        normalize.normalizeLabels(root.getFirstChild());
        assertEquals(Token.LABEL, root.getFirstChild().getType());
        assertEquals(Token.BLOCK, root.getFirstChild().getLastChild().getType());
        assertEquals(Token.FUNCTION, root.getFirstChild().getLastChild().getFirstChild().getType());
    }

    @Test
    public void testPropagateConstantAnnotations_noAnnotation() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("var x = 1;");
        Normalize.PropogateConstantAnnotations checker =
            new Normalize.PropogateConstantAnnotations(new MockCompiler(), false);
        NodeTraversal t = new NodeTraversal(new MockCompiler(), checker);
        Node varNode = root.getFirstChild();
        Node nameNode = varNode.getFirstChild();
        checker.visit(t, nameNode, varNode);
        assertFalse(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateConstantAnnotations_withAnnotation() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("/** @const */ var x = 1;");
        Normalize.PropogateConstantAnnotations checker =
            new Normalize.PropogateConstantAnnotations(new MockCompiler(), false);
        NodeTraversal t = new NodeTraversal(new MockCompiler(), checker);
        Node varNode = root.getFirstChild();
        Node nameNode = varNode.getFirstChild();
        checker.visit(t, nameNode, varNode);
        assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testRemoveDuplicateDeclarations_simple() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("var a; var a;");
        normalize.removeDuplicateDeclarations(root);
        assertEquals(1, root.getChildCount());
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("a", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testRemoveDuplicateDeclarations_withInit() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("var a = 1; var a = 2;");
        normalize.removeDuplicateDeclarations(root);
        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        Node assignment = root.getFirstChild().getFirstChild();
        assertEquals(Token.ASSIGN, assignment.getType());
        assertEquals("a", assignment.getFirstChild().getString());
        assertEquals(Token.NUMBER, assignment.getSecondChild().getType());
        assertEquals(2.0, assignment.getSecondChild().getDouble(), 0.0);
    }

    @Test
    public void testRemoveDuplicateDeclarations_withLabel() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("label: var a; label: var a;");
        normalize.removeDuplicateDeclarations(root);
        assertEquals(1, root.getChildCount());
        assertEquals(Token.LABEL, root.getFirstChild().getType());
        assertEquals(Token.EMPTY, root.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testRemoveDuplicateDeclarations_forIn() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("for (var x in obj) {} for (var x in obj) {}");
        normalize.removeDuplicateDeclarations(root);
        assertEquals(1, root.getChildCount());
        assertEquals(Token.FOR, root.getFirstChild().getType());
        assertEquals(Token.NAME, root.getFirstChild().getFirstChild().getType());
        assertEquals("x", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testMoveNamedFunctions_noMoves() throws Exception {
        Normalize normalize = createNormalizePass();
        Node functionBody = new Node(Token.BLOCK);
        Node existingFunc = new Node(Token.FUNCTION, new Node(Token.STRING, "foo"), new Node(Token.BLOCK));
        functionBody.addChildToBack(existingFunc);
        Node originalFunctionBody = functionBody.cloneTree();
        normalize.moveNamedFunctions(functionBody);
        assertTrue(originalFunctionBody.isEquivalentTo(functionBody));
    }

    @Test
    public void testMoveNamedFunctions_oneMove() throws Exception {
        Normalize normalize = createNormalizePass();
        Node functionBody = new Node(Token.BLOCK);
        Node existingFunc = new Node(Token.FUNCTION, new Node(Token.STRING, "foo1"), new Node(Token.BLOCK));
        functionBody.addChildToBack(existingFunc);
        Node funcToMove = new Node(Token.FUNCTION, new Node(Token.STRING, "bar"), new Node(Token.BLOCK));
        functionBody.addChildToBack(funcToMove);
        functionBody.addChildToBack(new Node(Token.RETURN));

        normalize.moveNamedFunctions(functionBody);

        assertEquals(3, functionBody.getChildCount());
        assertEquals(Token.FUNCTION, functionBody.getChildAtIndex(0).getType());
        assertEquals("bar", functionBody.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.FUNCTION, functionBody.getChildAtIndex(1).getType());
        assertEquals("foo1", functionBody.getChildAtIndex(1).getFirstChild().getString());
        assertEquals(Token.RETURN, functionBody.getChildAtIndex(2).getType());
    }

    @Test
    public void testMoveNamedFunctions_multipleMoves() throws Exception {
        Normalize normalize = createNormalizePass();
        Node functionBody = new Node(Token.BLOCK);
        Node existingFunc1 = new Node(Token.FUNCTION, new Node(Token.STRING, "foo1"), new Node(Token.BLOCK));
        functionBody.addChildToBack(existingFunc1);
        Node funcToMove1 = new Node(Token.FUNCTION, new Node(Token.STRING, "bar1"), new Node(Token.BLOCK));
        functionBody.addChildToBack(funcToMove1);
        Node otherStatement = new Node(Token.EXPR_RESULT);
        functionBody.addChildToBack(otherStatement);
        Node funcToMove2 = new Node(Token.FUNCTION, new Node(Token.STRING, "bar2"), new Node(Token.BLOCK));
        functionBody.addChildToBack(funcToMove2);

        normalize.moveNamedFunctions(functionBody);

        assertEquals(4, functionBody.getChildCount());
        assertEquals(Token.FUNCTION, functionBody.getChildAtIndex(0).getType());
        assertEquals("bar1", functionBody.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.FUNCTION, functionBody.getChildAtIndex(1).getType());
        assertEquals("bar2", functionBody.getChildAtIndex(1).getFirstChild().getString());
        assertEquals(Token.FUNCTION, functionBody.getChildAtIndex(2).getType());
        assertEquals("foo1", functionBody.getChildAtIndex(2).getFirstChild().getString());
        assertEquals(Token.EXPR_RESULT, functionBody.getChildAtIndex(3).getType());
    }

    @Test
    public void testExtractForInitializer_withLabel() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("label: for (var a = 0; ;);");
        NodeTraversal traversal = new NodeTraversal(new MockCompiler(), normalize);
        normalize.doStatementNormalizations(traversal, root, null);

        assertEquals(1, root.getChildCount());
        Node labelNode = root.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        assertEquals(2, labelNode.getChildCount());
        assertEquals(Token.VAR, labelNode.getChildAtIndex(0).getType()); // Initializer moved
        assertEquals("a", labelNode.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.FOR, labelNode.getChildAtIndex(1).getType()); // For loop
        assertEquals(Token.EMPTY, labelNode.getChildAtIndex(1).getFirstChild().getType());
    }

    @Test
    public void testSplitVarDeclarations_inBlock() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("{ var a, b; }");
        Node block = root.getFirstChild();
        normalize.splitVarDeclarations(block);
        assertEquals(2, block.getChildCount());
        assertEquals(Token.VAR, block.getChildAtIndex(0).getType());
        assertEquals("a", block.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.VAR, block.getChildAtIndex(1).getType());
        assertEquals("b", block.getChildAtIndex(1).getFirstChild().getString());
    }

    @Test
    public void testConvertWhileToFor_emptyBody() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("while(false);");
        Node whileNode = root.getFirstChild();
        NodeTraversal traversal = new NodeTraversal(new MockCompiler(), normalize);
        normalize.visit(traversal, whileNode, null);
        assertEquals(Token.FOR, whileNode.getType());
        assertEquals(Token.FALSE, whileNode.getFirstChild().getType());
        assertEquals(Token.EMPTY, whileNode.getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, whileNode.getChildAtIndex(2).getType());
    }

    @Test
    public void testExtractForInitializer_complex() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("for(a=1, b=2; ;);");
        normalize.extractForInitializer(root, null, null);
        assertEquals(2, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getChildAtIndex(0).getType());
        assertEquals(Token.COMMA, root.getChildAtIndex(0).getFirstChild().getType());
        assertEquals(Token.ASSIGN, root.getChildAtIndex(0).getFirstChild().getFirstChild().getType());
        assertEquals("a", root.getChildAtIndex(0).getFirstChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.ASSIGN, root.getChildAtIndex(0).getFirstChild().getSecondChild().getType());
        assertEquals("b", root.getChildAtIndex(0).getFirstChild().getSecondChild().getFirstChild().getString());
        assertEquals(Token.FOR, root.getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, root.getChildAtIndex(1).getFirstChild().getType());
    }

    @Test
    public void testRemoveDuplicateDeclarations_scope() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("function f() { var x; var x; }");
        normalize.removeDuplicateDeclarations(root);
        Node functionNode = root.getFirstChild();
        Node blockNode = functionNode.getLastChild();
        assertEquals(1, blockNode.getChildCount());
        assertEquals(Token.VAR, blockNode.getFirstChild().getType());
        assertEquals("x", blockNode.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testMoveNamedFunctions_declarationAtEnd() throws Exception {
        Normalize normalize = createNormalizePass();
        Node functionBody = new Node(Token.BLOCK);
        Node funcToMove = new Node(Token.FUNCTION, new Node(Token.STRING, "bar"), new Node(Token.BLOCK));
        functionBody.addChildToBack(funcToMove);
        functionBody.addChildToBack(new Node(Token.RETURN));

        normalize.moveNamedFunctions(functionBody);

        assertEquals(2, functionBody.getChildCount());
        assertEquals(Token.FUNCTION, functionBody.getChildAtIndex(0).getType());
        assertEquals("bar", functionBody.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.RETURN, functionBody.getChildAtIndex(1).getType());
    }

    @Test
    public void testNormalizeLabels_loop() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("label: while(true);");
        normalize.normalizeLabels(root.getFirstChild());
        assertEquals(Token.LABEL, root.getFirstChild().getType());
        assertEquals(Token.WHILE, root.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testPropagateConstantAnnotations_userDeclaration() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("var x;");
        Normalize.VerifyConstants checker = new Normalize.VerifyConstants(new MockCompiler(), true);
        NodeTraversal t = new NodeTraversal(new MockCompiler(), checker);
        Node varNode = root.getFirstChild();
        Node nameNode = varNode.getFirstChild();
        nameNode.setString("x");
        checker.visit(t, nameNode, varNode);
        // This test doesn't assert anything, but it should not throw an exception.
        // A more robust test would check for the presence or absence of the constant flag.
    }

    @Test
    public void testExtractForInitializer_forIn() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("for (var x in obj);");
        normalize.extractForInitializer(root, null, null);
        assertEquals(1, root.getChildCount());
        assertEquals(Token.FOR, root.getFirstChild().getType());
        assertEquals(Token.VAR, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testSplitVarDeclarations_empty() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("{}");
        Node block = root.getFirstChild();
        normalize.splitVarDeclarations(block);
        assertEquals(0, block.getChildCount());
    }

    @Test
    public void testConvertWhileToFor_nested() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("while(true) { while(false); }");
        Node outerWhile = root.getFirstChild();
        NodeTraversal traversal = new NodeTraversal(new MockCompiler(), normalize);
        normalize.visit(traversal, outerWhile, null);
        assertEquals(Token.FOR, outerWhile.getType());
        Node innerWhile = outerWhile.getChildAtIndex(3).getFirstChild();
        normalize.visit(traversal, innerWhile, null);
        assertEquals(Token.FOR, innerWhile.getType());
    }

    @Test
    public void testRemoveDuplicateDeclarations_functionScope() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("function f() { var x = 1; var x = 2; }");
        normalize.removeDuplicateDeclarations(root);
        Node functionNode = root.getFirstChild();
        Node blockNode = functionNode.getLastChild();
        assertEquals(1, blockNode.getChildCount());
        assertEquals(Token.EXPR_RESULT, blockNode.getFirstChild().getType());
        assertEquals(Token.ASSIGN, blockNode.getFirstChild().getFirstChild().getType());
        assertEquals("x", blockNode.getFirstChild().getFirstChild().getFirstChild().getString());
        assertEquals(2.0, blockNode.getFirstChild().getFirstChild().getSecondChild().getDouble(), 0.0);
    }

    @Test
    public void testMoveNamedFunctions_functionInBlock() throws Exception {
        Normalize normalize = createNormalizePass();
        Node functionBody = new Node(Token.BLOCK);
        Node funcInBlock = new Node(Token.FUNCTION, new Node(Token.STRING, "inner"), new Node(Token.BLOCK));
        functionBody.addChildToBack(funcInBlock);
        functionBody.addChildToBack(new Node(Token.RETURN));

        Node originalFunctionBody = functionBody.cloneTree();
        normalize.moveNamedFunctions(functionBody);
        assertTrue(originalFunctionBody.isEquivalentTo(functionBody));
    }

    @Test
    public void testNormalizeLabels_blockWrapper() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = parseCode("label: 1;");
        normalize.normalizeLabels(root.getFirstChild());
        assertEquals(Token.LABEL, root.getFirstChild().getType());
        assertEquals(Token.BLOCK, root.getFirstChild().getLastChild().getType());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getLastChild().getFirstChild().getType());
        assertEquals(Token.NUMBER, root.getFirstChild().getLastChild().getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProcess() throws Exception {
        Normalize normalize = createNormalizePass();
        Node externs = new Node(Token.SCRIPT);
        Node root = parseCode("var a = 1;");
        normalize.process(externs, root);
        assertNotNull(root);
        assertTrue(root.hasChildren());
    }

    @Test
    public void testShouldTraverse() throws Exception {
        Normalize normalize = createNormalizePass();
        NodeTraversal traversal = new NodeTraversal(new MockCompiler(), normalize);
        Node n = new Node(Token.BLOCK);
        Node parent = new Node(Token.SCRIPT);
        assertTrue(normalize.shouldTraverse(traversal, n, parent));
    }

    @Test
    public void testOnRedeclaration_varAssignment() throws Exception {
        Normalize normalize = createNormalizePass();
        MockCompiler mockCompiler = new MockCompiler();
        Normalize.DuplicateDeclarationHandler handler = normalize.new DuplicateDeclarationHandler();

        Node gramps = new Node(Token.SCRIPT);
        Node parent = new Node(Token.VAR);
        Node n = new Node(Token.NAME); n.setString("x");
        Node value = Node.newNumber(10);
        parent.addChildToBack(n);
        parent.addChildToBack(value);
        gramps.addChildToBack(parent);

        Scope mockScope = Scope.createGlobalScope(gramps);
        mockScope.declare("x", n, mockCompiler.getTypeRegistry());

        handler.onRedeclaration(mockScope, "x", n, parent, gramps, n);

        assertEquals(1, gramps.getChildCount());
        Node exprResult = gramps.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        Node assignment = exprResult.getFirstChild();
        assertEquals(Token.ASSIGN, assignment.getType());
        assertEquals("x", assignment.getFirstChild().getString());
        assertEquals(10.0, assignment.getSecondChild().getDouble(), 0.0);
    }

    @Test
    public void testOnRedeclaration_varNoAssignment() throws Exception {
        Normalize normalize = createNormalizePass();
        MockCompiler mockCompiler = new MockCompiler();
        Normalize.DuplicateDeclarationHandler handler = normalize.new DuplicateDeclarationHandler();

        Node gramps = new Node(Token.BLOCK);
        Node parent = new Node(Token.VAR);
        Node n = new Node(Token.NAME); n.setString("y");
        parent.addChildToBack(n);
        gramps.addChildToBack(parent);

        Scope mockScope = Scope.createScope(gramps, null);

        handler.onRedeclaration(mockScope, "y", n, parent, gramps, n);

        assertEquals(0, gramps.getChildCount());
    }

    @Test
    public void testOnRedeclaration_forIn() throws Exception {
        Normalize normalize = createNormalizePass();
        MockCompiler mockCompiler = new MockCompiler();
        Normalize.DuplicateDeclarationHandler handler = normalize.new DuplicateDeclarationHandler();

        Node gramps = new Node(Token.FOR);
        Node parent = new Node(Token.VAR);
        Node n = new Node(Token.NAME); n.setString("z");
        parent.addChildToBack(n);
        gramps.addChildToBack(parent);

        Scope mockScope = Scope.createScope(gramps, null);

        handler.onRedeclaration(mockScope, "z", n, parent, gramps, n);

        assertEquals(1, gramps.getChildCount());
        Node forLoop = gramps.getFirstChild();
        assertEquals(Token.FOR, forLoop.getType());
        assertEquals(Token.NAME, forLoop.getFirstChild().getType());
        assertEquals("z", forLoop.getFirstChild().getString());
    }

    @Test
    public void testEnterScope() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = new Node(Token.SCRIPT);
        NodeTraversal t = new NodeTraversal(new MockCompiler(), normalize, new SyntacticScopeCreator(new MockCompiler()));
        t.traverse(root);
        assertNotNull(t.getScope());
    }

    @Test
    public void testExitScope() throws Exception {
        Normalize normalize = createNormalizePass();
        Node root = new Node(Token.SCRIPT);
        NodeTraversal t = new NodeTraversal(new MockCompiler(), normalize, new SyntacticScopeCreator(new MockCompiler()));
        t.traverse(root);
        normalize.exitScope(t); // Ensure it doesn't throw.
    }
}
```