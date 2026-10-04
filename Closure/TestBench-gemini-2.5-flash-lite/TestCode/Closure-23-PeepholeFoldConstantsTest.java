package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Set; // Added import for Set

public class PeepholeFoldConstantsTest {









    @Test
    public void testFoldNotTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.trueNode();
        Node notNode = IR.not(n);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldNotFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.falseNode();
        Node notNode = IR.not(n);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldNotZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(0);
        Node notNode = IR.not(n);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldNotOne() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(1);
        Node notNode = IR.not(n);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldNotStringEmpty() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.string("");
        Node notNode = IR.not(n);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldNotStringNonEmpty() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.string("a");
        Node notNode = IR.not(n);
        Node result = peephole.optimizeSubtree(notNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldPosNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(5);
        Node posNode = IR.pos(n);
        Node result = peephole.optimizeSubtree(posNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
        assertSame(n, result); // Should return the original node
    }

    @Test
    public void testFoldNegNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(5);
        Node negNode = IR.neg(n);
        Node result = peephole.optimizeSubtree(negNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldNegZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(0);
        Node negNode = IR.neg(n);
        Node result = peephole.optimizeSubtree(negNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldNegNegative() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(-5);
        Node negNode = IR.neg(n);
        Node result = peephole.optimizeSubtree(negNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
    }

    

    @Test
    public void testFoldAddNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(10);
        Node addNode = IR.add(left, right);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(15.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldAddNumberAndNegativeNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(-10);
        Node addNode = IR.add(left, right);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldAddTwoStrings() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.string("hello");
        Node right = IR.string(" ");
        Node addNode = IR.add(left, right);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello ", result.getString());
    }

    @Test
    public void testFoldAddNumberAndString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.string("a");
        Node addNode = IR.add(left, right);
        Node result = peephole.optimizeSubtree(addNode);
        // With late=false, it should not fold number and string
        assertEquals(Token.ADD, result.getType());
        // However, the string value should be correctly concatenated
        assertEquals("5a", NodeUtil.getStringValue(result));
    }

    @Test
    public void testFoldAddStringAndNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.string("a");
        Node right = IR.number(5);
        Node addNode = IR.add(left, right);
        Node result = peephole.optimizeSubtree(addNode);
        // With late=false, it should not fold string and number
        assertEquals(Token.ADD, result.getType());
        // However, the string value should be correctly concatenated
        assertEquals("a5", NodeUtil.getStringValue(result));
    }
    
    @Test
    public void testFoldAddNestedString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.add(IR.string("hello"), IR.string(" "));
        Node right = IR.string("world");
        Node addNode = IR.add(left, right);
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello world", result.getString());
    }

    @Test
    public void testFoldSubNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(10);
        Node right = IR.number(5);
        Node subNode = IR.sub(left, right);
        Node result = peephole.optimizeSubtree(subNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldSubNumberAndNegativeNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(-10);
        Node subNode = IR.sub(left, right);
        Node result = peephole.optimizeSubtree(subNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(15.0, result.getDouble(), 0.0);
    }

    











    @Test
    public void testFoldCompareEqual() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(5);
        Node eqNode = IR.eq(left, right);
        Node result = peephole.optimizeSubtree(eqNode);
        assertEquals(Token.TRUE, result.getType());
    }


