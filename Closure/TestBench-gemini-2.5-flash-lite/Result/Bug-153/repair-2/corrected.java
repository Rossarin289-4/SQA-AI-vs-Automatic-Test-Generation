package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.List;
import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

// Remove helper classes and simplify where possible to resolve compilation errors.
// The original code had many mock implementations that were not correctly defined or used.
public class NormalizeTest {
    
    // Mock AbstractCompiler - simplified to only what's needed by the tests.
    private static class MockCompiler implements AbstractCompiler {
        private boolean codeChanged = false;
        private boolean normalized = false;
        public CodingConvention codingConvention = new DefaultCodingConvention();
        public Node[] externs = null;
        public ErrorManager errorManager = new BasicErrorManager(); // Provide a basic ErrorManager

        @Override
        public void reportCodeChange() {
            this.codeChanged = true;
        }

        @Override
        public Node parseSyntheticCode(String code) {
            // Simplified parsing for testing
            return new Node(Token.SCRIPT);
        }

        @Override
        public Node parseTestCode(String code) {
            // Simplified parsing for testing
            return new Node(Token.SCRIPT);
        }

        @Override
        public CodingConvention getCodingConvention() {
            return this.codingConvention;
        }

        @Override
        public void report(JSError error) {
            // In a real test, you might want to capture errors
        }

        // Dummy implementations for other required methods
        @Override public CompilerInput getInput(String sourceName) { return null; }
        @Override public CompilerInput newExternInput(String name) { return null; }
        @Override public JSModuleGraph getModuleGraph() { return null; }
        @Override public List<CompilerInput> getInputsInOrder() { return ImmutableList.of(); }
        @Override public JSTypeRegistry getTypeRegistry() { return null; } // JSTypeRegistry is not used by the methods being tested here directly.
        @Override public ScopeCreator getScopeCreator() { return new SyntacticScopeCreator(this); } // Assuming SyntacticScopeCreator is available and can be instantiated.
        @Override public Scope getTopScope() { return null; }
        @Override public void throwInternalError(String msg, Exception cause) { throw new RuntimeException(msg, cause); }
        @Override public void addToDebugLog(String message) {}
        @Override public void setCssRenamingMap(CssRenamingMap map) {}
        @Override public CssRenamingMap getCssRenamingMap() { return null; }
        @Override public Node getNodeForCodeInsertion(JSModule module) { return new Node(Token.SCRIPT); }
        @Override public TypeValidator getTypeValidator() { return null; }
        @Override public String toSource(Node root) { return "mocked source"; }
        @Override public ErrorReporter getDefaultErrorReporter() { return new SilentErrorReporter(); } // Use a basic ErrorReporter
        @Override public ReverseAbstractInterpreter getReverseAbstractInterpreter() { return null; }
        @Override public boolean isNormalized() { return normalized; }
        @Override public void setNormalized() { this.normalized = true; }
        @Override public void setUnnormalized() {}
        @Override public Supplier<String> getUniqueNameIdSupplier() { return () -> "unique"; }
        @Override public boolean hasHaltingErrors() { return false; }
        @Override public void addChangeHandler(CodeChangeHandler handler) {}
        @Override public void removeChangeHandler(CodeChangeHandler handler) {}
        @Override public boolean isIdeMode() { return false; }
        @Override public boolean acceptEcmaScript5() { return false; }
        @Override public Config getParserConfig() { return null; }
        @Override public boolean isTypeCheckingEnabled() { return false; }
        @Override public void prepareAst(Node root) {}
        @Override public ErrorManager getErrorManager() { return this.errorManager; } // Return the provided ErrorManager
        @Override public boolean areNodesEqualForInlining(Node n1, Node n2) { return false; }
        @Override public void setHasRegExpGlobalReferences(boolean references) {}
        @Override public boolean hasRegExpGlobalReferences() { return false; }
    }

    private MockCompiler compiler;

    private void setupCompiler() {
        compiler = new MockCompiler();
    }

    // Helper method to create a Node with line and character numbers.
    private Node createNode(int type, int lineno, int charno, Node... children) {
        Node n = new Node(type, lineno, charno);
        for (Node child : children) {
            n.addChildToBack(child);
        }
        return n;
    }

    // Helper to create a script node.
    private Node createScriptNode(Node... children) {
        return createNode(Token.SCRIPT, 0, 0, children);
    }

    // Helper to create a VAR node.
    private Node createVarNode(String name, Node value) {
        Node nameNode = new Node(Token.NAME, name, 0, 0);
        if (value != null) {
            nameNode.addChildToBack(value);
        }
        return new Node(Token.VAR, nameNode, 0, 0);
    }

    private Node createVarNode(String name) {
        return createVarNode(name, null);
    }

    // Helper to create an EXPR_RESULT node.
    private Node createExprStatement(Node expr) {
        return new Node(Token.EXPR_RESULT, expr, 0, 0);
    }

    // Helper to create a FUNCTION declaration node.
    private Node createFunctionDeclaration(String name, Node body) {
        Node fn = new Node(Token.FUNCTION, new Node(Token.NAME, name, 0, 0), new Node(Token.LP), body, 0, 0);
        return fn;
    }
    
    // Helper to create a FUNCTION expression node.
    private Node createFunctionExpression(String name, Node body) {
        return new Node(Token.FUNCTION, new Node(Token.NAME, name, 0, 0), new Node(Token.LP), body, 0, 0);
    }


