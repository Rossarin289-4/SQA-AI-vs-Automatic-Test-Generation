package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import org.codehaus.stax2.XMLStreamWriter2;
import org.codehaus.stax2.ri.Stax2WriterAdapter;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.dataformat.xml.XmlPrettyPrinter;
import com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;

public class ToXmlGeneratorTest {

    // Helper method to create a dummy XMLStreamWriter for testing
    private XMLStreamWriter createDummyXmlWriter() {
        return new DummyXMLStreamWriter();
    }

    // Helper method to create a ToXmlGenerator instance
    private ToXmlGenerator createGenerator(XMLStreamWriter sw) throws IOException {
        IOContext ctxt = new IOContext(null, null, false); // Use a basic IOContext
        ObjectCodec codec = null; // ObjectCodec is not directly testable here
        int stdFeatures = 0;
        int xmlFeatures = 0;
        ToXmlGenerator generator = new ToXmlGenerator(ctxt, stdFeatures, xmlFeatures, codec, sw);
        return generator;
    }

    // Helper method to create a QName
    private QName createQName(String localName) {
        return new QName(localName);
    }

    // Helper method to create a QName with namespace
    private QName createQName(String nsURI, String localName) {
        return new QName(nsURI, localName);
    }

    @Test
    public void testInitGenerator_WriteXmlDeclarationDefault() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        generator.initGenerator();

