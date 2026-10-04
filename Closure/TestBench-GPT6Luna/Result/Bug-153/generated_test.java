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

public class NormalizeTest {
    @Test
    public void testSplitMultipleVarDeclarations() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("var a=1,b=2;");
        new Normalize.NormalizeStatements(compiler, false).shouldTraverse(
            new NodeTraversal(compiler, new Normalize.NormalizeStatements(compiler, false)),
            root, null);
        assertEquals(Token.SCRIPT, root.getType());
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("a", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testWhileConvertedToFor() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("while(false){}");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        assertEquals(Token.FOR, root.getFirstChild().getType());
        assertEquals(Token.EMPTY, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testWhileHasThreeForChildren() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("while(true){}");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        Node loop = root.getFirstChild();
        assertEquals(4, loop.getChildCount());
    }

    @Test
    public void testForInitializerMovedBeforeLoop() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("for(var a=1;false;){}");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals(Token.FOR, root.getFirstChild().getNext().getType());
        assertEquals(Token.EMPTY, root.getFirstChild().getNext().getFirstChild().getType());
    }

    @Test
    public void testForExpressionInitializerMovedOut() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("for(a();false;){}");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals(Token.FOR, root.getFirstChild().getNext().getType());
    }

    @Test
    public void testAlreadyEmptyForInitializerRemains() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("for(;false;){}");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        assertEquals(Token.FOR, root.getFirstChild().getType());
        assertEquals(Token.EMPTY, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testLabelAroundExpressionGetsBlock() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("label:foo();");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        Node label = root.getFirstChild();
        assertEquals(Token.LABEL, label.getType());
        assertEquals(Token.BLOCK, label.getLastChild().getType());
        assertEquals(Token.EXPR_RESULT, label.getLastChild().getFirstChild().getType());
    }

    @Test
    public void testLabelAroundLoopIsNotWrapped() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("label:while(false){}");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        assertEquals(Token.FOR, root.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testNonHoistedFunctionDeclarationRewritten() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("if(true){function f(){}}");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        Node declaration = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.VAR, declaration.getType());
        assertEquals("f", declaration.getFirstChild().getString());
        assertEquals(Token.FUNCTION, declaration.getFirstChild().getFirstChild().getType());
        assertEquals("", declaration.getFirstChild().getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testNamedFunctionMovedToBeginning() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("function outer(){a();function inner(){}}");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        Node body = root.getFirstChild().getLastChild();
        assertEquals(Token.FUNCTION, body.getFirstChild().getType());
        assertEquals("inner", body.getFirstChild().getFirstChild().getString());
        assertEquals(Token.EXPR_RESULT, body.getFirstChild().getNext().getType());
    }

    @Test
    public void testConsecutiveVarNamesBecomeSeparateStatements() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("var a,b,c;");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        assertEquals(3, root.getChildCount());
    }

    @Test
    public void testSingleVarDeclarationStaysSingle() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("var only=1;");
        NodeTraversal.traverse(compiler, root,
            new Normalize.NormalizeStatements(compiler, false));
        assertEquals(1, root.getChildCount());
        assertEquals(1, root.getFirstChild().getChildCount());
    }

    @Test
    public void testParseNormalizeTestCodeReturnsScript() throws Exception {
        Compiler compiler = new Compiler();
        Node root = Normalize.parseAndNormalizeTestCode(compiler, "var a=1;", "p");
        assertEquals(Token.SCRIPT, root.getType());
        assertEquals(Token.VAR, root.getFirstChild().getType());
    }

    @Test
    public void testParseNormalizeSyntheticCodeReturnsScript() throws Exception {
        Compiler compiler = new Compiler();
        Node root = Normalize.parseAndNormalizeSyntheticCode(compiler, "var a=1;", "p");
        assertNull(root);
    }

    @Test
    public void testProcessMarksCompilerNormalized() throws Exception {
        Compiler compiler = new Compiler();
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Normalize.NormalizeStatements callback =
            new Normalize.NormalizeStatements(compiler, false);
        assertTrue(callback.shouldTraverse(new NodeTraversal(compiler, callback), root, null));
    }

    @Test
    public void testProcessSplitsVarDeclarations() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node first = new Node(Token.NAME);
        first.setString("a");
        Node second = new Node(Token.NAME);
        second.setString("b");
        Node declaration = new Node(Token.VAR, first, second);
        root.addChildToBack(declaration);
        Normalize.NormalizeStatements callback =
            new Normalize.NormalizeStatements(compiler, false);
        callback.shouldTraverse(new NodeTraversal(compiler, callback), root, null);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessConvertsWhileLoop() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node loop = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
        root.addChildToBack(loop);
        Normalize.NormalizeStatements callback =
            new Normalize.NormalizeStatements(compiler, false);
        callback.visit(null, loop, root);
        assertEquals(Token.FOR, loop.getType());
    }

    @Test
    public void testProcessHandlesEmptyScript() throws Exception {
        Node root = new Node(Token.SCRIPT);
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testVisitWhileConvertsNodeToFor() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("while(false){}");
        Node loop = root.getFirstChild();
        Normalize.NormalizeStatements callback =
            new Normalize.NormalizeStatements(compiler, false);
        callback.visit(null, loop, root);
        assertEquals(Token.FOR, loop.getType());
        assertEquals(4, loop.getChildCount());
    }

    @Test
    public void testVisitWhilePreservesCondition() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("while(true){}");
        Node loop = root.getFirstChild();
        Node condition = loop.getFirstChild();
        new Normalize.NormalizeStatements(compiler, false).visit(null, loop, root);
        assertSame(condition, loop.getChildAtIndex(1));
        assertEquals(Token.TRUE, condition.getType());
    }

    @Test
    public void testVisitRewritesNonHoistedFunctionDeclaration() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("if(true){function f(){}}");
        Node function = root.getFirstChild().getLastChild().getFirstChild();
        Node parent = function.getParent();
        new Normalize.NormalizeStatements(compiler, false).visit(null, function, parent);
        Node declaration = parent.getFirstChild();
        assertEquals(Token.VAR, declaration.getType());
        assertEquals("f", declaration.getFirstChild().getString());
        assertEquals("", declaration.getFirstChild().getFirstChild()
            .getFirstChild().getString());
    }

    @Test
    public void testVisitLeavesFunctionExpressionUnrewritten() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("var f=function(){};");
        Node function = root.getFirstChild().getFirstChild().getFirstChild();
        Node parent = function.getParent();
        new Normalize.NormalizeStatements(compiler, false).visit(null, function, parent);
        assertSame(function, parent.getFirstChild());
        assertEquals(Token.FUNCTION, function.getType());
    }

    @Test
    public void testCreateGlobalScopeFromScript() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("var x;");
        Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
        assertNotNull(scope);
        assertSame(root, scope.getRootNode());
    }

    @Test
    public void testCreateGlobalScopeFromEmptyScript() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("");
        Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
        assertNotNull(scope);
        assertSame(root, scope.getRootNode());
    }

    @Test
    public void testCreateFunctionScope() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("function f(a){var b;}");
        Node function = root.getFirstChild();
        Scope scope = new SyntacticScopeCreator(compiler).createScope(function, null);
        assertNotNull(scope);
        assertSame(function, scope.getRootNode());
    }
}
