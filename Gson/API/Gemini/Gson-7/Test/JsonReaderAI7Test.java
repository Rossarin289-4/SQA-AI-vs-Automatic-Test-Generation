package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;

public class JsonReaderAI7Test {

  @Test
  public void testReadEmptyArray() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
    Assert.assertFalse(reader.hasNext());
    reader.endArray();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    reader.close();
  }

  @Test
  public void testReadSimpleObject() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":123}"));
    reader.beginObject();
    Assert.assertTrue(reader.hasNext());
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals(123, reader.nextInt());
    Assert.assertFalse(reader.hasNext());
    reader.endObject();
    reader.close();
  }

  @Test
  public void testReadBooleansAndNull() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true, false, null]"));
    reader.beginArray();
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertFalse(reader.nextBoolean());
    reader.nextNull();
    reader.endArray();
    reader.close();
  }

  @Test
  public void testReadStrings() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"hello\", \"world\"]"));
    reader.beginArray();
    Assert.assertEquals("hello", reader.nextString());
    Assert.assertEquals("world", reader.nextString());
    reader.endArray();
    reader.close();
  }

  @Test
  public void testLenientParsingAndComments() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("// comment\n{/* c-style */ 'key': # hash comment\n 456}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals(456, reader.nextInt());
    reader.endObject();
    reader.close();
  }

  @Test(expected = MalformedJsonException.class)
  public void testStrictParsingRejectsComments() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("// comment\n{\"key\": 456}"));
    reader.setLenient(false);
    reader.beginObject();
  }

  @Test(expected = EOFException.class)
  public void testEofExceptionInMiddleOfInput() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"key\":"));
    reader.beginObject();
    reader.nextName();
    // Should throw EOFException because input ends abruptly
    reader.nextInt();
  }

  @Test
  public void testGetPath() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"arr\": [10, 20]}"));
    Assert.assertEquals("$", reader.getPath());
    reader.beginObject();
    Assert.assertEquals("$.", reader.getPath());
    Assert.assertEquals("arr", reader.nextName());
    Assert.assertEquals("$.arr", reader.getPath());
    reader.beginArray();
    Assert.assertEquals("$.arr[0]", reader.getPath());
    Assert.assertEquals(10, reader.nextInt());
    Assert.assertEquals("$.arr[1]", reader.getPath());
    Assert.assertEquals(20, reader.nextInt());
    reader.endArray();
    reader.endObject();
    Assert.assertEquals("$", reader.getPath());
    reader.close();
  }

  @Test
  public void testSkipValue() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\": [1, 2, {" +
        " \"b\": 3}], \"c\": 4}"));
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    reader.skipValue(); // skips the entire array
    Assert.assertEquals("c", reader.nextName());
    Assert.assertEquals(4, reader.nextInt());
    reader.endObject();
    reader.close();
  }

  @Test(expected = IllegalStateException.class)
  public void testIllegalStateOnWrongToken() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("123"));
    // Expecting an object or array, but token is a number
    reader.beginObject();
  }

  @Test
  public void testNonExecutePrefixLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(")]}'\n[1, 2]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(2, reader.nextInt());
    reader.endArray();
    reader.close();
  }
}
