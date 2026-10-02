package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

public class JsonAdapterAnnotationTypeAdapterFactoryAI6Test {

  @JsonAdapter(DummyTypeAdapter.class)
  private static final class AnnotatedWithAdapter {
  }

  @JsonAdapter(DummyTypeAdapterFactory.class)
  private static final class AnnotatedWithFactory {
  }

  @JsonAdapter(InvalidAdapterValue.class)
  private static final class AnnotatedWithInvalid {
  }

  private static final class NotAnnotated {
  }

  public static final class DummyTypeAdapter extends TypeAdapter<Object> {
    @Override
    public void write(JsonWriter out, Object value) throws IOException {
      out.nullValue();
    }

    @Override
    public Object read(JsonReader in) throws IOException {
      in.skipValue();
      return null;
    }
  }

  public static final class DummyTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      return (TypeAdapter<T>) new DummyTypeAdapter();
    }
  }

  private static final class InvalidAdapterValue {
  }

  @Test
  public void testCreateWithoutAnnotation() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, com.google.gson.InstanceCreator<?>>emptyMap());
    JsonAdapterAnnotationTypeAdapterFactory factory = new JsonAdapterAnnotationTypeAdapterFactory(cc);
    Gson gson = new Gson();
    TypeAdapter<NotAnnotated> adapter = factory.create(gson, TypeToken.get(NotAnnotated.class));
    Assert.assertNull(adapter);
  }

  @Test
  public void testCreateWithDirectTypeAdapter() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, com.google.gson.InstanceCreator<?>>emptyMap());
    JsonAdapterAnnotationTypeAdapterFactory factory = new JsonAdapterAnnotationTypeAdapterFactory(cc);
    Gson gson = new Gson();
    TypeAdapter<AnnotatedWithAdapter> adapter = factory.create(gson, TypeToken.get(AnnotatedWithAdapter.class));
    Assert.assertNotNull(adapter);
  }

  @Test
  public void testCreateWithTypeAdapterFactory() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, com.google.gson.InstanceCreator<?>>emptyMap());
    JsonAdapterAnnotationTypeAdapterFactory factory = new JsonAdapterAnnotationTypeAdapterFactory(cc);
    Gson gson = new Gson();
    TypeAdapter<AnnotatedWithFactory> adapter = factory.create(gson, TypeToken.get(AnnotatedWithFactory.class));
    Assert.assertNotNull(adapter);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTypeAdapterInvalidValue() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, com.google.gson.InstanceCreator<?>>emptyMap());
    Gson gson = new Gson();
    JsonAdapter annotation = AnnotatedWithInvalid.class.getAnnotation(JsonAdapter.class);
    JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(cc, gson, TypeToken.get(AnnotatedWithInvalid.class), annotation);
  }

  @Test
  public void testGetTypeAdapterDirect() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, com.google.gson.InstanceCreator<?>>emptyMap());
    Gson gson = new Gson();
    JsonAdapter annotation = AnnotatedWithAdapter.class.getAnnotation(JsonAdapter.class);
    TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(cc, gson, TypeToken.get(AnnotatedWithAdapter.class), annotation);
    Assert.assertNotNull(adapter);
  }

  @Test
  public void testGetTypeAdapterFactory() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, com.google.gson.InstanceCreator<?>>emptyMap());
    Gson gson = new Gson();
    JsonAdapter annotation = AnnotatedWithFactory.class.getAnnotation(JsonAdapter.class);
    TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(cc, gson, TypeToken.get(AnnotatedWithFactory.class), annotation);
    Assert.assertNotNull(adapter);
  }

  @Test
  public void testConstructor() {
    ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, com.google.gson.InstanceCreator<?>>emptyMap());
    JsonAdapterAnnotationTypeAdapterFactory factory = new JsonAdapterAnnotationTypeAdapterFactory(cc);
    Assert.assertNotNull(factory);
  }
}
