package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.BitSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class TypeAdaptersAI9Test {

  @Test(expected = UnsupportedOperationException.class)
  public void testClassAdapterWrite() throws Exception {
    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.CLASS.write(jsonWriter, String.class);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassAdapterRead() throws Exception {
    StringReader sr = new StringReader("{\"a\":1}");
    JsonReader jsonReader = new JsonReader(sr);
    TypeAdapters.CLASS.read(jsonReader);
  }

  @Test
  public void testBitSetAdapter() throws Exception {
    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);

    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.BIT_SET.write(jsonWriter, bitSet);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jsonReader = new JsonReader(sr);
    BitSet deserialized = TypeAdapters.BIT_SET.read(jsonReader);

    Assert.assertEquals(bitSet, deserialized);
  }

  @Test
  public void testBitSetAdapterNull() throws Exception {
    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.BIT_SET.write(jsonWriter, null);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jsonReader = new JsonReader(sr);
    BitSet deserialized = TypeAdapters.BIT_SET.read(jsonReader);

    Assert.assertNull(deserialized);
  }

  @Test
  public void testBooleanAdapterString() throws Exception {
    StringReader sr = new StringReader("\"true\"");
    JsonReader jsonReader = new JsonReader(sr);
    Boolean val = TypeAdapters.BOOLEAN.read(jsonReader);
    Assert.assertTrue(val);
  }

  @Test
  public void testBooleanAsStringAdapter() throws Exception {
    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.BOOLEAN_AS_STRING.write(jsonWriter, Boolean.FALSE);
    Assert.assertEquals("\"false\"", sw.toString());

    StringReader sr = new StringReader("\"true\"");
    JsonReader jsonReader = new JsonReader(sr);
    Boolean val = TypeAdapters.BOOLEAN_AS_STRING.read(jsonReader);
    Assert.assertTrue(val);
  }

  @Test
  public void testAtomicIntegerAdapter() throws Exception {
    AtomicInteger ai = new AtomicInteger(42);
    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.ATOMIC_INTEGER.write(jsonWriter, ai);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jsonReader = new JsonReader(sr);
    AtomicInteger deserialized = TypeAdapters.ATOMIC_INTEGER.read(jsonReader);

    Assert.assertEquals(ai.get(), deserialized.get());
  }

  @Test
  public void testAtomicBooleanAdapter() throws Exception {
    AtomicBoolean ab = new AtomicBoolean(true);
    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.ATOMIC_BOOLEAN.write(jsonWriter, ab);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jsonReader = new JsonReader(sr);
    AtomicBoolean deserialized = TypeAdapters.ATOMIC_BOOLEAN.read(jsonReader);

    Assert.assertEquals(ab.get(), deserialized.get());
  }

  @Test
  public void testAtomicIntegerArrayAdapter() throws Exception {
    AtomicIntegerArray aia = new AtomicIntegerArray(new int[]{1, 2, 3});
    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.ATOMIC_INTEGER_ARRAY.write(jsonWriter, aia);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jsonReader = new JsonReader(sr);
    AtomicIntegerArray deserialized = TypeAdapters.ATOMIC_INTEGER_ARRAY.read(jsonReader);

    Assert.assertEquals(aia.length(), deserialized.length());
    Assert.assertEquals(aia.get(0), deserialized.get(0));
    Assert.assertEquals(aia.get(1), deserialized.get(1));
    Assert.assertEquals(aia.get(2), deserialized.get(2));
  }

  @Test
  public void testLocaleAdapter() throws Exception {
    Locale locale = new Locale("en", "US", "POSIX");
    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.LOCALE.write(jsonWriter, locale);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jsonReader = new JsonReader(sr);
    Locale deserialized = TypeAdapters.LOCALE.read(jsonReader);

    Assert.assertEquals(locale, deserialized);
  }

  @Test
  public void testJsonElementAdapterReadPrimitive() throws Exception {
    StringReader sr = new StringReader("123");
    JsonReader jsonReader = new JsonReader(sr);
    JsonElement element = TypeAdapters.JSON_ELEMENT.read(jsonReader);
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertEquals(123, element.getAsInt());
  }

  @Test
  public void testJsonElementAdapterWriteObject() throws Exception {
    JsonObject obj = new JsonObject();
    obj.add("key", new JsonPrimitive("value"));

    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    TypeAdapters.JSON_ELEMENT.write(jsonWriter, obj);

    Assert.assertTrue(sw.toString().contains("key"));
  }
}
