package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import org.junit.Test;

import static org.junit.Assert.*;

public class IOContextAI14Test {

    @Test
    public void testBasicAccessorsAndEncoding() {
        BufferRecycler br = new BufferRecycler();
        Object sourceRef = "testSource";
        IOContext context = new IOContext(br, sourceRef, true);

        assertSame(sourceRef, context.getSourceReference());
        assertTrue(context.isResourceManaged());
        assertNull(context.getEncoding());

        context.setEncoding(JsonEncoding.UTF8);
        assertEquals(JsonEncoding.UTF8, context.getEncoding());

        IOContext chained = context.withEncoding(JsonEncoding.UTF16_LE);
        assertSame(context, chained);
        assertEquals(JsonEncoding.UTF16_LE, context.getEncoding());

        TextBuffer textBuffer = context.constructTextBuffer();
        assertNotNull(textBuffer);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBufferTwice() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);
        context.allocReadIOBuffer();
        context.allocReadIOBuffer();
    }

    @Test
    public void testBufferAllocationAndRelease() {
        BufferRecycler br = new BufferRecycler();
        IOContext context = new IOContext(br, null, false);

        byte[] readBuffer = context.allocReadIOBuffer(100);
        assertNotNull(readBuffer);
        context.releaseReadIOBuffer(readBuffer);

        char[] tokenBuffer = context.allocTokenBuffer();
        assertNotNull(tokenBuffer);
        context.releaseTokenBuffer(tokenBuffer);
    }
}
