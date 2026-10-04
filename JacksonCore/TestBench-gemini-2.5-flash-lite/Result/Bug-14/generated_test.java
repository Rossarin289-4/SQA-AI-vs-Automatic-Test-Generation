package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public class IOContextTest {
    @Test
    public void testConstructorAndAccessors() throws Exception {
        BufferRecycler br = new BufferRecycler();
        Object sourceRef = new Object();
        boolean managed = true;
        IOContext context = new IOContext(br, sourceRef, managed);

        assertEquals(sourceRef, context.getSourceReference());
        assertNull(context.getEncoding());
        assertTrue(context.isResourceManaged());
    }

    @Test
    public void testSetEncoding() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        JsonEncoding encoding = JsonEncoding.UTF8;
        context.setEncoding(encoding);
        assertEquals(encoding, context.getEncoding());
    }

    @Test
    public void testWithEncoding() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        JsonEncoding encoding = JsonEncoding.UTF16_BE;
        IOContext returnedContext = context.withEncoding(encoding);
        assertEquals(encoding, context.getEncoding());
        assertSame(context, returnedContext); // should return self
    }

    @Test
    public void testConstructTextBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        TextBuffer tb = context.constructTextBuffer();
        assertNotNull(tb);
        // The TextBuffer is constructed with the provided BufferRecycler
        // Its internal state regarding shared buffers would be null initially.
    }

    @Test
    public void testAllocReadIOBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocReadIOBuffer();
        assertNotNull(buffer);
        // The default buffer size is determined by BufferRecycler, no need to test exact size here.
        // We just check if a buffer was allocated.
        assertTrue(buffer.length > 0);
    }

    @Test
    public void testAllocReadIOBufferWithSize() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        int minSize = 1024;
        byte[] buffer = context.allocReadIOBuffer(minSize);
        assertNotNull(buffer);
        assertTrue(buffer.length >= minSize);
    }

    @Test
    public void testAllocWriteEncodingBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocWriteEncodingBuffer();
        assertNotNull(buffer);
        assertTrue(buffer.length > 0);
    }

    @Test
    public void testAllocWriteEncodingBufferWithSize() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        int minSize = 2048;
        byte[] buffer = context.allocWriteEncodingBuffer(minSize);
        assertNotNull(buffer);
        assertTrue(buffer.length >= minSize);
    }

    @Test
    public void testAllocBase64Buffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocBase64Buffer();
        assertNotNull(buffer);
        assertTrue(buffer.length > 0);
    }

    @Test
    public void testAllocTokenBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocTokenBuffer();
        assertNotNull(buffer);
        assertTrue(buffer.length > 0);
    }

    @Test
    public void testAllocTokenBufferWithSize() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        int minSize = 512;
        char[] buffer = context.allocTokenBuffer(minSize);
        assertNotNull(buffer);
        assertTrue(buffer.length >= minSize);
    }

    @Test
    public void testAllocConcatBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocConcatBuffer();
        assertNotNull(buffer);
        assertTrue(buffer.length > 0);
    }

    @Test
    public void testAllocNameCopyBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        int minSize = 256;
        char[] buffer = context.allocNameCopyBuffer(minSize);
        assertNotNull(buffer);
        assertTrue(buffer.length >= minSize);
    }

    @Test
    public void testReleaseReadIOBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocReadIOBuffer();
        context.releaseReadIOBuffer(buffer);
        // The internal buffer should be null after release
        // No direct way to check _readIOBuffer without reflection, which is not allowed.
        // We rely on the fact that a subsequent alloc will succeed, and that it will not throw an error during release.
    }

    @Test
    public void testReleaseWriteEncodingBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocWriteEncodingBuffer();
        context.releaseWriteEncodingBuffer(buffer);
        // Internal buffer is nulled out by the release method.
    }

    @Test
    public void testReleaseBase64Buffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocBase64Buffer();
        context.releaseBase64Buffer(buffer);
        // Internal buffer is nulled out by the release method.
    }

    @Test
    public void testReleaseTokenBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocTokenBuffer();
        context.releaseTokenBuffer(buffer);
        // Internal buffer is nulled out by the release method.
    }

    @Test
    public void testReleaseConcatBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocConcatBuffer();
        context.releaseConcatBuffer(buffer);
        // Internal buffer is nulled out by the release method.
    }

    @Test
    public void testReleaseNameCopyBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocNameCopyBuffer(100);
        context.releaseNameCopyBuffer(buffer);
        // Internal buffer is nulled out by the release method.
    }

    @Test
    public void testAllocThenReleaseSameBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocReadIOBuffer();
        assertNotNull(buffer);
        context.releaseReadIOBuffer(buffer);
        // Re-allocate and check it's a new buffer from recycler
        byte[] buffer2 = context.allocReadIOBuffer();
        assertNotNull(buffer2);
        // It is expected to be a different instance as the original buffer was released.
        assertNotSame(buffer, buffer2);
    }

    @Test
    public void testReleaseNullBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        context.releaseReadIOBuffer(null); // Should not throw
        context.releaseWriteEncodingBuffer(null); // Should not throw
        context.releaseBase64Buffer(null); // Should not throw
        context.releaseTokenBuffer(null); // Should not throw
        context.releaseConcatBuffer(null); // Should not throw
        context.releaseNameCopyBuffer(null); // Should not throw
    }

    @Test
    public void test_allocAndRelease_ReadIOBuffer_then_WriteEncodingBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] readBuf = context.allocReadIOBuffer();
        assertNotNull(readBuf);
        context.releaseReadIOBuffer(readBuf);
        // After release, no specific state to assert without reflection.
        // The key is that it doesn't throw an error.

        byte[] writeBuf = context.allocWriteEncodingBuffer();
        assertNotNull(writeBuf);
        context.releaseWriteEncodingBuffer(writeBuf);
        // After release, no specific state to assert without reflection.
    }

    @Test
    public void test_allocAndRelease_TokenBuffer_then_ConcatBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] tokenBuf = context.allocTokenBuffer();
        assertNotNull(tokenBuf);
        context.releaseTokenBuffer(tokenBuf);
        // After release, no specific state to assert without reflection.

        char[] concatBuf = context.allocConcatBuffer();
        assertNotNull(concatBuf);
        context.releaseConcatBuffer(concatBuf);
        // After release, no specific state to assert without reflection.
    }

    @Test
    public void testVerifyAllocThrowsOnSecondAlloc() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        context.allocReadIOBuffer(); // First allocation
        try {
            context.allocReadIOBuffer(); // Second allocation
            fail("Should throw IllegalStateException on second allocation");
        } catch (IllegalStateException e) {
            // Expected: "Trying to call same allocXxx() method second time"
            assertTrue(e.getMessage().contains("allocXxx() method second time"));
        }
    }

    @Test
    public void testVerifyRelease_ShrinkingBuffer_Byte() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] ownedBuffer = context.allocReadIOBuffer();
        byte[] smallerBuffer = new byte[ownedBuffer.length - 1]; // A smaller buffer
        try {
            context.releaseReadIOBuffer(smallerBuffer);
            fail("Should throw IllegalArgumentException when releasing a smaller buffer");
        } catch (IllegalArgumentException e) {
            // Expected: "Trying to release buffer smaller than original"
            assertTrue(e.getMessage().contains("buffer smaller than original"));
        }
    }

     @Test
    public void testVerifyRelease_ShrinkingBuffer_Char() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] ownedBuffer = context.allocTokenBuffer();
        char[] smallerBuffer = new char[ownedBuffer.length - 1]; // A smaller buffer
        try {
            context.releaseTokenBuffer(smallerBuffer);
            fail("Should throw IllegalArgumentException when releasing a smaller buffer");
        } catch (IllegalArgumentException e) {
            // Expected: "Trying to release buffer smaller than original"
            assertTrue(e.getMessage().contains("buffer smaller than original"));
        }
    }

    @Test
    public void testWrongBufExceptionMessage() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        // To trigger _verifyRelease and consequently wrongBuf(), we need to attempt to release a buffer
        // that is different from the one allocated and held by the IOContext, and specifically, one that is smaller.
        byte[] ownedBuffer = context.allocReadIOBuffer();
        byte[] smallerBuffer = new byte[ownedBuffer.length - 1]; // A smaller buffer
        try {
            context.releaseReadIOBuffer(smallerBuffer); // This call will trigger _verifyRelease and wrongBuf()
            fail("Expected IllegalArgumentException from wrongBuf");
        } catch (IllegalArgumentException e) {
            // The message comes from wrongBuf()
            assertTrue(e.getMessage().contains("Trying to release buffer smaller than original"));
        }
    }
}
