package com.google.gson.internal.bind;

import static org.junit.Assert.assertNull;

import com.google.gson.Gson;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import org.junit.Test;

public class JsonAdapterAnnotationTypeAdapterFactoryAI6Test {

  @Test
  public void testCreateWithoutAnnotation() {
    ConstructorConstructor constructorConstructor = new ConstructorConstructor(Collections.<TypeToken<?>, com.google.gson.internal.ObjectConstructor<?>>emptyMap());
    JsonAdapterAnnotationTypeAdapterFactory factory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
    Gson gson = new Gson();
    
    TypeAdapter<String> adapter = factory.create(gson, TypeToken.get(String.class));
    assertNull(adapter);
  }
}
