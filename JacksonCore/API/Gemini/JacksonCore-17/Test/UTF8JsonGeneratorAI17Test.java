package com.fasterxml.jackson.core.json;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8JsonGeneratorAI17Test {

    private UTF8JsonGenerator createGenerator(ByteArrayOutputStream out) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, out, true);
        return new UTF8JsonGenerator(ctxt, 0, null, out);
    }

    @Test
    public void testGetOutputTargetAndBuffered() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        Assert.assertSame(out, gen.getOutputTarget());
        Assert.assertEquals(0, gen.getOutputBuffered());
        gen.close();
    }

    @Test
    public void testWriteStartAndEndArray() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartArray();
        gen.writeEndArray();
        gen.flush();
        String result = out.toString("UTF-8");
        Assert.assertEquals("[]", result);
        gen.close();
    }

    @Test
    public void testWriteStartAndEndObject() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeEndObject();
        gen.flush();
        String result = out.toString("UTF-8");
        Assert.assertEquals("{}", result);
        gen.close();
    }

    @Test
    public void testWriteFieldNameAndString() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeFieldName("hello");
        gen.writeString("world");
        gen.writeEndObject();
        gen.flush();
        String result = out.toString("UTF-8");
        Assert.assertEquals("{\"hello\":\"world\"}", result);
        gen.close();
    }

    @Test
    public void testWriteBooleanField() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeBooleanField("t", true);
        gen.writeBooleanField("f", false);
        gen.writeEndObject();
        gen.flush();
        String result = out.toString("UTF-8");
        Assert.assertEquals("{\"t\":true,\"f\":false}", result);
        gen.close();
    }

    @Test
    public void testWriteNullField() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeNullField("n");
        gen.writeEndObject();
        gen.flush();
        String result = out.toString("UTF-8");
        Assert.assertEquals("{\"n\":null}", result);
        gen.close();
    }

    @Test
    public void testWriteNumberField() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeNumberField("int", 123);
        gen.writeNumberField("long", 456L);
        gen.writeNumberField("double", 78.9);
        gen.writeEndObject();
        gen.flush();
        String result = out.toString("UTF-8");
        Assert.assertEquals("{\"int\":123,\"long\":456,\"double\":78.9}", result);
        gen.close();
    }

    @Test(expected = IOException.class)
    public void testWriteEndArrayWithoutStartThrowsError() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        try {
            gen.writeEndArray();
        } finally {
            gen.close();
        }
    }

    @Test
    public void testWriteRawCharAndString() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeRaw("rawText");
        gen.writeRaw('X');
        gen.flush();
        String result = out.toString("UTF-8");
        Assert.assertEquals("rawTextX", result);
        gen.close();
    }

    @Test
    public void testExplicitBufferConstructor() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, out, true);
        byte[] customBuffer = new byte[100];
        UTF8JsonGenerator gen = new UTF8JsonGenerator(ctxt, 0, null, out, customBuffer, 0, true);
        
        gen.writeStartArray();
        gen.writeNumber(10);
        gen.writeEndArray();
        gen.flush();
        
        Assert.assertEquals("[10]", out.toString("UTF-8"));
        gen.close();
    }
}
