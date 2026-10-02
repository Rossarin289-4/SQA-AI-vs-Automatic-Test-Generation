package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

public class _Gson_TypesAI16Test {

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
    Class<?> rawType = $Gson$Types.getRawType(String.class);
    Assert.assertEquals(String.class, rawType);
  }

  @Test
  public void testGetRawTypeArray() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    Class<?> rawType = $Gson$Types.getRawType(arrayType);
    Assert.assertEquals(String[].class, rawType);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawTypeUnsupported() {
    $Gson$Types.getRawType(null);
  }

  @Test
  public void testEqualsTypes() {
    Type t1 = String.class;
    Type t2 = String.class;
    Type t3 = Integer.class;

    Assert.assertTrue($Gson$Types.equals(t1, t2));
    Assert.assertFalse($Gson$Types.equals(t1, t3));
    Assert.assertTrue($Gson$Types.equals(null, null));
    Assert.assertFalse($Gson$Types.equals(t1, null));
  }

  @Test
  public void testSubtypeOfAndSupertypeOf() {
    WildcardType sub = $Gson$Types.subtypeOf(String.class);
    Assert.assertEquals("? extends java.lang.String", sub.toString());

    WildcardType sup = $Gson$Types.supertypeOf(String.class);
    Assert.assertEquals("? super java.lang.String", sup.toString());

    WildcardType wildcardObj = $Gson$Types.subtypeOf(Object.class);
    Assert.assertEquals("?", wildcardObj.toString());
  }

  @Test
  public void testParameterizedTypeCreation() {
    ParameterizedType paramType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Assert.assertEquals(List.class, paramType.getRawType());
    Assert.assertNull(paramType.getOwnerType());
    Assert.assertEquals(1, paramType.getActualTypeArguments().length);
    Assert.assertEquals(String.class, paramType.getActualTypeArguments()[0]);
    Assert.assertEquals("java.util.List<java.lang.String>", paramType.toString());
  }

  @Test
  public void testHashCodeOrZero() {
    Assert.assertEquals(0, $Gson$Types.hashCodeOrZero(null));
    Assert.assertEquals(String.class.hashCode(), $Gson$Types.hashCodeOrZero(String.class));
  }

  @Test
  public void testTypeToString() {
    Assert.assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    GenericArrayType arrayType = $Gson$Types.arrayOf(Integer.class);
    Assert.assertEquals("java.lang.Integer[]", $Gson$Types.typeToString(arrayType));
  }
}