        assertTrue(((DummyXMLStreamWriter) sw).hasStartDocument);
        assertEquals("UTF-8", ((DummyXMLStreamWriter) sw).encoding);
        assertEquals("1.0", ((DummyXMLStreamWriter) sw).version);
    }

    @Test
    public void testInitGenerator_WriteXmlDeclarationEnabled_NoPrettyPrinter() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        generator.setPrettyPrinter(null); // Ensure no pretty printer is set
        generator.initGenerator();

        assertTrue(((DummyXMLStreamWriter) sw).hasStartDocument);
        assertEquals("UTF-8", ((DummyXMLStreamWriter) sw).encoding);
        assertEquals("1.0", ((DummyXMLStreamWriter) sw).version);
    }

    @Test
    public void testInitGenerator_WriteXml11Enabled() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        generator.initGenerator();

        assertTrue(((DummyXMLStreamWriter) sw).hasStartDocument);
        assertEquals("UTF-8", ((DummyXMLStreamWriter) sw).encoding);
        assertEquals("1.1", ((DummyXMLStreamWriter) sw).version);
    }

    @Test
    public void testInitGenerator_NoDeclarationEnabled() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator();

        assertFalse(((DummyXMLStreamWriter) sw).hasStartDocument);
    }

    @Test
    public void testSetPrettyPrinter_Valid() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        PrettyPrinter pp = new DefaultXmlPrettyPrinter();
        generator.setPrettyPrinter(pp);

        assertNotNull(generator._xmlPrettyPrinter);
        assertTrue(generator._xmlPrettyPrinter instanceof DefaultXmlPrettyPrinter);
    }

    @Test
    public void testSetPrettyPrinter_Null() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.setPrettyPrinter(null);

        assertNull(generator._xmlPrettyPrinter);
    }

    @Test
    public void testGetOutputTarget() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        assertSame(sw, generator.getOutputTarget());
    }

    @Test
    public void testGetOutputBuffered_ReturnsMinusOne() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        assertEquals(-1, generator.getOutputBuffered());
    }

    @Test
    public void testOverrideFormatFeatures_Enable() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);

        int oldFeatures = generator.getFormatFeatures();
        generator.overrideFormatFeatures(ToXmlGenerator.Feature.WRITE_XML_1_1.getMask(), ToXmlGenerator.Feature.WRITE_XML_1_1.getMask());

        assertEquals(oldFeatures | ToXmlGenerator.Feature.WRITE_XML_1_1.getMask(), generator.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeatures_Disable() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);

        int oldFeatures = generator.getFormatFeatures();
        generator.overrideFormatFeatures(0, ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask());

        assertEquals(oldFeatures & ~ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask(), generator.getFormatFeatures());
    }

    @Test
    public void testEnableAndIsEnabled() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        assertFalse(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        assertTrue(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testDisableAndIsEnabled() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        assertTrue(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        generator.disable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        assertFalse(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testConfigure_Enable() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        generator.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        assertTrue(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testConfigure_Disable() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);

        generator.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, false);
        assertFalse(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testCanWriteFormattedNumbers() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        assertTrue(generator.canWriteFormattedNumbers());
    }

    @Test
    public void testInRoot_True() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator(); // Explicitly initialize to set root context

        assertTrue(generator.inRoot());
    }

    @Test
    public void testInRoot_False() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator();
        generator.writeStartObject(); // Moves out of root context

        assertFalse(generator.inRoot());
    }

    @Test
    public void testGetStaxWriter() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        assertEquals(sw, generator.getStaxWriter()); // Should return the original writer
    }

    @Test
    public void testSetNextIsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        generator.setNextIsAttribute(true);
        assertTrue(generator._nextIsAttribute);
        generator.setNextIsAttribute(false);
        assertFalse(generator._nextIsAttribute);
    }

    @Test
    public void testSetNextIsUnwrapped() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        generator.setNextIsUnwrapped(true);
        assertTrue(generator._nextIsUnwrapped);
        generator.setNextIsUnwrapped(false);
        assertFalse(generator._nextIsUnwrapped);
    }

    @Test
    public void testSetNextIsCData() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);

        generator.setNextIsCData(true);
        assertTrue(generator._nextIsCData);
        generator.setNextIsCData(false);
        assertFalse(generator._nextIsCData);
    }

    @Test
    public void testSetNextName() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName name = createQName("test");

        generator.setNextName(name);
        assertSame(name, generator._nextName);
    }

    @Test
    public void testSetNextNameIfMissing_WhenNull() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName name = createQName("test");

        assertTrue(generator.setNextNameIfMissing(name));
        assertSame(name, generator._nextName);
    }

    @Test
    public void testSetNextNameIfMissing_WhenNotNull() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName initialName = createQName("initial");
        QName newName = createQName("new");
        generator.setNextName(initialName);

        assertFalse(generator.setNextNameIfMissing(newName));
        assertSame(initialName, generator._nextName);
    }

    @Test
    public void testStartWrappedValue_WithWrapper() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName wrapperName = createQName("wrapper");
        QName wrappedName = createQName("wrapped");
        generator.initGenerator(); // Initialize to set context

        generator.startWrappedValue(wrapperName, wrappedName);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals(wrapperName.getNamespaceURI(), ((DummyXMLStreamWriter) sw).startElementCalls.get(0).nsURI);
        assertEquals(wrapperName.getLocalPart(), ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertSame(wrappedName, generator._nextName);
    }

    @Test
    public void testStartWrappedValue_WithoutWrapper() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName wrappedName = createQName("wrapped");
        generator.initGenerator(); // Initialize to set context

        generator.startWrappedValue(null, wrappedName);

        assertTrue(((DummyXMLStreamWriter) sw).startElementCalls.isEmpty());
        assertSame(wrappedName, generator._nextName);
    }

    @Test
    public void testFinishWrappedValue_WithWrapper() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName wrapperName = createQName("wrapper");
        QName wrappedName = createQName("wrapped");
        generator.initGenerator(); // Initialize to set context

        generator.finishWrappedValue(wrapperName, wrappedName);

        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testFinishWrappedValue_WithoutWrapper() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName wrappedName = createQName("wrapped");
        generator.initGenerator(); // Initialize to set context

        generator.finishWrappedValue(null, wrappedName);

        assertTrue(((DummyXMLStreamWriter) sw).endElementCalls.isEmpty());
    }

    @Test
    public void testWriteRepeatedFieldName() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName fieldName = createQName("field");
        generator.setNextName(fieldName);
        generator.initGenerator(); // Initialize to set context
        generator.writeStartObject(); // Enter object context

        generator.writeRepeatedFieldName();

        assertTrue(((DummyXMLStreamWriter) sw).writeFieldNameCalled);
        assertEquals("field", ((DummyXMLStreamWriter) sw).fieldName);
    }

    @Test
    public void testWriteFieldName() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator();
        generator.writeStartObject(); // Enter object context

        generator.writeFieldName("testField");

        assertTrue(((DummyXMLStreamWriter) sw).writeFieldNameCalled);
        assertEquals("testField", ((DummyXMLStreamWriter) sw).fieldName);
        assertNotNull(generator._nextName);
        assertEquals("testField", generator._nextName.getLocalPart());
    }

    @Test
    public void testWriteStringField() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator();
        generator.writeStartObject(); // Enter object context

        generator.writeStringField("fieldName", "fieldValue");

        assertTrue(((DummyXMLStreamWriter) sw).writeFieldNameCalled);
        assertEquals("fieldName", ((DummyXMLStreamWriter) sw).fieldName);

        // Check that writeString was called with the value
        assertTrue(((DummyXMLStreamWriter) sw).writeCharactersCalled);
        assertEquals("fieldValue", ((DummyXMLStreamWriter) sw).characterContent);

        // Check that the element was written
        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("fieldName", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteStartArray() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator();
        generator.writeStartArray();

        assertTrue(generator._writeContext.inArray());
        assertTrue(((DummyXMLStreamWriter) sw).writeStartArrayCalled);
    }

    @Test
    public void testWriteEndArray() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator();
        generator.writeStartArray();
        generator.writeEndArray();

        assertFalse(generator._writeContext.inArray());
        assertEquals(1, ((DummyXMLStreamWriter) sw).writeEndArrayCalls.size());
        assertEquals(0, ((DummyXMLStreamWriter) sw).writeEndArrayCalls.get(0).nrOfValues); // 0 values written before end
    }

    @Test
    public void testWriteStartObject() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName name = createQName("root");
        generator.setNextName(name);
        generator.initGenerator();

        generator.writeStartObject();

        assertTrue(generator._writeContext.inObject());
        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("root", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertEquals(1, generator._elementNameStack.size());
        assertSame(name, generator._elementNameStack.peek());
    }

    @Test
    public void testWriteEndObject() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName name = createQName("root");
        generator.setNextName(name);
        generator.initGenerator();
        generator.writeStartObject();

        generator.writeEndObject();

        assertFalse(generator._writeContext.inObject());
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
        // After closing root, element stack should be empty
        assertTrue(generator._elementNameStack.isEmpty());
    }

    @Test
    public void testWriteString_AsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        generator.initGenerator();

        generator.writeString("attrValue");

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeAttributeCalls.size());
        assertEquals("myAttr", ((DummyXMLStreamWriter) sw).writeAttributeCalls.get(0).localName);
        assertEquals("attrValue", ((DummyXMLStreamWriter) sw).writeAttributeCalls.get(0).value);
    }

    @Test
    public void testWriteString_AsElement() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myElem");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeString("elemValue");

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myElem", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeCharactersCalled);
        assertEquals("elemValue", ((DummyXMLStreamWriter) sw).characterContent);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteString_AsCData() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myElem");
        generator.setNextName(elementName);
        generator.setNextIsCData(true);
        generator.initGenerator();

        generator.writeString("cdataValue");

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myElem", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeCDataCalled);
        assertEquals("cdataValue", ((DummyXMLStreamWriter) sw).characterContent);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteString_EmptyString() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myElem");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeString("");

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myElem", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeCharactersCalled);
        assertEquals("", ((DummyXMLStreamWriter) sw).characterContent);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteBoolean_True() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myBool");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeBoolean(true);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myBool", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeBooleanCalled);
        assertTrue(((DummyXMLStreamWriter) sw).booleanValue);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteBoolean_False() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myBool");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeBoolean(false);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myBool", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeBooleanCalled);
        assertFalse(((DummyXMLStreamWriter) sw).booleanValue);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteBoolean_AsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        generator.initGenerator();

        generator.writeBoolean(true);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeBooleanAttributeCalls.size());
        assertEquals("myAttr", ((DummyXMLStreamWriter) sw).writeBooleanAttributeCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeBooleanAttributeCalls.get(0).value);
    }

    @Test
    public void testWriteNull() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myNull");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeNull();

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeEmptyElementCalls.size());
        assertEquals("myNull", ((DummyXMLStreamWriter) sw).writeEmptyElementCalls.get(0).localName);
    }

    @Test
    public void testWriteNull_AsAttribute_DoesNothing() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        generator.initGenerator();

        generator.writeNull(); // Should not write anything for attributes

        assertTrue(((DummyXMLStreamWriter) sw).writeAttributeCalls.isEmpty());
    }

    @Test
    public void testWriteNumber_Int() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myInt");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeNumber(123);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myInt", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeIntCalled);
        assertEquals(123, ((DummyXMLStreamWriter) sw).intValue);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteNumber_Long() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myLong");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeNumber(1234567890123L);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myLong", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeLongCalled);
        assertEquals(1234567890123L, ((DummyXMLStreamWriter) sw).longValue);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteNumber_Double() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myDouble");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeNumber(123.456);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myDouble", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeDoubleCalled);
        assertEquals(123.456, ((DummyXMLStreamWriter) sw).doubleValue, 1e-9);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteNumber_Float() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myFloat");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeNumber(123.456f);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myFloat", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeFloatCalled);
        assertEquals(123.456f, ((DummyXMLStreamWriter) sw).floatValue, 1e-9f);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteNumber_BigDecimal() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myBigDecimal");
        generator.setNextName(elementName);
        BigDecimal value = new BigDecimal("123.4567890123456789");
        generator.initGenerator();

        generator.writeNumber(value);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myBigDecimal", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeDecimalCalled);
        assertEquals(value, ((DummyXMLStreamWriter) sw).bigDecimalValue);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteNumber_BigInteger() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myBigInteger");
        generator.setNextName(elementName);
        BigInteger value = new BigInteger("123456789012345678901234567890");
        generator.initGenerator();

        generator.writeNumber(value);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myBigInteger", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeIntegerCalled);
        assertEquals(value, ((DummyXMLStreamWriter) sw).bigIntegerValue);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteNumber_StringEncoded() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myEncodedNumber");
        generator.setNextName(elementName);
        String encoded = "123.45";
        generator.initGenerator();

        generator.writeNumber(encoded);

        // This method delegates to writeString
        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myEncodedNumber", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeCharactersCalled);
        assertEquals(encoded, ((DummyXMLStreamWriter) sw).characterContent);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testFlush_Enabled() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.enable(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM);
        generator.initGenerator();

        generator.flush();

        assertTrue(((DummyXMLStreamWriter) sw).flushCalled);
    }

    @Test
    public void testFlush_Disabled() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        // FLUSH_PASSED_TO_STREAM is false by default
        generator.initGenerator();

        generator.flush();

        assertFalse(((DummyXMLStreamWriter) sw).flushCalled);
    }

    @Test
    public void testClose_ResourceManaged() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        // Bypass final _ioContext field restriction by using reflection
        java.lang.reflect.Field field = GeneratorBase.class.getDeclaredField("_ioContext");
        field.setAccessible(true);
        field.set(generator, new IOContext(null, null, true));
        generator.initGenerator();
        generator.writeStartObject(); // Ensure some context exists

        generator.close();

        assertTrue(((DummyXMLStreamWriter) sw).closeCompletelyCalled);
        // Bypass final _closed field restriction by using reflection
        java.lang.reflect.Field closedField = GeneratorBase.class.getDeclaredField("_closed");
        closedField.setAccessible(true);
        assertTrue((Boolean) closedField.get(generator));
    }

    @Test
    public void testClose_AutoCloseTargetEnabled() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        // Bypass final _ioContext field restriction by using reflection
        java.lang.reflect.Field field = GeneratorBase.class.getDeclaredField("_ioContext");
        field.setAccessible(true);
        field.set(generator, new IOContext(null, null, false));
        generator.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        generator.initGenerator();
        generator.writeStartObject();

        generator.close();

        assertTrue(((DummyXMLStreamWriter) sw).closeCompletelyCalled);
        // Bypass final _closed field restriction by using reflection
        java.lang.reflect.Field closedField = GeneratorBase.class.getDeclaredField("_closed");
        closedField.setAccessible(true);
        assertTrue((Boolean) closedField.get(generator));
    }

    @Test
    public void testClose_AutoCloseTargetDisabled_ResourceManaged() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        // Bypass final _ioContext field restriction by using reflection
        java.lang.reflect.Field field = GeneratorBase.class.getDeclaredField("_ioContext");
        field.setAccessible(true);
        field.set(generator, new IOContext(null, null, true));
        generator.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        generator.initGenerator();
        generator.writeStartObject();

        generator.close();

        assertTrue(((DummyXMLStreamWriter) sw).closeCompletelyCalled); // Still closes completely if resource managed
        // Bypass final _closed field restriction by using reflection
        java.lang.reflect.Field closedField = GeneratorBase.class.getDeclaredField("_closed");
        closedField.setAccessible(true);
        assertTrue((Boolean) closedField.get(generator));
    }

    @Test
    public void testClose_AutoCloseTargetDisabled_NotResourceManaged() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        // Bypass final _ioContext field restriction by using reflection
        java.lang.reflect.Field field = GeneratorBase.class.getDeclaredField("_ioContext");
        field.setAccessible(true);
        field.set(generator, new IOContext(null, null, false));
        generator.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        generator.initGenerator();
        generator.writeStartObject();

        generator.close();

        assertTrue(((DummyXMLStreamWriter) sw).closeCalled); // Only regular close
        assertFalse(((DummyXMLStreamWriter) sw).closeCompletelyCalled);
        // Bypass final _closed field restriction by using reflection
        java.lang.reflect.Field closedField = GeneratorBase.class.getDeclaredField("_closed");
        closedField.setAccessible(true);
        assertTrue((Boolean) closedField.get(generator));
    }

    @Test
    public void testClose_AutoCloseJsonContent() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.enable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        generator.initGenerator();
        generator.writeStartObject(); // Enter object context

        generator.close();

        assertTrue(((DummyXMLStreamWriter) sw).endElementCalls.size() > 0); // Should have closed the object
        // Bypass final _closed field restriction by using reflection
        java.lang.reflect.Field closedField = GeneratorBase.class.getDeclaredField("_closed");
        closedField.setAccessible(true);
        assertTrue((Boolean) closedField.get(generator));
    }

    @Test
    public void testCollectDefaults() {
        assertEquals(0, ToXmlGenerator.collectDefaults());
    }

    @Test
    public void test_handleStartObject_Internal() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName name = createQName("testElement");
        generator.setNextName(name);
        generator.initGenerator();
        generator.writeStartObject(); // This calls _handleStartObject internally.

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("testElement", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertEquals(1, generator._elementNameStack.size());
    }

    @Test
    public void test_handleEndObject_Internal() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName name = createQName("testElement");
        generator.setNextName(name);
        generator.initGenerator();
        generator.writeStartObject();
        generator.writeEndObject(); // This calls _handleEndObject internally.

        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
        assertTrue(generator._elementNameStack.isEmpty()); // Stack should be empty after closing the root element
    }

    @Test
    public void testWriteRawValue_String() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("rawElem");
        generator.setNextName(elementName);
        generator.initGenerator();

        generator.writeRawValue("some raw text");

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("rawElem", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeRawCalled);
        assertEquals("some raw text", ((DummyXMLStreamWriter) sw).rawContent);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteRawValue_String_WithOffsetAndLength() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("rawElem");
        generator.setNextName(elementName);
        String text = "prefix_some raw text_suffix";
        generator.initGenerator();

        generator.writeRawValue(text, 7, 15); // "some raw text"

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("rawElem", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeRawCalled);
        assertEquals("some raw text", ((DummyXMLStreamWriter) sw).rawContent);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteRawValue_CharArray() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("rawElem");
        generator.setNextName(elementName);
        char[] text = "prefix_some raw text_suffix".toCharArray();
        generator.initGenerator();

        generator.writeRawValue(text, 7, 15); // "some raw text"

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("rawElem", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeRawCharArrayCalled);
        assertEquals("some raw text", new String(((DummyXMLStreamWriter) sw).rawCharArrayContent));
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteRaw_String() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator();

        generator.writeRaw("raw content");

        assertTrue(((DummyXMLStreamWriter) sw).writeRawCalled);
        assertEquals("raw content", ((DummyXMLStreamWriter) sw).rawContent);
    }

    @Test
    public void testWriteRaw_String_WithOffsetAndLength() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        String text = "prefix_raw content_suffix";
        generator.initGenerator();

        generator.writeRaw(text, 7, 13); // "raw content"

        assertTrue(((DummyXMLStreamWriter) sw).writeRawCalled);
        assertEquals("raw content", ((DummyXMLStreamWriter) sw).rawContent);
    }

    @Test
    public void testWriteRaw_CharArray() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        char[] text = "prefix_raw content_suffix".toCharArray();
        generator.initGenerator();

        generator.writeRaw(text, 7, 13); // "raw content"

        assertTrue(((DummyXMLStreamWriter) sw).writeRawCharArrayCalled);
        assertEquals("raw content", new String(((DummyXMLStreamWriter) sw).rawCharArrayContent));
    }

    @Test
    public void testWriteRaw_Char() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        generator.initGenerator();

        generator.writeRaw('a');

        assertTrue(((DummyXMLStreamWriter) sw).writeRawCalled);
        assertEquals("a", ((DummyXMLStreamWriter) sw).rawContent);
    }

    @Test
    public void testWriteBinary_ByteArray() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myBinary");
        generator.setNextName(elementName);
        byte[] data = {1, 2, 3, 4, 5};
        generator.initGenerator();

        generator.writeBinary(null, data, 0, data.length); // Base64Variant is null for simplicity

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myBinary", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeBinaryCalled);
        assertArrayEquals(data, ((DummyXMLStreamWriter) sw).binaryData);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteBinary_InputStream() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myBinaryStream");
        generator.setNextName(elementName);
        byte[] data = {10, 20, 30};
        InputStream is = new ByteArrayInputStream(data);
        generator.initGenerator();

        generator.writeBinary(null, is, data.length); // Base64Variant is null for simplicity

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myBinaryStream", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeBinaryCalled); // writeStreamAsBinary should have called writeBinary
        // Asserting the content is tricky as writeStreamAsBinary processes in chunks.
        // The key is that writeBinaryCalled is true.
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteBinary_Attribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        byte[] data = {1, 2, 3};
        generator.initGenerator();

        generator.writeBinary(null, data, 0, data.length);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeBinaryAttributeCalls.size());
        assertEquals("myAttr", ((DummyXMLStreamWriter) sw).writeBinaryAttributeCalls.get(0).localName);
        assertArrayEquals(data, ((DummyXMLStreamWriter) sw).writeBinaryAttributeCalls.get(0).value);
    }

    @Test
    public void testWriteNumber_Int_AsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myIntAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        generator.initGenerator();

        generator.writeNumber(456);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeIntAttributeCalls.size());
        assertEquals("myIntAttr", ((DummyXMLStreamWriter) sw).writeIntAttributeCalls.get(0).localName);
        assertEquals(456, ((DummyXMLStreamWriter) sw).writeIntAttributeCalls.get(0).value);
    }

    @Test
    public void testWriteNumber_Long_AsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myLongAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        generator.initGenerator();

        generator.writeNumber(9876543210987L);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeLongAttributeCalls.size());
        assertEquals("myLongAttr", ((DummyXMLStreamWriter) sw).writeLongAttributeCalls.get(0).localName);
        assertEquals(9876543210987L, ((DummyXMLStreamWriter) sw).writeLongAttributeCalls.get(0).value);
    }

    @Test
    public void testWriteNumber_Double_AsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myDoubleAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        generator.initGenerator();

        generator.writeNumber(789.123);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeDoubleAttributeCalls.size());
        assertEquals("myDoubleAttr", ((DummyXMLStreamWriter) sw).writeDoubleAttributeCalls.get(0).localName);
        assertEquals(789.123, ((DummyXMLStreamWriter) sw).writeDoubleAttributeCalls.get(0).value, 1e-9);
    }

    @Test
    public void testWriteNumber_Float_AsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myFloatAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        generator.initGenerator();

        generator.writeNumber(789.123f);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeFloatAttributeCalls.size());
        assertEquals("myFloatAttr", ((DummyXMLStreamWriter) sw).writeFloatAttributeCalls.get(0).localName);
        assertEquals(789.123f, ((DummyXMLStreamWriter) sw).writeFloatAttributeCalls.get(0).value, 1e-9f);
    }

    @Test
    public void testWriteNumber_BigDecimal_AsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myDecimalAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        BigDecimal value = new BigDecimal("987.6543210987654321");
        generator.initGenerator();

        generator.writeNumber(value);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeDecimalAttributeCalls.size());
        assertEquals("myDecimalAttr", ((DummyXMLStreamWriter) sw).writeDecimalAttributeCalls.get(0).localName);
        assertEquals(value, ((DummyXMLStreamWriter) sw).writeDecimalAttributeCalls.get(0).value);
    }

    @Test
    public void testWriteNumber_BigInteger_AsAttribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myIntegerAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        BigInteger value = new BigInteger("987654321098765432109876543210");
        generator.initGenerator();

        generator.writeNumber(value);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeIntegerAttributeCalls.size());
        assertEquals("myIntegerAttr", ((DummyXMLStreamWriter) sw).writeIntegerAttributeCalls.get(0).localName);
        assertEquals(value, ((DummyXMLStreamWriter) sw).writeIntegerAttributeCalls.get(0).value);
    }

    @Test
    public void testWriteNumber_BigDecimal_AsPlainString() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName elementName = createQName("myPlainDecimal");
        generator.setNextName(elementName);
        generator.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        BigDecimal value = new BigDecimal("123.4567890123456789");
        generator.initGenerator();

        generator.writeNumber(value);

        assertEquals(1, ((DummyXMLStreamWriter) sw).startElementCalls.size());
        assertEquals("myPlainDecimal", ((DummyXMLStreamWriter) sw).startElementCalls.get(0).localName);
        assertTrue(((DummyXMLStreamWriter) sw).writeCharactersCalled); // Should write as plain string
        assertEquals(value.toPlainString(), ((DummyXMLStreamWriter) sw).characterContent);
        assertEquals(1, ((DummyXMLStreamWriter) sw).endElementCalls.size());
    }

    @Test
    public void testWriteNumber_BigDecimal_AsPlainString_Attribute() throws Exception {
        XMLStreamWriter sw = createDummyXmlWriter();
        ToXmlGenerator generator = createGenerator(sw);
        QName attrName = createQName("myPlainDecimalAttr");
        generator.setNextName(attrName);
        generator.setNextIsAttribute(true);
        generator.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        BigDecimal value = new BigDecimal("987.6543210987654321");
        generator.initGenerator();

        generator.writeNumber(value);

        assertEquals(1, ((DummyXMLStreamWriter) sw).writeAttributeCalls.size());
        assertEquals("myPlainDecimalAttr", ((DummyXMLStreamWriter) sw).writeAttributeCalls.get(0).localName);
        assertEquals(value.toPlainString(), ((DummyXMLStreamWriter) sw).writeAttributeCalls.get(0).value); // Should write as plain string attribute
    }

    // Dummy XMLStreamWriter for testing
    private static class DummyXMLStreamWriter implements XMLStreamWriter2 {
        public boolean hasStartDocument = false;
        public String encoding = null;
        public String version = null;

        public List<ElementInfo> startElementCalls = new ArrayList<>();
        public List<ElementInfo> endElementCalls = new ArrayList<>();
        public List<AttributeCall> writeAttributeCalls = new ArrayList<>();
        public List<BooleanAttributeCall> writeBooleanAttributeCalls = new ArrayList<>();
        public List<ElementInfo> writeEmptyElementCalls = new ArrayList<>();
        public List<IntAttributeCall> writeIntAttributeCalls = new ArrayList<>();
        public List<LongAttributeCall> writeLongAttributeCalls = new ArrayList<>();
        public List<DoubleAttributeCall> writeDoubleAttributeCalls = new ArrayList<>();
        public List<FloatAttributeCall> writeFloatAttributeCalls = new ArrayList<>();
        public List<DecimalAttributeCall> writeDecimalAttributeCalls = new ArrayList<>();
        public List<IntegerAttributeCall> writeIntegerAttributeCalls = new ArrayList<>();
        public List<BinaryAttributeCall> writeBinaryAttributeCalls = new ArrayList<>();

        public boolean writeFieldNameCalled = false;
        public String fieldName = null;

        public boolean writeCharactersCalled = false;
        public String characterContent = null;
        public boolean writeCDataCalled = false;
        public boolean writeBooleanCalled = false;
        public boolean booleanValue = false;
        public boolean writeIntCalled = false;
        public int intValue = 0;
        public boolean writeLongCalled = false;
        public long longValue = 0;
        public boolean writeDoubleCalled = false;
        public double doubleValue = 0.0;
        public boolean writeFloatCalled = false;
        public float floatValue = 0.0f;
        public boolean writeDecimalCalled = false;
        public BigDecimal bigDecimalValue = null;
        public boolean writeIntegerCalled = false;
        public BigInteger bigIntegerValue = null;
        public boolean writeBinaryCalled = false;
        public byte[] binaryData = null;

        public boolean writeRawCalled = false;
        public String rawContent = null;
        public boolean writeRawCharArrayCalled = false;
        public char[] rawCharArrayContent = null;

        public boolean flushCalled = false;
        public boolean closeCalled = false;
        public boolean closeCompletelyCalled = false;

        public List<EndElementInfo> writeEndArrayCalls = new ArrayList<>();
        public boolean writeStartArrayCalled = false;


        @Override
        public void writeStartDocument(String encoding, String version) throws XMLStreamException {
            this.hasStartDocument = true;
            this.encoding = encoding;
            this.version = version;
        }

        @Override
        public void writeStartDocument() throws XMLStreamException {
            writeStartDocument("UTF-8", "1.0");
        }

        @Override
        public void writeEndDocument() throws XMLStreamException { }

        @Override
        public void close() throws XMLStreamException {
            this.closeCalled = true;
        }

        public void closeCompletely() throws XMLStreamException {
            this.closeCompletelyCalled = true;
            close();
        }

        @Override
        public void writeStartElement(String localName) throws XMLStreamException {
            writeStartElement("", localName);
        }

        @Override
        public void writeStartElement(String uri, String localName) throws XMLStreamException {
            startElementCalls.add(new ElementInfo(uri, localName));
        }

        @Override
        public void writeEmptyElement(String localName) throws XMLStreamException {
            writeEmptyElement("", localName);
        }

        @Override
        public void writeEmptyElement(String uri, String localName) throws XMLStreamException {
            writeEmptyElementCalls.add(new ElementInfo(uri, localName));
        }

        @Override
        public void writeEndElement() throws XMLStreamException {
            endElementCalls.add(new ElementInfo("", "")); // Dummy info
        }

        @Override
        public void writeAttribute(String localName, String value) throws XMLStreamException {
            writeAttribute("", localName, value);
        }

        @Override
        public void writeAttribute(String uri, String localName, String value) throws XMLStreamException {
            writeAttributeCalls.add(new AttributeCall(uri, localName, value));
        }

        @Override
        public void writeAttribute(String prefix, String uri, String localName, String value) throws XMLStreamException {
             writeAttributeCalls.add(new AttributeCall(uri, localName, value));
        }

        @Override
        public void writeNamespace(String prefix, String namespaceURI) throws XMLStreamException { }

        @Override
        public void writeEntityRef(String name) throws XMLStreamException { }

        @Override
        public void writeProcessingInstruction(String target) throws XMLStreamException { }

        @Override
        public void writeProcessingInstruction(String target, String data) throws XMLStreamException { }

        @Override
        public void writeComment(String data) throws XMLStreamException { }

        @Override
        public void writeStartDocument(String s) throws XMLStreamException { }

        @Override
        public void writeCharacters(String text) throws XMLStreamException {
            this.writeCharactersCalled = true;
            this.characterContent = text;
        }

        @Override
        public void writeCharacters(char[] text, int offset, int len) throws XMLStreamException {
            this.writeCharactersCalled = true;
            this.characterContent = new String(text, offset, len);
        }

        @Override
        public void writeCData(String data) throws XMLStreamException {
            this.writeCDataCalled = true;
            this.characterContent = data;
        }

        @Override
        public void writeCData(char[] text, int offset, int len) throws XMLStreamException {
            this.writeCDataCalled = true;
            this.characterContent = new String(text, offset, len);
        }

        @Override
        public void writeRaw(String text) throws XMLStreamException {
            this.writeRawCalled = true;
            this.rawContent = text;
        }

        @Override
        public void writeRaw(String text, int offset, int len) throws XMLStreamException {
            this.writeRawCalled = true;
            this.rawContent = text.substring(offset, offset + len);
        }

        @Override
        public void writeRaw(char[] text, int offset, int len) throws XMLStreamException {
            this.writeRawCharArrayCalled = true;
            this.rawCharArrayContent = Arrays.copyOfRange(text, offset, offset + len);
        }

        @Override
        public void writeRaw(char c) throws XMLStreamException {
             writeRaw(String.valueOf(c));
        }

        @Override
        public void writeBinary(byte[] data, int offset, int len) throws XMLStreamException {
            this.writeBinaryCalled = true;
            this.binaryData = Arrays.copyOfRange(data, offset, offset + len);
        }

        @Override
        public void writeBinaryAttribute(String prefix, String uri, String localName, byte[] value) throws XMLStreamException {
            this.writeBinaryAttributeCalls.add(new BinaryAttributeCall(uri, localName, value));
        }

        @Override
        public void writeBoolean(boolean value) throws XMLStreamException {
            this.writeBooleanCalled = true;
            this.booleanValue = value;
        }

        @Override
        public void writeBooleanAttribute(String prefix, String uri, String localName, boolean value) throws XMLStreamException {
            this.writeBooleanAttributeCalls.add(new BooleanAttributeCall(uri, localName, value));
        }

        @Override
        public void writeInt(int value) throws XMLStreamException {
            this.writeIntCalled = true;
            this.intValue = value;
        }

        @Override
        public void writeIntAttribute(String prefix, String uri, String localName, int value) throws XMLStreamException {
             writeIntAttributeCalls.add(new IntAttributeCall(uri, localName, value));
        }

        @Override
        public void writeLong(long value) throws XMLStreamException {
            this.writeLongCalled = true;
            this.longValue = value;
        }

        @Override
        public void writeLongAttribute(String prefix, String uri, String localName, long value) throws XMLStreamException {
            writeLongAttributeCalls.add(new LongAttributeCall(uri, localName, value));
        }

        @Override
        public void writeDouble(double value) throws XMLStreamException {
            this.writeDoubleCalled = true;
            this.doubleValue = value;
        }

        @Override
        public void writeDoubleAttribute(String prefix, String uri, String localName, double value) throws XMLStreamException {
            writeDoubleAttributeCalls.add(new DoubleAttributeCall(uri, localName, value));
        }

        @Override
        public void writeFloat(float value) throws XMLStreamException {
            this.writeFloatCalled = true;
            this.floatValue = value;
        }

        @Override
        public void writeFloatAttribute(String prefix, String uri, String localName, float value) throws XMLStreamException {
            writeFloatAttributeCalls.add(new FloatAttributeCall(uri, localName, value));
        }

        @Override
        public void writeDecimal(BigDecimal value) throws XMLStreamException {
            this.writeDecimalCalled = true;
            this.bigDecimalValue = value;
        }

        @Override
        public void writeDecimalAttribute(String prefix, String uri, String localName, BigDecimal value) throws XMLStreamException {
            writeDecimalAttributeCalls.add(new DecimalAttributeCall(uri, localName, value));
        }

        @Override
        public void writeInteger(BigInteger value) throws XMLStreamException {
            this.writeIntegerCalled = true;
            this.bigIntegerValue = value;
        }

        @Override
        public void writeIntegerAttribute(String prefix, String uri, String localName, BigInteger value) throws XMLStreamException {
            writeIntegerAttributeCalls.add(new IntegerAttributeCall(uri, localName, value));
        }

        @Override
        public void writeNamespace(String prefix, String uri, boolean LumiaCompliant) throws XMLStreamException { }

        @Override
        public void writeStartElement(String prefix, String localName, String uri) throws XMLStreamException {
            startElementCalls.add(new ElementInfo(uri, localName));
        }

        @Override
        public void writeEndElement(String prefix, String localName, String uri) throws XMLStreamException {
            endElementCalls.add(new ElementInfo(uri, localName));
        }

        @Override
        public void writeStartDocument(String prefix, String localName, String uri, String encoding, String version, Boolean standAlone) throws XMLStreamException {
            writeStartDocument(encoding, version);
        }

        @Override
        public void writeStartDocument(String prefix, String localName, String uri, String encoding, String version) throws XMLStreamException {
            writeStartDocument(encoding, version);
        }

        @Override
        public void writeStartDocument(String prefix, String localName, String uri) throws XMLStreamException {
            writeStartDocument();
        }

        @Override
        public void writeAttribute(String prefix, String localName, String uri, String value) throws XMLStreamException {
             writeAttributeCalls.add(new AttributeCall(uri, localName, value));
        }

        @Override
        public void writeIgnorableWhitespace(String text) throws XMLStreamException { }

        @Override
        public void writeIgnorableWhitespace(char[] text, int offset, int len) throws XMLStreamException { }

        @Override
        public void writeString(String value) throws XMLStreamException {
            writeCharacters(value);
        }

        // Implement remaining abstract methods from XMLStreamWriter2
        @Override public void copyEventFromReader(org.codehaus.stax2.XMLStreamReader2 reader, boolean includeNS) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeStartElement(String prefix, String localName, String uri, Boolean LumiaCompliant) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeStartElement(String localName, String uri) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeAttribute(String localName, String uri, String value) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeAttribute(String prefix, String localName, String uri, String value, Boolean LumiaCompliant) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeCharacters(java.io.Reader reader, int len) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeCharacters(java.io.Reader reader) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeCharacters(java.nio.channels.ReadableByteChannel reader, int len) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeCharacters(java.nio.channels.ReadableByteChannel reader) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeCData(java.io.Reader reader, int len) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeCData(java.io.Reader reader) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeCData(java.nio.channels.ReadableByteChannel reader, int len) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeCData(java.nio.channels.ReadableByteChannel reader) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeRawValue(String value) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeRawValue(String value, int offset, int length) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeRawValue(char[] value, int offset, int length) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeRawValue(SerializableString value) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeDTD(String text) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeDTD(String text, String systemId) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeDTD(String text, String systemId, String publicId) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeXmlDeclaration(String encoding, String version, Boolean standAlone) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeXmlDeclaration(String encoding, String version) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeXmlDeclaration() throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeStartDocument(String xmlVersion, String encoding, Boolean standalone) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeStartDocument(String xmlVersion, String encoding) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeStartDocument(String xmlVersion) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeEmptyElement(String prefix, String localName, String uri) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeAttribute(String localName, String value, String type) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinary(byte[] data, int offset, int len, String encoding) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinary(InputStream data, int dataLength, String encoding) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinaryAttribute(String prefix, String uri, String localName, byte[] value, String encoding) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinary(byte[] data, int offset, int len, int mediaType) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinaryAttribute(String prefix, String uri, String localName, byte[] value, int mediaType) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinary(InputStream data, int dataLength, int mediaType) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinary(byte[] data, int offset, int len, String encoding, int mediaType) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinaryAttribute(String prefix, String uri, String localName, byte[] value, String encoding, int mediaType) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeBinary(InputStream data, int dataLength, String encoding, int mediaType) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeStartFragment() throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeEndFragment() throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeXMLDeclaration(String version, String encoding, Boolean standalone) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeXmlDeclaration(String version) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeDTD(String text, String systemId) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }
        @Override public void writeDTD(String text, String systemId, String publicId) throws XMLStreamException { throw new UnsupportedOperationException("Not implemented"); }

        @Override
        public void flush() throws XMLStreamException {
            this.flushCalled = true;
        }

        @Override
        public void writeStartArray() throws XMLStreamException {
            this.writeStartArrayCalled = true;
        }
        @Override
        public void writeEndArray(int nrOfValues) throws XMLStreamException {
            this.writeEndArrayCalls.add(new EndElementInfo(nrOfValues));
        }

        private static class ElementInfo {
            String nsURI;
            String localName;
            ElementInfo(String nsURI, String localName) {
                this.nsURI = nsURI;
                this.localName = localName;
            }
        }

        private static class AttributeCall {
            String uri;
            String localName;
            String value;
            AttributeCall(String uri, String localName, String value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class IntAttributeCall {
            String uri;
            String localName;
            int value;
            IntAttributeCall(String uri, String localName, int value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class LongAttributeCall {
            String uri;
            String localName;
            long value;
            LongAttributeCall(String uri, String localName, long value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class DoubleAttributeCall {
            String uri;
            String localName;
            double value;
            DoubleAttributeCall(String uri, String localName, double value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class FloatAttributeCall {
            String uri;
            String localName;
            float value;
            FloatAttributeCall(String uri, String localName, float value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class DecimalAttributeCall {
            String uri;
            String localName;
            BigDecimal value;
            DecimalAttributeCall(String uri, String localName, BigDecimal value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class IntegerAttributeCall {
            String uri;
            String localName;
            BigInteger value;
            IntegerAttributeCall(String uri, String localName, BigInteger value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class BinaryAttributeCall {
            String uri;
            String localName;
            byte[] value;
            BinaryAttributeCall(String uri, String localName, byte[] value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class BooleanAttributeCall {
            String uri;
            String localName;
            boolean value;
            BooleanAttributeCall(String uri, String localName, boolean value) {
                this.uri = uri;
                this.localName = localName;
                this.value = value;
            }
        }

        private static class EndElementInfo {
            int nrOfValues;
            EndElementInfo(int nrOfValues) {
                this.nrOfValues = nrOfValues;
            }
        }
    }
}
