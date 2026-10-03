package com.google.gson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class DefaultDateTypeAdapterAI17Test {

  @Test
  public void testDefaultConstructorWithValidDateClass() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    assertNotNull(adapter);
    assertTrue(adapter.toString().contains("DefaultDateTypeAdapter"));
  }

  @Test
  public void testConstructorWithDatePattern() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    assertNotNull(adapter);
  }

  @Test
  public void testConstructorWithStyle() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, java.text.DateFormat.SHORT);
    assertNotNull(adapter);
  }

  @Test
  public void testConstructorWithDateAndTimeStyleNoClass() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.text.DateFormat.SHORT, java.text.DateFormat.SHORT);
    assertNotNull(adapter);
  }

  @Test
  public void testConstructorWithDateAndTimeStyleAndClass() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class, java.text.DateFormat.SHORT, java.text.DateFormat.SHORT);
    assertNotNull(adapter);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorInvalidDateTypeThrowsException() {
    new DefaultDateTypeAdapter(java.sql.Time.class);
  }

  @Test
  public void testWriteNullValue() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    
    adapter.write(jsonWriter, null);
    jsonWriter.close();
    
    assertEquals("null", stringWriter.toString());
  }

  @Test
  public void testWriteAndReadStandardDate() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    
    Date originalDate = new Date(1234567890000L);
    adapter.write(jsonWriter, originalDate);
    jsonWriter.close();

    String json = stringWriter.toString();
    JsonReader jsonReader = new JsonReader(new StringReader(json));
    Date readDate = adapter.read(jsonReader);

    assertNotNull(readDate);
  }

  @Test
  public void testReadNullValue() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    JsonReader jsonReader = new JsonReader(new StringReader("null"));
    
    Date readDate = adapter.read(jsonReader);
    assertNull(readDate);
  }

  @Test
  public void testReadTimestampType() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, "yyyy-MM-dd");
    JsonReader jsonReader = new JsonReader(new StringReader("\"2020-01-01\""));
    
    Date readDate = adapter.read(jsonReader);
    assertNotNull(readDate);
    assertTrue(readDate instanceof Timestamp);
  }

  @Test
  public void testReadSqlDateType() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class, "yyyy-MM-dd");
    JsonReader jsonReader = new JsonReader(new StringReader("\"2020-01-01\""));
    
    Date readDate = adapter.read(jsonReader);
    assertNotNull(readDate);
    assertTrue(readDate instanceof java.sql.Date);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testReadInvalidDateStringThrowsJsonSyntaxException() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    JsonReader jsonReader = new JsonReader(new StringReader("\"not-a-date\""));
    adapter.read(jsonReader);
  }
}
