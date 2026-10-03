package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecordTypeBuilderAI165Test {

  @Test
  public void testBuildEmptyRecord() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType type = builder.build();
    assertNotNull(type);
  }

  @Test
  public void testAddPropertyDuplicate() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder firstAdd = builder.addProperty("a", null, null);
    assertNotNull(firstAdd);
    RecordTypeBuilder secondAdd = builder.addProperty("a", null, null);
    assertNull(secondAdd);
  }

  @Test
  public void testBuildNonEmptyRecord() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", null, null);
    JSType type = builder.build();
    assertNotNull(type);
  }
}
