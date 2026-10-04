package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.reflect.Field; // Import for reflection to access protected fields

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
        // Access BufferRecycler's default buffer size using reflection since byteBufferLength is protected
        int defaultSize = (int) BufferRecycler.class.getDeclaredMethod("byteBufferLength", int.class).invoke(br, BufferRecycler.BYTE_READ_IO_BUFFER);
        assertTrue(buffer.length >= defaultSize);
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
        int defaultSize = (int) BufferRecycler.class.getDeclaredMethod("byteBufferLength", int.class).invoke(br, BufferRecycler.BYTE_WRITE_ENCODING_BUFFER);
        assertTrue(buffer.length >= defaultSize);
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
        int defaultSize = (int) BufferRecycler.class.getDeclaredMethod("byteBufferLength", int.class).invoke(br, BufferRecycler.BYTE_BASE64_CODEC_BUFFER);
        assertTrue(buffer.length >= defaultSize);
    }

    @Test
    public void testAllocTokenBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocTokenBuffer();
        assertNotNull(buffer);
        int defaultSize = (int) BufferRecycler.class.getDeclaredMethod("charBufferLength", int.class).invoke(br, BufferRecycler.CHAR_TOKEN_BUFFER);
        assertTrue(buffer.length >= defaultSize);
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
        int defaultSize = (int) BufferRecycler.class.getDeclaredMethod("charBufferLength", int.class).invoke(br, BufferRecycler.CHAR_CONCAT_BUFFER);
        assertTrue(buffer.length >= defaultSize);
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
        // Use reflection to check if _readIOBuffer is null
        Field field = IOContext.class.getDeclaredField("_readIOBuffer");
        field.setAccessible(true);
        assertNull(field.get(context));
    }

    @Test
    public void testReleaseWriteEncodingBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocWriteEncodingBuffer();
        context.releaseWriteEncodingBuffer(buffer);
        Field field = IOContext.class.getDeclaredField("_writeEncodingBuffer");
        field.setAccessible(true);
        assertNull(field.get(context));
    }

    @Test
    public void testReleaseBase64Buffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocBase64Buffer();
        context.releaseBase64Buffer(buffer);
        Field field = IOContext.class.getDeclaredField("_base64Buffer");
        field.setAccessible(true);
        assertNull(field.get(context));
    }

    @Test
    public void testReleaseTokenBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocTokenBuffer();
        context.releaseTokenBuffer(buffer);
        Field field = IOContext.class.getDeclaredField("_tokenCBuffer");
        field.setAccessible(true);
        assertNull(field.get(context));
    }

    @Test
    public void testReleaseConcatBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocConcatBuffer();
        context.releaseConcatBuffer(buffer);
        Field field = IOContext.class.getDeclaredField("_concatCBuffer");
        field.setAccessible(true);
        assertNull(field.get(context));
    }

    @Test
    public void testReleaseNameCopyBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] buffer = context.allocNameCopyBuffer(100);
        context.releaseNameCopyBuffer(buffer);
        Field field = IOContext.class.getDeclaredField("_nameCopyBuffer");
        field.setAccessible(true);
        assertNull(field.get(context));
    }

    @Test
    public void testAllocThenReleaseSameBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] buffer = context.allocReadIOBuffer();
        assertNotNull(buffer);
        context.releaseReadIOBuffer(buffer);
        Field field = IOContext.class.getDeclaredField("_readIOBuffer");
        field.setAccessible(true);
        assertNull(field.get(context));
        // Re-allocate and check it's a new buffer from recycler
        byte[] buffer2 = context.allocReadIOBuffer();
        assertNotNull(buffer2);
        assertNotSame(buffer, buffer2);
    }

    @Test
    public void testReleaseNullBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        context.releaseReadIOBuffer(null);
        Field fieldRead = IOContext.class.getDeclaredField("_readIOBuffer");
        fieldRead.setAccessible(true);
        assertNull(fieldRead.get(context));

        context.releaseWriteEncodingBuffer(null);
        Field fieldWrite = IOContext.class.getDeclaredField("_writeEncodingBuffer");
        fieldWrite.setAccessible(true);
        assertNull(fieldWrite.get(context));

        context.releaseBase64Buffer(null);
        Field fieldBase64 = IOContext.class.getDeclaredField("_base64Buffer");
        fieldBase64.setAccessible(true);
        assertNull(fieldBase64.get(context));

        context.releaseTokenBuffer(null);
        Field fieldToken = IOContext.class.getDeclaredField("_tokenCBuffer");
        fieldToken.setAccessible(true);
        assertNull(fieldToken.get(context));

        context.releaseConcatBuffer(null);
        Field fieldConcat = IOContext.class.getDeclaredField("_concatCBuffer");
        fieldConcat.setAccessible(true);
        assertNull(fieldConcat.get(context));

        context.releaseNameCopyBuffer(null);
        Field fieldNameCopy = IOContext.class.getDeclaredField("_nameCopyBuffer");
        fieldNameCopy.setAccessible(true);
        assertNull(fieldNameCopy.get(context));
    }

    @Test
    public void test_allocAndRelease_ReadIOBuffer_then_WriteEncodingBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] readBuf = context.allocReadIOBuffer();
        assertNotNull(readBuf);
        context.releaseReadIOBuffer(readBuf);
        Field fieldRead = IOContext.class.getDeclaredField("_readIOBuffer");
        fieldRead.setAccessible(true);
        assertNull(fieldRead.get(context));

        byte[] writeBuf = context.allocWriteEncodingBuffer();
        assertNotNull(writeBuf);
        context.releaseWriteEncodingBuffer(writeBuf);
        Field fieldWrite = IOContext.class.getDeclaredField("_writeEncodingBuffer");
        fieldWrite.setAccessible(true);
        assertNull(fieldWrite.get(context));
    }

    @Test
    public void test_allocAndRelease_TokenBuffer_then_ConcatBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] tokenBuf = context.allocTokenBuffer();
        assertNotNull(tokenBuf);
        context.releaseTokenBuffer(tokenBuf);
        Field fieldToken = IOContext.class.getDeclaredField("_tokenCBuffer");
        fieldToken.setAccessible(true);
        assertNull(fieldToken.get(context));

        char[] concatBuf = context.allocConcatBuffer();
        assertNotNull(concatBuf);
        context.releaseConcatBuffer(concatBuf);
        Field fieldConcat = IOContext.class.getDeclaredField("_concatCBuffer");
        fieldConcat.setAccessible(true);
        assertNull(fieldConcat.get(context));
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
            // Expected
        }
    }

    @Test
    public void testVerifyRelease_WrongBuffer_Byte() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        byte[] ownedBuffer = context.allocReadIOBuffer();
        byte[] otherBuffer = new byte[ownedBuffer.length + 1]; // A larger buffer
        try {
            context.releaseReadIOBuffer(otherBuffer);
            fail("Should throw IllegalArgumentException when releasing a different buffer");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
     @Test
    public void testVerifyRelease_WrongBuffer_Char() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        char[] ownedBuffer = context.allocTokenBuffer();
        char[] otherBuffer = new char[ownedBuffer.length + 1];
        try {
            context.releaseTokenBuffer(otherBuffer);
            fail("Should throw IllegalArgumentException when releasing a different buffer");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testWrongBufMessage() throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        // Call internal wrongBuf to check its exception message
        try {
            // Need to trigger the internal wrongBuf() call, which happens during _verifyRelease
            // _verifyRelease is called by releaseReadIOBuffer
            // We need to pass a buffer that is NOT the owned one
            byte[] ownedBuffer = context.allocReadIOBuffer(); // Ensure ownedBuffer is assigned
            byte[] differentBuffer = new byte[ownedBuffer.length + 1]; // A different buffer
            context.releaseReadIOBuffer(differentBuffer); // This should call _verifyRelease and then wrongBuf
            fail("Expected IllegalArgumentException from wrongBuf");
        } catch (IllegalArgumentException e) {
            // The message comes from wrongBuf()
            assertTrue(e.getMessage().contains("Trying to release buffer smaller than original"));
        }
    }
}
