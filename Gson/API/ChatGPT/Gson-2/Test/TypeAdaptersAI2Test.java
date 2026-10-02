package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.BitSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class TypeAdaptersAI2Test {

  @Test
  public void testBooleanAdapter() throws IOException {
    TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    adapter.write(jsonWriter, Boolean.TRUE);
    assertEquals("true", stringWriter.toString());

    JsonReader jsonReader = new JsonReader(new StringReader("true"));
    assertEquals(Boolean.TRUE, adapter.read(jsonReader));

    jsonReader = new JsonReader(new StringReader("null"));
    assertNull(adapter.read(jsonReader));
  }

  @Test
  public void testBitSetAdapter() throws IOException {
    TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
    BitSet bitSet = new BitSet();
    bitSet.set(0);

    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    adapter.write(jsonWriter, bitSet);
    assertEquals("[1]", stringWriter.toString());

    JsonReader jsonReader = new JsonReader(new StringReader("[1, 0, 1]"));
    BitSet readBitSet = adapter.read(jsonReader);
    assertNotNull(readBitSet);
    assertTrue(readBitSet.get(0));
    assertTrue(!readBitSet.get(1));
    assertTrue(readBitSet.get(2));

    jsonReader = new JsonReader(new StringReader("null"));
    assertNull(adapter.read(jsonReader));
  }

  @Test
  public void testFactoriesToString() {
    TypeAdapter<Class> adapter = TypeAdapters.CLASS;
    assertNotNull(TypeAdapters.newFactory(Class.class, adapter).toString());
    assertNotNull(TypeAdapters.newFactory(boolean.class, Boolean.class, TypeAdapters.BOOLEAN).toString());
    assertNotNull(TypeAdapters.newFactoryForMultipleTypes(Number.class, Integer.class, TypeAdapters.BYTE).toString());
    assertNotNull(TypeAdapters.newTypeHierarchyFactory(Number.class, TypeAdapters.BYTE).toString());
  }
}
