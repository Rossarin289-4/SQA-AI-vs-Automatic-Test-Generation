package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.regex.Pattern;

public class PeepholeSubstituteAlternateSyntaxTest {
    @Test
    public void testPredicateAcceptsNonFunctionNode() throws Exception {
        assertTrue(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE
                .apply(new Node(Token.NAME)));
    }

    @Test
    public void testPredicateRejectsFunctionNode() throws Exception {
        assertFalse(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE
                .apply(new Node(Token.FUNCTION)));
    }

    @Test
    public void testUnrecognizedNodeIsUnchanged() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node name = Node.newString(Token.NAME, "value");
        assertSame(name, optimization.optimizeSubtree(name));
        assertEquals(Token.NAME, name.getType());
    }

    @Test
    public void testNotEqualComplement() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node comparison = new Node(Token.EQ, Node.newString(Token.NAME, "a"),
                Node.newString(Token.NAME, "b"));
        Node not = new Node(Token.NOT, comparison);
        Node parent = new Node(Token.EXPR_RESULT, not);

        Node result = optimization.optimizeSubtree(not);

        assertSame(comparison, result);
        assertEquals(Token.NE, result.getType());
        assertSame(result, parent.getFirstChild());
    }

    @Test
    public void testStrictNotEqualComplement() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node comparison = new Node(Token.SHNE, Node.newString(Token.NAME, "a"),
                Node.newString(Token.NAME, "b"));
        Node not = new Node(Token.NOT, comparison);
        Node parent = new Node(Token.EXPR_RESULT, not);

        Node result = optimization.optimizeSubtree(not);

        assertSame(comparison, result);
        assertEquals(Token.SHEQ, result.getType());
        assertSame(result, parent.getFirstChild());
    }

    @Test
    public void testRelationalNotIsNotComplemented() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node comparison = new Node(Token.LT, Node.newString(Token.NAME, "a"),
                Node.newString(Token.NAME, "b"));
        Node not = new Node(Token.NOT, comparison);
        new Node(Token.EXPR_RESULT, not);

        assertSame(not, optimization.optimizeSubtree(not));
        assertEquals(Token.NOT, not.getType());
        assertSame(comparison, not.getFirstChild());
    }

    @Test
    public void testDoubleNotConditionReducesToName() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node name = Node.newString(Token.NAME, "x");
        Node doubleNot = new Node(Token.NOT, new Node(Token.NOT, name));
        Node statement = new Node(Token.EXPR_RESULT, doubleNot);

        optimization.optimizeSubtree(statement);

        assertSame(name, statement.getFirstChild());
        assertEquals(Token.NAME, statement.getFirstChild().getType());
    }

    @Test
    public void testFalseAndConditionReducesToZero() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node and = new Node(Token.AND, Node.newString(Token.NAME, "x"),
                new Node(Token.FALSE));
        Node statement = new Node(Token.EXPR_RESULT, and);

        optimization.optimizeSubtree(statement);

        assertEquals(Token.NUMBER, statement.getFirstChild().getType());
        assertEquals(0.0, statement.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTrueOrConditionReducesToOne() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node or = new Node(Token.OR, Node.newString(Token.NAME, "x"),
                new Node(Token.TRUE));
        Node statement = new Node(Token.EXPR_RESULT, or);

        optimization.optimizeSubtree(statement);

        assertEquals(Token.NUMBER, statement.getFirstChild().getType());
        assertEquals(1.0, statement.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testConditionalTrueFalseReducesToCondition() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node condition = Node.newString(Token.NAME, "x");
        Node hook = new Node(Token.HOOK, condition, new Node(Token.TRUE),
                new Node(Token.FALSE));
        Node statement = new Node(Token.EXPR_RESULT, hook);

        optimization.optimizeSubtree(statement);

        assertSame(condition, statement.getFirstChild());
        assertEquals(Token.NAME, statement.getFirstChild().getType());
    }

    @Test
    public void testConditionalFalseTrueBecomesNotCondition() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node condition = Node.newString(Token.NAME, "x");
        Node hook = new Node(Token.HOOK, condition, new Node(Token.FALSE),
                new Node(Token.TRUE));
        Node statement = new Node(Token.EXPR_RESULT, hook);

        optimization.optimizeSubtree(statement);

        assertEquals(Token.NOT, statement.getFirstChild().getType());
        assertSame(condition, statement.getFirstChild().getFirstChild());
    }

    @Test
    public void testIfWithCallBranchesBecomesConditionalExpression() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node condition = Node.newString(Token.NAME, "x");
        Node thenCall = new Node(Token.CALL, Node.newString(Token.NAME, "a"));
        Node elseCall = new Node(Token.CALL, Node.newString(Token.NAME, "b"));
        Node thenBlock = new Node(Token.BLOCK,
                new Node(Token.EXPR_RESULT, thenCall));
        Node elseBlock = new Node(Token.BLOCK,
                new Node(Token.EXPR_RESULT, elseCall));
        Node ifNode = new Node(Token.IF, condition, thenBlock, elseBlock);
        Node script = new Node(Token.SCRIPT, ifNode);

        Node result = optimization.optimizeSubtree(ifNode);

        assertSame(result, script.getFirstChild());
        assertEquals(Token.IF, result.getType());
        assertSame(condition, result.getFirstChild());
        assertSame(thenBlock, result.getFirstChild().getNext());
        assertSame(elseBlock, result.getLastChild());
    }

    @Test
    public void testNewArrayWithNoArgumentsBecomesArrayLiteral() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node constructor = Node.newString(Token.NAME, "Array");
        Node newNode = new Node(Token.NEW, constructor);
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(result, statement.getFirstChild());
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testNewArrayWithZeroBecomesEmptyArrayLiteral() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "Array"),
                Node.newNumber(0));
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
        assertEquals(0.0, result.getFirstChild().getNext().getDouble(), 0.0);
    }

    @Test
    public void testNewArrayWithNonzeroSingleNumberIsRetained() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "Array"),
                Node.newNumber(1));
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
        assertEquals(1.0, result.getFirstChild().getNext().getDouble(), 0.0);
    }

    @Test
    public void testNewArrayWithStringBecomesOneElementArrayLiteral() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node string = Node.newString("a");
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "Array"),
                string);
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
        assertSame(string, result.getFirstChild().getNext());
    }

    @Test
    public void testNewObjectWithNoArgumentsBecomesObjectLiteral() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testNewObjectWithArgumentIsNotFoldedToObjectLiteral() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node argument = Node.newNumber(1);
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "Object"),
                argument);
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
        assertSame(argument, result.getFirstChild().getNext());
    }

    @Test
    public void testRegexpConstructorEscapesSlashWhenFolded() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node pattern = Node.newString("a/b");
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "RegExp"),
                pattern);
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testRegexpEmptyPatternIsNotFolded() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "RegExp"),
                Node.newString(""));
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testRegexpGlobalFlagIsNotFolded() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "RegExp"),
                Node.newString("a"), Node.newString("g"));
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testRegexpNonGlobalFlagsCanBeFolded() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax();
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "RegExp"),
                Node.newString("a"), Node.newString("im"));
        Node statement = new Node(Token.EXPR_RESULT, newNode);

        Node result = optimization.optimizeSubtree(newNode);

        assertSame(newNode, result);
        assertEquals(Token.NEW, result.getType());
    }
}
