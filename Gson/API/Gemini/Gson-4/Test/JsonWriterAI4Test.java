package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class JsonWriterAI4Test {

  @Test(expected = NullPointerException.class)
  public void testConstructorNullWriter() {
    new JsonWriter(null);
  }

  @Test
  public void testBasicObjectAndTypes() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginObject();
    writer.name("str").value("hello");
    writer.name("num").value(123);
    writer.name("longNum").value(456L);
    writer.name("bool").value(true);
    writer.name("nul").nullValue();
    writer.endObject();
    writer.close();

    Assert.assertEquals("{\"str\":\"hello\",\"num\":123,\"longNum\":456,\"bool\":true,\"nul\":null}", sw.toString());
  }

  @Test
  public void testArrayWriting() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);

    writer.beginArray();
    writer.value("a");
    writer.value("b");
    writer.value(1.5);
    writer.endArray();
    writer.close();

    Assert.assertEquals("[\"a\",\"b\",1.5]", sw.toString());
  }

  @Test
  public void testIndentation() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setIndent("  ");

    writer.beginObject();
    writer.name("x").value(1);
    writer.endObject();
    writer.close();

    String expected = "{\n  \"x\": 1\n}";
    Assert.assertEquals(expected, sw.toString());
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
  public void testHtmlSafe() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setHtmlSafe(true);

    writer.beginObject();
    writer.name("html").value("<script>&</script>");
    writer.endObject();
    writer.close();

    Assert.assertEquals("{\"html\":\"\\u003cscript\\u003e\\u0026\\u003c/script\\u003e\"}", sw.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidDoubleNaNStrict() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidNumberInfinityStrict() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.value(Double.POSITIVE_INFINITY);
  }

  @Test
  public void testLenientMultipleTopLevelValues() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setLenient(true);

    writer.value(1);
    writer.value(2);
    writer.close();

    Assert.assertEquals("12", sw.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testStrictMultipleTopLevelValuesFails() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.value(1);
    writer.value(2);
  }

  @Test(expected = IOException.class)
  public void testIncompleteDocumentCloseFails() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginObject();
    writer.close();
  }

  @Test
  public void testJsonValueDirect() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginObject();
    writer.name("raw").jsonValue("{\"inner\":true}");
    writer.endObject();
    writer.close();

    Assert.assertEquals("{\"raw\":{\"inner\":true}}", sw.toString());
  }
}
