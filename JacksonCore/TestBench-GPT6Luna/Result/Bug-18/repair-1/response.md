```java
package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import java.io.*;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.math.BigInteger;
import com.fasterxml.jackson.core.io.*;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;

public class GeneratorBaseTest {
    @Test
    public void testCurrentValueCanBeSetAndReadBack() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, new ByteArrayOutputStream());
        Object value = new Object();
        g.setCurrentValue(value);
        assertSame(value, g.getCurrentValue());
    }

    @Test
    public void testCurrentValueCanBeCleared() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, new ByteArrayOutputStream());
        g.setCurrentValue("x");
        g.setCurrentValue(null);
        assertNull(g.getCurrentValue());
    }

    @Test
    public void testFeatureEnableAndDisable() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, new ByteArrayOutputStream());
        g.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertTrue(g.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        g.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertFalse(g.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testEnablingEscapeNonAsciiSetsLimit() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, new ByteArrayOutputStream());
        g.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(127, g.getHighestEscapedChar());
    }

    @Test
    public void testDisablingEscapeNonAsciiClearsLimit() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask(), null, new ByteArrayOutputStream());
        g.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(0, g.getHighestEscapedChar());
    }

    @Test
    public void testFeatureMaskReplacesFeatures() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, new ByteArrayOutputStream());
        int mask = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        g.setFeatureMask(mask);
        assertTrue(g.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        assertEquals(mask, g.getFeatureMask());
    }

    @Test
    public void testOverrideStdFeaturesHonorsMask() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, new ByteArrayOutputStream());
        int mask = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        g.overrideStdFeatures(mask, mask);
        assertTrue(g.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        g.overrideStdFeatures(0, mask);
        assertFalse(g.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testWriteStringSerializable() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        g.writeString(new SerializedString("hi"));
        g.close();
        assertEquals("\"hi\"", out.toString("UTF-8"));
    }

    @Test
    public void testBinaryInputKnownLength() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        int count = g.writeBinary(Base64Variants.getDefaultVariant(), new ByteArrayInputStream(new byte[] { 'M' }), 1);
        g.close();
        assertEquals(1, count);
        assertEquals("\"TQ==\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteObjectNullWritesJsonNull() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        g.writeObject(null);
        g.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteTreeNullWritesJsonNull() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        g.writeTree(null);
        g.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testOutputTargetIsSuppliedStream() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        assertSame(out, g.getOutputTarget());
    }

    @Test
    public void testBufferedCountForPendingBytes() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, new ByteArrayOutputStream());
        g.writeRaw("abc");
        assertEquals(3, g.getOutputBuffered());
    }

    @Test
    public void testFieldNameAndObjectStructure() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeEndObject();
        g.close();
        assertEquals("{\"a\":1}", out.toString("UTF-8"));
    }

    @Test
    public void testArrayStructureAndComma() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        g.writeStartArray();
        g.writeNumber(1);
        g.writeNumber(2);
        g.writeEndArray();
        g.close();
        assertEquals("[1,2]", out.toString("UTF-8"));
    }

    @Test
    public void testRawUtf8StringIsQuoted() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        byte[] text = "ok".getBytes("UTF-8");
        g.writeRawUTF8String(text, 0, text.length);
        g.close();
        assertEquals("\"ok\"", out.toString("UTF-8"));
    }

    @Test
    public void testUtf8StringEscapesQuote() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        byte[] text = "\"".getBytes("UTF-8");
        g.writeUTF8String(text, 0, text.length);
        g.close();
        assertEquals("\"\\\"\"", out.toString("UTF-8"));
    }

    @Test
    public void testRawStringIsWrittenUnquoted() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        g.writeRaw("raw");
        g.close();
        assertEquals("raw", out.toString("UTF-8"));
    }

    @Test
    public void testRawValueParticipatesInArraySeparators() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        g.writeStartArray();
        g.writeRawValue("1");
        g.writeRawValue("2");
        g.writeEndArray();
        g.close();
        assertEquals("[1,2]", out.toString("UTF-8"));
    }

    @Test
    public void testFlushWritesBufferedRawOutput() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, out);
        g.writeRaw("abc");
        g.flush();
        assertEquals("abc", out.toString("UTF-8"));
    }

    @Test
    public void testCloseSetsClosedState() throws Exception {
        UTF8JsonGenerator g = new UTF8JsonGenerator(null, 0, null, new ByteArrayOutputStream());
        g.close();
        assertTrue(g.isClosed());
    }
}
```