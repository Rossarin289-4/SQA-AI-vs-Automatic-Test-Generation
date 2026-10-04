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
}





