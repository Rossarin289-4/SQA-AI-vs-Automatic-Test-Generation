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
    private ToXmlGenerator generator() throws Exception {
        StringWriter output = new StringWriter();
        XMLStreamWriter writer = javax.xml.stream.XMLOutputFactory.newFactory()
                .createXMLStreamWriter(output);
        IOContext context = new IOContext(null, output, false);
        return new ToXmlGenerator(context, JsonGenerator.Feature.collectDefaults(),
                0, null, writer);
    }

    @Test
    public void testFeatureDefaults() throws Exception {
        assertEquals(0, ToXmlGenerator.Feature.collectDefaults());
        assertFalse(ToXmlGenerator.Feature.WRITE_XML_DECLARATION.enabledByDefault());
        assertFalse(ToXmlGenerator.Feature.WRITE_XML_1_1.enabledByDefault());
    }

    @Test
    public void testFeatureMasksAndEnabled() throws Exception {
        ToXmlGenerator g = generator();
        assertEquals(1, ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask());
        assertEquals(2, ToXmlGenerator.Feature.WRITE_XML_1_1.getMask());
        g.enable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        assertTrue(g.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
        assertFalse(g.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testConfigureAndDisableFeatures() throws Exception {
        ToXmlGenerator g = generator();
        g.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        assertTrue(g.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        g.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, false);
        assertFalse(g.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testOverrideFormatFeaturesRespectsMask() throws Exception {
        ToXmlGenerator g = generator();
        JsonGenerator result = g.overrideFormatFeatures(3, 1);
        assertSame(g, result);
        assertEquals(1, g.getFormatFeatures());
        g.overrideFormatFeatures(2, 3);
        assertEquals(2, g.getFormatFeatures());
    }

    @Test
    public void testOutputProperties() throws Exception {
        ToXmlGenerator g = generator();
        assertSame(g.getStaxWriter(), g.getOutputTarget());
        assertSame(g.getStaxWriter(), g.getOutputTarget());
        assertEquals(-1, g.getOutputBuffered());
        assertTrue(g.canWriteFormattedNumbers());
    }

    @Test
    public void testInitialRootContextAndFeatureMask() throws Exception {
        ToXmlGenerator g = generator();
        assertTrue(g.inRoot());
        assertEquals(0, g.getFormatFeatures());
    }

    @Test
    public void testSetNextNameIfMissing() throws Exception {
        ToXmlGenerator g = generator();
        QName first = new QName("urn:a", "first");
        QName second = new QName("urn:b", "second");
        assertTrue(g.setNextNameIfMissing(first));
        assertFalse(g.setNextNameIfMissing(second));
        g.writeString("v");
        g.close();
        assertTrue(g.inRoot());
    }

    @Test
    public void testSetNextNameReplacesName() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("old"));
        g.setNextName(new QName("new"));
        g.writeString("value");
        g.close();
        assertTrue(g.inRoot());
    }

    @Test
    public void testWriteFieldNameAndStringField() throws Exception {
        ToXmlGenerator g = generator();
        g.writeStartObject();
        g.writeStringField("first", "one");
        g.writeFieldName("second");
        g.writeString("two");
        g.writeEndObject();
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testStartAndFinishWrappedValue() throws Exception {
        ToXmlGenerator g = generator();
        QName wrapper = new QName("wrap");
        QName item = new QName("item");
        g.startWrappedValue(wrapper, item);
        assertEquals(item.getLocalPart(), item.getLocalPart());
        g.writeString("value");
        g.finishWrappedValue(wrapper, item);
        g.close();
        assertEquals(0, g.getFormatFeatures());
    }

    @Test
    public void testWrappedValueWithoutWrapper() throws Exception {
        ToXmlGenerator g = generator();
        QName item = new QName("item");
        g.startWrappedValue(null, item);
        g.writeString("value");
        g.finishWrappedValue(null, item);
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testRepeatedFieldNameAcceptsValueAfterEachName() throws Exception {
        ToXmlGenerator g = generator();
        g.writeStartObject();
        g.setNextName(new QName("item"));
        g.writeRepeatedFieldName();
        g.writeString("one");
        g.writeRepeatedFieldName();
        g.writeString("two");
        g.writeEndObject();
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testWriteIntegerAndBooleanValues() throws Exception {
        ToXmlGenerator g = generator();
        g.writeStartObject();
        g.writeFieldName("min");
        g.writeNumber(Integer.MIN_VALUE);
        g.writeFieldName("max");
        g.writeNumber(Integer.MAX_VALUE);
        g.writeFieldName("flag");
        g.writeBoolean(true);
        g.writeEndObject();
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testWriteNullValue() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("empty"));
        g.writeNull();
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testAttributeStringAndInteger() throws Exception {
        ToXmlGenerator g = generator();
        g.writeStartObject();
        g.setNextName(new QName("label"));
        g.setNextIsAttribute(true);
        g.writeString("text");
        g.setNextName(new QName("count"));
        g.writeNumber(2147483647);
        g.setNextIsAttribute(true);
        g.writeEndObject();
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testUnwrappedFlagAppliesToOneValue() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("value"));
        g.setNextIsUnwrapped(true);
        g.writeString("first");
        g.setNextName(new QName("value"));
        g.writeString("second");
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testCDataAndCharacterArraySlice() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("cdata"));
        g.setNextIsCData(true);
        g.writeString("inside");
        g.setNextName(new QName("slice"));
        g.writeString("xvaluey".toCharArray(), 1, 5);
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testInitGeneratorWithoutDeclarationIsIdempotent() throws Exception {
        ToXmlGenerator g = generator();
        g.initGenerator();
        g.initGenerator();
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testInitGeneratorWithXmlDeclaration() throws Exception {
        ToXmlGenerator g = generator();
        g.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        g.initGenerator();
        g.setNextName(new QName("root"));
        g.writeString("x");
        g.close();
        assertTrue(g.inRoot());
    }

    @Test
    public void testInitGeneratorXml11TakesPrecedence() throws Exception {
        ToXmlGenerator g = generator();
        g.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        g.enable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        g.initGenerator();
        g.setNextName(new QName("root"));
        g.writeString("x");
        g.close();
        assertTrue(g.inRoot());
    }

    @Test
    public void testArrayContextAndClosing() throws Exception {
        ToXmlGenerator g = generator();
        g.writeStartArray();
        assertFalse(g.inRoot());
        g.writeEndArray();
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testCloseClosesOpenArrayContent() throws Exception {
        ToXmlGenerator g = generator();
        g.writeStartArray();
        g.close();
        assertFalse(g.inRoot());
    }

    @Test
    public void testPrettyPrinterConfigurationRoundTrip() throws Exception {
        ToXmlGenerator g = generator();
        DefaultXmlPrettyPrinter pp = new DefaultXmlPrettyPrinter();
        assertSame(g, g.setPrettyPrinter(pp));
        assertSame(pp, g.getPrettyPrinter());
        g.setPrettyPrinter(null);
        assertNull(g.getPrettyPrinter());
        g.close();
        assertTrue(g.inRoot());
    }

    @Test
    public void testWriteBinarySubrange() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("data"));
        g.writeBinary(Base64Variants.getDefaultVariant(),
                new byte[] { 9, 1, 2, 3, 8 }, 1, 3);
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testFlushAndClose() throws Exception {
        ToXmlGenerator g = generator();
        g.flush();
        assertEquals(-1, g.getOutputBuffered());
        g.close();
    }

    @Test
    public void testDisableFeature() throws Exception {
        ToXmlGenerator g = generator();
        g.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        g.disable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        assertFalse(g.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        assertEquals(0, g.getFormatFeatures());
        g.close();
    }

    @Test
    public void testHandleStartAndEndObjectDirectly() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("entry"));
        g._handleStartObject();
        g._handleEndObject();
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testRawUtf8StringUnsupported() throws Exception {
        ToXmlGenerator g = generator();
        try {
            g.writeRawUTF8String(new byte[] { 65 }, 0, 1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testUtf8StringUnsupported() throws Exception {
        ToXmlGenerator g = generator();
        try {
            g.writeUTF8String(new byte[] { 65 }, 0, 1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testRawValueWithNativeStaxWriter() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("raw"));
        g.writeRawValue("<b/>");
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testRawValueStringSlice() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("raw"));
        g.writeRawValue("x<b/>y", 1, 4);
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testRawValueCharacterSlice() throws Exception {
        ToXmlGenerator g = generator();
        g.setNextName(new QName("raw"));
        g.writeRawValue("x<b/>y".toCharArray(), 1, 4);
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testRawTextWriter() throws Exception {
        ToXmlGenerator g = generator();
        g.writeRaw("text");
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testRawTextWriterSlice() throws Exception {
        ToXmlGenerator g = generator();
        g.writeRaw("xtexty", 1, 4);
        assertTrue(g.inRoot());
        g.close();
    }

    @Test
    public void testWriteTypePrefixWrappedArray() throws Exception {
        ToXmlGenerator g = generator();
        assertTrue(g.inRoot());
        g.close();
    }
}
