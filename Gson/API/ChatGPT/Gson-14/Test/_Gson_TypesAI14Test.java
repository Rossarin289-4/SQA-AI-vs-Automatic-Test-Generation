package com.google.gson.internal;

import org.junit.Test;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class _Gson_TypesAI14Test {

  @Test
  public void testGetRawTypeForClass() {
    Class<?> rawType = $Gson$Types.getRawType(String.class);
    assertEquals(String.class, rawType);
  }

  @Test
  public void testArrayOf() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    assertNotNull(arrayType);
    assertEquals(String.class, $Gson$Types.getRawType(arrayType.getGenericComponentType()));
  }

  @Test
  public void testSubtypeOf() {
    WildcardType wildcardType = $Gson$Types.subtypeOf(String.class);
    assertNotNull(wildcardType);
    assertEquals(1, wildcardType.getUpperBounds().length);
    assertEquals(String.class, wildcardType.getUpperBounds()[0]);
  }
}
