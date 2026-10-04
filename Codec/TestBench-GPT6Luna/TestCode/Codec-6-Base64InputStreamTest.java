package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Base64InputStreamTest {
    @Test
    public void testDefaultDecodeSingleByte() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("TWE=".getBytes("US-ASCII")));
        assertEquals('M', stream.read());
    }

    @Test
    public void testDefaultDecodeRemainingBytesAndEof() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("TWE=".getBytes("US-ASCII")));
        assertEquals('M', stream.read());
        assertEquals('a', stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    public void testDecodeUnsignedByteValue() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(" /w==".substring(1).getBytes("US-ASCII")));
        assertEquals(255, stream.read());
    }

    @Test
    public void testDecodeMultipleReads() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("QUJD".getBytes("US-ASCII")));
        assertEquals('A', stream.read());
        assertEquals('B', stream.read());
        assertEquals('C', stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    public void testEncodeModeSingleByteReads() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("Man".getBytes("US-ASCII")), true);
        assertEquals('T', stream.read());
        assertEquals('W', stream.read());
        assertEquals('E', stream.read());
        assertEquals('F', stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    public void testEncodeLineLengthRoundsDownToMultipleOfFour() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("Man".getBytes("US-ASCII")),
                true, 5, new byte[] {'\n'});
        assertEquals('T', stream.read());
        assertEquals('W', stream.read());
        assertEquals('E', stream.read());
        assertEquals('F', stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    public void testEncodeNonPositiveLineLength() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("Man".getBytes("US-ASCII")),
                true, 0, new byte[] {'\n'});
        assertEquals('T', stream.read());
        assertEquals('W', stream.read());
        assertEquals('E', stream.read());
        assertEquals('F', stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    public void testEmptyInputReturnsEof() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, stream.read());
    }

    @Test
    public void testReadZeroLengthReturnsZero() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("TQ==".getBytes("US-ASCII")));
        assertEquals(0, stream.read(new byte[1], 0, 0));
    }

    @Test
    public void testReadIntoExactLengthBuffer() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("TWE=".getBytes("US-ASCII")));
        byte[] out = new byte[2];
        assertEquals(2, stream.read(out, 0, 2));
        assertArrayEquals(new byte[] {'M', 'a'}, out);
    }

    @Test
    public void testReadWithOffsetPreservesLeadingByte() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream("TQ==".getBytes("US-ASCII")));
        byte[] out = new byte[] {9, 9, 9};
        assertEquals(1, stream.read(out, 1, 1));
        assertArrayEquals(new byte[] {9, 'M', 9}, out);
    }

    @Test
    public void testReadAtEndOffsetWithZeroLength() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, stream.read(new byte[1], 1, 0));
    }

    @Test
    public void testReadRejectsNullBuffer() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        try {
            stream.read(null, 0, 0);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testReadRejectsNegativeOffset() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        try {
            stream.read(new byte[1], -1, 1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testReadRejectsNegativeLength() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        try {
            stream.read(new byte[1], 0, -1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testReadRejectsPastBufferEnd() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        try {
            stream.read(new byte[1], 1, 1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testReadRejectsOffsetBeyondBufferEvenWithZeroLength() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        try {
            stream.read(new byte[1], 2, 0);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testMarkIsUnsupported() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertFalse(stream.markSupported());
    }
}
