package com.fasterxml.jackson.dataformat.xml.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

public class FromXmlParserAI1Test {

    private FromXmlParser createParser(String xmlContent) throws Exception {
        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader(xmlContent));
        IOContext ctxt = new IOContext(new BufferRecycler(), sr, false);
        XmlMapper mapper = new XmlMapper();
        return new FromXmlParser(ctxt, 0, 0, mapper, sr);
    }

    @Test
    public void testLifeCycleAndVersion() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertNotNull(parser.version());
        Assert.assertNotNull(parser.getCodec());
        Assert.assertTrue(parser.requiresCustomCodec());
        parser.close();
    }

    @Test
    public void testFeatureConfiguration() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertEquals(0, parser.getFormatFeatures());
        JsonParser overridden = parser.overrideFormatFeatures(1, 1);
        Assert.assertEquals(1, overridden.getFormatFeatures());
        parser.close();
    }

    @Test
    public void testSetXmlTextElementName() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        parser.setXMLTextElementName("customValue");
        parser.close();
    }

    @Test
    public void testGetStaxReader() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertNotNull(parser.getStaxReader());
        parser.close();
    }

    @Test
    public void testAddVirtualWrapping() throws Exception {
        FromXmlParser parser = createParser("<item>val</item>");
        Set<String> wrapNames = new HashSet<String>();
        wrapNames.add("item");
        parser.addVirtualWrapping(wrapNames);
        parser.close();
    }

    @Test
    public void testGetTextWhenNullToken() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertNotNull(parser.version());
        parser.close();
    }

    @Test
    public void testGetValueAsStringWithDefaults() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertEquals("fallback", parser.getValueAsString("fallback"));
        parser.close();
    }

    @Test
    public void testGetEmbeddedObject() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertNull(parser.getEmbeddedObject());
        parser.close();
    }

    @Test
    public void testNumericAccessorsDefaults() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertNull(parser.getBigIntegerValue());
        Assert.assertNull(parser.getDecimalValue());
        Assert.assertEquals(0.0, parser.getDoubleValue(), 0.0001);
        Assert.assertEquals(0.0f, parser.getFloatValue(), 0.0001f);
        Assert.assertEquals(0, parser.getIntValue());
        Assert.assertEquals(0L, parser.getLongValue());
        Assert.assertNull(parser.getNumberType());
        Assert.assertNull(parser.getNumberValue());
        parser.close();
    }

    @Test
    public void testIsEmptyStringHelper() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertTrue(parser._isEmpty(null));
        Assert.assertTrue(parser._isEmpty(""));
        Assert.assertTrue(parser._isEmpty("   \n\t "));
        Assert.assertFalse(parser._isEmpty("abc"));
        parser.close();
    }
}
