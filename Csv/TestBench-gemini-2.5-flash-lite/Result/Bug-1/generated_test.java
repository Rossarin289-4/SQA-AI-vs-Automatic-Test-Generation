package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ExtendedBufferedReaderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testRead_EmptyReader() throws Exception {
        Reader r = new StringReader("");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
    }

    @Test
    public void testRead_SingleChar() throws Exception {
        Reader r = new StringReader("a");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('a', br.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
    }

    @Test
    public void testRead_MultipleChars() throws Exception {
        Reader r = new StringReader("abc");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('a', br.read());
        assertEquals('b', br.read());
        assertEquals('c', br.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
    }

    @Test
    public void testRead_CarriageReturn() throws Exception {
        Reader r = new StringReader("\r");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('\r', br.read());
        assertEquals(1, br.getLineNumber());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
    }

    @Test
    public void testRead_LineFeed() throws Exception {
        Reader r = new StringReader("\n");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('\n', br.read());
        assertEquals(1, br.getLineNumber());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
    }

    @Test
    public void testRead_CarriageReturnLineFeed() throws Exception {
        Reader r = new StringReader("\r\n");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('\r', br.read());
        assertEquals(1, br.getLineNumber()); // CR increments line counter
        assertEquals('\n', br.read());
        assertEquals(1, br.getLineNumber()); // LF after CR does not increment
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
    }

    @Test
    public void testRead_LineFeedCarriageReturn() throws Exception {
        Reader r = new StringReader("\n\r");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('\n', br.read());
        assertEquals(1, br.getLineNumber()); // LF increments line counter
        assertEquals('\r', br.read());
        assertEquals(2, br.getLineNumber()); // CR increments line counter
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
    }

    @Test
    public void testRead_MixedNewlines() throws Exception {
        Reader r = new StringReader("line1\nline2\rline3\r\nline4");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('l', br.read());
        assertEquals('i', br.read());
        assertEquals('n', br.read());
        assertEquals('e', br.read());
        assertEquals('1', br.read());
        assertEquals('\n', br.read());
        assertEquals(1, br.getLineNumber());
        assertEquals('l', br.read());
        assertEquals('i', br.read());
        assertEquals('n', br.read());
        assertEquals('e', br.read());
        assertEquals('2', br.read());
        assertEquals('\r', br.read());
        assertEquals(2, br.getLineNumber());
        assertEquals('l', br.read());
        assertEquals('i', br.read());
        assertEquals('n', br.read());
        assertEquals('e', br.read());
        assertEquals('3', br.read());
        assertEquals('\r', br.read());
        assertEquals(3, br.getLineNumber());
        assertEquals('\n', br.read());
        assertEquals(3, br.getLineNumber());
        assertEquals('l', br.read());
        assertEquals('i', br.read());
        assertEquals('n', br.read());
        assertEquals('e', br.read());
        assertEquals('4', br.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
    }

    @Test
    public void testReadAgain_Undefined() throws Exception {
        Reader r = new StringReader("");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals(ExtendedBufferedReader.UNDEFINED, br.readAgain());
    }

    @Test
    public void testReadAgain_AfterRead() throws Exception {
        Reader r = new StringReader("a");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        br.read(); // reads 'a'
        assertEquals('a', br.readAgain());
    }

    @Test
    public void testReadAgain_AfterEndOfStream() throws Exception {
        Reader r = new StringReader("");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        br.read(); // reads END_OF_STREAM
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.readAgain());
    }

    @Test
    public void testRead_Array_Empty() throws Exception {
        Reader r = new StringReader("");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        char[] buf = new char[10];
        assertEquals(-1, br.read(buf, 0, 10));
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.readAgain());
    }

    @Test
    public void testRead_Array_Partial() throws Exception {
        Reader r = new StringReader("abc");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        char[] buf = new char[5];
        assertEquals(3, br.read(buf, 0, 5));
        assertEquals('c', br.readAgain());
        assertArrayEquals(new char[]{'a', 'b', 'c', '\u0000', '\u0000'}, buf);
    }

    @Test
    public void testRead_Array_Full() throws Exception {
        Reader r = new StringReader("abc");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        char[] buf = new char[3];
        assertEquals(3, br.read(buf, 0, 3));
        assertEquals('c', br.readAgain());
        assertArrayEquals(new char[]{'a', 'b', 'c'}, buf);
    }

    @Test
    public void testRead_Array_ZeroLength() throws Exception {
        Reader r = new StringReader("abc");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        char[] buf = new char[3];
        assertEquals(0, br.read(buf, 0, 0));
        assertEquals(ExtendedBufferedReader.UNDEFINED, br.readAgain());
    }

    @Test
    public void testRead_Array_WithNewline() throws Exception {
        Reader r = new StringReader("a\nb");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        char[] buf = new char[3];
        assertEquals(3, br.read(buf, 0, 3));
        assertEquals(1, br.getLineNumber());
        assertEquals('b', br.readAgain());
        assertArrayEquals(new char[]{'a', '\n', 'b'}, buf);
    }

    @Test
    public void testRead_Array_WithCRLF() throws Exception {
        Reader r = new StringReader("a\r\nb");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        char[] buf = new char[4];
        assertEquals(4, br.read(buf, 0, 4));
        assertEquals(1, br.getLineNumber()); // CR increments, LF does not
        assertEquals('b', br.readAgain());
        assertArrayEquals(new char[]{'a', '\r', '\n', 'b'}, buf);
    }

    @Test
    public void testReadLine_EmptyReader() throws Exception {
        Reader r = new StringReader("");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertNull(br.readLine());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.readAgain());
    }

    @Test
    public void testReadLine_SingleLine() throws Exception {
        Reader r = new StringReader("hello");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals("hello", br.readLine());
        assertEquals('o', br.readAgain());
        assertEquals(1, br.getLineNumber());
        assertNull(br.readLine());
    }

    @Test
    public void testReadLine_MultipleLinesLF() throws Exception {
        Reader r = new StringReader("line1\nline2");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals("line1", br.readLine());
        assertEquals('2', br.readAgain());
        assertEquals(1, br.getLineNumber());
        assertEquals("line2", br.readLine());
        assertEquals(2, br.getLineNumber());
        assertNull(br.readLine());
    }

    @Test
    public void testReadLine_MultipleLinesCR() throws Exception {
        Reader r = new StringReader("line1\rline2");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals("line1", br.readLine());
        assertEquals('2', br.readAgain());
        assertEquals(1, br.getLineNumber());
        assertEquals("line2", br.readLine());
        assertEquals(2, br.getLineNumber());
        assertNull(br.readLine());
    }

    @Test
    public void testReadLine_MultipleLinesCRLF() throws Exception {
        Reader r = new StringReader("line1\r\nline2");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals("line1", br.readLine());
        assertEquals('2', br.readAgain());
        assertEquals(1, br.getLineNumber());
        assertEquals("line2", br.readLine());
        assertEquals(2, br.getLineNumber());
        assertNull(br.readLine());
    }

    @Test
    public void testReadLine_EmptyLines() throws Exception {
        Reader r = new StringReader("\n\r\n");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals("", br.readLine());
        assertEquals(1, br.getLineNumber());
        assertEquals("", br.readLine());
        assertEquals(2, br.getLineNumber());
        assertNull(br.readLine());
    }

    @Test
    public void testLookAhead_EmptyReader() throws Exception {
        Reader r = new StringReader("");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.lookAhead());
        assertEquals(ExtendedBufferedReader.UNDEFINED, br.readAgain());
    }

    @Test
    public void testLookAhead_SingleChar() throws Exception {
        Reader r = new StringReader("a");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('a', br.lookAhead());
        assertEquals(ExtendedBufferedReader.UNDEFINED, br.readAgain()); // peek does not consume
        assertEquals('a', br.read()); // now consume
        assertEquals('a', br.readAgain());
    }

    @Test
    public void testLookAhead_AfterRead() throws Exception {
        Reader r = new StringReader("ab");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        br.read(); // reads 'a'
        assertEquals('b', br.lookAhead());
        assertEquals('a', br.readAgain()); // lastChar is still 'a'
        assertEquals('b', br.read()); // consume 'b'
        assertEquals('b', br.readAgain());
    }

    @Test
    public void testLookAhead_MultipleTimes() throws Exception {
        Reader r = new StringReader("abc");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals('a', br.lookAhead());
        assertEquals('a', br.lookAhead());
        assertEquals('a', br.read());
        assertEquals('b', br.lookAhead());
        assertEquals('b', br.read());
        assertEquals('c', br.lookAhead());
        assertEquals('c', br.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.lookAhead());
    }

    @Test
    public void testGetLineNumber_Initial() throws Exception {
        Reader r = new StringReader("abc");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        assertEquals(0, br.getLineNumber());
    }

    @Test
    public void testGetLineNumber_AfterRead() throws Exception {
        Reader r = new StringReader("a\nb");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        br.read(); // 'a'
        assertEquals(0, br.getLineNumber());
        br.read(); // '\n'
        assertEquals(1, br.getLineNumber());
        br.read(); // 'b'
        assertEquals(1, br.getLineNumber());
    }

    @Test
    public void testGetLineNumber_AfterReadLine() throws Exception {
        Reader r = new StringReader("line1\nline2");
        ExtendedBufferedReader br = new ExtendedBufferedReader(r);
        br.readLine(); // "line1"
        assertEquals(1, br.getLineNumber());
        br.readLine(); // "line2"
        assertEquals(2, br.getLineNumber());
    }
}
