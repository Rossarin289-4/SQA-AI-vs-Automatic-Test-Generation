package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectTypeAI165Test {

  @Test
  public void testPropertyBasics() {
    ObjectType.Property prop = new ObjectType.Property("testProp", null, true, null);
    assertEquals("testProp", prop.getName());
    assertTrue(prop.isTypeInferred());
    assertNull(prop.getType());
    assertNull(prop.getNode());
    assertNull(prop.getSourceFile());
    assertEquals(prop, prop.getSymbol());
    assertNull(prop.getDeclaration());
    assertNull(prop.getJSDocInfo());
  }

  @Test
  public void testCastMethod() {
    assertNull(ObjectType.cast(null));
  }
}
