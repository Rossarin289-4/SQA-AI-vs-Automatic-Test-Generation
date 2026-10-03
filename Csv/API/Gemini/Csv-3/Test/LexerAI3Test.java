package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class LexerAI3Test {

    private static class ConcreteLexer extends Lexer {
        ConcreteLexer(CSVFormat format, ExtendedBufferedReader in) {
            super(format, in);
        }

        @Override
        Token nextToken(Token reusableToken) throws IOException {
            return null;
        }
    }

    @Test
    public void testReadEscape() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("n"));
        Lexer lexer = new ConcreteLexer(format, reader);

        assertEquals('\n', lexer.readEscape());
    }

    @Test
    public void testTrimTrailingSpaces() {
        CSVFormat format = CSVFormat.DEFAULT;
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(""));
        Lexer lexer = new ConcreteLexer(format, reader);

        StringBuilder sb = new StringBuilder("abc   ");
        lexer.trimTrailingSpaces(sb);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testIsWhitespace() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(""));
        Lexer lexer = new ConcreteLexer(format, reader);

        assertTrue(lexer.isWhitespace(' '));
        assertFalse(lexer.isWhitespace(','));
    }
}
