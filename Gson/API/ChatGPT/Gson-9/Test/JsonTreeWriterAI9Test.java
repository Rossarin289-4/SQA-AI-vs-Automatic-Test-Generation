package com.google.gson.internal.bind;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JsonTreeWriterAI9Test {

  @Test
  public void testWritePrimitiveValue() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value("hello");
    JsonElement element = writer.get();
    assertTrue(element instanceof JsonPrimitive);
    assertEquals("hello", element.getAsString());
  }

  @Test
  public void testWriteObject() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("key");
    writer.value(true);
    writer.endObject();
    JsonElement element = writer.get();
    assertTrue(element.isJsonObject());
    assertTrue(element.getAsJsonObject().get("key").getAsBoolean());
  }

  @Test(expected = IllegalStateException.class)
  public void testUnclosedStackThrowsException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.get();
  }
}
