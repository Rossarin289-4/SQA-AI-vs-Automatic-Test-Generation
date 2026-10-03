package com.google.gson.internal.bind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.BitSet;

import org.junit.Test;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class TypeAdaptersAI11Test {

  @Test
  public void testBooleanAdapter() throws Exception {
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.BOOLEAN.write(jw, Boolean.TRUE);
    assertEquals("true", sw.toString());

    JsonReader jr = new JsonReader(new StringReader("true"));
    assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN.read(jr));

    JsonReader jrNull = new JsonReader(new StringReader("null"));
    assertNull(TypeAdapters.BOOLEAN.read(jrNull));
  }

  @Test
  public void testBitSetAdapter() throws Exception {
    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);

    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.BIT_SET.write(jw, bitSet);
    assertNotNull(sw.toString());

    JsonReader jr = new JsonReader(new StringReader("[1, 0, 1]"));
    BitSet readBitSet = TypeAdapters.BIT_SET.read(jr);
    assertNotNull(readBitSet);
    assertEquals(true, readBitSet.get(0));
    assertEquals(false, readBitSet.get(1));
    assertEquals(true, readBitSet.get(2));
  }

  @Test
  public void testBooleanAsStringAdapter() throws Exception {
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.BOOLEAN_AS_STRING.write(jw, Boolean.FALSE);
    assertEquals("\"false\"", sw.toString());

    JsonReader jr = new JsonReader(new StringReader("\"true\""));
    assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN_AS_STRING.read(jr));
  }
}
