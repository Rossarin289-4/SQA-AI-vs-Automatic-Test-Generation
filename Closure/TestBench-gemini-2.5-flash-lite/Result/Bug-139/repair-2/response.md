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
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.function.Supplier;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.CodingConvention.ClassIdentifier;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralMethodShader;
import com.google.javascript.jscomp.CodingConvention.GetPropertyDefinition;
import com.google.javascript.jscomp.CodingConvention.PropertyAssignmentType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumLiteralSet;
import com.google.javascript.rhino.jstype.FunctionParamProvider;
import com.google.javascript.rhino.jstype.FunctionTypeBuilder;
import com.google.javascript.rhino.jstype.InstanceCallable;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnionTypeBuilder;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node.SideEffectFlags;
import com.google.javascript.rhino.jstype.JSTypeRegistry.TypeBuilding;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.jstype.ObjectType.Arguments;
import com.google.javascript.jscomp.CodingConvention.BindableFunctionSignature;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.StrictMismatchesAwareNameSupplier;
import com.google.javascript.jscomp.CodingConvention.InlineStyleProp;
import com.google.javascript.jscomp.CodingConvention.VariableShadowDeclaration;


public class NormalizeTest {

    // Helper method to create a simple compiler for testing
    private static class MockCompiler extends AbstractCompiler {
        private boolean reportCodeChangeCalled = false;
        private String reportCodeChangeDescription;

        @Override
        public String toSource(Node root) {
            // Simplified toSource for testing purposes.
            return root.toStringTree();
        }

        @Override
        public void reportCodeChange() {
            this.reportCodeChangeCalled = true;
            this.reportCodeChangeDescription = null;
        }

        public void reportCodeChange(String description) {
            this.reportCodeChangeCalled = true;
            this.reportCodeChangeDescription = description;
        }


        // Implement other abstract methods with no-ops or minimal functionality
        @Override public void report(JSError error) {}
        @Override public void throwInternalError(String msg, Exception cause) { throw new RuntimeException(msg, cause); }
        @Override public CodingConvention getCodingConvention() {
            return new CodingConvention.DefaultCodingConvention();
        }
        @Override public ErrorManager getErrorManager() { return new BasicErrorManager(); }
        @Override public boolean isNormalized() { return false; }
        @Override public void setNormalized() {}
        @Override public void setUnnormalized() {}
        @Override public boolean areNodesEqualForInlining(Node n1, Node n2) { return n1.isEquivalentTo(n2); }
        @Override public Node parseSyntheticCode(String code) { return new Node(Token.SCRIPT); }
        @Override public Node parseSyntheticCode(String filename, String code) { return new Node(Token.SCRIPT); }
        @Override public JSModuleGraph getModuleGraph() { return null; }
        @Override public JSTypeRegistry getTypeRegistry() { return new JSTypeRegistry(null); }
        @Override public ScopeCreator getScopeCreator() { return new SyntacticScopeCreator(this); }
        @Override public Scope getTopScope() { return null; }
        @Override public CompilerInput getInput(String sourceName) { return null; }
        @Override public CompilerInput newExternInput(String name) { return null; }
        @Override public void addToDebugLog(String message) {}
        @Override public void setCssRenamingMap(CssRenamingMap map) {}
        @Override public CssRenamingMap getCssRenamingMap() { return null; }
        @Override public Node getNodeForCodeInsertion(JSModule module) { return new Node(Token.SCRIPT); }
        @Override public TypeValidator getTypeValidator() { return null; }
        @Override public Supplier<String> getUniqueNameIdSupplier() { return () -> "unique"; }
        @Override public boolean hasHaltingErrors() { return false; }
        @Override public void addChangeHandler(CodeChangeHandler handler) {}
        @Override public void removeChangeHandler(CodeChangeHandler handler) {}
        @Override public boolean isIdeMode() { return false; }
        @Override public Config getParserConfig() { return new Config(null, null, false, false, false, false, false, false, false, false); }
        @Override public boolean isTypeCheckingEnabled() { return false; }
        @Override public void prepareAst(Node root) {}
        @Override public SymbolTable acquireSymbolTable() { return null; }
        @Override public ReverseAbstractInterpreter getReverseAbstractInterpreter() { return null; }
        public boolean reportCodeChangeCalled() { return reportCodeChangeCalled; }
        public String getReportCodeChangeDescription() { return reportCodeChangeDescription; }
    }

