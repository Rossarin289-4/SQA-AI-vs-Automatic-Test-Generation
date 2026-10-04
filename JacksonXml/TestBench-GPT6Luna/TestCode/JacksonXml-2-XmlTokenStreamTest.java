package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import javax.xml.stream.*;
import org.codehaus.stax2.XMLStreamLocation2;
import org.codehaus.stax2.XMLStreamReader2;
import org.codehaus.stax2.ri.Stax2ReaderAdapter;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;

public class XmlTokenStreamTest {
    @Test
    public void testInitialElementWithoutAttributes() throws Exception {
        XmlTokenStream stream = stream("<root/>");

        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        assertEquals("root", stream.getLocalName());
        assertEquals("", stream.getNamespaceURI());
        assertFalse(stream.hasAttributes());
    }

    @Test
    public void testConstructorRejectsReaderNotAtStartElement() throws Exception {
        XMLStreamReader reader = reader("<root/>");
        reader.next();
        try {
            new XmlTokenStream(reader, "src");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAttributeNameAndValueTokens() throws Exception {
        XmlTokenStream stream = stream("<root a='v'/>");

        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        assertEquals("a", stream.getLocalName());
        assertEquals("v", stream.getText());
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, stream.next());
        assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        assertEquals("root", stream.getLocalName());
    }

    @Test
    public void testAttributesFlagOnlyOnStartElement() throws Exception {
        XmlTokenStream stream = stream("<root a='v'/>");

        assertTrue(stream.hasAttributes());
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        assertFalse(stream.hasAttributes());
    }

    @Test
    public void testTextThenEndElement() throws Exception {
        XmlTokenStream stream = stream("<root>text</root>");

        assertEquals(XmlTokenStream.XML_TEXT, stream.next());
        assertEquals("text", stream.getText());
        assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        assertEquals("root", stream.getLocalName());
        assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testEmptyElementHasEndElementAndEnd() throws Exception {
        XmlTokenStream stream = stream("<root/>");

        assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testChildElementSequence() throws Exception {
        XmlTokenStream stream = stream("<root><child/></root>");

        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next());
        assertEquals("child", stream.getLocalName());
        assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        assertEquals("child", stream.getLocalName());
        assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        assertEquals("root", stream.getLocalName());
    }

    @Test
    public void testWhitespaceBeforeChildIsIgnored() throws Exception {
        XmlTokenStream stream = stream("<root>  <child/></root>");

        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next());
        assertEquals("child", stream.getLocalName());
    }

    @Test
    public void testNonWhitespaceBeforeChildIsText() throws Exception {
        XmlTokenStream stream = stream("<root>lead<child/></root>");

        assertEquals(XmlTokenStream.XML_TEXT, stream.next());
        assertEquals("lead", stream.getText());
        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next());
        assertEquals("child", stream.getLocalName());
    }

    @Test
    public void testSkipEndElementConsumesMatchingToken() throws Exception {
        XmlTokenStream stream = stream("<root>text</root>");

        assertEquals(XmlTokenStream.XML_TEXT, stream.next());
        stream.skipEndElement();
        assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testSkipEndElementRejectsNonEndToken() throws Exception {
        XmlTokenStream stream = stream("<root><child/></root>");

        try {
            stream.skipEndElement();
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testGetXmlReaderReturnsWrappedReader() throws Exception {
        XmlTokenStream stream = stream("<root/>");

        assertNotNull(stream.getXmlReader());
        assertEquals(XMLStreamConstants.START_ELEMENT, stream.getXmlReader().getEventType());
    }

    @Test
    public void testCurrentLocationCarriesSourceReference() throws Exception {
        XmlTokenStream stream = stream("<root/>");
        JsonLocation location = stream.getCurrentLocation();

        assertEquals("src", location.getSourceRef());
    }

    @Test
    public void testTokenLocationCarriesSourceReference() throws Exception {
        XmlTokenStream stream = stream("<root/>");
        JsonLocation location = stream.getTokenLocation();

        assertEquals("src", location.getSourceRef());
    }

    @Test
    public void testToStringIncludesCurrentElementName() throws Exception {
        XmlTokenStream stream = stream("<root/>");

        assertTrue(stream.toString().contains("name=root"));
    }

    @Test
    public void testNextAfterEndRemainsEnd() throws Exception {
        XmlTokenStream stream = stream("<root/>");

        assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        assertEquals(XmlTokenStream.XML_END, stream.next());
        assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testCloseIsCallable() throws Exception {
        XmlTokenStream stream = stream("<root/>");

        stream.close();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
    }

    @Test
    public void testCloseCompletelyIsCallable() throws Exception {
        XmlTokenStream stream = stream("<root/>");

        stream.closeCompletely();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
    }

    private XMLStreamReader reader(String xml) throws Exception {
        XMLStreamReader reader = XMLInputFactory.newFactory().createXMLStreamReader(
                new java.io.StringReader(xml));
        while (reader.hasNext() && reader.getEventType() != XMLStreamConstants.START_ELEMENT) {
            reader.next();
        }
        return reader;
    }

    private XmlTokenStream stream(String xml) throws Exception {
        return new XmlTokenStream(reader(xml), "src");
    }
}
