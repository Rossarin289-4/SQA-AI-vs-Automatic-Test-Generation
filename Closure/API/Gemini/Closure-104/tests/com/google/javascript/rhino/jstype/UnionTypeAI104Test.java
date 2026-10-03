package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;

public class UnionTypeAI104Test {

  @Test
  public void testUnionTypeCreationAndAlternates() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    Set<JSType> alternates = Sets.newHashSet(numType, strType);
    UnionType unionType = new UnionType(registry, alternates);

    assertTrue(unionType.isUnionType());
    assertEquals(alternates, unionType.getAlternates());
    assertTrue(unionType.contains(numType));
    assertTrue(unionType.contains(strType));
  }

  @Test
  public void testUnionTypeContextsAndEquality() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType boolType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

    Set<JSType> set1 = Sets.newHashSet(numType, boolType);
    Set<JSType> set2 = Sets.newHashSet(boolType, numType);

    UnionType union1 = new UnionType(registry, set1);
    UnionType union2 = new UnionType(registry, set2);

    assertTrue(union1.matchesNumberContext());
    assertTrue(union1.matchesStringContext());
    assertTrue(union1.matchesObjectContext());

    assertEquals(union1, union2);
    assertEquals(union1.hashCode(), union2.hashCode());
  }

  @Test
  public void testUnionTypeRestrictedUnion() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    Set<JSType> alternates = Sets.newHashSet(numType, strType);
    UnionType unionType = new UnionType(registry, alternates);

    JSType restricted = unionType.getRestrictedUnion(numType);
    assertFalse(((UnionType) restricted).contains(numType));
    assertTrue(((UnionType) restricted).contains(strType));
  }
}
