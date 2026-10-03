package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;

public class FromXmlParserAI3Test {

    @Test
    public void testDefaultTextElementName() {
        assertEquals("", FromXmlParser.DEFAULT_UNNAMED_TEXT_PROPERTY);
    }

    @Test
    public void testFeatureCollectDefaults() {
        int defaults = FromXmlParser.Feature.collectDefaults();
        assertEquals(0, defaults);
    }
}
