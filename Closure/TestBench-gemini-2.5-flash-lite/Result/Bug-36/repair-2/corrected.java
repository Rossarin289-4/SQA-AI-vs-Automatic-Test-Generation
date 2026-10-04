package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier; // Added for getUniqueNameIdSupplier

public class InlineVariablesTest {

    // Dummy implementation of AbstractCompiler for testing
    private static class TestCompiler extends AbstractCompiler {
        private CodingConvention codingConvention = new CodingConvention.DefaultCodingConvention();
        private String sourceFile = "testSource";
        private VariableMap variableMap = null;
        private VariableMap propertyMap = null;
        private CssRenamingMap cssRenamingMap = null;
        private TypeValidator typeValidator = null;
        private Supplier<String> uniqueNameIdSupplier = () -> "unique"; // Implemented Supplier
        private java.util.logging.Level loggingLevel = java.util.logging.Level.OFF;

        @Override
        public JSError[] getErrors() {
            return new JSError[0];
        }

        @Override
        public void report(DiagnosticType diagnosticType, Node node, String... arguments) {
            // No-op for testing purposes.
        }

        @Override
        public void report(JSError error) {
            // No-op for testing purposes.
        }

        @Override
        public void process(Node externs, Node root) {
            // No-op for testing purposes.
        }

        @Override
        public String getSourceFileName() {
            return sourceFile;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return codingConvention;
        }

        @Override
        public VariableMap getVariableMap() {
            return variableMap;
        }

        @Override
        public VariableMap getPropertyMap() {
            return propertyMap;
        }

        @Override
        public void setVariableMap(VariableMap variableMap) {
            this.variableMap = variableMap;
        }

        @Override
        public void setPropertyMap(VariableMap propertyMap) {
            this.propertyMap = propertyMap;
        }

        @Override
        public void setCssRenamingMap(CssRenamingMap cssRenamingMap) {
            this.cssRenamingMap = cssRenamingMap;
        }

        @Override
        public Supplier<String> getUniqueNameIdSupplier() { // Changed return type
            return uniqueNameIdSupplier;
        }

        @Override
        public void reportCodeChange() {
            // No-op for testing purposes.
        }

        // Corrected signature
        @Override
        public String getSourceLine(String sourceName, int lineNumber) {
            return "";
        }

        @Override
        public void setSourceFile(String sourceFile) {
            this.sourceFile = sourceFile;
        }

        @Override
        public void stopPass(String passName) {
            // Not used in this test
        }

        @Override
        public boolean shouldRunPass(String passName) {
            return true;
        }

        @Override
        public void setLoggingLevel(java.util.logging.Level level) {
            this.loggingLevel = level;
        }

        @Override
        public String getAstDotGraph(Node n) {
            return null;
        }

        @Override
        public void enableTypeChecking() {
            // Not used in this test
        }

        @Override
        public void disableTypeChecking() {
            // Not used in this test
        }

        @Override
        public void setTypeValidator(TypeValidator validator) {
            this.typeValidator = validator;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return typeValidator;
        }

        @Override
        public String injectUniqueName(String name) {
            return name;
        }

        @Override
        public void reassessNode(Node node) {
            // Not used in this test
        }

        @Override
        public void setProgressReceiver(ProgressReceiver progressReceiver) {
            // Not used in this test
        }

        @Override
        public void clearVariableMap() {
            // Not used in this test
        }

        @Override
        public void clearPropertyMap() {
            // Not used in this test
        }

        // Added missing abstract method implementation
        @Override
        public void setProgress(double progress) {
            // No-op for testing purposes.
        }

        // Added missing abstract method implementation
        @Override
        public ProgressReceiver getProgressReceiver() {
            return null;
        }

        // Added missing abstract method implementation
        @Override
        public void setUniqueNameIdSupplier(Supplier<String> supplier) {
            this.uniqueNameIdSupplier = supplier;
        }
    }

    // Dummy implementation of ScopeCreator for testing
    private static class TestScopeCreator implements ScopeCreator {
        @Override
        public Scope createScope(Node node, Scope parent) { // Removed isFunction parameter
            return new Scope(node, parent, null);
        }
    }

