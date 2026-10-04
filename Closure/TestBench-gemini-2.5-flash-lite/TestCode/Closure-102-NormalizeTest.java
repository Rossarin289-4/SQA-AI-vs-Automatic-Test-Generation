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


public class NormalizeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a compiler instance for testing

    // Helper method to parse code into a Node

    // Mock Compiler class for testing purposes

    // Mock ErrorReporter

    // Mock ErrorManager

    // Mock CompilerInput


































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





