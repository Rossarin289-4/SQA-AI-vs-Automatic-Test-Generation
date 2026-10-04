package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.jstype.TernaryValue;

public class PeepholeFoldConstantsTest {
    @Test
    public void testFoldNumberTypeof() throws Exception {
        Node root = IR.exprResult(new Node(Token.TYPEOF, IR.number(4)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals("number", root.getFirstChild().getString());
    }

    @Test
    public void testFoldStringTypeof() throws Exception {
        Node root = IR.exprResult(new Node(Token.TYPEOF, IR.string("x")));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals("string", root.getFirstChild().getString());
    }

    @Test
    public void testFoldBooleanTypeof() throws Exception {
        Node root = IR.exprResult(new Node(Token.TYPEOF, IR.trueNode()));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals("boolean", root.getFirstChild().getString());
    }

    @Test
    public void testFoldVoidTypeof() throws Exception {
        Node root = IR.exprResult(new Node(Token.TYPEOF, IR.voidNode(IR.number(0))));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals("undefined", root.getFirstChild().getString());
    }

    @Test
    public void testFoldArrayLength() throws Exception {
        Node root = IR.exprResult(IR.getprop(IR.arraylit(IR.number(1), IR.number(2)), IR.string("length")));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(2.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldEmptyArrayLength() throws Exception {
        Node root = IR.exprResult(IR.getprop(IR.arraylit(), IR.string("length")));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(0.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldStringLength() throws Exception {
        Node root = IR.exprResult(IR.getprop(IR.string("abc"), IR.string("length")));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(3.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldArrayIndexZero() throws Exception {
        Node root = IR.exprResult(IR.getelem(IR.arraylit(IR.number(7), IR.number(8)), IR.number(0)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(7.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldLastArrayIndex() throws Exception {
        Node root = IR.exprResult(IR.getelem(IR.arraylit(IR.number(7), IR.number(8)), IR.number(1)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(8.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testLeaveArrayIndexAtLengthUnfolded() throws Exception {
        Node access = IR.getelem(IR.arraylit(IR.number(7)), IR.number(1));
        Node root = IR.exprResult(access);
        new PeepholeFoldConstants(false).optimizeSubtree(access);
        assertEquals(Token.GETELEM, root.getFirstChild().getType());
    }

    @Test
    public void testLeaveFractionalArrayIndexUnfolded() throws Exception {
        Node access = IR.getelem(IR.arraylit(IR.number(7)), IR.number(0.5));
        Node root = IR.exprResult(access);
        new PeepholeFoldConstants(false).optimizeSubtree(access);
        assertEquals(Token.GETELEM, root.getFirstChild().getType());
    }

    @Test
    public void testFoldAddition() throws Exception {
        Node root = IR.exprResult(IR.add(IR.number(2), IR.number(3)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(5.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldSubtraction() throws Exception {
        Node root = IR.exprResult(IR.sub(IR.number(9), IR.number(4)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(5.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldMultiplication() throws Exception {
        Node root = IR.exprResult(new Node(Token.MUL, IR.number(3), IR.number(4)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(12.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldDivision() throws Exception {
        Node root = IR.exprResult(new Node(Token.DIV, IR.number(8), IR.number(2)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(4.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testDoesNotFoldDivisionByZero() throws Exception {
        Node operation = new Node(Token.DIV, IR.number(8), IR.number(0));
        Node root = IR.exprResult(operation);
        new PeepholeFoldConstants(false).optimizeSubtree(operation);
        assertEquals(Token.DIV, root.getFirstChild().getType());
    }

    @Test
    public void testFoldRemainder() throws Exception {
        Node root = IR.exprResult(new Node(Token.MOD, IR.number(8), IR.number(3)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(2.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldNegativeNumber() throws Exception {
        Node root = IR.exprResult(IR.neg(IR.number(5)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(-5.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldBitwiseNotAtIntegerMaximum() throws Exception {
        Node root = IR.exprResult(new Node(Token.BITNOT, IR.number(2147483647.0)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(-2147483648.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testDoNotFoldBitwiseNotAboveIntegerMaximum() throws Exception {
        Node operation = new Node(Token.BITNOT, IR.number(2147483648.0));
        Node root = IR.exprResult(operation);
        new PeepholeFoldConstants(false).optimizeSubtree(operation);
        assertEquals(Token.BITNOT, root.getFirstChild().getType());
    }

    @Test
    public void testFoldLeftShiftAtLargestValidAmount() throws Exception {
        Node root = IR.exprResult(new Node(Token.LSH, IR.number(1), IR.number(31)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(-2147483648.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testDoNotFoldShiftAmountAtUpperBoundary() throws Exception {
        Node operation = new Node(Token.LSH, IR.number(1), IR.number(32));
        Node root = IR.exprResult(operation);
        new PeepholeFoldConstants(false).optimizeSubtree(operation);
        assertEquals(Token.LSH, root.getFirstChild().getType());
    }

    @Test
    public void testFoldUnsignedRightShift() throws Exception {
        Node root = IR.exprResult(new Node(Token.URSH, IR.number(-1), IR.number(1)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(2147483647.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldEqualNumericComparison() throws Exception {
        Node root = IR.exprResult(IR.eq(IR.number(3), IR.number(3)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(Token.TRUE, root.getFirstChild().getType());
    }

    @Test
    public void testFoldUnequalStringComparison() throws Exception {
        Node root = IR.exprResult(new Node(Token.SHEQ, IR.string("a"), IR.string("b")));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(Token.FALSE, root.getFirstChild().getType());
    }

    @Test
    public void testFoldFalseOrReturnsRightOperand() throws Exception {
        Node root = IR.exprResult(IR.or(IR.falseNode(), IR.number(6)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(6.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldTrueAndReturnsRightOperand() throws Exception {
        Node root = IR.exprResult(IR.and(IR.trueNode(), IR.number(6)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(6.0, root.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFoldVoidWithNonzeroLiteral() throws Exception {
        Node root = IR.exprResult(IR.voidNode(IR.number(2)));
        new PeepholeFoldConstants(false).optimizeSubtree(root.getFirstChild());
        assertEquals(0.0, root.getFirstChild().getDouble(), 0.0);
    }
}