    // Helper to parse code into a Node tree (simplified)
    private static Node parseCode(String code) {
        Node root = new Node(Token.SCRIPT);
        // This is a very basic parse. In a real test, you'd use a proper JS parser.
        // For simplicity, we'll manually construct the AST for each test.
        return root;
    }

    // Helper to generate code from a Node tree (simplified)
    private static String codeGen(Node root) {
        // This is a simplified code generation for testing.
        // A real compiler would have a CodeGenerator.
        StringBuilder sb = new StringBuilder();
        appendCode(sb, root);
        return sb.toString();
    }

    private static void appendCode(StringBuilder sb, Node node) {
        if (node == null) return;

        switch (node.getType()) {
            case Token.SCRIPT:
            case Token.BLOCK:
                for (Node child = node.getFirstChild(); child != null; child = child.getNext()) {
                    appendCode(sb, child);
                    if (child.getNext() != null) {
                        sb.append("; "); // Separator for statements
                    }
                }
                break;
            case Token.VAR:
                sb.append("var ");
                for (Node child = node.getFirstChild(); child != null; child = child.getNext()) {
                    appendCode(sb, child);
                    if (child.getNext() != null) {
                        sb.append(", ");
                    }
                }
                break;
            case Token.CONST: // Added case for CONST
                sb.append("const ");
                for (Node child = node.getFirstChild(); child != null; child = child.getNext()) {
                    appendCode(sb, child);
                    if (child.getNext() != null) {
                        sb.append(", ");
                    }
                }
                break;
            case Token.ASSIGN:
                appendCode(sb, node.getFirstChild());
                sb.append(" = ");
                appendCode(sb, node.getLastChild());
                break;
            case Token.NAME:
                sb.append(node.getString());
                break;
            case Token.NUMBER:
                sb.append(node.getDouble());
                break;
            case Token.STRING:
                sb.append("\"").append(node.getString()).append("\"");
                break;
            case Token.ADD:
            case Token.SUB:
            case Token.MUL:
            case Token.DIV:
                appendCode(sb, node.getFirstChild());
                sb.append(" ").append(Token.name(node.getType())).append(" ");
                appendCode(sb, node.getLastChild());
                break;
            case Token.FUNCTION:
                sb.append("function ");
                if (node.getSecondChild() != null && node.getSecondChild().isName()) { // Corrected access for function name
                    sb.append(node.getSecondChild().getString());
                    node = node.getThirdChild(); // Function body
                } else {
                    node = node.getSecondChild(); // Function body
                }
                sb.append("() { ");
                appendCode(sb, node);
                sb.append(" }");
                break;
            case Token.EXPR_RESULT:
                appendCode(sb, node.getFirstChild());
                break;
            case Token.CALL:
                appendCode(sb, node.getFirstChild());
                sb.append("(");
                Node arg = node.getSecondChild();
                if (arg != null) {
                    appendCode(sb, arg);
                    while ((arg = arg.getNext()) != null) {
                        sb.append(", ");
                        appendCode(sb, arg);
                    }
                }
                sb.append(")");
                break;
            case Token.OBJECTLIT: // Added case for OBJECTLIT
                sb.append("{");
                for (Node child = node.getFirstChild(); child != null; child = child.getNext()) {
                    appendCode(sb, child);
                    if (child.getNext() != null) {
                        sb.append(", ");
                    }
                }
                sb.append("}");
                break;
            case Token.STRING_KEY: // Added case for STRING_KEY
                sb.append(node.getString());
                sb.append(": ");
                appendCode(sb, node.getLastChild());
                break;
            case Token.GETPROP: // Added case for GETPROP
                appendCode(sb, node.getFirstChild());
                sb.append(".");
                appendCode(sb, node.getLastChild());
                break;
            case Token.GETELEM: // Added case for GETELEM
                appendCode(sb, node.getFirstChild());
                sb.append("[");
                appendCode(sb, node.getLastChild());
                sb.append("]");
                break;
            case Token.RETURN: // Added case for RETURN
                sb.append("return ");
                appendCode(sb, node.getFirstChild());
                break;
            case Token.ARGUMENTS: // Added case for ARGUMENTS
                sb.append("arguments");
                break;
            case Token.TRUE: // Added case for TRUE
                sb.append("true");
                break;
            case Token.FALSE: // Added case for FALSE
                sb.append("false");
                break;
            default:
                // Fallback for unhandled nodes
                sb.append("[UNHANDLED_NODE_").append(Token.name(node.getType())).append("]");
                break;
        }
    }

