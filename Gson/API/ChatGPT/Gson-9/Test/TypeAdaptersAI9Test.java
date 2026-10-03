package com.google.gson.internal.bind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class TypeAdaptersAI9Test {

  @Test
  public void testBooleanAdapterReadAndWrite() throws Exception {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    TypeAdapters.BOOLEAN.write(jsonWriter, Boolean.TRUE);
    assertEquals("true", stringWriter.toString());

    JsonReader jsonReader = new JsonReader(new StringReader("true"));
    assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN.read(jsonReader));

    JsonReader nullReader = new JsonReader(new StringReader("null"));
    assertNull(TypeAdapters.BOOLEAN.read(nullReader));
  }

  @Test
  public void testBooleanAsStringAdapterReadAndWrite() throws Exception {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    TypeAdapters.BOOLEAN_AS_STRING.write(jsonWriter, Boolean.FALSE);
    assertEquals("\"false\"", stringWriter.toString());

    JsonReader jsonReader = new JsonReader(new StringReader("\"true\""));
    assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN_AS_STRING.read(jsonReader));

    JsonReader nullReader = new JsonReader(new StringReader("null"));
    assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(nullReader));
  }

  @Test
  public void testClassFactoryToString() {
    String factoryString = TypeAdapters.CLASS_FACTORY.toString();
    org.junit.Assert.assertNotNull(factoryString);
  }
}
