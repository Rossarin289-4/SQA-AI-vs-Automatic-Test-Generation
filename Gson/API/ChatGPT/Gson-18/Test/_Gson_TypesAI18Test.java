package com.google.gson.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import org.junit.Test;

public class _Gson_TypesAI18Test {

  @Test
  public void testNewParameterizedTypeWithOwner() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, java.util.List.class, String.class);
    assertNotNull(pt);
    assertEquals(java.util.List.class, pt.getRawType());
    assertEquals(1, pt.getActualTypeArguments().length);
    assertEquals(String.class, pt.getActualTypeArguments()[0]);
  }

  @Test
  public void testArrayOf() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertNotNull(gat);
    assertEquals(String.class, gat.getGenericComponentType());
  }

  @Test
  public void testSubtypeAndSupertypeOf() {
    WildcardType sub = $Gson$Types.subtypeOf(String.class);
    assertNotNull(sub);
    assertEquals(1, sub.getUpperBounds().length);
    assertEquals(String.class, sub.getUpperBounds()[0]);

    WildcardType sup = $Gson$Types.supertypeOf(String.class);
    assertNotNull(sup);
    assertEquals(1, sup.getLowerBounds().length);
    assertEquals(String.class, sup.getLowerBounds()[0]);
  }
}
