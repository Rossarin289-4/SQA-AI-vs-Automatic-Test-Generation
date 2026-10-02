package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderAI5Test {

    @Test
    public void testCopyConstructorCreatesNewRootNameLookup() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        
        XmlSerializerProvider copy = (XmlSerializerProvider) provider.copy();
        
        assertNotNull(copy);
        assertNotSame(provider, copy);
    }

    @Test
    public void testCreateInstance() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        
        SerializationConfig config = null;
        SerializerFactory factory = null;
        
        XmlSerializerProvider instance = (XmlSerializerProvider) provider.createInstance(config, factory);
        
        assertNotNull(instance);
        assertNotSame(provider, instance);
    }
}
