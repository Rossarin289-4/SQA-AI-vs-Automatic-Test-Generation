package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Map;
import java.util.Properties;

public class _Gson_TypesAI14Test {

  @Test
  public void testCanonicalizeClass() {
    Type canonical = $Gson$Types.canonicalize(String.class);
    Assert.assertEquals(String.class, canonical);
  }

  @Test
  public void testCanonicalizeArrayClass() {
    Type canonical = $Gson$Types.canonicalize(String[].class);
    Assert.assertTrue(canonical instanceof GenericArrayType);
    Assert.assertEquals(String.class, ((GenericArrayType) canonical).getGenericComponentType());
  }

  @Test
  public void testGetRawTypeClass() {
    Class<?> rawType = $Gson$Types.getRawType(Integer.class);
    Assert.assertEquals(Integer.class, rawType);
  }

  @Test
  public void testGetRawTypeGenericArray() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    Class<?> rawType = $Gson$Types.getRawType(arrayType);
    Assert.assertEquals(String[].class, rawType);
  }

  @Test
  public void testEqualsTypes() {
    Type t1 = $Gson$Types.arrayOf(String.class);
    Type t2 = $Gson$Types.arrayOf(String.class);
    Assert.assertTrue($Gson$Types.equals(t1, t2));
    Assert.assertTrue($Gson$Types.equals(null, null));
    Assert.assertFalse($Gson$Types.equals(String.class, null));
  }

  @Test
  public void testSubtypeOfAndSupertypeOf() {
    WildcardType sub = $Gson$Types.subtypeOf(Number.class);
    Assert.assertEquals(1, sub.getUpperBounds().length);
    Assert.assertEquals(Number.class, sub.getUpperBounds()[0]);
    Assert.assertEquals(0, sub.getLowerBounds().length);
    Assert.assertEquals("? extends java.lang.Number", sub.toString());

    WildcardType sup = $Gson$Types.supertypeOf(String.class);
    Assert.assertEquals(1, sup.getLowerBounds().length);
    Assert.assertEquals(String.class, sup.getLowerBounds()[0]);
    Assert.assertEquals("? super java.lang.String", sup.toString());
  }

  @Test
  public void testTypeToString() {
    Assert.assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    GenericArrayType arrayType = $Gson$Types.arrayOf(Integer.class);
    Assert.assertEquals("java.lang.Integer[]", $Gson$Types.typeToString(arrayType));
  }

  @Test
  public void testGetMapKeyAndValueTypesProperties() {
    Type[] keyAndVal = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    Assert.assertEquals(2, keyAndVal.length);
    Assert.assertEquals(String.class, keyAndVal[0]);
    Assert.assertEquals(String.class, keyAndVal[1]);
  }

  @Test
  public void testGetMapKeyAndValueTypesParameterizedMap() {
    ParameterizedType mapType = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    Type[] keyAndVal = $Gson$Types.getMapKeyAndValueTypes(mapType, Map.class);
    Assert.assertEquals(2, keyAndVal.length);
    Assert.assertEquals(String.class, keyAndVal[0]);
    Assert.assertEquals(Integer.class, keyAndVal[1]);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCheckNotPrimitiveThrowsOnPrimitive() {
    $Gson$Types.checkNotPrimitive(int.class);
  }

  @Test
  public void testCheckNotPrimitivePassesOnNonPrimitive() {
    $Gson$Types.checkNotPrimitive(Integer.class);
  }
}
