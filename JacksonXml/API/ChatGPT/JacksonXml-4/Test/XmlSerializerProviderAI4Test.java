package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderAI4Test {

    @Test
    public void testRootNameForNullConstant() {
        assertNotNull(XmlSerializerProvider.ROOT_NAME_FOR_NULL);
        assertEquals("null", XmlSerializerProvider.ROOT_NAME_FOR_NULL.getLocalPart());
    }

    @Test
    public void testCreation() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        assertNotNull(provider);
    }
}
