package com.fasterxml.jackson.core.json;

import org.junit.Test;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserAI9Test {

    @Test
    public void testGetCodecAndSetCodec() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, new StringReader("{}"), null, symbols
        );

        assertNull(parser.getCodec());
        com.fasterxml.jackson.core.ObjectCodec mockCodec = new com.fasterxml.jackson.core.ObjectCodec() {
            @Override public com.fasterxml.jackson.core.Version version() { return null; }
            @Override public <T> T readValue(com.fasterxml.jackson.core.JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override public <T> T readValue(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override public <T> T readValue(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException { return null; }
            @Override public <T> java.util.Iterator<T> readValues(com.fasterxml.jackson.core.JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override public <T> java.util.Iterator<T> readValues(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override public <T> java.util.Iterator<T> readValues(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException { return null; }
            @Override public void writeValue(com.fasterxml.jackson.core.JsonGenerator g, Object value) throws IOException {}
            @Override public <T extends com.fasterxml.jackson.core.TreeNode> T readTree(com.fasterxml.jackson.core.JsonParser p) throws IOException { return null; }
            @Override public void writeTree(com.fasterxml.jackson.core.JsonGenerator g, com.fasterxml.jackson.core.TreeNode tree) throws IOException {}
            @Override public com.fasterxml.jackson.core.TreeNode createObjectNode() { return null; }
            @Override public com.fasterxml.jackson.core.TreeNode createArrayNode() { return null; }
            @Override public com.fasterxml.jackson.core.JsonParser treeAsTokens(com.fasterxml.jackson.core.TreeNode n) { return null; }
            @Override public <T> T treeToValue(com.fasterxml.jackson.core.TreeNode n, Class<T> valueType) throws JsonProcessingException { return null; }
        };

        parser.setCodec(mockCodec);
        assertEquals(mockCodec, parser.getCodec());
    }

    @Test
    public void testReleaseBufferedWithContent() throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        char[] buffer = new char[] { 'a', 'b', 'c', 'd' };
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, null, null, symbols, buffer, 1, 3, false
        );

        CharArrayWriter writer = new CharArrayWriter();
        int released = parser.releaseBuffered(writer);
        assertEquals(2, released);
        assertEquals("bc", writer.toString());
    }

    @Test
    public void testGetInputSource() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader("test");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, reader, null, symbols
        );

        assertEquals(reader, parser.getInputSource());
    }
}
