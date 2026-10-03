package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.BitSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TypeAdaptersAI11Test {

  @Test(expected = UnsupportedOperationException.class)
  public void testClassAdapterWrite() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.CLASS.write(jw, String.class);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassAdapterRead() throws IOException {
    StringReader sr = new StringReader("{\"a\":1}");
    JsonReader jr = new JsonReader(sr);
    TypeAdapters.CLASS.read(jr);
  }

  @Test
  public void testClassAdapterReadNull() throws IOException {
    StringReader sr = new StringReader("null");
    JsonReader jr = new JsonReader(sr);
    Assert.assertNull(TypeAdapters.CLASS.read(jr));
  }

  @Test
  public void testBitSetAdapter() throws IOException {
    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);

    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.BIT_SET.write(jw, bitSet);
    String json = sw.toString();

    StringReader sr = new StringReader(json);
    JsonReader jr = new JsonReader(sr);
    BitSet readBitSet = TypeAdapters.BIT_SET.read(jr);

    Assert.assertEquals(bitSet, readBitSet);
  }

  @Test
  public void testBitSetAdapterNull() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.BIT_SET.write(jw, null);
    Assert.assertEquals("null", sw.toString().trim());

    StringReader sr = new StringReader("null");
    JsonReader jr = new JsonReader(sr);
    Assert.assertNull(TypeAdapters.BIT_SET.read(jr));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetAdapterInvalidToken() throws IOException {
    StringReader sr = new StringReader("[\"invalid-string-not-integer\"]");
    JsonReader jr = new JsonReader(sr);
    TypeAdapters.BIT_SET.read(jr);
  }

  @Test
  public void testBooleanAdapterString() throws IOException {
    StringReader sr = new StringReader("\"true\"");
    JsonReader jr = new JsonReader(sr);
    Boolean val = TypeAdapters.BOOLEAN.read(jr);
    Assert.assertTrue(val);
  }

  @Test
  public void testBooleanAsStringAdapter() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.BOOLEAN_AS_STRING.write(jw, Boolean.TRUE);
    Assert.assertEquals("\"true\"", sw.toString());

    StringReader sr = new StringReader("\"false\"");
    JsonReader jr = new JsonReader(sr);
    Boolean val = TypeAdapters.BOOLEAN_AS_STRING.read(jr);
    Assert.assertFalse(val);
  }

  @Test
  public void testLocaleAdapter() throws IOException {
    Locale locale = new Locale("en", "US", "POSIX");
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.LOCALE.write(jw, locale);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jr = new JsonReader(sr);
    Locale readLocale = TypeAdapters.LOCALE.read(jr);

    Assert.assertEquals(locale, readLocale);
  }

  @Test
  public void testJsonElementAdapterObject() throws IOException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.add("key", new JsonPrimitive("value"));

    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.JSON_ELEMENT.write(jw, jsonObject);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jr = new JsonReader(sr);
    JsonElement readElement = TypeAdapters.JSON_ELEMENT.read(jr);

    Assert.assertTrue(readElement.isJsonObject());
    Assert.assertEquals("value", readElement.getAsJsonObject().get("key").getAsString());
  }

  @Test
  public void testAtomicAdapters() throws IOException {
    AtomicInteger ai = new AtomicInteger(42);
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.ATOMIC_INTEGER.write(jw, ai);

    StringReader sr = new StringReader(sw.toString());
    JsonReader jr = new JsonReader(sr);
    AtomicInteger readAi = TypeAdapters.ATOMIC_INTEGER.read(jr);
    Assert.assertEquals(42, readAi.get());

    AtomicBoolean ab = new AtomicBoolean(true);
    StringWriter sw2 = new StringWriter();
    JsonWriter jw2 = new JsonWriter(sw2);
    TypeAdapters.ATOMIC_BOOLEAN.write(jw2, ab);

    StringReader sr2 = new StringReader(sw2.toString());
    JsonReader jr2 = new JsonReader(sr2);
    AtomicBoolean readAb = TypeAdapters.ATOMIC_BOOLEAN.read(jr2);
    Assert.assertTrue(readAb.get());
  }

  @Test
  public void testFactoriesToStringAndMatching() {
    Gson gson = new Gson();
    TypeAdapter<Class> adapter = TypeAdapters.CLASS_FACTORY.create(gson, TypeToken.get(Class.class));
    Assert.assertNotNull(adapter);

    TypeAdapter<BitSet> bitsetAdapter = TypeAdapters.BIT_SET_FACTORY.create(gson, TypeToken.get(BitSet.class));
    Assert.assertNotNull(bitsetAdapter);

    String factoryStr = TypeAdapters.newFactory(String.class, TypeAdapters.STRING).toString();
    Assert.assertTrue(factoryStr.contains("Factory[type="));
  }
}
