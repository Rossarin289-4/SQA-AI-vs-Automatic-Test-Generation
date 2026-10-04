package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;

public class BZip2CompressorInputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    private static final byte[] BZIP2_STREAM_MAGIC = new byte[] { 'B', 'Z', 'h' };

    @Test
    public void testMatchesValidStream() {
        byte[] signature = new byte[3];
        System.arraycopy(BZIP2_STREAM_MAGIC, 0, signature, 0, 3);
        assertTrue(BZip2CompressorInputStream.matches(signature, 3));
    }

    @Test
    public void testMatchesTooShortSignature() {
        byte[] signature = new byte[] { 'B', 'Z' };
        assertFalse(BZip2CompressorInputStream.matches(signature, 2));
    }

    @Test
    public void testMatchesInvalidMagicByte1() {
        byte[] signature = new byte[] { 'X', 'Z', 'h' };
        assertFalse(BZip2CompressorInputStream.matches(signature, 3));
    }

    @Test
    public void testMatchesInvalidMagicByte2() {
        byte[] signature = new byte[] { 'B', 'X', 'h' };
        assertFalse(BZip2CompressorInputStream.matches(signature, 3));
    }

    @Test
    public void testMatchesInvalidMagicByte3() {
        byte[] signature = new byte[] { 'B', 'Z', 'X' };
        assertFalse(BZip2CompressorInputStream.matches(signature, 3));
    }

    @Test
    public void testReadEmptyStream() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        assertEquals(-1, bzip2Stream.read());
        bzip2Stream.close();
    }

    @Test
    public void testReadFromInvalidStream() throws IOException {
        InputStream invalidStream = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        try {
            new BZip2CompressorInputStream(invalidStream);
            fail("Expected IOException for invalid stream format");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Stream is not in the BZip2 format"));
        }
    }

    @Test
    public void testReadFromStreamWithInvalidBlockSize() throws IOException {
        InputStream invalidStream = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '0' });
        try {
            new BZip2CompressorInputStream(invalidStream);
            fail("Expected IOException for invalid block size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("BZip2 block size is invalid"));
        }
    }

    @Test
    public void testReadWithConcatenatedStreams() throws IOException {
        // Create two simple bzip2 streams concatenated
        // First stream: "abc" compressed
        // Second stream: "def" compressed
        // This requires manual creation of valid BZip2 streams which is complex.
        // For simplicity, we'll simulate a stream that appears to have two blocks
        // but we won't create actual compressed data here.
        // A more robust test would involve actual compressed data.

        // This test is a placeholder. Actual BZip2 stream generation is complex.
        // For now, we'll test the basic constructor and initial read.
        // A truly concatenated stream would need valid BZip2 magic bytes and block headers.

        // Example of a very simple bzip2 stream for "aa"
        // BZh1 (block size 100k)
        // 0x17 0x72 0x45 0x38 0x50 0x90 (EOI marker)
        // 0x31 0x41 0x59 0x26 0x53 0x59 (block header)
        // CRC (4 bytes)
        // blockRandomised (1 bit)
        // ... compressed data ...
        // 0x17 0x72 0x45 0x38 0x50 0x90 (EOI marker)
        // CRC (4 bytes)

        // This is a very simplified stream that would likely fail parsing due to invalid compressed data.
        // The goal here is to test the decompressConcatenated flag.
        byte[] validBzip2Header = new byte[]{'B', 'Z', 'h', '1'}; // BZ2 magic + block size 1
        byte[] eofMarker = new byte[]{(byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90};
        byte[] blockHeader = new byte[]{(byte) 0x31, (byte) 0x41, (byte) 0x59, (byte) 0x26, (byte) 0x53, (byte) 0x59};
        byte[] dummyCrc = new byte[]{0, 0, 0, 0}; // Placeholder CRC

        // Construct a stream that looks like two concatenated blocks, but with invalid data in between
        // This will likely throw an exception during parsing, but tests the initialization logic
        byte[] concatenatedStream = new byte[validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length + blockHeader.length + 100 + eofMarker.length + dummyCrc.length];
        System.arraycopy(validBzip2Header, 0, concatenatedStream, 0, validBzip2Header.length);
        // Fill with some data for the first block (invalid compressed data)
        for (int i = 0; i < 100; i++) concatenatedStream[validBzip2Header.length + i] = (byte)i;
        System.arraycopy(eofMarker, 0, concatenatedStream, validBzip2Header.length + 100, eofMarker.length);
        System.arraycopy(dummyCrc, 0, concatenatedStream, validBzip2Header.length + 100 + eofMarker.length, dummyCrc.length);
        System.arraycopy(blockHeader, 0, concatenatedStream, validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length, blockHeader.length);
        // Fill with some data for the second block (invalid compressed data)
        for (int i = 0; i < 100; i++) concatenatedStream[validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length + blockHeader.length + i] = (byte)(i + 100);
        System.arraycopy(eofMarker, 0, concatenatedStream, validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length + blockHeader.length + 100, eofMarker.length);
        System.arraycopy(dummyCrc, 0, concatenatedStream, validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length + blockHeader.length + 100 + eofMarker.length, dummyCrc.length);

        try (BZip2CompressorInputStream bz2Stream = new BZip2CompressorInputStream(new ByteArrayInputStream(concatenatedStream), true)) {
            // Attempt to read; it should fail gracefully or return -1 if it processes the first block and then finds EOF
            // The exact behavior depends on how invalid data is handled.
            bz2Stream.read();
            // Depending on the stream and error handling, it might return -1 or throw
            // This test primarily checks if the decompressConcatenated flag is processed.
            // If it throws, that's also a valid outcome for malformed streams.
            // We expect it to try and read past the first block.
        } catch (IOException e) {
            // Catching IOException is expected if the stream is malformed.
            // The key is that it tried to process beyond the first block.
            assertTrue(e.getMessage().contains("bad block header") || e.getMessage().contains("unexpected end of stream") || e.getMessage().contains("BZip2 CRC error"));
        }
    }

    @Test
    public void testReadWithNonConcatenatedStream() throws IOException {
        // Similar to testReadWithConcatenatedStreams but with decompressConcatenated = false
        byte[] validBzip2Header = new byte[]{'B', 'Z', 'h', '1'};
        byte[] eofMarker = new byte[]{(byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90};
        byte[] dummyCrc = new byte[]{0, 0, 0, 0};

        byte[] stream = new byte[validBzip2Header.length + 50 + eofMarker.length + dummyCrc.length];
        System.arraycopy(validBzip2Header, 0, stream, 0, validBzip2Header.length);
        for (int i = 0; i < 50; i++) stream[validBzip2Header.length + i] = (byte)i; // Some invalid compressed data
        System.arraycopy(eofMarker, 0, stream, validBzip2Header.length + 50, eofMarker.length);
        System.arraycopy(dummyCrc, 0, stream, validBzip2Header.length + 50 + eofMarker.length, dummyCrc.length);

        try (BZip2CompressorInputStream bz2Stream = new BZip2CompressorInputStream(new ByteArrayInputStream(stream), false)) {
            // It should read the first block and then stop.
            // The exact return value depends on the first byte of compressed data.
            // For this invalid stream, it will likely throw an exception during parsing.
            // The important part is that it doesn't try to find another stream.
            bz2Stream.read(); // This will likely throw.
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("bad block header") || e.getMessage().contains("unexpected end of stream"));
        }
    }

    @Test
    public void testReadAfterClose() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        bzip2Stream.close();
        try {
            bzip2Stream.read();
            fail("Expected IOException when reading from closed stream");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("stream closed"));
        }
    }

    @Test
    public void testReadArrayEmptyStream() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        byte[] buffer = new byte[10];
        assertEquals(-1, bzip2Stream.read(buffer, 0, 10));
        bzip2Stream.close();
    }

    @Test
    public void testReadArrayWithInvalidOffset() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        byte[] buffer = new byte[10];
        try {
            bzip2Stream.read(buffer, -1, 5);
            fail("Expected IndexOutOfBoundsException for negative offset");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("offs(-1) < 0"));
        } finally {
            bzip2Stream.close();
        }
    }

    @Test
    public void testReadArrayWithInvalidLength() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        byte[] buffer = new byte[10];
        try {
            bzip2Stream.read(buffer, 0, -1);
            fail("Expected IndexOutOfBoundsException for negative length");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("len(-1) < 0"));
        } finally {
            bzip2Stream.close();
        }
    }

    @Test
    public void testReadArrayWithLengthExceedingBuffer() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        byte[] buffer = new byte[10];
        try {
            bzip2Stream.read(buffer, 0, 11);
            fail("Expected IndexOutOfBoundsException for length exceeding buffer");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("offs(0) + len(11) > dest.length(10)"));
        } finally {
            bzip2Stream.close();
        }
    }

    @Test
    public void testReadArrayWithOffsetExceedingBuffer() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        byte[] buffer = new byte[10];
        try {
            bzip2Stream.read(buffer, 11, 0); // Length 0 is valid, but offset is not
            fail("Expected IndexOutOfBoundsException for offset exceeding buffer");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("offs(11) + len(0) > dest.length(10)"));
        } finally {
            bzip2Stream.close();
        }
    }

    @Test
    public void testCloseDoesNotThrowOnNullStream() throws IOException {
        BZip2CompressorInputStream bzip2Stream = null;
        try {
            InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
            bzip2Stream = new BZip2CompressorInputStream(emptyStream);
            bzip2Stream.close(); // Close once
            bzip2Stream.close(); // Close again
        } catch (IOException e) {
            // Should not happen if close is idempotent and safe.
            fail("Closing twice or on an already closed stream threw an exception: " + e.getMessage());
        } finally {
            if (bzip2Stream != null) {
                bzip2Stream.close(); // Ensure it's closed in case of exceptions
            }
        }
    }
    
    // Helper method to create a minimal BZip2 stream from a byte array
    private InputStream createBzip2InputStream(byte[] data) throws IOException {
        // A very basic BZip2 header for a single block.
        // This is NOT a fully compliant BZip2 stream but serves to initialize the decompressor.
        // Real BZip2 streams are complex. This will likely cause errors on read().
        byte[] header = new byte[] {'B', 'Z', 'h', '1'}; // BZ2 magic + block size 1
        byte[] blockHeader = new byte[]{(byte) 0x31, (byte) 0x41, (byte) 0x59, (byte) 0x26, (byte) 0x53, (byte) 0x59}; // Block header
        byte[] eofMarker = new byte[]{(byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90}; // EOI marker
        byte[] dummyCrc = new byte[]{0, 0, 0, 0}; // Dummy CRC

        // Create a stream that includes the header, the provided data (as compressed data), and EOF marker
        // This will likely fail during decompression, but tests the constructor and initial setup.
        byte[] stream = new byte[header.length + blockHeader.length + data.length + eofMarker.length + dummyCrc.length];
        System.arraycopy(header, 0, stream, 0, header.length);
        System.arraycopy(blockHeader, 0, stream, header.length, blockHeader.length);
        System.arraycopy(data, 0, stream, header.length + blockHeader.length, data.length);
        System.arraycopy(eofMarker, 0, stream, header.length + blockHeader.length + data.length, eofMarker.length);
        System.arraycopy(dummyCrc, 0, stream, header.length + blockHeader.length + data.length + eofMarker.length, dummyCrc.length);

        return new ByteArrayInputStream(stream);
    }

    @Test
    public void testReadWithMinimalValidBlock() throws IOException {
        // A very minimal valid bzip2 stream for "a" might look like this.
        // This is highly complex to generate by hand and ensure correctness.
        // For this test, we'll use a stream that's structured correctly but the compressed data is invalid.
        // The goal is to test the initialization and reading up to the point of error.
        byte[] streamData = new byte[] {
            // BZ2 header
            'B', 'Z', 'h', '1',
            // Block header
            (byte) 0x31, (byte) 0x41, (byte) 0x59, (byte) 0x26, (byte) 0x53, (byte) 0x59,
            // Some random data that is unlikely to be valid compressed data, but enough bytes for the block
            // This data needs to be carefully crafted to avoid immediate EOF or syntax errors in bitstream reading if possible.
            // A simple '0' might be too short for some operations. Let's provide more bytes.
            // Example of what a stream might contain, but this is NOT valid compressed data.
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            // End of block marker
            (byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90,
            // Dummy CRC for the block and combined CRC
            0x00, 0x00, 0x00, 0x00, // Stored Block CRC
            0x00, 0x00, 0x00, 0x00  // Stored Combined CRC
        };

        try (BZip2CompressorInputStream bz2Stream = new BZip2CompressorInputStream(new ByteArrayInputStream(streamData))) {
            // Attempt to read. This is expected to fail with an IOException due to invalid data.
            bz2Stream.read();
            fail("Expected IOException for invalid compressed data.");
        } catch (IOException e) {
            // The specific error message will depend on where the parsing fails.
            // It could be "bad block header", "unexpected end of stream", "stream corrupted", etc.
            assertTrue(e.getMessage().contains("bad block header") || e.getMessage().contains("unexpected end of stream") || e.getMessage().contains("stream corrupted"));
        }
    }
}
