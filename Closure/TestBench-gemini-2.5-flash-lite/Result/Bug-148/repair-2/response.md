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

    private Node optimizeCode(String code) {
        Compiler compiler = new Compiler();
        compiler.optimize(); // Placeholder for actual optimization setup if needed, but PeepholeFoldConstants is applied in the compiler's pipeline.
        Node root = IRFactory.parse(code); // Use IRFactory to parse
        Node optimizedRoot = compiler.process(root); // Use process to run optimizations
        return optimizedRoot;
    }

    private String toSource(Node node) {
        // A simplified way to get source. In a real scenario, you'd use CodeGenerator.
        // For this test, we'll assume a basic string representation.
        // This part is tricky without a full CodeGenerator. We'll rely on Node's toString for simplicity or simulate.
        // A better approach might be to check the AST structure if toSource is not available.
        // For now, let's simulate what a simplified CodeGenerator might do.
        StringBuilder sb = new StringBuilder();
        new NodeUtil.CodePrinter(sb).appendString(node); // Use CodePrinter if available
        return sb.toString();
    }


    @Test
    public void testTypeOf() throws Exception {
        assertEquals("\"number\"", toSource(optimizeCode("typeof(1)")));
        assertEquals("\"string\"", toSource(optimizeCode("typeof(\"hello\")")));
        assertEquals("\"boolean\"", toSource(optimizeCode("typeof(true)")));
        assertEquals("\"object\"", toSource(optimizeCode("typeof(null)")));
        assertEquals("\"undefined\"", toSource(optimizeCode("typeof(undefined)")));
        assertEquals("\"object\"", toSource(optimizeCode("typeof({})")));
        assertEquals("\"object\"", toSource(optimizeCode("typeof([])")));
    }

    @Test
    public void testTypeOfName() throws Exception {
        assertEquals("\"undefined\"", toSource(optimizeCode("typeof undefined")));
    }

    @Test
    public void testNot() throws Exception {
        assertEquals("false", toSource(optimizeCode("!true")));
        assertEquals("true", toSource(optimizeCode("!false")));
        assertEquals("true", toSource(optimizeCode("!!true")));
        assertEquals("false", toSource(optimizeCode("!!false")));
        assertEquals("false", toSource(optimizeCode("!1")));
        assertEquals("true", toSource(optimizeCode("!0")));
        assertEquals("true", toSource(optimizeCode("!\"\"")));
        assertEquals("false", toSource(optimizeCode("!\"hello\"")));
    }

    @Test
    public void testNeg() throws Exception {
        assertEquals("0.0", toSource(optimizeCode("-0"))); // JS represents -0 as 0.0 sometimes
        assertEquals("-1.0", toSource(optimizeCode("-1")));
        assertEquals("-1.5", toSource(optimizeCode("-1.5")));
        assertEquals("Infinity", toSource(optimizeCode("-Infinity"))); // JS represents -Infinity as Infinity when negated
        assertEquals("NaN", toSource(optimizeCode("-NaN")));
    }

    @Test
    public void testBitNot() throws Exception {
        assertEquals("-1", toSource(optimizeCode("~0")));
        assertEquals("-2", toSource(optimizeCode("~1")));
        assertEquals("0", toSource(optimizeCode("~-1")));
        assertEquals("-2147483648", toSource(optimizeCode("~2147483647"))); // MAX_INT
        assertEquals("2147483647", toSource(optimizeCode("~-2147483648"))); // MIN_INT
    }

    @Test
    public void testBitNotOutOfBounds() throws Exception {
        Compiler compiler = new Compiler();
        Node root = IRFactory.parse("~2147483648"); // Integer.MAX_VALUE + 1
        try {
            compiler.process(root); // This should trigger the error
            fail("Expected an exception for out of bounds bitwise operation");
        } catch (Exception e) {
            // Check if the exception message or type indicates the error
            assertTrue(e.getMessage().contains("JSC_BITWISE_OPERAND_OUT_OF_RANGE"));
        }
    }

    @Test
    public void testBitNotFractional() throws Exception {
        Compiler compiler = new Compiler();
        Node root = IRFactory.parse("~1.5");
        try {
            compiler.process(root);
            fail("Expected an exception for fractional bitwise operand");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("JSC_FRACTIONAL_BITWISE_OPERAND"));
        }
    }

    @Test
    public void testInstanceof() throws Exception {
        assertEquals("true", toSource(optimizeCode("1 instanceof Object")));
        assertEquals("true", toSource(optimizeCode("true instanceof Object")));
        assertEquals("true", toSource(optimizeCode("\"a\" instanceof Object")));
        assertEquals("false", toSource(optimizeCode("null instanceof Object")));
        assertEquals("false", toSource(optimizeCode("undefined instanceof Object")));
        assertEquals("false", toSource(optimizeCode("1 instanceof String")));
    }

    @Test
    public void testAssignAdd() throws Exception {
        assertEquals("var x = 5; x += 3;", toSource(optimizeCode("var x = 5; x = x + 3;")));
        assertEquals("var x = 5; x -= 3;", toSource(optimizeCode("var x = 5; x = x - 3;")));
        assertEquals("var x = 5; x *= 3;", toSource(optimizeCode("var x = 5; x = x * 3;")));
        assertEquals("var x = 5; x /= 3;", toSource(optimizeCode("var x = 5; x = x / 3;")));
        assertEquals("var x = 5; x %= 3;", toSource(optimizeCode("var x = 5; x = x % 3;")));
        assertEquals("var x = 5; x <<= 3;", toSource(optimizeCode("var x = 5; x = x << 3;")));
        assertEquals("var x = 5; x >>= 3;", toSource(optimizeCode("var x = 5; x = x >> 3;")));
        assertEquals("var x = 5; x >>>= 3;", toSource(optimizeCode("var x = 5; x = x >>> 3;")));
        assertEquals("var x = 5; x |= 3;", toSource(optimizeCode("var x = 5; x = x | 3;")));
        assertEquals("var x = 5; x &= 3;", toSource(optimizeCode("var x = 5; x = x & 3;")));
        assertEquals("var x = 5; x ^= 3;", toSource(optimizeCode("var x = 5; x = x ^ 3;")));
    }

    @Test
    public void testAndOr() throws Exception {
        assertEquals("true", toSource(optimizeCode("true || 1")));
        assertEquals("1", toSource(optimizeCode("1 || true")));
        assertEquals("false", toSource(optimizeCode("false && 1")));
        assertEquals("1", toSource(optimizeCode("1 && true")));
        assertEquals("false", toSource(optimizeCode("true && false")));
        assertEquals("true", toSource(optimizeCode("false || true")));
    }

    @Test
    public void testLeftChildAdd() throws Exception {
        // The original test logic seems to assume specific compiler behavior that might not be universally true or easily testable without the full Compiler setup.
        // We will test cases where string concatenation is involved.
        assertEquals("a + \"7\"", toSource(optimizeCode("a + \"7\""))); // Not folded as lr is not string
        assertEquals("a + \"78\"", toSource(optimizeCode("a + \"7\" + \"8\""))); // Folded
        assertEquals("a + \"78\"", toSource(optimizeCode("a + \"7\" + 8"))); // Folded
    }

    @Test
    public void testAddConstant() throws Exception {
        assertEquals("3", toSource(optimizeCode("1 + 2")));
        assertEquals("4.0", toSource(optimizeCode("1.5 + 2.5")));
        assertEquals("\"ab\"", toSource(optimizeCode("\"a\" + \"b\"")));
        assertEquals("\"a1\"", toSource(optimizeCode("\"a\" + 1")));
        assertEquals("\"1a\"", toSource(optimizeCode("1 + \"a\"")));
        assertEquals("5", toSource(optimizeCode("null + 5")));
        assertEquals("6", toSource(optimizeCode("true + 5")));
        assertEquals("5", toSource(optimizeCode("false + 5")));
    }

    @Test
    public void testArithmetic() throws Exception {
        assertEquals("8", toSource(optimizeCode("1 + 7")));
        assertEquals("7", toSource(optimizeCode("8 - 1")));
        assertEquals("12", toSource(optimizeCode("3 * 4")));
        assertEquals("5.0", toSource(optimizeCode("10 / 2")));
        assertEquals("2.5", toSource(optimizeCode("10 / 4")));
        assertEquals("1", toSource(optimizeCode("10 % 3")));
    }

    @Test
    public void testArithmeticOutOfBounds() throws Exception {
        // Testing the MAX_FOLD_NUMBER condition. If the result exceeds MAX_FOLD_NUMBER, it should not fold.
        // We use values close to 2^53.
        assertEquals("Math.pow(2, 53) + 1", toSource(optimizeCode("Math.pow(2, 53) + 1")));
        assertEquals("Math.pow(2, 53) * 2", toSource(optimizeCode("Math.pow(2, 53) * 2")));
        assertEquals("Math.pow(2, 53)", toSource(optimizeCode("Math.pow(2, 52) * 2"))); // This should fold
    }

    @Test
    public void testDivideByZero() throws Exception {
        Compiler compiler = new Compiler();
        Node root = IRFactory.parse("1 / 0");
        try {
            compiler.process(root);
            fail("Expected an exception for divide by zero");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("JSC_DIVIDE_BY_0_ERROR"));
        }
    }

    @Test
    public void testBitAndOr() throws Exception {
        assertEquals("3", toSource(optimizeCode("1 | 2")));
        assertEquals("3", toSource(optimizeCode("2 | 1")));
        assertEquals("0", toSource(optimizeCode("1 & 2")));
        assertEquals("0", toSource(optimizeCode("2 & 1")));
        assertEquals("0", toSource(optimizeCode("0 | 0")));
        assertEquals("0", toSource(optimizeCode("0 & 0")));
        assertEquals("-1", toSource(optimizeCode("-1 | 5")));
        assertEquals("5", toSource(optimizeCode("-1 & 5")));
    }

    @Test
    public void testBitAndOrOutOfBounds() throws Exception {
        // Operands should be within the range of 32-bit signed integers for bitwise ops.
        // JS engines might handle larger numbers differently for bitwise ops, but the peephole
        // is likely conservative. Let's assume it requires int range.
        assertEquals("2147483648 | 1", toSource(optimizeCode("2147483648 | 1")));
    }

    @Test
    public void testBitAndOrFractional() throws Exception {
        // Fractional operands for bitwise ops are not folded.
        assertEquals("1.5 | 2", toSource(optimizeCode("1.5 | 2")));
    }

    @Test
    public void testShift() throws Exception {
        assertEquals("4", toSource(optimizeCode("1 << 2")));
        assertEquals("2", toSource(optimizeCode("4 >> 1")));
        assertEquals("2", toSource(optimizeCode("8 >>> 2")));
        assertEquals("1", toSource(optimizeCode("1 << 0")));
        assertEquals("-2147483648", toSource(optimizeCode("1 << 31")));
        assertEquals("1", toSource(optimizeCode("1 << 32"))); // Shift amount wraps around in JS
    }

    @Test
    public void testShiftAmountOutOfBounds() throws Exception {
        // Shift amount is masked to 5 bits (0-31). A shift by 32 is equivalent to 0.
        // The peephole optimization might flag it if it's outside the 0-31 range explicitly.
        // However, JS spec implies it wraps. Let's test for no folding if it's > 31.
        assertEquals("1 << 32", toSource(optimizeCode("1 << 32")));
    }

    @Test
    public void testShiftFractionalOperand() throws Exception {
        // Fractional operands for shift ops are not folded.
        assertEquals("1.5 << 2", toSource(optimizeCode("1.5 << 2")));
    }

    @Test
    public void testShiftOutOfBoundsOperand() throws Exception {
        // Operands should be within the range of 32-bit signed integers for shift ops.
        // The peephole likely checks this.
        assertEquals("2147483648 << 2", toSource(optimizeCode("2147483648 << 2")));
    }

    @Test
    public void testComparison() throws Exception {
        assertEquals("true", toSource(optimizeCode("1 == 1")));
        assertEquals("false", toSource(optimizeCode("1 == 2")));
        assertEquals("false", toSource(optimizeCode("1 != 1")));
        assertEquals("true", toSource(optimizeCode("1 != 2")));
        assertEquals("true", toSource(optimizeCode("1 < 2")));
        assertEquals("false", toSource(optimizeCode("2 < 1")));
        assertEquals("true", toSource(optimizeCode("1 <= 1")));
        assertEquals("true", toSource(optimizeCode("1 <= 2")));
        assertEquals("false", toSource(optimizeCode("1 <= 0")));
        assertEquals("false", toSource(optimizeCode("1 > 1")));
        assertEquals("true", toSource(optimizeCode("2 > 1")));
        assertEquals("true", toSource(optimizeCode("1 >= 1")));
        assertEquals("false", toSource(optimizeCode("1 >= 2")));
        assertEquals("true", toSource(optimizeCode("2 >= 1")));
        assertEquals("true", toSource(optimizeCode("\"a\" == \"a\"")));
        assertEquals("false", toSource(optimizeCode("\"a\" == \"b\"")));
        assertEquals("false", toSource(optimizeCode("\"a\" != \"a\"")));
        assertEquals("true", toSource(optimizeCode("\"a\" != \"b\"")));
        assertEquals("true", toSource(optimizeCode("true == true")));
        assertEquals("false", toSource(optimizeCode("true == false")));
        assertEquals("true", toSource(optimizeCode("null == null")));
        assertEquals("true", toSource(optimizeCode("undefined == undefined")));
        assertEquals("true", toSource(optimizeCode("null == undefined"))); // JS loose equality
        assertEquals("true", toSource(optimizeCode("undefined == null"))); // JS loose equality
        assertEquals("true", toSource(optimizeCode("0 == false")));
        assertEquals("false", toSource(optimizeCode("0 == null")));
        assertEquals("false", toSource(optimizeCode("0 == undefined")));
        assertEquals("true", toSource(optimizeCode("1 == \"1\""))); // Loose equality
        assertEquals("false", toSource(optimizeCode("1 === \"1\""))); // Strict equality
        assertEquals("false", toSource(optimizeCode("null === undefined"))); // Strict equality
    }

    @Test
    public void testComparisonWithUndefined() throws Exception {
        assertEquals("true", toSource(optimizeCode("void 0 == undefined")));
        assertEquals("true", toSource(optimizeCode("void 0 == null")));
        assertEquals("true", toSource(optimizeCode("undefined == void 0")));
        assertEquals("true", toSource(optimizeCode("null == void 0")));
        assertEquals("false", toSource(optimizeCode("1 == undefined")));
        assertEquals("false", toSource(optimizeCode("1 == null")));
        assertEquals("false", toSource(optimizeCode("undefined == 1")));
        assertEquals("false", toSource(optimizeCode("null == 1")));
        assertEquals("false", toSource(optimizeCode("true == undefined")));
        assertEquals("false", toSource(optimizeCode("true == null")));
        assertEquals("false", toSource(optimizeCode("undefined == true")));
        assertEquals("false", toSource(optimizeCode("null == true")));
        assertEquals("true", toSource(optimizeCode("undefined === undefined")));
        assertEquals("true", toSource(optimizeCode("null === null")));
        assertEquals("false", toSource(optimizeCode("undefined === null")));
        assertEquals("false", toSource(optimizeCode("null === undefined")));
    }

    @Test
    public void testGetElem() throws Exception {
        assertEquals("2", toSource(optimizeCode("[1, 2, 3][1]")));
        assertEquals("1", toSource(optimizeCode("[1, 2, 3][0]")));
        assertEquals("3", toSource(optimizeCode("[1, 2, 3][2]")));
    }

    @Test
    public void testGetElemOutOfBounds() throws Exception {
        // Accessing out of bounds should not result in an error during optimization,
        // but should return undefined. The peephole might not fold this if it
        // can't determine the value statically.
        assertEquals("undefined", toSource(optimizeCode("[1, 2, 3][3]")));
    }

    @Test
    public void testGetElemInvalidIndex() throws Exception {
        // Invalid index types should not be folded.
        assertEquals("[1, 2, 3][1.5]", toSource(optimizeCode("[1, 2, 3][1.5]")));
    }

    @Test
    public void testGetProp() throws Exception {
        assertEquals("3", toSource(optimizeCode("[1, 2, 3].length")));
        assertEquals("3", toSource(optimizeCode("\"abc\".length")));
        assertEquals("0", toSource(optimizeCode("\"\".length")));
    }

    @Test
    public void testStringJoin() throws Exception {
        assertEquals("\"abc\"", toSource(optimizeCode("['a', 'b', 'c'].join('')")));
        assertEquals("\"a,b,c\"", toSource(optimizeCode("['a', 'b', 'c'].join(',')")));
        assertEquals("\"a,b,c\"", toSource(optimizeCode("['a', 'b', 'c'].join()"))); // Default separator is comma
        assertEquals("\"a\"", toSource(optimizeCode("['a'].join('')")));
        assertEquals("\"\"", toSource(optimizeCode("[''].join('')")));
        assertEquals("[]", toSource(optimizeCode("[]"))); // Empty array remains empty
        assertEquals("\"a,1,b\"", toSource(optimizeCode("['a', 1, 'b'].join(',')")));
        assertEquals("\"a,,b\"", toSource(optimizeCode("['a', null, 'b'].join(',')"))); // null becomes empty string
        assertEquals("\"a,,b\"", toSource(optimizeCode("['a', undefined, 'b'].join(',')"))); // undefined becomes empty string
    }

    @Test
    public void testStringJoinNoFold() throws Exception {
        // These cases should fold as the resulting string is shorter.
        assertEquals("\"a,b\"", toSource(optimizeCode("['a', 'b'].join(',')")));
        assertEquals("\"a,b\"", toSource(optimizeCode("['a', 'b'].join()")));
        assertEquals("\"a,b,c\"", toSource(optimizeCode("['a', 'b', 'c'].join(',')")));
        assertEquals("\"a,b,c,d\"", toSource(optimizeCode("['a', 'b', 'c', 'd'].join(',')")));
        assertEquals("\"a,b,c,d,e\"", toSource(optimizeCode("['a', 'b', 'c', 'd', 'e'].join(',')")));
        assertEquals("\"ab\"", toSource(optimizeCode("['ab'].join(',')")));
    }

    @Test
    public void testStringIndexOf() throws Exception {
        assertEquals("1", toSource(optimizeCode("\"abcdef\".indexOf(\"bc\")")));
        assertEquals("4", toSource(optimizeCode("\"abcdef\".indexOf(\"ef\")")));
        assertEquals("-1", toSource(optimizeCode("\"abcdef\".indexOf(\"gh\")")));
        assertEquals("6", toSource(optimizeCode("\"abcdefbc\".indexOf(\"bc\", 3)")));
        assertEquals("0", toSource(optimizeCode("\"abc\".indexOf(\"abc\")")));
        assertEquals("-1", toSource(optimizeCode("\"abc\".indexOf(\"abcd\")")));
        assertEquals("0", toSource(optimizeCode("\"\".indexOf(\"\")")));
        assertEquals("0", toSource(optimizeCode("\"abc\".indexOf(\"\", 0)")));
        assertEquals("3", toSource(optimizeCode("\"abc\".indexOf(\"\", 3)")));
        assertEquals("3", toSource(optimizeCode("\"abc\".indexOf(\"\", 4)")));
    }

    @Test
    public void testStringLastIndexOf() throws Exception {
        assertEquals("6", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"bc\")")));
        assertEquals("1", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"bc\", 5)")));
        assertEquals("6", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"bc\", 6)")));
        assertEquals("6", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"bc\", 7)")));
        assertEquals("0", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"a\")")));
        assertEquals("-1", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"g\")")));
        assertEquals("0", toSource(optimizeCode("\"\".lastIndexOf(\"\")")));
        assertEquals("0", toSource(optimizeCode("\"abc\".lastIndexOf(\"\", 0)")));
        assertEquals("3", toSource(optimizeCode("\"abc\".lastIndexOf(\"\", 3)")));
        assertEquals("3", toSource(optimizeCode("\"abc\".lastIndexOf(\"\", 4)")));
    }

    @Test
    public void testStringIndexOfInvalidArgs() throws Exception {
        // Test that invalid arguments to indexOf/lastIndexOf are not folded.
        assertEquals("\"abc\".indexOf(123)", toSource(optimizeCode("\"abc\".indexOf(123)")));
        assertEquals("\"abc\".indexOf([1,2])", toSource(optimizeCode("\"abc\".indexOf([1,2])")));
        assertEquals("\"abc\".indexOf(null)", toSource(optimizeCode("\"abc\".indexOf(null)")));
        assertEquals("\"abc\".indexOf(undefined)", toSource(optimizeCode("\"abc\".indexOf(undefined)")));
        assertEquals("\"abc\".indexOf(\"a\", \"b\")", toSource(optimizeCode("\"abc\".indexOf(\"a\", \"b\")"))); // Second arg not a number
        assertEquals("\"abc\".indexOf(\"a\", 1, 2)", toSource(optimizeCode("\"abc\".indexOf(\"a\", 1, 2)"))); // Too many args
    }

    @Test
    public void testNegatingNonNumber() throws Exception {
        Compiler compiler = new Compiler();
        Node root = IRFactory.parse("- \"abc\"");
        try {
            compiler.process(root);
            fail("Expected an exception for negating non-number");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("JSC_NEGATING_A_NON_NUMBER_ERROR"));
        }
    }

    @Test
    public void testArithmeticConstants() throws Exception {
        assertEquals("10", toSource(optimizeCode("2*3+4")));
        assertEquals("2.5", toSource(optimizeCode("10/(2*2)")));
        assertEquals("4", toSource(optimizeCode("5%2+3")));
    }

    @Test
    public void testComplexConstants() throws Exception {
        assertEquals("\"1a2\"", toSource(optimizeCode("1 + \"a\" + 2")));
        assertEquals("\"1ab\"", toSource(optimizeCode("1 + \"a\" + \"b\"")));
        assertEquals("\"a3\"", toSource(optimizeCode("\"a\" + 1 + 2")));
        assertEquals("\"ab1\"", toSource(optimizeCode("\"a\" + \"b\" + 1")));
    }

    @Test
    public void testStringJoinWithNumberLiterals() throws Exception {
        assertEquals("\"1,2,3\"", toSource(optimizeCode("[1, 2, 3].join(\",\")")));
        assertEquals("\"1,2.5,3\"", toSource(optimizeCode("[1, 2.5, 3].join(\",\")")));
        assertEquals("\"1,0,3\"", toSource(optimizeCode("[1, 0, 3].join(\",\")")));
    }

    @Test
    public void testStringJoinWithMixedLiterals() throws Exception {
        assertEquals("\"a,1,true,\"", toSource(optimizeCode("['a', 1, true, null].join(',')")));
        assertEquals("\"1,a,false,\"", toSource(optimizeCode("[1, \"a\", false, undefined].join(',')")));
    }
}
```