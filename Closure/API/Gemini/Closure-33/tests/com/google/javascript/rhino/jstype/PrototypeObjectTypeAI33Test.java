package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeObjectTypeAI33Test {

  @Test
  public void testReferenceNameHandling() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    PrototypeObjectType obj = new PrototypeObjectType(registry, "MyClass", null);
    assertTrue(obj.hasReferenceName());
    assertEquals("MyClass", obj.getReferenceName());

    PrototypeObjectType anonObj = new PrototypeObjectType(registry, null, null);
    assertFalse(anonObj.hasReferenceName());
    assertNull(anonObj.getReferenceName());
  }

  @Test
  public void testNativeObjectTypeFlag() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    PrototypeObjectType nativeObj = new PrototypeObjectType(registry, "Native", null, true);
    assertTrue(nativeObj.isNativeObjectType());

    PrototypeObjectType regularObj = new PrototypeObjectType(registry, "Regular", null, false);
    assertFalse(regularObj.isNativeObjectType());
  }

  @Test
  public void testPrettyPrintInitialState() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    PrototypeObjectType obj = new PrototypeObjectType(registry, "TestObj", null);
    assertFalse(obj.isPrettyPrint());

    obj.setPrettyPrint(true);
    assertTrue(obj.isPrettyPrint());
  }
}
