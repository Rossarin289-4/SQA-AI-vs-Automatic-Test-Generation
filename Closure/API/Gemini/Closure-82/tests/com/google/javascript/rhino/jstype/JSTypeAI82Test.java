package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class JSTypeAI82Test {

  @Test
  public void testHasDisplayNameWithNull() {
    JSType type = new JSType(null) {
      @Override
      public boolean isSubtype(JSType that) {
        return false;
      }
      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }
      @Override
      JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }
    };
    assertNull(type.getDisplayName());
    assertFalse(type.hasDisplayName());
  }

  @Test
  public void testHasDisplayNameWithEmptyString() {
    JSType type = new JSType(null) {
      @Override
      public String getDisplayName() {
        return "";
      }
      @Override
      public boolean isSubtype(JSType that) {
        return false;
      }
      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }
      @Override
      JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }
    };
    assertEquals("", type.getDisplayName());
    assertFalse(type.hasDisplayName());
  }

  @Test
  public void testHasDisplayNameWithValidString() {
    JSType type = new JSType(null) {
      @Override
      public String getDisplayName() {
        return "MyType";
      }
      @Override
      public boolean isSubtype(JSType that) {
        return false;
      }
      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }
      @Override
      JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }
    };
    assertEquals("MyType", type.getDisplayName());
    assertTrue(type.hasDisplayName());
  }
}
