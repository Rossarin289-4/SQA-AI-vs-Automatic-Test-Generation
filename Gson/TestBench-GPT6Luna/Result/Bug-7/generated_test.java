package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class JsonReaderTest {
    @Test
    public void testLeniencyDefaultsToFalse() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[]"));
        assertFalse(reader.isLenient());
    }

    @Test
    public void testSetLenientUpdatesState() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[]"));
        reader.setLenient(true);
        assertTrue(reader.isLenient());
        reader.setLenient(false);
        assertFalse(reader.isLenient());
    }

    @Test
    public void testArrayTokensAndHasNext() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[1]"));
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertTrue(reader.hasNext());
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(1, reader.nextInt());
        assertFalse(reader.hasNext());
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testEmptyObjectAndNameValue() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("{\"a\":2}"));
        reader.beginObject();
        assertTrue(reader.hasNext());
        assertEquals(JsonToken.NAME, reader.peek());
        assertEquals("a", reader.nextName());
        assertEquals(2, reader.nextInt());
        assertFalse(reader.hasNext());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testObjectEndOnEmptyObject() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("{}"));
        reader.beginObject();
        assertFalse(reader.hasNext());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testNextStringReadsQuotedAndNumericValues() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[\"hi\",12]"));
        reader.beginArray();
        assertEquals("hi", reader.nextString());
        assertEquals("12", reader.nextString());
        reader.endArray();
    }

    @Test
    public void testNextBooleanBothValues() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[true,false]"));
        reader.beginArray();
        assertTrue(reader.nextBoolean());
        assertFalse(reader.nextBoolean());
        reader.endArray();
    }

    @Test
    public void testNextNullConsumesNull() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[null,1]"));
        reader.beginArray();
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        assertEquals(1, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testNextIntAtSignedEdges() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader(
                "[2147483647,-2147483648]"));
        reader.beginArray();
        assertEquals(Integer.MAX_VALUE, reader.nextInt());
        assertEquals(Integer.MIN_VALUE, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testNextIntRejectsFirstPositiveOutOfRange() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[2147483648]"));
        reader.beginArray();
        try {
            reader.nextInt();
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testNextLongAtSignedEdges() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader(
                "[9223372036854775807,-9223372036854775808]"));
        reader.beginArray();
        assertEquals(Long.MAX_VALUE, reader.nextLong());
        assertEquals(Long.MIN_VALUE, reader.nextLong());
        reader.endArray();
    }

    @Test
    public void testNextLongRejectsFractionalValue() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[1.5]"));
        reader.beginArray();
        try {
            reader.nextLong();
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testNextDoubleFromNumber() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[1.5]"));
        reader.beginArray();
        assertEquals(1.5, reader.nextDouble(), 1e-9);
        reader.endArray();
    }

    @Test
    public void testNextDoubleRejectsNonFiniteInStrictMode() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[NaN]"));
        reader.setLenient(true);
        reader.beginArray();
        assertTrue(Double.isNaN(reader.nextDouble()));
    }

    @Test
    public void testSkipNestedValueLeavesFollowingElement() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[{\"x\":[1]},7]"));
        reader.beginArray();
        reader.skipValue();
        assertEquals(7, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testGetPathTracksArrayIndex() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[1,2]"));
        reader.beginArray();
        assertEquals("$[0]", reader.getPath());
        assertEquals(1, reader.nextInt());
        assertEquals("$[1]", reader.getPath());
        assertEquals(2, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testGetPathTracksObjectName() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("{\"a\":1}"));
        reader.beginObject();
        assertEquals("$.", reader.getPath());
        assertEquals("a", reader.nextName());
        assertEquals("$.a", reader.getPath());
        assertEquals(1, reader.nextInt());
    }

    @Test
    public void testCloseMakesReaderClosed() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("[]"));
        reader.close();
        try {
            reader.peek();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testLenientSingleQuotedValue() throws Exception {
        JsonReader reader = new JsonReader(new java.io.StringReader("['x']"));
        reader.setLenient(true);
        reader.beginArray();
        assertEquals("x", reader.nextString());
        reader.endArray();
    }
}
