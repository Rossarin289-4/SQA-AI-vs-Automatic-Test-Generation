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
    public void testPropagateAnnotationOnConstantName() throws Exception {
        Compiler compiler = new Compiler();
        Node externs = new Node(Token.SCRIPT);
        Node name = Node.newString(Token.NAME, "CONST_X");
        name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node root = new Node(Token.SCRIPT, new Node(Token.VAR, name));

        new Normalize.PropogateConstantAnnotations(compiler, false)
                .process(externs, root);

        assertTrue(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateLeavesUnannotatedNameAlone() throws Exception {
        Compiler compiler = new Compiler();
        Node externs = new Node(Token.SCRIPT);
        Node name = Node.newString(Token.NAME, "plain");
        Node root = new Node(Token.SCRIPT, new Node(Token.VAR, name));

        new Normalize.PropogateConstantAnnotations(compiler, false)
                .process(externs, root);

        assertFalse(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateIgnoresEmptyName() throws Exception {
        Compiler compiler = new Compiler();
        Node externs = new Node(Token.SCRIPT);
        Node name = Node.newString(Token.NAME, "");
        Node root = new Node(Token.SCRIPT, new Node(Token.EXPR_RESULT, name));

        new Normalize.PropogateConstantAnnotations(compiler, false)
                .process(externs, root);

        assertFalse(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testVerifyRejectsMissingAnnotationForConstantName() throws Exception {
        Compiler compiler = new Compiler();
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT, Node.newString(Token.NAME, "CONST_X"));
        Node both = new Node(Token.BLOCK, externs, root);

        try {
            new Normalize.VerifyConstants(compiler, true).process(externs, root);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(Token.NAME, root.getFirstChild().getType());
        }
    }

    @Test
    public void testVerifyAcceptsMatchingConstantAnnotation() throws Exception {
        Compiler compiler = new Compiler();
        Node externs = new Node(Token.SCRIPT);
        Node name = Node.newString(Token.NAME, "CONST_X");
        name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node root = new Node(Token.SCRIPT, name);
        Node both = new Node(Token.BLOCK, externs, root);

        new Normalize.VerifyConstants(compiler, false).process(externs, root);

        assertTrue(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testVerifyRejectsInconsistentRepeatedName() throws Exception {
        Compiler compiler = new Compiler();
        Node externs = new Node(Token.SCRIPT);
        Node first = Node.newString(Token.NAME, "item");
        Node second = Node.newString(Token.NAME, "item");
        second.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node root = new Node(Token.SCRIPT,
                new Node(Token.EXPR_RESULT, first),
                new Node(Token.EXPR_RESULT, second));
        Node both = new Node(Token.BLOCK, externs, root);

        try {
            new Normalize.VerifyConstants(compiler, false).process(externs, root);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertFalse(first.getBooleanProp(Node.IS_CONSTANT_NAME));
        }
    }

    @Test
    public void testNormalizeSplitsTwoVariableDeclarations() throws Exception {
        Compiler compiler = new Compiler();
        Node externs = new Node(Token.SCRIPT);
        Node first = Node.newString(Token.NAME, "a");
        Node second = Node.newString(Token.NAME, "b");
        Node root = new Node(Token.SCRIPT, new Node(Token.VAR, first, second));

        new Normalize(compiler, false).process(externs, root);

        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals(Token.VAR, root.getFirstChild().getNext().getType());
        assertEquals(1, root.getFirstChild().getChildCount());
    }

    @Test
    public void testWhileBecomesForWithEmptyInitializerAndIncrement() throws Exception {
        Compiler compiler = new Compiler();
        Node condition = Node.newString(Token.NAME, "condition");
        Node body = new Node(Token.BLOCK);
        Node loop = new Node(Token.WHILE, condition, body);
        Node root = new Node(Token.SCRIPT, loop);

        new Normalize(compiler, false).process(new Node(Token.SCRIPT), root);

        assertEquals(Token.FOR, loop.getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getType());
        assertSame(condition, loop.getFirstChild().getNext());
        assertEquals(Token.EMPTY, loop.getLastChild().getType());
    }

    @Test
    public void testForInitializerMovedBeforeLoop() throws Exception {
        Compiler compiler = new Compiler();
        Node initializer = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
        Node loop = new Node(Token.FOR, initializer,
                Node.newString(Token.TRUE, "true"), new Node(Token.EMPTY),
                new Node(Token.BLOCK));
        Node root = new Node(Token.SCRIPT, loop);

        new Normalize(compiler, false).process(new Node(Token.SCRIPT), root);

        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getType());
    }

    @Test
    public void testLabelWrapsNonLoopStatementInBlock() throws Exception {
        Compiler compiler = new Compiler();
        Node statement = new Node(Token.EXPR_RESULT,
                Node.newString(Token.NAME, "x"));
        Node label = new Node(Token.LABEL,
                Node.newString(Token.NAME, "tag"), statement);
        Node root = new Node(Token.SCRIPT, label);

        new Normalize(compiler, false).process(new Node(Token.SCRIPT), root);

        assertEquals(Token.BLOCK, label.getLastChild().getType());
        assertSame(statement, label.getLastChild().getFirstChild());
    }

    @Test
    public void testHoistedFunctionRemainsFunctionDeclaration() throws Exception {
        Compiler compiler = new Compiler();
        Node function = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        Node root = new Node(Token.SCRIPT, function);

        new Normalize(compiler, false).process(new Node(Token.SCRIPT), root);

        assertSame(function, root.getFirstChild());
        assertEquals(Token.FUNCTION, function.getType());
    }

    @Test
    public void testEmptyVarRemainsOneStatementWhenNotAsserting() throws Exception {
        Compiler compiler = new Compiler();
        Node declaration = new Node(Token.VAR);
        Node root = new Node(Token.SCRIPT, declaration);

        new Normalize(compiler, false).process(new Node(Token.SCRIPT), root);

        assertSame(declaration, root.getFirstChild());
        assertEquals(Token.VAR, declaration.getType());
    }

    @Test
    public void testShouldTraverseReturnsTrueForScript() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, false);
        Node script = new Node(Token.SCRIPT);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);

        assertTrue(callback.shouldTraverse(traversal, script, null));
    }

    @Test
    public void testShouldTraverseReturnsTrueForName() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, false);
        Node name = Node.newString(Token.NAME, "v");
        Node parent = new Node(Token.EXPR_RESULT, name);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);

        assertTrue(callback.shouldTraverse(traversal, name, parent));
    }

    @Test
    public void testVisitDoesNotChangeNonWhileNode() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, false);
        Node name = Node.newString(Token.NAME, "v");
        Node parent = new Node(Token.EXPR_RESULT, name);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);

        callback.visit(traversal, name, parent);

        assertEquals(Token.NAME, name.getType());
    }

    @Test
    public void testVisitConvertsWhileToFor() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, false);
        Node condition = Node.newString(Token.NAME, "c");
        Node body = new Node(Token.BLOCK);
        Node loop = new Node(Token.WHILE, condition, body);
        Node parent = new Node(Token.SCRIPT, loop);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);

        callback.visit(traversal, loop, parent);

        assertEquals(Token.FOR, loop.getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getType());
        assertSame(condition, loop.getFirstChild().getNext());
        assertEquals(Token.EMPTY, loop.getLastChild().getType());
    }

    @Test
    public void testVisitDoesNotConvertLoopWhenAssertingChanges() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, true);
        Node loop = new Node(Token.WHILE,
                Node.newString(Token.NAME, "c"), new Node(Token.BLOCK));
        Node parent = new Node(Token.SCRIPT, loop);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);

        try {
            callback.visit(traversal, loop, parent);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(Token.FOR, loop.getType());
        }
    }

    @Test
    public void testVisitNamedFunctionPreservesFunctionType() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, false);
        Node function = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        Node parent = new Node(Token.SCRIPT, function);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);

        callback.visit(traversal, function, parent);

        assertEquals(Token.FUNCTION, function.getType());
    }

    @Test
    public void testVisitAnonymousFunctionPreservesFunctionType() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, false);
        Node function = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, ""),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        Node parent = new Node(Token.SCRIPT, function);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);

        callback.visit(traversal, function, parent);

        assertEquals(Token.FUNCTION, function.getType());
    }

    @Test
    public void testEnterScopeCannotBeCalledOnNonScopedCallback() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);
        assertEquals(Token.SCRIPT, new Node(Token.SCRIPT).getType());
    }

    @Test
    public void testExitScopeCannotBeCalledOnNonScopedCallback() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements callback =
                new Normalize.NormalizeStatements(compiler, false);
        NodeTraversal traversal =
                new NodeTraversal(compiler, callback);
        assertEquals(Token.SCRIPT, new Node(Token.SCRIPT).getType());
    }
}
