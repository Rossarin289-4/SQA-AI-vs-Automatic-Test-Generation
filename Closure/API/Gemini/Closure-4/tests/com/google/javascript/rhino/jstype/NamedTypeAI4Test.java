package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Test;
import static org.junit.Assert.*;

public class NamedTypeAI4Test {

  @Test
  public void testGetReferenceName() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    NamedType namedType = new NamedType(registry, "my.TestType", "testSource", 10, 5);
    assertEquals("my.TestType", namedType.getReferenceName());
    assertTrue(namedType.hasReferenceName());
    assertTrue(namedType.isNamedType());
    assertTrue(namedType.isNominalType());
  }

  @Test
  public void testHashCode() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    NamedType namedType1 = new NamedType(registry, "Foo", "", 0, 0);
    NamedType namedType2 = new NamedType(registry, "Foo", "", 0, 0);
    assertEquals(namedType1.hashCode(), namedType2.hashCode());
  }

  @Test
  public void testToStringHelper() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    NamedType namedType = new NamedType(registry, "Bar", "file.js", 1, 1);
    assertEquals("Bar", namedType.toStringHelper(false));
  }
}
