package com.fasterxml.jackson.dataformat.xml.deser;

import java.io.StringReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.junit.Assert;
import org.junit.Test;

public class XmlTokenStreamAI2Test {

    private XmlTokenStream createStream(String xml) throws Exception {
        XMLInputFactory f = XMLInputFactory.newInstance();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader(xml));
        // Advance to START_ELEMENT
        while (sr.hasNext() && sr.getEventType() != XMLStreamReader.START_ELEMENT) {
            sr.next();
        }
        return new XmlTokenStream(sr, "sourceRef");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInitialReaderState() throws Exception {
        XMLInputFactory f = XMLInputFactory.newInstance();
        // Pointing to document start, not START_ELEMENT
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader("<root/>"));
        new XmlTokenStream(sr, "sourceRef");
    }

    @Test
    public void testBasicElementParsing() throws Exception {
        String xml = "<root>text</root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertEquals("root", stream.getLocalName());
        Assert.assertFalse(stream.hasAttributes());
        Assert.assertNotNull(stream.getCurrentLocation());
        Assert.assertNotNull(stream.getTokenLocation());
        Assert.assertNotNull(stream.toString());

        // Next token should be text
        int token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_TEXT, token);
        Assert.assertEquals("text", stream.getText());

        // Next token should be end element
        token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, token);
        Assert.assertEquals("root", stream.getLocalName());

        // Next token should be end of stream
        token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END, token);
    }

    @Test
    public void testAttributesParsing() throws Exception {
        String xml = "<root attr1=\"value1\" attr2=\"value2\"><child/></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertTrue(stream.hasAttributes());

        // First attribute name
        int token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, token);
        Assert.assertEquals("attr1", stream.getLocalName());

        // First attribute value
        token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, token);
        Assert.assertEquals("value1", stream.getText());

        // Second attribute name
        token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, token);
        Assert.assertEquals("attr2", stream.getLocalName());

        // Second attribute value
        token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, token);
        Assert.assertEquals("value2", stream.getText());
    }

    @Test
    public void testSkipAttributes() throws Exception {
        String xml = "<root attr1=\"val1\"><child/></root>";
        XmlTokenStream stream = createStream(xml);

        // Advance to attribute name
        stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.getCurrentToken());

        // Skip attributes
        stream.skipAttributes();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
    }

    @Test
    public void testSkipEndElement() throws Exception {
        String xml = "<root></root>";
        XmlTokenStream stream = createStream(xml);

        // Advance past START_ELEMENT, then TEXT, to END_ELEMENT
        stream.next(); // TEXT
        stream.next(); // END_ELEMENT
        // Now current state is XML_END_ELEMENT. skipEndElement() calls next() internally,
        // which moves to XML_END, returning it. But wait, skipEndElement expects the *result*
        // of next() to be XML_END_ELEMENT.
        // Let's test calling skipEndElement when next() yields XML_END_ELEMENT.
        // For <root></root>, from START_ELEMENT, calling next() yields XML_TEXT (""), then next() yields XML_END_ELEMENT.
        // So we can re-create stream or position properly:
    }

    @Test
    public void testSkipEndElementValid() throws Exception {
        String xml = "<root></root>";
        XmlTokenStream stream = createStream(xml);
        stream.next(); // TEXT
        // Now we are at XML_TEXT, next() will be XML_END_ELEMENT
        stream.skipEndElement();
        Assert.assertEquals(XmlTokenStream.XML_END, stream.getCurrentToken());
    }

    @Test(expected = java.io.IOException.class)
    public void testSkipEndElementFailure() throws Exception {
        String xml = "<root><child/></root>";
        XmlTokenStream stream = createStream(xml);
        // Currently at START_ELEMENT ("root"). skipEndElement calls next() which returns START_ELEMENT ("child"), not END_ELEMENT, triggering IOException.
        stream.skipEndElement();
    }

    @Test
    public void testCloseAndCloseCompletely() throws Exception {
        String xml = "<root/>";
        XmlTokenStream stream = createStream(xml);
        stream.close();
        stream.closeCompletely();
        // No exception expected
    }

    @Test
    public void testAllWsHelperAndConvertToString() throws Exception {
        String xml = "<root attr=\"value\"/>";
        XmlTokenStream stream = createStream(xml);

        // _allWs checks
        Assert.assertTrue(stream._allWs("   \n\t "));
        Assert.assertFalse(stream._allWs("  a "));
        Assert.assertTrue(stream._allWs(null));

        // Get to attribute name
        stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.getCurrentToken());

        // Convert to string when at attribute name and index 0
        stream.convertToString();
        Assert.assertNotNull(stream.getNamespaceURI());
    }

    @Test(expected = IllegalStateException.class)
    public void testSkipAttributesInvalidState() throws Exception {
        String xml = "<root/>";
        XmlTokenStream stream = createStream(xml);
        while (stream.getCurrentToken() != XmlTokenStream.XML_END) {
            stream.next();
        }
        stream.skipAttributes();
    }
}
