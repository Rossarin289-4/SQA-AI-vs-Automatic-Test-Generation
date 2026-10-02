package com.google.gson.stream;

import org.junit.Test;
import java.io.IOException;
import java.io.StringReader;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JsonReaderAI13Test {

    @Test
    public void testGetPathSimple() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[\"hello\"]"));
        assertEquals("$", reader.getPath());
        reader.beginArray();
        assertEquals("$[0]", reader.getPath());
        assertEquals("hello", reader.nextString());
        reader.endArray();
        assertEquals("$", reader.getPath());
    }

    @Test
    public void testLenientDefault() {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        assertEquals(false, reader.isLenient());
        reader.setLenient(true);
        assertEquals(true, reader.isLenient());
    }

    @Test
    public void testToStringOutput() {
        JsonReader reader = new JsonReader(new StringReader("123"));
        String str = reader.toString();
        assertTrue(str.contains("JsonReader"));
    }
}
