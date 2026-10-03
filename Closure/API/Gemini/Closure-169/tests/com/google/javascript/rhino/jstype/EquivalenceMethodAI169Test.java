package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EquivalenceMethodAI169Test {

  @Test
  public void testEnumValuesExist() {
    EquivalenceMethod[] methods = EquivalenceMethod.values();
    assertNotNull(methods);
    assertEquals(3, methods.length);
  }

  @Test
  public void testValueOf() {
    assertEquals(EquivalenceMethod.IDENTITY, EquivalenceMethod.valueOf("IDENTITY"));
    assertEquals(EquivalenceMethod.DATA_FLOW, EquivalenceMethod.valueOf("DATA_FLOW"));
    assertEquals(EquivalenceMethod.INVARIANT, EquivalenceMethod.valueOf("INVARIANT"));
  }
}
