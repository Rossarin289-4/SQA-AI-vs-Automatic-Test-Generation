package com.google.gson.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import org.junit.Test;

public class _Gson_TypesAI16Test {

  @Test
  public void testArrayOf() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    assertNotNull(arrayType);
    assertEquals(String.class, arrayType.getGenericComponentType());
  }

  @Test
  public void testSubtypeOf() {
    WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
    assertNotNull(wildcard);
    assertEquals(1, wildcard.getUpperBounds().length);
    assertEquals(Number.class, wildcard.getUpperBounds()[0]);
  }

  @Test
  public void testSupertypeOf() {
    WildcardType wildcard = $Gson$Types.supertypeOf(String.class);
    assertNotNull(wildcard);
    assertEquals(1, wildcard.getLowerBounds().length);
    assertEquals(String.class, wildcard.getLowerBounds()[0]);
  }
}
