package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class JSTypeAI169Test {

  @Test
  public void testHasDisplayNameWithNull() {
    JSType type = new JSType(null) {
      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }

      @Override
      JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }

      @Override
      String toStringHelper(boolean forAnnotations) {
        return "";
      }
    };

    assertFalse(type.hasDisplayName());
  }

  @Test
  public void testIsEmptyTypeDefault() {
    JSType type = new JSType(null) {
      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }

      @Override
      JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }

      @Override
      String toStringHelper(boolean forAnnotations) {
        return "";
      }
    };

    assertFalse(type.isEmptyType());
  }

  @Test
  public void testHasPropertyDefault() {
    JSType type = new JSType(null) {
      @Override
      public <T> T visit(Visitor<T> visitor) {
        return null;
      }

      @Override
      JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, StaticScope<JSType> scope) {
        return this;
      }

      @Override
      String toStringHelper(boolean forAnnotations) {
        return "";
      }
    };

    assertFalse(type.hasProperty("anyProperty"));
  }
}
