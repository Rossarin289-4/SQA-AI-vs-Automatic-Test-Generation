package com.google.gson.stream;

import org.junit.Test;
import java.io.IOException;
import java.io.StringWriter;
import static org.junit.Assert.assertEquals;

public class JsonWriterAI9Test {

  @Test
  public void testNullValueSerializationDisabled() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setSerializeNulls(false);
    jsonWriter.beginObject();
    jsonWriter.name("testKey").nullValue();
    jsonWriter.endObject();
    jsonWriter.close();
    assertEquals("{}", stringWriter.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidDoubleNaN() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value(Double.NaN);
  }

  @Test
  public void testBooleanValue() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.value(true);
    jsonWriter.value(false);
    jsonWriter.endArray();
    jsonWriter.close();
    assertEquals("[true,false]", stringWriter.toString());
  }
}
