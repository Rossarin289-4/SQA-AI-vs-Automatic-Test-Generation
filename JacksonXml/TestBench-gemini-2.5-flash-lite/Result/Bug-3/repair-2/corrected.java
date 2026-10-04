package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.Location;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.dataformat.xml.PackageVersion;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

// Need to implement the full XMLStreamReader interface for the mock
public class FromXmlParserTest {

    // Dummy XMLStreamReader implementation for testing
    private static class MockXmlStreamReader implements XMLStreamReader {
        private int eventType = START_ELEMENT;
        private String localName = "root";
        private String text = null;
        private List<String> events;
        private int currentIndex = -1;
        private Map<String, String> attributes = new HashMap<>();
        private Object sourceReference;
        private String namespaceURI = null;
        private String prefix = null;
        private String version = "1.0";
        private String encoding = "UTF-8";
        private boolean standalone = false;
        private String characterEncodingScheme = "UTF-8";

        public MockXmlStreamReader(List<String> events, Object sourceReference) {
            this.events = events;
            this.sourceReference = sourceReference;
            // Initialize with a root element if events are provided
            if (!events.isEmpty() && events.get(0).startsWith("<")) {
                this.eventType = START_ELEMENT;
                this.localName = events.get(0).substring(1);
                if (this.localName.endsWith(">")) this.localName = this.localName.substring(0, this.localName.length() -1);
            } else {
                this.eventType = END_DOCUMENT;
            }
        }

        @Override
        public int next() throws XMLStreamException {
            currentIndex++;
            if (currentIndex >= events.size()) {
                eventType = END_DOCUMENT;
                return END_DOCUMENT;
            }
            String event = events.get(currentIndex);
            if (event.startsWith("<")) {
                if (event.equals("</root>")) {
                    eventType = END_ELEMENT;
                    localName = "root";
                } else {
                    eventType = START_ELEMENT;
                    String fullTag = event.substring(1);
                    if (fullTag.endsWith(">")) fullTag = fullTag.substring(0, fullTag.length() - 1);

                    // Basic attribute parsing
                    int attrStart = fullTag.indexOf(' ');
                    if (attrStart > 0) {
                        localName = fullTag.substring(0, attrStart);
                        String attrPart = fullTag.substring(attrStart + 1);
                        String[] attrPairs = attrPart.split(" \""); // Simple split, assumes quoted values
                        for(String pair : attrPairs) {
                            if (!pair.isEmpty()) {
                                String[] kv = pair.split("=", 2);
                                if (kv.length == 2) {
                                    String key = kv[0];
                                    String value = kv[1].replace("\"", "");
                                    attributes.put(key, value);
                                }
                            }
                        }
                    } else {
                        localName = fullTag;
                        attributes.clear();
                    }
                }
            } else {
                eventType = CHARACTERS;
                text = event;
            }
            return eventType;
        }

        @Override public int getEventType() { return eventType; }
        @Override public String getLocalName() { return localName; }
        @Override public String getText() { return text; }
        @Override public int getAttributeCount() { return attributes.size(); }
        @Override public String getAttributeLocalName(int index) { return new ArrayList<>(attributes.keySet()).get(index); }
        @Override public String getAttributeValue(int index) { return new ArrayList<>(attributes.values()).get(index); }
        @Override public Location getLocation() { return new JsonLocation(sourceReference, -1L, -1, -1, currentIndex); }
        @Override public JsonLocation getTokenLocation() { return new JsonLocation(sourceReference, -1L, -1, -1, currentIndex); }
        @Override public JsonLocation getCurrentLocation() { return new JsonLocation(sourceReference, -1L, -1, -1, currentIndex); }
        @Override public String getNamespaceURI() { return namespaceURI; }
        @Override public String getPrefix() { return prefix; }
        @Override public String getVersion() { return version; }
        @Override public String getEncoding() { return encoding; }
        @Override public boolean isStandalone() { return standalone; }
        @Override public String getCharacterEncodingScheme() { return characterEncodingScheme; }
        @Override public Object getProperty(String name) { return null; }

