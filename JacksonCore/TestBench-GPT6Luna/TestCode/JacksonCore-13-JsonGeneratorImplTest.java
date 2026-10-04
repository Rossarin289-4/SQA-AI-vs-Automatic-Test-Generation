package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;

public class JsonGeneratorImplTest {
    @Test
    public void testDefaultHighestEscapedChar() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        assertEquals(0, g.getHighestEscapedChar());
    }

    @Test
    public void testEscapeNonAsciiFeatureSetsLimit() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false),
                JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask(), null,
                new java.io.StringWriter());
        assertEquals(127, g.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestEscapedCharPositive() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        assertSame(g, g.setHighestNonEscapedChar(128));
        assertEquals(128, g.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestEscapedCharMaximum() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        g.setHighestNonEscapedChar(65535);
        assertEquals(65535, g.getHighestEscapedChar());
    }

    @Test
    public void testNegativeHighestEscapedCharResetsToZero() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        g.setHighestNonEscapedChar(-1);
        assertEquals(0, g.getHighestEscapedChar());
    }

    @Test
    public void testEnableQuoteFieldNames() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        assertSame(g, g.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        assertTrue(g.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testDisableQuoteFieldNames() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false),
                JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask(), null,
                new java.io.StringWriter());
        assertSame(g, g.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        assertFalse(g.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testEnableEscapeNonAscii() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        g.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(127, g.getHighestEscapedChar());
    }

    @Test
    public void testDisableQuoteFeatureAfterEnabling() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        g.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        g.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(g.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testNullCharacterEscapesRestoresStandardConfiguration() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        assertSame(g, g.setCharacterEscapes(null));
        assertNull(g.getCharacterEscapes());
    }

    @Test
    public void testRootSeparatorAcceptsNull() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        assertSame(g, g.setRootValueSeparator(null));
    }

    @Test
    public void testWriteStringFieldWritesConfiguredFieldAndValue() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, out);
        g.writeStringField("a", "b");
        g.flush();
        assertEquals("\"a\":\"b\"", out.toString());
    }

    @Test
    public void testWriteStringFieldWithEmptyValue() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, out);
        g.writeStringField("a", "");
        g.flush();
        assertEquals("\"a\":\"\"", out.toString());
    }

    @Test
    public void testWriteStringFieldEscapesQuoteInValue() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, out);
        g.writeStringField("a", "\"");
        g.flush();
        assertEquals("\"a\":\"\\\"\"", out.toString());
    }

    @Test
    public void testVersionMatchesVersionUtilityForConcreteClass() throws Exception {
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, new java.io.StringWriter());
        assertEquals(VersionUtil.versionFor(g.getClass()), g.version());
    }

    @Test
    public void testWriteStringFieldKeepsQuotedFieldNamesAfterFeatureEnable() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false), 0, null, out);
        g.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        g.writeStringField("a", "b");
        g.flush();
        assertEquals("\"a\":\"b\"", out.toString());
    }

    @Test
    public void testWriteStringFieldUsesUnquotedNamesWhenFeatureDisabled() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonGenerator g = new WriterBasedJsonGenerator(
                new IOContext(null, null, false),
                JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask(), null, out);
        g.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        g.writeStringField("a", "b");
        g.flush();
        assertEquals("a:\"b\"", out.toString());
    }
}
