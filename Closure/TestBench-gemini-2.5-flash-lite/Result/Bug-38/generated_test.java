package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;

public class CodeConsumerTest {

    // Dummy implementation of CodeConsumer for testing purposes.
    // Uses a StringBuilder to capture output.
    private static class TestCodeConsumer extends CodeConsumer {
        StringBuilder buffer = new StringBuilder();

        @Override
        char getLastChar() {
            if (buffer.length() == 0) {
                return '\0'; // Null character as a default
            }
            return buffer.charAt(buffer.length() - 1);
        }

        @Override
        void append(String str) {
            buffer.append(str);
        }

        @Override
        void startNewLine() {
            buffer.append("\n");
        }

        @Override
        void maybeCutLine() {
            // No-op for testing purposes
        }

        @Override
        void endLine() {
            // No-op for testing purposes
        }

        @Override
        void notePreferredLineBreak() {
            // No-op for testing purposes
        }

        @Override
        void appendOp(String op, boolean binOp) {
            append(op);
        }

        @Override
        boolean shouldPreserveExtraBlocks() {
            return false; // Default to false as per typical code generation behavior
        }

        @Override
        boolean breakAfterBlockFor(Node n, boolean statementContext) {
            // Default behavior based on `statementContext` from parent class if not overridden
            return statementContext;
        }

        // Provide concrete implementations for abstract or required methods
        @Override
        void add(String newcode) {
            maybeEndStatement();

            if (newcode.length() == 0) {
                return;
            }

            char c = newcode.charAt(0);
            if ((isWordChar(c) || c == '\\') &&
                isWordChar(getLastChar())) {
                // need space to separate. This is not pretty printing.
                // For example: "return foo;"
                append(" ");
            } else if (c == '/' && getLastChar() == '/') {
                // Do not allow a forward slash to appear after a DIV.
                // For example,
                // REGEXP DIV REGEXP
                // is valid and should print like
                // / // / /
                append(" ");
            }

            append(newcode);
        }
    }

