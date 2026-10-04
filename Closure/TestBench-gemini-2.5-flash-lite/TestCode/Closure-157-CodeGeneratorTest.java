package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.NodeUtil.MatchNotFunction;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Assignment;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Scope;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import java.util.Set;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.annotation.Nullable;
import java.io.StringReader;
import com.google.javascript.jscomp.CodeConsumer; // Corrected import for CodeConsumer

// Mock CodeConsumer for testing CodeGenerator
class MockCodeConsumer implements CodeConsumer {
    StringBuilder sb = new StringBuilder();
    boolean continueProcessing = true;




















    public String getContent() {
        return sb.toString();
    }
}


public class CodeGeneratorTest {
    private MockCodeConsumer consumer = new MockCodeConsumer();

    // Helper method to create a Node with a specific type and string value.
    private Node createStringNode(String value) {
        Node node = new Node(Token.STRING);
        node.setString(value);
        return node;
    }

    // Helper method to create a Node with a specific type and double value.
    private Node createNumberNode(double value) {
        Node node = new Node(Token.NUMBER);
        node.setDouble(value);
        return node;
    }

    // Helper method to create a simple variable declaration node.
    private Node createVarNode(String name) {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, name);
        varNode.addChildToBack(nameNode);
        return varNode;
    }

    // Helper method to create a simple assignment node.
    private Node createAssignmentNode(String name, Node value) {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString(Token.NAME, name);
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(value);
        return assignNode;
    }

    // Helper method to create a simple function node.
    private Node createFunctionNode(String name, Node body) {
        Node funcNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, name);
        funcNode.addChildToBack(nameNode); // Function name
        funcNode.addChildToBack(new Node(Token.LP)); // Parameters
        funcNode.addChildToBack(body); // Body
        return funcNode;
    }






















































































    @Test
    public void testAddNumberVerySmallFraction() throws Exception {
        Node numNode = createNumberNode(1e-5);
        codeGenerator.add(numNode);
        assertEquals("0.00001", consumer.getContent());
    }

    @Test
    public void testAddNumberLargePositiveInteger() throws Exception {
        Node numNode = createNumberNode(2147483647.0); // Integer.MAX_VALUE
        codeGenerator.add(numNode);
        assertEquals("2147483647.0", consumer.getContent());
    }

    @Test
    public void testAddNumberMaxPositiveDouble() throws Exception {
        Node numNode = createNumberNode(Double.MAX_VALUE);
        codeGenerator.add(numNode);
        assertEquals("1.7976931348623157E308", consumer.getContent());
    }

    @Test
    public void testAddNumberMinPositiveDouble() throws Exception {
        Node numNode = createNumberNode(Double.MIN_NORMAL); // smallest positive normalized double
        codeGenerator.add(numNode);
        assertEquals("2.2250738585072014E-308", consumer.getContent());
    }

    @Test
    public void testAddNumberNegativeZero() throws Exception {
        Node numNode = createNumberNode(-0.0);
        codeGenerator.add(numNode);
        assertEquals("-0.0", consumer.getContent());
    }

    @Test
    public void testAddEmptyStatementInBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        codeGenerator.add(block);
        assertEquals("{}", consumer.getContent());
    }

    @Test
    public void testAddVarWithInitializer() throws Exception {
        Node value = createNumberNode(10);
        Node init = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), value);
        Node varNode = new Node(Token.VAR, init);
        codeGenerator.add(varNode);
        assertEquals("var x=10", consumer.getContent());
    }

    @Test
    public void testConstantBooleanTrue() throws Exception {
        // IRFactory transforms CONST to VAR, so we expect VAR output.
        Node value = new Node(Token.TRUE);
        Node nameNode = Node.newString(Token.NAME, "myConst");
        Node assignNode = new Node(Token.ASSIGN, nameNode, value);
        Node constVarNode = new Node(Token.VAR, assignNode); // Simulate IRFactory output
        codeGenerator.add(constVarNode);
        assertEquals("var myConst=true", consumer.getContent());
    }

    // Test case for a property access that should not be renamed.
    // This test checks if standard JS built-in properties are handled correctly.
    @Test
    public void testHandleBuiltInPropertyAccess() throws Exception {
        Node target = new Node(Token.NAME, "str");
        Node propName = createStringNode("length");
        Node getPropNode = new Node(Token.GETPROP, target, propName);
        codeGenerator.add(getPropNode);
        assertEquals("str.length", consumer.getContent());
    }

    // Test case for a method call on a built-in object.
    @Test
    public void testHandleBuiltInMethodCall() throws Exception {
        Node target = new Node(Token.NAME, "arr");
        Node methodName = createStringNode("push");
        Node getPropNode = new Node(Token.GETPROP, target, methodName);
        Node arg = createNumberNode(1);
        Node callNode = new Node(Token.CALL, getPropNode, arg);
        codeGenerator.add(callNode);
        assertEquals("arr.push(1)", consumer.getContent());
    }

    // Test case for a property that is likely an exported function or property.
    // Based on RenamePrototypes, exported names should not be renamed.
    @Test
    public void testHandleExportedProperty() throws Exception {
        Node target = new Node(Token.NAME, "MyLib");
        Node propName = createStringNode("somePublicMethod"); // Assuming this is exported
        Node getPropNode = new Node(Token.GETPROP, target, propName);
        codeGenerator.add(getPropNode);
        assertEquals("MyLib.somePublicMethod", consumer.getContent());
    }

    // Test case for a property that might be considered "private" by convention.
    // RenamePrototypes might rename these if aggressive renaming is on.
    // Here, we assume a simple case where it should be renamed if possible.
    @Test
    public void testHandlePotentiallyPrivateProperty() throws Exception {
        Node target = new Node(Token.NAME, "myObj");
        Node propName = createStringNode("_internalValue"); // Conventionally private
        Node getPropNode = new Node(Token.GETPROP, target, propName);
        codeGenerator.add(getPropNode);
        // The actual renaming depends on RenamePrototypes, which is not directly
        // tested here but assumed to work. The output should reflect the property access.
        // If it gets renamed, it will be something like "myObj.a".
        // For simplicity, we assert the structure.
        assertTrue(consumer.getContent().startsWith("myObj."));
    }

    // Test case for object literal property names.
    @Test
    public void testHandleObjectLiteralProperty() throws Exception {
        Node propName = createStringNode("name");
        Node propValue = createStringNode("test");
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeGenerator.add(objectNode);
        assertEquals("{\"name\":\"test\"}", consumer.getContent());
    }

    // Test case for object literal property names that are keywords.
    @Test
    public void testHandleObjectLiteralKeywordProperty() throws Exception {
        Node propName = createStringNode("class"); // keyword
        Node propValue = createNumberNode(1);
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeGenerator.add(objectNode);
        assertEquals("{\"class\":1}", consumer.getContent());
    }

    // Test case for an object literal property that is a number.
    @Test
    public void testHandleObjectLiteralNumberProperty() throws Exception {
        Node propName = createStringNode("123"); // number as string key
        Node propValue = createNumberNode(456);
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeGenerator.add(objectNode);
        assertEquals("{\"123\":456}", consumer.getContent());
    }

    // Test case for a simple expression statement.
    @Test
    public void testAddExpressionStatement() throws Exception {
        Node expr = createNumberNode(10);
        Node exprStmt = new Node(Token.EXPR_RESULT, expr);
        codeGenerator.add(exprStmt);
        assertEquals("10;", consumer.getContent());
    }

    // Test case for a statement with a semicolon.
    @Test
    public void testAddStatementWithSemicolon() throws Exception {
        Node expr = createNumberNode(20);
        Node exprStmt = new Node(Token.EXPR_RESULT, expr);
        codeGenerator.cc.endStatement(true); // Force semicolon
        codeGenerator.add(exprStmt);
        assertEquals("20;", consumer.getContent());
    }

    // Test case for a statement without a semicolon.
    @Test
    public void testAddStatementWithoutSemicolon() throws Exception {
        Node expr = createNumberNode(30);
        Node exprStmt = new Node(Token.EXPR_RESULT, expr);
        codeGenerator.cc.endStatement(false); // No semicolon
        codeGenerator.add(exprStmt);
        assertEquals("30", consumer.getContent());
    }


    // Mock ErrorReporter for IRFactory
    private static class MockErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int sourceLine, String sourceשור) {
            // Ignore for test purposes
        }

        @Override
        public void error(String message, String sourceName, int sourceLine, String sourceשור) {
            // Ignore for test purposes
        }

        @Override
        public com.google.javascript.jscomp.mozilla.rhino.EvaluatorException runtimeError(
                String message, String sourceName, int sourceLine, String sourceשור, int offset) {
            return new com.google.javascript.jscomp.mozilla.rhino.EvaluatorException(message);
        }
    }

    // Mock CompilerInput for RenamePrototypes
    private static class MockCompilerInput extends CompilerInput {
        MockCompilerInput(String content) {
            super(new StringReader(content), "testSource", Charsets.UTF_8);
        }
    }

    // Mock AbstractCompiler for RenamePrototypes and IRFactory
    private static class MockAbstractCompiler extends AbstractCompiler {
        private LifeCycleStage stage = LifeCycleStage.NORMALIZED;
        private String debugLog = "";
        private boolean codeChanged = false;
        private VariableMap propertyMap = null;

        @Override
        public void reportCodeChange() {
            codeChanged = true;
        }

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return stage;
        }

        @Override
        public void setLifeCycleStage(LifeCycleStage stage) {
            this.stage = stage;
        }

        @Override
        public void addToDebugLog(String message) {
            debugLog += message;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new ClosureCodingConvention();
        }

        @Override
        public Node getSynthesizedAsts() {
            return null;
        }

        @Override
        public void setPropertyMap(VariableMap propertyMap) {
            this.propertyMap = propertyMap;
        }

        @Override
        public VariableMap getPropertyMap() {
            return propertyMap;
        }

        @Override
        public void recordPass(String passName) {}

        @Override
        public void ensureLibraryInjected(String libName) {}

        @Override
        public void injectSourceFile(String fileName, String content) {}

        @Override
        public void setErrorManager(ErrorManager errorManager) {}

        @Override
        public ErrorManager getErrorManager() {
            return new BasicErrorManager();
        }
    }

    // Mock NodeTraversal for testing visitors directly

    // Implement AbstractPostOrderCallback for the visitor
    private static abstract class AbstractPostOrderCallback implements NodeTraversal.Callback {
        @Override
        public abstract void visit(NodeTraversal t, Node n, Node parent);
    }


    @Test
    public void testTransformTree() throws Exception {
        // This test requires a full AST and Config setup, which is complex.
        // We'll create a minimal setup to test the basic transformation.
        AstRoot root = new AstRoot(); // Minimal AST
        root.setSourceName("test.js");
        String sourceString = "var a = 1;";
        Config config = new Config.Builder().setLanguageMode(LanguageMode.ECMASCRIPT5).build();
        ErrorReporter errorReporter = new MockErrorReporter();

        Node transformedNode = IRFactory.transformTree(root, sourceString, config, errorReporter);
        assertNotNull(transformedNode);
        assertEquals(Token.SCRIPT, transformedNode.getType());
    }

    @Test
    public void testComparePropertiesByFrequency() throws Exception {
        RenamePrototypes.Property p1 = new RenamePrototypes(null, false, null, null).new Property("a");
        p1.prototypeCount = 10;
        p1.objLitCount = 5;

        RenamePrototypes.Property p2 = new RenamePrototypes(null, false, null, null).new Property("b");
        p2.prototypeCount = 12;
        p2.objLitCount = 3;

        RenamePrototypes.Property p3 = new RenamePrototypes(null, false, null, null).new Property("c");
        p3.prototypeCount = 10;
        p3.objLitCount = 5; // Same count as p1

        Comparator<RenamePrototypes.Property> comparator = new Comparator<RenamePrototypes.Property>() {
            public int compare(RenamePrototypes.Property a1, RenamePrototypes.Property a2) {
                int n1 = a1.count();
                int n2 = a2.count();
                if (n1 != n2) {
                    return n2 - n1;
                }
                return a1.oldName.compareTo(a2.oldName);
            }
        };

        assertTrue(comparator.compare(p2, p1) < 0);
        assertTrue(comparator.compare(p1, p3) < 0);
    }


    @Test
    public void testProcessRenaming() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
        RenamePrototypes renamer = new RenamePrototypes(compiler, true, null, null);

        Node externsRoot = new Node(Token.SCRIPT);
        Node codeRoot = new Node(Token.SCRIPT);

        // Example: obj.prop = 1;
        Node objName1 = new Node(Token.NAME, "obj");
        Node propName1 = Node.newString(Token.STRING, "prop");
        Node getProp1 = new Node(Token.GETPROP, objName1, propName1);
        Node value1 = createNumberNode(1);
        Node assign1 = new Node(Token.ASSIGN, getProp1, value1);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, assign1));

        // Example: obj.prop = 2; (second access)
        Node objName2 = new Node(Token.NAME, "obj");
        Node propName2 = Node.newString(Token.STRING, "prop");
        Node getProp2 = new Node(Token.GETPROP, objName2, propName2);
        Node value2 = createNumberNode(2);
        Node assign2 = new Node(Token.ASSIGN, getProp2, value2);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, assign2));

        // Example: obj.anotherProp = 3; (new property)
        Node objName3 = new Node(Token.NAME, "obj");
        Node propName3 = Node.newString(Token.STRING, "anotherProp");
        Node getProp3 = new Node(Token.GETPROP, objName3, propName3);
        Node value3 = createNumberNode(3);
        Node assign3 = new Node(Token.ASSIGN, getProp3, value3);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, assign3));

        renamer.process(externsRoot, codeRoot);

        assertTrue(compiler.debugLog.contains("prop =>"));
        assertTrue(compiler.debugLog.contains("anotherProp =>"));
        assertTrue(compiler.codeChanged);
        assertNotNull(compiler.getPropertyMap());
        assertNotNull(compiler.getPropertyMap().lookupNewName("prop"));
        assertNotNull(compiler.getPropertyMap().lookupNewName("anotherProp"));
    }

    // Helper to create a simple AstRoot for testing transformTree.
    private AstRoot createAstRoot(String source, int startLine) {
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.setLength(source.length());
        root.setAbsolutePosition(0);
        root.setLineno(startLine);
        Name placeholderName = new Name();
        placeholderName.setIdentifier("test");
        placeholderName.setLineno(startLine);
        placeholderName.setLength(4);
        placeholderName.setAbsolutePosition(0);
        root.addChildToBack(placeholderName);
        return root;
    }

    @Test
    public void testTransformTreeWithSimpleCode() throws Exception {
        String source = "var x = 1;";
        AstRoot astRoot = createAstRoot(source, 1);
        Config config = new Config.Builder().setLanguageMode(LanguageMode.ECMASCRIPT5).build();
        ErrorReporter errorReporter = new MockErrorReporter();

        Node irRoot = IRFactory.transformTree(astRoot, source, config, errorReporter);
        assertNotNull(irRoot);
        assertEquals(Token.SCRIPT, irRoot.getType());
        assertEquals(1, irRoot.getChildCount()); // Should have one child: VAR
        Node varNode = irRoot.getFirstChild();
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(1, varNode.getChildCount()); // Should have one child: the variable initializer
        Node initializer = varNode.getFirstChild();
        assertEquals(Token.ASSIGN, initializer.getType());
        assertEquals("x", initializer.getFirstChild().getString());
        assertEquals(1.0, initializer.getLastChild().getDouble(), 0.00001);
    }

    @Test
    public void testProcessExternedProperties() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        RenamePrototypes renamer = new RenamePrototypes(compiler, false, null, null);
        Node externsRoot = new Node(Token.SCRIPT);

        Node objProto = new Node(Token.GETPROP, new Node(Token.NAME, "Object"), Node.newString(Token.STRING, "prototype"));
        Node toStringName = Node.newString(Token.STRING, "toString");
        Node getPropNode = new Node(Token.GETPROP, objProto, toStringName);
        externsRoot.addChildToBack(new Node(Token.EXPR_RESULT, getPropNode));

        // Manually call the visitor for externs.
        NodeTraversal traversal = new NodeTraversal(compiler, renamer.new ProcessExternedProperties(), null);
        traversal.traverseRoots(externsRoot);

        Node codeRoot = new Node(Token.SCRIPT);
        Node objAccess = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), Node.newString(Token.STRING, "toString"));
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, objAccess));

        renamer.process(externsRoot, codeRoot);

        assertTrue(compiler.debugLog.contains("obj.toString"));
    }

    @Test
    public void testvisitWithObjectLiteral() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        RenamePrototypes renamer = new RenamePrototypes(compiler, true, null, null);
        Node codeRoot = new Node(Token.SCRIPT);

        Node propName = Node.newString(Token.STRING, "myProp");
        Node propValue = createNumberNode(123);
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, objectNode));

        NodeTraversal traversal = new NodeTraversal(compiler, renamer.new ProcessProperties(), null);
        traversal.traverseRoots(codeRoot);

        assertTrue(renamer.properties.containsKey("myProp"));
        RenamePrototypes.Property prop = renamer.properties.get("myProp");
        assertEquals(1, prop.objLitCount);
    }

    @Test
    public void testvisitWithPrototypeProperty() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        RenamePrototypes renamer = new RenamePrototypes(compiler, true, null, null);
        Node codeRoot = new Node(Token.SCRIPT);

        Node protoName = Node.newString(Token.STRING, "prototype");
        Node objName = new Node(Token.NAME, "Foo");
        Node getProto = new Node(Token.GETPROP, objName, protoName);
        Node methodName = Node.newString(Token.STRING, "myMethod");
        Node getMethod = new Node(Token.GETPROP, getProto, methodName);
        Node funcBody = new Node(Token.BLOCK);
        Node funcNode = createFunctionNode("myMethod", funcBody);
        Node assign = new Node(Token.ASSIGN, getMethod, funcNode);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        NodeTraversal traversal = new NodeTraversal(compiler, renamer.new ProcessProperties(), null);
        traversal.traverseRoots(codeRoot);

        assertTrue(renamer.properties.containsKey("myMethod"));
        RenamePrototypes.Property prop = renamer.properties.get("myMethod");
        assertEquals(1, prop.prototypeCount);
    }

    @Test
    public void testAddTryCatchWithEmptyCatchClause() throws Exception {
        Node tryBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH); // No variable, no body
        Node tryNode = new Node(Token.TRY, tryBlock, catchNode);
        codeGenerator.add(tryNode);
        assertEquals("try{}catch(){}", consumer.getContent());
    }

    @Test
    public void testAddForLoopWithEmptyInitializer() throws Exception {
        Node init = new Node(Token.EMPTY); // Empty initializer
        Node condition = new Node(Token.LT, new Node(Token.NAME, "i"), createNumberNode(10));
        Node increment = new Node(Token.INC, new Node(Token.NAME, "i"));
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        codeGenerator.add(forNode);
        assertEquals("for(;i<10;++i){}", consumer.getContent());
    }
}





