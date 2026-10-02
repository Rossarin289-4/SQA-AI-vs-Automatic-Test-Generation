package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringReader;

public class JsonReaderAI7Test {

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
        
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
        reader.close();
    }

    @Test
    public void testArrayParsing() throws IOException {
        String json = "[true, false, null]";
        JsonReader reader = new JsonReader(new StringReader(json));
        
        reader.beginArray();
        assertTrue(reader.nextBoolean());
        assertFalse(reader.nextBoolean());
        reader.nextNull();
        reader.endArray();
        
        reader.close();
    }

    @Test
    public void testGetPath() throws IOException {
        String json = "{\"outer\":[{\"inner\":42}]}";
        JsonReader reader = new JsonReader(new StringReader(json));
        
        assertEquals("$", reader.getPath());
        reader.beginObject();
        assertEquals("$.outer", reader.getPath());
        reader.nextName();
        reader.beginArray();
        assertEquals("$.outer[0]", reader.getPath());
        reader.beginObject();
        assertEquals("$.outer[0].inner", reader.getPath());
        reader.nextName();
        assertEquals(42, reader.nextInt());
        reader.endObject();
        reader.endArray();
        reader.endObject();
        
        reader.close();
    }
}
