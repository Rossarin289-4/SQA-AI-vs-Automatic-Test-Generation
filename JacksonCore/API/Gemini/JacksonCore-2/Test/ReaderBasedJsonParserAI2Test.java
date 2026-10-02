package com.fasterxml.jackson.core.json;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class ReaderBasedJsonParserAI2Test {

    private ReaderBasedJsonParser createParser(String json) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, br, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader(json);
        return new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
    }

    @Test
    public void testGetCodecAndSetCodec() {
        ReaderBasedJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getCodec());
        ObjectCodec codec = parser.getCodec();
        parser.setCodec(codec);
        Assert.assertEquals(codec, parser.getCodec());
        try {
            parser.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void testGetInputSource() {
        StringReader reader = new StringReader("true");
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, br, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
        Assert.assertEquals(reader, parser.getInputSource());
        try {
            parser.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        ReaderBasedJsonParser parser = createParser("abc");
        StringWriter writer = new StringWriter();
        int released = parser.releaseBuffered(writer);
        Assert.assertTrue(released >= 0);
        parser.close();
    }

    @Test
    public void testGetTextBeforeToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("123");
        Assert.assertNull(parser.getText());
        parser.close();
    }

    @Test
    public void testGetTextValuesAndNumeric() throws IOException {
        ReaderBasedJsonParser parser = createParser("  \"hello\"  ");
        JsonToken t = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_STRING, t);
        Assert.assertEquals("hello", parser.getText());
        Assert.assertEquals("hello", parser.getValueAsString());
        Assert.assertEquals("hello", parser.getValueAsString("default"));
        
        char[] chars = parser.getTextCharacters();
        Assert.assertNotNull(chars);
        Assert.assertTrue(parser.getTextLength() > 0);
        parser.close();
    }

    @Test
    public void testGetTextNumericFallback() throws IOException {
        ReaderBasedJsonParser parser = createParser("12345");
        JsonToken t = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        Assert.assertEquals("12345", parser.getText());
        Assert.assertNotNull(parser.getTextCharacters());
        Assert.assertEquals(5, parser.getTextLength());
        parser.close();
    }

    @Test
    public void testGetTextForBooleanAndNull() throws IOException {
        ReaderBasedJsonParser parser = createParser("true");
        JsonToken t = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_TRUE, t);
        Assert.assertEquals("true", parser.getText());
        Assert.assertNotNull(parser.getTextCharacters());
        parser.close();
    }

    @Test
    public void testDecodeEscapedBasic() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\n\\t\\r\\f\\b\\\\\\/\\\"\"");
        JsonToken t = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_STRING, t);
        Assert.assertEquals("\n\t\r\f\b\\/\"", parser.getText());
        parser.close();
    }

    @Test
    public void testDecodeEscapedUnicode() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\u0041\\u0042\"");
        JsonToken t = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_STRING, t);
        Assert.assertEquals("AB", parser.getText());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testDecodeEscapedInvalidHex() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\u004G\"");
        parser.nextToken();
        parser.getText();
    }

    @Test
    public void testMatchToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("null");
        JsonToken t = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NULL, t);
        parser.close();
    }

    @Test
    public void testDecodeBase64() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"SGVsbG8=\"");
        parser.nextToken();
        byte[] bytes = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertNotNull(bytes);
        Assert.assertEquals("Hello", new String(bytes, "UTF-8"));
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testReportInvalidTokenThrows() throws IOException {
        ReaderBasedJsonParser parser = createParser("nux");
        parser.nextToken();
    }
}
