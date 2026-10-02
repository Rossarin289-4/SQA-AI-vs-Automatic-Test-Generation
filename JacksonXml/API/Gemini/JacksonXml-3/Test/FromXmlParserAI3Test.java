package com.fasterxml.jackson.dataformat.xml.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
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

public class FromXmlParserAI3Test {

    private FromXmlParser createParser(String xml) throws Exception {
        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader(xml));
        XmlMapper mapper = new XmlMapper();
        IOContext ctxt = new IOContext(new BufferRecycler(), mapper, false);
        return new FromXmlParser(ctxt, 0, 0, mapper, sr);
    }

    @Test
    public void testLifeCycleAndCodec() throws Exception {
        FromXmlParser parser = createParser("<root></root>");
        Assert.assertNotNull(parser.version());
        Assert.assertNotNull(parser.getCodec());
        Assert.assertTrue(parser.requiresCustomCodec());

        ObjectCodec newCodec = new XmlMapper();
        parser.setCodec(newCodec);
        Assert.assertEquals(newCodec, parser.getCodec());

        parser.setXMLTextElementName("customValue");
        parser.close();
    }

    @Test
    public void testFormatFeatures() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertEquals(0, parser.getFormatFeatures());

        JsonParser overridden = parser.overrideFormatFeatures(1, 1);
        Assert.assertEquals(parser, overridden);
        Assert.assertEquals(1, parser.getFormatFeatures());
    }

    @Test
    public void testStaxReaderAccess() throws Exception {
        FromXmlParser parser = createParser("<root><item>text</item></root>");
        Assert.assertNotNull(parser.getStaxReader());
    }

    @Test
    public void testGetTextWhenNullToken() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        parser.close();
        Assert.assertNull(parser.getText());
        Assert.assertNull(parser.getTextCharacters());
        Assert.assertEquals(0, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());
        Assert.assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetEmbeddedObject() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertNull(parser.getEmbeddedObject());
    }

    @Test
    public void testGetValueAsStringNull() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        parser.close();
        Assert.assertNull(parser.getValueAsString());
        Assert.assertEquals("default", parser.getValueAsString("default"));
    }

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testBinaryValueInvalidToken() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        parser.getBinaryValue(com.fasterxml.jackson.core.Base64Variants.getDefaultVariant());
    }

    @Test
    public void testNumericAccessorsDefaults() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertNull(parser.getBigIntegerValue());
        Assert.assertNull(parser.getDecimalValue());
        Assert.assertEquals(0.0, parser.getDoubleValue(), 0.0);
        Assert.assertEquals(0.0f, parser.getFloatValue(), 0.0f);
        Assert.assertEquals(0, parser.getIntValue());
        Assert.assertEquals(0L, parser.getLongValue());
        Assert.assertNull(parser.getNumberType());
        Assert.assertNull(parser.getNumberValue());
    }

    @Test
    public void testAddVirtualWrapping() throws Exception {
        FromXmlParser parser = createParser("<root><item>val</item></root>");
        Set<String> wrapNames = new HashSet<String>();
        wrapNames.add("root");
        parser.addVirtualWrapping(wrapNames);
        Assert.assertNotNull(parser.getStaxReader());
    }
}
