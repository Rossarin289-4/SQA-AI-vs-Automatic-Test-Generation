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
        assertTrue(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(IR.name("x")));
    }

    @Test
    public void testPredicateRejectsFunction() throws Exception {
        Node function = IR.function(IR.name("f"), IR.paramList(), IR.block());
        assertFalse(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(function));
    }

    @Test
    public void testLateTrueBecomesNegatedZero() throws Exception {
        Node script = IR.script(IR.trueNode());
        PeepholeSubstituteAlternateSyntax pass = new PeepholeSubstituteAlternateSyntax(true);
        Node result = pass.optimizeSubtree(script.getFirstChild());
        assertEquals(Token.NOT, result.getType());
        assertEquals(Token.NUMBER, result.getFirstChild().getType());
        assertEquals(0.0, result.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testLateFalseBecomesNegatedOne() throws Exception {
        Node script = IR.script(IR.falseNode());
        Node result = new PeepholeSubstituteAlternateSyntax(true).optimizeSubtree(script.getFirstChild());
        assertEquals(Token.NOT, result.getType());
        assertEquals(1.0, result.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testEarlyTrueIsUnchanged() throws Exception {
        Node script = IR.script(IR.trueNode());
        Node original = script.getFirstChild();
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(original);
        assertSame(original, result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testNotEqualityBecomesInequality() throws Exception {
        Node expr = IR.not(IR.eq(IR.name("x"), IR.number(1)));
        Node statement = IR.exprResult(expr);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(expr);
        assertEquals(Token.NE, result.getType());
        assertSame(result, statement.getFirstChild());
    }

    @Test
    public void testNotStrictEqualityBecomesStrictInequality() throws Exception {
        Node expr = IR.not(IR.sheq(IR.name("x"), IR.number(1)));
        IR.exprResult(expr);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(expr);
        assertEquals(Token.SHNE, result.getType());
    }

    @Test
    public void testDoubleNotInConditionIsRemoved() throws Exception {
        Node condition = IR.not(IR.not(IR.name("x")));
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.NAME, whileNode.getFirstChild().getType());
        assertEquals("x", whileNode.getFirstChild().getString());
    }

    @Test
    public void testConditionAndFalseBecomesFalse() throws Exception {
        Node condition = IR.and(IR.name("x"), IR.falseNode());
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.FALSE, whileNode.getFirstChild().getType());
    }

    @Test
    public void testConditionOrFalseBecomesLeftOperand() throws Exception {
        Node condition = IR.or(IR.name("x"), IR.falseNode());
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.NAME, whileNode.getFirstChild().getType());
        assertEquals("x", whileNode.getFirstChild().getString());
    }

    @Test
    public void testConditionHookTrueFalseBecomesCondition() throws Exception {
        Node condition = IR.hook(IR.name("x"), IR.trueNode(), IR.falseNode());
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.NAME, whileNode.getFirstChild().getType());
        assertEquals("x", whileNode.getFirstChild().getString());
    }

    @Test
    public void testConditionHookFalseTrueBecomesNotCondition() throws Exception {
        Node condition = IR.hook(IR.name("x"), IR.falseNode(), IR.trueNode());
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.NOT, whileNode.getFirstChild().getType());
        assertEquals("x", whileNode.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testReturnUndefinedBecomesBareReturn() throws Exception {
        Node result = IR.returnNode(IR.name("undefined"));
        IR.script(result);
        Node optimized = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(result);
        assertSame(result, optimized);
        assertFalse(result.hasChildren());
    }

    @Test
    public void testReturnVoidOfNumberBecomesBareReturn() throws Exception {
        Node result = IR.returnNode(IR.voidNode(IR.number(3)));
        IR.script(result);
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(result);
        assertFalse(result.hasChildren());
    }

    @Test
    public void testStringCallOnImmutableNumberBecomesAddition() throws Exception {
        Node call = IR.call(IR.name("String"), IR.number(7));
        Node statement = IR.exprResult(call);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(call);
        assertEquals(Token.ADD, result.getType());
        assertEquals("", result.getFirstChild().getString());
        assertEquals(Token.NUMBER, result.getLastChild().getType());
        assertSame(result, statement.getFirstChild());
    }

    @Test
    public void testArrayConstructorWithoutArgumentsBecomesEmptyLiteral() throws Exception {
        Node call = IR.call(IR.name("Array"));
        Node statement = IR.exprResult(call);
        PeepholeSubstituteAlternateSyntax pass = new PeepholeSubstituteAlternateSyntax(false) {
        };
    }

    @Test
    public void testArrayConstructorWithStringArgumentIsNotFoldedWithoutNormalization() throws Exception {
        Node call = IR.call(IR.name("Array"), IR.string("a"));
        IR.exprResult(call);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(call);
        assertSame(call, result);
        assertEquals(Token.CALL, result.getType());
    }

    @Test
    public void testCommaExpressionInExpressionStatementIsSplit() throws Exception {
        Node comma = IR.comma(IR.name("a"), IR.name("b"));
        Node firstStatement = IR.exprResult(comma);
        Node script = IR.script(firstStatement);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(comma);
        assertEquals(Token.NAME, result.getType());
        assertEquals("a", result.getString());
        assertEquals(2, script.getChildCount());
        assertEquals("b", script.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testLateCommaExpressionIsUnchanged() throws Exception {
        Node comma = IR.comma(IR.name("a"), IR.name("b"));
        IR.exprResult(comma);
        Node result = new PeepholeSubstituteAlternateSyntax(true).optimizeSubtree(comma);
        assertSame(comma, result);
        assertEquals(Token.COMMA, result.getType());
    }

    @Test
    public void testArrayLiteralOfStringsIsUnchangedEarly() throws Exception {
        Node array = IR.arraylit(IR.string("a"), IR.string("b"));
        IR.exprResult(array);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(array);
        assertSame(array, result);
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testNonStringArrayLiteralIsUnchangedLate() throws Exception {
        Node array = IR.arraylit(IR.string("a"), IR.number(2));
        IR.exprResult(array);
        Node result = new PeepholeSubstituteAlternateSyntax(true).optimizeSubtree(array);
        assertSame(array, result);
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testNewObjectIsNotFoldedWithoutNormalization() throws Exception {
        Node object = IR.newNode(IR.name("Object"));
        IR.exprResult(object);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(object);
        assertSame(object, result);
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testNewArraySingleNonzeroNumberIsNotFoldedWithoutNormalization() throws Exception {
        Node array = IR.newNode(IR.name("Array"), IR.number(1));
        IR.exprResult(array);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(array);
        assertSame(array, result);
        assertEquals(1, result.getChildCount());
    }

    @Test
    public void testNoArgumentArrayCallStaysCallWithoutNormalization() throws Exception {
        Node array = IR.call(IR.name("Array"));
        IR.exprResult(array);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(array);
        assertSame(array, result);
        assertEquals(Token.CALL, result.getType());
    }

    @Test
    public void testRegexConstructorDoesNotFoldWithoutNormalization() throws Exception {
        Node regexp = IR.call(IR.name("RegExp"), IR.string("ab"));
        IR.exprResult(regexp);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(regexp);
        assertSame(regexp, result);
        assertEquals(Token.CALL, result.getType());
    }
}
