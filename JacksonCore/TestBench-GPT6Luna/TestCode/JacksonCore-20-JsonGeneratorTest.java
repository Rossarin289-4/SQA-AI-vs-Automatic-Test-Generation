package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;

public class JsonGeneratorTest {
    @Test
    public void testFeatureDefaultsAndMasks() throws Exception {
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledByDefault());
        assertFalse(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledByDefault());
        assertEquals(1, JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask());
        assertEquals(1 << JsonGenerator.Feature.IGNORE_UNKNOWN.ordinal(),
                JsonGenerator.Feature.IGNORE_UNKNOWN.getMask());
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledIn(
                JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask()));
        assertFalse(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledIn(0));
    }

    @Test
    public void testCollectDefaults() throws Exception {
        int defaults = JsonGenerator.Feature.collectDefaults();
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledIn(defaults));
        assertTrue(JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(defaults));
        assertFalse(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(defaults));
        assertFalse(JsonGenerator.Feature.IGNORE_UNKNOWN.enabledIn(defaults));
    }

    @Test
    public void testDelegateConfigurationAndOverrides() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        assertEquals(JsonGenerator.Feature.collectDefaults(), g.getFeatureMask());
        g.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(g.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        g.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
        assertTrue(g.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        int mask = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        g.overrideStdFeatures(0, mask);
        assertFalse(g.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        g.overrideStdFeatures(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask(),
                JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask());
        assertTrue(g.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testFormatFeaturesDefault() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(null);
        assertEquals(0, g.getFormatFeatures());
    }

    @Test
    public void testUnsupportedFormatOverride() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        try {
            g.overrideFormatFeatures(1, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDefaultSchemaBehavior() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(null);
        assertNull(g.getSchema());
        assertFalse(g.canUseSchema(null));
    }

    @Test
    public void testPrettyPrinterState() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        assertNull(g.getPrettyPrinter());
        assertSame(g, g.setPrettyPrinter(null));
        assertNull(g.getPrettyPrinter());
    }

    @Test
    public void testDefaultEscapeConfiguration() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(null);
        assertSame(g, g.setHighestNonEscapedChar(127));
        assertEquals(0, g.getHighestEscapedChar());
        assertNull(g.getCharacterEscapes());
        assertSame(g, g.setCharacterEscapes(null));
    }

    @Test
    public void testDefaultCapabilityValues() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(null);
        assertFalse(g.canWriteObjectId());
        assertFalse(g.canWriteTypeId());
        assertFalse(g.canWriteBinaryNatively());
        assertTrue(g.canOmitFields());
        assertFalse(g.canWriteFormattedNumbers());
    }

    @Test
    public void testDefaultOutputAndContextAccessors() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(null);
        assertNull(g.getOutputTarget());
        assertEquals(-1, g.getOutputBuffered());
        assertNull(g.getCurrentValue());
        g.setCurrentValue("ignored");
        assertNull(g.getCurrentValue());
    }

    @Test
    public void testArrayWritingEmptyAndSelectedRange() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeArray(new int[] {4, 7, 9}, 1, 0);
        g.writeArray(new int[] {4, 7, 9}, 1, 2);
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testArrayWritingLastElementBoundary() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeArray(new int[] {4, 7, 9}, 2, 1);
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testArrayWritingRejectsNull() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        try {
            g.writeArray((int[]) null, 0, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testArrayWritingRejectsPastEnd() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        try {
            g.writeArray(new int[] {1}, 0, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testArrayWritingRejectsNegativeOffset() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        try {
            g.writeArray(new int[] {1}, -1, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWriteNumberShortUsesIntegerWrite() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeNumber((short) 32767);
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testWriteFieldIdDelegatesAsDecimalName() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeStartObject();
        g.writeFieldId(0L);
        g.writeNumber(3);
        g.writeEndObject();
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testEmbeddedNullAndUnsupportedObject() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeEmbeddedObject(null);
        try {
            g.writeEmbeddedObject("x");
            fail("expected JsonGenerationException");
        } catch (JsonGenerationException expected) { }
    }

    @Test
    public void testUnsupportedNativeIds() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        try {
            g.writeObjectId("x");
            fail("expected JsonGenerationException");
        } catch (JsonGenerationException expected) { }
        try {
            g.writeObjectRef("x");
            fail("expected JsonGenerationException");
        } catch (JsonGenerationException expected) { }
        try {
            g.writeTypeId("x");
            fail("expected JsonGenerationException");
        } catch (JsonGenerationException expected) { }
    }

    @Test
    public void testConvenienceStringField() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeStartObject();
        g.writeStringField("a", "b");
        g.writeEndObject();
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testSetFeatureMaskClearsAndRestoresDefaults() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        assertSame(g, g.setFeatureMask(0));
        assertEquals(0, g.getFeatureMask());
        assertSame(g, g.setFeatureMask(JsonGenerator.Feature.collectDefaults()));
        assertEquals(JsonGenerator.Feature.collectDefaults(), g.getFeatureMask());
    }

    @Test
    public void testSchemaSetterRejectsNull() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(null);
        try {
            g.setSchema(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testDefaultPrettyPrinterCanBeSelected() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        assertSame(g, g.useDefaultPrettyPrinter());
        assertNotNull(g.getPrettyPrinter());
    }

    @Test
    public void testRootSeparatorUnsupportedByDelegateWithoutGenerator() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        try {
            g.setRootValueSeparator(null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testStructuralArrayWrites() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeStartArray();
        g.writeEndArray();
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testFieldNameAndStringWrites() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeStartObject();
        g.writeFieldName("key");
        g.writeString("value");
        g.writeEndObject();
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testRawUtf8AndUtf8Methods() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        byte[] empty = new byte[0];
        g.writeRawUTF8String(empty, 0, 0);
        g.writeUTF8String(empty, 0, 0);
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testRawAndRawValueMethods() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeRaw("null");
        g.writeRawValue("null");
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testWriteBinaryZeroLength() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeBinary(Base64Variants.getDefaultVariant(), new byte[0], 0, 0);
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testBooleanAndNullWrites() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeBoolean(true);
        g.writeNull();
        assertEquals(0, g.getOutputContext().getEntryCount());
    }

    @Test
    public void testObjectAndTreeWriteNull() throws Exception {
        JsonGenerator g = new JsonGeneratorDelegate(new JsonGeneratorDelegate(null));
        g.writeObject(null);
        g.writeTree(null);
        assertEquals(0, g.getOutputContext().getEntryCount());
    }
}
