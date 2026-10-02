package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.StringReader;
import java.io.IOException;

import org.junit.Test;

public class ExtendedBufferedReaderAI1Test {

    @Test
    public void testReadLineAndLineNumber() throws IOException {
        StringReader reader = new StringReader("line1\r\nline2\nline3\r");
        ExtendedBufferedReader br = new ExtendedBufferedReader(reader);

        assertEquals(0, br.getLineNumber());
        assertEquals("line1", br.readLine());
        assertEquals(1, br.getLineNumber());
        assertEquals('1', br.readAgain());

        assertEquals("line2", br.readLine());
        assertEquals(2, br.getLineNumber());

        assertEquals("line3", br.readLine());
        assertEquals(3, br.getLineNumber());

        assertNull(br.readLine());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.readAgain());
    }

    @Test
    public void testReadWithBufferAndCrLfHandling() throws IOException {
        StringReader reader = new StringReader("\r\n\n\r");
        ExtendedBufferedReader br = new ExtendedBufferedReader(reader);

        char[] buf = new char[5];
        int len = br.read(buf, 0, 5);

        assertEquals(3, len);
        assertEquals(3, br.getLineNumber());
        assertEquals('\r', br.readAgain());
    }

    @Test
    public void testLookAhead() throws IOException {
        StringReader reader = new StringReader("AB");
        ExtendedBufferedReader br = new ExtendedBufferedReader(reader);

        assertEquals('A', br.lookAhead());
        assertEquals('A', br.read());
        assertEquals('B', br.lookAhead());
        assertEquals('B', br.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.lookAhead());
    }
}
