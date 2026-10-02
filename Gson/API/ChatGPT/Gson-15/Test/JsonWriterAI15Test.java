package com.google.gson.stream;

import org.junit.Test;
import java.io.IOException;
import java.io.StringWriter;
import static org.junit.Assert.assertEquals;

public class JsonWriterAI15Test {

  @Test
  public void testBasicObjectAndValues() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    
    jsonWriter.beginObject();
    jsonWriter.name("key").value("hello");
    jsonWriter.name("number").value(123L);
    jsonWriter.endObject();
    jsonWriter.close();

    assertEquals("{\"key\":\"hello\",\"number\":123}", stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testMultipleTopLevelValuesNotLenient() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    
    jsonWriter.value(true);
    jsonWriter.value(false);
  }

  @Test
  public void testNullValueSerializationDisabled() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setSerializeNulls(false);

    jsonWriter.beginObject();
    jsonWriter.name("nullable");
    jsonWriter.nullValue();
    jsonWriter.endObject();
    jsonWriter.close();

    assertEquals("{}", stringWriter.toString());
  }
}
