package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class JsonTreeWriterAI9Test {

  @Test
  public void testDefaultProduct() {
    JsonTreeWriter writer = new JsonTreeWriter();
    JsonElement element = writer.get();
    Assert.assertEquals(JsonNull.INSTANCE, element);
  }

  @Test
  public void testSimpleStringValue() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value("hello");
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertEquals("hello", element.getAsString());
  }

  @Test
  public void testBooleanValues() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.value(true);
    writer.value(Boolean.FALSE);
    writer.endArray();

    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonArray());
    JsonArray array = element.getAsJsonArray();
    Assert.assertEquals(2, array.size());
    Assert.assertTrue(array.get(0).getAsBoolean());
    Assert.assertFalse(array.get(1).getAsBoolean());
  }

  @Test
  public void testNumberValues() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.value(42L);
    writer.value(3.14d);
    writer.value(Integer.valueOf(100));
    writer.endArray();

    JsonElement element = writer.get();
    JsonArray array = element.getAsJsonArray();
    Assert.assertEquals(42L, array.get(0).getAsLong());
    Assert.assertEquals(3.14d, array.get(1).getAsDouble(), 0.0001);
    Assert.assertEquals(100, array.get(2).getAsInt());
  }

  @Test
  public void testNullValues() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.nullValue();
    writer.value((String) null);
    writer.value((Boolean) null);
    writer.value((Number) null);
    writer.endArray();

    JsonElement element = writer.get();
    JsonArray array = element.getAsJsonArray();
    Assert.assertEquals(4, array.size());
    for (int i = 0; i < array.size(); i++) {
      Assert.assertEquals(JsonNull.INSTANCE, array.get(i));
    }
  }

  @Test
  public void testObjectStructure() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("key1").value("val1");
    writer.name("key2").value(123);
    writer.endObject();

    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonObject());
    JsonObject obj = element.getAsJsonObject();
    Assert.assertEquals("val1", obj.get("key1").getAsString());
    Assert.assertEquals(123, obj.get("key2").getAsInt());
  }

  @Test
  public void testNestedStructures() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("arr");
    writer.beginArray();
    writer.value(1);
    writer.value(2);
    writer.endArray();
    writer.name("nestedObj");
    writer.beginObject();
    writer.name("innerKey").value(true);
    writer.endObject();
    writer.endObject();

    JsonElement element = writer.get();
    JsonObject obj = element.getAsJsonObject();
    JsonArray arr = obj.getAsJsonArray("arr");
    Assert.assertEquals(2, arr.size());
    Assert.assertEquals(1, arr.get(0).getAsInt());
    Assert.assertEquals(2, arr.get(1).getAsInt());

    JsonObject nestedObj = obj.getAsJsonObject("nestedObj");
    Assert.assertTrue(nestedObj.get("innerKey").getAsBoolean());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetWithNonEmptyStackThrows() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("incomplete");
    writer.get();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArrayWithoutBeginThrows() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObjectWithoutBeginThrows() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testNameWithoutObjectThrows() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.name("orphanName");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDoubleNanStrictThrows() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNumberInfinityStrictThrows() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value(Double.POSITIVE_INFINITY);
  }
}
