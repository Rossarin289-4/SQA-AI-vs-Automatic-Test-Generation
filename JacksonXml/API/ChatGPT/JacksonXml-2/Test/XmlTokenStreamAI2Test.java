package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLInputFactory;
import java.io.StringReader;

public class XmlTokenStreamAI2Test {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsNonStartElement() throws Exception {
        XMLInputFactory f = XMLInputFactory.newInstance();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader("<root></root>"));
        // Move to start document or end element so it's not START_ELEMENT
        sr.next();
        new XmlTokenStream(sr, null);
    }

    @Test
    public void testGettersAndInitialState() throws Exception {
        XMLInputFactory f = XMLInputFactory.newInstance();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader("<root attr=\"val\">text</root>"));
        // Points to START_ELEMENT initially
        assertEquals(XMLStreamConstants.START_ELEMENT, sr.getEventType());

        XmlTokenStream stream = new XmlTokenStream(sr, "sourceRef");
        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        assertEquals("root", stream.getLocalName());
        assertTrue(stream.hasAttributes());
        assertEquals(1, stream._attributeCount);
    }

    @Test
    public void testWhitespaceHelper() throws Exception {
        XMLInputFactory f = XMLInputFactory.newInstance();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader("<root/>"));
        XmlTokenStream stream = new XmlTokenStream(sr, null);

        assertTrue(stream._allWs(null));
        assertTrue(stream._allWs("   \n\t "));
        assertFalse(stream._allWs("  a  "));
    }
}