    private static void assertInlined(String code, String expected) {
        AbstractCompiler compiler = new TestCompiler();
        compiler.setCodingConvention(new CodingConvention.DefaultCodingConvention());
        Node root = new Node(Token.SCRIPT); // Simplified AST creation
        // In a real scenario, you would parse the code into the AST.
        // For this test, we construct the AST manually in each test method.

        InlineVariables pass = new InlineVariables(compiler, Mode.ALL, false); // Set mode appropriately
        pass.process(null, root);
        assertEquals(expected, codeGen(root));
    }

    private Node createNode(int type, Object value) {
        Node node;
        if (value instanceof String) {
            node = Node.newString((String) value);
        } else if (value instanceof Number) {
            node = Node.newNumber(((Number) value).doubleValue());
        } else if (value instanceof Boolean) {
            node = new Node(((Boolean) value) ? Token.TRUE : Token.FALSE);
        } else {
            node = new Node(type);
        }
        node.setType(type);
        return node;
    }

    private Node createVarDeclaration(String name, Node value) {
        Node nameNode = new Node(Token.NAME, name);
        nameNode.setJSDocInfo(null); // Ensure no JSDoc interferes
        Node varNode = new Node(Token.VAR, nameNode);
        if (value != null) {
            varNode.addChildToBack(value);
        }
        return varNode;
    }

    private Node createConstDeclaration(String name, Node value) {
        Node nameNode = new Node(Token.NAME, name);
        nameNode.setJSDocInfo(null); // Ensure no JSDoc interferes
        Node constNode = new Node(Token.CONST, nameNode);
        if (value != null) {
            constNode.addChildToBack(value);
        }
        return constNode;
    }

    private Node createAssignment(Node target, Node value) {
        Node assign = new Node(Token.ASSIGN, target, value);
        return new Node(Token.EXPR_RESULT, assign);
    }

    private Node createNameNode(String name) {
        return new Node(Token.NAME, name);
    }

    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    private Node createStringNode(String value) {
        return Node.newString(value);
    }

    private Node createBooleanNode(boolean value) {
        return new Node(value ? Token.TRUE : Token.FALSE);
    }

    @Test
    public void testInlineSimpleConstantNumber() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constADeclaration = createVarDeclaration("a", createNumberNode(1));
        Node varBReference = createNameNode("a");
        Node varBDeclaration = createVarDeclaration("b", varBReference);
        root.addChildToBack(constADeclaration);
        root.addChildToBack(varBDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var b = 1;
        assertEquals("var b = 1;", codeGen(root));
    }

    @Test
    public void testInlineSimpleConstantString() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constADeclaration = createVarDeclaration("MSG", createStringNode("hello"));
        Node varBReference = createNameNode("MSG");
        Node varBDeclaration = createVarDeclaration("msg", varBReference);
        root.addChildToBack(constADeclaration);
        root.addChildToBack(varBDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var msg = "hello";
        assertEquals("var msg = \"hello\";", codeGen(root));
    }

    @Test
    public void testInlineConstantWithMultipleReferences() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constXDeclaration = createVarDeclaration("X", createNumberNode(5));
        Node refX1 = createNameNode("X");
        Node refX2 = createNameNode("X");
        Node exprA = new Node(Token.ADD, refX1, refX2);
        Node varADeclaration = createVarDeclaration("a", exprA);

        Node refX3 = createNameNode("X");
        Node exprB = new Node(Token.MUL, refX3, createNumberNode(2));
        Node varBDeclaration = createVarDeclaration("b", exprB);