    @Test
    public void testAddIdentifierAppendsCorrectly() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addIdentifier("test");
        assertEquals("test", consumer.buffer.toString());
    }

    @Test
    public void testAddIdentifierWithSpaceNeeded() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("abc");
        consumer.addIdentifier("def");
        assertEquals("abc def", consumer.buffer.toString());
    }

    @Test
    public void testAddIdentifierWithNoSpaceNeeded() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("abc");
        consumer.addIdentifier("123");
        assertEquals("abc123", consumer.buffer.toString());
    }

    @Test
    public void testAddIdentifierWithForwardSlash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("a/");
        consumer.addIdentifier("/b");
        assertEquals("a/ /b", consumer.buffer.toString());
    }

    @Test
    public void testAppendBlockStart() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.appendBlockStart();
        assertEquals("{", consumer.buffer.toString());
    }

    @Test
    public void testAppendBlockEnd() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.appendBlockEnd();
        assertEquals("}", consumer.buffer.toString());
    }

    @Test
    public void testBeginBlockAddsSemicolonIfNecessary() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementNeedsEnded = true;
        consumer.beginBlock();
        assertEquals(";{", consumer.buffer.toString()); // No line break after ';' in beginBlock
    }

    @Test
    public void testBeginBlockWithoutSemicolon() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementNeedsEnded = false;
        consumer.beginBlock();
        assertEquals("{", consumer.buffer.toString());
    }

    @Test
    public void testEndBlockAddsLineBreakIfRequested() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endBlock(true);
        assertEquals("}\n", consumer.buffer.toString());
    }

    @Test
    public void testEndBlockWithoutLineBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endBlock(false);
        assertEquals("}", consumer.buffer.toString());
    }

    @Test
    public void testListSeparatorAddsCommaAndLineBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.listSeparator();
        assertEquals(",\n", consumer.buffer.toString());
    }

    @Test
    public void testEndStatementAddsSemicolonAndLineBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endStatement(true);
        assertEquals(";\n", consumer.buffer.toString());
    }

    @Test
    public void testEndStatementWithoutSemicolonButStarted() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementStarted = true;
        consumer.endStatement(false);
        assertEquals("", consumer.buffer.toString());
        assertTrue(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndStatementWithoutSemicolonAndNotStarted() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementStarted = false;
        consumer.endStatement(false);
        assertEquals("", consumer.buffer.toString());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testMaybeEndStatementAddsSemicolonIfNecessary() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementNeedsEnded = true;
        consumer.maybeEndStatement();
        assertEquals(";\n", consumer.buffer.toString()); // Adds ';', maybeLineBreak, endLine()
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testMaybeEndStatementDoesNothingIfNotNeeded() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.statementNeedsEnded = false;
        consumer.maybeEndStatement();
        assertEquals("", consumer.buffer.toString());
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testEndFunctionSetsFlag() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endFunction();
        assertTrue(consumer.sawFunction);
        assertEquals("", consumer.buffer.toString());
    }

    @Test
    public void testEndFunctionWithStatementContextAddsLineBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.endFunction(true);
        assertTrue(consumer.sawFunction);
        assertEquals("\n", consumer.buffer.toString()); // endLine() is called
    }

    @Test
    public void testBeginCaseBodyAddsColon() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.beginCaseBody();
        assertEquals(":", consumer.buffer.toString());
    }

    @Test
    public void testAddWithEmptyStringDoesNothing() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("existing");
        consumer.add("");
        assertEquals("existing", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesNegativeZero() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(0.0);
        assertEquals("0.0", consumer.buffer.toString());
        consumer.buffer.setLength(0); // Clear buffer
        consumer.addNumber(-0.0);
        assertEquals("0.0", consumer.buffer.toString()); // String.valueOf(-0.0) is "0.0"
    }

    @Test
    public void testAddNumberHandlesLargeIntegersWithoutExponent() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(123.0);
        assertEquals("123", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesLargeIntegersWithExponent() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(1234567890123.0);
        assertEquals("1234567890123", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesFloatingPoint() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(1.5);
        assertEquals("1.5", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesScientificNotation() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(1.23e5);
        assertEquals("123000", consumer.buffer.toString()); // (long)x == x, exp > 2 not met, prints Long.toString(value)
    }

    @Test
    public void testAddNumberHandlesNegativeValueWhenPreviousCharIsMinus() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("-");
        consumer.addNumber(-5.0);
        assertEquals("- -5", consumer.buffer.toString()); // Adds space before "-5"
    }

    @Test
    public void testAddOpHandlesPlusPlusCase() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("+");
        consumer.addOp("+", true);
        assertEquals("+ +", consumer.buffer.toString());
    }

    @Test
    public void testAddOpHandlesMinusMinusCase() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("-");
        consumer.addOp("-", true);
        assertEquals("- -", consumer.buffer.toString());
    }

    @Test
    public void testAddOpHandlesArrowCase() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("-");
        consumer.addOp(">", true);
        assertEquals("- >", consumer.buffer.toString());
    }

    @Test
    public void testAddOpHandlesWordCharAfterOp() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.buffer.setLength(0); // Reset buffer
        consumer.append("x");
        consumer.addOp("+", true); // This should not add space
        assertEquals("x+", consumer.buffer.toString());

        consumer.buffer.setLength(0); // Reset buffer
        consumer.append("keyword"); // 'w' is a word char
        consumer.addOp("instanceof", true); // 'i' is a letter, 'w' is wordChar, so space is added
        assertEquals("keyword instanceof", consumer.buffer.toString());
    }

    @Test
    public void testAddOpWithSpaceAfter() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("+");
        consumer.addOp("+", true); // This adds a space.
        assertEquals("+ +", consumer.buffer.toString());
    }

    @Test
    public void testAppendAddsSpaceWhenCurrentIsWordCharAndNewIsWordChar() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("abc");
        consumer.add("def");
        assertEquals("abc def", consumer.buffer.toString());
    }

    @Test
    public void testAppendDoesNotAddSpaceWhenCurrentIsWordCharAndNewIsNotWordChar() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("abc");
        consumer.add("123");
        assertEquals("abc123", consumer.buffer.toString());
    }

    @Test
    public void testAppendAddsSpaceWhenCurrentIsSlashAndNewIsSlash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("//");
        consumer.add("/something");
        assertEquals("// /something", consumer.buffer.toString());
    }

    @Test
    public void testAppendDoesNotAddSpaceWhenCurrentIsNotWordCharAndNewIsWordChar() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("123");
        consumer.add("abc");
        assertEquals("123abc", consumer.buffer.toString());
    }

    @Test
    public void testAppendDoesNotAddSpaceWhenCurrentIsSlashAndNewIsNotSlash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("/");
        consumer.add("abc");
        assertEquals("/abc", consumer.buffer.toString());
    }

    @Test
    public void testAppendDoesNotAddSpaceWhenCurrentIsForwardSlashAndNewIsBackslash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("/");
        consumer.add("\\abc");
        assertEquals("/\\abc", consumer.buffer.toString());
    }

    @Test
    public void testAppendDoesNotAddSpaceWhenCurrentIsWordCharAndNewIsBackslash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("abc");
        consumer.add("\\def");
        assertEquals("abc\\def", consumer.buffer.toString());
    }

    @Test
    public void testAppendDoesNotAddSpaceWhenCurrentIsBackslashAndNewIsWordChar() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("\\");
        consumer.add("abc");
        assertEquals("\\abc", consumer.buffer.toString());
    }

    @Test
    public void testAppendDoesNotAddSpaceWhenCurrentIsBackslashAndNewIsBackslash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.append("\\");
        consumer.add("\\abc");
        assertEquals("\\\\abc", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesVerySmallPositiveNumber() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(1e-10);
        assertEquals("1.0E-10", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesVerySmallNegativeNumber() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(-1e-10);
        assertEquals("-1.0E-10", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesZero() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(0.0);
        assertEquals("0.0", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesPositiveInteger() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(12345);
        assertEquals("12345", consumer.buffer.toString());
    }

    @Test
    public void testAddNumberHandlesNegativeInteger() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        consumer.addNumber(-67890);
        assertEquals("-67890", consumer.buffer.toString());
    }
}
