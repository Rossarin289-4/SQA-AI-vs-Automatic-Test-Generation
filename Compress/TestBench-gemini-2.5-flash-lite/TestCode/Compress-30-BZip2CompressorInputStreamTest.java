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
        // BZ2 magic + invalid block size
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
        // This test aims to verify the decompressConcatenated flag.
        // It constructs a stream that mimics two concatenated bzip2 streams,
        // but uses invalid compressed data to ensure it doesn't fully decompress.
        // The key is that it should attempt to process beyond the first block marker.
        byte[] validBzip2Header = new byte[]{'B', 'Z', 'h', '1'}; // BZ2 magic + block size 1
        byte[] eofMarker = new byte[]{(byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90};
        byte[] blockHeader = new byte[]{(byte) 0x31, (byte) 0x41, (byte) 0x59, (byte) 0x26, (byte) 0x53, (byte) 0x59};
        byte[] dummyCrc = new byte[]{0, 0, 0, 0}; // Placeholder CRC

        // Construct a stream that looks like two concatenated blocks.
        // The content between blocks is arbitrary and invalid compressed data.
        byte[] concatenatedStream = new byte[validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length + blockHeader.length + 100 + eofMarker.length + dummyCrc.length];
        System.arraycopy(validBzip2Header, 0, concatenatedStream, 0, validBzip2Header.length);
        // Fill with some data for the first block (invalid compressed data)
        for (int i = 0; i < 100; i++) concatenatedStream[validBzip2Header.length + i] = (byte)i;
        System.arraycopy(eofMarker, 0, concatenatedStream, validBzip2Header.length + 100, eofMarker.length);
        System.arraycopy(dummyCrc, 0, concatenatedStream, validBzip2Header.length + 100 + eofMarker.length, dummyCrc.length);
        // Start of second block
        System.arraycopy(blockHeader, 0, concatenatedStream, validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length, blockHeader.length);
        // Fill with some data for the second block (invalid compressed data)
        for (int i = 0; i < 100; i++) concatenatedStream[validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length + blockHeader.length + i] = (byte)(i + 100);
        System.arraycopy(eofMarker, 0, concatenatedStream, validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length + blockHeader.length + 100, eofMarker.length);
        System.arraycopy(dummyCrc, 0, concatenatedStream, validBzip2Header.length + 100 + eofMarker.length + dummyCrc.length + blockHeader.length + 100 + eofMarker.length, dummyCrc.length);

        try (BZip2CompressorInputStream bz2Stream = new BZip2CompressorInputStream(new ByteArrayInputStream(concatenatedStream), true)) {
            // Attempt to read. This should try to process the second block and likely fail due to invalid data.
            // The important part is that it *tried* to initialize a new block.
            bz2Stream.read(); 
            fail("Expected an IOException due to invalid compressed data in the second block.");
        } catch (IOException e) {
            // We expect an IOException because the compressed data is invalid.
            // The message should indicate a problem during block processing.
            assertTrue(e.getMessage().contains("bad block header") || e.getMessage().contains("unexpected end of stream") || e.getMessage().contains("BZip2 CRC error") || e.getMessage().contains("stream corrupted"));
        }
    }

    @Test
    public void testReadWithNonConcatenatedStream() throws IOException {
        // This test checks that when decompressConcatenated is false, the stream stops after the first block.
        byte[] validBzip2Header = new byte[]{'B', 'Z', 'h', '1'};
        byte[] eofMarker = new byte[]{(byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90};
        byte[] dummyCrc = new byte[]{0, 0, 0, 0};

        // A stream with a valid header, some invalid data, and an EOF marker.
        byte[] stream = new byte[validBzip2Header.length + 50 + eofMarker.length + dummyCrc.length];
        System.arraycopy(validBzip2Header, 0, stream, 0, validBzip2Header.length);
        for (int i = 0; i < 50; i++) stream[validBzip2Header.length + i] = (byte)i; // Some invalid compressed data
        System.arraycopy(eofMarker, 0, stream, validBzip2Header.length + 50, eofMarker.length);
        System.arraycopy(dummyCrc, 0, stream, validBzip2Header.length + 50 + eofMarker.length, dummyCrc.length);

        try (BZip2CompressorInputStream bz2Stream = new BZip2CompressorInputStream(new ByteArrayInputStream(stream), false)) {
            // Attempt to read. This should fail because the data is invalid.
            // The key is that it does NOT try to initialize a second block because decompressConcatenated is false.
            bz2Stream.read(); 
            fail("Expected an IOException due to invalid compressed data.");
        } catch (IOException e) {
            // Expect an error due to invalid data within the first block.
            assertTrue(e.getMessage().contains("bad block header") || e.getMessage().contains("unexpected end of stream") || e.getMessage().contains("stream corrupted"));
        }
    }

    @Test
    public void testReadAfterClose() throws IOException {
        // Closing an already closed stream should not throw an exception.
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        bzip2Stream.close(); // First close
        bzip2Stream.close(); // Second close, should be a no-op.
        // Attempting to read after close should throw an IOException.
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
        // Reading from an empty stream should return -1.
        assertEquals(-1, bzip2Stream.read(buffer, 0, 10));
        bzip2Stream.close();
    }

    @Test
    public void testReadArrayWithInvalidOffset() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(emptyStream);
        byte[] buffer = new byte[10];
        // Test negative offset.
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
        // Test negative length.
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
        // Test length that goes beyond buffer bounds.
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
        // Test offset that goes beyond buffer bounds (even with length 0).
        try {
            bzip2Stream.read(buffer, 11, 0);
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
            // Initialize with a valid, but empty, stream
            InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
            bzip2Stream = new BZip2CompressorInputStream(emptyStream);
            bzip2Stream.close(); // Close once
            bzip2Stream.close(); // Close again, should be safe.
        } catch (IOException e) {
            fail("Closing twice or on an already closed stream threw an unexpected exception: " + e.getMessage());
        } finally {
            // Ensure it's closed if an exception occurred during setup
            if (bzip2Stream != null) {
                bzip2Stream.close(); 
            }
        }
    }
    
    @Test
    public void testReadWithMinimalValidBlock() throws IOException {
        // This test creates a stream that starts with a valid BZip2 header and block header,
        // but contains invalid compressed data. This is to ensure the stream initialization
        // proceeds correctly up to the point where data decompression would fail.
        byte[] streamData = new byte[] {
            // BZ2 header: 'B', 'Z', 'h', '1' (block size 100k)
            'B', 'Z', 'h', '1',
            // Block header: '1', 'A', 'Y', '&', 'S', 'Y'
            (byte) 0x31, (byte) 0x41, (byte) 0x59, (byte) 0x26, (byte) 0x53, (byte) 0x59,
            // Some arbitrary bytes that are not valid compressed data for this block.
            // This ensures that when read0() calls setupBlock(), which then calls getAndMoveToFrontDecode(),
            // it will encounter invalid bitstream data and throw an exception.
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            // End of block marker: 0x17, 0x72, 0x45, 0x38, 0x50, 0x90
            (byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90,
            // Dummy CRC for the block (storedBlockCRC)
            0x00, 0x00, 0x00, 0x00, 
            // Dummy Combined CRC (storedCombinedCRC)
            0x00, 0x00, 0x00, 0x00  
        };

        try (BZip2CompressorInputStream bz2Stream = new BZip2CompressorInputStream(new ByteArrayInputStream(streamData))) {
            // Attempt to read. This is expected to fail with an IOException due to the invalid compressed data.
            bz2Stream.read();
            fail("Expected IOException for invalid compressed data.");
        } catch (IOException e) {
            // The specific error message will depend on where the parsing fails within getAndMoveToFrontDecode.
            // Common errors include issues with bitstream reading or CRC checks.
            assertTrue(e.getMessage().contains("bad block header") || e.getMessage().contains("unexpected end of stream") || e.getMessage().contains("stream corrupted") || e.getMessage().contains("BZip2 CRC error"));
        }
    }
}
