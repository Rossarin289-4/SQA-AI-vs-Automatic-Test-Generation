package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class BaseNCodecInputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testReadSingleByteReturnsCorrectlyForEmptyInputStream() throws Exception {
        BaseNCodec base32 = new Base32(); // Using a concrete implementation for testing
        InputStream in = new ByteArrayInputStream(new byte[0]);
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false); // false for decode
        assertEquals(EOF, bin.read());
    }

    @Test
    public void testReadMultipleBytesReturnsCorrectlyForEmptyInputStream() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream(new byte[0]);
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        byte[] buffer = new byte[10];
        assertEquals(EOF, bin.read(buffer, 0, 10));
    }

    @Test
    public void testReadSingleByteAfterEOF() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        bin.read(); // Consume any available data (none in this case)
        assertEquals(EOF, bin.read());
    }

    @Test
    public void testReadMultipleBytesAfterEOF() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        byte[] buffer = new byte[10];
        bin.read(buffer, 0, 10); // Consume any available data (none in this case)
        assertEquals(EOF, bin.read(buffer, 0, 10));
    }

    @Test
    public void testReadWithZeroLength() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes()); // Base64 for "Hello"
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        byte[] buffer = new byte[10];
        assertEquals(0, bin.read(buffer, 0, 0));
    }

    @Test
    public void testReadWithNullBuffer() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        try {
            bin.read(null, 0, 10);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithNegativeOffset() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        byte[] buffer = new byte[10];
        try {
            bin.read(buffer, -1, 10);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithNegativeLength() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        byte[] buffer = new byte[10];
        try {
            bin.read(buffer, 0, -1);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithOffsetExceedingBufferLength() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        byte[] buffer = new byte[5];
        try {
            bin.read(buffer, 6, 2);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithOffsetPlusLengthExceedingBufferLength() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        byte[] buffer = new byte[10];
        try {
            bin.read(buffer, 5, 6);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testMarkSupportedReturnsFalse() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        assertFalse(bin.markSupported());
    }

    @Test
    public void testSkipZeroBytes() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        assertEquals(0, bin.skip(0));
    }

    @Test
    public void testSkipMoreBytesThanAvailable() throws Exception {
        BaseNCodec base32 = new Base32();
        // Base64 for "Hello" is "SGVsbG8=" which decodes to 5 bytes.
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        
        // The skip method reads in chunks and discards. The number of bytes actually read from the underlying stream
        // that contribute to decoding is what matters.
        // The `skip` method returns the total number of bytes *successfully read* from the stream and discarded.
        // The `read(byte[] b, int offset, int len)` method in `BaseNCodecInputStream` is designed to return the number of *decoded* bytes.
        // When skipping, we are effectively reading decoded bytes and discarding them.
        // The loop in `skip` calls `read(b, 0, len)`, which returns the number of *decoded* bytes.
        // So, `total` should accumulate the number of *decoded* bytes skipped.
        long skipped = bin.skip(10); // Request to skip 10 bytes
        // The decoded data is 5 bytes. `skip` will attempt to read up to 10 bytes, but can only read 5 decoded bytes.
        assertEquals(5, skipped); // It should return the number of decoded bytes successfully skipped.
        assertEquals(EOF, bin.read()); // After skipping all, next read should be EOF
    }
    
    @Test
    public void testSkipExactlyBytesAvailable() throws Exception {
        BaseNCodec base32 = new Base32();
        // Base64 for "Hello" is "SGVsbG8=" which decodes to 5 bytes.
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        long skipped = bin.skip(5);
        assertEquals(5, skipped); // Should skip all decoded bytes
        assertEquals(EOF, bin.read()); // After skipping all, next read should be EOF
    }

    @Test
    public void testSkipInChunks() throws Exception {
        BaseNCodec base32 = new Base32();
        // Base64 for "This is a long data to test skip" (31 bytes)
        byte[] encodedBytes = "VGhpcyBpcyBhIGxvbmcgZGF0YSB0byB0ZXN0IHNraXA=".getBytes();
        InputStream in = new ByteArrayInputStream(encodedBytes);
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        long skipped = bin.skip(15); // Skip first 15 decoded bytes
        assertEquals(15, skipped);
        
        byte[] buffer = new byte[20]; // Read remaining 16 bytes
        int bytesRead = bin.read(buffer, 0, 20);
        assertEquals(16, bytesRead);
        String remaining = new String(buffer, 0, bytesRead);
        assertEquals("ta to test skip", remaining);
    }

    @Test
    public void testSkipNegativeLength() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        try {
            bin.skip(-10);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAvailableWhenNotEOF() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes()); // Some data
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        assertEquals(1, bin.available());
    }

    @Test
    public void testAvailableWhenEOF() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream(new byte[0]); // No data
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        // The baseNCodec.eof flag is what determines available().
        // When the underlying stream is empty, the codec will immediately detect EOF.
        // So, the first call to available() should reflect this EOF.
        assertEquals(0, bin.available());
    }
    
    @Test
    public void testAvailableAfterReadingAllData() throws Exception {
        BaseNCodec base32 = new Base32();
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes()); // Some data
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base32, false);
        
        byte[] buffer = new byte[10];
        bin.read(buffer, 0, 10); // Read all decoded data
        
        // After reading all data, the codec's eof flag should be set.
        assertEquals(0, bin.available());
    }

    @Test
    public void testReadSingleByteConvertsCorrectly() throws Exception {
        BaseNCodec base64 = new Base64(); // Using Base64 for variety
        // Base64 for "A" is "QQ=="
        InputStream in = new ByteArrayInputStream("QQ==".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base64, false);
        // The decoded byte for 'Q' (ASCII 81) should be correctly returned as an integer.
        // 'Q' is part of "QQ==", which decodes to byte 65 (ASCII for 'A').
        // In Base64, QQ== decodes to a single byte: 0x41
        assertEquals(65, bin.read());
    }

    @Test
    public void testReadMultipleBytesReadsDecodedData() throws Exception {
        BaseNCodec base64 = new Base64();
        // Base64 for "Test" is "VGVzdA=="
        InputStream in = new ByteArrayInputStream("VGVzdA==".getBytes());
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base64, false);
        byte[] buffer = new byte[10];
        int bytesRead = bin.read(buffer, 0, 10);
        assertEquals(4, bytesRead);
        assertArrayEquals("Test".getBytes(), Arrays.copyOf(buffer, bytesRead));
    }

    @Test
    public void testReadWithUnderlyingStreamReturningZero() throws Exception {
        // This test aims to verify the `while (readLen == 0)` loop in `read(byte[] b, int offset, int len)`.
        // This loop is intended to handle cases where `baseNCodec.readResults()` returns 0,
        // meaning data was consumed but no output was produced yet.
        // The underlying `in.read(buf)` might return 0 bytes.
        // A simple way to simulate this without full mocking is to have the underlying stream
        // provide data that `decode` processes but doesn't immediately yield output,
        // or to ensure that `in.read()` eventually provides data.
        
        // Let's use a scenario where the baseNCodec needs to accumulate data before producing output.
        // For Base64, a single character might not be enough to produce output.
        // Consider decoding "A" which is "QQ==". "Q" alone doesn't decode.
        // If the underlying stream provides "Q" and then "Q", `readResults` might return 0 initially.
        
        BaseNCodec base64 = new Base64();
        // "Zm9vYg==" decodes to "foob"
        byte[] encodedData = "Zm9vYg==".getBytes();
        InputStream in = new ByteArrayInputStream(encodedData);
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base64, false);
        
        byte[] buffer = new byte[10];
        // The first `read` call will try to decode "Zm9vYg==".
        // The `decode` method within `BaseNCodec` might buffer.
        // If `readResults` returns 0, the `while(readLen == 0)` loop will re-evaluate `!baseNCodec.hasData()`
        // and call `in.read(buf)` again. This should continue until enough data is decoded or EOF.
        
        int result = bin.read(buffer, 0, 10);
        assertEquals(4, result); // "foob" is 4 bytes
        assertArrayEquals("foob".getBytes(), Arrays.copyOf(buffer, result));
    }
    
    @Test
    public void testEncodingInputStream() throws Exception {
        BaseNCodec base64 = new Base64();
        byte[] dataToEncode = "This is a test.".getBytes();
        InputStream in = new ByteArrayInputStream(dataToEncode);
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base64, true); // true for encode
        
        // Use the Base64 encoder directly to get the expected encoded output.
        byte[] encodedData = new Base64().encode(dataToEncode);
        
        byte[] buffer = new byte[encodedData.length + 10]; // Ensure buffer is large enough
        int bytesRead = bin.read(buffer, 0, buffer.length);
        assertEquals(encodedData.length, bytesRead);
        assertArrayEquals(encodedData, Arrays.copyOf(buffer, bytesRead));
    }
    
    @Test
    public void testEncodingInputStreamReadSingleByte() throws Exception {
        BaseNCodec base64 = new Base64();
        byte[] dataToEncode = "A".getBytes(); // Base64 for "A" is "QQ=="
        InputStream in = new ByteArrayInputStream(dataToEncode);
        BaseNCodecInputStream bin = new BaseNCodecInputStream(in, base64, true); // true for encode
        
        assertEquals((byte)'Q', (byte)bin.read());
        assertEquals((byte)'Q', (byte)bin.read());
        assertEquals((byte)'=', (byte)bin.read());
        assertEquals((byte)'=', (byte)bin.read());
        assertEquals(EOF, bin.read());
    }

    @Test
    public void testConstructorWithNullInputStream() throws Exception {
        BaseNCodec base32 = new Base32();
        try {
            new BaseNCodecInputStream(null, base32, false);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorWithNullCodec() throws Exception {
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        try {
            new BaseNCodecInputStream(in, null, false);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }
    
    // Helper to get EOF value from BaseNCodec
    private static final int EOF = BaseNCodec.EOF;
}
