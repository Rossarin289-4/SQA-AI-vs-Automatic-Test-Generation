package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.List;
import java.util.Locale;

public class PeepholeFoldConstantsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testArrayLength() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.GETPROP,
                new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2)),
                Node.newString("length"));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testEmptyArrayLength() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.GETPROP,
                new Node(Token.ARRAYLIT), Node.newString("length"));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(0.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testStringLength() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.GETPROP,
                Node.newString("abc"), Node.newString("length"));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(3.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testArrayElementAtFirstIndex() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node array = new Node(Token.ARRAYLIT, Node.newString("first"), Node.newString("last"));
        Node expression = new Node(Token.GETELEM, array, Node.newNumber(0));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(Token.STRING, result.getType());
        assertEquals("first", result.getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testArrayElementAtLastIndex() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node array = new Node(Token.ARRAYLIT, Node.newNumber(4), Node.newNumber(9));
        Node expression = new Node(Token.GETELEM, array, Node.newNumber(1));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(Token.NUMBER, result.getType());
        assertEquals(9.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testArrayElementAtIndexZeroInSingleElementArray() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.GETELEM,
                new Node(Token.ARRAYLIT, Node.newNumber(7)), Node.newNumber(0));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(7.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testArrayIndexFractionalIsNotFolded() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.GETELEM,
                new Node(Token.ARRAYLIT, Node.newNumber(7)), Node.newNumber(0.5));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertSame(expression, result);
        assertSame(expression, root.getFirstChild());
    }

    @Test
    public void testArrayIndexAtLengthIsNotFolded() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.GETELEM,
                new Node(Token.ARRAYLIT, Node.newNumber(7)), Node.newNumber(1));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertSame(expression, result);
        assertSame(expression, root.getFirstChild());
    }

    @Test
    public void testConstantAddition() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.ADD, Node.newNumber(2), Node.newNumber(3));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testConstantSubtraction() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.SUB, Node.newNumber(9), Node.newNumber(4));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(5.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testConstantMultiplication() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.MUL, Node.newNumber(3), Node.newNumber(4));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(12.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testDivisionByZeroRemainsUnfolded() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.DIV, Node.newNumber(8), Node.newNumber(0));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertSame(expression, result);
        assertSame(expression, root.getFirstChild());
    }

    @Test
    public void testAdditionOfStrings() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.ADD, Node.newString("ab"), Node.newString("cd"));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(Token.STRING, result.getType());
        assertEquals("abcd", result.getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFoldTypeofString() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.TYPEOF, Node.newString("x"));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFoldTypeofNumber() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.TYPEOF, Node.newNumber(3));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals("number", result.getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFoldTypeofBoolean() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.TYPEOF, new Node(Token.TRUE));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals("boolean", result.getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFoldAndWithTrueLeftOperand() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node right = Node.newString("value");
        Node expression = new Node(Token.AND, new Node(Token.TRUE), right);
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertSame(right, result);
        assertSame(right, root.getFirstChild());
    }

    @Test
    public void testFoldOrWithFalseLeftOperand() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node right = Node.newString("value");
        Node expression = new Node(Token.OR, new Node(Token.FALSE), right);
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertSame(right, result);
        assertSame(right, root.getFirstChild());
    }

    @Test
    public void testLeftShiftAtZeroAmount() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.LSH, Node.newNumber(5), Node.newNumber(0));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(5.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testLeftShiftAtMaximumValidAmount() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.LSH, Node.newNumber(1), Node.newNumber(31));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(-2147483648.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testLeftShiftAtFirstInvalidAmount() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.LSH, Node.newNumber(1), Node.newNumber(32));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertSame(expression, result);
        assertSame(expression, root.getFirstChild());
    }

    @Test
    public void testUnsignedRightShiftOfNegativeOne() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node expression = new Node(Token.URSH, Node.newNumber(-1), Node.newNumber(1));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(2147483647.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFoldStringSubstring() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node target = new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substring"));
        Node expression = new Node(Token.CALL, target, Node.newNumber(1), Node.newNumber(4));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(Token.STRING, result.getType());
        assertEquals("bcd", result.getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFoldStringSubstr() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node target = new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substr"));
        Node expression = new Node(Token.CALL, target, Node.newNumber(2), Node.newNumber(3));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals("cde", result.getString());
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFoldStringIndexOfAtEnd() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node target = new Node(Token.GETPROP, Node.newString("abcabc"), Node.newString("indexOf"));
        Node expression = new Node(Token.CALL, target, Node.newString("bc"), Node.newNumber(3));
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals(4.0, result.getDouble(), 0.0);
        assertSame(result, root.getFirstChild());
    }

    @Test
    public void testFoldStringLowercase() throws Exception {
        PeepholeFoldConstants optimization = new PeepholeFoldConstants();
        Node target = new Node(Token.GETPROP, Node.newString("AbC"), Node.newString("toLowerCase"));
        Node expression = new Node(Token.CALL, target);
        Node root = new Node(Token.EXPR_RESULT, expression);

        Node result = optimization.optimizeSubtree(expression);

        assertEquals("abc", result.getString());
        assertSame(result, root.getFirstChild());
    }
}
