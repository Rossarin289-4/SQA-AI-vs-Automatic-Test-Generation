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
    public void testFoldTypeofString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.string("hello");
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testFoldTypeofNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(123);
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }

    @Test
    public void testFoldTypeofBooleanTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.trueNode();
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("boolean", result.getString());
    }

    @Test
    public void testFoldTypeofBooleanFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.falseNode();
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("boolean", result.getString());
    }

    @Test
    public void testFoldTypeofNull() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.nullNode();
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofObjectLiteral() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.objectLit();
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofArrayLiteral() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.arraylit();
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofUndefinedName() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.name("undefined");
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testFoldTypeofFunction() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.function(IR.name("foo"), IR.paramList(), IR.block());
        Node typeofNode = IR.newNode(Token.TYPEOF, n); // Use IR.newNode for typeof
        Node result = peephole.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("function", result.getString());
    }

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
    public void testFoldBitNotNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(5); // Binary: 0101
        Node bitNotNode = IR.bitNot(n);
        Node result = peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(~5, (int) result.getDouble()); // Binary: ...11111010
    }
    
    @Test
    public void testFoldBitNotNegativeNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node n = IR.number(-6); // Binary: ...11111010
        Node bitNotNode = IR.bitNot(n);
        Node result = peephole.optimizeSubtree(bitNotNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(~(-6), (int) result.getDouble()); // Binary: 00000101
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
    public void testFoldMulNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(10);
        Node mulNode = IR.mul(left, right);
        Node result = peephole.optimizeSubtree(mulNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(50.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldMulNumberAndZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(0);
        Node mulNode = IR.mul(left, right);
        Node result = peephole.optimizeSubtree(mulNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldDivNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(10);
        Node right = IR.number(5);
        Node divNode = IR.div(left, right);
        Node result = peephole.optimizeSubtree(divNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldDivByZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(10);
        Node right = IR.number(0);
        Node divNode = IR.div(left, right);
        Node result = peephole.optimizeSubtree(divNode);
        // Division by zero should not be folded into a number
        assertEquals(Token.DIV, result.getType());
    }

    @Test
    public void testFoldModNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(10);
        Node right = IR.number(3);
        Node modNode = IR.mod(left, right);
        Node result = peephole.optimizeSubtree(modNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldModByZero() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(10);
        Node right = IR.number(0);
        Node modNode = IR.mod(left, right);
        Node result = peephole.optimizeSubtree(modNode);
        // Modulo by zero should not be folded into a number
        assertEquals(Token.MOD, result.getType());
    }

    @Test
    public void testFoldBitAndNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5); // 0101
        Node right = IR.number(3); // 0011
        Node bitAndNode = IR.bitAnd(left, right);
        Node result = peephole.optimizeSubtree(bitAndNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0); // 0001
    }

    @Test
    public void testFoldBitOrNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5); // 0101
        Node right = IR.number(3); // 0011
        Node bitOrNode = IR.bitOr(left, right);
        Node result = peephole.optimizeSubtree(bitOrNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 0.0); // 0111
    }

    @Test
    public void testFoldBitXorNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5); // 0101
        Node right = IR.number(3); // 0011
        Node bitXorNode = IR.bitXor(left, right);
        Node result = peephole.optimizeSubtree(bitXorNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0.0); // 0110
    }

    @Test
    public void testFoldShiftLeft() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5); // 0101
        Node right = IR.number(2);
        Node lshNode = IR.lsh(left, right);
        Node result = peephole.optimizeSubtree(lshNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(20.0, result.getDouble(), 0.0); // 010100
    }

    @Test
    public void testFoldShiftRight() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(20); // 010100
        Node right = IR.number(2);
        Node rshNode = IR.rsh(left, right);
        Node result = peephole.optimizeSubtree(rshNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0); // 0101
    }

    @Test
    public void testFoldUnsignedShiftRight() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(-20); // JS: 4294967276
        Node right = IR.number(2);
        Node urshNode = IR.ursh(left, right);
        Node result = peephole.optimizeSubtree(urshNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1073741819.0, result.getDouble(), 0.0); // JS: 1073741819
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
    public void testFoldCompareNotEqual() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(10);
        Node neNode = IR.ne(left, right);
        Node result = peephole.optimizeSubtree(neNode);
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
    public void testFoldCompareStrictNotEqual() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(10);
        Node shneNode = IR.shne(left, right);
        Node result = peephole.optimizeSubtree(shneNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldCompareLessThan() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(10);
        Node ltNode = IR.lt(left, right);
        Node result = peephole.optimizeSubtree(ltNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldCompareGreaterThan() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(10);
        Node right = IR.number(5);
        Node gtNode = IR.gt(left, right);
        Node result = peephole.optimizeSubtree(gtNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldCompareLessEqual() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(5);
        Node leNode = IR.le(left, right);
        Node result = peephole.optimizeSubtree(leNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldCompareGreaterEqual() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(5);
        Node geNode = IR.ge(left, right);
        Node result = peephole.optimizeSubtree(geNode);
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
    public void testFoldObjectPropAccess() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node objLit = IR.objectLit(IR.stringKey("a", IR.number(1)));
        Node propName = IR.string("a");
        Node getPropNode = IR.getprop(objLit, propName);
        Node result = peephole.optimizeSubtree(getPropNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }

    @Test
    public void testFoldObjectPropAccessMissing() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node objLit = IR.objectLit(IR.stringKey("a", IR.number(1)));
        Node propName = IR.string("b");
        Node getPropNode = IR.getprop(objLit, propName);
        Node result = peephole.optimizeSubtree(getPropNode);
        assertEquals(Token.GETPROP, result.getType()); // Property not found, should not be folded
    }

    @Test
    public void testFoldInstanceofTrue() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.string("hello");
        Node right = IR.name("String");
        Node instanceofNode = IR.newNode(Token.INSTANCEOF, left, right);
        Node result = peephole.optimizeSubtree(instanceofNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldInstanceofFalse() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(123);
        Node right = IR.name("String");
        Node instanceofNode = IR.newNode(Token.INSTANCEOF, left, right);
        Node result = peephole.optimizeSubtree(instanceofNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldInstanceofObject() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.objectLit();
        Node right = IR.name("Object");
        Node instanceofNode = IR.newNode(Token.INSTANCEOF, left, right);
        Node result = peephole.optimizeSubtree(instanceofNode);
        assertEquals(Token.TRUE, result.getType());
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
    public void testFoldAndNonBoolean() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(10);
        Node andNode = IR.and(left, right);
        Node result = peephole.optimizeSubtree(andNode);
        // AND with numbers should not be folded to a single value unless one is clearly false/true
        assertEquals(Token.AND, result.getType());
        assertEquals(50.0, NodeUtil.getNumberValue(result));
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
    public void testFoldOrNonBoolean() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(0);
        Node right = IR.number(10);
        Node orNode = IR.or(left, right);
        Node result = peephole.optimizeSubtree(orNode);
        assertEquals(Token.OR, result.getType());
        assertEquals(10.0, NodeUtil.getNumberValue(result));
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
    public void testFoldAssignMul() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.mul(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_MUL, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }

    @Test
    public void testFoldAssignDiv() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.div(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_DIV, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }
    
    @Test
    public void testFoldAssignMod() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.mod(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_MOD, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }

    @Test
    public void testFoldAssignBitAnd() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.bitAnd(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_BITAND, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }

    @Test
    public void testFoldAssignBitOr() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.bitOr(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_BITOR, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }

    @Test
    public void testFoldAssignBitXor() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.bitXor(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_BITXOR, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }

    @Test
    public void testFoldAssignShiftLeft() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.lsh(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_LSH, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }

    @Test
    public void testFoldAssignShiftRight() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.rsh(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_RSH, result.getType());
        assertTrue(result.hasChild(IR.name("x")));
        assertTrue(result.hasChild(IR.number(5)));
    }

    @Test
    public void testFoldAssignUnsignedShiftRight() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(true); // late = true
        Node target = IR.name("x");
        Node value = IR.ursh(target.cloneTree(), IR.number(5)); // target.cloneTree() to avoid detaching
        Node assignNode = IR.assign(target, value);
        Node result = peephole.optimizeSubtree(assignNode);
        assertEquals(Token.ASSIGN_URSH, result.getType());
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
    public void testFoldCtorCallString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node value = IR.string("hello");
        Node ctorCall = IR.newNode(Token.NEW, IR.name("String"), value);
        Node result = peephole.optimizeSubtree(ctorCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }

    @Test
    public void testFoldCtorCallStringEmpty() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node ctorCall = IR.newNode(Token.NEW, IR.name("String"));
        Node result = peephole.optimizeSubtree(ctorCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("", result.getString());
    }

    @Test
    public void testFoldCtorCallStringWithNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node value = IR.number(123);
        Node ctorCall = IR.newNode(Token.NEW, IR.name("String"), value);
        Node result = peephole.optimizeSubtree(ctorCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("123", result.getString());
    }

    @Test
    public void testFoldCtorCallStringWithBoolean() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node value = IR.trueNode();
        Node ctorCall = IR.newNode(Token.NEW, IR.name("String"), value);
        Node result = peephole.optimizeSubtree(ctorCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("true", result.getString());
    }

    @Test
    public void testFoldCtorCallNumber() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node value = IR.number(123);
        Node ctorCall = IR.newNode(Token.NEW, IR.name("Number"), value);
        Node result = peephole.optimizeSubtree(ctorCall);
        // NEW Number(123) is not a constant that can be folded to a primitive number
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testFoldCtorCallBoolean() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node value = IR.string("true");
        Node ctorCall = IR.newNode(Token.NEW, IR.name("Boolean"), value);
        Node result = peephole.optimizeSubtree(ctorCall);
        // NEW Boolean("true") is not a constant that can be folded to a primitive boolean
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testFoldCtorCallNewObject() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node ctorCall = IR.newNode(Token.NEW, IR.name("Object"));
        Node result = peephole.optimizeSubtree(ctorCall);
        assertEquals(Token.NEW, result.getType()); // new Object() is not foldable
    }
    
    @Test
    public void testFoldGetPropNestedObject() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node nestedObject = IR.objectLit(
            IR.stringKey("value", IR.number(10))
        );
        Node outerObject = IR.objectLit(
            IR.stringKey("data", nestedObject)
        );
        Node propName = IR.string("data");
        Node getPropNode = IR.getprop(outerObject, propName);
        Node result = peephole.optimizeSubtree(getPropNode);
        
        // The nested object itself should be returned, not folded further.
        assertEquals(Token.OBJECTLIT, result.getType());
        assertTrue(result.hasChild(IR.stringKey("value")));
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
    public void testFoldGetPropWithStringVar() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node objLit = IR.objectLit(IR.stringKey("prop", IR.number(42)));
        Node propName = IR.name("prop"); // Using a name, not a string literal
        Node getPropNode = IR.getprop(objLit, propName);
        Node result = peephole.optimizeSubtree(getPropNode);
        // Should not fold if property name is not a literal string
        assertEquals(Token.GETPROP, result.getType());
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
    public void testFoldLeftChildMulTwoNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node leftLeft = IR.number(2);
        Node leftRight = IR.number(3);
        Node left = IR.mul(leftLeft, leftRight); // (2 * 3)
        Node right = IR.number(5);
        Node mulNode = IR.mul(left, right); // (2 * 3) * 5
        Node result = peephole.optimizeSubtree(mulNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(30.0, result.getDouble(), 0.0);
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
    
    @Test
    public void testFoldLeftChildMulWithNonLiteralRight() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node leftLeft = IR.number(2);
        Node leftRight = IR.number(3);
        Node left = IR.mul(leftLeft, leftRight); // (2 * 3)
        Node right = IR.name("x"); // Non-literal right operand
        Node mulNode = IR.mul(left, right); // (2 * 3) * x
        Node result = peephole.optimizeSubtree(mulNode);
        // Should not fold if the right child is not a number constant
        assertEquals(Token.MUL, result.getType());
    }
    
    // Test for large number handling in arithmetic operations
    @Test
    public void testFoldAddLargeNumbers() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(MAX_FOLD_NUMBER);
        Node right = IR.number(1.0);
        Node addNode = IR.add(left, right);
        Node result = peephole.optimizeSubtree(addNode);
        // Numbers greater than 2^53 might lose precision. The fold should not happen if precision is lost.
        assertEquals(Token.ADD, result.getType()); 
    }

    @Test
    public void testFoldBitwiseOperandOutOfRange() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(Math.pow(2, 31)); // Out of range for int
        Node right = IR.number(1);
        Node bitAndNode = IR.bitAnd(left, right);
        Node result = peephole.optimizeSubtree(bitAndNode);
        // The current implementation of tryFoldBinaryOperator calls tryReduceOperandsForOp
        // which may report an error, but the node might not be replaced.
        // We expect the original node to be returned if an error is reported.
        assertEquals(Token.BITAND, result.getType());
    }

    @Test
    public void testFoldShiftAmountOutOfBounds() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.number(32); // Shift amount out of bounds
        Node lshNode = IR.lsh(left, right);
        Node result = peephole.optimizeSubtree(lshNode);
        // Expecting the original node to be returned as an error is reported.
        assertEquals(Token.LSH, result.getType());
    }
    
    @Test
    public void testFoldFractionalBitwiseOperand() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5.5); // Fractional
        Node right = IR.number(1);
        Node bitAndNode = IR.bitAnd(left, right);
        Node result = peephole.optimizeSubtree(bitAndNode);
        // Expecting the original node to be returned as an error is reported.
        assertEquals(Token.BITAND, result.getType());
    }

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
    public void testFoldCompareNullStrictNotEqualUndefined() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.nullNode();
        Node right = IR.name("undefined");
        Node shneNode = IR.shne(left, right);
        Node result = peephole.optimizeSubtree(shneNode);
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

    @Test
    public void testFoldCompareNumberStrictNotEqualString() throws Exception {
        PeepholeFoldConstants peephole = new PeepholeFoldConstants(false);
        Node left = IR.number(5);
        Node right = IR.string("5");
        Node shneNode = IR.shne(left, right);
        Node result = peephole.optimizeSubtree(shneNode);
        assertEquals(Token.TRUE, result.getType());
    }
}
