package com.google.gson.stream;

import org.junit.Test;
import java.io.IOException;
import java.io.StringWriter;
import static org.junit.Assert.assertEquals;

public class JsonWriterAI4Test {

  @Test
  public void testWriteBasicObject() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name("hello").value("world");
    jsonWriter.endObject();
    jsonWriter.close();
    assertEquals("{\"hello\":\"world\"}", stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testMultipleTopLevelValuesDisallowed() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.endArray();
    jsonWriter.value("secondTopLevel");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidDoubleNanThrowsException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value(Double.NaN);
  }
}
