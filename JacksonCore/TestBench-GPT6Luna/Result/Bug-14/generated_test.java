package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public class IOContextTest {
    @Test
    public void testConfigurationAndEncoding() throws Exception {
        Object source = new Object();
        IOContext context = new IOContext(new BufferRecycler(), source, true);
        assertSame(source, context.getSourceReference());
        assertTrue(context.isResourceManaged());
        assertNull(context.getEncoding());
        context.setEncoding(JsonEncoding.UTF8);
        assertEquals(JsonEncoding.UTF8, context.getEncoding());
    }

    @Test
    public void testWithEncodingReturnsContextAndSetsEncoding() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        assertSame(context, context.withEncoding(JsonEncoding.UTF16_BE));
        assertEquals(JsonEncoding.UTF16_BE, context.getEncoding());
        assertFalse(context.isResourceManaged());
    }

    @Test
    public void testWithEncodingCanReplaceEncoding() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), "source", false);
        context.withEncoding(JsonEncoding.UTF16_LE);
        context.withEncoding(JsonEncoding.UTF32_BE);
        assertEquals(JsonEncoding.UTF32_BE, context.getEncoding());
    }

    @Test
    public void testConstructTextBufferIsEmpty() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        TextBuffer buffer = context.constructTextBuffer();
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testAllocReadBufferAndRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        byte[] buffer = context.allocReadIOBuffer();
        assertTrue(buffer.length > 0);
        context.releaseReadIOBuffer(buffer);
        byte[] again = context.allocReadIOBuffer();
        assertTrue(again.length > 0);
        context.releaseReadIOBuffer(again);
    }

    @Test
    public void testReadBufferAllocationCannotRepeatBeforeRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        context.allocReadIOBuffer();
        try { context.allocReadIOBuffer(); fail("expected IllegalStateException"); }
        catch (IllegalStateException expected) { }
    }

    @Test
    public void testAllocWriteEncodingBufferAndRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        byte[] buffer = context.allocWriteEncodingBuffer();
        assertTrue(buffer.length > 0);
        context.releaseWriteEncodingBuffer(buffer);
        byte[] again = context.allocWriteEncodingBuffer();
        assertTrue(again.length > 0);
        context.releaseWriteEncodingBuffer(again);
    }

    @Test
    public void testWriteBufferAllocationCannotRepeatBeforeRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        context.allocWriteEncodingBuffer();
        try { context.allocWriteEncodingBuffer(); fail("expected IllegalStateException"); }
        catch (IllegalStateException expected) { }
    }

    @Test
    public void testAllocBase64BufferAndRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        byte[] buffer = context.allocBase64Buffer();
        assertTrue(buffer.length > 0);
        context.releaseBase64Buffer(buffer);
        byte[] again = context.allocBase64Buffer();
        assertTrue(again.length > 0);
        context.releaseBase64Buffer(again);
    }

    @Test
    public void testBase64AllocationCannotRepeatBeforeRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        context.allocBase64Buffer();
        try { context.allocBase64Buffer(); fail("expected IllegalStateException"); }
        catch (IllegalStateException expected) { }
    }

    @Test
    public void testAllocTokenBufferAndRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        char[] buffer = context.allocTokenBuffer();
        assertTrue(buffer.length > 0);
        context.releaseTokenBuffer(buffer);
        char[] again = context.allocTokenBuffer();
        assertTrue(again.length > 0);
        context.releaseTokenBuffer(again);
    }

    @Test
    public void testTokenAllocationCannotRepeatBeforeRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        context.allocTokenBuffer();
        try { context.allocTokenBuffer(); fail("expected IllegalStateException"); }
        catch (IllegalStateException expected) { }
    }

    @Test
    public void testAllocConcatBufferAndRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        char[] buffer = context.allocConcatBuffer();
        assertTrue(buffer.length > 0);
        context.releaseConcatBuffer(buffer);
        char[] again = context.allocConcatBuffer();
        assertTrue(again.length > 0);
        context.releaseConcatBuffer(again);
    }

    @Test
    public void testConcatAllocationCannotRepeatBeforeRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        context.allocConcatBuffer();
        try { context.allocConcatBuffer(); fail("expected IllegalStateException"); }
        catch (IllegalStateException expected) { }
    }

    @Test
    public void testAllocNameCopyBufferAndRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        char[] buffer = context.allocNameCopyBuffer(24);
        assertTrue(buffer.length >= 24);
        context.releaseNameCopyBuffer(buffer);
        char[] again = context.allocNameCopyBuffer(1);
        assertTrue(again.length >= 1);
        context.releaseNameCopyBuffer(again);
    }

    @Test
    public void testNameCopyAllocationCannotRepeatBeforeRelease() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        context.allocNameCopyBuffer(1);
        try { context.allocNameCopyBuffer(1); fail("expected IllegalStateException"); }
        catch (IllegalStateException expected) { }
    }

    @Test
    public void testNullReleaseDoesNotPreventAllocation() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        context.releaseReadIOBuffer(null);
        byte[] buffer = context.allocReadIOBuffer();
        assertTrue(buffer.length > 0);
        context.releaseReadIOBuffer(buffer);
    }

    @Test
    public void testLargerReplacementByteBufferCanBeReleased() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        byte[] original = context.allocReadIOBuffer();
        byte[] larger = new byte[original.length + 1];
        context.releaseReadIOBuffer(larger);
        byte[] recycled = context.allocReadIOBuffer();
        assertTrue(recycled.length >= original.length);
        context.releaseReadIOBuffer(recycled);
    }

    @Test
    public void testSmallerReplacementByteBufferIsRejected() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        byte[] original = context.allocReadIOBuffer();
        try { context.releaseReadIOBuffer(new byte[original.length - 1]); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testLargerReplacementCharBufferCanBeReleased() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        char[] original = context.allocConcatBuffer();
        char[] larger = new char[original.length + 1];
        context.releaseConcatBuffer(larger);
        char[] recycled = context.allocConcatBuffer();
        assertTrue(recycled.length >= original.length);
        context.releaseConcatBuffer(recycled);
    }

    @Test
    public void testSmallerReplacementCharBufferIsRejected() throws Exception {
        IOContext context = new IOContext(new BufferRecycler(), null, false);
        char[] original = context.allocTokenBuffer();
        try { context.releaseTokenBuffer(new char[original.length - 1]); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }
}
