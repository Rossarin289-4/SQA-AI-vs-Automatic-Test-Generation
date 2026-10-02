package com.fasterxml.jackson.core.json;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8JsonGeneratorAI18Test {

    private UTF8JsonGenerator createGenerator(ByteArrayOutputStream out) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        return new UTF8JsonGenerator(ctxt, 0, null, out);
    }

    @Test
    public void testLifeCycleAndTargets() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        Assert.assertEquals(out, gen.getOutputTarget());
        Assert.assertEquals(0, gen.getOutputBuffered());
        gen.close();
    }

    @Test
    public void testWriteStartAndEndArray() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartArray();
        gen.writeEndArray();
        gen.flush();
        Assert.assertEquals("[]", out.toString("UTF-8"));
        gen.close();
    }

    @Test
    public void testWriteStartAndEndObject() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeEndObject();
        gen.flush();
        Assert.assertEquals("{}", out.toString("UTF-8"));
        gen.close();
    }

    @Test
    public void testWriteFieldNameAndString() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeFieldName("hello");
        gen.writeString("world");
        gen.writeEndObject();
        gen.flush();
        Assert.assertEquals("{\"hello\":\"world\"}", out.toString("UTF-8"));
        gen.close();
    }

    @Test(expected = IOException.class)
    public void testWriteFieldNameExpectsValueThrows() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeFieldName("field1");
        // Writing another field name without writing a value should trigger error
        gen.writeFieldName("field2");
        gen.close();
    }

    @Test
    public void testWriteNull() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeNull();
        gen.flush();
        Assert.assertEquals("null", out.toString("UTF-8"));
        gen.close();
    }

    @Test(expected = IOException.class)
    public void testWriteEndArrayWithoutStartThrows() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        try {
            gen.writeEndArray();
        } finally {
            gen.close();
        }
    }
}
