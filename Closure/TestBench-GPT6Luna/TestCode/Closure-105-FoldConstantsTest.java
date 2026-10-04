package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.regex.Pattern;

public class FoldConstantsTest {
    @Test
    public void testAddNumbers() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(NodeUtil.newExpr(
                new Node(Token.ADD, Node.newNumber(2), Node.newNumber(3))));
        new FoldConstants(null).visit(null, root.getFirstChild().getFirstChild(),
                root.getFirstChild());
        Node folded = root.getFirstChild().getFirstChild();
        assertEquals(Token.NUMBER, folded.getType());
        assertEquals(5.0, folded.getDouble(), 0.0);
    }

    @Test
    public void testAddStrings() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(NodeUtil.newExpr(
                new Node(Token.ADD, Node.newString("ab"), Node.newString("cd"))));
        new FoldConstants(null).visit(null, root.getFirstChild().getFirstChild(),
                root.getFirstChild());
        Node folded = root.getFirstChild().getFirstChild();
        assertEquals(Token.STRING, folded.getType());
        assertEquals("abcd", folded.getString());
    }

    @Test
    public void testDivideByZeroRemainsUnfolded() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node division = new Node(Token.DIV, Node.newNumber(5), Node.newNumber(0));
        root.addChildToBack(NodeUtil.newExpr(division));
        new FoldConstants(null).visit(null, division, root.getFirstChild());
        assertSame(division, root.getFirstChild().getFirstChild());
        assertEquals(Token.DIV, division.getType());
    }

    @Test
    public void testArithmeticFoldUsesCompactResult() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(
                new Node(Token.MUL, Node.newNumber(2), Node.newNumber(3)));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(6.0, expression.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testArithmeticMayRemainWhenResultIsLonger() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node add = new Node(Token.ADD, Node.newNumber(9), Node.newNumber(9));
        root.addChildToBack(NodeUtil.newExpr(add));
        new FoldConstants(null).visit(null, add, root.getFirstChild());
        assertEquals(Token.ADD, root.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testBitAndFoldAtIntegerMaximum() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(new Node(Token.BITAND,
                Node.newNumber(2147483647.0), Node.newNumber(1)));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(1.0, expression.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testBitAndDoesNotFoldOutsideIntegerRange() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node bitAnd = new Node(Token.BITAND,
                Node.newNumber(2147483648.0), Node.newNumber(1));
        root.addChildToBack(NodeUtil.newExpr(bitAnd));
        new FoldConstants(null).visit(null, bitAnd, root.getFirstChild());
        assertSame(bitAnd, root.getFirstChild().getFirstChild());
    }

    @Test
    public void testBitAndDoesNotFoldFractionalOperand() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node bitAnd = new Node(Token.BITAND,
                Node.newNumber(1.5), Node.newNumber(1));
        root.addChildToBack(NodeUtil.newExpr(bitAnd));
        new FoldConstants(null).visit(null, bitAnd, root.getFirstChild());
        assertSame(bitAnd, root.getFirstChild().getFirstChild());
    }

    @Test
    public void testLeftShiftAtMaximumValidShift() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(new Node(Token.LSH,
                Node.newNumber(1), Node.newNumber(31)));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(-2147483648.0, expression.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testShiftWithFirstOutOfRangeAmountRemains() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node shift = new Node(Token.LSH, Node.newNumber(1), Node.newNumber(32));
        root.addChildToBack(NodeUtil.newExpr(shift));
        new FoldConstants(null).visit(null, shift, root.getFirstChild());
        assertSame(shift, root.getFirstChild().getFirstChild());
    }

    @Test
    public void testArrayLengthFolds() throws Exception {
        Node array = new Node(Token.ARRAYLIT,
                Node.newNumber(3), Node.newNumber(4));
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(new Node(Token.GETPROP,
                array, Node.newString("length")));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(2.0, expression.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testStringLengthFolds() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(new Node(Token.GETPROP,
                Node.newString("abc"), Node.newString("length")));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(3.0, expression.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testArrayIndexZeroFoldsAndRemovesElement() throws Exception {
        Node array = new Node(Token.ARRAYLIT,
                Node.newString("first"), Node.newString("second"));
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(new Node(Token.GETELEM,
                array, Node.newNumber(0)));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        Node result = expression.getFirstChild();
        assertEquals(Token.STRING, result.getType());
        assertEquals("first", result.getString());
        assertEquals(1, array.getChildCount());
    }

    @Test
    public void testArrayLastValidIndexFolds() throws Exception {
        Node array = new Node(Token.ARRAYLIT,
                Node.newString("first"), Node.newString("last"));
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(new Node(Token.GETELEM,
                array, Node.newNumber(1)));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals("last", expression.getFirstChild().getString());
    }

    @Test
    public void testFractionalArrayIndexRemainsUnfolded() throws Exception {
        Node array = new Node(Token.ARRAYLIT, Node.newString("x"));
        Node getElem = new Node(Token.GETELEM, array, Node.newNumber(0.5));
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(getElem);
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, getElem, expression);
        assertSame(getElem, expression.getFirstChild());
    }

    @Test
    public void testOutOfBoundsArrayIndexRemainsUnfolded() throws Exception {
        Node array = new Node(Token.ARRAYLIT, Node.newString("x"));
        Node getElem = new Node(Token.GETELEM, array, Node.newNumber(1));
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(getElem);
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, getElem, expression);
        assertSame(getElem, expression.getFirstChild());
    }

    @Test
    public void testFalseAndFoldsToFalse() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(
                new Node(Token.AND, new Node(Token.FALSE), Node.newString("x")));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(Token.FALSE, expression.getFirstChild().getType());
    }

    @Test
    public void testTrueOrFoldsToTrue() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(
                new Node(Token.OR, new Node(Token.TRUE), Node.newString("x")));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(Token.TRUE, expression.getFirstChild().getType());
    }

    @Test
    public void testLiteralNegationFolds() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(
                new Node(Token.NEG, Node.newNumber(4)));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(-4.0, expression.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testBitwiseNotFolds() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(
                new Node(Token.BITNOT, Node.newNumber(0)));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(-1.0, expression.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testNotEqualityMinimizesToInequality() throws Exception {
        Node equality = new Node(Token.EQ, Node.newNumber(1), Node.newNumber(2));
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(new Node(Token.NOT, equality));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(Token.NE, expression.getFirstChild().getType());
    }

    @Test
    public void testTypeofStringFolds() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(
                new Node(Token.TYPEOF, Node.newString("x")));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals("string", expression.getFirstChild().getString());
    }

    @Test
    public void testComparisonNumbersFolds() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = NodeUtil.newExpr(
                new Node(Token.LT, Node.newNumber(1), Node.newNumber(2)));
        root.addChildToBack(expression);
        new FoldConstants(null).visit(null, expression.getFirstChild(), expression);
        assertEquals(Token.TRUE, expression.getFirstChild().getType());
    }

    @Test
    public void testReturnUndefinedBecomesBareReturn() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node returnNode = new Node(Token.RETURN,
                Node.newString(Token.NAME, "undefined"));
        root.addChildToBack(returnNode);
        new FoldConstants(null).visit(null, returnNode, root);
        assertFalse(returnNode.hasChildren());
    }

    @Test
    public void testContainsUnicodeEscapeRecognizesUnicodeEscape() throws Exception {
        assertTrue(FoldConstants.containsUnicodeEscape("\\u1234"));
    }

    @Test
    public void testContainsUnicodeEscapeIgnoresEscapedBackslash() throws Exception {
        assertFalse(FoldConstants.containsUnicodeEscape("\\\\u1234"));
    }
}
