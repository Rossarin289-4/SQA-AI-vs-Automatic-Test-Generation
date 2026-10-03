package com.fasterxml.jackson.core.json;

import java.io.StringWriter;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class WriterBasedJsonGeneratorAI18Test {

    @Test
    public void testGetOutputTargetAndBuffered() {
        StringWriter sw = new StringWriter();
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        WriterBasedJsonGenerator gen = new WriterBasedJsonGenerator(ctxt, 0, null, sw);

        assertSame(sw, gen.getOutputTarget());
        assertEquals(0, gen.getOutputBuffered());
    }

    @Test
    public void testFlushBufferEmpty() throws Exception {
        StringWriter sw = new StringWriter();
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        WriterBasedJsonGenerator gen = new WriterBasedJsonGenerator(ctxt, 0, null, sw);

        gen._flushBuffer();
        assertEquals("", sw.toString());
    }

    @Test
    public void testAllocateEntityBuffer() {
        StringWriter sw = new StringWriter();
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        WriterBasedJsonGenerator gen = new WriterBasedJsonGenerator(ctxt, 0, null, sw);

        char[] ent = gen._allocateEntityBuffer();
        assertNotNull(ent);
        assertEquals(14, ent.length);
        assertEquals('\\', ent[0]);
        assertEquals('\\', ent[2]);
        assertEquals('u', ent[3]);
        assertEquals('\\', ent[8]);
        assertEquals('u', ent[9]);
    }
}
