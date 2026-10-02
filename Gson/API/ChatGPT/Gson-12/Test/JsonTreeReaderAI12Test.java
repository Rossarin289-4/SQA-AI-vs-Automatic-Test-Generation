package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class JsonTreeReaderAI12Test {

  @Test
  public void testPrimitiveTypes() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("str", "hello");
    obj.addProperty("num", 42);
    obj.addProperty("bool", true);
    obj.add("nul", com.google.gson.JsonNull.INSTANCE);

    JsonTreeReader reader = new JsonTreeReader(obj);
    reader.beginObject();

    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("str", reader.nextName());
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("hello", reader.nextString());

    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("num", reader.nextName());
    Assert.assertEquals(JsonToken.NUMBER, reader.peek());
    Assert.assertEquals(42, reader.nextInt());

    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("bool", reader.nextName());
    Assert.assertEquals(JsonToken.BOOLEAN, reader.peek());
    Assert.assertTrue(reader.nextBoolean());

    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("nul", reader.nextName());
    Assert.assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();

    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testArrayIteration() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive(10));
    array.add(new JsonPrimitive(20));

    JsonTreeReader reader = new JsonTreeReader(array);
    reader.beginArray();
    Assert.assertTrue(reader.hasNext());
    Assert.assertEquals(10, reader.nextInt());
    Assert.assertTrue(reader.hasNext());
    Assert.assertEquals(20, reader.nextInt());
    reader.endArray();
    Assert.assertFalse(reader.hasNext());
  }

  @Test(expected = IllegalStateException.class)
  public void testClosedReaderThrows() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("test"));
    reader.close();
    reader.peek();
  }
}
