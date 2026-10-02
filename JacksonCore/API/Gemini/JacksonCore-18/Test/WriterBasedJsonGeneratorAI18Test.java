package com.fasterxml.jackson.core.json;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class WriterBasedJsonGeneratorAI18Test {

    private WriterBasedJsonGenerator createGenerator(StringWriter sw) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, sw, false);
        return new WriterBasedJsonGenerator(ctxt, 0, null, sw);
    }

    @Test
    public void testLifeCycleAndOutputTarget() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        Assert.assertEquals(sw, gen.getOutputTarget());
        Assert.assertEquals(0, gen.getOutputBuffered());
        gen.close();
    }

    @Test
    public void testStartEndArrayAndObject() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        
        gen.writeStartArray();
        gen.writeStartObject();
        gen.writeEndObject();
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[{}]", sw.toString());
    }

    @Test(expected = IOException.class)
    public void testInvalidEndArray() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        try {
            gen.writeEndArray();
        } finally {
            gen.close();
        }
    }

    @Test(expected = IOException.class)
    public void testInvalidEndObject() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        try {
            gen.writeEndObject();
        } finally {
            gen.close();
        }
    }

    @Test
    public void testWriteFieldNameAndString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        
        gen.writeStartObject();
        gen.writeFieldName("hello");
        gen.writeString("world");
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"hello\":\"world\"}", sw.toString());
    }

    @Test(expected = IOException.class)
    public void testFieldNameExpectingValue() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        try {
            gen.writeStartObject();
            gen.writeFieldName("f1");
            gen.writeFieldName("f2");
        } finally {
            gen.close();
        }
    }

    @Test
    public void testWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        gen.writeNull();
        gen.close();
        Assert.assertEquals("null", sw.toString());
    }

    @Test
    public void testWriteBooleanAndNumbers() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        
        gen.writeStartArray();
        gen.writeBoolean(true);
        gen.writeBoolean(false);
        gen.writeNumber(123);
        gen.writeNumber(456L);
        gen.writeNumber(BigDecimal.TEN);
        gen.writeNumber(BigInteger.valueOf(789));
        gen.writeNumber(3.14);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[true,false,123,456,10,789,3.14]", sw.toString());
    }

    @Test
    public void testFlushBuffer() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw);
        gen.writeStartObject();
        gen.writeFieldName("key");
        gen.writeNumber(1);
        Assert.assertTrue(gen.getOutputBuffered() >= 0);
        gen.flush();
        gen.writeEndObject();
        gen.close();
        Assert.assertEquals("{\"key\":1}", sw.toString());
    }
}
