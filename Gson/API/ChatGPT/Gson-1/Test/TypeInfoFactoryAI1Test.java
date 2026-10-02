package com.google.gson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Field;
import java.util.List;
import org.junit.Test;

public class TypeInfoFactoryAI1Test {

  private static class SampleClass<T> {
    T genericField;
    List<T> parameterizedField;
    String[] arrayField;
  }

  @Test
  public void testGetTypeInfoForArray() {
    TypeInfoArray typeInfoArray = TypeInfoFactory.getTypeInfoForArray(String[].class);
    assertNotNull(typeInfoArray);
    assertEquals(String[].class, typeInfoArray.getSecondLevelType());
  }

  @Test
  public void testGetTypeInfoForFieldWithClassType() throws Exception {
    Field field = SampleClass.class.getDeclaredField("arrayField");
    TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, SampleClass.class);
    assertNotNull(typeInfo);
    assertEquals(String[].class, typeInfo.getSecondLevelType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTypeInfoForArrayWithInvalidType() {
    TypeInfoFactory.getTypeInfoForArray(String.class);
  }
}
