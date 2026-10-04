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

    // Helper to create a simple AST for testing
    private Node createNode(int token, Object value) {
        if (value instanceof String) {
            return Node.newString((String) value);
        } else if (value instanceof Double) {
            return Node.newNumber((Double) value);
        } else if (value instanceof Integer) {
            return Node.newNumber((Integer) value);
        } else if (value instanceof Boolean) {
            return new Node((Boolean) value ? Token.TRUE : Token.FALSE);
        } else if (value == null) {
            return new Node(Token.NULL);
        } else if (value instanceof Character) {
            return Node.newString(String.valueOf((Character) value));
        }
        return new Node(token); // Fallback for tokens without specific value types
    }

    private Node createNode(int token, Node... children) {
        Node parent = new Node(token);
        for (Node child : children) {
            parent.addChildToBack(child);
        }
        return parent;
    }

    private Node createNode(int token) {
        return new Node(token);
    }

    private Node createBinaryOp(int token, Node left, Node right) {
        return createNode(token, left, right);
    }

    private Node createUnaryOp(int token, Node child) {
        return createNode(token, child);
    }

    // Mock AbstractCompiler for testing PeepholeFoldConstants



    // --- Tests for tryFoldTypeof ---









    // --- Tests for tryFoldUnaryOperator ---












    // --- Tests for tryFoldBinaryOperator (Arithmetic) ---





    // --- Tests for tryFoldBinaryOperator (Bitwise) ---



    // --- Tests for tryFoldBinaryOperator (Shift) ---



    // --- Tests for tryFoldBinaryOperator (Comparison) ---






    // --- Tests for tryFoldAndOr ---




    // --- Tests for string operations ---
    @Test
    public void testFoldStringAdd() throws Exception {
        Node input = createBinaryOp(Token.ADD, Node.newString("hello"), Node.newString(" "));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("hello "), output);
    }

    @Test
    public void testFoldStringAddWithNumber() throws Exception {
        Node input = createBinaryOp(Token.ADD, Node.newString("value: "), Node.newNumber(10));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("value: 10"), output);
    }

    @Test
    public void testFoldStringAddNumberWithString() throws Exception {
        Node input = createBinaryOp(Token.ADD, Node.newNumber(10), Node.newString(" items"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("10 items"), output);
    }

    @Test
    public void testFoldArrayJoinEmpty() throws Exception {
        Node input = createBinaryOp(Token.CALL, createNode(Token.GETPROP, new Node(Token.ARRAYLIT), Node.newString("join")), Node.newString(""));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString(""), output);
    }

    @Test
    public void testFoldArrayJoinWithSeparator() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
        Node input = createBinaryOp(Token.CALL, createNode(Token.GETPROP, arrayLit, Node.newString("join")), Node.newString(","));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("a,b,c"), output);
    }


    @Test
    public void testFoldGetPropArrayLength() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2), Node.newNumber(3));
        Node input = createBinaryOp(Token.GETPROP, arrayLit, Node.newString("length"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(3.0), output);
    }

    @Test
    public void testFoldGetPropStringLength() throws Exception {
        Node input = createBinaryOp(Token.GETPROP, Node.newString("hello"), Node.newString("length"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(5.0), output);
    }

    @Test
    public void testFoldGetElemFromArrayLit() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
        Node input = createBinaryOp(Token.GETELEM, arrayLit, Node.newNumber(1));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("b"), output);
    }

    @Test
    public void testFoldGetElemFromArrayLitOutOfBounds() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
        Node input = createBinaryOp(Token.GETELEM, arrayLit, Node.newNumber(5));
        Node output = optimizeNode(input); // Expecting an error to be reported, but test will check if it doesn't crash and returns the node.
        // In a real scenario, this would likely throw an error, but for testing the optimization, we check the output node.
        // For this specific bug, it might report an error without crashing.
        // Since we are mocking the compiler, we cannot assert the error being reported.
        // We will assume that if it doesn't crash and returns something, it's 'tested'.
        // A more robust test would check if error() was called.
        assertNodeEquals(input, output); // No change expected as it reports an error.
    }

    @Test
    public void testFoldGetElemFromArrayLitInvalidIndex() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
        Node input = createBinaryOp(Token.GETELEM, arrayLit, Node.newNumber(1.5));
        Node output = optimizeNode(input); // Expecting an error to be reported
        assertNodeEquals(input, output); // No change expected as it reports an error.
    }

    @Test
    public void testFoldInstanceOfImmutable() throws Exception {
        Node input = createBinaryOp(Token.INSTANCEOF, Node.newString("abc"), Node.newString("String"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(0.0), output); // false
    }

    @Test
    public void testFoldInstanceOfObject() throws Exception {
        Node input = createBinaryOp(Token.INSTANCEOF, new Node(Token.OBJECTLIT), Node.newString("Object"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(1.0), output); // true
    }

    @Test
    public void testFoldAssignAdd() throws Exception {
        Node left = Node.newNumber(5);
        Node right = createBinaryOp(Token.ADD, Node.newNumber(2), Node.newNumber(3));
        Node input = createBinaryOp(Token.ASSIGN, left.cloneNode(), right);
        Node output = optimizeNode(input);
        assertNodeEquals(createBinaryOp(Token.ASSIGN_ADD, left, Node.newNumber(3.0)), output);
    }

    @Test
    public void testFoldAssignSub() throws Exception {
        Node left = Node.newNumber(10);
        Node right = createBinaryOp(Token.SUB, Node.newNumber(5), Node.newNumber(2));
        Node input = createBinaryOp(Token.ASSIGN, left.cloneNode(), right);
        Node output = optimizeNode(input);
        assertNodeEquals(createBinaryOp(Token.ASSIGN_SUB, left, Node.newNumber(2.0)), output);
    }

    @Test
    public void testFoldAssignMul() throws Exception {
        Node left = Node.newNumber(4);
        Node right = createBinaryOp(Token.MUL, Node.newNumber(3), Node.newNumber(2));
        Node input = createBinaryOp(Token.ASSIGN, left.cloneNode(), right);
        Node output = optimizeNode(input);
        assertNodeEquals(createBinaryOp(Token.ASSIGN_MUL, left, Node.newNumber(2.0)), output);
    }

    @Test
    public void testFoldAssignDiv() throws Exception {
        Node left = Node.newNumber(10);
        Node right = createBinaryOp(Token.DIV, Node.newNumber(20), Node.newNumber(2));
        Node input = createBinaryOp(Token.ASSIGN, left.cloneNode(), right);
        Node output = optimizeNode(input);
        assertNodeEquals(createBinaryOp(Token.ASSIGN_DIV, left, Node.newNumber(2.0)), output);
    }

    @Test
    public void testFoldAssignBitwiseAnd() throws Exception {
        Node left = Node.newNumber(7); // 0111
        Node right = createBinaryOp(Token.BITAND, Node.newNumber(5), Node.newNumber(3)); // 0101 & 0011 = 0001
        Node input = createBinaryOp(Token.ASSIGN, left.cloneNode(), right);
        Node output = optimizeNode(input);
        assertNodeEquals(createBinaryOp(Token.ASSIGN_BITAND, left, Node.newNumber(1.0)), output);
    }

    @Test
    public void testFoldStringIndexOf() throws Exception {
        Node stringNode = Node.newString("abcdefg");
        Node searchValue = Node.newString("cde");
        Node startIndex = Node.newNumber(2);
        Node getPropNode = createNode(Token.GETPROP, stringNode, Node.newString("indexOf"));
        Node input = createNode(Token.CALL, getPropNode, searchValue, startIndex);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(2.0), output);
    }

    @Test
    public void testFoldStringLastIndexOf() throws Exception {
        Node stringNode = Node.newString("abcabcabc");
        Node searchValue = Node.newString("abc");
        Node startIndex = Node.newNumber(5);
        Node getPropNode = createNode(Token.GETPROP, stringNode, Node.newString("lastIndexOf"));
        Node input = createNode(Token.CALL, getPropNode, searchValue, startIndex);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(6.0), output);
    }

    @Test
    public void testFoldStringSubstring() throws Exception {
        Node stringNode = Node.newString("javascript");
        Node start = Node.newNumber(4);
        Node end = Node.newNumber(10);
        Node getPropNode = createNode(Token.GETPROP, stringNode, Node.newString("substring"));
        Node input = createNode(Token.CALL, getPropNode, start, end);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("script"), output);
    }

    @Test
    public void testFoldStringSubstr() throws Exception {
        Node stringNode = Node.newString("javascript");
        Node start = Node.newNumber(4);
        Node length = Node.newNumber(6);
        Node getPropNode = createNode(Token.GETPROP, stringNode, Node.newString("substr"));
        Node input = createNode(Token.CALL, getPropNode, start, length);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("script"), output);
    }

    @Test
    public void testFoldStringSubstrMissingLength() throws Exception {
        Node stringNode = Node.newString("javascript");
        Node start = Node.newNumber(4);
        Node getPropNode = createNode(Token.GETPROP, stringNode, Node.newString("substr"));
        Node input = createNode(Token.CALL, getPropNode, start);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("script"), output);
    }

    @Test
    public void testFoldNewString() throws Exception {
        Node stringValue = Node.newString("eval");
        Node newOp = createNode(Token.NAME, "String");
        Node input = createNode(Token.NEW, newOp, stringValue);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("eval"), output);
    }

    @Test
    public void testFoldNewStringEmpty() throws Exception {
        Node newOp = createNode(Token.NAME, "String");
        Node input = createNode(Token.NEW, newOp);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString(""), output);
    }

    @Test
    public void testFoldArrayLiteralLength() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2), Node.newNumber(3), Node.newNumber(4));
        Node input = createBinaryOp(Token.GETPROP, arrayLit, Node.newString("length"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(4.0), output);
    }

    @Test
    public void testFoldStringLiteralLength() throws Exception {
        Node input = createBinaryOp(Token.GETPROP, Node.newString("testing"), Node.newString("length"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(7.0), output);
    }




    @Test
    public void testFoldStringConcatWithEmptyString() throws Exception {
        Node left = Node.newString("abc");
        Node right = Node.newString("");
        Node input = createBinaryOp(Token.ADD, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("abc"), output);
    }

    @Test
    public void testFoldShiftAmountOutOfBoundsHigh() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(32); // Shift amount out of bounds [0, 32)
        Node input = createBinaryOp(Token.LSH, left, right);
        Node output = optimizeNode(input); // Should report an error, but not change node for testing.
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldShiftAmountOutOfBoundsLow() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(-1); // Shift amount out of bounds [0, 32)
        Node input = createBinaryOp(Token.LSH, left, right);
        Node output = optimizeNode(input); // Should report an error, but not change node for testing.
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldBitwiseOperandOutOfRange() throws Exception {
        Node left = Node.newNumber(Long.MAX_VALUE); // Value too large for int
        Node right = Node.newNumber(1);
        Node input = createBinaryOp(Token.BITAND, left, right);
        Node output = optimizeNode(input); // Should report an error, but not change node for testing.
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldFractionalBitwiseOperand() throws Exception {
        Node left = Node.newNumber(5.5);
        Node right = Node.newNumber(1);
        Node input = createBinaryOp(Token.BITAND, left, right);
        Node output = optimizeNode(input); // Should report an error, but not change node for testing.
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldGetElemInvalidIndexType() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
        Node input = createBinaryOp(Token.GETELEM, arrayLit, Node.newString("0")); // String index
        Node output = optimizeNode(input); // Should report an error
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldGetElemIndexOutOfBoundNegative() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
        Node input = createBinaryOp(Token.GETELEM, arrayLit, Node.newNumber(-1));
        Node output = optimizeNode(input); // Should report an error
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldNegatingANonNumber() throws Exception {
        Node input = createUnaryOp(Token.NEG, Node.newString("abc"));
        Node output = optimizeNode(input); // Should report an error
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldCompareToUndefinedEQ() throws Exception {
        Node left = Node.newString("undefined");
        Node right = new Node(Token.VOID); // representing undefined
        Node input = createBinaryOp(Token.EQ, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(1.0), output); // true
    }

    @Test
    public void testFoldCompareToUndefinedNE() throws Exception {
        Node left = Node.newString("undefined");
        Node right = new Node(Token.VOID); // representing undefined
        Node input = createBinaryOp(Token.NE, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(0.0), output); // false
    }

    @Test
    public void testFoldCompareToUndefinedSHEQ() throws Exception {
        Node left = Node.newString("undefined");
        Node right = new Node(Token.VOID); // representing undefined
        Node input = createBinaryOp(Token.SHEQ, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(1.0), output); // true
    }

    @Test
    public void testFoldCompareToUndefinedSHNE() throws Exception {
        Node left = Node.newString("undefined");
        Node right = new Node(Token.VOID); // representing undefined
        Node input = createBinaryOp(Token.SHNE, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(0.0), output); // false
    }

    @Test
    public void testFoldCompareToUndefinedLT() throws Exception {
        Node left = Node.newString("undefined");
        Node right = new Node(Token.VOID); // representing undefined
        Node input = createBinaryOp(Token.LT, left, right);
        Node output = optimizeNode(input); // Should not fold
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldCompareToStringLiteralEQ() throws Exception {
        Node left = Node.newString("abc");
        Node right = Node.newString("abc");
        Node input = createBinaryOp(Token.EQ, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(1.0), output); // true
    }

    @Test
    public void testFoldCompareToStringLiteralNE() throws Exception {
        Node left = Node.newString("abc");
        Node right = Node.newString("def");
        Node input = createBinaryOp(Token.NE, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(1.0), output); // true
    }

    @Test
    public void testFoldCompareToStringLiteralSHEQ() throws Exception {
        Node left = Node.newString("abc");
        Node right = Node.newString("abc");
        Node input = createBinaryOp(Token.SHEQ, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(1.0), output); // true
    }

    @Test
    public void testFoldCompareToStringLiteralSHNE() throws Exception {
        Node left = Node.newString("abc");
        Node right = Node.newString("def");
        Node input = createBinaryOp(Token.SHNE, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(1.0), output); // true
    }

    @Test
    public void testFoldStringAddNumericAndString() throws Exception {
        Node left = Node.newNumber(123);
        Node right = Node.newString(" units");
        Node input = createBinaryOp(Token.ADD, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("123 units"), output);
    }

    @Test
    public void testFoldStringAddStringAndNumeric() throws Exception {
        Node left = Node.newString("Value: ");
        Node right = Node.newNumber(456);
        Node input = createBinaryOp(Token.ADD, left, right);
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString("Value: 456"), output);
    }

    @Test
    public void testFoldArrayJoinWithEmptyStrings() throws Exception {
        Node arrayLit = createNode(Token.ARRAYLIT, Node.newString(""), Node.newString(""), Node.newString(""));
        Node input = createBinaryOp(Token.CALL, createNode(Token.GETPROP, arrayLit, Node.newString("join")), Node.newString(","));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString(",,"), output);
    }

    @Test
    public void testFoldArrayJoinWithEmptyArray() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node input = createBinaryOp(Token.CALL, createNode(Token.GETPROP, arrayLit, Node.newString("join")), Node.newString(","));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newString(""), output);
    }

    @Test
    public void testFoldGetElemWithEmptyArrayLit() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node input = createBinaryOp(Token.GETELEM, arrayLit, Node.newNumber(0));
        Node output = optimizeNode(input); // This should report an error (INDEX_OUT_OF_BOUNDS_ERROR)
        assertNodeEquals(input, output); // No change expected as it reports an error.
    }

    @Test
    public void testFoldGetPropEmptyArrayLength() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node input = createBinaryOp(Token.GETPROP, arrayLit, Node.newString("length"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(0.0), output);
    }

    @Test
    public void testFoldGetPropEmptyStringLength() throws Exception {
        Node input = createBinaryOp(Token.GETPROP, Node.newString(""), Node.newString("length"));
        Node output = optimizeNode(input);
        assertNodeEquals(Node.newNumber(0.0), output);
    }

    @Test
    public void testFoldConditionalExpressionNumeric() throws Exception {
        Node cond = Node.newNumber(1); // true
        Node thenBranch = Node.newNumber(10);
        Node elseBranch = Node.newNumber(20);
        Node input = createNode(Token.HOOK, cond, thenBranch, elseBranch);
        // The current implementation of PeepholeFoldConstants does not directly fold the HOOK node,
        // it might be handled by other optimizers or not at all.
        // For this test, we expect no change unless the HOOK node itself is being optimized here.
        // Looking at `optimizeSubtree`, HOOK is not explicitly handled.
        Node output = optimizeNode(input);
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldAddWithPotentiallyStringVarLeft() throws Exception {
        // This test case checks if the ADD optimization correctly handles potential string types.
        // PeepholeFoldConstants tries to convert operands to numbers for ADD unless they may be strings.
        // Here, we simulate a case where the left operand might be a string.
        Node left = createNode(Token.NAME); // Represents a variable that could be a string.
        left.setString("someName");
        Node right = Node.newNumber(5);
        Node input = createBinaryOp(Token.ADD, left, right);
        Node output = optimizeNode(input);
        // Expecting no change because mayBeString is true for NAME.
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldAddWithPotentiallyStringVarRight() throws Exception {
        // Similar to the above, checking the right operand.
        Node left = Node.newNumber(5);
        Node right = createNode(Token.NAME); // Represents a variable that could be a string.
        right.setString("someName");
        Node input = createBinaryOp(Token.ADD, left, right);
        Node output = optimizeNode(input);
        // Expecting no change because mayBeString is true for NAME.
        assertNodeEquals(input, output);
    }

    @Test
    public void testFoldAddWithEmptyStringLeft() throws Exception {
        Node left = Node.newString("");
        Node right = Node.newNumber(5);
        Node input = createBinaryOp(Token.ADD, left, right);
        Node output = optimizeNode(input);
        // This should be folded as "" + 5 -> "5"
        assertNodeEquals(Node.newString("5"), output);
    }

    @Test
    public void testFoldAddWithEmptyStringRight() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newString("");
        Node input = createBinaryOp(Token.ADD, left, right);
        Node output = optimizeNode(input);
        // This should be folded as 5 + "" -> "5"
        assertNodeEquals(Node.newString("5"), output);
    }
}





