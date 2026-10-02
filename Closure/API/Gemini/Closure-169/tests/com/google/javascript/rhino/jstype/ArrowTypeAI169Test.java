package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class ArrowTypeAI169Test {

  @Test
  public void testIsSubtypeNonArrowType() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    ArrowType arrowType = new ArrowType(registry, null, null);
    JSType otherType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    assertFalse(arrowType.isSubtype(otherType));
  }

  @Test
  public void testHashCodeCalculation() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    ArrowType arrowType = new ArrowType(registry, null, null, true);
    int hash = arrowType.hashCode();
    assertTrue(hash != 0);
  }

  @Test
  public void testHasUnknownParamsOrReturnDefault() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    ArrowType arrowType = new ArrowType(registry, null, null);
    assertTrue(arrowType.hasUnknownParamsOrReturn());
  }
}
