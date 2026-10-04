package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class BeanDeserializerTest {
    @Test
    public void testPlaceholder() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void testNameTransformerPrefixSuffix() throws Exception {
        NameTransformer transformer = NameTransformer.simpleTransformer("pre", "suf");
        assertEquals("preNsuf", transformer.transform("N"));
        assertEquals("N", transformer.reverse("preNsuf"));
    }

    @Test
    public void testNameTransformerRejectsMissingPrefix() throws Exception {
        NameTransformer transformer = NameTransformer.simpleTransformer("pre", "suf");
        assertNull(transformer.reverse("Nsuf"));
    }

    @Test
    public void testNameTransformerEmptyPrefixAndSuffix() throws Exception {
        NameTransformer transformer = NameTransformer.simpleTransformer("", "");
        assertEquals("x", transformer.transform("x"));
        assertEquals("x", transformer.reverse("x"));
    }

    @Test
    public void testTokenBufferEmpty() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        assertNull(buffer.firstToken());
        assertFalse(buffer.isClosed());
    }

    @Test
    public void testTokenBufferWriteObjectTokens() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.writeStartObject();
        buffer.writeFieldName("a");
        buffer.writeString("b");
        buffer.writeEndObject();
        assertEquals(JsonToken.START_OBJECT, buffer.firstToken());
        assertTrue(buffer.toString().contains("a"));
    }

    @Test
    public void testTokenBufferParserReadsScalar() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.writeString("v");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("v", parser.getText());
        parser.close();
    }

    @Test
    public void testTokenBufferClose() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testTokenBufferAppend() throws Exception {
        TokenBuffer first = new TokenBuffer((ObjectCodec) null);
        first.writeString("a");
        TokenBuffer second = new TokenBuffer((ObjectCodec) null);
        second.writeString("b");
        first.append(second);
        JsonParser parser = first.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("a", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("b", parser.getText());
        parser.close();
    }
}
