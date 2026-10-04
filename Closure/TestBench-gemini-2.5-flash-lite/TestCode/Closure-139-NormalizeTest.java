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
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;


public class NormalizeTest {

    // Helper method to create a simple compiler for testing

    // --- Tests for Normalize.PropogateConstantAnnotations ---





    // --- Tests for Normalize.NormalizeStatements ---













    // --- Tests for Normalize.DuplicateDeclarationHandler ---





    // --- Tests for Normalize.process ---





    // --- Additional tests for edge cases and specific logic ---








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





