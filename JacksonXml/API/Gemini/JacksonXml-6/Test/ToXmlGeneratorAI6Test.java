package com.fasterxml.jackson.dataformat.xml.ser;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.StringWriter;

public class ToXmlGeneratorAI6Test {

    private ToXmlGenerator createGenerator(StringWriter sw) throws Exception {
        XMLOutputFactory outFactory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = outFactory.createXMLStreamWriter(sw);
        BufferRecycler br = new BufferRecycler();
        IOContext ioCtxt = new IOContext(br, sw, false);
        return new ToXmlGenerator(ioCtxt, 0, 0, null, writer);
    }

    @Test
    public void testFeatureDefaultsAndConfiguration() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        Assert.assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        Assert.assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));

        gen.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        Assert.assertTrue(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));

        gen.disable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        Assert.assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));

        gen.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);
        Assert.assertTrue(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));

        gen.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, false);
        Assert.assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
    }

    @Test
    public void testOverrideFormatFeatures() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        int mask = ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask();
        gen.overrideFormatFeatures(mask, mask);
        Assert.assertTrue(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));

        gen.overrideFormatFeatures(0, mask);
        Assert.assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testGetOutputTargetAndBuffered() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        Assert.assertNotNull(gen.getOutputTarget());
        Assert.assertEquals(-1, gen.getOutputBuffered());
        Assert.assertTrue(gen.canWriteFormattedNumbers());
    }

    @Test
    public void testInRoot() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        Assert.assertTrue(gen.inRoot());
    }

    @Test(expected = IllegalStateException.class)
    public void testHandleMissingNameThrowsException() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.writeNumber(10);
    }

    @Test
    public void testInitGeneratorWithoutDeclaration() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.initGenerator();
        Assert.assertEquals("", sw.toString());
    }

    @Test
    public void testInitGeneratorWithXmlDeclaration() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        gen.initGenerator();
        gen.close();
        String result = sw.toString();
        Assert.assertTrue(result.contains("<?xml"));
    }

    @Test
    public void testInitGeneratorWithXml11() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.enable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        gen.initGenerator();
        gen.close();
        String result = sw.toString();
        Assert.assertTrue(result.contains("version=\"1.1\""));
    }

    @Test
    public void testFeatureCollectDefaults() {
        int defaults = ToXmlGenerator.Feature.collectDefaults();
        Assert.assertEquals(0, defaults);
    }
}
