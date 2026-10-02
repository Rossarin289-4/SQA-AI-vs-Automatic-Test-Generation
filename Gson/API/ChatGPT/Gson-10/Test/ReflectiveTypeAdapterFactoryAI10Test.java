package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Collections;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ReflectiveTypeAdapterFactoryAI10Test {

  private static class NonBeanClass {
    private int value;
  }

  @Test
  public void testCreateNonObjectReturnsNull() {
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        null, null, new Excluder());
    TypeAdapter<Integer> adapter = factory.create(null, TypeToken.get(Integer.class));
    assertNull(adapter);
  }

  @Test
  public void testExcludeFieldWithExcluder() throws Exception {
    Field field = NonBeanClass.class.getDeclaredField("value");
    Excluder excluder = new Excluder();
    boolean excluded = ReflectiveTypeAdapterFactory.excludeField(field, true, excluder);
    assertTrue(excluded);
  }

  @Test
  public void testInterfaceRawTypeReturnsEmptyAdapter() {
    ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
        null, null, new Excluder());
    TypeAdapter<Runnable> adapter = factory.create(new Gson(), TypeToken.get(Runnable.class));
    assertNull(adapter);
  }
}
