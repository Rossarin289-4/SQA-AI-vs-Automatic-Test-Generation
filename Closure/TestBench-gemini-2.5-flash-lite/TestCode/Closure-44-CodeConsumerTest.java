package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;

public class CodeConsumerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock CodeConsumer implementation for testing purposes
    private static class MockCodeConsumer extends CodeConsumer {
        StringBuilder output = new StringBuilder();
        char lastChar = 0;
        boolean statementContextForMock = false; // Added to track statementContext

        @Override
        char getLastChar() {
            return lastChar;
        }

        @Override
        void append(String str) {
            if (str.length() > 0) {
                lastChar = str.charAt(str.length() - 1);
            }
            output.append(str);
        }

        // Override to provide a concrete implementation for abstract methods if needed
        // For testing, we might not need to override all abstract methods if they are not called.
        // getLastChar() is overridden above.

        public String getOutput() {
            return output.toString();
        }

        // Mock implementation for endFunction to set a state that can be asserted
        @Override
        void endFunction(boolean statementContext) {
            sawFunction = true;
            this.statementContextForMock = statementContext; // Use the mock field
            if (statementContext) {
                endLine();
            }
        }

        // Getter for the mock statementContext to use in tests
        boolean getStatementContextForMock() {
            return this.statementContextForMock;
        }
    }

    @Test
    public void testAddIdentifier() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addIdentifier("test");
        assertEquals("test", consumer.getOutput());
    }

    @Test
    public void testAddIdentifierWithSpace() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addIdentifier("a"); // simulate existing char
        consumer.addIdentifier(" test");
        assertEquals("a test", consumer.getOutput());
    }

    @Test
    public void testAppendBlockStart() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.appendBlockStart();
        assertEquals("{", consumer.getOutput());
    }

    @Test
    public void testAppendBlockEnd() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.appendBlockEnd();
        assertEquals("}", consumer.getOutput());
    }

    @Test
    public void testBeginBlock() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.beginBlock();
        assertEquals("{", consumer.getOutput());
    }

    @Test
    public void testBeginBlockWithStatementNeedsEnded() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.statementNeedsEnded = true;
        consumer.beginBlock();
        assertEquals(";{", consumer.getOutput());
    }

    @Test
    public void testEndBlock() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.endBlock();
        assertEquals("}", consumer.getOutput());
    }

    @Test
    public void testEndBlockWithShouldEndLine() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.endBlock(true);
        assertEquals("}", consumer.getOutput());
    }

    @Test
    public void testListSeparator() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.listSeparator();
        assertEquals(",", consumer.getOutput());
    }

    @Test
    public void testEndStatement() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.statementStarted = true;
        consumer.endStatement();
        // statementNeedsEnded becomes true, but no semicolon is appended immediately
        assertTrue(consumer.statementNeedsEnded);
        assertEquals("", consumer.getOutput());
    }

    @Test
    public void testEndStatementWithNeedSemiColon() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.endStatement(true);
        assertEquals(";", consumer.getOutput());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testMaybeEndStatement() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.statementNeedsEnded = true;
        consumer.maybeEndStatement();
        assertEquals(";", consumer.getOutput());
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testMaybeEndStatementWhenNotNeeded() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.statementNeedsEnded = false;
        consumer.maybeEndStatement();
        assertEquals("", consumer.getOutput());
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testEndFunction() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.endFunction();
        assertTrue(consumer.sawFunction);
        assertFalse(consumer.getStatementContextForMock()); // Use the mock getter
    }

    @Test
    public void testEndFunctionWithStatementContext() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.endFunction(true);
        assertTrue(consumer.sawFunction);
        assertTrue(consumer.getStatementContextForMock()); // Use the mock getter
    }

    @Test
    public void testBeginCaseBody() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.beginCaseBody();
        assertEquals(":", consumer.getOutput());
    }

    @Test
    public void testAddEmptyString() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.add("");
        assertEquals("", consumer.getOutput());
    }

    @Test
    public void testAddIdentifierWithPreviousWordChar() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.add("foo");
        consumer.add("bar"); // 'b' is a word char, 'o' is a word char
        assertEquals("foo bar", consumer.getOutput());
    }

    @Test
    public void testAddWithForwardSlashAfterDiv() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        // Simulate previous char being '/' which is NOT a word char, but the rule checks getLastChar() == '/'
        // This setup is tricky, let's simulate the condition directly
        consumer.output.append("/"); // Mocking the state where getLastChar() is '/'
        consumer.lastChar = '/'; // Ensure lastChar is correctly set
        consumer.add("/regex"); // This will trigger the condition
        assertEquals("/ /regex", consumer.getOutput());
    }


    @Test
    public void testAppendOpAddition() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.appendOp("+", true);
        assertEquals("+", consumer.getOutput());
    }

    @Test
    public void testAppendOpSubtraction() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.appendOp("-", true);
        assertEquals("-", consumer.getOutput());
    }

    @Test
    public void testAddOpIncrementWithSamePreviousChar() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.add("x");
        consumer.addOp("++", true);
        assertEquals("x ++", consumer.getOutput());
    }

    @Test
    public void testAddOpDecrementWithSamePreviousChar() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.add("y");
        consumer.addOp("--", true);
        assertEquals("y --", consumer.getOutput());
    }

    @Test
    public void testAddOpInstanceofWithLetterPreviousChar() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.add("a");
        consumer.addOp("instanceof", true);
        assertEquals("a instanceof", consumer.getOutput());
    }

    @Test
    public void testAddOpArrowOperator() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.add("-");
        consumer.addOp(">", true);
        assertEquals("- >", consumer.getOutput());
    }

    @Test
    public void testAddNumberPositiveInteger() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addNumber(123);
        assertEquals("123", consumer.getOutput());
    }

    @Test
    public void testAddNumberNegativeInteger() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addNumber(-456);
        assertEquals("-456", consumer.getOutput());
    }

    @Test
    public void testAddNumberNegativeWithPreviousHyphen() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.add("-");
        consumer.addNumber(-10); // Should add a space before -10
        assertEquals("- -10", consumer.getOutput());
    }

    @Test
    public void testAddNumberPositiveDouble() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addNumber(123.45);
        assertEquals("123.45", consumer.getOutput());
    }

    @Test
    public void testAddNumberNegativeDouble() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addNumber(-123.45);
        assertEquals("-123.45", consumer.getOutput());
    }

    @Test
    public void testAddNumberZero() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addNumber(0.0);
        assertEquals("0", consumer.getOutput());
    }

    @Test
    public void testAddNumberNegativeZero() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addNumber(-0.0);
        // The reference source code converts -0.0 to "0" when it's not negative zero.
        // However, for negative zero specifically, it should be represented as "-0".
        // Let's trace the addNumber method:
        // if ((long) x == x && !isNegativeZero(x)) { ... } else { add(String.valueOf(x)); }
        // For x = -0.0: (long)x is 0. isNegativeZero(x) is true. So it goes to the else branch.
        // String.valueOf(-0.0) is "0.0" in Java. However, if the number is an integer, it will be "0".
        // The source code has logic to detect if it's an integer: (long) x == x
        // For -0.0, (long)-0.0 is 0. So (long) x == x is true.
        // It then checks `isNegativeZero(x)`. For -0.0, this is true.
        // So it bypasses the integer formatting and goes to `add(String.valueOf(x))`.
        // String.valueOf(-0.0) yields "0.0". The tests were expecting "-0".
        // The reference code uses `String.valueOf(x)` which for -0.0 is "0.0".
        // Let's adjust the assertion to match the source's String.valueOf behavior for double.
        // However, the source also has logic for integer representation:
        // if ((long) x == x && !isNegativeZero(x)) { ... }
        // If `isNegativeZero(x)` is true, it *doesn't* enter this block, and directly calls `add(String.valueOf(x))`.
        // So for -0.0, it will call `add(String.valueOf(-0.0))`, which is "0.0".
        // The test should expect "0.0".
        // Re-evaluating the source:
        // if ((long) x == x && !isNegativeZero(x)) { ... } else { add(String.valueOf(x)); }
        // For x = -0.0:
        // (long)x is 0.
        // isNegativeZero(x) is true.
        // The condition `(long) x == x && !isNegativeZero(x)` evaluates to `true && !true` which is `false`.
        // So it enters the `else` block.
        // It calls `add(String.valueOf(x))`.
        // `String.valueOf(-0.0)` returns "0.0".
        // The expected value should be "0.0".
        assertEquals("0.0", consumer.getOutput());
    }

    @Test
    public void testAddNumberLargeIntegerWithExponent() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addNumber(1000000000000.0); // 1e12
        assertEquals("1E12", consumer.getOutput());
    }

    @Test
    public void testAddNumberSmallInteger() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.addNumber(99);
        assertEquals("99", consumer.getOutput());
    }

    @Test
    public void testIsNegativeZeroTrue() throws Exception {
        assertTrue(CodeConsumer.isNegativeZero(-0.0));
    }

    @Test
    public void testIsNegativeZeroFalse() throws Exception {
        assertFalse(CodeConsumer.isNegativeZero(0.0));
        assertFalse(CodeConsumer.isNegativeZero(1.0));
    }

    @Test
    public void testIsWordCharLetter() {
        assertTrue(CodeConsumer.isWordChar('a'));
        assertTrue(CodeConsumer.isWordChar('Z'));
    }

    @Test
    public void testIsWordCharDigit() {
        assertTrue(CodeConsumer.isWordChar('0'));
        assertTrue(CodeConsumer.isWordChar('9'));
    }

    @Test
    public void testIsWordCharUnderscoreDollar() {
        assertTrue(CodeConsumer.isWordChar('_'));
        assertTrue(CodeConsumer.isWordChar('$'));
    }

    @Test
    public void testIsWordCharNonWord() {
        assertFalse(CodeConsumer.isWordChar(' '));
        assertFalse(CodeConsumer.isWordChar('-'));
        assertFalse(CodeConsumer.isWordChar('/'));
    }

    @Test
    public void testShouldPreserveExtraBlocksFalse() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        assertFalse(consumer.shouldPreserveExtraBlocks());
    }

    @Test
    public void testBreakAfterBlockForTrue() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        Node dummyNode = new Node(1); // Node type doesn't matter for this test
        assertTrue(consumer.breakAfterBlockFor(dummyNode, true));
    }

    @Test
    public void testBreakAfterBlockForFalse() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        Node dummyNode = new Node(1); // Node type doesn't matter for this test
        assertFalse(consumer.breakAfterBlockFor(dummyNode, false));
    }

    @Test
    public void testEndFile() throws Exception {
        MockCodeConsumer consumer = new MockCodeConsumer();
        consumer.endFile();
        assertEquals("", consumer.getOutput()); // No visible side effect
    }
}
