package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8JsonGeneratorAI18Test {

    @Test
    public void testGetOutputTarget() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        UTF8JsonGenerator generator = new UTF8JsonGenerator(ctxt, 0, null, out);
        assertSame(out, generator.getOutputTarget());
    }

    @Test
    public void testGetOutputBufferedInitial() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        UTF8JsonGenerator generator = new UTF8JsonGenerator(ctxt, 0, null, out);
        assertEquals(0, generator.getOutputBuffered());
    }

    @Test
    public void testCustomBufferConstructor() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        byte[] customBuffer = new byte[100];
        UTF8JsonGenerator generator = new UTF8JsonGenerator(ctxt, 0, null, out, customBuffer, 10, false);
        assertEquals(10, generator.getOutputBuffered());
        assertSame(out, generator.getOutputTarget());
    }
}
