package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonToken;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class JsonTreeReaderAI12Test {

    @Test
    public void testReadPrimitiveString() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive("hello");
        JsonTreeReader reader = new JsonTreeReader(primitive);

        Assert.assertEquals(JsonToken.STRING, reader.peek());
        Assert.assertEquals("hello", reader.nextString());
        Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testReadPrimitiveBoolean() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive(true);
        JsonTreeReader reader = new JsonTreeReader(primitive);

        Assert.assertEquals(JsonToken.BOOLEAN, reader.peek());
        Assert.assertTrue(reader.nextBoolean());
        Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testReadPrimitiveNumber() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive(42);
        JsonTreeReader reader = new JsonTreeReader(primitive);

        Assert.assertEquals(JsonToken.NUMBER, reader.peek());
        Assert.assertEquals(42, reader.nextInt());
        Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testReadJsonNull() throws IOException {
        JsonNull jsonNull = JsonNull.INSTANCE;
        JsonTreeReader reader = new JsonTreeReader(jsonNull);

        Assert.assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testReadArray() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive("a"));
        array.add(new JsonPrimitive(123));

        JsonTreeReader reader = new JsonTreeReader(array);
        Assert.assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();

        Assert.assertEquals(JsonToken.STRING, reader.peek());
        Assert.assertEquals("a", reader.nextString());

        Assert.assertEquals(JsonToken.NUMBER, reader.peek());
        Assert.assertEquals(123L, reader.nextLong());

        Assert.assertEquals(JsonToken.END_ARRAY, reader.peek());
        reader.endArray();
        Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testReadObject() throws IOException {
        JsonObject object = new JsonObject();
        object.addProperty("key1", "value1");
        object.addProperty("key2", 99);

        JsonTreeReader reader = new JsonTreeReader(object);
        Assert.assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
        reader.beginObject();

        Assert.assertEquals(JsonToken.NAME, reader.peek());
        Assert.assertEquals("key1", reader.nextName());
        Assert.assertEquals(JsonToken.STRING, reader.peek());
        Assert.assertEquals("value1", reader.nextString());

        Assert.assertEquals(JsonToken.NAME, reader.peek());
        Assert.assertEquals("key2", reader.nextName());
        Assert.assertEquals(JsonToken.NUMBER, reader.peek());
        Assert.assertEquals(99, reader.nextInt());

        Assert.assertEquals(JsonToken.END_OBJECT, reader.peek());
        reader.endObject();
        Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testSkipValue() throws IOException {
        JsonObject object = new JsonObject();
        object.addProperty("toSkip", "secret");
        object.addProperty("keep", "visible");

        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();

        Assert.assertEquals("toSkip", reader.nextName());
        reader.skipValue();

        Assert.assertEquals("keep", reader.nextName());
        Assert.assertEquals("visible", reader.nextString());

        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue() throws IOException {
        JsonObject object = new JsonObject();
        object.addProperty("myKey", "myVal");

        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();

        reader.promoteNameToValue();
        Assert.assertEquals(JsonToken.STRING, reader.peek());
        Assert.assertEquals("myKey", reader.nextString());

        Assert.assertEquals(JsonToken.STRING, reader.peek());
        Assert.assertEquals("myVal", reader.nextString());

        reader.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testClosedReaderThrows() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive("test");
        JsonTreeReader reader = new JsonTreeReader(primitive);
        reader.close();
        reader.peek();
    }

    @Test
    public void testGetPath() throws IOException {
        JsonObject object = new JsonObject();
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive("item"));
        object.add("arr", array);

        JsonTreeReader reader = new JsonTreeReader(object);
        Assert.assertEquals("$", reader.getPath());

        reader.beginObject();
        Assert.assertEquals("$.arr", reader.getPath());
        Assert.assertEquals("arr", reader.nextName());

        reader.beginArray();
        Assert.assertEquals("$.arr[0]", reader.getPath());
        Assert.assertEquals("item", reader.nextString());

        reader.endArray();
        reader.endObject();
        Assert.assertEquals("$", reader.getPath());
    }
}