    @Test
    public void testSplitVarDeclarations() throws Exception {
        setupCompiler();
        Node root = createScriptNode(
            createVarNode("a", new Node(Token.NUMBER, 1, 0, 0)),
            createVarNode("b", new Node(Token.NUMBER, 2, 0, 0)),
            createVarNode("c")
        );
        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        Node varA = root.getFirstChild();
        assertEquals(Token.VAR, varA.getType());
        assertEquals("a", varA.getFirstChild().getString());

        Node varB = varA.getNext();
        assertEquals(Token.VAR, varB.getType());
        assertEquals("b", varB.getFirstChild().getString());

        Node varC = varB.getNext();
        assertEquals(Token.VAR, varC.getType());
        assertEquals("c", varC.getFirstChild().getString());
    }

    @Test
    public void testSplitVarDeclarationsWithInitializers() throws Exception {
        setupCompiler();
        Node root = createScriptNode(
            createVarNode("a", new Node(Token.NUMBER, 1, 0, 0)),
            createVarNode("b", new Node(Token.NUMBER, 2, 0, 0))
        );
        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        Node varA = root.getFirstChild();
        assertEquals(Token.VAR, varA.getType());
        assertEquals("a", varA.getFirstChild().getString());
        assertEquals(Token.NUMBER, varA.getFirstChild().getFirstChild().getType());
        assertEquals(1.0, varA.getFirstChild().getFirstChild().getDouble(), 0.0);

        Node varB = varA.getNext();
        assertEquals(Token.VAR, varB.getType());
        assertEquals("b", varB.getFirstChild().getString());
        assertEquals(Token.NUMBER, varB.getFirstChild().getFirstChild().getType());
        assertEquals(2.0, varB.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testConvertWhileToFor() throws Exception {
        setupCompiler();
        Node body = new Node(Token.BLOCK, createExprStatement(new Node(Token.NAME, "x", 0, 0)), 0, 0);
        Node whileNode = new Node(Token.WHILE, new Node(Token.NAME, "condition", 0, 0), body, 0, 0);
        Node root = createScriptNode(whileNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        assertEquals(Token.FOR, whileNode.getType());
        Node forInit1 = whileNode.getFirstChild();
        assertEquals(Token.EMPTY, forInit1.getType());
        Node forInit2 = forInit1.getNext();
        assertEquals(Token.EMPTY, forInit2.getType());
        assertEquals("condition", forInit2.getNext().getString());
        assertEquals(body, forInit2.getNext().getNext());
    }

    @Test
    public void testExtractForInitializerNoInitializer() throws Exception {
        setupCompiler();
        Node loopBody = new Node(Token.BLOCK, 0, 0);
        Node forNode = new Node(Token.FOR, new Node(Token.EMPTY, 0, 0), new Node(Token.NAME, "condition", 0, 0), new Node(Token.EMPTY, 0, 0), loopBody, 0, 0);
        Node root = createScriptNode(forNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        assertEquals(Token.FOR, forNode.getType());
        assertEquals(Token.EMPTY, forNode.getFirstChild().getType()); // Initializer
        assertEquals(Token.NAME, forNode.getChildAtIndex(1).getType()); // Condition
        assertEquals(Token.EMPTY, forNode.getChildAtIndex(2).getType()); // Increment
        assertEquals(loopBody, forNode.getLastChild());
    }

    @Test
    public void testExtractForInitializerWithExpressionInitializer() throws Exception {
        setupCompiler();
        Node initializer = createExprStatement(createVarNode("a", new Node(Token.NUMBER, 1, 0, 0)));
        Node loopBody = new Node(Token.BLOCK, 0, 0);
        Node forNode = new Node(Token.FOR, initializer, new Node(Token.NAME, "condition", 0, 0), new Node(Token.EMPTY, 0, 0), loopBody, 0, 0);
        Node root = createScriptNode(forNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The initializer should be moved before the for loop.
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.ASSIGN, root.getFirstChild().getFirstChild().getType());
        assertEquals("a", root.getFirstChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getFirstChild().getFirstChild().getLastChild().getType());
        assertEquals(1.0, root.getFirstChild().getFirstChild().getLastChild().getDouble(), 0.0);

        // The for loop's initializer should be an EMPTY node.
        assertEquals(Token.FOR, forNode.getType());
        assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
    }

    @Test
    public void testExtractForInitializerWithVarInitializer() throws Exception {
        setupCompiler();
        Node initializer = createVarNode("a", new Node(Token.NUMBER, 1, 0, 0));
        Node loopBody = new Node(Token.BLOCK, 0, 0);
        Node forNode = new Node(Token.FOR, initializer, new Node(Token.NAME, "condition", 0, 0), new Node(Token.EMPTY, 0, 0), loopBody, 0, 0);
        Node root = createScriptNode(forNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The var initializer should be moved before the for loop.
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("a", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals(1.0, root.getFirstChild().getFirstChild().getFirstChild().getDouble(), 0.0);

        // The for loop's initializer should be an EMPTY node.
        assertEquals(Token.FOR, forNode.getType());
        assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
    }

    @Test
    public void testExtractForInInitializerWithVar() throws Exception {
        setupCompiler();
        Node declaration = new Node(Token.VAR, new Node(Token.NAME, "i", 0, 0), 0, 0);
        Node forNode = new Node(Token.FOR,
                declaration,
                new Node(Token.NAME, "key", 0, 0),
                new Node(Token.EMPTY, 0, 0), // Empty value for FOR_IN
                new Node(Token.BLOCK, 0, 0), // Body
                0, 0);
        forNode.putBooleanProp(Node.FOR_IN_FLAG, true);
        Node root = createScriptNode(forNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The VAR declaration should be moved before the FOR_IN loop.
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("i", root.getFirstChild().getFirstChild().getString());
        assertNull(root.getFirstChild().getFirstChild().getFirstChild()); // No initializer for 'i' here

        // The FOR_IN loop should now have the variable name directly.
        assertEquals(Token.FOR, forNode.getType());
        assertTrue(forNode.getBooleanProp(Node.FOR_IN_FLAG));
        assertEquals(Token.NAME, forNode.getFirstChild().getType());
        assertEquals("i", forNode.getFirstChild().getString());
        assertNull(forNode.getFirstChild().getFirstChild());
    }

    @Test
    public void testRewriteFunctionDeclarationToVar() throws Exception {
        setupCompiler();
        Node body = new Node(Token.BLOCK, createExprStatement(new Node(Token.STRING, "hello", 0, 0)), 0, 0);
        Node functionNode = createFunctionDeclaration("foo", body);
        Node root = createScriptNode(functionNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        assertEquals(Token.VAR, root.getFirstChild().getType());
        Node nameNode = root.getFirstChild().getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("foo", nameNode.getString());
        Node functionExpr = nameNode.getFirstChild();
        assertEquals(Token.FUNCTION, functionExpr.getType());
        assertEquals("", functionExpr.getFirstChild().getString()); // Anonymous function
        assertEquals(body, functionExpr.getLastChild());
    }

    @Test
    public void testMoveNamedFunctionsToTop() throws Exception {
        setupCompiler();
        Node innerBody = new Node(Token.BLOCK,
            createFunctionDeclaration("innerFunc1", new Node(Token.BLOCK, 0, 0)),
            createExprStatement(new Node(Token.STRING, "stmt1", 0, 0)),
            createFunctionDeclaration("innerFunc2", new Node(Token.BLOCK, 0, 0)),
            createExprStatement(new Node(Token.STRING, "stmt2", 0, 0))
        );
        Node functionNode = createFunctionDeclaration("outerFunc", innerBody);
        Node root = createScriptNode(functionNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        assertEquals(Token.FUNCTION, innerBody.getParent().getType());
        Node firstChild = innerBody.getFirstChild();
        assertEquals(Token.VAR, firstChild.getType()); // moved function
        assertEquals("innerFunc1", firstChild.getFirstChild().getString());
        assertEquals(Token.FUNCTION, firstChild.getFirstChild().getType());

        Node secondChild = firstChild.getNext();
        assertEquals(Token.EXPR_RESULT, secondChild.getType()); // original stmt1
        assertEquals("stmt1", secondChild.getFirstChild().getString());

        Node thirdChild = secondChild.getNext();
        assertEquals(Token.VAR, thirdChild.getType()); // moved function
        assertEquals("innerFunc2", thirdChild.getFirstChild().getString());
        assertEquals(Token.FUNCTION, thirdChild.getFirstChild().getType());

        Node fourthChild = thirdChild.getNext();
        assertEquals(Token.EXPR_RESULT, fourthChild.getType()); // original stmt2
        assertEquals("stmt2", fourthChild.getFirstChild().getString());
    }

    @Test
    public void testPropagateConstantAnnotationsOverVars() throws Exception {
        setupCompiler();
        // Simulate a variable with JSDoc @const
        Node nameNode = new Node(Token.NAME, "MY_CONST", 0, 0);
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstant(true);
        nameNode.setJSDocInfo(jsDocInfo);

        Node varNode = createVarNode("MY_CONST", null); // Simplified Var creation
        varNode.getFirstChild().setJSDocInfo(jsDocInfo); // Attach JSDoc to the name node
        Node root = createScriptNode(varNode);

        Normalize.PropagateConstantAnnotationsOverVars pass =
            new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
        pass.process(null, root);

        assertTrue(varNode.getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateConstantAnnotationsOverVars_convention() throws Exception {
        setupCompiler();
        // Simulate a variable named in ALL_CAPS
        Node nameNode = new Node(Token.NAME, "ALL_CAPS_CONST", 0, 0);
        Node varNode = createVarNode("ALL_CAPS_CONST", null);
        Node root = createScriptNode(varNode);

        // Mocking getCodingConvention to recognize ALL_CAPS as constant
        compiler.codingConvention = new DefaultCodingConvention() {
            @Override
            public boolean isConstant(String name) {
                return name.equals("ALL_CAPS_CONST");
            }
        };

        Normalize.PropagateConstantAnnotationsOverVars pass =
            new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
        pass.process(null, root);

        assertTrue(varNode.getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateConstantAnnotationsOverVars_noConstant() throws Exception {
        setupCompiler();
        Node nameNode = new Node(Token.NAME, "myVar", 0, 0);
        Node varNode = createVarNode("myVar", null);
        Node root = createScriptNode(varNode);

        Normalize.PropagateConstantAnnotationsOverVars pass =
            new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
        pass.process(null, root);

        assertFalse(varNode.getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testRemoveDuplicateDeclarations_global() throws Exception {
        setupCompiler();
        // Simulate duplicate global declaration
        Node globalVar1 = createVarNode("globalVar", new Node(Token.NUMBER, 1, 0, 0));
        Node globalVar2 = createVarNode("globalVar", new Node(Token.NUMBER, 2, 1, 1));
        Node root = createScriptNode(globalVar1, globalVar2);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The second declaration should be replaced by an assignment.
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("globalVar", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.EXPR_RESULT, root.getLastChild().getType()); // Should be converted to EXPR_RESULT
        assertEquals(Token.ASSIGN, root.getLastChild().getFirstChild().getType());
        assertEquals("globalVar", root.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals(2.0, root.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testRemoveDuplicateDeclarations_local() throws Exception {
        setupCompiler();
        Node functionBody = new Node(Token.BLOCK,
            createVarNode("localVar", new Node(Token.NUMBER, 1, 0, 0)),
            createVarNode("localVar", new Node(Token.NUMBER, 2, 1, 1))
        );
        Node functionNode = createFunctionDeclaration("myFunc", functionBody);
        Node root = createScriptNode(functionNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The second local declaration should be replaced by an assignment.
        assertEquals(Token.VAR, functionBody.getFirstChild().getType());
        assertEquals("localVar", functionBody.getFirstChild().getFirstChild().getString());
        assertEquals(Token.ASSIGN, functionBody.getLastChild().getType());
        assertEquals("localVar", functionBody.getLastChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, functionBody.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals(2.0, functionBody.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testRemoveDuplicateDeclarations_catchException() throws Exception {
        setupCompiler();
        Node catchBlock = new Node(Token.BLOCK,
            createExprStatement(new Node(Token.NAME, "e", 0, 0)) // use of catch exception
        );
        Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "e", 0, 0), catchBlock, 0, 0);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK, 0, 0), catchNode, 0, 0);
        Node root = createScriptNode(tryNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The process should complete without error. The specific error reporting for catch redeclaration is not tested here.
        assertEquals(Token.TRY, root.getFirstChild().getType());
        assertEquals(Token.CATCH, root.getFirstChild().getLastChild().getType());
        assertEquals("e", root.getFirstChild().getLastChild().getFirstChild().getString());
    }

    @Test
    public void testAnnotateConstantsByConvention_propertyName() throws Exception {
        setupCompiler();
        Node parent = new Node(Token.GETPROP, new Node(Token.NAME, "obj", 0, 0), new Node(Token.STRING, "CONST_PROP", 0, 0), 0, 0);
        Node nameNode = parent.getLastChild(); // The STRING node for the property name

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.annotateConstantsByConvention(nameNode, parent);

        assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testAnnotateConstantsByConvention_objectLitKey() throws Exception {
        setupCompiler();
        Node parent = new Node(Token.OBJECTLIT, new Node(Token.STRING_KEY, "CONST_KEY", 0, 0), 0, 0);
        Node nameNode = parent.getFirstChild(); // The STRING_KEY node

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.annotateConstantsByConvention(nameNode, parent);

        assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testAnnotateConstantsByConvention_variableName() throws Exception {
        setupCompiler();
        Node nameNode = new Node(Token.NAME, "CONST_VAR", 0, 0);
        Node parent = createVarNode("CONST_VAR", null); // Wrap in VAR for context
        parent.replaceChild(parent.getFirstChild(), nameNode); // Ensure nameNode is the child

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.annotateConstantsByConvention(nameNode, parent);

        assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testRewriteFunctionDeclarationToVar_Anonymous() throws Exception {
        setupCompiler();
        Node body = new Node(Token.BLOCK, createExprStatement(new Node(Token.STRING, "body", 0, 0)), 0, 0);
        // This is a named function declaration, but it will be rewritten to var anonymous = function()...
        Node namedFunctionNode = createFunctionDeclaration("anonTest", body); 
        Node root = createScriptNode(namedFunctionNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("anonTest", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.FUNCTION, root.getFirstChild().getFirstChild().getFirstChild().getType());
        // The function expression itself should be anonymous (empty name string)
        assertEquals("", root.getFirstChild().getFirstChild().getFirstChild().getFirstChild().getString()); 
    }

    @Test
    public void testNormalizeLabels_validCases() throws Exception {
        setupCompiler();
        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);

        // Label with BLOCK
        Node block = new Node(Token.BLOCK, 0, 0);
        Node labelBlock = new Node(Token.LABEL, block, 0, 0);
        normalizer.normalizeLabels(labelBlock);
        assertEquals(Token.BLOCK, labelBlock.getLastChild().getType());

        // Label with FOR
        Node forLoop = new Node(Token.FOR, 0, 0);
        Node labelFor = new Node(Token.LABEL, forLoop, 0, 0);
        normalizer.normalizeLabels(labelFor);
        assertEquals(Token.FOR, labelFor.getLastChild().getType());

        // Label with WHILE
        Node whileLoop = new Node(Token.WHILE, 0, 0);
        Node labelWhile = new Node(Token.LABEL, whileLoop, 0, 0);
        normalizer.normalizeLabels(labelWhile);
        assertEquals(Token.WHILE, labelWhile.getLastChild().getType());

        // Label with DO
        Node doLoop = new Node(Token.DO, 0, 0);
        Node labelDo = new Node(Token.LABEL, doLoop, 0, 0);
        normalizer.normalizeLabels(labelDo);
        assertEquals(Token.DO, labelDo.getLastChild().getType());

        // Label with another LABEL
        Node innerLabel = new Node(Token.LABEL, 0, 0);
        Node outerLabel = new Node(Token.LABEL, innerLabel, 0, 0);
        normalizer.normalizeLabels(outerLabel);
        assertEquals(Token.LABEL, outerLabel.getLastChild().getType());
    }

    @Test
    public void testNormalizeLabels_invalidCaseMovesToBlock() throws Exception {
        setupCompiler();
        Node statement = createExprStatement(new Node(Token.STRING, "statement", 0, 0));
        Node labelStatement = new Node(Token.LABEL, statement, 0, 0);

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.normalizeLabels(labelStatement);

        assertEquals(Token.BLOCK, labelStatement.getLastChild().getType());
        assertEquals(Token.EXPR_RESULT, labelStatement.getLastChild().getFirstChild().getType());
        assertEquals("statement", labelStatement.getLastChild().getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testMakeLocalNamesUnique_simple() throws Exception {
        setupCompiler();
        // Simple case: no shadowing
        Node script = createScriptNode(
            createVarNode("a", null),
            createVarNode("b", null)
        );
        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, script);
        // No changes expected for simple cases, but the pass should run.
        assertEquals(Token.VAR, script.getFirstChild().getType());
        assertEquals("a", script.getFirstChild().getFirstChild().getString());
        assertEquals(Token.VAR, script.getLastChild().getType());
        assertEquals("b", script.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testMakeLocalNamesUnique_shadowing() throws Exception {
        setupCompiler();
        // Simulate shadowing
        Node functionBody = new Node(Token.BLOCK,
            createVarNode("x", null),
            createVarNode("x", null) // Shadowing 'x'
        );
        Node functionNode = createFunctionDeclaration("shadowFunc", functionBody);
        Node root = createScriptNode(functionNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // MakeDeclaredNamesUnique should rename the second 'x'.
        Node firstVar = functionBody.getFirstChild();
        assertEquals("x", firstVar.getFirstChild().getString());

        Node secondVar = firstVar.getNext();
        assertNotEquals("x", secondVar.getFirstChild().getString());
        // Check for a typical renaming pattern like `x_1` or similar.
        assertTrue(secondVar.getFirstChild().getString().startsWith("x_")); 
    }

    @Test
    public void testAnnotateConstantsByConvention_mixed() throws Exception {
        setupCompiler();
        Node constAName = new Node(Token.NAME, "CONST_A", 0, 0);
        Node constAVar = createVarNode("CONST_A", null);
        constAVar.replaceChild(constAVar.getFirstChild(), constAName);

        Node varBName = new Node(Token.NAME, "varB", 0, 0);
        Node varBVar = createVarNode("varB", null);
        varBVar.replaceChild(varBVar.getFirstChild(), varBName);

        Node root = createScriptNode(constAVar, varBVar);

        // Mocking getCodingConvention to recognize CONST_A as constant
        compiler.codingConvention = new DefaultCodingConvention() {
            @Override
            public boolean isConstant(String name) {
                return name.equals("CONST_A");
            }
        };

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.annotateConstantsByConvention(constAName, constAVar);
        normalizer.annotateConstantsByConvention(varBName, varBVar);

        assertTrue(constAName.getBooleanProp(Node.IS_CONSTANT_NAME));
        assertFalse(varBName.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testRemoveDuplicateDeclarations_var_and_assign() throws Exception {
        setupCompiler();
        Node varDecl = createVarNode("foo", null);
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "foo", 0, 0), new Node(Token.NUMBER, 1, 1, 1), 0, 0);
        Node exprAssign = createExprStatement(assign);
        Node root = createScriptNode(varDecl, exprAssign);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The second declaration (assign) should be converted to a simple assignment.
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.EXPR_RESULT, root.getLastChild().getType());
        assertEquals(Token.ASSIGN, root.getLastChild().getFirstChild().getType());
        assertEquals("foo", root.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals(1.0, root.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

     @Test
    public void testRemoveDuplicateDeclarations_var_with_init_and_assign() throws Exception {
        setupCompiler();
        Node varDecl = createVarNode("foo", new Node(Token.NUMBER, 0, 0, 0));
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "foo", 0, 0), new Node(Token.NUMBER, 1, 1, 1), 0, 0);
        Node exprAssign = createExprStatement(assign);
        Node root = createScriptNode(varDecl, exprAssign);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The second declaration (assign) should be converted to a simple assignment.
        // The first var declaration should remain as is.
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("foo", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals(0.0, root.getFirstChild().getFirstChild().getFirstChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, root.getLastChild().getType());
        assertEquals(Token.ASSIGN, root.getLastChild().getFirstChild().getType());
        assertEquals("foo", root.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals(1.0, root.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testRemoveDuplicateDeclarations_forLoopVarInit() throws Exception {
        setupCompiler();
        Node initializer = createVarNode("i", new Node(Token.NUMBER, 0, 0, 0));
        Node forNode = new Node(Token.FOR, initializer, new Node(Token.TRUE, 0, 0), new Node(Token.EMPTY, 0, 0), new Node(Token.BLOCK, 0, 0), 0, 0);
        Node root = createScriptNode(forNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The initializer should be moved out as a VAR statement.
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("i", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals(0.0, root.getFirstChild().getFirstChild().getFirstChild().getDouble(), 0.0);

        // The for loop's initializer should be EMPTY.
        assertEquals(Token.FOR, forNode.getType());
        assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
    }

    @Test
    public void testRemoveDuplicateDeclarations_global_extern() throws Exception {
        setupCompiler();
        // Simulate duplicate global declaration with one in externs
        Node externVar = createVarNode("globalVar", null);
        externVar.putBooleanProp(Node.IS_EXTERNAL_PROP, true); // Mark as extern
        Node sourceVar = createVarNode("globalVar", new Node(Token.NUMBER, 1, 1, 1));
        Node root = createScriptNode(externVar, sourceVar);

        // Mock compiler to return externs
        compiler.externs = new Node[]{externVar};

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The source declaration should NOT be changed to assignment if it's a duplicate of an extern.
        // It should remain a VAR.
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("globalVar", root.getFirstChild().getFirstChild().getString());
        assertTrue(root.getFirstChild().getFirstChild().getBooleanProp(Node.IS_EXTERNAL_PROP)); // Externs are preserved as VARs

        assertEquals(Token.VAR, root.getLastChild().getType());
        assertEquals("globalVar", root.getLastChild().getFirstChild().getString());
        assertFalse(root.getLastChild().getFirstChild().getBooleanProp(Node.IS_EXTERNAL_PROP)); // Source var is not an extern
    }

    @Test
    public void testAnnotateConstantsByConvention_getprop_name() throws Exception {
        setupCompiler();
        Node obj = new Node(Token.NAME, "obj", 0, 0);
        Node prop = new Node(Token.NAME, "CONST_PROP", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, prop, 0, 0);

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.annotateConstantsByConvention(prop, getProp);

        assertTrue(prop.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNormalize_normalizeFunctionDeclaration() throws Exception {
        setupCompiler();
        Node body = new Node(Token.BLOCK, 0, 0);
        Node functionDecl = createFunctionDeclaration("myFunc", body);
        Node root = createScriptNode(functionDecl);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        assertEquals(Token.VAR, root.getFirstChild().getType());
        Node nameNode = root.getFirstChild().getFirstChild();
        assertEquals("myFunc", nameNode.getString());
        Node functionExpr = nameNode.getFirstChild();
        assertEquals(Token.FUNCTION, functionExpr.getType());
        assertEquals("", functionExpr.getFirstChild().getString()); // Anonymous function
        assertEquals(body, functionExpr.getLastChild());
    }

    @Test
    public void testNormalize_normalizeFunctionExpression() throws Exception {
        setupCompiler();
        Node body = new Node(Token.BLOCK, 0, 0);
        Node functionExpr = createFunctionExpression("myFuncExpr", body);
        Node exprResult = createExprStatement(functionExpr);
        Node root = createScriptNode(exprResult);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // Function expressions should not be rewritten.
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.FUNCTION, root.getFirstChild().getFirstChild().getType());
        assertEquals("myFuncExpr", root.getFirstChild().getFirstChild().getFirstChild().getString());
        assertEquals(body, root.getFirstChild().getFirstChild().getLastChild());
    }

    @Test
    public void testNormalize_normalizeHoistedFunctionDeclaration() throws Exception {
        setupCompiler();
        Node body = new Node(Token.BLOCK, 0, 0);
        Node functionDecl = createFunctionDeclaration("hoistedFunc", body);
        // Simulate a hoisted function declaration (e.g., directly in script)
        Node root = createScriptNode(functionDecl);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // Hoisted function declarations should not be rewritten by normalizeFunctionDeclaration.
        assertEquals(Token.FUNCTION, root.getFirstChild().getType());
        assertEquals("hoistedFunc", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testNormalizeStatements_splitVarDeclarations() throws Exception {
        setupCompiler();
        Node root = createScriptNode(
            new Node(Token.VAR,
                new Node(Token.NAME, "a", 0, 0),
                new Node(Token.NAME, "b", 0, 0),
                new Node(Token.NAME, "c", 0, 0), 0, 0)
        );
        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.splitVarDeclarations(root);

        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("a", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.VAR, root.getFirstChild().getNext().getType());
        assertEquals("b", root.getFirstChild().getNext().getFirstChild().getString());
        assertEquals(Token.VAR, root.getFirstChild().getNext().getNext().getType());
        assertEquals("c", root.getFirstChild().getNext().getNext().getFirstChild().getString());
    }

     @Test
    public void testNormalizeStatements_splitVarDeclarations_withInit() throws Exception {
        setupCompiler();
        Node varNode = new Node(Token.VAR,
            new Node(Token.NAME, "a", new Node(Token.NUMBER, 1, 0, 0), 0, 0),
            new Node(Token.NAME, "b", new Node(Token.NUMBER, 2, 0, 0), 0, 0),
            new Node(Token.NAME, "c", 0, 0), 0, 0);
        Node root = createScriptNode(varNode);

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.splitVarDeclarations(root);

        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("a", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals(1.0, root.getFirstChild().getFirstChild().getFirstChild().getDouble(), 0.0);

        assertEquals(Token.VAR, root.getFirstChild().getNext().getType());
        assertEquals("b", root.getFirstChild().getNext().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getFirstChild().getNext().getFirstChild().getFirstChild().getType());
        assertEquals(2.0, root.getFirstChild().getNext().getFirstChild().getFirstChild().getDouble(), 0.0);

        assertEquals(Token.VAR, root.getFirstChild().getNext().getNext().getType());
        assertEquals("c", root.getFirstChild().getNext().getNext().getFirstChild().getString());
        assertNull(root.getFirstChild().getNext().getNext().getFirstChild().getFirstChild()); // No init for c
    }

    @Test
    public void testNormalizeStatements_moveNamedFunctions() throws Exception {
        setupCompiler();
        Node fn1Body = new Node(Token.BLOCK, createExprStatement(new Node(Token.STRING, "fn1", 0, 0)), 0, 0);
        Node fn1 = createFunctionDeclaration("func1", fn1Body);

        Node stmt = createExprStatement(new Node(Token.STRING, "statement", 0, 0));

        Node fn2Body = new Node(Token.BLOCK, createExprStatement(new Node(Token.STRING, "fn2", 0, 0)), 0, 0);
        Node fn2 = createFunctionDeclaration("func2", fn2Body);

        Node functionScopeBody = new Node(Token.BLOCK, fn1, stmt, fn2, 0, 0);
        Node functionDecl = createFunctionDeclaration("outer", functionScopeBody);
        Node root = createScriptNode(functionDecl);

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.moveNamedFunctions(functionScopeBody); // Operate on the function's body

        // func1 should be moved to the front (becomes VAR func1 = function...())
        assertEquals(Token.VAR, functionScopeBody.getFirstChild().getType());
        assertEquals("func1", functionScopeBody.getFirstChild().getFirstChild().getString());
        // statement should be next
        assertEquals(Token.EXPR_RESULT, functionScopeBody.getFirstChild().getNext().getType());
        assertEquals("statement", functionScopeBody.getFirstChild().getNext().getFirstChild().getString());
        // func2 should be moved after statement
        assertEquals(Token.VAR, functionScopeBody.getFirstChild().getNext().getNext().getType());
        assertEquals("func2", functionScopeBody.getFirstChild().getNext().getNext().getFirstChild().getString());
    }

    @Test
    public void testNormalizeStatements_addToFront() throws Exception {
        setupCompiler();
        Node parent = new Node(Token.BLOCK, new Node(Token.STRING, "existing", 0, 0), 0, 0);
        Node newChild = new Node(Token.STRING, "new", 0, 0);

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.addToFront(parent, newChild, null); // Add to front

        assertEquals("new", parent.getFirstChild().getString());
        assertEquals("existing", parent.getLastChild().getString());
    }

    @Test
    public void testNormalizeStatements_addChildAfter() throws Exception {
        setupCompiler();
        Node existingNode = new Node(Token.STRING, "existing", 0, 0);
        Node parent = new Node(Token.BLOCK, existingNode, 0, 0);
        Node newChild = new Node(Token.STRING, "new", 0, 0);

        Normalize.NormalizeStatements normalizer = new Normalize.NormalizeStatements(compiler, false);
        normalizer.addToFront(parent, newChild, existingNode); // Add after existingNode

        assertEquals("existing", parent.getFirstChild().getString());
        assertEquals("new", parent.getLastChild().getString());
    }

    @Test
    public void testPropagateConstantAnnotationsOverVars_checkUserDeclarations() throws Exception {
        setupCompiler();
        Node nameNode = new Node(Token.NAME, "MY_CONST", 0, 0);
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstant(true);
        nameNode.setJSDocInfo(jsDocInfo);

        Node varNode = createVarNode("MY_CONST", null);
        varNode.replaceChild(varNode.getFirstChild(), nameNode); // Ensure JSDoc is on the name node
        Node root = createScriptNode(varNode);

        // Mocking compiler and convention
        compiler.codingConvention = new DefaultCodingConvention();

        Normalize.VerifyConstants pass = new Normalize.VerifyConstants(compiler, true);
        pass.process(null, root);

        assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME)); // Ensure it's marked
    }

    @Test
    public void testPropagateConstantAnnotationsOverVars_checkUserDeclarations_convention() throws Exception {
        setupCompiler();
        Node nameNode = new Node(Token.NAME, "ALL_CAPS_CONST", 0, 0);
        Node varNode = createVarNode("ALL_CAPS_CONST", null);
        varNode.replaceChild(varNode.getFirstChild(), nameNode);
        Node root = createScriptNode(varNode);

        compiler.codingConvention = new DefaultCodingConvention() {
            @Override
            public boolean isConstant(String name) {
                return name.equals("ALL_CAPS_CONST");
            }
        };

        Normalize.VerifyConstants pass = new Normalize.VerifyConstants(compiler, true);
        pass.process(null, root);

        assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME)); // Ensure it's marked
    }

    @Test
    public void testPropagateConstantAnnotationsOverVars_checkUserDeclarations_notConstant() throws Exception {
        setupCompiler();
        Node nameNode = new Node(Token.NAME, "myVar", 0, 0);
        Node varNode = createVarNode("myVar", null);
        varNode.replaceChild(varNode.getFirstChild(), nameNode);
        Node root = createScriptNode(varNode);

        compiler.codingConvention = new DefaultCodingConvention();

        Normalize.VerifyConstants pass = new Normalize.VerifyConstants(compiler, true);
        pass.process(null, root);

        assertFalse(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME)); // Ensure it's not marked
    }

    @Test
    public void testOnRedeclaration_globalScope() throws Exception {
        setupCompiler();
        // Test case for duplicate global variable declaration.
        Node globalVar1 = createVarNode("globalVar", new Node(Token.NUMBER, 1, 0, 0));
        Node globalVar2 = createVarNode("globalVar", new Node(Token.NUMBER, 2, 1, 1));
        Node root = createScriptNode(globalVar1, globalVar2);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The second declaration should be converted to an assignment.
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("globalVar", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.EXPR_RESULT, root.getLastChild().getType());
        assertEquals(Token.ASSIGN, root.getLastChild().getFirstChild().getType());
        assertEquals("globalVar", root.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, root.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals(2.0, root.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testOnRedeclaration_catchScope() throws Exception {
        setupCompiler();
        Node catchVar = new Node(Token.NAME, "e", 0, 0);
        Node catchBlock = new Node(Token.BLOCK,
            createExprStatement(new Node(Token.NAME, "e", 0, 0)) // use of catch exception
        );
        Node catchNode = new Node(Token.CATCH, catchVar, catchBlock, 0, 0);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK, 0, 0), catchNode, 0, 0);
        Node root = createScriptNode(tryNode);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The process should complete without error. The specific error reporting for catch redeclaration is not tested here.
        assertEquals(Token.TRY, root.getFirstChild().getType());
        assertEquals(Token.CATCH, root.getFirstChild().getLastChild().getType());
        assertEquals("e", root.getFirstChild().getLastChild().getFirstChild().getString());
    }

    @Test
    public void testOnRedeclaration_functionScope() throws Exception {
        setupCompiler();
        Node functionBody = new Node(Token.BLOCK,
            createVarNode("localVar", new Node(Token.NUMBER, 1, 0, 0))
        );
        Node functionDecl = createFunctionDeclaration("myFunc", functionBody);
        Node root = createScriptNode(functionDecl);
        
        // Add a second declaration of localVar
        Node redeclaredVar = createVarNode("localVar", new Node(Token.NUMBER, 2, 1, 1));
        functionBody.addChildAfter(redeclaredVar, functionBody.getFirstChild());

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);
        
        // Expected: The second declaration should be replaced by an assignment.
        assertEquals(Token.VAR, functionBody.getFirstChild().getType());
        assertEquals("localVar", functionBody.getFirstChild().getFirstChild().getString());
        assertEquals(Token.ASSIGN, functionBody.getLastChild().getType());
        assertEquals("localVar", functionBody.getLastChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, functionBody.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals(2.0, functionBody.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testCreateScope_globalScope() throws Exception {
        setupCompiler();
        Node root = createScriptNode(createVarNode("globalVar", new Node(Token.NUMBER, 1, 0, 0)));
        SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
        Scope globalScope = scopeCreator.createScope(root, null);
        
        assertNotNull(globalScope);
        assertEquals(root, globalScope.getRootNode());
        assertNull(globalScope.getParent());
        assertNotNull(globalScope.getVar("globalVar"));
    }

    @Test
    public void testCreateScope_functionScope() throws Exception {
        setupCompiler();
        Node functionBody = new Node(Token.BLOCK, createVarNode("localVar", new Node(Token.NUMBER, 1, 0, 0)), 0, 0);
        Node functionDecl = createFunctionDeclaration("myFunc", functionBody);
        Node root = createScriptNode(functionDecl);

        SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
        Scope globalScope = scopeCreator.createScope(root, null);
        Scope funcScope = scopeCreator.createScope(functionDecl, globalScope); // Pass globalScope as parent

        assertNotNull(funcScope);
        assertEquals(functionDecl, funcScope.getRootNode());
        assertEquals(globalScope, funcScope.getParent());
        assertNotNull(funcScope.getVar("localVar"));
    }

    @Test
    public void testEnterScope_exitScope() throws Exception {
        setupCompiler();
        Node functionBody = new Node(Token.BLOCK, 0, 0);
        Node functionDecl = createFunctionDeclaration("myFunc", functionBody);
        Node root = createScriptNode(functionDecl);

        // MockNodeTraversal simulates enter/exit scope
        Normalize.ScopeTicklingCallback callback = new Normalize.ScopeTicklingCallback();
        // Pass the root node to the MockNodeTraversal constructor
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, callback, root); 
        
        // Manually set up initial scope for traversal
        traversal.currentScope = new Scope(root, compiler); 
        
        traversal.traverse();
        assertTrue(true); // If it reaches here without exceptions, it's good.
    }
    
    @Test
    public void testRemoveDuplicateDeclarations_noDuplicates() throws Exception {
        setupCompiler();
        Node root = createScriptNode(
            createVarNode("var1", null),
            createVarNode("var2", null)
        );

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // No changes expected
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("var1", root.getFirstChild().getFirstChild().getString());
        assertEquals(Token.VAR, root.getLastChild().getType());
        assertEquals("var2", root.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testRemoveDuplicateDeclarations_functionScopeRedeclaration() throws Exception {
        setupCompiler();
        Node functionBody = new Node(Token.BLOCK,
            createVarNode("funcVar", new Node(Token.NUMBER, 1, 0, 0))
        );
        Node functionDecl = createFunctionDeclaration("myFunc", functionBody);
        Node root = createScriptNode(functionDecl);
        
        // Add a second declaration of funcVar
        Node redeclaredVar = createVarNode("funcVar", new Node(Token.NUMBER, 2, 1, 1));
        functionBody.addChildAfter(redeclaredVar, functionBody.getFirstChild());

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The second declaration should be replaced by an assignment.
        assertEquals(Token.VAR, functionBody.getFirstChild().getType());
        assertEquals("funcVar", functionBody.getFirstChild().getFirstChild().getString());
        assertEquals(Token.ASSIGN, functionBody.getLastChild().getType());
        assertEquals("funcVar", functionBody.getLastChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, functionBody.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals(2.0, functionBody.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testRemoveDuplicateDeclarations_argumentsShadowing() throws Exception {
        setupCompiler();
        Node functionBody = new Node(Token.BLOCK,
            createVarNode("arguments", new Node(Token.NUMBER, 1, 0, 0)) // Shadowing "arguments"
        );
        Node functionDecl = createFunctionDeclaration("shadowArgs", functionBody);
        Node root = createScriptNode(functionDecl);

        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.process(null, root);

        // The redeclaration handler should convert "var arguments" to an assignment.
        assertEquals(Token.FUNCTION, root.getFirstChild().getType());
        Node body = root.getFirstChild().getLastChild();
        assertEquals(Token.BLOCK, body.getType());
        assertEquals(Token.ASSIGN, body.getFirstChild().getType());
        assertEquals("arguments", body.getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, body.getFirstChild().getFirstChild().getLastChild().getType());
        assertEquals(1.0, body.getFirstChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }
}
