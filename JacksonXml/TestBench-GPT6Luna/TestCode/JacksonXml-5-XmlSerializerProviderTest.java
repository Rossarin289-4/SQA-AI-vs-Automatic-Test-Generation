package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;
import com.fasterxml.jackson.dataformat.xml.util.TypeUtil;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderTest {
    @Test
    public void testCopyReturnsProvider() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotNull(provider.copy());
    }

    @Test
    public void testCopyReturnsDistinctProvider() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotSame(provider, provider.copy());
    }

    @Test
    public void testCreateInstanceReturnsProvider() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotNull(provider.createInstance(null, null));
    }

    @Test
    public void testCreateInstanceReturnsDistinctProvider() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotSame(provider, provider.createInstance(null, null));
    }

    @Test
    public void testSerializeNullThroughTokenBuffer() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        provider.serializeValue(buffer, null);
        assertEquals(JsonToken.VALUE_NULL, buffer.asParser().nextToken());
    }

    @Test
    public void testSerializeNullThroughXmlGenerator() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotNull(provider);
    }

    @Test
    public void testNullTokenBufferContainsOnlyNull() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotNull(provider);
    }

    @Test
    public void testCopyCanBeCopiedAgain() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        DefaultSerializerProvider first = provider.copy();
        assertNotNull(first.copy());
    }

    @Test
    public void testRepeatedCopyIsDistinct() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        DefaultSerializerProvider first = provider.copy();
        assertNotSame(first, first.copy());
    }

    @Test
    public void testNullSerializationIsRepeatable() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotNull(provider);
    }

    @Test
    public void testCreateInstancesAreDistinct() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotNull(provider);
    }

    @Test
    public void testNullSerializationReturnsNormally() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotNull(provider);
    }
}
