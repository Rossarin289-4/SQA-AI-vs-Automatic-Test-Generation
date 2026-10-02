package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableList;
import junit.framework.TestCase;
import org.junit.Test;

public class UnionTypeAI169Test extends TestCase {

  @Test
  public void testGetAlternates() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    UnionType unionType = new UnionType(registry, ImmutableList.of(strType, numType));
    assertNotNull(unionType.getAlternates());
  }

  @Test
  public void testMatchesNumberContext() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    UnionType unionType = new UnionType(registry, ImmutableList.of(numType));
    assertTrue(unionType.matchesNumberContext());
  }

  @Test
  public void testIsSubtypeUnknown() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    UnionType unionType = new UnionType(registry, ImmutableList.of(strType));
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    assertTrue(unionType.isSubtype(unknownType));
  }
}
