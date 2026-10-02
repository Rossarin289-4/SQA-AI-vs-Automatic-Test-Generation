package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import org.junit.Assert;
import org.junit.Test;

public class IOContextAI14Test {

    @Test
    public void testBasicInitializationAndGetters() {
        BufferRecycler br = new BufferRecycler();
        Object sourceRef = "testSource";
        IOContext context = new IOContext(br, sourceRef, true);

        Assert.assertEquals(sourceRef, context.getSourceReference());
        Assert.assertTrue(context.isResourceManaged());
        Assert.assertNull(context.getEncoding());

        context.setEncoding(JsonEncoding.UTF8);
        Assert.assertEquals(JsonEncoding.UTF8, context.getEncoding());

        IOContext chained = context.withEncoding(JsonEncoding.UTF16_LE);
        Assert.assertSame(context, chained);
        Assert.assertEquals(JsonEncoding.UTF16_LE, context.getEncoding());
    }

    @Test
    public void testConstructTextBuffer() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, "source", false);
        TextBuffer textBuffer = context.constructTextBuffer();
        Assert.assertNotNull(textBuffer);
    }

    @Test
    public void testReadIOBufferLifecycle() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);

        byte[] buf1 = context.allocReadIOBuffer();
        Assert.assertNotNull(buf1);

        // Release null should be safe
        context.releaseReadIOBuffer(null);

        // Release valid buffer
        context.releaseReadIOBuffer(buf1);

        // Allocate with minSize after release
        byte[] buf2 = context.allocReadIOBuffer(100);
        Assert.assertNotNull(buf2);
        context.releaseReadIOBuffer(buf2);
    }

    @Test(expected = IllegalStateException.class)
    public void testDoubleAllocReadIOBufferThrows() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);
        context.allocReadIOBuffer();
        context.allocReadIOBuffer(); // Should throw IllegalStateException
    }

    @Test
    public void testWriteEncodingBufferLifecycle() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);

        byte[] buf = context.allocWriteEncodingBuffer(50);
        Assert.assertNotNull(buf);
        context.releaseWriteEncodingBuffer(buf);

        byte[] buf2 = context.allocWriteEncodingBuffer();
        Assert.assertNotNull(buf2);
        context.releaseWriteEncodingBuffer(buf2);
    }

    @Test(expected = IllegalStateException.class)
    public void testDoubleAllocWriteEncodingBufferThrows() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        context.allocWriteEncodingBuffer();
        context.allocWriteEncodingBuffer(20);
    }

    @Test
    public void testBase64BufferLifecycle() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);

        byte[] buf = context.allocBase64Buffer();
        Assert.assertNotNull(buf);
        context.releaseBase64Buffer(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testDoubleAllocBase64BufferThrows() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);
        context.allocBase64Buffer();
        context.allocBase64Buffer();
    }

    @Test
    public void testTokenBufferLifecycle() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);

        char[] buf1 = context.allocTokenBuffer();
        Assert.assertNotNull(buf1);
        context.releaseTokenBuffer(buf1);

        char[] buf2 = context.allocTokenBuffer(200);
        Assert.assertNotNull(buf2);
        context.releaseTokenBuffer(buf2);
    }

    @Test(expected = IllegalStateException.class)
    public void testDoubleAllocTokenBufferThrows() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);
        context.allocTokenBuffer();
        context.allocTokenBuffer();
    }

    @Test
    public void testConcatAndNameCopyBufferLifecycle() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);

        char[] concatBuf = context.allocConcatBuffer();
        Assert.assertNotNull(concatBuf);
        context.releaseConcatBuffer(concatBuf);

        char[] nameCopyBuf = context.allocNameCopyBuffer(10);
        Assert.assertNotNull(nameCopyBuf);
        context.releaseNameCopyBuffer(nameCopyBuf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseSmallerByteBufferThrows() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);

        byte[] original = context.allocReadIOBuffer(200);
        // Attempting to release a smaller buffer than allocated original when they don't match reference
        byte[] smaller = new byte[10];
        context.releaseReadIOBuffer(smaller);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseSmallerCharBufferThrows() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, true);

        char[] original = context.allocNameCopyBuffer(100);
        char[] smaller = new char[5];
        context.releaseNameCopyBuffer(smaller);
    }
}
