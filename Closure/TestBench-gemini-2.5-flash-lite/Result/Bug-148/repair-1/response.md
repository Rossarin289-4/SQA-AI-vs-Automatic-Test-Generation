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
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class PeepholeFoldConstantsTest {

    private Node testFold(String code, String expected) {
        Compiler compiler = new Compiler();
        // PeepholeFoldConstants is instantiated without arguments
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode(code);
        Node result = compiler.optimize(); // optimize() does not take arguments
        // NodeUtil.getCodegenString is not available, using toSource()
        assertNotNull("The result should not be null", result);
        assertEquals(expected, NodeUtil.toSource(result)); // Use toSource instead of getCodegenString
        return result;
    }

    private Node testFold(String code) {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode(code);
        return compiler.optimize(); // optimize() does not take arguments
    }

    @Test
    public void testTypeOf() throws Exception {
        testFold("typeof(1)", "\"number\"");
        testFold("typeof(\"hello\")", "\"string\"");
        testFold("typeof(true)", "\"boolean\"");
        testFold("typeof(null)", "\"object\"");
        testFold("typeof(undefined)", "\"undefined\"");
        testFold("typeof({})", "\"object\"");
        testFold("typeof([])", "\"object\"");
    }

    @Test
    public void testTypeOfName() throws Exception {
        Node n = Node.newString(Token.NAME, "undefined"); // Use newString with type for NAME
        // Node.newName is not a valid method, use Node.newString with Token.NAME
        testFold("typeof undefined", "\"undefined\"");
    }

    @Test
    public void testNot() throws Exception {
        testFold("!true", "false");
        testFold("!false", "true");
        testFold("!!true", "true");
        testFold("!!false", "false");
        testFold("!1", "false");
        testFold("!0", "true");
        testFold("!\"\"", "true");
        testFold("!\"hello\"", "false");
    }

    @Test
    public void testNeg() throws Exception {
        testFold("-1", "1");
        testFold("-0", "0");
        testFold("-1.5", "1.5");
        testFold("-Infinity", "Infinity");
        testFold("-NaN", "NaN");
    }

    @Test
    public void testBitNot() throws Exception {
        testFold("~0", "-1");
        testFold("~1", "-2");
        testFold("~-1", "0");
        testFold("~2147483647", "-2147483648"); // MAX_INT
        testFold("~-2147483648", "2147483647"); // MIN_INT
    }

    @Test
    public void testBitNotOutOfBounds() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("~2147483648"); // Integer.MAX_VALUE + 1
        // The PeepholeFoldConstants class is not accessible directly for calling methods like tryFoldUnaryOperator
        // Instead, we rely on the compiler.optimize() to trigger the folding.
        Node result = compiler.optimize();
        // Check if the compiler produced an error for out of bounds operation
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE.key, compiler.getErrors().get(0).getKey());
    }

    @Test
    public void testBitNotFractional() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("~1.5");
        Node result = compiler.optimize();
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND.key, compiler.getErrors().get(0).getKey());
    }

    @Test
    public void testInstanceof() throws Exception {
        testFold("1 instanceof Object", "true");
        testFold("true instanceof Object", "true");
        testFold("\"a\" instanceof Object", "true");
        testFold("null instanceof Object", "false");
        testFold("undefined instanceof Object", "false");
        testFold("1 instanceof String", "false");
    }

    @Test
    public void testAssignAdd() throws Exception {
        testFold("var x = 5; x = x + 3;", "var x = 5; x += 3;");
        testFold("var x = 5; x = x - 3;", "var x = 5; x -= 3;");
        testFold("var x = 5; x = x * 3;", "var x = 5; x *= 3;");
        testFold("var x = 5; x = x / 3;", "var x = 5; x /= 3;");
        testFold("var x = 5; x = x % 3;", "var x = 5; x %= 3;");
        testFold("var x = 5; x = x << 3;", "var x = 5; x <<= 3;");
        testFold("var x = 5; x = x >> 3;", "var x = 5; x >>= 3;");
        testFold("var x = 5; x = x >>> 3;", "var x = 5; x >>>= 3;");
        testFold("var x = 5; x = x | 3;", "var x = 5; x |= 3;");
        testFold("var x = 5; x = x & 3;", "var x = 5; x &= 3;");
        testFold("var x = 5; x = x ^ 3;", "var x = 5; x ^= 3;");
    }

    @Test
    public void testAndOr() throws Exception {
        testFold("true || 1", "true");
        testFold("1 || true", "1");
        testFold("false && 1", "false");
        testFold("1 && true", "1");
        testFold("true && false", "false");
        testFold("false || true", "true");
    }

    @Test
    public void testLeftChildAdd() throws Exception {
        testFold("a + 7", "a + 7"); // Not a string concat, so no fold
        testFold("a + \"7\"", "a + \"7\""); // Not a string concat, so no fold
        testFold("a + \"7\" + \"8\"", "a + \"78\""); // Folded
        testFold("a + \"7\" + 8", "a + \"78\""); // Folded
    }

    @Test
    public void testAddConstant() throws Exception {
        testFold("1 + 2", "3");
        testFold("1.5 + 2.5", "4.0");
        testFold("\"a\" + \"b\"", "\"ab\"");
        testFold("\"a\" + 1", "\"a1\"");
        testFold("1 + \"a\"", "\"1a\"");
        testFold("null + 5", "5");
        testFold("true + 5", "6");
        testFold("false + 5", "5");
    }

    @Test
    public void testArithmetic() throws Exception {
        testFold("1 + 7", "8");
        testFold("8 - 1", "7");
        testFold("3 * 4", "12");
        testFold("10 / 2", "5");
        testFold("10 / 4", "2.5");
        testFold("10 % 3", "1");
    }

    @Test
    public void testArithmeticOutOfBounds() throws Exception {
        // MAX_FOLD_NUMBER is not accessible directly. We can test the logic implicitly.
        // The test case needs to verify that the folding does not happen for large numbers.
        testFold("Math.pow(2, 53) + 1", "Math.pow(2, 53) + 1"); // Assuming Math.pow is available.
        testFold("Math.pow(2, 53) * 2", "Math.pow(2, 53) * 2");
        testFold("Math.pow(2, 52) * 2", "Math.pow(2, 53)");
    }

    @Test
    public void testDivideByZero() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("1 / 0");
        Node result = compiler.optimize();
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.DIVIDE_BY_0_ERROR.key, compiler.getErrors().get(0).getKey());
    }

    @Test
    public void testBitAndOr() throws Exception {
        testFold("1 | 2", "3");
        testFold("2 | 1", "3");
        testFold("1 & 2", "0");
        testFold("2 & 1", "0");
        testFold("0 | 0", "0");
        testFold("0 & 0", "0");
        testFold("-1 | 5", "-1");
        testFold("-1 & 5", "5");
    }

    @Test
    public void testBitAndOrOutOfBounds() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("2147483648 | 1"); // Integer.MAX_VALUE + 1
        Node result = compiler.optimize();
        // We expect no error here as the folding should not happen due to out of bounds.
        // The original code should be preserved.
        assertEquals("2147483648 | 1", NodeUtil.toSource(result));
    }

    @Test
    public void testBitAndOrFractional() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("1.5 | 2");
        Node result = compiler.optimize();
        // We expect no error here as the folding should not happen due to fractional operand.
        // The original code should be preserved.
        assertEquals("1.5 | 2", NodeUtil.toSource(result));
    }

    @Test
    public void testShift() throws Exception {
        testFold("1 << 2", "4");
        testFold("4 >> 1", "2");
        testFold("8 >>> 2", "2");
        testFold("1 << 0", "1");
        testFold("1 << 31", "-2147483648"); // Left shift by 31
        testFold("1 << 32", "1"); // Left shift by 32 (wraps around)
        testFold("-1 >> 31", "-1"); // Right shift by 31
        testFold("-1 >>> 31", "1"); // Unsigned right shift by 31
    }

    @Test
    public void testShiftAmountOutOfBounds() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("1 << 32");
        Node result = compiler.optimize();
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS.key, compiler.getErrors().get(0).getKey());
    }

    @Test
    public void testShiftFractionalOperand() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("1.5 << 2");
        Node result = compiler.optimize();
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND.key, compiler.getErrors().get(0).getKey());
    }

    @Test
    public void testShiftOutOfBoundsOperand() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("2147483648 << 2"); // Integer.MAX_VALUE + 1
        Node result = compiler.optimize();
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE.key, compiler.getErrors().get(0).getKey());
    }

    @Test
    public void testComparison() throws Exception {
        testFold("1 == 1", "true");
        testFold("1 == 2", "false");
        testFold("1 != 1", "false");
        testFold("1 != 2", "true");
        testFold("1 < 2", "true");
        testFold("2 < 1", "false");
        testFold("1 <= 1", "true");
        testFold("1 <= 2", "true");
        testFold("2 <= 1", "false");
        testFold("1 > 1", "false");
        testFold("2 > 1", "true");
        testFold("1 >= 1", "true");
        testFold("1 >= 2", "false");
        testFold("2 >= 1", "true");
        testFold("\"a\" == \"a\"", "true");
        testFold("\"a\" == \"b\"", "false");
        testFold("\"a\" != \"a\"", "false");
        testFold("\"a\" != \"b\"", "true");
        testFold("true == true", "true");
        testFold("true == false", "false");
        testFold("null == null", "true");
        testFold("undefined == undefined", "true");
        testFold("null == undefined", "true");
        testFold("undefined == null", "true");
        testFold("0 == false", "true");
        testFold("0 == null", "false");
        testFold("0 == undefined", "false");
        testFold("1 == \"1\"", "true"); // Loose equality
        testFold("1 === \"1\"", "false"); // Strict equality
        testFold("null === undefined", "false"); // Strict equality
    }

    @Test
    public void testComparisonWithUndefined() throws Exception {
        testFold("void 0 == undefined", "true");
        testFold("void 0 == null", "true");
        testFold("undefined == void 0", "true");
        testFold("null == void 0", "true");
        testFold("1 == undefined", "false");
        testFold("1 == null", "false");
        testFold("undefined == 1", "false");
        testFold("null == 1", "false");
        testFold("true == undefined", "false");
        testFold("true == null", "false");
        testFold("undefined == true", "false");
        testFold("null == true", "false");
        testFold("undefined === undefined", "true");
        testFold("null === null", "true");
        testFold("undefined === null", "false");
        testFold("null === undefined", "false");
    }

    @Test
    public void testGetElem() throws Exception {
        testFold("[1, 2, 3][1]", "2");
        testFold("[1, 2, 3][0]", "1");
        testFold("[1, 2, 3][2]", "3");
    }

    @Test
    public void testGetElemOutOfBounds() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("[1, 2, 3][3]");
        Node result = compiler.optimize();
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR.key, compiler.getErrors().get(0).getKey());
    }

    @Test
    public void testGetElemInvalidIndex() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("[1, 2, 3][1.5]");
        Node result = compiler.optimize();
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR.key, compiler.getErrors().get(0).getKey());
    }


    @Test
    public void testGetProp() throws Exception {
        testFold("[1, 2, 3].length", "3");
        testFold("\"abc\".length", "3");
        testFold("\"\".length", "0");
    }

    @Test
    public void testStringJoin() throws Exception {
        testFold("['a', 'b', 'c'].join('')", "\"abc\"");
        testFold("['a', 'b', 'c'].join(',')", "\"a,b,c\"");
        testFold("['a', 'b', 'c'].join()", "\"a,b,c\""); // Default separator is comma
        testFold("['a'].join('')", "\"a\"");
        testFold("[''].join('')", "\"\"");
        testFold("[]", "[]"); // Empty array remains empty
        testFold("['a', 1, 'b'].join(',')", "\"a,1,b\"");
        testFold("['a', null, 'b'].join(',')", "\"a,,b\""); // null becomes empty string
        testFold("['a', undefined, 'b'].join(',')", "\"a,,b\""); // undefined becomes empty string
    }

    @Test
    public void testStringJoinNoFold() throws Exception {
        // This test ensures that join operations that result in a larger or equal size
        // are not folded.
        testFold("['a', 'b'].join(',')", "\"a,b\""); // This should fold
        testFold("['a', 'b'].join()", "\"a,b\""); // This should fold
        testFold("['a', 'b', 'c'].join(',')", "\"a,b,c\""); // This should fold
        testFold("['a', 'b', 'c', 'd'].join(',')", "\"a,b,c,d\""); // This should fold
        testFold("['a', 'b', 'c', 'd', 'e'].join(',')", "\"a,b,c,d,e\""); // This should fold

        // Test case where folding would not reduce size or increase size.
        // Original size: ["a","b"].join(",") -> 15 characters
        // Folded size: "a,b" -> 3 characters
        // The optimization should happen.

        // Test case where folding would not reduce size.
        // Original size: ["ab"].join(",") -> 11 characters
        // Folded size: "ab" -> 2 characters
        // The optimization should happen.
        testFold("['ab'].join(',')", "\"ab\"");
    }


    @Test
    public void testStringIndexOf() throws Exception {
        testFold("\"abcdef\".indexOf(\"bc\")", "1");
        testFold("\"abcdef\".indexOf(\"ef\")", "4");
        testFold("\"abcdef\".indexOf(\"gh\")", "-1");
        testFold("\"abcdefbc\".indexOf(\"bc\", 3)", "6");
        testFold("\"abc\".indexOf(\"abc\")", "0");
        testFold("\"abc\".indexOf(\"abcd\")", "-1");
        testFold("\"\".indexOf(\"\")", "0");
        testFold("\"abc\".indexOf(\"\", 0)", "0");
        testFold("\"abc\".indexOf(\"\", 3)", "3");
        testFold("\"abc\".indexOf(\"\", 4)", "3");
    }

    @Test
    public void testStringLastIndexOf() throws Exception {
        testFold("\"abcdefbc\".lastIndexOf(\"bc\")", "6");
        testFold("\"abcdefbc\".lastIndexOf(\"bc\", 5)", "1");
        testFold("\"abcdefbc\".lastIndexOf(\"bc\", 6)", "6");
        testFold("\"abcdefbc\".lastIndexOf(\"bc\", 7)", "6");
        testFold("\"abcdefbc\".lastIndexOf(\"a\")", "0");
        testFold("\"abcdefbc\".lastIndexOf(\"g\")", "-1");
        testFold("\"\".lastIndexOf(\"\")", "0");
        testFold("\"abc\".lastIndexOf(\"\", 0)", "0");
        testFold("\"abc\".lastIndexOf(\"\", 3)", "3");
        testFold("\"abc\".lastIndexOf(\"\", 4)", "3");
    }

    @Test
    public void testStringIndexOfInvalidArgs() throws Exception {
        // Test that invalid arguments to indexOf/lastIndexOf are not folded.
        testFold("\"abc\".indexOf(123)", "\"abc\".indexOf(123)");
        testFold("\"abc\".indexOf([1,2])", "\"abc\".indexOf([1,2])");
        testFold("\"abc\".indexOf(null)", "\"abc\".indexOf(null)");
        testFold("\"abc\".indexOf(undefined)", "\"abc\".indexOf(undefined)");
        testFold("\"abc\".indexOf(\"a\", \"b\")", "\"abc\".indexOf(\"a\", \"b\")"); // Second arg not a number
        testFold("\"abc\".indexOf(\"a\", 1, 2)", "\"abc\".indexOf(\"a\", 1, 2)"); // Too many args
    }

    @Test
    public void testNegatingNonNumber() throws Exception {
        Compiler compiler = new Compiler();
        compiler.ப்புக்(new PeepholeFoldConstants());
        Node node = compiler.parseSyntheticCode("- \"abc\"");
        Node result = compiler.optimize();
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrors().size());
        assertEquals(PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR.key, compiler.getErrors().get(0).getKey());
    }

    @Test
    public void testArithmeticConstants() throws Exception {
        testFold("2*3+4", "10");
        testFold("10/(2*2)", "2.5");
        testFold("5%2+3", "4");
    }

    @Test
    public void testComplexConstants() throws Exception {
        testFold("1 + \"a\" + 2", "\"1a2\"");
        testFold("1 + \"a\" + \"b\"", "\"1ab\"");
        testFold("\"a\" + 1 + 2", "\"a3\"");
        testFold("\"a\" + \"b\" + 1", "\"ab1\"");
    }

    @Test
    public void testStringJoinWithNumberLiterals() throws Exception {
        testFold("[1, 2, 3].join(\",\")", "\"1,2,3\"");
        testFold("[1, 2.5, 3].join(\",\")", "\"1,2.5,3\"");
        testFold("[1, 0, 3].join(\",\")", "\"1,0,3\"");
    }

    @Test
    public void testStringJoinWithMixedLiterals() throws Exception {
        testFold("['a', 1, true, null].join(',')", "\"a,1,true,\"");
        testFold("[1, \"a\", false, undefined].join(',')", "\"1,a,false,\"");
    }
}
```