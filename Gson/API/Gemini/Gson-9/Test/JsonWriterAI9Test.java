package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class JsonWriterAI9Test {

  @Test
  public void testBasicObjectAndValues() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginObject();
    writer.name("hello").value("world");
    writer.name("answer").value(42);
    writer.name("flag").value(true);
    writer.name("pi").value(3.14);
    writer.name("nothing").nullValue();
    writer.endObject();
    writer.close();

    Assert.assertEquals("{\"hello\":\"world\",\"answer\":42,\"flag\":true,\"pi\":3.14,\"nothing\":null}", sw.toString());
  }

  @Test
  public void testBasicArray() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginArray();
    writer.value("one");
    writer.value(2L);
    writer.value(false);
    writer.endArray();
    writer.close();

    Assert.assertEquals("[\"one\",2,false]", sw.toString());
  }

  @Test
  public void testNestedStructures() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginObject();
    writer.name("items");
    writer.beginArray();
    writer.beginObject();
    writer.name("id").value(1);
    writer.endObject();
    writer.endArray();
    writer.endObject();
    writer.close();

    Assert.assertEquals("{\"items\":[{\"id\":1}]}", sw.toString());
  }

  @Test
  public void testIndentation() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setIndent("  ");

    writer.beginObject();
    writer.name("a").value(1);
    writer.endObject();
    writer.close();

    String expected = "{\n  \"a\": 1\n}";
    Assert.assertEquals(expected, sw.toString());
  }

  @Test
  public void testHtmlSafe() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setHtmlSafe(true);

    writer.beginObject();
    writer.name("html").value("<script>&='\"</script>");
    writer.endObject();
    writer.close();

    Assert.assertEquals("{\"html\":\"\\u003cscript\\u003e\\u0026\\u003d\\u0027\\\"\\u003c/script\\u003e\"}", sw.toString());
  }

  @Test
  public void testSerializeNullsFalse() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setSerializeNulls(false);

    writer.beginObject();
    writer.name("a").value("val");
    writer.name("b").nullValue();
    writer.endObject();
    writer.close();

    Assert.assertEquals("{\"a\":\"val\"}", sw.toString());
  }

  @Test
  public void testLenientTopLevelValue() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setLenient(true);

    writer.value("top-level string");
    writer.close();

    Assert.assertEquals("\"top-level string\"", sw.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testMultipleTopLevelValuesStrictFails() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginObject().endObject();
    writer.beginObject().endObject();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNaNValueFailsStrict() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInfinityValueFailsStrict() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.value(Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalStateException.class)
  public void testDanglingNameFailsOnClose() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginObject();
    writer.name("dangling");
    writer.endObject();
  }

  @Test(expected = IOException.class)
  public void testIncompleteDocumentFailsOnClose() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginObject();
    writer.close();
  }

  @Test
  public void testJsonValueMethod() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginObject();
    writer.name("raw");
    writer.jsonValue("{\"inner\":true}");
    writer.endObject();
    writer.close();

    Assert.assertEquals("{\"raw\":{\"inner\":true}}", sw.toString());
  }

  @Test
  public void testBooleanAndNumberOverloads() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginArray();
    writer.value(Boolean.TRUE);
    writer.value(Boolean.FALSE);
    writer.value((Number) 123);
    writer.value((String) null);
    writer.endArray();
    writer.close();

    Assert.assertEquals("[true,false,123,null]", sw.toString());
  }
}
