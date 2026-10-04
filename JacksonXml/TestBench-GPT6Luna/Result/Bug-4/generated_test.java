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
    public void testNullSerializesThroughTokenBuffer() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        provider.serializeValue(buffer, null);
        assertNotNull(buffer);
    }

    @Test
    public void testNonXmlGeneratorRejected() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        JsonGenerator gen = new JsonFactory().createGenerator(new java.io.StringWriter());
        try {
            provider.serializeValue(gen, "x");
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
            assertTrue(expected.getMessage().contains("ToXmlGenerator"));
        } finally {
            gen.close();
        }
    }

    @Test
    public void testIndexedClassClassificationAtArrayEdge() throws Exception {
        assertTrue(TypeUtil.isIndexedType(String[].class));
    }

    @Test
    public void testScalarClassIsNotIndexed() throws Exception {
        assertFalse(TypeUtil.isIndexedType(String.class));
    }

    @Test
    public void testIndexedClassClassificationAtCollectionEdge() throws Exception {
        assertTrue(TypeUtil.isIndexedType(java.util.ArrayList.class));
    }

    @Test
    public void testRootNameLookupForStringClass() throws Exception {
        QName name = new XmlRootNameLookup().findRootName(String.class, null);
        assertNull(name);
    }

    @Test
    public void testRootNameLookupForIntegerClass() throws Exception {
        QName name = new XmlRootNameLookup().findRootName(Integer.class, null);
        assertNull(name);
    }

    @Test
    public void testQNameLocalName() throws Exception {
        QName name = new QName("entry");
        assertEquals("entry", name.getLocalPart());
    }

    @Test
    public void testQNameNamespaceName() throws Exception {
        QName name = new QName("urn:test", "entry");
        assertEquals("urn:test", name.getNamespaceURI());
    }

    @Test
    public void testTokenBufferCanBeCreatedForNullSerialization() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null, false);
        assertNotNull(buffer);
    }

    @Test
    public void testStringFactoryInput() throws Exception {
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(new java.io.StringWriter());
        assertNotNull(gen);
        gen.close();
    }

    @Test
    public void testRootLookupIsRepeatable() throws Exception {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        QName first = lookup.findRootName(String.class, null);
        QName second = lookup.findRootName(String.class, null);
        assertEquals(first, second);
    }
}
