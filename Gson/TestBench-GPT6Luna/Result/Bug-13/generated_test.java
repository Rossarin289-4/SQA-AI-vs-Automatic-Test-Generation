package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class JsonReaderTest {
    @Test
    public void testLenientSetting() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[]"));
        assertFalse(reader.isLenient());
        reader.setLenient(true);
        assertTrue(reader.isLenient());
    }

    @Test
    public void testArrayTokensAndPath() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1]"));
        assertEquals("$", reader.getPath());
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertEquals("$[0]", reader.getPath());
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertTrue(reader.hasNext());
        assertEquals("1", reader.nextString());
        assertFalse(reader.hasNext());
        reader.endArray();
        assertEquals("$", reader.getPath());
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testObjectNameAndBoolean() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{\"a\":true}"));
        reader.beginObject();
        assertTrue(reader.hasNext());
        assertEquals(JsonToken.NAME, reader.peek());
        assertEquals("a", reader.nextName());
        assertEquals("$.a", reader.getPath());
        assertTrue(reader.nextBoolean());
        assertFalse(reader.hasNext());
        reader.endObject();
        assertEquals("$", reader.getPath());
    }

    @Test
    public void testFalseAndNullValues() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[false,null]"));
        reader.beginArray();
        assertFalse(reader.nextBoolean());
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testNextIntAtMaximum() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[2147483647]"));
        reader.beginArray();
        assertEquals(Integer.MAX_VALUE, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testNextIntAtMinimum() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[-2147483648]"));
        reader.beginArray();
        assertEquals(Integer.MIN_VALUE, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testNextIntRejectsFirstValueAboveMaximum() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[2147483648]"));
        reader.beginArray();
        try {
            reader.nextInt();
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
            assertEquals(JsonToken.NUMBER, reader.peek());
        }
    }

    @Test
    public void testNextIntRejectsFirstValueBelowMinimum() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[-2147483649]"));
        reader.beginArray();
        try {
            reader.nextInt();
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
            assertEquals(JsonToken.NUMBER, reader.peek());
        }
    }

    @Test
    public void testNextLongAtMaximum() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[9223372036854775807]"));
        reader.beginArray();
        assertEquals(Long.MAX_VALUE, reader.nextLong());
        reader.endArray();
    }

    @Test
    public void testNextLongAtMinimum() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[-9223372036854775808]"));
        reader.beginArray();
        assertEquals(Long.MIN_VALUE, reader.nextLong());
        reader.endArray();
    }

    @Test
    public void testNextLongAcceptsValueAboveMaximumAsDoubleConversion() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[9223372036854775808]"));
        reader.beginArray();
        assertEquals(Long.MAX_VALUE, reader.nextLong());
    }

    @Test
    public void testNextLongAcceptsValueBelowMinimumAsDoubleConversion() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[-9223372036854775809]"));
        reader.beginArray();
        assertEquals(Long.MIN_VALUE, reader.nextLong());
    }

    @Test
    public void testNextDoubleFraction() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1.25]"));
        reader.beginArray();
        assertEquals(1.25, reader.nextDouble(), 1e-9);
        reader.endArray();
    }

    @Test
    public void testNumericStringConversions() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"17\",\"2.5\"]"));
        reader.beginArray();
        assertEquals(17, reader.nextInt());
        assertEquals(2.5, reader.nextDouble(), 1e-9);
        reader.endArray();
    }

    @Test
    public void testSkipNestedValue() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[{\"x\":[1,2]},3]"));
        reader.beginArray();
        reader.skipValue();
        assertEquals("$[1]", reader.getPath());
        assertEquals(3, reader.nextInt());
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testSkipValueUpdatesObjectPath() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{\"x\":1,\"y\":2}"));
        reader.beginObject();
        assertEquals("x", reader.nextName());
        reader.skipValue();
        assertEquals("$.null", reader.getPath());
        assertEquals("y", reader.nextName());
        assertEquals("$.y", reader.getPath());
        assertEquals(2, reader.nextInt());
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{\"key\":1}"));
        reader.beginObject();
        JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("key", reader.nextString());
        assertEquals(1, reader.nextInt());
        reader.endObject();
    }

    @Test
    public void testCloseReader() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[]"));
        reader.close();
        try {
            reader.peek();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals("$", reader.getPath());
        }
    }
}
