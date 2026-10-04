package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Flushable;
import java.io.Writer;
import java.io.StringWriter;

public class JsonReaderTest {
    @Test
    public void testLenientDefaultAndSetter() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[]"));
        assertEquals(false, reader.isLenient());
        reader.setLenient(true);
        assertEquals(true, reader.isLenient());
    }

    @Test
    public void testArrayTraversalAndPath() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[1,2]"));
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertEquals("$[0]", reader.getPath());
        assertEquals(true, reader.hasNext());
        assertEquals(1, reader.nextInt());
        assertEquals("$[1]", reader.getPath());
        assertEquals(2, reader.nextInt());
        assertEquals(false, reader.hasNext());
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testObjectNamesAndPath() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("{\"a\":1}"));
        reader.beginObject();
        assertEquals("$.", reader.getPath());
        assertEquals("a", reader.nextName());
        assertEquals("$.a", reader.getPath());
        assertEquals(1, reader.nextInt());
        assertEquals(false, reader.hasNext());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testPeekDoesNotConsumeBoolean() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[true]"));
        reader.beginArray();
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        assertEquals(true, reader.nextBoolean());
    }

    @Test
    public void testReadNullAndString() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[null,\"x\"]"));
        reader.beginArray();
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        assertEquals("x", reader.nextString());
        reader.endArray();
    }

    @Test
    public void testNextLongLongMaximum() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[9223372036854775807]"));
        reader.beginArray();
        assertEquals(Long.MAX_VALUE, reader.nextLong());
    }

    @Test
    public void testNextLongLongMinimum() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[-9223372036854775808]"));
        reader.beginArray();
        assertEquals(Long.MIN_VALUE, reader.nextLong());
    }

    @Test
    public void testNextLongLargeNumericLiteralConvertsByDouble() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[9223372036854775808]"));
        reader.beginArray();
        assertEquals(Long.MAX_VALUE, reader.nextLong());
    }

    @Test
    public void testNextIntIntegerMaximumAndMinimum() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[2147483647,-2147483648]"));
        reader.beginArray();
        assertEquals(Integer.MAX_VALUE, reader.nextInt());
        assertEquals(Integer.MIN_VALUE, reader.nextInt());
    }

    @Test
    public void testNextIntRejectsOneAboveMaximum() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[2147483648]"));
        reader.beginArray();
        try {
            reader.nextInt();
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testNextDoubleDecimal() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[1.25]"));
        reader.beginArray();
        assertEquals(1.25, reader.nextDouble(), 1e-9);
    }

    @Test
    public void testSkipNestedValue() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[{\"a\":[1]},2]"));
        reader.beginArray();
        reader.skipValue();
        assertEquals(true, reader.hasNext());
        assertEquals(2, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testSkipScalarAndContinue() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[1,2]"));
        reader.beginArray();
        reader.skipValue();
        assertEquals(2, reader.nextInt());
    }

    @Test
    public void testClosedReaderRejectsPeek() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[]"));
        reader.close();
        try {
            reader.peek();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testReaderToStringPosition() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[]"));
        assertEquals("JsonReader at line 1 column 1", reader.toString());
    }

    @Test
    public void testLenientSingleQuotedValue() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("['x']"));
        reader.setLenient(true);
        reader.beginArray();
        assertEquals("x", reader.nextString());
    }

    @Test
    public void testStrictTopLevelPrimitiveIsReadable() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("1"));
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(1, reader.nextInt());
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testNamePromotedToValue() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("{\"a\":1}"));
        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
        assertEquals("a", reader.nextString());
        assertEquals(1, reader.nextInt());
    }

    @Test
    public void testWriterIndentAndStringValue() throws Exception {
        StringWriter output = new StringWriter();
        JsonWriter writer = new JsonWriter(output);
        writer.setIndent("  ");
        writer.beginArray();
        writer.value("x");
        writer.endArray();
        assertEquals("[\n  \"x\"\n]", output.toString());
    }

    @Test
    public void testWriterHtmlSafeEscaping() throws Exception {
        StringWriter output = new StringWriter();
        JsonWriter writer = new JsonWriter(output);
        writer.setHtmlSafe(true);
        assertEquals(true, writer.isHtmlSafe());
        writer.beginArray();
        writer.value("<&=");
        writer.endArray();
        assertEquals("[\"\\u003c\\u0026\\u003d\"]", output.toString());
    }

    @Test
    public void testWriterStandardEscapingAndHtmlSafeToggle() throws Exception {
        StringWriter output = new StringWriter();
        JsonWriter writer = new JsonWriter(output);
        writer.setHtmlSafe(false);
        assertEquals(false, writer.isHtmlSafe());
        writer.beginArray();
        writer.value("<");
        writer.endArray();
        assertEquals("[\"<\"]", output.toString());
    }

    @Test
    public void testWriterSerializeNullsCanBeDisabled() throws Exception {
        StringWriter output = new StringWriter();
        JsonWriter writer = new JsonWriter(output);
        assertEquals(true, writer.getSerializeNulls());
        writer.setSerializeNulls(false);
        assertEquals(false, writer.getSerializeNulls());
        writer.beginObject();
        writer.name("x");
        writer.nullValue();
        writer.endObject();
        assertEquals("{}", output.toString());
    }

    @Test
    public void testWriterNameAndStringValue() throws Exception {
        StringWriter output = new StringWriter();
        JsonWriter writer = new JsonWriter(output);
        writer.beginObject();
        writer.name("x").value("v");
        writer.endObject();
        assertEquals("{\"x\":\"v\"}", output.toString());
    }

    @Test
    public void testWriterJsonValueIsWrittenWithoutQuoting() throws Exception {
        StringWriter output = new StringWriter();
        JsonWriter writer = new JsonWriter(output);
        writer.beginArray();
        writer.jsonValue("1");
        writer.endArray();
        assertEquals("[1]", output.toString());
    }

    @Test
    public void testWriterNullValueAtDocumentRoot() throws Exception {
        StringWriter output = new StringWriter();
        JsonWriter writer = new JsonWriter(output);
        writer.nullValue();
        assertEquals("null", output.toString());
    }

    @Test
    public void testWriterFlush() throws Exception {
        StringWriter output = new StringWriter();
        JsonWriter writer = new JsonWriter(output);
        writer.beginArray();
        writer.value("x");
        writer.flush();
        assertEquals("[\"x\"", output.toString());
    }
}
