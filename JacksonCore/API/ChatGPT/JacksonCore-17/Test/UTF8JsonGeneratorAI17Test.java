package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;

public class UTF8JsonGeneratorAI17Test {

    @Test
    public void testGetOutputBuffered() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        UTF8JsonGenerator gen = new UTF8JsonGenerator(ctxt, 0, null, out);
        
        assertEquals(0, gen.getOutputBuffered());
    }

    @Test
    public void testGetOutputTarget() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        UTF8JsonGenerator gen = new UTF8JsonGenerator(ctxt, 0, null, out);
        
        assertEquals(out, gen.getOutputTarget());
    }
}
