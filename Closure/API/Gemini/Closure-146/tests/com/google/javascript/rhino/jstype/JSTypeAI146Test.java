package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class JSTypeAI146Test {

  @Test
  public void testIsEmptyTypeDefaults() {
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
    assertFalse(type.isEmptyType());
    assertFalse(type.isNoType());
    assertFalse(type.isNoObjectType());
  }

  @Test
  public void testDiffersFromWithoutUnknowns() {
    JSType typeA = new JSType(null) {
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
    JSType typeB = new JSType(null) {
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
    assertFalse(typeA.isUnknownType());
    assertFalse(typeB.isUnknownType());
    assertTrue(typeA.differsFrom(typeB));
  }

  @Test
  public void testTypePairCreation() {
    JSType typeA = new JSType(null) {
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
    JSType.TypePair pair = new JSType.TypePair(typeA, null);
    assertSame(typeA, pair.typeA);
    assertNull(pair.typeB);
  }
}