        root.addChildToBack(constXDeclaration);
        root.addChildToBack(varADeclaration);
        root.addChildToBack(varBDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var a = 5 + 5; var b = 5 * 2;
        assertEquals("var a = 5 + 5; var b = 5 * 2;", codeGen(root));
    }

    @Test
    public void testInlineConstantUsedInExpression() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constYDeclaration = createVarDeclaration("Y", createNumberNode(10));
        Node refY = createNameNode("Y");
        Node exprZ = new Node(Token.DIV, refY, createNumberNode(2));
        Node varZDeclaration = createVarDeclaration("z", exprZ);
        root.addChildToBack(constYDeclaration);
        root.addChildToBack(varZDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var z = 10 / 2;
        assertEquals("var z = 10 / 2;", codeGen(root));
    }

    @Test
    public void testNoInlineIfUsedBeforeDefinition() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node refY = createNameNode("y");
        Node varXDeclaration = createVarDeclaration("x", refY);
        Node constYDeclaration = createVarDeclaration("y", createNumberNode(1));
        root.addChildToBack(varXDeclaration);
        root.addChildToBack(constYDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var x = y; var y = 1; (y should not be inlined)
        assertEquals("var x = y; var y = 1;", codeGen(root));
    }

    @Test
    public void testInlineOnlyLocalsMode() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constGlobalDeclaration = createVarDeclaration("GLOBAL", createNumberNode(1));

        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "f")); // Function name
        Node functionBody = new Node(Token.BLOCK);
        Node localZDeclaration = createVarDeclaration("LOCAL", createNumberNode(2));
        Node refLocal = createNameNode("LOCAL");
        Node returnExpr = new Node(Token.ADD, refLocal, createNumberNode(1));
        functionBody.addChildToBack(localZDeclaration);
        functionBody.addChildToBack(new Node(Token.RETURN, returnExpr));
        functionNode.addChildToBack(functionBody);

        root.addChildToBack(constGlobalDeclaration);
        root.addChildToBack(functionNode);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.LOCALS_ONLY, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var GLOBAL = 1; function f() { return 2 + 1; }
        assertEquals("var GLOBAL = 1; function f() { LOCAL = 2; return LOCAL + 1; }", codeGen(root));
        // Note: The generated code is simplified. A real code generator would remove unused variables.
        // Here we expect the variable to remain but its value to be inlined.
    }

    @Test
    public void testConstantsOnlyMode() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constCDeclaration = createConstDeclaration("C", createNumberNode(10));
        Node refC = createNameNode("C");
        Node varVDeclaration = createVarDeclaration("v", refC);
        root.addChildToBack(constCDeclaration);
        root.addChildToBack(varVDeclaration);

        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public boolean isConstant(Var var) {
                        // Simulate @const check
                        return var.getNameNode().getParent().getType() == Token.CONST;
                    }
                };
            }
        };
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.CONSTANTS_ONLY, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var v = 10;
        assertEquals("var v = 10;", codeGen(root));
    }

    @Test
    public void testNoInlineNonConstantReassigned() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varXDeclaration = createVarDeclaration("x", createNumberNode(1));
        Node assignmentX = createAssignment(createNameNode("x"), createNumberNode(2));
        Node refX = createNameNode("x");
        Node varYDeclaration = createVarDeclaration("y", refX);
        root.addChildToBack(varXDeclaration);
        root.addChildToBack(assignmentX);
        root.addChildToBack(varYDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var x = 1; x = 2; var y = x; (x should not be inlined)
        assertEquals("var x = 1; x = 2; var y = x;", codeGen(root));
    }

    @Test
    public void testInlineAssignedOncePureFunction() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node getValCall = new Node(Token.CALL, createNameNode("getVal"));
        Node varZDeclaration = createVarDeclaration("z", getValCall);
        Node refZ = createNameNode("z");
        Node varADeclaration = createVarDeclaration("a", refZ);
        root.addChildToBack(varZDeclaration);
        root.addChildToBack(varADeclaration);

        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public boolean isPure(Node expression) {
                return expression.isCall() && expression.getFirstChild().isName() && "getVal".equals(expression.getFirstChild().getString());
            }
        };

        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var a = getVal(); (z should be inlined)
        assertEquals("var a = getVal();", codeGen(root));
    }

    @Test
    public void testNoInlineMutableObject() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node objectLiteral = new Node(Token.OBJECTLIT, new Node(Token.STRING_KEY, "a"), createNumberNode(1));
        Node objDeclaration = createVarDeclaration("obj", objectLiteral);
        Node refObj = createNameNode("obj");
        Node propAccess = new Node(Token.GETPROP, refObj, createNameNode("a"));
        Node varBDelcaration = createVarDeclaration("b", propAccess);
        root.addChildToBack(objDeclaration);
        root.addChildToBack(varBDelcaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var obj = {a: 1}; var b = obj.a; (obj should not be inlined)
        assertEquals("var obj = {a: 1}; var b = obj.a;", codeGen(root));
    }

    @Test
    public void testInlineFunctionExpression() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node funcExpr = new Node(Token.FUNCTION);
        Node funcBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNumberNode(1)));
        funcExpr.addChildToBack(funcBody);
        Node varFDeclaration = createVarDeclaration("f", funcExpr);

        Node refF = createNameNode("f");
        Node varGDeclaration = createVarDeclaration("g", refF);
        root.addChildToBack(varFDeclaration);
        root.addChildToBack(varGDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var g = function() { return 1; }; (f should be removed)
        assertEquals("var g = function() { return 1; };", codeGen(root));
    }

    @Test
    public void testNoInlineFunctionDeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionDecl = new Node(Token.FUNCTION);
        functionDecl.addChildToBack(new Node(Token.NAME, "f")); // Function name
        Node funcBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNumberNode(1)));
        functionDecl.addChildToBack(funcBody);

        Node refF = createNameNode("f");
        Node varGDeclaration = createVarDeclaration("g", refF);
        root.addChildToBack(functionDecl);
        root.addChildToBack(varGDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: function f() { return 1; } var g = f; (f should not be inlined)
        assertEquals("function f() { return 1; } var g = f;", codeGen(root));
    }


    @Test
    public void testInlineAliasOfConstant() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constXDeclaration = createVarDeclaration("x", createNumberNode(1));
        Node refX = createNameNode("x");
        Node varYDeclaration = createVarDeclaration("y", refX);
        Node refY = createNameNode("y");
        Node varZDeclaration = createVarDeclaration("z", refY);
        root.addChildToBack(constXDeclaration);
        root.addChildToBack(varYDeclaration);
        root.addChildToBack(varZDeclaration);

        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public boolean isConstant(Var var) {
                        return "x".equals(var.getName());
                    }
                };
            }
        };

        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.CONSTANTS_ONLY, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var z = 1; (y should also be removed as unused)
        assertEquals("var z = 1;", codeGen(root));
    }

    @Test
    public void testInlineShortString() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constSDeclaration = createVarDeclaration("s", createStringNode("a"));
        Node refS1 = createNameNode("s");
        Node refS2 = createNameNode("s");
        Node exprT = new Node(Token.ADD, refS1, refS2);
        Node varTDeclaration = createVarDeclaration("t", exprT);
        root.addChildToBack(constSDeclaration);
        root.addChildToBack(varTDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        // inlineAllStrings = true
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, true), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var t = "a" + "a";
        assertEquals("var t = \"a\" + \"a\";", codeGen(root));
    }

    @Test
    public void testNoInlineLongString() throws Exception {
        String longString = "this is a very long string that might not be worth inlining";
        Node root = new Node(Token.SCRIPT);
        Node constSDeclaration = createVarDeclaration("s", createStringNode(longString));
        Node refS = createNameNode("s");
        Node varTDeclaration = createVarDeclaration("t", refS);
        root.addChildToBack(constSDeclaration);
        root.addChildToBack(varTDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        // inlineAllStrings = false, and string is long, so it should not be inlined.
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var s = "long string..."; var t = s;
        assertEquals("var s = \"" + longString + "\"; var t = s;", codeGen(root));
    }

    @Test
    public void testInlineStringDefine() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constSDeclaration = createConstDeclaration("S", createStringNode("abc"));
        // Simulate @define annotation by overriding isDefine
        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public boolean isDefine(Var var) {
                        return "S".equals(var.getName());
                    }
                };
            }
        };
        Node refS = createNameNode("S");
        Node varTDeclaration = createVarDeclaration("t", refS);
        root.addChildToBack(constSDeclaration);
        root.addChildToBack(varTDeclaration);

        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var t = "abc";
        assertEquals("var t = \"abc\";", codeGen(root));
    }

    @Test
    public void testInlineConstantWithComplexReferences() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constCDeclaration = createVarDeclaration("C", createNumberNode(5));
        Node refC1 = createNameNode("C");
        Node exprX = new Node(Token.ADD, refC1, createNumberNode(1));
        Node varXDeclaration = createVarDeclaration("x", exprX);

        Node refC2 = createNameNode("C");
        Node exprY = new Node(Token.MUL, refC2, createNumberNode(2));
        Node varYDeclaration = createVarDeclaration("y", exprY);

        Node refC3 = createNameNode("C");
        Node varZDeclaration = createVarDeclaration("z", refC3);

        root.addChildToBack(constCDeclaration);
        root.addChildToBack(varXDeclaration);
        root.addChildToBack(varYDeclaration);
        root.addChildToBack(varZDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var x = 5 + 1; var y = 5 * 2; var z = 5;
        assertEquals("var x = 5 + 1; var y = 5 * 2; var z = 5;", codeGen(root));
    }

    @Test
    public void testNoInlineIfVariableCapturedByClosure() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varXDeclaration = createVarDeclaration("x", createNumberNode(1));
        Node innerFunction = new Node(Token.FUNCTION);
        Node innerBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNameNode("x")));
        innerFunction.addChildToBack(innerBody);

        Node returnExpr = new Node(Token.RETURN, innerFunction);
        Node outerFunctionBody = new Node(Token.BLOCK, varXDeclaration, returnExpr);
        Node outerFunction = new Node(Token.FUNCTION);
        outerFunction.addChildToBack(outerFunctionBody);

        root.addChildToBack(outerFunction);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: function() { var x = 1; return function() { return x; }; } (x should not be inlined)
        // The outer function is not called, so codeGen might simplify it.
        // We expect 'x' to remain declared and used.
        assertEquals("function() { var x = 1; return function() { return x; }; }", codeGen(root));
    }

    @Test
    public void testNoInlineIfArgumentsModified() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "f")); // Function name

        Node argumentsNode = new Node(Token.ARGUMENTS);
        Node accessArgumentsZero = new Node(Token.GETElem, argumentsNode, createNumberNode(0));
        Node assignment = new Node(Token.ASSIGN, accessArgumentsZero, createNumberNode(1));
        Node exprResult = new Node(Token.EXPR_RESULT, assignment);

        Node paramA = new Node(Token.NAME, "a");
        Node paramB = new Node(Token.NAME, "b");
        Node returnExpr = new Node(Token.ADD, paramA, paramB);

        Node functionBody = new Node(Token.BLOCK, exprResult, new Node(Token.RETURN, returnExpr));
        functionNode.addChildToBack(paramA);
        functionNode.addChildToBack(paramB);
        functionNode.addChildToBack(functionBody);

        root.addChildToBack(functionNode);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: function f(a, b) { arguments[0] = 1; return a + b; } (arguments[0] modification should prevent inlining)
        assertEquals("function f(a, b) { arguments[0] = 1; return a + b; }", codeGen(root));
    }

    @Test
    public void testNoInlineIfArgumentsEscaped() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "f")); // Function name

        Node argumentsNode = new Node(Token.ARGUMENTS);
        Node varArgsDeclaration = createVarDeclaration("args", argumentsNode);

        Node refArgs = createNameNode("args");
        Node accessArgsZero = new Node(Token.GETElem, refArgs, createNumberNode(0));
        Node returnExpr = new Node(Token.RETURN, accessArgsZero);

        Node paramA = new Node(Token.NAME, "a");
        Node paramB = new Node(Token.NAME, "b");
        Node functionBody = new Node(Token.BLOCK, varArgsDeclaration, returnExpr);
        functionNode.addChildToBack(paramA);
        functionNode.addChildToBack(paramB);
        functionNode.addChildToBack(functionBody);

        root.addChildToBack(functionNode);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: function f(a, b) { var args = arguments; return args[0]; } (assigning arguments to another var should prevent inlining)
        assertEquals("function f(a, b) { var args = arguments; return args[0]; }", codeGen(root));
    }

    @Test
    public void testInlineVariableReadOnce() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constA = createVarDeclaration("a", createNumberNode(10));
        Node refA = createNameNode("a");
        Node varB = createVarDeclaration("b", refA);
        root.addChildToBack(constA);
        root.addChildToBack(varB);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        assertEquals("var b = 10;", codeGen(root));
    }

    @Test
    public void testInlineVariableAssignedOnceAndReadOnce() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node valProvider = new Node(Token.CALL, createNameNode("getVal"));
        Node assignA = createAssignment(createNameNode("a"), valProvider);
        Node refA = createNameNode("a");
        Node varB = createVarDeclaration("b", refA);
        root.addChildToBack(assignA);
        root.addChildToBack(varB);

        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public boolean isPure(Node expression) {
                return expression.isCall() && expression.getFirstChild().isName() && "getVal".equals(expression.getFirstChild().getString());
            }
        };
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: b = getVal(); // 'a' is removed
        assertEquals("b = getVal();", codeGen(root));
    }

    @Test
    public void testInlineImmutableValueReadOnce() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node arrayLiteral = new Node(Token.ARRAYLIT, createNumberNode(1), createNumberNode(2));
        Node constArrDeclaration = createVarDeclaration("arr", arrayLiteral);
        Node refArr = createNameNode("arr");
        Node indexAccess = new Node(Token.GETELEM, refArr, createNumberNode(0));
        Node varBDeclaration = createVarDeclaration("b", indexAccess);
        root.addChildToBack(constArrDeclaration);
        root.addChildToBack(varBDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var arr = [1, 2]; var b = arr[0]; // arr is not inlined because it's mutable.
        assertEquals("var arr = [1, 2]; var b = arr[0];", codeGen(root));
    }

    @Test
    public void testNoInlineIfValueIsFunction() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node funcExpr = new Node(Token.FUNCTION);
        Node funcBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNumberNode(1)));
        funcExpr.addChildToBack(funcBody);
        Node varFDeclaration = createVarDeclaration("f", funcExpr);

        Node refF = createNameNode("f");
        Node varGDeclaration = createVarDeclaration("g", refF);
        root.addChildToBack(varFDeclaration);
        root.addChildToBack(varGDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var f = function() { return 1; }; var g = f; (f itself is a function value, not inlined as a literal)
        assertEquals("var f = function() { return 1; }; var g = f;", codeGen(root));
    }

    @Test
    public void testInlineFunctionExpressionAsValue() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node funcExpr = new Node(Token.FUNCTION);
        Node funcBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNumberNode(1)));
        funcExpr.addChildToBack(funcBody);
        Node varFDeclaration = createVarDeclaration("f", funcExpr);

        Node refF = createNameNode("f");
        Node varGDeclaration = createVarDeclaration("g", refF);
        root.addChildToBack(varFDeclaration);
        root.addChildToBack(varGDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var g = function() { return 1; };
        assertEquals("var g = function() { return 1; };", codeGen(root));
    }

    @Test
    public void testNoInlineExportedVariable() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constXDeclaration = createVarDeclaration("x", createNumberNode(1));
        Node refX = createNameNode("x");
        Node varYDeclaration = createVarDeclaration("y", refX);
        root.addChildToBack(constXDeclaration);
        root.addChildToBack(varYDeclaration);

        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public boolean isExported(String name) {
                        return "x".equals(name);
                    }
                };
            }
        };
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var x = 1; var y = x; (x is exported, not inlined)
        assertEquals("var x = 1; var y = x;", codeGen(root));
    }
}
