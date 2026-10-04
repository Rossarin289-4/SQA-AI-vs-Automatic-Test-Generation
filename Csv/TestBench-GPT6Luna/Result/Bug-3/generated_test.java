package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class LexerTest {
    @Test
    public void testReadEscapeNewline() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("n")));
        assertEquals('\n', lexer.readEscape());
    }

    @Test
    public void testReadEscapeCarriageReturnMnemonic() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("r")));
        assertEquals('\r', lexer.readEscape());
    }

    @Test
    public void testReadEscapeTabMnemonic() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("t")));
        assertEquals('\t', lexer.readEscape());
    }

    @Test
    public void testReadEscapeBackspaceMnemonic() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("b")));
        assertEquals('\b', lexer.readEscape());
    }

    @Test
    public void testReadEscapeFormFeedMnemonic() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("f")));
        assertEquals('\f', lexer.readEscape());
    }

    @Test
    public void testReadEscapeLiteralControlCharacter() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("\t")));
        assertEquals('\t', lexer.readEscape());
    }

    @Test
    public void testReadEscapeDelimiter() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder(',').build(),
                new ExtendedBufferedReader(new java.io.StringReader(",")));
        assertEquals(',', lexer.readEscape());
    }

    @Test
    public void testReadEscapeUnknownCharacter() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("x")));
        assertEquals(-1, lexer.readEscape());
    }

    @Test
    public void testReadEscapeAtEndThrows() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        try {
            lexer.readEscape();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(IOException.class, expected.getClass());
        }
    }

    @Test
    public void testTrimTrailingWhitespace() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        StringBuilder buffer = new StringBuilder("value \t");
        lexer.trimTrailingSpaces(buffer);
        assertEquals("value", buffer.toString());
    }

    @Test
    public void testTrimWhitespaceOnly() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        StringBuilder buffer = new StringBuilder(" \t");
        lexer.trimTrailingSpaces(buffer);
        assertEquals("", buffer.toString());
    }

    @Test
    public void testTrimPreservesNonWhitespaceEnding() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        StringBuilder buffer = new StringBuilder(" value");
        lexer.trimTrailingSpaces(buffer);
        assertEquals(" value", buffer.toString());
    }

    @Test
    public void testReadEndOfLineForLineFeed() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertTrue(lexer.readEndOfLine('\n'));
    }

    @Test
    public void testReadEndOfLineForCarriageReturn() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertTrue(lexer.readEndOfLine('\r'));
    }

    @Test
    public void testReadEndOfLineConsumesCrLfPair() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("\n")));
        assertTrue(lexer.readEndOfLine('\r'));
        assertEquals(-1, lexer.in.read());
    }

    @Test
    public void testReadEndOfLineRejectsOrdinaryCharacter() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertFalse(lexer.readEndOfLine('x'));
    }

    @Test
    public void testWhitespaceExcludesDelimiter() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder(',').build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertFalse(lexer.isWhitespace(','));
    }

    @Test
    public void testWhitespaceAcceptsSpace() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder(',').build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertTrue(lexer.isWhitespace(' '));
    }

    @Test
    public void testStartOfLineRecognizesUndefined() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertTrue(lexer.isStartOfLine(-2));
    }

    @Test
    public void testStartOfLineRejectsOrdinaryCharacter() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertFalse(lexer.isStartOfLine('a'));
    }

    @Test
    public void testEndOfFileRecognition() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertTrue(lexer.isEndOfFile(-1));
        assertFalse(lexer.isEndOfFile(0));
    }

    @Test
    public void testDelimiterRecognition() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder(';').build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertTrue(lexer.isDelimiter(';'));
        assertFalse(lexer.isDelimiter(','));
    }

    @Test
    public void testDisabledEscapeDoesNotMatchCharacter() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertFalse(lexer.isEscape('\\'));
    }

    @Test
    public void testLineNumberInitiallyZero() throws Exception {
        Lexer lexer = new CSVLexer(CSVFormat.newBuilder().build(),
                new ExtendedBufferedReader(new java.io.StringReader("")));
        assertEquals(0L, lexer.getLineNumber());
    }
}
