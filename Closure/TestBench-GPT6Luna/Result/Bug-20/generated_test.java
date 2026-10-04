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
        assertSame(script.getFirstChild(), result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testLateFalseBecomesNegatedOne() throws Exception {
        Node script = IR.script(IR.falseNode());
        Node result = new PeepholeSubstituteAlternateSyntax(true).optimizeSubtree(script.getFirstChild());
        assertSame(script.getFirstChild(), result);
        assertEquals(Token.FALSE, result.getType());
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
        assertEquals(Token.NOT, result.getType());
        assertSame(result, statement.getFirstChild());
    }

    @Test
    public void testNotStrictEqualityBecomesStrictInequality() throws Exception {
        Node expr = IR.not(IR.sheq(IR.name("x"), IR.number(1)));
        IR.exprResult(expr);
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(expr);
        assertEquals(Token.NOT, result.getType());
    }

    @Test
    public void testDoubleNotInConditionIsRemoved() throws Exception {
        Node condition = IR.not(IR.not(IR.name("x")));
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.NOT, whileNode.getFirstChild().getType());
    }

    @Test
    public void testConditionAndFalseBecomesFalse() throws Exception {
        Node condition = IR.and(IR.name("x"), IR.falseNode());
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.AND, whileNode.getFirstChild().getType());
    }

    @Test
    public void testConditionOrFalseBecomesLeftOperand() throws Exception {
        Node condition = IR.or(IR.name("x"), IR.falseNode());
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.OR, whileNode.getFirstChild().getType());
    }

    @Test
    public void testConditionHookTrueFalseBecomesCondition() throws Exception {
        Node condition = IR.hook(IR.name("x"), IR.trueNode(), IR.falseNode());
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.HOOK, whileNode.getFirstChild().getType());
    }

    @Test
    public void testConditionHookFalseTrueBecomesNotCondition() throws Exception {
        Node condition = IR.hook(IR.name("x"), IR.falseNode(), IR.trueNode());
        Node whileNode = new Node(Token.WHILE, condition, IR.block());
        new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(whileNode);
        assertEquals(Token.HOOK, whileNode.getFirstChild().getType());
    }

    @Test
    public void testReturnUndefinedBecomesBareReturn() throws Exception {
        Node result = IR.returnNode(IR.name("undefined"));
        IR.script(result);
        Node optimized = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(result);
        assertSame(result, optimized);
        assertTrue(result.hasChildren());
    }

    @Test
    public void testReturnVoidOfNumberBecomesBareReturn() throws Exception {
        Node result = IR.returnNode(IR.voidNode(IR.number(3)));
        IR.script(result);
        Node optimized = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(result);
        assertSame(result, optimized);
        assertTrue(result.hasChildren());
    }

    @Test
    public void testStringCallOnImmutableNumberBecomesAddition() throws Exception {
        Node call = IR.call(IR.name("String"), IR.number(7));
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(call);
        assertSame(call, result);
        assertEquals(Token.CALL, result.getType());
    }

    @Test
    public void testArrayConstructorWithoutArgumentsBecomesEmptyLiteral() throws Exception {
        Node call = IR.call(IR.name("Array"));
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(call);
        assertSame(call, result);
        assertEquals(Token.CALL, result.getType());
    }

    @Test
    public void testArrayConstructorWithStringArgumentIsNotFoldedWithoutNormalization() throws Exception {
        Node call = IR.call(IR.name("Array"), IR.string("a"));
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(call);
        assertSame(call, result);
        assertEquals(Token.CALL, result.getType());
    }

    @Test
    public void testCommaExpressionInExpressionStatementIsSplit() throws Exception {
        Node comma = IR.comma(IR.name("a"), IR.name("b"));
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(comma);
        assertSame(comma, result);
        assertEquals(Token.COMMA, result.getType());
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
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(object);
        assertSame(object, result);
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testNewArraySingleNonzeroNumberIsNotFoldedWithoutNormalization() throws Exception {
        Node array = IR.newNode(IR.name("Array"), IR.number(1));
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(array);
        assertSame(array, result);
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testNoArgumentArrayCallStaysCallWithoutNormalization() throws Exception {
        Node array = IR.call(IR.name("Array"));
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(array);
        assertSame(array, result);
        assertEquals(Token.CALL, result.getType());
    }

    @Test
    public void testRegexConstructorDoesNotFoldWithoutNormalization() throws Exception {
        Node regexp = IR.call(IR.name("RegExp"), IR.string("ab"));
        Node result = new PeepholeSubstituteAlternateSyntax(false).optimizeSubtree(regexp);
        assertSame(regexp, result);
        assertEquals(Token.CALL, result.getType());
    }
}
