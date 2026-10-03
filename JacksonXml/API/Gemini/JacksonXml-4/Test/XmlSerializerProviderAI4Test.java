package com.fasterxml.jackson.dataformat.xml.ser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;
import org.junit.Assert;
import org.junit.Test;

public class XmlSerializerProviderAI4Test {

    @Test
    public void testConstructionAndCreateInstance() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        Assert.assertNotNull(provider);

        SerializationConfig config = new XmlMapper().getSerializationConfig();
        SerializerFactory factory = BeanSerializerFactory.instance;
        
        XmlSerializerProvider cloned = (XmlSerializerProvider) provider.createInstance(config, factory);
        Assert.assertNotNull(cloned);
        Assert.assertNotSame(provider, cloned);
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testAsXmlGeneratorWithInvalidGenerator() throws Exception {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        
        com.fasterxml.jackson.core.JsonFactory f = new com.fasterxml.jackson.core.JsonFactory();
        java.io.StringWriter sw = new java.io.StringWriter();
        com.fasterxml.jackson.core.JsonGenerator nonXmlGen = f.createGenerator(sw);
        
        try {
            provider.serializeValue(nonXmlGen, "testValue");
        } finally {
            nonXmlGen.close();
        }
    }

    @Test
    public void testSerializeValueWithXmlGenerator() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        mapper.setSerializerProvider(provider);

        java.io.StringWriter sw = new java.io.StringWriter();
        com.fasterxml.jackson.core.JsonGenerator xgen = mapper.getFactory().createGenerator(sw);
        try {
            provider.serializeValue(xgen, "hello");
            Assert.assertNotNull(sw.toString());
        } finally {
            xgen.close();
        }
    }

    @Test
    public void testSerializeNullValueWithXmlGenerator() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        mapper.setSerializerProvider(provider);

        java.io.StringWriter sw = new java.io.StringWriter();
        com.fasterxml.jackson.core.JsonGenerator xgen = mapper.getFactory().createGenerator(sw);
        try {
            provider.serializeValue(xgen, null);
            Assert.assertNotNull(sw.toString());
        } finally {
            xgen.close();
        }
    }

    @Test
    public void testSerializeValueWithRootTypeAndXmlGenerator() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        mapper.setSerializerProvider(provider);

        java.io.StringWriter sw = new java.io.StringWriter();
        com.fasterxml.jackson.core.JsonGenerator xgen = mapper.getFactory().createGenerator(sw);
        com.fasterxml.jackson.databind.JavaType type = provider.constructType(String.class);
        try {
            provider.serializeValue(xgen, "hello", type);
            Assert.assertNotNull(sw.toString());
        } finally {
            xgen.close();
        }
    }

    @Test
    public void testSerializeValueWithRootTypeSerializerAndXmlGenerator() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        mapper.setSerializerProvider(provider);

        java.io.StringWriter sw = new java.io.StringWriter();
        com.fasterxml.jackson.core.JsonGenerator xgen = mapper.getFactory().createGenerator(sw);
        com.fasterxml.jackson.databind.JavaType type = provider.constructType(String.class);
        com.fasterxml.jackson.databind.JsonSerializer<Object> ser = provider.findTypedValueSerializer(type, true, null);
        try {
            provider.serializeValue(xgen, "hello", type, ser);
            Assert.assertNotNull(sw.toString());
        } finally {
            xgen.close();
        }
    }

    @Test
    public void testSerializeNullWithRootTypeAndXmlGenerator() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        mapper.setSerializerProvider(provider);

        java.io.StringWriter sw = new java.io.StringWriter();
        com.fasterxml.jackson.core.JsonGenerator xgen = mapper.getFactory().createGenerator(sw);
        com.fasterxml.jackson.databind.JavaType type = provider.constructType(String.class);
        try {
            provider.serializeValue(xgen, null, type);
            Assert.assertNotNull(sw.toString());
        } finally {
            xgen.close();
        }
    }
}
