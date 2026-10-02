package com.google.gson;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class TypeInfoFactoryAI1Test {

  static class SampleClass<T> {
    T genericField;
    String stringField;
    List<T> listField;
    T[] arrayField;
  }

  static class ChildSampleClass extends SampleClass<String> {
  }

  @Test
  public void testGetTypeInfoForArray_valid() {
    Type type = String[].class;
    TypeInfoArray info = TypeInfoFactory.getTypeInfoForArray(type);
    Assert.assertNotNull(info);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTypeInfoForArray_invalid() {
    TypeInfoFactory.getTypeInfoForArray(String.class);
  }

  @Test
  public void testGetTypeInfoForField_classType() throws Exception {
    Field f = SampleClass.class.getDeclaredField("stringField");
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, SampleClass.class);
    Assert.assertNotNull(info);
    Assert.assertEquals(String.class, info.getActualType());
  }

  @Test
  public void testGetTypeInfoForField_parameterizedType() throws Exception {
    Field f = SampleClass.class.getDeclaredField("genericField");
    ParameterizedType parentType = new ParameterizedTypeImpl(SampleClass.class, new Type[] { String.class }, null);
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, parentType);
    Assert.assertNotNull(info);
    Assert.assertEquals(String.class, info.getActualType());
  }

  @Test
  public void testGetTypeInfoForField_listFieldParameterized() throws Exception {
    Field f = SampleClass.class.getDeclaredField("listField");
    ParameterizedType parentType = new ParameterizedTypeImpl(SampleClass.class, new Type[] { Integer.class }, null);
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, parentType);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.getActualType() instanceof ParameterizedType);
  }

  @Test
  public void testGetTypeInfoForField_arrayField() throws Exception {
    Field f = SampleClass.class.getDeclaredField("arrayField");
    ParameterizedType parentType = new ParameterizedTypeImpl(SampleClass.class, new Type[] { Double.class }, null);
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, parentType);
    Assert.assertNotNull(info);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetTypeInfoForField_missingTypeToken() throws Exception {
    Field f = SampleClass.class.getDeclaredField("genericField");
    TypeInfoFactory.getTypeInfoForField(f, SampleClass.class);
  }

  @Test
  public void testChildSampleClassField() throws Exception {
    Field f = SampleClass.class.getDeclaredField("genericField");
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, ChildSampleClass.class);
    Assert.assertNotNull(info);
    Assert.assertEquals(String.class, info.getActualType());
  }
}
