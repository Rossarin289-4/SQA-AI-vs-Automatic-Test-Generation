package com.fasterxml.jackson.dataformat.xml.ser;

import javax.xml.namespace.QName;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;
import com.fasterxml.jackson.core.JsonGenerator;

public class XmlSerializerProviderAI5Test {

    @Test
    public void testConstantsAndRootNameForNull() {
        Assert.assertNotNull(XmlSerializerProvider.ROOT_NAME_FOR_NULL);
        Assert.assertEquals("null", XmlSerializerProvider.ROOT_NAME_FOR_NULL.getLocalPart());
    }

    @Test
    public void testConstructorsAndCopy() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider1 = new XmlSerializerProvider(lookup);
        Assert.assertNotNull(provider1);

        XmlSerializerProvider provider2 = (XmlSerializerProvider) provider1.copy();
        Assert.assertNotNull(provider2);

        SerializationConfig config = provider1.getConfig();
        SerializerFactory factory = ((DefaultSerializerProvider) provider1).getSerializerFactory();
        XmlSerializerProvider provider3 = (XmlSerializerProvider) provider1.createInstance(config, factory);
        Assert.assertNotNull(provider3);
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testAsXmlGeneratorWithInvalidGenerator() throws Exception {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        
        JsonGenerator dummyGen = new JsonGenerator() {
            @Override public void version() {}
            @Override public void writeStartArray() {}
            @Override public void writeEndArray() {}
            @Override public void writeStartObject() {}
            @Override public void writeEndObject() {}
            @Override public void writeFieldName(String name) {}
            @Override public void writeFieldName(com.fasterxml.jackson.core.SerializableString name) {}
            @Override public void writeString(String text) {}
            @Override public void writeString(char[] text, int offset, int len) {}
            @Override public void writeString(com.fasterxml.jackson.core.SerializableString text) {}
            @Override public void writeRawUTF8String(byte[] buffer, int offset, int len) {}
            @Override public void writeUTF8String(byte[] text, int offset, int len) {}
            @Override public void writeRaw(String text) {}
            @Override public void writeRaw(String text, int offset, int len) {}
            @Override public void writeRaw(char[] text, int offset, int len) {}
            @Override public void writeRaw(char c) {}
            @Override public void writeRawValue(String text) {}
            @Override public void writeRawValue(String text, int offset, int len) {}
            @Override public void writeRawValue(char[] text, int offset, int len) {}
            @Override public void writeBinary(com.fasterxml.jackson.core.Base64Variant bva, byte[] data, int offset, int len) {}
            @Override public void writeBoolean(boolean state) {}
            @Override public void writeNull() {}
            @Override public void writeNumber(int v) {}
            @Override public void writeNumber(long v) {}
            @Override public void writeNumber(java.math.BigInteger v) {}
            @Override public void writeNumber(double v) {}
            @Override public void writeNumber(float v) {}
            @Override public void writeNumber(java.math.BigDecimal v) {}
            @Override public void writeNumber(String encodedValue) {}
            @Override public void writeTree(com.fasterxml.jackson.core.TreeNode rootNode) {}
            @Override public com.fasterxml.jackson.core.JsonStreamContext getOutputContext() { return null; }
            @Override public void flush() {}
            @Override public boolean isClosed() { return false; }
            @Override public void close() {}
            @Override public com.fasterxml.jackson.core.ObjectCodec getCodec() { return null; }
            @Override public void setCodec(com.fasterxml.jackson.core.ObjectCodec oc) {}
            @Override public JsonGenerator enable(Feature f) { return this; }
            @Override public JsonGenerator disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonGenerator setFeatureMask(int mask) { return this; }
        };

        provider.serializeValue(dummyGen, "test");
    }

    @Test
    public void testAsXmlGeneratorWithTokenBuffer() throws Exception {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        
        TokenBuffer tb = new TokenBuffer(null, false);
        provider.serializeValue(tb, null);
        Assert.assertNotNull(tb);
        tb.close();
    }

    @Test
    public void testWrapAsIOEWithIOException() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        
        java.io.IOException original = new java.io.IOException("Test IO error");
        java.io.IOException wrapped = provider._wrapAsIOE(null, original);
        Assert.assertSame(original, wrapped);
    }

    @Test
    public void testWrapAsIOEWithRuntimeException() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        
        RuntimeException original = new RuntimeException("Test runtime error");
        java.io.IOException wrapped = provider._wrapAsIOE(null, original);
        Assert.assertNotNull(wrapped);
        Assert.assertTrue(wrapped instanceof com.fasterxml.jackson.databind.JsonMappingException);
        Assert.assertEquals("Test runtime error", wrapped.getMessage());
    }

    @Test
    public void testWrapAsIOEWithNullMessageException() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        
        RuntimeException original = new NullPointerException();
        java.io.IOException wrapped = provider._wrapAsIOE(null, original);
        Assert.assertNotNull(wrapped);
        Assert.assertTrue(wrapped.getMessage().contains("NullPointerException"));
    }

    @Test
    public void testRootNameFromConfigWithNull() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        QName qname = provider._rootNameFromConfig();
        Assert.assertNull(qname);
    }
}
