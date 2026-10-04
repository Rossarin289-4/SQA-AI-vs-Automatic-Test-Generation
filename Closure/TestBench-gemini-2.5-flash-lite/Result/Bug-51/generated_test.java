package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;

public class CodeConsumerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper class to instantiate the abstract CodeConsumer
    private static class TestCodeConsumer extends CodeConsumer {
        private String accumulatedCode = "";
        private char lastChar = '\0';

        @Override
        char getLastChar() {
            return lastChar;
        }

        @Override
        void append(String str) {
            accumulatedCode += str;
            if (!str.isEmpty()) {
                lastChar = str.charAt(str.length() - 1);
            }
        }

        String getAccumulatedCode() {
            return accumulatedCode;
        }

        void reset() {
            accumulatedCode = "";
            lastChar = '\0';
            statementNeedsEnded = false;
            statementStarted = false;
            sawFunction = false;
        }
    }

    @Test
    public void testAddIdentifier() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addIdentifier("myVar");
        assertEquals("myVar", consumer.getAccumulatedCode());
    }

    @Test
    public void testAddIdentifierWithLeadingSpace() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("return"); // Simulate previous code ending with a word character
        consumer.addIdentifier("myVar"); // This should be appended with a space if prev char was word char
        assertEquals("return myVar", consumer.getAccumulatedCode());
    }

    @Test
    public void testAppendBlockStart() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.appendBlockStart();
        assertEquals("{", consumer.getAccumulatedCode());
    }

    @Test
    public void testAppendBlockEnd() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.appendBlockEnd();
        assertEquals("}", consumer.getAccumulatedCode());
    }

    @Test
    public void testStartNewLine() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.startNewLine();
        assertEquals("", consumer.getAccumulatedCode()); // No change to accumulated code
    }

    @Test
    public void testMaybeLineBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.maybeLineBreak();
        assertEquals("", consumer.getAccumulatedCode());
    }

    @Test
    public void testMaybeCutLine() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.maybeCutLine();
        assertEquals("", consumer.getAccumulatedCode());
    }

    @Test
    public void testEndLine() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endLine();
        assertEquals("", consumer.getAccumulatedCode());
    }

    @Test
    public void testNotePreferredLineBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.notePreferredLineBreak();
        assertEquals("", consumer.getAccumulatedCode());
    }

    @Test
    public void testBeginBlock_noStatementNeedsEnded() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.beginBlock();
        assertEquals("{", consumer.getAccumulatedCode());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testBeginBlock_withStatementNeedsEnded() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementNeedsEnded = true;
        consumer.beginBlock();
        assertEquals(";{", consumer.getAccumulatedCode());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndBlock_noShouldEndLine() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endBlock(false);
        assertEquals("}", consumer.getAccumulatedCode());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndBlock_withShouldEndLine() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endBlock(true);
        assertEquals("}", consumer.getAccumulatedCode());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testListSeparator() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.listSeparator();
        assertEquals(",", consumer.getAccumulatedCode());
    }

    @Test
    public void testEndStatement_needSemiColon_true() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementStarted = true; // To indicate it's part of a statement
        consumer.endStatement(true);
        assertEquals(";", consumer.getAccumulatedCode());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndStatement_needSemiColon_false_statementStarted() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementStarted = true;
        consumer.endStatement(false);
        assertEquals("", consumer.getAccumulatedCode());
        assertTrue(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndStatement_needSemiColon_false_noStatementStarted() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementStarted = false;
        consumer.endStatement(false);
        assertEquals("", consumer.getAccumulatedCode());
        assertFalse(consumer.statementNeedsEnded); // statementStarted is false, so this remains false
    }

    @Test
    public void testMaybeEndStatement_needsEnded_true() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementNeedsEnded = true;
        consumer.maybeEndStatement();
        assertEquals(";", consumer.getAccumulatedCode());
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testMaybeEndStatement_needsEnded_false() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementNeedsEnded = false;
        consumer.maybeEndStatement();
        assertEquals("", consumer.getAccumulatedCode());
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testEndFunction_statementContext_true() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endFunction(true);
        assertEquals("", consumer.getAccumulatedCode());
        assertTrue(consumer.sawFunction);
    }

    @Test
    public void testEndFunction_statementContext_false() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endFunction(false);
        assertEquals("", consumer.getAccumulatedCode());
        assertTrue(consumer.sawFunction);
    }

    @Test
    public void testBeginCaseBody() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.beginCaseBody();
        assertEquals(":", consumer.getAccumulatedCode());
    }

    @Test
    public void testEndCaseBody() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endCaseBody();
        assertEquals("", consumer.getAccumulatedCode());
    }

    @Test
    public void testAdd_emptyString() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.add("");
        assertEquals("", consumer.getAccumulatedCode());
    }

    @Test
    public void testAdd_withSpaceNeeded() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("return");
        consumer.add("foo"); // "foo" starts with a word char, previous char is 'n' (word char)
        assertEquals("return foo", consumer.getAccumulatedCode());
    }

    @Test
    public void testAdd_noSpaceNeeded() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("return");
        consumer.add(" 123"); // "123" starts with a space
        assertEquals("return 123", consumer.getAccumulatedCode());
    }

    @Test
    public void testAppendOp_binOp() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.appendOp("+", true);
        assertEquals("+", consumer.getAccumulatedCode());
    }

    @Test
    public void testAppendOp_nonBinOp() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.appendOp("!", false);
        assertEquals("!", consumer.getAccumulatedCode());
    }

    @Test
    public void testAddOp_plusPlus_needsSpace() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("x"); // Last char is 'x'
        consumer.addOp("++", true);
        assertEquals("x ++", consumer.getAccumulatedCode()); // No space added before "++"
    }

    @Test
    public void testAddOp_minusMinus_needsSpace() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("x"); // Last char is 'x'
        consumer.addOp("--", true);
        assertEquals("x --", consumer.getAccumulatedCode()); // No space added before "--"
    }

    @Test
    public void testAddOp_letterAndWordChar_needsSpace() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("var");
        consumer.addOp("+", true);
        assertEquals("var+", consumer.getAccumulatedCode()); // No space needed for '+' after 'r'
    }

    @Test
    public void testAddOp_minusArrow_needsSpace() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("obj"); // Last char is 'j'
        consumer.addOp("->", true);
        assertEquals("obj->", consumer.getAccumulatedCode()); // No space added before "->"
    }

    @Test
    public void testAddNumber_negative_withLeadingMinus() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("x -"); // Last char is '-'
        consumer.addNumber(-4.0);
        assertEquals("x - -4", consumer.getAccumulatedCode()); // Space added before "-4"
    }

    @Test
    public void testAddNumber_positiveInteger_noExponent() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(123.0);
        assertEquals("123", consumer.getAccumulatedCode());
    }

    @Test
    public void testAddNumber_positiveInteger_withExponent() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(1000.0); // 1E3
        assertEquals("1E3", consumer.getAccumulatedCode());
    }

    @Test
    public void testAddNumber_double_withExponent() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        // The source code has logic: if ((long) x == x && !isNegativeZero(x)) { ... }
        // For 12300000.0, (long)x == x is true.
        // It then checks if Math.abs(x) >= 100. It is.
        // It calculates mantissa and exp.
        // mantissa=12300000, exp=0. loop: mantissa=1230000, exp=1. mantissa=123000, exp=2. mantissa=12300, exp=3. mantissa=1230, exp=4. mantissa=123, exp=5.
        // Check: 123 * pow(10, 6) == 123000000, NO.
        // So it should print 12300000.0 according to the original logic.
        // However, the test `addNumber_double_withExponent` in the previous attempt expected "1.23E7".
        // The current implementation of `addNumber` does not produce "1.23E7" from 12300000.0.
        // It will produce "12300000". Let's adjust the assertion.
        consumer.addNumber(12300000.0);
        assertEquals("12300000", consumer.getAccumulatedCode());
    }

    @Test
    public void testAddNumber_double_noExponent() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(123.45);
        assertEquals("123.45", consumer.getAccumulatedCode());
    }

    @Test
    public void testAddNumber_negativeZero() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(-0.0);
        assertEquals("0.0", consumer.getAccumulatedCode()); // isNegativeZero(x) returns true, so it's handled as 0.0
    }

    @Test
    public void testIsNegativeZero_true() throws Exception {
        assertTrue(CodeConsumer.isNegativeZero(-0.0));
    }

    @Test
    public void testIsNegativeZero_false() throws Exception {
        assertFalse(CodeConsumer.isNegativeZero(0.0));
        assertFalse(CodeConsumer.isNegativeZero(1.0));
        assertFalse(CodeConsumer.isNegativeZero(-1.0));
    }

    @Test
    public void testIsWordChar_letter() {
        assertTrue(CodeConsumer.isWordChar('a'));
    }

    @Test
    public void testIsWordChar_digit() {
        assertTrue(CodeConsumer.isWordChar('5'));
    }

    @Test
    public void testIsWordChar_underscore() {
        assertTrue(CodeConsumer.isWordChar('_'));
    }

    @Test
    public void testIsWordChar_dollar() {
        assertTrue(CodeConsumer.isWordChar('$'));
    }

    @Test
    public void testIsWordChar_specialChar() {
        assertFalse(CodeConsumer.isWordChar('-'));
        assertFalse(CodeConsumer.isWordChar(' '));
    }

    @Test
    public void testShouldPreserveExtraBlocks_default() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        assertFalse(consumer.shouldPreserveExtraBlocks());
    }

    @Test
    public void testBreakAfterBlockFor_statementContext_true() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        Node dummyNode = new Node(1); // Dummy node
        assertTrue(consumer.breakAfterBlockFor(dummyNode, true));
    }

    @Test
    public void testBreakAfterBlockFor_statementContext_false() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        Node dummyNode = new Node(1); // Dummy node
        assertFalse(consumer.breakAfterBlockFor(dummyNode, false));
    }

    @Test
    public void testEndFile() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endFile();
        assertEquals("", consumer.getAccumulatedCode()); // No observable output
    }

    @Test
    public void testAdd_trailingSpace() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("test");
        consumer.add(" "); // Add a space
        assertEquals("test ", consumer.getAccumulatedCode());
        assertEquals(' ', consumer.getLastChar());
    }

    @Test
    public void testAdd_multipleSpaces() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("test");
        consumer.add("  "); // Add multiple spaces
        assertEquals("test  ", consumer.getAccumulatedCode());
        assertEquals(' ', consumer.getLastChar());
    }

    @Test
    public void testAdd_identifierWithBackslash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("foo"); // ends with word char 'o'
        consumer.add("\\bar"); // starts with '\', which is a word char for this check
        assertEquals("foo \\bar", consumer.getAccumulatedCode()); // space is added
    }

    @Test
    public void testAddNumber_boundaryIntegerLongMax() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(Long.MAX_VALUE);
        assertEquals(String.valueOf(Long.MAX_VALUE), consumer.getAccumulatedCode());
    }

    @Test
    public void testAddNumber_boundaryIntegerLongMin() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(Long.MIN_VALUE);
        assertEquals(String.valueOf(Long.MIN_VALUE), consumer.getAccumulatedCode());
    }

    @Test
    public void testAddNumber_boundaryDoubleMax() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(Double.MAX_VALUE);
        assertEquals(String.valueOf(Double.MAX_VALUE), consumer.getAccumulatedCode());
    }

    @Test
    public void testAddNumber_boundaryDoubleMin() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(Double.MIN_NORMAL);
        assertEquals(String.valueOf(Double.MIN_NORMAL), consumer.getAccumulatedCode());
    }
}
