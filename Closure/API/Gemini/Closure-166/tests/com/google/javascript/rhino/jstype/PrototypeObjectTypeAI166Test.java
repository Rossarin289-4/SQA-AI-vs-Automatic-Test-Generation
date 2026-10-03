package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeObjectTypeAI166Test {

  @Test
  public void testReferenceNameWithoutClassNameOrOwner() {
    PrototypeObjectType type = new PrototypeObjectType(null, null, null, true);
    assertFalse(type.hasReferenceName());
    assertNull(type.getReferenceName());
  }

  @Test
  public void testReferenceNameWithClassName() {
    PrototypeObjectType type = new PrototypeObjectType(null, "MyClass", null, true);
    assertTrue(type.hasReferenceName());
    assertEquals("MyClass", type.getReferenceName());
  }

  @Test
  public void testNativeObjectTypeFlag() {
    PrototypeObjectType nativeObj = new PrototypeObjectType(null, "Native", null, true);
    assertTrue(nativeObj.isNativeObjectType());

    PrototypeObjectType nonNativeObj = new PrototypeObjectType(null, "NonNative", null, false);
    assertFalse(nonNativeObj.isNativeObjectType());
  }
}
