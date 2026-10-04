package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;

public class DefaultPrettyPrinterTest {
    @Test
    public void testRootSeparatorDefaultAndNull() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeRootValueSeparator(g);
        pp.withRootSeparator((SerializableString) null).writeRootValueSeparator(g);
        g.close();
        assertEquals(" ", out.toString());
    }

    @Test
    public void testRootSeparatorReplacement() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter().withRootSeparator("||");
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeRootValueSeparator(g);
        g.close();
        assertEquals("||", out.toString());
    }

    @Test
    public void testRootSeparatorEqualValueReturnsSamePrinter() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter().withRootSeparator("x");
        assertSame(pp, pp.withRootSeparator(new SerializedString("x")));
    }

    @Test
    public void testArrayIndentersSetToNullAndWriteArray() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(null);
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeStartArray(g);
        pp.beforeArrayValues(g);
        pp.writeEndArray(g, 0);
        g.close();
        assertEquals("[ ]", out.toString());
    }

    @Test
    public void testObjectIndentersSetToNullAndWriteObject() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(null);
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeStartObject(g);
        pp.beforeObjectEntries(g);
        pp.writeEndObject(g, 0);
        g.close();
        assertEquals("{ }", out.toString());
    }

    @Test
    public void testArrayIndenterMutantAndIdentity() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.NopIndenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        assertNotSame(pp, pp.withArrayIndenter(indenter));
        DefaultPrettyPrinter changed = pp.withArrayIndenter(indenter);
        assertSame(changed, changed.withArrayIndenter(indenter));
    }

    @Test
    public void testObjectIndenterMutantAndIdentity() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.NopIndenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        assertNotSame(pp, pp.withObjectIndenter(indenter));
        DefaultPrettyPrinter changed = pp.withObjectIndenter(indenter);
        assertSame(changed, changed.withObjectIndenter(null));
    }

    @Test
    public void testSpacesMutantsAndIdentity() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        assertSame(pp, pp.withSpacesInObjectEntries());
        DefaultPrettyPrinter noSpaces = pp.withoutSpacesInObjectEntries();
        assertNotSame(pp, noSpaces);
        assertSame(noSpaces, noSpaces.withoutSpacesInObjectEntries());
    }

    @Test
    public void testCustomSeparatorsWithSpaces() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter()
                .withSeparators(new Separators(':', ';', '|'));
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeObjectFieldValueSeparator(g);
        pp.writeObjectEntrySeparator(g);
        pp.writeArrayValueSeparator(g);
        g.close();
        assertEquals(" : ;\n", out.toString());
    }

    @Test
    public void testCustomSeparatorsWithoutSpaces() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter()
                .withoutSpacesInObjectEntries()
                .withSeparators(new Separators('=', ';', '|'));
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeObjectFieldValueSeparator(g);
        g.close();
        assertEquals("=", out.toString());
    }

    @Test
    public void testCreateInstanceIsSeparate() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        assertNotSame(pp, pp.createInstance());
    }

    @Test
    public void testStartObjectAndEmptyEnd() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeStartObject(g);
        pp.writeEndObject(g, 0);
        g.close();
        assertEquals("{ }", out.toString());
    }

    @Test
    public void testNonemptyObjectEnd() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(null);
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeStartObject(g);
        pp.writeEndObject(g, 1);
        g.close();
        assertEquals("{}", out.toString());
    }

    @Test
    public void testStartArrayAndEmptyEnd() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeStartArray(g);
        pp.writeEndArray(g, 0);
        g.close();
        assertEquals("[ ]", out.toString());
    }

    @Test
    public void testNonemptyArrayEnd() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(null);
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        pp.writeStartArray(g);
        pp.writeEndArray(g, 1);
        g.close();
        assertEquals("[]", out.toString());
    }

    @Test
    public void testFixedSpaceIndenter() throws Exception {
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        DefaultPrettyPrinter.FixedSpaceIndenter.instance.writeIndentation(g, 0);
        g.close();
        assertEquals(" ", out.toString());
        assertTrue(DefaultPrettyPrinter.FixedSpaceIndenter.instance.isInline());
    }

    @Test
    public void testNopIndenter() throws Exception {
        StringWriter out = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(out);
        DefaultPrettyPrinter.NopIndenter.instance.writeIndentation(g, 0);
        g.close();
        assertEquals("", out.toString());
        assertTrue(DefaultPrettyPrinter.NopIndenter.instance.isInline());
    }
}
