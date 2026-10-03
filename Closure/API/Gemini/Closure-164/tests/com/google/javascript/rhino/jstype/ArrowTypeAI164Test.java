package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrowTypeAI164Test {

  @Test
  public void testIsSubtypeWithNonArrowType() {
    ArrowType arrowType = new ArrowType(null, null, null);
    assertFalse(arrowType.isSubtype(null));
  }

  @Test
  public void testHasUnknownParamsOrReturnDefaults() {
    ArrowType arrowType = new ArrowType(null, null, null);
    assertTrue(arrowType.hasUnknownParamsOrReturn());
  }

  @Test
  public void testGetPossibleToBooleanOutcomes() {
    ArrowType arrowType = new ArrowType(null, null, null);
    assertEquals(BooleanLiteralSet.TRUE, arrowType.getPossibleToBooleanOutcomes());
  }
}
