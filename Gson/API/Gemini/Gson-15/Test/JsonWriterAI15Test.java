package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class JsonWriterAI15Test {

    @Test
    public void testBasicObjectAndValues() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("hello").value("world");
        jsonWriter.name("answer").value(42);
        jsonWriter.endObject();
        jsonWriter.close();
        Assert.assertEquals("{\"hello\":\"world\",\"answer\":42}", stringWriter.toString());
    }

    @Test
    public void testBasicArrayAndValues() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.value((String) null);
        jsonWriter.endArray();
        jsonWriter.close();
        Assert.assertEquals("[true,false,null]", stringWriter.toString());
    }

    @Test
    public void testNestedStructures() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("nums");
        jsonWriter.beginArray();
        jsonWriter.value(1.5);
        jsonWriter.value(2L);
        jsonWriter.endArray();
        jsonWriter.endObject();
        jsonWriter.close();
        Assert.assertEquals("{\"nums\":[1.5,2]}", stringWriter.toString());
    }

    @Test
    public void testSerializeNullsFalse() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setSerializeNulls(false);
        jsonWriter.beginObject();
        jsonWriter.name("key1").value("val");
        jsonWriter.name("key2").nullValue();
        jsonWriter.endObject();
        jsonWriter.close();
        Assert.assertEquals("{\"key1\":\"val\"}", stringWriter.toString());
    }

    @Test
    public void testHtmlSafe() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setHtmlSafe(true);
        jsonWriter.beginObject();
        jsonWriter.name("html").value("<script>&</script>");
        jsonWriter.endObject();
        jsonWriter.close();
        Assert.assertEquals("{\"html\":\"\\u003cscript\\u003e\\u0026\\u003c/script\\u003e\"}", stringWriter.toString());
    }

    @Test
    public void testLenientTopLevelValue() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setLenient(true);
        jsonWriter.value("top-level-string");
        jsonWriter.close();
        Assert.assertEquals("\"top-level-string\"", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testStrictMultipleTopLevelValuesThrows() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.endObject();
        jsonWriter.value(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictDoubleNaNThrows() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictDoubleInfinityThrows() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testLenientDoubleSpecialValues() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value(Double.NaN);
        jsonWriter.value(Double.POSITIVE_INFINITY);
        jsonWriter.value(Double.NEGATIVE_INFINITY);
        jsonWriter.endArray();
        jsonWriter.close();
        Assert.assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testDanglingNameThrows() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("orphan");
        jsonWriter.endObject();
    }

    @Test(expected = IOException.class)
    public void testIncompleteDocumentCloseThrows() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.close();
    }

    @Test
    public void testJsonValueMethod() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginObject();
        jsonWriter.name("raw");
        jsonWriter.jsonValue("{\"a\":1}");
        jsonWriter.endObject();
        jsonWriter.close();
        Assert.assertEquals("{\"raw\":{\"a\":1}}", stringWriter.toString());
    }
}
