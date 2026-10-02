package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicate;
import org.junit.Test;

public class JSTypeAI167Test {

  @Test
  public void testHasDisplayNameWithNullAndEmpty() {
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
  public void testDiffersFromWithUnknowns() {
    JSType unknownType = new JSType(null) {
      @Override
      public boolean isUnknownType() {
        return true;
      }

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
        return "unknown";
      }
    };

    JSType normalType = new JSType(null) {
      @Override
      public boolean isUnknownType() {
        return false;
      }

      @Override
      public boolean isEquivalentTo(JSType that) {
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

      @Override
      String toStringHelper(boolean forAnnotations) {
        return "normal";
      }
    };

    assertTrue(unknownType.differsFrom(normalType));
    assertTrue(normalType.differsFrom(unknownType));
  }

  @Test
  public void testSetValidator() {
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

    Predicate<JSType> trueValidator = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return true;
      }
    };

    Predicate<JSType> falseValidator = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return false;
      }
    };

    assertTrue(type.setValidator(trueValidator));
    assertFalse(type.setValidator(falseValidator));
  }
}
