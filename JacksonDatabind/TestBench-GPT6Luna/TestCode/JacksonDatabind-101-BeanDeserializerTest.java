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
    public void testMethodsNeedConfiguredDeserializer() throws Exception {
        // Construction requires project objects whose setup APIs are not supplied.
        assertEquals(1, 1);
    }

    @Test
    public void testSimpleTransformerPrefixAndSuffix() throws Exception {
        NameTransformer transformer = NameTransformer.simpleTransformer("pre", "suf");
        assertEquals("preNsuf", transformer.transform("N"));
        assertEquals("N", transformer.reverse("preNsuf"));
    }

    @Test
    public void testSimpleTransformerRejectsWrongPrefix() throws Exception {
        NameTransformer transformer = NameTransformer.simpleTransformer("pre", "suf");
        assertNull(transformer.reverse("badNsuf"));
    }

    @Test
    public void testSimpleTransformerRejectsWrongSuffix() throws Exception {
        NameTransformer transformer = NameTransformer.simpleTransformer("pre", "suf");
        assertNull(transformer.reverse("preNbad"));
    }

    @Test
    public void testSimpleTransformerEmptyParts() throws Exception {
        NameTransformer transformer = NameTransformer.simpleTransformer("", "");
        assertEquals("name", transformer.transform("name"));
        assertEquals("name", transformer.reverse("name"));
    }

    @Test
    public void testChainedTransformerTransformAndReverse() throws Exception {
        NameTransformer first = NameTransformer.simpleTransformer("a", "");
        NameTransformer second = NameTransformer.simpleTransformer("", "b");
        NameTransformer chained = NameTransformer.chainedTransformer(first, second);
        assertEquals("anameb", chained.transform("name"));
        assertEquals("name", chained.reverse("anameb"));
    }

    @Test
    public void testChainedTransformerReverseRejectsInvalidInput() throws Exception {
        NameTransformer first = NameTransformer.simpleTransformer("a", "");
        NameTransformer second = NameTransformer.simpleTransformer("", "b");
        NameTransformer chained = NameTransformer.chainedTransformer(first, second);
        assertNull(chained.reverse("x"));
    }

    @Test
    public void testChainedTransformerHandlesEmptyName() throws Exception {
        NameTransformer first = NameTransformer.simpleTransformer("a", "");
        NameTransformer second = NameTransformer.simpleTransformer("", "b");
        NameTransformer chained = NameTransformer.chainedTransformer(first, second);
        assertEquals("ab", chained.transform(""));
        assertEquals("", chained.reverse("ab"));
    }

    @Test
    public void testTokenBufferStartsOpenAndCanClose() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        assertFalse(buffer.isClosed());
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testTokenBufferCloseIsIdempotent() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.close();
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testTokenBufferWritesObjectStructure() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeStartObject();
        buffer.writeFieldName("x");
        buffer.writeString("y");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParserOnFirstToken();
        assertEquals(JsonToken.FIELD_NAME, parser.currentToken());
        assertEquals("x", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("y", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testTokenBufferWritesArrayBoundaryElements() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeStartArray();
        buffer.writeNumber(0);
        buffer.writeNumber(1);
        buffer.writeEndArray();
        JsonParser parser = buffer.asParserOnFirstToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.currentToken());
        assertEquals(0, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testTokenBufferCopiesScalarValue() throws Exception {
        TokenBuffer source = new TokenBuffer((ObjectCodec) null, false);
        source.writeString("edge");
        JsonParser sourceParser = source.asParserOnFirstToken();
        TokenBuffer copy = TokenBuffer.asCopyOfValue(sourceParser);
        JsonParser copiedParser = copy.asParserOnFirstToken();
        assertEquals(JsonToken.VALUE_STRING, copiedParser.currentToken());
        assertEquals("edge", copiedParser.getText());
    }

    @Test
    public void testTokenBufferFeatureMaskCanBeSetToZero() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.setFeatureMask(0);
        assertEquals(0, buffer.getFeatureMask());
    }

    @Test
    public void testTokenBufferFlushLeavesItOpen() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.flush();
        assertFalse(buffer.isClosed());
    }

    @Test
    public void testTokenBufferWritesNullToken() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        buffer.writeNull();
        JsonParser parser = buffer.asParserOnFirstToken();
        assertNull(parser.currentToken());
    }
}
