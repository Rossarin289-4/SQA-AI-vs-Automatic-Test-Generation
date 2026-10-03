package com.google.gson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import org.junit.Test;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class DefaultDateTypeAdapterAI17Test {

  @Test
  public void testWriteNull() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    
    adapter.write(jsonWriter, null);
    
    assertEquals("null", stringWriter.toString());
  }

  @Test
  public void testReadNull() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    StringReader stringReader = new StringReader("null");
    JsonReader jsonReader = new JsonReader(stringReader);
    
    Date date = adapter.read(jsonReader);
    
    assertNull(date);
  }

  @Test
  public void testToString() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, "yyyy-MM-dd");
    String str = adapter.toString();
    
    assertNotNull(str);
    org.junit.Assert.assertTrue(str.startsWith("DefaultDateTypeAdapter"));
  }
}
