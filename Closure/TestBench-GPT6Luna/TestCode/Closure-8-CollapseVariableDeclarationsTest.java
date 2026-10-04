package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Set;

public class CollapseVariableDeclarationsTest {
    @Test
    public void testProcessSingleVarLeavesItsDeclaration() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node var = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        root.addChildToBack(var);

        new CollapseVariableDeclarations(compiler).process(null, root);

        assertSame(var, root.getFirstChild());
        assertEquals(Token.VAR, var.getType());
        assertEquals("a", var.getFirstChild().getString());
    }

    @Test
    public void testProcessEmptyScriptLeavesItEmpty() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);

        new CollapseVariableDeclarations(compiler).process(null, root);

        assertNull(root.getFirstChild());
    }

    @Test
    public void testAdjacentVarsAreCombined() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node first = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node second = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        root.addChildToBack(first);
        root.addChildToBack(second);

        new CollapseVariableDeclarations(compiler).process(null, root);

        Node combined = root.getFirstChild();
        assertEquals(Token.VAR, combined.getType());
        assertEquals("a", combined.getFirstChild().getString());
        assertEquals("b", combined.getFirstChild().getNext().getString());
        assertNull(combined.getNext());
    }

    @Test
    public void testVarDeclaratorsKeepTheirInitializerNodes() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node a = new Node(Token.NAME, Node.newNumber(1));
        a.setString("a");
        Node b = new Node(Token.NAME, Node.newNumber(2));
        b.setString("b");
        root.addChildToBack(new Node(Token.VAR, a));
        root.addChildToBack(new Node(Token.VAR, b));

        new CollapseVariableDeclarations(compiler).process(null, root);

        Node combined = root.getFirstChild();
        assertEquals(2, combined.getChildAtIndex(1).getFirstChild().getDouble(), 0.0);
        assertEquals(1, combined.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testVarThenAssignmentIsConvertedToInitializer() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node declared = Node.newString(Token.NAME, "a");
        root.addChildToBack(new Node(Token.VAR, declared));
        Node assignment = new Node(Token.ASSIGN,
                Node.newString(Token.NAME, "a"), Node.newNumber(2));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assignment));

        new CollapseVariableDeclarations(compiler).process(null, root);

        Node combined = root.getFirstChild();
        assertEquals(Token.VAR, combined.getType());
        assertEquals(2, combined.getFirstChild().getFirstChild().getDouble(), 0.0);
        assertEquals("a", combined.getFirstChild().getString());
    }

    @Test
    public void testVarThenAssignmentAddsDuplicateSuppression() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node declared = Node.newString(Token.NAME, "a");
        root.addChildToBack(new Node(Token.VAR, declared));
        Node assignment = new Node(Token.ASSIGN,
                Node.newString(Token.NAME, "a"), Node.newNumber(3));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assignment));

        new CollapseVariableDeclarations(compiler).process(null, root);

        assertNotNull(root.getFirstChild().getJSDocInfo());
    }

    @Test
    public void testMultipleAssignmentsBecomeNestedInitializer() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "a")));
        root.addChildToBack(new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), Node.newNumber(4))));
        root.addChildToBack(new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), Node.newNumber(5))));

        new CollapseVariableDeclarations(compiler).process(null, root);

        Node result = root.getFirstChild().getFirstChild().getFirstChild();
        assertEquals(Token.ASSIGN, result.getType());
        assertEquals(5, result.getLastChild().getDouble(), 0.0);
        assertEquals(Token.NUMBER, result.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testAssignmentWithoutPriorVarIsNotCollapsed() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node assignment = new Node(Token.ASSIGN,
                Node.newString(Token.NAME, "a"), Node.newNumber(1));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assignment));

        new CollapseVariableDeclarations(compiler).process(null, root);

        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertSame(assignment, root.getFirstChild().getFirstChild());
    }

    @Test
    public void testNonNameAssignmentLeftSideIsNotCollapsed() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node property = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "obj"), Node.newString("x"));
        Node assignment = new Node(Token.ASSIGN, property, Node.newNumber(1));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assignment));

        new CollapseVariableDeclarations(compiler).process(null, root);

        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertSame(property, assignment.getFirstChild());
    }

    @Test
    public void testAdjacentVarsInIfBranchesRemainSeparate() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node condition = Node.newString(Token.NAME, "c");
        Node thenVar = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node elseVar = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        root.addChildToBack(new Node(Token.IF, condition, thenVar, elseVar));

        new CollapseVariableDeclarations(compiler).process(null, root);

        assertEquals(Token.VAR, root.getFirstChild().getChildAtIndex(1).getType());
        assertEquals(Token.VAR, root.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testAStandaloneVarStubDoesNotChangeShape() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node var = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        root.addChildToBack(var);
        root.addChildToBack(new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), Node.newNumber(6))));

        new CollapseVariableDeclarations(compiler).process(null, root);

        assertSame(var, root.getFirstChild());
        assertEquals(Token.EXPR_RESULT, var.getNext().getType());
    }

    @Test
    public void testVarDeclarationsOnEitherSideOfUnrelatedStatementStaySeparate() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Node first = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node middle = new Node(Token.RETURN, Node.newNumber(0));
        Node last = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        root.addChildToBack(first);
        root.addChildToBack(middle);
        root.addChildToBack(last);

        new CollapseVariableDeclarations(compiler).process(null, root);

        assertSame(first, root.getFirstChild());
        assertSame(middle, first.getNext());
        assertSame(last, middle.getNext());
        assertNull(last.getNext());
    }
}