        // Implemented methods to satisfy the interface
        @Override public void close() throws XMLStreamException { /* no-op */ }
        @Override public String getAttributeNamespaceURI(int index) { return null; }
        @Override public String getAttributePrefix(int index) { return null; }
        @Override public String getAttributeLocalName(String prefix, String localName) { return null; }
        @Override public String getNamespaceURI(String prefix) { return null; }
        @Override public Iterator getNamespaces() { return Collections.emptyIterator(); }
        @Override public Map getAttributes() { return attributes; }
        @Override public String getPIData() { return null; }
        @Override public String getPublicId() { return null; }
        @Override public String getSystemId() { return null; }
        @Override public String getNamespaceURI(String localName) { return null; }
        @Override public NamespaceContext getNamespaceContext() { return null; }
        @Override public boolean isDecodingEscaped() { return false; }
        @Override public String getElementText() throws XMLStreamException { return null; }
        @Override public String getAttributeValue(String namespaceURI, String localName) { return null; }
        @Override public String getAttributeValue(String localName) { return null; }
        @Override public String getNamespaceURI(String localName, String prefix) { return null; }
        @Override public NamespaceContext getNamespaceContext(XMLStreamReader reader) { return null; }
        @Override public void setNamespaceContext(NamespaceContext context) {}
        @Override public String getAttributeLocalName(int index, String namespaceURI) { return null; }
        @Override public String getAttributeLocalName(int index, String namespaceURI, String prefix) { return null; }
        @Override public String getAttributeValue(String namespaceURI, String localName, String prefix) { return null; }
        @Override public String getLocalName(String namespaceURI, String localName) { return null; }
        @Override public String getLocalName(String namespaceURI, String localName, String prefix) { return null; }
        @Override public String getNamespaceURI(String prefix, String localName) { return null; }
        @Override public String getPrefix(String namespaceURI) { return null; }
        @Override public String getPrefix(String namespaceURI, String localName) { return null; }
        @Override public boolean isAttributeSpecified(int index) { return false; }
        @Override public boolean isDefaultNamespaceDeclared(String namespaceURI) { return false; }
        @Override public boolean isNamespaceDeclared(String namespaceURI) { return false; }
        @Override public boolean isNamespaceURI(String namespaceURI) { return false; }
        @Override public Iterator getNamespaceURIs() { return Collections.emptyIterator(); }
        @Override public Map getNamespaceURIsMap() { return Collections.emptyMap(); }
        @Override public Map getPrefixes() { return Collections.emptyMap(); }
        @Override public javax.xml.stream.events.XMLEvent asXMLEvent() throws XMLStreamException { return null; }
        @Override public XMLStreamException getException() { return null; }
        @Override public boolean isAttribute(int index, String namespaceURI, String localName) { return false; }
        @Override public boolean isAttribute(int index, String namespaceURI, String prefix, String localName) { return false; }
        @Override public boolean isAttributeName(int index, String namespaceURI, String localName) { return false; }
        @Override public boolean isAttributeName(int index, String namespaceURI, String prefix, String localName) { return false; }
        @Override public boolean isAttributeNamespace(int index, String namespaceURI) { return false; }
        @Override public boolean isAttributeNamespace(int index, String namespaceURI, String prefix) { return false; }
        @Override public boolean isAttributePrefix(int index, String prefix) { return false; }
        @Override public boolean isAttributePrefix(int index, String prefix, String namespaceURI) { return false; }
        @Override public boolean isNamespace(String prefix, String namespaceURI) { return false; }
        @Override public boolean isNamespaceAttribute(int index) { return false; }
        @Override public boolean isNamespaceDeclaration(int index) { return false; }
        @Override public boolean isNamespaceDeclaration(String prefix) { return false; }
        @Override public boolean isNamespaceDeclaration(String namespaceURI) { return false; }
        @Override public boolean isNamespaceDeclaration(String namespaceURI, String prefix) { return false; }
        @Override public boolean isNamespacePrefix(int index, String prefix) { return false; }
        @Override public boolean isNamespacePrefix(int index, String prefix, String namespaceURI) { return false; }
        @Override public boolean isNamespaceURI(String namespaceURI, String prefix) { return false; }
        @Override public boolean isNamespaceURIEqual(int index, String namespaceURI) { return false; }
        @Override public boolean isNamespaceURIEqual(int index, String namespaceURI, String prefix) { return false; }
        @Override public boolean isNamespaceURIEqual(String namespaceURI) { return false; }
        @Override public boolean isNamespaceURIEqual(String namespaceURI, String prefix) { return false; }
        @Override public boolean isNamespaceURIPrefixEqual(int index, String namespaceURI, String prefix) { return false; }
        @Override public boolean isNamespaceURIPrefixEqual(String namespaceURI, String prefix) { return false; }
        @Override public boolean isPrefixNamespace(int index, String prefix) { return false; }
        @Override public boolean isPrefixNamespace(String prefix) { return false; }
        @Override public boolean isPrefixNamespace(String prefix, String namespaceURI) { return false; }
        @Override public boolean isPrefixNamespaceEqual(int index, String prefix) { return false; }
        @Override public boolean isPrefixNamespaceEqual(int index, String prefix, String namespaceURI) { return false; }
        @Override public boolean isPrefixNamespaceEqual(String prefix) { return false; }
        @Override public boolean isPrefixNamespaceEqual(String prefix, String namespaceURI) { return false; }
        @Override public boolean isReservedNamespace(String namespaceURI) { return false; }
        @Override public boolean isReservedNamespace(String namespaceURI, String prefix) { return false; }
        @Override public boolean isXSI_TYPE(int index) { return false; }
        @Override public boolean isXSI_TYPE(String namespaceURI, String prefix, String localName) { return false; }
        @Override public boolean isXSI_TYPE(String namespaceURI, String localName) { return false; }
        @Override public boolean isXSI_TYPE(String localName) { return false; }
        @Override public boolean isXSI_TYPE(XMLStreamReader reader) { return false; }
        @Override public boolean isXSI_TYPE(XMLStreamReader reader, String prefix) { return false; }
        @Override public boolean isXSI_TYPEByNamespaceURI(String namespaceURI) { return false; }
        @Override public boolean isXSI_TYPEByNamespaceURI(String namespaceURI, String prefix) { return false; }
        @Override public boolean isXSI_TYPEByPrefix(String prefix) { return false; }
        @Override public boolean isXSI_TYPEByPrefix(String prefix, String namespaceURI) { return false; }
        @Override public boolean isXSI_TYPEByURI(String namespaceURI) { return false; }
        @Override public boolean isXSI_TYPEByURI(String namespaceURI, String prefix) { return false; }
        @Override public Iterator getNamespacePrefixes() { return Collections.emptyIterator(); }
        @Override public Set getNamespaceURIsFromPrefix(String prefix) { return Collections.emptySet(); }
        @Override public Set getNamespaceURIsFromURI(String namespaceURI) { return Collections.emptySet(); }
        @Override public Set getPrefixesFromNamespaceURI(String namespaceURI) { return Collections.emptySet(); }
        @Override public boolean hasGenericAttribute() { return false; }
        @Override public boolean hasNamespaceAttribute() { return false; }
        @Override public boolean hasNamespacePrefix() { return false; }
        @Override public boolean hasNamespaceURI() { return false; }
        @Override public boolean hasPrefix() { return false; }
        @Override public boolean hasXMLNSAttribute() { return false; }
        @Override public void setLocalName(String name) {}
        @Override public void setNamespaceURI(String uri) {}
        @Override public void setText(String text) {}
        @Override public void setAttribute(String localName, String value) {}
        @Override public void setAttribute(String namespaceURI, String localName, String value) {}
        @Override public void setAttribute(String prefix, String namespaceURI, String localName, String value) {}
        @Override public void setAttributeLocalName(int index, String name) {}
        @Override public void setAttributeNamespaceURI(int index, String namespaceURI) {}
        @Override public void setAttributePrefix(int index, String prefix) {}
        @Override public void setAttributeValue(int index, String value) {}
        @Override public void setAttributeValue(String namespaceURI, String localName, String value) {}
        @Override public void setAttributeValue(String localName, String value) {}
        @Override public void setAttributeValue(String namespaceURI, String localName, String prefix, String value) {}
        @Override public void setNamespaceURI(String prefix, String namespaceURI) {}
        @Override public void setPrefix(String namespaceURI, String prefix) {}
        @Override public void setVersion(String version) {}
        @Override public void setEncoding(String encoding) {}
        @Override public void setStandalone(boolean standalone) {}
        @Override public void setXMLVersion(String version) {}
        @Override public void setXMLDeclaration(String declaration) {}
        @Override public void setXMLProcessingInstruction(String pi) {}
        @Override public void setXMLProcessingInstruction(String target, String data) {}
        @Override public void setXMLDOCTYPE(String doctype) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd) {}
        @Override public void setXMLDOCTYPE(String systemId) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName) {}
        @Override public void setXMLDOCTYPE(String systemId) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName) {}
        @Override public void setXMLDOCTYPE(String systemId, String doctypeName) {}
        @Override public void setXMLDOCTYPE(String systemId, String doctypeName, String rootElementName) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationType) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationValue) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String notationType) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String notationType, String notationValue) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String notationValue) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String notationType) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String notationType, String notationValue) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String notationValue) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName) {}
        @Override public void setXMLDOCTYPE(String systemId, String doctypeName) {}
        @Override public void setXMLDOCTYPE(String systemId, String doctypeName, String rootElementName) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationType, String notationValue, String notationType2) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationValue, String notationType2) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationValue2) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationType2) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset, String doctypeName) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId, String dtd) {}
        @Override public void setXMLDOCTYPE(String publicId, String systemId) {}
        @Override public void setXMLDOCTYPE(String publicId) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationType, String notationValue, String notationType2, String notationValue2) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationValue, String notationType2, String notationValue2) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationValue2, String notationType2) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName, String notationType2) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName, String rootElementName) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset, String doctypeName) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd, String internalSubset) {}
        @Override public void setXMLDOCTYPE(String systemId, String dtd) {}
        @Override public void setXMLDOCTYPE(String systemId) {}
    }

    private FromXmlParser createParser(String xmlContent) throws IOException {
        IOContext ctxt = new IOContext(null, xmlContent, false);
        ObjectCodec codec = new XmlMapper();
        List<String> tokens = parseXmlString(xmlContent);
        XMLStreamReader reader = new MockXmlStreamReader(tokens, xmlContent);
        // Assuming the default features are zero for simplicity in tests
        return new FromXmlParser(ctxt, 0, 0, codec, reader);
    }

    private List<String> parseXmlString(String xml) {
        List<String> tokens = new ArrayList<>();
        Pattern pattern = Pattern.compile("<(/?[^>]+)>|([^<]+)");
        Matcher matcher = pattern.matcher(xml);
        while (matcher.find()) {
            if (matcher.group(1) != null) { // Element tag
                tokens.add("<" + matcher.group(1) + ">");
            } else if (matcher.group(2) != null) { // Text content
                String text = matcher.group(2).trim();
                if (!text.isEmpty()) {
                    tokens.add(text);
                }
            }
        }
        return tokens;
    }

    @Test
    public void testSimpleTextValue() throws Exception {
        FromXmlParser parser = createParser("<root>Hello</root>");
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
        parser.nextToken(); // FIELD_NAME (root)
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("root", parser.getText());
        parser.nextToken(); // VALUE_STRING (Hello)
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());
        assertEquals("Hello", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testEmptyRoot() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
        parser.nextToken(); // FIELD_NAME (root)
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("root", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        assertNull(parser.getText());
    }

    @Test
    public void testRootWithAttribute() throws Exception {
        FromXmlParser parser = createParser("<root attr=\"value\">");
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
        parser.nextToken(); // FIELD_NAME (root)
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("root", parser.getText());
        parser.nextToken(); // FIELD_NAME (attr)
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("attr", parser.getText());
        assertEquals("value", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        assertNull(parser.getText());
    }

    @Test
    public void testNestedElements() throws Exception {
        FromXmlParser parser = createParser("<root><child>value</child></root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (child)
        assertEquals("child", parser.getText());
        parser.nextToken(); // VALUE_STRING (value)
        assertEquals("value", parser.getText());
        parser.nextToken(); // END_OBJECT
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
    }

    @Test
    public void testMultipleAttributes() throws Exception {
        FromXmlParser parser = createParser("<root attr1=\"val1\" attr2=\"val2\">");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        assertEquals("root", parser.getText());
        parser.nextToken(); // FIELD_NAME (attr1)
        assertEquals("attr1", parser.getText());
        assertEquals("val1", parser.getText());
        parser.nextToken(); // FIELD_NAME (attr2)
        assertEquals("attr2", parser.getText());
        assertEquals("val2", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        assertNull(parser.getText());
    }

    @Test
    public void testMixedContent() throws Exception {
        FromXmlParser parser = createParser("<root>Text1<child>Value</child>Text2</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING (Text1)
        assertEquals("Text1", parser.getText());
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (child)
        assertEquals("child", parser.getText());
        parser.nextToken(); // VALUE_STRING (Value)
        assertEquals("Value", parser.getText());
        parser.nextToken(); // END_OBJECT
        parser.nextToken(); // VALUE_STRING (Text2)
        assertEquals("Text2", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
    }

    @Test
    public void testEmptyTextNode() throws Exception {
        FromXmlParser parser = createParser("<root></root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING ("") - _isEmpty logic
        assertEquals("", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
    }

    @Test
    public void testWhitespaceTextNode() throws Exception {
        FromXmlParser parser = createParser("<root>  \t\n </root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING ("") - _isEmpty logic
        assertEquals("", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
    }

    @Test
    public void testTextWithAttributes() throws Exception {
        FromXmlParser parser = createParser("<root attr=\"val\">Text</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // FIELD_NAME (attr)
        assertEquals("attr", parser.getText());
        assertEquals("val", parser.getText());
        parser.nextToken(); // VALUE_STRING (Text)
        assertEquals("Text", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
    }

    @Test
    public void testTextElementAsValue() throws Exception {
        FromXmlParser parser = createParser("<root>SomeText</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING (SomeText) - _mayBeLeaf logic
        assertEquals("SomeText", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
    }

    @Test
    public void testNumericValueAsString() throws Exception {
        FromXmlParser parser = createParser("<root>123</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING
        assertEquals("123", parser.getValueAsString());
    }

    @Test
    public void testNullValue() throws Exception {
        // XML represents nulls implicitly when an element is empty or missing
        FromXmlParser parser = createParser("<root></root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING ("") which _isEmpty handles to become VALUE_NULL
        assertEquals(JsonToken.VALUE_NULL, parser.getCurrentToken());
        assertNull(parser.getText());
        assertNull(parser.getValueAsString(null)); // Check default behavior for null
    }

    @Test
    public void testEmptyArrayElement() throws Exception {
        FromXmlParser parser = createParser("<root><items/></root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // FIELD_NAME (items)
        // When an empty element like <items/> is encountered, it might be treated as an empty object
        // due to the _mayBeLeaf logic and subsequent handling for array elements.
        assertEquals(JsonToken.START_OBJECT, parser.nextToken()); // This should be the implicit START_OBJECT for an empty array item
        assertEquals(JsonToken.END_OBJECT, parser.nextToken()); // This should be the END_OBJECT for the empty array item
        parser.nextToken(); // END_OBJECT (for root)
        assertNull(parser.getText());
    }

    @Test
    public void testConfiguredNameForTextElement() throws Exception {
        FromXmlParser parser = createParser("<root>textValue</root>");
        parser.setXMLTextElementName("value");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // FIELD_NAME (value) - _cfgNameForTextElement is used here
        assertEquals("value", parser.getCurrentName());
        assertEquals("textValue", parser.getText());
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
    }

    @Test
    public void testGetBinaryValue() throws Exception {
        FromXmlParser parser = createParser("<root>SGVsbG8=</root>"); // Base64 for "Hello"
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING
        byte[] binaryData = parser.getBinaryValue(Base64Variants.BASIC);
        assertNotNull(binaryData);
        assertArrayEquals("Hello".getBytes(), binaryData);
    }

    @Test
    public void testNumericValue() throws Exception {
        FromXmlParser parser = createParser("<root>12345</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING
        // These methods return null as the number type is not yet determined or implemented.
        assertNull(parser.getNumberType());
        assertNull(parser.getNumberValue());
        assertNull(parser.getIntValue());
        assertNull(parser.getLongValue());
        assertNull(parser.getDoubleValue());
        assertNull(parser.getFloatValue());
        assertNull(parser.getDecimalValue());
        assertNull(parser.getBigIntegerValue());
    }

    @Test
    public void testGetStaxReader() throws Exception {
        FromXmlParser parser = createParser("<root>data</root>");
        XMLStreamReader staxReader = parser.getStaxReader();
        assertNotNull(staxReader);
        // Verify it's the underlying reader
        assertEquals(XMLStreamConstants.START_ELEMENT, staxReader.next());
        assertEquals("root", staxReader.getLocalName());
    }

    @Test
    public void testAddVirtualWrapping() throws Exception {
        Set<String> namesToWrap = Collections.singleton("items");
        FromXmlParser parser = createParser("<root><items><item>1</item></items></root>");
        parser.addVirtualWrapping(namesToWrap);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // FIELD_NAME (items) - This call should trigger the internal logic for wrapping
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken()); // Current token is FIELD_NAME("items")
        // The repeatedStartElement inside addVirtualWrapping is for the *next* token
        // So, the next token after FIELD_NAME("items") should be START_OBJECT due to wrapping.
        assertEquals(JsonToken.START_OBJECT, parser.nextToken()); // This should be the "repeated" START_OBJECT
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // FIELD_NAME (item)
        assertEquals("item", parser.getCurrentName());
        parser.nextToken(); // VALUE_STRING (1)
        assertEquals("1", parser.getText());
        parser.nextToken(); // END_OBJECT
        parser.nextToken(); // END_OBJECT (for items)
        parser.nextToken(); // END_OBJECT (for root)
        assertNull(parser.getText());
    }

    @Test
    public void testIsExpectedStartArrayToken() throws Exception {
        FromXmlParser parser = createParser("<root><items>1</items><items>2</items></root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)

        // Override current name to "items" which is the next element name to be processed.
        // This is crucial for isExpectedStartArrayToken to correctly identify the context.
        parser.overrideCurrentName("items"); // Simulate that the next START_ELEMENT is "items"

        // Now, if we were expecting an array for "items", we'd call this.
        // It converts the current context from object to array.
        assertTrue(parser.isExpectedStartArrayToken()); // Converts current START_OBJECT context to START_ARRAY
        assertEquals(JsonToken.START_ARRAY, parser.getCurrentToken()); // Token is now START_ARRAY

        // After converting to START_ARRAY, the next token should be the first element within that array.
        // In our case, it's the first "items" tag. The parser should now see it as a FIELD_NAME within the array.
        parser.nextToken(); // FIELD_NAME (items) - The first array element
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("items", parser.getCurrentName());
        assertEquals("1", parser.getText()); // Value of the first "items" element

        // Consume the rest of the XML
        parser.nextToken(); // END_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        parser.nextToken(); // FIELD_NAME (items) - The second "items" element
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("items", parser.getCurrentName());
        assertEquals("2", parser.getText()); // Value of the second "items" element
        parser.nextToken(); // END_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        parser.nextToken(); // END_OBJECT (for root)
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        FromXmlParser parser = createParser("<root>Some Text</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING
        char[] textChars = parser.getTextCharacters();
        assertNotNull(textChars);
        assertArrayEquals("Some Text".toCharArray(), textChars);
    }

    @Test
    public void testGetTextLength() throws Exception {
        FromXmlParser parser = createParser("<root>Hello World</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING
        assertEquals("Hello World".length(), parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        FromXmlParser parser = createParser("<root>Some Data</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING
        assertEquals(0, parser.getTextOffset()); // Always returns 0 for this parser
    }

    @Test
    public void testHasTextCharacters() {
        FromXmlParser parser = new FromXmlParser(null, 0, 0, null, null);
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetEmbeddedObject() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        assertNull(parser.getEmbeddedObject()); // Not supported
    }

    @Test
    public void testClose() throws Exception {
        FromXmlParser parser = createParser("<root>data</root>");
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetParsingContext() throws Exception {
        FromXmlParser parser = createParser("<root><child/></root>");
        XmlReadContext context = parser.getParsingContext();
        assertNotNull(context);
        assertEquals(JsonStreamContext.ROOT, context.getEntryType());

        parser.nextToken(); // START_OBJECT
        context = parser.getParsingContext();
        assertEquals(JsonStreamContext.OBJECT, context.getEntryType());

        parser.nextToken(); // FIELD_NAME (root)
        assertEquals("root", context.getCurrentName());

        parser.nextToken(); // START_OBJECT (for child)
        context = parser.getParsingContext();
        assertEquals(JsonStreamContext.OBJECT, context.getEntryType());

        parser.nextToken(); // FIELD_NAME (child)
        assertEquals("child", context.getCurrentName());

        parser.nextToken(); // END_OBJECT (for child)
        context = parser.getParsingContext();
        assertEquals(JsonStreamContext.OBJECT, context.getEntryType()); // Still 'child' context level, before it pops

        parser.nextToken(); // END_OBJECT (for root)
        context = parser.getParsingContext();
        assertEquals(JsonStreamContext.ROOT, context.getEntryType()); // Back to root
    }

    @Test
    public void testCurrentNameAndOverride() throws Exception {
        FromXmlParser parser = createParser("<root><child>value</child></root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        assertEquals("root", parser.getCurrentName());

        parser.overrideCurrentName("newRootName");
        assertEquals("newRootName", parser.getCurrentName());

        parser.nextToken(); // START_OBJECT (for child)
        parser.nextToken(); // FIELD_NAME (child)
        assertEquals("child", parser.getCurrentName());

        // Test override within a nested context
        parser.overrideCurrentName("newChildName");
        assertEquals("newChildName", parser.getCurrentName());
    }

    @Test
    public void testTokenLocation() throws Exception {
        FromXmlParser parser = createParser("<root>value</root>");
        parser.nextToken(); // START_OBJECT
        JsonLocation loc1 = parser.getCurrentLocation();
        JsonLocation tokLoc1 = parser.getTokenLocation();

        parser.nextToken(); // FIELD_NAME (root)
        JsonLocation loc2 = parser.getCurrentLocation();
        JsonLocation tokLoc2 = parser.getTokenLocation();

        parser.nextToken(); // VALUE_STRING (value)
        JsonLocation loc3 = parser.getCurrentLocation();
        JsonLocation tokLoc3 = parser.getTokenLocation();

        assertNotNull(loc1);
        assertNotNull(tokLoc1);
        assertNotNull(loc2);
        assertNotNull(tokLoc2);
        assertNotNull(loc3);
        assertNotNull(tokLoc3);

        // Check if locations advance. The exact offsets depend on the MockXmlStreamReader,
        // but they should generally increase for subsequent tokens.
        assertTrue(loc2.getByteOffset() >= loc1.getByteOffset());
        assertTrue(tokLoc2.getByteOffset() >= tokLoc1.getByteOffset());
        assertTrue(loc3.getByteOffset() >= loc2.getByteOffset());
        assertTrue(tokLoc3.getByteOffset() >= tokLoc2.getByteOffset());
    }

    @Test
    public void testRequiresCustomCodec() {
        FromXmlParser parser = new FromXmlParser(null, 0, 0, null, null);
        assertTrue(parser.requiresCustomCodec());
    }

    @Test
    public void testGetCodec() {
        XmlMapper mapper = new XmlMapper();
        FromXmlParser parser = new FromXmlParser(null, 0, 0, mapper, null);
        assertEquals(mapper, parser.getCodec());
    }

    @Test
    public void testSetCodec() {
        XmlMapper mapper1 = new XmlMapper();
        XmlMapper mapper2 = new XmlMapper();
        FromXmlParser parser = new FromXmlParser(null, 0, 0, mapper1, null);
        parser.setCodec(mapper2);
        assertEquals(mapper2, parser.getCodec());
    }

    @Test
    public void testVersion() {
        FromXmlParser parser = new FromXmlParser(null, 0, 0, null, null);
        assertEquals(PackageVersion.VERSION, parser.version());
    }

    @Test
    public void testEnableDisableFeatures() {
        FromXmlParser parser = new FromXmlParser(null, 0, 0, null, null);
        assertFalse(parser.isEnabled(FromXmlParser.Feature.AUTO_CLOSE_SOURCE));
        parser.enable(FromXmlParser.Feature.AUTO_CLOSE_SOURCE);
        assertTrue(parser.isEnabled(FromXmlParser.Feature.AUTO_CLOSE_SOURCE));
        parser.disable(FromXmlParser.Feature.AUTO_CLOSE_SOURCE);
        assertFalse(parser.isEnabled(FromXmlParser.Feature.AUTO_CLOSE_SOURCE));
    }

    @Test
    public void testConfigureFeatures() {
        FromXmlParser parser = new FromXmlParser(null, 0, 0, null, null);
        parser.configure(FromXmlParser.Feature.AUTO_CLOSE_SOURCE, true);
        assertTrue(parser.isEnabled(FromXmlParser.Feature.AUTO_CLOSE_SOURCE));
        parser.configure(FromXmlParser.Feature.AUTO_CLOSE_SOURCE, false);
        assertFalse(parser.isEnabled(FromXmlParser.Feature.AUTO_CLOSE_SOURCE));
    }

    @Test
    public void testGetFormatFeatures() {
        // Assume AUTO_CLOSE_SOURCE has mask 1 (this is simplified)
        FromXmlParser parser = new FromXmlParser(null, 0, 1, null, null);
        assertEquals(1, parser.getFormatFeatures());
        parser.enable(FromXmlParser.Feature.AUTO_CLOSE_SOURCE); // Feature is already enabled, mask should remain 1
        assertEquals(1, parser.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeatures() {
        // Assuming AUTO_CLOSE_SOURCE has mask 1.
        FromXmlParser parser = new FromXmlParser(null, 0, 0, null, null); // Initial mask 0
        parser.overrideFormatFeatures(1, 1); // Enable AUTO_CLOSE_SOURCE
        assertEquals(1, parser.getFormatFeatures());
        parser.overrideFormatFeatures(0, 1); // Disable AUTO_CLOSE_SOURCE
        assertEquals(0, parser.getFormatFeatures());
    }
}
