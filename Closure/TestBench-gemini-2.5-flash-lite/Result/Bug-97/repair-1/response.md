```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.List;

public class PeepholeFoldConstantsTest {

    private PeepholeFoldConstants createPeepholePass() {
        // The PeepholeFoldConstants constructor takes no arguments in the provided source.
        // The previous TestCompiler class was an unnecessary abstraction.
        return new PeepholeFoldConstants();
    }

    // Helper to create a Node for testing
    private Node createNode(Object value) {
        if (value instanceof String) {
            return Node.newString((String) value);
        } else if (value instanceof Double) {
            return Node.newNumber(((Double) value).doubleValue());
        } else if (value instanceof Boolean) {
            return new Node(((Boolean) value) ? Token.TRUE : Token.FALSE);
        } else if (value == null) {
            return new Node(Token.NULL);
        } else if (value instanceof Integer) {
            return Node.newNumber(((Integer) value).doubleValue());
        } else if (value instanceof Character) {
             return Node.newString(((Character) value).toString());
        }
        throw new IllegalArgumentException("Unsupported type: " + value.getClass());
    }

    // Simplified helper for creating a parent node with children
    private Node createParentNode(int type, Node... children) {
        Node parent = new Node(type);
        for (Node child : children) {
            parent.addChildToBack(child);
        }
        return parent;
    }


    // Tests for tryFoldTypeof
    @Test
    public void testFoldTypeofString() throws Exception {
        Node stringNode = Node.newString("hello");
        Node typeofNode = new Node(Token.TYPEOF, stringNode);
        Node parent = createParentNode(Token.EXPR_RESULT, typeofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(typeofNode);
        assertEquals("string", typeofNode.getParent().getString());
    }

    @Test
    public void testFoldTypeofNumber() throws Exception {
        Node numberNode = Node.newNumber(123);
        Node typeofNode = new Node(Token.TYPEOF, numberNode);
        Node parent = createParentNode(Token.EXPR_RESULT, typeofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(typeofNode);
        assertEquals("number", typeofNode.getParent().getString());
    }

    @Test
    public void testFoldTypeofBoolean() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node typeofNode = new Node(Token.TYPEOF, trueNode);
        Node parent = createParentNode(Token.EXPR_RESULT, typeofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(typeofNode);
        assertEquals("boolean", typeofNode.getParent().getString());
    }

    @Test
    public void testFoldTypeofNull() throws Exception {
        Node nullNode = new Node(Token.NULL);
        Node typeofNode = new Node(Token.TYPEOF, nullNode);
        Node parent = createParentNode(Token.EXPR_RESULT, typeofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(typeofNode);
        assertEquals("object", typeofNode.getParent().getString());
    }

    @Test
    public void testFoldTypeofObject() throws Exception {
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node typeofNode = new Node(Token.TYPEOF, objectLitNode);
        Node parent = createParentNode(Token.EXPR_RESULT, typeofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(typeofNode);
        assertEquals("object", typeofNode.getParent().getString());
    }

    @Test
    public void testFoldTypeofArray() throws Exception {
        Node arrayLitNode = new Node(Token.ARRAYLIT);
        Node typeofNode = new Node(Token.TYPEOF, arrayLitNode);
        Node parent = createParentNode(Token.EXPR_RESULT, typeofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(typeofNode);
        assertEquals("object", typeofNode.getParent().getString());
    }

    @Test
    public void testFoldTypeofUndefinedName() throws Exception {
        Node undefinedNameNode = new Node(Token.NAME, "undefined");
        Node typeofNode = new Node(Token.TYPEOF, undefinedNameNode);
        Node parent = createParentNode(Token.EXPR_RESULT, typeofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(typeofNode);
        assertEquals("undefined", typeofNode.getParent().getString());
    }

    @Test
    public void testFoldTypeofUndefinedVoid() throws Exception {
        Node voidNode = new Node(Token.VOID, Node.newNumber(1)); // void 1 is undefined
        Node typeofNode = new Node(Token.TYPEOF, voidNode);
        Node parent = createParentNode(Token.EXPR_RESULT, typeofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(typeofNode);
        assertEquals("undefined", typeofNode.getParent().getString());
    }

    // Tests for tryFoldUnaryOperator
    @Test
    public void testFoldNotTrue() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        Node parent = createParentNode(Token.EXPR_RESULT, notNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(notNode);
        assertEquals(Token.FALSE, notNode.getParent().getType());
    }

    @Test
    public void testFoldNotFalse() throws Exception {
        Node falseNode = new Node(Token.FALSE);
        Node notNode = new Node(Token.NOT, falseNode);
        Node parent = createParentNode(Token.EXPR_RESULT, notNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(notNode);
        assertEquals(Token.TRUE, notNode.getParent().getType());
    }

    @Test
    public void testFoldNegNumber() throws Exception {
        Node numberNode = Node.newNumber(5.0);
        Node negNode = new Node(Token.NEG, numberNode);
        Node parent = createParentNode(Token.EXPR_RESULT, negNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(negNode);
        assertEquals(Token.NUMBER, negNode.getParent().getType());
        assertEquals(-5.0, negNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldNegNaN() throws Exception {
        Node nanNode = Node.newNumber(Double.NaN);
        Node negNode = new Node(Token.NEG, nanNode);
        Node parent = createParentNode(Token.EXPR_RESULT, negNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(negNode);
        assertEquals(Token.NUMBER, negNode.getParent().getType());
        assertTrue(Double.isNaN(negNode.getParent().getDouble()));
    }

    @Test
    public void testFoldBitNot() throws Exception {
        Node numberNode = Node.newNumber(5); // 0101
        Node bitNotNode = new Node(Token.BITNOT, numberNode);
        Node parent = createParentNode(Token.EXPR_RESULT, bitNotNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.NUMBER, bitNotNode.getParent().getType());
        assertEquals(-6.0, bitNotNode.getParent().getDouble(), 1e-9); // In Java, ~5 is -6
    }

    @Test
    public void testFoldBitNotMaxInt() throws Exception {
        Node maxIntNode = Node.newNumber(Integer.MAX_VALUE);
        Node bitNotNode = new Node(Token.BITNOT, maxIntNode);
        Node parent = createParentNode(Token.EXPR_RESULT, bitNotNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.NUMBER, bitNotNode.getParent().getType());
        assertEquals((double) ~Integer.MAX_VALUE, bitNotNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldBitNotMinInt() throws Exception {
        Node minIntNode = Node.newNumber(Integer.MIN_VALUE);
        Node bitNotNode = new Node(Token.BITNOT, minIntNode);
        Node parent = createParentNode(Token.EXPR_RESULT, bitNotNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.NUMBER, bitNotNode.getParent().getType());
        assertEquals((double) ~Integer.MIN_VALUE, bitNotNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldBitNotFractional() throws Exception {
        Node fractionalNode = Node.newNumber(5.5);
        Node bitNotNode = new Node(Token.BITNOT, fractionalNode);
        Node parent = createParentNode(Token.EXPR_RESULT, bitNotNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        // This should not fold and ideally report an error.
        // For testing, we check if it doesn't fold.
        Node result = peephole.optimizeSubtree(bitNotNode);
        assertSame(bitNotNode, result);
    }

    // Tests for tryFoldBinaryOperator
    @Test
    public void testFoldAdd() throws Exception {
        Node left = Node.newNumber(2);
        Node right = Node.newNumber(3);
        Node addNode = new Node(Token.ADD, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, addNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(addNode);
        assertEquals(Token.NUMBER, addNode.getParent().getType());
        assertEquals(5.0, addNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldSubtract() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(2);
        Node subNode = new Node(Token.SUB, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, subNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(subNode);
        assertEquals(Token.NUMBER, subNode.getParent().getType());
        assertEquals(3.0, subNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldMultiply() throws Exception {
        Node left = Node.newNumber(4);
        Node right = Node.newNumber(2);
        Node mulNode = new Node(Token.MUL, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, mulNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(mulNode);
        assertEquals(Token.NUMBER, mulNode.getParent().getType());
        assertEquals(8.0, mulNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldDivide() throws Exception {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(2);
        Node divNode = new Node(Token.DIV, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, divNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(divNode);
        assertEquals(Token.NUMBER, divNode.getParent().getType());
        assertEquals(5.0, divNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldDivideByZero() throws Exception {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(0);
        Node divNode = new Node(Token.DIV, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, divNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        // This should not fold and ideally report an error.
        // For testing, we check if it doesn't fold.
        Node result = peephole.optimizeSubtree(divNode);
        assertSame(divNode, result);
    }

    @Test
    public void testFoldAnd() throws Exception {
        Node left = new Node(Token.TRUE);
        Node right = new Node(Token.FALSE);
        Node andNode = new Node(Token.AND, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, andNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(andNode);
        assertEquals(Token.FALSE, andNode.getParent().getType());
    }

    @Test
    public void testFoldOr() throws Exception {
        Node left = new Node(Token.TRUE);
        Node right = new Node(Token.FALSE);
        Node orNode = new Node(Token.OR, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, orNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(orNode);
        assertEquals(Token.TRUE, orNode.getParent().getType());
    }

    @Test
    public void testFoldAndWithNonLiteralLeft() throws Exception {
        Node nameNode = new Node(Token.NAME, "a");
        Node right = new Node(Token.FALSE);
        Node andNode = new Node(Token.AND, nameNode, right);
        Node parent = createParentNode(Token.EXPR_RESULT, andNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        Node result = peephole.optimizeSubtree(andNode);
        // Should not fold if left is not literal.
        assertSame(andNode, result);
    }

    @Test
    public void testFoldOrWithNonLiteralLeft() throws Exception {
        Node nameNode = new Node(Token.NAME, "a");
        Node right = new Node(Token.TRUE);
        Node orNode = new Node(Token.OR, nameNode, right);
        Node parent = createParentNode(Token.EXPR_RESULT, orNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        Node result = peephole.optimizeSubtree(orNode);
        // Should not fold if left is not literal.
        assertSame(orNode, result);
    }

    // Tests for tryFoldBitAndOr
    @Test
    public void testFoldBitAnd() throws Exception {
        Node left = Node.newNumber(5); // 101
        Node right = Node.newNumber(3); // 011
        Node bitAndNode = new Node(Token.BITAND, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, bitAndNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(bitAndNode);
        assertEquals(Token.NUMBER, bitAndNode.getParent().getType());
        assertEquals(1.0, bitAndNode.getParent().getDouble(), 1e-9); // 001
    }

    @Test
    public void testFoldBitOr() throws Exception {
        Node left = Node.newNumber(5); // 101
        Node right = Node.newNumber(3); // 011
        Node bitOrNode = new Node(Token.BITOR, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, bitOrNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(bitOrNode);
        assertEquals(Token.NUMBER, bitOrNode.getParent().getType());
        assertEquals(7.0, bitOrNode.getParent().getDouble(), 1e-9); // 111
    }

    @Test
    public void testFoldBitAndOutOfBounds() throws Exception {
        Node left = Node.newNumber(Integer.MAX_VALUE + 1.0);
        Node right = Node.newNumber(3);
        Node bitAndNode = new Node(Token.BITAND, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, bitAndNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        Node result = peephole.optimizeSubtree(bitAndNode);
        // Should not fold due to out of bounds.
        assertSame(bitAndNode, result);
    }

    // Tests for tryFoldShift
    @Test
    public void testFoldLeftShift() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(2);
        Node lshNode = new Node(Token.LSH, left, right); // 5 << 2 = 20
        Node parent = createParentNode(Token.EXPR_RESULT, lshNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(lshNode);
        assertEquals(Token.NUMBER, lshNode.getParent().getType());
        assertEquals(20.0, lshNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldRightShift() throws Exception {
        Node left = Node.newNumber(20);
        Node right = Node.newNumber(2);
        Node rshNode = new Node(Token.RSH, left, right); // 20 >> 2 = 5
        Node parent = createParentNode(Token.EXPR_RESULT, rshNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(rshNode);
        assertEquals(Token.NUMBER, rshNode.getParent().getType());
        assertEquals(5.0, rshNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldUnsignedRightShift() throws Exception {
        Node left = Node.newNumber(-5);
        Node right = Node.newNumber(2);
        Node urshNode = new Node(Token.URSH, left, right); // -5 >>> 2
        Node parent = createParentNode(Token.EXPR_RESULT, urshNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(urshNode);
        assertEquals(Token.NUMBER, urshNode.getParent().getType());
        // Java's behavior for unsigned right shift on negative numbers:
        // -5 in 32-bit two's complement is 1111...1011.
        // Shifting right by 2 zeros fills from left: 0011...1110.
        long unsignedInt = -5L & 0xffffffffL;
        assertEquals(Double.valueOf(unsignedInt >>> 2), urshNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldShiftAmountOutOfBounds() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(32); // Shift by 32 is out of bounds
        Node lshNode = new Node(Token.LSH, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, lshNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        Node result = peephole.optimizeSubtree(lshNode);
        // Should not fold.
        assertSame(lshNode, result);
    }

    @Test
    public void testFoldShiftFractionalOperand() throws Exception {
        Node left = Node.newNumber(5.5);
        Node right = Node.newNumber(2);
        Node lshNode = new Node(Token.LSH, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, lshNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        Node result = peephole.optimizeSubtree(lshNode);
        // Should not fold.
        assertSame(lshNode, result);
    }

    // Tests for tryFoldComparison
    @Test
    public void testFoldEqual() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(5);
        Node eqNode = new Node(Token.EQ, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, eqNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(eqNode);
        assertEquals(Token.TRUE, eqNode.getParent().getType());
    }

    @Test
    public void testFoldNotEqual() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(3);
        Node neNode = new Node(Token.NE, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, neNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(neNode);
        assertEquals(Token.TRUE, neNode.getParent().getType());
    }

    @Test
    public void testFoldLessThan() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(10);
        Node ltNode = new Node(Token.LT, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, ltNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(ltNode);
        assertEquals(Token.TRUE, ltNode.getParent().getType());
    }

    @Test
    public void testFoldGreaterThan() throws Exception {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(5);
        Node gtNode = new Node(Token.GT, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, gtNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(gtNode);
        assertEquals(Token.TRUE, gtNode.getParent().getType());
    }

    @Test
    public void testFoldStrictEqual() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(5);
        Node sheqNode = new Node(Token.SHEQ, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, sheqNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(sheqNode);
        assertEquals(Token.TRUE, sheqNode.getParent().getType());
    }

    @Test
    public void testFoldStrictNotEqual() throws Exception {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(3);
        Node shneNode = new Node(Token.SHNE, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, shneNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(shneNode);
        assertEquals(Token.TRUE, shneNode.getParent().getType());
    }

    @Test
    public void testFoldComparisonWithUndefined() throws Exception {
        Node undefinedNode = new Node(Token.VOID, Node.newNumber(1));
        Node nullNode = new Node(Token.NULL);
        Node eqNode = new Node(Token.EQ, undefinedNode, nullNode);
        Node parent = createParentNode(Token.EXPR_RESULT, eqNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(eqNode);
        assertEquals(Token.TRUE, eqNode.getParent().getType());
    }

    @Test
    public void testFoldComparisonWithUndefinedStrict() throws Exception {
        Node undefinedNode = new Node(Token.VOID, Node.newNumber(1));
        Node nullNode = new Node(Token.NULL);
        Node sheqNode = new Node(Token.SHEQ, undefinedNode, nullNode);
        Node parent = createParentNode(Token.EXPR_RESULT, sheqNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(sheqNode);
        assertEquals(Token.FALSE, sheqNode.getParent().getType());
    }

    // Tests for tryFoldAssign (e.g., x = x + y -> x += y)
    @Test
    public void testFoldAssignAdd() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = new Node(Token.ADD, left.cloneNode(), new Node(Token.NAME, "y"));
        Node assignNode = new Node(Token.ASSIGN, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, assignNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_ADD, assignNode.getParent().getType());
    }

    // Tests for tryFoldAdd (string concatenation)
    @Test
    public void testFoldAddStringLiterals() throws Exception {
        Node left = Node.newString("hello");
        Node right = Node.newString(" world");
        Node addNode = new Node(Token.ADD, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, addNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(addNode);
        assertEquals(Token.STRING, addNode.getParent().getType());
        assertEquals("hello world", addNode.getParent().getString());
    }

    @Test
    public void testFoldAddLeftChildString() throws Exception {
        Node ll = Node.newNumber(1);
        Node lr = Node.newString("a");
        Node left = new Node(Token.ADD, ll, lr);
        Node right = Node.newString("b");
        Node addNode = new Node(Token.ADD, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, addNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(addNode);
        assertEquals(Token.STRING, addNode.getParent().getType());
        assertEquals("ab", addNode.getParent().getString());
    }

    // Tests for tryFoldGetElem
    @Test
    public void testFoldGetElemArrayIndex() throws Exception {
        Node arrayLit = createParentNode(Token.ARRAYLIT, Node.newNumber(10), Node.newNumber(20), Node.newNumber(30));
        Node index = Node.newNumber(1);
        Node getElemNode = new Node(Token.GETELEM, arrayLit, index);
        Node parent = createParentNode(Token.EXPR_RESULT, getElemNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(getElemNode);
        assertEquals(Token.NUMBER, getElemNode.getParent().getType());
        assertEquals(20.0, getElemNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldGetElemArrayIndexOutOfBounds() throws Exception {
        Node arrayLit = createParentNode(Token.ARRAYLIT, Node.newNumber(10), Node.newNumber(20));
        Node index = Node.newNumber(2);
        Node getElemNode = new Node(Token.GETELEM, arrayLit, index);
        Node parent = createParentNode(Token.EXPR_RESULT, getElemNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        Node result = peephole.optimizeSubtree(getElemNode);
        // Should not fold.
        assertSame(getElemNode, result);
    }

    @Test
    public void testFoldGetElemArrayIndexFractionalIndex() throws Exception {
        Node arrayLit = createParentNode(Token.ARRAYLIT, Node.newNumber(10), Node.newNumber(20));
        Node index = Node.newNumber(1.5);
        Node getElemNode = new Node(Token.GETELEM, arrayLit, index);
        Node parent = createParentNode(Token.EXPR_RESULT, getElemNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        Node result = peephole.optimizeSubtree(getElemNode);
        // Should not fold.
        assertSame(getElemNode, result);
    }

    // Tests for tryFoldGetProp
    @Test
    public void testFoldGetPropArrayLength() throws Exception {
        Node arrayLit = createParentNode(Token.ARRAYLIT, Node.newNumber(10), Node.newNumber(20), Node.newNumber(30));
        Node lengthProp = Node.newString("length");
        Node getPropNode = new Node(Token.GETPROP, arrayLit, lengthProp);
        Node parent = createParentNode(Token.EXPR_RESULT, getPropNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(getPropNode);
        assertEquals(Token.NUMBER, getPropNode.getParent().getType());
        assertEquals(3.0, getPropNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldGetPropStringLength() throws Exception {
        Node stringLit = Node.newString("hello");
        Node lengthProp = Node.newString("length");
        Node getPropNode = new Node(Token.GETPROP, stringLit, lengthProp);
        Node parent = createParentNode(Token.EXPR_RESULT, getPropNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(getPropNode);
        assertEquals(Token.NUMBER, getPropNode.getParent().getType());
        assertEquals(5.0, getPropNode.getParent().getDouble(), 1e-9);
    }

    // Tests for tryFoldStringJoin
    @Test
    public void testFoldStringJoinEmptyArray() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node joinName = Node.newString("join");
        Node getPropNode = new Node(Token.GETPROP, arrayLit, joinName);
        Node separator = Node.newString("");
        Node callNode = new Node(Token.CALL, getPropNode, separator);
        Node parent = createParentNode(Token.EXPR_RESULT, callNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(callNode);
        assertEquals(Token.STRING, callNode.getParent().getType());
        assertEquals("", callNode.getParent().getString());
    }

    @Test
    public void testFoldStringJoinSingleElement() throws Exception {
        Node arrayLit = createParentNode(Token.ARRAYLIT, Node.newString("a"));
        Node joinName = Node.newString("join");
        Node getPropNode = new Node(Token.GETPROP, arrayLit, joinName);
        Node separator = Node.newString(",");
        Node callNode = new Node(Token.CALL, getPropNode, separator);
        Node parent = createParentNode(Token.EXPR_RESULT, callNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(callNode);
        assertEquals(Token.STRING, callNode.getParent().getType());
        assertEquals("a", callNode.getParent().getString());
    }

    @Test
    public void testFoldStringJoinMultipleElements() throws Exception {
        Node arrayLit = createParentNode(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
        Node joinName = Node.newString("join");
        Node getPropNode = new Node(Token.GETPROP, arrayLit, joinName);
        Node separator = Node.newString("-");
        Node callNode = new Node(Token.CALL, getPropNode, separator);
        Node parent = createParentNode(Token.EXPR_RESULT, callNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(callNode);
        assertEquals(Token.STRING, callNode.getParent().getType());
        assertEquals("a-b-c", callNode.getParent().getString());
    }

    @Test
    public void testFoldStringJoinWithNonStringElements() throws Exception {
        Node arrayLit = createParentNode(Token.ARRAYLIT, Node.newNumber(1), Node.newString("b"), new Node(Token.TRUE));
        Node joinName = Node.newString("join");
        Node getPropNode = new Node(Token.GETPROP, arrayLit, joinName);
        Node separator = Node.newString("");
        Node callNode = new Node(Token.CALL, getPropNode, separator);
        Node parent = createParentNode(Token.EXPR_RESULT, callNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(callNode);
        assertEquals(Token.STRING, callNode.getParent().getType());
        assertEquals("1btrue", callNode.getParent().getString());
    }

    // Tests for tryFoldStringIndexOf
    @Test
    public void testFoldStringIndexOfFound() throws Exception {
        Node lstring = Node.newString("abcdef");
        Node indexOfName = Node.newString("indexOf");
        Node getPropNode = new Node(Token.GETPROP, lstring, indexOfName);
        Node searchValue = Node.newString("cd");
        Node callNode = new Node(Token.CALL, getPropNode, searchValue);
        Node parent = createParentNode(Token.EXPR_RESULT, callNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(callNode);
        assertEquals(Token.NUMBER, callNode.getParent().getType());
        assertEquals(2.0, callNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldStringIndexOfNotFound() throws Exception {
        Node lstring = Node.newString("abcdef");
        Node indexOfName = Node.newString("indexOf");
        Node getPropNode = new Node(Token.GETPROP, lstring, indexOfName);
        Node searchValue = Node.newString("xyz");
        Node callNode = new Node(Token.CALL, getPropNode, searchValue);
        Node parent = createParentNode(Token.EXPR_RESULT, callNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(callNode);
        assertEquals(Token.NUMBER, callNode.getParent().getType());
        assertEquals(-1.0, callNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldStringIndexOfWithFromIndex() throws Exception {
        Node lstring = Node.newString("abcabcabc");
        Node indexOfName = Node.newString("indexOf");
        Node getPropNode = new Node(Token.GETPROP, lstring, indexOfName);
        Node searchValue = Node.newString("abc");
        Node fromIndex = Node.newNumber(4);
        Node callNode = new Node(Token.CALL, getPropNode, searchValue, fromIndex);
        Node parent = createParentNode(Token.EXPR_RESULT, callNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(callNode);
        assertEquals(Token.NUMBER, callNode.getParent().getType());
        assertEquals(6.0, callNode.getParent().getDouble(), 1e-9);
    }

    // Test foldInstanceof
    @Test
    public void testFoldInstanceofImmutable() throws Exception {
        Node left = Node.newNumber(5);
        Node right = new Node(Token.NAME, "Object");
        Node instanceofNode = new Node(Token.INSTANCEOF, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, instanceofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(instanceofNode);
        assertEquals(Token.FALSE, instanceofNode.getParent().getType());
    }

    @Test
    public void testFoldInstanceofObject() throws Exception {
        Node left = Node.newString("hello"); // Non-literal but not immutable
        Node right = new Node(Token.NAME, "Object");
        Node instanceofNode = new Node(Token.INSTANCEOF, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, instanceofNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(instanceofNode);
        assertEquals(Token.TRUE, instanceofNode.getParent().getType());
    }

    // Test fold arithmetic for large numbers
    @Test
    public void testFoldAddLargeNumbers() throws Exception {
        Node l = Node.newNumber(MAX_FOLD_NUMBER);
        Node r = Node.newNumber(1);
        Node addNode = new Node(Token.ADD, l, r);
        Node parent = createParentNode(Token.EXPR_RESULT, addNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(addNode);
        // Should not fold because it exceeds MAX_FOLD_NUMBER
        assertTrue(addNode.getParent().getType() == Token.ADD);
    }

    // Test edge cases for shift operators
    @Test
    public void testFoldShiftByZero() throws Exception {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(0);
        Node lshNode = new Node(Token.LSH, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, lshNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(lshNode);
        assertEquals(Token.NUMBER, lshNode.getParent().getType());
        assertEquals(10.0, lshNode.getParent().getDouble(), 1e-9);
    }

    @Test
    public void testFoldShiftMaxAmount() throws Exception {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(31); // Max valid shift for 32-bit int
        Node lshNode = new Node(Token.LSH, left, right);
        Node parent = createParentNode(Token.EXPR_RESULT, lshNode);
        PeepholeFoldConstants peephole = createPeepholePass();
        peephole.optimizeSubtree(lshNode);
        assertEquals(Token.NUMBER, lshNode.getParent().getType());
        assertEquals(10.0 * Math.pow(2, 31), lshNode.getParent().getDouble(), 1e-9);
    }
}
```