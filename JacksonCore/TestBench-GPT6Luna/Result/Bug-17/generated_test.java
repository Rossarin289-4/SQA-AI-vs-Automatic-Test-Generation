package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.*;

public class UTF8JsonGeneratorTest {
    private UTF8JsonGenerator generator(ByteArrayOutputStream out) {
        IOContext ctxt = new IOContext(null, out, false);
        return new UTF8JsonGenerator(ctxt, JsonGenerator.Feature.collectDefaults(), null, out);
    }

    private String writeValue(WriterAction action) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = generator(out);
        action.write(gen);
        gen.close();
        return out.toString("UTF-8");
    }

    private interface WriterAction {
        void write(UTF8JsonGenerator gen) throws Exception;
    }

    @Test
    public void testOutputTargetIsSuppliedStream() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = generator(out);
        assertSame(out, gen.getOutputTarget());
    }

    @Test
    public void testOutputBufferedTracksWrittenContent() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = generator(out);
        gen.writeRaw("abc");
        assertEquals(3, gen.getOutputBuffered());
    }

    @Test
    public void testFieldNameAndValue() throws Exception {
        assertEquals("{\"a\":1}", writeValue(g -> {
            g.writeStartObject();
            g.writeFieldName("a");
            g.writeNumber(1);
            g.writeEndObject();
        }));
    }

    @Test
    public void testSecondFieldAddsComma() throws Exception {
        assertEquals("{\"a\":1,\"b\":2}", writeValue(g -> {
            g.writeStartObject();
            g.writeFieldName("a");
            g.writeNumber(1);
            g.writeFieldName("b");
            g.writeNumber(2);
            g.writeEndObject();
        }));
    }

    @Test
    public void testEmptyArrayStructuralOutput() throws Exception {
        assertEquals("[]", writeValue(g -> {
            g.writeStartArray();
            g.writeEndArray();
        }));
    }

    @Test
    public void testEmptyObjectStructuralOutput() throws Exception {
        assertEquals("{}", writeValue(g -> {
            g.writeStartObject();
            g.writeEndObject();
        }));
    }

    @Test
    public void testStringEscapesQuoteAndBackslash() throws Exception {
        assertEquals("\"a\\\"b\\\\c\"", writeValue(g -> g.writeString("a\"b\\c")));
    }

    @Test
    public void testNullStringWritesJsonNull() throws Exception {
        assertEquals("null", writeValue(g -> g.writeString((String) null)));
    }

    @Test
    public void testRawUtf8StringIsQuotedWithoutEscaping() throws Exception {
        byte[] bytes = "a\"b".getBytes("UTF-8");
        assertEquals("\"a\"b\"", writeValue(g -> g.writeRawUTF8String(bytes, 0, bytes.length)));
    }

    @Test
    public void testUtf8StringEscapesQuote() throws Exception {
        byte[] bytes = "a\"b".getBytes("UTF-8");
        assertEquals("\"a\\\"b\"", writeValue(g -> g.writeUTF8String(bytes, 0, bytes.length)));
    }

    @Test
    public void testRawTextHasNoJsonQuoting() throws Exception {
        assertEquals("raw", writeValue(g -> g.writeRaw("raw")));
    }

    @Test
    public void testRawValueParticipatesInArray() throws Exception {
        assertEquals("[true]", writeValue(g -> {
            g.writeStartArray();
            g.writeRawValue(new SerializedString("true"));
            g.writeEndArray();
        }));
    }

    @Test
    public void testBinaryEncodesSingleByte() throws Exception {
        assertEquals("\"AQ==\"", writeValue(g ->
            g.writeBinary(Base64Variants.getDefaultVariant(), new byte[] { 1 }, 0, 1)));
    }

    @Test
    public void testBinaryEncodesTriplet() throws Exception {
        assertEquals("\"AQID\"", writeValue(g ->
            g.writeBinary(Base64Variants.getDefaultVariant(), new byte[] { 1, 2, 3 }, 0, 3)));
    }

    @Test
    public void testShortMaximumValue() throws Exception {
        assertEquals("32767", writeValue(g -> g.writeNumber(Short.MAX_VALUE)));
    }

    @Test
    public void testShortMinimumValue() throws Exception {
        assertEquals("-32768", writeValue(g -> g.writeNumber(Short.MIN_VALUE)));
    }

    @Test
    public void testBooleanTrue() throws Exception {
        assertEquals("true", writeValue(g -> g.writeBoolean(true)));
    }

    @Test
    public void testBooleanFalse() throws Exception {
        assertEquals("false", writeValue(g -> g.writeBoolean(false)));
    }

    @Test
    public void testWriteNull() throws Exception {
        assertEquals("null", writeValue(g -> g.writeNull()));
    }

    @Test
    public void testFlushWritesBufferedBytes() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = generator(out);
        gen.writeRaw("abc");
        gen.flush();
        assertEquals("abc", out.toString("UTF-8"));
        assertEquals(0, gen.getOutputBuffered());
    }

    @Test
    public void testCloseAutoClosesOpenArray() throws Exception {
        assertEquals("[1]", writeValue(g -> {
            g.writeStartArray();
            g.writeNumber(1);
        }));
    }
}
