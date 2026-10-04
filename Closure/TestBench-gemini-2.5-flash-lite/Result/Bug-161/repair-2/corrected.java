package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

public class PeepholeFoldConstantsTest {

    // Helper method to create a Node.newNumber(double) for convenience
    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    // Helper method to create a Node.newString(String) for convenience
    private Node createStringNode(String value) {
        return Node.newString(value);
    }

    // Helper method to create a NAME node
    private Node createNameNode(String name) {
        Node nameNode = new Node(Token.NAME);
        nameNode.setString(name);
        return nameNode;
    }

    @Test
    public void testFoldTypeofString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node typeofNode = new Node(Token.TYPEOF, createStringNode("hello"));
        Node parent = new Node(Token.EXPR_RESULT, typeofNode);
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testFoldTypeofNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node typeofNode = new Node(Token.TYPEOF, createNumberNode(123));
        Node parent = new Node(Token.EXPR_RESULT, typeofNode);
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }

    @Test
    public void testFoldTypeofBoolean() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node typeofNode = new Node(Token.TYPEOF, new Node(Token.TRUE));
        Node parent = new Node(Token.EXPR_RESULT, typeofNode);
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("boolean", result.getString());
    }

    @Test
    public void testFoldTypeofObject() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node typeofNode = new Node(Token.TYPEOF, new Node(Token.OBJECTLIT));
        Node parent = new Node(Token.EXPR_RESULT, typeofNode);
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofUndefined() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node typeofNode = new Node(Token.TYPEOF, new Node(Token.VOID));
        Node parent = new Node(Token.EXPR_RESULT, typeofNode);
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testFoldTypeofNameUndefined() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node typeofNode = new Node(Token.TYPEOF, createNameNode("undefined"));
        Node parent = new Node(Token.EXPR_RESULT, typeofNode);
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testFoldNotTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node notNode = new Node(Token.NOT, new Node(Token.TRUE));
        Node parent = new Node(Token.EXPR_RESULT, notNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldNotFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node notNode = new Node(Token.NOT, new Node(Token.FALSE));
        Node parent = new Node(Token.EXPR_RESULT, notNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldNotZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node notNode = new Node(Token.NOT, createNumberNode(0));
        Node parent = new Node(Token.EXPR_RESULT, notNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldNotOne() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node notNode = new Node(Token.NOT, createNumberNode(1));
        Node parent = new Node(Token.EXPR_RESULT, notNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldPosNumeric() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node posNode = new Node(Token.POS, createNumberNode(5));
        Node parent = new Node(Token.EXPR_RESULT, posNode);
        Node result = peephole.optimizeSubtree(posNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldNegNumeric() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node negNode = new Node(Token.NEG, createNumberNode(5));
        Node parent = new Node(Token.EXPR_RESULT, negNode);
        Node result = peephole.optimizeSubtree(negNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldNegNaN() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node nanNode = createNumberNode(Double.NaN);
        Node negNode = new Node(Token.NEG, nanNode);
        Node parent = new Node(Token.EXPR_RESULT, negNode);
        Node result = peephole.optimizeSubtree(negNode);
        assertEquals(Token.NAME, result.getType());
        assertEquals("NaN", result.getString());
    }

    @Test
    public void testFoldBitwiseNotInteger() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node bitNotNode = new Node(Token.BITNOT, createNumberNode(5)); // 5 is 0101, ~5 is ...11111010 which is -6
        Node parent = new Node(Token.EXPR_RESULT, bitNotNode);
        Node result = peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-6.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldBitwiseNotMaxInt() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node bitNotNode = new Node(Token.BITNOT, createNumberNode(Integer.MAX_VALUE));
        Node parent = new Node(Token.EXPR_RESULT, bitNotNode);
        Node result = peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals((double)~Integer.MAX_VALUE, result.getDouble(), 0);
    }

    @Test
    public void testFoldBitwiseNotMinInt() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node bitNotNode = new Node(Token.BITNOT, createNumberNode(Integer.MIN_VALUE));
        Node parent = new Node(Token.EXPR_RESULT, bitNotNode);
        Node result = peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals((double)~Integer.MIN_VALUE, result.getDouble(), 0);
    }

    @Test
    public void testFoldBitwiseNotFractional() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node bitNotNode = new Node(Token.BITNOT, createNumberNode(5.5));
        Node parent = new Node(Token.EXPR_RESULT, bitNotNode);
        // Expect an error to be reported, but the node should not be changed.
        Node result = peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.BITNOT, result.getType());
        assertEquals(5.5, result.getFirstChild().getDouble(), 0);
    }

    @Test
    public void testFoldBitwiseNotOutOfRange() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node bitNotNode = new Node(Token.BITNOT, createNumberNode(Math.pow(2, 31)));
        Node parent = new Node(Token.EXPR_RESULT, bitNotNode);
        // Expect an error to be reported, but the node should not be changed.
        Node result = peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.BITNOT, result.getType());
        assertEquals(Math.pow(2, 31), result.getFirstChild().getDouble(), 0);
    }

    @Test
    public void testFoldAddConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node addNode = new Node(Token.ADD, createNumberNode(5), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, addNode);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(12.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldAddStringAndNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node addNode = new Node(Token.ADD, createStringNode("hello"), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, addNode);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello7", result.getString());
    }

    @Test
    public void testFoldAddNumberAndString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node addNode = new Node(Token.ADD, createNumberNode(7), createStringNode("hello"));
        Node parent = new Node(Token.EXPR_RESULT, addNode);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("7hello", result.getString());
    }

    @Test
    public void testFoldAddTwoStrings() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node addNode = new Node(Token.ADD, createStringNode("hello"), createStringNode(" world"));
        Node parent = new Node(Token.EXPR_RESULT, addNode);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello world", result.getString());
    }

    @Test
    public void testFoldSubConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node subNode = new Node(Token.SUB, createNumberNode(10), createNumberNode(3));
        Node parent = new Node(Token.EXPR_RESULT, subNode);
        Node result = peephole.optimizeSubtree(subNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldMulConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node mulNode = new Node(Token.MUL, createNumberNode(5), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, mulNode);
        Node result = peephole.optimizeSubtree(mulNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(35.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldDivConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node divNode = new Node(Token.DIV, createNumberNode(10), createNumberNode(2));
        Node parent = new Node(Token.EXPR_RESULT, divNode);
        Node result = peephole.optimizeSubtree(divNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldModConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node modNode = new Node(Token.MOD, createNumberNode(10), createNumberNode(3));
        Node parent = new Node(Token.EXPR_RESULT, modNode);
        Node result = peephole.optimizeSubtree(modNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldBitwiseAndConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node bitAndNode = new Node(Token.BITAND, createNumberNode(5), createNumberNode(3)); // 5 (0101) & 3 (0011) = 1 (0001)
        Node parent = new Node(Token.EXPR_RESULT, bitAndNode);
        Node result = peephole.optimizeSubtree(bitAndNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldBitwiseOrConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node bitOrNode = new Node(Token.BITOR, createNumberNode(5), createNumberNode(3)); // 5 (0101) | 3 (0011) = 7 (0111)
        Node parent = new Node(Token.EXPR_RESULT, bitOrNode);
        Node result = peephole.optimizeSubtree(bitOrNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldBitwiseXorConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node bitXorNode = new Node(Token.BITXOR, createNumberNode(5), createNumberNode(3)); // 5 (0101) ^ 3 (0011) = 6 (0110)
        Node parent = new Node(Token.EXPR_RESULT, bitXorNode);
        Node result = peephole.optimizeSubtree(bitXorNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldShiftLeftConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node shiftNode = new Node(Token.LSH, createNumberNode(5), createNumberNode(2)); // 5 (0101) << 2 = 20 (10100)
        Node parent = new Node(Token.EXPR_RESULT, shiftNode);
        Node result = peephole.optimizeSubtree(shiftNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(20.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldShiftRightConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node shiftNode = new Node(Token.RSH, createNumberNode(20), createNumberNode(2)); // 20 (10100) >> 2 = 5 (00101)
        Node parent = new Node(Token.EXPR_RESULT, shiftNode);
        Node result = peephole.optimizeSubtree(shiftNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldUnsignedShiftRightConstants() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node shiftNode = new Node(Token.URSH, createNumberNode(-20), createNumberNode(2)); // -20 >>> 2. In 32-bit unsigned: 11111111111111111111111111101100 >>> 2 = 00111111111111111111111111111101 which is 1073741821
        Node parent = new Node(Token.EXPR_RESULT, shiftNode);
        Node result = peephole.optimizeSubtree(shiftNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1073741821.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldShiftAmountOutOfBound() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node shiftNode = new Node(Token.LSH, createNumberNode(5), createNumberNode(32));
        Node parent = new Node(Token.EXPR_RESULT, shiftNode);
        // Expect an error to be reported, but the node should not be changed.
        Node result = peephole.optimizeSubtree(shiftNode);
        assertEquals(Token.LSH, result.getType());
        assertEquals(5, result.getFirstChild().getDouble(), 0);
        assertEquals(32, result.getLastChild().getDouble(), 0);
    }

    @Test
    public void testFoldComparisonEqTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node eqNode = new Node(Token.EQ, createNumberNode(5), createNumberNode(5));
        Node parent = new Node(Token.EXPR_RESULT, eqNode);
        Node result = peephole.optimizeSubtree(eqNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonEqFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node eqNode = new Node(Token.EQ, createNumberNode(5), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, eqNode);
        Node result = peephole.optimizeSubtree(eqNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldComparisonNeTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node neNode = new Node(Token.NE, createNumberNode(5), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, neNode);
        Node result = peephole.optimizeSubtree(neNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonNeFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node neNode = new Node(Token.NE, createNumberNode(5), createNumberNode(5));
        Node parent = new Node(Token.EXPR_RESULT, neNode);
        Node result = peephole.optimizeSubtree(neNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldComparisonLtTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node ltNode = new Node(Token.LT, createNumberNode(5), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, ltNode);
        Node result = peephole.optimizeSubtree(ltNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonLtFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node ltNode = new Node(Token.LT, createNumberNode(7), createNumberNode(5));
        Node parent = new Node(Token.EXPR_RESULT, ltNode);
        Node result = peephole.optimizeSubtree(ltNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldComparisonLeTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node leNode = new Node(Token.LE, createNumberNode(5), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, leNode);
        Node result = peephole.optimizeSubtree(leNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonLeFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node leNode = new Node(Token.LE, createNumberNode(7), createNumberNode(5));
        Node parent = new Node(Token.EXPR_RESULT, leNode);
        Node result = peephole.optimizeSubtree(leNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldComparisonGeTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node geNode = new Node(Token.GE, createNumberNode(7), createNumberNode(5));
        Node parent = new Node(Token.EXPR_RESULT, geNode);
        Node result = peephole.optimizeSubtree(geNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonGeFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node geNode = new Node(Token.GE, createNumberNode(5), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, geNode);
        Node result = peephole.optimizeSubtree(geNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldComparisonGtTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node gtNode = new Node(Token.GT, createNumberNode(7), createNumberNode(5));
        Node parent = new Node(Token.EXPR_RESULT, gtNode);
        Node result = peephole.optimizeSubtree(gtNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonGtFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node gtNode = new Node(Token.GT, createNumberNode(5), createNumberNode(7));
        Node parent = new Node(Token.EXPR_RESULT, gtNode);
        Node result = peephole.optimizeSubtree(gtNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldGetElemArrayLiteral() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node arrayLit = new Node(Token.ARRAYLIT, createNumberNode(10), createNumberNode(20));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, createNumberNode(1));
        Node parent = new Node(Token.EXPR_RESULT, getElemNode);
        Node result = peephole.optimizeSubtree(getElemNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(20.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldGetElemArrayLiteralOutOfBounds() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node arrayLit = new Node(Token.ARRAYLIT, createNumberNode(10), createNumberNode(20));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, createNumberNode(2));
        Node parent = new Node(Token.EXPR_RESULT, getElemNode);
        // Expect an error to be reported, but the node should not be changed.
        Node result = peephole.optimizeSubtree(getElemNode);
        assertEquals(Token.GETELEM, result.getType());
        assertEquals(arrayLit, result.getFirstChild());
        assertEquals(createNumberNode(2), result.getLastChild());
    }

    @Test
    public void testFoldGetElemArrayLiteralNegativeIndex() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node arrayLit = new Node(Token.ARRAYLIT, createNumberNode(10), createNumberNode(20));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, createNumberNode(-1));
        Node parent = new Node(Token.EXPR_RESULT, getElemNode);
        // Expect an error to be reported, but the node should not be changed.
        Node result = peephole.optimizeSubtree(getElemNode);
        assertEquals(Token.GETELEM, result.getType());
        assertEquals(arrayLit, result.getFirstChild());
        assertEquals(createNumberNode(-1), result.getLastChild());
    }

    @Test
    public void testFoldGetPropLengthArrayLiteral() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node arrayLit = new Node(Token.ARRAYLIT, createNumberNode(10), createNumberNode(20), createNumberNode(30));
        Node getPropNode = new Node(Token.GETPROP, arrayLit, createStringNode("length"));
        Node parent = new Node(Token.EXPR_RESULT, getPropNode);
        Node result = peephole.optimizeSubtree(getPropNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldGetPropLengthStringLiteral() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node stringLit = createStringNode("hello");
        Node getPropNode = new Node(Token.GETPROP, stringLit, createStringNode("length"));
        Node parent = new Node(Token.EXPR_RESULT, getPropNode);
        Node result = peephole.optimizeSubtree(getPropNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldAssignAdd() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = createNumberNode(5);
        Node right = new Node(Token.ADD, createNumberNode(2), createNumberNode(3));
        Node assignNode = new Node(Token.ASSIGN, left, right);
        Node parent = new Node(Token.EXPR_RESULT, assignNode);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_ADD, result.getType());
        assertEquals(left, result.getFirstChild());
        assertEquals(createNumberNode(3), result.getLastChild());
    }

    @Test
    public void testFoldAndOrTrueShortCircuit() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = new Node(Token.TRUE);
        Node right = createNumberNode(10);
        Node andNode = new Node(Token.AND, left, right);
        Node parent = new Node(Token.EXPR_RESULT, andNode);
        Node result = peephole.optimizeSubtree(andNode);
        assertEquals(left, result); // Should be the left side (true)
    }

    @Test
    public void testFoldAndOrFalseShortCircuit() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = new Node(Token.FALSE);
        Node right = createNumberNode(10);
        Node andNode = new Node(Token.AND, left, right);
        Node parent = new Node(Token.EXPR_RESULT, andNode);
        Node result = peephole.optimizeSubtree(andNode);
        assertEquals(left, result); // Should be the left side (false)
    }

    @Test
    public void testFoldOrTrueShortCircuit() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = new Node(Token.TRUE);
        Node right = createNumberNode(10);
        Node orNode = new Node(Token.OR, left, right);
        Node parent = new Node(Token.EXPR_RESULT, orNode);
        Node result = peephole.optimizeSubtree(orNode);
        assertEquals(left, result); // Should be the left side (true)
    }

    @Test
    public void testFoldOrFalseShortCircuit() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = new Node(Token.FALSE);
        Node right = createNumberNode(10);
        Node orNode = new Node(Token.OR, left, right);
        Node parent = new Node(Token.EXPR_RESULT, orNode);
        Node result = peephole.optimizeSubtree(orNode);
        assertEquals(right, result); // Should be the right side
    }

    @Test
    public void testFoldLeftChildOpMul() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = new Node(Token.MUL, createNumberNode(2), createNumberNode(3));
        Node right = createNumberNode(4);
        Node mulNode = new Node(Token.MUL, left, right);
        Node parent = new Node(Token.EXPR_RESULT, mulNode);
        Node result = peephole.optimizeSubtree(mulNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(24.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldLeftChildOpAdd() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = new Node(Token.ADD, createNumberNode(2), createNumberNode(3));
        Node right = createNumberNode(4);
        Node addNode = new Node(Token.ADD, left, right);
        Node parent = new Node(Token.EXPR_RESULT, addNode);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(9.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldInstanceofFalseLiteral() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = createNumberNode(5);
        Node right = createNameNode("Object");
        Node instanceofNode = new Node(Token.INSTANCEOF, left, right);
        Node parent = new Node(Token.EXPR_RESULT, instanceofNode);
        Node result = peephole.optimizeSubtree(instanceofNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldInstanceofTrueObject() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node left = new Node(Token.OBJECTLIT); // Representing an object
        Node right = createNameNode("Object");
        Node instanceofNode = new Node(Token.INSTANCEOF, left, right);
        Node parent = new Node(Token.EXPR_RESULT, instanceofNode);
        Node result = peephole.optimizeSubtree(instanceofNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldCtorCallString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node stringCtor = createNameNode("String");
        Node value = createStringNode("test");
        Node newStringNode = new Node(Token.NEW, stringCtor, value);
        Node getElemNode = new Node(Token.GETELEM, new Node(Token.OBJECTLIT), newStringNode); // Simulate `obj[new String('test')]`
        Node parent = new Node(Token.EXPR_RESULT, getElemNode);
        Node result = peephole.optimizeSubtree(getElemNode);
        assertEquals(Token.GETELEM, result.getType());
        assertEquals(createStringNode("test"), result.getLastChild());
    }

    @Test
    public void testFoldCtorCallStringEmpty() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node stringCtor = createNameNode("String");
        Node newStringNode = new Node(Token.NEW, stringCtor); // Simulate `obj[new String()]`
        Node getElemNode = new Node(Token.GETELEM, new Node(Token.OBJECTLIT), newStringNode);
        Node parent = new Node(Token.EXPR_RESULT, getElemNode);
        Node result = peephole.optimizeSubtree(getElemNode);
        assertEquals(Token.GETELEM, result.getType());
        assertEquals(createStringNode(""), result.getLastChild());
    }

    @Test
    public void testTryReduceVoidNonZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node voidNode = new Node(Token.VOID, createNumberNode(1));
        Node parent = new Node(Token.EXPR_RESULT, voidNode);
        Node result = peephole.optimizeSubtree(voidNode);
        assertEquals(Token.VOID, result.getType());
        assertEquals(createNumberNode(1), result.getFirstChild());
    }

    @Test
    public void testTryReduceVoidZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants();
        Node voidNode = new Node(Token.VOID, createNumberNode(0));
        Node parent = new Node(Token.EXPR_RESULT, voidNode);
        Node result = peephole.optimizeSubtree(voidNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.0, result.getDouble(), 0);
    }
}