    @Test
    public void testFoldCompareStrictEqual() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(5);
        Node sheqNode = IR.sheq(left, right);
        Node result = peephole.optimizeSubtree(sheqNode);
        assertEquals(Token.TRUE, result.getType());
    }





    
    @Test
    public void testFoldGetPropLengthArray() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node arrayLit = IR.arraylit(IR.number(1), IR.number(2), IR.number(3));
        Node lengthProp = IR.string("length");
        Node getPropNode = IR.getprop(arrayLit, lengthProp);
        Node result = peephole.optimizeSubtree(getPropNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldGetPropLengthString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node stringNode = IR.string("hello");
        Node lengthProp = IR.string("length");
        Node getPropNode = IR.getprop(stringNode, lengthProp);
        Node result = peephole.optimizeSubtree(getPropNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldGetElemArrayIndex() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node arrayLit = IR.arraylit(IR.string("a"), IR.string("b"), IR.string("c"));
        Node index = IR.number(1);
        Node getElemNode = IR.getelem(arrayLit, index);
        Node result = peephole.optimizeSubtree(getElemNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("b", result.getString());
    }

    @Test
    public void testFoldGetElemArrayIndexOutOfBounds() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node arrayLit = IR.arraylit(IR.string("a"), IR.string("b"));
        Node index = IR.number(2);
        Node getElemNode = IR.getelem(arrayLit, index);
        Node result = peephole.optimizeSubtree(getElemNode);
        // This should ideally throw an error, but the peephole optimizer might not handle it directly
        // We expect it to remain a GETELEM if not foldable or if it results in an error.
        // The error is reported by the compiler, not necessarily by the peephole optimization itself.
        assertEquals(Token.GETELEM, result.getType());
    }

    @Test
    public void testFoldGetElemArrayIndexNegative() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node arrayLit = IR.arraylit(IR.string("a"), IR.string("b"));
        Node index = IR.number(-1);
        Node getElemNode = IR.getelem(arrayLit, index);
        Node result = peephole.optimizeSubtree(getElemNode);
        // Similar to out of bounds, expecting it to remain GETELEM
        assertEquals(Token.GETELEM, result.getType());
    }
    
    @Test
    public void testFoldGetElemArrayIndexFloat() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node arrayLit = IR.arraylit(IR.string("a"), IR.string("b"));
        Node index = IR.number(1.5);
        Node getElemNode = IR.getelem(arrayLit, index);
        Node result = peephole.optimizeSubtree(getElemNode);
        // Fractional index should not be folded
        assertEquals(Token.GETELEM, result.getType());
    }






    @Test
    public void testFoldAndTrueTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.trueNode();
        Node right = IR.trueNode();
        Node andNode = IR.and(left, right);
        Node result = peephole.optimizeSubtree(andNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldAndTrueFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.trueNode();
        Node right = IR.falseNode();
        Node andNode = IR.and(left, right);
        Node result = peephole.optimizeSubtree(andNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldAndFalseTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.falseNode();
        Node right = IR.trueNode();
        Node andNode = IR.and(left, right);
        Node result = peephole.optimizeSubtree(andNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldAndFalseFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.falseNode();
        Node right = IR.falseNode();
        Node andNode = IR.and(left, right);
        Node result = peephole.optimizeSubtree(andNode);
        assertEquals(Token.FALSE, result.getType());
    }
    

    @Test
    public void testFoldOrTrueTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.trueNode();
        Node right = IR.trueNode();
        Node orNode = IR.or(left, right);
        Node result = peephole.optimizeSubtree(orNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldOrTrueFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.trueNode();
        Node right = IR.falseNode();
        Node orNode = IR.or(left, right);
        Node result = peephole.optimizeSubtree(orNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldOrFalseTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.falseNode();
        Node right = IR.trueNode();
        Node orNode = IR.or(left, right);
        Node result = peephole.optimizeSubtree(orNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldOrFalseFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.falseNode();
        Node right = IR.falseNode();
        Node orNode = IR.or(left, right);
        Node result = peephole.optimizeSubtree(orNode);
        assertEquals(Token.FALSE, result.getType());
    }
    

    @Test
    public void testFoldAssignAdd() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.add(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_ADD, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }

    @Test
    public void testFoldAssignSub() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.sub(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_SUB, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }


    







    @Test
    public void testTryReduceVoidZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.voidNode(IR.number(0));
        Node result = peephole.optimizeSubtree(n);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryReduceVoidNonZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.voidNode(IR.number(1));
        Node result = peephole.optimizeSubtree(n);
        // void 1 should not be reduced to 0
        assertEquals(Token.VOID, result.getType());
    }

    @Test
    public void testTryReduceVoidString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.voidNode(IR.string("test"));
        Node result = peephole.optimizeSubtree(n);
        // void "test" should not be reduced to 0
        assertEquals(Token.VOID, result.getType());
    }







    

    @Test
    public void testFoldGetElemNestedArray() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node nestedArray = IR.arraylit(IR.number(10));
        Node outerArray = IR.arraylit(nestedArray, IR.number(20));
        Node index = IR.number(0);
        Node getElemNode = IR.getelem(outerArray, index);
        Node result = peephole.optimizeSubtree(getElemNode);
        
        // The nested array itself should be returned, not folded further.
        assertEquals(Token.ARRAYLIT, result.getType());
        assertTrue(result.hasChild(IR.number(10)));
    }
    

    @Test
    public void testFoldGetElemWithStringVar() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node arrayLit = IR.arraylit(IR.number(10));
        Node index = IR.name("index"); // Using a name, not a number literal
        Node getElemNode = IR.getelem(arrayLit, index);
        Node result = peephole.optimizeSubtree(getElemNode);
        // Should not fold if index is not a literal number
        assertEquals(Token.GETELEM, result.getType());
    }
    
    @Test
    public void testFoldLeftChildAddTwoNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node leftLeft = IR.number(2);
        Node leftRight = IR.number(3);
        Node left = IR.add(leftLeft, leftRight); // (2 + 3)
        Node right = IR.number(5);
        Node addNode = IR.add(left, right); // (2 + 3) + 5
        Node result = peephole.optimizeSubtree(addNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(10.0, result.getDouble(), 0.0);
    }
    

    @Test
    public void testFoldLeftChildAddWithNonLiteralRight() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node leftLeft = IR.number(2);
        Node leftRight = IR.number(3);
        Node left = IR.add(leftLeft, leftRight); // (2 + 3)
        Node right = IR.name("x"); // Non-literal right operand
        Node addNode = IR.add(left, right); // (2 + 3) + x
        Node result = peephole.optimizeSubtree(addNode);
        // Should not fold if the right child is not a number constant
        assertEquals(Token.ADD, result.getType());
    }
    
    
    // Test for large number handling in arithmetic operations


    

    @Test
    public void testFoldGetElemInvalidIndexError() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node arrayLit = IR.arraylit(IR.string("a"), IR.string("b"));
        Node index = IR.string("invalid"); // Invalid index type
        Node getElemNode = IR.getelem(arrayLit, index);
        Node result = peephole.optimizeSubtree(getElemNode);
        // Expecting the original node to be returned as an error is reported.
        assertEquals(Token.GETELEM, result.getType());
    }

    @Test
    public void testFoldGetElemIndexOutOfBoundsError() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node arrayLit = IR.arraylit(IR.string("a"), IR.string("b"));
        Node index = IR.number(100); // Index out of bounds
        Node getElemNode = IR.getelem(arrayLit, index);
        Node result = peephole.optimizeSubtree(getElemNode);
        // Expecting the original node to be returned as an error is reported.
        assertEquals(Token.GETELEM, result.getType());
    }
    
    // Test for NEGATING_A_NON_NUMBER_ERROR
    @Test
    public void testNegatingNonNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node nonNumber = IR.string("abc");
        Node negNode = IR.neg(nonNumber);
        Node result = peephole.optimizeSubtree(negNode);
        // Expecting the original node to be returned as an error is reported.
        assertEquals(Token.NEG, result.getType());
    }

    // Test for assignment operators that do not fold
    @Test
    public void testFoldAssignAddWithNonMatchingRHS() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.add(IR.number(1), IR.number(2)); // RHS does not involve 'x'
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN, result.getType()); // Should not fold to ASSIGN_ADD
    }
    
    // Test for assignment operators with different RHS operation
    @Test
    public void testFoldAssignMulWithAddRHS() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.add(IR.name("x"), IR.number(5)); // RHS is ADD, not MUL
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN, result.getType()); // Should not fold to ASSIGN_MUL
    }

    // Test for comparison with null and undefined
    @Test
    public void testFoldCompareNullEqualNull() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.nullNode();
        Node right = IR.nullNode();
        Node eqNode = IR.eq(left, right);
        Node result = peephole.optimizeSubtree(eqNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldCompareNullStrictEqualNull() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.nullNode();
        Node right = IR.nullNode();
        Node sheqNode = IR.sheq(left, right);
        Node result = peephole.optimizeSubtree(sheqNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldCompareUndefinedEqualUndefined() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.name("undefined");
        Node right = IR.name("undefined");
        Node eqNode = IR.eq(left, right);
        Node result = peephole.optimizeSubtree(eqNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldCompareUndefinedStrictEqualUndefined() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.name("undefined");
        Node right = IR.name("undefined");
        Node sheqNode = IR.sheq(left, right);
        Node result = peephole.optimizeSubtree(sheqNode);
        assertEquals(Token.TRUE, result.getType());
    }

    
    @Test
    public void testFoldCompareNumberToString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.string("5");
        Node eqNode = IR.eq(left, right);
        Node result = peephole.optimizeSubtree(eqNode);
        assertEquals(Token.TRUE, result.getType());
    }

}



