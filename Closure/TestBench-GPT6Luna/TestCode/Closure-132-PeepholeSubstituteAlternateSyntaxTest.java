package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.CodingConvention.Bind;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.regex.Pattern;

public class PeepholeSubstituteAlternateSyntaxTest {
    @Test
    public void testPredicateAcceptsNonFunction() throws Exception {
        assertTrue(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE
                .apply(IR.name("x")));
    }

    @Test
    public void testPredicateRejectsFunction() throws Exception {
        Node function = IR.function(IR.name("f"), IR.paramList(), IR.block());
        assertFalse(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE
                .apply(function));
    }

    @Test
    public void testUnchangedNameNode() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node name = IR.name("x");
        Node root = IR.exprResult(name);
        assertSame(name, pass.optimizeSubtree(name));
        assertSame(name, root.getFirstChild());
    }

    @Test
    public void testNotEqualComparisonIsComplemented() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node not = IR.not(IR.eq(IR.name("x"), IR.name("y")));
        Node root = IR.exprResult(not);
        Node result = pass.optimizeSubtree(not);
        assertEquals(Token.NE, result.getType());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testStrictEqualityComplementIsStrictInequality() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node not = IR.not(IR.sheq(IR.name("x"), IR.name("y")));
        Node result = pass.optimizeSubtree(not);
        assertEquals(Token.SHNE, result.getType());
    }

    @Test
    public void testIfWithExpressionBecomesAndExpression() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node conditional = IR.ifNode(IR.name("x"),
                IR.block(IR.exprResult(IR.call(IR.name("f")))));
        Node root = IR.script(conditional);
        Node result = pass.optimizeSubtree(conditional);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertEquals(Token.AND, result.getFirstChild().getType());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testNegatedIfWithExpressionBecomesOrExpression() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node conditional = IR.ifNode(IR.not(IR.name("x")),
                IR.block(IR.exprResult(IR.call(IR.name("f")))));
        Node root = IR.script(conditional);
        Node result = pass.optimizeSubtree(conditional);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertEquals(Token.OR, result.getFirstChild().getType());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testIfReturnBranchesBecomeConditionalReturn() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node conditional = IR.ifNode(IR.name("x"),
                IR.block(IR.returnNode(IR.number(1))),
                IR.block(IR.returnNode(IR.number(2))));
        Node root = IR.script(conditional);
        Node result = pass.optimizeSubtree(conditional);
        assertEquals(Token.RETURN, result.getType());
        assertEquals(Token.HOOK, result.getFirstChild().getType());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testTrueBecomesNegatedZeroInLatePass() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(true);
        Node literal = IR.trueNode();
        Node root = IR.exprResult(literal);
        Node result = pass.optimizeSubtree(literal);
        assertEquals(Token.NOT, result.getType());
        assertEquals(0.0, result.getFirstChild().getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFalseRemainsBooleanInEarlyPass() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node literal = IR.falseNode();
        assertSame(literal, pass.optimizeSubtree(literal));
        assertEquals(Token.FALSE, literal.getType());
    }

    @Test
    public void testArrayConstructorWithNoArgumentsBecomesEmptyArray() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node creation = IR.newNode(IR.name("Array"));
        Node root = IR.exprResult(creation);
        Node result = pass.optimizeSubtree(creation);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertFalse(result.hasChildren());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testArrayConstructorWithZeroBecomesEmptyArray() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node creation = IR.newNode(IR.name("Array"), IR.number(0));
        Node root = IR.exprResult(creation);
        Node result = pass.optimizeSubtree(creation);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertFalse(result.hasChildren());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testArrayConstructorWithStringBecomesArrayLiteral() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node creation = IR.newNode(IR.name("Array"), IR.string("a"));
        Node root = IR.exprResult(creation);
        Node result = pass.optimizeSubtree(creation);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertEquals(1, result.getChildCount());
        assertEquals("a", result.getFirstChild().getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testArrayConstructorWithPositiveNumberIsNotFolded() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node creation = IR.newNode(IR.name("Array"), IR.number(1));
        Node root = IR.exprResult(creation);
        assertSame(creation, pass.optimizeSubtree(creation));
        assertEquals(Token.NEW, creation.getType());
        assertSame(creation, root.getFirstChild());
    }

    @Test
    public void testObjectCallWithoutArgumentsBecomesObjectLiteral() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node call = IR.call(IR.name("Object"));
        Node root = IR.exprResult(call);
        Node result = pass.optimizeSubtree(call);
        assertEquals(Token.OBJECTLIT, result.getType());
        assertFalse(result.hasChildren());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testStringCallOnLiteralBecomesAddition() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node call = IR.call(IR.name("String"), IR.string("a"));
        Node root = IR.exprResult(call);
        Node result = pass.optimizeSubtree(call);
        assertEquals(Token.ADD, result.getType());
        assertEquals("", result.getFirstChild().getString());
        assertEquals("a", result.getLastChild().getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testCommaInExpressionStatementSplitsEarly() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(false);
        Node comma = IR.comma(IR.name("a"), IR.name("b"));
        Node first = IR.exprResult(comma);
        Node root = IR.script(first);
        Node result = pass.optimizeSubtree(comma);
        assertEquals(Token.NAME, result.getType());
        assertEquals("a", result.getString());
        assertEquals(2, root.getChildCount());
        assertEquals("b", root.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testCommaRemainsInLatePass() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(true);
        Node comma = IR.comma(IR.name("a"), IR.name("b"));
        Node root = IR.exprResult(comma);
        assertSame(comma, pass.optimizeSubtree(comma));
        assertEquals(Token.COMMA, root.getFirstChild().getType());
    }

    @Test
    public void testStringArrayWithShortElementsRemainsUnchangedWhenSavingsInsufficient()
            throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(true);
        Node array = IR.arraylit(IR.string("a"), IR.string("b"));
        Node root = IR.exprResult(array);
        assertSame(array, pass.optimizeSubtree(array));
        assertSame(array, root.getFirstChild());
        assertEquals(2, array.getChildCount());
    }

    @Test
    public void testStringArrayWithEnoughElementsUsesSplitForm() throws Exception {
        PeepholeSubstituteAlternateSyntax pass =
                new PeepholeSubstituteAlternateSyntax(true);
        Node array = IR.arraylit(
                IR.string("alpha"), IR.string("beta"), IR.string("gamma"));
        Node root = IR.exprResult(array);
        Node result = pass.optimizeSubtree(array);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertEquals(3, result.getChildCount());
        assertSame(result, root.getFirstChild());
    }
}