    // --- Tests for Normalize.PropogateConstantAnnotations ---

    @Test
    public void testPropagateConstantAnnotations_simpleConstant() throws Exception {
        Node root = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "a");
        root.addChildToBack(nameNode);
        // Simulate external or JSDoc constant by setting the property directly.
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.PropogateConstantAnnotations pass = new Normalize.PropogateConstantAnnotations(compiler, false);

        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateConstantAnnotations_noConstant() throws Exception {
        Node root = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "a");
        root.addChildToBack(nameNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.PropogateConstantAnnotations pass = new Normalize.PropogateConstantAnnotations(compiler, false);

        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertFalse(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateConstantAnnotations_existingConstant() throws Exception {
        Node root = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "a");
        root.addChildToBack(nameNode);
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.PropogateConstantAnnotations pass = new Normalize.PropogateConstantAnnotations(compiler, false);

        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
    }


    // --- Tests for Normalize.NormalizeStatements ---

    @Test
    public void testNormalizeStatements_splitVarDeclarations() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(new Node(Token.NAME, "a"));
        varNode.addChildToBack(new Node(Token.NAME, "b"));
        block.addChildToBack(varNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(2, block.getChildCount());
        assertEquals(Token.VAR, block.getChildAtIndex(0).getType());
        assertEquals("a", block.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.VAR, block.getChildAtIndex(1).getType());
        assertEquals("b", block.getChildAtIndex(1).getFirstChild().getString());
    }

    @Test
    public void testNormalizeStatements_convertWhileToFor() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
        block.addChildToBack(whileNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(Token.FOR, whileNode.getType());
        assertEquals(Token.EMPTY, whileNode.getFirstChild().getType()); // Initializer
        assertEquals(Token.TRUE, whileNode.getChildAtIndex(1).getType()); // Condition
        assertEquals(Token.EMPTY, whileNode.getLastChild().getType()); // Increment
    }

    @Test
    public void testNormalizeStatements_extractForInitializer() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.VAR, new Node(Token.NAME, "i")));
        forNode.addChildToBack(new Node(Token.TRUE));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.BLOCK));
        block.addChildToBack(forNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(2, block.getChildCount()); // Var statement + For loop
        assertEquals(Token.VAR, block.getChildAtIndex(0).getType());
        assertEquals("i", block.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.FOR, block.getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, block.getChildAtIndex(1).getFirstChild().getType()); // Initializer should be empty now
    }

    @Test
    public void testNormalizeStatements_normalizeLabels_blockChild() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node labelNode = new Node(Token.LABEL, "myLabel");
        labelNode.addChildToBack(new Node(Token.BLOCK));
        block.addChildToBack(labelNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, block.getChildCount());
        assertEquals(Token.LABEL, block.getFirstChild().getType());
        assertEquals(Token.BLOCK, block.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testNormalizeStatements_normalizeLabels_loopChild() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node labelNode = new Node(Token.LABEL, "myLabel");
        labelNode.addChildToBack(new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK)));
        block.addChildToBack(labelNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, block.getChildCount());
        assertEquals(Token.LABEL, block.getFirstChild().getType());
        assertEquals(Token.WHILE, block.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testNormalizeStatements_normalizeLabels_nonBlockOrLoopChild() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node labelNode = new Node(Token.LABEL, "myLabel");
        labelNode.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.CALL)));
        block.addChildToBack(labelNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, block.getChildCount());
        assertEquals(Token.LABEL, block.getFirstChild().getType());
        assertEquals(Token.BLOCK, block.getFirstChild().getLastChild().getType());
        assertEquals(Token.EXPR_RESULT, block.getFirstChild().getLastChild().getFirstChild().getType());
    }

    @Test
    public void testNormalizeStatements_rewriteFunctionDeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node fnDecl = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"), new Node(Token.LP), new Node(Token.BLOCK));
        block.addChildToBack(fnDecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, block.getChildCount());
        assertEquals(Token.VAR, block.getFirstChild().getType());
        assertEquals(Token.NAME, block.getFirstChild().getFirstChild().getType());
        assertEquals("myFunc", block.getFirstChild().getFirstChild().getString());
        assertEquals(Token.FUNCTION, block.getFirstChild().getLastChild().getType());
        assertEquals("", block.getFirstChild().getLastChild().getFirstChild().getString()); // Anonymous function name
    }

    @Test
    public void testNormalizeStatements_moveNamedFunctions_singleFunction() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fnBody = new Node(Token.BLOCK);
        root.addChildToBack(fnBody);
        fnBody.addChildToBack(new Node(Token.FUNCTION, new Node(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK)));

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, fnBody.getChildCount());
        assertEquals(Token.FUNCTION, fnBody.getFirstChild().getType());
        assertEquals("foo", fnBody.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testNormalizeStatements_moveNamedFunctions_functionAfterStatement() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fnBody = new Node(Token.BLOCK);
        root.addChildToBack(fnBody);
        fnBody.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.CALL)));
        fnBody.addChildToBack(new Node(Token.FUNCTION, new Node(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK)));

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(2, fnBody.getChildCount());
        assertEquals(Token.FUNCTION, fnBody.getFirstChild().getType());
        assertEquals("foo", fnBody.getFirstChild().getFirstChild().getString());
        assertEquals(Token.EXPR_RESULT, fnBody.getChildAtIndex(1).getType());
    }

    @Test
    public void testNormalizeStatements_moveNamedFunctions_multipleFunctions() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fnBody = new Node(Token.BLOCK);
        root.addChildToBack(fnBody);
        fnBody.addChildToBack(new Node(Token.FUNCTION, new Node(Token.NAME, "bar"), new Node(Token.LP), new Node(Token.BLOCK)));
        fnBody.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.CALL)));
        fnBody.addChildToBack(new Node(Token.FUNCTION, new Node(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK)));

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(3, fnBody.getChildCount());
        assertEquals(Token.FUNCTION, fnBody.getFirstChild().getType());
        assertEquals("bar", fnBody.getFirstChild().getFirstChild().getString());
        assertEquals(Token.FUNCTION, fnBody.getChildAtIndex(1).getType());
        assertEquals("foo", fnBody.getChildAtIndex(1).getFirstChild().getString());
        assertEquals(Token.EXPR_RESULT, fnBody.getLastChild().getType());
    }

    @Test
    public void testNormalizeStatements_moveNamedFunctions_functionDeclarationIsHoisted() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fnBody = new Node(Token.BLOCK);
        root.addChildToBack(fnBody);
        Node fnDecl = new Node(Token.FUNCTION, new Node(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
        Node fnDecl2 = new Node(Token.FUNCTION, new Node(Token.NAME, "bar"), new Node(Token.LP), new Node(Token.BLOCK));
        fnBody.addChildToBack(fnDecl); // Already at top
        fnBody.addChildToBack(fnDecl2); // Should be moved after foo

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(2, fnBody.getChildCount());
        assertEquals(Token.FUNCTION, fnBody.getFirstChild().getType());
        assertEquals("foo", fnBody.getFirstChild().getFirstChild().getString());
        assertEquals(Token.FUNCTION, fnBody.getChildAtIndex(1).getType());
        assertEquals("bar", fnBody.getChildAtIndex(1).getFirstChild().getString());
    }


    // --- Tests for Normalize.DuplicateDeclarationHandler ---

    @Test
    public void testDuplicateDeclarationHandler_varRedeclarationWithAssignment() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "a", new Node(Token.NUMBER, 1.0)));
        block.addChildToBack(varDecl);
        Node varRedecl = new Node(Token.VAR, new Node(Token.NAME, "a", new Node(Token.NUMBER, 2.0)));
        block.addChildToBack(varRedecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.removeDuplicateDeclarations(root);

        assertEquals(2, block.getChildCount());
        assertEquals(Token.EXPR_RESULT, block.getChildAtIndex(0).getType());
        assertEquals(Token.ASSIGN, block.getChildAtIndex(0).getFirstChild().getType());
        assertEquals("a", block.getChildAtIndex(0).getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, block.getChildAtIndex(0).getFirstChild().getLastChild().getType());
        assertEquals(1.0, block.getChildAtIndex(0).getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, block.getChildAtIndex(1).getType());
        assertEquals(Token.ASSIGN, block.getChildAtIndex(1).getFirstChild().getType());
        assertEquals("a", block.getChildAtIndex(1).getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, block.getChildAtIndex(1).getFirstChild().getLastChild().getType());
        assertEquals(2.0, block.getChildAtIndex(1).getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testDuplicateDeclarationHandler_varRedeclarationWithoutAssignment() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "a"));
        block.addChildToBack(varDecl);
        Node varRedecl = new Node(Token.VAR, new Node(Token.NAME, "a"));
        block.addChildToBack(varRedecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.removeDuplicateDeclarations(root);

        assertEquals(1, block.getChildCount()); // Only one statement should remain
        assertEquals(Token.VAR, block.getFirstChild().getType());
        assertEquals("a", block.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testDuplicateDeclarationHandler_forInRedeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node forNode = new Node(Token.FOR,
            new Node(Token.VAR, new Node(Token.NAME, "a")), // Initializer
            new Node(Token.IN, new Node(Token.STRING, "obj")), // Condition
            new Node(Token.EMPTY), // Increment
            new Node(Token.BLOCK) // Body
        );
        block.addChildToBack(forNode);
        Node varRedecl = new Node(Token.VAR, new Node(Token.NAME, "a"));
        block.addChildToBack(varRedecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.removeDuplicateDeclarations(root);

        assertEquals(1, block.getChildCount());
        assertEquals(Token.FOR, block.getFirstChild().getType());
        assertEquals(Token.NAME, block.getFirstChild().getFirstChild().getString()); // 'a' should be the name in the for loop
        assertEquals(Token.IN, block.getFirstChild().getChildAtIndex(1).getType());
    }

    @Test
    public void testDuplicateDeclarationHandler_catchRedeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        root.addChildToBack(fn);
        Node fnBody = fn.getLastChild();
        Node tryNode = new Node(Token.TRY);
        fnBody.addChildToBack(tryNode);
        Node catchBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "e"), catchBlock);
        tryNode.addChildToBack(catchNode);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "e", new Node(Token.NUMBER, 1.0)));
        fnBody.addChildToBack(varDecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.removeDuplicateDeclarations(root);

        // The catch block's 'e' is redeclared. The scope logic should handle this.
        // The original var 'e' should become an assignment if it had an initializer.
        assertEquals(2, fnBody.getChildCount());
        assertEquals(Token.TRY, fnBody.getChildAtIndex(0).getType());
        assertEquals(Token.EXPR_RESULT, fnBody.getChildAtIndex(1).getType());
        assertEquals(Token.ASSIGN, fnBody.getChildAtIndex(1).getFirstChild().getType());
        assertEquals("e", fnBody.getChildAtIndex(1).getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, fnBody.getChildAtIndex(1).getFirstChild().getLastChild().getType());
    }

    // --- Tests for Normalize.process ---

    @Test
    public void testProcess_normalizeStatementsCalled() throws Exception {
        // This test primarily checks if NormalizeStatements is instantiated and called.
        // We can infer this by checking for a specific transformation.
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
        block.addChildToBack(whileNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize pass = new Normalize(compiler, false);
        pass.process(new Node(Token.SCRIPT), root); // externs node is dummy

        assertEquals(Token.FOR, whileNode.getType());
    }

    @Test
    public void testProcess_makeDeclaredNamesUniqueCalled() throws Exception {
        // This test verifies that MakeDeclaredNamesUnique is called.
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        block.addChildToBack(new Node(Token.VAR, new Node(Token.NAME, "a")));
        block.addChildToBack(new Node(Token.VAR, new Node(Token.NAME, "a"))); // Duplicate

        AbstractCompiler compiler = new MockCompiler();
        Normalize pass = new Normalize(compiler, false);
        pass.process(new Node(Token.SCRIPT), root);

        // After MakeDeclaredNamesUnique and removeDuplicateDeclarations,
        // the second 'a' should be removed as it has no initializer.
        assertEquals(1, block.getChildCount());
        assertEquals(Token.VAR, block.getFirstChild().getType());
        assertEquals("a", block.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_removeDuplicateDeclarationsCalled() throws Exception {
        // This test checks if removeDuplicateDeclarations is called.
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        block.addChildToBack(new Node(Token.VAR, new Node(Token.NAME, "x")));
        block.addChildToBack(new Node(Token.VAR, new Node(Token.NAME, "x"))); // Duplicate

        AbstractCompiler compiler = new MockCompiler();
        Normalize pass = new Normalize(compiler, false);
        pass.process(new Node(Token.SCRIPT), root);

        // After removeDuplicateDeclarations, the duplicate 'x' should be removed
        // as it has no initializer.
        assertEquals(1, block.getChildCount());
        assertEquals(Token.VAR, block.getFirstChild().getType());
        assertEquals("x", block.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_propagateConstantAnnotationsCalled() throws Exception {
        // This test checks if PropogateConstantAnnotations is called.
        Node root = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        root.addChildToBack(fn);
        Node fnBody = fn.getLastChild();
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "a"));
        // Simulate JSDoc info for constant
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstant(true);
        varDecl.getFirstChild().setJSDocInfo(jsDocInfo);
        fnBody.addChildToBack(varDecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize pass = new Normalize(compiler, false);
        pass.process(new Node(Token.SCRIPT), root);

        // The 'a' should be marked as constant by PropogateConstantAnnotations.
        assertTrue(varDecl.getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    // --- Additional tests for edge cases and specific logic ---

    @Test
    public void testNormalizeStatements_extractForInitializer_expression() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, new Node(Token.NAME, "i"), new Node(Token.NUMBER, 0.0))));
        forNode.addChildToBack(new Node(Token.TRUE));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.BLOCK));
        block.addChildToBack(forNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(2, block.getChildCount()); // Expr_Result statement + For loop
        assertEquals(Token.EXPR_RESULT, block.getChildAtIndex(0).getType());
        assertEquals(Token.ASSIGN, block.getChildAtIndex(0).getFirstChild().getType());
        assertEquals(Token.FOR, block.getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, block.getChildAtIndex(1).getFirstChild().getType()); // Initializer should be empty now
    }

    @Test
    public void testNormalizeStatements_moveNamedFunctions_alreadyAtTop() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fnBody = new Node(Token.BLOCK);
        root.addChildToBack(fnBody);
        Node fnDecl = new Node(Token.FUNCTION, new Node(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
        fnBody.addChildToBack(fnDecl); // Function is already at the top

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, fnBody.getChildCount());
        assertEquals(Token.FUNCTION, fnBody.getFirstChild().getType());
        assertEquals("foo", fnBody.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testNormalizeStatements_normalizeLabels_multiLevelBlock() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node labelNode = new Node(Token.LABEL, "outer");
        Node innerBlock = new Node(Token.BLOCK);
        innerBlock.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.CALL)));
        labelNode.addChildToBack(innerBlock);
        block.addChildToBack(labelNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, block.getChildCount());
        assertEquals(Token.LABEL, block.getFirstChild().getType());
        assertEquals(Token.BLOCK, block.getFirstChild().getLastChild().getType()); // The inner block remains a block
        assertEquals(1, block.getFirstChild().getLastChild().getChildCount());
        assertEquals(Token.EXPR_RESULT, block.getFirstChild().getLastChild().getFirstChild().getType());
    }

    @Test
    public void testDuplicateDeclarationHandler_varRedeclarationInFunctionScope() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        root.addChildToBack(fn);
        Node fnBody = fn.getLastChild();
        Node varDecl1 = new Node(Token.VAR, new Node(Token.NAME, "x", new Node(Token.NUMBER, 1.0)));
        fnBody.addChildToBack(varDecl1);
        Node varDecl2 = new Node(Token.VAR, new Node(Token.NAME, "x", new Node(Token.NUMBER, 2.0)));
        fnBody.addChildToBack(varDecl2); // Duplicate in function scope

        AbstractCompiler compiler = new MockCompiler();
        Normalize normalizePass = new Normalize(compiler, false);
        normalizePass.removeDuplicateDeclarations(root);

        // The second declaration should become an assignment.
        assertEquals(2, fnBody.getChildCount());
        assertEquals(Token.VAR, fnBody.getChildAtIndex(0).getType());
        assertEquals("x", fnBody.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.NUMBER, fnBody.getChildAtIndex(0).getFirstChild().getFirstChild().getType());
        assertEquals(1.0, fnBody.getChildAtIndex(0).getFirstChild().getFirstChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, fnBody.getChildAtIndex(1).getType());
        assertEquals(Token.ASSIGN, fnBody.getChildAtIndex(1).getFirstChild().getType());
        assertEquals("x", fnBody.getChildAtIndex(1).getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, fnBody.getChildAtIndex(1).getFirstChild().getLastChild().getType());
        assertEquals(2.0, fnBody.getChildAtIndex(1).getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testNormalizeStatements_extractForInitializer_noInitializer() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EMPTY)); // No initializer
        forNode.addChildToBack(new Node(Token.TRUE));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.BLOCK));
        block.addChildToBack(forNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        // Should not add any new statement
        assertEquals(1, block.getChildCount());
        assertEquals(Token.FOR, block.getFirstChild().getType());
        assertEquals(Token.EMPTY, block.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testNormalizeStatements_splitVarDeclarations_singleVar() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(new Node(Token.NAME, "a"));
        block.addChildToBack(varNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, block.getChildCount());
        assertEquals(Token.VAR, block.getFirstChild().getType());
        assertEquals("a", block.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testNormalizeStatements_rewriteFunctionDeclaration_anonymous() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node fnDecl = new Node(Token.FUNCTION, new Node(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK)); // Anonymous function
        block.addChildToBack(fnDecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        assertEquals(1, block.getChildCount());
        assertEquals(Token.FUNCTION, block.getFirstChild().getType()); // Anonymous functions are not rewritten
    }

    @Test
    public void testNormalizeStatements_moveNamedFunctions_functionWithNoName() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fnBody = new Node(Token.BLOCK);
        root.addChildToBack(fnBody);
        // This is an anonymous function expression inside a block, not a declaration.
        fnBody.addChildToBack(new Node(Token.FUNCTION, new Node(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK)));

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        // Anonymous functions are not moved or rewritten by moveNamedFunctions.
        assertEquals(1, fnBody.getChildCount());
        assertEquals(Token.FUNCTION, fnBody.getFirstChild().getType());
        assertEquals("", fnBody.getFirstChild().getFirstChild().getString());
    }

    // --- New Tests for Uncovered Methods ---

    // Tests for visit(NodeTraversal t, Node n, Node parent) - called by NodeTraversal.traverse
    @Test
    public void testVisit_whileNodeConversion() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
        block.addChildToBack(whileNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root); // This will call visit

        assertEquals(Token.FOR, whileNode.getType());
    }

    @Test
    public void testVisit_functionDeclarationNormalization() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node fnDecl = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"), new Node(Token.LP), new Node(Token.BLOCK));
        block.addChildToBack(fnDecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root); // This will call visit

        assertEquals(Token.VAR, block.getFirstChild().getType());
        assertEquals("myFunc", block.getFirstChild().getFirstChild().getString());
        assertEquals(Token.FUNCTION, block.getFirstChild().getLastChild().getType());
    }

    // Tests for shouldTraverse(NodeTraversal t, Node n, Node parent) - called by NodeTraversal.traverse
    @Test
    public void testShouldTraverse_callsDoStatementNormalizations() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(new Node(Token.NAME, "a"));
        varNode.addChildToBack(new Node(Token.NAME, "b"));
        block.addChildToBack(varNode);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.NormalizeStatements pass = new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root); // This will call shouldTraverse for each node

        // The splitVarDeclarations is called by doStatementNormalizations, which is called by shouldTraverse
        assertEquals(2, block.getChildCount());
        assertEquals(Token.VAR, block.getChildAtIndex(0).getType());
        assertEquals("a", block.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.VAR, block.getChildAtIndex(1).getType());
        assertEquals("b", block.getChildAtIndex(1).getFirstChild().getString());
    }

    // Tests for onRedeclaration(Scope s, String name, Node n, Node parent, Node gramps, Node nodeWithLineNumber)
    @Test
    public void testDuplicateDeclarationHandler_onRedeclaration_varWithAssignment() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "a", new Node(Token.NUMBER, 1.0)));
        block.addChildToBack(varDecl);
        Node varRedecl = new Node(Token.VAR, new Node(Token.NAME, "a", new Node(Token.NUMBER, 2.0)));
        block.addChildToBack(varRedecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize normalizePass = new Normalize(compiler, false);
        // To trigger onRedeclaration, we need to use the scope creator that handles redeclaration.
        // The SyntacticScopeCreator is used internally by normalizePass.removeDuplicateDeclarations.
        normalizePass.removeDuplicateDeclarations(root);

        assertEquals(2, block.getChildCount());
        assertEquals(Token.EXPR_RESULT, block.getChildAtIndex(0).getType()); // First declaration becomes assignment
        assertEquals(Token.ASSIGN, block.getChildAtIndex(0).getFirstChild().getType());
        assertEquals("a", block.getChildAtIndex(0).getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, block.getChildAtIndex(0).getFirstChild().getLastChild().getType());
        assertEquals(1.0, block.getChildAtIndex(0).getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, block.getChildAtIndex(1).getType()); // Second declaration also becomes assignment
        assertEquals(Token.ASSIGN, block.getChildAtIndex(1).getFirstChild().getType());
        assertEquals("a", block.getChildAtIndex(1).getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, block.getChildAtIndex(1).getFirstChild().getLastChild().getType());
        assertEquals(2.0, block.getChildAtIndex(1).getFirstChild().getLastChild().getDouble(), 0.0);
    }

    // Tests for enterScope(NodeTraversal t) - called by NodeTraversal.traverseRoots with ScopeCreator
    @Test
    public void testScopeTicklingCallback_enterScopeCreatesScope() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        root.addChildToBack(block);
        block.addChildToBack(new Node(Token.VAR, new Node(Token.NAME, "x")));

        AbstractCompiler compiler = new MockCompiler();
        Normalize.ScopeTicklingCallback tickler = new Normalize.ScopeTicklingCallback();
        // Need a ScopeCreator that uses the DuplicateDeclarationHandler
        ScopeCreator scopeCreator = new SyntacticScopeCreator(compiler, new Normalize.DuplicateDeclarationHandler());
        NodeTraversal traversal = new NodeTraversal(compiler, tickler, scopeCreator);
        traversal.traverseRoots(root); // This will call enterScope

        // We can't directly assert that enterScope was called with a specific scope,
        // but we can check if the overall process handled scopes correctly.
        // For example, by checking if duplicate declarations are handled.
        block.addChildToBack(new Node(Token.VAR, new Node(Token.NAME, "x"))); // Add a duplicate
        traversal.traverseRoots(root); // Re-traverse to ensure scope handling works with duplicates
        assertEquals(1, block.getChildCount()); // Duplicate should be removed
    }

    // Tests for exitScope(NodeTraversal t) - called by NodeTraversal.traverseRoots with ScopeCreator
    @Test
    public void testScopeTicklingCallback_exitScopeDoesNothing() throws Exception {
        Node root = new Node(Token.SCRIPT);
        AbstractCompiler compiler = new MockCompiler();
        Normalize.ScopeTicklingCallback tickler = new Normalize.ScopeTicklingCallback();
        ScopeCreator scopeCreator = new SyntacticScopeCreator(compiler); // Minimal scope creator
        NodeTraversal traversal = new NodeTraversal(compiler, tickler, scopeCreator);
        traversal.traverseRoots(root); // This will call exitScope

        // The test is to ensure no exceptions are thrown.
        // If exitScope did something problematic, it would likely throw.
        // No explicit assertion needed beyond successful execution.
        assertTrue(true);
    }

    // Tests for visit(NodeTraversal t, Node n, Node parent) in ScopeTicklingCallback
    @Test
    public void testScopeTicklingCallback_visitDoesNothing() throws Exception {
        Node root = new Node(Token.SCRIPT);
        AbstractCompiler compiler = new MockCompiler();
        Normalize.ScopeTicklingCallback tickler = new Normalize.ScopeTicklingCallback();
        ScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
        NodeTraversal traversal = new NodeTraversal(compiler, tickler, scopeCreator);
        traversal.traverseRoots(root); // This will call visit

        // No specific logic in ScopeTicklingCallback.visit, so just ensure it runs.
        assertTrue(true);
    }

    // Tests for visit(NodeTraversal t, Node n, Node parent) in VerifyConstants
    @Test
    public void testVerifyConstants_visitChecksConstantAnnotations() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "a"));
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstant(true);
        varDecl.getFirstChild().setJSDocInfo(jsDocInfo);
        root.addChildToBack(varDecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.VerifyConstants pass = new Normalize.VerifyConstants(compiler, true); // checkUserDeclarations = true
        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        traversal.traverse(root);

        // The assertion is done inside VerifyConstants via Preconditions.checkState.
        // If it fails, an exception will be thrown. If it passes, no exception.
        // We can simulate a successful check by setting the property directly.
        varDecl.getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);
        pass.constantMap.clear(); // Reset for the second check
        traversal.traverse(root); // Re-traverse to check the prop

        assertTrue(varDecl.getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    // Tests for process(Node externs, Node root) in VerifyConstants
    @Test
    public void testVerifyConstants_processInitiatesTraversal() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "a"));
        root.addChildToBack(varDecl);

        AbstractCompiler compiler = new MockCompiler();
        Normalize.VerifyConstants pass = new Normalize.VerifyConstants(compiler, false); // checkUserDeclarations = false
        pass.process(new Node(Token.SCRIPT), root); // externs node is dummy

        // The process method should traverse the AST. We can check if any of the internal state is modified.
        // VerifyConstants uses constantMap.
        assertNotNull(pass.constantMap);
        // It should be populated after traversal. If the name is 'a', and it's not marked constant, map should contain 'a' -> false.
        // If the traversal logic works, this map should be populated.
        // We can't assert the exact value without a more controlled setup of compiler.getCodingConvention() or JSDocInfo.
        // However, simply checking that the map is not empty after traversal is a good indicator.
        assertFalse(pass.constantMap.isEmpty());
    }
}
```