package com.google.gson.stream;

import org.junit.Test;
import java.io.IOException;
import java.io.StringReader;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JsonReaderAI4Test {

    @Test
    public void testBasicObjectParsing() throws IOException {
        String json = "{\"name\":\"test\",\"value\":123}";
        JsonReader reader = new JsonReader(new StringReader(json));
        
        reader.beginObject();
        assertEquals("name", reader.nextName());
        assertEquals("test", reader.nextString());
        assertEquals("value", reader.nextName());
        assertEquals(123, reader.nextInt());
        reader.endObject();
        
        assertFalse(reader.hasNext());
        reader.close();
    }

    @Test
    public void testGetPathInitial() {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        assertEquals("$", reader.getPath());
    }

    @Test(expected = MalformedJsonException.class)
    public void testMalformedJsonThrowsException() throws IOException {
        String json = "{invalid}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();
        reader.nextName();
    }
}
