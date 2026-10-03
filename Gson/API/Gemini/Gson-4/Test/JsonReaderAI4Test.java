package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;

public class JsonReaderAI4Test {

  @Test
  public void testEmptyArray() throws IOException {
    StringReader reader = new StringReader("[]");
    JsonReader jsonReader = new JsonReader(reader);
    jsonReader.beginArray();
    Assert.assertFalse(jsonReader.hasNext());
    jsonReader.endArray();
    Assert.assertEquals(JsonToken.END_DOCUMENT, jsonReader.peek());
    jsonReader.close();
  }

  @Test
  public void testSimpleObject() throws IOException {
    StringReader reader = new StringReader("{\"key\":\"value\"}");
    JsonReader jsonReader = new JsonReader(reader);
    jsonReader.beginObject();
    Assert.assertTrue(jsonReader.hasNext());
    Assert.assertEquals("key", jsonReader.nextName());
    Assert.assertEquals("value", jsonReader.nextString());
    Assert.assertFalse(jsonReader.hasNext());
    jsonReader.endObject();
    jsonReader.close();
  }

  @Test
  public void testPrimitives() throws IOException {
    StringReader reader = new StringReader("[true, false, null, 123, 45.67]");
    JsonReader jsonReader = new JsonReader(reader);
    jsonReader.beginArray();

    Assert.assertTrue(jsonReader.nextBoolean());
    Assert.assertFalse(jsonReader.nextBoolean());
    jsonReader.nextNull();
    Assert.assertEquals(123, jsonReader.nextInt());
    Assert.assertEquals(45.67, jsonReader.nextDouble(), 0.0001);

    jsonReader.endArray();
    jsonReader.close();
  }

  @Test
  public void testLenientCommentsAndUnquoted() throws IOException {
    StringReader reader = new StringReader("{// comment\n/* block */ unquotedKey: 'singleQuote'}");
    JsonReader jsonReader = new JsonReader(reader);
    jsonReader.setLenient(true);

    jsonReader.beginObject();
    Assert.assertEquals("unquotedKey", jsonReader.nextName());
    Assert.assertEquals("singleQuote", jsonReader.nextString());
    jsonReader.endObject();
    jsonReader.close();
  }

  @Test(expected = MalformedJsonException.class)
  public void testStrictCommentsThrowsException() throws IOException {
    StringReader reader = new StringReader("{// comment\n \"a\": 1}");
    JsonReader jsonReader = new JsonReader(reader);
    jsonReader.setLenient(false);
    jsonReader.beginObject();
    jsonReader.nextName();
  }

  @Test
  public void testSkipValue() throws IOException {
    StringReader reader = new StringReader("{\"a\": [1, 2, { \"nested\": true }], \"b\": 2}");
    JsonReader jsonReader = new JsonReader(reader);
    jsonReader.beginObject();
    Assert.assertEquals("a", jsonReader.nextName());
    jsonReader.skipValue();
    Assert.assertEquals("b", jsonReader.nextName());
    Assert.assertEquals(2, jsonReader.nextInt());
    jsonReader.endObject();
    jsonReader.close();
  }

  @Test
  public void testGetPath() throws IOException {
    StringReader reader = new StringReader("{\"arr\": [{\"id\": 42}]}");
    JsonReader jsonReader = new JsonReader(reader);
    Assert.assertEquals("$", jsonReader.getPath());
    jsonReader.beginObject();
    Assert.assertEquals("$.", jsonReader.getPath());
    Assert.assertEquals("arr", jsonReader.nextName());
    Assert.assertEquals("$.arr", jsonReader.getPath());
    jsonReader.beginArray();
    Assert.assertEquals("$.arr[0]", jsonReader.getPath());
    jsonReader.beginObject();
    Assert.assertEquals("$.arr[0].", jsonReader.getPath());
    Assert.assertEquals("id", jsonReader.nextName());
    Assert.assertEquals("$.arr[0].id", jsonReader.getPath());
    Assert.assertEquals(42, jsonReader.nextInt());
    jsonReader.endObject();
    jsonReader.endArray();
    jsonReader.endObject();
    Assert.assertEquals("$", jsonReader.getPath());
    jsonReader.close();
  }

  @Test(expected = IOException.class)
  public void testUnterminatedString() throws IOException {
    StringReader reader = new StringReader("\"unterminated");
    JsonReader jsonReader = new JsonReader(reader);
    jsonReader.nextString();
  }

  @Test
  public void testNonExecutePrefixLenient() throws IOException {
    StringReader reader = new StringReader(")]}'\n[1, 2]");
    JsonReader jsonReader = new JsonReader(reader);
    jsonReader.setLenient(true);
    jsonReader.beginArray();
    Assert.assertEquals(1, jsonReader.nextInt());
    Assert.assertEquals(2, jsonReader.nextInt());
    jsonReader.endArray();
    jsonReader.close();
  }

  @Test
  public void testToStringAndLineColumn() throws IOException {
    StringReader reader = new StringReader("  [\n  ]");
    JsonReader jsonReader = new JsonReader(reader);
    Assert.assertNotNull(jsonReader.toString());
    jsonReader.beginArray();
    jsonReader.endArray();
    jsonReader.close();
  }
}
