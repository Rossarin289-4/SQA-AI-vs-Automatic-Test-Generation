package com.google.gson.internal.bind;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Collections;

public class ReflectiveTypeAdapterFactoryAI10Test {

  static class SampleClass {
    public String name = "default";
    private int value = 42;
  }

  interface SampleInterface {
    void doSomething();
  }

  static class SerializedNameClass {
    @SerializedName(value = "primary", alternate = {"alt1", "alt2"})
    public String field;
  }

  static class DuplicateNameClass {
    @SerializedName("same")
    public String field1;

    @SerializedName("same")
    public String field2;
  }

  static class ExtraClass {
    public static final String STATIC_FIELD = "static";
    public transient String TRANSIENT_FIELD = "transient";
  }

  @Test
  public void testExcludeFieldValid() throws Exception {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.emptyMap());
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        cc, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);

    Field field = SampleClass.class.getField("name");
    boolean excluded = factory.excludeField(field, true);
    Assert.assertFalse(excluded);
  }

  @Test
  public void testExcludeFieldStaticTransient() throws Exception {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.emptyMap());
    Excluder excluder = Excluder.DEFAULT.withModifiers(java.lang.reflect.Modifier.STATIC);
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        cc, FieldNamingPolicy.IDENTITY, excluder);

    Field staticField = ExtraClass.class.getDeclaredField("STATIC_FIELD");
    Assert.assertTrue(ReflectiveTypeAdapterFactory.excludeField(staticField, true, excluder));
  }

  @Test
  public void testCreateNonObjectReturnsNull() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.emptyMap());
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        cc, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);

    Gson gson = new Gson();
    TypeAdapter<Integer> adapter = factory.create(gson, TypeToken.get(Integer.class));
    Assert.assertNull(adapter);
  }

  @Test
  public void testCreateObjectReturnsAdapter() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.emptyMap());
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        cc, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);

    Gson gson = new Gson();
    TypeAdapter<SampleClass> adapter = factory.create(gson, TypeToken.get(SampleClass.class));
    Assert.assertNotNull(adapter);
  }

  @Test
  public void testCreateInterfaceReturnsEmptyBoundFieldsAdapter() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.emptyMap());
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        cc, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);

    Gson gson = new Gson();
    TypeAdapter<SampleInterface> adapter = factory.create(gson, TypeToken.get(SampleInterface.class));
    Assert.assertNotNull(adapter);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBoundFieldsDuplicateNamesThrowsException() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.emptyMap());
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        cc, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);

    Gson gson = new Gson();
    // This should trigger IllegalArgumentException due to duplicate serialized name "same"
    factory.create(gson, TypeToken.get(DuplicateNameClass.class));
  }

  @Test
  public void testSerializedNameWithAlternates() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.emptyMap());
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        cc, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);

    Gson gson = new Gson();
    TypeAdapter<SerializedNameClass> adapter = factory.create(gson, TypeToken.get(SerializedNameClass.class));
    Assert.assertNotNull(adapter);
  }

  @Test
  public void testAdapterNullHandling() throws Exception {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.emptyMap());
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        cc, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);

    Gson gson = new Gson();
    TypeAdapter<SampleClass> adapter = factory.create(gson, TypeToken.get(SampleClass.class));

    java.io.StringWriter sw = new java.io.StringWriter();
    com.google.gson.stream.JsonWriter writer = new com.google.gson.stream.JsonWriter(sw);
    adapter.write(writer, null);
    Assert.assertEquals("null", sw.toString());

    java.io.StringReader sr = new java.io.StringReader("null");
    com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(sr);
    SampleClass readObj = adapter.read(reader);
    Assert.assertNull(readObj);
  }
}
