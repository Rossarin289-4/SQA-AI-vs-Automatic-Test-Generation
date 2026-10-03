package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

public class JsonReaderAI13Test {

    @Test
    public void testEmptyArray() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[]"));
        reader.beginArray();
        Assert.assertFalse(reader.hasNext());
        reader.endArray();
        Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
        reader.close();
    }

    @Test
    public void testSimpleObject() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{\"key\":\"value\"}"));
        reader.beginObject();
        Assert.assertTrue(reader.hasNext());
        Assert.assertEquals("key", reader.nextName());
        Assert.assertEquals("value", reader.nextString());
        Assert.assertFalse(reader.hasNext());
        reader.endObject();
        reader.close();
    }

    @Test
    public void testPrimitivesAndNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[true, false, null, 123, 45.67]"));
        reader.beginArray();

        Assert.assertTrue(reader.hasNext());
        Assert.assertTrue(reader.nextBoolean());

        Assert.assertTrue(reader.hasNext());
        Assert.assertFalse(reader.nextBoolean());

        Assert.assertTrue(reader.hasNext());
        reader.nextNull();

        Assert.assertTrue(reader.hasNext());
        Assert.assertEquals(123, reader.nextInt());

        Assert.assertTrue(reader.hasNext());
        Assert.assertEquals(45.67, reader.nextDouble(), 0.0001);

        Assert.assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLenientSettingAndToString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        Assert.assertFalse(reader.isLenient());
        reader.setLenient(true);
        Assert.assertTrue(reader.isLenient());
        
        Assert.assertNotNull(reader.toString());
        reader.close();
    }

    @Test
    public void testSkipValue() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{\"a\": [1, 2, 3], \"b\": 4}"));
        reader.beginObject();
        Assert.assertEquals("a", reader.nextName());
        reader.skipValue(); // skips the array
        Assert.assertEquals("b", reader.nextName());
        Assert.assertEquals(4, reader.nextInt());
        reader.endObject();
        reader.close();
    }

    @Test(expected = MalformedJsonException.class)
    public void testSyntaxErrorStrict() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{unquoted: true}"));
        reader.setLenient(false);
        reader.beginObject();
        reader.nextName(); // Should fail because name is unquoted in strict mode
        reader.close();
    }

    @Test
    public void testLenientUnquotedName() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{unquoted: 123}"));
        reader.setLenient(true);
        reader.beginObject();
        Assert.assertEquals("unquoted", reader.nextName());
        Assert.assertEquals(123, reader.nextInt());
        reader.endObject();
        reader.close();
    }

    @Test
    public void testGetPath() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{\"outer\": [{\"inner\": 42}]}"));
        Assert.assertEquals("$", reader.getPath());
        reader.beginObject();
        Assert.assertEquals("$.outer", reader.getPath());
        reader.nextName();
        reader.beginArray();
        Assert.assertEquals("$.outer[0]", reader.getPath());
        reader.beginObject();
        Assert.assertEquals("$.outer[0]", reader.getPath());
        reader.nextName();
        Assert.assertEquals("$.outer[0].inner", reader.getPath());
        reader.nextInt();
        reader.endObject();
        reader.endArray();
        reader.endObject();
        Assert.assertEquals("$.outer", reader.getPath());
        reader.close();
    }
}
