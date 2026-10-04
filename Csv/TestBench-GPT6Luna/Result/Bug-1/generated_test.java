package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ExtendedBufferedReaderTest {
    @Test
    public void testReadStartsWithUndefined() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("a"));
        assertEquals(-2, reader.readAgain());
    }

    @Test
    public void testReadOrdinaryCharacter() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("A"));
        assertEquals((int) 'A', reader.read());
        assertEquals((int) 'A', reader.readAgain());
    }

    @Test
    public void testReadAtEndOfStream() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader(""));
        assertEquals(-1, reader.read());
        assertEquals(-1, reader.readAgain());
    }

    @Test
    public void testReadCountsLineFeed() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("\n"));
        assertEquals((int) '\n', reader.read());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadCountsCarriageReturn() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("\r"));
        assertEquals((int) '\r', reader.read());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadCarriageReturnLineFeedCountsOneLine() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("\r\n"));
        assertEquals((int) '\r', reader.read());
        assertEquals((int) '\n', reader.read());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadTwoLineFeedsCountsTwoLines() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("\n\n"));
        assertEquals((int) '\n', reader.read());
        assertEquals((int) '\n', reader.read());
        assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void testReadLineReturnsTextAndCountsTerminator() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("abc\n"));
        assertEquals("abc", reader.readLine());
        assertEquals((int) 'c', reader.readAgain());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadLineEmptyLineCounts() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("\n"));
        assertEquals("", reader.readLine());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadLineAtEofSetsEndOfStream() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader(""));
        assertEquals(null, reader.readLine());
        assertEquals(-1, reader.readAgain());
        assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void testReadLineUnterminatedText() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("xy"));
        assertEquals("xy", reader.readLine());
        assertEquals((int) 'y', reader.readAgain());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadLineWithCarriageReturnTerminator() throws Exception {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new java.io.StringReader("x\r"));
        assertEquals("x", reader.readLine());
        assertEquals((int) 'x', reader.readAgain());
        assertEquals(1, reader.getLineNumber());
    }
}
