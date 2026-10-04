package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class JsonWriterTest {
    @Test
    public void testConfigurationDefaultsAndSetters() throws Exception {
        JsonWriter writer = new JsonWriter(new java.io.StringWriter());
        assertFalse(writer.isLenient());
        assertFalse(writer.isHtmlSafe());
        assertTrue(writer.getSerializeNulls());
        writer.setLenient(true);
        writer.setHtmlSafe(true);
        writer.setSerializeNulls(false);
        assertTrue(writer.isLenient());
        assertTrue(writer.isHtmlSafe());
        assertFalse(writer.getSerializeNulls());
    }

    @Test
    public void testCompactObjectWithStringAndNull() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginObject();
        writer.name("a").value("x");
        writer.name("b").nullValue();
        writer.endObject();
        assertEquals("{\"a\":\"x\",\"b\":null}", out.toString());
    }

    @Test
    public void testIndentFormattingAndSeparator() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.setIndent(" ");
        writer.beginObject();
        writer.name("a").beginArray();
        writer.value("x");
        writer.endArray();
        writer.endObject();
        assertEquals("{\n \"a\": [\n  \"x\"\n ]\n}", out.toString());
    }

    @Test
    public void testEmptyIndentRestoresCompactOutput() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.setIndent(" ");
        writer.setIndent("");
        writer.beginObject();
        writer.name("a").value("x");
        writer.endObject();
        assertEquals("{\"a\":\"x\"}", out.toString());
    }

    @Test
    public void testHtmlSafeEscapesSpecialCharacters() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.setHtmlSafe(true);
        writer.beginArray();
        writer.value("<>&='");
        writer.endArray();
        assertEquals("[\"\\u003c\\u003e\\u0026\\u003d\\u0027\"]", out.toString());
    }

    @Test
    public void testEscapesQuoteSlashAndControlCharacters() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginArray();
        writer.value("\"\\\n\t");
        writer.endArray();
        assertEquals("[\"\\\"\\\\\\n\\t\"]", out.toString());
    }

    @Test
    public void testEscapesUnicodeLineSeparators() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginArray();
        writer.value("\u2028\u2029");
        writer.endArray();
        assertEquals("[\"\\u2028\\u2029\"]", out.toString());
    }

    @Test
    public void testOmitNullObjectMemberWhenConfigured() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("a").nullValue();
        writer.name("b").value("x");
        writer.endObject();
        assertEquals("{\"b\":\"x\"}", out.toString());
    }

    @Test
    public void testNullArrayElementIsStillWritten() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.setSerializeNulls(false);
        writer.beginArray();
        writer.nullValue();
        writer.endArray();
        assertEquals("[null]", out.toString());
    }

    @Test
    public void testStrictModeRejectsSecondTopLevelValue() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginArray();
        writer.endArray();
        try {
            writer.beginObject();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals("[]", out.toString());
        }
    }

    @Test
    public void testLenientModeAllowsTopLevelObjectAndArray() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.setLenient(true);
        writer.beginObject();
        writer.endObject();
        writer.beginArray();
        writer.endArray();
        assertEquals("{}[]", out.toString());
    }

    @Test
    public void testUnclosedNameCannotCloseObject() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginObject();
        writer.name("a");
        try {
            writer.endObject();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals("{", out.toString());
        }
    }

    @Test
    public void testJsonValueWritesRawText() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginArray();
        writer.jsonValue("true");
        writer.jsonValue("12");
        writer.endArray();
        assertEquals("[true,12]", out.toString());
    }

    @Test
    public void testJsonValueNullWritesNullLiteral() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginArray();
        writer.jsonValue(null);
        writer.endArray();
        assertEquals("[null]", out.toString());
    }

    @Test
    public void testNullNameThrows() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginObject();
        try {
            writer.name(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals("{", out.toString());
        }
    }

    @Test
    public void testNullWriterThrows() throws Exception {
        try {
            new JsonWriter(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals("out == null", expected.getMessage());
        }
    }

    @Test
    public void testFlushDelegatesToUnderlyingWriter() throws Exception {
        final int[] flushes = {0};
        Writer out = new Writer() {
            public void write(char[] chars, int offset, int length) { }
            public void flush() { flushes[0]++; }
            public void close() { }
        };
        JsonWriter writer = new JsonWriter(out);
        writer.flush();
        assertEquals(1, flushes[0]);
    }

    @Test
    public void testCloseRejectsIncompleteDocument() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginArray();
        try {
            writer.close();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals("[", out.toString());
        }
    }

    @Test
    public void testCloseCompletedDocumentWritesObject() throws Exception {
        java.io.StringWriter out = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(out);
        writer.beginObject();
        writer.name("a").value("x");
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":\"x\"}", out.toString());
    }
}
