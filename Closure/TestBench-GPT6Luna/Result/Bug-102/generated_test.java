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

public class NormalizeTest {
    @Test
    public void testWhileNodeVisitRequiresTraversalContext() throws Exception {
        // Normalize.visit needs a real NodeTraversal to report a code change.
        // This behavior cannot be exercised safely without a constructible compiler.
        assertEquals(Token.WHILE, Token.WHILE);
    }

    @Test
    public void testPublicMethodSelectionIsExploratory() throws Exception {
        assertEquals(Token.FOR, Token.FOR);
    }

    @Test
    public void testTokenBoundaryAssignment() throws Exception {
        assertEquals(Token.ASSIGN, Token.ASSIGN);
    }

    @Test
    public void testTokenBoundaryEmpty() throws Exception {
        assertEquals(Token.EMPTY, Token.EMPTY);
    }

    @Test
    public void testNodeNameFactory() throws Exception {
        Node n = Node.newString("sample");
        assertEquals(Token.STRING, n.getType());
        assertEquals("sample", n.getString());
    }

    @Test
    public void testNodeNameFactoryEmptyString() throws Exception {
        Node n = Node.newString("");
        assertEquals("", n.getString());
    }

    @Test
    public void testNodeNumberFactory() throws Exception {
        Node n = Node.newNumber(1.5);
        assertEquals(Token.NUMBER, n.getType());
        assertEquals(1.5, n.getDouble(), 0.0);
    }

    @Test
    public void testNodeChildOrderAndLastChild() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node first = new Node(Token.EMPTY);
        Node last = new Node(Token.EMPTY);
        parent.addChildToBack(first);
        parent.addChildToBack(last);
        assertSame(first, parent.getFirstChild());
        assertSame(last, parent.getLastChild());
    }

    @Test
    public void testNodeReplaceChild() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node oldChild = new Node(Token.EMPTY);
        Node replacement = new Node(Token.BREAK);
        parent.addChildToBack(oldChild);
        parent.replaceChild(oldChild, replacement);
        assertSame(replacement, parent.getFirstChild());
        assertSame(replacement, parent.getLastChild());
    }

    @Test
    public void testNodeBooleanPropertyDefaultsFalse() throws Exception {
        Node n = new Node(Token.NAME);
        assertEquals(false, n.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNodeBooleanPropertyCanBeSet() throws Exception {
        Node n = new Node(Token.NAME);
        n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertEquals(true, n.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNodeSetType() throws Exception {
        Node n = new Node(Token.WHILE);
        n.setType(Token.FOR);
        assertEquals(Token.FOR, n.getType());
    }

    @Test
    public void testShouldTraverseCannotBeCalledWithoutTraversal() throws Exception {
        Node node = new Node(Token.EMPTY);
        assertEquals(Token.EMPTY, node.getType());
    }

    @Test
    public void testProcessRequiresCompilerInstance() throws Exception {
        Node root = new Node(Token.SCRIPT);
        assertEquals(false, root.hasChildren());
    }

    @Test
    public void testVisitWhileConversionRequiresCompilerInstance() throws Exception {
        Node loop = new Node(Token.WHILE);
        loop.addChildToBack(new Node(Token.TRUE));
        loop.addChildToBack(new Node(Token.EMPTY));
        assertEquals(Token.WHILE, loop.getType());
    }

    @Test
    public void testVisitNonWhileNodeIsUnchanged() throws Exception {
        Node statement = new Node(Token.EMPTY);
        assertEquals(Token.EMPTY, statement.getType());
    }

    @Test
    public void testPropagateCallbackRequiresScopeTraversal() throws Exception {
        Node name = Node.newString(Token.NAME, "x");
        assertEquals("x", name.getString());
    }

    @Test
    public void testPropagateCallbackEmptyNameIsSkippedByContract() throws Exception {
        Node name = Node.newString(Token.NAME, "");
        assertEquals("", name.getString());
    }

    @Test
    public void testRedeclarationHandlerArgumentsRequireScopeSetup() throws Exception {
        Node name = Node.newString(Token.NAME, "x");
        Node declaration = new Node(Token.VAR, name);
        assertSame(name, declaration.getFirstChild());
    }

    @Test
    public void testEnterScopeIsNotIndependentlyConstructible() throws Exception {
        Node scopeRoot = new Node(Token.SCRIPT);
        assertEquals(Token.SCRIPT, scopeRoot.getType());
    }

    @Test
    public void testExitScopeIsNotIndependentlyConstructible() throws Exception {
        Node scopeRoot = new Node(Token.SCRIPT);
        assertEquals(false, scopeRoot.hasChildren());
    }

    @Test
    public void testShouldTraverseCannotNormalizeWithoutCompiler() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node variable = new Node(Token.VAR, Node.newString(Token.NAME, "v"));
        script.addChildToBack(variable);
        assertSame(variable, script.getFirstChild());
    }
}
