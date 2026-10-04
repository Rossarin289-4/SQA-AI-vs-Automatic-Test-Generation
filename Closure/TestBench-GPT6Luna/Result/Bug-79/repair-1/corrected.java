package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
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
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node first = root.getFirstChild();
        assertEquals(Token.VAR, first.getType());
        assertEquals("a", first.getFirstChild().getString());
        Node second = first.getNext();
        assertEquals(Token.VAR, second.getType());
        assertEquals("b", second.getFirstChild().getString());
        assertNull(second.getNext());
    }

    @Test
    public void testWhileConvertedToFor() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("while(x)y();");
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node loop = root.getFirstChild();
        assertEquals(Token.FOR, loop.getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getType());
        assertEquals(Token.NAME, loop.getFirstChild().getNext().getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getNext().getNext().getType());
    }

    @Test
    public void testForInitializerMovedBeforeLoop() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("for(var i=0;i<1;i++)x();");
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node declaration = root.getFirstChild();
        assertEquals(Token.VAR, declaration.getType());
        assertEquals("i", declaration.getFirstChild().getString());
        Node loop = declaration.getNext();
        assertEquals(Token.FOR, loop.getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getType());
    }

    @Test
    public void testForExpressionInitializerMovedAsExpression() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("for(f();x;)y();");
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node expression = root.getFirstChild();
        assertEquals(Token.EXPR_RESULT, expression.getType());
        assertEquals(Token.CALL, expression.getFirstChild().getType());
        assertEquals(Token.FOR, expression.getNext().getType());
        assertEquals(Token.EMPTY, expression.getNext().getFirstChild().getType());
    }

    @Test
    public void testForInVarDeclarationExtracted() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("for(var k in obj)x();");
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node declaration = root.getFirstChild();
        assertEquals(Token.VAR, declaration.getType());
        assertEquals("k", declaration.getFirstChild().getString());
        Node loop = declaration.getNext();
        assertEquals(Token.FOR, loop.getType());
        assertEquals(Token.NAME, loop.getFirstChild().getType());
        assertEquals("k", loop.getFirstChild().getString());
    }

    @Test
    public void testLabelAroundStatementGetsBlock() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("label:x();");
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node label = root.getFirstChild();
        assertEquals(Token.LABEL, label.getType());
        assertEquals(Token.BLOCK, label.getLastChild().getType());
        assertEquals(Token.EXPR_RESULT, label.getLastChild().getFirstChild().getType());
    }

    @Test
    public void testLabelAroundLoopDoesNotAddBlock() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("label:while(x)y();");
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node label = root.getFirstChild();
        assertEquals(Token.LABEL, label.getType());
        assertEquals(Token.FOR, label.getLastChild().getType());
    }

    @Test
    public void testFunctionDeclarationMovedToTopOfFunctionBody() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("function outer(){x();function inner(){}}");
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node body = root.getFirstChild().getLastChild();
        assertEquals(Token.FUNCTION, body.getFirstChild().getType());
        assertEquals("inner", body.getFirstChild().getFirstChild().getString());
        assertEquals(Token.EXPR_RESULT, body.getFirstChild().getNext().getType());
    }

    @Test
    public void testConstantConventionAnnotationPropagated() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("var FOO=1;FOO;");
        NodeTraversal.traverse(compiler, root,
                new Normalize.NormalizeStatements(compiler, false));
        Node declarationName = root.getFirstChild().getFirstChild();
        assertTrue(declarationName.getBooleanProp(Node.IS_CONSTANT_NAME));
        assertTrue(root.getFirstChild().getNext().getFirstChild()
                .getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testEmptyVariableNameIsLeftUnannotated() throws Exception {
        Node name = Node.newString(Token.NAME, "");
        assertFalse(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testProcessSetsNormalizedLifecycleStage() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("var x=1;");
        new Normalize(compiler, false).process(null, root);
        assertTrue(compiler.getLifeCycleStage().isNormalized());
    }

    @Test
    public void testDuplicateDeclarationsAreNormalized() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parseTestCode("var x=1;var x=2;");
        new Normalize(compiler, false).process(null, root);
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getNext().getType());
        assertEquals(Token.ASSIGN,
                root.getFirstChild().getNext().getFirstChild().getType());
    }

    @Test
    public void testShouldTraverseReturnsTrue() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements pass =
                new Normalize.NormalizeStatements(compiler, false);
        Node script = new Node(Token.SCRIPT);
        assertTrue(pass.shouldTraverse(null, script, null));
    }

    @Test
    public void testShouldTraverseNormalizesWhileBeforeTraversal() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements pass =
                new Normalize.NormalizeStatements(compiler, false);
        Node script = new Node(Token.SCRIPT);
        Node loop = new Node(Token.WHILE, Node.newString(Token.NAME, "x"),
                new Node(Token.BLOCK));
        script.addChildToBack(loop);
        assertTrue(pass.shouldTraverse(null, loop, script));
        assertEquals(Token.FOR, loop.getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getType());
    }

    @Test
    public void testVisitConvertsWhileNodeToFor() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements pass =
                new Normalize.NormalizeStatements(compiler, false);
        Node loop = new Node(Token.WHILE, Node.newString(Token.NAME, "x"),
                new Node(Token.BLOCK));
        pass.visit(null, loop, null);
        assertEquals(Token.FOR, loop.getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getType());
        assertEquals(Token.NAME, loop.getFirstChild().getNext().getType());
        assertEquals(Token.EMPTY, loop.getLastChild().getType());
    }

    @Test
    public void testVisitLeavesForNodeUnchanged() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements pass =
                new Normalize.NormalizeStatements(compiler, false);
        Node loop = new Node(Token.FOR, new Node(Token.EMPTY),
                Node.newString(Token.NAME, "x"), new Node(Token.EMPTY),
                new Node(Token.BLOCK));
        pass.visit(null, loop, null);
        assertEquals(Token.FOR, loop.getType());
        assertEquals(Token.EMPTY, loop.getFirstChild().getType());
        assertEquals("x", loop.getFirstChild().getNext().getString());
    }

    @Test
    public void testVisitLeavesNonConstantNameUnmarked() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements pass =
                new Normalize.NormalizeStatements(compiler, false);
        Node name = Node.newString(Token.NAME, "ordinary");
        pass.visit(null, name, null);
        assertFalse(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testVisitMarksConstantNameByConvention() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements pass =
                new Normalize.NormalizeStatements(compiler, false);
        Node name = Node.newString(Token.NAME, "FOO");
        pass.visit(null, name, null);
        assertTrue(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testVisitSkipsEmptyName() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements pass =
                new Normalize.NormalizeStatements(compiler, false);
        Node name = Node.newString(Token.NAME, "");
        pass.visit(null, name, null);
        assertFalse(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testVisitLeavesStringWithoutPropertyParentUnmarked() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.NormalizeStatements pass =
                new Normalize.NormalizeStatements(compiler, false);
        Node string = Node.newString(Token.STRING, "FOO");
        pass.visit(null, string, null);
        assertFalse(string.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateVisitLeavesOrdinaryNameUnmarked() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.PropagateConstantAnnotationsOverVars pass =
                new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
        Node name = Node.newString(Token.NAME, "ordinary");
        pass.visit(null, name, null);
        assertFalse(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateVisitSkipsEmptyName() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.PropagateConstantAnnotationsOverVars pass =
                new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
        Node name = Node.newString(Token.NAME, "");
        pass.visit(null, name, null);
        assertFalse(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testPropagateVisitIgnoresNonNameNodes() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.PropagateConstantAnnotationsOverVars pass =
                new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
        Node number = Node.newNumber(0);
        pass.visit(null, number, null);
        assertEquals(Token.NUMBER, number.getType());
    }

    @Test
    public void testPropagateVisitDoesNotMarkNameWithoutConvention() throws Exception {
        Compiler compiler = new Compiler();
        Normalize.PropagateConstantAnnotationsOverVars pass =
                new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
        Node name = Node.newString(Token.NAME, "ordinary");
        pass.visit(null, name, null);
        assertFalse(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }
}
